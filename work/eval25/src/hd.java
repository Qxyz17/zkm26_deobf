package com.zelix;

import java.awt.Color;
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

public class hd extends hs {
   private boolean Y;
   private static final long b = ess.a(3498628835364225798L, 5838818383117082126L, MethodHandles.lookup().lookupClass()).a(40367042493671L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long f;

   public boolean R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"j">(this, 199525148115863254L, var2);
   }

   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hd.b J
      // 03: ldc2_w 3657078881423
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 3105708096565871414
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 1
      // 14: instanceof com/zelix/hd
      // 17: aload 4
      // 19: ifnull 52
      // 1c: ifeq 51
      // 1f: goto 2c
      // 22: ldc2_w 3490155526285845101
      // 25: lload 2
      // 26: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 0
      // 2d: ldc2_w 3093829704504338602
      // 30: lload 2
      // 31: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 1
      // 37: checkcast com/zelix/hd
      // 3a: ldc2_w 3093829704504338602
      // 3d: lload 2
      // 3e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 46: ireturn
      // 47: ldc2_w 3490155526285845101
      // 4a: lload 2
      // 4b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: bipush 0
      // 52: ireturn
   }

   public void t(Object[] param1) {
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
      // 004: checkcast java/awt/Component
      // 007: astore 9
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast javax/swing/JList
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Object
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Integer
      // 029: invokevirtual java/lang/Integer.intValue ()I
      // 02c: istore 5
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: istore 7
      // 039: dup
      // 03a: bipush 6
      // 03c: aaload
      // 03d: checkcast java/lang/Boolean
      // 040: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 043: istore 8
      // 045: pop
      // 046: lload 2
      // 047: dup2
      // 048: ldc2_w 59514865821095
      // 04b: lxor
      // 04c: lstore 10
      // 04e: dup2
      // 04f: ldc2_w 82755615206561
      // 052: lxor
      // 053: lstore 12
      // 055: dup2
      // 056: ldc2_w 101874132676115
      // 059: lxor
      // 05a: lstore 14
      // 05c: dup2
      // 05d: ldc2_w 74835554420647
      // 060: lxor
      // 061: lstore 16
      // 063: dup2
      // 064: ldc2_w 91125991246888
      // 067: lxor
      // 068: lstore 18
      // 06a: dup2
      // 06b: ldc2_w 41457755201508
      // 06e: lxor
      // 06f: lstore 20
      // 071: pop2
      // 072: ldc2_w 7040746919007308186
      // 075: lload 2
      // 076: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: astore 22
      // 07d: aload 0
      // 07e: ldc2_w 6960487440955106442
      // 081: lload 2
      // 082: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: ifeq a29
      // 08a: aload 9
      // 08c: ldc2_w 7221270221708743155
      // 08f: lload 2
      // 090: invokedynamic j (Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: astore 23
      // 097: sipush 30823
      // 09a: aload 9
      // 09c: ldc2_w 8901648160010206678
      // 09f: lload 2
      // 0a0: invokedynamic j (Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: astore 24
      // 0a7: ldc2_w 9209648686724264260
      // 0aa: lload 2
      // 0ab: lxor
      // 0ac: aload 4
      // 0ae: ldc2_w 9169326661748077694
      // 0b1: lload 2
      // 0b2: invokedynamic j (Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: astore 25
      // 0b9: aload 4
      // 0bb: ldc2_w 8813317208737106338
      // 0be: lload 2
      // 0bf: invokedynamic j (Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: astore 26
      // 0c6: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/hd.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: ldc2_w 9006857238022624234
      // 0ce: lload 2
      // 0cf: invokedynamic r (Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: astore 27
      // 0d6: aload 27
      // 0d8: aload 22
      // 0da: ifnull 347
      // 0dd: ifnull 32d
      // 0e0: goto 0ed
      // 0e3: ldc2_w 8846185665078241473
      // 0e6: lload 2
      // 0e7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 27
      // 0ef: aload 22
      // 0f1: ifnull 347
      // 0f4: goto 101
      // 0f7: ldc2_w 8846185665078241473
      // 0fa: lload 2
      // 0fb: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: instanceof java/awt/Color
      // 104: lload 2
      // 105: lconst_0
      // 106: lcmp
      // 107: ifle 330
      // 10a: ifeq 32d
      // 10d: goto 11a
      // 110: ldc2_w 8846185665078241473
      // 113: lload 2
      // 114: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: iload 7
      // 11c: aload 22
      // 11e: lload 2
      // 11f: lconst_0
      // 120: lcmp
      // 121: iflt 1ac
      // 124: ifnull 1aa
      // 127: goto 134
      // 12a: ldc2_w 8846185665078241473
      // 12d: lload 2
      // 12e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: lload 2
      // 135: lconst_0
      // 136: lcmp
      // 137: iflt 19d
      // 13a: ifne 19b
      // 13d: goto 14a
      // 140: ldc2_w 8846185665078241473
      // 143: lload 2
      // 144: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 23
      // 14c: aload 22
      // 14e: ifnull 347
      // 151: goto 15e
      // 154: ldc2_w 8846185665078241473
      // 157: lload 2
      // 158: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: aload 27
      // 160: checkcast java/awt/Color
      // 163: lload 10
      // 165: bipush 3
      // 166: anewarray 182
      // 169: dup_x2
      // 16a: dup_x2
      // 16b: pop
      // 16c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16f: bipush 2
      // 170: swap
      // 171: aastore
      // 172: dup_x1
      // 173: swap
      // 174: bipush 1
      // 175: swap
      // 176: aastore
      // 177: dup_x1
      // 178: swap
      // 179: bipush 0
      // 17a: swap
      // 17b: aastore
      // 17c: ldc2_w 8826558976416786067
      // 17f: lload 2
      // 180: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: lload 2
      // 186: lconst_0
      // 187: lcmp
      // 188: ifle 330
      // 18b: ifeq 32d
      // 18e: goto 19b
      // 191: ldc2_w 8846185665078241473
      // 194: lload 2
      // 195: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: iload 7
      // 19d: goto 1aa
      // 1a0: ldc2_w 8846185665078241473
      // 1a3: lload 2
      // 1a4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: athrow
      // 1aa: aload 22
      // 1ac: lload 2
      // 1ad: lconst_0
      // 1ae: lcmp
      // 1af: iflt 227
      // 1b2: ifnull 225
      // 1b5: ifne 216
      // 1b8: goto 1c5
      // 1bb: ldc2_w 8846185665078241473
      // 1be: lload 2
      // 1bf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: aload 24
      // 1c7: aload 22
      // 1c9: ifnull 347
      // 1cc: goto 1d9
      // 1cf: ldc2_w 8846185665078241473
      // 1d2: lload 2
      // 1d3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: aload 27
      // 1db: checkcast java/awt/Color
      // 1de: lload 10
      // 1e0: bipush 3
      // 1e1: anewarray 182
      // 1e4: dup_x2
      // 1e5: dup_x2
      // 1e6: pop
      // 1e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ea: bipush 2
      // 1eb: swap
      // 1ec: aastore
      // 1ed: dup_x1
      // 1ee: swap
      // 1ef: bipush 1
      // 1f0: swap
      // 1f1: aastore
      // 1f2: dup_x1
      // 1f3: swap
      // 1f4: bipush 0
      // 1f5: swap
      // 1f6: aastore
      // 1f7: ldc2_w 8826558976416786067
      // 1fa: lload 2
      // 1fb: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: lload 2
      // 201: lconst_0
      // 202: lcmp
      // 203: ifle 330
      // 206: ifeq 32d
      // 209: goto 216
      // 20c: ldc2_w 8846185665078241473
      // 20f: lload 2
      // 210: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: athrow
      // 216: iload 7
      // 218: goto 225
      // 21b: ldc2_w 8846185665078241473
      // 21e: lload 2
      // 21f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 224: athrow
      // 225: aload 22
      // 227: lload 2
      // 228: lconst_0
      // 229: lcmp
      // 22a: ifle 2a8
      // 22d: ifnull 2a0
      // 230: ifeq 291
      // 233: goto 240
      // 236: ldc2_w 8846185665078241473
      // 239: lload 2
      // 23a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: aload 25
      // 242: aload 22
      // 244: ifnull 347
      // 247: goto 254
      // 24a: ldc2_w 8846185665078241473
      // 24d: lload 2
      // 24e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: athrow
      // 254: aload 27
      // 256: checkcast java/awt/Color
      // 259: lload 10
      // 25b: bipush 3
      // 25c: anewarray 182
      // 25f: dup_x2
      // 260: dup_x2
      // 261: pop
      // 262: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 265: bipush 2
      // 266: swap
      // 267: aastore
      // 268: dup_x1
      // 269: swap
      // 26a: bipush 1
      // 26b: swap
      // 26c: aastore
      // 26d: dup_x1
      // 26e: swap
      // 26f: bipush 0
      // 270: swap
      // 271: aastore
      // 272: ldc2_w 8826558976416786067
      // 275: lload 2
      // 276: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: lload 2
      // 27c: lconst_0
      // 27d: lcmp
      // 27e: ifle 330
      // 281: ifeq 32d
      // 284: goto 291
      // 287: ldc2_w 8846185665078241473
      // 28a: lload 2
      // 28b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: athrow
      // 291: iload 7
      // 293: goto 2a0
      // 296: ldc2_w 8846185665078241473
      // 299: lload 2
      // 29a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: athrow
      // 2a0: lload 2
      // 2a1: lconst_0
      // 2a2: lcmp
      // 2a3: iflt 309
      // 2a6: aload 22
      // 2a8: ifnull 309
      // 2ab: ifeq 312
      // 2ae: goto 2bb
      // 2b1: ldc2_w 8846185665078241473
      // 2b4: lload 2
      // 2b5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: athrow
      // 2bb: aload 26
      // 2bd: aload 22
      // 2bf: lload 2
      // 2c0: lconst_0
      // 2c1: lcmp
      // 2c2: iflt 34f
      // 2c5: ifnull 347
      // 2c8: goto 2d5
      // 2cb: ldc2_w 8846185665078241473
      // 2ce: lload 2
      // 2cf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: athrow
      // 2d5: aload 27
      // 2d7: checkcast java/awt/Color
      // 2da: lload 10
      // 2dc: bipush 3
      // 2dd: anewarray 182
      // 2e0: dup_x2
      // 2e1: dup_x2
      // 2e2: pop
      // 2e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e6: bipush 2
      // 2e7: swap
      // 2e8: aastore
      // 2e9: dup_x1
      // 2ea: swap
      // 2eb: bipush 1
      // 2ec: swap
      // 2ed: aastore
      // 2ee: dup_x1
      // 2ef: swap
      // 2f0: bipush 0
      // 2f1: swap
      // 2f2: aastore
      // 2f3: ldc2_w 8826558976416786067
      // 2f6: lload 2
      // 2f7: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: goto 309
      // 2ff: ldc2_w 8846185665078241473
      // 302: lload 2
      // 303: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: athrow
      // 309: lload 2
      // 30a: lconst_0
      // 30b: lcmp
      // 30c: iflt 330
      // 30f: ifeq 32d
      // 312: aload 9
      // 314: aload 27
      // 316: checkcast java/awt/Color
      // 319: ldc2_w 7124903583996735521
      // 31c: lload 2
      // 31d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 322: return
      // 323: ldc2_w 8846185665078241473
      // 326: lload 2
      // 327: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32c: athrow
      // 32d: sipush 6488
      // 330: ldc2_w 2841044151955116154
      // 333: lload 2
      // 334: lxor
      // 335: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/hd.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: ldc2_w 9006857238022624234
      // 33d: lload 2
      // 33e: invokedynamic r (Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: astore 27
      // 345: aload 27
      // 347: lload 2
      // 348: lconst_0
      // 349: lcmp
      // 34a: iflt 364
      // 34d: aload 22
      // 34f: ifnull 364
      // 352: ifnull 52b
      // 355: goto 362
      // 358: ldc2_w 8846185665078241473
      // 35b: lload 2
      // 35c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: aload 27
      // 364: instanceof java/awt/Color
      // 367: aload 22
      // 369: lload 2
      // 36a: lconst_0
      // 36b: lcmp
      // 36c: ifle 386
      // 36f: ifnull 384
      // 372: ifeq 52b
      // 375: goto 382
      // 378: ldc2_w 8846185665078241473
      // 37b: lload 2
      // 37c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 381: athrow
      // 382: iload 7
      // 384: aload 22
      // 386: ifnull 3ec
      // 389: ifne 3ea
      // 38c: goto 399
      // 38f: ldc2_w 8846185665078241473
      // 392: lload 2
      // 393: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: athrow
      // 399: aload 23
      // 39b: aload 27
      // 39d: checkcast java/awt/Color
      // 3a0: lload 10
      // 3a2: bipush 3
      // 3a3: anewarray 182
      // 3a6: dup_x2
      // 3a7: dup_x2
      // 3a8: pop
      // 3a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ac: bipush 2
      // 3ad: swap
      // 3ae: aastore
      // 3af: dup_x1
      // 3b0: swap
      // 3b1: bipush 1
      // 3b2: swap
      // 3b3: aastore
      // 3b4: dup_x1
      // 3b5: swap
      // 3b6: bipush 0
      // 3b7: swap
      // 3b8: aastore
      // 3b9: ldc2_w 8826558976416786067
      // 3bc: lload 2
      // 3bd: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c2: aload 22
      // 3c4: lload 2
      // 3c5: lconst_0
      // 3c6: lcmp
      // 3c7: ifle 3ee
      // 3ca: ifnull 3ec
      // 3cd: goto 3da
      // 3d0: ldc2_w 8846185665078241473
      // 3d3: lload 2
      // 3d4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d9: athrow
      // 3da: ifeq 52b
      // 3dd: goto 3ea
      // 3e0: ldc2_w 8846185665078241473
      // 3e3: lload 2
      // 3e4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: athrow
      // 3ea: iload 7
      // 3ec: aload 22
      // 3ee: ifnull 454
      // 3f1: ifne 452
      // 3f4: goto 401
      // 3f7: ldc2_w 8846185665078241473
      // 3fa: lload 2
      // 3fb: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 400: athrow
      // 401: aload 24
      // 403: aload 27
      // 405: checkcast java/awt/Color
      // 408: lload 10
      // 40a: bipush 3
      // 40b: anewarray 182
      // 40e: dup_x2
      // 40f: dup_x2
      // 410: pop
      // 411: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 414: bipush 2
      // 415: swap
      // 416: aastore
      // 417: dup_x1
      // 418: swap
      // 419: bipush 1
      // 41a: swap
      // 41b: aastore
      // 41c: dup_x1
      // 41d: swap
      // 41e: bipush 0
      // 41f: swap
      // 420: aastore
      // 421: ldc2_w 8826558976416786067
      // 424: lload 2
      // 425: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42a: aload 22
      // 42c: lload 2
      // 42d: lconst_0
      // 42e: lcmp
      // 42f: iflt 456
      // 432: ifnull 454
      // 435: goto 442
      // 438: ldc2_w 8846185665078241473
      // 43b: lload 2
      // 43c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 441: athrow
      // 442: ifeq 52b
      // 445: goto 452
      // 448: ldc2_w 8846185665078241473
      // 44b: lload 2
      // 44c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 451: athrow
      // 452: iload 7
      // 454: aload 22
      // 456: ifnull 4bc
      // 459: ifeq 4ba
      // 45c: goto 469
      // 45f: ldc2_w 8846185665078241473
      // 462: lload 2
      // 463: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 468: athrow
      // 469: aload 25
      // 46b: aload 27
      // 46d: checkcast java/awt/Color
      // 470: lload 10
      // 472: bipush 3
      // 473: anewarray 182
      // 476: dup_x2
      // 477: dup_x2
      // 478: pop
      // 479: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 47c: bipush 2
      // 47d: swap
      // 47e: aastore
      // 47f: dup_x1
      // 480: swap
      // 481: bipush 1
      // 482: swap
      // 483: aastore
      // 484: dup_x1
      // 485: swap
      // 486: bipush 0
      // 487: swap
      // 488: aastore
      // 489: ldc2_w 8826558976416786067
      // 48c: lload 2
      // 48d: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 492: aload 22
      // 494: lload 2
      // 495: lconst_0
      // 496: lcmp
      // 497: ifle 4c4
      // 49a: ifnull 4bc
      // 49d: goto 4aa
      // 4a0: ldc2_w 8846185665078241473
      // 4a3: lload 2
      // 4a4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a9: athrow
      // 4aa: ifeq 52b
      // 4ad: goto 4ba
      // 4b0: ldc2_w 8846185665078241473
      // 4b3: lload 2
      // 4b4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b9: athrow
      // 4ba: iload 7
      // 4bc: lload 2
      // 4bd: lconst_0
      // 4be: lcmp
      // 4bf: ifle 50d
      // 4c2: aload 22
      // 4c4: ifnull 50d
      // 4c7: ifeq 510
      // 4ca: goto 4d7
      // 4cd: ldc2_w 8846185665078241473
      // 4d0: lload 2
      // 4d1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d6: athrow
      // 4d7: aload 26
      // 4d9: aload 27
      // 4db: checkcast java/awt/Color
      // 4de: lload 10
      // 4e0: bipush 3
      // 4e1: anewarray 182
      // 4e4: dup_x2
      // 4e5: dup_x2
      // 4e6: pop
      // 4e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4ea: bipush 2
      // 4eb: swap
      // 4ec: aastore
      // 4ed: dup_x1
      // 4ee: swap
      // 4ef: bipush 1
      // 4f0: swap
      // 4f1: aastore
      // 4f2: dup_x1
      // 4f3: swap
      // 4f4: bipush 0
      // 4f5: swap
      // 4f6: aastore
      // 4f7: ldc2_w 8826558976416786067
      // 4fa: lload 2
      // 4fb: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 500: goto 50d
      // 503: ldc2_w 8846185665078241473
      // 506: lload 2
      // 507: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50c: athrow
      // 50d: ifeq 52b
      // 510: aload 9
      // 512: aload 27
      // 514: checkcast java/awt/Color
      // 517: ldc2_w 7124903583996735521
      // 51a: lload 2
      // 51b: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 520: return
      // 521: ldc2_w 8846185665078241473
      // 524: lload 2
      // 525: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52a: athrow
      // 52b: aconst_null
      // 52c: astore 28
      // 52e: iload 7
      // 530: aload 22
      // 532: lload 2
      // 533: lconst_0
      // 534: lcmp
      // 535: ifle 5d1
      // 538: ifnull 5cf
      // 53b: ifne 5cd
      // 53e: goto 54b
      // 541: ldc2_w 8846185665078241473
      // 544: lload 2
      // 545: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54a: athrow
      // 54b: lload 18
      // 54d: aload 23
      // 54f: bipush 2
      // 550: anewarray 182
      // 553: dup_x1
      // 554: swap
      // 555: bipush 1
      // 556: swap
      // 557: aastore
      // 558: dup_x2
      // 559: dup_x2
      // 55a: pop
      // 55b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55e: bipush 0
      // 55f: swap
      // 560: aastore
      // 561: ldc2_w 7229732061275363159
      // 564: lload 2
      // 565: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56a: aload 22
      // 56c: ifnull 66e
      // 56f: goto 57c
      // 572: ldc2_w 8846185665078241473
      // 575: lload 2
      // 576: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57b: athrow
      // 57c: ifne 66c
      // 57f: goto 58c
      // 582: ldc2_w 8846185665078241473
      // 585: lload 2
      // 586: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58b: athrow
      // 58c: lload 20
      // 58e: aload 23
      // 590: bipush 2
      // 591: anewarray 182
      // 594: dup_x1
      // 595: swap
      // 596: bipush 1
      // 597: swap
      // 598: aastore
      // 599: dup_x2
      // 59a: dup_x2
      // 59b: pop
      // 59c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59f: bipush 0
      // 5a0: swap
      // 5a1: aastore
      // 5a2: ldc2_w 7018791951335011367
      // 5a5: lload 2
      // 5a6: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ab: aload 22
      // 5ad: ifnull 66e
      // 5b0: goto 5bd
      // 5b3: ldc2_w 8846185665078241473
      // 5b6: lload 2
      // 5b7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bc: athrow
      // 5bd: ifne 66c
      // 5c0: goto 5cd
      // 5c3: ldc2_w 8846185665078241473
      // 5c6: lload 2
      // 5c7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cc: athrow
      // 5cd: iload 7
      // 5cf: aload 22
      // 5d1: ifnull 736
      // 5d4: ifeq 734
      // 5d7: goto 5e4
      // 5da: ldc2_w 8846185665078241473
      // 5dd: lload 2
      // 5de: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e3: athrow
      // 5e4: lload 18
      // 5e6: aload 24
      // 5e8: bipush 2
      // 5e9: anewarray 182
      // 5ec: dup_x1
      // 5ed: swap
      // 5ee: bipush 1
      // 5ef: swap
      // 5f0: aastore
      // 5f1: dup_x2
      // 5f2: dup_x2
      // 5f3: pop
      // 5f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f7: bipush 0
      // 5f8: swap
      // 5f9: aastore
      // 5fa: ldc2_w 7229732061275363159
      // 5fd: lload 2
      // 5fe: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 603: aload 22
      // 605: lload 2
      // 606: lconst_0
      // 607: lcmp
      // 608: ifle 670
      // 60b: ifnull 66e
      // 60e: goto 61b
      // 611: ldc2_w 8846185665078241473
      // 614: lload 2
      // 615: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61a: athrow
      // 61b: ifne 66c
      // 61e: goto 62b
      // 621: ldc2_w 8846185665078241473
      // 624: lload 2
      // 625: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62a: athrow
      // 62b: lload 20
      // 62d: aload 25
      // 62f: bipush 2
      // 630: anewarray 182
      // 633: dup_x1
      // 634: swap
      // 635: bipush 1
      // 636: swap
      // 637: aastore
      // 638: dup_x2
      // 639: dup_x2
      // 63a: pop
      // 63b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63e: bipush 0
      // 63f: swap
      // 640: aastore
      // 641: ldc2_w 7018791951335011367
      // 644: lload 2
      // 645: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64a: aload 22
      // 64c: ifnull 736
      // 64f: goto 65c
      // 652: ldc2_w 8846185665078241473
      // 655: lload 2
      // 656: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65b: athrow
      // 65c: ifeq 734
      // 65f: goto 66c
      // 662: ldc2_w 8846185665078241473
      // 665: lload 2
      // 666: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66b: athrow
      // 66c: iload 7
      // 66e: aload 22
      // 670: ifnull 715
      // 673: ifne 6e2
      // 676: goto 683
      // 679: ldc2_w 8846185665078241473
      // 67c: lload 2
      // 67d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 682: athrow
      // 683: aload 26
      // 685: aload 22
      // 687: ifnull 6dd
      // 68a: goto 697
      // 68d: ldc2_w 8846185665078241473
      // 690: lload 2
      // 691: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 696: athrow
      // 697: lload 12
      // 699: dup2_x1
      // 69a: pop2
      // 69b: bipush 2
      // 69c: anewarray 182
      // 69f: dup_x1
      // 6a0: swap
      // 6a1: bipush 1
      // 6a2: swap
      // 6a3: aastore
      // 6a4: dup_x2
      // 6a5: dup_x2
      // 6a6: pop
      // 6a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6aa: bipush 0
      // 6ab: swap
      // 6ac: aastore
      // 6ad: ldc2_w 6927434304249880620
      // 6b0: lload 2
      // 6b1: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b6: ifeq 6d4
      // 6b9: goto 6c6
      // 6bc: ldc2_w 8846185665078241473
      // 6bf: lload 2
      // 6c0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c5: athrow
      // 6c6: ldc2_w 8803827638295436325
      // 6c9: lload 2
      // 6ca: invokedynamic k (JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6cf: astore 28
      // 6d1: goto 78e
      // 6d4: ldc2_w 6955750608972270863
      // 6d7: lload 2
      // 6d8: invokedynamic k (JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6dd: astore 28
      // 6df: goto 78e
      // 6e2: aload 24
      // 6e4: aload 22
      // 6e6: ifnull 72f
      // 6e9: lload 12
      // 6eb: dup2_x1
      // 6ec: pop2
      // 6ed: bipush 2
      // 6ee: anewarray 182
      // 6f1: dup_x1
      // 6f2: swap
      // 6f3: bipush 1
      // 6f4: swap
      // 6f5: aastore
      // 6f6: dup_x2
      // 6f7: dup_x2
      // 6f8: pop
      // 6f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6fc: bipush 0
      // 6fd: swap
      // 6fe: aastore
      // 6ff: ldc2_w 6927434304249880620
      // 702: lload 2
      // 703: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 708: goto 715
      // 70b: ldc2_w 8846185665078241473
      // 70e: lload 2
      // 70f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 714: athrow
      // 715: ifeq 726
      // 718: ldc2_w 8803827638295436325
      // 71b: lload 2
      // 71c: invokedynamic k (JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 721: astore 28
      // 723: goto 78e
      // 726: ldc2_w 6955750608972270863
      // 729: lload 2
      // 72a: invokedynamic k (JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72f: astore 28
      // 731: goto 78e
      // 734: iload 7
      // 736: ifeq 765
      // 739: aload 0
      // 73a: aload 25
      // 73c: lload 16
      // 73e: aload 25
      // 740: bipush 3
      // 741: anewarray 182
      // 744: dup_x1
      // 745: swap
      // 746: bipush 2
      // 747: swap
      // 748: aastore
      // 749: dup_x2
      // 74a: dup_x2
      // 74b: pop
      // 74c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 74f: bipush 1
      // 750: swap
      // 751: aastore
      // 752: dup_x1
      // 753: swap
      // 754: bipush 0
      // 755: swap
      // 756: aastore
      // 757: ldc2_w 9132327933042510375
      // 75a: lload 2
      // 75b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 760: astore 28
      // 762: goto 78e
      // 765: aload 0
      // 766: aload 23
      // 768: lload 16
      // 76a: aload 23
      // 76c: bipush 3
      // 76d: anewarray 182
      // 770: dup_x1
      // 771: swap
      // 772: bipush 2
      // 773: swap
      // 774: aastore
      // 775: dup_x2
      // 776: dup_x2
      // 777: pop
      // 778: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 77b: bipush 1
      // 77c: swap
      // 77d: aastore
      // 77e: dup_x1
      // 77f: swap
      // 780: bipush 0
      // 781: swap
      // 782: aastore
      // 783: ldc2_w 9132327933042510375
      // 786: lload 2
      // 787: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78c: astore 28
      // 78e: aload 24
      // 790: aload 28
      // 792: lload 10
      // 794: bipush 3
      // 795: anewarray 182
      // 798: dup_x2
      // 799: dup_x2
      // 79a: pop
      // 79b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79e: bipush 2
      // 79f: swap
      // 7a0: aastore
      // 7a1: dup_x1
      // 7a2: swap
      // 7a3: bipush 1
      // 7a4: swap
      // 7a5: aastore
      // 7a6: dup_x1
      // 7a7: swap
      // 7a8: bipush 0
      // 7a9: swap
      // 7aa: aastore
      // 7ab: ldc2_w 8826558976416786067
      // 7ae: lload 2
      // 7af: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b4: aload 22
      // 7b6: ifnull 7e5
      // 7b9: ifeq 7e1
      // 7bc: goto 7c9
      // 7bf: ldc2_w 8846185665078241473
      // 7c2: lload 2
      // 7c3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c8: athrow
      // 7c9: aload 9
      // 7cb: aload 28
      // 7cd: ldc2_w 7124903583996735521
      // 7d0: lload 2
      // 7d1: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d6: return
      // 7d7: ldc2_w 8846185665078241473
      // 7da: lload 2
      // 7db: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e0: athrow
      // 7e1: getstatic com/zelix/hd.f J
      // 7e4: l2i
      // 7e5: istore 29
      // 7e7: bipush 0
      // 7e8: istore 30
      // 7ea: iload 7
      // 7ec: ifeq 823
      // 7ef: aload 0
      // 7f0: aload 28
      // 7f2: lload 16
      // 7f4: aload 25
      // 7f6: bipush 3
      // 7f7: anewarray 182
      // 7fa: dup_x1
      // 7fb: swap
      // 7fc: bipush 2
      // 7fd: swap
      // 7fe: aastore
      // 7ff: dup_x2
      // 800: dup_x2
      // 801: pop
      // 802: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 805: bipush 1
      // 806: swap
      // 807: aastore
      // 808: dup_x1
      // 809: swap
      // 80a: bipush 0
      // 80b: swap
      // 80c: aastore
      // 80d: ldc2_w 9132327933042510375
      // 810: lload 2
      // 811: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 816: astore 28
      // 818: lload 2
      // 819: lconst_0
      // 81a: lcmp
      // 81b: ifle 84c
      // 81e: aload 22
      // 820: ifnonnull 84c
      // 823: aload 0
      // 824: aload 28
      // 826: lload 16
      // 828: aload 23
      // 82a: bipush 3
      // 82b: anewarray 182
      // 82e: dup_x1
      // 82f: swap
      // 830: bipush 2
      // 831: swap
      // 832: aastore
      // 833: dup_x2
      // 834: dup_x2
      // 835: pop
      // 836: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 839: bipush 1
      // 83a: swap
      // 83b: aastore
      // 83c: dup_x1
      // 83d: swap
      // 83e: bipush 0
      // 83f: swap
      // 840: aastore
      // 841: ldc2_w 9132327933042510375
      // 844: lload 2
      // 845: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84a: astore 28
      // 84c: iload 7
      // 84e: aload 22
      // 850: lload 2
      // 851: lconst_0
      // 852: lcmp
      // 853: iflt 8bf
      // 856: ifnull 8bd
      // 859: ifne 8bb
      // 85c: goto 869
      // 85f: ldc2_w 8846185665078241473
      // 862: lload 2
      // 863: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 868: athrow
      // 869: aload 23
      // 86b: lload 14
      // 86d: aload 28
      // 86f: iload 29
      // 871: bipush 4
      // 872: anewarray 182
      // 875: dup_x1
      // 876: swap
      // 877: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 87a: bipush 3
      // 87b: swap
      // 87c: aastore
      // 87d: dup_x1
      // 87e: swap
      // 87f: bipush 2
      // 880: swap
      // 881: aastore
      // 882: dup_x2
      // 883: dup_x2
      // 884: pop
      // 885: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 888: bipush 1
      // 889: swap
      // 88a: aastore
      // 88b: dup_x1
      // 88c: swap
      // 88d: bipush 0
      // 88e: swap
      // 88f: aastore
      // 890: ldc2_w 9194196863841062268
      // 893: lload 2
      // 894: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 899: aload 22
      // 89b: ifnull a25
      // 89e: goto 8ab
      // 8a1: ldc2_w 8846185665078241473
      // 8a4: lload 2
      // 8a5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8aa: athrow
      // 8ab: ifeq a20
      // 8ae: goto 8bb
      // 8b1: ldc2_w 8846185665078241473
      // 8b4: lload 2
      // 8b5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ba: athrow
      // 8bb: iload 7
      // 8bd: aload 22
      // 8bf: lload 2
      // 8c0: lconst_0
      // 8c1: lcmp
      // 8c2: iflt 92e
      // 8c5: ifnull 92c
      // 8c8: ifne 92a
      // 8cb: goto 8d8
      // 8ce: ldc2_w 8846185665078241473
      // 8d1: lload 2
      // 8d2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d7: athrow
      // 8d8: aload 24
      // 8da: lload 14
      // 8dc: aload 28
      // 8de: iload 29
      // 8e0: bipush 4
      // 8e1: anewarray 182
      // 8e4: dup_x1
      // 8e5: swap
      // 8e6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8e9: bipush 3
      // 8ea: swap
      // 8eb: aastore
      // 8ec: dup_x1
      // 8ed: swap
      // 8ee: bipush 2
      // 8ef: swap
      // 8f0: aastore
      // 8f1: dup_x2
      // 8f2: dup_x2
      // 8f3: pop
      // 8f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8f7: bipush 1
      // 8f8: swap
      // 8f9: aastore
      // 8fa: dup_x1
      // 8fb: swap
      // 8fc: bipush 0
      // 8fd: swap
      // 8fe: aastore
      // 8ff: ldc2_w 9194196863841062268
      // 902: lload 2
      // 903: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 908: aload 22
      // 90a: ifnull a25
      // 90d: goto 91a
      // 910: ldc2_w 8846185665078241473
      // 913: lload 2
      // 914: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 919: athrow
      // 91a: ifeq a20
      // 91d: goto 92a
      // 920: ldc2_w 8846185665078241473
      // 923: lload 2
      // 924: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 929: athrow
      // 92a: iload 7
      // 92c: aload 22
      // 92e: lload 2
      // 92f: lconst_0
      // 930: lcmp
      // 931: ifle 99d
      // 934: ifnull 99b
      // 937: ifeq 999
      // 93a: goto 947
      // 93d: ldc2_w 8846185665078241473
      // 940: lload 2
      // 941: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 946: athrow
      // 947: aload 25
      // 949: lload 14
      // 94b: aload 28
      // 94d: iload 29
      // 94f: bipush 4
      // 950: anewarray 182
      // 953: dup_x1
      // 954: swap
      // 955: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 958: bipush 3
      // 959: swap
      // 95a: aastore
      // 95b: dup_x1
      // 95c: swap
      // 95d: bipush 2
      // 95e: swap
      // 95f: aastore
      // 960: dup_x2
      // 961: dup_x2
      // 962: pop
      // 963: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 966: bipush 1
      // 967: swap
      // 968: aastore
      // 969: dup_x1
      // 96a: swap
      // 96b: bipush 0
      // 96c: swap
      // 96d: aastore
      // 96e: ldc2_w 9194196863841062268
      // 971: lload 2
      // 972: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 977: aload 22
      // 979: ifnull a25
      // 97c: goto 989
      // 97f: ldc2_w 8846185665078241473
      // 982: lload 2
      // 983: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 988: athrow
      // 989: ifeq a20
      // 98c: goto 999
      // 98f: ldc2_w 8846185665078241473
      // 992: lload 2
      // 993: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 998: athrow
      // 999: iload 7
      // 99b: aload 22
      // 99d: lload 2
      // 99e: lconst_0
      // 99f: lcmp
      // 9a0: ifle 9f5
      // 9a3: ifnull 9f3
      // 9a6: ifeq a08
      // 9a9: goto 9b6
      // 9ac: ldc2_w 8846185665078241473
      // 9af: lload 2
      // 9b0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b5: athrow
      // 9b6: aload 26
      // 9b8: lload 14
      // 9ba: aload 28
      // 9bc: iload 29
      // 9be: bipush 4
      // 9bf: anewarray 182
      // 9c2: dup_x1
      // 9c3: swap
      // 9c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9c7: bipush 3
      // 9c8: swap
      // 9c9: aastore
      // 9ca: dup_x1
      // 9cb: swap
      // 9cc: bipush 2
      // 9cd: swap
      // 9ce: aastore
      // 9cf: dup_x2
      // 9d0: dup_x2
      // 9d1: pop
      // 9d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9d5: bipush 1
      // 9d6: swap
      // 9d7: aastore
      // 9d8: dup_x1
      // 9d9: swap
      // 9da: bipush 0
      // 9db: swap
      // 9dc: aastore
      // 9dd: ldc2_w 9194196863841062268
      // 9e0: lload 2
      // 9e1: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e6: goto 9f3
      // 9e9: ldc2_w 8846185665078241473
      // 9ec: lload 2
      // 9ed: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f2: athrow
      // 9f3: aload 22
      // 9f5: ifnull a25
      // 9f8: ifeq a20
      // 9fb: goto a08
      // 9fe: ldc2_w 8846185665078241473
      // a01: lload 2
      // a02: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a07: athrow
      // a08: aload 9
      // a0a: aload 28
      // a0c: ldc2_w 7124903583996735521
      // a0f: lload 2
      // a10: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a15: return
      // a16: ldc2_w 8846185665078241473
      // a19: lload 2
      // a1a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1f: athrow
      // a20: iload 30
      // a22: iinc 30 1
      // a25: bipush 3
      // a26: if_icmplt 7ea
      // a29: return
   }

   public hd(Object var1, boolean var2, long var3) {
      var3 = b ^ var3;
      long var5 = var3 ^ 64865378212134L;
      super(var5, var1);
      x44.a<"r">(this, var2, 500931983140586209L, var3);
   }

   private Color p(Object[] param1) {
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
      // 04: checkcast java/awt/Color
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/awt/Color
      // 18: astore 5
      // 1a: pop
      // 1b: getstatic com/zelix/hd.b J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 53687509762321
      // 26: lxor
      // 27: lstore 6
      // 29: pop2
      // 2a: ldc2_w 4557879648719738735
      // 2d: lload 3
      // 2e: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: astore 8
      // 35: aload 5
      // 37: aload 8
      // 39: ifnull 90
      // 3c: lload 6
      // 3e: lload 3
      // 3f: lconst_0
      // 40: lcmp
      // 41: ifle 8a
      // 44: dup2_x1
      // 45: pop2
      // 46: bipush 2
      // 47: anewarray 182
      // 4a: dup_x1
      // 4b: swap
      // 4c: bipush 1
      // 4d: swap
      // 4e: aastore
      // 4f: dup_x2
      // 50: dup_x2
      // 51: pop
      // 52: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55: bipush 0
      // 56: swap
      // 57: aastore
      // 58: ldc2_w 4580960677250132690
      // 5b: lload 3
      // 5c: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: ifne 86
      // 64: goto 71
      // 67: ldc2_w 2609523305913480756
      // 6a: lload 3
      // 6b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: aload 2
      // 72: ldc2_w 4036001796309049057
      // 75: lload 3
      // 76: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: areturn
      // 7c: ldc2_w 2609523305913480756
      // 7f: lload 3
      // 80: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: aload 2
      // 87: ldc2_w 2705603899138044280
      // 8a: lload 3
      // 8b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/awt/Color; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: areturn
   }

   static {
      long var5 = b ^ 39974919094451L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "bNã\u0016éßá\u001ex|E\u000bý¿x\u0007À\u0013ºv\u009a3æÏßzW\u001f\\}\u0093\u0091Õºz\u0017õ®5\u009e0kH¬\u0084»ÞLq¼v]iÒ|\u009d)f¥\u0004{Ù\u001a\t\u009a±ªVT2ß\u009d§G}ô\u0093â:hÁÙóe\u0096\u0018\u008a·\u0012";
      int var13 = "bNã\u0016éßá\u001ex|E\u000bý¿x\u0007À\u0013ºv\u009a3æÏßzW\u001f\\}\u0093\u0091Õºz\u0017õ®5\u009e0kH¬\u0084»ÞLq¼v]iÒ|\u009d)f¥\u0004{Ù\u001a\t\u009a±ªVT2ß\u009d§G}ô\u0093â:hÁÙóe\u0096\u0018\u008a·\u0012"
         .length();
      char var10 = '(';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = a(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            c = var14;
            d = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -8929891689014275417L;
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
            long var23 = ((long)var4[0] & 255L) << 56
               | ((long)var4[1] & 255L) << 48
               | ((long)var4[2] & 255L) << 40
               | ((long)var4[3] & 255L) << 32
               | ((long)var4[4] & 255L) << 24
               | ((long)var4[5] & 255L) << 16
               | ((long)var4[6] & 255L) << 8
               | (long)var4[7] & 255L;
            var10001 = -1;
            f = var23;
            return;
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9811;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/hd", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/hd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
