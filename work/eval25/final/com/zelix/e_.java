package com.zelix;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e_ implements uk {
   private static final int[] Y;
   public static PrintStream z;
   private static int L;
   static final long[] i;
   static final long[] l;
   static int d;
   static final int[] b;
   static final long[] N;
   private static int s;
   static int O;
   protected static _zd S;
   static final long[] w;
   public static final int[] M;
   static int T;
   private static final int[] A;
   static int Q;
   static int p;
   static int P;
   static final long[] e;
   static final long[] c;
   private static StringBuilder m;
   private static final StringBuilder g;
   public static final String[] f;
   protected static char Z;
   public static final String[] B;
   private static final long a = ess.a(-3656763239657108759L, 8959885230877845277L, MethodHandles.lookup().lookupClass()).a(34278191632287L);
   private static final String[] h;
   private static final String[] j;
   private static final Map k = new HashMap(13);
   private static final long[] n;
   private static final Integer[] o;
   private static final Map q;
   private static final long[] t;
   private static final Long[] u;
   private static final Map v;

   private static int u(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/e_.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 71155431841931
      // 021: lxor
      // 022: lstore 5
      // 024: dup2
      // 025: ldc2_w 92622369670035
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 84839045411089
      // 02f: lxor
      // 030: lstore 9
      // 032: dup2
      // 033: ldc2_w 47937083370847
      // 036: lxor
      // 037: lstore 11
      // 039: dup2
      // 03a: ldc2_w 77381451210368
      // 03d: lxor
      // 03e: lstore 13
      // 040: dup2
      // 041: ldc2_w 76416890070383
      // 044: lxor
      // 045: lstore 15
      // 047: pop2
      // 048: ldc2_w -9146648352130735728
      // 04b: lload 3
      // 04c: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: istore 17
      // 053: ldc2_w -7271815993495797074
      // 056: lload 3
      // 057: invokedynamic i (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: pop
      // 05d: lload 13
      // 05f: bipush 1
      // 060: anewarray 378
      // 063: dup_x2
      // 064: dup_x2
      // 065: pop
      // 066: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 069: bipush 0
      // 06a: swap
      // 06b: aastore
      // 06c: ldc2_w -8932944141869091570
      // 06f: lload 3
      // 070: invokedynamic p (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: ldc2_w -7349630213957837732
      // 078: lload 3
      // 079: invokedynamic q (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: goto 0b1
      // 081: astore 18
      // 083: lload 15
      // 085: bipush 0
      // 086: lload 1
      // 087: bipush 3
      // 088: anewarray 378
      // 08b: dup_x2
      // 08c: dup_x2
      // 08d: pop
      // 08e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 091: bipush 2
      // 092: swap
      // 093: aastore
      // 094: dup_x1
      // 095: swap
      // 096: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 099: bipush 1
      // 09a: swap
      // 09b: aastore
      // 09c: dup_x2
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a2: bipush 0
      // 0a3: swap
      // 0a4: aastore
      // 0a5: ldc2_w -8787175581563934934
      // 0a8: lload 3
      // 0a9: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: pop
      // 0af: bipush 1
      // 0b0: ireturn
      // 0b1: ldc2_w -7349630213957837732
      // 0b4: lload 3
      // 0b5: invokedynamic i (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: iload 17
      // 0bc: ifne 31d
      // 0bf: lookupswitch 563 6 42 67 47 198 62 289 97 392 99 449 105 506
      // 0f8: ldc2_w -6978816716123487033
      // 0fb: lload 3
      // 0fc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: lload 1
      // 103: sipush 27377
      // 106: ldc2_w 7556337125873194673
      // 109: lload 3
      // 10a: lxor
      // 10b: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: land
      // 111: lconst_0
      // 112: lcmp
      // 113: iload 17
      // 115: ifne 31d
      // 118: goto 125
      // 11b: ldc2_w -6978816716123487033
      // 11e: lload 3
      // 11f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: lload 3
      // 126: lconst_0
      // 127: lcmp
      // 128: iflt 2f3
      // 12b: ifeq 2f2
      // 12e: goto 13b
      // 131: ldc2_w -6978816716123487033
      // 134: lload 3
      // 135: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: bipush 1
      // 13c: lload 9
      // 13e: sipush 4356
      // 141: ldc2_w 426810003104784028
      // 144: lload 3
      // 145: lxor
      // 146: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: bipush 0
      // 14c: bipush 4
      // 14d: anewarray 378
      // 150: dup_x1
      // 151: swap
      // 152: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 155: bipush 3
      // 156: swap
      // 157: aastore
      // 158: dup_x1
      // 159: swap
      // 15a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15d: bipush 2
      // 15e: swap
      // 15f: aastore
      // 160: dup_x2
      // 161: dup_x2
      // 162: pop
      // 163: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 166: bipush 1
      // 167: swap
      // 168: aastore
      // 169: dup_x1
      // 16a: swap
      // 16b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16e: bipush 0
      // 16f: swap
      // 170: aastore
      // 171: ldc2_w -8941867646368194768
      // 174: lload 3
      // 175: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: ireturn
      // 17b: ldc2_w -6978816716123487033
      // 17e: lload 3
      // 17f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: lload 1
      // 186: sipush 26453
      // 189: ldc2_w 179127017038125842
      // 18c: lload 3
      // 18d: lxor
      // 18e: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: land
      // 194: lconst_0
      // 195: lcmp
      // 196: iload 17
      // 198: ifne 31d
      // 19b: ifeq 2f2
      // 19e: goto 1ab
      // 1a1: ldc2_w -6978816716123487033
      // 1a4: lload 3
      // 1a5: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: bipush 1
      // 1ac: lload 5
      // 1ae: bipush 4
      // 1af: bipush 3
      // 1b0: anewarray 378
      // 1b3: dup_x1
      // 1b4: swap
      // 1b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b8: bipush 2
      // 1b9: swap
      // 1ba: aastore
      // 1bb: dup_x2
      // 1bc: dup_x2
      // 1bd: pop
      // 1be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c1: bipush 1
      // 1c2: swap
      // 1c3: aastore
      // 1c4: dup_x1
      // 1c5: swap
      // 1c6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c9: bipush 0
      // 1ca: swap
      // 1cb: aastore
      // 1cc: ldc2_w -6936632002896194733
      // 1cf: lload 3
      // 1d0: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: ireturn
      // 1d6: ldc2_w -6978816716123487033
      // 1d9: lload 3
      // 1da: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: lload 1
      // 1e1: sipush 30832
      // 1e4: ldc2_w 828939267237348391
      // 1e7: lload 3
      // 1e8: lxor
      // 1e9: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: land
      // 1ef: lconst_0
      // 1f0: lcmp
      // 1f1: iload 17
      // 1f3: ifne 31d
      // 1f6: ifeq 2f2
      // 1f9: goto 206
      // 1fc: ldc2_w -6978816716123487033
      // 1ff: lload 3
      // 200: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: athrow
      // 206: bipush 1
      // 207: lload 5
      // 209: sipush 19862
      // 20c: ldc2_w 773007018291954229
      // 20f: lload 3
      // 210: lxor
      // 211: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: bipush 3
      // 217: anewarray 378
      // 21a: dup_x1
      // 21b: swap
      // 21c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 21f: bipush 2
      // 220: swap
      // 221: aastore
      // 222: dup_x2
      // 223: dup_x2
      // 224: pop
      // 225: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 228: bipush 1
      // 229: swap
      // 22a: aastore
      // 22b: dup_x1
      // 22c: swap
      // 22d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 230: bipush 0
      // 231: swap
      // 232: aastore
      // 233: ldc2_w -6936632002896194733
      // 236: lload 3
      // 237: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: ireturn
      // 23d: ldc2_w -6978816716123487033
      // 240: lload 3
      // 241: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: lload 1
      // 248: sipush 12459
      // 24b: ldc2_w 3753083282005216509
      // 24e: lload 3
      // 24f: lxor
      // 250: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: lload 7
      // 257: bipush 3
      // 258: anewarray 378
      // 25b: dup_x2
      // 25c: dup_x2
      // 25d: pop
      // 25e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 261: bipush 2
      // 262: swap
      // 263: aastore
      // 264: dup_x2
      // 265: dup_x2
      // 266: pop
      // 267: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26a: bipush 1
      // 26b: swap
      // 26c: aastore
      // 26d: dup_x2
      // 26e: dup_x2
      // 26f: pop
      // 270: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 273: bipush 0
      // 274: swap
      // 275: aastore
      // 276: ldc2_w -9001113147222361180
      // 279: lload 3
      // 27a: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: ireturn
      // 280: lload 1
      // 281: sipush 13285
      // 284: ldc2_w 8905019087360151484
      // 287: lload 3
      // 288: lxor
      // 289: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: lload 7
      // 290: bipush 3
      // 291: anewarray 378
      // 294: dup_x2
      // 295: dup_x2
      // 296: pop
      // 297: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29a: bipush 2
      // 29b: swap
      // 29c: aastore
      // 29d: dup_x2
      // 29e: dup_x2
      // 29f: pop
      // 2a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a3: bipush 1
      // 2a4: swap
      // 2a5: aastore
      // 2a6: dup_x2
      // 2a7: dup_x2
      // 2a8: pop
      // 2a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ac: bipush 0
      // 2ad: swap
      // 2ae: aastore
      // 2af: ldc2_w -9001113147222361180
      // 2b2: lload 3
      // 2b3: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: ireturn
      // 2b9: lload 1
      // 2ba: sipush 15665
      // 2bd: ldc2_w 4066926100937621853
      // 2c0: lload 3
      // 2c1: lxor
      // 2c2: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: lload 7
      // 2c9: bipush 3
      // 2ca: anewarray 378
      // 2cd: dup_x2
      // 2ce: dup_x2
      // 2cf: pop
      // 2d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d3: bipush 2
      // 2d4: swap
      // 2d5: aastore
      // 2d6: dup_x2
      // 2d7: dup_x2
      // 2d8: pop
      // 2d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2dc: bipush 1
      // 2dd: swap
      // 2de: aastore
      // 2df: dup_x2
      // 2e0: dup_x2
      // 2e1: pop
      // 2e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e5: bipush 0
      // 2e6: swap
      // 2e7: aastore
      // 2e8: ldc2_w -9001113147222361180
      // 2eb: lload 3
      // 2ec: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: ireturn
      // 2f2: bipush 0
      // 2f3: lload 1
      // 2f4: lload 11
      // 2f6: bipush 3
      // 2f7: anewarray 378
      // 2fa: dup_x2
      // 2fb: dup_x2
      // 2fc: pop
      // 2fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 30e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 311: bipush 0
      // 312: swap
      // 313: aastore
      // 314: ldc2_w -7403264308877308961
      // 317: lload 3
      // 318: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31d: ireturn
   }

   private static int t(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 34974379019709
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 39520737023696
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 125580117425762
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 125164242404749
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w -300779730660991764
      // 04b: lload 5
      // 04d: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 15
      // 054: lload 3
      // 055: lload 1
      // 056: land
      // 057: dup2
      // 058: lstore 3
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iload 15
      // 05d: ifeq 0cd
      // 060: ifne 0a9
      // 063: goto 071
      // 066: ldc2_w -16757132040494043
      // 069: lload 5
      // 06b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: bipush 2
      // 072: lload 1
      // 073: lload 7
      // 075: bipush 3
      // 076: anewarray 378
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 2
      // 080: swap
      // 081: aastore
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w -459254994883237059
      // 096: lload 5
      // 098: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: ireturn
      // 09e: ldc2_w -16757132040494043
      // 0a1: lload 5
      // 0a3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: ldc2_w -290651811871808948
      // 0ac: lload 5
      // 0ae: invokedynamic k (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: pop
      // 0b4: lload 11
      // 0b6: bipush 1
      // 0b7: anewarray 378
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: ldc2_w -1952878922033064468
      // 0c6: lload 5
      // 0c8: invokedynamic r (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: ldc2_w -368474845568828226
      // 0d0: lload 5
      // 0d2: invokedynamic s (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: goto 10b
      // 0da: astore 16
      // 0dc: lload 13
      // 0de: bipush 3
      // 0df: lload 3
      // 0e0: bipush 3
      // 0e1: anewarray 378
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 2
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f2: bipush 1
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x2
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: ldc2_w -1806055552136624184
      // 101: lload 5
      // 103: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: pop
      // 109: bipush 4
      // 10a: ireturn
      // 10b: ldc2_w -368474845568828226
      // 10e: lload 5
      // 110: invokedynamic k (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: iload 15
      // 117: ifeq 22f
      // 11a: lookupswitch 233 3 97 45 110 115 116 174
      // 13c: ldc2_w -16757132040494043
      // 13f: lload 5
      // 141: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: lload 3
      // 148: sipush 31174
      // 14b: ldc2_w 555655264472294777
      // 14e: lload 5
      // 150: lxor
      // 151: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: lload 9
      // 158: bipush 3
      // 159: anewarray 378
      // 15c: dup_x2
      // 15d: dup_x2
      // 15e: pop
      // 15f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 162: bipush 2
      // 163: swap
      // 164: aastore
      // 165: dup_x2
      // 166: dup_x2
      // 167: pop
      // 168: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b: bipush 1
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x2
      // 16f: dup_x2
      // 170: pop
      // 171: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 174: bipush 0
      // 175: swap
      // 176: aastore
      // 177: ldc2_w -173803927366449691
      // 17a: lload 5
      // 17c: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: ireturn
      // 182: ldc2_w -16757132040494043
      // 185: lload 5
      // 187: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: lload 3
      // 18e: sipush 2294
      // 191: ldc2_w 9033210416268842074
      // 194: lload 5
      // 196: lxor
      // 197: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: lload 9
      // 19e: bipush 3
      // 19f: anewarray 378
      // 1a2: dup_x2
      // 1a3: dup_x2
      // 1a4: pop
      // 1a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a8: bipush 2
      // 1a9: swap
      // 1aa: aastore
      // 1ab: dup_x2
      // 1ac: dup_x2
      // 1ad: pop
      // 1ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b1: bipush 1
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x2
      // 1b5: dup_x2
      // 1b6: pop
      // 1b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ba: bipush 0
      // 1bb: swap
      // 1bc: aastore
      // 1bd: ldc2_w -173803927366449691
      // 1c0: lload 5
      // 1c2: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: ireturn
      // 1c8: lload 3
      // 1c9: sipush 19026
      // 1cc: ldc2_w 7568428331571795679
      // 1cf: lload 5
      // 1d1: lxor
      // 1d2: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: lload 9
      // 1d9: bipush 3
      // 1da: anewarray 378
      // 1dd: dup_x2
      // 1de: dup_x2
      // 1df: pop
      // 1e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e3: bipush 2
      // 1e4: swap
      // 1e5: aastore
      // 1e6: dup_x2
      // 1e7: dup_x2
      // 1e8: pop
      // 1e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ec: bipush 1
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x2
      // 1f0: dup_x2
      // 1f1: pop
      // 1f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f5: bipush 0
      // 1f6: swap
      // 1f7: aastore
      // 1f8: ldc2_w -173803927366449691
      // 1fb: lload 5
      // 1fd: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: ireturn
      // 203: bipush 3
      // 204: lload 3
      // 205: lload 7
      // 207: bipush 3
      // 208: anewarray 378
      // 20b: dup_x2
      // 20c: dup_x2
      // 20d: pop
      // 20e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 211: bipush 2
      // 212: swap
      // 213: aastore
      // 214: dup_x2
      // 215: dup_x2
      // 216: pop
      // 217: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21a: bipush 1
      // 21b: swap
      // 21c: aastore
      // 21d: dup_x1
      // 21e: swap
      // 21f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 222: bipush 0
      // 223: swap
      // 224: aastore
      // 225: ldc2_w -459254994883237059
      // 228: lload 5
      // 22a: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: ireturn
   }

   private static int w(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      int var4 = (Integer)var0[2];
      var2 = a ^ var2;
      x44.a<"u">(var4, 8541143774278762096L, var2);
      x44.a<"u">(var1, 8601317810966840581L, var2);
      return var1 + 1;
   }

   private static int g(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      int var5 = (Integer)var0[2];
      int var4 = (Integer)var0[3];
      var2 = a ^ var2;
      long var6 = var2 ^ 5972327185573L;
      long var8 = var2 ^ 99367647886062L;
      x44.a<"w">(var5, 7427052184383762410L, var2);
      x44.a<"w">(var1, 7405054013378155679L, var2);

      try {
         x44.a<"o">(9186021483566999232L, var2);
         x44.a<"w">(x44.a<"v">(new Object[]{var8}, 6947315479091319136L, var2), 9110432941466679346L, var2);
      } catch (IOException var11) {
         return var1 + 1;
      }

      Object[] var10004 = new Object[]{null, null, var1 + 1};
      var10004[1] = var4;
      var10004[0] = var6;
      return x44.a<"v">(var10004, 7460453487814704334L, var2);
   }

   private static final int f(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 4
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 1
      // 025: lxor
      // 026: lstore 1
      // 027: ldc2_w 3530970949511434624
      // 02a: lload 1
      // 02b: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: istore 6
      // 032: iload 3
      // 033: iload 6
      // 035: ifne 62c
      // 038: tableswitch 1523 0 10 70 272 414 511 608 705 802 899 1055 1211 1367
      // 074: ldc2_w 3402003025083593943
      // 077: lload 1
      // 078: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: lload 4
      // 080: sipush 385
      // 083: ldc2_w 1279713761922403789
      // 086: lload 1
      // 087: lxor
      // 088: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: land
      // 08e: lconst_0
      // 08f: lcmp
      // 090: iload 6
      // 092: lload 1
      // 093: lconst_0
      // 094: lcmp
      // 095: iflt 0d8
      // 098: ifne 0d6
      // 09b: goto 0a8
      // 09e: ldc2_w 3402003025083593943
      // 0a1: lload 1
      // 0a2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: ifeq 0c4
      // 0ab: goto 0b8
      // 0ae: ldc2_w 3402003025083593943
      // 0b1: lload 1
      // 0b2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: bipush 2
      // 0b9: ireturn
      // 0ba: ldc2_w 3402003025083593943
      // 0bd: lload 1
      // 0be: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: athrow
      // 0c4: lload 4
      // 0c6: sipush 12459
      // 0c9: ldc2_w 3753105744685137133
      // 0cc: lload 1
      // 0cd: lxor
      // 0ce: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: land
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: iload 6
      // 0d8: lload 1
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: ifle 127
      // 0de: ifne 125
      // 0e1: ifeq 113
      // 0e4: goto 0f1
      // 0e7: ldc2_w 3402003025083593943
      // 0ea: lload 1
      // 0eb: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: sipush 28126
      // 0f4: ldc2_w 4699780363000320635
      // 0f7: lload 1
      // 0f8: lxor
      // 0f9: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: ldc2_w 3705398396300295060
      // 101: lload 1
      // 102: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: bipush 5
      // 108: ireturn
      // 109: ldc2_w 3402003025083593943
      // 10c: lload 1
      // 10d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: lload 4
      // 115: sipush 29810
      // 118: ldc2_w 8742886230902683709
      // 11b: lload 1
      // 11c: lxor
      // 11d: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: land
      // 123: lconst_0
      // 124: lcmp
      // 125: iload 6
      // 127: ifne 147
      // 12a: ifeq 146
      // 12d: goto 13a
      // 130: ldc2_w 3402003025083593943
      // 133: lload 1
      // 134: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: bipush 5
      // 13b: ireturn
      // 13c: ldc2_w 3402003025083593943
      // 13f: lload 1
      // 140: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: bipush -1
      // 147: ireturn
      // 148: lload 4
      // 14a: sipush 19618
      // 14d: ldc2_w 471705134474756332
      // 150: lload 1
      // 151: lxor
      // 152: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: land
      // 158: lconst_0
      // 159: lcmp
      // 15a: iload 6
      // 15c: lload 1
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: ifle 195
      // 162: ifne 193
      // 165: ifeq 181
      // 168: goto 175
      // 16b: ldc2_w 3402003025083593943
      // 16e: lload 1
      // 16f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: athrow
      // 175: bipush 0
      // 176: ireturn
      // 177: ldc2_w 3402003025083593943
      // 17a: lload 1
      // 17b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: lload 4
      // 183: sipush 12459
      // 186: ldc2_w 3753105744685137133
      // 189: lload 1
      // 18a: lxor
      // 18b: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: land
      // 191: lconst_0
      // 192: lcmp
      // 193: iload 6
      // 195: ifne 1d5
      // 198: ifeq 1d4
      // 19b: goto 1a8
      // 19e: ldc2_w 3402003025083593943
      // 1a1: lload 1
      // 1a2: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: sipush 28126
      // 1ab: ldc2_w 4699780363000320635
      // 1ae: lload 1
      // 1af: lxor
      // 1b0: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: ldc2_w 3705398396300295060
      // 1b8: lload 1
      // 1b9: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: bipush 1
      // 1bf: ldc2_w 3655236028236562657
      // 1c2: lload 1
      // 1c3: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: bipush 5
      // 1c9: ireturn
      // 1ca: ldc2_w 3402003025083593943
      // 1cd: lload 1
      // 1ce: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: bipush -1
      // 1d5: ireturn
      // 1d6: lload 4
      // 1d8: sipush 12459
      // 1db: ldc2_w 3753105744685137133
      // 1de: lload 1
      // 1df: lxor
      // 1e0: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: land
      // 1e6: lconst_0
      // 1e7: lcmp
      // 1e8: iload 6
      // 1ea: ifne 236
      // 1ed: ifeq 235
      // 1f0: goto 1fd
      // 1f3: ldc2_w 3402003025083593943
      // 1f6: lload 1
      // 1f7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: sipush 28126
      // 200: ldc2_w 4699780363000320635
      // 203: lload 1
      // 204: lxor
      // 205: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: ldc2_w 3705398396300295060
      // 20d: lload 1
      // 20e: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: sipush 7618
      // 216: ldc2_w 6200245269313413741
      // 219: lload 1
      // 21a: lxor
      // 21b: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: ldc2_w 3655236028236562657
      // 223: lload 1
      // 224: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: bipush 5
      // 22a: ireturn
      // 22b: ldc2_w 3402003025083593943
      // 22e: lload 1
      // 22f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: bipush -1
      // 236: ireturn
      // 237: lload 4
      // 239: sipush 12459
      // 23c: ldc2_w 3753105744685137133
      // 23f: lload 1
      // 240: lxor
      // 241: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: land
      // 247: lconst_0
      // 248: lcmp
      // 249: iload 6
      // 24b: ifne 297
      // 24e: ifeq 296
      // 251: goto 25e
      // 254: ldc2_w 3402003025083593943
      // 257: lload 1
      // 258: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: athrow
      // 25e: sipush 28126
      // 261: ldc2_w 4699780363000320635
      // 264: lload 1
      // 265: lxor
      // 266: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: ldc2_w 3705398396300295060
      // 26e: lload 1
      // 26f: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: sipush 6743
      // 277: ldc2_w 4308908100635026940
      // 27a: lload 1
      // 27b: lxor
      // 27c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: ldc2_w 3655236028236562657
      // 284: lload 1
      // 285: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: bipush 5
      // 28b: ireturn
      // 28c: ldc2_w 3402003025083593943
      // 28f: lload 1
      // 290: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: athrow
      // 296: bipush -1
      // 297: ireturn
      // 298: lload 4
      // 29a: sipush 12459
      // 29d: ldc2_w 3753105744685137133
      // 2a0: lload 1
      // 2a1: lxor
      // 2a2: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: land
      // 2a8: lconst_0
      // 2a9: lcmp
      // 2aa: iload 6
      // 2ac: ifne 2f8
      // 2af: ifeq 2f7
      // 2b2: goto 2bf
      // 2b5: ldc2_w 3402003025083593943
      // 2b8: lload 1
      // 2b9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: athrow
      // 2bf: sipush 28126
      // 2c2: ldc2_w 4699780363000320635
      // 2c5: lload 1
      // 2c6: lxor
      // 2c7: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: ldc2_w 3705398396300295060
      // 2cf: lload 1
      // 2d0: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: sipush 22746
      // 2d8: ldc2_w 8231615227150608238
      // 2db: lload 1
      // 2dc: lxor
      // 2dd: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: ldc2_w 3655236028236562657
      // 2e5: lload 1
      // 2e6: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: bipush 5
      // 2ec: ireturn
      // 2ed: ldc2_w 3402003025083593943
      // 2f0: lload 1
      // 2f1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: athrow
      // 2f7: bipush -1
      // 2f8: ireturn
      // 2f9: lload 4
      // 2fb: sipush 12459
      // 2fe: ldc2_w 3753105744685137133
      // 301: lload 1
      // 302: lxor
      // 303: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: land
      // 309: lconst_0
      // 30a: lcmp
      // 30b: iload 6
      // 30d: ifne 359
      // 310: ifeq 358
      // 313: goto 320
      // 316: ldc2_w 3402003025083593943
      // 319: lload 1
      // 31a: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: athrow
      // 320: sipush 28126
      // 323: ldc2_w 4699780363000320635
      // 326: lload 1
      // 327: lxor
      // 328: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32d: ldc2_w 3705398396300295060
      // 330: lload 1
      // 331: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: sipush 5622
      // 339: ldc2_w 5518590160298306139
      // 33c: lload 1
      // 33d: lxor
      // 33e: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: ldc2_w 3655236028236562657
      // 346: lload 1
      // 347: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: bipush 5
      // 34d: ireturn
      // 34e: ldc2_w 3402003025083593943
      // 351: lload 1
      // 352: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: athrow
      // 358: bipush -1
      // 359: ireturn
      // 35a: lload 4
      // 35c: sipush 12459
      // 35f: ldc2_w 3753105744685137133
      // 362: lload 1
      // 363: lxor
      // 364: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 369: land
      // 36a: lconst_0
      // 36b: lcmp
      // 36c: iload 6
      // 36e: ifne 3ba
      // 371: ifeq 3b9
      // 374: goto 381
      // 377: ldc2_w 3402003025083593943
      // 37a: lload 1
      // 37b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: athrow
      // 381: sipush 28126
      // 384: ldc2_w 4699780363000320635
      // 387: lload 1
      // 388: lxor
      // 389: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: ldc2_w 3705398396300295060
      // 391: lload 1
      // 392: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: sipush 4356
      // 39a: ldc2_w 426788605578145420
      // 39d: lload 1
      // 39e: lxor
      // 39f: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a4: ldc2_w 3655236028236562657
      // 3a7: lload 1
      // 3a8: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ad: bipush 5
      // 3ae: ireturn
      // 3af: ldc2_w 3402003025083593943
      // 3b2: lload 1
      // 3b3: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b8: athrow
      // 3b9: bipush -1
      // 3ba: ireturn
      // 3bb: lload 4
      // 3bd: sipush 12459
      // 3c0: ldc2_w 3753105744685137133
      // 3c3: lload 1
      // 3c4: lxor
      // 3c5: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: land
      // 3cb: lconst_0
      // 3cc: lcmp
      // 3cd: iload 6
      // 3cf: ifne 456
      // 3d2: ifeq 455
      // 3d5: goto 3e2
      // 3d8: ldc2_w 3402003025083593943
      // 3db: lload 1
      // 3dc: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e1: athrow
      // 3e2: ldc2_w 3655236028236562657
      // 3e5: lload 1
      // 3e6: invokedynamic i (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3eb: iload 6
      // 3ed: ifne 454
      // 3f0: goto 3fd
      // 3f3: ldc2_w 3402003025083593943
      // 3f6: lload 1
      // 3f7: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fc: athrow
      // 3fd: sipush 4356
      // 400: ldc2_w 426788605578145420
      // 403: lload 1
      // 404: lxor
      // 405: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40a: if_icmpge 453
      // 40d: goto 41a
      // 410: ldc2_w 3402003025083593943
      // 413: lload 1
      // 414: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 419: athrow
      // 41a: sipush 28126
      // 41d: ldc2_w 4699780363000320635
      // 420: lload 1
      // 421: lxor
      // 422: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 427: ldc2_w 3705398396300295060
      // 42a: lload 1
      // 42b: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 430: sipush 4356
      // 433: ldc2_w 426788605578145420
      // 436: lload 1
      // 437: lxor
      // 438: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43d: ldc2_w 3655236028236562657
      // 440: lload 1
      // 441: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 446: goto 453
      // 449: ldc2_w 3402003025083593943
      // 44c: lload 1
      // 44d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 452: athrow
      // 453: bipush -1
      // 454: ireturn
      // 455: bipush -1
      // 456: ireturn
      // 457: lload 4
      // 459: sipush 12459
      // 45c: ldc2_w 3753105744685137133
      // 45f: lload 1
      // 460: lxor
      // 461: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 466: land
      // 467: lconst_0
      // 468: lcmp
      // 469: iload 6
      // 46b: ifne 4f2
      // 46e: ifeq 4f1
      // 471: goto 47e
      // 474: ldc2_w 3402003025083593943
      // 477: lload 1
      // 478: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47d: athrow
      // 47e: ldc2_w 3655236028236562657
      // 481: lload 1
      // 482: invokedynamic i (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 487: iload 6
      // 489: ifne 4f0
      // 48c: goto 499
      // 48f: ldc2_w 3402003025083593943
      // 492: lload 1
      // 493: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 498: athrow
      // 499: sipush 4356
      // 49c: ldc2_w 426788605578145420
      // 49f: lload 1
      // 4a0: lxor
      // 4a1: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a6: if_icmpge 4ef
      // 4a9: goto 4b6
      // 4ac: ldc2_w 3402003025083593943
      // 4af: lload 1
      // 4b0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b5: athrow
      // 4b6: sipush 28126
      // 4b9: ldc2_w 4699780363000320635
      // 4bc: lload 1
      // 4bd: lxor
      // 4be: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c3: ldc2_w 3705398396300295060
      // 4c6: lload 1
      // 4c7: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cc: sipush 4356
      // 4cf: ldc2_w 426788605578145420
      // 4d2: lload 1
      // 4d3: lxor
      // 4d4: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d9: ldc2_w 3655236028236562657
      // 4dc: lload 1
      // 4dd: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e2: goto 4ef
      // 4e5: ldc2_w 3402003025083593943
      // 4e8: lload 1
      // 4e9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ee: athrow
      // 4ef: bipush -1
      // 4f0: ireturn
      // 4f1: bipush -1
      // 4f2: ireturn
      // 4f3: lload 4
      // 4f5: sipush 12459
      // 4f8: ldc2_w 3753105744685137133
      // 4fb: lload 1
      // 4fc: lxor
      // 4fd: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 502: land
      // 503: lconst_0
      // 504: lcmp
      // 505: iload 6
      // 507: ifne 58e
      // 50a: ifeq 58d
      // 50d: goto 51a
      // 510: ldc2_w 3402003025083593943
      // 513: lload 1
      // 514: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 519: athrow
      // 51a: ldc2_w 3655236028236562657
      // 51d: lload 1
      // 51e: invokedynamic i (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 523: iload 6
      // 525: ifne 58c
      // 528: goto 535
      // 52b: ldc2_w 3402003025083593943
      // 52e: lload 1
      // 52f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 534: athrow
      // 535: sipush 4356
      // 538: ldc2_w 426788605578145420
      // 53b: lload 1
      // 53c: lxor
      // 53d: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 542: if_icmpge 58b
      // 545: goto 552
      // 548: ldc2_w 3402003025083593943
      // 54b: lload 1
      // 54c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 551: athrow
      // 552: sipush 28126
      // 555: ldc2_w 4699780363000320635
      // 558: lload 1
      // 559: lxor
      // 55a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55f: ldc2_w 3705398396300295060
      // 562: lload 1
      // 563: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 568: sipush 4356
      // 56b: ldc2_w 426788605578145420
      // 56e: lload 1
      // 56f: lxor
      // 570: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 575: ldc2_w 3655236028236562657
      // 578: lload 1
      // 579: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57e: goto 58b
      // 581: ldc2_w 3402003025083593943
      // 584: lload 1
      // 585: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58a: athrow
      // 58b: bipush -1
      // 58c: ireturn
      // 58d: bipush -1
      // 58e: ireturn
      // 58f: lload 4
      // 591: sipush 12459
      // 594: ldc2_w 3753105744685137133
      // 597: lload 1
      // 598: lxor
      // 599: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59e: land
      // 59f: lconst_0
      // 5a0: lcmp
      // 5a1: iload 6
      // 5a3: ifne 62a
      // 5a6: ifeq 629
      // 5a9: goto 5b6
      // 5ac: ldc2_w 3402003025083593943
      // 5af: lload 1
      // 5b0: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b5: athrow
      // 5b6: ldc2_w 3655236028236562657
      // 5b9: lload 1
      // 5ba: invokedynamic i (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bf: iload 6
      // 5c1: ifne 628
      // 5c4: goto 5d1
      // 5c7: ldc2_w 3402003025083593943
      // 5ca: lload 1
      // 5cb: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d0: athrow
      // 5d1: sipush 4356
      // 5d4: ldc2_w 426788605578145420
      // 5d7: lload 1
      // 5d8: lxor
      // 5d9: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5de: if_icmpge 627
      // 5e1: goto 5ee
      // 5e4: ldc2_w 3402003025083593943
      // 5e7: lload 1
      // 5e8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ed: athrow
      // 5ee: sipush 28126
      // 5f1: ldc2_w 4699780363000320635
      // 5f4: lload 1
      // 5f5: lxor
      // 5f6: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fb: ldc2_w 3705398396300295060
      // 5fe: lload 1
      // 5ff: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 604: sipush 4356
      // 607: ldc2_w 426788605578145420
      // 60a: lload 1
      // 60b: lxor
      // 60c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 611: ldc2_w 3655236028236562657
      // 614: lload 1
      // 615: invokedynamic q (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61a: goto 627
      // 61d: ldc2_w 3402003025083593943
      // 620: lload 1
      // 621: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 626: athrow
      // 627: bipush -1
      // 628: ireturn
      // 629: bipush -1
      // 62a: ireturn
      // 62b: bipush -1
      // 62c: ireturn
   }

   private static int o(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 88492274933636
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 65239017230928
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 95298232295823
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 93787811977824
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w 9088126628297711263
      // 04b: lload 5
      // 04d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 15
      // 054: lload 3
      // 055: lload 1
      // 056: land
      // 057: dup2
      // 058: lstore 3
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iload 15
      // 05d: ifne 0da
      // 060: ifne 0b6
      // 063: goto 071
      // 066: ldc2_w 6929161725745249224
      // 069: lload 5
      // 06b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: sipush 29050
      // 074: ldc2_w 2106563778004599256
      // 077: lload 5
      // 079: lxor
      // 07a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: lload 1
      // 080: lload 9
      // 082: bipush 3
      // 083: anewarray 378
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 2
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x2
      // 090: dup_x2
      // 091: pop
      // 092: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 095: bipush 1
      // 096: swap
      // 097: aastore
      // 098: dup_x1
      // 099: swap
      // 09a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w 7371621391309452496
      // 0a3: lload 5
      // 0a5: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: ireturn
      // 0ab: ldc2_w 6929161725745249224
      // 0ae: lload 5
      // 0b0: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: ldc2_w 7213149415505935777
      // 0b9: lload 5
      // 0bb: invokedynamic n (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: pop
      // 0c1: lload 11
      // 0c3: bipush 1
      // 0c4: anewarray 378
      // 0c7: dup_x2
      // 0c8: dup_x2
      // 0c9: pop
      // 0ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd: bipush 0
      // 0ce: swap
      // 0cf: aastore
      // 0d0: ldc2_w 8865580426846898689
      // 0d3: lload 5
      // 0d5: invokedynamic w (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: ldc2_w 7282266232671265619
      // 0dd: lload 5
      // 0df: invokedynamic v (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 132
      // 0e7: astore 16
      // 0e9: lload 13
      // 0eb: sipush 12227
      // 0ee: ldc2_w 454585551823249264
      // 0f1: lload 5
      // 0f3: lxor
      // 0f4: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: lload 3
      // 0fa: bipush 3
      // 0fb: anewarray 378
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 2
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10c: bipush 1
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w 8719741362502948901
      // 11b: lload 5
      // 11d: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: pop
      // 123: sipush 11791
      // 126: ldc2_w 1205058917849833138
      // 129: lload 5
      // 12b: lxor
      // 12c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: ireturn
      // 132: ldc2_w 7282266232671265619
      // 135: lload 5
      // 137: invokedynamic n (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: iload 15
      // 13e: ifne 226
      // 141: lookupswitch 172 1 111 30
      // 154: ldc2_w 6929161725745249224
      // 157: lload 5
      // 159: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: lload 3
      // 160: sipush 12459
      // 163: ldc2_w 3753101099213599730
      // 166: lload 5
      // 168: lxor
      // 169: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: land
      // 16f: lconst_0
      // 170: lcmp
      // 171: iload 15
      // 173: ifne 226
      // 176: goto 184
      // 179: ldc2_w 6929161725745249224
      // 17c: lload 5
      // 17e: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: lload 5
      // 186: lconst_0
      // 187: lcmp
      // 188: ifle 1fb
      // 18b: ifeq 1ed
      // 18e: goto 19c
      // 191: ldc2_w 6929161725745249224
      // 194: lload 5
      // 196: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: sipush 11791
      // 19f: ldc2_w 1205058917849833138
      // 1a2: lload 5
      // 1a4: lxor
      // 1a5: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: lload 7
      // 1ac: sipush 16181
      // 1af: ldc2_w 2278375151053541339
      // 1b2: lload 5
      // 1b4: lxor
      // 1b5: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: bipush 3
      // 1bb: anewarray 378
      // 1be: dup_x1
      // 1bf: swap
      // 1c0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c3: bipush 2
      // 1c4: swap
      // 1c5: aastore
      // 1c6: dup_x2
      // 1c7: dup_x2
      // 1c8: pop
      // 1c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cc: bipush 1
      // 1cd: swap
      // 1ce: aastore
      // 1cf: dup_x1
      // 1d0: swap
      // 1d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d4: bipush 0
      // 1d5: swap
      // 1d6: aastore
      // 1d7: ldc2_w 6967967188236233820
      // 1da: lload 5
      // 1dc: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: ireturn
      // 1e2: ldc2_w 6929161725745249224
      // 1e5: lload 5
      // 1e7: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: athrow
      // 1ed: sipush 12227
      // 1f0: ldc2_w 454585551823249264
      // 1f3: lload 5
      // 1f5: lxor
      // 1f6: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: lload 3
      // 1fc: lload 9
      // 1fe: bipush 3
      // 1ff: anewarray 378
      // 202: dup_x2
      // 203: dup_x2
      // 204: pop
      // 205: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 208: bipush 2
      // 209: swap
      // 20a: aastore
      // 20b: dup_x2
      // 20c: dup_x2
      // 20d: pop
      // 20e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 211: bipush 1
      // 212: swap
      // 213: aastore
      // 214: dup_x1
      // 215: swap
      // 216: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 219: bipush 0
      // 21a: swap
      // 21b: aastore
      // 21c: ldc2_w 7371621391309452496
      // 21f: lload 5
      // 221: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: ireturn
   }

   private static int d(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 135270873584098
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 133815151756859
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 22324060108260
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 26033102458379
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w -1552402779667920140
      // 04b: lload 5
      // 04d: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 15
      // 054: lload 3
      // 055: lload 1
      // 056: land
      // 057: dup2
      // 058: lstore 3
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iload 15
      // 05d: ifne 0da
      // 060: ifne 0b6
      // 063: goto 071
      // 066: ldc2_w -846095082009153629
      // 069: lload 5
      // 06b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: sipush 4356
      // 074: ldc2_w 426724047995385336
      // 077: lload 5
      // 079: lxor
      // 07a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: lload 1
      // 080: lload 9
      // 082: bipush 3
      // 083: anewarray 378
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 2
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x2
      // 090: dup_x2
      // 091: pop
      // 092: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 095: bipush 1
      // 096: swap
      // 097: aastore
      // 098: dup_x1
      // 099: swap
      // 09a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w -998109749078712133
      // 0a3: lload 5
      // 0a5: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: ireturn
      // 0ab: ldc2_w -846095082009153629
      // 0ae: lload 5
      // 0b0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: ldc2_w -1121110654042199606
      // 0b9: lload 5
      // 0bb: invokedynamic m (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: pop
      // 0c1: lload 11
      // 0c3: bipush 1
      // 0c4: anewarray 378
      // 0c7: dup_x2
      // 0c8: dup_x2
      // 0c9: pop
      // 0ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd: bipush 0
      // 0ce: swap
      // 0cf: aastore
      // 0d0: ldc2_w -1196940947532210582
      // 0d3: lload 5
      // 0d5: invokedynamic t (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: ldc2_w -1052562000924248264
      // 0dd: lload 5
      // 0df: invokedynamic u (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 132
      // 0e7: astore 16
      // 0e9: lload 13
      // 0eb: sipush 1685
      // 0ee: ldc2_w 5731565264321159806
      // 0f1: lload 5
      // 0f3: lxor
      // 0f4: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: lload 3
      // 0fa: bipush 3
      // 0fb: anewarray 378
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 2
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10c: bipush 1
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w -1339261855970866098
      // 11b: lload 5
      // 11d: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: pop
      // 123: sipush 29425
      // 126: ldc2_w 9218816244830033526
      // 129: lload 5
      // 12b: lxor
      // 12c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: ireturn
      // 132: ldc2_w -1052562000924248264
      // 135: lload 5
      // 137: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: iload 15
      // 13e: ifne 1de
      // 141: lookupswitch 100 1 105 30
      // 154: ldc2_w -846095082009153629
      // 157: lload 5
      // 159: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: lload 3
      // 160: sipush 12459
      // 163: ldc2_w 3753173532216240025
      // 166: lload 5
      // 168: lxor
      // 169: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: lload 7
      // 170: bipush 3
      // 171: anewarray 378
      // 174: dup_x2
      // 175: dup_x2
      // 176: pop
      // 177: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17a: bipush 2
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 1
      // 184: swap
      // 185: aastore
      // 186: dup_x2
      // 187: dup_x2
      // 188: pop
      // 189: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: ldc2_w -1331226636792557649
      // 192: lload 5
      // 194: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: ireturn
      // 19a: ldc2_w -846095082009153629
      // 19d: lload 5
      // 19f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: sipush 1685
      // 1a8: ldc2_w 5731565264321159806
      // 1ab: lload 5
      // 1ad: lxor
      // 1ae: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: lload 3
      // 1b4: lload 9
      // 1b6: bipush 3
      // 1b7: anewarray 378
      // 1ba: dup_x2
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c0: bipush 2
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x2
      // 1c4: dup_x2
      // 1c5: pop
      // 1c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c9: bipush 1
      // 1ca: swap
      // 1cb: aastore
      // 1cc: dup_x1
      // 1cd: swap
      // 1ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d1: bipush 0
      // 1d2: swap
      // 1d3: aastore
      // 1d4: ldc2_w -998109749078712133
      // 1d7: lload 5
      // 1d9: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: ireturn
   }

   public static void m(Object[] var0) {
      long var2 = (Long)var0[0];
      _zd var1 = (_zd)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 18996637521202L;
      x44.a<"r">(0, 9164953556040109910L, var2);
      x44.a<"r">(0, 9131434357129104610L, var2);
      x44.a<"r">(x44.a<"j">(7432924491966471232L, var2), 7028999511447613265L, var2);
      x44.a<"r">(var1, 7423651342139801277L, var2);
      x44.a<"s">(new Object[]{var4}, 8721534650940187454L, var2);
   }

   static void G(Object[] var0) {
      long var2 = (Long)var0[0];
      t6 var1 = (t6)var0[1];
      var2 = a ^ var2;
      switch (x44.a<"h">(2638294170195520613L, var2)) {
      }
   }

   private static int A(Object[] param0) {
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
      // 0c: getstatic com/zelix/e_.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: lload 1
      // 13: dup2
      // 14: ldc2_w 56821217102701
      // 17: lxor
      // 18: lstore 3
      // 19: dup2
      // 1a: ldc2_w 70691839067503
      // 1d: lxor
      // 1e: lstore 5
      // 20: pop2
      // 21: ldc2_w -8325731260900365494
      // 24: lload 1
      // 25: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: istore 7
      // 2c: ldc2_w -8267324692213757160
      // 2f: lload 1
      // 30: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: iload 7
      // 37: ifeq c9
      // 3a: lookupswitch 101 1 34 28
      // 4c: ldc2_w -8619306326113201277
      // 4f: lload 1
      // 50: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: bipush 0
      // 57: sipush 26668
      // 5a: ldc2_w 1169523144487940343
      // 5d: lload 1
      // 5e: lxor
      // 5f: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: bipush 2
      // 65: lload 3
      // 66: bipush 4
      // 67: anewarray 378
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 3
      // 71: swap
      // 72: aastore
      // 73: dup_x1
      // 74: swap
      // 75: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 78: bipush 2
      // 79: swap
      // 7a: aastore
      // 7b: dup_x1
      // 7c: swap
      // 7d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 80: bipush 1
      // 81: swap
      // 82: aastore
      // 83: dup_x1
      // 84: swap
      // 85: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 88: bipush 0
      // 89: swap
      // 8a: aastore
      // 8b: ldc2_w -7529078805604761306
      // 8e: lload 1
      // 8f: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: ireturn
      // 95: ldc2_w -8619306326113201277
      // 98: lload 1
      // 99: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: bipush 0
      // a0: lload 5
      // a2: bipush 0
      // a3: bipush 3
      // a4: anewarray 378
      // a7: dup_x1
      // a8: swap
      // a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ac: bipush 2
      // ad: swap
      // ae: aastore
      // af: dup_x2
      // b0: dup_x2
      // b1: pop
      // b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b5: bipush 1
      // b6: swap
      // b7: aastore
      // b8: dup_x1
      // b9: swap
      // ba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bd: bipush 0
      // be: swap
      // bf: aastore
      // c0: ldc2_w -7731343613101321734
      // c3: lload 1
      // c4: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: ireturn
   }

   private static int j(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 47089989757708
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 78245767059667
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 75638523929404
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 97057344538229
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w 5135109087764817859
      // 04b: lload 5
      // 04d: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 15
      // 054: lload 3
      // 055: lload 1
      // 056: land
      // 057: dup2
      // 058: lstore 3
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iload 15
      // 05d: ifne 0cd
      // 060: ifne 0a9
      // 063: goto 071
      // 066: ldc2_w 6446131450930070164
      // 069: lload 5
      // 06b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: bipush 4
      // 072: lload 1
      // 073: lload 7
      // 075: bipush 3
      // 076: anewarray 378
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 2
      // 080: swap
      // 081: aastore
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w 6850347901181595020
      // 096: lload 5
      // 098: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: ireturn
      // 09e: ldc2_w 6446131450930070164
      // 0a1: lload 5
      // 0a3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: ldc2_w 6721148191236031741
      // 0ac: lload 5
      // 0ae: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: pop
      // 0b4: lload 9
      // 0b6: bipush 1
      // 0b7: anewarray 378
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: ldc2_w 4779673714913686365
      // 0c6: lload 5
      // 0c8: invokedynamic s (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: ldc2_w 6652906301827275279
      // 0d0: lload 5
      // 0d2: invokedynamic r (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: goto 118
      // 0da: astore 16
      // 0dc: sipush 4356
      // 0df: lload 11
      // 0e1: bipush 5
      // 0e2: lload 3
      // 0e3: bipush 3
      // 0e4: anewarray 378
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 2
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f5: bipush 1
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w 4638337182630338937
      // 104: lload 5
      // 106: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: pop
      // 10c: ldc2_w 426808584654493903
      // 10f: lload 5
      // 111: lxor
      // 112: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: ireturn
      // 118: ldc2_w 6652906301827275279
      // 11b: lload 5
      // 11d: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: iload 15
      // 124: ifne 1f8
      // 127: lookupswitch 165 2 101 36 116 106
      // 140: ldc2_w 6446131450930070164
      // 143: lload 5
      // 145: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: lload 3
      // 14c: sipush 12459
      // 14f: ldc2_w 3753081885038676654
      // 152: lload 5
      // 154: lxor
      // 155: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: lload 13
      // 15c: bipush 3
      // 15d: anewarray 378
      // 160: dup_x2
      // 161: dup_x2
      // 162: pop
      // 163: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 166: bipush 2
      // 167: swap
      // 168: aastore
      // 169: dup_x2
      // 16a: dup_x2
      // 16b: pop
      // 16c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16f: bipush 1
      // 170: swap
      // 171: aastore
      // 172: dup_x2
      // 173: dup_x2
      // 174: pop
      // 175: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 178: bipush 0
      // 179: swap
      // 17a: aastore
      // 17b: ldc2_w 4944309628452934695
      // 17e: lload 5
      // 180: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: ireturn
      // 186: ldc2_w 6446131450930070164
      // 189: lload 5
      // 18b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: lload 3
      // 192: sipush 13285
      // 195: ldc2_w 8905018233713789423
      // 198: lload 5
      // 19a: lxor
      // 19b: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: lload 13
      // 1a2: bipush 3
      // 1a3: anewarray 378
      // 1a6: dup_x2
      // 1a7: dup_x2
      // 1a8: pop
      // 1a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ac: bipush 2
      // 1ad: swap
      // 1ae: aastore
      // 1af: dup_x2
      // 1b0: dup_x2
      // 1b1: pop
      // 1b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b5: bipush 1
      // 1b6: swap
      // 1b7: aastore
      // 1b8: dup_x2
      // 1b9: dup_x2
      // 1ba: pop
      // 1bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1be: bipush 0
      // 1bf: swap
      // 1c0: aastore
      // 1c1: ldc2_w 4944309628452934695
      // 1c4: lload 5
      // 1c6: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: ireturn
      // 1cc: bipush 5
      // 1cd: lload 3
      // 1ce: lload 7
      // 1d0: bipush 3
      // 1d1: anewarray 378
      // 1d4: dup_x2
      // 1d5: dup_x2
      // 1d6: pop
      // 1d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1da: bipush 2
      // 1db: swap
      // 1dc: aastore
      // 1dd: dup_x2
      // 1de: dup_x2
      // 1df: pop
      // 1e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e3: bipush 1
      // 1e4: swap
      // 1e5: aastore
      // 1e6: dup_x1
      // 1e7: swap
      // 1e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1eb: bipush 0
      // 1ec: swap
      // 1ed: aastore
      // 1ee: ldc2_w 6850347901181595020
      // 1f1: lload 5
      // 1f3: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: ireturn
   }

   public static t6 P(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: pop
      // 00c: getstatic com/zelix/e_.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 22989832052377
      // 017: lxor
      // 018: lstore 3
      // 019: dup2
      // 01a: ldc2_w 97388714465073
      // 01d: lxor
      // 01e: lstore 5
      // 020: dup2
      // 021: ldc2_w 96969381422726
      // 024: lxor
      // 025: lstore 7
      // 027: dup2
      // 028: ldc2_w 130881590589005
      // 02b: lxor
      // 02c: lstore 9
      // 02e: dup2
      // 02f: ldc2_w 10278098132650
      // 032: lxor
      // 033: lstore 11
      // 035: dup2
      // 036: ldc2_w 73524433725951
      // 039: lxor
      // 03a: lstore 13
      // 03c: dup2
      // 03d: ldc2_w 109513479095777
      // 040: lxor
      // 041: lstore 15
      // 043: dup2
      // 044: ldc2_w 63385850156507
      // 047: lxor
      // 048: lstore 17
      // 04a: dup2
      // 04b: ldc2_w 41029204810074
      // 04e: lxor
      // 04f: lstore 19
      // 051: dup2
      // 052: ldc2_w 101843779395923
      // 055: lxor
      // 056: lstore 21
      // 058: dup2
      // 059: ldc2_w 109975141756621
      // 05c: lxor
      // 05d: lstore 23
      // 05f: dup2
      // 060: ldc2_w 94378920185269
      // 063: lxor
      // 064: lstore 25
      // 066: dup2
      // 067: ldc2_w 46102837233628
      // 06a: lxor
      // 06b: lstore 27
      // 06d: dup2
      // 06e: ldc2_w 76778459365839
      // 071: lxor
      // 072: lstore 29
      // 074: dup2
      // 075: ldc2_w 60573926717445
      // 078: lxor
      // 079: lstore 31
      // 07b: pop2
      // 07c: ldc2_w -4589031950221613201
      // 07f: lload 1
      // 080: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aconst_null
      // 086: astore 34
      // 088: bipush 0
      // 089: istore 36
      // 08b: istore 33
      // 08d: ldc2_w -4578907259966219825
      // 090: lload 1
      // 091: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: pop
      // 097: lload 7
      // 099: bipush 1
      // 09a: anewarray 378
      // 09d: dup_x2
      // 09e: dup_x2
      // 09f: pop
      // 0a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a3: bipush 0
      // 0a4: swap
      // 0a5: aastore
      // 0a6: ldc2_w -2369613002401508561
      // 0a9: lload 1
      // 0aa: invokedynamic q (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: ldc2_w -4512048581951305923
      // 0b2: lload 1
      // 0b3: invokedynamic p (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: goto 0f1
      // 0bb: astore 37
      // 0bd: bipush 0
      // 0be: ldc2_w -2874130708142223131
      // 0c1: lload 1
      // 0c2: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: lload 31
      // 0c9: bipush 1
      // 0ca: anewarray 378
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w -2426253099815377296
      // 0d9: lload 1
      // 0da: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/t6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: astore 35
      // 0e1: aload 35
      // 0e3: aload 34
      // 0e5: ldc2_w -2762380681146697936
      // 0e8: lload 1
      // 0e9: invokedynamic r (Ljava/lang/Object;Lcom/zelix/t6;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: aload 35
      // 0f0: areturn
      // 0f1: ldc2_w -2329810109959913585
      // 0f4: lload 1
      // 0f5: invokedynamic h (JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: ldc2_w -4435008450538249054
      // 0fd: lload 1
      // 0fe: invokedynamic p (Ljava/lang/StringBuilder;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: ldc2_w -4435008450538249054
      // 106: lload 1
      // 107: invokedynamic h (JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: bipush 0
      // 10d: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 110: bipush 0
      // 111: ldc2_w -4042444113925802502
      // 114: lload 1
      // 115: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: ldc2_w -4107728869683689437
      // 11d: lload 1
      // 11e: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: tableswitch 946 0 4 33 325 508 692 888
      // 144: ldc2_w -4578907259966219825
      // 147: lload 1
      // 148: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: pop
      // 14e: lload 5
      // 150: bipush 0
      // 151: bipush 2
      // 152: anewarray 378
      // 155: dup_x1
      // 156: swap
      // 157: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15a: bipush 1
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x2
      // 15e: dup_x2
      // 15f: pop
      // 160: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: ldc2_w -2620328265188178237
      // 169: lload 1
      // 16a: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: ldc2_w -4512048581951305923
      // 172: lload 1
      // 173: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: sipush 4641
      // 17b: ldc2_w 1438175907478243041
      // 17e: lload 1
      // 17f: lxor
      // 180: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: if_icmpgt 20d
      // 188: sipush 3355
      // 18b: ldc2_w 4834461995485375026
      // 18e: lload 1
      // 18f: lxor
      // 190: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: lconst_1
      // 196: ldc2_w -4512048581951305923
      // 199: lload 1
      // 19a: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: lshl
      // 1a0: land
      // 1a1: lconst_0
      // 1a2: lcmp
      // 1a3: lload 1
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: iflt 25f
      // 1a9: iload 33
      // 1ab: ifeq 25b
      // 1ae: iload 33
      // 1b0: ifeq 1ff
      // 1b3: goto 1c0
      // 1b6: ldc2_w -4303357846012387418
      // 1b9: lload 1
      // 1ba: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: athrow
      // 1c0: ifeq 20d
      // 1c3: goto 1d0
      // 1c6: ldc2_w -4303357846012387418
      // 1c9: lload 1
      // 1ca: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: athrow
      // 1d0: ldc2_w -4578907259966219825
      // 1d3: lload 1
      // 1d4: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: pop
      // 1da: lload 7
      // 1dc: bipush 1
      // 1dd: anewarray 378
      // 1e0: dup_x2
      // 1e1: dup_x2
      // 1e2: pop
      // 1e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e6: bipush 0
      // 1e7: swap
      // 1e8: aastore
      // 1e9: ldc2_w -2369613002401508561
      // 1ec: lload 1
      // 1ed: invokedynamic q (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: goto 1ff
      // 1f5: ldc2_w -4303357846012387418
      // 1f8: lload 1
      // 1f9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: athrow
      // 1ff: ldc2_w -4512048581951305923
      // 202: lload 1
      // 203: invokedynamic p (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: iload 33
      // 20a: ifne 16f
      // 20d: lload 1
      // 20e: lconst_0
      // 20f: lcmp
      // 210: ifle 25d
      // 213: goto 223
      // 216: astore 37
      // 218: iload 33
      // 21a: lload 1
      // 21b: lconst_0
      // 21c: lcmp
      // 21d: ifle 23a
      // 220: ifne 08d
      // 223: sipush 8216
      // 226: ldc2_w 1319416095033799830
      // 229: lload 1
      // 22a: lxor
      // 22b: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: ldc2_w -2874130708142223131
      // 233: lload 1
      // 234: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: bipush 0
      // 23a: ldc2_w -2753053275054675056
      // 23d: lload 1
      // 23e: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: lload 9
      // 245: bipush 1
      // 246: anewarray 378
      // 249: dup_x2
      // 24a: dup_x2
      // 24b: pop
      // 24c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24f: bipush 0
      // 250: swap
      // 251: aastore
      // 252: ldc2_w -2862802161482599444
      // 255: lload 1
      // 256: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: istore 36
      // 25d: iload 33
      // 25f: lload 1
      // 260: lconst_0
      // 261: lcmp
      // 262: iflt 2aa
      // 265: ifne 4d5
      // 268: sipush 8216
      // 26b: ldc2_w 1319416095033799830
      // 26e: lload 1
      // 26f: lxor
      // 270: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: ldc2_w -2874130708142223131
      // 278: lload 1
      // 279: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: bipush 0
      // 27f: ldc2_w -2753053275054675056
      // 282: lload 1
      // 283: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: lload 3
      // 289: bipush 1
      // 28a: anewarray 378
      // 28d: dup_x2
      // 28e: dup_x2
      // 28f: pop
      // 290: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 293: bipush 0
      // 294: swap
      // 295: aastore
      // 296: ldc2_w -4159840529451054178
      // 299: lload 1
      // 29a: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: istore 36
      // 2a1: ldc2_w -2753053275054675056
      // 2a4: lload 1
      // 2a5: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: iload 33
      // 2ac: ifeq 4de
      // 2af: ifne 4d5
      // 2b2: goto 2bf
      // 2b5: ldc2_w -4303357846012387418
      // 2b8: lload 1
      // 2b9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: athrow
      // 2bf: ldc2_w -2874130708142223131
      // 2c2: lload 1
      // 2c3: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: sipush 12227
      // 2cb: ldc2_w 454641533514070814
      // 2ce: lload 1
      // 2cf: lxor
      // 2d0: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: iload 33
      // 2d7: ifeq 503
      // 2da: goto 2e7
      // 2dd: ldc2_w -4303357846012387418
      // 2e0: lload 1
      // 2e1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e6: athrow
      // 2e7: if_icmple 4d5
      // 2ea: goto 2f7
      // 2ed: ldc2_w -4303357846012387418
      // 2f0: lload 1
      // 2f1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: athrow
      // 2f7: sipush 12227
      // 2fa: ldc2_w 454641533514070814
      // 2fd: lload 1
      // 2fe: lxor
      // 2ff: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: ldc2_w -2874130708142223131
      // 307: lload 1
      // 308: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: iload 33
      // 30f: ifne 4d5
      // 312: goto 31f
      // 315: ldc2_w -4303357846012387418
      // 318: lload 1
      // 319: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: athrow
      // 31f: sipush 8216
      // 322: ldc2_w 1319416095033799830
      // 325: lload 1
      // 326: lxor
      // 327: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32c: ldc2_w -2874130708142223131
      // 32f: lload 1
      // 330: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: bipush 0
      // 336: ldc2_w -2753053275054675056
      // 339: lload 1
      // 33a: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: lload 17
      // 341: bipush 1
      // 342: anewarray 378
      // 345: dup_x2
      // 346: dup_x2
      // 347: pop
      // 348: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 34b: bipush 0
      // 34c: swap
      // 34d: aastore
      // 34e: ldc2_w -2735589850049002058
      // 351: lload 1
      // 352: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: istore 36
      // 359: ldc2_w -2753053275054675056
      // 35c: lload 1
      // 35d: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: iload 33
      // 364: ifeq 4de
      // 367: ifne 4d5
      // 36a: goto 377
      // 36d: ldc2_w -4303357846012387418
      // 370: lload 1
      // 371: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: athrow
      // 377: ldc2_w -2874130708142223131
      // 37a: lload 1
      // 37b: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: sipush 12227
      // 383: ldc2_w 454641533514070814
      // 386: lload 1
      // 387: lxor
      // 388: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38d: iload 33
      // 38f: ifeq 503
      // 392: goto 39f
      // 395: ldc2_w -4303357846012387418
      // 398: lload 1
      // 399: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39e: athrow
      // 39f: if_icmple 4d5
      // 3a2: goto 3af
      // 3a5: ldc2_w -4303357846012387418
      // 3a8: lload 1
      // 3a9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ae: athrow
      // 3af: sipush 12227
      // 3b2: ldc2_w 454641533514070814
      // 3b5: lload 1
      // 3b6: lxor
      // 3b7: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bc: ldc2_w -2874130708142223131
      // 3bf: lload 1
      // 3c0: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c5: iload 33
      // 3c7: ifne 4d5
      // 3ca: goto 3d7
      // 3cd: ldc2_w -4303357846012387418
      // 3d0: lload 1
      // 3d1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d6: athrow
      // 3d7: sipush 8216
      // 3da: ldc2_w 1319416095033799830
      // 3dd: lload 1
      // 3de: lxor
      // 3df: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e4: ldc2_w -2874130708142223131
      // 3e7: lload 1
      // 3e8: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ed: bipush 0
      // 3ee: ldc2_w -2753053275054675056
      // 3f1: lload 1
      // 3f2: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f7: lload 23
      // 3f9: bipush 1
      // 3fa: anewarray 378
      // 3fd: dup_x2
      // 3fe: dup_x2
      // 3ff: pop
      // 400: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 403: bipush 0
      // 404: swap
      // 405: aastore
      // 406: ldc2_w -4102913384888813746
      // 409: lload 1
      // 40a: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40f: istore 36
      // 411: ldc2_w -2753053275054675056
      // 414: lload 1
      // 415: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41a: iload 33
      // 41c: lload 1
      // 41d: lconst_0
      // 41e: lcmp
      // 41f: iflt 4e0
      // 422: ifeq 4de
      // 425: ifne 4d5
      // 428: goto 435
      // 42b: ldc2_w -4303357846012387418
      // 42e: lload 1
      // 42f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 434: athrow
      // 435: ldc2_w -2874130708142223131
      // 438: lload 1
      // 439: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43e: sipush 12227
      // 441: ldc2_w 454641533514070814
      // 444: lload 1
      // 445: lxor
      // 446: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: lload 1
      // 44c: lconst_0
      // 44d: lcmp
      // 44e: ifle 503
      // 451: iload 33
      // 453: ifeq 503
      // 456: goto 463
      // 459: ldc2_w -4303357846012387418
      // 45c: lload 1
      // 45d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 462: athrow
      // 463: if_icmple 4d5
      // 466: goto 473
      // 469: ldc2_w -4303357846012387418
      // 46c: lload 1
      // 46d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 472: athrow
      // 473: sipush 12227
      // 476: ldc2_w 454641533514070814
      // 479: lload 1
      // 47a: lxor
      // 47b: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 480: ldc2_w -2874130708142223131
      // 483: lload 1
      // 484: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 489: iload 33
      // 48b: ifne 4d5
      // 48e: goto 49b
      // 491: ldc2_w -4303357846012387418
      // 494: lload 1
      // 495: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49a: athrow
      // 49b: sipush 8216
      // 49e: ldc2_w 1319416095033799830
      // 4a1: lload 1
      // 4a2: lxor
      // 4a3: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a8: ldc2_w -2874130708142223131
      // 4ab: lload 1
      // 4ac: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b1: bipush 0
      // 4b2: ldc2_w -2753053275054675056
      // 4b5: lload 1
      // 4b6: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bb: lload 19
      // 4bd: bipush 1
      // 4be: anewarray 378
      // 4c1: dup_x2
      // 4c2: dup_x2
      // 4c3: pop
      // 4c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c7: bipush 0
      // 4c8: swap
      // 4c9: aastore
      // 4ca: ldc2_w -2863131288075248666
      // 4cd: lload 1
      // 4ce: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d3: istore 36
      // 4d5: ldc2_w -2874130708142223131
      // 4d8: lload 1
      // 4d9: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4de: iload 33
      // 4e0: lload 1
      // 4e1: lconst_0
      // 4e2: lcmp
      // 4e3: ifle 4f6
      // 4e6: ifeq 8fd
      // 4e9: sipush 8216
      // 4ec: ldc2_w 1319416095033799830
      // 4ef: lload 1
      // 4f0: lxor
      // 4f1: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f6: goto 503
      // 4f9: ldc2_w -4303357846012387418
      // 4fc: lload 1
      // 4fd: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 502: athrow
      // 503: lload 1
      // 504: lconst_0
      // 505: lcmp
      // 506: ifle 519
      // 509: if_icmpeq 8db
      // 50c: ldc2_w -2753053275054675056
      // 50f: lload 1
      // 510: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 515: bipush 1
      // 516: iadd
      // 517: iload 33
      // 519: lload 1
      // 51a: lconst_0
      // 51b: lcmp
      // 51c: iflt 5c7
      // 51f: ifeq 5c5
      // 522: goto 52f
      // 525: ldc2_w -4303357846012387418
      // 528: lload 1
      // 529: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52e: athrow
      // 52f: iload 36
      // 531: if_icmpge 588
      // 534: goto 541
      // 537: ldc2_w -4303357846012387418
      // 53a: lload 1
      // 53b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 540: athrow
      // 541: ldc2_w -4578907259966219825
      // 544: lload 1
      // 545: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54a: pop
      // 54b: iload 36
      // 54d: ldc2_w -2753053275054675056
      // 550: lload 1
      // 551: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 556: isub
      // 557: bipush 1
      // 558: isub
      // 559: lload 5
      // 55b: dup2_x1
      // 55c: pop2
      // 55d: bipush 2
      // 55e: anewarray 378
      // 561: dup_x1
      // 562: swap
      // 563: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 566: bipush 1
      // 567: swap
      // 568: aastore
      // 569: dup_x2
      // 56a: dup_x2
      // 56b: pop
      // 56c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 56f: bipush 0
      // 570: swap
      // 571: aastore
      // 572: ldc2_w -2620328265188178237
      // 575: lload 1
      // 576: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57b: goto 588
      // 57e: ldc2_w -4303357846012387418
      // 581: lload 1
      // 582: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 587: athrow
      // 588: ldc2_w -4316129813216360346
      // 58b: lload 1
      // 58c: invokedynamic h (JJ)[J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 591: ldc2_w -2874130708142223131
      // 594: lload 1
      // 595: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59a: sipush 4356
      // 59d: ldc2_w 426839851561158141
      // 5a0: lload 1
      // 5a1: lxor
      // 5a2: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a7: ishr
      // 5a8: laload
      // 5a9: lconst_1
      // 5aa: ldc2_w -2874130708142223131
      // 5ad: lload 1
      // 5ae: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b3: sipush 1530
      // 5b6: ldc2_w 382236473389650194
      // 5b9: lload 1
      // 5ba: lxor
      // 5bb: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c0: iand
      // 5c1: lshl
      // 5c2: land
      // 5c3: lconst_0
      // 5c4: lcmp
      // 5c5: iload 33
      // 5c7: lload 1
      // 5c8: lconst_0
      // 5c9: lcmp
      // 5ca: iflt 6a1
      // 5cd: ifeq 69f
      // 5d0: ifeq 662
      // 5d3: goto 5e0
      // 5d6: ldc2_w -4303357846012387418
      // 5d9: lload 1
      // 5da: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5df: athrow
      // 5e0: lload 31
      // 5e2: bipush 1
      // 5e3: anewarray 378
      // 5e6: dup_x2
      // 5e7: dup_x2
      // 5e8: pop
      // 5e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5ec: bipush 0
      // 5ed: swap
      // 5ee: aastore
      // 5ef: ldc2_w -2426253099815377296
      // 5f2: lload 1
      // 5f3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/t6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f8: astore 35
      // 5fa: lload 1
      // 5fb: lconst_0
      // 5fc: lcmp
      // 5fd: ifle 612
      // 600: aload 35
      // 602: iload 33
      // 604: ifeq 661
      // 607: aload 34
      // 609: ldc2_w -2762380681146697936
      // 60c: lload 1
      // 60d: invokedynamic r (Ljava/lang/Object;Lcom/zelix/t6;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 612: ldc2_w -2425413989264157747
      // 615: lload 1
      // 616: invokedynamic h (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61b: ldc2_w -2874130708142223131
      // 61e: lload 1
      // 61f: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 624: iaload
      // 625: bipush -1
      // 626: if_icmpeq 65f
      // 629: goto 636
      // 62c: ldc2_w -4303357846012387418
      // 62f: lload 1
      // 630: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 635: athrow
      // 636: ldc2_w -2425413989264157747
      // 639: lload 1
      // 63a: invokedynamic h (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63f: ldc2_w -2874130708142223131
      // 642: lload 1
      // 643: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 648: iaload
      // 649: ldc2_w -4107728869683689437
      // 64c: lload 1
      // 64d: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 652: goto 65f
      // 655: ldc2_w -4303357846012387418
      // 658: lload 1
      // 659: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65e: athrow
      // 65f: aload 35
      // 661: areturn
      // 662: ldc2_w -2427794810184423645
      // 665: lload 1
      // 666: invokedynamic h (JJ)[J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66b: ldc2_w -2874130708142223131
      // 66e: lload 1
      // 66f: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 674: sipush 4356
      // 677: ldc2_w 426839851561158141
      // 67a: lload 1
      // 67b: lxor
      // 67c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 681: ishr
      // 682: laload
      // 683: lconst_1
      // 684: ldc2_w -2874130708142223131
      // 687: lload 1
      // 688: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68d: sipush 1530
      // 690: ldc2_w 382236473389650194
      // 693: lload 1
      // 694: lxor
      // 695: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69a: iand
      // 69b: lshl
      // 69c: land
      // 69d: lconst_0
      // 69e: lcmp
      // 69f: iload 33
      // 6a1: lload 1
      // 6a2: lconst_0
      // 6a3: lcmp
      // 6a4: iflt 84f
      // 6a7: ifeq 84d
      // 6aa: ifeq 81c
      // 6ad: goto 6ba
      // 6b0: ldc2_w -4303357846012387418
      // 6b3: lload 1
      // 6b4: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b9: athrow
      // 6ba: ldc2_w -4243522348277966190
      // 6bd: lload 1
      // 6be: invokedynamic h (JJ)[J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c3: ldc2_w -2874130708142223131
      // 6c6: lload 1
      // 6c7: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6cc: sipush 4356
      // 6cf: ldc2_w 426839851561158141
      // 6d2: lload 1
      // 6d3: lxor
      // 6d4: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d9: ishr
      // 6da: laload
      // 6db: lconst_1
      // 6dc: ldc2_w -2874130708142223131
      // 6df: lload 1
      // 6e0: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e5: sipush 1530
      // 6e8: ldc2_w 382236473389650194
      // 6eb: lload 1
      // 6ec: lxor
      // 6ed: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f2: iand
      // 6f3: lshl
      // 6f4: land
      // 6f5: lload 1
      // 6f6: lconst_0
      // 6f7: lcmp
      // 6f8: iflt 7a3
      // 6fb: lconst_0
      // 6fc: lcmp
      // 6fd: ifeq 7a1
      // 700: goto 70d
      // 703: ldc2_w -4303357846012387418
      // 706: lload 1
      // 707: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70c: athrow
      // 70d: lload 31
      // 70f: bipush 1
      // 710: anewarray 378
      // 713: dup_x2
      // 714: dup_x2
      // 715: pop
      // 716: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 719: bipush 0
      // 71a: swap
      // 71b: aastore
      // 71c: ldc2_w -2426253099815377296
      // 71f: lload 1
      // 720: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/t6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 725: astore 35
      // 727: aload 34
      // 729: iload 33
      // 72b: ifeq 775
      // 72e: ifnonnull 74d
      // 731: goto 73e
      // 734: ldc2_w -4303357846012387418
      // 737: lload 1
      // 738: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73d: athrow
      // 73e: aload 35
      // 740: astore 34
      // 742: iload 33
      // 744: lload 1
      // 745: lconst_0
      // 746: lcmp
      // 747: ifle 798
      // 74a: ifne 777
      // 74d: aload 35
      // 74f: aload 34
      // 751: ldc2_w -2762380681146697936
      // 754: lload 1
      // 755: invokedynamic r (Ljava/lang/Object;Lcom/zelix/t6;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75a: aload 34
      // 75c: aload 35
      // 75e: dup_x1
      // 75f: ldc2_w -2840225229590800874
      // 762: lload 1
      // 763: invokedynamic r (Ljava/lang/Object;Lcom/zelix/t6;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 768: goto 775
      // 76b: ldc2_w -4303357846012387418
      // 76e: lload 1
      // 76f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 774: athrow
      // 775: astore 34
      // 777: lload 13
      // 779: aload 35
      // 77b: bipush 2
      // 77c: anewarray 378
      // 77f: dup_x1
      // 780: swap
      // 781: bipush 1
      // 782: swap
      // 783: aastore
      // 784: dup_x2
      // 785: dup_x2
      // 786: pop
      // 787: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 78a: bipush 0
      // 78b: swap
      // 78c: aastore
      // 78d: ldc2_w -2668652341149058472
      // 790: lload 1
      // 791: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 796: iload 33
      // 798: lload 1
      // 799: lconst_0
      // 79a: lcmp
      // 79b: ifle 7df
      // 79e: ifne 7cc
      // 7a1: lload 13
      // 7a3: aconst_null
      // 7a4: bipush 2
      // 7a5: anewarray 378
      // 7a8: dup_x1
      // 7a9: swap
      // 7aa: bipush 1
      // 7ab: swap
      // 7ac: aastore
      // 7ad: dup_x2
      // 7ae: dup_x2
      // 7af: pop
      // 7b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b3: bipush 0
      // 7b4: swap
      // 7b5: aastore
      // 7b6: ldc2_w -2668652341149058472
      // 7b9: lload 1
      // 7ba: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7bf: goto 7cc
      // 7c2: ldc2_w -4303357846012387418
      // 7c5: lload 1
      // 7c6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7cb: athrow
      // 7cc: ldc2_w -2425413989264157747
      // 7cf: lload 1
      // 7d0: invokedynamic h (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d5: ldc2_w -2874130708142223131
      // 7d8: lload 1
      // 7d9: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7de: iaload
      // 7df: lload 1
      // 7e0: lconst_0
      // 7e1: lcmp
      // 7e2: ifle 819
      // 7e5: iload 33
      // 7e7: ifeq 80e
      // 7ea: bipush -1
      // 7eb: if_icmpeq 08d
      // 7ee: goto 7fb
      // 7f1: ldc2_w -4303357846012387418
      // 7f4: lload 1
      // 7f5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7fa: athrow
      // 7fb: ldc2_w -2425413989264157747
      // 7fe: lload 1
      // 7ff: invokedynamic h (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 804: ldc2_w -2874130708142223131
      // 807: lload 1
      // 808: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80d: iaload
      // 80e: ldc2_w -4107728869683689437
      // 811: lload 1
      // 812: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 817: iload 33
      // 819: ifne 08d
      // 81c: lload 21
      // 81e: bipush 1
      // 81f: anewarray 378
      // 822: dup_x2
      // 823: dup_x2
      // 824: pop
      // 825: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 828: bipush 0
      // 829: swap
      // 82a: aastore
      // 82b: ldc2_w -2776430179810591058
      // 82e: lload 1
      // 82f: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 834: ldc2_w -2425413989264157747
      // 837: lload 1
      // 838: invokedynamic h (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83d: ldc2_w -2874130708142223131
      // 840: lload 1
      // 841: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 846: lload 1
      // 847: lconst_0
      // 848: lcmp
      // 849: iflt 87b
      // 84c: iaload
      // 84d: iload 33
      // 84f: lload 1
      // 850: lconst_0
      // 851: lcmp
      // 852: ifle 859
      // 855: ifeq 8cd
      // 858: bipush -1
      // 859: if_icmpeq 892
      // 85c: goto 869
      // 85f: ldc2_w -4303357846012387418
      // 862: lload 1
      // 863: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 868: athrow
      // 869: ldc2_w -2425413989264157747
      // 86c: lload 1
      // 86d: invokedynamic h (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 872: ldc2_w -2874130708142223131
      // 875: lload 1
      // 876: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87b: iaload
      // 87c: ldc2_w -4107728869683689437
      // 87f: lload 1
      // 880: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 885: goto 892
      // 888: ldc2_w -4303357846012387418
      // 88b: lload 1
      // 88c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 891: athrow
      // 892: bipush 0
      // 893: istore 36
      // 895: sipush 8216
      // 898: ldc2_w 1319416095033799830
      // 89b: lload 1
      // 89c: lxor
      // 89d: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a2: ldc2_w -2874130708142223131
      // 8a5: lload 1
      // 8a6: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ab: ldc2_w -4578907259966219825
      // 8ae: lload 1
      // 8af: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b4: pop
      // 8b5: lload 15
      // 8b7: bipush 1
      // 8b8: anewarray 378
      // 8bb: dup_x2
      // 8bc: dup_x2
      // 8bd: pop
      // 8be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8c1: bipush 0
      // 8c2: swap
      // 8c3: aastore
      // 8c4: ldc2_w -2348931377865413009
      // 8c7: lload 1
      // 8c8: invokedynamic q (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8cd: ldc2_w -4512048581951305923
      // 8d0: lload 1
      // 8d1: invokedynamic p (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d6: goto 11a
      // 8d9: astore 37
      // 8db: ldc2_w -4578907259966219825
      // 8de: lload 1
      // 8df: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e4: pop
      // 8e5: lload 11
      // 8e7: bipush 1
      // 8e8: anewarray 378
      // 8eb: dup_x2
      // 8ec: dup_x2
      // 8ed: pop
      // 8ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8f1: bipush 0
      // 8f2: swap
      // 8f3: aastore
      // 8f4: ldc2_w -4516523463498248425
      // 8f7: lload 1
      // 8f8: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8fd: istore 37
      // 8ff: ldc2_w -4578907259966219825
      // 902: lload 1
      // 903: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 908: pop
      // 909: lload 29
      // 90b: bipush 1
      // 90c: anewarray 378
      // 90f: dup_x2
      // 910: dup_x2
      // 911: pop
      // 912: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 915: bipush 0
      // 916: swap
      // 917: aastore
      // 918: ldc2_w -2711876947839594352
      // 91b: lload 1
      // 91c: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 921: istore 38
      // 923: aconst_null
      // 924: astore 39
      // 926: bipush 0
      // 927: istore 40
      // 929: ldc2_w -4578907259966219825
      // 92c: lload 1
      // 92d: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 932: pop
      // 933: lload 15
      // 935: bipush 1
      // 936: anewarray 378
      // 939: dup_x2
      // 93a: dup_x2
      // 93b: pop
      // 93c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93f: bipush 0
      // 940: swap
      // 941: aastore
      // 942: ldc2_w -2348931377865413009
      // 945: lload 1
      // 946: invokedynamic q (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94b: pop
      // 94c: ldc2_w -4578907259966219825
      // 94f: lload 1
      // 950: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 955: pop
      // 956: lload 5
      // 958: bipush 1
      // 959: bipush 2
      // 95a: anewarray 378
      // 95d: dup_x1
      // 95e: swap
      // 95f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 962: bipush 1
      // 963: swap
      // 964: aastore
      // 965: dup_x2
      // 966: dup_x2
      // 967: pop
      // 968: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 96b: bipush 0
      // 96c: swap
      // 96d: aastore
      // 96e: ldc2_w -2620328265188178237
      // 971: lload 1
      // 972: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 977: goto a6d
      // 97a: astore 41
      // 97c: bipush 1
      // 97d: istore 40
      // 97f: iload 33
      // 981: lload 1
      // 982: lconst_0
      // 983: lcmp
      // 984: iflt 98c
      // 987: ifeq 9b6
      // 98a: iload 36
      // 98c: bipush 1
      // 98d: if_icmpgt 9ac
      // 990: goto 99d
      // 993: ldc2_w -4303357846012387418
      // 996: lload 1
      // 997: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99c: athrow
      // 99d: ldc ""
      // 99f: goto 9ce
      // 9a2: ldc2_w -4303357846012387418
      // 9a5: lload 1
      // 9a6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9ab: athrow
      // 9ac: ldc2_w -4578907259966219825
      // 9af: lload 1
      // 9b0: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b5: pop
      // 9b6: lload 27
      // 9b8: bipush 1
      // 9b9: anewarray 378
      // 9bc: dup_x2
      // 9bd: dup_x2
      // 9be: pop
      // 9bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9c2: bipush 0
      // 9c3: swap
      // 9c4: aastore
      // 9c5: ldc2_w -2390680259569902310
      // 9c8: lload 1
      // 9c9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9ce: astore 39
      // 9d0: ldc2_w -4512048581951305923
      // 9d3: lload 1
      // 9d4: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d9: iload 33
      // 9db: lload 1
      // 9dc: lconst_0
      // 9dd: lcmp
      // 9de: ifle 9f1
      // 9e1: ifeq a50
      // 9e4: sipush 12227
      // 9e7: ldc2_w 454641533514070814
      // 9ea: lload 1
      // 9eb: lxor
      // 9ec: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f1: if_icmpeq a3f
      // 9f4: goto a01
      // 9f7: ldc2_w -4303357846012387418
      // 9fa: lload 1
      // 9fb: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a00: athrow
      // a01: ldc2_w -4512048581951305923
      // a04: lload 1
      // a05: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0a: lload 1
      // a0b: lconst_0
      // a0c: lcmp
      // a0d: iflt a54
      // a10: iload 33
      // a12: ifeq a50
      // a15: goto a22
      // a18: ldc2_w -4303357846012387418
      // a1b: lload 1
      // a1c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a21: athrow
      // a22: sipush 32673
      // a25: ldc2_w 3350967781617003335
      // a28: lload 1
      // a29: lxor
      // a2a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2f: if_icmpne a5d
      // a32: goto a3f
      // a35: ldc2_w -4303357846012387418
      // a38: lload 1
      // a39: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3e: athrow
      // a3f: iinc 37 1
      // a42: bipush 0
      // a43: goto a50
      // a46: ldc2_w -4303357846012387418
      // a49: lload 1
      // a4a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4f: athrow
      // a50: istore 38
      // a52: iload 33
      // a54: lload 1
      // a55: lconst_0
      // a56: lcmp
      // a57: ifle a6f
      // a5a: ifne a6d
      // a5d: iinc 38 1
      // a60: goto a6d
      // a63: ldc2_w -4303357846012387418
      // a66: lload 1
      // a67: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6c: athrow
      // a6d: iload 40
      // a6f: iload 33
      // a71: lload 1
      // a72: lconst_0
      // a73: lcmp
      // a74: ifle add
      // a77: ifeq adc
      // a7a: ifne b13
      // a7d: goto a8a
      // a80: ldc2_w -4303357846012387418
      // a83: lload 1
      // a84: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a89: athrow
      // a8a: ldc2_w -4578907259966219825
      // a8d: lload 1
      // a8e: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a93: pop
      // a94: lload 5
      // a96: bipush 1
      // a97: bipush 2
      // a98: anewarray 378
      // a9b: dup_x1
      // a9c: swap
      // a9d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // aa0: bipush 1
      // aa1: swap
      // aa2: aastore
      // aa3: dup_x2
      // aa4: dup_x2
      // aa5: pop
      // aa6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // aa9: bipush 0
      // aaa: swap
      // aab: aastore
      // aac: ldc2_w -2620328265188178237
      // aaf: lload 1
      // ab0: lload 1
      // ab1: lconst_0
      // ab2: lcmp
      // ab3: ifle b0c
      // ab6: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // abb: iload 33
      // abd: ifeq af9
      // ac0: goto acd
      // ac3: ldc2_w -4303357846012387418
      // ac6: lload 1
      // ac7: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // acc: athrow
      // acd: iload 36
      // acf: goto adc
      // ad2: ldc2_w -4303357846012387418
      // ad5: lload 1
      // ad6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // adb: athrow
      // adc: bipush 1
      // add: if_icmpgt aef
      // ae0: ldc ""
      // ae2: goto b11
      // ae5: ldc2_w -4303357846012387418
      // ae8: lload 1
      // ae9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aee: athrow
      // aef: ldc2_w -4578907259966219825
      // af2: lload 1
      // af3: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af8: pop
      // af9: lload 27
      // afb: bipush 1
      // afc: anewarray 378
      // aff: dup_x2
      // b00: dup_x2
      // b01: pop
      // b02: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b05: bipush 0
      // b06: swap
      // b07: aastore
      // b08: ldc2_w -2390680259569902310
      // b0b: lload 1
      // b0c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b11: astore 39
      // b13: new com/zelix/ek
      // b16: dup
      // b17: iload 40
      // b19: ldc2_w -4107728869683689437
      // b1c: lload 1
      // b1d: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b22: iload 37
      // b24: iload 38
      // b26: aload 39
      // b28: ldc2_w -4512048581951305923
      // b2b: lload 1
      // b2c: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b31: bipush 0
      // b32: lload 25
      // b34: invokespecial com/zelix/ek.<init> (ZIIILjava/lang/String;CIJ)V
      // b37: athrow
   }

   private static int N(Object[] param0) {
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
      // 00a: istore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 2
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Integer
      // 01b: invokevirtual java/lang/Integer.intValue ()I
      // 01e: istore 4
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 2
      // 025: lxor
      // 026: lstore 2
      // 027: lload 2
      // 028: dup2
      // 029: ldc2_w 78434303277725
      // 02c: lxor
      // 02d: lstore 5
      // 02f: dup2
      // 030: ldc2_w 98965202701628
      // 033: lxor
      // 034: lstore 7
      // 036: pop2
      // 037: bipush 0
      // 038: istore 10
      // 03a: sipush 2355
      // 03d: ldc2_w 148865323495789850
      // 040: lload 2
      // 041: lxor
      // 042: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: ldc2_w 5809400117431984377
      // 04a: lload 2
      // 04b: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: ldc2_w 5227907694376710066
      // 053: lload 2
      // 054: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: bipush 1
      // 05a: istore 11
      // 05c: ldc2_w 5745173182841931274
      // 05f: lload 2
      // 060: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: bipush 0
      // 066: iload 1
      // 067: iastore
      // 068: sipush 24335
      // 06b: ldc2_w 563374299151188739
      // 06e: lload 2
      // 06f: lxor
      // 070: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: istore 12
      // 077: istore 9
      // 079: ldc2_w 5859360890705681980
      // 07c: lload 2
      // 07d: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: bipush 1
      // 083: iadd
      // 084: dup
      // 085: ldc2_w 5859360890705681980
      // 088: lload 2
      // 089: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: sipush 8216
      // 091: ldc2_w 1319475983910812747
      // 094: lload 2
      // 095: lxor
      // 096: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: if_icmpne 0e1
      // 09e: iload 9
      // 0a0: lload 2
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: ifle 0ea
      // 0a6: lload 2
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: ifle 332
      // 0ac: ifeq 329
      // 0af: goto 0bc
      // 0b2: ldc2_w 5519829085914601339
      // 0b5: lload 2
      // 0b6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: lload 5
      // 0be: bipush 1
      // 0bf: anewarray 378
      // 0c2: dup_x2
      // 0c3: dup_x2
      // 0c4: pop
      // 0c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: ldc2_w 6243761073134029969
      // 0ce: lload 2
      // 0cf: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: goto 0e1
      // 0d7: ldc2_w 5519829085914601339
      // 0da: lload 2
      // 0db: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: ldc2_w 5313335104405852128
      // 0e4: lload 2
      // 0e5: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: sipush 10828
      // 0ed: ldc2_w 683153417392830062
      // 0f0: lload 2
      // 0f1: lxor
      // 0f2: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: iload 9
      // 0f9: lload 2
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: iflt 341
      // 0ff: ifeq 33f
      // 102: if_icmpge 329
      // 105: goto 112
      // 108: ldc2_w 5519829085914601339
      // 10b: lload 2
      // 10c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: lconst_1
      // 113: ldc2_w 5313335104405852128
      // 116: lload 2
      // 117: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: lshl
      // 11d: lstore 13
      // 11f: ldc2_w 5745173182841931274
      // 122: lload 2
      // 123: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: iinc 11 -1
      // 12b: iload 11
      // 12d: iaload
      // 12e: tableswitch 472 0 2 26 240 371
      // 148: sipush 16198
      // 14b: ldc2_w 3818909811318132887
      // 14e: lload 2
      // 14f: lxor
      // 150: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: lload 13
      // 157: land
      // 158: lconst_0
      // 159: lcmp
      // 15a: iload 9
      // 15c: lload 2
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: ifle 1c7
      // 162: ifeq 1c4
      // 165: ifeq 1bb
      // 168: goto 175
      // 16b: ldc2_w 5519829085914601339
      // 16e: lload 2
      // 16f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: athrow
      // 175: iload 12
      // 177: sipush 1685
      // 17a: ldc2_w 5731624863835626150
      // 17d: lload 2
      // 17e: lxor
      // 17f: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: iload 9
      // 186: lload 2
      // 187: lconst_0
      // 188: lcmp
      // 189: iflt 1d3
      // 18c: ifeq 1d1
      // 18f: goto 19c
      // 192: ldc2_w 5519829085914601339
      // 195: lload 2
      // 196: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: if_icmple 1bb
      // 19f: goto 1ac
      // 1a2: ldc2_w 5519829085914601339
      // 1a5: lload 2
      // 1a6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: sipush 1685
      // 1af: ldc2_w 5731624863835626150
      // 1b2: lload 2
      // 1b3: lxor
      // 1b4: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: istore 12
      // 1bb: ldc2_w 5313335104405852128
      // 1be: lload 2
      // 1bf: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: sipush 2325
      // 1c7: ldc2_w 5911931593981039917
      // 1ca: lload 2
      // 1cb: lxor
      // 1cc: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: iload 9
      // 1d3: ifeq 30a
      // 1d6: if_icmpne 306
      // 1d9: goto 1e6
      // 1dc: ldc2_w 5519829085914601339
      // 1df: lload 2
      // 1e0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: athrow
      // 1e6: ldc2_w 5745173182841931274
      // 1e9: lload 2
      // 1ea: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: ldc2_w 5809400117431984377
      // 1f2: lload 2
      // 1f3: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: dup
      // 1f9: bipush 1
      // 1fa: iadd
      // 1fb: ldc2_w 5809400117431984377
      // 1fe: lload 2
      // 1ff: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: bipush 1
      // 205: iastore
      // 206: iload 9
      // 208: lload 2
      // 209: lconst_0
      // 20a: lcmp
      // 20b: ifle 308
      // 20e: ifne 306
      // 211: goto 21e
      // 214: ldc2_w 5519829085914601339
      // 217: lload 2
      // 218: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: ldc2_w 5313335104405852128
      // 221: lload 2
      // 222: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: sipush 12227
      // 22a: ldc2_w 454599167818019779
      // 22d: lload 2
      // 22e: lxor
      // 22f: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: iload 9
      // 236: ifeq 30a
      // 239: goto 246
      // 23c: ldc2_w 5519829085914601339
      // 23f: lload 2
      // 240: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: if_icmpne 306
      // 249: goto 256
      // 24c: ldc2_w 5519829085914601339
      // 24f: lload 2
      // 250: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: athrow
      // 256: iload 12
      // 258: sipush 1685
      // 25b: ldc2_w 5731624863835626150
      // 25e: lload 2
      // 25f: lxor
      // 260: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: iload 9
      // 267: ifeq 30a
      // 26a: goto 277
      // 26d: ldc2_w 5519829085914601339
      // 270: lload 2
      // 271: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: athrow
      // 277: if_icmple 306
      // 27a: goto 287
      // 27d: ldc2_w 5519829085914601339
      // 280: lload 2
      // 281: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: athrow
      // 287: sipush 1685
      // 28a: ldc2_w 5731624863835626150
      // 28d: lload 2
      // 28e: lxor
      // 28f: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: istore 12
      // 296: iload 9
      // 298: lload 2
      // 299: lconst_0
      // 29a: lcmp
      // 29b: iflt 308
      // 29e: ifne 306
      // 2a1: ldc2_w 5313335104405852128
      // 2a4: lload 2
      // 2a5: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: sipush 32673
      // 2ad: ldc2_w 3351028769477026714
      // 2b0: lload 2
      // 2b1: lxor
      // 2b2: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: iload 9
      // 2b9: ifeq 30a
      // 2bc: goto 2c9
      // 2bf: ldc2_w 5519829085914601339
      // 2c2: lload 2
      // 2c3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: athrow
      // 2c9: if_icmpne 306
      // 2cc: goto 2d9
      // 2cf: ldc2_w 5519829085914601339
      // 2d2: lload 2
      // 2d3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d8: athrow
      // 2d9: ldc2_w 5745173182841931274
      // 2dc: lload 2
      // 2dd: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: ldc2_w 5809400117431984377
      // 2e5: lload 2
      // 2e6: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: dup
      // 2ec: bipush 1
      // 2ed: iadd
      // 2ee: ldc2_w 5809400117431984377
      // 2f1: lload 2
      // 2f2: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: bipush 1
      // 2f8: iastore
      // 2f9: goto 306
      // 2fc: ldc2_w 5519829085914601339
      // 2ff: lload 2
      // 300: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: athrow
      // 306: iload 11
      // 308: iload 10
      // 30a: if_icmpne 11f
      // 30d: iload 9
      // 30f: lload 2
      // 310: lconst_0
      // 311: lcmp
      // 312: ifle 15a
      // 315: ifeq 1bb
      // 318: iload 9
      // 31a: lload 2
      // 31b: lconst_0
      // 31c: lcmp
      // 31d: ifle 12e
      // 320: lload 2
      // 321: lconst_0
      // 322: lcmp
      // 323: ifle 451
      // 326: ifne 44f
      // 329: ldc2_w 5313335104405852128
      // 32c: lload 2
      // 32d: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 332: sipush 22799
      // 335: ldc2_w 6248580589151503662
      // 338: lload 2
      // 339: lxor
      // 33a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: iload 9
      // 341: ifeq 3c3
      // 344: if_icmpge 3a0
      // 347: goto 354
      // 34a: ldc2_w 5519829085914601339
      // 34d: lload 2
      // 34e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: athrow
      // 354: lconst_1
      // 355: ldc2_w 5313335104405852128
      // 358: lload 2
      // 359: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35e: sipush 3068
      // 361: ldc2_w 3666863074904479714
      // 364: lload 2
      // 365: lxor
      // 366: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36b: iand
      // 36c: lshl
      // 36d: lstore 13
      // 36f: ldc2_w 5745173182841931274
      // 372: lload 2
      // 373: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 378: iinc 11 -1
      // 37b: iload 11
      // 37d: iaload
      // 37e: lookupswitch 10 0
      // 388: iload 11
      // 38a: iload 10
      // 38c: if_icmpne 36f
      // 38f: iload 9
      // 391: lload 2
      // 392: lconst_0
      // 393: lcmp
      // 394: iflt 38a
      // 397: lload 2
      // 398: lconst_0
      // 399: lcmp
      // 39a: iflt 451
      // 39d: ifne 44f
      // 3a0: ldc2_w 5313335104405852128
      // 3a3: lload 2
      // 3a4: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a9: sipush 29425
      // 3ac: ldc2_w 9218761542384578222
      // 3af: lload 2
      // 3b0: lxor
      // 3b1: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b6: goto 3c3
      // 3b9: ldc2_w 5519829085914601339
      // 3bc: lload 2
      // 3bd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c2: athrow
      // 3c3: ishr
      // 3c4: istore 13
      // 3c6: iload 13
      // 3c8: sipush 4356
      // 3cb: ldc2_w 426796386379173152
      // 3ce: lload 2
      // 3cf: lxor
      // 3d0: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d5: ishr
      // 3d6: istore 14
      // 3d8: lconst_1
      // 3d9: iload 13
      // 3db: sipush 1530
      // 3de: ldc2_w 382176584243812815
      // 3e1: lload 2
      // 3e2: lxor
      // 3e3: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e8: iand
      // 3e9: lshl
      // 3ea: lstore 15
      // 3ec: ldc2_w 5313335104405852128
      // 3ef: lload 2
      // 3f0: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f5: sipush 25697
      // 3f8: ldc2_w 4133427510556227706
      // 3fb: lload 2
      // 3fc: lxor
      // 3fd: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: iand
      // 403: sipush 4356
      // 406: ldc2_w 426796386379173152
      // 409: lload 2
      // 40a: lxor
      // 40b: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 410: ishr
      // 411: istore 17
      // 413: lconst_1
      // 414: ldc2_w 5313335104405852128
      // 417: lload 2
      // 418: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41d: sipush 1530
      // 420: ldc2_w 382176584243812815
      // 423: lload 2
      // 424: lxor
      // 425: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42a: iand
      // 42b: lshl
      // 42c: lstore 18
      // 42e: ldc2_w 5745173182841931274
      // 431: lload 2
      // 432: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 437: iinc 11 -1
      // 43a: iload 11
      // 43c: iaload
      // 43d: lookupswitch 11 0
      // 448: iload 11
      // 44a: iload 10
      // 44c: if_icmpne 42e
      // 44f: iload 12
      // 451: sipush 8216
      // 454: ldc2_w 1319475983910812747
      // 457: lload 2
      // 458: lxor
      // 459: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45e: lload 2
      // 45f: lconst_0
      // 460: lcmp
      // 461: ifle 4c9
      // 464: iload 9
      // 466: ifeq 4c9
      // 469: if_icmpeq 49e
      // 46c: goto 479
      // 46f: ldc2_w 5519829085914601339
      // 472: lload 2
      // 473: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 478: athrow
      // 479: iload 12
      // 47b: ldc2_w 5818704326178215992
      // 47e: lload 2
      // 47f: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 484: sipush 8216
      // 487: iload 4
      // 489: ldc2_w 5842867710423622477
      // 48c: lload 2
      // 48d: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 492: ldc2_w 1319475983910812747
      // 495: lload 2
      // 496: lxor
      // 497: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49c: istore 12
      // 49e: iinc 4 1
      // 4a1: lload 2
      // 4a2: lconst_0
      // 4a3: lcmp
      // 4a4: ifle 504
      // 4a7: ldc2_w 5809400117431984377
      // 4aa: lload 2
      // 4ab: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b0: dup
      // 4b1: istore 11
      // 4b3: iload 9
      // 4b5: ifeq 4fb
      // 4b8: bipush 3
      // 4b9: iload 10
      // 4bb: dup
      // 4bc: ldc2_w 5809400117431984377
      // 4bf: lload 2
      // 4c0: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: isub
      // 4c6: dup
      // 4c7: istore 10
      // 4c9: if_icmpne 4d9
      // 4cc: iload 4
      // 4ce: ireturn
      // 4cf: ldc2_w 5519829085914601339
      // 4d2: lload 2
      // 4d3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d8: athrow
      // 4d9: ldc2_w 5235801268299239698
      // 4dc: lload 2
      // 4dd: invokedynamic m (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e2: pop
      // 4e3: lload 7
      // 4e5: bipush 1
      // 4e6: anewarray 378
      // 4e9: dup_x2
      // 4ea: dup_x2
      // 4eb: pop
      // 4ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4ef: bipush 0
      // 4f0: swap
      // 4f1: aastore
      // 4f2: ldc2_w 6321878238470973106
      // 4f5: lload 2
      // 4f6: invokedynamic t (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4fb: ldc2_w 5313335104405852128
      // 4fe: lload 2
      // 4ff: invokedynamic u (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 504: goto 079
      // 507: astore 13
      // 509: iload 4
      // 50b: ireturn
   }

   public e_(_zd param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/e_.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 1132066150271
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w -6271215384734003257
      // 12: lload 2
      // 13: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 0
      // 19: invokespecial java/lang/Object.<init> ()V
      // 1c: istore 6
      // 1e: ldc2_w -6279103032551935641
      // 21: lload 2
      // 22: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 6
      // 29: ifeq 5f
      // 2c: ifnull 5e
      // 2f: goto 3c
      // 32: ldc2_w -5985504069532059890
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: new com/zelix/ek
      // 3f: dup
      // 40: sipush 2730
      // 43: ldc2_w 1342938417341696783
      // 46: lload 2
      // 47: lxor
      // 48: invokedynamic k (IJ)Ljava/lang/String; bsm=com/zelix/e_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: bipush 1
      // 4e: lload 4
      // 50: invokespecial com/zelix/ek.<init> (Ljava/lang/String;IJ)V
      // 53: athrow
      // 54: ldc2_w -5985504069532059890
      // 57: lload 2
      // 58: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 1
      // 5f: ldc2_w -6279103032551935641
      // 62: lload 2
      // 63: invokedynamic p (Lcom/zelix/_zd;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: return
   }

   private static int J(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      long var3 = var1 ^ 49961290978884L;
      Object[] var10004 = new Object[]{null, null, 0};
      var10004[1] = var3;
      var10004[0] = 0;
      return x44.a<"w">(var10004, -3580087856655373565L, var1);
   }

   private static int V(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 74349783380125
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 91969230570150
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 68568019087737
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 67878872451734
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w 8415017719215281143
      // 04b: lload 5
      // 04d: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 15
      // 054: lload 3
      // 055: lload 1
      // 056: land
      // 057: dup2
      // 058: lstore 3
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iload 15
      // 05d: ifeq 0da
      // 060: ifne 0b6
      // 063: goto 071
      // 066: ldc2_w 8133284393895865150
      // 069: lload 5
      // 06b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: sipush 25287
      // 074: ldc2_w 5028435620840620687
      // 077: lload 5
      // 079: lxor
      // 07a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: lload 1
      // 080: lload 9
      // 082: bipush 3
      // 083: anewarray 378
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 2
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x2
      // 090: dup_x2
      // 091: pop
      // 092: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 095: bipush 1
      // 096: swap
      // 097: aastore
      // 098: dup_x1
      // 099: swap
      // 09a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w 8555478550441403430
      // 0a3: lload 5
      // 0a5: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: ireturn
      // 0ab: ldc2_w 8133284393895865150
      // 0ae: lload 5
      // 0b0: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: ldc2_w 8425155035459956055
      // 0b9: lload 5
      // 0bb: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: pop
      // 0c1: lload 11
      // 0c3: bipush 1
      // 0c4: anewarray 378
      // 0c7: dup_x2
      // 0c8: dup_x2
      // 0c9: pop
      // 0ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd: bipush 0
      // 0ce: swap
      // 0cf: aastore
      // 0d0: ldc2_w 7781857994806827767
      // 0d3: lload 5
      // 0d5: invokedynamic q (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: ldc2_w 8501008835275813797
      // 0dd: lload 5
      // 0df: invokedynamic p (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 132
      // 0e7: astore 16
      // 0e9: lload 13
      // 0eb: sipush 29425
      // 0ee: ldc2_w 9218862497412829931
      // 0f1: lload 5
      // 0f3: lxor
      // 0f4: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: lload 3
      // 0fa: bipush 3
      // 0fb: anewarray 378
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 2
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10c: bipush 1
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w 7634962980541024467
      // 11b: lload 5
      // 11d: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: pop
      // 123: sipush 29050
      // 126: ldc2_w 2106677922613449006
      // 129: lload 5
      // 12b: lxor
      // 12c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: ireturn
      // 132: ldc2_w 8501008835275813797
      // 135: lload 5
      // 137: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: iload 15
      // 13e: ifeq 1de
      // 141: lookupswitch 100 1 110 30
      // 154: ldc2_w 8133284393895865150
      // 157: lload 5
      // 159: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: lload 3
      // 160: sipush 12459
      // 163: ldc2_w 3753144871995712260
      // 166: lload 5
      // 168: lxor
      // 169: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: lload 7
      // 170: bipush 3
      // 171: anewarray 378
      // 174: dup_x2
      // 175: dup_x2
      // 176: pop
      // 177: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17a: bipush 2
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 1
      // 184: swap
      // 185: aastore
      // 186: dup_x2
      // 187: dup_x2
      // 188: pop
      // 189: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: ldc2_w 8082956524145718793
      // 192: lload 5
      // 194: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: ireturn
      // 19a: ldc2_w 8133284393895865150
      // 19d: lload 5
      // 19f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: sipush 29425
      // 1a8: ldc2_w 9218862497412829931
      // 1ab: lload 5
      // 1ad: lxor
      // 1ae: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: lload 3
      // 1b4: lload 9
      // 1b6: bipush 3
      // 1b7: anewarray 378
      // 1ba: dup_x2
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c0: bipush 2
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x2
      // 1c4: dup_x2
      // 1c5: pop
      // 1c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c9: bipush 1
      // 1ca: swap
      // 1cb: aastore
      // 1cc: dup_x1
      // 1cd: swap
      // 1ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d1: bipush 0
      // 1d2: swap
      // 1d3: aastore
      // 1d4: ldc2_w 8555478550441403430
      // 1d7: lload 5
      // 1d9: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: ireturn
   }

   private static int X(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 79912998303186
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 12242099759938
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 39033250920454
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 86285325962201
      // 044: lxor
      // 045: lstore 13
      // 047: dup2
      // 048: ldc2_w 85320234905654
      // 04b: lxor
      // 04c: lstore 15
      // 04e: pop2
      // 04f: ldc2_w -3573511597904205481
      // 052: lload 5
      // 054: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: istore 17
      // 05b: lload 3
      // 05c: lload 1
      // 05d: land
      // 05e: dup2
      // 05f: lstore 3
      // 060: lconst_0
      // 061: lcmp
      // 062: iload 17
      // 064: ifeq 0d4
      // 067: ifne 0b0
      // 06a: goto 078
      // 06d: ldc2_w -3855280064711388770
      // 070: lload 5
      // 072: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: bipush 5
      // 079: lload 1
      // 07a: lload 11
      // 07c: bipush 3
      // 07d: anewarray 378
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 2
      // 087: swap
      // 088: aastore
      // 089: dup_x2
      // 08a: dup_x2
      // 08b: pop
      // 08c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08f: bipush 1
      // 090: swap
      // 091: aastore
      // 092: dup_x1
      // 093: swap
      // 094: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w -3739295779767509370
      // 09d: lload 5
      // 09f: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: ireturn
      // 0a5: ldc2_w -3855280064711388770
      // 0a8: lload 5
      // 0aa: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: ldc2_w -3581388679153674249
      // 0b3: lload 5
      // 0b5: invokedynamic h (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: pop
      // 0bb: lload 13
      // 0bd: bipush 1
      // 0be: anewarray 378
      // 0c1: dup_x2
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: ldc2_w -3360029775667060649
      // 0cd: lload 5
      // 0cf: invokedynamic q (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: ldc2_w -3505535145626187515
      // 0d7: lload 5
      // 0d9: invokedynamic p (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: goto 12c
      // 0e1: astore 18
      // 0e3: lload 15
      // 0e5: sipush 4356
      // 0e8: ldc2_w 426818828873862085
      // 0eb: lload 5
      // 0ed: lxor
      // 0ee: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: lload 3
      // 0f4: bipush 3
      // 0f5: anewarray 378
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 2
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 106: bipush 1
      // 107: swap
      // 108: aastore
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 0
      // 110: swap
      // 111: aastore
      // 112: ldc2_w -3218765020892990861
      // 115: lload 5
      // 117: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: pop
      // 11d: sipush 1685
      // 120: ldc2_w 5731611221049515075
      // 123: lload 5
      // 125: lxor
      // 126: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: ireturn
      // 12c: ldc2_w -3505535145626187515
      // 12f: lload 5
      // 131: invokedynamic h (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: iload 17
      // 138: ifeq 257
      // 13b: lookupswitch 227 2 45 36 62 106
      // 154: ldc2_w -3855280064711388770
      // 157: lload 5
      // 159: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: lload 3
      // 160: sipush 12459
      // 163: ldc2_w 3753091978967751076
      // 166: lload 5
      // 168: lxor
      // 169: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: lload 9
      // 170: bipush 3
      // 171: anewarray 378
      // 174: dup_x2
      // 175: dup_x2
      // 176: pop
      // 177: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17a: bipush 2
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 1
      // 184: swap
      // 185: aastore
      // 186: dup_x2
      // 187: dup_x2
      // 188: pop
      // 189: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: ldc2_w -3839273442845076798
      // 192: lload 5
      // 194: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: ireturn
      // 19a: ldc2_w -3855280064711388770
      // 19d: lload 5
      // 19f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: lload 3
      // 1a6: sipush 13285
      // 1a9: ldc2_w 8905010320992475877
      // 1ac: lload 5
      // 1ae: lxor
      // 1af: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: land
      // 1b5: lconst_0
      // 1b6: lcmp
      // 1b7: iload 17
      // 1b9: ifeq 257
      // 1bc: ifeq 21e
      // 1bf: goto 1cd
      // 1c2: ldc2_w -3855280064711388770
      // 1c5: lload 5
      // 1c7: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: athrow
      // 1cd: sipush 1685
      // 1d0: ldc2_w 5731611221049515075
      // 1d3: lload 5
      // 1d5: lxor
      // 1d6: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: lload 7
      // 1dd: sipush 4889
      // 1e0: ldc2_w 4311820974072924646
      // 1e3: lload 5
      // 1e5: lxor
      // 1e6: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: bipush 3
      // 1ec: anewarray 378
      // 1ef: dup_x1
      // 1f0: swap
      // 1f1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f4: bipush 2
      // 1f5: swap
      // 1f6: aastore
      // 1f7: dup_x2
      // 1f8: dup_x2
      // 1f9: pop
      // 1fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fd: bipush 1
      // 1fe: swap
      // 1ff: aastore
      // 200: dup_x1
      // 201: swap
      // 202: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 205: bipush 0
      // 206: swap
      // 207: aastore
      // 208: ldc2_w -3826606228178909686
      // 20b: lload 5
      // 20d: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: ireturn
      // 213: ldc2_w -3855280064711388770
      // 216: lload 5
      // 218: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: sipush 4356
      // 221: ldc2_w 426818828873862085
      // 224: lload 5
      // 226: lxor
      // 227: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: lload 3
      // 22d: lload 11
      // 22f: bipush 3
      // 230: anewarray 378
      // 233: dup_x2
      // 234: dup_x2
      // 235: pop
      // 236: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 239: bipush 2
      // 23a: swap
      // 23b: aastore
      // 23c: dup_x2
      // 23d: dup_x2
      // 23e: pop
      // 23f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 242: bipush 1
      // 243: swap
      // 244: aastore
      // 245: dup_x1
      // 246: swap
      // 247: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 24a: bipush 0
      // 24b: swap
      // 24c: aastore
      // 24d: ldc2_w -3739295779767509370
      // 250: lload 5
      // 252: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: ireturn
   }

   private static final boolean D(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Integer
      // 01b: invokevirtual java/lang/Integer.intValue ()I
      // 01e: istore 10
      // 020: dup
      // 021: bipush 3
      // 022: aaload
      // 023: checkcast java/lang/Integer
      // 026: invokevirtual java/lang/Integer.intValue ()I
      // 029: istore 9
      // 02b: dup
      // 02c: bipush 4
      // 02d: aaload
      // 02e: checkcast java/lang/Integer
      // 031: invokevirtual java/lang/Integer.intValue ()I
      // 034: istore 4
      // 036: dup
      // 037: bipush 5
      // 038: aaload
      // 039: checkcast java/lang/Long
      // 03c: invokevirtual java/lang/Long.longValue ()J
      // 03f: lstore 5
      // 041: dup
      // 042: bipush 6
      // 044: aaload
      // 045: checkcast java/lang/Long
      // 048: invokevirtual java/lang/Long.longValue ()J
      // 04b: lstore 7
      // 04d: pop
      // 04e: lload 1
      // 04f: bipush 16
      // 051: lshl
      // 052: iload 4
      // 054: i2l
      // 055: bipush 48
      // 057: lshl
      // 058: bipush 48
      // 05a: lushr
      // 05b: lor
      // 05c: getstatic com/zelix/e_.a J
      // 05f: lxor
      // 060: lstore 11
      // 062: ldc2_w -4754186579271491963
      // 065: lload 11
      // 067: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: istore 13
      // 06e: iload 3
      // 06f: iload 13
      // 071: ifne 0e1
      // 074: lookupswitch 91 1 0 31
      // 088: ldc2_w -6903054393576981550
      // 08b: lload 11
      // 08d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: ldc2_w -5022913812678363280
      // 096: lload 11
      // 098: invokedynamic l (JJ)[J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: iload 9
      // 09f: laload
      // 0a0: lload 7
      // 0a2: land
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iload 13
      // 0a7: ifne 0ca
      // 0aa: goto 0b8
      // 0ad: ldc2_w -6903054393576981550
      // 0b0: lload 11
      // 0b2: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: ifeq 0cd
      // 0bb: goto 0c9
      // 0be: ldc2_w -6903054393576981550
      // 0c1: lload 11
      // 0c3: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: bipush 1
      // 0ca: goto 0ce
      // 0cd: bipush 0
      // 0ce: ireturn
      // 0cf: ldc2_w -5102600959957989054
      // 0d2: lload 11
      // 0d4: invokedynamic l (JJ)[J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: iload 10
      // 0db: laload
      // 0dc: lload 5
      // 0de: land
      // 0df: lconst_0
      // 0e0: lcmp
      // 0e1: iload 13
      // 0e3: ifne 105
      // 0e6: ifeq 104
      // 0e9: goto 0f7
      // 0ec: ldc2_w -6903054393576981550
      // 0ef: lload 11
      // 0f1: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: bipush 1
      // 0f8: ireturn
      // 0f9: ldc2_w -6903054393576981550
      // 0fc: lload 11
      // 0fe: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: bipush 0
      // 105: ireturn
   }

   private static int x(Object[] var0) {
      int var1 = (Integer)var0[0];
      int var4 = (Integer)var0[1];
      int var5 = (Integer)var0[2];
      long var2 = (Long)var0[3];
      var2 = a ^ var2;
      long var6 = var2 ^ 38417142061949L;
      long var8 = var2 ^ 129087311878102L;
      x44.a<"w">(var4, 5344118697675948754L, var2);
      x44.a<"w">(var1, 5475293426104170919L, var2);

      try {
         x44.a<"o">(5927690274751515640L, var2);
         x44.a<"w">(x44.a<"v">(new Object[]{var8}, 5571513103571205208L, var2), 6005248034091783434L, var2);
      } catch (IOException var11) {
         return var1 + 1;
      }

      Object[] var10004 = new Object[]{null, null, var1 + 1};
      var10004[1] = var6;
      var10004[0] = var5;
      return x44.a<"v">(var10004, 5379230113922781160L, var2);
   }

   private static int P(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: pop
      // 00c: getstatic com/zelix/e_.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 74023643797720
      // 017: lxor
      // 018: lstore 3
      // 019: dup2
      // 01a: ldc2_w 29361604403352
      // 01d: lxor
      // 01e: lstore 5
      // 020: dup2
      // 021: ldc2_w 91207444901164
      // 024: lxor
      // 025: lstore 7
      // 027: dup2
      // 028: ldc2_w 86642172447042
      // 02b: lxor
      // 02c: lstore 9
      // 02e: pop2
      // 02f: ldc2_w -2061982470123797411
      // 032: lload 1
      // 033: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: istore 11
      // 03a: ldc2_w -2138121686722812913
      // 03d: lload 1
      // 03e: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: iload 11
      // 045: ifeq 438
      // 048: lookupswitch 966 15 10 142 13 206 34 260 40 314 41 368 44 422 45 476 46 523 47 577 58 646 60 700 91 747 93 801 112 855 65279 902
      // 0cc: ldc2_w -1768436043014095724
      // 0cf: lload 1
      // 0d0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: bipush 0
      // 0d7: lload 3
      // 0d8: sipush 29480
      // 0db: ldc2_w 4672911584419628251
      // 0de: lload 1
      // 0df: lxor
      // 0e0: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: bipush 3
      // 0e6: anewarray 378
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ee: bipush 2
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x2
      // 0f2: dup_x2
      // 0f3: pop
      // 0f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f7: bipush 1
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ff: bipush 0
      // 100: swap
      // 101: aastore
      // 102: ldc2_w -1734129861497754880
      // 105: lload 1
      // 106: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: ireturn
      // 10c: ldc2_w -1768436043014095724
      // 10f: lload 1
      // 110: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: athrow
      // 116: bipush 0
      // 117: lload 3
      // 118: sipush 32673
      // 11b: ldc2_w 3350996356119414901
      // 11e: lload 1
      // 11f: lxor
      // 120: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: bipush 3
      // 126: anewarray 378
      // 129: dup_x1
      // 12a: swap
      // 12b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12e: bipush 2
      // 12f: swap
      // 130: aastore
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 1
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13f: bipush 0
      // 140: swap
      // 141: aastore
      // 142: ldc2_w -1734129861497754880
      // 145: lload 1
      // 146: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: ireturn
      // 14c: bipush 0
      // 14d: lload 3
      // 14e: sipush 25427
      // 151: ldc2_w 4918924525897372862
      // 154: lload 1
      // 155: lxor
      // 156: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: bipush 3
      // 15c: anewarray 378
      // 15f: dup_x1
      // 160: swap
      // 161: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 164: bipush 2
      // 165: swap
      // 166: aastore
      // 167: dup_x2
      // 168: dup_x2
      // 169: pop
      // 16a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16d: bipush 1
      // 16e: swap
      // 16f: aastore
      // 170: dup_x1
      // 171: swap
      // 172: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 175: bipush 0
      // 176: swap
      // 177: aastore
      // 178: ldc2_w -1734129861497754880
      // 17b: lload 1
      // 17c: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: ireturn
      // 182: bipush 0
      // 183: lload 3
      // 184: sipush 25309
      // 187: ldc2_w 6879375234778027297
      // 18a: lload 1
      // 18b: lxor
      // 18c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: bipush 3
      // 192: anewarray 378
      // 195: dup_x1
      // 196: swap
      // 197: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19a: bipush 2
      // 19b: swap
      // 19c: aastore
      // 19d: dup_x2
      // 19e: dup_x2
      // 19f: pop
      // 1a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a3: bipush 1
      // 1a4: swap
      // 1a5: aastore
      // 1a6: dup_x1
      // 1a7: swap
      // 1a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ab: bipush 0
      // 1ac: swap
      // 1ad: aastore
      // 1ae: ldc2_w -1734129861497754880
      // 1b1: lload 1
      // 1b2: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: ireturn
      // 1b8: bipush 0
      // 1b9: lload 3
      // 1ba: sipush 31393
      // 1bd: ldc2_w 5484821921704725825
      // 1c0: lload 1
      // 1c1: lxor
      // 1c2: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: bipush 3
      // 1c8: anewarray 378
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d0: bipush 2
      // 1d1: swap
      // 1d2: aastore
      // 1d3: dup_x2
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d9: bipush 1
      // 1da: swap
      // 1db: aastore
      // 1dc: dup_x1
      // 1dd: swap
      // 1de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e1: bipush 0
      // 1e2: swap
      // 1e3: aastore
      // 1e4: ldc2_w -1734129861497754880
      // 1e7: lload 1
      // 1e8: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: ireturn
      // 1ee: bipush 0
      // 1ef: lload 3
      // 1f0: sipush 2424
      // 1f3: ldc2_w 239743535280733827
      // 1f6: lload 1
      // 1f7: lxor
      // 1f8: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: bipush 3
      // 1fe: anewarray 378
      // 201: dup_x1
      // 202: swap
      // 203: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 206: bipush 2
      // 207: swap
      // 208: aastore
      // 209: dup_x2
      // 20a: dup_x2
      // 20b: pop
      // 20c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20f: bipush 1
      // 210: swap
      // 211: aastore
      // 212: dup_x1
      // 213: swap
      // 214: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 217: bipush 0
      // 218: swap
      // 219: aastore
      // 21a: ldc2_w -1734129861497754880
      // 21d: lload 1
      // 21e: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: ireturn
      // 224: sipush 6337
      // 227: ldc2_w 549598151298718914
      // 22a: lload 1
      // 22b: lxor
      // 22c: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: lload 7
      // 233: bipush 2
      // 234: anewarray 378
      // 237: dup_x2
      // 238: dup_x2
      // 239: pop
      // 23a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23d: bipush 1
      // 23e: swap
      // 23f: aastore
      // 240: dup_x2
      // 241: dup_x2
      // 242: pop
      // 243: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 246: bipush 0
      // 247: swap
      // 248: aastore
      // 249: ldc2_w -2096983833909780566
      // 24c: lload 1
      // 24d: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: ireturn
      // 253: bipush 0
      // 254: lload 3
      // 255: sipush 23586
      // 258: ldc2_w 1781157417853283225
      // 25b: lload 1
      // 25c: lxor
      // 25d: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: bipush 3
      // 263: anewarray 378
      // 266: dup_x1
      // 267: swap
      // 268: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 26b: bipush 2
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x2
      // 26f: dup_x2
      // 270: pop
      // 271: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 274: bipush 1
      // 275: swap
      // 276: aastore
      // 277: dup_x1
      // 278: swap
      // 279: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 27c: bipush 0
      // 27d: swap
      // 27e: aastore
      // 27f: ldc2_w -1734129861497754880
      // 282: lload 1
      // 283: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: ireturn
      // 289: sipush 27993
      // 28c: ldc2_w 3896727809838340747
      // 28f: lload 1
      // 290: lxor
      // 291: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: ldc2_w -347006667381328937
      // 299: lload 1
      // 29a: invokedynamic r (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: sipush 29367
      // 2a2: ldc2_w 4062586535041070754
      // 2a5: lload 1
      // 2a6: lxor
      // 2a7: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: lload 7
      // 2ae: bipush 2
      // 2af: anewarray 378
      // 2b2: dup_x2
      // 2b3: dup_x2
      // 2b4: pop
      // 2b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b8: bipush 1
      // 2b9: swap
      // 2ba: aastore
      // 2bb: dup_x2
      // 2bc: dup_x2
      // 2bd: pop
      // 2be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c1: bipush 0
      // 2c2: swap
      // 2c3: aastore
      // 2c4: ldc2_w -2096983833909780566
      // 2c7: lload 1
      // 2c8: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: ireturn
      // 2ce: bipush 0
      // 2cf: lload 3
      // 2d0: sipush 31098
      // 2d3: ldc2_w 8268820854246330035
      // 2d6: lload 1
      // 2d7: lxor
      // 2d8: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: bipush 3
      // 2de: anewarray 378
      // 2e1: dup_x1
      // 2e2: swap
      // 2e3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2e6: bipush 2
      // 2e7: swap
      // 2e8: aastore
      // 2e9: dup_x2
      // 2ea: dup_x2
      // 2eb: pop
      // 2ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ef: bipush 1
      // 2f0: swap
      // 2f1: aastore
      // 2f2: dup_x1
      // 2f3: swap
      // 2f4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2f7: bipush 0
      // 2f8: swap
      // 2f9: aastore
      // 2fa: ldc2_w -1734129861497754880
      // 2fd: lload 1
      // 2fe: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: ireturn
      // 304: sipush 30558
      // 307: ldc2_w 4956553742945612616
      // 30a: lload 1
      // 30b: lxor
      // 30c: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: lload 7
      // 313: bipush 2
      // 314: anewarray 378
      // 317: dup_x2
      // 318: dup_x2
      // 319: pop
      // 31a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31d: bipush 1
      // 31e: swap
      // 31f: aastore
      // 320: dup_x2
      // 321: dup_x2
      // 322: pop
      // 323: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 326: bipush 0
      // 327: swap
      // 328: aastore
      // 329: ldc2_w -2096983833909780566
      // 32c: lload 1
      // 32d: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 332: ireturn
      // 333: bipush 0
      // 334: lload 3
      // 335: sipush 28736
      // 338: ldc2_w 1995630503653328772
      // 33b: lload 1
      // 33c: lxor
      // 33d: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 342: bipush 3
      // 343: anewarray 378
      // 346: dup_x1
      // 347: swap
      // 348: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 34b: bipush 2
      // 34c: swap
      // 34d: aastore
      // 34e: dup_x2
      // 34f: dup_x2
      // 350: pop
      // 351: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 354: bipush 1
      // 355: swap
      // 356: aastore
      // 357: dup_x1
      // 358: swap
      // 359: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 35c: bipush 0
      // 35d: swap
      // 35e: aastore
      // 35f: ldc2_w -1734129861497754880
      // 362: lload 1
      // 363: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: ireturn
      // 369: bipush 0
      // 36a: lload 3
      // 36b: sipush 16167
      // 36e: ldc2_w 2535584261943888031
      // 371: lload 1
      // 372: lxor
      // 373: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 378: bipush 3
      // 379: anewarray 378
      // 37c: dup_x1
      // 37d: swap
      // 37e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 381: bipush 2
      // 382: swap
      // 383: aastore
      // 384: dup_x2
      // 385: dup_x2
      // 386: pop
      // 387: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38a: bipush 1
      // 38b: swap
      // 38c: aastore
      // 38d: dup_x1
      // 38e: swap
      // 38f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 392: bipush 0
      // 393: swap
      // 394: aastore
      // 395: ldc2_w -1734129861497754880
      // 398: lload 1
      // 399: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39e: ireturn
      // 39f: sipush 12459
      // 3a2: ldc2_w 3753084783939531950
      // 3a5: lload 1
      // 3a6: lxor
      // 3a7: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: lload 7
      // 3ae: bipush 2
      // 3af: anewarray 378
      // 3b2: dup_x2
      // 3b3: dup_x2
      // 3b4: pop
      // 3b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b8: bipush 1
      // 3b9: swap
      // 3ba: aastore
      // 3bb: dup_x2
      // 3bc: dup_x2
      // 3bd: pop
      // 3be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c1: bipush 0
      // 3c2: swap
      // 3c3: aastore
      // 3c4: ldc2_w -2096983833909780566
      // 3c7: lload 1
      // 3c8: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cd: ireturn
      // 3ce: bipush 0
      // 3cf: lload 9
      // 3d1: sipush 11791
      // 3d4: ldc2_w 1205040117601376750
      // 3d7: lload 1
      // 3d8: lxor
      // 3d9: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3de: bipush 5
      // 3df: bipush 4
      // 3e0: anewarray 378
      // 3e3: dup_x1
      // 3e4: swap
      // 3e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3e8: bipush 3
      // 3e9: swap
      // 3ea: aastore
      // 3eb: dup_x1
      // 3ec: swap
      // 3ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3f0: bipush 2
      // 3f1: swap
      // 3f2: aastore
      // 3f3: dup_x2
      // 3f4: dup_x2
      // 3f5: pop
      // 3f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f9: bipush 1
      // 3fa: swap
      // 3fb: aastore
      // 3fc: dup_x1
      // 3fd: swap
      // 3fe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 401: bipush 0
      // 402: swap
      // 403: aastore
      // 404: ldc2_w -307624499628923037
      // 407: lload 1
      // 408: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40d: ireturn
      // 40e: lload 5
      // 410: bipush 3
      // 411: bipush 0
      // 412: bipush 3
      // 413: anewarray 378
      // 416: dup_x1
      // 417: swap
      // 418: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 41b: bipush 2
      // 41c: swap
      // 41d: aastore
      // 41e: dup_x1
      // 41f: swap
      // 420: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 423: bipush 1
      // 424: swap
      // 425: aastore
      // 426: dup_x2
      // 427: dup_x2
      // 428: pop
      // 429: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42c: bipush 0
      // 42d: swap
      // 42e: aastore
      // 42f: ldc2_w -309124183970520845
      // 432: lload 1
      // 433: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 438: ireturn
   }

   static {
      long var31 = a ^ 131908581359137L;
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
      String var26 = "X^cò;+ï\u0084\u007f·×aßXµÄ©Á\nî\u0086\u0085½®G\u00904]z\u001b+\u0091>Z-ð\u0003\u0015\u0000Á\u0010µ\u0002Yq#ã¼@kÔ5\u0004Û\u0095|\u0080($\u001aÝ12\u008f\u0089\"ª¥\u0093\u0094\u009c·:\u0088\u008b+GqÇª\u0093hYt`×roæ\u0017²´7\u0089=è\u0005n(Ü¹,\u0082ùg\u000fà\u001ea¼\u0002\u0015ÅÙ®úåÚ×½\u001c]ÿñ®½á6÷Sìýf¼ÓîÈ5»0S\u007fH\u0000xqf¡ûL£/¸\u001aJ\u00049\u008e¨X¥\u0004n\u0093ävp\u0080\u0091L=Ù+\u0089\u0084\u0006\u0015H±ã\fîu\u001cjhn8¨'²\u000eà!?IH6\u0017°ýl'cÅ\"\u0000\u008b\u008eÈÛ\u001aR\u0019D½&û\u0082Û\u0092\u0017¼!&Z(ïWÕ\u0014(7910n0b\u000fÅ`\u009d`\u007f\u0087Ö#C\u0092U4O\u007f\u008e\u0080Úþµ\u001dñBñEfÈ\u0017\rBÎg\u0002.\u0094y\u0086êÝíC\u0018JÅm$\u0086Ê\u0006\\h9;\u0016þ\u009f\u0003¤¨\u0014ôêÍ\u0094õ¸<\tNQ²ûïµ\u001b\u008afå\u009cï¾³MÏI6efH>¢\u0087\u0007ÎÉ\u008a*u\u0019\r\u000fr\u008e\u0080Á\u0099BX6÷\u008d\u0091ü#ý\u0087\u0012º\u0010XÇM\u00adçæ%b<ìø\u0094T2\nÖ\u0018DÝ\u0091iO\u0006øJªÿåî\u0006p*±áv½\u000b§\u0013L}";
      int var28 = "X^cò;+ï\u0084\u007f·×aßXµÄ©Á\nî\u0086\u0085½®G\u00904]z\u001b+\u0091>Z-ð\u0003\u0015\u0000Á\u0010µ\u0002Yq#ã¼@kÔ5\u0004Û\u0095|\u0080($\u001aÝ12\u008f\u0089\"ª¥\u0093\u0094\u009c·:\u0088\u008b+GqÇª\u0093hYt`×roæ\u0017²´7\u0089=è\u0005n(Ü¹,\u0082ùg\u000fà\u001ea¼\u0002\u0015ÅÙ®úåÚ×½\u001c]ÿñ®½á6÷Sìýf¼ÓîÈ5»0S\u007fH\u0000xqf¡ûL£/¸\u001aJ\u00049\u008e¨X¥\u0004n\u0093ävp\u0080\u0091L=Ù+\u0089\u0084\u0006\u0015H±ã\fîu\u001cjhn8¨'²\u000eà!?IH6\u0017°ýl'cÅ\"\u0000\u008b\u008eÈÛ\u001aR\u0019D½&û\u0082Û\u0092\u0017¼!&Z(ïWÕ\u0014(7910n0b\u000fÅ`\u009d`\u007f\u0087Ö#C\u0092U4O\u007f\u008e\u0080Úþµ\u001dñBñEfÈ\u0017\rBÎg\u0002.\u0094y\u0086êÝíC\u0018JÅm$\u0086Ê\u0006\\h9;\u0016þ\u009f\u0003¤¨\u0014ôêÍ\u0094õ¸<\tNQ²ûïµ\u001b\u008afå\u009cï¾³MÏI6efH>¢\u0087\u0007ÎÉ\u008a*u\u0019\r\u000fr\u008e\u0080Á\u0099BX6÷\u008d\u0091ü#ý\u0087\u0012º\u0010XÇM\u00adçæ%b<ìø\u0094T2\nÖ\u0018DÝ\u0091iO\u0006øJªÿåî\u0006p*±áv½\u000b§\u0013L}"
         .length();
      char var25 = '(';
      int var36 = -1;

      label81:
      while (true) {
         String var37 = var26.substring(++var36, var36 + var25);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var22.doFinal(var37.getBytes("ISO-8859-1"));
            String var57 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var29[var27++] = var57;
                  if ((var36 += var25) >= var28) {
                     h = var29;
                     j = new String[10];
                     q = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[75];
                     int var14 = 0;
                     String var15 = "`ÙõÈ@:\u0016Jå~~yYD\u00151\fMö,g\u0093_ùÄ\u009eJßÌ|6åR´Qf¸¥6j»:Î«²C\u0012èÖ±1Qn2ÿ+\u001bkêOYÔígëõ±,\u0089ª\u008d8Äécc¦\u0003\u001bäQó\u0087ò±ä\u001b×\u000f\u0093ø*«q\tÝX\u009698\u0016i\u009cò\u009e%\u0001íÆ«_\u0002M\u008aK\u0012Ñ÷\u0006\tìlª±ÿRñ#:\u009d>ûân{4\u0082)ÓÄ\u008eh¦&(Õ\u001f\t\"\u0097Va\u0091é\nN¡\u0006<Q´_9µ}\u008dT1Ù]ioÜ\u001fÚ@\u00883µ\u0087ã=\u001d\u0005$û\u0004ÛÒ\u0004³\u009aÔJý\u008c/[æ{\u0097(D¿û»¢Ô®oì¤\u00adÇåÿìQ\u0080[Æ9\u0084g\u009d^\rAf\u009b¾4ÍÍZ\u0012wã\u0018\u007f¸*U\u0018F\u009dãí²Npê*\u0012YÃà¼¡MS\u008fº\u0019\u0092åóPTØV\u001b\u000eOÄm\u000e\u008fòÁ×\u001f\u0086s¤\u0092éà¤H/`\u0098\f\u00861\u0095e\u0099\u0000<§þ¿|\u0097ü±3\u00ad\u0005\u0015\r9Ëí\u001bõ\u0007\u0098Ë\u001e\u0001t{ÿ\u001b $\u008cbë\u0093jRá?í¿à\u000e\u0012\u0080<ðÛ>%gîÅ\u001fg[\rB¬\u0012<1Î¡Kû$Lá\u009có©\u0089]fU\u0000\u00adî\u0099à*°\u0083\u0083\u009dºvö7\u0003Â¼e» |¾L\u0083°B|\u0093Ò.IÏaÖ\u0010*ÎÆ\u0095Ï\u0011øoðFL¢?\u0094\u0085\u007fÚ\u0014lB£ã]õ\u0018_Û{HÐXB.¤x¸\u0016T\u000fN\u008e_ê\u0099¹S¤\u0006¬A\u0084/±L+â\u001c¼\u0095\u0001r·\u0097¿n1\u0084o8ªÑ\u008d`LzÌ\u0080|fSdÕ³¢\u001d\u001b\u008d6;²ðh\u0084=F©Xqñ^\u00adÍ\u00837\u0090\u0017â¢^è;Dµ¨jêø=\u0083í~Ì\u0018\u007f§Ìø\u0084å*nzv]Ã¨NÆ§¬Û\u0089Üò\u0086úÔ\u0016K=¾uï\u0002\u0000Þ\u0090\u0015¢µÛ\u0014(p\u009bg>X\rG²Ý~EM";
                     int var16 = "`ÙõÈ@:\u0016Jå~~yYD\u00151\fMö,g\u0093_ùÄ\u009eJßÌ|6åR´Qf¸¥6j»:Î«²C\u0012èÖ±1Qn2ÿ+\u001bkêOYÔígëõ±,\u0089ª\u008d8Äécc¦\u0003\u001bäQó\u0087ò±ä\u001b×\u000f\u0093ø*«q\tÝX\u009698\u0016i\u009cò\u009e%\u0001íÆ«_\u0002M\u008aK\u0012Ñ÷\u0006\tìlª±ÿRñ#:\u009d>ûân{4\u0082)ÓÄ\u008eh¦&(Õ\u001f\t\"\u0097Va\u0091é\nN¡\u0006<Q´_9µ}\u008dT1Ù]ioÜ\u001fÚ@\u00883µ\u0087ã=\u001d\u0005$û\u0004ÛÒ\u0004³\u009aÔJý\u008c/[æ{\u0097(D¿û»¢Ô®oì¤\u00adÇåÿìQ\u0080[Æ9\u0084g\u009d^\rAf\u009b¾4ÍÍZ\u0012wã\u0018\u007f¸*U\u0018F\u009dãí²Npê*\u0012YÃà¼¡MS\u008fº\u0019\u0092åóPTØV\u001b\u000eOÄm\u000e\u008fòÁ×\u001f\u0086s¤\u0092éà¤H/`\u0098\f\u00861\u0095e\u0099\u0000<§þ¿|\u0097ü±3\u00ad\u0005\u0015\r9Ëí\u001bõ\u0007\u0098Ë\u001e\u0001t{ÿ\u001b $\u008cbë\u0093jRá?í¿à\u000e\u0012\u0080<ðÛ>%gîÅ\u001fg[\rB¬\u0012<1Î¡Kû$Lá\u009có©\u0089]fU\u0000\u00adî\u0099à*°\u0083\u0083\u009dºvö7\u0003Â¼e» |¾L\u0083°B|\u0093Ò.IÏaÖ\u0010*ÎÆ\u0095Ï\u0011øoðFL¢?\u0094\u0085\u007fÚ\u0014lB£ã]õ\u0018_Û{HÐXB.¤x¸\u0016T\u000fN\u008e_ê\u0099¹S¤\u0006¬A\u0084/±L+â\u001c¼\u0095\u0001r·\u0097¿n1\u0084o8ªÑ\u008d`LzÌ\u0080|fSdÕ³¢\u001d\u001b\u008d6;²ðh\u0084=F©Xqñ^\u00adÍ\u00837\u0090\u0017â¢^è;Dµ¨jêø=\u0083í~Ì\u0018\u007f§Ìø\u0084å*nzv]Ã¨NÆ§¬Û\u0089Üò\u0086úÔ\u0016K=¾uï\u0002\u0000Þ\u0090\u0015¢µÛ\u0014(p\u009bg>X\rG²Ý~EM"
                        .length();
                     byte var13 = 0;

                     label63:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var40 = var17;
                        var10001 = var14++;
                        long var61 = ((long)var18[0] & 255L) << 56
                           | ((long)var18[1] & 255L) << 48
                           | ((long)var18[2] & 255L) << 40
                           | ((long)var18[3] & 255L) << 32
                           | ((long)var18[4] & 255L) << 24
                           | ((long)var18[5] & 255L) << 16
                           | ((long)var18[6] & 255L) << 8
                           | (long)var18[7] & 255L;
                        byte var67 = -1;

                        while (true) {
                           long var19 = var61;
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
                           long var72 = ((long)var21[0] & 255L) << 56
                              | ((long)var21[1] & 255L) << 48
                              | ((long)var21[2] & 255L) << 40
                              | ((long)var21[3] & 255L) << 32
                              | ((long)var21[4] & 255L) << 24
                              | ((long)var21[5] & 255L) << 16
                              | ((long)var21[6] & 255L) << 8
                              | (long)var21[7] & 255L;
                           switch (var67) {
                              case 0:
                                 var40[var10001] = var72;
                                 if (var13 >= var16) {
                                    n = var17;
                                    o = new Integer[75];
                                    v = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[36];
                                    int var3 = 0;
                                    String var4 = "\u008e\u0090ã\u0001âAF\u0085\u0092\u0080kéAB¢bp\u0087[)/¥âÜ«\u0013³{?¾Ò_±c¹¤ü\u001a\u008bi\rRÜÇy<'\u001f\u000b\u0011ÊãXÅEßm¢ûô\u009d,\u0093,$ø£9÷\u0095\u0089&j\u0005\u008b£:\u0012P@\u008dg$\u0080\nî&L>BYÌ\"¯\u009b\u0081nÛ°0h¶mØb?ó¡»\r\u0097)#& \u0085Ä4\nc\u0088\u0099\\\u008eËÀ')Ú\u008aðÏ\u0093ä\f\u000fßÎ¹e¨c\f`6¶/\u0000T\u0019p>¸xéqR¤ì&\u0084L,\u000ecÄ,\u0012Ø\u0017\u0014É¢y»\u00ad&°1dE)Þ2\u0098!\u0007´Ä\u001a)[øO\u0089qw\u0001Ýj@N\u0086o¾\u0004#ú\u0097\u0004rçe;Ì\u0096\u0096£¾p\u0087\u0080\u001d>O\by\u0090N{Ã\u0014Þ\u001dï\u000b\u009ccôU~Ô\u0097aÆ#mÞ\u00ad¡$åº<ý\u008e¿\u0085Ð%ß_~l¯=Ä\u0094³'ÎÀ";
                                    int var5 = "\u008e\u0090ã\u0001âAF\u0085\u0092\u0080kéAB¢bp\u0087[)/¥âÜ«\u0013³{?¾Ò_±c¹¤ü\u001a\u008bi\rRÜÇy<'\u001f\u000b\u0011ÊãXÅEßm¢ûô\u009d,\u0093,$ø£9÷\u0095\u0089&j\u0005\u008b£:\u0012P@\u008dg$\u0080\nî&L>BYÌ\"¯\u009b\u0081nÛ°0h¶mØb?ó¡»\r\u0097)#& \u0085Ä4\nc\u0088\u0099\\\u008eËÀ')Ú\u008aðÏ\u0093ä\f\u000fßÎ¹e¨c\f`6¶/\u0000T\u0019p>¸xéqR¤ì&\u0084L,\u000ecÄ,\u0012Ø\u0017\u0014É¢y»\u00ad&°1dE)Þ2\u0098!\u0007´Ä\u001a)[øO\u0089qw\u0001Ýj@N\u0086o¾\u0004#ú\u0097\u0004rçe;Ì\u0096\u0096£¾p\u0087\u0080\u001d>O\by\u0090N{Ã\u0014Þ\u001dï\u000b\u009ccôU~Ô\u0097aÆ#mÞ\u00ad¡$åº<ý\u008e¿\u0085Ð%ß_~l¯=Ä\u0094³'ÎÀ"
                                       .length();
                                    byte var2 = 0;

                                    label47:
                                    while (true) {
                                       int var51 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
                                       long[] var42 = var6;
                                       var51 = var3++;
                                       long var64 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var70 = -1;

                                       while (true) {
                                          long var8 = var64;
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
                                          var72 = ((long)var10[0] & 255L) << 56
                                             | ((long)var10[1] & 255L) << 48
                                             | ((long)var10[2] & 255L) << 40
                                             | ((long)var10[3] & 255L) << 32
                                             | ((long)var10[4] & 255L) << 24
                                             | ((long)var10[5] & 255L) << 16
                                             | ((long)var10[6] & 255L) << 8
                                             | (long)var10[7] & 255L;
                                          switch (var70) {
                                             case 0:
                                                var42[var51] = var72;
                                                if (var2 >= var5) {
                                                   t = var6;
                                                   u = new Long[36];
                                                   x44.a<"t">(x44.a<"l">(-6611933940267634593L, var31), -4946697885542661039L, var31);
                                                   e = new long[]{
                                                      0L, 0L, c<"l">(10773, 2628244492357104235L ^ var31), c<"l">(19971, 1232168249356162669L ^ var31)
                                                   };
                                                   long var54 = 5072027674714460404L ^ var31;
                                                   i = new long[]{
                                                      c<"l">(17336, 6699428001414126557L ^ var31),
                                                      c<"l">(19971, 1232168249356162669L ^ var31),
                                                      c<"l">(19971, 1232168249356162669L ^ var31),
                                                      c<"l">(19971, 1232168249356162669L ^ var31)
                                                   };
                                                   b = new int[0];
                                                   String[] var43 = new String[b<"c">(15183, var54)];
                                                   var43[0] = "";
                                                   var43[1] = null;
                                                   var43[2] = null;
                                                   var43[3] = null;
                                                   var43[4] = null;
                                                   var43[5] = null;
                                                   var43[b<"c">(4356, 426849120352729761L ^ var31)] = null;
                                                   var43[b<"c">(1685, 5731642498195582247L ^ var31)] = null;
                                                   var43[b<"c">(29425, 9218779143450106159L ^ var31)] = null;
                                                   var43[b<"c">(29050, 2106620539322866410L ^ var31)] = null;
                                                   var43[b<"c">(12227, 454651936142640194L ^ var31)] = null;
                                                   var43[b<"c">(11361, 3727350282592241631L ^ var31)] = "\ufeff";
                                                   var43[b<"c">(17576, 1027228927055212415L ^ var31)] = "\n";
                                                   var43[b<"c">(32673, 3350975985087943707L ^ var31)] = "\r";
                                                   var43[b<"c">(26469, 8508118982256954571L ^ var31)] = "(";
                                                   var43[b<"c">(20778, 415642145023376012L ^ var31)] = ")";
                                                   var43[b<"c">(8764, 8051642545498966415L ^ var31)] = "[";
                                                   var43[b<"c">(12404, 8111007580888620019L ^ var31)] = "]";
                                                   var43[b<"c">(17913, 8607522572343291478L ^ var31)] = ",";
                                                   var43[b<"c">(9355, 7580512823500361501L ^ var31)] = "/";
                                                   var43[b<"c">(7757, 5523343273613194747L ^ var31)] = ".";
                                                   var43[b<"c">(29157, 8822189239828093533L ^ var31)] = ":";
                                                   var43[b<"c">(7662, 2051143329820210783L ^ var31)] = a<"k">(29898, 1596335384971272856L ^ var31);
                                                   var43[b<"c">(23484, 9115390634800689175L ^ var31)] = a<"k">(16297, 6952298826442090996L ^ var31);
                                                   var43[b<"c">(31652, 3012760586517090350L ^ var31)] = a<"k">(17773, 2881349344944902974L ^ var31);
                                                   var43[b<"c">(28700, 4729592230599990179L ^ var31)] = a<"k">(27619, 2292021044959149503L ^ var31);
                                                   var43[b<"c">(25848, 1895067593998471017L ^ var31)] = null;
                                                   var43[b<"c">(26544, 7464043972768631837L ^ var31)] = null;
                                                   var43[b<"c">(22079, 5751777039943450014L ^ var31)] = null;
                                                   var43[b<"c">(29088, 4640810112934943253L ^ var31)] = null;
                                                   var43[b<"c">(13393, 1754328387568918466L ^ var31)] = null;
                                                   B = var43;
                                                   f = new String[]{
                                                      a<"k">(32386, 4966901668770146519L ^ var31),
                                                      a<"k">(28655, 188106990867610047L ^ var31),
                                                      a<"k">(18235, 51874481084158317L ^ var31),
                                                      a<"k">(27739, 8124909368531352076L ^ var31),
                                                      a<"k">(17274, 5390629419538994478L ^ var31)
                                                   };
                                                   int[] var44 = new int[b<"c">(3510, 5135931013503477266L ^ var31)];
                                                   var44[0] = -1;
                                                   var44[1] = -1;
                                                   var44[2] = -1;
                                                   var44[3] = -1;
                                                   var44[4] = 1;
                                                   var44[5] = 2;
                                                   var44[b<"c">(4356, 426849120352729761L ^ var31)] = 3;
                                                   var44[b<"c">(1685, 5731642498195582247L ^ var31)] = 0;
                                                   var44[b<"c">(29425, 9218779143450106159L ^ var31)] = 0;
                                                   var44[b<"c">(29050, 2106620539322866410L ^ var31)] = 0;
                                                   var44[b<"c">(12227, 454651936142640194L ^ var31)] = -1;
                                                   var44[b<"c">(11791, 1205001054871209344L ^ var31)] = -1;
                                                   var44[b<"c">(29480, 4672955045192112309L ^ var31)] = -1;
                                                   var44[b<"c">(32673, 3350975985087943707L ^ var31)] = -1;
                                                   var44[b<"c">(25309, 6879350525833775439L ^ var31)] = -1;
                                                   var44[b<"c">(31393, 5484874118439637295L ^ var31)] = -1;
                                                   var44[b<"c">(28736, 1995596938482326506L ^ var31)] = -1;
                                                   var44[b<"c">(16167, 2535557353971176689L ^ var31)] = -1;
                                                   var44[b<"c">(2424, 239696767383429869L ^ var31)] = -1;
                                                   var44[b<"c">(27993, 3896698642716985061L ^ var31)] = -1;
                                                   var44[b<"c">(23586, 1781137046821812215L ^ var31)] = -1;
                                                   var44[b<"c">(31098, 8268872011600204509L ^ var31)] = -1;
                                                   var44[b<"c">(19862, 773046444726035976L ^ var31)] = -1;
                                                   var44[b<"c">(3536, 888201873758807567L ^ var31)] = -1;
                                                   var44[b<"c">(4889, 4311789967778281602L ^ var31)] = -1;
                                                   var44[b<"c">(16181, 2278353572101182697L ^ var31)] = -1;
                                                   var44[b<"c">(25427, 4918960221373171920L ^ var31)] = 4;
                                                   var44[b<"c">(26668, 1169395257989530510L ^ var31)] = 0;
                                                   var44[b<"c">(18509, 2068777558449693658L ^ var31)] = -1;
                                                   var44[b<"c">(1827, 811330220782513300L ^ var31)] = -1;
                                                   var44[b<"c">(28126, 4699719156178159190L ^ var31)] = -1;
                                                   M = var44;
                                                   w = new long[]{c<"l">(2803, 3906921066977481372L ^ var31)};
                                                   long var55 = 426849120352729761L ^ var31;
                                                   c = new long[]{c<"l">(26584, 8145197798164578217L ^ var31)};
                                                   N = new long[]{c<"l">(27619, 2191393682207814545L ^ var31)};
                                                   l = new long[]{c<"l">(30800, 1116586302537932855L ^ var31)};
                                                   Y = new int[b<"c">(4356, var55)];
                                                   A = new int[b<"c">(29480, 4672955045192112309L ^ var31)];
                                                   g = new StringBuilder();
                                                   x44.a<"t">(x44.a<"l">(-6848053522596970285L, var31), -4814446022094185474L, var31);
                                                   x44.a<"t">(0, -5070380496737503361L, var31);
                                                   x44.a<"t">(0, -4681092223655705490L, var31);
                                                   return;
                                                }
                                                break;
                                             default:
                                                var42[var51] = var72;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "Púé¦¾\u0082ADÜÉùNçícj";
                                                var5 = "Púé¦¾\u0082ADÜÉùNçícj".length();
                                                var2 = 0;
                                          }

                                          byte var53 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
                                          var42 = var6;
                                          var51 = var3++;
                                          var64 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var70 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var40[var10001] = var72;
                                 if (var13 < var16) {
                                    continue label63;
                                 }

                                 var15 = "\u0092QÎô¸L\u0091µý\u001c?vR,ÉÅ";
                                 var16 = "\u0092QÎô¸L\u0091µý\u001c?vR,ÉÅ".length();
                                 var13 = 0;
                           }

                           byte var50 = var13;
                           var13 += 8;
                           var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                           var40 = var17;
                           var10001 = var14++;
                           var61 = ((long)var18[0] & 255L) << 56
                              | ((long)var18[1] & 255L) << 48
                              | ((long)var18[2] & 255L) << 40
                              | ((long)var18[3] & 255L) << 32
                              | ((long)var18[4] & 255L) << 24
                              | ((long)var18[5] & 255L) << 16
                              | ((long)var18[6] & 255L) << 8
                              | (long)var18[7] & 255L;
                           var67 = 0;
                        }
                     }
                  }

                  var25 = var26.charAt(var36);
                  break;
               default:
                  var29[var27++] = var57;
                  if ((var36 += var25) < var28) {
                     var25 = var26.charAt(var36);
                     continue label81;
                  }

                  var26 = "Gmk±4[³\u0097z\u001d\u009c&ûE¤`\u001e³\u000f\u0093w3/\u0094=©E¿\u0088#qº\u0010RÑ¹ï\n\u0001\u0004~I\u000eìÊü@)¾";
                  var28 = "Gmk±4[³\u0097z\u001d\u009c&ûE¤`\u001e³\u000f\u0093w3/\u0094=©E¿\u0088#qº\u0010RÑ¹ï\n\u0001\u0004~I\u000eìÊü@)¾".length();
                  var25 = ' ';
                  var36 = -1;
            }

            var37 = var26.substring(++var36, var36 + var25);
            var10001 = 0;
         }
      }
   }

   private static int n(Object[] param0) {
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
      // 0c: getstatic com/zelix/e_.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: lload 1
      // 13: dup2
      // 14: ldc2_w 138581848951673
      // 17: lxor
      // 18: lstore 3
      // 19: pop2
      // 1a: ldc2_w 68701271755040715
      // 1d: lload 1
      // 1e: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: istore 5
      // 25: ldc2_w 127669828863395737
      // 28: lload 1
      // 29: invokedynamic l (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: iload 5
      // 30: ifeq 87
      // 33: lookupswitch 83 1 42 27
      // 44: ldc2_w 352141030562619138
      // 47: lload 1
      // 48: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: sipush 10431
      // 51: ldc2_w 5787456154472927038
      // 54: lload 1
      // 55: lxor
      // 56: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: lload 3
      // 5c: bipush 2
      // 5d: anewarray 378
      // 60: dup_x2
      // 61: dup_x2
      // 62: pop
      // 63: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66: bipush 1
      // 67: swap
      // 68: aastore
      // 69: dup_x2
      // 6a: dup_x2
      // 6b: pop
      // 6c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f: bipush 0
      // 70: swap
      // 71: aastore
      // 72: ldc2_w 481454219898575987
      // 75: lload 1
      // 76: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: ireturn
      // 7c: ldc2_w 352141030562619138
      // 7f: lload 1
      // 80: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: bipush 1
      // 87: ireturn
   }

   private static int T(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/e_.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 126911081439320
      // 021: lxor
      // 022: lstore 5
      // 024: dup2
      // 025: ldc2_w 129446660611667
      // 028: lxor
      // 029: lstore 7
      // 02b: pop2
      // 02c: ldc2_w -2602396823844586275
      // 02f: lload 3
      // 030: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: istore 9
      // 037: ldc2_w -2610290931416595843
      // 03a: lload 3
      // 03b: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: pop
      // 041: lload 7
      // 043: bipush 1
      // 044: anewarray 378
      // 047: dup_x2
      // 048: dup_x2
      // 049: pop
      // 04a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04d: bipush 0
      // 04e: swap
      // 04f: aastore
      // 050: ldc2_w -4263504245263944227
      // 053: lload 3
      // 054: invokedynamic s (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: ldc2_w -2678536110740546417
      // 05c: lload 3
      // 05d: invokedynamic r (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: goto 069
      // 065: astore 10
      // 067: bipush 1
      // 068: ireturn
      // 069: ldc2_w -2678536110740546417
      // 06c: lload 3
      // 06d: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: iload 9
      // 074: ifeq 107
      // 077: lookupswitch 143 1 47 27
      // 088: ldc2_w -2308815023885614060
      // 08b: lload 3
      // 08c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: lload 1
      // 093: sipush 5726
      // 096: ldc2_w 7285992319073561302
      // 099: lload 3
      // 09a: lxor
      // 09b: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: land
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iload 9
      // 0a5: ifeq 109
      // 0a8: goto 0b5
      // 0ab: ldc2_w -2308815023885614060
      // 0ae: lload 3
      // 0af: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: ifeq 108
      // 0b8: goto 0c5
      // 0bb: ldc2_w -2308815023885614060
      // 0be: lload 3
      // 0bf: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: bipush 1
      // 0c6: lload 5
      // 0c8: sipush 29050
      // 0cb: ldc2_w 2106602221572128260
      // 0ce: lload 3
      // 0cf: lxor
      // 0d0: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: bipush 3
      // 0d6: anewarray 378
      // 0d9: dup_x1
      // 0da: swap
      // 0db: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0de: bipush 2
      // 0df: swap
      // 0e0: aastore
      // 0e1: dup_x2
      // 0e2: dup_x2
      // 0e3: pop
      // 0e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e7: bipush 1
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: ldc2_w -2346636908801272960
      // 0f5: lload 3
      // 0f6: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: ireturn
      // 0fc: ldc2_w -2308815023885614060
      // 0ff: lload 3
      // 100: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 2
      // 107: ireturn
      // 108: bipush 2
      // 109: ireturn
   }

   private static int W(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/e_.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 38353070548296
      // 021: lxor
      // 022: lstore 5
      // 024: dup2
      // 025: ldc2_w 39815067278147
      // 028: lxor
      // 029: lstore 7
      // 02b: pop2
      // 02c: ldc2_w -2381774812014216755
      // 02f: lload 3
      // 030: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: istore 9
      // 037: ldc2_w -2389665689646037139
      // 03a: lload 3
      // 03b: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: pop
      // 041: lload 7
      // 043: bipush 1
      // 044: anewarray 378
      // 047: dup_x2
      // 048: dup_x2
      // 049: pop
      // 04a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04d: bipush 0
      // 04e: swap
      // 04f: aastore
      // 050: ldc2_w -4484269150647865139
      // 053: lload 3
      // 054: invokedynamic s (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: ldc2_w -2322806187541079649
      // 05c: lload 3
      // 05d: invokedynamic r (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: goto 069
      // 065: astore 10
      // 067: bipush 1
      // 068: ireturn
      // 069: ldc2_w -2322806187541079649
      // 06c: lload 3
      // 06d: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: iload 9
      // 074: ifeq 107
      // 077: lookupswitch 143 1 47 27
      // 088: ldc2_w -2673693992046132988
      // 08b: lload 3
      // 08c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: lload 1
      // 093: sipush 29521
      // 096: ldc2_w 7156761111271230150
      // 099: lload 3
      // 09a: lxor
      // 09b: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: land
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iload 9
      // 0a5: ifeq 109
      // 0a8: goto 0b5
      // 0ab: ldc2_w -2673693992046132988
      // 0ae: lload 3
      // 0af: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: ifeq 108
      // 0b8: goto 0c5
      // 0bb: ldc2_w -2673693992046132988
      // 0be: lload 3
      // 0bf: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: bipush 1
      // 0c6: lload 5
      // 0c8: sipush 29425
      // 0cb: ldc2_w 9218834298980595921
      // 0ce: lload 3
      // 0cf: lxor
      // 0d0: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: bipush 3
      // 0d6: anewarray 378
      // 0d9: dup_x1
      // 0da: swap
      // 0db: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0de: bipush 2
      // 0df: swap
      // 0e0: aastore
      // 0e1: dup_x2
      // 0e2: dup_x2
      // 0e3: pop
      // 0e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e7: bipush 1
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: ldc2_w -2702366866476870000
      // 0f5: lload 3
      // 0f6: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: ireturn
      // 0fc: ldc2_w -2673693992046132988
      // 0ff: lload 3
      // 100: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 2
      // 107: ireturn
      // 108: bipush 2
      // 109: ireturn
   }

   private static int Z(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 3
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 1
      // 025: lxor
      // 026: lstore 1
      // 027: lload 1
      // 028: dup2
      // 029: ldc2_w 21374571357333
      // 02c: lxor
      // 02d: lstore 5
      // 02f: dup2
      // 030: ldc2_w 14902313216732
      // 033: lxor
      // 034: lstore 7
      // 036: dup2
      // 037: ldc2_w 60369213155294
      // 03a: lxor
      // 03b: dup2
      // 03c: bipush 16
      // 03e: lushr
      // 03f: lstore 9
      // 041: dup2
      // 042: bipush 48
      // 044: lshl
      // 045: bipush 48
      // 047: lushr
      // 048: l2i
      // 049: istore 11
      // 04b: pop2
      // 04c: dup2
      // 04d: ldc2_w 27480584489947
      // 050: lxor
      // 051: lstore 12
      // 053: dup2
      // 054: ldc2_w 15562523792180
      // 057: lxor
      // 058: lstore 14
      // 05a: pop2
      // 05b: bipush 0
      // 05c: istore 17
      // 05e: sipush 4356
      // 061: ldc2_w 426748122715018024
      // 064: lload 1
      // 065: lxor
      // 066: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: ldc2_w 1051439355288502001
      // 06e: lload 1
      // 06f: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: bipush 1
      // 075: istore 18
      // 077: ldc2_w 911094433180511268
      // 07a: lload 1
      // 07b: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: ldc2_w 1275258353934112770
      // 083: lload 1
      // 084: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: bipush 0
      // 08a: iload 4
      // 08c: iastore
      // 08d: istore 16
      // 08f: sipush 8216
      // 092: ldc2_w 1319533043410199107
      // 095: lload 1
      // 096: lxor
      // 097: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: istore 19
      // 09e: ldc2_w 1105903685233754164
      // 0a1: lload 1
      // 0a2: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: bipush 1
      // 0a8: iadd
      // 0a9: dup
      // 0aa: ldc2_w 1105903685233754164
      // 0ad: lload 1
      // 0ae: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: sipush 8216
      // 0b6: ldc2_w 1319533043410199107
      // 0b9: lload 1
      // 0ba: lxor
      // 0bb: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: if_icmpne 106
      // 0c3: iload 16
      // 0c5: lload 1
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: iflt 10f
      // 0cb: lload 1
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: ifle 5fc
      // 0d1: ifne 5f3
      // 0d4: goto 0e1
      // 0d7: ldc2_w 1338144596185336179
      // 0da: lload 1
      // 0db: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: lload 5
      // 0e3: bipush 1
      // 0e4: anewarray 378
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: ldc2_w 625472274289627801
      // 0f3: lload 1
      // 0f4: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: goto 106
      // 0fc: ldc2_w 1338144596185336179
      // 0ff: lload 1
      // 100: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: ldc2_w 1708155106929283560
      // 109: lload 1
      // 10a: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: sipush 23051
      // 112: ldc2_w 8793060598892107787
      // 115: lload 1
      // 116: lxor
      // 117: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: iload 16
      // 11e: lload 1
      // 11f: lconst_0
      // 120: lcmp
      // 121: iflt 60b
      // 124: ifne 609
      // 127: if_icmpge 5f3
      // 12a: goto 137
      // 12d: ldc2_w 1338144596185336179
      // 130: lload 1
      // 131: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: lconst_1
      // 138: ldc2_w 1708155106929283560
      // 13b: lload 1
      // 13c: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: lshl
      // 142: lstore 20
      // 144: ldc2_w 1275258353934112770
      // 147: lload 1
      // 148: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: iinc 18 -1
      // 150: iload 18
      // 152: iaload
      // 153: tableswitch 1149 0 5 447 553 656 37 761 959
      // 178: sipush 31813
      // 17b: ldc2_w 4953654731023486367
      // 17e: lload 1
      // 17f: lxor
      // 180: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: lload 20
      // 187: land
      // 188: lconst_0
      // 189: lcmp
      // 18a: iload 16
      // 18c: lload 1
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: iflt 224
      // 192: ifne 222
      // 195: ifeq 219
      // 198: goto 1a5
      // 19b: ldc2_w 1338144596185336179
      // 19e: lload 1
      // 19f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: iload 19
      // 1a7: lload 1
      // 1a8: lconst_0
      // 1a9: lcmp
      // 1aa: iflt 210
      // 1ad: iload 16
      // 1af: ifne 1ec
      // 1b2: goto 1bf
      // 1b5: ldc2_w 1338144596185336179
      // 1b8: lload 1
      // 1b9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: athrow
      // 1bf: sipush 28126
      // 1c2: ldc2_w 4699688211904507871
      // 1c5: lload 1
      // 1c6: lxor
      // 1c7: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: if_icmple 1eb
      // 1cf: goto 1dc
      // 1d2: ldc2_w 1338144596185336179
      // 1d5: lload 1
      // 1d6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: sipush 28126
      // 1df: ldc2_w 4699688211904507871
      // 1e2: lload 1
      // 1e3: lxor
      // 1e4: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: istore 19
      // 1eb: bipush 5
      // 1ec: lload 7
      // 1ee: dup2_x1
      // 1ef: pop2
      // 1f0: bipush 2
      // 1f1: anewarray 378
      // 1f4: dup_x1
      // 1f5: swap
      // 1f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f9: bipush 1
      // 1fa: swap
      // 1fb: aastore
      // 1fc: dup_x2
      // 1fd: dup_x2
      // 1fe: pop
      // 1ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 202: bipush 0
      // 203: swap
      // 204: aastore
      // 205: ldc2_w 1079105179619621365
      // 208: lload 1
      // 209: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: iload 16
      // 210: lload 1
      // 211: lconst_0
      // 212: lcmp
      // 213: iflt 27a
      // 216: ifeq 277
      // 219: ldc2_w 1708155106929283560
      // 21c: lload 1
      // 21d: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: iload 16
      // 224: lload 1
      // 225: lconst_0
      // 226: lcmp
      // 227: iflt 28b
      // 22a: ifne 289
      // 22d: sipush 697
      // 230: ldc2_w 855125357701447808
      // 233: lload 1
      // 234: lxor
      // 235: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: if_icmpne 277
      // 23d: goto 24a
      // 240: ldc2_w 1338144596185336179
      // 243: lload 1
      // 244: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: ldc2_w 1275258353934112770
      // 24d: lload 1
      // 24e: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: ldc2_w 1051439355288502001
      // 256: lload 1
      // 257: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: dup
      // 25d: bipush 1
      // 25e: iadd
      // 25f: ldc2_w 1051439355288502001
      // 262: lload 1
      // 263: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: bipush 2
      // 269: iastore
      // 26a: goto 277
      // 26d: ldc2_w 1338144596185336179
      // 270: lload 1
      // 271: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: athrow
      // 277: sipush 17826
      // 27a: ldc2_w 6848935115135202399
      // 27d: lload 1
      // 27e: lxor
      // 27f: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: lload 20
      // 286: land
      // 287: lconst_0
      // 288: lcmp
      // 289: iload 16
      // 28b: ifne 5d2
      // 28e: ifeq 5d0
      // 291: goto 29e
      // 294: ldc2_w 1338144596185336179
      // 297: lload 1
      // 298: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: athrow
      // 29e: iload 19
      // 2a0: lload 1
      // 2a1: lconst_0
      // 2a2: lcmp
      // 2a3: ifle 309
      // 2a6: iload 16
      // 2a8: ifne 2e5
      // 2ab: goto 2b8
      // 2ae: ldc2_w 1338144596185336179
      // 2b1: lload 1
      // 2b2: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: sipush 1827
      // 2bb: ldc2_w 811220379001832733
      // 2be: lload 1
      // 2bf: lxor
      // 2c0: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: if_icmple 2e4
      // 2c8: goto 2d5
      // 2cb: ldc2_w 1338144596185336179
      // 2ce: lload 1
      // 2cf: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: athrow
      // 2d5: sipush 1827
      // 2d8: ldc2_w 811220379001832733
      // 2db: lload 1
      // 2dc: lxor
      // 2dd: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: istore 19
      // 2e4: bipush 4
      // 2e5: lload 7
      // 2e7: dup2_x1
      // 2e8: pop2
      // 2e9: bipush 2
      // 2ea: anewarray 378
      // 2ed: dup_x1
      // 2ee: swap
      // 2ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2f2: bipush 1
      // 2f3: swap
      // 2f4: aastore
      // 2f5: dup_x2
      // 2f6: dup_x2
      // 2f7: pop
      // 2f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fb: bipush 0
      // 2fc: swap
      // 2fd: aastore
      // 2fe: ldc2_w 1079105179619621365
      // 301: lload 1
      // 302: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: iload 16
      // 309: lload 1
      // 30a: lconst_0
      // 30b: lcmp
      // 30c: iflt 31b
      // 30f: ifeq 5d0
      // 312: ldc2_w 1708155106929283560
      // 315: lload 1
      // 316: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: sipush 5780
      // 31e: ldc2_w 8939688019439342729
      // 321: lload 1
      // 322: lxor
      // 323: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 328: iload 16
      // 32a: ifne 5d4
      // 32d: goto 33a
      // 330: ldc2_w 1338144596185336179
      // 333: lload 1
      // 334: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: athrow
      // 33a: if_icmpne 5d0
      // 33d: goto 34a
      // 340: ldc2_w 1338144596185336179
      // 343: lload 1
      // 344: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 349: athrow
      // 34a: ldc2_w 1275258353934112770
      // 34d: lload 1
      // 34e: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: ldc2_w 1051439355288502001
      // 356: lload 1
      // 357: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: dup
      // 35d: bipush 1
      // 35e: iadd
      // 35f: ldc2_w 1051439355288502001
      // 362: lload 1
      // 363: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: bipush 1
      // 369: iastore
      // 36a: iload 16
      // 36c: ifeq 5d0
      // 36f: goto 37c
      // 372: ldc2_w 1338144596185336179
      // 375: lload 1
      // 376: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37b: athrow
      // 37c: sipush 32590
      // 37f: ldc2_w 7404006515585191600
      // 382: lload 1
      // 383: lxor
      // 384: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 389: lload 20
      // 38b: land
      // 38c: lconst_0
      // 38d: lcmp
      // 38e: iload 16
      // 390: ifne 5d2
      // 393: goto 3a0
      // 396: ldc2_w 1338144596185336179
      // 399: lload 1
      // 39a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39f: athrow
      // 3a0: ifeq 5d0
      // 3a3: goto 3b0
      // 3a6: ldc2_w 1338144596185336179
      // 3a9: lload 1
      // 3aa: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3af: athrow
      // 3b0: iload 19
      // 3b2: bipush 5
      // 3b3: iload 16
      // 3b5: ifne 5d4
      // 3b8: goto 3c5
      // 3bb: ldc2_w 1338144596185336179
      // 3be: lload 1
      // 3bf: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c4: athrow
      // 3c5: if_icmple 5d0
      // 3c8: goto 3d5
      // 3cb: ldc2_w 1338144596185336179
      // 3ce: lload 1
      // 3cf: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d4: athrow
      // 3d5: bipush 5
      // 3d6: istore 19
      // 3d8: iload 16
      // 3da: lload 1
      // 3db: lconst_0
      // 3dc: lcmp
      // 3dd: ifle 3ec
      // 3e0: ifeq 5d0
      // 3e3: ldc2_w 1708155106929283560
      // 3e6: lload 1
      // 3e7: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ec: bipush 80
      // 3ee: ldc2_w 416520326431195748
      // 3f1: lload 1
      // 3f2: lxor
      // 3f3: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f8: iload 16
      // 3fa: ifne 5d4
      // 3fd: goto 40a
      // 400: ldc2_w 1338144596185336179
      // 403: lload 1
      // 404: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 409: athrow
      // 40a: if_icmpne 5d0
      // 40d: goto 41a
      // 410: ldc2_w 1338144596185336179
      // 413: lload 1
      // 414: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 419: athrow
      // 41a: ldc2_w 1275258353934112770
      // 41d: lload 1
      // 41e: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 423: ldc2_w 1051439355288502001
      // 426: lload 1
      // 427: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42c: dup
      // 42d: bipush 1
      // 42e: iadd
      // 42f: ldc2_w 1051439355288502001
      // 432: lload 1
      // 433: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 438: bipush 0
      // 439: iastore
      // 43a: iload 16
      // 43c: ifeq 5d0
      // 43f: goto 44c
      // 442: ldc2_w 1338144596185336179
      // 445: lload 1
      // 446: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: athrow
      // 44c: sipush 13710
      // 44f: ldc2_w 7168485622896673915
      // 452: lload 1
      // 453: lxor
      // 454: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: lload 20
      // 45b: land
      // 45c: lconst_0
      // 45d: lcmp
      // 45e: iload 16
      // 460: lload 1
      // 461: lconst_0
      // 462: lcmp
      // 463: iflt 4b5
      // 466: ifne 4ad
      // 469: goto 476
      // 46c: ldc2_w 1338144596185336179
      // 46f: lload 1
      // 470: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 475: athrow
      // 476: lload 1
      // 477: lconst_0
      // 478: lcmp
      // 479: iflt 4a0
      // 47c: ifne 49e
      // 47f: goto 48c
      // 482: ldc2_w 1338144596185336179
      // 485: lload 1
      // 486: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48b: athrow
      // 48c: iload 16
      // 48e: ifeq 5d0
      // 491: goto 49e
      // 494: ldc2_w 1338144596185336179
      // 497: lload 1
      // 498: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49d: athrow
      // 49e: iload 19
      // 4a0: goto 4ad
      // 4a3: ldc2_w 1338144596185336179
      // 4a6: lload 1
      // 4a7: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ac: athrow
      // 4ad: lload 1
      // 4ae: lconst_0
      // 4af: lcmp
      // 4b0: iflt 509
      // 4b3: iload 16
      // 4b5: ifne 4e5
      // 4b8: sipush 1827
      // 4bb: ldc2_w 811220379001832733
      // 4be: lload 1
      // 4bf: lxor
      // 4c0: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: if_icmple 4e4
      // 4c8: goto 4d5
      // 4cb: ldc2_w 1338144596185336179
      // 4ce: lload 1
      // 4cf: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d4: athrow
      // 4d5: sipush 1827
      // 4d8: ldc2_w 811220379001832733
      // 4db: lload 1
      // 4dc: lxor
      // 4dd: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e2: istore 19
      // 4e4: bipush 4
      // 4e5: lload 7
      // 4e7: dup2_x1
      // 4e8: pop2
      // 4e9: bipush 2
      // 4ea: anewarray 378
      // 4ed: dup_x1
      // 4ee: swap
      // 4ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4f2: bipush 1
      // 4f3: swap
      // 4f4: aastore
      // 4f5: dup_x2
      // 4f6: dup_x2
      // 4f7: pop
      // 4f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4fb: bipush 0
      // 4fc: swap
      // 4fd: aastore
      // 4fe: ldc2_w 1079105179619621365
      // 501: lload 1
      // 502: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 507: iload 16
      // 509: lload 1
      // 50a: lconst_0
      // 50b: lcmp
      // 50c: iflt 524
      // 50f: ifeq 5d0
      // 512: sipush 27234
      // 515: ldc2_w 2221754568045894557
      // 518: lload 1
      // 519: lxor
      // 51a: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51f: lload 20
      // 521: land
      // 522: lconst_0
      // 523: lcmp
      // 524: iload 16
      // 526: lload 1
      // 527: lconst_0
      // 528: lcmp
      // 529: iflt 575
      // 52c: ifne 573
      // 52f: goto 53c
      // 532: ldc2_w 1338144596185336179
      // 535: lload 1
      // 536: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53b: athrow
      // 53c: lload 1
      // 53d: lconst_0
      // 53e: lcmp
      // 53f: ifle 566
      // 542: ifne 564
      // 545: goto 552
      // 548: ldc2_w 1338144596185336179
      // 54b: lload 1
      // 54c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 551: athrow
      // 552: iload 16
      // 554: ifeq 5d0
      // 557: goto 564
      // 55a: ldc2_w 1338144596185336179
      // 55d: lload 1
      // 55e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 563: athrow
      // 564: iload 19
      // 566: goto 573
      // 569: ldc2_w 1338144596185336179
      // 56c: lload 1
      // 56d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 572: athrow
      // 573: iload 16
      // 575: lload 1
      // 576: lconst_0
      // 577: lcmp
      // 578: iflt 58b
      // 57b: ifne 5ab
      // 57e: sipush 28126
      // 581: ldc2_w 4699688211904507871
      // 584: lload 1
      // 585: lxor
      // 586: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58b: if_icmple 5aa
      // 58e: goto 59b
      // 591: ldc2_w 1338144596185336179
      // 594: lload 1
      // 595: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59a: athrow
      // 59b: sipush 28126
      // 59e: ldc2_w 4699688211904507871
      // 5a1: lload 1
      // 5a2: lxor
      // 5a3: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a8: istore 19
      // 5aa: bipush 5
      // 5ab: lload 7
      // 5ad: dup2_x1
      // 5ae: pop2
      // 5af: bipush 2
      // 5b0: anewarray 378
      // 5b3: dup_x1
      // 5b4: swap
      // 5b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5b8: bipush 1
      // 5b9: swap
      // 5ba: aastore
      // 5bb: dup_x2
      // 5bc: dup_x2
      // 5bd: pop
      // 5be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c1: bipush 0
      // 5c2: swap
      // 5c3: aastore
      // 5c4: ldc2_w 1079105179619621365
      // 5c7: lload 1
      // 5c8: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cd: goto 5d0
      // 5d0: iload 18
      // 5d2: iload 17
      // 5d4: if_icmpne 144
      // 5d7: iload 16
      // 5d9: lload 1
      // 5da: lconst_0
      // 5db: lcmp
      // 5dc: iflt 18a
      // 5df: ifne 219
      // 5e2: iload 16
      // 5e4: lload 1
      // 5e5: lconst_0
      // 5e6: lcmp
      // 5e7: iflt 222
      // 5ea: lload 1
      // 5eb: lconst_0
      // 5ec: lcmp
      // 5ed: iflt 9c1
      // 5f0: ifeq 9bf
      // 5f3: ldc2_w 1708155106929283560
      // 5f6: lload 1
      // 5f7: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fc: sipush 30295
      // 5ff: ldc2_w 5460989467553051767
      // 602: lload 1
      // 603: lxor
      // 604: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 609: iload 16
      // 60b: ifne 789
      // 60e: if_icmpge 766
      // 611: goto 61e
      // 614: ldc2_w 1338144596185336179
      // 617: lload 1
      // 618: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61d: athrow
      // 61e: lconst_1
      // 61f: ldc2_w 1708155106929283560
      // 622: lload 1
      // 623: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 628: sipush 1530
      // 62b: ldc2_w 382128331306321863
      // 62e: lload 1
      // 62f: lxor
      // 630: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 635: iand
      // 636: lshl
      // 637: lstore 20
      // 639: ldc2_w 1275258353934112770
      // 63c: lload 1
      // 63d: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 642: iinc 18 -1
      // 645: iload 18
      // 647: iaload
      // 648: tableswitch 251 1 5 208 251 36 251 36
      // 66c: sipush 26321
      // 66f: ldc2_w 6197434683853215528
      // 672: lload 1
      // 673: lxor
      // 674: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 679: lload 20
      // 67b: land
      // 67c: lconst_0
      // 67d: lcmp
      // 67e: iload 16
      // 680: lload 1
      // 681: lconst_0
      // 682: lcmp
      // 683: iflt 6bb
      // 686: ifne 6b3
      // 689: ifne 6b1
      // 68c: goto 699
      // 68f: ldc2_w 1338144596185336179
      // 692: lload 1
      // 693: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 698: athrow
      // 699: iload 16
      // 69b: lload 1
      // 69c: lconst_0
      // 69d: lcmp
      // 69e: ifle 745
      // 6a1: ifeq 743
      // 6a4: goto 6b1
      // 6a7: ldc2_w 1338144596185336179
      // 6aa: lload 1
      // 6ab: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b0: athrow
      // 6b1: iload 19
      // 6b3: lload 1
      // 6b4: lconst_0
      // 6b5: lcmp
      // 6b6: ifle 70f
      // 6b9: iload 16
      // 6bb: ifne 6eb
      // 6be: sipush 28126
      // 6c1: ldc2_w 4699688211904507871
      // 6c4: lload 1
      // 6c5: lxor
      // 6c6: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6cb: if_icmple 6ea
      // 6ce: goto 6db
      // 6d1: ldc2_w 1338144596185336179
      // 6d4: lload 1
      // 6d5: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6da: athrow
      // 6db: sipush 28126
      // 6de: ldc2_w 4699688211904507871
      // 6e1: lload 1
      // 6e2: lxor
      // 6e3: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e8: istore 19
      // 6ea: bipush 5
      // 6eb: lload 7
      // 6ed: dup2_x1
      // 6ee: pop2
      // 6ef: bipush 2
      // 6f0: anewarray 378
      // 6f3: dup_x1
      // 6f4: swap
      // 6f5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 6f8: bipush 1
      // 6f9: swap
      // 6fa: aastore
      // 6fb: dup_x2
      // 6fc: dup_x2
      // 6fd: pop
      // 6fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 701: bipush 0
      // 702: swap
      // 703: aastore
      // 704: ldc2_w 1079105179619621365
      // 707: lload 1
      // 708: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70d: iload 16
      // 70f: lload 1
      // 710: lconst_0
      // 711: lcmp
      // 712: ifle 745
      // 715: ifeq 743
      // 718: iload 19
      // 71a: bipush 5
      // 71b: iload 16
      // 71d: ifne 747
      // 720: goto 72d
      // 723: ldc2_w 1338144596185336179
      // 726: lload 1
      // 727: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72c: athrow
      // 72d: if_icmple 743
      // 730: goto 73d
      // 733: ldc2_w 1338144596185336179
      // 736: lload 1
      // 737: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73c: athrow
      // 73d: bipush 5
      // 73e: istore 19
      // 740: goto 743
      // 743: iload 18
      // 745: iload 17
      // 747: if_icmpne 639
      // 74a: iload 16
      // 74c: lload 1
      // 74d: lconst_0
      // 74e: lcmp
      // 74f: iflt 67e
      // 752: ifne 6b1
      // 755: iload 16
      // 757: lload 1
      // 758: lconst_0
      // 759: lcmp
      // 75a: iflt 6b3
      // 75d: lload 1
      // 75e: lconst_0
      // 75f: lcmp
      // 760: ifle 9c1
      // 763: ifeq 9bf
      // 766: ldc2_w 1708155106929283560
      // 769: lload 1
      // 76a: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76f: sipush 29425
      // 772: ldc2_w 9218810037847077030
      // 775: lload 1
      // 776: lxor
      // 777: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77c: goto 789
      // 77f: ldc2_w 1338144596185336179
      // 782: lload 1
      // 783: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 788: athrow
      // 789: ishr
      // 78a: istore 20
      // 78c: iload 20
      // 78e: sipush 4356
      // 791: ldc2_w 426748122715018024
      // 794: lload 1
      // 795: lxor
      // 796: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79b: ishr
      // 79c: istore 21
      // 79e: lconst_1
      // 79f: iload 20
      // 7a1: sipush 1530
      // 7a4: ldc2_w 382128331306321863
      // 7a7: lload 1
      // 7a8: lxor
      // 7a9: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ae: iand
      // 7af: lshl
      // 7b0: lstore 22
      // 7b2: ldc2_w 1708155106929283560
      // 7b5: lload 1
      // 7b6: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7bb: sipush 23959
      // 7be: ldc2_w 8946936299941207942
      // 7c1: lload 1
      // 7c2: lxor
      // 7c3: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c8: iand
      // 7c9: sipush 4356
      // 7cc: ldc2_w 426748122715018024
      // 7cf: lload 1
      // 7d0: lxor
      // 7d1: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d6: ishr
      // 7d7: istore 24
      // 7d9: lconst_1
      // 7da: ldc2_w 1708155106929283560
      // 7dd: lload 1
      // 7de: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e3: sipush 1530
      // 7e6: ldc2_w 382128331306321863
      // 7e9: lload 1
      // 7ea: lxor
      // 7eb: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f0: iand
      // 7f1: lshl
      // 7f2: lstore 25
      // 7f4: ldc2_w 1275258353934112770
      // 7f7: lload 1
      // 7f8: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7fd: iinc 18 -1
      // 800: iload 18
      // 802: iaload
      // 803: tableswitch 437 1 5 283 437 33 437 33
      // 824: lload 9
      // 826: iload 20
      // 828: iload 21
      // 82a: iload 24
      // 82c: iload 11
      // 82e: i2c
      // 82f: lload 22
      // 831: lload 25
      // 833: bipush 7
      // 835: anewarray 378
      // 838: dup_x2
      // 839: dup_x2
      // 83a: pop
      // 83b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83e: bipush 6
      // 840: swap
      // 841: aastore
      // 842: dup_x2
      // 843: dup_x2
      // 844: pop
      // 845: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 848: bipush 5
      // 849: swap
      // 84a: aastore
      // 84b: dup_x1
      // 84c: swap
      // 84d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 850: bipush 4
      // 851: swap
      // 852: aastore
      // 853: dup_x1
      // 854: swap
      // 855: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 858: bipush 3
      // 859: swap
      // 85a: aastore
      // 85b: dup_x1
      // 85c: swap
      // 85d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 860: bipush 2
      // 861: swap
      // 862: aastore
      // 863: dup_x1
      // 864: swap
      // 865: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 868: bipush 1
      // 869: swap
      // 86a: aastore
      // 86b: dup_x2
      // 86c: dup_x2
      // 86d: pop
      // 86e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 871: bipush 0
      // 872: swap
      // 873: aastore
      // 874: ldc2_w 1384458495790155453
      // 877: lload 1
      // 878: invokedynamic t (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87d: iload 16
      // 87f: lload 1
      // 880: lconst_0
      // 881: lcmp
      // 882: iflt 8c1
      // 885: ifne 8b9
      // 888: ifne 8aa
      // 88b: goto 898
      // 88e: ldc2_w 1338144596185336179
      // 891: lload 1
      // 892: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 897: athrow
      // 898: iload 16
      // 89a: ifeq 9b8
      // 89d: goto 8aa
      // 8a0: ldc2_w 1338144596185336179
      // 8a3: lload 1
      // 8a4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a9: athrow
      // 8aa: iload 19
      // 8ac: goto 8b9
      // 8af: ldc2_w 1338144596185336179
      // 8b2: lload 1
      // 8b3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b8: athrow
      // 8b9: lload 1
      // 8ba: lconst_0
      // 8bb: lcmp
      // 8bc: iflt 915
      // 8bf: iload 16
      // 8c1: ifne 8f1
      // 8c4: sipush 28126
      // 8c7: ldc2_w 4699688211904507871
      // 8ca: lload 1
      // 8cb: lxor
      // 8cc: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d1: if_icmple 8f0
      // 8d4: goto 8e1
      // 8d7: ldc2_w 1338144596185336179
      // 8da: lload 1
      // 8db: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e0: athrow
      // 8e1: sipush 28126
      // 8e4: ldc2_w 4699688211904507871
      // 8e7: lload 1
      // 8e8: lxor
      // 8e9: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ee: istore 19
      // 8f0: bipush 5
      // 8f1: lload 7
      // 8f3: dup2_x1
      // 8f4: pop2
      // 8f5: bipush 2
      // 8f6: anewarray 378
      // 8f9: dup_x1
      // 8fa: swap
      // 8fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8fe: bipush 1
      // 8ff: swap
      // 900: aastore
      // 901: dup_x2
      // 902: dup_x2
      // 903: pop
      // 904: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 907: bipush 0
      // 908: swap
      // 909: aastore
      // 90a: ldc2_w 1079105179619621365
      // 90d: lload 1
      // 90e: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 913: iload 16
      // 915: lload 1
      // 916: lconst_0
      // 917: lcmp
      // 918: ifle 96b
      // 91b: ifeq 9b8
      // 91e: iload 20
      // 920: iload 21
      // 922: iload 24
      // 924: lload 22
      // 926: lload 25
      // 928: lload 12
      // 92a: bipush 6
      // 92c: anewarray 378
      // 92f: dup_x2
      // 930: dup_x2
      // 931: pop
      // 932: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 935: bipush 5
      // 936: swap
      // 937: aastore
      // 938: dup_x2
      // 939: dup_x2
      // 93a: pop
      // 93b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93e: bipush 4
      // 93f: swap
      // 940: aastore
      // 941: dup_x2
      // 942: dup_x2
      // 943: pop
      // 944: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 947: bipush 3
      // 948: swap
      // 949: aastore
      // 94a: dup_x1
      // 94b: swap
      // 94c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 94f: bipush 2
      // 950: swap
      // 951: aastore
      // 952: dup_x1
      // 953: swap
      // 954: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 957: bipush 1
      // 958: swap
      // 959: aastore
      // 95a: dup_x1
      // 95b: swap
      // 95c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 95f: bipush 0
      // 960: swap
      // 961: aastore
      // 962: ldc2_w 893021046933007327
      // 965: lload 1
      // 966: invokedynamic t (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96b: iload 16
      // 96d: ifne 9ba
      // 970: goto 97d
      // 973: ldc2_w 1338144596185336179
      // 976: lload 1
      // 977: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97c: athrow
      // 97d: ifeq 9b8
      // 980: goto 98d
      // 983: ldc2_w 1338144596185336179
      // 986: lload 1
      // 987: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98c: athrow
      // 98d: iload 19
      // 98f: bipush 5
      // 990: iload 16
      // 992: ifne 9bc
      // 995: goto 9a2
      // 998: ldc2_w 1338144596185336179
      // 99b: lload 1
      // 99c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a1: athrow
      // 9a2: if_icmple 9b8
      // 9a5: goto 9b2
      // 9a8: ldc2_w 1338144596185336179
      // 9ab: lload 1
      // 9ac: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b1: athrow
      // 9b2: bipush 5
      // 9b3: istore 19
      // 9b5: goto 9b8
      // 9b8: iload 18
      // 9ba: iload 17
      // 9bc: if_icmpne 7f4
      // 9bf: iload 19
      // 9c1: sipush 8216
      // 9c4: ldc2_w 1319533043410199107
      // 9c7: lload 1
      // 9c8: lxor
      // 9c9: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9ce: lload 1
      // 9cf: lconst_0
      // 9d0: lcmp
      // 9d1: iflt a44
      // 9d4: iload 16
      // 9d6: ifne a44
      // 9d9: if_icmpeq a0d
      // 9dc: goto 9e9
      // 9df: ldc2_w 1338144596185336179
      // 9e2: lload 1
      // 9e3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e8: athrow
      // 9e9: iload 19
      // 9eb: ldc2_w 1065212243120145968
      // 9ee: lload 1
      // 9ef: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f4: sipush 8216
      // 9f7: iload 3
      // 9f8: ldc2_w 1089410536893136197
      // 9fb: lload 1
      // 9fc: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a01: ldc2_w 1319533043410199107
      // a04: lload 1
      // a05: lxor
      // a06: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0b: istore 19
      // a0d: iinc 3 1
      // a10: lload 1
      // a11: lconst_0
      // a12: lcmp
      // a13: ifle a7e
      // a16: ldc2_w 1051439355288502001
      // a19: lload 1
      // a1a: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1f: dup
      // a20: istore 18
      // a22: iload 16
      // a24: ifne a75
      // a27: sipush 4356
      // a2a: ldc2_w 426748122715018024
      // a2d: lload 1
      // a2e: lxor
      // a2f: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a34: iload 17
      // a36: dup
      // a37: ldc2_w 1051439355288502001
      // a3a: lload 1
      // a3b: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a40: isub
      // a41: dup
      // a42: istore 17
      // a44: if_icmpne a53
      // a47: iload 3
      // a48: ireturn
      // a49: ldc2_w 1338144596185336179
      // a4c: lload 1
      // a4d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a52: athrow
      // a53: ldc2_w 1630612741258956570
      // a56: lload 1
      // a57: invokedynamic m (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5c: pop
      // a5d: lload 14
      // a5f: bipush 1
      // a60: anewarray 378
      // a63: dup_x2
      // a64: dup_x2
      // a65: pop
      // a66: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a69: bipush 0
      // a6a: swap
      // a6b: aastore
      // a6c: ldc2_w 699050689877702842
      // a6f: lload 1
      // a70: invokedynamic t (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a75: ldc2_w 1708155106929283560
      // a78: lload 1
      // a79: invokedynamic u (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7e: goto 09e
      // a81: astore 20
      // a83: iload 3
      // a84: ireturn
   }

   static void Z(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: pop
      // 00c: getstatic com/zelix/e_.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 93619422356253
      // 017: lxor
      // 018: lstore 3
      // 019: dup2
      // 01a: ldc2_w 117811014948024
      // 01d: lxor
      // 01e: lstore 5
      // 020: pop2
      // 021: ldc2_w 3782028041158234947
      // 024: lload 1
      // 025: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: ldc2_w 3731891763888488918
      // 02d: lload 1
      // 02e: invokedynamic l (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: ldc2_w 3307679622995451836
      // 036: lload 1
      // 037: invokedynamic l (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: bipush 1
      // 03d: iadd
      // 03e: dup
      // 03f: ldc2_w 3235333695814119119
      // 042: lload 1
      // 043: invokedynamic t (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: iadd
      // 049: ldc2_w 3731891763888488918
      // 04c: lload 1
      // 04d: invokedynamic t (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 7
      // 054: ldc2_w 3184331836825724105
      // 057: lload 1
      // 058: invokedynamic l (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: iload 7
      // 05f: ifeq 0e6
      // 062: lookupswitch 168 1 5 28
      // 074: ldc2_w 3489000399557913482
      // 077: lload 1
      // 078: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: ldc2_w 3918029394154426510
      // 081: lload 1
      // 082: invokedynamic l (JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: ldc2_w 3771898471952641507
      // 08a: lload 1
      // 08b: invokedynamic l (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: pop
      // 091: lload 5
      // 093: ldc2_w 3731891763888488918
      // 096: lload 1
      // 097: invokedynamic l (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: bipush 2
      // 09d: anewarray 378
      // 0a0: dup_x1
      // 0a1: swap
      // 0a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a5: bipush 1
      // 0a6: swap
      // 0a7: aastore
      // 0a8: dup_x2
      // 0a9: dup_x2
      // 0aa: pop
      // 0ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ae: bipush 0
      // 0af: swap
      // 0b0: aastore
      // 0b1: ldc2_w 3517828185813328870
      // 0b4: lload 1
      // 0b5: invokedynamic u (Ljava/lang/Object;JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: ldc2_w 3069052771424970490
      // 0bd: lload 1
      // 0be: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: pop
      // 0c4: bipush 0
      // 0c5: ldc2_w 3731891763888488918
      // 0c8: lload 1
      // 0c9: invokedynamic t (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: ldc2_w 3771898471952641507
      // 0d1: lload 1
      // 0d2: invokedynamic l (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: pop
      // 0d8: bipush 1
      // 0d9: goto 0e6
      // 0dc: ldc2_w 3489000399557913482
      // 0df: lload 1
      // 0e0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: lload 3
      // 0e7: dup2_x1
      // 0e8: pop2
      // 0e9: bipush 2
      // 0ea: anewarray 378
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f2: bipush 1
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x2
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: ldc2_w 3426875262205817583
      // 101: lload 1
      // 102: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: goto 10a
      // 10a: return
   }

   private static final boolean d(Object[] param0) {
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
      // 14: istore 2
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast java/lang/Integer
      // 1b: invokevirtual java/lang/Integer.intValue ()I
      // 1e: istore 1
      // 1f: dup
      // 20: bipush 3
      // 21: aaload
      // 22: checkcast java/lang/Long
      // 25: invokevirtual java/lang/Long.longValue ()J
      // 28: lstore 4
      // 2a: dup
      // 2b: bipush 4
      // 2c: aaload
      // 2d: checkcast java/lang/Long
      // 30: invokevirtual java/lang/Long.longValue ()J
      // 33: lstore 6
      // 35: dup
      // 36: bipush 5
      // 37: aaload
      // 38: checkcast java/lang/Long
      // 3b: invokevirtual java/lang/Long.longValue ()J
      // 3e: lstore 8
      // 40: pop
      // 41: getstatic com/zelix/e_.a J
      // 44: lload 8
      // 46: lxor
      // 47: lstore 8
      // 49: ldc2_w -3314488353903299968
      // 4c: lload 8
      // 4e: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: istore 10
      // 55: iload 3
      // 56: iload 10
      // 58: ifne b3
      // 5b: lookupswitch 87 1 0 28
      // 6c: ldc2_w -3731722107560683561
      // 6f: lload 8
      // 71: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: ldc2_w -3004419481144632459
      // 7a: lload 8
      // 7c: invokedynamic i (JJ)[J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: iload 1
      // 82: laload
      // 83: lload 6
      // 85: land
      // 86: lconst_0
      // 87: lcmp
      // 88: iload 10
      // 8a: ifne ad
      // 8d: goto 9b
      // 90: ldc2_w -3731722107560683561
      // 93: lload 8
      // 95: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: ifeq b0
      // 9e: goto ac
      // a1: ldc2_w -3731722107560683561
      // a4: lload 8
      // a6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: athrow
      // ac: bipush 1
      // ad: goto b1
      // b0: bipush 0
      // b1: ireturn
      // b2: bipush 0
      // b3: ireturn
   }

   private static int U(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 64454076771488
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 51343552936883
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 73992203520108
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 71104584414083
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w 999054820769508066
      // 04b: lload 5
      // 04d: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 15
      // 054: lload 3
      // 055: lload 1
      // 056: land
      // 057: dup2
      // 058: lstore 3
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iload 15
      // 05d: ifeq 0cd
      // 060: ifne 0a9
      // 063: goto 071
      // 066: ldc2_w 705453289261388331
      // 069: lload 5
      // 06b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: bipush 0
      // 072: lload 1
      // 073: lload 9
      // 075: bipush 3
      // 076: anewarray 378
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 2
      // 080: swap
      // 081: aastore
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w 1129936758178503987
      // 096: lload 5
      // 098: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: ireturn
      // 09e: ldc2_w 705453289261388331
      // 0a1: lload 5
      // 0a3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: ldc2_w 1006929221765125186
      // 0ac: lload 5
      // 0ae: invokedynamic m (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: pop
      // 0b4: lload 11
      // 0b6: bipush 1
      // 0b7: anewarray 378
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: ldc2_w 1363407109459600354
      // 0c6: lload 5
      // 0c8: invokedynamic t (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: ldc2_w 931360470340209328
      // 0d0: lload 5
      // 0d2: invokedynamic u (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: goto 10b
      // 0da: astore 16
      // 0dc: lload 13
      // 0de: bipush 1
      // 0df: lload 3
      // 0e0: bipush 3
      // 0e1: anewarray 378
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 2
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f2: bipush 1
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x2
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: ldc2_w 1216441897980899782
      // 101: lload 5
      // 103: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: pop
      // 109: bipush 2
      // 10a: ireturn
      // 10b: ldc2_w 931360470340209328
      // 10e: lload 5
      // 110: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: iload 15
      // 117: ifeq 22f
      // 11a: lookupswitch 233 3 99 45 108 115 110 174
      // 13c: ldc2_w 705453289261388331
      // 13f: lload 5
      // 141: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: lload 3
      // 148: sipush 12459
      // 14b: ldc2_w 3753086697077234193
      // 14e: lload 5
      // 150: lxor
      // 151: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: lload 7
      // 158: bipush 3
      // 159: anewarray 378
      // 15c: dup_x2
      // 15d: dup_x2
      // 15e: pop
      // 15f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 162: bipush 2
      // 163: swap
      // 164: aastore
      // 165: dup_x2
      // 166: dup_x2
      // 167: pop
      // 168: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b: bipush 1
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x2
      // 16f: dup_x2
      // 170: pop
      // 171: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 174: bipush 0
      // 175: swap
      // 176: aastore
      // 177: ldc2_w 823348893129496355
      // 17a: lload 5
      // 17c: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: ireturn
      // 182: ldc2_w 705453289261388331
      // 185: lload 5
      // 187: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: lload 3
      // 18e: sipush 13285
      // 191: ldc2_w 8905022217897924944
      // 194: lload 5
      // 196: lxor
      // 197: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: lload 7
      // 19e: bipush 3
      // 19f: anewarray 378
      // 1a2: dup_x2
      // 1a3: dup_x2
      // 1a4: pop
      // 1a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a8: bipush 2
      // 1a9: swap
      // 1aa: aastore
      // 1ab: dup_x2
      // 1ac: dup_x2
      // 1ad: pop
      // 1ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b1: bipush 1
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x2
      // 1b5: dup_x2
      // 1b6: pop
      // 1b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ba: bipush 0
      // 1bb: swap
      // 1bc: aastore
      // 1bd: ldc2_w 823348893129496355
      // 1c0: lload 5
      // 1c2: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: ireturn
      // 1c8: lload 3
      // 1c9: sipush 15665
      // 1cc: ldc2_w 4066920435316316081
      // 1cf: lload 5
      // 1d1: lxor
      // 1d2: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: lload 7
      // 1d9: bipush 3
      // 1da: anewarray 378
      // 1dd: dup_x2
      // 1de: dup_x2
      // 1df: pop
      // 1e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e3: bipush 2
      // 1e4: swap
      // 1e5: aastore
      // 1e6: dup_x2
      // 1e7: dup_x2
      // 1e8: pop
      // 1e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ec: bipush 1
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x2
      // 1f0: dup_x2
      // 1f1: pop
      // 1f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f5: bipush 0
      // 1f6: swap
      // 1f7: aastore
      // 1f8: ldc2_w 823348893129496355
      // 1fb: lload 5
      // 1fd: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: ireturn
      // 203: bipush 1
      // 204: lload 3
      // 205: lload 9
      // 207: bipush 3
      // 208: anewarray 378
      // 20b: dup_x2
      // 20c: dup_x2
      // 20d: pop
      // 20e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 211: bipush 2
      // 212: swap
      // 213: aastore
      // 214: dup_x2
      // 215: dup_x2
      // 216: pop
      // 217: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21a: bipush 1
      // 21b: swap
      // 21c: aastore
      // 21d: dup_x1
      // 21e: swap
      // 21f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 222: bipush 0
      // 223: swap
      // 224: aastore
      // 225: ldc2_w 1129936758178503987
      // 228: lload 5
      // 22a: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: ireturn
   }

   private static int Y(Object[] param0) {
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
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 1
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 2
      // 025: lxor
      // 026: lstore 2
      // 027: lload 2
      // 028: dup2
      // 029: ldc2_w 30606806494837
      // 02c: lxor
      // 02d: lstore 5
      // 02f: dup2
      // 030: ldc2_w 68450402626878
      // 033: lxor
      // 034: dup2
      // 035: bipush 16
      // 037: lushr
      // 038: lstore 7
      // 03a: dup2
      // 03b: bipush 48
      // 03d: lshl
      // 03e: bipush 48
      // 040: lushr
      // 041: l2i
      // 042: istore 9
      // 044: pop2
      // 045: dup2
      // 046: ldc2_w 7155329292756
      // 049: lxor
      // 04a: lstore 10
      // 04c: pop2
      // 04d: bipush 0
      // 04e: istore 13
      // 050: ldc2_w -7177296506628195494
      // 053: lload 2
      // 054: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: sipush 6743
      // 05c: ldc2_w 4308824860795982520
      // 05f: lload 2
      // 060: lxor
      // 061: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: ldc2_w -8901507448364747759
      // 069: lload 2
      // 06a: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: istore 12
      // 071: bipush 1
      // 072: istore 14
      // 074: ldc2_w -7254551255358893342
      // 077: lload 2
      // 078: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: bipush 0
      // 07e: iload 4
      // 080: iastore
      // 081: sipush 8216
      // 084: ldc2_w 1319524906390874275
      // 087: lload 2
      // 088: lxor
      // 089: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: istore 15
      // 090: ldc2_w -8811014304216593708
      // 093: lload 2
      // 094: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: bipush 1
      // 09a: iadd
      // 09b: dup
      // 09c: ldc2_w -8811014304216593708
      // 09f: lload 2
      // 0a0: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: sipush 8216
      // 0a8: ldc2_w 1319524906390874275
      // 0ab: lload 2
      // 0ac: lxor
      // 0ad: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: if_icmpne 0f8
      // 0b5: iload 12
      // 0b7: lload 2
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 101
      // 0bd: lload 2
      // 0be: lconst_0
      // 0bf: lcmp
      // 0c0: ifle 352
      // 0c3: ifeq 349
      // 0c6: goto 0d3
      // 0c9: ldc2_w -7461897452693240941
      // 0cc: lload 2
      // 0cd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: lload 5
      // 0d5: bipush 1
      // 0d6: anewarray 378
      // 0d9: dup_x2
      // 0da: dup_x2
      // 0db: pop
      // 0dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: ldc2_w -9057276380268717959
      // 0e5: lload 2
      // 0e6: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: goto 0f8
      // 0ee: ldc2_w -7461897452693240941
      // 0f1: lload 2
      // 0f2: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: ldc2_w -7109883486283654392
      // 0fb: lload 2
      // 0fc: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: sipush 23051
      // 104: ldc2_w 8793052462272287467
      // 107: lload 2
      // 108: lxor
      // 109: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: iload 12
      // 110: lload 2
      // 111: lconst_0
      // 112: lcmp
      // 113: iflt 361
      // 116: ifeq 35f
      // 119: if_icmpge 349
      // 11c: goto 129
      // 11f: ldc2_w -7461897452693240941
      // 122: lload 2
      // 123: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: lconst_1
      // 12a: ldc2_w -7109883486283654392
      // 12d: lload 2
      // 12e: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: lshl
      // 134: lstore 16
      // 136: ldc2_w -7254551255358893342
      // 139: lload 2
      // 13a: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: iinc 14 -1
      // 142: iload 14
      // 144: iaload
      // 145: tableswitch 481 0 2 27 246 358
      // 160: sipush 9036
      // 163: ldc2_w 8589302499547830345
      // 166: lload 2
      // 167: lxor
      // 168: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: lload 16
      // 16f: land
      // 170: lconst_0
      // 171: lcmp
      // 172: iload 12
      // 174: lload 2
      // 175: lconst_0
      // 176: lcmp
      // 177: ifle 1ee
      // 17a: ifeq 1e1
      // 17d: ifeq 1d8
      // 180: goto 18d
      // 183: ldc2_w -7461897452693240941
      // 186: lload 2
      // 187: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: iload 15
      // 18f: sipush 18509
      // 192: ldc2_w 2068747308671926451
      // 195: lload 2
      // 196: lxor
      // 197: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: iload 12
      // 19e: ifeq 32a
      // 1a1: goto 1ae
      // 1a4: ldc2_w -7461897452693240941
      // 1a7: lload 2
      // 1a8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: if_icmple 326
      // 1b1: goto 1be
      // 1b4: ldc2_w -7461897452693240941
      // 1b7: lload 2
      // 1b8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: sipush 18509
      // 1c1: ldc2_w 2068747308671926451
      // 1c4: lload 2
      // 1c5: lxor
      // 1c6: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: istore 15
      // 1cd: iload 12
      // 1cf: lload 2
      // 1d0: lconst_0
      // 1d1: lcmp
      // 1d2: ifle 328
      // 1d5: ifne 326
      // 1d8: ldc2_w -7109883486283654392
      // 1db: lload 2
      // 1dc: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: sipush 29394
      // 1e4: ldc2_w 7289670735293266543
      // 1e7: lload 2
      // 1e8: lxor
      // 1e9: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: iload 12
      // 1f0: ifeq 32a
      // 1f3: if_icmpne 326
      // 1f6: goto 203
      // 1f9: ldc2_w -7461897452693240941
      // 1fc: lload 2
      // 1fd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: ldc2_w -7254551255358893342
      // 206: lload 2
      // 207: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: ldc2_w -8901507448364747759
      // 20f: lload 2
      // 210: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: dup
      // 216: bipush 1
      // 217: iadd
      // 218: ldc2_w -8901507448364747759
      // 21b: lload 2
      // 21c: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: bipush 2
      // 222: iastore
      // 223: iload 12
      // 225: lload 2
      // 226: lconst_0
      // 227: lcmp
      // 228: iflt 328
      // 22b: ifne 326
      // 22e: goto 23b
      // 231: ldc2_w -7461897452693240941
      // 234: lload 2
      // 235: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: athrow
      // 23b: ldc2_w -7109883486283654392
      // 23e: lload 2
      // 23f: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: sipush 24146
      // 247: ldc2_w 1742027321554605744
      // 24a: lload 2
      // 24b: lxor
      // 24c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: iload 12
      // 253: ifeq 32a
      // 256: goto 263
      // 259: ldc2_w -7461897452693240941
      // 25c: lload 2
      // 25d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: athrow
      // 263: if_icmpne 326
      // 266: goto 273
      // 269: ldc2_w -7461897452693240941
      // 26c: lload 2
      // 26d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: athrow
      // 273: ldc2_w -7254551255358893342
      // 276: lload 2
      // 277: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: ldc2_w -8901507448364747759
      // 27f: lload 2
      // 280: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: dup
      // 286: bipush 1
      // 287: iadd
      // 288: ldc2_w -8901507448364747759
      // 28b: lload 2
      // 28c: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: bipush 2
      // 292: iastore
      // 293: iload 12
      // 295: lload 2
      // 296: lconst_0
      // 297: lcmp
      // 298: ifle 328
      // 29b: ifne 326
      // 29e: goto 2ab
      // 2a1: ldc2_w -7461897452693240941
      // 2a4: lload 2
      // 2a5: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: athrow
      // 2ab: ldc2_w -7109883486283654392
      // 2ae: lload 2
      // 2af: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: sipush 24146
      // 2b7: ldc2_w 1742027321554605744
      // 2ba: lload 2
      // 2bb: lxor
      // 2bc: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: iload 12
      // 2c3: ifeq 32a
      // 2c6: goto 2d3
      // 2c9: ldc2_w -7461897452693240941
      // 2cc: lload 2
      // 2cd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d2: athrow
      // 2d3: if_icmpne 326
      // 2d6: goto 2e3
      // 2d9: ldc2_w -7461897452693240941
      // 2dc: lload 2
      // 2dd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: athrow
      // 2e3: iload 15
      // 2e5: sipush 18509
      // 2e8: ldc2_w 2068747308671926451
      // 2eb: lload 2
      // 2ec: lxor
      // 2ed: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: iload 12
      // 2f4: ifeq 32a
      // 2f7: goto 304
      // 2fa: ldc2_w -7461897452693240941
      // 2fd: lload 2
      // 2fe: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: athrow
      // 304: if_icmple 326
      // 307: goto 314
      // 30a: ldc2_w -7461897452693240941
      // 30d: lload 2
      // 30e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 313: athrow
      // 314: sipush 18509
      // 317: ldc2_w 2068747308671926451
      // 31a: lload 2
      // 31b: lxor
      // 31c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: istore 15
      // 323: goto 326
      // 326: iload 14
      // 328: iload 13
      // 32a: if_icmpne 136
      // 32d: iload 12
      // 32f: lload 2
      // 330: lconst_0
      // 331: lcmp
      // 332: iflt 172
      // 335: ifeq 1d8
      // 338: iload 12
      // 33a: lload 2
      // 33b: lconst_0
      // 33c: lcmp
      // 33d: ifle 1e1
      // 340: lload 2
      // 341: lconst_0
      // 342: lcmp
      // 343: ifle 54e
      // 346: ifne 54c
      // 349: ldc2_w -7109883486283654392
      // 34c: lload 2
      // 34d: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: sipush 30295
      // 355: ldc2_w 5460997565380673175
      // 358: lload 2
      // 359: lxor
      // 35a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: iload 12
      // 361: ifeq 408
      // 364: if_icmpge 3e5
      // 367: goto 374
      // 36a: ldc2_w -7461897452693240941
      // 36d: lload 2
      // 36e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: athrow
      // 374: lconst_1
      // 375: ldc2_w -7109883486283654392
      // 378: lload 2
      // 379: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37e: sipush 1530
      // 381: ldc2_w 382136467789434151
      // 384: lload 2
      // 385: lxor
      // 386: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38b: iand
      // 38c: lshl
      // 38d: lstore 16
      // 38f: ldc2_w -7254551255358893342
      // 392: lload 2
      // 393: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: iinc 14 -1
      // 39b: iload 14
      // 39d: iaload
      // 39e: lookupswitch 36 1 0 18
      // 3b0: sipush 18509
      // 3b3: ldc2_w 2068747308671926451
      // 3b6: lload 2
      // 3b7: lxor
      // 3b8: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bd: istore 15
      // 3bf: goto 3c2
      // 3c2: iload 14
      // 3c4: iload 13
      // 3c6: if_icmpne 38f
      // 3c9: iload 12
      // 3cb: lload 2
      // 3cc: lconst_0
      // 3cd: lcmp
      // 3ce: iflt 3bd
      // 3d1: ifeq 3bf
      // 3d4: iload 12
      // 3d6: lload 2
      // 3d7: lconst_0
      // 3d8: lcmp
      // 3d9: ifle 3c4
      // 3dc: lload 2
      // 3dd: lconst_0
      // 3de: lcmp
      // 3df: ifle 54e
      // 3e2: ifne 54c
      // 3e5: ldc2_w -7109883486283654392
      // 3e8: lload 2
      // 3e9: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ee: sipush 29425
      // 3f1: ldc2_w 9218800560667474502
      // 3f4: lload 2
      // 3f5: lxor
      // 3f6: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: goto 408
      // 3fe: ldc2_w -7461897452693240941
      // 401: lload 2
      // 402: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 407: athrow
      // 408: ishr
      // 409: istore 16
      // 40b: iload 16
      // 40d: sipush 4356
      // 410: ldc2_w 426739766513490376
      // 413: lload 2
      // 414: lxor
      // 415: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41a: ishr
      // 41b: istore 17
      // 41d: lconst_1
      // 41e: iload 16
      // 420: sipush 1530
      // 423: ldc2_w 382136467789434151
      // 426: lload 2
      // 427: lxor
      // 428: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42d: iand
      // 42e: lshl
      // 42f: lstore 18
      // 431: ldc2_w -7109883486283654392
      // 434: lload 2
      // 435: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43a: sipush 23959
      // 43d: ldc2_w 8946945536072914278
      // 440: lload 2
      // 441: lxor
      // 442: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 447: iand
      // 448: sipush 4356
      // 44b: ldc2_w 426739766513490376
      // 44e: lload 2
      // 44f: lxor
      // 450: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 455: ishr
      // 456: istore 20
      // 458: lconst_1
      // 459: ldc2_w -7109883486283654392
      // 45c: lload 2
      // 45d: invokedynamic m (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 462: sipush 1530
      // 465: ldc2_w 382136467789434151
      // 468: lload 2
      // 469: lxor
      // 46a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46f: iand
      // 470: lshl
      // 471: lstore 21
      // 473: ldc2_w -7254551255358893342
      // 476: lload 2
      // 477: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47c: iinc 14 -1
      // 47f: iload 14
      // 481: iaload
      // 482: lookupswitch 195 1 0 18
      // 494: lload 7
      // 496: iload 16
      // 498: iload 17
      // 49a: iload 20
      // 49c: iload 9
      // 49e: i2c
      // 49f: lload 18
      // 4a1: lload 21
      // 4a3: bipush 7
      // 4a5: anewarray 378
      // 4a8: dup_x2
      // 4a9: dup_x2
      // 4aa: pop
      // 4ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4ae: bipush 6
      // 4b0: swap
      // 4b1: aastore
      // 4b2: dup_x2
      // 4b3: dup_x2
      // 4b4: pop
      // 4b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b8: bipush 5
      // 4b9: swap
      // 4ba: aastore
      // 4bb: dup_x1
      // 4bc: swap
      // 4bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4c0: bipush 4
      // 4c1: swap
      // 4c2: aastore
      // 4c3: dup_x1
      // 4c4: swap
      // 4c5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4c8: bipush 3
      // 4c9: swap
      // 4ca: aastore
      // 4cb: dup_x1
      // 4cc: swap
      // 4cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4d0: bipush 2
      // 4d1: swap
      // 4d2: aastore
      // 4d3: dup_x1
      // 4d4: swap
      // 4d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4d8: bipush 1
      // 4d9: swap
      // 4da: aastore
      // 4db: dup_x2
      // 4dc: dup_x2
      // 4dd: pop
      // 4de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e1: bipush 0
      // 4e2: swap
      // 4e3: aastore
      // 4e4: ldc2_w -7361523865023443875
      // 4e7: lload 2
      // 4e8: invokedynamic t (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ed: iload 12
      // 4ef: ifeq 547
      // 4f2: ifeq 545
      // 4f5: goto 502
      // 4f8: ldc2_w -7461897452693240941
      // 4fb: lload 2
      // 4fc: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 501: athrow
      // 502: iload 15
      // 504: sipush 18509
      // 507: ldc2_w 2068747308671926451
      // 50a: lload 2
      // 50b: lxor
      // 50c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 511: iload 12
      // 513: ifeq 549
      // 516: goto 523
      // 519: ldc2_w -7461897452693240941
      // 51c: lload 2
      // 51d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 522: athrow
      // 523: if_icmple 545
      // 526: goto 533
      // 529: ldc2_w -7461897452693240941
      // 52c: lload 2
      // 52d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 532: athrow
      // 533: sipush 18509
      // 536: ldc2_w 2068747308671926451
      // 539: lload 2
      // 53a: lxor
      // 53b: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 540: istore 15
      // 542: goto 545
      // 545: iload 14
      // 547: iload 13
      // 549: if_icmpne 473
      // 54c: iload 15
      // 54e: sipush 8216
      // 551: ldc2_w 1319524906390874275
      // 554: lload 2
      // 555: lxor
      // 556: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55b: lload 2
      // 55c: lconst_0
      // 55d: lcmp
      // 55e: iflt 5c5
      // 561: iload 12
      // 563: ifeq 5c5
      // 566: if_icmpeq 59a
      // 569: goto 576
      // 56c: ldc2_w -7461897452693240941
      // 56f: lload 2
      // 570: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 575: athrow
      // 576: iload 15
      // 578: ldc2_w -8923763628126155568
      // 57b: lload 2
      // 57c: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 581: sipush 8216
      // 584: iload 1
      // 585: ldc2_w -8791495164851210331
      // 588: lload 2
      // 589: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58e: ldc2_w 1319524906390874275
      // 591: lload 2
      // 592: lxor
      // 593: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 598: istore 15
      // 59a: iinc 1 1
      // 59d: lload 2
      // 59e: lconst_0
      // 59f: lcmp
      // 5a0: ifle 5ff
      // 5a3: ldc2_w -8901507448364747759
      // 5a6: lload 2
      // 5a7: invokedynamic m (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ac: dup
      // 5ad: istore 14
      // 5af: iload 12
      // 5b1: ifeq 5f6
      // 5b4: bipush 3
      // 5b5: iload 13
      // 5b7: dup
      // 5b8: ldc2_w -8901507448364747759
      // 5bb: lload 2
      // 5bc: invokedynamic u (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c1: isub
      // 5c2: dup
      // 5c3: istore 13
      // 5c5: if_icmpne 5d4
      // 5c8: iload 1
      // 5c9: ireturn
      // 5ca: ldc2_w -7461897452693240941
      // 5cd: lload 2
      // 5ce: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d3: athrow
      // 5d4: ldc2_w -7187444836250106374
      // 5d7: lload 2
      // 5d8: invokedynamic m (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5dd: pop
      // 5de: lload 10
      // 5e0: bipush 1
      // 5e1: anewarray 378
      // 5e4: dup_x2
      // 5e5: dup_x2
      // 5e6: pop
      // 5e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5ea: bipush 0
      // 5eb: swap
      // 5ec: aastore
      // 5ed: ldc2_w -8983680423891996070
      // 5f0: lload 2
      // 5f1: invokedynamic t (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f6: ldc2_w -7109883486283654392
      // 5f9: lload 2
      // 5fa: invokedynamic u (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ff: goto 090
      // 602: astore 16
      // 604: iload 1
      // 605: ireturn
   }

   private static int q(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 71664090294084
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 47751669637227
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 49290749613211
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 51902832193396
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w -3374827181077858795
      // 04b: lload 5
      // 04d: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 15
      // 054: lload 3
      // 055: lload 1
      // 056: land
      // 057: dup2
      // 058: lstore 3
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iload 15
      // 05d: ifeq 0da
      // 060: ifne 0b6
      // 063: goto 071
      // 066: ldc2_w -3081260834378182948
      // 069: lload 5
      // 06b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: sipush 18759
      // 074: ldc2_w 2640209174959181029
      // 077: lload 5
      // 079: lxor
      // 07a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: lload 1
      // 080: lload 7
      // 082: bipush 3
      // 083: anewarray 378
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 2
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x2
      // 090: dup_x2
      // 091: pop
      // 092: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 095: bipush 1
      // 096: swap
      // 097: aastore
      // 098: dup_x1
      // 099: swap
      // 09a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w -3217477917823204924
      // 0a3: lload 5
      // 0a5: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: ireturn
      // 0ab: ldc2_w -3081260834378182948
      // 0ae: lload 5
      // 0b0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: ldc2_w -3382701033517250379
      // 0b9: lload 5
      // 0bb: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: pop
      // 0c1: lload 11
      // 0c3: bipush 1
      // 0c4: anewarray 378
      // 0c7: dup_x2
      // 0c8: dup_x2
      // 0c9: pop
      // 0ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd: bipush 0
      // 0ce: swap
      // 0cf: aastore
      // 0d0: ldc2_w -3594817992027128043
      // 0d3: lload 5
      // 0d5: invokedynamic s (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: ldc2_w -3450965720611498425
      // 0dd: lload 5
      // 0df: invokedynamic r (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: goto 132
      // 0e7: astore 16
      // 0e9: lload 13
      // 0eb: sipush 9094
      // 0ee: ldc2_w 1722981216913401459
      // 0f1: lload 5
      // 0f3: lxor
      // 0f4: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: lload 3
      // 0fa: bipush 3
      // 0fb: anewarray 378
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 2
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10c: bipush 1
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w -3740585931962094287
      // 11b: lload 5
      // 11d: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: pop
      // 123: sipush 13268
      // 126: ldc2_w 5809344281133200990
      // 129: lload 5
      // 12b: lxor
      // 12c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: ireturn
      // 132: ldc2_w -3450965720611498425
      // 135: lload 5
      // 137: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: iload 15
      // 13e: ifeq 1de
      // 141: lookupswitch 100 1 102 30
      // 154: ldc2_w -3081260834378182948
      // 157: lload 5
      // 159: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: lload 3
      // 160: sipush 12459
      // 163: ldc2_w 3753130064394749670
      // 166: lload 5
      // 168: lxor
      // 169: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: lload 9
      // 170: bipush 3
      // 171: anewarray 378
      // 174: dup_x2
      // 175: dup_x2
      // 176: pop
      // 177: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17a: bipush 2
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 1
      // 184: swap
      // 185: aastore
      // 186: dup_x2
      // 187: dup_x2
      // 188: pop
      // 189: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18c: bipush 0
      // 18d: swap
      // 18e: aastore
      // 18f: ldc2_w -3419462178350631505
      // 192: lload 5
      // 194: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: ireturn
      // 19a: ldc2_w -3081260834378182948
      // 19d: lload 5
      // 19f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: sipush 29050
      // 1a8: ldc2_w 2106698227993343180
      // 1ab: lload 5
      // 1ad: lxor
      // 1ae: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: lload 3
      // 1b4: lload 7
      // 1b6: bipush 3
      // 1b7: anewarray 378
      // 1ba: dup_x2
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c0: bipush 2
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x2
      // 1c4: dup_x2
      // 1c5: pop
      // 1c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c9: bipush 1
      // 1ca: swap
      // 1cb: aastore
      // 1cc: dup_x1
      // 1cd: swap
      // 1ce: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d1: bipush 0
      // 1d2: swap
      // 1d3: aastore
      // 1d4: ldc2_w -3217477917823204924
      // 1d7: lload 5
      // 1d9: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: ireturn
   }

   private static void k(Object[] param0) {
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
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 1
      // 15: pop
      // 16: getstatic com/zelix/e_.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w 3677056144096056199
      // 1f: lload 2
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 4
      // 27: ldc2_w 3668640423209907543
      // 2a: lload 2
      // 2b: invokedynamic n (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: iload 1
      // 31: iload 4
      // 33: ifne 87
      // 36: iaload
      // 37: ldc2_w 3529600625009196951
      // 3a: lload 2
      // 3b: invokedynamic n (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: if_icmpeq 91
      // 43: goto 50
      // 46: ldc2_w 3256480694526834384
      // 49: lload 2
      // 4a: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: ldc2_w 3319711669908383649
      // 53: lload 2
      // 54: invokedynamic n (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: ldc2_w 3545505116534210898
      // 5c: lload 2
      // 5d: invokedynamic n (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: dup
      // 63: bipush 1
      // 64: iadd
      // 65: ldc2_w 3545505116534210898
      // 68: lload 2
      // 69: invokedynamic v (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: iload 1
      // 6f: iastore
      // 70: ldc2_w 3668640423209907543
      // 73: lload 2
      // 74: invokedynamic n (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: iload 1
      // 7a: goto 87
      // 7d: ldc2_w 3256480694526834384
      // 80: lload 2
      // 81: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: ldc2_w 3529600625009196951
      // 8a: lload 2
      // 8b: invokedynamic n (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: iastore
      // 91: return
   }

   private static final int k(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      long var4 = (Long)var0[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 109807609176299L;
      long var8 = var4 ^ 69334611057999L;
      Object[] var10004 = new Object[]{null, null, var2};
      var10004[1] = var1;
      var10004[0] = var8;
      int var10001 = x44.a<"p">(var10004, 4480471204736507658L, var4);
      var10004 = new Object[]{null, null, var1 + 1};
      var10004[1] = var10001;
      var10004[0] = var6;
      return x44.a<"p">(var10004, 4307337195296759936L, var4);
   }

   private static int K(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 13072321370798
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 76117725381228
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 44819942584755
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 47431483820636
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w 8359297288364610365
      // 04b: lload 5
      // 04d: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: istore 15
      // 054: lload 3
      // 055: lload 1
      // 056: land
      // 057: dup2
      // 058: lstore 3
      // 059: lconst_0
      // 05a: lcmp
      // 05b: iload 15
      // 05d: ifeq 0cd
      // 060: ifne 0a9
      // 063: goto 071
      // 066: ldc2_w 8076411602113276916
      // 069: lload 5
      // 06b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: bipush 1
      // 072: lload 1
      // 073: lload 9
      // 075: bipush 3
      // 076: anewarray 378
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 2
      // 080: swap
      // 081: aastore
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w 8534669797749859564
      // 096: lload 5
      // 098: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: ireturn
      // 09e: ldc2_w 8076411602113276916
      // 0a1: lload 5
      // 0a3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: ldc2_w 8369446510257319325
      // 0ac: lload 5
      // 0ae: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: pop
      // 0b4: lload 11
      // 0b6: bipush 1
      // 0b7: anewarray 378
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: ldc2_w 7724975191437384253
      // 0c6: lload 5
      // 0c8: invokedynamic s (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: ldc2_w 8445288207129015151
      // 0d0: lload 5
      // 0d2: invokedynamic r (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: goto 10b
      // 0da: astore 16
      // 0dc: lload 13
      // 0de: bipush 2
      // 0df: lload 3
      // 0e0: bipush 3
      // 0e1: anewarray 378
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 2
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f2: bipush 1
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x2
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fb: bipush 0
      // 0fc: swap
      // 0fd: aastore
      // 0fe: ldc2_w 7583711022927431705
      // 101: lload 5
      // 103: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: pop
      // 109: bipush 3
      // 10a: ireturn
      // 10b: ldc2_w 8445288207129015151
      // 10e: lload 5
      // 110: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: iload 15
      // 117: ifeq 1ec
      // 11a: lookupswitch 166 2 105 37 107 107
      // 134: ldc2_w 8076411602113276916
      // 137: lload 5
      // 139: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: lload 3
      // 140: sipush 779
      // 143: ldc2_w 3157303808559157370
      // 146: lload 5
      // 148: lxor
      // 149: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: lload 7
      // 150: bipush 3
      // 151: anewarray 378
      // 154: dup_x2
      // 155: dup_x2
      // 156: pop
      // 157: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 166: dup_x2
      // 167: dup_x2
      // 168: pop
      // 169: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16c: bipush 0
      // 16d: swap
      // 16e: aastore
      // 16f: ldc2_w 7759717646849162228
      // 172: lload 5
      // 174: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: ireturn
      // 17a: ldc2_w 8076411602113276916
      // 17d: lload 5
      // 17f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: lload 3
      // 186: sipush 12459
      // 189: ldc2_w 3753134560977101774
      // 18c: lload 5
      // 18e: lxor
      // 18f: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: lload 7
      // 196: bipush 3
      // 197: anewarray 378
      // 19a: dup_x2
      // 19b: dup_x2
      // 19c: pop
      // 19d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a0: bipush 2
      // 1a1: swap
      // 1a2: aastore
      // 1a3: dup_x2
      // 1a4: dup_x2
      // 1a5: pop
      // 1a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 1b5: ldc2_w 7759717646849162228
      // 1b8: lload 5
      // 1ba: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: ireturn
      // 1c0: bipush 2
      // 1c1: lload 3
      // 1c2: lload 9
      // 1c4: bipush 3
      // 1c5: anewarray 378
      // 1c8: dup_x2
      // 1c9: dup_x2
      // 1ca: pop
      // 1cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ce: bipush 2
      // 1cf: swap
      // 1d0: aastore
      // 1d1: dup_x2
      // 1d2: dup_x2
      // 1d3: pop
      // 1d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d7: bipush 1
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x1
      // 1db: swap
      // 1dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1df: bipush 0
      // 1e0: swap
      // 1e1: aastore
      // 1e2: ldc2_w 8534669797749859564
      // 1e5: lload 5
      // 1e7: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: ireturn
   }

   private static int H(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: dup
      // 016: bipush 2
      // 017: aaload
      // 018: checkcast java/lang/Long
      // 01b: invokevirtual java/lang/Long.longValue ()J
      // 01e: lstore 5
      // 020: pop
      // 021: getstatic com/zelix/e_.a J
      // 024: lload 5
      // 026: lxor
      // 027: lstore 5
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 6625448051654
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 120020874300946
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 25208338608225
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 899605741005
      // 044: lxor
      // 045: lstore 13
      // 047: dup2
      // 048: ldc2_w 3511149463074
      // 04b: lxor
      // 04c: lstore 15
      // 04e: pop2
      // 04f: ldc2_w -541530873590948029
      // 052: lload 5
      // 054: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: istore 17
      // 05b: lload 3
      // 05c: lload 1
      // 05d: land
      // 05e: dup2
      // 05f: lstore 3
      // 060: lconst_0
      // 061: lcmp
      // 062: iload 17
      // 064: ifeq 0d4
      // 067: ifne 0b0
      // 06a: goto 078
      // 06d: ldc2_w -258106378627733622
      // 070: lload 5
      // 072: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: bipush 3
      // 079: lload 1
      // 07a: lload 9
      // 07c: bipush 3
      // 07d: anewarray 378
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 2
      // 087: swap
      // 088: aastore
      // 089: dup_x2
      // 08a: dup_x2
      // 08b: pop
      // 08c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08f: bipush 1
      // 090: swap
      // 091: aastore
      // 092: dup_x1
      // 093: swap
      // 094: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w -428100468442584942
      // 09d: lload 5
      // 09f: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: ireturn
      // 0a5: ldc2_w -258106378627733622
      // 0a8: lload 5
      // 0aa: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: ldc2_w -551665321939131933
      // 0b3: lload 5
      // 0b5: invokedynamic l (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: pop
      // 0bb: lload 13
      // 0bd: bipush 1
      // 0be: anewarray 378
      // 0c1: dup_x2
      // 0c2: dup_x2
      // 0c3: pop
      // 0c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: ldc2_w -1780461100232665533
      // 0cd: lload 5
      // 0cf: invokedynamic u (Ljava/lang/Object;JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: ldc2_w -482561415147159791
      // 0d7: lload 5
      // 0d9: invokedynamic t (CJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: goto 112
      // 0e1: astore 18
      // 0e3: lload 15
      // 0e5: bipush 4
      // 0e6: lload 3
      // 0e7: bipush 3
      // 0e8: anewarray 378
      // 0eb: dup_x2
      // 0ec: dup_x2
      // 0ed: pop
      // 0ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f1: bipush 2
      // 0f2: swap
      // 0f3: aastore
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f9: bipush 1
      // 0fa: swap
      // 0fb: aastore
      // 0fc: dup_x2
      // 0fd: dup_x2
      // 0fe: pop
      // 0ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 102: bipush 0
      // 103: swap
      // 104: aastore
      // 105: ldc2_w -1927284536972786585
      // 108: lload 5
      // 10a: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: pop
      // 110: bipush 5
      // 111: ireturn
      // 112: ldc2_w -482561415147159791
      // 115: lload 5
      // 117: invokedynamic l (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: iload 17
      // 11e: ifeq 272
      // 121: lookupswitch 293 3 62 46 103 175 105 234
      // 144: ldc2_w -258106378627733622
      // 147: lload 5
      // 149: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: lload 3
      // 150: sipush 15665
      // 153: ldc2_w 4066989111081280016
      // 156: lload 5
      // 158: lxor
      // 159: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: land
      // 15f: lconst_0
      // 160: lcmp
      // 161: iload 17
      // 163: ifeq 272
      // 166: goto 174
      // 169: ldc2_w -258106378627733622
      // 16c: lload 5
      // 16e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: lload 5
      // 176: lconst_0
      // 177: lcmp
      // 178: iflt 247
      // 17b: ifeq 246
      // 17e: goto 18c
      // 181: ldc2_w -258106378627733622
      // 184: lload 5
      // 186: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: bipush 5
      // 18d: lload 7
      // 18f: sipush 3536
      // 192: ldc2_w 888313279294120319
      // 195: lload 5
      // 197: lxor
      // 198: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: bipush 3
      // 19e: anewarray 378
      // 1a1: dup_x1
      // 1a2: swap
      // 1a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a6: bipush 2
      // 1a7: swap
      // 1a8: aastore
      // 1a9: dup_x2
      // 1aa: dup_x2
      // 1ab: pop
      // 1ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1af: bipush 1
      // 1b0: swap
      // 1b1: aastore
      // 1b2: dup_x1
      // 1b3: swap
      // 1b4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1b7: bipush 0
      // 1b8: swap
      // 1b9: aastore
      // 1ba: ldc2_w -220281380972302306
      // 1bd: lload 5
      // 1bf: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: ireturn
      // 1c5: ldc2_w -258106378627733622
      // 1c8: lload 5
      // 1ca: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: athrow
      // 1d0: lload 3
      // 1d1: sipush 12459
      // 1d4: ldc2_w 3753160871944630192
      // 1d7: lload 5
      // 1d9: lxor
      // 1da: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: lload 11
      // 1e1: bipush 3
      // 1e2: anewarray 378
      // 1e5: dup_x2
      // 1e6: dup_x2
      // 1e7: pop
      // 1e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1eb: bipush 2
      // 1ec: swap
      // 1ed: aastore
      // 1ee: dup_x2
      // 1ef: dup_x2
      // 1f0: pop
      // 1f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f4: bipush 1
      // 1f5: swap
      // 1f6: aastore
      // 1f7: dup_x2
      // 1f8: dup_x2
      // 1f9: pop
      // 1fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fd: bipush 0
      // 1fe: swap
      // 1ff: aastore
      // 200: ldc2_w -1774541629687965018
      // 203: lload 5
      // 205: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: ireturn
      // 20b: lload 3
      // 20c: sipush 13285
      // 20f: ldc2_w 8904950293010820337
      // 212: lload 5
      // 214: lxor
      // 215: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: lload 11
      // 21c: bipush 3
      // 21d: anewarray 378
      // 220: dup_x2
      // 221: dup_x2
      // 222: pop
      // 223: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 226: bipush 2
      // 227: swap
      // 228: aastore
      // 229: dup_x2
      // 22a: dup_x2
      // 22b: pop
      // 22c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22f: bipush 1
      // 230: swap
      // 231: aastore
      // 232: dup_x2
      // 233: dup_x2
      // 234: pop
      // 235: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 238: bipush 0
      // 239: swap
      // 23a: aastore
      // 23b: ldc2_w -1774541629687965018
      // 23e: lload 5
      // 240: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: ireturn
      // 246: bipush 4
      // 247: lload 3
      // 248: lload 9
      // 24a: bipush 3
      // 24b: anewarray 378
      // 24e: dup_x2
      // 24f: dup_x2
      // 250: pop
      // 251: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 254: bipush 2
      // 255: swap
      // 256: aastore
      // 257: dup_x2
      // 258: dup_x2
      // 259: pop
      // 25a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25d: bipush 1
      // 25e: swap
      // 25f: aastore
      // 260: dup_x1
      // 261: swap
      // 262: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 265: bipush 0
      // 266: swap
      // 267: aastore
      // 268: ldc2_w -428100468442584942
      // 26b: lload 5
      // 26d: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: ireturn
   }

   private static int M(Object[] param0) {
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
      // 0c: getstatic com/zelix/e_.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: lload 1
      // 13: dup2
      // 14: ldc2_w 125501821564287
      // 17: lxor
      // 18: lstore 3
      // 19: pop2
      // 1a: ldc2_w 4315098060796763357
      // 1d: lload 1
      // 1e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: istore 5
      // 25: ldc2_w 4238958911671450767
      // 28: lload 1
      // 29: invokedynamic j (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: iload 5
      // 30: ifeq 87
      // 33: lookupswitch 83 1 42 27
      // 44: ldc2_w 4608681901200335892
      // 47: lload 1
      // 48: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: sipush 20887
      // 51: ldc2_w 6275098840512957713
      // 54: lload 1
      // 55: lxor
      // 56: invokedynamic l (IJ)J bsm=com/zelix/e_.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: lload 3
      // 5c: bipush 2
      // 5d: anewarray 378
      // 60: dup_x2
      // 61: dup_x2
      // 62: pop
      // 63: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66: bipush 1
      // 67: swap
      // 68: aastore
      // 69: dup_x2
      // 6a: dup_x2
      // 6b: pop
      // 6c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f: bipush 0
      // 70: swap
      // 71: aastore
      // 72: ldc2_w 2655576039340560151
      // 75: lload 1
      // 76: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: ireturn
      // 7c: ldc2_w 4608681901200335892
      // 7f: lload 1
      // 80: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: bipush 1
      // 87: ireturn
   }

   private static void l(Object[] param0) {
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
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/e_.a J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: ldc2_w 7453268381795074128
      // 15: lload 1
      // 16: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: sipush 29705
      // 1e: ldc2_w 8271304786375428026
      // 21: lload 1
      // 22: lxor
      // 23: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: ldc2_w 9129561620148990430
      // 2b: lload 1
      // 2c: invokedynamic w (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: istore 3
      // 32: sipush 7291
      // 35: ldc2_w 3235179786960842697
      // 38: lload 1
      // 39: lxor
      // 3a: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: istore 4
      // 41: iload 4
      // 43: iinc 4 -1
      // 46: ifle 66
      // 49: ldc2_w 8980388737485568798
      // 4c: lload 1
      // 4d: invokedynamic o (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: iload 4
      // 54: sipush 28727
      // 57: ldc2_w 4690744911925593041
      // 5a: lload 1
      // 5b: lxor
      // 5c: invokedynamic c (IJ)I bsm=com/zelix/e_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: iastore
      // 62: iload 3
      // 63: ifne 41
      // 66: lload 1
      // 67: lconst_0
      // 68: lcmp
      // 69: iflt 62
      // 6c: return
   }

   protected static t6 Z(Object[] param0) {
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
      // 00a: lstore 1
      // 00b: pop
      // 00c: getstatic com/zelix/e_.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 126372669497695
      // 017: lxor
      // 018: lstore 3
      // 019: dup2
      // 01a: ldc2_w 87889556220582
      // 01d: lxor
      // 01e: lstore 5
      // 020: dup2
      // 021: ldc2_w 90029035229984
      // 024: lxor
      // 025: lstore 7
      // 027: dup2
      // 028: ldc2_w 89241022931748
      // 02b: lxor
      // 02c: lstore 9
      // 02e: dup2
      // 02f: ldc2_w 122424965788624
      // 032: lxor
      // 033: lstore 11
      // 035: dup2
      // 036: ldc2_w 39398376189109
      // 039: lxor
      // 03a: lstore 13
      // 03c: pop2
      // 03d: ldc2_w 8578178834845800331
      // 040: lload 1
      // 041: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: ldc2_w 7800762917017792732
      // 049: lload 1
      // 04a: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: ldc2_w 8459852848818011551
      // 052: lload 1
      // 053: invokedynamic j (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: aaload
      // 059: astore 22
      // 05b: istore 15
      // 05d: aload 22
      // 05f: iload 15
      // 061: ifne 0a3
      // 064: ifnonnull 0a6
      // 067: goto 074
      // 06a: ldc2_w 7583218273428255452
      // 06d: lload 1
      // 06e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: ldc2_w 7858238303369835701
      // 077: lload 1
      // 078: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: pop
      // 07e: lload 5
      // 080: bipush 1
      // 081: anewarray 378
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w 8334191456423489632
      // 090: lload 1
      // 091: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: goto 0a3
      // 099: ldc2_w 7583218273428255452
      // 09c: lload 1
      // 09d: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: goto 0a8
      // 0a6: aload 22
      // 0a8: astore 17
      // 0aa: ldc2_w 7858238303369835701
      // 0ad: lload 1
      // 0ae: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: pop
      // 0b4: lload 3
      // 0b5: bipush 1
      // 0b6: anewarray 378
      // 0b9: dup_x2
      // 0ba: dup_x2
      // 0bb: pop
      // 0bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bf: bipush 0
      // 0c0: swap
      // 0c1: aastore
      // 0c2: ldc2_w 8628966820843449980
      // 0c5: lload 1
      // 0c6: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: istore 18
      // 0cd: ldc2_w 7858238303369835701
      // 0d0: lload 1
      // 0d1: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: pop
      // 0d7: lload 7
      // 0d9: bipush 1
      // 0da: anewarray 378
      // 0dd: dup_x2
      // 0de: dup_x2
      // 0df: pop
      // 0e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e3: bipush 0
      // 0e4: swap
      // 0e5: aastore
      // 0e6: ldc2_w 7530794481209678456
      // 0e9: lload 1
      // 0ea: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: istore 20
      // 0f1: ldc2_w 7858238303369835701
      // 0f4: lload 1
      // 0f5: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: pop
      // 0fb: lload 11
      // 0fd: bipush 1
      // 0fe: anewarray 378
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 0
      // 108: swap
      // 109: aastore
      // 10a: ldc2_w 7793606525314130541
      // 10d: lload 1
      // 10e: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: istore 19
      // 115: ldc2_w 7858238303369835701
      // 118: lload 1
      // 119: invokedynamic j (JJ)Lcom/zelix/_zd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: pop
      // 11f: lload 13
      // 121: bipush 1
      // 122: anewarray 378
      // 125: dup_x2
      // 126: dup_x2
      // 127: pop
      // 128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12b: bipush 0
      // 12c: swap
      // 12d: aastore
      // 12e: ldc2_w 8585862318750498282
      // 131: lload 1
      // 132: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: istore 21
      // 139: ldc2_w 8459852848818011551
      // 13c: lload 1
      // 13d: invokedynamic j (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: aload 17
      // 144: lload 9
      // 146: bipush 3
      // 147: anewarray 378
      // 14a: dup_x2
      // 14b: dup_x2
      // 14c: pop
      // 14d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 150: bipush 2
      // 151: swap
      // 152: aastore
      // 153: dup_x1
      // 154: swap
      // 155: bipush 1
      // 156: swap
      // 157: aastore
      // 158: dup_x1
      // 159: swap
      // 15a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15d: bipush 0
      // 15e: swap
      // 15f: aastore
      // 160: ldc2_w 7559248577527107103
      // 163: lload 1
      // 164: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/t6; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: astore 16
      // 16b: aload 16
      // 16d: iload 18
      // 16f: ldc2_w 8598766255521452645
      // 172: lload 1
      // 173: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: aload 16
      // 17a: iload 19
      // 17c: ldc2_w 7671841258326768424
      // 17f: lload 1
      // 180: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: aload 16
      // 187: iload 20
      // 189: ldc2_w 8218106939111844382
      // 18c: lload 1
      // 18d: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: aload 16
      // 194: iload 21
      // 196: ldc2_w 8531680684412842974
      // 199: lload 1
      // 19a: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: aload 16
      // 1a1: areturn
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15626;
      if (j[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/e_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         j[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return j[var5];
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
         throw new RuntimeException("com/zelix/e_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16584;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/e_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
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
         throw new RuntimeException("com/zelix/e_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29484;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/e_", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         u[var3] = var15;
      }

      return u[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("com/zelix/e_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
