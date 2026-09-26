package com.zelix;

import java.io.File;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g3 {
   private static String[] G;
   private static final long a = prr.a(5316913064004998659L, -6642600316293817636L, MethodHandles.lookup().lookupClass()).a(103683817164652L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private static String C(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/sz
      // 020: astore 4
      // 022: pop
      // 023: getstatic com/zelix/g3.a J
      // 026: lload 1
      // 027: lxor
      // 028: lstore 1
      // 029: lload 1
      // 02a: dup2
      // 02b: ldc2_w 48802333828293
      // 02e: lxor
      // 02f: lstore 6
      // 031: dup2
      // 032: ldc2_w 129239964442072
      // 035: lxor
      // 036: lstore 8
      // 038: pop2
      // 039: ldc2_w -334229187741893019
      // 03c: lload 1
      // 03d: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: new java/io/File
      // 045: dup
      // 046: aload 5
      // 048: sipush 5677
      // 04b: ldc2_w 3923980292970546564
      // 04e: lload 1
      // 04f: lxor
      // 050: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 058: astore 11
      // 05a: astore 10
      // 05c: aload 11
      // 05e: ldc2_w -1919775093315870589
      // 061: lload 1
      // 062: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: aload 10
      // 069: ifnull 094
      // 06c: ifeq 1e0
      // 06f: goto 07c
      // 072: ldc2_w -2181481040307511946
      // 075: lload 1
      // 076: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: aload 11
      // 07e: ldc2_w -545181580171857131
      // 081: lload 1
      // 082: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: goto 094
      // 08a: ldc2_w -2181481040307511946
      // 08d: lload 1
      // 08e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: ifne 1e0
      // 097: aload 4
      // 099: aload 11
      // 09b: ldc2_w -1933107656278927273
      // 09e: lload 1
      // 09f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: lload 6
      // 0a6: dup2_x1
      // 0a7: pop2
      // 0a8: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 0ab: new com/zelix/lbb
      // 0ae: dup
      // 0af: invokespecial com/zelix/lbb.<init> ()V
      // 0b2: astore 12
      // 0b4: lload 8
      // 0b6: aload 11
      // 0b8: aload 3
      // 0b9: aload 12
      // 0bb: bipush 4
      // 0bc: anewarray 528
      // 0bf: dup_x1
      // 0c0: swap
      // 0c1: bipush 3
      // 0c2: swap
      // 0c3: aastore
      // 0c4: dup_x1
      // 0c5: swap
      // 0c6: bipush 2
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: bipush 1
      // 0cc: swap
      // 0cd: aastore
      // 0ce: dup_x2
      // 0cf: dup_x2
      // 0d0: pop
      // 0d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d4: bipush 0
      // 0d5: swap
      // 0d6: aastore
      // 0d7: ldc2_w -2194297909693278845
      // 0da: lload 1
      // 0db: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: astore 13
      // 0e2: aload 13
      // 0e4: sipush 31709
      // 0e7: ldc2_w 4827898541948987488
      // 0ea: lload 1
      // 0eb: lxor
      // 0ec: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 0f4: istore 14
      // 0f6: iload 14
      // 0f8: aload 10
      // 0fa: ifnull 11c
      // 0fd: bipush -1
      // 0fe: if_icmple 1dd
      // 101: goto 10e
      // 104: ldc2_w -2181481040307511946
      // 107: lload 1
      // 108: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: bipush 0
      // 10f: goto 11c
      // 112: ldc2_w -2181481040307511946
      // 115: lload 1
      // 116: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: istore 15
      // 11e: new java/lang/StringBuilder
      // 121: dup
      // 122: invokespecial java/lang/StringBuilder.<init> ()V
      // 125: astore 16
      // 127: iload 14
      // 129: bipush -1
      // 12a: if_icmple 1c9
      // 12d: aload 16
      // 12f: aload 13
      // 131: iload 15
      // 133: iload 14
      // 135: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: pop
      // 13c: aload 13
      // 13e: lload 1
      // 13f: lconst_0
      // 140: lcmp
      // 141: iflt 1dc
      // 144: sipush 11985
      // 147: ldc2_w 6534168978905513319
      // 14a: lload 1
      // 14b: lxor
      // 14c: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: iload 14
      // 153: bipush 2
      // 154: iadd
      // 155: ldc2_w -1857623811486413791
      // 158: lload 1
      // 159: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: istore 17
      // 160: aload 10
      // 162: ifnull 1d7
      // 165: iload 17
      // 167: aload 10
      // 169: ifnull 1c2
      // 16c: goto 179
      // 16f: ldc2_w -2181481040307511946
      // 172: lload 1
      // 173: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: bipush -1
      // 17a: if_icmple 1b4
      // 17d: goto 18a
      // 180: ldc2_w -2181481040307511946
      // 183: lload 1
      // 184: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 13
      // 18c: iload 17
      // 18e: bipush 2
      // 18f: iadd
      // 190: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 193: astore 13
      // 195: aload 13
      // 197: sipush 575
      // 19a: ldc2_w 754736009213186438
      // 19d: lload 1
      // 19e: lxor
      // 19f: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 1a7: istore 14
      // 1a9: aload 10
      // 1ab: lload 1
      // 1ac: lconst_0
      // 1ad: lcmp
      // 1ae: ifle 1c6
      // 1b1: ifnonnull 1c4
      // 1b4: bipush -1
      // 1b5: goto 1c2
      // 1b8: ldc2_w -2181481040307511946
      // 1bb: lload 1
      // 1bc: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: istore 14
      // 1c4: aload 10
      // 1c6: ifnonnull 127
      // 1c9: aload 16
      // 1cb: aload 13
      // 1cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d0: pop
      // 1d1: lload 1
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: iflt 13c
      // 1d7: aload 16
      // 1d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1dc: areturn
      // 1dd: aload 13
      // 1df: areturn
      // 1e0: aconst_null
      // 1e1: areturn
   }

   private static int H(Object[] param0) {
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
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Integer
      // 019: invokevirtual java/lang/Integer.intValue ()I
      // 01c: istore 3
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast com/zelix/sz
      // 023: astore 2
      // 024: pop
      // 025: getstatic com/zelix/g3.a J
      // 028: lload 4
      // 02a: lxor
      // 02b: lstore 4
      // 02d: lload 4
      // 02f: dup2
      // 030: ldc2_w 95195865305095
      // 033: lxor
      // 034: lstore 6
      // 036: pop2
      // 037: ldc2_w 1125599350289484455
      // 03a: lload 4
      // 03c: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: ldc2_w 975034067086548505
      // 044: lload 4
      // 046: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: arraylength
      // 04c: newarray 10
      // 04e: astore 9
      // 050: astore 8
      // 052: bipush 0
      // 053: istore 10
      // 055: iload 10
      // 057: aload 9
      // 059: arraylength
      // 05a: if_icmpge 0a4
      // 05d: aload 9
      // 05f: iload 10
      // 061: aload 1
      // 062: ldc2_w 975034067086548505
      // 065: lload 4
      // 067: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: iload 10
      // 06e: aaload
      // 06f: iload 3
      // 070: ldc2_w 1367438466776987875
      // 073: lload 4
      // 075: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: iastore
      // 07b: iinc 10 1
      // 07e: aload 8
      // 080: lload 4
      // 082: lconst_0
      // 083: lcmp
      // 084: ifle 08c
      // 087: ifnull 0a7
      // 08a: aload 8
      // 08c: ifnonnull 055
      // 08f: lload 4
      // 091: lconst_0
      // 092: lcmp
      // 093: iflt 07e
      // 096: goto 0a4
      // 099: ldc2_w 1548016144949012916
      // 09c: lload 4
      // 09e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: bipush -1
      // 0a5: istore 10
      // 0a7: bipush 0
      // 0a8: istore 11
      // 0aa: iload 11
      // 0ac: aload 9
      // 0ae: arraylength
      // 0af: if_icmpge 16c
      // 0b2: aload 9
      // 0b4: iload 11
      // 0b6: iaload
      // 0b7: bipush -1
      // 0b8: aload 8
      // 0ba: lload 4
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: iflt 178
      // 0c1: ifnull 176
      // 0c4: aload 8
      // 0c6: ifnull 10c
      // 0c9: goto 0d7
      // 0cc: ldc2_w 1548016144949012916
      // 0cf: lload 4
      // 0d1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: if_icmple 164
      // 0da: goto 0e8
      // 0dd: ldc2_w 1548016144949012916
      // 0e0: lload 4
      // 0e2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: iload 10
      // 0ea: aload 8
      // 0ec: ifnull 14d
      // 0ef: goto 0fd
      // 0f2: ldc2_w 1548016144949012916
      // 0f5: lload 4
      // 0f7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: bipush -1
      // 0fe: goto 10c
      // 101: ldc2_w 1548016144949012916
      // 104: lload 4
      // 106: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: if_icmpeq 13a
      // 10f: aload 9
      // 111: iload 11
      // 113: iaload
      // 114: aload 8
      // 116: ifnull 14d
      // 119: goto 127
      // 11c: ldc2_w 1548016144949012916
      // 11f: lload 4
      // 121: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: iload 10
      // 129: if_icmpge 164
      // 12c: goto 13a
      // 12f: ldc2_w 1548016144949012916
      // 132: lload 4
      // 134: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 9
      // 13c: iload 11
      // 13e: iaload
      // 13f: goto 14d
      // 142: ldc2_w 1548016144949012916
      // 145: lload 4
      // 147: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: istore 10
      // 14f: aload 2
      // 150: ldc2_w 975034067086548505
      // 153: lload 4
      // 155: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: iload 11
      // 15c: aaload
      // 15d: lload 6
      // 15f: dup2_x1
      // 160: pop2
      // 161: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 164: iinc 11 1
      // 167: aload 8
      // 169: ifnonnull 0aa
      // 16c: iload 10
      // 16e: lload 4
      // 170: lconst_0
      // 171: lcmp
      // 172: ifle 0b7
      // 175: bipush -1
      // 176: aload 8
      // 178: ifnull 1a6
      // 17b: if_icmple 1aa
      // 17e: goto 18c
      // 181: ldc2_w 1548016144949012916
      // 184: lload 4
      // 186: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18b: athrow
      // 18c: iload 10
      // 18e: aload 2
      // 18f: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 192: checkcast java/lang/String
      // 195: invokevirtual java/lang/String.length ()I
      // 198: goto 1a6
      // 19b: ldc2_w 1548016144949012916
      // 19e: lload 4
      // 1a0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: athrow
      // 1a6: iadd
      // 1a7: goto 1ac
      // 1aa: iload 10
      // 1ac: ireturn
   }

   public static String Y(Object[] param0) {
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: pop
      // 013: getstatic com/zelix/g3.a J
      // 016: lload 1
      // 017: lxor
      // 018: lstore 1
      // 019: lload 1
      // 01a: dup2
      // 01b: ldc2_w 17323906035495
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 32
      // 022: lushr
      // 023: l2i
      // 024: istore 4
      // 026: dup2
      // 027: bipush 32
      // 029: lshl
      // 02a: bipush 48
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 5
      // 030: dup2
      // 031: bipush 48
      // 033: lshl
      // 034: bipush 48
      // 036: lushr
      // 037: l2i
      // 038: istore 6
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 112335600251835
      // 03f: lxor
      // 040: lstore 7
      // 042: dup2
      // 043: ldc2_w 72418457287930
      // 046: lxor
      // 047: lstore 9
      // 049: dup2
      // 04a: ldc2_w 82128628571682
      // 04d: lxor
      // 04e: lstore 11
      // 050: pop2
      // 051: aload 3
      // 052: invokevirtual java/lang/String.length ()I
      // 055: istore 14
      // 057: new java/lang/StringBuilder
      // 05a: dup
      // 05b: invokespecial java/lang/StringBuilder.<init> ()V
      // 05e: astore 15
      // 060: bipush 0
      // 061: istore 16
      // 063: ldc2_w 7057082034591704278
      // 066: lload 1
      // 067: invokedynamic l (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: new com/zelix/sz
      // 06f: dup
      // 070: iload 4
      // 072: iload 5
      // 074: i2s
      // 075: iload 6
      // 077: i2c
      // 078: invokespecial com/zelix/sz.<init> (ISC)V
      // 07b: astore 17
      // 07d: aload 3
      // 07e: iload 16
      // 080: aload 17
      // 082: lload 9
      // 084: bipush 4
      // 085: anewarray 528
      // 088: dup_x2
      // 089: dup_x2
      // 08a: pop
      // 08b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e: bipush 3
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: bipush 2
      // 094: swap
      // 095: aastore
      // 096: dup_x1
      // 097: swap
      // 098: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09b: bipush 1
      // 09c: swap
      // 09d: aastore
      // 09e: dup_x1
      // 09f: swap
      // 0a0: bipush 0
      // 0a1: swap
      // 0a2: aastore
      // 0a3: ldc2_w 7428190698907433009
      // 0a6: lload 1
      // 0a7: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: istore 18
      // 0ae: astore 13
      // 0b0: iload 18
      // 0b2: bipush -1
      // 0b3: if_icmple 819
      // 0b6: aload 3
      // 0b7: iload 16
      // 0b9: iload 18
      // 0bb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0be: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0c1: astore 19
      // 0c3: aload 15
      // 0c5: aload 3
      // 0c6: iload 16
      // 0c8: iload 18
      // 0ca: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: pop
      // 0d1: aload 3
      // 0d2: iload 18
      // 0d4: lload 11
      // 0d6: bipush 3
      // 0d7: anewarray 528
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 2
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e8: bipush 1
      // 0e9: swap
      // 0ea: aastore
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: bipush 0
      // 0ee: swap
      // 0ef: aastore
      // 0f0: ldc2_w 9140819198848610113
      // 0f3: lload 1
      // 0f4: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: istore 20
      // 0fb: lload 1
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: iflt 82d
      // 101: aload 13
      // 103: ifnull 82d
      // 106: iload 20
      // 108: aload 13
      // 10a: ifnull 157
      // 10d: goto 11a
      // 110: ldc2_w 8866053187179251653
      // 113: lload 1
      // 114: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: bipush -1
      // 11b: if_icmpne 13a
      // 11e: goto 12b
      // 121: ldc2_w 8866053187179251653
      // 124: lload 1
      // 125: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: iload 14
      // 12d: istore 16
      // 12f: lload 1
      // 130: lconst_0
      // 131: lcmp
      // 132: ifle 82d
      // 135: aload 13
      // 137: ifnonnull 819
      // 13a: aload 15
      // 13c: aload 3
      // 13d: iload 18
      // 13f: iload 20
      // 141: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: pop
      // 148: iload 20
      // 14a: goto 157
      // 14d: ldc2_w 8866053187179251653
      // 150: lload 1
      // 151: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: istore 21
      // 159: aload 3
      // 15a: iload 21
      // 15c: invokevirtual java/lang/String.charAt (I)C
      // 15f: istore 22
      // 161: bipush 0
      // 162: istore 23
      // 164: aload 3
      // 165: invokevirtual java/lang/String.length ()I
      // 168: iload 21
      // 16a: bipush 1
      // 16b: iadd
      // 16c: aload 13
      // 16e: ifnull 1ac
      // 171: if_icmple 18b
      // 174: goto 181
      // 177: ldc2_w 8866053187179251653
      // 17a: lload 1
      // 17b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: aload 3
      // 182: iload 21
      // 184: bipush 1
      // 185: iadd
      // 186: invokevirtual java/lang/String.charAt (I)C
      // 189: istore 23
      // 18b: iload 22
      // 18d: aload 13
      // 18f: ifnull 1bf
      // 192: sipush 14405
      // 195: ldc2_w 4880010034512557557
      // 198: lload 1
      // 199: lxor
      // 19a: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: goto 1ac
      // 1a2: ldc2_w 8866053187179251653
      // 1a5: lload 1
      // 1a6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: if_icmpne 1be
      // 1af: sipush 29921
      // 1b2: ldc2_w 1539210302699551066
      // 1b5: lload 1
      // 1b6: lxor
      // 1b7: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: istore 22
      // 1be: bipush 0
      // 1bf: istore 24
      // 1c1: bipush 1
      // 1c2: istore 25
      // 1c4: iload 21
      // 1c6: iload 14
      // 1c8: if_icmpge 749
      // 1cb: iload 22
      // 1cd: ldc2_w 7133268395743423124
      // 1d0: lload 1
      // 1d1: invokedynamic l (CJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: aload 13
      // 1d8: lload 1
      // 1d9: lconst_0
      // 1da: lcmp
      // 1db: ifle 1e3
      // 1de: ifnull 761
      // 1e1: aload 13
      // 1e3: lload 1
      // 1e4: lconst_0
      // 1e5: lcmp
      // 1e6: iflt 26e
      // 1e9: ifnull 26c
      // 1ec: goto 1f9
      // 1ef: ldc2_w 8866053187179251653
      // 1f2: lload 1
      // 1f3: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: athrow
      // 1f9: ifeq 26a
      // 1fc: goto 209
      // 1ff: ldc2_w 8866053187179251653
      // 202: lload 1
      // 203: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: iload 22
      // 20b: sipush 9035
      // 20e: ldc2_w 3572972420144066303
      // 211: lload 1
      // 212: lxor
      // 213: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: lload 1
      // 219: lconst_0
      // 21a: lcmp
      // 21b: ifle 780
      // 21e: aload 13
      // 220: ifnull 780
      // 223: goto 230
      // 226: ldc2_w 8866053187179251653
      // 229: lload 1
      // 22a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: if_icmpne 749
      // 233: goto 240
      // 236: ldc2_w 8866053187179251653
      // 239: lload 1
      // 23a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: iload 24
      // 242: aload 13
      // 244: lload 1
      // 245: lconst_0
      // 246: lcmp
      // 247: ifle 763
      // 24a: ifnull 761
      // 24d: goto 25a
      // 250: ldc2_w 8866053187179251653
      // 253: lload 1
      // 254: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: ifeq 749
      // 25d: goto 26a
      // 260: ldc2_w 8866053187179251653
      // 263: lload 1
      // 264: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: iload 22
      // 26c: aload 13
      // 26e: ifnull 305
      // 271: sipush 29921
      // 274: ldc2_w 1539210302699551066
      // 277: lload 1
      // 278: lxor
      // 279: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: if_icmpne 303
      // 281: goto 28e
      // 284: ldc2_w 8866053187179251653
      // 287: lload 1
      // 288: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: athrow
      // 28e: iload 23
      // 290: lload 7
      // 292: bipush 2
      // 293: anewarray 528
      // 296: dup_x2
      // 297: dup_x2
      // 298: pop
      // 299: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29c: bipush 1
      // 29d: swap
      // 29e: aastore
      // 29f: dup_x1
      // 2a0: swap
      // 2a1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2a4: bipush 0
      // 2a5: swap
      // 2a6: aastore
      // 2a7: ldc2_w 7029002006648049790
      // 2aa: lload 1
      // 2ab: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: aload 13
      // 2b2: lload 1
      // 2b3: lconst_0
      // 2b4: lcmp
      // 2b5: ifle 30d
      // 2b8: ifnull 305
      // 2bb: goto 2c8
      // 2be: ldc2_w 8866053187179251653
      // 2c1: lload 1
      // 2c2: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: athrow
      // 2c8: ifne 303
      // 2cb: goto 2d8
      // 2ce: ldc2_w 8866053187179251653
      // 2d1: lload 1
      // 2d2: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: athrow
      // 2d8: iload 24
      // 2da: aload 13
      // 2dc: ifnull 2fd
      // 2df: goto 2ec
      // 2e2: ldc2_w 8866053187179251653
      // 2e5: lload 1
      // 2e6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: athrow
      // 2ec: ifne 300
      // 2ef: goto 2fc
      // 2f2: ldc2_w 8866053187179251653
      // 2f5: lload 1
      // 2f6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: athrow
      // 2fc: bipush 1
      // 2fd: goto 301
      // 300: bipush 0
      // 301: istore 24
      // 303: iload 25
      // 305: lload 1
      // 306: lconst_0
      // 307: lcmp
      // 308: ifle 3ca
      // 30b: aload 13
      // 30d: ifnull 3ca
      // 310: ifeq 3c8
      // 313: goto 320
      // 316: ldc2_w 8866053187179251653
      // 319: lload 1
      // 31a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: athrow
      // 320: aload 15
      // 322: aload 15
      // 324: invokevirtual java/lang/StringBuilder.length ()I
      // 327: bipush 1
      // 328: isub
      // 329: ldc2_w 7492741721270504030
      // 32c: lload 1
      // 32d: invokedynamic s (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 332: istore 26
      // 334: iload 22
      // 336: aload 13
      // 338: ifnull 3c6
      // 33b: sipush 29921
      // 33e: ldc2_w 1539210302699551066
      // 341: lload 1
      // 342: lxor
      // 343: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: if_icmpeq 3c5
      // 34b: goto 358
      // 34e: ldc2_w 8866053187179251653
      // 351: lload 1
      // 352: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: athrow
      // 358: iload 26
      // 35a: aload 13
      // 35c: ifnull 3c6
      // 35f: goto 36c
      // 362: ldc2_w 8866053187179251653
      // 365: lload 1
      // 366: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36b: athrow
      // 36c: sipush 29921
      // 36f: ldc2_w 1539210302699551066
      // 372: lload 1
      // 373: lxor
      // 374: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: if_icmpeq 3c5
      // 37c: goto 389
      // 37f: ldc2_w 8866053187179251653
      // 382: lload 1
      // 383: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 388: athrow
      // 389: iload 26
      // 38b: aload 13
      // 38d: ifnull 3c6
      // 390: goto 39d
      // 393: ldc2_w 8866053187179251653
      // 396: lload 1
      // 397: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39c: athrow
      // 39d: sipush 19772
      // 3a0: ldc2_w 3457360343991910538
      // 3a3: lload 1
      // 3a4: lxor
      // 3a5: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3aa: if_icmpeq 3c5
      // 3ad: goto 3ba
      // 3b0: ldc2_w 8866053187179251653
      // 3b3: lload 1
      // 3b4: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b9: athrow
      // 3ba: aload 15
      // 3bc: ldc "\""
      // 3be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c1: pop
      // 3c2: bipush 1
      // 3c3: istore 24
      // 3c5: bipush 0
      // 3c6: istore 25
      // 3c8: iload 22
      // 3ca: ldc2_w 9138377842386891973
      // 3cd: lload 1
      // 3ce: invokedynamic h (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d3: aload 13
      // 3d5: ifnull 4cb
      // 3d8: if_icmpeq 48d
      // 3db: goto 3e8
      // 3de: ldc2_w 8866053187179251653
      // 3e1: lload 1
      // 3e2: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e7: athrow
      // 3e8: iload 22
      // 3ea: sipush 32307
      // 3ed: ldc2_w 1571101790431425412
      // 3f0: lload 1
      // 3f1: lxor
      // 3f2: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f7: aload 13
      // 3f9: ifnull 4cb
      // 3fc: goto 409
      // 3ff: ldc2_w 8866053187179251653
      // 402: lload 1
      // 403: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 408: athrow
      // 409: if_icmpeq 48d
      // 40c: goto 419
      // 40f: ldc2_w 8866053187179251653
      // 412: lload 1
      // 413: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 418: athrow
      // 419: iload 22
      // 41b: sipush 32734
      // 41e: ldc2_w 8338522451752923746
      // 421: lload 1
      // 422: lxor
      // 423: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 428: lload 1
      // 429: lconst_0
      // 42a: lcmp
      // 42b: ifle 4cb
      // 42e: aload 13
      // 430: ifnull 4cb
      // 433: goto 440
      // 436: ldc2_w 8866053187179251653
      // 439: lload 1
      // 43a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43f: athrow
      // 440: if_icmpeq 48d
      // 443: goto 450
      // 446: ldc2_w 8866053187179251653
      // 449: lload 1
      // 44a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44f: athrow
      // 450: iload 22
      // 452: sipush 17957
      // 455: ldc2_w 6561982588034124695
      // 458: lload 1
      // 459: lxor
      // 45a: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45f: aload 13
      // 461: lload 1
      // 462: lconst_0
      // 463: lcmp
      // 464: iflt 57c
      // 467: ifnull 574
      // 46a: goto 477
      // 46d: ldc2_w 8866053187179251653
      // 470: lload 1
      // 471: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 476: athrow
      // 477: lload 1
      // 478: lconst_0
      // 479: lcmp
      // 47a: ifle 567
      // 47d: if_icmpne 558
      // 480: goto 48d
      // 483: ldc2_w 8866053187179251653
      // 486: lload 1
      // 487: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48c: athrow
      // 48d: aload 15
      // 48f: aload 15
      // 491: invokevirtual java/lang/StringBuilder.length ()I
      // 494: bipush 1
      // 495: isub
      // 496: ldc2_w 7492741721270504030
      // 499: lload 1
      // 49a: invokedynamic s (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49f: aload 13
      // 4a1: ifnull 508
      // 4a4: goto 4b1
      // 4a7: ldc2_w 8866053187179251653
      // 4aa: lload 1
      // 4ab: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b0: athrow
      // 4b1: sipush 29921
      // 4b4: ldc2_w 1539210302699551066
      // 4b7: lload 1
      // 4b8: lxor
      // 4b9: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4be: goto 4cb
      // 4c1: ldc2_w 8866053187179251653
      // 4c4: lload 1
      // 4c5: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ca: athrow
      // 4cb: if_icmpeq 507
      // 4ce: iload 24
      // 4d0: aload 13
      // 4d2: ifnull 508
      // 4d5: goto 4e2
      // 4d8: ldc2_w 8866053187179251653
      // 4db: lload 1
      // 4dc: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e1: athrow
      // 4e2: ifeq 507
      // 4e5: goto 4f2
      // 4e8: ldc2_w 8866053187179251653
      // 4eb: lload 1
      // 4ec: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f1: athrow
      // 4f2: aload 15
      // 4f4: ldc "\""
      // 4f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f9: pop
      // 4fa: goto 507
      // 4fd: ldc2_w 8866053187179251653
      // 500: lload 1
      // 501: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 506: athrow
      // 507: bipush 0
      // 508: istore 24
      // 50a: aload 15
      // 50c: iload 22
      // 50e: aload 13
      // 510: ifnull 53d
      // 513: ldc2_w 9138377842386891973
      // 516: lload 1
      // 517: invokedynamic h (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51c: if_icmpne 53b
      // 51f: goto 52c
      // 522: ldc2_w 8866053187179251653
      // 525: lload 1
      // 526: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52b: athrow
      // 52c: ldc "~"
      // 52e: goto 546
      // 531: ldc2_w 8866053187179251653
      // 534: lload 1
      // 535: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53a: athrow
      // 53b: iload 22
      // 53d: ldc2_w 7159577117718332844
      // 540: lload 1
      // 541: invokedynamic l (CJJ)Ljava/lang/Character; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 546: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 549: pop
      // 54a: bipush 1
      // 54b: istore 25
      // 54d: lload 1
      // 54e: lconst_0
      // 54f: lcmp
      // 550: ifle 6c3
      // 553: aload 13
      // 555: ifnonnull 6c0
      // 558: iload 22
      // 55a: sipush 29921
      // 55d: ldc2_w 1539210302699551066
      // 560: lload 1
      // 561: lxor
      // 562: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 567: goto 574
      // 56a: ldc2_w 8866053187179251653
      // 56d: lload 1
      // 56e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 573: athrow
      // 574: lload 1
      // 575: lconst_0
      // 576: lcmp
      // 577: ifle 5e3
      // 57a: aload 13
      // 57c: ifnull 5e3
      // 57f: if_icmpne 5bc
      // 582: goto 58f
      // 585: ldc2_w 8866053187179251653
      // 588: lload 1
      // 589: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58e: athrow
      // 58f: iload 24
      // 591: aload 13
      // 593: lload 1
      // 594: lconst_0
      // 595: lcmp
      // 596: iflt 5c0
      // 599: ifnull 5be
      // 59c: goto 5a9
      // 59f: ldc2_w 8866053187179251653
      // 5a2: lload 1
      // 5a3: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a8: athrow
      // 5a9: ifne 5bc
      // 5ac: goto 5b9
      // 5af: ldc2_w 8866053187179251653
      // 5b2: lload 1
      // 5b3: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b8: athrow
      // 5b9: bipush 1
      // 5ba: istore 25
      // 5bc: iload 22
      // 5be: aload 13
      // 5c0: lload 1
      // 5c1: lconst_0
      // 5c2: lcmp
      // 5c3: ifle 617
      // 5c6: ifnull 615
      // 5c9: sipush 29921
      // 5cc: ldc2_w 1539210302699551066
      // 5cf: lload 1
      // 5d0: lxor
      // 5d1: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d6: goto 5e3
      // 5d9: ldc2_w 8866053187179251653
      // 5dc: lload 1
      // 5dd: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e2: athrow
      // 5e3: if_icmpne 6ab
      // 5e6: iload 23
      // 5e8: lload 7
      // 5ea: bipush 2
      // 5eb: anewarray 528
      // 5ee: dup_x2
      // 5ef: dup_x2
      // 5f0: pop
      // 5f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f4: bipush 1
      // 5f5: swap
      // 5f6: aastore
      // 5f7: dup_x1
      // 5f8: swap
      // 5f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5fc: bipush 0
      // 5fd: swap
      // 5fe: aastore
      // 5ff: ldc2_w 7029002006648049790
      // 602: lload 1
      // 603: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 608: goto 615
      // 60b: ldc2_w 8866053187179251653
      // 60e: lload 1
      // 60f: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 614: athrow
      // 615: aload 13
      // 617: lload 1
      // 618: lconst_0
      // 619: lcmp
      // 61a: ifle 651
      // 61d: ifnull 64f
      // 620: ifeq 6ab
      // 623: goto 630
      // 626: ldc2_w 8866053187179251653
      // 629: lload 1
      // 62a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62f: athrow
      // 630: aload 19
      // 632: sipush 9530
      // 635: ldc2_w 3072491042719411217
      // 638: lload 1
      // 639: lxor
      // 63a: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 642: goto 64f
      // 645: ldc2_w 8866053187179251653
      // 648: lload 1
      // 649: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64e: athrow
      // 64f: aload 13
      // 651: ifnull 6c5
      // 654: ifeq 6c0
      // 657: goto 664
      // 65a: ldc2_w 8866053187179251653
      // 65d: lload 1
      // 65e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 663: athrow
      // 664: aload 15
      // 666: aload 15
      // 668: invokevirtual java/lang/StringBuilder.length ()I
      // 66b: bipush 1
      // 66c: isub
      // 66d: ldc2_w 7492741721270504030
      // 670: lload 1
      // 671: invokedynamic s (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 676: sipush 29921
      // 679: ldc2_w 1539210302699551066
      // 67c: lload 1
      // 67d: lxor
      // 67e: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 683: aload 13
      // 685: lload 1
      // 686: lconst_0
      // 687: lcmp
      // 688: iflt 6c9
      // 68b: ifnull 6c7
      // 68e: goto 69b
      // 691: ldc2_w 8866053187179251653
      // 694: lload 1
      // 695: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69a: athrow
      // 69b: if_icmpne 6c0
      // 69e: goto 6ab
      // 6a1: ldc2_w 8866053187179251653
      // 6a4: lload 1
      // 6a5: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6aa: athrow
      // 6ab: aload 15
      // 6ad: iload 22
      // 6af: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 6b2: pop
      // 6b3: goto 6c0
      // 6b6: ldc2_w 8866053187179251653
      // 6b9: lload 1
      // 6ba: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6bf: athrow
      // 6c0: iinc 21 1
      // 6c3: iload 21
      // 6c5: iload 14
      // 6c7: aload 13
      // 6c9: ifnull 737
      // 6cc: if_icmpge 717
      // 6cf: goto 6dc
      // 6d2: ldc2_w 8866053187179251653
      // 6d5: lload 1
      // 6d6: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6db: athrow
      // 6dc: aload 3
      // 6dd: iload 21
      // 6df: invokevirtual java/lang/String.charAt (I)C
      // 6e2: istore 22
      // 6e4: iload 22
      // 6e6: sipush 26063
      // 6e9: ldc2_w 7882630035524200565
      // 6ec: lload 1
      // 6ed: lxor
      // 6ee: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f3: aload 13
      // 6f5: ifnull 737
      // 6f8: if_icmpne 717
      // 6fb: goto 708
      // 6fe: ldc2_w 8866053187179251653
      // 701: lload 1
      // 702: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 707: athrow
      // 708: sipush 29921
      // 70b: ldc2_w 1539210302699551066
      // 70e: lload 1
      // 70f: lxor
      // 710: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 715: istore 22
      // 717: lload 1
      // 718: lconst_0
      // 719: lcmp
      // 71a: iflt 744
      // 71d: aload 3
      // 71e: invokevirtual java/lang/String.length ()I
      // 721: aload 13
      // 723: ifnull 742
      // 726: iload 21
      // 728: bipush 1
      // 729: iadd
      // 72a: goto 737
      // 72d: ldc2_w 8866053187179251653
      // 730: lload 1
      // 731: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 736: athrow
      // 737: if_icmple 1c4
      // 73a: aload 3
      // 73b: iload 21
      // 73d: bipush 1
      // 73e: iadd
      // 73f: invokevirtual java/lang/String.charAt (I)C
      // 742: istore 23
      // 744: aload 13
      // 746: ifnonnull 1c4
      // 749: aload 15
      // 74b: aload 15
      // 74d: invokevirtual java/lang/StringBuilder.length ()I
      // 750: bipush 1
      // 751: isub
      // 752: ldc2_w 7492741721270504030
      // 755: lload 1
      // 756: lload 1
      // 757: lconst_0
      // 758: lcmp
      // 759: iflt 541
      // 75c: invokedynamic s (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 761: aload 13
      // 763: ifnull 812
      // 766: sipush 29921
      // 769: ldc2_w 1539210302699551066
      // 76c: lload 1
      // 76d: lxor
      // 76e: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 773: goto 780
      // 776: ldc2_w 8866053187179251653
      // 779: lload 1
      // 77a: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77f: athrow
      // 780: if_icmpeq 7df
      // 783: aload 15
      // 785: aload 15
      // 787: invokevirtual java/lang/StringBuilder.length ()I
      // 78a: bipush 1
      // 78b: isub
      // 78c: ldc2_w 7492741721270504030
      // 78f: lload 1
      // 790: invokedynamic s (Ljava/lang/Object;IJJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 795: aload 13
      // 797: ifnull 812
      // 79a: goto 7a7
      // 79d: ldc2_w 8866053187179251653
      // 7a0: lload 1
      // 7a1: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a6: athrow
      // 7a7: lload 1
      // 7a8: lconst_0
      // 7a9: lcmp
      // 7aa: iflt 7e1
      // 7ad: sipush 17957
      // 7b0: ldc2_w 6561982588034124695
      // 7b3: lload 1
      // 7b4: lxor
      // 7b5: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ba: if_icmpeq 7df
      // 7bd: goto 7ca
      // 7c0: ldc2_w 8866053187179251653
      // 7c3: lload 1
      // 7c4: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c9: athrow
      // 7ca: aload 15
      // 7cc: ldc "\""
      // 7ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d1: pop
      // 7d2: goto 7df
      // 7d5: ldc2_w 8866053187179251653
      // 7d8: lload 1
      // 7d9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7de: athrow
      // 7df: iload 21
      // 7e1: istore 16
      // 7e3: aload 3
      // 7e4: iload 16
      // 7e6: aload 17
      // 7e8: lload 9
      // 7ea: bipush 4
      // 7eb: anewarray 528
      // 7ee: dup_x2
      // 7ef: dup_x2
      // 7f0: pop
      // 7f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7f4: bipush 3
      // 7f5: swap
      // 7f6: aastore
      // 7f7: dup_x1
      // 7f8: swap
      // 7f9: bipush 2
      // 7fa: swap
      // 7fb: aastore
      // 7fc: dup_x1
      // 7fd: swap
      // 7fe: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 801: bipush 1
      // 802: swap
      // 803: aastore
      // 804: dup_x1
      // 805: swap
      // 806: bipush 0
      // 807: swap
      // 808: aastore
      // 809: ldc2_w 7428190698907433009
      // 80c: lload 1
      // 80d: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 812: istore 18
      // 814: aload 13
      // 816: ifnonnull 0b0
      // 819: aload 15
      // 81b: aload 3
      // 81c: iload 16
      // 81e: iload 14
      // 820: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 823: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 826: pop
      // 827: lload 1
      // 828: lconst_0
      // 829: lcmp
      // 82a: ifle 82d
      // 82d: aload 15
      // 82f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 832: lload 1
      // 833: lconst_0
      // 834: lcmp
      // 835: iflt 851
      // 838: ldc2_w 9094233266973722380
      // 83b: lload 1
      // 83c: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 841: ifnonnull 85e
      // 844: bipush 5
      // 845: anewarray 15
      // 848: ldc2_w 7380835569615989049
      // 84b: lload 1
      // 84c: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 851: goto 85e
      // 854: ldc2_w 8866053187179251653
      // 857: lload 1
      // 858: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85d: athrow
      // 85e: areturn
   }

   public static String N(Object[] param0) {
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
      // 004: checkcast [Ljava/lang/String;
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Properties
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/sz
      // 021: astore 9
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/sz
      // 029: astore 4
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/sz
      // 031: astore 10
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/zr
      // 03a: astore 7
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast java/lang/Integer
      // 043: invokevirtual java/lang/Integer.intValue ()I
      // 046: istore 11
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast java/lang/String
      // 04f: astore 3
      // 050: dup
      // 051: bipush 9
      // 053: aaload
      // 054: checkcast java/io/PrintWriter
      // 057: astore 1
      // 058: dup
      // 059: bipush 10
      // 05b: aaload
      // 05c: checkcast java/lang/Boolean
      // 05f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 062: istore 8
      // 064: pop
      // 065: iload 5
      // 067: i2l
      // 068: bipush 32
      // 06a: lshl
      // 06b: iload 11
      // 06d: i2l
      // 06e: bipush 32
      // 070: lshl
      // 071: bipush 32
      // 073: lushr
      // 074: lor
      // 075: getstatic com/zelix/g3.a J
      // 078: lxor
      // 079: lstore 12
      // 07b: lload 12
      // 07d: dup2
      // 07e: ldc2_w 16978251559560
      // 081: lxor
      // 082: lstore 14
      // 084: dup2
      // 085: ldc2_w 29817716232138
      // 088: lxor
      // 089: lstore 16
      // 08b: dup2
      // 08c: ldc2_w 57999223530454
      // 08f: lxor
      // 090: dup2
      // 091: bipush 32
      // 093: lushr
      // 094: l2i
      // 095: istore 18
      // 097: dup2
      // 098: bipush 32
      // 09a: lshl
      // 09b: bipush 48
      // 09d: lushr
      // 09e: l2i
      // 09f: istore 19
      // 0a1: dup2
      // 0a2: bipush 48
      // 0a4: lshl
      // 0a5: bipush 48
      // 0a7: lushr
      // 0a8: l2i
      // 0a9: istore 20
      // 0ab: pop2
      // 0ac: dup2
      // 0ad: ldc2_w 79818157035632
      // 0b0: lxor
      // 0b1: lstore 21
      // 0b3: dup2
      // 0b4: ldc2_w 70831512342298
      // 0b7: lxor
      // 0b8: lstore 23
      // 0ba: dup2
      // 0bb: ldc2_w 15713839453718
      // 0be: lxor
      // 0bf: lstore 25
      // 0c1: dup2
      // 0c2: ldc2_w 64472542148961
      // 0c5: lxor
      // 0c6: lstore 27
      // 0c8: dup2
      // 0c9: ldc2_w 129502023579490
      // 0cc: lxor
      // 0cd: lstore 29
      // 0cf: dup2
      // 0d0: ldc2_w 21155193399737
      // 0d3: lxor
      // 0d4: lstore 31
      // 0d6: dup2
      // 0d7: ldc2_w 128888285781318
      // 0da: lxor
      // 0db: lstore 33
      // 0dd: dup2
      // 0de: ldc2_w 87499963170081
      // 0e1: lxor
      // 0e2: lstore 35
      // 0e4: dup2
      // 0e5: ldc2_w 60770350851693
      // 0e8: lxor
      // 0e9: lstore 37
      // 0eb: dup2
      // 0ec: ldc2_w 66645021926718
      // 0ef: lxor
      // 0f0: lstore 39
      // 0f2: dup2
      // 0f3: ldc2_w 128459429707057
      // 0f6: lxor
      // 0f7: lstore 41
      // 0f9: dup2
      // 0fa: ldc2_w 113425405513252
      // 0fd: lxor
      // 0fe: lstore 43
      // 100: dup2
      // 101: ldc2_w 24797494096040
      // 104: lxor
      // 105: lstore 45
      // 107: dup2
      // 108: ldc2_w 81327926375047
      // 10b: lxor
      // 10c: lstore 47
      // 10e: dup2
      // 10f: ldc2_w 39648257533793
      // 112: lxor
      // 113: lstore 49
      // 115: dup2
      // 116: ldc2_w 52676514111771
      // 119: lxor
      // 11a: lstore 51
      // 11c: pop2
      // 11d: ldc2_w 3251301814133286951
      // 120: lload 12
      // 122: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: aload 1
      // 128: ldc ""
      // 12a: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 12d: aload 1
      // 12e: sipush 22918
      // 131: ldc2_w 5788147517185236061
      // 134: lload 12
      // 136: lxor
      // 137: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 13f: astore 53
      // 141: aload 1
      // 142: sipush 21828
      // 145: ldc2_w 204936355137982610
      // 148: lload 12
      // 14a: lxor
      // 14b: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 153: bipush 0
      // 154: istore 54
      // 156: iload 54
      // 158: aload 2
      // 159: arraylength
      // 15a: if_icmpge 196
      // 15d: aload 1
      // 15e: aload 2
      // 15f: iload 54
      // 161: aaload
      // 162: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 165: iinc 54 1
      // 168: aload 53
      // 16a: iload 5
      // 16c: ifle 174
      // 16f: ifnull 1a8
      // 172: aload 53
      // 174: ifnonnull 156
      // 177: iload 5
      // 179: iflt 168
      // 17c: goto 18a
      // 17f: ldc2_w 4034019206219713332
      // 182: lload 12
      // 184: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: ldc "nRZdqc"
      // 18c: ldc2_w 3817406478485017977
      // 18f: lload 12
      // 191: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: aload 1
      // 197: sipush 21828
      // 19a: ldc2_w 204936355137982610
      // 19d: lload 12
      // 19f: lxor
      // 1a0: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1a8: new java/lang/StringBuilder
      // 1ab: dup
      // 1ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 1af: astore 54
      // 1b1: bipush 0
      // 1b2: istore 55
      // 1b4: iload 55
      // 1b6: aload 2
      // 1b7: arraylength
      // 1b8: if_icmpge 29c
      // 1bb: aload 54
      // 1bd: invokevirtual java/lang/StringBuilder.length ()I
      // 1c0: aload 53
      // 1c2: iload 5
      // 1c4: ifle 1ff
      // 1c7: ifnull 1f8
      // 1ca: ifle 1f1
      // 1cd: goto 1db
      // 1d0: ldc2_w 4034019206219713332
      // 1d3: lload 12
      // 1d5: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: aload 54
      // 1dd: ldc " "
      // 1df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e2: pop
      // 1e3: goto 1f1
      // 1e6: ldc2_w 4034019206219713332
      // 1e9: lload 12
      // 1eb: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: aload 2
      // 1f2: iload 55
      // 1f4: aaload
      // 1f5: invokevirtual java/lang/String.length ()I
      // 1f8: iload 5
      // 1fa: iflt 229
      // 1fd: aload 53
      // 1ff: ifnull 229
      // 202: ifle 27c
      // 205: goto 213
      // 208: ldc2_w 4034019206219713332
      // 20b: lload 12
      // 20d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: athrow
      // 213: aload 2
      // 214: iload 55
      // 216: aaload
      // 217: bipush 0
      // 218: invokevirtual java/lang/String.charAt (I)C
      // 21b: goto 229
      // 21e: ldc2_w 4034019206219713332
      // 221: lload 12
      // 223: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: sipush 1103
      // 22c: ldc2_w 364699573283521793
      // 22f: lload 12
      // 231: lxor
      // 232: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: if_icmpne 27c
      // 23a: aload 54
      // 23c: sipush 789
      // 23f: ldc2_w 8221118371443558115
      // 242: lload 12
      // 244: lxor
      // 245: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24d: pop
      // 24e: aload 54
      // 250: ldc " "
      // 252: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 255: pop
      // 256: aload 54
      // 258: aload 2
      // 259: iload 55
      // 25b: aaload
      // 25c: bipush 1
      // 25d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 260: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 263: pop
      // 264: aload 53
      // 266: iload 11
      // 268: ifge 299
      // 26b: ifnonnull 294
      // 26e: goto 27c
      // 271: ldc2_w 4034019206219713332
      // 274: lload 12
      // 276: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: athrow
      // 27c: aload 54
      // 27e: aload 2
      // 27f: iload 55
      // 281: aaload
      // 282: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 285: pop
      // 286: goto 294
      // 289: ldc2_w 4034019206219713332
      // 28c: lload 12
      // 28e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: athrow
      // 294: iinc 55 1
      // 297: aload 53
      // 299: ifnonnull 1b4
      // 29c: iload 5
      // 29e: ifle 1bb
      // 2a1: new com/zelix/sz
      // 2a4: dup
      // 2a5: iload 18
      // 2a7: iload 19
      // 2a9: i2s
      // 2aa: iload 20
      // 2ac: i2c
      // 2ad: invokespecial com/zelix/sz.<init> (ISC)V
      // 2b0: astore 55
      // 2b2: aload 54
      // 2b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b7: lload 31
      // 2b9: dup2_x1
      // 2ba: pop2
      // 2bb: aload 55
      // 2bd: bipush 3
      // 2be: anewarray 528
      // 2c1: dup_x1
      // 2c2: swap
      // 2c3: bipush 2
      // 2c4: swap
      // 2c5: aastore
      // 2c6: dup_x1
      // 2c7: swap
      // 2c8: bipush 1
      // 2c9: swap
      // 2ca: aastore
      // 2cb: dup_x2
      // 2cc: dup_x2
      // 2cd: pop
      // 2ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d1: bipush 0
      // 2d2: swap
      // 2d3: aastore
      // 2d4: ldc2_w 3872224150508252782
      // 2d7: lload 12
      // 2d9: invokedynamic m (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: astore 56
      // 2e0: aload 56
      // 2e2: ifnonnull 38f
      // 2e5: new java/lang/StringBuilder
      // 2e8: dup
      // 2e9: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ec: sipush 4711
      // 2ef: ldc2_w 5636080420785805246
      // 2f2: lload 12
      // 2f4: lxor
      // 2f5: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fd: aload 55
      // 2ff: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 302: checkcast java/lang/String
      // 305: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 308: sipush 18008
      // 30b: ldc2_w 4386743983113339785
      // 30e: lload 12
      // 310: lxor
      // 311: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 319: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 31c: astore 57
      // 31e: aload 53
      // 320: iload 5
      // 322: iflt 377
      // 325: ifnull 375
      // 328: iload 8
      // 32a: ifeq 37a
      // 32d: goto 33b
      // 330: ldc2_w 4034019206219713332
      // 333: lload 12
      // 335: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: athrow
      // 33b: aload 57
      // 33d: aload 3
      // 33e: lload 21
      // 340: aload 1
      // 341: bipush 4
      // 342: anewarray 528
      // 345: dup_x1
      // 346: swap
      // 347: bipush 3
      // 348: swap
      // 349: aastore
      // 34a: dup_x2
      // 34b: dup_x2
      // 34c: pop
      // 34d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 350: bipush 2
      // 351: swap
      // 352: aastore
      // 353: dup_x1
      // 354: swap
      // 355: bipush 1
      // 356: swap
      // 357: aastore
      // 358: dup_x1
      // 359: swap
      // 35a: bipush 0
      // 35b: swap
      // 35c: aastore
      // 35d: ldc2_w 3356993058834963246
      // 360: lload 12
      // 362: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: goto 375
      // 36a: ldc2_w 4034019206219713332
      // 36d: lload 12
      // 36f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 374: athrow
      // 375: aload 53
      // 377: ifnonnull 38f
      // 37a: new java/lang/RuntimeException
      // 37d: dup
      // 37e: aload 57
      // 380: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 383: athrow
      // 384: ldc2_w 4034019206219713332
      // 387: lload 12
      // 389: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: athrow
      // 38f: new com/zelix/sz
      // 392: dup
      // 393: iload 18
      // 395: iload 19
      // 397: i2s
      // 398: iload 20
      // 39a: i2c
      // 39b: invokespecial com/zelix/sz.<init> (ISC)V
      // 39e: astore 57
      // 3a0: aconst_null
      // 3a1: astore 58
      // 3a3: aload 56
      // 3a5: aload 1
      // 3a6: aload 57
      // 3a8: aload 6
      // 3aa: lload 35
      // 3ac: bipush 5
      // 3ad: anewarray 528
      // 3b0: dup_x2
      // 3b1: dup_x2
      // 3b2: pop
      // 3b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3b6: bipush 4
      // 3b7: swap
      // 3b8: aastore
      // 3b9: dup_x1
      // 3ba: swap
      // 3bb: bipush 3
      // 3bc: swap
      // 3bd: aastore
      // 3be: dup_x1
      // 3bf: swap
      // 3c0: bipush 2
      // 3c1: swap
      // 3c2: aastore
      // 3c3: dup_x1
      // 3c4: swap
      // 3c5: bipush 1
      // 3c6: swap
      // 3c7: aastore
      // 3c8: dup_x1
      // 3c9: swap
      // 3ca: bipush 0
      // 3cb: swap
      // 3cc: aastore
      // 3cd: ldc2_w 3690314253446381141
      // 3d0: lload 12
      // 3d2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/lqq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d7: astore 58
      // 3d9: aload 57
      // 3db: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 3de: aload 53
      // 3e0: ifnull 407
      // 3e3: ifnull 414
      // 3e6: goto 3f4
      // 3e9: ldc2_w 4034019206219713332
      // 3ec: lload 12
      // 3ee: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: athrow
      // 3f4: aload 57
      // 3f6: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 3f9: goto 407
      // 3fc: ldc2_w 4034019206219713332
      // 3ff: lload 12
      // 401: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: athrow
      // 407: checkcast java/io/Reader
      // 40a: ldc2_w 3338610800811120678
      // 40d: lload 12
      // 40f: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: goto 5a8
      // 417: astore 59
      // 419: goto 5a8
      // 41c: astore 59
      // 41e: aload 59
      // 420: athrow
      // 421: astore 59
      // 423: new java/lang/StringBuilder
      // 426: dup
      // 427: invokespecial java/lang/StringBuilder.<init> ()V
      // 42a: sipush 28858
      // 42d: ldc2_w 1884663266767713600
      // 430: lload 12
      // 432: lxor
      // 433: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 438: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 43b: aload 59
      // 43d: ldc2_w 3035717121515658144
      // 440: lload 12
      // 442: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 447: aload 53
      // 449: ifnull 477
      // 44c: ifnull 47a
      // 44f: goto 45d
      // 452: ldc2_w 4034019206219713332
      // 455: lload 12
      // 457: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45c: athrow
      // 45d: aload 59
      // 45f: ldc2_w 3035717121515658144
      // 462: lload 12
      // 464: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 469: goto 477
      // 46c: ldc2_w 4034019206219713332
      // 46f: lload 12
      // 471: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 476: athrow
      // 477: goto 47c
      // 47a: aload 59
      // 47c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 47f: sipush 30948
      // 482: ldc2_w 3923960973200145724
      // 485: lload 12
      // 487: lxor
      // 488: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 490: aload 3
      // 491: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 494: sipush 25768
      // 497: ldc2_w 2482511836137333114
      // 49a: lload 12
      // 49c: lxor
      // 49d: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4a8: astore 60
      // 4aa: aload 53
      // 4ac: iload 11
      // 4ae: ifge 503
      // 4b1: ifnull 501
      // 4b4: iload 8
      // 4b6: ifeq 50b
      // 4b9: goto 4c7
      // 4bc: ldc2_w 4034019206219713332
      // 4bf: lload 12
      // 4c1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c6: athrow
      // 4c7: aload 60
      // 4c9: aload 3
      // 4ca: lload 21
      // 4cc: aload 1
      // 4cd: bipush 4
      // 4ce: anewarray 528
      // 4d1: dup_x1
      // 4d2: swap
      // 4d3: bipush 3
      // 4d4: swap
      // 4d5: aastore
      // 4d6: dup_x2
      // 4d7: dup_x2
      // 4d8: pop
      // 4d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4dc: bipush 2
      // 4dd: swap
      // 4de: aastore
      // 4df: dup_x1
      // 4e0: swap
      // 4e1: bipush 1
      // 4e2: swap
      // 4e3: aastore
      // 4e4: dup_x1
      // 4e5: swap
      // 4e6: bipush 0
      // 4e7: swap
      // 4e8: aastore
      // 4e9: ldc2_w 3356993058834963246
      // 4ec: lload 12
      // 4ee: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f3: goto 501
      // 4f6: ldc2_w 4034019206219713332
      // 4f9: lload 12
      // 4fb: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 500: athrow
      // 501: aload 53
      // 503: iload 5
      // 505: iflt 525
      // 508: ifnonnull 520
      // 50b: new java/lang/RuntimeException
      // 50e: dup
      // 50f: aload 60
      // 511: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 514: athrow
      // 515: ldc2_w 4034019206219713332
      // 518: lload 12
      // 51a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51f: athrow
      // 520: aload 57
      // 522: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 525: aload 53
      // 527: ifnull 54e
      // 52a: ifnull 55b
      // 52d: goto 53b
      // 530: ldc2_w 4034019206219713332
      // 533: lload 12
      // 535: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53a: athrow
      // 53b: aload 57
      // 53d: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 540: goto 54e
      // 543: ldc2_w 4034019206219713332
      // 546: lload 12
      // 548: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54d: athrow
      // 54e: checkcast java/io/Reader
      // 551: ldc2_w 3338610800811120678
      // 554: lload 12
      // 556: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55b: goto 5a8
      // 55e: astore 59
      // 560: goto 5a8
      // 563: astore 61
      // 565: aload 57
      // 567: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 56a: aload 53
      // 56c: ifnull 593
      // 56f: ifnull 5a0
      // 572: goto 580
      // 575: ldc2_w 4034019206219713332
      // 578: lload 12
      // 57a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57f: athrow
      // 580: aload 57
      // 582: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 585: goto 593
      // 588: ldc2_w 4034019206219713332
      // 58b: lload 12
      // 58d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 592: athrow
      // 593: checkcast java/io/Reader
      // 596: ldc2_w 3338610800811120678
      // 599: lload 12
      // 59b: invokedynamic r (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a0: goto 5a5
      // 5a3: astore 62
      // 5a5: aload 61
      // 5a7: athrow
      // 5a8: aconst_null
      // 5a9: astore 59
      // 5ab: sipush 1356
      // 5ae: new com/zelix/sz
      // 5b1: dup
      // 5b2: iload 18
      // 5b4: iload 19
      // 5b6: i2s
      // 5b7: iload 20
      // 5b9: i2c
      // 5ba: invokespecial com/zelix/sz.<init> (ISC)V
      // 5bd: astore 60
      // 5bf: ldc2_w 6410474901573714088
      // 5c2: lload 12
      // 5c4: lxor
      // 5c5: sipush 7461
      // 5c8: ldc2_w 5440745934620662887
      // 5cb: lload 12
      // 5cd: lxor
      // 5ce: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d3: lload 37
      // 5d5: bipush 2
      // 5d6: anewarray 528
      // 5d9: dup_x2
      // 5da: dup_x2
      // 5db: pop
      // 5dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5df: bipush 1
      // 5e0: swap
      // 5e1: aastore
      // 5e2: dup_x1
      // 5e3: swap
      // 5e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 5e7: bipush 0
      // 5e8: swap
      // 5e9: aastore
      // 5ea: ldc2_w 3057431874699935014
      // 5ed: lload 12
      // 5ef: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f4: astore 61
      // 5f6: aload 58
      // 5f8: lload 25
      // 5fa: aload 61
      // 5fc: bipush 2
      // 5fd: anewarray 528
      // 600: dup_x1
      // 601: swap
      // 602: bipush 1
      // 603: swap
      // 604: aastore
      // 605: dup_x2
      // 606: dup_x2
      // 607: pop
      // 608: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 60b: bipush 0
      // 60c: swap
      // 60d: aastore
      // 60e: ldc2_w 3669799128629954398
      // 611: lload 12
      // 613: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 618: astore 62
      // 61a: aload 62
      // 61c: lload 33
      // 61e: bipush 2
      // 61f: anewarray 528
      // 622: dup_x2
      // 623: dup_x2
      // 624: pop
      // 625: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 628: bipush 1
      // 629: swap
      // 62a: aastore
      // 62b: dup_x1
      // 62c: swap
      // 62d: bipush 0
      // 62e: swap
      // 62f: aastore
      // 630: ldc2_w 3233120632820209188
      // 633: lload 12
      // 635: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63a: astore 63
      // 63c: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 641: aload 63
      // 643: ldc2_w 3038539474001692504
      // 646: lload 12
      // 648: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64d: pop
      // 64e: sipush 25251
      // 651: ldc2_w 7666059262945011530
      // 654: lload 12
      // 656: lxor
      // 657: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65c: aload 58
      // 65e: lload 39
      // 660: bipush 1
      // 661: anewarray 528
      // 664: dup_x2
      // 665: dup_x2
      // 666: pop
      // 667: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66a: bipush 0
      // 66b: swap
      // 66c: aastore
      // 66d: ldc2_w 3225919177626089506
      // 670: lload 12
      // 672: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 677: ldc2_w 3038539474001692504
      // 67a: lload 12
      // 67c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 681: pop
      // 682: sipush 22125
      // 685: ldc2_w 565779214749275015
      // 688: lload 12
      // 68a: lxor
      // 68b: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 690: aload 58
      // 692: lload 49
      // 694: bipush 1
      // 695: anewarray 528
      // 698: dup_x2
      // 699: dup_x2
      // 69a: pop
      // 69b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 69e: bipush 0
      // 69f: swap
      // 6a0: aastore
      // 6a1: ldc2_w 3492557497122236519
      // 6a4: lload 12
      // 6a6: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ab: ldc2_w 3038539474001692504
      // 6ae: lload 12
      // 6b0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b5: pop
      // 6b6: lload 45
      // 6b8: aload 60
      // 6ba: aload 62
      // 6bc: aload 61
      // 6be: bipush 4
      // 6bf: anewarray 528
      // 6c2: dup_x1
      // 6c3: swap
      // 6c4: bipush 3
      // 6c5: swap
      // 6c6: aastore
      // 6c7: dup_x1
      // 6c8: swap
      // 6c9: bipush 2
      // 6ca: swap
      // 6cb: aastore
      // 6cc: dup_x1
      // 6cd: swap
      // 6ce: bipush 1
      // 6cf: swap
      // 6d0: aastore
      // 6d1: dup_x2
      // 6d2: dup_x2
      // 6d3: pop
      // 6d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d7: bipush 0
      // 6d8: swap
      // 6d9: aastore
      // 6da: ldc2_w 3257034852650849021
      // 6dd: lload 12
      // 6df: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e4: astore 59
      // 6e6: goto 804
      // 6e9: astore 64
      // 6eb: new java/lang/StringBuilder
      // 6ee: dup
      // 6ef: invokespecial java/lang/StringBuilder.<init> ()V
      // 6f2: sipush 23654
      // 6f5: iload 5
      // 6f7: iflt 714
      // 6fa: ldc2_w 242719403840182705
      // 6fd: lload 12
      // 6ff: lxor
      // 700: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 705: aload 53
      // 707: ifnull 741
      // 70a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 70d: aload 60
      // 70f: lload 51
      // 711: invokevirtual com/zelix/sz.a (J)Z
      // 714: ifeq 744
      // 717: goto 725
      // 71a: ldc2_w 4034019206219713332
      // 71d: lload 12
      // 71f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 724: athrow
      // 725: sipush 25921
      // 728: ldc2_w 6417724105573769378
      // 72b: lload 12
      // 72d: lxor
      // 72e: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 733: goto 741
      // 736: ldc2_w 4034019206219713332
      // 739: lload 12
      // 73b: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 740: athrow
      // 741: goto 76b
      // 744: new java/io/File
      // 747: dup
      // 748: aload 60
      // 74a: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 74d: checkcast java/lang/String
      // 750: sipush 25921
      // 753: ldc2_w 6417724105573769378
      // 756: lload 12
      // 758: lxor
      // 759: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75e: invokespecial java/io/File.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 761: ldc2_w 3706002077882043925
      // 764: lload 12
      // 766: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76e: sipush 30918
      // 771: ldc2_w 6811810391780605206
      // 774: lload 12
      // 776: lxor
      // 777: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77f: aload 64
      // 781: ldc2_w 3101846263105801115
      // 784: lload 12
      // 786: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 78e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 791: astore 65
      // 793: aload 53
      // 795: iload 11
      // 797: ifge 7ec
      // 79a: ifnull 7ea
      // 79d: iload 8
      // 79f: ifeq 7ef
      // 7a2: goto 7b0
      // 7a5: ldc2_w 4034019206219713332
      // 7a8: lload 12
      // 7aa: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7af: athrow
      // 7b0: aload 65
      // 7b2: aload 3
      // 7b3: lload 21
      // 7b5: aload 1
      // 7b6: bipush 4
      // 7b7: anewarray 528
      // 7ba: dup_x1
      // 7bb: swap
      // 7bc: bipush 3
      // 7bd: swap
      // 7be: aastore
      // 7bf: dup_x2
      // 7c0: dup_x2
      // 7c1: pop
      // 7c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c5: bipush 2
      // 7c6: swap
      // 7c7: aastore
      // 7c8: dup_x1
      // 7c9: swap
      // 7ca: bipush 1
      // 7cb: swap
      // 7cc: aastore
      // 7cd: dup_x1
      // 7ce: swap
      // 7cf: bipush 0
      // 7d0: swap
      // 7d1: aastore
      // 7d2: ldc2_w 3356993058834963246
      // 7d5: lload 12
      // 7d7: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7dc: goto 7ea
      // 7df: ldc2_w 4034019206219713332
      // 7e2: lload 12
      // 7e4: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e9: athrow
      // 7ea: aload 53
      // 7ec: ifnonnull 804
      // 7ef: new java/lang/RuntimeException
      // 7f2: dup
      // 7f3: aload 65
      // 7f5: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 7f8: athrow
      // 7f9: ldc2_w 4034019206219713332
      // 7fc: lload 12
      // 7fe: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 803: athrow
      // 804: new java/lang/StringBuilder
      // 807: dup
      // 808: invokespecial java/lang/StringBuilder.<init> ()V
      // 80b: sipush 12862
      // 80e: ldc2_w 8338593834019092427
      // 811: lload 12
      // 813: lxor
      // 814: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 819: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 81c: aload 61
      // 81e: lload 41
      // 820: bipush 2
      // 821: anewarray 528
      // 824: dup_x2
      // 825: dup_x2
      // 826: pop
      // 827: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 82a: bipush 1
      // 82b: swap
      // 82c: aastore
      // 82d: dup_x1
      // 82e: swap
      // 82f: bipush 0
      // 830: swap
      // 831: aastore
      // 832: ldc2_w 3071959488268935508
      // 835: lload 12
      // 837: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 83f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 842: astore 64
      // 844: aload 58
      // 846: lload 29
      // 848: aload 64
      // 84a: bipush 2
      // 84b: anewarray 528
      // 84e: dup_x1
      // 84f: swap
      // 850: bipush 1
      // 851: swap
      // 852: aastore
      // 853: dup_x2
      // 854: dup_x2
      // 855: pop
      // 856: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 859: bipush 0
      // 85a: swap
      // 85b: aastore
      // 85c: ldc2_w 3568776618083688206
      // 85f: lload 12
      // 861: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 866: aload 59
      // 868: aload 53
      // 86a: ifnull 930
      // 86d: ifnull 8e4
      // 870: goto 87e
      // 873: ldc2_w 4034019206219713332
      // 876: lload 12
      // 878: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87d: athrow
      // 87e: aload 59
      // 880: aload 53
      // 882: ifnull 930
      // 885: goto 893
      // 888: ldc2_w 4034019206219713332
      // 88b: lload 12
      // 88d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 892: athrow
      // 893: invokevirtual java/lang/String.length ()I
      // 896: ifle 8e4
      // 899: goto 8a7
      // 89c: ldc2_w 4034019206219713332
      // 89f: lload 12
      // 8a1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a6: athrow
      // 8a7: aload 58
      // 8a9: lload 23
      // 8ab: aload 59
      // 8ad: aload 60
      // 8af: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 8b2: checkcast java/lang/String
      // 8b5: bipush 3
      // 8b6: anewarray 528
      // 8b9: dup_x1
      // 8ba: swap
      // 8bb: bipush 2
      // 8bc: swap
      // 8bd: aastore
      // 8be: dup_x1
      // 8bf: swap
      // 8c0: bipush 1
      // 8c1: swap
      // 8c2: aastore
      // 8c3: dup_x2
      // 8c4: dup_x2
      // 8c5: pop
      // 8c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8c9: bipush 0
      // 8ca: swap
      // 8cb: aastore
      // 8cc: ldc2_w 3843905353181211266
      // 8cf: lload 12
      // 8d1: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d6: goto 8e4
      // 8d9: ldc2_w 4034019206219713332
      // 8dc: lload 12
      // 8de: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e3: athrow
      // 8e4: aload 58
      // 8e6: sipush 5264
      // 8e9: ldc2_w 9179037070155043198
      // 8ec: lload 12
      // 8ee: lxor
      // 8ef: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f4: bipush 1
      // 8f5: bipush 1
      // 8f6: new java/util/ArrayList
      // 8f9: dup
      // 8fa: invokespecial java/util/ArrayList.<init> ()V
      // 8fd: lload 27
      // 8ff: bipush 5
      // 900: anewarray 528
      // 903: dup_x2
      // 904: dup_x2
      // 905: pop
      // 906: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 909: bipush 4
      // 90a: swap
      // 90b: aastore
      // 90c: dup_x1
      // 90d: swap
      // 90e: bipush 3
      // 90f: swap
      // 910: aastore
      // 911: dup_x1
      // 912: swap
      // 913: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 916: bipush 2
      // 917: swap
      // 918: aastore
      // 919: dup_x1
      // 91a: swap
      // 91b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 91e: bipush 1
      // 91f: swap
      // 920: aastore
      // 921: dup_x1
      // 922: swap
      // 923: bipush 0
      // 924: swap
      // 925: aastore
      // 926: ldc2_w 3401127778088936234
      // 929: lload 12
      // 92b: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 930: astore 65
      // 932: aload 9
      // 934: aload 58
      // 936: lload 14
      // 938: bipush 1
      // 939: anewarray 528
      // 93c: dup_x2
      // 93d: dup_x2
      // 93e: pop
      // 93f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 942: bipush 0
      // 943: swap
      // 944: aastore
      // 945: ldc2_w 3192746872333546661
      // 948: lload 12
      // 94a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94f: lload 47
      // 951: dup2_x1
      // 952: pop2
      // 953: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 956: aload 4
      // 958: aload 58
      // 95a: lload 16
      // 95c: bipush 1
      // 95d: anewarray 528
      // 960: dup_x2
      // 961: dup_x2
      // 962: pop
      // 963: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 966: bipush 0
      // 967: swap
      // 968: aastore
      // 969: ldc2_w 3413147112584374733
      // 96c: lload 12
      // 96e: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 973: lload 47
      // 975: dup2_x1
      // 976: pop2
      // 977: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 97a: aload 10
      // 97c: aload 58
      // 97e: lload 43
      // 980: bipush 1
      // 981: anewarray 528
      // 984: dup_x2
      // 985: dup_x2
      // 986: pop
      // 987: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 98a: bipush 0
      // 98b: swap
      // 98c: aastore
      // 98d: ldc2_w 3169955635833296128
      // 990: lload 12
      // 992: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 997: lload 47
      // 999: dup2_x1
      // 99a: pop2
      // 99b: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 99e: aload 7
      // 9a0: aload 58
      // 9a2: ldc2_w 3550509797205633806
      // 9a5: lload 12
      // 9a7: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9ac: invokevirtual com/zelix/zr.I (Z)V
      // 9af: aload 55
      // 9b1: lload 47
      // 9b3: aconst_null
      // 9b4: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 9b7: lload 31
      // 9b9: aload 65
      // 9bb: aload 55
      // 9bd: bipush 3
      // 9be: anewarray 528
      // 9c1: dup_x1
      // 9c2: swap
      // 9c3: bipush 2
      // 9c4: swap
      // 9c5: aastore
      // 9c6: dup_x1
      // 9c7: swap
      // 9c8: bipush 1
      // 9c9: swap
      // 9ca: aastore
      // 9cb: dup_x2
      // 9cc: dup_x2
      // 9cd: pop
      // 9ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9d1: bipush 0
      // 9d2: swap
      // 9d3: aastore
      // 9d4: ldc2_w 3872224150508252782
      // 9d7: lload 12
      // 9d9: invokedynamic m (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9de: astore 66
      // 9e0: aload 66
      // 9e2: aload 53
      // 9e4: ifnull aa4
      // 9e7: ifnonnull aa2
      // 9ea: goto 9f8
      // 9ed: ldc2_w 4034019206219713332
      // 9f0: lload 12
      // 9f2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f7: athrow
      // 9f8: new java/lang/StringBuilder
      // 9fb: dup
      // 9fc: invokespecial java/lang/StringBuilder.<init> ()V
      // 9ff: sipush 6365
      // a02: ldc2_w 6828676554970193155
      // a05: lload 12
      // a07: lxor
      // a08: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a10: aload 55
      // a12: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // a15: checkcast java/lang/String
      // a18: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a1b: sipush 4611
      // a1e: ldc2_w 2982484025715841007
      // a21: lload 12
      // a23: lxor
      // a24: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a29: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a2c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a2f: astore 67
      // a31: aload 53
      // a33: iload 5
      // a35: ifle a8a
      // a38: ifnull a88
      // a3b: iload 8
      // a3d: ifeq a8d
      // a40: goto a4e
      // a43: ldc2_w 4034019206219713332
      // a46: lload 12
      // a48: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4d: athrow
      // a4e: aload 67
      // a50: aload 3
      // a51: lload 21
      // a53: aload 1
      // a54: bipush 4
      // a55: anewarray 528
      // a58: dup_x1
      // a59: swap
      // a5a: bipush 3
      // a5b: swap
      // a5c: aastore
      // a5d: dup_x2
      // a5e: dup_x2
      // a5f: pop
      // a60: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a63: bipush 2
      // a64: swap
      // a65: aastore
      // a66: dup_x1
      // a67: swap
      // a68: bipush 1
      // a69: swap
      // a6a: aastore
      // a6b: dup_x1
      // a6c: swap
      // a6d: bipush 0
      // a6e: swap
      // a6f: aastore
      // a70: ldc2_w 3356993058834963246
      // a73: lload 12
      // a75: invokedynamic m (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7a: goto a88
      // a7d: ldc2_w 4034019206219713332
      // a80: lload 12
      // a82: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a87: athrow
      // a88: aload 53
      // a8a: ifnonnull aa2
      // a8d: new java/lang/RuntimeException
      // a90: dup
      // a91: aload 67
      // a93: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // a96: athrow
      // a97: ldc2_w 4034019206219713332
      // a9a: lload 12
      // a9c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa1: athrow
      // aa2: aload 66
      // aa4: ldc2_w 3706002077882043925
      // aa7: lload 12
      // aa9: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aae: areturn
   }

   private static lqq P(Object[] var0) {
      File var1 = (File)var0[0];
      PrintWriter var2 = (PrintWriter)var0[1];
      sz var3 = (sz)var0[2];
      Properties var4 = (Properties)var0[3];
      long var5 = (Long)var0[4];
      var5 = a ^ var5;
      long var7 = var5 ^ 46366553257171L;
      long var9 = var5 ^ 121022923612365L;
      long var10001 = var5 ^ 11954666612254L;
      int var11 = (int)((var5 ^ 11954666612254L) >>> 48);
      int var12 = (int)((var5 ^ 11954666612254L) << 16 >>> 48);
      int var13 = (int)(var10001 << 32 >>> 32);
      var10001 = var5 ^ 95622569559074L;
      int var14 = (int)((var5 ^ 95622569559074L) >>> 48);
      int var15 = (int)((var5 ^ 95622569559074L) << 16 >>> 32);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var5 ^ 16771261797386L;
      long var19 = var5 ^ 87085652513975L;
      long var21 = var5 ^ 128552035332560L;
      long var23 = var5 ^ 124853537265491L;
      long var25 = var5 ^ 131935427745216L;
      long var27 = var5 ^ 21806866371372L;
      Object var29 = null;
      Object var30 = null;
      lqq var31 = null;
      g1 var32 = new g1((short)var11, (char)var12, var13);
      var2.println("");
      var2.println(a<"o">(8730, 7654901477307024975L ^ var5) + m44.a<"q">(var1, 5964181406554501054L, var5) + a<"o">(22509, 7350215518401753985L ^ var5));
      var2.println(a<"o">(26435, 2618342021040292628L ^ var5));
      var2.println(m44.a<"n">(new Object[]{var9, var1}, 5892031029957947515L, var5));
      var2.println(a<"o">(21828, 205000256125890873L ^ var5));
      var2.println("");
      String var33 = m44.a<"n">(
         new Object[]{m44.a<"q">(var1, 5964181406554501054L, var5), var4, m44.a<"n">(5674010573655785928L, var5), new fk(var19), var32, var2, var17},
         5542291744877245665L,
         var5
      );
      String var34 = m44.a<"n">(new Object[]{var33, var21}, 6108977394465301192L, var5);
      var2.println("");
      var2.println(a<"o">(5974, 6932509890981311259L ^ var5));
      var2.println(a<"o">(21828, 205000256125890873L ^ var5));
      var2.println(var34.replace((char)b<"t">(25291, 3546234388718387769L ^ var5), m44.a<"j">(5535574361209315924L, var5)));
      var2.println(a<"o">(21828, 205000256125890873L ^ var5));
      var30 = new StringReader(var34);
      var3.Z(var27, var30);
      lqz var35 = new lqz(var23, (Reader)var30);
      char var41 = (char)var14;
      Object[] var10005 = new Object[]{null, null, Integer.valueOf((char)var16)};
      var10005[1] = var15;
      var10005[0] = Integer.valueOf(var41);
      var29 = (zg)m44.a<"q">(var35, var10005, 5336495503758302154L, var5);
      var31 = new lqq(var2, true, var25);
      m44.a<"q">(var29, new Object[]{null, var7, var31}, 5674133260153602602L, var5);
      return var31;
   }

   public static String[] Q() {
      return G;
   }

   public static void p(String[] var0) {
      G = var0;
   }

   private static String F(Object[] param0) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/sz
      // 012: astore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/util/Set
      // 020: astore 2
      // 021: pop
      // 022: getstatic com/zelix/g3.a J
      // 025: lload 4
      // 027: lxor
      // 028: lstore 4
      // 02a: lload 4
      // 02c: dup2
      // 02d: ldc2_w 126549370037994
      // 030: lxor
      // 031: lstore 6
      // 033: pop2
      // 034: ldc2_w 89213264398599173
      // 037: lload 4
      // 039: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aconst_null
      // 03f: astore 9
      // 041: astore 8
      // 043: ldc2_w 453470802932169427
      // 046: lload 4
      // 048: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: aload 8
      // 04f: ifnull 06d
      // 052: ifnull 070
      // 055: goto 063
      // 058: ldc2_w 2006833173913167638
      // 05b: lload 4
      // 05d: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: ldc2_w 453470802932169427
      // 066: lload 4
      // 068: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: goto 07a
      // 070: ldc2_w 2081610977418409372
      // 073: lload 4
      // 075: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: astore 10
      // 07c: ldc2_w 561969347420795441
      // 07f: lload 4
      // 081: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: aload 8
      // 088: ifnull 0f0
      // 08b: ifnull 11f
      // 08e: goto 09c
      // 091: ldc2_w 2006833173913167638
      // 094: lload 4
      // 096: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 2
      // 09d: ldc2_w 561969347420795441
      // 0a0: lload 4
      // 0a2: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0ac: pop
      // 0ad: lload 6
      // 0af: ldc2_w 561969347420795441
      // 0b2: lload 4
      // 0b4: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: aload 10
      // 0bb: aload 1
      // 0bc: bipush 4
      // 0bd: anewarray 528
      // 0c0: dup_x1
      // 0c1: swap
      // 0c2: bipush 3
      // 0c3: swap
      // 0c4: aastore
      // 0c5: dup_x1
      // 0c6: swap
      // 0c7: bipush 2
      // 0c8: swap
      // 0c9: aastore
      // 0ca: dup_x1
      // 0cb: swap
      // 0cc: bipush 1
      // 0cd: swap
      // 0ce: aastore
      // 0cf: dup_x2
      // 0d0: dup_x2
      // 0d1: pop
      // 0d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d5: bipush 0
      // 0d6: swap
      // 0d7: aastore
      // 0d8: ldc2_w 84238870803579455
      // 0db: lload 4
      // 0dd: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: goto 0f0
      // 0e5: ldc2_w 2006833173913167638
      // 0e8: lload 4
      // 0ea: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: astore 9
      // 0f2: aload 9
      // 0f4: aload 8
      // 0f6: lload 4
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: iflt 122
      // 0fd: ifnull 120
      // 100: ifnull 11f
      // 103: goto 111
      // 106: ldc2_w 2006833173913167638
      // 109: lload 4
      // 10b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 9
      // 113: areturn
      // 114: ldc2_w 2006833173913167638
      // 117: lload 4
      // 119: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: aload 3
      // 120: aload 8
      // 122: ifnull 1e3
      // 125: ifnull 199
      // 128: goto 136
      // 12b: ldc2_w 2006833173913167638
      // 12e: lload 4
      // 130: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 2
      // 137: aload 3
      // 138: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 13d: pop
      // 13e: lload 6
      // 140: aload 3
      // 141: aload 10
      // 143: aload 1
      // 144: bipush 4
      // 145: anewarray 528
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 3
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 2
      // 150: swap
      // 151: aastore
      // 152: dup_x1
      // 153: swap
      // 154: bipush 1
      // 155: swap
      // 156: aastore
      // 157: dup_x2
      // 158: dup_x2
      // 159: pop
      // 15a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15d: bipush 0
      // 15e: swap
      // 15f: aastore
      // 160: ldc2_w 84238870803579455
      // 163: lload 4
      // 165: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: astore 9
      // 16c: aload 9
      // 16e: aload 8
      // 170: lload 4
      // 172: lconst_0
      // 173: lcmp
      // 174: ifle 1e5
      // 177: ifnull 1e3
      // 17a: ifnull 199
      // 17d: goto 18b
      // 180: ldc2_w 2006833173913167638
      // 183: lload 4
      // 185: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: aload 9
      // 18d: areturn
      // 18e: ldc2_w 2006833173913167638
      // 191: lload 4
      // 193: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: athrow
      // 199: aload 2
      // 19a: ldc2_w 1951514614172956739
      // 19d: lload 4
      // 19f: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1a9: pop
      // 1aa: lload 6
      // 1ac: ldc2_w 1951514614172956739
      // 1af: lload 4
      // 1b1: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: aload 10
      // 1b8: aload 1
      // 1b9: bipush 4
      // 1ba: anewarray 528
      // 1bd: dup_x1
      // 1be: swap
      // 1bf: bipush 3
      // 1c0: swap
      // 1c1: aastore
      // 1c2: dup_x1
      // 1c3: swap
      // 1c4: bipush 2
      // 1c5: swap
      // 1c6: aastore
      // 1c7: dup_x1
      // 1c8: swap
      // 1c9: bipush 1
      // 1ca: swap
      // 1cb: aastore
      // 1cc: dup_x2
      // 1cd: dup_x2
      // 1ce: pop
      // 1cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d2: bipush 0
      // 1d3: swap
      // 1d4: aastore
      // 1d5: ldc2_w 84238870803579455
      // 1d8: lload 4
      // 1da: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: astore 9
      // 1e1: aload 9
      // 1e3: aload 8
      // 1e5: ifnull 1fb
      // 1e8: ifnull 1fc
      // 1eb: goto 1f9
      // 1ee: ldc2_w 2006833173913167638
      // 1f1: lload 4
      // 1f3: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: athrow
      // 1f9: aload 9
      // 1fb: areturn
      // 1fc: aconst_null
      // 1fd: areturn
   }

   private static boolean C(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 2
      // 15: pop
      // 16: getstatic com/zelix/g3.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w -8151874706832962585
      // 1f: lload 2
      // 20: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 1
      // 28: aload 4
      // 2a: ifnull f0
      // 2d: sipush 24640
      // 30: ldc2_w 5814622525257073352
      // 33: lload 2
      // 34: lxor
      // 35: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: if_icmpeq e2
      // 3d: goto 4a
      // 40: ldc2_w -7765331677516011276
      // 43: lload 2
      // 44: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: iload 1
      // 4b: aload 4
      // 4d: ifnull f0
      // 50: goto 5d
      // 53: ldc2_w -7765331677516011276
      // 56: lload 2
      // 57: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: lload 2
      // 5e: lconst_0
      // 5f: lcmp
      // 60: iflt e3
      // 63: sipush 29637
      // 66: ldc2_w 2878073375394976074
      // 69: lload 2
      // 6a: lxor
      // 6b: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: if_icmpeq e2
      // 73: goto 80
      // 76: ldc2_w -7765331677516011276
      // 79: lload 2
      // 7a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: iload 1
      // 81: aload 4
      // 83: ifnull f0
      // 86: goto 93
      // 89: ldc2_w -7765331677516011276
      // 8c: lload 2
      // 8d: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: lload 2
      // 94: lconst_0
      // 95: lcmp
      // 96: iflt e3
      // 99: sipush 9901
      // 9c: ldc2_w 5884574574811677737
      // 9f: lload 2
      // a0: lxor
      // a1: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: if_icmpeq e2
      // a9: goto b6
      // ac: ldc2_w -7765331677516011276
      // af: lload 2
      // b0: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: athrow
      // b6: iload 1
      // b7: aload 4
      // b9: ifnull f0
      // bc: goto c9
      // bf: ldc2_w -7765331677516011276
      // c2: lload 2
      // c3: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: athrow
      // c9: ldc2_w -7934364357815788556
      // cc: lload 2
      // cd: invokedynamic i (JJ)C bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: if_icmpne f3
      // d5: goto e2
      // d8: ldc2_w -7765331677516011276
      // db: lload 2
      // dc: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e1: athrow
      // e2: bipush 1
      // e3: goto f0
      // e6: ldc2_w -7765331677516011276
      // e9: lload 2
      // ea: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ef: athrow
      // f0: goto f4
      // f3: bipush 0
      // f4: ireturn
   }

   public static String o(Object[] param0) {
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
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Properties
      // 00f: astore 7
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Properties
      // 017: astore 3
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/fk
      // 01e: astore 2
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/util/Map
      // 025: astore 1
      // 026: dup
      // 027: bipush 5
      // 028: aaload
      // 029: checkcast java/io/PrintWriter
      // 02c: astore 6
      // 02e: dup
      // 02f: bipush 6
      // 031: aaload
      // 032: checkcast java/lang/Long
      // 035: invokevirtual java/lang/Long.longValue ()J
      // 038: lstore 4
      // 03a: pop
      // 03b: getstatic com/zelix/g3.a J
      // 03e: lload 4
      // 040: lxor
      // 041: lstore 4
      // 043: lload 4
      // 045: dup2
      // 046: ldc2_w 4311934124053
      // 049: lxor
      // 04a: lstore 9
      // 04c: dup2
      // 04d: ldc2_w 61009218693991
      // 050: lxor
      // 051: lstore 11
      // 053: dup2
      // 054: ldc2_w 69499120769965
      // 057: lxor
      // 058: lstore 13
      // 05a: dup2
      // 05b: ldc2_w 72707828512993
      // 05e: lxor
      // 05f: lstore 15
      // 061: dup2
      // 062: ldc2_w 31161772174945
      // 065: lxor
      // 066: lstore 17
      // 068: dup2
      // 069: ldc2_w 85339185035293
      // 06c: lxor
      // 06d: lstore 19
      // 06f: dup2
      // 070: ldc2_w 122305343776151
      // 073: lxor
      // 074: lstore 21
      // 076: dup2
      // 077: ldc2_w 14534176332351
      // 07a: lxor
      // 07b: lstore 23
      // 07d: pop2
      // 07e: new java/lang/StringBuilder
      // 081: dup
      // 082: invokespecial java/lang/StringBuilder.<init> ()V
      // 085: astore 26
      // 087: new java/lang/StringBuilder
      // 08a: dup
      // 08b: invokespecial java/lang/StringBuilder.<init> ()V
      // 08e: astore 27
      // 090: ldc2_w -4308342775866359540
      // 093: lload 4
      // 095: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: aconst_null
      // 09b: astore 28
      // 09d: astore 25
      // 09f: new java/io/File
      // 0a2: dup
      // 0a3: aload 8
      // 0a5: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 0a8: astore 29
      // 0aa: aload 6
      // 0ac: new java/lang/StringBuilder
      // 0af: dup
      // 0b0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b3: sipush 31101
      // 0b6: ldc2_w 2482516876550690179
      // 0b9: lload 4
      // 0bb: lxor
      // 0bc: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: aload 29
      // 0c6: ldc2_w -2718734272714889410
      // 0c9: lload 4
      // 0cb: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d3: ldc "'"
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0db: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 0de: aload 2
      // 0df: aload 29
      // 0e1: aload 25
      // 0e3: ifnull 188
      // 0e6: lload 13
      // 0e8: bipush 2
      // 0e9: anewarray 528
      // 0ec: dup_x2
      // 0ed: dup_x2
      // 0ee: pop
      // 0ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f2: bipush 1
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x1
      // 0f6: swap
      // 0f7: bipush 0
      // 0f8: swap
      // 0f9: aastore
      // 0fa: ldc2_w -2629846870031404338
      // 0fd: lload 4
      // 0ff: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: bipush -1
      // 105: if_icmple 185
      // 108: new com/zelix/ak
      // 10b: dup
      // 10c: new java/lang/StringBuilder
      // 10f: dup
      // 110: invokespecial java/lang/StringBuilder.<init> ()V
      // 113: sipush 7867
      // 116: ldc2_w 2785289148555178616
      // 119: lload 4
      // 11b: lxor
      // 11c: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: aload 29
      // 126: ldc2_w -2718734272714889410
      // 129: lload 4
      // 12b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 133: sipush 30625
      // 136: ldc2_w 8790392917905693534
      // 139: lload 4
      // 13b: lxor
      // 13c: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 144: aload 2
      // 145: lload 19
      // 147: bipush 1
      // 148: anewarray 528
      // 14b: dup_x2
      // 14c: dup_x2
      // 14d: pop
      // 14e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 151: bipush 0
      // 152: swap
      // 153: aastore
      // 154: ldc2_w -4493436654170329328
      // 157: lload 4
      // 159: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: checkcast java/io/File
      // 161: ldc2_w -2718734272714889410
      // 164: lload 4
      // 166: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16e: ldc "'"
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 176: invokespecial com/zelix/ak.<init> (Ljava/lang/String;)V
      // 179: athrow
      // 17a: ldc2_w -2391138945599102433
      // 17d: lload 4
      // 17f: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: athrow
      // 185: aload 2
      // 186: aload 29
      // 188: lload 17
      // 18a: dup2_x1
      // 18b: pop2
      // 18c: bipush 2
      // 18d: anewarray 528
      // 190: dup_x1
      // 191: swap
      // 192: bipush 1
      // 193: swap
      // 194: aastore
      // 195: dup_x2
      // 196: dup_x2
      // 197: pop
      // 198: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19b: bipush 0
      // 19c: swap
      // 19d: aastore
      // 19e: ldc2_w -4307795474200388643
      // 1a1: lload 4
      // 1a3: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: pop
      // 1a9: new java/io/BufferedReader
      // 1ac: dup
      // 1ad: new java/io/FileReader
      // 1b0: dup
      // 1b1: aload 29
      // 1b3: invokespecial java/io/FileReader.<init> (Ljava/io/File;)V
      // 1b6: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 1b9: astore 28
      // 1bb: goto 2a0
      // 1be: astore 30
      // 1c0: new com/zelix/ak
      // 1c3: dup
      // 1c4: new java/lang/StringBuilder
      // 1c7: dup
      // 1c8: invokespecial java/lang/StringBuilder.<init> ()V
      // 1cb: sipush 30108
      // 1ce: ldc2_w 8618422796056287570
      // 1d1: lload 4
      // 1d3: lxor
      // 1d4: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1dc: aload 29
      // 1de: ldc2_w -2718734272714889410
      // 1e1: lload 4
      // 1e3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1eb: ldc "'"
      // 1ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f0: aload 2
      // 1f1: lload 23
      // 1f3: bipush 1
      // 1f4: anewarray 528
      // 1f7: dup_x2
      // 1f8: dup_x2
      // 1f9: pop
      // 1fa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fd: bipush 0
      // 1fe: swap
      // 1ff: aastore
      // 200: ldc2_w -2458238718873023856
      // 203: lload 4
      // 205: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: bipush 1
      // 20b: if_icmple 26f
      // 20e: new java/lang/StringBuilder
      // 211: dup
      // 212: invokespecial java/lang/StringBuilder.<init> ()V
      // 215: sipush 14531
      // 218: ldc2_w 1268153880590455860
      // 21b: lload 4
      // 21d: lxor
      // 21e: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 226: aload 2
      // 227: lload 15
      // 229: bipush 1
      // 22a: bipush 2
      // 22b: anewarray 528
      // 22e: dup_x1
      // 22f: swap
      // 230: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 233: bipush 1
      // 234: swap
      // 235: aastore
      // 236: dup_x2
      // 237: dup_x2
      // 238: pop
      // 239: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23c: bipush 0
      // 23d: swap
      // 23e: aastore
      // 23f: ldc2_w -4194473328592978014
      // 242: lload 4
      // 244: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: checkcast java/io/File
      // 24c: ldc2_w -2718734272714889410
      // 24f: lload 4
      // 251: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 259: ldc "'"
      // 25b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 261: goto 271
      // 264: ldc2_w -2391138945599102433
      // 267: lload 4
      // 269: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: athrow
      // 26f: ldc ""
      // 271: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 274: sipush 32458
      // 277: ldc2_w 3642936553890402834
      // 27a: lload 4
      // 27c: lxor
      // 27d: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 285: aload 30
      // 287: ldc2_w -4458360867747421520
      // 28a: lload 4
      // 28c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 294: ldc "'"
      // 296: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 299: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 29c: invokespecial com/zelix/ak.<init> (Ljava/lang/String;)V
      // 29f: athrow
      // 2a0: aload 28
      // 2a2: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 2a5: dup
      // 2a6: astore 30
      // 2a8: ifnull 34f
      // 2ab: aload 26
      // 2ad: aload 30
      // 2af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b2: pop
      // 2b3: aload 26
      // 2b5: getstatic com/zelix/_e.n Ljava/lang/String;
      // 2b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bb: pop
      // 2bc: aload 30
      // 2be: ldc "#"
      // 2c0: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2c3: istore 31
      // 2c5: aload 25
      // 2c7: ifnull 44a
      // 2ca: iload 31
      // 2cc: lload 4
      // 2ce: lconst_0
      // 2cf: lcmp
      // 2d0: iflt 328
      // 2d3: aload 25
      // 2d5: ifnull 328
      // 2d8: goto 2e6
      // 2db: ldc2_w -2391138945599102433
      // 2de: lload 4
      // 2e0: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: bipush -1
      // 2e7: if_icmple 302
      // 2ea: goto 2f8
      // 2ed: ldc2_w -2391138945599102433
      // 2f0: lload 4
      // 2f2: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: athrow
      // 2f8: aload 30
      // 2fa: bipush 0
      // 2fb: iload 31
      // 2fd: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 300: astore 30
      // 302: aload 30
      // 304: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 307: lload 4
      // 309: lconst_0
      // 30a: lcmp
      // 30b: iflt 317
      // 30e: astore 30
      // 310: aload 25
      // 312: ifnull 341
      // 315: aload 30
      // 317: invokevirtual java/lang/String.length ()I
      // 31a: goto 328
      // 31d: ldc2_w -2391138945599102433
      // 320: lload 4
      // 322: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: athrow
      // 328: ifle 34a
      // 32b: aload 27
      // 32d: aload 30
      // 32f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 332: pop
      // 333: goto 341
      // 336: ldc2_w -2391138945599102433
      // 339: lload 4
      // 33b: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: athrow
      // 341: aload 27
      // 343: getstatic com/zelix/_e.n Ljava/lang/String;
      // 346: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 349: pop
      // 34a: aload 25
      // 34c: ifnonnull 2a0
      // 34f: aload 28
      // 351: lload 4
      // 353: lconst_0
      // 354: lcmp
      // 355: iflt 464
      // 358: aload 25
      // 35a: ifnull 464
      // 35d: ifnull 3c2
      // 360: goto 36e
      // 363: ldc2_w -2391138945599102433
      // 366: lload 4
      // 368: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36d: athrow
      // 36e: aload 28
      // 370: ldc2_w -4444857579589340654
      // 373: lload 4
      // 375: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: goto 3c2
      // 37d: ldc2_w -2391138945599102433
      // 380: lload 4
      // 382: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 387: athrow
      // 388: astore 30
      // 38a: goto 3c2
      // 38d: astore 32
      // 38f: lload 4
      // 391: lconst_0
      // 392: lcmp
      // 393: ifle 3ba
      // 396: aload 28
      // 398: aload 25
      // 39a: ifnull 3b0
      // 39d: ifnull 3bf
      // 3a0: goto 3ae
      // 3a3: ldc2_w -2391138945599102433
      // 3a6: lload 4
      // 3a8: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ad: athrow
      // 3ae: aload 28
      // 3b0: ldc2_w -4444857579589340654
      // 3b3: lload 4
      // 3b5: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ba: goto 3bf
      // 3bd: astore 33
      // 3bf: aload 32
      // 3c1: athrow
      // 3c2: aload 1
      // 3c3: aload 29
      // 3c5: aload 26
      // 3c7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ca: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3cf: pop
      // 3d0: aload 27
      // 3d2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d5: astore 30
      // 3d7: aload 30
      // 3d9: aload 7
      // 3db: lload 11
      // 3dd: aload 3
      // 3de: bipush 4
      // 3df: anewarray 528
      // 3e2: dup_x1
      // 3e3: swap
      // 3e4: bipush 3
      // 3e5: swap
      // 3e6: aastore
      // 3e7: dup_x2
      // 3e8: dup_x2
      // 3e9: pop
      // 3ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ed: bipush 2
      // 3ee: swap
      // 3ef: aastore
      // 3f0: dup_x1
      // 3f1: swap
      // 3f2: bipush 1
      // 3f3: swap
      // 3f4: aastore
      // 3f5: dup_x1
      // 3f6: swap
      // 3f7: bipush 0
      // 3f8: swap
      // 3f9: aastore
      // 3fa: ldc2_w -4528017460795335466
      // 3fd: lload 4
      // 3ff: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 404: astore 30
      // 406: aload 30
      // 408: aload 7
      // 40a: aload 3
      // 40b: aload 2
      // 40c: aload 1
      // 40d: aload 6
      // 40f: lload 21
      // 411: bipush 7
      // 413: anewarray 528
      // 416: dup_x2
      // 417: dup_x2
      // 418: pop
      // 419: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41c: bipush 6
      // 41e: swap
      // 41f: aastore
      // 420: dup_x1
      // 421: swap
      // 422: bipush 5
      // 423: swap
      // 424: aastore
      // 425: dup_x1
      // 426: swap
      // 427: bipush 4
      // 428: swap
      // 429: aastore
      // 42a: dup_x1
      // 42b: swap
      // 42c: bipush 3
      // 42d: swap
      // 42e: aastore
      // 42f: dup_x1
      // 430: swap
      // 431: bipush 2
      // 432: swap
      // 433: aastore
      // 434: dup_x1
      // 435: swap
      // 436: bipush 1
      // 437: swap
      // 438: aastore
      // 439: dup_x1
      // 43a: swap
      // 43b: bipush 0
      // 43c: swap
      // 43d: aastore
      // 43e: ldc2_w -2791351013542163974
      // 441: lload 4
      // 443: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: astore 30
      // 44a: aload 2
      // 44b: lload 9
      // 44d: bipush 1
      // 44e: anewarray 528
      // 451: dup_x2
      // 452: dup_x2
      // 453: pop
      // 454: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 457: bipush 0
      // 458: swap
      // 459: aastore
      // 45a: ldc2_w -4099580904647354172
      // 45d: lload 4
      // 45f: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 464: checkcast java/io/File
      // 467: astore 31
      // 469: aload 30
      // 46b: areturn
   }

   private static int C(Object[] param0) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 1
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/sz
      // 019: astore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Long
      // 021: invokevirtual java/lang/Long.longValue ()J
      // 024: lstore 2
      // 025: pop
      // 026: getstatic com/zelix/g3.a J
      // 029: lload 2
      // 02a: lxor
      // 02b: lstore 2
      // 02c: lload 2
      // 02d: dup2
      // 02e: ldc2_w 33919290785362
      // 031: lxor
      // 032: lstore 6
      // 034: dup2
      // 035: ldc2_w 111877113811595
      // 038: lxor
      // 039: lstore 8
      // 03b: pop2
      // 03c: ldc2_w 116986744718312614
      // 03f: lload 2
      // 040: invokedynamic l (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: aload 5
      // 047: lload 8
      // 049: iload 1
      // 04a: aload 4
      // 04c: bipush 4
      // 04d: anewarray 528
      // 050: dup_x1
      // 051: swap
      // 052: bipush 3
      // 053: swap
      // 054: aastore
      // 055: dup_x1
      // 056: swap
      // 057: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 05a: bipush 2
      // 05b: swap
      // 05c: aastore
      // 05d: dup_x2
      // 05e: dup_x2
      // 05f: pop
      // 060: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 063: bipush 1
      // 064: swap
      // 065: aastore
      // 066: dup_x1
      // 067: swap
      // 068: bipush 0
      // 069: swap
      // 06a: aastore
      // 06b: ldc2_w 1769377666285364765
      // 06e: lload 2
      // 06f: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: istore 11
      // 076: bipush 1
      // 077: istore 12
      // 079: astore 10
      // 07b: iload 11
      // 07d: ifle 17a
      // 080: iload 12
      // 082: aload 10
      // 084: lload 2
      // 085: lconst_0
      // 086: lcmp
      // 087: ifle 08f
      // 08a: ifnull 182
      // 08d: aload 10
      // 08f: ifnull 182
      // 092: goto 09f
      // 095: ldc2_w 1980132537627207605
      // 098: lload 2
      // 099: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: athrow
      // 09f: ifeq 17a
      // 0a2: goto 0af
      // 0a5: ldc2_w 1980132537627207605
      // 0a8: lload 2
      // 0a9: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 5
      // 0b1: iload 11
      // 0b3: lload 6
      // 0b5: bipush 3
      // 0b6: anewarray 528
      // 0b9: dup_x2
      // 0ba: dup_x2
      // 0bb: pop
      // 0bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bf: bipush 2
      // 0c0: swap
      // 0c1: aastore
      // 0c2: dup_x1
      // 0c3: swap
      // 0c4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c7: bipush 1
      // 0c8: swap
      // 0c9: aastore
      // 0ca: dup_x1
      // 0cb: swap
      // 0cc: bipush 0
      // 0cd: swap
      // 0ce: aastore
      // 0cf: ldc2_w 2209827928341827377
      // 0d2: lload 2
      // 0d3: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: istore 13
      // 0da: iload 13
      // 0dc: aload 10
      // 0de: ifnull 173
      // 0e1: bipush -1
      // 0e2: if_icmpeq 165
      // 0e5: goto 0f2
      // 0e8: ldc2_w 1980132537627207605
      // 0eb: lload 2
      // 0ec: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 5
      // 0f4: iload 13
      // 0f6: invokevirtual java/lang/String.charAt (I)C
      // 0f9: aload 10
      // 0fb: ifnull 173
      // 0fe: goto 10b
      // 101: ldc2_w 1980132537627207605
      // 104: lload 2
      // 105: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: sipush 19754
      // 10e: ldc2_w 4303720699591188711
      // 111: lload 2
      // 112: lxor
      // 113: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: if_icmpne 165
      // 11b: goto 128
      // 11e: ldc2_w 1980132537627207605
      // 121: lload 2
      // 122: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 5
      // 12a: lload 8
      // 12c: iload 11
      // 12e: aload 4
      // 130: bipush 4
      // 131: anewarray 528
      // 134: dup_x1
      // 135: swap
      // 136: bipush 3
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13e: bipush 2
      // 13f: swap
      // 140: aastore
      // 141: dup_x2
      // 142: dup_x2
      // 143: pop
      // 144: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 147: bipush 1
      // 148: swap
      // 149: aastore
      // 14a: dup_x1
      // 14b: swap
      // 14c: bipush 0
      // 14d: swap
      // 14e: aastore
      // 14f: ldc2_w 1769377666285364765
      // 152: lload 2
      // 153: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: istore 11
      // 15a: aload 10
      // 15c: lload 2
      // 15d: lconst_0
      // 15e: lcmp
      // 15f: iflt 177
      // 162: ifnonnull 175
      // 165: bipush 0
      // 166: goto 173
      // 169: ldc2_w 1980132537627207605
      // 16c: lload 2
      // 16d: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: istore 12
      // 175: aload 10
      // 177: ifnonnull 07b
      // 17a: lload 2
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: iflt 0a2
      // 180: iload 11
      // 182: ireturn
   }

   private static String V(Object[] param0) {
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
      // 00b: checkcast java/util/Properties
      // 00e: astore 8
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Properties
      // 016: astore 4
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/fk
      // 01e: astore 2
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/util/Map
      // 025: astore 7
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/io/PrintWriter
      // 02d: astore 3
      // 02e: dup
      // 02f: bipush 6
      // 031: aaload
      // 032: checkcast java/lang/Long
      // 035: invokevirtual java/lang/Long.longValue ()J
      // 038: lstore 5
      // 03a: pop
      // 03b: getstatic com/zelix/g3.a J
      // 03e: lload 5
      // 040: lxor
      // 041: lstore 5
      // 043: lload 5
      // 045: dup2
      // 046: ldc2_w 122305343776151
      // 049: lxor
      // 04a: lstore 9
      // 04c: dup2
      // 04d: ldc2_w 83091087524581
      // 050: lxor
      // 051: lstore 11
      // 053: dup2
      // 054: ldc2_w 60575107858688
      // 057: lxor
      // 058: lstore 13
      // 05a: pop2
      // 05b: ldc2_w -4816375946571679727
      // 05e: lload 5
      // 060: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: new java/lang/StringBuilder
      // 068: dup
      // 069: invokespecial java/lang/StringBuilder.<init> ()V
      // 06c: astore 16
      // 06e: astore 15
      // 070: bipush 0
      // 071: istore 17
      // 073: aload 1
      // 074: sipush 21894
      // 077: ldc2_w 7105984840481767506
      // 07a: lload 5
      // 07c: lxor
      // 07d: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 085: istore 18
      // 087: iload 18
      // 089: bipush -1
      // 08a: if_icmple 422
      // 08d: aload 15
      // 08f: ifnull 439
      // 092: iload 18
      // 094: bipush 1
      // 095: isub
      // 096: aload 15
      // 098: ifnull 112
      // 09b: goto 0a9
      // 09e: ldc2_w -6355268167011345662
      // 0a1: lload 5
      // 0a3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: iload 17
      // 0ab: if_icmple 0d7
      // 0ae: goto 0bc
      // 0b1: ldc2_w -6355268167011345662
      // 0b4: lload 5
      // 0b6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 1
      // 0bd: iload 17
      // 0bf: iload 18
      // 0c1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0c4: astore 19
      // 0c6: aload 16
      // 0c8: aload 19
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: pop
      // 0ce: aload 16
      // 0d0: getstatic com/zelix/_e.n Ljava/lang/String;
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: pop
      // 0d7: aload 1
      // 0d8: iload 18
      // 0da: sipush 789
      // 0dd: ldc2_w 8221177941215696597
      // 0e0: lload 5
      // 0e2: lxor
      // 0e3: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: invokevirtual java/lang/String.length ()I
      // 0eb: iadd
      // 0ec: lload 11
      // 0ee: bipush 3
      // 0ef: anewarray 528
      // 0f2: dup_x2
      // 0f3: dup_x2
      // 0f4: pop
      // 0f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f8: bipush 2
      // 0f9: swap
      // 0fa: aastore
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 100: bipush 1
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 0
      // 106: swap
      // 107: aastore
      // 108: ldc2_w -6765049297373498490
      // 10b: lload 5
      // 10d: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: istore 19
      // 114: iload 19
      // 116: aload 15
      // 118: ifnull 18c
      // 11b: bipush -1
      // 11c: if_icmpne 18a
      // 11f: goto 12d
      // 122: ldc2_w -6355268167011345662
      // 125: lload 5
      // 127: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: new com/zelix/ak
      // 130: dup
      // 131: new java/lang/StringBuilder
      // 134: dup
      // 135: invokespecial java/lang/StringBuilder.<init> ()V
      // 138: sipush 13217
      // 13b: ldc2_w 6546151597629302373
      // 13e: lload 5
      // 140: lxor
      // 141: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 149: aload 2
      // 14a: lload 13
      // 14c: bipush 1
      // 14d: anewarray 528
      // 150: dup_x2
      // 151: dup_x2
      // 152: pop
      // 153: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 156: bipush 0
      // 157: swap
      // 158: aastore
      // 159: ldc2_w -5135966552810367475
      // 15c: lload 5
      // 15e: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: checkcast java/io/File
      // 166: ldc2_w -6676473062820389341
      // 169: lload 5
      // 16b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 173: ldc "'"
      // 175: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 178: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17b: invokespecial com/zelix/ak.<init> (Ljava/lang/String;)V
      // 17e: athrow
      // 17f: ldc2_w -6355268167011345662
      // 182: lload 5
      // 184: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: iload 19
      // 18c: istore 20
      // 18e: aload 1
      // 18f: iload 20
      // 191: invokevirtual java/lang/String.charAt (I)C
      // 194: istore 21
      // 196: bipush 0
      // 197: istore 22
      // 199: iload 21
      // 19b: ldc2_w -4739628559651015085
      // 19e: lload 5
      // 1a0: invokedynamic k (CJJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: ifeq 20e
      // 1a8: iload 21
      // 1aa: aload 15
      // 1ac: lload 5
      // 1ae: lconst_0
      // 1af: lcmp
      // 1b0: iflt 1f3
      // 1b3: ifnull 1f1
      // 1b6: sipush 21347
      // 1b9: ldc2_w 7115842304018760213
      // 1bc: lload 5
      // 1be: lxor
      // 1bf: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: lload 5
      // 1c6: lconst_0
      // 1c7: lcmp
      // 1c8: ifle 231
      // 1cb: aload 15
      // 1cd: ifnull 231
      // 1d0: goto 1de
      // 1d3: ldc2_w -6355268167011345662
      // 1d6: lload 5
      // 1d8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: athrow
      // 1de: if_icmpne 271
      // 1e1: goto 1ef
      // 1e4: ldc2_w -6355268167011345662
      // 1e7: lload 5
      // 1e9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: athrow
      // 1ef: iload 22
      // 1f1: aload 15
      // 1f3: lload 5
      // 1f5: lconst_0
      // 1f6: lcmp
      // 1f7: iflt 212
      // 1fa: ifnull 210
      // 1fd: ifeq 271
      // 200: goto 20e
      // 203: ldc2_w -6355268167011345662
      // 206: lload 5
      // 208: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: iload 21
      // 210: aload 15
      // 212: ifnull 26a
      // 215: sipush 20778
      // 218: ldc2_w 6752488623651340373
      // 21b: lload 5
      // 21d: lxor
      // 21e: invokedynamic t (IJ)I bsm=com/zelix/g3.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: goto 231
      // 226: ldc2_w -6355268167011345662
      // 229: lload 5
      // 22b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: if_icmpne 261
      // 234: iload 22
      // 236: aload 15
      // 238: ifnull 25b
      // 23b: goto 249
      // 23e: ldc2_w -6355268167011345662
      // 241: lload 5
      // 243: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: athrow
      // 249: ifne 25e
      // 24c: goto 25a
      // 24f: ldc2_w -6355268167011345662
      // 252: lload 5
      // 254: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: bipush 1
      // 25b: goto 25f
      // 25e: bipush 0
      // 25f: istore 22
      // 261: iinc 20 1
      // 264: aload 1
      // 265: iload 20
      // 267: invokevirtual java/lang/String.charAt (I)C
      // 26a: istore 21
      // 26c: aload 15
      // 26e: ifnonnull 199
      // 271: aload 1
      // 272: iload 19
      // 274: iload 20
      // 276: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 279: astore 23
      // 27b: aload 23
      // 27d: ldc "\""
      // 27f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 282: aload 15
      // 284: lload 5
      // 286: lconst_0
      // 287: lcmp
      // 288: iflt 1ac
      // 28b: ifnull 2fa
      // 28e: ifeq 2e0
      // 291: goto 29f
      // 294: ldc2_w -6355268167011345662
      // 297: lload 5
      // 299: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29e: athrow
      // 29f: aload 23
      // 2a1: ldc "\""
      // 2a3: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 2a6: lload 5
      // 2a8: lconst_0
      // 2a9: lcmp
      // 2aa: iflt 2fa
      // 2ad: aload 15
      // 2af: ifnull 2fa
      // 2b2: goto 2c0
      // 2b5: ldc2_w -6355268167011345662
      // 2b8: lload 5
      // 2ba: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: athrow
      // 2c0: ifeq 2e0
      // 2c3: goto 2d1
      // 2c6: ldc2_w -6355268167011345662
      // 2c9: lload 5
      // 2cb: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: athrow
      // 2d1: aload 23
      // 2d3: bipush 1
      // 2d4: aload 23
      // 2d6: invokevirtual java/lang/String.length ()I
      // 2d9: bipush 1
      // 2da: isub
      // 2db: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2de: astore 23
      // 2e0: aload 23
      // 2e2: aload 15
      // 2e4: ifnull 3b4
      // 2e7: ldc "\""
      // 2e9: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 2ec: goto 2fa
      // 2ef: ldc2_w -6355268167011345662
      // 2f2: lload 5
      // 2f4: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: athrow
      // 2fa: bipush -1
      // 2fb: if_icmple 371
      // 2fe: new com/zelix/ak
      // 301: dup
      // 302: new java/lang/StringBuilder
      // 305: dup
      // 306: invokespecial java/lang/StringBuilder.<init> ()V
      // 309: sipush 3098
      // 30c: ldc2_w 4157655086993299967
      // 30f: lload 5
      // 311: lxor
      // 312: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 317: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31a: aload 2
      // 31b: lload 13
      // 31d: bipush 1
      // 31e: anewarray 528
      // 321: dup_x2
      // 322: dup_x2
      // 323: pop
      // 324: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 327: bipush 0
      // 328: swap
      // 329: aastore
      // 32a: ldc2_w -5135966552810367475
      // 32d: lload 5
      // 32f: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: checkcast java/io/File
      // 337: ldc2_w -6676473062820389341
      // 33a: lload 5
      // 33c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 344: sipush 14704
      // 347: ldc2_w 5161854895403658395
      // 34a: lload 5
      // 34c: lxor
      // 34d: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 355: aload 23
      // 357: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35a: ldc "'"
      // 35c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 362: invokespecial com/zelix/ak.<init> (Ljava/lang/String;)V
      // 365: athrow
      // 366: ldc2_w -6355268167011345662
      // 369: lload 5
      // 36b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: athrow
      // 371: aload 23
      // 373: aload 8
      // 375: aload 4
      // 377: aload 2
      // 378: aload 7
      // 37a: aload 3
      // 37b: lload 9
      // 37d: bipush 7
      // 37f: anewarray 528
      // 382: dup_x2
      // 383: dup_x2
      // 384: pop
      // 385: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 388: bipush 6
      // 38a: swap
      // 38b: aastore
      // 38c: dup_x1
      // 38d: swap
      // 38e: bipush 5
      // 38f: swap
      // 390: aastore
      // 391: dup_x1
      // 392: swap
      // 393: bipush 4
      // 394: swap
      // 395: aastore
      // 396: dup_x1
      // 397: swap
      // 398: bipush 3
      // 399: swap
      // 39a: aastore
      // 39b: dup_x1
      // 39c: swap
      // 39d: bipush 2
      // 39e: swap
      // 39f: aastore
      // 3a0: dup_x1
      // 3a1: swap
      // 3a2: bipush 1
      // 3a3: swap
      // 3a4: aastore
      // 3a5: dup_x1
      // 3a6: swap
      // 3a7: bipush 0
      // 3a8: swap
      // 3a9: aastore
      // 3aa: ldc2_w -4794279135785056900
      // 3ad: lload 5
      // 3af: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b4: astore 24
      // 3b6: aload 16
      // 3b8: aload 24
      // 3ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3bd: pop
      // 3be: lload 5
      // 3c0: lconst_0
      // 3c1: lcmp
      // 3c2: iflt 41d
      // 3c5: aload 24
      // 3c7: getstatic com/zelix/_e.n Ljava/lang/String;
      // 3ca: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 3cd: aload 15
      // 3cf: ifnull 41b
      // 3d2: ifne 3fa
      // 3d5: goto 3e3
      // 3d8: ldc2_w -6355268167011345662
      // 3db: lload 5
      // 3dd: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: athrow
      // 3e3: aload 16
      // 3e5: getstatic com/zelix/_e.n Ljava/lang/String;
      // 3e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3eb: pop
      // 3ec: goto 3fa
      // 3ef: ldc2_w -6355268167011345662
      // 3f2: lload 5
      // 3f4: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f9: athrow
      // 3fa: iload 20
      // 3fc: bipush 1
      // 3fd: iadd
      // 3fe: istore 17
      // 400: aload 1
      // 401: sipush 789
      // 404: ldc2_w 8221177941215696597
      // 407: lload 5
      // 409: lxor
      // 40a: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40f: iload 17
      // 411: ldc2_w -6896071821485684139
      // 414: lload 5
      // 416: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41b: istore 18
      // 41d: aload 15
      // 41f: ifnonnull 087
      // 422: aload 16
      // 424: aload 1
      // 425: iload 17
      // 427: aload 1
      // 428: invokevirtual java/lang/String.length ()I
      // 42b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 42e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 431: pop
      // 432: lload 5
      // 434: lconst_0
      // 435: lcmp
      // 436: ifle 08d
      // 439: aload 16
      // 43b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 43e: areturn
   }

   public static String j(Object[] param0) {
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
      // 00b: checkcast java/util/Properties
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 2
      // 01a: pop
      // 01b: getstatic com/zelix/g3.a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 115628165581727
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 86499222110704
      // 02d: lxor
      // 02e: dup2
      // 02f: bipush 32
      // 031: lushr
      // 032: l2i
      // 033: istore 7
      // 035: dup2
      // 036: bipush 32
      // 038: lshl
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 8
      // 03f: dup2
      // 040: bipush 48
      // 042: lshl
      // 043: bipush 48
      // 045: lushr
      // 046: l2i
      // 047: istore 9
      // 049: pop2
      // 04a: dup2
      // 04b: ldc2_w 58828037889799
      // 04e: lxor
      // 04f: lstore 10
      // 051: dup2
      // 052: ldc2_w 71156779260743
      // 055: lxor
      // 056: lstore 12
      // 058: dup2
      // 059: ldc2_w 94544588473149
      // 05c: lxor
      // 05d: lstore 14
      // 05f: pop2
      // 060: ldc2_w -3514905773819131391
      // 063: lload 2
      // 064: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: new com/zelix/sz
      // 06c: dup
      // 06d: iload 7
      // 06f: iload 8
      // 071: i2s
      // 072: iload 9
      // 074: i2c
      // 075: invokespecial com/zelix/sz.<init> (ISC)V
      // 078: astore 17
      // 07a: astore 16
      // 07c: aconst_null
      // 07d: astore 18
      // 07f: new java/io/StringWriter
      // 082: dup
      // 083: invokespecial java/io/StringWriter.<init> ()V
      // 086: astore 19
      // 088: new com/zelix/sz
      // 08b: dup
      // 08c: iload 7
      // 08e: iload 8
      // 090: i2s
      // 091: iload 9
      // 093: i2c
      // 094: invokespecial com/zelix/sz.<init> (ISC)V
      // 097: astore 20
      // 099: lload 5
      // 09b: aload 1
      // 09c: aload 20
      // 09e: bipush 3
      // 09f: anewarray 528
      // 0a2: dup_x1
      // 0a3: swap
      // 0a4: bipush 2
      // 0a5: swap
      // 0a6: aastore
      // 0a7: dup_x1
      // 0a8: swap
      // 0a9: bipush 1
      // 0aa: swap
      // 0ab: aastore
      // 0ac: dup_x2
      // 0ad: dup_x2
      // 0ae: pop
      // 0af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b2: bipush 0
      // 0b3: swap
      // 0b4: aastore
      // 0b5: ldc2_w -2910841255073264568
      // 0b8: lload 2
      // 0b9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/io/File; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: astore 21
      // 0c0: aload 20
      // 0c2: aload 16
      // 0c4: ifnull 0ee
      // 0c7: lload 14
      // 0c9: invokevirtual com/zelix/sz.a (J)Z
      // 0cc: ifne 0f2
      // 0cf: goto 0dc
      // 0d2: ldc2_w -3036045121823856366
      // 0d5: lload 2
      // 0d6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 20
      // 0de: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 0e1: goto 0ee
      // 0e4: ldc2_w -3036045121823856366
      // 0e7: lload 2
      // 0e8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: checkcast java/lang/String
      // 0f1: areturn
      // 0f2: aload 21
      // 0f4: new java/io/PrintWriter
      // 0f7: dup
      // 0f8: aload 19
      // 0fa: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 0fd: aload 17
      // 0ff: aload 4
      // 101: lload 10
      // 103: bipush 5
      // 104: anewarray 528
      // 107: dup_x2
      // 108: dup_x2
      // 109: pop
      // 10a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10d: bipush 4
      // 10e: swap
      // 10f: aastore
      // 110: dup_x1
      // 111: swap
      // 112: bipush 3
      // 113: swap
      // 114: aastore
      // 115: dup_x1
      // 116: swap
      // 117: bipush 2
      // 118: swap
      // 119: aastore
      // 11a: dup_x1
      // 11b: swap
      // 11c: bipush 1
      // 11d: swap
      // 11e: aastore
      // 11f: dup_x1
      // 120: swap
      // 121: bipush 0
      // 122: swap
      // 123: aastore
      // 124: ldc2_w -3381962154548749197
      // 127: lload 2
      // 128: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/lqq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: astore 18
      // 12f: new java/util/ArrayList
      // 132: dup
      // 133: invokespecial java/util/ArrayList.<init> ()V
      // 136: astore 22
      // 138: aload 18
      // 13a: sipush 29420
      // 13d: ldc2_w 205800175652164901
      // 140: lload 2
      // 141: lxor
      // 142: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: bipush 1
      // 148: bipush 1
      // 149: aload 22
      // 14b: lload 12
      // 14d: bipush 5
      // 14e: anewarray 528
      // 151: dup_x2
      // 152: dup_x2
      // 153: pop
      // 154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157: bipush 4
      // 158: swap
      // 159: aastore
      // 15a: dup_x1
      // 15b: swap
      // 15c: bipush 3
      // 15d: swap
      // 15e: aastore
      // 15f: dup_x1
      // 160: swap
      // 161: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 164: bipush 2
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 16c: bipush 1
      // 16d: swap
      // 16e: aastore
      // 16f: dup_x1
      // 170: swap
      // 171: bipush 0
      // 172: swap
      // 173: aastore
      // 174: ldc2_w -3668954140525887220
      // 177: lload 2
      // 178: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: astore 23
      // 17f: aload 23
      // 181: astore 24
      // 183: aload 19
      // 185: aload 16
      // 187: ifnull 19c
      // 18a: ifnull 1a5
      // 18d: goto 19a
      // 190: ldc2_w -3036045121823856366
      // 193: lload 2
      // 194: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: aload 19
      // 19c: ldc2_w -3958200694150058839
      // 19f: lload 2
      // 1a0: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: goto 1aa
      // 1a8: astore 25
      // 1aa: aload 17
      // 1ac: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 1af: aload 16
      // 1b1: ifnull 1d6
      // 1b4: ifnull 1e2
      // 1b7: goto 1c4
      // 1ba: ldc2_w -3036045121823856366
      // 1bd: lload 2
      // 1be: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: aload 17
      // 1c6: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 1c9: goto 1d6
      // 1cc: ldc2_w -3036045121823856366
      // 1cf: lload 2
      // 1d0: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: athrow
      // 1d6: checkcast java/io/Reader
      // 1d9: ldc2_w -3714525478416745984
      // 1dc: lload 2
      // 1dd: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: goto 1e7
      // 1e5: astore 25
      // 1e7: aload 24
      // 1e9: areturn
      // 1ea: astore 22
      // 1ec: aload 22
      // 1ee: athrow
      // 1ef: astore 22
      // 1f1: aload 19
      // 1f3: aload 16
      // 1f5: ifnull 222
      // 1f8: ifnull 3c7
      // 1fb: goto 208
      // 1fe: ldc2_w -3036045121823856366
      // 201: lload 2
      // 202: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: athrow
      // 208: aload 19
      // 20a: ldc2_w -2972828785931589835
      // 20d: lload 2
      // 20e: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 213: aload 19
      // 215: goto 222
      // 218: ldc2_w -3036045121823856366
      // 21b: lload 2
      // 21c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 221: athrow
      // 222: ldc2_w -2995047090965926105
      // 225: lload 2
      // 226: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: astore 24
      // 22d: new java/io/File
      // 230: dup
      // 231: sipush 10189
      // 234: ldc2_w 5026308048489447446
      // 237: lload 2
      // 238: lxor
      // 239: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 241: astore 25
      // 243: aconst_null
      // 244: astore 26
      // 246: new java/lang/StringBuilder
      // 249: dup
      // 24a: invokespecial java/lang/StringBuilder.<init> ()V
      // 24d: sipush 17856
      // 250: ldc2_w 3246775344808288799
      // 253: lload 2
      // 254: lxor
      // 255: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25d: aload 22
      // 25f: ldc2_w -4033128810731341434
      // 262: lload 2
      // 263: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26b: sipush 18974
      // 26e: ldc2_w 132576709576486345
      // 271: lload 2
      // 272: lxor
      // 273: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27e: astore 23
      // 280: new java/io/PrintWriter
      // 283: dup
      // 284: new java/io/FileWriter
      // 287: dup
      // 288: aload 25
      // 28a: invokespecial java/io/FileWriter.<init> (Ljava/io/File;)V
      // 28d: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 290: astore 26
      // 292: aload 26
      // 294: aload 24
      // 296: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 299: aload 26
      // 29b: aload 23
      // 29d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2a0: new java/lang/StringBuilder
      // 2a3: dup
      // 2a4: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a7: aload 23
      // 2a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ac: ldc2_w -3618022489152992806
      // 2af: lload 2
      // 2b0: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b8: sipush 15811
      // 2bb: ldc2_w 3908787669880510997
      // 2be: lload 2
      // 2bf: lxor
      // 2c0: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c8: aload 25
      // 2ca: ldc2_w -3366397473396282317
      // 2cd: lload 2
      // 2ce: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d6: sipush 6127
      // 2d9: ldc2_w 7226617655278972977
      // 2dc: lload 2
      // 2dd: lxor
      // 2de: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e6: sipush 27747
      // 2e9: ldc2_w 526486501330013106
      // 2ec: lload 2
      // 2ed: lxor
      // 2ee: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f6: sipush 13470
      // 2f9: ldc2_w 3882015766235681625
      // 2fc: lload 2
      // 2fd: lxor
      // 2fe: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 306: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 309: astore 23
      // 30b: aload 26
      // 30d: ldc2_w -3267785182438252981
      // 310: lload 2
      // 311: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 316: lload 2
      // 317: lconst_0
      // 318: lcmp
      // 319: iflt 331
      // 31c: aload 26
      // 31e: aload 16
      // 320: ifnull 328
      // 323: ifnull 3c2
      // 326: aload 26
      // 328: ldc2_w -3062827656670419191
      // 32b: lload 2
      // 32c: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: goto 3c2
      // 334: astore 27
      // 336: new java/lang/StringBuilder
      // 339: dup
      // 33a: invokespecial java/lang/StringBuilder.<init> ()V
      // 33d: sipush 17856
      // 340: ldc2_w 3246775344808288799
      // 343: lload 2
      // 344: lxor
      // 345: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 34d: aload 22
      // 34f: ldc2_w -4033128810731341434
      // 352: lload 2
      // 353: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 358: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35b: sipush 6520
      // 35e: ldc2_w 3530565156104552126
      // 361: lload 2
      // 362: lxor
      // 363: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 36e: astore 23
      // 370: lload 2
      // 371: lconst_0
      // 372: lcmp
      // 373: ifle 398
      // 376: aload 26
      // 378: aload 16
      // 37a: ifnull 38f
      // 37d: ifnull 3c2
      // 380: goto 38d
      // 383: ldc2_w -3036045121823856366
      // 386: lload 2
      // 387: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38c: athrow
      // 38d: aload 26
      // 38f: ldc2_w -3062827656670419191
      // 392: lload 2
      // 393: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: goto 3c2
      // 39b: astore 28
      // 39d: aload 26
      // 39f: aload 16
      // 3a1: ifnull 3b6
      // 3a4: ifnull 3bf
      // 3a7: goto 3b4
      // 3aa: ldc2_w -3036045121823856366
      // 3ad: lload 2
      // 3ae: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b3: athrow
      // 3b4: aload 26
      // 3b6: ldc2_w -3062827656670419191
      // 3b9: lload 2
      // 3ba: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bf: aload 28
      // 3c1: athrow
      // 3c2: aload 16
      // 3c4: ifnonnull 401
      // 3c7: new java/lang/StringBuilder
      // 3ca: dup
      // 3cb: invokespecial java/lang/StringBuilder.<init> ()V
      // 3ce: sipush 17856
      // 3d1: ldc2_w 3246775344808288799
      // 3d4: lload 2
      // 3d5: lxor
      // 3d6: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3de: aload 22
      // 3e0: ldc2_w -4033128810731341434
      // 3e3: lload 2
      // 3e4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ec: sipush 26646
      // 3ef: ldc2_w 9081920723437735919
      // 3f2: lload 2
      // 3f3: lxor
      // 3f4: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ff: astore 23
      // 401: aload 23
      // 403: astore 24
      // 405: aload 19
      // 407: aload 16
      // 409: ifnull 41e
      // 40c: ifnull 427
      // 40f: goto 41c
      // 412: ldc2_w -3036045121823856366
      // 415: lload 2
      // 416: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41b: athrow
      // 41c: aload 19
      // 41e: ldc2_w -3958200694150058839
      // 421: lload 2
      // 422: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 427: goto 42c
      // 42a: astore 25
      // 42c: aload 17
      // 42e: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 431: aload 16
      // 433: ifnull 458
      // 436: ifnull 464
      // 439: goto 446
      // 43c: ldc2_w -3036045121823856366
      // 43f: lload 2
      // 440: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 445: athrow
      // 446: aload 17
      // 448: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 44b: goto 458
      // 44e: ldc2_w -3036045121823856366
      // 451: lload 2
      // 452: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 457: athrow
      // 458: checkcast java/io/Reader
      // 45b: ldc2_w -3714525478416745984
      // 45e: lload 2
      // 45f: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 464: goto 469
      // 467: astore 25
      // 469: aload 24
      // 46b: areturn
      // 46c: astore 29
      // 46e: aload 19
      // 470: aload 16
      // 472: ifnull 487
      // 475: ifnull 490
      // 478: goto 485
      // 47b: ldc2_w -3036045121823856366
      // 47e: lload 2
      // 47f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 484: athrow
      // 485: aload 19
      // 487: ldc2_w -3958200694150058839
      // 48a: lload 2
      // 48b: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 490: goto 495
      // 493: astore 30
      // 495: aload 17
      // 497: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 49a: aload 16
      // 49c: ifnull 4c1
      // 49f: ifnull 4cd
      // 4a2: goto 4af
      // 4a5: ldc2_w -3036045121823856366
      // 4a8: lload 2
      // 4a9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ae: athrow
      // 4af: aload 17
      // 4b1: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 4b4: goto 4c1
      // 4b7: ldc2_w -3036045121823856366
      // 4ba: lload 2
      // 4bb: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c0: athrow
      // 4c1: checkcast java/io/Reader
      // 4c4: ldc2_w -3714525478416745984
      // 4c7: lload 2
      // 4c8: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cd: goto 4d2
      // 4d0: astore 30
      // 4d2: aload 29
      // 4d4: athrow
   }

   private static void J(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/String
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/String
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 1
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast java/io/PrintWriter
      // 21: astore 3
      // 22: pop
      // 23: getstatic com/zelix/g3.a J
      // 26: lload 1
      // 27: lxor
      // 28: lstore 1
      // 29: ldc2_w 2442267011524158685
      // 2c: lload 1
      // 2d: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: astore 6
      // 34: aload 6
      // 36: ifnull c6
      // 39: aload 3
      // 3a: ifnull 67
      // 3d: goto 4a
      // 40: ldc2_w 4251937041260365774
      // 43: lload 1
      // 44: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 3
      // 4b: aload 5
      // 4d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 50: aload 3
      // 51: ldc2_w 4297139120367274453
      // 54: lload 1
      // 55: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: goto 67
      // 5d: ldc2_w 4251937041260365774
      // 60: lload 1
      // 61: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: ldc2_w 2777352021447836410
      // 6a: lload 1
      // 6b: invokedynamic k (JJ)Ljava/io/PrintStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: aload 5
      // 72: ldc2_w 4252883409022886160
      // 75: lload 1
      // 76: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: ldc2_w 2777352021447836410
      // 7e: lload 1
      // 7f: invokedynamic k (JJ)Ljava/io/PrintStream; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: new java/lang/StringBuilder
      // 87: dup
      // 88: invokespecial java/lang/StringBuilder.<init> ()V
      // 8b: sipush 25196
      // 8e: ldc2_w 5963897448367762299
      // 91: lload 1
      // 92: lxor
      // 93: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: aload 4
      // 9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a0: sipush 32283
      // a3: ldc2_w 945669257441294086
      // a6: lload 1
      // a7: lxor
      // a8: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/g3.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b3: ldc2_w 4252883409022886160
      // b6: lload 1
      // b7: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: bipush 1
      // bd: ldc2_w 4550318671210820914
      // c0: lload 1
      // c1: invokedynamic o (IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: return
   }

   private static String p(Object[] param0) {
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
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Properties
      // 00e: astore 1
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 3
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/Properties
      // 01f: astore 5
      // 021: pop
      // 022: getstatic com/zelix/g3.a J
      // 025: lload 3
      // 026: lxor
      // 027: lstore 3
      // 028: ldc2_w -5487473585842489631
      // 02b: lload 3
      // 02c: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: new java/lang/StringBuilder
      // 034: dup
      // 035: aload 2
      // 036: invokevirtual java/lang/String.length ()I
      // 039: i2d
      // 03a: ldc2_w 1.5
      // 03d: dmul
      // 03e: d2i
      // 03f: invokespecial java/lang/StringBuilder.<init> (I)V
      // 042: astore 7
      // 044: astore 6
      // 046: bipush 0
      // 047: istore 8
      // 049: aload 2
      // 04a: ldc "<"
      // 04c: iload 8
      // 04e: ldc2_w -5855696050041600859
      // 051: lload 3
      // 052: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: dup
      // 058: istore 9
      // 05a: bipush -1
      // 05b: if_icmple 1aa
      // 05e: aload 7
      // 060: aload 2
      // 061: iload 8
      // 063: iload 9
      // 065: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 068: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06b: pop
      // 06c: aload 2
      // 06d: lload 3
      // 06e: lconst_0
      // 06f: lcmp
      // 070: iflt 1c1
      // 073: ldc ">"
      // 075: iload 9
      // 077: ldc "<"
      // 079: invokevirtual java/lang/String.length ()I
      // 07c: iadd
      // 07d: ldc2_w -5855696050041600859
      // 080: lload 3
      // 081: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;IJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: istore 10
      // 088: aload 6
      // 08a: ifnull 1bc
      // 08d: iload 10
      // 08f: bipush -1
      // 090: aload 6
      // 092: ifnull 1a2
      // 095: goto 0a2
      // 098: ldc2_w -6251606483110210062
      // 09b: lload 3
      // 09c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: lload 3
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: ifle 195
      // 0a8: if_icmple 186
      // 0ab: goto 0b8
      // 0ae: ldc2_w -6251606483110210062
      // 0b1: lload 3
      // 0b2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: iload 10
      // 0ba: lload 3
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: iflt 1a3
      // 0c0: iload 9
      // 0c2: ldc "<"
      // 0c4: invokevirtual java/lang/String.length ()I
      // 0c7: iadd
      // 0c8: aload 6
      // 0ca: ifnull 1a2
      // 0cd: goto 0da
      // 0d0: ldc2_w -6251606483110210062
      // 0d3: lload 3
      // 0d4: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: if_icmple 186
      // 0dd: goto 0ea
      // 0e0: ldc2_w -6251606483110210062
      // 0e3: lload 3
      // 0e4: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: aload 2
      // 0eb: iload 9
      // 0ed: ldc "<"
      // 0ef: invokevirtual java/lang/String.length ()I
      // 0f2: iadd
      // 0f3: iload 10
      // 0f5: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0f8: astore 11
      // 0fa: aconst_null
      // 0fb: astore 12
      // 0fd: aload 1
      // 0fe: aload 6
      // 100: ifnull 114
      // 103: ifnull 121
      // 106: goto 113
      // 109: ldc2_w -6251606483110210062
      // 10c: lload 3
      // 10d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 1
      // 114: aload 11
      // 116: ldc2_w -6075262597334097347
      // 119: lload 3
      // 11a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: astore 12
      // 121: aload 12
      // 123: aload 6
      // 125: ifnull 149
      // 128: ifnonnull 147
      // 12b: goto 138
      // 12e: ldc2_w -6251606483110210062
      // 131: lload 3
      // 132: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: aload 5
      // 13a: aload 11
      // 13c: ldc2_w -6075262597334097347
      // 13f: lload 3
      // 140: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: astore 12
      // 147: aload 12
      // 149: ifnull 169
      // 14c: aload 7
      // 14e: aload 12
      // 150: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 153: pop
      // 154: iload 10
      // 156: ldc ">"
      // 158: invokevirtual java/lang/String.length ()I
      // 15b: iadd
      // 15c: istore 8
      // 15e: aload 6
      // 160: lload 3
      // 161: lconst_0
      // 162: lcmp
      // 163: ifle 17d
      // 166: ifnonnull 17b
      // 169: aload 7
      // 16b: ldc "<"
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: pop
      // 171: iload 9
      // 173: ldc "<"
      // 175: invokevirtual java/lang/String.length ()I
      // 178: iadd
      // 179: istore 8
      // 17b: aload 6
      // 17d: lload 3
      // 17e: lconst_0
      // 17f: lcmp
      // 180: ifle 1a7
      // 183: ifnonnull 1a5
      // 186: aload 7
      // 188: ldc "<"
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18d: pop
      // 18e: iload 9
      // 190: ldc "<"
      // 192: invokevirtual java/lang/String.length ()I
      // 195: goto 1a2
      // 198: ldc2_w -6251606483110210062
      // 19b: lload 3
      // 19c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: iadd
      // 1a3: istore 8
      // 1a5: aload 6
      // 1a7: ifnonnull 049
      // 1aa: aload 7
      // 1ac: aload 2
      // 1ad: iload 8
      // 1af: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 1b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b5: pop
      // 1b6: lload 3
      // 1b7: lconst_0
      // 1b8: lcmp
      // 1b9: iflt 06c
      // 1bc: aload 7
      // 1be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c1: areturn
   }

   static {
      long var20 = a ^ 99594397208405L;
      String[] var10000 = new String[5];
      m44.a<"h">(var10000, 6352879306951251837L, var20);
      Cipher var11;
      Cipher var25 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var25.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[49];
      int var16 = 0;
      String var15 = "÷ú£FRº\u001fXü\u0099£¯d¿¿4\u0087\u0095OMüÕk\b\u009fò\u008fcô¾8\u0083à6«ß.Öt«¼*ÖÄ\u009bÕæ&F\u0084\u00857\u0018@\u0016È\u0014z\u009b¤¸\u001eL@\r~\u0004½ä\u0004uT ¡¦Ê\u00952$\u0098\b°NB|®ú\u009e\u009e:á¥LZ¦\u009d<D\u0013\u0012Ó\u0002ÿ!êH\u0019Å\u009bgµ\u000e¥µV\u00881\u008b ]l?qsõ¸æ\tÅÔTÏr&h&F\u0087ìcj\u0003OD\u0005¨\u008e\u001fp¿È\u0099\u0002°£¡\u008a©j~\u0082\u0099\u0085þ7GµÆh¶\u0013x½\u001dj³°\n\u0010ÿªv\u009c\nå\u0080\u001cTl(®¢\u0094Q\r\u0010n>L\u0001\u0017³·é>\u00adÄý\u008e*.:@?\u0081è¡ZMA`Þ\u009c%IF\u0091\u0006 \"H¾ú\u0012Ôû »\u00adÀzJÒ\u008b\ro¦hÒ\u0095>ÖL;\u008c8esÔ\u0011O³\b»¢ç\u0089\u001e\u009bÌh\u0014C³\n?#\u0010BºæSq\u0019YôÌdµþ/Þca\u0010i©\u0091\u0007Õt(äèK SÑÓ[¡\u00109\\R\u0017Á´\u009bQè\u0004[\u0091\u00911Ñ\u0015()cºÀ¯Ò\u0017Ô0 Ç³mlÆmhv#¦÷V$\u0081\u000bMy\"_nã\u0084Ç'v\u007fj2d\n\u0018\u0099ñØ\u001b\u001a®¹^\u0018\u009d\u001f¬[iy\u0016Ms~é´\u0090ýÄPq¾ªW=1Ó\u009c\u0005F,á\u001b;#\u0095&\u0015\u0004ËG\u0010¯Ñ½ø1\u009bK0\u0006\u0004±¼TL(ª\u001apÛÛÈäïÆwEá\tÎ¢µ\u0091\u0083×\u0090ù¡\u0080Â*@z±òyö¬\u008b¬-Z4\u0087Y*@\u0016\u008e\u0010¹ÌP½Ìy`\u0005xü\u0019GgPÒû\u0080/øÏÑ.&¦ô\u0000{ä\u0085\u0019áÂ¨§\u0005\u001eÒ\u0088È\u001f$´\u008a!\u0001C\"3FRþP.7\u0091ÇZtlh%\u0002\u0090þÎ¬¬ÌD9\u0091Lß\u0014¿\u0094oB¸Â)<\u001f7A\f\u001c]7\u001fÿ\u0007äÜ|\u0087ä\u009d¢÷ê\u0095º\u0091¢!\u0001Fñq\u0010#(ÀzÀ\u000b\u000bC\u0012\u0018\u000b$¡i]¤¯>\u001a\u000e¦ñ}{3\u0088Ï1åß\u000e.J\u001a\u0088R9\u000fG²\u0080o&a¯\u001c&pS{NLr\u0082UÇXÑ\u0004q\b\u0006s¾N\\Ë\u0012\u008bòÓÓp~Ê\u008c0,Tð÷G°¥Öö\u0013\u0006\u0007¯/~\u0005F\u0012#Y¸\u0087\u0018cX×\u0013ø\u0098#ðtªÙ\u0003\u0018ªi\u001cÄLå_\u0093>HS6q\u009ffV7\u0094kI\u0006l\tcókq¾Ñ\u0082¡íCô ë³_ñ\u0013e±\to-\u008a_>0\u0006ËN\u0006 \u0084}\u0007M¨TFG\u008a¬Ú¡ßJ\u0084\u0091\u0013¬ÙÍY©·\fhr½ÜÕø\u001f¤YõH³\u0019_ý'\u009eß\\á%'Ç\u009f\t<ÐJJ5\u001d94Ë¡\u001eÈËÆÍýa\u0098\u0084\u0082ôÌø\u001eÉÌlYÚ¸Ò}rGO£8¦\u0013\u0002P\u0090É~\u0011ÞA\u0095`\u009cÂÃk\u009e@\tÿ£\u0015U«_\u00ads\u0088,¹Ä\u0098æ(¾±\u000e\u009dÂÕ\u00016,¦²\u008fê¾µ£®¢º\u000e-à!\u009dº¨Yp/èè§\u001e\u0014)à4\u0016P\u0080&ïÂ\u0095(\u0084\u008c¥x&@%_(\u0019ñ¹Ü\u0013¯Ö¯¥\u0087Êêæ?\u0096eôßFósV\u0088\u009fþcb\u0085d\u0003D\u008fü\u001eôè\rQ\t\u0019¸ e§\u0082À¼\u008d]hØ2í¨êË!mú\u0082c\"O¤ªÛ}=Þ÷Y\u0007¬Â\u00ad.×îû÷dZWd\u0001ËÂûA\u008fÎw¢åºÐ\u0092G3x\u009dÂQÑ:\u0006àa\u0085ÜÃ\u0001k\"\u0081ÅRÝ6©\u0004(z¦ \u0012'\u000e\u001ccÚt÷Z±\u0006ûòÕî\u001b'\b¸\u009eU\u008dÏÿß\u0001sÍ`ÇòlVþX\u0018à\u0003-JBI\u0080©ø:`\u009cxß\u0083\u0014\u0090¸\u007f9ÌÎ\u0083\u008dkN6\u000böë\u0095éì\u000f\u001bn\u001fÉwíÈvE\u007fl{¤\u0096\u0086ÌÈ¾ü\u0001\u001bÃßñ\u0001¢óe`9`´Q\u0098\u0095r\u0098\u000f\u009aÝ\u009aWëÈñ\bóð|ðí\u0002Ü±j!Ü»Ô0¾ýã Õhî¨\u009a^¶W\u0012ñnä\u0091&ác£ó¾ \u001arF\u008a\u001bC\u001d£\u0080Öµ Û\u0082uMâL\u0099Ê\u0010Ìé\u001c¡ym\u00ad7'à\u0081±ÏÙ«/Üè\u001a¿\u0097, N£ ÎBI?\u0088Í\u001c÷Î@¦Øö\u008aûl\u007f\u0096n\rY\u009e\u0095À\u001a\u0014\b{ë X\r1jÖ¹DçÔÏ· \u001b§\u0015E'õó¼WÁ²\u001fÃÊõ\"ªäÊ® \tó\b4[\u0080¢5È\u000f©nÉD\u008c7Î\rÇ»\u001cÎ\u0082\u0007lýf©¿üÍ\u0086\u0010O6-\u000fÿ\u0084ð´\u0087ÀJÄ\u0001W{\u000e\u00108\u001e\u0012tL\r\u0018\u0099ö|$\u0096\u001cð9ã(àóüÝß\u0087·¦Á\u0080Ð9i|a»Ø\u0094ð7::<²Cùh¿ë¥\u001aXC@Mv®¨Ëæ(%\u0012M¢ \u001fü\u0084ûëÆmM \u008d°D\u0089Y\u00122·¼±KûýqvWÁ\u001d£ _½¥×éÐ\u0010\u008fîwØöíVÛ\u0095öþ\u001bA\u008a\u008aä\u0010µç}AÔ\fïð\u0016ªµ¸0Ñ\u008b« \u001b69\u009e<y\u0086\u0099¸\u0016\u0080\u0084_%8V\u000bUti]î¿¼Ætà+¨¨__(w\u0083¼\u0090ÎÉzË\u0097\"¿\u0015\u0098¸\u0006Ü]3\u0015õà(\u0099c0õsc\u001dÆ:µ\nëË\u008c,ÿKf(À\u0010%÷h¦ËN\u000b¾\u000fþ\u0095\u008fiK\u0089ºA¤\u0081$÷j%6\u000eÉòuÏÌ,2%È\u0087¯\u001a 8\r\u001d\u0016gS²ìßÉÓµþ\u0004_\u007f\u0000\u009e¾C\u0089Mè\fV\u000b£j\u0084üÖ\u009e¹ò([\u0006ä'kø>>i¬#\u001dÑ]~\u0011klR\u001d\u00129`¬â\rî7\u0091R'\u001d~\u0016Ï\u001f\u0089«\u0092.\u0002ò\u0080\u0099\u0003\u008aò\u0089·\u0003y\u001c´\u0006Fe¼#\u008a\u009c\u0006\u009e\u0007âYm9úPµ.îs\u0089<\u009bÆWxoòo oÏÌ^¸¾rù\u0094 mßÍ½\u001dq7VìÕAõ\u008aé\u0015Î\u001eq}Qn?QMv6Hñ\u009f7×0\u0003Îr\u0087ifÁ\u0080u\u0086ßéhB\u0099\u009dhQ³:u\u0091»4Å\u0004aß\u0000ÉIø\u008e^3ì\u000eº·\u008d(\u000bê9üË\u0087ÿ?\u0001N~ï(i\u0003¾\u009c:3lÄ\n><=\u0018(#\u0013/M\u0014\u008dÖ+¶º\u0086ÏZ\u0005\u009bè\u0092W=\u0083Ît\u0019\t\u00ads\b\u001dè÷Í\u001a¤\u0000¾\r6³q×\u0018Å©Gè\u00024÷óÈk\u000bÚÜv8)\u0093»öDßî:0Pë]?(<½\u008cu\u001a\u00067~\u008c\u009a¤ÝA\u0088\u0091\u001ej6Ýµ\u0087¡¿ßç\u0003ùC$à\u0001¾\u0010\u0096ÌCµÈÓAg\u00890c{'\u008cý#\nwq\u0016\u0000\u0097lim$\u0095Ô@uô¿èíjÑËì3>/\u0007Î(¬û\u0016Îß\u0004ÅÔaÛl5\u001b\r«.\u0086Õ\u0006é\u0081°\f[$\tRÓ\u0015Z\nä:öxÏö\rö«\u0010×\u0095r0\t\u0017ø\u0080µ\u0091ËÈ`\u0002*å\u0010¨>\u008b\u001f\u0014Ý\u008el¼Ít\u009b\u001d¨Îõ\u0010Ð_ãÅ\u009cò\u00adßÚW\u0080\u0094m\u0095,µ`Bº\u008be\u0011\u0084 ¾\u009b¯£ÄpÐRoùA¼\u0089ÓüT\u0019\u0007²;ÖÝwÂGë/ 6}ªJ4zÓqb²\u0082Sxß\u001c\tÕólêL\u0081Â\u0080ÁzTKÝ)¿L7\u0005\u0085ÜoÓÛgìÛ2{\u0019%P·½k\u001f\b+±t±\f+û\u001f&\u0010«RK\\\u0005-\u0099y)L¶2\u0098ËÅ\u008d +ýd\u009cÕ§$\u0089\u008dB\u0086\u001a@×H2¢\u009e\u007f\u009e\b\u0085\u0016 z\u001fæÜ\u008e¨?\u0017\u0018Ò¨/FÈ:ZÌ\u0007z\u008a1\u0017\u0082S½Ñ\u001d\\_zÞå08D\u0092z½ Ø-»ö¡Ö\u008f\u0095Æc\u001dC`\u00ad¬X6ÌØû¬\u0018è`BíØ0Îä`\u0019\u0000ôÖQÉ¸õ\u001aÒ\u008a7%ÈÊÎ»¿\\@`ã$áÂ\u0081òB)t§\r\u001fä]\u008aãu%RpÆ0\u0080z)§\u007f\u009aq&\u0096n´O'¯+\u0090ñQ\u0089\\f#\u0017E@Ûï\u0084¦iÈô\"\u0083\u0017î×1Á\b\u000e\u0084«x S(NÊá\u0084\u0010¨\u001fC@øï§,ïáb\b¥^Z£ãÖ~è å";
      int var17 = "÷ú£FRº\u001fXü\u0099£¯d¿¿4\u0087\u0095OMüÕk\b\u009fò\u008fcô¾8\u0083à6«ß.Öt«¼*ÖÄ\u009bÕæ&F\u0084\u00857\u0018@\u0016È\u0014z\u009b¤¸\u001eL@\r~\u0004½ä\u0004uT ¡¦Ê\u00952$\u0098\b°NB|®ú\u009e\u009e:á¥LZ¦\u009d<D\u0013\u0012Ó\u0002ÿ!êH\u0019Å\u009bgµ\u000e¥µV\u00881\u008b ]l?qsõ¸æ\tÅÔTÏr&h&F\u0087ìcj\u0003OD\u0005¨\u008e\u001fp¿È\u0099\u0002°£¡\u008a©j~\u0082\u0099\u0085þ7GµÆh¶\u0013x½\u001dj³°\n\u0010ÿªv\u009c\nå\u0080\u001cTl(®¢\u0094Q\r\u0010n>L\u0001\u0017³·é>\u00adÄý\u008e*.:@?\u0081è¡ZMA`Þ\u009c%IF\u0091\u0006 \"H¾ú\u0012Ôû »\u00adÀzJÒ\u008b\ro¦hÒ\u0095>ÖL;\u008c8esÔ\u0011O³\b»¢ç\u0089\u001e\u009bÌh\u0014C³\n?#\u0010BºæSq\u0019YôÌdµþ/Þca\u0010i©\u0091\u0007Õt(äèK SÑÓ[¡\u00109\\R\u0017Á´\u009bQè\u0004[\u0091\u00911Ñ\u0015()cºÀ¯Ò\u0017Ô0 Ç³mlÆmhv#¦÷V$\u0081\u000bMy\"_nã\u0084Ç'v\u007fj2d\n\u0018\u0099ñØ\u001b\u001a®¹^\u0018\u009d\u001f¬[iy\u0016Ms~é´\u0090ýÄPq¾ªW=1Ó\u009c\u0005F,á\u001b;#\u0095&\u0015\u0004ËG\u0010¯Ñ½ø1\u009bK0\u0006\u0004±¼TL(ª\u001apÛÛÈäïÆwEá\tÎ¢µ\u0091\u0083×\u0090ù¡\u0080Â*@z±òyö¬\u008b¬-Z4\u0087Y*@\u0016\u008e\u0010¹ÌP½Ìy`\u0005xü\u0019GgPÒû\u0080/øÏÑ.&¦ô\u0000{ä\u0085\u0019áÂ¨§\u0005\u001eÒ\u0088È\u001f$´\u008a!\u0001C\"3FRþP.7\u0091ÇZtlh%\u0002\u0090þÎ¬¬ÌD9\u0091Lß\u0014¿\u0094oB¸Â)<\u001f7A\f\u001c]7\u001fÿ\u0007äÜ|\u0087ä\u009d¢÷ê\u0095º\u0091¢!\u0001Fñq\u0010#(ÀzÀ\u000b\u000bC\u0012\u0018\u000b$¡i]¤¯>\u001a\u000e¦ñ}{3\u0088Ï1åß\u000e.J\u001a\u0088R9\u000fG²\u0080o&a¯\u001c&pS{NLr\u0082UÇXÑ\u0004q\b\u0006s¾N\\Ë\u0012\u008bòÓÓp~Ê\u008c0,Tð÷G°¥Öö\u0013\u0006\u0007¯/~\u0005F\u0012#Y¸\u0087\u0018cX×\u0013ø\u0098#ðtªÙ\u0003\u0018ªi\u001cÄLå_\u0093>HS6q\u009ffV7\u0094kI\u0006l\tcókq¾Ñ\u0082¡íCô ë³_ñ\u0013e±\to-\u008a_>0\u0006ËN\u0006 \u0084}\u0007M¨TFG\u008a¬Ú¡ßJ\u0084\u0091\u0013¬ÙÍY©·\fhr½ÜÕø\u001f¤YõH³\u0019_ý'\u009eß\\á%'Ç\u009f\t<ÐJJ5\u001d94Ë¡\u001eÈËÆÍýa\u0098\u0084\u0082ôÌø\u001eÉÌlYÚ¸Ò}rGO£8¦\u0013\u0002P\u0090É~\u0011ÞA\u0095`\u009cÂÃk\u009e@\tÿ£\u0015U«_\u00ads\u0088,¹Ä\u0098æ(¾±\u000e\u009dÂÕ\u00016,¦²\u008fê¾µ£®¢º\u000e-à!\u009dº¨Yp/èè§\u001e\u0014)à4\u0016P\u0080&ïÂ\u0095(\u0084\u008c¥x&@%_(\u0019ñ¹Ü\u0013¯Ö¯¥\u0087Êêæ?\u0096eôßFósV\u0088\u009fþcb\u0085d\u0003D\u008fü\u001eôè\rQ\t\u0019¸ e§\u0082À¼\u008d]hØ2í¨êË!mú\u0082c\"O¤ªÛ}=Þ÷Y\u0007¬Â\u00ad.×îû÷dZWd\u0001ËÂûA\u008fÎw¢åºÐ\u0092G3x\u009dÂQÑ:\u0006àa\u0085ÜÃ\u0001k\"\u0081ÅRÝ6©\u0004(z¦ \u0012'\u000e\u001ccÚt÷Z±\u0006ûòÕî\u001b'\b¸\u009eU\u008dÏÿß\u0001sÍ`ÇòlVþX\u0018à\u0003-JBI\u0080©ø:`\u009cxß\u0083\u0014\u0090¸\u007f9ÌÎ\u0083\u008dkN6\u000böë\u0095éì\u000f\u001bn\u001fÉwíÈvE\u007fl{¤\u0096\u0086ÌÈ¾ü\u0001\u001bÃßñ\u0001¢óe`9`´Q\u0098\u0095r\u0098\u000f\u009aÝ\u009aWëÈñ\bóð|ðí\u0002Ü±j!Ü»Ô0¾ýã Õhî¨\u009a^¶W\u0012ñnä\u0091&ác£ó¾ \u001arF\u008a\u001bC\u001d£\u0080Öµ Û\u0082uMâL\u0099Ê\u0010Ìé\u001c¡ym\u00ad7'à\u0081±ÏÙ«/Üè\u001a¿\u0097, N£ ÎBI?\u0088Í\u001c÷Î@¦Øö\u008aûl\u007f\u0096n\rY\u009e\u0095À\u001a\u0014\b{ë X\r1jÖ¹DçÔÏ· \u001b§\u0015E'õó¼WÁ²\u001fÃÊõ\"ªäÊ® \tó\b4[\u0080¢5È\u000f©nÉD\u008c7Î\rÇ»\u001cÎ\u0082\u0007lýf©¿üÍ\u0086\u0010O6-\u000fÿ\u0084ð´\u0087ÀJÄ\u0001W{\u000e\u00108\u001e\u0012tL\r\u0018\u0099ö|$\u0096\u001cð9ã(àóüÝß\u0087·¦Á\u0080Ð9i|a»Ø\u0094ð7::<²Cùh¿ë¥\u001aXC@Mv®¨Ëæ(%\u0012M¢ \u001fü\u0084ûëÆmM \u008d°D\u0089Y\u00122·¼±KûýqvWÁ\u001d£ _½¥×éÐ\u0010\u008fîwØöíVÛ\u0095öþ\u001bA\u008a\u008aä\u0010µç}AÔ\fïð\u0016ªµ¸0Ñ\u008b« \u001b69\u009e<y\u0086\u0099¸\u0016\u0080\u0084_%8V\u000bUti]î¿¼Ætà+¨¨__(w\u0083¼\u0090ÎÉzË\u0097\"¿\u0015\u0098¸\u0006Ü]3\u0015õà(\u0099c0õsc\u001dÆ:µ\nëË\u008c,ÿKf(À\u0010%÷h¦ËN\u000b¾\u000fþ\u0095\u008fiK\u0089ºA¤\u0081$÷j%6\u000eÉòuÏÌ,2%È\u0087¯\u001a 8\r\u001d\u0016gS²ìßÉÓµþ\u0004_\u007f\u0000\u009e¾C\u0089Mè\fV\u000b£j\u0084üÖ\u009e¹ò([\u0006ä'kø>>i¬#\u001dÑ]~\u0011klR\u001d\u00129`¬â\rî7\u0091R'\u001d~\u0016Ï\u001f\u0089«\u0092.\u0002ò\u0080\u0099\u0003\u008aò\u0089·\u0003y\u001c´\u0006Fe¼#\u008a\u009c\u0006\u009e\u0007âYm9úPµ.îs\u0089<\u009bÆWxoòo oÏÌ^¸¾rù\u0094 mßÍ½\u001dq7VìÕAõ\u008aé\u0015Î\u001eq}Qn?QMv6Hñ\u009f7×0\u0003Îr\u0087ifÁ\u0080u\u0086ßéhB\u0099\u009dhQ³:u\u0091»4Å\u0004aß\u0000ÉIø\u008e^3ì\u000eº·\u008d(\u000bê9üË\u0087ÿ?\u0001N~ï(i\u0003¾\u009c:3lÄ\n><=\u0018(#\u0013/M\u0014\u008dÖ+¶º\u0086ÏZ\u0005\u009bè\u0092W=\u0083Ît\u0019\t\u00ads\b\u001dè÷Í\u001a¤\u0000¾\r6³q×\u0018Å©Gè\u00024÷óÈk\u000bÚÜv8)\u0093»öDßî:0Pë]?(<½\u008cu\u001a\u00067~\u008c\u009a¤ÝA\u0088\u0091\u001ej6Ýµ\u0087¡¿ßç\u0003ùC$à\u0001¾\u0010\u0096ÌCµÈÓAg\u00890c{'\u008cý#\nwq\u0016\u0000\u0097lim$\u0095Ô@uô¿èíjÑËì3>/\u0007Î(¬û\u0016Îß\u0004ÅÔaÛl5\u001b\r«.\u0086Õ\u0006é\u0081°\f[$\tRÓ\u0015Z\nä:öxÏö\rö«\u0010×\u0095r0\t\u0017ø\u0080µ\u0091ËÈ`\u0002*å\u0010¨>\u008b\u001f\u0014Ý\u008el¼Ít\u009b\u001d¨Îõ\u0010Ð_ãÅ\u009cò\u00adßÚW\u0080\u0094m\u0095,µ`Bº\u008be\u0011\u0084 ¾\u009b¯£ÄpÐRoùA¼\u0089ÓüT\u0019\u0007²;ÖÝwÂGë/ 6}ªJ4zÓqb²\u0082Sxß\u001c\tÕólêL\u0081Â\u0080ÁzTKÝ)¿L7\u0005\u0085ÜoÓÛgìÛ2{\u0019%P·½k\u001f\b+±t±\f+û\u001f&\u0010«RK\\\u0005-\u0099y)L¶2\u0098ËÅ\u008d +ýd\u009cÕ§$\u0089\u008dB\u0086\u001a@×H2¢\u009e\u007f\u009e\b\u0085\u0016 z\u001fæÜ\u008e¨?\u0017\u0018Ò¨/FÈ:ZÌ\u0007z\u008a1\u0017\u0082S½Ñ\u001d\\_zÞå08D\u0092z½ Ø-»ö¡Ö\u008f\u0095Æc\u001dC`\u00ad¬X6ÌØû¬\u0018è`BíØ0Îä`\u0019\u0000ôÖQÉ¸õ\u001aÒ\u008a7%ÈÊÎ»¿\\@`ã$áÂ\u0081òB)t§\r\u001fä]\u008aãu%RpÆ0\u0080z)§\u007f\u009aq&\u0096n´O'¯+\u0090ñQ\u0089\\f#\u0017E@Ûï\u0084¦iÈô\"\u0083\u0017î×1Á\b\u000e\u0084«x S(NÊá\u0084\u0010¨\u001fC@øï§,ïáb\b¥^Z£ãÖ~è å"
         .length();
      char var14 = 'H';
      int var24 = -1;

      label54:
      while (true) {
         String var26 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
            String var37 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[49];
                     g = new HashMap(13);
                     Cipher var0;
                     Cipher var28 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var28.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[17];
                     int var3 = 0;
                     String var4 = "âÜ´\u0013\u0000û£b>Úþ\u009dÒÊÈ\u000b®\u0095Eã`\u0016²ÜÈéw\u0093~«q\u008cA\u000e¿iO\u0090?a\u0017j°k¸÷©æ\u008a\u0093Á\u000bK\u0098`,jÀ\u0014\u001eå&\u0082Î\u0011 \u000e\u00ad6ô)\u0089fFåSÂªË}ËsOº>Ñôá_\u001e\r{\u0017¢\u0087\u008býÏ'ú[e½ú\u0015¤O\u0080\u0094'ï³\u008e(q°º\u0092H\u0018";
                     int var5 = "âÜ´\u0013\u0000û£b>Úþ\u009dÒÊÈ\u000b®\u0095Eã`\u0016²ÜÈéw\u0093~«q\u008cA\u000e¿iO\u0090?a\u0017j°k¸÷©æ\u008a\u0093Á\u000bK\u0098`,jÀ\u0014\u001eå&\u0082Î\u0011 \u000e\u00ad6ô)\u0089fFåSÂªË}ËsOº>Ñôá_\u001e\r{\u0017¢\u0087\u008býÏ'ú[e½ú\u0015¤O\u0080\u0094'ï³\u008e(q°º\u0092H\u0018"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var29 = var6;
                        var10001 = var3++;
                        long var41 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var44 = -1;

                        while (true) {
                           long var8 = var41;
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
                           long var46 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var29[var10001] = var46;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[17];
                                    return;
                                 }
                                 break;
                              default:
                                 var29[var10001] = var46;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "~gnV/ôú2~Ïb\nzõÆ`";
                                 var5 = "~gnV/ôú2~Ïb\nzõÆ`".length();
                                 var2 = 0;
                           }

                           byte var35 = var2;
                           var2 += 8;
                           var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                           var29 = var6;
                           var10001 = var3++;
                           var41 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var37;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "k\u000eam4ª\"ZÈ¨¡\u009füú|Í\u0017Í\u0085UÚÄ\u0098çÓèêÖÕC¿Ö 8GA¯ê\u009a'x\u000fûÏ\u009cÑ9Ë\u0015\u00009A¼îöq\u0094dZÐÉà¥©þ";
                  var17 = "k\u000eam4ª\"ZÈ¨¡\u009füú|Í\u0017Í\u0085UÚÄ\u0098çÓèêÖÕC¿Ö 8GA¯ê\u009a'x\u000fûÏ\u009cÑ9Ë\u0015\u00009A¼îöq\u0094dZÐÉà¥©þ".length();
                  var14 = ' ';
                  var24 = -1;
            }

            var26 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25757;
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
            throw new RuntimeException("com/zelix/g3", var10);
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
         throw new RuntimeException("com/zelix/g3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8227;
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
            throw new RuntimeException("com/zelix/g3", var14);
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
         throw new RuntimeException("com/zelix/g3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
