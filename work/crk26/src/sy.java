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

public class sy extends _4 implements ni {
   private final kt n;
   private x8 X;
   private x6 k;
   private static final long a = prr.a(-7040618358614435484L, 3195317424705782208L, MethodHandles.lookup().lookupClass()).a(124297506163922L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   sy(_4 param1, h1 param2, long param3, l6q param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/sy.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 75998737342431
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 77620601599157
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 4731361456534
      // 019: lxor
      // 01a: lstore 10
      // 01c: dup2
      // 01d: ldc2_w 110067955012817
      // 020: lxor
      // 021: lstore 12
      // 023: pop2
      // 024: ldc2_w 8847211143991331727
      // 027: lload 3
      // 028: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: aload 1
      // 02f: invokespecial com/zelix/_4.<init> (Lcom/zelix/_4;)V
      // 032: aload 2
      // 033: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 036: istore 15
      // 038: istore 14
      // 03a: aload 1
      // 03b: lload 10
      // 03d: iload 15
      // 03f: invokevirtual com/zelix/_4.m (JI)Lcom/zelix/js;
      // 042: astore 16
      // 044: aload 16
      // 046: iload 14
      // 048: ifeq 0b2
      // 04b: ifnonnull 0b0
      // 04e: goto 05b
      // 051: ldc2_w 7180023481207583041
      // 054: lload 3
      // 055: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: new com/zelix/aw
      // 05e: dup
      // 05f: new java/lang/StringBuilder
      // 062: dup
      // 063: invokespecial java/lang/StringBuilder.<init> ()V
      // 066: aload 1
      // 067: lload 8
      // 069: invokevirtual com/zelix/_4.G (J)Lcom/zelix/_v;
      // 06c: lload 6
      // 06e: ldc2_w 8683905336336746531
      // 071: lload 3
      // 072: invokedynamic q (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: sipush 13654
      // 07d: ldc2_w 8551904928223790767
      // 080: lload 3
      // 081: lxor
      // 082: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: iload 15
      // 08c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 08f: sipush 25239
      // 092: ldc2_w 1425344656732901739
      // 095: lload 3
      // 096: lxor
      // 097: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a2: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 0a5: athrow
      // 0a6: ldc2_w 7180023481207583041
      // 0a9: lload 3
      // 0aa: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 16
      // 0b2: instanceof com/zelix/x6
      // 0b5: iload 14
      // 0b7: ifeq 15a
      // 0ba: ifne 13a
      // 0bd: goto 0ca
      // 0c0: ldc2_w 7180023481207583041
      // 0c3: lload 3
      // 0c4: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: new com/zelix/aw
      // 0cd: dup
      // 0ce: new java/lang/StringBuilder
      // 0d1: dup
      // 0d2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d5: aload 1
      // 0d6: lload 8
      // 0d8: invokevirtual com/zelix/_4.G (J)Lcom/zelix/_v;
      // 0db: lload 6
      // 0dd: ldc2_w 8683905336336746531
      // 0e0: lload 3
      // 0e1: invokedynamic q (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: sipush 17037
      // 0ec: ldc2_w 2373542820643205501
      // 0ef: lload 3
      // 0f0: lxor
      // 0f1: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: iload 15
      // 0fb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0fe: sipush 6058
      // 101: ldc2_w 3333319001068479568
      // 104: lload 3
      // 105: lxor
      // 106: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: aload 16
      // 110: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 113: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 119: sipush 30617
      // 11c: ldc2_w 7561019114860168295
      // 11f: lload 3
      // 120: lxor
      // 121: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 129: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12c: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 12f: athrow
      // 130: ldc2_w 7180023481207583041
      // 133: lload 3
      // 134: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 0
      // 13b: aload 16
      // 13d: checkcast com/zelix/x6
      // 140: ldc2_w 8977109358534434460
      // 143: lload 3
      // 144: invokedynamic r (Ljava/lang/Object;Lcom/zelix/x6;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: aload 0
      // 14a: new com/zelix/kt
      // 14d: dup
      // 14e: aload 0
      // 14f: aload 2
      // 150: invokespecial com/zelix/kt.<init> (Lcom/zelix/_4;Lcom/zelix/h1;)V
      // 153: putfield com/zelix/sy.n Lcom/zelix/kt;
      // 156: aload 2
      // 157: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 15a: istore 17
      // 15c: iload 17
      // 15e: ifeq 276
      // 161: aload 1
      // 162: lload 10
      // 164: iload 17
      // 166: invokevirtual com/zelix/_4.m (JI)Lcom/zelix/js;
      // 169: astore 18
      // 16b: aload 18
      // 16d: lload 3
      // 16e: lconst_0
      // 16f: lcmp
      // 170: ifle 1df
      // 173: iload 14
      // 175: ifeq 1df
      // 178: ifnonnull 1dd
      // 17b: goto 188
      // 17e: ldc2_w 7180023481207583041
      // 181: lload 3
      // 182: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: athrow
      // 188: new com/zelix/aw
      // 18b: dup
      // 18c: new java/lang/StringBuilder
      // 18f: dup
      // 190: invokespecial java/lang/StringBuilder.<init> ()V
      // 193: aload 1
      // 194: lload 8
      // 196: invokevirtual com/zelix/_4.G (J)Lcom/zelix/_v;
      // 199: lload 6
      // 19b: ldc2_w 8683905336336746531
      // 19e: lload 3
      // 19f: invokedynamic q (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: sipush 29939
      // 1aa: ldc2_w 7088147892736444174
      // 1ad: lload 3
      // 1ae: lxor
      // 1af: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b7: iload 17
      // 1b9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1bc: sipush 6856
      // 1bf: ldc2_w 2019116622090807600
      // 1c2: lload 3
      // 1c3: lxor
      // 1c4: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1cf: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 1d2: athrow
      // 1d3: ldc2_w 7180023481207583041
      // 1d6: lload 3
      // 1d7: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 18
      // 1df: instanceof com/zelix/x8
      // 1e2: ifne 255
      // 1e5: new com/zelix/aw
      // 1e8: dup
      // 1e9: new java/lang/StringBuilder
      // 1ec: dup
      // 1ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f0: aload 1
      // 1f1: lload 8
      // 1f3: invokevirtual com/zelix/_4.G (J)Lcom/zelix/_v;
      // 1f6: lload 6
      // 1f8: ldc2_w 8683905336336746531
      // 1fb: lload 3
      // 1fc: invokedynamic q (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 204: sipush 31296
      // 207: ldc2_w 1506873671252920763
      // 20a: lload 3
      // 20b: lxor
      // 20c: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 214: iload 17
      // 216: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 219: sipush 19380
      // 21c: ldc2_w 1368553420711589963
      // 21f: lload 3
      // 220: lxor
      // 221: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 229: aload 18
      // 22b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22e: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 231: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 234: sipush 31459
      // 237: ldc2_w 3659833878651128082
      // 23a: lload 3
      // 23b: lxor
      // 23c: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/sy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 244: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 247: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 24a: athrow
      // 24b: ldc2_w 7180023481207583041
      // 24e: lload 3
      // 24f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: athrow
      // 255: aload 0
      // 256: aload 18
      // 258: checkcast com/zelix/x8
      // 25b: ldc2_w 7421430684520545145
      // 25e: lload 3
      // 25f: invokedynamic r (Ljava/lang/Object;Lcom/zelix/x8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: aload 5
      // 266: aload 0
      // 267: ldc2_w 7421430684520545145
      // 26a: lload 3
      // 26b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: aload 0
      // 271: lload 12
      // 273: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 276: return
   }

   void z(gu param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 113240848016893
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w 5618762033536375070
      // 0c: lload 2
      // 0d: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: istore 6
      // 14: aload 1
      // 15: aload 0
      // 16: ldc2_w 6049223664153899514
      // 19: lload 2
      // 1a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/x6; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f: aload 0
      // 20: aload 0
      // 21: invokevirtual com/zelix/sy.H ()Lcom/zelix/_4;
      // 24: lload 4
      // 26: dup2_x1
      // 27: pop2
      // 28: invokevirtual com/zelix/gu.K (Lcom/zelix/js;Ljava/lang/Object;JLjava/lang/Object;)Z
      // 2b: iload 6
      // 2d: ifne 6f
      // 30: pop
      // 31: aload 0
      // 32: ldc2_w 5302995546213438495
      // 35: lload 2
      // 36: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: ifnull 70
      // 3e: goto 4b
      // 41: ldc2_w 5531160218606984743
      // 44: lload 2
      // 45: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 1
      // 4c: aload 0
      // 4d: ldc2_w 5302995546213438495
      // 50: lload 2
      // 51: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: aload 0
      // 57: aload 0
      // 58: invokevirtual com/zelix/sy.H ()Lcom/zelix/_4;
      // 5b: lload 4
      // 5d: dup2_x1
      // 5e: pop2
      // 5f: invokevirtual com/zelix/gu.K (Lcom/zelix/js;Ljava/lang/Object;JLjava/lang/Object;)Z
      // 62: goto 6f
      // 65: ldc2_w 5531160218606984743
      // 68: lload 2
      // 69: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: pop
      // 70: return
   }

   void e(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/io/DataOutputStream
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/sy.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: ldc2_w 8140797144392279070
      // 026: lload 4
      // 028: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 3
      // 02e: aload 0
      // 02f: ldc2_w 7994761583737736442
      // 032: lload 4
      // 034: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/x6; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: invokevirtual com/zelix/x6.E ()I
      // 03c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 03f: istore 6
      // 041: aload 3
      // 042: aload 0
      // 043: ldc2_w 7579043071819464716
      // 046: lload 4
      // 048: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/kt; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: invokevirtual com/zelix/kt.G ()I
      // 050: iload 6
      // 052: ifne 101
      // 055: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 058: aload 0
      // 059: ldc2_w 8401526438668331295
      // 05c: lload 4
      // 05e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: ifnull 0f1
      // 066: goto 074
      // 069: ldc2_w 8197274233188934439
      // 06c: lload 4
      // 06e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: aload 2
      // 075: aload 0
      // 076: ldc2_w 8401526438668331295
      // 079: lload 4
      // 07b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 085: checkcast com/zelix/js
      // 088: astore 7
      // 08a: iload 6
      // 08c: lload 4
      // 08e: lconst_0
      // 08f: lcmp
      // 090: ifle 0c2
      // 093: ifne 0c0
      // 096: aload 7
      // 098: ifnull 0cc
      // 09b: goto 0a9
      // 09e: ldc2_w 8197274233188934439
      // 0a1: lload 4
      // 0a3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 3
      // 0aa: aload 7
      // 0ac: invokevirtual com/zelix/js.E ()I
      // 0af: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0b2: goto 0c0
      // 0b5: ldc2_w 8197274233188934439
      // 0b8: lload 4
      // 0ba: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: iload 6
      // 0c2: lload 4
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 0ee
      // 0c9: ifeq 0ec
      // 0cc: aload 3
      // 0cd: aload 0
      // 0ce: ldc2_w 8401526438668331295
      // 0d1: lload 4
      // 0d3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: invokevirtual com/zelix/x8.E ()I
      // 0db: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0de: goto 0ec
      // 0e1: ldc2_w 8197274233188934439
      // 0e4: lload 4
      // 0e6: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: iload 6
      // 0ee: ifeq 104
      // 0f1: aload 3
      // 0f2: bipush 0
      // 0f3: goto 101
      // 0f6: ldc2_w 8197274233188934439
      // 0f9: lload 4
      // 0fb: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 104: return
   }

   void c(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/sy.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -467609449658677046
      // 1d: lload 2
      // 1e: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: aload 4
      // 25: aload 0
      // 26: ldc2_w -13452104122884647
      // 29: lload 2
      // 2a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/x6; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: invokevirtual com/zelix/x6.E ()I
      // 32: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 35: aload 4
      // 37: aload 0
      // 38: ldc2_w -572793158802747089
      // 3b: lload 2
      // 3c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/kt; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: invokevirtual com/zelix/kt.G ()I
      // 44: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 47: istore 5
      // 49: aload 4
      // 4b: aload 0
      // 4c: ldc2_w -1892888548201826244
      // 4f: lload 2
      // 50: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: iload 5
      // 57: ifeq 82
      // 5a: ifnonnull 78
      // 5d: goto 6a
      // 60: ldc2_w -2242302955991141884
      // 63: lload 2
      // 64: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: bipush 0
      // 6b: goto 85
      // 6e: ldc2_w -2242302955991141884
      // 71: lload 2
      // 72: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: aload 0
      // 79: ldc2_w -1892888548201826244
      // 7c: lload 2
      // 7d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: invokevirtual com/zelix/x8.E ()I
      // 85: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 88: return
   }

   public void q(x8 param1, long param2, x8 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -5231047857311529425
      // 03: lload 2
      // 04: invokedynamic n (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 5
      // 0b: aload 0
      // 0c: ldc2_w -6098373098239936807
      // 0f: lload 2
      // 10: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: lload 2
      // 16: lconst_0
      // 17: lcmp
      // 18: ifle 59
      // 1b: iload 5
      // 1d: ifeq 59
      // 20: ifnull 76
      // 23: goto 30
      // 26: ldc2_w -5907421672036844319
      // 29: lload 2
      // 2a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: aload 0
      // 31: iload 5
      // 33: ifeq 6b
      // 36: goto 43
      // 39: ldc2_w -5907421672036844319
      // 3c: lload 2
      // 3d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: ldc2_w -6098373098239936807
      // 46: lload 2
      // 47: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/x8; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: goto 59
      // 4f: ldc2_w -5907421672036844319
      // 52: lload 2
      // 53: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 1
      // 5a: if_acmpne 76
      // 5d: aload 0
      // 5e: goto 6b
      // 61: ldc2_w -5907421672036844319
      // 64: lload 2
      // 65: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 4
      // 6d: ldc2_w -6098373098239936807
      // 70: lload 2
      // 71: invokedynamic r (Ljava/lang/Object;Lcom/zelix/x8;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: return
   }

   static {
      long var0 = a ^ 135153490961057L;
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
      String var6 = "JÛ\u001fTó\u0091êöOHî4K\u009fç\u0098ÄXòÔ|#ß\u0084ÿ¼Aõ2Ï²ý\u0096ü'(\u0002Ò\t³µ\u000eh§ö\u0090C\t\u008a»f\u001e\u009e³Ëç\\)fßÅ¢\u001f\u0018\b®]®ü\u008c¾ZPzF\u000e_\u0095²\u001ci`\u008c!\u0083ü»e\u0084,üØ\u001cK\u00ad\u0017Í{\u0005Íî\u0010\u0014ü\u0084ïOª¶DiZçô¯hcæ2}C5Øæ&©\u0087á'\u008a·dÉ§¬9\u0016ª\b<s®X`PJ@oÔÆäóý\u0010ÑÐºÂsþ\u009bWR\u000f(\u00044\u0080ç\u0011(G\u0018\u00ad\u009d©'¹ç¶¿õÚÂí\u0090\u009e\u0081¼hfÈ#Ô'Ýçs~dH\tÈ»D7\u0090;Â7èHôYZg\rnp\u0007\u00986\u001aþÚè]\u0097dM¥MDß°ð\u000bD\u0091dä\u0093\u009d\u0088\u0006%X,ê?ÝëAOvqÊ\u0081,ô\u0004ö«\u0004w\u0012fS:ÿ&Z'æ½\u0087\u0003~6P¤1«YH8SB¦»¬+ô\u0089\u0095+\u0014±\u008avV*$M3Gàa¹:ÿ\u008eô\u009e\u001a\u00107Ï´\u0081Îß\\S\u0002sj/\u0096Ý\u0093`L\u009fÛ\u0098M\u009c°*m\u0014?\rì`\u0002e?aêÑ\u0014\u0091Ru\u008d@T\u0010ÈæµV\u009d\u000fð\u009cë\u008d[JTÞÔ#³=$:\u0090ìd\u0084\u009dP\u0095ë\u0007èfQ*H!´uÃïáµ\u008b7\u0083\u0093\\üæ·\u007f¹\u0091È\u0092Ü´ãó4·\u0092a\u0010àAÀM³WQ)Ò\r\u00adJf ®\\";
      int var8 = "JÛ\u001fTó\u0091êöOHî4K\u009fç\u0098ÄXòÔ|#ß\u0084ÿ¼Aõ2Ï²ý\u0096ü'(\u0002Ò\t³µ\u000eh§ö\u0090C\t\u008a»f\u001e\u009e³Ëç\\)fßÅ¢\u001f\u0018\b®]®ü\u008c¾ZPzF\u000e_\u0095²\u001ci`\u008c!\u0083ü»e\u0084,üØ\u001cK\u00ad\u0017Í{\u0005Íî\u0010\u0014ü\u0084ïOª¶DiZçô¯hcæ2}C5Øæ&©\u0087á'\u008a·dÉ§¬9\u0016ª\b<s®X`PJ@oÔÆäóý\u0010ÑÐºÂsþ\u009bWR\u000f(\u00044\u0080ç\u0011(G\u0018\u00ad\u009d©'¹ç¶¿õÚÂí\u0090\u009e\u0081¼hfÈ#Ô'Ýçs~dH\tÈ»D7\u0090;Â7èHôYZg\rnp\u0007\u00986\u001aþÚè]\u0097dM¥MDß°ð\u000bD\u0091dä\u0093\u009d\u0088\u0006%X,ê?ÝëAOvqÊ\u0081,ô\u0004ö«\u0004w\u0012fS:ÿ&Z'æ½\u0087\u0003~6P¤1«YH8SB¦»¬+ô\u0089\u0095+\u0014±\u008avV*$M3Gàa¹:ÿ\u008eô\u009e\u001a\u00107Ï´\u0081Îß\\S\u0002sj/\u0096Ý\u0093`L\u009fÛ\u0098M\u009c°*m\u0014?\rì`\u0002e?aêÑ\u0014\u0091Ru\u008d@T\u0010ÈæµV\u009d\u000fð\u009cë\u008d[JTÞÔ#³=$:\u0090ìd\u0084\u009dP\u0095ë\u0007èfQ*H!´uÃïáµ\u008b7\u0083\u0093\\üæ·\u007f¹\u0091È\u0092Ü´ãó4·\u0092a\u0010àAÀM³WQ)Ò\r\u00adJf ®\\"
         .length();
      char var5 = 'H';
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

                  var6 = "^1$õ\u0016\u00adÞ\u009c¯Z(.\u0017l@ªÆ§\u0002{öÞ¸BJAÝj³ú1ù\u0007=Q\u0092î\u0099\u0097w@Í\\\u0085\n\u001bÜ.TòÌé÷ºÓù\f~àöæ\u0014I¨v\u0086ÿ\u000f\u000fSþåµæ5Ö{E>\u008b\u0017Ü xý9\u0092?K«\u0093k\u00925WïO*³7a;\u0092X§";
                  var8 = "^1$õ\u0016\u00adÞ\u009c¯Z(.\u0017l@ªÆ§\u0002{öÞ¸BJAÝj³ú1ù\u0007=Q\u0092î\u0099\u0097w@Í\\\u0085\n\u001bÜ.TòÌé÷ºÓù\f~àöæ\u0014I¨v\u0086ÿ\u000f\u000fSþåµæ5Ö{E>\u008b\u0017Ü xý9\u0092?K«\u0093k\u00925WïO*³7a;\u0092X§"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23073;
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
            throw new RuntimeException("com/zelix/sy", var10);
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
         throw new RuntimeException("com/zelix/sy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
