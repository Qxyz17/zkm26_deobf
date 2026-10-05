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

public class _ka extends _kr {
   private static final long a = ess.a(-4447977056198392607L, 4932189046155511665L, MethodHandles.lookup().lookupClass()).a(238659617356511L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public void X(Object[] param1) {
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
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 7
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Map
      // 017: astore 4
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 5
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/util/Map
      // 02a: astore 9
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/util/Map
      // 032: astore 2
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/_8z
      // 03a: astore 3
      // 03b: pop
      // 03c: lload 5
      // 03e: dup2
      // 03f: ldc2_w 50525634640419
      // 042: lxor
      // 043: lstore 10
      // 045: dup2
      // 046: ldc2_w 70543496593817
      // 049: lxor
      // 04a: lstore 12
      // 04c: dup2
      // 04d: ldc2_w 138767414763907
      // 050: lxor
      // 051: lstore 14
      // 053: pop2
      // 054: ldc2_w -2653834964154813916
      // 057: lload 5
      // 059: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: astore 16
      // 060: aload 7
      // 062: aload 16
      // 064: ifnonnull 12a
      // 067: ifnonnull 0da
      // 06a: goto 078
      // 06d: ldc2_w -4206088334874647025
      // 070: lload 5
      // 072: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: new com/zelix/_s2
      // 07b: dup
      // 07c: new java/lang/StringBuilder
      // 07f: dup
      // 080: invokespecial java/lang/StringBuilder.<init> ()V
      // 083: sipush 27620
      // 086: ldc2_w 5171999516890523396
      // 089: lload 5
      // 08b: lxor
      // 08c: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 094: lload 12
      // 096: aload 8
      // 098: bipush 2
      // 099: anewarray 93
      // 09c: dup_x1
      // 09d: swap
      // 09e: bipush 1
      // 09f: swap
      // 0a0: aastore
      // 0a1: dup_x2
      // 0a2: dup_x2
      // 0a3: pop
      // 0a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a7: bipush 0
      // 0a8: swap
      // 0a9: aastore
      // 0aa: ldc2_w -4163314010655871518
      // 0ad: lload 5
      // 0af: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: sipush 13435
      // 0ba: ldc2_w 5174268476425812145
      // 0bd: lload 5
      // 0bf: lxor
      // 0c0: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0cb: invokespecial com/zelix/_s2.<init> (Ljava/lang/String;)V
      // 0ce: athrow
      // 0cf: ldc2_w -4206088334874647025
      // 0d2: lload 5
      // 0d4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: new java/lang/StringBuilder
      // 0dd: dup
      // 0de: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e1: sipush 9209
      // 0e4: ldc2_w 7576240415100612405
      // 0e7: lload 5
      // 0e9: lxor
      // 0ea: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f2: aload 0
      // 0f3: ldc2_w -4125288569072156257
      // 0f6: lload 5
      // 0f8: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 100: sipush 2734
      // 103: ldc2_w 5501322849609713261
      // 106: lload 5
      // 108: lxor
      // 109: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 111: aload 7
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 116: sipush 4010
      // 119: ldc2_w 8804608933576573762
      // 11c: lload 5
      // 11e: lxor
      // 11f: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12a: astore 17
      // 12c: aload 7
      // 12e: aload 16
      // 130: ifnonnull 3ce
      // 133: sipush 13809
      // 136: ldc2_w 5587192725179971882
      // 139: lload 5
      // 13b: lxor
      // 13c: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 144: ifne 391
      // 147: goto 155
      // 14a: ldc2_w -4206088334874647025
      // 14d: lload 5
      // 14f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 7
      // 157: aload 16
      // 159: ifnonnull 3ce
      // 15c: goto 16a
      // 15f: ldc2_w -4206088334874647025
      // 162: lload 5
      // 164: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: lload 5
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: ifle 3c0
      // 171: sipush 23553
      // 174: ldc2_w 6886263448441442506
      // 177: lload 5
      // 179: lxor
      // 17a: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 182: ifne 391
      // 185: goto 193
      // 188: ldc2_w -4206088334874647025
      // 18b: lload 5
      // 18d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: aload 7
      // 195: aload 16
      // 197: ifnonnull 3ce
      // 19a: goto 1a8
      // 19d: ldc2_w -4206088334874647025
      // 1a0: lload 5
      // 1a2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: lload 5
      // 1aa: lconst_0
      // 1ab: lcmp
      // 1ac: iflt 3c0
      // 1af: sipush 12750
      // 1b2: ldc2_w 9139014918544014634
      // 1b5: lload 5
      // 1b7: lxor
      // 1b8: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c0: ifne 391
      // 1c3: goto 1d1
      // 1c6: ldc2_w -4206088334874647025
      // 1c9: lload 5
      // 1cb: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: aload 7
      // 1d3: aload 16
      // 1d5: ifnonnull 3ce
      // 1d8: goto 1e6
      // 1db: ldc2_w -4206088334874647025
      // 1de: lload 5
      // 1e0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: athrow
      // 1e6: lload 5
      // 1e8: lconst_0
      // 1e9: lcmp
      // 1ea: ifle 3c0
      // 1ed: sipush 18657
      // 1f0: ldc2_w 467046891121165359
      // 1f3: lload 5
      // 1f5: lxor
      // 1f6: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1fe: ifne 391
      // 201: goto 20f
      // 204: ldc2_w -4206088334874647025
      // 207: lload 5
      // 209: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: athrow
      // 20f: aload 7
      // 211: aload 16
      // 213: ifnonnull 3ce
      // 216: goto 224
      // 219: ldc2_w -4206088334874647025
      // 21c: lload 5
      // 21e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: lload 5
      // 226: lconst_0
      // 227: lcmp
      // 228: iflt 3c0
      // 22b: sipush 14365
      // 22e: ldc2_w 7305060246707025106
      // 231: lload 5
      // 233: lxor
      // 234: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 23c: ifne 391
      // 23f: goto 24d
      // 242: ldc2_w -4206088334874647025
      // 245: lload 5
      // 247: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: athrow
      // 24d: aload 7
      // 24f: aload 16
      // 251: ifnonnull 3ce
      // 254: goto 262
      // 257: ldc2_w -4206088334874647025
      // 25a: lload 5
      // 25c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: athrow
      // 262: lload 5
      // 264: lconst_0
      // 265: lcmp
      // 266: ifle 3c0
      // 269: sipush 6857
      // 26c: ldc2_w 5755736850961602070
      // 26f: lload 5
      // 271: lxor
      // 272: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 27a: ifne 391
      // 27d: goto 28b
      // 280: ldc2_w -4206088334874647025
      // 283: lload 5
      // 285: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: athrow
      // 28b: aload 7
      // 28d: aload 16
      // 28f: ifnonnull 3ce
      // 292: goto 2a0
      // 295: ldc2_w -4206088334874647025
      // 298: lload 5
      // 29a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: athrow
      // 2a0: lload 5
      // 2a2: lconst_0
      // 2a3: lcmp
      // 2a4: ifle 3c0
      // 2a7: sipush 20768
      // 2aa: ldc2_w 7764460296138153448
      // 2ad: lload 5
      // 2af: lxor
      // 2b0: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b8: ifne 391
      // 2bb: goto 2c9
      // 2be: ldc2_w -4206088334874647025
      // 2c1: lload 5
      // 2c3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: athrow
      // 2c9: aload 7
      // 2cb: aload 16
      // 2cd: ifnonnull 3ce
      // 2d0: goto 2de
      // 2d3: ldc2_w -4206088334874647025
      // 2d6: lload 5
      // 2d8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: athrow
      // 2de: lload 5
      // 2e0: lconst_0
      // 2e1: lcmp
      // 2e2: ifle 3c0
      // 2e5: sipush 28821
      // 2e8: ldc2_w 2917640721937202264
      // 2eb: lload 5
      // 2ed: lxor
      // 2ee: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f6: ifne 391
      // 2f9: goto 307
      // 2fc: ldc2_w -4206088334874647025
      // 2ff: lload 5
      // 301: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 306: athrow
      // 307: aload 7
      // 309: lload 5
      // 30b: lconst_0
      // 30c: lcmp
      // 30d: ifle 3ce
      // 310: aload 16
      // 312: ifnonnull 3ce
      // 315: goto 323
      // 318: ldc2_w -4206088334874647025
      // 31b: lload 5
      // 31d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 322: athrow
      // 323: lload 5
      // 325: lconst_0
      // 326: lcmp
      // 327: iflt 3c0
      // 32a: sipush 12233
      // 32d: ldc2_w 4977142253295182592
      // 330: lload 5
      // 332: lxor
      // 333: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 33b: ifne 391
      // 33e: goto 34c
      // 341: ldc2_w -4206088334874647025
      // 344: lload 5
      // 346: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: athrow
      // 34c: aload 7
      // 34e: sipush 25912
      // 351: ldc2_w 3567653399673203193
      // 354: lload 5
      // 356: lxor
      // 357: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 35f: aload 16
      // 361: lload 5
      // 363: lconst_0
      // 364: lcmp
      // 365: ifle 3fe
      // 368: ifnonnull 3fc
      // 36b: goto 379
      // 36e: ldc2_w -4206088334874647025
      // 371: lload 5
      // 373: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 378: athrow
      // 379: lload 5
      // 37b: lconst_0
      // 37c: lcmp
      // 37d: iflt 3ee
      // 380: ifeq 3db
      // 383: goto 391
      // 386: ldc2_w -4206088334874647025
      // 389: lload 5
      // 38b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 390: athrow
      // 391: aload 0
      // 392: aload 8
      // 394: lload 14
      // 396: aload 4
      // 398: aload 17
      // 39a: bipush 4
      // 39b: anewarray 93
      // 39e: dup_x1
      // 39f: swap
      // 3a0: bipush 3
      // 3a1: swap
      // 3a2: aastore
      // 3a3: dup_x1
      // 3a4: swap
      // 3a5: bipush 2
      // 3a6: swap
      // 3a7: aastore
      // 3a8: dup_x2
      // 3a9: dup_x2
      // 3aa: pop
      // 3ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ae: bipush 1
      // 3af: swap
      // 3b0: aastore
      // 3b1: dup_x1
      // 3b2: swap
      // 3b3: bipush 0
      // 3b4: swap
      // 3b5: aastore
      // 3b6: ldc2_w -2758007548930424736
      // 3b9: lload 5
      // 3bb: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c0: goto 3ce
      // 3c3: ldc2_w -4206088334874647025
      // 3c6: lload 5
      // 3c8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cd: athrow
      // 3ce: lload 5
      // 3d0: lconst_0
      // 3d1: lcmp
      // 3d2: ifle 3dd
      // 3d5: pop
      // 3d6: aload 16
      // 3d8: ifnull 5ed
      // 3db: aload 7
      // 3dd: sipush 31074
      // 3e0: ldc2_w 2505344651602457985
      // 3e3: lload 5
      // 3e5: lxor
      // 3e6: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3eb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3ee: goto 3fc
      // 3f1: ldc2_w -4206088334874647025
      // 3f4: lload 5
      // 3f6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: athrow
      // 3fc: aload 16
      // 3fe: lload 5
      // 400: lconst_0
      // 401: lcmp
      // 402: iflt 43c
      // 405: ifnonnull 43a
      // 408: ifne 5ed
      // 40b: goto 419
      // 40e: ldc2_w -4206088334874647025
      // 411: lload 5
      // 413: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 418: athrow
      // 419: aload 7
      // 41b: sipush 32729
      // 41e: ldc2_w 1996670135462130440
      // 421: lload 5
      // 423: lxor
      // 424: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 429: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 42c: goto 43a
      // 42f: ldc2_w -4206088334874647025
      // 432: lload 5
      // 434: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 439: athrow
      // 43a: aload 16
      // 43c: lload 5
      // 43e: lconst_0
      // 43f: lcmp
      // 440: ifle 47a
      // 443: ifnonnull 478
      // 446: ifne 5ed
      // 449: goto 457
      // 44c: ldc2_w -4206088334874647025
      // 44f: lload 5
      // 451: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: athrow
      // 457: aload 7
      // 459: sipush 13154
      // 45c: ldc2_w 4707396651015290801
      // 45f: lload 5
      // 461: lxor
      // 462: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 467: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 46a: goto 478
      // 46d: ldc2_w -4206088334874647025
      // 470: lload 5
      // 472: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 477: athrow
      // 478: aload 16
      // 47a: lload 5
      // 47c: lconst_0
      // 47d: lcmp
      // 47e: ifle 4b8
      // 481: ifnonnull 4b6
      // 484: ifne 5ed
      // 487: goto 495
      // 48a: ldc2_w -4206088334874647025
      // 48d: lload 5
      // 48f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 494: athrow
      // 495: aload 7
      // 497: sipush 26562
      // 49a: ldc2_w 8860949694362413844
      // 49d: lload 5
      // 49f: lxor
      // 4a0: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a8: goto 4b6
      // 4ab: ldc2_w -4206088334874647025
      // 4ae: lload 5
      // 4b0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b5: athrow
      // 4b6: aload 16
      // 4b8: lload 5
      // 4ba: lconst_0
      // 4bb: lcmp
      // 4bc: ifle 4f6
      // 4bf: ifnonnull 4f4
      // 4c2: ifne 5ed
      // 4c5: goto 4d3
      // 4c8: ldc2_w -4206088334874647025
      // 4cb: lload 5
      // 4cd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d2: athrow
      // 4d3: aload 7
      // 4d5: sipush 21038
      // 4d8: ldc2_w 4220523790724849406
      // 4db: lload 5
      // 4dd: lxor
      // 4de: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4e6: goto 4f4
      // 4e9: ldc2_w -4206088334874647025
      // 4ec: lload 5
      // 4ee: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f3: athrow
      // 4f4: aload 16
      // 4f6: lload 5
      // 4f8: lconst_0
      // 4f9: lcmp
      // 4fa: ifle 534
      // 4fd: ifnonnull 532
      // 500: ifne 5ed
      // 503: goto 511
      // 506: ldc2_w -4206088334874647025
      // 509: lload 5
      // 50b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 510: athrow
      // 511: aload 7
      // 513: sipush 14501
      // 516: ldc2_w 7637381850291549252
      // 519: lload 5
      // 51b: lxor
      // 51c: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 521: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 524: goto 532
      // 527: ldc2_w -4206088334874647025
      // 52a: lload 5
      // 52c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 531: athrow
      // 532: aload 16
      // 534: lload 5
      // 536: lconst_0
      // 537: lcmp
      // 538: iflt 572
      // 53b: ifnonnull 570
      // 53e: ifne 5ed
      // 541: goto 54f
      // 544: ldc2_w -4206088334874647025
      // 547: lload 5
      // 549: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54e: athrow
      // 54f: aload 7
      // 551: sipush 12243
      // 554: ldc2_w 5519844935865803534
      // 557: lload 5
      // 559: lxor
      // 55a: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 562: goto 570
      // 565: ldc2_w -4206088334874647025
      // 568: lload 5
      // 56a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56f: athrow
      // 570: aload 16
      // 572: ifnonnull 5a7
      // 575: ifne 5ed
      // 578: goto 586
      // 57b: ldc2_w -4206088334874647025
      // 57e: lload 5
      // 580: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 585: athrow
      // 586: aload 7
      // 588: sipush 32048
      // 58b: ldc2_w 1783380935911043542
      // 58e: lload 5
      // 590: lxor
      // 591: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 596: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 599: goto 5a7
      // 59c: ldc2_w -4206088334874647025
      // 59f: lload 5
      // 5a1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a6: athrow
      // 5a7: ifeq 5ad
      // 5aa: goto 5ed
      // 5ad: aload 0
      // 5ae: lload 10
      // 5b0: aload 8
      // 5b2: aload 4
      // 5b4: aload 17
      // 5b6: aload 7
      // 5b8: bipush 1
      // 5b9: bipush 6
      // 5bb: anewarray 93
      // 5be: dup_x1
      // 5bf: swap
      // 5c0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5c3: bipush 5
      // 5c4: swap
      // 5c5: aastore
      // 5c6: dup_x1
      // 5c7: swap
      // 5c8: bipush 4
      // 5c9: swap
      // 5ca: aastore
      // 5cb: dup_x1
      // 5cc: swap
      // 5cd: bipush 3
      // 5ce: swap
      // 5cf: aastore
      // 5d0: dup_x1
      // 5d1: swap
      // 5d2: bipush 2
      // 5d3: swap
      // 5d4: aastore
      // 5d5: dup_x1
      // 5d6: swap
      // 5d7: bipush 1
      // 5d8: swap
      // 5d9: aastore
      // 5da: dup_x2
      // 5db: dup_x2
      // 5dc: pop
      // 5dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5e0: bipush 0
      // 5e1: swap
      // 5e2: aastore
      // 5e3: ldc2_w -4577756258776114904
      // 5e6: lload 5
      // 5e8: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ed: return
   }

   public void h(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/List
      // 021: astore 4
      // 023: pop
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 28214190867437
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 57559441548277
      // 030: lxor
      // 031: lstore 9
      // 033: dup2
      // 034: ldc2_w 25652703034264
      // 037: lxor
      // 038: lstore 11
      // 03a: dup2
      // 03b: ldc2_w 65661817971275
      // 03e: lxor
      // 03f: lstore 13
      // 041: pop2
      // 042: ldc2_w -2221690421505669083
      // 045: lload 2
      // 046: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: astore 15
      // 04d: aload 6
      // 04f: aload 15
      // 051: ifnonnull 0c4
      // 054: ifnonnull 0c2
      // 057: goto 064
      // 05a: ldc2_w -26547099614061554
      // 05d: lload 2
      // 05e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: athrow
      // 064: new com/zelix/_s2
      // 067: dup
      // 068: new java/lang/StringBuilder
      // 06b: dup
      // 06c: invokespecial java/lang/StringBuilder.<init> ()V
      // 06f: sipush 24091
      // 072: ldc2_w 1620950326702663901
      // 075: lload 2
      // 076: lxor
      // 077: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: lload 11
      // 081: aload 5
      // 083: bipush 2
      // 084: anewarray 93
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
      // 095: ldc2_w -271983394697701405
      // 098: lload 2
      // 099: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a1: sipush 29265
      // 0a4: ldc2_w 4274622082522498188
      // 0a7: lload 2
      // 0a8: lxor
      // 0a9: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b4: invokespecial com/zelix/_s2.<init> (Ljava/lang/String;)V
      // 0b7: athrow
      // 0b8: ldc2_w -26547099614061554
      // 0bb: lload 2
      // 0bc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 6
      // 0c4: aload 15
      // 0c6: ifnonnull 320
      // 0c9: sipush 21038
      // 0cc: ldc2_w 974131223797490893
      // 0cf: lload 2
      // 0d0: lxor
      // 0d1: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d9: ifne 2f3
      // 0dc: goto 0e9
      // 0df: ldc2_w -26547099614061554
      // 0e2: lload 2
      // 0e3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 6
      // 0eb: aload 15
      // 0ed: ifnonnull 320
      // 0f0: goto 0fd
      // 0f3: ldc2_w -26547099614061554
      // 0f6: lload 2
      // 0f7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: lload 2
      // 0fe: lconst_0
      // 0ff: lcmp
      // 100: iflt 313
      // 103: sipush 15121
      // 106: ldc2_w 8334377874981359093
      // 109: lload 2
      // 10a: lxor
      // 10b: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 113: ifne 2f3
      // 116: goto 123
      // 119: ldc2_w -26547099614061554
      // 11c: lload 2
      // 11d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 6
      // 125: aload 15
      // 127: ifnonnull 320
      // 12a: goto 137
      // 12d: ldc2_w -26547099614061554
      // 130: lload 2
      // 131: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: lload 2
      // 138: lconst_0
      // 139: lcmp
      // 13a: ifle 313
      // 13d: sipush 6836
      // 140: ldc2_w 4407783635584953461
      // 143: lload 2
      // 144: lxor
      // 145: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14d: ifne 2f3
      // 150: goto 15d
      // 153: ldc2_w -26547099614061554
      // 156: lload 2
      // 157: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: aload 6
      // 15f: aload 15
      // 161: ifnonnull 320
      // 164: goto 171
      // 167: ldc2_w -26547099614061554
      // 16a: lload 2
      // 16b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: lload 2
      // 172: lconst_0
      // 173: lcmp
      // 174: iflt 313
      // 177: sipush 13776
      // 17a: ldc2_w 6119633576790491923
      // 17d: lload 2
      // 17e: lxor
      // 17f: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 187: ifne 2f3
      // 18a: goto 197
      // 18d: ldc2_w -26547099614061554
      // 190: lload 2
      // 191: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: aload 6
      // 199: aload 15
      // 19b: ifnonnull 320
      // 19e: goto 1ab
      // 1a1: ldc2_w -26547099614061554
      // 1a4: lload 2
      // 1a5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: lload 2
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: ifle 313
      // 1b1: sipush 29297
      // 1b4: ldc2_w 6884556689871193269
      // 1b7: lload 2
      // 1b8: lxor
      // 1b9: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c1: ifne 2f3
      // 1c4: goto 1d1
      // 1c7: ldc2_w -26547099614061554
      // 1ca: lload 2
      // 1cb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: aload 6
      // 1d3: aload 15
      // 1d5: ifnonnull 320
      // 1d8: goto 1e5
      // 1db: ldc2_w -26547099614061554
      // 1de: lload 2
      // 1df: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: athrow
      // 1e5: lload 2
      // 1e6: lconst_0
      // 1e7: lcmp
      // 1e8: iflt 313
      // 1eb: sipush 16712
      // 1ee: ldc2_w 529919084182468497
      // 1f1: lload 2
      // 1f2: lxor
      // 1f3: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1fb: ifne 2f3
      // 1fe: goto 20b
      // 201: ldc2_w -26547099614061554
      // 204: lload 2
      // 205: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: athrow
      // 20b: aload 6
      // 20d: aload 15
      // 20f: ifnonnull 320
      // 212: goto 21f
      // 215: ldc2_w -26547099614061554
      // 218: lload 2
      // 219: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: athrow
      // 21f: lload 2
      // 220: lconst_0
      // 221: lcmp
      // 222: ifle 313
      // 225: sipush 6810
      // 228: ldc2_w 2805291731500444785
      // 22b: lload 2
      // 22c: lxor
      // 22d: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 235: ifne 2f3
      // 238: goto 245
      // 23b: ldc2_w -26547099614061554
      // 23e: lload 2
      // 23f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: athrow
      // 245: aload 6
      // 247: aload 15
      // 249: ifnonnull 320
      // 24c: goto 259
      // 24f: ldc2_w -26547099614061554
      // 252: lload 2
      // 253: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: lload 2
      // 25a: lconst_0
      // 25b: lcmp
      // 25c: iflt 313
      // 25f: sipush 20977
      // 262: ldc2_w 9001047615966734116
      // 265: lload 2
      // 266: lxor
      // 267: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 26f: ifne 2f3
      // 272: goto 27f
      // 275: ldc2_w -26547099614061554
      // 278: lload 2
      // 279: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: athrow
      // 27f: aload 6
      // 281: aload 15
      // 283: ifnonnull 320
      // 286: goto 293
      // 289: ldc2_w -26547099614061554
      // 28c: lload 2
      // 28d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: athrow
      // 293: lload 2
      // 294: lconst_0
      // 295: lcmp
      // 296: ifle 313
      // 299: sipush 5837
      // 29c: ldc2_w 865803642614259722
      // 29f: lload 2
      // 2a0: lxor
      // 2a1: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a9: ifne 2f3
      // 2ac: goto 2b9
      // 2af: ldc2_w -26547099614061554
      // 2b2: lload 2
      // 2b3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: aload 6
      // 2bb: sipush 26746
      // 2be: ldc2_w 452075476143529646
      // 2c1: lload 2
      // 2c2: lxor
      // 2c3: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2cb: lload 2
      // 2cc: lconst_0
      // 2cd: lcmp
      // 2ce: ifle 368
      // 2d1: aload 15
      // 2d3: ifnonnull 368
      // 2d6: goto 2e3
      // 2d9: ldc2_w -26547099614061554
      // 2dc: lload 2
      // 2dd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: athrow
      // 2e3: ifeq 337
      // 2e6: goto 2f3
      // 2e9: ldc2_w -26547099614061554
      // 2ec: lload 2
      // 2ed: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: athrow
      // 2f3: aload 0
      // 2f4: aload 5
      // 2f6: lload 7
      // 2f8: bipush 2
      // 2f9: anewarray 93
      // 2fc: dup_x2
      // 2fd: dup_x2
      // 2fe: pop
      // 2ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 302: bipush 1
      // 303: swap
      // 304: aastore
      // 305: dup_x1
      // 306: swap
      // 307: bipush 0
      // 308: swap
      // 309: aastore
      // 30a: ldc2_w -2174110372422670118
      // 30d: lload 2
      // 30e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 313: goto 320
      // 316: ldc2_w -26547099614061554
      // 319: lload 2
      // 31a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: athrow
      // 320: astore 16
      // 322: aload 4
      // 324: aload 16
      // 326: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 32b: pop
      // 32c: lload 2
      // 32d: lconst_0
      // 32e: lcmp
      // 32f: iflt 337
      // 332: aload 15
      // 334: ifnull 593
      // 337: aload 6
      // 339: aload 15
      // 33b: ifnonnull 537
      // 33e: goto 34b
      // 341: ldc2_w -26547099614061554
      // 344: lload 2
      // 345: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34a: athrow
      // 34b: sipush 7606
      // 34e: ldc2_w 7062925750079269737
      // 351: lload 2
      // 352: lxor
      // 353: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 358: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 35b: goto 368
      // 35e: ldc2_w -26547099614061554
      // 361: lload 2
      // 362: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: athrow
      // 368: ifne 501
      // 36b: aload 6
      // 36d: aload 15
      // 36f: ifnonnull 537
      // 372: goto 37f
      // 375: ldc2_w -26547099614061554
      // 378: lload 2
      // 379: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37e: athrow
      // 37f: lload 2
      // 380: lconst_0
      // 381: lcmp
      // 382: ifle 52a
      // 385: sipush 3343
      // 388: ldc2_w 1980159682651175895
      // 38b: lload 2
      // 38c: lxor
      // 38d: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 395: ifne 501
      // 398: goto 3a5
      // 39b: ldc2_w -26547099614061554
      // 39e: lload 2
      // 39f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a4: athrow
      // 3a5: aload 6
      // 3a7: aload 15
      // 3a9: ifnonnull 537
      // 3ac: goto 3b9
      // 3af: ldc2_w -26547099614061554
      // 3b2: lload 2
      // 3b3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b8: athrow
      // 3b9: lload 2
      // 3ba: lconst_0
      // 3bb: lcmp
      // 3bc: iflt 52a
      // 3bf: sipush 14620
      // 3c2: ldc2_w 4282881620812402639
      // 3c5: lload 2
      // 3c6: lxor
      // 3c7: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3cf: ifne 501
      // 3d2: goto 3df
      // 3d5: ldc2_w -26547099614061554
      // 3d8: lload 2
      // 3d9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3de: athrow
      // 3df: aload 6
      // 3e1: aload 15
      // 3e3: ifnonnull 537
      // 3e6: goto 3f3
      // 3e9: ldc2_w -26547099614061554
      // 3ec: lload 2
      // 3ed: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f2: athrow
      // 3f3: lload 2
      // 3f4: lconst_0
      // 3f5: lcmp
      // 3f6: ifle 52a
      // 3f9: sipush 29037
      // 3fc: ldc2_w 6752536594048173963
      // 3ff: lload 2
      // 400: lxor
      // 401: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 409: ifne 501
      // 40c: goto 419
      // 40f: ldc2_w -26547099614061554
      // 412: lload 2
      // 413: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 418: athrow
      // 419: aload 6
      // 41b: aload 15
      // 41d: ifnonnull 537
      // 420: goto 42d
      // 423: ldc2_w -26547099614061554
      // 426: lload 2
      // 427: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42c: athrow
      // 42d: lload 2
      // 42e: lconst_0
      // 42f: lcmp
      // 430: ifle 52a
      // 433: sipush 24974
      // 436: ldc2_w 4203874767478052683
      // 439: lload 2
      // 43a: lxor
      // 43b: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 440: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 443: ifne 501
      // 446: goto 453
      // 449: ldc2_w -26547099614061554
      // 44c: lload 2
      // 44d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 452: athrow
      // 453: aload 6
      // 455: aload 15
      // 457: ifnonnull 537
      // 45a: goto 467
      // 45d: ldc2_w -26547099614061554
      // 460: lload 2
      // 461: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 466: athrow
      // 467: lload 2
      // 468: lconst_0
      // 469: lcmp
      // 46a: ifle 52a
      // 46d: sipush 13705
      // 470: ldc2_w 4341753790582915937
      // 473: lload 2
      // 474: lxor
      // 475: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 47d: ifne 501
      // 480: goto 48d
      // 483: ldc2_w -26547099614061554
      // 486: lload 2
      // 487: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48c: athrow
      // 48d: aload 6
      // 48f: aload 15
      // 491: ifnonnull 537
      // 494: goto 4a1
      // 497: ldc2_w -26547099614061554
      // 49a: lload 2
      // 49b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a0: athrow
      // 4a1: lload 2
      // 4a2: lconst_0
      // 4a3: lcmp
      // 4a4: iflt 52a
      // 4a7: sipush 5478
      // 4aa: ldc2_w 6032004958409237424
      // 4ad: lload 2
      // 4ae: lxor
      // 4af: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4b7: ifne 501
      // 4ba: goto 4c7
      // 4bd: ldc2_w -26547099614061554
      // 4c0: lload 2
      // 4c1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c6: athrow
      // 4c7: aload 6
      // 4c9: sipush 17446
      // 4cc: ldc2_w 5826420115336721149
      // 4cf: lload 2
      // 4d0: lxor
      // 4d1: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/_ka.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4d9: aload 15
      // 4db: ifnonnull 592
      // 4de: goto 4eb
      // 4e1: ldc2_w -26547099614061554
      // 4e4: lload 2
      // 4e5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ea: athrow
      // 4eb: lload 2
      // 4ec: lconst_0
      // 4ed: lcmp
      // 4ee: ifle 585
      // 4f1: ifeq 54e
      // 4f4: goto 501
      // 4f7: ldc2_w -26547099614061554
      // 4fa: lload 2
      // 4fb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 500: athrow
      // 501: aload 0
      // 502: ldc2_w -2036171252237950768
      // 505: lload 2
      // 506: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/vm; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50b: lload 13
      // 50d: aload 5
      // 50f: bipush 2
      // 510: anewarray 93
      // 513: dup_x1
      // 514: swap
      // 515: bipush 1
      // 516: swap
      // 517: aastore
      // 518: dup_x2
      // 519: dup_x2
      // 51a: pop
      // 51b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51e: bipush 0
      // 51f: swap
      // 520: aastore
      // 521: ldc2_w -387868847156738550
      // 524: lload 2
      // 525: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52a: goto 537
      // 52d: ldc2_w -26547099614061554
      // 530: lload 2
      // 531: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 536: athrow
      // 537: astore 16
      // 539: aload 4
      // 53b: aload 16
      // 53d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 542: lload 2
      // 543: lconst_0
      // 544: lcmp
      // 545: iflt 585
      // 548: pop
      // 549: aload 15
      // 54b: ifnull 593
      // 54e: aload 4
      // 550: aload 0
      // 551: aload 5
      // 553: lload 9
      // 555: aload 6
      // 557: bipush 1
      // 558: bipush 4
      // 559: anewarray 93
      // 55c: dup_x1
      // 55d: swap
      // 55e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 561: bipush 3
      // 562: swap
      // 563: aastore
      // 564: dup_x1
      // 565: swap
      // 566: bipush 2
      // 567: swap
      // 568: aastore
      // 569: dup_x2
      // 56a: dup_x2
      // 56b: pop
      // 56c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 56f: bipush 1
      // 570: swap
      // 571: aastore
      // 572: dup_x1
      // 573: swap
      // 574: bipush 0
      // 575: swap
      // 576: aastore
      // 577: ldc2_w -2282403210752475578
      // 57a: lload 2
      // 57b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 580: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 585: goto 592
      // 588: ldc2_w -26547099614061554
      // 58b: lload 2
      // 58c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 591: athrow
      // 592: pop
      // 593: return
   }

   public _ka(char var1, String var2, char var3, _yv var4, int var5, _ug var6, _zk var7) {
      long var8 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ a;
      long var10 = var8 ^ 78321206611286L;
      super(var10, var2, var4, var6, var7);
   }

   public _ka(String var1, _8s var2, long var3, q2 var5, q2 var6, vm var7, _yv var8, _ug var9, _zk var10) {
      var3 = a ^ var3;
      long var11 = var3 ^ 51021469823180L;
      super(var1, var2, var5, var11, var6, var7, var8, var9, var10);
   }

   static {
      long var0 = a ^ 81203561474920L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[43];
      int var7 = 0;
      String var6 = "\u007fµ6_#\u0091T-ùCYu5J\u0086ZS¯yµ2;¹\u0014(^2|¯E*¯îLè\u0091(Ôù\u0093½=Ç\u000eÍ\u009d>\u0001àJlÊ)}\u0016ÈèyÍ\u009aBz]øß\u0010\u0083[û\u000bº¾xø8%\u00adAD\\è²\u0010£³X¡\u0015ùGþÔê\u0012´¬µ\u001fñ í°;â1v§¨\u0084\u0085\u001bÅp»ð|\u0000§oQ\u00adZ1\u0005áÍHc\u0007û5}\u00106ûÃfü\u0013Jh\u0086\u009f_µ\u000bXÃ\u0099 1e\u0007\u0000\u009d\u000e\\(\u009fÏ\u0097\u007f\u009bKY×\u0000 §\u0098\u009d\u0017@WÕ/GCFÞûd@ñÉ\u009dÏ\u0011§V\u001d'Cÿ®ÂP \u007fE\u0000Ô\u0000ª+ÍSH¦G«ä\u0010 Õ¿?&Þm\u008b\u0080wòßA+ñ¦\u008d[ÛJu\u0091<3\u0004ã{µÄ^Ô3\u009eþ M]Må\u0083Ü\u008b]ÚÆàºåÓ;;0o\u001c¥f\u0010\u008dß5õâPâl,; 'îQÑ\u0000\u0095T\u0081¹\u0090µ9»$\u000eÑ_Å\u0095[EO\u0089\u0006ÌÛn\u009a¾\u0002$\n\u0010\u0016\u008f\u0005`ÓÜÖ;0%\u009a\u0016¹â\u008a\u0010 \u0098®\u009d\u0083/÷ë\u001eÇ\u000bvù¸+\u0084va\u0085\u008alùùwp\u0090\u009cx~('KÀ ÒÝ¿\\\u0010\u0090\ryN´ÙÂj\u009a\u0012¥ù1\u0015Q-oÇ@ÈÕV~CÏw¹ àìRÔê\t\u001fkï\u001cè|b\t\u0016¥?)ïvSÖð¤»\u009d\u0096BbÃ\u0000|\u0010\u0018ÀÌüæâ\u0005(±l\u00902±ëÌÿ\u0010*ÿ\u0096¡\u0092\u009cî+¼\u009dC\u0010Ðì0´ \rN\u0081\u0001|¼ÓßvõX\u001b\u0005.ÌJ¥PH¾cA^´HQI¯¤\u000f\u0087þ\u0018u§K\u0011DèÒßÄ6Ãº\u0014Ù\r\u0093C\u0091\u009c\u0082Ø´ë) \u0003ôq@ö\u008bg©!L5\u0098Rñìü\u0081\u0001\u001e\u0007\u001cÐf=@\u0002Gªÿ³\u001dZ fñ°KÝ\u007f\u0093²Ô\u0000>\u0082\u009a\u0015N\u0094)Eø»\u0010\u008e \u001c\u0097\u009fÿt vI\u008f\u0018ÅY\u001fqã\u008d>ÌËòg·»Åp\u007fÖ\u001az\u0091[äëÌ(ìDÓrOÑ\u0006Ó\u0081[Þ\u0099(\u0006k¾\b\u0001¥ý\u0011Y §B\u008d_ÃoÐ\u0001üÚ½f*\t®&b\u0018\u001e\u008f0øìai\u008fzí\u009f-ÝiÑ¾\u0083\u0085e·\u0085?\u007fè §\u000f\u0013\\·\u00835\u0011ÝîJj\u0084\u0095W\u008eÝÂ5R\"\u008a\u0094\u0018\t?g\u0087\u00ad÷\u0083\u0004\u0010ë\u0004_\u0097,UËÓã÷è.Üð\u0082×\u0018\u0087ò8Â}°\u000bö3yÈbÚ\"\u0010¥+_lô¼ýÑÏ ÛÅÞ\u0000¡²ÐÎi =:X;\u0013~@ÙÀN\t\u0084\u001dY.\u000e6kã°7Ì \u008d\u000ewî\u009eDòYD\u0099EW\u001d·«+É¹\u0096L£Á<\u0082½\u0015p@`\u008ep-\u0010±nÛ\u0096ý'\u0096nJÁ¯ïÄdV(\u0018þú:5&ã}Z\u0083ÐìyftÅ\u009bGÕù4²^qð ú¸©I\u007f\u009d\u0087K}{.ûJD_n³\u000bíuó÷;Iªì§÷\u000b3\u00ad\r\u0010Ô\u0097áEuèÞ½æ,fÊm2(T@\u001d\u0001©ðGæ\u0002\n^\u009aL»1\u0097(\u0007\u0082A\u009d\u0093_Hhí\u009b\u001b_\u0094\u0012\u0010µÄ²0\u0016¢\n5Û-l\u0093Wºj-\u0006,íR:Ô&é·\u0019¤î\u008f°\u0086ï\u00adÛ\u0018f{åV±\u009a(\n\u0014$\u001aî\u0007ÝÌf¨\u0091X¡BDD$ ¶ñI8 ÁÇ®\u0011iôö\u009e\u008aIß´\u0012âk\u0005\u007fîh\u0007\u000e\u001aät¬SÎ FOÑ\u0088þ«3\u000fTé«\u001eÿþªZ\u009bÆr§½àg\u0007\u0091\u0013©c×\u0002!ò î\u0095\u009eû|a\u0088\u0002Æ4C\u0093[VÏdlSû\u0001[=\u008bl¼/\u0005éÇ\u007f^½\u0018¾{ä©Ò'f1\njÈ)\u0080H\u0018\u0089Ø )í÷\fF\u0087 U×í\n\u009e\u0004YI\u008b\u008f\u0090Ì2I§Yb\u0007ô¹®NPS®\u0088\u0015\u000b_|\\¦\u0018¹ác5¡\u00948¸\u007f@çËt5«~z\u008fô\u0091à\u0096ÿÄ\u0010\u001bB!\nRAG\bTò \u0080\u0091øÄ\u0012";
      int var8 = "\u007fµ6_#\u0091T-ùCYu5J\u0086ZS¯yµ2;¹\u0014(^2|¯E*¯îLè\u0091(Ôù\u0093½=Ç\u000eÍ\u009d>\u0001àJlÊ)}\u0016ÈèyÍ\u009aBz]øß\u0010\u0083[û\u000bº¾xø8%\u00adAD\\è²\u0010£³X¡\u0015ùGþÔê\u0012´¬µ\u001fñ í°;â1v§¨\u0084\u0085\u001bÅp»ð|\u0000§oQ\u00adZ1\u0005áÍHc\u0007û5}\u00106ûÃfü\u0013Jh\u0086\u009f_µ\u000bXÃ\u0099 1e\u0007\u0000\u009d\u000e\\(\u009fÏ\u0097\u007f\u009bKY×\u0000 §\u0098\u009d\u0017@WÕ/GCFÞûd@ñÉ\u009dÏ\u0011§V\u001d'Cÿ®ÂP \u007fE\u0000Ô\u0000ª+ÍSH¦G«ä\u0010 Õ¿?&Þm\u008b\u0080wòßA+ñ¦\u008d[ÛJu\u0091<3\u0004ã{µÄ^Ô3\u009eþ M]Må\u0083Ü\u008b]ÚÆàºåÓ;;0o\u001c¥f\u0010\u008dß5õâPâl,; 'îQÑ\u0000\u0095T\u0081¹\u0090µ9»$\u000eÑ_Å\u0095[EO\u0089\u0006ÌÛn\u009a¾\u0002$\n\u0010\u0016\u008f\u0005`ÓÜÖ;0%\u009a\u0016¹â\u008a\u0010 \u0098®\u009d\u0083/÷ë\u001eÇ\u000bvù¸+\u0084va\u0085\u008alùùwp\u0090\u009cx~('KÀ ÒÝ¿\\\u0010\u0090\ryN´ÙÂj\u009a\u0012¥ù1\u0015Q-oÇ@ÈÕV~CÏw¹ àìRÔê\t\u001fkï\u001cè|b\t\u0016¥?)ïvSÖð¤»\u009d\u0096BbÃ\u0000|\u0010\u0018ÀÌüæâ\u0005(±l\u00902±ëÌÿ\u0010*ÿ\u0096¡\u0092\u009cî+¼\u009dC\u0010Ðì0´ \rN\u0081\u0001|¼ÓßvõX\u001b\u0005.ÌJ¥PH¾cA^´HQI¯¤\u000f\u0087þ\u0018u§K\u0011DèÒßÄ6Ãº\u0014Ù\r\u0093C\u0091\u009c\u0082Ø´ë) \u0003ôq@ö\u008bg©!L5\u0098Rñìü\u0081\u0001\u001e\u0007\u001cÐf=@\u0002Gªÿ³\u001dZ fñ°KÝ\u007f\u0093²Ô\u0000>\u0082\u009a\u0015N\u0094)Eø»\u0010\u008e \u001c\u0097\u009fÿt vI\u008f\u0018ÅY\u001fqã\u008d>ÌËòg·»Åp\u007fÖ\u001az\u0091[äëÌ(ìDÓrOÑ\u0006Ó\u0081[Þ\u0099(\u0006k¾\b\u0001¥ý\u0011Y §B\u008d_ÃoÐ\u0001üÚ½f*\t®&b\u0018\u001e\u008f0øìai\u008fzí\u009f-ÝiÑ¾\u0083\u0085e·\u0085?\u007fè §\u000f\u0013\\·\u00835\u0011ÝîJj\u0084\u0095W\u008eÝÂ5R\"\u008a\u0094\u0018\t?g\u0087\u00ad÷\u0083\u0004\u0010ë\u0004_\u0097,UËÓã÷è.Üð\u0082×\u0018\u0087ò8Â}°\u000bö3yÈbÚ\"\u0010¥+_lô¼ýÑÏ ÛÅÞ\u0000¡²ÐÎi =:X;\u0013~@ÙÀN\t\u0084\u001dY.\u000e6kã°7Ì \u008d\u000ewî\u009eDòYD\u0099EW\u001d·«+É¹\u0096L£Á<\u0082½\u0015p@`\u008ep-\u0010±nÛ\u0096ý'\u0096nJÁ¯ïÄdV(\u0018þú:5&ã}Z\u0083ÐìyftÅ\u009bGÕù4²^qð ú¸©I\u007f\u009d\u0087K}{.ûJD_n³\u000bíuó÷;Iªì§÷\u000b3\u00ad\r\u0010Ô\u0097áEuèÞ½æ,fÊm2(T@\u001d\u0001©ðGæ\u0002\n^\u009aL»1\u0097(\u0007\u0082A\u009d\u0093_Hhí\u009b\u001b_\u0094\u0012\u0010µÄ²0\u0016¢\n5Û-l\u0093Wºj-\u0006,íR:Ô&é·\u0019¤î\u008f°\u0086ï\u00adÛ\u0018f{åV±\u009a(\n\u0014$\u001aî\u0007ÝÌf¨\u0091X¡BDD$ ¶ñI8 ÁÇ®\u0011iôö\u009e\u008aIß´\u0012âk\u0005\u007fîh\u0007\u000e\u001aät¬SÎ FOÑ\u0088þ«3\u000fTé«\u001eÿþªZ\u009bÆr§½àg\u0007\u0091\u0013©c×\u0002!ò î\u0095\u009eû|a\u0088\u0002Æ4C\u0093[VÏdlSû\u0001[=\u008bl¼/\u0005éÇ\u007f^½\u0018¾{ä©Ò'f1\njÈ)\u0080H\u0018\u0089Ø )í÷\fF\u0087 U×í\n\u009e\u0004YI\u008b\u008f\u0090Ì2I§Yb\u0007ô¹®NPS®\u0088\u0015\u000b_|\\¦\u0018¹ác5¡\u00948¸\u007f@çËt5«~z\u008fô\u0091à\u0096ÿÄ\u0010\u001bB!\nRAG\bTò \u0080\u0091øÄ\u0012"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     d = new String[43];
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

                  var6 = "Ô8'ú/^ÁPÙ\u001a\u0018s\u0087\u0011|\u000eQ=ÖB©¨\u007f£ ÛÑ$\u00952^Ïé\u0094e$\u0084vÃÜ2á\u001b¹ï?\u0014£\u0005ÇOc\u0091ý\u001b\u009bP";
                  var8 = "Ô8'ú/^ÁPÙ\u001a\u0018s\u0087\u0011|\u000eQ=ÖB©¨\u007f£ ÛÑ$\u00952^Ïé\u0094e$\u0084vÃÜ2á\u001b¹ï?\u0014£\u0005ÇOc\u0091ý\u001b\u009bP"
                     .length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23287;
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
            throw new RuntimeException("com/zelix/_ka", var10);
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
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
         throw new RuntimeException("com/zelix/_ka" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
