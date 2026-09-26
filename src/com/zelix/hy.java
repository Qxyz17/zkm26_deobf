package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hy {
   private final l6q F;
   private final l6q O;
   private final l6q l;
   private Set E;
   private final sh j;
   private static final long a = prr.a(783745151940254961L, 936928802969930494L, MethodHandles.lookup().lookupClass()).a(86649155747396L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public hy(_v[] param1, short param2, sh param3, s0 param4, lqu param5, h4 param6, char param7, _6 param8, int param9, l6z param10, boolean param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 7
      // 007: i2l
      // 008: bipush 48
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 9
      // 011: i2l
      // 012: bipush 32
      // 014: lshl
      // 015: bipush 32
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/hy.a J
      // 01c: lxor
      // 01d: lstore 12
      // 01f: lload 12
      // 021: dup2
      // 022: ldc2_w 7622620975796
      // 025: lxor
      // 026: lstore 14
      // 028: dup2
      // 029: ldc2_w 139770176209992
      // 02c: lxor
      // 02d: lstore 16
      // 02f: dup2
      // 030: ldc2_w 106686738854633
      // 033: lxor
      // 034: lstore 18
      // 036: dup2
      // 037: ldc2_w 137041575810602
      // 03a: lxor
      // 03b: dup2
      // 03c: bipush 32
      // 03e: lushr
      // 03f: lstore 20
      // 041: dup2
      // 042: bipush 32
      // 044: lshl
      // 045: bipush 32
      // 047: lushr
      // 048: l2i
      // 049: istore 22
      // 04b: pop2
      // 04c: dup2
      // 04d: ldc2_w 109003136074086
      // 050: lxor
      // 051: lstore 23
      // 053: dup2
      // 054: ldc2_w 78266342087493
      // 057: lxor
      // 058: dup2
      // 059: bipush 48
      // 05b: lushr
      // 05c: l2i
      // 05d: istore 25
      // 05f: dup2
      // 060: bipush 16
      // 062: lshl
      // 063: bipush 48
      // 065: lushr
      // 066: l2i
      // 067: istore 26
      // 069: dup2
      // 06a: bipush 32
      // 06c: lshl
      // 06d: bipush 32
      // 06f: lushr
      // 070: l2i
      // 071: istore 27
      // 073: pop2
      // 074: dup2
      // 075: ldc2_w 81025509926445
      // 078: lxor
      // 079: lstore 28
      // 07b: dup2
      // 07c: ldc2_w 39943675731535
      // 07f: lxor
      // 080: lstore 30
      // 082: dup2
      // 083: ldc2_w 85633630748679
      // 086: lxor
      // 087: lstore 32
      // 089: dup2
      // 08a: ldc2_w 110550182518823
      // 08d: lxor
      // 08e: lstore 34
      // 090: dup2
      // 091: ldc2_w 56241565354539
      // 094: lxor
      // 095: lstore 36
      // 097: dup2
      // 098: ldc2_w 29301645599687
      // 09b: lxor
      // 09c: lstore 38
      // 09e: dup2
      // 09f: ldc2_w 61838562051198
      // 0a2: lxor
      // 0a3: lstore 40
      // 0a5: dup2
      // 0a6: ldc2_w 81153687987748
      // 0a9: lxor
      // 0aa: lstore 42
      // 0ac: dup2
      // 0ad: ldc2_w 54949733069978
      // 0b0: lxor
      // 0b1: lstore 44
      // 0b3: dup2
      // 0b4: ldc2_w 44251541107185
      // 0b7: lxor
      // 0b8: lstore 46
      // 0ba: dup2
      // 0bb: ldc2_w 102519216794578
      // 0be: lxor
      // 0bf: lstore 48
      // 0c1: dup2
      // 0c2: ldc2_w 10936972960074
      // 0c5: lxor
      // 0c6: lstore 50
      // 0c8: dup2
      // 0c9: ldc2_w 92354294292628
      // 0cc: lxor
      // 0cd: lstore 52
      // 0cf: dup2
      // 0d0: ldc2_w 99702706720445
      // 0d3: lxor
      // 0d4: lstore 54
      // 0d6: dup2
      // 0d7: ldc2_w 138385650172871
      // 0da: lxor
      // 0db: lstore 56
      // 0dd: dup2
      // 0de: ldc2_w 19611422328337
      // 0e1: lxor
      // 0e2: lstore 58
      // 0e4: dup2
      // 0e5: ldc2_w 70989518164484
      // 0e8: lxor
      // 0e9: lstore 60
      // 0eb: pop2
      // 0ec: ldc2_w 2594726729814459470
      // 0ef: lload 12
      // 0f1: invokedynamic k (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: aload 0
      // 0f7: invokespecial java/lang/Object.<init> ()V
      // 0fa: aload 0
      // 0fb: lload 14
      // 0fd: bipush 1
      // 0fe: anewarray 137
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 0
      // 108: swap
      // 109: aastore
      // 10a: ldc2_w 4508328645311416083
      // 10d: lload 12
      // 10f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: ldc2_w 2605808676010420650
      // 117: lload 12
      // 119: invokedynamic w (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: aload 0
      // 11f: aload 3
      // 120: putfield com/zelix/hy.j Lcom/zelix/sh;
      // 123: aload 1
      // 124: astore 63
      // 126: aload 63
      // 128: arraylength
      // 129: istore 64
      // 12b: astore 62
      // 12d: bipush 0
      // 12e: istore 65
      // 130: iload 65
      // 132: iload 64
      // 134: if_icmpge 2fb
      // 137: aload 63
      // 139: iload 65
      // 13b: aaload
      // 13c: astore 66
      // 13e: aload 66
      // 140: aload 62
      // 142: ifnonnull 1ca
      // 145: invokevirtual com/zelix/_v.G ()Z
      // 148: ifeq 1ba
      // 14b: goto 159
      // 14e: ldc2_w 4131650199841763278
      // 151: lload 12
      // 153: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: aload 66
      // 15b: checkcast com/zelix/_f
      // 15e: astore 67
      // 160: aload 3
      // 161: lload 54
      // 163: aload 67
      // 165: ldc2_w 2702561759847985511
      // 168: lload 12
      // 16a: invokedynamic o (JJ)Lcom/zelix/loe; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: bipush 3
      // 170: anewarray 137
      // 173: dup_x1
      // 174: swap
      // 175: bipush 2
      // 176: swap
      // 177: aastore
      // 178: dup_x1
      // 179: swap
      // 17a: bipush 1
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 0
      // 184: swap
      // 185: aastore
      // 186: ldc2_w 4340450296717286287
      // 189: lload 12
      // 18b: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/bn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: astore 68
      // 192: iload 7
      // 194: ifle 1b0
      // 197: aload 68
      // 199: ifnull 1b0
      // 19c: aload 0
      // 19d: ldc2_w 2605808676010420650
      // 1a0: lload 12
      // 1a2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: aload 68
      // 1a9: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1ae: istore 69
      // 1b0: iload 9
      // 1b2: ifge 232
      // 1b5: aload 62
      // 1b7: ifnull 232
      // 1ba: aload 66
      // 1bc: goto 1ca
      // 1bf: ldc2_w 4131650199841763278
      // 1c2: lload 12
      // 1c4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: checkcast com/zelix/_1
      // 1cd: astore 67
      // 1cf: aload 67
      // 1d1: aload 3
      // 1d2: aload 8
      // 1d4: lload 32
      // 1d6: aload 10
      // 1d8: bipush 4
      // 1d9: anewarray 137
      // 1dc: dup_x1
      // 1dd: swap
      // 1de: bipush 3
      // 1df: swap
      // 1e0: aastore
      // 1e1: dup_x2
      // 1e2: dup_x2
      // 1e3: pop
      // 1e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e7: bipush 2
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 1
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x1
      // 1f0: swap
      // 1f1: bipush 0
      // 1f2: swap
      // 1f3: aastore
      // 1f4: ldc2_w 2718456622076343301
      // 1f7: lload 12
      // 1f9: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: aload 67
      // 200: ldc2_w 2702561759847985511
      // 203: lload 12
      // 205: invokedynamic o (JJ)Lcom/zelix/loe; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: lload 46
      // 20c: invokevirtual com/zelix/_1.U (Lcom/zelix/loe;J)Lcom/zelix/b1;
      // 20f: checkcast com/zelix/b9
      // 212: astore 68
      // 214: iload 9
      // 216: ifgt 232
      // 219: aload 68
      // 21b: ifnull 232
      // 21e: aload 0
      // 21f: ldc2_w 2605808676010420650
      // 222: lload 12
      // 224: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: aload 68
      // 22b: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 230: istore 69
      // 232: aload 66
      // 234: aload 62
      // 236: ifnonnull 265
      // 239: iload 25
      // 23b: i2c
      // 23c: iload 26
      // 23e: i2s
      // 23f: iload 27
      // 241: invokevirtual com/zelix/_v.P (CSI)Z
      // 244: ifeq 2ee
      // 247: goto 255
      // 24a: ldc2_w 4131650199841763278
      // 24d: lload 12
      // 24f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: athrow
      // 255: aload 66
      // 257: goto 265
      // 25a: ldc2_w 4131650199841763278
      // 25d: lload 12
      // 25f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: lload 20
      // 267: iload 22
      // 269: bipush 2
      // 26a: anewarray 137
      // 26d: dup_x1
      // 26e: swap
      // 26f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 272: bipush 1
      // 273: swap
      // 274: aastore
      // 275: dup_x2
      // 276: dup_x2
      // 277: pop
      // 278: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27b: bipush 0
      // 27c: swap
      // 27d: aastore
      // 27e: ldc2_w 4272401042924543934
      // 281: lload 12
      // 283: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 28d: astore 67
      // 28f: aload 67
      // 291: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 296: ifeq 2ee
      // 299: aload 67
      // 29b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a0: checkcast com/zelix/_v
      // 2a3: astore 68
      // 2a5: aload 68
      // 2a7: ldc2_w 2702561759847985511
      // 2aa: lload 12
      // 2ac: invokedynamic o (JJ)Lcom/zelix/loe; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b1: lload 46
      // 2b3: invokevirtual com/zelix/_v.U (Lcom/zelix/loe;J)Lcom/zelix/b1;
      // 2b6: astore 69
      // 2b8: aload 62
      // 2ba: iload 9
      // 2bc: ifge 2f8
      // 2bf: ifnonnull 2f6
      // 2c2: aload 69
      // 2c4: ifnull 2e9
      // 2c7: goto 2d5
      // 2ca: ldc2_w 4131650199841763278
      // 2cd: lload 12
      // 2cf: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: ldc2_w 2605808676010420650
      // 2d9: lload 12
      // 2db: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e0: aload 69
      // 2e2: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2e7: istore 70
      // 2e9: aload 62
      // 2eb: ifnull 28f
      // 2ee: iload 7
      // 2f0: ifle 2f6
      // 2f3: iinc 65 1
      // 2f6: aload 62
      // 2f8: ifnull 130
      // 2fb: new com/zelix/df
      // 2fe: dup
      // 2ff: aload 0
      // 300: ldc2_w 2605808676010420650
      // 303: lload 12
      // 305: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: invokeinterface java/util/Set.size ()I 1
      // 30f: lload 56
      // 311: invokespecial com/zelix/df.<init> (IJ)V
      // 314: astore 63
      // 316: new com/zelix/ts
      // 319: dup
      // 31a: lload 34
      // 31c: aload 1
      // 31d: invokespecial com/zelix/ts.<init> (J[Ljava/lang/Object;)V
      // 320: lload 42
      // 322: bipush 2
      // 323: anewarray 137
      // 326: dup_x2
      // 327: dup_x2
      // 328: pop
      // 329: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32c: bipush 1
      // 32d: swap
      // 32e: aastore
      // 32f: dup_x1
      // 330: swap
      // 331: bipush 0
      // 332: swap
      // 333: aastore
      // 334: ldc2_w 4316128892269046775
      // 337: lload 12
      // 339: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: astore 64
      // 340: new com/zelix/df
      // 343: dup
      // 344: aload 64
      // 346: invokeinterface java/util/Set.size ()I 1
      // 34b: lload 56
      // 34d: invokespecial com/zelix/df.<init> (IJ)V
      // 350: astore 65
      // 352: aload 0
      // 353: ldc2_w 2605808676010420650
      // 356: lload 12
      // 358: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 362: astore 66
      // 364: aload 66
      // 366: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 36b: ifeq 437
      // 36e: aload 66
      // 370: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 375: checkcast com/zelix/b1
      // 378: astore 67
      // 37a: aconst_null
      // 37b: astore 68
      // 37d: aconst_null
      // 37e: iload 7
      // 380: iflt 476
      // 383: astore 69
      // 385: aload 62
      // 387: ifnonnull 475
      // 38a: aload 67
      // 38c: invokevirtual com/zelix/b1.J ()Z
      // 38f: ifeq 3ec
      // 392: goto 3a0
      // 395: ldc2_w 4131650199841763278
      // 398: lload 12
      // 39a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39f: athrow
      // 3a0: aload 3
      // 3a1: lload 58
      // 3a3: aload 67
      // 3a5: checkcast com/zelix/bn
      // 3a8: bipush 2
      // 3a9: anewarray 137
      // 3ac: dup_x1
      // 3ad: swap
      // 3ae: bipush 1
      // 3af: swap
      // 3b0: aastore
      // 3b1: dup_x2
      // 3b2: dup_x2
      // 3b3: pop
      // 3b4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b7: bipush 0
      // 3b8: swap
      // 3b9: aastore
      // 3ba: ldc2_w 2685043924037727498
      // 3bd: lload 12
      // 3bf: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c4: astore 68
      // 3c6: aload 3
      // 3c7: lload 38
      // 3c9: aload 67
      // 3cb: checkcast com/zelix/bn
      // 3ce: bipush 2
      // 3cf: anewarray 137
      // 3d2: dup_x1
      // 3d3: swap
      // 3d4: bipush 1
      // 3d5: swap
      // 3d6: aastore
      // 3d7: dup_x2
      // 3d8: dup_x2
      // 3d9: pop
      // 3da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3dd: bipush 0
      // 3de: swap
      // 3df: aastore
      // 3e0: ldc2_w 2400201980000761848
      // 3e3: lload 12
      // 3e5: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ea: astore 69
      // 3ec: aload 0
      // 3ed: aload 67
      // 3ef: aload 69
      // 3f1: lload 16
      // 3f3: aload 68
      // 3f5: aload 64
      // 3f7: aload 65
      // 3f9: aload 63
      // 3fb: bipush 7
      // 3fd: anewarray 137
      // 400: dup_x1
      // 401: swap
      // 402: bipush 6
      // 404: swap
      // 405: aastore
      // 406: dup_x1
      // 407: swap
      // 408: bipush 5
      // 409: swap
      // 40a: aastore
      // 40b: dup_x1
      // 40c: swap
      // 40d: bipush 4
      // 40e: swap
      // 40f: aastore
      // 410: dup_x1
      // 411: swap
      // 412: bipush 3
      // 413: swap
      // 414: aastore
      // 415: dup_x2
      // 416: dup_x2
      // 417: pop
      // 418: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41b: bipush 2
      // 41c: swap
      // 41d: aastore
      // 41e: dup_x1
      // 41f: swap
      // 420: bipush 1
      // 421: swap
      // 422: aastore
      // 423: dup_x1
      // 424: swap
      // 425: bipush 0
      // 426: swap
      // 427: aastore
      // 428: ldc2_w 2630424505867207307
      // 42b: lload 12
      // 42d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 432: aload 62
      // 434: ifnull 364
      // 437: aload 0
      // 438: aload 65
      // 43a: lload 50
      // 43c: bipush 1
      // 43d: anewarray 137
      // 440: dup_x2
      // 441: dup_x2
      // 442: pop
      // 443: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 446: bipush 0
      // 447: swap
      // 448: aastore
      // 449: ldc2_w 4266937751001195934
      // 44c: lload 12
      // 44e: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 453: putfield com/zelix/hy.O Lcom/zelix/l6q;
      // 456: aload 65
      // 458: lload 28
      // 45a: bipush 1
      // 45b: anewarray 137
      // 45e: dup_x2
      // 45f: dup_x2
      // 460: pop
      // 461: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 464: bipush 0
      // 465: swap
      // 466: aastore
      // 467: ldc2_w 4109329959419801740
      // 46a: lload 12
      // 46c: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 471: iload 2
      // 472: iflt 475
      // 475: aconst_null
      // 476: astore 65
      // 478: aload 0
      // 479: new com/zelix/l6q
      // 47c: dup
      // 47d: aload 0
      // 47e: ldc2_w 2605808676010420650
      // 481: lload 12
      // 483: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 488: invokeinterface java/util/Set.size ()I 1
      // 48d: lload 36
      // 48f: dup2_x1
      // 490: pop2
      // 491: invokespecial com/zelix/l6q.<init> (JI)V
      // 494: putfield com/zelix/hy.l Lcom/zelix/l6q;
      // 497: aload 0
      // 498: ldc2_w 4537489974032885966
      // 49b: lload 12
      // 49d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a2: lload 52
      // 4a4: invokevirtual com/zelix/l6q.D (J)Ljava/util/Set;
      // 4a7: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 4ac: astore 66
      // 4ae: aload 66
      // 4b0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b5: ifeq 524
      // 4b8: aload 66
      // 4ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4bf: checkcast java/util/Map$Entry
      // 4c2: astore 67
      // 4c4: aload 67
      // 4c6: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 4cb: checkcast java/util/List
      // 4ce: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4d3: astore 68
      // 4d5: aload 68
      // 4d7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4dc: ifeq 51a
      // 4df: aload 68
      // 4e1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4e6: checkcast com/zelix/b1
      // 4e9: astore 69
      // 4eb: aload 67
      // 4ed: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 4f2: checkcast com/zelix/b1
      // 4f5: astore 70
      // 4f7: aload 0
      // 4f8: ldc2_w 4597256293064541123
      // 4fb: lload 12
      // 4fd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 502: aload 69
      // 504: aload 70
      // 506: lload 60
      // 508: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 50b: aload 62
      // 50d: ifnonnull 4ae
      // 510: aload 62
      // 512: iload 9
      // 514: ifgt 4cb
      // 517: ifnull 4d5
      // 51a: aload 62
      // 51c: iload 7
      // 51e: iflt 4e6
      // 521: ifnull 4ae
      // 524: new com/zelix/df
      // 527: dup
      // 528: aload 0
      // 529: ldc2_w 2605808676010420650
      // 52c: lload 12
      // 52e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 533: invokeinterface java/util/Set.size ()I 1
      // 538: lload 56
      // 53a: invokespecial com/zelix/df.<init> (IJ)V
      // 53d: iload 7
      // 53f: iflt 4bf
      // 542: astore 66
      // 544: aload 4
      // 546: lload 23
      // 548: bipush 1
      // 549: anewarray 137
      // 54c: dup_x2
      // 54d: dup_x2
      // 54e: pop
      // 54f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 552: bipush 0
      // 553: swap
      // 554: aastore
      // 555: ldc2_w 4406437516140458988
      // 558: lload 12
      // 55a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55f: astore 67
      // 561: aload 67
      // 563: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 568: astore 68
      // 56a: aload 68
      // 56c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 571: ifeq 5ee
      // 574: aload 68
      // 576: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 57b: checkcast com/zelix/l62
      // 57e: astore 69
      // 580: aload 0
      // 581: lload 48
      // 583: aload 69
      // 585: lload 14
      // 587: bipush 1
      // 588: anewarray 137
      // 58b: dup_x2
      // 58c: dup_x2
      // 58d: pop
      // 58e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 591: bipush 0
      // 592: swap
      // 593: aastore
      // 594: ldc2_w 4508328645311416083
      // 597: lload 12
      // 599: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59e: aload 63
      // 5a0: aload 66
      // 5a2: bipush 5
      // 5a3: anewarray 137
      // 5a6: dup_x1
      // 5a7: swap
      // 5a8: bipush 4
      // 5a9: swap
      // 5aa: aastore
      // 5ab: dup_x1
      // 5ac: swap
      // 5ad: bipush 3
      // 5ae: swap
      // 5af: aastore
      // 5b0: dup_x1
      // 5b1: swap
      // 5b2: bipush 2
      // 5b3: swap
      // 5b4: aastore
      // 5b5: dup_x1
      // 5b6: swap
      // 5b7: bipush 1
      // 5b8: swap
      // 5b9: aastore
      // 5ba: dup_x2
      // 5bb: dup_x2
      // 5bc: pop
      // 5bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c0: bipush 0
      // 5c1: swap
      // 5c2: aastore
      // 5c3: ldc2_w 2688671976148478399
      // 5c6: lload 12
      // 5c8: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cd: aload 62
      // 5cf: iload 9
      // 5d1: ifge 5d9
      // 5d4: ifnonnull 628
      // 5d7: aload 62
      // 5d9: ifnull 56a
      // 5dc: iload 2
      // 5dd: iflt 5cd
      // 5e0: goto 5ee
      // 5e3: ldc2_w 4131650199841763278
      // 5e6: lload 12
      // 5e8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ed: athrow
      // 5ee: aload 0
      // 5ef: aload 66
      // 5f1: lload 50
      // 5f3: bipush 1
      // 5f4: anewarray 137
      // 5f7: dup_x2
      // 5f8: dup_x2
      // 5f9: pop
      // 5fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5fd: bipush 0
      // 5fe: swap
      // 5ff: aastore
      // 600: ldc2_w 4266937751001195934
      // 603: lload 12
      // 605: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60a: putfield com/zelix/hy.F Lcom/zelix/l6q;
      // 60d: aload 63
      // 60f: lload 28
      // 611: bipush 1
      // 612: anewarray 137
      // 615: dup_x2
      // 616: dup_x2
      // 617: pop
      // 618: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 61b: bipush 0
      // 61c: swap
      // 61d: aastore
      // 61e: ldc2_w 4109329959419801740
      // 621: lload 12
      // 623: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 628: aconst_null
      // 629: astore 63
      // 62b: aload 66
      // 62d: lload 28
      // 62f: bipush 1
      // 630: anewarray 137
      // 633: dup_x2
      // 634: dup_x2
      // 635: pop
      // 636: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 639: bipush 0
      // 63a: swap
      // 63b: aastore
      // 63c: ldc2_w 4109329959419801740
      // 63f: lload 12
      // 641: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 646: aconst_null
      // 647: astore 66
      // 649: aload 0
      // 64a: ldc2_w 4346901030604948422
      // 64d: lload 12
      // 64f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 654: lload 52
      // 656: invokevirtual com/zelix/l6q.D (J)Ljava/util/Set;
      // 659: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 65e: astore 68
      // 660: aload 68
      // 662: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 667: ifeq 756
      // 66a: aload 68
      // 66c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 671: checkcast java/util/Map$Entry
      // 674: astore 69
      // 676: aload 69
      // 678: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 67d: checkcast com/zelix/_v
      // 680: astore 70
      // 682: aload 69
      // 684: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 689: checkcast java/util/List
      // 68c: astore 71
      // 68e: aload 70
      // 690: lload 44
      // 692: invokevirtual com/zelix/_v.N (J)Z
      // 695: aload 62
      // 697: iload 2
      // 698: iflt 75e
      // 69b: ifnonnull 75c
      // 69e: aload 62
      // 6a0: ifnonnull 750
      // 6a3: goto 6b1
      // 6a6: ldc2_w 4131650199841763278
      // 6a9: lload 12
      // 6ab: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b0: athrow
      // 6b1: ifeq 734
      // 6b4: goto 6c2
      // 6b7: ldc2_w 4131650199841763278
      // 6ba: lload 12
      // 6bc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c1: athrow
      // 6c2: aload 70
      // 6c4: lload 18
      // 6c6: bipush 1
      // 6c7: anewarray 137
      // 6ca: dup_x2
      // 6cb: dup_x2
      // 6cc: pop
      // 6cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d0: bipush 0
      // 6d1: swap
      // 6d2: aastore
      // 6d3: ldc2_w 4298449638631744505
      // 6d6: lload 12
      // 6d8: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6dd: astore 72
      // 6df: aload 72
      // 6e1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 6e6: astore 73
      // 6e8: aload 73
      // 6ea: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6ef: ifeq 72f
      // 6f2: aload 73
      // 6f4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6f9: checkcast com/zelix/_v
      // 6fc: astore 74
      // 6fe: aload 71
      // 700: aload 74
      // 702: ldc2_w 2562743101282136219
      // 705: lload 12
      // 707: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70c: pop
      // 70d: aload 62
      // 70f: iload 9
      // 711: ifgt 753
      // 714: ifnonnull 751
      // 717: aload 62
      // 719: ifnull 6e8
      // 71c: iload 9
      // 71e: ifge 70d
      // 721: goto 72f
      // 724: ldc2_w 4131650199841763278
      // 727: lload 12
      // 729: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72e: athrow
      // 72f: aload 62
      // 731: ifnull 751
      // 734: aload 71
      // 736: aload 70
      // 738: ldc2_w 2562743101282136219
      // 73b: lload 12
      // 73d: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 742: goto 750
      // 745: ldc2_w 4131650199841763278
      // 748: lload 12
      // 74a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74f: athrow
      // 750: pop
      // 751: aload 62
      // 753: ifnull 660
      // 756: iload 2
      // 757: iflt 838
      // 75a: iload 11
      // 75c: aload 62
      // 75e: iload 7
      // 760: ifle 797
      // 763: ifnonnull 795
      // 766: ifeq 838
      // 769: goto 777
      // 76c: ldc2_w 4131650199841763278
      // 76f: lload 12
      // 771: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 776: athrow
      // 777: aload 0
      // 778: ldc2_w 2605808676010420650
      // 77b: lload 12
      // 77d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 782: invokeinterface java/util/Set.size ()I 1
      // 787: goto 795
      // 78a: ldc2_w 4131650199841763278
      // 78d: lload 12
      // 78f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 794: athrow
      // 795: aload 62
      // 797: ifnonnull 7d8
      // 79a: ifle 838
      // 79d: goto 7ab
      // 7a0: ldc2_w 4131650199841763278
      // 7a3: lload 12
      // 7a5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7aa: athrow
      // 7ab: aload 5
      // 7ad: aload 62
      // 7af: ifnonnull 7dd
      // 7b2: goto 7c0
      // 7b5: ldc2_w 4131650199841763278
      // 7b8: lload 12
      // 7ba: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7bf: athrow
      // 7c0: ldc2_w 4549696177600292200
      // 7c3: lload 12
      // 7c5: invokedynamic t (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ca: goto 7d8
      // 7cd: ldc2_w 4131650199841763278
      // 7d0: lload 12
      // 7d2: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d7: athrow
      // 7d8: ifeq 838
      // 7db: aload 5
      // 7dd: lload 30
      // 7df: bipush 1
      // 7e0: anewarray 137
      // 7e3: dup_x2
      // 7e4: dup_x2
      // 7e5: pop
      // 7e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7e9: bipush 0
      // 7ea: swap
      // 7eb: aastore
      // 7ec: ldc2_w 4464100308391125797
      // 7ef: lload 12
      // 7f1: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f6: astore 68
      // 7f8: iload 7
      // 7fa: ifle 82a
      // 7fd: aload 68
      // 7ff: ifnull 838
      // 802: aload 0
      // 803: aload 68
      // 805: aload 6
      // 807: lload 40
      // 809: bipush 3
      // 80a: anewarray 137
      // 80d: dup_x2
      // 80e: dup_x2
      // 80f: pop
      // 810: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 813: bipush 2
      // 814: swap
      // 815: aastore
      // 816: dup_x1
      // 817: swap
      // 818: bipush 1
      // 819: swap
      // 81a: aastore
      // 81b: dup_x1
      // 81c: swap
      // 81d: bipush 0
      // 81e: swap
      // 81f: aastore
      // 820: ldc2_w 2617628056785898539
      // 823: lload 12
      // 825: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82a: goto 838
      // 82d: ldc2_w 4131650199841763278
      // 830: lload 12
      // 832: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 837: athrow
      // 838: return
   }

   private void r(Object[] param1) {
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
      // 004: checkcast java/io/PrintWriter
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/h4
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: pop
      // 01b: getstatic com/zelix/hy.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 3704472595091
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 43156663761186
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 81050970807594
      // 034: lxor
      // 035: dup2
      // 036: bipush 48
      // 038: lushr
      // 039: l2i
      // 03a: istore 10
      // 03c: dup2
      // 03d: bipush 16
      // 03f: lshl
      // 040: bipush 32
      // 042: lushr
      // 043: l2i
      // 044: istore 11
      // 046: dup2
      // 047: bipush 48
      // 049: lshl
      // 04a: bipush 48
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 12
      // 050: pop2
      // 051: dup2
      // 052: ldc2_w 56586299409093
      // 055: lxor
      // 056: lstore 13
      // 058: dup2
      // 059: ldc2_w 54753649304542
      // 05c: lxor
      // 05d: lstore 15
      // 05f: dup2
      // 060: ldc2_w 20457898547375
      // 063: lxor
      // 064: lstore 17
      // 066: dup2
      // 067: ldc2_w 136954299246903
      // 06a: lxor
      // 06b: lstore 19
      // 06d: dup2
      // 06e: ldc2_w 81071125248308
      // 071: lxor
      // 072: lstore 21
      // 074: dup2
      // 075: ldc2_w 65801426070221
      // 078: lxor
      // 079: lstore 23
      // 07b: dup2
      // 07c: ldc2_w 3704472595091
      // 07f: lxor
      // 080: lstore 25
      // 082: pop2
      // 083: ldc2_w 5678232906472238721
      // 086: lload 3
      // 087: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: aload 0
      // 08d: ldc2_w 6068344998059508225
      // 090: lload 3
      // 091: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: lload 21
      // 098: bipush 1
      // 099: anewarray 137
      // 09c: dup_x2
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a2: bipush 0
      // 0a3: swap
      // 0a4: aastore
      // 0a5: ldc2_w 6025824539139896727
      // 0a8: lload 3
      // 0a9: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: lload 15
      // 0b0: bipush 2
      // 0b1: anewarray 137
      // 0b4: dup_x2
      // 0b5: dup_x2
      // 0b6: pop
      // 0b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ba: bipush 1
      // 0bb: swap
      // 0bc: aastore
      // 0bd: dup_x1
      // 0be: swap
      // 0bf: bipush 0
      // 0c0: swap
      // 0c1: aastore
      // 0c2: ldc2_w 5246113147107864409
      // 0c5: lload 3
      // 0c6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: astore 28
      // 0cd: new com/zelix/yd
      // 0d0: dup
      // 0d1: aload 0
      // 0d2: invokespecial com/zelix/yd.<init> (Lcom/zelix/hy;)V
      // 0d5: astore 29
      // 0d7: astore 27
      // 0d9: aload 28
      // 0db: aload 29
      // 0dd: ldc2_w 5740354844893051458
      // 0e0: lload 3
      // 0e1: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: bipush 0
      // 0e7: istore 30
      // 0e9: iload 30
      // 0eb: aload 28
      // 0ed: invokeinterface java/util/List.size ()I 1
      // 0f2: if_icmpge 3b2
      // 0f5: aload 28
      // 0f7: iload 30
      // 0f9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0fe: checkcast com/zelix/b1
      // 101: astore 31
      // 103: aload 27
      // 105: lload 3
      // 106: lconst_0
      // 107: lcmp
      // 108: iflt 3af
      // 10b: ifnonnull 3ad
      // 10e: aload 31
      // 110: invokevirtual com/zelix/b1.J ()Z
      // 113: ifeq 3aa
      // 116: goto 123
      // 119: ldc2_w 6024093914649462017
      // 11c: lload 3
      // 11d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 31
      // 125: checkcast com/zelix/bn
      // 128: astore 32
      // 12a: aload 2
      // 12b: lload 3
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: ifle 147
      // 131: aload 27
      // 133: ifnonnull 147
      // 136: ifnull 1ae
      // 139: goto 146
      // 13c: ldc2_w 6024093914649462017
      // 13f: lload 3
      // 140: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: aload 2
      // 147: aload 32
      // 149: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 14c: lload 8
      // 14e: bipush 2
      // 14f: anewarray 137
      // 152: dup_x2
      // 153: dup_x2
      // 154: pop
      // 155: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 158: bipush 1
      // 159: swap
      // 15a: aastore
      // 15b: dup_x1
      // 15c: swap
      // 15d: bipush 0
      // 15e: swap
      // 15f: aastore
      // 160: ldc2_w 5301666723626185534
      // 163: lload 3
      // 164: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: aload 27
      // 16b: ifnonnull 1ab
      // 16e: ifne 3aa
      // 171: goto 17e
      // 174: ldc2_w 6024093914649462017
      // 177: lload 3
      // 178: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: aload 2
      // 17f: lload 19
      // 181: aload 32
      // 183: bipush 2
      // 184: anewarray 137
      // 187: dup_x1
      // 188: swap
      // 189: bipush 1
      // 18a: swap
      // 18b: aastore
      // 18c: dup_x2
      // 18d: dup_x2
      // 18e: pop
      // 18f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 192: bipush 0
      // 193: swap
      // 194: aastore
      // 195: ldc2_w 5363737425411711553
      // 198: lload 3
      // 199: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: goto 1ab
      // 1a1: ldc2_w 6024093914649462017
      // 1a4: lload 3
      // 1a5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: ifne 3aa
      // 1ae: new java/lang/StringBuilder
      // 1b1: dup
      // 1b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b5: astore 33
      // 1b7: aload 0
      // 1b8: ldc2_w 6068344998059508225
      // 1bb: lload 3
      // 1bc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: iload 10
      // 1c3: i2c
      // 1c4: aload 32
      // 1c6: iload 11
      // 1c8: iload 12
      // 1ca: i2s
      // 1cb: invokevirtual com/zelix/l6q.t (CLjava/lang/Object;IS)Ljava/util/List;
      // 1ce: astore 34
      // 1d0: aload 34
      // 1d2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1d7: astore 35
      // 1d9: aload 35
      // 1db: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e0: ifeq 2c4
      // 1e3: aload 35
      // 1e5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1ea: checkcast com/zelix/b1
      // 1ed: astore 36
      // 1ef: aload 36
      // 1f1: lload 17
      // 1f3: invokevirtual com/zelix/b1.G (J)Lcom/zelix/_v;
      // 1f6: astore 37
      // 1f8: aload 33
      // 1fa: new java/lang/StringBuilder
      // 1fd: dup
      // 1fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 201: ldc "\""
      // 203: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 206: aload 37
      // 208: lload 6
      // 20a: bipush 1
      // 20b: anewarray 137
      // 20e: dup_x2
      // 20f: dup_x2
      // 210: pop
      // 211: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 214: bipush 0
      // 215: swap
      // 216: aastore
      // 217: ldc2_w 5805021497592669876
      // 21a: lload 3
      // 21b: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 223: ldc "\""
      // 225: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 228: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 22b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22e: pop
      // 22f: aload 37
      // 231: lload 23
      // 233: invokevirtual com/zelix/_v.z (J)Z
      // 236: aload 27
      // 238: ifnonnull 0eb
      // 23b: aload 27
      // 23d: lload 3
      // 23e: lconst_0
      // 23f: lcmp
      // 240: ifle 16b
      // 243: ifnonnull 29c
      // 246: ifeq 295
      // 249: goto 256
      // 24c: ldc2_w 6024093914649462017
      // 24f: lload 3
      // 250: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: aload 33
      // 258: new java/lang/StringBuilder
      // 25b: dup
      // 25c: invokespecial java/lang/StringBuilder.<init> ()V
      // 25f: sipush 29718
      // 262: ldc2_w 6837735029861513382
      // 265: lload 3
      // 266: lxor
      // 267: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26f: aload 37
      // 271: bipush 0
      // 272: anewarray 137
      // 275: ldc2_w 5739013852135181116
      // 278: lload 3
      // 279: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 281: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 284: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 287: pop
      // 288: goto 295
      // 28b: ldc2_w 6024093914649462017
      // 28e: lload 3
      // 28f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: athrow
      // 295: aload 35
      // 297: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 29c: ifeq 2bf
      // 29f: aload 33
      // 2a1: sipush 21481
      // 2a4: ldc2_w 1841179076578631512
      // 2a7: lload 3
      // 2a8: lxor
      // 2a9: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b1: pop
      // 2b2: goto 2bf
      // 2b5: ldc2_w 6024093914649462017
      // 2b8: lload 3
      // 2b9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: athrow
      // 2bf: aload 27
      // 2c1: ifnull 1d9
      // 2c4: aload 5
      // 2c6: lload 3
      // 2c7: lconst_0
      // 2c8: lcmp
      // 2c9: iflt 1ea
      // 2cc: new java/lang/StringBuilder
      // 2cf: dup
      // 2d0: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d3: sipush 12231
      // 2d6: ldc2_w 9005273393159185264
      // 2d9: lload 3
      // 2da: lxor
      // 2db: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e3: aload 32
      // 2e5: bipush 0
      // 2e6: lload 13
      // 2e8: bipush 2
      // 2e9: anewarray 137
      // 2ec: dup_x2
      // 2ed: dup_x2
      // 2ee: pop
      // 2ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f2: bipush 1
      // 2f3: swap
      // 2f4: aastore
      // 2f5: dup_x1
      // 2f6: swap
      // 2f7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2fa: bipush 0
      // 2fb: swap
      // 2fc: aastore
      // 2fd: ldc2_w 5448525764718907643
      // 300: lload 3
      // 301: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 306: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 309: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30c: sipush 26155
      // 30f: ldc2_w 1065272064420211357
      // 312: lload 3
      // 313: lxor
      // 314: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31c: aload 32
      // 31e: lload 25
      // 320: bipush 1
      // 321: anewarray 137
      // 324: dup_x2
      // 325: dup_x2
      // 326: pop
      // 327: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32a: bipush 0
      // 32b: swap
      // 32c: aastore
      // 32d: ldc2_w 5195425998462885525
      // 330: lload 3
      // 331: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 339: sipush 4667
      // 33c: lload 3
      // 33d: lconst_0
      // 33e: lcmp
      // 33f: ifle 35b
      // 342: ldc2_w 6119394379719319182
      // 345: lload 3
      // 346: lxor
      // 347: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: aload 27
      // 34e: ifnonnull 38c
      // 351: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 354: aload 34
      // 356: invokeinterface java/util/List.size ()I 1
      // 35b: lload 3
      // 35c: lconst_0
      // 35d: lcmp
      // 35e: ifle 392
      // 361: bipush 1
      // 362: if_icmpne 38f
      // 365: goto 372
      // 368: ldc2_w 6024093914649462017
      // 36b: lload 3
      // 36c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 371: athrow
      // 372: sipush 3967
      // 375: ldc2_w 54476483034973131
      // 378: lload 3
      // 379: lxor
      // 37a: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37f: goto 38c
      // 382: ldc2_w 6024093914649462017
      // 385: lload 3
      // 386: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38b: athrow
      // 38c: goto 39c
      // 38f: sipush 25404
      // 392: ldc2_w 6857717176195936142
      // 395: lload 3
      // 396: lxor
      // 397: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39f: aload 33
      // 3a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3a7: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 3aa: iinc 30 1
      // 3ad: aload 27
      // 3af: ifnull 0e9
      // 3b2: lload 3
      // 3b3: lconst_0
      // 3b4: lcmp
      // 3b5: iflt 0f5
      // 3b8: return
   }

   public boolean g(Object[] param1) {
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
      // 004: checkcast com/zelix/bn
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/hy.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 85984611166901
      // 01f: lxor
      // 020: dup2
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 5
      // 027: dup2
      // 028: bipush 16
      // 02a: lshl
      // 02b: bipush 32
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 6
      // 031: dup2
      // 032: bipush 48
      // 034: lshl
      // 035: bipush 48
      // 037: lushr
      // 038: l2i
      // 039: istore 7
      // 03b: pop2
      // 03c: dup2
      // 03d: ldc2_w 30046175039085
      // 040: lxor
      // 041: lstore 8
      // 043: dup2
      // 044: ldc2_w 61208142373054
      // 047: lxor
      // 048: lstore 10
      // 04a: pop2
      // 04b: ldc2_w -481281276682135266
      // 04e: lload 2
      // 04f: invokedynamic k (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 4
      // 056: lload 8
      // 058: invokevirtual com/zelix/bn.h (J)Ljava/lang/String;
      // 05b: astore 13
      // 05d: astore 12
      // 05f: aload 0
      // 060: ldc2_w -2042364721994287714
      // 063: lload 2
      // 064: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: iload 5
      // 06b: i2c
      // 06c: aload 4
      // 06e: iload 6
      // 070: iload 7
      // 072: i2s
      // 073: invokevirtual com/zelix/l6q.t (CLjava/lang/Object;IS)Ljava/util/List;
      // 076: astore 14
      // 078: aload 14
      // 07a: aload 12
      // 07c: ifnonnull 091
      // 07f: ifnull 104
      // 082: goto 08f
      // 085: ldc2_w -2015669815743565154
      // 088: lload 2
      // 089: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: aload 14
      // 091: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 096: astore 15
      // 098: aload 15
      // 09a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09f: ifeq 104
      // 0a2: aload 15
      // 0a4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a9: checkcast com/zelix/b1
      // 0ac: astore 16
      // 0ae: aload 16
      // 0b0: lload 8
      // 0b2: invokevirtual com/zelix/b1.h (J)Ljava/lang/String;
      // 0b5: astore 17
      // 0b7: aload 0
      // 0b8: ldc2_w -523247420626275623
      // 0bb: lload 2
      // 0bc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/sh; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: lload 10
      // 0c3: aload 13
      // 0c5: aload 17
      // 0c7: ldc2_w -1852693585124322025
      // 0ca: lload 2
      // 0cb: invokedynamic t (Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: aload 12
      // 0d2: lload 2
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: iflt 0dd
      // 0d8: ifnonnull 105
      // 0db: aload 12
      // 0dd: ifnonnull 0fe
      // 0e0: goto 0ed
      // 0e3: ldc2_w -2015669815743565154
      // 0e6: lload 2
      // 0e7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: ifeq 0ff
      // 0f0: goto 0fd
      // 0f3: ldc2_w -2015669815743565154
      // 0f6: lload 2
      // 0f7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: bipush 1
      // 0fe: ireturn
      // 0ff: aload 12
      // 101: ifnull 098
      // 104: bipush 0
      // 105: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean C(Object[] var1) {
      _v var4 = (_v)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var10001 = var2 ^ 95855394540077L;
      int var5 = (int)((var2 ^ 95855394540077L) >>> 48);
      int var6 = (int)((var2 ^ 95855394540077L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      int[] var10000 = m44.a<"k">(6470049954396715398L, var2);
      List var9 = m44.a<"u">(this, 4727413350045629966L, var2).t((char)var5, var4, var6, (short)var7);
      boolean var10 = true;
      int[] var8 = var10000;

      label101: {
         try {
            var22 = var9;
            if (var8 != null) {
               break label101;
            }

            if (var9 == null) {
               return var10;
            }
         } catch (n9 var20) {
            throw m44.a<"k">(var20, 4944670806902379014L, var2);
         }

         var22 = var9;
      }

      try {
         boolean var23 = var22.isEmpty();
         if (var8 != null) {
            return var23;
         }

         if (var23) {
            return var10;
         }
      } catch (n9 var14) {
         throw m44.a<"k">(var14, 4944670806902379014L, var2);
      }

      label95:
      for (_v var12 : var9) {
         List var13 = m44.a<"u">(this, 4727413350045629966L, var2).t((char)var5, var12, var6, (short)var7);

         do {
            label89: {
               label109: {
                  label87: {
                     try {
                        var24 = var13;
                        if (var2 <= 0L || var8 != null) {
                           break label87;
                        }

                        if (var13 == null) {
                           break label109;
                        }
                     } catch (n9 var19) {
                        throw m44.a<"k">(var19, 4944670806902379014L, var2);
                     }

                     var24 = var13;
                  }

                  label77: {
                     try {
                        var25 = var24.isEmpty();
                        if (var8 != null) {
                           break label77;
                        }

                        if (var25) {
                           break label109;
                        }
                     } catch (n9 var18) {
                        throw m44.a<"k">(var18, 4944670806902379014L, var2);
                     }

                     var25 = false;
                  }

                  var10 = var25;

                  try {
                     var10000 = var8;
                     if (var2 < 0L) {
                        break label89;
                     }

                     if (var8 == null) {
                        return var10;
                     }
                  } catch (n9 var17) {
                     boolean var28 = false;
                     throw m44.a<"k">(var17, 4944670806902379014L, var2);
                  }
               }

               try {
                  var10000 = var8;
               } catch (n9 var16) {
                  boolean var29 = false;
                  throw m44.a<"k">(var16, 4944670806902379014L, var2);
               }
            }

            try {
               if (var10000 == null) {
                  continue label95;
               }
            } catch (n9 var15) {
               boolean var30 = false;
               throw m44.a<"k">(var15, 4944670806902379014L, var2);
            }
         } while (var2 <= 0L);

         return var10;
      }

      return var10;
   }

   public boolean u(Object[] param1) {
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
      // 00e: checkcast com/zelix/bn
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/hy.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 30921851187980
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 48
      // 022: lushr
      // 023: l2i
      // 024: istore 5
      // 026: dup2
      // 027: bipush 16
      // 029: lshl
      // 02a: bipush 32
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 6
      // 030: dup2
      // 031: bipush 48
      // 033: lshl
      // 034: bipush 48
      // 036: lushr
      // 037: l2i
      // 038: istore 7
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 75360872344604
      // 03f: lxor
      // 040: lstore 8
      // 042: dup2
      // 043: ldc2_w 130876084363371
      // 046: lxor
      // 047: lstore 10
      // 049: dup2
      // 04a: ldc2_w 22489933326959
      // 04d: lxor
      // 04e: lstore 12
      // 050: dup2
      // 051: ldc2_w 102584022215031
      // 054: lxor
      // 055: lstore 14
      // 057: pop2
      // 058: ldc2_w 8972339535784058056
      // 05b: lload 3
      // 05c: invokedynamic m (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: aload 2
      // 062: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 065: astore 17
      // 067: astore 16
      // 069: aload 17
      // 06b: lload 8
      // 06d: invokevirtual com/zelix/_f.N (J)Z
      // 070: aload 16
      // 072: ifnonnull 136
      // 075: ifeq 120
      // 078: goto 085
      // 07b: ldc2_w 7048384675792435016
      // 07e: lload 3
      // 07f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: aload 2
      // 086: lload 10
      // 088: invokevirtual com/zelix/bn.B (J)Lcom/zelix/loe;
      // 08b: astore 18
      // 08d: aload 17
      // 08f: lload 12
      // 091: bipush 1
      // 092: anewarray 137
      // 095: dup_x2
      // 096: dup_x2
      // 097: pop
      // 098: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09b: bipush 0
      // 09c: swap
      // 09d: aastore
      // 09e: ldc2_w 7143092050212846463
      // 0a1: lload 3
      // 0a2: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0ac: astore 19
      // 0ae: aload 19
      // 0b0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b5: ifeq 11e
      // 0b8: aload 19
      // 0ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bf: checkcast com/zelix/_v
      // 0c2: astore 20
      // 0c4: aload 20
      // 0c6: aload 18
      // 0c8: lload 14
      // 0ca: invokevirtual com/zelix/_v.U (Lcom/zelix/loe;J)Lcom/zelix/b1;
      // 0cd: astore 21
      // 0cf: aload 0
      // 0d0: ldc2_w 7385360662114283592
      // 0d3: lload 3
      // 0d4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: iload 5
      // 0db: i2s
      // 0dc: aload 21
      // 0de: iload 6
      // 0e0: iload 7
      // 0e2: i2c
      // 0e3: invokevirtual com/zelix/l6q.J (SLjava/lang/Object;IC)Z
      // 0e6: istore 22
      // 0e8: iload 22
      // 0ea: aload 16
      // 0ec: lload 3
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 0f7
      // 0f2: ifnonnull 11f
      // 0f5: aload 16
      // 0f7: ifnonnull 118
      // 0fa: goto 107
      // 0fd: ldc2_w 7048384675792435016
      // 100: lload 3
      // 101: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: ifeq 119
      // 10a: goto 117
      // 10d: ldc2_w 7048384675792435016
      // 110: lload 3
      // 111: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: bipush 1
      // 118: ireturn
      // 119: aload 16
      // 11b: ifnull 0ae
      // 11e: bipush 0
      // 11f: ireturn
      // 120: aload 0
      // 121: ldc2_w 7385360662114283592
      // 124: lload 3
      // 125: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: iload 5
      // 12c: i2s
      // 12d: aload 2
      // 12e: iload 6
      // 130: iload 7
      // 132: i2c
      // 133: invokevirtual com/zelix/l6q.J (SLjava/lang/Object;IC)Z
      // 136: ireturn
   }

   private void B(Object[] param1) {
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
      // 004: checkcast com/zelix/b1
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/List
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 8
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/List
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 5
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/df
      // 030: astore 7
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast com/zelix/df
      // 039: astore 6
      // 03b: pop
      // 03c: getstatic com/zelix/hy.a J
      // 03f: lload 8
      // 041: lxor
      // 042: lstore 8
      // 044: lload 8
      // 046: dup2
      // 047: ldc2_w 81451654316924
      // 04a: lxor
      // 04b: lstore 10
      // 04d: dup2
      // 04e: ldc2_w 58991321858802
      // 051: lxor
      // 052: lstore 12
      // 054: dup2
      // 055: ldc2_w 120360330393393
      // 058: lxor
      // 059: lstore 14
      // 05b: dup2
      // 05c: ldc2_w 54172897818701
      // 05f: lxor
      // 060: lstore 16
      // 062: dup2
      // 063: ldc2_w 6949803974243
      // 066: lxor
      // 067: lstore 18
      // 069: dup2
      // 06a: ldc2_w 86648899741203
      // 06d: lxor
      // 06e: dup2
      // 06f: bipush 16
      // 071: lushr
      // 072: lstore 20
      // 074: dup2
      // 075: bipush 48
      // 077: lshl
      // 078: bipush 48
      // 07a: lushr
      // 07b: l2i
      // 07c: istore 22
      // 07e: pop2
      // 07f: dup2
      // 080: ldc2_w 95297453873168
      // 083: lxor
      // 084: lstore 23
      // 086: dup2
      // 087: ldc2_w 2471557674651
      // 08a: lxor
      // 08b: lstore 25
      // 08d: dup2
      // 08e: ldc2_w 94249164265625
      // 091: lxor
      // 092: lstore 27
      // 094: dup2
      // 095: ldc2_w 97384143136925
      // 098: lxor
      // 099: lstore 29
      // 09b: dup2
      // 09c: ldc2_w 121511989023899
      // 09f: lxor
      // 0a0: lstore 31
      // 0a2: dup2
      // 0a3: ldc2_w 81451654316924
      // 0a6: lxor
      // 0a7: lstore 33
      // 0a9: pop2
      // 0aa: ldc2_w 1079568261743668919
      // 0ad: lload 8
      // 0af: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: sipush 13002
      // 0b7: ldc2_w 430377982233554804
      // 0ba: lload 8
      // 0bc: lxor
      // 0bd: invokedynamic q (IJ)I bsm=com/zelix/hy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: lload 12
      // 0c4: bipush 2
      // 0c5: anewarray 137
      // 0c8: dup_x2
      // 0c9: dup_x2
      // 0ca: pop
      // 0cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ce: bipush 1
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d6: bipush 0
      // 0d7: swap
      // 0d8: aastore
      // 0d9: ldc2_w 1076691215079315897
      // 0dc: lload 8
      // 0de: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: astore 36
      // 0e5: lload 16
      // 0e7: bipush 1
      // 0e8: anewarray 137
      // 0eb: dup_x2
      // 0ec: dup_x2
      // 0ed: pop
      // 0ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f1: bipush 0
      // 0f2: swap
      // 0f3: aastore
      // 0f4: ldc2_w 1470982385276841450
      // 0f7: lload 8
      // 0f9: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: astore 37
      // 100: sipush 31267
      // 103: ldc2_w 6646890088985847708
      // 106: lload 8
      // 108: lxor
      // 109: invokedynamic q (IJ)I bsm=com/zelix/hy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: lload 12
      // 110: bipush 2
      // 111: anewarray 137
      // 114: dup_x2
      // 115: dup_x2
      // 116: pop
      // 117: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11a: bipush 1
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x1
      // 11e: swap
      // 11f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w 1076691215079315897
      // 128: lload 8
      // 12a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: astore 38
      // 131: sipush 31267
      // 134: ldc2_w 6646890088985847708
      // 137: lload 8
      // 139: lxor
      // 13a: invokedynamic q (IJ)I bsm=com/zelix/hy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: lload 12
      // 141: bipush 2
      // 142: anewarray 137
      // 145: dup_x2
      // 146: dup_x2
      // 147: pop
      // 148: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14b: bipush 1
      // 14c: swap
      // 14d: aastore
      // 14e: dup_x1
      // 14f: swap
      // 150: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: ldc2_w 1076691215079315897
      // 159: lload 8
      // 15b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: astore 39
      // 162: astore 35
      // 164: sipush 31267
      // 167: ldc2_w 6646890088985847708
      // 16a: lload 8
      // 16c: lxor
      // 16d: invokedynamic q (IJ)I bsm=com/zelix/hy.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: lload 12
      // 174: bipush 2
      // 175: anewarray 137
      // 178: dup_x2
      // 179: dup_x2
      // 17a: pop
      // 17b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17e: bipush 1
      // 17f: swap
      // 180: aastore
      // 181: dup_x1
      // 182: swap
      // 183: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 186: bipush 0
      // 187: swap
      // 188: aastore
      // 189: ldc2_w 1076691215079315897
      // 18c: lload 8
      // 18e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: astore 40
      // 195: aload 4
      // 197: aload 36
      // 199: aload 5
      // 19b: lload 10
      // 19d: bipush 3
      // 19e: anewarray 137
      // 1a1: dup_x2
      // 1a2: dup_x2
      // 1a3: pop
      // 1a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a7: bipush 2
      // 1a8: swap
      // 1a9: aastore
      // 1aa: dup_x1
      // 1ab: swap
      // 1ac: bipush 1
      // 1ad: swap
      // 1ae: aastore
      // 1af: dup_x1
      // 1b0: swap
      // 1b1: bipush 0
      // 1b2: swap
      // 1b3: aastore
      // 1b4: ldc2_w 1422137813177657052
      // 1b7: lload 8
      // 1b9: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: aload 2
      // 1bf: aload 35
      // 1c1: ifnonnull 1d6
      // 1c4: ifnull 221
      // 1c7: goto 1d5
      // 1ca: ldc2_w 1418535324840379703
      // 1cd: lload 8
      // 1cf: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: athrow
      // 1d5: aload 2
      // 1d6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1db: astore 41
      // 1dd: aload 41
      // 1df: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e4: ifeq 221
      // 1e7: aload 41
      // 1e9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1ee: checkcast com/zelix/bn
      // 1f1: astore 42
      // 1f3: aload 42
      // 1f5: aload 36
      // 1f7: aload 5
      // 1f9: lload 33
      // 1fb: bipush 3
      // 1fc: anewarray 137
      // 1ff: dup_x2
      // 200: dup_x2
      // 201: pop
      // 202: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 205: bipush 2
      // 206: swap
      // 207: aastore
      // 208: dup_x1
      // 209: swap
      // 20a: bipush 1
      // 20b: swap
      // 20c: aastore
      // 20d: dup_x1
      // 20e: swap
      // 20f: bipush 0
      // 210: swap
      // 211: aastore
      // 212: ldc2_w 1252116855101098736
      // 215: lload 8
      // 217: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: aload 35
      // 21e: ifnull 1dd
      // 221: aload 36
      // 223: aload 4
      // 225: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 22a: istore 41
      // 22c: aload 4
      // 22e: aload 37
      // 230: aload 38
      // 232: aload 39
      // 234: lload 29
      // 236: aload 40
      // 238: bipush 5
      // 239: anewarray 137
      // 23c: dup_x1
      // 23d: swap
      // 23e: bipush 4
      // 23f: swap
      // 240: aastore
      // 241: dup_x2
      // 242: dup_x2
      // 243: pop
      // 244: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 247: bipush 3
      // 248: swap
      // 249: aastore
      // 24a: dup_x1
      // 24b: swap
      // 24c: bipush 2
      // 24d: swap
      // 24e: aastore
      // 24f: dup_x1
      // 250: swap
      // 251: bipush 1
      // 252: swap
      // 253: aastore
      // 254: dup_x1
      // 255: swap
      // 256: bipush 0
      // 257: swap
      // 258: aastore
      // 259: ldc2_w 1286059217625650080
      // 25c: lload 8
      // 25e: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: aload 3
      // 264: aload 35
      // 266: ifnonnull 27b
      // 269: ifnull 2c8
      // 26c: goto 27a
      // 26f: ldc2_w 1418535324840379703
      // 272: lload 8
      // 274: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: athrow
      // 27a: aload 3
      // 27b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 280: astore 42
      // 282: aload 42
      // 284: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 289: ifeq 2c8
      // 28c: aload 42
      // 28e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 293: checkcast com/zelix/_f
      // 296: astore 43
      // 298: aload 38
      // 29a: aload 43
      // 29c: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2a1: lload 8
      // 2a3: lconst_0
      // 2a4: lcmp
      // 2a5: ifle 2d8
      // 2a8: pop
      // 2a9: aload 35
      // 2ab: ifnonnull 2d1
      // 2ae: aload 35
      // 2b0: ifnull 282
      // 2b3: lload 8
      // 2b5: lconst_0
      // 2b6: lcmp
      // 2b7: iflt 2a9
      // 2ba: goto 2c8
      // 2bd: ldc2_w 1418535324840379703
      // 2c0: lload 8
      // 2c2: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: athrow
      // 2c8: aload 36
      // 2ca: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2cf: astore 42
      // 2d1: aload 42
      // 2d3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d8: lload 8
      // 2da: lconst_0
      // 2db: lcmp
      // 2dc: ifle 366
      // 2df: ifeq 35a
      // 2e2: aload 42
      // 2e4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e9: checkcast com/zelix/b1
      // 2ec: astore 43
      // 2ee: aload 7
      // 2f0: lload 20
      // 2f2: iload 22
      // 2f4: i2c
      // 2f5: aload 43
      // 2f7: aload 4
      // 2f9: invokevirtual com/zelix/df.L (JCLjava/lang/Object;Ljava/lang/Object;)Z
      // 2fc: pop
      // 2fd: aload 43
      // 2ff: aload 37
      // 301: aload 38
      // 303: aload 39
      // 305: lload 29
      // 307: aload 40
      // 309: bipush 5
      // 30a: anewarray 137
      // 30d: dup_x1
      // 30e: swap
      // 30f: bipush 4
      // 310: swap
      // 311: aastore
      // 312: dup_x2
      // 313: dup_x2
      // 314: pop
      // 315: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 318: bipush 3
      // 319: swap
      // 31a: aastore
      // 31b: dup_x1
      // 31c: swap
      // 31d: bipush 2
      // 31e: swap
      // 31f: aastore
      // 320: dup_x1
      // 321: swap
      // 322: bipush 1
      // 323: swap
      // 324: aastore
      // 325: dup_x1
      // 326: swap
      // 327: bipush 0
      // 328: swap
      // 329: aastore
      // 32a: ldc2_w 1286059217625650080
      // 32d: lload 8
      // 32f: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: aload 35
      // 336: lload 8
      // 338: lconst_0
      // 339: lcmp
      // 33a: ifle 342
      // 33d: ifnonnull 472
      // 340: aload 35
      // 342: ifnull 2d1
      // 345: lload 8
      // 347: lconst_0
      // 348: lcmp
      // 349: iflt 35a
      // 34c: goto 35a
      // 34f: ldc2_w 1418535324840379703
      // 352: lload 8
      // 354: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 359: athrow
      // 35a: aload 39
      // 35c: ldc2_w 1049889556715941093
      // 35f: lload 8
      // 361: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: aload 35
      // 368: lload 8
      // 36a: lconst_0
      // 36b: lcmp
      // 36c: ifle 480
      // 36f: ifnonnull 47e
      // 372: ifne 472
      // 375: goto 383
      // 378: ldc2_w 1418535324840379703
      // 37b: lload 8
      // 37d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 382: athrow
      // 383: aload 39
      // 385: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 38a: astore 42
      // 38c: aload 42
      // 38e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 393: ifeq 472
      // 396: aload 42
      // 398: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 39d: checkcast com/zelix/b4
      // 3a0: astore 43
      // 3a2: aload 43
      // 3a4: invokevirtual com/zelix/b4.V ()Ljava/lang/String;
      // 3a7: lload 31
      // 3a9: dup2_x1
      // 3aa: pop2
      // 3ab: bipush 2
      // 3ac: anewarray 137
      // 3af: dup_x1
      // 3b0: swap
      // 3b1: bipush 1
      // 3b2: swap
      // 3b3: aastore
      // 3b4: dup_x2
      // 3b5: dup_x2
      // 3b6: pop
      // 3b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ba: bipush 0
      // 3bb: swap
      // 3bc: aastore
      // 3bd: ldc2_w 1011294040541435412
      // 3c0: lload 8
      // 3c2: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: astore 44
      // 3c9: aload 44
      // 3cb: aload 35
      // 3cd: lload 8
      // 3cf: lconst_0
      // 3d0: lcmp
      // 3d1: iflt 3d9
      // 3d4: ifnonnull 4b5
      // 3d7: aload 35
      // 3d9: ifnonnull 3fd
      // 3dc: goto 3ea
      // 3df: ldc2_w 1418535324840379703
      // 3e2: lload 8
      // 3e4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: athrow
      // 3ea: ifnull 46d
      // 3ed: goto 3fb
      // 3f0: ldc2_w 1418535324840379703
      // 3f3: lload 8
      // 3f5: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fa: athrow
      // 3fb: aload 44
      // 3fd: lload 18
      // 3ff: invokevirtual com/zelix/_v.N (J)Z
      // 402: aload 35
      // 404: ifnonnull 46c
      // 407: ifeq 455
      // 40a: goto 418
      // 40d: ldc2_w 1418535324840379703
      // 410: lload 8
      // 412: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: athrow
      // 418: aload 38
      // 41a: aload 44
      // 41c: lload 23
      // 41e: bipush 1
      // 41f: anewarray 137
      // 422: dup_x2
      // 423: dup_x2
      // 424: pop
      // 425: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 428: bipush 0
      // 429: swap
      // 42a: aastore
      // 42b: ldc2_w 1251471314984896768
      // 42e: lload 8
      // 430: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 435: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 43a: pop
      // 43b: aload 35
      // 43d: lload 8
      // 43f: lconst_0
      // 440: lcmp
      // 441: ifle 46f
      // 444: ifnull 46d
      // 447: goto 455
      // 44a: ldc2_w 1418535324840379703
      // 44d: lload 8
      // 44f: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 454: athrow
      // 455: aload 38
      // 457: aload 44
      // 459: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 45e: goto 46c
      // 461: ldc2_w 1418535324840379703
      // 464: lload 8
      // 466: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46b: athrow
      // 46c: pop
      // 46d: aload 35
      // 46f: ifnull 38c
      // 472: aload 40
      // 474: ldc2_w 1049889556715941093
      // 477: lload 8
      // 479: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47e: aload 35
      // 480: lload 8
      // 482: lconst_0
      // 483: lcmp
      // 484: ifle 532
      // 487: ifnonnull 529
      // 48a: ifne 516
      // 48d: goto 49b
      // 490: ldc2_w 1418535324840379703
      // 493: lload 8
      // 495: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49a: athrow
      // 49b: aload 40
      // 49d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 4a2: astore 42
      // 4a4: aload 42
      // 4a6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4ab: ifeq 516
      // 4ae: aload 42
      // 4b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4b5: checkcast com/zelix/b1
      // 4b8: astore 43
      // 4ba: aload 43
      // 4bc: invokevirtual com/zelix/b1.V ()Ljava/lang/String;
      // 4bf: lload 25
      // 4c1: dup2_x1
      // 4c2: pop2
      // 4c3: bipush 2
      // 4c4: anewarray 137
      // 4c7: dup_x1
      // 4c8: swap
      // 4c9: bipush 1
      // 4ca: swap
      // 4cb: aastore
      // 4cc: dup_x2
      // 4cd: dup_x2
      // 4ce: pop
      // 4cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d2: bipush 0
      // 4d3: swap
      // 4d4: aastore
      // 4d5: ldc2_w 637639294962910800
      // 4d8: lload 8
      // 4da: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4df: astore 44
      // 4e1: aload 35
      // 4e3: ifnonnull 582
      // 4e6: aload 44
      // 4e8: ifnull 511
      // 4eb: goto 4f9
      // 4ee: ldc2_w 1418535324840379703
      // 4f1: lload 8
      // 4f3: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f8: athrow
      // 4f9: aload 38
      // 4fb: aload 44
      // 4fd: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 502: pop
      // 503: goto 511
      // 506: ldc2_w 1418535324840379703
      // 509: lload 8
      // 50b: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 510: athrow
      // 511: aload 35
      // 513: ifnull 4a4
      // 516: aload 38
      // 518: ldc2_w 1049889556715941093
      // 51b: lload 8
      // 51d: lload 8
      // 51f: lconst_0
      // 520: lcmp
      // 521: iflt 589
      // 524: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 529: lload 8
      // 52b: lconst_0
      // 52c: lcmp
      // 52d: iflt 58e
      // 530: aload 35
      // 532: ifnonnull 58e
      // 535: ifne 582
      // 538: goto 546
      // 53b: ldc2_w 1418535324840379703
      // 53e: lload 8
      // 540: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 545: athrow
      // 546: aload 6
      // 548: aload 4
      // 54a: lload 27
      // 54c: invokevirtual com/zelix/b1.G (J)Lcom/zelix/_v;
      // 54f: aload 38
      // 551: lload 14
      // 553: bipush 3
      // 554: anewarray 137
      // 557: dup_x2
      // 558: dup_x2
      // 559: pop
      // 55a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55d: bipush 2
      // 55e: swap
      // 55f: aastore
      // 560: dup_x1
      // 561: swap
      // 562: bipush 1
      // 563: swap
      // 564: aastore
      // 565: dup_x1
      // 566: swap
      // 567: bipush 0
      // 568: swap
      // 569: aastore
      // 56a: ldc2_w 1667135910008612418
      // 56d: lload 8
      // 56f: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 574: goto 582
      // 577: ldc2_w 1418535324840379703
      // 57a: lload 8
      // 57c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 581: athrow
      // 582: aload 37
      // 584: ldc2_w 1049889556715941093
      // 587: lload 8
      // 589: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58e: ifne 5cd
      // 591: aload 6
      // 593: aload 4
      // 595: lload 27
      // 597: invokevirtual com/zelix/b1.G (J)Lcom/zelix/_v;
      // 59a: aload 37
      // 59c: lload 14
      // 59e: bipush 3
      // 59f: anewarray 137
      // 5a2: dup_x2
      // 5a3: dup_x2
      // 5a4: pop
      // 5a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5a8: bipush 2
      // 5a9: swap
      // 5aa: aastore
      // 5ab: dup_x1
      // 5ac: swap
      // 5ad: bipush 1
      // 5ae: swap
      // 5af: aastore
      // 5b0: dup_x1
      // 5b1: swap
      // 5b2: bipush 0
      // 5b3: swap
      // 5b4: aastore
      // 5b5: ldc2_w 1667135910008612418
      // 5b8: lload 8
      // 5ba: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bf: goto 5cd
      // 5c2: ldc2_w 1418535324840379703
      // 5c5: lload 8
      // 5c7: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cc: athrow
      // 5cd: return
   }

   public Set n(Object[] param1) {
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
      // 004: checkcast com/zelix/bn
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/hy.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 119399843356393
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 48
      // 022: lushr
      // 023: l2i
      // 024: istore 5
      // 026: dup2
      // 027: bipush 16
      // 029: lshl
      // 02a: bipush 32
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 6
      // 030: dup2
      // 031: bipush 48
      // 033: lshl
      // 034: bipush 48
      // 036: lushr
      // 037: l2i
      // 038: istore 7
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 63735177460273
      // 03f: lxor
      // 040: lstore 8
      // 042: dup2
      // 043: ldc2_w 91563955583928
      // 046: lxor
      // 047: lstore 10
      // 049: dup2
      // 04a: ldc2_w 63735177460273
      // 04d: lxor
      // 04e: lstore 12
      // 050: dup2
      // 051: ldc2_w 23154346874082
      // 054: lxor
      // 055: lstore 14
      // 057: pop2
      // 058: aload 2
      // 059: lload 8
      // 05b: invokevirtual com/zelix/bn.h (J)Ljava/lang/String;
      // 05e: astore 17
      // 060: lload 10
      // 062: bipush 1
      // 063: anewarray 137
      // 066: dup_x2
      // 067: dup_x2
      // 068: pop
      // 069: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06c: bipush 0
      // 06d: swap
      // 06e: aastore
      // 06f: ldc2_w 6313088643914739231
      // 072: lload 3
      // 073: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: astore 18
      // 07a: ldc2_w 5552383768890387778
      // 07d: lload 3
      // 07e: invokedynamic o (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: aload 0
      // 084: ldc2_w 6151669550420765386
      // 087: lload 3
      // 088: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/l6q; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: aload 2
      // 08e: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 091: iload 5
      // 093: i2c
      // 094: swap
      // 095: iload 6
      // 097: iload 7
      // 099: i2s
      // 09a: invokevirtual com/zelix/l6q.t (CLjava/lang/Object;IS)Ljava/util/List;
      // 09d: astore 19
      // 09f: astore 16
      // 0a1: aload 19
      // 0a3: aload 16
      // 0a5: ifnonnull 0ba
      // 0a8: ifnull 158
      // 0ab: goto 0b8
      // 0ae: ldc2_w 5790156184366024386
      // 0b1: lload 3
      // 0b2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 19
      // 0ba: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0bf: astore 20
      // 0c1: aload 20
      // 0c3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c8: ifeq 158
      // 0cb: aload 20
      // 0cd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d2: checkcast com/zelix/_v
      // 0d5: astore 21
      // 0d7: aload 21
      // 0d9: invokevirtual com/zelix/_v.G ()Z
      // 0dc: aload 16
      // 0de: lload 3
      // 0df: lconst_0
      // 0e0: lcmp
      // 0e1: ifle 126
      // 0e4: ifnonnull 124
      // 0e7: ifeq 153
      // 0ea: goto 0f7
      // 0ed: ldc2_w 5790156184366024386
      // 0f0: lload 3
      // 0f1: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: ldc2_w 5539761356873778821
      // 0fb: lload 3
      // 0fc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/sh; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: aload 21
      // 103: lload 12
      // 105: invokevirtual com/zelix/_v.h (J)Ljava/lang/String;
      // 108: lload 14
      // 10a: dup2_x1
      // 10b: pop2
      // 10c: aload 17
      // 10e: ldc2_w 5914857591897235787
      // 111: lload 3
      // 112: invokedynamic p (Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: goto 124
      // 11a: ldc2_w 5790156184366024386
      // 11d: lload 3
      // 11e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: aload 16
      // 126: ifnonnull 152
      // 129: ifeq 153
      // 12c: goto 139
      // 12f: ldc2_w 5790156184366024386
      // 132: lload 3
      // 133: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: aload 18
      // 13b: aload 21
      // 13d: checkcast com/zelix/_f
      // 140: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 145: goto 152
      // 148: ldc2_w 5790156184366024386
      // 14b: lload 3
      // 14c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: pop
      // 153: aload 16
      // 155: ifnull 0c1
      // 158: aload 18
      // 15a: areturn
   }

   private void z(Object[] param1) {
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
      // 00e: checkcast com/zelix/l62
      // 011: astore 6
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Set
      // 019: astore 7
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/df
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/df
      // 028: astore 5
      // 02a: pop
      // 02b: getstatic com/zelix/hy.a J
      // 02e: lload 3
      // 02f: lxor
      // 030: lstore 3
      // 031: lload 3
      // 032: dup2
      // 033: ldc2_w 87225559095467
      // 036: lxor
      // 037: lstore 8
      // 039: dup2
      // 03a: ldc2_w 116411986356738
      // 03d: lxor
      // 03e: lstore 10
      // 040: dup2
      // 041: ldc2_w 101462457475911
      // 044: lxor
      // 045: lstore 12
      // 047: dup2
      // 048: ldc2_w 90014956670310
      // 04b: lxor
      // 04c: lstore 14
      // 04e: dup2
      // 04f: ldc2_w 79942704246449
      // 052: lxor
      // 053: lstore 16
      // 055: dup2
      // 056: ldc2_w 115637622985545
      // 059: lxor
      // 05a: dup2
      // 05b: bipush 32
      // 05d: lushr
      // 05e: lstore 18
      // 060: dup2
      // 061: bipush 32
      // 063: lshl
      // 064: bipush 32
      // 066: lushr
      // 067: l2i
      // 068: istore 20
      // 06a: pop2
      // 06b: dup2
      // 06c: ldc2_w 90874201923110
      // 06f: lxor
      // 070: dup2
      // 071: bipush 48
      // 073: lushr
      // 074: l2i
      // 075: istore 21
      // 077: dup2
      // 078: bipush 16
      // 07a: lshl
      // 07b: bipush 48
      // 07d: lushr
      // 07e: l2i
      // 07f: istore 22
      // 081: dup2
      // 082: bipush 32
      // 084: lshl
      // 085: bipush 32
      // 087: lushr
      // 088: l2i
      // 089: istore 23
      // 08b: pop2
      // 08c: pop2
      // 08d: ldc2_w -2206403460615667411
      // 090: lload 3
      // 091: invokedynamic h (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: aload 6
      // 098: ldc2_w -2029477629529599235
      // 09b: lload 3
      // 09c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: astore 25
      // 0a3: astore 24
      // 0a5: aload 2
      // 0a6: lload 10
      // 0a8: aload 25
      // 0aa: invokevirtual com/zelix/df.J (JLjava/lang/Object;)Ljava/util/Set;
      // 0ad: astore 26
      // 0af: aload 26
      // 0b1: aload 24
      // 0b3: ifnonnull 0c8
      // 0b6: ifnull 0d0
      // 0b9: goto 0c6
      // 0bc: ldc2_w -273166517619676499
      // 0bf: lload 3
      // 0c0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 7
      // 0c8: aload 26
      // 0ca: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 0cf: pop
      // 0d0: aload 25
      // 0d2: iload 21
      // 0d4: i2c
      // 0d5: iload 22
      // 0d7: i2s
      // 0d8: iload 23
      // 0da: invokevirtual com/zelix/_v.P (CSI)Z
      // 0dd: aload 24
      // 0df: ifnonnull 1c8
      // 0e2: ifeq 17b
      // 0e5: goto 0f2
      // 0e8: ldc2_w -273166517619676499
      // 0eb: lload 3
      // 0ec: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 25
      // 0f4: lload 18
      // 0f6: iload 20
      // 0f8: bipush 2
      // 0f9: anewarray 137
      // 0fc: dup_x1
      // 0fd: swap
      // 0fe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 101: bipush 1
      // 102: swap
      // 103: aastore
      // 104: dup_x2
      // 105: dup_x2
      // 106: pop
      // 107: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10a: bipush 0
      // 10b: swap
      // 10c: aastore
      // 10d: ldc2_w -132421245109773603
      // 110: lload 3
      // 111: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11b: astore 27
      // 11d: aload 27
      // 11f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 124: ifeq 17b
      // 127: aload 27
      // 129: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12e: checkcast com/zelix/_v
      // 131: astore 28
      // 133: aload 2
      // 134: lload 10
      // 136: aload 28
      // 138: invokevirtual com/zelix/df.J (JLjava/lang/Object;)Ljava/util/Set;
      // 13b: astore 29
      // 13d: lload 3
      // 13e: lconst_0
      // 13f: lcmp
      // 140: ifle 234
      // 143: aload 29
      // 145: aload 24
      // 147: ifnonnull 207
      // 14a: aload 24
      // 14c: ifnonnull 16e
      // 14f: goto 15c
      // 152: ldc2_w -273166517619676499
      // 155: lload 3
      // 156: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: ifnull 176
      // 15f: goto 16c
      // 162: ldc2_w -273166517619676499
      // 165: lload 3
      // 166: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: aload 7
      // 16e: aload 29
      // 170: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 175: pop
      // 176: aload 24
      // 178: ifnull 11d
      // 17b: aload 5
      // 17d: aload 25
      // 17f: aload 7
      // 181: lload 8
      // 183: bipush 3
      // 184: anewarray 137
      // 187: dup_x2
      // 188: dup_x2
      // 189: pop
      // 18a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18d: bipush 2
      // 18e: swap
      // 18f: aastore
      // 190: dup_x1
      // 191: swap
      // 192: bipush 1
      // 193: swap
      // 194: aastore
      // 195: dup_x1
      // 196: swap
      // 197: bipush 0
      // 198: swap
      // 199: aastore
      // 19a: ldc2_w -524395141606700584
      // 19d: lload 3
      // 19e: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: lload 3
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: ifle 239
      // 1a9: aload 25
      // 1ab: aload 24
      // 1ad: ifnonnull 1cd
      // 1b0: iload 21
      // 1b2: i2c
      // 1b3: iload 22
      // 1b5: i2s
      // 1b6: iload 23
      // 1b8: invokevirtual com/zelix/_v.P (CSI)Z
      // 1bb: goto 1c8
      // 1be: ldc2_w -273166517619676499
      // 1c1: lload 3
      // 1c2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: athrow
      // 1c8: ifeq 239
      // 1cb: aload 25
      // 1cd: lload 18
      // 1cf: iload 20
      // 1d1: bipush 2
      // 1d2: anewarray 137
      // 1d5: dup_x1
      // 1d6: swap
      // 1d7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1da: bipush 1
      // 1db: swap
      // 1dc: aastore
      // 1dd: dup_x2
      // 1de: dup_x2
      // 1df: pop
      // 1e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e3: bipush 0
      // 1e4: swap
      // 1e5: aastore
      // 1e6: ldc2_w -132421245109773603
      // 1e9: lload 3
      // 1ea: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1f4: astore 27
      // 1f6: aload 27
      // 1f8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1fd: ifeq 239
      // 200: aload 27
      // 202: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 207: checkcast com/zelix/_v
      // 20a: astore 28
      // 20c: aload 5
      // 20e: aload 28
      // 210: aload 7
      // 212: lload 8
      // 214: bipush 3
      // 215: anewarray 137
      // 218: dup_x2
      // 219: dup_x2
      // 21a: pop
      // 21b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21e: bipush 2
      // 21f: swap
      // 220: aastore
      // 221: dup_x1
      // 222: swap
      // 223: bipush 1
      // 224: swap
      // 225: aastore
      // 226: dup_x1
      // 227: swap
      // 228: bipush 0
      // 229: swap
      // 22a: aastore
      // 22b: ldc2_w -524395141606700584
      // 22e: lload 3
      // 22f: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: aload 24
      // 236: ifnull 1f6
      // 239: aload 6
      // 23b: lload 14
      // 23d: bipush 1
      // 23e: anewarray 137
      // 241: dup_x2
      // 242: dup_x2
      // 243: pop
      // 244: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 247: bipush 0
      // 248: swap
      // 249: aastore
      // 24a: ldc2_w -414037159979108681
      // 24d: lload 3
      // 24e: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: astore 27
      // 255: aload 27
      // 257: aload 24
      // 259: ifnonnull 26e
      // 25c: ifnull 2fd
      // 25f: goto 26c
      // 262: ldc2_w -273166517619676499
      // 265: lload 3
      // 266: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: athrow
      // 26c: aload 27
      // 26e: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 273: ifeq 2fd
      // 276: aload 27
      // 278: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 27d: checkcast com/zelix/l62
      // 280: astore 28
      // 282: aload 28
      // 284: ldc2_w -2029477629529599235
      // 287: lload 3
      // 288: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/_v; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: astore 29
      // 28f: lload 3
      // 290: lconst_0
      // 291: lcmp
      // 292: iflt 2eb
      // 295: aload 29
      // 297: ifnull 2f8
      // 29a: aload 0
      // 29b: lload 16
      // 29d: aload 28
      // 29f: aload 7
      // 2a1: lload 12
      // 2a3: bipush 2
      // 2a4: anewarray 137
      // 2a7: dup_x2
      // 2a8: dup_x2
      // 2a9: pop
      // 2aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ad: bipush 1
      // 2ae: swap
      // 2af: aastore
      // 2b0: dup_x1
      // 2b1: swap
      // 2b2: bipush 0
      // 2b3: swap
      // 2b4: aastore
      // 2b5: ldc2_w -106136043899720044
      // 2b8: lload 3
      // 2b9: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: aload 2
      // 2bf: aload 5
      // 2c1: bipush 5
      // 2c2: anewarray 137
      // 2c5: dup_x1
      // 2c6: swap
      // 2c7: bipush 4
      // 2c8: swap
      // 2c9: aastore
      // 2ca: dup_x1
      // 2cb: swap
      // 2cc: bipush 3
      // 2cd: swap
      // 2ce: aastore
      // 2cf: dup_x1
      // 2d0: swap
      // 2d1: bipush 2
      // 2d2: swap
      // 2d3: aastore
      // 2d4: dup_x1
      // 2d5: swap
      // 2d6: bipush 1
      // 2d7: swap
      // 2d8: aastore
      // 2d9: dup_x2
      // 2da: dup_x2
      // 2db: pop
      // 2dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2df: bipush 0
      // 2e0: swap
      // 2e1: aastore
      // 2e2: ldc2_w -2291486263793783588
      // 2e5: lload 3
      // 2e6: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: goto 2f8
      // 2ee: ldc2_w -273166517619676499
      // 2f1: lload 3
      // 2f2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: athrow
      // 2f8: aload 24
      // 2fa: ifnull 26c
      // 2fd: lload 3
      // 2fe: lconst_0
      // 2ff: lcmp
      // 300: ifle 276
      // 303: return
   }

   public boolean V(Object[] param1) {
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
      // 04: checkcast com/zelix/bn
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/hy.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 22790300598867
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -3429918506674376662
      // 25: lload 3
      // 26: invokedynamic o (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: astore 7
      // 2d: aload 0
      // 2e: ldc2_w -3436923455330279986
      // 31: lload 3
      // 32: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 2
      // 38: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 3d: aload 7
      // 3f: ifnonnull 7d
      // 42: ifeq 5e
      // 45: goto 52
      // 48: ldc2_w -3660660637487162454
      // 4b: lload 3
      // 4c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: bipush 1
      // 53: ireturn
      // 54: ldc2_w -3660660637487162454
      // 57: lload 3
      // 58: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 0
      // 5f: lload 5
      // 61: aload 2
      // 62: bipush 2
      // 63: anewarray 137
      // 66: dup_x1
      // 67: swap
      // 68: bipush 1
      // 69: swap
      // 6a: aastore
      // 6b: dup_x2
      // 6c: dup_x2
      // 6d: pop
      // 6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 71: bipush 0
      // 72: swap
      // 73: aastore
      // 74: ldc2_w -3604011569999082554
      // 77: lload 3
      // 78: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: ireturn
   }

   static {
      long var11 = a ^ 13466114887126L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "\u0017T\u0096\u0003õ°uÏt\"7ð\u0005V¯\u0085:$fîØ¿\u0017ÙÇÿ¸(\u0091´Ã\u009bjÕCÁ\u009dã-A#Ý\u0097NÎ\u0012Û \u0012ðl\u0001CÉhÃÇ\u0000©´\u009dHg\u000f\u0093`\u0084\u008aöG\u0016>\u0096\u001eóa~\u0017Ó\u008f§S\u0099¯Ï¨\u009a7\u0010ù{7ÚÔ\u001fkP\u008a~zó\u0012Ü+r\u0018Ë\u0017¾à\u0014L4\u0083z\u0016HàÔïòGg`\u009bFuÞp!HaåSl\u001bj\u001eB\u001bkûéªC¥g\u0002D½Á!ìÂ§vAÏH×é\u0000\rE\u001d@\u001cpÓièÊ´ß'Uº1cl³°\u001e\u008d\u0016uäªÞÙ×r~e\u0013S\u009a.WD>\u0001G\u0010®\u0090K?\u008a\u0099÷Ä»ã\u0097):è\u0001\u0001";
      int var19 = "\u0017T\u0096\u0003õ°uÏt\"7ð\u0005V¯\u0085:$fîØ¿\u0017ÙÇÿ¸(\u0091´Ã\u009bjÕCÁ\u009dã-A#Ý\u0097NÎ\u0012Û \u0012ðl\u0001CÉhÃÇ\u0000©´\u009dHg\u000f\u0093`\u0084\u008aöG\u0016>\u0096\u001eóa~\u0017Ó\u008f§S\u0099¯Ï¨\u009a7\u0010ù{7ÚÔ\u001fkP\u008a~zó\u0012Ü+r\u0018Ë\u0017¾à\u0014L4\u0083z\u0016HàÔïòGg`\u009bFuÞp!HaåSl\u001bj\u001eB\u001bkûéªC¥g\u0002D½Á!ìÂ§vAÏH×é\u0000\rE\u001d@\u001cpÓièÊ´ß'Uº1cl³°\u001e\u008d\u0016uäªÞÙ×r~e\u0013S\u009a.WD>\u0001G\u0010®\u0090K?\u008a\u0099÷Ä»ã\u0097):è\u0001\u0001"
         .length();
      char var16 = 'X';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[7];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "&Îá\u0000I¯»\u0080ûÔ+s% nç";
                     int var5 = "&Îá\u0000I¯»\u0080ûÔ+s% nç".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
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
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[2];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "ê¹h©M\u0084÷Éô«EGùjEôP\u008dðÛ&Ip¸ç9ä5:\n\u009eÎzH/52\u000eùÅ\u0007ß\tÜ\u009aÁ\u0083\u0097\n\u009c\u0090\u001b\u0097-Æ\b^LM8\u0097\u0010:\n\fâEi\u0084\u0000 :P?Ë|Ì\u0093¹\u0006Ë\u0099/ì\u0083¡z2ÕX~ÇÀò\u001dÞ¢";
                  var19 = "ê¹h©M\u0084÷Éô«EGùjEôP\u008dðÛ&Ip¸ç9ä5:\n\u009eÎzH/52\u000eùÅ\u0007ß\tÜ\u009aÁ\u0083\u0097\n\u009c\u0090\u001b\u0097-Æ\b^LM8\u0097\u0010:\n\fâEi\u0084\u0000 :P?Ë|Ì\u0093¹\u0006Ë\u0099/ì\u0083¡z2ÕX~ÇÀò\u001dÞ¢"
                     .length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18807;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/hy", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/hy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6219;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/hy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/hy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
