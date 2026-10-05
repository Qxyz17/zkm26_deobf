package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class rs {
   private boolean G;
   private final zy Y;
   rl V;
   private static final long a = ess.a(9081788738252621229L, 7618181882243815055L, MethodHandles.lookup().lookupClass()).a(22268766010759L);

   rs(long var1, rl var3, zy var4, boolean var5) {
      var1 = a ^ var1;
      super();
      x44.a<"w">(this, var3, -5848428786857433156L, var1);
      this.Y = var4;
      x44.a<"w">(this, var5, -6290988853502469483L, var1);
   }

   final boolean T(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 9
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Boolean
      // 016: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 019: istore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_y4
      // 021: astore 3
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/_8z
      // 028: astore 10
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/lang/Long
      // 030: invokevirtual java/lang/Long.longValue ()J
      // 033: lstore 7
      // 035: dup
      // 036: bipush 6
      // 038: aaload
      // 039: checkcast java/util/Set
      // 03c: astore 11
      // 03e: dup
      // 03f: bipush 7
      // 041: aaload
      // 042: checkcast com/zelix/a9
      // 045: astore 4
      // 047: dup
      // 048: bipush 8
      // 04a: aaload
      // 04b: checkcast com/zelix/_uw
      // 04e: astore 5
      // 050: pop
      // 051: getstatic com/zelix/rs.a J
      // 054: lload 7
      // 056: lxor
      // 057: lstore 7
      // 059: lload 7
      // 05b: dup2
      // 05c: ldc2_w 35228939606960
      // 05f: lxor
      // 060: lstore 12
      // 062: dup2
      // 063: ldc2_w 29626886663463
      // 066: lxor
      // 067: lstore 14
      // 069: dup2
      // 06a: ldc2_w 28790714325219
      // 06d: lxor
      // 06e: lstore 16
      // 070: dup2
      // 071: ldc2_w 92217776641040
      // 074: lxor
      // 075: lstore 18
      // 077: dup2
      // 078: ldc2_w 15512511417757
      // 07b: lxor
      // 07c: dup2
      // 07d: bipush 32
      // 07f: lushr
      // 080: l2i
      // 081: istore 20
      // 083: dup2
      // 084: bipush 32
      // 086: lshl
      // 087: bipush 48
      // 089: lushr
      // 08a: l2i
      // 08b: istore 21
      // 08d: dup2
      // 08e: bipush 48
      // 090: lshl
      // 091: bipush 48
      // 093: lushr
      // 094: l2i
      // 095: istore 22
      // 097: pop2
      // 098: dup2
      // 099: ldc2_w 110774347360505
      // 09c: lxor
      // 09d: lstore 23
      // 09f: pop2
      // 0a0: ldc2_w 4034442242905123813
      // 0a3: lload 7
      // 0a5: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: astore 25
      // 0ac: new java/lang/StringBuilder
      // 0af: dup
      // 0b0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b3: aload 2
      // 0b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b7: aload 2
      // 0b8: aload 25
      // 0ba: ifnonnull 0e1
      // 0bd: invokevirtual java/lang/String.length ()I
      // 0c0: ifle 0e4
      // 0c3: goto 0d1
      // 0c6: ldc2_w 3821447852582440331
      // 0c9: lload 7
      // 0cb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: ldc "/"
      // 0d3: goto 0e1
      // 0d6: ldc2_w 3821447852582440331
      // 0d9: lload 7
      // 0db: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: goto 0e6
      // 0e4: ldc ""
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: aload 9
      // 0eb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ee: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f1: astore 26
      // 0f3: aload 3
      // 0f4: iload 20
      // 0f6: iload 21
      // 0f8: i2s
      // 0f9: iload 22
      // 0fb: i2c
      // 0fc: aload 26
      // 0fe: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 101: aload 25
      // 103: ifnonnull 118
      // 106: ifeq 119
      // 109: goto 117
      // 10c: ldc2_w 3821447852582440331
      // 10f: lload 7
      // 111: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: bipush 0
      // 118: ireturn
      // 119: aload 4
      // 11b: aload 25
      // 11d: ifnonnull 18d
      // 120: ifnull 18b
      // 123: goto 131
      // 126: ldc2_w 3821447852582440331
      // 129: lload 7
      // 12b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: aload 4
      // 133: aload 25
      // 135: lload 7
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 18f
      // 13c: ifnonnull 18d
      // 13f: goto 14d
      // 142: ldc2_w 3821447852582440331
      // 145: lload 7
      // 147: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: aload 26
      // 14f: lload 23
      // 151: bipush 2
      // 152: anewarray 47
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 1
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: ldc2_w 2892378093202686973
      // 166: lload 7
      // 168: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: ifeq 18b
      // 170: goto 17e
      // 173: ldc2_w 3821447852582440331
      // 176: lload 7
      // 178: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: bipush 0
      // 17f: ireturn
      // 180: ldc2_w 3821447852582440331
      // 183: lload 7
      // 185: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: aload 4
      // 18d: aload 25
      // 18f: lload 7
      // 191: lconst_0
      // 192: lcmp
      // 193: iflt 1c2
      // 196: ifnonnull 1ac
      // 199: ifnull 1f6
      // 19c: goto 1aa
      // 19f: ldc2_w 3821447852582440331
      // 1a2: lload 7
      // 1a4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: athrow
      // 1aa: aload 4
      // 1ac: aload 26
      // 1ae: lload 12
      // 1b0: bipush 2
      // 1b1: anewarray 47
      // 1b4: dup_x2
      // 1b5: dup_x2
      // 1b6: pop
      // 1b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ba: bipush 1
      // 1bb: swap
      // 1bc: aastore
      // 1bd: dup_x1
      // 1be: swap
      // 1bf: bipush 0
      // 1c0: swap
      // 1c1: aastore
      // 1c2: ldc2_w 3257110467367753125
      // 1c5: lload 7
      // 1c7: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: aload 25
      // 1ce: lload 7
      // 1d0: lconst_0
      // 1d1: lcmp
      // 1d2: iflt 220
      // 1d5: ifnonnull 21e
      // 1d8: ifeq 1f6
      // 1db: goto 1e9
      // 1de: ldc2_w 3821447852582440331
      // 1e1: lload 7
      // 1e3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: athrow
      // 1e9: bipush 0
      // 1ea: ireturn
      // 1eb: ldc2_w 3821447852582440331
      // 1ee: lload 7
      // 1f0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: athrow
      // 1f6: aload 10
      // 1f8: aload 2
      // 1f9: lload 16
      // 1fb: aload 9
      // 1fd: bipush 3
      // 1fe: anewarray 47
      // 201: dup_x1
      // 202: swap
      // 203: bipush 2
      // 204: swap
      // 205: aastore
      // 206: dup_x2
      // 207: dup_x2
      // 208: pop
      // 209: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20c: bipush 1
      // 20d: swap
      // 20e: aastore
      // 20f: dup_x1
      // 210: swap
      // 211: bipush 0
      // 212: swap
      // 213: aastore
      // 214: ldc2_w 3217698431706071749
      // 217: lload 7
      // 219: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: aload 25
      // 220: ifnonnull 235
      // 223: ifeq 236
      // 226: goto 234
      // 229: ldc2_w 3821447852582440331
      // 22c: lload 7
      // 22e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: athrow
      // 234: bipush 0
      // 235: ireturn
      // 236: aload 11
      // 238: lload 7
      // 23a: lconst_0
      // 23b: lcmp
      // 23c: iflt 257
      // 23f: aload 25
      // 241: ifnonnull 257
      // 244: ifnull 288
      // 247: goto 255
      // 24a: ldc2_w 3821447852582440331
      // 24d: lload 7
      // 24f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: athrow
      // 255: aload 11
      // 257: aload 9
      // 259: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 25e: aload 25
      // 260: lload 7
      // 262: lconst_0
      // 263: lcmp
      // 264: iflt 28c
      // 267: ifnonnull 28a
      // 26a: ifeq 288
      // 26d: goto 27b
      // 270: ldc2_w 3821447852582440331
      // 273: lload 7
      // 275: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27a: athrow
      // 27b: bipush 0
      // 27c: ireturn
      // 27d: ldc2_w 3821447852582440331
      // 280: lload 7
      // 282: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: athrow
      // 288: iload 6
      // 28a: aload 25
      // 28c: ifnonnull 30a
      // 28f: ifeq 2e8
      // 292: goto 2a0
      // 295: ldc2_w 3821447852582440331
      // 298: lload 7
      // 29a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: athrow
      // 2a0: aload 9
      // 2a2: bipush 0
      // 2a3: invokevirtual java/lang/String.charAt (I)C
      // 2a6: ldc2_w 3744890928032407279
      // 2a9: lload 7
      // 2ab: invokedynamic q (CJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: aload 25
      // 2b2: lload 7
      // 2b4: lconst_0
      // 2b5: lcmp
      // 2b6: ifle 30c
      // 2b9: ifnonnull 30a
      // 2bc: goto 2ca
      // 2bf: ldc2_w 3821447852582440331
      // 2c2: lload 7
      // 2c4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: athrow
      // 2ca: ifne 2e8
      // 2cd: goto 2db
      // 2d0: ldc2_w 3821447852582440331
      // 2d3: lload 7
      // 2d5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: athrow
      // 2db: bipush 0
      // 2dc: ireturn
      // 2dd: ldc2_w 3821447852582440331
      // 2e0: lload 7
      // 2e2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e7: athrow
      // 2e8: aload 5
      // 2ea: lload 14
      // 2ec: aload 26
      // 2ee: bipush 2
      // 2ef: anewarray 47
      // 2f2: dup_x1
      // 2f3: swap
      // 2f4: bipush 1
      // 2f5: swap
      // 2f6: aastore
      // 2f7: dup_x2
      // 2f8: dup_x2
      // 2f9: pop
      // 2fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fd: bipush 0
      // 2fe: swap
      // 2ff: aastore
      // 300: ldc2_w 3459671402753178477
      // 303: lload 7
      // 305: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: aload 25
      // 30c: ifnonnull 37d
      // 30f: ifeq 37c
      // 312: goto 320
      // 315: ldc2_w 3821447852582440331
      // 318: lload 7
      // 31a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: athrow
      // 320: aload 0
      // 321: ldc2_w 3070048647096640497
      // 324: lload 7
      // 326: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/rl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32b: aload 26
      // 32d: lload 18
      // 32f: bipush 2
      // 330: anewarray 47
      // 333: dup_x2
      // 334: dup_x2
      // 335: pop
      // 336: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 339: bipush 1
      // 33a: swap
      // 33b: aastore
      // 33c: dup_x1
      // 33d: swap
      // 33e: bipush 0
      // 33f: swap
      // 340: aastore
      // 341: ldc2_w 2952745772159895328
      // 344: lload 7
      // 346: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: aload 25
      // 34d: ifnonnull 37d
      // 350: goto 35e
      // 353: ldc2_w 3821447852582440331
      // 356: lload 7
      // 358: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35d: athrow
      // 35e: ifeq 37c
      // 361: goto 36f
      // 364: ldc2_w 3821447852582440331
      // 367: lload 7
      // 369: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36e: athrow
      // 36f: bipush 0
      // 370: ireturn
      // 371: ldc2_w 3821447852582440331
      // 374: lload 7
      // 376: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37b: athrow
      // 37c: bipush 1
      // 37d: ireturn
   }

   boolean Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 5664875621670649017L, var2);
   }

   abstract String k(Object[] var1);

   private static gj b(gj var0) {
      return var0;
   }
}
