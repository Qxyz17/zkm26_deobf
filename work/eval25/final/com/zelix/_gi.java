package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _gi extends _n7 {
   private static final long a = ess.a(7176240788752481073L, -6578343626677677967L, MethodHandles.lookup().lookupClass()).a(47461402511212L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] k;
   private static final Map n;

   public _gi(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 119541711894470L;
      super(var4, var3);
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"l">(14389, 3960401410311025501L ^ var2);
   }

   protected void G(Object[] param1) {
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
      // 004: checkcast com/zelix/_uu
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 6
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 4
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/lang/Integer
      // 025: invokevirtual java/lang/Integer.intValue ()I
      // 028: istore 3
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 2
      // 033: pop
      // 034: lload 4
      // 036: dup2
      // 037: ldc2_w 51414491838406
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 130298468579397
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 92599993247389
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 93901855267089
      // 04f: lxor
      // 050: lstore 14
      // 052: dup2
      // 053: ldc2_w 67332044126386
      // 056: lxor
      // 057: lstore 16
      // 059: dup2
      // 05a: ldc2_w 40635419442009
      // 05d: lxor
      // 05e: lstore 18
      // 060: dup2
      // 061: ldc2_w 49243539097049
      // 064: lxor
      // 065: lstore 20
      // 067: dup2
      // 068: ldc2_w 44605648737880
      // 06b: lxor
      // 06c: lstore 22
      // 06e: dup2
      // 06f: ldc2_w 49257372311205
      // 072: lxor
      // 073: lstore 24
      // 075: dup2
      // 076: ldc2_w 98840750245944
      // 079: lxor
      // 07a: lstore 26
      // 07c: dup2
      // 07d: ldc2_w 8992015295639
      // 080: lxor
      // 081: lstore 28
      // 083: dup2
      // 084: ldc2_w 90394944124104
      // 087: lxor
      // 088: dup2
      // 089: bipush 48
      // 08b: lushr
      // 08c: l2i
      // 08d: istore 30
      // 08f: dup2
      // 090: bipush 16
      // 092: lshl
      // 093: bipush 48
      // 095: lushr
      // 096: l2i
      // 097: istore 31
      // 099: dup2
      // 09a: bipush 32
      // 09c: lshl
      // 09d: bipush 32
      // 09f: lushr
      // 0a0: l2i
      // 0a1: istore 32
      // 0a3: pop2
      // 0a4: dup2
      // 0a5: ldc2_w 70142167156199
      // 0a8: lxor
      // 0a9: lstore 33
      // 0ab: dup2
      // 0ac: ldc2_w 75613727555708
      // 0af: lxor
      // 0b0: lstore 35
      // 0b2: dup2
      // 0b3: ldc2_w 79526024160732
      // 0b6: lxor
      // 0b7: lstore 37
      // 0b9: pop2
      // 0ba: aload 0
      // 0bb: lload 12
      // 0bd: bipush 1
      // 0be: anewarray 228
      // 0c1: dup_x2
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: ldc2_w 1707270652021957629
      // 0cd: lload 4
      // 0cf: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: istore 40
      // 0d6: ldc2_w 1031773425375417457
      // 0d9: lload 4
      // 0db: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: aload 0
      // 0e1: bipush 0
      // 0e2: lload 26
      // 0e4: bipush 2
      // 0e5: anewarray 228
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 1
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f6: bipush 0
      // 0f7: swap
      // 0f8: aastore
      // 0f9: ldc2_w 899743315497312719
      // 0fc: lload 4
      // 0fe: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: checkcast com/zelix/_q2
      // 106: astore 41
      // 108: aload 41
      // 10a: lload 16
      // 10c: bipush 1
      // 10d: anewarray 228
      // 110: dup_x2
      // 111: dup_x2
      // 112: pop
      // 113: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 116: bipush 0
      // 117: swap
      // 118: aastore
      // 119: ldc2_w 1311276545112853833
      // 11c: lload 4
      // 11e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: astore 42
      // 125: aload 42
      // 127: invokeinterface java/util/Set.size ()I 1
      // 12c: istore 43
      // 12e: istore 39
      // 130: bipush 0
      // 131: istore 44
      // 133: aload 42
      // 135: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 13a: astore 45
      // 13c: aload 45
      // 13e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 143: ifeq 417
      // 146: aload 45
      // 148: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 14d: checkcast java/lang/String
      // 150: astore 46
      // 152: iload 30
      // 154: i2c
      // 155: aload 46
      // 157: iload 31
      // 159: i2s
      // 15a: iload 32
      // 15c: ldc2_w 1031205370267032143
      // 15f: lload 4
      // 161: invokedynamic u (CLjava/lang/Object;SIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: lload 4
      // 168: lconst_0
      // 169: lcmp
      // 16a: ifle 439
      // 16d: iload 39
      // 16f: ifne 439
      // 172: iload 39
      // 174: lload 4
      // 176: lconst_0
      // 177: lcmp
      // 178: ifle 2a6
      // 17b: ifne 2a4
      // 17e: goto 18c
      // 181: ldc2_w 961314683361653630
      // 184: lload 4
      // 186: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: ifne 2a2
      // 18f: goto 19d
      // 192: ldc2_w 961314683361653630
      // 195: lload 4
      // 197: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: aload 46
      // 19f: aload 46
      // 1a1: invokevirtual java/lang/String.length ()I
      // 1a4: bipush 1
      // 1a5: isub
      // 1a6: invokevirtual java/lang/String.charAt (I)C
      // 1a9: istore 47
      // 1ab: iload 47
      // 1ad: sipush 8527
      // 1b0: ldc2_w 8371602279492096820
      // 1b3: lload 4
      // 1b5: lxor
      // 1b6: invokedynamic c (IJ)I bsm=com/zelix/_gi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: lload 4
      // 1bd: lconst_0
      // 1be: lcmp
      // 1bf: ifle 2c2
      // 1c2: iload 39
      // 1c4: ifne 2c2
      // 1c7: if_icmpeq 2a2
      // 1ca: goto 1d8
      // 1cd: ldc2_w 961314683361653630
      // 1d0: lload 4
      // 1d2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: new java/lang/StringBuilder
      // 1db: dup
      // 1dc: invokespecial java/lang/StringBuilder.<init> ()V
      // 1df: aload 46
      // 1e1: iload 39
      // 1e3: ifne 27e
      // 1e6: goto 1f4
      // 1e9: ldc2_w 961314683361653630
      // 1ec: lload 4
      // 1ee: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: athrow
      // 1f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f7: iload 47
      // 1f9: ldc2_w 1629863357183642094
      // 1fc: lload 4
      // 1fe: invokedynamic l (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: if_icmpeq 27c
      // 206: goto 214
      // 209: ldc2_w 961314683361653630
      // 20c: lload 4
      // 20e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: athrow
      // 214: iload 47
      // 216: sipush 201
      // 219: ldc2_w 8236265777442304695
      // 21c: lload 4
      // 21e: lxor
      // 21f: invokedynamic c (IJ)I bsm=com/zelix/_gi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: iload 39
      // 226: ifne 279
      // 229: goto 237
      // 22c: ldc2_w 961314683361653630
      // 22f: lload 4
      // 231: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: athrow
      // 237: if_icmpeq 27c
      // 23a: goto 248
      // 23d: ldc2_w 961314683361653630
      // 240: lload 4
      // 242: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: athrow
      // 248: iload 47
      // 24a: iload 39
      // 24c: ifne 28b
      // 24f: goto 25d
      // 252: ldc2_w 961314683361653630
      // 255: lload 4
      // 257: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: athrow
      // 25d: sipush 8697
      // 260: ldc2_w 7134300612309291909
      // 263: lload 4
      // 265: lxor
      // 266: invokedynamic c (IJ)I bsm=com/zelix/_gi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: goto 279
      // 26e: ldc2_w 961314683361653630
      // 271: lload 4
      // 273: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: athrow
      // 279: if_icmpne 281
      // 27c: ldc ""
      // 27e: goto 295
      // 281: ldc2_w 1629863357183642094
      // 284: lload 4
      // 286: invokedynamic l (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: ldc2_w 1273546921587763215
      // 28e: lload 4
      // 290: invokedynamic u (CJJ)Ljava/lang/Character; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 298: ldc "*"
      // 29a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a0: astore 46
      // 2a2: iload 44
      // 2a4: iload 39
      // 2a6: lload 4
      // 2a8: lconst_0
      // 2a9: lcmp
      // 2aa: iflt 2b4
      // 2ad: ifne 2ee
      // 2b0: iload 43
      // 2b2: bipush 1
      // 2b3: isub
      // 2b4: goto 2c2
      // 2b7: ldc2_w 961314683361653630
      // 2ba: lload 4
      // 2bc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: if_icmpne 3d8
      // 2c5: aload 41
      // 2c7: lload 14
      // 2c9: bipush 1
      // 2ca: anewarray 228
      // 2cd: dup_x2
      // 2ce: dup_x2
      // 2cf: pop
      // 2d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d3: bipush 0
      // 2d4: swap
      // 2d5: aastore
      // 2d6: ldc2_w 1186930777711585210
      // 2d9: lload 4
      // 2db: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e0: goto 2ee
      // 2e3: ldc2_w 961314683361653630
      // 2e6: lload 4
      // 2e8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: athrow
      // 2ee: ifeq 3d8
      // 2f1: new com/zelix/pg
      // 2f4: dup
      // 2f5: lload 22
      // 2f7: invokespecial com/zelix/pg.<init> (J)V
      // 2fa: astore 47
      // 2fc: aload 41
      // 2fe: lload 35
      // 300: bipush 1
      // 301: anewarray 228
      // 304: dup_x2
      // 305: dup_x2
      // 306: pop
      // 307: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30a: bipush 0
      // 30b: swap
      // 30c: aastore
      // 30d: ldc2_w 1597154277365205043
      // 310: lload 4
      // 312: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 317: lload 33
      // 319: dup2_x1
      // 31a: pop2
      // 31b: aload 47
      // 31d: bipush 3
      // 31e: anewarray 228
      // 321: dup_x1
      // 322: swap
      // 323: bipush 2
      // 324: swap
      // 325: aastore
      // 326: dup_x1
      // 327: swap
      // 328: bipush 1
      // 329: swap
      // 32a: aastore
      // 32b: dup_x2
      // 32c: dup_x2
      // 32d: pop
      // 32e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 331: bipush 0
      // 332: swap
      // 333: aastore
      // 334: ldc2_w 1657292686775058829
      // 337: lload 4
      // 339: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: astore 48
      // 340: lload 4
      // 342: lconst_0
      // 343: lcmp
      // 344: ifle 377
      // 347: aload 7
      // 349: aload 46
      // 34b: iload 39
      // 34d: ifne 3ae
      // 350: aload 48
      // 352: lload 28
      // 354: dup2_x2
      // 355: pop2
      // 356: bipush 3
      // 357: anewarray 228
      // 35a: dup_x1
      // 35b: swap
      // 35c: bipush 2
      // 35d: swap
      // 35e: aastore
      // 35f: dup_x1
      // 360: swap
      // 361: bipush 1
      // 362: swap
      // 363: aastore
      // 364: dup_x2
      // 365: dup_x2
      // 366: pop
      // 367: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 36a: bipush 0
      // 36b: swap
      // 36c: aastore
      // 36d: ldc2_w 1609845671666458923
      // 370: lload 4
      // 372: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: aload 47
      // 379: lload 8
      // 37b: invokevirtual com/zelix/pg.n (J)Z
      // 37e: lload 4
      // 380: lconst_0
      // 381: lcmp
      // 382: ifle 3ce
      // 385: ifne 3cc
      // 388: goto 396
      // 38b: ldc2_w 961314683361653630
      // 38e: lload 4
      // 390: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 395: athrow
      // 396: aload 7
      // 398: aload 47
      // 39a: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 39d: checkcast java/lang/String
      // 3a0: goto 3ae
      // 3a3: ldc2_w 961314683361653630
      // 3a6: lload 4
      // 3a8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ad: athrow
      // 3ae: lload 10
      // 3b0: bipush 2
      // 3b1: anewarray 228
      // 3b4: dup_x2
      // 3b5: dup_x2
      // 3b6: pop
      // 3b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ba: bipush 1
      // 3bb: swap
      // 3bc: aastore
      // 3bd: dup_x1
      // 3be: swap
      // 3bf: bipush 0
      // 3c0: swap
      // 3c1: aastore
      // 3c2: ldc2_w 1259892150344068944
      // 3c5: lload 4
      // 3c7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cc: iload 39
      // 3ce: lload 4
      // 3d0: lconst_0
      // 3d1: lcmp
      // 3d2: iflt 414
      // 3d5: ifeq 40f
      // 3d8: aload 7
      // 3da: lload 28
      // 3dc: aload 46
      // 3de: ldc ""
      // 3e0: bipush 3
      // 3e1: anewarray 228
      // 3e4: dup_x1
      // 3e5: swap
      // 3e6: bipush 2
      // 3e7: swap
      // 3e8: aastore
      // 3e9: dup_x1
      // 3ea: swap
      // 3eb: bipush 1
      // 3ec: swap
      // 3ed: aastore
      // 3ee: dup_x2
      // 3ef: dup_x2
      // 3f0: pop
      // 3f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f4: bipush 0
      // 3f5: swap
      // 3f6: aastore
      // 3f7: ldc2_w 1609845671666458923
      // 3fa: lload 4
      // 3fc: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: goto 40f
      // 404: ldc2_w 961314683361653630
      // 407: lload 4
      // 409: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40e: athrow
      // 40f: iinc 44 1
      // 412: iload 39
      // 414: ifeq 13c
      // 417: aload 41
      // 419: lload 4
      // 41b: lconst_0
      // 41c: lcmp
      // 41d: ifle 14d
      // 420: lload 18
      // 422: bipush 1
      // 423: anewarray 228
      // 426: dup_x2
      // 427: dup_x2
      // 428: pop
      // 429: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42c: bipush 0
      // 42d: swap
      // 42e: aastore
      // 42f: ldc2_w 989874360616994802
      // 432: lload 4
      // 434: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 439: ifeq 505
      // 43c: aload 7
      // 43e: new java/lang/StringBuilder
      // 441: dup
      // 442: invokespecial java/lang/StringBuilder.<init> ()V
      // 445: sipush 5444
      // 448: ldc2_w 1870988446109368459
      // 44b: lload 4
      // 44d: lxor
      // 44e: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 453: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 456: aload 0
      // 457: lload 24
      // 459: bipush 1
      // 45a: anewarray 228
      // 45d: dup_x2
      // 45e: dup_x2
      // 45f: pop
      // 460: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 463: bipush 0
      // 464: swap
      // 465: aastore
      // 466: ldc2_w 1549508811148782292
      // 469: lload 4
      // 46b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 470: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 473: sipush 28729
      // 476: ldc2_w 5909137365100193266
      // 479: lload 4
      // 47b: lxor
      // 47c: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 481: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 484: aload 41
      // 486: lload 20
      // 488: bipush 1
      // 489: anewarray 228
      // 48c: dup_x2
      // 48d: dup_x2
      // 48e: pop
      // 48f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 492: bipush 0
      // 493: swap
      // 494: aastore
      // 495: ldc2_w 1360842015922631788
      // 498: lload 4
      // 49a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a2: sipush 22727
      // 4a5: ldc2_w 973641559072787718
      // 4a8: lload 4
      // 4aa: lxor
      // 4ab: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b3: aload 41
      // 4b5: lload 37
      // 4b7: bipush 1
      // 4b8: anewarray 228
      // 4bb: dup_x2
      // 4bc: dup_x2
      // 4bd: pop
      // 4be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c1: bipush 0
      // 4c2: swap
      // 4c3: aastore
      // 4c4: ldc2_w 949434765690539629
      // 4c7: lload 4
      // 4c9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d1: ldc "'"
      // 4d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4d9: lload 10
      // 4db: bipush 2
      // 4dc: anewarray 228
      // 4df: dup_x2
      // 4e0: dup_x2
      // 4e1: pop
      // 4e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e5: bipush 1
      // 4e6: swap
      // 4e7: aastore
      // 4e8: dup_x1
      // 4e9: swap
      // 4ea: bipush 0
      // 4eb: swap
      // 4ec: aastore
      // 4ed: ldc2_w 1259892150344068944
      // 4f0: lload 4
      // 4f2: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f7: goto 505
      // 4fa: ldc2_w 961314683361653630
      // 4fd: lload 4
      // 4ff: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 504: athrow
      // 505: return
   }

   private static String V(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/util/Set
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/pg
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/_gi.a J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 88722633593108
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 123140175593753
      // 02d: lxor
      // 02e: lstore 7
      // 030: pop2
      // 031: new java/lang/StringBuilder
      // 034: dup
      // 035: invokespecial java/lang/StringBuilder.<init> ()V
      // 038: astore 10
      // 03a: aload 3
      // 03b: invokeinterface java/util/Set.size ()I 1
      // 040: istore 11
      // 042: bipush 0
      // 043: istore 12
      // 045: ldc2_w 7818507155034732192
      // 048: lload 1
      // 049: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: bipush 0
      // 04f: istore 13
      // 051: istore 9
      // 053: aconst_null
      // 054: astore 14
      // 056: aload 10
      // 058: sipush 13158
      // 05b: ldc2_w 8861216686250779599
      // 05e: lload 1
      // 05f: lxor
      // 060: invokedynamic c (IJ)I bsm=com/zelix/_gi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 068: pop
      // 069: aload 3
      // 06a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 06f: astore 15
      // 071: aload 15
      // 073: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 078: ifeq 2d2
      // 07b: aload 15
      // 07d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 082: checkcast java/lang/String
      // 085: astore 16
      // 087: aload 16
      // 089: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 08c: astore 17
      // 08e: bipush 0
      // 08f: istore 18
      // 091: aload 17
      // 093: iload 9
      // 095: ifne 2f0
      // 098: ldc "!"
      // 09a: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 09d: iload 9
      // 09f: lload 1
      // 0a0: lconst_0
      // 0a1: lcmp
      // 0a2: iflt 0e4
      // 0a5: ifne 0e2
      // 0a8: goto 0b5
      // 0ab: ldc2_w 8036168032804016559
      // 0ae: lload 1
      // 0af: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: ifeq 0d0
      // 0b8: goto 0c5
      // 0bb: ldc2_w 8036168032804016559
      // 0be: lload 1
      // 0bf: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: bipush 1
      // 0c6: istore 18
      // 0c8: aload 17
      // 0ca: bipush 1
      // 0cb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0ce: astore 17
      // 0d0: aload 17
      // 0d2: sipush 21666
      // 0d5: ldc2_w 1744961528431879091
      // 0d8: lload 1
      // 0d9: lxor
      // 0da: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0e2: iload 9
      // 0e4: lload 1
      // 0e5: lconst_0
      // 0e6: lcmp
      // 0e7: iflt 109
      // 0ea: ifne 107
      // 0ed: ifeq 105
      // 0f0: goto 0fd
      // 0f3: ldc2_w 8036168032804016559
      // 0f6: lload 1
      // 0f7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: aload 17
      // 0ff: bipush 1
      // 100: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 103: astore 17
      // 105: iload 12
      // 107: iload 9
      // 109: lload 1
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: ifle 23f
      // 10f: ifne 23d
      // 112: ifle 23b
      // 115: goto 122
      // 118: ldc2_w 8036168032804016559
      // 11b: lload 1
      // 11c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: iload 13
      // 124: iload 9
      // 126: lload 1
      // 127: lconst_0
      // 128: lcmp
      // 129: ifle 150
      // 12c: ifne 14e
      // 12f: goto 13c
      // 132: ldc2_w 8036168032804016559
      // 135: lload 1
      // 136: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: ifeq 21b
      // 13f: goto 14c
      // 142: ldc2_w 8036168032804016559
      // 145: lload 1
      // 146: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: iload 18
      // 14e: iload 9
      // 150: lload 1
      // 151: lconst_0
      // 152: lcmp
      // 153: iflt 16f
      // 156: ifne 16b
      // 159: ifeq 172
      // 15c: goto 169
      // 15f: ldc2_w 8036168032804016559
      // 162: lload 1
      // 163: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: iload 12
      // 16b: iload 11
      // 16d: bipush 1
      // 16e: isub
      // 16f: if_icmpeq 21b
      // 172: aload 10
      // 174: sipush 24628
      // 177: ldc2_w 6431722630081484589
      // 17a: lload 1
      // 17b: lxor
      // 17c: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 184: pop
      // 185: aload 17
      // 187: lload 7
      // 189: bipush 2
      // 18a: anewarray 228
      // 18d: dup_x2
      // 18e: dup_x2
      // 18f: pop
      // 190: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 193: bipush 1
      // 194: swap
      // 195: aastore
      // 196: dup_x1
      // 197: swap
      // 198: bipush 0
      // 199: swap
      // 19a: aastore
      // 19b: ldc2_w 7953279050707234648
      // 19e: lload 1
      // 19f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: astore 19
      // 1a6: aload 19
      // 1a8: aload 14
      // 1aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ad: lload 1
      // 1ae: lconst_0
      // 1af: lcmp
      // 1b0: ifle 218
      // 1b3: ifne 210
      // 1b6: aload 4
      // 1b8: new java/lang/StringBuilder
      // 1bb: dup
      // 1bc: invokespecial java/lang/StringBuilder.<init> ()V
      // 1bf: sipush 24729
      // 1c2: ldc2_w 5757693052158187398
      // 1c5: lload 1
      // 1c6: lxor
      // 1c7: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cf: aload 16
      // 1d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d4: sipush 10307
      // 1d7: ldc2_w 4908801412172242779
      // 1da: lload 1
      // 1db: lxor
      // 1dc: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e4: aload 14
      // 1e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e9: sipush 5793
      // 1ec: ldc2_w 2722468912263324090
      // 1ef: lload 1
      // 1f0: lxor
      // 1f1: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fc: lload 5
      // 1fe: dup2_x1
      // 1ff: pop2
      // 200: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 203: goto 210
      // 206: ldc2_w 8036168032804016559
      // 209: lload 1
      // 20a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: athrow
      // 210: lload 1
      // 211: lconst_0
      // 212: lcmp
      // 213: ifle 22e
      // 216: iload 9
      // 218: ifeq 23b
      // 21b: aload 10
      // 21d: sipush 32341
      // 220: ldc2_w 2410456390980831560
      // 223: lload 1
      // 224: lxor
      // 225: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/_gi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22d: pop
      // 22e: goto 23b
      // 231: ldc2_w 8036168032804016559
      // 234: lload 1
      // 235: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: athrow
      // 23b: iload 18
      // 23d: iload 9
      // 23f: ifne 297
      // 242: ifeq 289
      // 245: goto 252
      // 248: ldc2_w 8036168032804016559
      // 24b: lload 1
      // 24c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: athrow
      // 252: aload 10
      // 254: ldc "!"
      // 256: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 259: pop
      // 25a: bipush 1
      // 25b: istore 13
      // 25d: aload 17
      // 25f: lload 7
      // 261: bipush 2
      // 262: anewarray 228
      // 265: dup_x2
      // 266: dup_x2
      // 267: pop
      // 268: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26b: bipush 1
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 0
      // 271: swap
      // 272: aastore
      // 273: ldc2_w 7953279050707234648
      // 276: lload 1
      // 277: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: astore 14
      // 27e: iload 9
      // 280: lload 1
      // 281: lconst_0
      // 282: lcmp
      // 283: ifle 2cf
      // 286: ifeq 29c
      // 289: bipush 0
      // 28a: goto 297
      // 28d: ldc2_w 8036168032804016559
      // 290: lload 1
      // 291: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: athrow
      // 297: istore 13
      // 299: aconst_null
      // 29a: astore 14
      // 29c: aload 10
      // 29e: sipush 25183
      // 2a1: ldc2_w 7358699292966695668
      // 2a4: lload 1
      // 2a5: lxor
      // 2a6: invokedynamic c (IJ)I bsm=com/zelix/_gi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2ae: pop
      // 2af: aload 10
      // 2b1: aload 17
      // 2b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b6: pop
      // 2b7: aload 10
      // 2b9: sipush 12753
      // 2bc: ldc2_w 1213442284733653375
      // 2bf: lload 1
      // 2c0: lxor
      // 2c1: invokedynamic c (IJ)I bsm=com/zelix/_gi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2c9: pop
      // 2ca: iinc 12 1
      // 2cd: iload 9
      // 2cf: ifeq 071
      // 2d2: aload 10
      // 2d4: sipush 10215
      // 2d7: ldc2_w 3218378090618189647
      // 2da: lload 1
      // 2db: lxor
      // 2dc: invokedynamic c (IJ)I bsm=com/zelix/_gi.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 2e4: pop
      // 2e5: aload 10
      // 2e7: lload 1
      // 2e8: lconst_0
      // 2e9: lcmp
      // 2ea: iflt 082
      // 2ed: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f0: areturn
   }

   private static String g(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 2
      // 12: pop
      // 13: getstatic com/zelix/_gi.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -8373962771609542549
      // 1c: lload 2
      // 1d: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 1
      // 23: ldc "."
      // 25: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 28: istore 5
      // 2a: istore 4
      // 2c: iload 5
      // 2e: bipush -1
      // 2f: iload 4
      // 31: ifeq 59
      // 34: if_icmple 6f
      // 37: goto 44
      // 3a: ldc2_w -8527259501999753344
      // 3d: lload 2
      // 3e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: iload 5
      // 46: aload 1
      // 47: invokevirtual java/lang/String.length ()I
      // 4a: bipush 1
      // 4b: isub
      // 4c: goto 59
      // 4f: ldc2_w -8527259501999753344
      // 52: lload 2
      // 53: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: if_icmpge 6f
      // 5c: aload 1
      // 5d: iload 5
      // 5f: bipush 1
      // 60: iadd
      // 61: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 64: areturn
      // 65: ldc2_w -8527259501999753344
      // 68: lload 2
      // 69: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: ldc ""
      // 71: areturn
   }

   static {
      long var11 = a ^ 129024488289329L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[10];
      int var18 = 0;
      String var17 = "\u0002\rä\u0098Õ\nK±FP\u0013\u0013\u0092¿Ú±\u0006\u0088\u0081¼\u009f?Ô\u001aå\u0019ø\u0014T\u0003sc.\u008f\u001fs¼k\u0010\u0097\u0083²n\u008a¤ø\u001bfó[Äª¼~í\u0091x\u0086:\u0000âìZ\u0006\u0010\u008a\u00802\u001f?kÀJÿ\u0098IOas\u0085¤ @|\u009có\u001d\u0085\u0081z\u0012\\Hj%×\u0001÷?iÉ)²Ê\u000f\u008aÇ\u001f\u0016\u0002£R³°\u0018\u009ds\n\u009fðS!ÊNn~¯´¼dÑç{ÆÉlUÎ\u0011\u00107)\u00812\u0094K\u000b£Tã\u0091Ü4yù§\u0010\u0080LÙ\u009a\u001bÐ2²\u008fßq\u0090æ\t¾©X¬\u0013aô=@\u0099.3Öu*\u0081\u001ez\u00adWÛÀ¼÷î\u0004+h\u008c\u009d\u0011÷\u008bM<tù\u001e\b|\u0090e\"I3\u0005»\u000fWÆ\u0017\u007f(\n\u0007å\u007fdÅ\u0011v¸¥©ì-C%{\u0096Ï\u009a\u0004\u0081ª®Ht\u0019xv'\u008cçÎP\u000bUk:?\u0080ÝvÎÔ\u0014ÓÐ©\u0002ôE=½u\u0088Ê\r3Ì\u0086Îî´É¶\u001eË8$~?æò\u00953'\u001d~:p\u0091\u000e:#ÁýM\u009aáôé3\u0091C\u0099Zø\u0016K¿ni]\u008eDyü\ta\u008e\u009c\u0003(\n\u0003°(M¢ÂÖ\u0003\u000eóà'O\u0015òC\u0086r\u008f\u0096\u0092ÿ\n£\u0007J\u0000Êt¬Hñ©\u009bk\u0093K.z\u0094ðÀÁ«p\tÈ`TýB Ê\"";
      int var19 = "\u0002\rä\u0098Õ\nK±FP\u0013\u0013\u0092¿Ú±\u0006\u0088\u0081¼\u009f?Ô\u001aå\u0019ø\u0014T\u0003sc.\u008f\u001fs¼k\u0010\u0097\u0083²n\u008a¤ø\u001bfó[Äª¼~í\u0091x\u0086:\u0000âìZ\u0006\u0010\u008a\u00802\u001f?kÀJÿ\u0098IOas\u0085¤ @|\u009có\u001d\u0085\u0081z\u0012\\Hj%×\u0001÷?iÉ)²Ê\u000f\u008aÇ\u001f\u0016\u0002£R³°\u0018\u009ds\n\u009fðS!ÊNn~¯´¼dÑç{ÆÉlUÎ\u0011\u00107)\u00812\u0094K\u000b£Tã\u0091Ü4yù§\u0010\u0080LÙ\u009a\u001bÐ2²\u008fßq\u0090æ\t¾©X¬\u0013aô=@\u0099.3Öu*\u0081\u001ez\u00adWÛÀ¼÷î\u0004+h\u008c\u009d\u0011÷\u008bM<tù\u001e\b|\u0090e\"I3\u0005»\u000fWÆ\u0017\u007f(\n\u0007å\u007fdÅ\u0011v¸¥©ì-C%{\u0096Ï\u009a\u0004\u0081ª®Ht\u0019xv'\u008cçÎP\u000bUk:?\u0080ÝvÎÔ\u0014ÓÐ©\u0002ôE=½u\u0088Ê\r3Ì\u0086Îî´É¶\u001eË8$~?æò\u00953'\u001d~:p\u0091\u000e:#ÁýM\u009aáôé3\u0091C\u0099Zø\u0016K¿ni]\u008eDyü\ta\u008e\u009c\u0003(\n\u0003°(M¢ÂÖ\u0003\u000eóà'O\u0015òC\u0086r\u008f\u0096\u0092ÿ\n£\u0007J\u0000Êt¬Hñ©\u009bk\u0093K.z\u0094ðÀÁ«p\tÈ`TýB Ê\""
         .length();
      char var16 = '@';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     d = new String[10];
                     n = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "\u001cÖ\u0018Vö\u0010\u0019¤x7\u008eà\u0093»k´Ànp\u0006¢ÑMRI\u0099§8\u001d\u0004\u001c\u0086Ö¾\u008cß,º\u0019&";
                     int var5 = "\u001cÖ\u0018Vö\u0010\u0019¤x7\u008eà\u0093»k´Ànp\u0006¢ÑMRI\u0099§8\u001d\u0004\u001c\u0086Ö¾\u008cß,º\u0019&".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
                           byte[] var10 = var0.doFinal(
                              new byte[]{
                                 (byte)((int)(var8 >>> 56)),
                                 (byte)((int)(var8 >>> 48)),
                                 (byte)((int)(var8 >>> 40)),
                                 (byte)((int)(var8 >>> 32)),
                                 (byte)((int)(var8 >>> 24)),
                                 (byte)((int)(var8 >>> 16)),
                                 (byte)((int)(var8 >>> 8)),
                                 (byte)((int)var8)
                              }
                           );
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    f = var6;
                                    k = new Integer[7];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0016ßxqo}É½D|\u0093ScÌô(";
                                 var5 = "\u0016ßxqo}É½D|\u0093ScÌô(".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "\u001fe¯ö\u001b\u0002A\u0003\u0080(öm]Ê/ |nµ/÷\u0001çm\u009bè\u009f«.¬gô\u0010ñ¡\u0089-ü\u0090Ýtº),U\"\u009a\u000e½";
                  var19 = "\u001fe¯ö\u001b\u0002A\u0003\u0080(öm]Ê/ |nµ/÷\u0001çm\u009bè\u009f«.¬gô\u0010ñ¡\u0089-ü\u0090Ýtº),U\"\u009a\u000e½".length();
                  var16 = ' ';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String b(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2543;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_gi", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_gi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11868;
      if (k[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_gi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_gi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
