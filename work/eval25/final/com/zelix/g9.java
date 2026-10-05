package com.zelix;

import java.lang.invoke.MethodHandles;

public class g9 extends zw {
   private static final long b = ess.a(7254750993819362816L, -8151955983867121298L, MethodHandles.lookup().lookupClass()).a(144530967517634L);

   public void t(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/_za
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 4
      // 1b: pop
      // 1c: lload 2
      // 1d: dup2
      // 1e: ldc2_w 134528422017690
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: ldc2_w 9148277501292601163
      // 28: lload 2
      // 29: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: aload 0
      // 2f: lload 6
      // 31: bipush 1
      // 32: anewarray 4
      // 35: dup_x2
      // 36: dup_x2
      // 37: pop
      // 38: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b: bipush 0
      // 3c: swap
      // 3d: aastore
      // 3e: ldc2_w 7145691849331111744
      // 41: lload 2
      // 42: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: istore 9
      // 49: astore 8
      // 4b: iload 9
      // 4d: bipush 1
      // 4e: if_icmpne 99
      // 51: aload 0
      // 52: bipush 0
      // 53: invokevirtual com/zelix/g9.e (I)Lcom/zelix/_za;
      // 56: astore 10
      // 58: aload 10
      // 5a: aload 8
      // 5c: ifnonnull 81
      // 5f: instanceof com/zelix/g7
      // 62: ifeq 99
      // 65: goto 72
      // 68: ldc2_w 7178587157143981546
      // 6b: lload 2
      // 6c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 10
      // 74: goto 81
      // 77: ldc2_w 7178587157143981546
      // 7a: lload 2
      // 7b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: checkcast com/zelix/g7
      // 84: astore 11
      // 86: aload 0
      // 87: aload 11
      // 89: bipush 0
      // 8a: anewarray 4
      // 8d: ldc2_w 7328816409459435145
      // 90: lload 2
      // 91: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: putfield com/zelix/g9.a Ljava/lang/String;
      // 99: return
   }

   public g9(int var1, int var2, short var3, char var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var7 = var5 ^ 2245133115743L;
      super(var1, var7);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
