package com.zelix;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.lang.invoke.MethodHandles;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _xt extends Canvas {
   private Vector F;
   private int q;
   private int I;
   private boolean D;
   static int C;
   private FontMetrics X;
   private int N;
   private String H;
   private static final long a = ess.a(-6286875833779657106L, -2110927273320877878L, MethodHandles.lookup().lookupClass()).a(203357065522644L);
   private static final String b;

   @Override
   public Dimension getMinimumSize() {
      long var1 = a ^ 2821848623689L;
      long var3 = var1 ^ 85503020438306L;
      return new Dimension(x44.a<"n">(this, 5961487515519530875L, var1), x44.a<"j">(this, new Object[]{var3}, 5256241965447446053L, var1));
   }

   public int n(Object[] param1) {
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
      // 0c: getstatic com/zelix/_xt.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 95218004206899
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -599070566509715584
      // 1e: lload 2
      // 1f: invokedynamic p (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnull 6c
      // 2c: ldc2_w -1195188077374957731
      // 2f: lload 2
      // 30: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: ifne 6b
      // 38: goto 45
      // 3b: ldc2_w -1583748143626660740
      // 3e: lload 2
      // 3f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: aload 0
      // 46: lload 4
      // 48: bipush 1
      // 49: anewarray 155
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 0
      // 53: swap
      // 54: aastore
      // 55: ldc2_w -1395382748096953807
      // 58: lload 2
      // 59: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: goto 6b
      // 61: ldc2_w -1583748143626660740
      // 64: lload 2
      // 65: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 0
      // 6c: ldc2_w -851205165666234282
      // 6f: lload 2
      // 70: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: aload 6
      // 77: ifnull a9
      // 7a: ifnonnull 92
      // 7d: goto 8a
      // 80: ldc2_w -1583748143626660740
      // 83: lload 2
      // 84: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: bipush 0
      // 8b: istore 7
      // 8d: aload 6
      // 8f: ifnonnull ce
      // 92: aload 0
      // 93: ldc2_w -851205165666234282
      // 96: lload 2
      // 97: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: goto a9
      // 9f: ldc2_w -1583748143626660740
      // a2: lload 2
      // a3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: athrow
      // a9: invokevirtual java/util/Vector.size ()I
      // ac: aload 0
      // ad: ldc2_w -1353991492900584924
      // b0: lload 2
      // b1: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: aload 0
      // b7: ldc2_w -893646503789621467
      // ba: lload 2
      // bb: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: iadd
      // c1: ldc2_w -1327775170484347940
      // c4: lload 2
      // c5: invokedynamic i (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: iadd
      // cb: imul
      // cc: istore 7
      // ce: iload 7
      // d0: ireturn
   }

   @Override
   public Dimension getPreferredSize() {
      long var1 = a ^ 1573132060154L;
      return x44.a<"i">(this, -2224595708979933408L, var1);
   }

   @Override
   public void update(Graphics var1) {
      long var2 = a ^ 89371593333660L;
      x44.a<"o">(this, var1, 7322707249648807366L, var2);
   }

   void k(Object[] param1) {
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
      // 00c: getstatic com/zelix/_xt.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: aload 0
      // 013: new java/util/Vector
      // 016: dup
      // 017: invokespecial java/util/Vector.<init> ()V
      // 01a: ldc2_w 8979206218223917285
      // 01d: lload 2
      // 01e: invokedynamic p (Ljava/lang/Object;Ljava/util/Vector;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: new java/util/StringTokenizer
      // 026: dup
      // 027: aload 0
      // 028: ldc2_w 6930955080403382088
      // 02b: lload 2
      // 02c: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: getstatic com/zelix/_xt.b Ljava/lang/String;
      // 034: bipush 1
      // 035: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 038: astore 5
      // 03a: new java/lang/StringBuffer
      // 03d: dup
      // 03e: invokespecial java/lang/StringBuffer.<init> ()V
      // 041: astore 6
      // 043: ldc2_w 9159417209074767667
      // 046: lload 2
      // 047: invokedynamic s (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: bipush 0
      // 04d: istore 7
      // 04f: astore 4
      // 051: aload 5
      // 053: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 056: istore 8
      // 058: bipush 0
      // 059: istore 9
      // 05b: iload 9
      // 05d: iload 8
      // 05f: if_icmpge 1ee
      // 062: aload 5
      // 064: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 067: astore 10
      // 069: aload 10
      // 06b: lload 2
      // 06c: lconst_0
      // 06d: lcmp
      // 06e: iflt 0da
      // 071: ldc "\n"
      // 073: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 076: aload 4
      // 078: ifnull 0d0
      // 07b: ifne 0b4
      // 07e: goto 08b
      // 081: ldc2_w 7112873101615520975
      // 084: lload 2
      // 085: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: aload 10
      // 08d: ldc "\r"
      // 08f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 092: aload 4
      // 094: ifnull 0ff
      // 097: goto 0a4
      // 09a: ldc2_w 7112873101615520975
      // 09d: lload 2
      // 09e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: ifeq 0dd
      // 0a7: goto 0b4
      // 0aa: ldc2_w 7112873101615520975
      // 0ad: lload 2
      // 0ae: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: ldc2_w 8979206218223917285
      // 0b8: lload 2
      // 0b9: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: aload 6
      // 0c0: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 0c3: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 0c6: new java/lang/StringBuffer
      // 0c9: dup
      // 0ca: invokespecial java/lang/StringBuffer.<init> ()V
      // 0cd: astore 6
      // 0cf: bipush 0
      // 0d0: istore 7
      // 0d2: lload 2
      // 0d3: lconst_0
      // 0d4: lcmp
      // 0d5: ifle 1ad
      // 0d8: aload 4
      // 0da: ifnonnull 1ad
      // 0dd: aload 0
      // 0de: ldc2_w 9183929465991716819
      // 0e1: lload 2
      // 0e2: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/FontMetrics; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: aload 10
      // 0e9: ldc2_w 8980905624961396271
      // 0ec: lload 2
      // 0ed: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: goto 0ff
      // 0f5: ldc2_w 7112873101615520975
      // 0f8: lload 2
      // 0f9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: istore 11
      // 101: iload 7
      // 103: iload 11
      // 105: iadd
      // 106: istore 7
      // 108: iload 7
      // 10a: aload 4
      // 10c: lload 2
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: iflt 173
      // 112: ifnull 171
      // 115: aload 0
      // 116: ldc2_w 7253731187599835498
      // 119: lload 2
      // 11a: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: if_icmpgt 14f
      // 122: goto 12f
      // 125: ldc2_w 7112873101615520975
      // 128: lload 2
      // 129: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: aload 6
      // 131: aload 10
      // 133: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 136: pop
      // 137: lload 2
      // 138: lconst_0
      // 139: lcmp
      // 13a: iflt 1ad
      // 13d: aload 4
      // 13f: ifnonnull 1ad
      // 142: goto 14f
      // 145: ldc2_w 7112873101615520975
      // 148: lload 2
      // 149: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 0
      // 150: ldc2_w 8979206218223917285
      // 153: lload 2
      // 154: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: aload 6
      // 15b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 15e: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 161: new java/lang/StringBuffer
      // 164: dup
      // 165: invokespecial java/lang/StringBuffer.<init> ()V
      // 168: astore 6
      // 16a: aload 10
      // 16c: ldc " "
      // 16e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 171: aload 4
      // 173: ifnull 1ab
      // 176: ifne 19d
      // 179: goto 186
      // 17c: ldc2_w 7112873101615520975
      // 17f: lload 2
      // 180: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 6
      // 188: aload 10
      // 18a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 18d: pop
      // 18e: iload 11
      // 190: istore 7
      // 192: lload 2
      // 193: lconst_0
      // 194: lcmp
      // 195: iflt 1ad
      // 198: aload 4
      // 19a: ifnonnull 1ad
      // 19d: bipush 0
      // 19e: goto 1ab
      // 1a1: ldc2_w 7112873101615520975
      // 1a4: lload 2
      // 1a5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: istore 7
      // 1ad: lload 2
      // 1ae: lconst_0
      // 1af: lcmp
      // 1b0: iflt 1e9
      // 1b3: iload 9
      // 1b5: iload 8
      // 1b7: bipush 1
      // 1b8: isub
      // 1b9: if_icmpne 1db
      // 1bc: aload 0
      // 1bd: ldc2_w 8979206218223917285
      // 1c0: lload 2
      // 1c1: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: aload 6
      // 1c8: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1cb: invokevirtual java/util/Vector.addElement (Ljava/lang/Object;)V
      // 1ce: goto 1db
      // 1d1: ldc2_w 7112873101615520975
      // 1d4: lload 2
      // 1d5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: aload 0
      // 1dc: bipush 1
      // 1dd: ldc2_w 7483491456209068014
      // 1e0: lload 2
      // 1e1: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: iinc 9 1
      // 1e9: aload 4
      // 1eb: ifnonnull 05b
      // 1ee: return
   }

   public _xt(String var1, int var2, Font var3, long var4) {
      var4 = a ^ var4;
      super();
      x44.a<"q">(this, var1, -4812466994784816559L, var4);
      x44.a<"q">(this, var2, -5065579546219029389L, var4);
      x44.a<"j">(this, var3, -5139222100294943239L, var4);
      x44.a<"q">(this, x44.a<"j">(this, x44.a<"j">(this, -6734048761434166354L, var4), -6391000151599250699L, var4), -6743362982618398006L, var4);
      x44.a<"q">(this, x44.a<"j">(x44.a<"n">(this, -6743362982618398006L, var4), -4881458314342240013L, var4), -5143147249187432562L, var4);
      x44.a<"q">(this, x44.a<"j">(x44.a<"n">(this, -6743362982618398006L, var4), -6747711301442123162L, var4), -6470731448373683569L, var4);
   }

   @Override
   public void paint(Graphics param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_xt.a J
      // 03: ldc2_w 136571049003940
      // 06: lxor
      // 07: lstore 2
      // 08: lload 2
      // 09: dup2
      // 0a: ldc2_w 95062557375100
      // 0d: lxor
      // 0e: lstore 4
      // 10: pop2
      // 11: ldc2_w 7557229920836665551
      // 14: lload 2
      // 15: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a: astore 6
      // 1c: aload 0
      // 1d: aload 6
      // 1f: ifnull 62
      // 22: ldc2_w 8081382059302389778
      // 25: lload 2
      // 26: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: ifne 61
      // 2e: goto 3b
      // 31: ldc2_w 8451679356502494003
      // 34: lload 2
      // 35: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: aload 0
      // 3c: lload 4
      // 3e: bipush 1
      // 3f: anewarray 155
      // 42: dup_x2
      // 43: dup_x2
      // 44: pop
      // 45: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 48: bipush 0
      // 49: swap
      // 4a: aastore
      // 4b: ldc2_w 8353502364583239038
      // 4e: lload 2
      // 4f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: goto 61
      // 57: ldc2_w 8451679356502494003
      // 5a: lload 2
      // 5b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: ldc2_w 8253724497217021038
      // 65: lload 2
      // 66: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: astore 7
      // 6d: aload 1
      // 6e: bipush 0
      // 6f: bipush 0
      // 70: aload 7
      // 72: ldc2_w 7534971518122430497
      // 75: lload 2
      // 76: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: aload 7
      // 7d: ldc2_w 7754898456151596675
      // 80: lload 2
      // 81: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: ldc2_w 7774662532423935375
      // 89: lload 2
      // 8a: invokedynamic o (Ljava/lang/Object;IIIIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: aload 0
      // 90: ldc2_w 8249089311264546155
      // 93: lload 2
      // 94: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: istore 8
      // 9b: bipush 0
      // 9c: istore 9
      // 9e: iload 9
      // a0: aload 0
      // a1: ldc2_w 7737440920347021081
      // a4: lload 2
      // a5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: invokevirtual java/util/Vector.size ()I
      // ad: if_icmpge ff
      // b0: aload 0
      // b1: ldc2_w 7737440920347021081
      // b4: lload 2
      // b5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: iload 9
      // bc: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // bf: checkcast java/lang/String
      // c2: astore 10
      // c4: aload 1
      // c5: aload 10
      // c7: bipush 0
      // c8: iload 8
      // ca: ldc2_w 7692915004033771166
      // cd: lload 2
      // ce: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;IIJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: iload 8
      // d5: aload 0
      // d6: ldc2_w 8249089311264546155
      // d9: lload 2
      // da: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // df: aload 0
      // e0: ldc2_w 7842492984799924330
      // e3: lload 2
      // e4: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e9: iadd
      // ea: ldc2_w 8276995340919751827
      // ed: lload 2
      // ee: invokedynamic n (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f3: iadd
      // f4: iadd
      // f5: istore 8
      // f7: iinc 9 1
      // fa: aload 6
      // fc: ifnonnull 9e
      // ff: return
   }

   @Override
   public synchronized void setBounds(int var1, int var2, int var3, int var4) {
      long var5 = a ^ 114520366432761L;
      super.setBounds(var1, var2, var3, var4);
      x44.a<"q">(this, x44.a<"n">(x44.a<"j">(this, 8707158616434634291L, var5), 7119219859967285884L, var5), 8722100259888405707L, var5);
   }

   @Override
   public void validate() {
      long var1 = a ^ 140244475760617L;
      super.validate();
      x44.a<"j">(this, 8021136436100349666L, var1);
   }

   @Override
   public void invalidate() {
      long var1 = a ^ 20263137311750L;
      super.invalidate();
      x44.a<"v">(this, false, 5153446675383730096L, var1);
   }

   static {
      long var3 = a ^ 70124608768825L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var3 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var3 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var2 = var0.doFinal("c\u0088\f\n?z\u00adÊ".getBytes("ISO-8859-1"));
      String var5 = a(var2).intern();
      byte var10001 = -1;
      b = var5;
      x44.a<"s">(1, -990641720940280818L, var3);
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
}
