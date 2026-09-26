import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.lang.reflect.Method;

public class StringDumper {
    public static void main(String[] args) throws Exception {
        String srcDir = args[0];
        String outDir = args[1];
        // 遍历所有 java 文件
        List<Path> files = new ArrayList<>();
        Files.walk(Paths.get(srcDir)).filter(p -> p.toString().endsWith(".java")).forEach(files::add);
        System.out.println("java 文件数: " + files.size());

        // 正则: 匹配 "类名.b("可选tag", n, seedL)" 或 "类名.b(n, seedL)" 形式
        // 简化: 匹配所有 .b(数字, 数字L) 和 .b("x", 数字, 数字L)
        // 但我们真正要做的是: 对每个类, 找到它的 .b(int,long) 方法并反射调用
        int totalCalls = 0, dumped = 0;
        for (Path p : files) {
            String src = new String(Files.readAllBytes(p), "UTF-8");
            // 提取类名
            Matcher cm = Pattern.compile("(?:class|interface)\\s+(\\w+)").matcher(src);
            if (!cm.find()) continue;
            String cls = cm.group(1);
            // 找 .b( 调用
            Matcher bm = Pattern.compile("\\b" + Pattern.quote(cls) + "\\.b\\(([^;]+?)\\)").matcher(src);
            List<String> calls = new ArrayList<>();
            while (bm.find()) calls.add(bm.group(1));
            if (calls.isEmpty()) continue;
            totalCalls += calls.size();
            // 这里只统计, 实际解密需要反射调该类.b —— 复杂, 先报告
            if (dumped < 10) System.out.println(cls + " : " + calls.size() + " 个 .b() 调用");
            dumped++;
        }
        System.out.println("含 .b() 的类: " + dumped + ", 总调用: " + totalCalls);
    }
}
