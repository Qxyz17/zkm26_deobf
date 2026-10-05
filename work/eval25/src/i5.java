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

public class i5 extends h8 implements sv {
   private x7[] t;
   private x7 Q;
   private static final long a = ess.a(5468382306140925729L, -66202126186318370L, MethodHandles.lookup().lookupClass()).a(220313837043397L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   i5(h8 param1, _xx param2, long param3, _y4 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i5.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 25132758828947
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 60435044935471
      // 012: lxor
      // 013: dup2
      // 014: bipush 8
      // 016: lushr
      // 017: lstore 8
      // 019: dup2
      // 01a: bipush 56
      // 01c: lshl
      // 01d: bipush 56
      // 01f: lushr
      // 020: l2i
      // 021: istore 10
      // 023: pop2
      // 024: dup2
      // 025: ldc2_w 44543836019101
      // 028: lxor
      // 029: lstore 11
      // 02b: dup2
      // 02c: ldc2_w 123817948559296
      // 02f: lxor
      // 030: lstore 13
      // 032: pop2
      // 033: ldc2_w 1157134530040635492
      // 036: lload 3
      // 037: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 0
      // 03d: aload 1
      // 03e: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 041: aload 2
      // 042: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 045: istore 16
      // 047: istore 15
      // 049: aload 1
      // 04a: lload 8
      // 04c: iload 16
      // 04e: iload 10
      // 050: i2b
      // 051: invokevirtual com/zelix/h8.N (JIB)Lcom/zelix/xl;
      // 054: astore 17
      // 056: aload 17
      // 058: iload 15
      // 05a: ifeq 0c4
      // 05d: ifnonnull 0c2
      // 060: goto 06d
      // 063: ldc2_w 893222796020053691
      // 066: lload 3
      // 067: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: new com/zelix/_sx
      // 070: dup
      // 071: new java/lang/StringBuilder
      // 074: dup
      // 075: invokespecial java/lang/StringBuilder.<init> ()V
      // 078: aload 1
      // 079: lload 11
      // 07b: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 07e: lload 13
      // 080: ldc2_w 579584395059038985
      // 083: lload 3
      // 084: invokedynamic o (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08c: sipush 8334
      // 08f: ldc2_w 9048293216781153801
      // 092: lload 3
      // 093: lxor
      // 094: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09c: iload 16
      // 09e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a1: sipush 29862
      // 0a4: ldc2_w 4978390968672510498
      // 0a7: lload 3
      // 0a8: lxor
      // 0a9: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b4: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 0b7: athrow
      // 0b8: ldc2_w 893222796020053691
      // 0bb: lload 3
      // 0bc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 17
      // 0c4: instanceof com/zelix/x7
      // 0c7: iload 15
      // 0c9: ifeq 171
      // 0cc: ifne 14c
      // 0cf: goto 0dc
      // 0d2: ldc2_w 893222796020053691
      // 0d5: lload 3
      // 0d6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: new com/zelix/_sx
      // 0df: dup
      // 0e0: new java/lang/StringBuilder
      // 0e3: dup
      // 0e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e7: aload 1
      // 0e8: lload 11
      // 0ea: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 0ed: lload 13
      // 0ef: ldc2_w 579584395059038985
      // 0f2: lload 3
      // 0f3: invokedynamic o (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fb: sipush 19749
      // 0fe: ldc2_w 4025045550920031143
      // 101: lload 3
      // 102: lxor
      // 103: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10b: iload 16
      // 10d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 110: sipush 24258
      // 113: ldc2_w 1573289486542424135
      // 116: lload 3
      // 117: lxor
      // 118: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: aload 17
      // 122: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 125: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: sipush 31612
      // 12e: ldc2_w 1254400341908123126
      // 131: lload 3
      // 132: lxor
      // 133: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 141: athrow
      // 142: ldc2_w 893222796020053691
      // 145: lload 3
      // 146: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: aload 0
      // 14d: aload 17
      // 14f: checkcast com/zelix/x7
      // 152: ldc2_w 1203015747426605809
      // 155: lload 3
      // 156: invokedynamic t (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: aload 5
      // 15d: aload 0
      // 15e: ldc2_w 1203015747426605809
      // 161: lload 3
      // 162: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: aload 0
      // 168: lload 6
      // 16a: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 16d: aload 2
      // 16e: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 171: istore 18
      // 173: aload 0
      // 174: iload 18
      // 176: anewarray 138
      // 179: ldc2_w 704913062960823063
      // 17c: lload 3
      // 17d: invokedynamic t (Ljava/lang/Object;[Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: bipush 0
      // 183: istore 19
      // 185: iload 19
      // 187: iload 18
      // 189: if_icmpge 2be
      // 18c: aload 2
      // 18d: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 190: istore 20
      // 192: aload 1
      // 193: lload 8
      // 195: iload 20
      // 197: iload 10
      // 199: i2b
      // 19a: invokevirtual com/zelix/h8.N (JIB)Lcom/zelix/xl;
      // 19d: astore 17
      // 19f: aload 17
      // 1a1: lload 3
      // 1a2: lconst_0
      // 1a3: lcmp
      // 1a4: iflt 213
      // 1a7: iload 15
      // 1a9: ifeq 213
      // 1ac: ifnonnull 211
      // 1af: goto 1bc
      // 1b2: ldc2_w 893222796020053691
      // 1b5: lload 3
      // 1b6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: athrow
      // 1bc: new com/zelix/_sx
      // 1bf: dup
      // 1c0: new java/lang/StringBuilder
      // 1c3: dup
      // 1c4: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c7: aload 1
      // 1c8: lload 11
      // 1ca: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 1cd: lload 13
      // 1cf: ldc2_w 579584395059038985
      // 1d2: lload 3
      // 1d3: invokedynamic o (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1db: sipush 23936
      // 1de: ldc2_w 6677012418741979904
      // 1e1: lload 3
      // 1e2: lxor
      // 1e3: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1eb: iload 20
      // 1ed: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1f0: sipush 5770
      // 1f3: ldc2_w 4893424281376882700
      // 1f6: lload 3
      // 1f7: lxor
      // 1f8: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 200: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 203: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 206: athrow
      // 207: ldc2_w 893222796020053691
      // 20a: lload 3
      // 20b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: athrow
      // 211: aload 17
      // 213: instanceof com/zelix/x7
      // 216: lload 3
      // 217: lconst_0
      // 218: lcmp
      // 219: ifle 2bb
      // 21c: ifne 28f
      // 21f: new com/zelix/_sx
      // 222: dup
      // 223: new java/lang/StringBuilder
      // 226: dup
      // 227: invokespecial java/lang/StringBuilder.<init> ()V
      // 22a: aload 1
      // 22b: lload 11
      // 22d: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 230: lload 13
      // 232: ldc2_w 579584395059038985
      // 235: lload 3
      // 236: invokedynamic o (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23e: sipush 16532
      // 241: ldc2_w 4334293551342310933
      // 244: lload 3
      // 245: lxor
      // 246: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24e: iload 20
      // 250: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 253: sipush 25941
      // 256: ldc2_w 5869543196135781342
      // 259: lload 3
      // 25a: lxor
      // 25b: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 263: aload 17
      // 265: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 268: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 26b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26e: sipush 19631
      // 271: ldc2_w 1243592434885319212
      // 274: lload 3
      // 275: lxor
      // 276: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/i5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 281: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 284: athrow
      // 285: ldc2_w 893222796020053691
      // 288: lload 3
      // 289: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: athrow
      // 28f: aload 0
      // 290: ldc2_w 704913062960823063
      // 293: lload 3
      // 294: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: iload 19
      // 29b: aload 17
      // 29d: checkcast com/zelix/x7
      // 2a0: aastore
      // 2a1: aload 5
      // 2a3: aload 0
      // 2a4: ldc2_w 704913062960823063
      // 2a7: lload 3
      // 2a8: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: iload 19
      // 2af: aaload
      // 2b0: aload 0
      // 2b1: lload 6
      // 2b3: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 2b6: iinc 19 1
      // 2b9: iload 15
      // 2bb: ifne 185
      // 2be: return
   }

   public void h(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/x7
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast com/zelix/x7
      // 18: astore 5
      // 1a: pop
      // 1b: ldc2_w 1010662480215095874
      // 1e: lload 3
      // 1f: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifne 54
      // 2c: ldc2_w 1427354753077172622
      // 2f: lload 3
      // 30: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 2
      // 36: if_acmpne 5f
      // 39: goto 46
      // 3c: ldc2_w 1088286170980251076
      // 3f: lload 3
      // 40: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: goto 54
      // 4a: ldc2_w 1088286170980251076
      // 4d: lload 3
      // 4e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 5
      // 56: ldc2_w 1427354753077172622
      // 59: lload 3
      // 5a: invokedynamic s (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: bipush 0
      // 60: istore 7
      // 62: iload 7
      // 64: aload 0
      // 65: ldc2_w 772184082833406056
      // 68: lload 3
      // 69: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: arraylength
      // 6f: if_icmpge b9
      // 72: aload 0
      // 73: ldc2_w 772184082833406056
      // 76: lload 3
      // 77: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: iload 7
      // 7e: iload 6
      // 80: ifne ae
      // 83: aaload
      // 84: aload 2
      // 85: if_acmpne b1
      // 88: goto 95
      // 8b: ldc2_w 1088286170980251076
      // 8e: lload 3
      // 8f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: aload 0
      // 96: ldc2_w 772184082833406056
      // 99: lload 3
      // 9a: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: iload 7
      // a1: goto ae
      // a4: ldc2_w 1088286170980251076
      // a7: lload 3
      // a8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: aload 5
      // b0: aastore
      // b1: iinc 7 1
      // b4: iload 6
      // b6: ifeq 62
      // b9: lload 3
      // ba: lconst_0
      // bb: lcmp
      // bc: iflt 72
      // bf: return
   }

   void m(Object[] var1) {
      DataOutputStream var4 = (DataOutputStream)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      var4.writeShort(x44.a<"n">(this, -5443446311103955404L, var2).B());
      boolean var10000 = x44.a<"r">(-5418972056840207199L, var2);
      var4.writeShort(x44.a<"n">(this, -5977019239475486766L, var2).length);
      x7[] var6 = x44.a<"n">(this, -5977019239475486766L, var2);
      int var7 = var6.length;
      int var8 = 0;
      boolean var5 = var10000;

      while (var8 < var7) {
         x7 var9 = var6[var8];
         var4.writeShort(var9.B());
         var8++;
         if (!var5) {
            break;
         }
      }
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 10727274753381L;
      var3.H(x44.a<"k">(this, -6387859055293895399L, var1), this, this.x(), var4);
      boolean var10000 = x44.a<"w">(-5003033307729260843L, var1);
      x7[] var7 = x44.a<"k">(this, -4746680996153373441L, var1);
      int var8 = var7.length;
      int var9 = 0;
      boolean var6 = var10000;

      while (var9 < var8) {
         x7 var10 = var7[var9];
         var3.H(var10, this, this.x(), var4);
         var9++;
         if (var6) {
            break;
         }
      }
   }

   void w(Object[] param1) {
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/i5.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: ldc2_w 3528280179677266076
      // 026: lload 4
      // 028: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 2
      // 02e: aload 0
      // 02f: ldc2_w 3479584774086883849
      // 032: lload 4
      // 034: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 03e: checkcast com/zelix/xl
      // 041: astore 7
      // 043: istore 6
      // 045: iload 6
      // 047: ifeq 074
      // 04a: aload 7
      // 04c: ifnull 080
      // 04f: goto 05d
      // 052: ldc2_w 3214816963441219139
      // 055: lload 4
      // 057: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: aload 3
      // 05e: aload 7
      // 060: invokevirtual com/zelix/xl.B ()I
      // 063: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 066: goto 074
      // 069: ldc2_w 3214816963441219139
      // 06c: lload 4
      // 06e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: lload 4
      // 076: lconst_0
      // 077: lcmp
      // 078: ifle 0b0
      // 07b: iload 6
      // 07d: ifne 0a0
      // 080: aload 3
      // 081: aload 0
      // 082: ldc2_w 3479584774086883849
      // 085: lload 4
      // 087: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: invokevirtual com/zelix/x7.B ()I
      // 08f: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 092: goto 0a0
      // 095: ldc2_w 3214816963441219139
      // 098: lload 4
      // 09a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 3
      // 0a1: aload 0
      // 0a2: ldc2_w 2967965795437632495
      // 0a5: lload 4
      // 0a7: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: arraylength
      // 0ad: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0b0: aload 0
      // 0b1: ldc2_w 2967965795437632495
      // 0b4: lload 4
      // 0b6: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: astore 8
      // 0bd: aload 8
      // 0bf: arraylength
      // 0c0: istore 9
      // 0c2: bipush 0
      // 0c3: istore 10
      // 0c5: iload 10
      // 0c7: iload 9
      // 0c9: if_icmpge 14a
      // 0cc: aload 8
      // 0ce: iload 10
      // 0d0: aaload
      // 0d1: astore 11
      // 0d3: aload 2
      // 0d4: aload 0
      // 0d5: ldc2_w 2967965795437632495
      // 0d8: lload 4
      // 0da: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e4: checkcast com/zelix/xl
      // 0e7: astore 7
      // 0e9: iload 6
      // 0eb: lload 4
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 121
      // 0f2: ifeq 11f
      // 0f5: aload 7
      // 0f7: ifnull 12b
      // 0fa: goto 108
      // 0fd: ldc2_w 3214816963441219139
      // 100: lload 4
      // 102: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 3
      // 109: aload 7
      // 10b: invokevirtual com/zelix/xl.B ()I
      // 10e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 111: goto 11f
      // 114: ldc2_w 3214816963441219139
      // 117: lload 4
      // 119: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: iload 6
      // 121: lload 4
      // 123: lconst_0
      // 124: lcmp
      // 125: ifle 147
      // 128: ifne 142
      // 12b: aload 3
      // 12c: aload 11
      // 12e: invokevirtual com/zelix/x7.B ()I
      // 131: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 134: goto 142
      // 137: ldc2_w 3214816963441219139
      // 13a: lload 4
      // 13c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: iinc 10 1
      // 145: iload 6
      // 147: ifne 0c5
      // 14a: return
   }

   static {
      long var0 = a ^ 130137437379687L;
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
      String var6 = "\n\u0088\u0018Ï[ÿ+\u009f@&½\u00ad\u0004´ß\u0019ÝË5çR´Àòë\u0014n\u0088jÙò§GÆ\u0089S\u00adq\bìÛ\u008aFý\u0082¼UXÎ|x#&\u0018ê\u0085cÆ®ÐlØ\u0096\u0088(ëU\u0099Î\u001bsÞ\u0086\u0015\u0019P^>\u0089]uMÃF\u008a9¡m¸àÎ\bë\u0005#P$\u007fÎ\u009d\u0088ã\u0095V±(xHí\u0007t¦\"T\b* ó\u0003\u0085Èü{\u0081¡×\u0006Ìæ|,\n\u001a\\æ\u001cE·!=\u0003A\u008eÞ¾\u0088H4#\u0002þ¤ãÈÄÝ\u0084)U\u008eÿÇLÈº>\n\u000bz\u0090ò]\u0085µ\u00901\u000fA\u0088'Ç\u001c\u008e{\u0092\u008d.Ü[ß$\u00adzZQ/\u009eÑø¨D\u009e»Ì\u001cé\u008bÕN ¨®\u008bGõÖø¾\u0016PØÀùY\u001aÀÐb;RJÑÆQä©\u0016ï_[7ÈÀ*°üK#{½Kò×lÏã\u009dßÞ\u009cÐ[+ÆüCþÑ\u0092b\u008c=yöd²\u001føöÚb\u0017ýªÃÊ\u008aµüèÚÏý>%3\u0019ó\u0086\u009b@-ÂÃ\u008aÄ|'\u00ad_7|z\tÙ$¨Þ¬ã-i^tæR\u009d¬GV£¶\bú\rz\u0004÷%]ë\u0012\fÜ\u0095¿R  î\u0010ex\u009cXÏ\u009a\u0004\u009d÷h£¿d0\u0010ïfÄN\u0089\u0016$P-@kN\u0081aM>@\n\u008dxõ\u0006\u0019\u000e\u0093\u0005s*Õ|Mv½Ï%µjTíuë\u000b\u001f\u0016\u009fJ\f\u008a°¾\u0095L\"N®vWzëì\u001bH¢õ\u0001_\u008e¦\u0083à!\u0014Àcv!¶\u0015\u009cÌÛ";
      int var8 = "\n\u0088\u0018Ï[ÿ+\u009f@&½\u00ad\u0004´ß\u0019ÝË5çR´Àòë\u0014n\u0088jÙò§GÆ\u0089S\u00adq\bìÛ\u008aFý\u0082¼UXÎ|x#&\u0018ê\u0085cÆ®ÐlØ\u0096\u0088(ëU\u0099Î\u001bsÞ\u0086\u0015\u0019P^>\u0089]uMÃF\u008a9¡m¸àÎ\bë\u0005#P$\u007fÎ\u009d\u0088ã\u0095V±(xHí\u0007t¦\"T\b* ó\u0003\u0085Èü{\u0081¡×\u0006Ìæ|,\n\u001a\\æ\u001cE·!=\u0003A\u008eÞ¾\u0088H4#\u0002þ¤ãÈÄÝ\u0084)U\u008eÿÇLÈº>\n\u000bz\u0090ò]\u0085µ\u00901\u000fA\u0088'Ç\u001c\u008e{\u0092\u008d.Ü[ß$\u00adzZQ/\u009eÑø¨D\u009e»Ì\u001cé\u008bÕN ¨®\u008bGõÖø¾\u0016PØÀùY\u001aÀÐb;RJÑÆQä©\u0016ï_[7ÈÀ*°üK#{½Kò×lÏã\u009dßÞ\u009cÐ[+ÆüCþÑ\u0092b\u008c=yöd²\u001føöÚb\u0017ýªÃÊ\u008aµüèÚÏý>%3\u0019ó\u0086\u009b@-ÂÃ\u008aÄ|'\u00ad_7|z\tÙ$¨Þ¬ã-i^tæR\u009d¬GV£¶\bú\rz\u0004÷%]ë\u0012\fÜ\u0095¿R  î\u0010ex\u009cXÏ\u009a\u0004\u009d÷h£¿d0\u0010ïfÄN\u0089\u0016$P-@kN\u0081aM>@\n\u008dxõ\u0006\u0019\u000e\u0093\u0005s*Õ|Mv½Ï%µjTíuë\u000b\u001f\u0016\u009fJ\f\u008a°¾\u0095L\"N®vWzëì\u001bH¢õ\u0001_\u008e¦\u0083à!\u0014Àcv!¶\u0015\u009cÌÛ"
         .length();
      char var5 = '@';
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

                  var6 = "\u0089ðT^\u000b.ðWm2vÐ\u009bÚM*H:\u0091\u008fõ\u0011e`\u0007Ç(\u0088-\u0098ç\u0018»\b\u000e\u008b#ï\u001c\r\u0006\u008dÝ:µ<\u008e\u008c¾U\u009cc=áa\fT\u008añd*Ù\u0016qº7!:7Bp °\u009fy0\u00ad¥è3\r~ü*£´\u009eM\r";
                  var8 = "\u0089ðT^\u000b.ðWm2vÐ\u009bÚM*H:\u0091\u008fõ\u0011e`\u0007Ç(\u0088-\u0098ç\u0018»\b\u000e\u008b#ï\u001c\r\u0006\u008dÝ:µ<\u008e\u008c¾U\u009cc=áa\fT\u008añd*Ù\u0016qº7!:7Bp °\u009fy0\u00ad¥è3\r~ü*£´\u009eM\r"
                     .length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2607;
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
            throw new RuntimeException("com/zelix/i5", var10);
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
         throw new RuntimeException("com/zelix/i5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
