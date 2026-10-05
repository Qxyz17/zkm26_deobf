package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _kz {
   private BitSet F;
   private Set M;
   private n[] l;
   private n[] G;
   private static boolean O;
   private final p5 B;
   private static final long a = ess.a(-5660183110813637714L, 5128010567706225075L, MethodHandles.lookup().lookupClass()).a(265678236903066L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private static boolean x(Object[] param0) {
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
      // 004: checkcast com/zelix/n
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/n
      // 00e: astore 4
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 1
      // 01a: pop
      // 01b: getstatic com/zelix/_kz.a J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 126422786514778
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: ldc2_w -7875822192782313050
      // 02d: lload 1
      // 02e: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: istore 7
      // 035: aload 3
      // 036: aload 4
      // 038: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 03b: iload 7
      // 03d: ifne 06f
      // 040: ifeq 05c
      // 043: goto 050
      // 046: ldc2_w -7596249444754479311
      // 049: lload 1
      // 04a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: bipush 1
      // 051: ireturn
      // 052: ldc2_w -7596249444754479311
      // 055: lload 1
      // 056: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: aload 3
      // 05d: bipush 1
      // 05e: anewarray 244
      // 061: dup_x1
      // 062: swap
      // 063: bipush 0
      // 064: swap
      // 065: aastore
      // 066: ldc2_w -8572984858094686266
      // 069: lload 1
      // 06a: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: iload 7
      // 071: ifne 0d3
      // 074: ifeq 0cc
      // 077: goto 084
      // 07a: ldc2_w -7596249444754479311
      // 07d: lload 1
      // 07e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: aload 4
      // 086: bipush 1
      // 087: anewarray 244
      // 08a: dup_x1
      // 08b: swap
      // 08c: bipush 0
      // 08d: swap
      // 08e: aastore
      // 08f: ldc2_w -8572984858094686266
      // 092: lload 1
      // 093: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: iload 7
      // 09a: lload 1
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: iflt 0d5
      // 0a0: ifne 0d3
      // 0a3: goto 0b0
      // 0a6: ldc2_w -7596249444754479311
      // 0a9: lload 1
      // 0aa: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: ifeq 0cc
      // 0b3: goto 0c0
      // 0b6: ldc2_w -7596249444754479311
      // 0b9: lload 1
      // 0ba: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: bipush 1
      // 0c1: ireturn
      // 0c2: ldc2_w -7596249444754479311
      // 0c5: lload 1
      // 0c6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 4
      // 0ce: ldc "F"
      // 0d0: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 0d3: iload 7
      // 0d5: lload 1
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: iflt 108
      // 0db: ifne 106
      // 0de: ifeq 0ff
      // 0e1: goto 0ee
      // 0e4: ldc2_w -7596249444754479311
      // 0e7: lload 1
      // 0e8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 3
      // 0ef: ldc "I"
      // 0f1: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 0f4: ireturn
      // 0f5: ldc2_w -7596249444754479311
      // 0f8: lload 1
      // 0f9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 4
      // 101: ldc "D"
      // 103: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 106: iload 7
      // 108: lload 1
      // 109: lconst_0
      // 10a: lcmp
      // 10b: ifle 17f
      // 10e: ifne 17d
      // 111: ifeq 177
      // 114: goto 121
      // 117: ldc2_w -7596249444754479311
      // 11a: lload 1
      // 11b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 3
      // 122: ldc "F"
      // 124: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 127: iload 7
      // 129: ifne 172
      // 12c: goto 139
      // 12f: ldc2_w -7596249444754479311
      // 132: lload 1
      // 133: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: ifne 171
      // 13c: goto 149
      // 13f: ldc2_w -7596249444754479311
      // 142: lload 1
      // 143: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 3
      // 14a: ldc "I"
      // 14c: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 14f: iload 7
      // 151: ifne 172
      // 154: goto 161
      // 157: ldc2_w -7596249444754479311
      // 15a: lload 1
      // 15b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: ifeq 175
      // 164: goto 171
      // 167: ldc2_w -7596249444754479311
      // 16a: lload 1
      // 16b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: bipush 1
      // 172: goto 176
      // 175: bipush 0
      // 176: ireturn
      // 177: lload 5
      // 179: aload 3
      // 17a: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 17d: iload 7
      // 17f: ifne 1c8
      // 182: ifeq 1c7
      // 185: goto 192
      // 188: ldc2_w -7596249444754479311
      // 18b: lload 1
      // 18c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: lload 5
      // 194: aload 4
      // 196: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 199: iload 7
      // 19b: ifne 1c8
      // 19e: goto 1ab
      // 1a1: ldc2_w -7596249444754479311
      // 1a4: lload 1
      // 1a5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: ifeq 1c7
      // 1ae: goto 1bb
      // 1b1: ldc2_w -7596249444754479311
      // 1b4: lload 1
      // 1b5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: bipush 1
      // 1bc: ireturn
      // 1bd: ldc2_w -7596249444754479311
      // 1c0: lload 1
      // 1c1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: athrow
      // 1c7: bipush 0
      // 1c8: ireturn
   }

   public _kz(long var1, n[] var3) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 83746642840932L;
      int var4 = (int)((var1 ^ 83746642840932L) >>> 48);
      int var5 = (int)((var1 ^ 83746642840932L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      this(var3, (short)var4, (p5)null, null, (char)var5, var6);
   }

   boolean b(int param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 25226520501383
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w -7378121769079142407
      // 12: lload 2
      // 13: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: istore 6
      // 1a: aload 0
      // 1b: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 1e: iload 1
      // 1f: aaload
      // 20: iload 6
      // 22: ifeq 4d
      // 25: lload 4
      // 27: invokevirtual com/zelix/n.Y (J)Z
      // 2a: ifne 92
      // 2d: goto 3a
      // 30: ldc2_w -6999253437373829256
      // 33: lload 2
      // 34: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 3e: iload 1
      // 3f: aaload
      // 40: goto 4d
      // 43: ldc2_w -6999253437373829256
      // 46: lload 2
      // 47: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: getstatic com/zelix/n.e Lcom/zelix/n;
      // 50: lload 2
      // 51: lconst_0
      // 52: lcmp
      // 53: ifle 81
      // 56: iload 6
      // 58: ifeq 81
      // 5b: if_acmpeq 92
      // 5e: goto 6b
      // 61: ldc2_w -6999253437373829256
      // 64: lload 2
      // 65: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 6f: iload 1
      // 70: aaload
      // 71: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 74: goto 81
      // 77: ldc2_w -6999253437373829256
      // 7a: lload 2
      // 7b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: if_acmpeq 92
      // 84: bipush 1
      // 85: goto 93
      // 88: ldc2_w -6999253437373829256
      // 8b: lload 2
      // 8c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: bipush 0
      // 93: ireturn
   }

   public _kz(String param1, long param2, n[] param4, p5 param5, Set param6, byte param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: bipush 8
      // 03: lshl
      // 04: iload 7
      // 06: i2l
      // 07: bipush 56
      // 09: lshl
      // 0a: bipush 56
      // 0c: lushr
      // 0d: lor
      // 0e: getstatic com/zelix/_kz.a J
      // 11: lxor
      // 12: lstore 8
      // 14: lload 8
      // 16: dup2
      // 17: ldc2_w 93301230731190
      // 1a: lxor
      // 1b: dup2
      // 1c: bipush 48
      // 1e: lushr
      // 1f: l2i
      // 20: istore 10
      // 22: dup2
      // 23: bipush 16
      // 25: lshl
      // 26: bipush 48
      // 28: lushr
      // 29: l2i
      // 2a: istore 11
      // 2c: dup2
      // 2d: bipush 32
      // 2f: lshl
      // 30: bipush 32
      // 32: lushr
      // 33: l2i
      // 34: istore 12
      // 36: pop2
      // 37: dup2
      // 38: ldc2_w 29057761676074
      // 3b: lxor
      // 3c: lstore 13
      // 3e: pop2
      // 3f: ldc2_w -6997794678240444288
      // 42: lload 8
      // 44: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: aload 0
      // 4a: invokespecial java/lang/Object.<init> ()V
      // 4d: aload 0
      // 4e: aload 4
      // 50: putfield com/zelix/_kz.G [Lcom/zelix/n;
      // 53: aload 0
      // 54: bipush 1
      // 55: lload 13
      // 57: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 5a: putfield com/zelix/_kz.l [Lcom/zelix/n;
      // 5d: aload 0
      // 5e: aload 5
      // 60: putfield com/zelix/_kz.B Lcom/zelix/p5;
      // 63: aload 0
      // 64: aload 6
      // 66: putfield com/zelix/_kz.M Ljava/util/Set;
      // 69: aload 0
      // 6a: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 6d: bipush 0
      // 6e: iload 10
      // 70: i2c
      // 71: iload 11
      // 73: i2s
      // 74: aload 1
      // 75: iload 12
      // 77: invokestatic com/zelix/n.s (CSLjava/lang/String;I)Lcom/zelix/n;
      // 7a: aastore
      // 7b: istore 15
      // 7d: bipush 0
      // 7e: istore 16
      // 80: iload 16
      // 82: aload 0
      // 83: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 86: arraylength
      // 87: if_icmpge c7
      // 8a: aload 0
      // 8b: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 8e: iload 16
      // 90: iload 15
      // 92: ifeq bb
      // 95: aaload
      // 96: ifnonnull bf
      // 99: goto a7
      // 9c: ldc2_w -7375528867730249727
      // 9f: lload 8
      // a1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: aload 0
      // a8: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // ab: iload 16
      // ad: goto bb
      // b0: ldc2_w -7375528867730249727
      // b3: lload 8
      // b5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: athrow
      // bb: getstatic com/zelix/n.Y Lcom/zelix/n;
      // be: aastore
      // bf: iinc 16 1
      // c2: iload 15
      // c4: ifne 80
      // c7: iload 7
      // c9: ifge 8a
      // cc: return
   }

   public n[] r() {
      return this.G;
   }

   boolean o(long param1, BitSet param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -8053742139241104594
      // 09: lload 1
      // 0a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aconst_null
      // 10: astore 6
      // 12: istore 4
      // 14: aload 0
      // 15: getfield com/zelix/_kz.F Ljava/util/BitSet;
      // 18: iload 4
      // 1a: ifne 62
      // 1d: ifnonnull 4b
      // 20: goto 2d
      // 23: ldc2_w -7774169394438691399
      // 26: lload 1
      // 27: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: aload 0
      // 2e: lload 1
      // 2f: lconst_0
      // 30: lcmp
      // 31: ifle 52
      // 34: new java/util/BitSet
      // 37: dup
      // 38: aload 0
      // 39: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 3c: arraylength
      // 3d: invokespecial java/util/BitSet.<init> (I)V
      // 40: putfield com/zelix/_kz.F Ljava/util/BitSet;
      // 43: bipush 1
      // 44: istore 5
      // 46: iload 4
      // 48: ifeq 67
      // 4b: aload 0
      // 4c: getfield com/zelix/_kz.F Ljava/util/BitSet;
      // 4f: invokevirtual java/util/BitSet.clone ()Ljava/lang/Object;
      // 52: checkcast java/util/BitSet
      // 55: goto 62
      // 58: ldc2_w -7774169394438691399
      // 5b: lload 1
      // 5c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: astore 6
      // 64: bipush 0
      // 65: istore 5
      // 67: aload 0
      // 68: getfield com/zelix/_kz.F Ljava/util/BitSet;
      // 6b: aload 3
      // 6c: invokevirtual java/util/BitSet.or (Ljava/util/BitSet;)V
      // 6f: iload 5
      // 71: iload 4
      // 73: ifne b2
      // 76: ifne b1
      // 79: goto 86
      // 7c: ldc2_w -7774169394438691399
      // 7f: lload 1
      // 80: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: aload 0
      // 87: getfield com/zelix/_kz.F Ljava/util/BitSet;
      // 8a: aload 6
      // 8c: invokevirtual java/util/BitSet.equals (Ljava/lang/Object;)Z
      // 8f: iload 4
      // 91: ifne b2
      // 94: goto a1
      // 97: ldc2_w -7774169394438691399
      // 9a: lload 1
      // 9b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: ifne b5
      // a4: goto b1
      // a7: ldc2_w -7774169394438691399
      // aa: lload 1
      // ab: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: bipush 1
      // b2: goto b6
      // b5: bipush 0
      // b6: ireturn
   }

   private static n[] J(_fm param0, n[] param1, n[] param2, int param3, boolean param4, xx param5, short param6, String param7, char param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 6
      // 007: i2l
      // 008: bipush 48
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 8
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/_kz.a J
      // 01c: lxor
      // 01d: lstore 9
      // 01f: lload 9
      // 021: dup2
      // 022: ldc2_w 98920317114421
      // 025: lxor
      // 026: dup2
      // 027: bipush 48
      // 029: lushr
      // 02a: l2i
      // 02b: istore 11
      // 02d: dup2
      // 02e: bipush 16
      // 030: lshl
      // 031: bipush 48
      // 033: lushr
      // 034: l2i
      // 035: istore 12
      // 037: dup2
      // 038: bipush 32
      // 03a: lshl
      // 03b: bipush 32
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 13
      // 041: pop2
      // 042: dup2
      // 043: ldc2_w 25451066570729
      // 046: lxor
      // 047: lstore 14
      // 049: dup2
      // 04a: ldc2_w 36391602097909
      // 04d: lxor
      // 04e: lstore 16
      // 050: pop2
      // 051: ldc2_w -5044013237279764203
      // 054: lload 9
      // 056: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aload 5
      // 05d: bipush 0
      // 05e: invokevirtual com/zelix/xx.Q (Z)V
      // 061: istore 18
      // 063: aload 1
      // 064: arraylength
      // 065: iload 18
      // 067: ifne 0d7
      // 06a: aload 2
      // 06b: arraylength
      // 06c: if_icmpeq 0d5
      // 06f: goto 07d
      // 072: ldc2_w -4744587567714365566
      // 075: lload 9
      // 077: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: new com/zelix/_sd
      // 080: dup
      // 081: new java/lang/StringBuilder
      // 084: dup
      // 085: invokespecial java/lang/StringBuilder.<init> ()V
      // 088: sipush 25180
      // 08b: ldc2_w 5098509483401308459
      // 08e: lload 9
      // 090: lxor
      // 091: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_kz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: aload 1
      // 09a: arraylength
      // 09b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 09e: ldc " "
      // 0a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a3: aload 2
      // 0a4: arraylength
      // 0a5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a8: sipush 919
      // 0ab: ldc2_w 4596428426474948835
      // 0ae: lload 9
      // 0b0: lxor
      // 0b1: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_kz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0b9: aload 7
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: ldc "'"
      // 0c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c6: invokespecial com/zelix/_sd.<init> (Ljava/lang/String;)V
      // 0c9: athrow
      // 0ca: ldc2_w -4744587567714365566
      // 0cd: lload 9
      // 0cf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: aload 1
      // 0d6: arraylength
      // 0d7: istore 19
      // 0d9: iload 4
      // 0db: ifeq 0f0
      // 0de: aload 1
      // 0df: invokevirtual [Lcom/zelix/n;.clone ()Ljava/lang/Object;
      // 0e2: checkcast [Lcom/zelix/n;
      // 0e5: astore 20
      // 0e7: iload 18
      // 0e9: iload 3
      // 0ea: iflt 0f4
      // 0ed: ifeq 0f3
      // 0f0: aload 1
      // 0f1: astore 20
      // 0f3: bipush 0
      // 0f4: istore 21
      // 0f6: iload 21
      // 0f8: iload 19
      // 0fa: if_icmpge 319
      // 0fd: aload 2
      // 0fe: iload 18
      // 100: iload 3
      // 101: iflt 109
      // 104: ifne 320
      // 107: iload 21
      // 109: aaload
      // 10a: aload 20
      // 10c: iload 21
      // 10e: aaload
      // 10f: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 112: iload 18
      // 114: iload 3
      // 115: ifle 178
      // 118: ifne 176
      // 11b: goto 129
      // 11e: ldc2_w -4744587567714365566
      // 121: lload 9
      // 123: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: iload 6
      // 12b: ifgt 168
      // 12e: ifeq 157
      // 131: goto 13f
      // 134: ldc2_w -4744587567714365566
      // 137: lload 9
      // 139: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: iload 18
      // 141: iload 6
      // 143: ifge 316
      // 146: ifeq 311
      // 149: goto 157
      // 14c: ldc2_w -4744587567714365566
      // 14f: lload 9
      // 151: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 5
      // 159: bipush 1
      // 15a: invokevirtual com/zelix/xx.Q (Z)V
      // 15d: aload 2
      // 15e: iload 21
      // 160: aaload
      // 161: lload 14
      // 163: dup2_x1
      // 164: pop2
      // 165: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 168: goto 176
      // 16b: ldc2_w -4744587567714365566
      // 16e: lload 9
      // 170: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: iload 18
      // 178: iload 6
      // 17a: ifge 1ad
      // 17d: ifne 1ab
      // 180: ifeq 2ae
      // 183: goto 191
      // 186: ldc2_w -4744587567714365566
      // 189: lload 9
      // 18b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: aload 20
      // 193: iload 21
      // 195: aaload
      // 196: lload 14
      // 198: dup2_x1
      // 199: pop2
      // 19a: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 19d: goto 1ab
      // 1a0: ldc2_w -4744587567714365566
      // 1a3: lload 9
      // 1a5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: iload 18
      // 1ad: iload 3
      // 1ae: iflt 1e4
      // 1b1: ifne 1dd
      // 1b4: ifeq 2ae
      // 1b7: goto 1c5
      // 1ba: ldc2_w -4744587567714365566
      // 1bd: lload 9
      // 1bf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: aload 20
      // 1c7: iload 21
      // 1c9: aaload
      // 1ca: ldc "n"
      // 1cc: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 1cf: goto 1dd
      // 1d2: ldc2_w -4744587567714365566
      // 1d5: lload 9
      // 1d7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: iload 8
      // 1df: iflt 247
      // 1e2: iload 18
      // 1e4: ifne 247
      // 1e7: ifeq 218
      // 1ea: goto 1f8
      // 1ed: ldc2_w -4744587567714365566
      // 1f0: lload 9
      // 1f2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f7: athrow
      // 1f8: aload 20
      // 1fa: iload 21
      // 1fc: aload 2
      // 1fd: iload 21
      // 1ff: aaload
      // 200: aastore
      // 201: iload 18
      // 203: iload 3
      // 204: ifle 316
      // 207: ifeq 311
      // 20a: goto 218
      // 20d: ldc2_w -4744587567714365566
      // 210: lload 9
      // 212: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aload 2
      // 219: iload 21
      // 21b: iload 8
      // 21d: iflt 260
      // 220: iload 18
      // 222: ifne 260
      // 225: goto 233
      // 228: ldc2_w -4744587567714365566
      // 22b: lload 9
      // 22d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: aaload
      // 234: ldc "n"
      // 236: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 239: goto 247
      // 23c: ldc2_w -4744587567714365566
      // 23f: lload 9
      // 241: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: iload 3
      // 248: iflt 316
      // 24b: ifne 311
      // 24e: aload 20
      // 250: iload 21
      // 252: goto 260
      // 255: ldc2_w -4744587567714365566
      // 258: lload 9
      // 25a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: athrow
      // 260: aload 0
      // 261: aload 2
      // 262: iload 21
      // 264: aaload
      // 265: aload 20
      // 267: iload 21
      // 269: aaload
      // 26a: lload 16
      // 26c: dup2_x1
      // 26d: pop2
      // 26e: aload 7
      // 270: bipush 4
      // 271: anewarray 244
      // 274: dup_x1
      // 275: swap
      // 276: bipush 3
      // 277: swap
      // 278: aastore
      // 279: dup_x1
      // 27a: swap
      // 27b: bipush 2
      // 27c: swap
      // 27d: aastore
      // 27e: dup_x2
      // 27f: dup_x2
      // 280: pop
      // 281: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 284: bipush 1
      // 285: swap
      // 286: aastore
      // 287: dup_x1
      // 288: swap
      // 289: bipush 0
      // 28a: swap
      // 28b: aastore
      // 28c: ldc2_w -6613233626612481908
      // 28f: lload 9
      // 291: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: iload 11
      // 298: i2c
      // 299: swap
      // 29a: iload 12
      // 29c: i2s
      // 29d: swap
      // 29e: iload 13
      // 2a0: invokestatic com/zelix/n.s (CSLjava/lang/String;I)Lcom/zelix/n;
      // 2a3: aastore
      // 2a4: iload 18
      // 2a6: iload 8
      // 2a8: iflt 316
      // 2ab: ifeq 311
      // 2ae: new com/zelix/_sd
      // 2b1: dup
      // 2b2: new java/lang/StringBuilder
      // 2b5: dup
      // 2b6: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b9: sipush 4884
      // 2bc: ldc2_w 2379899649486657633
      // 2bf: lload 9
      // 2c1: lxor
      // 2c2: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_kz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ca: aload 20
      // 2cc: iload 21
      // 2ce: aaload
      // 2cf: invokevirtual com/zelix/n.j ()Ljava/lang/String;
      // 2d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d5: ldc " "
      // 2d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2da: aload 2
      // 2db: iload 21
      // 2dd: aaload
      // 2de: invokevirtual com/zelix/n.j ()Ljava/lang/String;
      // 2e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e4: sipush 14406
      // 2e7: ldc2_w 2200118128645780277
      // 2ea: lload 9
      // 2ec: lxor
      // 2ed: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_kz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f5: aload 7
      // 2f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fa: ldc "'"
      // 2fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ff: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 302: invokespecial com/zelix/_sd.<init> (Ljava/lang/String;)V
      // 305: athrow
      // 306: ldc2_w -4744587567714365566
      // 309: lload 9
      // 30b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: athrow
      // 311: iinc 21 1
      // 314: iload 18
      // 316: ifeq 0f6
      // 319: iload 8
      // 31b: ifle 0fd
      // 31e: aload 20
      // 320: areturn
   }

   e k(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var10001 = var3 ^ 36454662488559L;
      int var5 = (int)((var3 ^ 36454662488559L) >>> 48);
      int var6 = (int)((var3 ^ 36454662488559L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      var10001 = var3 ^ 53924368332125L;
      int var8 = (int)((var3 ^ 53924368332125L) >>> 48);
      int var9 = (int)((var3 ^ 53924368332125L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);

      try {
         if (var2) {
            return new q((short)var8, var9, var10, this);
         }
      } catch (gj var11) {
         throw x44.a<"u">(var11, -8228162240676643734L, var3);
      }

      return new t((short)var5, var6, this, (char)var7);
   }

   public static boolean g(n param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -4306579054229693863
      // 09: lload 1
      // 0a: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 0
      // 11: ldc "J"
      // 13: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 16: iload 3
      // 17: ifeq 52
      // 1a: ifne 51
      // 1d: goto 2a
      // 20: ldc2_w -4360055737530912040
      // 23: lload 1
      // 24: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: ldc "D"
      // 2d: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 30: iload 3
      // 31: ifeq 52
      // 34: goto 41
      // 37: ldc2_w -4360055737530912040
      // 3a: lload 1
      // 3b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: ifeq 55
      // 44: goto 51
      // 47: ldc2_w -4360055737530912040
      // 4a: lload 1
      // 4b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   public boolean G(Object[] param1) {
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
      // 0c: getstatic com/zelix/_kz.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 62286750014563
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 6680117900503990998
      // 1e: lload 2
      // 1f: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 2f: arraylength
      // 30: if_icmpge 76
      // 33: aload 0
      // 34: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 37: iload 7
      // 39: aaload
      // 3a: lload 4
      // 3c: invokestatic com/zelix/_kz.g (Lcom/zelix/n;J)Z
      // 3f: iload 6
      // 41: lload 2
      // 42: lconst_0
      // 43: lcmp
      // 44: ifle 4c
      // 47: ifeq 7d
      // 4a: iload 6
      // 4c: ifeq 6d
      // 4f: goto 5c
      // 52: ldc2_w 6625505976010435159
      // 55: lload 2
      // 56: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: ifeq 6e
      // 5f: goto 6c
      // 62: ldc2_w 6625505976010435159
      // 65: lload 2
      // 66: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 1
      // 6d: ireturn
      // 6e: iinc 7 1
      // 71: iload 6
      // 73: ifne 29
      // 76: lload 2
      // 77: lconst_0
      // 78: lcmp
      // 79: iflt 33
      // 7c: bipush 0
      // 7d: ireturn
   }

   public static boolean K(Object[] var0) {
      n var1 = (n)var0[0];
      return var1.T("I");
   }

   private boolean W(_fm param1, _kz param2, String param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_kz.a J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 98429221487983
      // 00e: lxor
      // 00f: lstore 6
      // 011: dup2
      // 012: ldc2_w 94375003378135
      // 015: lxor
      // 016: lstore 8
      // 018: pop2
      // 019: ldc2_w -2576531364793338069
      // 01c: lload 4
      // 01e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: aload 0
      // 024: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 027: arraylength
      // 028: istore 11
      // 02a: istore 10
      // 02c: aload 2
      // 02d: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 030: astore 12
      // 032: iload 11
      // 034: iload 10
      // 036: ifne 05c
      // 039: aload 12
      // 03b: arraylength
      // 03c: if_icmpne 2cf
      // 03f: goto 04d
      // 042: ldc2_w -2875103824070841924
      // 045: lload 4
      // 047: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: bipush 0
      // 04e: goto 05c
      // 051: ldc2_w -2875103824070841924
      // 054: lload 4
      // 056: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: istore 13
      // 05e: iload 13
      // 060: iload 11
      // 062: if_icmpge 2c6
      // 065: aload 0
      // 066: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 069: iload 13
      // 06b: aaload
      // 06c: aload 12
      // 06e: iload 13
      // 070: aaload
      // 071: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 074: iload 10
      // 076: lload 4
      // 078: lconst_0
      // 079: lcmp
      // 07a: iflt 082
      // 07d: ifne 2ce
      // 080: iload 10
      // 082: lload 4
      // 084: lconst_0
      // 085: lcmp
      // 086: iflt 0e6
      // 089: ifne 0e4
      // 08c: goto 09a
      // 08f: ldc2_w -2875103824070841924
      // 092: lload 4
      // 094: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: lload 4
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: iflt 0d6
      // 0a1: ifeq 0cc
      // 0a4: goto 0b2
      // 0a7: ldc2_w -2875103824070841924
      // 0aa: lload 4
      // 0ac: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: iload 10
      // 0b4: lload 4
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: ifle 2c3
      // 0bb: ifeq 2be
      // 0be: goto 0cc
      // 0c1: ldc2_w -2875103824070841924
      // 0c4: lload 4
      // 0c6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 12
      // 0ce: iload 13
      // 0d0: aaload
      // 0d1: ldc "?"
      // 0d3: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 0d6: goto 0e4
      // 0d9: ldc2_w -2875103824070841924
      // 0dc: lload 4
      // 0de: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: iload 10
      // 0e6: lload 4
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: iflt 137
      // 0ed: ifne 135
      // 0f0: ifeq 11b
      // 0f3: goto 101
      // 0f6: ldc2_w -2875103824070841924
      // 0f9: lload 4
      // 0fb: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: iload 10
      // 103: lload 4
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 2c3
      // 10a: ifeq 2be
      // 10d: goto 11b
      // 110: ldc2_w -2875103824070841924
      // 113: lload 4
      // 115: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 0
      // 11c: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 11f: iload 13
      // 121: aaload
      // 122: ldc "?"
      // 124: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 127: goto 135
      // 12a: ldc2_w -2875103824070841924
      // 12d: lload 4
      // 12f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: iload 10
      // 137: lload 4
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 16f
      // 13e: ifne 16d
      // 141: ifeq 15f
      // 144: goto 152
      // 147: ldc2_w -2875103824070841924
      // 14a: lload 4
      // 14c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: bipush 0
      // 153: ireturn
      // 154: ldc2_w -2875103824070841924
      // 157: lload 4
      // 159: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 0
      // 160: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 163: iload 13
      // 165: aaload
      // 166: lload 8
      // 168: dup2_x1
      // 169: pop2
      // 16a: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 16d: iload 10
      // 16f: ifne 2bd
      // 172: ifeq 2bc
      // 175: goto 183
      // 178: ldc2_w -2875103824070841924
      // 17b: lload 4
      // 17d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: aload 12
      // 185: iload 13
      // 187: aaload
      // 188: lload 8
      // 18a: dup2_x1
      // 18b: pop2
      // 18c: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 18f: iload 10
      // 191: ifne 2bd
      // 194: goto 1a2
      // 197: ldc2_w -2875103824070841924
      // 19a: lload 4
      // 19c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: ifeq 2bc
      // 1a5: goto 1b3
      // 1a8: ldc2_w -2875103824070841924
      // 1ab: lload 4
      // 1ad: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 1b7: iload 13
      // 1b9: aaload
      // 1ba: invokevirtual com/zelix/n.o ()Z
      // 1bd: iload 10
      // 1bf: lload 4
      // 1c1: lconst_0
      // 1c2: lcmp
      // 1c3: iflt 209
      // 1c6: ifne 207
      // 1c9: goto 1d7
      // 1cc: ldc2_w -2875103824070841924
      // 1cf: lload 4
      // 1d1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: aload 12
      // 1d9: iload 13
      // 1db: aaload
      // 1dc: invokevirtual com/zelix/n.o ()Z
      // 1df: if_icmpeq 1fd
      // 1e2: goto 1f0
      // 1e5: ldc2_w -2875103824070841924
      // 1e8: lload 4
      // 1ea: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: bipush 0
      // 1f1: ireturn
      // 1f2: ldc2_w -2875103824070841924
      // 1f5: lload 4
      // 1f7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fc: athrow
      // 1fd: aload 12
      // 1ff: iload 13
      // 201: aaload
      // 202: ldc "n"
      // 204: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 207: iload 10
      // 209: lload 4
      // 20b: lconst_0
      // 20c: lcmp
      // 20d: iflt 23f
      // 210: ifne 23d
      // 213: ifeq 231
      // 216: goto 224
      // 219: ldc2_w -2875103824070841924
      // 21c: lload 4
      // 21e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: bipush 0
      // 225: ireturn
      // 226: ldc2_w -2875103824070841924
      // 229: lload 4
      // 22b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: aload 0
      // 232: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 235: iload 13
      // 237: aaload
      // 238: ldc "n"
      // 23a: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 23d: iload 10
      // 23f: lload 4
      // 241: lconst_0
      // 242: lcmp
      // 243: ifle 27e
      // 246: ifne 27c
      // 249: ifeq 267
      // 24c: goto 25a
      // 24f: ldc2_w -2875103824070841924
      // 252: lload 4
      // 254: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: bipush 0
      // 25b: ireturn
      // 25c: ldc2_w -2875103824070841924
      // 25f: lload 4
      // 261: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: athrow
      // 267: aload 1
      // 268: aload 0
      // 269: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 26c: iload 13
      // 26e: aaload
      // 26f: lload 6
      // 271: dup2_x1
      // 272: pop2
      // 273: aload 12
      // 275: iload 13
      // 277: aaload
      // 278: aload 3
      // 279: invokevirtual com/zelix/_fm.z (JLcom/zelix/n;Lcom/zelix/n;Ljava/lang/String;)Z
      // 27c: iload 10
      // 27e: ifne 2bb
      // 281: ifeq 2ac
      // 284: goto 292
      // 287: ldc2_w -2875103824070841924
      // 28a: lload 4
      // 28c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: athrow
      // 292: iload 10
      // 294: lload 4
      // 296: lconst_0
      // 297: lcmp
      // 298: ifle 2c3
      // 29b: ifeq 2be
      // 29e: goto 2ac
      // 2a1: ldc2_w -2875103824070841924
      // 2a4: lload 4
      // 2a6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: athrow
      // 2ac: bipush 0
      // 2ad: goto 2bb
      // 2b0: ldc2_w -2875103824070841924
      // 2b3: lload 4
      // 2b5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: athrow
      // 2bb: ireturn
      // 2bc: bipush 0
      // 2bd: ireturn
      // 2be: iinc 13 1
      // 2c1: iload 10
      // 2c3: ifeq 05e
      // 2c6: lload 4
      // 2c8: lconst_0
      // 2c9: lcmp
      // 2ca: ifle 065
      // 2cd: bipush 1
      // 2ce: ireturn
      // 2cf: new com/zelix/_sk
      // 2d2: dup
      // 2d3: new java/lang/StringBuilder
      // 2d6: dup
      // 2d7: invokespecial java/lang/StringBuilder.<init> ()V
      // 2da: sipush 5300
      // 2dd: ldc2_w 8786486211668146684
      // 2e0: lload 4
      // 2e2: lxor
      // 2e3: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/_kz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2eb: iload 11
      // 2ed: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2f0: ldc " "
      // 2f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f5: aload 12
      // 2f7: arraylength
      // 2f8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2fb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2fe: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 301: athrow
   }

   private boolean q(_fm param1, long param2, _kz param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_kz.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 61702469967653
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 57509805607837
      // 012: lxor
      // 013: lstore 8
      // 015: pop2
      // 016: ldc2_w 5076739599541382497
      // 019: lload 2
      // 01a: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: aload 0
      // 020: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 023: arraylength
      // 024: istore 11
      // 026: istore 10
      // 028: iload 11
      // 02a: iload 10
      // 02c: ifne 22a
      // 02f: aload 4
      // 031: invokevirtual com/zelix/_kz.k ()I
      // 034: if_icmpne 229
      // 037: goto 044
      // 03a: ldc2_w 4779433926876099574
      // 03d: lload 2
      // 03e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: athrow
      // 044: bipush 0
      // 045: istore 12
      // 047: iload 12
      // 049: iload 11
      // 04b: if_icmpge 221
      // 04e: aload 0
      // 04f: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 052: iload 12
      // 054: aaload
      // 055: aload 4
      // 057: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 05a: iload 12
      // 05c: aaload
      // 05d: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 060: iload 10
      // 062: lload 2
      // 063: lconst_0
      // 064: lcmp
      // 065: ifle 06d
      // 068: ifne 228
      // 06b: iload 10
      // 06d: lload 2
      // 06e: lconst_0
      // 06f: lcmp
      // 070: iflt 0ce
      // 073: ifne 0cc
      // 076: goto 083
      // 079: ldc2_w 4779433926876099574
      // 07c: lload 2
      // 07d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: lload 2
      // 084: lconst_0
      // 085: lcmp
      // 086: ifle 0bf
      // 089: ifeq 0b1
      // 08c: goto 099
      // 08f: ldc2_w 4779433926876099574
      // 092: lload 2
      // 093: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: iload 10
      // 09b: lload 2
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: iflt 21e
      // 0a1: ifeq 219
      // 0a4: goto 0b1
      // 0a7: ldc2_w 4779433926876099574
      // 0aa: lload 2
      // 0ab: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 0b5: iload 12
      // 0b7: aaload
      // 0b8: lload 8
      // 0ba: dup2_x1
      // 0bb: pop2
      // 0bc: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 0bf: goto 0cc
      // 0c2: ldc2_w 4779433926876099574
      // 0c5: lload 2
      // 0c6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: iload 10
      // 0ce: ifne 218
      // 0d1: ifeq 217
      // 0d4: goto 0e1
      // 0d7: ldc2_w 4779433926876099574
      // 0da: lload 2
      // 0db: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: aload 4
      // 0e3: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 0e6: iload 12
      // 0e8: aaload
      // 0e9: lload 8
      // 0eb: dup2_x1
      // 0ec: pop2
      // 0ed: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 0f0: iload 10
      // 0f2: ifne 218
      // 0f5: goto 102
      // 0f8: ldc2_w 4779433926876099574
      // 0fb: lload 2
      // 0fc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: ifeq 217
      // 105: goto 112
      // 108: ldc2_w 4779433926876099574
      // 10b: lload 2
      // 10c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: aload 0
      // 113: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 116: iload 12
      // 118: aaload
      // 119: invokevirtual com/zelix/n.o ()Z
      // 11c: iload 10
      // 11e: lload 2
      // 11f: lconst_0
      // 120: lcmp
      // 121: ifle 169
      // 124: ifne 167
      // 127: goto 134
      // 12a: ldc2_w 4779433926876099574
      // 12d: lload 2
      // 12e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: aload 4
      // 136: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 139: iload 12
      // 13b: aaload
      // 13c: invokevirtual com/zelix/n.o ()Z
      // 13f: if_icmpeq 15b
      // 142: goto 14f
      // 145: ldc2_w 4779433926876099574
      // 148: lload 2
      // 149: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: bipush 0
      // 150: ireturn
      // 151: ldc2_w 4779433926876099574
      // 154: lload 2
      // 155: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: athrow
      // 15b: aload 0
      // 15c: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 15f: iload 12
      // 161: aaload
      // 162: ldc "n"
      // 164: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 167: iload 10
      // 169: lload 2
      // 16a: lconst_0
      // 16b: lcmp
      // 16c: iflt 19d
      // 16f: ifne 19b
      // 172: ifeq 18e
      // 175: goto 182
      // 178: ldc2_w 4779433926876099574
      // 17b: lload 2
      // 17c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: bipush 0
      // 183: ireturn
      // 184: ldc2_w 4779433926876099574
      // 187: lload 2
      // 188: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 4
      // 190: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 193: iload 12
      // 195: aaload
      // 196: ldc "n"
      // 198: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 19b: iload 10
      // 19d: lload 2
      // 19e: lconst_0
      // 19f: lcmp
      // 1a0: iflt 1dd
      // 1a3: ifne 1db
      // 1a6: ifeq 1c2
      // 1a9: goto 1b6
      // 1ac: ldc2_w 4779433926876099574
      // 1af: lload 2
      // 1b0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: bipush 0
      // 1b7: ireturn
      // 1b8: ldc2_w 4779433926876099574
      // 1bb: lload 2
      // 1bc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: aload 1
      // 1c3: aload 0
      // 1c4: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 1c7: iload 12
      // 1c9: aaload
      // 1ca: lload 6
      // 1cc: dup2_x1
      // 1cd: pop2
      // 1ce: aload 4
      // 1d0: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 1d3: iload 12
      // 1d5: aaload
      // 1d6: aload 5
      // 1d8: invokevirtual com/zelix/_fm.z (JLcom/zelix/n;Lcom/zelix/n;Ljava/lang/String;)Z
      // 1db: iload 10
      // 1dd: ifne 216
      // 1e0: ifeq 208
      // 1e3: goto 1f0
      // 1e6: ldc2_w 4779433926876099574
      // 1e9: lload 2
      // 1ea: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: iload 10
      // 1f2: lload 2
      // 1f3: lconst_0
      // 1f4: lcmp
      // 1f5: iflt 21e
      // 1f8: ifeq 219
      // 1fb: goto 208
      // 1fe: ldc2_w 4779433926876099574
      // 201: lload 2
      // 202: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: athrow
      // 208: bipush 0
      // 209: goto 216
      // 20c: ldc2_w 4779433926876099574
      // 20f: lload 2
      // 210: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 215: athrow
      // 216: ireturn
      // 217: bipush 0
      // 218: ireturn
      // 219: iinc 12 1
      // 21c: iload 10
      // 21e: ifeq 047
      // 221: lload 2
      // 222: lconst_0
      // 223: lcmp
      // 224: iflt 04e
      // 227: bipush 1
      // 228: ireturn
      // 229: bipush 0
      // 22a: ireturn
   }

   public final int k() {
      return this.l.length;
   }

   public _op p(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 7699523788161
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: ldc2_w 4456371464041780941
      // 11: lload 1
      // 12: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: istore 5
      // 19: aload 0
      // 1a: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 1d: iload 5
      // 1f: ifne 43
      // 22: ifnull 5b
      // 25: goto 32
      // 28: ldc2_w 4179323058312513626
      // 2b: lload 1
      // 2c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: aload 0
      // 33: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 36: goto 43
      // 39: ldc2_w 4179323058312513626
      // 3c: lload 1
      // 3d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: lload 3
      // 44: bipush 1
      // 45: anewarray 244
      // 48: dup_x2
      // 49: dup_x2
      // 4a: pop
      // 4b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e: bipush 0
      // 4f: swap
      // 50: aastore
      // 51: ldc2_w 4469392712368961576
      // 54: lload 1
      // 55: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: areturn
      // 5b: aconst_null
      // 5c: areturn
   }

   boolean o(long var1) {
      var1 = a ^ var1;

      try {
         if (this.F != null) {
            return true;
         }
      } catch (gj var3) {
         throw x44.a<"s">(var3, -6239189598269171508L, var1);
      }

      return false;
   }

   public _kz Z(_fm param1, _kz param2, xx param3, String param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_kz.a J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 13537195085565
      // 00e: lxor
      // 00f: lstore 7
      // 011: dup2
      // 012: ldc2_w 57349602004513
      // 015: lxor
      // 016: lstore 9
      // 018: dup2
      // 019: ldc2_w 69482952343507
      // 01c: lxor
      // 01d: dup2
      // 01e: bipush 32
      // 020: lushr
      // 021: l2i
      // 022: istore 11
      // 024: dup2
      // 025: bipush 32
      // 027: lshl
      // 028: bipush 48
      // 02a: lushr
      // 02b: l2i
      // 02c: istore 12
      // 02e: dup2
      // 02f: bipush 48
      // 031: lshl
      // 032: bipush 48
      // 034: lushr
      // 035: l2i
      // 036: istore 13
      // 038: pop2
      // 039: dup2
      // 03a: ldc2_w 43483772741989
      // 03d: lxor
      // 03e: lstore 14
      // 040: pop2
      // 041: ldc2_w -4440933412926628804
      // 044: lload 5
      // 046: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: new com/zelix/xx
      // 04e: dup
      // 04f: invokespecial com/zelix/xx.<init> ()V
      // 052: astore 17
      // 054: istore 16
      // 056: new com/zelix/xx
      // 059: dup
      // 05a: invokespecial com/zelix/xx.<init> ()V
      // 05d: astore 18
      // 05f: aload 1
      // 060: aload 0
      // 061: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 064: aload 2
      // 065: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 068: iload 11
      // 06a: bipush 1
      // 06b: aload 17
      // 06d: iload 12
      // 06f: i2s
      // 070: aload 4
      // 072: iload 13
      // 074: i2c
      // 075: invokestatic com/zelix/_kz.J (Lcom/zelix/_fm;[Lcom/zelix/n;[Lcom/zelix/n;IZLcom/zelix/xx;SLjava/lang/String;C)[Lcom/zelix/n;
      // 078: astore 19
      // 07a: aload 1
      // 07b: aload 0
      // 07c: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 07f: aload 2
      // 080: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 083: lload 7
      // 085: dup2_x1
      // 086: pop2
      // 087: bipush 1
      // 088: aload 18
      // 08a: aload 4
      // 08c: invokestatic com/zelix/_kz.r (Lcom/zelix/_fm;[Lcom/zelix/n;J[Lcom/zelix/n;ZLcom/zelix/xx;Ljava/lang/String;)[Lcom/zelix/n;
      // 08f: astore 20
      // 091: aload 3
      // 092: aload 17
      // 094: invokevirtual com/zelix/xx.S ()Z
      // 097: iload 16
      // 099: ifeq 0d7
      // 09c: ifne 0d6
      // 09f: goto 0ad
      // 0a2: ldc2_w -4244449316962765635
      // 0a5: lload 5
      // 0a7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: athrow
      // 0ad: aload 18
      // 0af: invokevirtual com/zelix/xx.S ()Z
      // 0b2: iload 16
      // 0b4: ifeq 0d7
      // 0b7: goto 0c5
      // 0ba: ldc2_w -4244449316962765635
      // 0bd: lload 5
      // 0bf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: ifeq 0da
      // 0c8: goto 0d6
      // 0cb: ldc2_w -4244449316962765635
      // 0ce: lload 5
      // 0d0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: bipush 1
      // 0d7: goto 0db
      // 0da: bipush 0
      // 0db: invokevirtual com/zelix/xx.Q (Z)V
      // 0de: new java/util/LinkedHashSet
      // 0e1: dup
      // 0e2: invokespecial java/util/LinkedHashSet.<init> ()V
      // 0e5: astore 21
      // 0e7: aload 0
      // 0e8: getfield com/zelix/_kz.M Ljava/util/Set;
      // 0eb: lload 5
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: ifle 126
      // 0f2: iload 16
      // 0f4: ifeq 126
      // 0f7: ifnull 122
      // 0fa: goto 108
      // 0fd: ldc2_w -4244449316962765635
      // 100: lload 5
      // 102: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 21
      // 10a: aload 0
      // 10b: getfield com/zelix/_kz.M Ljava/util/Set;
      // 10e: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 113: pop
      // 114: goto 122
      // 117: ldc2_w -4244449316962765635
      // 11a: lload 5
      // 11c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: aload 2
      // 123: getfield com/zelix/_kz.M Ljava/util/Set;
      // 126: ifnull 143
      // 129: aload 21
      // 12b: aload 2
      // 12c: getfield com/zelix/_kz.M Ljava/util/Set;
      // 12f: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 134: pop
      // 135: goto 143
      // 138: ldc2_w -4244449316962765635
      // 13b: lload 5
      // 13d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: aload 21
      // 145: lload 5
      // 147: lconst_0
      // 148: lcmp
      // 149: ifle 179
      // 14c: iload 16
      // 14e: ifeq 179
      // 151: invokeinterface java/util/Set.size ()I 1
      // 156: ifle 1b7
      // 159: goto 167
      // 15c: ldc2_w -4244449316962765635
      // 15f: lload 5
      // 161: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: aload 0
      // 168: getfield com/zelix/_kz.M Ljava/util/Set;
      // 16b: goto 179
      // 16e: ldc2_w -4244449316962765635
      // 171: lload 5
      // 173: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 178: athrow
      // 179: ifnull 198
      // 17c: aload 21
      // 17e: aload 0
      // 17f: getfield com/zelix/_kz.M Ljava/util/Set;
      // 182: invokeinterface java/util/Set.equals (Ljava/lang/Object;)Z 2
      // 187: ifne 1ba
      // 18a: goto 198
      // 18d: ldc2_w -4244449316962765635
      // 190: lload 5
      // 192: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: aload 3
      // 199: bipush 1
      // 19a: invokevirtual com/zelix/xx.Q (Z)V
      // 19d: lload 5
      // 19f: lconst_0
      // 1a0: lcmp
      // 1a1: iflt 1ba
      // 1a4: iload 16
      // 1a6: ifne 1ba
      // 1a9: goto 1b7
      // 1ac: ldc2_w -4244449316962765635
      // 1af: lload 5
      // 1b1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: aconst_null
      // 1b8: astore 21
      // 1ba: aload 0
      // 1bb: iload 16
      // 1bd: ifeq 2cd
      // 1c0: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 1c3: ifnull 2b0
      // 1c6: goto 1d4
      // 1c9: ldc2_w -4244449316962765635
      // 1cc: lload 5
      // 1ce: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: athrow
      // 1d4: aload 2
      // 1d5: iload 16
      // 1d7: ifeq 2cd
      // 1da: goto 1e8
      // 1dd: ldc2_w -4244449316962765635
      // 1e0: lload 5
      // 1e2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: lload 5
      // 1ea: lconst_0
      // 1eb: lcmp
      // 1ec: iflt 2bf
      // 1ef: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 1f2: ifnull 2b0
      // 1f5: goto 203
      // 1f8: ldc2_w -4244449316962765635
      // 1fb: lload 5
      // 1fd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: aload 0
      // 204: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 207: iload 16
      // 209: ifeq 281
      // 20c: goto 21a
      // 20f: ldc2_w -4244449316962765635
      // 212: lload 5
      // 214: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: aload 2
      // 21b: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 21e: invokevirtual com/zelix/p5.equals (Ljava/lang/Object;)Z
      // 221: ifeq 262
      // 224: goto 232
      // 227: ldc2_w -4244449316962765635
      // 22a: lload 5
      // 22c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: new com/zelix/_kz
      // 235: dup
      // 236: aload 19
      // 238: aload 20
      // 23a: aload 0
      // 23b: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 23e: ldc2_w -2484690243787791547
      // 241: lload 5
      // 243: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: lload 14
      // 24a: dup2_x1
      // 24b: pop2
      // 24c: checkcast com/zelix/p5
      // 24f: aload 21
      // 251: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 254: lload 5
      // 256: lconst_0
      // 257: lcmp
      // 258: ifle 270
      // 25b: astore 22
      // 25d: iload 16
      // 25f: ifne 2cf
      // 262: aload 0
      // 263: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 266: ldc2_w -2484690243787791547
      // 269: lload 5
      // 26b: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: checkcast com/zelix/p5
      // 273: goto 281
      // 276: ldc2_w -4244449316962765635
      // 279: lload 5
      // 27b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: athrow
      // 281: astore 23
      // 283: aload 23
      // 285: aload 2
      // 286: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 289: invokevirtual com/zelix/p5.or (Ljava/util/BitSet;)V
      // 28c: new com/zelix/_kz
      // 28f: dup
      // 290: aload 19
      // 292: aload 20
      // 294: lload 14
      // 296: aload 23
      // 298: aload 21
      // 29a: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 29d: lload 5
      // 29f: lconst_0
      // 2a0: lcmp
      // 2a1: iflt 2bf
      // 2a4: astore 22
      // 2a6: aload 3
      // 2a7: bipush 1
      // 2a8: invokevirtual com/zelix/xx.Q (Z)V
      // 2ab: iload 16
      // 2ad: ifne 2cf
      // 2b0: new com/zelix/_kz
      // 2b3: dup
      // 2b4: aload 19
      // 2b6: lload 9
      // 2b8: aload 20
      // 2ba: aload 21
      // 2bc: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;J[Lcom/zelix/n;Ljava/util/Set;)V
      // 2bf: goto 2cd
      // 2c2: ldc2_w -4244449316962765635
      // 2c5: lload 5
      // 2c7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: athrow
      // 2cd: astore 22
      // 2cf: aload 22
      // 2d1: areturn
   }

   public static _kz S(Object[] param0) {
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
      // 004: checkcast com/zelix/_fm
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_kz
      // 00e: astore 7
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast [Lcom/zelix/n;
      // 016: astore 6
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/p5
      // 01e: astore 2
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/util/Set
      // 025: astore 3
      // 026: dup
      // 027: bipush 5
      // 028: aaload
      // 029: checkcast java/lang/Long
      // 02c: invokevirtual java/lang/Long.longValue ()J
      // 02f: lstore 4
      // 031: pop
      // 032: getstatic com/zelix/_kz.a J
      // 035: lload 4
      // 037: lxor
      // 038: lstore 4
      // 03a: lload 4
      // 03c: dup2
      // 03d: ldc2_w 88692979413107
      // 040: lxor
      // 041: lstore 8
      // 043: dup2
      // 044: ldc2_w 132023208508587
      // 047: lxor
      // 048: lstore 10
      // 04a: dup2
      // 04b: ldc2_w 118437615885295
      // 04e: lxor
      // 04f: lstore 12
      // 051: pop2
      // 052: new com/zelix/xx
      // 055: dup
      // 056: invokespecial com/zelix/xx.<init> ()V
      // 059: astore 15
      // 05b: ldc2_w -1092986383929282890
      // 05e: lload 4
      // 060: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: aload 1
      // 066: aload 6
      // 068: aload 7
      // 06a: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 06d: aload 7
      // 06f: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 072: lload 8
      // 074: aload 15
      // 076: bipush 6
      // 078: anewarray 244
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 5
      // 07e: swap
      // 07f: aastore
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 4
      // 087: swap
      // 088: aastore
      // 089: dup_x1
      // 08a: swap
      // 08b: bipush 3
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x1
      // 08f: swap
      // 090: bipush 2
      // 091: swap
      // 092: aastore
      // 093: dup_x1
      // 094: swap
      // 095: bipush 1
      // 096: swap
      // 097: aastore
      // 098: dup_x1
      // 099: swap
      // 09a: bipush 0
      // 09b: swap
      // 09c: aastore
      // 09d: ldc2_w -919604419168522106
      // 0a0: lload 4
      // 0a2: invokedynamic p (Ljava/lang/Object;JJ)[Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: astore 16
      // 0a9: new java/util/LinkedHashSet
      // 0ac: dup
      // 0ad: invokespecial java/util/LinkedHashSet.<init> ()V
      // 0b0: astore 17
      // 0b2: istore 14
      // 0b4: aload 3
      // 0b5: iload 14
      // 0b7: ifeq 0e7
      // 0ba: ifnull 0e2
      // 0bd: goto 0cb
      // 0c0: ldc2_w -607172387835820489
      // 0c3: lload 4
      // 0c5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 17
      // 0cd: aload 3
      // 0ce: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 0d3: pop
      // 0d4: goto 0e2
      // 0d7: ldc2_w -607172387835820489
      // 0da: lload 4
      // 0dc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 7
      // 0e4: getfield com/zelix/_kz.M Ljava/util/Set;
      // 0e7: ifnull 105
      // 0ea: aload 17
      // 0ec: aload 7
      // 0ee: getfield com/zelix/_kz.M Ljava/util/Set;
      // 0f1: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 0f6: pop
      // 0f7: goto 105
      // 0fa: ldc2_w -607172387835820489
      // 0fd: lload 4
      // 0ff: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 17
      // 107: invokeinterface java/util/Set.size ()I 1
      // 10c: ifne 112
      // 10f: aconst_null
      // 110: astore 17
      // 112: aload 2
      // 113: iload 14
      // 115: lload 4
      // 117: lconst_0
      // 118: lcmp
      // 119: ifle 145
      // 11c: ifeq 143
      // 11f: ifnull 1c8
      // 122: goto 130
      // 125: ldc2_w -607172387835820489
      // 128: lload 4
      // 12a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 7
      // 132: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 135: goto 143
      // 138: ldc2_w -607172387835820489
      // 13b: lload 4
      // 13d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: iload 14
      // 145: ifeq 19a
      // 148: aload 2
      // 149: invokevirtual com/zelix/p5.equals (Ljava/lang/Object;)Z
      // 14c: ifeq 17e
      // 14f: goto 15d
      // 152: ldc2_w -607172387835820489
      // 155: lload 4
      // 157: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: new com/zelix/_kz
      // 160: dup
      // 161: aload 7
      // 163: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 166: aload 16
      // 168: lload 12
      // 16a: aload 2
      // 16b: aload 17
      // 16d: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 170: lload 4
      // 172: lconst_0
      // 173: lcmp
      // 174: ifle 189
      // 177: astore 18
      // 179: iload 14
      // 17b: ifne 1dc
      // 17e: aload 2
      // 17f: ldc2_w -1220801671971450417
      // 182: lload 4
      // 184: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: checkcast com/zelix/p5
      // 18c: goto 19a
      // 18f: ldc2_w -607172387835820489
      // 192: lload 4
      // 194: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: astore 19
      // 19c: aload 19
      // 19e: aload 7
      // 1a0: getfield com/zelix/_kz.B Lcom/zelix/p5;
      // 1a3: invokevirtual com/zelix/p5.or (Ljava/util/BitSet;)V
      // 1a6: new com/zelix/_kz
      // 1a9: dup
      // 1aa: aload 7
      // 1ac: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 1af: aload 16
      // 1b1: lload 12
      // 1b3: aload 19
      // 1b5: aload 17
      // 1b7: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 1ba: lload 4
      // 1bc: lconst_0
      // 1bd: lcmp
      // 1be: iflt 1da
      // 1c1: astore 18
      // 1c3: iload 14
      // 1c5: ifne 1dc
      // 1c8: new com/zelix/_kz
      // 1cb: dup
      // 1cc: aload 7
      // 1ce: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 1d1: lload 10
      // 1d3: aload 16
      // 1d5: aload 17
      // 1d7: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;J[Lcom/zelix/n;Ljava/util/Set;)V
      // 1da: astore 18
      // 1dc: aload 18
      // 1de: areturn
   }

   public n[] H(Object[] param1) {
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
      // 00c: getstatic com/zelix/_kz.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w -3971602532454226953
      // 015: lload 2
      // 016: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: istore 4
      // 01d: aload 0
      // 01e: iload 4
      // 020: ifne 147
      // 023: getfield com/zelix/_kz.F Ljava/util/BitSet;
      // 026: ifnull 146
      // 029: goto 036
      // 02c: ldc2_w -3691317150532567712
      // 02f: lload 2
      // 030: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: athrow
      // 036: aload 0
      // 037: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 03a: arraylength
      // 03b: anewarray 143
      // 03e: astore 5
      // 040: bipush 0
      // 041: istore 6
      // 043: iload 6
      // 045: aload 0
      // 046: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 049: arraylength
      // 04a: if_icmpge 13d
      // 04d: aload 0
      // 04e: iload 4
      // 050: ifne 109
      // 053: getfield com/zelix/_kz.F Ljava/util/BitSet;
      // 056: iload 6
      // 058: invokevirtual java/util/BitSet.get (I)Z
      // 05b: ifne 0fb
      // 05e: goto 06b
      // 061: ldc2_w -3691317150532567712
      // 064: lload 2
      // 065: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 06f: iload 6
      // 071: aaload
      // 072: iload 4
      // 074: ifne 12c
      // 077: goto 084
      // 07a: ldc2_w -3691317150532567712
      // 07d: lload 2
      // 07e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: lload 2
      // 085: lconst_0
      // 086: lcmp
      // 087: ifle 11f
      // 08a: getstatic com/zelix/n.l Lcom/zelix/n;
      // 08d: if_acmpne 11c
      // 090: goto 09d
      // 093: ldc2_w -3691317150532567712
      // 096: lload 2
      // 097: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 5
      // 09f: iload 6
      // 0a1: bipush 1
      // 0a2: isub
      // 0a3: aaload
      // 0a4: iload 4
      // 0a6: ifne 10f
      // 0a9: goto 0b6
      // 0ac: ldc2_w -3691317150532567712
      // 0af: lload 2
      // 0b0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: getstatic com/zelix/n.D Lcom/zelix/n;
      // 0b9: if_acmpeq 0fb
      // 0bc: goto 0c9
      // 0bf: ldc2_w -3691317150532567712
      // 0c2: lload 2
      // 0c3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 5
      // 0cb: iload 6
      // 0cd: bipush 1
      // 0ce: isub
      // 0cf: aaload
      // 0d0: iload 4
      // 0d2: ifne 12c
      // 0d5: goto 0e2
      // 0d8: ldc2_w -3691317150532567712
      // 0db: lload 2
      // 0dc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: lload 2
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: iflt 11f
      // 0e8: getstatic com/zelix/n.c Lcom/zelix/n;
      // 0eb: if_acmpne 11c
      // 0ee: goto 0fb
      // 0f1: ldc2_w -3691317150532567712
      // 0f4: lload 2
      // 0f5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: goto 109
      // 0ff: ldc2_w -3691317150532567712
      // 102: lload 2
      // 103: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 10c: iload 6
      // 10e: aaload
      // 10f: astore 7
      // 111: iload 4
      // 113: lload 2
      // 114: lconst_0
      // 115: lcmp
      // 116: iflt 13a
      // 119: ifeq 12e
      // 11c: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 11f: goto 12c
      // 122: ldc2_w -3691317150532567712
      // 125: lload 2
      // 126: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: astore 7
      // 12e: aload 5
      // 130: iload 6
      // 132: aload 7
      // 134: aastore
      // 135: iinc 6 1
      // 138: iload 4
      // 13a: ifeq 043
      // 13d: aload 5
      // 13f: lload 2
      // 140: lconst_0
      // 141: lcmp
      // 142: ifle 10c
      // 145: areturn
      // 146: aload 0
      // 147: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 14a: areturn
   }

   public static boolean U(long param0, n param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 0
      // 04: lxor
      // 05: lstore 0
      // 06: ldc2_w -3961687933563100656
      // 09: lload 0
      // 0a: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 3
      // 10: aload 2
      // 11: ldc "["
      // 13: invokevirtual com/zelix/n.n (Ljava/lang/String;)Z
      // 16: iload 3
      // 17: ifne ac
      // 1a: ifne ab
      // 1d: goto 2a
      // 20: ldc2_w -3665217881174311801
      // 23: lload 0
      // 24: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 2
      // 2b: ldc "L"
      // 2d: invokevirtual com/zelix/n.n (Ljava/lang/String;)Z
      // 30: iload 3
      // 31: lload 0
      // 32: lconst_0
      // 33: lcmp
      // 34: iflt 98
      // 37: ifne 97
      // 3a: goto 47
      // 3d: ldc2_w -3665217881174311801
      // 40: lload 0
      // 41: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: lload 0
      // 48: lconst_0
      // 49: lcmp
      // 4a: iflt 8a
      // 4d: ifeq 84
      // 50: goto 5d
      // 53: ldc2_w -3665217881174311801
      // 56: lload 0
      // 57: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 2
      // 5e: ldc ";"
      // 60: invokevirtual com/zelix/n.s (Ljava/lang/String;)Z
      // 63: iload 3
      // 64: ifne ac
      // 67: goto 74
      // 6a: ldc2_w -3665217881174311801
      // 6d: lload 0
      // 6e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: ifne ab
      // 77: goto 84
      // 7a: ldc2_w -3665217881174311801
      // 7d: lload 0
      // 7e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: aload 2
      // 85: ldc "n"
      // 87: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 8a: goto 97
      // 8d: ldc2_w -3665217881174311801
      // 90: lload 0
      // 91: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: iload 3
      // 98: ifne ac
      // 9b: ifeq af
      // 9e: goto ab
      // a1: ldc2_w -3665217881174311801
      // a4: lload 0
      // a5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: bipush 1
      // ac: goto b0
      // af: bipush 0
      // b0: ireturn
   }

   public static boolean Q(Object[] param0) {
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
      // 004: checkcast com/zelix/n
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
      // 01c: istore 6
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast com/zelix/n
      // 024: astore 3
      // 025: dup
      // 026: bipush 4
      // 027: aaload
      // 028: checkcast com/zelix/_fm
      // 02b: astore 2
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/lang/String
      // 032: astore 7
      // 034: pop
      // 035: lload 4
      // 037: bipush 32
      // 039: lshl
      // 03a: iload 6
      // 03c: i2l
      // 03d: bipush 32
      // 03f: lshl
      // 040: bipush 32
      // 042: lushr
      // 043: lor
      // 044: getstatic com/zelix/_kz.a J
      // 047: lxor
      // 048: lstore 8
      // 04a: lload 8
      // 04c: dup2
      // 04d: ldc2_w 37691473672334
      // 050: lxor
      // 051: lstore 10
      // 053: dup2
      // 054: ldc2_w 50678611520566
      // 057: lxor
      // 058: lstore 12
      // 05a: dup2
      // 05b: ldc2_w 14420370813105
      // 05e: lxor
      // 05f: lstore 14
      // 061: dup2
      // 062: ldc2_w 29371078571904
      // 065: lxor
      // 066: lstore 16
      // 068: pop2
      // 069: ldc2_w -6782656759023973686
      // 06c: lload 8
      // 06e: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: istore 18
      // 075: lload 12
      // 077: aload 1
      // 078: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 07b: iload 18
      // 07d: ifne 171
      // 080: ifeq 14c
      // 083: goto 091
      // 086: ldc2_w -6487171874394631075
      // 089: lload 8
      // 08b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: lload 12
      // 093: aload 3
      // 094: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 097: iload 18
      // 099: ifne 171
      // 09c: goto 0aa
      // 09f: ldc2_w -6487171874394631075
      // 0a2: lload 8
      // 0a4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: ifeq 14c
      // 0ad: goto 0bb
      // 0b0: ldc2_w -6487171874394631075
      // 0b3: lload 8
      // 0b5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: ldc "n"
      // 0be: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 0c1: iload 18
      // 0c3: iload 6
      // 0c5: ifgt 103
      // 0c8: ifne 101
      // 0cb: goto 0d9
      // 0ce: ldc2_w -6487171874394631075
      // 0d1: lload 8
      // 0d3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: ifeq 0f7
      // 0dc: goto 0ea
      // 0df: ldc2_w -6487171874394631075
      // 0e2: lload 8
      // 0e4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: bipush 1
      // 0eb: ireturn
      // 0ec: ldc2_w -6487171874394631075
      // 0ef: lload 8
      // 0f1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: aload 2
      // 0f8: lload 10
      // 0fa: aload 1
      // 0fb: aload 3
      // 0fc: aload 7
      // 0fe: invokevirtual com/zelix/_fm.z (JLcom/zelix/n;Lcom/zelix/n;Ljava/lang/String;)Z
      // 101: iload 18
      // 103: ifne 14b
      // 106: ifeq 124
      // 109: goto 117
      // 10c: ldc2_w -6487171874394631075
      // 10f: lload 8
      // 111: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: bipush 1
      // 118: ireturn
      // 119: ldc2_w -6487171874394631075
      // 11c: lload 8
      // 11e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: aload 2
      // 125: lload 14
      // 127: aload 3
      // 128: aload 7
      // 12a: bipush 3
      // 12b: anewarray 244
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 2
      // 131: swap
      // 132: aastore
      // 133: dup_x1
      // 134: swap
      // 135: bipush 1
      // 136: swap
      // 137: aastore
      // 138: dup_x2
      // 139: dup_x2
      // 13a: pop
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: bipush 0
      // 13f: swap
      // 140: aastore
      // 141: ldc2_w -6693353871784204672
      // 144: lload 8
      // 146: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: ireturn
      // 14c: aload 1
      // 14d: aload 3
      // 14e: lload 16
      // 150: bipush 3
      // 151: anewarray 244
      // 154: dup_x2
      // 155: dup_x2
      // 156: pop
      // 157: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15a: bipush 2
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x1
      // 15e: swap
      // 15f: bipush 1
      // 160: swap
      // 161: aastore
      // 162: dup_x1
      // 163: swap
      // 164: bipush 0
      // 165: swap
      // 166: aastore
      // 167: ldc2_w -4813412636283259109
      // 16a: lload 8
      // 16c: invokedynamic r (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: ireturn
   }

   public _kz(n[] param1, n[] param2, long param3, p5 param5, Set param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: aload 0
      // 07: invokespecial java/lang/Object.<init> ()V
      // 0a: ldc2_w 8059124745311154613
      // 0d: lload 3
      // 0e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13: aload 0
      // 14: aload 2
      // 15: putfield com/zelix/_kz.G [Lcom/zelix/n;
      // 18: aload 0
      // 19: aload 1
      // 1a: putfield com/zelix/_kz.l [Lcom/zelix/n;
      // 1d: aload 0
      // 1e: aload 5
      // 20: putfield com/zelix/_kz.B Lcom/zelix/p5;
      // 23: aload 0
      // 24: aload 6
      // 26: putfield com/zelix/_kz.M Ljava/util/Set;
      // 29: istore 7
      // 2b: bipush 0
      // 2c: istore 8
      // 2e: iload 8
      // 30: aload 0
      // 31: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 34: arraylength
      // 35: if_icmpge 73
      // 38: aload 0
      // 39: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 3c: iload 8
      // 3e: iload 7
      // 40: ifeq 67
      // 43: aaload
      // 44: ifnonnull 6b
      // 47: goto 54
      // 4a: ldc2_w 7535030164464621876
      // 4d: lload 3
      // 4e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 58: iload 8
      // 5a: goto 67
      // 5d: ldc2_w 7535030164464621876
      // 60: lload 3
      // 61: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 6a: aastore
      // 6b: iinc 8 1
      // 6e: iload 7
      // 70: ifne 2e
      // 73: lload 3
      // 74: lconst_0
      // 75: lcmp
      // 76: iflt 38
      // 79: return
   }

   public Set C(long var1) {
      var1 = a ^ var1;

      try {
         return this.M != null ? new LinkedHashSet(this.M) : null;
      } catch (gj var3) {
         throw x44.a<"q">(var3, 5691408105900769118L, var1);
      }
   }

   BitSet L() {
      return (BitSet)this.F.clone();
   }

   public boolean J(_fm param1, _kz param2, Set param3, boolean param4, String param5, int param6, int param7, long param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 7
      // 002: i2l
      // 003: bipush 32
      // 005: lshl
      // 006: lload 8
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: getstatic com/zelix/_kz.a J
      // 012: lxor
      // 013: lstore 10
      // 015: lload 10
      // 017: dup2
      // 018: ldc2_w 89023033111111
      // 01b: lxor
      // 01c: lstore 12
      // 01e: dup2
      // 01f: ldc2_w 54340551600141
      // 022: lxor
      // 023: lstore 14
      // 025: dup2
      // 026: ldc2_w 63510477232751
      // 029: lxor
      // 02a: lstore 16
      // 02c: pop2
      // 02d: ldc2_w -883006542936642084
      // 030: lload 10
      // 032: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: istore 18
      // 039: aload 0
      // 03a: aload 1
      // 03b: lload 12
      // 03d: aload 2
      // 03e: aload 5
      // 040: invokespecial com/zelix/_kz.q (Lcom/zelix/_fm;JLcom/zelix/_kz;Ljava/lang/String;)Z
      // 043: iload 18
      // 045: ifeq 103
      // 048: ifeq 101
      // 04b: goto 059
      // 04e: ldc2_w -794635226038221475
      // 051: lload 10
      // 053: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: athrow
      // 059: aload 0
      // 05a: aload 1
      // 05b: aload 2
      // 05c: aload 5
      // 05e: lload 14
      // 060: invokespecial com/zelix/_kz.W (Lcom/zelix/_fm;Lcom/zelix/_kz;Ljava/lang/String;J)Z
      // 063: iload 18
      // 065: iload 7
      // 067: iflt 105
      // 06a: ifeq 103
      // 06d: goto 07b
      // 070: ldc2_w -794635226038221475
      // 073: lload 10
      // 075: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: ifeq 101
      // 07e: goto 08c
      // 081: ldc2_w -794635226038221475
      // 084: lload 10
      // 086: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: athrow
      // 08c: iload 4
      // 08e: iload 18
      // 090: ifeq 12e
      // 093: goto 0a1
      // 096: ldc2_w -794635226038221475
      // 099: lload 10
      // 09b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: iload 7
      // 0a3: ifle 120
      // 0a6: ifeq 11f
      // 0a9: goto 0b7
      // 0ac: ldc2_w -794635226038221475
      // 0af: lload 10
      // 0b1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: aload 2
      // 0b9: aload 3
      // 0ba: lload 16
      // 0bc: bipush 3
      // 0bd: anewarray 244
      // 0c0: dup_x2
      // 0c1: dup_x2
      // 0c2: pop
      // 0c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c6: bipush 2
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: bipush 1
      // 0cc: swap
      // 0cd: aastore
      // 0ce: dup_x1
      // 0cf: swap
      // 0d0: bipush 0
      // 0d1: swap
      // 0d2: aastore
      // 0d3: ldc2_w -1112122674358774608
      // 0d6: lload 10
      // 0d8: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: iload 18
      // 0df: ifeq 12e
      // 0e2: goto 0f0
      // 0e5: ldc2_w -794635226038221475
      // 0e8: lload 10
      // 0ea: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: ifne 11f
      // 0f3: goto 101
      // 0f6: ldc2_w -794635226038221475
      // 0f9: lload 10
      // 0fb: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: athrow
      // 101: iload 6
      // 103: iload 18
      // 105: iload 7
      // 107: iflt 10e
      // 10a: ifeq 12e
      // 10d: bipush -1
      // 10e: if_icmpne 131
      // 111: goto 11f
      // 114: ldc2_w -794635226038221475
      // 117: lload 10
      // 119: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: bipush 1
      // 120: goto 12e
      // 123: ldc2_w -794635226038221475
      // 126: lload 10
      // 128: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: goto 132
      // 131: bipush 0
      // 132: ireturn
   }

   public boolean n(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: aload 0
      // 07: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 0a: arraylength
      // 0b: istore 4
      // 0d: ldc2_w -7455080243200560225
      // 10: lload 1
      // 11: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: bipush 0
      // 17: istore 5
      // 19: istore 3
      // 1a: iload 5
      // 1c: iload 4
      // 1e: if_icmpge 5f
      // 21: aload 0
      // 22: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 25: iload 5
      // 27: aaload
      // 28: invokevirtual com/zelix/n.o ()Z
      // 2b: iload 3
      // 2c: lload 1
      // 2d: lconst_0
      // 2e: lcmp
      // 2f: ifle 36
      // 32: ifne 6d
      // 35: iload 3
      // 36: ifne 57
      // 39: goto 46
      // 3c: ldc2_w -7156789262123553528
      // 3f: lload 1
      // 40: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: ifne 58
      // 49: goto 56
      // 4c: ldc2_w -7156789262123553528
      // 4f: lload 1
      // 50: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: bipush 0
      // 57: ireturn
      // 58: iinc 5 1
      // 5b: iload 3
      // 5c: ifeq 1a
      // 5f: aload 0
      // 60: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 63: arraylength
      // 64: istore 5
      // 66: lload 1
      // 67: lconst_0
      // 68: lcmp
      // 69: ifle 21
      // 6c: bipush 0
      // 6d: istore 6
      // 6f: iload 6
      // 71: iload 5
      // 73: if_icmpge b4
      // 76: aload 0
      // 77: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 7a: iload 6
      // 7c: aaload
      // 7d: invokevirtual com/zelix/n.o ()Z
      // 80: iload 3
      // 81: lload 1
      // 82: lconst_0
      // 83: lcmp
      // 84: ifle 8b
      // 87: ifne bb
      // 8a: iload 3
      // 8b: ifne ac
      // 8e: goto 9b
      // 91: ldc2_w -7156789262123553528
      // 94: lload 1
      // 95: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: ifne ad
      // 9e: goto ab
      // a1: ldc2_w -7156789262123553528
      // a4: lload 1
      // a5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: bipush 0
      // ac: ireturn
      // ad: iinc 6 1
      // b0: iload 3
      // b1: ifeq 6f
      // b4: lload 1
      // b5: lconst_0
      // b6: lcmp
      // b7: iflt 76
      // ba: bipush 1
      // bb: ireturn
   }

   private static n[] F(Object[] param0) {
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
      // 04: checkcast com/zelix/_fm
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast [Lcom/zelix/n;
      // 0f: astore 3
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast [Lcom/zelix/n;
      // 16: astore 7
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast com/zelix/p5
      // 1e: astore 5
      // 20: dup
      // 21: bipush 4
      // 22: aaload
      // 23: checkcast java/lang/Long
      // 26: invokevirtual java/lang/Long.longValue ()J
      // 29: lstore 1
      // 2a: dup
      // 2b: bipush 5
      // 2c: aaload
      // 2d: checkcast com/zelix/xx
      // 30: astore 6
      // 32: pop
      // 33: getstatic com/zelix/_kz.a J
      // 36: lload 1
      // 37: lxor
      // 38: lstore 1
      // 39: ldc2_w -8913757962802488791
      // 3c: lload 1
      // 3d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: aload 3
      // 43: arraylength
      // 44: istore 9
      // 46: istore 8
      // 48: aload 3
      // 49: invokevirtual [Lcom/zelix/n;.clone ()Ljava/lang/Object;
      // 4c: checkcast [Lcom/zelix/n;
      // 4f: astore 10
      // 51: aload 6
      // 53: bipush 0
      // 54: invokevirtual com/zelix/xx.Q (Z)V
      // 57: aload 5
      // 59: ifnull e1
      // 5c: bipush 0
      // 5d: istore 11
      // 5f: iload 11
      // 61: iload 9
      // 63: if_icmpge e1
      // 66: aload 7
      // 68: iload 8
      // 6a: lload 1
      // 6b: lconst_0
      // 6c: lcmp
      // 6d: iflt 75
      // 70: ifeq e3
      // 73: iload 11
      // 75: aaload
      // 76: aload 10
      // 78: iload 11
      // 7a: aaload
      // 7b: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 7e: lload 1
      // 7f: lconst_0
      // 80: lcmp
      // 81: iflt b3
      // 84: iload 8
      // 86: ifeq b3
      // 89: goto 96
      // 8c: ldc2_w -9003270567670205784
      // 8f: lload 1
      // 90: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: ifeq ac
      // 99: goto a6
      // 9c: ldc2_w -9003270567670205784
      // 9f: lload 1
      // a0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: lload 1
      // a7: lconst_0
      // a8: lcmp
      // a9: ifgt d9
      // ac: aload 5
      // ae: iload 11
      // b0: invokevirtual com/zelix/p5.get (I)Z
      // b3: lload 1
      // b4: lconst_0
      // b5: lcmp
      // b6: ifle de
      // b9: ifeq d9
      // bc: aload 6
      // be: bipush 1
      // bf: invokevirtual com/zelix/xx.Q (Z)V
      // c2: aload 10
      // c4: iload 11
      // c6: aload 7
      // c8: iload 11
      // ca: aaload
      // cb: aastore
      // cc: goto d9
      // cf: ldc2_w -9003270567670205784
      // d2: lload 1
      // d3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d8: athrow
      // d9: iinc 11 1
      // dc: iload 8
      // de: ifne 5f
      // e1: aload 10
      // e3: areturn
   }

   public static n[] r(_fm param0, n[] param1, long param2, n[] param4, boolean param5, xx param6, String param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_kz.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 117139652061467
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 48
      // 00f: lushr
      // 010: l2i
      // 011: istore 8
      // 013: dup2
      // 014: bipush 16
      // 016: lshl
      // 017: bipush 48
      // 019: lushr
      // 01a: l2i
      // 01b: istore 9
      // 01d: dup2
      // 01e: bipush 32
      // 020: lshl
      // 021: bipush 32
      // 023: lushr
      // 024: l2i
      // 025: istore 10
      // 027: pop2
      // 028: dup2
      // 029: ldc2_w 39976830846663
      // 02c: lxor
      // 02d: lstore 11
      // 02f: dup2
      // 030: ldc2_w 20233750413275
      // 033: lxor
      // 034: lstore 13
      // 036: pop2
      // 037: ldc2_w -3806065253442707397
      // 03a: lload 2
      // 03b: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aload 1
      // 041: arraylength
      // 042: istore 16
      // 044: istore 15
      // 046: iload 5
      // 048: ifeq 05f
      // 04b: aload 1
      // 04c: invokevirtual [Lcom/zelix/n;.clone ()Ljava/lang/Object;
      // 04f: checkcast [Lcom/zelix/n;
      // 052: astore 17
      // 054: iload 15
      // 056: lload 2
      // 057: lconst_0
      // 058: lcmp
      // 059: iflt 069
      // 05c: ifeq 062
      // 05f: aload 1
      // 060: astore 17
      // 062: aload 6
      // 064: bipush 0
      // 065: invokevirtual com/zelix/xx.Q (Z)V
      // 068: bipush 0
      // 069: istore 18
      // 06b: iload 18
      // 06d: iload 16
      // 06f: if_icmpge 375
      // 072: aload 4
      // 074: iload 15
      // 076: lload 2
      // 077: lconst_0
      // 078: lcmp
      // 079: ifle 081
      // 07c: ifne 37d
      // 07f: iload 18
      // 081: aaload
      // 082: aload 17
      // 084: iload 18
      // 086: aaload
      // 087: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 08a: lload 2
      // 08b: lconst_0
      // 08c: lcmp
      // 08d: ifle 1af
      // 090: iload 15
      // 092: ifne 1af
      // 095: goto 0a2
      // 098: ldc2_w -3528036217559712084
      // 09b: lload 2
      // 09c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: athrow
      // 0a2: ifeq 17a
      // 0a5: goto 0b2
      // 0a8: ldc2_w -3528036217559712084
      // 0ab: lload 2
      // 0ac: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 17
      // 0b4: iload 18
      // 0b6: aaload
      // 0b7: ldc "~"
      // 0b9: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 0bc: iload 15
      // 0be: lload 2
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: iflt 10c
      // 0c4: ifne 104
      // 0c7: goto 0d4
      // 0ca: ldc2_w -3528036217559712084
      // 0cd: lload 2
      // 0ce: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 372
      // 0da: ifeq 36d
      // 0dd: goto 0ea
      // 0e0: ldc2_w -3528036217559712084
      // 0e3: lload 2
      // 0e4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: aload 17
      // 0ec: iload 18
      // 0ee: bipush 1
      // 0ef: isub
      // 0f0: aaload
      // 0f1: getstatic com/zelix/n.D Lcom/zelix/n;
      // 0f4: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 0f7: goto 104
      // 0fa: ldc2_w -3528036217559712084
      // 0fd: lload 2
      // 0fe: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: lload 2
      // 105: lconst_0
      // 106: lcmp
      // 107: iflt 151
      // 10a: iload 15
      // 10c: ifne 151
      // 10f: ifne 36d
      // 112: goto 11f
      // 115: ldc2_w -3528036217559712084
      // 118: lload 2
      // 119: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: aload 17
      // 121: iload 18
      // 123: bipush 1
      // 124: isub
      // 125: lload 2
      // 126: lconst_0
      // 127: lcmp
      // 128: ifle 16b
      // 12b: iload 15
      // 12d: ifne 16b
      // 130: goto 13d
      // 133: ldc2_w -3528036217559712084
      // 136: lload 2
      // 137: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: aaload
      // 13e: getstatic com/zelix/n.c Lcom/zelix/n;
      // 141: invokevirtual com/zelix/n.equals (Ljava/lang/Object;)Z
      // 144: goto 151
      // 147: ldc2_w -3528036217559712084
      // 14a: lload 2
      // 14b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: lload 2
      // 152: lconst_0
      // 153: lcmp
      // 154: ifle 372
      // 157: ifne 36d
      // 15a: aload 17
      // 15c: iload 18
      // 15e: goto 16b
      // 161: ldc2_w -3528036217559712084
      // 164: lload 2
      // 165: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 16e: aastore
      // 16f: iload 15
      // 171: lload 2
      // 172: lconst_0
      // 173: lcmp
      // 174: ifle 372
      // 177: ifeq 36d
      // 17a: aload 6
      // 17c: bipush 1
      // 17d: invokevirtual com/zelix/xx.Q (Z)V
      // 180: aload 4
      // 182: iload 18
      // 184: lload 2
      // 185: lconst_0
      // 186: lcmp
      // 187: ifle 1fb
      // 18a: iload 15
      // 18c: ifne 1fb
      // 18f: goto 19c
      // 192: ldc2_w -3528036217559712084
      // 195: lload 2
      // 196: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: athrow
      // 19c: aaload
      // 19d: ldc "?"
      // 19f: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 1a2: goto 1af
      // 1a5: ldc2_w -3528036217559712084
      // 1a8: lload 2
      // 1a9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: lload 2
      // 1b0: lconst_0
      // 1b1: lcmp
      // 1b2: iflt 1c2
      // 1b5: ifne 1ea
      // 1b8: aload 17
      // 1ba: iload 18
      // 1bc: aaload
      // 1bd: ldc "?"
      // 1bf: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 1c2: lload 2
      // 1c3: lconst_0
      // 1c4: lcmp
      // 1c5: ifle 235
      // 1c8: iload 15
      // 1ca: ifne 235
      // 1cd: goto 1da
      // 1d0: ldc2_w -3528036217559712084
      // 1d3: lload 2
      // 1d4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d9: athrow
      // 1da: ifeq 20a
      // 1dd: goto 1ea
      // 1e0: ldc2_w -3528036217559712084
      // 1e3: lload 2
      // 1e4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: aload 17
      // 1ec: iload 18
      // 1ee: goto 1fb
      // 1f1: ldc2_w -3528036217559712084
      // 1f4: lload 2
      // 1f5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: athrow
      // 1fb: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 1fe: aastore
      // 1ff: iload 15
      // 201: lload 2
      // 202: lconst_0
      // 203: lcmp
      // 204: ifle 372
      // 207: ifeq 36d
      // 20a: aload 4
      // 20c: iload 18
      // 20e: iload 15
      // 210: ifne 369
      // 213: goto 220
      // 216: ldc2_w -3528036217559712084
      // 219: lload 2
      // 21a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: athrow
      // 220: aaload
      // 221: lload 11
      // 223: dup2_x1
      // 224: pop2
      // 225: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 228: goto 235
      // 22b: ldc2_w -3528036217559712084
      // 22e: lload 2
      // 22f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: ifeq 358
      // 238: aload 17
      // 23a: iload 18
      // 23c: iload 15
      // 23e: ifne 369
      // 241: goto 24e
      // 244: ldc2_w -3528036217559712084
      // 247: lload 2
      // 248: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: athrow
      // 24e: lload 2
      // 24f: lconst_0
      // 250: lcmp
      // 251: iflt 35c
      // 254: aaload
      // 255: lload 11
      // 257: dup2_x1
      // 258: pop2
      // 259: invokestatic com/zelix/_kz.U (JLcom/zelix/n;)Z
      // 25c: ifeq 358
      // 25f: goto 26c
      // 262: ldc2_w -3528036217559712084
      // 265: lload 2
      // 266: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: athrow
      // 26c: aload 17
      // 26e: iload 18
      // 270: aaload
      // 271: ldc "n"
      // 273: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 276: lload 2
      // 277: lconst_0
      // 278: lcmp
      // 279: ifle 2ef
      // 27c: iload 15
      // 27e: ifne 2ef
      // 281: goto 28e
      // 284: ldc2_w -3528036217559712084
      // 287: lload 2
      // 288: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: athrow
      // 28e: ifeq 2c0
      // 291: goto 29e
      // 294: ldc2_w -3528036217559712084
      // 297: lload 2
      // 298: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: athrow
      // 29e: aload 17
      // 2a0: iload 18
      // 2a2: aload 4
      // 2a4: iload 18
      // 2a6: aaload
      // 2a7: aastore
      // 2a8: iload 15
      // 2aa: lload 2
      // 2ab: lconst_0
      // 2ac: lcmp
      // 2ad: iflt 372
      // 2b0: ifeq 36d
      // 2b3: goto 2c0
      // 2b6: ldc2_w -3528036217559712084
      // 2b9: lload 2
      // 2ba: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bf: athrow
      // 2c0: aload 4
      // 2c2: iload 18
      // 2c4: lload 2
      // 2c5: lconst_0
      // 2c6: lcmp
      // 2c7: iflt 309
      // 2ca: iload 15
      // 2cc: ifne 309
      // 2cf: goto 2dc
      // 2d2: ldc2_w -3528036217559712084
      // 2d5: lload 2
      // 2d6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2db: athrow
      // 2dc: aaload
      // 2dd: ldc "n"
      // 2df: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 2e2: goto 2ef
      // 2e5: ldc2_w -3528036217559712084
      // 2e8: lload 2
      // 2e9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ee: athrow
      // 2ef: lload 2
      // 2f0: lconst_0
      // 2f1: lcmp
      // 2f2: iflt 372
      // 2f5: ifne 36d
      // 2f8: aload 17
      // 2fa: iload 18
      // 2fc: goto 309
      // 2ff: ldc2_w -3528036217559712084
      // 302: lload 2
      // 303: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: athrow
      // 309: aload 0
      // 30a: aload 4
      // 30c: iload 18
      // 30e: aaload
      // 30f: aload 17
      // 311: iload 18
      // 313: aaload
      // 314: lload 13
      // 316: dup2_x1
      // 317: pop2
      // 318: aload 7
      // 31a: bipush 4
      // 31b: anewarray 244
      // 31e: dup_x1
      // 31f: swap
      // 320: bipush 3
      // 321: swap
      // 322: aastore
      // 323: dup_x1
      // 324: swap
      // 325: bipush 2
      // 326: swap
      // 327: aastore
      // 328: dup_x2
      // 329: dup_x2
      // 32a: pop
      // 32b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 32e: bipush 1
      // 32f: swap
      // 330: aastore
      // 331: dup_x1
      // 332: swap
      // 333: bipush 0
      // 334: swap
      // 335: aastore
      // 336: ldc2_w -3091966953621999198
      // 339: lload 2
      // 33a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: iload 8
      // 341: i2c
      // 342: swap
      // 343: iload 9
      // 345: i2s
      // 346: swap
      // 347: iload 10
      // 349: invokestatic com/zelix/n.s (CSLjava/lang/String;I)Lcom/zelix/n;
      // 34c: aastore
      // 34d: iload 15
      // 34f: lload 2
      // 350: lconst_0
      // 351: lcmp
      // 352: ifle 372
      // 355: ifeq 36d
      // 358: aload 17
      // 35a: iload 18
      // 35c: goto 369
      // 35f: ldc2_w -3528036217559712084
      // 362: lload 2
      // 363: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: athrow
      // 369: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 36c: aastore
      // 36d: iinc 18 1
      // 370: iload 15
      // 372: ifeq 06b
      // 375: lload 2
      // 376: lconst_0
      // 377: lcmp
      // 378: ifle 072
      // 37b: aload 17
      // 37d: areturn
   }

   boolean C(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 118546915612772
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: aload 0
      // 0f: getfield com/zelix/_kz.l [Lcom/zelix/n;
      // 12: astore 6
      // 14: ldc2_w 8056059443203142062
      // 17: lload 1
      // 18: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 6
      // 1f: arraylength
      // 20: istore 7
      // 22: bipush 0
      // 23: istore 8
      // 25: istore 5
      // 27: iload 8
      // 29: iload 7
      // 2b: if_icmpge 7c
      // 2e: aload 6
      // 30: iload 8
      // 32: aaload
      // 33: astore 9
      // 35: iload 5
      // 37: lload 1
      // 38: lconst_0
      // 39: lcmp
      // 3a: ifle 79
      // 3d: ifeq 77
      // 40: aload 9
      // 42: lload 3
      // 43: invokevirtual com/zelix/n.P (J)Z
      // 46: iload 5
      // 48: ifeq 8e
      // 4b: goto 58
      // 4e: ldc2_w 7533064378281449775
      // 51: lload 1
      // 52: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: ifeq 74
      // 5b: goto 68
      // 5e: ldc2_w 7533064378281449775
      // 61: lload 1
      // 62: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: bipush 1
      // 69: ireturn
      // 6a: ldc2_w 7533064378281449775
      // 6d: lload 1
      // 6e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: iinc 8 1
      // 77: iload 5
      // 79: ifne 27
      // 7c: aload 0
      // 7d: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 80: astore 6
      // 82: aload 6
      // 84: arraylength
      // 85: istore 7
      // 87: lload 1
      // 88: lconst_0
      // 89: lcmp
      // 8a: iflt 90
      // 8d: bipush 0
      // 8e: istore 8
      // 90: iload 8
      // 92: iload 7
      // 94: if_icmpge ed
      // 97: aload 6
      // 99: iload 8
      // 9b: aaload
      // 9c: astore 9
      // 9e: iload 5
      // a0: lload 1
      // a1: lconst_0
      // a2: lcmp
      // a3: iflt ea
      // a6: ifeq e8
      // a9: aload 9
      // ab: ifnull e5
      // ae: goto bb
      // b1: ldc2_w 7533064378281449775
      // b4: lload 1
      // b5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: athrow
      // bb: aload 9
      // bd: lload 3
      // be: invokevirtual com/zelix/n.P (J)Z
      // c1: iload 5
      // c3: ifeq e4
      // c6: goto d3
      // c9: ldc2_w 7533064378281449775
      // cc: lload 1
      // cd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: athrow
      // d3: ifeq e5
      // d6: goto e3
      // d9: ldc2_w 7533064378281449775
      // dc: lload 1
      // dd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: athrow
      // e3: bipush 1
      // e4: ireturn
      // e5: iinc 8 1
      // e8: iload 5
      // ea: ifne 90
      // ed: bipush 0
      // ee: ireturn
   }

   String X(int param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 128691491110241
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w 8870980751223787529
      // 12: lload 2
      // 13: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: istore 6
      // 1a: aload 0
      // 1b: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 1e: iload 1
      // 1f: aaload
      // 20: iload 6
      // 22: ifne 4d
      // 25: lload 4
      // 27: invokevirtual com/zelix/n.Y (J)Z
      // 2a: ifne de
      // 2d: goto 3a
      // 30: ldc2_w 9168145697142296222
      // 33: lload 2
      // 34: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 3e: iload 1
      // 3f: aaload
      // 40: goto 4d
      // 43: ldc2_w 9168145697142296222
      // 46: lload 2
      // 47: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: getstatic com/zelix/n.I Lcom/zelix/n;
      // 50: iload 6
      // 52: lload 2
      // 53: lconst_0
      // 54: lcmp
      // 55: ifle 89
      // 58: ifne 81
      // 5b: if_acmpeq de
      // 5e: goto 6b
      // 61: ldc2_w 9168145697142296222
      // 64: lload 2
      // 65: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 6f: iload 1
      // 70: aaload
      // 71: getstatic com/zelix/n.e Lcom/zelix/n;
      // 74: goto 81
      // 77: ldc2_w 9168145697142296222
      // 7a: lload 2
      // 7b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: lload 2
      // 82: lconst_0
      // 83: lcmp
      // 84: ifle c4
      // 87: iload 6
      // 89: ifne c4
      // 8c: if_acmpeq de
      // 8f: goto 9c
      // 92: ldc2_w 9168145697142296222
      // 95: lload 2
      // 96: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: aload 0
      // 9d: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // a0: iload 1
      // a1: aaload
      // a2: iload 6
      // a4: ifne da
      // a7: goto b4
      // aa: ldc2_w 9168145697142296222
      // ad: lload 2
      // ae: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: getstatic com/zelix/n.Y Lcom/zelix/n;
      // b7: goto c4
      // ba: ldc2_w 9168145697142296222
      // bd: lload 2
      // be: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: athrow
      // c4: if_acmpeq de
      // c7: aload 0
      // c8: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // cb: iload 1
      // cc: aaload
      // cd: goto da
      // d0: ldc2_w 9168145697142296222
      // d3: lload 2
      // d4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d9: athrow
      // da: invokevirtual com/zelix/n.j ()Ljava/lang/String;
      // dd: areturn
      // de: aconst_null
      // df: areturn
   }

   public static void i(boolean var0) {
      O = var0;
   }

   public _kz(n[] var1, short var2, p5 var3, Set var4, char var5, int var6) {
      long var7 = ((long)var2 << 48 | (long)var5 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
      long var9 = var7 ^ 103408337715963L;
      long var11 = var7 ^ 26021352651784L;
      this(n.S(0, var9), var1, var11, var3, var4);
   }

   public static boolean n(Object[] var0) {
      n var1 = (n)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      boolean var4 = x44.a<"u">(-6962501354280422283L, var2);

      n var10000;
      label33: {
         try {
            var10000 = var1;
            if (var4) {
               break label33;
            }

            if (var1 == null) {
               return true;
            }
         } catch (gj var6) {
            throw x44.a<"u">(var6, -7257550825868449054L, var2);
         }

         var10000 = var1;
      }

      try {
         boolean var8 = var10000.T("?");
         if (var4) {
            return var8;
         }

         if (var8) {
            return true;
         }
      } catch (gj var5) {
         throw x44.a<"u">(var5, -7257550825868449054L, var2);
      }

      return false;
   }

   public int X(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 79344388103357L;
      int var10000 = x44.a<"u">(4134842144770205443L, var1);
      int var6 = 0;
      byte var5 = (byte)var10000;
      n[] var7 = this.l;
      int var8 = var7.length;
      int var9 = 0;

      while (true) {
         if (var9 < var8) {
            n var10 = var7[var9];
            var10000 = var6 + var10.Z(var3);
            if (var1 > 0L) {
               if (var5 == 0) {
                  break;
               }

               var6 = var10000;
               var9++;
               var10000 = var5;
            }

            if (var10000 != 0) {
               continue;
            }
         }

         var10000 = var6;
         break;
      }

      return var10000;
   }

   public n[] m() {
      return this.l;
   }

   public static boolean Y() {
      boolean var0 = N();
      return !var0;
   }

   public _ox V(Object[] param1) {
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
      // 04: checkcast com/zelix/_ox
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/_kz.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w -8745067001049289290
      // 1c: lload 3
      // 1d: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 5
      // 24: aload 0
      // 25: getfield com/zelix/_kz.M Ljava/util/Set;
      // 28: iload 5
      // 2a: ifne 59
      // 2d: ifnonnull 55
      // 30: goto 3d
      // 33: ldc2_w -9041959263789665503
      // 36: lload 3
      // 37: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: new java/util/LinkedHashSet
      // 41: dup
      // 42: invokespecial java/util/LinkedHashSet.<init> ()V
      // 45: putfield com/zelix/_kz.M Ljava/util/Set;
      // 48: goto 55
      // 4b: ldc2_w -9041959263789665503
      // 4e: lload 3
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: aload 0
      // 56: getfield com/zelix/_kz.M Ljava/util/Set;
      // 59: aload 2
      // 5a: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 5f: pop
      // 60: aload 2
      // 61: areturn
   }

   private boolean s(Object[] param1) {
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
      // 004: checkcast com/zelix/_kz
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: pop
      // 01b: getstatic com/zelix/_kz.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: ldc2_w -1351764181663452321
      // 024: lload 3
      // 025: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: aload 0
      // 02b: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 02e: astore 7
      // 030: istore 6
      // 032: aload 7
      // 034: arraylength
      // 035: istore 8
      // 037: bipush 0
      // 038: istore 9
      // 03a: iload 9
      // 03c: iload 8
      // 03e: if_icmpge 092
      // 041: aload 7
      // 043: iload 9
      // 045: aaload
      // 046: astore 10
      // 048: iload 6
      // 04a: lload 3
      // 04b: lconst_0
      // 04c: lcmp
      // 04d: ifle 08f
      // 050: ifeq 08d
      // 053: aload 5
      // 055: aload 10
      // 057: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 05c: iload 6
      // 05e: ifeq 0a4
      // 061: goto 06e
      // 064: ldc2_w -1550473156051149858
      // 067: lload 3
      // 068: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: ifeq 08a
      // 071: goto 07e
      // 074: ldc2_w -1550473156051149858
      // 077: lload 3
      // 078: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: bipush 0
      // 07f: ireturn
      // 080: ldc2_w -1550473156051149858
      // 083: lload 3
      // 084: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: athrow
      // 08a: iinc 9 1
      // 08d: iload 6
      // 08f: ifne 03a
      // 092: aload 2
      // 093: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 096: astore 7
      // 098: aload 7
      // 09a: arraylength
      // 09b: istore 8
      // 09d: lload 3
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: iflt 0a6
      // 0a3: bipush 0
      // 0a4: istore 9
      // 0a6: iload 9
      // 0a8: iload 8
      // 0aa: if_icmpge 0fe
      // 0ad: aload 7
      // 0af: iload 9
      // 0b1: aaload
      // 0b2: astore 10
      // 0b4: iload 6
      // 0b6: lload 3
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: iflt 0fb
      // 0bc: ifeq 0f9
      // 0bf: aload 5
      // 0c1: aload 10
      // 0c3: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0c8: iload 6
      // 0ca: ifeq 19b
      // 0cd: goto 0da
      // 0d0: ldc2_w -1550473156051149858
      // 0d3: lload 3
      // 0d4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: ifeq 0f6
      // 0dd: goto 0ea
      // 0e0: ldc2_w -1550473156051149858
      // 0e3: lload 3
      // 0e4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: bipush 0
      // 0eb: ireturn
      // 0ec: ldc2_w -1550473156051149858
      // 0ef: lload 3
      // 0f0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: iinc 9 1
      // 0f9: iload 6
      // 0fb: ifne 0a6
      // 0fe: aload 0
      // 0ff: getfield com/zelix/_kz.M Ljava/util/Set;
      // 102: iload 6
      // 104: ifeq 153
      // 107: ifnonnull 14f
      // 10a: goto 117
      // 10d: ldc2_w -1550473156051149858
      // 110: lload 3
      // 111: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 2
      // 118: getfield com/zelix/_kz.M Ljava/util/Set;
      // 11b: iload 6
      // 11d: lload 3
      // 11e: lconst_0
      // 11f: lcmp
      // 120: ifle 155
      // 123: ifeq 153
      // 126: goto 133
      // 129: ldc2_w -1550473156051149858
      // 12c: lload 3
      // 12d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: ifnonnull 14f
      // 136: goto 143
      // 139: ldc2_w -1550473156051149858
      // 13c: lload 3
      // 13d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: bipush 1
      // 144: ireturn
      // 145: ldc2_w -1550473156051149858
      // 148: lload 3
      // 149: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 0
      // 150: getfield com/zelix/_kz.M Ljava/util/Set;
      // 153: iload 6
      // 155: lload 3
      // 156: lconst_0
      // 157: lcmp
      // 158: ifle 181
      // 15b: ifeq 17f
      // 15e: ifnull 19a
      // 161: goto 16e
      // 164: ldc2_w -1550473156051149858
      // 167: lload 3
      // 168: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aload 2
      // 16f: getfield com/zelix/_kz.M Ljava/util/Set;
      // 172: goto 17f
      // 175: ldc2_w -1550473156051149858
      // 178: lload 3
      // 179: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: iload 6
      // 181: lload 3
      // 182: lconst_0
      // 183: lcmp
      // 184: ifle 1a2
      // 187: ifeq 1a0
      // 18a: ifnonnull 19c
      // 18d: goto 19a
      // 190: ldc2_w -1550473156051149858
      // 193: lload 3
      // 194: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: bipush 0
      // 19b: ireturn
      // 19c: aload 0
      // 19d: getfield com/zelix/_kz.M Ljava/util/Set;
      // 1a0: iload 6
      // 1a2: ifeq 1d3
      // 1a5: invokeinterface java/util/Set.size ()I 1
      // 1aa: aload 2
      // 1ab: getfield com/zelix/_kz.M Ljava/util/Set;
      // 1ae: invokeinterface java/util/Set.size ()I 1
      // 1b3: if_icmpeq 1cf
      // 1b6: goto 1c3
      // 1b9: ldc2_w -1550473156051149858
      // 1bc: lload 3
      // 1bd: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: bipush 0
      // 1c4: ireturn
      // 1c5: ldc2_w -1550473156051149858
      // 1c8: lload 3
      // 1c9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: aload 0
      // 1d0: getfield com/zelix/_kz.M Ljava/util/Set;
      // 1d3: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1d8: astore 7
      // 1da: aload 7
      // 1dc: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1e1: ifeq 23d
      // 1e4: aload 7
      // 1e6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1eb: checkcast com/zelix/_ox
      // 1ee: astore 8
      // 1f0: aload 2
      // 1f1: getfield com/zelix/_kz.M Ljava/util/Set;
      // 1f4: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1f9: astore 9
      // 1fb: aload 9
      // 1fd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 202: ifeq 235
      // 205: aload 9
      // 207: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 20c: checkcast com/zelix/_ox
      // 20f: astore 10
      // 211: aload 8
      // 213: aload 10
      // 215: if_acmpne 230
      // 218: iload 6
      // 21a: ifne 1da
      // 21d: lload 3
      // 21e: lconst_0
      // 21f: lcmp
      // 220: ifle 1f0
      // 223: goto 230
      // 226: ldc2_w -1550473156051149858
      // 229: lload 3
      // 22a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: iload 6
      // 232: ifne 1fb
      // 235: bipush 0
      // 236: lload 3
      // 237: lconst_0
      // 238: lcmp
      // 239: iflt 1e1
      // 23c: ireturn
      // 23d: bipush 1
      // 23e: ireturn
   }

   public boolean g(long param1, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -3906706438990702678
      // 09: lload 1
      // 0a: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 4
      // 11: aload 0
      // 12: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 15: iload 3
      // 16: aaload
      // 17: iload 4
      // 19: ifeq 3f
      // 1c: ifnull 5d
      // 1f: goto 2c
      // 22: ldc2_w -3562740433703731413
      // 25: lload 1
      // 26: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/zelix/_kz.G [Lcom/zelix/n;
      // 30: iload 3
      // 31: aaload
      // 32: goto 3f
      // 35: ldc2_w -3562740433703731413
      // 38: lload 1
      // 39: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: ldc "?"
      // 41: invokevirtual com/zelix/n.T (Ljava/lang/String;)Z
      // 44: iload 4
      // 46: ifeq 5a
      // 49: ifne 5d
      // 4c: goto 59
      // 4f: ldc2_w -3562740433703731413
      // 52: lload 1
      // 53: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   public boolean e(_fm param1, _kz param2, Set param3, boolean param4, String param5, long param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_kz.a J
      // 03: lload 6
      // 05: lxor
      // 06: lstore 6
      // 08: lload 6
      // 0a: dup2
      // 0b: ldc2_w 88032063749399
      // 0e: lxor
      // 0f: lstore 8
      // 11: dup2
      // 12: ldc2_w 54476843444061
      // 15: lxor
      // 16: lstore 10
      // 18: dup2
      // 19: ldc2_w 62830721094975
      // 1c: lxor
      // 1d: lstore 12
      // 1f: pop2
      // 20: ldc2_w 9191606660553938074
      // 23: lload 6
      // 25: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: istore 14
      // 2c: aload 0
      // 2d: aload 1
      // 2e: lload 8
      // 30: aload 2
      // 31: aload 5
      // 33: invokespecial com/zelix/_kz.q (Lcom/zelix/_fm;JLcom/zelix/_kz;Ljava/lang/String;)Z
      // 36: iload 14
      // 38: ifne 64
      // 3b: ifeq e7
      // 3e: goto 4c
      // 41: ldc2_w 8910622135267510797
      // 44: lload 6
      // 46: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 1
      // 4e: aload 2
      // 4f: aload 5
      // 51: lload 10
      // 53: invokespecial com/zelix/_kz.W (Lcom/zelix/_fm;Lcom/zelix/_kz;Ljava/lang/String;J)Z
      // 56: goto 64
      // 59: ldc2_w 8910622135267510797
      // 5c: lload 6
      // 5e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: iload 14
      // 66: lload 6
      // 68: lconst_0
      // 69: lcmp
      // 6a: ifle 85
      // 6d: ifne 83
      // 70: ifeq e7
      // 73: goto 81
      // 76: ldc2_w 8910622135267510797
      // 79: lload 6
      // 7b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: iload 4
      // 83: iload 14
      // 85: ifne e4
      // 88: ifeq e3
      // 8b: goto 99
      // 8e: ldc2_w 8910622135267510797
      // 91: lload 6
      // 93: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: aload 0
      // 9a: aload 2
      // 9b: aload 3
      // 9c: lload 12
      // 9e: bipush 3
      // 9f: anewarray 244
      // a2: dup_x2
      // a3: dup_x2
      // a4: pop
      // a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a8: bipush 2
      // a9: swap
      // aa: aastore
      // ab: dup_x1
      // ac: swap
      // ad: bipush 1
      // ae: swap
      // af: aastore
      // b0: dup_x1
      // b1: swap
      // b2: bipush 0
      // b3: swap
      // b4: aastore
      // b5: ldc2_w 9205624502607715296
      // b8: lload 6
      // ba: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: iload 14
      // c1: ifne e4
      // c4: goto d2
      // c7: ldc2_w 8910622135267510797
      // ca: lload 6
      // cc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1: athrow
      // d2: ifeq e7
      // d5: goto e3
      // d8: ldc2_w 8910622135267510797
      // db: lload 6
      // dd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: athrow
      // e3: bipush 1
      // e4: goto e8
      // e7: bipush 0
      // e8: ireturn
   }

   public _ox x(Object[] param1) {
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
      // 004: checkcast com/zelix/_o0
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/_kz.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 116974486929721
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w -2028719560865645126
      // 025: lload 3
      // 026: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: istore 7
      // 02d: aload 0
      // 02e: getfield com/zelix/_kz.M Ljava/util/Set;
      // 031: iload 7
      // 033: ifeq 057
      // 036: ifnull 19b
      // 039: goto 046
      // 03c: ldc2_w -1972991100030823109
      // 03f: lload 3
      // 040: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: athrow
      // 046: aload 0
      // 047: getfield com/zelix/_kz.M Ljava/util/Set;
      // 04a: goto 057
      // 04d: ldc2_w -1972991100030823109
      // 050: lload 3
      // 051: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: athrow
      // 057: invokeinterface java/util/Set.size ()I 1
      // 05c: iload 7
      // 05e: ifeq 087
      // 061: ifle 19b
      // 064: goto 071
      // 067: ldc2_w -1972991100030823109
      // 06a: lload 3
      // 06b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: aload 0
      // 072: getfield com/zelix/_kz.M Ljava/util/Set;
      // 075: invokeinterface java/util/Set.size ()I 1
      // 07a: goto 087
      // 07d: ldc2_w -1972991100030823109
      // 080: lload 3
      // 081: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: istore 8
      // 089: bipush -1
      // 08a: istore 9
      // 08c: aconst_null
      // 08d: astore 10
      // 08f: aload 0
      // 090: getfield com/zelix/_kz.M Ljava/util/Set;
      // 093: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 098: astore 11
      // 09a: aload 11
      // 09c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a1: ifeq 162
      // 0a4: iinc 9 1
      // 0a7: aload 11
      // 0a9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ae: checkcast com/zelix/_ox
      // 0b1: astore 12
      // 0b3: aload 12
      // 0b5: iload 7
      // 0b7: lload 3
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 0c2
      // 0bd: ifeq 19a
      // 0c0: iload 7
      // 0c2: ifeq 122
      // 0c5: goto 0d2
      // 0c8: ldc2_w -1972991100030823109
      // 0cb: lload 3
      // 0cc: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: lload 5
      // 0d4: bipush 1
      // 0d5: anewarray 244
      // 0d8: dup_x2
      // 0d9: dup_x2
      // 0da: pop
      // 0db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0de: bipush 0
      // 0df: swap
      // 0e0: aastore
      // 0e1: ldc2_w -433650723939297122
      // 0e4: lload 3
      // 0e5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: aload 2
      // 0eb: lload 5
      // 0ed: bipush 1
      // 0ee: anewarray 244
      // 0f1: dup_x2
      // 0f2: dup_x2
      // 0f3: pop
      // 0f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f7: bipush 0
      // 0f8: swap
      // 0f9: aastore
      // 0fa: ldc2_w -433650723939297122
      // 0fd: lload 3
      // 0fe: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: if_acmpne 136
      // 106: goto 113
      // 109: ldc2_w -1972991100030823109
      // 10c: lload 3
      // 10d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 12
      // 115: goto 122
      // 118: ldc2_w -1972991100030823109
      // 11b: lload 3
      // 11c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: astore 10
      // 124: aload 11
      // 126: invokeinterface java/util/Iterator.remove ()V 1
      // 12b: lload 3
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 162
      // 131: iload 7
      // 133: ifne 162
      // 136: iload 9
      // 138: lload 3
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 15f
      // 13e: iload 8
      // 140: bipush 1
      // 141: isub
      // 142: if_icmpne 15d
      // 145: goto 152
      // 148: ldc2_w -1972991100030823109
      // 14b: lload 3
      // 14c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: aload 12
      // 154: astore 10
      // 156: aload 11
      // 158: invokeinterface java/util/Iterator.remove ()V 1
      // 15d: iload 7
      // 15f: ifne 09a
      // 162: aload 0
      // 163: lload 3
      // 164: lconst_0
      // 165: lcmp
      // 166: iflt 0ae
      // 169: iload 7
      // 16b: ifeq 194
      // 16e: getfield com/zelix/_kz.M Ljava/util/Set;
      // 171: invokeinterface java/util/Set.size ()I 1
      // 176: ifne 198
      // 179: goto 186
      // 17c: ldc2_w -1972991100030823109
      // 17f: lload 3
      // 180: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 0
      // 187: goto 194
      // 18a: ldc2_w -1972991100030823109
      // 18d: lload 3
      // 18e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: aconst_null
      // 195: putfield com/zelix/_kz.M Ljava/util/Set;
      // 198: aload 10
      // 19a: areturn
      // 19b: aconst_null
      // 19c: areturn
   }

   public static boolean N() {
      return O;
   }

   public p5 z() {
      return this.B;
   }

   boolean v(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.F.get(var2);
   }

   public _kz(n[] var1, long var2, n[] var4, Set var5) {
      var2 = a ^ var2;
      long var6 = var2 ^ 94549563892648L;
      this(var1, var4, var6, null, var5);
   }

   static {
      long var9 = a ^ 131295999403393L;
      x44.a<"v">(true, -742988337662882277L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "tßðu¨cmY\u0090Z1ù\u0082\tö©G½\u0097M\f¦\u001eô\u0098\u0018^\nË\u009cé\u0092Þ\u001d \u0091çrýÆLª\u009fÝL¦¢ßß \u0087Ñ\u0018zz9H!wÒ\u0096¶\u0083g\u001aþÂM\u0096\u0082àjPÍ.ü±ý\u009aë_\\\u008f\u0088ÜÑ»³Ã\u000e&P×\nïÞ\u0096ëñ¿\u001ft\u009fÙæHBI²Ë \r¦QýÎ.+hðw\u0088\u009f6=ÏdEË8q\u0016\u0005rTi¿-\u00130#î\u009d\u001b½\u0080\u0090!d~\n\u000f\u008b\u0018\u0082ÞV\u001b¿7ÿË[\u0007ª\u008c²E¬÷W30$\u0016åæ\u001f/Ù\u0011ªd\u0003ó_";
      int var6 = "tßðu¨cmY\u0090Z1ù\u0082\tö©G½\u0097M\f¦\u001eô\u0098\u0018^\nË\u009cé\u0092Þ\u001d \u0091çrýÆLª\u009fÝL¦¢ßß \u0087Ñ\u0018zz9H!wÒ\u0096¶\u0083g\u001aþÂM\u0096\u0082àjPÍ.ü±ý\u009aë_\\\u008f\u0088ÜÑ»³Ã\u000e&P×\nïÞ\u0096ëñ¿\u001ft\u009fÙæHBI²Ë \r¦QýÎ.+hðw\u0088\u009f6=ÏdEË8q\u0016\u0005rTi¿-\u00130#î\u009d\u001b½\u0080\u0090!d~\n\u000f\u008b\u0018\u0082ÞV\u001b¿7ÿË[\u0007ª\u008c²E¬÷W30$\u0016åæ\u001f/Ù\u0011ªd\u0003ó_"
         .length();
      char var3 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[5];
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "äñ4³tlôa·r.ícorÈ\u0010Ô\u0097\ra§=Ë}õ\u009bùÔ\b\u0002?Å";
                  var6 = "äñ4³tlôa·r.ícorÈ\u0010Ô\u0097\ra§=Ë}õ\u009bùÔ\b\u0002?Å".length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15553;
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
            throw new RuntimeException("com/zelix/_kz", var10);
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
         throw new RuntimeException("com/zelix/_kz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
