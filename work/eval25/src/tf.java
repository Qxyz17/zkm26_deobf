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

public abstract class tf {
   _82[] J;
   private static final long b = ess.a(-6892190918908618709L, -1494817805057790032L, MethodHandles.lookup().lookupClass()).a(134075333884229L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long g;

   String T(Object[] param1) {
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
      // 00a: istore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast com/zelix/a7
      // 01c: astore 6
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/am
      // 024: astore 4
      // 026: pop
      // 027: getstatic com/zelix/tf.b J
      // 02a: lload 2
      // 02b: lxor
      // 02c: lstore 2
      // 02d: lload 2
      // 02e: dup2
      // 02f: ldc2_w 55128531015520
      // 032: lxor
      // 033: lstore 7
      // 035: dup2
      // 036: ldc2_w 80244435695443
      // 039: lxor
      // 03a: lstore 9
      // 03c: dup2
      // 03d: ldc2_w 28058787969303
      // 040: lxor
      // 041: lstore 11
      // 043: dup2
      // 044: ldc2_w 124995303442935
      // 047: lxor
      // 048: lstore 13
      // 04a: dup2
      // 04b: ldc2_w 19441338074530
      // 04e: lxor
      // 04f: lstore 15
      // 051: dup2
      // 052: ldc2_w 39786872744398
      // 055: lxor
      // 056: lstore 17
      // 058: dup2
      // 059: ldc2_w 112570549732150
      // 05c: lxor
      // 05d: lstore 19
      // 05f: pop2
      // 060: ldc2_w -7064336201353796233
      // 063: lload 2
      // 064: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: new java/lang/StringBuffer
      // 06c: dup
      // 06d: getstatic com/zelix/tf.g J
      // 070: l2i
      // 071: invokespecial java/lang/StringBuffer.<init> (I)V
      // 074: astore 22
      // 076: astore 21
      // 078: bipush 0
      // 079: istore 23
      // 07b: aconst_null
      // 07c: astore 24
      // 07e: aload 0
      // 07f: ldc2_w -7397698982491240141
      // 082: lload 2
      // 083: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/_82; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: arraylength
      // 089: bipush 1
      // 08a: isub
      // 08b: istore 25
      // 08d: iload 25
      // 08f: iflt 380
      // 092: aload 0
      // 093: ldc2_w -7397698982491240141
      // 096: lload 2
      // 097: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/_82; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: iload 25
      // 09e: aaload
      // 09f: astore 26
      // 0a1: iload 23
      // 0a3: aload 21
      // 0a5: lload 2
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 2fb
      // 0ab: ifnull 2f9
      // 0ae: ifeq 2a7
      // 0b1: goto 0be
      // 0b4: ldc2_w -9166990121946301382
      // 0b7: lload 2
      // 0b8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 26
      // 0c0: aload 21
      // 0c2: ifnull 109
      // 0c5: goto 0d2
      // 0c8: ldc2_w -9166990121946301382
      // 0cb: lload 2
      // 0cc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: lload 7
      // 0d4: bipush 1
      // 0d5: anewarray 185
      // 0d8: dup_x2
      // 0d9: dup_x2
      // 0da: pop
      // 0db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0de: bipush 0
      // 0df: swap
      // 0e0: aastore
      // 0e1: ldc2_w -7161876150784340141
      // 0e4: lload 2
      // 0e5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: ifeq 274
      // 0ed: goto 0fa
      // 0f0: ldc2_w -9166990121946301382
      // 0f3: lload 2
      // 0f4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: aload 26
      // 0fc: goto 109
      // 0ff: ldc2_w -9166990121946301382
      // 102: lload 2
      // 103: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: lload 15
      // 10b: bipush 1
      // 10c: anewarray 185
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 0
      // 116: swap
      // 117: aastore
      // 118: ldc2_w -7150171662169398598
      // 11b: lload 2
      // 11c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: astore 27
      // 123: aload 21
      // 125: lload 2
      // 126: lconst_0
      // 127: lcmp
      // 128: ifle 1c5
      // 12b: ifnull 1c3
      // 12e: aload 27
      // 130: sipush 22600
      // 133: ldc2_w 426930084361297276
      // 136: lload 2
      // 137: lxor
      // 138: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 140: ifne 190
      // 143: goto 150
      // 146: ldc2_w -9166990121946301382
      // 149: lload 2
      // 14a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: aload 27
      // 152: sipush 12143
      // 155: ldc2_w 6639090411080788574
      // 158: lload 2
      // 159: lxor
      // 15a: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 162: lload 2
      // 163: lconst_0
      // 164: lcmp
      // 165: iflt 1f5
      // 168: aload 21
      // 16a: ifnull 1f5
      // 16d: goto 17a
      // 170: ldc2_w -9166990121946301382
      // 173: lload 2
      // 174: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: lload 2
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: iflt 1e8
      // 180: ifeq 1ce
      // 183: goto 190
      // 186: ldc2_w -9166990121946301382
      // 189: lload 2
      // 18a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: aload 22
      // 192: new java/lang/StringBuilder
      // 195: dup
      // 196: invokespecial java/lang/StringBuilder.<init> ()V
      // 199: sipush 8565
      // 19c: ldc2_w 3012489941182948416
      // 19f: lload 2
      // 1a0: lxor
      // 1a1: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a9: getstatic com/zelix/mc.R Ljava/lang/String;
      // 1ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b2: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1b5: pop
      // 1b6: goto 1c3
      // 1b9: ldc2_w -9166990121946301382
      // 1bc: lload 2
      // 1bd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: aload 21
      // 1c5: lload 2
      // 1c6: lconst_0
      // 1c7: lcmp
      // 1c8: iflt 271
      // 1cb: ifnonnull 269
      // 1ce: aload 24
      // 1d0: lload 13
      // 1d2: bipush 1
      // 1d3: anewarray 185
      // 1d6: dup_x2
      // 1d7: dup_x2
      // 1d8: pop
      // 1d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dc: bipush 0
      // 1dd: swap
      // 1de: aastore
      // 1df: ldc2_w -7091123732659901715
      // 1e2: lload 2
      // 1e3: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: goto 1f5
      // 1eb: ldc2_w -9166990121946301382
      // 1ee: lload 2
      // 1ef: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: ifeq 236
      // 1f8: aload 22
      // 1fa: new java/lang/StringBuilder
      // 1fd: dup
      // 1fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 201: sipush 9113
      // 204: ldc2_w 8809142225411810986
      // 207: lload 2
      // 208: lxor
      // 209: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 211: getstatic com/zelix/mc.R Ljava/lang/String;
      // 214: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 217: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 21a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 21d: pop
      // 21e: aload 21
      // 220: lload 2
      // 221: lconst_0
      // 222: lcmp
      // 223: ifle 271
      // 226: ifnonnull 269
      // 229: goto 236
      // 22c: ldc2_w -9166990121946301382
      // 22f: lload 2
      // 230: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: aload 22
      // 238: new java/lang/StringBuilder
      // 23b: dup
      // 23c: invokespecial java/lang/StringBuilder.<init> ()V
      // 23f: sipush 14325
      // 242: ldc2_w 551716050488505029
      // 245: lload 2
      // 246: lxor
      // 247: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24f: getstatic com/zelix/mc.R Ljava/lang/String;
      // 252: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 255: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 258: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 25b: pop
      // 25c: goto 269
      // 25f: ldc2_w -9166990121946301382
      // 262: lload 2
      // 263: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: athrow
      // 269: lload 2
      // 26a: lconst_0
      // 26b: lcmp
      // 26c: ifle 2df
      // 26f: aload 21
      // 271: ifnonnull 2a7
      // 274: aload 22
      // 276: new java/lang/StringBuilder
      // 279: dup
      // 27a: invokespecial java/lang/StringBuilder.<init> ()V
      // 27d: sipush 17341
      // 280: ldc2_w 3089620801559807631
      // 283: lload 2
      // 284: lxor
      // 285: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/tf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28d: getstatic com/zelix/mc.R Ljava/lang/String;
      // 290: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 293: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 296: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 299: pop
      // 29a: goto 2a7
      // 29d: ldc2_w -9166990121946301382
      // 2a0: lload 2
      // 2a1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a6: athrow
      // 2a7: aload 22
      // 2a9: aload 26
      // 2ab: iload 5
      // 2ad: aload 6
      // 2af: lload 17
      // 2b1: aload 4
      // 2b3: bipush 4
      // 2b4: anewarray 185
      // 2b7: dup_x1
      // 2b8: swap
      // 2b9: bipush 3
      // 2ba: swap
      // 2bb: aastore
      // 2bc: dup_x2
      // 2bd: dup_x2
      // 2be: pop
      // 2bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c2: bipush 2
      // 2c3: swap
      // 2c4: aastore
      // 2c5: dup_x1
      // 2c6: swap
      // 2c7: bipush 1
      // 2c8: swap
      // 2c9: aastore
      // 2ca: dup_x1
      // 2cb: swap
      // 2cc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2cf: bipush 0
      // 2d0: swap
      // 2d1: aastore
      // 2d2: ldc2_w -8670309874614204770
      // 2d5: lload 2
      // 2d6: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 2de: pop
      // 2df: aload 26
      // 2e1: lload 19
      // 2e3: bipush 1
      // 2e4: anewarray 185
      // 2e7: dup_x2
      // 2e8: dup_x2
      // 2e9: pop
      // 2ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ed: bipush 0
      // 2ee: swap
      // 2ef: aastore
      // 2f0: ldc2_w -9140584492823690397
      // 2f3: lload 2
      // 2f4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: aload 21
      // 2fb: ifnull 372
      // 2fe: ifeq 358
      // 301: goto 30e
      // 304: ldc2_w -9166990121946301382
      // 307: lload 2
      // 308: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: athrow
      // 30e: aload 22
      // 310: new java/lang/StringBuilder
      // 313: dup
      // 314: invokespecial java/lang/StringBuilder.<init> ()V
      // 317: ldc "<"
      // 319: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31c: aload 26
      // 31e: lload 11
      // 320: bipush 1
      // 321: anewarray 185
      // 324: dup_x2
      // 325: dup_x2
      // 326: pop
      // 327: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32a: bipush 0
      // 32b: swap
      // 32c: aastore
      // 32d: ldc2_w -9180047817796868125
      // 330: lload 2
      // 331: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 339: ldc ">"
      // 33b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33e: getstatic com/zelix/mc.R Ljava/lang/String;
      // 341: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 344: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 347: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 34a: pop
      // 34b: goto 358
      // 34e: ldc2_w -9166990121946301382
      // 351: lload 2
      // 352: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: athrow
      // 358: aload 26
      // 35a: lload 9
      // 35c: bipush 1
      // 35d: anewarray 185
      // 360: dup_x2
      // 361: dup_x2
      // 362: pop
      // 363: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 366: bipush 0
      // 367: swap
      // 368: aastore
      // 369: ldc2_w -8948454850538899686
      // 36c: lload 2
      // 36d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 372: istore 23
      // 374: aload 26
      // 376: astore 24
      // 378: iinc 25 -1
      // 37b: aload 21
      // 37d: ifnonnull 08d
      // 380: aload 22
      // 382: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 385: areturn
   }

   tf() {
   }

   boolean e(Object[] param1) {
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
      // 0c: getstatic com/zelix/tf.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 109106001197922
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2043419497605522651
      // 1e: lload 2
      // 1f: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: astore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: ldc2_w -1800269334802253983
      // 2f: lload 2
      // 30: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/_82; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: arraylength
      // 36: if_icmpge 95
      // 39: aload 0
      // 3a: ldc2_w -1800269334802253983
      // 3d: lload 2
      // 3e: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/_82; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: iload 7
      // 45: aaload
      // 46: lload 4
      // 48: bipush 1
      // 49: anewarray 185
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 0
      // 53: swap
      // 54: aastore
      // 55: ldc2_w -2069182467379393858
      // 58: lload 2
      // 59: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 6
      // 60: lload 2
      // 61: lconst_0
      // 62: lcmp
      // 63: iflt 6b
      // 66: ifnull 9c
      // 69: aload 6
      // 6b: ifnull 8c
      // 6e: goto 7b
      // 71: ldc2_w -100644476130540952
      // 74: lload 2
      // 75: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: ifeq 8d
      // 7e: goto 8b
      // 81: ldc2_w -100644476130540952
      // 84: lload 2
      // 85: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: bipush 1
      // 8c: ireturn
      // 8d: iinc 7 1
      // 90: aload 6
      // 92: ifnonnull 29
      // 95: lload 2
      // 96: lconst_0
      // 97: lcmp
      // 98: ifle 39
      // 9b: bipush 0
      // 9c: ireturn
   }

   static {
      long var5 = b ^ 49687143486338L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "@Q¨\u009fT@<°Y`\nCWæ\u0005t@VÿÅ\u0011ÔK\u0086\u0018\u0014\u001c¸ÏgÄÛ)Y\u009b$¥4\u0000ÚF`\u00100¸½^êÖ\u0015é\u0084Ïê@¸»#\u0005`\u0096ðö\u0086ä[þÜ}\u0013$\u00825À¨\u0006Ó¾ ç¦ýhÇWÈ*m\u009a6½<\"qè´|\u0005°K\u0019¹½@üA!\u009fÅT\u009aÄÒø\"\b¬0ì;O\u001e(\u0087? °§\u0010¹â§\u0082\u0013\u0016ê¢>\u001c22n\u008en;8C@Æ¾Ý\u009d\u0004@\u008bBt¨rny¼Ç8%0\u008bÚ~øK\u000fC?íu\u0089\u009bÑ²q)Q\u009f\u0080SGwq¢O{Á|®\u007fyÀ^Æå÷heJ9EÈ\u008dI\u0099·2\u0085Ê\u00ad\u000fü4¹\u0099Ê.×\tä¾\u000b\\-»¸´LÕú¢÷ØßÄk\u0094\u0018ÂÎÍaXçúö¬2\u0002\u0081\u009c\u0080\u0089-ß>[¹m±\u009d)À\u007fê\u0094hÛ|>%ª\u0015I1\u0085À6\u0087\u0001\u0010\t1ýU\tC\u0015µÿå,Üøm]aà û5";
      int var13 = "@Q¨\u009fT@<°Y`\nCWæ\u0005t@VÿÅ\u0011ÔK\u0086\u0018\u0014\u001c¸ÏgÄÛ)Y\u009b$¥4\u0000ÚF`\u00100¸½^êÖ\u0015é\u0084Ïê@¸»#\u0005`\u0096ðö\u0086ä[þÜ}\u0013$\u00825À¨\u0006Ó¾ ç¦ýhÇWÈ*m\u009a6½<\"qè´|\u0005°K\u0019¹½@üA!\u009fÅT\u009aÄÒø\"\b¬0ì;O\u001e(\u0087? °§\u0010¹â§\u0082\u0013\u0016ê¢>\u001c22n\u008en;8C@Æ¾Ý\u009d\u0004@\u008bBt¨rny¼Ç8%0\u008bÚ~øK\u000fC?íu\u0089\u009bÑ²q)Q\u009f\u0080SGwq¢O{Á|®\u007fyÀ^Æå÷heJ9EÈ\u008dI\u0099·2\u0085Ê\u00ad\u000fü4¹\u0099Ê.×\tä¾\u000b\\-»¸´LÕú¢÷ØßÄk\u0094\u0018ÂÎÍaXçúö¬2\u0002\u0081\u009c\u0080\u0089-ß>[¹m±\u009d)À\u007fê\u0094hÛ|>%ª\u0015I1\u0085À6\u0087\u0001\u0010\t1ýU\tC\u0015µÿå,Üøm]aà û5"
         .length();
      char var10 = 128;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     c = var14;
                     e = new String[6];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -2344849500328214623L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)((int)(var2 >>> 56)),
                           (byte)((int)(var2 >>> 48)),
                           (byte)((int)(var2 >>> 40)),
                           (byte)((int)(var2 >>> 32)),
                           (byte)((int)(var2 >>> 24)),
                           (byte)((int)(var2 >>> 16)),
                           (byte)((int)(var2 >>> 8)),
                           (byte)((int)var2)
                        }
                     );
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     g = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = ",K´]ýç\u00ad0\u0097vHZT\u0018ÈR0ô\u0018\u0001;¾\u009enF7M\u00ad\u0093RºIÖ¿:5\u001eU\u009b\u001eN¬d\u0094ëÅ³\u0018\u00adTÿ`£\u0005±(©?\u008e:\u00ad'Þ\r½";
                  var13 = ",K´]ýç\u00ad0\u0097vHZT\u0018ÈR0ô\u0018\u0001;¾\u009enF7M\u00ad\u0093RºIÖ¿:5\u001eU\u009b\u001eN¬d\u0094ëÅ³\u0018\u00adTÿ`£\u0005±(©?\u008e:\u00ad'Þ\r½"
                     .length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5784;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/tf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/tf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
