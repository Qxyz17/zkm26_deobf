package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class bb extends h4 implements _zv {
   private boolean Z;
   private boolean u;
   private byte[] b;
   private ArrayList E;
   static final Object P = new Object();
   private int[] D;
   private static final long a = ess.a(-1006050059496495610L, 1371590002725344422L, MethodHandles.lookup().lookupClass()).a(43277039477887L);

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 10727274753381L;
      var3.H(this.c, this, this.x(), var4);
   }

   public boolean x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -3521085427578225983L, var2);
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 5
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: lstore 6
      // 01b: ldc2_w -4813852749984134795
      // 01e: lload 6
      // 020: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: istore 8
      // 027: aload 0
      // 028: iload 8
      // 02a: ifne 054
      // 02d: getfield com/zelix/bb.c Lcom/zelix/mx;
      // 030: aload 1
      // 031: if_acmpne 053
      // 034: goto 042
      // 037: ldc2_w -5062288956042665949
      // 03a: lload 6
      // 03c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: athrow
      // 042: aload 0
      // 043: aload 3
      // 044: putfield com/zelix/bb.c Lcom/zelix/mx;
      // 047: return
      // 048: ldc2_w -5062288956042665949
      // 04b: lload 6
      // 04d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: aload 0
      // 054: ldc2_w -6354338462813691508
      // 057: lload 6
      // 059: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: iload 8
      // 060: ifne 075
      // 063: ifeq 100
      // 066: goto 074
      // 069: ldc2_w -5062288956042665949
      // 06c: lload 6
      // 06e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: bipush 0
      // 075: istore 9
      // 077: iload 9
      // 079: aload 0
      // 07a: ldc2_w -4745634443544036014
      // 07d: lload 6
      // 07f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: invokevirtual java/util/ArrayList.size ()I
      // 087: if_icmpge 100
      // 08a: aload 0
      // 08b: ldc2_w -4745634443544036014
      // 08e: lload 6
      // 090: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: iload 9
      // 097: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 09a: iload 4
      // 09c: ifle 0dc
      // 09f: iload 8
      // 0a1: ifne 0dc
      // 0a4: aload 1
      // 0a5: if_acmpne 0e6
      // 0a8: goto 0b6
      // 0ab: ldc2_w -5062288956042665949
      // 0ae: lload 6
      // 0b0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: ldc2_w -4745634443544036014
      // 0ba: lload 6
      // 0bc: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: iload 9
      // 0c3: aload 3
      // 0c4: ldc2_w -4974512072360504740
      // 0c7: lload 6
      // 0c9: invokedynamic o (Ljava/lang/Object;ILjava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: goto 0dc
      // 0d1: ldc2_w -5062288956042665949
      // 0d4: lload 6
      // 0d6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: pop
      // 0dd: iload 8
      // 0df: iload 2
      // 0e0: iflt 0eb
      // 0e3: ifeq 100
      // 0e6: iinc 9 1
      // 0e9: iload 8
      // 0eb: ifeq 077
      // 0ee: iload 2
      // 0ef: iflt 08a
      // 0f2: goto 100
      // 0f5: ldc2_w -5062288956042665949
      // 0f8: lload 6
      // 0fa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: return
   }

   public void Q(Object[] param1) {
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
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: istore 4
      // 16: pop
      // 17: getstatic com/zelix/bb.a J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: ldc2_w -2336641159971214378
      // 20: lload 2
      // 21: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 0
      // 27: iload 4
      // 29: ldc2_w -4218872815810510033
      // 2c: lload 2
      // 2d: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: istore 5
      // 34: aload 0
      // 35: iload 5
      // 37: ifne 77
      // 3a: ldc2_w -4218872815810510033
      // 3d: lload 2
      // 3e: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: ifne 81
      // 46: goto 53
      // 49: ldc2_w -2658121761018428800
      // 4c: lload 2
      // 4d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: aload 0
      // 54: aconst_null
      // 55: ldc2_w -4546527989617860183
      // 58: lload 2
      // 59: invokedynamic w (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 0
      // 5f: aconst_null
      // 60: ldc2_w -2555993112002322447
      // 63: lload 2
      // 64: invokedynamic w (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: aload 0
      // 6a: goto 77
      // 6d: ldc2_w -2658121761018428800
      // 70: lload 2
      // 71: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: bipush 0
      // 78: ldc2_w -4435531403101456494
      // 7b: lload 2
      // 7c: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: return
   }

   protected void O(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/io/DataOutputStream
      // 011: astore 2
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 0
      // 018: lxor
      // 019: lstore 5
      // 01b: pop2
      // 01c: ldc2_w -8511028589403193946
      // 01f: lload 3
      // 020: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: aload 0
      // 026: lload 5
      // 028: aload 2
      // 029: bipush 2
      // 02a: anewarray 161
      // 02d: dup_x1
      // 02e: swap
      // 02f: bipush 1
      // 030: swap
      // 031: aastore
      // 032: dup_x2
      // 033: dup_x2
      // 034: pop
      // 035: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 038: bipush 0
      // 039: swap
      // 03a: aastore
      // 03b: invokespecial com/zelix/h4.O ([Ljava/lang/Object;)V
      // 03e: istore 7
      // 040: aload 0
      // 041: ldc2_w -7853195628054686369
      // 044: lload 3
      // 045: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: iload 7
      // 04c: ifne 060
      // 04f: ifeq 113
      // 052: goto 05f
      // 055: ldc2_w -8256186639455054608
      // 058: lload 3
      // 059: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: bipush 0
      // 060: istore 8
      // 062: iload 8
      // 064: aload 0
      // 065: ldc2_w -8433240546675799679
      // 068: lload 3
      // 069: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: invokevirtual java/util/ArrayList.size ()I
      // 071: if_icmpge 102
      // 074: aload 0
      // 075: ldc2_w -8433240546675799679
      // 078: lload 3
      // 079: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: iload 8
      // 080: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 083: astore 9
      // 085: iload 7
      // 087: ifne 12e
      // 08a: aload 9
      // 08c: iload 7
      // 08e: ifne 0ec
      // 091: goto 09e
      // 094: ldc2_w -8256186639455054608
      // 097: lload 3
      // 098: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: athrow
      // 09e: lload 3
      // 09f: lconst_0
      // 0a0: lcmp
      // 0a1: iflt 0df
      // 0a4: ifnonnull 0dd
      // 0a7: goto 0b4
      // 0aa: ldc2_w -8256186639455054608
      // 0ad: lload 3
      // 0ae: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 2
      // 0b5: aload 0
      // 0b6: ldc2_w -7595556856613652519
      // 0b9: lload 3
      // 0ba: invokedynamic h (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: iload 8
      // 0c1: iaload
      // 0c2: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0c5: iload 7
      // 0c7: lload 3
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: ifle 0ff
      // 0cd: ifeq 0fa
      // 0d0: goto 0dd
      // 0d3: ldc2_w -8256186639455054608
      // 0d6: lload 3
      // 0d7: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 9
      // 0df: goto 0ec
      // 0e2: ldc2_w -8256186639455054608
      // 0e5: lload 3
      // 0e6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: checkcast com/zelix/xl
      // 0ef: astore 10
      // 0f1: aload 2
      // 0f2: aload 10
      // 0f4: invokevirtual com/zelix/xl.B ()I
      // 0f7: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0fa: iinc 8 1
      // 0fd: iload 7
      // 0ff: ifeq 062
      // 102: lload 3
      // 103: lconst_0
      // 104: lcmp
      // 105: ifle 12e
      // 108: lload 3
      // 109: lconst_0
      // 10a: lcmp
      // 10b: ifle 121
      // 10e: iload 7
      // 110: ifeq 12e
      // 113: aload 2
      // 114: aload 0
      // 115: ldc2_w -8536708392542784974
      // 118: lload 3
      // 119: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: invokevirtual java/io/DataOutputStream.write ([B)V
      // 121: goto 12e
      // 124: ldc2_w -8256186639455054608
      // 127: lload 3
      // 128: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: return
   }

   public void n(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      x44.a<"k">(x44.a<"o">(this, 8500624343606310542L, var2), var4, null, 8154521324883843456L, var2);
   }

   protected void j(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 2
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 0
      // 028: lxor
      // 029: lstore 7
      // 02b: pop2
      // 02c: ldc2_w -3106497998795710297
      // 02f: lload 3
      // 030: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: aload 0
      // 036: aload 6
      // 038: lload 7
      // 03a: aload 5
      // 03c: aload 2
      // 03d: bipush 4
      // 03e: anewarray 161
      // 041: dup_x1
      // 042: swap
      // 043: bipush 3
      // 044: swap
      // 045: aastore
      // 046: dup_x1
      // 047: swap
      // 048: bipush 2
      // 049: swap
      // 04a: aastore
      // 04b: dup_x2
      // 04c: dup_x2
      // 04d: pop
      // 04e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 051: bipush 1
      // 052: swap
      // 053: aastore
      // 054: dup_x1
      // 055: swap
      // 056: bipush 0
      // 057: swap
      // 058: aastore
      // 059: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 05c: istore 9
      // 05e: aload 0
      // 05f: ldc2_w -3602149355070814114
      // 062: lload 3
      // 063: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: iload 9
      // 06a: ifne 07e
      // 06d: ifeq 18d
      // 070: goto 07d
      // 073: ldc2_w -3427976063663683087
      // 076: lload 3
      // 077: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: bipush 0
      // 07e: istore 10
      // 080: iload 10
      // 082: aload 0
      // 083: ldc2_w -2885016843556514688
      // 086: lload 3
      // 087: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: invokevirtual java/util/ArrayList.size ()I
      // 08f: if_icmpge 17c
      // 092: aload 0
      // 093: ldc2_w -2885016843556514688
      // 096: lload 3
      // 097: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: iload 10
      // 09e: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0a1: astore 11
      // 0a3: iload 9
      // 0a5: ifne 1a9
      // 0a8: aload 11
      // 0aa: iload 9
      // 0ac: ifne 10b
      // 0af: goto 0bc
      // 0b2: ldc2_w -3427976063663683087
      // 0b5: lload 3
      // 0b6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: lload 3
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 0fe
      // 0c2: ifnonnull 0fc
      // 0c5: goto 0d2
      // 0c8: ldc2_w -3427976063663683087
      // 0cb: lload 3
      // 0cc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 6
      // 0d4: aload 0
      // 0d5: ldc2_w -3776715410364241192
      // 0d8: lload 3
      // 0d9: invokedynamic i (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: iload 10
      // 0e0: iaload
      // 0e1: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0e4: iload 9
      // 0e6: lload 3
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: iflt 179
      // 0ec: ifeq 174
      // 0ef: goto 0fc
      // 0f2: ldc2_w -3427976063663683087
      // 0f5: lload 3
      // 0f6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 11
      // 0fe: goto 10b
      // 101: ldc2_w -3427976063663683087
      // 104: lload 3
      // 105: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: checkcast com/zelix/xl
      // 10e: astore 12
      // 110: aload 5
      // 112: aload 12
      // 114: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 119: checkcast com/zelix/xl
      // 11c: astore 13
      // 11e: iload 9
      // 120: lload 3
      // 121: lconst_0
      // 122: lcmp
      // 123: iflt 154
      // 126: ifne 152
      // 129: aload 13
      // 12b: ifnull 15d
      // 12e: goto 13b
      // 131: ldc2_w -3427976063663683087
      // 134: lload 3
      // 135: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: aload 6
      // 13d: aload 13
      // 13f: invokevirtual com/zelix/xl.B ()I
      // 142: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 145: goto 152
      // 148: ldc2_w -3427976063663683087
      // 14b: lload 3
      // 14c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: iload 9
      // 154: lload 3
      // 155: lconst_0
      // 156: lcmp
      // 157: ifle 179
      // 15a: ifeq 174
      // 15d: aload 6
      // 15f: aload 12
      // 161: invokevirtual com/zelix/xl.B ()I
      // 164: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 167: goto 174
      // 16a: ldc2_w -3427976063663683087
      // 16d: lload 3
      // 16e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: athrow
      // 174: iinc 10 1
      // 177: iload 9
      // 179: ifeq 080
      // 17c: lload 3
      // 17d: lconst_0
      // 17e: lcmp
      // 17f: ifle 1a9
      // 182: lload 3
      // 183: lconst_0
      // 184: lcmp
      // 185: iflt 19c
      // 188: iload 9
      // 18a: ifeq 1a9
      // 18d: aload 6
      // 18f: aload 0
      // 190: ldc2_w -3132600013862441165
      // 193: lload 3
      // 194: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: invokevirtual java/io/DataOutputStream.write ([B)V
      // 19c: goto 1a9
      // 19f: ldc2_w -3427976063663683087
      // 1a2: lload 3
      // 1a3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: athrow
      // 1a9: return
   }

   public void e(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = a ^ var3;
      x44.a<"q">(this, var2, -5393198385160109884L, var3);
   }

   bb(int param1, h8 param2, int param3, String param4, char param5, _xx param6, _y4 param7, int param8, ej param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 5
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
      // 019: getstatic com/zelix/bb.a J
      // 01c: lxor
      // 01d: lstore 10
      // 01f: lload 10
      // 021: dup2
      // 022: ldc2_w 140420111579752
      // 025: lxor
      // 026: lstore 12
      // 028: dup2
      // 029: ldc2_w 66501419995537
      // 02c: lxor
      // 02d: lstore 14
      // 02f: dup2
      // 030: ldc2_w 31160487850285
      // 033: lxor
      // 034: dup2
      // 035: bipush 8
      // 037: lushr
      // 038: lstore 16
      // 03a: dup2
      // 03b: bipush 56
      // 03d: lshl
      // 03e: bipush 56
      // 040: lushr
      // 041: l2i
      // 042: istore 18
      // 044: pop2
      // 045: dup2
      // 046: ldc2_w 100291062121749
      // 049: lxor
      // 04a: lstore 19
      // 04c: dup2
      // 04d: ldc2_w 122321728271825
      // 050: lxor
      // 051: lstore 21
      // 053: pop2
      // 054: aload 0
      // 055: aload 2
      // 056: iload 3
      // 057: aload 4
      // 059: lload 12
      // 05b: aload 6
      // 05d: aload 7
      // 05f: invokespecial com/zelix/h4.<init> (Lcom/zelix/h8;ILjava/lang/String;JLcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 062: ldc2_w -7243000494647038145
      // 065: lload 10
      // 067: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: aload 0
      // 06d: aload 0
      // 06e: getfield com/zelix/bb.C I
      // 071: newarray 8
      // 073: ldc2_w -7269103326294433621
      // 076: lload 10
      // 078: invokedynamic v (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: istore 23
      // 07f: aload 6
      // 081: aload 0
      // 082: ldc2_w -7269103326294433621
      // 085: lload 10
      // 087: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: invokevirtual com/zelix/_xx.read ([B)I
      // 08f: pop
      // 090: aload 0
      // 091: iload 23
      // 093: ifne 0c3
      // 096: ldc2_w -7269103326294433621
      // 099: lload 10
      // 09b: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: arraylength
      // 0a1: bipush 2
      // 0a2: irem
      // 0a3: ifne 2c2
      // 0a6: goto 0b4
      // 0a9: ldc2_w -6920537269509257623
      // 0ac: lload 10
      // 0ae: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 2
      // 0b5: goto 0c3
      // 0b8: ldc2_w -6920537269509257623
      // 0bb: lload 10
      // 0bd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0c6: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 0c9: astore 24
      // 0cb: aload 0
      // 0cc: bipush 1
      // 0cd: ldc2_w -9107780565555329082
      // 0d0: lload 10
      // 0d2: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: aload 0
      // 0d8: bipush 1
      // 0d9: ldc2_w -8747969725650013317
      // 0dc: lload 10
      // 0de: invokedynamic v (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: aload 0
      // 0e4: ldc2_w -7269103326294433621
      // 0e7: lload 10
      // 0e9: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: arraylength
      // 0ef: bipush 2
      // 0f0: idiv
      // 0f1: istore 25
      // 0f3: aload 0
      // 0f4: iload 25
      // 0f6: newarray 10
      // 0f8: ldc2_w -8931103482292034240
      // 0fb: lload 10
      // 0fd: invokedynamic v (Ljava/lang/Object;[IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: aload 0
      // 103: new java/util/ArrayList
      // 106: dup
      // 107: iload 25
      // 109: invokespecial java/util/ArrayList.<init> (I)V
      // 10c: ldc2_w -7462907011797099752
      // 10f: lload 10
      // 111: invokedynamic v (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: bipush 0
      // 117: istore 26
      // 119: bipush 0
      // 11a: istore 27
      // 11c: iload 27
      // 11e: iload 25
      // 120: if_icmpge 2c2
      // 123: aload 0
      // 124: ldc2_w -7269103326294433621
      // 127: lload 10
      // 129: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: iload 26
      // 130: iinc 26 1
      // 133: baload
      // 134: aload 0
      // 135: ldc2_w -7269103326294433621
      // 138: lload 10
      // 13a: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: iload 26
      // 141: iinc 26 1
      // 144: baload
      // 145: lload 21
      // 147: dup2_x1
      // 148: pop2
      // 149: bipush 3
      // 14a: anewarray 161
      // 14d: dup_x1
      // 14e: swap
      // 14f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 152: bipush 2
      // 153: swap
      // 154: aastore
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 1
      // 15c: swap
      // 15d: aastore
      // 15e: dup_x1
      // 15f: swap
      // 160: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 163: bipush 0
      // 164: swap
      // 165: aastore
      // 166: ldc2_w -8896799587804216991
      // 169: lload 10
      // 16b: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: istore 28
      // 172: aload 0
      // 173: ldc2_w -8931103482292034240
      // 176: lload 10
      // 178: invokedynamic i (Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: iload 27
      // 17f: iload 28
      // 181: iastore
      // 182: aload 2
      // 183: lload 16
      // 185: iload 28
      // 187: iload 18
      // 189: i2b
      // 18a: invokevirtual com/zelix/h8.N (JIB)Lcom/zelix/xl;
      // 18d: astore 29
      // 18f: iload 23
      // 191: ifne 26f
      // 194: aload 29
      // 196: ifnull 251
      // 199: goto 1a7
      // 19c: ldc2_w -6920537269509257623
      // 19f: lload 10
      // 1a1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: athrow
      // 1a7: iload 8
      // 1a9: iflt 26f
      // 1ac: aload 29
      // 1ae: instanceof com/zelix/mx
      // 1b1: iload 23
      // 1b3: ifne 26e
      // 1b6: goto 1c4
      // 1b9: ldc2_w -6920537269509257623
      // 1bc: lload 10
      // 1be: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: athrow
      // 1c4: iload 1
      // 1c5: iflt 260
      // 1c8: ifeq 251
      // 1cb: goto 1d9
      // 1ce: ldc2_w -6920537269509257623
      // 1d1: lload 10
      // 1d3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: ldc2_w -7462907011797099752
      // 1dd: lload 10
      // 1df: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: aload 29
      // 1e6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1e9: pop
      // 1ea: aload 9
      // 1ec: lload 19
      // 1ee: aload 24
      // 1f0: aload 0
      // 1f1: bipush 0
      // 1f2: anewarray 161
      // 1f5: ldc2_w -8707015641678269026
      // 1f8: lload 10
      // 1fa: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: aload 0
      // 200: aload 29
      // 202: bipush 5
      // 203: anewarray 161
      // 206: dup_x1
      // 207: swap
      // 208: bipush 4
      // 209: swap
      // 20a: aastore
      // 20b: dup_x1
      // 20c: swap
      // 20d: bipush 3
      // 20e: swap
      // 20f: aastore
      // 210: dup_x1
      // 211: swap
      // 212: bipush 2
      // 213: swap
      // 214: aastore
      // 215: dup_x1
      // 216: swap
      // 217: bipush 1
      // 218: swap
      // 219: aastore
      // 21a: dup_x2
      // 21b: dup_x2
      // 21c: pop
      // 21d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 220: bipush 0
      // 221: swap
      // 222: aastore
      // 223: ldc2_w -7276059707062014474
      // 226: lload 10
      // 228: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: aload 7
      // 22f: aload 29
      // 231: checkcast com/zelix/mx
      // 234: aload 0
      // 235: lload 14
      // 237: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 23a: iload 23
      // 23c: iload 1
      // 23d: ifle 2bf
      // 240: ifeq 2ba
      // 243: goto 251
      // 246: ldc2_w -6920537269509257623
      // 249: lload 10
      // 24b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: athrow
      // 251: aload 0
      // 252: ldc2_w -7462907011797099752
      // 255: lload 10
      // 257: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: aconst_null
      // 25d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 260: goto 26e
      // 263: ldc2_w -6920537269509257623
      // 266: lload 10
      // 268: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: athrow
      // 26e: pop
      // 26f: aload 9
      // 271: lload 19
      // 273: aload 24
      // 275: aload 0
      // 276: bipush 0
      // 277: anewarray 161
      // 27a: ldc2_w -8707015641678269026
      // 27d: lload 10
      // 27f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: aload 0
      // 285: ldc2_w -8827460795565600684
      // 288: lload 10
      // 28a: invokedynamic l (JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28f: bipush 5
      // 290: anewarray 161
      // 293: dup_x1
      // 294: swap
      // 295: bipush 4
      // 296: swap
      // 297: aastore
      // 298: dup_x1
      // 299: swap
      // 29a: bipush 3
      // 29b: swap
      // 29c: aastore
      // 29d: dup_x1
      // 29e: swap
      // 29f: bipush 2
      // 2a0: swap
      // 2a1: aastore
      // 2a2: dup_x1
      // 2a3: swap
      // 2a4: bipush 1
      // 2a5: swap
      // 2a6: aastore
      // 2a7: dup_x2
      // 2a8: dup_x2
      // 2a9: pop
      // 2aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ad: bipush 0
      // 2ae: swap
      // 2af: aastore
      // 2b0: ldc2_w -7276059707062014474
      // 2b3: lload 10
      // 2b5: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: iinc 27 1
      // 2bd: iload 23
      // 2bf: ifeq 11c
      // 2c2: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
