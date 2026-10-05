package com.zelix;

import java.io.DataOutputStream;
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

public class ii extends h8 {
   private final mu[] i;
   private final h2 N;
   private mq o;
   private static final long a = ess.a(5161097473295595892L, -1844745528254196353L, MethodHandles.lookup().lookupClass()).a(101311723411199L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   ii(h8 param1, int param2, short param3, _xx param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 3
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 5
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: getstatic com/zelix/ii.a J
      // 01b: lxor
      // 01c: lstore 6
      // 01e: lload 6
      // 020: dup2
      // 021: ldc2_w 85529612306884
      // 024: lxor
      // 025: dup2
      // 026: bipush 8
      // 028: lushr
      // 029: lstore 8
      // 02b: dup2
      // 02c: bipush 56
      // 02e: lshl
      // 02f: bipush 56
      // 031: lushr
      // 032: l2i
      // 033: istore 10
      // 035: pop2
      // 036: dup2
      // 037: ldc2_w 12791882537259
      // 03a: lxor
      // 03b: lstore 11
      // 03d: dup2
      // 03e: ldc2_w 5448536846971
      // 041: lxor
      // 042: lstore 13
      // 044: dup2
      // 045: ldc2_w 38805868034809
      // 048: lxor
      // 049: lstore 15
      // 04b: dup2
      // 04c: ldc2_w 92074985633654
      // 04f: lxor
      // 050: lstore 17
      // 052: dup2
      // 053: ldc2_w 12791882537259
      // 056: lxor
      // 057: lstore 19
      // 059: dup2
      // 05a: ldc2_w 46594358255288
      // 05d: lxor
      // 05e: lstore 21
      // 060: pop2
      // 061: ldc2_w 7175044487137351638
      // 064: lload 6
      // 066: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: aload 0
      // 06c: aload 1
      // 06d: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 070: istore 23
      // 072: aload 4
      // 074: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 077: istore 24
      // 079: aload 1
      // 07a: lload 8
      // 07c: iload 24
      // 07e: iload 10
      // 080: i2b
      // 081: invokevirtual com/zelix/h8.N (JIB)Lcom/zelix/xl;
      // 084: astore 25
      // 086: aload 25
      // 088: iload 23
      // 08a: ifne 0f9
      // 08d: ifnonnull 0f7
      // 090: goto 09e
      // 093: ldc2_w 7188536535567795064
      // 096: lload 6
      // 098: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: new com/zelix/_sx
      // 0a1: dup
      // 0a2: new java/lang/StringBuilder
      // 0a5: dup
      // 0a6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a9: aload 1
      // 0aa: lload 17
      // 0ac: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 0af: lload 19
      // 0b1: ldc2_w 7413034736145196514
      // 0b4: lload 6
      // 0b6: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: sipush 18192
      // 0c1: ldc2_w 7669831279349473836
      // 0c4: lload 6
      // 0c6: lxor
      // 0c7: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: iload 24
      // 0d1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d4: sipush 18339
      // 0d7: ldc2_w 4049092938971095696
      // 0da: lload 6
      // 0dc: lxor
      // 0dd: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e8: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 0eb: athrow
      // 0ec: ldc2_w 7188536535567795064
      // 0ef: lload 6
      // 0f1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 25
      // 0f9: instanceof com/zelix/mq
      // 0fc: iload 23
      // 0fe: ifne 1aa
      // 101: ifne 187
      // 104: goto 112
      // 107: ldc2_w 7188536535567795064
      // 10a: lload 6
      // 10c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: new com/zelix/_sx
      // 115: dup
      // 116: new java/lang/StringBuilder
      // 119: dup
      // 11a: invokespecial java/lang/StringBuilder.<init> ()V
      // 11d: aload 1
      // 11e: lload 17
      // 120: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 123: lload 19
      // 125: ldc2_w 7413034736145196514
      // 128: lload 6
      // 12a: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 132: sipush 30325
      // 135: ldc2_w 7539968447581819720
      // 138: lload 6
      // 13a: lxor
      // 13b: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: iload 24
      // 145: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 148: sipush 776
      // 14b: ldc2_w 1668311522435819062
      // 14e: lload 6
      // 150: lxor
      // 151: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: aload 25
      // 15b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 15e: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 161: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 164: sipush 22433
      // 167: ldc2_w 6677515906764059294
      // 16a: lload 6
      // 16c: lxor
      // 16d: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 175: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 178: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 17b: athrow
      // 17c: ldc2_w 7188536535567795064
      // 17f: lload 6
      // 181: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 0
      // 188: aload 25
      // 18a: checkcast com/zelix/mq
      // 18d: ldc2_w 8908662592106891047
      // 190: lload 6
      // 192: invokedynamic w (Ljava/lang/Object;Lcom/zelix/mq;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: aload 0
      // 198: new com/zelix/h2
      // 19b: dup
      // 19c: aload 0
      // 19d: aload 4
      // 19f: invokespecial com/zelix/h2.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;)V
      // 1a2: putfield com/zelix/ii.N Lcom/zelix/h2;
      // 1a5: aload 4
      // 1a7: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 1aa: istore 26
      // 1ac: aload 0
      // 1ad: iload 26
      // 1af: anewarray 52
      // 1b2: putfield com/zelix/ii.i [Lcom/zelix/mu;
      // 1b5: bipush 0
      // 1b6: istore 27
      // 1b8: iload 27
      // 1ba: iload 26
      // 1bc: if_icmpge 2fb
      // 1bf: aload 4
      // 1c1: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 1c4: istore 28
      // 1c6: aload 1
      // 1c7: lload 8
      // 1c9: iload 28
      // 1cb: iload 10
      // 1cd: i2b
      // 1ce: invokevirtual com/zelix/h8.N (JIB)Lcom/zelix/xl;
      // 1d1: iload 3
      // 1d2: ifge 1de
      // 1d5: astore 25
      // 1d7: iload 23
      // 1d9: ifne 41e
      // 1dc: aload 25
      // 1de: iload 3
      // 1df: ifgt 261
      // 1e2: iload 23
      // 1e4: ifne 261
      // 1e7: goto 1f5
      // 1ea: ldc2_w 7188536535567795064
      // 1ed: lload 6
      // 1ef: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: athrow
      // 1f5: ifnonnull 25f
      // 1f8: goto 206
      // 1fb: ldc2_w 7188536535567795064
      // 1fe: lload 6
      // 200: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: athrow
      // 206: new com/zelix/_sx
      // 209: dup
      // 20a: new java/lang/StringBuilder
      // 20d: dup
      // 20e: invokespecial java/lang/StringBuilder.<init> ()V
      // 211: aload 1
      // 212: lload 17
      // 214: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 217: lload 19
      // 219: ldc2_w 7413034736145196514
      // 21c: lload 6
      // 21e: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 226: sipush 31580
      // 229: ldc2_w 2935085802731642478
      // 22c: lload 6
      // 22e: lxor
      // 22f: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 237: iload 28
      // 239: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 23c: sipush 4684
      // 23f: ldc2_w 8133451952652810109
      // 242: lload 6
      // 244: lxor
      // 245: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 250: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 253: athrow
      // 254: ldc2_w 7188536535567795064
      // 257: lload 6
      // 259: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: athrow
      // 25f: aload 25
      // 261: instanceof com/zelix/mu
      // 264: iload 2
      // 265: iflt 2f8
      // 268: ifne 2e0
      // 26b: new com/zelix/_sx
      // 26e: dup
      // 26f: new java/lang/StringBuilder
      // 272: dup
      // 273: invokespecial java/lang/StringBuilder.<init> ()V
      // 276: aload 1
      // 277: lload 17
      // 279: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 27c: lload 19
      // 27e: ldc2_w 7413034736145196514
      // 281: lload 6
      // 283: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28b: sipush 382
      // 28e: ldc2_w 8721389531520820298
      // 291: lload 6
      // 293: lxor
      // 294: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29c: iload 28
      // 29e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2a1: sipush 13453
      // 2a4: ldc2_w 2436670437622960568
      // 2a7: lload 6
      // 2a9: lxor
      // 2aa: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b2: aload 25
      // 2b4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2b7: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 2ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bd: sipush 1267
      // 2c0: ldc2_w 1748997125916582341
      // 2c3: lload 6
      // 2c5: lxor
      // 2c6: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ce: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d1: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 2d4: athrow
      // 2d5: ldc2_w 7188536535567795064
      // 2d8: lload 6
      // 2da: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: athrow
      // 2e0: aload 0
      // 2e1: ldc2_w 8668570767788427163
      // 2e4: lload 6
      // 2e6: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/mu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: iload 27
      // 2ed: aload 25
      // 2ef: checkcast com/zelix/mu
      // 2f2: aastore
      // 2f3: iinc 27 1
      // 2f6: iload 23
      // 2f8: ifeq 1b8
      // 2fb: aload 0
      // 2fc: ldc2_w 8668570767788427163
      // 2ff: lload 6
      // 301: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/mu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 306: lload 21
      // 308: dup2_x1
      // 309: pop2
      // 30a: bipush 2
      // 30b: anewarray 122
      // 30e: dup_x1
      // 30f: swap
      // 310: bipush 1
      // 311: swap
      // 312: aastore
      // 313: dup_x2
      // 314: dup_x2
      // 315: pop
      // 316: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 319: bipush 0
      // 31a: swap
      // 31b: aastore
      // 31c: ldc2_w 9201271939668524736
      // 31f: lload 6
      // 321: invokedynamic t (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 326: iload 5
      // 328: ifgt 1c4
      // 32b: ifne 41e
      // 32e: new java/lang/StringBuilder
      // 331: dup
      // 332: invokespecial java/lang/StringBuilder.<init> ()V
      // 335: astore 27
      // 337: aload 27
      // 339: sipush 15014
      // 33c: ldc2_w 3106983113288605585
      // 33f: lload 6
      // 341: lxor
      // 342: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34a: pop
      // 34b: aload 27
      // 34d: aload 0
      // 34e: lload 11
      // 350: invokevirtual com/zelix/ii.j (J)Ljava/lang/String;
      // 353: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 356: pop
      // 357: aload 27
      // 359: sipush 29342
      // 35c: ldc2_w 1202028418722535342
      // 35f: lload 6
      // 361: lxor
      // 362: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36a: pop
      // 36b: bipush 0
      // 36c: istore 28
      // 36e: iload 28
      // 370: aload 0
      // 371: ldc2_w 8668570767788427163
      // 374: lload 6
      // 376: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/mu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37b: arraylength
      // 37c: if_icmpge 406
      // 37f: aload 27
      // 381: aload 0
      // 382: ldc2_w 8668570767788427163
      // 385: lload 6
      // 387: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/mu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38c: iload 28
      // 38e: aaload
      // 38f: lload 15
      // 391: ldc2_w 7215011677342240425
      // 394: lload 6
      // 396: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39e: pop
      // 39f: iload 23
      // 3a1: iload 3
      // 3a2: ifge 403
      // 3a5: ifne 401
      // 3a8: iload 28
      // 3aa: aload 0
      // 3ab: ldc2_w 8668570767788427163
      // 3ae: lload 6
      // 3b0: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/mu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b5: arraylength
      // 3b6: bipush 1
      // 3b7: isub
      // 3b8: iload 23
      // 3ba: ifne 40c
      // 3bd: goto 3cb
      // 3c0: ldc2_w 7188536535567795064
      // 3c3: lload 6
      // 3c5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: athrow
      // 3cb: if_icmpge 3fe
      // 3ce: goto 3dc
      // 3d1: ldc2_w 7188536535567795064
      // 3d4: lload 6
      // 3d6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3db: athrow
      // 3dc: aload 27
      // 3de: sipush 19674
      // 3e1: ldc2_w 6148024025498102242
      // 3e4: lload 6
      // 3e6: lxor
      // 3e7: invokedynamic a (IJ)Ljava/lang/String; bsm=com/zelix/ii.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ef: pop
      // 3f0: goto 3fe
      // 3f3: ldc2_w 7188536535567795064
      // 3f6: lload 6
      // 3f8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: athrow
      // 3fe: iinc 28 1
      // 401: iload 23
      // 403: ifeq 36e
      // 406: bipush 0
      // 407: iload 2
      // 408: ifle 3a1
      // 40b: bipush 1
      // 40c: anewarray 7
      // 40f: dup
      // 410: bipush 0
      // 411: aload 27
      // 413: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 416: aastore
      // 417: lload 13
      // 419: dup2_x2
      // 41a: pop2
      // 41b: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 41e: return
   }

   void n(Object[] var1) {
      DataOutputStream var5 = (DataOutputStream)var1[0];
      Map var2 = (Map)var1[1];
      long var3 = (Long)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 104774639311294L;
      x44.a<"i">(this, new Object[]{var5, var6}, -7174643405496605183L, var3);
   }

   void E(Object[] var1) {
      DataOutputStream var2 = (DataOutputStream)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      var2.writeShort(x44.a<"n">(this, 7761876059142788913L, var3).B());
      var2.writeShort(x44.a<"n">(this, 8294710872185178608L, var3).n());
      var2.writeShort(x44.a<"n">(this, 7519506579173562253L, var3).length);
      boolean var10000 = x44.a<"r">(8323976720280799168L, var3);
      mu[] var6 = x44.a<"n">(this, 7519506579173562253L, var3);
      int var7 = var6.length;
      boolean var5 = var10000;
      int var8 = 0;

      while (var8 < var7) {
         mu var9 = var6[var8];
         var2.writeShort(var9.B());
         var8++;
         if (var5) {
            break;
         }
      }
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      long var6 = var1 ^ 80221771876344L;
      x44.a<"o">(x44.a<"k">(this, -6727627796098818524L, var1), var4, var3, this, this.x(), -6599028033534739226L, var1);
      mu[] var9 = x44.a<"k">(this, -6823036534519325032L, var1);
      boolean var10000 = x44.a<"w">(-5003033307729260843L, var1);
      int var10 = var9.length;
      boolean var8 = var10000;
      int var11 = 0;

      while (var11 < var10) {
         mu var12 = var9[var11];
         x44.a<"o">(var12, var6, var3, this, this.x(), -5178934465796767516L, var1);
         var11++;
         if (var8) {
            break;
         }
      }
   }

   static {
      long var0 = a ^ 42566159596534L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "\u008e\tÈîy¤mM\u0097²Ç\u0003¶-Â\u008d®&3\u0006Ò\u0018\u000b¤z&\u0006\u009cÐizµØ£5\u0089ûË\\}\u0010\b.Û\u0096¬#õ\u009dõÞÚ\u0014&7\u0088`@µ\u008f\u0087ºe\u009c\u00983ËG\u008cO\u0088¾ç\u008bD;9ÿE*GÅ\u0098\u008d4\u0084\u000bzqç¬r\u0086q$\\\u0091\u008d¥\f;\u0004\u0006\u0086Wè\u0016TéñÎç[\u001f^ªgC#+\u0084Y@¨0r\u001aÿ\u0015nÛÓ®.Å\u009c.Å±\fù'\u0003s\u0097hÝGÐ\u001er2Á\u0086E\u0090\u0005´`h7ÉË\u0005÷\u0006râ\u000e\u0005\u0086èì@k×,\u008c{\u0011\u009c(o\u0016åS:H/t\u008a(\fn=÷1\u0012j\u00ad³\u0006r¿ËÛu\u0003\u001e\u009f7\u001c.ãø\u0097¹\u008eÑîý½ðµH}\u009d+£¨æ\u0083\u0017Ó`äÊ^ÕúËñ\u008eþò\u0080°è%Äa\u0093î\u007f\u001b£,õó|@\u0098´ÍtÓ\u001c\u001b¡²Å\u0098Ô9}þá \u0004j(ÃT\u0095DÓgi¾jÜ\u001d\\\u0098\röñoê¸\u000e¯#\u008dWï¦j\u009aÎ\u001c\bv\u0014:²*\u0095Fz£<Á\u0095áPÜã0Ì7&\u008e/þ\u0093F¢\u0091ýw²vy\u0082ë¤h\u0003v[Ø\u0098\u00804\r¶d}É{ÈAðc\u009f\u0085\u0096l\u009f\f\u00141m²5xÚ\u0006\r4\u0015ýjÿL¨O3\u0018f¾:7\u009d\u001aÁ¯\u0083\u0002`\u0081Eí\u0010\u00948ºbG\u0012\u0004.\u000b&Y2\u0097ü\u0000×\u0081¿\u0099^ÎJ¹ã\u0086ÒrÙ¥{â^Àâ\u0097êÙ\nH¼\u0000Ï«çìÂZ\u009eªO\u001bè\u00812K\u0001Ï\u000fP¿ØqLZf~ÿVÎ¤{»ïåUuÙ+±\bß\u008apÜ0Â>\u0097Õ¤\u0015¿ò7\u001d£WÔ\u009d¶òü\u0013þ)ÊñÊLCD{³^\u0087ë>\u0085ø·Oì=G\u001b>¹$G=ôQ\rS-\u0000.\u0090k(\u0016ç\u0081?\u009aëry+\u0096¦°ûWöfÞ\rx\u001aE\u0084-\u0093Hx&óîñ=ûÚ\u0013ûª\u0091×½ü\u0010c\bñ°\u0080¡ »\u0017\u0018\u007f7Ò¿aÌ";
      int var8 = "\u008e\tÈîy¤mM\u0097²Ç\u0003¶-Â\u008d®&3\u0006Ò\u0018\u000b¤z&\u0006\u009cÐizµØ£5\u0089ûË\\}\u0010\b.Û\u0096¬#õ\u009dõÞÚ\u0014&7\u0088`@µ\u008f\u0087ºe\u009c\u00983ËG\u008cO\u0088¾ç\u008bD;9ÿE*GÅ\u0098\u008d4\u0084\u000bzqç¬r\u0086q$\\\u0091\u008d¥\f;\u0004\u0006\u0086Wè\u0016TéñÎç[\u001f^ªgC#+\u0084Y@¨0r\u001aÿ\u0015nÛÓ®.Å\u009c.Å±\fù'\u0003s\u0097hÝGÐ\u001er2Á\u0086E\u0090\u0005´`h7ÉË\u0005÷\u0006râ\u000e\u0005\u0086èì@k×,\u008c{\u0011\u009c(o\u0016åS:H/t\u008a(\fn=÷1\u0012j\u00ad³\u0006r¿ËÛu\u0003\u001e\u009f7\u001c.ãø\u0097¹\u008eÑîý½ðµH}\u009d+£¨æ\u0083\u0017Ó`äÊ^ÕúËñ\u008eþò\u0080°è%Äa\u0093î\u007f\u001b£,õó|@\u0098´ÍtÓ\u001c\u001b¡²Å\u0098Ô9}þá \u0004j(ÃT\u0095DÓgi¾jÜ\u001d\\\u0098\röñoê¸\u000e¯#\u008dWï¦j\u009aÎ\u001c\bv\u0014:²*\u0095Fz£<Á\u0095áPÜã0Ì7&\u008e/þ\u0093F¢\u0091ýw²vy\u0082ë¤h\u0003v[Ø\u0098\u00804\r¶d}É{ÈAðc\u009f\u0085\u0096l\u009f\f\u00141m²5xÚ\u0006\r4\u0015ýjÿL¨O3\u0018f¾:7\u009d\u001aÁ¯\u0083\u0002`\u0081Eí\u0010\u00948ºbG\u0012\u0004.\u000b&Y2\u0097ü\u0000×\u0081¿\u0099^ÎJ¹ã\u0086ÒrÙ¥{â^Àâ\u0097êÙ\nH¼\u0000Ï«çìÂZ\u009eªO\u001bè\u00812K\u0001Ï\u000fP¿ØqLZf~ÿVÎ¤{»ïåUuÙ+±\bß\u008apÜ0Â>\u0097Õ¤\u0015¿ò7\u001d£WÔ\u009d¶òü\u0013þ)ÊñÊLCD{³^\u0087ë>\u0085ø·Oì=G\u001b>¹$G=ôQ\rS-\u0000.\u0090k(\u0016ç\u0081?\u009aëry+\u0096¦°ûWöfÞ\rx\u001aE\u0084-\u0093Hx&óîñ=ûÚ\u0013ûª\u0091×½ü\u0010c\bñ°\u0080¡ »\u0017\u0018\u007f7Ò¿aÌ"
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
                     c = new String[13];
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

                  var6 = "\"fn$¤û+üF\u0090n\u0013«ð®7[\u0084ýï*\u0092ÿùxk°]\u0081·qÓ`ZÉ\u009d\u008b¡È&\u001cÆù<ã\u0094¤«ÆØ\u0013§\u0086êÛ\u008dñ_ñ-\u0084¼\u0086w\u0010\u000f\u0003\u001aµ`ß\u009a\u0094\u0095!mÇ\u0018Ú\u009eh";
                  var8 = "\"fn$¤û+üF\u0090n\u0013«ð®7[\u0084ýï*\u0092ÿùxk°]\u0081·qÓ`ZÉ\u009d\u008b¡È&\u001cÆù<ã\u0094¤«ÆØ\u0013§\u0086êÛ\u008dñ_ñ-\u0084¼\u0086w\u0010\u000f\u0003\u001aµ`ß\u009a\u0094\u0095!mÇ\u0018Ú\u009eh"
                     .length();
                  var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6003;
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
            throw new RuntimeException("com/zelix/ii", var10);
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
         throw new RuntimeException("com/zelix/ii" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
