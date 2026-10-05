package com.zelix;

import java.io.BufferedReader;
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

public class l1 {
   private static final long a = ess.a(5581387686304110315L, -8778659056936822157L, MethodHandles.lookup().lookupClass()).a(163922795922693L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public l1(long param1, BufferedReader param3, String param4, Map param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/l1.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 62477685469910
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 40362278912554
      // 012: lxor
      // 013: lstore 8
      // 015: pop2
      // 016: ldc2_w 6360822468805699178
      // 019: lload 1
      // 01a: invokedynamic u (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: aload 0
      // 020: invokespecial java/lang/Object.<init> ()V
      // 023: astore 10
      // 025: aload 3
      // 026: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 029: dup
      // 02a: astore 11
      // 02c: ifnull 353
      // 02f: lload 6
      // 031: aload 11
      // 033: bipush 0
      // 034: bipush 3
      // 035: anewarray 304
      // 038: dup_x1
      // 039: swap
      // 03a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 03d: bipush 2
      // 03e: swap
      // 03f: aastore
      // 040: dup_x1
      // 041: swap
      // 042: bipush 1
      // 043: swap
      // 044: aastore
      // 045: dup_x2
      // 046: dup_x2
      // 047: pop
      // 048: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04b: bipush 0
      // 04c: swap
      // 04d: aastore
      // 04e: ldc2_w 6687095604894769530
      // 051: lload 1
      // 052: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: istore 12
      // 059: iload 12
      // 05b: ifle 08c
      // 05e: aload 11
      // 060: iload 12
      // 062: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 065: astore 13
      // 067: aload 10
      // 069: lload 1
      // 06a: lconst_0
      // 06b: lcmp
      // 06c: ifle 092
      // 06f: ifnull 090
      // 072: bipush 2
      // 073: anewarray 18
      // 076: ldc2_w 6544121541608308327
      // 079: lload 1
      // 07a: invokedynamic u (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: goto 08c
      // 082: ldc2_w 4666626213587425583
      // 085: lload 1
      // 086: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: aload 11
      // 08e: astore 13
      // 090: aload 13
      // 092: ldc2_w 4682906742165065876
      // 095: lload 1
      // 096: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: aload 10
      // 09d: ifnonnull 0ce
      // 0a0: ifeq 0c8
      // 0a3: goto 0b0
      // 0a6: ldc2_w 4666626213587425583
      // 0a9: lload 1
      // 0aa: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 10
      // 0b2: lload 1
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: ifle 02c
      // 0b8: ifnull 025
      // 0bb: goto 0c8
      // 0be: ldc2_w 4666626213587425583
      // 0c1: lload 1
      // 0c2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 13
      // 0ca: bipush 0
      // 0cb: invokevirtual java/lang/String.charAt (I)C
      // 0ce: sipush 7018
      // 0d1: ldc2_w 3666162901806714098
      // 0d4: lload 1
      // 0d5: lxor
      // 0d6: invokedynamic i (IJ)I bsm=com/zelix/l1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aload 10
      // 0dd: ifnonnull 115
      // 0e0: if_icmpeq 348
      // 0e3: aload 13
      // 0e5: bipush 0
      // 0e6: invokevirtual java/lang/String.charAt (I)C
      // 0e9: aload 10
      // 0eb: ifnonnull 11c
      // 0ee: goto 0fb
      // 0f1: ldc2_w 4666626213587425583
      // 0f4: lload 1
      // 0f5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: sipush 21807
      // 0fe: ldc2_w 4469045126774309558
      // 101: lload 1
      // 102: lxor
      // 103: invokedynamic i (IJ)I bsm=com/zelix/l1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: goto 115
      // 10b: ldc2_w 4666626213587425583
      // 10e: lload 1
      // 10f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: if_icmpne 11b
      // 118: goto 348
      // 11b: bipush 0
      // 11c: istore 14
      // 11e: aconst_null
      // 11f: astore 15
      // 121: new java/util/StringTokenizer
      // 124: dup
      // 125: aload 13
      // 127: sipush 1052
      // 12a: ldc2_w 466819782279743647
      // 12d: lload 1
      // 12e: lxor
      // 12f: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/l1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: bipush 1
      // 135: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 138: astore 16
      // 13a: aload 16
      // 13c: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 13f: ifeq 348
      // 142: aload 16
      // 144: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 147: astore 17
      // 149: aload 17
      // 14b: invokevirtual java/lang/String.length ()I
      // 14e: istore 18
      // 150: iload 18
      // 152: aload 10
      // 154: ifnonnull 1f5
      // 157: bipush 1
      // 158: aload 10
      // 15a: ifnonnull 0db
      // 15d: lload 1
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 0d1
      // 163: goto 170
      // 166: ldc2_w 4666626213587425583
      // 169: lload 1
      // 16a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: athrow
      // 170: if_icmpne 1e6
      // 173: aload 17
      // 175: lload 1
      // 176: lconst_0
      // 177: lcmp
      // 178: ifle 1e3
      // 17b: ldc ":"
      // 17d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 180: aload 10
      // 182: ifnonnull 1df
      // 185: goto 192
      // 188: ldc2_w 4666626213587425583
      // 18b: lload 1
      // 18c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: lload 1
      // 193: lconst_0
      // 194: lcmp
      // 195: ifle 1d2
      // 198: ifne 1d1
      // 19b: goto 1a8
      // 19e: ldc2_w 4666626213587425583
      // 1a1: lload 1
      // 1a2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: aload 17
      // 1aa: aload 10
      // 1ac: ifnonnull 341
      // 1af: goto 1bc
      // 1b2: ldc2_w 4666626213587425583
      // 1b5: lload 1
      // 1b6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: athrow
      // 1bc: ldc "="
      // 1be: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c1: ifeq 33f
      // 1c4: goto 1d1
      // 1c7: ldc2_w 4666626213587425583
      // 1ca: lload 1
      // 1cb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: bipush 1
      // 1d2: goto 1df
      // 1d5: ldc2_w 4666626213587425583
      // 1d8: lload 1
      // 1d9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: istore 14
      // 1e1: aload 10
      // 1e3: ifnull 33f
      // 1e6: iload 14
      // 1e8: goto 1f5
      // 1eb: ldc2_w 4666626213587425583
      // 1ee: lload 1
      // 1ef: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: ifeq 33f
      // 1f8: aload 17
      // 1fa: bipush 1
      // 1fb: anewarray 304
      // 1fe: dup_x1
      // 1ff: swap
      // 200: bipush 0
      // 201: swap
      // 202: aastore
      // 203: ldc2_w 6640221912407874158
      // 206: lload 1
      // 207: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: astore 19
      // 20e: aload 19
      // 210: aload 10
      // 212: lload 1
      // 213: lconst_0
      // 214: lcmp
      // 215: ifle 21d
      // 218: ifnonnull 341
      // 21b: ldc ";"
      // 21d: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 220: ifne 33f
      // 223: goto 230
      // 226: ldc2_w 4666626213587425583
      // 229: lload 1
      // 22a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: aload 19
      // 232: aload 10
      // 234: ifnonnull 341
      // 237: goto 244
      // 23a: ldc2_w 4666626213587425583
      // 23d: lload 1
      // 23e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: ldc "["
      // 246: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 249: bipush -1
      // 24a: if_icmpne 33f
      // 24d: goto 25a
      // 250: ldc2_w 4666626213587425583
      // 253: lload 1
      // 254: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: aload 19
      // 25c: aload 10
      // 25e: ifnonnull 341
      // 261: goto 26e
      // 264: ldc2_w 4666626213587425583
      // 267: lload 1
      // 268: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: athrow
      // 26e: ldc "."
      // 270: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 273: bipush -1
      // 274: if_icmpne 33f
      // 277: goto 284
      // 27a: ldc2_w 4666626213587425583
      // 27d: lload 1
      // 27e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: athrow
      // 284: aload 19
      // 286: aload 10
      // 288: ifnonnull 341
      // 28b: goto 298
      // 28e: ldc2_w 4666626213587425583
      // 291: lload 1
      // 292: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: athrow
      // 298: ldc "<"
      // 29a: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 29d: bipush -1
      // 29e: if_icmpne 33f
      // 2a1: goto 2ae
      // 2a4: ldc2_w 4666626213587425583
      // 2a7: lload 1
      // 2a8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: athrow
      // 2ae: lload 1
      // 2af: lconst_0
      // 2b0: lcmp
      // 2b1: iflt 343
      // 2b4: aload 19
      // 2b6: aload 10
      // 2b8: ifnonnull 341
      // 2bb: goto 2c8
      // 2be: ldc2_w 4666626213587425583
      // 2c1: lload 1
      // 2c2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: athrow
      // 2c8: ldc ">"
      // 2ca: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2cd: bipush -1
      // 2ce: if_icmpne 33f
      // 2d1: goto 2de
      // 2d4: ldc2_w 4666626213587425583
      // 2d7: lload 1
      // 2d8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: athrow
      // 2de: lload 8
      // 2e0: aload 19
      // 2e2: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 2e5: astore 20
      // 2e7: aload 10
      // 2e9: lload 1
      // 2ea: lconst_0
      // 2eb: lcmp
      // 2ec: ifle 345
      // 2ef: ifnonnull 343
      // 2f2: aload 20
      // 2f4: ifnull 33f
      // 2f7: goto 304
      // 2fa: ldc2_w 4666626213587425583
      // 2fd: lload 1
      // 2fe: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: athrow
      // 304: aload 5
      // 306: aload 20
      // 308: new java/lang/StringBuilder
      // 30b: dup
      // 30c: invokespecial java/lang/StringBuilder.<init> ()V
      // 30f: sipush 25160
      // 312: ldc2_w 8061854204812537546
      // 315: lload 1
      // 316: lxor
      // 317: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/l1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31f: aload 4
      // 321: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 324: ldc "'"
      // 326: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 329: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 32c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 331: pop
      // 332: goto 33f
      // 335: ldc2_w 4666626213587425583
      // 338: lload 1
      // 339: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: athrow
      // 33f: aload 17
      // 341: astore 15
      // 343: aload 10
      // 345: ifnull 13a
      // 348: aload 10
      // 34a: lload 1
      // 34b: lconst_0
      // 34c: lcmp
      // 34d: iflt 0e5
      // 350: ifnull 025
      // 353: lload 1
      // 354: lconst_0
      // 355: lcmp
      // 356: ifle 025
      // 359: return
   }

   static {
      long var11 = a ^ 63896050356588L;
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
      String var17 = "\u007fÝDAl\u009cífÌ\u001cK²±l¥FI\u008c7ö~qf$÷¤Ù÷Ã\u0011àB\u0010\u0016\u0084k#\u0000®·\u0007Î=³ã»2Ûø";
      int var19 = "\u007fÝDAl\u009cífÌ\u001cK²±l¥FI\u008c7ö~qf$÷¤Ù÷Ã\u0011àB\u0010\u0016\u0084k#\u0000®·\u0007Î=³ã»2Ûø".length();
      char var16 = ' ';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[2];
            g = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[2];
            int var3 = 0;
            String var4 = "\u0088+>^ã!~üéÞë\u0091Ü¶©µ";
            int var5 = "\u0088+>^ã!~üéÞë\u0091Ü¶©µ".length();
            byte var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               var10001 = var3++;
               long var8 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
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
               long var10004 = ((long)var10[0] & 255L) << 56
                  | ((long)var10[1] & 255L) << 48
                  | ((long)var10[2] & 255L) << 40
                  | ((long)var10[3] & 255L) << 32
                  | ((long)var10[4] & 255L) << 24
                  | ((long)var10[5] & 255L) << 16
                  | ((long)var10[6] & 255L) << 8
                  | (long)var10[7] & 255L;
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            e = var6;
            f = new Integer[2];
            return;
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7460;
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
            throw new RuntimeException("com/zelix/l1", var10);
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
         throw new RuntimeException("com/zelix/l1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17982;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/l1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("com/zelix/l1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
