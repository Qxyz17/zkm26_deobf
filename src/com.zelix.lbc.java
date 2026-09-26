package com.zelix;

import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
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
import javax.swing.JButton;
import javax.swing.JLabel;

public class lbc extends lb8 implements ClipboardOwner {
   JLabel c;
   FontMetrics i;
   Frame b;
   JButton E;
   JButton U;
   private static final long a = prr.a(211196278083956572L, -4924520489924614455L, MethodHandles.lookup().lookupClass()).a(177015042325652L);
   private static final String[] h;
   private static final String[] j;
   private static final Map k = new HashMap(13);
   private static final long[] l;
   private static final Integer[] m;
   private static final Map n;

   public void F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      Clipboard var4 = m44.a<"s">(m44.a<"l">(-2544202965568911210L, var2), -4121370352874528150L, var2);
      m44.a<"s">(
         var4, new StringSelection(m44.a<"s">(m44.a<"r">(this, -2358591074435775520L, var2), -2552749214158427764L, var2)), this, -4567562281022713561L, var2
      );
   }

   @Override
   public void lostOwnership(Clipboard var1, Transferable var2) {
   }

   public lbc(Frame param1, String param2, long param3, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/lbc.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 9999164581224
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 65250692117311
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 98129473429844
      // 019: lxor
      // 01a: lstore 10
      // 01c: dup2
      // 01d: ldc2_w 6686921396625
      // 020: lxor
      // 021: lstore 12
      // 023: dup2
      // 024: ldc2_w 117701550126205
      // 027: lxor
      // 028: lstore 14
      // 02a: pop2
      // 02b: aload 0
      // 02c: aload 1
      // 02d: aload 2
      // 02e: bipush 1
      // 02f: invokespecial com/zelix/lb8.<init> (Ljava/awt/Frame;Ljava/lang/String;Z)V
      // 032: aload 0
      // 033: aload 1
      // 034: ldc2_w 8828037727681581494
      // 037: lload 3
      // 038: invokedynamic r (Ljava/lang/Object;Ljava/awt/Frame;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 0
      // 03e: ldc2_w 9055759172850984541
      // 041: lload 3
      // 042: invokedynamic q (Ljava/lang/Object;JJ)Ljava/awt/Container; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: astore 17
      // 049: new com/zelix/ah
      // 04c: dup
      // 04d: aload 17
      // 04f: lload 14
      // 051: invokespecial com/zelix/ah.<init> (Ljava/awt/Container;J)V
      // 054: astore 18
      // 056: ldc2_w 8932848105969472659
      // 059: lload 3
      // 05a: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: aload 17
      // 061: aload 18
      // 063: ldc2_w 7374446039707474603
      // 066: lload 3
      // 067: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aload 0
      // 06d: new javax/swing/JLabel
      // 070: dup
      // 071: aload 5
      // 073: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 076: bipush 0
      // 077: invokespecial javax/swing/JLabel.<init> (Ljava/lang/String;I)V
      // 07a: ldc2_w 8768220645537015050
      // 07d: lload 3
      // 07e: invokedynamic r (Ljava/lang/Object;Ljavax/swing/JLabel;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: aload 17
      // 085: aload 0
      // 086: ldc2_w 8768220645537015050
      // 089: lload 3
      // 08a: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JLabel; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: sipush 3729
      // 092: ldc2_w 2298429667633793363
      // 095: lload 3
      // 096: lxor
      // 097: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: ldc2_w 9157611899103527014
      // 09f: lload 3
      // 0a0: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: aload 0
      // 0a6: new javax/swing/JButton
      // 0a9: dup
      // 0aa: sipush 14247
      // 0ad: ldc2_w 7360729965306523746
      // 0b0: lload 3
      // 0b1: lxor
      // 0b2: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: invokespecial javax/swing/JButton.<init> (Ljava/lang/String;)V
      // 0ba: ldc2_w 8840691525414663219
      // 0bd: lload 3
      // 0be: invokedynamic r (Ljava/lang/Object;Ljavax/swing/JButton;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: aload 17
      // 0c5: aload 0
      // 0c6: ldc2_w 8840691525414663219
      // 0c9: lload 3
      // 0ca: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: sipush 13514
      // 0d2: ldc2_w 1360794122149212937
      // 0d5: lload 3
      // 0d6: lxor
      // 0d7: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: ldc2_w 9157611899103527014
      // 0df: lload 3
      // 0e0: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: aload 0
      // 0e6: new javax/swing/JButton
      // 0e9: dup
      // 0ea: sipush 1853
      // 0ed: ldc2_w 6862548308941865203
      // 0f0: lload 3
      // 0f1: lxor
      // 0f2: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: invokespecial javax/swing/JButton.<init> (Ljava/lang/String;)V
      // 0fa: ldc2_w 9184918867374648719
      // 0fd: lload 3
      // 0fe: invokedynamic r (Ljava/lang/Object;Ljavax/swing/JButton;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: astore 16
      // 105: aload 17
      // 107: aload 0
      // 108: ldc2_w 9184918867374648719
      // 10b: lload 3
      // 10c: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: sipush 3085
      // 114: ldc2_w 580328931485780941
      // 117: lload 3
      // 118: lxor
      // 119: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: ldc2_w 9157611899103527014
      // 121: lload 3
      // 122: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: aload 0
      // 128: ldc2_w 9184918867374648719
      // 12b: lload 3
      // 12c: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: sipush 224
      // 134: ldc2_w 1304532743302252321
      // 137: lload 3
      // 138: lxor
      // 139: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: lload 6
      // 140: bipush 2
      // 141: anewarray 485
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 0
      // 150: swap
      // 151: aastore
      // 152: ldc2_w 7029267166260706130
      // 155: lload 3
      // 156: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: ldc2_w 9038661996125231444
      // 15e: lload 3
      // 15f: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: aload 16
      // 166: ifnull 1e3
      // 169: aload 1
      // 16a: ifnonnull 1b3
      // 16d: goto 17a
      // 170: ldc2_w 6934604010388513885
      // 173: lload 3
      // 174: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: aload 0
      // 17b: new java/awt/Font
      // 17e: dup
      // 17f: sipush 4936
      // 182: ldc2_w 1801771931307021454
      // 185: lload 3
      // 186: lxor
      // 187: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: bipush 0
      // 18d: sipush 32357
      // 190: ldc2_w 9161729603912605303
      // 193: lload 3
      // 194: lxor
      // 195: invokedynamic r (IJ)I bsm=com/zelix/lbc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: invokespecial java/awt/Font.<init> (Ljava/lang/String;II)V
      // 19d: ldc2_w 7428115971023192710
      // 1a0: lload 3
      // 1a1: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: goto 1b3
      // 1a9: ldc2_w 6934604010388513885
      // 1ac: lload 3
      // 1ad: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: aload 0
      // 1b5: ldc2_w 8768220645537015050
      // 1b8: lload 3
      // 1b9: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JLabel; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: aload 0
      // 1bf: ldc2_w 8768220645537015050
      // 1c2: lload 3
      // 1c3: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JLabel; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: ldc2_w 9084160438380395585
      // 1cb: lload 3
      // 1cc: invokedynamic q (Ljava/lang/Object;JJ)Ljava/awt/Font; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: ldc2_w 9152089878612987977
      // 1d4: lload 3
      // 1d5: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/awt/FontMetrics; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: ldc2_w 9104046331683092311
      // 1dd: lload 3
      // 1de: invokedynamic r (Ljava/lang/Object;Ljava/awt/FontMetrics;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: aload 0
      // 1e4: ldc2_w 9104046331683092311
      // 1e7: lload 3
      // 1e8: invokedynamic p (Ljava/lang/Object;JJ)Ljava/awt/FontMetrics; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: aload 5
      // 1ef: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1f2: ldc2_w 7351019985803209805
      // 1f5: lload 3
      // 1f6: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: istore 19
      // 1fd: sipush 31899
      // 200: sipush 3038
      // 203: ldc2_w 1065546174529399758
      // 206: lload 3
      // 207: lxor
      // 208: invokedynamic r (IJ)I bsm=com/zelix/lbc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: iload 19
      // 20f: sipush 24806
      // 212: ldc2_w 4251561990202196213
      // 215: lload 3
      // 216: lxor
      // 217: invokedynamic r (IJ)I bsm=com/zelix/lbc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: iadd
      // 21d: invokestatic java/lang/Math.max (II)I
      // 220: istore 20
      // 222: ldc2_w 3443660227034053460
      // 225: lload 3
      // 226: lxor
      // 227: aload 0
      // 228: ldc2_w 9104046331683092311
      // 22b: lload 3
      // 22c: invokedynamic p (Ljava/lang/Object;JJ)Ljava/awt/FontMetrics; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: ldc2_w 7374407082618507686
      // 234: lload 3
      // 235: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: istore 21
      // 23c: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: sipush 31692
      // 244: ldc2_w 4346944277777513483
      // 247: lload 3
      // 248: lxor
      // 249: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: iload 20
      // 250: ldc2_w 9048848909336088604
      // 253: lload 3
      // 254: invokedynamic n (IJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: ldc2_w 7280198178228931145
      // 25c: lload 3
      // 25d: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: sipush 7479
      // 265: ldc2_w 2072642444266347251
      // 268: lload 3
      // 269: lxor
      // 26a: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/lbc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: iload 21
      // 271: ldc2_w 9048848909336088604
      // 274: lload 3
      // 275: invokedynamic n (IJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: ldc2_w 7280198178228931145
      // 27d: lload 3
      // 27e: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: astore 22
      // 285: aload 18
      // 287: aload 22
      // 289: lload 10
      // 28b: bipush 2
      // 28c: anewarray 485
      // 28f: dup_x2
      // 290: dup_x2
      // 291: pop
      // 292: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 295: bipush 1
      // 296: swap
      // 297: aastore
      // 298: dup_x1
      // 299: swap
      // 29a: bipush 0
      // 29b: swap
      // 29c: aastore
      // 29d: ldc2_w 7445709449585626072
      // 2a0: lload 3
      // 2a1: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a6: aload 0
      // 2a7: iload 20
      // 2a9: sipush 29488
      // 2ac: ldc2_w 8308349451603776293
      // 2af: lload 3
      // 2b0: lxor
      // 2b1: invokedynamic r (IJ)I bsm=com/zelix/lbc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: iload 21
      // 2b8: sipush 26461
      // 2bb: ldc2_w 3080400462303594316
      // 2be: lload 3
      // 2bf: lxor
      // 2c0: invokedynamic r (IJ)I bsm=com/zelix/lbc.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: imul
      // 2c6: invokestatic java/lang/Math.max (II)I
      // 2c9: ldc2_w 7233317488596908669
      // 2cc: lload 3
      // 2cd: invokedynamic q (Ljava/lang/Object;IIJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d2: new com/zelix/lkg
      // 2d5: dup
      // 2d6: aload 0
      // 2d7: invokespecial com/zelix/lkg.<init> (Lcom/zelix/lbc;)V
      // 2da: astore 23
      // 2dc: aload 0
      // 2dd: aload 23
      // 2df: ldc2_w 9197918181753398386
      // 2e2: lload 3
      // 2e3: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: new com/zelix/lm6
      // 2eb: dup
      // 2ec: aload 0
      // 2ed: invokespecial com/zelix/lm6.<init> (Lcom/zelix/lbc;)V
      // 2f0: astore 24
      // 2f2: aload 0
      // 2f3: ldc2_w 8840691525414663219
      // 2f6: lload 3
      // 2f7: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: aload 24
      // 2fe: ldc2_w 7270863008870637028
      // 301: lload 3
      // 302: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: aload 0
      // 308: ldc2_w 9184918867374648719
      // 30b: lload 3
      // 30c: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: aload 24
      // 313: ldc2_w 7270863008870637028
      // 316: lload 3
      // 317: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: new com/zelix/lo9
      // 31f: dup
      // 320: aload 0
      // 321: invokespecial com/zelix/lo9.<init> (Lcom/zelix/lbc;)V
      // 324: astore 25
      // 326: aload 0
      // 327: ldc2_w 8840691525414663219
      // 32a: lload 3
      // 32b: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: aload 25
      // 332: ldc2_w 6962406300666037143
      // 335: lload 3
      // 336: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: aload 0
      // 33c: ldc2_w 9184918867374648719
      // 33f: lload 3
      // 340: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: aload 25
      // 347: ldc2_w 6962406300666037143
      // 34a: lload 3
      // 34b: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: aload 0
      // 351: ldc2_w 9026196471412699171
      // 354: lload 3
      // 355: invokedynamic q (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: astore 26
      // 35c: aload 1
      // 35d: ldc2_w 7380213107560274073
      // 360: lload 3
      // 361: invokedynamic q (Ljava/lang/Object;JJ)Ljava/awt/Point; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: astore 27
      // 368: aload 1
      // 369: ldc2_w 7320949264647554499
      // 36c: lload 3
      // 36d: invokedynamic q (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 372: astore 28
      // 374: aload 28
      // 376: ldc2_w 7433630970480188079
      // 379: lload 3
      // 37a: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37f: bipush 2
      // 380: idiv
      // 381: aload 26
      // 383: ldc2_w 7433630970480188079
      // 386: lload 3
      // 387: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38c: bipush 2
      // 38d: idiv
      // 38e: isub
      // 38f: aload 27
      // 391: ldc2_w 7476130655403621647
      // 394: lload 3
      // 395: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39a: iadd
      // 39b: istore 29
      // 39d: aload 28
      // 39f: ldc2_w 8830568413911304574
      // 3a2: lload 3
      // 3a3: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: bipush 2
      // 3a9: idiv
      // 3aa: aload 26
      // 3ac: ldc2_w 8830568413911304574
      // 3af: lload 3
      // 3b0: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b5: bipush 2
      // 3b6: idiv
      // 3b7: isub
      // 3b8: aload 27
      // 3ba: ldc2_w 9162901769111172190
      // 3bd: lload 3
      // 3be: invokedynamic p (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c3: iadd
      // 3c4: istore 30
      // 3c6: bipush 0
      // 3c7: iload 29
      // 3c9: invokestatic java/lang/Math.max (II)I
      // 3cc: istore 29
      // 3ce: bipush 0
      // 3cf: iload 30
      // 3d1: invokestatic java/lang/Math.max (II)I
      // 3d4: istore 30
      // 3d6: aload 0
      // 3d7: iload 29
      // 3d9: iload 30
      // 3db: ldc2_w 7114921838541125339
      // 3de: lload 3
      // 3df: invokedynamic q (Ljava/lang/Object;IIJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e4: aload 0
      // 3e5: ldc2_w 8840691525414663219
      // 3e8: lload 3
      // 3e9: invokedynamic p (Ljava/lang/Object;JJ)Ljavax/swing/JButton; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ee: lload 12
      // 3f0: bipush 2
      // 3f1: anewarray 485
      // 3f4: dup_x2
      // 3f5: dup_x2
      // 3f6: pop
      // 3f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3fa: bipush 1
      // 3fb: swap
      // 3fc: aastore
      // 3fd: dup_x1
      // 3fe: swap
      // 3ff: bipush 0
      // 400: swap
      // 401: aastore
      // 402: ldc2_w 8928741409876284694
      // 405: lload 3
      // 406: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40b: lload 8
      // 40d: aload 0
      // 40e: bipush 1
      // 40f: bipush 3
      // 410: anewarray 485
      // 413: dup_x1
      // 414: swap
      // 415: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 418: bipush 2
      // 419: swap
      // 41a: aastore
      // 41b: dup_x1
      // 41c: swap
      // 41d: bipush 1
      // 41e: swap
      // 41f: aastore
      // 420: dup_x2
      // 421: dup_x2
      // 422: pop
      // 423: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 426: bipush 0
      // 427: swap
      // 428: aastore
      // 429: ldc2_w 8864804537571294560
      // 42c: lload 3
      // 42d: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 432: lload 3
      // 433: lconst_0
      // 434: lcmp
      // 435: ifle 448
      // 438: aload 16
      // 43a: ifnonnull 455
      // 43d: ldc "zP7b6b"
      // 43f: ldc2_w 7035023517358522402
      // 442: lload 3
      // 443: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: goto 455
      // 44b: ldc2_w 6934604010388513885
      // 44e: lload 3
      // 44f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 454: athrow
      // 455: return
   }

   public static void S(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/awt/Frame
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/String
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 5
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast java/lang/String
      // 21: astore 1
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast java/lang/Boolean
      // 28: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2b: istore 3
      // 2c: pop
      // 2d: getstatic com/zelix/lbc.a J
      // 30: lload 5
      // 32: lxor
      // 33: lstore 5
      // 35: lload 5
      // 37: dup2
      // 38: ldc2_w 95679191114798
      // 3b: lxor
      // 3c: lstore 7
      // 3e: pop2
      // 3f: ldc2_w 3870432936691079890
      // 42: lload 5
      // 44: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: new com/zelix/lo8
      // 4c: dup
      // 4d: aload 4
      // 4f: aload 2
      // 50: aload 1
      // 51: invokespecial com/zelix/lo8.<init> (Ljava/awt/Frame;Ljava/lang/String;Ljava/lang/String;)V
      // 54: astore 10
      // 56: astore 9
      // 58: iload 3
      // 59: aload 9
      // 5b: ifnull 79
      // 5e: ifeq ca
      // 61: goto 6f
      // 64: ldc2_w 3350108175428856348
      // 67: lload 5
      // 69: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: ldc2_w 3868420061280639358
      // 72: lload 5
      // 74: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: ifne a9
      // 7c: aload 10
      // 7e: ldc2_w 3374879461505609017
      // 81: lload 5
      // 83: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: goto e4
      // 8b: ldc2_w 3350108175428856348
      // 8e: lload 5
      // 90: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: astore 11
      // 98: goto e4
      // 9b: astore 11
      // 9d: aload 9
      // 9f: lload 5
      // a1: lconst_0
      // a2: lcmp
      // a3: ifle b9
      // a6: ifnonnull e4
      // a9: new com/zelix/lbc
      // ac: dup
      // ad: aload 4
      // af: aload 2
      // b0: lload 7
      // b2: aload 1
      // b3: invokespecial com/zelix/lbc.<init> (Ljava/awt/Frame;Ljava/lang/String;JLjava/lang/String;)V
      // b6: pop
      // b7: aload 9
      // b9: ifnonnull e4
      // bc: goto ca
      // bf: ldc2_w 3350108175428856348
      // c2: lload 5
      // c4: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: athrow
      // ca: aload 10
      // cc: ldc2_w 3733898514123470220
      // cf: lload 5
      // d1: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: goto e4
      // d9: ldc2_w 3350108175428856348
      // dc: lload 5
      // de: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: athrow
      // e4: return
   }

   public void O(Object[] var1) {
      long var2 = (Long)var1[0];
      m44.a<"t">(this, false, -574682712446246940L, var2);
      m44.a<"t">(this, -1787763919456260535L, var2);
   }

   public static void L(Object[] var0) {
      Frame var4 = (Frame)var0[0];
      long var1 = (Long)var0[1];
      String var3 = (String)var0[2];
      String var5 = (String)var0[3];
      var1 = a ^ var1;
      long var6 = var1 ^ 57285076278315L;
      Object[] var10006 = new Object[]{null, null, null, var5, false};
      var10006[2] = var6;
      var10006[1] = var3;
      var10006[0] = var4;
      m44.a<"k">(var10006, -4594186392935271542L, var1);
   }

   static {
      long var11 = a ^ 72120798494083L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[10];
      int var18 = 0;
      String var17 = "hÎ\u0096-\u0098mD\u008b!Íô+Â\u0005\u0084Ì\u0010h\u000eqÔ\tU\u0005zfîù\u0092\u0003\u0006ôÎ\u00100C\u0099\u0081àAO\u008eª\u0082\ná\u008e\u0087è¦\u0010\u008d\u008eu\u001c#Ø£ìÎj\u0089ú\u0083¬ð%\u0010\u008952\u00ad\u000e?Ö\u0001{\u0019\rG\u0098Êf\u0086\u0010=\u0080³yý\u001a²Û\u0016\u0081\u008cóâð*ë §\u0019''L\u0019\u009f\u008fßÉa\u008fI±>\u0083X·Â@ôùI\br®+R8i\u0003}\u0010\u0005\u0012Ô¢\u0002«¬uO4a\u0092öÙËÌ";
      int var19 = "hÎ\u0096-\u0098mD\u008b!Íô+Â\u0005\u0084Ì\u0010h\u000eqÔ\tU\u0005zfîù\u0092\u0003\u0006ôÎ\u00100C\u0099\u0081àAO\u008eª\u0082\ná\u008e\u0087è¦\u0010\u008d\u008eu\u001c#Ø£ìÎj\u0089ú\u0083¬ð%\u0010\u008952\u00ad\u000e?Ö\u0001{\u0019\rG\u0098Êf\u0086\u0010=\u0080³yý\u001a²Û\u0016\u0081\u008cóâð*ë §\u0019''L\u0019\u009f\u008fßÉa\u008fI±>\u0083X·Â@ôùI\br®+R8i\u0003}\u0010\u0005\u0012Ô¢\u0002«¬uO4a\u0092öÙËÌ"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     h = var20;
                     j = new String[10];
                     n = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "NËý\u0000Sÿp¼xñÜ!Á\u0099\u001aé\rEÎD½Á\u001bJ";
                     int var5 = "NËý\u0000Sÿp¼xñÜ!Á\u0099\u001aé\rEÎD½Á\u001bJ".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    l = var6;
                                    m = new Integer[5];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "¢mw\u0015Ñ>\u001a\u0084>RÜ\u0093ªjî\u0096";
                                 var5 = "¢mw\u0015Ñ>\u001a\u0084>RÜ\u0093ªjî\u0096".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "r\u0007(<¢3Vb_\u0006\\÷Ð¸kË\u0082#¸?\u0094þ)\u0088°Öâhû;\u0006Z9\u0011\u0093\u0097\b<|\u0085À\u008dQÑÐW\u0099×\u0096}®\u0010§I\u001bNÌ86Í\\=NÆ\u001d&CÐævCG\u0000b\u0091\u0088\u000e\u009d»Ð\r2\"\u009d9±!Z%\u0087µ\u0017ß \u0085h3ªÕ\u00845`dðñ@M£\u009c\u000bÇmû¿¼å\u0095ãÊòñØ\"fÝ\u0018çi\u008aÀyÉ@gÈ)±»ç9\u001aB\u0001$\u0012á]æ\fx\u0017l\u008d\u0095¼\f\u009f\u001d4\u001a^øm\u0014kþû\u0011ÝÞ\u008f\u0098\u0017Ú/\u0018<ß*}²À«\u0092)íÍÊÓ\br\u00071\u00ad\u008bÛ-\u0093WÈ\u009e\r\nÔïÞê\u0096¦p\u0010T#ùµ\u001f1¯IMÃÆÎÙëól\u0003g\u007fe²XÖ\u00ad[âåA\u0000í2ïï\u0099V\u009d\u008aBÂ¾îÑ¡þ?X?³\u009e@\u001d)&vÓPôÐ¿\u0011],±D4¾\u0016±6dMÓY#]§\u00adÂà\u008c'¸¸Å\u001c\u0005ï\u0084Å¦ðyþ¢\u0019Sm¡ÂßF\u0090L/É\u0098¢i¸sý^WWj3å\u000e\u0002á\u0099Ý\u008dÅ8û¤ãt¹áGäÂh\u0094Öï\u0016à \u0016¾p(ã5Dxp0³²ÆU\u0005sª½I\tq-G67\u0012f¼Ö\u009aG\u0082Ð*«CÓú\u008cÕÁ<\u0004%àïáU³\u001bPÄ½|M(J³'H´ù\u0094\u0003Ö\u0086\u0099#Bk]ú«\u009cà²\u0016Ð¥ÆR¥Ç\u009eÀ5Õww\u0006ò-Õ#_x-v\u0097÷iLµéÀhEuX\u007f\u00941\u008d\u008cÑ\u0094ôFÚÁÜ\u0093 ºìû6\u008e \u0096ï·7\u0010ú\r\u0094Ë[\u0098ò¿AN3Þ°jáB\u0094t\u0000\tÌ \u0086\u00035Y\u0007§N7\u0083Ý3x×\u008eJ5\u009fë.zz\u008d\u0006G\u0094º9\u0011\u001b¶L2<maÜ¦ê¡Ë\u0093Õ\u0080Ï\u00ad7\u0083eÆtÌ\u001fõÇ&ô;×·«E,½nF\u008e¸±ü\u001dãöyç\u0017\u0003\u008aÈK1\u0000m\u009c²\u0096ðÝ²´ \u009d\u009f»côÕØ\u009f¿ÌÂàÛ\u009e£\u009aÎÖ'Y\u0014ü\u0084È\u0088ÊBÄÛ¼ÖÔv(ê}ay@tb\"yý:\u007fÅ\u0094\u007f\u0092>H7\u00ad*¼Ñ9·n½ç.8é\u0001 \u001e\u0097\u001cª©È°å\u0016\u001fD«¸Ä\u008cPMm\u0002[\u009fò\u0004\u009d\u0010\u0004©\u009fÍ\u0018¢w²]Z\u0091úÔã\u00101Y@y\u0013I\u0006bþùDÿº8ïè";
                  var19 = "r\u0007(<¢3Vb_\u0006\\÷Ð¸kË\u0082#¸?\u0094þ)\u0088°Öâhû;\u0006Z9\u0011\u0093\u0097\b<|\u0085À\u008dQÑÐW\u0099×\u0096}®\u0010§I\u001bNÌ86Í\\=NÆ\u001d&CÐævCG\u0000b\u0091\u0088\u000e\u009d»Ð\r2\"\u009d9±!Z%\u0087µ\u0017ß \u0085h3ªÕ\u00845`dðñ@M£\u009c\u000bÇmû¿¼å\u0095ãÊòñØ\"fÝ\u0018çi\u008aÀyÉ@gÈ)±»ç9\u001aB\u0001$\u0012á]æ\fx\u0017l\u008d\u0095¼\f\u009f\u001d4\u001a^øm\u0014kþû\u0011ÝÞ\u008f\u0098\u0017Ú/\u0018<ß*}²À«\u0092)íÍÊÓ\br\u00071\u00ad\u008bÛ-\u0093WÈ\u009e\r\nÔïÞê\u0096¦p\u0010T#ùµ\u001f1¯IMÃÆÎÙëól\u0003g\u007fe²XÖ\u00ad[âåA\u0000í2ïï\u0099V\u009d\u008aBÂ¾îÑ¡þ?X?³\u009e@\u001d)&vÓPôÐ¿\u0011],±D4¾\u0016±6dMÓY#]§\u00adÂà\u008c'¸¸Å\u001c\u0005ï\u0084Å¦ðyþ¢\u0019Sm¡ÂßF\u0090L/É\u0098¢i¸sý^WWj3å\u000e\u0002á\u0099Ý\u008dÅ8û¤ãt¹áGäÂh\u0094Öï\u0016à \u0016¾p(ã5Dxp0³²ÆU\u0005sª½I\tq-G67\u0012f¼Ö\u009aG\u0082Ð*«CÓú\u008cÕÁ<\u0004%àïáU³\u001bPÄ½|M(J³'H´ù\u0094\u0003Ö\u0086\u0099#Bk]ú«\u009cà²\u0016Ð¥ÆR¥Ç\u009eÀ5Õww\u0006ò-Õ#_x-v\u0097÷iLµéÀhEuX\u007f\u00941\u008d\u008cÑ\u0094ôFÚÁÜ\u0093 ºìû6\u008e \u0096ï·7\u0010ú\r\u0094Ë[\u0098ò¿AN3Þ°jáB\u0094t\u0000\tÌ \u0086\u00035Y\u0007§N7\u0083Ý3x×\u008eJ5\u009fë.zz\u008d\u0006G\u0094º9\u0011\u001b¶L2<maÜ¦ê¡Ë\u0093Õ\u0080Ï\u00ad7\u0083eÆtÌ\u001fõÇ&ô;×·«E,½nF\u008e¸±ü\u001dãöyç\u0017\u0003\u008aÈK1\u0000m\u009c²\u0096ðÝ²´ \u009d\u009f»côÕØ\u009f¿ÌÂàÛ\u009e£\u009aÎÖ'Y\u0014ü\u0084È\u0088ÊBÄÛ¼ÖÔv(ê}ay@tb\"yý:\u007fÅ\u0094\u007f\u0092>H7\u00ad*¼Ñ9·n½ç.8é\u0001 \u001e\u0097\u001cª©È°å\u0016\u001fD«¸Ä\u008cPMm\u0002[\u009fò\u0004\u009d\u0010\u0004©\u009fÍ\u0018¢w²]Z\u0091úÔã\u00101Y@y\u0013I\u0006bþùDÿº8ïè"
                     .length();
                  var16 = 704;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29686;
      if (j[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/lbc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         j[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return j[var5];
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
         throw new RuntimeException("com/zelix/lbc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5152;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lbc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/lbc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
