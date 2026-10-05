package com.zelix;

import java.io.PrintWriter;
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

public class bq extends hv {
   bc[] x;
   private static final long a = ess.a(6536936170545550758L, -7672798871422060001L, MethodHandles.lookup().lookupClass()).a(87029246862792L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public _uf B(Object[] param1) {
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
      // 00b: pop
      // 00c: getstatic com/zelix/bq.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 47828725899610
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 15767707902861
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 130551926202701
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 40400423323484
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 79350597517655
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 126016737813294
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 2655897366177
      // 041: lxor
      // 042: lstore 16
      // 044: dup2
      // 045: ldc2_w 49455838194676
      // 048: lxor
      // 049: lstore 18
      // 04b: dup2
      // 04c: ldc2_w 9853535598860
      // 04f: lxor
      // 050: lstore 20
      // 052: dup2
      // 053: ldc2_w 97596405825798
      // 056: lxor
      // 057: lstore 22
      // 059: dup2
      // 05a: ldc2_w 61775898727622
      // 05d: lxor
      // 05e: lstore 24
      // 060: pop2
      // 061: ldc2_w 7436249270815905624
      // 064: lload 2
      // 065: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: aload 0
      // 06b: ldc2_w 8902001964993798524
      // 06e: lload 2
      // 06f: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: arraylength
      // 075: istore 27
      // 077: new com/zelix/_uf
      // 07a: dup
      // 07b: aload 0
      // 07c: lload 16
      // 07e: invokevirtual com/zelix/bq.d (J)Lcom/zelix/hz;
      // 081: lload 12
      // 083: dup2_x1
      // 084: pop2
      // 085: checkcast com/zelix/hy
      // 088: aload 0
      // 089: invokespecial com/zelix/_uf.<init> (JLcom/zelix/hy;Lcom/zelix/bq;)V
      // 08c: astore 28
      // 08e: istore 26
      // 090: bipush 0
      // 091: istore 29
      // 093: iload 29
      // 095: iload 27
      // 097: if_icmpge 3ce
      // 09a: aload 0
      // 09b: ldc2_w 8902001964993798524
      // 09e: lload 2
      // 09f: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: iload 29
      // 0a6: aaload
      // 0a7: astore 30
      // 0a9: iload 26
      // 0ab: lload 2
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: ifle 0ce
      // 0b1: ifeq 3c9
      // 0b4: aload 30
      // 0b6: lload 10
      // 0b8: bipush 1
      // 0b9: anewarray 405
      // 0bc: dup_x2
      // 0bd: dup_x2
      // 0be: pop
      // 0bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c2: bipush 0
      // 0c3: swap
      // 0c4: aastore
      // 0c5: ldc2_w 6919373059731733257
      // 0c8: lload 2
      // 0c9: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: lload 2
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: ifle 400
      // 0d4: iload 26
      // 0d6: ifeq 400
      // 0d9: goto 0e6
      // 0dc: ldc2_w 8817182891169234570
      // 0df: lload 2
      // 0e0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: ifeq 3c6
      // 0e9: goto 0f6
      // 0ec: ldc2_w 8817182891169234570
      // 0ef: lload 2
      // 0f0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 30
      // 0f8: iload 26
      // 0fa: lload 2
      // 0fb: lconst_0
      // 0fc: lcmp
      // 0fd: iflt 17e
      // 100: ifeq 17d
      // 103: goto 110
      // 106: ldc2_w 8817182891169234570
      // 109: lload 2
      // 10a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: sipush 9294
      // 113: ldc2_w 5005913103164433288
      // 116: lload 2
      // 117: lxor
      // 118: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: sipush 12517
      // 120: ldc2_w 2895869565671962415
      // 123: lload 2
      // 124: lxor
      // 125: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: lload 4
      // 12c: sipush 4666
      // 12f: ldc2_w 3528276356042806783
      // 132: lload 2
      // 133: lxor
      // 134: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: bipush 4
      // 13a: anewarray 405
      // 13d: dup_x1
      // 13e: swap
      // 13f: bipush 3
      // 140: swap
      // 141: aastore
      // 142: dup_x2
      // 143: dup_x2
      // 144: pop
      // 145: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 148: bipush 2
      // 149: swap
      // 14a: aastore
      // 14b: dup_x1
      // 14c: swap
      // 14d: bipush 1
      // 14e: swap
      // 14f: aastore
      // 150: dup_x1
      // 151: swap
      // 152: bipush 0
      // 153: swap
      // 154: aastore
      // 155: ldc2_w 7060126071087827998
      // 158: lload 2
      // 159: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: ifeq 3c6
      // 161: goto 16e
      // 164: ldc2_w 8817182891169234570
      // 167: lload 2
      // 168: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aload 30
      // 170: goto 17d
      // 173: ldc2_w 8817182891169234570
      // 176: lload 2
      // 177: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: bipush 0
      // 17e: anewarray 405
      // 181: ldc2_w 8664292639069942871
      // 184: lload 2
      // 185: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: astore 31
      // 18c: aload 31
      // 18e: bipush 0
      // 18f: aaload
      // 190: astore 32
      // 192: iload 26
      // 194: lload 2
      // 195: lconst_0
      // 196: lcmp
      // 197: ifle 1a2
      // 19a: ifeq 3c9
      // 19d: aload 32
      // 19f: instanceof com/zelix/md
      // 1a2: ifeq 3c6
      // 1a5: goto 1b2
      // 1a8: ldc2_w 8817182891169234570
      // 1ab: lload 2
      // 1ac: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: athrow
      // 1b2: aload 32
      // 1b4: checkcast com/zelix/md
      // 1b7: astore 33
      // 1b9: aload 33
      // 1bb: lload 6
      // 1bd: bipush 1
      // 1be: anewarray 405
      // 1c1: dup_x2
      // 1c2: dup_x2
      // 1c3: pop
      // 1c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c7: bipush 0
      // 1c8: swap
      // 1c9: aastore
      // 1ca: ldc2_w 9163357016424958657
      // 1cd: lload 2
      // 1ce: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: astore 34
      // 1d5: new com/zelix/wp
      // 1d8: dup
      // 1d9: invokespecial com/zelix/wp.<init> ()V
      // 1dc: astore 35
      // 1de: aload 34
      // 1e0: aload 35
      // 1e2: lload 18
      // 1e4: bipush 3
      // 1e5: anewarray 405
      // 1e8: dup_x2
      // 1e9: dup_x2
      // 1ea: pop
      // 1eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ee: bipush 2
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 1
      // 1f4: swap
      // 1f5: aastore
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: bipush 0
      // 1f9: swap
      // 1fa: aastore
      // 1fb: ldc2_w 8780110326131660919
      // 1fe: lload 2
      // 1ff: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: astore 36
      // 206: iload 26
      // 208: lload 2
      // 209: lconst_0
      // 20a: lcmp
      // 20b: iflt 3cb
      // 20e: ifeq 3c9
      // 211: aload 36
      // 213: ifnull 3c6
      // 216: goto 223
      // 219: ldc2_w 8817182891169234570
      // 21c: lload 2
      // 21d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: athrow
      // 223: bipush 0
      // 224: istore 37
      // 226: aload 36
      // 228: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 22d: astore 38
      // 22f: aload 38
      // 231: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 236: ifeq 297
      // 239: aload 38
      // 23b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 240: checkcast java/lang/String
      // 243: astore 39
      // 245: aload 39
      // 247: invokevirtual java/lang/String.length ()I
      // 24a: lload 2
      // 24b: lconst_0
      // 24c: lcmp
      // 24d: ifle 276
      // 250: iload 26
      // 252: ifeq 272
      // 255: bipush 2
      // 256: iload 26
      // 258: ifeq 097
      // 25b: lload 2
      // 25c: lconst_0
      // 25d: lcmp
      // 25e: iflt 097
      // 261: goto 26e
      // 264: ldc2_w 8817182891169234570
      // 267: lload 2
      // 268: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: athrow
      // 26e: if_icmplt 27f
      // 271: bipush 1
      // 272: istore 37
      // 274: iload 26
      // 276: lload 2
      // 277: lconst_0
      // 278: lcmp
      // 279: iflt 298
      // 27c: ifne 297
      // 27f: iload 26
      // 281: ifne 22f
      // 284: lload 2
      // 285: lconst_0
      // 286: lcmp
      // 287: iflt 245
      // 28a: goto 297
      // 28d: ldc2_w 8817182891169234570
      // 290: lload 2
      // 291: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: athrow
      // 297: bipush 0
      // 298: istore 38
      // 29a: aload 31
      // 29c: arraylength
      // 29d: iload 26
      // 29f: lload 2
      // 2a0: lconst_0
      // 2a1: lcmp
      // 2a2: iflt 36a
      // 2a5: ifeq 362
      // 2a8: bipush 1
      // 2a9: if_icmple 35a
      // 2ac: goto 2b9
      // 2af: ldc2_w 8817182891169234570
      // 2b2: lload 2
      // 2b3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: bipush 1
      // 2ba: istore 39
      // 2bc: iload 39
      // 2be: aload 31
      // 2c0: arraylength
      // 2c1: if_icmpge 35a
      // 2c4: aload 31
      // 2c6: iload 39
      // 2c8: aaload
      // 2c9: instanceof com/zelix/md
      // 2cc: iload 26
      // 2ce: lload 2
      // 2cf: lconst_0
      // 2d0: lcmp
      // 2d1: ifle 2d9
      // 2d4: ifeq 362
      // 2d7: iload 26
      // 2d9: ifeq 316
      // 2dc: goto 2e9
      // 2df: ldc2_w 8817182891169234570
      // 2e2: lload 2
      // 2e3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: athrow
      // 2e9: ifne 307
      // 2ec: goto 2f9
      // 2ef: ldc2_w 8817182891169234570
      // 2f2: lload 2
      // 2f3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: athrow
      // 2f9: bipush 1
      // 2fa: istore 38
      // 2fc: iload 26
      // 2fe: lload 2
      // 2ff: lconst_0
      // 300: lcmp
      // 301: iflt 309
      // 304: ifne 35a
      // 307: iload 37
      // 309: goto 316
      // 30c: ldc2_w 8817182891169234570
      // 30f: lload 2
      // 310: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: athrow
      // 316: ifne 352
      // 319: aload 31
      // 31b: iload 39
      // 31d: aaload
      // 31e: checkcast com/zelix/md
      // 321: lload 14
      // 323: ldc2_w 7216166319378006283
      // 326: lload 2
      // 327: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32c: astore 40
      // 32e: iload 26
      // 330: lload 2
      // 331: lconst_0
      // 332: lcmp
      // 333: iflt 357
      // 336: ifeq 355
      // 339: aload 40
      // 33b: invokevirtual java/lang/String.length ()I
      // 33e: bipush 2
      // 33f: if_icmplt 352
      // 342: goto 34f
      // 345: ldc2_w 8817182891169234570
      // 348: lload 2
      // 349: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: athrow
      // 34f: bipush 1
      // 350: istore 37
      // 352: iinc 39 1
      // 355: iload 26
      // 357: ifne 2bc
      // 35a: lload 2
      // 35b: lconst_0
      // 35c: lcmp
      // 35d: iflt 3c6
      // 360: iload 37
      // 362: lload 2
      // 363: lconst_0
      // 364: lcmp
      // 365: ifle 37f
      // 368: iload 26
      // 36a: ifeq 37f
      // 36d: ifeq 3c6
      // 370: goto 37d
      // 373: ldc2_w 8817182891169234570
      // 376: lload 2
      // 377: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: athrow
      // 37d: iload 38
      // 37f: ifne 3c6
      // 382: aload 28
      // 384: aload 30
      // 386: lload 20
      // 388: aload 36
      // 38a: aload 35
      // 38c: lload 24
      // 38e: invokevirtual com/zelix/wp.C (J)I
      // 391: bipush 4
      // 392: anewarray 405
      // 395: dup_x1
      // 396: swap
      // 397: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 39a: bipush 3
      // 39b: swap
      // 39c: aastore
      // 39d: dup_x1
      // 39e: swap
      // 39f: bipush 2
      // 3a0: swap
      // 3a1: aastore
      // 3a2: dup_x2
      // 3a3: dup_x2
      // 3a4: pop
      // 3a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a8: bipush 1
      // 3a9: swap
      // 3aa: aastore
      // 3ab: dup_x1
      // 3ac: swap
      // 3ad: bipush 0
      // 3ae: swap
      // 3af: aastore
      // 3b0: ldc2_w 7374753100013863311
      // 3b3: lload 2
      // 3b4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b9: goto 3c6
      // 3bc: ldc2_w 8817182891169234570
      // 3bf: lload 2
      // 3c0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c5: athrow
      // 3c6: iinc 29 1
      // 3c9: iload 26
      // 3cb: ifne 093
      // 3ce: aload 28
      // 3d0: lload 2
      // 3d1: lconst_0
      // 3d2: lcmp
      // 3d3: ifle 42c
      // 3d6: iload 26
      // 3d8: ifeq 42c
      // 3db: lload 22
      // 3dd: bipush 1
      // 3de: anewarray 405
      // 3e1: dup_x2
      // 3e2: dup_x2
      // 3e3: pop
      // 3e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e7: bipush 0
      // 3e8: swap
      // 3e9: aastore
      // 3ea: ldc2_w 7357747312647553274
      // 3ed: lload 2
      // 3ee: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: goto 400
      // 3f6: ldc2_w 8817182891169234570
      // 3f9: lload 2
      // 3fa: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ff: athrow
      // 400: ifne 42a
      // 403: aload 28
      // 405: lload 8
      // 407: bipush 1
      // 408: anewarray 405
      // 40b: dup_x2
      // 40c: dup_x2
      // 40d: pop
      // 40e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 411: bipush 0
      // 412: swap
      // 413: aastore
      // 414: ldc2_w 9059280530942132684
      // 417: lload 2
      // 418: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41d: goto 42a
      // 420: ldc2_w 8817182891169234570
      // 423: lload 2
      // 424: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 429: athrow
      // 42a: aload 28
      // 42c: areturn
   }

   protected void j(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/_ur
      // 020: astore 5
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 0
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 131957233766608
      // 02f: lxor
      // 030: lstore 9
      // 032: pop2
      // 033: ldc2_w -3106497998795710297
      // 036: lload 3
      // 037: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 0
      // 03d: aload 6
      // 03f: lload 7
      // 041: aload 2
      // 042: aload 5
      // 044: bipush 4
      // 045: anewarray 405
      // 048: dup_x1
      // 049: swap
      // 04a: bipush 3
      // 04b: swap
      // 04c: aastore
      // 04d: dup_x1
      // 04e: swap
      // 04f: bipush 2
      // 050: swap
      // 051: aastore
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 1
      // 059: swap
      // 05a: aastore
      // 05b: dup_x1
      // 05c: swap
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: invokespecial com/zelix/hv.j ([Ljava/lang/Object;)V
      // 063: istore 11
      // 065: aload 0
      // 066: iload 11
      // 068: ifne 0a2
      // 06b: ldc2_w -3795817549990238860
      // 06e: lload 3
      // 06f: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: ifeq 122
      // 077: goto 084
      // 07a: ldc2_w -3099922688144666580
      // 07d: lload 3
      // 07e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: aload 6
      // 086: aload 0
      // 087: ldc2_w -3085966035393359910
      // 08a: lload 3
      // 08b: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: arraylength
      // 091: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 094: aload 0
      // 095: goto 0a2
      // 098: ldc2_w -3099922688144666580
      // 09b: lload 3
      // 09c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: ldc2_w -3085966035393359910
      // 0a5: lload 3
      // 0a6: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: astore 12
      // 0ad: aload 12
      // 0af: arraylength
      // 0b0: istore 13
      // 0b2: bipush 0
      // 0b3: istore 14
      // 0b5: iload 14
      // 0b7: iload 13
      // 0b9: if_icmpge 117
      // 0bc: aload 12
      // 0be: iload 14
      // 0c0: aaload
      // 0c1: astore 15
      // 0c3: aload 15
      // 0c5: lload 9
      // 0c7: aload 6
      // 0c9: aload 2
      // 0ca: aload 5
      // 0cc: bipush 4
      // 0cd: anewarray 405
      // 0d0: dup_x1
      // 0d1: swap
      // 0d2: bipush 3
      // 0d3: swap
      // 0d4: aastore
      // 0d5: dup_x1
      // 0d6: swap
      // 0d7: bipush 2
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x1
      // 0db: swap
      // 0dc: bipush 1
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x2
      // 0e0: dup_x2
      // 0e1: pop
      // 0e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: ldc2_w -3929079328327291364
      // 0eb: lload 3
      // 0ec: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: iinc 14 1
      // 0f4: iload 11
      // 0f6: lload 3
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 101
      // 0fc: ifne 13e
      // 0ff: iload 11
      // 101: ifeq 0b5
      // 104: lload 3
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 0f4
      // 10a: goto 117
      // 10d: ldc2_w -3099922688144666580
      // 110: lload 3
      // 111: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: lload 3
      // 118: lconst_0
      // 119: lcmp
      // 11a: iflt 131
      // 11d: iload 11
      // 11f: ifeq 13e
      // 122: aload 6
      // 124: aload 0
      // 125: ldc2_w -4010137101812909442
      // 128: lload 3
      // 129: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: invokevirtual java/io/DataOutputStream.write ([B)V
      // 131: goto 13e
      // 134: ldc2_w -3099922688144666580
      // 137: lload 3
      // 138: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: return
   }

   bq(hz var1, mx var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 72360591245387L;
      super(var1, var5, var2, 2);
      x44.a<"v">(this, new bc[0], -1698848510848699750L, var3);
   }

   void N(long param1, _8l param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 10727274753381
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -5003033307729260843
      // 13: lload 1
      // 14: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: aload 3
      // 1a: aload 0
      // 1b: getfield com/zelix/bq.c Lcom/zelix/mx;
      // 1e: aload 0
      // 1f: aload 0
      // 20: invokevirtual com/zelix/bq.x ()Lcom/zelix/h8;
      // 23: lload 6
      // 25: invokevirtual com/zelix/_8l.H (Lcom/zelix/xl;Ljava/lang/Object;Ljava/lang/Object;J)Z
      // 28: pop
      // 29: istore 8
      // 2b: bipush 0
      // 2c: istore 9
      // 2e: iload 9
      // 30: aload 0
      // 31: ldc2_w -4945421828689682008
      // 34: lload 1
      // 35: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: arraylength
      // 3b: if_icmpge 5f
      // 3e: aload 0
      // 3f: ldc2_w -4945421828689682008
      // 42: lload 1
      // 43: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: iload 9
      // 4a: aaload
      // 4b: lload 4
      // 4d: aload 3
      // 4e: ldc2_w -4684430221624127568
      // 51: lload 1
      // 52: invokedynamic o (Ljava/lang/Object;JLjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: iinc 9 1
      // 5a: iload 8
      // 5c: ifeq 2e
      // 5f: lload 1
      // 60: lconst_0
      // 61: lcmp
      // 62: iflt 5a
      // 65: return
   }

   public void D(Object[] param1) {
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
      // 0e: checkcast java/util/Set
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/bq.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 83335696663870
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 7018176980552864015
      // 26: lload 2
      // 27: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 7
      // 2e: aload 0
      // 2f: iload 7
      // 31: ifeq 5b
      // 34: ldc2_w 7179848561512598917
      // 37: lload 2
      // 38: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: ifeq a5
      // 40: goto 4d
      // 43: ldc2_w 8938416592381491421
      // 46: lload 2
      // 47: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: goto 5b
      // 51: ldc2_w 8938416592381491421
      // 54: lload 2
      // 55: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: ldc2_w 9069418456882407211
      // 5e: lload 2
      // 5f: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: astore 8
      // 66: aload 8
      // 68: arraylength
      // 69: istore 9
      // 6b: bipush 0
      // 6c: istore 10
      // 6e: iload 10
      // 70: iload 9
      // 72: if_icmpge a5
      // 75: aload 8
      // 77: iload 10
      // 79: aaload
      // 7a: astore 11
      // 7c: aload 11
      // 7e: aload 4
      // 80: lload 5
      // 82: bipush 2
      // 83: anewarray 405
      // 86: dup_x2
      // 87: dup_x2
      // 88: pop
      // 89: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8c: bipush 1
      // 8d: swap
      // 8e: aastore
      // 8f: dup_x1
      // 90: swap
      // 91: bipush 0
      // 92: swap
      // 93: aastore
      // 94: ldc2_w 8721692089193843923
      // 97: lload 2
      // 98: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: iinc 10 1
      // a0: iload 7
      // a2: ifne 6e
      // a5: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public bc I(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 23683360251995L;
      long var7 = var3 ^ 8802163551663L;
      boolean var9 = x44.a<"w">(-9194494214395809780L, var3);

      label33: {
         int var10000;
         label32: {
            try {
               var10000 = var2;
               if (!var9) {
                  break label32;
               }

               if (var2 < 0) {
                  break label33;
               }
            } catch (IllegalArgumentException var12) {
               throw x44.a<"w">(var12, -7131264784535922210L, var3);
            }

            var10000 = var2;
         }

         try {
            if (var10000 < x44.a<"k">(this, -7143264302295153112L, var3).length) {
               return x44.a<"k">(this, -7143264302295153112L, var3)[var2];
            }
         } catch (IllegalArgumentException var11) {
            boolean var10001 = false;
            throw x44.a<"w">(var11, -7131264784535922210L, var3);
         }
      }

      try {
         throw new IllegalArgumentException(
            b<"b">(23903, 2444433042998197704L ^ var3)
               + x44.a<"o">(x44.a<"o">(this, new Object[]{var7}, -9071761655708981668L, var3), new Object[0], -9133244761724537868L, var3)
               + b<"b">(6725, 2496153317756386000L ^ var3)
               + this.o(var5)
               + b<"b">(14983, 3352343940364016151L ^ var3)
               + var2
               + ">"
               + (x44.a<"k">(this, -7143264302295153112L, var3).length - 1)
         );
      } catch (IllegalArgumentException var10) {
         boolean var15 = false;
         throw x44.a<"w">(var10, -7131264784535922210L, var3);
      }
   }

   public void G(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 0c: getstatic com/zelix/bq.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 66235776315754
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 2518813273265541790
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: ldc2_w 4488964701899564218
      // 2f: lload 2
      // 30: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: arraylength
      // 36: if_icmpge 70
      // 39: aload 0
      // 3a: ldc2_w 4488964701899564218
      // 3d: lload 2
      // 3e: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: iload 7
      // 45: aaload
      // 46: iload 7
      // 48: lload 4
      // 4a: bipush 2
      // 4b: anewarray 405
      // 4e: dup_x2
      // 4f: dup_x2
      // 50: pop
      // 51: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 54: bipush 1
      // 55: swap
      // 56: aastore
      // 57: dup_x1
      // 58: swap
      // 59: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w 2428591376393574504
      // 62: lload 2
      // 63: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: iinc 7 1
      // 6b: iload 6
      // 6d: ifne 29
      // 70: lload 2
      // 71: lconst_0
      // 72: lcmp
      // 73: iflt 6b
      // 76: return
   }

   protected void O(Object[] param1) {
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
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 4
      // 013: pop
      // 014: lload 2
      // 015: dup2
      // 016: ldc2_w 59519172545168
      // 019: lxor
      // 01a: lstore 5
      // 01c: dup2
      // 01d: ldc2_w 0
      // 020: lxor
      // 021: lstore 7
      // 023: pop2
      // 024: ldc2_w -8511028589403193946
      // 027: lload 2
      // 028: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: lload 7
      // 030: aload 4
      // 032: bipush 2
      // 033: anewarray 405
      // 036: dup_x1
      // 037: swap
      // 038: bipush 1
      // 039: swap
      // 03a: aastore
      // 03b: dup_x2
      // 03c: dup_x2
      // 03d: pop
      // 03e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 041: bipush 0
      // 042: swap
      // 043: aastore
      // 044: invokespecial com/zelix/hv.O ([Ljava/lang/Object;)V
      // 047: istore 9
      // 049: aload 0
      // 04a: iload 9
      // 04c: ifne 086
      // 04f: ldc2_w -7614518121811986315
      // 052: lload 2
      // 053: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: ifeq 0f9
      // 05b: goto 068
      // 05e: ldc2_w -8504031204301157075
      // 061: lload 2
      // 062: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 4
      // 06a: aload 0
      // 06b: ldc2_w -8634189739088866597
      // 06e: lload 2
      // 06f: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: arraylength
      // 075: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 078: aload 0
      // 079: goto 086
      // 07c: ldc2_w -8504031204301157075
      // 07f: lload 2
      // 080: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: ldc2_w -8634189739088866597
      // 089: lload 2
      // 08a: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: astore 10
      // 091: aload 10
      // 093: arraylength
      // 094: istore 11
      // 096: bipush 0
      // 097: istore 12
      // 099: iload 12
      // 09b: iload 11
      // 09d: if_icmpge 0ee
      // 0a0: aload 10
      // 0a2: iload 12
      // 0a4: aaload
      // 0a5: astore 13
      // 0a7: aload 13
      // 0a9: aload 4
      // 0ab: lload 5
      // 0ad: bipush 2
      // 0ae: anewarray 405
      // 0b1: dup_x2
      // 0b2: dup_x2
      // 0b3: pop
      // 0b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b7: bipush 1
      // 0b8: swap
      // 0b9: aastore
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: bipush 0
      // 0bd: swap
      // 0be: aastore
      // 0bf: ldc2_w -7568662237220402056
      // 0c2: lload 2
      // 0c3: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: iinc 12 1
      // 0cb: iload 9
      // 0cd: lload 2
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: ifle 0d8
      // 0d3: ifne 115
      // 0d6: iload 9
      // 0d8: ifeq 099
      // 0db: lload 2
      // 0dc: lconst_0
      // 0dd: lcmp
      // 0de: ifle 0cb
      // 0e1: goto 0ee
      // 0e4: ldc2_w -8504031204301157075
      // 0e7: lload 2
      // 0e8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: lload 2
      // 0ef: lconst_0
      // 0f0: lcmp
      // 0f1: ifle 108
      // 0f4: iload 9
      // 0f6: ifeq 115
      // 0f9: aload 4
      // 0fb: aload 0
      // 0fc: ldc2_w -7685285436080527489
      // 0ff: lload 2
      // 100: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: invokevirtual java/io/DataOutputStream.write ([B)V
      // 108: goto 115
      // 10b: ldc2_w -8504031204301157075
      // 10e: lload 2
      // 10f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: return
   }

   bc T(Object[] var1) {
      x_ var4 = (x_)var1[0];
      long var2 = (Long)var1[1];
      xl[] var5 = (xl[])var1[2];
      var2 = a ^ var2;
      long var10001 = var2 ^ 31825381570583L;
      int var6 = (int)((var2 ^ 31825381570583L) >>> 32);
      int var7 = (int)((var2 ^ 31825381570583L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 122319466004610L;
      bc[] var11 = new bc[x44.a<"i">(this, 1005436212593334018L, var2).length + 1];
      System.arraycopy(x44.a<"i">(this, 1005436212593334018L, var2), 0, var11, 0, x44.a<"i">(this, 1005436212593334018L, var2).length);
      bc var12 = new bc(this, var4, var5, var6, (short)var7, x44.a<"i">(this, 1005436212593334018L, var2).length, (short)var8);
      var11[x44.a<"i">(this, 1005436212593334018L, var2).length] = var12;
      x44.a<"v">(this, var11, 1005436212593334018L, var2);
      this.C = x44.a<"m">(this, var9, 856429584270854271L, var2);
      return var12;
   }

   bq(
      h8 param1,
      int param2,
      String param3,
      _xx param4,
      int param5,
      _y4 param6,
      _y4 param7,
      short param8,
      _y4 param9,
      _y4 param10,
      _y4 param11,
      PrintWriter param12,
      int param13
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 5
      // 002: i2l
      // 003: bipush 32
      // 005: lshl
      // 006: iload 8
      // 008: i2l
      // 009: bipush 48
      // 00b: lshl
      // 00c: bipush 32
      // 00e: lushr
      // 00f: lor
      // 010: iload 13
      // 012: i2l
      // 013: bipush 48
      // 015: lshl
      // 016: bipush 48
      // 018: lushr
      // 019: lor
      // 01a: getstatic com/zelix/bq.a J
      // 01d: lxor
      // 01e: lstore 14
      // 020: lload 14
      // 022: dup2
      // 023: ldc2_w 106204608122049
      // 026: lxor
      // 027: lstore 16
      // 029: dup2
      // 02a: ldc2_w 73488787058477
      // 02d: lxor
      // 02e: lstore 18
      // 030: dup2
      // 031: ldc2_w 83961040705122
      // 034: lxor
      // 035: lstore 20
      // 037: dup2
      // 038: ldc2_w 15014694301432
      // 03b: lxor
      // 03c: lstore 22
      // 03e: dup2
      // 03f: ldc2_w 48490581064627
      // 042: lxor
      // 043: lstore 24
      // 045: dup2
      // 046: ldc2_w 83425514421507
      // 049: lxor
      // 04a: lstore 26
      // 04c: pop2
      // 04d: aload 0
      // 04e: lload 18
      // 050: aload 1
      // 051: iload 2
      // 052: aload 3
      // 053: aload 4
      // 055: aload 6
      // 057: invokespecial com/zelix/hv.<init> (JLcom/zelix/h8;ILjava/lang/String;Lcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 05a: aload 0
      // 05b: getfield com/zelix/bq.C I
      // 05e: newarray 8
      // 060: astore 29
      // 062: ldc2_w -3547288307386876241
      // 065: lload 14
      // 067: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aload 4
      // 06e: aload 29
      // 070: invokevirtual com/zelix/_xx.read ([B)I
      // 073: pop
      // 074: aload 29
      // 076: lload 20
      // 078: bipush 0
      // 079: bipush 3
      // 07a: anewarray 405
      // 07d: dup_x1
      // 07e: swap
      // 07f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 082: bipush 2
      // 083: swap
      // 084: aastore
      // 085: dup_x2
      // 086: dup_x2
      // 087: pop
      // 088: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08b: bipush 1
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x1
      // 08f: swap
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w -3752599731593167713
      // 096: lload 14
      // 098: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: astore 30
      // 09f: istore 28
      // 0a1: aload 0
      // 0a2: iload 28
      // 0a4: ifeq 23d
      // 0a7: getfield com/zelix/bq.C I
      // 0aa: bipush 2
      // 0ab: if_icmplt 222
      // 0ae: goto 0bc
      // 0b1: ldc2_w -3194265601745315971
      // 0b4: lload 14
      // 0b6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 30
      // 0be: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0c1: istore 31
      // 0c3: aload 0
      // 0c4: iload 31
      // 0c6: anewarray 156
      // 0c9: ldc2_w -3279431026044352373
      // 0cc: lload 14
      // 0ce: invokedynamic w (Ljava/lang/Object;[Lcom/zelix/bc;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: bipush 0
      // 0d4: istore 32
      // 0d6: iload 32
      // 0d8: iload 31
      // 0da: if_icmpge 213
      // 0dd: aload 0
      // 0de: ldc2_w -3279431026044352373
      // 0e1: lload 14
      // 0e3: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: iload 32
      // 0ea: new com/zelix/bc
      // 0ed: dup
      // 0ee: aload 0
      // 0ef: aload 30
      // 0f1: iload 32
      // 0f3: aload 7
      // 0f5: aload 9
      // 0f7: aload 10
      // 0f9: aload 11
      // 0fb: lload 24
      // 0fd: aload 12
      // 0ff: invokespecial com/zelix/bc.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;ILcom/zelix/_y4;Lcom/zelix/_y4;Lcom/zelix/_y4;Lcom/zelix/_y4;JLjava/io/PrintWriter;)V
      // 102: aastore
      // 103: iload 28
      // 105: iload 13
      // 107: iflt 10f
      // 10a: ifeq 2b9
      // 10d: iload 28
      // 10f: iload 5
      // 111: iflt 210
      // 114: ifeq 20e
      // 117: goto 125
      // 11a: ldc2_w -3194265601745315971
      // 11d: lload 14
      // 11f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: aload 0
      // 126: ldc2_w -3279431026044352373
      // 129: lload 14
      // 12b: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: iload 32
      // 132: aaload
      // 133: lload 16
      // 135: bipush 1
      // 136: anewarray 405
      // 139: dup_x2
      // 13a: dup_x2
      // 13b: pop
      // 13c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13f: bipush 0
      // 140: swap
      // 141: aastore
      // 142: ldc2_w -3422644019922731966
      // 145: lload 14
      // 147: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: ifne 20b
      // 14f: goto 15d
      // 152: ldc2_w -3194265601745315971
      // 155: lload 14
      // 157: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: aload 0
      // 15e: bipush 0
      // 15f: ldc2_w -3745903167654763995
      // 162: lload 14
      // 164: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: aload 0
      // 16a: aload 29
      // 16c: ldc2_w -3528485182906712785
      // 16f: lload 14
      // 171: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: aload 12
      // 178: new java/lang/StringBuilder
      // 17b: dup
      // 17c: invokespecial java/lang/StringBuilder.<init> ()V
      // 17f: sipush 19470
      // 182: ldc2_w 4105009434942546489
      // 185: lload 14
      // 187: lxor
      // 188: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: aload 0
      // 191: lload 22
      // 193: invokevirtual com/zelix/bq.o (J)Ljava/lang/String;
      // 196: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 199: sipush 17193
      // 19c: ldc2_w 6463890198587551004
      // 19f: lload 14
      // 1a1: lxor
      // 1a2: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1aa: aload 0
      // 1ab: bipush 0
      // 1ac: anewarray 405
      // 1af: ldc2_w -3466880650480091817
      // 1b2: lload 14
      // 1b4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bc: sipush 1203
      // 1bf: ldc2_w 7618708544383806089
      // 1c2: lload 14
      // 1c4: lxor
      // 1c5: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cd: aload 0
      // 1ce: ldc2_w -3279431026044352373
      // 1d1: lload 14
      // 1d3: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: iload 32
      // 1da: aaload
      // 1db: lload 26
      // 1dd: bipush 1
      // 1de: anewarray 405
      // 1e1: dup_x2
      // 1e2: dup_x2
      // 1e3: pop
      // 1e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e7: bipush 0
      // 1e8: swap
      // 1e9: aastore
      // 1ea: ldc2_w -3592305779798867494
      // 1ed: lload 14
      // 1ef: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fa: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1fd: goto 20b
      // 200: ldc2_w -3194265601745315971
      // 203: lload 14
      // 205: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: athrow
      // 20b: iinc 32 1
      // 20e: iload 28
      // 210: ifne 0d6
      // 213: iload 13
      // 215: iflt 2b9
      // 218: iload 28
      // 21a: iload 5
      // 21c: iflt 105
      // 21f: ifne 2ad
      // 222: aload 0
      // 223: bipush 0
      // 224: ldc2_w -3745903167654763995
      // 227: lload 14
      // 229: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: aload 0
      // 22f: goto 23d
      // 232: ldc2_w -3194265601745315971
      // 235: lload 14
      // 237: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: aload 29
      // 23f: ldc2_w -3528485182906712785
      // 242: lload 14
      // 244: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: aload 12
      // 24b: new java/lang/StringBuilder
      // 24e: dup
      // 24f: invokespecial java/lang/StringBuilder.<init> ()V
      // 252: sipush 7009
      // 255: ldc2_w 4743783938202563929
      // 258: lload 14
      // 25a: lxor
      // 25b: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 263: aload 0
      // 264: lload 22
      // 266: invokevirtual com/zelix/bq.o (J)Ljava/lang/String;
      // 269: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26c: sipush 20086
      // 26f: ldc2_w 589167389271859270
      // 272: lload 14
      // 274: lxor
      // 275: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27d: aload 0
      // 27e: bipush 0
      // 27f: anewarray 405
      // 282: ldc2_w -3466880650480091817
      // 285: lload 14
      // 287: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28f: sipush 12538
      // 292: ldc2_w 5162035036249579201
      // 295: lload 14
      // 297: lxor
      // 298: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a0: aload 0
      // 2a1: getfield com/zelix/bq.C I
      // 2a4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2aa: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2ad: aload 30
      // 2af: ldc2_w -3804349327944227615
      // 2b2: lload 14
      // 2b4: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: goto 359
      // 2bc: astore 31
      // 2be: aload 0
      // 2bf: bipush 0
      // 2c0: ldc2_w -3745903167654763995
      // 2c3: lload 14
      // 2c5: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: aload 0
      // 2cb: aload 29
      // 2cd: ldc2_w -3528485182906712785
      // 2d0: lload 14
      // 2d2: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: aload 12
      // 2d9: new java/lang/StringBuilder
      // 2dc: dup
      // 2dd: invokespecial java/lang/StringBuilder.<init> ()V
      // 2e0: sipush 7009
      // 2e3: ldc2_w 4743783938202563929
      // 2e6: lload 14
      // 2e8: lxor
      // 2e9: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f1: aload 0
      // 2f2: lload 22
      // 2f4: invokevirtual com/zelix/bq.o (J)Ljava/lang/String;
      // 2f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fa: sipush 20086
      // 2fd: ldc2_w 589167389271859270
      // 300: lload 14
      // 302: lxor
      // 303: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30b: aload 0
      // 30c: bipush 0
      // 30d: anewarray 405
      // 310: ldc2_w -3466880650480091817
      // 313: lload 14
      // 315: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31d: sipush 21430
      // 320: ldc2_w 5551971419178646927
      // 323: lload 14
      // 325: lxor
      // 326: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32e: aload 31
      // 330: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 333: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 336: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 339: aload 30
      // 33b: ldc2_w -3804349327944227615
      // 33e: lload 14
      // 340: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: goto 359
      // 348: astore 33
      // 34a: aload 30
      // 34c: ldc2_w -3804349327944227615
      // 34f: lload 14
      // 351: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 356: aload 33
      // 358: athrow
      // 359: return
   }

   void C(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/bq.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 50628615656777
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w -2742492722938974796
      // 025: lload 3
      // 026: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: new java/util/ArrayList
      // 02e: dup
      // 02f: aload 0
      // 030: ldc2_w -2864491824091479351
      // 033: lload 3
      // 034: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: arraylength
      // 03a: invokespecial java/util/ArrayList.<init> (I)V
      // 03d: astore 8
      // 03f: istore 7
      // 041: aload 0
      // 042: ldc2_w -2864491824091479351
      // 045: lload 3
      // 046: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: astore 9
      // 04d: aload 9
      // 04f: arraylength
      // 050: istore 10
      // 052: bipush 0
      // 053: istore 11
      // 055: iload 11
      // 057: iload 10
      // 059: if_icmpge 0bd
      // 05c: aload 9
      // 05e: iload 11
      // 060: aaload
      // 061: astore 12
      // 063: iload 7
      // 065: lload 3
      // 066: lconst_0
      // 067: lcmp
      // 068: iflt 0ba
      // 06b: ifne 0b8
      // 06e: aload 2
      // 06f: aload 12
      // 071: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 076: iload 7
      // 078: lload 3
      // 079: lconst_0
      // 07a: lcmp
      // 07b: ifle 0d5
      // 07e: ifne 0ca
      // 081: goto 08e
      // 084: ldc2_w -2744405915325719233
      // 087: lload 3
      // 088: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: ifeq 0b5
      // 091: goto 09e
      // 094: ldc2_w -2744405915325719233
      // 097: lload 3
      // 098: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: aload 8
      // 0a0: aload 12
      // 0a2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a7: pop
      // 0a8: goto 0b5
      // 0ab: ldc2_w -2744405915325719233
      // 0ae: lload 3
      // 0af: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: iinc 11 1
      // 0b8: iload 7
      // 0ba: ifeq 055
      // 0bd: lload 3
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: ifle 113
      // 0c3: aload 8
      // 0c5: invokeinterface java/util/List.size ()I 1
      // 0ca: aload 0
      // 0cb: ldc2_w -2864491824091479351
      // 0ce: lload 3
      // 0cf: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: arraylength
      // 0d5: if_icmpge 113
      // 0d8: aload 0
      // 0d9: aload 8
      // 0db: aload 8
      // 0dd: invokeinterface java/util/List.size ()I 1
      // 0e2: anewarray 156
      // 0e5: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 0ea: checkcast [Lcom/zelix/bc;
      // 0ed: ldc2_w -2864491824091479351
      // 0f0: lload 3
      // 0f1: invokedynamic u (Ljava/lang/Object;[Lcom/zelix/bc;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: aload 0
      // 0f7: aload 0
      // 0f8: lload 5
      // 0fa: ldc2_w -2438163602823357004
      // 0fd: lload 3
      // 0fe: invokedynamic n (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: putfield com/zelix/bq.C I
      // 106: goto 113
      // 109: ldc2_w -2744405915325719233
      // 10c: lload 3
      // 10d: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   int x(long var1) {
      byte var10000 = x44.a<"w">(916934895870556413L, var1);
      int var4 = 2;
      bc[] var5 = x44.a<"k">(this, 970079142951425920L, var1);
      byte var3 = var10000;
      int var6 = var5.length;
      int var7 = 0;

      label39:
      while (var7 < var6) {
         bc var8 = var5[var7];
         var4 += x44.a<"o">(var8, new Object[0], 705573556701779232L, var1);

         try {
            var7++;
         } catch (IllegalArgumentException var10) {
            boolean var10001 = false;
            throw x44.a<"w">(var10, 909946304109561974L, var1);
         }

         do {
            try {
               if (var1 < 0L) {
                  return var3;
               }

               if (var3 != 0) {
                  return var4;
               }

               if (var3 == 0) {
                  continue label39;
               }
            } catch (IllegalArgumentException var9) {
               boolean var13 = false;
               throw x44.a<"w">(var9, 909946304109561974L, var1);
            }
         } while (var1 < 0L);
         break;
      }

      this.C = var4;
      return var4;
   }

   boolean t(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      boolean var4 = x44.a<"q">(-2010909067715030957L, var2);

      try {
         int var10000 = x44.a<"m">(this, -1884718641126080722L, var2).length;
         if (var4) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (IllegalArgumentException var5) {
         throw x44.a<"q">(var5, -2013517084375605032L, var2);
      }

      return (boolean)0;
   }

   public void m(Object[] param1) {
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
      // 0c: getstatic com/zelix/bq.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 13040124974968
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 31511361472714
      // 1e: lxor
      // 1f: lstore 6
      // 21: dup2
      // 22: ldc2_w 122421150795641
      // 25: lxor
      // 26: dup2
      // 27: bipush 32
      // 29: lushr
      // 2a: l2i
      // 2b: istore 8
      // 2d: dup2
      // 2e: bipush 32
      // 30: lshl
      // 31: bipush 48
      // 33: lushr
      // 34: l2i
      // 35: istore 9
      // 37: dup2
      // 38: bipush 48
      // 3a: lshl
      // 3b: bipush 48
      // 3d: lushr
      // 3e: l2i
      // 3f: istore 10
      // 41: pop2
      // 42: pop2
      // 43: ldc2_w -6995263510206173567
      // 46: lload 2
      // 47: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: istore 11
      // 4e: aload 0
      // 4f: iload 11
      // 51: ifeq 7b
      // 54: ldc2_w -7192895014110023157
      // 57: lload 2
      // 58: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: ifeq ec
      // 60: goto 6d
      // 63: ldc2_w -8969511665248843949
      // 66: lload 2
      // 67: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: goto 7b
      // 71: ldc2_w -8969511665248843949
      // 74: lload 2
      // 75: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: lload 4
      // 7d: invokevirtual com/zelix/bq.d (J)Lcom/zelix/hz;
      // 80: astore 12
      // 82: aload 12
      // 84: iload 8
      // 86: iload 9
      // 88: iload 10
      // 8a: i2c
      // 8b: invokevirtual com/zelix/hz.O (IIC)Ljava/lang/String;
      // 8e: sipush 26068
      // 91: ldc2_w 3105762605913398214
      // 94: lload 2
      // 95: lxor
      // 96: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/bq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 9e: ifeq ec
      // a1: aload 0
      // a2: ldc2_w -9055812885042882395
      // a5: lload 2
      // a6: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: astore 13
      // ad: aload 13
      // af: arraylength
      // b0: istore 14
      // b2: bipush 0
      // b3: istore 15
      // b5: iload 15
      // b7: iload 14
      // b9: if_icmpge ec
      // bc: aload 13
      // be: iload 15
      // c0: aaload
      // c1: astore 16
      // c3: aload 16
      // c5: aload 12
      // c7: lload 6
      // c9: bipush 2
      // ca: anewarray 405
      // cd: dup_x2
      // ce: dup_x2
      // cf: pop
      // d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d3: bipush 1
      // d4: swap
      // d5: aastore
      // d6: dup_x1
      // d7: swap
      // d8: bipush 0
      // d9: swap
      // da: aastore
      // db: ldc2_w -8790497395267107545
      // de: lload 2
      // df: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e4: iinc 15 1
      // e7: iload 11
      // e9: ifne b5
      // ec: return
   }

   static {
      long var0 = a ^ 21148358123719L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "º½|sEÎ®f\u0095S\u0083\u0000\u0091\u008f\u0014×@û-\u000eÍ\u0095Î`ø*?i\u008aóm\u009ef\u0082»¾\u0001Ùz¬\u001f:\\Â¼ò\u0099\u0018*4ÖèE±´¯ªøI²3\t\bi²\tUà\u0085\u008bjÄ\u0086B\u008c\u0097l¢auþĀ£tîáW\u00158ù9v\u009d÷è¸Q/(\nâ$òLÉÄi§·¨\u0015Ì\n~\u0007÷G>zf¥û±\u001e\u0082Ao_X\u0001\u001eÝ\u0088âd\u0082\u008d¸eéÇ¡6,»ì:øY\u0095PÛ5Õ\u0089T\u0099GaÝ\u001d>\u0085ß\u0089\u0081â%M\u0084\u0012U\u0003VK\u0084´$åÉ\bXõÉw\u001f³Î6\u0096\u0083ª'\u0098ß\u0083Òï®\\ip\f|\u0086ßZe\u0088»5¹\u0004\u0018zãµÃ@Ë%\u00147f²ø\u0098òR\u0085¿\u0097,é*OL9\u001d%9>\u000b1 Ù#_\u008f¦e\u0089\u0002ÿ¬jsq±`àõrÍ4\"Ò6b\u0000\u001eU\u007fÚ\u0083YðÔbÃk«U\u00146Éì§»5\u009bhµÔtÉ\u000eº0\u0007*cÁlr8\u009bç\fbú¡å\u0080«Ç¿\u007f\u0097nðæb8GÏWqÛb\u001c\u008fÍ7íE{\u009a\u0010G¾PÆä²p~ÙfZÐÏ\u009cI©0ÃW\u008bÙ\u001cõR\u0089+§ÝÕiN¼\rÌ»Fñ\u000f(\u0004nÎ¨_\u009d\u0082i§\u0017\u009c\u009d®6\u0017\u0092Ç{UÎoi¦Ïä\u0082\u0010 r¹v\u0094Ú\u0098»É\u0013FyÍxF\u001d(ÍLb\u0007ÎÙÀV\u0004\u001c-45Gr(+×\u0004SöT\u0095tEþÓð\u0087\u0010ØoÌ\tÇEo\u0017\u0013ò\u0010Ã,Ó\u008bäl\u0007ÇÛå\u0086 \u0015í\u0082Y\u0010IQXMIU~PíS4Eõ\u0006e*(t~N±â¯ÚË\u0018ÀÚA\u0097ÍD¾\u008bD·å¥\u0007\u008crðÕ,>\u009b^\u0082O«äéî\u009b¢Xl\u0010y{F\u0013\u008f\u0005½\u0096H½õ7A0Da\u0018Â\u0010²X*^\b\u0000´ºå]}î2\u0091ÿê\u008e\u00939É\u008dñ";
      int var8 = "º½|sEÎ®f\u0095S\u0083\u0000\u0091\u008f\u0014×@û-\u000eÍ\u0095Î`ø*?i\u008aóm\u009ef\u0082»¾\u0001Ùz¬\u001f:\\Â¼ò\u0099\u0018*4ÖèE±´¯ªøI²3\t\bi²\tUà\u0085\u008bjÄ\u0086B\u008c\u0097l¢auþĀ£tîáW\u00158ù9v\u009d÷è¸Q/(\nâ$òLÉÄi§·¨\u0015Ì\n~\u0007÷G>zf¥û±\u001e\u0082Ao_X\u0001\u001eÝ\u0088âd\u0082\u008d¸eéÇ¡6,»ì:øY\u0095PÛ5Õ\u0089T\u0099GaÝ\u001d>\u0085ß\u0089\u0081â%M\u0084\u0012U\u0003VK\u0084´$åÉ\bXõÉw\u001f³Î6\u0096\u0083ª'\u0098ß\u0083Òï®\\ip\f|\u0086ßZe\u0088»5¹\u0004\u0018zãµÃ@Ë%\u00147f²ø\u0098òR\u0085¿\u0097,é*OL9\u001d%9>\u000b1 Ù#_\u008f¦e\u0089\u0002ÿ¬jsq±`àõrÍ4\"Ò6b\u0000\u001eU\u007fÚ\u0083YðÔbÃk«U\u00146Éì§»5\u009bhµÔtÉ\u000eº0\u0007*cÁlr8\u009bç\fbú¡å\u0080«Ç¿\u007f\u0097nðæb8GÏWqÛb\u001c\u008fÍ7íE{\u009a\u0010G¾PÆä²p~ÙfZÐÏ\u009cI©0ÃW\u008bÙ\u001cõR\u0089+§ÝÕiN¼\rÌ»Fñ\u000f(\u0004nÎ¨_\u009d\u0082i§\u0017\u009c\u009d®6\u0017\u0092Ç{UÎoi¦Ïä\u0082\u0010 r¹v\u0094Ú\u0098»É\u0013FyÍxF\u001d(ÍLb\u0007ÎÙÀV\u0004\u001c-45Gr(+×\u0004SöT\u0095tEþÓð\u0087\u0010ØoÌ\tÇEo\u0017\u0013ò\u0010Ã,Ó\u008bäl\u0007ÇÛå\u0086 \u0015í\u0082Y\u0010IQXMIU~PíS4Eõ\u0006e*(t~N±â¯ÚË\u0018ÀÚA\u0097ÍD¾\u008bD·å¥\u0007\u008crðÕ,>\u009b^\u0082O«äéî\u009b¢Xl\u0010y{F\u0013\u008f\u0005½\u0096H½õ7A0Da\u0018Â\u0010²X*^\b\u0000´ºå]}î2\u0091ÿê\u008e\u00939É\u008dñ"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[14];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "å\u0000ª¼ÒÿFVV\näVLJêU§\u0097\u0018Phj¬\u0004tcÀ\u009cT÷\u009c\u0096@\u0016mËã{ÊÛ(\u0095M`ý¹\u008e\r\u0005ê 1Á\u00ad¦4ðïw=Q$\"°Ä~Ä\u0017HÚÃ\u0088Ø$Ûê¶\u0000ïÙ2";
                  var8 = "å\u0000ª¼ÒÿFVV\näVLJêU§\u0097\u0018Phj¬\u0004tcÀ\u009cT÷\u009c\u0096@\u0016mËã{ÊÛ(\u0095M`ý¹\u008e\r\u0005ê 1Á\u00ad¦4ðïw=Q$\"°Ä~Ä\u0017HÚÃ\u0088Ø$Ûê¶\u0000ïÙ2"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11351;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/bq", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/bq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
