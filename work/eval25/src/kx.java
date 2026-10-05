package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class kx extends kd {
   private static final long a = ess.a(-8261432351233672854L, 8593716458256588562L, MethodHandles.lookup().lookupClass()).a(245672601501893L);

   public kx(int var1, int var2, byte var3, int var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ a;
      long var7 = var5 ^ 67330053720157L;
      super(var1, var7);
   }

   public void y(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/_ur
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 3
      // 01d: pop
      // 01e: lload 3
      // 01f: dup2
      // 020: ldc2_w 16485003189868
      // 023: lxor
      // 024: lstore 6
      // 026: dup2
      // 027: ldc2_w 74933884137676
      // 02a: lxor
      // 02b: lstore 8
      // 02d: pop2
      // 02e: aconst_null
      // 02f: astore 11
      // 031: ldc2_w -3586710506889154681
      // 034: lload 3
      // 035: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: bipush 0
      // 03b: istore 12
      // 03d: astore 10
      // 03f: iload 12
      // 041: iload 5
      // 043: if_icmpge 116
      // 046: aload 0
      // 047: iload 12
      // 049: invokevirtual com/zelix/kx.e (I)Lcom/zelix/_za;
      // 04c: astore 13
      // 04e: aload 13
      // 050: aload 10
      // 052: ifnonnull 089
      // 055: instanceof com/zelix/c_
      // 058: ifeq 07a
      // 05b: goto 068
      // 05e: ldc2_w -3224551620360823440
      // 061: lload 3
      // 062: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 13
      // 06a: checkcast com/zelix/c_
      // 06d: astore 11
      // 06f: aload 10
      // 071: lload 3
      // 072: lconst_0
      // 073: lcmp
      // 074: iflt 113
      // 077: ifnull 0e8
      // 07a: aload 13
      // 07c: goto 089
      // 07f: ldc2_w -3224551620360823440
      // 082: lload 3
      // 083: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: checkcast com/zelix/za
      // 08c: astore 14
      // 08e: aload 10
      // 090: ifnonnull 0d3
      // 093: aload 11
      // 095: ifnull 0d6
      // 098: goto 0a5
      // 09b: ldc2_w -3224551620360823440
      // 09e: lload 3
      // 09f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 14
      // 0a7: lload 6
      // 0a9: aload 11
      // 0ab: bipush 2
      // 0ac: anewarray 62
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: bipush 1
      // 0b2: swap
      // 0b3: aastore
      // 0b4: dup_x2
      // 0b5: dup_x2
      // 0b6: pop
      // 0b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ba: bipush 0
      // 0bb: swap
      // 0bc: aastore
      // 0bd: ldc2_w -3813047202022395464
      // 0c0: lload 3
      // 0c1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: goto 0d3
      // 0c9: ldc2_w -3224551620360823440
      // 0cc: lload 3
      // 0cd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aconst_null
      // 0d4: astore 11
      // 0d6: aload 0
      // 0d7: ldc2_w -3874929832984395254
      // 0da: lload 3
      // 0db: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: aload 14
      // 0e2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e7: pop
      // 0e8: aload 13
      // 0ea: lload 8
      // 0ec: aload 0
      // 0ed: aload 2
      // 0ee: bipush 3
      // 0ef: anewarray 62
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: bipush 2
      // 0f5: swap
      // 0f6: aastore
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: bipush 1
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x2
      // 0fd: dup_x2
      // 0fe: pop
      // 0ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 102: bipush 0
      // 103: swap
      // 104: aastore
      // 105: ldc2_w -3842470861937404650
      // 108: lload 3
      // 109: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: iinc 12 1
      // 111: aload 10
      // 113: ifnull 03f
      // 116: return
   }

   private static gj b(gj var0) {
      return var0;
   }
}
