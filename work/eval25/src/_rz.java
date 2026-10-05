package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _rz extends _r8 {
   private String L;
   private final int F;
   private char[] t;
   private int u;
   private final int G;
   private ArrayList r;
   private static final long a = ess.a(6985895667435337891L, -5151302384699321977L, MethodHandles.lookup().lookupClass()).a(4278769948335L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   final char s(Object[] param1) {
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
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/_rz.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: ldc2_w -398146598595565983
      // 01f: lload 3
      // 020: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: astore 5
      // 027: aload 0
      // 028: ldc2_w -46985091366123367
      // 02b: lload 3
      // 02c: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: aload 5
      // 033: ifnonnull 112
      // 036: ifne 104
      // 039: goto 046
      // 03c: ldc2_w -221861761692119589
      // 03f: lload 3
      // 040: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: iload 2
      // 047: sipush 23125
      // 04a: ldc2_w 3870257153099599313
      // 04d: lload 3
      // 04e: lxor
      // 04f: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 5
      // 056: lload 3
      // 057: lconst_0
      // 058: lcmp
      // 059: ifle 0b6
      // 05c: ifnonnull 0b4
      // 05f: goto 06c
      // 062: ldc2_w -221861761692119589
      // 065: lload 3
      // 066: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: athrow
      // 06c: if_icmpgt 099
      // 06f: goto 07c
      // 072: ldc2_w -221861761692119589
      // 075: lload 3
      // 076: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: sipush 5015
      // 07f: ldc2_w 6221705055897437215
      // 082: lload 3
      // 083: lxor
      // 084: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: iload 2
      // 08a: iadd
      // 08b: i2c
      // 08c: lload 3
      // 08d: lconst_0
      // 08e: lcmp
      // 08f: ifle 09a
      // 092: istore 6
      // 094: aload 5
      // 096: ifnull 176
      // 099: iload 2
      // 09a: sipush 23528
      // 09d: ldc2_w 2339954826002107501
      // 0a0: lload 3
      // 0a1: lxor
      // 0a2: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: goto 0b4
      // 0aa: ldc2_w -221861761692119589
      // 0ad: lload 3
      // 0ae: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 5
      // 0b6: ifnonnull 0f5
      // 0b9: if_icmpgt 0e6
      // 0bc: goto 0c9
      // 0bf: ldc2_w -221861761692119589
      // 0c2: lload 3
      // 0c3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: sipush 24630
      // 0cc: ldc2_w 133207333118523320
      // 0cf: lload 3
      // 0d0: lxor
      // 0d1: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: iload 2
      // 0d7: iadd
      // 0d8: i2c
      // 0d9: lload 3
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: iflt 0e7
      // 0df: istore 6
      // 0e1: aload 5
      // 0e3: ifnull 176
      // 0e6: iload 2
      // 0e7: bipush 4
      // 0e8: goto 0f5
      // 0eb: ldc2_w -221861761692119589
      // 0ee: lload 3
      // 0ef: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: isub
      // 0f6: i2c
      // 0f7: lload 3
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: ifle 105
      // 0fd: istore 6
      // 0ff: aload 5
      // 101: ifnull 176
      // 104: iload 2
      // 105: goto 112
      // 108: ldc2_w -221861761692119589
      // 10b: lload 3
      // 10c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: lload 3
      // 113: lconst_0
      // 114: lcmp
      // 115: iflt 174
      // 118: sipush 12614
      // 11b: ldc2_w 723798053075314369
      // 11e: lload 3
      // 11f: lxor
      // 120: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: aload 5
      // 127: ifnonnull 172
      // 12a: if_icmpgt 157
      // 12d: goto 13a
      // 130: ldc2_w -221861761692119589
      // 133: lload 3
      // 134: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: sipush 17188
      // 13d: ldc2_w 5137076451724498094
      // 140: lload 3
      // 141: lxor
      // 142: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: iload 2
      // 148: iadd
      // 149: i2c
      // 14a: lload 3
      // 14b: lconst_0
      // 14c: lcmp
      // 14d: ifle 164
      // 150: istore 6
      // 152: aload 5
      // 154: ifnull 176
      // 157: sipush 29081
      // 15a: ldc2_w 7922865026892375574
      // 15d: lload 3
      // 15e: lxor
      // 15f: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: iload 2
      // 165: goto 172
      // 168: ldc2_w -221861761692119589
      // 16b: lload 3
      // 16c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: iadd
      // 173: i2c
      // 174: istore 6
      // 176: iload 6
      // 178: ireturn
   }

   public final String Q(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 2
      // 015: pop
      // 016: getstatic com/zelix/_rz.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 38805299403300
      // 021: lxor
      // 022: lstore 5
      // 024: dup2
      // 025: ldc2_w 121136906939647
      // 028: lxor
      // 029: lstore 7
      // 02b: pop2
      // 02c: ldc2_w 2728736874555226566
      // 02f: lload 3
      // 030: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: astore 9
      // 037: iload 2
      // 038: aload 9
      // 03a: ifnonnull 06b
      // 03d: aload 0
      // 03e: getfield com/zelix/_rz.r Ljava/util/ArrayList;
      // 041: invokevirtual java/util/ArrayList.size ()I
      // 044: if_icmpge 06a
      // 047: goto 054
      // 04a: ldc2_w 2543651546448040572
      // 04d: lload 3
      // 04e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: aload 0
      // 055: getfield com/zelix/_rz.r Ljava/util/ArrayList;
      // 058: iload 2
      // 059: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 05c: checkcast java/lang/String
      // 05f: areturn
      // 060: ldc2_w 2543651546448040572
      // 063: lload 3
      // 064: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: athrow
      // 06a: bipush 0
      // 06b: istore 10
      // 06d: aload 0
      // 06e: ldc2_w 2411589468665541014
      // 071: lload 3
      // 072: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: iload 10
      // 079: iinc 10 1
      // 07c: aload 0
      // 07d: iload 2
      // 07e: aload 0
      // 07f: ldc2_w 2553838761018558440
      // 082: lload 3
      // 083: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: irem
      // 089: lload 7
      // 08b: dup2_x1
      // 08c: pop2
      // 08d: bipush 2
      // 08e: anewarray 53
      // 091: dup_x1
      // 092: swap
      // 093: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 096: bipush 1
      // 097: swap
      // 098: aastore
      // 099: dup_x2
      // 09a: dup_x2
      // 09b: pop
      // 09c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09f: bipush 0
      // 0a0: swap
      // 0a1: aastore
      // 0a2: ldc2_w 4424359996213302590
      // 0a5: lload 3
      // 0a6: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: castore
      // 0ac: iload 2
      // 0ad: aload 0
      // 0ae: ldc2_w 2553838761018558440
      // 0b1: lload 3
      // 0b2: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: idiv
      // 0b8: istore 11
      // 0ba: iload 11
      // 0bc: ifle 111
      // 0bf: aload 0
      // 0c0: ldc2_w 2411589468665541014
      // 0c3: lload 3
      // 0c4: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: iload 10
      // 0cb: iinc 10 1
      // 0ce: aload 0
      // 0cf: iload 11
      // 0d1: aload 0
      // 0d2: ldc2_w 4474006994450819016
      // 0d5: lload 3
      // 0d6: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: irem
      // 0dc: lload 5
      // 0de: bipush 2
      // 0df: anewarray 53
      // 0e2: dup_x2
      // 0e3: dup_x2
      // 0e4: pop
      // 0e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e8: bipush 1
      // 0e9: swap
      // 0ea: aastore
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f0: bipush 0
      // 0f1: swap
      // 0f2: aastore
      // 0f3: ldc2_w 4087986639759204927
      // 0f6: lload 3
      // 0f7: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: castore
      // 0fd: iload 11
      // 0ff: aload 0
      // 100: ldc2_w 4474006994450819016
      // 103: lload 3
      // 104: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: idiv
      // 10a: istore 11
      // 10c: aload 9
      // 10e: ifnull 0ba
      // 111: new java/lang/String
      // 114: dup
      // 115: aload 0
      // 116: ldc2_w 2411589468665541014
      // 119: lload 3
      // 11a: invokedynamic n (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: bipush 0
      // 120: iload 10
      // 122: invokespecial java/lang/String.<init> ([CII)V
      // 125: astore 12
      // 127: aload 0
      // 128: ldc2_w 2362962515168819632
      // 12b: lload 3
      // 12c: lload 3
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: iflt 0c4
      // 132: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: aload 9
      // 139: ifnonnull 175
      // 13c: ifnull 177
      // 13f: goto 14c
      // 142: ldc2_w 2543651546448040572
      // 145: lload 3
      // 146: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: new java/lang/StringBuilder
      // 14f: dup
      // 150: invokespecial java/lang/StringBuilder.<init> ()V
      // 153: aload 0
      // 154: ldc2_w 2362962515168819632
      // 157: lload 3
      // 158: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 160: aload 12
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 168: goto 175
      // 16b: ldc2_w 2543651546448040572
      // 16e: lload 3
      // 16f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: athrow
      // 175: astore 12
      // 177: ldc2_w 2876726511802895361
      // 17a: lload 3
      // 17b: invokedynamic k (JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: aload 12
      // 182: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 187: aload 9
      // 189: lload 3
      // 18a: lconst_0
      // 18b: lcmp
      // 18c: ifle 1a8
      // 18f: ifnonnull 1a6
      // 192: ifeq 1a5
      // 195: goto 1a2
      // 198: ldc2_w 2543651546448040572
      // 19b: lload 3
      // 19c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: aconst_null
      // 1a3: astore 12
      // 1a5: iload 2
      // 1a6: aload 9
      // 1a8: ifnonnull 1d8
      // 1ab: aload 0
      // 1ac: getfield com/zelix/_rz.r Ljava/util/ArrayList;
      // 1af: invokevirtual java/util/ArrayList.size ()I
      // 1b2: if_icmpne 1d9
      // 1b5: goto 1c2
      // 1b8: ldc2_w 2543651546448040572
      // 1bb: lload 3
      // 1bc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: getfield com/zelix/_rz.r Ljava/util/ArrayList;
      // 1c6: aload 12
      // 1c8: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1cb: goto 1d8
      // 1ce: ldc2_w 2543651546448040572
      // 1d1: lload 3
      // 1d2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: pop
      // 1d9: aload 12
      // 1db: areturn
   }

   public _rz(short var1, int var2, char var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      int var7 = (int)((var5 ^ 15676623602586L) >>> 32);
      int var8 = (int)((var5 ^ 15676623602586L) << 32 >>> 32);
      this(var2, var7, null, var8);
   }

   public _rz(int param1, int param2, String param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 32
      // 0d: lushr
      // 0e: lor
      // 0f: getstatic com/zelix/_rz.a J
      // 12: lxor
      // 13: lstore 5
      // 15: aload 0
      // 16: invokespecial com/zelix/_r8.<init> ()V
      // 19: ldc2_w 7178777617783062456
      // 1c: lload 5
      // 1e: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: aload 0
      // 24: new java/util/ArrayList
      // 27: dup
      // 28: sipush 10811
      // 2b: ldc2_w 5609001351925589088
      // 2e: lload 5
      // 30: lxor
      // 31: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: invokespecial java/util/ArrayList.<init> (I)V
      // 39: putfield com/zelix/_rz.r Ljava/util/ArrayList;
      // 3c: aload 0
      // 3d: sipush 11865
      // 40: ldc2_w 5761198164717723651
      // 43: lload 5
      // 45: lxor
      // 46: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: newarray 5
      // 4d: ldc2_w 7424712127375849448
      // 50: lload 5
      // 52: invokedynamic w (Ljava/lang/Object;[CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: aload 0
      // 58: iload 1
      // 59: ldc2_w 7385983363933770048
      // 5c: lload 5
      // 5e: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: aload 0
      // 64: aload 3
      // 65: ldc2_w 7400718676411236302
      // 68: lload 5
      // 6a: invokedynamic w (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: astore 7
      // 71: aload 7
      // 73: ifnonnull df
      // 76: iload 1
      // 77: ifne bf
      // 7a: goto 88
      // 7d: ldc2_w 7292051367475860482
      // 80: lload 5
      // 82: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: aload 0
      // 89: sipush 28401
      // 8c: ldc2_w 682654614670155937
      // 8f: lload 5
      // 91: lxor
      // 92: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: putfield com/zelix/_rz.F I
      // 9a: aload 0
      // 9b: sipush 16813
      // 9e: ldc2_w 5831501515871424505
      // a1: lload 5
      // a3: lxor
      // a4: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: putfield com/zelix/_rz.G I
      // ac: aload 7
      // ae: ifnull f1
      // b1: goto bf
      // b4: ldc2_w 7292051367475860482
      // b7: lload 5
      // b9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: athrow
      // bf: aload 0
      // c0: sipush 11303
      // c3: ldc2_w 8840839910029288056
      // c6: lload 5
      // c8: lxor
      // c9: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: putfield com/zelix/_rz.F I
      // d1: goto df
      // d4: ldc2_w 7292051367475860482
      // d7: lload 5
      // d9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: athrow
      // df: aload 0
      // e0: sipush 23656
      // e3: ldc2_w 9088667508051776058
      // e6: lload 5
      // e8: lxor
      // e9: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ee: putfield com/zelix/_rz.G I
      // f1: return
   }

   final char S(Object[] param1) {
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
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: pop
      // 17: getstatic com/zelix/_rz.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: ldc2_w 5522031757437096122
      // 20: lload 2
      // 21: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: astore 5
      // 28: iload 4
      // 2a: sipush 12614
      // 2d: ldc2_w 723741545503969306
      // 30: lload 2
      // 31: lxor
      // 32: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 5
      // 39: ifnonnull 77
      // 3c: if_icmpgt 68
      // 3f: goto 4c
      // 42: ldc2_w 5345918444242074368
      // 45: lload 2
      // 46: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: sipush 17188
      // 4f: ldc2_w 5137132419212157557
      // 52: lload 2
      // 53: lxor
      // 54: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: iload 4
      // 5b: iadd
      // 5c: i2c
      // 5d: ireturn
      // 5e: ldc2_w 5345918444242074368
      // 61: lload 2
      // 62: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: sipush 9467
      // 6b: ldc2_w 5599211201740391852
      // 6e: lload 2
      // 6f: lxor
      // 70: invokedynamic d (IJ)I bsm=com/zelix/_rz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: iload 4
      // 77: iadd
      // 78: i2c
      // 79: ireturn
   }

   public final String h(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 5120902836843L;
      hk[] var10000 = x44.a<"r">(-3299352763420357074L, var3);
      String var8 = null;
      hk[] var7 = var10000;

      while (true) {
         Object[] var10004 = new Object[]{null, var2};
         var10004[0] = var5;
         var8 = x44.a<"j">(this, var10004, -2947310408877706848L, var3);
         String var11 = var8;

         while (var11 != null) {
            var11 = var8;
            if (var7 == null) {
               return var8;
            }
         }
      }
   }

   static {
      long var0 = a ^ 99910235217985L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[14];
      int var5 = 0;
      String var6 = "£/?3*¦\u008aàÓ\t\u0011é[\u0017ù\u009e{ éy\u0093Ï\u0092ÙïLÙ\f\u0012\t\u0004g\u0011@\u001fU\u0013Úº\u0010x\u009c\u0095H¢Î¦%`\u0016ÊS&&@Ø9´\u0012]\u008d\u0098x¶;C#ð¾cËî\u0003õ&;D+v\u0085ó¹ D¶d&ÿ\u00adÁR&\u0084\u0000\u0081¤";
      int var7 = "£/?3*¦\u008aàÓ\t\u0011é[\u0017ù\u009e{ éy\u0093Ï\u0092ÙïLÙ\f\u0012\t\u0004g\u0011@\u001fU\u0013Úº\u0010x\u009c\u0095H¢Î¦%`\u0016ÊS&&@Ø9´\u0012]\u008d\u0098x¶;C#ð¾cËî\u0003õ&;D+v\u0085ó¹ D¶d&ÿ\u00adÁR&\u0084\u0000\u0081¤"
         .length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[14];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = " d\u0002\u0088\u0097¾\u0098\u0083+\u0093Ý\u008d\u00975\u0019i";
                  var7 = " d\u0002\u0088\u0097¾\u0098\u0083+\u0093Ý\u008d\u00975\u0019i".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9344;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = b[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_rz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_rz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
