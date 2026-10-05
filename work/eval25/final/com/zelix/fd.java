package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fd extends fs implements s0 {
   private boolean C;
   private boolean N;
   private static final long b = ess.a(9095914160922714507L, 5843597813838224251L, MethodHandles.lookup().lookupClass()).a(195193704794129L);
   private static final String d;

   public boolean T(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"h">(this, -3264091092204832535L, var2);
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      x44.a<"q">(this, true, 7155517194875078935L, var2);
   }

   public boolean A(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 92552108603200
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 6373484469446212045
      // 18: lload 2
      // 19: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: bipush 0
      // 20: invokevirtual com/zelix/fd.e (I)Lcom/zelix/_za;
      // 23: checkcast com/zelix/_f6
      // 26: astore 7
      // 28: astore 6
      // 2a: aload 7
      // 2c: instanceof com/zelix/g5
      // 2f: aload 6
      // 31: ifnonnull 6d
      // 34: ifeq 6c
      // 37: goto 44
      // 3a: ldc2_w 6552325268780092699
      // 3d: lload 2
      // 3e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: aload 7
      // 46: checkcast com/zelix/g5
      // 49: lload 4
      // 4b: bipush 1
      // 4c: anewarray 156
      // 4f: dup_x2
      // 50: dup_x2
      // 51: pop
      // 52: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 55: bipush 0
      // 56: swap
      // 57: aastore
      // 58: ldc2_w 6771643705483782504
      // 5b: lload 2
      // 5c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: ireturn
      // 62: ldc2_w 6552325268780092699
      // 65: lload 2
      // 66: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 0
      // 6d: ireturn
   }

   public boolean W(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"h">(this, 7182124606695996163L, var2);
   }

   public void t(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/_za
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 3
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 50052436472016
      // 21: lxor
      // 22: lstore 6
      // 24: dup2
      // 25: ldc2_w 0
      // 28: lxor
      // 29: lstore 8
      // 2b: pop2
      // 2c: ldc2_w 9148277501292601163
      // 2f: lload 4
      // 31: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 0
      // 37: bipush 0
      // 38: invokevirtual com/zelix/fd.e (I)Lcom/zelix/_za;
      // 3b: lload 8
      // 3d: aload 0
      // 3e: aload 3
      // 3f: bipush 3
      // 40: anewarray 156
      // 43: dup_x1
      // 44: swap
      // 45: bipush 2
      // 46: swap
      // 47: aastore
      // 48: dup_x1
      // 49: swap
      // 4a: bipush 1
      // 4b: swap
      // 4c: aastore
      // 4d: dup_x2
      // 4e: dup_x2
      // 4f: pop
      // 50: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53: bipush 0
      // 54: swap
      // 55: aastore
      // 56: ldc2_w 8818198965911889370
      // 59: lload 4
      // 5b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: astore 10
      // 62: aload 2
      // 63: aload 10
      // 65: ifnonnull 8b
      // 68: instanceof com/zelix/za
      // 6b: ifeq ad
      // 6e: goto 7c
      // 71: ldc2_w 8964580725496294301
      // 74: lload 4
      // 76: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: aload 2
      // 7d: goto 8b
      // 80: ldc2_w 8964580725496294301
      // 83: lload 4
      // 85: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: checkcast com/zelix/za
      // 8e: lload 6
      // 90: aload 0
      // 91: bipush 2
      // 92: anewarray 156
      // 95: dup_x1
      // 96: swap
      // 97: bipush 1
      // 98: swap
      // 99: aastore
      // 9a: dup_x2
      // 9b: dup_x2
      // 9c: pop
      // 9d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a0: bipush 0
      // a1: swap
      // a2: aastore
      // a3: ldc2_w 8988087116308480844
      // a6: lload 4
      // a8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: return
   }

   public fd(int var1, long var2) {
      var2 = b ^ var2;
      long var4 = var2 ^ 77740154212672L;
      super(var4, var1);
   }

   public double F(Object[] param1) {
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
      // 004: checkcast com/zelix/_uq
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/ff
      // 019: astore 5
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 79120071637548
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 115997768060709
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 95346187370460
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 82042500282919
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 120060363683518
      // 03d: lxor
      // 03e: lstore 14
      // 040: dup2
      // 041: ldc2_w 73989313903213
      // 044: lxor
      // 045: lstore 16
      // 047: pop2
      // 048: ldc2_w -8604300542354478807
      // 04b: lload 2
      // 04c: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: dconst_1
      // 052: dstore 19
      // 054: astore 18
      // 056: aload 0
      // 057: bipush 0
      // 058: invokevirtual com/zelix/fd.e (I)Lcom/zelix/_za;
      // 05b: checkcast com/zelix/_f6
      // 05e: astore 21
      // 060: aload 21
      // 062: aload 18
      // 064: ifnonnull 089
      // 067: instanceof com/zelix/g5
      // 06a: ifeq 133
      // 06d: goto 07a
      // 070: ldc2_w -8499768625082016257
      // 073: lload 2
      // 074: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 21
      // 07c: goto 089
      // 07f: ldc2_w -8499768625082016257
      // 082: lload 2
      // 083: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: lload 10
      // 08b: bipush 1
      // 08c: anewarray 156
      // 08f: dup_x2
      // 090: dup_x2
      // 091: pop
      // 092: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 095: bipush 0
      // 096: swap
      // 097: aastore
      // 098: ldc2_w -8341841567393410322
      // 09b: lload 2
      // 09c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: astore 22
      // 0a3: aload 22
      // 0a5: lload 2
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: iflt 0c2
      // 0ab: aload 18
      // 0ad: ifnonnull 0c2
      // 0b0: ifnull 133
      // 0b3: goto 0c0
      // 0b6: ldc2_w -8499768625082016257
      // 0b9: lload 2
      // 0ba: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 22
      // 0c2: bipush 1
      // 0c3: anewarray 156
      // 0c6: dup_x1
      // 0c7: swap
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: ldc2_w -7728873063521750745
      // 0ce: lload 2
      // 0cf: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: aload 18
      // 0d6: ifnonnull 115
      // 0d9: ifne 133
      // 0dc: goto 0e9
      // 0df: ldc2_w -8499768625082016257
      // 0e2: lload 2
      // 0e3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: lload 12
      // 0eb: aload 22
      // 0ed: bipush 2
      // 0ee: anewarray 156
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: bipush 1
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x2
      // 0f7: dup_x2
      // 0f8: pop
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: ldc2_w -8049830186795294380
      // 102: lload 2
      // 103: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: goto 115
      // 10b: ldc2_w -8499768625082016257
      // 10e: lload 2
      // 10f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: ifne 12b
      // 118: dload 19
      // 11a: ldc2_w 0.1
      // 11d: dmul
      // 11e: dstore 19
      // 120: lload 2
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 133
      // 126: aload 18
      // 128: ifnull 133
      // 12b: dload 19
      // 12d: ldc2_w 0.5
      // 130: dmul
      // 131: dstore 19
      // 133: aload 4
      // 135: lload 2
      // 136: lconst_0
      // 137: lcmp
      // 138: iflt 152
      // 13b: aload 18
      // 13d: ifnonnull 152
      // 140: ifnull 27c
      // 143: goto 150
      // 146: ldc2_w -8499768625082016257
      // 149: lload 2
      // 14a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: aload 4
      // 152: lload 6
      // 154: bipush 1
      // 155: anewarray 156
      // 158: dup_x2
      // 159: dup_x2
      // 15a: pop
      // 15b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15e: bipush 0
      // 15f: swap
      // 160: aastore
      // 161: ldc2_w -7992272927949534917
      // 164: lload 2
      // 165: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: aload 18
      // 16c: lload 2
      // 16d: lconst_0
      // 16e: lcmp
      // 16f: iflt 1b0
      // 172: ifnonnull 1ae
      // 175: ifeq 192
      // 178: goto 185
      // 17b: ldc2_w -8499768625082016257
      // 17e: lload 2
      // 17f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: dload 19
      // 187: ldc2_w 0.5
      // 18a: dmul
      // 18b: dstore 19
      // 18d: aload 18
      // 18f: ifnull 1d1
      // 192: aload 4
      // 194: bipush 0
      // 195: anewarray 156
      // 198: ldc2_w -7910891240059402364
      // 19b: lload 2
      // 19c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: goto 1ae
      // 1a4: ldc2_w -8499768625082016257
      // 1a7: lload 2
      // 1a8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: aload 18
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: ifle 1ed
      // 1b6: ifnonnull 1eb
      // 1b9: ifeq 1d1
      // 1bc: goto 1c9
      // 1bf: ldc2_w -8499768625082016257
      // 1c2: lload 2
      // 1c3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: dload 19
      // 1cb: ldc2_w 0.5
      // 1ce: dmul
      // 1cf: dstore 19
      // 1d1: aload 4
      // 1d3: lload 16
      // 1d5: bipush 1
      // 1d6: anewarray 156
      // 1d9: dup_x2
      // 1da: dup_x2
      // 1db: pop
      // 1dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1df: bipush 0
      // 1e0: swap
      // 1e1: aastore
      // 1e2: ldc2_w -7797499343711553705
      // 1e5: lload 2
      // 1e6: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: aload 18
      // 1ed: lload 2
      // 1ee: lconst_0
      // 1ef: lcmp
      // 1f0: iflt 22a
      // 1f3: ifnonnull 228
      // 1f6: ifeq 20e
      // 1f9: goto 206
      // 1fc: ldc2_w -8499768625082016257
      // 1ff: lload 2
      // 200: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: athrow
      // 206: dload 19
      // 208: ldc2_w 0.1
      // 20b: dmul
      // 20c: dstore 19
      // 20e: aload 4
      // 210: lload 8
      // 212: bipush 1
      // 213: anewarray 156
      // 216: dup_x2
      // 217: dup_x2
      // 218: pop
      // 219: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21c: bipush 0
      // 21d: swap
      // 21e: aastore
      // 21f: ldc2_w -7670108499956429304
      // 222: lload 2
      // 223: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: aload 18
      // 22a: ifnonnull 271
      // 22d: ifeq 24a
      // 230: goto 23d
      // 233: ldc2_w -8499768625082016257
      // 236: lload 2
      // 237: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: dload 19
      // 23f: ldc2_w 0.1
      // 242: dmul
      // 243: dstore 19
      // 245: aload 18
      // 247: ifnull 27c
      // 24a: aload 4
      // 24c: lload 14
      // 24e: bipush 1
      // 24f: anewarray 156
      // 252: dup_x2
      // 253: dup_x2
      // 254: pop
      // 255: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 258: bipush 0
      // 259: swap
      // 25a: aastore
      // 25b: ldc2_w -8260481775844392842
      // 25e: lload 2
      // 25f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: goto 271
      // 267: ldc2_w -8499768625082016257
      // 26a: lload 2
      // 26b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: athrow
      // 271: ifeq 27c
      // 274: dload 19
      // 276: ldc2_w 0.1
      // 279: dmul
      // 27a: dstore 19
      // 27c: aload 5
      // 27e: ifnull 289
      // 281: dload 19
      // 283: ldc2_w 0.1
      // 286: dmul
      // 287: dstore 19
      // 289: dload 19
      // 28b: dreturn
   }

   public String W(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 30071177813935L;
      return x44.a<"h">((_f6)this.e(0), new Object[]{var4}, 7802660783318528669L, var2);
   }

   public void C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      x44.a<"p">(this, true, 581868027760644284L, var2);
   }

   public String o(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 8596022076981270261
      // 18: lload 2
      // 19: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: astore 6
      // 20: new java/lang/StringBuilder
      // 23: dup
      // 24: invokespecial java/lang/StringBuilder.<init> ()V
      // 27: aload 0
      // 28: bipush 0
      // 29: invokevirtual com/zelix/fd.e (I)Lcom/zelix/_za;
      // 2c: checkcast com/zelix/_f6
      // 2f: lload 4
      // 31: bipush 1
      // 32: anewarray 156
      // 35: dup_x2
      // 36: dup_x2
      // 37: pop
      // 38: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b: bipush 0
      // 3c: swap
      // 3d: aastore
      // 3e: ldc2_w 8351791356079598898
      // 41: lload 2
      // 42: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: aload 6
      // 49: ifnonnull 78
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: aload 0
      // 50: ldc2_w 8099511208873552072
      // 53: lload 2
      // 54: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: ifeq 7b
      // 5c: goto 69
      // 5f: ldc2_w 8491141065441092131
      // 62: lload 2
      // 63: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: ldc "^"
      // 6b: goto 78
      // 6e: ldc2_w 8491141065441092131
      // 71: lload 2
      // 72: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: goto 7d
      // 7b: ldc ""
      // 7d: lload 2
      // 7e: lconst_0
      // 7f: lcmp
      // 80: iflt 96
      // 83: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 86: aload 0
      // 87: ldc2_w 7944611985901388826
      // 8a: lload 2
      // 8b: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: ifeq a3
      // 93: getstatic com/zelix/fd.d Ljava/lang/String;
      // 96: goto a5
      // 99: ldc2_w 8491141065441092131
      // 9c: lload 2
      // 9d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: athrow
      // a3: ldc ""
      // a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // ab: areturn
   }

   static {
      long var0 = b ^ 129470085920551L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("5\u008b ¶\u008b\"'«".getBytes("ISO-8859-1"));
      String var5 = b(var4).intern();
      byte var10001 = -1;
      d = var5;
   }

   private static gj a(gj var0) {
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
}
