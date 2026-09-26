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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class lkc {
   public static final char[] M;
   private boolean y;
   private static final char L;
   static final char[] F;
   private static final int[] z;
   private static final char o;
   private boolean f;
   private boolean Z;
   static final o9 S;
   private static final char r;
   private static final long ab = prr.a(-3073496562139054534L, 6626011280787803068L, MethodHandles.lookup().lookupClass()).a(274815496232527L);
   private static final String[] cb;
   private static final String[] db;
   private static final Map eb = new HashMap(13);
   private static final long[] ib;
   private static final Integer[] jb;
   private static final Map kb;
   private static final long[] ob;
   private static final Long[] pb;
   private static final Map qb;

   public abstract void v(Object[] var1);

   static Long J(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 1
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/sz
      // 020: astore 4
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/String
      // 028: astore 6
      // 02a: pop
      // 02b: getstatic com/zelix/lkc.ab J
      // 02e: lload 2
      // 02f: lxor
      // 030: lstore 2
      // 031: lload 2
      // 032: dup2
      // 033: ldc2_w 62926487599368
      // 036: lxor
      // 037: lstore 7
      // 039: dup2
      // 03a: ldc2_w 60815652306704
      // 03d: lxor
      // 03e: lstore 9
      // 040: dup2
      // 041: ldc2_w 133414589169664
      // 044: lxor
      // 045: lstore 11
      // 047: dup2
      // 048: ldc2_w 115735493579386
      // 04b: lxor
      // 04c: lstore 13
      // 04e: dup2
      // 04f: ldc2_w 136590790155728
      // 052: lxor
      // 053: lstore 15
      // 055: pop2
      // 056: ldc2_w -9104523155988276760
      // 059: lload 2
      // 05a: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: aload 5
      // 061: lload 13
      // 063: sipush 11532
      // 066: ldc2_w 3058163614019423831
      // 069: lload 2
      // 06a: lxor
      // 06b: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lkc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: bipush 3
      // 071: anewarray 221
      // 074: dup_x1
      // 075: swap
      // 076: bipush 2
      // 077: swap
      // 078: aastore
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 1
      // 080: swap
      // 081: aastore
      // 082: dup_x1
      // 083: swap
      // 084: bipush 0
      // 085: swap
      // 086: aastore
      // 087: ldc2_w -8671671756051133435
      // 08a: lload 2
      // 08b: invokedynamic j (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: lstore 18
      // 092: lload 18
      // 094: lload 11
      // 096: aload 6
      // 098: bipush 3
      // 099: anewarray 221
      // 09c: dup_x1
      // 09d: swap
      // 09e: bipush 2
      // 09f: swap
      // 0a0: aastore
      // 0a1: dup_x2
      // 0a2: dup_x2
      // 0a3: pop
      // 0a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a7: bipush 1
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w -6984899546012364632
      // 0b6: lload 2
      // 0b7: invokedynamic j (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: lstore 20
      // 0be: astore 17
      // 0c0: new java/util/ArrayList
      // 0c3: dup
      // 0c4: invokespecial java/util/ArrayList.<init> ()V
      // 0c7: astore 22
      // 0c9: bipush 0
      // 0ca: istore 23
      // 0cc: iload 23
      // 0ce: bipush 3
      // 0cf: if_icmpge 166
      // 0d2: lload 20
      // 0d4: sipush 5149
      // 0d7: ldc2_w 7816204146030810758
      // 0da: lload 2
      // 0db: lxor
      // 0dc: invokedynamic s (IJ)J bsm=com/zelix/lkc.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: land
      // 0e2: lload 2
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: ifle 1a1
      // 0e8: l2i
      // 0e9: istore 24
      // 0eb: aload 17
      // 0ed: ifnonnull 19f
      // 0f0: aload 17
      // 0f2: lload 2
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: ifle 163
      // 0f8: ifnonnull 161
      // 0fb: goto 108
      // 0fe: ldc2_w -9003083159071586062
      // 101: lload 2
      // 102: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: lload 2
      // 109: lconst_0
      // 10a: lcmp
      // 10b: ifle 15e
      // 10e: iload 24
      // 110: sipush 12768
      // 113: ldc2_w 1881070828111195517
      // 116: lload 2
      // 117: lxor
      // 118: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: if_icmpgt 14c
      // 120: goto 12d
      // 123: ldc2_w -9003083159071586062
      // 126: lload 2
      // 127: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: aload 22
      // 12f: getstatic com/zelix/lkc.S Lcom/zelix/o9;
      // 132: lload 7
      // 134: iload 24
      // 136: invokevirtual com/zelix/o9.e (JI)Ljava/lang/Integer;
      // 139: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 13e: pop
      // 13f: goto 14c
      // 142: ldc2_w -9003083159071586062
      // 145: lload 2
      // 146: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: lload 20
      // 14e: sipush 27189
      // 151: ldc2_w 2700009917114496701
      // 154: lload 2
      // 155: lxor
      // 156: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: lushr
      // 15c: lstore 20
      // 15e: iinc 23 1
      // 161: aload 17
      // 163: ifnull 0cc
      // 166: aload 22
      // 168: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
      // 16b: aload 4
      // 16d: aload 1
      // 16e: lload 9
      // 170: aload 22
      // 172: bipush 3
      // 173: anewarray 221
      // 176: dup_x1
      // 177: swap
      // 178: bipush 2
      // 179: swap
      // 17a: aastore
      // 17b: dup_x2
      // 17c: dup_x2
      // 17d: pop
      // 17e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 181: bipush 1
      // 182: swap
      // 183: aastore
      // 184: dup_x1
      // 185: swap
      // 186: bipush 0
      // 187: swap
      // 188: aastore
      // 189: ldc2_w -7448268165521213122
      // 18c: lload 2
      // 18d: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/ui; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: lload 15
      // 194: dup2_x1
      // 195: pop2
      // 196: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 199: lload 2
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: iflt 19f
      // 19f: lload 20
      // 1a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a4: areturn
   }

   public abstract void e(Object[] var1);

   public boolean U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return m44.a<"t">(this, 3286784988168677065L, var2);
   }

   public abstract boolean m(Object[] var1);

   public void J(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = ab ^ var3;
      m44.a<"w">(this, var2, 4323968430864160289L, var3);
   }

   static String c(Object[] var0) {
      Map var1;
      String var4;
      long var5;
      long var7;
      int[] var9;
      String var10;
      String var11;
      long var15;
      label32: {
         var4 = (String)var0[0];
         long var2 = (Long)var0[1];
         var1 = (Map)var0[2];
         var15 = ab ^ var2;
         var5 = var15 ^ 37667563915981L;
         var7 = var15 ^ 134067011393208L;
         int[] var10000 = m44.a<"l">(7041485341102569974L, var15);
         int var12 = var4.indexOf(c<"n">(10795, 1643443185071986350L ^ var15));
         var9 = var10000;
         if (var12 > -1) {
            var10 = var4.substring(0, var12);
            var11 = var4.substring(var12);
            if (var15 <= 0L || var9 == null) {
               break label32;
            }
         }

         var10 = var4;
         var11 = "";
      }

      label36: {
         try {
            if (var9 != null) {
               return var10;
            }

            if (!m44.a<"l">(new Object[]{var10, var7}, 9021005690574505503L, var15)) {
               break label36;
            }
         } catch (n9 var14) {
            throw m44.a<"l">(var14, 7138419128661272812L, var15);
         }

         return var4;
      }

      String var13 = (String)cf.J(var5, var10, var1);
      return var13 + var11;
   }

   public Integer q(long var1, int var3) {
      var1 = ab ^ var1;
      long var4 = var1 ^ 77087784649095L;
      return S.e(var4, var3);
   }

   abstract void B(Object[] var1);

   void h(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = ab ^ var3;
      m44.a<"q">(this, var2, 2027322782658942838L, var3);
   }

   private static long i(Object[] var0) {
      String var1 = (String)var0[0];
      long var4 = (Long)var0[1];
      String var3 = (String)var0[2];
      boolean var2 = (Boolean)var0[3];
      var4 = ab ^ var4;
      long var6 = var4 ^ 126011613049015L;
      long var8 = var4 ^ 108364585984717L;
      long var10 = m44.a<"m">(new Object[]{var1, var8, a<"h">(11532, 3058168820934639328L ^ var4)}, 8583583499969379506L, var4);
      if (var2) {
         var10 *= e<"s">(3445, 7903077540662706011L ^ var4);
      }

      Object[] var10004 = new Object[]{null, var6, var3};
      var10004[0] = var10;
      return m44.a<"m">(var10004, 8045589554364260383L, var4);
   }

   static Long n(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/sz
      // 016: astore 6
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 1
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/String
      // 028: astore 5
      // 02a: pop
      // 02b: getstatic com/zelix/lkc.ab J
      // 02e: lload 1
      // 02f: lxor
      // 030: lstore 1
      // 031: lload 1
      // 032: dup2
      // 033: ldc2_w 81985431654332
      // 036: lxor
      // 037: lstore 7
      // 039: dup2
      // 03a: ldc2_w 75746868283812
      // 03d: lxor
      // 03e: lstore 9
      // 040: dup2
      // 041: ldc2_w 12079851730612
      // 044: lxor
      // 045: lstore 11
      // 047: dup2
      // 048: ldc2_w 29589280449742
      // 04b: lxor
      // 04c: lstore 13
      // 04e: dup2
      // 04f: ldc2_w 50613350131798
      // 052: lxor
      // 053: lstore 15
      // 055: dup2
      // 056: ldc2_w 17115645061988
      // 059: lxor
      // 05a: lstore 17
      // 05c: pop2
      // 05d: ldc2_w -643364081172517028
      // 060: lload 1
      // 061: invokedynamic n (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: astore 19
      // 068: aload 4
      // 06a: aload 19
      // 06c: ifnonnull 0e0
      // 06f: invokevirtual java/lang/String.length ()I
      // 072: sipush 32049
      // 075: ldc2_w 1751137450967357200
      // 078: lload 1
      // 079: lxor
      // 07a: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: if_icmpge 0cd
      // 082: goto 08f
      // 085: ldc2_w -740019451771224506
      // 088: lload 1
      // 089: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: aload 4
      // 091: lload 15
      // 093: aload 3
      // 094: aload 6
      // 096: aload 5
      // 098: bipush 5
      // 099: anewarray 221
      // 09c: dup_x1
      // 09d: swap
      // 09e: bipush 4
      // 09f: swap
      // 0a0: aastore
      // 0a1: dup_x1
      // 0a2: swap
      // 0a3: bipush 3
      // 0a4: swap
      // 0a5: aastore
      // 0a6: dup_x1
      // 0a7: swap
      // 0a8: bipush 2
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x2
      // 0ac: dup_x2
      // 0ad: pop
      // 0ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b1: bipush 1
      // 0b2: swap
      // 0b3: aastore
      // 0b4: dup_x1
      // 0b5: swap
      // 0b6: bipush 0
      // 0b7: swap
      // 0b8: aastore
      // 0b9: ldc2_w -838852517559247269
      // 0bc: lload 1
      // 0bd: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Long; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: areturn
      // 0c3: ldc2_w -740019451771224506
      // 0c6: lload 1
      // 0c7: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 4
      // 0cf: bipush 0
      // 0d0: sipush 9041
      // 0d3: ldc2_w 6530020124397472105
      // 0d6: lload 1
      // 0d7: lxor
      // 0d8: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0e0: astore 20
      // 0e2: aload 4
      // 0e4: sipush 23585
      // 0e7: ldc2_w 88704633088374299
      // 0ea: lload 1
      // 0eb: lxor
      // 0ec: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f4: astore 21
      // 0f6: aload 20
      // 0f8: lload 13
      // 0fa: sipush 11532
      // 0fd: ldc2_w 3058142270215715043
      // 100: lload 1
      // 101: lxor
      // 102: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lkc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: bipush 3
      // 108: anewarray 221
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 2
      // 10e: swap
      // 10f: aastore
      // 110: dup_x2
      // 111: dup_x2
      // 112: pop
      // 113: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 116: bipush 1
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 0
      // 11c: swap
      // 11d: aastore
      // 11e: ldc2_w -1072846473814623567
      // 121: lload 1
      // 122: invokedynamic n (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: lstore 22
      // 129: lload 22
      // 12b: lload 11
      // 12d: aload 5
      // 12f: bipush 3
      // 130: anewarray 221
      // 133: dup_x1
      // 134: swap
      // 135: bipush 2
      // 136: swap
      // 137: aastore
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 1
      // 13f: swap
      // 140: aastore
      // 141: dup_x2
      // 142: dup_x2
      // 143: pop
      // 144: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 147: bipush 0
      // 148: swap
      // 149: aastore
      // 14a: ldc2_w -1610928066755680740
      // 14d: lload 1
      // 14e: invokedynamic n (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: lstore 24
      // 155: aload 21
      // 157: lload 13
      // 159: sipush 11532
      // 15c: ldc2_w 3058142270215715043
      // 15f: lload 1
      // 160: lxor
      // 161: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lkc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: bipush 3
      // 167: anewarray 221
      // 16a: dup_x1
      // 16b: swap
      // 16c: bipush 2
      // 16d: swap
      // 16e: aastore
      // 16f: dup_x2
      // 170: dup_x2
      // 171: pop
      // 172: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 175: bipush 1
      // 176: swap
      // 177: aastore
      // 178: dup_x1
      // 179: swap
      // 17a: bipush 0
      // 17b: swap
      // 17c: aastore
      // 17d: ldc2_w -1072846473814623567
      // 180: lload 1
      // 181: invokedynamic n (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: lstore 26
      // 188: lload 26
      // 18a: lload 11
      // 18c: aload 5
      // 18e: bipush 3
      // 18f: anewarray 221
      // 192: dup_x1
      // 193: swap
      // 194: bipush 2
      // 195: swap
      // 196: aastore
      // 197: dup_x2
      // 198: dup_x2
      // 199: pop
      // 19a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19d: bipush 1
      // 19e: swap
      // 19f: aastore
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: ldc2_w -1610928066755680740
      // 1ac: lload 1
      // 1ad: invokedynamic n (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: lstore 28
      // 1b4: new java/util/ArrayList
      // 1b7: dup
      // 1b8: invokespecial java/util/ArrayList.<init> ()V
      // 1bb: astore 30
      // 1bd: bipush 0
      // 1be: istore 31
      // 1c0: iload 31
      // 1c2: bipush 3
      // 1c3: if_icmpge 25a
      // 1c6: lload 28
      // 1c8: sipush 16624
      // 1cb: ldc2_w 1634741256560456920
      // 1ce: lload 1
      // 1cf: lxor
      // 1d0: invokedynamic s (IJ)J bsm=com/zelix/lkc.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: land
      // 1d6: lload 1
      // 1d7: lconst_0
      // 1d8: lcmp
      // 1d9: ifle 295
      // 1dc: l2i
      // 1dd: istore 32
      // 1df: aload 19
      // 1e1: ifnonnull 293
      // 1e4: aload 19
      // 1e6: lload 1
      // 1e7: lconst_0
      // 1e8: lcmp
      // 1e9: ifle 257
      // 1ec: ifnonnull 255
      // 1ef: goto 1fc
      // 1f2: ldc2_w -740019451771224506
      // 1f5: lload 1
      // 1f6: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: lload 1
      // 1fd: lconst_0
      // 1fe: lcmp
      // 1ff: iflt 252
      // 202: iload 32
      // 204: sipush 30920
      // 207: ldc2_w 2936539207635325666
      // 20a: lload 1
      // 20b: lxor
      // 20c: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: if_icmpgt 240
      // 214: goto 221
      // 217: ldc2_w -740019451771224506
      // 21a: lload 1
      // 21b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 30
      // 223: getstatic com/zelix/lkc.S Lcom/zelix/o9;
      // 226: lload 7
      // 228: iload 32
      // 22a: invokevirtual com/zelix/o9.e (JI)Ljava/lang/Integer;
      // 22d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 232: pop
      // 233: goto 240
      // 236: ldc2_w -740019451771224506
      // 239: lload 1
      // 23a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: lload 28
      // 242: sipush 15023
      // 245: ldc2_w 8596567271018860690
      // 248: lload 1
      // 249: lxor
      // 24a: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: lushr
      // 250: lstore 28
      // 252: iinc 31 1
      // 255: aload 19
      // 257: ifnull 1c0
      // 25a: aload 30
      // 25c: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
      // 25f: aload 6
      // 261: aload 3
      // 262: lload 9
      // 264: aload 30
      // 266: bipush 3
      // 267: anewarray 221
      // 26a: dup_x1
      // 26b: swap
      // 26c: bipush 2
      // 26d: swap
      // 26e: aastore
      // 26f: dup_x2
      // 270: dup_x2
      // 271: pop
      // 272: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 275: bipush 1
      // 276: swap
      // 277: aastore
      // 278: dup_x1
      // 279: swap
      // 27a: bipush 0
      // 27b: swap
      // 27c: aastore
      // 27d: ldc2_w -1290813201785122934
      // 280: lload 1
      // 281: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/ui; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: lload 17
      // 288: dup2_x1
      // 289: pop2
      // 28a: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 28d: lload 1
      // 28e: lconst_0
      // 28f: lcmp
      // 290: ifle 293
      // 293: lload 24
      // 295: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 298: areturn
   }

   public abstract void D(Object[] var1);

   public abstract void H(Object[] var1);

   public static int[] u(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:35 from source 32_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 1
      // 01a: pop
      // 01b: getstatic com/zelix/lkc.ab J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 75979170262760
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: ldc2_w 5541220478478832808
      // 02d: lload 1
      // 02e: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: aload 3
      // 034: ldc2_w 5801326581758986030
      // 037: lload 1
      // 038: invokedynamic j (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: lstore 8
      // 03f: astore 7
      // 041: bipush 0
      // 042: istore 10
      // 044: bipush 0
      // 045: istore 11
      // 047: iload 11
      // 049: aload 4
      // 04b: invokevirtual java/lang/String.length ()I
      // 04e: if_icmpge 065
      // 051: iload 10
      // 053: aload 4
      // 055: iload 11
      // 057: invokevirtual java/lang/String.charAt (I)C
      // 05a: iadd
      // 05b: istore 10
      // 05d: iinc 11 1
      // 060: aload 7
      // 062: ifnull 047
      // 065: lload 1
      // 066: lconst_0
      // 067: lcmp
      // 068: iflt 060
      // 06b: lload 8
      // 06d: iload 10
      // 06f: i2l
      // 070: lsub
      // 071: lstore 11
      // 073: lload 11
      // 075: ldc2_w 5983804237500251306
      // 078: lload 1
      // 079: invokedynamic j (JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: sipush 23585
      // 081: ldc2_w 88722928564653551
      // 084: lload 1
      // 085: lxor
      // 086: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: ldc2_w 6028366236288862831
      // 08e: lload 1
      // 08f: invokedynamic j (Ljava/lang/Object;IJJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: ldc2_w 5983804237500251306
      // 097: lload 1
      // 098: invokedynamic j (JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: astore 13
      // 09f: aload 13
      // 0a1: invokevirtual java/lang/String.length ()I
      // 0a4: aload 7
      // 0a6: ifnonnull 113
      // 0a9: bipush 5
      // 0aa: if_icmpge 10e
      // 0ad: goto 0ba
      // 0b0: ldc2_w 5642725933176931762
      // 0b3: lload 1
      // 0b4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 13
      // 0bc: sipush 17027
      // 0bf: ldc2_w 5958049687300232021
      // 0c2: lload 1
      // 0c3: lxor
      // 0c4: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: bipush 5
      // 0ca: lload 5
      // 0cc: sipush 9538
      // 0cf: ldc2_w 4676734602941871254
      // 0d2: lload 1
      // 0d3: lxor
      // 0d4: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: bipush 5
      // 0da: anewarray 221
      // 0dd: dup_x1
      // 0de: swap
      // 0df: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e2: bipush 4
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 3
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 2
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fb: bipush 1
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x1
      // 0ff: swap
      // 100: bipush 0
      // 101: swap
      // 102: aastore
      // 103: ldc2_w 5600189692631411839
      // 106: lload 1
      // 107: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: astore 13
      // 10e: aload 13
      // 110: invokevirtual java/lang/String.length ()I
      // 113: istore 14
      // 115: aload 13
      // 117: bipush 0
      // 118: iload 14
      // 11a: bipush 4
      // 11b: isub
      // 11c: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 11f: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 122: istore 15
      // 124: aload 13
      // 126: iload 14
      // 128: bipush 4
      // 129: isub
      // 12a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 12d: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 130: istore 16
      // 132: bipush 2
      // 133: newarray 10
      // 135: dup
      // 136: bipush 0
      // 137: iload 15
      // 139: iastore
      // 13a: dup
      // 13b: bipush 1
      // 13c: iload 16
      // 13e: iastore
      // 13f: astore 17
      // 141: aload 17
      // 143: areturn
   }

   public abstract void p(Object[] var1);

   public static String a(Object[] var0) {
      String var4 = (String)var0[0];
      long var1 = (Long)var0[1];
      String var3 = (String)var0[2];
      var1 = ab ^ var1;
      long var5 = var1 ^ 115204367512865L;
      long var7 = var1 ^ 8280648884899L;
      int var9 = m44.a<"o">(new Object[]{var7, var4}, 1145159764478545944L, var1);
      var4 = var4.substring(var9);
      return m44.a<"o">(new Object[]{var5, var4, var3}, 1470641341047956900L, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Irreducible bytecode was duplicated to produce valid code
   static String x(Object[] var0) {
      long var3 = (Long)var0[0];
      u5 var2 = (u5)var0[1];
      Long var6 = (Long)var0[2];
      loe var1 = (loe)var0[3];
      String var5 = (String)var0[4];
      var3 = ab ^ var3;
      long var7 = var3 ^ 21080959713738L;
      long var9 = var3 ^ 106009639852598L;
      long var11 = var3 ^ 69135072688542L;
      long var13 = var3 ^ 62196334307017L;
      int[] var15 = m44.a<"l">(-7237243575021403170L, var3);

      int[] var16;
      label76: {
         u5 var10000;
         label86: {
            label80: {
               try {
                  var10000 = var2;
                  if (var15 != null) {
                     break label86;
                  }

                  if (var2 != null) {
                     break label80;
                  }
               } catch (n9 var30) {
                  throw m44.a<"l">(var30, -7406021511772663100L, var3);
               }

               var16 = m44.a<"h">(-7348262242749228394L, var3);

               try {
                  if (var15 == null) {
                     break label76;
                  }
               } catch (n9 var29) {
                  boolean var10001 = false;
                  throw m44.a<"l">(var29, -7406021511772663100L, var3);
               }
            }

            try {
               var10000 = var2;
            } catch (n9 var28) {
               boolean var37 = false;
               throw m44.a<"l">(var28, -7406021511772663100L, var3);
            }
         }

         var16 = m44.a<"s">(var10000, new Object[]{var7}, -7227009985098150262L, var3);
      }

      long var34 = var6;
      Object[] var10004 = new Object[]{null, var9, var5};
      var10004[0] = var34;
      long var17 = m44.a<"l">(var10004, -8852177033388995938L, var3);
      var10004 = new Object[]{null, var13, m44.a<"h">(-7094984352406636821L, var3)};
      var10004[0] = var17;
      String var19 = m44.a<"l">(var10004, -8678137297922276575L, var3);
      int var38 = c<"n">(31393, 3670606362139016198L ^ var3);
      int var10002 = c<"n">(23585, 88751419296946841L ^ var3);
      Object[] var10006 = new Object[]{null, null, null, null, Integer.valueOf(m44.a<"h">(-7094984352406636821L, var3)[0])};
      var10006[3] = var11;
      var10006[2] = var10002;
      var10006[1] = var38;
      var10006[0] = var19;
      String var20 = m44.a<"l">(var10006, -7295368363497243895L, var3);
      long var21 = 0L;
      int var23 = 0;

      while (true) {
         if (var23 < 3) {
            label82: {
               if (var23 < var16.length) {
                  var34 = var21 | (long)var16[var23];
                  if (var3 <= 0L) {
                     var21 = var34;
                     break label82;
                  }

                  var21 = var34;
                  if (var15 == null) {
                     break label82;
                  }
               }

               var21 |= e<"s">(2225, 7453048341803208733L ^ var3);
            }

            if (var23 < 2) {
               var21 <<= c<"n">(27189, 2699984442402483339L ^ var3);
            }

            var23++;
            if (var15 == null) {
               continue;
            }
         }

         do {
            var10004 = new Object[]{null, var9, var5};
            var10004[0] = var21;
            var34 = m44.a<"l">(var10004, -8852177033388995938L, var3);
            if (var3 >= 0L) {
               long var32 = var34;
               var10004 = new Object[]{null, var13, m44.a<"h">(-7094984352406636821L, var3)};
               var10004[0] = var32;
               String var25 = m44.a<"l">(var10004, -8678137297922276575L, var3);
               var38 = c<"n">(17027, 5958057132559336483L ^ var3);
               var10002 = c<"n">(21663, 5103257290736308790L ^ var3);
               var10006 = new Object[]{null, null, null, null, Integer.valueOf(m44.a<"h">(-7094984352406636821L, var3)[0])};
               var10006[3] = var11;
               var10006[2] = var10002;
               var10006[1] = var38;
               var10006[0] = var25;
               String var26 = m44.a<"l">(var10006, -7295368363497243895L, var3);
               return var20 + var26;
            }

            var21 = var34;
            if (var23 < 2) {
               var21 <<= c<"n">(27189, 2699984442402483339L ^ var3);
            }

            var23++;
         } while (var15 == null);
      }
   }

   abstract void I(Object[] var1);

   public boolean V(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return m44.a<"q">(this, -2902343094062930675L, var2);
   }

   public abstract void n(Object[] var1);

   static int s(Object[] param0) {
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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: pop
      // 013: getstatic com/zelix/lkc.ab J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w -5642380592259192324
      // 01c: lload 2
      // 01d: invokedynamic n (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 1
      // 023: bipush 0
      // 024: invokevirtual java/lang/String.charAt (I)C
      // 027: istore 5
      // 029: astore 4
      // 02b: iload 5
      // 02d: sipush 27817
      // 030: ldc2_w 7536820443694596132
      // 033: lload 2
      // 034: lxor
      // 035: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: aload 4
      // 03c: ifnonnull 07d
      // 03f: if_icmplt 082
      // 042: goto 04f
      // 045: ldc2_w -5540941282808317722
      // 048: lload 2
      // 049: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: iload 5
      // 051: aload 4
      // 053: ifnonnull 081
      // 056: goto 063
      // 059: ldc2_w -5540941282808317722
      // 05c: lload 2
      // 05d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: sipush 14701
      // 066: ldc2_w 6349269907636409829
      // 069: lload 2
      // 06a: lxor
      // 06b: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: goto 07d
      // 073: ldc2_w -5540941282808317722
      // 076: lload 2
      // 077: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: if_icmpgt 082
      // 080: bipush 1
      // 081: ireturn
      // 082: aload 1
      // 083: invokevirtual java/lang/String.toCharArray ()[C
      // 086: astore 6
      // 088: aload 6
      // 08a: arraylength
      // 08b: istore 7
      // 08d: bipush 1
      // 08e: istore 8
      // 090: iload 8
      // 092: aload 6
      // 094: arraylength
      // 095: if_icmpge 144
      // 098: aload 1
      // 099: iload 8
      // 09b: invokevirtual java/lang/String.charAt (I)C
      // 09e: istore 9
      // 0a0: aload 4
      // 0a2: lload 2
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iflt 141
      // 0a8: ifnonnull 13f
      // 0ab: iload 9
      // 0ad: aload 4
      // 0af: ifnonnull 146
      // 0b2: goto 0bf
      // 0b5: ldc2_w -5540941282808317722
      // 0b8: lload 2
      // 0b9: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: sipush 27817
      // 0c2: ldc2_w 7536820443694596132
      // 0c5: lload 2
      // 0c6: lxor
      // 0c7: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: if_icmplt 12f
      // 0cf: goto 0dc
      // 0d2: ldc2_w -5540941282808317722
      // 0d5: lload 2
      // 0d6: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: lload 2
      // 0dd: lconst_0
      // 0de: lcmp
      // 0df: iflt 124
      // 0e2: iload 9
      // 0e4: aload 4
      // 0e6: ifnonnull 122
      // 0e9: goto 0f6
      // 0ec: ldc2_w -5540941282808317722
      // 0ef: lload 2
      // 0f0: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: sipush 17371
      // 0f9: ldc2_w 5820288329800396631
      // 0fc: lload 2
      // 0fd: lxor
      // 0fe: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: if_icmpgt 12f
      // 106: goto 113
      // 109: ldc2_w -5540941282808317722
      // 10c: lload 2
      // 10d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: iload 8
      // 115: goto 122
      // 118: ldc2_w -5540941282808317722
      // 11b: lload 2
      // 11c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: istore 7
      // 124: lload 2
      // 125: lconst_0
      // 126: lcmp
      // 127: ifle 132
      // 12a: aload 4
      // 12c: ifnull 144
      // 12f: iinc 8 1
      // 132: goto 13f
      // 135: ldc2_w -5540941282808317722
      // 138: lload 2
      // 139: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: aload 4
      // 141: ifnull 090
      // 144: iload 7
      // 146: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static String V(Object[] var0) {
      long var2 = (Long)var0[0];
      long var4 = (Long)var0[1];
      String var6 = (String)var0[2];
      zr var1 = (zr)var0[3];
      var4 = ab ^ var4;
      long var7 = var4 ^ 52739285928842L;
      long var9 = var4 ^ 130894210004853L;
      int[] var10000 = m44.a<"h">(-3878607749342997918L, var4);
      Object[] var10005 = new Object[]{null, var7, var6};
      var10005[0] = var2;
      long var12 = m44.a<"h">(var10005, -3126922564959462622L, var4);
      int[] var11 = var10000;

      long var14;
      label45: {
         label54: {
            label42: {
               label49: {
                  try {
                     var22 = var12;
                     if (var11 != null) {
                        break label54;
                     }

                     if (var12 >= 0L) {
                        break label49;
                     }
                  } catch (n9 var20) {
                     throw m44.a<"h">(var20, -3997849355172592776L, var4);
                  }

                  var1.I(true);
                  var14 = var12 * e<"s">(27616, 6235464478760215282L ^ var4);

                  try {
                     if (var4 <= 0L) {
                        break label42;
                     }

                     if (var11 == null) {
                        break label45;
                     }
                  } catch (n9 var19) {
                     boolean var10001 = false;
                     throw m44.a<"h">(var19, -3997849355172592776L, var4);
                  }
               }

               try {
                  var1.I(false);
               } catch (n9 var18) {
                  boolean var24 = false;
                  throw m44.a<"h">(var18, -3997849355172592776L, var4);
               }
            }

            try {
               var22 = var12;
            } catch (n9 var17) {
               boolean var25 = false;
               throw m44.a<"h">(var17, -3997849355172592776L, var4);
            }
         }

         var14 = var22;
      }

      Object[] var10004 = new Object[]{null, var9, m44.a<"l">(-3731862519286683817L, var4)};
      var10004[0] = var14;
      return m44.a<"h">(var10004, -3013647545742388579L, var4);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static String u(Object[] var0) {
      long var3 = (Long)var0[0];
      String var5 = (String)var0[1];
      long var1 = (Long)var0[2];
      var1 = ab ^ var1;
      long var6 = var1 ^ 64199285250151L;
      long var8 = var1 ^ 25003367673511L;
      int[] var10000 = m44.a<"m">(-402753499785698777L, var1);
      zr var11 = new zr();
      int[] var10 = var10000;
      Object[] var10005 = new Object[]{null, var8, var5, var11};
      var10005[0] = var3;
      String var12 = m44.a<"m">(var10005, -1893464314081577963L, var1);

      char var13;
      label40: {
         label47: {
            label44: {
               try {
                  var19 = var11.S();
                  if (var10 != null) {
                     break label47;
                  }

                  if (var19 == 0) {
                     break label44;
                  }
               } catch (n9 var17) {
                  throw m44.a<"m">(var17, -521992942567099587L, var1);
               }

               var19 = m44.a<"i">(-494831815580531516L, var1);
               if (var1 < 0L) {
                  break label47;
               }

               var13 = var19;

               try {
                  if (var10 == null) {
                     break label40;
                  }
               } catch (n9 var16) {
                  boolean var10001 = false;
                  throw m44.a<"m">(var16, -521992942567099587L, var1);
               }
            }

            try {
               var19 = m44.a<"i">(-2261303061331117542L, var1);
            } catch (n9 var15) {
               boolean var22 = false;
               throw m44.a<"m">(var15, -521992942567099587L, var1);
            }
         }

         var13 = var19;
      }

      StringBuilder var21 = new StringBuilder().append(var13);
      int var10002 = c<"n">(17027, 5958053289563776474L ^ var1);
      int var10003 = c<"n">(22526, 4368958463539867819L ^ var1);
      Object[] var10007 = new Object[]{null, null, null, null, Integer.valueOf(m44.a<"i">(-443692432832112494L, var1))};
      var10007[3] = var6;
      var10007[2] = var10003;
      var10007[1] = var10002;
      var10007[0] = var12;
      return var21.append(m44.a<"m">(var10007, -344347648146613520L, var1)).toString();
   }

   public abstract void F(Object[] var1);

   public static void d(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/rs
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/rs
      // 016: astore 7
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/rs
      // 01e: astore 6
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast com/zelix/rs
      // 026: astore 8
      // 028: dup
      // 029: bipush 5
      // 02a: aaload
      // 02b: checkcast java/lang/Long
      // 02e: invokevirtual java/lang/Long.longValue ()J
      // 031: lstore 2
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast com/zelix/rs
      // 039: astore 5
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast java/lang/String
      // 042: astore 9
      // 044: pop
      // 045: getstatic com/zelix/lkc.ab J
      // 048: lload 2
      // 049: lxor
      // 04a: lstore 2
      // 04b: lload 2
      // 04c: dup2
      // 04d: ldc2_w 6828500498657
      // 050: lxor
      // 051: lstore 10
      // 053: dup2
      // 054: ldc2_w 53568069687694
      // 057: lxor
      // 058: lstore 12
      // 05a: pop2
      // 05b: ldc2_w -5296977829070033357
      // 05e: lload 2
      // 05f: invokedynamic i (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: bipush 0
      // 065: istore 15
      // 067: astore 14
      // 069: iload 15
      // 06b: sipush 19096
      // 06e: ldc2_w 8075441593158443472
      // 071: lload 2
      // 072: lxor
      // 073: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: iadd
      // 079: bipush 1
      // 07a: iadd
      // 07b: istore 16
      // 07d: aload 1
      // 07e: iload 15
      // 080: iload 16
      // 082: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 085: astore 17
      // 087: aload 17
      // 089: bipush 0
      // 08a: invokevirtual java/lang/String.charAt (I)C
      // 08d: aload 14
      // 08f: ifnonnull 0b9
      // 092: ldc2_w -5388985230389311280
      // 095: lload 2
      // 096: invokedynamic m (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: if_icmpne 0bc
      // 09e: goto 0ab
      // 0a1: ldc2_w -5416148893621174487
      // 0a4: lload 2
      // 0a5: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: bipush 1
      // 0ac: goto 0b9
      // 0af: ldc2_w -5416148893621174487
      // 0b2: lload 2
      // 0b3: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: goto 0bd
      // 0bc: bipush 0
      // 0bd: istore 18
      // 0bf: aload 4
      // 0c1: aload 17
      // 0c3: bipush 1
      // 0c4: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0c7: lload 12
      // 0c9: aload 9
      // 0cb: iload 18
      // 0cd: bipush 4
      // 0ce: anewarray 221
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d6: bipush 3
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 2
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: bipush 0
      // 0ea: swap
      // 0eb: aastore
      // 0ec: ldc2_w -6189627236240769045
      // 0ef: lload 2
      // 0f0: invokedynamic i (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: lload 10
      // 0f7: bipush 2
      // 0f8: anewarray 221
      // 0fb: dup_x2
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 10d: ldc2_w -6147408760965693557
      // 110: lload 2
      // 111: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: iload 16
      // 118: istore 15
      // 11a: iload 15
      // 11c: sipush 22526
      // 11f: ldc2_w 4369006188040928447
      // 122: lload 2
      // 123: lxor
      // 124: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: iadd
      // 12a: bipush 1
      // 12b: lload 2
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 152
      // 131: iadd
      // 132: istore 16
      // 134: aload 1
      // 135: iload 15
      // 137: iload 16
      // 139: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 13c: astore 17
      // 13e: aload 17
      // 140: bipush 0
      // 141: invokevirtual java/lang/String.charAt (I)C
      // 144: aload 14
      // 146: ifnonnull 170
      // 149: ldc2_w -5388985230389311280
      // 14c: lload 2
      // 14d: invokedynamic m (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: if_icmpne 173
      // 155: goto 162
      // 158: ldc2_w -5416148893621174487
      // 15b: lload 2
      // 15c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: bipush 1
      // 163: goto 170
      // 166: ldc2_w -5416148893621174487
      // 169: lload 2
      // 16a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: goto 174
      // 173: bipush 0
      // 174: istore 18
      // 176: aload 7
      // 178: aload 17
      // 17a: bipush 1
      // 17b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 17e: lload 12
      // 180: aload 9
      // 182: iload 18
      // 184: bipush 4
      // 185: anewarray 221
      // 188: dup_x1
      // 189: swap
      // 18a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 18d: bipush 3
      // 18e: swap
      // 18f: aastore
      // 190: dup_x1
      // 191: swap
      // 192: bipush 2
      // 193: swap
      // 194: aastore
      // 195: dup_x2
      // 196: dup_x2
      // 197: pop
      // 198: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19b: bipush 1
      // 19c: swap
      // 19d: aastore
      // 19e: dup_x1
      // 19f: swap
      // 1a0: bipush 0
      // 1a1: swap
      // 1a2: aastore
      // 1a3: ldc2_w -6189627236240769045
      // 1a6: lload 2
      // 1a7: invokedynamic i (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: lload 10
      // 1ae: bipush 2
      // 1af: anewarray 221
      // 1b2: dup_x2
      // 1b3: dup_x2
      // 1b4: pop
      // 1b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b8: bipush 1
      // 1b9: swap
      // 1ba: aastore
      // 1bb: dup_x2
      // 1bc: dup_x2
      // 1bd: pop
      // 1be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c1: bipush 0
      // 1c2: swap
      // 1c3: aastore
      // 1c4: ldc2_w -6147408760965693557
      // 1c7: lload 2
      // 1c8: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: iload 16
      // 1cf: istore 15
      // 1d1: iload 15
      // 1d3: sipush 22526
      // 1d6: ldc2_w 4369006188040928447
      // 1d9: lload 2
      // 1da: lxor
      // 1db: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: iadd
      // 1e1: bipush 1
      // 1e2: lload 2
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: ifle 209
      // 1e8: iadd
      // 1e9: istore 16
      // 1eb: aload 1
      // 1ec: iload 15
      // 1ee: iload 16
      // 1f0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f3: astore 17
      // 1f5: aload 17
      // 1f7: bipush 0
      // 1f8: invokevirtual java/lang/String.charAt (I)C
      // 1fb: aload 14
      // 1fd: ifnonnull 227
      // 200: ldc2_w -5388985230389311280
      // 203: lload 2
      // 204: invokedynamic m (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: if_icmpne 22a
      // 20c: goto 219
      // 20f: ldc2_w -5416148893621174487
      // 212: lload 2
      // 213: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: athrow
      // 219: bipush 1
      // 21a: goto 227
      // 21d: ldc2_w -5416148893621174487
      // 220: lload 2
      // 221: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: athrow
      // 227: goto 22b
      // 22a: bipush 0
      // 22b: istore 18
      // 22d: aload 6
      // 22f: aload 17
      // 231: bipush 1
      // 232: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 235: lload 12
      // 237: aload 9
      // 239: iload 18
      // 23b: bipush 4
      // 23c: anewarray 221
      // 23f: dup_x1
      // 240: swap
      // 241: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 244: bipush 3
      // 245: swap
      // 246: aastore
      // 247: dup_x1
      // 248: swap
      // 249: bipush 2
      // 24a: swap
      // 24b: aastore
      // 24c: dup_x2
      // 24d: dup_x2
      // 24e: pop
      // 24f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 252: bipush 1
      // 253: swap
      // 254: aastore
      // 255: dup_x1
      // 256: swap
      // 257: bipush 0
      // 258: swap
      // 259: aastore
      // 25a: ldc2_w -6189627236240769045
      // 25d: lload 2
      // 25e: invokedynamic i (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: lload 10
      // 265: bipush 2
      // 266: anewarray 221
      // 269: dup_x2
      // 26a: dup_x2
      // 26b: pop
      // 26c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26f: bipush 1
      // 270: swap
      // 271: aastore
      // 272: dup_x2
      // 273: dup_x2
      // 274: pop
      // 275: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 278: bipush 0
      // 279: swap
      // 27a: aastore
      // 27b: ldc2_w -6147408760965693557
      // 27e: lload 2
      // 27f: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: iload 16
      // 286: istore 15
      // 288: iload 15
      // 28a: sipush 22526
      // 28d: ldc2_w 4369006188040928447
      // 290: lload 2
      // 291: lxor
      // 292: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: iadd
      // 298: bipush 1
      // 299: lload 2
      // 29a: lconst_0
      // 29b: lcmp
      // 29c: iflt 2c0
      // 29f: iadd
      // 2a0: istore 16
      // 2a2: aload 1
      // 2a3: iload 15
      // 2a5: iload 16
      // 2a7: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2aa: astore 17
      // 2ac: aload 17
      // 2ae: bipush 0
      // 2af: invokevirtual java/lang/String.charAt (I)C
      // 2b2: aload 14
      // 2b4: ifnonnull 2de
      // 2b7: ldc2_w -5388985230389311280
      // 2ba: lload 2
      // 2bb: invokedynamic m (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c0: if_icmpne 2e1
      // 2c3: goto 2d0
      // 2c6: ldc2_w -5416148893621174487
      // 2c9: lload 2
      // 2ca: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: athrow
      // 2d0: bipush 1
      // 2d1: goto 2de
      // 2d4: ldc2_w -5416148893621174487
      // 2d7: lload 2
      // 2d8: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: athrow
      // 2de: goto 2e2
      // 2e1: bipush 0
      // 2e2: istore 18
      // 2e4: aload 8
      // 2e6: aload 17
      // 2e8: bipush 1
      // 2e9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 2ec: lload 12
      // 2ee: aload 9
      // 2f0: iload 18
      // 2f2: bipush 4
      // 2f3: anewarray 221
      // 2f6: dup_x1
      // 2f7: swap
      // 2f8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2fb: bipush 3
      // 2fc: swap
      // 2fd: aastore
      // 2fe: dup_x1
      // 2ff: swap
      // 300: bipush 2
      // 301: swap
      // 302: aastore
      // 303: dup_x2
      // 304: dup_x2
      // 305: pop
      // 306: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 309: bipush 1
      // 30a: swap
      // 30b: aastore
      // 30c: dup_x1
      // 30d: swap
      // 30e: bipush 0
      // 30f: swap
      // 310: aastore
      // 311: ldc2_w -6189627236240769045
      // 314: lload 2
      // 315: invokedynamic i (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: lload 10
      // 31c: bipush 2
      // 31d: anewarray 221
      // 320: dup_x2
      // 321: dup_x2
      // 322: pop
      // 323: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 326: bipush 1
      // 327: swap
      // 328: aastore
      // 329: dup_x2
      // 32a: dup_x2
      // 32b: pop
      // 32c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32f: bipush 0
      // 330: swap
      // 331: aastore
      // 332: ldc2_w -6147408760965693557
      // 335: lload 2
      // 336: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: iload 16
      // 33d: istore 15
      // 33f: iload 15
      // 341: sipush 22526
      // 344: ldc2_w 4369006188040928447
      // 347: lload 2
      // 348: lxor
      // 349: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34e: iadd
      // 34f: bipush 1
      // 350: lload 2
      // 351: lconst_0
      // 352: lcmp
      // 353: iflt 377
      // 356: iadd
      // 357: istore 16
      // 359: aload 1
      // 35a: iload 15
      // 35c: iload 16
      // 35e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 361: astore 17
      // 363: aload 17
      // 365: bipush 0
      // 366: invokevirtual java/lang/String.charAt (I)C
      // 369: aload 14
      // 36b: ifnonnull 395
      // 36e: ldc2_w -5388985230389311280
      // 371: lload 2
      // 372: invokedynamic m (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: if_icmpne 398
      // 37a: goto 387
      // 37d: ldc2_w -5416148893621174487
      // 380: lload 2
      // 381: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 386: athrow
      // 387: bipush 1
      // 388: goto 395
      // 38b: ldc2_w -5416148893621174487
      // 38e: lload 2
      // 38f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: athrow
      // 395: goto 399
      // 398: bipush 0
      // 399: istore 18
      // 39b: aload 5
      // 39d: aload 17
      // 39f: bipush 1
      // 3a0: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3a3: lload 12
      // 3a5: aload 9
      // 3a7: iload 18
      // 3a9: bipush 4
      // 3aa: anewarray 221
      // 3ad: dup_x1
      // 3ae: swap
      // 3af: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3b2: bipush 3
      // 3b3: swap
      // 3b4: aastore
      // 3b5: dup_x1
      // 3b6: swap
      // 3b7: bipush 2
      // 3b8: swap
      // 3b9: aastore
      // 3ba: dup_x2
      // 3bb: dup_x2
      // 3bc: pop
      // 3bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c0: bipush 1
      // 3c1: swap
      // 3c2: aastore
      // 3c3: dup_x1
      // 3c4: swap
      // 3c5: bipush 0
      // 3c6: swap
      // 3c7: aastore
      // 3c8: ldc2_w -6189627236240769045
      // 3cb: lload 2
      // 3cc: invokedynamic i (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d1: lload 10
      // 3d3: bipush 2
      // 3d4: anewarray 221
      // 3d7: dup_x2
      // 3d8: dup_x2
      // 3d9: pop
      // 3da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3dd: bipush 1
      // 3de: swap
      // 3df: aastore
      // 3e0: dup_x2
      // 3e1: dup_x2
      // 3e2: pop
      // 3e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e6: bipush 0
      // 3e7: swap
      // 3e8: aastore
      // 3e9: ldc2_w -6147408760965693557
      // 3ec: lload 2
      // 3ed: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f2: lload 2
      // 3f3: lconst_0
      // 3f4: lcmp
      // 3f5: iflt 408
      // 3f8: aload 14
      // 3fa: ifnull 415
      // 3fd: ldc "indf"
      // 3ff: ldc2_w -6019494188685898251
      // 402: lload 2
      // 403: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 408: goto 415
      // 40b: ldc2_w -5416148893621174487
      // 40e: lload 2
      // 40f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: athrow
      // 415: return
   }

   public abstract void M(Object[] var1);

   public abstract void x(Object[] var1);

   public abstract void L(Object[] var1);

   public abstract void R(Object[] var1);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static String T(Object[] var0) {
      long var3 = (Long)var0[0];
      rg var5 = (rg)var0[1];
      String var2 = (String)var0[2];
      Random var1 = (Random)var0[3];
      var3 = ab ^ var3;
      long var6 = var3 ^ 119653351246328L;
      long var8 = var3 ^ 20728639906802L;
      long var10 = var3 ^ 24085591948832L;
      long var12 = var3 ^ 113451746691092L;
      long var14 = var3 ^ 122813305135482L;
      long var16 = var3 ^ 68707185608409L;
      long var18 = var3 ^ 47592921741201L;
      long var20 = var3 ^ 10574214385966L;
      long var22 = var3 ^ 104246269591383L;
      long var24 = var3 ^ 79881713569752L;
      long var26 = var3 ^ 80357214456897L;
      long var28 = var3 ^ 23105105064260L;
      long var30 = var3 ^ 49299724559782L;
      int[] var10000 = m44.a<"m">(9174196856927282975L, var3);
      StringBuilder var33 = new StringBuilder();
      var33.append("0");
      String var34 = m44.a<"r">(var5, new Object[]{var6}, 8879535194918079023L, var3)
         + " "
         + m44.a<"r">(var5, new Object[]{var14}, 8837086563525326242L, var3)
         + a<"h">(2872, 7360349136864794259L ^ var3);
      var33.append(m44.a<"m">(new Object[]{var12, var34}, 8845505060884905825L, var3));
      int[] var32 = var10000;

      label115: {
         label114: {
            try {
               var48 = m44.a<"r">(var5, new Object[]{var18}, 8733029822496237268L, var3);
               if (var32 != null) {
                  break label115;
               }

               if (var48 == 0) {
                  break label114;
               }
            } catch (n9 var43) {
               throw m44.a<"m">(var43, 9077542243855463941L, var3);
            }

            var33.append(a<"h">(20087, 3002232269924504531L ^ var3));
            String var35 = m44.a<"r">(var5, new Object[]{var30}, 8772283895136059584L, var3)
               + m44.a<"r">(var5, new Object[]{var16}, 7378537002990168705L, var3)
               + a<"h">(15743, 6495481943105659093L ^ var3);
            var33.append(m44.a<"m">(new Object[]{var12, var35}, 8845505060884905825L, var3));
         }

         var48 = m44.a<"r">(var5, new Object[]{var22}, 9166968254120957481L, var3);
      }

      int[] var10001;
      label103: {
         label102: {
            label101: {
               try {
                  var10001 = var32;
                  if (var3 < 0L) {
                     break label103;
                  }

                  if (var32 != null) {
                     break label102;
                  }

                  if (var48 == 0) {
                     break label101;
                  }
               } catch (n9 var42) {
                  throw m44.a<"m">(var42, 9077542243855463941L, var3);
               }

               var33.append(a<"h">(2059, 7332030116619670950L ^ var3));
               String var45 = m44.a<"r">(var5, new Object[]{var28}, 7382075865786977370L, var3)
                  + m44.a<"r">(var5, new Object[]{var24}, 7135607381555226561L, var3)
                  + a<"h">(15743, 6495481943105659093L ^ var3);
               var33.append(m44.a<"m">(new Object[]{var12, var45}, 8845505060884905825L, var3));
            }

            var48 = m44.a<"r">(var5, new Object[]{var26}, 8723791399094936611L, var3);
         }

         try {
            var10001 = var32;
         } catch (n9 var41) {
            boolean var52 = false;
            throw m44.a<"m">(var41, 9077542243855463941L, var3);
         }
      }

      char var47;
      label121: {
         label87: {
            label86: {
               label85: {
                  try {
                     if (var3 < 0L) {
                        break label87;
                     }

                     if (var10001 != null) {
                        break label86;
                     }

                     if (var48 == 0) {
                        break label85;
                     }
                  } catch (n9 var40) {
                     boolean var53 = false;
                     throw m44.a<"m">(var40, 9077542243855463941L, var3);
                  }

                  var33.append(a<"h">(2304, 6310271592194987177L ^ var3));
                  String var46 = m44.a<"r">(var5, new Object[]{var8}, 7165147590957405985L, var3)
                     + m44.a<"r">(var5, new Object[]{var20}, 9012687064050166070L, var3)
                     + a<"h">(15743, 6495481943105659093L ^ var3);
                  var33.append(m44.a<"m">(new Object[]{var12, var46}, 8845505060884905825L, var3));
               }

               var48 = m44.a<"r">(var5, new Object[]{var10}, 9055663900887348751L, var3);
            }

            try {
               var10001 = var32;
            } catch (n9 var39) {
               boolean var54 = false;
               throw m44.a<"m">(var39, 9077542243855463941L, var3);
            }
         }

         label136: {
            label123: {
               try {
                  if (var10001 != null) {
                     break label136;
                  }

                  if (var48 == 0) {
                     break label123;
                  }
               } catch (n9 var38) {
                  boolean var55 = false;
                  throw m44.a<"m">(var38, 9077542243855463941L, var3);
               }

               var47 = (char)(var1.nextInt(c<"n">(21235, 5892436535842205839L ^ var3)) + c<"n">(8292, 7103301833838658051L ^ var3));

               try {
                  if (var3 <= 0L) {
                     return var33.toString();
                  }

                  if (var32 == null) {
                     break label121;
                  }
               } catch (n9 var37) {
                  boolean var56 = false;
                  throw m44.a<"m">(var37, 9077542243855463941L, var3);
               }
            }

            try {
               var48 = (char)(var1.nextInt(c<"n">(487, 3836132037072036759L ^ var3)) + c<"n">(9227, 6283528494997669489L ^ var3));
            } catch (n9 var36) {
               boolean var57 = false;
               throw m44.a<"m">(var36, 9077542243855463941L, var3);
            }
         }

         var47 = var48;
      }

      var33.append((char)c<"n">(17137, 1127249619229827220L ^ var3));
      var33.append(var47);
      return var33.toString();
   }

   public static String q(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = ab ^ var1;
      return m44.a<"o">(6792673799393522239L, var1);
   }

   public static String E(Object[] param0) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 6
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 5
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast java/lang/String
      // 01d: astore 4
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/lang/Boolean
      // 025: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 028: istore 2
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Boolean
      // 02f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 032: istore 1
      // 033: dup
      // 034: bipush 5
      // 035: aaload
      // 036: checkcast java/util/Random
      // 039: astore 3
      // 03a: dup
      // 03b: bipush 6
      // 03d: aaload
      // 03e: checkcast java/lang/Long
      // 041: invokevirtual java/lang/Long.longValue ()J
      // 044: lstore 7
      // 046: pop
      // 047: getstatic com/zelix/lkc.ab J
      // 04a: lload 7
      // 04c: lxor
      // 04d: lstore 7
      // 04f: lload 7
      // 051: dup2
      // 052: ldc2_w 14379630980305
      // 055: lxor
      // 056: lstore 9
      // 058: pop2
      // 059: new java/lang/StringBuilder
      // 05c: dup
      // 05d: invokespecial java/lang/StringBuilder.<init> ()V
      // 060: iload 6
      // 062: ldc2_w -8581981491082140311
      // 065: lload 7
      // 067: invokedynamic k (IJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06f: iload 5
      // 071: ldc2_w -8581981491082140311
      // 074: lload 7
      // 076: invokedynamic k (IJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: sipush 17027
      // 07e: ldc2_w 5958111200902877548
      // 081: lload 7
      // 083: lxor
      // 084: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: bipush 4
      // 08a: lload 9
      // 08c: sipush 27817
      // 08f: ldc2_w 7536774359040573257
      // 092: lload 7
      // 094: lxor
      // 095: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: bipush 5
      // 09b: anewarray 221
      // 09e: dup_x1
      // 09f: swap
      // 0a0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a3: bipush 4
      // 0a4: swap
      // 0a5: aastore
      // 0a6: dup_x2
      // 0a7: dup_x2
      // 0a8: pop
      // 0a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ac: bipush 3
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b4: bipush 2
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x1
      // 0b8: swap
      // 0b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bc: bipush 1
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x1
      // 0c0: swap
      // 0c1: bipush 0
      // 0c2: swap
      // 0c3: aastore
      // 0c4: ldc2_w -8102372838093705658
      // 0c7: lload 7
      // 0c9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d4: astore 12
      // 0d6: bipush 0
      // 0d7: istore 13
      // 0d9: ldc2_w -8151771903088519535
      // 0dc: lload 7
      // 0de: invokedynamic k (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: bipush 0
      // 0e4: istore 14
      // 0e6: astore 11
      // 0e8: iload 14
      // 0ea: aload 4
      // 0ec: invokevirtual java/lang/String.length ()I
      // 0ef: if_icmpge 106
      // 0f2: iload 13
      // 0f4: aload 4
      // 0f6: iload 14
      // 0f8: invokevirtual java/lang/String.charAt (I)C
      // 0fb: iadd
      // 0fc: istore 13
      // 0fe: iinc 14 1
      // 101: aload 11
      // 103: ifnull 0e8
      // 106: lload 7
      // 108: lconst_0
      // 109: lcmp
      // 10a: iflt 101
      // 10d: aload 12
      // 10f: ldc2_w -7873633809177426665
      // 112: lload 7
      // 114: invokedynamic k (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: ldc2_w -7786204159120817993
      // 11c: lload 7
      // 11e: invokedynamic k (JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: astore 14
      // 125: aload 14
      // 127: ldc2_w -7873633809177426665
      // 12a: lload 7
      // 12c: invokedynamic k (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: iload 13
      // 133: i2l
      // 134: ladd
      // 135: lstore 15
      // 137: new java/lang/StringBuilder
      // 13a: dup
      // 13b: invokespecial java/lang/StringBuilder.<init> ()V
      // 13e: astore 17
      // 140: lload 15
      // 142: ldc2_w -7983766897951621485
      // 145: lload 7
      // 147: invokedynamic k (JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: astore 18
      // 14e: aload 17
      // 150: aload 18
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: pop
      // 156: iload 2
      // 157: aload 11
      // 159: lload 7
      // 15b: lconst_0
      // 15c: lcmp
      // 15d: iflt 1b7
      // 160: ifnonnull 1b5
      // 163: ifeq 1b4
      // 166: goto 174
      // 169: ldc2_w -8324985993516382325
      // 16c: lload 7
      // 16e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: aload 3
      // 175: sipush 487
      // 178: ldc2_w 3836204901976592921
      // 17b: lload 7
      // 17d: lxor
      // 17e: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: invokevirtual java/util/Random.nextInt (I)I
      // 186: sipush 27694
      // 189: ldc2_w 6419253685427748824
      // 18c: lload 7
      // 18e: lxor
      // 18f: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: iadd
      // 195: i2c
      // 196: istore 19
      // 198: aload 17
      // 19a: sipush 10482
      // 19d: ldc2_w 5399283313023154945
      // 1a0: lload 7
      // 1a2: lxor
      // 1a3: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1ab: pop
      // 1ac: aload 17
      // 1ae: iload 19
      // 1b0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1b3: pop
      // 1b4: iload 1
      // 1b5: aload 11
      // 1b7: ifnonnull 1fb
      // 1ba: ifeq 232
      // 1bd: goto 1cb
      // 1c0: ldc2_w -8324985993516382325
      // 1c3: lload 7
      // 1c5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: aload 3
      // 1cc: sipush 487
      // 1cf: ldc2_w 3836204901976592921
      // 1d2: lload 7
      // 1d4: lxor
      // 1d5: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: invokevirtual java/util/Random.nextInt (I)I
      // 1dd: sipush 19798
      // 1e0: ldc2_w 4133680535305297592
      // 1e3: lload 7
      // 1e5: lxor
      // 1e6: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: iadd
      // 1ec: i2c
      // 1ed: goto 1fb
      // 1f0: ldc2_w -8324985993516382325
      // 1f3: lload 7
      // 1f5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: athrow
      // 1fb: istore 19
      // 1fd: lload 7
      // 1ff: lconst_0
      // 200: lcmp
      // 201: iflt 21c
      // 204: iload 2
      // 205: ifne 22a
      // 208: aload 17
      // 20a: sipush 10482
      // 20d: ldc2_w 5399283313023154945
      // 210: lload 7
      // 212: lxor
      // 213: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 21b: pop
      // 21c: goto 22a
      // 21f: ldc2_w -8324985993516382325
      // 222: lload 7
      // 224: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: aload 17
      // 22c: iload 19
      // 22e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 231: pop
      // 232: aload 17
      // 234: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 237: areturn
   }

   String O(Object[] param1) {
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
      // 0e: checkcast [Ljava/lang/String;
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/lkc.ab J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -6981012144733288624
      // 1d: lload 2
      // 1e: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: new java/lang/StringBuilder
      // 26: dup
      // 27: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a: astore 6
      // 2c: bipush 0
      // 2d: istore 7
      // 2f: astore 5
      // 31: iload 7
      // 33: aload 4
      // 35: arraylength
      // 36: if_icmpge a6
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: iflt 4f
      // 3f: aload 6
      // 41: aload 4
      // 43: iload 7
      // 45: aaload
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49: aload 5
      // 4b: ifnonnull ae
      // 4e: pop
      // 4f: aload 5
      // 51: lload 2
      // 52: lconst_0
      // 53: lcmp
      // 54: iflt a3
      // 57: ifnonnull a1
      // 5a: goto 67
      // 5d: ldc2_w -7082238563932137910
      // 60: lload 2
      // 61: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: iload 7
      // 69: aload 4
      // 6b: arraylength
      // 6c: bipush 1
      // 6d: isub
      // 6e: if_icmpge 9e
      // 71: goto 7e
      // 74: ldc2_w -7082238563932137910
      // 77: lload 2
      // 78: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 6
      // 80: sipush 11933
      // 83: ldc2_w 6252005489121727357
      // 86: lload 2
      // 87: lxor
      // 88: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lkc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: pop
      // 91: goto 9e
      // 94: ldc2_w -7082238563932137910
      // 97: lload 2
      // 98: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: iinc 7 1
      // a1: aload 5
      // a3: ifnull 31
      // a6: lload 2
      // a7: lconst_0
      // a8: lcmp
      // a9: iflt 39
      // ac: aload 6
      // ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b1: areturn
   }

   public String f(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 4
      // 01b: pop
      // 01c: getstatic com/zelix/lkc.ab J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 111725716725047
      // 027: lxor
      // 028: lstore 6
      // 02a: pop2
      // 02b: ldc2_w 2480737525503080995
      // 02e: lload 2
      // 02f: invokedynamic i (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: astore 8
      // 036: aload 5
      // 038: aload 8
      // 03a: ifnonnull 083
      // 03d: ifnull 074
      // 040: goto 04d
      // 043: ldc2_w 2361568863787363129
      // 046: lload 2
      // 047: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: aload 5
      // 04f: aload 8
      // 051: ifnonnull 083
      // 054: goto 061
      // 057: ldc2_w 2361568863787363129
      // 05a: lload 2
      // 05b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: invokevirtual java/lang/String.length ()I
      // 064: ifne 084
      // 067: goto 074
      // 06a: ldc2_w 2361568863787363129
      // 06d: lload 2
      // 06e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: ldc ""
      // 076: goto 083
      // 079: ldc2_w 2361568863787363129
      // 07c: lload 2
      // 07d: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: areturn
      // 084: new java/lang/StringBuilder
      // 087: dup
      // 088: invokespecial java/lang/StringBuilder.<init> ()V
      // 08b: astore 9
      // 08d: new java/util/StringTokenizer
      // 090: dup
      // 091: aload 5
      // 093: ldc ","
      // 095: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 098: astore 10
      // 09a: aload 10
      // 09c: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 09f: ifeq 12f
      // 0a2: aload 10
      // 0a4: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0a7: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0aa: lload 2
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: iflt 134
      // 0b0: astore 11
      // 0b2: aload 9
      // 0b4: aload 11
      // 0b6: lload 6
      // 0b8: aload 4
      // 0ba: bipush 3
      // 0bb: anewarray 221
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 2
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x2
      // 0c4: dup_x2
      // 0c5: pop
      // 0c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c9: bipush 1
      // 0ca: swap
      // 0cb: aastore
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 0
      // 0cf: swap
      // 0d0: aastore
      // 0d1: ldc2_w 2773734099394965555
      // 0d4: lload 2
      // 0d5: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: aload 8
      // 0df: ifnonnull 131
      // 0e2: aload 8
      // 0e4: ifnonnull 129
      // 0e7: goto 0f4
      // 0ea: ldc2_w 2361568863787363129
      // 0ed: lload 2
      // 0ee: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: pop
      // 0f5: aload 10
      // 0f7: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 0fa: ifeq 12a
      // 0fd: goto 10a
      // 100: ldc2_w 2361568863787363129
      // 103: lload 2
      // 104: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: aload 9
      // 10c: sipush 7228
      // 10f: ldc2_w 7816509491197353134
      // 112: lload 2
      // 113: lxor
      // 114: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/lkc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c: goto 129
      // 11f: ldc2_w 2361568863787363129
      // 122: lload 2
      // 123: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: pop
      // 12a: aload 8
      // 12c: ifnull 09a
      // 12f: aload 9
      // 131: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 134: areturn
   }

   public lkc(long var1) {
      var1 = ab ^ var1;
      super();
      m44.a<"v">(this, false, 663474087063863905L, var1);
      m44.a<"v">(this, false, 1344581108007401608L, var1);
      m44.a<"v">(this, false, 1300886097038532792L, var1);
   }

   public abstract boolean C();

   public abstract void S(Object[] var1);

   static String B(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:48 from source 45_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 2
      // 019: pop
      // 01a: getstatic com/zelix/lkc.ab J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: ldc2_w -1859894295439245698
      // 023: lload 3
      // 024: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: aload 1
      // 02a: ldc2_w -408562446386713096
      // 02d: lload 3
      // 02e: invokedynamic l (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: lstore 6
      // 035: bipush 0
      // 036: istore 8
      // 038: astore 5
      // 03a: bipush 0
      // 03b: istore 9
      // 03d: iload 9
      // 03f: aload 2
      // 040: invokevirtual java/lang/String.length ()I
      // 043: if_icmpge 059
      // 046: iload 8
      // 048: aload 2
      // 049: iload 9
      // 04b: invokevirtual java/lang/String.charAt (I)C
      // 04e: iadd
      // 04f: istore 8
      // 051: iinc 9 1
      // 054: aload 5
      // 056: ifnull 03d
      // 059: lload 3
      // 05a: lconst_0
      // 05b: lcmp
      // 05c: ifle 054
      // 05f: lload 6
      // 061: iload 8
      // 063: i2l
      // 064: lsub
      // 065: lstore 9
      // 067: lload 9
      // 069: ldc2_w -442281762007722372
      // 06c: lload 3
      // 06d: invokedynamic l (JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: sipush 23585
      // 075: ldc2_w 88726586019276601
      // 078: lload 3
      // 079: lxor
      // 07a: invokedynamic n (IJ)I bsm=com/zelix/lkc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: ldc2_w -468653146353409863
      // 082: lload 3
      // 083: invokedynamic l (Ljava/lang/Object;IJJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: ldc2_w -442281762007722372
      // 08b: lload 3
      // 08c: invokedynamic l (JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: astore 11
      // 093: new java/lang/StringBuilder
      // 096: dup
      // 097: invokespecial java/lang/StringBuilder.<init> ()V
      // 09a: astore 12
      // 09c: aload 11
      // 09e: invokevirtual java/lang/String.length ()I
      // 0a1: bipush 3
      // 0a2: if_icmple 0f0
      // 0a5: aload 11
      // 0a7: invokevirtual java/lang/String.length ()I
      // 0aa: bipush 3
      // 0ab: isub
      // 0ac: istore 13
      // 0ae: aload 11
      // 0b0: iload 13
      // 0b2: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0b5: astore 14
      // 0b7: aload 12
      // 0b9: aload 14
      // 0bb: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0be: i2c
      // 0bf: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c2: pop
      // 0c3: aload 11
      // 0c5: bipush 0
      // 0c6: iload 13
      // 0c8: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0cb: lload 3
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: iflt 10a
      // 0d1: astore 11
      // 0d3: aload 5
      // 0d5: ifnonnull 0fc
      // 0d8: aload 5
      // 0da: ifnull 09c
      // 0dd: lload 3
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: ifle 0d3
      // 0e3: goto 0f0
      // 0e6: ldc2_w -1974564543968448668
      // 0e9: lload 3
      // 0ea: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 12
      // 0f2: aload 11
      // 0f4: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0f7: i2c
      // 0f8: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0fb: pop
      // 0fc: aload 12
      // 0fe: ldc2_w -1904636541277423159
      // 101: lload 3
      // 102: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10a: areturn
   }

   public abstract void c(Object[] var1);

   abstract void K(Object[] var1);

   public abstract void U(Object[] var1);

   private static ui[] D(Object[] var0) {
      String var3 = (String)var0[0];
      long var1 = (Long)var0[1];
      List var4 = (List)var0[2];
      var1 = ab ^ var1;
      long var5 = var1 ^ 3453467192232L;
      int[] var10000 = m44.a<"h">(-6893790017380141030L, var1);
      ui[] var8 = new ui[var4.size()];
      int[] var7 = var10000;
      List var9 = m44.a<"h">(new Object[]{var5, var3}, -4991722522047012175L, var1);
      int var10 = 0;

      label34:
      while (var10 < var4.size()) {
         int var11 = (Integer)var4.get(var10);
         String var12 = (String)var9.get(var11);

         do {
            try {
               if (var1 > 0L) {
                  if (var7 != null) {
                     return var8;
                  }

                  var8[var10] = new ui(var11, ((String)var9.get(var11)).charAt(0));
                  var10++;
               }

               if (var7 == null) {
                  continue label34;
               }
            } catch (n9 var13) {
               throw m44.a<"h">(var13, -6702212226808239872L, var1);
            }
         } while (var1 < 0L);
         break;
      }

      return var8;
   }

   static {
      long var31 = ab ^ 31959415905223L;
      long var33 = var31 ^ 3961054689030L;
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var23 = 1; var23 < 8; var23++) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[10];
      int var27 = 0;
      String var26 = "\u000fVÇH\u0010ú&©5gg râ#\u0097p\u0007iem\u0004\u000b\u0086¡\u0095\u008bëyV\u0006\u0087\u0096MkÀ3=\u0016Bbå\u0001)a#L³ö\r.\u00ad+¼döÕ©?P6\u001c\u0095yéX\u009c\u000b¥<e\u008aO\u0093\u001bÖ\u008a\u001cW\u0084\u0001\u0014\u0093¤Ôí\u009d\u001d\u0003=\u0017;¸ï&;Úç|Â}\u008f\u0092¦iº4Eó\u0087c¯ïLé\u001f\u007f7ãJº\u009a#$ü\u008c© >\u0010DüjF\u00ad%NpåR7»W\u0087EP\u0010\f¿x\u0006ËP¥Õ\u0001ÄyèjðQÐ\u0010ä,1H\u0084-µY5$èî\fêìªXj\u0013<\u0095\u0005æÈï\u0018¥¥\u0090çÀ\u0012\u009bwñ\u0087MÍo\u0080ù¿Z\u0097ÍI\fQ\"°\u008b\u007feu>\tVS¯÷\u000fêð\u0016\u0091ÙvÁ\u0081¼H;\u001f!g%ÏQ¡ÀXT\u0007gúùô*\u0085!Ñõh\u0087F\u001b¼\u0089¸ð.kaîu(½öOÊàè~Ð\u000bý\u0080> í\u0002£g\u001e\u0003\u0096VØæz\f\u0097¿\u0099`³Ï¹ó\u008d\u0016%)Ú\u001b-(.,I\u001a¤W²`²\u009aDcHVè(½¶Î÷Ç-IA\u00062Ô\u0016\u0096Ãup¦3¥D\n\u0082\u0003×";
      int var28 = "\u000fVÇH\u0010ú&©5gg râ#\u0097p\u0007iem\u0004\u000b\u0086¡\u0095\u008bëyV\u0006\u0087\u0096MkÀ3=\u0016Bbå\u0001)a#L³ö\r.\u00ad+¼döÕ©?P6\u001c\u0095yéX\u009c\u000b¥<e\u008aO\u0093\u001bÖ\u008a\u001cW\u0084\u0001\u0014\u0093¤Ôí\u009d\u001d\u0003=\u0017;¸ï&;Úç|Â}\u008f\u0092¦iº4Eó\u0087c¯ïLé\u001f\u007f7ãJº\u009a#$ü\u008c© >\u0010DüjF\u00ad%NpåR7»W\u0087EP\u0010\f¿x\u0006ËP¥Õ\u0001ÄyèjðQÐ\u0010ä,1H\u0084-µY5$èî\fêìªXj\u0013<\u0095\u0005æÈï\u0018¥¥\u0090çÀ\u0012\u009bwñ\u0087MÍo\u0080ù¿Z\u0097ÍI\fQ\"°\u008b\u007feu>\tVS¯÷\u000fêð\u0016\u0091ÙvÁ\u0081¼H;\u001f!g%ÏQ¡ÀXT\u0007gúùô*\u0085!Ñõh\u0087F\u001b¼\u0089¸ð.kaîu(½öOÊàè~Ð\u000bý\u0080> í\u0002£g\u001e\u0003\u0096VØæz\f\u0097¿\u0099`³Ï¹ó\u008d\u0016%)Ú\u001b-(.,I\u001a¤W²`²\u009aDcHVè(½¶Î÷Ç-IA\u00062Ô\u0016\u0096Ãup¦3¥D\n\u0082\u0003×"
         .length();
      char var25 = 16;
      int var38 = -1;

      label81:
      while (true) {
         String var39 = var26.substring(++var38, var38 + var25);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var22.doFinal(var39.getBytes("ISO-8859-1"));
            String var55 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var29[var27++] = var55;
                  if ((var38 += var25) >= var28) {
                     cb = var29;
                     db = new String[10];
                     kb = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[25];
                     int var14 = 0;
                     String var15 = "Ç\u0095ºÍZºû\u0093MyÞ³óåäëÍ½ù§\u0084ÿRÊ@\"N\u0094_\u0006ZÍY.N\u0019%ªÀÃòÆçô¾_\u0011;\u0010ñ`ÅÜaç\u0007Ö£ãN·q?}^ç(v¨®Ã\u009fHé{\u008f#BÒ»4ªîå¶\u001eøÖ÷Yqj¤\u0003ñ\u0086Ö³ëÑ¼\u001eWOi>ç\u008f¤«xû÷~>L'¼Ä¨#ÁÌby<2ý.fi³*Ö,\u0003a®\u001eF5\bÝ&\u0005·³\u0002ì\u0088\u0087\u009f\u001dÔÖs»e9a4R\u0014/ß¬ªë\u009cCs.\fÓ~ëPáôÚË\u00944\u0084";
                     int var16 = "Ç\u0095ºÍZºû\u0093MyÞ³óåäëÍ½ù§\u0084ÿRÊ@\"N\u0094_\u0006ZÍY.N\u0019%ªÀÃòÆçô¾_\u0011;\u0010ñ`ÅÜaç\u0007Ö£ãN·q?}^ç(v¨®Ã\u009fHé{\u008f#BÒ»4ªîå¶\u001eøÖ÷Yqj¤\u0003ñ\u0086Ö³ëÑ¼\u001eWOi>ç\u008f¤«xû÷~>L'¼Ä¨#ÁÌby<2ý.fi³*Ö,\u0003a®\u001eF5\bÝ&\u0005·³\u0002ì\u0088\u0087\u009f\u001dÔÖs»e9a4R\u0014/ß¬ªë\u009cCs.\fÓ~ëPáôÚË\u00944\u0084"
                        .length();
                     byte var13 = 0;

                     label63:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var42 = var17;
                        var10001 = var14++;
                        long var59 = ((long)var18[0] & 255L) << 56
                           | ((long)var18[1] & 255L) << 48
                           | ((long)var18[2] & 255L) << 40
                           | ((long)var18[3] & 255L) << 32
                           | ((long)var18[4] & 255L) << 24
                           | ((long)var18[5] & 255L) << 16
                           | ((long)var18[6] & 255L) << 8
                           | (long)var18[7] & 255L;
                        byte var65 = -1;

                        while (true) {
                           long var19 = var59;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)((int)(var19 >>> 56)),
                                 (byte)((int)(var19 >>> 48)),
                                 (byte)((int)(var19 >>> 40)),
                                 (byte)((int)(var19 >>> 32)),
                                 (byte)((int)(var19 >>> 24)),
                                 (byte)((int)(var19 >>> 16)),
                                 (byte)((int)(var19 >>> 8)),
                                 (byte)((int)var19)
                              }
                           );
                           long var70 = ((long)var21[0] & 255L) << 56
                              | ((long)var21[1] & 255L) << 48
                              | ((long)var21[2] & 255L) << 40
                              | ((long)var21[3] & 255L) << 32
                              | ((long)var21[4] & 255L) << 24
                              | ((long)var21[5] & 255L) << 16
                              | ((long)var21[6] & 255L) << 8
                              | (long)var21[7] & 255L;
                           switch (var65) {
                              case 0:
                                 var42[var10001] = var70;
                                 if (var13 >= var16) {
                                    ib = var17;
                                    jb = new Integer[25];
                                    qb = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[5];
                                    int var3 = 0;
                                    String var4 = "g\u0094}O-\u009d\u0097\u0004¥þÉ\u0087¦ÄóR\bj'º\u0087Ei\u0094";
                                    int var5 = "g\u0094}O-\u009d\u0097\u0004¥þÉ\u0087¦ÄóR\bj'º\u0087Ei\u0094".length();
                                    byte var2 = 0;

                                    label47:
                                    while (true) {
                                       int var51 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
                                       long[] var44 = var6;
                                       var51 = var3++;
                                       long var62 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var68 = -1;

                                       while (true) {
                                          long var8 = var62;
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
                                          var70 = ((long)var10[0] & 255L) << 56
                                             | ((long)var10[1] & 255L) << 48
                                             | ((long)var10[2] & 255L) << 40
                                             | ((long)var10[3] & 255L) << 32
                                             | ((long)var10[4] & 255L) << 24
                                             | ((long)var10[5] & 255L) << 16
                                             | ((long)var10[6] & 255L) << 8
                                             | (long)var10[7] & 255L;
                                          switch (var68) {
                                             case 0:
                                                var44[var51] = var70;
                                                if (var2 >= var5) {
                                                   ob = var6;
                                                   pb = new Long[5];
                                                   S = o9.f(var33);
                                                   F = a<"h">(4450, 6988891410963265829L ^ var31).toCharArray();
                                                   M = a<"h">(9101, 1077367526493768647L ^ var31).toCharArray();
                                                   o = a<"h">(11532, 3058171142871795023L ^ var31).charAt(0);
                                                   r = m44.a<"n">(-3699815365856352315L, var31)[m44.a<"n">(-3699815365856352315L, var31).length - 2];
                                                   L = m44.a<"n">(-3699815365856352315L, var31)[m44.a<"n">(-3699815365856352315L, var31).length - 1];
                                                   z = new int[0];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var44[var51] = var70;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "N\u001fÓxë\u0097i¸<\u0005Ey\u0098 à\u007f";
                                                var5 = "N\u001fÓxë\u0097i¸<\u0005Ey\u0098 à\u007f".length();
                                                var2 = 0;
                                          }

                                          byte var53 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
                                          var44 = var6;
                                          var51 = var3++;
                                          var62 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var68 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var42[var10001] = var70;
                                 if (var13 < var16) {
                                    continue label63;
                                 }

                                 var15 = "(\u001cCMW\u001fb&EM¢\u0004b©\u0010Ë";
                                 var16 = "(\u001cCMW\u001fb&EM¢\u0004b©\u0010Ë".length();
                                 var13 = 0;
                           }

                           byte var50 = var13;
                           var13 += 8;
                           var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                           var42 = var17;
                           var10001 = var14++;
                           var59 = ((long)var18[0] & 255L) << 56
                              | ((long)var18[1] & 255L) << 48
                              | ((long)var18[2] & 255L) << 40
                              | ((long)var18[3] & 255L) << 32
                              | ((long)var18[4] & 255L) << 24
                              | ((long)var18[5] & 255L) << 16
                              | ((long)var18[6] & 255L) << 8
                              | (long)var18[7] & 255L;
                           var65 = 0;
                        }
                     }
                  }

                  var25 = var26.charAt(var38);
                  break;
               default:
                  var29[var27++] = var55;
                  if ((var38 += var25) < var28) {
                     var25 = var26.charAt(var38);
                     continue label81;
                  }

                  var26 = "jÉ|¥¼ÁèÎ:Þ'g²×\u001c \u000e2\u008fÚB-cßS\u001cÂ$¾\u0007&H\\Ù7uB?\u008f\u008e\u008exbò¨{\rÇîHê\u0002\báÑ÷\u000b\u0006[\u0004[5®\u0081ÉÐaÖÑäë+g£<0¡Ib`m}¢\u0096¥\b\u0092Ys\f\u001b\u0012Ì;.j\u0086ôÏÌ«\u0089x\u001eíÂ_\u001f?4b \u0010\u008bä©\u001a%æHÆq§NÉ\u0082\u008c-\u0094";
                  var28 = "jÉ|¥¼ÁèÎ:Þ'g²×\u001c \u000e2\u008fÚB-cßS\u001cÂ$¾\u0007&H\\Ù7uB?\u008f\u008e\u008exbò¨{\rÇîHê\u0002\báÑ÷\u000b\u0006[\u0004[5®\u0081ÉÐaÖÑäë+g£<0¡Ib`m}¢\u0096¥\b\u0092Ys\f\u001b\u0012Ì;.j\u0086ôÏÌ«\u0089x\u001eíÂ_\u001f?4b \u0010\u008bä©\u001a%æHÆq§NÉ\u0082\u008c-\u0094"
                     .length();
                  var25 = 'p';
                  var38 = -1;
            }

            var39 = var26.substring(++var38, var38 + var25);
            var10001 = 0;
         }
      }
   }

   void o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      m44.a<"s">(this, true, 9106480572579482837L, var2);
   }

   public static String p(Object[] var0) {
      long var2 = (Long)var0[0];
      long var4 = (Long)var0[1];
      long var6 = (Long)var0[2];
      long var8 = (Long)var0[3];
      long var10 = (Long)var0[4];
      long var12 = (Long)var0[5];
      String var1 = (String)var0[6];
      var12 = ab ^ var12;
      long var14 = var12 ^ 122272929103448L;
      StringBuilder var16 = new StringBuilder();
      Object[] var10005 = new Object[]{null, var1, var14};
      var10005[0] = var2;
      var16.append(m44.a<"o">(var10005, -2754385072777415652L, var12));
      var10005 = new Object[]{null, var1, var14};
      var10005[0] = var4;
      var16.append(m44.a<"o">(var10005, -2754385072777415652L, var12));
      var10005 = new Object[]{null, var1, var14};
      var10005[0] = var6;
      var16.append(m44.a<"o">(var10005, -2754385072777415652L, var12));
      var10005 = new Object[]{null, var1, var14};
      var10005[0] = var8;
      var16.append(m44.a<"o">(var10005, -2754385072777415652L, var12));
      var10005 = new Object[]{null, var1, var14};
      var10005[0] = var10;
      var16.append(m44.a<"o">(var10005, -2754385072777415652L, var12));
      return var16.toString();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11623;
      if (db[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])eb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               eb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/lkc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = cb[var5].getBytes("ISO-8859-1");
         db[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return db[var5];
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
         throw new RuntimeException("com/zelix/lkc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21154;
      if (jb[var3] == null) {
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
         long var5 = ib[var3];
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
         Object[] var9 = (Object[])kb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               kb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lkc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
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
         throw new RuntimeException("com/zelix/lkc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3237;
      if (pb[var3] == null) {
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
         long var5 = ob[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lkc", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         pb[var3] = var15;
      }

      return pb[var3];
   }

   private static long e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = e(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/lkc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
