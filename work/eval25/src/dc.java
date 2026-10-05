package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dc implements _zu, lw {
   Vector N;
   String p;
   int s;
   boolean L;
   boolean y;
   _s4 m;
   String H;
   private static final long a = ess.a(1129072783912063656L, 496568596784947965L, MethodHandles.lookup().lookupClass()).a(277470092100826L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public boolean L(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Boolean
      // 011: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 014: istore 4
      // 016: pop
      // 017: lload 2
      // 018: dup2
      // 019: ldc2_w 0
      // 01c: lxor
      // 01d: lstore 5
      // 01f: dup2
      // 020: ldc2_w 29033237019750
      // 023: lxor
      // 024: lstore 7
      // 026: pop2
      // 027: ldc2_w -9127845885204118502
      // 02a: lload 2
      // 02b: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: istore 9
      // 032: aload 0
      // 033: ldc2_w -7214380832072412531
      // 036: lload 2
      // 037: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: iload 9
      // 03e: ifeq 05e
      // 041: ifeq 05d
      // 044: goto 051
      // 047: ldc2_w -7049647404847938145
      // 04a: lload 2
      // 04b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: bipush 1
      // 052: ireturn
      // 053: ldc2_w -7049647404847938145
      // 056: lload 2
      // 057: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05c: athrow
      // 05d: bipush 0
      // 05e: istore 10
      // 060: iload 10
      // 062: aload 0
      // 063: ldc2_w -7085355308073845394
      // 066: lload 2
      // 067: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: invokevirtual java/util/Vector.size ()I
      // 06f: if_icmpge 0eb
      // 072: aload 0
      // 073: ldc2_w -7085355308073845394
      // 076: lload 2
      // 077: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: iload 10
      // 07e: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 081: checkcast com/zelix/ak
      // 084: astore 11
      // 086: iload 9
      // 088: lload 2
      // 089: lconst_0
      // 08a: lcmp
      // 08b: iflt 0e8
      // 08e: ifeq 0e6
      // 091: aload 11
      // 093: lload 5
      // 095: iload 4
      // 097: bipush 2
      // 098: anewarray 375
      // 09b: dup_x1
      // 09c: swap
      // 09d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0a0: bipush 1
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w -6990217517263787600
      // 0af: lload 2
      // 0b0: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: iload 9
      // 0b7: ifeq 0f2
      // 0ba: goto 0c7
      // 0bd: ldc2_w -7049647404847938145
      // 0c0: lload 2
      // 0c1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: ifne 0e3
      // 0ca: goto 0d7
      // 0cd: ldc2_w -7049647404847938145
      // 0d0: lload 2
      // 0d1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: bipush 0
      // 0d8: ireturn
      // 0d9: ldc2_w -7049647404847938145
      // 0dc: lload 2
      // 0dd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: iinc 10 1
      // 0e6: iload 9
      // 0e8: ifne 060
      // 0eb: lload 2
      // 0ec: lconst_0
      // 0ed: lcmp
      // 0ee: iflt 0f4
      // 0f1: bipush 0
      // 0f2: istore 10
      // 0f4: iload 10
      // 0f6: aload 0
      // 0f7: ldc2_w -7085355308073845394
      // 0fa: lload 2
      // 0fb: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: invokevirtual java/util/Vector.size ()I
      // 103: if_icmpge 1e2
      // 106: aload 0
      // 107: ldc2_w -7085355308073845394
      // 10a: lload 2
      // 10b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Vector; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: iload 10
      // 112: invokevirtual java/util/Vector.elementAt (I)Ljava/lang/Object;
      // 115: checkcast com/zelix/ak
      // 118: astore 11
      // 11a: aload 11
      // 11c: lload 7
      // 11e: bipush 1
      // 11f: anewarray 375
      // 122: dup_x2
      // 123: dup_x2
      // 124: pop
      // 125: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: ldc2_w -9173959924198473849
      // 12e: lload 2
      // 12f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: istore 12
      // 136: aload 0
      // 137: iload 9
      // 139: lload 2
      // 13a: lconst_0
      // 13b: lcmp
      // 13c: ifle 1d1
      // 13f: ifeq 1bc
      // 142: ldc2_w -7445046431172429294
      // 145: lload 2
      // 146: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: sipush 13890
      // 14e: ldc2_w 8294178750988111524
      // 151: lload 2
      // 152: lxor
      // 153: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/dc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15b: iload 9
      // 15d: ifeq 1f4
      // 160: goto 16d
      // 163: ldc2_w -7049647404847938145
      // 166: lload 2
      // 167: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: athrow
      // 16d: ifeq 1ae
      // 170: goto 17d
      // 173: ldc2_w -7049647404847938145
      // 176: lload 2
      // 177: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 0
      // 17e: iload 12
      // 180: aload 0
      // 181: ldc2_w -8897710041459415955
      // 184: lload 2
      // 185: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: invokestatic java/lang/Math.max (II)I
      // 18d: ldc2_w -8897710041459415955
      // 190: lload 2
      // 191: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: iload 9
      // 198: lload 2
      // 199: lconst_0
      // 19a: lcmp
      // 19b: iflt 1df
      // 19e: ifne 1da
      // 1a1: goto 1ae
      // 1a4: ldc2_w -7049647404847938145
      // 1a7: lload 2
      // 1a8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: aload 0
      // 1af: goto 1bc
      // 1b2: ldc2_w -7049647404847938145
      // 1b5: lload 2
      // 1b6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: athrow
      // 1bc: iload 12
      // 1be: aload 0
      // 1bf: ldc2_w -8897710041459415955
      // 1c2: lload 2
      // 1c3: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: ldc2_w -8948514664483483439
      // 1cb: lload 2
      // 1cc: invokedynamic s (IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: ldc2_w -8897710041459415955
      // 1d4: lload 2
      // 1d5: invokedynamic p (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: iinc 10 1
      // 1dd: iload 9
      // 1df: ifne 0f4
      // 1e2: aload 0
      // 1e3: lload 2
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: ifle 115
      // 1e9: bipush 1
      // 1ea: ldc2_w -7214380832072412531
      // 1ed: lload 2
      // 1ee: invokedynamic p (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: bipush 1
      // 1f4: ireturn
   }

   static boolean h(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/dc.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w 7113531318052595697
      // 01c: lload 2
      // 01d: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: istore 4
      // 024: aload 1
      // 025: sipush 13890
      // 028: ldc2_w 8294188148120661327
      // 02b: lload 2
      // 02c: lxor
      // 02d: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/dc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 035: iload 4
      // 037: ifeq 08f
      // 03a: ifne 07d
      // 03d: goto 04a
      // 040: ldc2_w 9061709214472808052
      // 043: lload 2
      // 044: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: athrow
      // 04a: aload 1
      // 04b: sipush 6129
      // 04e: ldc2_w 1859226762206448894
      // 051: lload 2
      // 052: lxor
      // 053: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/dc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 05b: iload 4
      // 05d: ifeq 100
      // 060: goto 06d
      // 063: ldc2_w 9061709214472808052
      // 066: lload 2
      // 067: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: ifeq 0ff
      // 070: goto 07d
      // 073: ldc2_w 9061709214472808052
      // 076: lload 2
      // 077: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: aload 1
      // 07e: bipush 3
      // 07f: invokevirtual java/lang/String.charAt (I)C
      // 082: goto 08f
      // 085: ldc2_w 9061709214472808052
      // 088: lload 2
      // 089: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: istore 5
      // 091: iload 5
      // 093: iload 4
      // 095: lload 2
      // 096: lconst_0
      // 097: lcmp
      // 098: ifle 0ab
      // 09b: ifeq 0fa
      // 09e: sipush 29094
      // 0a1: ldc2_w 4132491013930987827
      // 0a4: lload 2
      // 0a5: lxor
      // 0a6: invokedynamic y (IJ)I bsm=com/zelix/dc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: if_icmpeq 0ec
      // 0ae: goto 0bb
      // 0b1: ldc2_w 9061709214472808052
      // 0b4: lload 2
      // 0b5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: iload 5
      // 0bd: iload 4
      // 0bf: ifeq 0fa
      // 0c2: goto 0cf
      // 0c5: ldc2_w 9061709214472808052
      // 0c8: lload 2
      // 0c9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: sipush 17736
      // 0d2: ldc2_w 5516722837773125084
      // 0d5: lload 2
      // 0d6: lxor
      // 0d7: invokedynamic y (IJ)I bsm=com/zelix/dc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: if_icmpne 0fd
      // 0df: goto 0ec
      // 0e2: ldc2_w 9061709214472808052
      // 0e5: lload 2
      // 0e6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: bipush 1
      // 0ed: goto 0fa
      // 0f0: ldc2_w 9061709214472808052
      // 0f3: lload 2
      // 0f4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: goto 0fe
      // 0fd: bipush 0
      // 0fe: ireturn
      // 0ff: bipush 0
      // 100: ireturn
   }

   public boolean k(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   String c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 133815499066597L;
      long var6 = var2 ^ 58582628815413L;
      long var8 = var2 ^ 56871519421665L;
      x44.a<"p">(this, true, 8322396393081281266L, var2);
      int var10000 = x44.a<"s">(7769555063431376538L, var2);
      StringTokenizer var11 = new StringTokenizer(x44.a<"o">(this, 7867914074475239974L, var2), a<"g">(28036, 1290200617343385571L ^ var2));
      int var10 = var10000;
      x44.a<"p">(this, var11.nextToken().trim(), 8227372945192947858L, var2);
      String var12 = var11.nextToken();
      StringTokenizer var13 = new StringTokenizer(var12, ",");

      while (var13.hasMoreTokens()) {
         String var14 = var13.nextToken();
         ak var15 = new ak(var6, x44.a<"o">(this, 8396673483846537588L, var2), var14);
         String var16 = x44.a<"k">(var15, new Object[]{var8}, 7948864217893306931L, var2);

         try {
            if (var10 == 0) {
               return var16;
            }

            if (var16 != null) {
               return var16;
            }
         } catch (gj var18) {
            throw x44.a<"s">(var18, 8406811635825979167L, var2);
         }

         label38: {
            try {
               var10000 = x44.a<"k">(var15, new Object[]{var4}, 7732432372579952048L, var2);
               if (var2 < 0L) {
                  break label38;
               }

               if (var10000 != 0) {
                  return a<"g">(8418, 5723872884891333250L ^ var2) + x44.a<"o">(this, 7867914074475239974L, var2) + "'";
               }
            } catch (gj var17) {
               throw x44.a<"s">(var17, 8406811635825979167L, var2);
            }

            x44.a<"o">(this, 8587136670310832110L, var2).addElement(var15);
            var10000 = var10;
         }

         if (var10000 == 0) {
            break;
         }
      }

      return null;
   }

   public void R(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      int var10000 = x44.a<"q">(-654965281369050208L, var2);
      x44.a<"r">(this, false, -1415494949163326153L, var2);
      int var6 = var10000;
      int var7 = 0;

      while (var7 < x44.a<"m">(this, -1580276455567717676L, var2).size()) {
         ak var8 = (ak)x44.a<"m">(this, -1580276455567717676L, var2).elementAt(var7);
         x44.a<"i">(var8, new Object[]{var4}, -1480019913432973188L, var2);
         var7++;
         if (var6 == 0) {
            break;
         }
      }
   }

   public boolean M(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String d(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 63479578117580
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 46285987256795
      // 018: lxor
      // 019: lstore 6
      // 01b: pop2
      // 01c: aload 0
      // 01d: lload 6
      // 01f: bipush 1
      // 020: anewarray 375
      // 023: dup_x2
      // 024: dup_x2
      // 025: pop
      // 026: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 029: bipush 0
      // 02a: swap
      // 02b: aastore
      // 02c: ldc2_w -777613482219378372
      // 02f: lload 2
      // 030: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: ldc2_w -1210849741859149189
      // 038: lload 2
      // 039: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aconst_null
      // 03f: astore 9
      // 041: istore 8
      // 043: aload 0
      // 044: iload 8
      // 046: ifeq 070
      // 049: ldc2_w -604004800103932397
      // 04c: lload 2
      // 04d: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: ifne 08a
      // 055: goto 062
      // 058: ldc2_w -1131585355545203714
      // 05b: lload 2
      // 05c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: aload 0
      // 063: goto 070
      // 066: ldc2_w -1131585355545203714
      // 069: lload 2
      // 06a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: lload 4
      // 072: bipush 1
      // 073: anewarray 375
      // 076: dup_x2
      // 077: dup_x2
      // 078: pop
      // 079: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07c: bipush 0
      // 07d: swap
      // 07e: aastore
      // 07f: ldc2_w -1438324340966538987
      // 082: lload 2
      // 083: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: astore 9
      // 08a: aload 9
      // 08c: iload 8
      // 08e: lload 2
      // 08f: lconst_0
      // 090: lcmp
      // 091: ifle 0d9
      // 094: ifeq 0d6
      // 097: ifnull 0b4
      // 09a: goto 0a7
      // 09d: ldc2_w -1131585355545203714
      // 0a0: lload 2
      // 0a1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: aload 9
      // 0a9: areturn
      // 0aa: ldc2_w -1131585355545203714
      // 0ad: lload 2
      // 0ae: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 0
      // 0b5: iload 8
      // 0b7: lload 2
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: ifle 133
      // 0bd: ifeq 126
      // 0c0: ldc2_w -662957532363090829
      // 0c3: lload 2
      // 0c4: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: goto 0d6
      // 0cc: ldc2_w -1131585355545203714
      // 0cf: lload 2
      // 0d0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: sipush 31349
      // 0d9: ldc2_w 7961668699107421425
      // 0dc: lload 2
      // 0dd: lxor
      // 0de: invokedynamic g (IJ)Ljava/lang/String; bsm=com/zelix/dc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e6: lload 2
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: ifle 108
      // 0ec: ifeq 118
      // 0ef: aload 0
      // 0f0: sipush 19210
      // 0f3: ldc2_w 6183209709597427222
      // 0f6: lload 2
      // 0f7: lxor
      // 0f8: invokedynamic y (IJ)I bsm=com/zelix/dc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: ldc2_w -1520622621037966836
      // 100: lload 2
      // 101: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: iload 8
      // 108: ifne 13c
      // 10b: goto 118
      // 10e: ldc2_w -1131585355545203714
      // 111: lload 2
      // 112: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: aload 0
      // 119: goto 126
      // 11c: ldc2_w -1131585355545203714
      // 11f: lload 2
      // 120: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: sipush 15318
      // 129: ldc2_w 1400062405737805515
      // 12c: lload 2
      // 12d: lxor
      // 12e: invokedynamic y (IJ)I bsm=com/zelix/dc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: ldc2_w -1520622621037966836
      // 136: lload 2
      // 137: invokedynamic q (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: aconst_null
      // 13d: areturn
   }

   dc(long var1, _s4 var3, String var4) {
      var1 = a ^ var1;
      super();
      x44.a<"r">(this, new Vector(), -7097128763292811964L, var1);
      x44.a<"r">(this, var3, -7049057315055485986L, var1);
      x44.a<"r">(this, var4.trim(), -8675551802436456308L, var1);
   }

   public boolean H(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public int X(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"i">(this, -512599210740819957L, var2);
   }

   static {
      long var11 = a ^ 52958537139509L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "N.]\\ú\u001c½j\u009f\u0002Ò=}N;\u0000\u0010:m£ãE\u0007\u0010\u001eÐmØXÉ\u0001Òn\u0010n+0{$\u0089ef¹\u0010\u0012\u0086\u009b®\u0092¥";
      int var19 = "N.]\\ú\u001c½j\u009f\u0002Ò=}N;\u0000\u0010:m£ãE\u0007\u0010\u001eÐmØXÉ\u0001Òn\u0010n+0{$\u0089ef¹\u0010\u0012\u0086\u009b®\u0092¥"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[5];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "àÝ\u0011|\u009a´QÂð\u0097\u008c¿I³m]";
                     int var5 = "àÝ\u0011|\u009a´QÂð\u0097\u008c¿I³m]".length();
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
                                    e = var6;
                                    f = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u000f^\u0085ºñE\u009eu\u0089Y¤¡Ð~/½";
                                 var5 = "\u000f^\u0085ºñE\u009eu\u0089Y¤¡Ð~/½".length();
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

                  var17 = "\u008a¡`½9Ìëf\u008eX\u0012\u008d'ì{\u000ex2\u008f{òyVõµ\u008e(V\u009fk\u001afo'\u001cwV\u0097{ä\u009aC[V\u00adë\u0097\u0082°í}\u0006Z4]Â\u0098y\u0018B\u0015\fðZQpË_åÛ\b|¿\u008f´ò55\u001b!E\u0006ª\u0095\u001báa\u0093/l\u009a±´\\65&Þ;\u0010lþM\u001e<©ãkÃ£¯Ï\u0092*ØC\u008aôS¤_B.\u001b\u009eVØh [µE\u001a~ëð\u0089";
                  var19 = "\u008a¡`½9Ìëf\u008eX\u0012\u008d'ì{\u000ex2\u008f{òyVõµ\u008e(V\u009fk\u001afo'\u001cwV\u0097{ä\u009aC[V\u00adë\u0097\u0082°í}\u0006Z4]Â\u0098y\u0018B\u0015\fðZQpË_åÛ\b|¿\u008f´ò55\u001b!E\u0006ª\u0095\u001báa\u0093/l\u009a±´\\65&Þ;\u0010lþM\u001e<©ãkÃ£¯Ï\u0092*ØC\u008aôS¤_B.\u001b\u009eVØh [µE\u001a~ëð\u0089"
                     .length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27252;
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
            throw new RuntimeException("com/zelix/dc", var10);
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
         throw new RuntimeException("com/zelix/dc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12782;
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/dc", var14);
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
         throw new RuntimeException("com/zelix/dc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
