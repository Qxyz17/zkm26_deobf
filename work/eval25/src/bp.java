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

public class bp extends hv implements _zv, sv {
   x7 y;
   private static final long a = ess.a(-1734480384512614549L, -4244024851067910163L, MethodHandles.lookup().lookupClass()).a(201517048416719L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public void O(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 2
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: ldc2_w -7740090294292667137
      // 1f: lload 3
      // 20: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: lload 5
      // 28: aload 2
      // 29: bipush 2
      // 2a: anewarray 168
      // 2d: dup_x1
      // 2e: swap
      // 2f: bipush 1
      // 30: swap
      // 31: aastore
      // 32: dup_x2
      // 33: dup_x2
      // 34: pop
      // 35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38: bipush 0
      // 39: swap
      // 3a: aastore
      // 3b: invokespecial com/zelix/hv.O ([Ljava/lang/Object;)V
      // 3e: istore 7
      // 40: iload 7
      // 42: ifeq 7d
      // 45: aload 0
      // 46: ldc2_w -7614518121811986315
      // 49: lload 3
      // 4a: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: ifeq 88
      // 52: goto 5f
      // 55: ldc2_w -7537233668830321798
      // 58: lload 3
      // 59: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 2
      // 60: aload 0
      // 61: ldc2_w -7792074928123577958
      // 64: lload 3
      // 65: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: invokevirtual com/zelix/x7.B ()I
      // 6d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 70: goto 7d
      // 73: ldc2_w -7537233668830321798
      // 76: lload 3
      // 77: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: lload 3
      // 7e: lconst_0
      // 7f: lcmp
      // 80: ifle 96
      // 83: iload 7
      // 85: ifne a3
      // 88: aload 2
      // 89: aload 0
      // 8a: ldc2_w -7685285436080527489
      // 8d: lload 3
      // 8e: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: invokevirtual java/io/DataOutputStream.write ([B)V
      // 96: goto a3
      // 99: ldc2_w -7537233668830321798
      // 9c: lload 3
      // 9d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: athrow
      // a3: return
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
      // 2c: ldc2_w 1457096583980252798
      // 2f: lload 3
      // 30: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 2
      // 36: if_acmpne 5f
      // 39: goto 46
      // 3c: ldc2_w 1189519114514048158
      // 3f: lload 3
      // 40: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: goto 54
      // 4a: ldc2_w 1189519114514048158
      // 4d: lload 3
      // 4e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 5
      // 56: ldc2_w 1457096583980252798
      // 59: lload 3
      // 5a: invokedynamic s (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: return
   }

   public void j(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/_ur
      // 020: astore 6
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 70438289693953
      // 028: lxor
      // 029: lstore 7
      // 02b: pop2
      // 02c: ldc2_w -3106497998795710297
      // 02f: lload 3
      // 030: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: aload 0
      // 036: lload 7
      // 038: aload 5
      // 03a: bipush 2
      // 03b: anewarray 168
      // 03e: dup_x1
      // 03f: swap
      // 040: bipush 1
      // 041: swap
      // 042: aastore
      // 043: dup_x2
      // 044: dup_x2
      // 045: pop
      // 046: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 049: bipush 0
      // 04a: swap
      // 04b: aastore
      // 04c: invokespecial com/zelix/hv.O ([Ljava/lang/Object;)V
      // 04f: istore 9
      // 051: aload 0
      // 052: iload 9
      // 054: ifne 08d
      // 057: ldc2_w -3795817549990238860
      // 05a: lload 3
      // 05b: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: ifeq 0fb
      // 063: goto 070
      // 066: ldc2_w -3862085197117948293
      // 069: lload 3
      // 06a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: aload 2
      // 071: aload 0
      // 072: ldc2_w -3540465704685067109
      // 075: lload 3
      // 076: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 080: goto 08d
      // 083: ldc2_w -3862085197117948293
      // 086: lload 3
      // 087: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: checkcast com/zelix/xl
      // 090: astore 10
      // 092: iload 9
      // 094: lload 3
      // 095: lconst_0
      // 096: lcmp
      // 097: ifle 0c8
      // 09a: ifne 0c6
      // 09d: aload 10
      // 09f: ifnull 0d1
      // 0a2: goto 0af
      // 0a5: ldc2_w -3862085197117948293
      // 0a8: lload 3
      // 0a9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 5
      // 0b1: aload 10
      // 0b3: invokevirtual com/zelix/xl.B ()I
      // 0b6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0b9: goto 0c6
      // 0bc: ldc2_w -3862085197117948293
      // 0bf: lload 3
      // 0c0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: iload 9
      // 0c8: lload 3
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: ifle 0f8
      // 0ce: ifeq 0f0
      // 0d1: aload 5
      // 0d3: aload 0
      // 0d4: ldc2_w -3540465704685067109
      // 0d7: lload 3
      // 0d8: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: invokevirtual com/zelix/x7.B ()I
      // 0e0: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0e3: goto 0f0
      // 0e6: ldc2_w -3862085197117948293
      // 0e9: lload 3
      // 0ea: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: lload 3
      // 0f1: lconst_0
      // 0f2: lcmp
      // 0f3: iflt 10a
      // 0f6: iload 9
      // 0f8: ifeq 117
      // 0fb: aload 5
      // 0fd: aload 0
      // 0fe: ldc2_w -4010137101812909442
      // 101: lload 3
      // 102: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: invokevirtual java/io/DataOutputStream.write ([B)V
      // 10a: goto 117
      // 10d: ldc2_w -3862085197117948293
      // 110: lload 3
      // 111: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: return
   }

   bp(h8 param1, int param2, String param3, _xx param4, long param5, _y4 param7, _y4 param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/bp.a J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 139888641087128
      // 00e: lxor
      // 00f: lstore 9
      // 011: dup2
      // 012: ldc2_w 101819829248237
      // 015: lxor
      // 016: lstore 11
      // 018: dup2
      // 019: ldc2_w 104551592605220
      // 01c: lxor
      // 01d: dup2
      // 01e: bipush 8
      // 020: lushr
      // 021: lstore 13
      // 023: dup2
      // 024: bipush 56
      // 026: lshl
      // 027: bipush 56
      // 029: lushr
      // 02a: l2i
      // 02b: istore 15
      // 02d: pop2
      // 02e: dup2
      // 02f: ldc2_w 28026494265035
      // 032: lxor
      // 033: lstore 16
      // 035: dup2
      // 036: ldc2_w 90228736743842
      // 039: lxor
      // 03a: lstore 18
      // 03c: dup2
      // 03d: ldc2_w 71892827293846
      // 040: lxor
      // 041: lstore 20
      // 043: dup2
      // 044: ldc2_w 28026494265035
      // 047: lxor
      // 048: lstore 22
      // 04a: pop2
      // 04b: aload 0
      // 04c: lload 11
      // 04e: aload 1
      // 04f: iload 2
      // 050: aload 3
      // 051: aload 4
      // 053: aload 7
      // 055: invokespecial com/zelix/hv.<init> (JLcom/zelix/h8;ILjava/lang/String;Lcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 058: aload 0
      // 059: aload 0
      // 05a: getfield com/zelix/bp.C I
      // 05d: newarray 8
      // 05f: ldc2_w 56386422484071151
      // 062: lload 5
      // 064: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: ldc2_w 2049967055860607030
      // 06c: lload 5
      // 06e: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: aload 4
      // 075: aload 0
      // 076: ldc2_w 56386422484071151
      // 079: lload 5
      // 07b: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: invokevirtual com/zelix/_xx.read ([B)I
      // 083: pop
      // 084: istore 24
      // 086: aload 0
      // 087: ldc2_w 56386422484071151
      // 08a: lload 5
      // 08c: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: lload 18
      // 093: bipush 0
      // 094: bipush 3
      // 095: anewarray 168
      // 098: dup_x1
      // 099: swap
      // 09a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 09d: bipush 2
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x2
      // 0a1: dup_x2
      // 0a2: pop
      // 0a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a6: bipush 1
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x1
      // 0aa: swap
      // 0ab: bipush 0
      // 0ac: swap
      // 0ad: aastore
      // 0ae: ldc2_w 300624215804310367
      // 0b1: lload 5
      // 0b3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: astore 25
      // 0ba: aconst_null
      // 0bb: astore 26
      // 0bd: aload 25
      // 0bf: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0c2: istore 27
      // 0c4: aload 1
      // 0c5: lload 13
      // 0c7: iload 27
      // 0c9: iload 15
      // 0cb: i2b
      // 0cc: invokevirtual com/zelix/h8.N (JIB)Lcom/zelix/xl;
      // 0cf: astore 28
      // 0d1: aload 28
      // 0d3: iload 24
      // 0d5: ifne 18c
      // 0d8: ifnonnull 18a
      // 0db: goto 0e9
      // 0de: ldc2_w 213480438092510954
      // 0e1: lload 5
      // 0e3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: bipush 0
      // 0eb: ldc2_w 271340395233914341
      // 0ee: lload 5
      // 0f0: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: new com/zelix/_sx
      // 0f8: dup
      // 0f9: new java/lang/StringBuilder
      // 0fc: dup
      // 0fd: invokespecial java/lang/StringBuilder.<init> ()V
      // 100: aload 1
      // 101: lload 20
      // 103: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 106: lload 22
      // 108: ldc2_w 1801564156717013506
      // 10b: lload 5
      // 10d: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: sipush 18495
      // 118: ldc2_w 637029704058638049
      // 11b: lload 5
      // 11d: lxor
      // 11e: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: sipush 27614
      // 129: ldc2_w 7823047428537396485
      // 12c: lload 5
      // 12e: lxor
      // 12f: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: sipush 9063
      // 13a: ldc2_w 2045545903670650302
      // 13d: lload 5
      // 13f: lxor
      // 140: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: iload 27
      // 14a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 14d: sipush 31036
      // 150: ldc2_w 133815327537643489
      // 153: lload 5
      // 155: lxor
      // 156: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15e: aload 0
      // 15f: lload 16
      // 161: invokevirtual com/zelix/bp.j (J)Ljava/lang/String;
      // 164: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 167: sipush 26760
      // 16a: ldc2_w 2294099669084221015
      // 16d: lload 5
      // 16f: lxor
      // 170: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 178: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17b: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 17e: athrow
      // 17f: ldc2_w 213480438092510954
      // 182: lload 5
      // 184: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 28
      // 18c: instanceof com/zelix/x7
      // 18f: ifne 233
      // 192: aload 0
      // 193: bipush 0
      // 194: ldc2_w 271340395233914341
      // 197: lload 5
      // 199: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: new com/zelix/_sx
      // 1a1: dup
      // 1a2: new java/lang/StringBuilder
      // 1a5: dup
      // 1a6: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a9: aload 1
      // 1aa: lload 20
      // 1ac: invokevirtual com/zelix/h8.d (J)Lcom/zelix/hz;
      // 1af: lload 22
      // 1b1: ldc2_w 1801564156717013506
      // 1b4: lload 5
      // 1b6: invokedynamic l (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1be: sipush 25621
      // 1c1: ldc2_w 5716383186380006085
      // 1c4: lload 5
      // 1c6: lxor
      // 1c7: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cf: sipush 27880
      // 1d2: ldc2_w 9028851797492542002
      // 1d5: lload 5
      // 1d7: lxor
      // 1d8: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e0: sipush 23158
      // 1e3: ldc2_w 2648001177205316782
      // 1e6: lload 5
      // 1e8: lxor
      // 1e9: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: iload 27
      // 1f3: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1f6: sipush 4531
      // 1f9: ldc2_w 5033391564604135279
      // 1fc: lload 5
      // 1fe: lxor
      // 1ff: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: aload 0
      // 208: lload 16
      // 20a: invokevirtual com/zelix/bp.j (J)Ljava/lang/String;
      // 20d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 210: sipush 16854
      // 213: ldc2_w 5332033247111415559
      // 216: lload 5
      // 218: lxor
      // 219: invokedynamic s (IJ)Ljava/lang/String; bsm=com/zelix/bp.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 221: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 224: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 227: athrow
      // 228: ldc2_w 213480438092510954
      // 22b: lload 5
      // 22d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: aload 0
      // 234: aload 28
      // 236: checkcast com/zelix/x7
      // 239: ldc2_w 453965920093203466
      // 23c: lload 5
      // 23e: invokedynamic w (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: aload 8
      // 245: aload 0
      // 246: ldc2_w 453965920093203466
      // 249: lload 5
      // 24b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: aload 0
      // 251: lload 9
      // 253: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 256: aload 25
      // 258: ifnull 2fc
      // 25b: aload 26
      // 25d: ifnull 282
      // 260: aload 25
      // 262: ldc2_w 356947920113609505
      // 265: lload 5
      // 267: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: goto 2fc
      // 26f: astore 27
      // 271: aload 26
      // 273: aload 27
      // 275: ldc2_w 321399179252211059
      // 278: lload 5
      // 27a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: goto 2fc
      // 282: aload 25
      // 284: ldc2_w 356947920113609505
      // 287: lload 5
      // 289: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: goto 2fc
      // 291: astore 27
      // 293: aload 27
      // 295: astore 26
      // 297: aload 27
      // 299: athrow
      // 29a: astore 29
      // 29c: aload 25
      // 29e: ifnull 2f9
      // 2a1: aload 26
      // 2a3: ifnull 2df
      // 2a6: goto 2b4
      // 2a9: ldc2_w 213480438092510954
      // 2ac: lload 5
      // 2ae: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: athrow
      // 2b4: aload 25
      // 2b6: ldc2_w 356947920113609505
      // 2b9: lload 5
      // 2bb: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c0: goto 2f9
      // 2c3: astore 30
      // 2c5: aload 26
      // 2c7: lload 5
      // 2c9: lconst_0
      // 2ca: lcmp
      // 2cb: ifle 2fb
      // 2ce: aload 30
      // 2d0: ldc2_w 321399179252211059
      // 2d3: lload 5
      // 2d5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: iload 24
      // 2dc: ifeq 2f9
      // 2df: aload 25
      // 2e1: ldc2_w 356947920113609505
      // 2e4: lload 5
      // 2e6: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: goto 2f9
      // 2ee: ldc2_w 213480438092510954
      // 2f1: lload 5
      // 2f3: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f8: athrow
      // 2f9: aload 29
      // 2fb: athrow
      // 2fc: return
   }

   String f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 51502039195757L;
      return x44.a<"h">(this, -1115565700074038590L, var2).W(var4);
   }

   void N(long param1, _8l param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 80221771876344
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 80221771876344
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -5003033307729260843
      // 13: lload 1
      // 14: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: aload 0
      // 1a: getfield com/zelix/bp.c Lcom/zelix/mx;
      // 1d: lload 4
      // 1f: aload 3
      // 20: aload 0
      // 21: aload 0
      // 22: invokevirtual com/zelix/bp.x ()Lcom/zelix/h8;
      // 25: invokevirtual com/zelix/mx.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 28: pop
      // 29: istore 8
      // 2b: aload 0
      // 2c: ldc2_w -6548045577707648250
      // 2f: lload 1
      // 30: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: iload 8
      // 37: ifne 6c
      // 3a: ifeq 6d
      // 3d: goto 4a
      // 40: ldc2_w -6623323044591628279
      // 43: lload 1
      // 44: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 0
      // 4b: ldc2_w -6868101569179333911
      // 4e: lload 1
      // 4f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: lload 6
      // 56: aload 3
      // 57: aload 0
      // 58: aload 0
      // 59: invokevirtual com/zelix/bp.x ()Lcom/zelix/h8;
      // 5c: invokevirtual com/zelix/x7.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 5f: goto 6c
      // 62: ldc2_w -6623323044591628279
      // 65: lload 1
      // 66: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: pop
      // 6d: return
   }

   public void i(Object[] var1) {
      int var5 = (Integer)var1[0];
      int var7 = (Integer)var1[1];
      HashMap var2 = (HashMap)var1[2];
      HashMap var6 = (HashMap)var1[3];
      long var3 = (Long)var1[4];
   }

   static {
      long var0 = a ^ 13440761785257L;
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
      String var6 = "vU\u0081Ô¾\u0087³wfØ»¨\u0086\u0098µÃ\u0099/\u0086;«3\u0096\u001e5|\u000bíügM4\u0010g¬æ$\u0013XÛÝ'\u0002ÚÚ]¬\\\u0087 \u0018\u007feàlZÈlFÄÅó§$\u0092À\u009a\u0088'\u008béZõB¢¿fR¬ÍKV 4íç\u0081Þ\u0013³ÞQ\u000b\u0086F\u008càé¦Ó-ná_NÏ¾\u008d|9m\u008d\u0005Ã¼\u0010%(\u0003¨µ\"r!²ÃZõùÉäÅ\u0010\u009fÅæûlá©¿å%gV\u001dN\u0013â@\u0018´%\u00940í¢ø\u007f&¶çbâîF\u0080\u001fÍ\u001f}Ñ|\u0013\u0092\u0086\u0003\u009fÍ\u000e+ÅINù\u009bJÖ¾Ó\u0097Õ\u0094Ò¸Òîé\u0017ÓìIÌ6bE\u0094¿w\té\u008ds\u0099@(gU+g®â[þ\u000bû#78\u001f7Ö\u00ad1#iE\u0004\f\u008c$7MÄ\u000e\u0015d¼Ä}{Lâºc\u0099±\u008aÏ\u009c]·wc£Ï\u0098gJøP÷íÄÑ}Ú³\f";
      int var8 = "vU\u0081Ô¾\u0087³wfØ»¨\u0086\u0098µÃ\u0099/\u0086;«3\u0096\u001e5|\u000bíügM4\u0010g¬æ$\u0013XÛÝ'\u0002ÚÚ]¬\\\u0087 \u0018\u007feàlZÈlFÄÅó§$\u0092À\u009a\u0088'\u008béZõB¢¿fR¬ÍKV 4íç\u0081Þ\u0013³ÞQ\u000b\u0086F\u008càé¦Ó-ná_NÏ¾\u008d|9m\u008d\u0005Ã¼\u0010%(\u0003¨µ\"r!²ÃZõùÉäÅ\u0010\u009fÅæûlá©¿å%gV\u001dN\u0013â@\u0018´%\u00940í¢ø\u007f&¶çbâîF\u0080\u001fÍ\u001f}Ñ|\u0013\u0092\u0086\u0003\u009fÍ\u000e+ÅINù\u009bJÖ¾Ó\u0097Õ\u0094Ò¸Òîé\u0017ÓìIÌ6bE\u0094¿w\té\u008ds\u0099@(gU+g®â[þ\u000bû#78\u001f7Ö\u00ad1#iE\u0004\f\u008c$7MÄ\u000e\u0015d¼Ä}{Lâºc\u0099±\u008aÏ\u009c]·wc£Ï\u0098gJøP÷íÄÑ}Ú³\f"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[10];
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

                  var6 = "\u001c'\u0091d\u007f²y3\u0006¢]\u009a\u001f\u0098\u0092\u001cÀwÓî\u009fM×LSâ:ÅpÆ Å7ð0V \u0002\u0002wOæ®h~ÂÛð\u0014¸:\u0099Îe[{=E0\rª\u0016µa8ß\u0017¨19>r\u0090I\u0097ðAöÜ&Ãée®²\b1éït©\b\u0088øº\u0098ýÒ\u008b\u0018;\u009bU\u000e;£Ý¯ò\u001eÏ~IR\u0007½À=L\u0087ù";
                  var8 = "\u001c'\u0091d\u007f²y3\u0006¢]\u009a\u001f\u0098\u0092\u001cÀwÓî\u009fM×LSâ:ÅpÆ Å7ð0V \u0002\u0002wOæ®h~ÂÛð\u0014¸:\u0099Îe[{=E0\rª\u0016µa8ß\u0017¨19>r\u0090I\u0097ðAöÜ&Ãée®²\b1éït©\b\u0088øº\u0098ýÒ\u008b\u0018;\u009bU\u000e;£Ý¯ò\u001eÏ~IR\u0007½À=L\u0087ù"
                     .length();
                  var5 = '@';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19326;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/bp", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/bp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
