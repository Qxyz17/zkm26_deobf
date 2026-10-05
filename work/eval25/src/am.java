package com.zelix;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class am implements w2 {
   private final boolean h;
   private po v;
   private _8z t;
   private _yk L;
   private pg z;
   private static final Boolean Z;
   private _8z l;
   private static final Boolean x;
   private rl E;
   private HashMap U;
   private static final long a = ess.a(-6332296339759403060L, 2728974902319067263L, MethodHandles.lookup().lookupClass()).a(99656039683168L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public final boolean z(Object[] param1) {
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
      // 016: checkcast java/lang/String
      // 019: astore 3
      // 01a: pop
      // 01b: getstatic com/zelix/am.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 96109581833738
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 120858662736400
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 95863821818492
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 55754148007914
      // 03e: lxor
      // 03f: dup2
      // 040: bipush 48
      // 042: lushr
      // 043: l2i
      // 044: istore 12
      // 046: dup2
      // 047: bipush 16
      // 049: lshl
      // 04a: bipush 16
      // 04c: lushr
      // 04d: lstore 13
      // 04f: pop2
      // 050: dup2
      // 051: ldc2_w 56849315065056
      // 054: lxor
      // 055: dup2
      // 056: bipush 32
      // 058: lushr
      // 059: l2i
      // 05a: istore 15
      // 05c: dup2
      // 05d: bipush 32
      // 05f: lshl
      // 060: bipush 56
      // 062: lushr
      // 063: l2i
      // 064: istore 16
      // 066: dup2
      // 067: bipush 40
      // 069: lshl
      // 06a: bipush 40
      // 06c: lushr
      // 06d: l2i
      // 06e: istore 17
      // 070: pop2
      // 071: dup2
      // 072: ldc2_w 120980698173765
      // 075: lxor
      // 076: dup2
      // 077: bipush 32
      // 079: lushr
      // 07a: l2i
      // 07b: istore 18
      // 07d: dup2
      // 07e: bipush 32
      // 080: lshl
      // 081: bipush 48
      // 083: lushr
      // 084: l2i
      // 085: istore 19
      // 087: dup2
      // 088: bipush 48
      // 08a: lshl
      // 08b: bipush 48
      // 08d: lushr
      // 08e: l2i
      // 08f: istore 20
      // 091: pop2
      // 092: dup2
      // 093: ldc2_w 62482968173510
      // 096: lxor
      // 097: dup2
      // 098: bipush 48
      // 09a: lushr
      // 09b: l2i
      // 09c: istore 21
      // 09e: dup2
      // 09f: bipush 16
      // 0a1: lshl
      // 0a2: bipush 32
      // 0a4: lushr
      // 0a5: l2i
      // 0a6: istore 22
      // 0a8: dup2
      // 0a9: bipush 48
      // 0ab: lshl
      // 0ac: bipush 48
      // 0ae: lushr
      // 0af: l2i
      // 0b0: istore 23
      // 0b2: pop2
      // 0b3: pop2
      // 0b4: ldc2_w 5549023228782825754
      // 0b7: lload 4
      // 0b9: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: astore 24
      // 0c0: aload 2
      // 0c1: aload 24
      // 0c3: ifnonnull 10c
      // 0c6: sipush 23838
      // 0c9: ldc2_w 6265386853784787686
      // 0cc: lload 4
      // 0ce: lxor
      // 0cf: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/am.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d7: ifeq 0f5
      // 0da: goto 0e8
      // 0dd: ldc2_w 5801805925642604672
      // 0e0: lload 4
      // 0e2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: bipush 0
      // 0e9: ireturn
      // 0ea: ldc2_w 5801805925642604672
      // 0ed: lload 4
      // 0ef: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: ldc2_w 6108286861042197937
      // 0f9: lload 4
      // 0fb: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: aload 3
      // 101: iload 21
      // 103: i2c
      // 104: iload 22
      // 106: aload 2
      // 107: iload 23
      // 109: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 10c: checkcast java/lang/Boolean
      // 10f: astore 25
      // 111: aload 25
      // 113: aload 24
      // 115: ifnonnull 12b
      // 118: ifnull 12f
      // 11b: goto 129
      // 11e: ldc2_w 5801805925642604672
      // 121: lload 4
      // 123: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: aload 25
      // 12b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12e: ireturn
      // 12f: aload 0
      // 130: lload 6
      // 132: aload 2
      // 133: bipush 2
      // 134: anewarray 406
      // 137: dup_x1
      // 138: swap
      // 139: bipush 1
      // 13a: swap
      // 13b: aastore
      // 13c: dup_x2
      // 13d: dup_x2
      // 13e: pop
      // 13f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 142: bipush 0
      // 143: swap
      // 144: aastore
      // 145: ldc2_w 6086491610080717654
      // 148: lload 4
      // 14a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: astore 26
      // 151: new com/zelix/yd
      // 154: dup
      // 155: aload 26
      // 157: lload 8
      // 159: bipush 1
      // 15a: anewarray 406
      // 15d: dup_x2
      // 15e: dup_x2
      // 15f: pop
      // 160: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: ldc2_w 5818582761448150396
      // 169: lload 4
      // 16b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: iload 12
      // 172: i2c
      // 173: swap
      // 174: lload 13
      // 176: dup2_x1
      // 177: pop2
      // 178: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // 17b: astore 27
      // 17d: aload 27
      // 17f: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 184: ifeq 270
      // 187: aload 27
      // 189: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 18e: checkcast java/lang/String
      // 191: astore 28
      // 193: aload 28
      // 195: aload 3
      // 196: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 199: aload 24
      // 19b: lload 4
      // 19d: lconst_0
      // 19e: lcmp
      // 19f: ifle 1a7
      // 1a2: ifnonnull 2ac
      // 1a5: aload 24
      // 1a7: ifnonnull 21f
      // 1aa: goto 1b8
      // 1ad: ldc2_w 5801805925642604672
      // 1b0: lload 4
      // 1b2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: athrow
      // 1b8: ifeq 1f8
      // 1bb: goto 1c9
      // 1be: ldc2_w 5801805925642604672
      // 1c1: lload 4
      // 1c3: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: ldc2_w 6108286861042197937
      // 1cd: lload 4
      // 1cf: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d4: aload 3
      // 1d5: aload 2
      // 1d6: ldc2_w 5855913394896482991
      // 1d9: lload 4
      // 1db: invokedynamic o (JJ)Ljava/lang/Boolean; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: iload 15
      // 1e2: iload 16
      // 1e4: i2b
      // 1e5: iload 17
      // 1e7: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 1ea: pop
      // 1eb: bipush 1
      // 1ec: ireturn
      // 1ed: ldc2_w 5801805925642604672
      // 1f0: lload 4
      // 1f2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: aload 28
      // 1fb: lload 10
      // 1fd: aload 3
      // 1fe: bipush 3
      // 1ff: anewarray 406
      // 202: dup_x1
      // 203: swap
      // 204: bipush 2
      // 205: swap
      // 206: aastore
      // 207: dup_x2
      // 208: dup_x2
      // 209: pop
      // 20a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20d: bipush 1
      // 20e: swap
      // 20f: aastore
      // 210: dup_x1
      // 211: swap
      // 212: bipush 0
      // 213: swap
      // 214: aastore
      // 215: ldc2_w 5799314832825548619
      // 218: lload 4
      // 21a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: istore 29
      // 221: iload 29
      // 223: aload 24
      // 225: ifnonnull 26a
      // 228: ifeq 26b
      // 22b: goto 239
      // 22e: ldc2_w 5801805925642604672
      // 231: lload 4
      // 233: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: athrow
      // 239: aload 0
      // 23a: ldc2_w 6108286861042197937
      // 23d: lload 4
      // 23f: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: aload 3
      // 245: aload 2
      // 246: ldc2_w 5855913394896482991
      // 249: lload 4
      // 24b: invokedynamic o (JJ)Ljava/lang/Boolean; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: iload 15
      // 252: iload 16
      // 254: i2b
      // 255: iload 17
      // 257: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 25a: pop
      // 25b: bipush 1
      // 25c: goto 26a
      // 25f: ldc2_w 5801805925642604672
      // 262: lload 4
      // 264: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: ireturn
      // 26b: aload 24
      // 26d: ifnull 17d
      // 270: aload 26
      // 272: iload 18
      // 274: iload 19
      // 276: iload 20
      // 278: i2c
      // 279: invokevirtual com/zelix/hy.O (IIC)Ljava/lang/String;
      // 27c: astore 28
      // 27e: aload 0
      // 27f: aload 28
      // 281: lload 10
      // 283: aload 3
      // 284: bipush 3
      // 285: anewarray 406
      // 288: dup_x1
      // 289: swap
      // 28a: bipush 2
      // 28b: swap
      // 28c: aastore
      // 28d: dup_x2
      // 28e: dup_x2
      // 28f: pop
      // 290: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 293: bipush 1
      // 294: swap
      // 295: aastore
      // 296: dup_x1
      // 297: swap
      // 298: bipush 0
      // 299: swap
      // 29a: aastore
      // 29b: ldc2_w 5799314832825548619
      // 29e: lload 4
      // 2a0: lload 4
      // 2a2: lconst_0
      // 2a3: lcmp
      // 2a4: iflt 21a
      // 2a7: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: istore 29
      // 2ae: aload 0
      // 2af: ldc2_w 6108286861042197937
      // 2b2: lload 4
      // 2b4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: aload 3
      // 2ba: aload 2
      // 2bb: iload 29
      // 2bd: ifeq 2d8
      // 2c0: ldc2_w 5855913394896482991
      // 2c3: lload 4
      // 2c5: invokedynamic o (JJ)Ljava/lang/Boolean; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: goto 2e2
      // 2cd: ldc2_w 5801805925642604672
      // 2d0: lload 4
      // 2d2: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: athrow
      // 2d8: ldc2_w 5976184454043165923
      // 2db: lload 4
      // 2dd: invokedynamic o (JJ)Ljava/lang/Boolean; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: iload 15
      // 2e4: iload 16
      // 2e6: i2b
      // 2e7: iload 17
      // 2e9: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 2ec: pop
      // 2ed: iload 29
      // 2ef: ireturn
   }

   public final boolean c(Object[] param1) {
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
      // 007: astore 4
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
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic com/zelix/am.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 58971434217191
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 89607398331405
      // 02e: lxor
      // 02f: dup2
      // 030: bipush 32
      // 032: lushr
      // 033: l2i
      // 034: istore 8
      // 036: dup2
      // 037: bipush 32
      // 039: lshl
      // 03a: bipush 56
      // 03c: lushr
      // 03d: l2i
      // 03e: istore 9
      // 040: dup2
      // 041: bipush 40
      // 043: lshl
      // 044: bipush 40
      // 046: lushr
      // 047: l2i
      // 048: istore 10
      // 04a: pop2
      // 04b: dup2
      // 04c: ldc2_w 14032087378344
      // 04f: lxor
      // 050: dup2
      // 051: bipush 32
      // 053: lushr
      // 054: l2i
      // 055: istore 11
      // 057: dup2
      // 058: bipush 32
      // 05a: lshl
      // 05b: bipush 48
      // 05d: lushr
      // 05e: l2i
      // 05f: istore 12
      // 061: dup2
      // 062: bipush 48
      // 064: lshl
      // 065: bipush 48
      // 067: lushr
      // 068: l2i
      // 069: istore 13
      // 06b: pop2
      // 06c: dup2
      // 06d: ldc2_w 95863821818492
      // 070: lxor
      // 071: lstore 14
      // 073: dup2
      // 074: ldc2_w 99063034815275
      // 077: lxor
      // 078: dup2
      // 079: bipush 48
      // 07b: lushr
      // 07c: l2i
      // 07d: istore 16
      // 07f: dup2
      // 080: bipush 16
      // 082: lshl
      // 083: bipush 32
      // 085: lushr
      // 086: l2i
      // 087: istore 17
      // 089: dup2
      // 08a: bipush 48
      // 08c: lshl
      // 08d: bipush 48
      // 08f: lushr
      // 090: l2i
      // 091: istore 18
      // 093: pop2
      // 094: pop2
      // 095: ldc2_w 3886454681859434999
      // 098: lload 2
      // 099: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: astore 19
      // 0a0: aload 4
      // 0a2: aload 19
      // 0a4: ifnonnull 0eb
      // 0a7: sipush 15177
      // 0aa: ldc2_w 7107581991476298833
      // 0ad: lload 2
      // 0ae: lxor
      // 0af: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/am.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b7: ifeq 0d3
      // 0ba: goto 0c7
      // 0bd: ldc2_w 2911934548150347885
      // 0c0: lload 2
      // 0c1: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: bipush 0
      // 0c8: ireturn
      // 0c9: ldc2_w 2911934548150347885
      // 0cc: lload 2
      // 0cd: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: ldc2_w 3609178973017917664
      // 0d7: lload 2
      // 0d8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: aload 5
      // 0df: iload 16
      // 0e1: i2c
      // 0e2: iload 17
      // 0e4: aload 4
      // 0e6: iload 18
      // 0e8: invokevirtual com/zelix/_8z.R (Ljava/lang/Object;CILjava/lang/Object;I)Ljava/lang/Object;
      // 0eb: checkcast java/lang/Boolean
      // 0ee: astore 20
      // 0f0: aload 20
      // 0f2: aload 19
      // 0f4: ifnonnull 109
      // 0f7: ifnull 10d
      // 0fa: goto 107
      // 0fd: ldc2_w 2911934548150347885
      // 100: lload 2
      // 101: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 20
      // 109: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 10c: ireturn
      // 10d: aload 0
      // 10e: lload 6
      // 110: aload 4
      // 112: bipush 2
      // 113: anewarray 406
      // 116: dup_x1
      // 117: swap
      // 118: bipush 1
      // 119: swap
      // 11a: aastore
      // 11b: dup_x2
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121: bipush 0
      // 122: swap
      // 123: aastore
      // 124: ldc2_w 3214141955065697211
      // 127: lload 2
      // 128: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: astore 22
      // 12f: aload 22
      // 131: iload 11
      // 133: iload 12
      // 135: iload 13
      // 137: i2c
      // 138: invokevirtual com/zelix/hy.O (IIC)Ljava/lang/String;
      // 13b: astore 21
      // 13d: aload 21
      // 13f: aload 5
      // 141: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 144: aload 19
      // 146: lload 2
      // 147: lconst_0
      // 148: lcmp
      // 149: ifle 1a1
      // 14c: ifnonnull 19f
      // 14f: ifeq 18d
      // 152: goto 15f
      // 155: ldc2_w 2911934548150347885
      // 158: lload 2
      // 159: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 0
      // 160: ldc2_w 3609178973017917664
      // 163: lload 2
      // 164: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: aload 5
      // 16b: aload 4
      // 16d: ldc2_w 3001931725868550722
      // 170: lload 2
      // 171: invokedynamic j (JJ)Ljava/lang/Boolean; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: iload 8
      // 178: iload 9
      // 17a: i2b
      // 17b: iload 10
      // 17d: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 180: pop
      // 181: bipush 1
      // 182: ireturn
      // 183: ldc2_w 2911934548150347885
      // 186: lload 2
      // 187: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: athrow
      // 18d: aload 21
      // 18f: sipush 23838
      // 192: ldc2_w 6265425100634448395
      // 195: lload 2
      // 196: lxor
      // 197: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/am.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 19f: aload 19
      // 1a1: ifnonnull 209
      // 1a4: ifeq 1e2
      // 1a7: goto 1b4
      // 1aa: ldc2_w 2911934548150347885
      // 1ad: lload 2
      // 1ae: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: ldc2_w 3609178973017917664
      // 1b8: lload 2
      // 1b9: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: aload 5
      // 1c0: aload 4
      // 1c2: ldc2_w 3027209301378407438
      // 1c5: lload 2
      // 1c6: invokedynamic j (JJ)Ljava/lang/Boolean; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: iload 8
      // 1cd: iload 9
      // 1cf: i2b
      // 1d0: iload 10
      // 1d2: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 1d5: pop
      // 1d6: bipush 0
      // 1d7: ireturn
      // 1d8: ldc2_w 2911934548150347885
      // 1db: lload 2
      // 1dc: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: aload 0
      // 1e3: aload 21
      // 1e5: lload 14
      // 1e7: aload 5
      // 1e9: bipush 3
      // 1ea: anewarray 406
      // 1ed: dup_x1
      // 1ee: swap
      // 1ef: bipush 2
      // 1f0: swap
      // 1f1: aastore
      // 1f2: dup_x2
      // 1f3: dup_x2
      // 1f4: pop
      // 1f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f8: bipush 1
      // 1f9: swap
      // 1fa: aastore
      // 1fb: dup_x1
      // 1fc: swap
      // 1fd: bipush 0
      // 1fe: swap
      // 1ff: aastore
      // 200: ldc2_w 3589372749649818869
      // 203: lload 2
      // 204: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: istore 23
      // 20b: aload 0
      // 20c: ldc2_w 3609178973017917664
      // 20f: lload 2
      // 210: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: aload 5
      // 217: aload 4
      // 219: iload 23
      // 21b: ifeq 234
      // 21e: ldc2_w 3001931725868550722
      // 221: lload 2
      // 222: invokedynamic j (JJ)Ljava/lang/Boolean; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: goto 23d
      // 22a: ldc2_w 2911934548150347885
      // 22d: lload 2
      // 22e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: athrow
      // 234: ldc2_w 3027209301378407438
      // 237: lload 2
      // 238: invokedynamic j (JJ)Ljava/lang/Boolean; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: iload 8
      // 23f: iload 9
      // 241: i2b
      // 242: iload 10
      // 244: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 247: pop
      // 248: iload 23
      // 24a: ireturn
   }

   static {
      long var9 = a ^ 3579587770952L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[19];
      int var5 = 0;
      String var4 = "F\u0011\tR\u0089òku½\u0011w¦`ß!\r«Ü\u009e§pvñ\u001d\u0007øG\u001a\u0095ô\u009c»0Tô8À\u0097\u008ev ù\u0006æH\u0014!ÚR?\u0085\u0019ÕV£ÔPmRüÇ\u001c6.ý®è\u0018K\u0099\rü\u008f\u0010\u0016\u0017þ¯Ûú\u008f,¡\u0002\u0001Ð3\u0010?\r(¥\u00adV,§ùØ|£\u0007Ò¯\u009b\u0089]BÇ\u0004ÿé\thðI\u000f£¼-\u0091Ný4\u0083,C¨_^\u009e|`ÞlÉh\u0011õÉë±o»\u0080j)\u009eãN`@\u0087\u008dE \u0092\u0011ù\u0098\u00ad¹\u008cP;Rÿø\u009f%mÒ}\u0002Ä<:Î\u0013\\µ\u001e\u00189x\u008f&Fât_°_xÏ\u009f\u0080\u0095 1ªXàã>°{\u0005²@ ÔÛÛh¿çë\u009f?\t9ÖÎûÿôáI\u0010>ïÝIk»ñ¿\u0010\u001e3S\u0099Ý[|0ªècCOX>\u0003[¤,\u0001E\u0006oQí'$v¯¯>dRË\u0080¿?Ç\u000bÍl-\u009e½Û\\WLþz\u009fÜì®\u0084\u0002`é3çZÉ\u000eG^\u009d \u000fjó\u008f\u001d8ã\fÙÛ\u0089ú\u0004§U\u0096c¨bÙ6\u0092ehÎ\u0088d\\\u0081/iáÔ\u0086H¤ti\u0002\u008c¦Ï#»d\u009a<(\u0014\u001f\u0000e½þ\u007f\u008fö&R \n\u0006ð¢\u009d\u0084÷ÀÜ&èÇ\u009c/\u009d^\u009e\u0011\u001b¨\u0018r\u0097\b:#(:®À¦ê¦G\u0004ÌÿÔßá5ÂCô©Jå\u0014xù\u0083u\u0084\r\u0090\u0005\u001dI\u0086\u009bò\fOÙ`/)(à4\u000f>cý\u000bØ_°ãW\u001b\u0017\u00ad\u0006ýê¤fòaû¬Q\bþ¯¡5V}\u009cz £\u008f\u0093\u0091· ílyö'§\u0014k4`M?j\u0088\u0089È»,\u000e9\u0098\u001f\u0005\u000eÂò\u0086Ý³i\u008dÎ\u0010Ï¯½Ê÷\u0005 \u009bÔ\u001fqÌ«ùø@ ;\u0005b¶·Ì\u0017 .þ¡Á¸¬Y\u0007Ñ{¢\u001a\u0015e\u0016}ëÖñiãm\u008fÙ(õÙ¿£\u0092\u0081\u0090ÿ¨ïÀ\u0005\u0000+\u0000*æ\u001a\u0006ò\u000b¿+\u0011\u009aub\u0014Z\u009fèÐ$\u0091~¿\u0017¬\u0088|h#Ï'kl\rï\u001câÕ¶Þ¶ëýÅAi^@;.\u008d*Â\\\u0006BÂSÏÞ\u0094[ç'\u001eü¸ÖÎ;®Nµ×ÁÇAM\u0018z\u0010-eù\u0005ü¡3\u008f¸\u009fâ*ó\u0018²²\u009f\u0007\u009a7{Á=Ï[öÇo\"õôÚ\u0007À1½éËtR\u0096ä\u0081\u0089~Ð\f°¥\t\u0088\u0010\u0007\u008aZ6²ô4\u00ad1©\u0090oÒ\u009aü\u0090\u0010 bãÔ\u0016ô¶½Ò<\u009d^°¾\u0013í";
      int var6 = "F\u0011\tR\u0089òku½\u0011w¦`ß!\r«Ü\u009e§pvñ\u001d\u0007øG\u001a\u0095ô\u009c»0Tô8À\u0097\u008ev ù\u0006æH\u0014!ÚR?\u0085\u0019ÕV£ÔPmRüÇ\u001c6.ý®è\u0018K\u0099\rü\u008f\u0010\u0016\u0017þ¯Ûú\u008f,¡\u0002\u0001Ð3\u0010?\r(¥\u00adV,§ùØ|£\u0007Ò¯\u009b\u0089]BÇ\u0004ÿé\thðI\u000f£¼-\u0091Ný4\u0083,C¨_^\u009e|`ÞlÉh\u0011õÉë±o»\u0080j)\u009eãN`@\u0087\u008dE \u0092\u0011ù\u0098\u00ad¹\u008cP;Rÿø\u009f%mÒ}\u0002Ä<:Î\u0013\\µ\u001e\u00189x\u008f&Fât_°_xÏ\u009f\u0080\u0095 1ªXàã>°{\u0005²@ ÔÛÛh¿çë\u009f?\t9ÖÎûÿôáI\u0010>ïÝIk»ñ¿\u0010\u001e3S\u0099Ý[|0ªècCOX>\u0003[¤,\u0001E\u0006oQí'$v¯¯>dRË\u0080¿?Ç\u000bÍl-\u009e½Û\\WLþz\u009fÜì®\u0084\u0002`é3çZÉ\u000eG^\u009d \u000fjó\u008f\u001d8ã\fÙÛ\u0089ú\u0004§U\u0096c¨bÙ6\u0092ehÎ\u0088d\\\u0081/iáÔ\u0086H¤ti\u0002\u008c¦Ï#»d\u009a<(\u0014\u001f\u0000e½þ\u007f\u008fö&R \n\u0006ð¢\u009d\u0084÷ÀÜ&èÇ\u009c/\u009d^\u009e\u0011\u001b¨\u0018r\u0097\b:#(:®À¦ê¦G\u0004ÌÿÔßá5ÂCô©Jå\u0014xù\u0083u\u0084\r\u0090\u0005\u001dI\u0086\u009bò\fOÙ`/)(à4\u000f>cý\u000bØ_°ãW\u001b\u0017\u00ad\u0006ýê¤fòaû¬Q\bþ¯¡5V}\u009cz £\u008f\u0093\u0091· ílyö'§\u0014k4`M?j\u0088\u0089È»,\u000e9\u0098\u001f\u0005\u000eÂò\u0086Ý³i\u008dÎ\u0010Ï¯½Ê÷\u0005 \u009bÔ\u001fqÌ«ùø@ ;\u0005b¶·Ì\u0017 .þ¡Á¸¬Y\u0007Ñ{¢\u001a\u0015e\u0016}ëÖñiãm\u008fÙ(õÙ¿£\u0092\u0081\u0090ÿ¨ïÀ\u0005\u0000+\u0000*æ\u001a\u0006ò\u000b¿+\u0011\u009aub\u0014Z\u009fèÐ$\u0091~¿\u0017¬\u0088|h#Ï'kl\rï\u001câÕ¶Þ¶ëýÅAi^@;.\u008d*Â\\\u0006BÂSÏÞ\u0094[ç'\u001eü¸ÖÎ;®Nµ×ÁÇAM\u0018z\u0010-eù\u0005ü¡3\u008f¸\u009fâ*ó\u0018²²\u009f\u0007\u009a7{Á=Ï[öÇo\"õôÚ\u0007À1½éËtR\u0096ä\u0081\u0089~Ð\f°¥\t\u0088\u0010\u0007\u008aZ6²ô4\u00ad1©\u0090oÒ\u009aü\u0090\u0010 bãÔ\u0016ô¶½Ò<\u009d^°¾\u0013í"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[19];
                     x = x44.a<"n">(7736711827530753548L, var9);
                     Z = x44.a<"n">(8012201245787247209L, var9);
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0003F\n°¯Jëâ¨f\u00ad\u009dÏ\u008372@8¹laN[ÃÏ\u008e\u0093IgÈ^\u000b`v\u00adM\u000b$+¡}ÿ\u008cÃàL\u008eâ\u00820l\u0099\u008abáÏ\u001d±Í\u0087W\u0018IW\u009fGu¦\u001fA\u009d\u0097^ñ1EÌû¤\nÑGû\u0081ÛQf`\u0019ÉÛT,§\u0081¬©u\f\u0090\u001c\u0019MDª¶ÛE\u0006\u0010\u000bö\u00905\u001dÝ\u0085ªÈº\u000eGõFi\u000eÀÅ¥";
                  var6 = "\u0003F\n°¯Jëâ¨f\u00ad\u009dÏ\u008372@8¹laN[ÃÏ\u008e\u0093IgÈ^\u000b`v\u00adM\u000b$+¡}ÿ\u008cÃàL\u008eâ\u00820l\u0099\u008abáÏ\u001d±Í\u0087W\u0018IW\u009fGu¦\u001fA\u009d\u0097^ñ1EÌû¤\nÑGû\u0081ÛQf`\u0019ÉÛT,§\u0081¬©u\f\u0090\u001c\u0019MDª¶ÛE\u0006\u0010\u000bö\u00905\u001dÝ\u0085ªÈº\u000eGõFi\u000eÀÅ¥"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   public void G(Object[] param1) {
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
      // 00a: lstore 2
      // 00b: pop
      // 00c: getstatic com/zelix/am.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 65926290033699
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 134370670443826
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 12079846327306
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 56052642203729
      // 02c: lxor
      // 02d: lstore 10
      // 02f: pop2
      // 030: ldc2_w -3339323991348326992
      // 033: lload 2
      // 034: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: astore 12
      // 03b: aload 0
      // 03c: aload 12
      // 03e: ifnonnull 0e7
      // 041: ldc2_w -3124385099777241617
      // 044: lload 2
      // 045: lload 2
      // 046: lconst_0
      // 047: lcmp
      // 048: iflt 0c9
      // 04b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: ifnull 080
      // 053: goto 060
      // 056: ldc2_w -3733934342210286550
      // 059: lload 2
      // 05a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: athrow
      // 060: aload 0
      // 061: ldc2_w -3124385099777241617
      // 064: lload 2
      // 065: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: ldc2_w -3118807961740747713
      // 06d: lload 2
      // 06e: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: goto 080
      // 076: ldc2_w -3733934342210286550
      // 079: lload 2
      // 07a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: aload 0
      // 081: ldc2_w -3003546548004574041
      // 084: lload 2
      // 085: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: lload 6
      // 08c: bipush 1
      // 08d: anewarray 406
      // 090: dup_x2
      // 091: dup_x2
      // 092: pop
      // 093: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 096: bipush 0
      // 097: swap
      // 098: aastore
      // 099: ldc2_w -3906846640936624786
      // 09c: lload 2
      // 09d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: aload 0
      // 0a3: ldc2_w -4004052776767669989
      // 0a6: lload 2
      // 0a7: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_8z; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: lload 6
      // 0ae: bipush 1
      // 0af: anewarray 406
      // 0b2: dup_x2
      // 0b3: dup_x2
      // 0b4: pop
      // 0b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w -3906846640936624786
      // 0be: lload 2
      // 0bf: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: aload 0
      // 0c5: ldc2_w -3630404377901255043
      // 0c8: lload 2
      // 0c9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_yk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: lload 10
      // 0d0: bipush 1
      // 0d1: anewarray 406
      // 0d4: dup_x2
      // 0d5: dup_x2
      // 0d6: pop
      // 0d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0da: bipush 0
      // 0db: swap
      // 0dc: aastore
      // 0dd: ldc2_w -3564149207839308956
      // 0e0: lload 2
      // 0e1: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: aload 0
      // 0e7: lload 2
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: ifle 13b
      // 0ed: aload 12
      // 0ef: ifnonnull 13b
      // 0f2: ldc2_w -3010329128390734810
      // 0f5: lload 2
      // 0f6: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/rl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: ifnull 13a
      // 0fe: goto 10b
      // 101: ldc2_w -3733934342210286550
      // 104: lload 2
      // 105: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: aload 0
      // 10c: ldc2_w -3010329128390734810
      // 10f: lload 2
      // 110: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/rl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: lload 4
      // 117: bipush 1
      // 118: anewarray 406
      // 11b: dup_x2
      // 11c: dup_x2
      // 11d: pop
      // 11e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 121: bipush 0
      // 122: swap
      // 123: aastore
      // 124: ldc2_w -3541967240101500481
      // 127: lload 2
      // 128: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: goto 13a
      // 130: ldc2_w -3733934342210286550
      // 133: lload 2
      // 134: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 0
      // 13b: ldc2_w -3078394860556534825
      // 13e: lload 2
      // 13f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: aload 12
      // 146: lload 2
      // 147: lconst_0
      // 148: lcmp
      // 149: ifle 185
      // 14c: ifnonnull 176
      // 14f: ifnull 18e
      // 152: goto 15f
      // 155: ldc2_w -3733934342210286550
      // 158: lload 2
      // 159: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 0
      // 160: ldc2_w -3078394860556534825
      // 163: lload 2
      // 164: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: goto 176
      // 16c: ldc2_w -3733934342210286550
      // 16f: lload 2
      // 170: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: lload 8
      // 178: bipush 1
      // 179: anewarray 406
      // 17c: dup_x2
      // 17d: dup_x2
      // 17e: pop
      // 17f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 182: bipush 0
      // 183: swap
      // 184: aastore
      // 185: ldc2_w -3061243867784601410
      // 188: lload 2
      // 189: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: return
   }

   public am(int var1, char var2, po var3, short var4, boolean var5) {
      long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 128509602350762L;
      int var10 = (int)((var6 ^ 46887842516167L) >>> 48);
      long var11 = (var6 ^ 46887842516167L) << 16 >>> 16;
      long var13 = var6 ^ 103720138255355L;
      long var15 = var6 ^ 63716819680293L;
      long var17 = var6 ^ 83877796346753L;
      super();
      x44.a<"w">(this, new _yk((short)var10, var11), 7259304807758602077L, var6);
      x44.a<"w">(this, new pg(var17), 7490231383523943971L, var6);
      x44.a<"w">(this, new _8z(var15), 9183208401222927751L, var6);
      x44.a<"w">(this, new _8z(var15), 7011737416826884155L, var6);
      x44.a<"w">(this, var3, 8964227170988921591L, var6);
      this.h = var5;
      x44.a<"l">(x44.a<"h">(this, 8964227170988921591L, var6), new Object[]{this, var8}, 7183131887053895600L, var6);
      x44.a<"j">(this, new Object[]{var13}, 8678992193813997615L, var6);
   }

   public hy d(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 27528977785500L;
      long var7 = var2 ^ 79268773547097L;
      long var9 = var2 ^ 111762748633796L;
      long var11 = var2 ^ 48055084416751L;
      long var13 = var2 ^ 53459581876053L;
      long var15 = var2 ^ 63411896544015L;
      long var17 = var2 ^ 680834466429L;
      long var19 = var2 ^ 37165301373645L;
      long var21 = var2 ^ 32515492866491L;
      long var23 = var2 ^ 84848260603251L;
      long var25 = var2 ^ 57584989226443L;
      long var27 = var2 ^ 110333870670156L;
      long var29 = var2 ^ 72019644881375L;
      long var10001 = var2 ^ 871233451185L;
      int var31 = (int)((var2 ^ 871233451185L) >>> 32);
      int var32 = (int)((var2 ^ 871233451185L) << 32 >>> 48);
      int var33 = (int)(var10001 << 48 >>> 48);
      hk[] var34 = x44.a<"p">(-9118637630315422356L, var2);

      Object var10000;
      label165: {
         label164: {
            try {
               var10000 = var4;
               if (var34 != null) {
                  break label165;
               }

               if (!var4.startsWith("[")) {
                  break label164;
               }
            } catch (IOException var57) {
               throw x44.a<"p">(var57, -7137598920039277322L, var2);
            }

            var4 = a<"z">(23838, 6265387226239686288L ^ var2);
         }

         var10000 = x44.a<"l">(this, -8899194602239206093L, var2).get(var4);
      }

      hy var35 = (hy)var10000;

      label188: {
         try {
            if (var34 != null) {
               return var35;
            }

            if (var35 == null) {
               break label188;
            }
         } catch (IOException var56) {
            throw x44.a<"p">(var56, -7137598920039277322L, var2);
         }

         return var35;
      }

      var10000 = x44.a<"l">(this, -8726453814238503686L, var2);
      Object[] var10005 = new Object[]{null, null, false};
      var10005[1] = var9;
      var10005[0] = var4;
      _rv var36 = x44.a<"h">(var10000, var10005, -7343723635318109641L, var2);
      int var37 = 0;
      Object var38 = null;

      label170: {
         label171: {
            try {
               if (var36 != null) {
                  break label171;
               }

               if (!x44.a<"h">(x44.a<"l">(this, -8819427090939516149L, var2), new Object[]{var25}, -9107758027393788964L, var2)) {
                  throw new _sr(
                     var31, (char)var32, var33, var4, a<"z">(19054, 5261533330983174626L ^ var2) + sh.b(var4) + a<"z">(19448, 4293184240937222268L ^ var2)
                  );
               }
            } catch (IOException var55) {
               throw x44.a<"p">(var55, -7137598920039277322L, var2);
            }

            Object var39 = null;

            try {
               pg var40 = new pg(var17);
               var39 = x44.a<"h">(x44.a<"l">(this, -8819427090939516149L, var2), new Object[]{var4, var40, var29}, -7479832486520496879L, var2);

               label132: {
                  try {
                     if (var34 != null) {
                        break label132;
                     }

                     if (var39 == null) {
                        throw new _sr(
                           var31, (char)var32, var33, var4, a<"z">(29837, 195213515704565515L ^ var2) + sh.b(var4) + a<"z">(19495, 8853777539672950698L ^ var2)
                        );
                     }
                  } catch (IOException var53) {
                     throw x44.a<"p">(var53, -7137598920039277322L, var2);
                  }

                  var36 = new _rv((Path)var40.G(), x44.a<"l">(this, -8819427090939516149L, var2), var7);
               }

               var38 = new ByteArrayInputStream((byte[])var39);
               var37 = ((Object[])var39).length;
               break label170;
            } catch (IOException var54) {
               throw new _sr(
                  var31, (char)var32, var33, var4, a<"z">(19054, 5261533330983174626L ^ var2) + sh.b(var4) + a<"z">(28435, 6647640645540799636L ^ var2)
               );
            }
         }

         wp var63 = new wp(0);

         try {
            var38 = x44.a<"h">(var36, new Object[]{var11, var63}, -7246851850643831246L, var2);
            var37 = var63.C(var13);
         } catch (IOException var48) {
            throw new _sr(var31, (char)var32, var33, var4, "'" + var4 + a<"z">(19040, 5913730893199065579L ^ var2) + var48 + "'");
         }
      }

      try {
         label117: {
            label116: {
               try {
                  var10000 = var38;
                  var69 = var34;
                  if (var2 <= 0L) {
                     break label117;
                  }

                  if (var34 != null) {
                     break label116;
                  }

                  if (var38 == null) {
                     throw new _sy(a<"z">(19054, 5261533330983174626L ^ var2) + sh.b(var4) + a<"z">(19139, 2253986857999515986L ^ var2));
                  }
               } catch (IOException var51) {
                  throw x44.a<"p">(var51, -7137598920039277322L, var2);
               }

               var10000 = var38;
            }

            Object[] var10004 = new Object[]{null, null, var37};
            var69 = var10004;
            var10004[1] = var21;
         }

         ((Object[])var69)[0] = var10000;
         _xx var64 = x44.a<"p">(var69, -8799608912388791654L, var2);
         StringWriter var65 = new StringWriter();
         PrintWriter var41 = new PrintWriter(var65);
         StringWriter var42 = new StringWriter();
         PrintWriter var43 = new PrintWriter(var42);
         ej var44 = new ej(4, 3, 5, 5, var27, false);

         try {
            var35 = new hy(
               var64, var5, var36, x44.a<"l">(this, -7057447285566103585L, var2), x44.a<"l">(this, -7114992979322313055L, var2), var41, var43, var44
            );
         } catch (_sk var47) {
            throw new _sy(x44.a<"h">(var47, -7465881498360644276L, var2));
         }

         label191: {
            try {
               if (var2 < 0L || var34 != null) {
                  return var35;
               }

               if (!var4.equals(var35.k(var19))) {
                  break label191;
               }
            } catch (IOException var50) {
               throw x44.a<"p">(var50, -7137598920039277322L, var2);
            }

            x44.a<"l">(this, -8899194602239206093L, var2).put(var4, var35);
            return var35;
         }

         String var45 = var36.w();
         String var46 = var36.J(var15);

         try {
            if (var46 != null) {
               throw new _sy(
                  a<"z">(26312, 3552632990289227081L ^ var2)
                     + var45
                     + a<"z">(12494, 4629976208369269574L ^ var2)
                     + var46
                     + a<"z">(31883, 8924233309395908363L ^ var2)
                     + x44.a<"h">(var35, new Object[]{var23}, -8757878424771783969L, var2)
                     + a<"z">(13655, 3877362805759524574L ^ var2)
                     + sh.b(var4)
                     + a<"z">(3589, 1515019381874886023L ^ var2)
               );
            }
         } catch (IOException var49) {
            throw x44.a<"p">(var49, -7137598920039277322L, var2);
         }

         throw new _sy(
            a<"z">(27189, 2185936696131608998L ^ var2)
               + var45
               + a<"z">(8303, 5766489421248900069L ^ var2)
               + x44.a<"h">(var35, new Object[]{var23}, -8757878424771783969L, var2)
               + a<"z">(20014, 8081883092320503201L ^ var2)
               + sh.b(var4)
               + a<"z">(14703, 5950565653955064573L ^ var2)
         );
      } catch (IOException var52) {
         throw new _sy("'" + sh.b(var4) + a<"z">(1841, 7321474383740275892L ^ var2) + var52);
      }
   }

   private void E(Object[] param1) {
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
      // 0c: getstatic com/zelix/am.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 7673811354507
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 123032759182698
      // 1e: lxor
      // 1f: lstore 6
      // 21: dup2
      // 22: ldc2_w 109390730702821
      // 25: lxor
      // 26: lstore 8
      // 28: dup2
      // 29: ldc2_w 69963934930052
      // 2c: lxor
      // 2d: lstore 10
      // 2f: pop2
      // 30: ldc2_w -8570540505310817001
      // 33: lload 2
      // 34: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: astore 12
      // 3b: aload 0
      // 3c: aload 12
      // 3e: ifnonnull cb
      // 41: ldc2_w -8170042304855927679
      // 44: lload 2
      // 45: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/rl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: ifnull 89
      // 4d: goto 5a
      // 50: ldc2_w -7743550144585870195
      // 53: lload 2
      // 54: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: ldc2_w -8170042304855927679
      // 5e: lload 2
      // 5f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/rl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: lload 10
      // 66: bipush 1
      // 67: anewarray 406
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 0
      // 71: swap
      // 72: aastore
      // 73: ldc2_w -7602247850612117224
      // 76: lload 2
      // 77: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: goto 89
      // 7f: ldc2_w -7743550144585870195
      // 82: lload 2
      // 83: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 0
      // 8a: new com/zelix/rl
      // 8d: dup
      // 8e: aload 0
      // 8f: ldc2_w -8223471235619101840
      // 92: lload 2
      // 93: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/po; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: lload 6
      // 9a: bipush 1
      // 9b: anewarray 406
      // 9e: dup_x2
      // 9f: dup_x2
      // a0: pop
      // a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a4: bipush 0
      // a5: swap
      // a6: aastore
      // a7: ldc2_w -8146891151816320046
      // aa: lload 2
      // ab: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: aload 0
      // b1: ldc2_w -7766357259030563706
      // b4: lload 2
      // b5: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: lload 8
      // bc: dup2_x1
      // bd: pop2
      // be: invokespecial com/zelix/rl.<init> (Ljava/lang/String;JZ)V
      // c1: ldc2_w -8170042304855927679
      // c4: lload 2
      // c5: invokedynamic p (Ljava/lang/Object;Lcom/zelix/rl;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: aload 0
      // cb: lload 4
      // cd: bipush 1
      // ce: anewarray 406
      // d1: dup_x2
      // d2: dup_x2
      // d3: pop
      // d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d7: bipush 0
      // d8: swap
      // d9: aastore
      // da: ldc2_w -8180885051068356584
      // dd: lload 2
      // de: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: ldc2_w -8357291013426555576
      // e6: lload 2
      // e7: invokedynamic p (Ljava/lang/Object;Ljava/util/HashMap;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ec: return
   }

   public void G(long var1, v_ var3, Object var4, Object var5, Object var6) {
      long var7 = var1 ^ 138525712379992L;
      x44.a<"i">(this, new Object[]{var7}, -6642005969386327156L, var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 896;
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
            throw new RuntimeException("com/zelix/am", var10);
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
         throw new RuntimeException("com/zelix/am" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
