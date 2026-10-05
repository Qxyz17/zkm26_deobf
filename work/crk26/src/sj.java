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

public class sj extends _4 implements eo {
   private jf[] X;
   private jf V;
   private static final long a = prr.a(7442855804952200468L, -8960638437553305023L, MethodHandles.lookup().lookupClass()).a(3783433764211L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   sj(_4 param1, h1 param2, long param3, l6q param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/sj.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 44177047070612
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 48015132724478
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 115992228448733
      // 019: lxor
      // 01a: lstore 10
      // 01c: dup2
      // 01d: ldc2_w 10067970665626
      // 020: lxor
      // 021: lstore 12
      // 023: pop2
      // 024: aload 0
      // 025: aload 1
      // 026: invokespecial com/zelix/_4.<init> (Lcom/zelix/_4;)V
      // 029: ldc2_w -2678367690943394253
      // 02c: lload 3
      // 02d: invokedynamic m (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: aload 2
      // 033: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 036: istore 15
      // 038: aload 1
      // 039: lload 10
      // 03b: iload 15
      // 03d: invokevirtual com/zelix/_4.m (JI)Lcom/zelix/js;
      // 040: astore 16
      // 042: istore 14
      // 044: aload 16
      // 046: iload 14
      // 048: ifne 0b2
      // 04b: ifnonnull 0b0
      // 04e: goto 05b
      // 051: ldc2_w -2511188817290581082
      // 054: lload 3
      // 055: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
      // 06e: ldc2_w -4555390095574421400
      // 071: lload 3
      // 072: invokedynamic r (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07a: sipush 21479
      // 07d: ldc2_w 8627908302860479445
      // 080: lload 3
      // 081: lxor
      // 082: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: iload 15
      // 08c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 08f: sipush 8817
      // 092: ldc2_w 2541999186636249675
      // 095: lload 3
      // 096: lxor
      // 097: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a2: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 0a5: athrow
      // 0a6: ldc2_w -2511188817290581082
      // 0a9: lload 3
      // 0aa: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 16
      // 0b2: instanceof com/zelix/jf
      // 0b5: iload 14
      // 0b7: ifne 15f
      // 0ba: ifne 13a
      // 0bd: goto 0ca
      // 0c0: ldc2_w -2511188817290581082
      // 0c3: lload 3
      // 0c4: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
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
      // 0dd: ldc2_w -4555390095574421400
      // 0e0: lload 3
      // 0e1: invokedynamic r (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: sipush 22171
      // 0ec: ldc2_w 672720699365486254
      // 0ef: lload 3
      // 0f0: lxor
      // 0f1: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: iload 15
      // 0fb: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0fe: sipush 23109
      // 101: ldc2_w 6527653621466980980
      // 104: lload 3
      // 105: lxor
      // 106: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: aload 16
      // 110: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 113: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 116: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 119: sipush 1993
      // 11c: ldc2_w 4022771653273305087
      // 11f: lload 3
      // 120: lxor
      // 121: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 129: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12c: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 12f: athrow
      // 130: ldc2_w -2511188817290581082
      // 133: lload 3
      // 134: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 0
      // 13b: aload 16
      // 13d: checkcast com/zelix/jf
      // 140: ldc2_w -4183335767706803029
      // 143: lload 3
      // 144: invokedynamic q (Ljava/lang/Object;Lcom/zelix/jf;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: aload 5
      // 14b: aload 0
      // 14c: ldc2_w -4183335767706803029
      // 14f: lload 3
      // 150: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: aload 0
      // 156: lload 12
      // 158: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 15b: aload 2
      // 15c: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 15f: istore 17
      // 161: aload 0
      // 162: iload 17
      // 164: anewarray 270
      // 167: ldc2_w -4413776353586370092
      // 16a: lload 3
      // 16b: invokedynamic q (Ljava/lang/Object;[Lcom/zelix/jf;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: bipush 0
      // 171: istore 18
      // 173: iload 18
      // 175: iload 17
      // 177: if_icmpge 2a9
      // 17a: aload 2
      // 17b: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 17e: istore 19
      // 180: aload 1
      // 181: lload 10
      // 183: iload 19
      // 185: invokevirtual com/zelix/_4.m (JI)Lcom/zelix/js;
      // 188: astore 16
      // 18a: aload 16
      // 18c: lload 3
      // 18d: lconst_0
      // 18e: lcmp
      // 18f: iflt 1fe
      // 192: iload 14
      // 194: ifne 1fe
      // 197: ifnonnull 1fc
      // 19a: goto 1a7
      // 19d: ldc2_w -2511188817290581082
      // 1a0: lload 3
      // 1a1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: new com/zelix/aw
      // 1aa: dup
      // 1ab: new java/lang/StringBuilder
      // 1ae: dup
      // 1af: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b2: aload 1
      // 1b3: lload 8
      // 1b5: invokevirtual com/zelix/_4.G (J)Lcom/zelix/_v;
      // 1b8: lload 6
      // 1ba: ldc2_w -4555390095574421400
      // 1bd: lload 3
      // 1be: invokedynamic r (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c6: sipush 30034
      // 1c9: ldc2_w 4136270379862150497
      // 1cc: lload 3
      // 1cd: lxor
      // 1ce: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d6: iload 19
      // 1d8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1db: sipush 5348
      // 1de: ldc2_w 3669363211228851411
      // 1e1: lload 3
      // 1e2: lxor
      // 1e3: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ee: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 1f1: athrow
      // 1f2: ldc2_w -2511188817290581082
      // 1f5: lload 3
      // 1f6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: aload 16
      // 1fe: instanceof com/zelix/jf
      // 201: lload 3
      // 202: lconst_0
      // 203: lcmp
      // 204: ifle 2a6
      // 207: ifne 27a
      // 20a: new com/zelix/aw
      // 20d: dup
      // 20e: new java/lang/StringBuilder
      // 211: dup
      // 212: invokespecial java/lang/StringBuilder.<init> ()V
      // 215: aload 1
      // 216: lload 8
      // 218: invokevirtual com/zelix/_4.G (J)Lcom/zelix/_v;
      // 21b: lload 6
      // 21d: ldc2_w -4555390095574421400
      // 220: lload 3
      // 221: invokedynamic r (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 229: sipush 13709
      // 22c: ldc2_w 7155072036721692093
      // 22f: lload 3
      // 230: lxor
      // 231: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 239: iload 19
      // 23b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 23e: sipush 17655
      // 241: ldc2_w 7925116530378800332
      // 244: lload 3
      // 245: lxor
      // 246: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24e: aload 16
      // 250: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 253: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 256: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 259: sipush 7962
      // 25c: ldc2_w 6218650634294372142
      // 25f: lload 3
      // 260: lxor
      // 261: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/sj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 269: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 26c: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 26f: athrow
      // 270: ldc2_w -2511188817290581082
      // 273: lload 3
      // 274: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: athrow
      // 27a: aload 0
      // 27b: ldc2_w -4413776353586370092
      // 27e: lload 3
      // 27f: invokedynamic s (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: iload 18
      // 286: aload 16
      // 288: checkcast com/zelix/jf
      // 28b: aastore
      // 28c: aload 5
      // 28e: aload 0
      // 28f: ldc2_w -4413776353586370092
      // 292: lload 3
      // 293: invokedynamic s (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: iload 18
      // 29a: aaload
      // 29b: aload 0
      // 29c: lload 12
      // 29e: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 2a1: iinc 18 1
      // 2a4: iload 14
      // 2a6: ifeq 173
      // 2a9: return
   }

   void z(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: pop
      // 01c: getstatic com/zelix/sj.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: ldc2_w -498249772959496099
      // 025: lload 2
      // 026: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: aload 5
      // 02d: aload 0
      // 02e: ldc2_w -114590371198705870
      // 031: lload 2
      // 032: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 03c: checkcast com/zelix/js
      // 03f: astore 7
      // 041: istore 6
      // 043: iload 6
      // 045: ifeq 071
      // 048: aload 7
      // 04a: ifnull 07c
      // 04d: goto 05a
      // 050: ldc2_w -1819632431027384257
      // 053: lload 2
      // 054: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: athrow
      // 05a: aload 4
      // 05c: aload 7
      // 05e: invokevirtual com/zelix/js.E ()I
      // 061: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 064: goto 071
      // 067: ldc2_w -1819632431027384257
      // 06a: lload 2
      // 06b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: lload 2
      // 072: lconst_0
      // 073: lcmp
      // 074: iflt 0ab
      // 077: iload 6
      // 079: ifne 09b
      // 07c: aload 4
      // 07e: aload 0
      // 07f: ldc2_w -114590371198705870
      // 082: lload 2
      // 083: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: invokevirtual com/zelix/jf.E ()I
      // 08b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 08e: goto 09b
      // 091: ldc2_w -1819632431027384257
      // 094: lload 2
      // 095: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 4
      // 09d: aload 0
      // 09e: ldc2_w -493646463443398067
      // 0a1: lload 2
      // 0a2: invokedynamic r (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: arraylength
      // 0a8: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0ab: aload 0
      // 0ac: ldc2_w -493646463443398067
      // 0af: lload 2
      // 0b0: invokedynamic r (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: astore 8
      // 0b7: aload 8
      // 0b9: arraylength
      // 0ba: istore 9
      // 0bc: bipush 0
      // 0bd: istore 10
      // 0bf: iload 10
      // 0c1: iload 9
      // 0c3: if_icmpge 141
      // 0c6: aload 8
      // 0c8: iload 10
      // 0ca: aaload
      // 0cb: astore 11
      // 0cd: aload 5
      // 0cf: aload 0
      // 0d0: ldc2_w -493646463443398067
      // 0d3: lload 2
      // 0d4: invokedynamic r (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0de: checkcast com/zelix/js
      // 0e1: astore 7
      // 0e3: iload 6
      // 0e5: lload 2
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: ifle 119
      // 0eb: ifeq 117
      // 0ee: aload 7
      // 0f0: ifnull 122
      // 0f3: goto 100
      // 0f6: ldc2_w -1819632431027384257
      // 0f9: lload 2
      // 0fa: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: aload 4
      // 102: aload 7
      // 104: invokevirtual com/zelix/js.E ()I
      // 107: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 10a: goto 117
      // 10d: ldc2_w -1819632431027384257
      // 110: lload 2
      // 111: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: iload 6
      // 119: lload 2
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: ifle 13e
      // 11f: ifne 139
      // 122: aload 4
      // 124: aload 11
      // 126: invokevirtual com/zelix/jf.E ()I
      // 129: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 12c: goto 139
      // 12f: ldc2_w -1819632431027384257
      // 132: lload 2
      // 133: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: iinc 10 1
      // 13c: iload 6
      // 13e: ifne 0bf
      // 141: return
   }

   void z(gu var1, long var2) {
      long var4 = var2 ^ 113240848016893L;
      boolean var10000 = m44.a<"h">(6170399952317654249L, var2);
      var1.K(m44.a<"v">(this, 5970808571274392454L, var2), this, var4, this.H());
      jf[] var7 = m44.a<"v">(this, 6166062587176533753L, var2);
      int var8 = var7.length;
      boolean var6 = var10000;
      int var9 = 0;

      while (var9 < var8) {
         jf var10 = var7[var9];
         var1.K(var10, this, var4, this.H());
         var9++;
         if (!var6) {
            break;
         }
      }
   }

   public void S(Object[] param1) {
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
      // 04: checkcast com/zelix/jf
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/jf
      // 0e: astore 5
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: ldc2_w -8777896317510626615
      // 1e: lload 3
      // 1f: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifne 54
      // 2c: ldc2_w -7418575100127463343
      // 2f: lload 3
      // 30: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 2
      // 36: if_acmpne 5f
      // 39: goto 46
      // 3c: ldc2_w -9089297470021142692
      // 3f: lload 3
      // 40: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: goto 54
      // 4a: ldc2_w -9089297470021142692
      // 4d: lload 3
      // 4e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 5
      // 56: ldc2_w -7418575100127463343
      // 59: lload 3
      // 5a: invokedynamic s (Ljava/lang/Object;Lcom/zelix/jf;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: bipush 0
      // 60: istore 7
      // 62: iload 7
      // 64: aload 0
      // 65: ldc2_w -7042153438263020242
      // 68: lload 3
      // 69: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: arraylength
      // 6f: if_icmpge b9
      // 72: aload 0
      // 73: ldc2_w -7042153438263020242
      // 76: lload 3
      // 77: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: iload 7
      // 7e: iload 6
      // 80: ifne ae
      // 83: aaload
      // 84: aload 2
      // 85: if_acmpne b1
      // 88: goto 95
      // 8b: ldc2_w -9089297470021142692
      // 8e: lload 3
      // 8f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: aload 0
      // 96: ldc2_w -7042153438263020242
      // 99: lload 3
      // 9a: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: iload 7
      // a1: goto ae
      // a4: ldc2_w -9089297470021142692
      // a7: lload 3
      // a8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: aload 5
      // b0: aastore
      // b1: iinc 7 1
      // b4: iload 6
      // b6: ifeq 62
      // b9: lload 3
      // ba: lconst_0
      // bb: lcmp
      // bc: ifle 72
      // bf: return
   }

   void C(Object[] var1) {
      long var3 = (Long)var1[0];
      DataOutputStream var2 = (DataOutputStream)var1[1];
      var3 = a ^ var3;
      boolean var10000 = m44.a<"i">(8057110253389036343L, var3);
      var2.writeShort(m44.a<"w">(this, 8139644552666468783L, var3).E());
      var2.writeShort(m44.a<"w">(this, 8627489624915287248L, var3).length);
      jf[] var6 = m44.a<"w">(this, 8627489624915287248L, var3);
      boolean var5 = var10000;

      for (jf var9 : var6) {
         var2.writeShort(var9.E());
         if (var5) {
            break;
         }
      }
   }

   static {
      long var0 = a ^ 4432672465532L;
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
      String var6 = "FÖÐÌ\u0095Ì\r£ÕU\u001d\u008e\b\u0087}ÓÎ?&¿Ï\u0080þÌÔ\u0080î\u000bÄh°ì\u0087\u0000Ðñ\u0084z\u000fÂ\u0084Ô\u0011³=>á\u0091~\u0089NÂÜ`ðÆ\"\u0087vÃHò«ÌF\u0005\u0016\u000f-Û\u0098Ý¬÷<Én\u009f\u00843Pë@ÃeÍ¢÷\u0087¨f$\u001fR\b\u008a5\u001c\u0091ÿ~ì\u0001AKÏ\u009cÍÆüD&\u000fåÛYU\u007fVQï×g¶\bÜç\"3¿w@ZdEÀ\u0098\u008c\u0018ð¢4±¬\u0098s\u0010õ\u0017ó0\u0017Gºâ\u001d<xAù\u0089(@\"ñùÏïZÂ\u0095:»\r¿\u007fû×\u0019iqt>)Bu\n\u001e@öH\u000b\u0019VÑ§\f¢Q/§[\u0010\u0091Fvý\u0083\u0010²á\tÇ\nK_z\u008fÐ@f\u0017\u0090Ù\u0096\u0085\u0081Ü*\u001cOÄ?27FÊ\u008bWrófÜ9RZ_e4Àl\u0085ü\u0099:\u00864\u0088\u008a®W\u001cvK 3H\u0010T1ã×S$!Ð}ÕÌ¡\u007fÄ½\u000fHR\nJÂÀ©Äû\u000b>7\u0093ý%õã\u0084åzI\u0012\u0007\u0081\u008cÁK\u008eg\u0085õ6Ï\u0087´\u009bK¯Á\u0012ÙùÏ\u001aÙñYç\u0011êÔ{rsFã³jükP%n\u0093\u000fÂº°\u0096b\u001c\u009a¬@¨§Ò5«<zR\u0015Ý\bh\b\u0094á¯~¬Á¦Ðò.\u0085x=b\u0019Xo¿$\u008aT\u0016ÿ¸ªÂiha&rÍ?ï è\u008böò¡rm\u009bbÎ9¦ïL\u0085\u0094(ñ6ý\u0012Ä¨VKÏ\u009c\u009cl6\u0007c«\u009d°Á<uº\u0087\u0005'k\u0001\u000e*Â\u007f^\u00987¥\u0005¡pé,";
      int var8 = "FÖÐÌ\u0095Ì\r£ÕU\u001d\u008e\b\u0087}ÓÎ?&¿Ï\u0080þÌÔ\u0080î\u000bÄh°ì\u0087\u0000Ðñ\u0084z\u000fÂ\u0084Ô\u0011³=>á\u0091~\u0089NÂÜ`ðÆ\"\u0087vÃHò«ÌF\u0005\u0016\u000f-Û\u0098Ý¬÷<Én\u009f\u00843Pë@ÃeÍ¢÷\u0087¨f$\u001fR\b\u008a5\u001c\u0091ÿ~ì\u0001AKÏ\u009cÍÆüD&\u000fåÛYU\u007fVQï×g¶\bÜç\"3¿w@ZdEÀ\u0098\u008c\u0018ð¢4±¬\u0098s\u0010õ\u0017ó0\u0017Gºâ\u001d<xAù\u0089(@\"ñùÏïZÂ\u0095:»\r¿\u007fû×\u0019iqt>)Bu\n\u001e@öH\u000b\u0019VÑ§\f¢Q/§[\u0010\u0091Fvý\u0083\u0010²á\tÇ\nK_z\u008fÐ@f\u0017\u0090Ù\u0096\u0085\u0081Ü*\u001cOÄ?27FÊ\u008bWrófÜ9RZ_e4Àl\u0085ü\u0099:\u00864\u0088\u008a®W\u001cvK 3H\u0010T1ã×S$!Ð}ÕÌ¡\u007fÄ½\u000fHR\nJÂÀ©Äû\u000b>7\u0093ý%õã\u0084åzI\u0012\u0007\u0081\u008cÁK\u008eg\u0085õ6Ï\u0087´\u009bK¯Á\u0012ÙùÏ\u001aÙñYç\u0011êÔ{rsFã³jükP%n\u0093\u000fÂº°\u0096b\u001c\u009a¬@¨§Ò5«<zR\u0015Ý\bh\b\u0094á¯~¬Á¦Ðò.\u0085x=b\u0019Xo¿$\u008aT\u0016ÿ¸ªÂiha&rÍ?ï è\u008böò¡rm\u009bbÎ9¦ïL\u0085\u0094(ñ6ý\u0012Ä¨VKÏ\u009c\u009cl6\u0007c«\u009d°Á<uº\u0087\u0005'k\u0001\u000e*Â\u007f^\u00987¥\u0005¡pé,"
         .length();
      char var5 = 'P';
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

                  var6 = "\u0089\u0012d\u0013~\u0011]\u008c\u000bø´\u0010ceE_ªëô}\u0000(\u00961\u00ad\u0082±ºã;RhÜ,Re-àó·û\u0089\u0013É\u001aþ\u000bdQ*'°\"iò<«(P\u0000ðG®j\u0010\f\u009e¡Ï$ñ)ßª\u0014^R¹÷Mp";
                  var8 = "\u0089\u0012d\u0013~\u0011]\u008c\u000bø´\u0010ceE_ªëô}\u0000(\u00961\u00ad\u0082±ºã;RhÜ,Re-àó·û\u0089\u0013É\u001aþ\u000bdQ*'°\"iò<«(P\u0000ðG®j\u0010\f\u009e¡Ï$ñ)ßª\u0014^R¹÷Mp"
                     .length();
                  var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27040;
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
            throw new RuntimeException("com/zelix/sj", var10);
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
         throw new RuntimeException("com/zelix/sj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
