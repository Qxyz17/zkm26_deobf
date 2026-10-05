package com.zelix;

import java.lang.invoke.MethodHandles;

public class fl extends f5 implements rh {
   private static final long c = ess.a(9013791178356444522L, -2210963236900999944L, MethodHandles.lookup().lookupClass()).a(231950286493L);

   public fl(int var1, long var2) {
      var2 = c ^ var2;
      long var10001 = var2 ^ 69801776456787L;
      int var4 = (int)((var2 ^ 69801776456787L) >>> 48);
      int var5 = (int)((var2 ^ 69801776456787L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      super((short)var4, (short)var5, var1, var6);
   }

   public boolean H(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/hz
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/we
      // 19: astore 2
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: bipush 0
      // 26: istore 9
      // 28: ldc2_w 811819383434717946
      // 2b: lload 4
      // 2d: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: aload 0
      // 33: getfield com/zelix/fl.O [Lcom/zelix/_za;
      // 36: arraylength
      // 37: istore 10
      // 39: bipush 0
      // 3a: istore 11
      // 3c: astore 8
      // 3e: iload 11
      // 40: iload 10
      // 42: if_icmpge cd
      // 45: aload 0
      // 46: getfield com/zelix/fl.O [Lcom/zelix/_za;
      // 49: iload 11
      // 4b: aaload
      // 4c: checkcast com/zelix/rh
      // 4f: astore 12
      // 51: aload 8
      // 53: lload 4
      // 55: lconst_0
      // 56: lcmp
      // 57: ifle ca
      // 5a: ifnonnull c8
      // 5d: aload 12
      // 5f: lload 6
      // 61: aload 3
      // 62: aload 2
      // 63: bipush 3
      // 64: anewarray 36
      // 67: dup_x1
      // 68: swap
      // 69: bipush 2
      // 6a: swap
      // 6b: aastore
      // 6c: dup_x1
      // 6d: swap
      // 6e: bipush 1
      // 6f: swap
      // 70: aastore
      // 71: dup_x2
      // 72: dup_x2
      // 73: pop
      // 74: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 77: bipush 0
      // 78: swap
      // 79: aastore
      // 7a: ldc2_w 1452899722489641893
      // 7d: lload 4
      // 7f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: aload 8
      // 86: ifnonnull e2
      // 89: goto 97
      // 8c: ldc2_w 1134551172339039845
      // 8f: lload 4
      // 91: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: ifeq b7
      // 9a: goto a8
      // 9d: ldc2_w 1134551172339039845
      // a0: lload 4
      // a2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: athrow
      // a8: bipush 1
      // a9: lload 4
      // ab: lconst_0
      // ac: lcmp
      // ad: iflt df
      // b0: istore 9
      // b2: aload 8
      // b4: ifnull cd
      // b7: iinc 11 1
      // ba: goto c8
      // bd: ldc2_w 1134551172339039845
      // c0: lload 4
      // c2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 8
      // ca: ifnull 3e
      // cd: aload 0
      // ce: ldc2_w 1294933628161506057
      // d1: lload 4
      // d3: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d8: lload 4
      // da: lconst_0
      // db: lcmp
      // dc: iflt e2
      // df: iload 9
      // e1: ixor
      // e2: ireturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
