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

public class h9 {
   private static final long a = prr.a(-3034266535678095805L, 2981603174344995630L, MethodHandles.lookup().lookupClass()).a(149617764820046L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public h9(BufferedReader param1, String param2, long param3, Map param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/h9.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 50646370580930
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 63481176522320
      // 012: lxor
      // 013: lstore 8
      // 015: pop2
      // 016: ldc2_w -2355519160871840010
      // 019: lload 3
      // 01a: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: aload 0
      // 020: invokespecial java/lang/Object.<init> ()V
      // 023: astore 10
      // 025: aload 1
      // 026: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 029: dup
      // 02a: astore 11
      // 02c: ifnull 344
      // 02f: aload 11
      // 031: bipush 0
      // 032: lload 8
      // 034: bipush 3
      // 035: anewarray 255
      // 038: dup_x2
      // 039: dup_x2
      // 03a: pop
      // 03b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03e: bipush 2
      // 03f: swap
      // 040: aastore
      // 041: dup_x1
      // 042: swap
      // 043: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 046: bipush 1
      // 047: swap
      // 048: aastore
      // 049: dup_x1
      // 04a: swap
      // 04b: bipush 0
      // 04c: swap
      // 04d: aastore
      // 04e: ldc2_w -2402453042500497613
      // 051: lload 3
      // 052: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: istore 12
      // 059: iload 12
      // 05b: ifle 08a
      // 05e: aload 11
      // 060: iload 12
      // 062: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 065: astore 13
      // 067: lload 3
      // 068: lconst_0
      // 069: lcmp
      // 06a: ifle 08e
      // 06d: aload 10
      // 06f: ifnull 08e
      // 072: ldc "ZtBppc"
      // 074: ldc2_w -2848123761687578118
      // 077: lload 3
      // 078: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: goto 08a
      // 080: ldc2_w -4412428024488377088
      // 083: lload 3
      // 084: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: aload 11
      // 08c: astore 13
      // 08e: aload 13
      // 090: ldc2_w -4336149849177180790
      // 093: lload 3
      // 094: invokedynamic q (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: aload 10
      // 09b: ifnonnull 0c6
      // 09e: ifeq 0c0
      // 0a1: goto 0ae
      // 0a4: ldc2_w -4412428024488377088
      // 0a7: lload 3
      // 0a8: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 10
      // 0b0: ifnull 025
      // 0b3: goto 0c0
      // 0b6: ldc2_w -4412428024488377088
      // 0b9: lload 3
      // 0ba: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 13
      // 0c2: bipush 0
      // 0c3: invokevirtual java/lang/String.charAt (I)C
      // 0c6: sipush 32650
      // 0c9: ldc2_w 2302149396435884764
      // 0cc: lload 3
      // 0cd: lxor
      // 0ce: invokedynamic i (IJ)I bsm=com/zelix/h9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: aload 10
      // 0d5: ifnonnull 10d
      // 0d8: if_icmpeq 339
      // 0db: aload 13
      // 0dd: bipush 0
      // 0de: invokevirtual java/lang/String.charAt (I)C
      // 0e1: aload 10
      // 0e3: ifnonnull 114
      // 0e6: goto 0f3
      // 0e9: ldc2_w -4412428024488377088
      // 0ec: lload 3
      // 0ed: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: sipush 26845
      // 0f6: ldc2_w 6665384667266403722
      // 0f9: lload 3
      // 0fa: lxor
      // 0fb: invokedynamic i (IJ)I bsm=com/zelix/h9.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: goto 10d
      // 103: ldc2_w -4412428024488377088
      // 106: lload 3
      // 107: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: if_icmpne 113
      // 110: goto 339
      // 113: bipush 0
      // 114: istore 14
      // 116: aconst_null
      // 117: astore 15
      // 119: new java/util/StringTokenizer
      // 11c: dup
      // 11d: aload 13
      // 11f: sipush 25646
      // 122: ldc2_w 1877202691299191322
      // 125: lload 3
      // 126: lxor
      // 127: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/h9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: bipush 1
      // 12d: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 130: astore 16
      // 132: aload 16
      // 134: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 137: ifeq 339
      // 13a: aload 16
      // 13c: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 13f: astore 17
      // 141: aload 17
      // 143: invokevirtual java/lang/String.length ()I
      // 146: istore 18
      // 148: iload 18
      // 14a: aload 10
      // 14c: ifnonnull 1ed
      // 14f: bipush 1
      // 150: aload 10
      // 152: ifnonnull 0d3
      // 155: lload 3
      // 156: lconst_0
      // 157: lcmp
      // 158: iflt 0c9
      // 15b: goto 168
      // 15e: ldc2_w -4412428024488377088
      // 161: lload 3
      // 162: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: if_icmpne 1de
      // 16b: lload 3
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: iflt 1d9
      // 171: aload 17
      // 173: ldc ":"
      // 175: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 178: aload 10
      // 17a: ifnonnull 1d7
      // 17d: goto 18a
      // 180: ldc2_w -4412428024488377088
      // 183: lload 3
      // 184: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: lload 3
      // 18b: lconst_0
      // 18c: lcmp
      // 18d: iflt 1ca
      // 190: ifne 1c9
      // 193: goto 1a0
      // 196: ldc2_w -4412428024488377088
      // 199: lload 3
      // 19a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: aload 17
      // 1a2: aload 10
      // 1a4: ifnonnull 332
      // 1a7: goto 1b4
      // 1aa: ldc2_w -4412428024488377088
      // 1ad: lload 3
      // 1ae: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: ldc "="
      // 1b6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b9: ifeq 330
      // 1bc: goto 1c9
      // 1bf: ldc2_w -4412428024488377088
      // 1c2: lload 3
      // 1c3: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: bipush 1
      // 1ca: goto 1d7
      // 1cd: ldc2_w -4412428024488377088
      // 1d0: lload 3
      // 1d1: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: istore 14
      // 1d9: aload 10
      // 1db: ifnull 330
      // 1de: iload 14
      // 1e0: goto 1ed
      // 1e3: ldc2_w -4412428024488377088
      // 1e6: lload 3
      // 1e7: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: athrow
      // 1ed: ifeq 330
      // 1f0: aload 17
      // 1f2: bipush 1
      // 1f3: anewarray 255
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: bipush 0
      // 1f9: swap
      // 1fa: aastore
      // 1fb: ldc2_w -2805176656203457068
      // 1fe: lload 3
      // 1ff: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: astore 19
      // 206: aload 19
      // 208: aload 10
      // 20a: ifnonnull 332
      // 20d: ldc ";"
      // 20f: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 212: ifne 330
      // 215: goto 222
      // 218: ldc2_w -4412428024488377088
      // 21b: lload 3
      // 21c: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: aload 19
      // 224: aload 10
      // 226: ifnonnull 332
      // 229: goto 236
      // 22c: ldc2_w -4412428024488377088
      // 22f: lload 3
      // 230: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: ldc "["
      // 238: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 23b: bipush -1
      // 23c: if_icmpne 330
      // 23f: goto 24c
      // 242: ldc2_w -4412428024488377088
      // 245: lload 3
      // 246: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: athrow
      // 24c: aload 19
      // 24e: aload 10
      // 250: ifnonnull 332
      // 253: goto 260
      // 256: ldc2_w -4412428024488377088
      // 259: lload 3
      // 25a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: athrow
      // 260: ldc "."
      // 262: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 265: bipush -1
      // 266: if_icmpne 330
      // 269: goto 276
      // 26c: ldc2_w -4412428024488377088
      // 26f: lload 3
      // 270: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 275: athrow
      // 276: aload 19
      // 278: aload 10
      // 27a: ifnonnull 332
      // 27d: goto 28a
      // 280: ldc2_w -4412428024488377088
      // 283: lload 3
      // 284: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: athrow
      // 28a: ldc "<"
      // 28c: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 28f: bipush -1
      // 290: if_icmpne 330
      // 293: goto 2a0
      // 296: ldc2_w -4412428024488377088
      // 299: lload 3
      // 29a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: athrow
      // 2a0: lload 3
      // 2a1: lconst_0
      // 2a2: lcmp
      // 2a3: ifle 334
      // 2a6: aload 19
      // 2a8: aload 10
      // 2aa: ifnonnull 332
      // 2ad: goto 2ba
      // 2b0: ldc2_w -4412428024488377088
      // 2b3: lload 3
      // 2b4: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: athrow
      // 2ba: ldc ">"
      // 2bc: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2bf: bipush -1
      // 2c0: if_icmpne 330
      // 2c3: goto 2d0
      // 2c6: ldc2_w -4412428024488377088
      // 2c9: lload 3
      // 2ca: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: athrow
      // 2d0: aload 19
      // 2d2: lload 6
      // 2d4: invokestatic com/zelix/l62.B (Ljava/lang/String;J)Lcom/zelix/_f;
      // 2d7: astore 20
      // 2d9: aload 10
      // 2db: lload 3
      // 2dc: lconst_0
      // 2dd: lcmp
      // 2de: iflt 336
      // 2e1: ifnonnull 334
      // 2e4: aload 20
      // 2e6: ifnull 330
      // 2e9: goto 2f6
      // 2ec: ldc2_w -4412428024488377088
      // 2ef: lload 3
      // 2f0: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: athrow
      // 2f6: aload 5
      // 2f8: aload 20
      // 2fa: new java/lang/StringBuilder
      // 2fd: dup
      // 2fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 301: sipush 10566
      // 304: ldc2_w 2008437361681655667
      // 307: lload 3
      // 308: lxor
      // 309: invokedynamic t (IJ)Ljava/lang/String; bsm=com/zelix/h9.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 311: aload 2
      // 312: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 315: ldc "'"
      // 317: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 31d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 322: pop
      // 323: goto 330
      // 326: ldc2_w -4412428024488377088
      // 329: lload 3
      // 32a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32f: athrow
      // 330: aload 17
      // 332: astore 15
      // 334: aload 10
      // 336: ifnull 132
      // 339: lload 3
      // 33a: lconst_0
      // 33b: lcmp
      // 33c: iflt 113
      // 33f: aload 10
      // 341: ifnull 025
      // 344: lload 3
      // 345: lconst_0
      // 346: lcmp
      // 347: ifle 025
      // 34a: return
   }

   static {
      long var11 = a ^ 133839650115749L;
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
      String var17 = "oð\u000eh\u009b}ÔFï§hsY\u0016a* \u0099v<iMPF3@í\u0012Ý\u009b_½¯è\u001aäl\u001aGoöÞqº\u0002e\u0080¯\u0006";
      int var19 = "oð\u000eh\u009b}ÔFï§hsY\u0016a* \u0099v<iMPF3@í\u0012Ý\u009b_½¯è\u001aäl\u001aGoöÞqº\u0002e\u0080¯\u0006".length();
      char var16 = 16;
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
            String var4 = "°@\u0081\u0002\u009aT\u0095ô±¿Ð°o\u0014_>";
            int var5 = "°@\u0081\u0002\u009aT\u0095ô±¿Ð°o\u0014_>".length();
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

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 989;
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
            throw new RuntimeException("com/zelix/h9", var10);
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
         throw new RuntimeException("com/zelix/h9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26815;
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
            throw new RuntimeException("com/zelix/h9", var14);
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
         throw new RuntimeException("com/zelix/h9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
