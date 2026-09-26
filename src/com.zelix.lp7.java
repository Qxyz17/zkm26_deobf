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

public class lp7 extends lyn {
   int o;
   private static final long a = prr.a(-1330780979653312929L, -3146452803293209587L, MethodHandles.lookup().lookupClass()).a(170987554074147L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g = new HashMap(13);
   private static final long[] k;
   private static final Integer[] n;
   private static final Map p;
   private static final long[] q;
   private static final Long[] s;
   private static final Map t;

   public void M(Object[] param1) {
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
      // 004: checkcast com/zelix/lmu
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/lqu
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 74673965963454
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 29166006246517
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 0
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 70974204760313
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 48832956100528
      // 03d: lxor
      // 03e: lstore 14
      // 040: dup2
      // 041: ldc2_w 78419313187334
      // 044: lxor
      // 045: lstore 16
      // 047: pop2
      // 048: aload 0
      // 049: lload 16
      // 04b: bipush 1
      // 04c: anewarray 355
      // 04f: dup_x2
      // 050: dup_x2
      // 051: pop
      // 052: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 055: bipush 0
      // 056: swap
      // 057: aastore
      // 058: ldc2_w -4972914505230991179
      // 05b: lload 4
      // 05d: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: istore 19
      // 064: aload 3
      // 065: lload 14
      // 067: bipush 1
      // 068: anewarray 355
      // 06b: dup_x2
      // 06c: dup_x2
      // 06d: pop
      // 06e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 071: bipush 0
      // 072: swap
      // 073: aastore
      // 074: ldc2_w -6410373196425327712
      // 077: lload 4
      // 079: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: istore 20
      // 080: ldc2_w -6823249310977527178
      // 083: lload 4
      // 085: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: aload 3
      // 08b: lload 6
      // 08d: bipush 1
      // 08e: anewarray 355
      // 091: dup_x2
      // 092: dup_x2
      // 093: pop
      // 094: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 097: bipush 0
      // 098: swap
      // 099: aastore
      // 09a: ldc2_w -5092376014320582940
      // 09d: lload 4
      // 09f: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: istore 21
      // 0a6: istore 18
      // 0a8: aload 3
      // 0a9: lload 12
      // 0ab: bipush 1
      // 0ac: anewarray 355
      // 0af: dup_x2
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w -5139488470093813520
      // 0bb: lload 4
      // 0bd: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: istore 22
      // 0c4: iload 19
      // 0c6: bipush 1
      // 0c7: if_icmpne 19d
      // 0ca: aload 0
      // 0cb: bipush 0
      // 0cc: invokevirtual com/zelix/lp7.V (I)Lcom/zelix/lmu;
      // 0cf: checkcast com/zelix/lwm
      // 0d2: astore 23
      // 0d4: aload 23
      // 0d6: aload 0
      // 0d7: aload 3
      // 0d8: lload 10
      // 0da: bipush 3
      // 0db: anewarray 355
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 2
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: bipush 1
      // 0ea: swap
      // 0eb: aastore
      // 0ec: dup_x1
      // 0ed: swap
      // 0ee: bipush 0
      // 0ef: swap
      // 0f0: aastore
      // 0f1: ldc2_w -4983248947017682808
      // 0f4: lload 4
      // 0f6: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: aload 23
      // 0fd: bipush 0
      // 0fe: anewarray 355
      // 101: ldc2_w -4968184746715213117
      // 104: lload 4
      // 106: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: astore 24
      // 10d: aload 0
      // 10e: aload 24
      // 110: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 113: ldc2_w -4674541197781312014
      // 116: lload 4
      // 118: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: goto 191
      // 120: astore 25
      // 122: aload 0
      // 123: sipush 15116
      // 126: ldc2_w 8032625294883207037
      // 129: lload 4
      // 12b: lxor
      // 12c: invokedynamic w (IJ)I bsm=com/zelix/lp7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: ldc2_w -4674541197781312014
      // 134: lload 4
      // 136: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: aload 0
      // 13c: iload 18
      // 13e: lload 4
      // 140: lconst_0
      // 141: lcmp
      // 142: iflt 187
      // 145: ifne 179
      // 148: ldc2_w -4674541197781312014
      // 14b: lload 4
      // 14d: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: lload 4
      // 154: lconst_0
      // 155: lcmp
      // 156: ifle 19a
      // 159: ifge 191
      // 15c: goto 16a
      // 15f: ldc2_w -6633427101474247155
      // 162: lload 4
      // 164: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 0
      // 16b: goto 179
      // 16e: ldc2_w -6633427101474247155
      // 171: lload 4
      // 173: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: sipush 6292
      // 17c: ldc2_w 1464682422493648100
      // 17f: lload 4
      // 181: lxor
      // 182: invokedynamic w (IJ)I bsm=com/zelix/lp7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 187: ldc2_w -4674541197781312014
      // 18a: lload 4
      // 18c: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: lload 4
      // 193: lconst_0
      // 194: lcmp
      // 195: iflt 202
      // 198: iload 18
      // 19a: ifeq 1c4
      // 19d: aload 0
      // 19e: sipush 6292
      // 1a1: ldc2_w 1464682422493648100
      // 1a4: lload 4
      // 1a6: lxor
      // 1a7: invokedynamic w (IJ)I bsm=com/zelix/lp7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: ldc2_w -4674541197781312014
      // 1af: lload 4
      // 1b1: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: goto 1c4
      // 1b9: ldc2_w -6633427101474247155
      // 1bc: lload 4
      // 1be: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: aload 3
      // 1c6: iload 20
      // 1c8: lload 8
      // 1ca: iload 21
      // 1cc: iload 22
      // 1ce: bipush 5
      // 1cf: anewarray 355
      // 1d2: dup_x1
      // 1d3: swap
      // 1d4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d7: bipush 4
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x1
      // 1db: swap
      // 1dc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1df: bipush 3
      // 1e0: swap
      // 1e1: aastore
      // 1e2: dup_x2
      // 1e3: dup_x2
      // 1e4: pop
      // 1e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e8: bipush 2
      // 1e9: swap
      // 1ea: aastore
      // 1eb: dup_x1
      // 1ec: swap
      // 1ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f0: bipush 1
      // 1f1: swap
      // 1f2: aastore
      // 1f3: dup_x1
      // 1f4: swap
      // 1f5: bipush 0
      // 1f6: swap
      // 1f7: aastore
      // 1f8: ldc2_w -6545384257220678841
      // 1fb: lload 4
      // 1fd: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: return
   }

   public lp7(int var1, char var2, int var3, short var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 129137397076047L;
      super(var7, var3);
   }

   protected void m(Object[] param1) {
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
      // 004: checkcast com/zelix/lqu
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 5
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 3
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/Integer
      // 02e: invokevirtual java/lang/Integer.intValue ()I
      // 031: istore 7
      // 033: pop
      // 034: lload 5
      // 036: dup2
      // 037: ldc2_w 41228634740897
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 32452763901518
      // 041: lxor
      // 042: lstore 10
      // 044: pop2
      // 045: aload 4
      // 047: lload 8
      // 049: bipush 1
      // 04a: anewarray 355
      // 04d: dup_x2
      // 04e: dup_x2
      // 04f: pop
      // 050: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 053: bipush 0
      // 054: swap
      // 055: aastore
      // 056: ldc2_w -4963623474998811189
      // 059: lload 5
      // 05b: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: astore 13
      // 062: ldc2_w -6521875426121538117
      // 065: lload 5
      // 067: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: new java/lang/StringBuilder
      // 06f: dup
      // 070: invokespecial java/lang/StringBuilder.<init> ()V
      // 073: lload 10
      // 075: bipush 1
      // 076: anewarray 355
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: ldc2_w -6429108569517432985
      // 085: lload 5
      // 087: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08f: sipush 31024
      // 092: ldc2_w 8358624978525437542
      // 095: lload 5
      // 097: lxor
      // 098: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a3: astore 14
      // 0a5: aload 13
      // 0a7: aload 14
      // 0a9: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 0ac: ldc2_w -6626972079646401238
      // 0af: lload 5
      // 0b1: invokedynamic i (JJ)Ljava/io/PrintStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: aload 14
      // 0b8: ldc2_w -4650195723326610078
      // 0bb: lload 5
      // 0bd: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: istore 12
      // 0c4: ldc2_w -4992281869728831884
      // 0c7: lload 5
      // 0c9: invokedynamic m (JJ)Ljava/lang/Runtime; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: astore 15
      // 0d0: aload 15
      // 0d2: ldc2_w -6695499469126477580
      // 0d5: lload 5
      // 0d7: invokedynamic r (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: aload 15
      // 0de: ldc2_w -6516014803665300792
      // 0e1: lload 5
      // 0e3: invokedynamic r (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: lsub
      // 0e9: l2i
      // 0ea: sipush 31761
      // 0ed: ldc2_w 5591771160781384726
      // 0f0: lload 5
      // 0f2: lxor
      // 0f3: invokedynamic w (IJ)I bsm=com/zelix/lp7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: idiv
      // 0f9: istore 16
      // 0fb: aload 15
      // 0fd: ldc2_w -6537584437285133089
      // 100: lload 5
      // 102: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: aload 4
      // 109: ldc2_w -5058169403218336890
      // 10c: lload 5
      // 10e: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: iload 12
      // 115: ifeq 181
      // 118: ifeq 176
      // 11b: goto 129
      // 11e: ldc2_w -4646501277128412552
      // 121: lload 5
      // 123: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: aload 13
      // 12b: new java/lang/StringBuilder
      // 12e: dup
      // 12f: invokespecial java/lang/StringBuilder.<init> ()V
      // 132: sipush 9505
      // 135: ldc2_w 2400507098701193842
      // 138: lload 5
      // 13a: lxor
      // 13b: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: aload 0
      // 144: ldc2_w -6677242810399080057
      // 147: lload 5
      // 149: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 151: sipush 2908
      // 154: ldc2_w 8298388179883412491
      // 157: lload 5
      // 159: lxor
      // 15a: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 162: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 165: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 168: goto 176
      // 16b: ldc2_w -4646501277128412552
      // 16e: lload 5
      // 170: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 0
      // 177: ldc2_w -6677242810399080057
      // 17a: lload 5
      // 17c: invokedynamic s (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: i2l
      // 182: ldc2_w -5022287330949168927
      // 185: lload 5
      // 187: invokedynamic m (JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: goto 191
      // 18f: astore 17
      // 191: aload 15
      // 193: ldc2_w -6695499469126477580
      // 196: lload 5
      // 198: invokedynamic r (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: aload 15
      // 19f: ldc2_w -6516014803665300792
      // 1a2: lload 5
      // 1a4: invokedynamic r (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: lsub
      // 1aa: l2i
      // 1ab: sipush 16179
      // 1ae: ldc2_w 57918260494085941
      // 1b1: lload 5
      // 1b3: lxor
      // 1b4: invokedynamic w (IJ)I bsm=com/zelix/lp7.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: idiv
      // 1ba: istore 17
      // 1bc: aload 15
      // 1be: ldc2_w -6912809254724167001
      // 1c1: lload 5
      // 1c3: invokedynamic r (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: lstore 18
      // 1ca: iload 12
      // 1cc: lload 5
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: iflt 28a
      // 1d3: ifeq 281
      // 1d6: lload 18
      // 1d8: sipush 8421
      // 1db: ldc2_w 6744843270768855740
      // 1de: lload 5
      // 1e0: lxor
      // 1e1: invokedynamic o (IJ)J bsm=com/zelix/lp7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: lcmp
      // 1e7: ifle 28d
      // 1ea: goto 1f8
      // 1ed: ldc2_w -4646501277128412552
      // 1f0: lload 5
      // 1f2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: aload 13
      // 1fa: new java/lang/StringBuilder
      // 1fd: dup
      // 1fe: invokespecial java/lang/StringBuilder.<init> ()V
      // 201: sipush 29970
      // 204: ldc2_w 8204449902692250182
      // 207: lload 5
      // 209: lxor
      // 20a: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 212: lload 18
      // 214: sipush 8480
      // 217: ldc2_w 7142135529576041336
      // 21a: lload 5
      // 21c: lxor
      // 21d: invokedynamic o (IJ)J bsm=com/zelix/lp7.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: ldiv
      // 223: ldc2_w -4819058318632373161
      // 226: lload 5
      // 228: invokedynamic r (Ljava/lang/Object;JJJ)Ljava/lang/StringBuilder; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: sipush 21383
      // 230: ldc2_w 2889717972041241810
      // 233: lload 5
      // 235: lxor
      // 236: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23e: iload 17
      // 240: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 243: sipush 15450
      // 246: ldc2_w 3902937554538330890
      // 249: lload 5
      // 24b: lxor
      // 24c: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 254: iload 17
      // 256: iload 16
      // 258: isub
      // 259: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 25c: sipush 11629
      // 25f: ldc2_w 8777136034228431423
      // 262: lload 5
      // 264: lxor
      // 265: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 270: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 273: goto 281
      // 276: ldc2_w -4646501277128412552
      // 279: lload 5
      // 27b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: athrow
      // 281: lload 5
      // 283: lconst_0
      // 284: lcmp
      // 285: ifle 2d0
      // 288: iload 12
      // 28a: ifne 2de
      // 28d: aload 13
      // 28f: new java/lang/StringBuilder
      // 292: dup
      // 293: invokespecial java/lang/StringBuilder.<init> ()V
      // 296: ldc "\t"
      // 298: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29b: iload 17
      // 29d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2a0: sipush 22110
      // 2a3: ldc2_w 5416751394063782148
      // 2a6: lload 5
      // 2a8: lxor
      // 2a9: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b1: iload 17
      // 2b3: iload 16
      // 2b5: isub
      // 2b6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2b9: sipush 11260
      // 2bc: ldc2_w 8835531415084559527
      // 2bf: lload 5
      // 2c1: lxor
      // 2c2: invokedynamic y (IJ)Ljava/lang/String; bsm=com/zelix/lp7.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ca: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2cd: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2d0: goto 2de
      // 2d3: ldc2_w -4646501277128412552
      // 2d6: lload 5
      // 2d8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: athrow
      // 2de: return
   }

   public String N(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"y">(8499, 5353777368774385709L ^ var2);
   }

   static {
      long var22 = a ^ 9984131462633L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[10];
      int var29 = 0;
      String var28 = "-\u0086ë,Ëí·Ò\u00adS\u0096Cw\u000e4\u0095 1ºÈ\u00ad·³wòÎË§å6]\u001c±Õ\u008a\u0084\u0017S\u0002´´iÙiLàÌÂ\u009e(µ\u0010ô,\u008eåx~\u0083³×Ïâ\u0001³åL\u0019A`ãO\u008eÅ\u0099\u0083\u0011£\u0002\u0099,eC\u009e\u0096õ\u0086ï\u0083\u0093\u0010^!Ç5rÇÅÿ\u0013*à=/#\u0013ö(û\u001bu\u001b{\u00886î\u001dùF÷\u008fz\u008cùô\"pþ\u0085$Èif}iÅöðÇµÃ`[ú\u0091Øïñ\u0018\u001dð\u008dûûÁÆ²Å'WÆ/,£å\u0092_Uk\t@\u0094Á(2auø8h[\u0011\u008a\u0018\u0096\u0000\u0015ÞðïS\u0016dr6ëå(=\u0093\u0088\fÐbá\u008eý\u0005\u0085 q\r®P\u0018y <,c\u0003\u0016å\u009f\u0083w\u0091t=rU$«Ba`ù3]";
      int var30 = "-\u0086ë,Ëí·Ò\u00adS\u0096Cw\u000e4\u0095 1ºÈ\u00ad·³wòÎË§å6]\u001c±Õ\u008a\u0084\u0017S\u0002´´iÙiLàÌÂ\u009e(µ\u0010ô,\u008eåx~\u0083³×Ïâ\u0001³åL\u0019A`ãO\u008eÅ\u0099\u0083\u0011£\u0002\u0099,eC\u009e\u0096õ\u0086ï\u0083\u0093\u0010^!Ç5rÇÅÿ\u0013*à=/#\u0013ö(û\u001bu\u001b{\u00886î\u001dùF÷\u008fz\u008cùô\"pþ\u0085$Èif}iÅöðÇµÃ`[ú\u0091Øïñ\u0018\u001dð\u008dûûÁÆ²Å'WÆ/,£å\u0092_Uk\t@\u0094Á(2auø8h[\u0011\u008a\u0018\u0096\u0000\u0015ÞðïS\u0016dr6ëå(=\u0093\u0088\fÐbá\u008eý\u0005\u0085 q\r®P\u0018y <,c\u0003\u0016å\u009f\u0083w\u0091t=rU$«Ba`ù3]"
         .length();
      char var27 = 16;
      int var35 = -1;

      label72:
      while (true) {
         String var36 = var28.substring(++var35, var35 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = c(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     e = var31;
                     f = new String[10];
                     p = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[4];
                     int var14 = 0;
                     String var15 = "wqT\u0013\u000f¶\u008bäï\u0094iQI\u001c\u009aÕ";
                     int var16 = "wqT\u0013\u000f¶\u008bäï\u0094iQI\u001c\u009aÕ".length();
                     byte var13 = 0;

                     label54:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var54 = ((long)var18[0] & 255L) << 56
                           | ((long)var18[1] & 255L) << 48
                           | ((long)var18[2] & 255L) << 40
                           | ((long)var18[3] & 255L) << 32
                           | ((long)var18[4] & 255L) << 24
                           | ((long)var18[5] & 255L) << 16
                           | ((long)var18[6] & 255L) << 8
                           | (long)var18[7] & 255L;
                        byte var58 = -1;

                        while (true) {
                           long var19 = var54;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)((int)(var19 >>> 56)),
                                 (byte)((int)(var19 >>> 48)),
                                 (byte)((int)(var19 >>> 40)),
                                 (byte)((int)(var19 >>> 32)),
                                 (byte)((int)(var19 >>> 24)),
                                 (byte)((int)(var19 >>> 16)),
                                 (byte)((int)(var19 >>> 8)),
                                 (byte)((int)var19)
                              }
                           );
                           long var62 = ((long)var21[0] & 255L) << 56
                              | ((long)var21[1] & 255L) << 48
                              | ((long)var21[2] & 255L) << 40
                              | ((long)var21[3] & 255L) << 32
                              | ((long)var21[4] & 255L) << 24
                              | ((long)var21[5] & 255L) << 16
                              | ((long)var21[6] & 255L) << 8
                              | (long)var21[7] & 255L;
                           switch (var58) {
                              case 0:
                                 var39[var10001] = var62;
                                 if (var13 >= var16) {
                                    k = var17;
                                    n = new Integer[4];
                                    t = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "þ-\u000fÄ\u0005*¬ý\u0005{Qêeèrt";
                                    int var5 = "þ-\u000fÄ\u0005*¬ý\u0005{Qêeèrt".length();
                                    byte var2 = 0;

                                    do {
                                       int var47 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                                       var47 = var3++;
                                       long var8 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
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
                                       var62 = ((long)var10[0] & 255L) << 56
                                          | ((long)var10[1] & 255L) << 48
                                          | ((long)var10[2] & 255L) << 40
                                          | ((long)var10[3] & 255L) << 32
                                          | ((long)var10[4] & 255L) << 24
                                          | ((long)var10[5] & 255L) << 16
                                          | ((long)var10[6] & 255L) << 8
                                          | (long)var10[7] & 255L;
                                       byte var61 = -1;
                                       var6[var47] = var62;
                                    } while (var2 < var5);

                                    q = var6;
                                    s = new Long[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "£\u0097\u008f¯½ës\u001a\u009a \u00047\u00816\u0001ý";
                                 var16 = "£\u0097\u008f¯½ës\u001a\u009a \u00047\u00816\u0001ý".length();
                                 var13 = 0;
                           }

                           byte var46 = var13;
                           var13 += 8;
                           var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var54 = ((long)var18[0] & 255L) << 56
                              | ((long)var18[1] & 255L) << 48
                              | ((long)var18[2] & 255L) << 40
                              | ((long)var18[3] & 255L) << 32
                              | ((long)var18[4] & 255L) << 24
                              | ((long)var18[5] & 255L) << 16
                              | ((long)var18[6] & 255L) << 8
                              | (long)var18[7] & 255L;
                           var58 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label72;
                  }

                  var28 = "Þ\u0084dXhÆ\u001aç¥º{T\u0001\u008b\u009aIª9\u008bK¢\u0006ç\u0087àê\n£,üP\u0092bY2Êª£\u00029\u0010ôúp\u001aÖÀ\u0012«L\u0003¢\\\u009d¼ \u0014";
                  var30 = "Þ\u0084dXhÆ\u001aç¥º{T\u0001\u008b\u009aIª9\u008bK¢\u0006ç\u0087àê\n£,üP\u0092bY2Êª£\u00029\u0010ôúp\u001aÖÀ\u0012«L\u0003¢\\\u009d¼ \u0014"
                     .length();
                  var27 = '(';
                  var35 = -1;
            }

            var36 = var28.substring(++var35, var35 + var27);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28336;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/lp7", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("com/zelix/lp7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14820;
      if (n[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lp7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
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
         throw new RuntimeException("com/zelix/lp7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 954;
      if (s[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/lp7", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         s[var3] = var15;
      }

      return s[var3];
   }

   private static long d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = d(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/lp7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
