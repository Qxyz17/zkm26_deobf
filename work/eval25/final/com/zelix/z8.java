package com.zelix;

import java.lang.invoke.MethodHandles;

public class z8 extends jf {
   private static final long a = ess.a(6499735891757484042L, -5491684134149848581L, MethodHandles.lookup().lookupClass()).a(26595515652340L);

   public z8(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 38577523424704L;
      super(var4, var3);
   }

   public void t(Object[] param1) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/_za
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_ur
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 55764714858332
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 134528422017690
      // 027: lxor
      // 028: lstore 8
      // 02a: pop2
      // 02b: aload 5
      // 02d: checkcast com/zelix/za
      // 030: astore 11
      // 032: ldc2_w 9148277501292601163
      // 035: lload 3
      // 036: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: aload 0
      // 03c: lload 8
      // 03e: bipush 1
      // 03f: anewarray 40
      // 042: dup_x2
      // 043: dup_x2
      // 044: pop
      // 045: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 048: bipush 0
      // 049: swap
      // 04a: aastore
      // 04b: ldc2_w 7145691849331111744
      // 04e: lload 3
      // 04f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: istore 12
      // 056: astore 10
      // 058: new java/lang/StringBuffer
      // 05b: dup
      // 05c: invokespecial java/lang/StringBuffer.<init> ()V
      // 05f: astore 13
      // 061: bipush 0
      // 062: istore 14
      // 064: iload 14
      // 066: iload 12
      // 068: if_icmpge 0dd
      // 06b: aload 13
      // 06d: aload 0
      // 06e: iload 14
      // 070: invokevirtual com/zelix/z8.e (I)Lcom/zelix/_za;
      // 073: checkcast com/zelix/zw
      // 076: bipush 0
      // 077: anewarray 40
      // 07a: ldc2_w 7328816409459435145
      // 07d: lload 3
      // 07e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 086: pop
      // 087: aload 10
      // 089: lload 3
      // 08a: lconst_0
      // 08b: lcmp
      // 08c: iflt 094
      // 08f: ifnonnull 109
      // 092: aload 10
      // 094: lload 3
      // 095: lconst_0
      // 096: lcmp
      // 097: ifle 0da
      // 09a: ifnonnull 0d8
      // 09d: goto 0aa
      // 0a0: ldc2_w 9059570623513175348
      // 0a3: lload 3
      // 0a4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: iload 14
      // 0ac: iload 12
      // 0ae: bipush 1
      // 0af: isub
      // 0b0: if_icmpge 0d5
      // 0b3: goto 0c0
      // 0b6: ldc2_w 9059570623513175348
      // 0b9: lload 3
      // 0ba: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 13
      // 0c2: ldc "/"
      // 0c4: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0c7: pop
      // 0c8: goto 0d5
      // 0cb: ldc2_w 9059570623513175348
      // 0ce: lload 3
      // 0cf: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: iinc 14 1
      // 0d8: aload 10
      // 0da: ifnull 064
      // 0dd: aload 11
      // 0df: aload 13
      // 0e1: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 0e4: lload 6
      // 0e6: dup2_x1
      // 0e7: pop2
      // 0e8: bipush 2
      // 0e9: anewarray 40
      // 0ec: dup_x1
      // 0ed: swap
      // 0ee: bipush 1
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x2
      // 0f2: dup_x2
      // 0f3: pop
      // 0f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f7: bipush 0
      // 0f8: swap
      // 0f9: aastore
      // 0fa: ldc2_w 8938752280703298609
      // 0fd: lload 3
      // 0fe: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: lload 3
      // 104: lconst_0
      // 105: lcmp
      // 106: ifle 087
      // 109: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
