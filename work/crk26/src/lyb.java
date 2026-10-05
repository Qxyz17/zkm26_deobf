package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Set;

public abstract class lyb extends ly6 implements h {
   private static final long d = prr.a(4805538133306519892L, 3018759310020755265L, MethodHandles.lookup().lookupClass()).a(53073903512314L);

   public lyb(long var1, int var3) {
      var1 = d ^ var1;
      long var4 = (var1 ^ 615238659539L) >>> 16;
      int var6 = (int)((var1 ^ 615238659539L) << 48 >>> 48);
      super(var4, (char)var6, var3);
   }

   public boolean q(short param1, Set param2, int param3, int param4) {
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
      // 05: iload 3
      // 06: i2l
      // 07: bipush 32
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: lstore 5
      // 1a: lload 5
      // 1c: dup2
      // 1d: ldc2_w 0
      // 20: lxor
      // 21: dup2
      // 22: bipush 48
      // 24: lushr
      // 25: l2i
      // 26: istore 7
      // 28: dup2
      // 29: bipush 16
      // 2b: lshl
      // 2c: bipush 32
      // 2e: lushr
      // 2f: l2i
      // 30: istore 8
      // 32: dup2
      // 33: bipush 48
      // 35: lshl
      // 36: bipush 48
      // 38: lushr
      // 39: l2i
      // 3a: istore 9
      // 3c: pop2
      // 3d: pop2
      // 3e: aload 0
      // 3f: getfield com/zelix/lyb.r [Lcom/zelix/lmu;
      // 42: arraylength
      // 43: istore 11
      // 45: ldc2_w 6776100058742951217
      // 48: lload 5
      // 4a: invokedynamic o (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: bipush 0
      // 50: istore 12
      // 52: istore 10
      // 54: iload 12
      // 56: iload 11
      // 58: if_icmpge b8
      // 5b: aload 0
      // 5c: getfield com/zelix/lyb.r [Lcom/zelix/lmu;
      // 5f: iload 12
      // 61: aaload
      // 62: checkcast com/zelix/h
      // 65: astore 13
      // 67: iload 10
      // 69: iload 3
      // 6a: ifle b5
      // 6d: ifne b3
      // 70: aload 13
      // 72: iload 7
      // 74: i2s
      // 75: aload 2
      // 76: iload 8
      // 78: iload 9
      // 7a: invokeinterface com/zelix/h.q (SLjava/util/Set;II)Z 5
      // 7f: iload 10
      // 81: ifne b9
      // 84: goto 92
      // 87: ldc2_w 6365328273127446547
      // 8a: lload 5
      // 8c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: ifne b0
      // 95: goto a3
      // 98: ldc2_w 6365328273127446547
      // 9b: lload 5
      // 9d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: athrow
      // a3: bipush 0
      // a4: ireturn
      // a5: ldc2_w 6365328273127446547
      // a8: lload 5
      // aa: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: athrow
      // b0: iinc 12 1
      // b3: iload 10
      // b5: ifeq 54
      // b8: bipush 1
      // b9: ireturn
   }

   private static n9 c(n9 var0) {
      return var0;
   }
}
