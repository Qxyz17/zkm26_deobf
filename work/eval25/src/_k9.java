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

public class _k9 implements _89 {
   private _89 S;
   private vg l;
   private final Map s;
   private static _k9 L;
   private final Random x;
   private final ao K;
   private static final long a = ess.a(8231111572398373185L, 8991057437579590928L, MethodHandles.lookup().lookupClass()).a(271354972154090L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public long Q() {
      return 0L;
   }

   public Map B(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"s">(x44.a<"o">(this, -7510542216725963119L, var2), -8104948701531350336L, var2);
   }

   public void t(Object[] param1) {
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
      // 04: checkcast com/zelix/_89
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 0
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w -8782833208213324905
      // 20: lload 2
      // 21: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: istore 7
      // 28: aload 0
      // 29: iload 7
      // 2b: ifeq 57
      // 2e: aload 4
      // 30: if_acmpeq c0
      // 33: goto 40
      // 36: ldc2_w -9206762721422875367
      // 39: lload 2
      // 3a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: ldc2_w -7114466295690812546
      // 44: lload 2
      // 45: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_89; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: goto 57
      // 4d: ldc2_w -9206762721422875367
      // 50: lload 2
      // 51: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 7
      // 59: ifeq a1
      // 5c: ifnonnull 8a
      // 5f: goto 6c
      // 62: ldc2_w -9206762721422875367
      // 65: lload 2
      // 66: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 4
      // 6f: ldc2_w -7114466295690812546
      // 72: lload 2
      // 73: invokedynamic r (Ljava/lang/Object;Lcom/zelix/_89;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: iload 7
      // 7a: ifne c0
      // 7d: goto 8a
      // 80: ldc2_w -9206762721422875367
      // 83: lload 2
      // 84: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 0
      // 8b: ldc2_w -7114466295690812546
      // 8e: lload 2
      // 8f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_89; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: goto a1
      // 97: ldc2_w -9206762721422875367
      // 9a: lload 2
      // 9b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: aload 4
      // a3: lload 5
      // a5: bipush 2
      // a6: anewarray 61
      // a9: dup_x2
      // aa: dup_x2
      // ab: pop
      // ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // af: bipush 1
      // b0: swap
      // b1: aastore
      // b2: dup_x1
      // b3: swap
      // b4: bipush 0
      // b5: swap
      // b6: aastore
      // b7: ldc2_w -8861693791424062423
      // ba: lload 2
      // bb: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: return
   }

   static _k9 Y(Object[] var0) {
      Random var1 = (Random)var0[0];
      long var2 = (Long)var0[1];
      int var6 = (Integer)var0[2];
      List var5 = (List)var0[3];
      ao var4 = (ao)var0[4];
      var2 = a ^ var2;
      long var10001 = var2 ^ 98401247778570L;
      int var7 = (int)((var2 ^ 98401247778570L) >>> 48);
      int var8 = (int)((var2 ^ 98401247778570L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      x44.a<"p">(null, 2083815577773125827L, var2);
      return new _k9((short)var7, var1, var8, (char)var9, var6, var5, var4);
   }

   vg D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, 6786894172806557039L, var2);
   }

   public long j(Object[] var1) {
      long var2 = (Long)var1[0];
      return 0L;
   }

   public long x(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (Long)var1[1];
      return var2;
   }

   public boolean x(Object[] var1) {
      return false;
   }

   private _k9(short param1, Random param2, int param3, char param4, int param5, List param6, ao param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 3
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 4
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: getstatic com/zelix/_k9.a J
      // 01b: lxor
      // 01c: lstore 8
      // 01e: lload 8
      // 020: dup2
      // 021: ldc2_w 69372689962288
      // 024: lxor
      // 025: lstore 10
      // 027: dup2
      // 028: ldc2_w 14138759916323
      // 02b: lxor
      // 02c: lstore 12
      // 02e: dup2
      // 02f: ldc2_w 44121180691455
      // 032: lxor
      // 033: lstore 14
      // 035: dup2
      // 036: ldc2_w 68644691423380
      // 039: lxor
      // 03a: lstore 16
      // 03c: dup2
      // 03d: ldc2_w 132241602803983
      // 040: lxor
      // 041: lstore 18
      // 043: dup2
      // 044: ldc2_w 129753910638023
      // 047: lxor
      // 048: lstore 20
      // 04a: dup2
      // 04b: ldc2_w 116678160929305
      // 04e: lxor
      // 04f: lstore 22
      // 051: pop2
      // 052: aload 0
      // 053: invokespecial java/lang/Object.<init> ()V
      // 056: aload 0
      // 057: aload 2
      // 058: putfield com/zelix/_k9.x Ljava/util/Random;
      // 05b: aload 0
      // 05c: iload 5
      // 05e: lload 18
      // 060: invokestatic com/zelix/sh.Q (IJ)I
      // 063: lload 16
      // 065: bipush 2
      // 066: anewarray 61
      // 069: dup_x2
      // 06a: dup_x2
      // 06b: pop
      // 06c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06f: bipush 1
      // 070: swap
      // 071: aastore
      // 072: dup_x1
      // 073: swap
      // 074: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 077: bipush 0
      // 078: swap
      // 079: aastore
      // 07a: ldc2_w 5663180084473317668
      // 07d: lload 8
      // 07f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: putfield com/zelix/_k9.s Ljava/util/Map;
      // 087: ldc2_w 6060863942478925649
      // 08a: lload 8
      // 08c: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: aload 0
      // 092: aload 7
      // 094: putfield com/zelix/_k9.K Lcom/zelix/ao;
      // 097: aload 0
      // 098: ldc2_w 5326464407699842499
      // 09b: lload 8
      // 09d: invokedynamic p (Lcom/zelix/_k9;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: bipush 0
      // 0a3: istore 25
      // 0a5: istore 24
      // 0a7: aload 0
      // 0a8: new com/zelix/vg
      // 0ab: dup
      // 0ac: iload 5
      // 0ae: lload 12
      // 0b0: invokespecial com/zelix/vg.<init> (IJ)V
      // 0b3: ldc2_w 5332495960585320768
      // 0b6: lload 8
      // 0b8: invokedynamic r (Ljava/lang/Object;Lcom/zelix/vg;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: new com/zelix/xx
      // 0c0: dup
      // 0c1: bipush 0
      // 0c2: invokespecial com/zelix/xx.<init> (Z)V
      // 0c5: astore 26
      // 0c7: bipush 0
      // 0c8: istore 27
      // 0ca: aload 26
      // 0cc: invokevirtual com/zelix/xx.S ()Z
      // 0cf: ifne 225
      // 0d2: aload 0
      // 0d3: lload 10
      // 0d5: bipush 1
      // 0d6: anewarray 61
      // 0d9: dup_x2
      // 0da: dup_x2
      // 0db: pop
      // 0dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: ldc2_w 5356502682362599500
      // 0e5: lload 8
      // 0e7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: lstore 28
      // 0ee: aload 7
      // 0f0: lload 28
      // 0f2: lload 20
      // 0f4: aload 26
      // 0f6: bipush 3
      // 0f7: anewarray 61
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 2
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x2
      // 100: dup_x2
      // 101: pop
      // 102: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 105: bipush 1
      // 106: swap
      // 107: aastore
      // 108: dup_x2
      // 109: dup_x2
      // 10a: pop
      // 10b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10e: bipush 0
      // 10f: swap
      // 110: aastore
      // 111: ldc2_w 5636505620048194255
      // 114: lload 8
      // 116: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_89; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: checkcast com/zelix/sm
      // 11e: astore 30
      // 120: aload 6
      // 122: lload 28
      // 124: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 127: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 12c: pop
      // 12d: iload 25
      // 12f: iload 24
      // 131: ifne 15b
      // 134: ifne 176
      // 137: goto 145
      // 13a: ldc2_w 5409736987127524913
      // 13d: lload 8
      // 13f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: aload 2
      // 146: iload 5
      // 148: bipush 2
      // 149: idiv
      // 14a: invokevirtual java/util/Random.nextInt (I)I
      // 14d: goto 15b
      // 150: ldc2_w 5409736987127524913
      // 153: lload 8
      // 155: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: ifne 176
      // 15e: aload 0
      // 15f: astore 31
      // 161: bipush 1
      // 162: istore 25
      // 164: aload 6
      // 166: aload 0
      // 167: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16c: pop
      // 16d: iload 3
      // 16e: ifle 204
      // 171: iload 24
      // 173: ifeq 1ce
      // 176: aload 0
      // 177: lload 10
      // 179: bipush 1
      // 17a: anewarray 61
      // 17d: dup_x2
      // 17e: dup_x2
      // 17f: pop
      // 180: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 183: bipush 0
      // 184: swap
      // 185: aastore
      // 186: ldc2_w 5356502682362599500
      // 189: lload 8
      // 18b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: lstore 32
      // 192: aload 7
      // 194: lload 32
      // 196: lload 20
      // 198: aload 26
      // 19a: bipush 3
      // 19b: anewarray 61
      // 19e: dup_x1
      // 19f: swap
      // 1a0: bipush 2
      // 1a1: swap
      // 1a2: aastore
      // 1a3: dup_x2
      // 1a4: dup_x2
      // 1a5: pop
      // 1a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a9: bipush 1
      // 1aa: swap
      // 1ab: aastore
      // 1ac: dup_x2
      // 1ad: dup_x2
      // 1ae: pop
      // 1af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b2: bipush 0
      // 1b3: swap
      // 1b4: aastore
      // 1b5: ldc2_w 5636505620048194255
      // 1b8: lload 8
      // 1ba: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_89; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: astore 31
      // 1c1: aload 6
      // 1c3: lload 32
      // 1c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1cd: pop
      // 1ce: aload 0
      // 1cf: ldc2_w 5332495960585320768
      // 1d2: lload 8
      // 1d4: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/vg; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: aload 30
      // 1db: lload 14
      // 1dd: bipush 1
      // 1de: anewarray 61
      // 1e1: dup_x2
      // 1e2: dup_x2
      // 1e3: pop
      // 1e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e7: bipush 0
      // 1e8: swap
      // 1e9: aastore
      // 1ea: ldc2_w 5470327203675903466
      // 1ed: lload 8
      // 1ef: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: aload 30
      // 1f6: lload 22
      // 1f8: aload 31
      // 1fa: ldc2_w 5507170238459074598
      // 1fd: lload 8
      // 1ff: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: aload 0
      // 205: ldc2_w 6248533394743730147
      // 208: lload 8
      // 20a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: aload 30
      // 211: aload 31
      // 213: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 218: checkcast com/zelix/_89
      // 21b: astore 32
      // 21d: iinc 27 1
      // 220: iload 24
      // 222: ifeq 0ca
      // 225: return
   }

   public boolean k(int param1, short param2, _89 param3, char param4) {
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
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: lstore 5
      // 1a: ldc2_w -2237820386564981828
      // 1d: lload 5
      // 1f: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 7
      // 26: aload 0
      // 27: iload 7
      // 29: ifne 4c
      // 2c: aload 3
      // 2d: if_acmpne 4b
      // 30: goto 3e
      // 33: ldc2_w -537990174369060
      // 36: lload 5
      // 38: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: bipush 1
      // 3f: ireturn
      // 40: ldc2_w -537990174369060
      // 43: lload 5
      // 45: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 3
      // 4c: instanceof com/zelix/_k9
      // 4f: iload 7
      // 51: ifne 99
      // 54: ifeq 98
      // 57: goto 65
      // 5a: ldc2_w -537990174369060
      // 5d: lload 5
      // 5f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 0
      // 66: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 69: aload 3
      // 6a: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 6d: isub
      // 6e: iload 7
      // 70: ifne 93
      // 73: goto 81
      // 76: ldc2_w -537990174369060
      // 79: lload 5
      // 7b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: ifgt 96
      // 84: goto 92
      // 87: ldc2_w -537990174369060
      // 8a: lload 5
      // 8c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: bipush 1
      // 93: goto 97
      // 96: bipush 0
      // 97: ireturn
      // 98: bipush 0
      // 99: ireturn
   }

   private long Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 129079219106551L;
      long var6 = var2 ^ 111307073794047L;
      long var8 = var2 ^ 5496530773829L;
      int var10 = x44.a<"o">(this, -7191055560474138657L, var2).nextInt(a<"d">(10702, 1831043183233547785L ^ var2));
      long var11 = x44.a<"k">(x44.a<"o">(this, -9138067489523516293L, var2), new Object[]{var6}, -7223372411954169909L, var2);
      int var13 = x44.a<"o">(this, -7191055560474138657L, var2).nextInt(a<"d">(6656, 1726075155986058694L ^ var2));
      Object[] var10006 = new Object[]{
         null, null, null, var13, x44.a<"k">(x44.a<"o">(this, -9138067489523516293L, var2), new Object[]{var4}, -7318408867142228596L, var2)
      };
      var10006[2] = var11;
      var10006[1] = var10;
      var10006[0] = var8;
      return x44.a<"s">(var10006, -8915577904583591984L, var2);
   }

   static {
      long var0 = a ^ 51269424032121L;
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
      String var6 = "\u009c.p¥ëèîÖØç\u0010°ò£å#";
      int var7 = "\u009c.p¥ëèîÖØç\u0010°ò£å#".length();
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

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 206;
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
            throw new RuntimeException("com/zelix/_k9", var14);
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
         throw new RuntimeException("com/zelix/_k9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
