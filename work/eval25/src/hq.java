package com.zelix;

import java.io.DataOutputStream;
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

public abstract class hq extends hn {
   private static final long d = ess.a(913052147245326649L, 7097118765604919433L, MethodHandles.lookup().lookupClass()).a(130678333137808L);
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final long[] j;
   private static final Integer[] k;
   private static final Map m;

   protected abstract void W(DataOutputStream var1, wp var2, Map var3, long var4);

   public abstract int I(Object[] var1);

   public static hq X(
      h6 param0,
      _op param1,
      n[] param2,
      n[] param3,
      _8c param4,
      Set param5,
      List param6,
      wp param7,
      pg param8,
      pg param9,
      Map param10,
      Map param11,
      long param12
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hq.d J
      // 003: lload 12
      // 005: lxor
      // 006: lstore 12
      // 008: lload 12
      // 00a: dup2
      // 00b: ldc2_w 120146493895927
      // 00e: lxor
      // 00f: lstore 14
      // 011: dup2
      // 012: ldc2_w 101122029910986
      // 015: lxor
      // 016: lstore 16
      // 018: dup2
      // 019: ldc2_w 137431143049471
      // 01c: lxor
      // 01d: dup2
      // 01e: bipush 48
      // 020: lushr
      // 021: l2i
      // 022: istore 18
      // 024: dup2
      // 025: bipush 16
      // 027: lshl
      // 028: bipush 32
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 19
      // 02e: dup2
      // 02f: bipush 48
      // 031: lshl
      // 032: bipush 48
      // 034: lushr
      // 035: l2i
      // 036: istore 20
      // 038: pop2
      // 039: dup2
      // 03a: ldc2_w 65803544637829
      // 03d: lxor
      // 03e: lstore 21
      // 040: dup2
      // 041: ldc2_w 99303475926356
      // 044: lxor
      // 045: lstore 23
      // 047: dup2
      // 048: ldc2_w 106456615060961
      // 04b: lxor
      // 04c: lstore 25
      // 04e: pop2
      // 04f: ldc2_w 3897168031020418687
      // 052: lload 12
      // 054: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: aload 1
      // 05a: invokevirtual com/zelix/_op.W ()I
      // 05d: istore 28
      // 05f: istore 27
      // 061: aload 7
      // 063: lload 25
      // 065: invokevirtual com/zelix/wp.C (J)I
      // 068: istore 30
      // 06a: iload 30
      // 06c: bipush -1
      // 06d: iload 27
      // 06f: ifeq 0a7
      // 072: if_icmpne 093
      // 075: goto 083
      // 078: ldc2_w 3017381123213253950
      // 07b: lload 12
      // 07d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: iload 28
      // 085: istore 29
      // 087: lload 12
      // 089: lconst_0
      // 08a: lcmp
      // 08b: iflt 0b1
      // 08e: iload 27
      // 090: ifne 0aa
      // 093: iload 28
      // 095: iload 30
      // 097: isub
      // 098: bipush 1
      // 099: goto 0a7
      // 09c: ldc2_w 3017381123213253950
      // 09f: lload 12
      // 0a1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: isub
      // 0a8: istore 29
      // 0aa: aload 7
      // 0ac: iload 28
      // 0ae: invokevirtual com/zelix/wp.V (I)V
      // 0b1: aload 9
      // 0b3: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 0b6: checkcast [Lcom/zelix/ie;
      // 0b9: astore 31
      // 0bb: aload 0
      // 0bc: aload 3
      // 0bd: aload 4
      // 0bf: aload 5
      // 0c1: aload 6
      // 0c3: bipush 1
      // 0c4: iload 18
      // 0c6: i2s
      // 0c7: aload 10
      // 0c9: iload 19
      // 0cb: iload 20
      // 0cd: aload 11
      // 0cf: invokestatic com/zelix/ie.f (Lcom/zelix/h9;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;ZSLjava/util/Map;IILjava/util/Map;)[Lcom/zelix/ie;
      // 0d2: astore 32
      // 0d4: aload 0
      // 0d5: aload 2
      // 0d6: aload 4
      // 0d8: aload 5
      // 0da: aload 6
      // 0dc: bipush 0
      // 0dd: iload 18
      // 0df: i2s
      // 0e0: aload 10
      // 0e2: iload 19
      // 0e4: iload 20
      // 0e6: aload 11
      // 0e8: invokestatic com/zelix/ie.f (Lcom/zelix/h9;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;ZSLjava/util/Map;IILjava/util/Map;)[Lcom/zelix/ie;
      // 0eb: astore 33
      // 0ed: aload 31
      // 0ef: aload 32
      // 0f1: lload 21
      // 0f3: invokestatic com/zelix/hq.S ([Lcom/zelix/ie;[Lcom/zelix/ie;J)Z
      // 0f6: istore 34
      // 0f8: aconst_null
      // 0f9: astore 35
      // 0fb: bipush -1
      // 0fc: istore 36
      // 0fe: getstatic com/zelix/mc.rD Z
      // 101: iload 27
      // 103: lload 12
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 148
      // 10a: ifeq 146
      // 10d: ifeq 144
      // 110: goto 11e
      // 113: ldc2_w 3017381123213253950
      // 116: lload 12
      // 118: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: sipush 30983
      // 121: ldc2_w 3297638980883438177
      // 124: lload 12
      // 126: lxor
      // 127: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: istore 36
      // 12e: new com/zelix/hi
      // 131: dup
      // 132: aload 0
      // 133: iload 29
      // 135: aload 1
      // 136: aload 33
      // 138: aload 32
      // 13a: lload 14
      // 13c: invokespecial com/zelix/hi.<init> (Lcom/zelix/h6;ILcom/zelix/_op;[Lcom/zelix/ie;[Lcom/zelix/ie;J)V
      // 13f: astore 35
      // 141: goto 58e
      // 144: iload 34
      // 146: iload 27
      // 148: ifeq 228
      // 14b: ifeq 226
      // 14e: goto 15c
      // 151: ldc2_w 3017381123213253950
      // 154: lload 12
      // 156: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: aload 33
      // 15e: arraylength
      // 15f: iload 27
      // 161: lload 12
      // 163: lconst_0
      // 164: lcmp
      // 165: ifle 22a
      // 168: ifeq 228
      // 16b: goto 179
      // 16e: ldc2_w 3017381123213253950
      // 171: lload 12
      // 173: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: ifne 226
      // 17c: goto 18a
      // 17f: ldc2_w 3017381123213253950
      // 182: lload 12
      // 184: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: iload 29
      // 18c: iload 27
      // 18e: ifeq 214
      // 191: goto 19f
      // 194: ldc2_w 3017381123213253950
      // 197: lload 12
      // 199: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: athrow
      // 19f: lload 12
      // 1a1: lconst_0
      // 1a2: lcmp
      // 1a3: ifle 209
      // 1a6: iflt 206
      // 1a9: goto 1b7
      // 1ac: ldc2_w 3017381123213253950
      // 1af: lload 12
      // 1b1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: lload 12
      // 1b9: lconst_0
      // 1ba: lcmp
      // 1bb: iflt 216
      // 1be: iload 29
      // 1c0: iload 27
      // 1c2: ifeq 214
      // 1c5: goto 1d3
      // 1c8: ldc2_w 3017381123213253950
      // 1cb: lload 12
      // 1cd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: athrow
      // 1d3: sipush 25662
      // 1d6: ldc2_w 3699465528343807829
      // 1d9: lload 12
      // 1db: lxor
      // 1dc: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: if_icmpgt 206
      // 1e4: goto 1f2
      // 1e7: ldc2_w 3017381123213253950
      // 1ea: lload 12
      // 1ec: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: iload 29
      // 1f4: istore 36
      // 1f6: new com/zelix/h5
      // 1f9: dup
      // 1fa: aload 0
      // 1fb: iload 36
      // 1fd: aload 1
      // 1fe: invokespecial com/zelix/h5.<init> (Lcom/zelix/h6;ILcom/zelix/_op;)V
      // 201: astore 35
      // 203: goto 58e
      // 206: sipush 5006
      // 209: ldc2_w 589870872774160615
      // 20c: lload 12
      // 20e: lxor
      // 20f: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: istore 36
      // 216: new com/zelix/hl
      // 219: dup
      // 21a: aload 0
      // 21b: aload 1
      // 21c: iload 29
      // 21e: invokespecial com/zelix/hl.<init> (Lcom/zelix/h6;Lcom/zelix/_op;I)V
      // 221: astore 35
      // 223: goto 58e
      // 226: iload 34
      // 228: iload 27
      // 22a: ifeq 323
      // 22d: ifeq 320
      // 230: goto 23e
      // 233: ldc2_w 3017381123213253950
      // 236: lload 12
      // 238: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: aload 33
      // 240: arraylength
      // 241: iload 27
      // 243: lload 12
      // 245: lconst_0
      // 246: lcmp
      // 247: iflt 325
      // 24a: ifeq 323
      // 24d: goto 25b
      // 250: ldc2_w 3017381123213253950
      // 253: lload 12
      // 255: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: athrow
      // 25b: bipush 1
      // 25c: if_icmpne 320
      // 25f: goto 26d
      // 262: ldc2_w 3017381123213253950
      // 265: lload 12
      // 267: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: iload 29
      // 26f: iload 27
      // 271: ifeq 30a
      // 274: goto 282
      // 277: ldc2_w 3017381123213253950
      // 27a: lload 12
      // 27c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: athrow
      // 282: lload 12
      // 284: lconst_0
      // 285: lcmp
      // 286: ifle 2ff
      // 289: iflt 2fc
      // 28c: goto 29a
      // 28f: ldc2_w 3017381123213253950
      // 292: lload 12
      // 294: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: athrow
      // 29a: lload 12
      // 29c: lconst_0
      // 29d: lcmp
      // 29e: ifle 30c
      // 2a1: iload 29
      // 2a3: iload 27
      // 2a5: ifeq 30a
      // 2a8: goto 2b6
      // 2ab: ldc2_w 3017381123213253950
      // 2ae: lload 12
      // 2b0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: athrow
      // 2b6: sipush 25662
      // 2b9: ldc2_w 3699465528343807829
      // 2bc: lload 12
      // 2be: lxor
      // 2bf: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c4: if_icmpgt 2fc
      // 2c7: goto 2d5
      // 2ca: ldc2_w 3017381123213253950
      // 2cd: lload 12
      // 2cf: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: athrow
      // 2d5: iload 29
      // 2d7: sipush 13019
      // 2da: ldc2_w 6278247619847721403
      // 2dd: lload 12
      // 2df: lxor
      // 2e0: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: iadd
      // 2e6: istore 36
      // 2e8: new com/zelix/ht
      // 2eb: dup
      // 2ec: aload 0
      // 2ed: iload 36
      // 2ef: aload 1
      // 2f0: aload 33
      // 2f2: bipush 0
      // 2f3: aaload
      // 2f4: invokespecial com/zelix/ht.<init> (Lcom/zelix/h6;ILcom/zelix/_op;Lcom/zelix/ie;)V
      // 2f7: astore 35
      // 2f9: goto 58e
      // 2fc: sipush 16383
      // 2ff: ldc2_w 8315430837090720926
      // 302: lload 12
      // 304: lxor
      // 305: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: istore 36
      // 30c: new com/zelix/hm
      // 30f: dup
      // 310: aload 0
      // 311: iload 29
      // 313: aload 1
      // 314: aload 33
      // 316: bipush 0
      // 317: aaload
      // 318: invokespecial com/zelix/hm.<init> (Lcom/zelix/h6;ILcom/zelix/_op;Lcom/zelix/ie;)V
      // 31b: astore 35
      // 31d: goto 58e
      // 320: aload 33
      // 322: arraylength
      // 323: iload 27
      // 325: ifeq 34e
      // 328: ifne 58e
      // 32b: goto 339
      // 32e: ldc2_w 3017381123213253950
      // 331: lload 12
      // 333: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: athrow
      // 339: aload 31
      // 33b: arraylength
      // 33c: aload 32
      // 33e: arraylength
      // 33f: isub
      // 340: goto 34e
      // 343: ldc2_w 3017381123213253950
      // 346: lload 12
      // 348: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34d: athrow
      // 34e: istore 37
      // 350: iload 37
      // 352: bipush 1
      // 353: iload 27
      // 355: ifeq 38d
      // 358: if_icmplt 453
      // 35b: goto 369
      // 35e: ldc2_w 3017381123213253950
      // 361: lload 12
      // 363: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: athrow
      // 369: iload 37
      // 36b: iload 27
      // 36d: ifeq 391
      // 370: goto 37e
      // 373: ldc2_w 3017381123213253950
      // 376: lload 12
      // 378: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: athrow
      // 37e: bipush 3
      // 37f: goto 38d
      // 382: ldc2_w 3017381123213253950
      // 385: lload 12
      // 387: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38c: athrow
      // 38d: if_icmpgt 453
      // 390: bipush 1
      // 391: istore 38
      // 393: bipush 0
      // 394: istore 39
      // 396: iload 39
      // 398: aload 32
      // 39a: arraylength
      // 39b: if_icmpge 40b
      // 39e: aload 31
      // 3a0: iload 39
      // 3a2: aaload
      // 3a3: aload 32
      // 3a5: iload 39
      // 3a7: aaload
      // 3a8: lload 16
      // 3aa: dup2_x1
      // 3ab: pop2
      // 3ac: invokevirtual com/zelix/ie.b (JLcom/zelix/ie;)Z
      // 3af: iload 27
      // 3b1: lload 12
      // 3b3: lconst_0
      // 3b4: lcmp
      // 3b5: ifle 40f
      // 3b8: ifeq 40d
      // 3bb: iload 27
      // 3bd: ifeq 3e0
      // 3c0: goto 3ce
      // 3c3: ldc2_w 3017381123213253950
      // 3c6: lload 12
      // 3c8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cd: athrow
      // 3ce: ifne 3ee
      // 3d1: goto 3df
      // 3d4: ldc2_w 3017381123213253950
      // 3d7: lload 12
      // 3d9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3de: athrow
      // 3df: bipush 0
      // 3e0: istore 38
      // 3e2: iload 27
      // 3e4: lload 12
      // 3e6: lconst_0
      // 3e7: lcmp
      // 3e8: ifle 3f3
      // 3eb: ifne 40b
      // 3ee: iinc 39 1
      // 3f1: iload 27
      // 3f3: ifne 396
      // 3f6: lload 12
      // 3f8: lconst_0
      // 3f9: lcmp
      // 3fa: iflt 39e
      // 3fd: goto 40b
      // 400: ldc2_w 3017381123213253950
      // 403: lload 12
      // 405: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40a: athrow
      // 40b: iload 38
      // 40d: iload 27
      // 40f: ifeq 442
      // 412: ifeq 453
      // 415: goto 423
      // 418: ldc2_w 3017381123213253950
      // 41b: lload 12
      // 41d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 422: athrow
      // 423: sipush 5006
      // 426: ldc2_w 589870872774160615
      // 429: lload 12
      // 42b: lxor
      // 42c: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 431: iload 37
      // 433: isub
      // 434: goto 442
      // 437: ldc2_w 3017381123213253950
      // 43a: lload 12
      // 43c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 441: athrow
      // 442: istore 36
      // 444: new com/zelix/h0
      // 447: dup
      // 448: aload 0
      // 449: iload 36
      // 44b: iload 29
      // 44d: aload 1
      // 44e: invokespecial com/zelix/h0.<init> (Lcom/zelix/h6;IILcom/zelix/_op;)V
      // 451: astore 35
      // 453: iload 36
      // 455: bipush -1
      // 456: iload 27
      // 458: ifeq 5ab
      // 45b: if_icmpne 58e
      // 45e: goto 46c
      // 461: ldc2_w 3017381123213253950
      // 464: lload 12
      // 466: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46b: athrow
      // 46c: aload 32
      // 46e: arraylength
      // 46f: aload 31
      // 471: arraylength
      // 472: isub
      // 473: istore 38
      // 475: iload 38
      // 477: bipush 1
      // 478: iload 27
      // 47a: ifeq 5ab
      // 47d: if_icmplt 58e
      // 480: goto 48e
      // 483: ldc2_w 3017381123213253950
      // 486: lload 12
      // 488: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48d: athrow
      // 48e: iload 38
      // 490: bipush 3
      // 491: iload 27
      // 493: ifeq 5ab
      // 496: goto 4a4
      // 499: ldc2_w 3017381123213253950
      // 49c: lload 12
      // 49e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: athrow
      // 4a4: if_icmpgt 58e
      // 4a7: goto 4b5
      // 4aa: ldc2_w 3017381123213253950
      // 4ad: lload 12
      // 4af: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b4: athrow
      // 4b5: bipush 1
      // 4b6: istore 39
      // 4b8: bipush 0
      // 4b9: istore 40
      // 4bb: iload 40
      // 4bd: aload 31
      // 4bf: arraylength
      // 4c0: if_icmpge 530
      // 4c3: aload 31
      // 4c5: iload 40
      // 4c7: aaload
      // 4c8: aload 32
      // 4ca: iload 40
      // 4cc: aaload
      // 4cd: lload 16
      // 4cf: dup2_x1
      // 4d0: pop2
      // 4d1: invokevirtual com/zelix/ie.b (JLcom/zelix/ie;)Z
      // 4d4: iload 27
      // 4d6: lload 12
      // 4d8: lconst_0
      // 4d9: lcmp
      // 4da: ifle 534
      // 4dd: ifeq 532
      // 4e0: iload 27
      // 4e2: ifeq 505
      // 4e5: goto 4f3
      // 4e8: ldc2_w 3017381123213253950
      // 4eb: lload 12
      // 4ed: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f2: athrow
      // 4f3: ifne 513
      // 4f6: goto 504
      // 4f9: ldc2_w 3017381123213253950
      // 4fc: lload 12
      // 4fe: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 503: athrow
      // 504: bipush 0
      // 505: istore 39
      // 507: iload 27
      // 509: lload 12
      // 50b: lconst_0
      // 50c: lcmp
      // 50d: iflt 518
      // 510: ifne 530
      // 513: iinc 40 1
      // 516: iload 27
      // 518: ifne 4bb
      // 51b: lload 12
      // 51d: lconst_0
      // 51e: lcmp
      // 51f: iflt 4c3
      // 522: goto 530
      // 525: ldc2_w 3017381123213253950
      // 528: lload 12
      // 52a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52f: athrow
      // 530: iload 39
      // 532: iload 27
      // 534: lload 12
      // 536: lconst_0
      // 537: lcmp
      // 538: ifle 592
      // 53b: ifeq 590
      // 53e: ifeq 58e
      // 541: goto 54f
      // 544: ldc2_w 3017381123213253950
      // 547: lload 12
      // 549: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54e: athrow
      // 54f: sipush 5006
      // 552: ldc2_w 589870872774160615
      // 555: lload 12
      // 557: lxor
      // 558: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55d: iload 38
      // 55f: iadd
      // 560: istore 36
      // 562: iload 38
      // 564: istore 40
      // 566: iload 40
      // 568: anewarray 204
      // 56b: astore 41
      // 56d: aload 32
      // 56f: aload 32
      // 571: arraylength
      // 572: iload 40
      // 574: isub
      // 575: aload 41
      // 577: bipush 0
      // 578: iload 40
      // 57a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 57d: new com/zelix/hx
      // 580: dup
      // 581: aload 0
      // 582: iload 36
      // 584: iload 29
      // 586: aload 1
      // 587: aload 41
      // 589: invokespecial com/zelix/hx.<init> (Lcom/zelix/h6;IILcom/zelix/_op;[Lcom/zelix/ie;)V
      // 58c: astore 35
      // 58e: iload 36
      // 590: iload 27
      // 592: lload 12
      // 594: lconst_0
      // 595: lcmp
      // 596: iflt 59d
      // 599: ifeq 5bc
      // 59c: bipush -1
      // 59d: goto 5ab
      // 5a0: ldc2_w 3017381123213253950
      // 5a3: lload 12
      // 5a5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5aa: athrow
      // 5ab: if_icmpne 5d1
      // 5ae: sipush 30983
      // 5b1: ldc2_w 3297638980883438177
      // 5b4: lload 12
      // 5b6: lxor
      // 5b7: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bc: istore 36
      // 5be: new com/zelix/hi
      // 5c1: dup
      // 5c2: aload 0
      // 5c3: iload 29
      // 5c5: aload 1
      // 5c6: aload 33
      // 5c8: aload 32
      // 5ca: lload 14
      // 5cc: invokespecial com/zelix/hi.<init> (Lcom/zelix/h6;ILcom/zelix/_op;[Lcom/zelix/ie;[Lcom/zelix/ie;J)V
      // 5cf: astore 35
      // 5d1: aload 9
      // 5d3: lload 23
      // 5d5: aload 32
      // 5d7: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 5da: aload 8
      // 5dc: lload 23
      // 5de: aload 33
      // 5e0: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 5e3: aload 35
      // 5e5: areturn
   }

   static hq r(Object[] param0) {
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
      // 004: checkcast com/zelix/h6
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_xx
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_y4
      // 017: astore 7
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast com/zelix/_y4
      // 01f: astore 3
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/lang/Long
      // 026: invokevirtual java/lang/Long.longValue ()J
      // 029: lstore 1
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/io/PrintWriter
      // 030: astore 9
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast com/zelix/wp
      // 039: astore 6
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast java/util/Map
      // 042: astore 10
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast java/util/Map
      // 04b: astore 4
      // 04d: pop
      // 04e: getstatic com/zelix/hq.d J
      // 051: lload 1
      // 052: lxor
      // 053: lstore 1
      // 054: lload 1
      // 055: dup2
      // 056: ldc2_w 55128709985870
      // 059: lxor
      // 05a: dup2
      // 05b: bipush 32
      // 05d: lushr
      // 05e: l2i
      // 05f: istore 11
      // 061: dup2
      // 062: bipush 32
      // 064: lshl
      // 065: bipush 48
      // 067: lushr
      // 068: l2i
      // 069: istore 12
      // 06b: dup2
      // 06c: bipush 48
      // 06e: lshl
      // 06f: bipush 48
      // 071: lushr
      // 072: l2i
      // 073: istore 13
      // 075: pop2
      // 076: dup2
      // 077: ldc2_w 28967048771749
      // 07a: lxor
      // 07b: lstore 14
      // 07d: dup2
      // 07e: ldc2_w 112760104515167
      // 081: lxor
      // 082: lstore 16
      // 084: dup2
      // 085: ldc2_w 87886684576666
      // 088: lxor
      // 089: lstore 18
      // 08b: dup2
      // 08c: ldc2_w 23449957158501
      // 08f: lxor
      // 090: lstore 20
      // 092: dup2
      // 093: ldc2_w 70917449863164
      // 096: lxor
      // 097: lstore 22
      // 099: dup2
      // 09a: ldc2_w 107570239324226
      // 09d: lxor
      // 09e: lstore 24
      // 0a0: dup2
      // 0a1: ldc2_w 40112466745555
      // 0a4: lxor
      // 0a5: lstore 26
      // 0a7: dup2
      // 0a8: ldc2_w 8263340339900
      // 0ab: lxor
      // 0ac: lstore 28
      // 0ae: pop2
      // 0af: ldc2_w 5364820594316901943
      // 0b2: lload 1
      // 0b3: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: aconst_null
      // 0b9: astore 31
      // 0bb: istore 30
      // 0bd: aload 5
      // 0bf: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 0c2: istore 32
      // 0c4: iload 32
      // 0c6: sipush 30983
      // 0c9: ldc2_w 3297711481798703984
      // 0cc: lload 1
      // 0cd: lxor
      // 0ce: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: iload 30
      // 0d5: ifne 12e
      // 0d8: if_icmpne 107
      // 0db: goto 0e8
      // 0de: ldc2_w 5246313227209882671
      // 0e1: lload 1
      // 0e2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: new com/zelix/hi
      // 0eb: dup
      // 0ec: iload 32
      // 0ee: lload 20
      // 0f0: aload 8
      // 0f2: aload 5
      // 0f4: aload 7
      // 0f6: aload 3
      // 0f7: aload 9
      // 0f9: aload 6
      // 0fb: aload 10
      // 0fd: aload 4
      // 0ff: invokespecial com/zelix/hi.<init> (IJLcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;Lcom/zelix/wp;Ljava/util/Map;Ljava/util/Map;)V
      // 102: astore 31
      // 104: goto 3d9
      // 107: iload 32
      // 109: iload 30
      // 10b: lload 1
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: iflt 154
      // 111: ifne 152
      // 114: sipush 5006
      // 117: ldc2_w 589943369393951222
      // 11a: lload 1
      // 11b: lxor
      // 11c: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: goto 12e
      // 124: ldc2_w 5246313227209882671
      // 127: lload 1
      // 128: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: if_icmpne 150
      // 131: new com/zelix/hl
      // 134: dup
      // 135: iload 32
      // 137: aload 8
      // 139: lload 14
      // 13b: aload 5
      // 13d: aload 7
      // 13f: aload 3
      // 140: aload 9
      // 142: aload 6
      // 144: aload 10
      // 146: aload 4
      // 148: invokespecial com/zelix/hl.<init> (ILcom/zelix/h8;JLcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;Lcom/zelix/wp;Ljava/util/Map;Ljava/util/Map;)V
      // 14b: astore 31
      // 14d: goto 3d9
      // 150: iload 32
      // 152: iload 30
      // 154: lload 1
      // 155: lconst_0
      // 156: lcmp
      // 157: ifle 1c8
      // 15a: ifne 1c5
      // 15d: iflt 1c3
      // 160: goto 16d
      // 163: ldc2_w 5246313227209882671
      // 166: lload 1
      // 167: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: iload 32
      // 16f: sipush 25662
      // 172: ldc2_w 3699538304671360580
      // 175: lload 1
      // 176: lxor
      // 177: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: iload 30
      // 17e: lload 1
      // 17f: lconst_0
      // 180: lcmp
      // 181: iflt 1d4
      // 184: ifne 1d2
      // 187: goto 194
      // 18a: ldc2_w 5246313227209882671
      // 18d: lload 1
      // 18e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: if_icmpgt 1c3
      // 197: goto 1a4
      // 19a: ldc2_w 5246313227209882671
      // 19d: lload 1
      // 19e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: new com/zelix/h5
      // 1a7: dup
      // 1a8: iload 32
      // 1aa: aload 8
      // 1ac: aload 5
      // 1ae: aload 7
      // 1b0: aload 3
      // 1b1: lload 22
      // 1b3: aload 9
      // 1b5: aload 6
      // 1b7: aload 10
      // 1b9: aload 4
      // 1bb: invokespecial com/zelix/h5.<init> (ILcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;JLjava/io/PrintWriter;Lcom/zelix/wp;Ljava/util/Map;Ljava/util/Map;)V
      // 1be: astore 31
      // 1c0: goto 3d9
      // 1c3: iload 32
      // 1c5: sipush 13019
      // 1c8: ldc2_w 6278179245859041450
      // 1cb: lload 1
      // 1cc: lxor
      // 1cd: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: iload 30
      // 1d4: ifne 24c
      // 1d7: if_icmplt 23d
      // 1da: goto 1e7
      // 1dd: ldc2_w 5246313227209882671
      // 1e0: lload 1
      // 1e1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: athrow
      // 1e7: iload 32
      // 1e9: sipush 21398
      // 1ec: ldc2_w 6019712874157937128
      // 1ef: lload 1
      // 1f0: lxor
      // 1f1: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: iload 30
      // 1f8: lload 1
      // 1f9: lconst_0
      // 1fa: lcmp
      // 1fb: ifle 24e
      // 1fe: ifne 24c
      // 201: goto 20e
      // 204: ldc2_w 5246313227209882671
      // 207: lload 1
      // 208: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: if_icmpgt 23d
      // 211: goto 21e
      // 214: ldc2_w 5246313227209882671
      // 217: lload 1
      // 218: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: new com/zelix/ht
      // 221: dup
      // 222: lload 24
      // 224: iload 32
      // 226: aload 8
      // 228: aload 5
      // 22a: aload 7
      // 22c: aload 3
      // 22d: aload 9
      // 22f: aload 6
      // 231: aload 10
      // 233: aload 4
      // 235: invokespecial com/zelix/ht.<init> (JILcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;Lcom/zelix/wp;Ljava/util/Map;Ljava/util/Map;)V
      // 238: astore 31
      // 23a: goto 3d9
      // 23d: iload 32
      // 23f: sipush 16383
      // 242: ldc2_w 8315362875929558415
      // 245: lload 1
      // 246: lxor
      // 247: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: iload 30
      // 24e: lload 1
      // 24f: lconst_0
      // 250: lcmp
      // 251: iflt 297
      // 254: ifne 295
      // 257: if_icmpne 286
      // 25a: goto 267
      // 25d: ldc2_w 5246313227209882671
      // 260: lload 1
      // 261: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: athrow
      // 267: new com/zelix/hm
      // 26a: dup
      // 26b: iload 32
      // 26d: aload 8
      // 26f: aload 5
      // 271: aload 7
      // 273: aload 3
      // 274: aload 9
      // 276: aload 6
      // 278: aload 10
      // 27a: lload 26
      // 27c: aload 4
      // 27e: invokespecial com/zelix/hm.<init> (ILcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;Lcom/zelix/wp;Ljava/util/Map;JLjava/util/Map;)V
      // 281: astore 31
      // 283: goto 3d9
      // 286: iload 32
      // 288: sipush 31595
      // 28b: ldc2_w 1720448782661466391
      // 28e: lload 1
      // 28f: lxor
      // 290: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: iload 30
      // 297: ifne 30f
      // 29a: if_icmplt 300
      // 29d: goto 2aa
      // 2a0: ldc2_w 5246313227209882671
      // 2a3: lload 1
      // 2a4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: athrow
      // 2aa: iload 32
      // 2ac: sipush 29842
      // 2af: ldc2_w 3064488593389565686
      // 2b2: lload 1
      // 2b3: lxor
      // 2b4: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: iload 30
      // 2bb: lload 1
      // 2bc: lconst_0
      // 2bd: lcmp
      // 2be: iflt 311
      // 2c1: ifne 30f
      // 2c4: goto 2d1
      // 2c7: ldc2_w 5246313227209882671
      // 2ca: lload 1
      // 2cb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: athrow
      // 2d1: if_icmpgt 300
      // 2d4: goto 2e1
      // 2d7: ldc2_w 5246313227209882671
      // 2da: lload 1
      // 2db: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e0: athrow
      // 2e1: new com/zelix/h0
      // 2e4: dup
      // 2e5: iload 32
      // 2e7: lload 16
      // 2e9: aload 8
      // 2eb: aload 5
      // 2ed: aload 7
      // 2ef: aload 3
      // 2f0: aload 9
      // 2f2: aload 6
      // 2f4: aload 10
      // 2f6: aload 4
      // 2f8: invokespecial com/zelix/h0.<init> (IJLcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;Lcom/zelix/wp;Ljava/util/Map;Ljava/util/Map;)V
      // 2fb: astore 31
      // 2fd: goto 3d9
      // 300: iload 32
      // 302: sipush 11524
      // 305: ldc2_w 5413212070118158201
      // 308: lload 1
      // 309: lxor
      // 30a: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30f: iload 30
      // 311: ifne 37b
      // 314: if_icmplt 379
      // 317: goto 324
      // 31a: ldc2_w 5246313227209882671
      // 31d: lload 1
      // 31e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: athrow
      // 324: iload 32
      // 326: sipush 28634
      // 329: ldc2_w 186371175467560367
      // 32c: lload 1
      // 32d: lxor
      // 32e: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: iload 30
      // 335: ifne 37b
      // 338: goto 345
      // 33b: ldc2_w 5246313227209882671
      // 33e: lload 1
      // 33f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: athrow
      // 345: if_icmpgt 379
      // 348: goto 355
      // 34b: ldc2_w 5246313227209882671
      // 34e: lload 1
      // 34f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 354: athrow
      // 355: new com/zelix/hx
      // 358: dup
      // 359: iload 32
      // 35b: iload 11
      // 35d: aload 8
      // 35f: aload 5
      // 361: aload 7
      // 363: aload 3
      // 364: aload 9
      // 366: aload 6
      // 368: aload 10
      // 36a: iload 12
      // 36c: iload 13
      // 36e: i2c
      // 36f: aload 4
      // 371: invokespecial com/zelix/hx.<init> (IILcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;Lcom/zelix/wp;Ljava/util/Map;ICLjava/util/Map;)V
      // 374: astore 31
      // 376: goto 3d9
      // 379: bipush 0
      // 37a: bipush 1
      // 37b: anewarray 3
      // 37e: dup
      // 37f: bipush 0
      // 380: new java/lang/StringBuilder
      // 383: dup
      // 384: invokespecial java/lang/StringBuilder.<init> ()V
      // 387: sipush 6822
      // 38a: ldc2_w 2971526404464255405
      // 38d: lload 1
      // 38e: lxor
      // 38f: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/hq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 397: iload 32
      // 399: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 39c: sipush 25832
      // 39f: ldc2_w 2096677387436515297
      // 3a2: lload 1
      // 3a3: lxor
      // 3a4: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/hq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ac: aload 8
      // 3ae: lload 28
      // 3b0: bipush 1
      // 3b1: anewarray 238
      // 3b4: dup_x2
      // 3b5: dup_x2
      // 3b6: pop
      // 3b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ba: bipush 0
      // 3bb: swap
      // 3bc: aastore
      // 3bd: ldc2_w 5737220298018992901
      // 3c0: lload 1
      // 3c1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c9: ldc "'"
      // 3cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ce: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d1: aastore
      // 3d2: lload 18
      // 3d4: dup2_x2
      // 3d5: pop2
      // 3d6: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 3d9: aload 31
      // 3db: areturn
   }

   hq(h8 var1) {
      super(var1);
   }

   public final String d(Object[] var1) {
      long var2 = (Long)var1[0];
      return a<"q">(3328, 8408465447093428405L ^ var2);
   }

   static boolean S(ie[] param0, ie[] param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hq.d J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 94823444076579
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w -7639080885154503274
      // 12: lload 2
      // 13: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: istore 6
      // 1a: aload 0
      // 1b: arraylength
      // 1c: iload 6
      // 1e: ifeq 8c
      // 21: aload 1
      // 22: arraylength
      // 23: if_icmpne 8b
      // 26: goto 33
      // 29: ldc2_w -8487339297001636137
      // 2c: lload 2
      // 2d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: athrow
      // 33: bipush 0
      // 34: istore 7
      // 36: iload 7
      // 38: aload 0
      // 39: arraylength
      // 3a: if_icmpge 83
      // 3d: aload 0
      // 3e: iload 7
      // 40: aaload
      // 41: aload 1
      // 42: iload 7
      // 44: aaload
      // 45: lload 4
      // 47: dup2_x1
      // 48: pop2
      // 49: invokevirtual com/zelix/ie.b (JLcom/zelix/ie;)Z
      // 4c: iload 6
      // 4e: lload 2
      // 4f: lconst_0
      // 50: lcmp
      // 51: ifle 59
      // 54: ifeq 8a
      // 57: iload 6
      // 59: ifeq 7a
      // 5c: goto 69
      // 5f: ldc2_w -8487339297001636137
      // 62: lload 2
      // 63: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: ifne 7b
      // 6c: goto 79
      // 6f: ldc2_w -8487339297001636137
      // 72: lload 2
      // 73: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: bipush 0
      // 7a: ireturn
      // 7b: iinc 7 1
      // 7e: iload 6
      // 80: ifne 36
      // 83: lload 2
      // 84: lconst_0
      // 85: lcmp
      // 86: iflt 3d
      // 89: bipush 1
      // 8a: ireturn
      // 8b: bipush 0
      // 8c: ireturn
   }

   public final c M(Object[] param1) {
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
      // 00c: getstatic com/zelix/hq.d J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 4314605783854
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: ldc2_w -3049807802454972986
      // 01e: lload 2
      // 01f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: aload 0
      // 025: lload 4
      // 027: bipush 1
      // 028: anewarray 238
      // 02b: dup_x2
      // 02c: dup_x2
      // 02d: pop
      // 02e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 031: bipush 0
      // 032: swap
      // 033: aastore
      // 034: ldc2_w -3667235515877708971
      // 037: lload 2
      // 038: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: istore 7
      // 03f: istore 6
      // 041: iload 7
      // 043: iload 6
      // 045: ifeq 0a5
      // 048: iflt 0a3
      // 04b: goto 058
      // 04e: ldc2_w -3862251753313943929
      // 051: lload 2
      // 052: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: athrow
      // 058: iload 7
      // 05a: sipush 8792
      // 05d: ldc2_w 3803122055863034499
      // 060: lload 2
      // 061: lxor
      // 062: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: iload 6
      // 069: lload 2
      // 06a: lconst_0
      // 06b: lcmp
      // 06c: iflt 0b4
      // 06f: ifeq 0b2
      // 072: goto 07f
      // 075: ldc2_w -3862251753313943929
      // 078: lload 2
      // 079: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: if_icmpgt 0a3
      // 082: goto 08f
      // 085: ldc2_w -3862251753313943929
      // 088: lload 2
      // 089: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: ldc2_w -3221948089434582327
      // 092: lload 2
      // 093: invokedynamic l (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: areturn
      // 099: ldc2_w -3862251753313943929
      // 09c: lload 2
      // 09d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: iload 7
      // 0a5: sipush 1845
      // 0a8: ldc2_w 4395872998230378475
      // 0ab: lload 2
      // 0ac: lxor
      // 0ad: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: iload 6
      // 0b4: ifeq 127
      // 0b7: if_icmplt 118
      // 0ba: goto 0c7
      // 0bd: ldc2_w -3862251753313943929
      // 0c0: lload 2
      // 0c1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: iload 7
      // 0c9: sipush 30512
      // 0cc: ldc2_w 804321949389273063
      // 0cf: lload 2
      // 0d0: lxor
      // 0d1: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: iload 6
      // 0d8: lload 2
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: iflt 129
      // 0de: ifeq 127
      // 0e1: goto 0ee
      // 0e4: ldc2_w -3862251753313943929
      // 0e7: lload 2
      // 0e8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: lload 2
      // 0ef: lconst_0
      // 0f0: lcmp
      // 0f1: ifle 11d
      // 0f4: if_icmpgt 118
      // 0f7: goto 104
      // 0fa: ldc2_w -3862251753313943929
      // 0fd: lload 2
      // 0fe: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: ldc2_w -3083987652114277996
      // 107: lload 2
      // 108: invokedynamic l (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: areturn
      // 10e: ldc2_w -3862251753313943929
      // 111: lload 2
      // 112: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: iload 7
      // 11a: sipush 4610
      // 11d: ldc2_w 4558505060964881107
      // 120: lload 2
      // 121: lxor
      // 122: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: iload 6
      // 129: lload 2
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: ifle 167
      // 12f: ifeq 165
      // 132: if_icmpne 156
      // 135: goto 142
      // 138: ldc2_w -3862251753313943929
      // 13b: lload 2
      // 13c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: ldc2_w -3094969243443676130
      // 145: lload 2
      // 146: invokedynamic l (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: areturn
      // 14c: ldc2_w -3862251753313943929
      // 14f: lload 2
      // 150: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: iload 7
      // 158: sipush 25278
      // 15b: ldc2_w 8551449723808522865
      // 15e: lload 2
      // 15f: lxor
      // 160: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: iload 6
      // 167: ifeq 1da
      // 16a: if_icmplt 1cb
      // 16d: goto 17a
      // 170: ldc2_w -3862251753313943929
      // 173: lload 2
      // 174: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: iload 7
      // 17c: sipush 14786
      // 17f: ldc2_w 564859219066943761
      // 182: lload 2
      // 183: lxor
      // 184: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: iload 6
      // 18b: lload 2
      // 18c: lconst_0
      // 18d: lcmp
      // 18e: iflt 1dc
      // 191: ifeq 1da
      // 194: goto 1a1
      // 197: ldc2_w -3862251753313943929
      // 19a: lload 2
      // 19b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: lload 2
      // 1a2: lconst_0
      // 1a3: lcmp
      // 1a4: iflt 1d0
      // 1a7: if_icmpgt 1cb
      // 1aa: goto 1b7
      // 1ad: ldc2_w -3862251753313943929
      // 1b0: lload 2
      // 1b1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: ldc2_w -3164717969938977001
      // 1ba: lload 2
      // 1bb: invokedynamic l (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: areturn
      // 1c1: ldc2_w -3862251753313943929
      // 1c4: lload 2
      // 1c5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: iload 7
      // 1cd: sipush 733
      // 1d0: ldc2_w 5956298661827658259
      // 1d3: lload 2
      // 1d4: lxor
      // 1d5: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: iload 6
      // 1dc: lload 2
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: ifle 21a
      // 1e2: ifeq 218
      // 1e5: if_icmpne 209
      // 1e8: goto 1f5
      // 1eb: ldc2_w -3862251753313943929
      // 1ee: lload 2
      // 1ef: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: ldc2_w -3104305633463910686
      // 1f8: lload 2
      // 1f9: invokedynamic l (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: areturn
      // 1ff: ldc2_w -3862251753313943929
      // 202: lload 2
      // 203: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: iload 7
      // 20b: sipush 8544
      // 20e: ldc2_w 5717417289690079674
      // 211: lload 2
      // 212: lxor
      // 213: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: iload 6
      // 21a: ifeq 28d
      // 21d: if_icmplt 27e
      // 220: goto 22d
      // 223: ldc2_w -3862251753313943929
      // 226: lload 2
      // 227: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: athrow
      // 22d: iload 7
      // 22f: sipush 3855
      // 232: ldc2_w 2848378068978520002
      // 235: lload 2
      // 236: lxor
      // 237: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: lload 2
      // 23d: lconst_0
      // 23e: lcmp
      // 23f: iflt 28d
      // 242: iload 6
      // 244: ifeq 28d
      // 247: goto 254
      // 24a: ldc2_w -3862251753313943929
      // 24d: lload 2
      // 24e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: athrow
      // 254: lload 2
      // 255: lconst_0
      // 256: lcmp
      // 257: iflt 283
      // 25a: if_icmpgt 27e
      // 25d: goto 26a
      // 260: ldc2_w -3862251753313943929
      // 263: lload 2
      // 264: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: ldc2_w -2989288828663078815
      // 26d: lload 2
      // 26e: invokedynamic l (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: areturn
      // 274: ldc2_w -3862251753313943929
      // 277: lload 2
      // 278: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: athrow
      // 27e: iload 7
      // 280: sipush 9581
      // 283: ldc2_w 205016009400116657
      // 286: lload 2
      // 287: lxor
      // 288: invokedynamic c (IJ)I bsm=com/zelix/hq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: if_icmpne 2a4
      // 290: ldc2_w -3293639043267298722
      // 293: lload 2
      // 294: invokedynamic l (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: areturn
      // 29a: ldc2_w -3862251753313943929
      // 29d: lload 2
      // 29e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: athrow
      // 2a4: aconst_null
      // 2a5: areturn
   }

   protected final void Q(Object[] var1) {
      DataOutputStream var5 = (DataOutputStream)var1[0];
      long var2 = (Long)var1[1];
      wp var4 = (wp)var1[2];
      var2 = d ^ var2;
      long var6 = var2 ^ 118975519101815L;
      this.W(var5, var4, null, var6);
   }

   static {
      long var11 = d ^ 74952929962462L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "è\u0006Û\u001cu\u0011ºùOO^É¿\u000bô(Þ\u0093\u0016Cy\u008e\u0007S/óí\u001d>£ëÒ¿\u0019ïàKæ®\b7ë7H3´ÌNfðtÙ)¤Wþâä\u0092\u0081SZ\u009do3 pÎkR\u001c\u0091 #a\u0097ÀÍ\u00027ý\u0096\f\b\u0016\u000fÄYàÕ<¶i196\u0002ÄknP\bñ\u0017?\u0010Ô\u001cHgKCªoå÷FÕD\u0093ü&";
      int var19 = "è\u0006Û\u001cu\u0011ºùOO^É¿\u000bô(Þ\u0093\u0016Cy\u008e\u0007S/óí\u001d>£ëÒ¿\u0019ïàKæ®\b7ë7H3´ÌNfðtÙ)¤Wþâä\u0092\u0081SZ\u009do3 pÎkR\u001c\u0091 #a\u0097ÀÍ\u00027ý\u0096\f\b\u0016\u000fÄYàÕ<¶i196\u0002ÄknP\bñ\u0017?\u0010Ô\u001cHgKCªoå÷FÕD\u0093ü&"
         .length();
      char var16 = 'H';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var30 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var30;
         if ((var15 += var16) >= var19) {
            f = var20;
            g = new String[3];
            m = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[20];
            int var3 = 0;
            String var4 = ",rËÏPç8\u0097ë§\u008d.\u008b[±-\u0085\u001a\u0014-\u008f \u0089Ý\u00120\u0097Ö\u0097ìá3{Ä¿ÙCªj\u0087D\"ü¯lB©\u0084¡!g;JAM#\u0017G)¹a$wd\u00adÆ¨\u0093^¸\u0001Ý\u0081!\u0015óò\u0090\u0018\u008a\u009fs[pýb\u001aG\u0012·Ñ\u00ad/üØ\u008eçz\u008eÏSR\u009a\u00ad 4\\O\u0093&1´VÐa.ö\u0007{hÄ\u007f¾\u0082ßh\u001fi\u0015`²&Äg?Z¦ÏB\u0010õ\u0016Ôf";
            int var5 = ",rËÏPç8\u0097ë§\u008d.\u008b[±-\u0085\u001a\u0014-\u008f \u0089Ý\u00120\u0097Ö\u0097ìá3{Ä¿ÙCªj\u0087D\"ü¯lB©\u0084¡!g;JAM#\u0017G)¹a$wd\u00adÆ¨\u0093^¸\u0001Ý\u0081!\u0015óò\u0090\u0018\u008a\u009fs[pýb\u001aG\u0012·Ñ\u00ad/üØ\u008eçz\u008eÏSR\u009a\u00ad 4\\O\u0093&1´VÐa.ö\u0007{hÄ\u007f¾\u0082ßh\u001fi\u0015`²&Äg?Z¦ÏB\u0010õ\u0016Ôf"
               .length();
            byte var2 = 0;

            label32:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var25 = var6;
               var10001 = var3++;
               long var33 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var36 = -1;

               while (true) {
                  long var8 = var33;
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
                  long var38 = ((long)var10[0] & 255L) << 56
                     | ((long)var10[1] & 255L) << 48
                     | ((long)var10[2] & 255L) << 40
                     | ((long)var10[3] & 255L) << 32
                     | ((long)var10[4] & 255L) << 24
                     | ((long)var10[5] & 255L) << 16
                     | ((long)var10[6] & 255L) << 8
                     | (long)var10[7] & 255L;
                  switch (var36) {
                     case 0:
                        var25[var10001] = var38;
                        if (var2 >= var5) {
                           j = var6;
                           k = new Integer[20];
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "\u0019·»{é F)\u0092}`.R;\u008e¤";
                        var5 = "\u0019·»{é F)\u0092}`.R;\u008e¤".length();
                        var2 = 0;
                  }

                  byte var29 = var2;
                  var2 += 8;
                  var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                  var25 = var6;
                  var10001 = var3++;
                  var33 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var36 = 0;
               }
            }
         }

         var16 = var17.charAt(var15);
      }
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24749;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/hq", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("com/zelix/hq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6608;
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/hq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("com/zelix/hq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
