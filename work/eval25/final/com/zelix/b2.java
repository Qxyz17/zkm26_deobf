package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;

public class b2 extends hv implements _zv {
   private int T;
   private static final long a = ess.a(-1041320315480216968L, 872059639652329589L, MethodHandles.lookup().lookupClass()).a(92708035597040L);

   public void i(Object[] var1) {
      int var5 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      HashMap var4 = (HashMap)var1[2];
      HashMap var2 = (HashMap)var1[3];
      long var6 = (Long)var1[4];
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      this.c.O(var4, var3, this, this.x());
   }

   public void j(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 4
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 6
      // 23: pop
      // 24: lload 2
      // 25: dup2
      // 26: ldc2_w 70438289693953
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: ldc2_w -3106497998795710297
      // 30: lload 2
      // 31: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 0
      // 37: lload 7
      // 39: aload 5
      // 3b: bipush 2
      // 3c: anewarray 72
      // 3f: dup_x1
      // 40: swap
      // 41: bipush 1
      // 42: swap
      // 43: aastore
      // 44: dup_x2
      // 45: dup_x2
      // 46: pop
      // 47: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a: bipush 0
      // 4b: swap
      // 4c: aastore
      // 4d: invokespecial com/zelix/hv.O ([Ljava/lang/Object;)V
      // 50: istore 9
      // 52: iload 9
      // 54: ifne 8d
      // 57: aload 0
      // 58: ldc2_w -3795817549990238860
      // 5b: lload 2
      // 5c: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: ifeq 98
      // 64: goto 71
      // 67: ldc2_w -3751331625724481502
      // 6a: lload 2
      // 6b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: aload 5
      // 73: aload 0
      // 74: ldc2_w -3602079650911274567
      // 77: lload 2
      // 78: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 80: goto 8d
      // 83: ldc2_w -3751331625724481502
      // 86: lload 2
      // 87: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: lload 2
      // 8e: lconst_0
      // 8f: lcmp
      // 90: ifle a7
      // 93: iload 9
      // 95: ifeq b4
      // 98: aload 5
      // 9a: aload 0
      // 9b: ldc2_w -4010137101812909442
      // 9e: lload 2
      // 9f: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: invokevirtual java/io/DataOutputStream.write ([B)V
      // a7: goto b4
      // aa: ldc2_w -3751331625724481502
      // ad: lload 2
      // ae: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: return
   }

   public void b(mx var1, short var2, mx var3, int var4, short var5) {
      long var6 = (long)var2 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48;
      long var10001 = var6 ^ 0L;
      int var8 = (int)((var6 ^ 0L) >>> 48);
      int var9 = (int)((var6 ^ 0L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      super.b(var1, (short)var8, var3, var9, (short)var10);
   }

   public void O(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 0
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w -8511028589403193946
      // 20: lload 2
      // 21: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 0
      // 27: lload 5
      // 29: aload 4
      // 2b: bipush 2
      // 2c: anewarray 72
      // 2f: dup_x1
      // 30: swap
      // 31: bipush 1
      // 32: swap
      // 33: aastore
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: invokespecial com/zelix/hv.O ([Ljava/lang/Object;)V
      // 40: istore 7
      // 42: iload 7
      // 44: ifne 7d
      // 47: aload 0
      // 48: ldc2_w -7614518121811986315
      // 4b: lload 2
      // 4c: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: ifeq 88
      // 54: goto 61
      // 57: ldc2_w -7570032196468298461
      // 5a: lload 2
      // 5b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 4
      // 63: aload 0
      // 64: ldc2_w -7853266524445252424
      // 67: lload 2
      // 68: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 70: goto 7d
      // 73: ldc2_w -7570032196468298461
      // 76: lload 2
      // 77: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: athrow
      // 7d: lload 2
      // 7e: lconst_0
      // 7f: lcmp
      // 80: ifle 97
      // 83: iload 7
      // 85: ifeq a4
      // 88: aload 4
      // 8a: aload 0
      // 8b: ldc2_w -7685285436080527489
      // 8e: lload 2
      // 8f: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: invokevirtual java/io/DataOutputStream.write ([B)V
      // 97: goto a4
      // 9a: ldc2_w -7570032196468298461
      // 9d: lload 2
      // 9e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: return
   }

   b2(long param1, h8 param3, int param4, String param5, _xx param6, _y4 param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/b2.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 39719556955141
      // 00b: lxor
      // 00c: lstore 8
      // 00e: dup2
      // 00f: ldc2_w 46820161520970
      // 012: lxor
      // 013: lstore 10
      // 015: pop2
      // 016: aload 0
      // 017: lload 8
      // 019: aload 3
      // 01a: iload 4
      // 01c: aload 5
      // 01e: aload 6
      // 020: aload 7
      // 022: invokespecial com/zelix/hv.<init> (JLcom/zelix/h8;ILjava/lang/String;Lcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 025: ldc2_w -2455052381942452857
      // 028: lload 1
      // 029: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: aload 0
      // 02f: aload 0
      // 030: getfield com/zelix/b2.C I
      // 033: newarray 8
      // 035: ldc2_w -2585018210746847737
      // 038: lload 1
      // 039: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aload 6
      // 040: aload 0
      // 041: ldc2_w -2585018210746847737
      // 044: lload 1
      // 045: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: invokevirtual com/zelix/_xx.read ([B)I
      // 04d: pop
      // 04e: istore 12
      // 050: aload 0
      // 051: ldc2_w -2585018210746847737
      // 054: lload 1
      // 055: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: lload 10
      // 05c: bipush 0
      // 05d: bipush 3
      // 05e: anewarray 72
      // 061: dup_x1
      // 062: swap
      // 063: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 066: bipush 2
      // 067: swap
      // 068: aastore
      // 069: dup_x2
      // 06a: dup_x2
      // 06b: pop
      // 06c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06f: bipush 1
      // 070: swap
      // 071: aastore
      // 072: dup_x1
      // 073: swap
      // 074: bipush 0
      // 075: swap
      // 076: aastore
      // 077: ldc2_w -2827010814237429833
      // 07a: lload 1
      // 07b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: astore 13
      // 082: aconst_null
      // 083: astore 14
      // 085: aload 0
      // 086: aload 13
      // 088: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 08b: ldc2_w -2703323561403994688
      // 08e: lload 1
      // 08f: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: aload 13
      // 096: ifnull 143
      // 099: aload 14
      // 09b: ifnull 0c6
      // 09e: aload 13
      // 0a0: ldc2_w -2874322712267163703
      // 0a3: lload 1
      // 0a4: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: goto 143
      // 0ac: astore 15
      // 0ae: aload 14
      // 0b0: aload 15
      // 0b2: ldc2_w -2837920476008037989
      // 0b5: lload 1
      // 0b6: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: lload 1
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: ifle 0d1
      // 0c1: iload 12
      // 0c3: ifne 143
      // 0c6: aload 13
      // 0c8: ldc2_w -2874322712267163703
      // 0cb: lload 1
      // 0cc: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: goto 143
      // 0d4: ldc2_w -2339164893072595877
      // 0d7: lload 1
      // 0d8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: astore 15
      // 0e0: aload 15
      // 0e2: astore 14
      // 0e4: aload 15
      // 0e6: athrow
      // 0e7: astore 16
      // 0e9: aload 13
      // 0eb: ifnull 140
      // 0ee: aload 14
      // 0f0: ifnull 128
      // 0f3: goto 100
      // 0f6: ldc2_w -2339164893072595877
      // 0f9: lload 1
      // 0fa: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: aload 13
      // 102: ldc2_w -2874322712267163703
      // 105: lload 1
      // 106: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: goto 140
      // 10e: astore 17
      // 110: aload 14
      // 112: lload 1
      // 113: lconst_0
      // 114: lcmp
      // 115: ifle 142
      // 118: aload 17
      // 11a: ldc2_w -2837920476008037989
      // 11d: lload 1
      // 11e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: iload 12
      // 125: ifne 140
      // 128: aload 13
      // 12a: ldc2_w -2874322712267163703
      // 12d: lload 1
      // 12e: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: goto 140
      // 136: ldc2_w -2339164893072595877
      // 139: lload 1
      // 13a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 16
      // 142: athrow
      // 143: return
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
