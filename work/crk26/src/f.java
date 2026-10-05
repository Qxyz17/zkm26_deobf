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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class f implements lun {
   private final lku U;
   private static f A;
   private lqh R;
   private final Random S;
   private final Map L;
   private lun B;
   private static final long a = prr.a(-2329477946324723277L, 5813065597629915355L, MethodHandles.lookup().lookupClass()).a(112149215160217L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public long J(Object[] var1) {
      long var2 = (Long)var1[0];
      return 0L;
   }

   private f(Random param1, int param2, List param3, long param4, lku param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/f.a J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 46392747132234
      // 00e: lxor
      // 00f: lstore 7
      // 011: dup2
      // 012: ldc2_w 51963719824872
      // 015: lxor
      // 016: lstore 9
      // 018: dup2
      // 019: ldc2_w 109691965287336
      // 01c: lxor
      // 01d: lstore 11
      // 01f: dup2
      // 020: ldc2_w 34207914939316
      // 023: lxor
      // 024: lstore 13
      // 026: dup2
      // 027: ldc2_w 86501826629051
      // 02a: lxor
      // 02b: lstore 15
      // 02d: dup2
      // 02e: ldc2_w 11288425685595
      // 031: lxor
      // 032: dup2
      // 033: bipush 32
      // 035: lushr
      // 036: l2i
      // 037: istore 17
      // 039: dup2
      // 03a: bipush 32
      // 03c: lshl
      // 03d: bipush 48
      // 03f: lushr
      // 040: l2i
      // 041: istore 18
      // 043: dup2
      // 044: bipush 48
      // 046: lshl
      // 047: bipush 48
      // 049: lushr
      // 04a: l2i
      // 04b: istore 19
      // 04d: pop2
      // 04e: dup2
      // 04f: ldc2_w 105037313037270
      // 052: lxor
      // 053: lstore 20
      // 055: pop2
      // 056: ldc2_w -8621788281115569934
      // 059: lload 4
      // 05b: invokedynamic i (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: aload 0
      // 061: invokespecial java/lang/Object.<init> ()V
      // 064: aload 0
      // 065: aload 1
      // 066: putfield com/zelix/f.S Ljava/util/Random;
      // 069: aload 0
      // 06a: iload 2
      // 06b: iload 17
      // 06d: iload 18
      // 06f: i2c
      // 070: iload 19
      // 072: i2s
      // 073: invokestatic com/zelix/cf.x (IICS)I
      // 076: lload 15
      // 078: bipush 2
      // 079: anewarray 124
      // 07c: dup_x2
      // 07d: dup_x2
      // 07e: pop
      // 07f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 082: bipush 1
      // 083: swap
      // 084: aastore
      // 085: dup_x1
      // 086: swap
      // 087: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w -8540510970281653094
      // 090: lload 4
      // 092: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: putfield com/zelix/f.L Ljava/util/Map;
      // 09a: aload 0
      // 09b: aload 6
      // 09d: putfield com/zelix/f.U Lcom/zelix/lku;
      // 0a0: aload 0
      // 0a1: ldc2_w -8524879920074786127
      // 0a4: lload 4
      // 0a6: invokedynamic j (Lcom/zelix/f;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: astore 22
      // 0ad: bipush 0
      // 0ae: istore 23
      // 0b0: aload 0
      // 0b1: new com/zelix/lqh
      // 0b4: dup
      // 0b5: lload 13
      // 0b7: iload 2
      // 0b8: invokespecial com/zelix/lqh.<init> (JI)V
      // 0bb: ldc2_w -8170511098320475142
      // 0be: lload 4
      // 0c0: invokedynamic u (Ljava/lang/Object;Lcom/zelix/lqh;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: new com/zelix/zr
      // 0c8: dup
      // 0c9: bipush 0
      // 0ca: invokespecial com/zelix/zr.<init> (Z)V
      // 0cd: astore 24
      // 0cf: bipush 0
      // 0d0: istore 25
      // 0d2: aload 24
      // 0d4: invokevirtual com/zelix/zr.S ()Z
      // 0d7: ifne 22c
      // 0da: aload 0
      // 0db: lload 7
      // 0dd: bipush 1
      // 0de: anewarray 124
      // 0e1: dup_x2
      // 0e2: dup_x2
      // 0e3: pop
      // 0e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e7: bipush 0
      // 0e8: swap
      // 0e9: aastore
      // 0ea: ldc2_w -8040755230922653966
      // 0ed: lload 4
      // 0ef: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: lstore 26
      // 0f6: aload 6
      // 0f8: lload 26
      // 0fa: aload 24
      // 0fc: lload 20
      // 0fe: bipush 3
      // 0ff: anewarray 124
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 2
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 1
      // 10e: swap
      // 10f: aastore
      // 110: dup_x2
      // 111: dup_x2
      // 112: pop
      // 113: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 116: bipush 0
      // 117: swap
      // 118: aastore
      // 119: ldc2_w -8610584667875249405
      // 11c: lload 4
      // 11e: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lun; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: checkcast com/zelix/f5
      // 126: astore 28
      // 128: aload 3
      // 129: lload 26
      // 12b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 133: pop
      // 134: iload 23
      // 136: aload 22
      // 138: ifnull 161
      // 13b: ifne 17e
      // 13e: goto 14c
      // 141: ldc2_w -7747062123961308079
      // 144: lload 4
      // 146: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: aload 1
      // 14d: iload 2
      // 14e: bipush 2
      // 14f: idiv
      // 150: invokevirtual java/util/Random.nextInt (I)I
      // 153: goto 161
      // 156: ldc2_w -7747062123961308079
      // 159: lload 4
      // 15b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: ifne 17e
      // 164: aload 0
      // 165: astore 29
      // 167: bipush 1
      // 168: istore 23
      // 16a: aload 3
      // 16b: aload 0
      // 16c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 171: pop
      // 172: aload 22
      // 174: lload 4
      // 176: lconst_0
      // 177: lcmp
      // 178: iflt 21f
      // 17b: ifnonnull 1d5
      // 17e: aload 0
      // 17f: lload 7
      // 181: bipush 1
      // 182: anewarray 124
      // 185: dup_x2
      // 186: dup_x2
      // 187: pop
      // 188: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18b: bipush 0
      // 18c: swap
      // 18d: aastore
      // 18e: ldc2_w -8040755230922653966
      // 191: lload 4
      // 193: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: lstore 30
      // 19a: aload 6
      // 19c: lload 30
      // 19e: aload 24
      // 1a0: lload 20
      // 1a2: bipush 3
      // 1a3: anewarray 124
      // 1a6: dup_x2
      // 1a7: dup_x2
      // 1a8: pop
      // 1a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ac: bipush 2
      // 1ad: swap
      // 1ae: aastore
      // 1af: dup_x1
      // 1b0: swap
      // 1b1: bipush 1
      // 1b2: swap
      // 1b3: aastore
      // 1b4: dup_x2
      // 1b5: dup_x2
      // 1b6: pop
      // 1b7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ba: bipush 0
      // 1bb: swap
      // 1bc: aastore
      // 1bd: ldc2_w -8610584667875249405
      // 1c0: lload 4
      // 1c2: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lun; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: astore 29
      // 1c9: aload 3
      // 1ca: lload 30
      // 1cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cf: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d4: pop
      // 1d5: aload 0
      // 1d6: ldc2_w -8170511098320475142
      // 1d9: lload 4
      // 1db: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/lqh; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: aload 28
      // 1e2: lload 9
      // 1e4: bipush 1
      // 1e5: anewarray 124
      // 1e8: dup_x2
      // 1e9: dup_x2
      // 1ea: pop
      // 1eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ee: bipush 0
      // 1ef: swap
      // 1f0: aastore
      // 1f1: ldc2_w -8615501475967173658
      // 1f4: lload 4
      // 1f6: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: aload 28
      // 1fd: aload 29
      // 1ff: lload 11
      // 201: ldc2_w -7653313965674917370
      // 204: lload 4
      // 206: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: aload 0
      // 20c: ldc2_w -7758077326451890405
      // 20f: lload 4
      // 211: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: aload 28
      // 218: aload 29
      // 21a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 21f: checkcast com/zelix/lun
      // 222: astore 30
      // 224: iinc 25 1
      // 227: aload 22
      // 229: ifnonnull 0d2
      // 22c: return
   }

   lqh Y(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      long var4 = ((long)var3 << 32 | (long)var2 << 32 >>> 32) ^ a;
      return m44.a<"r">(this, 3549307812734637095L, var4);
   }

   public long A(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      return var2;
   }

   public void n(Object[] param1) {
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
      // 04: checkcast com/zelix/lun
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: pop2
      // 1c: ldc2_w -5359217087332668149
      // 1f: lload 3
      // 20: invokedynamic h (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 7
      // 27: aload 0
      // 28: aload 7
      // 2a: ifnull 55
      // 2d: aload 2
      // 2e: if_acmpeq c2
      // 31: goto 3e
      // 34: ldc2_w -6231410397148540504
      // 37: lload 3
      // 38: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: ldc2_w -5294171783131837107
      // 42: lload 3
      // 43: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/lun; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: goto 55
      // 4b: ldc2_w -6231410397148540504
      // 4e: lload 3
      // 4f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: aload 7
      // 57: lload 3
      // 58: lconst_0
      // 59: lcmp
      // 5a: ifle b9
      // 5d: ifnull a4
      // 60: ifnonnull 8d
      // 63: goto 70
      // 66: ldc2_w -6231410397148540504
      // 69: lload 3
      // 6a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: aload 0
      // 71: aload 2
      // 72: ldc2_w -5294171783131837107
      // 75: lload 3
      // 76: invokedynamic t (Ljava/lang/Object;Lcom/zelix/lun;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: aload 7
      // 7d: ifnonnull c2
      // 80: goto 8d
      // 83: ldc2_w -6231410397148540504
      // 86: lload 3
      // 87: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: aload 0
      // 8e: ldc2_w -5294171783131837107
      // 91: lload 3
      // 92: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/lun; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: goto a4
      // 9a: ldc2_w -6231410397148540504
      // 9d: lload 3
      // 9e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: aload 2
      // a5: lload 5
      // a7: bipush 2
      // a8: anewarray 124
      // ab: dup_x2
      // ac: dup_x2
      // ad: pop
      // ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b1: bipush 1
      // b2: swap
      // b3: aastore
      // b4: dup_x1
      // b5: swap
      // b6: bipush 0
      // b7: swap
      // b8: aastore
      // b9: ldc2_w -5373873608731152303
      // bc: lload 3
      // bd: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: return
   }

   static f V(Object[] var0) {
      Random var5 = (Random)var0[0];
      int var4 = (Integer)var0[1];
      List var3 = (List)var0[2];
      long var1 = (Long)var0[3];
      lku var6 = (lku)var0[4];
      var1 = a ^ var1;
      long var7 = var1 ^ 31554939152498L;
      m44.a<"m">(null, 3994396826080724078L, var1);
      return new f(var5, var4, var3, var7, var6);
   }

   public long M() {
      return 0L;
   }

   public boolean Y(Object[] var1) {
      return false;
   }

   public Map A(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"j">(m44.a<"t">(this, 5311647857341922040L, var2), 5384547694142570094L, var2);
   }

   public boolean Y(int param1, short param2, int param3, lun param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: lstore 5
      // 19: ldc2_w 1889314222145110675
      // 1c: lload 5
      // 1e: invokedynamic h (JJ)[Lcom/zelix/_0; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 7
      // 25: aload 0
      // 26: aload 7
      // 28: ifnull 4d
      // 2b: aload 4
      // 2d: if_acmpne 4b
      // 30: goto 3e
      // 33: ldc2_w 440675946011409968
      // 36: lload 5
      // 38: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: bipush 1
      // 3f: ireturn
      // 40: ldc2_w 440675946011409968
      // 43: lload 5
      // 45: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 4
      // 4d: instanceof com/zelix/f
      // 50: aload 7
      // 52: ifnull 9b
      // 55: ifeq 9a
      // 58: goto 66
      // 5b: ldc2_w 440675946011409968
      // 5e: lload 5
      // 60: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 0
      // 67: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 6a: aload 4
      // 6c: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 6f: isub
      // 70: aload 7
      // 72: ifnull 95
      // 75: goto 83
      // 78: ldc2_w 440675946011409968
      // 7b: lload 5
      // 7d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: ifgt 98
      // 86: goto 94
      // 89: ldc2_w 440675946011409968
      // 8c: lload 5
      // 8e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: bipush 1
      // 95: goto 99
      // 98: bipush 0
      // 99: ireturn
      // 9a: bipush 0
      // 9b: ireturn
   }

   private long w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 43946877232173L;
      long var6 = var2 ^ 91652375595463L;
      long var8 = var2 ^ 134071980755957L;
      int var10 = m44.a<"p">(this, -2645598318929977716L, var2).nextInt(a<"c">(5283, 2826246347275278234L ^ var2));
      long var11 = m44.a<"q">(m44.a<"p">(this, -4454549101197115111L, var2), new Object[]{var8}, -2470649946449684598L, var2);
      int var13 = m44.a<"p">(this, -2645598318929977716L, var2).nextInt(a<"c">(28622, 5615116151693798646L ^ var2));
      Object[] var10006 = new Object[]{
         null, null, null, var13, m44.a<"q">(m44.a<"p">(this, -4454549101197115111L, var2), new Object[]{var4}, -2604312143017585989L, var2)
      };
      var10006[2] = var6;
      var10006[1] = var11;
      var10006[0] = var10;
      return m44.a<"n">(var10006, -4547077682292009119L, var2);
   }

   static {
      long var0 = a ^ 126065983633921L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "Ð\u0093¹\u0090*O\bÃÒF²7\u0095ÉFf";
      int var7 = "Ð\u0093¹\u0090*O\bÃÒF²7\u0095ÉFf".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(
            new byte[]{
               (byte)((int)(var10 >>> 56)),
               (byte)((int)(var10 >>> 48)),
               (byte)((int)(var10 >>> 40)),
               (byte)((int)(var10 >>> 32)),
               (byte)((int)(var10 >>> 24)),
               (byte)((int)(var10 >>> 16)),
               (byte)((int)(var10 >>> 8)),
               (byte)((int)var10)
            }
         );
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
   }

   private static n9 a(n9 var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22008;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/f", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("com/zelix/f" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
