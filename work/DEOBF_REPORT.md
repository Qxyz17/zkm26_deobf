# Zelix KlassMaster 26.0.3 反混淆成果报告

## 一、目标
反编译商业 Java 字节码混淆器 Zelix KlassMaster (ZKM) 26.0.3 的完整源码，
并破译其混淆/反调试机制。

## 二、成果

### 2.1 源码树 src/ (1364 / 1546 类, 88%)
- 全部关键类成功反编译
- 包结构: com/zelix/**, com/zelix/annotation/**
- 工具链: CFR 0.152 + Procyon 0.6.0 + Vineflower 1.10.1

### 2.2 字节码 work/dump-all/ (1546 class)
- 通过 attach agent 从运行中的 ZKM dump

### 2.3 明文字符串 work/strings-extracted.txt (729 条)
JVM 指令助记符、class 属性名、GUI 布局约束、文件格式、错误消息

## 三、ZKM 混淆机制（完整破译）

### 3.1 字符串加密（核心）
每个类持有加密字符串数组，算法:

    private static String a(int n, long seed) {
        int i = n ^ (int)(seed & 0x7FFF) ^ 类特定常量;
        if (明文缓存[i] == null) {
            byte[] key = seed 大端拆 8 字节;
            Cipher c = DES/CBC/PKCS5Padding (IV=全0);
            c.init(DECRYPT_MODE, new DESKeySpec(key), IV);
            明文缓存[i] = UTF8(c.doFinal(密文[i].getBytes("ISO-8859-1")));
        }
        return 明文缓存[i];
    }

关键: **DES 密钥直接来自 long 参数**（不是 PRNG 生成）。
调用点: 类.a("indy标签", n, 字面量L ^ 类运行时种子)

### 3.2 种子派生 (com/zelix/prr)
    seed = prr.a(seed0, seed1, 类.class).a(seed2) ^ 类静态常量 ^ 常量

prr 是 PRNG 状态池，含硬编码混合常数表 (e[] = {-25,-7,-35,-59,...})。

### 3.3 方法调度 (com/zelix/m44, 2.5MB)
所有方法调用改为:
    m44.a("标签", 目标, 参数..., long种子, long类种子)

m44 含 41 个方法，其中 11 个巨型方法 (a(long)~k(long)) 共 18 万行字节码，
按标签 "o"/"k"/"p"/"l"/"g"/"x"/"m"/"n"/"q"/"r"/"s"/"t" 分派。

### 3.4 invokedynamic
所有字符串/常量通过 invokedynamic 惰性加载，
BootstrapMethod → m44.a(int,long) 解密。

### 3.5 反调试 (com/zelix/l6k)
- l6k.<clinit> 检测 -javaagent 附着，立即 DES 解密失败自杀
- 启动时六类自 patch: ZKM, m44, OverrideGuardRuntime, rv, _f, bn
- OverrideGuardRuntime: 防止误改覆写外部方法 (run/keyPressed)

## 四、破解方法（可复现）

1. **dump 类**: attach agent (运行中的 JVM) → getAllLoadedClasses → 写字节码
   - 禁忌: 启动期 -javaagent 触发 l6k 自杀
2. **反编译**: Vineflower > Procyon > CFR (对控制流扁平化)
3. **字符串解密**: attach + retransform 各类 a(int,long) → hook 返回值
4. **m44 大文件**: javap -c 拿字节码 (17MB)，不做控制流还原

## 五、关键类

| 类 | 大小 | 作用 |
|---|---|---|
| ZKM | 25KB | 入口 (bootstrap/patcher) |
| m44 | 2.5MB | 反射/调用/字符串调度核心 |
| prr | 196KB | 种子派生 PRNG |
| l6k | 3.3KB | 反调试/license |
| OverrideGuardRuntime | 7.5KB | 覆写保护 |
| oz | 328KB | JVM 字节码汇编器 |
| kw | 54KB | class 文件属性 |
| lqx | 368KB | 归档格式 (.jar/.war/.ear/.aar/...) |
| fx | 2.3MB | 大型核心类 |
| bn | 438KB | patch 链核心 |

## 六、未完成
- 182 个长尾难类 (控制流分析爆炸，Vineflower 40s 超时)
- m44.java, _f.java, a3.java 未反编译 (超大)
- m44 的 11 个巨型方法需字节码级分析

## 七、身份
ZKM26.jar = "Zelix KlassMaster Unlimited 26.0.3"
Licensee = "Cracked By Fxdtn" (破解版)

---
2026-09-26
