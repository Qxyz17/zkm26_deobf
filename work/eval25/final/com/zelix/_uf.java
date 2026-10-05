package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _uf {
   static final String T = String.valueOf('\u0001');
   static final String v = String.valueOf('\u0002');
   private final hy O;
   private final bq w;
   private Map P;
   private static final long a = ess.a(-5916800215497203181L, -1062199883952838102L, MethodHandles.lookup().lookupClass()).a(266297616298557L);

   public static List h(Object[] param0) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/wp
      // 00f: astore 1
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 2
      // 01a: pop
      // 01b: getstatic com/zelix/_uf.a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: new java/util/ArrayList
      // 024: dup
      // 025: invokespecial java/util/ArrayList.<init> ()V
      // 028: astore 6
      // 02a: ldc2_w 4099291062035548297
      // 02d: lload 2
      // 02e: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: bipush 0
      // 034: istore 7
      // 036: istore 5
      // 038: bipush 0
      // 039: istore 8
      // 03b: bipush 0
      // 03c: istore 9
      // 03e: bipush 0
      // 03f: istore 11
      // 041: aload 4
      // 043: bipush 1
      // 044: iload 9
      // 046: invokevirtual java/lang/String.indexOf (II)I
      // 049: istore 12
      // 04b: aload 4
      // 04d: bipush 2
      // 04e: iload 9
      // 050: invokevirtual java/lang/String.indexOf (II)I
      // 053: istore 13
      // 055: iload 12
      // 057: bipush -1
      // 058: if_icmple 078
      // 05b: iload 13
      // 05d: bipush -1
      // 05e: iload 5
      // 060: ifeq 088
      // 063: if_icmpne 078
      // 066: iload 12
      // 068: istore 10
      // 06a: bipush 1
      // 06b: istore 11
      // 06d: iload 5
      // 06f: lload 2
      // 070: lconst_0
      // 071: lcmp
      // 072: iflt 199
      // 075: ifne 197
      // 078: iload 12
      // 07a: bipush -1
      // 07b: goto 088
      // 07e: ldc2_w 2351032674429485319
      // 081: lload 2
      // 082: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: iload 5
      // 08a: ifeq 0fc
      // 08d: if_icmpne 0da
      // 090: goto 09d
      // 093: ldc2_w 2351032674429485319
      // 096: lload 2
      // 097: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: iload 13
      // 09f: bipush -1
      // 0a0: lload 2
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iflt 0fc
      // 0a6: iload 5
      // 0a8: ifeq 0fc
      // 0ab: goto 0b8
      // 0ae: ldc2_w 2351032674429485319
      // 0b1: lload 2
      // 0b2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: if_icmple 0da
      // 0bb: goto 0c8
      // 0be: ldc2_w 2351032674429485319
      // 0c1: lload 2
      // 0c2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: iload 13
      // 0ca: istore 10
      // 0cc: iinc 8 1
      // 0cf: iload 5
      // 0d1: lload 2
      // 0d2: lconst_0
      // 0d3: lcmp
      // 0d4: iflt 199
      // 0d7: ifne 197
      // 0da: iload 12
      // 0dc: iload 5
      // 0de: ifeq 195
      // 0e1: goto 0ee
      // 0e4: ldc2_w 2351032674429485319
      // 0e7: lload 2
      // 0e8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: bipush -1
      // 0ef: goto 0fc
      // 0f2: ldc2_w 2351032674429485319
      // 0f5: lload 2
      // 0f6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: lload 2
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: ifle 109
      // 102: if_icmple 187
      // 105: iload 12
      // 107: iload 5
      // 109: ifeq 195
      // 10c: goto 119
      // 10f: ldc2_w 2351032674429485319
      // 112: lload 2
      // 113: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: lload 2
      // 11a: lconst_0
      // 11b: lcmp
      // 11c: ifle 188
      // 11f: bipush -1
      // 120: if_icmple 187
      // 123: goto 130
      // 126: ldc2_w 2351032674429485319
      // 129: lload 2
      // 12a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: iload 12
      // 132: iload 5
      // 134: ifeq 177
      // 137: goto 144
      // 13a: ldc2_w 2351032674429485319
      // 13d: lload 2
      // 13e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: iload 13
      // 146: if_icmpge 168
      // 149: goto 156
      // 14c: ldc2_w 2351032674429485319
      // 14f: lload 2
      // 150: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: bipush 1
      // 157: istore 11
      // 159: iload 12
      // 15b: istore 10
      // 15d: iload 5
      // 15f: lload 2
      // 160: lconst_0
      // 161: lcmp
      // 162: ifle 199
      // 165: ifne 197
      // 168: iload 13
      // 16a: goto 177
      // 16d: ldc2_w 2351032674429485319
      // 170: lload 2
      // 171: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: istore 10
      // 179: iinc 8 1
      // 17c: iload 5
      // 17e: lload 2
      // 17f: lconst_0
      // 180: lcmp
      // 181: iflt 199
      // 184: ifne 197
      // 187: bipush -1
      // 188: goto 195
      // 18b: ldc2_w 2351032674429485319
      // 18e: lload 2
      // 18f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: istore 10
      // 197: iload 10
      // 199: bipush -1
      // 19a: iload 5
      // 19c: ifeq 234
      // 19f: if_icmple 231
      // 1a2: goto 1af
      // 1a5: ldc2_w 2351032674429485319
      // 1a8: lload 2
      // 1a9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: iinc 7 1
      // 1b2: lload 2
      // 1b3: lconst_0
      // 1b4: lcmp
      // 1b5: iflt 1fc
      // 1b8: iload 10
      // 1ba: iload 5
      // 1bc: ifeq 1fb
      // 1bf: goto 1cc
      // 1c2: ldc2_w 2351032674429485319
      // 1c5: lload 2
      // 1c6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: iload 9
      // 1ce: if_icmple 1ff
      // 1d1: goto 1de
      // 1d4: ldc2_w 2351032674429485319
      // 1d7: lload 2
      // 1d8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: athrow
      // 1de: aload 6
      // 1e0: aload 4
      // 1e2: iload 9
      // 1e4: iload 10
      // 1e6: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1e9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ee: goto 1fb
      // 1f1: ldc2_w 2351032674429485319
      // 1f4: lload 2
      // 1f5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: athrow
      // 1fb: pop
      // 1fc: iinc 8 1
      // 1ff: aload 6
      // 201: iload 11
      // 203: ifeq 21c
      // 206: ldc2_w 2679226930578025279
      // 209: lload 2
      // 20a: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: goto 225
      // 212: ldc2_w 2351032674429485319
      // 215: lload 2
      // 216: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: athrow
      // 21c: ldc2_w 2666678325740493916
      // 21f: lload 2
      // 220: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 22a: pop
      // 22b: iload 10
      // 22d: bipush 1
      // 22e: iadd
      // 22f: istore 9
      // 231: iload 10
      // 233: bipush -1
      // 234: if_icmpgt 03e
      // 237: iload 9
      // 239: lload 2
      // 23a: lconst_0
      // 23b: lcmp
      // 23c: ifle 28b
      // 23f: iload 5
      // 241: lload 2
      // 242: lconst_0
      // 243: lcmp
      // 244: iflt 05e
      // 247: ifeq 28b
      // 24a: aload 4
      // 24c: invokevirtual java/lang/String.length ()I
      // 24f: iload 5
      // 251: ifeq 05e
      // 254: lload 2
      // 255: lconst_0
      // 256: lcmp
      // 257: ifle 07b
      // 25a: goto 267
      // 25d: ldc2_w 2351032674429485319
      // 260: lload 2
      // 261: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: athrow
      // 267: if_icmpge 289
      // 26a: aload 6
      // 26c: aload 4
      // 26e: iload 9
      // 270: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 273: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 278: pop
      // 279: iinc 8 1
      // 27c: goto 289
      // 27f: ldc2_w 2351032674429485319
      // 282: lload 2
      // 283: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: athrow
      // 289: iload 8
      // 28b: ifle 2a1
      // 28e: aload 1
      // 28f: iload 7
      // 291: invokevirtual com/zelix/wp.V (I)V
      // 294: aload 6
      // 296: areturn
      // 297: ldc2_w 2351032674429485319
      // 29a: lload 2
      // 29b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: aconst_null
      // 2a2: areturn
   }

   public void N(Object[] var1) {
      bc var2 = (bc)var1[0];
      long var4 = (Long)var1[1];
      List var6 = (List)var1[2];
      int var3 = (Integer)var1[3];
      var4 = a ^ var4;
      long var10001 = var4 ^ 76595288023500L;
      int var7 = (int)((var4 ^ 76595288023500L) >>> 48);
      int var8 = (int)((var4 ^ 76595288023500L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      x44.a<"n">(this, -1486472716083615805L, var4).put(var2, new a((short)var7, var2, var6, (short)var8, var3, var9));
   }

   public void v(Object[] param1) {
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
      // 00c: getstatic com/zelix/_uf.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 125941814599051
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 103348284551666
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 88131639822566
      // 025: lxor
      // 026: dup2
      // 027: bipush 8
      // 029: lushr
      // 02a: lstore 8
      // 02c: dup2
      // 02d: bipush 56
      // 02f: lshl
      // 030: bipush 56
      // 032: lushr
      // 033: l2i
      // 034: istore 10
      // 036: pop2
      // 037: dup2
      // 038: ldc2_w 35652308057820
      // 03b: lxor
      // 03c: lstore 11
      // 03e: dup2
      // 03f: ldc2_w 17049513214828
      // 042: lxor
      // 043: lstore 13
      // 045: dup2
      // 046: ldc2_w 127747761277926
      // 049: lxor
      // 04a: lstore 15
      // 04c: pop2
      // 04d: ldc2_w -3470704194998240367
      // 050: lload 2
      // 051: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: bipush 0
      // 057: istore 18
      // 059: aload 0
      // 05a: ldc2_w -3177364415783919750
      // 05d: lload 2
      // 05e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 068: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 06d: astore 19
      // 06f: istore 17
      // 071: aload 19
      // 073: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 078: ifeq 17d
      // 07b: aload 19
      // 07d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 082: checkcast java/util/Map$Entry
      // 085: astore 20
      // 087: aload 20
      // 089: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 08e: checkcast com/zelix/a
      // 091: astore 21
      // 093: aload 21
      // 095: lload 4
      // 097: bipush 1
      // 098: anewarray 218
      // 09b: dup_x2
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a1: bipush 0
      // 0a2: swap
      // 0a3: aastore
      // 0a4: ldc2_w -3073400518351936307
      // 0a7: lload 2
      // 0a8: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/md; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: astore 22
      // 0af: aload 22
      // 0b1: aload 21
      // 0b3: lload 15
      // 0b5: bipush 1
      // 0b6: anewarray 218
      // 0b9: dup_x2
      // 0ba: dup_x2
      // 0bb: pop
      // 0bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bf: bipush 0
      // 0c0: swap
      // 0c1: aastore
      // 0c2: ldc2_w -3314543751179489267
      // 0c5: lload 2
      // 0c6: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: lload 11
      // 0cd: dup2_x1
      // 0ce: pop2
      // 0cf: bipush 2
      // 0d0: anewarray 218
      // 0d3: dup_x1
      // 0d4: swap
      // 0d5: bipush 1
      // 0d6: swap
      // 0d7: aastore
      // 0d8: dup_x2
      // 0d9: dup_x2
      // 0da: pop
      // 0db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0de: bipush 0
      // 0df: swap
      // 0e0: aastore
      // 0e1: ldc2_w -3695412062043497488
      // 0e4: lload 2
      // 0e5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: aload 21
      // 0ec: lload 6
      // 0ee: bipush 1
      // 0ef: anewarray 218
      // 0f2: dup_x2
      // 0f3: dup_x2
      // 0f4: pop
      // 0f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f8: bipush 0
      // 0f9: swap
      // 0fa: aastore
      // 0fb: ldc2_w -3455205454118882773
      // 0fe: lload 2
      // 0ff: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: astore 23
      // 106: aload 23
      // 108: arraylength
      // 109: iload 17
      // 10b: lload 2
      // 10c: lconst_0
      // 10d: lcmp
      // 10e: iflt 187
      // 111: ifne 185
      // 114: iload 17
      // 116: ifne 137
      // 119: goto 126
      // 11c: ldc2_w -3827522178948125882
      // 11f: lload 2
      // 120: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: ifle 178
      // 129: goto 136
      // 12c: ldc2_w -3827522178948125882
      // 12f: lload 2
      // 130: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: bipush 1
      // 137: istore 18
      // 139: aload 21
      // 13b: lload 8
      // 13d: iload 10
      // 13f: i2b
      // 140: bipush 2
      // 141: anewarray 218
      // 144: dup_x1
      // 145: swap
      // 146: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 149: bipush 1
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x2
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152: bipush 0
      // 153: swap
      // 154: aastore
      // 155: ldc2_w -3817225726995961605
      // 158: lload 2
      // 159: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: astore 24
      // 160: aload 24
      // 162: bipush 0
      // 163: bipush 1
      // 164: anewarray 218
      // 167: dup_x1
      // 168: swap
      // 169: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 16c: bipush 0
      // 16d: swap
      // 16e: aastore
      // 16f: ldc2_w -3295869574934507278
      // 172: lload 2
      // 173: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: iload 17
      // 17a: ifeq 071
      // 17d: lload 2
      // 17e: lconst_0
      // 17f: lcmp
      // 180: ifle 1bd
      // 183: iload 18
      // 185: iload 17
      // 187: ifne 1bc
      // 18a: ifeq 1bd
      // 18d: goto 19a
      // 190: ldc2_w -3827522178948125882
      // 193: lload 2
      // 194: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: aload 0
      // 19b: ldc2_w -3310142868171807652
      // 19e: lload 2
      // 19f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/bq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: lload 13
      // 1a6: ldc2_w -4031629221944734831
      // 1a9: lload 2
      // 1aa: invokedynamic k (Ljava/lang/Object;JJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: goto 1bc
      // 1b2: ldc2_w -3827522178948125882
      // 1b5: lload 2
      // 1b6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: athrow
      // 1bc: pop
      // 1bd: return
   }

   public void h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 110645372932362L;
      long var6 = var2 ^ 35917880197872L;
      long var8 = var2 ^ 131806424653141L;
      long var10 = var2 ^ 120990332663366L;
      long var12 = var2 ^ 57835372156942L;
      long var14 = var2 ^ 25194815052492L;
      int var10000 = x44.a<"s">(8240111527983923760L, var2);
      Iterator var17 = x44.a<"o">(this, 8295492778122821506L, var2).entrySet().iterator();
      byte var16 = (byte)var10000;

      label70:
      while (true) {
         var10000 = var17.hasNext();

         label68:
         while (var10000 != 0) {
            Entry var18 = (Entry)var17.next();
            a var19 = (a)var18.getValue();
            StringBuilder var20 = new StringBuilder();
            List var21 = x44.a<"k">(var19, new Object[]{var8}, 8345345394178904149L, var2);
            xl[] var22 = x44.a<"k">(var19, new Object[]{var4}, 8139303793703506643L, var2);
            int var23 = 0;
            int var24 = 0;

            label64:
            do {
               var10000 = var24;
               int var10001 = var21.size();

               while (true) {
                  if (var10000 >= var10001) {
                     break label64;
                  }

                  String var25 = (String)var21.get(var24);
                  var20.append(x44.a<"j">(8041138600580358534L, var2));
                  var10000 = var25.equals(x44.a<"j">(8041138600580358534L, var2));
                  if (var16 == 0) {
                     continue label68;
                  }

                  label57: {
                     label56: {
                        try {
                           var10001 = var16;
                           if (var2 <= 0L) {
                              continue;
                           }

                           if (var16 == 0) {
                              break label57;
                           }

                           if (var10000 == 0) {
                              break label56;
                           }
                        } catch (gj var28) {
                           throw x44.a<"s">(var28, 7645372209421192126L, var2);
                        }

                        if (var2 > 0L) {
                           break;
                        }
                     }

                     var10000 = var25.equals(x44.a<"j">(8050372935996380901L, var2));
                  }

                  if (var10000 != 0) {
                     md var26 = (md)var22[var23];
                     sj var27 = new sj(var24, x44.a<"k">(var26, var10, 8164152691644306531L, var2), var14, var26);
                     x44.a<"k">(var19, new Object[]{var27, var12}, 7747308634233841210L, var2);
                     var23++;
                     var32 = var16;
                     if (var2 <= 0L) {
                        continue label64;
                     }

                     if (var16 != 0) {
                        break;
                     }
                  }

                  sj var30 = new sj(var24, var25);
                  x44.a<"k">(var19, new Object[]{var30, var12}, 7747308634233841210L, var2);
                  break;
               }

               var24++;
               var32 = var16;
            } while (var32 != 0);

            x44.a<"k">(var19, new Object[]{var6, var20.toString()}, 8086483444080640815L, var2);
            var10000 = var16;
            if (var2 >= 0L) {
               if (var16 == 0) {
                  return;
               }
               continue label70;
            }
         }

         return;
      }
   }

   public boolean A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(x44.a<"l">(this, 1392928150746456009L, var2), 914043503734827891L, var2);
   }

   public _uf(long var1, hy var3, bq var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 116522255785233L;
      super();
      x44.a<"r">(this, x44.a<"q">(new Object[]{var5}, 5831536310457906818L, var1), 5982394584877375384L, var1);
      this.O = var3;
      this.w = var4;
   }

   public a l(Object[] var1) {
      long var3 = (Long)var1[0];
      bc var2 = (bc)var1[1];
      var3 = a ^ var3;
      return (a)x44.a<"l">(this, 859262127033042801L, var3).get(var2);
   }

   public boolean p(Object[] var1) {
      bc var2 = (bc)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return x44.a<"h">(this, -8110779689491774483L, var3).containsKey(var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
