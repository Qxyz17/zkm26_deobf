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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xy {
   private final _yz m;
   private final Random D;
   private final _ye J;
   private final boolean c;
   private static final long a = ess.a(2679168053820259912L, 2663391392420799267L, MethodHandles.lookup().lookupClass()).a(20300925128991L);
   private static final long[] b;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   public xy(_uh var1, long var2, _yz var4, boolean var5, Random var6) {
      var2 = a ^ var2;
      long var7 = var2 ^ 28996343839971L;
      super();
      this.J = x44.a<"o">(var4, new Object[]{var7}, 8070219160259810740L, var2);
      this.m = var4;
      this.c = var5;
      this.D = var6;
   }

   final _3 F(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/ig
      // 017: astore 6
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast com/zelix/w
      // 01f: astore 11
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast java/lang/Boolean
      // 027: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02a: istore 5
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/util/Map
      // 032: astore 8
      // 034: dup
      // 035: bipush 6
      // 037: aaload
      // 038: checkcast java/lang/Long
      // 03b: invokevirtual java/lang/Long.longValue ()J
      // 03e: lstore 2
      // 03f: dup
      // 040: bipush 7
      // 042: aaload
      // 043: checkcast java/util/Map
      // 046: astore 12
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast java/lang/Boolean
      // 04f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 052: istore 4
      // 054: dup
      // 055: bipush 9
      // 057: aaload
      // 058: checkcast java/lang/Boolean
      // 05b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05e: istore 10
      // 060: pop
      // 061: getstatic com/zelix/xy.a J
      // 064: lload 2
      // 065: lxor
      // 066: lstore 2
      // 067: lload 2
      // 068: dup2
      // 069: ldc2_w 95906285988657
      // 06c: lxor
      // 06d: dup2
      // 06e: bipush 32
      // 070: lushr
      // 071: lstore 13
      // 073: dup2
      // 074: bipush 32
      // 076: lshl
      // 077: bipush 32
      // 079: lushr
      // 07a: l2i
      // 07b: istore 15
      // 07d: pop2
      // 07e: dup2
      // 07f: ldc2_w 97017593938666
      // 082: lxor
      // 083: lstore 16
      // 085: dup2
      // 086: ldc2_w 42701786964506
      // 089: lxor
      // 08a: lstore 18
      // 08c: dup2
      // 08d: ldc2_w 120207889635642
      // 090: lxor
      // 091: lstore 20
      // 093: dup2
      // 094: ldc2_w 48828930225324
      // 097: lxor
      // 098: lstore 22
      // 09a: dup2
      // 09b: ldc2_w 86558604999233
      // 09e: lxor
      // 09f: lstore 24
      // 0a1: dup2
      // 0a2: ldc2_w 69158641651472
      // 0a5: lxor
      // 0a6: lstore 26
      // 0a8: pop2
      // 0a9: ldc2_w -1595293410337762218
      // 0ac: lload 2
      // 0ad: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: bipush 0
      // 0b3: istore 29
      // 0b5: bipush 0
      // 0b6: istore 30
      // 0b8: istore 28
      // 0ba: aload 0
      // 0bb: ldc2_w -686406913785235573
      // 0be: lload 2
      // 0bf: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: iload 28
      // 0c6: ifeq 0da
      // 0c9: ifeq 25f
      // 0cc: goto 0d9
      // 0cf: ldc2_w -1226933196831195833
      // 0d2: lload 2
      // 0d3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: bipush 1
      // 0da: istore 31
      // 0dc: lload 2
      // 0dd: lconst_0
      // 0de: lcmp
      // 0df: ifle 10e
      // 0e2: ldc2_w -1496652145735349597
      // 0e5: lload 2
      // 0e6: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: iload 28
      // 0ed: ifeq 109
      // 0f0: ifnull 113
      // 0f3: goto 100
      // 0f6: ldc2_w -1226933196831195833
      // 0f9: lload 2
      // 0fa: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: ldc2_w -1496652145735349597
      // 103: lload 2
      // 104: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 10c: istore 31
      // 10e: goto 113
      // 111: astore 32
      // 113: iload 4
      // 115: iload 28
      // 117: ifeq 187
      // 11a: ifne 186
      // 11d: goto 12a
      // 120: ldc2_w -1226933196831195833
      // 123: lload 2
      // 124: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: ldc2_w -1273891320073862913
      // 12d: lload 2
      // 12e: invokedynamic i (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: iload 28
      // 135: ifeq 187
      // 138: goto 145
      // 13b: ldc2_w -1226933196831195833
      // 13e: lload 2
      // 13f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: ifne 186
      // 148: goto 155
      // 14b: ldc2_w -1226933196831195833
      // 14e: lload 2
      // 14f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 0
      // 156: ldc2_w -1060093104462086236
      // 159: lload 2
      // 15a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: iload 31
      // 161: invokevirtual java/util/Random.nextInt (I)I
      // 164: iload 28
      // 166: ifeq 18a
      // 169: goto 176
      // 16c: ldc2_w -1226933196831195833
      // 16f: lload 2
      // 170: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: ifne 189
      // 179: goto 186
      // 17c: ldc2_w -1226933196831195833
      // 17f: lload 2
      // 180: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: bipush 1
      // 187: istore 29
      // 189: bipush 4
      // 18a: istore 32
      // 18c: lload 2
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: ifle 1be
      // 192: ldc2_w -1341473120462561812
      // 195: lload 2
      // 196: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: iload 28
      // 19d: ifeq 1b9
      // 1a0: ifnull 1ce
      // 1a3: goto 1b0
      // 1a6: ldc2_w -1226933196831195833
      // 1a9: lload 2
      // 1aa: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: athrow
      // 1b0: ldc2_w -1341473120462561812
      // 1b3: lload 2
      // 1b4: invokedynamic i (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 1bc: istore 32
      // 1be: goto 238
      // 1c1: astore 33
      // 1c3: iload 28
      // 1c5: lload 2
      // 1c6: lconst_0
      // 1c7: lcmp
      // 1c8: ifle 1d0
      // 1cb: ifne 238
      // 1ce: iload 4
      // 1d0: iload 28
      // 1d2: ifeq 236
      // 1d5: goto 1e2
      // 1d8: ldc2_w -1226933196831195833
      // 1db: lload 2
      // 1dc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: lload 2
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: ifle 22c
      // 1e8: ifne 229
      // 1eb: goto 1f8
      // 1ee: ldc2_w -1226933196831195833
      // 1f1: lload 2
      // 1f2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: ldc2_w -1273891320073862913
      // 1fb: lload 2
      // 1fc: invokedynamic i (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: iload 28
      // 203: lload 2
      // 204: lconst_0
      // 205: lcmp
      // 206: ifle 249
      // 209: ifeq 247
      // 20c: goto 219
      // 20f: ldc2_w -1226933196831195833
      // 212: lload 2
      // 213: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: athrow
      // 219: ifeq 238
      // 21c: goto 229
      // 21f: ldc2_w -1226933196831195833
      // 222: lload 2
      // 223: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: sipush 27199
      // 22c: ldc2_w 9028286556985629481
      // 22f: lload 2
      // 230: lxor
      // 231: invokedynamic o (IJ)I bsm=com/zelix/xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: istore 32
      // 238: aload 0
      // 239: ldc2_w -1060093104462086236
      // 23c: lload 2
      // 23d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: iload 32
      // 244: invokevirtual java/util/Random.nextInt (I)I
      // 247: iload 28
      // 249: ifeq 25d
      // 24c: ifne 25f
      // 24f: goto 25c
      // 252: ldc2_w -1226933196831195833
      // 255: lload 2
      // 256: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: athrow
      // 25c: bipush 1
      // 25d: istore 30
      // 25f: aconst_null
      // 260: checkcast [[C
      // 263: astore 31
      // 265: iload 30
      // 267: lload 2
      // 268: lconst_0
      // 269: lcmp
      // 26a: ifle 313
      // 26d: iload 28
      // 26f: ifeq 299
      // 272: ifeq 316
      // 275: goto 282
      // 278: ldc2_w -1226933196831195833
      // 27b: lload 2
      // 27c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: athrow
      // 282: ldc2_w -1486133741731784443
      // 285: lload 2
      // 286: invokedynamic i (JJ)[[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: arraylength
      // 28c: goto 299
      // 28f: ldc2_w -1226933196831195833
      // 292: lload 2
      // 293: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: athrow
      // 299: anewarray 373
      // 29c: astore 31
      // 29e: ldc2_w -1486133741731784443
      // 2a1: lload 2
      // 2a2: invokedynamic i (JJ)[[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: bipush 0
      // 2a8: aload 31
      // 2aa: bipush 0
      // 2ab: ldc2_w -1486133741731784443
      // 2ae: lload 2
      // 2af: invokedynamic i (JJ)[[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: arraylength
      // 2b5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 2b8: aload 31
      // 2ba: lload 2
      // 2bb: lconst_0
      // 2bc: lcmp
      // 2bd: ifle 31f
      // 2c0: sipush 14989
      // 2c3: ldc2_w 624555626393127834
      // 2c6: lload 2
      // 2c7: lxor
      // 2c8: invokedynamic o (IJ)I bsm=com/zelix/xy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: lload 16
      // 2cf: bipush 2
      // 2d0: anewarray 287
      // 2d3: dup_x2
      // 2d4: dup_x2
      // 2d5: pop
      // 2d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d9: bipush 1
      // 2da: swap
      // 2db: aastore
      // 2dc: dup_x1
      // 2dd: swap
      // 2de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e1: bipush 0
      // 2e2: swap
      // 2e3: aastore
      // 2e4: ldc2_w -1660507478757140525
      // 2e7: lload 2
      // 2e8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: lload 18
      // 2ef: dup2_x1
      // 2f0: pop2
      // 2f1: bipush 3
      // 2f2: anewarray 287
      // 2f5: dup_x1
      // 2f6: swap
      // 2f7: bipush 2
      // 2f8: swap
      // 2f9: aastore
      // 2fa: dup_x2
      // 2fb: dup_x2
      // 2fc: pop
      // 2fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 300: bipush 1
      // 301: swap
      // 302: aastore
      // 303: dup_x1
      // 304: swap
      // 305: bipush 0
      // 306: swap
      // 307: aastore
      // 308: ldc2_w -1456105282522020572
      // 30b: lload 2
      // 30c: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: iload 28
      // 313: ifne 321
      // 316: ldc2_w -1486133741731784443
      // 319: lload 2
      // 31a: invokedynamic i (JJ)[[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: astore 31
      // 321: aload 6
      // 323: lload 20
      // 325: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // 328: astore 32
      // 32a: aload 6
      // 32c: lload 22
      // 32e: bipush 1
      // 32f: anewarray 287
      // 332: dup_x2
      // 333: dup_x2
      // 334: pop
      // 335: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 338: bipush 0
      // 339: swap
      // 33a: aastore
      // 33b: ldc2_w -860379582791025117
      // 33e: lload 2
      // 33f: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: istore 33
      // 346: iload 33
      // 348: ifeq 39b
      // 34b: aload 32
      // 34d: bipush 0
      // 34e: anewarray 287
      // 351: ldc2_w -1627722164774626358
      // 354: lload 2
      // 355: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: lload 13
      // 35c: dup2_x1
      // 35d: pop2
      // 35e: iload 15
      // 360: bipush 3
      // 361: anewarray 287
      // 364: dup_x1
      // 365: swap
      // 366: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 369: bipush 2
      // 36a: swap
      // 36b: aastore
      // 36c: dup_x1
      // 36d: swap
      // 36e: bipush 1
      // 36f: swap
      // 370: aastore
      // 371: dup_x2
      // 372: dup_x2
      // 373: pop
      // 374: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 377: bipush 0
      // 378: swap
      // 379: aastore
      // 37a: ldc2_w -1356871609453450611
      // 37d: lload 2
      // 37e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: astore 34
      // 385: aload 34
      // 387: invokeinterface java/util/List.size ()I 1
      // 38c: ifne 39b
      // 38f: aconst_null
      // 390: areturn
      // 391: ldc2_w -1226933196831195833
      // 394: lload 2
      // 395: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39a: athrow
      // 39b: aconst_null
      // 39c: astore 34
      // 39e: iload 29
      // 3a0: iload 28
      // 3a2: ifeq 3be
      // 3a5: ifne 3c1
      // 3a8: goto 3b5
      // 3ab: ldc2_w -1226933196831195833
      // 3ae: lload 2
      // 3af: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b4: athrow
      // 3b5: ldc2_w -754962041082917109
      // 3b8: lload 2
      // 3b9: invokedynamic i (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: ifeq 434
      // 3c1: aload 0
      // 3c2: aload 7
      // 3c4: aload 6
      // 3c6: aload 32
      // 3c8: iload 33
      // 3ca: aload 11
      // 3cc: iload 5
      // 3ce: lload 24
      // 3d0: aload 8
      // 3d2: aload 12
      // 3d4: iload 10
      // 3d6: aload 31
      // 3d8: bipush 11
      // 3da: anewarray 287
      // 3dd: dup_x1
      // 3de: swap
      // 3df: bipush 10
      // 3e1: swap
      // 3e2: aastore
      // 3e3: dup_x1
      // 3e4: swap
      // 3e5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3e8: bipush 9
      // 3ea: swap
      // 3eb: aastore
      // 3ec: dup_x1
      // 3ed: swap
      // 3ee: bipush 8
      // 3f0: swap
      // 3f1: aastore
      // 3f2: dup_x1
      // 3f3: swap
      // 3f4: bipush 7
      // 3f6: swap
      // 3f7: aastore
      // 3f8: dup_x2
      // 3f9: dup_x2
      // 3fa: pop
      // 3fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3fe: bipush 6
      // 400: swap
      // 401: aastore
      // 402: dup_x1
      // 403: swap
      // 404: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 407: bipush 5
      // 408: swap
      // 409: aastore
      // 40a: dup_x1
      // 40b: swap
      // 40c: bipush 4
      // 40d: swap
      // 40e: aastore
      // 40f: dup_x1
      // 410: swap
      // 411: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 414: bipush 3
      // 415: swap
      // 416: aastore
      // 417: dup_x1
      // 418: swap
      // 419: bipush 2
      // 41a: swap
      // 41b: aastore
      // 41c: dup_x1
      // 41d: swap
      // 41e: bipush 1
      // 41f: swap
      // 420: aastore
      // 421: dup_x1
      // 422: swap
      // 423: bipush 0
      // 424: swap
      // 425: aastore
      // 426: ldc2_w -1336221232253539545
      // 429: lload 2
      // 42a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42f: astore 34
      // 431: goto 4a4
      // 434: aload 0
      // 435: lload 26
      // 437: aload 7
      // 439: aload 6
      // 43b: aload 32
      // 43d: iload 33
      // 43f: aload 11
      // 441: iload 5
      // 443: aload 8
      // 445: aload 12
      // 447: iload 10
      // 449: aload 31
      // 44b: bipush 11
      // 44d: anewarray 287
      // 450: dup_x1
      // 451: swap
      // 452: bipush 10
      // 454: swap
      // 455: aastore
      // 456: dup_x1
      // 457: swap
      // 458: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 45b: bipush 9
      // 45d: swap
      // 45e: aastore
      // 45f: dup_x1
      // 460: swap
      // 461: bipush 8
      // 463: swap
      // 464: aastore
      // 465: dup_x1
      // 466: swap
      // 467: bipush 7
      // 469: swap
      // 46a: aastore
      // 46b: dup_x1
      // 46c: swap
      // 46d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 470: bipush 6
      // 472: swap
      // 473: aastore
      // 474: dup_x1
      // 475: swap
      // 476: bipush 5
      // 477: swap
      // 478: aastore
      // 479: dup_x1
      // 47a: swap
      // 47b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 47e: bipush 4
      // 47f: swap
      // 480: aastore
      // 481: dup_x1
      // 482: swap
      // 483: bipush 3
      // 484: swap
      // 485: aastore
      // 486: dup_x1
      // 487: swap
      // 488: bipush 2
      // 489: swap
      // 48a: aastore
      // 48b: dup_x1
      // 48c: swap
      // 48d: bipush 1
      // 48e: swap
      // 48f: aastore
      // 490: dup_x2
      // 491: dup_x2
      // 492: pop
      // 493: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 496: bipush 0
      // 497: swap
      // 498: aastore
      // 499: ldc2_w -823264266357471949
      // 49c: lload 2
      // 49d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a2: astore 34
      // 4a4: aload 34
      // 4a6: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private static List B(Object[] var0) {
      boolean var3 = (Boolean)var0[0];
      _fz var1 = (_fz)var0[1];
      long var5 = (Long)var0[2];
      boolean var4 = (Boolean)var0[3];
      char[] var2 = (char[])var0[4];
      var5 = a ^ var5;
      long var7 = (var5 ^ 38940905759222L) >>> 32;
      int var9 = (int)((var5 ^ 38940905759222L) << 32 >>> 32);
      long var10 = var5 ^ 22571722940294L;
      long var12 = var5 ^ 57282137760270L;
      ArrayList var15 = new ArrayList();
      int var10000 = x44.a<"w">(-5029763899883986561L, var5);
      String var16 = var1.v();
      String var17 = x44.a<"o">(var1, new Object[0], -6652275129309638387L, var5);
      String var18 = x44.a<"w">(new Object[]{var17}, -6623932737651479178L, var5);
      Object[] var10005 = new Object[]{null, var17, var9};
      var10005[0] = var7;
      List var19 = x44.a<"w">(var10005, -6346671220725407670L, var5);
      _3 var20 = null;
      int var14 = var10000;
      o var21 = new o();
      HashSet var22 = x44.a<"w">(new Object[]{var12}, -6770341972998804538L, var5);

      while (true) {
         Object[] var10010 = new Object[]{null, null, null, var19, var18, var2, var20, var4};
         var10010[2] = var10;
         var10010[1] = var3;
         var10010[0] = var16;
         var20 = x44.a<"o">(var21, var10010, -6514406247368644961L, var5);

         label49:
         while (true) {
            label46: {
               if (var20 == null) {
                  var10000 = var14;

                  do {
                     if (var10000 != 0) {
                        continue label49;
                     }

                     var10000 = var14;
                  } while (var5 < 0L);

                  if (var14 == 0) {
                     break label46;
                  }
               }

               do {
                  String var23 = var20.Q();
                  if (var14 != 0) {
                     continue label49;
                  }

                  var10000 = var22.add(var23);
                  if (var5 >= 0L) {
                     if (var10000 == 0) {
                        break;
                     }

                     new _fz(var16, var23);
                     var15.add(var20);
                     if (var14 == 0) {
                        break;
                     }
                     break;
                  }

                  do {
                     if (var10000 != 0) {
                        continue label49;
                     }

                     var10000 = var14;
                  } while (var5 < 0L);
               } while (var14 != 0);
            }

            if (var5 > 0L) {
               return var15;
            }
         }
      }
   }

   public _3 H(Object[] var1) {
      yn var7 = (yn)var1[0];
      long var4 = (Long)var1[1];
      String var6 = (String)var1[2];
      ig var3 = (ig)var1[3];
      w var10 = (w)var1[4];
      Map var2 = (Map)var1[5];
      Map var9 = (Map)var1[6];
      boolean var11 = (Boolean)var1[7];
      boolean var8 = (Boolean)var1[8];
      var4 = a ^ var4;
      long var12 = var4 ^ 124881314210737L;
      long var14 = var4 ^ 56799293312373L;
      boolean var10005 = x44.a<"n">(var7, new Object[]{var12}, 4281288362501399217L, var4);
      Object[] var10012 = new Object[]{null, null, null, null, null, null, null, null, null, var8};
      var10012[8] = var11;
      var10012[7] = var9;
      var10012[6] = var14;
      var10012[5] = var2;
      var10012[4] = var10005;
      var10012[3] = var10;
      var10012[2] = var3;
      var10012[1] = var6;
      var10012[0] = var7;
      return x44.a<"n">(this, var10012, 2445851922463554440L, var4);
   }

   public _3 Q(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/ig
      // 016: astore 2
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast com/zelix/w
      // 01d: astore 6
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Boolean
      // 025: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 028: istore 5
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/util/Map
      // 030: astore 8
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/util/Map
      // 039: astore 9
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast java/lang/Boolean
      // 042: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 045: istore 10
      // 047: dup
      // 048: bipush 8
      // 04a: aaload
      // 04b: checkcast java/lang/Long
      // 04e: invokevirtual java/lang/Long.longValue ()J
      // 051: lstore 11
      // 053: dup
      // 054: bipush 9
      // 056: aaload
      // 057: checkcast java/lang/Boolean
      // 05a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05d: istore 7
      // 05f: pop
      // 060: getstatic com/zelix/xy.a J
      // 063: lload 11
      // 065: lxor
      // 066: lstore 11
      // 068: lload 11
      // 06a: dup2
      // 06b: ldc2_w 10009911019343
      // 06e: lxor
      // 06f: lstore 13
      // 071: dup2
      // 072: ldc2_w 23838719090013
      // 075: lxor
      // 076: lstore 15
      // 078: dup2
      // 079: ldc2_w 5720074246969
      // 07c: lxor
      // 07d: lstore 17
      // 07f: dup2
      // 080: ldc2_w 23803025092529
      // 083: lxor
      // 084: lstore 19
      // 086: dup2
      // 087: ldc2_w 100020682638476
      // 08a: lxor
      // 08b: lstore 21
      // 08d: dup2
      // 08e: ldc2_w 61764601120849
      // 091: lxor
      // 092: lstore 23
      // 094: dup2
      // 095: ldc2_w 96288025539481
      // 098: lxor
      // 099: lstore 25
      // 09b: dup2
      // 09c: ldc2_w 115122997504096
      // 09f: lxor
      // 0a0: lstore 27
      // 0a2: dup2
      // 0a3: ldc2_w 102178218935778
      // 0a6: lxor
      // 0a7: lstore 29
      // 0a9: dup2
      // 0aa: ldc2_w 98985253681084
      // 0ad: lxor
      // 0ae: lstore 31
      // 0b0: pop2
      // 0b1: aload 2
      // 0b2: lload 27
      // 0b4: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // 0b7: astore 34
      // 0b9: ldc2_w 6378896939766473996
      // 0bc: lload 11
      // 0be: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: aconst_null
      // 0c4: astore 35
      // 0c6: istore 33
      // 0c8: aconst_null
      // 0c9: astore 36
      // 0cb: aload 4
      // 0cd: lload 15
      // 0cf: bipush 1
      // 0d0: anewarray 287
      // 0d3: dup_x2
      // 0d4: dup_x2
      // 0d5: pop
      // 0d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d9: bipush 0
      // 0da: swap
      // 0db: aastore
      // 0dc: ldc2_w 5009785297120369757
      // 0df: lload 11
      // 0e1: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: ifeq 11d
      // 0e9: aload 0
      // 0ea: ldc2_w 5023818932226399411
      // 0ed: lload 11
      // 0ef: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_ye; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: lload 21
      // 0f6: aload 4
      // 0f8: aload 34
      // 0fa: bipush 3
      // 0fb: anewarray 287
      // 0fe: dup_x1
      // 0ff: swap
      // 100: bipush 2
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 1
      // 106: swap
      // 107: aastore
      // 108: dup_x2
      // 109: dup_x2
      // 10a: pop
      // 10b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10e: bipush 0
      // 10f: swap
      // 110: aastore
      // 111: ldc2_w 5127392807589240454
      // 114: lload 11
      // 116: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/pg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: astore 36
      // 11d: aload 36
      // 11f: ifnull 36b
      // 122: aload 0
      // 123: ldc2_w 5023818932226399411
      // 126: lload 11
      // 128: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_ye; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: aload 36
      // 12f: lload 17
      // 131: bipush 2
      // 132: anewarray 287
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
      // 143: ldc2_w 5011435111309454947
      // 146: lload 11
      // 148: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: astore 35
      // 14f: aload 35
      // 151: iload 33
      // 153: ifeq 488
      // 156: ifnonnull 486
      // 159: goto 167
      // 15c: ldc2_w 6891364096309808157
      // 15f: lload 11
      // 161: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: aload 0
      // 168: ldc2_w 5023818932226399411
      // 16b: lload 11
      // 16d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_ye; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: aload 2
      // 173: bipush 1
      // 174: anewarray 287
      // 177: dup_x1
      // 178: swap
      // 179: bipush 0
      // 17a: swap
      // 17b: aastore
      // 17c: ldc2_w 4660803025115036985
      // 17f: lload 11
      // 181: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: astore 37
      // 188: aload 37
      // 18a: iload 33
      // 18c: ifeq 1a2
      // 18f: ifnull 2b5
      // 192: goto 1a0
      // 195: ldc2_w 6891364096309808157
      // 198: lload 11
      // 19a: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: aload 37
      // 1a2: lload 13
      // 1a4: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 1a7: astore 38
      // 1a9: aload 38
      // 1ab: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 1ae: astore 39
      // 1b0: aload 39
      // 1b2: lload 11
      // 1b4: lconst_0
      // 1b5: lcmp
      // 1b6: iflt 1d1
      // 1b9: iload 33
      // 1bb: ifeq 1d1
      // 1be: ifnull 1ec
      // 1c1: goto 1cf
      // 1c4: ldc2_w 6891364096309808157
      // 1c7: lload 11
      // 1c9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: aload 39
      // 1d1: lload 31
      // 1d3: invokevirtual com/zelix/yn.S (J)Z
      // 1d6: iload 33
      // 1d8: ifeq 20d
      // 1db: ifeq 1f2
      // 1de: goto 1ec
      // 1e1: ldc2_w 6891364096309808157
      // 1e4: lload 11
      // 1e6: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: aconst_null
      // 1ed: astore 35
      // 1ef: goto 2b0
      // 1f2: aload 39
      // 1f4: lload 23
      // 1f6: bipush 1
      // 1f7: anewarray 287
      // 1fa: dup_x2
      // 1fb: dup_x2
      // 1fc: pop
      // 1fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 200: bipush 0
      // 201: swap
      // 202: aastore
      // 203: ldc2_w 6487136809740587101
      // 206: lload 11
      // 208: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: ifne 249
      // 210: aload 0
      // 211: ldc2_w 6903697549141692835
      // 214: lload 11
      // 216: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_yz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: aload 37
      // 21d: lload 29
      // 21f: bipush 2
      // 220: anewarray 287
      // 223: dup_x2
      // 224: dup_x2
      // 225: pop
      // 226: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 229: bipush 1
      // 22a: swap
      // 22b: aastore
      // 22c: dup_x1
      // 22d: swap
      // 22e: bipush 0
      // 22f: swap
      // 230: aastore
      // 231: ldc2_w 6871313498837984975
      // 234: lload 11
      // 236: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: astore 35
      // 23d: iload 33
      // 23f: lload 11
      // 241: lconst_0
      // 242: lcmp
      // 243: ifle 2b2
      // 246: ifne 2b0
      // 249: aload 0
      // 24a: aload 4
      // 24c: aload 3
      // 24d: aload 2
      // 24e: aload 6
      // 250: iload 5
      // 252: aload 8
      // 254: lload 25
      // 256: aload 9
      // 258: iload 10
      // 25a: iload 7
      // 25c: bipush 10
      // 25e: anewarray 287
      // 261: dup_x1
      // 262: swap
      // 263: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 266: bipush 9
      // 268: swap
      // 269: aastore
      // 26a: dup_x1
      // 26b: swap
      // 26c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 26f: bipush 8
      // 271: swap
      // 272: aastore
      // 273: dup_x1
      // 274: swap
      // 275: bipush 7
      // 277: swap
      // 278: aastore
      // 279: dup_x2
      // 27a: dup_x2
      // 27b: pop
      // 27c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27f: bipush 6
      // 281: swap
      // 282: aastore
      // 283: dup_x1
      // 284: swap
      // 285: bipush 5
      // 286: swap
      // 287: aastore
      // 288: dup_x1
      // 289: swap
      // 28a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 28d: bipush 4
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: bipush 3
      // 293: swap
      // 294: aastore
      // 295: dup_x1
      // 296: swap
      // 297: bipush 2
      // 298: swap
      // 299: aastore
      // 29a: dup_x1
      // 29b: swap
      // 29c: bipush 1
      // 29d: swap
      // 29e: aastore
      // 29f: dup_x1
      // 2a0: swap
      // 2a1: bipush 0
      // 2a2: swap
      // 2a3: aastore
      // 2a4: ldc2_w 6853648944826156388
      // 2a7: lload 11
      // 2a9: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: astore 35
      // 2b0: iload 33
      // 2b2: ifne 31c
      // 2b5: aload 0
      // 2b6: aload 4
      // 2b8: aload 3
      // 2b9: aload 2
      // 2ba: aload 6
      // 2bc: iload 5
      // 2be: aload 8
      // 2c0: lload 25
      // 2c2: aload 9
      // 2c4: iload 10
      // 2c6: iload 7
      // 2c8: bipush 10
      // 2ca: anewarray 287
      // 2cd: dup_x1
      // 2ce: swap
      // 2cf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2d2: bipush 9
      // 2d4: swap
      // 2d5: aastore
      // 2d6: dup_x1
      // 2d7: swap
      // 2d8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2db: bipush 8
      // 2dd: swap
      // 2de: aastore
      // 2df: dup_x1
      // 2e0: swap
      // 2e1: bipush 7
      // 2e3: swap
      // 2e4: aastore
      // 2e5: dup_x2
      // 2e6: dup_x2
      // 2e7: pop
      // 2e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2eb: bipush 6
      // 2ed: swap
      // 2ee: aastore
      // 2ef: dup_x1
      // 2f0: swap
      // 2f1: bipush 5
      // 2f2: swap
      // 2f3: aastore
      // 2f4: dup_x1
      // 2f5: swap
      // 2f6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2f9: bipush 4
      // 2fa: swap
      // 2fb: aastore
      // 2fc: dup_x1
      // 2fd: swap
      // 2fe: bipush 3
      // 2ff: swap
      // 300: aastore
      // 301: dup_x1
      // 302: swap
      // 303: bipush 2
      // 304: swap
      // 305: aastore
      // 306: dup_x1
      // 307: swap
      // 308: bipush 1
      // 309: swap
      // 30a: aastore
      // 30b: dup_x1
      // 30c: swap
      // 30d: bipush 0
      // 30e: swap
      // 30f: aastore
      // 310: ldc2_w 6853648944826156388
      // 313: lload 11
      // 315: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: astore 35
      // 31c: lload 11
      // 31e: lconst_0
      // 31f: lcmp
      // 320: iflt 35a
      // 323: aload 35
      // 325: ifnull 368
      // 328: aload 0
      // 329: ldc2_w 5023818932226399411
      // 32c: lload 11
      // 32e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_ye; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: lload 19
      // 335: aload 36
      // 337: aload 35
      // 339: bipush 3
      // 33a: anewarray 287
      // 33d: dup_x1
      // 33e: swap
      // 33f: bipush 2
      // 340: swap
      // 341: aastore
      // 342: dup_x1
      // 343: swap
      // 344: bipush 1
      // 345: swap
      // 346: aastore
      // 347: dup_x2
      // 348: dup_x2
      // 349: pop
      // 34a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34d: bipush 0
      // 34e: swap
      // 34f: aastore
      // 350: ldc2_w 6411810405393125734
      // 353: lload 11
      // 355: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: goto 368
      // 35d: ldc2_w 6891364096309808157
      // 360: lload 11
      // 362: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: athrow
      // 368: goto 486
      // 36b: aload 0
      // 36c: ldc2_w 5023818932226399411
      // 36f: lload 11
      // 371: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_ye; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: aload 2
      // 377: bipush 1
      // 378: anewarray 287
      // 37b: dup_x1
      // 37c: swap
      // 37d: bipush 0
      // 37e: swap
      // 37f: aastore
      // 380: ldc2_w 4660803025115036985
      // 383: lload 11
      // 385: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38a: astore 37
      // 38c: aload 37
      // 38e: iload 33
      // 390: ifeq 3a6
      // 393: ifnull 41f
      // 396: goto 3a4
      // 399: ldc2_w 6891364096309808157
      // 39c: lload 11
      // 39e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: athrow
      // 3a4: aload 37
      // 3a6: lload 13
      // 3a8: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 3ab: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 3ae: astore 38
      // 3b0: iload 33
      // 3b2: lload 11
      // 3b4: lconst_0
      // 3b5: lcmp
      // 3b6: ifle 3ec
      // 3b9: ifeq 3ea
      // 3bc: aload 38
      // 3be: ifnull 3e7
      // 3c1: goto 3cf
      // 3c4: ldc2_w 6891364096309808157
      // 3c7: lload 11
      // 3c9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ce: athrow
      // 3cf: aload 38
      // 3d1: lload 31
      // 3d3: invokevirtual com/zelix/yn.S (J)Z
      // 3d6: ifeq 3ef
      // 3d9: goto 3e7
      // 3dc: ldc2_w 6891364096309808157
      // 3df: lload 11
      // 3e1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e6: athrow
      // 3e7: aconst_null
      // 3e8: astore 35
      // 3ea: iload 33
      // 3ec: ifne 41c
      // 3ef: aload 0
      // 3f0: ldc2_w 6903697549141692835
      // 3f3: lload 11
      // 3f5: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/_yz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fa: aload 37
      // 3fc: lload 29
      // 3fe: bipush 2
      // 3ff: anewarray 287
      // 402: dup_x2
      // 403: dup_x2
      // 404: pop
      // 405: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 408: bipush 1
      // 409: swap
      // 40a: aastore
      // 40b: dup_x1
      // 40c: swap
      // 40d: bipush 0
      // 40e: swap
      // 40f: aastore
      // 410: ldc2_w 6871313498837984975
      // 413: lload 11
      // 415: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41a: astore 35
      // 41c: goto 486
      // 41f: aload 0
      // 420: aload 4
      // 422: aload 3
      // 423: aload 2
      // 424: aload 6
      // 426: iload 5
      // 428: aload 8
      // 42a: lload 25
      // 42c: aload 9
      // 42e: iload 10
      // 430: iload 7
      // 432: bipush 10
      // 434: anewarray 287
      // 437: dup_x1
      // 438: swap
      // 439: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 43c: bipush 9
      // 43e: swap
      // 43f: aastore
      // 440: dup_x1
      // 441: swap
      // 442: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 445: bipush 8
      // 447: swap
      // 448: aastore
      // 449: dup_x1
      // 44a: swap
      // 44b: bipush 7
      // 44d: swap
      // 44e: aastore
      // 44f: dup_x2
      // 450: dup_x2
      // 451: pop
      // 452: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 455: bipush 6
      // 457: swap
      // 458: aastore
      // 459: dup_x1
      // 45a: swap
      // 45b: bipush 5
      // 45c: swap
      // 45d: aastore
      // 45e: dup_x1
      // 45f: swap
      // 460: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 463: bipush 4
      // 464: swap
      // 465: aastore
      // 466: dup_x1
      // 467: swap
      // 468: bipush 3
      // 469: swap
      // 46a: aastore
      // 46b: dup_x1
      // 46c: swap
      // 46d: bipush 2
      // 46e: swap
      // 46f: aastore
      // 470: dup_x1
      // 471: swap
      // 472: bipush 1
      // 473: swap
      // 474: aastore
      // 475: dup_x1
      // 476: swap
      // 477: bipush 0
      // 478: swap
      // 479: aastore
      // 47a: ldc2_w 6853648944826156388
      // 47d: lload 11
      // 47f: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 484: astore 35
      // 486: aload 35
      // 488: areturn
   }

   private _3 g(Object[] var1) {
      long var3 = (Long)var1[0];
      yn var8 = (yn)var1[1];
      ig var11 = (ig)var1[2];
      _fz var12 = (_fz)var1[3];
      boolean var5 = (Boolean)var1[4];
      w var2 = (w)var1[5];
      boolean var10 = (Boolean)var1[6];
      Map var7 = (Map)var1[7];
      Map var13 = (Map)var1[8];
      boolean var6 = (Boolean)var1[9];
      char[][] var9 = (char[][])var1[10];
      var3 = a ^ var3;
      long var14 = var3 ^ 1579382729461L;
      long var16 = (var3 ^ 65615758960354L) >>> 32;
      int var18 = (int)((var3 ^ 65615758960354L) << 32 >>> 32);
      long var19 = var3 ^ 105150858681089L;
      long var21 = var3 ^ 40222660322119L;
      long var23 = var3 ^ 49336149009690L;
      int var10000 = x44.a<"s">(9018080735806826091L, var3);
      String var26 = var12.v();
      String var27 = x44.a<"k">(var12, new Object[0], 7258192657129575961L, var3);
      String var28 = x44.a<"s">(new Object[]{var27}, 7135681492569041506L, var3);
      Object[] var10005 = new Object[]{null, var27, var18};
      var10005[0] = var16;
      List var29 = x44.a<"s">(var10005, 6987335789854877534L, var3);
      _3 var30 = null;
      int var25 = var10000;
      wp var31 = new wp();
      o var32 = new o();
      HashSet var33 = x44.a<"s">(new Object[]{var23}, 7286526364015324370L, var3);

      label29:
      while (true) {
         boolean var10003 = x44.a<"k">(var11, new Object[]{var21}, 7354379842824177106L, var3);
         Object[] var10011 = new Object[]{null, null, null, var29, var28, var31, var30, var5, var9};
         var10011[2] = var10003;
         var10011[1] = var26;
         var10011[0] = var19;
         var30 = x44.a<"k">(var32, var10011, 8751262158550667051L, var3);

         label27:
         while (true) {
            _3 var37 = var30;

            while (var37 != null) {
               String var34 = var30.Q();
               if (var25 != 0) {
                  continue label27;
               }

               if (!var33.add(var34)) {
                  continue label29;
               }

               _fz var35 = new _fz(var26, var34);
               Object[] var10013 = new Object[]{null, null, null, null, null, null, null, null, null, null, var10};
               var10013[9] = var6;
               var10013[8] = var13;
               var10013[7] = var14;
               var10013[6] = var7;
               var10013[5] = var2;
               var10013[4] = var12;
               var10013[3] = var35;
               var10013[2] = var30;
               var10013[1] = var11;
               var10013[0] = var8;
               if (!x44.a<"k">(this, var10013, 7437311169495478472L, var3)) {
                  continue label29;
               }

               var37 = var30;
               if (var3 >= 0L) {
                  return var30;
               }
            }

            return null;
         }
      }
   }

   final boolean T(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 10
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/ig
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_3
      // 017: astore 3
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/_fz
      // 01e: astore 5
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast com/zelix/_fz
      // 026: astore 2
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast com/zelix/w
      // 02d: astore 7
      // 02f: dup
      // 030: bipush 6
      // 032: aaload
      // 033: checkcast java/util/Map
      // 036: astore 12
      // 038: dup
      // 039: bipush 7
      // 03b: aaload
      // 03c: checkcast java/lang/Long
      // 03f: invokevirtual java/lang/Long.longValue ()J
      // 042: lstore 8
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast java/util/Map
      // 04b: astore 13
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast java/lang/Boolean
      // 054: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 057: istore 6
      // 059: dup
      // 05a: bipush 10
      // 05c: aaload
      // 05d: checkcast java/lang/Boolean
      // 060: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 063: istore 11
      // 065: pop
      // 066: getstatic com/zelix/xy.a J
      // 069: lload 8
      // 06b: lxor
      // 06c: lstore 8
      // 06e: lload 8
      // 070: dup2
      // 071: ldc2_w 108095264748683
      // 074: lxor
      // 075: lstore 14
      // 077: dup2
      // 078: ldc2_w 116543836198831
      // 07b: lxor
      // 07c: lstore 16
      // 07e: dup2
      // 07f: ldc2_w 48827293771831
      // 082: lxor
      // 083: lstore 18
      // 085: dup2
      // 086: ldc2_w 31362805756976
      // 089: lxor
      // 08a: lstore 20
      // 08c: dup2
      // 08d: ldc2_w 1810232618634
      // 090: lxor
      // 091: lstore 22
      // 093: dup2
      // 094: ldc2_w 39192339290787
      // 097: lxor
      // 098: lstore 24
      // 09a: dup2
      // 09b: ldc2_w 19932513094464
      // 09e: lxor
      // 09f: lstore 26
      // 0a1: dup2
      // 0a2: ldc2_w 21654315499970
      // 0a5: lxor
      // 0a6: lstore 28
      // 0a8: pop2
      // 0a9: ldc2_w -3730846837045399117
      // 0ac: lload 8
      // 0ae: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: aload 5
      // 0b5: lload 16
      // 0b7: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 0ba: astore 31
      // 0bc: istore 30
      // 0be: iload 6
      // 0c0: ifeq 0d3
      // 0c3: aload 5
      // 0c5: goto 0d5
      // 0c8: ldc2_w -3811116982352029534
      // 0cb: lload 8
      // 0cd: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 31
      // 0d5: astore 32
      // 0d7: aload 5
      // 0d9: bipush 0
      // 0da: anewarray 287
      // 0dd: ldc2_w -3707565469560259025
      // 0e0: lload 8
      // 0e2: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: aload 2
      // 0e8: bipush 0
      // 0e9: anewarray 287
      // 0ec: ldc2_w -3707565469560259025
      // 0ef: lload 8
      // 0f1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f9: iload 30
      // 0fb: lload 8
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: iflt 127
      // 102: ifeq 125
      // 105: ifeq 123
      // 108: goto 116
      // 10b: ldc2_w -3811116982352029534
      // 10e: lload 8
      // 110: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: athrow
      // 116: bipush 0
      // 117: ireturn
      // 118: ldc2_w -3811116982352029534
      // 11b: lload 8
      // 11d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: iload 6
      // 125: iload 30
      // 127: lload 8
      // 129: lconst_0
      // 12a: lcmp
      // 12b: iflt 173
      // 12e: ifeq 171
      // 131: ifeq 16f
      // 134: goto 142
      // 137: ldc2_w -3811116982352029534
      // 13a: lload 8
      // 13c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: aload 12
      // 144: aload 5
      // 146: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 14b: iload 30
      // 14d: ifeq 1c1
      // 150: goto 15e
      // 153: ldc2_w -3811116982352029534
      // 156: lload 8
      // 158: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: ifne 1c0
      // 161: goto 16f
      // 164: ldc2_w -3811116982352029534
      // 167: lload 8
      // 169: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: iload 6
      // 171: iload 30
      // 173: ifeq 1dc
      // 176: ifne 1c2
      // 179: goto 187
      // 17c: ldc2_w -3811116982352029534
      // 17f: lload 8
      // 181: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 13
      // 189: aload 5
      // 18b: lload 16
      // 18d: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // 190: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 195: iload 30
      // 197: lload 8
      // 199: lconst_0
      // 19a: lcmp
      // 19b: ifle 1de
      // 19e: ifeq 1dc
      // 1a1: goto 1af
      // 1a4: ldc2_w -3811116982352029534
      // 1a7: lload 8
      // 1a9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: ifeq 1c2
      // 1b2: goto 1c0
      // 1b5: ldc2_w -3811116982352029534
      // 1b8: lload 8
      // 1ba: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: athrow
      // 1c0: bipush 0
      // 1c1: ireturn
      // 1c2: aload 2
      // 1c3: lload 22
      // 1c5: bipush 1
      // 1c6: anewarray 287
      // 1c9: dup_x2
      // 1ca: dup_x2
      // 1cb: pop
      // 1cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cf: bipush 0
      // 1d0: swap
      // 1d1: aastore
      // 1d2: ldc2_w -3824628415333370934
      // 1d5: lload 8
      // 1d7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: iload 30
      // 1de: ifeq 25e
      // 1e1: ifne 233
      // 1e4: goto 1f2
      // 1e7: ldc2_w -3811116982352029534
      // 1ea: lload 8
      // 1ec: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: aload 7
      // 1f4: lload 20
      // 1f6: aload 32
      // 1f8: invokevirtual com/zelix/w.R (JLjava/lang/Object;)Z
      // 1fb: iload 30
      // 1fd: lload 8
      // 1ff: lconst_0
      // 200: lcmp
      // 201: ifle 260
      // 204: ifeq 25e
      // 207: goto 215
      // 20a: ldc2_w -3811116982352029534
      // 20d: lload 8
      // 20f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: athrow
      // 215: ifeq 233
      // 218: goto 226
      // 21b: ldc2_w -3811116982352029534
      // 21e: lload 8
      // 220: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: athrow
      // 226: bipush 0
      // 227: ireturn
      // 228: ldc2_w -3811116982352029534
      // 22b: lload 8
      // 22d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: aload 0
      // 234: ldc2_w -3384724662182017012
      // 237: lload 8
      // 239: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_ye; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: lload 18
      // 240: aload 5
      // 242: bipush 2
      // 243: anewarray 287
      // 246: dup_x1
      // 247: swap
      // 248: bipush 1
      // 249: swap
      // 24a: aastore
      // 24b: dup_x2
      // 24c: dup_x2
      // 24d: pop
      // 24e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 251: bipush 0
      // 252: swap
      // 253: aastore
      // 254: ldc2_w -3744430852318748678
      // 257: lload 8
      // 259: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: iload 30
      // 260: lload 8
      // 262: lconst_0
      // 263: lcmp
      // 264: ifle 2c2
      // 267: ifeq 2c0
      // 26a: ifeq 288
      // 26d: goto 27b
      // 270: ldc2_w -3811116982352029534
      // 273: lload 8
      // 275: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: athrow
      // 27b: bipush 0
      // 27c: ireturn
      // 27d: ldc2_w -3811116982352029534
      // 280: lload 8
      // 282: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: athrow
      // 288: aload 0
      // 289: ldc2_w -3384724662182017012
      // 28c: lload 8
      // 28e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_ye; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: aload 10
      // 295: aload 5
      // 297: aload 2
      // 298: lload 28
      // 29a: bipush 4
      // 29b: anewarray 287
      // 29e: dup_x2
      // 29f: dup_x2
      // 2a0: pop
      // 2a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a4: bipush 3
      // 2a5: swap
      // 2a6: aastore
      // 2a7: dup_x1
      // 2a8: swap
      // 2a9: bipush 2
      // 2aa: swap
      // 2ab: aastore
      // 2ac: dup_x1
      // 2ad: swap
      // 2ae: bipush 1
      // 2af: swap
      // 2b0: aastore
      // 2b1: dup_x1
      // 2b2: swap
      // 2b3: bipush 0
      // 2b4: swap
      // 2b5: aastore
      // 2b6: ldc2_w -2942089794488401341
      // 2b9: lload 8
      // 2bb: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c0: iload 30
      // 2c2: lload 8
      // 2c4: lconst_0
      // 2c5: lcmp
      // 2c6: iflt 2ee
      // 2c9: ifeq 2ec
      // 2cc: ifeq 2ea
      // 2cf: goto 2dd
      // 2d2: ldc2_w -3811116982352029534
      // 2d5: lload 8
      // 2d7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: athrow
      // 2dd: bipush 0
      // 2de: ireturn
      // 2df: ldc2_w -3811116982352029534
      // 2e2: lload 8
      // 2e4: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: athrow
      // 2ea: iload 11
      // 2ec: iload 30
      // 2ee: ifeq 3b1
      // 2f1: ifeq 38a
      // 2f4: goto 302
      // 2f7: ldc2_w -3811116982352029534
      // 2fa: lload 8
      // 2fc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 301: athrow
      // 302: aload 0
      // 303: ldc2_w -3384724662182017012
      // 306: lload 8
      // 308: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/_ye; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: aload 10
      // 30f: aload 5
      // 311: lload 24
      // 313: aload 2
      // 314: bipush 1
      // 315: new com/zelix/pg
      // 318: dup
      // 319: lload 26
      // 31b: invokespecial com/zelix/pg.<init> (J)V
      // 31e: bipush 6
      // 320: anewarray 287
      // 323: dup_x1
      // 324: swap
      // 325: bipush 5
      // 326: swap
      // 327: aastore
      // 328: dup_x1
      // 329: swap
      // 32a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 32d: bipush 4
      // 32e: swap
      // 32f: aastore
      // 330: dup_x1
      // 331: swap
      // 332: bipush 3
      // 333: swap
      // 334: aastore
      // 335: dup_x2
      // 336: dup_x2
      // 337: pop
      // 338: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33b: bipush 2
      // 33c: swap
      // 33d: aastore
      // 33e: dup_x1
      // 33f: swap
      // 340: bipush 1
      // 341: swap
      // 342: aastore
      // 343: dup_x1
      // 344: swap
      // 345: bipush 0
      // 346: swap
      // 347: aastore
      // 348: ldc2_w -3836946851098035992
      // 34b: lload 8
      // 34d: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: iload 30
      // 354: lload 8
      // 356: lconst_0
      // 357: lcmp
      // 358: ifle 3b3
      // 35b: ifeq 3b1
      // 35e: goto 36c
      // 361: ldc2_w -3811116982352029534
      // 364: lload 8
      // 366: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36b: athrow
      // 36c: ifne 38a
      // 36f: goto 37d
      // 372: ldc2_w -3811116982352029534
      // 375: lload 8
      // 377: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: athrow
      // 37d: bipush 0
      // 37e: ireturn
      // 37f: ldc2_w -3811116982352029534
      // 382: lload 8
      // 384: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 389: athrow
      // 38a: aload 0
      // 38b: aload 4
      // 38d: lload 14
      // 38f: aload 3
      // 390: bipush 3
      // 391: anewarray 287
      // 394: dup_x1
      // 395: swap
      // 396: bipush 2
      // 397: swap
      // 398: aastore
      // 399: dup_x2
      // 39a: dup_x2
      // 39b: pop
      // 39c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39f: bipush 1
      // 3a0: swap
      // 3a1: aastore
      // 3a2: dup_x1
      // 3a3: swap
      // 3a4: bipush 0
      // 3a5: swap
      // 3a6: aastore
      // 3a7: ldc2_w -3387335283287278849
      // 3aa: lload 8
      // 3ac: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: iload 30
      // 3b3: ifeq 3d5
      // 3b6: ifne 3d4
      // 3b9: goto 3c7
      // 3bc: ldc2_w -3811116982352029534
      // 3bf: lload 8
      // 3c1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: athrow
      // 3c7: bipush 0
      // 3c8: ireturn
      // 3c9: ldc2_w -3811116982352029534
      // 3cc: lload 8
      // 3ce: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d3: athrow
      // 3d4: bipush 1
      // 3d5: ireturn
   }

   private _3 X(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 11
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/ig
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_fz
      // 017: astore 12
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Boolean
      // 01f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 022: istore 5
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast com/zelix/w
      // 02a: astore 4
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/lang/Boolean
      // 032: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 035: istore 6
      // 037: dup
      // 038: bipush 6
      // 03a: aaload
      // 03b: checkcast java/lang/Long
      // 03e: invokevirtual java/lang/Long.longValue ()J
      // 041: lstore 2
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast java/util/Map
      // 049: astore 13
      // 04b: dup
      // 04c: bipush 8
      // 04e: aaload
      // 04f: checkcast java/util/Map
      // 052: astore 7
      // 054: dup
      // 055: bipush 9
      // 057: aaload
      // 058: checkcast java/lang/Boolean
      // 05b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05e: istore 10
      // 060: dup
      // 061: bipush 10
      // 063: aaload
      // 064: checkcast [[C
      // 067: astore 8
      // 069: pop
      // 06a: getstatic com/zelix/xy.a J
      // 06d: lload 2
      // 06e: lxor
      // 06f: lstore 2
      // 070: lload 2
      // 071: dup2
      // 072: ldc2_w 124453189590948
      // 075: lxor
      // 076: lstore 14
      // 078: dup2
      // 079: ldc2_w 93227361408534
      // 07c: lxor
      // 07d: lstore 16
      // 07f: dup2
      // 080: ldc2_w 64777504583814
      // 083: lxor
      // 084: lstore 18
      // 086: dup2
      // 087: ldc2_w 101712492826699
      // 08a: lxor
      // 08b: lstore 20
      // 08d: dup2
      // 08e: ldc2_w 2265161198213
      // 091: lxor
      // 092: lstore 22
      // 094: pop2
      // 095: aload 12
      // 097: invokevirtual com/zelix/_fz.v ()Ljava/lang/String;
      // 09a: astore 25
      // 09c: ldc2_w -8613177198311058630
      // 09f: lload 2
      // 0a0: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: lload 20
      // 0a7: bipush 1
      // 0a8: anewarray 287
      // 0ab: dup_x2
      // 0ac: dup_x2
      // 0ad: pop
      // 0ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b1: bipush 0
      // 0b2: swap
      // 0b3: aastore
      // 0b4: ldc2_w -8048071895414400637
      // 0b7: lload 2
      // 0b8: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: astore 26
      // 0bf: bipush 0
      // 0c0: istore 27
      // 0c2: istore 24
      // 0c4: iload 27
      // 0c6: aload 8
      // 0c8: arraylength
      // 0c9: if_icmpge 259
      // 0cc: aload 8
      // 0ce: iload 27
      // 0d0: aaload
      // 0d1: astore 28
      // 0d3: aload 9
      // 0d5: lload 16
      // 0d7: bipush 1
      // 0d8: anewarray 287
      // 0db: dup_x2
      // 0dc: dup_x2
      // 0dd: pop
      // 0de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e1: bipush 0
      // 0e2: swap
      // 0e3: aastore
      // 0e4: ldc2_w -7835856672907595645
      // 0e7: lload 2
      // 0e8: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: aload 12
      // 0ef: lload 18
      // 0f1: iload 5
      // 0f3: aload 28
      // 0f5: bipush 5
      // 0f6: anewarray 287
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: bipush 4
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x1
      // 0ff: swap
      // 100: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 103: bipush 3
      // 104: swap
      // 105: aastore
      // 106: dup_x2
      // 107: dup_x2
      // 108: pop
      // 109: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10c: bipush 2
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 1
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 119: bipush 0
      // 11a: swap
      // 11b: aastore
      // 11c: ldc2_w -7998821888165877764
      // 11f: lload 2
      // 120: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: astore 29
      // 127: aload 29
      // 129: iload 24
      // 12b: ifne 183
      // 12e: invokeinterface java/util/List.size ()I 1
      // 133: bipush 1
      // 134: if_icmple 181
      // 137: goto 144
      // 13a: ldc2_w -7603463713856387643
      // 13d: lload 2
      // 13e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: aload 29
      // 146: aload 0
      // 147: ldc2_w -8517478718513658074
      // 14a: lload 2
      // 14b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Random; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: lload 22
      // 152: dup2_x1
      // 153: pop2
      // 154: bipush 3
      // 155: anewarray 287
      // 158: dup_x1
      // 159: swap
      // 15a: bipush 2
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x2
      // 15e: dup_x2
      // 15f: pop
      // 160: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 163: bipush 1
      // 164: swap
      // 165: aastore
      // 166: dup_x1
      // 167: swap
      // 168: bipush 0
      // 169: swap
      // 16a: aastore
      // 16b: ldc2_w -8039311500509628561
      // 16e: lload 2
      // 16f: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: goto 181
      // 177: ldc2_w -7603463713856387643
      // 17a: lload 2
      // 17b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: aload 29
      // 183: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 188: astore 30
      // 18a: aload 30
      // 18c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 191: ifeq 24b
      // 194: aload 30
      // 196: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19b: checkcast com/zelix/_3
      // 19e: astore 31
      // 1a0: aload 31
      // 1a2: invokevirtual com/zelix/_3.Q ()Ljava/lang/String;
      // 1a5: astore 32
      // 1a7: aload 26
      // 1a9: aload 32
      // 1ab: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1b0: iload 24
      // 1b2: ifne 0c6
      // 1b5: ifeq 246
      // 1b8: new com/zelix/_fz
      // 1bb: dup
      // 1bc: aload 25
      // 1be: aload 32
      // 1c0: invokespecial com/zelix/_fz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1c3: astore 33
      // 1c5: aload 0
      // 1c6: aload 11
      // 1c8: aload 9
      // 1ca: aload 31
      // 1cc: aload 33
      // 1ce: aload 12
      // 1d0: aload 4
      // 1d2: aload 13
      // 1d4: lload 14
      // 1d6: aload 7
      // 1d8: iload 10
      // 1da: iload 6
      // 1dc: bipush 11
      // 1de: anewarray 287
      // 1e1: dup_x1
      // 1e2: swap
      // 1e3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1e6: bipush 10
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1ef: bipush 9
      // 1f1: swap
      // 1f2: aastore
      // 1f3: dup_x1
      // 1f4: swap
      // 1f5: bipush 8
      // 1f7: swap
      // 1f8: aastore
      // 1f9: dup_x2
      // 1fa: dup_x2
      // 1fb: pop
      // 1fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ff: bipush 7
      // 201: swap
      // 202: aastore
      // 203: dup_x1
      // 204: swap
      // 205: bipush 6
      // 207: swap
      // 208: aastore
      // 209: dup_x1
      // 20a: swap
      // 20b: bipush 5
      // 20c: swap
      // 20d: aastore
      // 20e: dup_x1
      // 20f: swap
      // 210: bipush 4
      // 211: swap
      // 212: aastore
      // 213: dup_x1
      // 214: swap
      // 215: bipush 3
      // 216: swap
      // 217: aastore
      // 218: dup_x1
      // 219: swap
      // 21a: bipush 2
      // 21b: swap
      // 21c: aastore
      // 21d: dup_x1
      // 21e: swap
      // 21f: bipush 1
      // 220: swap
      // 221: aastore
      // 222: dup_x1
      // 223: swap
      // 224: bipush 0
      // 225: swap
      // 226: aastore
      // 227: ldc2_w -7897111125656779367
      // 22a: lload 2
      // 22b: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: lload 2
      // 231: lconst_0
      // 232: lcmp
      // 233: iflt 248
      // 236: ifeq 246
      // 239: aload 31
      // 23b: areturn
      // 23c: ldc2_w -7603463713856387643
      // 23f: lload 2
      // 240: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: iload 24
      // 248: ifeq 18a
      // 24b: iinc 27 1
      // 24e: iload 24
      // 250: lload 2
      // 251: lconst_0
      // 252: lcmp
      // 253: ifle 0c6
      // 256: ifeq 0c4
      // 259: lload 2
      // 25a: lconst_0
      // 25b: lcmp
      // 25c: iflt 0cc
      // 25f: aconst_null
      // 260: areturn
   }

   public _3 U(Object[] var1) {
      yn var5 = (yn)var1[0];
      String var3 = (String)var1[1];
      ig var10 = (ig)var1[2];
      w var11 = (w)var1[3];
      boolean var4 = (Boolean)var1[4];
      long var8 = (Long)var1[5];
      Map var6 = (Map)var1[6];
      Map var12 = (Map)var1[7];
      boolean var7 = (Boolean)var1[8];
      boolean var2 = (Boolean)var1[9];
      var8 = a ^ var8;
      long var13 = var8 ^ 49304209706037L;
      long var15 = var8 ^ 121956268188401L;
      boolean var10005 = x44.a<"j">(var5, new Object[]{var13}, -7715109992091595467L, var8);
      Object[] var10012 = new Object[]{null, null, null, null, null, null, null, null, null, var2};
      var10012[8] = var7;
      var10012[7] = var12;
      var10012[6] = var15;
      var10012[5] = var6;
      var10012[4] = var10005;
      var10012[3] = var11;
      var10012[2] = var10;
      var10012[1] = var3;
      var10012[0] = var5;
      return x44.a<"j">(this, var10012, -8181575841002695668L, var8);
   }

   boolean w(Object[] param1) {
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
      // 004: checkcast com/zelix/ig
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_3
      // 019: astore 3
      // 01a: pop
      // 01b: getstatic com/zelix/xy.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 97362702874780
      // 029: lxor
      // 02a: dup2
      // 02b: bipush 32
      // 02d: lushr
      // 02e: lstore 6
      // 030: dup2
      // 031: bipush 32
      // 033: lshl
      // 034: bipush 32
      // 036: lushr
      // 037: l2i
      // 038: istore 8
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 78843925888313
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 113648674973877
      // 046: lxor
      // 047: lstore 11
      // 049: pop2
      // 04a: ldc2_w -2064676651070932971
      // 04d: lload 4
      // 04f: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: istore 13
      // 056: aload 2
      // 057: lload 9
      // 059: bipush 1
      // 05a: anewarray 287
      // 05d: dup_x2
      // 05e: dup_x2
      // 05f: pop
      // 060: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 063: bipush 0
      // 064: swap
      // 065: aastore
      // 066: ldc2_w -545390064935068756
      // 069: lload 4
      // 06b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: iload 13
      // 072: ifne 0ad
      // 075: ifne 093
      // 078: goto 086
      // 07b: ldc2_w -192527273877311766
      // 07e: lload 4
      // 080: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: bipush 1
      // 087: ireturn
      // 088: ldc2_w -192527273877311766
      // 08b: lload 4
      // 08d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 2
      // 094: lload 11
      // 096: bipush 1
      // 097: anewarray 287
      // 09a: dup_x2
      // 09b: dup_x2
      // 09c: pop
      // 09d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a0: bipush 0
      // 0a1: swap
      // 0a2: aastore
      // 0a3: ldc2_w -2148018999869565403
      // 0a6: lload 4
      // 0a8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: istore 14
      // 0af: iload 14
      // 0b1: iload 13
      // 0b3: ifne 150
      // 0b6: ifle 14f
      // 0b9: goto 0c7
      // 0bc: ldc2_w -192527273877311766
      // 0bf: lload 4
      // 0c1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 3
      // 0c8: bipush 0
      // 0c9: anewarray 287
      // 0cc: ldc2_w -103117456057439479
      // 0cf: lload 4
      // 0d1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_a; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: astore 15
      // 0d8: aload 15
      // 0da: aload 15
      // 0dc: arraylength
      // 0dd: bipush 1
      // 0de: isub
      // 0df: aaload
      // 0e0: astore 16
      // 0e2: aload 2
      // 0e3: invokevirtual com/zelix/ig.H ()Ljava/lang/String;
      // 0e6: lload 6
      // 0e8: dup2_x1
      // 0e9: pop2
      // 0ea: iload 8
      // 0ec: bipush 3
      // 0ed: anewarray 287
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f5: bipush 2
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 1
      // 0fb: swap
      // 0fc: aastore
      // 0fd: dup_x2
      // 0fe: dup_x2
      // 0ff: pop
      // 100: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: ldc2_w -106287859643909856
      // 109: lload 4
      // 10b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: astore 17
      // 112: aload 16
      // 114: invokevirtual com/zelix/_a.L ()I
      // 117: iload 13
      // 119: lload 4
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: iflt 131
      // 120: ifne 150
      // 123: aload 17
      // 125: invokeinterface java/util/List.size ()I 1
      // 12a: aload 15
      // 12c: arraylength
      // 12d: iadd
      // 12e: iload 14
      // 130: isub
      // 131: if_icmplt 14f
      // 134: goto 142
      // 137: ldc2_w -192527273877311766
      // 13a: lload 4
      // 13c: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: bipush 0
      // 143: ireturn
      // 144: ldc2_w -192527273877311766
      // 147: lload 4
      // 149: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: bipush 1
      // 150: ireturn
   }

   static {
      long var0 = a ^ 114791456651984L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "®3È9\u008bQ¡[9\u009dX\u0010\u009eÒÖ2";
      int var7 = "®3È9\u008bQ¡[9\u009dX\u0010\u009eÒÖ2".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      d = new Integer[2];
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5581;
      if (d[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/xy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/xy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
