package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _zi {
   private final pk B;
   private final _y4 y;
   private final _y4 r;
   private Set l;
   private final _y4 L;
   private static final long a = ess.a(9057150566380461977L, 5051947457248560489L, MethodHandles.lookup().lookupClass()).a(8364664804046L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public boolean u(Object[] param1) {
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
      // 004: checkcast com/zelix/ig
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/_zi.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 99438234963845
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 55823848717176
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 16050504349202
      // 02c: lxor
      // 02d: dup2
      // 02e: bipush 32
      // 030: lushr
      // 031: l2i
      // 032: istore 9
      // 034: dup2
      // 035: bipush 32
      // 037: lshl
      // 038: bipush 48
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 10
      // 03e: dup2
      // 03f: bipush 48
      // 041: lshl
      // 042: bipush 48
      // 044: lushr
      // 045: l2i
      // 046: istore 11
      // 048: pop2
      // 049: dup2
      // 04a: ldc2_w 120998319556978
      // 04d: lxor
      // 04e: lstore 12
      // 050: dup2
      // 051: ldc2_w 105940525578468
      // 054: lxor
      // 055: lstore 14
      // 057: pop2
      // 058: ldc2_w -8326531897239334806
      // 05b: lload 3
      // 05c: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: aload 2
      // 062: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 065: astore 17
      // 067: astore 16
      // 069: aload 17
      // 06b: lload 7
      // 06d: invokevirtual com/zelix/hy.n (J)Z
      // 070: aload 16
      // 072: ifnonnull 136
      // 075: ifeq 120
      // 078: goto 085
      // 07b: ldc2_w -7701159944678643811
      // 07e: lload 3
      // 07f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: aload 2
      // 086: lload 14
      // 088: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // 08b: astore 18
      // 08d: aload 17
      // 08f: lload 5
      // 091: bipush 1
      // 092: anewarray 458
      // 095: dup_x2
      // 096: dup_x2
      // 097: pop
      // 098: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09b: bipush 0
      // 09c: swap
      // 09d: aastore
      // 09e: ldc2_w -8154349097472796248
      // 0a1: lload 3
      // 0a2: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0ac: astore 19
      // 0ae: aload 19
      // 0b0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b5: ifeq 11e
      // 0b8: aload 19
      // 0ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bf: checkcast com/zelix/hz
      // 0c2: astore 20
      // 0c4: aload 20
      // 0c6: lload 12
      // 0c8: aload 18
      // 0ca: invokevirtual com/zelix/hz.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // 0cd: astore 21
      // 0cf: aload 0
      // 0d0: ldc2_w -8183961075053078483
      // 0d3: lload 3
      // 0d4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: iload 9
      // 0db: iload 10
      // 0dd: i2s
      // 0de: iload 11
      // 0e0: i2c
      // 0e1: aload 21
      // 0e3: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 0e6: istore 22
      // 0e8: iload 22
      // 0ea: aload 16
      // 0ec: lload 3
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 0f7
      // 0f2: ifnonnull 11f
      // 0f5: aload 16
      // 0f7: ifnonnull 118
      // 0fa: goto 107
      // 0fd: ldc2_w -7701159944678643811
      // 100: lload 3
      // 101: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: ifeq 119
      // 10a: goto 117
      // 10d: ldc2_w -7701159944678643811
      // 110: lload 3
      // 111: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: bipush 1
      // 118: ireturn
      // 119: aload 16
      // 11b: ifnull 0ae
      // 11e: bipush 0
      // 11f: ireturn
      // 120: aload 0
      // 121: ldc2_w -8183961075053078483
      // 124: lload 3
      // 125: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: iload 9
      // 12c: iload 10
      // 12e: i2s
      // 12f: iload 11
      // 131: i2c
      // 132: aload 2
      // 133: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 136: ireturn
   }

   private void I(Object[] param1) {
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
      // 004: checkcast java/io/PrintWriter
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_ub
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: pop
      // 01b: getstatic com/zelix/_zi.a J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 115797656298946
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 133624211841212
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 62086564383355
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 115797656298946
      // 03e: lxor
      // 03f: lstore 12
      // 041: dup2
      // 042: ldc2_w 16597861895542
      // 045: lxor
      // 046: lstore 14
      // 048: dup2
      // 049: ldc2_w 90495336910060
      // 04c: lxor
      // 04d: lstore 16
      // 04f: dup2
      // 050: ldc2_w 51266651223427
      // 053: lxor
      // 054: lstore 18
      // 056: dup2
      // 057: ldc2_w 139912449072261
      // 05a: lxor
      // 05b: lstore 20
      // 05d: dup2
      // 05e: ldc2_w 40862171125645
      // 061: lxor
      // 062: lstore 22
      // 064: dup2
      // 065: ldc2_w 58101813671264
      // 068: lxor
      // 069: lstore 24
      // 06b: pop2
      // 06c: ldc2_w 4162789613876782557
      // 06f: lload 4
      // 071: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: aload 0
      // 077: ldc2_w 4313250527351598490
      // 07a: lload 4
      // 07c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: lload 16
      // 083: bipush 1
      // 084: anewarray 458
      // 087: dup_x2
      // 088: dup_x2
      // 089: pop
      // 08a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08d: bipush 0
      // 08e: swap
      // 08f: aastore
      // 090: ldc2_w 4269364744027511839
      // 093: lload 4
      // 095: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: lload 22
      // 09c: dup2_x1
      // 09d: pop2
      // 09e: bipush 2
      // 09f: anewarray 458
      // 0a2: dup_x1
      // 0a3: swap
      // 0a4: bipush 1
      // 0a5: swap
      // 0a6: aastore
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w 4210967048906620623
      // 0b3: lload 4
      // 0b5: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: astore 27
      // 0bc: new com/zelix/wr
      // 0bf: dup
      // 0c0: aload 0
      // 0c1: invokespecial com/zelix/wr.<init> (Lcom/zelix/_zi;)V
      // 0c4: astore 28
      // 0c6: astore 26
      // 0c8: aload 27
      // 0ca: aload 28
      // 0cc: ldc2_w 4377005902902362478
      // 0cf: lload 4
      // 0d1: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: bipush 0
      // 0d7: istore 29
      // 0d9: iload 29
      // 0db: aload 27
      // 0dd: invokeinterface java/util/List.size ()I 1
      // 0e2: if_icmpge 3ba
      // 0e5: aload 27
      // 0e7: iload 29
      // 0e9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ee: checkcast com/zelix/iu
      // 0f1: astore 30
      // 0f3: aload 26
      // 0f5: lload 4
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 3b7
      // 0fc: ifnonnull 3b5
      // 0ff: aload 30
      // 101: invokevirtual com/zelix/iu.k ()Z
      // 104: ifeq 3b2
      // 107: goto 115
      // 10a: ldc2_w 2353411829124747818
      // 10d: lload 4
      // 10f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 30
      // 117: checkcast com/zelix/ig
      // 11a: astore 31
      // 11c: aload 3
      // 11d: aload 26
      // 11f: lload 4
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 156
      // 126: ifnonnull 13b
      // 129: ifnull 1a8
      // 12c: goto 13a
      // 12f: ldc2_w 2353411829124747818
      // 132: lload 4
      // 134: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 3
      // 13b: aload 31
      // 13d: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 140: lload 24
      // 142: dup2_x1
      // 143: pop2
      // 144: bipush 2
      // 145: anewarray 458
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 1
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x2
      // 14e: dup_x2
      // 14f: pop
      // 150: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: ldc2_w 4557019331377033627
      // 159: lload 4
      // 15b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: aload 26
      // 162: ifnonnull 1a5
      // 165: ifne 3b2
      // 168: goto 176
      // 16b: ldc2_w 2353411829124747818
      // 16e: lload 4
      // 170: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 3
      // 177: lload 8
      // 179: aload 31
      // 17b: bipush 2
      // 17c: anewarray 458
      // 17f: dup_x1
      // 180: swap
      // 181: bipush 1
      // 182: swap
      // 183: aastore
      // 184: dup_x2
      // 185: dup_x2
      // 186: pop
      // 187: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18a: bipush 0
      // 18b: swap
      // 18c: aastore
      // 18d: ldc2_w 4243773099891364450
      // 190: lload 4
      // 192: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: goto 1a5
      // 19a: ldc2_w 2353411829124747818
      // 19d: lload 4
      // 19f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: ifne 3b2
      // 1a8: new java/lang/StringBuilder
      // 1ab: dup
      // 1ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 1af: astore 32
      // 1b1: aload 0
      // 1b2: ldc2_w 4313250527351598490
      // 1b5: lload 4
      // 1b7: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: aload 31
      // 1be: lload 10
      // 1c0: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 1c3: astore 33
      // 1c5: aload 33
      // 1c7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1cc: astore 34
      // 1ce: aload 34
      // 1d0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1d5: ifeq 2c1
      // 1d8: aload 34
      // 1da: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1df: checkcast com/zelix/iu
      // 1e2: astore 35
      // 1e4: aload 35
      // 1e6: lload 18
      // 1e8: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 1eb: astore 36
      // 1ed: aload 32
      // 1ef: new java/lang/StringBuilder
      // 1f2: dup
      // 1f3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f6: ldc "\""
      // 1f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fb: aload 36
      // 1fd: lload 12
      // 1ff: bipush 1
      // 200: anewarray 458
      // 203: dup_x2
      // 204: dup_x2
      // 205: pop
      // 206: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 209: bipush 0
      // 20a: swap
      // 20b: aastore
      // 20c: ldc2_w 4522994476304444014
      // 20f: lload 4
      // 211: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 219: ldc "\""
      // 21b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 221: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 224: pop
      // 225: aload 36
      // 227: lload 20
      // 229: invokevirtual com/zelix/hz.K (J)Z
      // 22c: aload 26
      // 22e: ifnonnull 0db
      // 231: aload 26
      // 233: lload 4
      // 235: lconst_0
      // 236: lcmp
      // 237: iflt 162
      // 23a: ifnonnull 297
      // 23d: ifeq 290
      // 240: goto 24e
      // 243: ldc2_w 2353411829124747818
      // 246: lload 4
      // 248: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: athrow
      // 24e: aload 32
      // 250: new java/lang/StringBuilder
      // 253: dup
      // 254: invokespecial java/lang/StringBuilder.<init> ()V
      // 257: sipush 3908
      // 25a: ldc2_w 7189253739163097273
      // 25d: lload 4
      // 25f: lxor
      // 260: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 268: aload 36
      // 26a: bipush 0
      // 26b: anewarray 458
      // 26e: ldc2_w 4188949908379960585
      // 271: lload 4
      // 273: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 27b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 27e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 281: pop
      // 282: goto 290
      // 285: ldc2_w 2353411829124747818
      // 288: lload 4
      // 28a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28f: athrow
      // 290: aload 34
      // 292: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 297: ifeq 2bc
      // 29a: aload 32
      // 29c: sipush 7416
      // 29f: ldc2_w 2708996021747583744
      // 2a2: lload 4
      // 2a4: lxor
      // 2a5: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ad: pop
      // 2ae: goto 2bc
      // 2b1: ldc2_w 2353411829124747818
      // 2b4: lload 4
      // 2b6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bb: athrow
      // 2bc: aload 26
      // 2be: ifnull 1ce
      // 2c1: aload 2
      // 2c2: lload 4
      // 2c4: lconst_0
      // 2c5: lcmp
      // 2c6: ifle 1df
      // 2c9: new java/lang/StringBuilder
      // 2cc: dup
      // 2cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d0: sipush 7553
      // 2d3: ldc2_w 5055300537414093437
      // 2d6: lload 4
      // 2d8: lxor
      // 2d9: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e1: aload 31
      // 2e3: lload 14
      // 2e5: bipush 0
      // 2e6: bipush 2
      // 2e7: anewarray 458
      // 2ea: dup_x1
      // 2eb: swap
      // 2ec: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ef: bipush 1
      // 2f0: swap
      // 2f1: aastore
      // 2f2: dup_x2
      // 2f3: dup_x2
      // 2f4: pop
      // 2f5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f8: bipush 0
      // 2f9: swap
      // 2fa: aastore
      // 2fb: ldc2_w 2635707403952739206
      // 2fe: lload 4
      // 300: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 308: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30b: sipush 16329
      // 30e: ldc2_w 6212243472511019063
      // 311: lload 4
      // 313: lxor
      // 314: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31c: aload 31
      // 31e: lload 6
      // 320: bipush 1
      // 321: anewarray 458
      // 324: dup_x2
      // 325: dup_x2
      // 326: pop
      // 327: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32a: bipush 0
      // 32b: swap
      // 32c: aastore
      // 32d: ldc2_w 2447558733386446673
      // 330: lload 4
      // 332: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 337: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33a: sipush 12178
      // 33d: lload 4
      // 33f: lconst_0
      // 340: lcmp
      // 341: iflt 35e
      // 344: ldc2_w 4464127692053231725
      // 347: lload 4
      // 349: lxor
      // 34a: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34f: aload 26
      // 351: ifnonnull 393
      // 354: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 357: aload 33
      // 359: invokeinterface java/util/List.size ()I 1
      // 35e: lload 4
      // 360: lconst_0
      // 361: lcmp
      // 362: iflt 399
      // 365: bipush 1
      // 366: if_icmpne 396
      // 369: goto 377
      // 36c: ldc2_w 2353411829124747818
      // 36f: lload 4
      // 371: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: athrow
      // 377: sipush 3098
      // 37a: ldc2_w 4109417865899023331
      // 37d: lload 4
      // 37f: lxor
      // 380: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: goto 393
      // 388: ldc2_w 2353411829124747818
      // 38b: lload 4
      // 38d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: athrow
      // 393: goto 3a4
      // 396: sipush 27518
      // 399: ldc2_w 9093324919121509508
      // 39c: lload 4
      // 39e: lxor
      // 39f: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_zi.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a7: aload 32
      // 3a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3af: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 3b2: iinc 29 1
      // 3b5: aload 26
      // 3b7: ifnull 0d9
      // 3ba: lload 4
      // 3bc: lconst_0
      // 3bd: lcmp
      // 3be: iflt 0e5
      // 3c1: return
   }

   public boolean I(Object[] param1) {
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
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/ig
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/_zi.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 29100061143339
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w -151620980755176963
      // 26: lload 2
      // 27: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: astore 7
      // 2e: aload 0
      // 2f: ldc2_w -457193681991377024
      // 32: lload 2
      // 33: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: aload 4
      // 3a: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 3f: aload 7
      // 41: ifnonnull 80
      // 44: ifeq 60
      // 47: goto 54
      // 4a: ldc2_w -1979163765023304182
      // 4d: lload 2
      // 4e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: bipush 1
      // 55: ireturn
      // 56: ldc2_w -1979163765023304182
      // 59: lload 2
      // 5a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 0
      // 61: aload 4
      // 63: lload 5
      // 65: bipush 2
      // 66: anewarray 458
      // 69: dup_x2
      // 6a: dup_x2
      // 6b: pop
      // 6c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f: bipush 1
      // 70: swap
      // 71: aastore
      // 72: dup_x1
      // 73: swap
      // 74: bipush 0
      // 75: swap
      // 76: aastore
      // 77: ldc2_w -21856053365943682
      // 7a: lload 2
      // 7b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: ireturn
   }

   private void S(Object[] param1) {
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
      // 004: checkcast com/zelix/iu
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/List
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/List
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 2
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/w
      // 030: astore 7
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast com/zelix/w
      // 039: astore 5
      // 03b: pop
      // 03c: getstatic com/zelix/_zi.a J
      // 03f: lload 3
      // 040: lxor
      // 041: lstore 3
      // 042: lload 3
      // 043: dup2
      // 044: ldc2_w 35729801009557
      // 047: lxor
      // 048: lstore 10
      // 04a: dup2
      // 04b: ldc2_w 36943976213280
      // 04e: lxor
      // 04f: lstore 12
      // 051: dup2
      // 052: ldc2_w 80455283253213
      // 055: lxor
      // 056: lstore 14
      // 058: dup2
      // 059: ldc2_w 92848889053594
      // 05c: lxor
      // 05d: lstore 16
      // 05f: dup2
      // 060: ldc2_w 87931895332087
      // 063: lxor
      // 064: lstore 18
      // 066: dup2
      // 067: ldc2_w 60119147294130
      // 06a: lxor
      // 06b: lstore 20
      // 06d: dup2
      // 06e: ldc2_w 101499902297929
      // 071: lxor
      // 072: lstore 22
      // 074: dup2
      // 075: ldc2_w 89104488883345
      // 078: lxor
      // 079: lstore 24
      // 07b: dup2
      // 07c: ldc2_w 92848889053594
      // 07f: lxor
      // 080: lstore 26
      // 082: dup2
      // 083: ldc2_w 105128641891151
      // 086: lxor
      // 087: lstore 28
      // 089: dup2
      // 08a: ldc2_w 92804719885772
      // 08d: lxor
      // 08e: lstore 30
      // 090: dup2
      // 091: ldc2_w 115939630350625
      // 094: lxor
      // 095: lstore 32
      // 097: pop2
      // 098: ldc2_w -6280466823625362225
      // 09b: lload 3
      // 09c: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: lload 22
      // 0a3: sipush 27363
      // 0a6: ldc2_w 4886800722734113831
      // 0a9: lload 3
      // 0aa: lxor
      // 0ab: invokedynamic c (IJ)I bsm=com/zelix/_zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: bipush 2
      // 0b1: anewarray 458
      // 0b4: dup_x1
      // 0b5: swap
      // 0b6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b9: bipush 1
      // 0ba: swap
      // 0bb: aastore
      // 0bc: dup_x2
      // 0bd: dup_x2
      // 0be: pop
      // 0bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c2: bipush 0
      // 0c3: swap
      // 0c4: aastore
      // 0c5: ldc2_w -5358123744154340176
      // 0c8: lload 3
      // 0c9: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: astore 35
      // 0d0: lload 20
      // 0d2: bipush 1
      // 0d3: anewarray 458
      // 0d6: dup_x2
      // 0d7: dup_x2
      // 0d8: pop
      // 0d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dc: bipush 0
      // 0dd: swap
      // 0de: aastore
      // 0df: ldc2_w -5929293009384430470
      // 0e2: lload 3
      // 0e3: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: astore 36
      // 0ea: lload 22
      // 0ec: sipush 20653
      // 0ef: ldc2_w 1475421998843289192
      // 0f2: lload 3
      // 0f3: lxor
      // 0f4: invokedynamic c (IJ)I bsm=com/zelix/_zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: bipush 2
      // 0fa: anewarray 458
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 102: bipush 1
      // 103: swap
      // 104: aastore
      // 105: dup_x2
      // 106: dup_x2
      // 107: pop
      // 108: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10b: bipush 0
      // 10c: swap
      // 10d: aastore
      // 10e: ldc2_w -5358123744154340176
      // 111: lload 3
      // 112: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: astore 37
      // 119: lload 22
      // 11b: sipush 20653
      // 11e: ldc2_w 1475421998843289192
      // 121: lload 3
      // 122: lxor
      // 123: invokedynamic c (IJ)I bsm=com/zelix/_zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: bipush 2
      // 129: anewarray 458
      // 12c: dup_x1
      // 12d: swap
      // 12e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 131: bipush 1
      // 132: swap
      // 133: aastore
      // 134: dup_x2
      // 135: dup_x2
      // 136: pop
      // 137: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13a: bipush 0
      // 13b: swap
      // 13c: aastore
      // 13d: ldc2_w -5358123744154340176
      // 140: lload 3
      // 141: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: astore 38
      // 148: astore 34
      // 14a: lload 22
      // 14c: sipush 20653
      // 14f: ldc2_w 1475421998843289192
      // 152: lload 3
      // 153: lxor
      // 154: invokedynamic c (IJ)I bsm=com/zelix/_zi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: bipush 2
      // 15a: anewarray 458
      // 15d: dup_x1
      // 15e: swap
      // 15f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
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
      // 16e: ldc2_w -5358123744154340176
      // 171: lload 3
      // 172: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: astore 39
      // 179: aload 8
      // 17b: aload 35
      // 17d: aload 2
      // 17e: lload 26
      // 180: bipush 3
      // 181: anewarray 458
      // 184: dup_x2
      // 185: dup_x2
      // 186: pop
      // 187: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18a: bipush 2
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 1
      // 190: swap
      // 191: aastore
      // 192: dup_x1
      // 193: swap
      // 194: bipush 0
      // 195: swap
      // 196: aastore
      // 197: ldc2_w -5940738061123325207
      // 19a: lload 3
      // 19b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: aload 6
      // 1a2: aload 34
      // 1a4: ifnonnull 1b9
      // 1a7: ifnull 202
      // 1aa: goto 1b7
      // 1ad: ldc2_w -5640054584806325448
      // 1b0: lload 3
      // 1b1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: aload 6
      // 1b9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1be: astore 40
      // 1c0: aload 40
      // 1c2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c7: ifeq 202
      // 1ca: aload 40
      // 1cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d1: checkcast com/zelix/ig
      // 1d4: astore 41
      // 1d6: aload 41
      // 1d8: aload 35
      // 1da: aload 2
      // 1db: lload 16
      // 1dd: bipush 3
      // 1de: anewarray 458
      // 1e1: dup_x2
      // 1e2: dup_x2
      // 1e3: pop
      // 1e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e7: bipush 2
      // 1e8: swap
      // 1e9: aastore
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 1
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x1
      // 1f0: swap
      // 1f1: bipush 0
      // 1f2: swap
      // 1f3: aastore
      // 1f4: ldc2_w -5543328019056484109
      // 1f7: lload 3
      // 1f8: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: aload 34
      // 1ff: ifnull 1c0
      // 202: aload 35
      // 204: aload 8
      // 206: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 20b: istore 40
      // 20d: aload 8
      // 20f: aload 36
      // 211: aload 37
      // 213: aload 38
      // 215: lload 10
      // 217: aload 39
      // 219: bipush 5
      // 21a: anewarray 458
      // 21d: dup_x1
      // 21e: swap
      // 21f: bipush 4
      // 220: swap
      // 221: aastore
      // 222: dup_x2
      // 223: dup_x2
      // 224: pop
      // 225: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 228: bipush 3
      // 229: swap
      // 22a: aastore
      // 22b: dup_x1
      // 22c: swap
      // 22d: bipush 2
      // 22e: swap
      // 22f: aastore
      // 230: dup_x1
      // 231: swap
      // 232: bipush 1
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 0
      // 238: swap
      // 239: aastore
      // 23a: ldc2_w -5903697214077751163
      // 23d: lload 3
      // 23e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: aload 9
      // 245: aload 34
      // 247: ifnonnull 25c
      // 24a: ifnull 2a6
      // 24d: goto 25a
      // 250: ldc2_w -5640054584806325448
      // 253: lload 3
      // 254: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: aload 9
      // 25c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 261: astore 41
      // 263: aload 41
      // 265: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 26a: ifeq 2a6
      // 26d: aload 41
      // 26f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 274: checkcast com/zelix/hy
      // 277: astore 42
      // 279: aload 37
      // 27b: aload 42
      // 27d: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 282: lload 3
      // 283: lconst_0
      // 284: lcmp
      // 285: iflt 2b6
      // 288: pop
      // 289: aload 34
      // 28b: ifnonnull 2af
      // 28e: aload 34
      // 290: ifnull 263
      // 293: lload 3
      // 294: lconst_0
      // 295: lcmp
      // 296: ifle 289
      // 299: goto 2a6
      // 29c: ldc2_w -5640054584806325448
      // 29f: lload 3
      // 2a0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: aload 35
      // 2a8: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 2ad: astore 41
      // 2af: aload 41
      // 2b1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2b6: lload 3
      // 2b7: lconst_0
      // 2b8: lcmp
      // 2b9: iflt 33b
      // 2bc: ifeq 330
      // 2bf: aload 41
      // 2c1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2c6: checkcast com/zelix/iu
      // 2c9: astore 42
      // 2cb: aload 7
      // 2cd: lload 28
      // 2cf: aload 42
      // 2d1: aload 8
      // 2d3: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // 2d6: pop
      // 2d7: aload 42
      // 2d9: aload 36
      // 2db: aload 37
      // 2dd: aload 38
      // 2df: lload 10
      // 2e1: aload 39
      // 2e3: bipush 5
      // 2e4: anewarray 458
      // 2e7: dup_x1
      // 2e8: swap
      // 2e9: bipush 4
      // 2ea: swap
      // 2eb: aastore
      // 2ec: dup_x2
      // 2ed: dup_x2
      // 2ee: pop
      // 2ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f2: bipush 3
      // 2f3: swap
      // 2f4: aastore
      // 2f5: dup_x1
      // 2f6: swap
      // 2f7: bipush 2
      // 2f8: swap
      // 2f9: aastore
      // 2fa: dup_x1
      // 2fb: swap
      // 2fc: bipush 1
      // 2fd: swap
      // 2fe: aastore
      // 2ff: dup_x1
      // 300: swap
      // 301: bipush 0
      // 302: swap
      // 303: aastore
      // 304: ldc2_w -5903697214077751163
      // 307: lload 3
      // 308: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30d: aload 34
      // 30f: lload 3
      // 310: lconst_0
      // 311: lcmp
      // 312: ifle 31a
      // 315: ifnonnull 43c
      // 318: aload 34
      // 31a: ifnull 2af
      // 31d: lload 3
      // 31e: lconst_0
      // 31f: lcmp
      // 320: iflt 330
      // 323: goto 330
      // 326: ldc2_w -5640054584806325448
      // 329: lload 3
      // 32a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32f: athrow
      // 330: aload 38
      // 332: ldc2_w -6183581792037343858
      // 335: lload 3
      // 336: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33b: aload 34
      // 33d: lload 3
      // 33e: lconst_0
      // 33f: lcmp
      // 340: ifle 449
      // 343: ifnonnull 447
      // 346: ifne 43c
      // 349: goto 356
      // 34c: ldc2_w -5640054584806325448
      // 34f: lload 3
      // 350: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 355: athrow
      // 356: aload 38
      // 358: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 35d: astore 41
      // 35f: aload 41
      // 361: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 366: ifeq 43c
      // 369: aload 41
      // 36b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 370: checkcast com/zelix/iz
      // 373: astore 42
      // 375: aload 42
      // 377: invokevirtual com/zelix/iz.H ()Ljava/lang/String;
      // 37a: lload 32
      // 37c: dup2_x1
      // 37d: pop2
      // 37e: bipush 2
      // 37f: anewarray 458
      // 382: dup_x1
      // 383: swap
      // 384: bipush 1
      // 385: swap
      // 386: aastore
      // 387: dup_x2
      // 388: dup_x2
      // 389: pop
      // 38a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38d: bipush 0
      // 38e: swap
      // 38f: aastore
      // 390: ldc2_w -5681893367311079010
      // 393: lload 3
      // 394: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 399: astore 43
      // 39b: aload 43
      // 39d: aload 34
      // 39f: lload 3
      // 3a0: lconst_0
      // 3a1: lcmp
      // 3a2: ifle 3aa
      // 3a5: ifnonnull 47c
      // 3a8: aload 34
      // 3aa: ifnonnull 3cc
      // 3ad: goto 3ba
      // 3b0: ldc2_w -5640054584806325448
      // 3b3: lload 3
      // 3b4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b9: athrow
      // 3ba: ifnull 437
      // 3bd: goto 3ca
      // 3c0: ldc2_w -5640054584806325448
      // 3c3: lload 3
      // 3c4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: athrow
      // 3ca: aload 43
      // 3cc: lload 14
      // 3ce: invokevirtual com/zelix/hz.n (J)Z
      // 3d1: aload 34
      // 3d3: ifnonnull 436
      // 3d6: ifeq 420
      // 3d9: goto 3e6
      // 3dc: ldc2_w -5640054584806325448
      // 3df: lload 3
      // 3e0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e5: athrow
      // 3e6: aload 37
      // 3e8: aload 43
      // 3ea: lload 12
      // 3ec: bipush 1
      // 3ed: anewarray 458
      // 3f0: dup_x2
      // 3f1: dup_x2
      // 3f2: pop
      // 3f3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f6: bipush 0
      // 3f7: swap
      // 3f8: aastore
      // 3f9: ldc2_w -6165263671885595379
      // 3fc: lload 3
      // 3fd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 407: pop
      // 408: aload 34
      // 40a: lload 3
      // 40b: lconst_0
      // 40c: lcmp
      // 40d: iflt 439
      // 410: ifnull 437
      // 413: goto 420
      // 416: ldc2_w -5640054584806325448
      // 419: lload 3
      // 41a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41f: athrow
      // 420: aload 37
      // 422: aload 43
      // 424: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 429: goto 436
      // 42c: ldc2_w -5640054584806325448
      // 42f: lload 3
      // 430: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 435: athrow
      // 436: pop
      // 437: aload 34
      // 439: ifnull 35f
      // 43c: aload 39
      // 43e: ldc2_w -6183581792037343858
      // 441: lload 3
      // 442: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 447: aload 34
      // 449: lload 3
      // 44a: lconst_0
      // 44b: lcmp
      // 44c: iflt 4f1
      // 44f: ifnonnull 4e9
      // 452: ifne 4d8
      // 455: goto 462
      // 458: ldc2_w -5640054584806325448
      // 45b: lload 3
      // 45c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 461: athrow
      // 462: aload 39
      // 464: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 469: astore 41
      // 46b: aload 41
      // 46d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 472: ifeq 4d8
      // 475: aload 41
      // 477: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 47c: checkcast com/zelix/iu
      // 47f: astore 42
      // 481: aload 42
      // 483: invokevirtual com/zelix/iu.H ()Ljava/lang/String;
      // 486: lload 18
      // 488: bipush 2
      // 489: anewarray 458
      // 48c: dup_x2
      // 48d: dup_x2
      // 48e: pop
      // 48f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 492: bipush 1
      // 493: swap
      // 494: aastore
      // 495: dup_x1
      // 496: swap
      // 497: bipush 0
      // 498: swap
      // 499: aastore
      // 49a: ldc2_w -5749527202701495585
      // 49d: lload 3
      // 49e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: astore 43
      // 4a5: aload 34
      // 4a7: ifnonnull 53e
      // 4aa: aload 43
      // 4ac: ifnull 4d3
      // 4af: goto 4bc
      // 4b2: ldc2_w -5640054584806325448
      // 4b5: lload 3
      // 4b6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bb: athrow
      // 4bc: aload 37
      // 4be: aload 43
      // 4c0: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 4c5: pop
      // 4c6: goto 4d3
      // 4c9: ldc2_w -5640054584806325448
      // 4cc: lload 3
      // 4cd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d2: athrow
      // 4d3: aload 34
      // 4d5: ifnull 46b
      // 4d8: aload 37
      // 4da: ldc2_w -6183581792037343858
      // 4dd: lload 3
      // 4de: lload 3
      // 4df: lconst_0
      // 4e0: lcmp
      // 4e1: iflt 544
      // 4e4: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e9: lload 3
      // 4ea: lconst_0
      // 4eb: lcmp
      // 4ec: iflt 549
      // 4ef: aload 34
      // 4f1: ifnonnull 549
      // 4f4: ifne 53e
      // 4f7: goto 504
      // 4fa: ldc2_w -5640054584806325448
      // 4fd: lload 3
      // 4fe: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 503: athrow
      // 504: aload 5
      // 506: aload 8
      // 508: lload 24
      // 50a: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 50d: lload 30
      // 50f: aload 37
      // 511: bipush 3
      // 512: anewarray 458
      // 515: dup_x1
      // 516: swap
      // 517: bipush 2
      // 518: swap
      // 519: aastore
      // 51a: dup_x2
      // 51b: dup_x2
      // 51c: pop
      // 51d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 520: bipush 1
      // 521: swap
      // 522: aastore
      // 523: dup_x1
      // 524: swap
      // 525: bipush 0
      // 526: swap
      // 527: aastore
      // 528: ldc2_w -6280053593546817200
      // 52b: lload 3
      // 52c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 531: goto 53e
      // 534: ldc2_w -5640054584806325448
      // 537: lload 3
      // 538: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53d: athrow
      // 53e: aload 36
      // 540: ldc2_w -6183581792037343858
      // 543: lload 3
      // 544: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 549: ifne 586
      // 54c: aload 5
      // 54e: aload 8
      // 550: lload 24
      // 552: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 555: lload 30
      // 557: aload 36
      // 559: bipush 3
      // 55a: anewarray 458
      // 55d: dup_x1
      // 55e: swap
      // 55f: bipush 2
      // 560: swap
      // 561: aastore
      // 562: dup_x2
      // 563: dup_x2
      // 564: pop
      // 565: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 568: bipush 1
      // 569: swap
      // 56a: aastore
      // 56b: dup_x1
      // 56c: swap
      // 56d: bipush 0
      // 56e: swap
      // 56f: aastore
      // 570: ldc2_w -6280053593546817200
      // 573: lload 3
      // 574: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 579: goto 586
      // 57c: ldc2_w -5640054584806325448
      // 57f: lload 3
      // 580: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 585: athrow
      // 586: return
   }

   public boolean x(Object[] param1) {
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
      // 04: checkcast com/zelix/ig
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/_zi.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 138158231382870
      // 1f: lxor
      // 20: lstore 5
      // 22: dup2
      // 23: ldc2_w 70813793633105
      // 26: lxor
      // 27: lstore 7
      // 29: dup2
      // 2a: ldc2_w 112432353606576
      // 2d: lxor
      // 2e: dup2
      // 2f: bipush 16
      // 31: lushr
      // 32: lstore 9
      // 34: dup2
      // 35: bipush 48
      // 37: lshl
      // 38: bipush 48
      // 3a: lushr
      // 3b: l2i
      // 3c: istore 11
      // 3e: pop2
      // 3f: pop2
      // 40: ldc2_w 8137805553864928503
      // 43: lload 2
      // 44: invokedynamic s (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: aload 4
      // 4b: lload 5
      // 4d: invokevirtual com/zelix/ig.k (J)Ljava/lang/String;
      // 50: astore 13
      // 52: aload 0
      // 53: ldc2_w 8282619514685793456
      // 56: lload 2
      // 57: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: aload 4
      // 5e: lload 7
      // 60: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 63: astore 14
      // 65: astore 12
      // 67: aload 14
      // 69: aload 12
      // 6b: ifnonnull 80
      // 6e: ifnull f6
      // 71: goto 7e
      // 74: ldc2_w 7602788134001089280
      // 77: lload 2
      // 78: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 14
      // 80: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 85: astore 15
      // 87: aload 15
      // 89: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8e: ifeq f6
      // 91: aload 15
      // 93: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 98: checkcast com/zelix/iu
      // 9b: astore 16
      // 9d: aload 16
      // 9f: lload 5
      // a1: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // a4: astore 17
      // a6: aload 0
      // a7: ldc2_w 8078407071600654226
      // aa: lload 2
      // ab: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: lload 9
      // b2: iload 11
      // b4: i2s
      // b5: aload 13
      // b7: aload 17
      // b9: ldc2_w 8320484367602559127
      // bc: lload 2
      // bd: invokedynamic k (Ljava/lang/Object;JSLjava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: aload 12
      // c4: lload 2
      // c5: lconst_0
      // c6: lcmp
      // c7: iflt cf
      // ca: ifnonnull f7
      // cd: aload 12
      // cf: ifnonnull f0
      // d2: goto df
      // d5: ldc2_w 7602788134001089280
      // d8: lload 2
      // d9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // de: athrow
      // df: ifeq f1
      // e2: goto ef
      // e5: ldc2_w 7602788134001089280
      // e8: lload 2
      // e9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ee: athrow
      // ef: bipush 1
      // f0: ireturn
      // f1: aload 12
      // f3: ifnull 87
      // f6: bipush 0
      // f7: ireturn
   }

   private void l(Object[] param1) {
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
      // 004: checkcast com/zelix/yn
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/Set
      // 01a: astore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/w
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/w
      // 028: astore 7
      // 02a: pop
      // 02b: getstatic com/zelix/_zi.a J
      // 02e: lload 5
      // 030: lxor
      // 031: lstore 5
      // 033: lload 5
      // 035: dup2
      // 036: ldc2_w 105029329371047
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 74422293582687
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 132666729873596
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 36011835649882
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 46611423463061
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 41619943348530
      // 05c: lxor
      // 05d: lstore 18
      // 05f: dup2
      // 060: ldc2_w 137717142309855
      // 063: lxor
      // 064: lstore 20
      // 066: pop2
      // 067: aload 4
      // 069: ldc2_w -4036699291789654819
      // 06c: lload 5
      // 06e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: astore 23
      // 075: ldc2_w -2394677415270202660
      // 078: lload 5
      // 07a: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: aload 2
      // 080: lload 8
      // 082: aload 23
      // 084: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 087: astore 24
      // 089: astore 22
      // 08b: aload 24
      // 08d: aload 22
      // 08f: ifnonnull 0a4
      // 092: ifnull 0ac
      // 095: goto 0a3
      // 098: ldc2_w -4059527652249553621
      // 09b: lload 5
      // 09d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: aload 3
      // 0a4: aload 24
      // 0a6: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 0ab: pop
      // 0ac: aload 23
      // 0ae: lload 14
      // 0b0: invokevirtual com/zelix/hz.B (J)Z
      // 0b3: aload 22
      // 0b5: ifnonnull 19b
      // 0b8: ifeq 14b
      // 0bb: goto 0c9
      // 0be: ldc2_w -4059527652249553621
      // 0c1: lload 5
      // 0c3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 23
      // 0cb: lload 18
      // 0cd: bipush 1
      // 0ce: anewarray 458
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w -4375831801312508665
      // 0dd: lload 5
      // 0df: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e9: astore 25
      // 0eb: aload 25
      // 0ed: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f2: ifeq 14b
      // 0f5: aload 25
      // 0f7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fc: checkcast com/zelix/hz
      // 0ff: astore 26
      // 101: aload 2
      // 102: lload 8
      // 104: aload 26
      // 106: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 109: astore 27
      // 10b: lload 5
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: iflt 1fe
      // 112: aload 27
      // 114: aload 22
      // 116: ifnonnull 1d1
      // 119: aload 22
      // 11b: ifnonnull 13e
      // 11e: goto 12c
      // 121: ldc2_w -4059527652249553621
      // 124: lload 5
      // 126: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: ifnull 146
      // 12f: goto 13d
      // 132: ldc2_w -4059527652249553621
      // 135: lload 5
      // 137: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aload 3
      // 13e: aload 27
      // 140: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 145: pop
      // 146: aload 22
      // 148: ifnull 0eb
      // 14b: aload 7
      // 14d: aload 23
      // 14f: lload 20
      // 151: aload 3
      // 152: bipush 3
      // 153: anewarray 458
      // 156: dup_x1
      // 157: swap
      // 158: bipush 2
      // 159: swap
      // 15a: aastore
      // 15b: dup_x2
      // 15c: dup_x2
      // 15d: pop
      // 15e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 161: bipush 1
      // 162: swap
      // 163: aastore
      // 164: dup_x1
      // 165: swap
      // 166: bipush 0
      // 167: swap
      // 168: aastore
      // 169: ldc2_w -2392557502626629821
      // 16c: lload 5
      // 16e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: lload 5
      // 175: lconst_0
      // 176: lcmp
      // 177: ifle 203
      // 17a: aload 23
      // 17c: aload 22
      // 17e: lload 5
      // 180: lconst_0
      // 181: lcmp
      // 182: ifle 1af
      // 185: ifnonnull 1a0
      // 188: lload 14
      // 18a: invokevirtual com/zelix/hz.B (J)Z
      // 18d: goto 19b
      // 190: ldc2_w -4059527652249553621
      // 193: lload 5
      // 195: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: athrow
      // 19b: ifeq 203
      // 19e: aload 23
      // 1a0: lload 18
      // 1a2: bipush 1
      // 1a3: anewarray 458
      // 1a6: dup_x2
      // 1a7: dup_x2
      // 1a8: pop
      // 1a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ac: bipush 0
      // 1ad: swap
      // 1ae: aastore
      // 1af: ldc2_w -4375831801312508665
      // 1b2: lload 5
      // 1b4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1be: astore 25
      // 1c0: aload 25
      // 1c2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1c7: ifeq 203
      // 1ca: aload 25
      // 1cc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d1: checkcast com/zelix/hz
      // 1d4: astore 26
      // 1d6: aload 7
      // 1d8: aload 26
      // 1da: lload 20
      // 1dc: aload 3
      // 1dd: bipush 3
      // 1de: anewarray 458
      // 1e1: dup_x1
      // 1e2: swap
      // 1e3: bipush 2
      // 1e4: swap
      // 1e5: aastore
      // 1e6: dup_x2
      // 1e7: dup_x2
      // 1e8: pop
      // 1e9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ec: bipush 1
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x1
      // 1f0: swap
      // 1f1: bipush 0
      // 1f2: swap
      // 1f3: aastore
      // 1f4: ldc2_w -2392557502626629821
      // 1f7: lload 5
      // 1f9: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: aload 22
      // 200: ifnull 1c0
      // 203: aload 4
      // 205: lload 16
      // 207: bipush 1
      // 208: anewarray 458
      // 20b: dup_x2
      // 20c: dup_x2
      // 20d: pop
      // 20e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 211: bipush 0
      // 212: swap
      // 213: aastore
      // 214: ldc2_w -4522560222665436765
      // 217: lload 5
      // 219: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: astore 25
      // 220: aload 25
      // 222: aload 22
      // 224: ifnonnull 23a
      // 227: ifnull 2cf
      // 22a: goto 238
      // 22d: ldc2_w -4059527652249553621
      // 230: lload 5
      // 232: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: athrow
      // 238: aload 25
      // 23a: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 23f: ifeq 2cf
      // 242: aload 25
      // 244: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 249: checkcast com/zelix/yn
      // 24c: astore 26
      // 24e: aload 26
      // 250: ldc2_w -4036699291789654819
      // 253: lload 5
      // 255: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: astore 27
      // 25c: lload 5
      // 25e: lconst_0
      // 25f: lcmp
      // 260: ifle 2bc
      // 263: aload 27
      // 265: ifnull 2ca
      // 268: aload 0
      // 269: aload 26
      // 26b: aload 3
      // 26c: lload 10
      // 26e: bipush 2
      // 26f: anewarray 458
      // 272: dup_x2
      // 273: dup_x2
      // 274: pop
      // 275: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 278: bipush 1
      // 279: swap
      // 27a: aastore
      // 27b: dup_x1
      // 27c: swap
      // 27d: bipush 0
      // 27e: swap
      // 27f: aastore
      // 280: ldc2_w -2490978530451474635
      // 283: lload 5
      // 285: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: lload 12
      // 28c: dup2_x1
      // 28d: pop2
      // 28e: aload 2
      // 28f: aload 7
      // 291: bipush 5
      // 292: anewarray 458
      // 295: dup_x1
      // 296: swap
      // 297: bipush 4
      // 298: swap
      // 299: aastore
      // 29a: dup_x1
      // 29b: swap
      // 29c: bipush 3
      // 29d: swap
      // 29e: aastore
      // 29f: dup_x1
      // 2a0: swap
      // 2a1: bipush 2
      // 2a2: swap
      // 2a3: aastore
      // 2a4: dup_x2
      // 2a5: dup_x2
      // 2a6: pop
      // 2a7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2aa: bipush 1
      // 2ab: swap
      // 2ac: aastore
      // 2ad: dup_x1
      // 2ae: swap
      // 2af: bipush 0
      // 2b0: swap
      // 2b1: aastore
      // 2b2: ldc2_w -2504788363867405072
      // 2b5: lload 5
      // 2b7: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: goto 2ca
      // 2bf: ldc2_w -4059527652249553621
      // 2c2: lload 5
      // 2c4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: athrow
      // 2ca: aload 22
      // 2cc: ifnull 238
      // 2cf: lload 5
      // 2d1: lconst_0
      // 2d2: lcmp
      // 2d3: ifle 242
      // 2d6: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean k(Object[] var1) {
      hz var2 = (hz)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 21542712774473L;
      hk[] var10000 = x44.a<"s">(-4830364616063442705L, var3);
      List var8 = x44.a<"o">(this, -6913713782683462832L, var3).M(var2, var5);
      boolean var9 = true;
      hk[] var7 = var10000;

      label101: {
         try {
            var21 = var8;
            if (var7 != null) {
               break label101;
            }

            if (var8 == null) {
               return var9;
            }
         } catch (gj var19) {
            throw x44.a<"s">(var19, -6513660305098320104L, var3);
         }

         var21 = var8;
      }

      try {
         boolean var22 = var21.isEmpty();
         if (var7 != null) {
            return var22;
         }

         if (var22) {
            return var9;
         }
      } catch (gj var13) {
         throw x44.a<"s">(var13, -6513660305098320104L, var3);
      }

      label95:
      for (hz var11 : var8) {
         List var12 = x44.a<"o">(this, -6913713782683462832L, var3).M(var11, var5);

         do {
            label89: {
               label109: {
                  label87: {
                     try {
                        var23 = var12;
                        if (var3 < 0L || var7 != null) {
                           break label87;
                        }

                        if (var12 == null) {
                           break label109;
                        }
                     } catch (gj var18) {
                        throw x44.a<"s">(var18, -6513660305098320104L, var3);
                     }

                     var23 = var12;
                  }

                  label77: {
                     try {
                        var24 = var23.isEmpty();
                        if (var7 != null) {
                           break label77;
                        }

                        if (var24) {
                           break label109;
                        }
                     } catch (gj var17) {
                        throw x44.a<"s">(var17, -6513660305098320104L, var3);
                     }

                     var24 = false;
                  }

                  var9 = var24;

                  try {
                     var10000 = var7;
                     if (var3 < 0L) {
                        break label89;
                     }

                     if (var7 == null) {
                        return var9;
                     }
                  } catch (gj var16) {
                     boolean var10001 = false;
                     throw x44.a<"s">(var16, -6513660305098320104L, var3);
                  }
               }

               try {
                  var10000 = var7;
               } catch (gj var15) {
                  boolean var27 = false;
                  throw x44.a<"s">(var15, -6513660305098320104L, var3);
               }
            }

            try {
               if (var10000 == null) {
                  continue label95;
               }
            } catch (gj var14) {
               boolean var28 = false;
               throw x44.a<"s">(var14, -6513660305098320104L, var3);
            }
         } while (var3 <= 0L);

         return var9;
      }

      return var9;
   }

   public Set e(Object[] param1) {
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
      // 004: checkcast com/zelix/ig
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/_zi.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 26783019350588
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 26783019350588
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 41347903164987
      // 02d: lxor
      // 02e: lstore 9
      // 030: dup2
      // 031: ldc2_w 4110860954330
      // 034: lxor
      // 035: dup2
      // 036: bipush 16
      // 038: lushr
      // 039: lstore 11
      // 03b: dup2
      // 03c: bipush 48
      // 03e: lshl
      // 03f: bipush 48
      // 041: lushr
      // 042: l2i
      // 043: istore 13
      // 045: pop2
      // 046: dup2
      // 047: ldc2_w 93368545879264
      // 04a: lxor
      // 04b: lstore 14
      // 04d: pop2
      // 04e: ldc2_w 2415388407527554461
      // 051: lload 2
      // 052: invokedynamic q (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: aload 4
      // 059: lload 5
      // 05b: invokevirtual com/zelix/ig.k (J)Ljava/lang/String;
      // 05e: astore 17
      // 060: astore 16
      // 062: lload 14
      // 064: bipush 1
      // 065: anewarray 458
      // 068: dup_x2
      // 069: dup_x2
      // 06a: pop
      // 06b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06e: bipush 0
      // 06f: swap
      // 070: aastore
      // 071: ldc2_w 2658400496439962920
      // 074: lload 2
      // 075: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: astore 18
      // 07c: aload 0
      // 07d: ldc2_w 4431467254508719650
      // 080: lload 2
      // 081: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: aload 4
      // 088: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 08b: lload 9
      // 08d: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 090: astore 19
      // 092: aload 19
      // 094: aload 16
      // 096: ifnonnull 0ab
      // 099: ifnull 14d
      // 09c: goto 0a9
      // 09f: ldc2_w 4100776475906001514
      // 0a2: lload 2
      // 0a3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aload 19
      // 0ab: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b0: astore 20
      // 0b2: aload 20
      // 0b4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b9: ifeq 14d
      // 0bc: aload 20
      // 0be: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c3: checkcast com/zelix/hz
      // 0c6: astore 21
      // 0c8: aload 21
      // 0ca: invokevirtual com/zelix/hz.b ()Z
      // 0cd: aload 16
      // 0cf: lload 2
      // 0d0: lconst_0
      // 0d1: lcmp
      // 0d2: iflt 11b
      // 0d5: ifnonnull 119
      // 0d8: ifeq 148
      // 0db: goto 0e8
      // 0de: ldc2_w 4100776475906001514
      // 0e1: lload 2
      // 0e2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: ldc2_w 2411151564637333240
      // 0ec: lload 2
      // 0ed: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/pk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: aload 21
      // 0f4: lload 7
      // 0f6: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 0f9: lload 11
      // 0fb: dup2_x1
      // 0fc: pop2
      // 0fd: iload 13
      // 0ff: i2s
      // 100: swap
      // 101: aload 17
      // 103: ldc2_w 2455070437843106301
      // 106: lload 2
      // 107: invokedynamic i (Ljava/lang/Object;JSLjava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: goto 119
      // 10f: ldc2_w 4100776475906001514
      // 112: lload 2
      // 113: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: athrow
      // 119: aload 16
      // 11b: ifnonnull 147
      // 11e: ifeq 148
      // 121: goto 12e
      // 124: ldc2_w 4100776475906001514
      // 127: lload 2
      // 128: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 18
      // 130: aload 21
      // 132: checkcast com/zelix/hy
      // 135: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 13a: goto 147
      // 13d: ldc2_w 4100776475906001514
      // 140: lload 2
      // 141: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: pop
      // 148: aload 16
      // 14a: ifnull 0b2
      // 14d: aload 18
      // 14f: areturn
   }

   public _zi(hz[] param1, pk param2, pd param3, _ur param4, _ub param5, _ug param6, ei param7, boolean param8, long param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_zi.a J
      // 003: lload 9
      // 005: lxor
      // 006: lstore 9
      // 008: lload 9
      // 00a: dup2
      // 00b: ldc2_w 51366606144384
      // 00e: lxor
      // 00f: lstore 11
      // 011: dup2
      // 012: ldc2_w 9554845601343
      // 015: lxor
      // 016: lstore 13
      // 018: dup2
      // 019: ldc2_w 14375450523921
      // 01c: lxor
      // 01d: lstore 15
      // 01f: dup2
      // 020: ldc2_w 9659566008002
      // 023: lxor
      // 024: lstore 17
      // 026: dup2
      // 027: ldc2_w 59460073466610
      // 02a: lxor
      // 02b: lstore 19
      // 02d: dup2
      // 02e: ldc2_w 95828608521696
      // 031: lxor
      // 032: lstore 21
      // 034: dup2
      // 035: ldc2_w 123626483020480
      // 038: lxor
      // 039: lstore 23
      // 03b: dup2
      // 03c: ldc2_w 41973612157597
      // 03f: lxor
      // 040: lstore 25
      // 042: dup2
      // 043: ldc2_w 10320968057156
      // 046: lxor
      // 047: lstore 27
      // 049: dup2
      // 04a: ldc2_w 76976489510781
      // 04d: lxor
      // 04e: lstore 29
      // 050: dup2
      // 051: ldc2_w 138852379962957
      // 054: lxor
      // 055: dup2
      // 056: bipush 32
      // 058: lushr
      // 059: l2i
      // 05a: istore 31
      // 05c: dup2
      // 05d: bipush 32
      // 05f: lshl
      // 060: bipush 48
      // 062: lushr
      // 063: l2i
      // 064: istore 32
      // 066: dup2
      // 067: bipush 48
      // 069: lshl
      // 06a: bipush 48
      // 06c: lushr
      // 06d: l2i
      // 06e: istore 33
      // 070: pop2
      // 071: dup2
      // 072: ldc2_w 116127853833098
      // 075: lxor
      // 076: dup2
      // 077: bipush 56
      // 079: lushr
      // 07a: l2i
      // 07b: istore 34
      // 07d: dup2
      // 07e: bipush 8
      // 080: lshl
      // 081: bipush 32
      // 083: lushr
      // 084: l2i
      // 085: istore 35
      // 087: dup2
      // 088: bipush 40
      // 08a: lshl
      // 08b: bipush 40
      // 08d: lushr
      // 08e: l2i
      // 08f: istore 36
      // 091: pop2
      // 092: dup2
      // 093: ldc2_w 33966470779878
      // 096: lxor
      // 097: lstore 37
      // 099: dup2
      // 09a: ldc2_w 121632974886770
      // 09d: lxor
      // 09e: lstore 39
      // 0a0: dup2
      // 0a1: ldc2_w 89293857960431
      // 0a4: lxor
      // 0a5: lstore 41
      // 0a7: dup2
      // 0a8: ldc2_w 121480623654164
      // 0ab: lxor
      // 0ac: lstore 43
      // 0ae: dup2
      // 0af: ldc2_w 125886114771338
      // 0b2: lxor
      // 0b3: lstore 45
      // 0b5: dup2
      // 0b6: ldc2_w 118088585458556
      // 0b9: lxor
      // 0ba: lstore 47
      // 0bc: dup2
      // 0bd: ldc2_w 34304667868385
      // 0c0: lxor
      // 0c1: lstore 49
      // 0c3: dup2
      // 0c4: ldc2_w 48223090109577
      // 0c7: lxor
      // 0c8: dup2
      // 0c9: bipush 32
      // 0cb: lushr
      // 0cc: l2i
      // 0cd: istore 51
      // 0cf: dup2
      // 0d0: bipush 32
      // 0d2: lshl
      // 0d3: bipush 48
      // 0d5: lushr
      // 0d6: l2i
      // 0d7: istore 52
      // 0d9: dup2
      // 0da: bipush 48
      // 0dc: lshl
      // 0dd: bipush 48
      // 0df: lushr
      // 0e0: l2i
      // 0e1: istore 53
      // 0e3: pop2
      // 0e4: dup2
      // 0e5: ldc2_w 126416246230436
      // 0e8: lxor
      // 0e9: lstore 54
      // 0eb: dup2
      // 0ec: ldc2_w 19718507885393
      // 0ef: lxor
      // 0f0: lstore 56
      // 0f2: dup2
      // 0f3: ldc2_w 106210756546035
      // 0f6: lxor
      // 0f7: lstore 58
      // 0f9: pop2
      // 0fa: ldc2_w -5437486145826248558
      // 0fd: lload 9
      // 0ff: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: aload 0
      // 105: invokespecial java/lang/Object.<init> ()V
      // 108: astore 60
      // 10a: aload 0
      // 10b: lload 41
      // 10d: bipush 1
      // 10e: anewarray 458
      // 111: dup_x2
      // 112: dup_x2
      // 113: pop
      // 114: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 117: bipush 0
      // 118: swap
      // 119: aastore
      // 11a: ldc2_w -5626248312778967001
      // 11d: lload 9
      // 11f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: ldc2_w -5708094373348665617
      // 127: lload 9
      // 129: invokedynamic u (Ljava/lang/Object;Ljava/util/Set;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: aload 0
      // 12f: aload 2
      // 130: putfield com/zelix/_zi.B Lcom/zelix/pk;
      // 133: aload 1
      // 134: astore 61
      // 136: aload 61
      // 138: arraylength
      // 139: istore 62
      // 13b: bipush 0
      // 13c: istore 63
      // 13e: iload 63
      // 140: iload 62
      // 142: if_icmpge 30a
      // 145: aload 61
      // 147: iload 63
      // 149: aaload
      // 14a: astore 64
      // 14c: aload 64
      // 14e: aload 60
      // 150: ifnonnull 1dc
      // 153: invokevirtual com/zelix/hz.b ()Z
      // 156: ifeq 1cc
      // 159: goto 167
      // 15c: ldc2_w -5915504880913850523
      // 15f: lload 9
      // 161: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: aload 64
      // 169: checkcast com/zelix/hy
      // 16c: astore 65
      // 16e: aload 2
      // 16f: lload 37
      // 171: aload 65
      // 173: ldc2_w -5503061986389024377
      // 176: lload 9
      // 178: invokedynamic o (JJ)Lcom/zelix/_fz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: bipush 3
      // 17e: anewarray 458
      // 181: dup_x1
      // 182: swap
      // 183: bipush 2
      // 184: swap
      // 185: aastore
      // 186: dup_x1
      // 187: swap
      // 188: bipush 1
      // 189: swap
      // 18a: aastore
      // 18b: dup_x2
      // 18c: dup_x2
      // 18d: pop
      // 18e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 191: bipush 0
      // 192: swap
      // 193: aastore
      // 194: ldc2_w -5716910723932602072
      // 197: lload 9
      // 199: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ig; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: astore 66
      // 1a0: lload 9
      // 1a2: lconst_0
      // 1a3: lcmp
      // 1a4: ifle 1c0
      // 1a7: aload 66
      // 1a9: ifnull 1c0
      // 1ac: aload 0
      // 1ad: ldc2_w -5708094373348665617
      // 1b0: lload 9
      // 1b2: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: aload 66
      // 1b9: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1be: istore 67
      // 1c0: lload 9
      // 1c2: lconst_0
      // 1c3: lcmp
      // 1c4: iflt 246
      // 1c7: aload 60
      // 1c9: ifnull 246
      // 1cc: aload 64
      // 1ce: goto 1dc
      // 1d1: ldc2_w -5915504880913850523
      // 1d4: lload 9
      // 1d6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: checkcast com/zelix/hu
      // 1df: astore 65
      // 1e1: aload 65
      // 1e3: lload 25
      // 1e5: aload 2
      // 1e6: aload 6
      // 1e8: aload 7
      // 1ea: bipush 4
      // 1eb: anewarray 458
      // 1ee: dup_x1
      // 1ef: swap
      // 1f0: bipush 3
      // 1f1: swap
      // 1f2: aastore
      // 1f3: dup_x1
      // 1f4: swap
      // 1f5: bipush 2
      // 1f6: swap
      // 1f7: aastore
      // 1f8: dup_x1
      // 1f9: swap
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
      // 206: ldc2_w -5812267158600786763
      // 209: lload 9
      // 20b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: aload 65
      // 212: lload 45
      // 214: ldc2_w -5503061986389024377
      // 217: lload 9
      // 219: invokedynamic o (JJ)Lcom/zelix/_fz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21e: invokevirtual com/zelix/hu.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // 221: checkcast com/zelix/in
      // 224: astore 66
      // 226: lload 9
      // 228: lconst_0
      // 229: lcmp
      // 22a: iflt 246
      // 22d: aload 66
      // 22f: ifnull 246
      // 232: aload 0
      // 233: ldc2_w -5708094373348665617
      // 236: lload 9
      // 238: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: aload 66
      // 23f: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 244: istore 67
      // 246: aload 64
      // 248: aload 60
      // 24a: lload 9
      // 24c: lconst_0
      // 24d: lcmp
      // 24e: ifle 289
      // 251: ifnonnull 27a
      // 254: lload 43
      // 256: invokevirtual com/zelix/hz.B (J)Z
      // 259: ifeq 2fb
      // 25c: goto 26a
      // 25f: ldc2_w -5915504880913850523
      // 262: lload 9
      // 264: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: aload 64
      // 26c: goto 27a
      // 26f: ldc2_w -5915504880913850523
      // 272: lload 9
      // 274: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: athrow
      // 27a: lload 47
      // 27c: bipush 1
      // 27d: anewarray 458
      // 280: dup_x2
      // 281: dup_x2
      // 282: pop
      // 283: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 286: bipush 0
      // 287: swap
      // 288: aastore
      // 289: ldc2_w -6265735691759947959
      // 28c: lload 9
      // 28e: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 298: astore 65
      // 29a: aload 65
      // 29c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a1: ifeq 2fb
      // 2a4: aload 65
      // 2a6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2ab: checkcast com/zelix/hz
      // 2ae: astore 66
      // 2b0: aload 66
      // 2b2: lload 45
      // 2b4: ldc2_w -5503061986389024377
      // 2b7: lload 9
      // 2b9: invokedynamic o (JJ)Lcom/zelix/_fz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: invokevirtual com/zelix/hz.s (JLcom/zelix/_fz;)Lcom/zelix/iu;
      // 2c1: astore 67
      // 2c3: aload 60
      // 2c5: lload 9
      // 2c7: lconst_0
      // 2c8: lcmp
      // 2c9: iflt 307
      // 2cc: ifnonnull 305
      // 2cf: aload 67
      // 2d1: ifnull 2f6
      // 2d4: goto 2e2
      // 2d7: ldc2_w -5915504880913850523
      // 2da: lload 9
      // 2dc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: athrow
      // 2e2: aload 0
      // 2e3: ldc2_w -5708094373348665617
      // 2e6: lload 9
      // 2e8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: aload 67
      // 2ef: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2f4: istore 68
      // 2f6: aload 60
      // 2f8: ifnull 29a
      // 2fb: lload 9
      // 2fd: lconst_0
      // 2fe: lcmp
      // 2ff: ifle 305
      // 302: iinc 63 1
      // 305: aload 60
      // 307: ifnull 13e
      // 30a: new com/zelix/w
      // 30d: dup
      // 30e: aload 0
      // 30f: ldc2_w -5708094373348665617
      // 312: lload 9
      // 314: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: invokeinterface java/util/Set.size ()I 1
      // 31e: iload 34
      // 320: i2b
      // 321: iload 35
      // 323: iload 36
      // 325: invokespecial com/zelix/w.<init> (IBII)V
      // 328: astore 61
      // 32a: new com/zelix/wm
      // 32d: dup
      // 32e: iload 51
      // 330: iload 52
      // 332: aload 1
      // 333: iload 53
      // 335: invokespecial com/zelix/wm.<init> (II[Ljava/lang/Object;I)V
      // 338: lload 15
      // 33a: bipush 2
      // 33b: anewarray 458
      // 33e: dup_x2
      // 33f: dup_x2
      // 340: pop
      // 341: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 344: bipush 1
      // 345: swap
      // 346: aastore
      // 347: dup_x1
      // 348: swap
      // 349: bipush 0
      // 34a: swap
      // 34b: aastore
      // 34c: ldc2_w -5251185596271895173
      // 34f: lload 9
      // 351: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 356: astore 62
      // 358: new com/zelix/w
      // 35b: dup
      // 35c: aload 62
      // 35e: invokeinterface java/util/Set.size ()I 1
      // 363: iload 34
      // 365: i2b
      // 366: iload 35
      // 368: iload 36
      // 36a: invokespecial com/zelix/w.<init> (IBII)V
      // 36d: astore 63
      // 36f: aload 0
      // 370: ldc2_w -5708094373348665617
      // 373: lload 9
      // 375: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 37f: astore 64
      // 381: aload 64
      // 383: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 388: ifeq 456
      // 38b: aload 64
      // 38d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 392: checkcast com/zelix/iu
      // 395: astore 65
      // 397: aconst_null
      // 398: astore 66
      // 39a: aconst_null
      // 39b: lload 9
      // 39d: lconst_0
      // 39e: lcmp
      // 39f: ifle 498
      // 3a2: astore 67
      // 3a4: aload 60
      // 3a6: ifnonnull 497
      // 3a9: aload 65
      // 3ab: invokevirtual com/zelix/iu.k ()Z
      // 3ae: ifeq 40b
      // 3b1: goto 3bf
      // 3b4: ldc2_w -5915504880913850523
      // 3b7: lload 9
      // 3b9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: athrow
      // 3bf: aload 2
      // 3c0: aload 65
      // 3c2: checkcast com/zelix/ig
      // 3c5: lload 54
      // 3c7: bipush 2
      // 3c8: anewarray 458
      // 3cb: dup_x2
      // 3cc: dup_x2
      // 3cd: pop
      // 3ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d1: bipush 1
      // 3d2: swap
      // 3d3: aastore
      // 3d4: dup_x1
      // 3d5: swap
      // 3d6: bipush 0
      // 3d7: swap
      // 3d8: aastore
      // 3d9: ldc2_w -5757207881135737414
      // 3dc: lload 9
      // 3de: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: astore 66
      // 3e5: aload 2
      // 3e6: aload 65
      // 3e8: checkcast com/zelix/ig
      // 3eb: lload 39
      // 3ed: bipush 2
      // 3ee: anewarray 458
      // 3f1: dup_x2
      // 3f2: dup_x2
      // 3f3: pop
      // 3f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f7: bipush 1
      // 3f8: swap
      // 3f9: aastore
      // 3fa: dup_x1
      // 3fb: swap
      // 3fc: bipush 0
      // 3fd: swap
      // 3fe: aastore
      // 3ff: ldc2_w -5447923148598708574
      // 402: lload 9
      // 404: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 409: astore 67
      // 40b: aload 0
      // 40c: aload 65
      // 40e: aload 67
      // 410: lload 49
      // 412: aload 66
      // 414: aload 62
      // 416: aload 63
      // 418: aload 61
      // 41a: bipush 7
      // 41c: anewarray 458
      // 41f: dup_x1
      // 420: swap
      // 421: bipush 6
      // 423: swap
      // 424: aastore
      // 425: dup_x1
      // 426: swap
      // 427: bipush 5
      // 428: swap
      // 429: aastore
      // 42a: dup_x1
      // 42b: swap
      // 42c: bipush 4
      // 42d: swap
      // 42e: aastore
      // 42f: dup_x1
      // 430: swap
      // 431: bipush 3
      // 432: swap
      // 433: aastore
      // 434: dup_x2
      // 435: dup_x2
      // 436: pop
      // 437: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43a: bipush 2
      // 43b: swap
      // 43c: aastore
      // 43d: dup_x1
      // 43e: swap
      // 43f: bipush 1
      // 440: swap
      // 441: aastore
      // 442: dup_x1
      // 443: swap
      // 444: bipush 0
      // 445: swap
      // 446: aastore
      // 447: ldc2_w -5633324880376386249
      // 44a: lload 9
      // 44c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 451: aload 60
      // 453: ifnull 381
      // 456: aload 0
      // 457: aload 63
      // 459: lload 27
      // 45b: bipush 1
      // 45c: anewarray 458
      // 45f: dup_x2
      // 460: dup_x2
      // 461: pop
      // 462: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 465: bipush 0
      // 466: swap
      // 467: aastore
      // 468: ldc2_w -5530720590315457018
      // 46b: lload 9
      // 46d: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 472: putfield com/zelix/_zi.y Lcom/zelix/_y4;
      // 475: aload 63
      // 477: lload 13
      // 479: bipush 1
      // 47a: anewarray 458
      // 47d: dup_x2
      // 47e: dup_x2
      // 47f: pop
      // 480: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 483: bipush 0
      // 484: swap
      // 485: aastore
      // 486: ldc2_w -5636836436628374608
      // 489: lload 9
      // 48b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 490: lload 9
      // 492: lconst_0
      // 493: lcmp
      // 494: iflt 497
      // 497: aconst_null
      // 498: astore 63
      // 49a: aload 0
      // 49b: new com/zelix/_y4
      // 49e: dup
      // 49f: aload 0
      // 4a0: ldc2_w -5708094373348665617
      // 4a3: lload 9
      // 4a5: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4aa: invokeinterface java/util/Set.size ()I 1
      // 4af: lload 56
      // 4b1: dup2_x1
      // 4b2: pop2
      // 4b3: invokespecial com/zelix/_y4.<init> (JI)V
      // 4b6: putfield com/zelix/_zi.L Lcom/zelix/_y4;
      // 4b9: aload 0
      // 4ba: ldc2_w -5290420381081247531
      // 4bd: lload 9
      // 4bf: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c4: iload 31
      // 4c6: iload 32
      // 4c8: i2s
      // 4c9: iload 33
      // 4cb: i2s
      // 4cc: invokevirtual com/zelix/_y4.U (ISS)Ljava/util/Set;
      // 4cf: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 4d4: astore 64
      // 4d6: aload 64
      // 4d8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4dd: ifeq 550
      // 4e0: aload 64
      // 4e2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4e7: checkcast java/util/Map$Entry
      // 4ea: astore 65
      // 4ec: aload 65
      // 4ee: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 4f3: checkcast java/util/List
      // 4f6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4fb: astore 66
      // 4fd: aload 66
      // 4ff: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 504: ifeq 544
      // 507: aload 66
      // 509: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 50e: checkcast com/zelix/iu
      // 511: astore 67
      // 513: aload 65
      // 515: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 51a: checkcast com/zelix/iu
      // 51d: astore 68
      // 51f: aload 0
      // 520: ldc2_w -5957507209150996840
      // 523: lload 9
      // 525: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52a: aload 67
      // 52c: aload 68
      // 52e: lload 17
      // 530: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 533: aload 60
      // 535: ifnonnull 4d6
      // 538: aload 60
      // 53a: lload 9
      // 53c: lconst_0
      // 53d: lcmp
      // 53e: ifle 4f3
      // 541: ifnull 4fd
      // 544: aload 60
      // 546: lload 9
      // 548: lconst_0
      // 549: lcmp
      // 54a: ifle 50e
      // 54d: ifnull 4d6
      // 550: new com/zelix/w
      // 553: dup
      // 554: aload 0
      // 555: ldc2_w -5708094373348665617
      // 558: lload 9
      // 55a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55f: invokeinterface java/util/Set.size ()I 1
      // 564: iload 34
      // 566: i2b
      // 567: iload 35
      // 569: iload 36
      // 56b: invokespecial com/zelix/w.<init> (IBII)V
      // 56e: lload 9
      // 570: lconst_0
      // 571: lcmp
      // 572: iflt 4e7
      // 575: astore 64
      // 577: aload 3
      // 578: lload 23
      // 57a: bipush 1
      // 57b: anewarray 458
      // 57e: dup_x2
      // 57f: dup_x2
      // 580: pop
      // 581: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 584: bipush 0
      // 585: swap
      // 586: aastore
      // 587: ldc2_w -5560560441464107941
      // 58a: lload 9
      // 58c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 591: astore 65
      // 593: aload 65
      // 595: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 59a: astore 66
      // 59c: aload 66
      // 59e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5a3: ifeq 627
      // 5a6: aload 66
      // 5a8: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5ad: checkcast com/zelix/yn
      // 5b0: astore 67
      // 5b2: aload 0
      // 5b3: aload 67
      // 5b5: lload 41
      // 5b7: bipush 1
      // 5b8: anewarray 458
      // 5bb: dup_x2
      // 5bc: dup_x2
      // 5bd: pop
      // 5be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c1: bipush 0
      // 5c2: swap
      // 5c3: aastore
      // 5c4: ldc2_w -5626248312778967001
      // 5c7: lload 9
      // 5c9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ce: lload 19
      // 5d0: dup2_x1
      // 5d1: pop2
      // 5d2: aload 61
      // 5d4: aload 64
      // 5d6: bipush 5
      // 5d7: anewarray 458
      // 5da: dup_x1
      // 5db: swap
      // 5dc: bipush 4
      // 5dd: swap
      // 5de: aastore
      // 5df: dup_x1
      // 5e0: swap
      // 5e1: bipush 3
      // 5e2: swap
      // 5e3: aastore
      // 5e4: dup_x1
      // 5e5: swap
      // 5e6: bipush 2
      // 5e7: swap
      // 5e8: aastore
      // 5e9: dup_x2
      // 5ea: dup_x2
      // 5eb: pop
      // 5ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5ef: bipush 1
      // 5f0: swap
      // 5f1: aastore
      // 5f2: dup_x1
      // 5f3: swap
      // 5f4: bipush 0
      // 5f5: swap
      // 5f6: aastore
      // 5f7: ldc2_w -5227699512047915330
      // 5fa: lload 9
      // 5fc: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 601: aload 60
      // 603: lload 9
      // 605: lconst_0
      // 606: lcmp
      // 607: ifle 60f
      // 60a: ifnonnull 661
      // 60d: aload 60
      // 60f: ifnull 59c
      // 612: lload 9
      // 614: lconst_0
      // 615: lcmp
      // 616: iflt 601
      // 619: goto 627
      // 61c: ldc2_w -5915504880913850523
      // 61f: lload 9
      // 621: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 626: athrow
      // 627: aload 0
      // 628: aload 64
      // 62a: lload 27
      // 62c: bipush 1
      // 62d: anewarray 458
      // 630: dup_x2
      // 631: dup_x2
      // 632: pop
      // 633: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 636: bipush 0
      // 637: swap
      // 638: aastore
      // 639: ldc2_w -5530720590315457018
      // 63c: lload 9
      // 63e: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 643: putfield com/zelix/_zi.r Lcom/zelix/_y4;
      // 646: aload 61
      // 648: lload 13
      // 64a: bipush 1
      // 64b: anewarray 458
      // 64e: dup_x2
      // 64f: dup_x2
      // 650: pop
      // 651: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 654: bipush 0
      // 655: swap
      // 656: aastore
      // 657: ldc2_w -5636836436628374608
      // 65a: lload 9
      // 65c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 661: aconst_null
      // 662: astore 61
      // 664: aload 64
      // 666: lload 13
      // 668: bipush 1
      // 669: anewarray 458
      // 66c: dup_x2
      // 66d: dup_x2
      // 66e: pop
      // 66f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 672: bipush 0
      // 673: swap
      // 674: aastore
      // 675: ldc2_w -5636836436628374608
      // 678: lload 9
      // 67a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67f: aconst_null
      // 680: astore 64
      // 682: aload 0
      // 683: ldc2_w -6309334031596446931
      // 686: lload 9
      // 688: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68d: iload 31
      // 68f: iload 32
      // 691: i2s
      // 692: iload 33
      // 694: i2s
      // 695: invokevirtual com/zelix/_y4.U (ISS)Ljava/util/Set;
      // 698: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 69d: astore 66
      // 69f: aload 66
      // 6a1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6a6: ifeq 79c
      // 6a9: aload 66
      // 6ab: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6b0: checkcast java/util/Map$Entry
      // 6b3: astore 67
      // 6b5: aload 67
      // 6b7: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 6bc: checkcast com/zelix/hz
      // 6bf: astore 68
      // 6c1: aload 67
      // 6c3: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 6c8: checkcast java/util/List
      // 6cb: astore 69
      // 6cd: aload 68
      // 6cf: lload 11
      // 6d1: invokevirtual com/zelix/hz.n (J)Z
      // 6d4: aload 60
      // 6d6: lload 9
      // 6d8: lconst_0
      // 6d9: lcmp
      // 6da: ifle 7a7
      // 6dd: ifnonnull 7a5
      // 6e0: aload 60
      // 6e2: ifnonnull 796
      // 6e5: goto 6f3
      // 6e8: ldc2_w -5915504880913850523
      // 6eb: lload 9
      // 6ed: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f2: athrow
      // 6f3: ifeq 77a
      // 6f6: goto 704
      // 6f9: ldc2_w -5915504880913850523
      // 6fc: lload 9
      // 6fe: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 703: athrow
      // 704: aload 68
      // 706: lload 29
      // 708: bipush 1
      // 709: anewarray 458
      // 70c: dup_x2
      // 70d: dup_x2
      // 70e: pop
      // 70f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 712: bipush 0
      // 713: swap
      // 714: aastore
      // 715: ldc2_w -5319328673199333040
      // 718: lload 9
      // 71a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71f: astore 70
      // 721: aload 70
      // 723: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 728: astore 71
      // 72a: aload 71
      // 72c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 731: ifeq 775
      // 734: aload 71
      // 736: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 73b: checkcast com/zelix/hz
      // 73e: astore 72
      // 740: aload 69
      // 742: aload 72
      // 744: ldc2_w -5902611528772321081
      // 747: lload 9
      // 749: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74e: pop
      // 74f: aload 60
      // 751: lload 9
      // 753: lconst_0
      // 754: lcmp
      // 755: ifle 799
      // 758: ifnonnull 797
      // 75b: aload 60
      // 75d: ifnull 72a
      // 760: lload 9
      // 762: lconst_0
      // 763: lcmp
      // 764: iflt 74f
      // 767: goto 775
      // 76a: ldc2_w -5915504880913850523
      // 76d: lload 9
      // 76f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 774: athrow
      // 775: aload 60
      // 777: ifnull 797
      // 77a: aload 69
      // 77c: aload 68
      // 77e: ldc2_w -5902611528772321081
      // 781: lload 9
      // 783: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 788: goto 796
      // 78b: ldc2_w -5915504880913850523
      // 78e: lload 9
      // 790: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 795: athrow
      // 796: pop
      // 797: aload 60
      // 799: ifnull 69f
      // 79c: lload 9
      // 79e: lconst_0
      // 79f: lcmp
      // 7a0: iflt 88c
      // 7a3: iload 8
      // 7a5: aload 60
      // 7a7: lload 9
      // 7a9: lconst_0
      // 7aa: lcmp
      // 7ab: ifle 7e2
      // 7ae: ifnonnull 7e0
      // 7b1: ifeq 88c
      // 7b4: goto 7c2
      // 7b7: ldc2_w -5915504880913850523
      // 7ba: lload 9
      // 7bc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c1: athrow
      // 7c2: aload 0
      // 7c3: ldc2_w -5708094373348665617
      // 7c6: lload 9
      // 7c8: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7cd: invokeinterface java/util/Set.size ()I 1
      // 7d2: goto 7e0
      // 7d5: ldc2_w -5915504880913850523
      // 7d8: lload 9
      // 7da: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7df: athrow
      // 7e0: aload 60
      // 7e2: ifnonnull 82a
      // 7e5: ifle 88c
      // 7e8: goto 7f6
      // 7eb: ldc2_w -5915504880913850523
      // 7ee: lload 9
      // 7f0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f5: athrow
      // 7f6: aload 4
      // 7f8: aload 60
      // 7fa: lload 9
      // 7fc: lconst_0
      // 7fd: lcmp
      // 7fe: iflt 83e
      // 801: ifnonnull 82f
      // 804: goto 812
      // 807: ldc2_w -5915504880913850523
      // 80a: lload 9
      // 80c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 811: athrow
      // 812: ldc2_w -5769863943394124162
      // 815: lload 9
      // 817: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81c: goto 82a
      // 81f: ldc2_w -5915504880913850523
      // 822: lload 9
      // 824: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 829: athrow
      // 82a: ifeq 88c
      // 82d: aload 4
      // 82f: lload 21
      // 831: bipush 1
      // 832: anewarray 458
      // 835: dup_x2
      // 836: dup_x2
      // 837: pop
      // 838: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83b: bipush 0
      // 83c: swap
      // 83d: aastore
      // 83e: ldc2_w -6315672382507233430
      // 841: lload 9
      // 843: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 848: astore 66
      // 84a: lload 9
      // 84c: lconst_0
      // 84d: lcmp
      // 84e: ifle 87e
      // 851: aload 66
      // 853: ifnull 88c
      // 856: aload 0
      // 857: aload 66
      // 859: aload 5
      // 85b: lload 58
      // 85d: bipush 3
      // 85e: anewarray 458
      // 861: dup_x2
      // 862: dup_x2
      // 863: pop
      // 864: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 867: bipush 2
      // 868: swap
      // 869: aastore
      // 86a: dup_x1
      // 86b: swap
      // 86c: bipush 1
      // 86d: swap
      // 86e: aastore
      // 86f: dup_x1
      // 870: swap
      // 871: bipush 0
      // 872: swap
      // 873: aastore
      // 874: ldc2_w -5940265370128681904
      // 877: lload 9
      // 879: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87e: goto 88c
      // 881: ldc2_w -5915504880913850523
      // 884: lload 9
      // 886: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88b: athrow
      // 88c: return
   }

   static {
      long var11 = a ^ 58761819371414L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[7];
      int var18 = 0;
      String var17 = "\u0084\u0087OÌ\u0099\u008aà\u0014'¦Á`|o\u0019$BT\u000b¦\\0 á\u000eq¢\u001a£{±\u00adÚ (Àú¹ä.¯ê\u0082G\u001b\u001cë\u001d,\u0087÷\u0014õwÝ±Ê»\u008a\u0016Ì®¿¬Í+\u008b+Ç\u0004\u001c\u009d³Ç\u009b\u009bI\u0017\u009fh\u0010³%Ä2A\u0003Ã\u0099\u0007-\u0007ÅÕ\u007f¿¨ R\u0080ÉÖ\u009aí6ô\u0005¹Êd4Z·\u0013\u000b\tÜR\u001e\u0012\u0090Ø\u0080\u001db\u000f\u0088n\u009d\u0005\u0010&\u001bº\u009bÖvAwÈ\u0098®okb\u0016£\u0010\\a\u001dPÚÆ\b\u008aÜ?¼wemåÁ";
      int var19 = "\u0084\u0087OÌ\u0099\u008aà\u0014'¦Á`|o\u0019$BT\u000b¦\\0 á\u000eq¢\u001a£{±\u00adÚ (Àú¹ä.¯ê\u0082G\u001b\u001cë\u001d,\u0087÷\u0014õwÝ±Ê»\u008a\u0016Ì®¿¬Í+\u008b+Ç\u0004\u001c\u009d³Ç\u009b\u009bI\u0017\u009fh\u0010³%Ä2A\u0003Ã\u0099\u0007-\u0007ÅÕ\u007f¿¨ R\u0080ÉÖ\u009aí6ô\u0005¹Êd4Z·\u0013\u000b\tÜR\u001e\u0012\u0090Ø\u0080\u001db\u000f\u0088n\u009d\u0005\u0010&\u001bº\u009bÖvAwÈ\u0098®okb\u0016£\u0010\\a\u001dPÚÆ\b\u008aÜ?¼wemåÁ"
         .length();
      char var16 = 'P';
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
                     c = new String[7];
                     g = new HashMap(13);
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
                     String var4 = "iü\u0081´\u00888wé\u009d\u001eòj\u009fî7\u0016";
                     int var5 = "iü\u0081´\u00888wé\u009d\u001eòj\u009fî7\u0016".length();
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
                     f = new Integer[2];
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

                  var17 = "£2Ã\u00ad\u0014Å\u0099\u0086\u000fe²¡Ü*\u001eq¦4\u000e5rb×!ï¿KÔ\nEKh\u0089r´æ\u0010\u0017ä}ah\u008a\u001e¤ÃÉy\u0017\u0005Py}µrj[§2~Y³PO\b±;M\u0094\u0095¥G\u0014×\u00ady¶³½\u0019\u0081-{ ±Ì(FPlÎB\u0093-\u0094\u0094â;üÀ;\"àµJ¾\u0018Ô}¨QÐ´À?UÐrûÛÕ:\u009cµ¦j7·\u001b\\IoÃ`µl\u009f\u0019.U\u001bTÂ\u000eòÂ\u0084îòþ\f\u0099;`\u0007aL|¯\u009e|?Ô\u0091ÜÝ\u00ad7Á";
                  var19 = "£2Ã\u00ad\u0014Å\u0099\u0086\u000fe²¡Ü*\u001eq¦4\u000e5rb×!ï¿KÔ\nEKh\u0089r´æ\u0010\u0017ä}ah\u008a\u001e¤ÃÉy\u0017\u0005Py}µrj[§2~Y³PO\b±;M\u0094\u0095¥G\u0014×\u00ady¶³½\u0019\u0081-{ ±Ì(FPlÎB\u0093-\u0094\u0094â;üÀ;\"àµJ¾\u0018Ô}¨QÐ´À?UÐrûÛÕ:\u009cµ¦j7·\u001b\\IoÃ`µl\u009f\u0019.U\u001bTÂ\u000eòÂ\u0084îòþ\f\u0099;`\u0007aL|¯\u009e|?Ô\u0091ÜÝ\u00ad7Á"
                     .length();
                  var16 = 'X';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10062;
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
            throw new RuntimeException("com/zelix/_zi", var10);
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
         throw new RuntimeException("com/zelix/_zi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12132;
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
            throw new RuntimeException("com/zelix/_zi", var14);
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
         throw new RuntimeException("com/zelix/_zi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
