package com.zelix;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pw extends p7 {
   private ww S;
   private Vector a;
   private xn l;
   private static final long b = ess.a(8413651390009068750L, -8891797274672359176L, MethodHandles.lookup().lookupClass()).a(104094485489696L);
   private static final String[] j;
   private static final String[] m;
   private static final Map n = new HashMap(13);
   private static final long[] s;
   private static final Integer[] t;
   private static final Map u;

   private void k(Object[] param1) {
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/pw.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 35553643746892
      // 1e: lxor
      // 1f: lstore 5
      // 21: dup2
      // 22: ldc2_w 43669565238984
      // 25: lxor
      // 26: lstore 7
      // 28: pop2
      // 29: ldc2_w 7711065593322575513
      // 2c: lload 3
      // 2d: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: astore 9
      // 34: aload 0
      // 35: aload 9
      // 37: ifnull 8c
      // 3a: ldc2_w 7899383533635463345
      // 3d: lload 3
      // 3e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: ifnonnull 7e
      // 46: goto 53
      // 49: ldc2_w 8569775506602719670
      // 4c: lload 3
      // 4d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: aload 0
      // 54: lload 5
      // 56: bipush 1
      // 57: anewarray 415
      // 5a: dup_x2
      // 5b: dup_x2
      // 5c: pop
      // 5d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 60: bipush 0
      // 61: swap
      // 62: aastore
      // 63: ldc2_w 7709146189006911244
      // 66: lload 3
      // 67: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: aload 9
      // 6e: ifnonnull b3
      // 71: goto 7e
      // 74: ldc2_w 8569775506602719670
      // 77: lload 3
      // 78: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: goto 8c
      // 82: ldc2_w 8569775506602719670
      // 85: lload 3
      // 86: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: aload 0
      // 8d: ldc2_w 7899383533635463345
      // 90: lload 3
      // 91: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: lload 7
      // 98: bipush 2
      // 99: anewarray 415
      // 9c: dup_x2
      // 9d: dup_x2
      // 9e: pop
      // 9f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a2: bipush 1
      // a3: swap
      // a4: aastore
      // a5: dup_x1
      // a6: swap
      // a7: bipush 0
      // a8: swap
      // a9: aastore
      // aa: ldc2_w 7985415593994305340
      // ad: lload 3
      // ae: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: return
   }

   private void j(Object[] var1) {
      long var2 = (Long)var1[0];
      Integer var4 = (Integer)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 134642101695237L;
      int var7 = var4;

      try {
         if (var7 == 2) {
            x44.a<"k">(this, new Object[]{x44.a<"o">(this, -6497012929276822246L, var2), var5}, -4885516700953896978L, var2);
         }
      } catch (gj var8) {
         throw x44.a<"s">(var8, -6473948936256411268L, var2);
      }
   }

   void z(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 125181597895804L;
      _dl var6 = new _dl(this);
      new dg(
         x44.a<"o">(this, 5532890876467233414L, var2),
         b<"j">(15787, 1890809586863532115L ^ var2),
         b<"j">(4149, 1097458672148530652L ^ var2),
         b<"j">(7757, 3752338383348714401L ^ var2),
         b<"j">(32732, 8034170813022251552L ^ var2),
         b<"j">(26693, 6770225055745916334L ^ var2),
         var4,
         d<"d">(24774, 9087625432247158286L ^ var2),
         d<"d">(18432, 84770512515329737L ^ var2),
         var6
      );
   }

   public pw(u6 var1, char var2, int var3, int var4, _ur var5, as var6) {
      long var7 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var9 = var7 ^ 56348599390360L;
      super(var1, var9, var5, var6);
   }

   private void a(Object[] param1) {
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
      // 0c: getstatic com/zelix/pw.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 91439295947921
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 7575643179421111480
      // 1e: lload 2
      // 1f: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnull 53
      // 2c: ldc2_w 8644097714322679128
      // 2f: lload 2
      // 30: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/wc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: ifnonnull 7b
      // 38: goto 45
      // 3b: ldc2_w 8416338696812297111
      // 3e: lload 2
      // 3f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: goto 53
      // 49: ldc2_w 8416338696812297111
      // 4c: lload 2
      // 4d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: ldc2_w 7556642868766185759
      // 56: lload 2
      // 57: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: sipush 23947
      // 5f: ldc2_w 2349670717577572973
      // 62: lload 2
      // 63: lxor
      // 64: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: ldc2_w 7938430534289827564
      // 6c: lload 2
      // 6d: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/wc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: ldc2_w 8644097714322679128
      // 75: lload 2
      // 76: invokedynamic s (Ljava/lang/Object;Lcom/zelix/wc;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: new com/zelix/_d7
      // 7e: dup
      // 7f: aload 0
      // 80: invokespecial com/zelix/_d7.<init> (Lcom/zelix/pw;)V
      // 83: astore 7
      // 85: new com/zelix/ul
      // 88: dup
      // 89: sipush 30783
      // 8c: ldc2_w 8087994583862384598
      // 8f: lload 2
      // 90: lxor
      // 91: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: aload 0
      // 97: ldc2_w 8560120690329548933
      // 9a: lload 2
      // 9b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/u6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: lload 4
      // a2: dup2_x1
      // a3: pop2
      // a4: aload 0
      // a5: ldc2_w 8644097714322679128
      // a8: lload 2
      // a9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/wc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: aload 0
      // af: ldc2_w 7785763900096063397
      // b2: lload 2
      // b3: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/xn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: aload 0
      // b9: ldc2_w 8018634517132877766
      // bc: lload 2
      // bd: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: aload 0
      // c3: ldc2_w 8136336619376364986
      // c6: lload 2
      // c7: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/_ur; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: aload 7
      // ce: invokespecial com/zelix/ul.<init> (Ljava/lang/String;JLcom/zelix/u6;Lcom/zelix/wc;Lcom/zelix/xn;Ljava/util/Vector;Lcom/zelix/_ur;Lcom/zelix/eq;)V
      // d1: pop
      // d2: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   ww o(Object[] var1) {
      _rv[] var4 = (_rv[])var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 68613810124843L;
      long var7 = var2 ^ 96188474522176L;
      int[] var9 = x44.a<"w">(-770891541227108137L, var2);

      try {
         if (var9 == null) {
            return x44.a<"k">(this, -1289842855984546157L, var2);
         }

         if (!x44.a<"k">(this, -1254652350857293459L, var2)) {
            return x44.a<"k">(this, -1289842855984546157L, var2);
         }
      } catch (gj var12) {
         throw x44.a<"w">(var12, -1683222438578395144L, var2);
      }

      File[] var10 = new File[var4.length];
      int var11 = 0;

      label54:
      while (true) {
         if (var11 < var4.length) {
            try {
               var10[var11] = x44.a<"o">(var4[var11], new Object[]{var5}, -1106416047241205616L, var2);
               var11++;
            } catch (gj var13) {
               boolean var10001 = false;
               throw x44.a<"w">(var13, -1683222438578395144L, var2);
            }

            do {
               try {
                  int[] var17 = var9;
                  if (var2 >= 0L) {
                     if (var9 == null) {
                        break label54;
                     }

                     var17 = var9;
                  }

                  if (var17 != null) {
                     continue label54;
                  }
               } catch (gj var14) {
                  boolean var18 = false;
                  throw x44.a<"w">(var14, -1683222438578395144L, var2);
               }
            } while (var2 < 0L);
         }

         x44.a<"t">(this, new ww(var10, var7), -1289842855984546157L, var2);
         break;
      }

      x44.a<"t">(this, false, -1254652350857293459L, var2);
      return x44.a<"k">(this, -1289842855984546157L, var2);
   }

   final void q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 82020512693255L;
      _dt var6 = new _dt(this);
      x44.a<"r">(
         this,
         x44.a<"q">(x44.a<"h">(7487122506172798502L, var2), b<"j">(31521, 3002066072812329952L ^ var2), 8733999082053321738L, var2),
         9216891019597177553L,
         var2
      );
      new ut(
         b<"j">(4827, 3729399909456048668L ^ var2),
         x44.a<"m">(this, 8787266747655747516L, var2),
         x44.a<"m">(this, 9216891019597177553L, var2),
         var4,
         x44.a<"m">(this, 9210740756407468675L, var2),
         var6,
         3
      );
   }

   private void t(Object[] param1) {
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
      // 004: checkcast java/io/File
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
      // 016: checkcast java/lang/Integer
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/pw.b J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 112149421233361
      // 026: lxor
      // 027: lstore 6
      // 029: dup2
      // 02a: ldc2_w 101863946898455
      // 02d: lxor
      // 02e: lstore 8
      // 030: dup2
      // 031: ldc2_w 107449984919227
      // 034: lxor
      // 035: lstore 10
      // 037: dup2
      // 038: ldc2_w 97232405825600
      // 03b: lxor
      // 03c: lstore 12
      // 03e: pop2
      // 03f: ldc2_w 8751092382218421480
      // 042: lload 3
      // 043: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: astore 14
      // 04a: aload 5
      // 04c: ifnull 071
      // 04f: aload 0
      // 050: aload 5
      // 052: ldc2_w 6938151847570581578
      // 055: lload 3
      // 056: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: ldc2_w 7453158975909953441
      // 05e: lload 3
      // 05f: invokedynamic s (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: goto 071
      // 067: ldc2_w 7249915852850392007
      // 06a: lload 3
      // 06b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: aload 2
      // 072: invokevirtual java/lang/Integer.intValue ()I
      // 075: istore 15
      // 077: iload 15
      // 079: bipush 1
      // 07a: aload 14
      // 07c: lload 3
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: ifle 17f
      // 082: ifnull 177
      // 085: if_icmpne 167
      // 088: goto 095
      // 08b: ldc2_w 7249915852850392007
      // 08e: lload 3
      // 08f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 0
      // 096: lload 3
      // 097: lconst_0
      // 098: lcmp
      // 099: ifle 10b
      // 09c: aload 14
      // 09e: ifnull 10b
      // 0a1: goto 0ae
      // 0a4: ldc2_w 7249915852850392007
      // 0a7: lload 3
      // 0a8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: ldc2_w 7453158975909953441
      // 0b1: lload 3
      // 0b2: lload 3
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: iflt 0fc
      // 0b8: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: ifnull 0f7
      // 0c0: goto 0cd
      // 0c3: ldc2_w 7249915852850392007
      // 0c6: lload 3
      // 0c7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: ldc2_w 7108410822334260783
      // 0d1: lload 3
      // 0d2: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: aload 0
      // 0d8: ldc2_w 7453158975909953441
      // 0db: lload 3
      // 0dc: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: ldc2_w 6999186519730917682
      // 0e4: lload 3
      // 0e5: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: goto 0f7
      // 0ed: ldc2_w 7249915852850392007
      // 0f0: lload 3
      // 0f1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: ldc2_w 7108410822334260783
      // 0fb: lload 3
      // 0fc: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: ldc2_w 8660147274060118390
      // 104: lload 3
      // 105: invokedynamic h (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: aload 0
      // 10b: aload 0
      // 10c: sipush 14403
      // 10f: ldc2_w 5117230742815492086
      // 112: lload 3
      // 113: lxor
      // 114: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: aload 0
      // 11a: ldc2_w 8760272338035431069
      // 11d: lload 3
      // 11e: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: lload 6
      // 125: bipush 3
      // 126: anewarray 415
      // 129: dup_x2
      // 12a: dup_x2
      // 12b: pop
      // 12c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12f: bipush 2
      // 130: swap
      // 131: aastore
      // 132: dup_x1
      // 133: swap
      // 134: bipush 1
      // 135: swap
      // 136: aastore
      // 137: dup_x1
      // 138: swap
      // 139: bipush 0
      // 13a: swap
      // 13b: aastore
      // 13c: ldc2_w 8651081615346921470
      // 13f: lload 3
      // 140: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: lload 8
      // 147: bipush 2
      // 148: anewarray 415
      // 14b: dup_x2
      // 14c: dup_x2
      // 14d: pop
      // 14e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 151: bipush 1
      // 152: swap
      // 153: aastore
      // 154: dup_x1
      // 155: swap
      // 156: bipush 0
      // 157: swap
      // 158: aastore
      // 159: ldc2_w 8769436252234499479
      // 15c: lload 3
      // 15d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: aload 14
      // 164: ifnonnull 228
      // 167: iload 15
      // 169: bipush 2
      // 16a: goto 177
      // 16d: ldc2_w 7249915852850392007
      // 170: lload 3
      // 171: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: lload 3
      // 178: lconst_0
      // 179: lcmp
      // 17a: ifle 1c5
      // 17d: aload 14
      // 17f: ifnull 1c5
      // 182: if_icmpne 228
      // 185: goto 192
      // 188: ldc2_w 7249915852850392007
      // 18b: lload 3
      // 18c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: aload 0
      // 193: aload 14
      // 195: ifnull 201
      // 198: goto 1a5
      // 19b: ldc2_w 7249915852850392007
      // 19e: lload 3
      // 19f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: ldc2_w 9135453907171754069
      // 1a8: lload 3
      // 1a9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/sp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: ldc2_w 8897417234225373874
      // 1b1: lload 3
      // 1b2: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: bipush 1
      // 1b8: goto 1c5
      // 1bb: ldc2_w 7249915852850392007
      // 1be: lload 3
      // 1bf: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: if_icmpne 1f3
      // 1c8: aload 0
      // 1c9: lload 12
      // 1cb: bipush 1
      // 1cc: anewarray 415
      // 1cf: dup_x2
      // 1d0: dup_x2
      // 1d1: pop
      // 1d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d5: bipush 0
      // 1d6: swap
      // 1d7: aastore
      // 1d8: ldc2_w 6976522903158402183
      // 1db: lload 3
      // 1dc: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: aload 14
      // 1e3: ifnonnull 228
      // 1e6: goto 1f3
      // 1e9: ldc2_w 7249915852850392007
      // 1ec: lload 3
      // 1ed: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: aload 0
      // 1f4: goto 201
      // 1f7: ldc2_w 7249915852850392007
      // 1fa: lload 3
      // 1fb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: athrow
      // 201: aload 0
      // 202: ldc2_w 9135453907171754069
      // 205: lload 3
      // 206: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/sp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: lload 10
      // 20d: bipush 2
      // 20e: anewarray 415
      // 211: dup_x2
      // 212: dup_x2
      // 213: pop
      // 214: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 217: bipush 1
      // 218: swap
      // 219: aastore
      // 21a: dup_x1
      // 21b: swap
      // 21c: bipush 0
      // 21d: swap
      // 21e: aastore
      // 21f: ldc2_w 6995065200982474468
      // 222: lload 3
      // 223: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: return
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 41661110617462L;
      x44.a<"j">(x44.a<"n">(this, -4117980391267055465L, var2), true, -4504590558000954204L, var2);
      x44.a<"j">(x44.a<"n">(this, -4117980391267055465L, var2), -4439421311529489545L, var2);
      u6 var10000 = x44.a<"n">(this, -4117980391267055465L, var2);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = false;
      x44.a<"j">(var10000, var10004, -2769805197177012774L, var2);
   }

   void b(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 26564627298886L;
      x44.a<"k">(
         this, new Object[]{new sp(x44.a<"l">(-6596691208807983694L, var2), b<"j">(28141, 8547902915454717626L ^ var2)), var4}, -4760851067782864359L, var2
      );
   }

   private void E(Object[] param1) {
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
      // 004: checkcast [Lcom/zelix/_rv;
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/pg
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Boolean
      // 017: astore 7
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Integer
      // 01f: invokevirtual java/lang/Integer.intValue ()I
      // 022: istore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Long
      // 029: invokevirtual java/lang/Long.longValue ()J
      // 02c: lstore 3
      // 02d: pop
      // 02e: getstatic com/zelix/pw.b J
      // 031: lload 3
      // 032: lxor
      // 033: lstore 3
      // 034: lload 3
      // 035: dup2
      // 036: ldc2_w 126053241877011
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 96536631998494
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 88161871610010
      // 047: lxor
      // 048: lstore 12
      // 04a: pop2
      // 04b: ldc2_w 4994846940238493899
      // 04e: lload 3
      // 04f: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: astore 14
      // 056: aload 5
      // 058: aload 14
      // 05a: ifnull 096
      // 05d: ifnull 091
      // 060: goto 06d
      // 063: ldc2_w 6394973973897271268
      // 066: lload 3
      // 067: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: aload 0
      // 06e: aload 5
      // 070: ldc2_w 5022041053861341886
      // 073: lload 3
      // 074: invokedynamic p (Ljava/lang/Object;[Lcom/zelix/_rv;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: aload 0
      // 07a: bipush 1
      // 07b: ldc2_w 6812513279933964657
      // 07e: lload 3
      // 07f: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: goto 091
      // 087: ldc2_w 6394973973897271268
      // 08a: lload 3
      // 08b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: aload 6
      // 093: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 096: checkcast java/lang/String
      // 099: astore 15
      // 09b: lload 3
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: iflt 0bb
      // 0a1: aload 15
      // 0a3: ifnull 0c8
      // 0a6: aload 0
      // 0a7: ldc2_w 6810928107199633932
      // 0aa: lload 3
      // 0ab: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: aload 15
      // 0b2: ldc2_w 4712944276656722226
      // 0b5: lload 3
      // 0b6: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: goto 0c8
      // 0be: ldc2_w 6394973973897271268
      // 0c1: lload 3
      // 0c2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: iload 2
      // 0c9: bipush 1
      // 0ca: if_icmpne 120
      // 0cd: aload 7
      // 0cf: astore 16
      // 0d1: aload 0
      // 0d2: ldc2_w 6810928107199633932
      // 0d5: lload 3
      // 0d6: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aload 16
      // 0dd: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e0: ldc2_w 4752314573600296887
      // 0e3: lload 3
      // 0e4: invokedynamic k (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: aload 0
      // 0ea: ldc2_w 6810928107199633932
      // 0ed: lload 3
      // 0ee: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/as; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: ldc2_w 4903405093408638293
      // 0f6: lload 3
      // 0f7: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: aload 0
      // 0fd: lload 8
      // 0ff: bipush 1
      // 100: anewarray 415
      // 103: dup_x2
      // 104: dup_x2
      // 105: pop
      // 106: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 109: bipush 0
      // 10a: swap
      // 10b: aastore
      // 10c: ldc2_w 4813079857296775653
      // 10f: lload 3
      // 110: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: lload 3
      // 116: lconst_0
      // 117: lcmp
      // 118: iflt 120
      // 11b: aload 14
      // 11d: ifnonnull 1b2
      // 120: aload 0
      // 121: aload 14
      // 123: ifnull 18b
      // 126: goto 133
      // 129: ldc2_w 6394973973897271268
      // 12c: lload 3
      // 12d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: lload 3
      // 134: lconst_0
      // 135: lcmp
      // 136: iflt 17e
      // 139: ldc2_w 4896055879583876835
      // 13c: lload 3
      // 13d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: ifnonnull 17d
      // 145: goto 152
      // 148: ldc2_w 6394973973897271268
      // 14b: lload 3
      // 14c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: aload 0
      // 153: lload 10
      // 155: bipush 1
      // 156: anewarray 415
      // 159: dup_x2
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15f: bipush 0
      // 160: swap
      // 161: aastore
      // 162: ldc2_w 4948915049561725278
      // 165: lload 3
      // 166: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: aload 14
      // 16d: ifnonnull 1b2
      // 170: goto 17d
      // 173: ldc2_w 6394973973897271268
      // 176: lload 3
      // 177: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 0
      // 17e: goto 18b
      // 181: ldc2_w 6394973973897271268
      // 184: lload 3
      // 185: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: aload 0
      // 18c: ldc2_w 4896055879583876835
      // 18f: lload 3
      // 190: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: lload 12
      // 197: bipush 2
      // 198: anewarray 415
      // 19b: dup_x2
      // 19c: dup_x2
      // 19d: pop
      // 19e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a1: bipush 1
      // 1a2: swap
      // 1a3: aastore
      // 1a4: dup_x1
      // 1a5: swap
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: ldc2_w 4648720549718200686
      // 1ac: lload 3
      // 1ad: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: return
   }

   private void S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 75878752521312L;
      x44.a<"k">(this, new Object[]{null, var4}, 2667585295070654557L, var2);
   }

   private void F(Object[] param1) {
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
      // 004: checkcast com/zelix/po
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: pop
      // 01b: getstatic com/zelix/pw.b J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 55779310146871
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 72394021009009
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 113389548170552
      // 037: lxor
      // 038: lstore 10
      // 03a: pop2
      // 03b: ldc2_w -4173065040134259828
      // 03e: lload 4
      // 040: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: aload 0
      // 046: aload 3
      // 047: ldc2_w -4560667298311846492
      // 04a: lload 4
      // 04c: invokedynamic w (Ljava/lang/Object;Lcom/zelix/po;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: aload 2
      // 052: invokevirtual java/lang/Integer.intValue ()I
      // 055: istore 13
      // 057: astore 12
      // 059: iload 13
      // 05b: bipush 1
      // 05c: if_icmpne 10d
      // 05f: aload 0
      // 060: lload 4
      // 062: lconst_0
      // 063: lcmp
      // 064: iflt 0d8
      // 067: aload 12
      // 069: ifnull 0d8
      // 06c: goto 07a
      // 06f: ldc2_w -2596171997647121245
      // 072: lload 4
      // 074: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: lload 4
      // 07c: lconst_0
      // 07d: lcmp
      // 07e: ifle 0ca
      // 081: ldc2_w -4109862195377214983
      // 084: lload 4
      // 086: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: ifnonnull 0c9
      // 08e: goto 09c
      // 091: ldc2_w -2596171997647121245
      // 094: lload 4
      // 096: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 0
      // 09d: lload 10
      // 09f: bipush 1
      // 0a0: anewarray 415
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w -2557746785362903011
      // 0af: lload 4
      // 0b1: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: aload 12
      // 0b8: ifnonnull 135
      // 0bb: goto 0c9
      // 0be: ldc2_w -2596171997647121245
      // 0c1: lload 4
      // 0c3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: goto 0d8
      // 0cd: ldc2_w -2596171997647121245
      // 0d0: lload 4
      // 0d2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: ldc2_w -4109862195377214983
      // 0dc: lload 4
      // 0de: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: lload 8
      // 0e5: bipush 2
      // 0e6: anewarray 415
      // 0e9: dup_x2
      // 0ea: dup_x2
      // 0eb: pop
      // 0ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ef: bipush 1
      // 0f0: swap
      // 0f1: aastore
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: bipush 0
      // 0f5: swap
      // 0f6: aastore
      // 0f7: ldc2_w -2372220095925777844
      // 0fa: lload 4
      // 0fc: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: lload 4
      // 103: lconst_0
      // 104: lcmp
      // 105: ifle 127
      // 108: aload 12
      // 10a: ifnonnull 135
      // 10d: aload 0
      // 10e: lload 6
      // 110: bipush 1
      // 111: anewarray 415
      // 114: dup_x2
      // 115: dup_x2
      // 116: pop
      // 117: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11a: bipush 0
      // 11b: swap
      // 11c: aastore
      // 11d: ldc2_w -4298183590465208249
      // 120: lload 4
      // 122: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: goto 135
      // 12a: ldc2_w -2596171997647121245
      // 12d: lload 4
      // 12f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: return
   }

   private void C(Object[] var1) {
      long var3 = (Long)var1[0];
      eq var2 = (eq)var1[1];
      var3 = b ^ var3;
      long var5 = var3 ^ 23029134408993L;
      long var7 = var3 ^ 13307558548060L;
      new u0(
         b<"j">(10609, 87748808239183100L ^ var3),
         x44.a<"o">(this, 4947473567968021222L, var3),
         x44.a<"o">(this, 6711688418682351013L, var3),
         x44.a<"o">(this, 6414600429630493797L, var3),
         x44.a<"k">(x44.a<"o">(this, 4947473567968021222L, var3), new Object[]{var7}, 6839341515185710105L, var3),
         var5,
         x44.a<"o">(this, 4702289131173112810L, var3),
         x44.a<"o">(this, 4794450798155169753L, var3),
         var2
      );
   }

   private void h(Object[] var1) {
      _rv[] var2 = (_rv[])var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      long var5 = var3 ^ 99078485942290L;
      _d1 var7 = new _d1(this);
      x44.a<"l">(x44.a<"h">(this, -5140904702077454615L, var3), false, -4683090436895589670L, var3);
      new u2(
         var5,
         x44.a<"h">(this, -5140904702077454615L, var3),
         b<"j">(6533, 4444904574016174104L ^ var3),
         b<"j">(4149, 1097440424043753907L ^ var3),
         false,
         x44.a<"l">(x44.a<"h">(this, -4856449926397200365L, var3), -4876961755379409702L, var3),
         x44.a<"l">(x44.a<"h">(this, -4856449926397200365L, var3), -6362656612337962204L, var3),
         var2,
         var7
      );
   }

   private void w(Object[] param1) {
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
      // 00e: checkcast java/lang/Integer
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/pw.b J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 12128849383763
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 121832547908232
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 2952059267934
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 130629533954249
      // 033: lxor
      // 034: lstore 11
      // 036: dup2
      // 037: ldc2_w 39961720729623
      // 03a: lxor
      // 03b: lstore 13
      // 03d: pop2
      // 03e: ldc2_w -7261764074686093661
      // 041: lload 3
      // 042: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: aload 2
      // 048: invokevirtual java/lang/Integer.intValue ()I
      // 04b: istore 16
      // 04d: astore 15
      // 04f: iload 16
      // 051: bipush 1
      // 052: aload 15
      // 054: ifnull 161
      // 057: if_icmpne 151
      // 05a: goto 067
      // 05d: ldc2_w -8730289269383689844
      // 060: lload 3
      // 061: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: aload 0
      // 068: ldc2_w -7386608354403396579
      // 06b: lload 3
      // 06c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/br; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: lload 11
      // 073: ldc2_w -7294272292670280956
      // 076: lload 3
      // 077: invokedynamic j (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: sipush 10917
      // 07f: ldc2_w 7344764020955232095
      // 082: lload 3
      // 083: lxor
      // 084: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: bipush 3
      // 08a: anewarray 415
      // 08d: dup_x1
      // 08e: swap
      // 08f: bipush 2
      // 090: swap
      // 091: aastore
      // 092: dup_x1
      // 093: swap
      // 094: bipush 1
      // 095: swap
      // 096: aastore
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w -9063340656462470828
      // 0a3: lload 3
      // 0a4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: aload 0
      // 0aa: bipush 0
      // 0ab: ldc2_w -9077008529800370474
      // 0ae: lload 3
      // 0af: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: aload 0
      // 0b5: lload 3
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: iflt 125
      // 0bb: aload 15
      // 0bd: ifnull 125
      // 0c0: goto 0cd
      // 0c3: ldc2_w -8730289269383689844
      // 0c6: lload 3
      // 0c7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: lload 3
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: ifle 118
      // 0d3: ldc2_w -9135093615366034542
      // 0d6: lload 3
      // 0d7: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/qr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: ifnonnull 117
      // 0df: goto 0ec
      // 0e2: ldc2_w -8730289269383689844
      // 0e5: lload 3
      // 0e6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: lload 5
      // 0ef: bipush 1
      // 0f0: anewarray 415
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 0
      // 0fa: swap
      // 0fb: aastore
      // 0fc: ldc2_w -7047047977366641383
      // 0ff: lload 3
      // 100: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: aload 15
      // 107: ifnonnull 2c9
      // 10a: goto 117
      // 10d: ldc2_w -8730289269383689844
      // 110: lload 3
      // 111: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 0
      // 118: goto 125
      // 11b: ldc2_w -8730289269383689844
      // 11e: lload 3
      // 11f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: aload 0
      // 126: ldc2_w -9135093615366034542
      // 129: lload 3
      // 12a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/qr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: lload 7
      // 131: bipush 2
      // 132: anewarray 415
      // 135: dup_x2
      // 136: dup_x2
      // 137: pop
      // 138: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b: bipush 1
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 0
      // 141: swap
      // 142: aastore
      // 143: ldc2_w -7269778828161688360
      // 146: lload 3
      // 147: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: aload 15
      // 14e: ifnonnull 2c9
      // 151: iload 16
      // 153: bipush 2
      // 154: goto 161
      // 157: ldc2_w -8730289269383689844
      // 15a: lload 3
      // 15b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: lload 3
      // 162: lconst_0
      // 163: lcmp
      // 164: iflt 229
      // 167: aload 15
      // 169: ifnull 229
      // 16c: if_icmpne 219
      // 16f: goto 17c
      // 172: ldc2_w -8730289269383689844
      // 175: lload 3
      // 176: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: aload 0
      // 17d: lload 3
      // 17e: lconst_0
      // 17f: lcmp
      // 180: ifle 1ed
      // 183: aload 15
      // 185: ifnull 1ed
      // 188: goto 195
      // 18b: ldc2_w -8730289269383689844
      // 18e: lload 3
      // 18f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: lload 3
      // 196: lconst_0
      // 197: lcmp
      // 198: ifle 1e0
      // 19b: ldc2_w -7216572673719159594
      // 19e: lload 3
      // 19f: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: ifnonnull 1df
      // 1a7: goto 1b4
      // 1aa: ldc2_w -8730289269383689844
      // 1ad: lload 3
      // 1ae: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: lload 13
      // 1b7: bipush 1
      // 1b8: anewarray 415
      // 1bb: dup_x2
      // 1bc: dup_x2
      // 1bd: pop
      // 1be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c1: bipush 0
      // 1c2: swap
      // 1c3: aastore
      // 1c4: ldc2_w -9102252440994292430
      // 1c7: lload 3
      // 1c8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: aload 15
      // 1cf: ifnonnull 2c9
      // 1d2: goto 1df
      // 1d5: ldc2_w -8730289269383689844
      // 1d8: lload 3
      // 1d9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 0
      // 1e0: goto 1ed
      // 1e3: ldc2_w -8730289269383689844
      // 1e6: lload 3
      // 1e7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: ldc2_w -7216572673719159594
      // 1f1: lload 3
      // 1f2: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/_rv; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: lload 9
      // 1f9: bipush 2
      // 1fa: anewarray 415
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 1
      // 204: swap
      // 205: aastore
      // 206: dup_x1
      // 207: swap
      // 208: bipush 0
      // 209: swap
      // 20a: aastore
      // 20b: ldc2_w -9062529854052018333
      // 20e: lload 3
      // 20f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: aload 15
      // 216: ifnonnull 2c9
      // 219: iload 16
      // 21b: bipush 4
      // 21c: goto 229
      // 21f: ldc2_w -8730289269383689844
      // 222: lload 3
      // 223: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: if_icmpne 2c9
      // 22c: aload 0
      // 22d: bipush 1
      // 22e: ldc2_w -9077008529800370474
      // 231: lload 3
      // 232: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: aload 0
      // 238: aload 15
      // 23a: ifnull 2a2
      // 23d: goto 24a
      // 240: ldc2_w -8730289269383689844
      // 243: lload 3
      // 244: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: lload 3
      // 24b: lconst_0
      // 24c: lcmp
      // 24d: iflt 295
      // 250: ldc2_w -9135093615366034542
      // 253: lload 3
      // 254: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/qr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: ifnonnull 294
      // 25c: goto 269
      // 25f: ldc2_w -8730289269383689844
      // 262: lload 3
      // 263: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: athrow
      // 269: aload 0
      // 26a: lload 5
      // 26c: bipush 1
      // 26d: anewarray 415
      // 270: dup_x2
      // 271: dup_x2
      // 272: pop
      // 273: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 276: bipush 0
      // 277: swap
      // 278: aastore
      // 279: ldc2_w -7047047977366641383
      // 27c: lload 3
      // 27d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: aload 15
      // 284: ifnonnull 2c9
      // 287: goto 294
      // 28a: ldc2_w -8730289269383689844
      // 28d: lload 3
      // 28e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: athrow
      // 294: aload 0
      // 295: goto 2a2
      // 298: ldc2_w -8730289269383689844
      // 29b: lload 3
      // 29c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: athrow
      // 2a2: aload 0
      // 2a3: ldc2_w -9135093615366034542
      // 2a6: lload 3
      // 2a7: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/qr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: lload 7
      // 2ae: bipush 2
      // 2af: anewarray 415
      // 2b2: dup_x2
      // 2b3: dup_x2
      // 2b4: pop
      // 2b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b8: bipush 1
      // 2b9: swap
      // 2ba: aastore
      // 2bb: dup_x1
      // 2bc: swap
      // 2bd: bipush 0
      // 2be: swap
      // 2bf: aastore
      // 2c0: ldc2_w -7269778828161688360
      // 2c3: lload 3
      // 2c4: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: return
   }

   void x(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 120176924901700L;
      x44.a<"j">(this, new Object[]{x44.a<"j">(x44.a<"n">(this, 5934683775324427989L, var2), 5893243070347696382L, var2), var4}, 5652650069349393839L, var2);
   }

   private void D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 6856046198002L;
      x44.a<"o">(this, new Object[]{x44.a<"m">(this, 5135168124313988584L, var2), var4}, 6730319985128479394L, var2);
   }

   private void W(Object[] var1) {
      qr var2 = (qr)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      long var5 = var3 ^ 96818046139112L;
      long var7 = (var3 ^ 105782715730206L) >>> 16;
      int var9 = (int)((var3 ^ 105782715730206L) << 48 >>> 48);
      _d9 var10 = new _d9(this);
      new u7(
         b<"j">(26286, 4580777776526563053L ^ var3),
         var7,
         b<"j">(13496, 571528466582357217L ^ var3),
         x44.a<"r">(new Object[]{b<"j">(21472, 290968371144106942L ^ var3), var5}, 8185725601089414150L, var3),
         x44.a<"n">(this, 7598058591169636159L, var3),
         var2,
         var10,
         (short)var9
      );
   }

   private void u(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/sp
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Integer
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/pw.b J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 32143498441803
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 123656993060111
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 95914194224072
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 101004854349041
      // 03e: lxor
      // 03f: lstore 12
      // 041: pop2
      // 042: ldc2_w 4450440008347009113
      // 045: lload 4
      // 047: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 2
      // 04d: invokevirtual java/lang/Integer.intValue ()I
      // 050: istore 15
      // 052: aload 0
      // 053: aload 3
      // 054: ldc2_w 4212736328616969444
      // 057: lload 4
      // 059: invokedynamic r (Ljava/lang/Object;Lcom/zelix/sp;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: astore 14
      // 060: iload 15
      // 062: bipush 1
      // 063: aload 14
      // 065: ifnull 1d8
      // 068: if_icmpne 1c7
      // 06b: goto 079
      // 06e: ldc2_w 2318759787777142646
      // 071: lload 4
      // 073: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 0
      // 07a: ldc2_w 4212736328616969444
      // 07d: lload 4
      // 07f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/sp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: ldc2_w 4341367137101172222
      // 087: lload 4
      // 089: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: sipush 10371
      // 091: ldc2_w 9018317287155471232
      // 094: lload 4
      // 096: lxor
      // 097: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: ldc2_w 2361584870084469855
      // 09f: lload 4
      // 0a1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: aload 0
      // 0a7: aload 14
      // 0a9: lload 4
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: ifle 13f
      // 0b0: ifnull 136
      // 0b3: goto 0c1
      // 0b6: ldc2_w 2318759787777142646
      // 0b9: lload 4
      // 0bb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: lload 4
      // 0c3: lconst_0
      // 0c4: lcmp
      // 0c5: iflt 128
      // 0c8: ldc2_w 4212736328616969444
      // 0cb: lload 4
      // 0cd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/sp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: ldc2_w 4596198736413419011
      // 0d5: lload 4
      // 0d7: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: bipush 1
      // 0dd: if_icmpne 11b
      // 0e0: goto 0ee
      // 0e3: ldc2_w 2318759787777142646
      // 0e6: lload 4
      // 0e8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: lload 12
      // 0f1: bipush 1
      // 0f2: anewarray 415
      // 0f5: dup_x2
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: ldc2_w 2621259006510262326
      // 101: lload 4
      // 103: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: aload 14
      // 10a: ifnonnull 203
      // 10d: goto 11b
      // 110: ldc2_w 2318759787777142646
      // 113: lload 4
      // 115: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 0
      // 11c: aconst_null
      // 11d: ldc2_w 2607797096256420105
      // 120: lload 4
      // 122: invokedynamic r (Ljava/lang/Object;Lcom/zelix/hl6;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: aload 0
      // 128: goto 136
      // 12b: ldc2_w 2318759787777142646
      // 12e: lload 4
      // 130: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: lload 4
      // 138: lconst_0
      // 139: lcmp
      // 13a: ifle 199
      // 13d: aload 14
      // 13f: ifnull 199
      // 142: ldc2_w 2585052073734454032
      // 145: lload 4
      // 147: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: ifnonnull 18a
      // 14f: goto 15d
      // 152: ldc2_w 2318759787777142646
      // 155: lload 4
      // 157: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: aload 0
      // 15e: lload 6
      // 160: bipush 1
      // 161: anewarray 415
      // 164: dup_x2
      // 165: dup_x2
      // 166: pop
      // 167: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16a: bipush 0
      // 16b: swap
      // 16c: aastore
      // 16d: ldc2_w 2568309196864257159
      // 170: lload 4
      // 172: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: aload 14
      // 179: ifnonnull 203
      // 17c: goto 18a
      // 17f: ldc2_w 2318759787777142646
      // 182: lload 4
      // 184: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 0
      // 18b: goto 199
      // 18e: ldc2_w 2318759787777142646
      // 191: lload 4
      // 193: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: athrow
      // 199: aload 0
      // 19a: ldc2_w 2585052073734454032
      // 19d: lload 4
      // 19f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: lload 8
      // 1a6: bipush 2
      // 1a7: anewarray 415
      // 1aa: dup_x2
      // 1ab: dup_x2
      // 1ac: pop
      // 1ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b0: bipush 1
      // 1b1: swap
      // 1b2: aastore
      // 1b3: dup_x1
      // 1b4: swap
      // 1b5: bipush 0
      // 1b6: swap
      // 1b7: aastore
      // 1b8: ldc2_w 4195422400942576100
      // 1bb: lload 4
      // 1bd: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: aload 14
      // 1c4: ifnonnull 203
      // 1c7: iload 15
      // 1c9: bipush 2
      // 1ca: goto 1d8
      // 1cd: ldc2_w 2318759787777142646
      // 1d0: lload 4
      // 1d2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: if_icmpne 203
      // 1db: aload 0
      // 1dc: lload 10
      // 1de: bipush 1
      // 1df: anewarray 415
      // 1e2: dup_x2
      // 1e3: dup_x2
      // 1e4: pop
      // 1e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e8: bipush 0
      // 1e9: swap
      // 1ea: aastore
      // 1eb: ldc2_w 2818106292187982709
      // 1ee: lload 4
      // 1f0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: goto 203
      // 1f8: ldc2_w 2318759787777142646
      // 1fb: lload 4
      // 1fd: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: return
   }

   private void G(Object[] param1) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/pw.b J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 50385147461029
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 88073906248767
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 131254225048128
      // 02d: lxor
      // 02e: lstore 9
      // 030: dup2
      // 031: ldc2_w 122359564068870
      // 034: lxor
      // 035: lstore 11
      // 037: pop2
      // 038: ldc2_w 4021484500444170837
      // 03b: lload 2
      // 03c: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: aload 4
      // 043: invokevirtual java/lang/Integer.intValue ()I
      // 046: istore 14
      // 048: astore 13
      // 04a: iload 14
      // 04c: bipush 1
      // 04d: aload 13
      // 04f: ifnull 151
      // 052: if_icmpne 141
      // 055: goto 062
      // 058: ldc2_w 3035970402219828602
      // 05b: lload 2
      // 05c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 0
      // 063: ldc2_w 2962023437655047093
      // 066: lload 2
      // 067: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/wc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: lload 7
      // 06e: ldc2_w 3905657904828205042
      // 071: lload 2
      // 072: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: sipush 5622
      // 07a: ldc2_w 1212581410615698684
      // 07d: lload 2
      // 07e: lxor
      // 07f: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: bipush 3
      // 085: anewarray 415
      // 088: dup_x1
      // 089: swap
      // 08a: bipush 2
      // 08b: swap
      // 08c: aastore
      // 08d: dup_x1
      // 08e: swap
      // 08f: bipush 1
      // 090: swap
      // 091: aastore
      // 092: dup_x2
      // 093: dup_x2
      // 094: pop
      // 095: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 098: bipush 0
      // 099: swap
      // 09a: aastore
      // 09b: ldc2_w 3372823822634864034
      // 09e: lload 2
      // 09f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: aload 0
      // 0a5: lload 2
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: iflt 115
      // 0ab: aload 13
      // 0ad: ifnull 115
      // 0b0: goto 0bd
      // 0b3: ldc2_w 3035970402219828602
      // 0b6: lload 2
      // 0b7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: lload 2
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: iflt 108
      // 0c3: ldc2_w 3493289307489832680
      // 0c6: lload 2
      // 0c7: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/sp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: ifnonnull 107
      // 0cf: goto 0dc
      // 0d2: ldc2_w 3035970402219828602
      // 0d5: lload 2
      // 0d6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: lload 9
      // 0df: bipush 1
      // 0e0: anewarray 415
      // 0e3: dup_x2
      // 0e4: dup_x2
      // 0e5: pop
      // 0e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e9: bipush 0
      // 0ea: swap
      // 0eb: aastore
      // 0ec: ldc2_w 3956881307123550255
      // 0ef: lload 2
      // 0f0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: aload 13
      // 0f7: ifnonnull 17a
      // 0fa: goto 107
      // 0fd: ldc2_w 3035970402219828602
      // 100: lload 2
      // 101: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 0
      // 108: goto 115
      // 10b: ldc2_w 3035970402219828602
      // 10e: lload 2
      // 10f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 0
      // 116: ldc2_w 3493289307489832680
      // 119: lload 2
      // 11a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/sp; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: lload 11
      // 121: bipush 2
      // 122: anewarray 415
      // 125: dup_x2
      // 126: dup_x2
      // 127: pop
      // 128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12b: bipush 1
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 0
      // 131: swap
      // 132: aastore
      // 133: ldc2_w 3435815840207269977
      // 136: lload 2
      // 137: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: aload 13
      // 13e: ifnonnull 17a
      // 141: iload 14
      // 143: bipush 2
      // 144: goto 151
      // 147: ldc2_w 3035970402219828602
      // 14a: lload 2
      // 14b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: if_icmpne 17a
      // 154: aload 0
      // 155: lload 5
      // 157: bipush 1
      // 158: anewarray 415
      // 15b: dup_x2
      // 15c: dup_x2
      // 15d: pop
      // 15e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 161: bipush 0
      // 162: swap
      // 163: aastore
      // 164: ldc2_w 3658609442280147439
      // 167: lload 2
      // 168: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: goto 17a
      // 170: ldc2_w 3035970402219828602
      // 173: lload 2
      // 174: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: return
   }

   private void T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 57344350977282L;
      long var6 = var2 ^ 110052177325997L;
      x44.a<"j">(
         this,
         new Object[]{x44.a<"l">(x44.a<"h">(this, -5363846723726165055L, var2), new Object[]{var4}, -5548653877664525933L, var2), var6},
         -5785816498624332199L,
         var2
      );
   }

   private void K(Object[] var1) {
      po var2 = (po)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      long var5 = var3 ^ 48613735571090L;
      long var7 = var3 ^ 84615659617341L;
      _d4 var9 = new _d4(this);
      new dz(
         x44.a<"l">(this, -8283300380909337787L, var3),
         b<"j">(18588, 6858740864860511409L ^ var3),
         var2,
         x44.a<"p">(new Object[]{b<"j">(12732, 4552653232822396289L ^ var3), var5}, -7645988292301782916L, var3),
         b<"j">(4149, 1097466646505391135L ^ var3),
         x44.a<"p">(new Object[]{b<"j">(20574, 9213419288415356018L ^ var3), var5}, -7645988292301782916L, var3),
         var7,
         x44.a<"l">(this, -8559525552470602305L, var3),
         var9
      );
   }

   private void U(Object[] param1) {
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
      // 004: checkcast com/zelix/qr
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: pop
      // 01c: getstatic com/zelix/pw.b J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 112682344085730
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 38115841651115
      // 02e: lxor
      // 02f: lstore 8
      // 031: pop2
      // 032: ldc2_w 5737680530078413370
      // 035: lload 2
      // 036: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03b: aload 5
      // 03d: invokevirtual java/lang/Integer.intValue ()I
      // 040: istore 11
      // 042: astore 10
      // 044: aload 0
      // 045: aload 4
      // 047: ldc2_w 6170211621130010379
      // 04a: lload 2
      // 04b: invokedynamic q (Ljava/lang/Object;Lcom/zelix/qr;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: iload 11
      // 052: bipush 1
      // 053: aload 10
      // 055: ifnull 0d7
      // 058: if_icmpne 0c7
      // 05b: goto 068
      // 05e: ldc2_w 5930842877560151317
      // 061: lload 2
      // 062: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: aload 0
      // 069: ldc2_w 6170211621130010379
      // 06c: lload 2
      // 06d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/qr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: ldc2_w 5646625499748908957
      // 075: lload 2
      // 076: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: sipush 1471
      // 07e: ldc2_w 2112463389255060701
      // 081: lload 2
      // 082: lxor
      // 083: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: ldc2_w 5451310424483382975
      // 08b: lload 2
      // 08c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: aload 0
      // 092: bipush 0
      // 093: ldc2_w 5304448891766784502
      // 096: lload 2
      // 097: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: aload 0
      // 09d: lload 8
      // 09f: bipush 1
      // 0a0: anewarray 415
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w 6158840907629205782
      // 0af: lload 2
      // 0b0: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: aload 10
      // 0b7: ifnonnull 161
      // 0ba: goto 0c7
      // 0bd: ldc2_w 5930842877560151317
      // 0c0: lload 2
      // 0c1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: iload 11
      // 0c9: bipush 2
      // 0ca: goto 0d7
      // 0cd: ldc2_w 5930842877560151317
      // 0d0: lload 2
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: lload 2
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: iflt 12d
      // 0dd: aload 10
      // 0df: ifnull 12d
      // 0e2: if_icmpne 11d
      // 0e5: goto 0f2
      // 0e8: ldc2_w 5930842877560151317
      // 0eb: lload 2
      // 0ec: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: lload 6
      // 0f5: bipush 1
      // 0f6: anewarray 415
      // 0f9: dup_x2
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ff: bipush 0
      // 100: swap
      // 101: aastore
      // 102: ldc2_w 5204589416435159828
      // 105: lload 2
      // 106: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: aload 10
      // 10d: ifnonnull 161
      // 110: goto 11d
      // 113: ldc2_w 5930842877560151317
      // 116: lload 2
      // 117: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: iload 11
      // 11f: bipush 4
      // 120: goto 12d
      // 123: ldc2_w 5930842877560151317
      // 126: lload 2
      // 127: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: if_icmpne 161
      // 130: aload 0
      // 131: bipush 1
      // 132: ldc2_w 5304448891766784502
      // 135: lload 2
      // 136: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: aload 0
      // 13c: lload 8
      // 13e: bipush 1
      // 13f: anewarray 415
      // 142: dup_x2
      // 143: dup_x2
      // 144: pop
      // 145: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 148: bipush 0
      // 149: swap
      // 14a: aastore
      // 14b: ldc2_w 6158840907629205782
      // 14e: lload 2
      // 14f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: goto 161
      // 157: ldc2_w 5930842877560151317
      // 15a: lload 2
      // 15b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: return
   }

   private void y(Object[] var1) {
      sp var2 = (sp)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      long var5 = var3 ^ 140040123008144L;
      int var7 = (int)((var3 ^ 117884019677109L) >>> 32);
      int var8 = (int)((var3 ^ 117884019677109L) << 32 >>> 32);
      _d6 var9 = new _d6(this);
      new ua(
         b<"j">(19640, 8794202475128390289L ^ var3),
         x44.a<"r">(new Object[]{b<"j">(20574, 9213510982146662000L ^ var3), var5}, 5756072306010446462L, var3),
         var7,
         x44.a<"n">(this, 6271716973910120775L, var3),
         var8,
         var2,
         x44.a<"n">(this, 6211647112822326426L, var3),
         x44.a<"n">(this, 5847966163313454200L, var3),
         var9
      );
   }

   void r(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 16309869544636L;
      long var7 = var3 ^ 51068712058243L;
      _dm var9 = new _dm(this);
      new d0(
         var7,
         x44.a<"j">(this, 1667999628387228011L, var3),
         b<"j">(8056, 7672306567941853542L ^ var3),
         b<"j">(4149, 1097434624981769777L ^ var3),
         x44.a<"v">(new Object[]{b<"j">(20574, 9213387253772017244L ^ var3), var5}, 1138809045818612306L, var3),
         var2,
         var9
      );
   }

   private void P(Object[] param1) {
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
      // 0c: getstatic com/zelix/pw.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -6887319374963319311
      // 15: lload 2
      // 16: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: aload 4
      // 20: ifnull 4a
      // 23: ldc2_w -6760143426213417137
      // 26: lload 2
      // 27: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/br; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: ifnonnull 72
      // 2f: goto 3c
      // 32: ldc2_w -4790260302178798882
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: goto 4a
      // 40: ldc2_w -4790260302178798882
      // 43: lload 2
      // 44: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: ldc2_w -6802737301137338282
      // 4d: lload 2
      // 4e: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: sipush 11484
      // 56: ldc2_w 1380359536537668201
      // 59: lload 2
      // 5a: lxor
      // 5b: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/pw.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: ldc2_w -6546044952574945340
      // 63: lload 2
      // 64: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/br; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: ldc2_w -6760143426213417137
      // 6c: lload 2
      // 6d: invokedynamic r (Ljava/lang/Object;Lcom/zelix/br;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: new com/zelix/_dp
      // 75: dup
      // 76: aload 0
      // 77: invokespecial com/zelix/_dp.<init> (Lcom/zelix/pw;)V
      // 7a: astore 5
      // 7c: new com/zelix/_da
      // 7f: dup
      // 80: aload 0
      // 81: invokespecial com/zelix/_da.<init> (Lcom/zelix/pw;)V
      // 84: astore 6
      // 86: new com/zelix/_l
      // 89: dup
      // 8a: aload 0
      // 8b: aload 6
      // 8d: aload 5
      // 8f: invokespecial com/zelix/_l.<init> (Lcom/zelix/pw;Lcom/zelix/eq;Lcom/zelix/eq;)V
      // 92: astore 7
      // 94: new java/lang/Thread
      // 97: dup
      // 98: aload 7
      // 9a: invokespecial java/lang/Thread.<init> (Ljava/lang/Runnable;)V
      // 9d: ldc2_w -6345804403147876598
      // a0: lload 2
      // a1: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: return
   }

   private void Y(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      long var10001 = var3 ^ 1847586787469L;
      int var5 = (int)((var3 ^ 1847586787469L) >>> 48);
      int var6 = (int)((var3 ^ 1847586787469L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      _d2 var8 = new _d2(this);
      new dq(
         x44.a<"j">(this, 4442132836216157163L, var3),
         (short)var5,
         b<"j">(15787, 1890922481002223934L ^ var3),
         var2,
         (char)var6,
         x44.a<"j">(this, 4150096382404197649L, var3),
         var7,
         var8
      );
   }

   static {
      long var11 = b ^ 120105818453435L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[26];
      int var18 = 0;
      String var17 = "Ý\u008e\u0095ýFQe%)Ú2rþµãgHì®v\rE\u0083¥\u0017ÙÂ85Èë°t¸R|á\u0092DüÙ^FKý\u0000\u0002º]\u0004`<¿´Ð¦Å½Ñ\u00ad89~:Î7Å\u000bø,\u009c¼!1ð:D\u0003G\u001dBÃ¼\u0098±\u009cMû\u000e\u0010$\u001bh\u009d\u0019UuîÆ\u0081Ó¦6Ð±UP\u0098¬¼ \u00963xi/Æ~[Ø\u0090\u000b±ë\u009aØ\u0094&\u009aCPL\u0012Ó\u0016WÙ\u0011¥Þ¤ØR\u0090\u0013\u0015B\u0017u-`Ö{S\u0098ÒáËtØ\u0007{\u008e~ø;ÙØX\u007f\u0002Æd+\"õ/\u0018:\u0002\u001aæóâ\u0094\u001c5\u0018RQ \u0081\u001b\u0014J!{ÁÁ5_\u008f\u008dQ¬£f\u0096-ÃæNH¸ä!ðh¥\u00074\u009a\u00ad\u009dõµW\u0081H«/Æ\u0092ò´¨mmW\u0003ø\u001f» Ù\u0015\u009d\n\u009as¥6½v`o\u009czòR3ßÄM`\u0016\u0000m\u0094|-8\u0098O¢\u0093²\u0006\u0002é¾Q\u001d\u001eûPÐ\u00adp(\u0010Õ\u0086sßê\u0082mSF²Óþ\u0018f\u0097-TÐ!/ª\f5\u009f/Ë)Ø\u001al³s}l«æa\u0084° \u008c\u0099[ú\u0014ÇN¥â\u0098±ÄÜ/Ð=e<E®¤\u0092ò\u0082\u009fõ\u0016]¶s`\u0005ó\u0010\u008b\u0010Úè\u0097ÚÚ×\u0086\b3ÂòDýª\u00139 \u009e\u000e#\u0010\u008c6\t\u0003uR\u000f&á¿¢ÁMúL?gP\u0017üpÃ\u0088\u009cqã\"À ~°wvVÛIËñ\u0005\u0084}¿¤c\u00adJÇ\u0010t?LÝ\u0080\u0016ó¦\u0099\u0084\u0099\u0090F\u0018¿Y\\þ\u0002ö\u008e²\u0000r\u000b<{÷§\u0018v\u0002\n·\u0081qØ\u000b\u0010\u0013]Ñ@J}p\u0087ñÜ½É\u0084©\u0010\u008e\u0018?\u0092ô«Ëdõô8\u0089W\u008a]Q\u00163xGáÕX\u009d¼f(\u0091\u0012c\u0014Áa\u008c\t]tT\u007fÔ@êH=\u0089(§¦i\u0090òw\u0011K¤úõ§1\u0087×Ý\u0099j'¯; »Þ£{\u0000-J¥k)]KgÔÁDnSàP$\u0003\u009eK´d]\u0085Øã&$\u0018?Y\u009eÿ\u001eS«tSÌKG#Ó\b\u0090ë\t¹òq«7Ô ¹ \u008d¡ú\u0093°\u001b\u0082`$IB6\ró£`èT»9¤SÆVë2¢òäÔ@m¼7¤=\r.þ=£)ÁiêÙèôe^\u0092²¸Z\u0083)ÌíÇ\bð¶ØñÞJØ±é\u0001¯h&\u0089¾a½\u0085|îH.ìcýª\u001bp\u008c¶7üìý@ \b5U\u0082â\u0099ªç@1iiR%6KSÛ\rÎ·õ¶³\u007f4»ÝÜèL6(JDì\u009btð4\u0013\tÖ¿\u001dò´ÆåcAdñg|¨Däý-\u0086L\u0014þõ\u001f\u001e\\Mç\u0002ÿ/ ¦>QäUyPÕÈ?>]¥ñ\u0005Wþ)(Í\n\fØz×0À\u0090`\u001a\u009b¹ \"Å\u009eÐ¢y\u0011*ù\u0005ìj ÀÆlQ\u0089 +y\b½Þ]|í\u0006öaÛö`\u0082ÞÃZÊ8¼Qê(¡±ÇÀ&uSÚgð\u0082W\u0087úþ\u001c{\u008e\u0092<W;¿\u0088¹\u0001Åf\u0084\u009eú\u0091\u007f«L¦¤³<{ZOsß½¯]]@°l\u009b\u0007\u0001\u0097jf\u0012è#\u007fÆÉ\u000e%´â³ã-\u00add\u0085&STó²'>}\"\u001b\tä\u0003\u0010éèÛê\u009a~c\u0000¯¯Æmtv\u0016:";
      int var19 = "Ý\u008e\u0095ýFQe%)Ú2rþµãgHì®v\rE\u0083¥\u0017ÙÂ85Èë°t¸R|á\u0092DüÙ^FKý\u0000\u0002º]\u0004`<¿´Ð¦Å½Ñ\u00ad89~:Î7Å\u000bø,\u009c¼!1ð:D\u0003G\u001dBÃ¼\u0098±\u009cMû\u000e\u0010$\u001bh\u009d\u0019UuîÆ\u0081Ó¦6Ð±UP\u0098¬¼ \u00963xi/Æ~[Ø\u0090\u000b±ë\u009aØ\u0094&\u009aCPL\u0012Ó\u0016WÙ\u0011¥Þ¤ØR\u0090\u0013\u0015B\u0017u-`Ö{S\u0098ÒáËtØ\u0007{\u008e~ø;ÙØX\u007f\u0002Æd+\"õ/\u0018:\u0002\u001aæóâ\u0094\u001c5\u0018RQ \u0081\u001b\u0014J!{ÁÁ5_\u008f\u008dQ¬£f\u0096-ÃæNH¸ä!ðh¥\u00074\u009a\u00ad\u009dõµW\u0081H«/Æ\u0092ò´¨mmW\u0003ø\u001f» Ù\u0015\u009d\n\u009as¥6½v`o\u009czòR3ßÄM`\u0016\u0000m\u0094|-8\u0098O¢\u0093²\u0006\u0002é¾Q\u001d\u001eûPÐ\u00adp(\u0010Õ\u0086sßê\u0082mSF²Óþ\u0018f\u0097-TÐ!/ª\f5\u009f/Ë)Ø\u001al³s}l«æa\u0084° \u008c\u0099[ú\u0014ÇN¥â\u0098±ÄÜ/Ð=e<E®¤\u0092ò\u0082\u009fõ\u0016]¶s`\u0005ó\u0010\u008b\u0010Úè\u0097ÚÚ×\u0086\b3ÂòDýª\u00139 \u009e\u000e#\u0010\u008c6\t\u0003uR\u000f&á¿¢ÁMúL?gP\u0017üpÃ\u0088\u009cqã\"À ~°wvVÛIËñ\u0005\u0084}¿¤c\u00adJÇ\u0010t?LÝ\u0080\u0016ó¦\u0099\u0084\u0099\u0090F\u0018¿Y\\þ\u0002ö\u008e²\u0000r\u000b<{÷§\u0018v\u0002\n·\u0081qØ\u000b\u0010\u0013]Ñ@J}p\u0087ñÜ½É\u0084©\u0010\u008e\u0018?\u0092ô«Ëdõô8\u0089W\u008a]Q\u00163xGáÕX\u009d¼f(\u0091\u0012c\u0014Áa\u008c\t]tT\u007fÔ@êH=\u0089(§¦i\u0090òw\u0011K¤úõ§1\u0087×Ý\u0099j'¯; »Þ£{\u0000-J¥k)]KgÔÁDnSàP$\u0003\u009eK´d]\u0085Øã&$\u0018?Y\u009eÿ\u001eS«tSÌKG#Ó\b\u0090ë\t¹òq«7Ô ¹ \u008d¡ú\u0093°\u001b\u0082`$IB6\ró£`èT»9¤SÆVë2¢òäÔ@m¼7¤=\r.þ=£)ÁiêÙèôe^\u0092²¸Z\u0083)ÌíÇ\bð¶ØñÞJØ±é\u0001¯h&\u0089¾a½\u0085|îH.ìcýª\u001bp\u008c¶7üìý@ \b5U\u0082â\u0099ªç@1iiR%6KSÛ\rÎ·õ¶³\u007f4»ÝÜèL6(JDì\u009btð4\u0013\tÖ¿\u001dò´ÆåcAdñg|¨Däý-\u0086L\u0014þõ\u001f\u001e\\Mç\u0002ÿ/ ¦>QäUyPÕÈ?>]¥ñ\u0005Wþ)(Í\n\fØz×0À\u0090`\u001a\u009b¹ \"Å\u009eÐ¢y\u0011*ù\u0005ìj ÀÆlQ\u0089 +y\b½Þ]|í\u0006öaÛö`\u0082ÞÃZÊ8¼Qê(¡±ÇÀ&uSÚgð\u0082W\u0087úþ\u001c{\u008e\u0092<W;¿\u0088¹\u0001Åf\u0084\u009eú\u0091\u007f«L¦¤³<{ZOsß½¯]]@°l\u009b\u0007\u0001\u0097jf\u0012è#\u007fÆÉ\u000e%´â³ã-\u00add\u0085&STó²'>}\"\u001b\tä\u0003\u0010éèÛê\u009a~c\u0000¯¯Æmtv\u0016:"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     j = var20;
                     m = new String[26];
                     u = new HashMap(13);
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
                     String var4 = "í³F\\\u008døE\u0017¿q»V\u0015XÕt";
                     int var5 = "í³F\\\u008døE\u0017¿q»V\u0015XÕt".length();
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

                     s = var6;
                     t = new Integer[2];
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

                  var17 = "ðÇìd\tÐA5« \\dÜ¢Êu@\u000f}$$\u0084àü6\r\u0016\u0084\\ÿ\"ÐK\u008d grôÓ\u0003uAxÉµ\u0013nn±Ô\u0017M\r`{Õ#ø\u0016=\u0019\fã\u0001H¢n¢©áxMF2\u0082Ø+®ï\u0014öG{¦\u0003©\u000f²¼3¢Á\u000b\u0096FYÊ\u00020z\u0010V\u008f«§Õ×\u0001Ù,Æ\u0092¤÷\u009c\u0084µÄh@\u0089 Tî\u001caëX\u00adý\u0016Vhç\u009c\u001b\u0012";
                  var19 = "ðÇìd\tÐA5« \\dÜ¢Êu@\u000f}$$\u0084àü6\r\u0016\u0084\\ÿ\"ÐK\u008d grôÓ\u0003uAxÉµ\u0013nn±Ô\u0017M\r`{Õ#ø\u0016=\u0019\fã\u0001H¢n¢©áxMF2\u0082Ø+®ï\u0014öG{¦\u0003©\u000f²¼3¢Á\u000b\u0096FYÊ\u00020z\u0010V\u008f«§Õ×\u0001Ù,Æ\u0092¤÷\u009c\u0084µÄh@\u0089 Tî\u001caëX\u00adý\u0016Vhç\u009c\u001b\u0012"
                     .length();
                  var16 = '@';
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4755;
      if (m[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])n.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/pw", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = j[var5].getBytes("ISO-8859-1");
         m[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return m[var5];
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
         throw new RuntimeException("com/zelix/pw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25009;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/pw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/pw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
