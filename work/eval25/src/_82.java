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

public abstract class _82 {
   Integer q;
   String a;
   ae b;
   mv[] I;
   boolean X;
   static final String[] j;
   boolean x;
   boolean B;
   static String Z;
   String O;
   private static final long d = ess.a(1253255510734884850L, 5160663627250984368L, MethodHandles.lookup().lookupClass()).a(118207056190384L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g = new HashMap(13);
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;

   private void b(Object[] param1) {
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
      // 004: checkcast java/lang/StringBuffer
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/a7
      // 020: astore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/am
      // 028: astore 7
      // 02a: pop
      // 02b: getstatic com/zelix/_82.d J
      // 02e: lload 3
      // 02f: lxor
      // 030: lstore 3
      // 031: lload 3
      // 032: dup2
      // 033: ldc2_w 56848693271094
      // 036: lxor
      // 037: lstore 8
      // 039: dup2
      // 03a: ldc2_w 29339246384756
      // 03d: lxor
      // 03e: lstore 10
      // 040: dup2
      // 041: ldc2_w 774641734011
      // 044: lxor
      // 045: lstore 12
      // 047: dup2
      // 048: ldc2_w 127075647563502
      // 04b: lxor
      // 04c: lstore 14
      // 04e: dup2
      // 04f: ldc2_w 128690893650872
      // 052: lxor
      // 053: lstore 16
      // 055: dup2
      // 056: ldc2_w 90335915173109
      // 059: lxor
      // 05a: lstore 18
      // 05c: dup2
      // 05d: ldc2_w 73445592704013
      // 060: lxor
      // 061: lstore 20
      // 063: pop2
      // 064: ldc2_w -8261270554886212133
      // 067: lload 3
      // 068: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aconst_null
      // 06e: astore 23
      // 070: bipush 0
      // 071: istore 24
      // 073: astore 22
      // 075: aload 6
      // 077: sipush 1544
      // 07a: ldc2_w 5530452416693882764
      // 07d: lload 3
      // 07e: lxor
      // 07f: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 087: istore 25
      // 089: iload 25
      // 08b: aload 22
      // 08d: ifnull 0cd
      // 090: ifle 5ba
      // 093: goto 0a0
      // 096: ldc2_w -7663500691678930188
      // 099: lload 3
      // 09a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 6
      // 0a2: ldc "\""
      // 0a4: iload 25
      // 0a6: sipush 1544
      // 0a9: ldc2_w 5530452416693882764
      // 0ac: lload 3
      // 0ad: lxor
      // 0ae: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: invokevirtual java/lang/String.length ()I
      // 0b6: iadd
      // 0b7: ldc2_w -7537525007412010774
      // 0ba: lload 3
      // 0bb: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: goto 0cd
      // 0c3: ldc2_w -7663500691678930188
      // 0c6: lload 3
      // 0c7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: istore 26
      // 0cf: iload 26
      // 0d1: bipush -1
      // 0d2: if_icmple 5ba
      // 0d5: aload 6
      // 0d7: iload 25
      // 0d9: sipush 1544
      // 0dc: ldc2_w 5530452416693882764
      // 0df: lload 3
      // 0e0: lxor
      // 0e1: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: invokevirtual java/lang/String.length ()I
      // 0e9: iadd
      // 0ea: iload 26
      // 0ec: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ef: astore 23
      // 0f1: aload 23
      // 0f3: sipush 929
      // 0f6: ldc2_w 1491262918299402583
      // 0f9: lload 3
      // 0fa: lxor
      // 0fb: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual java/lang/String.indexOf (I)I
      // 103: istore 27
      // 105: iload 27
      // 107: aload 22
      // 109: ifnull 13c
      // 10c: bipush 1
      // 10d: if_icmple 5ba
      // 110: goto 11d
      // 113: ldc2_w -7663500691678930188
      // 116: lload 3
      // 117: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: aload 23
      // 11f: sipush 16121
      // 122: ldc2_w 8444558533996379143
      // 125: lload 3
      // 126: lxor
      // 127: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: invokevirtual java/lang/String.indexOf (I)I
      // 12f: goto 13c
      // 132: ldc2_w -7663500691678930188
      // 135: lload 3
      // 136: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: istore 28
      // 13e: iload 28
      // 140: aload 23
      // 142: invokevirtual java/lang/String.length ()I
      // 145: bipush 1
      // 146: isub
      // 147: if_icmpne 5ba
      // 14a: aload 23
      // 14c: bipush 0
      // 14d: iload 27
      // 14f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 152: astore 29
      // 154: aload 29
      // 156: ldc "."
      // 158: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 15b: istore 30
      // 15d: iload 30
      // 15f: aload 22
      // 161: ifnull 176
      // 164: ifle 5ba
      // 167: goto 174
      // 16a: ldc2_w -7663500691678930188
      // 16d: lload 3
      // 16e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: iload 30
      // 176: aload 29
      // 178: invokevirtual java/lang/String.length ()I
      // 17b: bipush 1
      // 17c: isub
      // 17d: if_icmpge 5ba
      // 180: aload 29
      // 182: bipush 0
      // 183: iload 30
      // 185: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 188: astore 31
      // 18a: aload 29
      // 18c: iload 30
      // 18e: bipush 1
      // 18f: iadd
      // 190: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 193: astore 32
      // 195: aload 23
      // 197: iload 27
      // 199: bipush 1
      // 19a: iadd
      // 19b: iload 28
      // 19d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1a0: astore 33
      // 1a2: new java/lang/StringBuilder
      // 1a5: dup
      // 1a6: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a9: astore 34
      // 1ab: new java/util/StringTokenizer
      // 1ae: dup
      // 1af: aload 33
      // 1b1: sipush 15549
      // 1b4: ldc2_w 7068844390293501238
      // 1b7: lload 3
      // 1b8: lxor
      // 1b9: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1c1: astore 35
      // 1c3: aload 35
      // 1c5: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 1c8: ifeq 258
      // 1cb: aload 5
      // 1cd: aload 35
      // 1cf: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 1d2: lload 20
      // 1d4: dup2_x1
      // 1d5: pop2
      // 1d6: bipush 2
      // 1d7: anewarray 402
      // 1da: dup_x1
      // 1db: swap
      // 1dc: bipush 1
      // 1dd: swap
      // 1de: aastore
      // 1df: dup_x2
      // 1e0: dup_x2
      // 1e1: pop
      // 1e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e5: bipush 0
      // 1e6: swap
      // 1e7: aastore
      // 1e8: ldc2_w -7898453402082309641
      // 1eb: lload 3
      // 1ec: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: astore 36
      // 1f3: lload 3
      // 1f4: lconst_0
      // 1f5: lcmp
      // 1f6: ifle 206
      // 1f9: aload 34
      // 1fb: aload 36
      // 1fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 200: aload 22
      // 202: ifnull 252
      // 205: pop
      // 206: aload 35
      // 208: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 20b: lload 3
      // 20c: lconst_0
      // 20d: lcmp
      // 20e: ifle 5d9
      // 211: aload 22
      // 213: ifnull 5d9
      // 216: goto 223
      // 219: ldc2_w -7663500691678930188
      // 21c: lload 3
      // 21d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: athrow
      // 223: ifeq 253
      // 226: goto 233
      // 229: ldc2_w -7663500691678930188
      // 22c: lload 3
      // 22d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: aload 34
      // 235: sipush 12336
      // 238: ldc2_w 9147696133063735742
      // 23b: lload 3
      // 23c: lxor
      // 23d: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 245: goto 252
      // 248: ldc2_w -7663500691678930188
      // 24b: lload 3
      // 24c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: athrow
      // 252: pop
      // 253: aload 22
      // 255: ifnonnull 1c3
      // 258: aload 5
      // 25a: aload 31
      // 25c: lload 18
      // 25e: bipush 2
      // 25f: anewarray 402
      // 262: dup_x2
      // 263: dup_x2
      // 264: pop
      // 265: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 268: bipush 1
      // 269: swap
      // 26a: aastore
      // 26b: dup_x1
      // 26c: swap
      // 26d: bipush 0
      // 26e: swap
      // 26f: aastore
      // 270: ldc2_w -7806561369640480400
      // 273: lload 3
      // 274: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: astore 36
      // 27b: aload 36
      // 27d: lload 3
      // 27e: lconst_0
      // 27f: lcmp
      // 280: ifle 1f1
      // 283: aload 22
      // 285: ifnull 29a
      // 288: ifnonnull 29c
      // 28b: goto 298
      // 28e: ldc2_w -7663500691678930188
      // 291: lload 3
      // 292: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: athrow
      // 298: aload 31
      // 29a: astore 36
      // 29c: aload 7
      // 29e: ifnull 492
      // 2a1: aconst_null
      // 2a2: astore 37
      // 2a4: aload 7
      // 2a6: aload 31
      // 2a8: bipush 1
      // 2a9: anewarray 402
      // 2ac: dup_x1
      // 2ad: swap
      // 2ae: bipush 0
      // 2af: swap
      // 2b0: aastore
      // 2b1: ldc2_w -8177130541528659764
      // 2b4: lload 3
      // 2b5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: lload 12
      // 2bc: dup2_x1
      // 2bd: pop2
      // 2be: bipush 2
      // 2bf: anewarray 402
      // 2c2: dup_x1
      // 2c3: swap
      // 2c4: bipush 1
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x2
      // 2c8: dup_x2
      // 2c9: pop
      // 2ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2cd: bipush 0
      // 2ce: swap
      // 2cf: aastore
      // 2d0: ldc2_w -7852351396266152921
      // 2d3: lload 3
      // 2d4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: astore 37
      // 2db: goto 2e0
      // 2de: astore 38
      // 2e0: aload 37
      // 2e2: ifnull 48d
      // 2e5: aload 0
      // 2e6: aload 37
      // 2e8: aload 32
      // 2ea: aload 33
      // 2ec: lload 8
      // 2ee: aload 7
      // 2f0: bipush 5
      // 2f1: anewarray 402
      // 2f4: dup_x1
      // 2f5: swap
      // 2f6: bipush 4
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x2
      // 2fa: dup_x2
      // 2fb: pop
      // 2fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ff: bipush 3
      // 300: swap
      // 301: aastore
      // 302: dup_x1
      // 303: swap
      // 304: bipush 2
      // 305: swap
      // 306: aastore
      // 307: dup_x1
      // 308: swap
      // 309: bipush 1
      // 30a: swap
      // 30b: aastore
      // 30c: dup_x1
      // 30d: swap
      // 30e: bipush 0
      // 30f: swap
      // 310: aastore
      // 311: ldc2_w -7878846075659618337
      // 314: lload 3
      // 315: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: astore 38
      // 31c: aload 38
      // 31e: aload 22
      // 320: lload 3
      // 321: lconst_0
      // 322: lcmp
      // 323: iflt 33d
      // 326: ifnull 33b
      // 329: ifnull 48d
      // 32c: goto 339
      // 32f: ldc2_w -7663500691678930188
      // 332: lload 3
      // 333: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: athrow
      // 339: aload 38
      // 33b: aload 22
      // 33d: ifnull 361
      // 340: arraylength
      // 341: bipush 1
      // 342: if_icmpne 48d
      // 345: goto 352
      // 348: ldc2_w -7663500691678930188
      // 34b: lload 3
      // 34c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: athrow
      // 352: aload 38
      // 354: goto 361
      // 357: ldc2_w -7663500691678930188
      // 35a: lload 3
      // 35b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 360: athrow
      // 361: bipush 0
      // 362: aaload
      // 363: astore 39
      // 365: aload 39
      // 367: invokevirtual com/zelix/iu.k ()Z
      // 36a: ifeq 48d
      // 36d: aload 5
      // 36f: aload 39
      // 371: lload 10
      // 373: bipush 1
      // 374: anewarray 402
      // 377: dup_x2
      // 378: dup_x2
      // 379: pop
      // 37a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37d: bipush 0
      // 37e: swap
      // 37f: aastore
      // 380: ldc2_w -7908028143060400921
      // 383: lload 3
      // 384: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 389: lload 18
      // 38b: bipush 2
      // 38c: anewarray 402
      // 38f: dup_x2
      // 390: dup_x2
      // 391: pop
      // 392: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 395: bipush 1
      // 396: swap
      // 397: aastore
      // 398: dup_x1
      // 399: swap
      // 39a: bipush 0
      // 39b: swap
      // 39c: aastore
      // 39d: ldc2_w -7806561369640480400
      // 3a0: lload 3
      // 3a1: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: astore 40
      // 3a8: aload 5
      // 3aa: aload 40
      // 3ac: aload 32
      // 3ae: aconst_null
      // 3af: aload 34
      // 3b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b4: lload 14
      // 3b6: dup2_x1
      // 3b7: pop2
      // 3b8: bipush 5
      // 3b9: anewarray 402
      // 3bc: dup_x1
      // 3bd: swap
      // 3be: bipush 4
      // 3bf: swap
      // 3c0: aastore
      // 3c1: dup_x2
      // 3c2: dup_x2
      // 3c3: pop
      // 3c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c7: bipush 3
      // 3c8: swap
      // 3c9: aastore
      // 3ca: dup_x1
      // 3cb: swap
      // 3cc: bipush 2
      // 3cd: swap
      // 3ce: aastore
      // 3cf: dup_x1
      // 3d0: swap
      // 3d1: bipush 1
      // 3d2: swap
      // 3d3: aastore
      // 3d4: dup_x1
      // 3d5: swap
      // 3d6: bipush 0
      // 3d7: swap
      // 3d8: aastore
      // 3d9: ldc2_w -8129286974126619603
      // 3dc: lload 3
      // 3dd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: astore 41
      // 3e4: aload 2
      // 3e5: aload 6
      // 3e7: bipush 0
      // 3e8: iload 25
      // 3ea: sipush 1544
      // 3ed: ldc2_w 5530452416693882764
      // 3f0: lload 3
      // 3f1: lxor
      // 3f2: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f7: invokevirtual java/lang/String.length ()I
      // 3fa: iadd
      // 3fb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 3fe: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 401: pop
      // 402: aload 2
      // 403: aload 36
      // 405: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 408: pop
      // 409: aload 2
      // 40a: ldc "."
      // 40c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 40f: pop
      // 410: aload 2
      // 411: aload 41
      // 413: bipush 0
      // 414: aaload
      // 415: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 418: pop
      // 419: aload 2
      // 41a: sipush 24637
      // 41d: ldc2_w 2830526370030330564
      // 420: lload 3
      // 421: lxor
      // 422: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 427: ldc2_w -8115328059016780576
      // 42a: lload 3
      // 42b: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 430: pop
      // 431: aload 2
      // 432: aload 34
      // 434: ldc2_w -7977934530705804265
      // 437: lload 3
      // 438: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43d: pop
      // 43e: aload 2
      // 43f: sipush 4793
      // 442: ldc2_w 5504710396148240462
      // 445: lload 3
      // 446: lxor
      // 447: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44c: ldc2_w -8115328059016780576
      // 44f: lload 3
      // 450: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 455: pop
      // 456: aload 0
      // 457: aload 2
      // 458: aload 6
      // 45a: iload 26
      // 45c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 45f: lload 16
      // 461: dup2_x1
      // 462: pop2
      // 463: aload 5
      // 465: bipush 4
      // 466: anewarray 402
      // 469: dup_x1
      // 46a: swap
      // 46b: bipush 3
      // 46c: swap
      // 46d: aastore
      // 46e: dup_x1
      // 46f: swap
      // 470: bipush 2
      // 471: swap
      // 472: aastore
      // 473: dup_x2
      // 474: dup_x2
      // 475: pop
      // 476: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 479: bipush 1
      // 47a: swap
      // 47b: aastore
      // 47c: dup_x1
      // 47d: swap
      // 47e: bipush 0
      // 47f: swap
      // 480: aastore
      // 481: ldc2_w -8350519038852794037
      // 484: lload 3
      // 485: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48a: bipush 1
      // 48b: istore 24
      // 48d: aload 22
      // 48f: ifnonnull 5ba
      // 492: aload 5
      // 494: aload 36
      // 496: aload 32
      // 498: aconst_null
      // 499: aload 34
      // 49b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49e: lload 14
      // 4a0: dup2_x1
      // 4a1: pop2
      // 4a2: bipush 5
      // 4a3: anewarray 402
      // 4a6: dup_x1
      // 4a7: swap
      // 4a8: bipush 4
      // 4a9: swap
      // 4aa: aastore
      // 4ab: dup_x2
      // 4ac: dup_x2
      // 4ad: pop
      // 4ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b1: bipush 3
      // 4b2: swap
      // 4b3: aastore
      // 4b4: dup_x1
      // 4b5: swap
      // 4b6: bipush 2
      // 4b7: swap
      // 4b8: aastore
      // 4b9: dup_x1
      // 4ba: swap
      // 4bb: bipush 1
      // 4bc: swap
      // 4bd: aastore
      // 4be: dup_x1
      // 4bf: swap
      // 4c0: bipush 0
      // 4c1: swap
      // 4c2: aastore
      // 4c3: ldc2_w -8129286974126619603
      // 4c6: lload 3
      // 4c7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cc: astore 37
      // 4ce: aload 37
      // 4d0: lload 3
      // 4d1: lconst_0
      // 4d2: lcmp
      // 4d3: iflt 4ed
      // 4d6: aload 22
      // 4d8: ifnull 4ed
      // 4db: ifnull 5ba
      // 4de: goto 4eb
      // 4e1: ldc2_w -7663500691678930188
      // 4e4: lload 3
      // 4e5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ea: athrow
      // 4eb: aload 37
      // 4ed: arraylength
      // 4ee: aload 22
      // 4f0: ifnull 5b8
      // 4f3: bipush 1
      // 4f4: if_icmpne 5ba
      // 4f7: goto 504
      // 4fa: ldc2_w -7663500691678930188
      // 4fd: lload 3
      // 4fe: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 503: athrow
      // 504: aload 2
      // 505: aload 6
      // 507: bipush 0
      // 508: iload 25
      // 50a: sipush 1544
      // 50d: ldc2_w 5530452416693882764
      // 510: lload 3
      // 511: lxor
      // 512: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 517: invokevirtual java/lang/String.length ()I
      // 51a: iadd
      // 51b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 51e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 521: pop
      // 522: aload 2
      // 523: aload 36
      // 525: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 528: pop
      // 529: aload 2
      // 52a: ldc "."
      // 52c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 52f: pop
      // 530: aload 2
      // 531: aload 37
      // 533: bipush 0
      // 534: aaload
      // 535: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 538: pop
      // 539: aload 2
      // 53a: sipush 24637
      // 53d: ldc2_w 2830526370030330564
      // 540: lload 3
      // 541: lxor
      // 542: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 547: ldc2_w -8115328059016780576
      // 54a: lload 3
      // 54b: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 550: pop
      // 551: aload 2
      // 552: aload 34
      // 554: ldc2_w -7977934530705804265
      // 557: lload 3
      // 558: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55d: pop
      // 55e: aload 2
      // 55f: sipush 4793
      // 562: ldc2_w 5504710396148240462
      // 565: lload 3
      // 566: lxor
      // 567: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56c: ldc2_w -8115328059016780576
      // 56f: lload 3
      // 570: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 575: pop
      // 576: aload 0
      // 577: aload 2
      // 578: aload 6
      // 57a: iload 26
      // 57c: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 57f: lload 16
      // 581: dup2_x1
      // 582: pop2
      // 583: aload 5
      // 585: bipush 4
      // 586: anewarray 402
      // 589: dup_x1
      // 58a: swap
      // 58b: bipush 3
      // 58c: swap
      // 58d: aastore
      // 58e: dup_x1
      // 58f: swap
      // 590: bipush 2
      // 591: swap
      // 592: aastore
      // 593: dup_x2
      // 594: dup_x2
      // 595: pop
      // 596: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 599: bipush 1
      // 59a: swap
      // 59b: aastore
      // 59c: dup_x1
      // 59d: swap
      // 59e: bipush 0
      // 59f: swap
      // 5a0: aastore
      // 5a1: ldc2_w -8350519038852794037
      // 5a4: lload 3
      // 5a5: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5aa: bipush 1
      // 5ab: goto 5b8
      // 5ae: ldc2_w -7663500691678930188
      // 5b1: lload 3
      // 5b2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b7: athrow
      // 5b8: istore 24
      // 5ba: goto 5bf
      // 5bd: astore 25
      // 5bf: lload 3
      // 5c0: lconst_0
      // 5c1: lcmp
      // 5c2: ifle 609
      // 5c5: aload 23
      // 5c7: ifnull 5dc
      // 5ca: iload 24
      // 5cc: goto 5d9
      // 5cf: ldc2_w -7663500691678930188
      // 5d2: lload 3
      // 5d3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d8: athrow
      // 5d9: ifne 616
      // 5dc: aload 0
      // 5dd: aload 2
      // 5de: lload 16
      // 5e0: aload 6
      // 5e2: aload 5
      // 5e4: bipush 4
      // 5e5: anewarray 402
      // 5e8: dup_x1
      // 5e9: swap
      // 5ea: bipush 3
      // 5eb: swap
      // 5ec: aastore
      // 5ed: dup_x1
      // 5ee: swap
      // 5ef: bipush 2
      // 5f0: swap
      // 5f1: aastore
      // 5f2: dup_x2
      // 5f3: dup_x2
      // 5f4: pop
      // 5f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f8: bipush 1
      // 5f9: swap
      // 5fa: aastore
      // 5fb: dup_x1
      // 5fc: swap
      // 5fd: bipush 0
      // 5fe: swap
      // 5ff: aastore
      // 600: ldc2_w -8350519038852794037
      // 603: lload 3
      // 604: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 609: goto 616
      // 60c: ldc2_w -7663500691678930188
      // 60f: lload 3
      // 610: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 615: athrow
      // 616: return
   }

   boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 31322312713982L;
      return x44.a<"o">(x44.a<"k">(this, -1301740674760362852L, var2), new Object[]{var4}, -986832591417688321L, var2);
   }

   private void Y(Object[] param1) {
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
      // 004: checkcast java/lang/StringBuffer
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 6
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/a7
      // 020: astore 5
      // 022: pop
      // 023: getstatic com/zelix/_82.d J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 99569390747911
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 55413458085074
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 21844498015945
      // 03c: lxor
      // 03d: lstore 11
      // 03f: dup2
      // 040: ldc2_w 3549989676593
      // 043: lxor
      // 044: lstore 13
      // 046: pop2
      // 047: ldc2_w -8113705570282375193
      // 04a: lload 3
      // 04b: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: new java/util/StringTokenizer
      // 053: dup
      // 054: aload 6
      // 056: sipush 10346
      // 059: ldc2_w 1190443280429769691
      // 05c: lload 3
      // 05d: lxor
      // 05e: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: bipush 1
      // 064: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 067: astore 16
      // 069: astore 15
      // 06b: new java/util/ArrayList
      // 06e: dup
      // 06f: aload 16
      // 071: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 074: invokespecial java/util/ArrayList.<init> (I)V
      // 077: astore 17
      // 079: aload 16
      // 07b: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 07e: ifeq 0b5
      // 081: aload 16
      // 083: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 086: astore 18
      // 088: lload 3
      // 089: lconst_0
      // 08a: lcmp
      // 08b: iflt 09d
      // 08e: aload 17
      // 090: aload 18
      // 092: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 097: aload 15
      // 099: ifnull 0b6
      // 09c: pop
      // 09d: aload 15
      // 09f: ifnonnull 079
      // 0a2: lload 3
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iflt 088
      // 0a8: goto 0b5
      // 0ab: ldc2_w -7522832926066779960
      // 0ae: lload 3
      // 0af: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: bipush 0
      // 0b6: istore 18
      // 0b8: iload 18
      // 0ba: aload 17
      // 0bc: invokeinterface java/util/List.size ()I 1
      // 0c1: if_icmpge 946
      // 0c4: aload 17
      // 0c6: iload 18
      // 0c8: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0cd: checkcast java/lang/String
      // 0d0: astore 19
      // 0d2: aload 19
      // 0d4: astore 20
      // 0d6: bipush -1
      // 0d7: istore 21
      // 0d9: aload 20
      // 0db: invokevirtual java/lang/String.hashCode ()I
      // 0de: aload 15
      // 0e0: ifnull 2b8
      // 0e3: lookupswitch 467 7 32 185 34 350 40 405 41 240 44 295 58 130 64 75
      // 124: ldc2_w -7522832926066779960
      // 127: lload 3
      // 128: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 20
      // 130: ldc "@"
      // 132: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 135: aload 15
      // 137: ifnull 2b8
      // 13a: goto 147
      // 13d: ldc2_w -7522832926066779960
      // 140: lload 3
      // 141: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: ifeq 2b6
      // 14a: goto 157
      // 14d: ldc2_w -7522832926066779960
      // 150: lload 3
      // 151: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: bipush 0
      // 158: istore 21
      // 15a: lload 3
      // 15b: lconst_0
      // 15c: lcmp
      // 15d: ifle 165
      // 160: aload 15
      // 162: ifnonnull 2b6
      // 165: aload 20
      // 167: ldc ":"
      // 169: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 16c: aload 15
      // 16e: ifnull 2b8
      // 171: goto 17e
      // 174: ldc2_w -7522832926066779960
      // 177: lload 3
      // 178: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: ifeq 2b6
      // 181: goto 18e
      // 184: ldc2_w -7522832926066779960
      // 187: lload 3
      // 188: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: bipush 1
      // 18f: istore 21
      // 191: lload 3
      // 192: lconst_0
      // 193: lcmp
      // 194: ifle 19c
      // 197: aload 15
      // 199: ifnonnull 2b6
      // 19c: aload 20
      // 19e: ldc " "
      // 1a0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a3: aload 15
      // 1a5: ifnull 2b8
      // 1a8: goto 1b5
      // 1ab: ldc2_w -7522832926066779960
      // 1ae: lload 3
      // 1af: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: ifeq 2b6
      // 1b8: goto 1c5
      // 1bb: ldc2_w -7522832926066779960
      // 1be: lload 3
      // 1bf: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: bipush 2
      // 1c6: istore 21
      // 1c8: lload 3
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: iflt 1d3
      // 1ce: aload 15
      // 1d0: ifnonnull 2b6
      // 1d3: aload 20
      // 1d5: ldc ")"
      // 1d7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1da: aload 15
      // 1dc: ifnull 2b8
      // 1df: goto 1ec
      // 1e2: ldc2_w -7522832926066779960
      // 1e5: lload 3
      // 1e6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: ifeq 2b6
      // 1ef: goto 1fc
      // 1f2: ldc2_w -7522832926066779960
      // 1f5: lload 3
      // 1f6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: bipush 3
      // 1fd: istore 21
      // 1ff: lload 3
      // 200: lconst_0
      // 201: lcmp
      // 202: iflt 20a
      // 205: aload 15
      // 207: ifnonnull 2b6
      // 20a: aload 20
      // 20c: ldc ","
      // 20e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 211: aload 15
      // 213: ifnull 2b8
      // 216: goto 223
      // 219: ldc2_w -7522832926066779960
      // 21c: lload 3
      // 21d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: athrow
      // 223: ifeq 2b6
      // 226: goto 233
      // 229: ldc2_w -7522832926066779960
      // 22c: lload 3
      // 22d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: bipush 4
      // 234: istore 21
      // 236: lload 3
      // 237: lconst_0
      // 238: lcmp
      // 239: iflt 241
      // 23c: aload 15
      // 23e: ifnonnull 2b6
      // 241: aload 20
      // 243: ldc "\""
      // 245: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 248: aload 15
      // 24a: ifnull 2b8
      // 24d: goto 25a
      // 250: ldc2_w -7522832926066779960
      // 253: lload 3
      // 254: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: ifeq 2b6
      // 25d: goto 26a
      // 260: ldc2_w -7522832926066779960
      // 263: lload 3
      // 264: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: bipush 5
      // 26b: istore 21
      // 26d: lload 3
      // 26e: lconst_0
      // 26f: lcmp
      // 270: iflt 278
      // 273: aload 15
      // 275: ifnonnull 2b6
      // 278: aload 20
      // 27a: ldc "("
      // 27c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27f: aload 15
      // 281: lload 3
      // 282: lconst_0
      // 283: lcmp
      // 284: iflt 2ba
      // 287: ifnull 2b8
      // 28a: goto 297
      // 28d: ldc2_w -7522832926066779960
      // 290: lload 3
      // 291: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: athrow
      // 297: ifeq 2b6
      // 29a: goto 2a7
      // 29d: ldc2_w -7522832926066779960
      // 2a0: lload 3
      // 2a1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a6: athrow
      // 2a7: sipush 28881
      // 2aa: ldc2_w 8858245086006521872
      // 2ad: lload 3
      // 2ae: lxor
      // 2af: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: istore 21
      // 2b6: iload 21
      // 2b8: aload 15
      // 2ba: lload 3
      // 2bb: lconst_0
      // 2bc: lcmp
      // 2bd: iflt 32b
      // 2c0: ifnull 329
      // 2c3: tableswitch 82 0 6 51 51 51 51 51 51 51
      // 2ec: ldc2_w -7522832926066779960
      // 2ef: lload 3
      // 2f0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: athrow
      // 2f6: aload 2
      // 2f7: aload 19
      // 2f9: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 2fc: pop
      // 2fd: aload 15
      // 2ff: lload 3
      // 300: lconst_0
      // 301: lcmp
      // 302: iflt 943
      // 305: ifnonnull 93e
      // 308: goto 315
      // 30b: ldc2_w -7522832926066779960
      // 30e: lload 3
      // 30f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 314: athrow
      // 315: aload 19
      // 317: ldc "/"
      // 319: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 31c: goto 329
      // 31f: ldc2_w -7522832926066779960
      // 322: lload 3
      // 323: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 328: athrow
      // 329: aload 15
      // 32b: ifnull 34d
      // 32e: bipush -1
      // 32f: if_icmple 350
      // 332: goto 33f
      // 335: ldc2_w -7522832926066779960
      // 338: lload 3
      // 339: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: athrow
      // 33f: bipush 1
      // 340: goto 34d
      // 343: ldc2_w -7522832926066779960
      // 346: lload 3
      // 347: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: athrow
      // 34d: goto 351
      // 350: bipush 0
      // 351: istore 22
      // 353: bipush 0
      // 354: istore 23
      // 356: iload 22
      // 358: ifeq 387
      // 35b: aload 19
      // 35d: sipush 29409
      // 360: ldc2_w 3720978567609561633
      // 363: lload 3
      // 364: lxor
      // 365: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: sipush 11829
      // 36d: ldc2_w 933837819099803382
      // 370: lload 3
      // 371: lxor
      // 372: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 37a: astore 24
      // 37c: lload 3
      // 37d: lconst_0
      // 37e: lcmp
      // 37f: iflt 38b
      // 382: aload 15
      // 384: ifnonnull 38b
      // 387: aload 19
      // 389: astore 24
      // 38b: aload 24
      // 38d: ldc "["
      // 38f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 392: aload 15
      // 394: ifnull 46d
      // 397: ifeq 45b
      // 39a: goto 3a7
      // 39d: ldc2_w -7522832926066779960
      // 3a0: lload 3
      // 3a1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: athrow
      // 3a7: aload 24
      // 3a9: ldc ";"
      // 3ab: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 3ae: aload 15
      // 3b0: ifnull 46d
      // 3b3: goto 3c0
      // 3b6: ldc2_w -7522832926066779960
      // 3b9: lload 3
      // 3ba: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bf: athrow
      // 3c0: ifeq 45b
      // 3c3: goto 3d0
      // 3c6: ldc2_w -7522832926066779960
      // 3c9: lload 3
      // 3ca: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cf: athrow
      // 3d0: aload 24
      // 3d2: iload 23
      // 3d4: invokevirtual java/lang/String.charAt (I)C
      // 3d7: sipush 13629
      // 3da: ldc2_w 2702384523990693369
      // 3dd: lload 3
      // 3de: lxor
      // 3df: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e4: if_icmpne 41a
      // 3e7: goto 3f4
      // 3ea: ldc2_w -7522832926066779960
      // 3ed: lload 3
      // 3ee: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: athrow
      // 3f4: iinc 23 1
      // 3f7: aload 15
      // 3f9: lload 3
      // 3fa: lconst_0
      // 3fb: lcmp
      // 3fc: iflt 404
      // 3ff: ifnull 45b
      // 402: aload 15
      // 404: ifnonnull 3d0
      // 407: lload 3
      // 408: lconst_0
      // 409: lcmp
      // 40a: iflt 3f7
      // 40d: goto 41a
      // 410: ldc2_w -7522832926066779960
      // 413: lload 3
      // 414: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 419: athrow
      // 41a: aload 24
      // 41c: iload 23
      // 41e: invokevirtual java/lang/String.charAt (I)C
      // 421: aload 15
      // 423: lload 3
      // 424: lconst_0
      // 425: lcmp
      // 426: iflt 46f
      // 429: ifnull 46d
      // 42c: sipush 10452
      // 42f: ldc2_w 8744908996119947290
      // 432: lload 3
      // 433: lxor
      // 434: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 439: if_icmpne 45b
      // 43c: goto 449
      // 43f: ldc2_w -7522832926066779960
      // 442: lload 3
      // 443: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: athrow
      // 449: aload 24
      // 44b: iload 23
      // 44d: bipush 1
      // 44e: iadd
      // 44f: aload 24
      // 451: invokevirtual java/lang/String.length ()I
      // 454: bipush 1
      // 455: isub
      // 456: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 459: astore 24
      // 45b: aload 24
      // 45d: sipush 6801
      // 460: ldc2_w 798169562474666583
      // 463: lload 3
      // 464: lxor
      // 465: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46a: invokevirtual java/lang/String.indexOf (I)I
      // 46d: aload 15
      // 46f: lload 3
      // 470: lconst_0
      // 471: lcmp
      // 472: ifle 4a9
      // 475: ifnull 4a7
      // 478: ifle 92a
      // 47b: goto 488
      // 47e: ldc2_w -7522832926066779960
      // 481: lload 3
      // 482: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 487: athrow
      // 488: aload 24
      // 48a: sipush 6801
      // 48d: ldc2_w 798169562474666583
      // 490: lload 3
      // 491: lxor
      // 492: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 497: invokevirtual java/lang/String.indexOf (I)I
      // 49a: goto 4a7
      // 49d: ldc2_w -7522832926066779960
      // 4a0: lload 3
      // 4a1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a6: athrow
      // 4a7: aload 15
      // 4a9: ifnull 4d1
      // 4ac: aload 24
      // 4ae: invokevirtual java/lang/String.length ()I
      // 4b1: bipush 1
      // 4b2: isub
      // 4b3: if_icmpge 92a
      // 4b6: goto 4c3
      // 4b9: ldc2_w -7522832926066779960
      // 4bc: lload 3
      // 4bd: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c2: athrow
      // 4c3: bipush 0
      // 4c4: goto 4d1
      // 4c7: ldc2_w -7522832926066779960
      // 4ca: lload 3
      // 4cb: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d0: athrow
      // 4d1: istore 25
      // 4d3: aload 24
      // 4d5: ldc "."
      // 4d7: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 4da: istore 26
      // 4dc: aload 17
      // 4de: invokeinterface java/util/List.size ()I 1
      // 4e3: aload 15
      // 4e5: ifnull 778
      // 4e8: iload 18
      // 4ea: bipush 1
      // 4eb: iadd
      // 4ec: if_icmple 776
      // 4ef: goto 4fc
      // 4f2: ldc2_w -7522832926066779960
      // 4f5: lload 3
      // 4f6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fb: athrow
      // 4fc: aload 17
      // 4fe: iload 18
      // 500: bipush 1
      // 501: iadd
      // 502: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 507: checkcast java/lang/String
      // 50a: ldc "("
      // 50c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 50f: aload 15
      // 511: ifnull 778
      // 514: goto 521
      // 517: ldc2_w -7522832926066779960
      // 51a: lload 3
      // 51b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 520: athrow
      // 521: ifeq 776
      // 524: goto 531
      // 527: ldc2_w -7522832926066779960
      // 52a: lload 3
      // 52b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 530: athrow
      // 531: aload 17
      // 533: ldc ")"
      // 535: ldc2_w -8628179528294518683
      // 538: lload 3
      // 539: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53e: aload 15
      // 540: ifnull 778
      // 543: goto 550
      // 546: ldc2_w -7522832926066779960
      // 549: lload 3
      // 54a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54f: athrow
      // 550: iload 18
      // 552: bipush 1
      // 553: iadd
      // 554: if_icmple 776
      // 557: goto 564
      // 55a: ldc2_w -7522832926066779960
      // 55d: lload 3
      // 55e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 563: athrow
      // 564: lload 7
      // 566: aload 24
      // 568: sipush 6801
      // 56b: ldc2_w 798169562474666583
      // 56e: lload 3
      // 56f: lxor
      // 570: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 575: invokestatic com/zelix/l_.p (JLjava/lang/String;C)I
      // 578: aload 15
      // 57a: ifnull 778
      // 57d: goto 58a
      // 580: ldc2_w -7522832926066779960
      // 583: lload 3
      // 584: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 589: athrow
      // 58a: bipush 1
      // 58b: if_icmple 776
      // 58e: goto 59b
      // 591: ldc2_w -7522832926066779960
      // 594: lload 3
      // 595: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59a: athrow
      // 59b: iload 26
      // 59d: aload 15
      // 59f: lload 3
      // 5a0: lconst_0
      // 5a1: lcmp
      // 5a2: iflt 77a
      // 5a5: ifnull 778
      // 5a8: goto 5b5
      // 5ab: ldc2_w -7522832926066779960
      // 5ae: lload 3
      // 5af: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b4: athrow
      // 5b5: aload 24
      // 5b7: invokevirtual java/lang/String.length ()I
      // 5ba: bipush 1
      // 5bb: isub
      // 5bc: if_icmpge 776
      // 5bf: goto 5cc
      // 5c2: ldc2_w -7522832926066779960
      // 5c5: lload 3
      // 5c6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cb: athrow
      // 5cc: aload 24
      // 5ce: bipush 0
      // 5cf: iload 26
      // 5d1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 5d4: astore 27
      // 5d6: aload 5
      // 5d8: aload 27
      // 5da: lload 11
      // 5dc: bipush 2
      // 5dd: anewarray 402
      // 5e0: dup_x2
      // 5e1: dup_x2
      // 5e2: pop
      // 5e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e6: bipush 1
      // 5e7: swap
      // 5e8: aastore
      // 5e9: dup_x1
      // 5ea: swap
      // 5eb: bipush 0
      // 5ec: swap
      // 5ed: aastore
      // 5ee: ldc2_w -7956237398312758452
      // 5f1: lload 3
      // 5f2: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f7: astore 28
      // 5f9: aload 28
      // 5fb: aload 15
      // 5fd: ifnull 626
      // 600: ifnull 776
      // 603: goto 610
      // 606: ldc2_w -7522832926066779960
      // 609: lload 3
      // 60a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60f: athrow
      // 610: aload 24
      // 612: iload 26
      // 614: bipush 1
      // 615: iadd
      // 616: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 619: goto 626
      // 61c: ldc2_w -7522832926066779960
      // 61f: lload 3
      // 620: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 625: athrow
      // 626: astore 29
      // 628: new java/lang/StringBuilder
      // 62b: dup
      // 62c: invokespecial java/lang/StringBuilder.<init> ()V
      // 62f: astore 30
      // 631: iload 18
      // 633: bipush 2
      // 634: iadd
      // 635: istore 31
      // 637: iload 31
      // 639: aload 17
      // 63b: ldc ")"
      // 63d: ldc2_w -8628179528294518683
      // 640: lload 3
      // 641: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 646: if_icmpge 6a8
      // 649: aload 17
      // 64b: iload 31
      // 64d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 652: checkcast java/lang/String
      // 655: astore 32
      // 657: aload 5
      // 659: lload 13
      // 65b: aload 32
      // 65d: bipush 2
      // 65e: anewarray 402
      // 661: dup_x1
      // 662: swap
      // 663: bipush 1
      // 664: swap
      // 665: aastore
      // 666: dup_x2
      // 667: dup_x2
      // 668: pop
      // 669: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66c: bipush 0
      // 66d: swap
      // 66e: aastore
      // 66f: ldc2_w -8043622944930165813
      // 672: lload 3
      // 673: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 678: astore 33
      // 67a: aload 30
      // 67c: aload 33
      // 67e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 681: pop
      // 682: iinc 31 1
      // 685: aload 15
      // 687: lload 3
      // 688: lconst_0
      // 689: lcmp
      // 68a: ifle 692
      // 68d: ifnull 776
      // 690: aload 15
      // 692: ifnonnull 637
      // 695: lload 3
      // 696: lconst_0
      // 697: lcmp
      // 698: ifle 685
      // 69b: goto 6a8
      // 69e: ldc2_w -7522832926066779960
      // 6a1: lload 3
      // 6a2: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a7: athrow
      // 6a8: aload 5
      // 6aa: aload 28
      // 6ac: aload 29
      // 6ae: aconst_null
      // 6af: aload 30
      // 6b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6b4: lload 9
      // 6b6: dup2_x1
      // 6b7: pop2
      // 6b8: bipush 5
      // 6b9: anewarray 402
      // 6bc: dup_x1
      // 6bd: swap
      // 6be: bipush 4
      // 6bf: swap
      // 6c0: aastore
      // 6c1: dup_x2
      // 6c2: dup_x2
      // 6c3: pop
      // 6c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c7: bipush 3
      // 6c8: swap
      // 6c9: aastore
      // 6ca: dup_x1
      // 6cb: swap
      // 6cc: bipush 2
      // 6cd: swap
      // 6ce: aastore
      // 6cf: dup_x1
      // 6d0: swap
      // 6d1: bipush 1
      // 6d2: swap
      // 6d3: aastore
      // 6d4: dup_x1
      // 6d5: swap
      // 6d6: bipush 0
      // 6d7: swap
      // 6d8: aastore
      // 6d9: ldc2_w -8281352909723007471
      // 6dc: lload 3
      // 6dd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e2: astore 31
      // 6e4: aload 31
      // 6e6: aload 15
      // 6e8: ifnull 6fd
      // 6eb: ifnull 724
      // 6ee: goto 6fb
      // 6f1: ldc2_w -7522832926066779960
      // 6f4: lload 3
      // 6f5: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6fa: athrow
      // 6fb: aload 31
      // 6fd: arraylength
      // 6fe: ifle 724
      // 701: new java/lang/StringBuilder
      // 704: dup
      // 705: invokespecial java/lang/StringBuilder.<init> ()V
      // 708: ldc "."
      // 70a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 70d: aload 31
      // 70f: bipush 0
      // 710: aaload
      // 711: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 714: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 717: astore 32
      // 719: lload 3
      // 71a: lconst_0
      // 71b: lcmp
      // 71c: ifle 72d
      // 71f: aload 15
      // 721: ifnonnull 72d
      // 724: aload 24
      // 726: iload 26
      // 728: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 72b: astore 32
      // 72d: iload 22
      // 72f: aload 15
      // 731: ifnull 774
      // 734: ifeq 765
      // 737: goto 744
      // 73a: ldc2_w -7522832926066779960
      // 73d: lload 3
      // 73e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 743: athrow
      // 744: aload 28
      // 746: sipush 6801
      // 749: ldc2_w 798169562474666583
      // 74c: lload 3
      // 74d: lxor
      // 74e: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 753: sipush 28348
      // 756: ldc2_w 5598083836214062708
      // 759: lload 3
      // 75a: lxor
      // 75b: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 760: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 763: astore 28
      // 765: aload 2
      // 766: aload 28
      // 768: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 76b: pop
      // 76c: aload 2
      // 76d: aload 32
      // 76f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 772: pop
      // 773: bipush 1
      // 774: istore 25
      // 776: iload 25
      // 778: aload 15
      // 77a: lload 3
      // 77b: lconst_0
      // 77c: lcmp
      // 77d: iflt 7af
      // 780: ifnull 7a7
      // 783: ifne 91f
      // 786: goto 793
      // 789: ldc2_w -7522832926066779960
      // 78c: lload 3
      // 78d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 792: athrow
      // 793: aload 17
      // 795: invokeinterface java/util/List.size ()I 1
      // 79a: goto 7a7
      // 79d: ldc2_w -7522832926066779960
      // 7a0: lload 3
      // 7a1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a6: athrow
      // 7a7: lload 3
      // 7a8: lconst_0
      // 7a9: lcmp
      // 7aa: ifle 7f8
      // 7ad: aload 15
      // 7af: ifnull 7f8
      // 7b2: iload 18
      // 7b4: bipush 1
      // 7b5: iadd
      // 7b6: if_icmple 7fb
      // 7b9: goto 7c6
      // 7bc: ldc2_w -7522832926066779960
      // 7bf: lload 3
      // 7c0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c5: athrow
      // 7c6: aload 17
      // 7c8: iload 18
      // 7ca: bipush 1
      // 7cb: iadd
      // 7cc: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7d1: checkcast java/lang/String
      // 7d4: aload 15
      // 7d6: ifnull 829
      // 7d9: goto 7e6
      // 7dc: ldc2_w -7522832926066779960
      // 7df: lload 3
      // 7e0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e5: athrow
      // 7e6: ldc "("
      // 7e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7eb: goto 7f8
      // 7ee: ldc2_w -7522832926066779960
      // 7f1: lload 3
      // 7f2: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f7: athrow
      // 7f8: ifne 90b
      // 7fb: aload 5
      // 7fd: aload 24
      // 7ff: lload 11
      // 801: bipush 2
      // 802: anewarray 402
      // 805: dup_x2
      // 806: dup_x2
      // 807: pop
      // 808: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 80b: bipush 1
      // 80c: swap
      // 80d: aastore
      // 80e: dup_x1
      // 80f: swap
      // 810: bipush 0
      // 811: swap
      // 812: aastore
      // 813: ldc2_w -7956237398312758452
      // 816: lload 3
      // 817: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81c: goto 829
      // 81f: ldc2_w -7522832926066779960
      // 822: lload 3
      // 823: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 828: athrow
      // 829: astore 27
      // 82b: lload 3
      // 82c: lconst_0
      // 82d: lcmp
      // 82e: iflt 8f3
      // 831: aload 27
      // 833: ifnull 8ec
      // 836: iload 22
      // 838: aload 15
      // 83a: lload 3
      // 83b: lconst_0
      // 83c: lcmp
      // 83d: iflt 88c
      // 840: ifnull 88a
      // 843: goto 850
      // 846: ldc2_w -7522832926066779960
      // 849: lload 3
      // 84a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84f: athrow
      // 850: ifeq 881
      // 853: goto 860
      // 856: ldc2_w -7522832926066779960
      // 859: lload 3
      // 85a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85f: athrow
      // 860: aload 27
      // 862: sipush 6801
      // 865: ldc2_w 798169562474666583
      // 868: lload 3
      // 869: lxor
      // 86a: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86f: sipush 28348
      // 872: ldc2_w 5598083836214062708
      // 875: lload 3
      // 876: lxor
      // 877: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87c: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 87f: astore 27
      // 881: aload 2
      // 882: aload 27
      // 884: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 887: pop
      // 888: iload 23
      // 88a: aload 15
      // 88c: ifnull 8a0
      // 88f: ifle 900
      // 892: goto 89f
      // 895: ldc2_w -7522832926066779960
      // 898: lload 3
      // 899: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89e: athrow
      // 89f: bipush 0
      // 8a0: istore 28
      // 8a2: iload 28
      // 8a4: iload 23
      // 8a6: if_icmpge 8e1
      // 8a9: aload 2
      // 8aa: sipush 22916
      // 8ad: ldc2_w 2300893596228686388
      // 8b0: lload 3
      // 8b1: lxor
      // 8b2: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b7: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 8ba: pop
      // 8bb: iinc 28 1
      // 8be: aload 15
      // 8c0: lload 3
      // 8c1: lconst_0
      // 8c2: lcmp
      // 8c3: iflt 902
      // 8c6: ifnull 900
      // 8c9: aload 15
      // 8cb: ifnonnull 8a2
      // 8ce: lload 3
      // 8cf: lconst_0
      // 8d0: lcmp
      // 8d1: iflt 8be
      // 8d4: goto 8e1
      // 8d7: ldc2_w -7522832926066779960
      // 8da: lload 3
      // 8db: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e0: athrow
      // 8e1: lload 3
      // 8e2: lconst_0
      // 8e3: lcmp
      // 8e4: ifle 8f3
      // 8e7: aload 15
      // 8e9: ifnonnull 900
      // 8ec: aload 2
      // 8ed: aload 19
      // 8ef: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 8f2: pop
      // 8f3: goto 900
      // 8f6: ldc2_w -7522832926066779960
      // 8f9: lload 3
      // 8fa: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ff: athrow
      // 900: aload 15
      // 902: lload 3
      // 903: lconst_0
      // 904: lcmp
      // 905: iflt 921
      // 908: ifnonnull 91f
      // 90b: aload 2
      // 90c: aload 19
      // 90e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 911: pop
      // 912: goto 91f
      // 915: ldc2_w -7522832926066779960
      // 918: lload 3
      // 919: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91e: athrow
      // 91f: aload 15
      // 921: lload 3
      // 922: lconst_0
      // 923: lcmp
      // 924: iflt 943
      // 927: ifnonnull 93e
      // 92a: aload 2
      // 92b: aload 19
      // 92d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 930: pop
      // 931: goto 93e
      // 934: ldc2_w -7522832926066779960
      // 937: lload 3
      // 938: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93d: athrow
      // 93e: iinc 18 1
      // 941: aload 15
      // 943: ifnonnull 0b8
      // 946: return
   }

   boolean t(Object[] param1) {
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
      // 0b: pop
      // 0c: getstatic com/zelix/_82.d J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 42336307834136
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -1331610886378384124
      // 1e: lload 2
      // 1f: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: ldc2_w -1180916859873310370
      // 2a: lload 2
      // 2b: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: aload 6
      // 32: ifnull 5c
      // 35: ifnull d3
      // 38: goto 45
      // 3b: ldc2_w -758013769530525141
      // 3e: lload 2
      // 3f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: ldc2_w -1180916859873310370
      // 49: lload 2
      // 4a: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w -758013769530525141
      // 55: lload 2
      // 56: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: arraylength
      // 5d: aload 6
      // 5f: lload 2
      // 60: lconst_0
      // 61: lcmp
      // 62: iflt bc
      // 65: ifnull ba
      // 68: bipush 1
      // 69: if_icmpne d3
      // 6c: goto 79
      // 6f: ldc2_w -758013769530525141
      // 72: lload 2
      // 73: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 0
      // 7a: ldc2_w -1180916859873310370
      // 7d: lload 2
      // 7e: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: bipush 0
      // 84: aaload
      // 85: lload 4
      // 87: bipush 1
      // 88: anewarray 402
      // 8b: dup_x2
      // 8c: dup_x2
      // 8d: pop
      // 8e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 91: bipush 0
      // 92: swap
      // 93: aastore
      // 94: ldc2_w -1033677713555815414
      // 97: lload 2
      // 98: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: sipush 27687
      // a0: ldc2_w 9130077911974724990
      // a3: lload 2
      // a4: lxor
      // a5: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // ad: goto ba
      // b0: ldc2_w -758013769530525141
      // b3: lload 2
      // b4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: athrow
      // ba: aload 6
      // bc: ifnull d0
      // bf: ifeq d3
      // c2: goto cf
      // c5: ldc2_w -758013769530525141
      // c8: lload 2
      // c9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: athrow
      // cf: bipush 1
      // d0: goto d4
      // d3: bipush 0
      // d4: ireturn
   }

   void s(Object[] param1) {
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
      // 004: checkcast java/lang/StringBuffer
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/_82.d J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: ldc2_w -3486583911360383204
      // 01d: lload 2
      // 01e: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: astore 5
      // 025: aload 0
      // 026: ldc2_w -2911244795254914971
      // 029: lload 2
      // 02a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f: aload 5
      // 031: ifnull 073
      // 034: ifnull 101
      // 037: goto 044
      // 03a: ldc2_w -2926496510254442445
      // 03d: lload 2
      // 03e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: athrow
      // 044: aload 0
      // 045: lload 2
      // 046: lconst_0
      // 047: lcmp
      // 048: iflt 0bb
      // 04b: aload 5
      // 04d: ifnull 0bb
      // 050: goto 05d
      // 053: ldc2_w -2926496510254442445
      // 056: lload 2
      // 057: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: ldc2_w -2911244795254914971
      // 060: lload 2
      // 061: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: goto 073
      // 069: ldc2_w -2926496510254442445
      // 06c: lload 2
      // 06d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: invokevirtual java/lang/String.length ()I
      // 076: ifle 101
      // 079: aload 4
      // 07b: new java/lang/StringBuilder
      // 07e: dup
      // 07f: invokespecial java/lang/StringBuilder.<init> ()V
      // 082: ldc "("
      // 084: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 087: aload 0
      // 088: ldc2_w -2911244795254914971
      // 08b: lload 2
      // 08c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 097: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 09a: aload 5
      // 09c: ifnull 100
      // 09f: goto 0ac
      // 0a2: ldc2_w -2926496510254442445
      // 0a5: lload 2
      // 0a6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: pop
      // 0ad: aload 0
      // 0ae: goto 0bb
      // 0b1: ldc2_w -2926496510254442445
      // 0b4: lload 2
      // 0b5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: ldc2_w -3492957923537347130
      // 0be: lload 2
      // 0bf: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: ifnull 0f9
      // 0c7: aload 4
      // 0c9: new java/lang/StringBuilder
      // 0cc: dup
      // 0cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d0: ldc ":"
      // 0d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d5: aload 0
      // 0d6: ldc2_w -3492957923537347130
      // 0d9: lload 2
      // 0da: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/lang/Integer.intValue ()I
      // 0e2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e8: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0eb: pop
      // 0ec: goto 0f9
      // 0ef: ldc2_w -2926496510254442445
      // 0f2: lload 2
      // 0f3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 4
      // 0fb: ldc ")"
      // 0fd: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 100: pop
      // 101: return
   }

   final String Z(Object[] param1) {
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
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/a7
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 5
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/am
      // 024: astore 3
      // 025: pop
      // 026: getstatic com/zelix/_82.d J
      // 029: lload 5
      // 02b: lxor
      // 02c: lstore 5
      // 02e: lload 5
      // 030: dup2
      // 031: ldc2_w 42565637963683
      // 034: lxor
      // 035: lstore 7
      // 037: dup2
      // 038: ldc2_w 28758457064744
      // 03b: lxor
      // 03c: lstore 9
      // 03e: dup2
      // 03f: ldc2_w 11101340591463
      // 042: lxor
      // 043: lstore 11
      // 045: dup2
      // 046: ldc2_w 26721088748382
      // 049: lxor
      // 04a: lstore 13
      // 04c: dup2
      // 04d: ldc2_w 126444211883297
      // 050: lxor
      // 051: lstore 15
      // 053: dup2
      // 054: ldc2_w 11479604140112
      // 057: lxor
      // 058: lstore 17
      // 05a: dup2
      // 05b: ldc2_w 98662187907426
      // 05e: lxor
      // 05f: lstore 19
      // 061: dup2
      // 062: ldc2_w 107679560301477
      // 065: lxor
      // 066: lstore 21
      // 068: dup2
      // 069: ldc2_w 92505512761666
      // 06c: lxor
      // 06d: lstore 23
      // 06f: pop2
      // 070: ldc2_w 5601492177509954877
      // 073: lload 5
      // 075: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: astore 25
      // 07c: aload 0
      // 07d: ldc2_w 5739239446058428775
      // 080: lload 5
      // 082: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: aload 25
      // 089: ifnull 0b6
      // 08c: ifnull 0c0
      // 08f: goto 09d
      // 092: ldc2_w 6143943428410743314
      // 095: lload 5
      // 097: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 0
      // 09e: ldc2_w 5739239446058428775
      // 0a1: lload 5
      // 0a3: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: goto 0b6
      // 0ab: ldc2_w 6143943428410743314
      // 0ae: lload 5
      // 0b0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: ldc2_w 5337190201344380809
      // 0b9: lload 5
      // 0bb: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: new java/lang/StringBuffer
      // 0c3: dup
      // 0c4: sipush 32604
      // 0c7: ldc2_w 9010853828285726017
      // 0ca: lload 5
      // 0cc: lxor
      // 0cd: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: invokespecial java/lang/StringBuffer.<init> (I)V
      // 0d5: astore 26
      // 0d7: aload 0
      // 0d8: ldc2_w 5999181511999588914
      // 0db: lload 5
      // 0dd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/ae; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: aload 25
      // 0e4: ifnull 4c5
      // 0e7: lload 17
      // 0e9: bipush 1
      // 0ea: anewarray 402
      // 0ed: dup_x2
      // 0ee: dup_x2
      // 0ef: pop
      // 0f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: ldc2_w 5539435171829088337
      // 0f9: lload 5
      // 0fb: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: ifeq 4ac
      // 103: goto 111
      // 106: ldc2_w 6143943428410743314
      // 109: lload 5
      // 10b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 0
      // 112: aload 25
      // 114: ifnull 4bb
      // 117: goto 125
      // 11a: ldc2_w 6143943428410743314
      // 11d: lload 5
      // 11f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: lload 5
      // 127: lconst_0
      // 128: lcmp
      // 129: iflt 4ad
      // 12c: ldc2_w 5596150160439964947
      // 12f: lload 5
      // 131: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: ifeq 4ac
      // 139: goto 147
      // 13c: ldc2_w 6143943428410743314
      // 13f: lload 5
      // 141: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: aload 26
      // 149: new java/lang/StringBuilder
      // 14c: dup
      // 14d: invokespecial java/lang/StringBuilder.<init> ()V
      // 150: ldc2_w 5353832419539039191
      // 153: lload 5
      // 155: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15d: sipush 22730
      // 160: ldc2_w 499411350068646308
      // 163: lload 5
      // 165: lxor
      // 166: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16e: aload 0
      // 16f: ldc2_w 5727040238872295350
      // 172: lload 5
      // 174: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 182: pop
      // 183: aload 25
      // 185: lload 5
      // 187: lconst_0
      // 188: lcmp
      // 189: ifle 4a9
      // 18c: ifnull 4a7
      // 18f: goto 19d
      // 192: ldc2_w 6143943428410743314
      // 195: lload 5
      // 197: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: aload 0
      // 19e: ldc2_w 5739239446058428775
      // 1a1: lload 5
      // 1a3: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: ifnull 497
      // 1ab: goto 1b9
      // 1ae: ldc2_w 6143943428410743314
      // 1b1: lload 5
      // 1b3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: ldc2_w 5739239446058428775
      // 1bd: lload 5
      // 1bf: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: arraylength
      // 1c5: lload 5
      // 1c7: lconst_0
      // 1c8: lcmp
      // 1c9: iflt 203
      // 1cc: aload 25
      // 1ce: ifnull 203
      // 1d1: goto 1df
      // 1d4: ldc2_w 6143943428410743314
      // 1d7: lload 5
      // 1d9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: ifne 1f7
      // 1e2: goto 1f0
      // 1e5: ldc2_w 6143943428410743314
      // 1e8: lload 5
      // 1ea: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: lload 5
      // 1f2: lconst_0
      // 1f3: lcmp
      // 1f4: ifgt 497
      // 1f7: aload 0
      // 1f8: ldc2_w 5739239446058428775
      // 1fb: lload 5
      // 1fd: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: arraylength
      // 203: bipush 1
      // 204: aload 25
      // 206: ifnull 2fa
      // 209: if_icmpne 2d0
      // 20c: goto 21a
      // 20f: ldc2_w 6143943428410743314
      // 212: lload 5
      // 214: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: aload 26
      // 21c: new java/lang/StringBuilder
      // 21f: dup
      // 220: invokespecial java/lang/StringBuilder.<init> ()V
      // 223: ldc "."
      // 225: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 228: aload 0
      // 229: ldc2_w 5739239446058428775
      // 22c: lload 5
      // 22e: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: bipush 0
      // 234: aaload
      // 235: lload 15
      // 237: bipush 1
      // 238: anewarray 402
      // 23b: dup_x2
      // 23c: dup_x2
      // 23d: pop
      // 23e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 241: bipush 0
      // 242: swap
      // 243: aastore
      // 244: ldc2_w 5881408753739703347
      // 247: lload 5
      // 249: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 251: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 254: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 257: lload 5
      // 259: lconst_0
      // 25a: lcmp
      // 25b: ifle 4a6
      // 25e: pop
      // 25f: aload 0
      // 260: aload 0
      // 261: ldc2_w 5739239446058428775
      // 264: lload 5
      // 266: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: bipush 0
      // 26c: aaload
      // 26d: iload 4
      // 26f: lload 9
      // 271: aload 26
      // 273: bipush 4
      // 274: anewarray 402
      // 277: dup_x1
      // 278: swap
      // 279: bipush 3
      // 27a: swap
      // 27b: aastore
      // 27c: dup_x2
      // 27d: dup_x2
      // 27e: pop
      // 27f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 282: bipush 2
      // 283: swap
      // 284: aastore
      // 285: dup_x1
      // 286: swap
      // 287: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 28a: bipush 1
      // 28b: swap
      // 28c: aastore
      // 28d: dup_x1
      // 28e: swap
      // 28f: bipush 0
      // 290: swap
      // 291: aastore
      // 292: ldc2_w 6048492746833961341
      // 295: lload 5
      // 297: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29c: aload 0
      // 29d: aload 26
      // 29f: lload 21
      // 2a1: bipush 2
      // 2a2: anewarray 402
      // 2a5: dup_x2
      // 2a6: dup_x2
      // 2a7: pop
      // 2a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ab: bipush 1
      // 2ac: swap
      // 2ad: aastore
      // 2ae: dup_x1
      // 2af: swap
      // 2b0: bipush 0
      // 2b1: swap
      // 2b2: aastore
      // 2b3: ldc2_w 6248101921265450849
      // 2b6: lload 5
      // 2b8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: aload 25
      // 2bf: ifnonnull 497
      // 2c2: goto 2d0
      // 2c5: ldc2_w 6143943428410743314
      // 2c8: lload 5
      // 2ca: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: athrow
      // 2d0: aload 26
      // 2d2: ldc2_w 5323849176836915004
      // 2d5: lload 5
      // 2d7: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: bipush 1
      // 2dd: iadd
      // 2de: sipush 28882
      // 2e1: ldc2_w 5350003015486894785
      // 2e4: lload 5
      // 2e6: lxor
      // 2e7: invokedynamic g (IJ)I bsm=com/zelix/_82.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ec: goto 2fa
      // 2ef: ldc2_w 6143943428410743314
      // 2f2: lload 5
      // 2f4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: athrow
      // 2fa: lload 11
      // 2fc: bipush 3
      // 2fd: anewarray 402
      // 300: dup_x2
      // 301: dup_x2
      // 302: pop
      // 303: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 306: bipush 2
      // 307: swap
      // 308: aastore
      // 309: dup_x1
      // 30a: swap
      // 30b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 30e: bipush 1
      // 30f: swap
      // 310: aastore
      // 311: dup_x1
      // 312: swap
      // 313: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 316: bipush 0
      // 317: swap
      // 318: aastore
      // 319: ldc2_w 5354504692532314935
      // 31c: lload 5
      // 31e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: astore 27
      // 325: bipush 0
      // 326: istore 28
      // 328: iload 28
      // 32a: aload 0
      // 32b: ldc2_w 5739239446058428775
      // 32e: lload 5
      // 330: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: arraylength
      // 336: if_icmpge 497
      // 339: aload 25
      // 33b: ifnull 4a7
      // 33e: iload 28
      // 340: ifne 373
      // 343: goto 351
      // 346: ldc2_w 6143943428410743314
      // 349: lload 5
      // 34b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: athrow
      // 351: aload 26
      // 353: ldc "."
      // 355: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 358: pop
      // 359: lload 5
      // 35b: lconst_0
      // 35c: lcmp
      // 35d: ifle 3f4
      // 360: aload 25
      // 362: ifnonnull 389
      // 365: goto 373
      // 368: ldc2_w 6143943428410743314
      // 36b: lload 5
      // 36d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 372: athrow
      // 373: aload 26
      // 375: aload 27
      // 377: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 37a: pop
      // 37b: goto 389
      // 37e: ldc2_w 6143943428410743314
      // 381: lload 5
      // 383: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 388: athrow
      // 389: aload 26
      // 38b: aload 0
      // 38c: ldc2_w 5739239446058428775
      // 38f: lload 5
      // 391: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 396: iload 28
      // 398: aaload
      // 399: lload 15
      // 39b: bipush 1
      // 39c: anewarray 402
      // 39f: dup_x2
      // 3a0: dup_x2
      // 3a1: pop
      // 3a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a5: bipush 0
      // 3a6: swap
      // 3a7: aastore
      // 3a8: ldc2_w 5881408753739703347
      // 3ab: lload 5
      // 3ad: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b2: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 3b5: pop
      // 3b6: aload 0
      // 3b7: aload 0
      // 3b8: ldc2_w 5739239446058428775
      // 3bb: lload 5
      // 3bd: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c2: iload 28
      // 3c4: aaload
      // 3c5: iload 4
      // 3c7: lload 9
      // 3c9: aload 26
      // 3cb: bipush 4
      // 3cc: anewarray 402
      // 3cf: dup_x1
      // 3d0: swap
      // 3d1: bipush 3
      // 3d2: swap
      // 3d3: aastore
      // 3d4: dup_x2
      // 3d5: dup_x2
      // 3d6: pop
      // 3d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3da: bipush 2
      // 3db: swap
      // 3dc: aastore
      // 3dd: dup_x1
      // 3de: swap
      // 3df: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3e2: bipush 1
      // 3e3: swap
      // 3e4: aastore
      // 3e5: dup_x1
      // 3e6: swap
      // 3e7: bipush 0
      // 3e8: swap
      // 3e9: aastore
      // 3ea: ldc2_w 6048492746833961341
      // 3ed: lload 5
      // 3ef: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f4: iload 28
      // 3f6: lload 5
      // 3f8: lconst_0
      // 3f9: lcmp
      // 3fa: iflt 467
      // 3fd: aload 25
      // 3ff: ifnull 467
      // 402: ifne 457
      // 405: goto 413
      // 408: ldc2_w 6143943428410743314
      // 40b: lload 5
      // 40d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 412: athrow
      // 413: aload 0
      // 414: aload 26
      // 416: lload 21
      // 418: bipush 2
      // 419: anewarray 402
      // 41c: dup_x2
      // 41d: dup_x2
      // 41e: pop
      // 41f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 422: bipush 1
      // 423: swap
      // 424: aastore
      // 425: dup_x1
      // 426: swap
      // 427: bipush 0
      // 428: swap
      // 429: aastore
      // 42a: ldc2_w 6248101921265450849
      // 42d: lload 5
      // 42f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 434: aload 26
      // 436: getstatic com/zelix/mc.R Ljava/lang/String;
      // 439: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 43c: pop
      // 43d: aload 25
      // 43f: lload 5
      // 441: lconst_0
      // 442: lcmp
      // 443: iflt 494
      // 446: ifnonnull 48f
      // 449: goto 457
      // 44c: ldc2_w 6143943428410743314
      // 44f: lload 5
      // 451: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: athrow
      // 457: iload 28
      // 459: goto 467
      // 45c: ldc2_w 6143943428410743314
      // 45f: lload 5
      // 461: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 466: athrow
      // 467: aload 0
      // 468: ldc2_w 5739239446058428775
      // 46b: lload 5
      // 46d: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/mv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 472: arraylength
      // 473: bipush 1
      // 474: isub
      // 475: if_icmpge 48f
      // 478: aload 26
      // 47a: getstatic com/zelix/mc.R Ljava/lang/String;
      // 47d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 480: pop
      // 481: goto 48f
      // 484: ldc2_w 6143943428410743314
      // 487: lload 5
      // 489: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48e: athrow
      // 48f: iinc 28 1
      // 492: aload 25
      // 494: ifnonnull 328
      // 497: aload 26
      // 499: getstatic com/zelix/mc.R Ljava/lang/String;
      // 49c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 49f: lload 5
      // 4a1: lconst_0
      // 4a2: lcmp
      // 4a3: ifle 723
      // 4a6: pop
      // 4a7: aload 25
      // 4a9: ifnonnull 721
      // 4ac: aload 0
      // 4ad: goto 4bb
      // 4b0: ldc2_w 6143943428410743314
      // 4b3: lload 5
      // 4b5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ba: athrow
      // 4bb: ldc2_w 5999181511999588914
      // 4be: lload 5
      // 4c0: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/ae; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: lload 23
      // 4c7: bipush 1
      // 4c8: anewarray 402
      // 4cb: dup_x2
      // 4cc: dup_x2
      // 4cd: pop
      // 4ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d1: bipush 0
      // 4d2: swap
      // 4d3: aastore
      // 4d4: ldc2_w 5266911636431205718
      // 4d7: lload 5
      // 4d9: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4de: astore 27
      // 4e0: aload 25
      // 4e2: lload 5
      // 4e4: lconst_0
      // 4e5: lcmp
      // 4e6: ifle 5bb
      // 4e9: ifnull 5b2
      // 4ec: aload 0
      // 4ed: ldc2_w 5999181511999588914
      // 4f0: lload 5
      // 4f2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/ae; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f7: lload 7
      // 4f9: bipush 1
      // 4fa: anewarray 402
      // 4fd: dup_x2
      // 4fe: dup_x2
      // 4ff: pop
      // 500: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 503: bipush 0
      // 504: swap
      // 505: aastore
      // 506: ldc2_w 6301912671949433665
      // 509: lload 5
      // 50b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 510: ifne 58c
      // 513: goto 521
      // 516: ldc2_w 6143943428410743314
      // 519: lload 5
      // 51b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 520: athrow
      // 521: aload 0
      // 522: ldc2_w 5999181511999588914
      // 525: lload 5
      // 527: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/ae; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52c: lload 17
      // 52e: bipush 1
      // 52f: anewarray 402
      // 532: dup_x2
      // 533: dup_x2
      // 534: pop
      // 535: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 538: bipush 0
      // 539: swap
      // 53a: aastore
      // 53b: ldc2_w 5539435171829088337
      // 53e: lload 5
      // 540: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 545: lload 5
      // 547: lconst_0
      // 548: lcmp
      // 549: iflt 589
      // 54c: aload 25
      // 54e: ifnull 589
      // 551: goto 55f
      // 554: ldc2_w 6143943428410743314
      // 557: lload 5
      // 559: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55e: athrow
      // 55f: ifeq 5be
      // 562: goto 570
      // 565: ldc2_w 6143943428410743314
      // 568: lload 5
      // 56a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56f: athrow
      // 570: aload 0
      // 571: ldc2_w 5596150160439964947
      // 574: lload 5
      // 576: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57b: goto 589
      // 57e: ldc2_w 6143943428410743314
      // 581: lload 5
      // 583: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 588: athrow
      // 589: ifne 5be
      // 58c: aload 26
      // 58e: ldc2_w 5353832419539039191
      // 591: lload 5
      // 593: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 598: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 59b: pop
      // 59c: aload 26
      // 59e: aload 27
      // 5a0: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 5a3: pop
      // 5a4: goto 5b2
      // 5a7: ldc2_w 6143943428410743314
      // 5aa: lload 5
      // 5ac: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b1: athrow
      // 5b2: lload 5
      // 5b4: lconst_0
      // 5b5: lcmp
      // 5b6: ifle 5be
      // 5b9: aload 25
      // 5bb: ifnonnull 718
      // 5be: lload 5
      // 5c0: lconst_0
      // 5c1: lcmp
      // 5c2: iflt 70a
      // 5c5: aload 2
      // 5c6: ifnull 702
      // 5c9: goto 5d7
      // 5cc: ldc2_w 6143943428410743314
      // 5cf: lload 5
      // 5d1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d6: athrow
      // 5d7: aload 27
      // 5d9: sipush 24983
      // 5dc: ldc2_w 7480506295343278320
      // 5df: lload 5
      // 5e1: lxor
      // 5e2: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e7: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 5ea: bipush -1
      // 5eb: aload 25
      // 5ed: lload 5
      // 5ef: lconst_0
      // 5f0: lcmp
      // 5f1: ifle 641
      // 5f4: ifnull 638
      // 5f7: goto 605
      // 5fa: ldc2_w 6143943428410743314
      // 5fd: lload 5
      // 5ff: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 604: athrow
      // 605: if_icmple 6c1
      // 608: goto 616
      // 60b: ldc2_w 6143943428410743314
      // 60e: lload 5
      // 610: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 615: athrow
      // 616: aload 27
      // 618: sipush 1184
      // 61b: ldc2_w 7612889618653908428
      // 61e: lload 5
      // 620: lxor
      // 621: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 626: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 629: bipush -1
      // 62a: goto 638
      // 62d: ldc2_w 6143943428410743314
      // 630: lload 5
      // 632: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 637: athrow
      // 638: lload 5
      // 63a: lconst_0
      // 63b: lcmp
      // 63c: iflt 677
      // 63f: aload 25
      // 641: ifnull 677
      // 644: if_icmple 6c1
      // 647: goto 655
      // 64a: ldc2_w 6143943428410743314
      // 64d: lload 5
      // 64f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 654: athrow
      // 655: aload 27
      // 657: sipush 31236
      // 65a: ldc2_w 1623837864462742379
      // 65d: lload 5
      // 65f: lxor
      // 660: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 665: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 668: bipush -1
      // 669: goto 677
      // 66c: ldc2_w 6143943428410743314
      // 66f: lload 5
      // 671: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 676: athrow
      // 677: if_icmple 6c1
      // 67a: aload 0
      // 67b: aload 26
      // 67d: aload 27
      // 67f: lload 19
      // 681: aload 2
      // 682: aload 3
      // 683: bipush 5
      // 684: anewarray 402
      // 687: dup_x1
      // 688: swap
      // 689: bipush 4
      // 68a: swap
      // 68b: aastore
      // 68c: dup_x1
      // 68d: swap
      // 68e: bipush 3
      // 68f: swap
      // 690: aastore
      // 691: dup_x2
      // 692: dup_x2
      // 693: pop
      // 694: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 697: bipush 2
      // 698: swap
      // 699: aastore
      // 69a: dup_x1
      // 69b: swap
      // 69c: bipush 1
      // 69d: swap
      // 69e: aastore
      // 69f: dup_x1
      // 6a0: swap
      // 6a1: bipush 0
      // 6a2: swap
      // 6a3: aastore
      // 6a4: ldc2_w 5785243017079734125
      // 6a7: lload 5
      // 6a9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ae: aload 25
      // 6b0: ifnonnull 718
      // 6b3: goto 6c1
      // 6b6: ldc2_w 6143943428410743314
      // 6b9: lload 5
      // 6bb: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c0: athrow
      // 6c1: aload 0
      // 6c2: aload 26
      // 6c4: lload 13
      // 6c6: aload 27
      // 6c8: aload 2
      // 6c9: bipush 4
      // 6ca: anewarray 402
      // 6cd: dup_x1
      // 6ce: swap
      // 6cf: bipush 3
      // 6d0: swap
      // 6d1: aastore
      // 6d2: dup_x1
      // 6d3: swap
      // 6d4: bipush 2
      // 6d5: swap
      // 6d6: aastore
      // 6d7: dup_x2
      // 6d8: dup_x2
      // 6d9: pop
      // 6da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6dd: bipush 1
      // 6de: swap
      // 6df: aastore
      // 6e0: dup_x1
      // 6e1: swap
      // 6e2: bipush 0
      // 6e3: swap
      // 6e4: aastore
      // 6e5: ldc2_w 5546906879403899309
      // 6e8: lload 5
      // 6ea: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ef: aload 25
      // 6f1: ifnonnull 718
      // 6f4: goto 702
      // 6f7: ldc2_w 6143943428410743314
      // 6fa: lload 5
      // 6fc: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 701: athrow
      // 702: aload 26
      // 704: aload 27
      // 706: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 709: pop
      // 70a: goto 718
      // 70d: ldc2_w 6143943428410743314
      // 710: lload 5
      // 712: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 717: athrow
      // 718: aload 26
      // 71a: getstatic com/zelix/mc.R Ljava/lang/String;
      // 71d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 720: pop
      // 721: aload 26
      // 723: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 726: areturn
   }

   private iu[] M(Object[] param1) {
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
      // 004: checkcast com/zelix/hy
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/String
      // 016: astore 2
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 6
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/am
      // 028: astore 4
      // 02a: pop
      // 02b: getstatic com/zelix/_82.d J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 80365434889148
      // 039: lxor
      // 03a: dup2
      // 03b: bipush 32
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 8
      // 041: dup2
      // 042: bipush 32
      // 044: lshl
      // 045: bipush 48
      // 047: lushr
      // 048: l2i
      // 049: istore 9
      // 04b: dup2
      // 04c: bipush 48
      // 04e: lshl
      // 04f: bipush 48
      // 051: lushr
      // 052: l2i
      // 053: istore 10
      // 055: pop2
      // 056: dup2
      // 057: ldc2_w 24530238592301
      // 05a: lxor
      // 05b: lstore 11
      // 05d: dup2
      // 05e: ldc2_w 136316551650094
      // 061: lxor
      // 062: lstore 13
      // 064: dup2
      // 065: ldc2_w 121317162115201
      // 068: lxor
      // 069: lstore 15
      // 06b: pop2
      // 06c: ldc2_w -1231710881837050263
      // 06f: lload 6
      // 071: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: new com/zelix/_fr
      // 079: dup
      // 07a: aload 5
      // 07c: lload 15
      // 07e: aload 2
      // 07f: bipush 2
      // 080: anewarray 402
      // 083: dup_x1
      // 084: swap
      // 085: bipush 1
      // 086: swap
      // 087: aastore
      // 088: dup_x2
      // 089: dup_x2
      // 08a: pop
      // 08b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e: bipush 0
      // 08f: swap
      // 090: aastore
      // 091: ldc2_w -1345438394016373734
      // 094: lload 6
      // 096: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: iload 8
      // 09d: swap
      // 09e: iload 9
      // 0a0: i2c
      // 0a1: swap
      // 0a2: iload 10
      // 0a4: swap
      // 0a5: invokespecial com/zelix/_fr.<init> (Ljava/lang/String;ICILjava/lang/String;)V
      // 0a8: astore 18
      // 0aa: astore 17
      // 0ac: aload 3
      // 0ad: lload 11
      // 0af: aload 18
      // 0b1: bipush 2
      // 0b2: anewarray 402
      // 0b5: dup_x1
      // 0b6: swap
      // 0b7: bipush 1
      // 0b8: swap
      // 0b9: aastore
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: ldc2_w -1350673036452823050
      // 0c6: lload 6
      // 0c8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: astore 19
      // 0cf: aload 19
      // 0d1: aload 17
      // 0d3: ifnull 155
      // 0d6: ifnull 123
      // 0d9: goto 0e7
      // 0dc: ldc2_w -713888777096513210
      // 0df: lload 6
      // 0e1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: aload 19
      // 0e9: aload 17
      // 0eb: ifnull 155
      // 0ee: goto 0fc
      // 0f1: ldc2_w -713888777096513210
      // 0f4: lload 6
      // 0f6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: lload 6
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: ifle 151
      // 103: arraylength
      // 104: ifle 123
      // 107: goto 115
      // 10a: ldc2_w -713888777096513210
      // 10d: lload 6
      // 10f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 19
      // 117: areturn
      // 118: ldc2_w -713888777096513210
      // 11b: lload 6
      // 11d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 0
      // 124: lload 13
      // 126: aload 3
      // 127: aload 18
      // 129: aload 4
      // 12b: bipush 4
      // 12c: anewarray 402
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 3
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 2
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 1
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x2
      // 13f: dup_x2
      // 140: pop
      // 141: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 144: bipush 0
      // 145: swap
      // 146: aastore
      // 147: ldc2_w -1047865648685425665
      // 14a: lload 6
      // 14c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: astore 19
      // 153: aload 19
      // 155: areturn
   }

   boolean x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      return x44.a<"h">(this, 6263158429606367191L, var2);
   }

   void E(Object[] param1) {
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
      // 004: checkcast com/zelix/mv
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 2
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/StringBuffer
      // 024: astore 5
      // 026: pop
      // 027: getstatic com/zelix/_82.d J
      // 02a: lload 2
      // 02b: lxor
      // 02c: lstore 2
      // 02d: lload 2
      // 02e: dup2
      // 02f: ldc2_w 31916214085151
      // 032: lxor
      // 033: lstore 7
      // 035: pop2
      // 036: ldc2_w 2958954767305101713
      // 039: lload 2
      // 03a: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: aload 6
      // 041: lload 7
      // 043: bipush 1
      // 044: anewarray 402
      // 047: dup_x2
      // 048: dup_x2
      // 049: pop
      // 04a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04d: bipush 0
      // 04e: swap
      // 04f: aastore
      // 050: ldc2_w 3110108081465735325
      // 053: lload 2
      // 054: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: astore 10
      // 05b: astore 9
      // 05d: iload 4
      // 05f: bipush 1
      // 060: if_icmpeq 075
      // 063: aload 10
      // 065: ifnonnull 080
      // 068: goto 075
      // 06b: ldc2_w 3598241021750935230
      // 06e: lload 2
      // 06f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: athrow
      // 075: return
      // 076: ldc2_w 3598241021750935230
      // 079: lload 2
      // 07a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: iload 4
      // 082: aload 9
      // 084: ifnull 0d3
      // 087: bipush 2
      // 088: if_icmpeq 0bd
      // 08b: goto 098
      // 08e: ldc2_w 3598241021750935230
      // 091: lload 2
      // 092: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: iload 4
      // 09a: aload 9
      // 09c: ifnull 0d3
      // 09f: goto 0ac
      // 0a2: ldc2_w 3598241021750935230
      // 0a5: lload 2
      // 0a6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: bipush 3
      // 0ad: if_icmpne 1c4
      // 0b0: goto 0bd
      // 0b3: ldc2_w 3598241021750935230
      // 0b6: lload 2
      // 0b7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: aload 5
      // 0bf: ldc "("
      // 0c1: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0c4: pop
      // 0c5: bipush 0
      // 0c6: goto 0d3
      // 0c9: ldc2_w 3598241021750935230
      // 0cc: lload 2
      // 0cd: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: istore 11
      // 0d5: iload 11
      // 0d7: aload 10
      // 0d9: arraylength
      // 0da: if_icmpge 1b6
      // 0dd: aload 9
      // 0df: ifnull 1c4
      // 0e2: iload 4
      // 0e4: bipush 3
      // 0e5: aload 9
      // 0e7: lload 2
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: ifle 148
      // 0ed: ifnull 140
      // 0f0: goto 0fd
      // 0f3: ldc2_w 3598241021750935230
      // 0f6: lload 2
      // 0f7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 133
      // 103: if_icmpne 130
      // 106: goto 113
      // 109: ldc2_w 3598241021750935230
      // 10c: lload 2
      // 10d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 5
      // 115: aload 10
      // 117: iload 11
      // 119: aaload
      // 11a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 11d: pop
      // 11e: aload 9
      // 120: ifnonnull 184
      // 123: goto 130
      // 126: ldc2_w 3598241021750935230
      // 129: lload 2
      // 12a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: iload 4
      // 132: bipush 2
      // 133: goto 140
      // 136: ldc2_w 3598241021750935230
      // 139: lload 2
      // 13a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: lload 2
      // 141: lconst_0
      // 142: lcmp
      // 143: ifle 18b
      // 146: aload 9
      // 148: ifnull 18b
      // 14b: if_icmpne 184
      // 14e: goto 15b
      // 151: ldc2_w 3598241021750935230
      // 154: lload 2
      // 155: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: aload 10
      // 15d: iload 11
      // 15f: aaload
      // 160: astore 12
      // 162: aload 12
      // 164: ldc "."
      // 166: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 169: istore 13
      // 16b: iload 13
      // 16d: bipush -1
      // 16e: if_icmple 17c
      // 171: aload 12
      // 173: iload 13
      // 175: bipush 1
      // 176: iadd
      // 177: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 17a: astore 12
      // 17c: aload 5
      // 17e: aload 12
      // 180: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 183: pop
      // 184: iload 11
      // 186: aload 10
      // 188: arraylength
      // 189: bipush 1
      // 18a: isub
      // 18b: if_icmpge 1ae
      // 18e: aload 5
      // 190: sipush 19105
      // 193: ldc2_w 1488172670882391935
      // 196: lload 2
      // 197: lxor
      // 198: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1a0: pop
      // 1a1: goto 1ae
      // 1a4: ldc2_w 3598241021750935230
      // 1a7: lload 2
      // 1a8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: iinc 11 1
      // 1b1: aload 9
      // 1b3: ifnonnull 0d5
      // 1b6: aload 5
      // 1b8: ldc ")"
      // 1ba: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1bd: lload 2
      // 1be: lconst_0
      // 1bf: lcmp
      // 1c0: ifle 1a0
      // 1c3: pop
      // 1c4: return
   }

   private iu[] H(Object[] param1) {
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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/hy
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_fr
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/am
      // 021: astore 5
      // 023: pop
      // 024: getstatic com/zelix/_82.d J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 98165925771143
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 80242500079715
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 58264564365700
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 125860550251641
      // 044: lxor
      // 045: lstore 13
      // 047: dup2
      // 048: ldc2_w 124913407006508
      // 04b: lxor
      // 04c: dup2
      // 04d: bipush 32
      // 04f: lushr
      // 050: l2i
      // 051: istore 15
      // 053: dup2
      // 054: bipush 32
      // 056: lshl
      // 057: bipush 48
      // 059: lushr
      // 05a: l2i
      // 05b: istore 16
      // 05d: dup2
      // 05e: bipush 48
      // 060: lshl
      // 061: bipush 48
      // 063: lushr
      // 064: l2i
      // 065: istore 17
      // 067: pop2
      // 068: pop2
      // 069: ldc2_w -3728318044379499325
      // 06c: lload 2
      // 06d: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: aload 4
      // 074: lload 7
      // 076: aload 6
      // 078: bipush 2
      // 079: anewarray 402
      // 07c: dup_x1
      // 07d: swap
      // 07e: bipush 1
      // 07f: swap
      // 080: aastore
      // 081: dup_x2
      // 082: dup_x2
      // 083: pop
      // 084: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 087: bipush 0
      // 088: swap
      // 089: aastore
      // 08a: ldc2_w -3464608414304445092
      // 08d: lload 2
      // 08e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: astore 19
      // 095: astore 18
      // 097: aload 19
      // 099: aload 18
      // 09b: ifnull 0b0
      // 09e: ifnull 0d6
      // 0a1: goto 0ae
      // 0a4: ldc2_w -3117178171719672852
      // 0a7: lload 2
      // 0a8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 19
      // 0b0: aload 18
      // 0b2: ifnull 0d5
      // 0b5: arraylength
      // 0b6: ifle 0d6
      // 0b9: goto 0c6
      // 0bc: ldc2_w -3117178171719672852
      // 0bf: lload 2
      // 0c0: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 19
      // 0c8: goto 0d5
      // 0cb: ldc2_w -3117178171719672852
      // 0ce: lload 2
      // 0cf: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: areturn
      // 0d6: aload 4
      // 0d8: iload 15
      // 0da: iload 16
      // 0dc: iload 17
      // 0de: i2c
      // 0df: invokevirtual com/zelix/hy.O (IIC)Ljava/lang/String;
      // 0e2: astore 20
      // 0e4: aload 20
      // 0e6: sipush 30271
      // 0e9: ldc2_w 7025180671708855968
      // 0ec: lload 2
      // 0ed: lxor
      // 0ee: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f6: ifne 19e
      // 0f9: aload 5
      // 0fb: lload 9
      // 0fd: aload 20
      // 0ff: bipush 2
      // 100: anewarray 402
      // 103: dup_x1
      // 104: swap
      // 105: bipush 1
      // 106: swap
      // 107: aastore
      // 108: dup_x2
      // 109: dup_x2
      // 10a: pop
      // 10b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10e: bipush 0
      // 10f: swap
      // 110: aastore
      // 111: ldc2_w -3306046418144514753
      // 114: lload 2
      // 115: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: aload 18
      // 11c: ifnull 1a0
      // 11f: goto 12c
      // 122: ldc2_w -3117178171719672852
      // 125: lload 2
      // 126: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: astore 21
      // 12e: aload 0
      // 12f: lload 11
      // 131: aload 21
      // 133: aload 6
      // 135: aload 5
      // 137: bipush 4
      // 138: anewarray 402
      // 13b: dup_x1
      // 13c: swap
      // 13d: bipush 3
      // 13e: swap
      // 13f: aastore
      // 140: dup_x1
      // 141: swap
      // 142: bipush 2
      // 143: swap
      // 144: aastore
      // 145: dup_x1
      // 146: swap
      // 147: bipush 1
      // 148: swap
      // 149: aastore
      // 14a: dup_x2
      // 14b: dup_x2
      // 14c: pop
      // 14d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 150: bipush 0
      // 151: swap
      // 152: aastore
      // 153: ldc2_w -3179694470210815659
      // 156: lload 2
      // 157: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: astore 19
      // 15e: aload 19
      // 160: lload 2
      // 161: lconst_0
      // 162: lcmp
      // 163: ifle 16b
      // 166: ifnull 19e
      // 169: aload 19
      // 16b: aload 18
      // 16d: ifnull 19d
      // 170: goto 17d
      // 173: ldc2_w -3117178171719672852
      // 176: lload 2
      // 177: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: arraylength
      // 17e: ifle 19e
      // 181: goto 18e
      // 184: ldc2_w -3117178171719672852
      // 187: lload 2
      // 188: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 19
      // 190: goto 19d
      // 193: ldc2_w -3117178171719672852
      // 196: lload 2
      // 197: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: areturn
      // 19e: aload 4
      // 1a0: lload 13
      // 1a2: bipush 1
      // 1a3: anewarray 402
      // 1a6: dup_x2
      // 1a7: dup_x2
      // 1a8: pop
      // 1a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ac: bipush 0
      // 1ad: swap
      // 1ae: aastore
      // 1af: ldc2_w -2965939616040971499
      // 1b2: lload 2
      // 1b3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: astore 21
      // 1ba: aload 21
      // 1bc: astore 22
      // 1be: aload 22
      // 1c0: arraylength
      // 1c1: istore 23
      // 1c3: bipush 0
      // 1c4: istore 24
      // 1c6: iload 24
      // 1c8: iload 23
      // 1ca: if_icmpge 281
      // 1cd: aload 22
      // 1cf: iload 24
      // 1d1: aaload
      // 1d2: astore 25
      // 1d4: aload 5
      // 1d6: lload 9
      // 1d8: aload 25
      // 1da: bipush 2
      // 1db: anewarray 402
      // 1de: dup_x1
      // 1df: swap
      // 1e0: bipush 1
      // 1e1: swap
      // 1e2: aastore
      // 1e3: dup_x2
      // 1e4: dup_x2
      // 1e5: pop
      // 1e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e9: bipush 0
      // 1ea: swap
      // 1eb: aastore
      // 1ec: ldc2_w -3306046418144514753
      // 1ef: lload 2
      // 1f0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: astore 26
      // 1f7: aload 0
      // 1f8: lload 11
      // 1fa: aload 26
      // 1fc: aload 6
      // 1fe: aload 5
      // 200: bipush 4
      // 201: anewarray 402
      // 204: dup_x1
      // 205: swap
      // 206: bipush 3
      // 207: swap
      // 208: aastore
      // 209: dup_x1
      // 20a: swap
      // 20b: bipush 2
      // 20c: swap
      // 20d: aastore
      // 20e: dup_x1
      // 20f: swap
      // 210: bipush 1
      // 211: swap
      // 212: aastore
      // 213: dup_x2
      // 214: dup_x2
      // 215: pop
      // 216: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 219: bipush 0
      // 21a: swap
      // 21b: aastore
      // 21c: ldc2_w -3179694470210815659
      // 21f: lload 2
      // 220: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: astore 19
      // 227: aload 18
      // 229: lload 2
      // 22a: lconst_0
      // 22b: lcmp
      // 22c: ifle 27e
      // 22f: ifnull 27c
      // 232: aload 19
      // 234: ifnull 279
      // 237: goto 244
      // 23a: ldc2_w -3117178171719672852
      // 23d: lload 2
      // 23e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: aload 19
      // 246: aload 18
      // 248: ifnull 278
      // 24b: goto 258
      // 24e: ldc2_w -3117178171719672852
      // 251: lload 2
      // 252: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: athrow
      // 258: arraylength
      // 259: ifle 279
      // 25c: goto 269
      // 25f: ldc2_w -3117178171719672852
      // 262: lload 2
      // 263: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: athrow
      // 269: aload 19
      // 26b: goto 278
      // 26e: ldc2_w -3117178171719672852
      // 271: lload 2
      // 272: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: athrow
      // 278: areturn
      // 279: iinc 24 1
      // 27c: aload 18
      // 27e: ifnonnull 1c6
      // 281: aconst_null
      // 282: areturn
   }

   String o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      return x44.a<"i">(this, 2528416323864599514L, var2);
   }

   String r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 53473606430580L;
      return x44.a<"h">(x44.a<"l">(this, 259065176277375723L, var2), new Object[]{var4}, 485541930990713262L, var2);
   }

   boolean M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 111019811755355L;
      return x44.a<"i">(x44.a<"m">(this, -452297840973569846L, var2), new Object[]{var4}, -176583345858182727L, var2);
   }

   static {
      long var20 = d ^ 15957624832067L;
      long var22 = var20 ^ 5951723151170L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[18];
      int var16 = 0;
      String var15 = "\u008eÔ\u0017'å\u0016\u0011\nÅv4ËôN \u0097\u0089\t¥\u0089,JÐ\"oÙ¦<\u0006#zq(1OD\rÔ¨jû\u0080[\fktZ%\u001dk(\u0014i\u0016ÐG\u0092Z0¼\u008a-\u008d\u00adù\u000f!ð\u0019f¨Û¿\u0010C\u0010.\u0010m\u008e\u008dP\u008c\u0018ÛQÄ\u0011ÒJ(³e\u0013§\n¿þ2ÕÜ`\u0081]\u0000Ñ\u0096.[\u0084å\u0010ûNqÉ/@\u0089 ø\f\u0015\u0016\u009e'ÅëÄÚ'\u0010\u00045Lbµ\u0086õ<\u007f\\\u009e*{Ñ)S \"rêdÕª4µ\u001c·Ù\u008d\u009eØì\u0099\u0091\f\u0001\u009a\u008aß\u0011þw\u001c~\u0007nýñî\u0018Í#ð¤Xà\u0081v\u000f\u0080bæ4\u008c§c^z¾L.\u0014±N »^&ú³\u0010[·òÒë{9,\u009cÎT'h\u0094õêlÅeüY&ýÍ\u0015~\u0010+/|\u0001JÊ\u0015¬d\u0014è^¢b¨~\u0010'ç\u001a+v¹*.AÙ\u008d[\n,\u0014e\u0010öÏS\ráÇÁÁ\\ýÄ~7eGÁ\u0010\u009bS\u009eêì\u009dë:ãàI>\u0087\u009dÍc\u0010\u0091Ó\u0004A\fæ´\f\u0015/]Êw~O  \u0091\bÇÒ\u0018ûpß\u0001®¹Í\u0014\u0011\u0018\u001b`\u0014\u0012ø<=@êå\u0005\ru\u0080&¨w8³î\u00adû0à\u008b\u008d»z~þuðw=\u009f]oÖ+^qT\u009c\u001d¹\u009ab,\u0085\u008ea\u0080\u009dI}\u000bÆãX4\u0084¹:Bô(èÇÅÛ\u001a\u0092±\u0099\u0010` ÿ·¹\u0019f\u008c\u0090@!à\u0019S¤.";
      int var17 = "\u008eÔ\u0017'å\u0016\u0011\nÅv4ËôN \u0097\u0089\t¥\u0089,JÐ\"oÙ¦<\u0006#zq(1OD\rÔ¨jû\u0080[\fktZ%\u001dk(\u0014i\u0016ÐG\u0092Z0¼\u008a-\u008d\u00adù\u000f!ð\u0019f¨Û¿\u0010C\u0010.\u0010m\u008e\u008dP\u008c\u0018ÛQÄ\u0011ÒJ(³e\u0013§\n¿þ2ÕÜ`\u0081]\u0000Ñ\u0096.[\u0084å\u0010ûNqÉ/@\u0089 ø\f\u0015\u0016\u009e'ÅëÄÚ'\u0010\u00045Lbµ\u0086õ<\u007f\\\u009e*{Ñ)S \"rêdÕª4µ\u001c·Ù\u008d\u009eØì\u0099\u0091\f\u0001\u009a\u008aß\u0011þw\u001c~\u0007nýñî\u0018Í#ð¤Xà\u0081v\u000f\u0080bæ4\u008c§c^z¾L.\u0014±N »^&ú³\u0010[·òÒë{9,\u009cÎT'h\u0094õêlÅeüY&ýÍ\u0015~\u0010+/|\u0001JÊ\u0015¬d\u0014è^¢b¨~\u0010'ç\u001a+v¹*.AÙ\u008d[\n,\u0014e\u0010öÏS\ráÇÁÁ\\ýÄ~7eGÁ\u0010\u009bS\u009eêì\u009dë:ãàI>\u0087\u009dÍc\u0010\u0091Ó\u0004A\fæ´\f\u0015/]Êw~O  \u0091\bÇÒ\u0018ûpß\u0001®¹Í\u0014\u0011\u0018\u001b`\u0014\u0012ø<=@êå\u0005\ru\u0080&¨w8³î\u00adû0à\u008b\u008d»z~þuðw=\u009f]oÖ+^qT\u009c\u001d¹\u009ab,\u0085\u008ea\u0080\u009dI}\u000bÆãX4\u0084¹:Bô(èÇÅÛ\u001a\u0092±\u0099\u0010` ÿ·¹\u0019f\u008c\u0090@!à\u0019S¤."
         .length();
      char var14 = ' ';
      int var26 = -1;

      label54:
      while (true) {
         String var27 = var15.substring(++var26, var26 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var39 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var39;
                  if ((var26 += var14) >= var17) {
                     e = var18;
                     f = new String[18];
                     n = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[14];
                     int var3 = 0;
                     String var4 = "äßNÃ\u0005Â³v\"\u0088£$\u0086}ØN{Õ\\ÕnsÎ\u0085A*µ4\u001f[îº¶s½\u000b3\u00888ÿ:[H\u00ad#ÒM¾d»³?$5½\u0097þ\u008ejÌ\u0000\u008esÝêZÜ\u000e6Dè\u0016¿ÀXÂ·G÷\u001d`«ÝÀrß{ë¦\u0080^¿Aæ\u0002ë";
                     int var5 = "äßNÃ\u0005Â³v\"\u0088£$\u0086}ØN{Õ\\ÕnsÎ\u0085A*µ4\u001f[îº¶s½\u000b3\u00888ÿ:[H\u00ad#ÒM¾d»³?$5½\u0097þ\u008ejÌ\u0000\u008esÝêZÜ\u000e6Dè\u0016¿ÀXÂ·G÷\u001d`«ÝÀrß{ë¦\u0080^¿Aæ\u0002ë"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var30 = var6;
                        var10001 = var3++;
                        long var43 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var8 = var43;
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
                           long var48 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var46) {
                              case 0:
                                 var30[var10001] = var48;
                                 if (var2 >= var5) {
                                    l = var6;
                                    m = new Integer[14];
                                    j = new String[0];
                                    var10001 = c<"g">(19747, 6871993012153988371L ^ var20);
                                    Object[] var49 = new Object[]{null, null, var22};
                                    var49[1] = var10001;
                                    var49[0] = 4;
                                    x44.a<"u">(x44.a<"t">(var49, 3488612780014270738L, var20), 3488509916572174834L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var30[var10001] = var48;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u009c\u009eæÔ\u0088byÖ4Ò\u0086\u009b\u0090zCÜ";
                                 var5 = "\u009c\u009eæÔ\u0088byÖ4Ò\u0086\u009b\u0090zCÜ".length();
                                 var2 = 0;
                           }

                           byte var36 = var2;
                           var2 += 8;
                           var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                           var30 = var6;
                           var10001 = var3++;
                           var43 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var26);
                  break;
               default:
                  var18[var16++] = var39;
                  if ((var26 += var14) < var17) {
                     var14 = var15.charAt(var26);
                     continue label54;
                  }

                  var15 = "ä\u0018\u0093Pw\u0082\u008cÅnP®_\u0013á\u0007\u0096x\u0092\u001e\u007f|p¬\f½\u009a6,\u0012\u0084\t«\u0001ô@ìò¾ü\u00184mù±\u0012\r?\nQp\bì\u0085£]\u0099N\u001e3¨]Ô\u0011\u0003©ß\u001eh\u0013iÑ¡úô[ö\u009dÜªÈ\u001b¥b½*,Ð(¼ºH\u009cg\u0001+\u009f±Öu\u001e8\u008f\u0088°î\u0081]qzg\u008cëÆÐ¨S©[ç®\u0016\u0003Û=\u0089\u0099\u0093OG¦ÊI`,\u0090£}";
                  var17 = "ä\u0018\u0093Pw\u0082\u008cÅnP®_\u0013á\u0007\u0096x\u0092\u001e\u007f|p¬\f½\u009a6,\u0012\u0084\t«\u0001ô@ìò¾ü\u00184mù±\u0012\r?\nQp\bì\u0085£]\u0099N\u001e3¨]Ô\u0011\u0003©ß\u001eh\u0013iÑ¡úô[ö\u009dÜªÈ\u001b¥b½*,Ð(¼ºH\u009cg\u0001+\u009f±Öu\u001e8\u008f\u0088°î\u0081]qzg\u008cëÆÐ¨S©[ç®\u0016\u0003Û=\u0089\u0099\u0093OG¦ÊI`,\u0090£}"
                     .length();
                  var14 = 16;
                  var26 = -1;
            }

            var27 = var15.substring(++var26, var26 + var14);
            var10001 = 0;
         }
      }
   }

   final boolean n(Object[] param1) {
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
      // 004: checkcast com/zelix/_ri
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/a7
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/_82.d J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 95303081096034
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 14042828878256
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 59393787977559
      // 034: lxor
      // 035: lstore 10
      // 037: dup2
      // 038: ldc2_w 115385736951351
      // 03b: lxor
      // 03c: lstore 12
      // 03e: dup2
      // 03f: ldc2_w 24763643759570
      // 042: lxor
      // 043: lstore 14
      // 045: dup2
      // 046: ldc2_w 138302378768003
      // 049: lxor
      // 04a: lstore 16
      // 04c: dup2
      // 04d: ldc2_w 85404085768888
      // 050: lxor
      // 051: lstore 18
      // 053: dup2
      // 054: ldc2_w 1655735007323
      // 057: lxor
      // 058: lstore 20
      // 05a: pop2
      // 05b: ldc2_w 7096923824587676412
      // 05e: lload 3
      // 05f: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aload 5
      // 066: lload 10
      // 068: bipush 1
      // 069: anewarray 402
      // 06c: dup_x2
      // 06d: dup_x2
      // 06e: pop
      // 06f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 072: bipush 0
      // 073: swap
      // 074: aastore
      // 075: ldc2_w 8971321689134075048
      // 078: lload 3
      // 079: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: astore 23
      // 080: astore 22
      // 082: aload 2
      // 083: aload 23
      // 085: lload 14
      // 087: bipush 2
      // 088: anewarray 402
      // 08b: dup_x2
      // 08c: dup_x2
      // 08d: pop
      // 08e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 091: bipush 1
      // 092: swap
      // 093: aastore
      // 094: dup_x1
      // 095: swap
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: ldc2_w 8975323754739023447
      // 09c: lload 3
      // 09d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: astore 24
      // 0a4: aload 22
      // 0a6: ifnull 361
      // 0a9: aload 24
      // 0ab: ifnull 33f
      // 0ae: goto 0bb
      // 0b1: ldc2_w 8827761242355971539
      // 0b4: lload 3
      // 0b5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: bipush 1
      // 0bd: ldc2_w 7091107832041757394
      // 0c0: lload 3
      // 0c1: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: aload 0
      // 0c7: aload 24
      // 0c9: ldc2_w 6970342050487851127
      // 0cc: lload 3
      // 0cd: invokedynamic s (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: aload 2
      // 0d3: lload 20
      // 0d5: aload 24
      // 0d7: bipush 2
      // 0d8: anewarray 402
      // 0db: dup_x1
      // 0dc: swap
      // 0dd: bipush 1
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x2
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e6: bipush 0
      // 0e7: swap
      // 0e8: aastore
      // 0e9: ldc2_w 7102994194046993853
      // 0ec: lload 3
      // 0ed: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: astore 25
      // 0f4: lload 3
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: ifle 118
      // 0fa: aload 25
      // 0fc: ifnull 118
      // 0ff: aload 0
      // 100: aload 25
      // 102: ldc2_w 8825175868024024453
      // 105: lload 3
      // 106: invokedynamic s (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: goto 118
      // 10e: ldc2_w 8827761242355971539
      // 111: lload 3
      // 112: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: aload 5
      // 11a: lload 8
      // 11c: bipush 1
      // 11d: anewarray 402
      // 120: dup_x2
      // 121: dup_x2
      // 122: pop
      // 123: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 126: bipush 0
      // 127: swap
      // 128: aastore
      // 129: ldc2_w 8719755897297867504
      // 12c: lload 3
      // 12d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: aload 22
      // 134: ifnull 33e
      // 137: ifeq 332
      // 13a: goto 147
      // 13d: ldc2_w 8827761242355971539
      // 140: lload 3
      // 141: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: aload 5
      // 149: lload 6
      // 14b: bipush 1
      // 14c: anewarray 402
      // 14f: dup_x2
      // 150: dup_x2
      // 151: pop
      // 152: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 155: bipush 0
      // 156: swap
      // 157: aastore
      // 158: ldc2_w 6941888163741007593
      // 15b: lload 3
      // 15c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: istore 26
      // 163: iload 26
      // 165: lload 3
      // 166: lconst_0
      // 167: lcmp
      // 168: iflt 220
      // 16b: aload 22
      // 16d: ifnull 220
      // 170: ifge 1ee
      // 173: goto 180
      // 176: ldc2_w 8827761242355971539
      // 179: lload 3
      // 17a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: new com/zelix/_sm
      // 183: dup
      // 184: new java/lang/StringBuilder
      // 187: dup
      // 188: invokespecial java/lang/StringBuilder.<init> ()V
      // 18b: sipush 17007
      // 18e: ldc2_w 6906076789670962378
      // 191: lload 3
      // 192: lxor
      // 193: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19b: iload 26
      // 19d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1a0: sipush 13418
      // 1a3: ldc2_w 5254349461362053832
      // 1a6: lload 3
      // 1a7: lxor
      // 1a8: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: aload 5
      // 1b2: lload 16
      // 1b4: bipush 1
      // 1b5: anewarray 402
      // 1b8: dup_x2
      // 1b9: dup_x2
      // 1ba: pop
      // 1bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1be: bipush 0
      // 1bf: swap
      // 1c0: aastore
      // 1c1: ldc2_w 9131229216220401253
      // 1c4: lload 3
      // 1c5: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: sipush 6719
      // 1d0: ldc2_w 7238180954883701912
      // 1d3: lload 3
      // 1d4: lxor
      // 1d5: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1e0: invokespecial com/zelix/_sm.<init> (Ljava/lang/String;)V
      // 1e3: athrow
      // 1e4: ldc2_w 8827761242355971539
      // 1e7: lload 3
      // 1e8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: athrow
      // 1ee: aload 2
      // 1ef: aload 24
      // 1f1: aload 22
      // 1f3: ifnull 233
      // 1f6: lload 18
      // 1f8: bipush 2
      // 1f9: anewarray 402
      // 1fc: dup_x2
      // 1fd: dup_x2
      // 1fe: pop
      // 1ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 202: bipush 1
      // 203: swap
      // 204: aastore
      // 205: dup_x1
      // 206: swap
      // 207: bipush 0
      // 208: swap
      // 209: aastore
      // 20a: ldc2_w 7183715603406719864
      // 20d: lload 3
      // 20e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: goto 220
      // 216: ldc2_w 8827761242355971539
      // 219: lload 3
      // 21a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: athrow
      // 220: ifeq 316
      // 223: aload 2
      // 224: aload 24
      // 226: goto 233
      // 229: ldc2_w 8827761242355971539
      // 22c: lload 3
      // 22d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: iload 26
      // 235: lload 12
      // 237: bipush 3
      // 238: anewarray 402
      // 23b: dup_x2
      // 23c: dup_x2
      // 23d: pop
      // 23e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 241: bipush 2
      // 242: swap
      // 243: aastore
      // 244: dup_x1
      // 245: swap
      // 246: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 249: bipush 1
      // 24a: swap
      // 24b: aastore
      // 24c: dup_x1
      // 24d: swap
      // 24e: bipush 0
      // 24f: swap
      // 250: aastore
      // 251: ldc2_w 6941406598262645238
      // 254: lload 3
      // 255: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: astore 27
      // 25c: aload 22
      // 25e: lload 3
      // 25f: lconst_0
      // 260: lcmp
      // 261: iflt 294
      // 264: ifnull 292
      // 267: aload 27
      // 269: ifnull 29d
      // 26c: goto 279
      // 26f: ldc2_w 8827761242355971539
      // 272: lload 3
      // 273: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: athrow
      // 279: aload 0
      // 27a: aload 27
      // 27c: ldc2_w 7090629264782929958
      // 27f: lload 3
      // 280: invokedynamic s (Ljava/lang/Object;Ljava/lang/Integer;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: goto 292
      // 288: ldc2_w 8827761242355971539
      // 28b: lload 3
      // 28c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: athrow
      // 292: aload 22
      // 294: lload 3
      // 295: lconst_0
      // 296: lcmp
      // 297: ifle 313
      // 29a: ifnonnull 30b
      // 29d: new com/zelix/_sm
      // 2a0: dup
      // 2a1: new java/lang/StringBuilder
      // 2a4: dup
      // 2a5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a8: sipush 20957
      // 2ab: ldc2_w 7127416450870048633
      // 2ae: lload 3
      // 2af: lxor
      // 2b0: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b8: iload 26
      // 2ba: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2bd: sipush 22664
      // 2c0: ldc2_w 5531717087915769376
      // 2c3: lload 3
      // 2c4: lxor
      // 2c5: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cd: aload 5
      // 2cf: lload 16
      // 2d1: bipush 1
      // 2d2: anewarray 402
      // 2d5: dup_x2
      // 2d6: dup_x2
      // 2d7: pop
      // 2d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2db: bipush 0
      // 2dc: swap
      // 2dd: aastore
      // 2de: ldc2_w 9131229216220401253
      // 2e1: lload 3
      // 2e2: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ea: sipush 8818
      // 2ed: ldc2_w 189820368331146432
      // 2f0: lload 3
      // 2f1: lxor
      // 2f2: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2fd: invokespecial com/zelix/_sm.<init> (Ljava/lang/String;)V
      // 300: athrow
      // 301: ldc2_w 8827761242355971539
      // 304: lload 3
      // 305: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: athrow
      // 30b: lload 3
      // 30c: lconst_0
      // 30d: lcmp
      // 30e: ifle 33d
      // 311: aload 22
      // 313: ifnonnull 332
      // 316: aload 0
      // 317: iload 26
      // 319: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 31c: ldc2_w 7090629264782929958
      // 31f: lload 3
      // 320: invokedynamic s (Ljava/lang/Object;Ljava/lang/Integer;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 325: goto 332
      // 328: ldc2_w 8827761242355971539
      // 32b: lload 3
      // 32c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: aload 0
      // 333: bipush 1
      // 334: ldc2_w 9042765622916424700
      // 337: lload 3
      // 338: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: bipush 1
      // 33e: ireturn
      // 33f: aload 0
      // 340: aload 23
      // 342: ldc2_w 6970342050487851127
      // 345: lload 3
      // 346: invokedynamic s (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: aload 0
      // 34c: bipush 0
      // 34d: ldc2_w 7091107832041757394
      // 350: lload 3
      // 351: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 356: aload 0
      // 357: bipush 0
      // 358: ldc2_w 9042765622916424700
      // 35b: lload 3
      // 35c: invokedynamic s (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: bipush 0
      // 362: ireturn
   }

   _82() {
   }

   public boolean V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      return x44.a<"k">(this, 2402666635230812653L, var2);
   }

   String f(Object[] var1) {
      String var2;
      int[] var8;
      String var9;
      long var13;
      String var14;
      label36: {
         a7 var3;
         long var6;
         label35: {
            var2 = (String)var1[0];
            var3 = (a7)var1[1];
            long var4 = (Long)var1[2];
            var13 = d ^ var4;
            var6 = var13 ^ 126039369231120L;
            int[] var10000 = x44.a<"r">(4809618703201745470L, var13);
            int var10 = var2.indexOf("[");
            var8 = var10000;
            if (var10 != -1) {
               var9 = var2.substring(var10);
               var14 = var2.substring(0, var10);
               if (var13 < 0L) {
                  break label36;
               }

               var2 = var14;
               if (var8 != null) {
                  break label35;
               }
            }

            var9 = "";
         }

         var14 = x44.a<"j">(var3, new Object[]{var2, var6}, 6650872455805804181L, var13);
      }

      String var11 = var14;

      try {
         if (var8 == null) {
            return var11;
         }

         if (var11 != null) {
            return var11 + var9;
         }
      } catch (gj var12) {
         throw x44.a<"r">(var12, 6503450957826921745L, var13);
      }

      return var2 + var9;
   }

   String[] y(Object[] param1) {
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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/util/List
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/a7
      // 021: astore 4
      // 023: pop
      // 024: getstatic com/zelix/_82.d J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 15284309514746
      // 02f: lxor
      // 030: lstore 7
      // 032: pop2
      // 033: ldc2_w -2107390364446516672
      // 036: lload 2
      // 037: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 5
      // 03e: invokeinterface java/util/List.size ()I 1
      // 043: istore 10
      // 045: astore 9
      // 047: iload 10
      // 049: anewarray 13
      // 04c: astore 11
      // 04e: bipush 0
      // 04f: istore 12
      // 051: iload 12
      // 053: iload 10
      // 055: if_icmpge 0fe
      // 058: aload 5
      // 05a: iload 12
      // 05c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 061: checkcast java/lang/String
      // 064: astore 13
      // 066: lload 2
      // 067: lconst_0
      // 068: lcmp
      // 069: ifle 0a8
      // 06c: aload 11
      // 06e: aload 9
      // 070: ifnull 100
      // 073: iload 12
      // 075: aload 0
      // 076: aload 13
      // 078: aload 4
      // 07a: lload 7
      // 07c: bipush 3
      // 07d: anewarray 402
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 2
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 1
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x1
      // 08f: swap
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w -278232749583113393
      // 096: lload 2
      // 097: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: aastore
      // 09d: aload 6
      // 09f: aload 11
      // 0a1: iload 12
      // 0a3: aaload
      // 0a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a7: pop
      // 0a8: aload 9
      // 0aa: lload 2
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: ifle 0fb
      // 0b0: ifnull 0f9
      // 0b3: goto 0c0
      // 0b6: ldc2_w -414648739457845905
      // 0b9: lload 2
      // 0ba: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: iload 12
      // 0c2: iload 10
      // 0c4: bipush 1
      // 0c5: isub
      // 0c6: if_icmpge 0f6
      // 0c9: goto 0d6
      // 0cc: ldc2_w -414648739457845905
      // 0cf: lload 2
      // 0d0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 6
      // 0d8: sipush 12336
      // 0db: ldc2_w 9147722032697513509
      // 0de: lload 2
      // 0df: lxor
      // 0e0: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_82.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: pop
      // 0e9: goto 0f6
      // 0ec: ldc2_w -414648739457845905
      // 0ef: lload 2
      // 0f0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: iinc 12 1
      // 0f9: aload 9
      // 0fb: ifnonnull 051
      // 0fe: aload 11
      // 100: areturn
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19072;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_82", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/_82" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16890;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
            throw new RuntimeException("com/zelix/_82", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
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
         throw new RuntimeException("com/zelix/_82" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
