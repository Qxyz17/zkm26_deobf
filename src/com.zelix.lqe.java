package com.zelix;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
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

public class lqe implements loz {
   private ah g;
   private String o;
   private Dimension R;
   private int x;
   private int S;
   private Point E;
   private ge[] I;
   private ge[] U;
   private Component i;
   private Integer[] t;
   private static final long a = prr.a(4835798816606906012L, 2501910563140626736L, MethodHandles.lookup().lookupClass()).a(64943501811344L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map h;

   boolean J(Object[] param1) {
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
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
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
      // 019: checkcast [Lcom/zelix/ge;
      // 01c: astore 4
      // 01e: pop
      // 01f: getstatic com/zelix/lqe.a J
      // 022: lload 2
      // 023: lxor
      // 024: lstore 2
      // 025: lload 2
      // 026: dup2
      // 027: ldc2_w 80491644415486
      // 02a: lxor
      // 02b: lstore 6
      // 02d: dup2
      // 02e: ldc2_w 75076885409049
      // 031: lxor
      // 032: lstore 8
      // 034: pop2
      // 035: ldc2_w -5954044446587778520
      // 038: lload 2
      // 039: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: bipush 1
      // 03f: newarray 4
      // 041: dup
      // 042: bipush 0
      // 043: bipush 0
      // 044: bastore
      // 045: astore 11
      // 047: bipush 0
      // 048: istore 12
      // 04a: astore 10
      // 04c: iload 12
      // 04e: sipush 8342
      // 051: ldc2_w 3166806071588882756
      // 054: lload 2
      // 055: lxor
      // 056: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: if_icmpge 0bf
      // 05e: aload 0
      // 05f: iload 12
      // 061: aload 4
      // 063: aload 11
      // 065: iload 5
      // 067: lload 6
      // 069: bipush 5
      // 06a: anewarray 168
      // 06d: dup_x2
      // 06e: dup_x2
      // 06f: pop
      // 070: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 073: bipush 4
      // 074: swap
      // 075: aastore
      // 076: dup_x1
      // 077: swap
      // 078: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07b: bipush 3
      // 07c: swap
      // 07d: aastore
      // 07e: dup_x1
      // 07f: swap
      // 080: bipush 2
      // 081: swap
      // 082: aastore
      // 083: dup_x1
      // 084: swap
      // 085: bipush 1
      // 086: swap
      // 087: aastore
      // 088: dup_x1
      // 089: swap
      // 08a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w -5223833805895859749
      // 093: lload 2
      // 094: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: iinc 12 1
      // 09c: aload 10
      // 09e: lload 2
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: ifle 0a9
      // 0a4: ifnull 0c2
      // 0a7: aload 10
      // 0a9: ifnonnull 04c
      // 0ac: lload 2
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: iflt 09c
      // 0b2: goto 0bf
      // 0b5: ldc2_w -6125846963550884061
      // 0b8: lload 2
      // 0b9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: bipush 0
      // 0c0: istore 12
      // 0c2: bipush 1
      // 0c3: istore 13
      // 0c5: iload 13
      // 0c7: ifeq 17e
      // 0ca: bipush 1
      // 0cb: newarray 4
      // 0cd: dup
      // 0ce: bipush 0
      // 0cf: bipush 0
      // 0d0: bastore
      // 0d1: astore 14
      // 0d3: bipush 0
      // 0d4: aload 10
      // 0d6: lload 2
      // 0d7: lconst_0
      // 0d8: lcmp
      // 0d9: ifle 18a
      // 0dc: ifnull 188
      // 0df: istore 15
      // 0e1: iload 15
      // 0e3: sipush 11209
      // 0e6: ldc2_w 4557197708296684048
      // 0e9: lload 2
      // 0ea: lxor
      // 0eb: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: if_icmpge 154
      // 0f3: aload 0
      // 0f4: lload 8
      // 0f6: iload 15
      // 0f8: aload 4
      // 0fa: aload 14
      // 0fc: iload 5
      // 0fe: bipush 5
      // 0ff: anewarray 168
      // 102: dup_x1
      // 103: swap
      // 104: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 107: bipush 4
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 3
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x1
      // 110: swap
      // 111: bipush 2
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 119: bipush 1
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x2
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w -5432517714276802596
      // 128: lload 2
      // 129: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: iinc 15 1
      // 131: lload 2
      // 132: lconst_0
      // 133: lcmp
      // 134: ifle 15a
      // 137: aload 10
      // 139: ifnull 15a
      // 13c: aload 10
      // 13e: ifnonnull 0e1
      // 141: lload 2
      // 142: lconst_0
      // 143: lcmp
      // 144: iflt 131
      // 147: goto 154
      // 14a: ldc2_w -6125846963550884061
      // 14d: lload 2
      // 14e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: aload 14
      // 156: bipush 0
      // 157: baload
      // 158: istore 13
      // 15a: iload 13
      // 15c: aload 10
      // 15e: ifnull 172
      // 161: ifeq 175
      // 164: goto 171
      // 167: ldc2_w -6125846963550884061
      // 16a: lload 2
      // 16b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: bipush 1
      // 172: goto 177
      // 175: iload 12
      // 177: istore 12
      // 179: aload 10
      // 17b: ifnonnull 0c5
      // 17e: aload 11
      // 180: lload 2
      // 181: lconst_0
      // 182: lcmp
      // 183: iflt 0d1
      // 186: bipush 0
      // 187: baload
      // 188: aload 10
      // 18a: ifnull 1c2
      // 18d: ifne 1c1
      // 190: goto 19d
      // 193: ldc2_w -6125846963550884061
      // 196: lload 2
      // 197: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: iload 12
      // 19f: aload 10
      // 1a1: ifnull 1c2
      // 1a4: goto 1b1
      // 1a7: ldc2_w -6125846963550884061
      // 1aa: lload 2
      // 1ab: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: athrow
      // 1b1: ifeq 1c5
      // 1b4: goto 1c1
      // 1b7: ldc2_w -6125846963550884061
      // 1ba: lload 2
      // 1bb: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: bipush 1
      // 1c2: goto 1c6
      // 1c5: bipush 0
      // 1c6: ireturn
   }

   Dimension C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new Dimension(m44.a<"w">(this, -2334029878854082072L, var2)[0], m44.a<"w">(this, -2334029878854082072L, var2)[1]);
   }

   lqe(String var1, Component var2, ah var3, long var4) {
      var4 = a ^ var4;
      super();
      m44.a<"r">(this, new ge[b<"y">(8342, 3166818710580123905L ^ var4)], -1759376754393423527L, var4);
      m44.a<"r">(this, new Integer[b<"y">(8342, 3166818710580123905L ^ var4)], -1732573207605339769L, var4);
      m44.a<"r">(this, var1, -129328529003537500L, var4);
      m44.a<"r">(this, var2, -2226400702545222084L, var4);
      m44.a<"r">(this, var3, -2014290771626815543L, var4);
   }

   boolean E(Object[] param1) {
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
      // 00c: getstatic com/zelix/lqe.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 26811966733935
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 56660400106702
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 106096021321345
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 131798887167243
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 15754050949344
      // 033: lxor
      // 034: lstore 12
      // 036: dup2
      // 037: ldc2_w 95911641576674
      // 03a: lxor
      // 03b: lstore 14
      // 03d: dup2
      // 03e: ldc2_w 63425431823798
      // 041: lxor
      // 042: lstore 16
      // 044: dup2
      // 045: ldc2_w 65701567959634
      // 048: lxor
      // 049: lstore 18
      // 04b: pop2
      // 04c: ldc2_w 4842369630362362949
      // 04f: lload 2
      // 050: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: astore 20
      // 057: aload 0
      // 058: ldc2_w 4686052567561725265
      // 05b: lload 2
      // 05c: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: aload 20
      // 063: ifnull 0a7
      // 066: ifnonnull 341
      // 069: goto 076
      // 06c: ldc2_w 4940993317882560846
      // 06f: lload 2
      // 070: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: aload 0
      // 077: sipush 8342
      // 07a: ldc2_w 3166787882665371433
      // 07d: lload 2
      // 07e: lxor
      // 07f: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: anewarray 420
      // 087: ldc2_w 4686052567561725265
      // 08a: lload 2
      // 08b: invokedynamic r (Ljava/lang/Object;[Lcom/zelix/ge;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: aload 0
      // 091: ldc2_w 6466338050627297137
      // 094: lload 2
      // 095: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: goto 0a7
      // 09d: ldc2_w 4940993317882560846
      // 0a0: lload 2
      // 0a1: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: bipush 0
      // 0a8: aload 0
      // 0a9: ldc2_w 4686052567561725265
      // 0ac: lload 2
      // 0ad: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: bipush 0
      // 0b3: sipush 8342
      // 0b6: ldc2_w 3166787882665371433
      // 0b9: lload 2
      // 0ba: lxor
      // 0bb: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0c3: bipush 0
      // 0c4: istore 21
      // 0c6: iload 21
      // 0c8: sipush 8342
      // 0cb: ldc2_w 3166787882665371433
      // 0ce: lload 2
      // 0cf: lxor
      // 0d0: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: if_icmpge 341
      // 0d8: aload 0
      // 0d9: ldc2_w 4686052567561725265
      // 0dc: lload 2
      // 0dd: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: iload 21
      // 0e4: aaload
      // 0e5: astore 22
      // 0e7: lload 2
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: iflt 344
      // 0ed: aload 20
      // 0ef: ifnull 344
      // 0f2: aload 20
      // 0f4: lload 2
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: iflt 33e
      // 0fa: ifnull 33c
      // 0fd: goto 10a
      // 100: ldc2_w 4940993317882560846
      // 103: lload 2
      // 104: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: aload 22
      // 10c: ifnull 339
      // 10f: goto 11c
      // 112: ldc2_w 4940993317882560846
      // 115: lload 2
      // 116: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: aload 22
      // 11e: lload 8
      // 120: bipush 1
      // 121: anewarray 168
      // 124: dup_x2
      // 125: dup_x2
      // 126: pop
      // 127: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12a: bipush 0
      // 12b: swap
      // 12c: aastore
      // 12d: ldc2_w 6815706681180663845
      // 130: lload 2
      // 131: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: aload 20
      // 138: lload 2
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 19f
      // 13e: ifnull 19d
      // 141: goto 14e
      // 144: ldc2_w 4940993317882560846
      // 147: lload 2
      // 148: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: lload 2
      // 14f: lconst_0
      // 150: lcmp
      // 151: ifle 190
      // 154: ifeq 176
      // 157: goto 164
      // 15a: ldc2_w 4940993317882560846
      // 15d: lload 2
      // 15e: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: aload 20
      // 166: ifnonnull 339
      // 169: goto 176
      // 16c: ldc2_w 4940993317882560846
      // 16f: lload 2
      // 170: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 22
      // 178: lload 6
      // 17a: bipush 1
      // 17b: anewarray 168
      // 17e: dup_x2
      // 17f: dup_x2
      // 180: pop
      // 181: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 184: bipush 0
      // 185: swap
      // 186: aastore
      // 187: ldc2_w 5029502655266986657
      // 18a: lload 2
      // 18b: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: goto 19d
      // 193: ldc2_w 4940993317882560846
      // 196: lload 2
      // 197: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: aload 20
      // 19f: lload 2
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: iflt 201
      // 1a5: ifnull 1ff
      // 1a8: ifeq 1d8
      // 1ab: goto 1b8
      // 1ae: ldc2_w 4940993317882560846
      // 1b1: lload 2
      // 1b2: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: ldc2_w 4686052567561725265
      // 1bc: lload 2
      // 1bd: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: iload 21
      // 1c4: aconst_null
      // 1c5: aastore
      // 1c6: aload 20
      // 1c8: ifnonnull 339
      // 1cb: goto 1d8
      // 1ce: ldc2_w 4940993317882560846
      // 1d1: lload 2
      // 1d2: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: aload 22
      // 1da: lload 16
      // 1dc: bipush 1
      // 1dd: anewarray 168
      // 1e0: dup_x2
      // 1e1: dup_x2
      // 1e2: pop
      // 1e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e6: bipush 0
      // 1e7: swap
      // 1e8: aastore
      // 1e9: ldc2_w 6439431411499313654
      // 1ec: lload 2
      // 1ed: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: goto 1ff
      // 1f5: ldc2_w 4940993317882560846
      // 1f8: lload 2
      // 1f9: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: athrow
      // 1ff: aload 20
      // 201: lload 2
      // 202: lconst_0
      // 203: lcmp
      // 204: ifle 2f4
      // 207: ifnull 2f2
      // 20a: ifeq 2cb
      // 20d: goto 21a
      // 210: ldc2_w 4940993317882560846
      // 213: lload 2
      // 214: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: lload 2
      // 21b: lconst_0
      // 21c: lcmp
      // 21d: iflt 2ab
      // 220: aload 22
      // 222: lload 18
      // 224: bipush 1
      // 225: anewarray 168
      // 228: dup_x2
      // 229: dup_x2
      // 22a: pop
      // 22b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22e: bipush 0
      // 22f: swap
      // 230: aastore
      // 231: ldc2_w 6602861925647595410
      // 234: lload 2
      // 235: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: bipush 5
      // 23b: if_icmpne 287
      // 23e: goto 24b
      // 241: ldc2_w 4940993317882560846
      // 244: lload 2
      // 245: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: athrow
      // 24b: aload 0
      // 24c: aload 22
      // 24e: lload 10
      // 250: bipush 1
      // 251: anewarray 168
      // 254: dup_x2
      // 255: dup_x2
      // 256: pop
      // 257: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25a: bipush 0
      // 25b: swap
      // 25c: aastore
      // 25d: ldc2_w 6623641582517046290
      // 260: lload 2
      // 261: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: ldc2_w 4990350881781282308
      // 269: lload 2
      // 26a: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: aload 20
      // 271: lload 2
      // 272: lconst_0
      // 273: lcmp
      // 274: iflt 2c8
      // 277: ifnonnull 2b8
      // 27a: goto 287
      // 27d: ldc2_w 4940993317882560846
      // 280: lload 2
      // 281: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: athrow
      // 287: aload 0
      // 288: aload 22
      // 28a: lload 10
      // 28c: bipush 1
      // 28d: anewarray 168
      // 290: dup_x2
      // 291: dup_x2
      // 292: pop
      // 293: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 296: bipush 0
      // 297: swap
      // 298: aastore
      // 299: ldc2_w 6623641582517046290
      // 29c: lload 2
      // 29d: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: ldc2_w 6406558831535926390
      // 2a5: lload 2
      // 2a6: invokedynamic r (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: goto 2b8
      // 2ae: ldc2_w 4940993317882560846
      // 2b1: lload 2
      // 2b2: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: aload 0
      // 2b9: ldc2_w 4686052567561725265
      // 2bc: lload 2
      // 2bd: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: iload 21
      // 2c4: aconst_null
      // 2c5: aastore
      // 2c6: aload 20
      // 2c8: ifnonnull 339
      // 2cb: aload 22
      // 2cd: lload 4
      // 2cf: bipush 1
      // 2d0: anewarray 168
      // 2d3: dup_x2
      // 2d4: dup_x2
      // 2d5: pop
      // 2d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d9: bipush 0
      // 2da: swap
      // 2db: aastore
      // 2dc: ldc2_w 5042179076672889728
      // 2df: lload 2
      // 2e0: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: goto 2f2
      // 2e8: ldc2_w 4940993317882560846
      // 2eb: lload 2
      // 2ec: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: athrow
      // 2f2: aload 20
      // 2f4: ifnull 337
      // 2f7: ifeq 339
      // 2fa: goto 307
      // 2fd: ldc2_w 4940993317882560846
      // 300: lload 2
      // 301: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 306: athrow
      // 307: aload 22
      // 309: bipush 1
      // 30a: lload 14
      // 30c: bipush 2
      // 30d: anewarray 168
      // 310: dup_x2
      // 311: dup_x2
      // 312: pop
      // 313: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 316: bipush 1
      // 317: swap
      // 318: aastore
      // 319: dup_x1
      // 31a: swap
      // 31b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 31e: bipush 0
      // 31f: swap
      // 320: aastore
      // 321: ldc2_w 6354287840330541913
      // 324: lload 2
      // 325: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: goto 337
      // 32d: ldc2_w 4940993317882560846
      // 330: lload 2
      // 331: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 336: athrow
      // 337: istore 23
      // 339: iinc 21 1
      // 33c: aload 20
      // 33e: ifnonnull 0c6
      // 341: bipush 0
      // 342: istore 21
      // 344: aload 0
      // 345: bipush 0
      // 346: aload 0
      // 347: ldc2_w 4686052567561725265
      // 34a: lload 2
      // 34b: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: lload 12
      // 352: dup2_x1
      // 353: pop2
      // 354: bipush 3
      // 355: anewarray 168
      // 358: dup_x1
      // 359: swap
      // 35a: bipush 2
      // 35b: swap
      // 35c: aastore
      // 35d: dup_x2
      // 35e: dup_x2
      // 35f: pop
      // 360: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 363: bipush 1
      // 364: swap
      // 365: aastore
      // 366: dup_x1
      // 367: swap
      // 368: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 36b: bipush 0
      // 36c: swap
      // 36d: aastore
      // 36e: ldc2_w 6857979698027747920
      // 371: lload 2
      // 372: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: lload 2
      // 378: lconst_0
      // 379: lcmp
      // 37a: iflt 381
      // 37d: ifeq 39a
      // 380: bipush 1
      // 381: aload 20
      // 383: ifnull 3a2
      // 386: goto 393
      // 389: ldc2_w 4940993317882560846
      // 38c: lload 2
      // 38d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: athrow
      // 393: istore 21
      // 395: aload 20
      // 397: ifnonnull 344
      // 39a: lload 2
      // 39b: lconst_0
      // 39c: lcmp
      // 39d: ifle 344
      // 3a0: iload 21
      // 3a2: ireturn
   }

   boolean S(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/lqe.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w -6365078765154238244
      // 1f: lload 3
      // 20: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 5
      // 27: iload 2
      // 28: aload 5
      // 2a: ifnull 88
      // 2d: sipush 8342
      // 30: ldc2_w 3166751675436041136
      // 33: lload 3
      // 34: lxor
      // 35: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmpeq 7a
      // 3d: goto 4a
      // 40: ldc2_w -6915048333610129961
      // 43: lload 3
      // 44: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: iload 2
      // 4b: aload 5
      // 4d: ifnull 88
      // 50: goto 5d
      // 53: ldc2_w -6915048333610129961
      // 56: lload 3
      // 57: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: sipush 1730
      // 60: ldc2_w 1285676249529853422
      // 63: lload 3
      // 64: lxor
      // 65: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: if_icmpne 89
      // 6d: goto 7a
      // 70: ldc2_w -6915048333610129961
      // 73: lload 3
      // 74: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: bipush 1
      // 7b: goto 88
      // 7e: ldc2_w -6915048333610129961
      // 81: lload 3
      // 82: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: ireturn
      // 89: aload 0
      // 8a: ldc2_w -4808178844863413450
      // 8d: lload 3
      // 8e: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: iload 2
      // 94: aaload
      // 95: astore 6
      // 97: aload 6
      // 99: ifnull a8
      // 9c: bipush 1
      // 9d: ireturn
      // 9e: ldc2_w -6915048333610129961
      // a1: lload 3
      // a2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: athrow
      // a8: bipush 0
      // a9: ireturn
   }

   void x(Object[] param1) {
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
      // 0c: getstatic com/zelix/lqe.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 69436454331510
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 5417412338003700824
      // 1e: lload 2
      // 1f: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: aconst_null
      // 26: ldc2_w 5490130085387567317
      // 29: lload 2
      // 2a: invokedynamic w (Ljava/lang/Object;Ljava/awt/Dimension;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 0
      // 30: aconst_null
      // 31: ldc2_w 6090021689400980630
      // 34: lload 2
      // 35: invokedynamic w (Ljava/lang/Object;Ljava/awt/Point;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: astore 6
      // 3c: bipush 0
      // 3d: istore 7
      // 3f: iload 7
      // 41: sipush 24534
      // 44: ldc2_w 4306455969966428279
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: if_icmpge 85
      // 51: aload 0
      // 52: ldc2_w 5891231229503647666
      // 55: lload 2
      // 56: invokedynamic u (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: iload 7
      // 5d: aconst_null
      // 5e: aastore
      // 5f: iinc 7 1
      // 62: aload 6
      // 64: lload 2
      // 65: lconst_0
      // 66: lcmp
      // 67: iflt 6f
      // 6a: ifnull 88
      // 6d: aload 6
      // 6f: ifnonnull 3f
      // 72: lload 2
      // 73: lconst_0
      // 74: lcmp
      // 75: ifle 62
      // 78: goto 85
      // 7b: ldc2_w 5516031490038434131
      // 7e: lload 2
      // 7f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: bipush 0
      // 86: istore 7
      // 88: iload 7
      // 8a: sipush 8342
      // 8d: ldc2_w 3166803053561245492
      // 90: lload 2
      // 91: lxor
      // 92: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: if_icmpge f5
      // 9a: aload 0
      // 9b: ldc2_w 5881703751149901676
      // 9e: lload 2
      // 9f: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: iload 7
      // a6: aaload
      // a7: astore 8
      // a9: aload 6
      // ab: lload 2
      // ac: lconst_0
      // ad: lcmp
      // ae: iflt f2
      // b1: ifnull f0
      // b4: aload 8
      // b6: ifnull ed
      // b9: goto c6
      // bc: ldc2_w 5516031490038434131
      // bf: lload 2
      // c0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: athrow
      // c6: aload 8
      // c8: lload 4
      // ca: bipush 1
      // cb: anewarray 168
      // ce: dup_x2
      // cf: dup_x2
      // d0: pop
      // d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d4: bipush 0
      // d5: swap
      // d6: aastore
      // d7: ldc2_w 5746218644412028230
      // da: lload 2
      // db: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: goto ed
      // e3: ldc2_w 5516031490038434131
      // e6: lload 2
      // e7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ec: athrow
      // ed: iinc 7 1
      // f0: aload 6
      // f2: ifnonnull 88
      // f5: lload 2
      // f6: lconst_0
      // f7: lcmp
      // f8: iflt 9a
      // fb: return
   }

   boolean q(Object[] param1) {
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
      // 0c: getstatic com/zelix/lqe.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -8451579488350261821
      // 15: lload 2
      // 16: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: ldc2_w -8044927030466154967
      // 21: lload 2
      // 22: invokedynamic v (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: bipush 0
      // 28: aaload
      // 29: aload 4
      // 2b: ifnull 57
      // 2e: ifnull d0
      // 31: goto 3e
      // 34: ldc2_w -8279982811990144824
      // 37: lload 2
      // 38: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w -8044927030466154967
      // 42: lload 2
      // 43: invokedynamic v (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: bipush 1
      // 49: aaload
      // 4a: goto 57
      // 4d: ldc2_w -8279982811990144824
      // 50: lload 2
      // 51: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: aload 4
      // 59: lload 2
      // 5a: lconst_0
      // 5b: lcmp
      // 5c: ifle 93
      // 5f: ifnull 8b
      // 62: ifnull d0
      // 65: goto 72
      // 68: ldc2_w -8279982811990144824
      // 6b: lload 2
      // 6c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 0
      // 73: ldc2_w -8044927030466154967
      // 76: lload 2
      // 77: invokedynamic v (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: bipush 3
      // 7d: aaload
      // 7e: goto 8b
      // 81: ldc2_w -8279982811990144824
      // 84: lload 2
      // 85: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: lload 2
      // 8c: lconst_0
      // 8d: lcmp
      // 8e: ifle bf
      // 91: aload 4
      // 93: ifnull bf
      // 96: ifnull d0
      // 99: goto a6
      // 9c: ldc2_w -8279982811990144824
      // 9f: lload 2
      // a0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: aload 0
      // a7: ldc2_w -8044927030466154967
      // aa: lload 2
      // ab: invokedynamic v (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: bipush 2
      // b1: aaload
      // b2: goto bf
      // b5: ldc2_w -8279982811990144824
      // b8: lload 2
      // b9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: athrow
      // bf: ifnull d0
      // c2: bipush 1
      // c3: goto d1
      // c6: ldc2_w -8279982811990144824
      // c9: lload 2
      // ca: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf: athrow
      // d0: bipush 0
      // d1: ireturn
   }

   public String c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"p">(this, 4270809943514439380L, var2);
   }

   int u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"q">(this, 8293847996901885831L, var2);
   }

   boolean s(Object[] var1) {
      boolean var4 = (Boolean)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 9393511203225L;
      Object[] var10005 = new Object[]{null, var5, m44.a<"q">(this, 631641862762991112L, var2)};
      var10005[0] = var4;
      return m44.a<"p">(this, var10005, 1032862447141292841L, var2);
   }

   boolean Q(Object[] param1) {
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
      // 04: checkcast java/lang/Boolean
      // 07: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/lqe.a J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 133838366047536
      // 21: lxor
      // 22: lstore 5
      // 24: pop2
      // 25: ldc2_w -3827598956218290793
      // 28: lload 3
      // 29: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: bipush 0
      // 2f: istore 8
      // 31: astore 7
      // 33: iload 8
      // 35: sipush 8342
      // 38: ldc2_w 3166767552522579707
      // 3b: lload 3
      // 3c: lxor
      // 3d: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: if_icmpge d8
      // 45: aload 0
      // 46: ldc2_w -3427482648100219229
      // 49: lload 3
      // 4a: invokedynamic r (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: iload 8
      // 51: aaload
      // 52: astore 9
      // 54: aload 9
      // 56: lload 3
      // 57: lconst_0
      // 58: lcmp
      // 59: ifle 98
      // 5c: aload 7
      // 5e: ifnull 98
      // 61: ifnonnull 89
      // 64: goto 71
      // 67: ldc2_w -3655865455087155044
      // 6a: lload 3
      // 6b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: aload 7
      // 73: lload 3
      // 74: lconst_0
      // 75: lcmp
      // 76: iflt d5
      // 79: ifnonnull d0
      // 7c: goto 89
      // 7f: ldc2_w -3655865455087155044
      // 82: lload 3
      // 83: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 9
      // 8b: goto 98
      // 8e: ldc2_w -3655865455087155044
      // 91: lload 3
      // 92: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: iload 2
      // 99: lload 5
      // 9b: bipush 2
      // 9c: anewarray 168
      // 9f: dup_x2
      // a0: dup_x2
      // a1: pop
      // a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a5: bipush 1
      // a6: swap
      // a7: aastore
      // a8: dup_x1
      // a9: swap
      // aa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // ad: bipush 0
      // ae: swap
      // af: aastore
      // b0: ldc2_w -3315535955902012789
      // b3: lload 3
      // b4: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: aload 7
      // bb: ifnull cf
      // be: ifne d0
      // c1: goto ce
      // c4: ldc2_w -3655865455087155044
      // c7: lload 3
      // c8: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd: athrow
      // ce: bipush 0
      // cf: ireturn
      // d0: iinc 8 1
      // d3: aload 7
      // d5: ifnonnull 33
      // d8: bipush 1
      // d9: ireturn
   }

   int R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this, -9126734072089628142L, var2);
   }

   private void O(Object[] var1) {
      int var2 = (Integer)var1[0];
      ge[] var6 = (ge[])var1[1];
      boolean[] var5 = (boolean[])var1[2];
      boolean var7 = (Boolean)var1[3];
      long var3 = (Long)var1[4];
      var3 = a ^ var3;
      long var8 = var3 ^ 84465232159321L;
      long var10 = var3 ^ 17986351024636L;
      String var12 = m44.a<"h">(9092146308526922075L, var3);
      if (m44.a<"v">(this, 7260526781162560177L, var3)[var2] == null) {
         ge var13 = var6[var2];

         ge var10000;
         label30: {
            try {
               var10000 = var13;
               if (var3 <= 0L || var12 == null) {
                  break label30;
               }

               if (var13 == null) {
                  return;
               }
            } catch (n9 var15) {
               throw m44.a<"h">(var15, 8759404924367486032L, var3);
            }

            var10000 = var13;
         }

         try {
            Object[] var10004 = new Object[]{null, var10};
            var10004[0] = var7;
            if (m44.a<"w">(var10000, var10004, 7291521857264506439L, var3)) {
               m44.a<"v">(this, 7260526781162560177L, var3)[var2] = m44.a<"w">(var13, new Object[]{var8}, 7174331679365515415L, var3);
               var5[0] = true;
            }
         } catch (n9 var14) {
            throw m44.a<"h">(var14, 8759404924367486032L, var3);
         }
      }
   }

   Point J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new Point(m44.a<"r">(this, -5251608294658258579L, var2)[3], m44.a<"r">(this, -5251608294658258579L, var2)[2]);
   }

   private void A(Object[] param1) {
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
      // 00a: lstore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 4
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast [Lcom/zelix/ge;
      // 01d: astore 7
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast [Z
      // 025: astore 2
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/lang/Boolean
      // 02c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02f: istore 3
      // 030: pop
      // 031: getstatic com/zelix/lqe.a J
      // 034: lload 5
      // 036: lxor
      // 037: lstore 5
      // 039: lload 5
      // 03b: dup2
      // 03c: ldc2_w 72218816160446
      // 03f: lxor
      // 040: lstore 8
      // 042: pop2
      // 043: ldc2_w -87037778853176900
      // 046: lload 5
      // 048: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: astore 10
      // 04f: aload 7
      // 051: iload 4
      // 053: aaload
      // 054: ifnonnull 076
      // 057: aload 0
      // 058: ldc2_w -2007022277158430122
      // 05b: lload 5
      // 05d: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: iload 4
      // 064: aaload
      // 065: ifnull 082
      // 068: goto 076
      // 06b: ldc2_w -474948194024702793
      // 06e: lload 5
      // 070: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: return
      // 077: ldc2_w -474948194024702793
      // 07a: lload 5
      // 07c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: sipush 16478
      // 085: ldc2_w 6036283311553624593
      // 088: lload 5
      // 08a: lxor
      // 08b: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: istore 11
      // 092: iload 4
      // 094: lload 5
      // 096: lconst_0
      // 097: lcmp
      // 098: iflt f18
      // 09b: aload 10
      // 09d: ifnull f18
      // 0a0: tableswitch 3702 0 7 59 1019 1979 2335 2691 2958 3468 3225
      // 0d0: ldc2_w -474948194024702793
      // 0d3: lload 5
      // 0d5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 7
      // 0dd: bipush 3
      // 0de: aaload
      // 0df: aload 10
      // 0e1: ifnull 1f1
      // 0e4: goto 0f2
      // 0e7: ldc2_w -474948194024702793
      // 0ea: lload 5
      // 0ec: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: lload 5
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: ifle 1e3
      // 0f9: ifnull 1df
      // 0fc: goto 10a
      // 0ff: ldc2_w -474948194024702793
      // 102: lload 5
      // 104: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: aload 7
      // 10c: bipush 5
      // 10d: aaload
      // 10e: aload 10
      // 110: lload 5
      // 112: lconst_0
      // 113: lcmp
      // 114: iflt 1f3
      // 117: ifnull 1f1
      // 11a: goto 128
      // 11d: ldc2_w -474948194024702793
      // 120: lload 5
      // 122: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: lload 5
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: ifle 1e3
      // 12f: ifnull 1df
      // 132: goto 140
      // 135: ldc2_w -474948194024702793
      // 138: lload 5
      // 13a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 0
      // 141: ldc2_w -2007022277158430122
      // 144: lload 5
      // 146: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: bipush 3
      // 14c: aaload
      // 14d: aload 10
      // 14f: lload 5
      // 151: lconst_0
      // 152: lcmp
      // 153: ifle 195
      // 156: ifnull 193
      // 159: goto 167
      // 15c: ldc2_w -474948194024702793
      // 15f: lload 5
      // 161: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: ifnull f16
      // 16a: goto 178
      // 16d: ldc2_w -474948194024702793
      // 170: lload 5
      // 172: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: aload 0
      // 179: ldc2_w -2007022277158430122
      // 17c: lload 5
      // 17e: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: bipush 5
      // 184: aaload
      // 185: goto 193
      // 188: ldc2_w -474948194024702793
      // 18b: lload 5
      // 18d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: athrow
      // 193: aload 10
      // 195: ifnull 1c4
      // 198: ifnull f16
      // 19b: goto 1a9
      // 19e: ldc2_w -474948194024702793
      // 1a1: lload 5
      // 1a3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: athrow
      // 1a9: aload 0
      // 1aa: ldc2_w -2007022277158430122
      // 1ad: lload 5
      // 1af: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: bipush 5
      // 1b5: aaload
      // 1b6: goto 1c4
      // 1b9: ldc2_w -474948194024702793
      // 1bc: lload 5
      // 1be: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: invokevirtual java/lang/Integer.intValue ()I
      // 1c7: aload 0
      // 1c8: ldc2_w -2007022277158430122
      // 1cb: lload 5
      // 1cd: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: bipush 3
      // 1d3: aaload
      // 1d4: invokevirtual java/lang/Integer.intValue ()I
      // 1d7: isub
      // 1d8: istore 11
      // 1da: aload 10
      // 1dc: ifnonnull f16
      // 1df: aload 7
      // 1e1: bipush 3
      // 1e2: aaload
      // 1e3: goto 1f1
      // 1e6: ldc2_w -474948194024702793
      // 1e9: lload 5
      // 1eb: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: aload 10
      // 1f3: ifnull 324
      // 1f6: ifnull 305
      // 1f9: goto 207
      // 1fc: ldc2_w -474948194024702793
      // 1ff: lload 5
      // 201: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 7
      // 209: sipush 24148
      // 20c: ldc2_w 3908757583603508252
      // 20f: lload 5
      // 211: lxor
      // 212: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: aaload
      // 218: aload 10
      // 21a: lload 5
      // 21c: lconst_0
      // 21d: lcmp
      // 21e: ifle 326
      // 221: ifnull 324
      // 224: goto 232
      // 227: ldc2_w -474948194024702793
      // 22a: lload 5
      // 22c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: lload 5
      // 234: lconst_0
      // 235: lcmp
      // 236: ifle 316
      // 239: ifnull 305
      // 23c: goto 24a
      // 23f: ldc2_w -474948194024702793
      // 242: lload 5
      // 244: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: aload 0
      // 24b: ldc2_w -2007022277158430122
      // 24e: lload 5
      // 250: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 255: bipush 3
      // 256: aaload
      // 257: aload 10
      // 259: lload 5
      // 25b: lconst_0
      // 25c: lcmp
      // 25d: ifle 2ac
      // 260: ifnull 2aa
      // 263: goto 271
      // 266: ldc2_w -474948194024702793
      // 269: lload 5
      // 26b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: athrow
      // 271: ifnull f16
      // 274: goto 282
      // 277: ldc2_w -474948194024702793
      // 27a: lload 5
      // 27c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: athrow
      // 282: aload 0
      // 283: ldc2_w -2007022277158430122
      // 286: lload 5
      // 288: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: sipush 23076
      // 290: ldc2_w 5035818684313051247
      // 293: lload 5
      // 295: lxor
      // 296: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: aaload
      // 29c: goto 2aa
      // 29f: ldc2_w -474948194024702793
      // 2a2: lload 5
      // 2a4: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: athrow
      // 2aa: aload 10
      // 2ac: ifnull 2e8
      // 2af: ifnull f16
      // 2b2: goto 2c0
      // 2b5: ldc2_w -474948194024702793
      // 2b8: lload 5
      // 2ba: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: athrow
      // 2c0: aload 0
      // 2c1: ldc2_w -2007022277158430122
      // 2c4: lload 5
      // 2c6: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cb: sipush 23076
      // 2ce: ldc2_w 5035818684313051247
      // 2d1: lload 5
      // 2d3: lxor
      // 2d4: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: aaload
      // 2da: goto 2e8
      // 2dd: ldc2_w -474948194024702793
      // 2e0: lload 5
      // 2e2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e7: athrow
      // 2e8: invokevirtual java/lang/Integer.intValue ()I
      // 2eb: aload 0
      // 2ec: ldc2_w -2007022277158430122
      // 2ef: lload 5
      // 2f1: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: bipush 3
      // 2f7: aaload
      // 2f8: invokevirtual java/lang/Integer.intValue ()I
      // 2fb: isub
      // 2fc: bipush 2
      // 2fd: imul
      // 2fe: istore 11
      // 300: aload 10
      // 302: ifnonnull f16
      // 305: aload 7
      // 307: sipush 23076
      // 30a: ldc2_w 5035818684313051247
      // 30d: lload 5
      // 30f: lxor
      // 310: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: aaload
      // 316: goto 324
      // 319: ldc2_w -474948194024702793
      // 31c: lload 5
      // 31e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 323: athrow
      // 324: aload 10
      // 326: ifnull 45f
      // 329: ifnull 424
      // 32c: goto 33a
      // 32f: ldc2_w -474948194024702793
      // 332: lload 5
      // 334: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: athrow
      // 33a: aload 7
      // 33c: bipush 5
      // 33d: aaload
      // 33e: aload 10
      // 340: ifnull 45f
      // 343: goto 351
      // 346: ldc2_w -474948194024702793
      // 349: lload 5
      // 34b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: athrow
      // 351: ifnull 424
      // 354: goto 362
      // 357: ldc2_w -474948194024702793
      // 35a: lload 5
      // 35c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: athrow
      // 362: aload 0
      // 363: ldc2_w -2007022277158430122
      // 366: lload 5
      // 368: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: sipush 23076
      // 370: ldc2_w 5035818684313051247
      // 373: lload 5
      // 375: lxor
      // 376: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37b: aaload
      // 37c: aload 10
      // 37e: lload 5
      // 380: lconst_0
      // 381: lcmp
      // 382: ifle 3c4
      // 385: ifnull 3c2
      // 388: goto 396
      // 38b: ldc2_w -474948194024702793
      // 38e: lload 5
      // 390: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 395: athrow
      // 396: ifnull f16
      // 399: goto 3a7
      // 39c: ldc2_w -474948194024702793
      // 39f: lload 5
      // 3a1: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a6: athrow
      // 3a7: aload 0
      // 3a8: ldc2_w -2007022277158430122
      // 3ab: lload 5
      // 3ad: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b2: bipush 5
      // 3b3: aaload
      // 3b4: goto 3c2
      // 3b7: ldc2_w -474948194024702793
      // 3ba: lload 5
      // 3bc: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c1: athrow
      // 3c2: aload 10
      // 3c4: ifnull 3f3
      // 3c7: ifnull f16
      // 3ca: goto 3d8
      // 3cd: ldc2_w -474948194024702793
      // 3d0: lload 5
      // 3d2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d7: athrow
      // 3d8: aload 0
      // 3d9: ldc2_w -2007022277158430122
      // 3dc: lload 5
      // 3de: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: bipush 5
      // 3e4: aaload
      // 3e5: goto 3f3
      // 3e8: ldc2_w -474948194024702793
      // 3eb: lload 5
      // 3ed: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f2: athrow
      // 3f3: invokevirtual java/lang/Integer.intValue ()I
      // 3f6: aload 0
      // 3f7: ldc2_w -2007022277158430122
      // 3fa: lload 5
      // 3fc: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: sipush 23076
      // 404: ldc2_w 5035818684313051247
      // 407: lload 5
      // 409: lxor
      // 40a: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40f: aaload
      // 410: invokevirtual java/lang/Integer.intValue ()I
      // 413: isub
      // 414: bipush 2
      // 415: imul
      // 416: istore 11
      // 418: lload 5
      // 41a: lconst_0
      // 41b: lcmp
      // 41c: iflt 445
      // 41f: aload 10
      // 421: ifnonnull f16
      // 424: aload 0
      // 425: ldc2_w -2104577006822578707
      // 428: lload 5
      // 42a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/awt/Component; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42f: ldc2_w -180290629306066508
      // 432: lload 5
      // 434: invokedynamic p (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 439: ldc2_w -303830965281175986
      // 43c: lload 5
      // 43e: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 443: istore 11
      // 445: aload 0
      // 446: ldc2_w -1998395169707990392
      // 449: lload 5
      // 44b: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 450: sipush 22538
      // 453: ldc2_w 6107758886568534592
      // 456: lload 5
      // 458: lxor
      // 459: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45e: aaload
      // 45f: astore 12
      // 461: lload 5
      // 463: lconst_0
      // 464: lcmp
      // 465: iflt 48f
      // 468: aload 12
      // 46a: ifnull 48f
      // 46d: iload 11
      // 46f: aload 12
      // 471: lload 8
      // 473: bipush 1
      // 474: anewarray 168
      // 477: dup_x2
      // 478: dup_x2
      // 479: pop
      // 47a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 47d: bipush 0
      // 47e: swap
      // 47f: aastore
      // 480: ldc2_w -2056080308307802000
      // 483: lload 5
      // 485: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48a: invokestatic java/lang/Math.max (II)I
      // 48d: istore 11
      // 48f: lload 5
      // 491: lconst_0
      // 492: lcmp
      // 493: ifle 49b
      // 496: aload 10
      // 498: ifnonnull f16
      // 49b: aload 7
      // 49d: bipush 4
      // 49e: aaload
      // 49f: aload 10
      // 4a1: ifnull 5b1
      // 4a4: goto 4b2
      // 4a7: ldc2_w -474948194024702793
      // 4aa: lload 5
      // 4ac: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b1: athrow
      // 4b2: lload 5
      // 4b4: lconst_0
      // 4b5: lcmp
      // 4b6: iflt 5a3
      // 4b9: ifnull 59f
      // 4bc: goto 4ca
      // 4bf: ldc2_w -474948194024702793
      // 4c2: lload 5
      // 4c4: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c9: athrow
      // 4ca: aload 7
      // 4cc: bipush 2
      // 4cd: aaload
      // 4ce: aload 10
      // 4d0: lload 5
      // 4d2: lconst_0
      // 4d3: lcmp
      // 4d4: iflt 5b3
      // 4d7: ifnull 5b1
      // 4da: goto 4e8
      // 4dd: ldc2_w -474948194024702793
      // 4e0: lload 5
      // 4e2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e7: athrow
      // 4e8: lload 5
      // 4ea: lconst_0
      // 4eb: lcmp
      // 4ec: ifle 5a3
      // 4ef: ifnull 59f
      // 4f2: goto 500
      // 4f5: ldc2_w -474948194024702793
      // 4f8: lload 5
      // 4fa: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ff: athrow
      // 500: aload 0
      // 501: ldc2_w -2007022277158430122
      // 504: lload 5
      // 506: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50b: bipush 4
      // 50c: aaload
      // 50d: aload 10
      // 50f: lload 5
      // 511: lconst_0
      // 512: lcmp
      // 513: iflt 555
      // 516: ifnull 553
      // 519: goto 527
      // 51c: ldc2_w -474948194024702793
      // 51f: lload 5
      // 521: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 526: athrow
      // 527: ifnull f16
      // 52a: goto 538
      // 52d: ldc2_w -474948194024702793
      // 530: lload 5
      // 532: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 537: athrow
      // 538: aload 0
      // 539: ldc2_w -2007022277158430122
      // 53c: lload 5
      // 53e: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 543: bipush 2
      // 544: aaload
      // 545: goto 553
      // 548: ldc2_w -474948194024702793
      // 54b: lload 5
      // 54d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 552: athrow
      // 553: aload 10
      // 555: ifnull 584
      // 558: ifnull f16
      // 55b: goto 569
      // 55e: ldc2_w -474948194024702793
      // 561: lload 5
      // 563: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 568: athrow
      // 569: aload 0
      // 56a: ldc2_w -2007022277158430122
      // 56d: lload 5
      // 56f: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 574: bipush 4
      // 575: aaload
      // 576: goto 584
      // 579: ldc2_w -474948194024702793
      // 57c: lload 5
      // 57e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 583: athrow
      // 584: invokevirtual java/lang/Integer.intValue ()I
      // 587: aload 0
      // 588: ldc2_w -2007022277158430122
      // 58b: lload 5
      // 58d: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 592: bipush 2
      // 593: aaload
      // 594: invokevirtual java/lang/Integer.intValue ()I
      // 597: isub
      // 598: istore 11
      // 59a: aload 10
      // 59c: ifnonnull f16
      // 59f: aload 7
      // 5a1: bipush 2
      // 5a2: aaload
      // 5a3: goto 5b1
      // 5a6: ldc2_w -474948194024702793
      // 5a9: lload 5
      // 5ab: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b0: athrow
      // 5b1: aload 10
      // 5b3: ifnull 6e4
      // 5b6: ifnull 6c5
      // 5b9: goto 5c7
      // 5bc: ldc2_w -474948194024702793
      // 5bf: lload 5
      // 5c1: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c6: athrow
      // 5c7: aload 7
      // 5c9: sipush 28546
      // 5cc: ldc2_w 6292255913730577868
      // 5cf: lload 5
      // 5d1: lxor
      // 5d2: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d7: aaload
      // 5d8: aload 10
      // 5da: lload 5
      // 5dc: lconst_0
      // 5dd: lcmp
      // 5de: iflt 6e6
      // 5e1: ifnull 6e4
      // 5e4: goto 5f2
      // 5e7: ldc2_w -474948194024702793
      // 5ea: lload 5
      // 5ec: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f1: athrow
      // 5f2: lload 5
      // 5f4: lconst_0
      // 5f5: lcmp
      // 5f6: iflt 6d6
      // 5f9: ifnull 6c5
      // 5fc: goto 60a
      // 5ff: ldc2_w -474948194024702793
      // 602: lload 5
      // 604: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 609: athrow
      // 60a: aload 0
      // 60b: ldc2_w -2007022277158430122
      // 60e: lload 5
      // 610: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 615: sipush 12044
      // 618: ldc2_w 7219456162906789189
      // 61b: lload 5
      // 61d: lxor
      // 61e: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 623: aaload
      // 624: aload 10
      // 626: lload 5
      // 628: lconst_0
      // 629: lcmp
      // 62a: iflt 66c
      // 62d: ifnull 66a
      // 630: goto 63e
      // 633: ldc2_w -474948194024702793
      // 636: lload 5
      // 638: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63d: athrow
      // 63e: ifnull f16
      // 641: goto 64f
      // 644: ldc2_w -474948194024702793
      // 647: lload 5
      // 649: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64e: athrow
      // 64f: aload 0
      // 650: ldc2_w -2007022277158430122
      // 653: lload 5
      // 655: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65a: bipush 2
      // 65b: aaload
      // 65c: goto 66a
      // 65f: ldc2_w -474948194024702793
      // 662: lload 5
      // 664: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 669: athrow
      // 66a: aload 10
      // 66c: ifnull 6a8
      // 66f: ifnull f16
      // 672: goto 680
      // 675: ldc2_w -474948194024702793
      // 678: lload 5
      // 67a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67f: athrow
      // 680: aload 0
      // 681: ldc2_w -2007022277158430122
      // 684: lload 5
      // 686: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68b: sipush 12044
      // 68e: ldc2_w 7219456162906789189
      // 691: lload 5
      // 693: lxor
      // 694: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 699: aaload
      // 69a: goto 6a8
      // 69d: ldc2_w -474948194024702793
      // 6a0: lload 5
      // 6a2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a7: athrow
      // 6a8: invokevirtual java/lang/Integer.intValue ()I
      // 6ab: aload 0
      // 6ac: ldc2_w -2007022277158430122
      // 6af: lload 5
      // 6b1: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b6: bipush 2
      // 6b7: aaload
      // 6b8: invokevirtual java/lang/Integer.intValue ()I
      // 6bb: isub
      // 6bc: bipush 2
      // 6bd: imul
      // 6be: istore 11
      // 6c0: aload 10
      // 6c2: ifnonnull f16
      // 6c5: aload 7
      // 6c7: sipush 12044
      // 6ca: ldc2_w 7219456162906789189
      // 6cd: lload 5
      // 6cf: lxor
      // 6d0: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d5: aaload
      // 6d6: goto 6e4
      // 6d9: ldc2_w -474948194024702793
      // 6dc: lload 5
      // 6de: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e3: athrow
      // 6e4: aload 10
      // 6e6: ifnull 81f
      // 6e9: ifnull 7e4
      // 6ec: goto 6fa
      // 6ef: ldc2_w -474948194024702793
      // 6f2: lload 5
      // 6f4: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f9: athrow
      // 6fa: aload 7
      // 6fc: bipush 4
      // 6fd: aaload
      // 6fe: aload 10
      // 700: ifnull 81f
      // 703: goto 711
      // 706: ldc2_w -474948194024702793
      // 709: lload 5
      // 70b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 710: athrow
      // 711: ifnull 7e4
      // 714: goto 722
      // 717: ldc2_w -474948194024702793
      // 71a: lload 5
      // 71c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 721: athrow
      // 722: aload 0
      // 723: ldc2_w -2007022277158430122
      // 726: lload 5
      // 728: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72d: sipush 12044
      // 730: ldc2_w 7219456162906789189
      // 733: lload 5
      // 735: lxor
      // 736: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73b: aaload
      // 73c: aload 10
      // 73e: lload 5
      // 740: lconst_0
      // 741: lcmp
      // 742: iflt 784
      // 745: ifnull 782
      // 748: goto 756
      // 74b: ldc2_w -474948194024702793
      // 74e: lload 5
      // 750: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 755: athrow
      // 756: ifnull f16
      // 759: goto 767
      // 75c: ldc2_w -474948194024702793
      // 75f: lload 5
      // 761: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 766: athrow
      // 767: aload 0
      // 768: ldc2_w -2007022277158430122
      // 76b: lload 5
      // 76d: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 772: bipush 4
      // 773: aaload
      // 774: goto 782
      // 777: ldc2_w -474948194024702793
      // 77a: lload 5
      // 77c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 781: athrow
      // 782: aload 10
      // 784: ifnull 7b3
      // 787: ifnull f16
      // 78a: goto 798
      // 78d: ldc2_w -474948194024702793
      // 790: lload 5
      // 792: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 797: athrow
      // 798: aload 0
      // 799: ldc2_w -2007022277158430122
      // 79c: lload 5
      // 79e: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a3: bipush 4
      // 7a4: aaload
      // 7a5: goto 7b3
      // 7a8: ldc2_w -474948194024702793
      // 7ab: lload 5
      // 7ad: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b2: athrow
      // 7b3: invokevirtual java/lang/Integer.intValue ()I
      // 7b6: aload 0
      // 7b7: ldc2_w -2007022277158430122
      // 7ba: lload 5
      // 7bc: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c1: sipush 12044
      // 7c4: ldc2_w 7219456162906789189
      // 7c7: lload 5
      // 7c9: lxor
      // 7ca: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7cf: aaload
      // 7d0: invokevirtual java/lang/Integer.intValue ()I
      // 7d3: isub
      // 7d4: bipush 2
      // 7d5: imul
      // 7d6: istore 11
      // 7d8: lload 5
      // 7da: lconst_0
      // 7db: lcmp
      // 7dc: ifle 805
      // 7df: aload 10
      // 7e1: ifnonnull f16
      // 7e4: aload 0
      // 7e5: ldc2_w -2104577006822578707
      // 7e8: lload 5
      // 7ea: invokedynamic q (Ljava/lang/Object;JJ)Ljava/awt/Component; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ef: ldc2_w -180290629306066508
      // 7f2: lload 5
      // 7f4: invokedynamic p (Ljava/lang/Object;JJ)Ljava/awt/Dimension; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f9: ldc2_w -1842702817714678369
      // 7fc: lload 5
      // 7fe: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 803: istore 11
      // 805: aload 0
      // 806: ldc2_w -1998395169707990392
      // 809: lload 5
      // 80b: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 810: sipush 29376
      // 813: ldc2_w 6302969239381837953
      // 816: lload 5
      // 818: lxor
      // 819: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81e: aaload
      // 81f: astore 12
      // 821: lload 5
      // 823: lconst_0
      // 824: lcmp
      // 825: ifle 84f
      // 828: aload 12
      // 82a: ifnull 84f
      // 82d: iload 11
      // 82f: aload 12
      // 831: lload 8
      // 833: bipush 1
      // 834: anewarray 168
      // 837: dup_x2
      // 838: dup_x2
      // 839: pop
      // 83a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83d: bipush 0
      // 83e: swap
      // 83f: aastore
      // 840: ldc2_w -2056080308307802000
      // 843: lload 5
      // 845: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84a: invokestatic java/lang/Math.max (II)I
      // 84d: istore 11
      // 84f: lload 5
      // 851: lconst_0
      // 852: lcmp
      // 853: ifle 85b
      // 856: aload 10
      // 858: ifnonnull f16
      // 85b: aload 7
      // 85d: sipush 12044
      // 860: ldc2_w 7219456162906789189
      // 863: lload 5
      // 865: lxor
      // 866: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86b: aaload
      // 86c: aload 10
      // 86e: ifnull 8a2
      // 871: goto 87f
      // 874: ldc2_w -474948194024702793
      // 877: lload 5
      // 879: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87e: athrow
      // 87f: ifnonnull 8b4
      // 882: goto 890
      // 885: ldc2_w -474948194024702793
      // 888: lload 5
      // 88a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88f: athrow
      // 890: aload 7
      // 892: bipush 4
      // 893: aaload
      // 894: goto 8a2
      // 897: ldc2_w -474948194024702793
      // 89a: lload 5
      // 89c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a1: athrow
      // 8a2: ifnonnull 8b4
      // 8a5: bipush 0
      // 8a6: istore 11
      // 8a8: lload 5
      // 8aa: lconst_0
      // 8ab: lcmp
      // 8ac: iflt 8b4
      // 8af: aload 10
      // 8b1: ifnonnull f16
      // 8b4: aload 0
      // 8b5: ldc2_w -2007022277158430122
      // 8b8: lload 5
      // 8ba: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8bf: bipush 1
      // 8c0: aaload
      // 8c1: aload 10
      // 8c3: ifnull 8f3
      // 8c6: goto 8d4
      // 8c9: ldc2_w -474948194024702793
      // 8cc: lload 5
      // 8ce: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d3: athrow
      // 8d4: ifnonnull 8e6
      // 8d7: goto 8e5
      // 8da: ldc2_w -474948194024702793
      // 8dd: lload 5
      // 8df: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e4: athrow
      // 8e5: return
      // 8e6: aload 0
      // 8e7: ldc2_w -2007022277158430122
      // 8ea: lload 5
      // 8ec: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f1: bipush 1
      // 8f2: aaload
      // 8f3: invokevirtual java/lang/Integer.intValue ()I
      // 8f6: istore 12
      // 8f8: aload 0
      // 8f9: ldc2_w -2007022277158430122
      // 8fc: lload 5
      // 8fe: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 903: bipush 4
      // 904: aaload
      // 905: aload 10
      // 907: lload 5
      // 909: lconst_0
      // 90a: lcmp
      // 90b: iflt 96d
      // 90e: ifnull 96b
      // 911: ifnull 943
      // 914: goto 922
      // 917: ldc2_w -474948194024702793
      // 91a: lload 5
      // 91c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 921: athrow
      // 922: aload 0
      // 923: ldc2_w -2007022277158430122
      // 926: lload 5
      // 928: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92d: bipush 4
      // 92e: aaload
      // 92f: invokevirtual java/lang/Integer.intValue ()I
      // 932: iload 12
      // 934: isub
      // 935: istore 11
      // 937: aload 10
      // 939: lload 5
      // 93b: lconst_0
      // 93c: lcmp
      // 93d: ifle 9bc
      // 940: ifnonnull 9b3
      // 943: aload 0
      // 944: ldc2_w -2007022277158430122
      // 947: lload 5
      // 949: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94e: sipush 12044
      // 951: ldc2_w 7219456162906789189
      // 954: lload 5
      // 956: lxor
      // 957: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95c: aaload
      // 95d: goto 96b
      // 960: ldc2_w -474948194024702793
      // 963: lload 5
      // 965: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96a: athrow
      // 96b: aload 10
      // 96d: ifnull 9a9
      // 970: ifnull 9b3
      // 973: goto 981
      // 976: ldc2_w -474948194024702793
      // 979: lload 5
      // 97b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 980: athrow
      // 981: aload 0
      // 982: ldc2_w -2007022277158430122
      // 985: lload 5
      // 987: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98c: sipush 12044
      // 98f: ldc2_w 7219456162906789189
      // 992: lload 5
      // 994: lxor
      // 995: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99a: aaload
      // 99b: goto 9a9
      // 99e: ldc2_w -474948194024702793
      // 9a1: lload 5
      // 9a3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a8: athrow
      // 9a9: invokevirtual java/lang/Integer.intValue ()I
      // 9ac: iload 12
      // 9ae: bipush 2
      // 9af: idiv
      // 9b0: isub
      // 9b1: istore 11
      // 9b3: lload 5
      // 9b5: lconst_0
      // 9b6: lcmp
      // 9b7: iflt 9bf
      // 9ba: aload 10
      // 9bc: ifnonnull f16
      // 9bf: aload 7
      // 9c1: sipush 23076
      // 9c4: ldc2_w 5035818684313051247
      // 9c7: lload 5
      // 9c9: lxor
      // 9ca: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9cf: aaload
      // 9d0: aload 10
      // 9d2: ifnull a06
      // 9d5: goto 9e3
      // 9d8: ldc2_w -474948194024702793
      // 9db: lload 5
      // 9dd: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e2: athrow
      // 9e3: ifnonnull a18
      // 9e6: goto 9f4
      // 9e9: ldc2_w -474948194024702793
      // 9ec: lload 5
      // 9ee: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f3: athrow
      // 9f4: aload 7
      // 9f6: bipush 5
      // 9f7: aaload
      // 9f8: goto a06
      // 9fb: ldc2_w -474948194024702793
      // 9fe: lload 5
      // a00: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a05: athrow
      // a06: ifnonnull a18
      // a09: bipush 0
      // a0a: istore 11
      // a0c: lload 5
      // a0e: lconst_0
      // a0f: lcmp
      // a10: iflt a18
      // a13: aload 10
      // a15: ifnonnull f16
      // a18: aload 0
      // a19: ldc2_w -2007022277158430122
      // a1c: lload 5
      // a1e: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a23: bipush 0
      // a24: aaload
      // a25: aload 10
      // a27: ifnull a57
      // a2a: goto a38
      // a2d: ldc2_w -474948194024702793
      // a30: lload 5
      // a32: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a37: athrow
      // a38: ifnonnull a4a
      // a3b: goto a49
      // a3e: ldc2_w -474948194024702793
      // a41: lload 5
      // a43: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a48: athrow
      // a49: return
      // a4a: aload 0
      // a4b: ldc2_w -2007022277158430122
      // a4e: lload 5
      // a50: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a55: bipush 0
      // a56: aaload
      // a57: invokevirtual java/lang/Integer.intValue ()I
      // a5a: istore 12
      // a5c: aload 0
      // a5d: ldc2_w -2007022277158430122
      // a60: lload 5
      // a62: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a67: bipush 5
      // a68: aaload
      // a69: aload 10
      // a6b: lload 5
      // a6d: lconst_0
      // a6e: lcmp
      // a6f: iflt ad1
      // a72: ifnull acf
      // a75: ifnull aa7
      // a78: goto a86
      // a7b: ldc2_w -474948194024702793
      // a7e: lload 5
      // a80: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a85: athrow
      // a86: aload 0
      // a87: ldc2_w -2007022277158430122
      // a8a: lload 5
      // a8c: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a91: bipush 5
      // a92: aaload
      // a93: invokevirtual java/lang/Integer.intValue ()I
      // a96: iload 12
      // a98: isub
      // a99: istore 11
      // a9b: aload 10
      // a9d: lload 5
      // a9f: lconst_0
      // aa0: lcmp
      // aa1: ifle b20
      // aa4: ifnonnull b17
      // aa7: aload 0
      // aa8: ldc2_w -2007022277158430122
      // aab: lload 5
      // aad: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab2: sipush 23076
      // ab5: ldc2_w 5035818684313051247
      // ab8: lload 5
      // aba: lxor
      // abb: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac0: aaload
      // ac1: goto acf
      // ac4: ldc2_w -474948194024702793
      // ac7: lload 5
      // ac9: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ace: athrow
      // acf: aload 10
      // ad1: ifnull b0d
      // ad4: ifnull b17
      // ad7: goto ae5
      // ada: ldc2_w -474948194024702793
      // add: lload 5
      // adf: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae4: athrow
      // ae5: aload 0
      // ae6: ldc2_w -2007022277158430122
      // ae9: lload 5
      // aeb: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af0: sipush 23076
      // af3: ldc2_w 5035818684313051247
      // af6: lload 5
      // af8: lxor
      // af9: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // afe: aaload
      // aff: goto b0d
      // b02: ldc2_w -474948194024702793
      // b05: lload 5
      // b07: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0c: athrow
      // b0d: invokevirtual java/lang/Integer.intValue ()I
      // b10: iload 12
      // b12: bipush 2
      // b13: idiv
      // b14: isub
      // b15: istore 11
      // b17: lload 5
      // b19: lconst_0
      // b1a: lcmp
      // b1b: iflt b23
      // b1e: aload 10
      // b20: ifnonnull f16
      // b23: aload 0
      // b24: ldc2_w -2007022277158430122
      // b27: lload 5
      // b29: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2e: bipush 1
      // b2f: aaload
      // b30: aload 10
      // b32: ifnull b62
      // b35: goto b43
      // b38: ldc2_w -474948194024702793
      // b3b: lload 5
      // b3d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b42: athrow
      // b43: ifnonnull b55
      // b46: goto b54
      // b49: ldc2_w -474948194024702793
      // b4c: lload 5
      // b4e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b53: athrow
      // b54: return
      // b55: aload 0
      // b56: ldc2_w -2007022277158430122
      // b59: lload 5
      // b5b: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b60: bipush 1
      // b61: aaload
      // b62: invokevirtual java/lang/Integer.intValue ()I
      // b65: istore 12
      // b67: aload 0
      // b68: ldc2_w -2007022277158430122
      // b6b: lload 5
      // b6d: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b72: bipush 2
      // b73: aaload
      // b74: aload 10
      // b76: lload 5
      // b78: lconst_0
      // b79: lcmp
      // b7a: iflt bdc
      // b7d: ifnull bda
      // b80: ifnull bb2
      // b83: goto b91
      // b86: ldc2_w -474948194024702793
      // b89: lload 5
      // b8b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b90: athrow
      // b91: aload 0
      // b92: ldc2_w -2007022277158430122
      // b95: lload 5
      // b97: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9c: bipush 2
      // b9d: aaload
      // b9e: lload 5
      // ba0: lconst_0
      // ba1: lcmp
      // ba2: ifle bcc
      // ba5: invokevirtual java/lang/Integer.intValue ()I
      // ba8: iload 12
      // baa: iadd
      // bab: istore 11
      // bad: aload 10
      // baf: ifnonnull f16
      // bb2: aload 0
      // bb3: ldc2_w -2007022277158430122
      // bb6: lload 5
      // bb8: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bbd: sipush 12044
      // bc0: ldc2_w 7219456162906789189
      // bc3: lload 5
      // bc5: lxor
      // bc6: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bcb: aaload
      // bcc: goto bda
      // bcf: ldc2_w -474948194024702793
      // bd2: lload 5
      // bd4: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd9: athrow
      // bda: aload 10
      // bdc: ifnull c18
      // bdf: ifnull f16
      // be2: goto bf0
      // be5: ldc2_w -474948194024702793
      // be8: lload 5
      // bea: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bef: athrow
      // bf0: aload 0
      // bf1: ldc2_w -2007022277158430122
      // bf4: lload 5
      // bf6: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bfb: sipush 12044
      // bfe: ldc2_w 7219456162906789189
      // c01: lload 5
      // c03: lxor
      // c04: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c09: aaload
      // c0a: goto c18
      // c0d: ldc2_w -474948194024702793
      // c10: lload 5
      // c12: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c17: athrow
      // c18: invokevirtual java/lang/Integer.intValue ()I
      // c1b: iload 12
      // c1d: bipush 2
      // c1e: idiv
      // c1f: iadd
      // c20: istore 11
      // c22: lload 5
      // c24: lconst_0
      // c25: lcmp
      // c26: iflt c2e
      // c29: aload 10
      // c2b: ifnonnull f16
      // c2e: aload 0
      // c2f: ldc2_w -2007022277158430122
      // c32: lload 5
      // c34: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c39: bipush 0
      // c3a: aaload
      // c3b: aload 10
      // c3d: ifnull c6d
      // c40: goto c4e
      // c43: ldc2_w -474948194024702793
      // c46: lload 5
      // c48: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4d: athrow
      // c4e: ifnonnull c60
      // c51: goto c5f
      // c54: ldc2_w -474948194024702793
      // c57: lload 5
      // c59: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5e: athrow
      // c5f: return
      // c60: aload 0
      // c61: ldc2_w -2007022277158430122
      // c64: lload 5
      // c66: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6b: bipush 0
      // c6c: aaload
      // c6d: invokevirtual java/lang/Integer.intValue ()I
      // c70: istore 13
      // c72: aload 0
      // c73: ldc2_w -2007022277158430122
      // c76: lload 5
      // c78: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7d: bipush 3
      // c7e: aaload
      // c7f: aload 10
      // c81: lload 5
      // c83: lconst_0
      // c84: lcmp
      // c85: ifle ce7
      // c88: ifnull ce5
      // c8b: ifnull cbd
      // c8e: goto c9c
      // c91: ldc2_w -474948194024702793
      // c94: lload 5
      // c96: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9b: athrow
      // c9c: aload 0
      // c9d: ldc2_w -2007022277158430122
      // ca0: lload 5
      // ca2: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca7: bipush 3
      // ca8: aaload
      // ca9: lload 5
      // cab: lconst_0
      // cac: lcmp
      // cad: iflt cd7
      // cb0: invokevirtual java/lang/Integer.intValue ()I
      // cb3: iload 13
      // cb5: iadd
      // cb6: istore 11
      // cb8: aload 10
      // cba: ifnonnull f16
      // cbd: aload 0
      // cbe: ldc2_w -2007022277158430122
      // cc1: lload 5
      // cc3: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc8: sipush 23076
      // ccb: ldc2_w 5035818684313051247
      // cce: lload 5
      // cd0: lxor
      // cd1: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd6: aaload
      // cd7: goto ce5
      // cda: ldc2_w -474948194024702793
      // cdd: lload 5
      // cdf: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce4: athrow
      // ce5: aload 10
      // ce7: ifnull d23
      // cea: ifnull f16
      // ced: goto cfb
      // cf0: ldc2_w -474948194024702793
      // cf3: lload 5
      // cf5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cfa: athrow
      // cfb: aload 0
      // cfc: ldc2_w -2007022277158430122
      // cff: lload 5
      // d01: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d06: sipush 23076
      // d09: ldc2_w 5035818684313051247
      // d0c: lload 5
      // d0e: lxor
      // d0f: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d14: aaload
      // d15: goto d23
      // d18: ldc2_w -474948194024702793
      // d1b: lload 5
      // d1d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d22: athrow
      // d23: invokevirtual java/lang/Integer.intValue ()I
      // d26: iload 13
      // d28: bipush 2
      // d29: idiv
      // d2a: iadd
      // d2b: istore 11
      // d2d: lload 5
      // d2f: lconst_0
      // d30: lcmp
      // d31: ifle d39
      // d34: aload 10
      // d36: ifnonnull f16
      // d39: aload 0
      // d3a: ldc2_w -2007022277158430122
      // d3d: lload 5
      // d3f: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d44: bipush 1
      // d45: aaload
      // d46: aload 10
      // d48: ifnull d78
      // d4b: goto d59
      // d4e: ldc2_w -474948194024702793
      // d51: lload 5
      // d53: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d58: athrow
      // d59: ifnonnull d6b
      // d5c: goto d6a
      // d5f: ldc2_w -474948194024702793
      // d62: lload 5
      // d64: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d69: athrow
      // d6a: return
      // d6b: aload 0
      // d6c: ldc2_w -2007022277158430122
      // d6f: lload 5
      // d71: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d76: bipush 1
      // d77: aaload
      // d78: invokevirtual java/lang/Integer.intValue ()I
      // d7b: istore 14
      // d7d: aload 0
      // d7e: ldc2_w -2007022277158430122
      // d81: lload 5
      // d83: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d88: bipush 2
      // d89: aaload
      // d8a: aload 10
      // d8c: lload 5
      // d8e: lconst_0
      // d8f: lcmp
      // d90: ifle de7
      // d93: ifnull de5
      // d96: ifnull dca
      // d99: goto da7
      // d9c: ldc2_w -474948194024702793
      // d9f: lload 5
      // da1: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da6: athrow
      // da7: aload 0
      // da8: ldc2_w -2007022277158430122
      // dab: lload 5
      // dad: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db2: bipush 2
      // db3: aaload
      // db4: lload 5
      // db6: lconst_0
      // db7: lcmp
      // db8: ifle dd7
      // dbb: invokevirtual java/lang/Integer.intValue ()I
      // dbe: iload 14
      // dc0: bipush 2
      // dc1: idiv
      // dc2: iadd
      // dc3: istore 11
      // dc5: aload 10
      // dc7: ifnonnull f16
      // dca: aload 0
      // dcb: ldc2_w -2007022277158430122
      // dce: lload 5
      // dd0: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd5: bipush 4
      // dd6: aaload
      // dd7: goto de5
      // dda: ldc2_w -474948194024702793
      // ddd: lload 5
      // ddf: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de4: athrow
      // de5: aload 10
      // de7: ifnull e16
      // dea: ifnull f16
      // ded: goto dfb
      // df0: ldc2_w -474948194024702793
      // df3: lload 5
      // df5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dfa: athrow
      // dfb: aload 0
      // dfc: ldc2_w -2007022277158430122
      // dff: lload 5
      // e01: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e06: bipush 4
      // e07: aaload
      // e08: goto e16
      // e0b: ldc2_w -474948194024702793
      // e0e: lload 5
      // e10: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e15: athrow
      // e16: invokevirtual java/lang/Integer.intValue ()I
      // e19: iload 14
      // e1b: bipush 2
      // e1c: idiv
      // e1d: isub
      // e1e: istore 11
      // e20: lload 5
      // e22: lconst_0
      // e23: lcmp
      // e24: iflt e2c
      // e27: aload 10
      // e29: ifnonnull f16
      // e2c: aload 0
      // e2d: ldc2_w -2007022277158430122
      // e30: lload 5
      // e32: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e37: bipush 0
      // e38: aaload
      // e39: aload 10
      // e3b: ifnull e6b
      // e3e: goto e4c
      // e41: ldc2_w -474948194024702793
      // e44: lload 5
      // e46: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e4b: athrow
      // e4c: ifnonnull e5e
      // e4f: goto e5d
      // e52: ldc2_w -474948194024702793
      // e55: lload 5
      // e57: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e5c: athrow
      // e5d: return
      // e5e: aload 0
      // e5f: ldc2_w -2007022277158430122
      // e62: lload 5
      // e64: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e69: bipush 0
      // e6a: aaload
      // e6b: invokevirtual java/lang/Integer.intValue ()I
      // e6e: istore 15
      // e70: aload 0
      // e71: ldc2_w -2007022277158430122
      // e74: lload 5
      // e76: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e7b: bipush 3
      // e7c: aaload
      // e7d: aload 10
      // e7f: lload 5
      // e81: lconst_0
      // e82: lcmp
      // e83: iflt eda
      // e86: ifnull ed8
      // e89: ifnull ebd
      // e8c: goto e9a
      // e8f: ldc2_w -474948194024702793
      // e92: lload 5
      // e94: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e99: athrow
      // e9a: aload 0
      // e9b: ldc2_w -2007022277158430122
      // e9e: lload 5
      // ea0: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ea5: bipush 3
      // ea6: aaload
      // ea7: lload 5
      // ea9: lconst_0
      // eaa: lcmp
      // eab: iflt eca
      // eae: invokevirtual java/lang/Integer.intValue ()I
      // eb1: iload 15
      // eb3: bipush 2
      // eb4: idiv
      // eb5: iadd
      // eb6: istore 11
      // eb8: aload 10
      // eba: ifnonnull f16
      // ebd: aload 0
      // ebe: ldc2_w -2007022277158430122
      // ec1: lload 5
      // ec3: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ec8: bipush 5
      // ec9: aaload
      // eca: goto ed8
      // ecd: ldc2_w -474948194024702793
      // ed0: lload 5
      // ed2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed7: athrow
      // ed8: aload 10
      // eda: ifnull f09
      // edd: ifnull f16
      // ee0: goto eee
      // ee3: ldc2_w -474948194024702793
      // ee6: lload 5
      // ee8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // eed: athrow
      // eee: aload 0
      // eef: ldc2_w -2007022277158430122
      // ef2: lload 5
      // ef4: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ef9: bipush 5
      // efa: aaload
      // efb: goto f09
      // efe: ldc2_w -474948194024702793
      // f01: lload 5
      // f03: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f08: athrow
      // f09: invokevirtual java/lang/Integer.intValue ()I
      // f0c: iload 15
      // f0e: bipush 2
      // f0f: idiv
      // f10: isub
      // f11: istore 11
      // f13: goto f16
      // f16: iload 11
      // f18: sipush 14471
      // f1b: ldc2_w 6117204931869852355
      // f1e: lload 5
      // f20: lxor
      // f21: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f26: if_icmpeq f4e
      // f29: aload 2
      // f2a: bipush 0
      // f2b: bipush 1
      // f2c: bastore
      // f2d: aload 0
      // f2e: ldc2_w -2007022277158430122
      // f31: lload 5
      // f33: invokedynamic q (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f38: iload 4
      // f3a: iload 11
      // f3c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // f3f: aastore
      // f40: goto f4e
      // f43: ldc2_w -474948194024702793
      // f46: lload 5
      // f48: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f4d: athrow
      // f4e: return
   }

   public String J(Object[] param1) {
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
      // 00c: getstatic com/zelix/lqe.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 14762857866860
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 34799527943294
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w 1948870173524376701
      // 025: lload 2
      // 026: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: new java/lang/StringBuffer
      // 02e: dup
      // 02f: new java/lang/StringBuilder
      // 032: dup
      // 033: invokespecial java/lang/StringBuilder.<init> ()V
      // 036: aload 0
      // 037: ldc2_w 1739725250431122868
      // 03a: lload 2
      // 03b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 043: sipush 1769
      // 046: ldc2_w 7357989991978186610
      // 049: lload 2
      // 04a: lxor
      // 04b: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/lqe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 053: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 056: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 059: astore 9
      // 05b: astore 8
      // 05d: bipush 0
      // 05e: istore 10
      // 060: iload 10
      // 062: sipush 8342
      // 065: ldc2_w 3166868710436814609
      // 068: lload 2
      // 069: lxor
      // 06a: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: if_icmpge 121
      // 072: aload 0
      // 073: ldc2_w 109571484843640649
      // 076: lload 2
      // 077: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: iload 10
      // 07e: aaload
      // 07f: astore 11
      // 081: aload 8
      // 083: ifnull 13a
      // 086: aload 11
      // 088: ifnonnull 0b0
      // 08b: goto 098
      // 08e: ldc2_w 2065364024754526582
      // 091: lload 2
      // 092: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: aload 8
      // 09a: lload 2
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: ifle 11e
      // 0a0: ifnonnull 119
      // 0a3: goto 0b0
      // 0a6: ldc2_w 2065364024754526582
      // 0a9: lload 2
      // 0aa: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 9
      // 0b2: new java/lang/StringBuilder
      // 0b5: dup
      // 0b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b9: ldc " "
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: iload 10
      // 0c0: lload 4
      // 0c2: bipush 2
      // 0c3: anewarray 168
      // 0c6: dup_x2
      // 0c7: dup_x2
      // 0c8: pop
      // 0c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cc: bipush 1
      // 0cd: swap
      // 0ce: aastore
      // 0cf: dup_x1
      // 0d0: swap
      // 0d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d4: bipush 0
      // 0d5: swap
      // 0d6: aastore
      // 0d7: ldc2_w 177783565605350035
      // 0da: lload 2
      // 0db: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: ldc "="
      // 0e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e8: aload 11
      // 0ea: lload 6
      // 0ec: bipush 1
      // 0ed: anewarray 168
      // 0f0: dup_x2
      // 0f1: dup_x2
      // 0f2: pop
      // 0f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f6: bipush 0
      // 0f7: swap
      // 0f8: aastore
      // 0f9: ldc2_w 1805673282465173035
      // 0fc: lload 2
      // 0fd: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 105: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 108: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 10b: pop
      // 10c: goto 119
      // 10f: ldc2_w 2065364024754526582
      // 112: lload 2
      // 113: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: iinc 10 1
      // 11c: aload 8
      // 11e: ifnonnull 060
      // 121: aload 9
      // 123: sipush 14476
      // 126: ldc2_w 6507082296470014230
      // 129: lload 2
      // 12a: lxor
      // 12b: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/lqe.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 133: pop
      // 134: lload 2
      // 135: lconst_0
      // 136: lcmp
      // 137: ifle 13a
      // 13a: bipush 0
      // 13b: istore 10
      // 13d: iload 10
      // 13f: sipush 8342
      // 142: ldc2_w 3166868710436814609
      // 145: lload 2
      // 146: lxor
      // 147: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: if_icmpge 1c4
      // 14f: aload 9
      // 151: new java/lang/StringBuilder
      // 154: dup
      // 155: invokespecial java/lang/StringBuilder.<init> ()V
      // 158: ldc " "
      // 15a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15d: iload 10
      // 15f: lload 4
      // 161: bipush 2
      // 162: anewarray 168
      // 165: dup_x2
      // 166: dup_x2
      // 167: pop
      // 168: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b: bipush 1
      // 16c: swap
      // 16d: aastore
      // 16e: dup_x1
      // 16f: swap
      // 170: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 173: bipush 0
      // 174: swap
      // 175: aastore
      // 176: ldc2_w 177783565605350035
      // 179: lload 2
      // 17a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 182: ldc "="
      // 184: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 187: aload 0
      // 188: ldc2_w 136409116590604183
      // 18b: lload 2
      // 18c: invokedynamic p (Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: iload 10
      // 193: aaload
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 197: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 19d: pop
      // 19e: iinc 10 1
      // 1a1: aload 8
      // 1a3: lload 2
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: iflt 1d1
      // 1a9: ifnull 1cc
      // 1ac: aload 8
      // 1ae: ifnonnull 13d
      // 1b1: lload 2
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: ifle 1a1
      // 1b7: goto 1c4
      // 1ba: ldc2_w 2065364024754526582
      // 1bd: lload 2
      // 1be: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: aload 9
      // 1c6: ldc "}"
      // 1c8: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1cb: pop
      // 1cc: aload 9
      // 1ce: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1d1: areturn
   }

   int r(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      String var5 = m44.a<"j">(7433128664673697873L, var3);

      int var10000;
      int var10001;
      label40: {
         try {
            var10000 = var2;
            var10001 = b<"y">(8342, 3166868827778761533L ^ var3);
            if (var5 == null) {
               break label40;
            }

            if (var2 == var10001) {
               return m44.a<"t">(m44.a<"u">(m44.a<"t">(this, 8873792100201544704L, var3), 7246989002701389913L, var3), 7072221390814470051L, var3);
            }
         } catch (n9 var9) {
            throw m44.a<"j">(var9, 6955147276071019866L, var3);
         }

         try {
            var10000 = var2;
            if (var5 == null) {
               return var2;
            }

            var10001 = b<"y">(6327, 5242472656903863069L ^ var3);
         } catch (n9 var7) {
            throw m44.a<"j">(var7, 6955147276071019866L, var3);
         }
      }

      try {
         if (var10000 == var10001) {
            return m44.a<"t">(m44.a<"u">(m44.a<"t">(this, 8873792100201544704L, var3), 7246989002701389913L, var3), 9187456722892868722L, var3);
         }
      } catch (n9 var8) {
         throw m44.a<"j">(var8, 6955147276071019866L, var3);
      }

      return m44.a<"t">(this, 9063669509837128635L, var3)[var2];
   }

   String p(Object[] param1) {
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
      // 0c: getstatic com/zelix/lqe.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 61527996039617
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: aload 0
      // 1c: aconst_null
      // 1d: ldc2_w -5882896561245789506
      // 20: lload 2
      // 21: invokedynamic t (Ljava/lang/Object;Ljava/awt/Dimension;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: ldc2_w -6249413711792796109
      // 29: lload 2
      // 2a: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 0
      // 30: aconst_null
      // 31: ldc2_w -5264981797257701635
      // 34: lload 2
      // 35: invokedynamic t (Ljava/lang/Object;Ljava/awt/Point;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: astore 6
      // 3c: bipush 0
      // 3d: istore 7
      // 3f: iload 7
      // 41: sipush 8342
      // 44: ldc2_w 3166771745638452575
      // 47: lload 2
      // 48: lxor
      // 49: invokedynamic y (IJ)I bsm=com/zelix/lqe.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: if_icmpge e4
      // 51: aload 0
      // 52: ldc2_w -5491261370140019449
      // 55: lload 2
      // 56: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/ge; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: iload 7
      // 5d: aaload
      // 5e: astore 8
      // 60: aload 8
      // 62: aload 6
      // 64: ifnull 98
      // 67: ifnonnull 89
      // 6a: goto 77
      // 6d: ldc2_w -5843422798697338056
      // 70: lload 2
      // 71: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: aload 6
      // 79: ifnonnull dc
      // 7c: goto 89
      // 7f: ldc2_w -5843422798697338056
      // 82: lload 2
      // 83: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 8
      // 8b: goto 98
      // 8e: ldc2_w -5843422798697338056
      // 91: lload 2
      // 92: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: lload 4
      // 9a: bipush 1
      // 9b: anewarray 168
      // 9e: dup_x2
      // 9f: dup_x2
      // a0: pop
      // a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a4: bipush 0
      // a5: swap
      // a6: aastore
      // a7: ldc2_w -5668848948139935470
      // aa: lload 2
      // ab: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: astore 9
      // b2: aload 6
      // b4: lload 2
      // b5: lconst_0
      // b6: lcmp
      // b7: ifle e1
      // ba: ifnull df
      // bd: aload 9
      // bf: ifnull dc
      // c2: goto cf
      // c5: ldc2_w -5843422798697338056
      // c8: lload 2
      // c9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: athrow
      // cf: aload 9
      // d1: areturn
      // d2: ldc2_w -5843422798697338056
      // d5: lload 2
      // d6: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: athrow
      // dc: iinc 7 1
      // df: aload 6
      // e1: ifnonnull 3f
      // e4: aconst_null
      // e5: areturn
   }

   Point R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return new Point(m44.a<"q">(this, -2344810039383875322L, var2)[5], m44.a<"q">(this, -2344810039383875322L, var2)[4]);
   }

   String A(Object[] var1) {
      String var5 = (String)var1[0];
      String var4 = (String)var1[1];
      long var2 = (Long)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 51221214441069L;
      long var8 = var2 ^ 86780111754022L;
      int var10 = m44.a<"i">(new Object[]{var6, var5}, -7557624598607989553L, var2);
      m44.a<"w">(this, -8175596758151624634L, var2)[var10] = new ge(var8, m44.a<"w">(this, -8280766153893910826L, var2), var4);
      return null;
   }

   static {
      long var11 = a ^ 20951780084276L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "j) 4IN\u0099aø:\u0016$ q%n\u0010¼×Ó¢\u0089\r[J\u0002\u001c\r4£\u0014\u000e¤";
      int var19 = "j) 4IN\u0099aø:\u0016$ q%n\u0010¼×Ó¢\u0089\r[J\u0002\u001c\r4£\u0014\u000e¤".length();
      char var16 = 16;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var30 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var30;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[2];
            h = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[13];
            int var3 = 0;
            String var4 = "Áð¾F\u00ad*r\u0003\u001dæ\u009dK4\u001bI\u0095\u0080íóÖe|\u008dv»ÚaT£RmØûÊ\u001dòã:N_/w½ì¬\u008cûî2ÒVÇ\u009b´\u0010nç\u009fÕÕ\u0089\u00943\u0010ý\u0086½=\u000e3¯¹\u0096\u001fM\u001bÀ×¾ÅY\u009aÜ\u0089Aå¢\u000e";
            int var5 = "Áð¾F\u00ad*r\u0003\u001dæ\u009dK4\u001bI\u0095\u0080íóÖe|\u008dv»ÚaT£RmØûÊ\u001dòã:N_/w½ì¬\u008cûî2ÒVÇ\u009b´\u0010nç\u009fÕÕ\u0089\u00943\u0010ý\u0086½=\u000e3¯¹\u0096\u001fM\u001bÀ×¾ÅY\u009aÜ\u0089Aå¢\u000e"
               .length();
            byte var2 = 0;

            label32:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var25 = var6;
               var10001 = var3++;
               long var33 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var36 = -1;

               while (true) {
                  long var8 = var33;
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
                  long var38 = ((long)var10[0] & 255L) << 56
                     | ((long)var10[1] & 255L) << 48
                     | ((long)var10[2] & 255L) << 40
                     | ((long)var10[3] & 255L) << 32
                     | ((long)var10[4] & 255L) << 24
                     | ((long)var10[5] & 255L) << 16
                     | ((long)var10[6] & 255L) << 8
                     | (long)var10[7] & 255L;
                  switch (var36) {
                     case 0:
                        var25[var10001] = var38;
                        if (var2 >= var5) {
                           e = var6;
                           f = new Integer[13];
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "5ÀLø·\u0011f\u0080a\u0013\u0083À\f9j\u000f";
                        var5 = "5ÀLø·\u0011f\u0080a\u0013\u0083À\f9j\u000f".length();
                        var2 = 0;
                  }

                  byte var29 = var2;
                  var2 += 8;
                  var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                  var25 = var6;
                  var10001 = var3++;
                  var33 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var36 = 0;
               }
            }
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15499;
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
            throw new RuntimeException("com/zelix/lqe", var10);
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
         throw new RuntimeException("com/zelix/lqe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4765;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lqe", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/lqe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
