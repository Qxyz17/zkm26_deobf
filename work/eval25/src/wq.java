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

public class wq {
   private final _ov F;
   private final String U;
   private final yg u;
   private static boolean[][][] l;
   private final be f;
   private final _kz[] K;
   private static final long a = ess.a(5568536082135927303L, -8680831151839763332L, MethodHandles.lookup().lookupClass()).a(60738616167546L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;

   private static boolean[][] D(Object[] param0) {
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
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 2
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast [Z
      // 01c: astore 1
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast [[Z
      // 023: astore 3
      // 024: pop
      // 025: getstatic com/zelix/wq.a J
      // 028: lload 4
      // 02a: lxor
      // 02b: lstore 4
      // 02d: ldc2_w -2248642535185183778
      // 030: lload 4
      // 032: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: aload 3
      // 038: astore 7
      // 03a: istore 6
      // 03c: bipush 0
      // 03d: istore 8
      // 03f: iload 8
      // 041: aload 1
      // 042: arraylength
      // 043: if_icmpge 173
      // 046: aload 1
      // 047: iload 8
      // 049: baload
      // 04a: iload 6
      // 04c: lload 4
      // 04e: lconst_0
      // 04f: lcmp
      // 050: ifle 07b
      // 053: ifne 07a
      // 056: ifeq 16b
      // 059: goto 067
      // 05c: ldc2_w -2125617234698056887
      // 05f: lload 4
      // 061: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: aload 7
      // 069: arraylength
      // 06a: bipush 2
      // 06b: idiv
      // 06c: goto 07a
      // 06f: ldc2_w -2125617234698056887
      // 072: lload 4
      // 074: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: iload 2
      // 07b: multianewarray 303 2
      // 07f: astore 9
      // 081: ldc2_w 2.0
      // 084: iload 8
      // 086: bipush 1
      // 087: iadd
      // 088: i2d
      // 089: ldc2_w -336203404283505103
      // 08c: lload 4
      // 08e: invokedynamic v (DDJJ)D bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: d2i
      // 094: istore 10
      // 096: aload 3
      // 097: arraylength
      // 098: iload 10
      // 09a: idiv
      // 09b: istore 11
      // 09d: bipush 1
      // 09e: istore 12
      // 0a0: bipush 0
      // 0a1: istore 13
      // 0a3: bipush 1
      // 0a4: istore 14
      // 0a6: bipush 0
      // 0a7: istore 15
      // 0a9: iload 15
      // 0ab: aload 7
      // 0ad: arraylength
      // 0ae: if_icmpge 160
      // 0b1: iload 12
      // 0b3: iload 6
      // 0b5: ifne 041
      // 0b8: iload 6
      // 0ba: lload 4
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: ifle 04c
      // 0c1: lload 4
      // 0c3: lconst_0
      // 0c4: lcmp
      // 0c5: iflt 11e
      // 0c8: ifne 11c
      // 0cb: ifeq 0fd
      // 0ce: goto 0dc
      // 0d1: ldc2_w -2125617234698056887
      // 0d4: lload 4
      // 0d6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 7
      // 0de: iload 15
      // 0e0: aaload
      // 0e1: bipush 0
      // 0e2: aload 9
      // 0e4: iload 13
      // 0e6: aaload
      // 0e7: bipush 0
      // 0e8: iload 2
      // 0e9: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0ec: iinc 13 1
      // 0ef: goto 0fd
      // 0f2: ldc2_w -2125617234698056887
      // 0f5: lload 4
      // 0f7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: iinc 14 1
      // 100: iload 6
      // 102: lload 4
      // 104: lconst_0
      // 105: lcmp
      // 106: ifle 15d
      // 109: ifne 15b
      // 10c: iload 14
      // 10e: goto 11c
      // 111: ldc2_w -2125617234698056887
      // 114: lload 4
      // 116: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: iload 11
      // 11e: lload 4
      // 120: lconst_0
      // 121: lcmp
      // 122: ifle 12c
      // 125: if_icmple 158
      // 128: iload 12
      // 12a: iload 6
      // 12c: ifne 14f
      // 12f: goto 13d
      // 132: ldc2_w -2125617234698056887
      // 135: lload 4
      // 137: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: ifne 152
      // 140: goto 14e
      // 143: ldc2_w -2125617234698056887
      // 146: lload 4
      // 148: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: bipush 1
      // 14f: goto 153
      // 152: bipush 0
      // 153: istore 12
      // 155: bipush 1
      // 156: istore 14
      // 158: iinc 15 1
      // 15b: iload 6
      // 15d: ifeq 0a9
      // 160: aload 9
      // 162: lload 4
      // 164: lconst_0
      // 165: lcmp
      // 166: iflt 17c
      // 169: astore 7
      // 16b: iinc 8 1
      // 16e: iload 6
      // 170: ifeq 03f
      // 173: aload 7
      // 175: lload 4
      // 177: lconst_0
      // 178: lcmp
      // 179: iflt 07f
      // 17c: areturn
   }

   public hq[] d(Object[] param1) {
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
      // 004: checkcast com/zelix/h6
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_8c
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 9
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/util/List
      // 01e: astore 2
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Boolean
      // 025: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 028: istore 4
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/lang/Long
      // 030: invokevirtual java/lang/Long.longValue ()J
      // 033: lstore 6
      // 035: dup
      // 036: bipush 6
      // 038: aaload
      // 039: checkcast java/lang/Boolean
      // 03c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03f: istore 5
      // 041: pop
      // 042: getstatic com/zelix/wq.a J
      // 045: lload 6
      // 047: lxor
      // 048: lstore 6
      // 04a: lload 6
      // 04c: dup2
      // 04d: ldc2_w 39704619184360
      // 050: lxor
      // 051: dup2
      // 052: bipush 48
      // 054: lushr
      // 055: l2i
      // 056: istore 10
      // 058: dup2
      // 059: bipush 16
      // 05b: lshl
      // 05c: bipush 32
      // 05e: lushr
      // 05f: l2i
      // 060: istore 11
      // 062: dup2
      // 063: bipush 48
      // 065: lshl
      // 066: bipush 48
      // 068: lushr
      // 069: l2i
      // 06a: istore 12
      // 06c: pop2
      // 06d: dup2
      // 06e: ldc2_w 129752975090456
      // 071: lxor
      // 072: lstore 13
      // 074: dup2
      // 075: ldc2_w 79490137618123
      // 078: lxor
      // 079: lstore 15
      // 07b: dup2
      // 07c: ldc2_w 122040592960123
      // 07f: lxor
      // 080: lstore 17
      // 082: dup2
      // 083: ldc2_w 83456894230867
      // 086: lxor
      // 087: lstore 19
      // 089: dup2
      // 08a: ldc2_w 135705433554821
      // 08d: lxor
      // 08e: lstore 21
      // 090: dup2
      // 091: ldc2_w 68227495081007
      // 094: lxor
      // 095: lstore 23
      // 097: dup2
      // 098: ldc2_w 45712780108545
      // 09b: lxor
      // 09c: lstore 25
      // 09e: dup2
      // 09f: ldc2_w 2966642150723
      // 0a2: lxor
      // 0a3: lstore 27
      // 0a5: dup2
      // 0a6: ldc2_w 9008743295198
      // 0a9: lxor
      // 0aa: lstore 29
      // 0ac: pop2
      // 0ad: ldc2_w -6019074637630000619
      // 0b0: lload 6
      // 0b2: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: aload 0
      // 0b8: ldc2_w -5613656549846516092
      // 0bb: lload 6
      // 0bd: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/yg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: lload 15
      // 0c4: bipush 1
      // 0c5: anewarray 298
      // 0c8: dup_x2
      // 0c9: dup_x2
      // 0ca: pop
      // 0cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ce: bipush 0
      // 0cf: swap
      // 0d0: aastore
      // 0d1: ldc2_w -6329711720408433138
      // 0d4: lload 6
      // 0d6: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: astore 32
      // 0dd: aload 32
      // 0df: arraylength
      // 0e0: istore 33
      // 0e2: lload 19
      // 0e4: bipush 1
      // 0e5: anewarray 298
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 0
      // 0ef: swap
      // 0f0: aastore
      // 0f1: ldc2_w -6003327448823870784
      // 0f4: lload 6
      // 0f6: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: astore 34
      // 0fd: istore 31
      // 0ff: lload 19
      // 101: bipush 1
      // 102: anewarray 298
      // 105: dup_x2
      // 106: dup_x2
      // 107: pop
      // 108: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10b: bipush 0
      // 10c: swap
      // 10d: aastore
      // 10e: ldc2_w -6003327448823870784
      // 111: lload 6
      // 113: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: astore 35
      // 11a: iload 33
      // 11c: anewarray 288
      // 11f: astore 36
      // 121: new com/zelix/wp
      // 124: dup
      // 125: bipush -1
      // 126: invokespecial com/zelix/wp.<init> (I)V
      // 129: astore 37
      // 12b: new com/zelix/pg
      // 12e: dup
      // 12f: lload 29
      // 131: invokespecial com/zelix/pg.<init> (J)V
      // 134: astore 38
      // 136: new com/zelix/pg
      // 139: dup
      // 13a: lload 29
      // 13c: invokespecial com/zelix/pg.<init> (J)V
      // 13f: astore 39
      // 141: aload 0
      // 142: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 145: arraylength
      // 146: iload 31
      // 148: ifeq 1a0
      // 14b: ifle 19e
      // 14e: goto 15c
      // 151: ldc2_w -5954527031255399276
      // 154: lload 6
      // 156: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: aload 38
      // 15e: aload 8
      // 160: aload 0
      // 161: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 164: bipush 0
      // 165: aaload
      // 166: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 169: aload 3
      // 16a: aload 9
      // 16c: aload 2
      // 16d: bipush 1
      // 16e: iload 10
      // 170: i2s
      // 171: aload 34
      // 173: iload 11
      // 175: iload 12
      // 177: aload 35
      // 179: invokestatic com/zelix/ie.f (Lcom/zelix/h9;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;ZSLjava/util/Map;IILjava/util/Map;)[Lcom/zelix/ie;
      // 17c: lload 27
      // 17e: dup2_x1
      // 17f: pop2
      // 180: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 183: aload 39
      // 185: bipush 0
      // 186: anewarray 408
      // 189: lload 27
      // 18b: dup2_x1
      // 18c: pop2
      // 18d: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 190: goto 19e
      // 193: ldc2_w -5954527031255399276
      // 196: lload 6
      // 198: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: iload 4
      // 1a0: iload 31
      // 1a2: ifeq 1dd
      // 1a5: ifne 1dc
      // 1a8: goto 1b6
      // 1ab: ldc2_w -5954527031255399276
      // 1ae: lload 6
      // 1b0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: iload 5
      // 1b8: iload 31
      // 1ba: ifeq 1dd
      // 1bd: goto 1cb
      // 1c0: ldc2_w -5954527031255399276
      // 1c3: lload 6
      // 1c5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: ifeq 26c
      // 1ce: goto 1dc
      // 1d1: ldc2_w -5954527031255399276
      // 1d4: lload 6
      // 1d6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: bipush 0
      // 1dd: istore 40
      // 1df: iload 40
      // 1e1: iload 33
      // 1e3: if_icmpge 26c
      // 1e6: aload 32
      // 1e8: iload 40
      // 1ea: aaload
      // 1eb: invokevirtual java/lang/Integer.intValue ()I
      // 1ee: istore 41
      // 1f0: aload 0
      // 1f1: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 1f4: iload 41
      // 1f6: aaload
      // 1f7: astore 42
      // 1f9: iload 31
      // 1fb: lload 6
      // 1fd: lconst_0
      // 1fe: lcmp
      // 1ff: ifle 269
      // 202: ifeq 267
      // 205: aload 42
      // 207: iload 31
      // 209: ifeq 272
      // 20c: goto 21a
      // 20f: ldc2_w -5954527031255399276
      // 212: lload 6
      // 214: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: lload 23
      // 21c: bipush 1
      // 21d: anewarray 298
      // 220: dup_x2
      // 221: dup_x2
      // 222: pop
      // 223: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 226: bipush 0
      // 227: swap
      // 228: aastore
      // 229: ldc2_w -6104506761836373279
      // 22c: lload 6
      // 22e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: ifeq 256
      // 236: goto 244
      // 239: ldc2_w -5954527031255399276
      // 23c: lload 6
      // 23e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: bipush 0
      // 245: istore 4
      // 247: bipush 0
      // 248: istore 5
      // 24a: lload 6
      // 24c: lconst_0
      // 24d: lcmp
      // 24e: iflt 259
      // 251: iload 31
      // 253: ifne 26c
      // 256: iinc 40 1
      // 259: goto 267
      // 25c: ldc2_w -5954527031255399276
      // 25f: lload 6
      // 261: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: athrow
      // 267: iload 31
      // 269: ifne 1df
      // 26c: aload 0
      // 26d: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 270: bipush 0
      // 271: aaload
      // 272: astore 40
      // 274: bipush 0
      // 275: istore 41
      // 277: iload 41
      // 279: iload 33
      // 27b: if_icmpge 4e0
      // 27e: aload 32
      // 280: iload 41
      // 282: aaload
      // 283: invokevirtual java/lang/Integer.intValue ()I
      // 286: istore 42
      // 288: aload 0
      // 289: getfield com/zelix/wq.F Lcom/zelix/_ov;
      // 28c: iload 42
      // 28e: invokevirtual com/zelix/_ov.get (I)Ljava/lang/Object;
      // 291: checkcast com/zelix/_op
      // 294: astore 43
      // 296: aload 0
      // 297: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 29a: iload 42
      // 29c: aaload
      // 29d: astore 44
      // 29f: aload 44
      // 2a1: iload 31
      // 2a3: lload 6
      // 2a5: lconst_0
      // 2a6: lcmp
      // 2a7: iflt 2ce
      // 2aa: ifeq 2c0
      // 2ad: ifnonnull 399
      // 2b0: goto 2be
      // 2b3: ldc2_w -5954527031255399276
      // 2b6: lload 6
      // 2b8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: aload 44
      // 2c0: sipush 25210
      // 2c3: ldc2_w 4569644491481163896
      // 2c6: lload 6
      // 2c8: lxor
      // 2c9: invokedynamic z (IJ)I bsm=com/zelix/wq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ce: anewarray 14
      // 2d1: dup
      // 2d2: bipush 0
      // 2d3: sipush 25058
      // 2d6: ldc2_w 8282963680117225435
      // 2d9: lload 6
      // 2db: lxor
      // 2dc: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/wq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: aastore
      // 2e2: dup
      // 2e3: bipush 1
      // 2e4: iload 42
      // 2e6: ldc2_w -6285757480801891760
      // 2e9: lload 6
      // 2eb: invokedynamic s (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: aastore
      // 2f1: dup
      // 2f2: bipush 2
      // 2f3: sipush 9879
      // 2f6: ldc2_w 7381069109393731759
      // 2f9: lload 6
      // 2fb: lxor
      // 2fc: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/wq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 301: aastore
      // 302: dup
      // 303: bipush 3
      // 304: aload 0
      // 305: ldc2_w -5891784073778173389
      // 308: lload 6
      // 30a: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30f: aastore
      // 310: dup
      // 311: bipush 4
      // 312: sipush 26757
      // 315: ldc2_w 8213703635898465982
      // 318: lload 6
      // 31a: lxor
      // 31b: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/wq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 320: aastore
      // 321: dup
      // 322: bipush 5
      // 323: aload 43
      // 325: bipush 0
      // 326: anewarray 298
      // 329: ldc2_w -6006841024635208295
      // 32c: lload 6
      // 32e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 336: aastore
      // 337: dup
      // 338: sipush 10353
      // 33b: ldc2_w 5429199748042908273
      // 33e: lload 6
      // 340: lxor
      // 341: invokedynamic z (IJ)I bsm=com/zelix/wq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: sipush 8941
      // 349: ldc2_w 4137838192432362704
      // 34c: lload 6
      // 34e: lxor
      // 34f: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/wq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 354: aastore
      // 355: dup
      // 356: sipush 10687
      // 359: ldc2_w 1943862083361825726
      // 35c: lload 6
      // 35e: lxor
      // 35f: invokedynamic z (IJ)I bsm=com/zelix/wq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 364: aload 43
      // 366: invokevirtual com/zelix/_op.W ()I
      // 369: ldc2_w -6285757480801891760
      // 36c: lload 6
      // 36e: invokedynamic s (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: aastore
      // 374: lload 25
      // 376: dup2_x1
      // 377: pop2
      // 378: bipush 3
      // 379: anewarray 298
      // 37c: dup_x1
      // 37d: swap
      // 37e: bipush 2
      // 37f: swap
      // 380: aastore
      // 381: dup_x2
      // 382: dup_x2
      // 383: pop
      // 384: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 387: bipush 1
      // 388: swap
      // 389: aastore
      // 38a: dup_x1
      // 38b: swap
      // 38c: bipush 0
      // 38d: swap
      // 38e: aastore
      // 38f: ldc2_w -5926491897511814459
      // 392: lload 6
      // 394: invokedynamic s (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 399: iload 5
      // 39b: iload 31
      // 39d: ifeq 3eb
      // 3a0: ifeq 3db
      // 3a3: goto 3b1
      // 3a6: ldc2_w -5954527031255399276
      // 3a9: lload 6
      // 3ab: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b0: athrow
      // 3b1: iload 41
      // 3b3: iload 31
      // 3b5: ifeq 3eb
      // 3b8: goto 3c6
      // 3bb: ldc2_w -5954527031255399276
      // 3be: lload 6
      // 3c0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c5: athrow
      // 3c6: iload 33
      // 3c8: bipush 1
      // 3c9: isub
      // 3ca: if_icmpge 44d
      // 3cd: goto 3db
      // 3d0: ldc2_w -5954527031255399276
      // 3d3: lload 6
      // 3d5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3da: athrow
      // 3db: iload 4
      // 3dd: goto 3eb
      // 3e0: ldc2_w -5954527031255399276
      // 3e3: lload 6
      // 3e5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ea: athrow
      // 3eb: ifeq 417
      // 3ee: aload 44
      // 3f0: lload 13
      // 3f2: bipush 1
      // 3f3: anewarray 298
      // 3f6: dup_x2
      // 3f7: dup_x2
      // 3f8: pop
      // 3f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3fc: bipush 0
      // 3fd: swap
      // 3fe: aastore
      // 3ff: ldc2_w -5262485172182371876
      // 402: lload 6
      // 404: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 409: astore 45
      // 40b: iload 31
      // 40d: lload 6
      // 40f: lconst_0
      // 410: lcmp
      // 411: iflt 443
      // 414: ifne 41e
      // 417: aload 44
      // 419: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 41c: astore 45
      // 41e: aload 36
      // 420: iload 41
      // 422: aload 8
      // 424: aload 43
      // 426: aload 44
      // 428: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 42b: aload 45
      // 42d: aload 3
      // 42e: aload 9
      // 430: aload 2
      // 431: aload 37
      // 433: aload 39
      // 435: aload 38
      // 437: aload 34
      // 439: aload 35
      // 43b: lload 17
      // 43d: invokestatic com/zelix/hq.X (Lcom/zelix/h6;Lcom/zelix/_op;[Lcom/zelix/n;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;Lcom/zelix/wp;Lcom/zelix/pg;Lcom/zelix/pg;Ljava/util/Map;Ljava/util/Map;J)Lcom/zelix/hq;
      // 440: aastore
      // 441: iload 31
      // 443: lload 6
      // 445: lconst_0
      // 446: lcmp
      // 447: ifle 4dd
      // 44a: ifne 4d4
      // 44d: aload 36
      // 44f: iload 41
      // 451: aload 0
      // 452: aload 8
      // 454: lload 21
      // 456: aload 43
      // 458: aload 40
      // 45a: aload 44
      // 45c: aload 3
      // 45d: aload 9
      // 45f: aload 2
      // 460: aload 37
      // 462: aload 39
      // 464: aload 38
      // 466: aload 34
      // 468: aload 35
      // 46a: bipush 13
      // 46c: anewarray 298
      // 46f: dup_x1
      // 470: swap
      // 471: bipush 12
      // 473: swap
      // 474: aastore
      // 475: dup_x1
      // 476: swap
      // 477: bipush 11
      // 479: swap
      // 47a: aastore
      // 47b: dup_x1
      // 47c: swap
      // 47d: bipush 10
      // 47f: swap
      // 480: aastore
      // 481: dup_x1
      // 482: swap
      // 483: bipush 9
      // 485: swap
      // 486: aastore
      // 487: dup_x1
      // 488: swap
      // 489: bipush 8
      // 48b: swap
      // 48c: aastore
      // 48d: dup_x1
      // 48e: swap
      // 48f: bipush 7
      // 491: swap
      // 492: aastore
      // 493: dup_x1
      // 494: swap
      // 495: bipush 6
      // 497: swap
      // 498: aastore
      // 499: dup_x1
      // 49a: swap
      // 49b: bipush 5
      // 49c: swap
      // 49d: aastore
      // 49e: dup_x1
      // 49f: swap
      // 4a0: bipush 4
      // 4a1: swap
      // 4a2: aastore
      // 4a3: dup_x1
      // 4a4: swap
      // 4a5: bipush 3
      // 4a6: swap
      // 4a7: aastore
      // 4a8: dup_x1
      // 4a9: swap
      // 4aa: bipush 2
      // 4ab: swap
      // 4ac: aastore
      // 4ad: dup_x2
      // 4ae: dup_x2
      // 4af: pop
      // 4b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b3: bipush 1
      // 4b4: swap
      // 4b5: aastore
      // 4b6: dup_x1
      // 4b7: swap
      // 4b8: bipush 0
      // 4b9: swap
      // 4ba: aastore
      // 4bb: ldc2_w -6331077397990755560
      // 4be: lload 6
      // 4c0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c5: aastore
      // 4c6: goto 4d4
      // 4c9: ldc2_w -5954527031255399276
      // 4cc: lload 6
      // 4ce: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d3: athrow
      // 4d4: aload 44
      // 4d6: astore 40
      // 4d8: iinc 41 1
      // 4db: iload 31
      // 4dd: ifne 277
      // 4e0: aload 36
      // 4e2: areturn
   }

   private boolean[] g(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast [Ljava/lang/Integer;
      // 012: astore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 2
      // 01e: pop
      // 01f: getstatic com/zelix/wq.a J
      // 022: lload 2
      // 023: lxor
      // 024: lstore 2
      // 025: lload 2
      // 026: dup2
      // 027: ldc2_w 36187276809126
      // 02a: lxor
      // 02b: lstore 6
      // 02d: pop2
      // 02e: ldc2_w 2281194404043486397
      // 031: lload 2
      // 032: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: iload 4
      // 039: newarray 4
      // 03b: astore 9
      // 03d: istore 8
      // 03f: bipush 0
      // 040: istore 10
      // 042: iload 10
      // 044: aload 9
      // 046: arraylength
      // 047: if_icmpge 058
      // 04a: aload 9
      // 04c: iload 10
      // 04e: bipush 1
      // 04f: bastore
      // 050: iinc 10 1
      // 053: iload 8
      // 055: ifeq 042
      // 058: iload 4
      // 05a: lload 2
      // 05b: lconst_0
      // 05c: lcmp
      // 05d: ifle 055
      // 060: anewarray 581
      // 063: astore 10
      // 065: iload 4
      // 067: anewarray 581
      // 06a: astore 11
      // 06c: bipush 0
      // 06d: istore 12
      // 06f: iload 12
      // 071: aload 5
      // 073: arraylength
      // 074: if_icmpge 1cd
      // 077: iload 12
      // 079: iload 8
      // 07b: ifne 0de
      // 07e: ifne 0d6
      // 081: goto 08e
      // 084: ldc2_w 2153586888310862890
      // 087: lload 2
      // 088: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: bipush 0
      // 08f: istore 13
      // 091: iload 13
      // 093: iload 4
      // 095: if_icmpge 0d6
      // 098: aload 10
      // 09a: iload 13
      // 09c: new java/lang/StringBuilder
      // 09f: dup
      // 0a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a3: aastore
      // 0a4: aload 11
      // 0a6: iload 13
      // 0a8: new java/lang/StringBuilder
      // 0ab: dup
      // 0ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 0af: aastore
      // 0b0: iinc 13 1
      // 0b3: iload 8
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: ifle 0c0
      // 0bb: ifne 0e0
      // 0be: iload 8
      // 0c0: ifeq 091
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 0b3
      // 0c9: goto 0d6
      // 0cc: ldc2_w 2153586888310862890
      // 0cf: lload 2
      // 0d0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 5
      // 0d8: iload 12
      // 0da: aaload
      // 0db: invokevirtual java/lang/Integer.intValue ()I
      // 0de: istore 13
      // 0e0: aload 0
      // 0e1: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 0e4: iload 13
      // 0e6: aaload
      // 0e7: astore 14
      // 0e9: aload 14
      // 0eb: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 0ee: astore 15
      // 0f0: aload 14
      // 0f2: lload 6
      // 0f4: bipush 1
      // 0f5: anewarray 298
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w 453090556150907234
      // 104: lload 2
      // 105: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: astore 16
      // 10c: bipush 0
      // 10d: istore 17
      // 10f: iload 17
      // 111: iload 4
      // 113: if_icmpge 1bf
      // 116: aload 10
      // 118: iload 17
      // 11a: aaload
      // 11b: new java/lang/StringBuilder
      // 11e: dup
      // 11f: invokespecial java/lang/StringBuilder.<init> ()V
      // 122: aload 15
      // 124: iload 17
      // 126: aaload
      // 127: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12a: ldc ";"
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 132: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 135: pop
      // 136: aload 11
      // 138: iload 17
      // 13a: aaload
      // 13b: new java/lang/StringBuilder
      // 13e: dup
      // 13f: invokespecial java/lang/StringBuilder.<init> ()V
      // 142: aload 16
      // 144: iload 17
      // 146: aaload
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14a: ldc ";"
      // 14c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: pop
      // 156: iload 8
      // 158: lload 2
      // 159: lconst_0
      // 15a: lcmp
      // 15b: ifle 1bc
      // 15e: ifne 1ba
      // 161: aload 9
      // 163: iload 17
      // 165: baload
      // 166: iload 8
      // 168: ifne 071
      // 16b: lload 2
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: iflt 079
      // 171: goto 17e
      // 174: ldc2_w 2153586888310862890
      // 177: lload 2
      // 178: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: lload 2
      // 17f: lconst_0
      // 180: lcmp
      // 181: iflt 194
      // 184: ifeq 1b7
      // 187: aload 15
      // 189: iload 17
      // 18b: aaload
      // 18c: aload 16
      // 18e: iload 17
      // 190: aaload
      // 191: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 194: ifne 1b7
      // 197: goto 1a4
      // 19a: ldc2_w 2153586888310862890
      // 19d: lload 2
      // 19e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: aload 9
      // 1a6: iload 17
      // 1a8: bipush 0
      // 1a9: bastore
      // 1aa: goto 1b7
      // 1ad: ldc2_w 2153586888310862890
      // 1b0: lload 2
      // 1b1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: iinc 17 1
      // 1ba: iload 8
      // 1bc: ifeq 10f
      // 1bf: iinc 12 1
      // 1c2: iload 8
      // 1c4: lload 2
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: ifle 158
      // 1ca: ifeq 06f
      // 1cd: lload 2
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: iflt 077
      // 1d3: aload 9
      // 1d5: areturn
   }

   private hq I(Object[] param1) {
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
      // 004: checkcast com/zelix/h6
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_op
      // 019: astore 13
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_kz
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/_kz
      // 028: astore 14
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/_8c
      // 030: astore 10
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/util/Set
      // 039: astore 6
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast java/util/List
      // 042: astore 9
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast com/zelix/wp
      // 04b: astore 12
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast com/zelix/pg
      // 054: astore 5
      // 056: dup
      // 057: bipush 10
      // 059: aaload
      // 05a: checkcast com/zelix/pg
      // 05d: astore 15
      // 05f: dup
      // 060: bipush 11
      // 062: aaload
      // 063: checkcast java/util/Map
      // 066: astore 8
      // 068: dup
      // 069: bipush 12
      // 06b: aaload
      // 06c: checkcast java/util/Map
      // 06f: astore 11
      // 071: pop
      // 072: getstatic com/zelix/wq.a J
      // 075: lload 3
      // 076: lxor
      // 077: lstore 3
      // 078: lload 3
      // 079: dup2
      // 07a: ldc2_w 101248533766104
      // 07d: lxor
      // 07e: lstore 16
      // 080: dup2
      // 081: ldc2_w 21853866597004
      // 084: lxor
      // 085: lstore 18
      // 087: dup2
      // 088: ldc2_w 42546963174658
      // 08b: lxor
      // 08c: lstore 20
      // 08e: dup2
      // 08f: ldc2_w 75769651902139
      // 092: lxor
      // 093: lstore 22
      // 095: dup2
      // 096: ldc2_w 120012087502623
      // 099: lxor
      // 09a: lstore 24
      // 09c: dup2
      // 09d: ldc2_w 34338074651665
      // 0a0: lxor
      // 0a1: lstore 26
      // 0a3: dup2
      // 0a4: ldc2_w 32281899806134
      // 0a7: lxor
      // 0a8: lstore 28
      // 0aa: dup2
      // 0ab: ldc2_w 48691531373038
      // 0ae: lxor
      // 0af: lstore 30
      // 0b1: dup2
      // 0b2: ldc2_w 19961739845942
      // 0b5: lxor
      // 0b6: lstore 32
      // 0b8: dup2
      // 0b9: ldc2_w 81861560729293
      // 0bc: lxor
      // 0bd: lstore 34
      // 0bf: dup2
      // 0c0: ldc2_w 49185733350790
      // 0c3: lxor
      // 0c4: lstore 36
      // 0c6: pop2
      // 0c7: aload 14
      // 0c9: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 0cc: astore 39
      // 0ce: ldc2_w 1204670665200668373
      // 0d1: lload 3
      // 0d2: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: aload 14
      // 0d9: lload 16
      // 0db: bipush 1
      // 0dc: anewarray 298
      // 0df: dup_x2
      // 0e0: dup_x2
      // 0e1: pop
      // 0e2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: ldc2_w 736285253853875484
      // 0eb: lload 3
      // 0ec: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: astore 40
      // 0f3: aload 14
      // 0f5: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 0f8: astore 41
      // 0fa: new java/util/ArrayList
      // 0fd: dup
      // 0fe: aload 9
      // 100: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 103: astore 42
      // 105: new java/util/ArrayList
      // 108: dup
      // 109: aload 9
      // 10b: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 10e: astore 43
      // 110: aload 7
      // 112: aload 13
      // 114: aload 41
      // 116: aload 39
      // 118: aload 10
      // 11a: aload 6
      // 11c: lload 18
      // 11e: bipush 2
      // 11f: anewarray 298
      // 122: dup_x2
      // 123: dup_x2
      // 124: pop
      // 125: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 128: bipush 1
      // 129: swap
      // 12a: aastore
      // 12b: dup_x1
      // 12c: swap
      // 12d: bipush 0
      // 12e: swap
      // 12f: aastore
      // 130: ldc2_w 1494373150962188006
      // 133: lload 3
      // 134: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: aload 42
      // 13b: new com/zelix/wp
      // 13e: dup
      // 13f: aload 12
      // 141: lload 32
      // 143: invokevirtual com/zelix/wp.C (J)I
      // 146: invokespecial com/zelix/wp.<init> (I)V
      // 149: new com/zelix/pg
      // 14c: dup
      // 14d: aload 5
      // 14f: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 152: lload 34
      // 154: dup2_x1
      // 155: pop2
      // 156: invokespecial com/zelix/pg.<init> (JLjava/lang/Object;)V
      // 159: new com/zelix/pg
      // 15c: dup
      // 15d: aload 15
      // 15f: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 162: lload 34
      // 164: dup2_x1
      // 165: pop2
      // 166: invokespecial com/zelix/pg.<init> (JLjava/lang/Object;)V
      // 169: aload 8
      // 16b: lload 26
      // 16d: bipush 2
      // 16e: anewarray 298
      // 171: dup_x2
      // 172: dup_x2
      // 173: pop
      // 174: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 177: bipush 1
      // 178: swap
      // 179: aastore
      // 17a: dup_x1
      // 17b: swap
      // 17c: bipush 0
      // 17d: swap
      // 17e: aastore
      // 17f: ldc2_w 581474436448822938
      // 182: lload 3
      // 183: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: aload 11
      // 18a: lload 26
      // 18c: bipush 2
      // 18d: anewarray 298
      // 190: dup_x2
      // 191: dup_x2
      // 192: pop
      // 193: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 196: bipush 1
      // 197: swap
      // 198: aastore
      // 199: dup_x1
      // 19a: swap
      // 19b: bipush 0
      // 19c: swap
      // 19d: aastore
      // 19e: ldc2_w 581474436448822938
      // 1a1: lload 3
      // 1a2: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: lload 22
      // 1a9: invokestatic com/zelix/hq.X (Lcom/zelix/h6;Lcom/zelix/_op;[Lcom/zelix/n;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;Lcom/zelix/wp;Lcom/zelix/pg;Lcom/zelix/pg;Ljava/util/Map;Ljava/util/Map;J)Lcom/zelix/hq;
      // 1ac: astore 44
      // 1ae: istore 38
      // 1b0: aload 7
      // 1b2: aload 13
      // 1b4: aload 41
      // 1b6: aload 40
      // 1b8: aload 10
      // 1ba: aload 6
      // 1bc: lload 18
      // 1be: bipush 2
      // 1bf: anewarray 298
      // 1c2: dup_x2
      // 1c3: dup_x2
      // 1c4: pop
      // 1c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c8: bipush 1
      // 1c9: swap
      // 1ca: aastore
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: bipush 0
      // 1ce: swap
      // 1cf: aastore
      // 1d0: ldc2_w 1494373150962188006
      // 1d3: lload 3
      // 1d4: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: aload 43
      // 1db: new com/zelix/wp
      // 1de: dup
      // 1df: aload 12
      // 1e1: lload 32
      // 1e3: invokevirtual com/zelix/wp.C (J)I
      // 1e6: invokespecial com/zelix/wp.<init> (I)V
      // 1e9: new com/zelix/pg
      // 1ec: dup
      // 1ed: aload 5
      // 1ef: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 1f2: lload 34
      // 1f4: dup2_x1
      // 1f5: pop2
      // 1f6: invokespecial com/zelix/pg.<init> (JLjava/lang/Object;)V
      // 1f9: new com/zelix/pg
      // 1fc: dup
      // 1fd: aload 15
      // 1ff: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 202: lload 34
      // 204: dup2_x1
      // 205: pop2
      // 206: invokespecial com/zelix/pg.<init> (JLjava/lang/Object;)V
      // 209: aload 8
      // 20b: lload 26
      // 20d: bipush 2
      // 20e: anewarray 298
      // 211: dup_x2
      // 212: dup_x2
      // 213: pop
      // 214: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 217: bipush 1
      // 218: swap
      // 219: aastore
      // 21a: dup_x1
      // 21b: swap
      // 21c: bipush 0
      // 21d: swap
      // 21e: aastore
      // 21f: ldc2_w 581474436448822938
      // 222: lload 3
      // 223: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: aload 11
      // 22a: lload 26
      // 22c: bipush 2
      // 22d: anewarray 298
      // 230: dup_x2
      // 231: dup_x2
      // 232: pop
      // 233: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 236: bipush 1
      // 237: swap
      // 238: aastore
      // 239: dup_x1
      // 23a: swap
      // 23b: bipush 0
      // 23c: swap
      // 23d: aastore
      // 23e: ldc2_w 581474436448822938
      // 241: lload 3
      // 242: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: lload 22
      // 249: invokestatic com/zelix/hq.X (Lcom/zelix/h6;Lcom/zelix/_op;[Lcom/zelix/n;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;Lcom/zelix/wp;Lcom/zelix/pg;Lcom/zelix/pg;Ljava/util/Map;Ljava/util/Map;J)Lcom/zelix/hq;
      // 24c: astore 45
      // 24e: bipush 0
      // 24f: istore 46
      // 251: aload 39
      // 253: arraylength
      // 254: anewarray 440
      // 257: astore 47
      // 259: aload 39
      // 25b: bipush 0
      // 25c: aload 47
      // 25e: bipush 0
      // 25f: aload 39
      // 261: arraylength
      // 262: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 265: aload 44
      // 267: lload 20
      // 269: bipush 1
      // 26a: anewarray 298
      // 26d: dup_x2
      // 26e: dup_x2
      // 26f: pop
      // 270: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 273: bipush 0
      // 274: swap
      // 275: aastore
      // 276: ldc2_w 1417147953903861406
      // 279: lload 3
      // 27a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: astore 48
      // 281: aload 48
      // 283: ldc2_w 1291962495361197839
      // 286: lload 3
      // 287: invokedynamic j (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: iload 38
      // 28e: ifeq 45b
      // 291: if_acmpne 443
      // 294: goto 2a1
      // 297: ldc2_w 1269292858009008212
      // 29a: lload 3
      // 29b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: athrow
      // 2a1: bipush 0
      // 2a2: istore 49
      // 2a4: aload 15
      // 2a6: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 2a9: checkcast [Lcom/zelix/ie;
      // 2ac: astore 50
      // 2ae: aload 50
      // 2b0: arraylength
      // 2b1: istore 51
      // 2b3: bipush 0
      // 2b4: istore 52
      // 2b6: iload 52
      // 2b8: iload 51
      // 2ba: if_icmpge 31d
      // 2bd: aload 50
      // 2bf: iload 52
      // 2c1: aaload
      // 2c2: astore 53
      // 2c4: iload 49
      // 2c6: iload 38
      // 2c8: lload 3
      // 2c9: lconst_0
      // 2ca: lcmp
      // 2cb: iflt 2eb
      // 2ce: ifeq 324
      // 2d1: aload 53
      // 2d3: lload 36
      // 2d5: bipush 1
      // 2d6: anewarray 298
      // 2d9: dup_x2
      // 2da: dup_x2
      // 2db: pop
      // 2dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2df: bipush 0
      // 2e0: swap
      // 2e1: aastore
      // 2e2: ldc2_w 743528338100061565
      // 2e5: lload 3
      // 2e6: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: iload 38
      // 2ed: ifeq 30e
      // 2f0: goto 2fd
      // 2f3: ldc2_w 1269292858009008212
      // 2f6: lload 3
      // 2f7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: athrow
      // 2fd: ifeq 311
      // 300: goto 30d
      // 303: ldc2_w 1269292858009008212
      // 306: lload 3
      // 307: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30c: athrow
      // 30d: bipush 2
      // 30e: goto 312
      // 311: bipush 1
      // 312: iadd
      // 313: istore 49
      // 315: iinc 52 1
      // 318: iload 38
      // 31a: ifne 2b6
      // 31d: lload 3
      // 31e: lconst_0
      // 31f: lcmp
      // 320: ifle 776
      // 323: bipush 0
      // 324: istore 50
      // 326: aload 44
      // 328: checkcast com/zelix/hx
      // 32b: lload 30
      // 32d: bipush 1
      // 32e: anewarray 298
      // 331: dup_x2
      // 332: dup_x2
      // 333: pop
      // 334: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 337: bipush 0
      // 338: swap
      // 339: aastore
      // 33a: ldc2_w 1478758714688737672
      // 33d: lload 3
      // 33e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: astore 51
      // 345: aload 51
      // 347: arraylength
      // 348: istore 52
      // 34a: bipush 0
      // 34b: istore 53
      // 34d: iload 53
      // 34f: iload 52
      // 351: if_icmpge 3b4
      // 354: aload 51
      // 356: iload 53
      // 358: aaload
      // 359: astore 54
      // 35b: iload 50
      // 35d: lload 3
      // 35e: lconst_0
      // 35f: lcmp
      // 360: ifle 3c1
      // 363: aload 54
      // 365: lload 36
      // 367: bipush 1
      // 368: anewarray 298
      // 36b: dup_x2
      // 36c: dup_x2
      // 36d: pop
      // 36e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 371: bipush 0
      // 372: swap
      // 373: aastore
      // 374: ldc2_w 743528338100061565
      // 377: lload 3
      // 378: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37d: iload 38
      // 37f: ifeq 3c0
      // 382: iload 38
      // 384: ifeq 3a5
      // 387: goto 394
      // 38a: ldc2_w 1269292858009008212
      // 38d: lload 3
      // 38e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 393: athrow
      // 394: ifeq 3a8
      // 397: goto 3a4
      // 39a: ldc2_w 1269292858009008212
      // 39d: lload 3
      // 39e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: athrow
      // 3a4: bipush 2
      // 3a5: goto 3a9
      // 3a8: bipush 1
      // 3a9: iadd
      // 3aa: istore 50
      // 3ac: iinc 53 1
      // 3af: iload 38
      // 3b1: ifne 34d
      // 3b4: iload 49
      // 3b6: iload 50
      // 3b8: iadd
      // 3b9: lload 3
      // 3ba: lconst_0
      // 3bb: lcmp
      // 3bc: iflt 3c1
      // 3bf: bipush 1
      // 3c0: isub
      // 3c1: istore 51
      // 3c3: iload 51
      // 3c5: iload 49
      // 3c7: if_icmplt 438
      // 3ca: aload 14
      // 3cc: iload 51
      // 3ce: bipush 1
      // 3cf: anewarray 298
      // 3d2: dup_x1
      // 3d3: swap
      // 3d4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d7: bipush 0
      // 3d8: swap
      // 3d9: aastore
      // 3da: ldc2_w 1264540666128943768
      // 3dd: lload 3
      // 3de: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e3: iload 38
      // 3e5: lload 3
      // 3e6: lconst_0
      // 3e7: lcmp
      // 3e8: iflt 3f0
      // 3eb: ifeq 77e
      // 3ee: iload 38
      // 3f0: ifeq 42e
      // 3f3: goto 400
      // 3f6: ldc2_w 1269292858009008212
      // 3f9: lload 3
      // 3fa: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ff: athrow
      // 400: lload 3
      // 401: lconst_0
      // 402: lcmp
      // 403: iflt 440
      // 406: ifne 438
      // 409: goto 416
      // 40c: ldc2_w 1269292858009008212
      // 40f: lload 3
      // 410: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 415: athrow
      // 416: aload 47
      // 418: iload 51
      // 41a: aload 40
      // 41c: iload 51
      // 41e: aaload
      // 41f: aastore
      // 420: bipush 1
      // 421: goto 42e
      // 424: ldc2_w 1269292858009008212
      // 427: lload 3
      // 428: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42d: athrow
      // 42e: istore 46
      // 430: iinc 51 -1
      // 433: iload 38
      // 435: ifne 3c3
      // 438: iload 38
      // 43a: lload 3
      // 43b: lconst_0
      // 43c: lcmp
      // 43d: ifle 3e3
      // 440: ifne 776
      // 443: aload 48
      // 445: ldc2_w 1523540568677694768
      // 448: lload 3
      // 449: invokedynamic j (JJ)Lcom/zelix/c; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44e: goto 45b
      // 451: ldc2_w 1269292858009008212
      // 454: lload 3
      // 455: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45a: athrow
      // 45b: if_acmpne 776
      // 45e: aload 41
      // 460: arraylength
      // 461: iload 38
      // 463: ifeq 68d
      // 466: goto 473
      // 469: ldc2_w 1269292858009008212
      // 46c: lload 3
      // 46d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 472: athrow
      // 473: bipush 2
      // 474: if_icmpge 68b
      // 477: goto 484
      // 47a: ldc2_w 1269292858009008212
      // 47d: lload 3
      // 47e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 483: athrow
      // 484: aload 15
      // 486: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // 489: checkcast [Lcom/zelix/ie;
      // 48c: astore 49
      // 48e: aload 2
      // 48f: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 492: astore 50
      // 494: aload 0
      // 495: aload 50
      // 497: lload 28
      // 499: bipush 2
      // 49a: anewarray 298
      // 49d: dup_x2
      // 49e: dup_x2
      // 49f: pop
      // 4a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a3: bipush 1
      // 4a4: swap
      // 4a5: aastore
      // 4a6: dup_x1
      // 4a7: swap
      // 4a8: bipush 0
      // 4a9: swap
      // 4aa: aastore
      // 4ab: ldc2_w 1363597343481705391
      // 4ae: lload 3
      // 4af: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b4: istore 51
      // 4b6: aload 0
      // 4b7: aload 39
      // 4b9: lload 28
      // 4bb: bipush 2
      // 4bc: anewarray 298
      // 4bf: dup_x2
      // 4c0: dup_x2
      // 4c1: pop
      // 4c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c5: bipush 1
      // 4c6: swap
      // 4c7: aastore
      // 4c8: dup_x1
      // 4c9: swap
      // 4ca: bipush 0
      // 4cb: swap
      // 4cc: aastore
      // 4cd: ldc2_w 1363597343481705391
      // 4d0: lload 3
      // 4d1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d6: istore 52
      // 4d8: bipush -1
      // 4d9: istore 53
      // 4db: bipush 0
      // 4dc: istore 54
      // 4de: iload 54
      // 4e0: iload 51
      // 4e2: if_icmpgt 510
      // 4e5: iload 38
      // 4e7: ifeq 68b
      // 4ea: aload 50
      // 4ec: iload 54
      // 4ee: aaload
      // 4ef: aload 39
      // 4f1: iload 54
      // 4f3: aaload
      // 4f4: if_acmpne 510
      // 4f7: goto 504
      // 4fa: ldc2_w 1269292858009008212
      // 4fd: lload 3
      // 4fe: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 503: athrow
      // 504: iload 54
      // 506: istore 53
      // 508: iinc 54 1
      // 50b: iload 38
      // 50d: ifne 4de
      // 510: iload 51
      // 512: iload 38
      // 514: lload 3
      // 515: lconst_0
      // 516: lcmp
      // 517: ifle 68f
      // 51a: lload 3
      // 51b: lconst_0
      // 51c: lcmp
      // 51d: iflt 525
      // 520: ifeq 68d
      // 523: iload 52
      // 525: if_icmpge 68b
      // 528: goto 535
      // 52b: ldc2_w 1269292858009008212
      // 52e: lload 3
      // 52f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 534: athrow
      // 535: iload 53
      // 537: iload 38
      // 539: lload 3
      // 53a: lconst_0
      // 53b: lcmp
      // 53c: iflt 68f
      // 53f: ifeq 68d
      // 542: goto 54f
      // 545: ldc2_w 1269292858009008212
      // 548: lload 3
      // 549: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54e: athrow
      // 54f: iload 51
      // 551: if_icmpne 68b
      // 554: goto 561
      // 557: ldc2_w 1269292858009008212
      // 55a: lload 3
      // 55b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 560: athrow
      // 561: iload 52
      // 563: istore 54
      // 565: iload 52
      // 567: istore 55
      // 569: iload 55
      // 56b: iload 53
      // 56d: bipush 1
      // 56e: iadd
      // 56f: if_icmplt 5df
      // 572: aload 40
      // 574: iload 55
      // 576: aaload
      // 577: bipush 0
      // 578: anewarray 298
      // 57b: ldc2_w 1536511747341815405
      // 57e: lload 3
      // 57f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 584: iload 38
      // 586: lload 3
      // 587: lconst_0
      // 588: lcmp
      // 589: iflt 591
      // 58c: ifeq 5e1
      // 58f: iload 38
      // 591: lload 3
      // 592: lconst_0
      // 593: lcmp
      // 594: ifle 5e3
      // 597: ifeq 5e1
      // 59a: goto 5a7
      // 59d: ldc2_w 1269292858009008212
      // 5a0: lload 3
      // 5a1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a6: athrow
      // 5a7: ifeq 5df
      // 5aa: goto 5b7
      // 5ad: ldc2_w 1269292858009008212
      // 5b0: lload 3
      // 5b1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b6: athrow
      // 5b7: aload 47
      // 5b9: iload 55
      // 5bb: aload 40
      // 5bd: iload 55
      // 5bf: aaload
      // 5c0: aastore
      // 5c1: iinc 54 -1
      // 5c4: iinc 55 -1
      // 5c7: iload 38
      // 5c9: ifne 569
      // 5cc: lload 3
      // 5cd: lconst_0
      // 5ce: lcmp
      // 5cf: iflt 572
      // 5d2: goto 5df
      // 5d5: ldc2_w 1269292858009008212
      // 5d8: lload 3
      // 5d9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5de: athrow
      // 5df: iload 54
      // 5e1: iload 38
      // 5e3: lload 3
      // 5e4: lconst_0
      // 5e5: lcmp
      // 5e6: ifle 5ee
      // 5e9: ifeq 66b
      // 5ec: iload 51
      // 5ee: if_icmpeq 65d
      // 5f1: goto 5fe
      // 5f4: ldc2_w 1269292858009008212
      // 5f7: lload 3
      // 5f8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fd: athrow
      // 5fe: aload 41
      // 600: iload 38
      // 602: lload 3
      // 603: lconst_0
      // 604: lcmp
      // 605: ifle 682
      // 608: ifeq 681
      // 60b: goto 618
      // 60e: ldc2_w 1269292858009008212
      // 611: lload 3
      // 612: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 617: athrow
      // 618: lload 3
      // 619: lconst_0
      // 61a: lcmp
      // 61b: iflt 674
      // 61e: arraylength
      // 61f: ifne 672
      // 622: goto 62f
      // 625: ldc2_w 1269292858009008212
      // 628: lload 3
      // 629: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62e: athrow
      // 62f: iload 54
      // 631: iload 51
      // 633: isub
      // 634: lload 3
      // 635: lconst_0
      // 636: lcmp
      // 637: iflt 66f
      // 63a: iload 38
      // 63c: ifeq 66b
      // 63f: goto 64c
      // 642: ldc2_w 1269292858009008212
      // 645: lload 3
      // 646: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64b: athrow
      // 64c: bipush 3
      // 64d: if_icmpgt 672
      // 650: goto 65d
      // 653: ldc2_w 1269292858009008212
      // 656: lload 3
      // 657: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65c: athrow
      // 65d: bipush 1
      // 65e: goto 66b
      // 661: ldc2_w 1269292858009008212
      // 664: lload 3
      // 665: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66a: athrow
      // 66b: istore 46
      // 66d: iload 38
      // 66f: ifne 68b
      // 672: aload 39
      // 674: goto 681
      // 677: ldc2_w 1269292858009008212
      // 67a: lload 3
      // 67b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 680: athrow
      // 681: bipush 0
      // 682: aload 47
      // 684: bipush 0
      // 685: aload 39
      // 687: arraylength
      // 688: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 68b: iload 46
      // 68d: iload 38
      // 68f: ifeq 77e
      // 692: ifne 776
      // 695: goto 6a2
      // 698: ldc2_w 1269292858009008212
      // 69b: lload 3
      // 69c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a1: athrow
      // 6a2: bipush 0
      // 6a3: istore 49
      // 6a5: iload 49
      // 6a7: aload 39
      // 6a9: arraylength
      // 6aa: if_icmpge 776
      // 6ad: aload 39
      // 6af: iload 49
      // 6b1: aaload
      // 6b2: astore 50
      // 6b4: aload 40
      // 6b6: iload 49
      // 6b8: aaload
      // 6b9: astore 51
      // 6bb: iload 38
      // 6bd: lload 3
      // 6be: lconst_0
      // 6bf: lcmp
      // 6c0: iflt 773
      // 6c3: ifeq 771
      // 6c6: aload 50
      // 6c8: lload 24
      // 6ca: invokevirtual com/zelix/n.P (J)Z
      // 6cd: iload 38
      // 6cf: ifeq 77e
      // 6d2: goto 6df
      // 6d5: ldc2_w 1269292858009008212
      // 6d8: lload 3
      // 6d9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6de: athrow
      // 6df: ifne 76e
      // 6e2: goto 6ef
      // 6e5: ldc2_w 1269292858009008212
      // 6e8: lload 3
      // 6e9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ee: athrow
      // 6ef: aload 50
      // 6f1: bipush 0
      // 6f2: anewarray 298
      // 6f5: ldc2_w 1536511747341815405
      // 6f8: lload 3
      // 6f9: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6fe: iload 38
      // 700: lload 3
      // 701: lconst_0
      // 702: lcmp
      // 703: iflt 744
      // 706: ifeq 742
      // 709: goto 716
      // 70c: ldc2_w 1269292858009008212
      // 70f: lload 3
      // 710: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 715: athrow
      // 716: ifne 76e
      // 719: goto 726
      // 71c: ldc2_w 1269292858009008212
      // 71f: lload 3
      // 720: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 725: athrow
      // 726: aload 51
      // 728: bipush 0
      // 729: anewarray 298
      // 72c: ldc2_w 1536511747341815405
      // 72f: lload 3
      // 730: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 735: goto 742
      // 738: ldc2_w 1269292858009008212
      // 73b: lload 3
      // 73c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 741: athrow
      // 742: iload 38
      // 744: ifeq 76c
      // 747: ifeq 76e
      // 74a: goto 757
      // 74d: ldc2_w 1269292858009008212
      // 750: lload 3
      // 751: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 756: athrow
      // 757: aload 47
      // 759: iload 49
      // 75b: aload 51
      // 75d: aastore
      // 75e: bipush 1
      // 75f: goto 76c
      // 762: ldc2_w 1269292858009008212
      // 765: lload 3
      // 766: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76b: athrow
      // 76c: istore 46
      // 76e: iinc 49 1
      // 771: iload 38
      // 773: ifne 6a5
      // 776: lload 3
      // 777: lconst_0
      // 778: lcmp
      // 779: iflt 7a3
      // 77c: iload 46
      // 77e: ifeq 7a3
      // 781: aload 7
      // 783: aload 13
      // 785: aload 41
      // 787: aload 47
      // 789: aload 10
      // 78b: aload 6
      // 78d: aload 9
      // 78f: aload 12
      // 791: aload 5
      // 793: aload 15
      // 795: aload 8
      // 797: aload 11
      // 799: lload 22
      // 79b: invokestatic com/zelix/hq.X (Lcom/zelix/h6;Lcom/zelix/_op;[Lcom/zelix/n;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;Lcom/zelix/wp;Lcom/zelix/pg;Lcom/zelix/pg;Ljava/util/Map;Ljava/util/Map;J)Lcom/zelix/hq;
      // 79e: astore 49
      // 7a0: aload 49
      // 7a2: areturn
      // 7a3: aload 7
      // 7a5: aload 13
      // 7a7: aload 41
      // 7a9: aload 39
      // 7ab: aload 10
      // 7ad: aload 6
      // 7af: aload 9
      // 7b1: aload 12
      // 7b3: aload 5
      // 7b5: aload 15
      // 7b7: aload 8
      // 7b9: aload 11
      // 7bb: lload 22
      // 7bd: invokestatic com/zelix/hq.X (Lcom/zelix/h6;Lcom/zelix/_op;[Lcom/zelix/n;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;Lcom/zelix/wp;Lcom/zelix/pg;Lcom/zelix/pg;Ljava/util/Map;Ljava/util/Map;J)Lcom/zelix/hq;
      // 7c0: astore 49
      // 7c2: aload 49
      // 7c4: areturn
   }

   private hq[] A(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 7
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast [Ljava/lang/Integer;
      // 012: astore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 2
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast [Z
      // 024: astore 12
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/h6
      // 02c: astore 10
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast com/zelix/_8c
      // 034: astore 9
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/util/Set
      // 03d: astore 8
      // 03f: dup
      // 040: bipush 7
      // 042: aaload
      // 043: checkcast java/util/List
      // 046: astore 11
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast java/util/Map
      // 04f: astore 6
      // 051: dup
      // 052: bipush 9
      // 054: aaload
      // 055: checkcast java/util/Map
      // 058: astore 5
      // 05a: pop
      // 05b: getstatic com/zelix/wq.a J
      // 05e: lload 2
      // 05f: lxor
      // 060: lstore 2
      // 061: lload 2
      // 062: dup2
      // 063: ldc2_w 74821773249390
      // 066: lxor
      // 067: dup2
      // 068: bipush 48
      // 06a: lushr
      // 06b: l2i
      // 06c: istore 13
      // 06e: dup2
      // 06f: bipush 16
      // 071: lshl
      // 072: bipush 32
      // 074: lushr
      // 075: l2i
      // 076: istore 14
      // 078: dup2
      // 079: bipush 48
      // 07b: lshl
      // 07c: bipush 48
      // 07e: lushr
      // 07f: l2i
      // 080: istore 15
      // 082: pop2
      // 083: dup2
      // 084: ldc2_w 24269944952990
      // 087: lxor
      // 088: lstore 16
      // 08a: dup2
      // 08b: ldc2_w 12124673689443
      // 08e: lxor
      // 08f: lstore 18
      // 091: dup2
      // 092: ldc2_w 16417323659773
      // 095: lxor
      // 096: lstore 20
      // 098: dup2
      // 099: ldc2_w 35422083388141
      // 09c: lxor
      // 09d: lstore 22
      // 09f: dup2
      // 0a0: ldc2_w 108448044381893
      // 0a3: lxor
      // 0a4: lstore 24
      // 0a6: dup2
      // 0a7: ldc2_w 114491958104920
      // 0aa: lxor
      // 0ab: lstore 26
      // 0ad: pop2
      // 0ae: ldc2_w 1481781868392873861
      // 0b1: lload 2
      // 0b2: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: new com/zelix/wp
      // 0ba: dup
      // 0bb: bipush -1
      // 0bc: invokespecial com/zelix/wp.<init> (I)V
      // 0bf: astore 29
      // 0c1: new com/zelix/pg
      // 0c4: dup
      // 0c5: lload 26
      // 0c7: invokespecial com/zelix/pg.<init> (J)V
      // 0ca: astore 30
      // 0cc: istore 28
      // 0ce: new com/zelix/pg
      // 0d1: dup
      // 0d2: lload 26
      // 0d4: invokespecial com/zelix/pg.<init> (J)V
      // 0d7: astore 31
      // 0d9: aload 30
      // 0db: aload 10
      // 0dd: aload 0
      // 0de: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 0e1: bipush 0
      // 0e2: aaload
      // 0e3: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 0e6: aload 9
      // 0e8: aload 8
      // 0ea: aload 11
      // 0ec: bipush 1
      // 0ed: iload 13
      // 0ef: i2s
      // 0f0: aload 6
      // 0f2: iload 14
      // 0f4: iload 15
      // 0f6: aload 5
      // 0f8: invokestatic com/zelix/ie.f (Lcom/zelix/h9;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;ZSLjava/util/Map;IILjava/util/Map;)[Lcom/zelix/ie;
      // 0fb: lload 24
      // 0fd: dup2_x1
      // 0fe: pop2
      // 0ff: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 102: aload 31
      // 104: bipush 0
      // 105: anewarray 408
      // 108: lload 24
      // 10a: dup2_x1
      // 10b: pop2
      // 10c: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 10f: aload 4
      // 111: arraylength
      // 112: anewarray 288
      // 115: astore 32
      // 117: bipush 0
      // 118: istore 33
      // 11a: iload 33
      // 11c: aload 4
      // 11e: arraylength
      // 11f: if_icmpge 342
      // 122: aload 4
      // 124: iload 33
      // 126: aaload
      // 127: invokevirtual java/lang/Integer.intValue ()I
      // 12a: istore 34
      // 12c: aload 0
      // 12d: getfield com/zelix/wq.F Lcom/zelix/_ov;
      // 130: iload 34
      // 132: invokevirtual com/zelix/_ov.get (I)Ljava/lang/Object;
      // 135: checkcast com/zelix/_op
      // 138: astore 35
      // 13a: aload 0
      // 13b: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 13e: iload 34
      // 140: aaload
      // 141: astore 36
      // 143: aload 36
      // 145: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 148: astore 37
      // 14a: aload 36
      // 14c: lload 16
      // 14e: bipush 1
      // 14f: anewarray 298
      // 152: dup_x2
      // 153: dup_x2
      // 154: pop
      // 155: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 158: bipush 0
      // 159: swap
      // 15a: aastore
      // 15b: ldc2_w 968702242389527130
      // 15e: lload 2
      // 15f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: astore 38
      // 166: iload 7
      // 168: anewarray 440
      // 16b: astore 39
      // 16d: bipush 0
      // 16e: istore 40
      // 170: iload 40
      // 172: iload 7
      // 174: if_icmpge 30f
      // 177: aload 12
      // 179: iload 40
      // 17b: baload
      // 17c: iload 28
      // 17e: ifne 11c
      // 181: lload 2
      // 182: lconst_0
      // 183: lcmp
      // 184: ifle 16e
      // 187: ifeq 1ac
      // 18a: aload 39
      // 18c: iload 40
      // 18e: aload 37
      // 190: iload 40
      // 192: aaload
      // 193: aastore
      // 194: iload 28
      // 196: lload 2
      // 197: lconst_0
      // 198: lcmp
      // 199: iflt 1c5
      // 19c: ifeq 1c3
      // 19f: goto 1ac
      // 1a2: ldc2_w 1646950934242148114
      // 1a5: lload 2
      // 1a6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: aload 39
      // 1ae: iload 40
      // 1b0: aload 38
      // 1b2: iload 40
      // 1b4: aaload
      // 1b5: aastore
      // 1b6: goto 1c3
      // 1b9: ldc2_w 1646950934242148114
      // 1bc: lload 2
      // 1bd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: iload 40
      // 1c5: iload 28
      // 1c7: lload 2
      // 1c8: lconst_0
      // 1c9: lcmp
      // 1ca: iflt 1f9
      // 1cd: ifne 1f7
      // 1d0: ifle 307
      // 1d3: goto 1e0
      // 1d6: ldc2_w 1646950934242148114
      // 1d9: lload 2
      // 1da: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: athrow
      // 1e0: aload 39
      // 1e2: iload 40
      // 1e4: aaload
      // 1e5: lload 22
      // 1e7: invokevirtual com/zelix/n.Y (J)Z
      // 1ea: goto 1f7
      // 1ed: ldc2_w 1646950934242148114
      // 1f0: lload 2
      // 1f1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: athrow
      // 1f7: iload 28
      // 1f9: ifne 2a5
      // 1fc: ifeq 279
      // 1ff: goto 20c
      // 202: ldc2_w 1646950934242148114
      // 205: lload 2
      // 206: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: athrow
      // 20c: aload 39
      // 20e: iload 40
      // 210: bipush 1
      // 211: isub
      // 212: aaload
      // 213: lload 18
      // 215: bipush 1
      // 216: anewarray 298
      // 219: dup_x2
      // 21a: dup_x2
      // 21b: pop
      // 21c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21f: bipush 0
      // 220: swap
      // 221: aastore
      // 222: ldc2_w 607916731369849594
      // 225: lload 2
      // 226: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22b: iload 28
      // 22d: lload 2
      // 22e: lconst_0
      // 22f: lcmp
      // 230: ifle 2ad
      // 233: ifne 2a5
      // 236: goto 243
      // 239: ldc2_w 1646950934242148114
      // 23c: lload 2
      // 23d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: athrow
      // 243: lload 2
      // 244: lconst_0
      // 245: lcmp
      // 246: iflt 298
      // 249: ifne 279
      // 24c: goto 259
      // 24f: ldc2_w 1646950934242148114
      // 252: lload 2
      // 253: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: aload 39
      // 25b: iload 40
      // 25d: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 260: aastore
      // 261: iload 28
      // 263: lload 2
      // 264: lconst_0
      // 265: lcmp
      // 266: iflt 30c
      // 269: ifeq 307
      // 26c: goto 279
      // 26f: ldc2_w 1646950934242148114
      // 272: lload 2
      // 273: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 278: athrow
      // 279: aload 39
      // 27b: iload 40
      // 27d: bipush 1
      // 27e: isub
      // 27f: aaload
      // 280: lload 18
      // 282: bipush 1
      // 283: anewarray 298
      // 286: dup_x2
      // 287: dup_x2
      // 288: pop
      // 289: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28c: bipush 0
      // 28d: swap
      // 28e: aastore
      // 28f: ldc2_w 607916731369849594
      // 292: lload 2
      // 293: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: goto 2a5
      // 29b: ldc2_w 1646950934242148114
      // 29e: lload 2
      // 29f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a4: athrow
      // 2a5: lload 2
      // 2a6: lconst_0
      // 2a7: lcmp
      // 2a8: iflt 2e9
      // 2ab: iload 28
      // 2ad: ifne 2e9
      // 2b0: ifeq 307
      // 2b3: goto 2c0
      // 2b6: ldc2_w 1646950934242148114
      // 2b9: lload 2
      // 2ba: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: athrow
      // 2c0: aload 39
      // 2c2: iload 40
      // 2c4: iload 28
      // 2c6: ifne 303
      // 2c9: goto 2d6
      // 2cc: ldc2_w 1646950934242148114
      // 2cf: lload 2
      // 2d0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: athrow
      // 2d6: aaload
      // 2d7: lload 22
      // 2d9: invokevirtual com/zelix/n.Y (J)Z
      // 2dc: goto 2e9
      // 2df: ldc2_w 1646950934242148114
      // 2e2: lload 2
      // 2e3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: athrow
      // 2e9: lload 2
      // 2ea: lconst_0
      // 2eb: lcmp
      // 2ec: ifle 30c
      // 2ef: ifne 307
      // 2f2: aload 39
      // 2f4: iload 40
      // 2f6: goto 303
      // 2f9: ldc2_w 1646950934242148114
      // 2fc: lload 2
      // 2fd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: athrow
      // 303: getstatic com/zelix/n.l Lcom/zelix/n;
      // 306: aastore
      // 307: iinc 40 1
      // 30a: iload 28
      // 30c: ifeq 170
      // 30f: aload 32
      // 311: iload 33
      // 313: aload 10
      // 315: aload 35
      // 317: aload 36
      // 319: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 31c: aload 39
      // 31e: aload 9
      // 320: aload 8
      // 322: aload 11
      // 324: aload 29
      // 326: aload 31
      // 328: aload 30
      // 32a: aload 6
      // 32c: aload 5
      // 32e: lload 20
      // 330: invokestatic com/zelix/hq.X (Lcom/zelix/h6;Lcom/zelix/_op;[Lcom/zelix/n;[Lcom/zelix/n;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;Lcom/zelix/wp;Lcom/zelix/pg;Lcom/zelix/pg;Ljava/util/Map;Ljava/util/Map;J)Lcom/zelix/hq;
      // 333: aastore
      // 334: iinc 33 1
      // 337: iload 28
      // 339: lload 2
      // 33a: lconst_0
      // 33b: lcmp
      // 33c: ifle 17c
      // 33f: ifeq 11a
      // 342: lload 2
      // 343: lconst_0
      // 344: lcmp
      // 345: iflt 122
      // 348: aload 32
      // 34a: areturn
   }

   public hq[] X(Object[] param1) {
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
      // 015: istore 7
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast com/zelix/h6
      // 01d: astore 3
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/_8c
      // 024: astore 4
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/util/Set
      // 02c: astore 2
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast java/util/List
      // 033: astore 8
      // 035: pop
      // 036: getstatic com/zelix/wq.a J
      // 039: lload 5
      // 03b: lxor
      // 03c: lstore 5
      // 03e: lload 5
      // 040: dup2
      // 041: ldc2_w 129931099781052
      // 044: lxor
      // 045: lstore 9
      // 047: dup2
      // 048: ldc2_w 37673565648221
      // 04b: lxor
      // 04c: lstore 11
      // 04e: dup2
      // 04f: ldc2_w 92357785495002
      // 052: lxor
      // 053: lstore 13
      // 055: dup2
      // 056: ldc2_w 100482297969493
      // 059: lxor
      // 05a: lstore 15
      // 05c: dup2
      // 05d: ldc2_w 69493780488458
      // 060: lxor
      // 061: lstore 17
      // 063: dup2
      // 064: ldc2_w 64822648196521
      // 067: lxor
      // 068: lstore 19
      // 06a: dup2
      // 06b: ldc2_w 37312001860293
      // 06e: lxor
      // 06f: lstore 21
      // 071: dup2
      // 072: ldc2_w 115915908322212
      // 075: lxor
      // 076: lstore 23
      // 078: dup2
      // 079: ldc2_w 97569262096638
      // 07c: lxor
      // 07d: lstore 25
      // 07f: pop2
      // 080: ldc2_w -6016718003214661739
      // 083: lload 5
      // 085: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: istore 27
      // 08c: iload 7
      // 08e: iload 27
      // 090: ifne 0c0
      // 093: bipush 62
      // 095: ldc2_w 6131376046066354606
      // 098: lload 5
      // 09a: lxor
      // 09b: invokedynamic z (IJ)I bsm=com/zelix/wq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: if_icmpgt 0c3
      // 0a3: goto 0b1
      // 0a6: ldc2_w -5851531344909531390
      // 0a9: lload 5
      // 0ab: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: bipush 1
      // 0b2: goto 0c0
      // 0b5: ldc2_w -5851531344909531390
      // 0b8: lload 5
      // 0ba: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: goto 0c4
      // 0c3: bipush 0
      // 0c4: bipush 2
      // 0c5: anewarray 14
      // 0c8: dup
      // 0c9: bipush 0
      // 0ca: new java/lang/StringBuilder
      // 0cd: dup
      // 0ce: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d1: sipush 2273
      // 0d4: ldc2_w 4373750398114405709
      // 0d7: lload 5
      // 0d9: lxor
      // 0da: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/wq.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: iload 7
      // 0e4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e7: ldc ">"
      // 0e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ec: sipush 2794
      // 0ef: ldc2_w 6271333338153763711
      // 0f2: lload 5
      // 0f4: lxor
      // 0f5: invokedynamic z (IJ)I bsm=com/zelix/wq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0fd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 100: aastore
      // 101: dup
      // 102: bipush 1
      // 103: aload 0
      // 104: ldc2_w -6018513011325954098
      // 107: lload 5
      // 109: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/be; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: lload 19
      // 110: invokevirtual com/zelix/be.o (J)Ljava/lang/String;
      // 113: aastore
      // 114: lload 17
      // 116: dup2_x2
      // 117: pop2
      // 118: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 11b: aload 0
      // 11c: ldc2_w -5652541913273762542
      // 11f: lload 5
      // 121: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/yg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: lload 11
      // 128: bipush 1
      // 129: anewarray 298
      // 12c: dup_x2
      // 12d: dup_x2
      // 12e: pop
      // 12f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 132: bipush 0
      // 133: swap
      // 134: aastore
      // 135: ldc2_w -6071359508427784808
      // 138: lload 5
      // 13a: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: astore 28
      // 141: aload 28
      // 143: arraylength
      // 144: anewarray 288
      // 147: astore 29
      // 149: aload 28
      // 14b: arraylength
      // 14c: iload 27
      // 14e: lload 5
      // 150: lconst_0
      // 151: lcmp
      // 152: iflt 17e
      // 155: ifne 17c
      // 158: ifle 478
      // 15b: goto 169
      // 15e: ldc2_w -5851531344909531390
      // 161: lload 5
      // 163: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: aload 0
      // 16a: getfield com/zelix/wq.K [Lcom/zelix/_kz;
      // 16d: arraylength
      // 16e: goto 17c
      // 171: ldc2_w -5851531344909531390
      // 174: lload 5
      // 176: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: iload 27
      // 17e: ifne 194
      // 181: ifle 478
      // 184: goto 192
      // 187: ldc2_w -5851531344909531390
      // 18a: lload 5
      // 18c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: iload 7
      // 194: lload 23
      // 196: bipush 2
      // 197: anewarray 298
      // 19a: dup_x2
      // 19b: dup_x2
      // 19c: pop
      // 19d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a0: bipush 1
      // 1a1: swap
      // 1a2: aastore
      // 1a3: dup_x1
      // 1a4: swap
      // 1a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a8: bipush 0
      // 1a9: swap
      // 1aa: aastore
      // 1ab: ldc2_w -6141398835626823349
      // 1ae: lload 5
      // 1b0: invokedynamic u (Ljava/lang/Object;JJ)[[Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: astore 30
      // 1b7: aload 0
      // 1b8: iload 7
      // 1ba: aload 28
      // 1bc: lload 9
      // 1be: aload 30
      // 1c0: bipush 4
      // 1c1: anewarray 298
      // 1c4: dup_x1
      // 1c5: swap
      // 1c6: bipush 3
      // 1c7: swap
      // 1c8: aastore
      // 1c9: dup_x2
      // 1ca: dup_x2
      // 1cb: pop
      // 1cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cf: bipush 2
      // 1d0: swap
      // 1d1: aastore
      // 1d2: dup_x1
      // 1d3: swap
      // 1d4: bipush 1
      // 1d5: swap
      // 1d6: aastore
      // 1d7: dup_x1
      // 1d8: swap
      // 1d9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1dc: bipush 0
      // 1dd: swap
      // 1de: aastore
      // 1df: ldc2_w -5426637963800184112
      // 1e2: lload 5
      // 1e4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[[Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: astore 30
      // 1eb: aload 30
      // 1ed: arraylength
      // 1ee: iload 27
      // 1f0: lload 5
      // 1f2: lconst_0
      // 1f3: lcmp
      // 1f4: iflt 208
      // 1f7: ifne 252
      // 1fa: sipush 1835
      // 1fd: ldc2_w 280810475460644538
      // 200: lload 5
      // 202: lxor
      // 203: invokedynamic z (IJ)I bsm=com/zelix/wq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: if_icmple 251
      // 20b: goto 219
      // 20e: ldc2_w -5851531344909531390
      // 211: lload 5
      // 213: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: athrow
      // 219: bipush 2
      // 21a: aload 30
      // 21c: bipush 0
      // 21d: aaload
      // 21e: arraylength
      // 21f: multianewarray 303 2
      // 223: astore 31
      // 225: aload 30
      // 227: bipush 0
      // 228: aaload
      // 229: bipush 0
      // 22a: aload 31
      // 22c: bipush 0
      // 22d: aaload
      // 22e: bipush 0
      // 22f: aload 30
      // 231: bipush 0
      // 232: aaload
      // 233: arraylength
      // 234: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 237: aload 30
      // 239: aload 30
      // 23b: arraylength
      // 23c: bipush 1
      // 23d: isub
      // 23e: aaload
      // 23f: bipush 0
      // 240: aload 31
      // 242: bipush 1
      // 243: aaload
      // 244: bipush 0
      // 245: aload 30
      // 247: bipush 1
      // 248: aaload
      // 249: arraylength
      // 24a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 24d: aload 31
      // 24f: astore 30
      // 251: bipush 0
      // 252: istore 31
      // 254: sipush 32668
      // 257: bipush 0
      // 258: istore 32
      // 25a: ldc2_w 7336316791135188494
      // 25d: lload 5
      // 25f: lxor
      // 260: invokedynamic z (IJ)I bsm=com/zelix/wq.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: istore 33
      // 267: bipush -1
      // 268: istore 34
      // 26a: new java/util/ArrayList
      // 26d: dup
      // 26e: aload 8
      // 270: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 273: astore 35
      // 275: aload 2
      // 276: lload 13
      // 278: bipush 2
      // 279: anewarray 298
      // 27c: dup_x2
      // 27d: dup_x2
      // 27e: pop
      // 27f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 282: bipush 1
      // 283: swap
      // 284: aastore
      // 285: dup_x1
      // 286: swap
      // 287: bipush 0
      // 288: swap
      // 289: aastore
      // 28a: ldc2_w -6058656063212699216
      // 28d: lload 5
      // 28f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: astore 36
      // 296: bipush 0
      // 297: istore 37
      // 299: iload 37
      // 29b: aload 30
      // 29d: arraylength
      // 29e: if_icmpge 3d5
      // 2a1: lload 21
      // 2a3: bipush 1
      // 2a4: anewarray 298
      // 2a7: dup_x2
      // 2a8: dup_x2
      // 2a9: pop
      // 2aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ad: bipush 0
      // 2ae: swap
      // 2af: aastore
      // 2b0: ldc2_w -5820463305548543658
      // 2b3: lload 5
      // 2b5: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: astore 38
      // 2bc: lload 21
      // 2be: bipush 1
      // 2bf: anewarray 298
      // 2c2: dup_x2
      // 2c3: dup_x2
      // 2c4: pop
      // 2c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c8: bipush 0
      // 2c9: swap
      // 2ca: aastore
      // 2cb: ldc2_w -5820463305548543658
      // 2ce: lload 5
      // 2d0: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: astore 39
      // 2d7: aload 28
      // 2d9: arraylength
      // 2da: anewarray 288
      // 2dd: astore 40
      // 2df: aload 0
      // 2e0: iload 7
      // 2e2: aload 28
      // 2e4: aload 30
      // 2e6: iload 37
      // 2e8: aaload
      // 2e9: lload 15
      // 2eb: dup2_x1
      // 2ec: pop2
      // 2ed: aload 3
      // 2ee: aload 4
      // 2f0: aload 36
      // 2f2: aload 35
      // 2f4: aload 38
      // 2f6: aload 39
      // 2f8: bipush 10
      // 2fa: anewarray 298
      // 2fd: dup_x1
      // 2fe: swap
      // 2ff: bipush 9
      // 301: swap
      // 302: aastore
      // 303: dup_x1
      // 304: swap
      // 305: bipush 8
      // 307: swap
      // 308: aastore
      // 309: dup_x1
      // 30a: swap
      // 30b: bipush 7
      // 30d: swap
      // 30e: aastore
      // 30f: dup_x1
      // 310: swap
      // 311: bipush 6
      // 313: swap
      // 314: aastore
      // 315: dup_x1
      // 316: swap
      // 317: bipush 5
      // 318: swap
      // 319: aastore
      // 31a: dup_x1
      // 31b: swap
      // 31c: bipush 4
      // 31d: swap
      // 31e: aastore
      // 31f: dup_x1
      // 320: swap
      // 321: bipush 3
      // 322: swap
      // 323: aastore
      // 324: dup_x2
      // 325: dup_x2
      // 326: pop
      // 327: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32a: bipush 2
      // 32b: swap
      // 32c: aastore
      // 32d: dup_x1
      // 32e: swap
      // 32f: bipush 1
      // 330: swap
      // 331: aastore
      // 332: dup_x1
      // 333: swap
      // 334: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 337: bipush 0
      // 338: swap
      // 339: aastore
      // 33a: ldc2_w -5886934212800708972
      // 33d: lload 5
      // 33f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: astore 40
      // 346: bipush 0
      // 347: istore 41
      // 349: aload 40
      // 34b: astore 42
      // 34d: aload 42
      // 34f: lload 5
      // 351: lconst_0
      // 352: lcmp
      // 353: ifle 47a
      // 356: arraylength
      // 357: istore 43
      // 359: iload 27
      // 35b: ifne 478
      // 35e: bipush 0
      // 35f: istore 44
      // 361: iload 44
      // 363: iload 43
      // 365: if_icmpge 3a4
      // 368: aload 42
      // 36a: iload 44
      // 36c: aaload
      // 36d: astore 45
      // 36f: iload 41
      // 371: aload 45
      // 373: lload 25
      // 375: invokevirtual com/zelix/hq.z (J)I
      // 378: iadd
      // 379: istore 41
      // 37b: iinc 44 1
      // 37e: iload 27
      // 380: lload 5
      // 382: lconst_0
      // 383: lcmp
      // 384: iflt 3d2
      // 387: ifne 3d0
      // 38a: iload 27
      // 38c: ifeq 361
      // 38f: lload 5
      // 391: lconst_0
      // 392: lcmp
      // 393: ifle 37e
      // 396: goto 3a4
      // 399: ldc2_w -5851531344909531390
      // 39c: lload 5
      // 39e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: athrow
      // 3a4: iload 41
      // 3a6: iload 27
      // 3a8: lload 5
      // 3aa: lconst_0
      // 3ab: lcmp
      // 3ac: ifle 3b4
      // 3af: ifne 3cb
      // 3b2: iload 33
      // 3b4: if_icmpge 3cd
      // 3b7: goto 3c5
      // 3ba: ldc2_w -5851531344909531390
      // 3bd: lload 5
      // 3bf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c4: athrow
      // 3c5: iload 41
      // 3c7: istore 33
      // 3c9: iload 37
      // 3cb: istore 34
      // 3cd: iinc 37 1
      // 3d0: iload 27
      // 3d2: ifeq 299
      // 3d5: lload 21
      // 3d7: bipush 1
      // 3d8: anewarray 298
      // 3db: dup_x2
      // 3dc: dup_x2
      // 3dd: pop
      // 3de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e1: bipush 0
      // 3e2: swap
      // 3e3: aastore
      // 3e4: ldc2_w -5820463305548543658
      // 3e7: lload 5
      // 3e9: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ee: astore 37
      // 3f0: lload 21
      // 3f2: bipush 1
      // 3f3: anewarray 298
      // 3f6: dup_x2
      // 3f7: dup_x2
      // 3f8: pop
      // 3f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3fc: bipush 0
      // 3fd: swap
      // 3fe: aastore
      // 3ff: ldc2_w -5820463305548543658
      // 402: lload 5
      // 404: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 409: astore 38
      // 40b: aload 0
      // 40c: iload 7
      // 40e: aload 28
      // 410: aload 30
      // 412: iload 34
      // 414: aaload
      // 415: lload 15
      // 417: dup2_x1
      // 418: pop2
      // 419: aload 3
      // 41a: aload 4
      // 41c: aload 2
      // 41d: aload 8
      // 41f: aload 37
      // 421: aload 38
      // 423: bipush 10
      // 425: anewarray 298
      // 428: dup_x1
      // 429: swap
      // 42a: bipush 9
      // 42c: swap
      // 42d: aastore
      // 42e: dup_x1
      // 42f: swap
      // 430: bipush 8
      // 432: swap
      // 433: aastore
      // 434: dup_x1
      // 435: swap
      // 436: bipush 7
      // 438: swap
      // 439: aastore
      // 43a: dup_x1
      // 43b: swap
      // 43c: bipush 6
      // 43e: swap
      // 43f: aastore
      // 440: dup_x1
      // 441: swap
      // 442: bipush 5
      // 443: swap
      // 444: aastore
      // 445: dup_x1
      // 446: swap
      // 447: bipush 4
      // 448: swap
      // 449: aastore
      // 44a: dup_x1
      // 44b: swap
      // 44c: bipush 3
      // 44d: swap
      // 44e: aastore
      // 44f: dup_x2
      // 450: dup_x2
      // 451: pop
      // 452: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 455: bipush 2
      // 456: swap
      // 457: aastore
      // 458: dup_x1
      // 459: swap
      // 45a: bipush 1
      // 45b: swap
      // 45c: aastore
      // 45d: dup_x1
      // 45e: swap
      // 45f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 462: bipush 0
      // 463: swap
      // 464: aastore
      // 465: ldc2_w -5886934212800708972
      // 468: lload 5
      // 46a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hq; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46f: lload 5
      // 471: lconst_0
      // 472: lcmp
      // 473: iflt 47a
      // 476: astore 29
      // 478: aload 29
      // 47a: areturn
   }

   public wq(be param1, yg param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/wq.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: lload 3
      // 07: dup2
      // 08: ldc2_w 36091144577466
      // 0b: lxor
      // 0c: dup2
      // 0d: bipush 32
      // 0f: lushr
      // 10: l2i
      // 11: istore 5
      // 13: dup2
      // 14: bipush 32
      // 16: lshl
      // 17: bipush 48
      // 19: lushr
      // 1a: l2i
      // 1b: istore 6
      // 1d: dup2
      // 1e: bipush 48
      // 20: lshl
      // 21: bipush 48
      // 23: lushr
      // 24: l2i
      // 25: istore 7
      // 27: pop2
      // 28: dup2
      // 29: ldc2_w 4666049139088
      // 2c: lxor
      // 2d: lstore 8
      // 2f: dup2
      // 30: ldc2_w 136420498353173
      // 33: lxor
      // 34: lstore 10
      // 36: pop2
      // 37: ldc2_w 1432943210865462656
      // 3a: lload 3
      // 3b: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: aload 0
      // 41: invokespecial java/lang/Object.<init> ()V
      // 44: aload 0
      // 45: aload 1
      // 46: lload 8
      // 48: bipush 1
      // 49: anewarray 298
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 0
      // 53: swap
      // 54: aastore
      // 55: ldc2_w 1288585787655860681
      // 58: lload 3
      // 59: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_ov; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: putfield com/zelix/wq.F Lcom/zelix/_ov;
      // 61: istore 12
      // 63: aload 0
      // 64: aload 1
      // 65: putfield com/zelix/wq.f Lcom/zelix/be;
      // 68: aload 0
      // 69: aload 2
      // 6a: iload 12
      // 6c: ifeq cf
      // 6f: putfield com/zelix/wq.u Lcom/zelix/yg;
      // 72: ldc2_w 1615036150846649502
      // 75: lload 3
      // 76: invokedynamic o (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: ifeq c0
      // 7e: goto 8b
      // 81: ldc2_w 1353438294917921537
      // 84: lload 3
      // 85: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: aload 0
      // 8c: aload 2
      // 8d: lload 10
      // 8f: bipush 1
      // 90: anewarray 298
      // 93: dup_x2
      // 94: dup_x2
      // 95: pop
      // 96: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 99: bipush 0
      // 9a: swap
      // 9b: aastore
      // 9c: ldc2_w 1238561962802917024
      // 9f: lload 3
      // a0: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_kz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: putfield com/zelix/wq.K [Lcom/zelix/_kz;
      // a8: lload 3
      // a9: lconst_0
      // aa: lcmp
      // ab: iflt e5
      // ae: iload 12
      // b0: ifne d5
      // b3: goto c0
      // b6: ldc2_w 1353438294917921537
      // b9: lload 3
      // ba: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: aload 0
      // c1: aload 2
      // c2: goto cf
      // c5: ldc2_w 1353438294917921537
      // c8: lload 3
      // c9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: athrow
      // cf: invokevirtual com/zelix/yg.P ()[Lcom/zelix/_kz;
      // d2: putfield com/zelix/wq.K [Lcom/zelix/_kz;
      // d5: aload 0
      // d6: aload 1
      // d7: iload 5
      // d9: iload 6
      // db: i2s
      // dc: iload 7
      // de: i2s
      // df: invokevirtual com/zelix/be.V (ISS)Ljava/lang/String;
      // e2: putfield com/zelix/wq.U Ljava/lang/String;
      // e5: return
   }

   private boolean[][] S(Object[] var1) {
      int var6 = (Integer)var1[0];
      Integer[] var2 = (Integer[])var1[1];
      long var4 = (Long)var1[2];
      boolean[][] var3 = (boolean[][])var1[3];
      var4 = a ^ var4;
      long var7 = var4 ^ 82223745434772L;
      long var9 = var4 ^ 21399654202359L;
      Object[] var10005 = new Object[]{null, var2, var7};
      var10005[0] = var6;
      boolean[] var11 = x44.a<"j">(this, var10005, 2029515490367900562L, var4);
      var10005 = new Object[]{null, var6, var11, var3};
      var10005[0] = var9;
      return x44.a<"t">(var10005, 2218393070100237650L, var4);
   }

   static boolean[][] k(Object[] param0) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 2
      // 015: pop
      // 016: getstatic com/zelix/wq.a J
      // 019: lload 2
      // 01a: lxor
      // 01b: lstore 2
      // 01c: ldc2_w 4539806127724470626
      // 01f: lload 2
      // 020: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: istore 4
      // 027: ldc2_w 4269970295604809812
      // 02a: lload 2
      // 02b: invokedynamic m (JJ)[[[Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: iload 1
      // 031: aaload
      // 032: iload 4
      // 034: ifeq 12c
      // 037: ifnonnull 121
      // 03a: goto 047
      // 03d: ldc2_w 4479418246569072611
      // 040: lload 2
      // 041: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: athrow
      // 047: ldc2_w 2.0
      // 04a: iload 1
      // 04b: i2d
      // 04c: ldc2_w 2882248246466398875
      // 04f: lload 2
      // 050: invokedynamic t (DDJJ)D bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: d2i
      // 056: istore 5
      // 058: iload 5
      // 05a: iload 1
      // 05b: multianewarray 303 2
      // 05f: astore 6
      // 061: bipush 0
      // 062: istore 7
      // 064: iload 7
      // 066: iload 1
      // 067: if_icmpge 10e
      // 06a: ldc2_w 2.0
      // 06d: iload 7
      // 06f: bipush 1
      // 070: iadd
      // 071: i2d
      // 072: ldc2_w 2882248246466398875
      // 075: lload 2
      // 076: invokedynamic t (DDJJ)D bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: d2i
      // 07c: istore 8
      // 07e: iload 5
      // 080: iload 8
      // 082: idiv
      // 083: istore 9
      // 085: bipush 1
      // 086: istore 10
      // 088: bipush 0
      // 089: istore 11
      // 08b: iload 4
      // 08d: lload 2
      // 08e: lconst_0
      // 08f: lcmp
      // 090: iflt 097
      // 093: ifeq 121
      // 096: bipush 0
      // 097: istore 12
      // 099: iload 12
      // 09b: iload 5
      // 09d: if_icmpge 100
      // 0a0: iinc 11 1
      // 0a3: iload 4
      // 0a5: lload 2
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 0fd
      // 0ab: ifeq 0fb
      // 0ae: iload 11
      // 0b0: iload 9
      // 0b2: iload 4
      // 0b4: ifeq 067
      // 0b7: lload 2
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 082
      // 0bd: goto 0ca
      // 0c0: ldc2_w 4479418246569072611
      // 0c3: lload 2
      // 0c4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: if_icmple 0ee
      // 0cd: bipush 1
      // 0ce: istore 11
      // 0d0: iload 10
      // 0d2: iload 4
      // 0d4: ifeq 0e8
      // 0d7: ifne 0eb
      // 0da: goto 0e7
      // 0dd: ldc2_w 4479418246569072611
      // 0e0: lload 2
      // 0e1: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: bipush 1
      // 0e8: goto 0ec
      // 0eb: bipush 0
      // 0ec: istore 10
      // 0ee: aload 6
      // 0f0: iload 12
      // 0f2: aaload
      // 0f3: iload 7
      // 0f5: iload 10
      // 0f7: bastore
      // 0f8: iinc 12 1
      // 0fb: iload 4
      // 0fd: ifne 099
      // 100: iinc 7 1
      // 103: iload 4
      // 105: lload 2
      // 106: lconst_0
      // 107: lcmp
      // 108: iflt 0a5
      // 10b: ifne 064
      // 10e: ldc2_w 4269970295604809812
      // 111: lload 2
      // 112: invokedynamic m (JJ)[[[Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: iload 1
      // 118: lload 2
      // 119: lconst_0
      // 11a: lcmp
      // 11b: iflt 12b
      // 11e: aload 6
      // 120: aastore
      // 121: ldc2_w 4269970295604809812
      // 124: lload 2
      // 125: invokedynamic m (JJ)[[[Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: iload 1
      // 12b: aaload
      // 12c: areturn
   }

   static {
      long var20 = a ^ 139878329583241L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "\u0087ø¹5¦Ò2ÿí\u0086|\u0082DÖ\u0083\u0094\u009c \u0090%üm\u009ca\u0014ïz\u009cï\u0006«\u0097\u009eÙæ\u001b\u009d\u0099þ\u0002\u0010úþ¬d7I8\u009fv#Õ\u0080_Îî\u0098\u0010ì\u009bLf\u0005à(\u008fÏä¸1u£OÐ";
      int var17 = "\u0087ø¹5¦Ò2ÿí\u0086|\u0082DÖ\u0083\u0094\u009c \u0090%üm\u009ca\u0014ïz\u009cï\u0006«\u0097\u009eÙæ\u001b\u009d\u0099þ\u0002\u0010úþ¬d7I8\u009fv#Õ\u0080_Îî\u0098\u0010ì\u009bLf\u0005à(\u008fÏä¸1u£OÐ"
         .length();
      char var14 = '(';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[5];
                     h = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "\u0097\r²È\u0003«\u0011\u0088³\u007f\u001fG\u0089Å\u0018Á\u0004\u0085\u0011o$Ë\u008f¦oc±ÉÒ\u001d\u0015;\u0086à\u009fÜè\u0013í\u0085K£TéÂ{\u0002\u001d";
                     int var5 = "\u0097\r²È\u0003«\u0011\u0088³\u007f\u001fG\u0089Å\u0018Á\u0004\u0085\u0011o$Ë\u008f¦oc±ÉÒ\u001d\u0015;\u0086à\u009fÜè\u0013í\u0085K£TéÂ{\u0002\u001d"
                        .length();
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
                                    g = new Integer[8];
                                    x44.a<"v">(new boolean[b<"z">(8265, 2375812354766818592L ^ var20)][][], 1106337867911504975L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "·AÐ\u000f$ÃÑ\u0084\u00ad\u0080@Ú\u0086¨?À";
                                 var5 = "·AÐ\u000f$ÃÑ\u0084\u00ad\u0080@Ú\u0086¨?À".length();
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

                  var15 = "Ø¾\u0086´jh\n\fæ(û¨\u001a\u0018²¬e\u0089e~\u0091×Ò;DdJ.ëx:qb4Õ\u0016Û\u0097!\u0092\u0010\u001e\u0083\u008f\u008a\u0092j\u0017¤Õ?\u0098N\u001b±\u0003ù";
                  var17 = "Ø¾\u0086´jh\n\fæ(û¨\u001a\u0018²¬e\u0089e~\u0091×Ò;DdJ.ëx:qb4Õ\u0016Û\u0097!\u0092\u0010\u001e\u0083\u008f\u008a\u0092j\u0017¤Õ?\u0098N\u001b±\u0003ù"
                     .length();
                  var14 = '(';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   private int A(Object[] param1) {
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
      // 04: checkcast [Lcom/zelix/n;
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/wq.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w 4486875719405838374
      // 1d: lload 2
      // 1e: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: bipush -1
      // 24: istore 6
      // 26: aload 4
      // 28: arraylength
      // 29: bipush 1
      // 2a: isub
      // 2b: istore 7
      // 2d: istore 5
      // 2f: iload 7
      // 31: iflt 9d
      // 34: aload 4
      // 36: iload 7
      // 38: aaload
      // 39: bipush 0
      // 3a: anewarray 298
      // 3d: ldc2_w 4296862222645862558
      // 40: lload 2
      // 41: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: iload 5
      // 48: lload 2
      // 49: lconst_0
      // 4a: lcmp
      // 4b: iflt 53
      // 4e: ifeq 9f
      // 51: iload 5
      // 53: ifeq 75
      // 56: goto 63
      // 59: ldc2_w 4570629184758290087
      // 5c: lload 2
      // 5d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: ifne 82
      // 66: goto 73
      // 69: ldc2_w 4570629184758290087
      // 6c: lload 2
      // 6d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: iload 7
      // 75: istore 6
      // 77: iload 5
      // 79: lload 2
      // 7a: lconst_0
      // 7b: lcmp
      // 7c: ifle 87
      // 7f: ifne 9d
      // 82: iinc 7 -1
      // 85: iload 5
      // 87: ifne 2f
      // 8a: lload 2
      // 8b: lconst_0
      // 8c: lcmp
      // 8d: iflt 34
      // 90: goto 9d
      // 93: ldc2_w 4570629184758290087
      // 96: lload 2
      // 97: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: iload 6
      // 9f: ireturn
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13465;
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
            throw new RuntimeException("com/zelix/wq", var10);
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
         throw new RuntimeException("com/zelix/wq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26784;
      if (g[var3] == null) {
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
            throw new RuntimeException("com/zelix/wq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("com/zelix/wq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
