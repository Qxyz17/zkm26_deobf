package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _8o extends _8k {
   final _uo f;
   final qx S;
   final xn T;
   final boolean d;
   final pd O;
   final _ug L;
   hy[] B;
   final pk e;
   private static final long a = ess.a(7248462253449266689L, -1374354172547820991L, MethodHandles.lookup().lookupClass()).a(84667716603168L);
   private static final String[] j;
   private static final String[] k;
   private static final Map l = new HashMap(13);

   final a9 U(Object[] param1) {
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
      // 004: checkcast [Lcom/zelix/bx;
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_zk
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_ur
      // 016: astore 5
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Boolean
      // 01e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 021: istore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Long
      // 029: invokevirtual java/lang/Long.longValue ()J
      // 02c: lstore 3
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast java/lang/Boolean
      // 033: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 036: istore 8
      // 038: pop
      // 039: getstatic com/zelix/_8o.a J
      // 03c: lload 3
      // 03d: lxor
      // 03e: lstore 3
      // 03f: lload 3
      // 040: dup2
      // 041: ldc2_w 62452664200697
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 29069951459897
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 4464562193233
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 7652676868205
      // 059: lxor
      // 05a: lstore 15
      // 05c: dup2
      // 05d: ldc2_w 94719564302765
      // 060: lxor
      // 061: lstore 17
      // 063: dup2
      // 064: ldc2_w 23036972241883
      // 067: lxor
      // 068: lstore 19
      // 06a: pop2
      // 06b: aconst_null
      // 06c: astore 22
      // 06e: ldc2_w 4678519978205699317
      // 071: lload 3
      // 072: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 5
      // 079: lload 13
      // 07b: bipush 1
      // 07c: anewarray 271
      // 07f: dup_x2
      // 080: dup_x2
      // 081: pop
      // 082: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w 6675224240190553413
      // 08b: lload 3
      // 08c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: istore 23
      // 093: astore 21
      // 095: bipush 0
      // 096: istore 24
      // 098: bipush 0
      // 099: istore 25
      // 09b: iload 25
      // 09d: aload 7
      // 09f: arraylength
      // 0a0: if_icmpge 318
      // 0a3: iload 23
      // 0a5: aload 21
      // 0a7: lload 3
      // 0a8: lconst_0
      // 0a9: lcmp
      // 0aa: ifle 0b2
      // 0ad: ifnonnull 320
      // 0b0: aload 21
      // 0b2: ifnonnull 320
      // 0b5: goto 0c2
      // 0b8: ldc2_w 6674250977153371604
      // 0bb: lload 3
      // 0bc: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 5
      // 0c4: lload 13
      // 0c6: bipush 1
      // 0c7: anewarray 271
      // 0ca: dup_x2
      // 0cb: dup_x2
      // 0cc: pop
      // 0cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d0: bipush 0
      // 0d1: swap
      // 0d2: aastore
      // 0d3: ldc2_w 6675224240190553413
      // 0d6: lload 3
      // 0d7: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: if_icmpne 318
      // 0df: goto 0ec
      // 0e2: ldc2_w 6674250977153371604
      // 0e5: lload 3
      // 0e6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 7
      // 0ee: iload 25
      // 0f0: aaload
      // 0f1: astore 26
      // 0f3: aload 26
      // 0f5: ldc2_w 4834552898923105015
      // 0f8: lload 3
      // 0f9: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: astore 27
      // 100: new java/io/File
      // 103: dup
      // 104: aload 27
      // 106: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 109: astore 28
      // 10b: aload 28
      // 10d: lload 11
      // 10f: bipush 2
      // 110: anewarray 271
      // 113: dup_x2
      // 114: dup_x2
      // 115: pop
      // 116: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 119: bipush 1
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x1
      // 11d: swap
      // 11e: bipush 0
      // 11f: swap
      // 120: aastore
      // 121: ldc2_w 5138721157376066299
      // 124: lload 3
      // 125: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: istore 29
      // 12c: lload 3
      // 12d: lconst_0
      // 12e: lcmp
      // 12f: iflt 139
      // 132: iload 29
      // 134: iload 8
      // 136: if_icmpeq 25b
      // 139: new java/lang/StringBuilder
      // 13c: dup
      // 13d: invokespecial java/lang/StringBuilder.<init> ()V
      // 140: sipush 24003
      // 143: ldc2_w 2780035266159858353
      // 146: lload 3
      // 147: lxor
      // 148: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: aload 21
      // 14f: ifnonnull 194
      // 152: goto 15f
      // 155: ldc2_w 6674250977153371604
      // 158: lload 3
      // 159: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 162: iload 8
      // 164: lload 3
      // 165: lconst_0
      // 166: lcmp
      // 167: iflt 19a
      // 16a: ifeq 197
      // 16d: goto 17a
      // 170: ldc2_w 6674250977153371604
      // 173: lload 3
      // 174: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: sipush 15986
      // 17d: ldc2_w 8312965760937111829
      // 180: lload 3
      // 181: lxor
      // 182: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: goto 194
      // 18a: ldc2_w 6674250977153371604
      // 18d: lload 3
      // 18e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: goto 1a4
      // 197: sipush 17617
      // 19a: ldc2_w 8973109106050943918
      // 19d: lload 3
      // 19e: lxor
      // 19f: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: sipush 12630
      // 1aa: ldc2_w 701615469580959275
      // 1ad: lload 3
      // 1ae: lxor
      // 1af: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b7: aload 28
      // 1b9: ldc2_w 4969740059399163131
      // 1bc: lload 3
      // 1bd: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c5: sipush 18867
      // 1c8: lload 3
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: iflt 1e2
      // 1ce: ldc2_w 5137273415274809047
      // 1d1: lload 3
      // 1d2: lxor
      // 1d3: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: aload 21
      // 1da: ifnonnull 212
      // 1dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e0: iload 29
      // 1e2: lload 3
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: ifle 218
      // 1e8: ifeq 215
      // 1eb: goto 1f8
      // 1ee: ldc2_w 6674250977153371604
      // 1f1: lload 3
      // 1f2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: sipush 19004
      // 1fb: ldc2_w 3645955244621645138
      // 1fe: lload 3
      // 1ff: lxor
      // 200: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: goto 212
      // 208: ldc2_w 6674250977153371604
      // 20b: lload 3
      // 20c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: athrow
      // 212: goto 222
      // 215: sipush 19000
      // 218: ldc2_w 6244290126218446146
      // 21b: lload 3
      // 21c: lxor
      // 21d: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 225: sipush 6101
      // 228: ldc2_w 8484558694562699447
      // 22b: lload 3
      // 22c: lxor
      // 22d: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 235: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 238: astore 30
      // 23a: aload 5
      // 23c: aload 30
      // 23e: lload 9
      // 240: bipush 2
      // 241: anewarray 271
      // 244: dup_x2
      // 245: dup_x2
      // 246: pop
      // 247: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24a: bipush 1
      // 24b: swap
      // 24c: aastore
      // 24d: dup_x1
      // 24e: swap
      // 24f: bipush 0
      // 250: swap
      // 251: aastore
      // 252: ldc2_w 4954038144283310828
      // 255: lload 3
      // 256: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: aload 0
      // 25c: aload 27
      // 25e: aload 26
      // 260: ldc2_w 5051293886483206804
      // 263: lload 3
      // 264: invokedynamic i (Ljava/lang/Object;JJ)Ljava/io/Reader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: aload 2
      // 26a: aload 5
      // 26c: iload 6
      // 26e: lload 17
      // 270: bipush 6
      // 272: anewarray 271
      // 275: dup_x2
      // 276: dup_x2
      // 277: pop
      // 278: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27b: bipush 5
      // 27c: swap
      // 27d: aastore
      // 27e: dup_x1
      // 27f: swap
      // 280: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 283: bipush 4
      // 284: swap
      // 285: aastore
      // 286: dup_x1
      // 287: swap
      // 288: bipush 3
      // 289: swap
      // 28a: aastore
      // 28b: dup_x1
      // 28c: swap
      // 28d: bipush 2
      // 28e: swap
      // 28f: aastore
      // 290: dup_x1
      // 291: swap
      // 292: bipush 1
      // 293: swap
      // 294: aastore
      // 295: dup_x1
      // 296: swap
      // 297: bipush 0
      // 298: swap
      // 299: aastore
      // 29a: ldc2_w 4967656497280825459
      // 29d: lload 3
      // 29e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: astore 30
      // 2a5: lload 3
      // 2a6: lconst_0
      // 2a7: lcmp
      // 2a8: iflt 30d
      // 2ab: aload 22
      // 2ad: aload 21
      // 2af: ifnonnull 30c
      // 2b2: ifnonnull 2d1
      // 2b5: goto 2c2
      // 2b8: ldc2_w 6674250977153371604
      // 2bb: lload 3
      // 2bc: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: aload 30
      // 2c4: astore 22
      // 2c6: aload 21
      // 2c8: lload 3
      // 2c9: lconst_0
      // 2ca: lcmp
      // 2cb: iflt 315
      // 2ce: ifnull 310
      // 2d1: aload 22
      // 2d3: aload 30
      // 2d5: lload 15
      // 2d7: aload 2
      // 2d8: aload 5
      // 2da: bipush 4
      // 2db: anewarray 271
      // 2de: dup_x1
      // 2df: swap
      // 2e0: bipush 3
      // 2e1: swap
      // 2e2: aastore
      // 2e3: dup_x1
      // 2e4: swap
      // 2e5: bipush 2
      // 2e6: swap
      // 2e7: aastore
      // 2e8: dup_x2
      // 2e9: dup_x2
      // 2ea: pop
      // 2eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ee: bipush 1
      // 2ef: swap
      // 2f0: aastore
      // 2f1: dup_x1
      // 2f2: swap
      // 2f3: bipush 0
      // 2f4: swap
      // 2f5: aastore
      // 2f6: ldc2_w 4893527804904784983
      // 2f9: lload 3
      // 2fa: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/a9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: goto 30c
      // 302: ldc2_w 6674250977153371604
      // 305: lload 3
      // 306: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: athrow
      // 30c: pop
      // 30d: bipush 1
      // 30e: istore 24
      // 310: iinc 25 1
      // 313: aload 21
      // 315: ifnull 09b
      // 318: lload 3
      // 319: lconst_0
      // 31a: lcmp
      // 31b: iflt 34a
      // 31e: iload 24
      // 320: ifeq 34a
      // 323: aload 22
      // 325: lload 19
      // 327: bipush 1
      // 328: anewarray 271
      // 32b: dup_x2
      // 32c: dup_x2
      // 32d: pop
      // 32e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 331: bipush 0
      // 332: swap
      // 333: aastore
      // 334: ldc2_w 6568807139616174689
      // 337: lload 3
      // 338: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: goto 34a
      // 340: ldc2_w 6674250977153371604
      // 343: lload 3
      // 344: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 349: athrow
      // 34a: aload 22
      // 34c: areturn
   }

   static _y4 x(Object[] var0) {
      HashMap var1 = (HashMap)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 24750844232207L;
      long var6 = var2 ^ 75176065734025L;
      hk[] var10000 = x44.a<"s">(-3438721091077649313L, var2);
      _y4 var9 = new _y4(var6);
      hk[] var8 = var10000;

      for (Entry var11 : x44.a<"k">(var1, -3751930481074472275L, var2)) {
         do {
            try {
               Object var10001 = var8;
               if (var2 >= 0L) {
                  if (var8 != null) {
                     return var9;
                  }

                  var10001 = var11.getValue();
               }

               var9.G(var10001, var11.getKey(), var4);
               if (var8 == null) {
                  break;
               }
            } catch (gj var12) {
               throw x44.a<"s">(var12, -3731804431651480194L, var2);
            }
         } while (var2 <= 0L);
         break;
      }

      return var9;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   boolean s(Object[] var1) {
      HashMap var4 = (HashMap)var1[0];
      HashMap var7 = (HashMap)var1[1];
      HashMap var5 = (HashMap)var1[2];
      a9 var6 = (a9)var1[3];
      long var2 = (Long)var1[4];
      var2 = a ^ var2;
      long var8 = var2 ^ 4173415899392L;
      long var10 = var2 ^ 15201918575082L;
      hk[] var10000 = x44.a<"u">(8843158054513206945L, var2);
      int var13 = 0;
      hk[] var12 = var10000;

      label43:
      while (var13 < x44.a<"i">(this, 7056989503590583548L, var2).length) {
         String var14 = x44.a<"i">(this, 7056989503590583548L, var2)[var13].k(var8);

         try {
            var4.put(var14, var14);
            var7.put(var14, var14);
            var13++;
         } catch (gj var16) {
            boolean var10001 = false;
            throw x44.a<"u">(var16, 7407286291448461184L, var2);
         }

         do {
            try {
               var10000 = var12;
               if (var2 >= 0L) {
                  if (var12 != null) {
                     return (boolean)var13;
                  }

                  var10000 = var12;
               }

               if (var10000 == null) {
                  continue label43;
               }
            } catch (gj var15) {
               boolean var20 = false;
               throw x44.a<"u">(var15, 7407286291448461184L, var2);
            }
         } while (var2 <= 0L);

         return x44.a<"u">(new Object[]{var10, var4, var7, var5, x44.a<"i">(this, 9208408413854370202L, var2), var6}, 9021019967991235220L, var2);
      }

      return x44.a<"u">(new Object[]{var10, var4, var7, var5, x44.a<"i">(this, 9208408413854370202L, var2), var6}, 9021019967991235220L, var2);
   }

   void I(Object[] param1) {
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
      // 00a: istore 6
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/util/HashMap
      // 012: astore 7
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/_ua
      // 01a: astore 5
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast java/lang/Long
      // 022: invokevirtual java/lang/Long.longValue ()J
      // 025: lstore 3
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/_ur
      // 02c: astore 2
      // 02d: pop
      // 02e: getstatic com/zelix/_8o.a J
      // 031: lload 3
      // 032: lxor
      // 033: lstore 3
      // 034: lload 3
      // 035: dup2
      // 036: ldc2_w 72129779945019
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 100837850773689
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 50286328808099
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 44300288763268
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 126490191311525
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 67612427548390
      // 05c: lxor
      // 05d: lstore 18
      // 05f: dup2
      // 060: ldc2_w 14090684648287
      // 063: lxor
      // 064: lstore 20
      // 066: dup2
      // 067: ldc2_w 35065690583248
      // 06a: lxor
      // 06b: lstore 22
      // 06d: dup2
      // 06e: ldc2_w 54690993964714
      // 071: lxor
      // 072: dup2
      // 073: bipush 48
      // 075: lushr
      // 076: l2i
      // 077: istore 24
      // 079: dup2
      // 07a: bipush 16
      // 07c: lshl
      // 07d: bipush 32
      // 07f: lushr
      // 080: l2i
      // 081: istore 25
      // 083: dup2
      // 084: bipush 48
      // 086: lshl
      // 087: bipush 48
      // 089: lushr
      // 08a: l2i
      // 08b: istore 26
      // 08d: pop2
      // 08e: dup2
      // 08f: ldc2_w 151601836838
      // 092: lxor
      // 093: lstore 27
      // 095: dup2
      // 096: ldc2_w 84815289275057
      // 099: lxor
      // 09a: lstore 29
      // 09c: dup2
      // 09d: ldc2_w 125798131754570
      // 0a0: lxor
      // 0a1: lstore 31
      // 0a3: dup2
      // 0a4: ldc2_w 111538095150334
      // 0a7: lxor
      // 0a8: lstore 33
      // 0aa: dup2
      // 0ab: ldc2_w 79411066692825
      // 0ae: lxor
      // 0af: lstore 35
      // 0b1: dup2
      // 0b2: ldc2_w 9905172350490
      // 0b5: lxor
      // 0b6: lstore 37
      // 0b8: dup2
      // 0b9: ldc2_w 2907521403210
      // 0bc: lxor
      // 0bd: lstore 39
      // 0bf: pop2
      // 0c0: ldc2_w 7146940441906183991
      // 0c3: lload 3
      // 0c4: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: astore 41
      // 0cb: iload 6
      // 0cd: ifne 0db
      // 0d0: return
      // 0d1: ldc2_w 9177714473085169174
      // 0d4: lload 3
      // 0d5: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 5
      // 0dd: ifnonnull 233
      // 0e0: iload 6
      // 0e2: bipush 1
      // 0e3: if_icmpne 233
      // 0e6: goto 0f3
      // 0e9: ldc2_w 9177714473085169174
      // 0ec: lload 3
      // 0ed: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: ldc2_w 8681052781076370794
      // 0f7: lload 3
      // 0f8: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: astore 42
      // 0ff: aload 42
      // 101: arraylength
      // 102: istore 43
      // 104: bipush 0
      // 105: istore 44
      // 107: iload 44
      // 109: iload 43
      // 10b: if_icmpge 1e8
      // 10e: aload 42
      // 110: iload 44
      // 112: aaload
      // 113: astore 45
      // 115: aload 45
      // 117: lload 10
      // 119: bipush 1
      // 11a: anewarray 271
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: ldc2_w 9178671600579260998
      // 129: lload 3
      // 12a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: aload 41
      // 131: lload 3
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 22a
      // 137: ifnonnull 228
      // 13a: aload 41
      // 13c: lload 3
      // 13d: lconst_0
      // 13e: lcmp
      // 13f: iflt 1e5
      // 142: ifnonnull 1e3
      // 145: goto 152
      // 148: ldc2_w 9177714473085169174
      // 14b: lload 3
      // 14c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: aload 45
      // 154: lload 29
      // 156: invokevirtual com/zelix/hy.B (J)Z
      // 159: ifeq 1e0
      // 15c: goto 169
      // 15f: ldc2_w 9177714473085169174
      // 162: lload 3
      // 163: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: aload 45
      // 16b: lload 35
      // 16d: bipush 1
      // 16e: anewarray 271
      // 171: dup_x2
      // 172: dup_x2
      // 173: pop
      // 174: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 177: bipush 0
      // 178: swap
      // 179: aastore
      // 17a: ldc2_w 9128376199787231468
      // 17d: lload 3
      // 17e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 188: astore 46
      // 18a: aload 46
      // 18c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 191: ifeq 1e0
      // 194: aload 46
      // 196: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 19b: checkcast com/zelix/hz
      // 19e: astore 47
      // 1a0: aload 47
      // 1a2: checkcast com/zelix/hy
      // 1a5: lload 10
      // 1a7: bipush 1
      // 1a8: anewarray 271
      // 1ab: dup_x2
      // 1ac: dup_x2
      // 1ad: pop
      // 1ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b1: bipush 0
      // 1b2: swap
      // 1b3: aastore
      // 1b4: ldc2_w 9178671600579260998
      // 1b7: lload 3
      // 1b8: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: aload 41
      // 1bf: lload 3
      // 1c0: lconst_0
      // 1c1: lcmp
      // 1c2: ifle 1ca
      // 1c5: ifnonnull 1e3
      // 1c8: aload 41
      // 1ca: ifnull 18a
      // 1cd: lload 3
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: ifle 1bd
      // 1d3: goto 1e0
      // 1d6: ldc2_w 9177714473085169174
      // 1d9: lload 3
      // 1da: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: iinc 44 1
      // 1e3: aload 41
      // 1e5: ifnull 107
      // 1e8: lload 16
      // 1ea: bipush 1
      // 1eb: anewarray 271
      // 1ee: dup_x2
      // 1ef: dup_x2
      // 1f0: pop
      // 1f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f4: bipush 0
      // 1f5: swap
      // 1f6: aastore
      // 1f7: ldc2_w 8651631754678418490
      // 1fa: lload 3
      // 1fb: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: lload 3
      // 201: lconst_0
      // 202: lcmp
      // 203: ifle 228
      // 206: aload 0
      // 207: ldc2_w 6964410285258482653
      // 20a: lload 3
      // 20b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/pd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: lload 22
      // 212: bipush 1
      // 213: anewarray 271
      // 216: dup_x2
      // 217: dup_x2
      // 218: pop
      // 219: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21c: bipush 0
      // 21d: swap
      // 21e: aastore
      // 21f: ldc2_w 7261316408066922727
      // 222: lload 3
      // 223: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: aload 41
      // 22a: lload 3
      // 22b: lconst_0
      // 22c: lcmp
      // 22d: ifle 242
      // 230: ifnull 715
      // 233: lload 31
      // 235: bipush 1
      // 236: anewarray 271
      // 239: dup_x2
      // 23a: dup_x2
      // 23b: pop
      // 23c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23f: bipush 0
      // 240: swap
      // 241: aastore
      // 242: ldc2_w 7372022776325009282
      // 245: lload 3
      // 246: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: astore 42
      // 24d: aload 0
      // 24e: ldc2_w 6964410285258482653
      // 251: lload 3
      // 252: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/pd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: lload 39
      // 259: bipush 1
      // 25a: anewarray 271
      // 25d: dup_x2
      // 25e: dup_x2
      // 25f: pop
      // 260: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 263: bipush 0
      // 264: swap
      // 265: aastore
      // 266: ldc2_w 8846295359468806324
      // 269: lload 3
      // 26a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: astore 43
      // 271: aload 43
      // 273: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 278: ifeq 50e
      // 27b: aload 43
      // 27d: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 282: checkcast com/zelix/yn
      // 285: astore 44
      // 287: aload 44
      // 289: iload 24
      // 28b: i2s
      // 28c: iload 25
      // 28e: iload 26
      // 290: i2s
      // 291: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 294: astore 45
      // 296: aload 44
      // 298: ldc2_w 9094609031918209443
      // 29b: lload 3
      // 29c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: astore 46
      // 2a3: aload 45
      // 2a5: ifnull 509
      // 2a8: aload 44
      // 2aa: lload 20
      // 2ac: bipush 1
      // 2ad: anewarray 271
      // 2b0: dup_x2
      // 2b1: dup_x2
      // 2b2: pop
      // 2b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b6: bipush 0
      // 2b7: swap
      // 2b8: aastore
      // 2b9: ldc2_w 7474263417125975132
      // 2bc: lload 3
      // 2bd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: lload 3
      // 2c3: lconst_0
      // 2c4: lcmp
      // 2c5: iflt 2ec
      // 2c8: aload 41
      // 2ca: ifnonnull 2ec
      // 2cd: goto 2da
      // 2d0: ldc2_w 9177714473085169174
      // 2d3: lload 3
      // 2d4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: athrow
      // 2da: ifeq 509
      // 2dd: goto 2ea
      // 2e0: ldc2_w 9177714473085169174
      // 2e3: lload 3
      // 2e4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e9: athrow
      // 2ea: iload 6
      // 2ec: bipush 1
      // 2ed: lload 3
      // 2ee: lconst_0
      // 2ef: lcmp
      // 2f0: iflt 350
      // 2f3: aload 41
      // 2f5: ifnonnull 350
      // 2f8: if_icmpne 328
      // 2fb: goto 308
      // 2fe: ldc2_w 9177714473085169174
      // 301: lload 3
      // 302: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: athrow
      // 308: aload 42
      // 30a: aload 45
      // 30c: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 30f: pop
      // 310: lload 3
      // 311: lconst_0
      // 312: lcmp
      // 313: ifle 408
      // 316: aload 41
      // 318: ifnull 408
      // 31b: goto 328
      // 31e: ldc2_w 9177714473085169174
      // 321: lload 3
      // 322: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: athrow
      // 328: iload 6
      // 32a: aload 41
      // 32c: lload 3
      // 32d: lconst_0
      // 32e: lcmp
      // 32f: iflt 36f
      // 332: ifnonnull 36d
      // 335: goto 342
      // 338: ldc2_w 9177714473085169174
      // 33b: lload 3
      // 33c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: bipush 2
      // 343: goto 350
      // 346: ldc2_w 9177714473085169174
      // 349: lload 3
      // 34a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34f: athrow
      // 350: if_icmpne 408
      // 353: aload 7
      // 355: aload 46
      // 357: ldc2_w 6977219692150911947
      // 35a: lload 3
      // 35b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 360: goto 36d
      // 363: ldc2_w 9177714473085169174
      // 366: lload 3
      // 367: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36c: athrow
      // 36d: aload 41
      // 36f: lload 3
      // 370: lconst_0
      // 371: lcmp
      // 372: ifle 3e0
      // 375: ifnonnull 3de
      // 378: ifeq 408
      // 37b: goto 388
      // 37e: ldc2_w 9177714473085169174
      // 381: lload 3
      // 382: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: athrow
      // 388: aload 7
      // 38a: aload 46
      // 38c: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 38f: checkcast java/lang/String
      // 392: lload 27
      // 394: bipush 2
      // 395: anewarray 271
      // 398: dup_x2
      // 399: dup_x2
      // 39a: pop
      // 39b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39e: bipush 1
      // 39f: swap
      // 3a0: aastore
      // 3a1: dup_x1
      // 3a2: swap
      // 3a3: bipush 0
      // 3a4: swap
      // 3a5: aastore
      // 3a6: ldc2_w 7242817131688344668
      // 3a9: lload 3
      // 3aa: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3af: aload 46
      // 3b1: lload 27
      // 3b3: bipush 2
      // 3b4: anewarray 271
      // 3b7: dup_x2
      // 3b8: dup_x2
      // 3b9: pop
      // 3ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3bd: bipush 1
      // 3be: swap
      // 3bf: aastore
      // 3c0: dup_x1
      // 3c1: swap
      // 3c2: bipush 0
      // 3c3: swap
      // 3c4: aastore
      // 3c5: ldc2_w 7242817131688344668
      // 3c8: lload 3
      // 3c9: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ce: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3d1: goto 3de
      // 3d4: ldc2_w 9177714473085169174
      // 3d7: lload 3
      // 3d8: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: athrow
      // 3de: aload 41
      // 3e0: ifnonnull 407
      // 3e3: ifne 408
      // 3e6: goto 3f3
      // 3e9: ldc2_w 9177714473085169174
      // 3ec: lload 3
      // 3ed: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f2: athrow
      // 3f3: aload 42
      // 3f5: aload 45
      // 3f7: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 3fa: goto 407
      // 3fd: ldc2_w 9177714473085169174
      // 400: lload 3
      // 401: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: athrow
      // 407: pop
      // 408: aload 5
      // 40a: aload 41
      // 40c: lload 3
      // 40d: lconst_0
      // 40e: lcmp
      // 40f: iflt 43d
      // 412: ifnonnull 427
      // 415: ifnull 509
      // 418: goto 425
      // 41b: ldc2_w 9177714473085169174
      // 41e: lload 3
      // 41f: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 424: athrow
      // 425: aload 5
      // 427: aload 45
      // 429: lload 14
      // 42b: bipush 2
      // 42c: anewarray 271
      // 42f: dup_x2
      // 430: dup_x2
      // 431: pop
      // 432: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 435: bipush 1
      // 436: swap
      // 437: aastore
      // 438: dup_x1
      // 439: swap
      // 43a: bipush 0
      // 43b: swap
      // 43c: aastore
      // 43d: ldc2_w 8855202454806545552
      // 440: lload 3
      // 441: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 446: aload 41
      // 448: lload 3
      // 449: lconst_0
      // 44a: lcmp
      // 44b: ifle 47d
      // 44e: ifnonnull 47b
      // 451: ifeq 509
      // 454: goto 461
      // 457: ldc2_w 9177714473085169174
      // 45a: lload 3
      // 45b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 460: athrow
      // 461: aload 42
      // 463: aload 45
      // 465: ldc2_w 8849692039569115243
      // 468: lload 3
      // 469: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46e: goto 47b
      // 471: ldc2_w 9177714473085169174
      // 474: lload 3
      // 475: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47a: athrow
      // 47b: aload 41
      // 47d: ifnonnull 4aa
      // 480: ifeq 509
      // 483: goto 490
      // 486: ldc2_w 9177714473085169174
      // 489: lload 3
      // 48a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48f: athrow
      // 490: aload 42
      // 492: aload 45
      // 494: ldc2_w 9111471657752038443
      // 497: lload 3
      // 498: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49d: goto 4aa
      // 4a0: ldc2_w 9177714473085169174
      // 4a3: lload 3
      // 4a4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a9: athrow
      // 4aa: pop
      // 4ab: aload 46
      // 4ad: aload 7
      // 4af: lload 12
      // 4b1: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 4b4: checkcast java/lang/String
      // 4b7: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 4ba: astore 47
      // 4bc: aload 2
      // 4bd: new java/lang/StringBuilder
      // 4c0: dup
      // 4c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 4c4: sipush 12947
      // 4c7: ldc2_w 2248466881054252604
      // 4ca: lload 3
      // 4cb: lxor
      // 4cc: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d4: aload 47
      // 4d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d9: sipush 4263
      // 4dc: ldc2_w 4218331948022348820
      // 4df: lload 3
      // 4e0: lxor
      // 4e1: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4ec: lload 8
      // 4ee: bipush 2
      // 4ef: anewarray 271
      // 4f2: dup_x2
      // 4f3: dup_x2
      // 4f4: pop
      // 4f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f8: bipush 1
      // 4f9: swap
      // 4fa: aastore
      // 4fb: dup_x1
      // 4fc: swap
      // 4fd: bipush 0
      // 4fe: swap
      // 4ff: aastore
      // 500: ldc2_w 7422563473898985774
      // 503: lload 3
      // 504: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 509: aload 41
      // 50b: ifnull 271
      // 50e: new java/util/ArrayList
      // 511: dup
      // 512: aload 42
      // 514: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 517: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 51a: lload 3
      // 51b: lconst_0
      // 51c: lcmp
      // 51d: ifle 282
      // 520: astore 43
      // 522: aload 43
      // 524: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 529: ifeq 5c5
      // 52c: aload 43
      // 52e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 533: checkcast com/zelix/hy
      // 536: astore 44
      // 538: aload 44
      // 53a: aload 41
      // 53c: lload 3
      // 53d: lconst_0
      // 53e: lcmp
      // 53f: iflt 578
      // 542: ifnonnull 569
      // 545: lload 29
      // 547: invokevirtual com/zelix/hy.B (J)Z
      // 54a: ifeq 5ba
      // 54d: goto 55a
      // 550: ldc2_w 9177714473085169174
      // 553: lload 3
      // 554: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 559: athrow
      // 55a: aload 44
      // 55c: goto 569
      // 55f: ldc2_w 9177714473085169174
      // 562: lload 3
      // 563: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 568: athrow
      // 569: lload 35
      // 56b: bipush 1
      // 56c: anewarray 271
      // 56f: dup_x2
      // 570: dup_x2
      // 571: pop
      // 572: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 575: bipush 0
      // 576: swap
      // 577: aastore
      // 578: ldc2_w 9128376199787231468
      // 57b: lload 3
      // 57c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 581: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 586: astore 45
      // 588: aload 45
      // 58a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 58f: ifeq 5ba
      // 592: aload 45
      // 594: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 599: checkcast com/zelix/hz
      // 59c: astore 46
      // 59e: aload 42
      // 5a0: aload 46
      // 5a2: checkcast com/zelix/hy
      // 5a5: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 5a8: istore 47
      // 5aa: aload 41
      // 5ac: ifnonnull 522
      // 5af: aload 41
      // 5b1: lload 3
      // 5b2: lconst_0
      // 5b3: lcmp
      // 5b4: iflt 533
      // 5b7: ifnull 588
      // 5ba: aload 41
      // 5bc: lload 3
      // 5bd: lconst_0
      // 5be: lcmp
      // 5bf: ifle 533
      // 5c2: ifnull 522
      // 5c5: aload 0
      // 5c6: ldc2_w 8681052781076370794
      // 5c9: lload 3
      // 5ca: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cf: lload 3
      // 5d0: lconst_0
      // 5d1: lcmp
      // 5d2: ifle 533
      // 5d5: astore 43
      // 5d7: aload 43
      // 5d9: arraylength
      // 5da: istore 44
      // 5dc: bipush 0
      // 5dd: istore 45
      // 5df: iload 45
      // 5e1: iload 44
      // 5e3: if_icmpge 6ce
      // 5e6: aload 43
      // 5e8: iload 45
      // 5ea: aaload
      // 5eb: astore 46
      // 5ed: aload 46
      // 5ef: aload 42
      // 5f1: lload 33
      // 5f3: bipush 2
      // 5f4: anewarray 271
      // 5f7: dup_x2
      // 5f8: dup_x2
      // 5f9: pop
      // 5fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5fd: bipush 1
      // 5fe: swap
      // 5ff: aastore
      // 600: dup_x1
      // 601: swap
      // 602: bipush 0
      // 603: swap
      // 604: aastore
      // 605: ldc2_w 8744652474258298880
      // 608: lload 3
      // 609: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60e: aload 41
      // 610: lload 3
      // 611: lconst_0
      // 612: lcmp
      // 613: ifle 61b
      // 616: ifnonnull 6f3
      // 619: aload 41
      // 61b: lload 3
      // 61c: lconst_0
      // 61d: lcmp
      // 61e: ifle 6cb
      // 621: ifnonnull 6c9
      // 624: goto 631
      // 627: ldc2_w 9177714473085169174
      // 62a: lload 3
      // 62b: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 630: athrow
      // 631: aload 46
      // 633: lload 29
      // 635: invokevirtual com/zelix/hy.B (J)Z
      // 638: ifeq 6c6
      // 63b: goto 648
      // 63e: ldc2_w 9177714473085169174
      // 641: lload 3
      // 642: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 647: athrow
      // 648: aload 46
      // 64a: lload 35
      // 64c: bipush 1
      // 64d: anewarray 271
      // 650: dup_x2
      // 651: dup_x2
      // 652: pop
      // 653: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 656: bipush 0
      // 657: swap
      // 658: aastore
      // 659: ldc2_w 9128376199787231468
      // 65c: lload 3
      // 65d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 662: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 667: astore 47
      // 669: aload 47
      // 66b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 670: ifeq 6c6
      // 673: aload 47
      // 675: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 67a: checkcast com/zelix/hz
      // 67d: astore 48
      // 67f: aload 48
      // 681: checkcast com/zelix/hy
      // 684: aload 42
      // 686: lload 33
      // 688: bipush 2
      // 689: anewarray 271
      // 68c: dup_x2
      // 68d: dup_x2
      // 68e: pop
      // 68f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 692: bipush 1
      // 693: swap
      // 694: aastore
      // 695: dup_x1
      // 696: swap
      // 697: bipush 0
      // 698: swap
      // 699: aastore
      // 69a: ldc2_w 8744652474258298880
      // 69d: lload 3
      // 69e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a3: aload 41
      // 6a5: lload 3
      // 6a6: lconst_0
      // 6a7: lcmp
      // 6a8: iflt 6b0
      // 6ab: ifnonnull 6c9
      // 6ae: aload 41
      // 6b0: ifnull 669
      // 6b3: lload 3
      // 6b4: lconst_0
      // 6b5: lcmp
      // 6b6: ifle 6a3
      // 6b9: goto 6c6
      // 6bc: ldc2_w 9177714473085169174
      // 6bf: lload 3
      // 6c0: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c5: athrow
      // 6c6: iinc 45 1
      // 6c9: aload 41
      // 6cb: ifnull 5df
      // 6ce: aload 42
      // 6d0: lload 37
      // 6d2: bipush 2
      // 6d3: anewarray 271
      // 6d6: dup_x2
      // 6d7: dup_x2
      // 6d8: pop
      // 6d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6dc: bipush 1
      // 6dd: swap
      // 6de: aastore
      // 6df: dup_x1
      // 6e0: swap
      // 6e1: bipush 0
      // 6e2: swap
      // 6e3: aastore
      // 6e4: ldc2_w 8790124080287995352
      // 6e7: lload 3
      // 6e8: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ed: lload 3
      // 6ee: lconst_0
      // 6ef: lcmp
      // 6f0: ifle 6f3
      // 6f3: aload 0
      // 6f4: ldc2_w 6964410285258482653
      // 6f7: lload 3
      // 6f8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/pd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6fd: lload 18
      // 6ff: bipush 1
      // 700: anewarray 271
      // 703: dup_x2
      // 704: dup_x2
      // 705: pop
      // 706: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 709: bipush 0
      // 70a: swap
      // 70b: aastore
      // 70c: ldc2_w 8803894435861440159
      // 70f: lload 3
      // 710: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 715: return
   }

   private boolean P(Object[] param1) {
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
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_uw
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/a9
      // 016: astore 2
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 4
      // 022: pop
      // 023: getstatic com/zelix/_8o.a J
      // 026: lload 4
      // 028: lxor
      // 029: lstore 4
      // 02b: lload 4
      // 02d: dup2
      // 02e: ldc2_w 28854709291025
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 45182283473024
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 32880501031435
      // 03f: lxor
      // 040: lstore 11
      // 042: dup2
      // 043: ldc2_w 50857137642738
      // 046: lxor
      // 047: lstore 13
      // 049: pop2
      // 04a: ldc2_w 1416431080662011824
      // 04d: lload 4
      // 04f: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 6
      // 056: lload 7
      // 058: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 05b: astore 16
      // 05d: astore 15
      // 05f: aload 2
      // 060: aload 15
      // 062: ifnonnull 077
      // 065: ifnull 0ad
      // 068: goto 076
      // 06b: ldc2_w 1142487513041837713
      // 06e: lload 4
      // 070: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: aload 2
      // 077: lload 13
      // 079: aload 16
      // 07b: bipush 2
      // 07c: anewarray 271
      // 07f: dup_x1
      // 080: swap
      // 081: bipush 1
      // 082: swap
      // 083: aastore
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w 1173989838506038834
      // 090: lload 4
      // 092: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: aload 15
      // 099: ifnonnull 129
      // 09c: ifne 108
      // 09f: goto 0ad
      // 0a2: ldc2_w 1142487513041837713
      // 0a5: lload 4
      // 0a7: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: aload 6
      // 0af: invokevirtual com/zelix/hz.b ()Z
      // 0b2: aload 15
      // 0b4: ifnonnull 107
      // 0b7: goto 0c5
      // 0ba: ldc2_w 1142487513041837713
      // 0bd: lload 4
      // 0bf: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: ifeq 106
      // 0c8: goto 0d6
      // 0cb: ldc2_w 1142487513041837713
      // 0ce: lload 4
      // 0d0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 3
      // 0d7: lload 9
      // 0d9: aload 6
      // 0db: checkcast com/zelix/hy
      // 0de: bipush 2
      // 0df: anewarray 271
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 1
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: ldc2_w 1713840003124466375
      // 0f3: lload 4
      // 0f5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: ireturn
      // 0fb: ldc2_w 1142487513041837713
      // 0fe: lload 4
      // 100: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 0
      // 107: ireturn
      // 108: aload 2
      // 109: lload 11
      // 10b: aload 16
      // 10d: bipush 2
      // 10e: anewarray 271
      // 111: dup_x1
      // 112: swap
      // 113: bipush 1
      // 114: swap
      // 115: aastore
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w 1496609217021712272
      // 122: lload 4
      // 124: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: ireturn
   }

   void T(Object[] param1) {
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
      // 00e: checkcast com/zelix/a9
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Boolean
      // 018: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01b: istore 5
      // 01d: pop
      // 01e: getstatic com/zelix/_8o.a J
      // 021: lload 3
      // 022: lxor
      // 023: lstore 3
      // 024: lload 3
      // 025: dup2
      // 026: ldc2_w 129841585316416
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 23793402084979
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 55205856060518
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 94586574081842
      // 03e: lxor
      // 03f: lstore 12
      // 041: dup2
      // 042: ldc2_w 10088625506609
      // 045: lxor
      // 046: lstore 14
      // 048: dup2
      // 049: ldc2_w 24293165820793
      // 04c: lxor
      // 04d: lstore 16
      // 04f: dup2
      // 050: ldc2_w 60767995877265
      // 053: lxor
      // 054: lstore 18
      // 056: pop2
      // 057: ldc2_w 7432359995252276029
      // 05a: lload 3
      // 05b: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: astore 20
      // 062: aload 2
      // 063: ifnull 28a
      // 066: lload 6
      // 068: bipush 1
      // 069: anewarray 271
      // 06c: dup_x2
      // 06d: dup_x2
      // 06e: pop
      // 06f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 072: bipush 0
      // 073: swap
      // 074: aastore
      // 075: ldc2_w 7080973452891777928
      // 078: lload 3
      // 079: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: astore 21
      // 080: aload 2
      // 081: lload 14
      // 083: bipush 1
      // 084: anewarray 271
      // 087: dup_x2
      // 088: dup_x2
      // 089: pop
      // 08a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w 9098184070007955137
      // 093: lload 3
      // 094: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: astore 22
      // 09b: bipush 0
      // 09c: istore 23
      // 09e: iload 23
      // 0a0: aload 22
      // 0a2: invokeinterface java/util/List.size ()I 1
      // 0a7: if_icmpge 255
      // 0aa: aload 22
      // 0ac: iload 23
      // 0ae: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0b3: checkcast java/lang/String
      // 0b6: astore 24
      // 0b8: aload 20
      // 0ba: ifnonnull 28a
      // 0bd: aload 24
      // 0bf: aload 20
      // 0c1: ifnonnull 214
      // 0c4: goto 0d1
      // 0c7: ldc2_w 8887799776940583452
      // 0ca: lload 3
      // 0cb: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: lload 8
      // 0d3: dup2_x1
      // 0d4: pop2
      // 0d5: bipush 2
      // 0d6: anewarray 271
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 1
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w 7090687231351814009
      // 0ea: lload 3
      // 0eb: lload 3
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: ifle 20f
      // 0f1: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: ifne 1f5
      // 0f9: goto 106
      // 0fc: ldc2_w 8887799776940583452
      // 0ff: lload 3
      // 100: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: lload 3
      // 107: lconst_0
      // 108: lcmp
      // 109: ifle 1d0
      // 10c: iload 5
      // 10e: ifne 1b0
      // 111: aload 0
      // 112: ldc2_w 7086114698649867270
      // 115: lload 3
      // 116: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/qx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: aload 24
      // 11d: lload 12
      // 11f: bipush 0
      // 120: bipush 3
      // 121: anewarray 271
      // 124: dup_x1
      // 125: swap
      // 126: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 129: bipush 2
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x2
      // 12d: dup_x2
      // 12e: pop
      // 12f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 132: bipush 1
      // 133: swap
      // 134: aastore
      // 135: dup_x1
      // 136: swap
      // 137: bipush 0
      // 138: swap
      // 139: aastore
      // 13a: ldc2_w 6973665585092516805
      // 13d: lload 3
      // 13e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: ifnull 1b0
      // 146: goto 153
      // 149: ldc2_w 8887799776940583452
      // 14c: lload 3
      // 14d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: athrow
      // 153: aload 24
      // 155: lload 10
      // 157: bipush 2
      // 158: anewarray 271
      // 15b: dup_x2
      // 15c: dup_x2
      // 15d: pop
      // 15e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 161: bipush 1
      // 162: swap
      // 163: aastore
      // 164: dup_x1
      // 165: swap
      // 166: bipush 0
      // 167: swap
      // 168: aastore
      // 169: ldc2_w 9105994703789704423
      // 16c: lload 3
      // 16d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: astore 25
      // 174: aload 25
      // 176: invokevirtual java/lang/String.length ()I
      // 179: aload 20
      // 17b: ifnonnull 1a4
      // 17e: ifle 1a5
      // 181: goto 18e
      // 184: ldc2_w 8887799776940583452
      // 187: lload 3
      // 188: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 21
      // 190: aload 25
      // 192: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 197: goto 1a4
      // 19a: ldc2_w 8887799776940583452
      // 19d: lload 3
      // 19e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: pop
      // 1a5: lload 3
      // 1a6: lconst_0
      // 1a7: lcmp
      // 1a8: iflt 1d0
      // 1ab: aload 20
      // 1ad: ifnull 1dd
      // 1b0: aload 2
      // 1b1: lload 16
      // 1b3: aload 24
      // 1b5: bipush 2
      // 1b6: anewarray 271
      // 1b9: dup_x1
      // 1ba: swap
      // 1bb: bipush 1
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x2
      // 1bf: dup_x2
      // 1c0: pop
      // 1c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c4: bipush 0
      // 1c5: swap
      // 1c6: aastore
      // 1c7: ldc2_w 8832375016062510504
      // 1ca: lload 3
      // 1cb: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: goto 1dd
      // 1d3: ldc2_w 8887799776940583452
      // 1d6: lload 3
      // 1d7: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: goto 24d
      // 1e0: astore 25
      // 1e2: new com/zelix/_sk
      // 1e5: dup
      // 1e6: aload 25
      // 1e8: ldc2_w 7262391952518451814
      // 1eb: lload 3
      // 1ec: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 1f4: athrow
      // 1f5: aload 24
      // 1f7: lload 10
      // 1f9: bipush 2
      // 1fa: anewarray 271
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
      // 20b: ldc2_w 9105994703789704423
      // 20e: lload 3
      // 20f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: astore 25
      // 216: aload 20
      // 218: lload 3
      // 219: lconst_0
      // 21a: lcmp
      // 21b: iflt 252
      // 21e: ifnonnull 250
      // 221: aload 25
      // 223: invokevirtual java/lang/String.length ()I
      // 226: ifle 24d
      // 229: goto 236
      // 22c: ldc2_w 8887799776940583452
      // 22f: lload 3
      // 230: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: aload 21
      // 238: aload 25
      // 23a: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 23f: pop
      // 240: goto 24d
      // 243: ldc2_w 8887799776940583452
      // 246: lload 3
      // 247: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: athrow
      // 24d: iinc 23 1
      // 250: aload 20
      // 252: ifnull 09e
      // 255: aload 0
      // 256: ldc2_w 9149406668295804553
      // 259: lload 3
      // 25a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: lload 3
      // 260: lconst_0
      // 261: lcmp
      // 262: iflt 0b3
      // 265: aload 2
      // 266: lload 18
      // 268: aload 21
      // 26a: bipush 3
      // 26b: anewarray 271
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 2
      // 271: swap
      // 272: aastore
      // 273: dup_x2
      // 274: dup_x2
      // 275: pop
      // 276: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 279: bipush 1
      // 27a: swap
      // 27b: aastore
      // 27c: dup_x1
      // 27d: swap
      // 27e: bipush 0
      // 27f: swap
      // 280: aastore
      // 281: ldc2_w 7215385650121545564
      // 284: lload 3
      // 285: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: return
   }

   private a9 T(Object[] param1) {
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/io/Reader
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_zk
      // 016: astore 2
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast com/zelix/_ur
      // 01d: astore 7
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Boolean
      // 025: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 028: istore 8
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/lang/Long
      // 030: invokevirtual java/lang/Long.longValue ()J
      // 033: lstore 5
      // 035: pop
      // 036: getstatic com/zelix/_8o.a J
      // 039: lload 5
      // 03b: lxor
      // 03c: lstore 5
      // 03e: lload 5
      // 040: dup2
      // 041: ldc2_w 30803905181213
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 19440266390253
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 52933304532664
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 29768815827984
      // 059: lxor
      // 05a: lstore 15
      // 05c: dup2
      // 05d: ldc2_w 123656106756411
      // 060: lxor
      // 061: lstore 17
      // 063: dup2
      // 064: ldc2_w 28703655392114
      // 067: lxor
      // 068: lstore 19
      // 06a: dup2
      // 06b: ldc2_w 57723981589626
      // 06e: lxor
      // 06f: lstore 21
      // 071: dup2
      // 072: ldc2_w 67917771133186
      // 075: lxor
      // 076: lstore 23
      // 078: dup2
      // 079: ldc2_w 83823479171241
      // 07c: lxor
      // 07d: lstore 25
      // 07f: dup2
      // 080: ldc2_w 103799967898693
      // 083: lxor
      // 084: lstore 27
      // 086: dup2
      // 087: ldc2_w 89850951866816
      // 08a: lxor
      // 08b: lstore 29
      // 08d: dup2
      // 08e: ldc2_w 14863796640669
      // 091: lxor
      // 092: lstore 31
      // 094: dup2
      // 095: ldc2_w 86666566445322
      // 098: lxor
      // 099: lstore 33
      // 09b: dup2
      // 09c: ldc2_w 1810398105637
      // 09f: lxor
      // 0a0: lstore 35
      // 0a2: pop2
      // 0a3: ldc2_w -9001740763940643061
      // 0a6: lload 5
      // 0a8: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: aconst_null
      // 0ae: astore 38
      // 0b0: astore 37
      // 0b2: aconst_null
      // 0b3: astore 39
      // 0b5: new com/zelix/a9
      // 0b8: dup
      // 0b9: aload 3
      // 0ba: aload 7
      // 0bc: iload 8
      // 0be: lload 33
      // 0c0: invokespecial com/zelix/a9.<init> (Ljava/lang/String;Lcom/zelix/_ur;ZJ)V
      // 0c3: astore 39
      // 0c5: ldc2_w -7308710375212686006
      // 0c8: lload 5
      // 0ca: invokedynamic n (JJ)Lcom/zelix/l8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: astore 40
      // 0d1: aload 40
      // 0d3: aload 37
      // 0d5: ifnonnull 102
      // 0d8: ifnonnull 110
      // 0db: goto 0e9
      // 0de: ldc2_w -6962100270441886166
      // 0e1: lload 5
      // 0e3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: new com/zelix/l8
      // 0ec: dup
      // 0ed: lload 21
      // 0ef: aload 4
      // 0f1: invokespecial com/zelix/l8.<init> (JLjava/io/Reader;)V
      // 0f4: goto 102
      // 0f7: ldc2_w -6962100270441886166
      // 0fa: lload 5
      // 0fc: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: astore 40
      // 104: aload 37
      // 106: lload 5
      // 108: lconst_0
      // 109: lcmp
      // 10a: iflt 14d
      // 10d: ifnull 13e
      // 110: lload 29
      // 112: aload 4
      // 114: bipush 2
      // 115: anewarray 271
      // 118: dup_x1
      // 119: swap
      // 11a: bipush 1
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: ldc2_w -7401918717922800073
      // 129: lload 5
      // 12b: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: goto 13e
      // 133: ldc2_w -6962100270441886166
      // 136: lload 5
      // 138: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: lload 25
      // 140: bipush 1
      // 141: anewarray 271
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: ldc2_w -6939647000355080631
      // 150: lload 5
      // 152: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/y1; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: astore 38
      // 159: aload 38
      // 15b: lload 5
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 178
      // 162: aconst_null
      // 163: aload 39
      // 165: lload 19
      // 167: ldc2_w -7483421673050837589
      // 16a: lload 5
      // 16c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: aload 37
      // 173: ifnonnull 23b
      // 176: aload 38
      // 178: lload 15
      // 17a: invokevirtual com/zelix/y1.u (J)I
      // 17d: ifne 1ea
      // 180: goto 18e
      // 183: ldc2_w -6962100270441886166
      // 186: lload 5
      // 188: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 2
      // 18f: sipush 20494
      // 192: ldc2_w 3717253309486308501
      // 195: lload 5
      // 197: lxor
      // 198: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: new java/lang/StringBuilder
      // 1a0: dup
      // 1a1: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a4: ldc "\""
      // 1a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a9: aload 3
      // 1aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ad: sipush 15360
      // 1b0: ldc2_w 2287462225419726998
      // 1b3: lload 5
      // 1b5: lxor
      // 1b6: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c1: lload 9
      // 1c3: bipush 3
      // 1c4: anewarray 271
      // 1c7: dup_x2
      // 1c8: dup_x2
      // 1c9: pop
      // 1ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cd: bipush 2
      // 1ce: swap
      // 1cf: aastore
      // 1d0: dup_x1
      // 1d1: swap
      // 1d2: bipush 1
      // 1d3: swap
      // 1d4: aastore
      // 1d5: dup_x1
      // 1d6: swap
      // 1d7: bipush 0
      // 1d8: swap
      // 1d9: aastore
      // 1da: ldc2_w -8932549304321976645
      // 1dd: lload 5
      // 1df: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: aconst_null
      // 1e5: astore 39
      // 1e7: goto 256
      // 1ea: aload 39
      // 1ec: lload 35
      // 1ee: bipush 1
      // 1ef: anewarray 271
      // 1f2: dup_x2
      // 1f3: dup_x2
      // 1f4: pop
      // 1f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f8: bipush 0
      // 1f9: swap
      // 1fa: aastore
      // 1fb: ldc2_w -7433470338917076577
      // 1fe: lload 5
      // 200: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: aload 39
      // 207: lload 13
      // 209: bipush 1
      // 20a: anewarray 271
      // 20d: dup_x2
      // 20e: dup_x2
      // 20f: pop
      // 210: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 213: bipush 0
      // 214: swap
      // 215: aastore
      // 216: ldc2_w -9111423011700666368
      // 219: lload 5
      // 21b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: aload 39
      // 222: lload 11
      // 224: bipush 1
      // 225: anewarray 271
      // 228: dup_x2
      // 229: dup_x2
      // 22a: pop
      // 22b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22e: bipush 0
      // 22f: swap
      // 230: aastore
      // 231: ldc2_w -7287704843573253954
      // 234: lload 5
      // 236: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: aload 39
      // 23d: lload 27
      // 23f: bipush 1
      // 240: anewarray 271
      // 243: dup_x2
      // 244: dup_x2
      // 245: pop
      // 246: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 249: bipush 0
      // 24a: swap
      // 24b: aastore
      // 24c: ldc2_w -8769390838696135835
      // 24f: lload 5
      // 251: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: aload 38
      // 258: aload 37
      // 25a: ifnonnull 270
      // 25d: ifnull 27c
      // 260: goto 26e
      // 263: ldc2_w -6962100270441886166
      // 266: lload 5
      // 268: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: athrow
      // 26e: aload 38
      // 270: lload 31
      // 272: ldc2_w -8854370032763568440
      // 275: lload 5
      // 277: invokedynamic o (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: lload 5
      // 27e: lconst_0
      // 27f: lcmp
      // 280: iflt 2a7
      // 283: aload 4
      // 285: aload 37
      // 287: ifnonnull 29d
      // 28a: ifnull 4f2
      // 28d: goto 29b
      // 290: ldc2_w -6962100270441886166
      // 293: lload 5
      // 295: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: athrow
      // 29b: aload 4
      // 29d: ldc2_w -9114568678752442737
      // 2a0: lload 5
      // 2a2: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: goto 4f2
      // 2aa: astore 40
      // 2ac: goto 4f2
      // 2af: astore 40
      // 2b1: lload 23
      // 2b3: aload 3
      // 2b4: aload 7
      // 2b6: bipush 3
      // 2b7: anewarray 271
      // 2ba: dup_x1
      // 2bb: swap
      // 2bc: bipush 2
      // 2bd: swap
      // 2be: aastore
      // 2bf: dup_x1
      // 2c0: swap
      // 2c1: bipush 1
      // 2c2: swap
      // 2c3: aastore
      // 2c4: dup_x2
      // 2c5: dup_x2
      // 2c6: pop
      // 2c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ca: bipush 0
      // 2cb: swap
      // 2cc: aastore
      // 2cd: ldc2_w -7258898826184113652
      // 2d0: lload 5
      // 2d2: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: astore 41
      // 2d9: aload 2
      // 2da: sipush 29368
      // 2dd: ldc2_w 5729481265603034686
      // 2e0: lload 5
      // 2e2: lxor
      // 2e3: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: new java/lang/StringBuilder
      // 2eb: dup
      // 2ec: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ef: sipush 20680
      // 2f2: ldc2_w 6969592012968860761
      // 2f5: lload 5
      // 2f7: lxor
      // 2f8: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 300: aload 3
      // 301: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 304: ldc "\""
      // 306: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 309: aload 41
      // 30b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 311: lload 17
      // 313: dup2_x1
      // 314: pop2
      // 315: aload 40
      // 317: ldc2_w -8684277010872591809
      // 31a: lload 5
      // 31c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: bipush 4
      // 322: anewarray 271
      // 325: dup_x1
      // 326: swap
      // 327: bipush 3
      // 328: swap
      // 329: aastore
      // 32a: dup_x1
      // 32b: swap
      // 32c: bipush 2
      // 32d: swap
      // 32e: aastore
      // 32f: dup_x2
      // 330: dup_x2
      // 331: pop
      // 332: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 335: bipush 1
      // 336: swap
      // 337: aastore
      // 338: dup_x1
      // 339: swap
      // 33a: bipush 0
      // 33b: swap
      // 33c: aastore
      // 33d: ldc2_w -8794835854896767460
      // 340: lload 5
      // 342: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: aconst_null
      // 348: astore 39
      // 34a: aload 38
      // 34c: aload 37
      // 34e: ifnonnull 364
      // 351: ifnull 370
      // 354: goto 362
      // 357: ldc2_w -6962100270441886166
      // 35a: lload 5
      // 35c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: aload 38
      // 364: lload 31
      // 366: ldc2_w -8854370032763568440
      // 369: lload 5
      // 36b: invokedynamic o (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: lload 5
      // 372: lconst_0
      // 373: lcmp
      // 374: iflt 39b
      // 377: aload 4
      // 379: aload 37
      // 37b: ifnonnull 391
      // 37e: ifnull 4f2
      // 381: goto 38f
      // 384: ldc2_w -6962100270441886166
      // 387: lload 5
      // 389: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: athrow
      // 38f: aload 4
      // 391: ldc2_w -9114568678752442737
      // 394: lload 5
      // 396: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: goto 4f2
      // 39e: astore 40
      // 3a0: goto 4f2
      // 3a3: astore 40
      // 3a5: lload 23
      // 3a7: aload 3
      // 3a8: aload 7
      // 3aa: bipush 3
      // 3ab: anewarray 271
      // 3ae: dup_x1
      // 3af: swap
      // 3b0: bipush 2
      // 3b1: swap
      // 3b2: aastore
      // 3b3: dup_x1
      // 3b4: swap
      // 3b5: bipush 1
      // 3b6: swap
      // 3b7: aastore
      // 3b8: dup_x2
      // 3b9: dup_x2
      // 3ba: pop
      // 3bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3be: bipush 0
      // 3bf: swap
      // 3c0: aastore
      // 3c1: ldc2_w -7258898826184113652
      // 3c4: lload 5
      // 3c6: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cb: astore 41
      // 3cd: aload 2
      // 3ce: sipush 29368
      // 3d1: ldc2_w 5729481265603034686
      // 3d4: lload 5
      // 3d6: lxor
      // 3d7: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dc: new java/lang/StringBuilder
      // 3df: dup
      // 3e0: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e3: sipush 25979
      // 3e6: ldc2_w 6931700776903387637
      // 3e9: lload 5
      // 3eb: lxor
      // 3ec: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f4: aload 3
      // 3f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f8: ldc "\""
      // 3fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3fd: aload 41
      // 3ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 402: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 405: lload 17
      // 407: dup2_x1
      // 408: pop2
      // 409: aload 40
      // 40b: ldc2_w -7409466415679181720
      // 40e: lload 5
      // 410: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 415: bipush 4
      // 416: anewarray 271
      // 419: dup_x1
      // 41a: swap
      // 41b: bipush 3
      // 41c: swap
      // 41d: aastore
      // 41e: dup_x1
      // 41f: swap
      // 420: bipush 2
      // 421: swap
      // 422: aastore
      // 423: dup_x2
      // 424: dup_x2
      // 425: pop
      // 426: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 429: bipush 1
      // 42a: swap
      // 42b: aastore
      // 42c: dup_x1
      // 42d: swap
      // 42e: bipush 0
      // 42f: swap
      // 430: aastore
      // 431: ldc2_w -8794835854896767460
      // 434: lload 5
      // 436: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43b: aconst_null
      // 43c: astore 39
      // 43e: aload 38
      // 440: aload 37
      // 442: ifnonnull 458
      // 445: ifnull 464
      // 448: goto 456
      // 44b: ldc2_w -6962100270441886166
      // 44e: lload 5
      // 450: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 455: athrow
      // 456: aload 38
      // 458: lload 31
      // 45a: ldc2_w -8854370032763568440
      // 45d: lload 5
      // 45f: invokedynamic o (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 464: lload 5
      // 466: lconst_0
      // 467: lcmp
      // 468: ifle 48f
      // 46b: aload 4
      // 46d: aload 37
      // 46f: ifnonnull 485
      // 472: ifnull 4f2
      // 475: goto 483
      // 478: ldc2_w -6962100270441886166
      // 47b: lload 5
      // 47d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 482: athrow
      // 483: aload 4
      // 485: ldc2_w -9114568678752442737
      // 488: lload 5
      // 48a: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48f: goto 4f2
      // 492: astore 40
      // 494: goto 4f2
      // 497: astore 42
      // 499: aload 38
      // 49b: aload 37
      // 49d: ifnonnull 4b3
      // 4a0: ifnull 4bf
      // 4a3: goto 4b1
      // 4a6: ldc2_w -6962100270441886166
      // 4a9: lload 5
      // 4ab: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b0: athrow
      // 4b1: aload 38
      // 4b3: lload 31
      // 4b5: ldc2_w -8854370032763568440
      // 4b8: lload 5
      // 4ba: invokedynamic o (Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bf: lload 5
      // 4c1: lconst_0
      // 4c2: lcmp
      // 4c3: ifle 4ea
      // 4c6: aload 4
      // 4c8: aload 37
      // 4ca: ifnonnull 4e0
      // 4cd: ifnull 4ef
      // 4d0: goto 4de
      // 4d3: ldc2_w -6962100270441886166
      // 4d6: lload 5
      // 4d8: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4dd: athrow
      // 4de: aload 4
      // 4e0: ldc2_w -9114568678752442737
      // 4e3: lload 5
      // 4e5: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ea: goto 4ef
      // 4ed: astore 43
      // 4ef: aload 42
      // 4f1: athrow
      // 4f2: aload 39
      // 4f4: areturn
   }

   _8o(pk var1, hy[] var2, long var3, xn var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 39590220654355L;
      long var8 = var3 ^ 74643119935044L;
      long var10 = var3 ^ 48038779300992L;
      long var12 = var3 ^ 4248853852094L;
      long var10001 = var3 ^ 99442967223774L;
      int var14 = (int)((var3 ^ 99442967223774L) >>> 32);
      int var15 = (int)((var3 ^ 99442967223774L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      super();
      this.e = var1;
      x44.a<"w">(this, var2, -448546993022249771L, var3);
      this.T = var5;
      this.O = x44.a<"l">(var1, new Object[]{var10}, -155827443750740737L, var3);
      this.S = x44.a<"l">(var1, new Object[]{var12}, -1824275684804145533L, var3);
      this.L = x44.a<"l">(var1, new Object[]{var8}, -1798279784240393803L, var3);
      this.d = x44.a<"l">(var1, new Object[]{var6}, -1847441815910208308L, var3);
      this.f = _uo.f(var14, (short)var15, var16);
   }

   static boolean L(Object[] param0) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/util/HashMap
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/HashMap
      // 019: astore 1
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/util/HashMap
      // 020: astore 7
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/qx
      // 028: astore 6
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/a9
      // 030: astore 2
      // 031: pop
      // 032: getstatic com/zelix/_8o.a J
      // 035: lload 3
      // 036: lxor
      // 037: lstore 3
      // 038: lload 3
      // 039: dup2
      // 03a: ldc2_w 98247196732483
      // 03d: lxor
      // 03e: lstore 8
      // 040: dup2
      // 041: ldc2_w 133563470948941
      // 044: lxor
      // 045: lstore 10
      // 047: dup2
      // 048: ldc2_w 28649829427587
      // 04b: lxor
      // 04c: lstore 12
      // 04e: dup2
      // 04f: ldc2_w 15504710310289
      // 052: lxor
      // 053: lstore 14
      // 055: dup2
      // 056: ldc2_w 72354575064573
      // 059: lxor
      // 05a: lstore 16
      // 05c: dup2
      // 05d: ldc2_w 23397981238030
      // 060: lxor
      // 061: lstore 18
      // 063: dup2
      // 064: ldc2_w 55353052834177
      // 067: lxor
      // 068: lstore 20
      // 06a: dup2
      // 06b: ldc2_w 139502339260180
      // 06e: lxor
      // 06f: lstore 22
      // 071: dup2
      // 072: ldc2_w 104040118413206
      // 075: lxor
      // 076: lstore 24
      // 078: pop2
      // 079: ldc2_w -7998256851831157480
      // 07c: lload 3
      // 07d: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: bipush 0
      // 083: istore 27
      // 085: astore 26
      // 087: aload 2
      // 088: aload 26
      // 08a: ifnonnull 09e
      // 08d: ifnull 330
      // 090: goto 09d
      // 093: ldc2_w -8254331748225770439
      // 096: lload 3
      // 097: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 2
      // 09e: lload 22
      // 0a0: bipush 1
      // 0a1: anewarray 271
      // 0a4: dup_x2
      // 0a5: dup_x2
      // 0a6: pop
      // 0a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0aa: bipush 0
      // 0ab: swap
      // 0ac: aastore
      // 0ad: ldc2_w -8618119500943726364
      // 0b0: lload 3
      // 0b1: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: astore 28
      // 0b8: new java/util/ArrayList
      // 0bb: dup
      // 0bc: invokespecial java/util/ArrayList.<init> ()V
      // 0bf: astore 29
      // 0c1: bipush 0
      // 0c2: istore 30
      // 0c4: iload 30
      // 0c6: aload 28
      // 0c8: invokevirtual java/util/ArrayList.size ()I
      // 0cb: if_icmpge 24b
      // 0ce: aload 28
      // 0d0: iload 30
      // 0d2: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0d5: checkcast java/lang/String
      // 0d8: astore 31
      // 0da: aload 26
      // 0dc: ifnonnull 246
      // 0df: aload 5
      // 0e1: aload 31
      // 0e3: ldc2_w -7855575285583445532
      // 0e6: lload 3
      // 0e7: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: aload 26
      // 0ee: ifnonnull 332
      // 0f1: goto 0fe
      // 0f4: ldc2_w -8254331748225770439
      // 0f7: lload 3
      // 0f8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: ifne 243
      // 101: goto 10e
      // 104: ldc2_w -8254331748225770439
      // 107: lload 3
      // 108: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: aload 2
      // 10f: aload 31
      // 111: lload 14
      // 113: bipush 2
      // 114: anewarray 271
      // 117: dup_x2
      // 118: dup_x2
      // 119: pop
      // 11a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11d: bipush 1
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w -8481821333622841574
      // 128: lload 3
      // 129: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: astore 32
      // 130: aload 32
      // 132: aload 26
      // 134: lload 3
      // 135: lconst_0
      // 136: lcmp
      // 137: ifle 155
      // 13a: ifnonnull 153
      // 13d: ifnonnull 151
      // 140: goto 14d
      // 143: ldc2_w -8254331748225770439
      // 146: lload 3
      // 147: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: aload 31
      // 14f: astore 32
      // 151: aload 31
      // 153: aload 26
      // 155: ifnonnull 179
      // 158: aload 32
      // 15a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15d: ifne 170
      // 160: goto 16d
      // 163: ldc2_w -8254331748225770439
      // 166: lload 3
      // 167: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: bipush 1
      // 16e: istore 27
      // 170: aload 5
      // 172: aload 31
      // 174: aload 32
      // 176: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 179: astore 33
      // 17b: aload 1
      // 17c: aload 32
      // 17e: aload 31
      // 180: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 183: astore 34
      // 185: aload 2
      // 186: lload 16
      // 188: aload 31
      // 18a: bipush 2
      // 18b: anewarray 271
      // 18e: dup_x1
      // 18f: swap
      // 190: bipush 1
      // 191: swap
      // 192: aastore
      // 193: dup_x2
      // 194: dup_x2
      // 195: pop
      // 196: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 199: bipush 0
      // 19a: swap
      // 19b: aastore
      // 19c: ldc2_w -8419329850482717199
      // 19f: lload 3
      // 1a0: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: astore 35
      // 1a7: aload 35
      // 1a9: aload 26
      // 1ab: ifnonnull 1cb
      // 1ae: ifnull 1c9
      // 1b1: goto 1be
      // 1b4: ldc2_w -8254331748225770439
      // 1b7: lload 3
      // 1b8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: aload 7
      // 1c0: aload 32
      // 1c2: aload 35
      // 1c4: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1c7: astore 36
      // 1c9: aload 31
      // 1cb: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 1ce: astore 36
      // 1d0: aload 36
      // 1d2: ldc2_w -8629216634602468583
      // 1d5: lload 3
      // 1d6: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: checkcast com/zelix/hu
      // 1de: astore 37
      // 1e0: aload 26
      // 1e2: lload 3
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: iflt 248
      // 1e8: ifnonnull 246
      // 1eb: aload 31
      // 1ed: aload 32
      // 1ef: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f2: ifne 243
      // 1f5: goto 202
      // 1f8: ldc2_w -8254331748225770439
      // 1fb: lload 3
      // 1fc: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: aload 6
      // 204: aload 31
      // 206: aload 37
      // 208: lload 12
      // 20a: bipush 3
      // 20b: anewarray 271
      // 20e: dup_x2
      // 20f: dup_x2
      // 210: pop
      // 211: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 214: bipush 2
      // 215: swap
      // 216: aastore
      // 217: dup_x1
      // 218: swap
      // 219: bipush 1
      // 21a: swap
      // 21b: aastore
      // 21c: dup_x1
      // 21d: swap
      // 21e: bipush 0
      // 21f: swap
      // 220: aastore
      // 221: ldc2_w -8183022217660983833
      // 224: lload 3
      // 225: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: new com/zelix/e1
      // 22d: dup
      // 22e: lload 8
      // 230: aload 31
      // 232: aload 32
      // 234: aload 37
      // 236: invokespecial com/zelix/e1.<init> (JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
      // 239: astore 38
      // 23b: aload 29
      // 23d: aload 38
      // 23f: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 242: pop
      // 243: iinc 30 1
      // 246: aload 26
      // 248: ifnull 0c4
      // 24b: aload 29
      // 24d: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 250: lload 3
      // 251: lconst_0
      // 252: lcmp
      // 253: iflt 0d5
      // 256: astore 30
      // 258: aload 30
      // 25a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 25f: ifeq 330
      // 262: aload 30
      // 264: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 269: checkcast com/zelix/e1
      // 26c: astore 31
      // 26e: aload 31
      // 270: lload 10
      // 272: bipush 1
      // 273: anewarray 271
      // 276: dup_x2
      // 277: dup_x2
      // 278: pop
      // 279: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27c: bipush 0
      // 27d: swap
      // 27e: aastore
      // 27f: ldc2_w -7625049407546637951
      // 282: lload 3
      // 283: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: checkcast com/zelix/hu
      // 28b: aload 31
      // 28d: lload 20
      // 28f: bipush 1
      // 290: anewarray 271
      // 293: dup_x2
      // 294: dup_x2
      // 295: pop
      // 296: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 299: bipush 0
      // 29a: swap
      // 29b: aastore
      // 29c: ldc2_w -8594362274315529361
      // 29f: lload 3
      // 2a0: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: checkcast java/lang/String
      // 2a8: aconst_null
      // 2a9: lload 24
      // 2ab: bipush 3
      // 2ac: anewarray 271
      // 2af: dup_x2
      // 2b0: dup_x2
      // 2b1: pop
      // 2b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b5: bipush 2
      // 2b6: swap
      // 2b7: aastore
      // 2b8: dup_x1
      // 2b9: swap
      // 2ba: bipush 1
      // 2bb: swap
      // 2bc: aastore
      // 2bd: dup_x1
      // 2be: swap
      // 2bf: bipush 0
      // 2c0: swap
      // 2c1: aastore
      // 2c2: ldc2_w -7600697625252219539
      // 2c5: lload 3
      // 2c6: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cb: aload 6
      // 2cd: aload 31
      // 2cf: lload 20
      // 2d1: bipush 1
      // 2d2: anewarray 271
      // 2d5: dup_x2
      // 2d6: dup_x2
      // 2d7: pop
      // 2d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2db: bipush 0
      // 2dc: swap
      // 2dd: aastore
      // 2de: ldc2_w -8594362274315529361
      // 2e1: lload 3
      // 2e2: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e7: checkcast java/lang/String
      // 2ea: aload 31
      // 2ec: lload 10
      // 2ee: bipush 1
      // 2ef: anewarray 271
      // 2f2: dup_x2
      // 2f3: dup_x2
      // 2f4: pop
      // 2f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f8: bipush 0
      // 2f9: swap
      // 2fa: aastore
      // 2fb: ldc2_w -7625049407546637951
      // 2fe: lload 3
      // 2ff: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: lload 18
      // 306: dup2_x1
      // 307: pop2
      // 308: checkcast com/zelix/hu
      // 30b: bipush 3
      // 30c: anewarray 271
      // 30f: dup_x1
      // 310: swap
      // 311: bipush 2
      // 312: swap
      // 313: aastore
      // 314: dup_x2
      // 315: dup_x2
      // 316: pop
      // 317: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31a: bipush 1
      // 31b: swap
      // 31c: aastore
      // 31d: dup_x1
      // 31e: swap
      // 31f: bipush 0
      // 320: swap
      // 321: aastore
      // 322: ldc2_w -8601492445672393782
      // 325: lload 3
      // 326: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: aload 26
      // 32d: ifnull 258
      // 330: iload 27
      // 332: ireturn
   }

   void b(Object[] param1) {
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
      // 00a: istore 6
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 3
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast com/zelix/_uw
      // 01c: astore 2
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast com/zelix/a9
      // 023: astore 5
      // 025: pop
      // 026: getstatic com/zelix/_8o.a J
      // 029: lload 3
      // 02a: lxor
      // 02b: lstore 3
      // 02c: lload 3
      // 02d: dup2
      // 02e: ldc2_w 8940310321988
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 36654092390190
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 39103219528261
      // 03f: lxor
      // 040: lstore 11
      // 042: dup2
      // 043: ldc2_w 31407157473353
      // 046: lxor
      // 047: lstore 13
      // 049: dup2
      // 04a: ldc2_w 133159384459728
      // 04d: lxor
      // 04e: lstore 15
      // 050: dup2
      // 051: ldc2_w 134633350384901
      // 054: lxor
      // 055: lstore 17
      // 057: dup2
      // 058: ldc2_w 30899656836297
      // 05b: lxor
      // 05c: lstore 19
      // 05e: dup2
      // 05f: ldc2_w 20201542555739
      // 062: lxor
      // 063: lstore 21
      // 065: dup2
      // 066: ldc2_w 75276126741541
      // 069: lxor
      // 06a: dup2
      // 06b: bipush 48
      // 06d: lushr
      // 06e: l2i
      // 06f: istore 23
      // 071: dup2
      // 072: bipush 16
      // 074: lshl
      // 075: bipush 32
      // 077: lushr
      // 078: l2i
      // 079: istore 24
      // 07b: dup2
      // 07c: bipush 48
      // 07e: lshl
      // 07f: bipush 48
      // 081: lushr
      // 082: l2i
      // 083: istore 25
      // 085: pop2
      // 086: dup2
      // 087: ldc2_w 134296246408455
      // 08a: lxor
      // 08b: lstore 26
      // 08d: dup2
      // 08e: ldc2_w 75542321437093
      // 091: lxor
      // 092: lstore 28
      // 094: dup2
      // 095: ldc2_w 131322354346949
      // 098: lxor
      // 099: lstore 30
      // 09b: dup2
      // 09c: ldc2_w 14136773865550
      // 09f: lxor
      // 0a0: dup2
      // 0a1: bipush 48
      // 0a3: lushr
      // 0a4: l2i
      // 0a5: istore 32
      // 0a7: dup2
      // 0a8: bipush 16
      // 0aa: lshl
      // 0ab: bipush 32
      // 0ad: lushr
      // 0ae: l2i
      // 0af: istore 33
      // 0b1: dup2
      // 0b2: bipush 48
      // 0b4: lshl
      // 0b5: bipush 48
      // 0b7: lushr
      // 0b8: l2i
      // 0b9: istore 34
      // 0bb: pop2
      // 0bc: dup2
      // 0bd: ldc2_w 140107186048762
      // 0c0: lxor
      // 0c1: lstore 35
      // 0c3: dup2
      // 0c4: ldc2_w 107939113660669
      // 0c7: lxor
      // 0c8: lstore 37
      // 0ca: pop2
      // 0cb: ldc2_w -9106140199779361352
      // 0ce: lload 3
      // 0cf: invokedynamic t (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: aload 0
      // 0d5: ldc2_w -9067439803378220718
      // 0d8: lload 3
      // 0d9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/pd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: lload 30
      // 0e0: bipush 1
      // 0e1: anewarray 271
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 0
      // 0eb: swap
      // 0ec: aastore
      // 0ed: ldc2_w -7472827439566241221
      // 0f0: lload 3
      // 0f1: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: astore 40
      // 0f8: new com/zelix/db
      // 0fb: dup
      // 0fc: lload 7
      // 0fe: invokespecial com/zelix/db.<init> (J)V
      // 101: astore 41
      // 103: astore 39
      // 105: aload 41
      // 107: lload 9
      // 109: aload 40
      // 10b: bipush 2
      // 10c: anewarray 271
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 1
      // 112: swap
      // 113: aastore
      // 114: dup_x2
      // 115: dup_x2
      // 116: pop
      // 117: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11a: bipush 0
      // 11b: swap
      // 11c: aastore
      // 11d: ldc2_w -8790029389336762029
      // 120: lload 3
      // 121: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: aload 41
      // 128: iload 32
      // 12a: i2s
      // 12b: iload 33
      // 12d: iload 34
      // 12f: i2s
      // 130: invokevirtual com/zelix/db.V (SIS)Z
      // 133: ifne 503
      // 136: aload 41
      // 138: lload 11
      // 13a: invokevirtual com/zelix/db.p (J)Ljava/lang/Object;
      // 13d: checkcast com/zelix/yn
      // 140: astore 42
      // 142: aload 42
      // 144: lload 15
      // 146: bipush 1
      // 147: anewarray 271
      // 14a: dup_x2
      // 14b: dup_x2
      // 14c: pop
      // 14d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 150: bipush 0
      // 151: swap
      // 152: aastore
      // 153: ldc2_w -8847709384769120557
      // 156: lload 3
      // 157: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: aload 39
      // 15e: lload 3
      // 15f: lconst_0
      // 160: lcmp
      // 161: ifle 1bc
      // 164: ifnonnull 1ba
      // 167: ifeq 4fe
      // 16a: goto 177
      // 16d: ldc2_w -7074381529077773159
      // 170: lload 3
      // 171: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: aload 0
      // 178: aload 42
      // 17a: ldc2_w -7449275623859889223
      // 17d: lload 3
      // 17e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: aload 2
      // 184: aload 5
      // 186: lload 21
      // 188: bipush 4
      // 189: anewarray 271
      // 18c: dup_x2
      // 18d: dup_x2
      // 18e: pop
      // 18f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 192: bipush 3
      // 193: swap
      // 194: aastore
      // 195: dup_x1
      // 196: swap
      // 197: bipush 2
      // 198: swap
      // 199: aastore
      // 19a: dup_x1
      // 19b: swap
      // 19c: bipush 1
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 0
      // 1a2: swap
      // 1a3: aastore
      // 1a4: ldc2_w -8979182102790572531
      // 1a7: lload 3
      // 1a8: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: goto 1ba
      // 1b0: ldc2_w -7074381529077773159
      // 1b3: lload 3
      // 1b4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: aload 39
      // 1bc: ifnonnull 1d1
      // 1bf: ifne 4fe
      // 1c2: goto 1cf
      // 1c5: ldc2_w -7074381529077773159
      // 1c8: lload 3
      // 1c9: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: iload 6
      // 1d1: bipush 1
      // 1d2: if_icmpeq 4fe
      // 1d5: aload 42
      // 1d7: lload 28
      // 1d9: bipush 1
      // 1da: anewarray 271
      // 1dd: dup_x2
      // 1de: dup_x2
      // 1df: pop
      // 1e0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e3: bipush 0
      // 1e4: swap
      // 1e5: aastore
      // 1e6: ldc2_w -8964808192484360736
      // 1e9: lload 3
      // 1ea: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/yn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: astore 43
      // 1f1: aload 43
      // 1f3: aload 39
      // 1f5: ifnonnull 37d
      // 1f8: ifnull 363
      // 1fb: goto 208
      // 1fe: ldc2_w -7074381529077773159
      // 201: lload 3
      // 202: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: athrow
      // 208: aload 43
      // 20a: aload 39
      // 20c: ifnonnull 37d
      // 20f: goto 21c
      // 212: ldc2_w -7074381529077773159
      // 215: lload 3
      // 216: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: lload 26
      // 21e: bipush 1
      // 21f: anewarray 271
      // 222: dup_x2
      // 223: dup_x2
      // 224: pop
      // 225: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 228: bipush 0
      // 229: swap
      // 22a: aastore
      // 22b: ldc2_w -8696254591439663861
      // 22e: lload 3
      // 22f: lload 3
      // 230: lconst_0
      // 231: lcmp
      // 232: ifle 378
      // 235: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: ifeq 363
      // 23d: goto 24a
      // 240: ldc2_w -7074381529077773159
      // 243: lload 3
      // 244: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: aload 2
      // 24b: aload 43
      // 24d: iload 23
      // 24f: i2s
      // 250: iload 24
      // 252: iload 25
      // 254: i2s
      // 255: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 258: lload 17
      // 25a: dup2_x1
      // 25b: pop2
      // 25c: bipush 2
      // 25d: anewarray 271
      // 260: dup_x1
      // 261: swap
      // 262: bipush 1
      // 263: swap
      // 264: aastore
      // 265: dup_x2
      // 266: dup_x2
      // 267: pop
      // 268: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26b: bipush 0
      // 26c: swap
      // 26d: aastore
      // 26e: ldc2_w -8694051380108703234
      // 271: lload 3
      // 272: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: ifne 363
      // 27a: goto 287
      // 27d: ldc2_w -7074381529077773159
      // 280: lload 3
      // 281: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: athrow
      // 287: aload 5
      // 289: aload 39
      // 28b: lload 3
      // 28c: lconst_0
      // 28d: lcmp
      // 28e: iflt 2d4
      // 291: ifnonnull 2b3
      // 294: goto 2a1
      // 297: ldc2_w -7074381529077773159
      // 29a: lload 3
      // 29b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: ifnull 2e0
      // 2a4: goto 2b1
      // 2a7: ldc2_w -7074381529077773159
      // 2aa: lload 3
      // 2ab: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: athrow
      // 2b1: aload 5
      // 2b3: aload 43
      // 2b5: ldc2_w -7153405670073259220
      // 2b8: lload 3
      // 2b9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: lload 35
      // 2c0: dup2_x1
      // 2c1: pop2
      // 2c2: bipush 2
      // 2c3: anewarray 271
      // 2c6: dup_x1
      // 2c7: swap
      // 2c8: bipush 1
      // 2c9: swap
      // 2ca: aastore
      // 2cb: dup_x2
      // 2cc: dup_x2
      // 2cd: pop
      // 2ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d1: bipush 0
      // 2d2: swap
      // 2d3: aastore
      // 2d4: ldc2_w -9060529255506279366
      // 2d7: lload 3
      // 2d8: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: ifne 363
      // 2e0: new java/lang/StringBuilder
      // 2e3: dup
      // 2e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2e7: sipush 15777
      // 2ea: ldc2_w 613656628775711616
      // 2ed: lload 3
      // 2ee: lxor
      // 2ef: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f7: aload 42
      // 2f9: ldc2_w -7153405670073259220
      // 2fc: lload 3
      // 2fd: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 305: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 308: sipush 15985
      // 30b: ldc2_w 3741298374837497920
      // 30e: lload 3
      // 30f: lxor
      // 310: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 318: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 31b: astore 44
      // 31d: aload 2
      // 31e: aload 43
      // 320: iload 23
      // 322: i2s
      // 323: iload 24
      // 325: iload 25
      // 327: i2s
      // 328: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 32b: aload 44
      // 32d: bipush 1
      // 32e: lload 13
      // 330: bipush 4
      // 331: anewarray 271
      // 334: dup_x2
      // 335: dup_x2
      // 336: pop
      // 337: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33a: bipush 3
      // 33b: swap
      // 33c: aastore
      // 33d: dup_x1
      // 33e: swap
      // 33f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 342: bipush 2
      // 343: swap
      // 344: aastore
      // 345: dup_x1
      // 346: swap
      // 347: bipush 1
      // 348: swap
      // 349: aastore
      // 34a: dup_x1
      // 34b: swap
      // 34c: bipush 0
      // 34d: swap
      // 34e: aastore
      // 34f: ldc2_w -8902952440706001326
      // 352: lload 3
      // 353: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 358: pop
      // 359: aload 41
      // 35b: aload 43
      // 35d: lload 19
      // 35f: invokevirtual com/zelix/db.J (Ljava/lang/Object;J)Z
      // 362: pop
      // 363: aload 42
      // 365: lload 37
      // 367: bipush 1
      // 368: anewarray 271
      // 36b: dup_x2
      // 36c: dup_x2
      // 36d: pop
      // 36e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 371: bipush 0
      // 372: swap
      // 373: aastore
      // 374: ldc2_w -9038953539246947206
      // 377: lload 3
      // 378: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/yn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: astore 44
      // 37f: aload 44
      // 381: aload 39
      // 383: lload 3
      // 384: lconst_0
      // 385: lcmp
      // 386: ifle 3a6
      // 389: ifnonnull 39e
      // 38c: ifnull 4fe
      // 38f: goto 39c
      // 392: ldc2_w -7074381529077773159
      // 395: lload 3
      // 396: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: athrow
      // 39c: aload 44
      // 39e: lload 3
      // 39f: lconst_0
      // 3a0: lcmp
      // 3a1: iflt 3e0
      // 3a4: aload 39
      // 3a6: ifnonnull 3e0
      // 3a9: lload 26
      // 3ab: bipush 1
      // 3ac: anewarray 271
      // 3af: dup_x2
      // 3b0: dup_x2
      // 3b1: pop
      // 3b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b5: bipush 0
      // 3b6: swap
      // 3b7: aastore
      // 3b8: ldc2_w -8696254591439663861
      // 3bb: lload 3
      // 3bc: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c1: ifeq 4fe
      // 3c4: goto 3d1
      // 3c7: ldc2_w -7074381529077773159
      // 3ca: lload 3
      // 3cb: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d0: athrow
      // 3d1: aload 44
      // 3d3: goto 3e0
      // 3d6: ldc2_w -7074381529077773159
      // 3d9: lload 3
      // 3da: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3df: athrow
      // 3e0: aload 43
      // 3e2: if_acmpeq 4fe
      // 3e5: aload 2
      // 3e6: aload 44
      // 3e8: iload 23
      // 3ea: i2s
      // 3eb: iload 24
      // 3ed: iload 25
      // 3ef: i2s
      // 3f0: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 3f3: lload 17
      // 3f5: dup2_x1
      // 3f6: pop2
      // 3f7: bipush 2
      // 3f8: anewarray 271
      // 3fb: dup_x1
      // 3fc: swap
      // 3fd: bipush 1
      // 3fe: swap
      // 3ff: aastore
      // 400: dup_x2
      // 401: dup_x2
      // 402: pop
      // 403: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 406: bipush 0
      // 407: swap
      // 408: aastore
      // 409: ldc2_w -8694051380108703234
      // 40c: lload 3
      // 40d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 412: ifne 4fe
      // 415: goto 422
      // 418: ldc2_w -7074381529077773159
      // 41b: lload 3
      // 41c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 421: athrow
      // 422: aload 5
      // 424: aload 39
      // 426: lload 3
      // 427: lconst_0
      // 428: lcmp
      // 429: ifle 46f
      // 42c: ifnonnull 44e
      // 42f: goto 43c
      // 432: ldc2_w -7074381529077773159
      // 435: lload 3
      // 436: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43b: athrow
      // 43c: ifnull 47b
      // 43f: goto 44c
      // 442: ldc2_w -7074381529077773159
      // 445: lload 3
      // 446: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: athrow
      // 44c: aload 5
      // 44e: aload 44
      // 450: ldc2_w -7153405670073259220
      // 453: lload 3
      // 454: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 459: lload 35
      // 45b: dup2_x1
      // 45c: pop2
      // 45d: bipush 2
      // 45e: anewarray 271
      // 461: dup_x1
      // 462: swap
      // 463: bipush 1
      // 464: swap
      // 465: aastore
      // 466: dup_x2
      // 467: dup_x2
      // 468: pop
      // 469: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 46c: bipush 0
      // 46d: swap
      // 46e: aastore
      // 46f: ldc2_w -9060529255506279366
      // 472: lload 3
      // 473: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 478: ifne 4fe
      // 47b: new java/lang/StringBuilder
      // 47e: dup
      // 47f: invokespecial java/lang/StringBuilder.<init> ()V
      // 482: sipush 16278
      // 485: ldc2_w 1082858769316278690
      // 488: lload 3
      // 489: lxor
      // 48a: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 492: aload 42
      // 494: ldc2_w -7153405670073259220
      // 497: lload 3
      // 498: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49d: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 4a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a3: sipush 8496
      // 4a6: ldc2_w 1622555802240610068
      // 4a9: lload 3
      // 4aa: lxor
      // 4ab: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4b6: astore 45
      // 4b8: aload 2
      // 4b9: aload 44
      // 4bb: iload 23
      // 4bd: i2s
      // 4be: iload 24
      // 4c0: iload 25
      // 4c2: i2s
      // 4c3: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 4c6: aload 45
      // 4c8: bipush 1
      // 4c9: lload 13
      // 4cb: bipush 4
      // 4cc: anewarray 271
      // 4cf: dup_x2
      // 4d0: dup_x2
      // 4d1: pop
      // 4d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d5: bipush 3
      // 4d6: swap
      // 4d7: aastore
      // 4d8: dup_x1
      // 4d9: swap
      // 4da: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4dd: bipush 2
      // 4de: swap
      // 4df: aastore
      // 4e0: dup_x1
      // 4e1: swap
      // 4e2: bipush 1
      // 4e3: swap
      // 4e4: aastore
      // 4e5: dup_x1
      // 4e6: swap
      // 4e7: bipush 0
      // 4e8: swap
      // 4e9: aastore
      // 4ea: ldc2_w -8902952440706001326
      // 4ed: lload 3
      // 4ee: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f3: pop
      // 4f4: aload 41
      // 4f6: aload 44
      // 4f8: lload 19
      // 4fa: invokevirtual com/zelix/db.J (Ljava/lang/Object;J)Z
      // 4fd: pop
      // 4fe: aload 39
      // 500: ifnull 126
      // 503: return
   }

   void R(Object[] var1) {
      long var2 = (Long)var1[0];
      _zk var4 = (_zk)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 40803773097758L;
      long var7 = var2 ^ 121085879440151L;
      long var9 = var2 ^ 129677877671895L;
      long var11 = var2 ^ 125101689675798L;
      long var13 = var2 ^ 8586375300073L;
      long var15 = var2 ^ 125599067859255L;

      try {
         pg var17 = new pg(var15);

         try {
            if (!x44.a<"j">(
               x44.a<"n">(this, -1605564118463075636L, var2),
               new Object[]{var17, var9, x44.a<"n">(this, -1356138373236385489L, var2)},
               -638043823050084738L,
               var2
            )) {
               x44.a<"j">(
                  var4,
                  new Object[]{b<"s">(4258, 697794047355499778L ^ var2), var11, b<"s">(22410, 2872627916008157752L ^ var2), (String)var17.G()},
                  -1378252314546718927L,
                  var2
               );
            }
         } catch (_sz var18) {
            throw x44.a<"r">(var18, -699000216354920697L, var2);
         }
      } catch (_sz var19) {
         x44.a<"j">(
            var4,
            new Object[]{
               b<"s">(26525, 7155538740869775908L ^ var2),
               "'" + x44.a<"j">(var19, new Object[]{var13}, -1144261692004632494L, var2) + b<"s">(22453, 4238164066980065798L ^ var2),
               var5
            },
            -638351814322593703L,
            var2
         );
      } catch (_s8 var20) {
         x44.a<"j">(
            var4, new Object[]{b<"s">(18953, 4373118202518073252L ^ var2), var7, x44.a<"j">(var20, -1598115069287456899L, var2)}, -706480317855484477L, var2
         );
      }
   }

   boolean y(Object[] param1) {
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
      // 004: checkcast com/zelix/_8z
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_8z
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/a9
      // 020: astore 4
      // 022: pop
      // 023: getstatic com/zelix/_8o.a J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 64278249935384
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 6772185811689
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 36937931453432
      // 03f: lxor
      // 040: lstore 11
      // 042: dup2
      // 043: ldc2_w 68496417849052
      // 046: lxor
      // 047: lstore 13
      // 049: dup2
      // 04a: ldc2_w 85947756358332
      // 04d: lxor
      // 04e: lstore 15
      // 050: dup2
      // 051: ldc2_w 44348785436739
      // 054: lxor
      // 055: dup2
      // 056: bipush 32
      // 058: lushr
      // 059: l2i
      // 05a: istore 17
      // 05c: dup2
      // 05d: bipush 32
      // 05f: lshl
      // 060: bipush 56
      // 062: lushr
      // 063: l2i
      // 064: istore 18
      // 066: dup2
      // 067: bipush 40
      // 069: lshl
      // 06a: bipush 40
      // 06c: lushr
      // 06d: l2i
      // 06e: istore 19
      // 070: pop2
      // 071: dup2
      // 072: ldc2_w 89886962161457
      // 075: lxor
      // 076: lstore 20
      // 078: dup2
      // 079: ldc2_w 41485543014095
      // 07c: lxor
      // 07d: lstore 22
      // 07f: pop2
      // 080: ldc2_w -8529522082321721927
      // 083: lload 5
      // 085: invokedynamic u (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: bipush 0
      // 08b: istore 25
      // 08d: astore 24
      // 08f: iload 25
      // 091: aload 0
      // 092: ldc2_w -7856723965374054428
      // 095: lload 5
      // 097: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: arraylength
      // 09d: if_icmpge 154
      // 0a0: aload 0
      // 0a1: ldc2_w -7856723965374054428
      // 0a4: lload 5
      // 0a6: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: iload 25
      // 0ad: aaload
      // 0ae: lload 7
      // 0b0: invokevirtual com/zelix/hy.k (J)Ljava/lang/String;
      // 0b3: astore 26
      // 0b5: aload 0
      // 0b6: ldc2_w -7856723965374054428
      // 0b9: lload 5
      // 0bb: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: iload 25
      // 0c2: aaload
      // 0c3: lload 11
      // 0c5: bipush 1
      // 0c6: anewarray 271
      // 0c9: dup_x2
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: bipush 0
      // 0d0: swap
      // 0d1: aastore
      // 0d2: ldc2_w -8414860059124045826
      // 0d5: lload 5
      // 0d7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/yd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: aload 24
      // 0de: ifnonnull 198
      // 0e1: astore 27
      // 0e3: aload 27
      // 0e5: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 0ea: ifeq 14c
      // 0ed: aload 27
      // 0ef: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 0f4: checkcast com/zelix/ir
      // 0f7: astore 28
      // 0f9: aload 28
      // 0fb: lload 9
      // 0fd: invokevirtual com/zelix/ir.r (J)Lcom/zelix/s3;
      // 100: astore 29
      // 102: aload 3
      // 103: aload 26
      // 105: aload 29
      // 107: aload 29
      // 109: iload 17
      // 10b: iload 18
      // 10d: i2b
      // 10e: iload 19
      // 110: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 113: pop
      // 114: aload 2
      // 115: aload 26
      // 117: aload 29
      // 119: aload 29
      // 11b: iload 17
      // 11d: iload 18
      // 11f: i2b
      // 120: iload 19
      // 122: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 125: pop
      // 126: aload 24
      // 128: lload 5
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: iflt 151
      // 12f: ifnonnull 14f
      // 132: aload 24
      // 134: ifnull 0e3
      // 137: lload 5
      // 139: lconst_0
      // 13a: lcmp
      // 13b: iflt 126
      // 13e: goto 14c
      // 141: ldc2_w -7650544719233153896
      // 144: lload 5
      // 146: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: iinc 25 1
      // 14f: aload 24
      // 151: ifnull 08f
      // 154: bipush 0
      // 155: lload 5
      // 157: lconst_0
      // 158: lcmp
      // 159: ifle 304
      // 15c: aload 24
      // 15e: ifnonnull 304
      // 161: istore 25
      // 163: aload 4
      // 165: lload 5
      // 167: lconst_0
      // 168: lcmp
      // 169: ifle 171
      // 16c: ifnull 302
      // 16f: aload 4
      // 171: lload 20
      // 173: bipush 1
      // 174: anewarray 271
      // 177: dup_x2
      // 178: dup_x2
      // 179: pop
      // 17a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17d: bipush 0
      // 17e: swap
      // 17f: aastore
      // 180: ldc2_w -8139737879802823971
      // 183: lload 5
      // 185: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: goto 198
      // 18d: ldc2_w -7650544719233153896
      // 190: lload 5
      // 192: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: astore 26
      // 19a: aload 26
      // 19c: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 1a1: ifeq 302
      // 1a4: aload 26
      // 1a6: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 1ab: checkcast java/lang/String
      // 1ae: astore 27
      // 1b0: aload 3
      // 1b1: aload 27
      // 1b3: invokevirtual com/zelix/_8z.g (Ljava/lang/Object;)Z
      // 1b6: aload 24
      // 1b8: ifnonnull 304
      // 1bb: ifne 2fd
      // 1be: goto 1cc
      // 1c1: ldc2_w -7650544719233153896
      // 1c4: lload 5
      // 1c6: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: aload 4
      // 1ce: aload 27
      // 1d0: lload 22
      // 1d2: bipush 2
      // 1d3: anewarray 271
      // 1d6: dup_x2
      // 1d7: dup_x2
      // 1d8: pop
      // 1d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dc: bipush 1
      // 1dd: swap
      // 1de: aastore
      // 1df: dup_x1
      // 1e0: swap
      // 1e1: bipush 0
      // 1e2: swap
      // 1e3: aastore
      // 1e4: ldc2_w -7618427224243443379
      // 1e7: lload 5
      // 1e9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: astore 28
      // 1f0: bipush 0
      // 1f1: istore 29
      // 1f3: iload 29
      // 1f5: aload 28
      // 1f7: invokeinterface java/util/List.size ()I 1
      // 1fc: if_icmpge 2c9
      // 1ff: aload 28
      // 201: iload 29
      // 203: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 208: checkcast com/zelix/wo
      // 20b: astore 30
      // 20d: aload 30
      // 20f: invokevirtual com/zelix/wo.v ()Ljava/lang/Object;
      // 212: checkcast com/zelix/s3
      // 215: astore 31
      // 217: aload 30
      // 219: invokevirtual com/zelix/wo.G ()Ljava/lang/Object;
      // 21c: checkcast com/zelix/s3
      // 21f: astore 32
      // 221: aload 3
      // 222: aload 27
      // 224: aload 31
      // 226: aload 32
      // 228: iload 17
      // 22a: iload 18
      // 22c: i2b
      // 22d: iload 19
      // 22f: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 232: pop
      // 233: aload 2
      // 234: aload 27
      // 236: aload 32
      // 238: aload 31
      // 23a: iload 17
      // 23c: iload 18
      // 23e: i2b
      // 23f: iload 19
      // 241: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 244: pop
      // 245: aload 24
      // 247: lload 5
      // 249: lconst_0
      // 24a: lcmp
      // 24b: ifle 2c6
      // 24e: ifnonnull 2c4
      // 251: iload 25
      // 253: aload 24
      // 255: ifnonnull 1a1
      // 258: lload 5
      // 25a: lconst_0
      // 25b: lcmp
      // 25c: ifle 1b6
      // 25f: goto 26d
      // 262: ldc2_w -7650544719233153896
      // 265: lload 5
      // 267: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: lload 5
      // 26f: lconst_0
      // 270: lcmp
      // 271: iflt 29a
      // 274: ifne 2c1
      // 277: aload 31
      // 279: bipush 0
      // 27a: anewarray 271
      // 27d: ldc2_w -7999745244689249155
      // 280: lload 5
      // 282: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: aload 32
      // 289: bipush 0
      // 28a: anewarray 271
      // 28d: ldc2_w -7999745244689249155
      // 290: lload 5
      // 292: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 29a: aload 24
      // 29c: ifnonnull 2bf
      // 29f: goto 2ad
      // 2a2: ldc2_w -7650544719233153896
      // 2a5: lload 5
      // 2a7: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ac: athrow
      // 2ad: ifne 2c1
      // 2b0: goto 2be
      // 2b3: ldc2_w -7650544719233153896
      // 2b6: lload 5
      // 2b8: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: bipush 1
      // 2bf: istore 25
      // 2c1: iinc 29 1
      // 2c4: aload 24
      // 2c6: ifnull 1f3
      // 2c9: lload 13
      // 2cb: aload 27
      // 2cd: invokestatic com/zelix/yn.x (JLjava/lang/String;)Lcom/zelix/hz;
      // 2d0: checkcast com/zelix/hu
      // 2d3: astore 29
      // 2d5: aload 29
      // 2d7: lload 5
      // 2d9: lconst_0
      // 2da: lcmp
      // 2db: ifle 1ab
      // 2de: aload 3
      // 2df: lload 15
      // 2e1: bipush 2
      // 2e2: anewarray 271
      // 2e5: dup_x2
      // 2e6: dup_x2
      // 2e7: pop
      // 2e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2eb: bipush 1
      // 2ec: swap
      // 2ed: aastore
      // 2ee: dup_x1
      // 2ef: swap
      // 2f0: bipush 0
      // 2f1: swap
      // 2f2: aastore
      // 2f3: ldc2_w -7710412310747745774
      // 2f6: lload 5
      // 2f8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: aload 24
      // 2ff: ifnull 19a
      // 302: iload 25
      // 304: ireturn
   }

   hz[] n(Object[] param1) {
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
      // 004: checkcast com/zelix/a9
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/_8o.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 76791153329776
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 90837013104105
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 99203789092972
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 117519907589907
      // 033: lxor
      // 034: lstore 11
      // 036: dup2
      // 037: ldc2_w 67057568077547
      // 03a: lxor
      // 03b: lstore 13
      // 03d: dup2
      // 03e: ldc2_w 29386798216291
      // 041: lxor
      // 042: lstore 15
      // 044: pop2
      // 045: ldc2_w -2704658281933158801
      // 048: lload 3
      // 049: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 2
      // 04f: lload 15
      // 051: bipush 1
      // 052: anewarray 271
      // 055: dup_x2
      // 056: dup_x2
      // 057: pop
      // 058: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05b: bipush 0
      // 05c: swap
      // 05d: aastore
      // 05e: ldc2_w -4390677980172868717
      // 061: lload 3
      // 062: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: astore 18
      // 069: new java/util/ArrayList
      // 06c: dup
      // 06d: invokespecial java/util/ArrayList.<init> ()V
      // 070: astore 19
      // 072: astore 17
      // 074: bipush 0
      // 075: istore 20
      // 077: iload 20
      // 079: aload 18
      // 07b: invokeinterface java/util/List.size ()I 1
      // 080: if_icmpge 1d7
      // 083: aload 18
      // 085: iload 20
      // 087: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 08c: checkcast java/lang/String
      // 08f: astore 21
      // 091: sipush 6865
      // 094: ldc2_w 3880416181260390192
      // 097: lload 3
      // 098: lxor
      // 099: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: astore 22
      // 0a0: aload 0
      // 0a1: ldc2_w -2492886376273729178
      // 0a4: lload 3
      // 0a5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_ug; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: aload 21
      // 0ac: aload 22
      // 0ae: lload 7
      // 0b0: bipush 3
      // 0b1: anewarray 271
      // 0b4: dup_x2
      // 0b5: dup_x2
      // 0b6: pop
      // 0b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ba: bipush 2
      // 0bb: swap
      // 0bc: aastore
      // 0bd: dup_x1
      // 0be: swap
      // 0bf: bipush 1
      // 0c0: swap
      // 0c1: aastore
      // 0c2: dup_x1
      // 0c3: swap
      // 0c4: bipush 0
      // 0c5: swap
      // 0c6: aastore
      // 0c7: ldc2_w -4071800430975127095
      // 0ca: lload 3
      // 0cb: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: astore 23
      // 0d2: aload 17
      // 0d4: lload 3
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 1d4
      // 0da: ifnonnull 1d2
      // 0dd: aload 23
      // 0df: invokevirtual com/zelix/hz.b ()Z
      // 0e2: aload 17
      // 0e4: ifnonnull 1ee
      // 0e7: goto 0f4
      // 0ea: ldc2_w -4177689707443038386
      // 0ed: lload 3
      // 0ee: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: ifne 1cf
      // 0f7: goto 104
      // 0fa: ldc2_w -4177689707443038386
      // 0fd: lload 3
      // 0fe: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 0
      // 105: ldc2_w -2698296974007544607
      // 108: lload 3
      // 109: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: aload 17
      // 110: ifnonnull 1ce
      // 113: goto 120
      // 116: ldc2_w -4177689707443038386
      // 119: lload 3
      // 11a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: ifeq 1c4
      // 123: goto 130
      // 126: ldc2_w -4177689707443038386
      // 129: lload 3
      // 12a: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 2
      // 131: new java/lang/StringBuilder
      // 134: dup
      // 135: invokespecial java/lang/StringBuilder.<init> ()V
      // 138: sipush 30810
      // 13b: ldc2_w 4641884651672038819
      // 13e: lload 3
      // 13f: lxor
      // 140: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: aload 23
      // 14a: lload 5
      // 14c: bipush 1
      // 14d: anewarray 271
      // 150: dup_x2
      // 151: dup_x2
      // 152: pop
      // 153: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 156: bipush 0
      // 157: swap
      // 158: aastore
      // 159: ldc2_w -2488578520625722916
      // 15c: lload 3
      // 15d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: sipush 21311
      // 168: ldc2_w 1109668376222844611
      // 16b: lload 3
      // 16c: lxor
      // 16d: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 175: aload 23
      // 177: lload 9
      // 179: ldc2_w -4060221241572309851
      // 17c: lload 3
      // 17d: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 185: sipush 18325
      // 188: ldc2_w 1647381112095068772
      // 18b: lload 3
      // 18c: lxor
      // 18d: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/_8o.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 195: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 198: lload 13
      // 19a: dup2_x1
      // 19b: pop2
      // 19c: bipush 2
      // 19d: anewarray 271
      // 1a0: dup_x1
      // 1a1: swap
      // 1a2: bipush 1
      // 1a3: swap
      // 1a4: aastore
      // 1a5: dup_x2
      // 1a6: dup_x2
      // 1a7: pop
      // 1a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ab: bipush 0
      // 1ac: swap
      // 1ad: aastore
      // 1ae: ldc2_w -2713924285820676960
      // 1b1: lload 3
      // 1b2: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: goto 1c4
      // 1ba: ldc2_w -4177689707443038386
      // 1bd: lload 3
      // 1be: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: aload 19
      // 1c6: aload 23
      // 1c8: checkcast com/zelix/hu
      // 1cb: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1ce: pop
      // 1cf: iinc 20 1
      // 1d2: aload 17
      // 1d4: ifnull 077
      // 1d7: aload 0
      // 1d8: ldc2_w -4530238135656256462
      // 1db: lload 3
      // 1dc: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: arraylength
      // 1e2: lload 3
      // 1e3: lconst_0
      // 1e4: lcmp
      // 1e5: ifle 1ee
      // 1e8: aload 19
      // 1ea: invokevirtual java/util/ArrayList.size ()I
      // 1ed: iadd
      // 1ee: anewarray 679
      // 1f1: astore 20
      // 1f3: aload 19
      // 1f5: aload 20
      // 1f7: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 1fa: pop
      // 1fb: aload 0
      // 1fc: ldc2_w -4530238135656256462
      // 1ff: lload 3
      // 200: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: bipush 0
      // 206: aload 20
      // 208: aload 19
      // 20a: invokevirtual java/util/ArrayList.size ()I
      // 20d: aload 0
      // 20e: ldc2_w -4530238135656256462
      // 211: lload 3
      // 212: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: arraylength
      // 218: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 21b: aload 0
      // 21c: ldc2_w -2738582572151465339
      // 21f: lload 3
      // 220: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/pd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: aload 20
      // 227: lload 11
      // 229: bipush 2
      // 22a: anewarray 271
      // 22d: dup_x2
      // 22e: dup_x2
      // 22f: pop
      // 230: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 233: bipush 1
      // 234: swap
      // 235: aastore
      // 236: dup_x1
      // 237: swap
      // 238: bipush 0
      // 239: swap
      // 23a: aastore
      // 23b: ldc2_w -2673229799097891941
      // 23e: lload 3
      // 23f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: aload 20
      // 246: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   void A(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 70994934453326L;
      long var7 = var3 ^ 76463412011558L;
      long var9 = var3 ^ 103638845562929L;
      hk[] var10000 = x44.a<"t">(7336370138471070152L, var3);
      hy[] var12 = x44.a<"h">(this, 9117051671096087445L, var3);
      hk[] var11 = var10000;
      int var13 = var12.length;
      int var14 = 0;

      while (var14 < var13) {
         hy var15 = var12[var14];

         label67: {
            label66: {
               label76: {
                  try {
                     Object[] var10004 = new Object[]{null, var2};
                     var10004[0] = var9;
                     x44.a<"l">(var15, var10004, 7294117755300457466L, var3);
                     var10000 = var11;
                     if (var3 < 0L) {
                        break label67;
                     }

                     if (var11 != null) {
                        break label66;
                     }

                     if (!var15.B(var5)) {
                        break label76;
                     }
                  } catch (gj var20) {
                     throw x44.a<"t">(var20, 8764786637711010025L, var3);
                  }

                  label59:
                  for (hz var17 : x44.a<"l">(var15, new Object[]{var7}, 8669865206007709203L, var3)) {
                     try {
                        hy var24 = (hy)var17;
                        Object[] var27 = new Object[]{null, var2};
                        var27[0] = var9;
                        x44.a<"l">(var24, var27, 7294117755300457466L, var3);
                     } catch (gj var18) {
                        boolean var10001 = false;
                        throw x44.a<"t">(var18, 8764786637711010025L, var3);
                     }

                     while (true) {
                        try {
                           var10000 = var11;
                           if (var3 >= 0L) {
                              if (var11 != null) {
                                 break label66;
                              }

                              var10000 = var11;
                           }

                           if (var10000 == null) {
                              break;
                           }
                        } catch (gj var19) {
                           boolean var26 = false;
                           throw x44.a<"t">(var19, 8764786637711010025L, var3);
                        }

                        if (var3 >= 0L) {
                           break label59;
                        }
                     }
                  }
               }

               var14++;
            }

            var10000 = var11;
         }

         if (var10000 != null) {
            break;
         }
      }
   }

   static {
      long var0 = a ^ 134953508275483L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[28];
      int var7 = 0;
      String var6 = "Í £w\u0017Ó\u009e.9w\u0014A¸\u008b }YA\u0082û\u00893nä\u0010ÿXÇ\u009dùÎfÑS.N\u0090+M\u001f-@\u0016y-`\u0012ÀÛe'*\u0084\u0088² G\u009f3©\u0014\u0006¼\u008eç|-«ºâHDíkH7Ã\u000e_Guô\u0089j\u0087¥\u0089×\u0090\u001dÕb±]\u0096l\u000f7°D¬\u0006\u008e\u0002Æx(ÜMião\u0001\u0003§²Jü½Ìbfn½4\u0003Ô=\u0090\u00123ô_õ\u009d]Yb\u0011\u0086\u000eÚÆdL\u007fß\u0010;iÊ|®ÛÛµ\u0019y\u0007|j³©-8W\u0083\u008f¤¤Åú}\n\"\u0090}â¼\u008fr³\u00ad\u000f`tÏø\u0080\u0012t×þó^Â9ð..e|Ø\u0089\u008e\u0089ßX!´+\u009dA÷ú±\b\u001f\u009bÙüHÐ$\u0081\u0017T\u009f\u000eÁ\u0085\u001bl#Y8·U{?î¹¼ßä\u0010ø\u0016ÆµNÄ\\ë\u0081Åü\u0089ì2¡<\u0013õe \u00ad¨\u001b»`=m\u0097K¬\u0089ÆcÑÒ=\u0085á<\u0098ñ3ömW\u0097\u0086¸`\u0018#\u0006Î¸\u0087Ô ÒDE¯²ìÑ\u009a\u008et\"_'.\u0081\u0090¥¹Òh\\¶&`\u0086\u0097¡\u008de'\u0098\u0019\u009f¦µô}²öhà±[\u008eõÄ\u008dëÂ³F\u0017¶\r\u008f*\r\nX\u0093¼\u0088\fËû\u0084ã»¥`\fà\u008cGSVæZ]69Õù\u000fçN\u0094¶x\u0011¥âº\u0016^ï\u0080ò1\bVÈé\u001fùa\u0019ÄM'_È8ÊñÅR°Ý\r_Åû¤Rñ^\u0091\u009ce\u0000 ª¬¦\u0007\u001d\u001f|\u0018Ê/¥*Þç¼IûÑE%æ\u0081È¶\u009eèg·×=_ÛyRm\u009aÈà\u008b\u0004ÿ>&ä\u0089\u0000Ç¾ØGÞ*\u0089y\n\u0092zìB\u0007Ï\u0016ö)}^\u009a}_Ñ¥R\u007fFiÈ«\u0010yã\u008dÊ´\u0097\u00adln\u009a\u008aT9\u0088Ý\u0005Ĉ\u0014ó~\nJ\u00919Y\u0095\bR\u0019\u0086úQ\u0004¼\u008fØX¥FL\u0082[ÖÓ{,lhL\u0085Kçû\u0082Dâ\u009f\u009aÒJ1ð\u0017nÃ\u009fíã\u0099Ô\u0088çP¾`@ñ\u000e;\u0013\u0019\u009cch²³æcî\u008cÉÅüB¯-l ´ê\u001a[ß¢\b\u0015xËZuâJÒ¸ü»\u0085`ÝØkÖ£KÛT\u0004\u0087=\u000f\u0006)ÛÜÜNÑÉÁ[¶´«\u001d\u000b©\\\u0092H<oX'à}H<¾´ß\u000f`a}\u0092³ fu3=Îa\u0011õ\\\u000b×i¬ä¢\u008dK¾\tÝ\u009eÉ\u008c \u0004F\u001eÓl\u0094\u001dæT\u0004TçèS%_+á¤\u009a´Ðd¼xp\u0005âÚ4-\u0012×Á'Î\u0085íúîÇ5äú\u0016·åá\u0004º'$Ö¢èñ\\ï\u001eÅ\u0081o¶_\u0090KÈ\u008fF÷³\u0016µÏ*õ\u0001\u001cã\u009ed¨²þG§É=ÈîPtQ7.\u000f\u0012<\u00ad¼Çµ»@\u0012Ýï8%\u0087\u001c¥½Øö]A\u0005-^cÐáQ+A\u0017ÇÚv\u000eÛï\u0016\u0085Ð÷ªÄT\u008ahþ\u001c\u000f\u0082\u0011Ò¢\u000b\f\u0096\u0000«ÐT\u001cÔoÈÒxÐ{4Õ\u0007\u000fÑ\reÈ\u001eÆle\rÞk\u000e\u0088`'ÌncN8§\u000bl1oé#Õ]\u008aÂI\u0088ãu\ràn\u0007÷\r\u0098Ïß(S8'ÇÊ\u001a\u0096W:\u008b]¢0\u0082\u0006Õév\u000e)ß@TkBs\u001dÂfIêS\u0019f&w\u0016rÖm[\u0017\u007fôv\nnþü\u0000i \u0004-s\u008fÙÌêä³\u00892¾h\u009fGÒ\u001b¾\u001eyu¯]\u0011\u001f\t£P\u0018ÒºW\u0081H±ò-GsÃ\u000bpî\u009fCEO»ïàCIµ\u0007Ü\u0091\u001cz¥Z\u001dKîÙN\u00893?\u0001ý=1kÔbtÔ\u0015ÈÍFö,Ö¢Ñ÷»Xò?\u0082×T@iG¥¾OXB»ëUoÙ\u0010\u008a\u0090]x~K¦]Ý½üM].\u001eÚ ÁãdÜÁQ\u001dÞé[;À\u0087f'Tÿ°ÚÙo¨®L\u0085\u009aÚ±.¸dþ(g\u0006ÑÃY\u0004\u001d\u0098±\u008dÜ\bL\u009f\u007fBqõ}|\u000b&\u0081Í27÷ªqÐ£Ìsü\u009eâ\u001aÛrô\u0010tD\u0083ªÕ+\u0017ZsPg«\u009aiP\u000f@ìäÅ@!\u0091##\u0088ô\u008d\u0091æ`W0Q£ÈA[El\u00927¡×< W÷Cëê\u0010jõ\u001c\u0098\u0000h\u009c°,\u0002BÁÐ\u0013Ä|\u0090å\u001aM²uPµä4Í/I(¡=»\u0088ëÝ\u001cì\u0016\u008dÄHA¬ÜO\u0096Ã\u0099'øF|\u0084æü(à\tÄ\u0085\u001b\u008f¹\u0002sý\u0096;\u0096PêR\u0019µ_0]\u0085H\u00ad71ÎN\t\r¯F\u0084[\u0086\u008aÕz*\u00ad¿éï6Ù©î¨a2\f¬_k\u000b\u0093@\u001e\u008dxÅ|\u0086Æ\u0007£\u0010)ü\u0089\u0088X>t\u008auØ\u0097ÿ\u0087\u0085v[Låð\b\u009cÁòôÿ5D\u0018\u0016ÈÌÖf~Ó;\u0083\u0099â?\u0095Ï8\u008c\u0088Fl\u0019 ªº\u0082\u0010\u009a\u0010\u000eÝµ\u0019\u0087\u0001ì\u0003\u00965\u001ae*\u0007(ÑX³ìáü\u0014ÿ\u0091Þ#¨ÑP\u0015\u009a°\u009cH6¨kB\u008c\u0002Gp»à\u0018\u007f\u001eð\u008aV.\u0091\u0083\u008c\u000f(\u0018ØW\u0097£§)e\u009c7åöx\u0000·\u0007T¿Ç\u007fIVK\u0001\f©ÓXæ[ïÖå\u0002cç|Ñ§\u00858\u0010ZªªÈ0\"ôKxª¿÷eD_\u0099°è\"\u001cÔ\u0089\f´éáÐ£ÔSÑmG>\u0010»Vw-~¿^á®\u001dóÂ\u0003m¿ÔöäF$\u0018ÅóéûÏÏôùU¬³¬KÇé\u009c\u0011'\u0019½x(×§";
      int var8 = "Í £w\u0017Ó\u009e.9w\u0014A¸\u008b }YA\u0082û\u00893nä\u0010ÿXÇ\u009dùÎfÑS.N\u0090+M\u001f-@\u0016y-`\u0012ÀÛe'*\u0084\u0088² G\u009f3©\u0014\u0006¼\u008eç|-«ºâHDíkH7Ã\u000e_Guô\u0089j\u0087¥\u0089×\u0090\u001dÕb±]\u0096l\u000f7°D¬\u0006\u008e\u0002Æx(ÜMião\u0001\u0003§²Jü½Ìbfn½4\u0003Ô=\u0090\u00123ô_õ\u009d]Yb\u0011\u0086\u000eÚÆdL\u007fß\u0010;iÊ|®ÛÛµ\u0019y\u0007|j³©-8W\u0083\u008f¤¤Åú}\n\"\u0090}â¼\u008fr³\u00ad\u000f`tÏø\u0080\u0012t×þó^Â9ð..e|Ø\u0089\u008e\u0089ßX!´+\u009dA÷ú±\b\u001f\u009bÙüHÐ$\u0081\u0017T\u009f\u000eÁ\u0085\u001bl#Y8·U{?î¹¼ßä\u0010ø\u0016ÆµNÄ\\ë\u0081Åü\u0089ì2¡<\u0013õe \u00ad¨\u001b»`=m\u0097K¬\u0089ÆcÑÒ=\u0085á<\u0098ñ3ömW\u0097\u0086¸`\u0018#\u0006Î¸\u0087Ô ÒDE¯²ìÑ\u009a\u008et\"_'.\u0081\u0090¥¹Òh\\¶&`\u0086\u0097¡\u008de'\u0098\u0019\u009f¦µô}²öhà±[\u008eõÄ\u008dëÂ³F\u0017¶\r\u008f*\r\nX\u0093¼\u0088\fËû\u0084ã»¥`\fà\u008cGSVæZ]69Õù\u000fçN\u0094¶x\u0011¥âº\u0016^ï\u0080ò1\bVÈé\u001fùa\u0019ÄM'_È8ÊñÅR°Ý\r_Åû¤Rñ^\u0091\u009ce\u0000 ª¬¦\u0007\u001d\u001f|\u0018Ê/¥*Þç¼IûÑE%æ\u0081È¶\u009eèg·×=_ÛyRm\u009aÈà\u008b\u0004ÿ>&ä\u0089\u0000Ç¾ØGÞ*\u0089y\n\u0092zìB\u0007Ï\u0016ö)}^\u009a}_Ñ¥R\u007fFiÈ«\u0010yã\u008dÊ´\u0097\u00adln\u009a\u008aT9\u0088Ý\u0005Ĉ\u0014ó~\nJ\u00919Y\u0095\bR\u0019\u0086úQ\u0004¼\u008fØX¥FL\u0082[ÖÓ{,lhL\u0085Kçû\u0082Dâ\u009f\u009aÒJ1ð\u0017nÃ\u009fíã\u0099Ô\u0088çP¾`@ñ\u000e;\u0013\u0019\u009cch²³æcî\u008cÉÅüB¯-l ´ê\u001a[ß¢\b\u0015xËZuâJÒ¸ü»\u0085`ÝØkÖ£KÛT\u0004\u0087=\u000f\u0006)ÛÜÜNÑÉÁ[¶´«\u001d\u000b©\\\u0092H<oX'à}H<¾´ß\u000f`a}\u0092³ fu3=Îa\u0011õ\\\u000b×i¬ä¢\u008dK¾\tÝ\u009eÉ\u008c \u0004F\u001eÓl\u0094\u001dæT\u0004TçèS%_+á¤\u009a´Ðd¼xp\u0005âÚ4-\u0012×Á'Î\u0085íúîÇ5äú\u0016·åá\u0004º'$Ö¢èñ\\ï\u001eÅ\u0081o¶_\u0090KÈ\u008fF÷³\u0016µÏ*õ\u0001\u001cã\u009ed¨²þG§É=ÈîPtQ7.\u000f\u0012<\u00ad¼Çµ»@\u0012Ýï8%\u0087\u001c¥½Øö]A\u0005-^cÐáQ+A\u0017ÇÚv\u000eÛï\u0016\u0085Ð÷ªÄT\u008ahþ\u001c\u000f\u0082\u0011Ò¢\u000b\f\u0096\u0000«ÐT\u001cÔoÈÒxÐ{4Õ\u0007\u000fÑ\reÈ\u001eÆle\rÞk\u000e\u0088`'ÌncN8§\u000bl1oé#Õ]\u008aÂI\u0088ãu\ràn\u0007÷\r\u0098Ïß(S8'ÇÊ\u001a\u0096W:\u008b]¢0\u0082\u0006Õév\u000e)ß@TkBs\u001dÂfIêS\u0019f&w\u0016rÖm[\u0017\u007fôv\nnþü\u0000i \u0004-s\u008fÙÌêä³\u00892¾h\u009fGÒ\u001b¾\u001eyu¯]\u0011\u001f\t£P\u0018ÒºW\u0081H±ò-GsÃ\u000bpî\u009fCEO»ïàCIµ\u0007Ü\u0091\u001cz¥Z\u001dKîÙN\u00893?\u0001ý=1kÔbtÔ\u0015ÈÍFö,Ö¢Ñ÷»Xò?\u0082×T@iG¥¾OXB»ëUoÙ\u0010\u008a\u0090]x~K¦]Ý½üM].\u001eÚ ÁãdÜÁQ\u001dÞé[;À\u0087f'Tÿ°ÚÙo¨®L\u0085\u009aÚ±.¸dþ(g\u0006ÑÃY\u0004\u001d\u0098±\u008dÜ\bL\u009f\u007fBqõ}|\u000b&\u0081Í27÷ªqÐ£Ìsü\u009eâ\u001aÛrô\u0010tD\u0083ªÕ+\u0017ZsPg«\u009aiP\u000f@ìäÅ@!\u0091##\u0088ô\u008d\u0091æ`W0Q£ÈA[El\u00927¡×< W÷Cëê\u0010jõ\u001c\u0098\u0000h\u009c°,\u0002BÁÐ\u0013Ä|\u0090å\u001aM²uPµä4Í/I(¡=»\u0088ëÝ\u001cì\u0016\u008dÄHA¬ÜO\u0096Ã\u0099'øF|\u0084æü(à\tÄ\u0085\u001b\u008f¹\u0002sý\u0096;\u0096PêR\u0019µ_0]\u0085H\u00ad71ÎN\t\r¯F\u0084[\u0086\u008aÕz*\u00ad¿éï6Ù©î¨a2\f¬_k\u000b\u0093@\u001e\u008dxÅ|\u0086Æ\u0007£\u0010)ü\u0089\u0088X>t\u008auØ\u0097ÿ\u0087\u0085v[Låð\b\u009cÁòôÿ5D\u0018\u0016ÈÌÖf~Ó;\u0083\u0099â?\u0095Ï8\u008c\u0088Fl\u0019 ªº\u0082\u0010\u009a\u0010\u000eÝµ\u0019\u0087\u0001ì\u0003\u00965\u001ae*\u0007(ÑX³ìáü\u0014ÿ\u0091Þ#¨ÑP\u0015\u009a°\u009cH6¨kB\u008c\u0002Gp»à\u0018\u007f\u001eð\u008aV.\u0091\u0083\u008c\u000f(\u0018ØW\u0097£§)e\u009c7åöx\u0000·\u0007T¿Ç\u007fIVK\u0001\f©ÓXæ[ïÖå\u0002cç|Ñ§\u00858\u0010ZªªÈ0\"ôKxª¿÷eD_\u0099°è\"\u001cÔ\u0089\f´éáÐ£ÔSÑmG>\u0010»Vw-~¿^á®\u001dóÂ\u0003m¿ÔöäF$\u0018ÅóéûÏÏôùU¬³¬KÇé\u009c\u0011'\u0019½x(×§"
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
                     j = var9;
                     k = new String[28];
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

                  var6 = "\u0011¡'øÄ\u001cf=sfkÀ\u0081P\u0095$#s\u008fCãÔ\f¢\u0003\u0000ÜÄ_0´w®d\u0094ß\f\u0090Em:0$\u0002c\u0085\u0011®æJÐÚV\u0089\u0007Ë8ãê!QÀÕ\u000eñ\u007f\u0016aâ\u009fäà_qrE\u001165IÌ\u0085Øõí\u001fÝ\u000bkÌ8\u001cÔhñ(5\u0013âÔ\u0094ìå#áxD£¨[ÑK!";
                  var8 = "\u0011¡'øÄ\u001cf=sfkÀ\u0081P\u0095$#s\u008fCãÔ\f¢\u0003\u0000ÜÄ_0´w®d\u0094ß\f\u0090Em:0$\u0002c\u0085\u0011®æJÐÚV\u0089\u0007Ë8ãê!QÀÕ\u000eñ\u007f\u0016aâ\u009fäà_qrE\u001165IÌ\u0085Øõí\u001fÝ\u000bkÌ8\u001cÔhñ(5\u0013âÔ\u0094ìå#áxD£¨[ÑK!"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception b(Exception var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18160;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_8o", var10);
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
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
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
         throw new RuntimeException("com/zelix/_8o" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
