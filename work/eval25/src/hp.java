package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hp extends h1 {
   private static final long b = ess.a(-8634838814750504085L, -8314361864724346386L, MethodHandles.lookup().lookupClass()).a(239617528607876L);
   private static final String g;
   private static final long n;

   final ik W(Object[] var1) {
      _xx var2 = (_xx)var1[0];
      te var5 = (te)var1[1];
      _y4 var3 = (_y4)var1[2];
      _y4 var4 = (_y4)var1[3];
      long var6 = (Long)var1[4];
      long var10001 = var6 ^ 26356651888739L;
      int var8 = (int)((var6 ^ 26356651888739L) >>> 48);
      int var9 = (int)((var6 ^ 26356651888739L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      return new ik(this, var2, var5, (char)var8, var3, var9, var4, var10);
   }

   hp(h8 var1, int var2, String var3, long var4, _xx var6, te var7, _y4 var8, PrintWriter var9, _y4 var10) {
      var4 = b ^ var4;
      long var11 = var4 ^ 109622557687305L;
      super(var1, var11, var2, var3, var6, var7, var8, var9, var10, g);
   }

   final void B(Object[] param1) {
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
      // 00a: istore 9
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 8
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 6
      // 022: dup
      // 023: bipush 3
      // 024: aaload
      // 025: checkcast com/zelix/yg
      // 028: astore 5
      // 02a: dup
      // 02b: bipush 4
      // 02c: aaload
      // 02d: checkcast com/zelix/_8c
      // 030: astore 4
      // 032: dup
      // 033: bipush 5
      // 034: aaload
      // 035: checkcast java/util/List
      // 038: astore 10
      // 03a: dup
      // 03b: bipush 6
      // 03d: aaload
      // 03e: checkcast com/zelix/te
      // 041: astore 2
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast com/zelix/_y4
      // 049: astore 3
      // 04a: pop
      // 04b: getstatic com/zelix/hp.b J
      // 04e: lload 6
      // 050: lxor
      // 051: lstore 6
      // 053: lload 6
      // 055: dup2
      // 056: ldc2_w 12656194515315
      // 059: lxor
      // 05a: lstore 11
      // 05c: dup2
      // 05d: ldc2_w 59171704715102
      // 060: lxor
      // 061: lstore 13
      // 063: dup2
      // 064: ldc2_w 99717700885354
      // 067: lxor
      // 068: lstore 15
      // 06a: dup2
      // 06b: ldc2_w 94481328351187
      // 06e: lxor
      // 06f: lstore 17
      // 071: dup2
      // 072: ldc2_w 125610707565212
      // 075: lxor
      // 076: lstore 19
      // 078: dup2
      // 079: ldc2_w 89021234378534
      // 07c: lxor
      // 07d: lstore 21
      // 07f: dup2
      // 080: ldc2_w 71001870414658
      // 083: lxor
      // 084: dup2
      // 085: bipush 32
      // 087: lushr
      // 088: l2i
      // 089: istore 23
      // 08b: dup2
      // 08c: bipush 32
      // 08e: lshl
      // 08f: bipush 48
      // 091: lushr
      // 092: l2i
      // 093: istore 24
      // 095: dup2
      // 096: bipush 48
      // 098: lshl
      // 099: bipush 48
      // 09b: lushr
      // 09c: l2i
      // 09d: istore 25
      // 09f: pop2
      // 0a0: dup2
      // 0a1: ldc2_w 29994965444774
      // 0a4: lxor
      // 0a5: dup2
      // 0a6: bipush 32
      // 0a8: lushr
      // 0a9: lstore 26
      // 0ab: dup2
      // 0ac: bipush 32
      // 0ae: lshl
      // 0af: bipush 32
      // 0b1: lushr
      // 0b2: l2i
      // 0b3: istore 28
      // 0b5: pop2
      // 0b6: dup2
      // 0b7: ldc2_w 121690896402987
      // 0ba: lxor
      // 0bb: lstore 29
      // 0bd: dup2
      // 0be: ldc2_w 74317153685241
      // 0c1: lxor
      // 0c2: lstore 31
      // 0c4: dup2
      // 0c5: ldc2_w 78675772300459
      // 0c8: lxor
      // 0c9: lstore 33
      // 0cb: pop2
      // 0cc: ldc2_w 934421965155024029
      // 0cf: lload 6
      // 0d1: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: istore 36
      // 0d8: aload 0
      // 0d9: getfield com/zelix/hp.H Z
      // 0dc: ifne 0eb
      // 0df: return
      // 0e0: ldc2_w 1275393973486084130
      // 0e3: lload 6
      // 0e5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: new com/zelix/_y4
      // 0ee: dup
      // 0ef: lload 31
      // 0f1: iload 8
      // 0f3: invokespecial com/zelix/_y4.<init> (JI)V
      // 0f6: astore 37
      // 0f8: aload 0
      // 0f9: getfield com/zelix/hp.w [Lcom/zelix/ik;
      // 0fc: astore 38
      // 0fe: aload 38
      // 100: arraylength
      // 101: istore 39
      // 103: bipush 0
      // 104: istore 40
      // 106: iload 40
      // 108: iload 39
      // 10a: if_icmpge 138
      // 10d: aload 38
      // 10f: iload 40
      // 111: aaload
      // 112: astore 41
      // 114: aload 37
      // 116: aload 41
      // 118: bipush 0
      // 119: anewarray 36
      // 11c: ldc2_w 1621024428613819470
      // 11f: lload 6
      // 121: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 129: aload 41
      // 12b: lload 15
      // 12d: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 130: iinc 40 1
      // 133: iload 36
      // 135: ifne 106
      // 138: aload 2
      // 139: lload 21
      // 13b: bipush 1
      // 13c: anewarray 36
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 0
      // 146: swap
      // 147: aastore
      // 148: ldc2_w 1479877677481164124
      // 14b: lload 6
      // 14d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: istore 38
      // 154: bipush 0
      // 155: istore 39
      // 157: bipush 0
      // 158: istore 40
      // 15a: iload 40
      // 15c: iload 38
      // 15e: if_icmpge 2fa
      // 161: aload 37
      // 163: iload 40
      // 165: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 168: iload 23
      // 16a: swap
      // 16b: iload 24
      // 16d: i2s
      // 16e: swap
      // 16f: iload 25
      // 171: i2c
      // 172: swap
      // 173: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 176: iload 36
      // 178: ifeq 303
      // 17b: ifne 2f2
      // 17e: goto 18c
      // 181: ldc2_w 1275393973486084130
      // 184: lload 6
      // 186: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: aload 2
      // 18d: lload 26
      // 18f: iload 40
      // 191: iload 28
      // 193: invokevirtual com/zelix/te.T (JII)Lcom/zelix/vi;
      // 196: astore 41
      // 198: iload 36
      // 19a: ifeq 2f5
      // 19d: aload 41
      // 19f: ifnull 2f2
      // 1a2: goto 1b0
      // 1a5: ldc2_w 1275393973486084130
      // 1a8: lload 6
      // 1aa: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: aload 41
      // 1b2: ldc2_w 1162680068585124146
      // 1b5: lload 6
      // 1b7: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: iload 36
      // 1be: ifeq 209
      // 1c1: goto 1cf
      // 1c4: ldc2_w 1275393973486084130
      // 1c7: lload 6
      // 1c9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: ifne 2f2
      // 1d2: goto 1e0
      // 1d5: ldc2_w 1275393973486084130
      // 1d8: lload 6
      // 1da: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: aload 41
      // 1e2: lload 11
      // 1e4: bipush 1
      // 1e5: anewarray 36
      // 1e8: dup_x2
      // 1e9: dup_x2
      // 1ea: pop
      // 1eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ee: bipush 0
      // 1ef: swap
      // 1f0: aastore
      // 1f1: ldc2_w 1103142064087380151
      // 1f4: lload 6
      // 1f6: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: goto 209
      // 1fe: ldc2_w 1275393973486084130
      // 201: lload 6
      // 203: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: ifeq 2f2
      // 20c: new com/zelix/pg
      // 20f: dup
      // 210: lload 29
      // 212: invokespecial com/zelix/pg.<init> (J)V
      // 215: astore 42
      // 217: aload 5
      // 219: iload 40
      // 21b: aload 42
      // 21d: lload 13
      // 21f: bipush 3
      // 220: anewarray 36
      // 223: dup_x2
      // 224: dup_x2
      // 225: pop
      // 226: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 229: bipush 2
      // 22a: swap
      // 22b: aastore
      // 22c: dup_x1
      // 22d: swap
      // 22e: bipush 1
      // 22f: swap
      // 230: aastore
      // 231: dup_x1
      // 232: swap
      // 233: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 236: bipush 0
      // 237: swap
      // 238: aastore
      // 239: ldc2_w 1109670371504682607
      // 23c: lload 6
      // 23e: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/wo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: astore 43
      // 245: aload 42
      // 247: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 24a: checkcast java/lang/String
      // 24d: astore 44
      // 24f: iload 36
      // 251: lload 6
      // 253: lconst_0
      // 254: lcmp
      // 255: iflt 2f7
      // 258: ifeq 2f5
      // 25b: aload 43
      // 25d: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 260: checkcast java/lang/Integer
      // 263: invokevirtual java/lang/Integer.intValue ()I
      // 266: bipush -1
      // 267: if_icmple 2f2
      // 26a: goto 278
      // 26d: ldc2_w 1275393973486084130
      // 270: lload 6
      // 272: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: athrow
      // 278: aload 43
      // 27a: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 27d: checkcast java/lang/Integer
      // 280: invokevirtual java/lang/Integer.intValue ()I
      // 283: bipush -1
      // 284: if_icmple 2f2
      // 287: goto 295
      // 28a: ldc2_w 1275393973486084130
      // 28d: lload 6
      // 28f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: athrow
      // 295: aload 44
      // 297: ifnull 2f2
      // 29a: goto 2a8
      // 29d: ldc2_w 1275393973486084130
      // 2a0: lload 6
      // 2a2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: athrow
      // 2a8: new com/zelix/ik
      // 2ab: dup
      // 2ac: aload 0
      // 2ad: aload 43
      // 2af: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 2b2: checkcast java/lang/Integer
      // 2b5: invokevirtual java/lang/Integer.intValue ()I
      // 2b8: lload 17
      // 2ba: dup2_x1
      // 2bb: pop2
      // 2bc: aload 43
      // 2be: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 2c1: checkcast java/lang/Integer
      // 2c4: invokevirtual java/lang/Integer.intValue ()I
      // 2c7: aload 4
      // 2c9: ldc "a"
      // 2cb: aload 10
      // 2cd: invokevirtual com/zelix/_8c.Y (Ljava/lang/String;Ljava/util/List;)Lcom/zelix/mx;
      // 2d0: aload 4
      // 2d2: aload 44
      // 2d4: aload 10
      // 2d6: invokevirtual com/zelix/_8c.Y (Ljava/lang/String;Ljava/util/List;)Lcom/zelix/mx;
      // 2d9: aload 41
      // 2db: aload 3
      // 2dc: invokespecial com/zelix/ik.<init> (Lcom/zelix/h8;JIILcom/zelix/mx;Lcom/zelix/mx;Lcom/zelix/lu;Lcom/zelix/_y4;)V
      // 2df: astore 45
      // 2e1: aload 37
      // 2e3: iload 40
      // 2e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e8: aload 45
      // 2ea: lload 15
      // 2ec: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 2ef: bipush 1
      // 2f0: istore 39
      // 2f2: iinc 40 1
      // 2f5: iload 36
      // 2f7: ifne 15a
      // 2fa: lload 6
      // 2fc: lconst_0
      // 2fd: lcmp
      // 2fe: ifle 161
      // 301: iload 39
      // 303: ifeq 412
      // 306: new java/util/ArrayList
      // 309: dup
      // 30a: aload 37
      // 30c: lload 33
      // 30e: bipush 1
      // 30f: anewarray 36
      // 312: dup_x2
      // 313: dup_x2
      // 314: pop
      // 315: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 318: bipush 0
      // 319: swap
      // 31a: aastore
      // 31b: ldc2_w 1520599595690076005
      // 31e: lload 6
      // 320: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 325: invokespecial java/util/ArrayList.<init> (I)V
      // 328: astore 40
      // 32a: bipush 0
      // 32b: istore 41
      // 32d: iload 41
      // 32f: iload 8
      // 331: if_icmpge 3db
      // 334: iload 36
      // 336: ifeq 403
      // 339: aload 37
      // 33b: iload 41
      // 33d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 340: iload 36
      // 342: ifeq 381
      // 345: goto 353
      // 348: ldc2_w 1275393973486084130
      // 34b: lload 6
      // 34d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: athrow
      // 353: astore 35
      // 355: iload 23
      // 357: lload 6
      // 359: lconst_0
      // 35a: lcmp
      // 35b: ifle 370
      // 35e: iload 24
      // 360: i2s
      // 361: iload 25
      // 363: i2c
      // 364: aload 35
      // 366: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 369: ifeq 3d3
      // 36c: aload 37
      // 36e: iload 41
      // 370: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 373: goto 381
      // 376: ldc2_w 1275393973486084130
      // 379: lload 6
      // 37b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: athrow
      // 381: lload 19
      // 383: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 386: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 38b: astore 42
      // 38d: aload 42
      // 38f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 394: ifeq 3d3
      // 397: aload 42
      // 399: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 39e: checkcast com/zelix/ik
      // 3a1: astore 43
      // 3a3: aload 40
      // 3a5: aload 43
      // 3a7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3ac: pop
      // 3ad: iload 36
      // 3af: lload 6
      // 3b1: lconst_0
      // 3b2: lcmp
      // 3b3: iflt 3d8
      // 3b6: ifeq 3d6
      // 3b9: iload 36
      // 3bb: ifne 38d
      // 3be: lload 6
      // 3c0: lconst_0
      // 3c1: lcmp
      // 3c2: iflt 3ad
      // 3c5: goto 3d3
      // 3c8: ldc2_w 1275393973486084130
      // 3cb: lload 6
      // 3cd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d2: athrow
      // 3d3: iinc 41 1
      // 3d6: iload 36
      // 3d8: ifne 32d
      // 3db: aload 0
      // 3dc: aload 40
      // 3de: aload 40
      // 3e0: invokeinterface java/util/List.size ()I 1
      // 3e5: anewarray 186
      // 3e8: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 3ed: checkcast [Lcom/zelix/ik;
      // 3f0: putfield com/zelix/hp.w [Lcom/zelix/ik;
      // 3f3: aload 0
      // 3f4: aload 0
      // 3f5: getfield com/zelix/hp.w [Lcom/zelix/ik;
      // 3f8: arraylength
      // 3f9: putfield com/zelix/hp.m I
      // 3fc: lload 6
      // 3fe: lconst_0
      // 3ff: lcmp
      // 400: ifle 334
      // 403: aload 0
      // 404: aload 0
      // 405: getfield com/zelix/hp.m I
      // 408: getstatic com/zelix/hp.n J
      // 40b: l2i
      // 40c: imul
      // 40d: bipush 2
      // 40e: iadd
      // 40f: putfield com/zelix/hp.C I
      // 412: return
   }

   static {
      long var5 = b ^ 128663926758317L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal(
         "¿Ñ|½À¶Ð¼ÿ\u0097\u0080É4\u0094\u008b\u0002 \u0001>HjêFº\r\u0007|4 \u0093\u009e\u0099í\u0099\u0088\u0002»VÍ\u0083".getBytes("ISO-8859-1")
      );
      String var12 = d(var9).intern();
      byte var10001 = -1;
      g = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -6710634598633807974L;
      byte[] var4 = var0.doFinal(
         new byte[]{
            (byte)((int)(var2 >>> 56)),
            (byte)((int)(var2 >>> 48)),
            (byte)((int)(var2 >>> 40)),
            (byte)((int)(var2 >>> 32)),
            (byte)((int)(var2 >>> 24)),
            (byte)((int)(var2 >>> 16)),
            (byte)((int)(var2 >>> 8)),
            (byte)((int)var2)
         }
      );
      long var14 = ((long)var4[0] & 255L) << 56
         | ((long)var4[1] & 255L) << 48
         | ((long)var4[2] & 255L) << 40
         | ((long)var4[3] & 255L) << 32
         | ((long)var4[4] & 255L) << 24
         | ((long)var4[5] & 255L) << 16
         | ((long)var4[6] & 255L) << 8
         | (long)var4[7] & 255L;
      var10001 = -1;
      n = var14;
   }

   private static gj b(gj var0) {
      return var0;
   }

   private static String d(byte[] var0) {
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
}
