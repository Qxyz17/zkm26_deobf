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

public class _8b extends _83 {
   private static final long f = ess.a(5708752881175956845L, -753505903616714673L, MethodHandles.lookup().lookupClass()).a(261596054840507L);
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public _8b(_xx param1, hu param2, _y4 param3, long param4, int param6, _y4 param7, _y4 param8, _y4 param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 4
      // 002: bipush 32
      // 004: lshl
      // 005: iload 6
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: getstatic com/zelix/_8b.f J
      // 012: lxor
      // 013: lstore 10
      // 015: lload 10
      // 017: dup2
      // 018: ldc2_w 50974757280336
      // 01b: lxor
      // 01c: lstore 12
      // 01e: dup2
      // 01f: ldc2_w 114987612745195
      // 022: lxor
      // 023: lstore 14
      // 025: dup2
      // 026: ldc2_w 57458541988841
      // 029: lxor
      // 02a: lstore 16
      // 02c: dup2
      // 02d: ldc2_w 84288516832044
      // 030: lxor
      // 031: lstore 18
      // 033: dup2
      // 034: ldc2_w 85036281541178
      // 037: lxor
      // 038: lstore 20
      // 03a: dup2
      // 03b: ldc2_w 103704687031527
      // 03e: lxor
      // 03f: lstore 22
      // 041: pop2
      // 042: aload 0
      // 043: aload 2
      // 044: lload 14
      // 046: invokespecial com/zelix/_83.<init> (Lcom/zelix/hz;J)V
      // 049: aload 1
      // 04a: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 04d: istore 25
      // 04f: new java/util/ArrayList
      // 052: dup
      // 053: invokespecial java/util/ArrayList.<init> ()V
      // 056: astore 26
      // 058: new java/util/ArrayList
      // 05b: dup
      // 05c: invokespecial java/util/ArrayList.<init> ()V
      // 05f: astore 27
      // 061: new java/util/ArrayList
      // 064: dup
      // 065: invokespecial java/util/ArrayList.<init> ()V
      // 068: astore 28
      // 06a: aload 0
      // 06b: iload 25
      // 06d: anewarray 74
      // 070: putfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 073: ldc2_w 2860837358546141778
      // 076: lload 10
      // 078: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: aload 0
      // 07e: new java/util/ArrayList
      // 081: dup
      // 082: bipush 5
      // 083: iload 25
      // 085: i2d
      // 086: ldc2_w 1.5
      // 089: dmul
      // 08a: d2i
      // 08b: invokestatic java/lang/Math.max (II)I
      // 08e: invokespecial java/util/ArrayList.<init> (I)V
      // 091: putfield com/zelix/_8b.G Ljava/util/ArrayList;
      // 094: aload 0
      // 095: new java/util/ArrayList
      // 098: dup
      // 099: bipush 5
      // 09a: iload 25
      // 09c: i2d
      // 09d: ldc2_w 0.2
      // 0a0: dmul
      // 0a1: d2i
      // 0a2: invokestatic java/lang/Math.max (II)I
      // 0a5: invokespecial java/util/ArrayList.<init> (I)V
      // 0a8: putfield com/zelix/_8b.y Ljava/util/ArrayList;
      // 0ab: aload 0
      // 0ac: new java/util/ArrayList
      // 0af: dup
      // 0b0: bipush 5
      // 0b1: iload 25
      // 0b3: i2d
      // 0b4: ldc2_w 0.09
      // 0b7: dmul
      // 0b8: d2i
      // 0b9: invokestatic java/lang/Math.max (II)I
      // 0bc: invokespecial java/util/ArrayList.<init> (I)V
      // 0bf: putfield com/zelix/_8b.a Ljava/util/ArrayList;
      // 0c2: astore 24
      // 0c4: aload 0
      // 0c5: bipush 5
      // 0c6: iload 25
      // 0c8: i2d
      // 0c9: ldc2_w 0.09
      // 0cc: dmul
      // 0cd: d2i
      // 0ce: invokestatic java/lang/Math.max (II)I
      // 0d1: lload 12
      // 0d3: bipush 2
      // 0d4: anewarray 348
      // 0d7: dup_x2
      // 0d8: dup_x2
      // 0d9: pop
      // 0da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dd: bipush 1
      // 0de: swap
      // 0df: aastore
      // 0e0: dup_x1
      // 0e1: swap
      // 0e2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e5: bipush 0
      // 0e6: swap
      // 0e7: aastore
      // 0e8: ldc2_w 2617638646184354784
      // 0eb: lload 10
      // 0ed: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: ldc2_w 4123989726668013611
      // 0f5: lload 10
      // 0f7: invokedynamic v (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: aload 0
      // 0fd: new java/util/ArrayList
      // 100: dup
      // 101: bipush 5
      // 102: iload 25
      // 104: i2d
      // 105: ldc2_w 0.05
      // 108: dmul
      // 109: d2i
      // 10a: invokestatic java/lang/Math.max (II)I
      // 10d: invokespecial java/util/ArrayList.<init> (I)V
      // 110: putfield com/zelix/_8b.L Ljava/util/ArrayList;
      // 113: aload 0
      // 114: new java/util/ArrayList
      // 117: dup
      // 118: bipush 5
      // 119: iload 25
      // 11b: i2d
      // 11c: ldc2_w 0.01
      // 11f: dmul
      // 120: d2i
      // 121: invokestatic java/lang/Math.max (II)I
      // 124: invokespecial java/util/ArrayList.<init> (I)V
      // 127: ldc2_w 4157124352799633746
      // 12a: lload 10
      // 12c: invokedynamic v (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: aload 0
      // 132: new java/util/ArrayList
      // 135: dup
      // 136: bipush 5
      // 137: iload 25
      // 139: i2d
      // 13a: ldc2_w 0.15
      // 13d: dmul
      // 13e: d2i
      // 13f: invokestatic java/lang/Math.max (II)I
      // 142: invokespecial java/util/ArrayList.<init> (I)V
      // 145: putfield com/zelix/_8b.Q Ljava/util/ArrayList;
      // 148: aload 0
      // 149: new java/util/ArrayList
      // 14c: dup
      // 14d: bipush 5
      // 14e: iload 25
      // 150: i2d
      // 151: ldc2_w 0.15
      // 154: dmul
      // 155: d2i
      // 156: invokestatic java/lang/Math.max (II)I
      // 159: invokespecial java/util/ArrayList.<init> (I)V
      // 15c: ldc2_w 4077886282975034139
      // 15f: lload 10
      // 161: invokedynamic v (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: aload 0
      // 167: new java/util/ArrayList
      // 16a: dup
      // 16b: bipush 5
      // 16c: iload 25
      // 16e: i2d
      // 16f: ldc2_w 0.15
      // 172: dmul
      // 173: d2i
      // 174: invokestatic java/lang/Math.max (II)I
      // 177: invokespecial java/util/ArrayList.<init> (I)V
      // 17a: putfield com/zelix/_8b.R Ljava/util/ArrayList;
      // 17d: aload 0
      // 17e: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 181: bipush 0
      // 182: lload 18
      // 184: aload 0
      // 185: bipush 1
      // 186: invokestatic com/zelix/mg.N (JLcom/zelix/_83;I)Lcom/zelix/mg;
      // 189: aastore
      // 18a: bipush 1
      // 18b: istore 29
      // 18d: iload 29
      // 18f: iload 25
      // 191: if_icmpge 2dd
      // 194: iload 29
      // 196: lload 20
      // 198: aload 1
      // 199: aload 0
      // 19a: invokestatic com/zelix/xl.b (IJLcom/zelix/_xx;Lcom/zelix/_83;)Lcom/zelix/xl;
      // 19d: astore 30
      // 19f: aload 24
      // 1a1: ifnonnull 39b
      // 1a4: aload 30
      // 1a6: invokevirtual com/zelix/xl.s ()Z
      // 1a9: lload 4
      // 1ab: lconst_0
      // 1ac: lcmp
      // 1ad: ifle 2b5
      // 1b0: aload 24
      // 1b2: ifnonnull 2b5
      // 1b5: goto 1c3
      // 1b8: ldc2_w 2354393668531321516
      // 1bb: lload 10
      // 1bd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: ifeq 28a
      // 1c6: goto 1d4
      // 1c9: ldc2_w 2354393668531321516
      // 1cc: lload 10
      // 1ce: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: aload 30
      // 1d6: instanceof com/zelix/x6
      // 1d9: aload 24
      // 1db: iload 6
      // 1dd: ifle 240
      // 1e0: ifnonnull 23e
      // 1e3: goto 1f1
      // 1e6: ldc2_w 2354393668531321516
      // 1e9: lload 10
      // 1eb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: lload 4
      // 1f3: lconst_0
      // 1f4: lcmp
      // 1f5: iflt 230
      // 1f8: ifeq 22b
      // 1fb: goto 209
      // 1fe: ldc2_w 2354393668531321516
      // 201: lload 10
      // 203: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: aload 26
      // 20b: aload 30
      // 20d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 210: pop
      // 211: lload 4
      // 213: lconst_0
      // 214: lcmp
      // 215: ifle 28a
      // 218: aload 24
      // 21a: ifnull 28a
      // 21d: goto 22b
      // 220: ldc2_w 2354393668531321516
      // 223: lload 10
      // 225: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: athrow
      // 22b: aload 30
      // 22d: instanceof com/zelix/mm
      // 230: goto 23e
      // 233: ldc2_w 2354393668531321516
      // 236: lload 10
      // 238: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: aload 24
      // 240: ifnonnull 289
      // 243: ifeq 274
      // 246: goto 254
      // 249: ldc2_w 2354393668531321516
      // 24c: lload 10
      // 24e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: athrow
      // 254: aload 27
      // 256: aload 30
      // 258: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 25b: pop
      // 25c: iload 6
      // 25e: ifle 28a
      // 261: aload 24
      // 263: ifnull 28a
      // 266: goto 274
      // 269: ldc2_w 2354393668531321516
      // 26c: lload 10
      // 26e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 273: athrow
      // 274: aload 28
      // 276: aload 30
      // 278: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 27b: goto 289
      // 27e: ldc2_w 2354393668531321516
      // 281: lload 10
      // 283: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: athrow
      // 289: pop
      // 28a: iload 6
      // 28c: iflt 2a0
      // 28f: aload 0
      // 290: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 293: iload 29
      // 295: iinc 29 1
      // 298: aload 24
      // 29a: ifnonnull 2d0
      // 29d: aload 30
      // 29f: aastore
      // 2a0: aload 30
      // 2a2: lload 22
      // 2a4: invokevirtual com/zelix/xl.o (J)I
      // 2a7: goto 2b5
      // 2aa: ldc2_w 2354393668531321516
      // 2ad: lload 10
      // 2af: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: athrow
      // 2b5: bipush 2
      // 2b6: if_icmpne 2d8
      // 2b9: aload 0
      // 2ba: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 2bd: iload 29
      // 2bf: iinc 29 1
      // 2c2: goto 2d0
      // 2c5: ldc2_w 2354393668531321516
      // 2c8: lload 10
      // 2ca: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: athrow
      // 2d0: lload 18
      // 2d2: aload 0
      // 2d3: bipush 1
      // 2d4: invokestatic com/zelix/mg.N (JLcom/zelix/_83;I)Lcom/zelix/mg;
      // 2d7: aastore
      // 2d8: aload 24
      // 2da: ifnull 18d
      // 2dd: aload 0
      // 2de: aload 26
      // 2e0: aload 3
      // 2e1: aload 7
      // 2e3: lload 16
      // 2e5: aload 8
      // 2e7: aload 9
      // 2e9: bipush 6
      // 2eb: anewarray 348
      // 2ee: dup_x1
      // 2ef: swap
      // 2f0: bipush 5
      // 2f1: swap
      // 2f2: aastore
      // 2f3: dup_x1
      // 2f4: swap
      // 2f5: bipush 4
      // 2f6: swap
      // 2f7: aastore
      // 2f8: dup_x2
      // 2f9: dup_x2
      // 2fa: pop
      // 2fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fe: bipush 3
      // 2ff: swap
      // 300: aastore
      // 301: dup_x1
      // 302: swap
      // 303: bipush 2
      // 304: swap
      // 305: aastore
      // 306: dup_x1
      // 307: swap
      // 308: bipush 1
      // 309: swap
      // 30a: aastore
      // 30b: dup_x1
      // 30c: swap
      // 30d: bipush 0
      // 30e: swap
      // 30f: aastore
      // 310: ldc2_w 4177881514093549180
      // 313: lload 10
      // 315: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31a: aload 0
      // 31b: aload 27
      // 31d: aload 3
      // 31e: aload 7
      // 320: lload 16
      // 322: aload 8
      // 324: aload 9
      // 326: bipush 6
      // 328: anewarray 348
      // 32b: dup_x1
      // 32c: swap
      // 32d: bipush 5
      // 32e: swap
      // 32f: aastore
      // 330: dup_x1
      // 331: swap
      // 332: bipush 4
      // 333: swap
      // 334: aastore
      // 335: dup_x2
      // 336: dup_x2
      // 337: pop
      // 338: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33b: bipush 3
      // 33c: swap
      // 33d: aastore
      // 33e: dup_x1
      // 33f: swap
      // 340: bipush 2
      // 341: swap
      // 342: aastore
      // 343: dup_x1
      // 344: swap
      // 345: bipush 1
      // 346: swap
      // 347: aastore
      // 348: dup_x1
      // 349: swap
      // 34a: bipush 0
      // 34b: swap
      // 34c: aastore
      // 34d: ldc2_w 4177881514093549180
      // 350: lload 10
      // 352: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 357: aload 0
      // 358: aload 28
      // 35a: aload 3
      // 35b: aload 7
      // 35d: lload 16
      // 35f: aload 8
      // 361: aload 9
      // 363: bipush 6
      // 365: anewarray 348
      // 368: dup_x1
      // 369: swap
      // 36a: bipush 5
      // 36b: swap
      // 36c: aastore
      // 36d: dup_x1
      // 36e: swap
      // 36f: bipush 4
      // 370: swap
      // 371: aastore
      // 372: dup_x2
      // 373: dup_x2
      // 374: pop
      // 375: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 378: bipush 3
      // 379: swap
      // 37a: aastore
      // 37b: dup_x1
      // 37c: swap
      // 37d: bipush 2
      // 37e: swap
      // 37f: aastore
      // 380: dup_x1
      // 381: swap
      // 382: bipush 1
      // 383: swap
      // 384: aastore
      // 385: dup_x1
      // 386: swap
      // 387: bipush 0
      // 388: swap
      // 389: aastore
      // 38a: ldc2_w 4177881514093549180
      // 38d: lload 10
      // 38f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: lload 4
      // 396: lconst_0
      // 397: lcmp
      // 398: ifle 39b
      // 39b: return
   }

   public final void w(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/util/HashMap
      // 011: astore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_zk
      // 019: astore 5
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 69032383398715
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 55719530334137
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 6770960820446
      // 02f: lxor
      // 030: lstore 10
      // 032: pop2
      // 033: ldc2_w -4433235879604738152
      // 036: lload 2
      // 037: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: bipush 1
      // 03d: istore 13
      // 03f: astore 12
      // 041: iload 13
      // 043: aload 0
      // 044: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 047: arraylength
      // 048: if_icmpge 1d8
      // 04b: aload 0
      // 04c: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 04f: iload 13
      // 051: aaload
      // 052: instanceof com/zelix/mg
      // 055: aload 12
      // 057: lload 2
      // 058: lconst_0
      // 059: lcmp
      // 05a: iflt 0a1
      // 05d: ifnonnull 09f
      // 060: ifeq 088
      // 063: goto 070
      // 066: ldc2_w -4222622117514502298
      // 069: lload 2
      // 06a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: aload 12
      // 072: lload 2
      // 073: lconst_0
      // 074: lcmp
      // 075: ifle 1d5
      // 078: ifnull 1d0
      // 07b: goto 088
      // 07e: ldc2_w -4222622117514502298
      // 081: lload 2
      // 082: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: aload 0
      // 089: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 08c: iload 13
      // 08e: aaload
      // 08f: instanceof com/zelix/x7
      // 092: goto 09f
      // 095: ldc2_w -4222622117514502298
      // 098: lload 2
      // 099: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: athrow
      // 09f: aload 12
      // 0a1: lload 2
      // 0a2: lconst_0
      // 0a3: lcmp
      // 0a4: ifle 11a
      // 0a7: ifnonnull 112
      // 0aa: ifeq 0fb
      // 0ad: goto 0ba
      // 0b0: ldc2_w -4222622117514502298
      // 0b3: lload 2
      // 0b4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 0
      // 0bb: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 0be: iload 13
      // 0c0: aaload
      // 0c1: checkcast com/zelix/x7
      // 0c4: lload 10
      // 0c6: aload 4
      // 0c8: bipush 2
      // 0c9: anewarray 348
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 1
      // 0cf: swap
      // 0d0: aastore
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w -2727706913705196570
      // 0dd: lload 2
      // 0de: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: aload 12
      // 0e5: lload 2
      // 0e6: lconst_0
      // 0e7: lcmp
      // 0e8: ifle 1d5
      // 0eb: ifnull 1d0
      // 0ee: goto 0fb
      // 0f1: ldc2_w -4222622117514502298
      // 0f4: lload 2
      // 0f5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 0ff: iload 13
      // 101: aaload
      // 102: instanceof com/zelix/mn
      // 105: goto 112
      // 108: ldc2_w -4222622117514502298
      // 10b: lload 2
      // 10c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: lload 2
      // 113: lconst_0
      // 114: lcmp
      // 115: iflt 197
      // 118: aload 12
      // 11a: ifnonnull 197
      // 11d: ifeq 16e
      // 120: goto 12d
      // 123: ldc2_w -4222622117514502298
      // 126: lload 2
      // 127: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: aload 0
      // 12e: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 131: iload 13
      // 133: aaload
      // 134: checkcast com/zelix/mn
      // 137: lload 8
      // 139: aload 4
      // 13b: bipush 2
      // 13c: anewarray 348
      // 13f: dup_x1
      // 140: swap
      // 141: bipush 1
      // 142: swap
      // 143: aastore
      // 144: dup_x2
      // 145: dup_x2
      // 146: pop
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: bipush 0
      // 14b: swap
      // 14c: aastore
      // 14d: ldc2_w -4126866012881042472
      // 150: lload 2
      // 151: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: aload 12
      // 158: lload 2
      // 159: lconst_0
      // 15a: lcmp
      // 15b: ifle 1d5
      // 15e: ifnull 1d0
      // 161: goto 16e
      // 164: ldc2_w -4222622117514502298
      // 167: lload 2
      // 168: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aload 0
      // 16f: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 172: iload 13
      // 174: aaload
      // 175: aload 12
      // 177: ifnonnull 1ae
      // 17a: goto 187
      // 17d: ldc2_w -4222622117514502298
      // 180: lload 2
      // 181: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: instanceof com/zelix/xb
      // 18a: goto 197
      // 18d: ldc2_w -4222622117514502298
      // 190: lload 2
      // 191: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: ifeq 1d0
      // 19a: aload 0
      // 19b: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 19e: iload 13
      // 1a0: aaload
      // 1a1: goto 1ae
      // 1a4: ldc2_w -4222622117514502298
      // 1a7: lload 2
      // 1a8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: checkcast com/zelix/xb
      // 1b1: aload 4
      // 1b3: lload 6
      // 1b5: bipush 2
      // 1b6: anewarray 348
      // 1b9: dup_x2
      // 1ba: dup_x2
      // 1bb: pop
      // 1bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bf: bipush 1
      // 1c0: swap
      // 1c1: aastore
      // 1c2: dup_x1
      // 1c3: swap
      // 1c4: bipush 0
      // 1c5: swap
      // 1c6: aastore
      // 1c7: ldc2_w -2761197508980518976
      // 1ca: lload 2
      // 1cb: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: iinc 13 1
      // 1d3: aload 12
      // 1d5: ifnull 041
      // 1d8: lload 2
      // 1d9: lconst_0
      // 1da: lcmp
      // 1db: ifle 04b
      // 1de: return
   }

   public void R(Object[] param1) {
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
      // 04: checkcast java/lang/String
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
      // 15: ldc2_w 62113988991406
      // 18: lxor
      // 19: lstore 5
      // 1b: dup2
      // 1c: ldc2_w 110132926638308
      // 1f: lxor
      // 20: lstore 7
      // 22: dup2
      // 23: ldc2_w 44392908886789
      // 26: lxor
      // 27: lstore 9
      // 29: pop2
      // 2a: ldc2_w -98024982863111358
      // 2d: lload 3
      // 2e: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 0
      // 34: lload 5
      // 36: bipush 1
      // 37: anewarray 348
      // 3a: dup_x2
      // 3b: dup_x2
      // 3c: pop
      // 3d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 40: bipush 0
      // 41: swap
      // 42: aastore
      // 43: ldc2_w -2277640860869400443
      // 46: lload 3
      // 47: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: astore 12
      // 4e: aload 0
      // 4f: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 52: astore 13
      // 54: aload 13
      // 56: arraylength
      // 57: istore 14
      // 59: astore 11
      // 5b: bipush 0
      // 5c: istore 15
      // 5e: iload 15
      // 60: iload 14
      // 62: if_icmpge e9
      // 65: aload 13
      // 67: iload 15
      // 69: aaload
      // 6a: astore 16
      // 6c: aload 11
      // 6e: ifnonnull e4
      // 71: aload 16
      // 73: instanceof com/zelix/x7
      // 76: ifeq e1
      // 79: goto 86
      // 7c: ldc2_w -451347088171129924
      // 7f: lload 3
      // 80: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: aload 16
      // 88: checkcast com/zelix/x7
      // 8b: astore 17
      // 8d: aload 11
      // 8f: lload 3
      // 90: lconst_0
      // 91: lcmp
      // 92: iflt e6
      // 95: ifnonnull e4
      // 98: aload 17
      // 9a: lload 7
      // 9c: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 9f: aload 12
      // a1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // a4: ifeq e1
      // a7: goto b4
      // aa: ldc2_w -451347088171129924
      // ad: lload 3
      // ae: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: aload 17
      // b6: aload 2
      // b7: lload 9
      // b9: bipush 2
      // ba: anewarray 348
      // bd: dup_x2
      // be: dup_x2
      // bf: pop
      // c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c3: bipush 1
      // c4: swap
      // c5: aastore
      // c6: dup_x1
      // c7: swap
      // c8: bipush 0
      // c9: swap
      // ca: aastore
      // cb: ldc2_w -1887873792827620705
      // ce: lload 3
      // cf: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: goto e1
      // d7: ldc2_w -451347088171129924
      // da: lload 3
      // db: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: athrow
      // e1: iinc 15 1
      // e4: aload 11
      // e6: ifnull 5e
      // e9: return
   }

   private void v(Object[] param1) {
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
      // 004: checkcast com/zelix/xl
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/_8b.f J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 126784057757196
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 108077698821532
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: ldc2_w 4313244124400868922
      // 02d: lload 2
      // 02e: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: aload 4
      // 035: lload 5
      // 037: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 03a: astore 10
      // 03c: astore 9
      // 03e: ldc2_w 4185393649301174579
      // 041: lload 2
      // 042: invokedynamic l (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: aload 10
      // 049: invokevirtual com/zelix/w5.ordinal ()I
      // 04c: iaload
      // 04d: aload 9
      // 04f: ifnonnull 0bb
      // 052: tableswitch 427 1 14 80 148 179 210 247 278 309 340 377 377 377 377 377 395
      // 098: ldc2_w 4378757054614464196
      // 09b: lload 2
      // 09c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: getfield com/zelix/_8b.a Ljava/util/ArrayList;
      // 0a6: aload 4
      // 0a8: checkcast com/zelix/x7
      // 0ab: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0ae: goto 0bb
      // 0b1: ldc2_w 4378757054614464196
      // 0b4: lload 2
      // 0b5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: pop
      // 0bc: aload 0
      // 0bd: ldc2_w 2689596792388148291
      // 0c0: lload 2
      // 0c1: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: aload 4
      // 0c8: checkcast com/zelix/x7
      // 0cb: lload 7
      // 0cd: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 0d0: aload 4
      // 0d2: checkcast com/zelix/x7
      // 0d5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0da: pop
      // 0db: aload 9
      // 0dd: lload 2
      // 0de: lconst_0
      // 0df: lcmp
      // 0e0: ifle 0f5
      // 0e3: ifnull 1fd
      // 0e6: aload 0
      // 0e7: getfield com/zelix/_8b.y Ljava/util/ArrayList;
      // 0ea: aload 4
      // 0ec: checkcast com/zelix/mn
      // 0ef: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0f2: pop
      // 0f3: aload 9
      // 0f5: ifnull 1fd
      // 0f8: goto 105
      // 0fb: ldc2_w 4378757054614464196
      // 0fe: lload 2
      // 0ff: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 0
      // 106: getfield com/zelix/_8b.Q Ljava/util/ArrayList;
      // 109: aload 4
      // 10b: checkcast com/zelix/my
      // 10e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 111: pop
      // 112: aload 9
      // 114: ifnull 1fd
      // 117: goto 124
      // 11a: ldc2_w 4378757054614464196
      // 11d: lload 2
      // 11e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: aload 0
      // 125: ldc2_w 2666002603620509555
      // 128: lload 2
      // 129: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: aload 4
      // 130: checkcast com/zelix/mz
      // 133: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 136: pop
      // 137: aload 9
      // 139: ifnull 1fd
      // 13c: goto 149
      // 13f: ldc2_w 4378757054614464196
      // 142: lload 2
      // 143: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 0
      // 14a: getfield com/zelix/_8b.R Ljava/util/ArrayList;
      // 14d: aload 4
      // 14f: checkcast com/zelix/mr
      // 152: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 155: pop
      // 156: aload 9
      // 158: ifnull 1fd
      // 15b: goto 168
      // 15e: ldc2_w 4378757054614464196
      // 161: lload 2
      // 162: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: aload 0
      // 169: getfield com/zelix/_8b.G Ljava/util/ArrayList;
      // 16c: aload 4
      // 16e: checkcast com/zelix/mx
      // 171: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 174: pop
      // 175: aload 9
      // 177: ifnull 1fd
      // 17a: goto 187
      // 17d: ldc2_w 4378757054614464196
      // 180: lload 2
      // 181: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 0
      // 188: getfield com/zelix/_8b.L Ljava/util/ArrayList;
      // 18b: aload 4
      // 18d: checkcast com/zelix/md
      // 190: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 193: pop
      // 194: aload 9
      // 196: ifnull 1fd
      // 199: goto 1a6
      // 19c: ldc2_w 4378757054614464196
      // 19f: lload 2
      // 1a0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: ldc2_w 2727235603199716666
      // 1aa: lload 2
      // 1ab: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: aload 4
      // 1b2: checkcast com/zelix/mf
      // 1b5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1b8: pop
      // 1b9: aload 9
      // 1bb: ifnull 1fd
      // 1be: goto 1cb
      // 1c1: ldc2_w 4378757054614464196
      // 1c4: lload 2
      // 1c5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: aload 9
      // 1cd: ifnull 1fd
      // 1d0: goto 1dd
      // 1d3: ldc2_w 4378757054614464196
      // 1d6: lload 2
      // 1d7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: ldc2_w 2601914549810713273
      // 1e1: lload 2
      // 1e2: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: aload 4
      // 1e9: checkcast com/zelix/x4
      // 1ec: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1ef: pop
      // 1f0: goto 1fd
      // 1f3: ldc2_w 4378757054614464196
      // 1f6: lload 2
      // 1f7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: return
   }

   public void M(Object[] param1) {
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
      // 0e: checkcast java/util/HashMap
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 34915055438853
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w 1967458088919400108
      // 20: lload 2
      // 21: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: bipush 1
      // 27: istore 8
      // 29: astore 7
      // 2b: iload 8
      // 2d: aload 0
      // 2e: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 31: arraylength
      // 32: if_icmpge 92
      // 35: aload 0
      // 36: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 39: iload 8
      // 3b: aaload
      // 3c: aload 7
      // 3e: ifnonnull 68
      // 41: instanceof com/zelix/mq
      // 44: ifeq 8a
      // 47: goto 54
      // 4a: ldc2_w 2040711516448212562
      // 4d: lload 2
      // 4e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 58: iload 8
      // 5a: aaload
      // 5b: goto 68
      // 5e: ldc2_w 2040711516448212562
      // 61: lload 2
      // 62: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: checkcast com/zelix/mq
      // 6b: aload 4
      // 6d: lload 5
      // 6f: bipush 2
      // 70: anewarray 348
      // 73: dup_x2
      // 74: dup_x2
      // 75: pop
      // 76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79: bipush 1
      // 7a: swap
      // 7b: aastore
      // 7c: dup_x1
      // 7d: swap
      // 7e: bipush 0
      // 7f: swap
      // 80: aastore
      // 81: ldc2_w 1859376080449046730
      // 84: lload 2
      // 85: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: iinc 8 1
      // 8d: aload 7
      // 8f: ifnull 2b
      // 92: lload 2
      // 93: lconst_0
      // 94: lcmp
      // 95: ifle 35
      // 98: return
   }

   boolean C(Object[] var1) {
      return false;
   }

   private void H(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_y4
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_y4
      // 016: astore 4
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 7
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/_y4
      // 029: astore 5
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/_y4
      // 031: astore 2
      // 032: pop
      // 033: getstatic com/zelix/_8b.f J
      // 036: lload 7
      // 038: lxor
      // 039: lstore 7
      // 03b: lload 7
      // 03d: dup2
      // 03e: ldc2_w 53344429610881
      // 041: lxor
      // 042: lstore 9
      // 044: dup2
      // 045: ldc2_w 61108706970391
      // 048: lxor
      // 049: lstore 11
      // 04b: dup2
      // 04c: ldc2_w 67688010979775
      // 04f: lxor
      // 050: lstore 13
      // 052: pop2
      // 053: ldc2_w 7484958241250214462
      // 056: lload 7
      // 058: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: bipush 0
      // 05e: istore 16
      // 060: astore 15
      // 062: bipush 0
      // 063: istore 17
      // 065: aload 3
      // 066: ldc2_w 9143506285345895295
      // 069: lload 7
      // 06b: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ListIterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: astore 18
      // 072: aload 18
      // 074: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 079: ifeq 18e
      // 07c: aload 18
      // 07e: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 083: checkcast com/zelix/xl
      // 086: astore 19
      // 088: new java/io/StringWriter
      // 08b: dup
      // 08c: invokespecial java/io/StringWriter.<init> ()V
      // 08f: astore 20
      // 091: new java/io/PrintWriter
      // 094: dup
      // 095: aload 20
      // 097: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 09a: astore 21
      // 09c: aload 19
      // 09e: checkcast com/zelix/_8t
      // 0a1: aload 6
      // 0a3: lload 13
      // 0a5: aload 4
      // 0a7: aload 5
      // 0a9: aload 2
      // 0aa: aload 21
      // 0ac: invokeinterface com/zelix/_8t.f (Lcom/zelix/_y4;JLcom/zelix/_y4;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;)Lcom/zelix/xl; 8
      // 0b1: astore 22
      // 0b3: lload 7
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: ifle 198
      // 0ba: aload 15
      // 0bc: ifnonnull 198
      // 0bf: aload 22
      // 0c1: aload 15
      // 0c3: lload 7
      // 0c5: lconst_0
      // 0c6: lcmp
      // 0c7: ifle 13c
      // 0ca: ifnonnull 138
      // 0cd: goto 0db
      // 0d0: ldc2_w 6971617474377267904
      // 0d3: lload 7
      // 0d5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: ifnonnull 0fb
      // 0de: goto 0ec
      // 0e1: ldc2_w 6971617474377267904
      // 0e4: lload 7
      // 0e6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: bipush 1
      // 0ed: istore 17
      // 0ef: aload 15
      // 0f1: lload 7
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: iflt 18b
      // 0f8: ifnull 189
      // 0fb: aload 18
      // 0fd: invokeinterface java/util/ListIterator.remove ()V 1
      // 102: aload 0
      // 103: aload 15
      // 105: lload 7
      // 107: lconst_0
      // 108: lcmp
      // 109: ifle 17f
      // 10c: ifnonnull 169
      // 10f: goto 11d
      // 112: ldc2_w 6971617474377267904
      // 115: lload 7
      // 117: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 120: aload 19
      // 122: invokevirtual com/zelix/xl.B ()I
      // 125: aload 22
      // 127: aastore
      // 128: aload 22
      // 12a: goto 138
      // 12d: ldc2_w 6971617474377267904
      // 130: lload 7
      // 132: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: bipush 0
      // 139: anewarray 348
      // 13c: ldc2_w 9199611457712025292
      // 13f: lload 7
      // 141: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: ifne 168
      // 149: new com/zelix/gj
      // 14c: dup
      // 14d: aload 20
      // 14f: ldc2_w 7471032180877231342
      // 152: lload 7
      // 154: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // 15c: athrow
      // 15d: ldc2_w 6971617474377267904
      // 160: lload 7
      // 162: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: aload 0
      // 169: aload 22
      // 16b: lload 9
      // 16d: bipush 2
      // 16e: anewarray 348
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
      // 17f: ldc2_w 7049418167401378788
      // 182: lload 7
      // 184: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: aload 15
      // 18b: ifnull 072
      // 18e: lload 7
      // 190: lconst_0
      // 191: lcmp
      // 192: iflt 198
      // 195: iinc 16 1
      // 198: iload 16
      // 19a: aload 15
      // 19c: ifnonnull 1fb
      // 19f: bipush 3
      // 1a0: if_icmple 1f9
      // 1a3: goto 1b1
      // 1a6: ldc2_w 6971617474377267904
      // 1a9: lload 7
      // 1ab: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: athrow
      // 1b1: new com/zelix/_sx
      // 1b4: dup
      // 1b5: new java/lang/StringBuilder
      // 1b8: dup
      // 1b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 1bc: aload 0
      // 1bd: lload 11
      // 1bf: invokevirtual com/zelix/_8b.M (J)Ljava/lang/String;
      // 1c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c5: sipush 15521
      // 1c8: ldc2_w 7948505083541293702
      // 1cb: lload 7
      // 1cd: lxor
      // 1ce: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_8b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d6: sipush 5615
      // 1d9: ldc2_w 2088860561776583625
      // 1dc: lload 7
      // 1de: lxor
      // 1df: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/_8b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ea: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 1ed: athrow
      // 1ee: ldc2_w 6971617474377267904
      // 1f1: lload 7
      // 1f3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: athrow
      // 1f9: iload 17
      // 1fb: ifne 062
      // 1fe: aload 15
      // 200: lload 7
      // 202: lconst_0
      // 203: lcmp
      // 204: iflt 083
      // 207: ifnonnull 198
      // 20a: return
   }

   public synchronized int K(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/util/List
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
      // 15: ldc2_w 9886759997447
      // 18: lxor
      // 19: lstore 5
      // 1b: dup2
      // 1c: ldc2_w 0
      // 1f: lxor
      // 20: lstore 7
      // 22: pop2
      // 23: ldc2_w 2331124787923666360
      // 26: lload 3
      // 27: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: aload 2
      // 2e: lload 7
      // 30: bipush 2
      // 31: anewarray 348
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 1
      // 3b: swap
      // 3c: aastore
      // 3d: dup_x1
      // 3e: swap
      // 3f: bipush 0
      // 40: swap
      // 41: aastore
      // 42: invokespecial com/zelix/_83.K ([Ljava/lang/Object;)I
      // 45: istore 10
      // 47: aload 2
      // 48: invokeinterface java/util/List.size ()I 1
      // 4d: istore 11
      // 4f: astore 9
      // 51: bipush 0
      // 52: istore 12
      // 54: iload 12
      // 56: iload 11
      // 58: if_icmpge 8c
      // 5b: aload 0
      // 5c: aload 2
      // 5d: iload 12
      // 5f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 64: checkcast com/zelix/xl
      // 67: lload 5
      // 69: bipush 2
      // 6a: anewarray 348
      // 6d: dup_x2
      // 6e: dup_x2
      // 6f: pop
      // 70: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 73: bipush 1
      // 74: swap
      // 75: aastore
      // 76: dup_x1
      // 77: swap
      // 78: bipush 0
      // 79: swap
      // 7a: aastore
      // 7b: ldc2_w 2761454241803580514
      // 7e: lload 3
      // 7f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: iinc 12 1
      // 87: aload 9
      // 89: ifnull 54
      // 8c: lload 3
      // 8d: lconst_0
      // 8e: lcmp
      // 8f: ifle 87
      // 92: iload 10
      // 94: ireturn
   }

   public void g(Object[] param1) {
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
      // 0e: checkcast com/zelix/_yv
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ug
      // 19: astore 4
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/ei
      // 21: astore 6
      // 23: pop
      // 24: getstatic com/zelix/_8b.f J
      // 27: lload 2
      // 28: lxor
      // 29: lstore 2
      // 2a: lload 2
      // 2b: dup2
      // 2c: ldc2_w 133543234989702
      // 2f: lxor
      // 30: lstore 7
      // 32: pop2
      // 33: ldc2_w 7610168213902789757
      // 36: lload 2
      // 37: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: bipush 1
      // 3d: istore 10
      // 3f: astore 9
      // 41: iload 10
      // 43: aload 0
      // 44: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 47: arraylength
      // 48: if_icmpge b6
      // 4b: aload 0
      // 4c: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 4f: iload 10
      // 51: aaload
      // 52: aload 9
      // 54: ifnonnull 7e
      // 57: instanceof com/zelix/mo
      // 5a: ifeq ae
      // 5d: goto 6a
      // 60: ldc2_w 7963348553480713347
      // 63: lload 2
      // 64: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield com/zelix/_8b.z [Lcom/zelix/xl;
      // 6e: iload 10
      // 70: aaload
      // 71: goto 7e
      // 74: ldc2_w 7963348553480713347
      // 77: lload 2
      // 78: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: checkcast com/zelix/mo
      // 81: aload 5
      // 83: aload 4
      // 85: aload 6
      // 87: lload 7
      // 89: bipush 4
      // 8a: anewarray 348
      // 8d: dup_x2
      // 8e: dup_x2
      // 8f: pop
      // 90: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93: bipush 3
      // 94: swap
      // 95: aastore
      // 96: dup_x1
      // 97: swap
      // 98: bipush 2
      // 99: swap
      // 9a: aastore
      // 9b: dup_x1
      // 9c: swap
      // 9d: bipush 1
      // 9e: swap
      // 9f: aastore
      // a0: dup_x1
      // a1: swap
      // a2: bipush 0
      // a3: swap
      // a4: aastore
      // a5: ldc2_w 8371624131051280119
      // a8: lload 2
      // a9: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: iinc 10 1
      // b1: aload 9
      // b3: ifnull 41
      // b6: lload 2
      // b7: lconst_0
      // b8: lcmp
      // b9: ifle 4b
      // bc: return
   }

   static {
      long var0 = f ^ 49600215925009L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "7Óg\u0084\u000b\u0001\u0089\u0012]\u008c\u0010\u0099¾Ð7Ý2ÿ¾*zÏ\u0016ÿO¹kT}¥Îr\u0091ê\u0015ô-rTÎú\u008f±\u0017Î\u0094Ý¦\u0092\u0091å<\u0086eOðIb\u001cxju\u001bÁd@\u009e\u0083»\u0084j\u0080>Ø`\f¿BÕQ\u0010#N\u0013¥îÕôkÇÚ°(\u0005\u00ad\u0096m";
      int var8 = "7Óg\u0084\u000b\u0001\u0089\u0012]\u008c\u0010\u0099¾Ð7Ý2ÿ¾*zÏ\u0016ÿO¹kT}¥Îr\u0091ê\u0015ô-rTÎú\u008f±\u0017Î\u0094Ý¦\u0092\u0091å<\u0086eOðIb\u001cxju\u001bÁd@\u009e\u0083»\u0084j\u0080>Ø`\f¿BÕQ\u0010#N\u0013¥îÕôkÇÚ°(\u0005\u00ad\u0096m"
         .length();
      char var5 = 'P';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            g = var9;
            h = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23740;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_8b", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("com/zelix/_8b" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
