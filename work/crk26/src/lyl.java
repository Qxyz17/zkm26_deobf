package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class lyl extends ly6 implements dd {
   private static final long d = prr.a(7891919380379790556L, -5327604794422222326L, MethodHandles.lookup().lookupClass()).a(99457602302766L);

   public boolean i(char param1, int param2, short param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: lstore 5
      // 19: lload 5
      // 1b: dup2
      // 1c: ldc2_w 0
      // 1f: lxor
      // 20: dup2
      // 21: bipush 48
      // 23: lushr
      // 24: l2i
      // 25: istore 7
      // 27: dup2
      // 28: bipush 16
      // 2a: lshl
      // 2b: bipush 32
      // 2d: lushr
      // 2e: l2i
      // 2f: istore 8
      // 31: dup2
      // 32: bipush 48
      // 34: lshl
      // 35: bipush 48
      // 37: lushr
      // 38: l2i
      // 39: istore 9
      // 3b: pop2
      // 3c: pop2
      // 3d: ldc2_w 4736006086195462527
      // 40: lload 5
      // 42: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: aload 0
      // 48: getfield com/zelix/lyl.r [Lcom/zelix/lmu;
      // 4b: arraylength
      // 4c: istore 11
      // 4e: bipush 0
      // 4f: istore 12
      // 51: istore 10
      // 53: iload 12
      // 55: iload 11
      // 57: if_icmpge b9
      // 5a: aload 0
      // 5b: getfield com/zelix/lyl.r [Lcom/zelix/lmu;
      // 5e: iload 12
      // 60: aaload
      // 61: checkcast com/zelix/dd
      // 64: astore 13
      // 66: iload 10
      // 68: iload 3
      // 69: ifle b6
      // 6c: ifeq b4
      // 6f: aload 13
      // 71: iload 7
      // 73: i2c
      // 74: iload 8
      // 76: iload 9
      // 78: i2s
      // 79: aload 4
      // 7b: invokeinterface com/zelix/dd.i (CISLjava/lang/String;)Z 5
      // 80: iload 10
      // 82: ifeq ba
      // 85: goto 93
      // 88: ldc2_w 6432484536064637845
      // 8b: lload 5
      // 8d: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: ifne b1
      // 96: goto a4
      // 99: ldc2_w 6432484536064637845
      // 9c: lload 5
      // 9e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: bipush 0
      // a5: ireturn
      // a6: ldc2_w 6432484536064637845
      // a9: lload 5
      // ab: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: iinc 12 1
      // b4: iload 10
      // b6: ifne 53
      // b9: bipush 1
      // ba: ireturn
   }

   public lyl(long var1, int var3) {
      var1 = d ^ var1;
      long var4 = (var1 ^ 100185207039405L) >>> 16;
      int var6 = (int)((var1 ^ 100185207039405L) << 48 >>> 48);
      super(var4, (char)var6, var3);
   }

   private static n9 c(n9 var0) {
      return var0;
   }
}
