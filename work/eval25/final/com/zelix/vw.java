package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vw implements _fp {
   final yg N;
   private ax I;
   private Map C;
   private List o;
   private static final long a = ess.a(7075912956933323904L, 634951079343826517L, MethodHandles.lookup().lookupClass()).a(86177709876774L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   List r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -5773090391756583575L, var2);
   }

   HashSet P(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 50388259526118L;
      return (HashSet)x44.a<"n">(this, 9098078077044258258L, var2).get(yg.v.R(var4, var5));
   }

   vw(long var1, yg var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 40406664398566L;
      long var10001 = var1 ^ 83280878798415L;
      int var6 = (int)((var1 ^ 83280878798415L) >>> 48);
      int var7 = (int)((var1 ^ 83280878798415L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      this.N = var3;
      super();
      x44.a<"u">(this, x44.a<"v">(new Object[]{var4}, -8423268254060352139L, var1), -8158611636360641194L, var1);
      x44.a<"u">(this, new ArrayList(), -8069914443540335991L, var1);
      x44.a<"u">(
         this,
         new ax(5, b<"j">(7084, 7078594276383271017L ^ var1), (char)var6, b<"j">(24254, 5279577836483603832L ^ var1), (short)var7, var8),
         -8552337859105646780L,
         var1
      );
   }

   public void V(Object[] var1) {
      int var6 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      long var4 = (Long)var1[3];
      long var7 = var4 ^ 135608624729818L;
      long var9 = var4 ^ 14227357576887L;
      x44.a<"j">(this, -2091995975782728452L, var4).b(var9, yg.v.R(var6, var7), yg.v.R(var2, var7), yg.v.R(var3, var7));
   }

   public _fp T(Object[] var1) {
      long var3 = (Long)var1[0];
      yg var2 = (yg)var1[1];
      long var5 = var3 ^ 132783622134454L;
      return x44.a<"l">(var2, new Object[]{var5}, 6717367103852522450L, var3);
   }

   public boolean r(Object[] param1) {
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
      // 004: checkcast com/zelix/r
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
      // 017: checkcast com/zelix/dm
      // 01a: astore 5
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast java/lang/Long
      // 022: invokevirtual java/lang/Long.longValue ()J
      // 025: lstore 2
      // 026: pop
      // 027: lload 2
      // 028: dup2
      // 029: ldc2_w 104773229075938
      // 02c: lxor
      // 02d: lstore 7
      // 02f: dup2
      // 030: ldc2_w 71842052205933
      // 033: lxor
      // 034: lstore 9
      // 036: dup2
      // 037: ldc2_w 123153733768237
      // 03a: lxor
      // 03b: lstore 11
      // 03d: dup2
      // 03e: ldc2_w 126365828538983
      // 041: lxor
      // 042: lstore 13
      // 044: dup2
      // 045: ldc2_w 26457193990300
      // 048: lxor
      // 049: lstore 15
      // 04b: dup2
      // 04c: ldc2_w 118655750221160
      // 04f: lxor
      // 050: lstore 17
      // 052: pop2
      // 053: ldc2_w -2259992554465886528
      // 056: lload 2
      // 057: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: aload 0
      // 05d: ldc2_w -2215204490087053412
      // 060: lload 2
      // 061: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/yg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: bipush 1
      // 067: anewarray 403
      // 06a: dup_x1
      // 06b: swap
      // 06c: bipush 0
      // 06d: swap
      // 06e: aastore
      // 06f: ldc2_w -2287779662922736864
      // 072: lload 2
      // 073: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/_ov; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: iload 4
      // 07a: invokevirtual com/zelix/_ov.get (I)Ljava/lang/Object;
      // 07d: checkcast com/zelix/_og
      // 080: astore 20
      // 082: istore 19
      // 084: aload 20
      // 086: invokevirtual com/zelix/_og.l ()I
      // 089: iload 19
      // 08b: ifeq 4a0
      // 08e: sipush 17752
      // 091: ldc2_w 5297463798194249215
      // 094: lload 2
      // 095: lxor
      // 096: invokedynamic j (IJ)I bsm=com/zelix/vw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: if_icmpne 49f
      // 09e: goto 0ab
      // 0a1: ldc2_w -2054227010151016104
      // 0a4: lload 2
      // 0a5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: ldc2_w -2215204490087053412
      // 0af: lload 2
      // 0b0: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/yg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: bipush 1
      // 0b6: anewarray 403
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: bipush 0
      // 0bc: swap
      // 0bd: aastore
      // 0be: ldc2_w -1730305328665155541
      // 0c1: lload 2
      // 0c2: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/_kz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: iload 4
      // 0c9: aaload
      // 0ca: astore 21
      // 0cc: new java/util/ArrayList
      // 0cf: dup
      // 0d0: invokespecial java/util/ArrayList.<init> ()V
      // 0d3: astore 22
      // 0d5: aload 0
      // 0d6: ldc2_w -2215204490087053412
      // 0d9: lload 2
      // 0da: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/yg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: lload 9
      // 0e1: dup2_x1
      // 0e2: pop2
      // 0e3: aload 22
      // 0e5: aload 5
      // 0e7: iload 4
      // 0e9: aload 21
      // 0eb: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 0ee: arraylength
      // 0ef: bipush 1
      // 0f0: iadd
      // 0f1: lload 13
      // 0f3: bipush 1
      // 0f4: anewarray 403
      // 0f7: dup_x2
      // 0f8: dup_x2
      // 0f9: pop
      // 0fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fd: bipush 0
      // 0fe: swap
      // 0ff: aastore
      // 100: ldc2_w -2133669192978240593
      // 103: lload 2
      // 104: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: bipush 7
      // 10b: anewarray 403
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 6
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 119: bipush 5
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x1
      // 11d: swap
      // 11e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 121: bipush 4
      // 122: swap
      // 123: aastore
      // 124: dup_x1
      // 125: swap
      // 126: bipush 3
      // 127: swap
      // 128: aastore
      // 129: dup_x1
      // 12a: swap
      // 12b: bipush 2
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 1
      // 131: swap
      // 132: aastore
      // 133: dup_x2
      // 134: dup_x2
      // 135: pop
      // 136: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 139: bipush 0
      // 13a: swap
      // 13b: aastore
      // 13c: ldc2_w -1765017187790923276
      // 13f: lload 2
      // 140: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: aload 21
      // 147: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 14a: arraylength
      // 14b: bipush 2
      // 14c: iadd
      // 14d: istore 23
      // 14f: lload 15
      // 151: sipush 26376
      // 154: ldc2_w 3111380197799739308
      // 157: lload 2
      // 158: lxor
      // 159: invokedynamic j (IJ)I bsm=com/zelix/vw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: bipush 2
      // 15f: anewarray 403
      // 162: dup_x1
      // 163: swap
      // 164: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 167: bipush 1
      // 168: swap
      // 169: aastore
      // 16a: dup_x2
      // 16b: dup_x2
      // 16c: pop
      // 16d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 170: bipush 0
      // 171: swap
      // 172: aastore
      // 173: ldc2_w -400439284636484763
      // 176: lload 2
      // 177: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: astore 24
      // 17e: new com/zelix/r
      // 181: dup
      // 182: aload 0
      // 183: ldc2_w -2215204490087053412
      // 186: lload 2
      // 187: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/yg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: lload 11
      // 18e: dup2_x1
      // 18f: pop2
      // 190: aload 6
      // 192: ldc2_w -331487401238059728
      // 195: lload 2
      // 196: invokedynamic o (JJ)Lcom/zelix/q8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: bipush 0
      // 19c: invokespecial com/zelix/r.<init> (JLcom/zelix/yg;Lcom/zelix/r;Lcom/zelix/q8;I)V
      // 19f: astore 25
      // 1a1: aload 25
      // 1a3: aload 24
      // 1a5: lload 7
      // 1a7: bipush 2
      // 1a8: anewarray 403
      // 1ab: dup_x2
      // 1ac: dup_x2
      // 1ad: pop
      // 1ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b1: bipush 1
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x1
      // 1b5: swap
      // 1b6: bipush 0
      // 1b7: swap
      // 1b8: aastore
      // 1b9: ldc2_w -2122246427737546651
      // 1bc: lload 2
      // 1bd: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: pop
      // 1c3: iload 19
      // 1c5: lload 2
      // 1c6: lconst_0
      // 1c7: lcmp
      // 1c8: iflt 238
      // 1cb: ifeq 236
      // 1ce: iload 4
      // 1d0: aload 5
      // 1d2: invokevirtual com/zelix/dm.l ()I
      // 1d5: if_icmple 23b
      // 1d8: goto 1e5
      // 1db: ldc2_w -2054227010151016104
      // 1de: lload 2
      // 1df: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: ldc2_w -2215204490087053412
      // 1e9: lload 2
      // 1ea: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/yg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: aload 25
      // 1f1: aload 5
      // 1f3: iload 4
      // 1f5: iload 23
      // 1f7: lload 17
      // 1f9: bipush 5
      // 1fa: anewarray 403
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 4
      // 204: swap
      // 205: aastore
      // 206: dup_x1
      // 207: swap
      // 208: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20b: bipush 3
      // 20c: swap
      // 20d: aastore
      // 20e: dup_x1
      // 20f: swap
      // 210: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 213: bipush 2
      // 214: swap
      // 215: aastore
      // 216: dup_x1
      // 217: swap
      // 218: bipush 1
      // 219: swap
      // 21a: aastore
      // 21b: dup_x1
      // 21c: swap
      // 21d: bipush 0
      // 21e: swap
      // 21f: aastore
      // 220: ldc2_w -2005722436146421367
      // 223: lload 2
      // 224: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: goto 236
      // 22c: ldc2_w -2054227010151016104
      // 22f: lload 2
      // 230: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: iload 19
      // 238: ifne 2b0
      // 23b: aload 5
      // 23d: invokevirtual com/zelix/dm.K ()Ljava/util/List;
      // 240: astore 26
      // 242: bipush 0
      // 243: istore 27
      // 245: iload 27
      // 247: aload 26
      // 249: invokeinterface java/util/List.size ()I 1
      // 24e: if_icmpge 2b0
      // 251: aload 26
      // 253: iload 27
      // 255: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 25a: checkcast com/zelix/dm
      // 25d: astore 28
      // 25f: aload 0
      // 260: ldc2_w -2215204490087053412
      // 263: lload 2
      // 264: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/yg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: aload 25
      // 26b: aload 28
      // 26d: aload 28
      // 26f: invokevirtual com/zelix/dm.C ()I
      // 272: bipush 1
      // 273: iadd
      // 274: iload 23
      // 276: lload 17
      // 278: bipush 5
      // 279: anewarray 403
      // 27c: dup_x2
      // 27d: dup_x2
      // 27e: pop
      // 27f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 282: bipush 4
      // 283: swap
      // 284: aastore
      // 285: dup_x1
      // 286: swap
      // 287: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 28a: bipush 3
      // 28b: swap
      // 28c: aastore
      // 28d: dup_x1
      // 28e: swap
      // 28f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 292: bipush 2
      // 293: swap
      // 294: aastore
      // 295: dup_x1
      // 296: swap
      // 297: bipush 1
      // 298: swap
      // 299: aastore
      // 29a: dup_x1
      // 29b: swap
      // 29c: bipush 0
      // 29d: swap
      // 29e: aastore
      // 29f: ldc2_w -2005722436146421367
      // 2a2: lload 2
      // 2a3: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: iinc 27 1
      // 2ab: iload 19
      // 2ad: ifne 245
      // 2b0: aconst_null
      // 2b1: astore 26
      // 2b3: bipush 0
      // 2b4: istore 27
      // 2b6: iload 27
      // 2b8: aload 22
      // 2ba: invokevirtual java/util/ArrayList.size ()I
      // 2bd: if_icmpge 42a
      // 2c0: aload 22
      // 2c2: iload 27
      // 2c4: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 2c7: astore 28
      // 2c9: aload 28
      // 2cb: instanceof java/lang/Integer
      // 2ce: iload 19
      // 2d0: lload 2
      // 2d1: lconst_0
      // 2d2: lcmp
      // 2d3: ifle 2db
      // 2d6: ifeq 49c
      // 2d9: iload 19
      // 2db: ifeq 403
      // 2de: goto 2eb
      // 2e1: ldc2_w -2054227010151016104
      // 2e4: lload 2
      // 2e5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: athrow
      // 2eb: lload 2
      // 2ec: lconst_0
      // 2ed: lcmp
      // 2ee: ifle 3f6
      // 2f1: ifeq 3c8
      // 2f4: goto 301
      // 2f7: ldc2_w -2054227010151016104
      // 2fa: lload 2
      // 2fb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 300: athrow
      // 301: aload 26
      // 303: lload 2
      // 304: lconst_0
      // 305: lcmp
      // 306: iflt 34c
      // 309: iload 19
      // 30b: ifeq 34c
      // 30e: goto 31b
      // 311: ldc2_w -2054227010151016104
      // 314: lload 2
      // 315: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: athrow
      // 31b: ifnonnull 33d
      // 31e: goto 32b
      // 321: ldc2_w -2054227010151016104
      // 324: lload 2
      // 325: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: athrow
      // 32b: aload 28
      // 32d: checkcast java/lang/Integer
      // 330: astore 26
      // 332: iload 19
      // 334: lload 2
      // 335: lconst_0
      // 336: lcmp
      // 337: ifle 414
      // 33a: ifne 40f
      // 33d: aload 28
      // 33f: goto 34c
      // 342: ldc2_w -2054227010151016104
      // 345: lload 2
      // 346: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: athrow
      // 34c: aload 26
      // 34e: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 351: lload 2
      // 352: lconst_0
      // 353: lcmp
      // 354: iflt 3c5
      // 357: iload 19
      // 359: ifeq 3bc
      // 35c: ifne 40f
      // 35f: goto 36c
      // 362: ldc2_w -2054227010151016104
      // 365: lload 2
      // 366: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36b: athrow
      // 36c: aload 0
      // 36d: ldc2_w -332809017110062615
      // 370: lload 2
      // 371: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: new java/lang/StringBuilder
      // 379: dup
      // 37a: invokespecial java/lang/StringBuilder.<init> ()V
      // 37d: sipush 26960
      // 380: ldc2_w 8296584612589835762
      // 383: lload 2
      // 384: lxor
      // 385: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/vw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38d: aload 26
      // 38f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 392: sipush 27776
      // 395: ldc2_w 1682372708603858977
      // 398: lload 2
      // 399: lxor
      // 39a: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/vw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a2: aload 28
      // 3a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3aa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3af: goto 3bc
      // 3b2: ldc2_w -2054227010151016104
      // 3b5: lload 2
      // 3b6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bb: athrow
      // 3bc: pop
      // 3bd: lload 2
      // 3be: lconst_0
      // 3bf: lcmp
      // 3c0: iflt 42a
      // 3c3: iload 19
      // 3c5: ifne 42a
      // 3c8: aload 0
      // 3c9: ldc2_w -332809017110062615
      // 3cc: lload 2
      // 3cd: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d2: new java/lang/StringBuilder
      // 3d5: dup
      // 3d6: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d9: sipush 13143
      // 3dc: ldc2_w 8039466097558671348
      // 3df: lload 2
      // 3e0: lxor
      // 3e1: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/vw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e9: aload 28
      // 3eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3f1: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3f6: goto 403
      // 3f9: ldc2_w -2054227010151016104
      // 3fc: lload 2
      // 3fd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: athrow
      // 403: pop
      // 404: lload 2
      // 405: lconst_0
      // 406: lcmp
      // 407: ifle 42a
      // 40a: iload 19
      // 40c: ifne 42a
      // 40f: iinc 27 1
      // 412: iload 19
      // 414: ifne 2b6
      // 417: lload 2
      // 418: lconst_0
      // 419: lcmp
      // 41a: iflt 2c9
      // 41d: goto 42a
      // 420: ldc2_w -2054227010151016104
      // 423: lload 2
      // 424: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 429: athrow
      // 42a: aload 26
      // 42c: lload 2
      // 42d: lconst_0
      // 42e: lcmp
      // 42f: iflt 467
      // 432: iload 19
      // 434: ifeq 467
      // 437: ifnull 473
      // 43a: goto 447
      // 43d: ldc2_w -2054227010151016104
      // 440: lload 2
      // 441: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 446: athrow
      // 447: aload 0
      // 448: ldc2_w -1898634931467489738
      // 44b: lload 2
      // 44c: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 451: aload 26
      // 453: aload 24
      // 455: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 45a: goto 467
      // 45d: ldc2_w -2054227010151016104
      // 460: lload 2
      // 461: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 466: athrow
      // 467: pop
      // 468: iload 19
      // 46a: lload 2
      // 46b: lconst_0
      // 46c: lcmp
      // 46d: ifle 49e
      // 470: ifne 49d
      // 473: aload 0
      // 474: ldc2_w -332809017110062615
      // 477: lload 2
      // 478: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47d: sipush 32610
      // 480: ldc2_w 312761322541548482
      // 483: lload 2
      // 484: lxor
      // 485: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/vw.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 48f: goto 49c
      // 492: ldc2_w -2054227010151016104
      // 495: lload 2
      // 496: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49b: athrow
      // 49c: pop
      // 49d: bipush 1
      // 49e: ireturn
      // 49f: bipush 0
      // 4a0: ireturn
   }

   public boolean t(Object[] var1) {
      long var5 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      int var3 = (Integer)var1[3];
      long var7 = var5 ^ 111905831427783L;
      long var9 = var5 ^ 71942181610897L;
      return x44.a<"k">(
         x44.a<"o">(this, -5554448877804901151L, var5),
         new Object[]{yg.v.R(var2, var7), yg.v.R(var4, var7), var9, yg.v.R(var3, var7)},
         -5724660625544819206L,
         var5
      );
   }

   static {
      long var11 = a ^ 138798962539174L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[4];
      int var18 = 0;
      String var17 = "Äº[?\u0003Qè\u000e8jÆ[\u009c\u0012ùWk\\ÐÐ\u009a³HÁ\u00176Ý\u0087qc\u0083Brà\u009c\u008cO\u0019Øò?\u008d\t\u001bÓ\u0014\t\"\u0017ðbGØÆ$\u009aWìÞ\u008fáÌª\u0010\u0092%Ì\u0098ì\u008eIJ\u008c×\u0015'O¼&c\\\u008bå\\\u0002?\f%Pj\u0089â\u008fôùLJ¿\u0096@ó\u0084¸9\"\u008f#I6K(´\u0094üÖ©ß\u0099¹=\u0016³\u0087Ò\u001bïÕ\u0007\u0098v¿\u009d\u0087/`\u001fc\u0080G\u009a¼RT\u0089UÍ\u0089J¢jW¸\u001a±2ÚEPã\u0010\tp\u008c\u000eBî*ö\u00ad";
      int var19 = "Äº[?\u0003Qè\u000e8jÆ[\u009c\u0012ùWk\\ÐÐ\u009a³HÁ\u00176Ý\u0087qc\u0083Brà\u009c\u008cO\u0019Øò?\u008d\t\u001bÓ\u0014\t\"\u0017ðbGØÆ$\u009aWìÞ\u008fáÌª\u0010\u0092%Ì\u0098ì\u008eIJ\u008c×\u0015'O¼&c\\\u008bå\\\u0002?\f%Pj\u0089â\u008fôùLJ¿\u0096@ó\u0084¸9\"\u008f#I6K(´\u0094üÖ©ß\u0099¹=\u0016³\u0087Ò\u001bïÕ\u0007\u0098v¿\u009d\u0087/`\u001fc\u0080G\u009a¼RT\u0089UÍ\u0089J¢jW¸\u001a±2ÚEPã\u0010\tp\u008c\u000eBî*ö\u00ad"
         .length();
      char var16 = 'X';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[4];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "âg\u0081\u008aWÇÞ2\u000053\u0096ô\fÞ:";
                     int var5 = "âg\u0081\u008aWÇÞ2\u000053\u0096ô\fÞ:".length();
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
                                    e = var6;
                                    f = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Â/NQÎ\u009aÄ\u009e_É\bÑ\u009cbfh";
                                 var5 = "Â/NQÎ\u009aÄ\u009e_É\bÑ\u009cbfh".length();
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

                  var17 = "\u001bK\u0083\u0099S\u001d¨(ß\u00adÆµ\u0088Q\u001a®HEö¾|ê\u007f¿´A\u008f\n¬\u009cÓÉ6ßA^ÊË ôø²aápÇ}2ÿé\u001a\u0082\u0015\u0089æ\u009eû@bHy\u007f\u008b=#UÏéÊ±\"×.ìd\u001b\u0000ß'\u000e\u0088ä\u00124çéïSr";
                  var19 = "\u001bK\u0083\u0099S\u001d¨(ß\u00adÆµ\u0088Q\u001a®HEö¾|ê\u007f¿´A\u008f\n¬\u009cÓÉ6ßA^ÊË ôø²aápÇ}2ÿé\u001a\u0082\u0015\u0089æ\u009eû@bHy\u007f\u008b=#UÏéÊ±\"×.ìd\u001b\u0000ß'\u000e\u0088ä\u00124çéïSr"
                     .length();
                  var16 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4822;
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
            throw new RuntimeException("com/zelix/vw", var10);
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
         throw new RuntimeException("com/zelix/vw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14033;
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
            throw new RuntimeException("com/zelix/vw", var14);
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
         throw new RuntimeException("com/zelix/vw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
