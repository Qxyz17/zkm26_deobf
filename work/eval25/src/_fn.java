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

public class _fn extends Error {
   int B;
   private static final long a = ess.a(-8548330115395364098L, 3077367771880655011L, MethodHandles.lookup().lookupClass()).a(56109587364398L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   protected static String w(Object[] param0) {
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
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 2
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 1
      // 020: dup
      // 021: bipush 3
      // 022: aaload
      // 023: checkcast java/lang/Integer
      // 026: invokevirtual java/lang/Integer.intValue ()I
      // 029: istore 3
      // 02a: dup
      // 02b: bipush 4
      // 02c: aaload
      // 02d: checkcast java/lang/Long
      // 030: invokevirtual java/lang/Long.longValue ()J
      // 033: lstore 6
      // 035: dup
      // 036: bipush 5
      // 037: aaload
      // 038: checkcast java/lang/String
      // 03b: astore 5
      // 03d: dup
      // 03e: bipush 6
      // 040: aaload
      // 041: checkcast java/lang/Integer
      // 044: invokevirtual java/lang/Integer.intValue ()I
      // 047: istore 8
      // 049: pop
      // 04a: getstatic com/zelix/_fn.a J
      // 04d: lload 6
      // 04f: lxor
      // 050: lstore 6
      // 052: lload 6
      // 054: dup2
      // 055: ldc2_w 135932785054611
      // 058: lxor
      // 059: lstore 9
      // 05b: pop2
      // 05c: ldc2_w 2804665433607138963
      // 05f: lload 6
      // 061: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: istore 11
      // 068: new java/lang/StringBuilder
      // 06b: dup
      // 06c: invokespecial java/lang/StringBuilder.<init> ()V
      // 06f: sipush 28715
      // 072: ldc2_w 4561200345341345660
      // 075: lload 6
      // 077: lxor
      // 078: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 080: iload 1
      // 081: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 084: sipush 12807
      // 087: ldc2_w 3133544895467650391
      // 08a: lload 6
      // 08c: lxor
      // 08d: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 095: iload 3
      // 096: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 099: sipush 26218
      // 09c: ldc2_w 257754507334461752
      // 09f: lload 6
      // 0a1: lxor
      // 0a2: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: iload 11
      // 0a9: ifeq 0de
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: iload 4
      // 0b1: ifeq 0e1
      // 0b4: goto 0c2
      // 0b7: ldc2_w 4524530469497201835
      // 0ba: lload 6
      // 0bc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: sipush 24522
      // 0c5: ldc2_w 7123507711073194112
      // 0c8: lload 6
      // 0ca: lxor
      // 0cb: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: goto 0de
      // 0d3: ldc2_w 4524530469497201835
      // 0d6: lload 6
      // 0d8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: goto 144
      // 0e1: new java/lang/StringBuilder
      // 0e4: dup
      // 0e5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0e8: ldc "\""
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: iload 8
      // 0ef: invokestatic java/lang/String.valueOf (C)Ljava/lang/String;
      // 0f2: lload 9
      // 0f4: dup2_x1
      // 0f5: pop2
      // 0f6: bipush 2
      // 0f7: anewarray 86
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 1
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x2
      // 100: dup_x2
      // 101: pop
      // 102: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 105: bipush 0
      // 106: swap
      // 107: aastore
      // 108: ldc2_w 2842617852466267266
      // 10b: lload 6
      // 10d: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: ldc "\""
      // 117: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11a: sipush 999
      // 11d: ldc2_w 504572571486932147
      // 120: lload 6
      // 122: lxor
      // 123: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: iload 8
      // 12d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 130: sipush 18164
      // 133: ldc2_w 1551481284720691627
      // 136: lload 6
      // 138: lxor
      // 139: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: sipush 24732
      // 14a: ldc2_w 3528032303394664394
      // 14d: lload 6
      // 14f: lxor
      // 150: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 158: lload 9
      // 15a: aload 5
      // 15c: bipush 2
      // 15d: anewarray 86
      // 160: dup_x1
      // 161: swap
      // 162: bipush 1
      // 163: swap
      // 164: aastore
      // 165: dup_x2
      // 166: dup_x2
      // 167: pop
      // 168: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16b: bipush 0
      // 16c: swap
      // 16d: aastore
      // 16e: ldc2_w 2842617852466267266
      // 171: lload 6
      // 173: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17b: ldc "\""
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 180: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 183: areturn
   }

   public _fn(String var1, long var2, int var4) {
      var2 = a ^ var2;
      super(var1);
      x44.a<"v">(this, var4, 149272992310638264L, var2);
   }

   protected static final String v(Object[] param0) {
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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 1
      // 012: pop
      // 013: getstatic com/zelix/_fn.a J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w 7044307280248555055
      // 01c: lload 2
      // 01d: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: new java/lang/StringBuffer
      // 025: dup
      // 026: invokespecial java/lang/StringBuffer.<init> ()V
      // 029: astore 5
      // 02b: bipush 0
      // 02c: istore 7
      // 02e: istore 4
      // 030: iload 7
      // 032: aload 1
      // 033: invokevirtual java/lang/String.length ()I
      // 036: if_icmpge 326
      // 039: aload 1
      // 03a: iload 4
      // 03c: lload 2
      // 03d: lconst_0
      // 03e: lcmp
      // 03f: iflt 047
      // 042: ifne 331
      // 045: iload 7
      // 047: invokevirtual java/lang/String.charAt (I)C
      // 04a: iload 4
      // 04c: lload 2
      // 04d: lconst_0
      // 04e: lcmp
      // 04f: ifle 24a
      // 052: ifne 249
      // 055: goto 062
      // 058: ldc2_w 8668593478156526124
      // 05b: lload 2
      // 05c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: athrow
      // 062: lload 2
      // 063: lconst_0
      // 064: lcmp
      // 065: iflt 23c
      // 068: lookupswitch 462 9 0 94 8 118 9 161 10 204 12 247 13 290 34 333 39 376 92 419
      // 0bc: ldc2_w 8668593478156526124
      // 0bf: lload 2
      // 0c0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: iload 4
      // 0c8: lload 2
      // 0c9: lconst_0
      // 0ca: lcmp
      // 0cb: ifle 323
      // 0ce: ifeq 31e
      // 0d1: goto 0de
      // 0d4: ldc2_w 8668593478156526124
      // 0d7: lload 2
      // 0d8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 5
      // 0e0: sipush 8699
      // 0e3: ldc2_w 867219245076359215
      // 0e6: lload 2
      // 0e7: lxor
      // 0e8: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0f0: pop
      // 0f1: iload 4
      // 0f3: lload 2
      // 0f4: lconst_0
      // 0f5: lcmp
      // 0f6: iflt 323
      // 0f9: ifeq 31e
      // 0fc: goto 109
      // 0ff: ldc2_w 8668593478156526124
      // 102: lload 2
      // 103: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 5
      // 10b: sipush 20923
      // 10e: ldc2_w 8260279542501464165
      // 111: lload 2
      // 112: lxor
      // 113: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 11b: pop
      // 11c: iload 4
      // 11e: lload 2
      // 11f: lconst_0
      // 120: lcmp
      // 121: iflt 323
      // 124: ifeq 31e
      // 127: goto 134
      // 12a: ldc2_w 8668593478156526124
      // 12d: lload 2
      // 12e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 5
      // 136: sipush 9351
      // 139: ldc2_w 5926346802690927962
      // 13c: lload 2
      // 13d: lxor
      // 13e: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 146: pop
      // 147: iload 4
      // 149: lload 2
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: ifle 323
      // 14f: ifeq 31e
      // 152: goto 15f
      // 155: ldc2_w 8668593478156526124
      // 158: lload 2
      // 159: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 5
      // 161: sipush 18094
      // 164: ldc2_w 1488798630973296498
      // 167: lload 2
      // 168: lxor
      // 169: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 171: pop
      // 172: iload 4
      // 174: lload 2
      // 175: lconst_0
      // 176: lcmp
      // 177: iflt 323
      // 17a: ifeq 31e
      // 17d: goto 18a
      // 180: ldc2_w 8668593478156526124
      // 183: lload 2
      // 184: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 5
      // 18c: sipush 27766
      // 18f: ldc2_w 368265800439457197
      // 192: lload 2
      // 193: lxor
      // 194: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 19c: pop
      // 19d: iload 4
      // 19f: lload 2
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: iflt 323
      // 1a5: ifeq 31e
      // 1a8: goto 1b5
      // 1ab: ldc2_w 8668593478156526124
      // 1ae: lload 2
      // 1af: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: aload 5
      // 1b7: sipush 30841
      // 1ba: ldc2_w 2358712136992879011
      // 1bd: lload 2
      // 1be: lxor
      // 1bf: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c7: pop
      // 1c8: iload 4
      // 1ca: lload 2
      // 1cb: lconst_0
      // 1cc: lcmp
      // 1cd: iflt 323
      // 1d0: ifeq 31e
      // 1d3: goto 1e0
      // 1d6: ldc2_w 8668593478156526124
      // 1d9: lload 2
      // 1da: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: aload 5
      // 1e2: sipush 31646
      // 1e5: ldc2_w 1767954382493315655
      // 1e8: lload 2
      // 1e9: lxor
      // 1ea: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1f2: pop
      // 1f3: iload 4
      // 1f5: lload 2
      // 1f6: lconst_0
      // 1f7: lcmp
      // 1f8: ifle 323
      // 1fb: ifeq 31e
      // 1fe: goto 20b
      // 201: ldc2_w 8668593478156526124
      // 204: lload 2
      // 205: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: athrow
      // 20b: aload 5
      // 20d: sipush 11354
      // 210: ldc2_w 1183985625654633864
      // 213: lload 2
      // 214: lxor
      // 215: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 21d: pop
      // 21e: iload 4
      // 220: lload 2
      // 221: lconst_0
      // 222: lcmp
      // 223: iflt 323
      // 226: ifeq 31e
      // 229: goto 236
      // 22c: ldc2_w 8668593478156526124
      // 22f: lload 2
      // 230: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 235: athrow
      // 236: aload 1
      // 237: iload 7
      // 239: invokevirtual java/lang/String.charAt (I)C
      // 23c: goto 249
      // 23f: ldc2_w 8668593478156526124
      // 242: lload 2
      // 243: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: athrow
      // 249: dup
      // 24a: istore 6
      // 24c: sipush 22394
      // 24f: ldc2_w 5805928388936475580
      // 252: lload 2
      // 253: lxor
      // 254: invokedynamic f (IJ)I bsm=com/zelix/_fn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: iload 4
      // 25b: ifne 28a
      // 25e: if_icmplt 28d
      // 261: goto 26e
      // 264: ldc2_w 8668593478156526124
      // 267: lload 2
      // 268: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: athrow
      // 26e: iload 6
      // 270: sipush 11463
      // 273: ldc2_w 3033347386663098368
      // 276: lload 2
      // 277: lxor
      // 278: invokedynamic f (IJ)I bsm=com/zelix/_fn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: goto 28a
      // 280: ldc2_w 8668593478156526124
      // 283: lload 2
      // 284: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 289: athrow
      // 28a: if_icmple 303
      // 28d: new java/lang/StringBuilder
      // 290: dup
      // 291: invokespecial java/lang/StringBuilder.<init> ()V
      // 294: sipush 12302
      // 297: ldc2_w 7259890405240748504
      // 29a: lload 2
      // 29b: lxor
      // 29c: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a4: iload 6
      // 2a6: sipush 27033
      // 2a9: ldc2_w 334543421609483612
      // 2ac: lload 2
      // 2ad: lxor
      // 2ae: invokedynamic f (IJ)I bsm=com/zelix/_fn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b3: ldc2_w 6920675428792739683
      // 2b6: lload 2
      // 2b7: invokedynamic w (IIJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c2: astore 8
      // 2c4: aload 5
      // 2c6: new java/lang/StringBuilder
      // 2c9: dup
      // 2ca: invokespecial java/lang/StringBuilder.<init> ()V
      // 2cd: sipush 16921
      // 2d0: ldc2_w 7221009817727716294
      // 2d3: lload 2
      // 2d4: lxor
      // 2d5: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_fn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dd: aload 8
      // 2df: aload 8
      // 2e1: invokevirtual java/lang/String.length ()I
      // 2e4: bipush 4
      // 2e5: isub
      // 2e6: aload 8
      // 2e8: invokevirtual java/lang/String.length ()I
      // 2eb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f4: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 2f7: pop
      // 2f8: iload 4
      // 2fa: lload 2
      // 2fb: lconst_0
      // 2fc: lcmp
      // 2fd: ifle 323
      // 300: ifeq 31e
      // 303: aload 5
      // 305: iload 6
      // 307: ldc2_w 7469452534280916008
      // 30a: lload 2
      // 30b: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: pop
      // 311: goto 31e
      // 314: ldc2_w 8668593478156526124
      // 317: lload 2
      // 318: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31d: athrow
      // 31e: iinc 7 1
      // 321: iload 4
      // 323: ifeq 030
      // 326: aload 5
      // 328: lload 2
      // 329: lconst_0
      // 32a: lcmp
      // 32b: ifle 0f0
      // 32e: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 331: areturn
   }

   @Override
   public String getMessage() {
      return super.getMessage();
   }

   public _fn(boolean var1, int var2, int var3, int var4, long var5, String var7, char var8, int var9) {
      var5 = a ^ var5;
      long var10 = var5 ^ 40215814386773L;
      long var12 = var5 ^ 122489387715552L;
      Object[] var10009 = new Object[]{null, null, null, null, null, var7, Integer.valueOf(var8)};
      var10009[4] = var12;
      var10009[3] = var4;
      var10009[2] = var3;
      var10009[1] = var2;
      var10009[0] = var1;
      this(w(var10009), var10, var9);
   }

   static {
      long var11 = a ^ 41884283178320L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[17];
      int var18 = 0;
      String var17 = "£ið¡N?Þ \u0084G\\ïÿØ\"\u0005\u0010±ì\u009f\u0012 ê³ë¹'¶þ\u0015P¥\u0003\u0010v\u0089V\u0010\u0014þÒÏlF\u0088{n\u00923¢\u0010ñGíjªà\u0015ü¢ð\u0007ù->\u001f²\u0010P8Î\u008ePO\u001f\u00854\u0092Qqö\u0083Ô\u00ad\u0010Ï\u00adåp\u0001 9ÿ\"6â\u0014 \u0095\u009f²\u0010Sþm\u009d\u000b Ü\"ËÕÅ\u0098z!1ô\u0010Â\u0099\u001fº\\/¦?\u000b\u0000ùº \u0089\u008c¥(Ðc\u0085|ð²ä\r\u0099Äß\u000eì¸)ýÀ\u0000Cb7=äbF/¤\u0084¬\u00868ðíj?Ù\u008fðS\u0090\u0010Ù=ò\u0084Z`y`#¿÷ñ¢ \\  ÿ\nQà«\u0094Â\u0019\u008eÜEzÕ qº\u0016È\u0092l\u0085ï2\t\u0090V\u0080M\u008eXcw\u0010j\u001f§\u0016üÌÑ]QÕôÊ\u0080 w\u009f \u00ad\u009e\u0088\u001aiÚn*~Á\u008bq³\u0011UÌ¿\u008c\u0099½æ\u001a¬²gáÄnèr\u000f\u0011(ü4:B\u0014ØÏ.ÿ´s,·é\u0018¥\n\u001b×l@\u0097u¶î¸²ÕÌÑ³6Y`\u00ad|\u0087«C0\u0010\u0011\u0093È\u0096h\u008dx²?8ÎkP\u0012ñÒ";
      int var19 = "£ið¡N?Þ \u0084G\\ïÿØ\"\u0005\u0010±ì\u009f\u0012 ê³ë¹'¶þ\u0015P¥\u0003\u0010v\u0089V\u0010\u0014þÒÏlF\u0088{n\u00923¢\u0010ñGíjªà\u0015ü¢ð\u0007ù->\u001f²\u0010P8Î\u008ePO\u001f\u00854\u0092Qqö\u0083Ô\u00ad\u0010Ï\u00adåp\u0001 9ÿ\"6â\u0014 \u0095\u009f²\u0010Sþm\u009d\u000b Ü\"ËÕÅ\u0098z!1ô\u0010Â\u0099\u001fº\\/¦?\u000b\u0000ùº \u0089\u008c¥(Ðc\u0085|ð²ä\r\u0099Äß\u000eì¸)ýÀ\u0000Cb7=äbF/¤\u0084¬\u00868ðíj?Ù\u008fðS\u0090\u0010Ù=ò\u0084Z`y`#¿÷ñ¢ \\  ÿ\nQà«\u0094Â\u0019\u008eÜEzÕ qº\u0016È\u0092l\u0085ï2\t\u0090V\u0080M\u008eXcw\u0010j\u001f§\u0016üÌÑ]QÕôÊ\u0080 w\u009f \u00ad\u009e\u0088\u001aiÚn*~Á\u008bq³\u0011UÌ¿\u008c\u0099½æ\u001a¬²gáÄnèr\u000f\u0011(ü4:B\u0014ØÏ.ÿ´s,·é\u0018¥\n\u001b×l@\u0097u¶î¸²ÕÌÑ³6Y`\u00ad|\u0087«C0\u0010\u0011\u0093È\u0096h\u008dx²?8ÎkP\u0012ñÒ"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[17];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "µ[\u0097+B\u008b\u001aù\u0000¡8èþ¥\u008a\u0007l¹\u008cv½\u0019\u0080Ú";
                     int var5 = "µ[\u0097+B\u008b\u001aù\u0000¡8èþ¥\u008a\u0007l¹\u008cv½\u0019\u0080Ú".length();
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
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[3];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "pá¶ûÞÚ´ÓÄµ?1²>nÇ\u0010×á\u008a¨Õ\u000e}z\u0016§\u000eSí&Ú\u001b";
                  var19 = "pá¶ûÞÚ´ÓÄµ?1²>nÇ\u0010×á\u008a¨Õ\u000e}z\u0016§\u000eSí&Ú\u001b".length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25105;
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
            throw new RuntimeException("com/zelix/_fn", var10);
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
         throw new RuntimeException("com/zelix/_fn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7947;
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
            throw new RuntimeException("com/zelix/_fn", var14);
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
         throw new RuntimeException("com/zelix/_fn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
