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

public class x4 extends xm implements rt {
   private iu r;
   static final w5 Z;
   private iu Q;
   private static final long a = ess.a(4662967551900594503L, 2461733062004431070L, MethodHandles.lookup().lookupClass()).a(246596166839886L);
   private static final String[] g;
   private static final String[] h;
   private static final Map k = new HashMap(13);
   private static final long[] o;
   private static final Integer[] q;
   private static final Map s;

   public x4(int var1, int var2, _83 var3, mn var4, long var5, bc var7) {
      long var8 = ((long)var2 << 32 | var5 << 32 >>> 32) ^ a;
      long var10 = var8 ^ 35936210124343L;
      super(var1, var10, var3, var4, var7);
   }

   public x4(long var1, int var3, mn var4, x4 var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 84273443730353L;
      super(var6, var3, var4, var5);
      x44.a<"v">(this, x44.a<"i">(var5, 5335662523861609304L, var1), 5335662523861609304L, var1);
      x44.a<"v">(this, x44.a<"i">(var5, 6237193847440228440L, var1), 6237193847440228440L, var1);
   }

   public w5 m(long var1) {
      return x44.a<"h">(-1298690825943582514L, var1);
   }

   public iu k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -6137403159099229179L, var2);
   }

   final void i(Object[] param1) {
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
      // 04: checkcast com/zelix/_ur
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/x4.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 74479712685843
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 48773457555027
      // 26: lxor
      // 27: lstore 7
      // 29: dup2
      // 2a: ldc2_w 76108285235993
      // 2d: lxor
      // 2e: lstore 9
      // 30: pop2
      // 31: ldc2_w -3415799410507139719
      // 34: lload 2
      // 35: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: astore 11
      // 3c: aload 0
      // 3d: ldc2_w -3123432322422524429
      // 40: lload 2
      // 41: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: aload 11
      // 48: ifnonnull 72
      // 4b: ifnull ff
      // 4e: goto 5b
      // 51: ldc2_w -3730092184233464764
      // 54: lload 2
      // 55: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 0
      // 5c: ldc2_w -3123432322422524429
      // 5f: lload 2
      // 60: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: goto 72
      // 68: ldc2_w -3730092184233464764
      // 6b: lload 2
      // 6c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: lload 5
      // 74: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 77: astore 12
      // 79: aload 12
      // 7b: aload 11
      // 7d: ifnonnull b1
      // 80: lload 7
      // 82: dup2_x1
      // 83: pop2
      // 84: invokestatic com/zelix/yn.B (JLjava/lang/String;)Z
      // 87: ifne ff
      // 8a: goto 97
      // 8d: ldc2_w -3730092184233464764
      // 90: lload 2
      // 91: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: aload 0
      // 98: ldc2_w -3795012242338282739
      // 9b: lload 2
      // 9c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: invokevirtual com/zelix/mn.F ()Ljava/lang/String;
      // a4: goto b1
      // a7: ldc2_w -3730092184233464764
      // aa: lload 2
      // ab: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: astore 13
      // b3: aload 0
      // b4: ldc2_w -3123432322422524429
      // b7: lload 2
      // b8: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd: lload 9
      // bf: invokevirtual com/zelix/iu.t (J)Ljava/lang/String;
      // c2: astore 14
      // c4: lload 2
      // c5: lconst_0
      // c6: lcmp
      // c7: ifle f2
      // ca: aload 13
      // cc: aload 14
      // ce: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // d1: ifne ff
      // d4: aload 0
      // d5: ldc2_w -3795012242338282739
      // d8: lload 2
      // d9: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: aload 14
      // e0: bipush 1
      // e1: anewarray 234
      // e4: dup_x1
      // e5: swap
      // e6: bipush 0
      // e7: swap
      // e8: aastore
      // e9: ldc2_w -3227518643449363763
      // ec: lload 2
      // ed: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f2: goto ff
      // f5: ldc2_w -3730092184233464764
      // f8: lload 2
      // f9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fe: athrow
      // ff: return
   }

   public x4(int var1, _83 var2, int var3, mn var4, long var5) {
      var5 = a ^ var5;
      int var7 = (int)((var5 ^ 2615836825025L) >>> 32);
      int var8 = (int)((var5 ^ 2615836825025L) << 32 >>> 32);
      super(var1, var7, var2, var3, var8, var4);
   }

   public void Q(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: aload 1
      // 0001: dup
      // 0002: bipush 0
      // 0003: aaload
      // 0004: checkcast java/lang/Long
      // 0007: invokevirtual java/lang/Long.longValue ()J
      // 000a: lstore 3
      // 000b: dup
      // 000c: bipush 1
      // 000d: aaload
      // 000e: checkcast java/util/Set
      // 0011: astore 6
      // 0013: dup
      // 0014: bipush 2
      // 0015: aaload
      // 0016: checkcast com/zelix/_yv
      // 0019: astore 5
      // 001b: dup
      // 001c: bipush 3
      // 001d: aaload
      // 001e: checkcast com/zelix/_ug
      // 0021: astore 7
      // 0023: dup
      // 0024: bipush 4
      // 0025: aaload
      // 0026: checkcast com/zelix/ei
      // 0029: astore 2
      // 002a: pop
      // 002b: getstatic com/zelix/x4.a J
      // 002e: lload 3
      // 002f: lxor
      // 0030: lstore 3
      // 0031: lload 3
      // 0032: dup2
      // 0033: ldc2_w 44825337830656
      // 0036: lxor
      // 0037: lstore 8
      // 0039: dup2
      // 003a: ldc2_w 16024634716034
      // 003d: lxor
      // 003e: dup2
      // 003f: bipush 32
      // 0041: lushr
      // 0042: lstore 10
      // 0044: dup2
      // 0045: bipush 32
      // 0047: lshl
      // 0048: bipush 32
      // 004a: lushr
      // 004b: l2i
      // 004c: istore 12
      // 004e: pop2
      // 004f: dup2
      // 0050: ldc2_w 79234424333759
      // 0053: lxor
      // 0054: dup2
      // 0055: bipush 32
      // 0057: lushr
      // 0058: l2i
      // 0059: istore 13
      // 005b: dup2
      // 005c: bipush 32
      // 005e: lshl
      // 005f: bipush 48
      // 0061: lushr
      // 0062: l2i
      // 0063: istore 14
      // 0065: dup2
      // 0066: bipush 48
      // 0068: lshl
      // 0069: bipush 48
      // 006b: lushr
      // 006c: l2i
      // 006d: istore 15
      // 006f: pop2
      // 0070: dup2
      // 0071: ldc2_w 124151047905711
      // 0074: lxor
      // 0075: lstore 16
      // 0077: dup2
      // 0078: ldc2_w 125868038498151
      // 007b: lxor
      // 007c: lstore 18
      // 007e: dup2
      // 007f: ldc2_w 24886777822585
      // 0082: lxor
      // 0083: lstore 20
      // 0085: dup2
      // 0086: ldc2_w 41585405006945
      // 0089: lxor
      // 008a: lstore 22
      // 008c: dup2
      // 008d: ldc2_w 17705872973085
      // 0090: lxor
      // 0091: lstore 24
      // 0093: dup2
      // 0094: ldc2_w 119226701376485
      // 0097: lxor
      // 0098: lstore 26
      // 009a: dup2
      // 009b: ldc2_w 59449532609508
      // 009e: lxor
      // 009f: lstore 28
      // 00a1: dup2
      // 00a2: ldc2_w 138845421593945
      // 00a5: lxor
      // 00a6: lstore 30
      // 00a8: dup2
      // 00a9: ldc2_w 113358234421040
      // 00ac: lxor
      // 00ad: lstore 32
      // 00af: dup2
      // 00b0: ldc2_w 25685711748855
      // 00b3: lxor
      // 00b4: lstore 34
      // 00b6: dup2
      // 00b7: ldc2_w 63422800003201
      // 00ba: lxor
      // 00bb: lstore 36
      // 00bd: dup2
      // 00be: ldc2_w 72352040517855
      // 00c1: lxor
      // 00c2: lstore 38
      // 00c4: dup2
      // 00c5: ldc2_w 139309177934363
      // 00c8: lxor
      // 00c9: lstore 40
      // 00cb: dup2
      // 00cc: ldc2_w 137039552831816
      // 00cf: lxor
      // 00d0: lstore 42
      // 00d2: dup2
      // 00d3: ldc2_w 36195468793798
      // 00d6: lxor
      // 00d7: lstore 44
      // 00d9: dup2
      // 00da: ldc2_w 41407189504227
      // 00dd: lxor
      // 00de: lstore 46
      // 00e0: dup2
      // 00e1: ldc2_w 30120199509077
      // 00e4: lxor
      // 00e5: lstore 48
      // 00e7: dup2
      // 00e8: ldc2_w 93803332711078
      // 00eb: lxor
      // 00ec: lstore 50
      // 00ee: dup2
      // 00ef: ldc2_w 120705814569206
      // 00f2: lxor
      // 00f3: lstore 52
      // 00f5: dup2
      // 00f6: ldc2_w 28452766559354
      // 00f9: lxor
      // 00fa: lstore 54
      // 00fc: dup2
      // 00fd: ldc2_w 3576671015020
      // 0100: lxor
      // 0101: lstore 56
      // 0103: dup2
      // 0104: ldc2_w 52608741084255
      // 0107: lxor
      // 0108: lstore 58
      // 010a: dup2
      // 010b: ldc2_w 11080206605229
      // 010e: lxor
      // 010f: lstore 60
      // 0111: pop2
      // 0112: aload 0
      // 0113: ldc2_w -5269072383130894664
      // 0116: lload 3
      // 0117: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011c: invokevirtual com/zelix/mn.F ()Ljava/lang/String;
      // 011f: astore 64
      // 0121: ldc2_w -5967917780941813556
      // 0124: lload 3
      // 0125: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 012a: aload 0
      // 012b: ldc2_w -5269072383130894664
      // 012e: lload 3
      // 012f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0134: invokevirtual com/zelix/mn.M ()Ljava/lang/String;
      // 0137: bipush 1
      // 0138: anewarray 234
      // 013b: dup_x1
      // 013c: swap
      // 013d: bipush 0
      // 013e: swap
      // 013f: aastore
      // 0140: ldc2_w -6167893284711439614
      // 0143: lload 3
      // 0144: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0149: astore 65
      // 014b: astore 63
      // 014d: aconst_null
      // 014e: astore 66
      // 0150: aload 0
      // 0151: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 0154: iload 13
      // 0156: iload 14
      // 0158: i2c
      // 0159: iload 15
      // 015b: i2c
      // 015c: bipush 3
      // 015d: anewarray 234
      // 0160: dup_x1
      // 0161: swap
      // 0162: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0165: bipush 2
      // 0166: swap
      // 0167: aastore
      // 0168: dup_x1
      // 0169: swap
      // 016a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 016d: bipush 1
      // 016e: swap
      // 016f: aastore
      // 0170: dup_x1
      // 0171: swap
      // 0172: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0175: bipush 0
      // 0176: swap
      // 0177: aastore
      // 0178: ldc2_w -5994746360972126244
      // 017b: lload 3
      // 017c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0181: sipush 6307
      // 0184: ldc2_w 7163583884979470460
      // 0187: lload 3
      // 0188: lxor
      // 0189: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0191: aload 63
      // 0193: ifnonnull 03d1
      // 0196: ifeq 0390
      // 0199: goto 01a6
      // 019c: ldc2_w -5653959240997416463
      // 019f: lload 3
      // 01a0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01a5: athrow
      // 01a6: aload 0
      // 01a7: ldc2_w -5269072383130894664
      // 01aa: lload 3
      // 01ab: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b0: invokevirtual com/zelix/mn.M ()Ljava/lang/String;
      // 01b3: lload 10
      // 01b5: dup2_x1
      // 01b6: pop2
      // 01b7: iload 12
      // 01b9: bipush 3
      // 01ba: anewarray 234
      // 01bd: dup_x1
      // 01be: swap
      // 01bf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 01c2: bipush 2
      // 01c3: swap
      // 01c4: aastore
      // 01c5: dup_x1
      // 01c6: swap
      // 01c7: bipush 1
      // 01c8: swap
      // 01c9: aastore
      // 01ca: dup_x2
      // 01cb: dup_x2
      // 01cc: pop
      // 01cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 01d0: bipush 0
      // 01d1: swap
      // 01d2: aastore
      // 01d3: ldc2_w -6226167251972280770
      // 01d6: lload 3
      // 01d7: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01dc: astore 67
      // 01de: aload 67
      // 01e0: aload 63
      // 01e2: ifnonnull 0210
      // 01e5: invokeinterface java/util/List.size ()I 1
      // 01ea: bipush 1
      // 01eb: if_icmplt 038d
      // 01ee: goto 01fb
      // 01f1: ldc2_w -5653959240997416463
      // 01f4: lload 3
      // 01f5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01fa: athrow
      // 01fb: aload 67
      // 01fd: bipush 0
      // 01fe: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0203: goto 0210
      // 0206: ldc2_w -5653959240997416463
      // 0209: lload 3
      // 020a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020f: athrow
      // 0210: checkcast java/lang/String
      // 0213: astore 68
      // 0215: aload 68
      // 0217: ldc "L"
      // 0219: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 021c: lload 3
      // 021d: lconst_0
      // 021e: lcmp
      // 021f: ifle 025d
      // 0222: aload 63
      // 0224: ifnonnull 025d
      // 0227: ifeq 038d
      // 022a: goto 0237
      // 022d: ldc2_w -5653959240997416463
      // 0230: lload 3
      // 0231: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0236: athrow
      // 0237: aload 68
      // 0239: aload 63
      // 023b: ifnonnull 027a
      // 023e: goto 024b
      // 0241: ldc2_w -5653959240997416463
      // 0244: lload 3
      // 0245: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024a: athrow
      // 024b: ldc ";"
      // 024d: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0250: goto 025d
      // 0253: ldc2_w -5653959240997416463
      // 0256: lload 3
      // 0257: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025c: athrow
      // 025d: ifeq 038d
      // 0260: aload 68
      // 0262: bipush 1
      // 0263: aload 68
      // 0265: invokevirtual java/lang/String.length ()I
      // 0268: bipush 1
      // 0269: isub
      // 026a: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 026d: goto 027a
      // 0270: ldc2_w -5653959240997416463
      // 0273: lload 3
      // 0274: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0279: athrow
      // 027a: astore 66
      // 027c: lload 28
      // 027e: aload 66
      // 0280: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 0283: astore 69
      // 0285: lload 3
      // 0286: lconst_0
      // 0287: lcmp
      // 0288: iflt 0290
      // 028b: aload 69
      // 028d: ifnull 038d
      // 0290: aload 64
      // 0292: sipush 12811
      // 0295: ldc2_w 1516298819366922968
      // 0298: lload 3
      // 0299: lxor
      // 029a: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02a2: aload 63
      // 02a4: lload 3
      // 02a5: lconst_0
      // 02a6: lcmp
      // 02a7: iflt 0308
      // 02aa: ifnonnull 0306
      // 02ad: goto 02ba
      // 02b0: ldc2_w -5653959240997416463
      // 02b3: lload 3
      // 02b4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b9: athrow
      // 02ba: ifeq 02e7
      // 02bd: goto 02ca
      // 02c0: ldc2_w -5653959240997416463
      // 02c3: lload 3
      // 02c4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c9: athrow
      // 02ca: new com/zelix/_fz
      // 02cd: dup
      // 02ce: aload 64
      // 02d0: sipush 20611
      // 02d3: ldc2_w 252115141003823193
      // 02d6: lload 3
      // 02d7: lxor
      // 02d8: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02dd: invokespecial com/zelix/_fz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 02e0: astore 70
      // 02e2: aload 63
      // 02e4: ifnull 037a
      // 02e7: aload 64
      // 02e9: sipush 11490
      // 02ec: ldc2_w 2246146164002927667
      // 02ef: lload 3
      // 02f0: lxor
      // 02f1: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02f6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 02f9: goto 0306
      // 02fc: ldc2_w -5653959240997416463
      // 02ff: lload 3
      // 0300: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0305: athrow
      // 0306: aload 63
      // 0308: ifnonnull 0357
      // 030b: ifeq 0338
      // 030e: goto 031b
      // 0311: ldc2_w -5653959240997416463
      // 0314: lload 3
      // 0315: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031a: athrow
      // 031b: new com/zelix/_fz
      // 031e: dup
      // 031f: aload 64
      // 0321: sipush 24771
      // 0324: ldc2_w 443937045556033557
      // 0327: lload 3
      // 0328: lxor
      // 0329: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032e: invokespecial com/zelix/_fz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0331: astore 70
      // 0333: aload 63
      // 0335: ifnull 037a
      // 0338: aload 64
      // 033a: sipush 24643
      // 033d: ldc2_w 1824608111784163483
      // 0340: lload 3
      // 0341: lxor
      // 0342: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0347: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 034a: goto 0357
      // 034d: ldc2_w -5653959240997416463
      // 0350: lload 3
      // 0351: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0356: athrow
      // 0357: ifeq 0377
      // 035a: new com/zelix/_fz
      // 035d: dup
      // 035e: aload 64
      // 0360: sipush 18330
      // 0363: ldc2_w 6985700448661921616
      // 0366: lload 3
      // 0367: lxor
      // 0368: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 036d: invokespecial com/zelix/_fz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0370: astore 70
      // 0372: aload 63
      // 0374: ifnull 037a
      // 0377: aconst_null
      // 0378: astore 70
      // 037a: aload 0
      // 037b: aload 69
      // 037d: lload 52
      // 037f: aload 70
      // 0381: invokevirtual com/zelix/hy.q (JLcom/zelix/_fz;)Lcom/zelix/ig;
      // 0384: ldc2_w -6263873537144371130
      // 0387: lload 3
      // 0388: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038d: goto 100e
      // 0390: aload 0
      // 0391: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 0394: iload 13
      // 0396: iload 14
      // 0398: i2c
      // 0399: iload 15
      // 039b: i2c
      // 039c: bipush 3
      // 039d: anewarray 234
      // 03a0: dup_x1
      // 03a1: swap
      // 03a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 03a5: bipush 2
      // 03a6: swap
      // 03a7: aastore
      // 03a8: dup_x1
      // 03a9: swap
      // 03aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 03ad: bipush 1
      // 03ae: swap
      // 03af: aastore
      // 03b0: dup_x1
      // 03b1: swap
      // 03b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 03b5: bipush 0
      // 03b6: swap
      // 03b7: aastore
      // 03b8: ldc2_w -5994746360972126244
      // 03bb: lload 3
      // 03bc: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c1: sipush 456
      // 03c4: ldc2_w 2965955666565634323
      // 03c7: lload 3
      // 03c8: lxor
      // 03c9: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03ce: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03d1: aload 63
      // 03d3: lload 3
      // 03d4: lconst_0
      // 03d5: lcmp
      // 03d6: iflt 04bd
      // 03d9: ifnonnull 04bb
      // 03dc: ifeq 046d
      // 03df: goto 03ec
      // 03e2: ldc2_w -5653959240997416463
      // 03e5: lload 3
      // 03e6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03eb: athrow
      // 03ec: aload 0
      // 03ed: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 03f0: lload 60
      // 03f2: bipush 1
      // 03f3: anewarray 234
      // 03f6: dup_x2
      // 03f7: dup_x2
      // 03f8: pop
      // 03f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03fc: bipush 0
      // 03fd: swap
      // 03fe: aastore
      // 03ff: ldc2_w -5369081589061135208
      // 0402: lload 3
      // 0403: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0408: lload 40
      // 040a: bipush 1
      // 040b: anewarray 234
      // 040e: dup_x2
      // 040f: dup_x2
      // 0410: pop
      // 0411: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0414: bipush 0
      // 0415: swap
      // 0416: aastore
      // 0417: ldc2_w -5571077193592992942
      // 041a: lload 3
      // 041b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0420: invokevirtual com/zelix/mo.X ()Lcom/zelix/i8;
      // 0423: astore 67
      // 0425: aload 67
      // 0427: lload 3
      // 0428: lconst_0
      // 0429: lcmp
      // 042a: ifle 0444
      // 042d: aload 63
      // 042f: ifnonnull 0444
      // 0432: ifnull 0468
      // 0435: goto 0442
      // 0438: ldc2_w -5653959240997416463
      // 043b: lload 3
      // 043c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0441: athrow
      // 0442: aload 67
      // 0444: lload 38
      // 0446: invokevirtual com/zelix/i8.A (J)Z
      // 0449: ifeq 0468
      // 044c: aload 0
      // 044d: aload 67
      // 044f: checkcast com/zelix/iu
      // 0452: ldc2_w -6263873537144371130
      // 0455: lload 3
      // 0456: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045b: goto 0468
      // 045e: ldc2_w -5653959240997416463
      // 0461: lload 3
      // 0462: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0467: athrow
      // 0468: aload 63
      // 046a: ifnull 100e
      // 046d: aload 0
      // 046e: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 0471: iload 13
      // 0473: iload 14
      // 0475: i2c
      // 0476: iload 15
      // 0478: i2c
      // 0479: bipush 3
      // 047a: anewarray 234
      // 047d: dup_x1
      // 047e: swap
      // 047f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0482: bipush 2
      // 0483: swap
      // 0484: aastore
      // 0485: dup_x1
      // 0486: swap
      // 0487: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 048a: bipush 1
      // 048b: swap
      // 048c: aastore
      // 048d: dup_x1
      // 048e: swap
      // 048f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0492: bipush 0
      // 0493: swap
      // 0494: aastore
      // 0495: ldc2_w -5994746360972126244
      // 0498: lload 3
      // 0499: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049e: sipush 22681
      // 04a1: ldc2_w 8968611429758976073
      // 04a4: lload 3
      // 04a5: lxor
      // 04a6: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04ab: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04ae: goto 04bb
      // 04b1: ldc2_w -5653959240997416463
      // 04b4: lload 3
      // 04b5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04ba: athrow
      // 04bb: aload 63
      // 04bd: ifnonnull 05bd
      // 04c0: ifeq 0557
      // 04c3: goto 04d0
      // 04c6: ldc2_w -5653959240997416463
      // 04c9: lload 3
      // 04ca: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04cf: athrow
      // 04d0: aload 0
      // 04d1: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 04d4: lload 60
      // 04d6: bipush 1
      // 04d7: anewarray 234
      // 04da: dup_x2
      // 04db: dup_x2
      // 04dc: pop
      // 04dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04e0: bipush 0
      // 04e1: swap
      // 04e2: aastore
      // 04e3: ldc2_w -5369081589061135208
      // 04e6: lload 3
      // 04e7: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04ec: lload 40
      // 04ee: bipush 1
      // 04ef: anewarray 234
      // 04f2: dup_x2
      // 04f3: dup_x2
      // 04f4: pop
      // 04f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04f8: bipush 0
      // 04f9: swap
      // 04fa: aastore
      // 04fb: ldc2_w -5571077193592992942
      // 04fe: lload 3
      // 04ff: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0504: invokevirtual com/zelix/mo.X ()Lcom/zelix/i8;
      // 0507: astore 67
      // 0509: aload 67
      // 050b: lload 3
      // 050c: lconst_0
      // 050d: lcmp
      // 050e: iflt 0528
      // 0511: aload 63
      // 0513: ifnonnull 0528
      // 0516: ifnull 054c
      // 0519: goto 0526
      // 051c: ldc2_w -5653959240997416463
      // 051f: lload 3
      // 0520: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0525: athrow
      // 0526: aload 67
      // 0528: lload 38
      // 052a: invokevirtual com/zelix/i8.A (J)Z
      // 052d: ifeq 054c
      // 0530: aload 0
      // 0531: aload 67
      // 0533: checkcast com/zelix/iu
      // 0536: ldc2_w -6263873537144371130
      // 0539: lload 3
      // 053a: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053f: goto 054c
      // 0542: ldc2_w -5653959240997416463
      // 0545: lload 3
      // 0546: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054b: athrow
      // 054c: lload 3
      // 054d: lconst_0
      // 054e: lcmp
      // 054f: iflt 0557
      // 0552: aload 63
      // 0554: ifnull 100e
      // 0557: aload 0
      // 0558: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 055b: aload 63
      // 055d: lload 3
      // 055e: lconst_0
      // 055f: lcmp
      // 0560: iflt 0656
      // 0563: ifnonnull 0652
      // 0566: goto 0573
      // 0569: ldc2_w -5653959240997416463
      // 056c: lload 3
      // 056d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0572: athrow
      // 0573: iload 13
      // 0575: iload 14
      // 0577: i2c
      // 0578: iload 15
      // 057a: i2c
      // 057b: bipush 3
      // 057c: anewarray 234
      // 057f: dup_x1
      // 0580: swap
      // 0581: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0584: bipush 2
      // 0585: swap
      // 0586: aastore
      // 0587: dup_x1
      // 0588: swap
      // 0589: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 058c: bipush 1
      // 058d: swap
      // 058e: aastore
      // 058f: dup_x1
      // 0590: swap
      // 0591: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0594: bipush 0
      // 0595: swap
      // 0596: aastore
      // 0597: ldc2_w -5994746360972126244
      // 059a: lload 3
      // 059b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a0: sipush 3417
      // 05a3: ldc2_w 6025818874951406983
      // 05a6: lload 3
      // 05a7: lxor
      // 05a8: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05ad: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05b0: goto 05bd
      // 05b3: ldc2_w -5653959240997416463
      // 05b6: lload 3
      // 05b7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05bc: athrow
      // 05bd: ifeq 0641
      // 05c0: aload 0
      // 05c1: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 05c4: lload 60
      // 05c6: bipush 1
      // 05c7: anewarray 234
      // 05ca: dup_x2
      // 05cb: dup_x2
      // 05cc: pop
      // 05cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05d0: bipush 0
      // 05d1: swap
      // 05d2: aastore
      // 05d3: ldc2_w -5369081589061135208
      // 05d6: lload 3
      // 05d7: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05dc: lload 40
      // 05de: bipush 1
      // 05df: anewarray 234
      // 05e2: dup_x2
      // 05e3: dup_x2
      // 05e4: pop
      // 05e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 05e8: bipush 0
      // 05e9: swap
      // 05ea: aastore
      // 05eb: ldc2_w -5571077193592992942
      // 05ee: lload 3
      // 05ef: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f4: invokevirtual com/zelix/mo.X ()Lcom/zelix/i8;
      // 05f7: astore 67
      // 05f9: aload 67
      // 05fb: lload 3
      // 05fc: lconst_0
      // 05fd: lcmp
      // 05fe: iflt 0618
      // 0601: aload 63
      // 0603: ifnonnull 0618
      // 0606: ifnull 063c
      // 0609: goto 0616
      // 060c: ldc2_w -5653959240997416463
      // 060f: lload 3
      // 0610: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0615: athrow
      // 0616: aload 67
      // 0618: lload 38
      // 061a: invokevirtual com/zelix/i8.A (J)Z
      // 061d: ifeq 063c
      // 0620: aload 0
      // 0621: aload 67
      // 0623: checkcast com/zelix/iu
      // 0626: ldc2_w -6263873537144371130
      // 0629: lload 3
      // 062a: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062f: goto 063c
      // 0632: ldc2_w -5653959240997416463
      // 0635: lload 3
      // 0636: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063b: athrow
      // 063c: aload 63
      // 063e: ifnull 100e
      // 0641: aload 0
      // 0642: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 0645: goto 0652
      // 0648: ldc2_w -5653959240997416463
      // 064b: lload 3
      // 064c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0651: athrow
      // 0652: bipush 0
      // 0653: anewarray 234
      // 0656: ldc2_w -5492777381488590929
      // 0659: lload 3
      // 065a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065f: astore 67
      // 0661: aload 67
      // 0663: arraylength
      // 0664: bipush 3
      // 0665: lload 3
      // 0666: lconst_0
      // 0667: lcmp
      // 0668: ifle 0a9e
      // 066b: aload 63
      // 066d: ifnonnull 0a9e
      // 0670: if_icmpne 0a79
      // 0673: goto 0680
      // 0676: ldc2_w -5653959240997416463
      // 0679: lload 3
      // 067a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067f: athrow
      // 0680: aload 67
      // 0682: bipush 0
      // 0683: aaload
      // 0684: instanceof com/zelix/xb
      // 0687: aload 63
      // 0689: ifnonnull 0a7f
      // 068c: goto 0699
      // 068f: ldc2_w -5653959240997416463
      // 0692: lload 3
      // 0693: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0698: athrow
      // 0699: ifeq 0a79
      // 069c: goto 06a9
      // 069f: ldc2_w -5653959240997416463
      // 06a2: lload 3
      // 06a3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a8: athrow
      // 06a9: aload 67
      // 06ab: bipush 1
      // 06ac: aaload
      // 06ad: instanceof com/zelix/x_
      // 06b0: aload 63
      // 06b2: ifnonnull 0a7f
      // 06b5: goto 06c2
      // 06b8: ldc2_w -5653959240997416463
      // 06bb: lload 3
      // 06bc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c1: athrow
      // 06c2: ifeq 0a79
      // 06c5: goto 06d2
      // 06c8: ldc2_w -5653959240997416463
      // 06cb: lload 3
      // 06cc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d1: athrow
      // 06d2: aload 67
      // 06d4: bipush 2
      // 06d5: aaload
      // 06d6: instanceof com/zelix/xb
      // 06d9: aload 63
      // 06db: ifnonnull 0a7f
      // 06de: goto 06eb
      // 06e1: ldc2_w -5653959240997416463
      // 06e4: lload 3
      // 06e5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06ea: athrow
      // 06eb: ifeq 0a79
      // 06ee: goto 06fb
      // 06f1: ldc2_w -5653959240997416463
      // 06f4: lload 3
      // 06f5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06fa: athrow
      // 06fb: ldc2_w -5306451646450696097
      // 06fe: lload 3
      // 06ff: invokedynamic j (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0704: aload 63
      // 0706: ifnonnull 0a7f
      // 0709: goto 0716
      // 070c: ldc2_w -5653959240997416463
      // 070f: lload 3
      // 0710: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0715: athrow
      // 0716: ifeq 0a79
      // 0719: goto 0726
      // 071c: ldc2_w -5653959240997416463
      // 071f: lload 3
      // 0720: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0725: athrow
      // 0726: aload 67
      // 0728: bipush 1
      // 0729: aaload
      // 072a: checkcast com/zelix/x_
      // 072d: astore 68
      // 072f: aload 68
      // 0731: lload 40
      // 0733: bipush 1
      // 0734: anewarray 234
      // 0737: dup_x2
      // 0738: dup_x2
      // 0739: pop
      // 073a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 073d: bipush 0
      // 073e: swap
      // 073f: aastore
      // 0740: ldc2_w -5571077193592992942
      // 0743: lload 3
      // 0744: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0749: astore 69
      // 074b: aload 69
      // 074d: invokevirtual com/zelix/mo.X ()Lcom/zelix/i8;
      // 0750: astore 70
      // 0752: aload 70
      // 0754: lload 3
      // 0755: lconst_0
      // 0756: lcmp
      // 0757: iflt 0771
      // 075a: aload 63
      // 075c: ifnonnull 0771
      // 075f: ifnull 0a79
      // 0762: goto 076f
      // 0765: ldc2_w -5653959240997416463
      // 0768: lload 3
      // 0769: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076e: athrow
      // 076f: aload 70
      // 0771: lload 38
      // 0773: invokevirtual com/zelix/i8.A (J)Z
      // 0776: aload 63
      // 0778: ifnonnull 0a7f
      // 077b: ifeq 0a79
      // 077e: goto 078b
      // 0781: ldc2_w -5653959240997416463
      // 0784: lload 3
      // 0785: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078a: athrow
      // 078b: aload 70
      // 078d: checkcast com/zelix/iu
      // 0790: astore 71
      // 0792: aload 71
      // 0794: invokevirtual com/zelix/iu.k ()Z
      // 0797: aload 63
      // 0799: ifnonnull 0a7f
      // 079c: ifeq 0a79
      // 079f: goto 07ac
      // 07a2: ldc2_w -5653959240997416463
      // 07a5: lload 3
      // 07a6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07ab: athrow
      // 07ac: aload 6
      // 07ae: aload 71
      // 07b0: checkcast com/zelix/ig
      // 07b3: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 07b8: pop
      // 07b9: aload 71
      // 07bb: invokevirtual com/zelix/iu.H ()Ljava/lang/String;
      // 07be: aload 63
      // 07c0: ifnonnull 0a7b
      // 07c3: goto 07d0
      // 07c6: ldc2_w -5653959240997416463
      // 07c9: lload 3
      // 07ca: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07cf: athrow
      // 07d0: astore 62
      // 07d2: lload 10
      // 07d4: aload 62
      // 07d6: iload 12
      // 07d8: bipush 3
      // 07d9: anewarray 234
      // 07dc: dup_x1
      // 07dd: swap
      // 07de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07e1: bipush 2
      // 07e2: swap
      // 07e3: aastore
      // 07e4: dup_x1
      // 07e5: swap
      // 07e6: bipush 1
      // 07e7: swap
      // 07e8: aastore
      // 07e9: dup_x2
      // 07ea: dup_x2
      // 07eb: pop
      // 07ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07ef: bipush 0
      // 07f0: swap
      // 07f1: aastore
      // 07f2: ldc2_w -6226167251972280770
      // 07f5: lload 3
      // 07f6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07fb: astore 72
      // 07fd: aload 0
      // 07fe: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 0801: lload 60
      // 0803: bipush 1
      // 0804: anewarray 234
      // 0807: dup_x2
      // 0808: dup_x2
      // 0809: pop
      // 080a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 080d: bipush 0
      // 080e: swap
      // 080f: aastore
      // 0810: ldc2_w -5369081589061135208
      // 0813: lload 3
      // 0814: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0819: lload 40
      // 081b: bipush 1
      // 081c: anewarray 234
      // 081f: dup_x2
      // 0820: dup_x2
      // 0821: pop
      // 0822: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0825: bipush 0
      // 0826: swap
      // 0827: aastore
      // 0828: ldc2_w -5571077193592992942
      // 082b: lload 3
      // 082c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0831: invokevirtual com/zelix/mo.X ()Lcom/zelix/i8;
      // 0834: astore 73
      // 0836: aload 73
      // 0838: lload 3
      // 0839: lconst_0
      // 083a: lcmp
      // 083b: ifle 0843
      // 083e: ifnull 0a79
      // 0841: aload 73
      // 0843: lload 30
      // 0845: invokevirtual com/zelix/i8.d (J)Lcom/zelix/hz;
      // 0848: astore 74
      // 084a: aload 74
      // 084c: lload 3
      // 084d: lconst_0
      // 084e: lcmp
      // 084f: ifle 0869
      // 0852: aload 63
      // 0854: ifnonnull 0869
      // 0857: ifnull 0a79
      // 085a: goto 0867
      // 085d: ldc2_w -5653959240997416463
      // 0860: lload 3
      // 0861: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0866: athrow
      // 0867: aload 74
      // 0869: lload 50
      // 086b: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 086e: sipush 16254
      // 0871: ldc2_w 6813018489123121078
      // 0874: lload 3
      // 0875: lxor
      // 0876: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 087e: aload 63
      // 0880: ifnonnull 0a7f
      // 0883: ifeq 0a79
      // 0886: goto 0893
      // 0889: ldc2_w -5653959240997416463
      // 088c: lload 3
      // 088d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0892: athrow
      // 0893: aload 73
      // 0895: lload 46
      // 0897: invokevirtual com/zelix/i8.w (J)Ljava/lang/String;
      // 089a: sipush 1393
      // 089d: ldc2_w 3383707878515219878
      // 08a0: lload 3
      // 08a1: lxor
      // 08a2: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a7: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08aa: aload 63
      // 08ac: ifnonnull 0a7f
      // 08af: goto 08bc
      // 08b2: ldc2_w -5653959240997416463
      // 08b5: lload 3
      // 08b6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08bb: athrow
      // 08bc: ifeq 0a79
      // 08bf: goto 08cc
      // 08c2: ldc2_w -5653959240997416463
      // 08c5: lload 3
      // 08c6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08cb: athrow
      // 08cc: aload 71
      // 08ce: lload 32
      // 08d0: bipush 1
      // 08d1: anewarray 234
      // 08d4: dup_x2
      // 08d5: dup_x2
      // 08d6: pop
      // 08d7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08da: bipush 0
      // 08db: swap
      // 08dc: aastore
      // 08dd: ldc2_w -5763481385792909253
      // 08e0: lload 3
      // 08e1: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e6: aload 0
      // 08e7: ldc2_w -5269072383130894664
      // 08ea: lload 3
      // 08eb: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f0: invokevirtual com/zelix/mn.M ()Ljava/lang/String;
      // 08f3: lload 10
      // 08f5: dup2_x1
      // 08f6: pop2
      // 08f7: iload 12
      // 08f9: bipush 3
      // 08fa: anewarray 234
      // 08fd: dup_x1
      // 08fe: swap
      // 08ff: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0902: bipush 2
      // 0903: swap
      // 0904: aastore
      // 0905: dup_x1
      // 0906: swap
      // 0907: bipush 1
      // 0908: swap
      // 0909: aastore
      // 090a: dup_x2
      // 090b: dup_x2
      // 090c: pop
      // 090d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0910: bipush 0
      // 0911: swap
      // 0912: aastore
      // 0913: ldc2_w -6226167251972280770
      // 0916: lload 3
      // 0917: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091c: astore 75
      // 091e: aload 67
      // 0920: bipush 2
      // 0921: aaload
      // 0922: checkcast com/zelix/xb
      // 0925: astore 76
      // 0927: aload 76
      // 0929: lload 20
      // 092b: bipush 1
      // 092c: anewarray 234
      // 092f: dup_x2
      // 0930: dup_x2
      // 0931: pop
      // 0932: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0935: bipush 0
      // 0936: swap
      // 0937: aastore
      // 0938: ldc2_w -6260493242417804749
      // 093b: lload 3
      // 093c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0941: astore 77
      // 0943: lload 10
      // 0945: aload 77
      // 0947: iload 12
      // 0949: bipush 3
      // 094a: anewarray 234
      // 094d: dup_x1
      // 094e: swap
      // 094f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0952: bipush 2
      // 0953: swap
      // 0954: aastore
      // 0955: dup_x1
      // 0956: swap
      // 0957: bipush 1
      // 0958: swap
      // 0959: aastore
      // 095a: dup_x2
      // 095b: dup_x2
      // 095c: pop
      // 095d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0960: bipush 0
      // 0961: swap
      // 0962: aastore
      // 0963: ldc2_w -6226167251972280770
      // 0966: lload 3
      // 0967: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096c: astore 78
      // 096e: aload 71
      // 0970: lload 42
      // 0972: bipush 1
      // 0973: anewarray 234
      // 0976: dup_x2
      // 0977: dup_x2
      // 0978: pop
      // 0979: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097c: bipush 0
      // 097d: swap
      // 097e: aastore
      // 097f: ldc2_w -5849201708265388382
      // 0982: lload 3
      // 0983: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0988: aload 63
      // 098a: lload 3
      // 098b: lconst_0
      // 098c: lcmp
      // 098d: iflt 09fb
      // 0990: ifnonnull 09f9
      // 0993: ifeq 09d2
      // 0996: goto 09a3
      // 0999: ldc2_w -5653959240997416463
      // 099c: lload 3
      // 099d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a2: athrow
      // 09a3: aload 75
      // 09a5: invokeinterface java/util/List.isEmpty ()Z 1
      // 09aa: aload 63
      // 09ac: lload 3
      // 09ad: lconst_0
      // 09ae: lcmp
      // 09af: iflt 0a81
      // 09b2: ifnonnull 0a7f
      // 09b5: goto 09c2
      // 09b8: ldc2_w -5653959240997416463
      // 09bb: lload 3
      // 09bc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c1: athrow
      // 09c2: ifne 0a79
      // 09c5: goto 09d2
      // 09c8: ldc2_w -5653959240997416463
      // 09cb: lload 3
      // 09cc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d1: athrow
      // 09d2: aload 71
      // 09d4: lload 42
      // 09d6: bipush 1
      // 09d7: anewarray 234
      // 09da: dup_x2
      // 09db: dup_x2
      // 09dc: pop
      // 09dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09e0: bipush 0
      // 09e1: swap
      // 09e2: aastore
      // 09e3: ldc2_w -5849201708265388382
      // 09e6: lload 3
      // 09e7: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09ec: goto 09f9
      // 09ef: ldc2_w -5653959240997416463
      // 09f2: lload 3
      // 09f3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f8: athrow
      // 09f9: aload 63
      // 09fb: ifnonnull 0a22
      // 09fe: ifeq 0a1b
      // 0a01: goto 0a0e
      // 0a04: ldc2_w -5653959240997416463
      // 0a07: lload 3
      // 0a08: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0d: athrow
      // 0a0e: aload 75
      // 0a10: bipush 0
      // 0a11: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 0a16: checkcast java/lang/String
      // 0a19: astore 79
      // 0a1b: aload 72
      // 0a1d: invokeinterface java/util/List.size ()I 1
      // 0a22: aload 75
      // 0a24: invokeinterface java/util/List.size ()I 1
      // 0a29: if_icmple 0a2c
      // 0a2c: aload 72
      // 0a2e: invokeinterface java/util/List.size ()I 1
      // 0a33: aload 78
      // 0a35: invokeinterface java/util/List.size ()I 1
      // 0a3a: isub
      // 0a3b: istore 79
      // 0a3d: aload 72
      // 0a3f: invokeinterface java/util/List.size ()I 1
      // 0a44: iload 79
      // 0a46: isub
      // 0a47: istore 80
      // 0a49: aload 71
      // 0a4b: lload 22
      // 0a4d: iload 80
      // 0a4f: bipush 2
      // 0a50: anewarray 234
      // 0a53: dup_x1
      // 0a54: swap
      // 0a55: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a58: bipush 1
      // 0a59: swap
      // 0a5a: aastore
      // 0a5b: dup_x2
      // 0a5c: dup_x2
      // 0a5d: pop
      // 0a5e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a61: bipush 0
      // 0a62: swap
      // 0a63: aastore
      // 0a64: ldc2_w -5536095036673829289
      // 0a67: lload 3
      // 0a68: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6d: aload 0
      // 0a6e: aload 71
      // 0a70: ldc2_w -5363608772192918714
      // 0a73: lload 3
      // 0a74: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a79: aload 65
      // 0a7b: bipush 0
      // 0a7c: invokevirtual java/lang/String.charAt (I)C
      // 0a7f: aload 63
      // 0a81: ifnonnull 0adf
      // 0a84: sipush 21230
      // 0a87: ldc2_w 1665243721916099783
      // 0a8a: lload 3
      // 0a8b: lxor
      // 0a8c: invokedynamic x (IJ)I bsm=com/zelix/x4.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a91: goto 0a9e
      // 0a94: ldc2_w -5653959240997416463
      // 0a97: lload 3
      // 0a98: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9d: athrow
      // 0a9e: if_icmpeq 0ae2
      // 0aa1: aload 65
      // 0aa3: aload 63
      // 0aa5: ifnonnull 0af0
      // 0aa8: goto 0ab5
      // 0aab: ldc2_w -5653959240997416463
      // 0aae: lload 3
      // 0aaf: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab4: athrow
      // 0ab5: lload 8
      // 0ab7: bipush 2
      // 0ab8: anewarray 234
      // 0abb: dup_x2
      // 0abc: dup_x2
      // 0abd: pop
      // 0abe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ac1: bipush 1
      // 0ac2: swap
      // 0ac3: aastore
      // 0ac4: dup_x1
      // 0ac5: swap
      // 0ac6: bipush 0
      // 0ac7: swap
      // 0ac8: aastore
      // 0ac9: ldc2_w -5965940154604364008
      // 0acc: lload 3
      // 0acd: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad2: goto 0adf
      // 0ad5: ldc2_w -5653959240997416463
      // 0ad8: lload 3
      // 0ad9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ade: athrow
      // 0adf: ifeq 0ae3
      // 0ae2: return
      // 0ae3: aload 65
      // 0ae5: bipush 1
      // 0ae6: aload 65
      // 0ae8: invokevirtual java/lang/String.length ()I
      // 0aeb: bipush 1
      // 0aec: isub
      // 0aed: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0af0: astore 66
      // 0af2: aload 0
      // 0af3: getfield com/zelix/x4.T Lcom/zelix/bc;
      // 0af6: bipush 0
      // 0af7: anewarray 234
      // 0afa: ldc2_w -5492777381488590929
      // 0afd: lload 3
      // 0afe: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b03: astore 68
      // 0b05: lload 54
      // 0b07: bipush 1
      // 0b08: anewarray 234
      // 0b0b: dup_x2
      // 0b0c: dup_x2
      // 0b0d: pop
      // 0b0e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b11: bipush 0
      // 0b12: swap
      // 0b13: aastore
      // 0b14: ldc2_w -6017156405854788174
      // 0b17: lload 3
      // 0b18: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1d: astore 69
      // 0b1f: bipush 0
      // 0b20: istore 70
      // 0b22: iload 70
      // 0b24: aload 68
      // 0b26: arraylength
      // 0b27: if_icmpge 0c6d
      // 0b2a: aload 63
      // 0b2c: ifnonnull 100e
      // 0b2f: aload 68
      // 0b31: iload 70
      // 0b33: aaload
      // 0b34: instanceof com/zelix/xb
      // 0b37: lload 3
      // 0b38: lconst_0
      // 0b39: lcmp
      // 0b3a: iflt 0bc0
      // 0b3d: aload 63
      // 0b3f: ifnonnull 0bc0
      // 0b42: goto 0b4f
      // 0b45: ldc2_w -5653959240997416463
      // 0b48: lload 3
      // 0b49: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4e: athrow
      // 0b4f: ifeq 0b99
      // 0b52: goto 0b5f
      // 0b55: ldc2_w -5653959240997416463
      // 0b58: lload 3
      // 0b59: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5e: athrow
      // 0b5f: aload 69
      // 0b61: aload 68
      // 0b63: iload 70
      // 0b65: aaload
      // 0b66: checkcast com/zelix/xb
      // 0b69: lload 20
      // 0b6b: bipush 1
      // 0b6c: anewarray 234
      // 0b6f: dup_x2
      // 0b70: dup_x2
      // 0b71: pop
      // 0b72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b75: bipush 0
      // 0b76: swap
      // 0b77: aastore
      // 0b78: ldc2_w -6260493242417804749
      // 0b7b: lload 3
      // 0b7c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b81: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0b86: pop
      // 0b87: aload 63
      // 0b89: ifnull 0c65
      // 0b8c: goto 0b99
      // 0b8f: ldc2_w -5653959240997416463
      // 0b92: lload 3
      // 0b93: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b98: athrow
      // 0b99: aload 68
      // 0b9b: iload 70
      // 0b9d: aaload
      // 0b9e: aload 63
      // 0ba0: ifnonnull 0bd5
      // 0ba3: goto 0bb0
      // 0ba6: ldc2_w -5653959240997416463
      // 0ba9: lload 3
      // 0baa: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0baf: athrow
      // 0bb0: instanceof com/zelix/x_
      // 0bb3: goto 0bc0
      // 0bb6: ldc2_w -5653959240997416463
      // 0bb9: lload 3
      // 0bba: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bbf: athrow
      // 0bc0: ifeq 0c65
      // 0bc3: aload 68
      // 0bc5: iload 70
      // 0bc7: aaload
      // 0bc8: goto 0bd5
      // 0bcb: ldc2_w -5653959240997416463
      // 0bce: lload 3
      // 0bcf: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd4: athrow
      // 0bd5: checkcast com/zelix/x_
      // 0bd8: astore 71
      // 0bda: aload 63
      // 0bdc: lload 3
      // 0bdd: lconst_0
      // 0bde: lcmp
      // 0bdf: iflt 0c6a
      // 0be2: ifnonnull 0c68
      // 0be5: aload 71
      // 0be7: ifnull 0c65
      // 0bea: goto 0bf7
      // 0bed: ldc2_w -5653959240997416463
      // 0bf0: lload 3
      // 0bf1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf6: athrow
      // 0bf7: aload 71
      // 0bf9: lload 16
      // 0bfb: bipush 1
      // 0bfc: anewarray 234
      // 0bff: dup_x2
      // 0c00: dup_x2
      // 0c01: pop
      // 0c02: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c05: bipush 0
      // 0c06: swap
      // 0c07: aastore
      // 0c08: ldc2_w -5412638676456278098
      // 0c0b: lload 3
      // 0c0c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c11: aload 63
      // 0c13: ifnonnull 0c64
      // 0c16: goto 0c23
      // 0c19: ldc2_w -5653959240997416463
      // 0c1c: lload 3
      // 0c1d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c22: athrow
      // 0c23: ifeq 0c65
      // 0c26: goto 0c33
      // 0c29: ldc2_w -5653959240997416463
      // 0c2c: lload 3
      // 0c2d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c32: athrow
      // 0c33: aload 69
      // 0c35: aload 71
      // 0c37: lload 40
      // 0c39: bipush 1
      // 0c3a: anewarray 234
      // 0c3d: dup_x2
      // 0c3e: dup_x2
      // 0c3f: pop
      // 0c40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c43: bipush 0
      // 0c44: swap
      // 0c45: aastore
      // 0c46: ldc2_w -5571077193592992942
      // 0c49: lload 3
      // 0c4a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4f: invokevirtual com/zelix/mo.n ()Ljava/lang/String;
      // 0c52: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0c57: goto 0c64
      // 0c5a: ldc2_w -5653959240997416463
      // 0c5d: lload 3
      // 0c5e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c63: athrow
      // 0c64: pop
      // 0c65: iinc 70 1
      // 0c68: aload 63
      // 0c6a: ifnull 0b22
      // 0c6d: aload 0
      // 0c6e: lload 36
      // 0c70: bipush 1
      // 0c71: anewarray 234
      // 0c74: dup_x2
      // 0c75: dup_x2
      // 0c76: pop
      // 0c77: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c7a: bipush 0
      // 0c7b: swap
      // 0c7c: aastore
      // 0c7d: ldc2_w -5426181491492030455
      // 0c80: lload 3
      // 0c81: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c86: astore 70
      // 0c88: lload 3
      // 0c89: lconst_0
      // 0c8a: lcmp
      // 0c8b: ifle 100e
      // 0c8e: aload 70
      // 0c90: aload 63
      // 0c92: lload 3
      // 0c93: lconst_0
      // 0c94: lcmp
      // 0c95: ifle 0cc3
      // 0c98: ifnonnull 0cbf
      // 0c9b: lload 58
      // 0c9d: invokevirtual com/zelix/hz.K (J)Z
      // 0ca0: ifeq 0ccf
      // 0ca3: goto 0cb0
      // 0ca6: ldc2_w -5653959240997416463
      // 0ca9: lload 3
      // 0caa: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0caf: athrow
      // 0cb0: aload 70
      // 0cb2: goto 0cbf
      // 0cb5: ldc2_w -5653959240997416463
      // 0cb8: lload 3
      // 0cb9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cbe: athrow
      // 0cbf: bipush 0
      // 0cc0: anewarray 234
      // 0cc3: ldc2_w -6127020469424745005
      // 0cc6: lload 3
      // 0cc7: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ccc: goto 0cd0
      // 0ccf: aconst_null
      // 0cd0: astore 71
      // 0cd2: aload 7
      // 0cd4: aload 66
      // 0cd6: aload 71
      // 0cd8: new java/lang/StringBuilder
      // 0cdb: dup
      // 0cdc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cdf: sipush 25235
      // 0ce2: ldc2_w 914592869436553807
      // 0ce5: lload 3
      // 0ce6: lxor
      // 0ce7: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cef: aload 66
      // 0cf1: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 0cf4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf7: sipush 6801
      // 0cfa: ldc2_w 5061623268005151308
      // 0cfd: lload 3
      // 0cfe: lxor
      // 0cff: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d04: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d07: aload 0
      // 0d08: lload 34
      // 0d0a: bipush 1
      // 0d0b: anewarray 234
      // 0d0e: dup_x2
      // 0d0f: dup_x2
      // 0d10: pop
      // 0d11: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d14: bipush 0
      // 0d15: swap
      // 0d16: aastore
      // 0d17: ldc2_w -5336332036697753578
      // 0d1a: lload 3
      // 0d1b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d20: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d23: ldc "'"
      // 0d25: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d28: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d2b: lload 44
      // 0d2d: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 0d30: astore 72
      // 0d32: aload 69
      // 0d34: aload 63
      // 0d36: ifnonnull 0d61
      // 0d39: ldc2_w -6059683104255480762
      // 0d3c: lload 3
      // 0d3d: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d42: ifne 100e
      // 0d45: goto 0d52
      // 0d48: ldc2_w -5653959240997416463
      // 0d4b: lload 3
      // 0d4c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d51: athrow
      // 0d52: aload 69
      // 0d54: goto 0d61
      // 0d57: ldc2_w -5653959240997416463
      // 0d5a: lload 3
      // 0d5b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d60: athrow
      // 0d61: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d66: astore 73
      // 0d68: aload 73
      // 0d6a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d6f: ifeq 100e
      // 0d72: aload 73
      // 0d74: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d79: checkcast java/lang/String
      // 0d7c: astore 74
      // 0d7e: new com/zelix/_fz
      // 0d81: dup
      // 0d82: aload 64
      // 0d84: aload 74
      // 0d86: invokespecial com/zelix/_fz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0d89: astore 75
      // 0d8b: aload 66
      // 0d8d: aload 63
      // 0d8f: ifnonnull 0f17
      // 0d92: aload 64
      // 0d94: aload 5
      // 0d96: lload 48
      // 0d98: invokestatic com/zelix/_fz.w (Ljava/lang/String;Ljava/lang/String;Lcom/zelix/we;J)Z
      // 0d9b: ifeq 0e91
      // 0d9e: goto 0dab
      // 0da1: ldc2_w -5653959240997416463
      // 0da4: lload 3
      // 0da5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0daa: athrow
      // 0dab: aload 0
      // 0dac: lload 36
      // 0dae: bipush 1
      // 0daf: anewarray 234
      // 0db2: dup_x2
      // 0db3: dup_x2
      // 0db4: pop
      // 0db5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0db8: bipush 0
      // 0db9: swap
      // 0dba: aastore
      // 0dbb: ldc2_w -5426181491492030455
      // 0dbe: lload 3
      // 0dbf: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc4: aload 63
      // 0dc6: ifnonnull 0e5c
      // 0dc9: goto 0dd6
      // 0dcc: ldc2_w -5653959240997416463
      // 0dcf: lload 3
      // 0dd0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd5: athrow
      // 0dd6: lload 26
      // 0dd8: bipush 1
      // 0dd9: anewarray 234
      // 0ddc: dup_x2
      // 0ddd: dup_x2
      // 0dde: pop
      // 0ddf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0de2: bipush 0
      // 0de3: swap
      // 0de4: aastore
      // 0de5: ldc2_w -6118071694614708928
      // 0de8: lload 3
      // 0de9: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dee: ifeq 0e91
      // 0df1: goto 0dfe
      // 0df4: ldc2_w -5653959240997416463
      // 0df7: lload 3
      // 0df8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dfd: athrow
      // 0dfe: aload 7
      // 0e00: sipush 28179
      // 0e03: ldc2_w 8228034541580678854
      // 0e06: lload 3
      // 0e07: lxor
      // 0e08: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0d: aload 71
      // 0e0f: new java/lang/StringBuilder
      // 0e12: dup
      // 0e13: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e16: sipush 19662
      // 0e19: ldc2_w 6135059025114387461
      // 0e1c: lload 3
      // 0e1d: lxor
      // 0e1e: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e23: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e26: aload 0
      // 0e27: lload 34
      // 0e29: bipush 1
      // 0e2a: anewarray 234
      // 0e2d: dup_x2
      // 0e2e: dup_x2
      // 0e2f: pop
      // 0e30: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e33: bipush 0
      // 0e34: swap
      // 0e35: aastore
      // 0e36: ldc2_w -5336332036697753578
      // 0e39: lload 3
      // 0e3a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e42: ldc "'"
      // 0e44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e47: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e4a: lload 44
      // 0e4c: invokevirtual com/zelix/_ug.C (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;J)Lcom/zelix/hz;
      // 0e4f: goto 0e5c
      // 0e52: ldc2_w -5653959240997416463
      // 0e55: lload 3
      // 0e56: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5b: athrow
      // 0e5c: checkcast com/zelix/hu
      // 0e5f: astore 76
      // 0e61: aload 76
      // 0e63: lload 56
      // 0e65: aload 75
      // 0e67: bipush 2
      // 0e68: anewarray 234
      // 0e6b: dup_x1
      // 0e6c: swap
      // 0e6d: bipush 1
      // 0e6e: swap
      // 0e6f: aastore
      // 0e70: dup_x2
      // 0e71: dup_x2
      // 0e72: pop
      // 0e73: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e76: bipush 0
      // 0e77: swap
      // 0e78: aastore
      // 0e79: ldc2_w -5775061242367172927
      // 0e7c: lload 3
      // 0e7d: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/in; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e82: astore 77
      // 0e84: aload 0
      // 0e85: aload 77
      // 0e87: ldc2_w -6263873537144371130
      // 0e8a: lload 3
      // 0e8b: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e90: return
      // 0e91: new java/lang/StringBuilder
      // 0e94: dup
      // 0e95: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e98: sipush 31566
      // 0e9b: ldc2_w 1495908252924011415
      // 0e9e: lload 3
      // 0e9f: lxor
      // 0ea0: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ea8: aload 75
      // 0eaa: lload 18
      // 0eac: aconst_null
      // 0ead: bipush 2
      // 0eae: anewarray 234
      // 0eb1: dup_x1
      // 0eb2: swap
      // 0eb3: bipush 1
      // 0eb4: swap
      // 0eb5: aastore
      // 0eb6: dup_x2
      // 0eb7: dup_x2
      // 0eb8: pop
      // 0eb9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ebc: bipush 0
      // 0ebd: swap
      // 0ebe: aastore
      // 0ebf: ldc2_w -5802762124465777622
      // 0ec2: lload 3
      // 0ec3: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ecb: sipush 24613
      // 0ece: ldc2_w 1606925774627502327
      // 0ed1: lload 3
      // 0ed2: lxor
      // 0ed3: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0edb: aload 66
      // 0edd: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 0ee0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ee3: sipush 32083
      // 0ee6: ldc2_w 303957434582754695
      // 0ee9: lload 3
      // 0eea: lxor
      // 0eeb: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/x4.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef3: aload 0
      // 0ef4: lload 34
      // 0ef6: bipush 1
      // 0ef7: anewarray 234
      // 0efa: dup_x2
      // 0efb: dup_x2
      // 0efc: pop
      // 0efd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f00: bipush 0
      // 0f01: swap
      // 0f02: aastore
      // 0f03: ldc2_w -5336332036697753578
      // 0f06: lload 3
      // 0f07: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f0f: ldc "'"
      // 0f11: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f14: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f17: astore 76
      // 0f19: aload 0
      // 0f1a: aload 0
      // 0f1b: lload 24
      // 0f1d: aload 72
      // 0f1f: aload 75
      // 0f21: aload 71
      // 0f23: aload 76
      // 0f25: aload 5
      // 0f27: aload 7
      // 0f29: aload 2
      // 0f2a: bipush 8
      // 0f2c: anewarray 234
      // 0f2f: dup_x1
      // 0f30: swap
      // 0f31: bipush 7
      // 0f33: swap
      // 0f34: aastore
      // 0f35: dup_x1
      // 0f36: swap
      // 0f37: bipush 6
      // 0f39: swap
      // 0f3a: aastore
      // 0f3b: dup_x1
      // 0f3c: swap
      // 0f3d: bipush 5
      // 0f3e: swap
      // 0f3f: aastore
      // 0f40: dup_x1
      // 0f41: swap
      // 0f42: bipush 4
      // 0f43: swap
      // 0f44: aastore
      // 0f45: dup_x1
      // 0f46: swap
      // 0f47: bipush 3
      // 0f48: swap
      // 0f49: aastore
      // 0f4a: dup_x1
      // 0f4b: swap
      // 0f4c: bipush 2
      // 0f4d: swap
      // 0f4e: aastore
      // 0f4f: dup_x1
      // 0f50: swap
      // 0f51: bipush 1
      // 0f52: swap
      // 0f53: aastore
      // 0f54: dup_x2
      // 0f55: dup_x2
      // 0f56: pop
      // 0f57: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f5a: bipush 0
      // 0f5b: swap
      // 0f5c: aastore
      // 0f5d: ldc2_w -5576665727388922493
      // 0f60: lload 3
      // 0f61: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f66: ldc2_w -6263873537144371130
      // 0f69: lload 3
      // 0f6a: invokedynamic p (Ljava/lang/Object;Lcom/zelix/iu;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6f: aload 0
      // 0f70: ldc2_w -6263873537144371130
      // 0f73: lload 3
      // 0f74: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f79: lload 3
      // 0f7a: lconst_0
      // 0f7b: lcmp
      // 0f7c: iflt 0fab
      // 0f7f: aload 63
      // 0f81: ifnonnull 0fab
      // 0f84: ifnull 0ff6
      // 0f87: goto 0f94
      // 0f8a: ldc2_w -5653959240997416463
      // 0f8d: lload 3
      // 0f8e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f93: athrow
      // 0f94: aload 0
      // 0f95: ldc2_w -6263873537144371130
      // 0f98: lload 3
      // 0f99: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9e: goto 0fab
      // 0fa1: ldc2_w -5653959240997416463
      // 0fa4: lload 3
      // 0fa5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0faa: athrow
      // 0fab: invokevirtual com/zelix/iu.k ()Z
      // 0fae: lload 3
      // 0faf: lconst_0
      // 0fb0: lcmp
      // 0fb1: iflt 0fea
      // 0fb4: aload 63
      // 0fb6: ifnonnull 0fea
      // 0fb9: ifeq 100e
      // 0fbc: goto 0fc9
      // 0fbf: ldc2_w -5653959240997416463
      // 0fc2: lload 3
      // 0fc3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc8: athrow
      // 0fc9: aload 6
      // 0fcb: aload 0
      // 0fcc: ldc2_w -6263873537144371130
      // 0fcf: lload 3
      // 0fd0: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd5: checkcast com/zelix/ig
      // 0fd8: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0fdd: goto 0fea
      // 0fe0: ldc2_w -5653959240997416463
      // 0fe3: lload 3
      // 0fe4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe9: athrow
      // 0fea: pop
      // 0feb: aload 63
      // 0fed: lload 3
      // 0fee: lconst_0
      // 0fef: lcmp
      // 0ff0: iflt 0ff8
      // 0ff3: ifnull 100e
      // 0ff6: aload 63
      // 0ff8: ifnull 0d68
      // 0ffb: lload 3
      // 0ffc: lconst_0
      // 0ffd: lcmp
      // 0ffe: iflt 0d8b
      // 1001: goto 100e
      // 1004: ldc2_w -5653959240997416463
      // 1007: lload 3
      // 1008: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100d: athrow
      // 100e: return
   }

   public String t(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 26373553470601L;
      return x44.a<"i">(this, 7565615752721703078L, var1).t(var3)
         + f<"x">(15724, 1031294663596023135L ^ var1)
         + x44.a<"m">(this.T, new Object[]{var5}, 8581705012757253082L, var1);
   }

   public void H(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Set
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/util/Set
      // 020: astore 7
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 4
      // 02a: pop
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 69926884478599
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 108860983064476
      // 038: lxor
      // 039: lstore 10
      // 03b: dup2
      // 03c: ldc2_w 128100965755767
      // 03f: lxor
      // 040: lstore 12
      // 042: dup2
      // 043: ldc2_w 0
      // 046: lxor
      // 047: lstore 14
      // 049: pop2
      // 04a: ldc2_w -2088622790226835742
      // 04d: lload 5
      // 04f: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 0
      // 055: aload 3
      // 056: lload 14
      // 058: aload 2
      // 059: aload 7
      // 05b: aload 4
      // 05d: bipush 5
      // 05e: anewarray 234
      // 061: dup_x1
      // 062: swap
      // 063: bipush 4
      // 064: swap
      // 065: aastore
      // 066: dup_x1
      // 067: swap
      // 068: bipush 3
      // 069: swap
      // 06a: aastore
      // 06b: dup_x1
      // 06c: swap
      // 06d: bipush 2
      // 06e: swap
      // 06f: aastore
      // 070: dup_x2
      // 071: dup_x2
      // 072: pop
      // 073: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 076: bipush 1
      // 077: swap
      // 078: aastore
      // 079: dup_x1
      // 07a: swap
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: invokespecial com/zelix/xm.H ([Ljava/lang/Object;)V
      // 081: astore 16
      // 083: aload 0
      // 084: ldc2_w -1784468948162640280
      // 087: lload 5
      // 089: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: aload 16
      // 090: ifnonnull 0bd
      // 093: ifnull 1a0
      // 096: goto 0a4
      // 099: ldc2_w -25032855750402081
      // 09c: lload 5
      // 09e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: ldc2_w -1784468948162640280
      // 0a8: lload 5
      // 0aa: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: goto 0bd
      // 0b2: ldc2_w -25032855750402081
      // 0b5: lload 5
      // 0b7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: athrow
      // 0bd: lload 5
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: ifle 10c
      // 0c4: invokevirtual com/zelix/iu.k ()Z
      // 0c7: aload 16
      // 0c9: ifnonnull 100
      // 0cc: ifeq 1a0
      // 0cf: goto 0dd
      // 0d2: ldc2_w -25032855750402081
      // 0d5: lload 5
      // 0d7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 4
      // 0df: aload 0
      // 0e0: ldc2_w -1784468948162640280
      // 0e3: lload 5
      // 0e5: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: checkcast com/zelix/ig
      // 0ed: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0f2: goto 100
      // 0f5: ldc2_w -25032855750402081
      // 0f8: lload 5
      // 0fa: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: pop
      // 101: aload 0
      // 102: ldc2_w -1784468948162640280
      // 105: lload 5
      // 107: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: lload 12
      // 10e: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 111: astore 17
      // 113: aload 0
      // 114: lload 5
      // 116: lconst_0
      // 117: lcmp
      // 118: iflt 17a
      // 11b: ldc2_w -1784468948162640280
      // 11e: lload 5
      // 120: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: lload 10
      // 127: invokevirtual com/zelix/iu.n (J)Z
      // 12a: aload 16
      // 12c: ifnonnull 178
      // 12f: ifeq 15f
      // 132: goto 140
      // 135: ldc2_w -25032855750402081
      // 138: lload 5
      // 13a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 2
      // 141: aload 17
      // 143: checkcast com/zelix/hy
      // 146: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 14b: pop
      // 14c: aload 16
      // 14e: ifnull 1a0
      // 151: goto 15f
      // 154: ldc2_w -25032855750402081
      // 157: lload 5
      // 159: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 3
      // 160: aload 17
      // 162: checkcast com/zelix/hy
      // 165: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 16a: goto 178
      // 16d: ldc2_w -25032855750402081
      // 170: lload 5
      // 172: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: pop
      // 179: aload 0
      // 17a: aload 17
      // 17c: lload 8
      // 17e: aload 3
      // 17f: bipush 3
      // 180: anewarray 234
      // 183: dup_x1
      // 184: swap
      // 185: bipush 2
      // 186: swap
      // 187: aastore
      // 188: dup_x2
      // 189: dup_x2
      // 18a: pop
      // 18b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18e: bipush 1
      // 18f: swap
      // 190: aastore
      // 191: dup_x1
      // 192: swap
      // 193: bipush 0
      // 194: swap
      // 195: aastore
      // 196: ldc2_w -1790297568528565925
      // 199: lload 5
      // 19b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: return
   }

   public iu J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 3362793047486681087L, var2);
   }

   public void z(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = a ^ var3;
      String var5 = x44.a<"m">(this, -3097791677602849446L, var3).M();
      String var6 = f<"x">(17152, 8346846396867763917L ^ var3) + var2 + var5.substring(var5.indexOf(f<"x">(6989, 5462343905406158467L ^ var3)));
      x44.a<"i">(x44.a<"m">(this, -3097791677602849446L, var3), new Object[]{var6}, -3034460386310261087L, var3);
   }

   private void M(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
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
      // 016: checkcast java/util/Set
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/x4.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 68216758178752
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 55233174663363
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 54348537916924
      // 037: lxor
      // 038: dup2
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 10
      // 03f: dup2
      // 040: bipush 16
      // 042: lshl
      // 043: bipush 32
      // 045: lushr
      // 046: l2i
      // 047: istore 11
      // 049: dup2
      // 04a: bipush 48
      // 04c: lshl
      // 04d: bipush 48
      // 04f: lushr
      // 050: l2i
      // 051: istore 12
      // 053: pop2
      // 054: dup2
      // 055: ldc2_w 82500345590184
      // 058: lxor
      // 059: lstore 13
      // 05b: dup2
      // 05c: ldc2_w 16754123168990
      // 05f: lxor
      // 060: lstore 15
      // 062: pop2
      // 063: ldc2_w 886040618257181098
      // 066: lload 4
      // 068: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aload 0
      // 06e: ldc2_w 1695066289264517086
      // 071: lload 4
      // 073: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: invokevirtual com/zelix/mn.M ()Ljava/lang/String;
      // 07b: bipush 1
      // 07c: anewarray 234
      // 07f: dup_x1
      // 080: swap
      // 081: bipush 0
      // 082: swap
      // 083: aastore
      // 084: ldc2_w 793010556070085220
      // 087: lload 4
      // 089: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: astore 18
      // 090: astore 17
      // 092: aload 18
      // 094: invokevirtual java/lang/String.length ()I
      // 097: bipush 2
      // 098: aload 17
      // 09a: ifnonnull 0f0
      // 09d: if_icmple 24f
      // 0a0: goto 0ae
      // 0a3: ldc2_w 1220318663995781271
      // 0a6: lload 4
      // 0a8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 18
      // 0b0: aload 18
      // 0b2: invokevirtual java/lang/String.length ()I
      // 0b5: bipush 1
      // 0b6: lload 4
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: ifle 10b
      // 0bd: isub
      // 0be: aload 17
      // 0c0: ifnonnull 104
      // 0c3: goto 0d1
      // 0c6: ldc2_w 1220318663995781271
      // 0c9: lload 4
      // 0cb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: invokevirtual java/lang/String.charAt (I)C
      // 0d4: sipush 15886
      // 0d7: ldc2_w 812165585622851904
      // 0da: lload 4
      // 0dc: lxor
      // 0dd: invokedynamic x (IJ)I bsm=com/zelix/x4.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: goto 0f0
      // 0e5: ldc2_w 1220318663995781271
      // 0e8: lload 4
      // 0ea: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: if_icmpne 24f
      // 0f3: aload 18
      // 0f5: bipush 1
      // 0f6: goto 104
      // 0f9: ldc2_w 1220318663995781271
      // 0fc: lload 4
      // 0fe: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 18
      // 106: invokevirtual java/lang/String.length ()I
      // 109: bipush 1
      // 10a: isub
      // 10b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 10e: astore 19
      // 110: aload 19
      // 112: aload 17
      // 114: ifnonnull 141
      // 117: aload 3
      // 118: lload 6
      // 11a: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 11d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 120: ifne 24f
      // 123: goto 131
      // 126: ldc2_w 1220318663995781271
      // 129: lload 4
      // 12b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: aload 19
      // 133: goto 141
      // 136: ldc2_w 1220318663995781271
      // 139: lload 4
      // 13b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 144: astore 20
      // 146: aload 20
      // 148: aload 17
      // 14a: lload 4
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: iflt 169
      // 151: ifnonnull 167
      // 154: ifnull 24f
      // 157: goto 165
      // 15a: ldc2_w 1220318663995781271
      // 15d: lload 4
      // 15f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: aload 20
      // 167: aload 17
      // 169: lload 4
      // 16b: lconst_0
      // 16c: lcmp
      // 16d: iflt 182
      // 170: ifnonnull 1b4
      // 173: lload 15
      // 175: bipush 1
      // 176: anewarray 234
      // 179: dup_x2
      // 17a: dup_x2
      // 17b: pop
      // 17c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17f: bipush 0
      // 180: swap
      // 181: aastore
      // 182: ldc2_w 1047587872164644050
      // 185: lload 4
      // 187: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: ifeq 24f
      // 18f: goto 19d
      // 192: ldc2_w 1220318663995781271
      // 195: lload 4
      // 197: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: aload 3
      // 19e: lload 6
      // 1a0: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 1a3: invokestatic com/zelix/yn.E (Ljava/lang/String;)Lcom/zelix/yn;
      // 1a6: goto 1b4
      // 1a9: ldc2_w 1220318663995781271
      // 1ac: lload 4
      // 1ae: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: astore 21
      // 1b6: aload 21
      // 1b8: ifnull 24f
      // 1bb: sipush 15273
      // 1be: ldc2_w 1516945183356839137
      // 1c1: lload 4
      // 1c3: lxor
      // 1c4: invokedynamic x (IJ)I bsm=com/zelix/x4.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: lload 13
      // 1cb: bipush 2
      // 1cc: anewarray 234
      // 1cf: dup_x2
      // 1d0: dup_x2
      // 1d1: pop
      // 1d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d5: bipush 1
      // 1d6: swap
      // 1d7: aastore
      // 1d8: dup_x1
      // 1d9: swap
      // 1da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1dd: bipush 0
      // 1de: swap
      // 1df: aastore
      // 1e0: ldc2_w 1129239322292193304
      // 1e3: lload 4
      // 1e5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ea: astore 22
      // 1ec: aload 21
      // 1ee: lload 8
      // 1f0: aload 22
      // 1f2: bipush 2
      // 1f3: anewarray 234
      // 1f6: dup_x1
      // 1f7: swap
      // 1f8: bipush 1
      // 1f9: swap
      // 1fa: aastore
      // 1fb: dup_x2
      // 1fc: dup_x2
      // 1fd: pop
      // 1fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 201: bipush 0
      // 202: swap
      // 203: aastore
      // 204: ldc2_w 1348605146125324871
      // 207: lload 4
      // 209: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: aload 22
      // 210: aload 20
      // 212: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 217: aload 17
      // 219: ifnonnull 24e
      // 21c: ifeq 24f
      // 21f: goto 22d
      // 222: ldc2_w 1220318663995781271
      // 225: lload 4
      // 227: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: athrow
      // 22d: aload 2
      // 22e: aload 20
      // 230: iload 10
      // 232: i2s
      // 233: iload 11
      // 235: iload 12
      // 237: i2s
      // 238: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 23b: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 240: goto 24e
      // 243: ldc2_w 1220318663995781271
      // 246: lload 4
      // 248: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: athrow
      // 24e: pop
      // 24f: return
   }

   static {
      long var20 = a ^ 41020096604188L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[19];
      int var16 = 0;
      String var15 = "HÓ\"²\u0015Ô¡Àòh\u008e[\u0082;õß\u0015ô\u00812c\u0091t\u007f\u009aì¤·\u0087D;\u008eÚ@¸èý\u0001±^@:a\u0097²LWZGý¥\u001cÌÝ\u0001ÀÎ®§\u008aÿ\u0013\f\u0097MYYöûml\u0094îk\r³)v\u0006?Å\u0019\u0014«\r(ª©\u0007\u0090DI2\u009f\u0089m¢ô\u008b\u009d>\u0092T\u007fO 3¹\u009cI\u0005\u0007l¤\u001b\u000f!\u0087>p[\u0010ùÝL?\u0081·å\u0018Ý]\u0081\f¹>®\u007f(¦;-BqCT¤\u0096\u0017Ó\u009eò÷\u001e_\u0007\u001f\u009c\u0011¨,ê¯5â\u0087DÃ\u001eÜàX\u0015Y:9³\nV@\rr\u001c8|5ÊltÂ¢/\u008d(Kvî®ç_\u0095\u0091b\u0094\u0092\u0091«½0z\u0086¾BðñV\u0004\u0005ùLH@Ù\u0085-¯\u0017o=Q\u0010\u0090q²ÐÅw\u0001\u0099\u0002ü¢/ 0w\u001f\u001c}ë?\u000b\u0019su´k\u008d¨\u008a\b\u0012Ðõ®\böK/\u0005HY{í ð\u0094\u001du\u0096VâÞ\u008d#¬\u0090Jø\u0010A\u0087c(µ\u0093Ë\u0081\u0092ÙHs\u0003¨ã·¬`\u0085\u0087\u0085BP\u000f6\u0083¸b¹ÞOü?\u000f\u0094î¥÷\u0000\u0003\u000ej¿\u00ad@\u009aÎ!d\u0090ÀÒ<}C_r\u0017¼&6²#Ël\u00052 ¨ó\u0093t\u000b0\u0085ã\u009eôö]a\u00ad\n\u0096a\u0097Ü.\u0090û\u0017Ã\u0094H\u0092Hd\n\u0088¢Øð2Ê¦\u0006\u0087!¤ ðGãCÚ\u0085F\\\u0002â/\u0080r\u0096+ T\u0096\u0010Zeê\u009fé^À¥*\u0084M\u0094\u0003 \u0087¨;\u0004C7\u0015\n7µ\n.go\u000b\u009biù¶YÝ\u0085\u001ae\u0014¿Õ\u0091\u009a\u0011i5@\u0017\u008f\u0095\u008b1§*\u0001Ã\u0006)WkÓÐ.G¶ÝëqÚ7Ñ\u0084@b(Ö¨«\u00959Û°ì@\u00819\u000fÑ|\u0011ás\u009elÄäFä\u0002ïGU»\u009b½\"·»$¬°\u0010#{\\\u0006Þ\u0015`âE\u001d©ÿB\u0089k¤(\u0019\u0013\"$æw\u001bò(ù5 \u0002\u001bÛ°\u0093\tØØ&®\fEq\u0016\u001ce\u001d´\u001fû\u0010\bCv\u0014Ydæ\u0018d¬\u00874 Ïª>\u001b\u0003÷QX\u000eÑ-ú,¹ª7ÓùË@%\b\u008dg¥oàDÌ¹\u0081\u0097r£I,EáËcW\u0085g\u0084\u0084\"P1B}·«Æm\u0080\u0003\u009c¹= \u0096[Ð)k¨\u0090_\u001e]\u0082\u00adK/p÷\u0086\u001b\u0007\u00873¨\u0086ä8i\u009d>¤}-\u0018b[\u0016=úî.V\u0003©\u001bE\u0001{õ÷X,>?\u0006\u009eë£\u008d¿¦¦í!B\u008apAÇ¯¶\u008aÐ\u009fTlý ê\u009añoj\u0010¸Z\u0004¯\u0088#IÜ\u0006)øDlF²t";
      int var17 = "HÓ\"²\u0015Ô¡Àòh\u008e[\u0082;õß\u0015ô\u00812c\u0091t\u007f\u009aì¤·\u0087D;\u008eÚ@¸èý\u0001±^@:a\u0097²LWZGý¥\u001cÌÝ\u0001ÀÎ®§\u008aÿ\u0013\f\u0097MYYöûml\u0094îk\r³)v\u0006?Å\u0019\u0014«\r(ª©\u0007\u0090DI2\u009f\u0089m¢ô\u008b\u009d>\u0092T\u007fO 3¹\u009cI\u0005\u0007l¤\u001b\u000f!\u0087>p[\u0010ùÝL?\u0081·å\u0018Ý]\u0081\f¹>®\u007f(¦;-BqCT¤\u0096\u0017Ó\u009eò÷\u001e_\u0007\u001f\u009c\u0011¨,ê¯5â\u0087DÃ\u001eÜàX\u0015Y:9³\nV@\rr\u001c8|5ÊltÂ¢/\u008d(Kvî®ç_\u0095\u0091b\u0094\u0092\u0091«½0z\u0086¾BðñV\u0004\u0005ùLH@Ù\u0085-¯\u0017o=Q\u0010\u0090q²ÐÅw\u0001\u0099\u0002ü¢/ 0w\u001f\u001c}ë?\u000b\u0019su´k\u008d¨\u008a\b\u0012Ðõ®\böK/\u0005HY{í ð\u0094\u001du\u0096VâÞ\u008d#¬\u0090Jø\u0010A\u0087c(µ\u0093Ë\u0081\u0092ÙHs\u0003¨ã·¬`\u0085\u0087\u0085BP\u000f6\u0083¸b¹ÞOü?\u000f\u0094î¥÷\u0000\u0003\u000ej¿\u00ad@\u009aÎ!d\u0090ÀÒ<}C_r\u0017¼&6²#Ël\u00052 ¨ó\u0093t\u000b0\u0085ã\u009eôö]a\u00ad\n\u0096a\u0097Ü.\u0090û\u0017Ã\u0094H\u0092Hd\n\u0088¢Øð2Ê¦\u0006\u0087!¤ ðGãCÚ\u0085F\\\u0002â/\u0080r\u0096+ T\u0096\u0010Zeê\u009fé^À¥*\u0084M\u0094\u0003 \u0087¨;\u0004C7\u0015\n7µ\n.go\u000b\u009biù¶YÝ\u0085\u001ae\u0014¿Õ\u0091\u009a\u0011i5@\u0017\u008f\u0095\u008b1§*\u0001Ã\u0006)WkÓÐ.G¶ÝëqÚ7Ñ\u0084@b(Ö¨«\u00959Û°ì@\u00819\u000fÑ|\u0011ás\u009elÄäFä\u0002ïGU»\u009b½\"·»$¬°\u0010#{\\\u0006Þ\u0015`âE\u001d©ÿB\u0089k¤(\u0019\u0013\"$æw\u001bò(ù5 \u0002\u001bÛ°\u0093\tØØ&®\fEq\u0016\u001ce\u001d´\u001fû\u0010\bCv\u0014Ydæ\u0018d¬\u00874 Ïª>\u001b\u0003÷QX\u000eÑ-ú,¹ª7ÓùË@%\b\u008dg¥oàDÌ¹\u0081\u0097r£I,EáËcW\u0085g\u0084\u0084\"P1B}·«Æm\u0080\u0003\u009c¹= \u0096[Ð)k¨\u0090_\u001e]\u0082\u00adK/p÷\u0086\u001b\u0007\u00873¨\u0086ä8i\u009d>¤}-\u0018b[\u0016=úî.V\u0003©\u001bE\u0001{õ÷X,>?\u0006\u009eë£\u008d¿¦¦í!B\u008apAÇ¯¶\u008aÐ\u009fTlý ê\u009añoj\u0010¸Z\u0004¯\u0088#IÜ\u0006)øDlF²t"
         .length();
      char var14 = '(';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = c(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     g = var18;
                     h = new String[19];
                     s = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u0010éfÆW3\u00adÃÎq9Î@dM\u009fÎ5\\z}Â&\u0004¥ý¤G\u0093¸\u008bÕ";
                     int var5 = "\u0010éfÆW3\u00adÃÎq9Î@dM\u009fÎ5\\z}Â&\u0004¥ý¤G\u0093¸\u008bÕ".length();
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
                                    o = var6;
                                    q = new Integer[6];
                                    Z = x44.a<"i">(-7425947817878548273L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "HR9£æa\u001e§~²¾ò\u0098R\rë";
                                 var5 = "HR9£æa\u001e§~²¾ò\u0098R\rë".length();
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

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "»»\u001aä#ý6Ú\u009a\u0090\u009a\u0084¼\u008c³f½È¹\\161*Jô^ÀPu\fP)|\tÔ-\u008a|\u007fh\u0014ðÌ\u0003\u0085Ç\u008d¸\u0089ð\f-h\u0014ª¬g\u0084\u009dº§}\u0012\u009e/\u0014\u009eVYÑÓ\u009e.1Ó/ÐpÉK\u001a¦\u0096¬æ\u008f,!]:É\u0095Y\u0082(Sõ=\u008b\u0005¥gº\u0018wä\u0002!þuD\u0017¤'#ÖÌsZæ¶:\u0091Ä1ô\u0010;xÏ\u0082ZJ#¿@P\bÒGh«\u0081ÚOA°õ\u0000:U<¬q\u0004Ef\u008d9mM=C~\u0097ëc\u0094\"¢\u0019GtÕ \u0010¼\u0097\rÞ2<ÕÏ\u0018¡!ÿÜ$\u0089âèì\u009f\t\u0012hHï";
                  var17 = "»»\u001aä#ý6Ú\u009a\u0090\u009a\u0084¼\u008c³f½È¹\\161*Jô^ÀPu\fP)|\tÔ-\u008a|\u007fh\u0014ðÌ\u0003\u0085Ç\u008d¸\u0089ð\f-h\u0014ª¬g\u0084\u009dº§}\u0012\u009e/\u0014\u009eVYÑÓ\u009e.1Ó/ÐpÉK\u001a¦\u0096¬æ\u008f,!]:É\u0095Y\u0082(Sõ=\u008b\u0005¥gº\u0018wä\u0002!þuD\u0017¤'#ÖÌsZæ¶:\u0091Ä1ô\u0010;xÏ\u0082ZJ#¿@P\bÒGh«\u0081ÚOA°õ\u0000:U<¬q\u0004Ef\u008d9mM=C~\u0097ëc\u0094\"¢\u0019GtÕ \u0010¼\u0097\rÞ2<ÕÏ\u0018¡!ÿÜ$\u0089âèì\u009f\t\u0012hHï"
                     .length();
                  var14 = 136;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private iu U(Object[] param1) {
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
      // 00a: lstore 8
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/hz
      // 012: astore 7
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/_fz
      // 01a: astore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Integer
      // 021: astore 10
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/String
      // 029: astore 4
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/_yv
      // 031: astore 5
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/_ug
      // 03a: astore 6
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast com/zelix/ei
      // 043: astore 2
      // 044: pop
      // 045: getstatic com/zelix/x4.a J
      // 048: lload 8
      // 04a: lxor
      // 04b: lstore 8
      // 04d: lload 8
      // 04f: dup2
      // 050: ldc2_w 41593657798182
      // 053: lxor
      // 054: lstore 11
      // 056: dup2
      // 057: ldc2_w 30027064020596
      // 05a: lxor
      // 05b: lstore 13
      // 05d: dup2
      // 05e: ldc2_w 131491001269337
      // 061: lxor
      // 062: dup2
      // 063: bipush 32
      // 065: lushr
      // 066: l2i
      // 067: istore 15
      // 069: dup2
      // 06a: bipush 32
      // 06c: lshl
      // 06d: bipush 48
      // 06f: lushr
      // 070: l2i
      // 071: istore 16
      // 073: dup2
      // 074: bipush 48
      // 076: lshl
      // 077: bipush 48
      // 079: lushr
      // 07a: l2i
      // 07b: istore 17
      // 07d: pop2
      // 07e: dup2
      // 07f: ldc2_w 96756471959720
      // 082: lxor
      // 083: lstore 18
      // 085: dup2
      // 086: ldc2_w 106357572531842
      // 089: lxor
      // 08a: lstore 20
      // 08c: dup2
      // 08d: ldc2_w 107510002102413
      // 090: lxor
      // 091: lstore 22
      // 093: dup2
      // 094: ldc2_w 93266474682762
      // 097: lxor
      // 098: dup2
      // 099: bipush 32
      // 09b: lushr
      // 09c: l2i
      // 09d: istore 24
      // 09f: dup2
      // 0a0: bipush 32
      // 0a2: lshl
      // 0a3: bipush 48
      // 0a5: lushr
      // 0a6: l2i
      // 0a7: istore 25
      // 0a9: dup2
      // 0aa: bipush 48
      // 0ac: lshl
      // 0ad: bipush 48
      // 0af: lushr
      // 0b0: l2i
      // 0b1: istore 26
      // 0b3: pop2
      // 0b4: pop2
      // 0b5: ldc2_w -7926339215144061922
      // 0b8: lload 8
      // 0ba: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: lload 18
      // 0c1: bipush 1
      // 0c2: anewarray 234
      // 0c5: dup_x2
      // 0c6: dup_x2
      // 0c7: pop
      // 0c8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cb: bipush 0
      // 0cc: swap
      // 0cd: aastore
      // 0ce: ldc2_w -8021884835261834912
      // 0d1: lload 8
      // 0d3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: astore 28
      // 0da: astore 27
      // 0dc: aload 7
      // 0de: lload 13
      // 0e0: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 0e3: astore 29
      // 0e5: aload 7
      // 0e7: astore 30
      // 0e9: aconst_null
      // 0ea: astore 32
      // 0ec: aload 32
      // 0ee: ifnonnull 20c
      // 0f1: aload 30
      // 0f3: aload 27
      // 0f5: lload 8
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: iflt 101
      // 0fc: ifnonnull 22d
      // 0ff: aload 27
      // 101: lload 8
      // 103: lconst_0
      // 104: lcmp
      // 105: ifle 12e
      // 108: ifnonnull 12c
      // 10b: goto 119
      // 10e: ldc2_w -8260916621709611741
      // 111: lload 8
      // 113: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: ifnull 20c
      // 11c: goto 12a
      // 11f: ldc2_w -8260916621709611741
      // 122: lload 8
      // 124: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: aload 30
      // 12c: aload 27
      // 12e: lload 8
      // 130: lconst_0
      // 131: lcmp
      // 132: ifle 162
      // 135: ifnonnull 15e
      // 138: lload 22
      // 13a: invokevirtual com/zelix/hz.K (J)Z
      // 13d: ifeq 16f
      // 140: goto 14e
      // 143: ldc2_w -8260916621709611741
      // 146: lload 8
      // 148: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 30
      // 150: goto 15e
      // 153: ldc2_w -8260916621709611741
      // 156: lload 8
      // 158: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: bipush 0
      // 15f: anewarray 234
      // 162: ldc2_w -7626215643338299135
      // 165: lload 8
      // 167: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: goto 171
      // 16f: aload 10
      // 171: astore 31
      // 173: lload 11
      // 175: aload 30
      // 177: aload 3
      // 178: aload 5
      // 17a: bipush 4
      // 17b: anewarray 234
      // 17e: dup_x1
      // 17f: swap
      // 180: bipush 3
      // 181: swap
      // 182: aastore
      // 183: dup_x1
      // 184: swap
      // 185: bipush 2
      // 186: swap
      // 187: aastore
      // 188: dup_x1
      // 189: swap
      // 18a: bipush 1
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x2
      // 18e: dup_x2
      // 18f: pop
      // 190: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 193: bipush 0
      // 194: swap
      // 195: aastore
      // 196: ldc2_w -8315354579781137682
      // 199: lload 8
      // 19b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: astore 32
      // 1a2: aload 28
      // 1a4: aload 30
      // 1a6: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 1a9: pop
      // 1aa: aload 30
      // 1ac: iload 24
      // 1ae: iload 25
      // 1b0: iload 26
      // 1b2: i2c
      // 1b3: invokevirtual com/zelix/hz.O (IIC)Ljava/lang/String;
      // 1b6: astore 33
      // 1b8: aload 27
      // 1ba: lload 8
      // 1bc: lconst_0
      // 1bd: lcmp
      // 1be: iflt 209
      // 1c1: ifnonnull 207
      // 1c4: aload 33
      // 1c6: ifnonnull 1f1
      // 1c9: goto 1d7
      // 1cc: ldc2_w -8260916621709611741
      // 1cf: lload 8
      // 1d1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: lload 8
      // 1d9: lconst_0
      // 1da: lcmp
      // 1db: ifle 20c
      // 1de: aload 27
      // 1e0: ifnull 20c
      // 1e3: goto 1f1
      // 1e6: ldc2_w -8260916621709611741
      // 1e9: lload 8
      // 1eb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: aload 6
      // 1f3: aload 33
      // 1f5: aload 31
      // 1f7: aload 4
      // 1f9: iload 15
      // 1fb: aload 2
      // 1fc: iload 16
      // 1fe: i2s
      // 1ff: iload 17
      // 201: i2s
      // 202: invokevirtual com/zelix/_ug.h (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILcom/zelix/ei;SS)Lcom/zelix/hz;
      // 205: astore 30
      // 207: aload 27
      // 209: ifnull 0ec
      // 20c: aload 32
      // 20e: lload 8
      // 210: lconst_0
      // 211: lcmp
      // 212: iflt 231
      // 215: aload 27
      // 217: ifnonnull 368
      // 21a: ifnonnull 35f
      // 21d: goto 22b
      // 220: ldc2_w -8260916621709611741
      // 223: lload 8
      // 225: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: athrow
      // 22b: aload 7
      // 22d: astore 30
      // 22f: aload 32
      // 231: ifnonnull 35f
      // 234: aload 30
      // 236: aload 27
      // 238: lload 8
      // 23a: lconst_0
      // 23b: lcmp
      // 23c: ifle 257
      // 23f: ifnonnull 255
      // 242: ifnull 35f
      // 245: goto 253
      // 248: ldc2_w -8260916621709611741
      // 24b: lload 8
      // 24d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: aload 30
      // 255: aload 27
      // 257: lload 8
      // 259: lconst_0
      // 25a: lcmp
      // 25b: ifle 2a3
      // 25e: ifnonnull 2c2
      // 261: aload 3
      // 262: aload 10
      // 264: aload 5
      // 266: aload 6
      // 268: aload 28
      // 26a: aload 4
      // 26c: lload 20
      // 26e: aload 2
      // 26f: bipush 9
      // 271: anewarray 234
      // 274: dup_x1
      // 275: swap
      // 276: bipush 8
      // 278: swap
      // 279: aastore
      // 27a: dup_x2
      // 27b: dup_x2
      // 27c: pop
      // 27d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 280: bipush 7
      // 282: swap
      // 283: aastore
      // 284: dup_x1
      // 285: swap
      // 286: bipush 6
      // 288: swap
      // 289: aastore
      // 28a: dup_x1
      // 28b: swap
      // 28c: bipush 5
      // 28d: swap
      // 28e: aastore
      // 28f: dup_x1
      // 290: swap
      // 291: bipush 4
      // 292: swap
      // 293: aastore
      // 294: dup_x1
      // 295: swap
      // 296: bipush 3
      // 297: swap
      // 298: aastore
      // 299: dup_x1
      // 29a: swap
      // 29b: bipush 2
      // 29c: swap
      // 29d: aastore
      // 29e: dup_x1
      // 29f: swap
      // 2a0: bipush 1
      // 2a1: swap
      // 2a2: aastore
      // 2a3: dup_x1
      // 2a4: swap
      // 2a5: bipush 0
      // 2a6: swap
      // 2a7: aastore
      // 2a8: ldc2_w -7542655606765796118
      // 2ab: lload 8
      // 2ad: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: astore 32
      // 2b4: aload 32
      // 2b6: lload 8
      // 2b8: lconst_0
      // 2b9: lcmp
      // 2ba: iflt 231
      // 2bd: ifnonnull 22f
      // 2c0: aload 30
      // 2c2: iload 24
      // 2c4: iload 25
      // 2c6: iload 26
      // 2c8: i2c
      // 2c9: invokevirtual com/zelix/hz.O (IIC)Ljava/lang/String;
      // 2cc: astore 33
      // 2ce: lload 8
      // 2d0: lconst_0
      // 2d1: lcmp
      // 2d2: ifle 2ed
      // 2d5: aload 33
      // 2d7: ifnonnull 2ed
      // 2da: aload 27
      // 2dc: ifnull 35f
      // 2df: goto 2ed
      // 2e2: ldc2_w -8260916621709611741
      // 2e5: lload 8
      // 2e7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ec: athrow
      // 2ed: aload 30
      // 2ef: aload 27
      // 2f1: lload 8
      // 2f3: lconst_0
      // 2f4: lcmp
      // 2f5: ifle 333
      // 2f8: ifnonnull 32f
      // 2fb: goto 309
      // 2fe: ldc2_w -8260916621709611741
      // 301: lload 8
      // 303: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: athrow
      // 309: lload 22
      // 30b: invokevirtual com/zelix/hz.K (J)Z
      // 30e: ifeq 340
      // 311: goto 31f
      // 314: ldc2_w -8260916621709611741
      // 317: lload 8
      // 319: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: athrow
      // 31f: aload 30
      // 321: goto 32f
      // 324: ldc2_w -8260916621709611741
      // 327: lload 8
      // 329: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32e: athrow
      // 32f: bipush 0
      // 330: anewarray 234
      // 333: ldc2_w -7626215643338299135
      // 336: lload 8
      // 338: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: goto 342
      // 340: aload 10
      // 342: astore 31
      // 344: aload 6
      // 346: aload 33
      // 348: aload 31
      // 34a: aload 4
      // 34c: iload 15
      // 34e: aload 2
      // 34f: iload 16
      // 351: i2s
      // 352: iload 17
      // 354: i2s
      // 355: invokevirtual com/zelix/_ug.h (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILcom/zelix/ei;SS)Lcom/zelix/hz;
      // 358: astore 30
      // 35a: aload 27
      // 35c: ifnull 22f
      // 35f: lload 8
      // 361: lconst_0
      // 362: lcmp
      // 363: iflt 2b4
      // 366: aload 32
      // 368: areturn
   }

   public void V(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 7
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 5
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 2
      // 02a: pop
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 107770572705674
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 2249279176069
      // 038: lxor
      // 039: lstore 10
      // 03b: dup2
      // 03c: ldc2_w 103974721668254
      // 03f: lxor
      // 040: lstore 12
      // 042: dup2
      // 043: ldc2_w 80347982157941
      // 046: lxor
      // 047: lstore 14
      // 049: dup2
      // 04a: ldc2_w 0
      // 04d: lxor
      // 04e: lstore 16
      // 050: dup2
      // 051: ldc2_w 15266846731978
      // 054: lxor
      // 055: lstore 18
      // 057: pop2
      // 058: ldc2_w -8070022608367716896
      // 05b: lload 5
      // 05d: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: aload 0
      // 063: aload 4
      // 065: aload 3
      // 066: aload 7
      // 068: lload 16
      // 06a: aload 2
      // 06b: bipush 5
      // 06c: anewarray 234
      // 06f: dup_x1
      // 070: swap
      // 071: bipush 4
      // 072: swap
      // 073: aastore
      // 074: dup_x2
      // 075: dup_x2
      // 076: pop
      // 077: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07a: bipush 3
      // 07b: swap
      // 07c: aastore
      // 07d: dup_x1
      // 07e: swap
      // 07f: bipush 2
      // 080: swap
      // 081: aastore
      // 082: dup_x1
      // 083: swap
      // 084: bipush 1
      // 085: swap
      // 086: aastore
      // 087: dup_x1
      // 088: swap
      // 089: bipush 0
      // 08a: swap
      // 08b: aastore
      // 08c: invokespecial com/zelix/xm.V ([Ljava/lang/Object;)V
      // 08f: astore 20
      // 091: aload 0
      // 092: ldc2_w -7764637450849389206
      // 095: lload 5
      // 097: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: aload 20
      // 09e: ifnonnull 0dd
      // 0a1: ifnull 1a2
      // 0a4: goto 0b2
      // 0a7: ldc2_w -8312187703925347107
      // 0aa: lload 5
      // 0ac: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 2
      // 0b3: aload 0
      // 0b4: ldc2_w -7764637450849389206
      // 0b7: lload 5
      // 0b9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0c3: pop
      // 0c4: aload 0
      // 0c5: ldc2_w -7764637450849389206
      // 0c8: lload 5
      // 0ca: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: goto 0dd
      // 0d2: ldc2_w -8312187703925347107
      // 0d5: lload 5
      // 0d7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: lload 14
      // 0df: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 0e2: astore 21
      // 0e4: aload 21
      // 0e6: lload 8
      // 0e8: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 0eb: lload 18
      // 0ed: dup2_x1
      // 0ee: pop2
      // 0ef: invokestatic com/zelix/yn.B (JLjava/lang/String;)Z
      // 0f2: aload 20
      // 0f4: lload 5
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 12f
      // 0fb: ifnonnull 12d
      // 0fe: ifne 1a2
      // 101: goto 10f
      // 104: ldc2_w -8312187703925347107
      // 107: lload 5
      // 109: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 0
      // 110: ldc2_w -7764637450849389206
      // 113: lload 5
      // 115: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: lload 12
      // 11c: invokevirtual com/zelix/iu.n (J)Z
      // 11f: goto 12d
      // 122: ldc2_w -8312187703925347107
      // 125: lload 5
      // 127: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: aload 20
      // 12f: ifnonnull 179
      // 132: ifeq 162
      // 135: goto 143
      // 138: ldc2_w -8312187703925347107
      // 13b: lload 5
      // 13d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: aload 3
      // 144: aload 21
      // 146: checkcast com/zelix/hy
      // 149: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 14e: pop
      // 14f: aload 20
      // 151: ifnull 1a2
      // 154: goto 162
      // 157: ldc2_w -8312187703925347107
      // 15a: lload 5
      // 15c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: aload 4
      // 164: aload 21
      // 166: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 16b: goto 179
      // 16e: ldc2_w -8312187703925347107
      // 171: lload 5
      // 173: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: pop
      // 17a: aload 0
      // 17b: aload 21
      // 17d: lload 10
      // 17f: aload 4
      // 181: bipush 3
      // 182: anewarray 234
      // 185: dup_x1
      // 186: swap
      // 187: bipush 2
      // 188: swap
      // 189: aastore
      // 18a: dup_x2
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 190: bipush 1
      // 191: swap
      // 192: aastore
      // 193: dup_x1
      // 194: swap
      // 195: bipush 0
      // 196: swap
      // 197: aastore
      // 198: ldc2_w -7771620544465892775
      // 19b: lload 5
      // 19d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: return
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14514;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/x4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/x4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int f(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24132;
      if (q[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/x4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/x4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
