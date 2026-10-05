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
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _xi {
   private final w p;
   private final Set n;
   private final Object I;
   private final Object L;
   private final hz[] w;
   private final _ug C;
   private final Set V;
   private final Set F;
   private final w P;
   private final w O;
   private static final long a = ess.a(-7575627431371935657L, 1535387841937170059L, MethodHandles.lookup().lookupClass()).a(42331654998888L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public Object w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 7461838512799259716L, var2);
   }

   public Set D(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/_xi.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 56375744797778
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 86873822594253
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 123796214699492
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 112097238403632
      // 033: lxor
      // 034: lstore 11
      // 036: pop2
      // 037: ldc2_w -1896449677610223178
      // 03a: lload 3
      // 03b: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aload 0
      // 041: ldc2_w -2211528863561151253
      // 044: lload 3
      // 045: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: lload 7
      // 04c: aload 2
      // 04d: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 050: astore 14
      // 052: astore 13
      // 054: aload 14
      // 056: aload 13
      // 058: ifnonnull 09c
      // 05b: ifnonnull 09a
      // 05e: goto 06b
      // 061: ldc2_w -2110829582150211061
      // 064: lload 3
      // 065: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: lload 11
      // 06d: getstatic com/zelix/_xi.e J
      // 070: l2i
      // 071: bipush 2
      // 072: anewarray 122
      // 075: dup_x1
      // 076: swap
      // 077: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07a: bipush 1
      // 07b: swap
      // 07c: aastore
      // 07d: dup_x2
      // 07e: dup_x2
      // 07f: pop
      // 080: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 083: bipush 0
      // 084: swap
      // 085: aastore
      // 086: ldc2_w -514211402297869879
      // 089: lload 3
      // 08a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: areturn
      // 090: ldc2_w -2110829582150211061
      // 093: lload 3
      // 094: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: aload 14
      // 09c: invokeinterface java/util/Set.size ()I 1
      // 0a1: lload 9
      // 0a3: invokestatic com/zelix/sh.Q (IJ)I
      // 0a6: lload 11
      // 0a8: dup2_x1
      // 0a9: pop2
      // 0aa: bipush 2
      // 0ab: anewarray 122
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b3: bipush 1
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x2
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bc: bipush 0
      // 0bd: swap
      // 0be: aastore
      // 0bf: ldc2_w -514211402297869879
      // 0c2: lload 3
      // 0c3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: astore 15
      // 0ca: aload 14
      // 0cc: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d1: astore 16
      // 0d3: aload 16
      // 0d5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0da: ifeq 11b
      // 0dd: aload 16
      // 0df: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e4: checkcast com/zelix/iz
      // 0e7: astore 17
      // 0e9: lload 3
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: iflt 103
      // 0ef: aload 15
      // 0f1: aload 13
      // 0f3: ifnonnull 11d
      // 0f6: aload 17
      // 0f8: lload 5
      // 0fa: invokevirtual com/zelix/iz.w (J)Ljava/lang/String;
      // 0fd: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 102: pop
      // 103: aload 13
      // 105: ifnull 0d3
      // 108: lload 3
      // 109: lconst_0
      // 10a: lcmp
      // 10b: iflt 0e9
      // 10e: goto 11b
      // 111: ldc2_w -2110829582150211061
      // 114: lload 3
      // 115: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 15
      // 11d: areturn
   }

   public Set x(Object[] var1) {
      long var3 = (Long)var1[0];
      hz var2 = (hz)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 91780050111902L;
      long var7 = var3 ^ 119762402679991L;
      long var9 = var3 ^ 133627070219107L;
      long var11 = var3 ^ 68633389586539L;
      hk[] var10000 = x44.a<"q">(3241863215893557477L, var3);
      Set var14 = x44.a<"m">(this, 2999467599928689307L, var3).N(var5, var2);
      Object[] var10004 = new Object[]{null, sh.Q(var14.size(), var7)};
      var10004[0] = var9;
      HashSet var15 = x44.a<"q">(var10004, 3570856494130442394L, var3);
      hk[] var13 = var10000;

      for (iu var17 : var14) {
         do {
            try {
               if (var3 > 0L) {
                  if (var13 != null) {
                     return var15;
                  }

                  var15.add(var17.G(var11));
               }

               if (var13 == null) {
                  break;
               }
            } catch (gj var18) {
               throw x44.a<"q">(var18, 3163725783035421528L, var3);
            }
         } while (var3 < 0L);
         break;
      }

      return var15;
   }

   public _xi(hz[] param1, _ug param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_xi.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 76428925047521
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 2968992284075
      // 012: lxor
      // 013: dup2
      // 014: bipush 56
      // 016: lushr
      // 017: l2i
      // 018: istore 7
      // 01a: dup2
      // 01b: bipush 8
      // 01d: lshl
      // 01e: bipush 32
      // 020: lushr
      // 021: l2i
      // 022: istore 8
      // 024: dup2
      // 025: bipush 40
      // 027: lshl
      // 028: bipush 40
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 9
      // 02e: pop2
      // 02f: dup2
      // 030: ldc2_w 41837648723179
      // 033: lxor
      // 034: lstore 10
      // 036: dup2
      // 037: ldc2_w 5846317175605
      // 03a: lxor
      // 03b: lstore 12
      // 03d: dup2
      // 03e: ldc2_w 63887679170510
      // 041: lxor
      // 042: lstore 14
      // 044: dup2
      // 045: ldc2_w 88952523984181
      // 048: lxor
      // 049: lstore 16
      // 04b: dup2
      // 04c: ldc2_w 9269016902289
      // 04f: lxor
      // 050: lstore 18
      // 052: dup2
      // 053: ldc2_w 326399894877
      // 056: lxor
      // 057: lstore 20
      // 059: pop2
      // 05a: ldc2_w -6725211225843024205
      // 05d: lload 3
      // 05e: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aload 0
      // 064: invokespecial java/lang/Object.<init> ()V
      // 067: aload 0
      // 068: new java/lang/Object
      // 06b: dup
      // 06c: invokespecial java/lang/Object.<init> ()V
      // 06f: putfield com/zelix/_xi.L Ljava/lang/Object;
      // 072: aload 0
      // 073: new java/lang/Object
      // 076: dup
      // 077: invokespecial java/lang/Object.<init> ()V
      // 07a: putfield com/zelix/_xi.I Ljava/lang/Object;
      // 07d: aload 1
      // 07e: arraylength
      // 07f: istore 23
      // 081: aload 0
      // 082: iload 23
      // 084: lload 5
      // 086: invokestatic com/zelix/sh.Q (IJ)I
      // 089: lload 16
      // 08b: dup2_x1
      // 08c: pop2
      // 08d: bipush 2
      // 08e: anewarray 122
      // 091: dup_x1
      // 092: swap
      // 093: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 096: bipush 1
      // 097: swap
      // 098: aastore
      // 099: dup_x2
      // 09a: dup_x2
      // 09b: pop
      // 09c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09f: bipush 0
      // 0a0: swap
      // 0a1: aastore
      // 0a2: ldc2_w -4622924808447902004
      // 0a5: lload 3
      // 0a6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: putfield com/zelix/_xi.n Ljava/util/Set;
      // 0ae: aload 1
      // 0af: astore 24
      // 0b1: astore 22
      // 0b3: aload 24
      // 0b5: arraylength
      // 0b6: istore 25
      // 0b8: bipush 0
      // 0b9: istore 26
      // 0bb: iload 26
      // 0bd: iload 25
      // 0bf: if_icmpge 185
      // 0c2: aload 24
      // 0c4: iload 26
      // 0c6: aaload
      // 0c7: astore 27
      // 0c9: aload 0
      // 0ca: ldc2_w -5158710918109549815
      // 0cd: lload 3
      // 0ce: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: aload 27
      // 0d5: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0da: istore 28
      // 0dc: aload 22
      // 0de: lload 3
      // 0df: lconst_0
      // 0e0: lcmp
      // 0e1: iflt 182
      // 0e4: ifnonnull 180
      // 0e7: aload 27
      // 0e9: lload 12
      // 0eb: invokevirtual com/zelix/hz.B (J)Z
      // 0ee: aload 22
      // 0f0: ifnonnull 1c2
      // 0f3: goto 100
      // 0f6: ldc2_w -6507166305185452786
      // 0f9: lload 3
      // 0fa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: ifeq 17d
      // 103: goto 110
      // 106: ldc2_w -6507166305185452786
      // 109: lload 3
      // 10a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: aload 27
      // 112: lload 20
      // 114: bipush 1
      // 115: anewarray 122
      // 118: dup_x2
      // 119: dup_x2
      // 11a: pop
      // 11b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11e: bipush 0
      // 11f: swap
      // 120: aastore
      // 121: ldc2_w -4671699868263483032
      // 124: lload 3
      // 125: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 12f: astore 29
      // 131: aload 29
      // 133: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 138: ifeq 17d
      // 13b: aload 29
      // 13d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 142: checkcast com/zelix/hz
      // 145: astore 30
      // 147: aload 0
      // 148: ldc2_w -5158710918109549815
      // 14b: lload 3
      // 14c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: aload 30
      // 153: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 158: istore 28
      // 15a: aload 22
      // 15c: lload 3
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 167
      // 162: ifnonnull 180
      // 165: aload 22
      // 167: ifnull 131
      // 16a: lload 3
      // 16b: lconst_0
      // 16c: lcmp
      // 16d: ifle 15a
      // 170: goto 17d
      // 173: ldc2_w -6507166305185452786
      // 176: lload 3
      // 177: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: iinc 26 1
      // 180: aload 22
      // 182: ifnull 0bb
      // 185: aload 0
      // 186: aload 0
      // 187: ldc2_w -5158710918109549815
      // 18a: lload 3
      // 18b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: aload 0
      // 191: ldc2_w -5158710918109549815
      // 194: lload 3
      // 195: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: invokeinterface java/util/Set.size ()I 1
      // 19f: anewarray 37
      // 1a2: ldc2_w -6887896693964049002
      // 1a5: lload 3
      // 1a6: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: checkcast [Lcom/zelix/hz;
      // 1ae: putfield com/zelix/_xi.w [Lcom/zelix/hz;
      // 1b1: aload 0
      // 1b2: ldc2_w -4994112126223525774
      // 1b5: lload 3
      // 1b6: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: lload 3
      // 1bc: lconst_0
      // 1bd: lcmp
      // 1be: iflt 0c4
      // 1c1: arraylength
      // 1c2: istore 23
      // 1c4: aload 0
      // 1c5: aload 2
      // 1c6: putfield com/zelix/_xi.C Lcom/zelix/_ug;
      // 1c9: aload 0
      // 1ca: lload 14
      // 1cc: bipush 1
      // 1cd: anewarray 122
      // 1d0: dup_x2
      // 1d1: dup_x2
      // 1d2: pop
      // 1d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d6: bipush 0
      // 1d7: swap
      // 1d8: aastore
      // 1d9: ldc2_w -6356012997899964922
      // 1dc: lload 3
      // 1dd: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: putfield com/zelix/_xi.V Ljava/util/Set;
      // 1e5: aload 0
      // 1e6: lload 14
      // 1e8: bipush 1
      // 1e9: anewarray 122
      // 1ec: dup_x2
      // 1ed: dup_x2
      // 1ee: pop
      // 1ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f2: bipush 0
      // 1f3: swap
      // 1f4: aastore
      // 1f5: ldc2_w -6356012997899964922
      // 1f8: lload 3
      // 1f9: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: putfield com/zelix/_xi.F Ljava/util/Set;
      // 201: new com/zelix/w
      // 204: dup
      // 205: iload 23
      // 207: iload 7
      // 209: i2b
      // 20a: iload 8
      // 20c: iload 9
      // 20e: invokespecial com/zelix/w.<init> (IBII)V
      // 211: astore 24
      // 213: new com/zelix/w
      // 216: dup
      // 217: iload 23
      // 219: iload 7
      // 21b: i2b
      // 21c: iload 8
      // 21e: iload 9
      // 220: invokespecial com/zelix/w.<init> (IBII)V
      // 223: astore 25
      // 225: new com/zelix/w
      // 228: dup
      // 229: iload 23
      // 22b: iload 7
      // 22d: i2b
      // 22e: iload 8
      // 230: iload 9
      // 232: invokespecial com/zelix/w.<init> (IBII)V
      // 235: astore 26
      // 237: aload 0
      // 238: aload 24
      // 23a: aload 25
      // 23c: lload 18
      // 23e: aload 26
      // 240: bipush 4
      // 241: anewarray 122
      // 244: dup_x1
      // 245: swap
      // 246: bipush 3
      // 247: swap
      // 248: aastore
      // 249: dup_x2
      // 24a: dup_x2
      // 24b: pop
      // 24c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24f: bipush 2
      // 250: swap
      // 251: aastore
      // 252: dup_x1
      // 253: swap
      // 254: bipush 1
      // 255: swap
      // 256: aastore
      // 257: dup_x1
      // 258: swap
      // 259: bipush 0
      // 25a: swap
      // 25b: aastore
      // 25c: ldc2_w -5168868680458707040
      // 25f: lload 3
      // 260: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: aload 0
      // 266: new com/zelix/w
      // 269: dup
      // 26a: iload 23
      // 26c: iload 7
      // 26e: i2b
      // 26f: iload 8
      // 271: iload 9
      // 273: invokespecial com/zelix/w.<init> (IBII)V
      // 276: putfield com/zelix/_xi.p Lcom/zelix/w;
      // 279: aload 0
      // 27a: new com/zelix/w
      // 27d: dup
      // 27e: iload 23
      // 280: iload 7
      // 282: i2b
      // 283: iload 8
      // 285: iload 9
      // 287: invokespecial com/zelix/w.<init> (IBII)V
      // 28a: putfield com/zelix/_xi.P Lcom/zelix/w;
      // 28d: aload 0
      // 28e: new com/zelix/w
      // 291: dup
      // 292: iload 23
      // 294: iload 7
      // 296: i2b
      // 297: iload 8
      // 299: iload 9
      // 29b: invokespecial com/zelix/w.<init> (IBII)V
      // 29e: putfield com/zelix/_xi.O Lcom/zelix/w;
      // 2a1: aload 0
      // 2a2: lload 10
      // 2a4: aload 24
      // 2a6: aload 25
      // 2a8: aload 26
      // 2aa: bipush 4
      // 2ab: anewarray 122
      // 2ae: dup_x1
      // 2af: swap
      // 2b0: bipush 3
      // 2b1: swap
      // 2b2: aastore
      // 2b3: dup_x1
      // 2b4: swap
      // 2b5: bipush 2
      // 2b6: swap
      // 2b7: aastore
      // 2b8: dup_x1
      // 2b9: swap
      // 2ba: bipush 1
      // 2bb: swap
      // 2bc: aastore
      // 2bd: dup_x2
      // 2be: dup_x2
      // 2bf: pop
      // 2c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c3: bipush 0
      // 2c4: swap
      // 2c5: aastore
      // 2c6: ldc2_w -6771453118310433714
      // 2c9: lload 3
      // 2ca: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: return
   }

   public Object d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 2804863355962912599L, var2);
   }

   public void v(Object[] param1) {
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
      // 0e: checkcast com/zelix/iu
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/_xi.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 32062109933360
      // 1e: lxor
      // 1f: lstore 5
      // 21: dup2
      // 22: ldc2_w 41379230259905
      // 25: lxor
      // 26: lstore 7
      // 28: dup2
      // 29: ldc2_w 64331314000405
      // 2c: lxor
      // 2d: lstore 9
      // 2f: dup2
      // 30: ldc2_w 57265456225739
      // 33: lxor
      // 34: lstore 11
      // 36: pop2
      // 37: ldc2_w -4732395648838983093
      // 3a: lload 3
      // 3b: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: aload 2
      // 41: lload 9
      // 43: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 46: astore 14
      // 48: astore 13
      // 4a: aload 14
      // 4c: lload 7
      // 4e: invokevirtual com/zelix/hz.d (J)Z
      // 51: aload 13
      // 53: ifnonnull 83
      // 56: ifeq 85
      // 59: goto 66
      // 5c: ldc2_w -5095399089400008202
      // 5f: lload 3
      // 60: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 0
      // 67: ldc2_w -6684752557426201788
      // 6a: lload 3
      // 6b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: aload 2
      // 71: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 76: goto 83
      // 79: ldc2_w -5095399089400008202
      // 7c: lload 3
      // 7d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: istore 15
      // 85: aload 0
      // 86: ldc2_w -5033433737462148260
      // 89: lload 3
      // 8a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: lload 5
      // 91: aload 14
      // 93: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 96: astore 15
      // 98: aload 15
      // 9a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 9f: astore 16
      // a1: aload 16
      // a3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a8: ifeq d0
      // ab: aload 16
      // ad: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b2: checkcast com/zelix/hz
      // b5: astore 17
      // b7: aload 0
      // b8: ldc2_w -4967908321723969483
      // bb: lload 3
      // bc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: lload 11
      // c3: aload 17
      // c5: aload 2
      // c6: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // c9: istore 18
      // cb: aload 13
      // cd: ifnull a1
      // d0: return
   }

   public void I(Object[] param1) {
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
      // 04: checkcast com/zelix/iz
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/_xi.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 66853762158416
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 4702087449249
      // 26: lxor
      // 27: lstore 7
      // 29: dup2
      // 2a: ldc2_w 30128609223285
      // 2d: lxor
      // 2e: lstore 9
      // 30: dup2
      // 31: ldc2_w 24127905697195
      // 34: lxor
      // 35: lstore 11
      // 37: pop2
      // 38: ldc2_w 3329012107060163115
      // 3b: lload 2
      // 3c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: aload 4
      // 43: lload 9
      // 45: invokevirtual com/zelix/iz.d (J)Lcom/zelix/hz;
      // 48: astore 14
      // 4a: astore 13
      // 4c: aload 14
      // 4e: lload 7
      // 50: invokevirtual com/zelix/hz.d (J)Z
      // 53: aload 13
      // 55: ifnonnull 86
      // 58: ifeq 88
      // 5b: goto 68
      // 5e: ldc2_w 2966078175712649622
      // 61: lload 2
      // 62: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 0
      // 69: ldc2_w 3068923514065405274
      // 6c: lload 2
      // 6d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: aload 4
      // 74: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 79: goto 86
      // 7c: ldc2_w 2966078175712649622
      // 7f: lload 2
      // 80: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: istore 15
      // 88: aload 0
      // 89: ldc2_w 3045989481561228092
      // 8c: lload 2
      // 8d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: lload 5
      // 94: aload 14
      // 96: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 99: astore 15
      // 9b: aload 15
      // 9d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // a2: astore 16
      // a4: aload 16
      // a6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // ab: ifeq d4
      // ae: aload 16
      // b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b5: checkcast com/zelix/hz
      // b8: astore 17
      // ba: aload 0
      // bb: ldc2_w 3085636413639804790
      // be: lload 2
      // bf: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: lload 11
      // c6: aload 17
      // c8: aload 4
      // ca: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // cd: istore 18
      // cf: aload 13
      // d1: ifnull a4
      // d4: return
   }

   private void H(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/List
      // 00e: astore 9
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/w
      // 016: astore 4
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/util/List
      // 01e: astore 10
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast com/zelix/w
      // 026: astore 13
      // 028: dup
      // 029: bipush 5
      // 02a: aaload
      // 02b: checkcast java/util/List
      // 02e: astore 8
      // 030: dup
      // 031: bipush 6
      // 033: aaload
      // 034: checkcast com/zelix/w
      // 037: astore 2
      // 038: dup
      // 039: bipush 7
      // 03b: aaload
      // 03c: checkcast java/util/Set
      // 03f: astore 11
      // 041: dup
      // 042: bipush 8
      // 044: aaload
      // 045: checkcast java/util/Set
      // 048: astore 12
      // 04a: dup
      // 04b: bipush 9
      // 04d: aaload
      // 04e: checkcast java/lang/Long
      // 051: invokevirtual java/lang/Long.longValue ()J
      // 054: lstore 6
      // 056: dup
      // 057: bipush 10
      // 059: aaload
      // 05a: checkcast java/lang/String
      // 05d: astore 5
      // 05f: pop
      // 060: getstatic com/zelix/_xi.a J
      // 063: lload 6
      // 065: lxor
      // 066: lstore 6
      // 068: lload 6
      // 06a: dup2
      // 06b: ldc2_w 62112128751787
      // 06e: lxor
      // 06f: lstore 14
      // 071: dup2
      // 072: ldc2_w 109786223112706
      // 075: lxor
      // 076: lstore 16
      // 078: dup2
      // 079: ldc2_w 122483562580184
      // 07c: lxor
      // 07d: lstore 18
      // 07f: dup2
      // 080: ldc2_w 118925176241738
      // 083: lxor
      // 084: lstore 20
      // 086: dup2
      // 087: ldc2_w 96682897526057
      // 08a: lxor
      // 08b: lstore 22
      // 08d: dup2
      // 08e: ldc2_w 52391917172393
      // 091: lxor
      // 092: lstore 24
      // 094: dup2
      // 095: ldc2_w 52130157980894
      // 098: lxor
      // 099: lstore 26
      // 09b: dup2
      // 09c: ldc2_w 27836753923323
      // 09f: lxor
      // 0a0: lstore 28
      // 0a2: dup2
      // 0a3: ldc2_w 48678819575292
      // 0a6: lxor
      // 0a7: dup2
      // 0a8: bipush 32
      // 0aa: lushr
      // 0ab: l2i
      // 0ac: istore 30
      // 0ae: dup2
      // 0af: bipush 32
      // 0b1: lshl
      // 0b2: bipush 48
      // 0b4: lushr
      // 0b5: l2i
      // 0b6: istore 31
      // 0b8: dup2
      // 0b9: bipush 48
      // 0bb: lshl
      // 0bc: bipush 48
      // 0be: lushr
      // 0bf: l2i
      // 0c0: istore 32
      // 0c2: pop2
      // 0c3: dup2
      // 0c4: ldc2_w 111276297256460
      // 0c7: lxor
      // 0c8: lstore 33
      // 0ca: dup2
      // 0cb: ldc2_w 24613258532706
      // 0ce: lxor
      // 0cf: lstore 35
      // 0d1: pop2
      // 0d2: ldc2_w -1604594868715752029
      // 0d5: lload 6
      // 0d7: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: aload 4
      // 0de: lload 18
      // 0e0: aload 3
      // 0e1: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 0e4: astore 38
      // 0e6: astore 37
      // 0e8: aload 38
      // 0ea: aload 37
      // 0ec: ifnonnull 5f7
      // 0ef: ifnonnull 5e7
      // 0f2: goto 100
      // 0f5: ldc2_w -1251451169555356130
      // 0f8: lload 6
      // 0fa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: lload 26
      // 102: bipush 1
      // 103: anewarray 122
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 0
      // 10d: swap
      // 10e: aastore
      // 10f: ldc2_w -1379523528750504682
      // 112: lload 6
      // 114: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: astore 39
      // 11b: aload 4
      // 11d: aload 3
      // 11e: aload 39
      // 120: bipush 2
      // 121: anewarray 122
      // 124: dup_x1
      // 125: swap
      // 126: bipush 1
      // 127: swap
      // 128: aastore
      // 129: dup_x1
      // 12a: swap
      // 12b: bipush 0
      // 12c: swap
      // 12d: aastore
      // 12e: ldc2_w -1300161119388890678
      // 131: lload 6
      // 133: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: astore 40
      // 13a: new java/util/ArrayList
      // 13d: dup
      // 13e: aload 9
      // 140: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 143: astore 41
      // 145: aload 41
      // 147: aload 39
      // 149: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14e: pop
      // 14f: lload 26
      // 151: bipush 1
      // 152: anewarray 122
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 0
      // 15c: swap
      // 15d: aastore
      // 15e: ldc2_w -1379523528750504682
      // 161: lload 6
      // 163: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: astore 42
      // 16a: aload 13
      // 16c: aload 3
      // 16d: aload 42
      // 16f: bipush 2
      // 170: anewarray 122
      // 173: dup_x1
      // 174: swap
      // 175: bipush 1
      // 176: swap
      // 177: aastore
      // 178: dup_x1
      // 179: swap
      // 17a: bipush 0
      // 17b: swap
      // 17c: aastore
      // 17d: ldc2_w -1300161119388890678
      // 180: lload 6
      // 182: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: astore 43
      // 189: new java/util/ArrayList
      // 18c: dup
      // 18d: aload 10
      // 18f: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 192: astore 44
      // 194: aload 44
      // 196: aload 42
      // 198: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 19d: pop
      // 19e: aload 3
      // 19f: lload 20
      // 1a1: bipush 1
      // 1a2: anewarray 122
      // 1a5: dup_x2
      // 1a6: dup_x2
      // 1a7: pop
      // 1a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ab: bipush 0
      // 1ac: swap
      // 1ad: aastore
      // 1ae: ldc2_w -810799485961696798
      // 1b1: lload 6
      // 1b3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/iz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: astore 45
      // 1ba: bipush 0
      // 1bb: istore 46
      // 1bd: iload 46
      // 1bf: aload 45
      // 1c1: arraylength
      // 1c2: if_icmpge 25d
      // 1c5: aload 45
      // 1c7: iload 46
      // 1c9: aaload
      // 1ca: astore 47
      // 1cc: aload 37
      // 1ce: ifnonnull 748
      // 1d1: bipush 0
      // 1d2: istore 48
      // 1d4: iload 48
      // 1d6: aload 44
      // 1d8: invokeinterface java/util/List.size ()I 1
      // 1dd: if_icmpge 221
      // 1e0: aload 44
      // 1e2: iload 48
      // 1e4: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1e9: checkcast java/util/Set
      // 1ec: astore 49
      // 1ee: aload 49
      // 1f0: aload 47
      // 1f2: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1f7: pop
      // 1f8: iinc 48 1
      // 1fb: aload 37
      // 1fd: lload 6
      // 1ff: lconst_0
      // 200: lcmp
      // 201: iflt 25a
      // 204: ifnonnull 258
      // 207: aload 37
      // 209: ifnull 1d4
      // 20c: lload 6
      // 20e: lconst_0
      // 20f: lcmp
      // 210: ifle 1fb
      // 213: goto 221
      // 216: ldc2_w -1251451169555356130
      // 219: lload 6
      // 21b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 3
      // 222: lload 22
      // 224: invokevirtual com/zelix/hz.d (J)Z
      // 227: aload 37
      // 229: ifnonnull 254
      // 22c: ifeq 255
      // 22f: goto 23d
      // 232: ldc2_w -1251451169555356130
      // 235: lload 6
      // 237: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: aload 11
      // 23f: aload 47
      // 241: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 246: goto 254
      // 249: ldc2_w -1251451169555356130
      // 24c: lload 6
      // 24e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: athrow
      // 254: pop
      // 255: iinc 46 1
      // 258: aload 37
      // 25a: ifnull 1bd
      // 25d: lload 26
      // 25f: bipush 1
      // 260: anewarray 122
      // 263: dup_x2
      // 264: dup_x2
      // 265: pop
      // 266: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 269: bipush 0
      // 26a: swap
      // 26b: aastore
      // 26c: ldc2_w -1379523528750504682
      // 26f: lload 6
      // 271: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: astore 46
      // 278: aload 2
      // 279: aload 3
      // 27a: aload 46
      // 27c: bipush 2
      // 27d: anewarray 122
      // 280: dup_x1
      // 281: swap
      // 282: bipush 1
      // 283: swap
      // 284: aastore
      // 285: dup_x1
      // 286: swap
      // 287: bipush 0
      // 288: swap
      // 289: aastore
      // 28a: ldc2_w -1300161119388890678
      // 28d: lload 6
      // 28f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: astore 47
      // 296: new java/util/ArrayList
      // 299: dup
      // 29a: aload 8
      // 29c: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 29f: astore 48
      // 2a1: aload 48
      // 2a3: aload 46
      // 2a5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2aa: pop
      // 2ab: aload 3
      // 2ac: lload 33
      // 2ae: invokevirtual com/zelix/hz.n (J)[Lcom/zelix/iu;
      // 2b1: astore 49
      // 2b3: lload 6
      // 2b5: lconst_0
      // 2b6: lcmp
      // 2b7: ifle 748
      // 2ba: bipush 0
      // 2bb: istore 50
      // 2bd: iload 50
      // 2bf: aload 49
      // 2c1: arraylength
      // 2c2: if_icmpge 372
      // 2c5: aload 49
      // 2c7: iload 50
      // 2c9: aaload
      // 2ca: astore 51
      // 2cc: aload 3
      // 2cd: lload 22
      // 2cf: invokevirtual com/zelix/hz.d (J)Z
      // 2d2: lload 6
      // 2d4: lconst_0
      // 2d5: lcmp
      // 2d6: iflt 3a3
      // 2d9: aload 37
      // 2db: ifnonnull 3a3
      // 2de: aload 37
      // 2e0: ifnonnull 31b
      // 2e3: goto 2f1
      // 2e6: ldc2_w -1251451169555356130
      // 2e9: lload 6
      // 2eb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: athrow
      // 2f1: ifeq 31a
      // 2f4: goto 302
      // 2f7: ldc2_w -1251451169555356130
      // 2fa: lload 6
      // 2fc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 301: athrow
      // 302: aload 12
      // 304: aload 51
      // 306: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 30b: pop
      // 30c: goto 31a
      // 30f: ldc2_w -1251451169555356130
      // 312: lload 6
      // 314: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: athrow
      // 31a: bipush 0
      // 31b: istore 52
      // 31d: iload 52
      // 31f: aload 48
      // 321: invokeinterface java/util/List.size ()I 1
      // 326: if_icmpge 36a
      // 329: aload 48
      // 32b: iload 52
      // 32d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 332: checkcast java/util/Set
      // 335: astore 53
      // 337: aload 53
      // 339: aload 51
      // 33b: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 340: pop
      // 341: iinc 52 1
      // 344: aload 37
      // 346: lload 6
      // 348: lconst_0
      // 349: lcmp
      // 34a: iflt 36f
      // 34d: ifnonnull 36d
      // 350: aload 37
      // 352: ifnull 31d
      // 355: lload 6
      // 357: lconst_0
      // 358: lcmp
      // 359: ifle 344
      // 35c: goto 36a
      // 35f: ldc2_w -1251451169555356130
      // 362: lload 6
      // 364: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: athrow
      // 36a: iinc 50 1
      // 36d: aload 37
      // 36f: ifnull 2bd
      // 372: aload 3
      // 373: lload 16
      // 375: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 378: lload 6
      // 37a: lconst_0
      // 37b: lcmp
      // 37c: ifle 3b1
      // 37f: aload 37
      // 381: ifnonnull 3bf
      // 384: sipush 27940
      // 387: ldc2_w 7156035263678243878
      // 38a: lload 6
      // 38c: lxor
      // 38d: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/_xi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 395: goto 3a3
      // 398: ldc2_w -1251451169555356130
      // 39b: lload 6
      // 39d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a2: athrow
      // 3a3: ifne 5db
      // 3a6: aload 3
      // 3a7: iload 30
      // 3a9: iload 31
      // 3ab: iload 32
      // 3ad: i2c
      // 3ae: invokevirtual com/zelix/hz.O (IIC)Ljava/lang/String;
      // 3b1: goto 3bf
      // 3b4: ldc2_w -1251451169555356130
      // 3b7: lload 6
      // 3b9: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: athrow
      // 3bf: astore 50
      // 3c1: aload 3
      // 3c2: aload 37
      // 3c4: lload 6
      // 3c6: lconst_0
      // 3c7: lcmp
      // 3c8: iflt 3f7
      // 3cb: ifnonnull 3f3
      // 3ce: lload 28
      // 3d0: invokevirtual com/zelix/hz.K (J)Z
      // 3d3: ifeq 404
      // 3d6: goto 3e4
      // 3d9: ldc2_w -1251451169555356130
      // 3dc: lload 6
      // 3de: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: athrow
      // 3e4: aload 3
      // 3e5: goto 3f3
      // 3e8: ldc2_w -1251451169555356130
      // 3eb: lload 6
      // 3ed: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f2: athrow
      // 3f3: bipush 0
      // 3f4: anewarray 122
      // 3f7: ldc2_w -1559294603823983241
      // 3fa: lload 6
      // 3fc: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: goto 405
      // 404: aconst_null
      // 405: astore 51
      // 407: aload 0
      // 408: ldc2_w -861721220827863805
      // 40b: lload 6
      // 40d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ug; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 412: aload 50
      // 414: aload 51
      // 416: aload 5
      // 418: lload 35
      // 41a: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 41d: astore 52
      // 41f: aload 41
      // 421: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 426: astore 53
      // 428: aload 53
      // 42a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 42f: ifeq 46f
      // 432: aload 53
      // 434: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 439: checkcast java/util/Set
      // 43c: astore 54
      // 43e: aload 54
      // 440: aload 52
      // 442: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 447: istore 55
      // 449: aload 37
      // 44b: lload 6
      // 44d: lconst_0
      // 44e: lcmp
      // 44f: iflt 457
      // 452: ifnonnull 4d4
      // 455: aload 37
      // 457: ifnull 428
      // 45a: lload 6
      // 45c: lconst_0
      // 45d: lcmp
      // 45e: ifle 449
      // 461: goto 46f
      // 464: ldc2_w -1251451169555356130
      // 467: lload 6
      // 469: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46e: athrow
      // 46f: aload 0
      // 470: aload 52
      // 472: aload 41
      // 474: aload 4
      // 476: aload 44
      // 478: aload 13
      // 47a: aload 48
      // 47c: aload 2
      // 47d: aload 11
      // 47f: aload 12
      // 481: lload 14
      // 483: aload 5
      // 485: bipush 11
      // 487: anewarray 122
      // 48a: dup_x1
      // 48b: swap
      // 48c: bipush 10
      // 48e: swap
      // 48f: aastore
      // 490: dup_x2
      // 491: dup_x2
      // 492: pop
      // 493: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 496: bipush 9
      // 498: swap
      // 499: aastore
      // 49a: dup_x1
      // 49b: swap
      // 49c: bipush 8
      // 49e: swap
      // 49f: aastore
      // 4a0: dup_x1
      // 4a1: swap
      // 4a2: bipush 7
      // 4a4: swap
      // 4a5: aastore
      // 4a6: dup_x1
      // 4a7: swap
      // 4a8: bipush 6
      // 4aa: swap
      // 4ab: aastore
      // 4ac: dup_x1
      // 4ad: swap
      // 4ae: bipush 5
      // 4af: swap
      // 4b0: aastore
      // 4b1: dup_x1
      // 4b2: swap
      // 4b3: bipush 4
      // 4b4: swap
      // 4b5: aastore
      // 4b6: dup_x1
      // 4b7: swap
      // 4b8: bipush 3
      // 4b9: swap
      // 4ba: aastore
      // 4bb: dup_x1
      // 4bc: swap
      // 4bd: bipush 2
      // 4be: swap
      // 4bf: aastore
      // 4c0: dup_x1
      // 4c1: swap
      // 4c2: bipush 1
      // 4c3: swap
      // 4c4: aastore
      // 4c5: dup_x1
      // 4c6: swap
      // 4c7: bipush 0
      // 4c8: swap
      // 4c9: aastore
      // 4ca: ldc2_w -855623113957769309
      // 4cd: lload 6
      // 4cf: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d4: aload 3
      // 4d5: lload 24
      // 4d7: bipush 1
      // 4d8: anewarray 122
      // 4db: dup_x2
      // 4dc: dup_x2
      // 4dd: pop
      // 4de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e1: bipush 0
      // 4e2: swap
      // 4e3: aastore
      // 4e4: ldc2_w -862861006779338299
      // 4e7: lload 6
      // 4e9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ee: astore 53
      // 4f0: bipush 0
      // 4f1: istore 54
      // 4f3: iload 54
      // 4f5: aload 53
      // 4f7: arraylength
      // 4f8: if_icmpge 5db
      // 4fb: aload 53
      // 4fd: iload 54
      // 4ff: aaload
      // 500: astore 55
      // 502: aload 0
      // 503: ldc2_w -861721220827863805
      // 506: lload 6
      // 508: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_ug; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50d: aload 55
      // 50f: aload 51
      // 511: aload 5
      // 513: lload 35
      // 515: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 518: astore 56
      // 51a: aload 37
      // 51c: ifnonnull 748
      // 51f: aload 41
      // 521: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 526: astore 57
      // 528: aload 57
      // 52a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 52f: ifeq 56e
      // 532: aload 57
      // 534: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 539: checkcast java/util/Set
      // 53c: astore 58
      // 53e: aload 58
      // 540: aload 56
      // 542: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 547: pop
      // 548: aload 37
      // 54a: lload 6
      // 54c: lconst_0
      // 54d: lcmp
      // 54e: ifle 5d8
      // 551: ifnonnull 5d6
      // 554: aload 37
      // 556: ifnull 528
      // 559: lload 6
      // 55b: lconst_0
      // 55c: lcmp
      // 55d: iflt 548
      // 560: goto 56e
      // 563: ldc2_w -1251451169555356130
      // 566: lload 6
      // 568: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56d: athrow
      // 56e: aload 0
      // 56f: aload 56
      // 571: aload 41
      // 573: aload 4
      // 575: aload 44
      // 577: aload 13
      // 579: aload 48
      // 57b: aload 2
      // 57c: aload 11
      // 57e: aload 12
      // 580: lload 14
      // 582: aload 5
      // 584: bipush 11
      // 586: anewarray 122
      // 589: dup_x1
      // 58a: swap
      // 58b: bipush 10
      // 58d: swap
      // 58e: aastore
      // 58f: dup_x2
      // 590: dup_x2
      // 591: pop
      // 592: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 595: bipush 9
      // 597: swap
      // 598: aastore
      // 599: dup_x1
      // 59a: swap
      // 59b: bipush 8
      // 59d: swap
      // 59e: aastore
      // 59f: dup_x1
      // 5a0: swap
      // 5a1: bipush 7
      // 5a3: swap
      // 5a4: aastore
      // 5a5: dup_x1
      // 5a6: swap
      // 5a7: bipush 6
      // 5a9: swap
      // 5aa: aastore
      // 5ab: dup_x1
      // 5ac: swap
      // 5ad: bipush 5
      // 5ae: swap
      // 5af: aastore
      // 5b0: dup_x1
      // 5b1: swap
      // 5b2: bipush 4
      // 5b3: swap
      // 5b4: aastore
      // 5b5: dup_x1
      // 5b6: swap
      // 5b7: bipush 3
      // 5b8: swap
      // 5b9: aastore
      // 5ba: dup_x1
      // 5bb: swap
      // 5bc: bipush 2
      // 5bd: swap
      // 5be: aastore
      // 5bf: dup_x1
      // 5c0: swap
      // 5c1: bipush 1
      // 5c2: swap
      // 5c3: aastore
      // 5c4: dup_x1
      // 5c5: swap
      // 5c6: bipush 0
      // 5c7: swap
      // 5c8: aastore
      // 5c9: ldc2_w -855623113957769309
      // 5cc: lload 6
      // 5ce: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d3: iinc 54 1
      // 5d6: aload 37
      // 5d8: ifnull 4f3
      // 5db: lload 6
      // 5dd: lconst_0
      // 5de: lcmp
      // 5df: ifle 748
      // 5e2: aload 37
      // 5e4: ifnull 748
      // 5e7: aload 38
      // 5e9: goto 5f7
      // 5ec: ldc2_w -1251451169555356130
      // 5ef: lload 6
      // 5f1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f6: athrow
      // 5f7: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 5fc: astore 39
      // 5fe: aload 39
      // 600: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 605: ifeq 65b
      // 608: aload 39
      // 60a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 60f: checkcast com/zelix/hz
      // 612: astore 40
      // 614: aload 9
      // 616: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 61b: astore 41
      // 61d: aload 41
      // 61f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 624: ifeq 64f
      // 627: aload 41
      // 629: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 62e: checkcast java/util/Set
      // 631: astore 42
      // 633: aload 42
      // 635: aload 40
      // 637: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 63c: istore 43
      // 63e: aload 37
      // 640: ifnonnull 5fe
      // 643: aload 37
      // 645: lload 6
      // 647: lconst_0
      // 648: lcmp
      // 649: iflt 60f
      // 64c: ifnull 61d
      // 64f: aload 37
      // 651: lload 6
      // 653: lconst_0
      // 654: lcmp
      // 655: iflt 62e
      // 658: ifnull 5fe
      // 65b: aload 13
      // 65d: lload 18
      // 65f: aload 3
      // 660: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 663: lload 6
      // 665: lconst_0
      // 666: lcmp
      // 667: ifle 60f
      // 66a: astore 39
      // 66c: aload 39
      // 66e: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 673: astore 40
      // 675: aload 40
      // 677: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 67c: ifeq 6d2
      // 67f: aload 40
      // 681: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 686: checkcast com/zelix/iz
      // 689: astore 41
      // 68b: bipush 0
      // 68c: istore 42
      // 68e: iload 42
      // 690: aload 10
      // 692: invokeinterface java/util/List.size ()I 1
      // 697: if_icmpge 6c6
      // 69a: aload 10
      // 69c: iload 42
      // 69e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6a3: checkcast java/util/Set
      // 6a6: astore 43
      // 6a8: aload 43
      // 6aa: aload 41
      // 6ac: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 6b1: pop
      // 6b2: iinc 42 1
      // 6b5: aload 37
      // 6b7: ifnonnull 675
      // 6ba: aload 37
      // 6bc: lload 6
      // 6be: lconst_0
      // 6bf: lcmp
      // 6c0: ifle 686
      // 6c3: ifnull 68e
      // 6c6: aload 37
      // 6c8: lload 6
      // 6ca: lconst_0
      // 6cb: lcmp
      // 6cc: iflt 6a3
      // 6cf: ifnull 675
      // 6d2: aload 2
      // 6d3: lload 18
      // 6d5: aload 3
      // 6d6: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 6d9: lload 6
      // 6db: lconst_0
      // 6dc: lcmp
      // 6dd: iflt 686
      // 6e0: astore 40
      // 6e2: aload 40
      // 6e4: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 6e9: astore 41
      // 6eb: aload 41
      // 6ed: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6f2: ifeq 748
      // 6f5: aload 41
      // 6f7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6fc: checkcast com/zelix/iu
      // 6ff: astore 42
      // 701: bipush 0
      // 702: istore 43
      // 704: iload 43
      // 706: aload 8
      // 708: invokeinterface java/util/List.size ()I 1
      // 70d: if_icmpge 73c
      // 710: aload 8
      // 712: iload 43
      // 714: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 719: checkcast java/util/Set
      // 71c: astore 44
      // 71e: aload 44
      // 720: aload 42
      // 722: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 727: pop
      // 728: iinc 43 1
      // 72b: aload 37
      // 72d: ifnonnull 6eb
      // 730: aload 37
      // 732: lload 6
      // 734: lconst_0
      // 735: lcmp
      // 736: iflt 6fc
      // 739: ifnull 704
      // 73c: aload 37
      // 73e: lload 6
      // 740: lconst_0
      // 741: lcmp
      // 742: iflt 719
      // 745: ifnull 6eb
      // 748: return
   }

   public Set v(Object[] var1) {
      long var3 = (Long)var1[0];
      hz var2 = (hz)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 18214677367919L;
      long var7 = var3 ^ 52528078533746L;
      long var9 = var3 ^ 51700692884806L;
      long var11 = var3 ^ 64190972330642L;
      hk[] var10000 = x44.a<"p">(3246016173215232276L, var3);
      Set var14 = x44.a<"l">(this, 2905239617879671658L, var3).N(var5, var2);
      hk[] var13 = var10000;
      Object[] var10003 = new Object[]{null, sh.Q(var14.size(), var9)};
      var10003[0] = var11;
      HashSet var15 = x44.a<"p">(var10003, 3494644766016909675L, var3);

      for (iu var17 : var14) {
         do {
            try {
               if (var3 > 0L) {
                  if (var13 != null) {
                     return var15;
                  }

                  var15.add(var17.s(var7));
               }

               if (var13 == null) {
                  break;
               }
            } catch (gj var18) {
               throw x44.a<"p">(var18, 3032765604286505641L, var3);
            }
         } while (var3 < 0L);
         break;
      }

      return var15;
   }

   private void d(Object[] param1) {
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
      // 00a: lstore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/w
      // 012: astore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/w
      // 01a: astore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/w
      // 021: astore 2
      // 022: pop
      // 023: getstatic com/zelix/_xi.a J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 110394042689416
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 31627213576683
      // 038: lxor
      // 039: dup2
      // 03a: bipush 56
      // 03c: lushr
      // 03d: l2i
      // 03e: istore 9
      // 040: dup2
      // 041: bipush 8
      // 043: lshl
      // 044: bipush 32
      // 046: lushr
      // 047: l2i
      // 048: istore 10
      // 04a: dup2
      // 04b: bipush 40
      // 04d: lshl
      // 04e: bipush 40
      // 050: lushr
      // 051: l2i
      // 052: istore 11
      // 054: pop2
      // 055: dup2
      // 056: ldc2_w 40044379390862
      // 059: lxor
      // 05a: lstore 12
      // 05c: dup2
      // 05d: ldc2_w 78263071308434
      // 060: lxor
      // 061: lstore 14
      // 063: dup2
      // 064: ldc2_w 85054045971827
      // 067: lxor
      // 068: lstore 16
      // 06a: dup2
      // 06b: ldc2_w 77660847199216
      // 06e: lxor
      // 06f: lstore 18
      // 071: pop2
      // 072: ldc2_w -4113089977644590349
      // 075: lload 5
      // 077: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: new com/zelix/w
      // 07f: dup
      // 080: aload 0
      // 081: ldc2_w -2582658599003566263
      // 084: lload 5
      // 086: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: invokeinterface java/util/Set.size ()I 1
      // 090: iload 9
      // 092: i2b
      // 093: iload 10
      // 095: iload 11
      // 097: invokespecial com/zelix/w.<init> (IBII)V
      // 09a: astore 21
      // 09c: astore 20
      // 09e: aload 4
      // 0a0: bipush 0
      // 0a1: anewarray 122
      // 0a4: ldc2_w -4363396583173616487
      // 0a7: lload 5
      // 0a9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0b3: astore 22
      // 0b5: aload 22
      // 0b7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0bc: ifeq 12b
      // 0bf: aload 22
      // 0c1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c6: checkcast java/util/Map$Entry
      // 0c9: astore 23
      // 0cb: aload 23
      // 0cd: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0d2: checkcast com/zelix/hz
      // 0d5: astore 24
      // 0d7: aload 23
      // 0d9: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0de: checkcast java/util/Set
      // 0e1: astore 25
      // 0e3: aload 25
      // 0e5: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0ea: astore 26
      // 0ec: aload 26
      // 0ee: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f3: ifeq 11f
      // 0f6: aload 26
      // 0f8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fd: checkcast com/zelix/hz
      // 100: astore 27
      // 102: aload 21
      // 104: lload 16
      // 106: aload 27
      // 108: aload 24
      // 10a: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 10d: pop
      // 10e: aload 20
      // 110: ifnonnull 0b5
      // 113: aload 20
      // 115: lload 5
      // 117: lconst_0
      // 118: lcmp
      // 119: ifle 0de
      // 11c: ifnull 0ec
      // 11f: aload 20
      // 121: lload 5
      // 123: lconst_0
      // 124: lcmp
      // 125: iflt 0fd
      // 128: ifnull 0b5
      // 12b: lload 12
      // 12d: bipush 1
      // 12e: anewarray 122
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 0
      // 138: swap
      // 139: aastore
      // 13a: ldc2_w -4356395180232390074
      // 13d: lload 5
      // 13f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: lload 5
      // 146: lconst_0
      // 147: lcmp
      // 148: iflt 0c6
      // 14b: astore 22
      // 14d: aload 0
      // 14e: ldc2_w -2582658599003566263
      // 151: lload 5
      // 153: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 15d: astore 23
      // 15f: aload 23
      // 161: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 166: ifeq 1cb
      // 169: aload 23
      // 16b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 170: checkcast com/zelix/hz
      // 173: astore 24
      // 175: aload 21
      // 177: lload 14
      // 179: aload 24
      // 17b: invokevirtual com/zelix/w.R (JLjava/lang/Object;)Z
      // 17e: aload 20
      // 180: lload 5
      // 182: lconst_0
      // 183: lcmp
      // 184: ifle 18c
      // 187: ifnonnull 1e2
      // 18a: aload 20
      // 18c: ifnonnull 1c5
      // 18f: goto 19d
      // 192: ldc2_w -4471519416044369586
      // 195: lload 5
      // 197: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: ifne 1c6
      // 1a0: goto 1ae
      // 1a3: ldc2_w -4471519416044369586
      // 1a6: lload 5
      // 1a8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: aload 22
      // 1b0: aload 24
      // 1b2: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1b7: goto 1c5
      // 1ba: ldc2_w -4471519416044369586
      // 1bd: lload 5
      // 1bf: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: pop
      // 1c6: aload 20
      // 1c8: ifnull 15f
      // 1cb: aload 22
      // 1cd: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1d2: lload 5
      // 1d4: lconst_0
      // 1d5: lcmp
      // 1d6: iflt 170
      // 1d9: astore 23
      // 1db: aload 23
      // 1dd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e2: ifeq 357
      // 1e5: aload 23
      // 1e7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1ec: checkcast com/zelix/hz
      // 1ef: astore 24
      // 1f1: aload 4
      // 1f3: lload 7
      // 1f5: aload 24
      // 1f7: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 1fa: astore 25
      // 1fc: aload 25
      // 1fe: aload 24
      // 200: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 205: pop
      // 206: aload 3
      // 207: lload 7
      // 209: aload 24
      // 20b: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 20e: astore 26
      // 210: aload 0
      // 211: ldc2_w -4464693052978548818
      // 214: lload 5
      // 216: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: aload 24
      // 21d: lload 18
      // 21f: aload 26
      // 221: bipush 3
      // 222: anewarray 122
      // 225: dup_x1
      // 226: swap
      // 227: bipush 2
      // 228: swap
      // 229: aastore
      // 22a: dup_x2
      // 22b: dup_x2
      // 22c: pop
      // 22d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 230: bipush 1
      // 231: swap
      // 232: aastore
      // 233: dup_x1
      // 234: swap
      // 235: bipush 0
      // 236: swap
      // 237: aastore
      // 238: ldc2_w -4114928581739319444
      // 23b: lload 5
      // 23d: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: aload 2
      // 243: lload 7
      // 245: aload 24
      // 247: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 24a: astore 27
      // 24c: aload 0
      // 24d: ldc2_w -4344274904578725747
      // 250: lload 5
      // 252: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: aload 24
      // 259: lload 18
      // 25b: aload 27
      // 25d: bipush 3
      // 25e: anewarray 122
      // 261: dup_x1
      // 262: swap
      // 263: bipush 2
      // 264: swap
      // 265: aastore
      // 266: dup_x2
      // 267: dup_x2
      // 268: pop
      // 269: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26c: bipush 1
      // 26d: swap
      // 26e: aastore
      // 26f: dup_x1
      // 270: swap
      // 271: bipush 0
      // 272: swap
      // 273: aastore
      // 274: ldc2_w -4114928581739319444
      // 277: lload 5
      // 279: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: aload 4
      // 280: lload 7
      // 282: aload 24
      // 284: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 287: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 28c: astore 28
      // 28e: aload 28
      // 290: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 295: ifeq 34b
      // 298: aload 28
      // 29a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 29f: checkcast com/zelix/hz
      // 2a2: astore 29
      // 2a4: aload 0
      // 2a5: ldc2_w -4464693052978548818
      // 2a8: lload 5
      // 2aa: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2af: aload 29
      // 2b1: lload 18
      // 2b3: aload 26
      // 2b5: bipush 3
      // 2b6: anewarray 122
      // 2b9: dup_x1
      // 2ba: swap
      // 2bb: bipush 2
      // 2bc: swap
      // 2bd: aastore
      // 2be: dup_x2
      // 2bf: dup_x2
      // 2c0: pop
      // 2c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c4: bipush 1
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x1
      // 2c8: swap
      // 2c9: bipush 0
      // 2ca: swap
      // 2cb: aastore
      // 2cc: ldc2_w -4114928581739319444
      // 2cf: lload 5
      // 2d1: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: aload 0
      // 2d7: ldc2_w -4344274904578725747
      // 2da: lload 5
      // 2dc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: aload 29
      // 2e3: lload 18
      // 2e5: aload 27
      // 2e7: bipush 3
      // 2e8: anewarray 122
      // 2eb: dup_x1
      // 2ec: swap
      // 2ed: bipush 2
      // 2ee: swap
      // 2ef: aastore
      // 2f0: dup_x2
      // 2f1: dup_x2
      // 2f2: pop
      // 2f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f6: bipush 1
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x1
      // 2fa: swap
      // 2fb: bipush 0
      // 2fc: swap
      // 2fd: aastore
      // 2fe: ldc2_w -4114928581739319444
      // 301: lload 5
      // 303: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: aload 0
      // 309: ldc2_w -4423133101395973148
      // 30c: lload 5
      // 30e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 313: aload 29
      // 315: lload 18
      // 317: aload 25
      // 319: bipush 3
      // 31a: anewarray 122
      // 31d: dup_x1
      // 31e: swap
      // 31f: bipush 2
      // 320: swap
      // 321: aastore
      // 322: dup_x2
      // 323: dup_x2
      // 324: pop
      // 325: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 328: bipush 1
      // 329: swap
      // 32a: aastore
      // 32b: dup_x1
      // 32c: swap
      // 32d: bipush 0
      // 32e: swap
      // 32f: aastore
      // 330: ldc2_w -4114928581739319444
      // 333: lload 5
      // 335: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: aload 20
      // 33c: ifnonnull 1db
      // 33f: aload 20
      // 341: lload 5
      // 343: lconst_0
      // 344: lcmp
      // 345: ifle 1ec
      // 348: ifnull 28e
      // 34b: aload 20
      // 34d: lload 5
      // 34f: lconst_0
      // 350: lcmp
      // 351: ifle 29f
      // 354: ifnull 1db
      // 357: return
   }

   private void Z(Object[] var1) {
      w var2 = (w)var1[0];
      w var3 = (w)var1[1];
      long var5 = (Long)var1[2];
      w var4 = (w)var1[3];
      var5 = a ^ var5;
      long var7 = var5 ^ 32007733506433L;
      long var9 = var5 ^ 59033907552906L;
      hk[] var10000 = x44.a<"u">(-4570748906693763959L, var5);
      int var12 = 0;
      hk[] var11 = var10000;

      while (var12 < x44.a<"i">(this, -2843062841457329592L, var5).length) {
         hz var13 = x44.a<"i">(this, -2843062841457329592L, var5)[var12];
         String var14 = a<"y">(2521, 4225391146522749424L ^ var5) + x44.a<"m">(var13, var9, -2503616822602146237L, var5) + "'";
         x44.a<"k">(
            this,
            new Object[]{
               var13,
               new ArrayList(),
               var2,
               new ArrayList(),
               var3,
               new ArrayList(),
               var4,
               x44.a<"i">(this, -4308406194579526664L, var5),
               x44.a<"i">(this, -2452021042191772282L, var5),
               var7,
               var14
            },
            -2519181051236591991L,
            var5
         );
         var12++;
         if (var11 != null) {
            break;
         }
      }
   }

   static {
      long var5 = a ^ 63988541580679L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "h7üà7ÝW\u0080\u009e-/\u0089Ì¡>\u0007\u0002Nd\u0019\u0014\u0096d[X*Ó[z\u0012´¢Ó³ðz§µ±exyÆ\u008f \u008e\f\u0094óä'Àú;¦}\u001boËÝã\u0005\u009a\u009b2\u007f¿Äã»Þ\u0007=â\u0081@Ð\u001e9Úi\u0086Cv¾r\u0082h{Ù\u001bÊÏ+\u009eW,\u000bÞ{±Ú>Ï\u0085è\u0083ÈK ÿh<`aS\u0089J\u0007díx\u001d\u0017§\u00adÁ\u0001 äï\fÕÉ «ây\u0087sÝuâgV«ú\u0004ßÅ¤\u0084¹eô£ó\u0007×\"\u0019";
      int var13 = "h7üà7ÝW\u0080\u009e-/\u0089Ì¡>\u0007\u0002Nd\u0019\u0014\u0096d[X*Ó[z\u0012´¢Ó³ðz§µ±exyÆ\u008f \u008e\f\u0094óä'Àú;¦}\u001boËÝã\u0005\u009a\u009b2\u007f¿Äã»Þ\u0007=â\u0081@Ð\u001e9Úi\u0086Cv¾r\u0082h{Ù\u001bÊÏ+\u009eW,\u000bÞ{±Ú>Ï\u0085è\u0083ÈK ÿh<`aS\u0089J\u0007díx\u001d\u0017§\u00adÁ\u0001 äï\fÕÉ «ây\u0087sÝuâgV«ú\u0004ßÅ¤\u0084¹eô£ó\u0007×\"\u0019"
         .length();
      char var10 = '(';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = 3939067294463134563L;
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
            long var23 = ((long)var4[0] & 255L) << 56
               | ((long)var4[1] & 255L) << 48
               | ((long)var4[2] & 255L) << 40
               | ((long)var4[3] & 255L) << 32
               | ((long)var4[4] & 255L) << 24
               | ((long)var4[5] & 255L) << 16
               | ((long)var4[6] & 255L) << 8
               | (long)var4[7] & 255L;
            var10001 = -1;
            e = var23;
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27086;
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
            throw new RuntimeException("com/zelix/_xi", var10);
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
         throw new RuntimeException("com/zelix/_xi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
