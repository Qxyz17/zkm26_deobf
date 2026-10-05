package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bv extends h8 implements yk, sv {
   private Object[] d = new Object[3];
   private boolean t;
   private static Comparator G;
   private x7 Z;
   private static final long a = ess.a(2920862577002516421L, 5112698795896994711L, MethodHandles.lookup().lookupClass()).a(88840532732573L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);

   String x(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 44825081087498L;
      _op var7 = (_op)this.d[var4];
      return x44.a<"j">(var7, new Object[]{var5}, -1923167375755299610L, var2);
   }

   bv(long var1, h8 var3, _xx var4, _y4 var5, _y4 var6) {
      var1 = a ^ var1;
      long var7 = var1 ^ 20283784971207L;
      long var9 = var1 ^ 132953451067535L;
      long var11 = var1 ^ 46902385354814L;
      super(var3);
      this.d = new Object[3];
      int var13 = var4.readUnsignedShort();
      int var14 = var4.readUnsignedShort();
      int var15 = var4.readUnsignedShort();
      Integer var16 = z.R(var13, var7);
      var5.G(var16, this, var9);
      this.d[w1.p.ordinal()] = var16;
      var16 = z.R(var14, var7);
      var5.G(var16, this, var9);
      this.d[w1.h.ordinal()] = var16;
      var16 = z.R(var15, var7);
      var5.G(var16, this, var9);
      this.d[w1.G.ordinal()] = var16;
      int var17 = var4.readUnsignedShort();
      Object[] var10005 = new Object[]{null, var11, var6};
      var10005[0] = var17;
      x44.a<"k">(this, var10005, 7987307872280420984L, var1);
   }

   public static Comparator X(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/bv.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: ldc2_w -3359258526172651253
      // 15: lload 1
      // 16: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 3
      // 1c: ldc2_w -3673789496092576609
      // 1f: lload 1
      // 20: invokedynamic i (JJ)Ljava/util/Comparator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: iload 3
      // 26: ifeq 5f
      // 29: ifnonnull 56
      // 2c: goto 39
      // 2f: ldc2_w -3208333062484376055
      // 32: lload 1
      // 33: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: athrow
      // 39: new com/zelix/_fa
      // 3c: dup
      // 3d: invokespecial com/zelix/_fa.<init> ()V
      // 40: ldc2_w -3673789496092576609
      // 43: lload 1
      // 44: invokedynamic q (Ljava/util/Comparator;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: goto 56
      // 4c: ldc2_w -3208333062484376055
      // 4f: lload 1
      // 50: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: ldc2_w -3673789496092576609
      // 59: lload 1
      // 5a: invokedynamic i (JJ)Ljava/util/Comparator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: areturn
   }

   boolean N(Object[] param1) {
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
      // 004: checkcast java/util/HashSet
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast [I
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/w
      // 016: astore 6
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/yg
      // 029: astore 3
      // 02a: pop
      // 02b: getstatic com/zelix/bv.a J
      // 02e: lload 4
      // 030: lxor
      // 031: lstore 4
      // 033: lload 4
      // 035: dup2
      // 036: ldc2_w 4314870840331
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 18990898386651
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 130377578063852
      // 047: lxor
      // 048: lstore 12
      // 04a: pop2
      // 04b: ldc2_w -9144092677681269411
      // 04e: lload 4
      // 050: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: aload 0
      // 056: getfield com/zelix/bv.d [Ljava/lang/Object;
      // 059: bipush 0
      // 05a: aaload
      // 05b: checkcast com/zelix/_op
      // 05e: astore 15
      // 060: istore 14
      // 062: aload 0
      // 063: getfield com/zelix/bv.d [Ljava/lang/Object;
      // 066: bipush 1
      // 067: aaload
      // 068: checkcast com/zelix/_op
      // 06b: astore 16
      // 06d: aload 0
      // 06e: getfield com/zelix/bv.d [Ljava/lang/Object;
      // 071: bipush 2
      // 072: aaload
      // 073: checkcast com/zelix/_op
      // 076: astore 17
      // 078: aload 7
      // 07a: aload 17
      // 07c: ldc2_w -9204123246526827777
      // 07f: lload 4
      // 081: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: iload 14
      // 088: ifne 161
      // 08b: ifne 12b
      // 08e: goto 09c
      // 091: ldc2_w -7028159265174779130
      // 094: lload 4
      // 096: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 7
      // 09e: aload 15
      // 0a0: ldc2_w -9204123246526827777
      // 0a3: lload 4
      // 0a5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: iload 14
      // 0ac: ifne 2b8
      // 0af: goto 0bd
      // 0b2: ldc2_w -7028159265174779130
      // 0b5: lload 4
      // 0b7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: ifeq 2b7
      // 0c0: goto 0ce
      // 0c3: ldc2_w -7028159265174779130
      // 0c6: lload 4
      // 0c8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: aload 15
      // 0d0: invokevirtual com/zelix/_op.m ()I
      // 0d3: aload 16
      // 0d5: invokevirtual com/zelix/_op.m ()I
      // 0d8: aload 2
      // 0d9: lload 8
      // 0db: bipush 4
      // 0dc: anewarray 256
      // 0df: dup_x2
      // 0e0: dup_x2
      // 0e1: pop
      // 0e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e5: bipush 3
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x1
      // 0e9: swap
      // 0ea: bipush 2
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f2: bipush 1
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x1
      // 0f6: swap
      // 0f7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fa: bipush 0
      // 0fb: swap
      // 0fc: aastore
      // 0fd: ldc2_w -9135283330209755508
      // 100: lload 4
      // 102: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: iload 14
      // 109: ifne 2b8
      // 10c: goto 11a
      // 10f: ldc2_w -7028159265174779130
      // 112: lload 4
      // 114: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: ifeq 2b7
      // 11d: goto 12b
      // 120: ldc2_w -7028159265174779130
      // 123: lload 4
      // 125: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 6
      // 12d: aload 15
      // 12f: aload 0
      // 130: lload 10
      // 132: bipush 3
      // 133: anewarray 256
      // 136: dup_x2
      // 137: dup_x2
      // 138: pop
      // 139: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13c: bipush 2
      // 13d: swap
      // 13e: aastore
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 1
      // 142: swap
      // 143: aastore
      // 144: dup_x1
      // 145: swap
      // 146: bipush 0
      // 147: swap
      // 148: aastore
      // 149: ldc2_w -6994725691893768424
      // 14c: lload 4
      // 14e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: goto 161
      // 156: ldc2_w -7028159265174779130
      // 159: lload 4
      // 15b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: istore 18
      // 163: aload 6
      // 165: aload 16
      // 167: aload 0
      // 168: lload 10
      // 16a: bipush 3
      // 16b: anewarray 256
      // 16e: dup_x2
      // 16f: dup_x2
      // 170: pop
      // 171: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 174: bipush 2
      // 175: swap
      // 176: aastore
      // 177: dup_x1
      // 178: swap
      // 179: bipush 1
      // 17a: swap
      // 17b: aastore
      // 17c: dup_x1
      // 17d: swap
      // 17e: bipush 0
      // 17f: swap
      // 180: aastore
      // 181: ldc2_w -6994725691893768424
      // 184: lload 4
      // 186: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: istore 18
      // 18d: aload 6
      // 18f: aload 17
      // 191: aload 0
      // 192: lload 10
      // 194: bipush 3
      // 195: anewarray 256
      // 198: dup_x2
      // 199: dup_x2
      // 19a: pop
      // 19b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19e: bipush 2
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x1
      // 1a2: swap
      // 1a3: bipush 1
      // 1a4: swap
      // 1a5: aastore
      // 1a6: dup_x1
      // 1a7: swap
      // 1a8: bipush 0
      // 1a9: swap
      // 1aa: aastore
      // 1ab: ldc2_w -6994725691893768424
      // 1ae: lload 4
      // 1b0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: istore 18
      // 1b7: aload 7
      // 1b9: aload 15
      // 1bb: ldc2_w -9204123246526827777
      // 1be: lload 4
      // 1c0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: iload 14
      // 1c7: lload 4
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: iflt 231
      // 1ce: ifne 22f
      // 1d1: ifeq 221
      // 1d4: goto 1e2
      // 1d7: ldc2_w -7028159265174779130
      // 1da: lload 4
      // 1dc: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: aload 0
      // 1e3: aload 15
      // 1e5: aload 6
      // 1e7: lload 12
      // 1e9: getstatic com/zelix/w1.p Lcom/zelix/w1;
      // 1ec: bipush 4
      // 1ed: anewarray 256
      // 1f0: dup_x1
      // 1f1: swap
      // 1f2: bipush 3
      // 1f3: swap
      // 1f4: aastore
      // 1f5: dup_x2
      // 1f6: dup_x2
      // 1f7: pop
      // 1f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fb: bipush 2
      // 1fc: swap
      // 1fd: aastore
      // 1fe: dup_x1
      // 1ff: swap
      // 200: bipush 1
      // 201: swap
      // 202: aastore
      // 203: dup_x1
      // 204: swap
      // 205: bipush 0
      // 206: swap
      // 207: aastore
      // 208: ldc2_w -8935334186510554839
      // 20b: lload 4
      // 20d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: pop
      // 213: goto 221
      // 216: ldc2_w -7028159265174779130
      // 219: lload 4
      // 21b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 7
      // 223: aload 16
      // 225: ldc2_w -9204123246526827777
      // 228: lload 4
      // 22a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: iload 14
      // 231: ifne 2b6
      // 234: ifeq 284
      // 237: goto 245
      // 23a: ldc2_w -7028159265174779130
      // 23d: lload 4
      // 23f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: athrow
      // 245: aload 0
      // 246: aload 16
      // 248: aload 6
      // 24a: lload 12
      // 24c: getstatic com/zelix/w1.h Lcom/zelix/w1;
      // 24f: bipush 4
      // 250: anewarray 256
      // 253: dup_x1
      // 254: swap
      // 255: bipush 3
      // 256: swap
      // 257: aastore
      // 258: dup_x2
      // 259: dup_x2
      // 25a: pop
      // 25b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25e: bipush 2
      // 25f: swap
      // 260: aastore
      // 261: dup_x1
      // 262: swap
      // 263: bipush 1
      // 264: swap
      // 265: aastore
      // 266: dup_x1
      // 267: swap
      // 268: bipush 0
      // 269: swap
      // 26a: aastore
      // 26b: ldc2_w -8935334186510554839
      // 26e: lload 4
      // 270: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: pop
      // 276: goto 284
      // 279: ldc2_w -7028159265174779130
      // 27c: lload 4
      // 27e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: athrow
      // 284: aload 0
      // 285: aload 17
      // 287: aload 6
      // 289: lload 12
      // 28b: getstatic com/zelix/w1.G Lcom/zelix/w1;
      // 28e: bipush 4
      // 28f: anewarray 256
      // 292: dup_x1
      // 293: swap
      // 294: bipush 3
      // 295: swap
      // 296: aastore
      // 297: dup_x2
      // 298: dup_x2
      // 299: pop
      // 29a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29d: bipush 2
      // 29e: swap
      // 29f: aastore
      // 2a0: dup_x1
      // 2a1: swap
      // 2a2: bipush 1
      // 2a3: swap
      // 2a4: aastore
      // 2a5: dup_x1
      // 2a6: swap
      // 2a7: bipush 0
      // 2a8: swap
      // 2a9: aastore
      // 2aa: ldc2_w -8935334186510554839
      // 2ad: lload 4
      // 2af: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: pop
      // 2b5: bipush 1
      // 2b6: ireturn
      // 2b7: bipush 0
      // 2b8: ireturn
   }

   public int z(Object[] var1) {
      return ((_op)this.d[1]).m();
   }

   public wd B(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      return x44.a<"l">(-8723299818104479304L, var4);
   }

   public boolean Y(Object[] var1) {
      return this.t;
   }

   void z(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/bv.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w -5997162660885521233
      // 1c: lload 3
      // 1d: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: aload 2
      // 23: aload 0
      // 24: bipush 0
      // 25: invokevirtual com/zelix/bv.l (I)I
      // 28: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 2b: istore 5
      // 2d: aload 2
      // 2e: aload 0
      // 2f: bipush 1
      // 30: invokevirtual com/zelix/bv.l (I)I
      // 33: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 36: aload 2
      // 37: aload 0
      // 38: bipush 2
      // 39: invokevirtual com/zelix/bv.l (I)I
      // 3c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 3f: aload 2
      // 40: aload 0
      // 41: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 44: iload 5
      // 46: ifeq 6b
      // 49: ifnonnull 67
      // 4c: goto 59
      // 4f: ldc2_w -5846237006982399059
      // 52: lload 3
      // 53: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: bipush 0
      // 5a: goto 6e
      // 5d: ldc2_w -5846237006982399059
      // 60: lload 3
      // 61: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 0
      // 68: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 6b: invokevirtual com/zelix/x7.B ()I
      // 6e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 71: return
   }

   void U(DataOutputStream param1, Map param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/bv.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: ldc2_w -7600504974013454609
      // 09: lload 3
      // 0a: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 1
      // 10: aload 0
      // 11: bipush 0
      // 12: invokevirtual com/zelix/bv.l (I)I
      // 15: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 18: istore 5
      // 1a: aload 1
      // 1b: aload 0
      // 1c: bipush 1
      // 1d: invokevirtual com/zelix/bv.l (I)I
      // 20: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 23: aload 1
      // 24: aload 0
      // 25: bipush 2
      // 26: invokevirtual com/zelix/bv.l (I)I
      // 29: iload 5
      // 2b: ifeq be
      // 2e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 31: aload 0
      // 32: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 35: ifnull af
      // 38: goto 45
      // 3b: ldc2_w -7737845232969317907
      // 3e: lload 3
      // 3f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 2
      // 46: aload 0
      // 47: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 4a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4f: checkcast com/zelix/xl
      // 52: astore 6
      // 54: iload 5
      // 56: lload 3
      // 57: lconst_0
      // 58: lcmp
      // 59: ifle 89
      // 5c: ifeq 87
      // 5f: aload 6
      // 61: ifnull 92
      // 64: goto 71
      // 67: ldc2_w -7737845232969317907
      // 6a: lload 3
      // 6b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: aload 1
      // 72: aload 6
      // 74: invokevirtual com/zelix/xl.B ()I
      // 77: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 7a: goto 87
      // 7d: ldc2_w -7737845232969317907
      // 80: lload 3
      // 81: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: iload 5
      // 89: lload 3
      // 8a: lconst_0
      // 8b: lcmp
      // 8c: ifle ac
      // 8f: ifne aa
      // 92: aload 1
      // 93: aload 0
      // 94: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 97: invokevirtual com/zelix/x7.B ()I
      // 9a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 9d: goto aa
      // a0: ldc2_w -7737845232969317907
      // a3: lload 3
      // a4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: athrow
      // aa: iload 5
      // ac: ifne c1
      // af: aload 1
      // b0: bipush 0
      // b1: goto be
      // b4: ldc2_w -7737845232969317907
      // b7: lload 3
      // b8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd: athrow
      // be: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // c1: return
   }

   public void e(Integer param1, long param2, _op param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: dup2
      // 002: ldc2_w 125353107609026
      // 005: lxor
      // 006: lstore 5
      // 008: pop2
      // 009: ldc2_w -8396130533579440322
      // 00c: lload 2
      // 00d: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 012: aload 0
      // 013: getfield com/zelix/bv.d [Ljava/lang/Object;
      // 016: arraylength
      // 017: istore 8
      // 019: aload 4
      // 01b: bipush 1
      // 01c: lload 5
      // 01e: bipush 2
      // 01f: anewarray 256
      // 022: dup_x2
      // 023: dup_x2
      // 024: pop
      // 025: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 028: bipush 1
      // 029: swap
      // 02a: aastore
      // 02b: dup_x1
      // 02c: swap
      // 02d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 030: bipush 0
      // 031: swap
      // 032: aastore
      // 033: ldc2_w -7646876929206351648
      // 036: lload 2
      // 037: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: istore 7
      // 03e: bipush 0
      // 03f: istore 9
      // 041: iload 9
      // 043: iload 8
      // 045: if_icmpge 145
      // 048: aload 0
      // 049: getfield com/zelix/bv.d [Ljava/lang/Object;
      // 04c: iload 9
      // 04e: aaload
      // 04f: astore 10
      // 051: iload 7
      // 053: lload 2
      // 054: lconst_0
      // 055: lcmp
      // 056: ifle 061
      // 059: ifne 140
      // 05c: aload 10
      // 05e: instanceof java/lang/Integer
      // 061: ifeq 13d
      // 064: goto 071
      // 067: ldc2_w -7776118377566568091
      // 06a: lload 2
      // 06b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: aload 10
      // 073: checkcast java/lang/Integer
      // 076: aload 1
      // 077: invokevirtual java/lang/Integer.equals (Ljava/lang/Object;)Z
      // 07a: lload 2
      // 07b: lconst_0
      // 07c: lcmp
      // 07d: iflt 0d2
      // 080: iload 7
      // 082: ifne 0d2
      // 085: goto 092
      // 088: ldc2_w -7776118377566568091
      // 08b: lload 2
      // 08c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: ifeq 13d
      // 095: goto 0a2
      // 098: ldc2_w -7776118377566568091
      // 09b: lload 2
      // 09c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield com/zelix/bv.d [Ljava/lang/Object;
      // 0a6: iload 9
      // 0a8: aload 4
      // 0aa: aastore
      // 0ab: iload 7
      // 0ad: lload 2
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: ifle 142
      // 0b3: ifne 140
      // 0b6: goto 0c3
      // 0b9: ldc2_w -7776118377566568091
      // 0bc: lload 2
      // 0bd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: iload 9
      // 0c5: goto 0d2
      // 0c8: ldc2_w -7776118377566568091
      // 0cb: lload 2
      // 0cc: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: lload 2
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: iflt 0fe
      // 0d8: tableswitch 101 0 2 28 54 80
      // 0f4: aload 4
      // 0f6: getstatic com/zelix/wd.k Lcom/zelix/wd;
      // 0f9: invokevirtual com/zelix/_op.k (Lcom/zelix/wd;)V
      // 0fc: iload 7
      // 0fe: ifeq 13d
      // 101: goto 10e
      // 104: ldc2_w -7776118377566568091
      // 107: lload 2
      // 108: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: aload 4
      // 110: getstatic com/zelix/wd.L Lcom/zelix/wd;
      // 113: invokevirtual com/zelix/_op.k (Lcom/zelix/wd;)V
      // 116: iload 7
      // 118: ifeq 13d
      // 11b: goto 128
      // 11e: ldc2_w -7776118377566568091
      // 121: lload 2
      // 122: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 4
      // 12a: getstatic com/zelix/wd.r Lcom/zelix/wd;
      // 12d: invokevirtual com/zelix/_op.k (Lcom/zelix/wd;)V
      // 130: goto 13d
      // 133: ldc2_w -7776118377566568091
      // 136: lload 2
      // 137: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: iinc 9 1
      // 140: iload 7
      // 142: ifeq 041
      // 145: return
   }

   private static boolean Z(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 4
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast [I
      // 1c: astore 5
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Long
      // 24: invokevirtual java/lang/Long.longValue ()J
      // 27: lstore 1
      // 28: pop
      // 29: getstatic com/zelix/bv.a J
      // 2c: lload 1
      // 2d: lxor
      // 2e: lstore 1
      // 2f: aload 5
      // 31: iload 3
      // 32: ldc2_w -9181850394259176282
      // 35: lload 1
      // 36: invokedynamic t (Ljava/lang/Object;IJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: istore 7
      // 3d: ldc2_w -6925788252255835226
      // 40: lload 1
      // 41: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: iload 3
      // 47: bipush 1
      // 48: iadd
      // 49: istore 8
      // 4b: istore 6
      // 4d: iload 8
      // 4f: iload 4
      // 51: if_icmpge d5
      // 54: iinc 7 1
      // 57: iload 7
      // 59: iload 6
      // 5b: lload 1
      // 5c: lconst_0
      // 5d: lcmp
      // 5e: ifle 66
      // 61: ifne dc
      // 64: iload 6
      // 66: ifne cc
      // 69: goto 76
      // 6c: ldc2_w -9183413526132550147
      // 6f: lload 1
      // 70: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: lload 1
      // 77: lconst_0
      // 78: lcmp
      // 79: ifle bf
      // 7c: aload 5
      // 7e: arraylength
      // 7f: if_icmpge be
      // 82: goto 8f
      // 85: ldc2_w -9183413526132550147
      // 88: lload 1
      // 89: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: iload 8
      // 91: iload 6
      // 93: ifne cc
      // 96: goto a3
      // 99: ldc2_w -9183413526132550147
      // 9c: lload 1
      // 9d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: athrow
      // a3: lload 1
      // a4: lconst_0
      // a5: lcmp
      // a6: iflt d2
      // a9: aload 5
      // ab: iload 7
      // ad: iaload
      // ae: if_icmpeq cd
      // b1: goto be
      // b4: ldc2_w -9183413526132550147
      // b7: lload 1
      // b8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd: athrow
      // be: bipush 0
      // bf: goto cc
      // c2: ldc2_w -9183413526132550147
      // c5: lload 1
      // c6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: athrow
      // cc: ireturn
      // cd: iinc 8 1
      // d0: iload 6
      // d2: ifeq 4d
      // d5: lload 1
      // d6: lconst_0
      // d7: lcmp
      // d8: iflt 57
      // db: bipush 1
      // dc: ireturn
   }

   public void h(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/x7
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/x7
      // 19: astore 2
      // 1a: pop
      // 1b: ldc2_w 1401169644749333275
      // 1e: lload 4
      // 20: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 6
      // 27: aload 0
      // 28: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 2b: lload 4
      // 2d: lconst_0
      // 2e: lcmp
      // 2f: ifle 6d
      // 32: iload 6
      // 34: ifeq 6d
      // 37: ifnull 84
      // 3a: goto 48
      // 3d: ldc2_w 1254752092839773209
      // 40: lload 4
      // 42: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: iload 6
      // 4b: ifeq 80
      // 4e: goto 5c
      // 51: ldc2_w 1254752092839773209
      // 54: lload 4
      // 56: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 5f: goto 6d
      // 62: ldc2_w 1254752092839773209
      // 65: lload 4
      // 67: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 3
      // 6e: if_acmpne 84
      // 71: aload 0
      // 72: goto 80
      // 75: ldc2_w 1254752092839773209
      // 78: lload 4
      // 7a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: aload 2
      // 81: putfield com/zelix/bv.Z Lcom/zelix/x7;
      // 84: return
   }

   boolean N(int param1, long param2, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/bv.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w -1525708847677318471
      // 09: lload 2
      // 0a: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: bipush 0
      // 11: invokevirtual com/zelix/bv.l (I)I
      // 14: istore 6
      // 16: aload 0
      // 17: bipush 1
      // 18: invokevirtual com/zelix/bv.l (I)I
      // 1b: istore 7
      // 1d: istore 5
      // 1f: iload 6
      // 21: iload 1
      // 22: iload 5
      // 24: ifeq 5a
      // 27: if_icmplt 61
      // 2a: goto 37
      // 2d: ldc2_w -1672060464538223173
      // 30: lload 2
      // 31: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: iload 7
      // 39: iload 5
      // 3b: ifeq 5e
      // 3e: goto 4b
      // 41: ldc2_w -1672060464538223173
      // 44: lload 2
      // 45: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: iload 4
      // 4d: goto 5a
      // 50: ldc2_w -1672060464538223173
      // 53: lload 2
      // 54: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: if_icmpgt 61
      // 5d: bipush 1
      // 5e: goto 62
      // 61: bipush 0
      // 62: istore 8
      // 64: iload 8
      // 66: ireturn
   }

   void N(long param1, _8l param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 80221771876344
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w -6348162585463318644
      // 0c: lload 1
      // 0d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: istore 6
      // 14: aload 0
      // 15: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 18: iload 6
      // 1a: ifeq 3e
      // 1d: ifnull 47
      // 20: goto 2d
      // 23: ldc2_w -6485471552326061938
      // 26: lload 1
      // 27: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 31: goto 3e
      // 34: ldc2_w -6485471552326061938
      // 37: lload 1
      // 38: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: lload 4
      // 40: aload 3
      // 41: aload 0
      // 42: aload 0
      // 43: invokevirtual com/zelix/x7.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 46: pop
      // 47: return
   }

   boolean s(int param1, int param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/bv.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: ldc2_w -4807610336297513683
      // 09: lload 3
      // 0a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: bipush 0
      // 11: invokevirtual com/zelix/bv.l (I)I
      // 14: istore 6
      // 16: istore 5
      // 18: aload 0
      // 19: bipush 1
      // 1a: invokevirtual com/zelix/bv.l (I)I
      // 1d: istore 7
      // 1f: iload 6
      // 21: iload 5
      // 23: ifeq 6a
      // 26: iload 2
      // 27: if_icmpge 5c
      // 2a: goto 37
      // 2d: ldc2_w -4656759527721326033
      // 30: lload 3
      // 31: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: iload 7
      // 39: iload 5
      // 3b: ifeq 6a
      // 3e: goto 4b
      // 41: ldc2_w -4656759527721326033
      // 44: lload 3
      // 45: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: iload 1
      // 4c: if_icmpgt 6d
      // 4f: goto 5c
      // 52: ldc2_w -4656759527721326033
      // 55: lload 3
      // 56: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: bipush 1
      // 5d: goto 6a
      // 60: ldc2_w -4656759527721326033
      // 63: lload 3
      // 64: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: goto 6e
      // 6d: bipush 0
      // 6e: istore 8
      // 70: iload 8
      // 72: ireturn
   }

   public _op O(w1 var1) {
      return (_op)this.d[var1.ordinal()];
   }

   void Y(Object[] param1) {
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
      // 0a: istore 5
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast com/zelix/_y4
      // 1c: astore 4
      // 1e: pop
      // 1f: getstatic com/zelix/bv.a J
      // 22: lload 2
      // 23: lxor
      // 24: lstore 2
      // 25: lload 2
      // 26: dup2
      // 27: ldc2_w 89885114544705
      // 2a: lxor
      // 2b: lstore 6
      // 2d: dup2
      // 2e: ldc2_w 125260810261245
      // 31: lxor
      // 32: dup2
      // 33: bipush 8
      // 35: lushr
      // 36: lstore 8
      // 38: dup2
      // 39: bipush 56
      // 3b: lshl
      // 3c: bipush 56
      // 3e: lushr
      // 3f: l2i
      // 40: istore 10
      // 42: pop2
      // 43: dup2
      // 44: ldc2_w 61053827023378
      // 47: lxor
      // 48: lstore 11
      // 4a: pop2
      // 4b: ldc2_w 2728249687383610806
      // 4e: lload 2
      // 4f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: istore 13
      // 56: iload 5
      // 58: ifeq f7
      // 5b: aload 0
      // 5c: lload 8
      // 5e: iload 5
      // 60: iload 10
      // 62: i2b
      // 63: invokevirtual com/zelix/bv.N (JIB)Lcom/zelix/xl;
      // 66: astore 14
      // 68: iload 13
      // 6a: lload 2
      // 6b: lconst_0
      // 6c: lcmp
      // 6d: ifle 78
      // 70: ifeq eb
      // 73: aload 14
      // 75: instanceof com/zelix/x7
      // 78: ifne e2
      // 7b: goto 88
      // 7e: ldc2_w 2865558877572608692
      // 81: lload 2
      // 82: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: new com/zelix/_sx
      // 8b: dup
      // 8c: new java/lang/StringBuilder
      // 8f: dup
      // 90: invokespecial java/lang/StringBuilder.<init> ()V
      // 93: aload 0
      // 94: lload 11
      // 96: invokevirtual com/zelix/bv.j (J)Ljava/lang/String;
      // 99: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9c: sipush 772
      // 9f: ldc2_w 6870389090020790575
      // a2: lload 2
      // a3: lxor
      // a4: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ac: sipush 7068
      // af: ldc2_w 6190845166957857201
      // b2: lload 2
      // b3: lxor
      // b4: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bc: sipush 8440
      // bf: ldc2_w 3018390796600554192
      // c2: lload 2
      // c3: lxor
      // c4: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cc: iload 5
      // ce: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d4: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // d7: athrow
      // d8: ldc2_w 2865558877572608692
      // db: lload 2
      // dc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e1: athrow
      // e2: aload 0
      // e3: aload 14
      // e5: checkcast com/zelix/x7
      // e8: putfield com/zelix/bv.Z Lcom/zelix/x7;
      // eb: aload 4
      // ed: aload 0
      // ee: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // f1: aload 0
      // f2: lload 6
      // f4: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // f7: return
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      return a<"y">(24358, 7420556825085208936L ^ var2);
   }

   public boolean G(Object[] param1) {
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
      // 014: lstore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 3
      // 020: pop
      // 021: getstatic com/zelix/bv.a J
      // 024: lload 4
      // 026: lxor
      // 027: lstore 4
      // 029: aload 0
      // 02a: bipush 0
      // 02b: invokevirtual com/zelix/bv.l (I)I
      // 02e: istore 7
      // 030: ldc2_w 7201136455956977579
      // 033: lload 4
      // 035: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: aload 0
      // 03b: bipush 1
      // 03c: invokevirtual com/zelix/bv.l (I)I
      // 03f: istore 8
      // 041: istore 6
      // 043: iload 7
      // 045: iload 2
      // 046: iload 6
      // 048: ifne 0c9
      // 04b: if_icmple 0b8
      // 04e: goto 05c
      // 051: ldc2_w 8971396127039678960
      // 054: lload 4
      // 056: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: iload 7
      // 05e: iload 3
      // 05f: iload 6
      // 061: lload 4
      // 063: lconst_0
      // 064: lcmp
      // 065: ifle 0cb
      // 068: ifne 0c9
      // 06b: goto 079
      // 06e: ldc2_w 8971396127039678960
      // 071: lload 4
      // 073: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: lload 4
      // 07b: lconst_0
      // 07c: lcmp
      // 07d: ifle 0bb
      // 080: if_icmpge 0b8
      // 083: goto 091
      // 086: ldc2_w 8971396127039678960
      // 089: lload 4
      // 08b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: iload 8
      // 093: iload 6
      // 095: ifne 135
      // 098: goto 0a6
      // 09b: ldc2_w 8971396127039678960
      // 09e: lload 4
      // 0a0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: athrow
      // 0a6: iload 3
      // 0a7: if_icmpgt 134
      // 0aa: goto 0b8
      // 0ad: ldc2_w 8971396127039678960
      // 0b0: lload 4
      // 0b2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: iload 7
      // 0ba: iload 2
      // 0bb: goto 0c9
      // 0be: ldc2_w 8971396127039678960
      // 0c1: lload 4
      // 0c3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: iload 6
      // 0cb: lload 4
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: iflt 0f9
      // 0d2: ifne 0f7
      // 0d5: if_icmpge 138
      // 0d8: goto 0e6
      // 0db: ldc2_w 8971396127039678960
      // 0de: lload 4
      // 0e0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: iload 8
      // 0e8: iload 2
      // 0e9: goto 0f7
      // 0ec: ldc2_w 8971396127039678960
      // 0ef: lload 4
      // 0f1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: iload 6
      // 0f9: ifne 131
      // 0fc: if_icmple 138
      // 0ff: goto 10d
      // 102: ldc2_w 8971396127039678960
      // 105: lload 4
      // 107: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: iload 8
      // 10f: iload 6
      // 111: ifne 135
      // 114: goto 122
      // 117: ldc2_w 8971396127039678960
      // 11a: lload 4
      // 11c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: iload 3
      // 123: goto 131
      // 126: ldc2_w 8971396127039678960
      // 129: lload 4
      // 12b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: if_icmpge 138
      // 134: bipush 1
      // 135: goto 139
      // 138: bipush 0
      // 139: istore 9
      // 13b: iload 9
      // 13d: ireturn
   }

   public bv(h_ var1, x7 var2, _op var3, _op var4, _op var5) {
      super(var1);
      this.Z = var2;
      var3.k(wd.k);
      var4.k(wd.L);
      var5.k(wd.r);
      Object[] var6 = new Object[]{var3, var4, var5};
      this.d = var6;
      this.t = true;
   }

   private boolean v(Object[] param1) {
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
      // 004: checkcast com/zelix/_op
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/w
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/w1
      // 021: astore 3
      // 022: pop
      // 023: getstatic com/zelix/bv.a J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 14894907762066
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 81212023881156
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 77664919446212
      // 03f: lxor
      // 040: lstore 11
      // 042: pop2
      // 043: ldc2_w 4901567002819850305
      // 046: lload 5
      // 048: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: bipush 0
      // 04e: istore 14
      // 050: istore 13
      // 052: bipush 0
      // 053: istore 15
      // 055: aload 2
      // 056: lload 9
      // 058: aload 4
      // 05a: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 05d: astore 16
      // 05f: aload 16
      // 061: iload 13
      // 063: ifne 079
      // 066: ifnull 123
      // 069: goto 077
      // 06c: ldc2_w 6587221932816977434
      // 06f: lload 5
      // 071: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 16
      // 079: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 07e: astore 17
      // 080: aload 17
      // 082: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 087: ifeq 123
      // 08a: aload 17
      // 08c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 091: checkcast com/zelix/yk
      // 094: astore 18
      // 096: aload 18
      // 098: instanceof com/zelix/bv
      // 09b: iload 13
      // 09d: lload 5
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: iflt 127
      // 0a4: ifne 125
      // 0a7: iload 13
      // 0a9: ifne 0cc
      // 0ac: goto 0ba
      // 0af: ldc2_w 6587221932816977434
      // 0b2: lload 5
      // 0b4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: ifeq 109
      // 0bd: goto 0cb
      // 0c0: ldc2_w 6587221932816977434
      // 0c3: lload 5
      // 0c5: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: bipush 1
      // 0cc: istore 14
      // 0ce: aload 18
      // 0d0: checkcast com/zelix/bv
      // 0d3: astore 19
      // 0d5: iload 13
      // 0d7: lload 5
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: iflt 0ff
      // 0de: ifne 0fd
      // 0e1: aload 19
      // 0e3: aload 3
      // 0e4: invokevirtual com/zelix/bv.O (Lcom/zelix/w1;)Lcom/zelix/_op;
      // 0e7: aload 4
      // 0e9: if_acmpne 109
      // 0ec: goto 0fa
      // 0ef: ldc2_w 6587221932816977434
      // 0f2: lload 5
      // 0f4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: bipush 1
      // 0fb: istore 15
      // 0fd: iload 13
      // 0ff: lload 5
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 10b
      // 106: ifeq 123
      // 109: iload 13
      // 10b: ifeq 080
      // 10e: lload 5
      // 110: lconst_0
      // 111: lcmp
      // 112: ifle 096
      // 115: goto 123
      // 118: ldc2_w 6587221932816977434
      // 11b: lload 5
      // 11d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: iload 14
      // 125: iload 13
      // 127: lload 5
      // 129: lconst_0
      // 12a: lcmp
      // 12b: ifle 1d0
      // 12e: ifne 1ce
      // 131: ifne 1be
      // 134: goto 142
      // 137: ldc2_w 6587221932816977434
      // 13a: lload 5
      // 13c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: aload 4
      // 144: ldc2_w 6512561141434383193
      // 147: lload 5
      // 149: invokedynamic j (JJ)Lcom/zelix/d2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: lload 11
      // 150: bipush 2
      // 151: anewarray 256
      // 154: dup_x2
      // 155: dup_x2
      // 156: pop
      // 157: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15a: bipush 1
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x1
      // 15e: swap
      // 15f: bipush 0
      // 160: swap
      // 161: aastore
      // 162: ldc2_w 6401110888073701117
      // 165: lload 5
      // 167: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: aload 4
      // 16e: lload 7
      // 170: aload 3
      // 171: bipush 2
      // 172: anewarray 256
      // 175: dup_x1
      // 176: swap
      // 177: bipush 1
      // 178: swap
      // 179: aastore
      // 17a: dup_x2
      // 17b: dup_x2
      // 17c: pop
      // 17d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 180: bipush 0
      // 181: swap
      // 182: aastore
      // 183: ldc2_w 4927234615377371740
      // 186: lload 5
      // 188: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/d2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: lload 11
      // 18f: bipush 2
      // 190: anewarray 256
      // 193: dup_x2
      // 194: dup_x2
      // 195: pop
      // 196: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 199: bipush 1
      // 19a: swap
      // 19b: aastore
      // 19c: dup_x1
      // 19d: swap
      // 19e: bipush 0
      // 19f: swap
      // 1a0: aastore
      // 1a1: ldc2_w 6401110888073701117
      // 1a4: lload 5
      // 1a6: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: iload 13
      // 1ad: ifeq 238
      // 1b0: goto 1be
      // 1b3: ldc2_w 6587221932816977434
      // 1b6: lload 5
      // 1b8: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: iload 15
      // 1c0: goto 1ce
      // 1c3: ldc2_w 6587221932816977434
      // 1c6: lload 5
      // 1c8: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: iload 13
      // 1d0: lload 5
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: iflt 23c
      // 1d7: ifne 23a
      // 1da: ifne 238
      // 1dd: goto 1eb
      // 1e0: ldc2_w 6587221932816977434
      // 1e3: lload 5
      // 1e5: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: athrow
      // 1eb: aload 4
      // 1ed: lload 7
      // 1ef: aload 3
      // 1f0: bipush 2
      // 1f1: anewarray 256
      // 1f4: dup_x1
      // 1f5: swap
      // 1f6: bipush 1
      // 1f7: swap
      // 1f8: aastore
      // 1f9: dup_x2
      // 1fa: dup_x2
      // 1fb: pop
      // 1fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ff: bipush 0
      // 200: swap
      // 201: aastore
      // 202: ldc2_w 4927234615377371740
      // 205: lload 5
      // 207: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/d2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: lload 11
      // 20e: bipush 2
      // 20f: anewarray 256
      // 212: dup_x2
      // 213: dup_x2
      // 214: pop
      // 215: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 218: bipush 1
      // 219: swap
      // 21a: aastore
      // 21b: dup_x1
      // 21c: swap
      // 21d: bipush 0
      // 21e: swap
      // 21f: aastore
      // 220: ldc2_w 6401110888073701117
      // 223: lload 5
      // 225: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: goto 238
      // 22d: ldc2_w 6587221932816977434
      // 230: lload 5
      // 232: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: athrow
      // 238: iload 15
      // 23a: iload 13
      // 23c: ifne 251
      // 23f: ifne 254
      // 242: goto 250
      // 245: ldc2_w 6587221932816977434
      // 248: lload 5
      // 24a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: athrow
      // 250: bipush 1
      // 251: goto 255
      // 254: bipush 0
      // 255: ireturn
   }

   public static d2 q(Object[] var0) {
      long var1 = (Long)var0[0];
      w1 var3 = (w1)var0[1];
      var1 = a ^ var1;

      try {
         switch (x44.a<"h">(1824467548078687796L, var1)[var3.ordinal()]) {
            case 1:
               return x44.a<"h">(2264859760695488203L, var1);
            case 2:
               return x44.a<"h">(109059306504752062L, var1);
            case 3:
               return x44.a<"h">(2122978245480528761L, var1);
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"q">(var4, 2020019990399715704L, var1);
      }

      throw new IllegalArgumentException();
   }

   public String W(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/bv.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 27572009228678
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: ldc2_w 5631418100846001740
      // 11: lload 1
      // 12: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: istore 5
      // 19: aload 0
      // 1a: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 1d: iload 5
      // 1f: ifeq 43
      // 22: ifnull 48
      // 25: goto 32
      // 28: ldc2_w 5494077988034959694
      // 2b: lload 1
      // 2c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: aload 0
      // 33: getfield com/zelix/bv.Z Lcom/zelix/x7;
      // 36: goto 43
      // 39: ldc2_w 5494077988034959694
      // 3c: lload 1
      // 3d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: lload 3
      // 44: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 47: areturn
      // 48: sipush 28551
      // 4b: ldc2_w 2029356496663549527
      // 4e: lload 1
      // 4f: lxor
      // 50: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/bv.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: areturn
   }

   x7 f(Object[] var1) {
      return this.Z;
   }

   public int l(int var1) {
      _op var2 = (_op)this.d[var1];
      return var2.W();
   }

   public boolean r(long var1) {
      var1 = a ^ var1;

      try {
         if (this.Z == null) {
            return true;
         }
      } catch (IllegalArgumentException var3) {
         throw x44.a<"t">(var3, 5293287226559683589L, var1);
      }

      return false;
   }

   void R(Object[] var1) {
      PrintWriter var2 = (PrintWriter)var1[0];
      StringBuffer var5 = (StringBuffer)var1[1];
      long var3 = (Long)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 39330206416138L;
      long var8 = var3 ^ 75629436989913L;
      boolean var10000 = x44.a<"s">(-586164705582922855L, var3);
      var2.println("");
      Object var11 = a<"y">(21486, 6063634102518648509L ^ var3);
      boolean var10 = var10000;

      label25: {
         label24: {
            label23: {
               try {
                  if (var10) {
                     break label23;
                  }

                  if (this.Z == null) {
                     break label24;
                  }
               } catch (IllegalArgumentException var12) {
                  throw x44.a<"s">(var12, -1679042195602637374L, var3);
               }

               var11 = var11 + this.Z.W(var6);
            }

            if (!var10) {
               break label25;
            }
         }

         var11 = var11 + a<"y">(398, 7755839983012568278L ^ var3);
      }

      var2.println(var5 + var11);
      StringBuilder var10001 = new StringBuilder().append((Object)var5).append(a<"y">(18224, 5553826163463199337L ^ var3));
      Object[] var10006 = new Object[]{null, 0};
      var10006[0] = var8;
      var2.println(var10001.append(x44.a<"k">(this, var10006, -914880742744883543L, var3)).toString());
      var10001 = new StringBuilder().append((Object)var5).append(a<"y">(9823, 4609927298104785669L ^ var3));
      var10006 = new Object[]{null, 1};
      var10006[0] = var8;
      var2.println(var10001.append(x44.a<"k">(this, var10006, -914880742744883543L, var3)).toString());
      var10001 = new StringBuilder().append((Object)var5).append(a<"y">(27628, 5562102345459611326L ^ var3));
      var10006 = new Object[]{null, 2};
      var10006[0] = var8;
      var2.println(var10001.append(x44.a<"k">(this, var10006, -914880742744883543L, var3)).toString());
   }

   public int a(Object[] var1) {
      return ((_op)this.d[0]).m();
   }

   public void m(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 0e: checkcast com/zelix/w
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 11807521485311
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w 1707668070673164248
      // 20: lload 2
      // 21: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: bipush 0
      // 27: istore 8
      // 29: istore 7
      // 2b: iload 8
      // 2d: aload 0
      // 2e: getfield com/zelix/bv.d [Ljava/lang/Object;
      // 31: arraylength
      // 32: if_icmpge 52
      // 35: aload 4
      // 37: aload 0
      // 38: getfield com/zelix/bv.d [Ljava/lang/Object;
      // 3b: iload 8
      // 3d: aaload
      // 3e: lload 5
      // 40: dup2_x1
      // 41: pop2
      // 42: checkcast com/zelix/_op
      // 45: aload 0
      // 46: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 49: pop
      // 4a: iinc 8 1
      // 4d: iload 7
      // 4f: ifne 2b
      // 52: lload 2
      // 53: lconst_0
      // 54: lcmp
      // 55: iflt 4d
      // 58: return
   }

   static {
      long var0 = a ^ 60594878424314L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "YÅo9s·PÙ,\u0012Y\t|§°\u008bXßrP\r \u001a \u0086aÇ´[3áP¤¿¨Ö¾qËÐ859Ë\u0089Ç(\u0091òÐV\u0093\u0080ä\u0002§W´íÚ8\u0005åÇM@ªºÂ^Ö\u00933L\u0099\u001eH.§\u0015XëáPÉ%\n/\u0013»|ç\u0097¿0\u0080\u0088 RQ\u0090dM?ÚU4u¾W\u0091+\u009cjlû®M \u0005Á\u008e\u001fÄ-\u008eA±\u000b²(;ß\\´\u0010J½È¨8Ê:\u008cB®çæ\u0016ifYÙ¡\u007fÞjK ÿFÜí³fÜ\u0006 \u008ea\u0016\u0010¼j\u0003u\u0014·@¸\u001b¹-$sZU\u0001 `Ü\u001375\u0097}\u0092EÛµdDKïsV1½ÆsÒ\r\u008c,Äª³\u009dÂ\u0084Ã0¯I` \u001büu\u00101®¹ü\u0089?*Ð\u0019\u008e¡ãt3ë#ÿø\u0094\u000e\u0083£Î\u008bÙ\"ÜyõÝg\u0094{©\u0083ÞÖ³wÀ\u0010\u009cH\u001a\u0002ÖgF?qÌ\u008a½Âï7\u0003";
      int var8 = "YÅo9s·PÙ,\u0012Y\t|§°\u008bXßrP\r \u001a \u0086aÇ´[3áP¤¿¨Ö¾qËÐ859Ë\u0089Ç(\u0091òÐV\u0093\u0080ä\u0002§W´íÚ8\u0005åÇM@ªºÂ^Ö\u00933L\u0099\u001eH.§\u0015XëáPÉ%\n/\u0013»|ç\u0097¿0\u0080\u0088 RQ\u0090dM?ÚU4u¾W\u0091+\u009cjlû®M \u0005Á\u008e\u001fÄ-\u008eA±\u000b²(;ß\\´\u0010J½È¨8Ê:\u008cB®çæ\u0016ifYÙ¡\u007fÞjK ÿFÜí³fÜ\u0006 \u008ea\u0016\u0010¼j\u0003u\u0014·@¸\u001b¹-$sZU\u0001 `Ü\u001375\u0097}\u0092EÛµdDKïsV1½ÆsÒ\r\u008c,Äª³\u009dÂ\u0084Ã0¯I` \u001büu\u00101®¹ü\u0089?*Ð\u0019\u008e¡ãt3ë#ÿø\u0094\u000e\u0083£Î\u008bÙ\"ÜyõÝg\u0094{©\u0083ÞÖ³wÀ\u0010\u009cH\u001a\u0002ÖgF?qÌ\u008a½Âï7\u0003"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[10];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0094\u0083TêM\u0006 J\u0090]5°]k #)6~æÐ²¦!·j\u0099e\u0083ä\u0081\u0092\u0088¨ï\u001f\u0087\u0016®¨\u0010±\u000b¨\u008fp{½\u0099×Åú\u0089nÎiÙ";
                  var8 = "\u0094\u0083TêM\u0006 J\u0090]5°]k #)6~æÐ²¦!·j\u0099e\u0083ä\u0081\u0092\u0088¨ï\u001f\u0087\u0016®¨\u0010±\u000b¨\u008fp{½\u0099×Åú\u0089nÎiÙ"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15186;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/bv", var10);
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
         throw new RuntimeException("com/zelix/bv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
