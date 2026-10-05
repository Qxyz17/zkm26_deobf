package com.zelix;

import java.lang.invoke.MethodHandles;

public class c7 extends jf {
   private static final long a = ess.a(-6775796840834792663L, 2384438171730215035L, MethodHandles.lookup().lookupClass()).a(15015728965811L);

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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/_za
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 3
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: ldc2_w 9148277501292601163
      // 28: lload 4
      // 2a: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 0
      // 30: bipush 0
      // 31: invokevirtual com/zelix/c7.e (I)Lcom/zelix/_za;
      // 34: astore 9
      // 36: astore 8
      // 38: aload 9
      // 3a: lload 6
      // 3c: aload 0
      // 3d: aload 3
      // 3e: bipush 3
      // 3f: anewarray 28
      // 42: dup_x1
      // 43: swap
      // 44: bipush 2
      // 45: swap
      // 46: aastore
      // 47: dup_x1
      // 48: swap
      // 49: bipush 1
      // 4a: swap
      // 4b: aastore
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 0
      // 53: swap
      // 54: aastore
      // 55: ldc2_w 8818198965911889370
      // 58: lload 4
      // 5a: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: aload 0
      // 60: ldc2_w 9125528338416075833
      // 63: lload 4
      // 65: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_za; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: aload 8
      // 6c: ifnonnull 92
      // 6f: instanceof com/zelix/za
      // 72: ifeq ad
      // 75: goto 83
      // 78: ldc2_w 8994934548033280383
      // 7b: lload 4
      // 7d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: aload 2
      // 84: goto 92
      // 87: ldc2_w 8994934548033280383
      // 8a: lload 4
      // 8c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: checkcast com/zelix/za
      // 95: aload 9
      // 97: checkcast com/zelix/ff
      // 9a: bipush 1
      // 9b: anewarray 28
      // 9e: dup_x1
      // 9f: swap
      // a0: bipush 0
      // a1: swap
      // a2: aastore
      // a3: ldc2_w 7397873428216255522
      // a6: lload 4
      // a8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: return
   }

   public c7(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 23847839804817L;
      super(var4, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
