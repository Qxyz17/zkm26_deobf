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

public class qg implements Comparable {
   private String L;
   private final boolean b;
   private iu n;
   private iu w;
   private final String P;
   private final String v;
   private final boolean t;
   private int Z;
   private final iz K;
   private String N;
   private final String B;
   private String z;
   private iu D;
   private static final long a = ess.a(-262240839925772419L, -3210403746872864198L, MethodHandles.lookup().lookupClass()).a(208520985994332L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   @Override
   public int hashCode() {
      long var1 = a ^ 34780625187314L;
      return x44.a<"k">(this, -6777441076517915854L, var1).hashCode() ^ x44.a<"k">(this, -4749839050895007347L, var1).hashCode();
   }

   public String o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 7448413961826204056L, var2);
   }

   public iu M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, -5170527484082696239L, var2);
   }

   public int Q(Object[] param1) {
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
      // 0e: checkcast com/zelix/qg
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/qg.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 30062172927637
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 31369369019826
      // 26: lxor
      // 27: lstore 7
      // 29: dup2
      // 2a: ldc2_w 120133000225809
      // 2d: lxor
      // 2e: lstore 9
      // 30: pop2
      // 31: ldc2_w -8590139873608853845
      // 34: lload 2
      // 35: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: aload 0
      // 3b: ldc2_w -8530946268046550184
      // 3e: lload 2
      // 3f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: aload 4
      // 46: lload 7
      // 48: bipush 1
      // 49: anewarray 478
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 0
      // 53: swap
      // 54: aastore
      // 55: ldc2_w -8503412525277042846
      // 58: lload 2
      // 59: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 61: istore 12
      // 63: istore 11
      // 65: iload 12
      // 67: iload 11
      // 69: ifeq b5
      // 6c: ifne b3
      // 6f: goto 7c
      // 72: ldc2_w -8591463293257175072
      // 75: lload 2
      // 76: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: aload 0
      // 7d: ldc2_w -7840088573796320920
      // 80: lload 2
      // 81: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: lload 5
      // 88: invokevirtual com/zelix/iz.w (J)Ljava/lang/String;
      // 8b: aload 4
      // 8d: lload 9
      // 8f: bipush 1
      // 90: anewarray 478
      // 93: dup_x2
      // 94: dup_x2
      // 95: pop
      // 96: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 99: bipush 0
      // 9a: swap
      // 9b: aastore
      // 9c: ldc2_w -8534540805459602854
      // 9f: lload 2
      // a0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // a8: ireturn
      // a9: ldc2_w -8591463293257175072
      // ac: lload 2
      // ad: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: iload 12
      // b5: ireturn
   }

   public _ow m(Object[] var1) {
      long var3 = (Long)var1[0];
      _8c var2 = (_8c)var1[1];
      List var5 = (List)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 118346624203811L;
      my var8 = x44.a<"i">(var2, new Object[]{x44.a<"m">(this, 7893798716186353322L, var3), var5, var6}, 7585694573055988609L, var3);
      return new _ow(b<"t">(32018, 1065881831111046468L ^ var3), var8);
   }

   public _ow h(Object[] var1) {
      _8c var4 = (_8c)var1[0];
      List var5 = (List)var1[1];
      long var2 = (Long)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 70997253220650L;
      long var8 = var2 ^ 53235055299439L;
      long var10 = var2 ^ 114365086538056L;
      long var12 = var2 ^ 13647722930370L;
      if (x44.a<"n">(this, 1144762987805194315L, var2)) {
         my var16 = x44.a<"j">(var4, new Object[]{x44.a<"n">(this, 1452372673273258952L, var2), var5, var10}, 877866194235373290L, var2);
         return new _ow(b<"t">(32018, 1065882247553339439L ^ var2), var16);
      } else {
         mr var14 = x44.a<"j">(
            var4,
            new Object[]{
               x44.a<"n">(this, 904435442565834455L, var2).k(var8),
               x44.a<"n">(this, 904435442565834455L, var2).w(var6),
               x44.a<"n">(this, 904435442565834455L, var2).H(),
               var5,
               x44.a<"n">(this, 904435442565834455L, var2),
               var12
            },
            672884326157870807L,
            var2
         );
         return new _ow(b<"t">(7282, 5344708924720165194L ^ var2), var14);
      }
   }

   public boolean l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"i">(this, -6390539784890411914L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"u">(var4, -5130461765700542488L, var2);
      }

      return false;
   }

   public qg(long var1, iz var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 129592486221320L;
      long var6 = var1 ^ 5658830845005L;
      long var8 = var1 ^ 1271246487606L;
      super();
      this.K = var3;
      this.P = var3.w(var4);
      this.v = var3.H();
      this.B = var3.k(var6);
      x44.a<"s">(this, x44.a<"h">(var3, new Object[]{var8}, -5759777300304793379L, var1), -5255511082721380688L, var1);
      this.t = false;
      this.b = false;
   }

   public boolean A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, 2928708734461219762L, var2);
   }

   public boolean v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 8609615719526164925L, var2).equals(a<"t">(17922, 6656802062677641894L ^ var2));
   }

   public static String L(Object[] var0) {
      String var3 = (String)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      return b<"t">(22716, 1163337427831315285L ^ var1) + var3 + a<"t">(21055, 1066751611765837337L ^ var1);
   }

   public String l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 1235068108541966234L, var2);
   }

   public boolean S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -6214933272121690362L, var2).equals("Z");
   }

   public qg(iz param1, iu param2, iu param3, iu param4, Random param5, long param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/qg.a J
      // 003: lload 6
      // 005: lxor
      // 006: lstore 6
      // 008: lload 6
      // 00a: dup2
      // 00b: ldc2_w 42471244469621
      // 00e: lxor
      // 00f: lstore 8
      // 011: dup2
      // 012: ldc2_w 94936191072048
      // 015: lxor
      // 016: lstore 10
      // 018: dup2
      // 019: ldc2_w 90548603568971
      // 01c: lxor
      // 01d: lstore 12
      // 01f: dup2
      // 020: ldc2_w 42471244469621
      // 023: lxor
      // 024: lstore 14
      // 026: pop2
      // 027: ldc2_w 7514335042740912989
      // 02a: lload 6
      // 02c: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: aload 0
      // 032: invokespecial java/lang/Object.<init> ()V
      // 035: aload 0
      // 036: aload 1
      // 037: putfield com/zelix/qg.K Lcom/zelix/iz;
      // 03a: aload 0
      // 03b: aload 1
      // 03c: lload 8
      // 03e: invokevirtual com/zelix/iz.w (J)Ljava/lang/String;
      // 041: putfield com/zelix/qg.P Ljava/lang/String;
      // 044: aload 0
      // 045: aload 1
      // 046: invokevirtual com/zelix/iz.H ()Ljava/lang/String;
      // 049: putfield com/zelix/qg.v Ljava/lang/String;
      // 04c: aload 0
      // 04d: aload 1
      // 04e: lload 10
      // 050: invokevirtual com/zelix/iz.k (J)Ljava/lang/String;
      // 053: putfield com/zelix/qg.B Ljava/lang/String;
      // 056: aload 0
      // 057: aload 1
      // 058: lload 12
      // 05a: bipush 1
      // 05b: anewarray 478
      // 05e: dup_x2
      // 05f: dup_x2
      // 060: pop
      // 061: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 064: bipush 0
      // 065: swap
      // 066: aastore
      // 067: ldc2_w 8317157243444442016
      // 06a: lload 6
      // 06c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: ldc2_w 8389643148861158861
      // 074: lload 6
      // 076: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: aload 0
      // 07c: aload 2
      // 07d: ldc2_w 7527972878043684759
      // 080: lload 6
      // 082: invokedynamic v (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: aload 0
      // 088: aload 3
      // 089: ldc2_w 7607001873665744167
      // 08c: lload 6
      // 08e: invokedynamic v (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: aload 0
      // 094: aload 4
      // 096: ldc2_w 8410487182718125982
      // 099: lload 6
      // 09b: invokedynamic v (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: aload 0
      // 0a1: aload 0
      // 0a2: ldc2_w 7527972878043684759
      // 0a5: lload 6
      // 0a7: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: lload 14
      // 0ae: ldc2_w 8333870036031949976
      // 0b1: lload 6
      // 0b3: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: ldc2_w 8010291073954272986
      // 0bb: lload 6
      // 0bd: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: aload 0
      // 0c3: aload 0
      // 0c4: ldc2_w 7607001873665744167
      // 0c7: lload 6
      // 0c9: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: lload 14
      // 0d0: ldc2_w 8333870036031949976
      // 0d3: lload 6
      // 0d5: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: ldc2_w 7554606371120501586
      // 0dd: lload 6
      // 0df: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: istore 16
      // 0e6: aload 0
      // 0e7: iload 16
      // 0e9: ifne 13d
      // 0ec: ldc2_w 8410487182718125982
      // 0ef: lload 6
      // 0f1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: ifnull 137
      // 0f9: goto 107
      // 0fc: ldc2_w 7720507113177009152
      // 0ff: lload 6
      // 101: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 0
      // 108: aload 0
      // 109: ldc2_w 8410487182718125982
      // 10c: lload 6
      // 10e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: lload 14
      // 115: ldc2_w 8333870036031949976
      // 118: lload 6
      // 11a: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: ldc2_w 7736796087948070375
      // 122: lload 6
      // 124: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: goto 137
      // 12c: ldc2_w 7720507113177009152
      // 12f: lload 6
      // 131: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: aload 0
      // 138: bipush 1
      // 139: putfield com/zelix/qg.t Z
      // 13c: aload 0
      // 13d: aload 5
      // 13f: ldc2_w 8046371989397075710
      // 142: lload 6
      // 144: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: iload 16
      // 14b: ifne 18e
      // 14e: ifne 18d
      // 151: goto 15f
      // 154: ldc2_w 7720507113177009152
      // 157: lload 6
      // 159: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: ldc2_w 7597447350981833325
      // 162: lload 6
      // 164: invokedynamic l (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: iload 16
      // 16b: ifne 18e
      // 16e: goto 17c
      // 171: ldc2_w 7720507113177009152
      // 174: lload 6
      // 176: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: ifeq 191
      // 17f: goto 18d
      // 182: ldc2_w 7720507113177009152
      // 185: lload 6
      // 187: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: bipush 1
      // 18e: goto 192
      // 191: bipush 0
      // 192: putfield com/zelix/qg.b Z
      // 195: return
   }

   public String P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -2626416813564633080L, var2);
   }

   public boolean p(Object[] param1) {
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
      // 0c: getstatic com/zelix/qg.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -6694744636621633534
      // 15: lload 2
      // 16: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -4743681038276878099
      // 21: lload 2
      // 22: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: bipush 0
      // 28: invokevirtual java/lang/String.charAt (I)C
      // 2b: iload 4
      // 2d: ifne 98
      // 30: sipush 4682
      // 33: ldc2_w 2247887376058091644
      // 36: lload 2
      // 37: lxor
      // 38: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: if_icmpeq 8a
      // 40: goto 4d
      // 43: ldc2_w -6882632169401219233
      // 46: lload 2
      // 47: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: ldc2_w -4743681038276878099
      // 51: lload 2
      // 52: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: bipush 0
      // 58: invokevirtual java/lang/String.charAt (I)C
      // 5b: iload 4
      // 5d: ifne 98
      // 60: goto 6d
      // 63: ldc2_w -6882632169401219233
      // 66: lload 2
      // 67: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: sipush 2170
      // 70: ldc2_w 3768790299874890305
      // 73: lload 2
      // 74: lxor
      // 75: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: if_icmpne 9b
      // 7d: goto 8a
      // 80: ldc2_w -6882632169401219233
      // 83: lload 2
      // 84: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: bipush 1
      // 8b: goto 98
      // 8e: ldc2_w -6882632169401219233
      // 91: lload 2
      // 92: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: goto 9c
      // 9b: bipush 0
      // 9c: ireturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/qg.a J
      // 03: ldc2_w 78335652124958
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 5210565252663399981
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/qg
      // 17: iload 4
      // 19: ifeq a0
      // 1c: ifeq 9f
      // 1f: goto 2c
      // 22: ldc2_w 5206980950550376294
      // 25: lload 2
      // 26: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/qg
      // 30: astore 5
      // 32: aload 0
      // 33: ldc2_w 6267170182744443233
      // 36: lload 2
      // 37: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: aload 5
      // 3e: ldc2_w 6267170182744443233
      // 41: lload 2
      // 42: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a: iload 4
      // 4c: ifeq 84
      // 4f: ifeq 9d
      // 52: goto 5f
      // 55: ldc2_w 5206980950550376294
      // 58: lload 2
      // 59: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: ldc2_w 5268624016162872286
      // 63: lload 2
      // 64: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: aload 5
      // 6b: ldc2_w 5268624016162872286
      // 6e: lload 2
      // 6f: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 77: goto 84
      // 7a: ldc2_w 5206980950550376294
      // 7d: lload 2
      // 7e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: iload 4
      // 86: ifeq 9a
      // 89: ifeq 9d
      // 8c: goto 99
      // 8f: ldc2_w 5206980950550376294
      // 92: lload 2
      // 93: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: bipush 1
      // 9a: goto 9e
      // 9d: bipush 0
      // 9e: ireturn
      // 9f: bipush 0
      // a0: ireturn
   }

   public String N(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, -2209774556532372721L, var2).H();
   }

   public boolean W(Object[] param1) {
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
      // 0c: getstatic com/zelix/qg.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -3245121077489485342
      // 15: lload 2
      // 16: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -3473557818073919219
      // 21: lload 2
      // 22: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: bipush 0
      // 28: invokevirtual java/lang/String.charAt (I)C
      // 2b: sipush 25003
      // 2e: ldc2_w 5253857926015126136
      // 31: lload 2
      // 32: lxor
      // 33: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: iload 4
      // 3a: ifne 7a
      // 3d: if_icmpne 81
      // 40: goto 4d
      // 43: ldc2_w -3342932982133000513
      // 46: lload 2
      // 47: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: ldc2_w -3473557818073919219
      // 51: lload 2
      // 52: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: invokevirtual java/lang/String.length ()I
      // 5a: iload 4
      // 5c: ifne 7e
      // 5f: goto 6c
      // 62: ldc2_w -3342932982133000513
      // 65: lload 2
      // 66: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 2
      // 6d: goto 7a
      // 70: ldc2_w -3342932982133000513
      // 73: lload 2
      // 74: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: if_icmple 81
      // 7d: bipush 1
      // 7e: goto 82
      // 81: bipush 0
      // 82: ireturn
   }

   public _ow D(Object[] var1) {
      _8c var3 = (_8c)var1[0];
      int var4 = (Integer)var1[1];
      int var2 = (Integer)var1[2];
      List var5 = (List)var1[3];
      long var6 = ((long)var4 << 32 | (long)var2 << 32 >>> 32) ^ a;
      long var8 = var6 ^ 20470801274650L;
      long var10 = var6 ^ 131843466487159L;
      if (x44.a<"l">(this, 122011992522864153L, var6)) {
         my var13 = x44.a<"h">(var3, new Object[]{x44.a<"l">(this, 1989574303802240810L, var6), var5, var8}, 179216248590317752L, var6);
         return new _ow(b<"t">(7865, 1935300087684873682L ^ var6), var13);
      } else {
         mr var12 = x44.a<"h">(var3, new Object[]{x44.a<"l">(this, 206965075345795205L, var6), var5, var10}, 111223492613780134L, var6);
         return new _ow(b<"t">(31512, 5193167193155950719L ^ var6), var12);
      }
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 27131135329606L;
      long var4 = var2 ^ 102269993780056L;
      return x44.a<"k">(this, new Object[]{var4, (qg)var1}, -7766011629753220804L, var2);
   }

   public s3 A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new s3(x44.a<"o">(this, -7662469257657726415L, var2), x44.a<"o">(this, -7691555595085739132L, var2));
   }

   public String W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, -887218238199668372L, var2);
   }

   public hz y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 125523157433475L;
      return x44.a<"m">(this, 7826792615567263428L, var2).d(var4);
   }

   public boolean K(Object[] param1) {
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
      // 0c: getstatic com/zelix/qg.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -8315244873567737969
      // 15: lload 2
      // 16: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -7951629796882247840
      // 21: lload 2
      // 22: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: bipush 0
      // 28: invokevirtual java/lang/String.charAt (I)C
      // 2b: iload 4
      // 2d: ifne 5b
      // 30: sipush 4936
      // 33: ldc2_w 6733740089215526651
      // 36: lload 2
      // 37: lxor
      // 38: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: if_icmpne 5e
      // 40: goto 4d
      // 43: ldc2_w -8073028409509926702
      // 46: lload 2
      // 47: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: bipush 1
      // 4e: goto 5b
      // 51: ldc2_w -8073028409509926702
      // 54: lload 2
      // 55: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: goto 5f
      // 5e: bipush 0
      // 5f: ireturn
   }

   public qg(iz param1, iu param2, long param3, iu param5, iu param6, Boolean param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/qg.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 82799343648069
      // 00b: lxor
      // 00c: lstore 8
      // 00e: dup2
      // 00f: ldc2_w 65655822245632
      // 012: lxor
      // 013: lstore 10
      // 015: dup2
      // 016: ldc2_w 70046074170235
      // 019: lxor
      // 01a: lstore 12
      // 01c: dup2
      // 01d: ldc2_w 82799343648069
      // 020: lxor
      // 021: lstore 14
      // 023: pop2
      // 024: aload 0
      // 025: invokespecial java/lang/Object.<init> ()V
      // 028: aload 0
      // 029: aload 1
      // 02a: putfield com/zelix/qg.K Lcom/zelix/iz;
      // 02d: aload 0
      // 02e: aload 1
      // 02f: lload 8
      // 031: invokevirtual com/zelix/iz.w (J)Ljava/lang/String;
      // 034: putfield com/zelix/qg.P Ljava/lang/String;
      // 037: aload 0
      // 038: aload 1
      // 039: invokevirtual com/zelix/iz.H ()Ljava/lang/String;
      // 03c: putfield com/zelix/qg.v Ljava/lang/String;
      // 03f: aload 0
      // 040: aload 1
      // 041: lload 10
      // 043: invokevirtual com/zelix/iz.k (J)Ljava/lang/String;
      // 046: putfield com/zelix/qg.B Ljava/lang/String;
      // 049: aload 0
      // 04a: aload 1
      // 04b: lload 12
      // 04d: bipush 1
      // 04e: anewarray 478
      // 051: dup_x2
      // 052: dup_x2
      // 053: pop
      // 054: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 057: bipush 0
      // 058: swap
      // 059: aastore
      // 05a: ldc2_w -2640209318492431472
      // 05d: lload 3
      // 05e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: ldc2_w -2567735611856314883
      // 066: lload 3
      // 067: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: ldc2_w -4577862815899964563
      // 06f: lload 3
      // 070: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: aload 0
      // 076: aload 2
      // 077: ldc2_w -4591183853651609689
      // 07a: lload 3
      // 07b: invokedynamic v (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: istore 16
      // 082: aload 0
      // 083: aload 5
      // 085: ldc2_w -4494291126905965289
      // 088: lload 3
      // 089: invokedynamic v (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: aload 0
      // 08f: aload 6
      // 091: ldc2_w -2555686794848604242
      // 094: lload 3
      // 095: invokedynamic v (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: aload 0
      // 09b: aload 0
      // 09c: ldc2_w -4591183853651609689
      // 09f: lload 3
      // 0a0: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: lload 14
      // 0a7: ldc2_w -2623426728391646040
      // 0aa: lload 3
      // 0ab: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: ldc2_w -4099919824979656982
      // 0b3: lload 3
      // 0b4: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: aload 0
      // 0ba: aload 0
      // 0bb: ldc2_w -4494291126905965289
      // 0be: lload 3
      // 0bf: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: lload 14
      // 0c6: ldc2_w -2623426728391646040
      // 0c9: lload 3
      // 0ca: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: ldc2_w -4546604167152665758
      // 0d2: lload 3
      // 0d3: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: aload 0
      // 0d9: iload 16
      // 0db: ifne 129
      // 0de: ldc2_w -2555686794848604242
      // 0e1: lload 3
      // 0e2: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: ifnull 123
      // 0ea: goto 0f7
      // 0ed: ldc2_w -4389692701519551440
      // 0f0: lload 3
      // 0f1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: aload 0
      // 0f9: ldc2_w -2555686794848604242
      // 0fc: lload 3
      // 0fd: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: lload 14
      // 104: ldc2_w -2623426728391646040
      // 107: lload 3
      // 108: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: ldc2_w -4364283934859500073
      // 110: lload 3
      // 111: invokedynamic v (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: goto 123
      // 119: ldc2_w -4389692701519551440
      // 11c: lload 3
      // 11d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 0
      // 124: bipush 1
      // 125: putfield com/zelix/qg.t Z
      // 128: aload 0
      // 129: aload 7
      // 12b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12e: putfield com/zelix/qg.b Z
      // 131: return
   }

   public iu t(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 5036563311445537107L, var2);
   }

   public static String x(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = a ^ var2;
      return a<"t">(10078, 1505308880986941283L ^ var2) + var1;
   }

   public boolean H(Object[] param1) {
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
      // 0c: getstatic com/zelix/qg.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -7191311449457330394
      // 15: lload 2
      // 16: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -9147050170711400503
      // 21: lload 2
      // 22: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: bipush 0
      // 28: invokevirtual java/lang/String.charAt (I)C
      // 2b: sipush 25003
      // 2e: ldc2_w 5253770258384078012
      // 31: lload 2
      // 32: lxor
      // 33: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: iload 4
      // 3a: ifne 7a
      // 3d: if_icmpne 81
      // 40: goto 4d
      // 43: ldc2_w -6962613478142494597
      // 46: lload 2
      // 47: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: ldc2_w -9147050170711400503
      // 51: lload 2
      // 52: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: invokevirtual java/lang/String.length ()I
      // 5a: iload 4
      // 5c: ifne 7e
      // 5f: goto 6c
      // 62: ldc2_w -6962613478142494597
      // 65: lload 2
      // 66: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 2
      // 6d: goto 7a
      // 70: ldc2_w -6962613478142494597
      // 73: lload 2
      // 74: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: if_icmpne 81
      // 7d: bipush 1
      // 7e: goto 82
      // 81: bipush 0
      // 82: ireturn
   }

   public boolean I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"i">(this, 1970399394704173182L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"u">(var4, 343555701522932704L, var2);
      }

      return false;
   }

   public _og B(Object[] param1) {
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
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast com/zelix/t7
      // 01b: astore 5
      // 01d: pop
      // 01e: getstatic com/zelix/qg.a J
      // 021: lload 3
      // 022: lxor
      // 023: lstore 3
      // 024: lload 3
      // 025: dup2
      // 026: ldc2_w 574551397971
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 63405832320515
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w -6094821475850242808
      // 037: lload 3
      // 038: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: istore 13
      // 03f: aload 0
      // 040: ldc2_w -5388731260793967631
      // 043: lload 3
      // 044: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: ldc "I"
      // 04b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04e: iload 13
      // 050: ifeq 095
      // 053: ifne 094
      // 056: goto 063
      // 059: ldc2_w -6095740003424465853
      // 05c: lload 3
      // 05d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: aload 0
      // 064: ldc2_w -5388731260793967631
      // 067: lload 3
      // 068: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: ldc "Z"
      // 06f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 072: iload 13
      // 074: ifeq 0d3
      // 077: goto 084
      // 07a: ldc2_w -6095740003424465853
      // 07d: lload 3
      // 07e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: ifeq 0d2
      // 087: goto 094
      // 08a: ldc2_w -6095740003424465853
      // 08d: lload 3
      // 08e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: iload 2
      // 095: aload 5
      // 097: bipush 2
      // 098: istore 10
      // 09a: astore 11
      // 09c: istore 12
      // 09e: lload 6
      // 0a0: iload 12
      // 0a2: aload 11
      // 0a4: iload 10
      // 0a6: bipush 4
      // 0a7: anewarray 478
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0af: bipush 3
      // 0b0: swap
      // 0b1: aastore
      // 0b2: dup_x1
      // 0b3: swap
      // 0b4: bipush 2
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x1
      // 0b8: swap
      // 0b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bc: bipush 1
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x2
      // 0c0: dup_x2
      // 0c1: pop
      // 0c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c5: bipush 0
      // 0c6: swap
      // 0c7: aastore
      // 0c8: ldc2_w -5642769976784731467
      // 0cb: lload 3
      // 0cc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: areturn
      // 0d2: iload 2
      // 0d3: aload 5
      // 0d5: bipush 2
      // 0d6: lload 8
      // 0d8: bipush 4
      // 0d9: anewarray 478
      // 0dc: dup_x2
      // 0dd: dup_x2
      // 0de: pop
      // 0df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e2: bipush 3
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ea: bipush 2
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: bipush 1
      // 0f0: swap
      // 0f1: aastore
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f7: bipush 0
      // 0f8: swap
      // 0f9: aastore
      // 0fa: ldc2_w -6292836765934225377
      // 0fd: lload 3
      // 0fe: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: areturn
   }

   public iu j(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -6480608604405164746L, var2);
   }

   public boolean O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"h">(this, -4795838801442354530L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"t">(var4, -4742931259227563767L, var2);
      }

      return false;
   }

   public String J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, -1303763776510315920L, var2);
   }

   public _o5 H(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/_op
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/qg.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 5688261646963298450
      // 1c: lload 3
      // 1d: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 5
      // 24: aload 0
      // 25: ldc2_w 5813437402574409323
      // 28: lload 3
      // 29: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: ldc "I"
      // 30: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 33: iload 5
      // 35: ifeq 64
      // 38: ifne 67
      // 3b: goto 48
      // 3e: ldc2_w 5691863005592087001
      // 41: lload 3
      // 42: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: ldc2_w 5813437402574409323
      // 4c: lload 3
      // 4d: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: ldc "Z"
      // 54: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 57: goto 64
      // 5a: ldc2_w 5691863005592087001
      // 5d: lload 3
      // 5e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: ifeq b1
      // 67: new com/zelix/_o5
      // 6a: dup
      // 6b: aload 0
      // 6c: ldc2_w 5696388772083889179
      // 6f: lload 3
      // 70: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: ifeq 9f
      // 78: goto 85
      // 7b: ldc2_w 5691863005592087001
      // 7e: lload 3
      // 7f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: sipush 11628
      // 88: ldc2_w 55370167250016733
      // 8b: lload 3
      // 8c: lxor
      // 8d: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: goto ac
      // 95: ldc2_w 5691863005592087001
      // 98: lload 3
      // 99: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: sipush 16311
      // a2: ldc2_w 5259547061200898821
      // a5: lload 3
      // a6: lxor
      // a7: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: aload 2
      // ad: invokespecial com/zelix/_o5.<init> (ILcom/zelix/_op;)V
      // b0: areturn
      // b1: new com/zelix/_o5
      // b4: dup
      // b5: aload 0
      // b6: ldc2_w 5696388772083889179
      // b9: lload 3
      // ba: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: ifeq dc
      // c2: sipush 12775
      // c5: ldc2_w 7083861485668681030
      // c8: lload 3
      // c9: lxor
      // ca: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: goto e9
      // d2: ldc2_w 5691863005592087001
      // d5: lload 3
      // d6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: sipush 25488
      // df: ldc2_w 6306738496264804135
      // e2: lload 3
      // e3: lxor
      // e4: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e9: aload 2
      // ea: invokespecial com/zelix/_o5.<init> (ILcom/zelix/_op;)V
      // ed: areturn
   }

   public _og N(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast com/zelix/t7
      // 1c: astore 5
      // 1e: pop
      // 1f: getstatic com/zelix/qg.a J
      // 22: lload 2
      // 23: lxor
      // 24: lstore 2
      // 25: lload 2
      // 26: dup2
      // 27: ldc2_w 77712813266474
      // 2a: lxor
      // 2b: lstore 6
      // 2d: dup2
      // 2e: ldc2_w 69777302007071
      // 31: lxor
      // 32: lstore 8
      // 34: pop2
      // 35: ldc2_w 3099249874638452064
      // 38: lload 2
      // 39: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: istore 10
      // 40: aload 0
      // 41: ldc2_w 3845799237810695065
      // 44: lload 2
      // 45: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: ldc "I"
      // 4c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4f: iload 10
      // 51: ifeq 97
      // 54: ifne 95
      // 57: goto 64
      // 5a: ldc2_w 3102966659238235179
      // 5d: lload 2
      // 5e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: aload 0
      // 65: ldc2_w 3845799237810695065
      // 68: lload 2
      // 69: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: ldc "Z"
      // 70: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 73: iload 10
      // 75: ifeq ca
      // 78: goto 85
      // 7b: ldc2_w 3102966659238235179
      // 7e: lload 2
      // 7f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: ifeq c8
      // 88: goto 95
      // 8b: ldc2_w 3102966659238235179
      // 8e: lload 2
      // 8f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: iload 4
      // 97: lload 8
      // 99: aload 5
      // 9b: bipush 2
      // 9c: bipush 4
      // 9d: anewarray 478
      // a0: dup_x1
      // a1: swap
      // a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a5: bipush 3
      // a6: swap
      // a7: aastore
      // a8: dup_x1
      // a9: swap
      // aa: bipush 2
      // ab: swap
      // ac: aastore
      // ad: dup_x2
      // ae: dup_x2
      // af: pop
      // b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b3: bipush 1
      // b4: swap
      // b5: aastore
      // b6: dup_x1
      // b7: swap
      // b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bb: bipush 0
      // bc: swap
      // bd: aastore
      // be: ldc2_w 3200671035180564887
      // c1: lload 2
      // c2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: areturn
      // c8: iload 4
      // ca: lload 6
      // cc: aload 5
      // ce: bipush 2
      // cf: bipush 4
      // d0: anewarray 478
      // d3: dup_x1
      // d4: swap
      // d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // d8: bipush 3
      // d9: swap
      // da: aastore
      // db: dup_x1
      // dc: swap
      // dd: bipush 2
      // de: swap
      // df: aastore
      // e0: dup_x2
      // e1: dup_x2
      // e2: pop
      // e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e6: bipush 1
      // e7: swap
      // e8: aastore
      // e9: dup_x1
      // ea: swap
      // eb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ee: bipush 0
      // ef: swap
      // f0: aastore
      // f1: ldc2_w 3433121310173239521
      // f4: lload 2
      // f5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/_og; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fa: areturn
   }

   public _o5 A(Object[] param1) {
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
      // 04: checkcast com/zelix/_op
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/qg.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 7609506386433245839
      // 1c: lload 3
      // 1d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 5
      // 24: aload 0
      // 25: ldc2_w 8405431861200611936
      // 28: lload 3
      // 29: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: ldc "I"
      // 30: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 33: iload 5
      // 35: ifne 64
      // 38: ifne 67
      // 3b: goto 48
      // 3e: ldc2_w 7707596323535900114
      // 41: lload 3
      // 42: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: ldc2_w 8405431861200611936
      // 4c: lload 3
      // 4d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: ldc "Z"
      // 54: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 57: goto 64
      // 5a: ldc2_w 7707596323535900114
      // 5d: lload 3
      // 5e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: ifeq b1
      // 67: new com/zelix/_o5
      // 6a: dup
      // 6b: aload 0
      // 6c: ldc2_w 7712078265252532240
      // 6f: lload 3
      // 70: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: ifeq 9f
      // 78: goto 85
      // 7b: ldc2_w 7707596323535900114
      // 7e: lload 3
      // 7f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: sipush 7143
      // 88: ldc2_w 1852776346799557466
      // 8b: lload 3
      // 8c: lxor
      // 8d: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: goto ac
      // 95: ldc2_w 7707596323535900114
      // 98: lload 3
      // 99: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: sipush 28368
      // a2: ldc2_w 3744609724605349487
      // a5: lload 3
      // a6: lxor
      // a7: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: aload 2
      // ad: invokespecial com/zelix/_o5.<init> (ILcom/zelix/_op;)V
      // b0: areturn
      // b1: new com/zelix/_o5
      // b4: dup
      // b5: aload 0
      // b6: ldc2_w 7712078265252532240
      // b9: lload 3
      // ba: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: ifeq dc
      // c2: sipush 4202
      // c5: ldc2_w 5640714349516898520
      // c8: lload 3
      // c9: lxor
      // ca: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: goto e9
      // d2: ldc2_w 7707596323535900114
      // d5: lload 3
      // d6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: sipush 26812
      // df: ldc2_w 6636305059342661645
      // e2: lload 3
      // e3: lxor
      // e4: invokedynamic t (IJ)I bsm=com/zelix/qg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e9: aload 2
      // ea: invokespecial com/zelix/_o5.<init> (ILcom/zelix/_op;)V
      // ed: areturn
   }

   public String v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 3198464519143593363L, var2);
   }

   public boolean J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;

      try {
         if (x44.a<"n">(this, 7826830605240424488L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"r">(var4, 7938653453954042127L, var2);
      }

      return false;
   }

   static {
      long var11 = a ^ 101411224317386L;
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
      String var17 = "õ(\ruF\u0017\u001dåý\u0006\u0006Í\u009e#´\u0003×Åôk\u0091\u0080ý\u0086éàï\u0080[À\t\u009b/\u0081þ*xÉô÷\u0010\u00026jæ\u0000eþ£\niCÏ\u000f»jI\u0010½dþ\u0084\u0086½\u009cÿ'Y%\u008aåD*\"";
      int var19 = "õ(\ruF\u0017\u001dåý\u0006\u0006Í\u009e#´\u0003×Åôk\u0091\u0080ý\u0086éàï\u0080[À\t\u009b/\u0081þ*xÉô÷\u0010\u00026jæ\u0000eþ£\niCÏ\u000f»jI\u0010½dþ\u0084\u0086½\u009cÿ'Y%\u008aåD*\""
         .length();
      char var16 = '(';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var30 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var30;
         if ((var15 += var16) >= var19) {
            c = var20;
            d = new String[3];
            h = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[17];
            int var3 = 0;
            String var4 = "çÄ4\u0090\u008dÒÉæ.þÊ1²X\u009cq¯õ\u008dþóÑ}Ê}Ù/®~2\u0088ç\u0099\u0080%C\u000e@[âZË^Rhw³Ìs¶\u000fd\u0004ûI&7Ñ\u0005q±7uû@V. >\u0013\u0015 \u000bJRº ¼ãü\u0095Ô\u008db\u000fÇT\u001f!Ð;¥Ì$[#±@\u000b\u0080\u008aó3Y×IF\u008a°È!Yª\u000e\u001b¦Hò\u008d!";
            int var5 = "çÄ4\u0090\u008dÒÉæ.þÊ1²X\u009cq¯õ\u008dþóÑ}Ê}Ù/®~2\u0088ç\u0099\u0080%C\u000e@[âZË^Rhw³Ìs¶\u000fd\u0004ûI&7Ñ\u0005q±7uû@V. >\u0013\u0015 \u000bJRº ¼ãü\u0095Ô\u008db\u000fÇT\u001f!Ð;¥Ì$[#±@\u000b\u0080\u008aó3Y×IF\u008a°È!Yª\u000e\u001b¦Hò\u008d!"
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
                           f = var6;
                           g = new Integer[17];
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "Ä(\u0006K\u0081ñÉÚÒÍ9,ß\\x\b";
                        var5 = "Ä(\u0006K\u0081ñÉÚÒÍ9,ß\\x\b".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11093;
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
            throw new RuntimeException("com/zelix/qg", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/qg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13462;
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
            throw new RuntimeException("com/zelix/qg", var14);
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
         throw new RuntimeException("com/zelix/qg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
