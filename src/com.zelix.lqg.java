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

public class lqg implements f9 {
   private Map I;
   final l e;
   private fr r;
   private List T;
   private static final long a = prr.a(4978791708528403578L, -7784352343187736490L, MethodHandles.lookup().lookupClass()).a(238717959194554L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public boolean a(Object[] var1) {
      int var5 = (Integer)var1[0];
      int var6 = (Integer)var1[1];
      long var3 = (Long)var1[2];
      int var2 = (Integer)var1[3];
      long var7 = var3 ^ 130376507052002L;
      long var9 = var3 ^ 26835698277075L;
      return m44.a<"w">(
         m44.a<"v">(this, -1378269323550186611L, var3),
         new Object[]{var9, l.k.e(var7, var5), l.k.e(var7, var6), l.k.e(var7, var2)},
         -1445747650631850568L,
         var3
      );
   }

   List v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"u">(this, 5683565656720742713L, var2);
   }

   public void O(Object[] var1) {
      int var5 = (Integer)var1[0];
      int var6 = (Integer)var1[1];
      long var3 = (Long)var1[2];
      int var2 = (Integer)var1[3];
      long var7 = var3 ^ 16025080045313L;
      long var9 = var3 ^ 84496389240885L;
      m44.a<"u">(this, 4340378615518524270L, var3).T(var9, l.k.e(var7, var5), l.k.e(var7, var6), l.k.e(var7, var2));
   }

   HashSet n(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 84300298952433L;
      return (HashSet)m44.a<"u">(this, -6895163876845674094L, var2).get(l.k.e(var5, var4));
   }

   public boolean B(Object[] param1) {
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
      // 004: checkcast com/zelix/lmp
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 3
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/nc
      // 024: astore 2
      // 025: pop
      // 026: lload 3
      // 027: dup2
      // 028: ldc2_w 39713474135099
      // 02b: lxor
      // 02c: lstore 7
      // 02e: dup2
      // 02f: ldc2_w 36272661380740
      // 032: lxor
      // 033: lstore 9
      // 035: dup2
      // 036: ldc2_w 131435606469863
      // 039: lxor
      // 03a: lstore 11
      // 03c: dup2
      // 03d: ldc2_w 99373192795513
      // 040: lxor
      // 041: lstore 13
      // 043: dup2
      // 044: ldc2_w 113679245652322
      // 047: lxor
      // 048: lstore 15
      // 04a: dup2
      // 04b: ldc2_w 47642756045007
      // 04e: lxor
      // 04f: lstore 17
      // 051: pop2
      // 052: ldc2_w 1171419987485582481
      // 055: lload 3
      // 056: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aload 0
      // 05c: ldc2_w 612473028471268901
      // 05f: lload 3
      // 060: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: bipush 1
      // 066: anewarray 293
      // 069: dup_x1
      // 06a: swap
      // 06b: bipush 0
      // 06c: swap
      // 06d: aastore
      // 06e: ldc2_w 1631346268632383953
      // 071: lload 3
      // 072: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/e; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: iload 5
      // 079: invokevirtual com/zelix/e.get (I)Ljava/lang/Object;
      // 07c: checkcast com/zelix/oz
      // 07f: astore 20
      // 081: astore 19
      // 083: aload 20
      // 085: invokevirtual com/zelix/oz.q ()I
      // 088: aload 19
      // 08a: ifnonnull 493
      // 08d: sipush 5963
      // 090: ldc2_w 2214109667972681285
      // 093: lload 3
      // 094: lxor
      // 095: invokedynamic o (IJ)I bsm=com/zelix/lqg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: if_icmpne 492
      // 09d: goto 0aa
      // 0a0: ldc2_w 1661271362508665349
      // 0a3: lload 3
      // 0a4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: ldc2_w 612473028471268901
      // 0ae: lload 3
      // 0af: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: bipush 1
      // 0b5: anewarray 293
      // 0b8: dup_x1
      // 0b9: swap
      // 0ba: bipush 0
      // 0bb: swap
      // 0bc: aastore
      // 0bd: ldc2_w 1559583658153285406
      // 0c0: lload 3
      // 0c1: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: iload 5
      // 0c8: aaload
      // 0c9: astore 21
      // 0cb: sipush 20204
      // 0ce: new java/util/ArrayList
      // 0d1: dup
      // 0d2: invokespecial java/util/ArrayList.<init> ()V
      // 0d5: astore 22
      // 0d7: ldc2_w 2417064008401115105
      // 0da: lload 3
      // 0db: lxor
      // 0dc: aload 0
      // 0dd: ldc2_w 612473028471268901
      // 0e0: lload 3
      // 0e1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: aload 22
      // 0e8: lload 15
      // 0ea: aload 2
      // 0eb: iload 5
      // 0ed: aload 21
      // 0ef: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 0f2: arraylength
      // 0f3: bipush 1
      // 0f4: iadd
      // 0f5: lload 9
      // 0f7: bipush 1
      // 0f8: anewarray 293
      // 0fb: dup_x2
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 101: bipush 0
      // 102: swap
      // 103: aastore
      // 104: ldc2_w 1342331176966449955
      // 107: lload 3
      // 108: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: bipush 7
      // 10f: anewarray 293
      // 112: dup_x1
      // 113: swap
      // 114: bipush 6
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11d: bipush 5
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 125: bipush 4
      // 126: swap
      // 127: aastore
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 3
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x2
      // 12e: dup_x2
      // 12f: pop
      // 130: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 133: bipush 2
      // 134: swap
      // 135: aastore
      // 136: dup_x1
      // 137: swap
      // 138: bipush 1
      // 139: swap
      // 13a: aastore
      // 13b: dup_x1
      // 13c: swap
      // 13d: bipush 0
      // 13e: swap
      // 13f: aastore
      // 140: ldc2_w 585928650874638897
      // 143: lload 3
      // 144: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: aload 21
      // 14b: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 14e: arraylength
      // 14f: bipush 2
      // 150: iadd
      // 151: istore 23
      // 153: invokedynamic o (IJ)I bsm=com/zelix/lqg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: lload 7
      // 15a: bipush 2
      // 15b: anewarray 293
      // 15e: dup_x2
      // 15f: dup_x2
      // 160: pop
      // 161: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 164: bipush 1
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16c: bipush 0
      // 16d: swap
      // 16e: aastore
      // 16f: ldc2_w 592290751398420336
      // 172: lload 3
      // 173: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: astore 24
      // 17a: new com/zelix/lmp
      // 17d: dup
      // 17e: aload 0
      // 17f: ldc2_w 612473028471268901
      // 182: lload 3
      // 183: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: lload 11
      // 18a: dup2_x1
      // 18b: pop2
      // 18c: aload 6
      // 18e: ldc2_w 1326417996297205742
      // 191: lload 3
      // 192: invokedynamic o (JJ)Lcom/zelix/ou; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: bipush 0
      // 198: invokespecial com/zelix/lmp.<init> (JLcom/zelix/l;Lcom/zelix/lmp;Lcom/zelix/ou;I)V
      // 19b: astore 25
      // 19d: aload 25
      // 19f: lload 17
      // 1a1: aload 24
      // 1a3: bipush 2
      // 1a4: anewarray 293
      // 1a7: dup_x1
      // 1a8: swap
      // 1a9: bipush 1
      // 1aa: swap
      // 1ab: aastore
      // 1ac: dup_x2
      // 1ad: dup_x2
      // 1ae: pop
      // 1af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b2: bipush 0
      // 1b3: swap
      // 1b4: aastore
      // 1b5: ldc2_w 1318447248061781953
      // 1b8: lload 3
      // 1b9: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: pop
      // 1bf: aload 19
      // 1c1: lload 3
      // 1c2: lconst_0
      // 1c3: lcmp
      // 1c4: ifle 232
      // 1c7: ifnonnull 230
      // 1ca: iload 5
      // 1cc: aload 2
      // 1cd: invokevirtual com/zelix/nc.F ()I
      // 1d0: if_icmple 235
      // 1d3: goto 1e0
      // 1d6: ldc2_w 1661271362508665349
      // 1d9: lload 3
      // 1da: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: ldc2_w 612473028471268901
      // 1e4: lload 3
      // 1e5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: aload 25
      // 1ec: aload 2
      // 1ed: iload 5
      // 1ef: iload 23
      // 1f1: lload 13
      // 1f3: bipush 5
      // 1f4: anewarray 293
      // 1f7: dup_x2
      // 1f8: dup_x2
      // 1f9: pop
      // 1fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fd: bipush 4
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x1
      // 201: swap
      // 202: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 205: bipush 3
      // 206: swap
      // 207: aastore
      // 208: dup_x1
      // 209: swap
      // 20a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20d: bipush 2
      // 20e: swap
      // 20f: aastore
      // 210: dup_x1
      // 211: swap
      // 212: bipush 1
      // 213: swap
      // 214: aastore
      // 215: dup_x1
      // 216: swap
      // 217: bipush 0
      // 218: swap
      // 219: aastore
      // 21a: ldc2_w 1021565088409927203
      // 21d: lload 3
      // 21e: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: goto 230
      // 226: ldc2_w 1661271362508665349
      // 229: lload 3
      // 22a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: aload 19
      // 232: ifnull 2a9
      // 235: aload 2
      // 236: invokevirtual com/zelix/nc.U ()Ljava/util/List;
      // 239: astore 26
      // 23b: bipush 0
      // 23c: istore 27
      // 23e: iload 27
      // 240: aload 26
      // 242: invokeinterface java/util/List.size ()I 1
      // 247: if_icmpge 2a9
      // 24a: aload 26
      // 24c: iload 27
      // 24e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 253: checkcast com/zelix/nc
      // 256: astore 28
      // 258: aload 0
      // 259: ldc2_w 612473028471268901
      // 25c: lload 3
      // 25d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/l; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: aload 25
      // 264: aload 28
      // 266: aload 28
      // 268: invokevirtual com/zelix/nc.P ()I
      // 26b: bipush 1
      // 26c: iadd
      // 26d: iload 23
      // 26f: lload 13
      // 271: bipush 5
      // 272: anewarray 293
      // 275: dup_x2
      // 276: dup_x2
      // 277: pop
      // 278: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27b: bipush 4
      // 27c: swap
      // 27d: aastore
      // 27e: dup_x1
      // 27f: swap
      // 280: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 283: bipush 3
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 28b: bipush 2
      // 28c: swap
      // 28d: aastore
      // 28e: dup_x1
      // 28f: swap
      // 290: bipush 1
      // 291: swap
      // 292: aastore
      // 293: dup_x1
      // 294: swap
      // 295: bipush 0
      // 296: swap
      // 297: aastore
      // 298: ldc2_w 1021565088409927203
      // 29b: lload 3
      // 29c: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: iinc 27 1
      // 2a4: aload 19
      // 2a6: ifnull 23e
      // 2a9: aconst_null
      // 2aa: astore 26
      // 2ac: bipush 0
      // 2ad: istore 27
      // 2af: iload 27
      // 2b1: aload 22
      // 2b3: invokevirtual java/util/ArrayList.size ()I
      // 2b6: if_icmpge 423
      // 2b9: aload 22
      // 2bb: iload 27
      // 2bd: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 2c0: astore 28
      // 2c2: aload 28
      // 2c4: instanceof java/lang/Integer
      // 2c7: aload 19
      // 2c9: lload 3
      // 2ca: lconst_0
      // 2cb: lcmp
      // 2cc: ifle 2d4
      // 2cf: ifnonnull 48f
      // 2d2: aload 19
      // 2d4: ifnonnull 3fc
      // 2d7: goto 2e4
      // 2da: ldc2_w 1661271362508665349
      // 2dd: lload 3
      // 2de: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e3: athrow
      // 2e4: lload 3
      // 2e5: lconst_0
      // 2e6: lcmp
      // 2e7: ifle 3ef
      // 2ea: ifeq 3c1
      // 2ed: goto 2fa
      // 2f0: ldc2_w 1661271362508665349
      // 2f3: lload 3
      // 2f4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: athrow
      // 2fa: aload 26
      // 2fc: lload 3
      // 2fd: lconst_0
      // 2fe: lcmp
      // 2ff: iflt 345
      // 302: aload 19
      // 304: ifnonnull 345
      // 307: goto 314
      // 30a: ldc2_w 1661271362508665349
      // 30d: lload 3
      // 30e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 313: athrow
      // 314: ifnonnull 336
      // 317: goto 324
      // 31a: ldc2_w 1661271362508665349
      // 31d: lload 3
      // 31e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: athrow
      // 324: aload 28
      // 326: checkcast java/lang/Integer
      // 329: astore 26
      // 32b: aload 19
      // 32d: lload 3
      // 32e: lconst_0
      // 32f: lcmp
      // 330: iflt 40d
      // 333: ifnull 408
      // 336: aload 28
      // 338: goto 345
      // 33b: ldc2_w 1661271362508665349
      // 33e: lload 3
      // 33f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: athrow
      // 345: aload 26
      // 347: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 34a: lload 3
      // 34b: lconst_0
      // 34c: lcmp
      // 34d: iflt 3b5
      // 350: aload 19
      // 352: ifnonnull 3b5
      // 355: ifne 408
      // 358: goto 365
      // 35b: ldc2_w 1661271362508665349
      // 35e: lload 3
      // 35f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 364: athrow
      // 365: aload 0
      // 366: ldc2_w 1423168045957465113
      // 369: lload 3
      // 36a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36f: new java/lang/StringBuilder
      // 372: dup
      // 373: invokespecial java/lang/StringBuilder.<init> ()V
      // 376: sipush 25338
      // 379: ldc2_w 6890867253152112314
      // 37c: lload 3
      // 37d: lxor
      // 37e: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lqg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 386: aload 26
      // 388: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 38b: sipush 16982
      // 38e: ldc2_w 4124310682707918359
      // 391: lload 3
      // 392: lxor
      // 393: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lqg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39b: aload 28
      // 39d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3a3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3a8: goto 3b5
      // 3ab: ldc2_w 1661271362508665349
      // 3ae: lload 3
      // 3af: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b4: athrow
      // 3b5: pop
      // 3b6: lload 3
      // 3b7: lconst_0
      // 3b8: lcmp
      // 3b9: ifle 423
      // 3bc: aload 19
      // 3be: ifnull 423
      // 3c1: aload 0
      // 3c2: ldc2_w 1423168045957465113
      // 3c5: lload 3
      // 3c6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: new java/lang/StringBuilder
      // 3ce: dup
      // 3cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d2: sipush 26434
      // 3d5: ldc2_w 2942661399431109376
      // 3d8: lload 3
      // 3d9: lxor
      // 3da: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lqg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e2: aload 28
      // 3e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ea: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3ef: goto 3fc
      // 3f2: ldc2_w 1661271362508665349
      // 3f5: lload 3
      // 3f6: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: athrow
      // 3fc: pop
      // 3fd: lload 3
      // 3fe: lconst_0
      // 3ff: lcmp
      // 400: ifle 423
      // 403: aload 19
      // 405: ifnull 423
      // 408: iinc 27 1
      // 40b: aload 19
      // 40d: ifnull 2af
      // 410: lload 3
      // 411: lconst_0
      // 412: lcmp
      // 413: iflt 2c2
      // 416: goto 423
      // 419: ldc2_w 1661271362508665349
      // 41c: lload 3
      // 41d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 422: athrow
      // 423: aload 26
      // 425: lload 3
      // 426: lconst_0
      // 427: lcmp
      // 428: iflt 460
      // 42b: aload 19
      // 42d: ifnonnull 460
      // 430: ifnull 466
      // 433: goto 440
      // 436: ldc2_w 1661271362508665349
      // 439: lload 3
      // 43a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43f: athrow
      // 440: aload 0
      // 441: ldc2_w 772129817493146474
      // 444: lload 3
      // 445: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44a: aload 26
      // 44c: aload 24
      // 44e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 453: goto 460
      // 456: ldc2_w 1661271362508665349
      // 459: lload 3
      // 45a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45f: athrow
      // 460: pop
      // 461: aload 19
      // 463: ifnull 490
      // 466: aload 0
      // 467: ldc2_w 1423168045957465113
      // 46a: lload 3
      // 46b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 470: sipush 2916
      // 473: ldc2_w 4345247355088254759
      // 476: lload 3
      // 477: lxor
      // 478: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/lqg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 482: goto 48f
      // 485: ldc2_w 1661271362508665349
      // 488: lload 3
      // 489: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48e: athrow
      // 48f: pop
      // 490: bipush 1
      // 491: ireturn
      // 492: bipush 0
      // 493: ireturn
   }

   lqg(l var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 45759218337065L;
      long var6 = var2 ^ 136898454410493L;
      this.e = var1;
      super();
      m44.a<"p">(this, m44.a<"l">(new Object[]{var4}, -6823608203636980305L, var2), -6350022828846406083L, var2);
      m44.a<"p">(this, new ArrayList(), -4713276667589760690L, var2);
      m44.a<"p">(this, new fr(5, b<"o">(3629, 376056666678966902L ^ var2), var6, b<"o">(21981, 4708349368257503621L ^ var2)), -5016158414498532047L, var2);
   }

   public f9 y(Object[] var1) {
      long var2 = (Long)var1[0];
      l var4 = (l)var1[1];
      long var5 = var2 ^ 31820533709720L;
      return m44.a<"w">(var4, new Object[]{var5}, -7887097634067739144L, var2);
   }

   static {
      long var11 = a ^ 31923680256426L;
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
      String var17 = "ôÜÓãÒr;~ì\u001b´U\u0002Cc´ª»2¬\f±y3·\\Þ=G¾*\u0082Ímã}Ë»y°½-×D¹V\u0091y\u009e\b B\u0000æ\u0013Ççø\u009fT\\¨\u0084å¿\u0096è\u0086ñÿSà\u0089H\u008f\bDäjE\u0014° \u0005NGþ[Pð&[ä\u0000\u0018M;ÓomµgÒ}\u0012t3vN\u0007\twØºj'~¸ñ\u001d*-¢\\\u0011s©\u009e\u0095\\c\u0086ÐÑ~l\u0085\u0086\u001c\u0086k\u0004\u0085ÝFú~ã\u008e\u009d{Éè\u0098>ªYJ\u0099§0CÌ\u0019ñ3Û¢¡";
      int var19 = "ôÜÓãÒr;~ì\u001b´U\u0002Cc´ª»2¬\f±y3·\\Þ=G¾*\u0082Ímã}Ë»y°½-×D¹V\u0091y\u009e\b B\u0000æ\u0013Ççø\u009fT\\¨\u0084å¿\u0096è\u0086ñÿSà\u0089H\u008f\bDäjE\u0014° \u0005NGþ[Pð&[ä\u0000\u0018M;ÓomµgÒ}\u0012t3vN\u0007\twØºj'~¸ñ\u001d*-¢\\\u0011s©\u009e\u0095\\c\u0086ÐÑ~l\u0085\u0086\u001c\u0086k\u0004\u0085ÝFú~ã\u008e\u009d{Éè\u0098>ªYJ\u0099§0CÌ\u0019ñ3Û¢¡"
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
                     h = new HashMap(13);
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
                     String var4 = "7A^zúøC\u00114j§ çù\u001aP";
                     int var5 = "7A^zúøC\u00114j§ çù\u001aP".length();
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
                                    g = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u008fÈ\u008efPÞ\u008f1#\u0093\u0015\u0012Û\u0016\fÂ";
                                 var5 = "\u008fÈ\u008efPÞ\u008f1#\u0093\u0015\u0012Û\u0016\fÂ".length();
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

                  var17 = "\u0090¶RM²\u000b²\u0083â¨h\u009fld1FFü\u001bôl&\u009cPj}mäÑ!l\f¥Òø§6\u0010{vÝ\f\u001e¶\u0013`\u008d%¾L¿;Ø¤'\u0015²cº¸Ê°Swe®³CÁ\u0016A\u0003DÍORÖLOBrB/\u0010ÞJgç\u0010\u0091\u0098eü{\u0099¦£óúQ\u0014µ!4Ï";
                  var19 = "\u0090¶RM²\u000b²\u0083â¨h\u009fld1FFü\u001bôl&\u009cPj}mäÑ!l\f¥Òø§6\u0010{vÝ\f\u001e¶\u0013`\u008d%¾L¿;Ø¤'\u0015²cº¸Ê°Swe®³CÁ\u0016A\u0003DÍORÖLOBrB/\u0010ÞJgç\u0010\u0091\u0098eü{\u0099¦£óúQ\u0014µ!4Ï"
                     .length();
                  var16 = 'X';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16254;
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
            throw new RuntimeException("com/zelix/lqg", var10);
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
         throw new RuntimeException("com/zelix/lqg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6705;
      if (g[var3] == null) {
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lqg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("com/zelix/lqg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
