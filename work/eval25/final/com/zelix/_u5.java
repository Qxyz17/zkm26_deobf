package com.zelix;

import java.io.PrintWriter;
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

public abstract class _u5 implements we {
   protected final PrintWriter b;
   protected final pk L;
   protected final List p;
   protected final _ur o;
   private static final long a = ess.a(5184815466491652223L, -916713552752669846L, MethodHandles.lookup().lookupClass()).a(38271047288104L);
   private static final String[] F;
   private static final String[] G;
   private static final Map H = new HashMap(13);
   private static final long[] ab;
   private static final Integer[] bb;
   private static final Map cb;

   public static final String G(Object[] param0) {
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
      // 00e: checkcast com/zelix/hz
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/we
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: istore 1
      // 025: pop
      // 026: getstatic com/zelix/_u5.a J
      // 029: lload 2
      // 02a: lxor
      // 02b: lstore 2
      // 02c: lload 2
      // 02d: dup2
      // 02e: ldc2_w 121251808410997
      // 031: lxor
      // 032: lstore 6
      // 034: dup2
      // 035: ldc2_w 16873691049482
      // 038: lxor
      // 039: lstore 8
      // 03b: dup2
      // 03c: ldc2_w 105886649399622
      // 03f: lxor
      // 040: lstore 10
      // 042: dup2
      // 043: ldc2_w 62936926214050
      // 046: lxor
      // 047: lstore 12
      // 049: dup2
      // 04a: ldc2_w 4595582863118
      // 04d: lxor
      // 04e: lstore 14
      // 050: pop2
      // 051: ldc2_w -6813326046472749718
      // 054: lload 2
      // 055: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: new java/lang/StringBuilder
      // 05d: dup
      // 05e: invokespecial java/lang/StringBuilder.<init> ()V
      // 061: astore 17
      // 063: astore 16
      // 065: iload 1
      // 066: aload 16
      // 068: ifnonnull 0b4
      // 06b: ifeq 0af
      // 06e: goto 07b
      // 071: ldc2_w -5098701404405287081
      // 074: lload 2
      // 075: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: aload 17
      // 07d: aload 4
      // 07f: lload 12
      // 081: aload 5
      // 083: bipush 2
      // 084: anewarray 103
      // 087: dup_x1
      // 088: swap
      // 089: bipush 1
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x2
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092: bipush 0
      // 093: swap
      // 094: aastore
      // 095: ldc2_w -6489772838067915063
      // 098: lload 2
      // 099: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a1: pop
      // 0a2: goto 0af
      // 0a5: ldc2_w -5098701404405287081
      // 0a8: lload 2
      // 0a9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 17
      // 0b1: invokevirtual java/lang/StringBuilder.length ()I
      // 0b4: aload 16
      // 0b6: ifnonnull 155
      // 0b9: ifle 130
      // 0bc: goto 0c9
      // 0bf: ldc2_w -5098701404405287081
      // 0c2: lload 2
      // 0c3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 17
      // 0cb: aload 17
      // 0cd: invokevirtual java/lang/StringBuilder.length ()I
      // 0d0: bipush 1
      // 0d1: isub
      // 0d2: ldc2_w -6568506282671297361
      // 0d5: lload 2
      // 0d6: invokedynamic n (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aload 16
      // 0dd: lload 2
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: iflt 157
      // 0e3: ifnonnull 155
      // 0e6: goto 0f3
      // 0e9: ldc2_w -5098701404405287081
      // 0ec: lload 2
      // 0ed: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: sipush 13631
      // 0f6: ldc2_w 8427074474792633118
      // 0f9: lload 2
      // 0fa: lxor
      // 0fb: invokedynamic n (IJ)I bsm=com/zelix/_u5.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: if_icmpeq 130
      // 103: goto 110
      // 106: ldc2_w -5098701404405287081
      // 109: lload 2
      // 10a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: aload 17
      // 112: sipush 13288
      // 115: ldc2_w 1295355585797342667
      // 118: lload 2
      // 119: lxor
      // 11a: invokedynamic n (IJ)I bsm=com/zelix/_u5.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 122: pop
      // 123: goto 130
      // 126: ldc2_w -5098701404405287081
      // 129: lload 2
      // 12a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 17
      // 132: aload 4
      // 134: lload 14
      // 136: bipush 1
      // 137: anewarray 103
      // 13a: dup_x2
      // 13b: dup_x2
      // 13c: pop
      // 13d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 140: bipush 0
      // 141: swap
      // 142: aastore
      // 143: ldc2_w -4834577696999411189
      // 146: lload 2
      // 147: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14f: pop
      // 150: aload 17
      // 152: invokevirtual java/lang/StringBuilder.length ()I
      // 155: aload 16
      // 157: ifnonnull 216
      // 15a: ifle 1d1
      // 15d: goto 16a
      // 160: ldc2_w -5098701404405287081
      // 163: lload 2
      // 164: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 17
      // 16c: aload 17
      // 16e: invokevirtual java/lang/StringBuilder.length ()I
      // 171: bipush 1
      // 172: isub
      // 173: ldc2_w -6568506282671297361
      // 176: lload 2
      // 177: invokedynamic n (Ljava/lang/Object;IJJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: lload 2
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: iflt 216
      // 182: aload 16
      // 184: ifnonnull 216
      // 187: goto 194
      // 18a: ldc2_w -5098701404405287081
      // 18d: lload 2
      // 18e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: sipush 13288
      // 197: ldc2_w 1295355585797342667
      // 19a: lload 2
      // 19b: lxor
      // 19c: invokedynamic n (IJ)I bsm=com/zelix/_u5.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: if_icmpeq 1d1
      // 1a4: goto 1b1
      // 1a7: ldc2_w -5098701404405287081
      // 1aa: lload 2
      // 1ab: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: athrow
      // 1b1: aload 17
      // 1b3: sipush 13288
      // 1b6: ldc2_w 1295355585797342667
      // 1b9: lload 2
      // 1ba: lxor
      // 1bb: invokedynamic n (IJ)I bsm=com/zelix/_u5.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1c3: pop
      // 1c4: goto 1d1
      // 1c7: ldc2_w -5098701404405287081
      // 1ca: lload 2
      // 1cb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: lload 2
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: ifle 1fc
      // 1d7: aload 17
      // 1d9: aload 4
      // 1db: lload 8
      // 1dd: bipush 1
      // 1de: anewarray 103
      // 1e1: dup_x2
      // 1e2: dup_x2
      // 1e3: pop
      // 1e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e7: bipush 0
      // 1e8: swap
      // 1e9: aastore
      // 1ea: ldc2_w -6609268142116876939
      // 1ed: lload 2
      // 1ee: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f6: aload 16
      // 1f8: ifnonnull 26e
      // 1fb: pop
      // 1fc: aload 4
      // 1fe: lload 10
      // 200: ldc2_w -4861922500598721624
      // 203: lload 2
      // 204: invokedynamic n (Ljava/lang/Object;JJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: goto 216
      // 20c: ldc2_w -5098701404405287081
      // 20f: lload 2
      // 210: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: athrow
      // 216: ifeq 26c
      // 219: aload 17
      // 21b: sipush 24088
      // 21e: ldc2_w 9141203494481836943
      // 221: lload 2
      // 222: lxor
      // 223: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/_u5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22b: pop
      // 22c: aload 17
      // 22e: aload 4
      // 230: lload 6
      // 232: bipush 1
      // 233: anewarray 103
      // 236: dup_x2
      // 237: dup_x2
      // 238: pop
      // 239: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23c: bipush 0
      // 23d: swap
      // 23e: aastore
      // 23f: ldc2_w -6452566909631941927
      // 242: lload 2
      // 243: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: pop
      // 24c: aload 17
      // 24e: sipush 15896
      // 251: ldc2_w 3985459130724763704
      // 254: lload 2
      // 255: lxor
      // 256: invokedynamic n (IJ)I bsm=com/zelix/_u5.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 25e: pop
      // 25f: goto 26c
      // 262: ldc2_w -5098701404405287081
      // 265: lload 2
      // 266: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: athrow
      // 26c: aload 17
      // 26e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 271: areturn
   }

   public static String R(iz var0, long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 70392883213753L;

      try {
         if (mc.e) {
            return var0.z();
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, -7779136806005433760L, var1);
      }

      return var0.w(var3);
   }

   public static String V(long var0, hz var2) {
      var0 = a ^ var0;
      long var3 = var0 ^ 30171956902969L;
      long var5 = var0 ^ 37207722272684L;

      try {
         if (mc.e) {
            return x44.a<"l">(var2, new Object[]{var5}, 8547539654430916835L, var0);
         }
      } catch (gj var7) {
         throw x44.a<"t">(var7, 8583827981488290165L, var0);
      }

      return var2.H(var3);
   }

   public _ug l(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"h">(this.L, new Object[]{var4}, -1634954053363179535L, var2);
   }

   public final boolean A(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"k">(this.L, new Object[]{var4}, 3928460513411325038L, var2);
   }

   public static final String t(Object[] param0) {
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
      // 004: checkcast com/zelix/iz
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/we
      // 018: astore 2
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 4
      // 024: pop
      // 025: getstatic com/zelix/_u5.a J
      // 028: lload 4
      // 02a: lxor
      // 02b: lstore 4
      // 02d: lload 4
      // 02f: dup2
      // 030: ldc2_w 69958507272371
      // 033: lxor
      // 034: lstore 6
      // 036: dup2
      // 037: ldc2_w 117721749024293
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 123288737049543
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 103935081712838
      // 048: lxor
      // 049: dup2
      // 04a: bipush 48
      // 04c: lushr
      // 04d: l2i
      // 04e: istore 12
      // 050: dup2
      // 051: bipush 16
      // 053: lshl
      // 054: bipush 32
      // 056: lushr
      // 057: l2i
      // 058: istore 13
      // 05a: dup2
      // 05b: bipush 48
      // 05d: lshl
      // 05e: bipush 48
      // 060: lushr
      // 061: l2i
      // 062: istore 14
      // 064: pop2
      // 065: dup2
      // 066: ldc2_w 67743687234989
      // 069: lxor
      // 06a: lstore 15
      // 06c: dup2
      // 06d: ldc2_w 85237044486069
      // 070: lxor
      // 071: lstore 17
      // 073: dup2
      // 074: ldc2_w 124112250264534
      // 077: lxor
      // 078: lstore 19
      // 07a: pop2
      // 07b: ldc2_w 7011957244931931479
      // 07e: lload 4
      // 080: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: new java/lang/StringBuilder
      // 088: dup
      // 089: invokespecial java/lang/StringBuilder.<init> ()V
      // 08c: astore 22
      // 08e: astore 21
      // 090: aload 21
      // 092: ifnonnull 0ed
      // 095: iload 1
      // 096: ifeq 0db
      // 099: goto 0a7
      // 09c: ldc2_w 8719122739481605994
      // 09f: lload 4
      // 0a1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: aload 22
      // 0a9: aload 3
      // 0aa: lload 19
      // 0ac: aload 2
      // 0ad: bipush 2
      // 0ae: anewarray 103
      // 0b1: dup_x1
      // 0b2: swap
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
      // 0bf: ldc2_w 8980045545214276908
      // 0c2: lload 4
      // 0c4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: pop
      // 0cd: goto 0db
      // 0d0: ldc2_w 8719122739481605994
      // 0d3: lload 4
      // 0d5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 22
      // 0dd: aload 3
      // 0de: iload 12
      // 0e0: i2c
      // 0e1: iload 13
      // 0e3: iload 14
      // 0e5: i2s
      // 0e6: invokevirtual com/zelix/iz.D (CIS)Ljava/lang/String;
      // 0e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ec: pop
      // 0ed: aload 3
      // 0ee: invokevirtual com/zelix/iz.A ()Ljava/lang/String;
      // 0f1: astore 23
      // 0f3: aload 21
      // 0f5: lload 4
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: iflt 148
      // 0fc: ifnonnull 13f
      // 0ff: aload 23
      // 101: invokevirtual java/lang/String.length ()I
      // 104: bipush 1
      // 105: if_icmpne 14b
      // 108: goto 116
      // 10b: ldc2_w 8719122739481605994
      // 10e: lload 4
      // 110: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: athrow
      // 116: aload 22
      // 118: aload 23
      // 11a: bipush 1
      // 11b: anewarray 103
      // 11e: dup_x1
      // 11f: swap
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: ldc2_w 8924342445617381471
      // 126: lload 4
      // 128: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: pop
      // 131: goto 13f
      // 134: ldc2_w 8719122739481605994
      // 137: lload 4
      // 139: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: lload 4
      // 141: lconst_0
      // 142: lcmp
      // 143: iflt 191
      // 146: aload 21
      // 148: ifnull 17f
      // 14b: aload 22
      // 14d: lload 15
      // 14f: aload 23
      // 151: bipush 2
      // 152: anewarray 103
      // 155: dup_x1
      // 156: swap
      // 157: bipush 1
      // 158: swap
      // 159: aastore
      // 15a: dup_x2
      // 15b: dup_x2
      // 15c: pop
      // 15d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: ldc2_w 7465522745128990517
      // 166: lload 4
      // 168: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: pop
      // 171: goto 17f
      // 174: ldc2_w 8719122739481605994
      // 177: lload 4
      // 179: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: aload 22
      // 181: ldc " "
      // 183: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 186: pop
      // 187: aload 22
      // 189: aload 3
      // 18a: invokevirtual com/zelix/iz.z ()Ljava/lang/String;
      // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 190: pop
      // 191: aload 3
      // 192: aload 21
      // 194: ifnonnull 215
      // 197: lload 17
      // 199: invokevirtual com/zelix/iz.g (J)Z
      // 19c: ifne 1f2
      // 19f: goto 1ad
      // 1a2: ldc2_w 8719122739481605994
      // 1a5: lload 4
      // 1a7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: aload 3
      // 1ae: aload 21
      // 1b0: lload 4
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: ifle 224
      // 1b7: ifnonnull 215
      // 1ba: goto 1c8
      // 1bd: ldc2_w 8719122739481605994
      // 1c0: lload 4
      // 1c2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: athrow
      // 1c8: lload 8
      // 1ca: bipush 1
      // 1cb: anewarray 103
      // 1ce: dup_x2
      // 1cf: dup_x2
      // 1d0: pop
      // 1d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d4: bipush 0
      // 1d5: swap
      // 1d6: aastore
      // 1d7: ldc2_w 8862702991457353055
      // 1da: lload 4
      // 1dc: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: ifeq 260
      // 1e4: goto 1f2
      // 1e7: ldc2_w 8719122739481605994
      // 1ea: lload 4
      // 1ec: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: aload 22
      // 1f4: sipush 2270
      // 1f7: ldc2_w 7479253543352315253
      // 1fa: lload 4
      // 1fc: lxor
      // 1fd: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/_u5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 205: pop
      // 206: aload 3
      // 207: goto 215
      // 20a: ldc2_w 8719122739481605994
      // 20d: lload 4
      // 20f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: athrow
      // 215: lload 10
      // 217: bipush 1
      // 218: anewarray 103
      // 21b: dup_x2
      // 21c: dup_x2
      // 21d: pop
      // 21e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 221: bipush 0
      // 222: swap
      // 223: aastore
      // 224: ldc2_w 7254432528126374918
      // 227: lload 4
      // 229: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: astore 24
      // 230: aload 22
      // 232: aload 24
      // 234: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 237: pop
      // 238: aload 22
      // 23a: ldc " "
      // 23c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23f: pop
      // 240: aload 22
      // 242: aload 3
      // 243: lload 6
      // 245: invokevirtual com/zelix/iz.w (J)Ljava/lang/String;
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: pop
      // 24c: aload 22
      // 24e: sipush 20028
      // 251: ldc2_w 8240382504820045859
      // 254: lload 4
      // 256: lxor
      // 257: invokedynamic n (IJ)I bsm=com/zelix/_u5.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 25f: pop
      // 260: aload 22
      // 262: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 265: areturn
   }

   public final boolean K(Object[] var1) {
      String var2 = (String)var1[0];
      String var5 = (String)var1[1];
      long var3 = (Long)var1[2];
      long var6 = var3 ^ 0L;
      return x44.a<"m">(this.L, new Object[]{var2, var5, var6}, -7364926127263320305L, var3);
   }

   public static final String Y(Object[] var0) {
      iz var2 = (iz)var0[0];
      we var1 = (we)var0[1];
      long var3 = (Long)var0[2];
      var3 = a ^ var3;
      long var5 = var3 ^ 2582853117325L;
      Object[] var10005 = new Object[]{null, null, var1, var5};
      var10005[1] = true;
      var10005[0] = var2;
      return x44.a<"v">(var10005, -3577337366813211200L, var3);
   }

   protected final String I(Object[] var1) {
      long var3 = (Long)var1[0];
      hz var2 = (hz)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 129354617531506L;
      Object[] var10005 = new Object[]{null, var2, this.L, true};
      var10005[0] = var5;
      return x44.a<"t">(var10005, -2324881553874794509L, var3);
   }

   public final boolean p(Object[] var1) {
      String var6 = (String)var1[0];
      String var4 = (String)var1[1];
      long var2 = (Long)var1[2];
      ff var5 = (ff)var1[3];
      long var7 = var2 ^ 0L;
      return x44.a<"o">(this.L, new Object[]{var6, var4, var7, var5}, 2314543238384756316L, var2);
   }

   public final boolean M(Object[] var1) {
      String var5 = (String)var1[0];
      String var6 = (String)var1[1];
      ff var2 = (ff)var1[2];
      long var3 = (Long)var1[3];
      long var7 = var3 ^ 0L;
      return x44.a<"h">(this.L, new Object[]{var5, var6, var2, var7}, -6875044827797087326L, var3);
   }

   public final boolean J(Object[] var1) {
      String var2 = (String)var1[0];
      String var6 = (String)var1[1];
      long var3 = (Long)var1[2];
      ff var5 = (ff)var1[3];
      long var7 = var3 ^ 0L;
      return x44.a<"h">(this.L, new Object[]{var2, var6, var7, var5}, 832102051253339324L, var3);
   }

   public static String C(Object[] var0) {
      iu var1 = (iu)var0[0];
      long var3 = (Long)var0[1];
      we var2 = (we)var0[2];
      var3 = a ^ var3;
      long var5 = var3 ^ 107731808261177L;
      Object[] var10005 = new Object[]{null, var1, true, var2};
      var10005[0] = var5;
      return x44.a<"p">(var10005, -919092622478887424L, var3);
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      _fz var4 = (_fz)var1[1];
      long var5 = var2 ^ 0L;
      return x44.a<"k">(this.L, new Object[]{var5, var4}, -4666448879615921285L, var2);
   }

   public static String b(Object[] param0) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/iu
      // 012: astore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 2
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast com/zelix/we
      // 023: astore 3
      // 024: pop
      // 025: getstatic com/zelix/_u5.a J
      // 028: lload 4
      // 02a: lxor
      // 02b: lstore 4
      // 02d: lload 4
      // 02f: dup2
      // 030: ldc2_w 22449779063991
      // 033: lxor
      // 034: lstore 6
      // 036: dup2
      // 037: ldc2_w 31026626356243
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 37368391491156
      // 041: lxor
      // 042: dup2
      // 043: bipush 48
      // 045: lushr
      // 046: l2i
      // 047: istore 10
      // 049: dup2
      // 04a: bipush 16
      // 04c: lshl
      // 04d: bipush 32
      // 04f: lushr
      // 050: l2i
      // 051: istore 11
      // 053: dup2
      // 054: bipush 48
      // 056: lshl
      // 057: bipush 48
      // 059: lushr
      // 05a: l2i
      // 05b: istore 12
      // 05d: pop2
      // 05e: dup2
      // 05f: ldc2_w 56066768456999
      // 062: lxor
      // 063: lstore 13
      // 065: dup2
      // 066: ldc2_w 64373306525550
      // 069: lxor
      // 06a: lstore 15
      // 06c: dup2
      // 06d: ldc2_w 17157966891332
      // 070: lxor
      // 071: lstore 17
      // 073: pop2
      // 074: ldc2_w 3737150469931773893
      // 077: lload 4
      // 079: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: new java/lang/StringBuilder
      // 081: dup
      // 082: invokespecial java/lang/StringBuilder.<init> ()V
      // 085: astore 20
      // 087: astore 19
      // 089: iload 2
      // 08a: aload 19
      // 08c: ifnonnull 119
      // 08f: ifeq 0d4
      // 092: goto 0a0
      // 095: ldc2_w 3139840807860151800
      // 098: lload 4
      // 09a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 20
      // 0a2: aload 1
      // 0a3: lload 17
      // 0a5: aload 3
      // 0a6: bipush 2
      // 0a7: anewarray 103
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 1
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x2
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w 3318581881842182078
      // 0bb: lload 4
      // 0bd: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c5: pop
      // 0c6: goto 0d4
      // 0c9: ldc2_w 3139840807860151800
      // 0cc: lload 4
      // 0ce: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 20
      // 0d6: aload 1
      // 0d7: iload 10
      // 0d9: i2c
      // 0da: iload 11
      // 0dc: iload 12
      // 0de: i2s
      // 0df: invokevirtual com/zelix/iu.D (CIS)Ljava/lang/String;
      // 0e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e5: pop
      // 0e6: aload 20
      // 0e8: aload 1
      // 0e9: lload 8
      // 0eb: ldc2_w 3069263870476996240
      // 0ee: lload 4
      // 0f0: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: lload 4
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: ifle 1af
      // 0ff: pop
      // 100: aload 19
      // 102: ifnonnull 19c
      // 105: aload 1
      // 106: lload 13
      // 108: invokevirtual com/zelix/iu.g (J)Z
      // 10b: goto 119
      // 10e: ldc2_w 3139840807860151800
      // 111: lload 4
      // 113: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: lload 4
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: ifle 13d
      // 120: ifne 14e
      // 123: aload 1
      // 124: lload 6
      // 126: bipush 1
      // 127: anewarray 103
      // 12a: dup_x2
      // 12b: dup_x2
      // 12c: pop
      // 12d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 130: bipush 0
      // 131: swap
      // 132: aastore
      // 133: ldc2_w 2912942828898758605
      // 136: lload 4
      // 138: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: ifeq 1b0
      // 140: goto 14e
      // 143: ldc2_w 3139840807860151800
      // 146: lload 4
      // 148: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 20
      // 150: sipush 24088
      // 153: ldc2_w 9141223842646239520
      // 156: lload 4
      // 158: lxor
      // 159: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/_u5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: pop
      // 162: aload 20
      // 164: aload 1
      // 165: lload 15
      // 167: bipush 0
      // 168: bipush 2
      // 169: anewarray 103
      // 16c: dup_x1
      // 16d: swap
      // 16e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 171: bipush 1
      // 172: swap
      // 173: aastore
      // 174: dup_x2
      // 175: dup_x2
      // 176: pop
      // 177: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17a: bipush 0
      // 17b: swap
      // 17c: aastore
      // 17d: ldc2_w 3354016786361112990
      // 180: lload 4
      // 182: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: pop
      // 18e: goto 19c
      // 191: ldc2_w 3139840807860151800
      // 194: lload 4
      // 196: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: aload 20
      // 19e: sipush 15896
      // 1a1: ldc2_w 3985407995701582487
      // 1a4: lload 4
      // 1a6: lxor
      // 1a7: invokedynamic n (IJ)I bsm=com/zelix/_u5.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1af: pop
      // 1b0: aload 20
      // 1b2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b5: areturn
   }

   public static String E(short var0, char var1, int var2, i8 var3) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32) ^ a;

      try {
         if (mc.e) {
            return var3.A();
         }
      } catch (gj var6) {
         throw x44.a<"s">(var6, 4695217587786338114L, var4);
      }

      return var3.H();
   }

   public final boolean l(String var1, String var2, long var3) {
      long var5 = var3 ^ 0L;
      return x44.a<"j">(this.L, var1, var2, var5, 1202372406956122086L, var3);
   }

   public final boolean h(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"m">(this.L, new Object[]{var4}, -49760976617909117L, var2);
   }

   public final boolean R(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"h">(this.L, new Object[]{var4}, 1501306545719439839L, var2);
   }

   public final Set v(String var1, long var2, Integer var4, boolean var5) {
      long var6 = var2 ^ 0L;
      return this.L.v(var1, var6, var4, var5);
   }

   public static final String e(Object[] var0) {
      long var1 = (Long)var0[0];
      hz var3 = (hz)var0[1];
      we var4 = (we)var0[2];
      var1 = a ^ var1;
      long var5 = var1 ^ 55430609611832L;
      Object[] var10005 = new Object[]{null, var3, var4, true};
      var10005[0] = var5;
      return x44.a<"v">(var10005, 6914744270396311481L, var1);
   }

   public boolean y(Object[] param1) {
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
      // 0c: getstatic com/zelix/_u5.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 109417155370794
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -8152055047181102394
      // 1e: lload 2
      // 1f: invokedynamic r (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: getstatic com/zelix/mc.e Z
      // 29: aload 6
      // 2b: ifnonnull 7d
      // 2e: ifeq 7c
      // 31: goto 3e
      // 34: ldc2_w -7597036862906623749
      // 37: lload 2
      // 38: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zelix/_u5.L Lcom/zelix/pk;
      // 42: lload 4
      // 44: bipush 1
      // 45: anewarray 103
      // 48: dup_x2
      // 49: dup_x2
      // 4a: pop
      // 4b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e: bipush 0
      // 4f: swap
      // 50: aastore
      // 51: ldc2_w -8358727246965444875
      // 54: lload 2
      // 55: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: aload 6
      // 5c: ifnonnull 7d
      // 5f: goto 6c
      // 62: ldc2_w -7597036862906623749
      // 65: lload 2
      // 66: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: ifne 80
      // 6f: goto 7c
      // 72: ldc2_w -7597036862906623749
      // 75: lload 2
      // 76: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 81
      // 80: bipush 0
      // 81: ireturn
   }

   public boolean v(Object[] param1) {
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
      // 0c: getstatic com/zelix/_u5.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 55830055796635
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 6609658022599903138
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: getstatic com/zelix/mc.e Z
      // 29: aload 6
      // 2b: ifnonnull 7d
      // 2e: ifeq 7c
      // 31: goto 3e
      // 34: ldc2_w 4897043278896090527
      // 37: lload 2
      // 38: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zelix/_u5.L Lcom/zelix/pk;
      // 42: lload 4
      // 44: bipush 1
      // 45: anewarray 103
      // 48: dup_x2
      // 49: dup_x2
      // 4a: pop
      // 4b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e: bipush 0
      // 4f: swap
      // 50: aastore
      // 51: ldc2_w 4671363529149246232
      // 54: lload 2
      // 55: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: aload 6
      // 5c: ifnonnull 7d
      // 5f: goto 6c
      // 62: ldc2_w 4897043278896090527
      // 65: lload 2
      // 66: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: ifne 80
      // 6f: goto 7c
      // 72: ldc2_w 4897043278896090527
      // 75: lload 2
      // 76: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 81
      // 80: bipush 0
      // 81: ireturn
   }

   public static String l(int var0, int var1, iu var2, char var3) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 43277357392552L;

      try {
         if (mc.e) {
            return var2.z();
         }
      } catch (gj var8) {
         throw x44.a<"w">(var8, 4419409396555100990L, var4);
      }

      return var2.t(var6);
   }

   public final boolean H(Object[] var1) {
      long var4 = (Long)var1[0];
      String var2 = (String)var1[1];
      String var3 = (String)var1[2];
      long var6 = var4 ^ 0L;
      return x44.a<"l">(this.L, new Object[]{var6, var2, var3}, -2008856326519406261L, var4);
   }

   public _u5(pk var1, List var2, _ur var3, long var4) {
      var4 = a ^ var4;
      long var6 = var4 ^ 37905251466727L;
      super();
      this.L = var1;
      this.p = var2;
      this.o = var3;
      this.b = x44.a<"i">(var3, new Object[]{var6}, 4637946961474791277L, var4);
   }

   public final boolean W(Object[] var1) {
      long var4 = (Long)var1[0];
      String var6 = (String)var1[1];
      String var3 = (String)var1[2];
      ff var2 = (ff)var1[3];
      long var7 = var4 ^ 0L;
      return x44.a<"h">(this.L, new Object[]{var7, var6, var3, var2}, -1814106828839459601L, var4);
   }

   public String S(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      long var5 = var3 ^ 0L;
      return x44.a<"h">(this.L, new Object[]{var5, var2}, 7224781828631670604L, var3);
   }

   public static String q(hz var0, long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 42551186967846L;
      long var5 = var1 ^ 118926265380703L;

      try {
         if (mc.e) {
            return x44.a<"j">(var0, new Object[]{var3}, 8969866729332809239L, var1);
         }
      } catch (gj var7) {
         throw x44.a<"r">(var7, 8991888771111318179L, var1);
      }

      return var0.c(var5);
   }

   public final boolean m(long var1, short var3, String var4, String var5) {
      long var6 = var1 << 16 | (long)var3 << 48 >>> 48;
      long var8 = (var6 ^ 0L) >>> 16;
      int var10 = (int)((var6 ^ 0L) << 48 >>> 48);
      return x44.a<"k">(this.L, var8, (short)var10, var4, var5, 632802147793851175L, var6);
   }

   static {
      long var11 = a ^ 62043913322317L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "\u001d\f\u0087É\u0000\u008a9\u001c\r,\u0080W£(\u0084\u008b\u0010q\u008e_þV\u009e\f;¸Û\u0013O#\u0003÷[";
      int var19 = "\u001d\f\u0087É\u0000\u008a9\u001c\r,\u0080W£(\u0084\u008b\u0010q\u008e_þV\u009e\f;¸Û\u0013O#\u0003÷[".length();
      char var16 = 16;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var30 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var30;
         if ((var15 += var16) >= var19) {
            F = var20;
            G = new String[2];
            cb = new HashMap(13);
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
            String var4 = "[@ÕìÔÎ\u00198®\u0001=\u0095\u0081Ó³2";
            int var5 = "[@ÕìÔÎ\u00198®\u0001=\u0095\u0081Ó³2".length();
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
                           ab = var6;
                           bb = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "&ü2\u008c\u001e¯8ä\u008c\u001e\u007f\u0097\u0094\u0096\u0088Ê";
                        var5 = "&ü2\u008c\u001e¯8ä\u008c\u001e\u007f\u0097\u0094\u0096\u0088Ê".length();
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

   private static gj c(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19859;
      if (G[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])H.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               H.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_u5", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = F[var5].getBytes("ISO-8859-1");
         G[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return G[var5];
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
         throw new RuntimeException("com/zelix/_u5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24101;
      if (bb[var3] == null) {
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
         long var5 = ab[var3];
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
         Object[] var9 = (Object[])cb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               cb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_u5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         bb[var3] = var15;
      }

      return bb[var3];
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
         throw new RuntimeException("com/zelix/_u5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
