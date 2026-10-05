package com.zelix;

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

public class w0 {
   private static final long a = ess.a(-2195181899845109347L, -753684700742505404L, MethodHandles.lookup().lookupClass()).a(24248656410718L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public static long T(Object[] param0) {
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
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: pop
      // 013: getstatic com/zelix/w0.a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: ldc2_w -2329839373875886418
      // 01c: lload 1
      // 01d: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 3
      // 023: invokevirtual java/lang/String.toCharArray ()[C
      // 026: astore 5
      // 028: astore 4
      // 02a: aload 5
      // 02c: arraylength
      // 02d: newarray 5
      // 02f: astore 6
      // 031: bipush 0
      // 032: istore 7
      // 034: iload 7
      // 036: aload 5
      // 038: arraylength
      // 039: if_icmpge 449
      // 03c: aload 5
      // 03e: iload 7
      // 040: caload
      // 041: istore 8
      // 043: iload 8
      // 045: sipush 2155
      // 048: ldc2_w 1131837924789791649
      // 04b: lload 1
      // 04c: lxor
      // 04d: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: aload 4
      // 054: ifnonnull 130
      // 057: if_icmplt 114
      // 05a: goto 067
      // 05d: ldc2_w -4601193400837981322
      // 060: lload 1
      // 061: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: iload 8
      // 069: sipush 16354
      // 06c: ldc2_w 8775119279887981626
      // 06f: lload 1
      // 070: lxor
      // 071: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: aload 4
      // 078: lload 1
      // 079: lconst_0
      // 07a: lcmp
      // 07b: iflt 132
      // 07e: ifnonnull 130
      // 081: goto 08e
      // 084: ldc2_w -4601193400837981322
      // 087: lload 1
      // 088: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: lload 1
      // 08f: lconst_0
      // 090: lcmp
      // 091: ifle 123
      // 094: if_icmpgt 114
      // 097: goto 0a4
      // 09a: ldc2_w -4601193400837981322
      // 09d: lload 1
      // 09e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: iload 8
      // 0a6: lload 1
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: iflt 107
      // 0ac: sipush 21386
      // 0af: ldc2_w 4052515370933153883
      // 0b2: lload 1
      // 0b3: lxor
      // 0b4: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: aload 4
      // 0bb: ifnonnull 105
      // 0be: goto 0cb
      // 0c1: ldc2_w -4601193400837981322
      // 0c4: lload 1
      // 0c5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: if_icmple 43a
      // 0ce: goto 0db
      // 0d1: ldc2_w -4601193400837981322
      // 0d4: lload 1
      // 0d5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: sipush 32688
      // 0de: ldc2_w 8262002239827663971
      // 0e1: lload 1
      // 0e2: lxor
      // 0e3: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: iload 8
      // 0ea: isub
      // 0eb: sipush 21386
      // 0ee: ldc2_w 4052515370933153883
      // 0f1: lload 1
      // 0f2: lxor
      // 0f3: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: goto 105
      // 0fb: ldc2_w -4601193400837981322
      // 0fe: lload 1
      // 0ff: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: iadd
      // 106: i2c
      // 107: istore 8
      // 109: aload 4
      // 10b: lload 1
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: iflt 446
      // 111: ifnull 43a
      // 114: iload 8
      // 116: sipush 22256
      // 119: ldc2_w 4285142569329587503
      // 11c: lload 1
      // 11d: lxor
      // 11e: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: goto 130
      // 126: ldc2_w -4601193400837981322
      // 129: lload 1
      // 12a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 4
      // 132: ifnonnull 1b6
      // 135: if_icmplt 19a
      // 138: goto 145
      // 13b: ldc2_w -4601193400837981322
      // 13e: lload 1
      // 13f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: iload 8
      // 147: sipush 32367
      // 14a: ldc2_w 7384366401073503674
      // 14d: lload 1
      // 14e: lxor
      // 14f: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: aload 4
      // 156: lload 1
      // 157: lconst_0
      // 158: lcmp
      // 159: iflt 1b8
      // 15c: ifnonnull 1b6
      // 15f: goto 16c
      // 162: ldc2_w -4601193400837981322
      // 165: lload 1
      // 166: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: if_icmpgt 19a
      // 16f: goto 17c
      // 172: ldc2_w -4601193400837981322
      // 175: lload 1
      // 176: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: iload 8
      // 17e: sipush 27851
      // 181: ldc2_w 5182978026554478354
      // 184: lload 1
      // 185: lxor
      // 186: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: isub
      // 18c: i2c
      // 18d: istore 8
      // 18f: aload 4
      // 191: lload 1
      // 192: lconst_0
      // 193: lcmp
      // 194: ifle 446
      // 197: ifnull 43a
      // 19a: iload 8
      // 19c: sipush 6841
      // 19f: ldc2_w 7927171607142250865
      // 1a2: lload 1
      // 1a3: lxor
      // 1a4: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: goto 1b6
      // 1ac: ldc2_w -4601193400837981322
      // 1af: lload 1
      // 1b0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: aload 4
      // 1b8: ifnonnull 23c
      // 1bb: if_icmplt 220
      // 1be: goto 1cb
      // 1c1: ldc2_w -4601193400837981322
      // 1c4: lload 1
      // 1c5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: iload 8
      // 1cd: sipush 12825
      // 1d0: ldc2_w 5593064288265507277
      // 1d3: lload 1
      // 1d4: lxor
      // 1d5: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: aload 4
      // 1dc: lload 1
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: iflt 23e
      // 1e2: ifnonnull 23c
      // 1e5: goto 1f2
      // 1e8: ldc2_w -4601193400837981322
      // 1eb: lload 1
      // 1ec: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: athrow
      // 1f2: if_icmpgt 220
      // 1f5: goto 202
      // 1f8: ldc2_w -4601193400837981322
      // 1fb: lload 1
      // 1fc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: iload 8
      // 204: sipush 15776
      // 207: ldc2_w 1348390096216301179
      // 20a: lload 1
      // 20b: lxor
      // 20c: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: isub
      // 212: i2c
      // 213: istore 8
      // 215: aload 4
      // 217: lload 1
      // 218: lconst_0
      // 219: lcmp
      // 21a: iflt 446
      // 21d: ifnull 43a
      // 220: iload 8
      // 222: sipush 24955
      // 225: ldc2_w 1465853737697854133
      // 228: lload 1
      // 229: lxor
      // 22a: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: goto 23c
      // 232: ldc2_w -4601193400837981322
      // 235: lload 1
      // 236: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: athrow
      // 23c: aload 4
      // 23e: ifnonnull 2c2
      // 241: if_icmplt 2a6
      // 244: goto 251
      // 247: ldc2_w -4601193400837981322
      // 24a: lload 1
      // 24b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: athrow
      // 251: iload 8
      // 253: sipush 1685
      // 256: ldc2_w 8698345020045763932
      // 259: lload 1
      // 25a: lxor
      // 25b: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: aload 4
      // 262: lload 1
      // 263: lconst_0
      // 264: lcmp
      // 265: iflt 2c4
      // 268: ifnonnull 2c2
      // 26b: goto 278
      // 26e: ldc2_w -4601193400837981322
      // 271: lload 1
      // 272: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: athrow
      // 278: if_icmpgt 2a6
      // 27b: goto 288
      // 27e: ldc2_w -4601193400837981322
      // 281: lload 1
      // 282: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: athrow
      // 288: iload 8
      // 28a: sipush 27886
      // 28d: ldc2_w 1150701535588765492
      // 290: lload 1
      // 291: lxor
      // 292: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: isub
      // 298: i2c
      // 299: istore 8
      // 29b: aload 4
      // 29d: lload 1
      // 29e: lconst_0
      // 29f: lcmp
      // 2a0: ifle 446
      // 2a3: ifnull 43a
      // 2a6: iload 8
      // 2a8: sipush 15263
      // 2ab: ldc2_w 6045004478827796560
      // 2ae: lload 1
      // 2af: lxor
      // 2b0: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: goto 2c2
      // 2b8: ldc2_w -4601193400837981322
      // 2bb: lload 1
      // 2bc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: aload 4
      // 2c4: ifnonnull 348
      // 2c7: if_icmplt 32c
      // 2ca: goto 2d7
      // 2cd: ldc2_w -4601193400837981322
      // 2d0: lload 1
      // 2d1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: athrow
      // 2d7: iload 8
      // 2d9: sipush 19860
      // 2dc: ldc2_w 8428634542940286537
      // 2df: lload 1
      // 2e0: lxor
      // 2e1: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e6: aload 4
      // 2e8: lload 1
      // 2e9: lconst_0
      // 2ea: lcmp
      // 2eb: ifle 34a
      // 2ee: ifnonnull 348
      // 2f1: goto 2fe
      // 2f4: ldc2_w -4601193400837981322
      // 2f7: lload 1
      // 2f8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: athrow
      // 2fe: if_icmpgt 32c
      // 301: goto 30e
      // 304: ldc2_w -4601193400837981322
      // 307: lload 1
      // 308: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: athrow
      // 30e: iload 8
      // 310: sipush 30829
      // 313: ldc2_w 4874505869208312753
      // 316: lload 1
      // 317: lxor
      // 318: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31d: isub
      // 31e: i2c
      // 31f: istore 8
      // 321: aload 4
      // 323: lload 1
      // 324: lconst_0
      // 325: lcmp
      // 326: iflt 446
      // 329: ifnull 43a
      // 32c: iload 8
      // 32e: sipush 17206
      // 331: ldc2_w 5189343088911147238
      // 334: lload 1
      // 335: lxor
      // 336: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: goto 348
      // 33e: ldc2_w -4601193400837981322
      // 341: lload 1
      // 342: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: athrow
      // 348: aload 4
      // 34a: ifnonnull 3ce
      // 34d: if_icmplt 3b2
      // 350: goto 35d
      // 353: ldc2_w -4601193400837981322
      // 356: lload 1
      // 357: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: athrow
      // 35d: iload 8
      // 35f: sipush 16124
      // 362: ldc2_w 1382821684824743211
      // 365: lload 1
      // 366: lxor
      // 367: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36c: aload 4
      // 36e: lload 1
      // 36f: lconst_0
      // 370: lcmp
      // 371: ifle 3d0
      // 374: ifnonnull 3ce
      // 377: goto 384
      // 37a: ldc2_w -4601193400837981322
      // 37d: lload 1
      // 37e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: athrow
      // 384: if_icmpgt 3b2
      // 387: goto 394
      // 38a: ldc2_w -4601193400837981322
      // 38d: lload 1
      // 38e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 393: athrow
      // 394: iload 8
      // 396: sipush 29337
      // 399: ldc2_w 8209388474289213775
      // 39c: lload 1
      // 39d: lxor
      // 39e: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: isub
      // 3a4: i2c
      // 3a5: istore 8
      // 3a7: aload 4
      // 3a9: lload 1
      // 3aa: lconst_0
      // 3ab: lcmp
      // 3ac: ifle 446
      // 3af: ifnull 43a
      // 3b2: iload 8
      // 3b4: sipush 5342
      // 3b7: ldc2_w 539003020905428736
      // 3ba: lload 1
      // 3bb: lxor
      // 3bc: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c1: goto 3ce
      // 3c4: ldc2_w -4601193400837981322
      // 3c7: lload 1
      // 3c8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cd: athrow
      // 3ce: aload 4
      // 3d0: lload 1
      // 3d1: lconst_0
      // 3d2: lcmp
      // 3d3: iflt 407
      // 3d6: ifnonnull 405
      // 3d9: if_icmplt 43a
      // 3dc: goto 3e9
      // 3df: ldc2_w -4601193400837981322
      // 3e2: lload 1
      // 3e3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e8: athrow
      // 3e9: iload 8
      // 3eb: sipush 24433
      // 3ee: ldc2_w 6245319042351660218
      // 3f1: lload 1
      // 3f2: lxor
      // 3f3: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f8: goto 405
      // 3fb: ldc2_w -4601193400837981322
      // 3fe: lload 1
      // 3ff: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 404: athrow
      // 405: aload 4
      // 407: ifnonnull 436
      // 40a: if_icmpgt 43a
      // 40d: goto 41a
      // 410: ldc2_w -4601193400837981322
      // 413: lload 1
      // 414: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 419: athrow
      // 41a: iload 8
      // 41c: sipush 21427
      // 41f: ldc2_w 4747310893716041825
      // 422: lload 1
      // 423: lxor
      // 424: invokedynamic w (IJ)I bsm=com/zelix/w0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 429: goto 436
      // 42c: ldc2_w -4601193400837981322
      // 42f: lload 1
      // 430: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 435: athrow
      // 436: isub
      // 437: i2c
      // 438: istore 8
      // 43a: aload 6
      // 43c: iload 7
      // 43e: iload 8
      // 440: castore
      // 441: iinc 7 1
      // 444: aload 4
      // 446: ifnull 034
      // 449: new java/lang/String
      // 44c: dup
      // 44d: aload 6
      // 44f: invokespecial java/lang/String.<init> ([C)V
      // 452: ldc2_w -2343569746460168124
      // 455: lload 1
      // 456: invokedynamic s (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45b: lreturn
   }

   static {
      long var0 = a ^ 81819954143316L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[22];
      int var5 = 0;
      String var6 = "\u0003\u008a\u00842þ®ÏzÉ\u0085cÑÊA\u009b¨9¹\u0016CÿgÎ\u009a\u0003¬Ñæ®öÞ\u0019Ãè¹\u001f>%Qow\u0089¢ùçýMPÇYBÈa\u00ad>\u001fLÕ\u0089LjK¡ËìþsÙÂ®ù%X]ØÉ\u009c²5\u0019ÄØkT¸d¦\u0003#\u000fÊPv/Ó\u0080¸òt!½«Ë\u0089©}È\u0084Àí¬N\u009fÍV<Y\u0081\u0091\u008c3\u0003tÝ\u009eüÿ·Ê\u0090|2§\u001aèéõ\u008d·>ßS\u0015S\u00ad\u0080½ù\u001dp\u001bÊÚJ×JTz*î";
      int var7 = "\u0003\u008a\u00842þ®ÏzÉ\u0085cÑÊA\u009b¨9¹\u0016CÿgÎ\u009a\u0003¬Ñæ®öÞ\u0019Ãè¹\u001f>%Qow\u0089¢ùçýMPÇYBÈa\u00ad>\u001fLÕ\u0089LjK¡ËìþsÙÂ®ù%X]ØÉ\u009c²5\u0019ÄØkT¸d¦\u0003#\u000fÊPv/Ó\u0080¸òt!½«Ë\u0089©}È\u0084Àí¬N\u009fÍV<Y\u0081\u0091\u008c3\u0003tÝ\u009eüÿ·Ê\u0090|2§\u001aèéõ\u008d·>ßS\u0015S\u00ad\u0080½ù\u001dp\u001bÊÚJ×JTz*î"
         .length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
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
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[22];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "üe~M«¹Ï\u0098a\u0092¡r×ðºÀ";
                  var7 = "üe~M«¹Ï\u0098a\u0092¡r×ðºÀ".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28331;
      if (c[var3] == null) {
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/w0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("com/zelix/w0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
