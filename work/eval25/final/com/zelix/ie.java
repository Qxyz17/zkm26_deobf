package com.zelix;

import java.io.DataOutputStream;
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

public class ie extends h8 {
   final int j;
   boolean P = true;
   private static final long a = ess.a(8115334782459076633L, 8061680996161739907L, MethodHandles.lookup().lookupClass()).a(193560273323681L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] k;
   private static final Integer[] m;
   private static final Map n;

   public final boolean U(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      boolean var6 = x44.a<"v">(-3452065086941896579L, var4);

      try {
         if (!var6) {
            return (boolean)this.j;
         }

         if (this.j == 0) {
            return (boolean)1;
         }
      } catch (gj var7) {
         throw x44.a<"v">(var7, -3635341945793008227L, var4);
      }

      return (boolean)0;
   }

   final int E(int param1, short param2, char param3) {
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
      // 17: getstatic com/zelix/ie.a J
      // 1a: lxor
      // 1b: lstore 4
      // 1d: ldc2_w 663379882813111664
      // 20: lload 4
      // 22: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: istore 6
      // 29: aload 0
      // 2a: getfield com/zelix/ie.j I
      // 2d: iload 6
      // 2f: ifne 81
      // 32: tableswitch 78 0 8 61 61 61 61 61 61 61 74 76
      // 64: ldc2_w 709535596330412489
      // 67: lload 4
      // 69: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: bipush 1
      // 70: ireturn
      // 71: ldc2_w 709535596330412489
      // 74: lload 4
      // 76: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: bipush 3
      // 7d: ireturn
      // 7e: bipush 3
      // 7f: ireturn
      // 80: bipush 1
      // 81: ireturn
   }

   final boolean I(Object[] var1) {
      return this.P;
   }

   public boolean j(Object[] param1) {
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
      // 0c: getstatic com/zelix/ie.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -4573970519297101585
      // 15: lload 2
      // 16: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/ie.j I
      // 21: iload 4
      // 23: ifeq 71
      // 26: tableswitch 74 0 8 60 60 60 72 72 60 60 60 60
      // 58: ldc2_w -2513403458673099505
      // 5b: lload 2
      // 5c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
      // 64: ldc2_w -2513403458673099505
      // 67: lload 2
      // 68: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: bipush 1
      // 6f: ireturn
      // 70: bipush 0
      // 71: ireturn
   }

   public boolean b(long param1, ie param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -3611923917992559179
      // 03: lload 1
      // 04: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 4
      // 0b: aload 0
      // 0c: getfield com/zelix/ie.j I
      // 0f: iload 4
      // 11: lload 1
      // 12: lconst_0
      // 13: lcmp
      // 14: iflt 1e
      // 17: ifeq 3c
      // 1a: aload 3
      // 1b: getfield com/zelix/ie.j I
      // 1e: if_icmpne 3f
      // 21: goto 2e
      // 24: ldc2_w -3439421353949515691
      // 27: lload 1
      // 28: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 3c
      // 32: ldc2_w -3439421353949515691
      // 35: lload 1
      // 36: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ireturn
   }

   public static ie[] f(
      h9 param0, n[] param1, _8c param2, Set param3, List param4, boolean param5, short param6, Map param7, int param8, int param9, Map param10
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 6
      // 002: i2l
      // 003: bipush 48
      // 005: lshl
      // 006: iload 8
      // 008: i2l
      // 009: bipush 32
      // 00b: lshl
      // 00c: bipush 16
      // 00e: lushr
      // 00f: lor
      // 010: iload 9
      // 012: i2l
      // 013: bipush 48
      // 015: lshl
      // 016: bipush 48
      // 018: lushr
      // 019: lor
      // 01a: getstatic com/zelix/ie.a J
      // 01d: lxor
      // 01e: lstore 11
      // 020: lload 11
      // 022: dup2
      // 023: ldc2_w 52656188567920
      // 026: lxor
      // 027: lstore 13
      // 029: dup2
      // 02a: ldc2_w 28957198977145
      // 02d: lxor
      // 02e: lstore 15
      // 030: dup2
      // 031: ldc2_w 77813118971126
      // 034: lxor
      // 035: lstore 17
      // 037: dup2
      // 038: ldc2_w 57769185271101
      // 03b: lxor
      // 03c: lstore 19
      // 03e: dup2
      // 03f: ldc2_w 72376266726978
      // 042: lxor
      // 043: lstore 21
      // 045: dup2
      // 046: ldc2_w 110200016410231
      // 049: lxor
      // 04a: lstore 23
      // 04c: dup2
      // 04d: ldc2_w 57470550642429
      // 050: lxor
      // 051: dup2
      // 052: bipush 48
      // 054: lushr
      // 055: l2i
      // 056: istore 25
      // 058: dup2
      // 059: bipush 16
      // 05b: lshl
      // 05c: bipush 48
      // 05e: lushr
      // 05f: l2i
      // 060: istore 26
      // 062: dup2
      // 063: bipush 32
      // 065: lshl
      // 066: bipush 32
      // 068: lushr
      // 069: l2i
      // 06a: istore 27
      // 06c: pop2
      // 06d: dup2
      // 06e: ldc2_w 131249296106416
      // 071: lxor
      // 072: dup2
      // 073: bipush 32
      // 075: lushr
      // 076: l2i
      // 077: istore 28
      // 079: dup2
      // 07a: bipush 32
      // 07c: lshl
      // 07d: bipush 48
      // 07f: lushr
      // 080: l2i
      // 081: istore 29
      // 083: dup2
      // 084: bipush 48
      // 086: lshl
      // 087: bipush 48
      // 089: lushr
      // 08a: l2i
      // 08b: istore 30
      // 08d: pop2
      // 08e: pop2
      // 08f: iload 28
      // 091: iload 29
      // 093: i2s
      // 094: iload 30
      // 096: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 099: astore 32
      // 09b: new java/util/ArrayList
      // 09e: dup
      // 09f: aload 1
      // 0a0: arraylength
      // 0a1: invokespecial java/util/ArrayList.<init> (I)V
      // 0a4: astore 33
      // 0a6: ldc2_w -7409586062891964095
      // 0a9: lload 11
      // 0ab: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: bipush 0
      // 0b1: istore 34
      // 0b3: istore 31
      // 0b5: iload 34
      // 0b7: aload 1
      // 0b8: arraylength
      // 0b9: if_icmpge 352
      // 0bc: aload 1
      // 0bd: iload 34
      // 0bf: aaload
      // 0c0: astore 35
      // 0c2: aload 35
      // 0c4: lload 21
      // 0c6: invokevirtual com/zelix/n.Y (J)Z
      // 0c9: iload 31
      // 0cb: iload 6
      // 0cd: iflt 35b
      // 0d0: ifeq 359
      // 0d3: ifeq 0fc
      // 0d6: goto 0e4
      // 0d9: ldc2_w -8885397079971502943
      // 0dc: lload 11
      // 0de: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: iload 31
      // 0e6: iload 9
      // 0e8: ifle 34f
      // 0eb: ifne 34a
      // 0ee: goto 0fc
      // 0f1: ldc2_w -8885397079971502943
      // 0f4: lload 11
      // 0f6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aconst_null
      // 0fd: astore 36
      // 0ff: aload 35
      // 101: getstatic com/zelix/n.Y Lcom/zelix/n;
      // 104: iload 31
      // 106: iload 9
      // 108: ifle 136
      // 10b: ifeq 134
      // 10e: if_acmpne 12f
      // 111: goto 11f
      // 114: ldc2_w -8885397079971502943
      // 117: lload 11
      // 119: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: aload 0
      // 120: lload 13
      // 122: bipush 0
      // 123: aload 7
      // 125: aload 32
      // 127: invokestatic com/zelix/ie.R (Lcom/zelix/h9;JILjava/util/Map;Lcom/zelix/_uo;)Lcom/zelix/ie;
      // 12a: astore 36
      // 12c: goto 342
      // 12f: aload 35
      // 131: getstatic com/zelix/n.b Lcom/zelix/n;
      // 134: iload 31
      // 136: iload 8
      // 138: iflt 164
      // 13b: ifeq 162
      // 13e: if_acmpeq 1d9
      // 141: goto 14f
      // 144: ldc2_w -8885397079971502943
      // 147: lload 11
      // 149: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 35
      // 151: getstatic com/zelix/n.S Lcom/zelix/n;
      // 154: goto 162
      // 157: ldc2_w -8885397079971502943
      // 15a: lload 11
      // 15c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: iload 31
      // 164: iload 6
      // 166: iflt 192
      // 169: ifeq 190
      // 16c: if_acmpeq 1d9
      // 16f: goto 17d
      // 172: ldc2_w -8885397079971502943
      // 175: lload 11
      // 177: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 35
      // 17f: getstatic com/zelix/n.h Lcom/zelix/n;
      // 182: goto 190
      // 185: ldc2_w -8885397079971502943
      // 188: lload 11
      // 18a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: iload 31
      // 192: iload 6
      // 194: iflt 1c0
      // 197: ifeq 1be
      // 19a: if_acmpeq 1d9
      // 19d: goto 1ab
      // 1a0: ldc2_w -8885397079971502943
      // 1a3: lload 11
      // 1a5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: aload 35
      // 1ad: getstatic com/zelix/n.n Lcom/zelix/n;
      // 1b0: goto 1be
      // 1b3: ldc2_w -8885397079971502943
      // 1b6: lload 11
      // 1b8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: iload 31
      // 1c0: iload 8
      // 1c2: iflt 1f0
      // 1c5: ifeq 1ee
      // 1c8: if_acmpne 1e9
      // 1cb: goto 1d9
      // 1ce: ldc2_w -8885397079971502943
      // 1d1: lload 11
      // 1d3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: lload 13
      // 1dc: bipush 1
      // 1dd: aload 7
      // 1df: aload 32
      // 1e1: invokestatic com/zelix/ie.R (Lcom/zelix/h9;JILjava/util/Map;Lcom/zelix/_uo;)Lcom/zelix/ie;
      // 1e4: astore 36
      // 1e6: goto 342
      // 1e9: aload 35
      // 1eb: getstatic com/zelix/n.o Lcom/zelix/n;
      // 1ee: iload 31
      // 1f0: iload 6
      // 1f2: iflt 220
      // 1f5: ifeq 21e
      // 1f8: if_acmpne 219
      // 1fb: goto 209
      // 1fe: ldc2_w -8885397079971502943
      // 201: lload 11
      // 203: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: aload 0
      // 20a: lload 13
      // 20c: bipush 2
      // 20d: aload 7
      // 20f: aload 32
      // 211: invokestatic com/zelix/ie.R (Lcom/zelix/h9;JILjava/util/Map;Lcom/zelix/_uo;)Lcom/zelix/ie;
      // 214: astore 36
      // 216: goto 342
      // 219: aload 35
      // 21b: getstatic com/zelix/n.c Lcom/zelix/n;
      // 21e: iload 31
      // 220: iload 6
      // 222: iflt 250
      // 225: ifeq 24e
      // 228: if_acmpne 249
      // 22b: goto 239
      // 22e: ldc2_w -8885397079971502943
      // 231: lload 11
      // 233: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: athrow
      // 239: aload 0
      // 23a: lload 13
      // 23c: bipush 3
      // 23d: aload 7
      // 23f: aload 32
      // 241: invokestatic com/zelix/ie.R (Lcom/zelix/h9;JILjava/util/Map;Lcom/zelix/_uo;)Lcom/zelix/ie;
      // 244: astore 36
      // 246: goto 342
      // 249: aload 35
      // 24b: getstatic com/zelix/n.D Lcom/zelix/n;
      // 24e: iload 31
      // 250: ifeq 291
      // 253: if_acmpne 274
      // 256: goto 264
      // 259: ldc2_w -8885397079971502943
      // 25c: lload 11
      // 25e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: athrow
      // 264: aload 0
      // 265: lload 13
      // 267: bipush 4
      // 268: aload 7
      // 26a: aload 32
      // 26c: invokestatic com/zelix/ie.R (Lcom/zelix/h9;JILjava/util/Map;Lcom/zelix/_uo;)Lcom/zelix/ie;
      // 26f: astore 36
      // 271: goto 342
      // 274: aload 35
      // 276: iload 9
      // 278: iflt 2a6
      // 27b: iload 31
      // 27d: ifeq 2a6
      // 280: getstatic com/zelix/n.I Lcom/zelix/n;
      // 283: goto 291
      // 286: ldc2_w -8885397079971502943
      // 289: lload 11
      // 28b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: athrow
      // 291: if_acmpne 2a4
      // 294: aload 0
      // 295: lload 13
      // 297: bipush 5
      // 298: aload 7
      // 29a: aload 32
      // 29c: invokestatic com/zelix/ie.R (Lcom/zelix/h9;JILjava/util/Map;Lcom/zelix/_uo;)Lcom/zelix/ie;
      // 29f: astore 36
      // 2a1: goto 342
      // 2a4: aload 35
      // 2a6: invokevirtual com/zelix/n.o ()Z
      // 2a9: iload 31
      // 2ab: ifeq 2ea
      // 2ae: ifeq 2e3
      // 2b1: goto 2bf
      // 2b4: ldc2_w -8885397079971502943
      // 2b7: lload 11
      // 2b9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: athrow
      // 2bf: aload 0
      // 2c0: lload 15
      // 2c2: sipush 2880
      // 2c5: ldc2_w 8827371854837764141
      // 2c8: lload 11
      // 2ca: lxor
      // 2cb: invokedynamic i (IJ)I bsm=com/zelix/ie.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: aload 35
      // 2d2: invokevirtual com/zelix/n.j ()Ljava/lang/String;
      // 2d5: aload 2
      // 2d6: aload 3
      // 2d7: aload 4
      // 2d9: aload 10
      // 2db: invokestatic com/zelix/iv.A (Lcom/zelix/h9;JILjava/lang/String;Lcom/zelix/_8c;Ljava/util/Set;Ljava/util/List;Ljava/util/Map;)Lcom/zelix/ie;
      // 2de: astore 36
      // 2e0: goto 342
      // 2e3: aload 35
      // 2e5: lload 17
      // 2e7: invokevirtual com/zelix/n.P (J)Z
      // 2ea: ifeq 30a
      // 2ed: aload 0
      // 2ee: lload 13
      // 2f0: sipush 22885
      // 2f3: ldc2_w 3895393412803854857
      // 2f6: lload 11
      // 2f8: lxor
      // 2f9: invokedynamic i (IJ)I bsm=com/zelix/ie.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fe: aload 7
      // 300: aload 32
      // 302: invokestatic com/zelix/ie.R (Lcom/zelix/h9;JILjava/util/Map;Lcom/zelix/_uo;)Lcom/zelix/ie;
      // 305: astore 36
      // 307: goto 342
      // 30a: new com/zelix/ih
      // 30d: dup
      // 30e: aload 0
      // 30f: lload 19
      // 311: sipush 21198
      // 314: ldc2_w 41365880313711008
      // 317: lload 11
      // 319: lxor
      // 31a: invokedynamic i (IJ)I bsm=com/zelix/ie.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: aload 35
      // 321: checkcast com/zelix/k
      // 324: lload 23
      // 326: bipush 1
      // 327: anewarray 470
      // 32a: dup_x2
      // 32b: dup_x2
      // 32c: pop
      // 32d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 330: bipush 0
      // 331: swap
      // 332: aastore
      // 333: ldc2_w -6968815651019824662
      // 336: lload 11
      // 338: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_ob; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: invokespecial com/zelix/ih.<init> (Lcom/zelix/h8;JILcom/zelix/_ob;)V
      // 340: astore 36
      // 342: aload 33
      // 344: aload 36
      // 346: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 349: pop
      // 34a: iinc 34 1
      // 34d: iload 31
      // 34f: ifne 0b5
      // 352: iload 6
      // 354: iflt 41a
      // 357: iload 5
      // 359: iload 31
      // 35b: ifeq 423
      // 35e: ifeq 41a
      // 361: goto 36f
      // 364: ldc2_w -8885397079971502943
      // 367: lload 11
      // 369: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36e: athrow
      // 36f: aload 33
      // 371: invokevirtual java/util/ArrayList.listIterator ()Ljava/util/ListIterator;
      // 374: astore 34
      // 376: aload 34
      // 378: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 37d: ifeq 3aa
      // 380: aload 34
      // 382: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 387: pop
      // 388: iload 31
      // 38a: iload 6
      // 38c: iflt 394
      // 38f: ifeq 41a
      // 392: iload 31
      // 394: ifne 376
      // 397: iload 9
      // 399: iflt 388
      // 39c: goto 3aa
      // 39f: ldc2_w -8885397079971502943
      // 3a2: lload 11
      // 3a4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a9: athrow
      // 3aa: aload 34
      // 3ac: invokeinterface java/util/ListIterator.hasPrevious ()Z 1
      // 3b1: ifeq 41a
      // 3b4: aload 34
      // 3b6: invokeinterface java/util/ListIterator.previous ()Ljava/lang/Object; 1
      // 3bb: checkcast com/zelix/ie
      // 3be: astore 35
      // 3c0: aload 35
      // 3c2: iload 25
      // 3c4: i2c
      // 3c5: iload 26
      // 3c7: i2s
      // 3c8: iload 27
      // 3ca: invokevirtual com/zelix/ie.U (CSI)Z
      // 3cd: iload 31
      // 3cf: iload 9
      // 3d1: ifle 3d9
      // 3d4: ifeq 41f
      // 3d7: iload 31
      // 3d9: ifeq 41f
      // 3dc: goto 3ea
      // 3df: ldc2_w -8885397079971502943
      // 3e2: lload 11
      // 3e4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e9: athrow
      // 3ea: ifeq 41a
      // 3ed: goto 3fb
      // 3f0: ldc2_w -8885397079971502943
      // 3f3: lload 11
      // 3f5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fa: athrow
      // 3fb: aload 34
      // 3fd: invokeinterface java/util/ListIterator.remove ()V 1
      // 402: iload 31
      // 404: ifne 3aa
      // 407: iload 8
      // 409: ifle 3c0
      // 40c: goto 41a
      // 40f: ldc2_w -8885397079971502943
      // 412: lload 11
      // 414: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 419: athrow
      // 41a: aload 33
      // 41c: invokevirtual java/util/ArrayList.size ()I
      // 41f: istore 34
      // 421: iload 34
      // 423: anewarray 58
      // 426: astore 35
      // 428: aload 33
      // 42a: aload 35
      // 42c: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 42f: pop
      // 430: aload 35
      // 432: areturn
   }

   protected final void X(Object[] var1) {
      DataOutputStream var2 = (DataOutputStream)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var10001 = var3 ^ 57283059857636L;
      int var5 = (int)((var3 ^ 57283059857636L) >>> 32);
      int var6 = (int)((var3 ^ 57283059857636L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      this.b(var2, var5, (char)var6, var7, null);
   }

   void N(long var1, _8l var3) {
   }

   public final String d(Object[] var1) {
      long var2 = (Long)var1[0];
      return a<"w">(1313, 5792286496193936242L ^ var2);
   }

   protected ie(h8 var1, int var2) {
      super(var1);
      this.j = var2;
   }

   static ie R(h9 param0, long param1, int param3, Map param4, _uo param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ie.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 102576910713679
      // 0b: lxor
      // 0c: lstore 6
      // 0e: pop2
      // 0f: ldc2_w 8041976139279196144
      // 12: lload 1
      // 13: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 5
      // 1a: iload 3
      // 1b: lload 6
      // 1d: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 20: astore 10
      // 22: istore 8
      // 24: aload 4
      // 26: aload 10
      // 28: iload 8
      // 2a: ifeq 53
      // 2d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 32: ifeq 68
      // 35: goto 42
      // 38: ldc2_w 8215041146448351760
      // 3b: lload 1
      // 3c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 4
      // 44: aload 10
      // 46: goto 53
      // 49: ldc2_w 8215041146448351760
      // 4c: lload 1
      // 4d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 58: checkcast com/zelix/ie
      // 5b: astore 9
      // 5d: lload 1
      // 5e: lconst_0
      // 5f: lcmp
      // 60: ifle 73
      // 63: iload 8
      // 65: ifne 7f
      // 68: new com/zelix/ie
      // 6b: dup
      // 6c: aload 0
      // 6d: iload 3
      // 6e: invokespecial com/zelix/ie.<init> (Lcom/zelix/h8;I)V
      // 71: astore 9
      // 73: aload 4
      // 75: aload 10
      // 77: aload 9
      // 79: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7e: pop
      // 7f: aload 9
      // 81: areturn
   }

   static ie N(Object[] param0) {
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
      // 004: checkcast com/zelix/h9
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_xx
      // 00f: astore 1
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_y4
      // 016: astore 3
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast com/zelix/_y4
      // 01d: astore 9
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/io/PrintWriter
      // 025: astore 5
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/util/Map
      // 02d: astore 4
      // 02f: dup
      // 030: bipush 6
      // 032: aaload
      // 033: checkcast java/util/Map
      // 036: astore 2
      // 037: dup
      // 038: bipush 7
      // 03a: aaload
      // 03b: checkcast com/zelix/_uo
      // 03e: astore 10
      // 040: dup
      // 041: bipush 8
      // 043: aaload
      // 044: checkcast java/lang/Long
      // 047: invokevirtual java/lang/Long.longValue ()J
      // 04a: lstore 6
      // 04c: pop
      // 04d: getstatic com/zelix/ie.a J
      // 050: lload 6
      // 052: lxor
      // 053: lstore 6
      // 055: lload 6
      // 057: dup2
      // 058: ldc2_w 132772573252269
      // 05b: lxor
      // 05c: lstore 11
      // 05e: dup2
      // 05f: ldc2_w 131538045007765
      // 062: lxor
      // 063: dup2
      // 064: bipush 48
      // 066: lushr
      // 067: l2i
      // 068: istore 13
      // 06a: dup2
      // 06b: bipush 16
      // 06d: lshl
      // 06e: bipush 48
      // 070: lushr
      // 071: l2i
      // 072: istore 14
      // 074: dup2
      // 075: bipush 32
      // 077: lshl
      // 078: bipush 32
      // 07a: lushr
      // 07b: l2i
      // 07c: istore 15
      // 07e: pop2
      // 07f: dup2
      // 080: ldc2_w 127679631884726
      // 083: lxor
      // 084: lstore 16
      // 086: dup2
      // 087: ldc2_w 11863316562300
      // 08a: lxor
      // 08b: lstore 18
      // 08d: pop2
      // 08e: aload 1
      // 08f: invokevirtual com/zelix/_xx.readUnsignedByte ()I
      // 092: istore 22
      // 094: ldc2_w -4967576699027484853
      // 097: lload 6
      // 099: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: aload 10
      // 0a0: iload 22
      // 0a2: lload 11
      // 0a4: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 0a7: astore 23
      // 0a9: istore 20
      // 0ab: iload 22
      // 0ad: iload 20
      // 0af: ifne 120
      // 0b2: tableswitch 356 0 8 61 61 61 61 61 61 61 190 323
      // 0e4: ldc2_w -4907914313848169486
      // 0e7: lload 6
      // 0e9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: athrow
      // 0ef: aload 4
      // 0f1: lload 6
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: ifle 13a
      // 0f8: aload 23
      // 0fa: iload 20
      // 0fc: ifne 135
      // 0ff: goto 10d
      // 102: ldc2_w -4907914313848169486
      // 105: lload 6
      // 107: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 112: goto 120
      // 115: ldc2_w -4907914313848169486
      // 118: lload 6
      // 11a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: ifeq 14b
      // 123: aload 4
      // 125: aload 23
      // 127: goto 135
      // 12a: ldc2_w -4907914313848169486
      // 12d: lload 6
      // 12f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 13a: checkcast com/zelix/ie
      // 13d: astore 21
      // 13f: iload 20
      // 141: lload 6
      // 143: lconst_0
      // 144: lcmp
      // 145: iflt 166
      // 148: ifeq 29c
      // 14b: new com/zelix/ie
      // 14e: dup
      // 14f: aload 8
      // 151: iload 22
      // 153: invokespecial com/zelix/ie.<init> (Lcom/zelix/h8;I)V
      // 156: astore 21
      // 158: aload 4
      // 15a: aload 23
      // 15c: aload 21
      // 15e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 163: pop
      // 164: iload 20
      // 166: lload 6
      // 168: lconst_0
      // 169: lcmp
      // 16a: iflt 174
      // 16d: ifeq 29c
      // 170: aload 1
      // 171: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 174: istore 24
      // 176: aload 10
      // 178: iload 24
      // 17a: lload 11
      // 17c: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 17f: astore 25
      // 181: aload 2
      // 182: lload 6
      // 184: lconst_0
      // 185: lcmp
      // 186: iflt 1bc
      // 189: aload 25
      // 18b: iload 20
      // 18d: ifne 1b7
      // 190: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 195: ifeq 1c6
      // 198: goto 1a6
      // 19b: ldc2_w -4907914313848169486
      // 19e: lload 6
      // 1a0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: athrow
      // 1a6: aload 2
      // 1a7: aload 25
      // 1a9: goto 1b7
      // 1ac: ldc2_w -4907914313848169486
      // 1af: lload 6
      // 1b1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1bc: checkcast com/zelix/ie
      // 1bf: astore 21
      // 1c1: iload 20
      // 1c3: ifeq 29c
      // 1c6: new com/zelix/iv
      // 1c9: dup
      // 1ca: aload 8
      // 1cc: iload 22
      // 1ce: iload 24
      // 1d0: iload 13
      // 1d2: i2s
      // 1d3: iload 14
      // 1d5: i2c
      // 1d6: aload 1
      // 1d7: aload 9
      // 1d9: iload 15
      // 1db: aload 5
      // 1dd: invokespecial com/zelix/iv.<init> (Lcom/zelix/h8;IISCLcom/zelix/_xx;Lcom/zelix/_y4;ILjava/io/PrintWriter;)V
      // 1e0: astore 21
      // 1e2: aload 2
      // 1e3: aload 25
      // 1e5: aload 21
      // 1e7: checkcast com/zelix/iv
      // 1ea: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1ef: pop
      // 1f0: iload 20
      // 1f2: ifeq 29c
      // 1f5: new com/zelix/ih
      // 1f8: dup
      // 1f9: aload 8
      // 1fb: iload 22
      // 1fd: lload 18
      // 1ff: aload 1
      // 200: aload 3
      // 201: aload 9
      // 203: aload 5
      // 205: invokespecial com/zelix/ih.<init> (Lcom/zelix/h8;IJLcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;Ljava/io/PrintWriter;)V
      // 208: astore 21
      // 20a: lload 6
      // 20c: lconst_0
      // 20d: lcmp
      // 20e: iflt 229
      // 211: iload 20
      // 213: ifeq 29c
      // 216: new com/zelix/ie
      // 219: dup
      // 21a: aload 8
      // 21c: iload 22
      // 21e: invokespecial com/zelix/ie.<init> (Lcom/zelix/h8;I)V
      // 221: astore 21
      // 223: aload 21
      // 225: bipush 0
      // 226: putfield com/zelix/ie.P Z
      // 229: aload 5
      // 22b: new java/lang/StringBuilder
      // 22e: dup
      // 22f: invokespecial java/lang/StringBuilder.<init> ()V
      // 232: sipush 8172
      // 235: ldc2_w 4646116515647178366
      // 238: lload 6
      // 23a: lxor
      // 23b: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 243: aload 21
      // 245: lload 16
      // 247: invokevirtual com/zelix/ie.j (J)Ljava/lang/String;
      // 24a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24d: sipush 23848
      // 250: ldc2_w 2897525253944116413
      // 253: lload 6
      // 255: lxor
      // 256: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25e: sipush 25932
      // 261: ldc2_w 9059427673117703387
      // 264: lload 6
      // 266: lxor
      // 267: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26f: sipush 14293
      // 272: ldc2_w 2588882103259131462
      // 275: lload 6
      // 277: lxor
      // 278: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 280: iload 22
      // 282: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 285: sipush 26604
      // 288: ldc2_w 8358405555283803773
      // 28b: lload 6
      // 28d: lxor
      // 28e: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 296: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 299: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 29c: aload 21
      // 29e: areturn
   }

   protected void b(DataOutputStream param1, int param2, char param3, int param4, Map param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 3
      // 006: i2l
      // 007: bipush 48
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 4
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: lstore 6
      // 01a: lload 6
      // 01c: dup2
      // 01d: ldc2_w 140635337017104
      // 020: lxor
      // 021: lstore 8
      // 023: dup2
      // 024: ldc2_w 122389609845340
      // 027: lxor
      // 028: lstore 10
      // 02a: pop2
      // 02b: ldc2_w 267272957407016945
      // 02e: lload 6
      // 030: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: istore 12
      // 037: aload 0
      // 038: getfield com/zelix/ie.P Z
      // 03b: iload 12
      // 03d: ifne 0b0
      // 040: ifne 0a4
      // 043: goto 051
      // 046: ldc2_w 241366949553234760
      // 049: lload 6
      // 04b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: lload 10
      // 053: bipush 0
      // 054: bipush 1
      // 055: anewarray 11
      // 058: dup
      // 059: bipush 0
      // 05a: new java/lang/StringBuilder
      // 05d: dup
      // 05e: invokespecial java/lang/StringBuilder.<init> ()V
      // 061: sipush 9479
      // 064: ldc2_w 8739142725561500715
      // 067: lload 6
      // 069: lxor
      // 06a: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/ie.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 072: aload 0
      // 073: lload 8
      // 075: bipush 1
      // 076: anewarray 470
      // 079: dup_x2
      // 07a: dup_x2
      // 07b: pop
      // 07c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: ldc2_w 226709446317987203
      // 085: lload 6
      // 087: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 092: aastore
      // 093: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 096: goto 0a4
      // 099: ldc2_w 241366949553234760
      // 09c: lload 6
      // 09e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 1
      // 0a5: aload 0
      // 0a6: getfield com/zelix/ie.j I
      // 0a9: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 0ac: aload 0
      // 0ad: getfield com/zelix/ie.j I
      // 0b0: iload 3
      // 0b1: iflt 0ea
      // 0b4: tableswitch 85 0 8 52 52 52 52 52 52 52 71 71
      // 0e8: iload 12
      // 0ea: ifeq 109
      // 0ed: goto 0fb
      // 0f0: ldc2_w 241366949553234760
      // 0f3: lload 6
      // 0f5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: goto 109
      // 0fe: ldc2_w 241366949553234760
      // 101: lload 6
      // 103: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: return
   }

   static {
      long var11 = a ^ 66196554038239L;
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
      String var17 = "uW\u0099\u0000\u0014~M!¼²b ý\r²\u001e\u0010Ã\u009cf-¨ÍE\u009e\u001e §âß· \u0010\u0010~\u0095÷WtògVvíÆ\u001e\u008b¿\u009f~ \u009dêV\u001f\u0012é/o\u0089ª\u0081\rÕÂÞ°\u008e|ÑA\u008d?¡~/\u009eíz\u0087\u007f\u0000\u001f8Ç£Þ\u009e·ªgÝ7\u0086^ÞVÛ«\u0094î\u0094è«u\u0096\u0002\u000b½µ`S¼: LúY+Õ\u008côm\u009fl\b&`\u0099w\u0002#\u000efg\u0017b-\u008aò";
      int var19 = "uW\u0099\u0000\u0014~M!¼²b ý\r²\u001e\u0010Ã\u009cf-¨ÍE\u009e\u001e §âß· \u0010\u0010~\u0095÷WtògVvíÆ\u001e\u008b¿\u009f~ \u009dêV\u001f\u0012é/o\u0089ª\u0081\rÕÂÞ°\u008e|ÑA\u008d?¡~/\u009eíz\u0087\u007f\u0000\u001f8Ç£Þ\u009e·ªgÝ7\u0086^ÞVÛ«\u0094î\u0094è«u\u0096\u0002\u000b½µ`S¼: LúY+Õ\u008côm\u009fl\b&`\u0099w\u0002#\u000efg\u0017b-\u008aò"
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
                     d = var20;
                     e = new String[7];
                     n = new HashMap(13);
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
                     String var4 = "Ê\u008b\u009a\u0083iOùi¥CÂ~õxË,zn\u0001qàWÊ\u009b";
                     int var5 = "Ê\u008b\u009a\u0083iOùi¥CÂ~õxË,zn\u0001qàWÊ\u009b".length();
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

                     k = var6;
                     m = new Integer[3];
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

                  var17 = "¯\fùeá\u0017u\u0089ÿ\u009fuTp.ï\n6þj´\"Ü\u009bôøk&ó\u0080Î\"ZúH,~\u000f]i%\u009dH¹\u0082ªS7\u0092\u0010È\u0017üë×\u001dMºå\u007f\u0098\u00ad½QÞU";
                  var19 = "¯\fùeá\u0017u\u0089ÿ\u009fuTp.ï\n6þj´\"Ü\u009bôøk&ó\u0080Î\"ZúH,~\u000f]i%\u009dH¹\u0082ªS7\u0092\u0010È\u0017üë×\u001dMºå\u007f\u0098\u00ad½QÞU"
                     .length();
                  var16 = '0';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29513;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ie", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/ie" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20197;
      if (m[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ie", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/ie" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
