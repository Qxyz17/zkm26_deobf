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

public abstract class hk implements ai {
   protected final PrintWriter k;
   protected final lqu t;
   protected final sh f;
   protected final List T;
   private static final long M = prr.a(7177366778690166647L, -209205369419737204L, MethodHandles.lookup().lookupClass()).a(244765417065508L);
   private static final String[] Z;
   private static final String[] ab;
   private static final Map bb = new HashMap(13);
   private static final long[] cb;
   private static final Integer[] db;
   private static final Map eb;

   public static String g(b4 var0, long var1) {
      var1 = M ^ var1;
      long var3 = var1 ^ 107685156243706L;

      try {
         if (_e.vM) {
            return var0.m();
         }
      } catch (n9 var5) {
         throw m44.a<"m">(var5, 422092350772013305L, var1);
      }

      return var0.d(var3);
   }

   public static String R(Object[] var0) {
      b1 var2 = (b1)var0[0];
      ai var1 = (ai)var0[1];
      long var3 = (Long)var0[2];
      var3 = M ^ var3;
      long var5 = var3 ^ 116225288357220L;
      Object[] var10005 = new Object[]{null, null, var1, var5};
      var10005[1] = true;
      var10005[0] = var2;
      return m44.a<"m">(var10005, 2437593600091472788L, var3);
   }

   public static String e(_v var0, long var1) {
      var1 = M ^ var1;
      long var3 = var1 ^ 55113259724030L;
      long var5 = var1 ^ 78230431595418L;

      try {
         if (_e.vM) {
            return m44.a<"r">(var0, new Object[]{var5}, -5598408176436937037L, var1);
         }
      } catch (n9 var7) {
         throw m44.a<"m">(var7, -6324258216785328871L, var1);
      }

      return var0.T(var3);
   }

   public final Set I(int var1, String var2, Integer var3, boolean var4, long var5) {
      long var7 = (long)var1 << 32 | var5 << 32 >>> 32;
      int var9 = (int)((var7 ^ 0L) >>> 32);
      long var10 = (var7 ^ 0L) << 32 >>> 32;
      return this.f.I(var9, var2, var3, var4, var10);
   }

   public String E(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      long var5 = var3 ^ 0L;
      return m44.a<"p">(this.f, new Object[]{var5, var2}, 1362443035715971078L, var3);
   }

   public final boolean y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return m44.a<"v">(this.f, new Object[]{var4}, 5642954935516076992L, var2);
   }

   public final boolean v(Object[] var1) {
      long var2 = (Long)var1[0];
      String var5 = (String)var1[1];
      String var6 = (String)var1[2];
      lyt var4 = (lyt)var1[3];
      long var7 = var2 ^ 0L;
      return m44.a<"p">(this.f, new Object[]{var7, var5, var6, var4}, -4409807138191073663L, var2);
   }

   public static final String O(Object[] param0) {
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
      // 004: checkcast com/zelix/_v
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/ai
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 1
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Boolean
      // 020: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 023: istore 5
      // 025: pop
      // 026: getstatic com/zelix/hk.M J
      // 029: lload 1
      // 02a: lxor
      // 02b: lstore 1
      // 02c: lload 1
      // 02d: dup2
      // 02e: ldc2_w 17550500880214
      // 031: lxor
      // 032: lstore 6
      // 034: dup2
      // 035: ldc2_w 66770613828444
      // 038: lxor
      // 039: lstore 8
      // 03b: dup2
      // 03c: ldc2_w 95647002674210
      // 03f: lxor
      // 040: lstore 10
      // 042: dup2
      // 043: ldc2_w 100874021749385
      // 046: lxor
      // 047: lstore 12
      // 049: dup2
      // 04a: ldc2_w 101866862459741
      // 04d: lxor
      // 04e: dup2
      // 04f: bipush 48
      // 051: lushr
      // 052: l2i
      // 053: istore 14
      // 055: dup2
      // 056: bipush 16
      // 058: lshl
      // 059: bipush 32
      // 05b: lushr
      // 05c: l2i
      // 05d: istore 15
      // 05f: dup2
      // 060: bipush 48
      // 062: lshl
      // 063: bipush 48
      // 065: lushr
      // 066: l2i
      // 067: istore 16
      // 069: pop2
      // 06a: pop2
      // 06b: ldc2_w 8865386541299342148
      // 06e: lload 1
      // 06f: invokedynamic i (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: new java/lang/StringBuilder
      // 077: dup
      // 078: invokespecial java/lang/StringBuilder.<init> ()V
      // 07b: astore 18
      // 07d: astore 17
      // 07f: iload 5
      // 081: aload 17
      // 083: ifnonnull 0ce
      // 086: ifeq 0c9
      // 089: goto 096
      // 08c: ldc2_w 6980482373088677373
      // 08f: lload 1
      // 090: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: aload 18
      // 098: aload 4
      // 09a: aload 3
      // 09b: lload 12
      // 09d: bipush 2
      // 09e: anewarray 43
      // 0a1: dup_x2
      // 0a2: dup_x2
      // 0a3: pop
      // 0a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a7: bipush 1
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 0
      // 0ad: swap
      // 0ae: aastore
      // 0af: ldc2_w 8841407135493844072
      // 0b2: lload 1
      // 0b3: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: pop
      // 0bc: goto 0c9
      // 0bf: ldc2_w 6980482373088677373
      // 0c2: lload 1
      // 0c3: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 18
      // 0cb: invokevirtual java/lang/StringBuilder.length ()I
      // 0ce: aload 17
      // 0d0: ifnonnull 16f
      // 0d3: ifle 14a
      // 0d6: goto 0e3
      // 0d9: ldc2_w 6980482373088677373
      // 0dc: lload 1
      // 0dd: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 18
      // 0e5: aload 18
      // 0e7: invokevirtual java/lang/StringBuilder.length ()I
      // 0ea: bipush 1
      // 0eb: isub
      // 0ec: ldc2_w 8819986457532880835
      // 0ef: lload 1
      // 0f0: invokedynamic v (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: aload 17
      // 0f7: lload 1
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: iflt 171
      // 0fd: ifnonnull 16f
      // 100: goto 10d
      // 103: ldc2_w 6980482373088677373
      // 106: lload 1
      // 107: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: sipush 12513
      // 110: ldc2_w 3874804169811145261
      // 113: lload 1
      // 114: lxor
      // 115: invokedynamic l (IJ)I bsm=com/zelix/hk.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: if_icmpeq 14a
      // 11d: goto 12a
      // 120: ldc2_w 6980482373088677373
      // 123: lload 1
      // 124: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: aload 18
      // 12c: sipush 30689
      // 12f: ldc2_w 4520627340717258028
      // 132: lload 1
      // 133: lxor
      // 134: invokedynamic l (IJ)I bsm=com/zelix/hk.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 13c: pop
      // 13d: goto 14a
      // 140: ldc2_w 6980482373088677373
      // 143: lload 1
      // 144: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 18
      // 14c: aload 4
      // 14e: lload 8
      // 150: bipush 1
      // 151: anewarray 43
      // 154: dup_x2
      // 155: dup_x2
      // 156: pop
      // 157: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15a: bipush 0
      // 15b: swap
      // 15c: aastore
      // 15d: ldc2_w 8951138601864973445
      // 160: lload 1
      // 161: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 169: pop
      // 16a: aload 18
      // 16c: invokevirtual java/lang/StringBuilder.length ()I
      // 16f: aload 17
      // 171: ifnonnull 236
      // 174: ifle 1eb
      // 177: goto 184
      // 17a: ldc2_w 6980482373088677373
      // 17d: lload 1
      // 17e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: aload 18
      // 186: aload 18
      // 188: invokevirtual java/lang/StringBuilder.length ()I
      // 18b: bipush 1
      // 18c: isub
      // 18d: ldc2_w 8819986457532880835
      // 190: lload 1
      // 191: invokedynamic v (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: lload 1
      // 197: lconst_0
      // 198: lcmp
      // 199: iflt 236
      // 19c: aload 17
      // 19e: ifnonnull 236
      // 1a1: goto 1ae
      // 1a4: ldc2_w 6980482373088677373
      // 1a7: lload 1
      // 1a8: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: sipush 30689
      // 1b1: ldc2_w 4520627340717258028
      // 1b4: lload 1
      // 1b5: lxor
      // 1b6: invokedynamic l (IJ)I bsm=com/zelix/hk.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: if_icmpeq 1eb
      // 1be: goto 1cb
      // 1c1: ldc2_w 6980482373088677373
      // 1c4: lload 1
      // 1c5: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: aload 18
      // 1cd: sipush 30689
      // 1d0: ldc2_w 4520627340717258028
      // 1d3: lload 1
      // 1d4: lxor
      // 1d5: invokedynamic l (IJ)I bsm=com/zelix/hk.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1dd: pop
      // 1de: goto 1eb
      // 1e1: ldc2_w 6980482373088677373
      // 1e4: lload 1
      // 1e5: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: athrow
      // 1eb: lload 1
      // 1ec: lconst_0
      // 1ed: lcmp
      // 1ee: iflt 216
      // 1f1: aload 18
      // 1f3: aload 4
      // 1f5: lload 10
      // 1f7: bipush 1
      // 1f8: anewarray 43
      // 1fb: dup_x2
      // 1fc: dup_x2
      // 1fd: pop
      // 1fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 201: bipush 0
      // 202: swap
      // 203: aastore
      // 204: ldc2_w 7354166441738359587
      // 207: lload 1
      // 208: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 210: aload 17
      // 212: ifnonnull 28e
      // 215: pop
      // 216: aload 4
      // 218: iload 14
      // 21a: i2c
      // 21b: iload 15
      // 21d: iload 16
      // 21f: i2s
      // 220: ldc2_w 8841646116535390948
      // 223: lload 1
      // 224: invokedynamic v (Ljava/lang/Object;CISJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: goto 236
      // 22c: ldc2_w 6980482373088677373
      // 22f: lload 1
      // 230: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: ifeq 28c
      // 239: aload 18
      // 23b: sipush 16701
      // 23e: ldc2_w 8600113576427480362
      // 241: lload 1
      // 242: lxor
      // 243: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/hk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24b: pop
      // 24c: aload 18
      // 24e: aload 4
      // 250: lload 6
      // 252: bipush 1
      // 253: anewarray 43
      // 256: dup_x2
      // 257: dup_x2
      // 258: pop
      // 259: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25c: bipush 0
      // 25d: swap
      // 25e: aastore
      // 25f: ldc2_w 7298814248931513201
      // 262: lload 1
      // 263: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26b: pop
      // 26c: aload 18
      // 26e: sipush 19877
      // 271: ldc2_w 6300545525067403114
      // 274: lload 1
      // 275: lxor
      // 276: invokedynamic l (IJ)I bsm=com/zelix/hk.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 27e: pop
      // 27f: goto 28c
      // 282: ldc2_w 6980482373088677373
      // 285: lload 1
      // 286: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: athrow
      // 28c: aload 18
      // 28e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 291: areturn
   }

   public static String P(Object[] param0) {
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
      // 004: checkcast com/zelix/b1
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: istore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/ai
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 3
      // 024: pop
      // 025: getstatic com/zelix/hk.M J
      // 028: lload 3
      // 029: lxor
      // 02a: lstore 3
      // 02b: lload 3
      // 02c: dup2
      // 02d: ldc2_w 87839470552373
      // 030: lxor
      // 031: lstore 6
      // 033: dup2
      // 034: ldc2_w 39203945909247
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 994372991363
      // 03e: lxor
      // 03f: lstore 10
      // 041: dup2
      // 042: ldc2_w 94992539954544
      // 045: lxor
      // 046: lstore 12
      // 048: dup2
      // 049: ldc2_w 18392186923917
      // 04c: lxor
      // 04d: lstore 14
      // 04f: dup2
      // 050: ldc2_w 77967474520564
      // 053: lxor
      // 054: lstore 16
      // 056: pop2
      // 057: ldc2_w 5277477876319398257
      // 05a: lload 3
      // 05b: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: new java/lang/StringBuilder
      // 063: dup
      // 064: invokespecial java/lang/StringBuilder.<init> ()V
      // 067: astore 19
      // 069: astore 18
      // 06b: iload 1
      // 06c: aload 18
      // 06e: ifnonnull 0f3
      // 071: ifeq 0b4
      // 074: goto 081
      // 077: ldc2_w 5974824832737394632
      // 07a: lload 3
      // 07b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: aload 19
      // 083: aload 5
      // 085: aload 2
      // 086: lload 10
      // 088: bipush 2
      // 089: anewarray 43
      // 08c: dup_x2
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092: bipush 1
      // 093: swap
      // 094: aastore
      // 095: dup_x1
      // 096: swap
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w 6025637232827177063
      // 09d: lload 3
      // 09e: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a6: pop
      // 0a7: goto 0b4
      // 0aa: ldc2_w 5974824832737394632
      // 0ad: lload 3
      // 0ae: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 19
      // 0b6: aload 5
      // 0b8: lload 12
      // 0ba: invokevirtual com/zelix/b1.q (J)Ljava/lang/String;
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c0: pop
      // 0c1: aload 19
      // 0c3: aload 5
      // 0c5: lload 8
      // 0c7: ldc2_w 5796433382624505184
      // 0ca: lload 3
      // 0cb: invokedynamic s (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d3: lload 3
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 184
      // 0d9: pop
      // 0da: aload 18
      // 0dc: ifnonnull 172
      // 0df: aload 5
      // 0e1: lload 16
      // 0e3: invokevirtual com/zelix/b1.s (J)Z
      // 0e6: goto 0f3
      // 0e9: ldc2_w 5974824832737394632
      // 0ec: lload 3
      // 0ed: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: lload 3
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: ifle 116
      // 0f9: ifne 126
      // 0fc: aload 5
      // 0fe: lload 14
      // 100: bipush 1
      // 101: anewarray 43
      // 104: dup_x2
      // 105: dup_x2
      // 106: pop
      // 107: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10a: bipush 0
      // 10b: swap
      // 10c: aastore
      // 10d: ldc2_w 5238514382366012993
      // 110: lload 3
      // 111: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: ifeq 185
      // 119: goto 126
      // 11c: ldc2_w 5974824832737394632
      // 11f: lload 3
      // 120: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: aload 19
      // 128: sipush 7656
      // 12b: ldc2_w 732852473288625099
      // 12e: lload 3
      // 12f: lxor
      // 130: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/hk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: pop
      // 139: aload 19
      // 13b: aload 5
      // 13d: bipush 0
      // 13e: lload 6
      // 140: bipush 2
      // 141: anewarray 43
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 152: bipush 0
      // 153: swap
      // 154: aastore
      // 155: ldc2_w 5507183008078386955
      // 158: lload 3
      // 159: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: pop
      // 165: goto 172
      // 168: ldc2_w 5974824832737394632
      // 16b: lload 3
      // 16c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: aload 19
      // 174: sipush 17084
      // 177: ldc2_w 3357496107601982023
      // 17a: lload 3
      // 17b: lxor
      // 17c: invokedynamic l (IJ)I bsm=com/zelix/hk.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 184: pop
      // 185: aload 19
      // 187: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18a: areturn
   }

   public static final String w(Object[] var0) {
      _v var2 = (_v)var0[0];
      long var3 = (Long)var0[1];
      ai var1 = (ai)var0[2];
      var3 = M ^ var3;
      long var5 = var3 ^ 42321494550992L;
      Object[] var10005 = new Object[]{null, null, null, true};
      var10005[2] = var5;
      var10005[1] = var1;
      var10005[0] = var2;
      return m44.a<"l">(var10005, -562177966151799392L, var3);
   }

   public boolean G(Object[] var1) {
      long var2 = (Long)var1[0];
      loe var4 = (loe)var1[1];
      long var5 = var2 ^ 0L;
      return m44.a<"w">(this.f, new Object[]{var5, var4}, 927881635674657621L, var2);
   }

   public final boolean b(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      String var6 = (String)var1[2];
      lyt var5 = (lyt)var1[3];
      long var7 = var3 ^ 0L;
      return m44.a<"w">(this.f, new Object[]{var2, var7, var6, var5}, -300033787295437526L, var3);
   }

   public boolean s(Object[] param1) {
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
      // 0c: getstatic com/zelix/hk.M J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 15966012087153
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -8427555984644314297
      // 1e: lload 2
      // 1f: invokedynamic j (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: getstatic com/zelix/_e.vM Z
      // 29: aload 6
      // 2b: ifnonnull 7d
      // 2e: ifeq 7c
      // 31: goto 3e
      // 34: ldc2_w -8008306311191036418
      // 37: lload 2
      // 38: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zelix/hk.f Lcom/zelix/sh;
      // 42: lload 4
      // 44: bipush 1
      // 45: anewarray 43
      // 48: dup_x2
      // 49: dup_x2
      // 4a: pop
      // 4b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e: bipush 0
      // 4f: swap
      // 50: aastore
      // 51: ldc2_w -8376478435101634160
      // 54: lload 2
      // 55: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: aload 6
      // 5c: ifnonnull 7d
      // 5f: goto 6c
      // 62: ldc2_w -8008306311191036418
      // 65: lload 2
      // 66: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: ifne 80
      // 6f: goto 7c
      // 72: ldc2_w -8008306311191036418
      // 75: lload 2
      // 76: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 81
      // 80: bipush 0
      // 81: ireturn
   }

   public final boolean J(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return m44.a<"t">(this.f, new Object[]{var4}, 1202966579629165281L, var2);
   }

   public hk(sh var1, List var2, long var3, lqu var5) {
      var3 = M ^ var3;
      long var6 = var3 ^ 42211555989270L;
      super();
      this.f = var1;
      this.T = var2;
      this.t = var5;
      this.k = m44.a<"u">(var5, new Object[]{var6}, -5428339878548215172L, var3);
   }

   public final boolean K(Object[] var1) {
      long var2 = (Long)var1[0];
      String var5 = (String)var1[1];
      String var4 = (String)var1[2];
      long var6 = var2 ^ 0L;
      return m44.a<"v">(this.f, new Object[]{var6, var5, var4}, -1170359217708483389L, var2);
   }

   public _6 Y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return m44.a<"p">(this.f, new Object[]{var4}, -1838115007293849850L, var2);
   }

   public final boolean R(Object[] var1) {
      String var5 = (String)var1[0];
      String var2 = (String)var1[1];
      long var3 = (Long)var1[2];
      lyt var6 = (lyt)var1[3];
      long var7 = var3 ^ 0L;
      return m44.a<"s">(this.f, new Object[]{var5, var2, var7, var6}, -2872742164421866511L, var3);
   }

   public final boolean j(String var1, long var2, String var4) {
      long var5 = var2 ^ 0L;
      return m44.a<"u">(this.f, var1, var5, var4, 5000789231140913199L, var2);
   }

   public final boolean n(Object[] var1) {
      String var6 = (String)var1[0];
      String var2 = (String)var1[1];
      long var3 = (Long)var1[2];
      lyt var5 = (lyt)var1[3];
      long var7 = var3 ^ 0L;
      return m44.a<"r">(this.f, new Object[]{var6, var2, var7, var5}, -2987620073948038502L, var3);
   }

   public static String d(long var0, b1 var2) {
      var0 = M ^ var0;
      long var3 = var0 ^ 49368366351583L;

      try {
         if (_e.vM) {
            return var2.m();
         }
      } catch (n9 var5) {
         throw m44.a<"h">(var5, 1787613944086787564L, var0);
      }

      return var2.Z(var3);
   }

   public static final String t(Object[] var0) {
      b4 var3 = (b4)var0[0];
      ai var4 = (ai)var0[1];
      long var1 = (Long)var0[2];
      var1 = M ^ var1;
      long var5 = var1 ^ 105905474614829L;
      Object[] var10005 = new Object[]{null, null, var4, var5};
      var10005[1] = true;
      var10005[0] = var3;
      return m44.a<"l">(var10005, 552936876266539000L, var1);
   }

   public static String U(b0 var0, byte var1, int var2, int var3) {
      long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ M;

      try {
         if (_e.vM) {
            return var0.B();
         }
      } catch (n9 var6) {
         throw m44.a<"h">(var6, -4794469597939412908L, var4);
      }

      return var0.V();
   }

   public final boolean p(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return m44.a<"q">(this.f, new Object[]{var4}, -1476676147422732836L, var2);
   }

   public final boolean Z(Object[] var1) {
      String var2 = (String)var1[0];
      String var5 = (String)var1[1];
      long var3 = (Long)var1[2];
      long var6 = var3 ^ 0L;
      return m44.a<"u">(this.f, new Object[]{var2, var5, var6}, 4982584624270769586L, var3);
   }

   public final boolean O(long var1, String var3, String var4) {
      long var5 = var1 ^ 0L;
      return m44.a<"r">(this.f, var5, var3, var4, -8721257326477019735L, var1);
   }

   public boolean x(Object[] param1) {
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
      // 0c: getstatic com/zelix/hk.M J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 37095168643189
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2538605477384242039
      // 1e: lload 2
      // 1f: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: getstatic com/zelix/_e.vM Z
      // 29: aload 6
      // 2b: ifnonnull 7d
      // 2e: ifeq 7c
      // 31: goto 3e
      // 34: ldc2_w -4102068521262372304
      // 37: lload 2
      // 38: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield com/zelix/hk.f Lcom/zelix/sh;
      // 42: lload 4
      // 44: bipush 1
      // 45: anewarray 43
      // 48: dup_x2
      // 49: dup_x2
      // 4a: pop
      // 4b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e: bipush 0
      // 4f: swap
      // 50: aastore
      // 51: ldc2_w -2433373020641784907
      // 54: lload 2
      // 55: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: aload 6
      // 5c: ifnonnull 7d
      // 5f: goto 6c
      // 62: ldc2_w -4102068521262372304
      // 65: lload 2
      // 66: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: ifne 80
      // 6f: goto 7c
      // 72: ldc2_w -4102068521262372304
      // 75: lload 2
      // 76: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: bipush 1
      // 7d: goto 81
      // 80: bipush 0
      // 81: ireturn
   }

   public static String a(int var0, _v var1, int var2, char var3) {
      long var4 = ((long)var0 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ M;
      long var6 = var4 ^ 35648975331877L;
      long var8 = var4 ^ 109502161550742L;

      try {
         if (_e.vM) {
            return m44.a<"v">(var1, new Object[]{var6}, -8465748106493138181L, var4);
         }
      } catch (n9 var10) {
         throw m44.a<"i">(var10, -7509809707779392795L, var4);
      }

      return var1.I(var8);
   }

   protected final String l(Object[] var1) {
      long var3 = (Long)var1[0];
      _v var2 = (_v)var1[1];
      var3 = M ^ var3;
      long var5 = var3 ^ 42104448706185L;
      sh var10001 = this.f;
      Object[] var10005 = new Object[]{null, null, null, true};
      var10005[2] = var5;
      var10005[1] = var10001;
      var10005[0] = var2;
      return m44.a<"m">(var10005, -5229877459965762823L, var3);
   }

   public static final String K(Object[] param0) {
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
      // 004: checkcast com/zelix/b4
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Boolean
      // 00e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 011: istore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/ai
      // 019: astore 1
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/Long
      // 020: invokevirtual java/lang/Long.longValue ()J
      // 023: lstore 3
      // 024: pop
      // 025: getstatic com/zelix/hk.M J
      // 028: lload 3
      // 029: lxor
      // 02a: lstore 3
      // 02b: lload 3
      // 02c: dup2
      // 02d: ldc2_w 113651380499458
      // 030: lxor
      // 031: lstore 6
      // 033: dup2
      // 034: ldc2_w 62537962050835
      // 037: lxor
      // 038: lstore 8
      // 03a: dup2
      // 03b: ldc2_w 31546854798171
      // 03e: lxor
      // 03f: lstore 10
      // 041: dup2
      // 042: ldc2_w 81586036205480
      // 045: lxor
      // 046: lstore 12
      // 048: dup2
      // 049: ldc2_w 14211340689749
      // 04c: lxor
      // 04d: lstore 14
      // 04f: dup2
      // 050: ldc2_w 74929679081397
      // 053: lxor
      // 054: lstore 16
      // 056: dup2
      // 057: ldc2_w 99779098065708
      // 05a: lxor
      // 05b: lstore 18
      // 05d: pop2
      // 05e: ldc2_w 280703653301281705
      // 061: lload 3
      // 062: invokedynamic l (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: new java/lang/StringBuilder
      // 06a: dup
      // 06b: invokespecial java/lang/StringBuilder.<init> ()V
      // 06e: astore 21
      // 070: astore 20
      // 072: aload 20
      // 074: ifnonnull 0c7
      // 077: iload 5
      // 079: ifeq 0bb
      // 07c: goto 089
      // 07f: ldc2_w 1743680104528344336
      // 082: lload 3
      // 083: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 21
      // 08b: aload 2
      // 08c: aload 1
      // 08d: lload 10
      // 08f: bipush 2
      // 090: anewarray 43
      // 093: dup_x2
      // 094: dup_x2
      // 095: pop
      // 096: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 099: bipush 1
      // 09a: swap
      // 09b: aastore
      // 09c: dup_x1
      // 09d: swap
      // 09e: bipush 0
      // 09f: swap
      // 0a0: aastore
      // 0a1: ldc2_w 1821496548520186559
      // 0a4: lload 3
      // 0a5: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ad: pop
      // 0ae: goto 0bb
      // 0b1: ldc2_w 1743680104528344336
      // 0b4: lload 3
      // 0b5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 21
      // 0bd: aload 2
      // 0be: lload 12
      // 0c0: invokevirtual com/zelix/b4.q (J)Ljava/lang/String;
      // 0c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c6: pop
      // 0c7: aload 2
      // 0c8: invokevirtual com/zelix/b4.B ()Ljava/lang/String;
      // 0cb: astore 22
      // 0cd: aload 20
      // 0cf: lload 3
      // 0d0: lconst_0
      // 0d1: lcmp
      // 0d2: iflt 11d
      // 0d5: ifnonnull 115
      // 0d8: aload 22
      // 0da: invokevirtual java/lang/String.length ()I
      // 0dd: bipush 1
      // 0de: if_icmpne 120
      // 0e1: goto 0ee
      // 0e4: ldc2_w 1743680104528344336
      // 0e7: lload 3
      // 0e8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 21
      // 0f0: aload 22
      // 0f2: bipush 1
      // 0f3: anewarray 43
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 0
      // 0f9: swap
      // 0fa: aastore
      // 0fb: ldc2_w 107959335866305285
      // 0fe: lload 3
      // 0ff: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 107: pop
      // 108: goto 115
      // 10b: ldc2_w 1743680104528344336
      // 10e: lload 3
      // 10f: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: lload 3
      // 116: lconst_0
      // 117: lcmp
      // 118: ifle 164
      // 11b: aload 20
      // 11d: ifnull 152
      // 120: aload 21
      // 122: lload 16
      // 124: aload 22
      // 126: bipush 2
      // 127: anewarray 43
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 1
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x2
      // 130: dup_x2
      // 131: pop
      // 132: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 135: bipush 0
      // 136: swap
      // 137: aastore
      // 138: ldc2_w 216362641001168320
      // 13b: lload 3
      // 13c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: pop
      // 145: goto 152
      // 148: ldc2_w 1743680104528344336
      // 14b: lload 3
      // 14c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: aload 21
      // 154: ldc " "
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: pop
      // 15a: aload 21
      // 15c: aload 2
      // 15d: invokevirtual com/zelix/b4.m ()Ljava/lang/String;
      // 160: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 163: pop
      // 164: aload 2
      // 165: aload 20
      // 167: ifnonnull 1db
      // 16a: lload 18
      // 16c: invokevirtual com/zelix/b4.s (J)Z
      // 16f: ifne 1ba
      // 172: goto 17f
      // 175: ldc2_w 1743680104528344336
      // 178: lload 3
      // 179: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: aload 2
      // 180: aload 20
      // 182: ifnonnull 1db
      // 185: goto 192
      // 188: ldc2_w 1743680104528344336
      // 18b: lload 3
      // 18c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: lload 14
      // 194: bipush 1
      // 195: anewarray 43
      // 198: dup_x2
      // 199: dup_x2
      // 19a: pop
      // 19b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19e: bipush 0
      // 19f: swap
      // 1a0: aastore
      // 1a1: ldc2_w 174212420403608729
      // 1a4: lload 3
      // 1a5: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: ifeq 224
      // 1ad: goto 1ba
      // 1b0: ldc2_w 1743680104528344336
      // 1b3: lload 3
      // 1b4: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: aload 21
      // 1bc: sipush 7656
      // 1bf: ldc2_w 732821371449491731
      // 1c2: lload 3
      // 1c3: lxor
      // 1c4: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/hk.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cc: pop
      // 1cd: aload 2
      // 1ce: goto 1db
      // 1d1: ldc2_w 1743680104528344336
      // 1d4: lload 3
      // 1d5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: lload 6
      // 1dd: bipush 1
      // 1de: anewarray 43
      // 1e1: dup_x2
      // 1e2: dup_x2
      // 1e3: pop
      // 1e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e7: bipush 0
      // 1e8: swap
      // 1e9: aastore
      // 1ea: ldc2_w 304638081419075542
      // 1ed: lload 3
      // 1ee: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: astore 23
      // 1f5: aload 21
      // 1f7: aload 23
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fc: pop
      // 1fd: aload 21
      // 1ff: ldc " "
      // 201: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 204: pop
      // 205: aload 21
      // 207: aload 2
      // 208: lload 8
      // 20a: invokevirtual com/zelix/b4.d (J)Ljava/lang/String;
      // 20d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 210: pop
      // 211: aload 21
      // 213: sipush 17084
      // 216: ldc2_w 3357473917889558687
      // 219: lload 3
      // 21a: lxor
      // 21b: invokedynamic l (IJ)I bsm=com/zelix/hk.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 223: pop
      // 224: aload 21
      // 226: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 229: areturn
   }

   static {
      long var11 = M ^ 74325722930610L;
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
      String var17 = "\u0086HÒÍ´¶X\u0097_\u0092¦?·ßW\u0098\u0010v:\b¼\u0082\u001e·BÆÿÐ>>\u0019\u0080\u0087";
      int var19 = "\u0086HÒÍ´¶X\u0097_\u0092¦?·ßW\u0098\u0010v:\b¼\u0082\u001e·BÆÿÐ>>\u0019\u0080\u0087".length();
      char var16 = 16;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var30 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var30;
         if ((var15 += var16) >= var19) {
            Z = var20;
            ab = new String[2];
            eb = new HashMap(13);
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
            String var4 = "\\Ê,ÿH;\u00ad4 ©ò\u00992_õe";
            int var5 = "\\Ê,ÿH;\u00ad4 ©ò\u00992_õe".length();
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
                           cb = var6;
                           db = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "\u0096\b(\\û\u0085æ(/ßKË\u0005K%Ü";
                        var5 = "\u0096\b(\\û\u0085æ(/ßKË\u0005K%Ü".length();
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

   private static n9 d(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21520;
      if (ab[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])bb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               bb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/hk", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = Z[var5].getBytes("ISO-8859-1");
         ab[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return ab[var5];
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
         throw new RuntimeException("com/zelix/hk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29385;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])eb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               eb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/hk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
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
         throw new RuntimeException("com/zelix/hk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
