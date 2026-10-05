package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class se implements sr {
   private HashSet[] L;
   private List J;
   private int h;
   private static final long a = ess.a(4580978136519226993L, -3301811748743578458L, MethodHandles.lookup().lookupClass()).a(165521958267612L);
   private static final String c;
   private static final long[] d;
   private static final Integer[] e;
   private static final Map f;

   public String u(Object[] param1) {
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
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/se.a J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 136657054802591
      // 021: lxor
      // 022: lstore 5
      // 024: dup2
      // 025: ldc2_w 60762678937977
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 20607371423771
      // 02f: lxor
      // 030: lstore 9
      // 032: dup2
      // 033: ldc2_w 112221102794335
      // 036: lxor
      // 037: lstore 11
      // 039: pop2
      // 03a: new java/lang/StringBuffer
      // 03d: dup
      // 03e: invokespecial java/lang/StringBuffer.<init> ()V
      // 041: astore 14
      // 043: ldc2_w 4706213950368767789
      // 046: lload 3
      // 047: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: bipush 0
      // 04d: istore 15
      // 04f: istore 13
      // 051: iload 15
      // 053: aload 0
      // 054: ldc2_w 6725017262956352560
      // 057: lload 3
      // 058: invokedynamic o (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: arraylength
      // 05e: if_icmpge 1eb
      // 061: aload 0
      // 062: ldc2_w 6725017262956352560
      // 065: lload 3
      // 066: invokedynamic o (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: iload 15
      // 06d: aaload
      // 06e: astore 16
      // 070: lload 3
      // 071: lconst_0
      // 072: lcmp
      // 073: iflt 083
      // 076: aload 14
      // 078: ldc "["
      // 07a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 07d: iload 13
      // 07f: ifeq 1ed
      // 082: pop
      // 083: aload 16
      // 085: ldc2_w 6737398770377941707
      // 088: lload 3
      // 089: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: astore 17
      // 090: aload 17
      // 092: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 097: ifeq 1d5
      // 09a: aload 17
      // 09c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a1: checkcast com/zelix/sr
      // 0a4: astore 18
      // 0a6: lload 3
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: iflt 1e6
      // 0ac: aload 14
      // 0ae: iload 13
      // 0b0: ifeq 1e2
      // 0b3: iload 2
      // 0b4: lload 3
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: iflt 115
      // 0ba: iload 13
      // 0bc: ifeq 115
      // 0bf: goto 0cc
      // 0c2: ldc2_w 4776463859994504027
      // 0c5: lload 3
      // 0c6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: ifeq 17b
      // 0cf: goto 0dc
      // 0d2: ldc2_w 4776463859994504027
      // 0d5: lload 3
      // 0d6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 18
      // 0de: iload 13
      // 0e0: ifeq 17d
      // 0e3: goto 0f0
      // 0e6: ldc2_w 4776463859994504027
      // 0e9: lload 3
      // 0ea: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: lload 7
      // 0f2: bipush 1
      // 0f3: anewarray 503
      // 0f6: dup_x2
      // 0f7: dup_x2
      // 0f8: pop
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: ldc2_w 4971343566324080719
      // 102: lload 3
      // 103: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: goto 115
      // 10b: ldc2_w 4776463859994504027
      // 10e: lload 3
      // 10f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: ifeq 17b
      // 118: aload 18
      // 11a: iload 13
      // 11c: ifeq 17d
      // 11f: goto 12c
      // 122: ldc2_w 4776463859994504027
      // 125: lload 3
      // 126: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: lload 5
      // 12e: bipush 1
      // 12f: anewarray 503
      // 132: dup_x2
      // 133: dup_x2
      // 134: pop
      // 135: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 138: bipush 0
      // 139: swap
      // 13a: aastore
      // 13b: ldc2_w 6469947220402806987
      // 13e: lload 3
      // 13f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: ifeq 17b
      // 147: goto 154
      // 14a: ldc2_w 4776463859994504027
      // 14d: lload 3
      // 14e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: aload 18
      // 156: lload 11
      // 158: bipush 1
      // 159: anewarray 503
      // 15c: dup_x2
      // 15d: dup_x2
      // 15e: pop
      // 15f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 162: bipush 0
      // 163: swap
      // 164: aastore
      // 165: ldc2_w 4648332371835655008
      // 168: lload 3
      // 169: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: goto 195
      // 171: ldc2_w 4776463859994504027
      // 174: lload 3
      // 175: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: aload 18
      // 17d: lload 9
      // 17f: bipush 1
      // 180: anewarray 503
      // 183: dup_x2
      // 184: dup_x2
      // 185: pop
      // 186: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 189: bipush 0
      // 18a: swap
      // 18b: aastore
      // 18c: ldc2_w 4832844600843513377
      // 18f: lload 3
      // 190: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 198: iload 13
      // 19a: ifeq 1cf
      // 19d: pop
      // 19e: aload 17
      // 1a0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a5: lload 3
      // 1a6: lconst_0
      // 1a7: lcmp
      // 1a8: ifle 1d2
      // 1ab: ifeq 1d0
      // 1ae: goto 1bb
      // 1b1: ldc2_w 4776463859994504027
      // 1b4: lload 3
      // 1b5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: aload 14
      // 1bd: ldc ","
      // 1bf: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c2: goto 1cf
      // 1c5: ldc2_w 4776463859994504027
      // 1c8: lload 3
      // 1c9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: pop
      // 1d0: iload 13
      // 1d2: ifne 090
      // 1d5: aload 14
      // 1d7: ldc "]"
      // 1d9: lload 3
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: ifle 07a
      // 1df: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1e2: pop
      // 1e3: iinc 15 1
      // 1e6: iload 13
      // 1e8: ifne 051
      // 1eb: aload 14
      // 1ed: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1f0: areturn
   }

   public boolean l(Object[] param1) {
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
      // 00c: getstatic com/zelix/se.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 4816051318380
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 93676325044554
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w -6540584734052823506
      // 025: lload 2
      // 026: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: bipush 0
      // 02c: istore 9
      // 02e: istore 8
      // 030: iload 9
      // 032: aload 0
      // 033: ldc2_w -5025668966182161627
      // 036: lload 2
      // 037: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: arraylength
      // 03d: if_icmpge 1a3
      // 040: aload 0
      // 041: ldc2_w -5025668966182161627
      // 044: lload 2
      // 045: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: iload 9
      // 04c: aaload
      // 04d: astore 10
      // 04f: aload 10
      // 051: ldc2_w -6521596669876900132
      // 054: lload 2
      // 055: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: istore 11
      // 05c: iload 11
      // 05e: iload 8
      // 060: lload 2
      // 061: lconst_0
      // 062: lcmp
      // 063: iflt 06b
      // 066: ifne 1aa
      // 069: iload 8
      // 06b: lload 2
      // 06c: lconst_0
      // 06d: lcmp
      // 06e: iflt 0a0
      // 071: ifne 09f
      // 074: goto 081
      // 077: ldc2_w -6531244544571913138
      // 07a: lload 2
      // 07b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: ifne 09d
      // 084: goto 091
      // 087: ldc2_w -6531244544571913138
      // 08a: lload 2
      // 08b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: bipush 0
      // 092: ireturn
      // 093: ldc2_w -6531244544571913138
      // 096: lload 2
      // 097: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: iload 11
      // 09f: bipush 1
      // 0a0: if_icmple 195
      // 0a3: aconst_null
      // 0a4: astore 12
      // 0a6: aload 10
      // 0a8: ldc2_w -5002022136145771042
      // 0ab: lload 2
      // 0ac: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: astore 13
      // 0b3: aload 13
      // 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ba: ifeq 195
      // 0bd: aload 13
      // 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c4: checkcast com/zelix/sr
      // 0c7: astore 14
      // 0c9: aload 14
      // 0cb: lload 4
      // 0cd: bipush 1
      // 0ce: anewarray 503
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w -6635788517164693670
      // 0dd: lload 2
      // 0de: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: iload 8
      // 0e5: ifne 032
      // 0e8: iload 8
      // 0ea: lload 2
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: ifle 060
      // 0f0: ifne 18f
      // 0f3: ifeq 181
      // 0f6: goto 103
      // 0f9: ldc2_w -6531244544571913138
      // 0fc: lload 2
      // 0fd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: aload 14
      // 105: lload 6
      // 107: bipush 1
      // 108: anewarray 503
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 0
      // 112: swap
      // 113: aastore
      // 114: ldc2_w -6370620363816733579
      // 117: lload 2
      // 118: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: astore 15
      // 11f: aload 12
      // 121: lload 2
      // 122: lconst_0
      // 123: lcmp
      // 124: iflt 15a
      // 127: iload 8
      // 129: ifne 15a
      // 12c: ifnonnull 14b
      // 12f: goto 13c
      // 132: ldc2_w -6531244544571913138
      // 135: lload 2
      // 136: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: athrow
      // 13c: aload 15
      // 13e: astore 12
      // 140: iload 8
      // 142: lload 2
      // 143: lconst_0
      // 144: lcmp
      // 145: ifle 178
      // 148: ifeq 176
      // 14b: aload 12
      // 14d: goto 15a
      // 150: ldc2_w -6531244544571913138
      // 153: lload 2
      // 154: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: aload 15
      // 15c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15f: iload 8
      // 161: ifne 175
      // 164: ifne 176
      // 167: goto 174
      // 16a: ldc2_w -6531244544571913138
      // 16d: lload 2
      // 16e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: bipush 0
      // 175: ireturn
      // 176: iload 8
      // 178: lload 2
      // 179: lconst_0
      // 17a: lcmp
      // 17b: iflt 192
      // 17e: ifeq 190
      // 181: bipush 0
      // 182: goto 18f
      // 185: ldc2_w -6531244544571913138
      // 188: lload 2
      // 189: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: ireturn
      // 190: iload 8
      // 192: ifeq 0b3
      // 195: iinc 9 1
      // 198: iload 8
      // 19a: lload 2
      // 19b: lconst_0
      // 19c: lcmp
      // 19d: iflt 032
      // 1a0: ifeq 030
      // 1a3: lload 2
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: ifle 040
      // 1a9: bipush 1
      // 1aa: ireturn
   }

   public boolean f(Object[] param1) {
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
      // 15: ldc2_w -8631461065985419692
      // 18: lload 2
      // 19: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: istore 6
      // 20: aload 0
      // 21: ldc2_w -8557011114941925765
      // 24: lload 2
      // 25: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: invokeinterface java/util/List.size ()I 1
      // 2f: iload 6
      // 31: ifeq 51
      // 34: ifle 50
      // 37: goto 44
      // 3a: ldc2_w -8417122350145576414
      // 3d: lload 2
      // 3e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
      // 46: ldc2_w -8417122350145576414
      // 49: lload 2
      // 4a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: bipush 0
      // 51: istore 7
      // 53: iload 7
      // 55: aload 0
      // 56: ldc2_w -7769491305351684791
      // 59: lload 2
      // 5a: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: arraylength
      // 60: if_icmpge e4
      // 63: aload 0
      // 64: ldc2_w -7769491305351684791
      // 67: lload 2
      // 68: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: iload 7
      // 6f: aaload
      // 70: astore 8
      // 72: aload 8
      // 74: ldc2_w -7712067744398365774
      // 77: lload 2
      // 78: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: astore 9
      // 7f: aload 9
      // 81: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 86: ifeq d6
      // 89: aload 9
      // 8b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 90: checkcast com/zelix/sr
      // 93: astore 10
      // 95: aload 10
      // 97: lload 4
      // 99: bipush 1
      // 9a: anewarray 503
      // 9d: dup_x2
      // 9e: dup_x2
      // 9f: pop
      // a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a3: bipush 0
      // a4: swap
      // a5: aastore
      // a6: ldc2_w -8249198269799896778
      // a9: lload 2
      // aa: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: iload 6
      // b1: ifeq 55
      // b4: iload 6
      // b6: lload 2
      // b7: lconst_0
      // b8: lcmp
      // b9: iflt 60
      // bc: ifeq d0
      // bf: ifne d1
      // c2: goto cf
      // c5: ldc2_w -8417122350145576414
      // c8: lload 2
      // c9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: athrow
      // cf: bipush 0
      // d0: ireturn
      // d1: iload 6
      // d3: ifne 7f
      // d6: iinc 7 1
      // d9: iload 6
      // db: lload 2
      // dc: lconst_0
      // dd: lcmp
      // de: iflt 55
      // e1: ifne 53
      // e4: lload 2
      // e5: lconst_0
      // e6: lcmp
      // e7: ifle 63
      // ea: bipush 1
      // eb: ireturn
   }

   public String s(Object[] param1) {
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
      // 15: ldc2_w -6408425767507576462
      // 18: lload 2
      // 19: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: istore 6
      // 20: aload 0
      // 21: ldc2_w -6583375649970882860
      // 24: lload 2
      // 25: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: bipush 1
      // 2b: iload 6
      // 2d: ifeq 7b
      // 30: if_icmpne c1
      // 33: goto 40
      // 36: ldc2_w -6623090248689562364
      // 39: lload 2
      // 3a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: ldc2_w -4968761759355243921
      // 44: lload 2
      // 45: lconst_0
      // 46: lcmp
      // 47: iflt aa
      // 4a: lload 2
      // 4b: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: bipush 0
      // 51: aaload
      // 52: iload 6
      // 54: ifeq a5
      // 57: goto 64
      // 5a: ldc2_w -6623090248689562364
      // 5d: lload 2
      // 5e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: ldc2_w -6614390016652480618
      // 67: lload 2
      // 68: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: bipush 1
      // 6e: goto 7b
      // 71: ldc2_w -6623090248689562364
      // 74: lload 2
      // 75: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: if_icmpne c1
      // 7e: aload 0
      // 7f: ldc2_w -4968761759355243921
      // 82: lload 2
      // 83: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: bipush 0
      // 89: aaload
      // 8a: ldc2_w -4909088053492972396
      // 8d: lload 2
      // 8e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 98: goto a5
      // 9b: ldc2_w -6623090248689562364
      // 9e: lload 2
      // 9f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: checkcast com/zelix/sr
      // a8: lload 4
      // aa: bipush 1
      // ab: anewarray 503
      // ae: dup_x2
      // af: dup_x2
      // b0: pop
      // b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b4: bipush 0
      // b5: swap
      // b6: aastore
      // b7: ldc2_w -6422881034773105345
      // ba: lload 2
      // bb: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: areturn
      // c1: aconst_null
      // c2: areturn
   }

   public boolean B(Object[] param1) {
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
      // 0c: ldc2_w 7192434348547833266
      // 0f: lload 2
      // 10: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: ldc2_w 6945461997891072532
      // 1b: lload 2
      // 1c: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: bipush 1
      // 22: lload 2
      // 23: lconst_0
      // 24: lcmp
      // 25: iflt 78
      // 28: iload 4
      // 2a: ifeq 78
      // 2d: if_icmpne be
      // 30: goto 3d
      // 33: ldc2_w 6977787603928189380
      // 36: lload 2
      // 37: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: ldc2_w 9208581235072775855
      // 41: lload 2
      // 42: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: bipush 0
      // 48: aaload
      // 49: ldc2_w 6986469551215684438
      // 4c: lload 2
      // 4d: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: iload 4
      // 54: lload 2
      // 55: lconst_0
      // 56: lcmp
      // 57: iflt a7
      // 5a: ifeq a5
      // 5d: goto 6a
      // 60: ldc2_w 6977787603928189380
      // 63: lload 2
      // 64: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 78
      // 6e: ldc2_w 6977787603928189380
      // 71: lload 2
      // 72: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: if_icmpne be
      // 7b: aload 0
      // 7c: ldc2_w 9208581235072775855
      // 7f: lload 2
      // 80: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: bipush 0
      // 86: aaload
      // 87: ldc2_w 9160163543011737684
      // 8a: lload 2
      // 8b: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 95: instanceof com/zelix/_zn
      // 98: goto a5
      // 9b: ldc2_w 6977787603928189380
      // 9e: lload 2
      // 9f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: iload 4
      // a7: ifeq bb
      // aa: ifeq be
      // ad: goto ba
      // b0: ldc2_w 6977787603928189380
      // b3: lload 2
      // b4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: athrow
      // ba: bipush 1
      // bb: goto bf
      // be: bipush 0
      // bf: ireturn
   }

   public int B(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var4 = (Integer)var1[1];
      int var2 = (Integer)var1[2];
      return -1;
   }

   public int c(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 7179979787998769619L, var2);
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 67135027577178L;
      return x44.a<"n">(this, new Object[]{var4}, 2751794309031354636L, var2);
   }

   public ArrayList O(Object[] param1) {
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
      // 0c: getstatic com/zelix/se.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: new java/util/ArrayList
      // 15: dup
      // 16: invokespecial java/util/ArrayList.<init> ()V
      // 19: astore 5
      // 1b: ldc2_w 507589777852656670
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 6
      // 27: istore 4
      // 29: iload 6
      // 2b: aload 0
      // 2c: ldc2_w 1761261854064595221
      // 2f: lload 2
      // 30: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: arraylength
      // 36: if_icmpge 99
      // 39: aconst_null
      // 3a: astore 7
      // 3c: aload 0
      // 3d: ldc2_w 1761261854064595221
      // 40: lload 2
      // 41: invokedynamic j (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: iload 6
      // 48: aaload
      // 49: ldc2_w 1775897915446962158
      // 4c: lload 2
      // 4d: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: astore 8
      // 54: aload 8
      // 56: iload 4
      // 58: ifne 84
      // 5b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 60: ifeq 89
      // 63: goto 70
      // 66: ldc2_w 534843481754168958
      // 69: lload 2
      // 6a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: aload 8
      // 72: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 77: goto 84
      // 7a: ldc2_w 534843481754168958
      // 7d: lload 2
      // 7e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: checkcast com/zelix/sr
      // 87: astore 7
      // 89: aload 5
      // 8b: aload 7
      // 8d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 90: pop
      // 91: iinc 6 1
      // 94: iload 4
      // 96: ifeq 29
      // 99: aload 5
      // 9b: areturn
   }

   void z(Object[] param1) {
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
      // 0a: istore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/sr
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Long
      // 18: invokevirtual java/lang/Long.longValue ()J
      // 1b: lstore 4
      // 1d: pop
      // 1e: getstatic com/zelix/se.a J
      // 21: lload 4
      // 23: lxor
      // 24: lstore 4
      // 26: lload 4
      // 28: dup2
      // 29: ldc2_w 679494300900
      // 2c: lxor
      // 2d: lstore 6
      // 2f: dup2
      // 30: ldc2_w 26380214014829
      // 33: lxor
      // 34: lstore 8
      // 36: pop2
      // 37: lload 8
      // 39: bipush 3
      // 3a: bipush 2
      // 3b: anewarray 503
      // 3e: dup_x1
      // 3f: swap
      // 40: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 43: bipush 1
      // 44: swap
      // 45: aastore
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 0
      // 4d: swap
      // 4e: aastore
      // 4f: ldc2_w -6809348656092798828
      // 52: lload 4
      // 54: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: astore 11
      // 5b: aload 11
      // 5d: aload 2
      // 5e: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 61: pop
      // 62: ldc2_w -5174037822327008473
      // 65: lload 4
      // 67: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: aload 0
      // 6d: ldc2_w -6392806455758361044
      // 70: lload 4
      // 72: invokedynamic k (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: iload 3
      // 78: aload 11
      // 7a: aastore
      // 7b: istore 10
      // 7d: aload 2
      // 7e: instanceof com/zelix/ty
      // 81: iload 10
      // 83: ifne d2
      // 86: ifeq d3
      // 89: goto 97
      // 8c: ldc2_w -5164125305783824057
      // 8f: lload 4
      // 91: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: aload 0
      // 98: ldc2_w -5018581122592471778
      // 9b: lload 4
      // 9d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: aload 2
      // a3: checkcast com/zelix/ty
      // a6: lload 6
      // a8: bipush 1
      // a9: anewarray 503
      // ac: dup_x2
      // ad: dup_x2
      // ae: pop
      // af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b2: bipush 0
      // b3: swap
      // b4: aastore
      // b5: ldc2_w -6411851324922710551
      // b8: lload 4
      // ba: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // c4: goto d2
      // c7: ldc2_w -5164125305783824057
      // ca: lload 4
      // cc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: athrow
      // d2: pop
      // d3: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public ArrayList K(Object[] var1) {
      int var4 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      long var5 = ((long)var4 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      ArrayList var8 = new ArrayList();
      boolean var10000 = x44.a<"w">(1655664080268426735L, var5);
      int var9 = 0;
      boolean var7 = var10000;

      while (var9 < x44.a<"k">(this, 684557935886745828L, var5).length) {
         Iterator var10 = x44.a<"o">(x44.a<"k">(this, 684557935886745828L, var5)[var9], 672173503588447775L, var5);

         label48: {
            label47:
            while (true) {
               if (var10.hasNext()) {
                  sr var11 = (sr)var10.next();

                  try {
                     var8.add(var11);
                  } catch (gj var12) {
                     boolean var10001 = false;
                     throw x44.a<"w">(var12, 1629580496304406415L, var5);
                  }

                  do {
                     try {
                        var10000 = var7;
                        if (var3 <= 0) {
                           break label48;
                        }

                        if (var7) {
                           break label47;
                        }

                        if (!var7) {
                           continue label47;
                        }
                     } catch (gj var13) {
                        boolean var16 = false;
                        throw x44.a<"w">(var13, 1629580496304406415L, var5);
                     }
                  } while (var4 < 0);
               }

               var9++;
               break;
            }

            var10000 = var7;
         }

         if (var10000) {
            break;
         }
      }

      return var8;
   }

   public String i(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 122137755087115L;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = false;
      return x44.a<"h">(this, var10004, -1256884894717610389L, var2);
   }

   void Z(Object[] param1) {
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
      // 004: checkcast java/util/HashMap
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_uo
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/be
      // 021: astore 3
      // 022: pop
      // 023: getstatic com/zelix/se.a J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 87900906926200
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 21363454105224
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 55818102987402
      // 03f: lxor
      // 040: lstore 11
      // 042: dup2
      // 043: ldc2_w 96152144597358
      // 046: lxor
      // 047: dup2
      // 048: bipush 48
      // 04a: lushr
      // 04b: l2i
      // 04c: istore 13
      // 04e: dup2
      // 04f: bipush 16
      // 051: lshl
      // 052: bipush 32
      // 054: lushr
      // 055: l2i
      // 056: istore 14
      // 058: dup2
      // 059: bipush 48
      // 05b: lshl
      // 05c: bipush 48
      // 05e: lushr
      // 05f: l2i
      // 060: istore 15
      // 062: pop2
      // 063: dup2
      // 064: ldc2_w 28587206043352
      // 067: lxor
      // 068: lstore 16
      // 06a: dup2
      // 06b: ldc2_w 65556049143263
      // 06e: lxor
      // 06f: lstore 18
      // 071: pop2
      // 072: ldc2_w 2141780017639650988
      // 075: lload 5
      // 077: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: bipush 0
      // 07d: istore 21
      // 07f: istore 20
      // 081: iload 21
      // 083: aload 0
      // 084: ldc2_w 199057722862291879
      // 087: lload 5
      // 089: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: arraylength
      // 08f: if_icmpge 244
      // 092: aload 0
      // 093: ldc2_w 199057722862291879
      // 096: lload 5
      // 098: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: iload 21
      // 09f: aaload
      // 0a0: astore 22
      // 0a2: lload 16
      // 0a4: aload 22
      // 0a6: bipush 2
      // 0a7: anewarray 503
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 1
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x2
      // 0b0: dup_x2
      // 0b1: pop
      // 0b2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w 329535782938913779
      // 0bb: lload 5
      // 0bd: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: astore 23
      // 0c4: aload 23
      // 0c6: ldc2_w 150644208739597660
      // 0c9: lload 5
      // 0cb: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: astore 24
      // 0d2: aload 24
      // 0d4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d9: ifeq 235
      // 0dc: aload 24
      // 0de: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e3: checkcast com/zelix/sr
      // 0e6: astore 25
      // 0e8: aload 25
      // 0ea: lload 18
      // 0ec: bipush 1
      // 0ed: anewarray 503
      // 0f0: dup_x2
      // 0f1: dup_x2
      // 0f2: pop
      // 0f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f6: bipush 0
      // 0f7: swap
      // 0f8: aastore
      // 0f9: ldc2_w 2044302561020111703
      // 0fc: lload 5
      // 0fe: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: iload 20
      // 105: ifne 083
      // 108: iload 20
      // 10a: lload 5
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: ifle 08f
      // 111: ifne 14b
      // 114: ifeq 230
      // 117: goto 125
      // 11a: ldc2_w 2152253272509248716
      // 11d: lload 5
      // 11f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: aload 25
      // 127: iload 20
      // 129: ifne 150
      // 12c: goto 13a
      // 12f: ldc2_w 2152253272509248716
      // 132: lload 5
      // 134: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: instanceof com/zelix/to
      // 13d: goto 14b
      // 140: ldc2_w 2152253272509248716
      // 143: lload 5
      // 145: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: ifeq 230
      // 14e: aload 25
      // 150: checkcast com/zelix/to
      // 153: astore 26
      // 155: aload 26
      // 157: lload 9
      // 159: bipush 1
      // 15a: anewarray 503
      // 15d: dup_x2
      // 15e: dup_x2
      // 15f: pop
      // 160: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: ldc2_w 197517850110669085
      // 169: lload 5
      // 16b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/be; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: iload 20
      // 172: ifne 1cf
      // 175: aload 3
      // 176: if_acmpne 230
      // 179: goto 187
      // 17c: ldc2_w 2152253272509248716
      // 17f: lload 5
      // 181: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 4
      // 189: aload 2
      // 18a: aload 25
      // 18c: iload 13
      // 18e: i2c
      // 18f: iload 14
      // 191: iload 15
      // 193: bipush 3
      // 194: anewarray 503
      // 197: dup_x1
      // 198: swap
      // 199: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 19c: bipush 2
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a4: bipush 1
      // 1a5: swap
      // 1a6: aastore
      // 1a7: dup_x1
      // 1a8: swap
      // 1a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ac: bipush 0
      // 1ad: swap
      // 1ae: aastore
      // 1af: ldc2_w 1878708756007879932
      // 1b2: lload 5
      // 1b4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: lload 7
      // 1bb: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 1be: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1c1: goto 1cf
      // 1c4: ldc2_w 2152253272509248716
      // 1c7: lload 5
      // 1c9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: checkcast com/zelix/vh
      // 1d2: astore 27
      // 1d4: aload 27
      // 1d6: iload 20
      // 1d8: ifne 1ee
      // 1db: ifnull 230
      // 1de: goto 1ec
      // 1e1: ldc2_w 2152253272509248716
      // 1e4: lload 5
      // 1e6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: aload 27
      // 1ee: lload 11
      // 1f0: bipush 0
      // 1f1: bipush 2
      // 1f2: anewarray 503
      // 1f5: dup_x1
      // 1f6: swap
      // 1f7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fa: bipush 1
      // 1fb: swap
      // 1fc: aastore
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: ldc2_w 2101140051531110533
      // 209: lload 5
      // 20b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: astore 28
      // 212: aload 22
      // 214: aload 25
      // 216: ldc2_w 298783279453304444
      // 219: lload 5
      // 21b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: pop
      // 221: aload 22
      // 223: aload 28
      // 225: ldc2_w 176436033395767770
      // 228: lload 5
      // 22a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: pop
      // 230: iload 20
      // 232: ifeq 0d2
      // 235: iinc 21 1
      // 238: iload 20
      // 23a: lload 5
      // 23c: lconst_0
      // 23d: lcmp
      // 23e: iflt 083
      // 241: ifeq 081
      // 244: lload 5
      // 246: lconst_0
      // 247: lcmp
      // 248: ifle 092
      // 24b: return
   }

   private void W(Object[] param1) {
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
      // 004: checkcast [[Ljava/lang/String;
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast [Ljava/util/HashSet;
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/wp
      // 017: astore 7
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Integer
      // 01f: invokevirtual java/lang/Integer.intValue ()I
      // 022: istore 3
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast [Ljava/lang/String;
      // 029: astore 2
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/lang/Long
      // 030: invokevirtual java/lang/Long.longValue ()J
      // 033: lstore 5
      // 035: pop
      // 036: getstatic com/zelix/se.a J
      // 039: lload 5
      // 03b: lxor
      // 03c: lstore 5
      // 03e: lload 5
      // 040: dup2
      // 041: ldc2_w 87931334829841
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 138175247597840
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 120797692793021
      // 052: lxor
      // 053: lstore 13
      // 055: pop2
      // 056: ldc2_w 2394972087013261150
      // 059: lload 5
      // 05b: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: aload 4
      // 062: iload 3
      // 063: aaload
      // 064: ldc2_w 4464050984180941496
      // 067: lload 5
      // 069: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: astore 16
      // 070: istore 15
      // 072: aload 16
      // 074: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 079: ifeq 13f
      // 07c: aload 2
      // 07d: arraylength
      // 07e: anewarray 61
      // 081: astore 17
      // 083: aload 2
      // 084: bipush 0
      // 085: aload 17
      // 087: bipush 0
      // 088: iload 3
      // 089: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 08c: aload 17
      // 08e: iload 3
      // 08f: aload 16
      // 091: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 096: checkcast java/lang/String
      // 099: aastore
      // 09a: iload 3
      // 09b: bipush 1
      // 09c: iadd
      // 09d: iload 15
      // 09f: lload 5
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iflt 0ab
      // 0a6: ifeq 139
      // 0a9: aload 2
      // 0aa: arraylength
      // 0ab: if_icmpge 118
      // 0ae: goto 0bc
      // 0b1: ldc2_w 2466312716980570920
      // 0b4: lload 5
      // 0b6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: aload 8
      // 0bf: aload 4
      // 0c1: aload 7
      // 0c3: iload 3
      // 0c4: bipush 1
      // 0c5: iadd
      // 0c6: aload 17
      // 0c8: lload 11
      // 0ca: bipush 6
      // 0cc: anewarray 503
      // 0cf: dup_x2
      // 0d0: dup_x2
      // 0d1: pop
      // 0d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d5: bipush 5
      // 0d6: swap
      // 0d7: aastore
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: bipush 4
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e2: bipush 3
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 2
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 1
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x1
      // 0f0: swap
      // 0f1: bipush 0
      // 0f2: swap
      // 0f3: aastore
      // 0f4: ldc2_w 2602461150243202090
      // 0f7: lload 5
      // 0f9: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: iload 15
      // 100: lload 5
      // 102: lconst_0
      // 103: lcmp
      // 104: ifle 13c
      // 107: ifne 13a
      // 10a: goto 118
      // 10d: ldc2_w 2466312716980570920
      // 110: lload 5
      // 112: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: aload 8
      // 11a: aload 7
      // 11c: lload 13
      // 11e: invokevirtual com/zelix/wp.C (J)I
      // 121: aload 17
      // 123: aastore
      // 124: aload 7
      // 126: lload 9
      // 128: invokevirtual com/zelix/wp.l (J)I
      // 12b: goto 139
      // 12e: ldc2_w 2466312716980570920
      // 131: lload 5
      // 133: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: pop
      // 13a: iload 15
      // 13c: ifne 072
      // 13f: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      byte var10000 = x44.a<"s">(-5159407686823619725L, var2);
      int var7 = 0;
      byte var6 = var10000;

      while (true) {
         while (var7 < x44.a<"o">(this, -6405233099109241224L, var2).length || var2 < 0L) {
            label53:
            while (true) {
               HashSet var8 = x44.a<"o">(this, -6405233099109241224L, var2)[var7];
               Iterator var9 = x44.a<"k">(var8, -6356820414171113341L, var2);

               while (var9.hasNext()) {
                  sr var10 = (sr)var9.next();
                  boolean var12 = x44.a<"k">(var10, new Object[]{var4}, -5079521866238669176L, var2);
                  if (var6 != 0) {
                     continue label53;
                  }

                  try {
                     if (var2 < 0L) {
                        continue label53;
                     }

                     if (var6 != 0) {
                        return var12;
                     }

                     if (var12) {
                        return (boolean)1;
                     }
                  } catch (gj var11) {
                     throw x44.a<"s">(var11, -5187744977420005101L, var2);
                  }

                  if (var6 != 0) {
                     break;
                  }
               }

               var7++;
               if (var2 > 0L && var6 != 0 && var2 >= 0L) {
                  break;
               }
            }

            return false;
         }

         return false;
      }
   }

   void c(Object[] var1) {
      int var4 = (Integer)var1[0];
      HashSet var5 = (HashSet)var1[1];
      long var2 = (Long)var1[2];
      var2 = a ^ var2;
      x44.a<"k">(this, -7973597481879939012L, var2)[var4] = var5;
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 130324678659123L;
      return x44.a<"l">(this, -6922273448611948917L, var1).hashCode() ^ x44.a<"l">(this, -9007903415962288711L, var1).hashCode();
   }

   HashSet f(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return x44.a<"o">(this, -3031960941562061688L, var2)[var4];
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/se.a J
      // 03: ldc2_w 1008853607670
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -6110951887006517933
      // 0b: lload 2
      // 0c: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/se
      // 17: iload 4
      // 19: ifeq a2
      // 1c: ifeq a1
      // 1f: goto 2c
      // 22: ldc2_w -6325528228513955547
      // 25: lload 2
      // 26: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/se
      // 30: astore 5
      // 32: aload 0
      // 33: ldc2_w -5248291619715875250
      // 36: lload 2
      // 37: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: aload 5
      // 3e: ldc2_w -5248291619715875250
      // 41: lload 2
      // 42: invokedynamic i (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 4a: iload 4
      // 4c: ifeq 86
      // 4f: ifeq 9f
      // 52: goto 5f
      // 55: ldc2_w -6325528228513955547
      // 58: lload 2
      // 59: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: ldc2_w -6181179507391916676
      // 63: lload 2
      // 64: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: aload 5
      // 6b: ldc2_w -6181179507391916676
      // 6e: lload 2
      // 6f: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 79: goto 86
      // 7c: ldc2_w -6325528228513955547
      // 7f: lload 2
      // 80: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: iload 4
      // 88: ifeq 9c
      // 8b: ifeq 9f
      // 8e: goto 9b
      // 91: ldc2_w -6325528228513955547
      // 94: lload 2
      // 95: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: bipush 1
      // 9c: goto a0
      // 9f: bipush 0
      // a0: ireturn
      // a1: bipush 0
      // a2: ireturn
   }

   public se(int var1, long var2) {
      var2 = a ^ var2;
      super();
      x44.a<"t">(this, var1, -5289377563538004753L, var2);
      x44.a<"t">(this, new HashSet[var1], -6255477779660808108L, var2);
      x44.a<"t">(this, new ArrayList(), -5466719642684748954L, var2);
   }

   public se(int var1, long var2, List var4) {
      var2 = a ^ var2;
      super();
      x44.a<"r">(this, var1, 8761284317824068577L, var2);
      x44.a<"r">(this, new HashSet[var1], 7367355253123460954L, var2);
      x44.a<"r">(this, var4, 8875541504506971240L, var2);
   }

   public String y(Object[] param1) {
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
      // 00e: ldc2_w 135986204036823
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: bipush 0
      // 016: istore 7
      // 018: new java/lang/StringBuilder
      // 01b: dup
      // 01c: invokespecial java/lang/StringBuilder.<init> ()V
      // 01f: astore 8
      // 021: ldc2_w 7684832326811287987
      // 024: lload 2
      // 025: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: aload 0
      // 02b: ldc2_w 8492682980344937656
      // 02e: lload 2
      // 02f: invokedynamic o (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: astore 9
      // 036: istore 6
      // 038: aload 9
      // 03a: arraylength
      // 03b: istore 10
      // 03d: bipush 0
      // 03e: istore 11
      // 040: iload 11
      // 042: iload 10
      // 044: if_icmpge 1ac
      // 047: aload 9
      // 049: iload 11
      // 04b: aaload
      // 04c: astore 12
      // 04e: new java/util/TreeSet
      // 051: dup
      // 052: invokespecial java/util/TreeSet.<init> ()V
      // 055: astore 13
      // 057: aload 12
      // 059: ldc2_w 8433009822895622723
      // 05c: lload 2
      // 05d: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: astore 14
      // 064: aload 14
      // 066: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06b: ifeq 0d4
      // 06e: aload 14
      // 070: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 075: checkcast com/zelix/sr
      // 078: astore 15
      // 07a: aload 15
      // 07c: lload 4
      // 07e: bipush 1
      // 07f: anewarray 503
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 0
      // 089: swap
      // 08a: aastore
      // 08b: ldc2_w 7496853008326835176
      // 08e: lload 2
      // 08f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: astore 16
      // 096: aload 13
      // 098: iload 6
      // 09a: ifne 0dc
      // 09d: aload 16
      // 09f: iload 6
      // 0a1: ifne 0c3
      // 0a4: goto 0b1
      // 0a7: ldc2_w 7692558486116467667
      // 0aa: lload 2
      // 0ab: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: ifnull 0c6
      // 0b4: goto 0c1
      // 0b7: ldc2_w 7692558486116467667
      // 0ba: lload 2
      // 0bb: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: aload 16
      // 0c3: goto 0c9
      // 0c6: getstatic com/zelix/se.c Ljava/lang/String;
      // 0c9: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0ce: pop
      // 0cf: iload 6
      // 0d1: ifeq 064
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 040
      // 0da: aload 13
      // 0dc: invokeinterface java/util/Set.size ()I 1
      // 0e1: istore 14
      // 0e3: bipush 0
      // 0e4: istore 15
      // 0e6: aload 13
      // 0e8: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0ed: astore 16
      // 0ef: aload 16
      // 0f1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f6: ifeq 16c
      // 0f9: aload 16
      // 0fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 100: checkcast java/lang/String
      // 103: astore 17
      // 105: lload 2
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 118
      // 10b: aload 8
      // 10d: aload 17
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: iload 6
      // 114: ifne 166
      // 117: pop
      // 118: iload 15
      // 11a: iinc 15 1
      // 11d: iload 14
      // 11f: lload 2
      // 120: lconst_0
      // 121: lcmp
      // 122: iflt 181
      // 125: iload 6
      // 127: ifne 181
      // 12a: goto 137
      // 12d: ldc2_w 7692558486116467667
      // 130: lload 2
      // 131: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: if_icmpge 167
      // 13a: goto 147
      // 13d: ldc2_w 7692558486116467667
      // 140: lload 2
      // 141: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: aload 8
      // 149: sipush 26417
      // 14c: ldc2_w 3042906990461218882
      // 14f: lload 2
      // 150: lxor
      // 151: invokedynamic o (IJ)I bsm=com/zelix/se.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 159: goto 166
      // 15c: ldc2_w 7692558486116467667
      // 15f: lload 2
      // 160: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: athrow
      // 166: pop
      // 167: iload 6
      // 169: ifeq 0ef
      // 16c: iload 7
      // 16e: iinc 7 1
      // 171: lload 2
      // 172: lconst_0
      // 173: lcmp
      // 174: iflt 1a9
      // 177: aload 0
      // 178: ldc2_w 7670858421937485827
      // 17b: lload 2
      // 17c: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: if_icmpge 1a4
      // 184: aload 8
      // 186: sipush 27174
      // 189: ldc2_w 6076677136987684180
      // 18c: lload 2
      // 18d: lxor
      // 18e: invokedynamic o (IJ)I bsm=com/zelix/se.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 196: pop
      // 197: goto 1a4
      // 19a: ldc2_w 7692558486116467667
      // 19d: lload 2
      // 19e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: iinc 11 1
      // 1a7: iload 6
      // 1a9: ifeq 040
      // 1ac: aload 8
      // 1ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b1: areturn
   }

   public String[][] B(Object[] param1) {
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
      // 00c: getstatic com/zelix/se.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 37320816051415
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 78628135687543
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 129253402804913
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 91152819505827
      // 02c: lxor
      // 02d: lstore 10
      // 02f: dup2
      // 030: ldc2_w 31879302694285
      // 033: lxor
      // 034: lstore 12
      // 036: pop2
      // 037: ldc2_w -2117344617937273601
      // 03a: lload 2
      // 03b: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: istore 14
      // 042: aload 0
      // 043: ldc2_w -106268352563464222
      // 046: lload 2
      // 047: invokedynamic m (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: arraylength
      // 04d: iload 14
      // 04f: ifeq 074
      // 052: ifne 073
      // 055: goto 062
      // 058: ldc2_w -2190136469715023735
      // 05b: lload 2
      // 05c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: bipush 0
      // 063: bipush 0
      // 064: multianewarray 156 2
      // 068: areturn
      // 069: ldc2_w -2190136469715023735
      // 06c: lload 2
      // 06d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: bipush 1
      // 074: istore 15
      // 076: aload 0
      // 077: ldc2_w -106268352563464222
      // 07a: lload 2
      // 07b: invokedynamic m (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: arraylength
      // 081: anewarray 396
      // 084: astore 16
      // 086: bipush 0
      // 087: istore 17
      // 089: iload 17
      // 08b: aload 0
      // 08c: ldc2_w -106268352563464222
      // 08f: lload 2
      // 090: invokedynamic m (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: arraylength
      // 096: if_icmpge 1ce
      // 099: aload 0
      // 09a: ldc2_w -106268352563464222
      // 09d: lload 2
      // 09e: invokedynamic m (Ljava/lang/Object;JJ)[Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: iload 17
      // 0a5: aaload
      // 0a6: astore 18
      // 0a8: aload 18
      // 0aa: ldc2_w -2181453414325900773
      // 0ad: lload 2
      // 0ae: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: istore 19
      // 0b5: iload 19
      // 0b7: iload 14
      // 0b9: lload 2
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: iflt 1d3
      // 0bf: ifeq 1d0
      // 0c2: iload 14
      // 0c4: ifeq 109
      // 0c7: goto 0d4
      // 0ca: ldc2_w -2190136469715023735
      // 0cd: lload 2
      // 0ce: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: ifle 104
      // 0da: ifne 0f9
      // 0dd: goto 0ea
      // 0e0: ldc2_w -2190136469715023735
      // 0e3: lload 2
      // 0e4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: aconst_null
      // 0eb: checkcast [[Ljava/lang/String;
      // 0ee: areturn
      // 0ef: ldc2_w -2190136469715023735
      // 0f2: lload 2
      // 0f3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 18
      // 0fb: ldc2_w -2181453414325900773
      // 0fe: lload 2
      // 0ff: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: lload 6
      // 106: invokestatic com/zelix/sh.Q (IJ)I
      // 109: lload 10
      // 10b: dup2_x1
      // 10c: pop2
      // 10d: bipush 2
      // 10e: anewarray 503
      // 111: dup_x1
      // 112: swap
      // 113: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 116: bipush 1
      // 117: swap
      // 118: aastore
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 0
      // 120: swap
      // 121: aastore
      // 122: ldc2_w -554487696430827174
      // 125: lload 2
      // 126: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: astore 20
      // 12d: aload 18
      // 12f: ldc2_w -120903867411775207
      // 132: lload 2
      // 133: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: astore 21
      // 13a: aload 21
      // 13c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 141: ifeq 1af
      // 144: aload 21
      // 146: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 14b: checkcast com/zelix/sr
      // 14e: astore 22
      // 150: aload 22
      // 152: lload 4
      // 154: bipush 1
      // 155: anewarray 503
      // 158: dup_x2
      // 159: dup_x2
      // 15a: pop
      // 15b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15e: bipush 0
      // 15f: swap
      // 160: aastore
      // 161: ldc2_w -2176956838586345703
      // 164: lload 2
      // 165: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: astore 23
      // 16c: aload 20
      // 16e: aload 22
      // 170: lload 12
      // 172: bipush 1
      // 173: anewarray 503
      // 176: dup_x2
      // 177: dup_x2
      // 178: pop
      // 179: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17c: bipush 0
      // 17d: swap
      // 17e: aastore
      // 17f: ldc2_w -2067069469418442574
      // 182: lload 2
      // 183: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 18b: pop
      // 18c: iload 14
      // 18e: lload 2
      // 18f: lconst_0
      // 190: lcmp
      // 191: ifle 1cb
      // 194: ifeq 1c9
      // 197: iload 14
      // 199: ifne 13a
      // 19c: lload 2
      // 19d: lconst_0
      // 19e: lcmp
      // 19f: iflt 18c
      // 1a2: goto 1af
      // 1a5: ldc2_w -2190136469715023735
      // 1a8: lload 2
      // 1a9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: iload 15
      // 1b1: aload 20
      // 1b3: ldc2_w -2181453414325900773
      // 1b6: lload 2
      // 1b7: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: imul
      // 1bd: istore 15
      // 1bf: aload 16
      // 1c1: iload 17
      // 1c3: aload 20
      // 1c5: aastore
      // 1c6: iinc 17 1
      // 1c9: iload 14
      // 1cb: ifne 089
      // 1ce: iload 15
      // 1d0: aload 16
      // 1d2: arraylength
      // 1d3: multianewarray 156 2
      // 1d7: astore 17
      // 1d9: new com/zelix/wp
      // 1dc: dup
      // 1dd: bipush 0
      // 1de: invokespecial com/zelix/wp.<init> (I)V
      // 1e1: astore 18
      // 1e3: aload 0
      // 1e4: aload 17
      // 1e6: aload 16
      // 1e8: aload 18
      // 1ea: bipush 0
      // 1eb: aload 16
      // 1ed: arraylength
      // 1ee: anewarray 61
      // 1f1: lload 8
      // 1f3: bipush 6
      // 1f5: anewarray 503
      // 1f8: dup_x2
      // 1f9: dup_x2
      // 1fa: pop
      // 1fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1fe: bipush 5
      // 1ff: swap
      // 200: aastore
      // 201: dup_x1
      // 202: swap
      // 203: bipush 4
      // 204: swap
      // 205: aastore
      // 206: dup_x1
      // 207: swap
      // 208: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 20b: bipush 3
      // 20c: swap
      // 20d: aastore
      // 20e: dup_x1
      // 20f: swap
      // 210: bipush 2
      // 211: swap
      // 212: aastore
      // 213: dup_x1
      // 214: swap
      // 215: bipush 1
      // 216: swap
      // 217: aastore
      // 218: dup_x1
      // 219: swap
      // 21a: bipush 0
      // 21b: swap
      // 21c: aastore
      // 21d: ldc2_w -1748306475594946677
      // 220: lload 2
      // 221: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: aload 17
      // 228: areturn
   }

   static {
      long var11 = a ^ 82077227846401L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("¹¡!M\u001cîL+".getBytes("ISO-8859-1"));
      String var19 = a(var15).intern();
      int var10001 = -1;
      c = var19;
      f = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "J|\u000e&å;Ä\u0007%E\u0016ì\u0014;ë\u0006";
      int var5 = "J|\u000e&å;Ä\u0007%E\u0016ì\u0014;ë\u0006".length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
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
         long var10004 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         byte var22 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      d = var6;
      e = new Integer[2];
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28771;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/se", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/se" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
