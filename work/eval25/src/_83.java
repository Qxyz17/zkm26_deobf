package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class _83 implements va {
   ArrayList G;
   xl[] z;
   ArrayList r;
   hz c;
   ArrayList j;
   ArrayList J;
   ArrayList Q;
   ArrayList y;
   ArrayList U;
   ArrayList u;
   ArrayList e;
   ArrayList L;
   Map b;
   final mg[] M;
   ArrayList R;
   ArrayList a;
   private static final long d = ess.a(-7183086738091852234L, 5359094668323956403L, MethodHandles.lookup().lookupClass()).a(184686321577660L);

   public synchronized int K(Object[] param1) {
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
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 36729085607110
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 56757892887309
      // 01f: lxor
      // 020: lstore 7
      // 022: pop2
      // 023: ldc2_w 2331124787923666360
      // 026: lload 3
      // 027: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: aload 2
      // 02d: invokeinterface java/util/List.size ()I 1
      // 032: istore 10
      // 034: astore 9
      // 036: bipush 0
      // 037: istore 11
      // 039: bipush 0
      // 03a: istore 12
      // 03c: iload 12
      // 03e: iload 10
      // 040: if_icmpge 07e
      // 043: iload 11
      // 045: aload 2
      // 046: iload 12
      // 048: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 04d: checkcast com/zelix/xl
      // 050: lload 7
      // 052: invokevirtual com/zelix/xl.o (J)I
      // 055: iadd
      // 056: lload 3
      // 057: lconst_0
      // 058: lcmp
      // 059: ifle 08a
      // 05c: istore 11
      // 05e: iinc 12 1
      // 061: aload 9
      // 063: ifnonnull 085
      // 066: aload 9
      // 068: ifnull 03c
      // 06b: lload 3
      // 06c: lconst_0
      // 06d: lcmp
      // 06e: ifle 061
      // 071: goto 07e
      // 074: ldc2_w 2469267582850040192
      // 077: lload 3
      // 078: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: aload 0
      // 07f: getfield com/zelix/_83.z [Lcom/zelix/xl;
      // 082: arraylength
      // 083: istore 12
      // 085: iload 12
      // 087: iload 11
      // 089: iadd
      // 08a: anewarray 150
      // 08d: astore 13
      // 08f: aload 0
      // 090: getfield com/zelix/_83.z [Lcom/zelix/xl;
      // 093: bipush 0
      // 094: aload 13
      // 096: bipush 0
      // 097: iload 12
      // 099: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 09c: bipush 0
      // 09d: istore 14
      // 09f: iload 14
      // 0a1: iload 10
      // 0a3: if_icmpge 11d
      // 0a6: aload 2
      // 0a7: iload 14
      // 0a9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ae: checkcast com/zelix/xl
      // 0b1: astore 15
      // 0b3: aload 15
      // 0b5: iload 12
      // 0b7: invokevirtual com/zelix/xl.s (I)V
      // 0ba: aload 13
      // 0bc: iload 12
      // 0be: iinc 12 1
      // 0c1: aload 15
      // 0c3: aastore
      // 0c4: aload 9
      // 0c6: lload 3
      // 0c7: lconst_0
      // 0c8: lcmp
      // 0c9: iflt 11a
      // 0cc: ifnonnull 118
      // 0cf: aload 15
      // 0d1: lload 7
      // 0d3: invokevirtual com/zelix/xl.o (J)I
      // 0d6: aload 9
      // 0d8: ifnonnull 12e
      // 0db: goto 0e8
      // 0de: ldc2_w 2469267582850040192
      // 0e1: lload 3
      // 0e2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: bipush 2
      // 0e9: if_icmpne 115
      // 0ec: goto 0f9
      // 0ef: ldc2_w 2469267582850040192
      // 0f2: lload 3
      // 0f3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 13
      // 0fb: iload 12
      // 0fd: lload 5
      // 0ff: aload 0
      // 100: bipush 1
      // 101: invokestatic com/zelix/mg.N (JLcom/zelix/_83;I)Lcom/zelix/mg;
      // 104: aastore
      // 105: iinc 12 1
      // 108: goto 115
      // 10b: ldc2_w 2469267582850040192
      // 10e: lload 3
      // 10f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: iinc 14 1
      // 118: aload 9
      // 11a: ifnull 09f
      // 11d: aload 0
      // 11e: aload 13
      // 120: putfield com/zelix/_83.z [Lcom/zelix/xl;
      // 123: aload 0
      // 124: getfield com/zelix/_83.z [Lcom/zelix/xl;
      // 127: lload 3
      // 128: lconst_0
      // 129: lcmp
      // 12a: ifle 0ae
      // 12d: arraylength
      // 12e: ireturn
   }

   public final mr U(Object[] var1) {
      iz var2 = (iz)var1[0];
      List var3 = (List)var1[1];
      long var4 = (Long)var1[2];
      var4 = d ^ var4;
      long var6 = var4 ^ 22423103394489L;
      long var8 = var4 ^ 110622781845756L;
      long var10 = var4 ^ 97440002693969L;
      return x44.a<"i">(this, new Object[]{var2.k(var8), var2.w(var6), var2.H(), var3, var2, var10}, 3658546104557067588L, var4);
   }

   x9 d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 138344855172487L;
      return x44.a<"l">(this.c, new Object[]{var4}, 999269986514421489L, var2);
   }

   public abstract void R(Object[] var1);

   public abstract void M(Object[] var1);

   public abstract void w(Object[] var1);

   public final String R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 30003483140125L;
      return x44.a<"j">(this.c, var4, 6905833775439666388L, var2);
   }

   public final String M(long var1) {
      var1 = d ^ var1;
      long var3 = var1 ^ 27934096776612L;
      return this.c.o(var3);
   }

   public final xl N(long var1, int var3, byte var4) {
      long var5 = var1 << 8 | (long)var4 << 56 >>> 56;
      String[] var7 = x44.a<"p">(-5276298643507850457L, var5);

      int var10000;
      label25: {
         try {
            var10000 = var3;
            if (var7 != null) {
               break label25;
            }

            if (var3 <= 0) {
               return null;
            }
         } catch (gj var9) {
            throw x44.a<"p">(var9, -5414564549381548257L, var5);
         }

         var10000 = var3;
      }

      try {
         if (var10000 < this.z.length) {
            return this.z[var3];
         }
      } catch (gj var8) {
         throw x44.a<"p">(var8, -5414564549381548257L, var5);
      }

      return null;
   }

   public final int a(Object[] var1) {
      return this.z.length;
   }

   public final void h(Object[] param1) {
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
      // 04: checkcast com/zelix/_ur
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/_yv
      // 0e: astore 5
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: getstatic com/zelix/_83.d J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 104669690322267
      // 26: lxor
      // 27: lstore 6
      // 29: pop2
      // 2a: ldc2_w -514032175593185988
      // 2d: lload 3
      // 2e: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 0
      // 34: getfield com/zelix/_83.R Ljava/util/ArrayList;
      // 37: invokevirtual java/util/ArrayList.size ()I
      // 3a: istore 9
      // 3c: astore 8
      // 3e: bipush 0
      // 3f: istore 10
      // 41: iload 10
      // 43: iload 9
      // 45: if_icmpge 64
      // 48: aload 0
      // 49: getfield com/zelix/_83.R Ljava/util/ArrayList;
      // 4c: iload 10
      // 4e: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 51: checkcast com/zelix/mr
      // 54: aload 2
      // 55: lload 6
      // 57: aload 5
      // 59: invokevirtual com/zelix/mr.K (Lcom/zelix/_ur;JLcom/zelix/_yv;)V
      // 5c: iinc 10 1
      // 5f: aload 8
      // 61: ifnull 41
      // 64: lload 3
      // 65: lconst_0
      // 66: lcmp
      // 67: iflt 5f
      // 6a: return
   }

   protected mr T(Object[] param1) {
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
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/String
      // 0f: astore 6
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/String
      // 17: astore 2
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/lang/Long
      // 1e: invokevirtual java/lang/Long.longValue ()J
      // 21: lstore 3
      // 22: pop
      // 23: getstatic com/zelix/_83.d J
      // 26: lload 3
      // 27: lxor
      // 28: lstore 3
      // 29: lload 3
      // 2a: dup2
      // 2b: ldc2_w 57723855470899
      // 2e: lxor
      // 2f: lstore 7
      // 31: pop2
      // 32: ldc2_w -6260849965744403203
      // 35: lload 3
      // 36: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: bipush 0
      // 3c: istore 10
      // 3e: astore 9
      // 40: iload 10
      // 42: aload 0
      // 43: getfield com/zelix/_83.R Ljava/util/ArrayList;
      // 46: invokevirtual java/util/ArrayList.size ()I
      // 49: if_icmpge 96
      // 4c: aload 0
      // 4d: getfield com/zelix/_83.R Ljava/util/ArrayList;
      // 50: iload 10
      // 52: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 55: checkcast com/zelix/mr
      // 58: astore 11
      // 5a: aload 9
      // 5c: lload 3
      // 5d: lconst_0
      // 5e: lcmp
      // 5f: iflt 93
      // 62: ifnonnull 91
      // 65: aload 11
      // 67: lload 7
      // 69: aload 5
      // 6b: aload 6
      // 6d: aload 2
      // 6e: invokevirtual com/zelix/mr.T (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
      // 71: ifeq 8e
      // 74: goto 81
      // 77: ldc2_w -6124413577430333243
      // 7a: lload 3
      // 7b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: aload 11
      // 83: areturn
      // 84: ldc2_w -6124413577430333243
      // 87: lload 3
      // 88: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: iinc 10 1
      // 91: aload 9
      // 93: ifnull 40
      // 96: aconst_null
      // 97: areturn
   }

   public void o(Object[] param1) {
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
      // 004: checkcast com/zelix/_y4
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_y4
      // 019: astore 11
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_y4
      // 021: astore 9
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/_y4
      // 029: astore 7
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/_y4
      // 031: astore 6
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/_y4
      // 03a: astore 3
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast com/zelix/_y4
      // 042: astore 10
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast com/zelix/_y4
      // 04b: astore 8
      // 04d: pop
      // 04e: lload 4
      // 050: dup2
      // 051: ldc2_w 10941095917475
      // 054: lxor
      // 055: lstore 12
      // 057: dup2
      // 058: ldc2_w 125113592562618
      // 05b: lxor
      // 05c: lstore 14
      // 05e: dup2
      // 05f: ldc2_w 7894985384618
      // 062: lxor
      // 063: dup2
      // 064: bipush 48
      // 066: lushr
      // 067: l2i
      // 068: istore 16
      // 06a: dup2
      // 06b: bipush 16
      // 06d: lshl
      // 06e: bipush 32
      // 070: lushr
      // 071: l2i
      // 072: istore 17
      // 074: dup2
      // 075: bipush 48
      // 077: lshl
      // 078: bipush 48
      // 07a: lushr
      // 07b: l2i
      // 07c: istore 18
      // 07e: pop2
      // 07f: dup2
      // 080: ldc2_w 66779404811029
      // 083: lxor
      // 084: lstore 19
      // 086: dup2
      // 087: ldc2_w 22934047868846
      // 08a: lxor
      // 08b: lstore 21
      // 08d: dup2
      // 08e: ldc2_w 83794564622911
      // 091: lxor
      // 092: lstore 23
      // 094: dup2
      // 095: ldc2_w 23054413784727
      // 098: lxor
      // 099: lstore 25
      // 09b: dup2
      // 09c: ldc2_w 95133446389122
      // 09f: lxor
      // 0a0: lstore 27
      // 0a2: dup2
      // 0a3: ldc2_w 11254260437213
      // 0a6: lxor
      // 0a7: dup2
      // 0a8: bipush 56
      // 0aa: lushr
      // 0ab: l2i
      // 0ac: istore 29
      // 0ae: dup2
      // 0af: bipush 8
      // 0b1: lshl
      // 0b2: bipush 32
      // 0b4: lushr
      // 0b5: l2i
      // 0b6: istore 30
      // 0b8: dup2
      // 0b9: bipush 40
      // 0bb: lshl
      // 0bc: bipush 40
      // 0be: lushr
      // 0bf: l2i
      // 0c0: istore 31
      // 0c2: pop2
      // 0c3: dup2
      // 0c4: ldc2_w 100371577154872
      // 0c7: lxor
      // 0c8: dup2
      // 0c9: bipush 48
      // 0cb: lushr
      // 0cc: l2i
      // 0cd: istore 32
      // 0cf: dup2
      // 0d0: bipush 16
      // 0d2: lshl
      // 0d3: bipush 32
      // 0d5: lushr
      // 0d6: l2i
      // 0d7: istore 33
      // 0d9: dup2
      // 0da: bipush 48
      // 0dc: lshl
      // 0dd: bipush 48
      // 0df: lushr
      // 0e0: l2i
      // 0e1: istore 34
      // 0e3: pop2
      // 0e4: dup2
      // 0e5: ldc2_w 93694627061698
      // 0e8: lxor
      // 0e9: lstore 35
      // 0eb: dup2
      // 0ec: ldc2_w 3919319156727
      // 0ef: lxor
      // 0f0: lstore 37
      // 0f2: dup2
      // 0f3: ldc2_w 87491159996457
      // 0f6: lxor
      // 0f7: lstore 39
      // 0f9: dup2
      // 0fa: ldc2_w 117412027333607
      // 0fd: lxor
      // 0fe: lstore 41
      // 100: dup2
      // 101: ldc2_w 68885081713222
      // 104: lxor
      // 105: dup2
      // 106: bipush 48
      // 108: lushr
      // 109: l2i
      // 10a: istore 43
      // 10c: dup2
      // 10d: bipush 16
      // 10f: lshl
      // 110: bipush 32
      // 112: lushr
      // 113: l2i
      // 114: istore 44
      // 116: dup2
      // 117: bipush 48
      // 119: lshl
      // 11a: bipush 48
      // 11c: lushr
      // 11d: l2i
      // 11e: istore 45
      // 120: pop2
      // 121: dup2
      // 122: ldc2_w 15466821759691
      // 125: lxor
      // 126: dup2
      // 127: bipush 32
      // 129: lushr
      // 12a: l2i
      // 12b: istore 46
      // 12d: dup2
      // 12e: bipush 32
      // 130: lshl
      // 131: bipush 48
      // 133: lushr
      // 134: l2i
      // 135: istore 47
      // 137: dup2
      // 138: bipush 48
      // 13a: lshl
      // 13b: bipush 48
      // 13d: lushr
      // 13e: l2i
      // 13f: istore 48
      // 141: pop2
      // 142: dup2
      // 143: ldc2_w 101195495242443
      // 146: lxor
      // 147: lstore 49
      // 149: dup2
      // 14a: ldc2_w 119840302095606
      // 14d: lxor
      // 14e: lstore 51
      // 150: dup2
      // 151: ldc2_w 60618131198120
      // 154: lxor
      // 155: dup2
      // 156: bipush 32
      // 158: lushr
      // 159: l2i
      // 15a: istore 53
      // 15c: dup2
      // 15d: bipush 32
      // 15f: lshl
      // 160: bipush 48
      // 162: lushr
      // 163: l2i
      // 164: istore 54
      // 166: dup2
      // 167: bipush 48
      // 169: lshl
      // 16a: bipush 48
      // 16c: lushr
      // 16d: l2i
      // 16e: istore 55
      // 170: pop2
      // 171: dup2
      // 172: ldc2_w 104276326982501
      // 175: lxor
      // 176: lstore 56
      // 178: dup2
      // 179: ldc2_w 9948995837218
      // 17c: lxor
      // 17d: lstore 58
      // 17f: pop2
      // 180: ldc2_w 908010001863764344
      // 183: lload 4
      // 185: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: bipush 0
      // 18b: istore 61
      // 18d: astore 60
      // 18f: iload 61
      // 191: aload 0
      // 192: getfield com/zelix/_83.G Ljava/util/ArrayList;
      // 195: invokevirtual java/util/ArrayList.size ()I
      // 198: if_icmpge 20e
      // 19b: aload 0
      // 19c: getfield com/zelix/_83.G Ljava/util/ArrayList;
      // 19f: iload 61
      // 1a1: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1a4: checkcast com/zelix/mx
      // 1a7: astore 62
      // 1a9: aload 60
      // 1ab: lload 4
      // 1ad: lconst_0
      // 1ae: lcmp
      // 1af: ifle 20b
      // 1b2: ifnonnull 209
      // 1b5: aload 2
      // 1b6: iload 46
      // 1b8: iload 47
      // 1ba: i2s
      // 1bb: iload 48
      // 1bd: i2c
      // 1be: aload 62
      // 1c0: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 1c3: aload 60
      // 1c5: ifnonnull 3af
      // 1c8: goto 1d6
      // 1cb: ldc2_w 1046152488634363200
      // 1ce: lload 4
      // 1d0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: athrow
      // 1d6: ifne 206
      // 1d9: goto 1e7
      // 1dc: ldc2_w 1046152488634363200
      // 1df: lload 4
      // 1e1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: athrow
      // 1e7: aload 0
      // 1e8: ldc2_w 1377029867757407245
      // 1eb: lload 4
      // 1ed: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: aload 62
      // 1f4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1f7: pop
      // 1f8: goto 206
      // 1fb: ldc2_w 1046152488634363200
      // 1fe: lload 4
      // 200: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 205: athrow
      // 206: iinc 61 1
      // 209: aload 60
      // 20b: ifnull 18f
      // 20e: aload 0
      // 20f: aload 3
      // 210: lload 14
      // 212: bipush 2
      // 213: anewarray 185
      // 216: dup_x2
      // 217: dup_x2
      // 218: pop
      // 219: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21c: bipush 1
      // 21d: swap
      // 21e: aastore
      // 21f: dup_x1
      // 220: swap
      // 221: bipush 0
      // 222: swap
      // 223: aastore
      // 224: ldc2_w 1082586997821982375
      // 227: lload 4
      // 229: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: aload 0
      // 22f: lload 39
      // 231: aload 10
      // 233: bipush 2
      // 234: anewarray 185
      // 237: dup_x1
      // 238: swap
      // 239: bipush 1
      // 23a: swap
      // 23b: aastore
      // 23c: dup_x2
      // 23d: dup_x2
      // 23e: pop
      // 23f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 242: bipush 0
      // 243: swap
      // 244: aastore
      // 245: ldc2_w 741043390823506697
      // 248: lload 4
      // 24a: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: aload 2
      // 250: lload 58
      // 252: bipush 1
      // 253: anewarray 185
      // 256: dup_x2
      // 257: dup_x2
      // 258: pop
      // 259: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 25c: bipush 0
      // 25d: swap
      // 25e: aastore
      // 25f: ldc2_w 1482546040406845164
      // 262: lload 4
      // 264: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: aload 2
      // 26a: lload 41
      // 26c: bipush 1
      // 26d: anewarray 185
      // 270: dup_x2
      // 271: dup_x2
      // 272: pop
      // 273: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 276: bipush 0
      // 277: swap
      // 278: aastore
      // 279: ldc2_w 1429165830679832222
      // 27c: lload 4
      // 27e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: isub
      // 284: aload 11
      // 286: lload 58
      // 288: bipush 1
      // 289: anewarray 185
      // 28c: dup_x2
      // 28d: dup_x2
      // 28e: pop
      // 28f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 292: bipush 0
      // 293: swap
      // 294: aastore
      // 295: ldc2_w 1482546040406845164
      // 298: lload 4
      // 29a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: aload 11
      // 2a1: lload 41
      // 2a3: bipush 1
      // 2a4: anewarray 185
      // 2a7: dup_x2
      // 2a8: dup_x2
      // 2a9: pop
      // 2aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ad: bipush 0
      // 2ae: swap
      // 2af: aastore
      // 2b0: ldc2_w 1429165830679832222
      // 2b3: lload 4
      // 2b5: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: isub
      // 2bb: bipush 3
      // 2bc: imul
      // 2bd: iadd
      // 2be: aload 9
      // 2c0: lload 58
      // 2c2: bipush 1
      // 2c3: anewarray 185
      // 2c6: dup_x2
      // 2c7: dup_x2
      // 2c8: pop
      // 2c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2cc: bipush 0
      // 2cd: swap
      // 2ce: aastore
      // 2cf: ldc2_w 1482546040406845164
      // 2d2: lload 4
      // 2d4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: aload 9
      // 2db: lload 41
      // 2dd: bipush 1
      // 2de: anewarray 185
      // 2e1: dup_x2
      // 2e2: dup_x2
      // 2e3: pop
      // 2e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e7: bipush 0
      // 2e8: swap
      // 2e9: aastore
      // 2ea: ldc2_w 1429165830679832222
      // 2ed: lload 4
      // 2ef: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: isub
      // 2f5: bipush 2
      // 2f6: imul
      // 2f7: iadd
      // 2f8: aload 7
      // 2fa: lload 58
      // 2fc: bipush 1
      // 2fd: anewarray 185
      // 300: dup_x2
      // 301: dup_x2
      // 302: pop
      // 303: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 306: bipush 0
      // 307: swap
      // 308: aastore
      // 309: ldc2_w 1482546040406845164
      // 30c: lload 4
      // 30e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 313: iadd
      // 314: aload 7
      // 316: lload 41
      // 318: bipush 1
      // 319: anewarray 185
      // 31c: dup_x2
      // 31d: dup_x2
      // 31e: pop
      // 31f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 322: bipush 0
      // 323: swap
      // 324: aastore
      // 325: ldc2_w 1429165830679832222
      // 328: lload 4
      // 32a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32f: isub
      // 330: aload 6
      // 332: lload 58
      // 334: bipush 1
      // 335: anewarray 185
      // 338: dup_x2
      // 339: dup_x2
      // 33a: pop
      // 33b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33e: bipush 0
      // 33f: swap
      // 340: aastore
      // 341: ldc2_w 1482546040406845164
      // 344: lload 4
      // 346: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: aload 6
      // 34d: lload 41
      // 34f: bipush 1
      // 350: anewarray 185
      // 353: dup_x2
      // 354: dup_x2
      // 355: pop
      // 356: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 359: bipush 0
      // 35a: swap
      // 35b: aastore
      // 35c: ldc2_w 1429165830679832222
      // 35f: lload 4
      // 361: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 366: isub
      // 367: bipush 2
      // 368: imul
      // 369: iadd
      // 36a: aload 8
      // 36c: lload 58
      // 36e: bipush 1
      // 36f: anewarray 185
      // 372: dup_x2
      // 373: dup_x2
      // 374: pop
      // 375: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 378: bipush 0
      // 379: swap
      // 37a: aastore
      // 37b: ldc2_w 1482546040406845164
      // 37e: lload 4
      // 380: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: aload 8
      // 387: lload 41
      // 389: bipush 1
      // 38a: anewarray 185
      // 38d: dup_x2
      // 38e: dup_x2
      // 38f: pop
      // 390: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 393: bipush 0
      // 394: swap
      // 395: aastore
      // 396: ldc2_w 1429165830679832222
      // 399: lload 4
      // 39b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a0: isub
      // 3a1: bipush 4
      // 3a2: imul
      // 3a3: iadd
      // 3a4: istore 61
      // 3a6: lload 4
      // 3a8: lconst_0
      // 3a9: lcmp
      // 3aa: ifle aed
      // 3ad: iload 61
      // 3af: ifle aed
      // 3b2: new java/util/ArrayList
      // 3b5: dup
      // 3b6: aload 0
      // 3b7: getfield com/zelix/_83.z [Lcom/zelix/xl;
      // 3ba: arraylength
      // 3bb: iload 61
      // 3bd: iadd
      // 3be: invokespecial java/util/ArrayList.<init> (I)V
      // 3c1: astore 62
      // 3c3: aload 62
      // 3c5: new com/zelix/wm
      // 3c8: dup
      // 3c9: aload 0
      // 3ca: getfield com/zelix/_83.z [Lcom/zelix/xl;
      // 3cd: iload 53
      // 3cf: swap
      // 3d0: iload 54
      // 3d2: swap
      // 3d3: iload 55
      // 3d5: invokespecial com/zelix/wm.<init> (II[Ljava/lang/Object;I)V
      // 3d8: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 3dd: pop
      // 3de: aload 0
      // 3df: getfield com/zelix/_83.z [Lcom/zelix/xl;
      // 3e2: arraylength
      // 3e3: istore 63
      // 3e5: new com/zelix/tc
      // 3e8: dup
      // 3e9: aload 9
      // 3eb: lload 27
      // 3ed: bipush 1
      // 3ee: anewarray 185
      // 3f1: dup_x2
      // 3f2: dup_x2
      // 3f3: pop
      // 3f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f7: bipush 0
      // 3f8: swap
      // 3f9: aastore
      // 3fa: ldc2_w 743604484323159409
      // 3fd: lload 4
      // 3ff: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 404: iload 16
      // 406: i2c
      // 407: swap
      // 408: iload 17
      // 40a: iload 18
      // 40c: invokespecial com/zelix/tc.<init> (CLjava/util/Enumeration;II)V
      // 40f: astore 64
      // 411: aload 64
      // 413: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 416: aload 64
      // 418: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 41d: astore 65
      // 41f: aload 65
      // 421: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 426: ifeq 503
      // 429: aload 65
      // 42b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 430: checkcast com/zelix/md
      // 433: astore 66
      // 435: aload 9
      // 437: aload 66
      // 439: lload 19
      // 43b: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 43e: astore 67
      // 440: aload 67
      // 442: invokeinterface java/util/List.size ()I 1
      // 447: istore 68
      // 449: aload 60
      // 44b: ifnonnull aed
      // 44e: bipush 1
      // 44f: istore 69
      // 451: iload 69
      // 453: iload 68
      // 455: if_icmpge 4f7
      // 458: aload 67
      // 45a: iload 69
      // 45c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 461: checkcast com/zelix/l6
      // 464: astore 70
      // 466: aload 66
      // 468: invokevirtual com/zelix/md.U ()Lcom/zelix/mx;
      // 46b: iload 63
      // 46d: iinc 63 1
      // 470: invokevirtual com/zelix/mx.P (I)Lcom/zelix/mx;
      // 473: astore 71
      // 475: aload 62
      // 477: aload 71
      // 479: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 47e: pop
      // 47f: aload 0
      // 480: getfield com/zelix/_83.G Ljava/util/ArrayList;
      // 483: aload 71
      // 485: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 488: pop
      // 489: new com/zelix/md
      // 48c: dup
      // 48d: iload 63
      // 48f: iinc 63 1
      // 492: aload 0
      // 493: aload 71
      // 495: aload 66
      // 497: iload 43
      // 499: i2s
      // 49a: aload 2
      // 49b: bipush 1
      // 49c: iload 44
      // 49e: iload 45
      // 4a0: i2c
      // 4a1: invokespecial com/zelix/md.<init> (ILcom/zelix/_83;Lcom/zelix/mx;Lcom/zelix/md;SLcom/zelix/_y4;ZIC)V
      // 4a4: astore 72
      // 4a6: aload 62
      // 4a8: aload 72
      // 4aa: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4af: pop
      // 4b0: aload 0
      // 4b1: getfield com/zelix/_83.L Ljava/util/ArrayList;
      // 4b4: aload 72
      // 4b6: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4b9: pop
      // 4ba: aload 70
      // 4bc: lload 49
      // 4be: aload 66
      // 4c0: aload 72
      // 4c2: bipush 3
      // 4c3: anewarray 185
      // 4c6: dup_x1
      // 4c7: swap
      // 4c8: bipush 2
      // 4c9: swap
      // 4ca: aastore
      // 4cb: dup_x1
      // 4cc: swap
      // 4cd: bipush 1
      // 4ce: swap
      // 4cf: aastore
      // 4d0: dup_x2
      // 4d1: dup_x2
      // 4d2: pop
      // 4d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d6: bipush 0
      // 4d7: swap
      // 4d8: aastore
      // 4d9: ldc2_w 1354658377536524101
      // 4dc: lload 4
      // 4de: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e3: iinc 69 1
      // 4e6: aload 60
      // 4e8: ifnonnull 41f
      // 4eb: aload 60
      // 4ed: lload 4
      // 4ef: lconst_0
      // 4f0: lcmp
      // 4f1: iflt 44b
      // 4f4: ifnull 451
      // 4f7: aload 60
      // 4f9: lload 4
      // 4fb: lconst_0
      // 4fc: lcmp
      // 4fd: ifle 461
      // 500: ifnull 41f
      // 503: new com/zelix/tc
      // 506: dup
      // 507: aload 7
      // 509: lload 27
      // 50b: bipush 1
      // 50c: anewarray 185
      // 50f: dup_x2
      // 510: dup_x2
      // 511: pop
      // 512: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 515: bipush 0
      // 516: swap
      // 517: aastore
      // 518: ldc2_w 743604484323159409
      // 51b: lload 4
      // 51d: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 522: iload 16
      // 524: i2c
      // 525: swap
      // 526: iload 17
      // 528: iload 18
      // 52a: invokespecial com/zelix/tc.<init> (CLjava/util/Enumeration;II)V
      // 52d: astore 65
      // 52f: aload 65
      // 531: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 534: lload 4
      // 536: lconst_0
      // 537: lcmp
      // 538: iflt aed
      // 53b: aload 65
      // 53d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 542: astore 66
      // 544: aload 66
      // 546: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 54b: ifeq 602
      // 54e: aload 66
      // 550: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 555: checkcast com/zelix/mf
      // 558: astore 67
      // 55a: aload 7
      // 55c: aload 67
      // 55e: lload 19
      // 560: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 563: astore 68
      // 565: aload 68
      // 567: invokeinterface java/util/List.size ()I 1
      // 56c: istore 69
      // 56e: aload 60
      // 570: ifnonnull aed
      // 573: bipush 1
      // 574: istore 70
      // 576: iload 70
      // 578: iload 69
      // 57a: if_icmpge 5f6
      // 57d: aload 68
      // 57f: iload 70
      // 581: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 586: checkcast com/zelix/_8f
      // 589: astore 71
      // 58b: new com/zelix/mf
      // 58e: dup
      // 58f: iload 63
      // 591: iinc 63 1
      // 594: aload 0
      // 595: aload 67
      // 597: lload 35
      // 599: invokespecial com/zelix/mf.<init> (ILcom/zelix/_83;Lcom/zelix/mf;J)V
      // 59c: astore 72
      // 59e: aload 62
      // 5a0: aload 72
      // 5a2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5a7: pop
      // 5a8: aload 0
      // 5a9: ldc2_w 1340745236810783352
      // 5ac: lload 4
      // 5ae: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b3: aload 72
      // 5b5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 5b8: pop
      // 5b9: aload 71
      // 5bb: aload 67
      // 5bd: lload 23
      // 5bf: aload 72
      // 5c1: bipush 3
      // 5c2: anewarray 185
      // 5c5: dup_x1
      // 5c6: swap
      // 5c7: bipush 2
      // 5c8: swap
      // 5c9: aastore
      // 5ca: dup_x2
      // 5cb: dup_x2
      // 5cc: pop
      // 5cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5d0: bipush 1
      // 5d1: swap
      // 5d2: aastore
      // 5d3: dup_x1
      // 5d4: swap
      // 5d5: bipush 0
      // 5d6: swap
      // 5d7: aastore
      // 5d8: ldc2_w 742049714739430665
      // 5db: lload 4
      // 5dd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e2: iinc 70 1
      // 5e5: aload 60
      // 5e7: ifnonnull 544
      // 5ea: aload 60
      // 5ec: lload 4
      // 5ee: lconst_0
      // 5ef: lcmp
      // 5f0: iflt 570
      // 5f3: ifnull 576
      // 5f6: aload 60
      // 5f8: lload 4
      // 5fa: lconst_0
      // 5fb: lcmp
      // 5fc: ifle 586
      // 5ff: ifnull 544
      // 602: new com/zelix/tc
      // 605: dup
      // 606: aload 6
      // 608: lload 27
      // 60a: bipush 1
      // 60b: anewarray 185
      // 60e: dup_x2
      // 60f: dup_x2
      // 610: pop
      // 611: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 614: bipush 0
      // 615: swap
      // 616: aastore
      // 617: ldc2_w 743604484323159409
      // 61a: lload 4
      // 61c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 621: iload 16
      // 623: i2c
      // 624: swap
      // 625: iload 17
      // 627: iload 18
      // 629: invokespecial com/zelix/tc.<init> (CLjava/util/Enumeration;II)V
      // 62c: astore 66
      // 62e: aload 66
      // 630: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 633: aload 0
      // 634: getfield com/zelix/_83.M [Lcom/zelix/mg;
      // 637: bipush 0
      // 638: aaload
      // 639: astore 67
      // 63b: lload 4
      // 63d: lconst_0
      // 63e: lcmp
      // 63f: ifle aed
      // 642: aload 66
      // 644: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 649: astore 68
      // 64b: aload 68
      // 64d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 652: ifeq 71b
      // 655: aload 68
      // 657: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 65c: checkcast com/zelix/ms
      // 65f: astore 69
      // 661: aload 6
      // 663: aload 69
      // 665: lload 19
      // 667: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 66a: astore 70
      // 66c: aload 70
      // 66e: invokeinterface java/util/List.size ()I 1
      // 673: istore 71
      // 675: aload 60
      // 677: ifnonnull aed
      // 67a: bipush 1
      // 67b: istore 72
      // 67d: iload 72
      // 67f: iload 71
      // 681: if_icmpge 70f
      // 684: aload 70
      // 686: iload 72
      // 688: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 68d: checkcast com/zelix/ru
      // 690: astore 73
      // 692: new com/zelix/ms
      // 695: dup
      // 696: iload 63
      // 698: iinc 63 1
      // 69b: iload 29
      // 69d: i2b
      // 69e: aload 0
      // 69f: iload 30
      // 6a1: iload 31
      // 6a3: aload 69
      // 6a5: invokespecial com/zelix/ms.<init> (IBLcom/zelix/_83;IILcom/zelix/ms;)V
      // 6a8: astore 74
      // 6aa: aload 62
      // 6ac: aload 74
      // 6ae: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6b3: pop
      // 6b4: aload 62
      // 6b6: aload 67
      // 6b8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 6bd: pop
      // 6be: iinc 63 1
      // 6c1: aload 0
      // 6c2: ldc2_w 1093017851531026043
      // 6c5: lload 4
      // 6c7: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6cc: aload 74
      // 6ce: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 6d1: pop
      // 6d2: aload 73
      // 6d4: aload 69
      // 6d6: lload 21
      // 6d8: aload 74
      // 6da: bipush 3
      // 6db: anewarray 185
      // 6de: dup_x1
      // 6df: swap
      // 6e0: bipush 2
      // 6e1: swap
      // 6e2: aastore
      // 6e3: dup_x2
      // 6e4: dup_x2
      // 6e5: pop
      // 6e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6e9: bipush 1
      // 6ea: swap
      // 6eb: aastore
      // 6ec: dup_x1
      // 6ed: swap
      // 6ee: bipush 0
      // 6ef: swap
      // 6f0: aastore
      // 6f1: ldc2_w 1335118363438597875
      // 6f4: lload 4
      // 6f6: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6fb: iinc 72 1
      // 6fe: aload 60
      // 700: ifnonnull 64b
      // 703: aload 60
      // 705: lload 4
      // 707: lconst_0
      // 708: lcmp
      // 709: ifle 677
      // 70c: ifnull 67d
      // 70f: aload 60
      // 711: lload 4
      // 713: lconst_0
      // 714: lcmp
      // 715: iflt 68d
      // 718: ifnull 64b
      // 71b: new com/zelix/tc
      // 71e: dup
      // 71f: aload 8
      // 721: lload 27
      // 723: bipush 1
      // 724: anewarray 185
      // 727: dup_x2
      // 728: dup_x2
      // 729: pop
      // 72a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 72d: bipush 0
      // 72e: swap
      // 72f: aastore
      // 730: ldc2_w 743604484323159409
      // 733: lload 4
      // 735: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73a: iload 16
      // 73c: i2c
      // 73d: swap
      // 73e: iload 17
      // 740: iload 18
      // 742: invokespecial com/zelix/tc.<init> (CLjava/util/Enumeration;II)V
      // 745: astore 68
      // 747: aload 68
      // 749: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 74c: lload 4
      // 74e: lconst_0
      // 74f: lcmp
      // 750: ifle aed
      // 753: aload 68
      // 755: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 75a: astore 69
      // 75c: aload 69
      // 75e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 763: ifeq 8ba
      // 766: aload 69
      // 768: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 76d: checkcast com/zelix/x4
      // 770: astore 70
      // 772: aload 70
      // 774: bipush 0
      // 775: anewarray 185
      // 778: ldc2_w 1481452070560014818
      // 77b: lload 4
      // 77d: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/bc; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 782: astore 71
      // 784: aload 8
      // 786: aload 70
      // 788: lload 19
      // 78a: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 78d: astore 72
      // 78f: aload 72
      // 791: invokeinterface java/util/List.size ()I 1
      // 796: istore 73
      // 798: aload 60
      // 79a: ifnonnull aed
      // 79d: bipush 1
      // 79e: istore 74
      // 7a0: iload 74
      // 7a2: iload 73
      // 7a4: if_icmpge 8ae
      // 7a7: aload 72
      // 7a9: iload 74
      // 7ab: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 7b0: checkcast com/zelix/wk
      // 7b3: astore 75
      // 7b5: aload 70
      // 7b7: lload 25
      // 7b9: bipush 1
      // 7ba: anewarray 185
      // 7bd: dup_x2
      // 7be: dup_x2
      // 7bf: pop
      // 7c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c3: bipush 0
      // 7c4: swap
      // 7c5: aastore
      // 7c6: ldc2_w 629571378314741096
      // 7c9: lload 4
      // 7cb: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d0: astore 76
      // 7d2: aload 76
      // 7d4: invokevirtual com/zelix/mn.C ()Lcom/zelix/mx;
      // 7d7: iload 63
      // 7d9: iinc 63 1
      // 7dc: invokevirtual com/zelix/mx.P (I)Lcom/zelix/mx;
      // 7df: astore 77
      // 7e1: aload 62
      // 7e3: aload 77
      // 7e5: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 7ea: pop
      // 7eb: aload 0
      // 7ec: getfield com/zelix/_83.G Ljava/util/ArrayList;
      // 7ef: aload 77
      // 7f1: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 7f4: pop
      // 7f5: aload 76
      // 7f7: invokevirtual com/zelix/mn.X ()Lcom/zelix/mx;
      // 7fa: iload 63
      // 7fc: iinc 63 1
      // 7ff: invokevirtual com/zelix/mx.P (I)Lcom/zelix/mx;
      // 802: astore 78
      // 804: aload 62
      // 806: aload 78
      // 808: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 80d: pop
      // 80e: aload 0
      // 80f: getfield com/zelix/_83.G Ljava/util/ArrayList;
      // 812: aload 78
      // 814: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 817: pop
      // 818: new com/zelix/mn
      // 81b: dup
      // 81c: iload 63
      // 81e: iinc 63 1
      // 821: lload 37
      // 823: aload 0
      // 824: aload 77
      // 826: aload 78
      // 828: aload 2
      // 829: invokespecial com/zelix/mn.<init> (IJLcom/zelix/_83;Lcom/zelix/mx;Lcom/zelix/mx;Lcom/zelix/_y4;)V
      // 82c: astore 79
      // 82e: aload 62
      // 830: aload 79
      // 832: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 837: pop
      // 838: aload 0
      // 839: getfield com/zelix/_83.y Ljava/util/ArrayList;
      // 83c: aload 79
      // 83e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 841: pop
      // 842: new com/zelix/x4
      // 845: dup
      // 846: lload 56
      // 848: iload 63
      // 84a: iinc 63 1
      // 84d: aload 79
      // 84f: aload 70
      // 851: invokespecial com/zelix/x4.<init> (JILcom/zelix/mn;Lcom/zelix/x4;)V
      // 854: astore 80
      // 856: aload 62
      // 858: aload 80
      // 85a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 85f: pop
      // 860: aload 0
      // 861: ldc2_w 1394292463778162171
      // 864: lload 4
      // 866: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86b: aload 80
      // 86d: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 870: pop
      // 871: aload 75
      // 873: aload 70
      // 875: aload 80
      // 877: lload 51
      // 879: bipush 3
      // 87a: anewarray 185
      // 87d: dup_x2
      // 87e: dup_x2
      // 87f: pop
      // 880: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 883: bipush 2
      // 884: swap
      // 885: aastore
      // 886: dup_x1
      // 887: swap
      // 888: bipush 1
      // 889: swap
      // 88a: aastore
      // 88b: dup_x1
      // 88c: swap
      // 88d: bipush 0
      // 88e: swap
      // 88f: aastore
      // 890: ldc2_w 983208462775662515
      // 893: lload 4
      // 895: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89a: iinc 74 1
      // 89d: aload 60
      // 89f: ifnonnull 75c
      // 8a2: aload 60
      // 8a4: lload 4
      // 8a6: lconst_0
      // 8a7: lcmp
      // 8a8: iflt 79a
      // 8ab: ifnull 7a0
      // 8ae: aload 60
      // 8b0: lload 4
      // 8b2: lconst_0
      // 8b3: lcmp
      // 8b4: ifle 7b0
      // 8b7: ifnull 75c
      // 8ba: new com/zelix/tc
      // 8bd: dup
      // 8be: aload 11
      // 8c0: lload 27
      // 8c2: bipush 1
      // 8c3: anewarray 185
      // 8c6: dup_x2
      // 8c7: dup_x2
      // 8c8: pop
      // 8c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8cc: bipush 0
      // 8cd: swap
      // 8ce: aastore
      // 8cf: ldc2_w 743604484323159409
      // 8d2: lload 4
      // 8d4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d9: iload 16
      // 8db: i2c
      // 8dc: swap
      // 8dd: iload 17
      // 8df: iload 18
      // 8e1: invokespecial com/zelix/tc.<init> (CLjava/util/Enumeration;II)V
      // 8e4: astore 69
      // 8e6: aload 69
      // 8e8: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 8eb: lload 4
      // 8ed: lconst_0
      // 8ee: lcmp
      // 8ef: ifle aed
      // 8f2: aload 69
      // 8f4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 8f9: astore 70
      // 8fb: aload 70
      // 8fd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 902: ifeq 9f5
      // 905: aload 70
      // 907: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 90c: checkcast com/zelix/mn
      // 90f: astore 71
      // 911: aload 11
      // 913: aload 71
      // 915: lload 19
      // 917: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // 91a: astore 72
      // 91c: aload 72
      // 91e: invokeinterface java/util/List.size ()I 1
      // 923: istore 73
      // 925: aload 60
      // 927: ifnonnull aed
      // 92a: bipush 1
      // 92b: istore 74
      // 92d: iload 74
      // 92f: iload 73
      // 931: if_icmpge 9e9
      // 934: aload 72
      // 936: iload 74
      // 938: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 93d: checkcast com/zelix/_f4
      // 940: astore 75
      // 942: aload 71
      // 944: invokevirtual com/zelix/mn.C ()Lcom/zelix/mx;
      // 947: iload 63
      // 949: iinc 63 1
      // 94c: invokevirtual com/zelix/mx.P (I)Lcom/zelix/mx;
      // 94f: astore 76
      // 951: aload 62
      // 953: aload 76
      // 955: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 95a: pop
      // 95b: aload 0
      // 95c: getfield com/zelix/_83.G Ljava/util/ArrayList;
      // 95f: aload 76
      // 961: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 964: pop
      // 965: aload 71
      // 967: invokevirtual com/zelix/mn.X ()Lcom/zelix/mx;
      // 96a: iload 63
      // 96c: iinc 63 1
      // 96f: invokevirtual com/zelix/mx.P (I)Lcom/zelix/mx;
      // 972: astore 77
      // 974: aload 62
      // 976: aload 77
      // 978: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 97d: pop
      // 97e: aload 0
      // 97f: getfield com/zelix/_83.G Ljava/util/ArrayList;
      // 982: aload 77
      // 984: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 987: pop
      // 988: new com/zelix/mn
      // 98b: dup
      // 98c: iload 63
      // 98e: iinc 63 1
      // 991: lload 37
      // 993: aload 0
      // 994: aload 76
      // 996: aload 77
      // 998: aload 2
      // 999: invokespecial com/zelix/mn.<init> (IJLcom/zelix/_83;Lcom/zelix/mx;Lcom/zelix/mx;Lcom/zelix/_y4;)V
      // 99c: astore 78
      // 99e: aload 62
      // 9a0: aload 78
      // 9a2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 9a7: pop
      // 9a8: aload 0
      // 9a9: getfield com/zelix/_83.y Ljava/util/ArrayList;
      // 9ac: aload 78
      // 9ae: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 9b1: pop
      // 9b2: aload 75
      // 9b4: aload 78
      // 9b6: lload 12
      // 9b8: bipush 2
      // 9b9: anewarray 185
      // 9bc: dup_x2
      // 9bd: dup_x2
      // 9be: pop
      // 9bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9c2: bipush 1
      // 9c3: swap
      // 9c4: aastore
      // 9c5: dup_x1
      // 9c6: swap
      // 9c7: bipush 0
      // 9c8: swap
      // 9c9: aastore
      // 9ca: ldc2_w 624279330921680288
      // 9cd: lload 4
      // 9cf: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d4: pop
      // 9d5: iinc 74 1
      // 9d8: aload 60
      // 9da: ifnonnull 8fb
      // 9dd: aload 60
      // 9df: lload 4
      // 9e1: lconst_0
      // 9e2: lcmp
      // 9e3: ifle 927
      // 9e6: ifnull 92d
      // 9e9: aload 60
      // 9eb: lload 4
      // 9ed: lconst_0
      // 9ee: lcmp
      // 9ef: iflt 93d
      // 9f2: ifnull 8fb
      // 9f5: new com/zelix/tc
      // 9f8: dup
      // 9f9: aload 2
      // 9fa: lload 27
      // 9fc: bipush 1
      // 9fd: anewarray 185
      // a00: dup_x2
      // a01: dup_x2
      // a02: pop
      // a03: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a06: bipush 0
      // a07: swap
      // a08: aastore
      // a09: ldc2_w 743604484323159409
      // a0c: lload 4
      // a0e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a13: iload 16
      // a15: i2c
      // a16: swap
      // a17: iload 17
      // a19: iload 18
      // a1b: invokespecial com/zelix/tc.<init> (CLjava/util/Enumeration;II)V
      // a1e: astore 70
      // a20: aload 70
      // a22: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // a25: lload 4
      // a27: lconst_0
      // a28: lcmp
      // a29: ifle aed
      // a2c: aload 70
      // a2e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // a33: astore 71
      // a35: aload 71
      // a37: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a3c: ifeq ace
      // a3f: aload 71
      // a41: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // a46: checkcast com/zelix/mx
      // a49: astore 72
      // a4b: aload 2
      // a4c: aload 72
      // a4e: lload 19
      // a50: invokevirtual com/zelix/_y4.M (Ljava/lang/Object;J)Ljava/util/List;
      // a53: astore 73
      // a55: aload 73
      // a57: invokeinterface java/util/List.size ()I 1
      // a5c: istore 74
      // a5e: aload 60
      // a60: ifnonnull aed
      // a63: bipush 1
      // a64: istore 75
      // a66: iload 75
      // a68: iload 74
      // a6a: if_icmpge ac2
      // a6d: aload 73
      // a6f: iload 75
      // a71: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // a76: checkcast com/zelix/_zv
      // a79: astore 76
      // a7b: aload 72
      // a7d: iload 63
      // a7f: iinc 63 1
      // a82: invokevirtual com/zelix/mx.P (I)Lcom/zelix/mx;
      // a85: astore 77
      // a87: aload 62
      // a89: aload 77
      // a8b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a90: pop
      // a91: aload 0
      // a92: getfield com/zelix/_83.G Ljava/util/ArrayList;
      // a95: aload 77
      // a97: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // a9a: pop
      // a9b: aload 76
      // a9d: aload 72
      // a9f: iload 32
      // aa1: i2s
      // aa2: aload 77
      // aa4: iload 33
      // aa6: iload 34
      // aa8: i2s
      // aa9: invokeinterface com/zelix/_zv.b (Lcom/zelix/mx;SLcom/zelix/mx;IS)V 6
      // aae: iinc 75 1
      // ab1: aload 60
      // ab3: ifnonnull a35
      // ab6: aload 60
      // ab8: lload 4
      // aba: lconst_0
      // abb: lcmp
      // abc: ifle a60
      // abf: ifnull a66
      // ac2: aload 60
      // ac4: lload 4
      // ac6: lconst_0
      // ac7: lcmp
      // ac8: ifle a76
      // acb: ifnull a35
      // ace: aload 0
      // acf: lload 4
      // ad1: lconst_0
      // ad2: lcmp
      // ad3: iflt a46
      // ad6: aload 62
      // ad8: aload 62
      // ada: invokeinterface java/util/List.size ()I 1
      // adf: anewarray 150
      // ae2: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // ae7: checkcast [Lcom/zelix/xl;
      // aea: putfield com/zelix/_83.z [Lcom/zelix/xl;
      // aed: return
   }

   public String X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 61596447729712L;
      return this.c.k(var4);
   }

   protected mz k(Object[] param1) {
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
      // 0b: checkcast java/lang/String
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/String
      // 15: astore 6
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 4
      // 22: pop
      // 23: getstatic com/zelix/_83.d J
      // 26: lload 4
      // 28: lxor
      // 29: lstore 4
      // 2b: lload 4
      // 2d: dup2
      // 2e: ldc2_w 115498987432068
      // 31: lxor
      // 32: lstore 7
      // 34: pop2
      // 35: ldc2_w 48311806253425994
      // 38: lload 4
      // 3a: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: aload 0
      // 40: ldc2_w 2274195522918292483
      // 43: lload 4
      // 45: invokedynamic i (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 4d: astore 10
      // 4f: astore 9
      // 51: aload 10
      // 53: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 58: ifeq 9e
      // 5b: aload 10
      // 5d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 62: checkcast com/zelix/mz
      // 65: astore 11
      // 67: aload 11
      // 69: aload 9
      // 6b: ifnonnull 98
      // 6e: lload 7
      // 70: aload 2
      // 71: aload 3
      // 72: aload 6
      // 74: invokevirtual com/zelix/mz.T (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
      // 77: ifeq 99
      // 7a: goto 88
      // 7d: ldc2_w 195602262110183794
      // 80: lload 4
      // 82: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: aload 11
      // 8a: goto 98
      // 8d: ldc2_w 195602262110183794
      // 90: lload 4
      // 92: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: areturn
      // 99: aload 9
      // 9b: ifnull 51
      // 9e: aconst_null
      // 9f: areturn
   }

   public String i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 67076865752204L;
      return x44.a<"h">(this.c, new Object[]{var4}, -5277906513362657293L, var2);
   }

   public final m8 h(Object[] var1) {
      iu var3 = (iu)var1[0];
      List var2 = (List)var1[1];
      long var4 = (Long)var1[2];
      var4 = d ^ var4;
      long var6 = var4 ^ 113892105281780L;
      long var8 = var4 ^ 106725338610942L;
      long var10 = var4 ^ 1981682879367L;
      return x44.a<"o">(this, new Object[]{var3.k(var6), var3.t(var8), var3.H(), var2, var10, var3}, -569426970987902683L, var4);
   }

   public _83(hz var1, long var2) {
      var2 = d ^ var2;
      super();
      this.M = new mg[2];
      x44.a<"s">(this, new ArrayList(), -4221180813078930822L, var2);
      x44.a<"s">(this, new ArrayList(), -2784272654027323380L, var2);
      x44.a<"s">(this, new ArrayList(), -4238187759762361460L, var2);
      x44.a<"s">(this, new ArrayList(), -2690211066022961859L, var2);
      this.c = var1;
   }

   private void Y(Object[] param1) {
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
      // 004: checkcast com/zelix/_y4
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/_83.d J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 119176445534283
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 347722365462
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 82443618779488
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
      // 04a: ldc2_w 22983366478290
      // 04d: lxor
      // 04e: lstore 12
      // 050: dup2
      // 051: ldc2_w 73123905988843
      // 054: lxor
      // 055: lstore 14
      // 057: dup2
      // 058: ldc2_w 42164838212039
      // 05b: lxor
      // 05c: dup2
      // 05d: bipush 32
      // 05f: lushr
      // 060: l2i
      // 061: istore 16
      // 063: dup2
      // 064: bipush 32
      // 066: lshl
      // 067: bipush 48
      // 069: lushr
      // 06a: l2i
      // 06b: istore 17
      // 06d: dup2
      // 06e: bipush 48
      // 070: lshl
      // 071: bipush 48
      // 073: lushr
      // 074: l2i
      // 075: istore 18
      // 077: pop2
      // 078: dup2
      // 079: ldc2_w 111618297634498
      // 07c: lxor
      // 07d: lstore 19
      // 07f: dup2
      // 080: ldc2_w 45389135514883
      // 083: lxor
      // 084: lstore 21
      // 086: dup2
      // 087: ldc2_w 64961321122373
      // 08a: lxor
      // 08b: dup2
      // 08c: bipush 32
      // 08e: lushr
      // 08f: l2i
      // 090: istore 23
      // 092: dup2
      // 093: bipush 32
      // 095: lshl
      // 096: bipush 56
      // 098: lushr
      // 099: l2i
      // 09a: istore 24
      // 09c: dup2
      // 09d: bipush 40
      // 09f: lshl
      // 0a0: bipush 40
      // 0a2: lushr
      // 0a3: l2i
      // 0a4: istore 25
      // 0a6: pop2
      // 0a7: dup2
      // 0a8: ldc2_w 56258083501885
      // 0ab: lxor
      // 0ac: lstore 26
      // 0ae: pop2
      // 0af: ldc2_w -6947420345120195980
      // 0b2: lload 3
      // 0b3: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: aload 0
      // 0b9: getfield com/zelix/_83.a Ljava/util/ArrayList;
      // 0bc: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0bf: astore 30
      // 0c1: astore 29
      // 0c3: aload 30
      // 0c5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ca: ifeq 11d
      // 0cd: aload 30
      // 0cf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d4: checkcast com/zelix/x7
      // 0d7: astore 31
      // 0d9: aload 2
      // 0da: aload 31
      // 0dc: aload 29
      // 0de: ifnonnull 109
      // 0e1: astore 28
      // 0e3: lload 3
      // 0e4: lconst_0
      // 0e5: lcmp
      // 0e6: iflt 0fa
      // 0e9: iload 16
      // 0eb: iload 17
      // 0ed: i2s
      // 0ee: iload 18
      // 0f0: i2c
      // 0f1: aload 28
      // 0f3: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 0f6: ifne 118
      // 0f9: aload 2
      // 0fa: aload 31
      // 0fc: goto 109
      // 0ff: ldc2_w -7095273409479721396
      // 102: lload 3
      // 103: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: new java/util/ArrayList
      // 10c: dup
      // 10d: bipush 0
      // 10e: invokespecial java/util/ArrayList.<init> (I)V
      // 111: lload 5
      // 113: dup2_x2
      // 114: pop2
      // 115: invokevirtual com/zelix/_y4.v (JLjava/lang/Object;Ljava/util/Collection;)V
      // 118: aload 29
      // 11a: ifnull 0c3
      // 11d: lload 19
      // 11f: bipush 1
      // 120: anewarray 185
      // 123: dup_x2
      // 124: dup_x2
      // 125: pop
      // 126: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: ldc2_w -7005709561504000246
      // 12f: lload 3
      // 130: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: lload 3
      // 136: lconst_0
      // 137: lcmp
      // 138: iflt 0d4
      // 13b: astore 30
      // 13d: new com/zelix/_8z
      // 140: dup
      // 141: aload 2
      // 142: lload 14
      // 144: bipush 1
      // 145: anewarray 185
      // 148: dup_x2
      // 149: dup_x2
      // 14a: pop
      // 14b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14e: bipush 0
      // 14f: swap
      // 150: aastore
      // 151: ldc2_w -9162218813472459374
      // 154: lload 3
      // 155: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: lload 7
      // 15c: invokespecial com/zelix/_8z.<init> (IJ)V
      // 15f: astore 31
      // 161: aload 2
      // 162: iload 9
      // 164: iload 10
      // 166: i2s
      // 167: iload 11
      // 169: i2s
      // 16a: invokevirtual com/zelix/_y4.U (ISS)Ljava/util/Set;
      // 16d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 172: astore 32
      // 174: aload 32
      // 176: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17b: ifeq 208
      // 17e: aload 32
      // 180: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 185: checkcast java/util/Map$Entry
      // 188: astore 33
      // 18a: aload 33
      // 18c: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 191: checkcast com/zelix/x7
      // 194: lload 12
      // 196: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 199: astore 34
      // 19b: aload 31
      // 19d: aload 34
      // 19f: aload 29
      // 1a1: lload 3
      // 1a2: lconst_0
      // 1a3: lcmp
      // 1a4: ifle 1f1
      // 1a7: ifnonnull 1ea
      // 1aa: invokevirtual com/zelix/_8z.g (Ljava/lang/Object;)Z
      // 1ad: aload 29
      // 1af: ifnonnull 21e
      // 1b2: goto 1bf
      // 1b5: ldc2_w -7095273409479721396
      // 1b8: lload 3
      // 1b9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: athrow
      // 1bf: ifeq 1e6
      // 1c2: goto 1cf
      // 1c5: ldc2_w -7095273409479721396
      // 1c8: lload 3
      // 1c9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: athrow
      // 1cf: aload 30
      // 1d1: aload 34
      // 1d3: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1d8: pop
      // 1d9: goto 1e6
      // 1dc: ldc2_w -7095273409479721396
      // 1df: lload 3
      // 1e0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: athrow
      // 1e6: aload 31
      // 1e8: aload 34
      // 1ea: aload 33
      // 1ec: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 1f1: aload 33
      // 1f3: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 1f8: iload 23
      // 1fa: iload 24
      // 1fc: i2b
      // 1fd: iload 25
      // 1ff: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 202: pop
      // 203: aload 29
      // 205: ifnull 174
      // 208: aload 30
      // 20a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 20f: lload 3
      // 210: lconst_0
      // 211: lcmp
      // 212: iflt 185
      // 215: astore 32
      // 217: aload 32
      // 219: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21e: ifeq 325
      // 221: aload 32
      // 223: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 228: checkcast java/lang/String
      // 22b: astore 33
      // 22d: aload 31
      // 22f: aload 33
      // 231: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 234: astore 34
      // 236: new java/util/TreeSet
      // 239: dup
      // 23a: aload 34
      // 23c: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 241: invokespecial java/util/TreeSet.<init> (Ljava/util/Collection;)V
      // 244: astore 35
      // 246: bipush 0
      // 247: istore 36
      // 249: aconst_null
      // 24a: astore 37
      // 24c: aload 29
      // 24e: ifnonnull 34c
      // 251: aload 35
      // 253: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 258: astore 38
      // 25a: aload 38
      // 25c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 261: ifeq 31a
      // 264: aload 38
      // 266: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26b: checkcast com/zelix/x7
      // 26e: astore 39
      // 270: aload 29
      // 272: lload 3
      // 273: lconst_0
      // 274: lcmp
      // 275: ifle 2a1
      // 278: ifnonnull 29f
      // 27b: iload 36
      // 27d: iinc 36 1
      // 280: aload 29
      // 282: ifnonnull 21e
      // 285: lload 3
      // 286: lconst_0
      // 287: lcmp
      // 288: iflt 247
      // 28b: goto 298
      // 28e: ldc2_w -7095273409479721396
      // 291: lload 3
      // 292: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: athrow
      // 298: ifne 2aa
      // 29b: aload 39
      // 29d: astore 37
      // 29f: aload 29
      // 2a1: lload 3
      // 2a2: lconst_0
      // 2a3: lcmp
      // 2a4: iflt 317
      // 2a7: ifnull 30f
      // 2aa: aload 34
      // 2ac: aload 39
      // 2ae: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2b3: checkcast java/util/List
      // 2b6: astore 40
      // 2b8: aload 40
      // 2ba: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2bf: astore 41
      // 2c1: aload 41
      // 2c3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2c8: ifeq 30f
      // 2cb: aload 41
      // 2cd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2d2: checkcast com/zelix/sv
      // 2d5: astore 42
      // 2d7: aload 42
      // 2d9: lload 21
      // 2db: aload 39
      // 2dd: aload 37
      // 2df: bipush 3
      // 2e0: anewarray 185
      // 2e3: dup_x1
      // 2e4: swap
      // 2e5: bipush 2
      // 2e6: swap
      // 2e7: aastore
      // 2e8: dup_x1
      // 2e9: swap
      // 2ea: bipush 1
      // 2eb: swap
      // 2ec: aastore
      // 2ed: dup_x2
      // 2ee: dup_x2
      // 2ef: pop
      // 2f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f3: bipush 0
      // 2f4: swap
      // 2f5: aastore
      // 2f6: ldc2_w -8752535534661685138
      // 2f9: lload 3
      // 2fa: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: aload 29
      // 301: ifnonnull 25a
      // 304: aload 29
      // 306: lload 3
      // 307: lconst_0
      // 308: lcmp
      // 309: ifle 272
      // 30c: ifnull 2c1
      // 30f: aload 29
      // 311: lload 3
      // 312: lconst_0
      // 313: lcmp
      // 314: ifle 322
      // 317: ifnull 25a
      // 31a: aload 29
      // 31c: lload 3
      // 31d: lconst_0
      // 31e: lcmp
      // 31f: iflt 26b
      // 322: ifnull 217
      // 325: aload 31
      // 327: lload 26
      // 329: bipush 1
      // 32a: anewarray 185
      // 32d: dup_x2
      // 32e: dup_x2
      // 32f: pop
      // 330: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 333: bipush 0
      // 334: swap
      // 335: aastore
      // 336: ldc2_w -8951081611885406367
      // 339: lload 3
      // 33a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: aload 30
      // 341: invokeinterface java/util/Set.clear ()V 1
      // 346: lload 3
      // 347: lconst_0
      // 348: lcmp
      // 349: ifle 34c
      // 34c: return
   }

   private void T(Object[] param1) {
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
      // 00e: checkcast com/zelix/_y4
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/_83.d J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 90414246616024
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 68204841976197
      // 026: lxor
      // 027: lstore 7
      // 029: dup2
      // 02a: ldc2_w 128246618422003
      // 02d: lxor
      // 02e: dup2
      // 02f: bipush 32
      // 031: lushr
      // 032: l2i
      // 033: istore 9
      // 035: dup2
      // 036: bipush 32
      // 038: lshl
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 10
      // 03f: dup2
      // 040: bipush 48
      // 042: lshl
      // 043: bipush 48
      // 045: lushr
      // 046: l2i
      // 047: istore 11
      // 049: pop2
      // 04a: dup2
      // 04b: ldc2_w 73204940373601
      // 04e: lxor
      // 04f: lstore 12
      // 051: dup2
      // 052: ldc2_w 137274214716280
      // 055: lxor
      // 056: lstore 14
      // 058: dup2
      // 059: ldc2_w 26395200379476
      // 05c: lxor
      // 05d: dup2
      // 05e: bipush 32
      // 060: lushr
      // 061: l2i
      // 062: istore 16
      // 064: dup2
      // 065: bipush 32
      // 067: lshl
      // 068: bipush 48
      // 06a: lushr
      // 06b: l2i
      // 06c: istore 17
      // 06e: dup2
      // 06f: bipush 48
      // 071: lshl
      // 072: bipush 48
      // 074: lushr
      // 075: l2i
      // 076: istore 18
      // 078: pop2
      // 079: dup2
      // 07a: ldc2_w 101004482045265
      // 07d: lxor
      // 07e: lstore 19
      // 080: dup2
      // 081: ldc2_w 5824592658902
      // 084: lxor
      // 085: dup2
      // 086: bipush 32
      // 088: lushr
      // 089: l2i
      // 08a: istore 21
      // 08c: dup2
      // 08d: bipush 32
      // 08f: lshl
      // 090: bipush 56
      // 092: lushr
      // 093: l2i
      // 094: istore 22
      // 096: dup2
      // 097: bipush 40
      // 099: lshl
      // 09a: bipush 40
      // 09c: lushr
      // 09d: l2i
      // 09e: istore 23
      // 0a0: pop2
      // 0a1: dup2
      // 0a2: ldc2_w 14784412765358
      // 0a5: lxor
      // 0a6: lstore 24
      // 0a8: dup2
      // 0a9: ldc2_w 128923536022376
      // 0ac: lxor
      // 0ad: lstore 26
      // 0af: pop2
      // 0b0: ldc2_w 7207712521236972007
      // 0b3: lload 2
      // 0b4: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: aload 0
      // 0ba: getfield com/zelix/_83.Q Ljava/util/ArrayList;
      // 0bd: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 0c0: astore 30
      // 0c2: astore 29
      // 0c4: aload 30
      // 0c6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0cb: ifeq 12c
      // 0ce: aload 30
      // 0d0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d5: checkcast com/zelix/mo
      // 0d8: astore 31
      // 0da: aload 4
      // 0dc: aload 31
      // 0de: aload 29
      // 0e0: ifnonnull 118
      // 0e3: astore 28
      // 0e5: iload 16
      // 0e7: iload 17
      // 0e9: i2s
      // 0ea: iload 18
      // 0ec: i2c
      // 0ed: aload 28
      // 0ef: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 0f2: aload 29
      // 0f4: ifnonnull 148
      // 0f7: ifne 127
      // 0fa: goto 107
      // 0fd: ldc2_w 7357676958090610143
      // 100: lload 2
      // 101: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 4
      // 109: aload 31
      // 10b: goto 118
      // 10e: ldc2_w 7357676958090610143
      // 111: lload 2
      // 112: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: new java/util/ArrayList
      // 11b: dup
      // 11c: bipush 0
      // 11d: invokespecial java/util/ArrayList.<init> (I)V
      // 120: lload 5
      // 122: dup2_x2
      // 123: pop2
      // 124: invokevirtual com/zelix/_y4.v (JLjava/lang/Object;Ljava/util/Collection;)V
      // 127: aload 29
      // 129: ifnull 0c4
      // 12c: aload 0
      // 12d: ldc2_w 8872869488225319086
      // 130: lload 2
      // 131: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 139: lload 2
      // 13a: lconst_0
      // 13b: lcmp
      // 13c: iflt 0d5
      // 13f: astore 30
      // 141: aload 30
      // 143: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 148: ifeq 1a9
      // 14b: aload 30
      // 14d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 152: checkcast com/zelix/mo
      // 155: astore 31
      // 157: aload 4
      // 159: aload 31
      // 15b: aload 29
      // 15d: ifnonnull 195
      // 160: astore 28
      // 162: iload 16
      // 164: iload 17
      // 166: i2s
      // 167: iload 18
      // 169: i2c
      // 16a: aload 28
      // 16c: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 16f: aload 29
      // 171: ifnonnull 1bf
      // 174: ifne 1a4
      // 177: goto 184
      // 17a: ldc2_w 7357676958090610143
      // 17d: lload 2
      // 17e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: aload 4
      // 186: aload 31
      // 188: goto 195
      // 18b: ldc2_w 7357676958090610143
      // 18e: lload 2
      // 18f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: new java/util/ArrayList
      // 198: dup
      // 199: bipush 0
      // 19a: invokespecial java/util/ArrayList.<init> (I)V
      // 19d: lload 5
      // 19f: dup2_x2
      // 1a0: pop2
      // 1a1: invokevirtual com/zelix/_y4.v (JLjava/lang/Object;Ljava/util/Collection;)V
      // 1a4: aload 29
      // 1a6: ifnull 141
      // 1a9: aload 0
      // 1aa: getfield com/zelix/_83.R Ljava/util/ArrayList;
      // 1ad: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: iflt 152
      // 1b6: astore 30
      // 1b8: aload 30
      // 1ba: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1bf: ifeq 214
      // 1c2: aload 30
      // 1c4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1c9: checkcast com/zelix/mo
      // 1cc: astore 31
      // 1ce: aload 4
      // 1d0: aload 31
      // 1d2: aload 29
      // 1d4: ifnonnull 200
      // 1d7: astore 28
      // 1d9: lload 2
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: ifle 1f1
      // 1df: iload 16
      // 1e1: iload 17
      // 1e3: i2s
      // 1e4: iload 18
      // 1e6: i2c
      // 1e7: aload 28
      // 1e9: invokevirtual com/zelix/_y4.c (ISCLjava/lang/Object;)Z
      // 1ec: ifne 20f
      // 1ef: aload 4
      // 1f1: aload 31
      // 1f3: goto 200
      // 1f6: ldc2_w 7357676958090610143
      // 1f9: lload 2
      // 1fa: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: athrow
      // 200: new java/util/ArrayList
      // 203: dup
      // 204: bipush 0
      // 205: invokespecial java/util/ArrayList.<init> (I)V
      // 208: lload 5
      // 20a: dup2_x2
      // 20b: pop2
      // 20c: invokevirtual com/zelix/_y4.v (JLjava/lang/Object;Ljava/util/Collection;)V
      // 20f: aload 29
      // 211: ifnull 1b8
      // 214: lload 19
      // 216: bipush 1
      // 217: anewarray 185
      // 21a: dup_x2
      // 21b: dup_x2
      // 21c: pop
      // 21d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 220: bipush 0
      // 221: swap
      // 222: aastore
      // 223: ldc2_w 7301889831343352985
      // 226: lload 2
      // 227: invokedynamic p (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: lload 2
      // 22d: lconst_0
      // 22e: lcmp
      // 22f: iflt 1c9
      // 232: astore 30
      // 234: new com/zelix/_8z
      // 237: dup
      // 238: aload 4
      // 23a: lload 14
      // 23c: bipush 1
      // 23d: anewarray 185
      // 240: dup_x2
      // 241: dup_x2
      // 242: pop
      // 243: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 246: bipush 0
      // 247: swap
      // 248: aastore
      // 249: ldc2_w 8884050449954262529
      // 24c: lload 2
      // 24d: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: lload 7
      // 254: invokespecial com/zelix/_8z.<init> (IJ)V
      // 257: astore 31
      // 259: aload 4
      // 25b: iload 9
      // 25d: iload 10
      // 25f: i2s
      // 260: iload 11
      // 262: i2s
      // 263: invokevirtual com/zelix/_y4.U (ISS)Ljava/util/Set;
      // 266: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 26b: astore 32
      // 26d: aload 32
      // 26f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 274: ifeq 314
      // 277: aload 32
      // 279: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 27e: checkcast java/util/Map$Entry
      // 281: astore 33
      // 283: aload 33
      // 285: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 28a: checkcast com/zelix/mo
      // 28d: lload 12
      // 28f: bipush 1
      // 290: anewarray 185
      // 293: dup_x2
      // 294: dup_x2
      // 295: pop
      // 296: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 299: bipush 0
      // 29a: swap
      // 29b: aastore
      // 29c: ldc2_w 8839119375093086601
      // 29f: lload 2
      // 2a0: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: astore 34
      // 2a7: aload 31
      // 2a9: aload 34
      // 2ab: aload 29
      // 2ad: lload 2
      // 2ae: lconst_0
      // 2af: lcmp
      // 2b0: ifle 2fd
      // 2b3: ifnonnull 2f6
      // 2b6: invokevirtual com/zelix/_8z.g (Ljava/lang/Object;)Z
      // 2b9: aload 29
      // 2bb: ifnonnull 32a
      // 2be: goto 2cb
      // 2c1: ldc2_w 7357676958090610143
      // 2c4: lload 2
      // 2c5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: athrow
      // 2cb: ifeq 2f2
      // 2ce: goto 2db
      // 2d1: ldc2_w 7357676958090610143
      // 2d4: lload 2
      // 2d5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: athrow
      // 2db: aload 30
      // 2dd: aload 34
      // 2df: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 2e4: pop
      // 2e5: goto 2f2
      // 2e8: ldc2_w 7357676958090610143
      // 2eb: lload 2
      // 2ec: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: athrow
      // 2f2: aload 31
      // 2f4: aload 34
      // 2f6: aload 33
      // 2f8: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2fd: aload 33
      // 2ff: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 304: iload 21
      // 306: iload 22
      // 308: i2b
      // 309: iload 23
      // 30b: invokevirtual com/zelix/_8z.s (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IBI)Ljava/lang/Object;
      // 30e: pop
      // 30f: aload 29
      // 311: ifnull 26d
      // 314: aload 30
      // 316: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 31b: lload 2
      // 31c: lconst_0
      // 31d: lcmp
      // 31e: ifle 27e
      // 321: astore 32
      // 323: aload 32
      // 325: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 32a: ifeq 431
      // 32d: aload 32
      // 32f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 334: checkcast java/lang/String
      // 337: astore 33
      // 339: aload 31
      // 33b: aload 33
      // 33d: invokevirtual com/zelix/_8z.D (Ljava/lang/Object;)Ljava/util/Map;
      // 340: astore 34
      // 342: new java/util/TreeSet
      // 345: dup
      // 346: aload 34
      // 348: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 34d: invokespecial java/util/TreeSet.<init> (Ljava/util/Collection;)V
      // 350: astore 35
      // 352: bipush 0
      // 353: istore 36
      // 355: aconst_null
      // 356: astore 37
      // 358: aload 29
      // 35a: ifnonnull 458
      // 35d: aload 35
      // 35f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 364: astore 38
      // 366: aload 38
      // 368: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 36d: ifeq 426
      // 370: aload 38
      // 372: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 377: checkcast com/zelix/mo
      // 37a: astore 39
      // 37c: aload 29
      // 37e: lload 2
      // 37f: lconst_0
      // 380: lcmp
      // 381: ifle 3ad
      // 384: ifnonnull 3ab
      // 387: iload 36
      // 389: iinc 36 1
      // 38c: aload 29
      // 38e: ifnonnull 32a
      // 391: lload 2
      // 392: lconst_0
      // 393: lcmp
      // 394: iflt 353
      // 397: goto 3a4
      // 39a: ldc2_w 7357676958090610143
      // 39d: lload 2
      // 39e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: athrow
      // 3a4: ifne 3b6
      // 3a7: aload 39
      // 3a9: astore 37
      // 3ab: aload 29
      // 3ad: lload 2
      // 3ae: lconst_0
      // 3af: lcmp
      // 3b0: iflt 423
      // 3b3: ifnull 41b
      // 3b6: aload 34
      // 3b8: aload 39
      // 3ba: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3bf: checkcast java/util/List
      // 3c2: astore 40
      // 3c4: aload 40
      // 3c6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3cb: astore 41
      // 3cd: aload 41
      // 3cf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3d4: ifeq 41b
      // 3d7: aload 41
      // 3d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3de: checkcast com/zelix/qz
      // 3e1: astore 42
      // 3e3: aload 42
      // 3e5: aload 39
      // 3e7: aload 37
      // 3e9: lload 26
      // 3eb: bipush 3
      // 3ec: anewarray 185
      // 3ef: dup_x2
      // 3f0: dup_x2
      // 3f1: pop
      // 3f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f5: bipush 2
      // 3f6: swap
      // 3f7: aastore
      // 3f8: dup_x1
      // 3f9: swap
      // 3fa: bipush 1
      // 3fb: swap
      // 3fc: aastore
      // 3fd: dup_x1
      // 3fe: swap
      // 3ff: bipush 0
      // 400: swap
      // 401: aastore
      // 402: ldc2_w 7079221667307580332
      // 405: lload 2
      // 406: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40b: aload 29
      // 40d: ifnonnull 366
      // 410: aload 29
      // 412: lload 2
      // 413: lconst_0
      // 414: lcmp
      // 415: ifle 37e
      // 418: ifnull 3cd
      // 41b: aload 29
      // 41d: lload 2
      // 41e: lconst_0
      // 41f: lcmp
      // 420: iflt 42e
      // 423: ifnull 366
      // 426: aload 29
      // 428: lload 2
      // 429: lconst_0
      // 42a: lcmp
      // 42b: ifle 377
      // 42e: ifnull 323
      // 431: aload 31
      // 433: lload 24
      // 435: bipush 1
      // 436: anewarray 185
      // 439: dup_x2
      // 43a: dup_x2
      // 43b: pop
      // 43c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43f: bipush 0
      // 440: swap
      // 441: aastore
      // 442: ldc2_w 8670661741550824690
      // 445: lload 2
      // 446: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44b: aload 30
      // 44d: invokeinterface java/util/Set.clear ()V 1
      // 452: lload 2
      // 453: lconst_0
      // 454: lcmp
      // 455: ifle 458
      // 458: return
   }

   public final hz p(Object[] var1) {
      return this.c;
   }

   public mn p(Object[] var1) {
      String var3 = (String)var1[0];
      String var6 = (String)var1[1];
      List var2 = (List)var1[2];
      long var4 = (Long)var1[3];
      var4 = d ^ var4;
      long var7 = var4 ^ 47821016703584L;
      mx var9 = new mx(0, this, var3);
      mx var10 = new mx(0, this, var6);
      mn var11 = new mn(0, var7, this, var9, var10, null);
      var2.add(var11);
      var2.add(var9);
      var2.add(var10);
      return var11;
   }

   public x7 a(int param1, int param2, String param3, List param4, byte param5) {
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
      // 005: iload 2
      // 006: i2l
      // 007: bipush 40
      // 009: lshl
      // 00a: bipush 32
      // 00c: lushr
      // 00d: lor
      // 00e: iload 5
      // 010: i2l
      // 011: bipush 56
      // 013: lshl
      // 014: bipush 56
      // 016: lushr
      // 017: lor
      // 018: getstatic com/zelix/_83.d J
      // 01b: lxor
      // 01c: lstore 6
      // 01e: lload 6
      // 020: dup2
      // 021: ldc2_w 101577719734538
      // 024: lxor
      // 025: lstore 8
      // 027: dup2
      // 028: ldc2_w 11960022923141
      // 02b: lxor
      // 02c: lstore 10
      // 02e: dup2
      // 02f: ldc2_w 93315444214406
      // 032: lxor
      // 033: dup2
      // 034: bipush 32
      // 036: lushr
      // 037: l2i
      // 038: istore 12
      // 03a: dup2
      // 03b: bipush 32
      // 03d: lshl
      // 03e: bipush 48
      // 040: lushr
      // 041: l2i
      // 042: istore 13
      // 044: dup2
      // 045: bipush 48
      // 047: lshl
      // 048: bipush 48
      // 04a: lushr
      // 04b: l2i
      // 04c: istore 14
      // 04e: pop2
      // 04f: pop2
      // 050: ldc2_w 1503524430535160124
      // 053: lload 6
      // 055: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: aload 0
      // 05b: getfield com/zelix/_83.a Ljava/util/ArrayList;
      // 05e: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 061: astore 16
      // 063: astore 15
      // 065: aload 16
      // 067: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06c: ifeq 0b4
      // 06f: aload 16
      // 071: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 076: checkcast com/zelix/x7
      // 079: astore 17
      // 07b: aload 17
      // 07d: aload 15
      // 07f: ifnonnull 0ae
      // 082: lload 10
      // 084: aload 3
      // 085: invokevirtual com/zelix/x7.M (JLjava/lang/String;)Z
      // 088: aload 15
      // 08a: ifnonnull 0c8
      // 08d: goto 09b
      // 090: ldc2_w 1639556471438783748
      // 093: lload 6
      // 095: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: ifeq 0af
      // 09e: goto 0ac
      // 0a1: ldc2_w 1639556471438783748
      // 0a4: lload 6
      // 0a6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: aload 17
      // 0ae: areturn
      // 0af: aload 15
      // 0b1: ifnull 065
      // 0b4: aload 4
      // 0b6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0bb: iload 1
      // 0bc: ifle 076
      // 0bf: astore 16
      // 0c1: aload 16
      // 0c3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c8: ifeq 144
      // 0cb: aload 16
      // 0cd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d2: checkcast com/zelix/xl
      // 0d5: astore 17
      // 0d7: aload 17
      // 0d9: iload 5
      // 0db: iflt 10c
      // 0de: aload 15
      // 0e0: ifnonnull 10c
      // 0e3: lload 8
      // 0e5: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 0e8: getstatic com/zelix/w5.l Lcom/zelix/w5;
      // 0eb: if_acmpne 13f
      // 0ee: goto 0fc
      // 0f1: ldc2_w 1639556471438783748
      // 0f4: lload 6
      // 0f6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 17
      // 0fe: goto 10c
      // 101: ldc2_w 1639556471438783748
      // 104: lload 6
      // 106: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: checkcast com/zelix/x7
      // 10f: aload 15
      // 111: ifnonnull 13e
      // 114: lload 10
      // 116: aload 3
      // 117: invokevirtual com/zelix/x7.M (JLjava/lang/String;)Z
      // 11a: ifeq 13f
      // 11d: goto 12b
      // 120: ldc2_w 1639556471438783748
      // 123: lload 6
      // 125: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 17
      // 12d: checkcast com/zelix/x7
      // 130: goto 13e
      // 133: ldc2_w 1639556471438783748
      // 136: lload 6
      // 138: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: areturn
      // 13f: aload 15
      // 141: ifnull 0c1
      // 144: new com/zelix/mx
      // 147: dup
      // 148: bipush 0
      // 149: aload 0
      // 14a: aload 3
      // 14b: invokespecial com/zelix/mx.<init> (ILcom/zelix/_83;Ljava/lang/String;)V
      // 14e: iload 1
      // 14f: ifle 0d5
      // 152: astore 16
      // 154: new com/zelix/x7
      // 157: dup
      // 158: bipush 0
      // 159: iload 12
      // 15b: aload 0
      // 15c: iload 13
      // 15e: i2s
      // 15f: iload 14
      // 161: i2s
      // 162: aload 16
      // 164: invokespecial com/zelix/x7.<init> (IILcom/zelix/_83;SSLcom/zelix/mx;)V
      // 167: astore 17
      // 169: aload 4
      // 16b: aload 17
      // 16d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 172: pop
      // 173: aload 4
      // 175: aload 16
      // 177: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 17c: pop
      // 17d: aload 17
      // 17f: areturn
   }

   public final void p(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:45 from source 42_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast com/zelix/_ur
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_yv
      // 00e: astore 3
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/lang/Long
      // 015: invokevirtual java/lang/Long.longValue ()J
      // 018: lstore 4
      // 01a: pop
      // 01b: getstatic com/zelix/_83.d J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 64259169158003
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 94265391945634
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w -5610147046659729467
      // 037: lload 4
      // 039: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aload 0
      // 03f: getfield com/zelix/_83.Q Ljava/util/ArrayList;
      // 042: invokevirtual java/util/ArrayList.size ()I
      // 045: istore 11
      // 047: astore 10
      // 049: bipush 0
      // 04a: istore 12
      // 04c: iload 12
      // 04e: iload 11
      // 050: if_icmpge 08f
      // 053: aload 0
      // 054: getfield com/zelix/_83.Q Ljava/util/ArrayList;
      // 057: iload 12
      // 059: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 05c: checkcast com/zelix/my
      // 05f: aload 2
      // 060: lload 8
      // 062: aload 3
      // 063: invokevirtual com/zelix/my.K (Lcom/zelix/_ur;JLcom/zelix/_yv;)V
      // 066: iinc 12 1
      // 069: aload 10
      // 06b: lload 4
      // 06d: lconst_0
      // 06e: lcmp
      // 06f: iflt 077
      // 072: ifnonnull 09f
      // 075: aload 10
      // 077: ifnull 04c
      // 07a: lload 4
      // 07c: lconst_0
      // 07d: lcmp
      // 07e: ifle 069
      // 081: goto 08f
      // 084: ldc2_w -5748413296126094339
      // 087: lload 4
      // 089: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: aload 0
      // 090: ldc2_w -5980512644039790964
      // 093: lload 4
      // 095: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: invokevirtual java/util/ArrayList.size ()I
      // 09d: istore 11
      // 09f: bipush 0
      // 0a0: istore 12
      // 0a2: iload 12
      // 0a4: iload 11
      // 0a6: if_icmpge 0ec
      // 0a9: aload 0
      // 0aa: ldc2_w -5980512644039790964
      // 0ad: lload 4
      // 0af: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: iload 12
      // 0b6: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0b9: checkcast com/zelix/mz
      // 0bc: aload 2
      // 0bd: lload 8
      // 0bf: aload 3
      // 0c0: invokevirtual com/zelix/mz.K (Lcom/zelix/_ur;JLcom/zelix/_yv;)V
      // 0c3: iinc 12 1
      // 0c6: aload 10
      // 0c8: lload 4
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: iflt 0d4
      // 0cf: ifnonnull 0fc
      // 0d2: aload 10
      // 0d4: ifnull 0a2
      // 0d7: lload 4
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: iflt 0c6
      // 0de: goto 0ec
      // 0e1: ldc2_w -5748413296126094339
      // 0e4: lload 4
      // 0e6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: ldc2_w -5916424589152036026
      // 0f0: lload 4
      // 0f2: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: invokevirtual java/util/ArrayList.size ()I
      // 0fa: istore 11
      // 0fc: bipush 0
      // 0fd: istore 12
      // 0ff: iload 12
      // 101: iload 11
      // 103: if_icmpge 140
      // 106: aload 0
      // 107: ldc2_w -5916424589152036026
      // 10a: lload 4
      // 10c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: iload 12
      // 113: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 116: checkcast com/zelix/x4
      // 119: aload 2
      // 11a: lload 6
      // 11c: bipush 2
      // 11d: anewarray 185
      // 120: dup_x2
      // 121: dup_x2
      // 122: pop
      // 123: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 126: bipush 1
      // 127: swap
      // 128: aastore
      // 129: dup_x1
      // 12a: swap
      // 12b: bipush 0
      // 12c: swap
      // 12d: aastore
      // 12e: ldc2_w -5672049787905830671
      // 131: lload 4
      // 133: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: iinc 12 1
      // 13b: aload 10
      // 13d: ifnull 0ff
      // 140: lload 4
      // 142: lconst_0
      // 143: lcmp
      // 144: ifle 13b
      // 147: return
   }

   protected mo R(String param1, String param2, String param3, List param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_83.d J
      // 03: lload 5
      // 05: lxor
      // 06: lstore 5
      // 08: lload 5
      // 0a: dup2
      // 0b: ldc2_w 68010994366377
      // 0e: lxor
      // 0f: lstore 7
      // 11: pop2
      // 12: ldc2_w -2339910808772298137
      // 15: lload 5
      // 17: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: aload 4
      // 1e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 23: astore 10
      // 25: astore 9
      // 27: aload 10
      // 29: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2e: ifeq a3
      // 31: aload 10
      // 33: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 38: checkcast com/zelix/xl
      // 3b: astore 11
      // 3d: aload 11
      // 3f: aload 9
      // 41: ifnonnull 68
      // 44: instanceof com/zelix/mo
      // 47: ifeq 9e
      // 4a: goto 58
      // 4d: ldc2_w -2478176166089720225
      // 50: lload 5
      // 52: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 11
      // 5a: goto 68
      // 5d: ldc2_w -2478176166089720225
      // 60: lload 5
      // 62: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: checkcast com/zelix/mo
      // 6b: astore 12
      // 6d: aload 12
      // 6f: aload 9
      // 71: ifnonnull 9d
      // 74: lload 7
      // 76: aload 1
      // 77: aload 2
      // 78: aload 3
      // 79: invokevirtual com/zelix/mo.T (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
      // 7c: ifeq 9e
      // 7f: goto 8d
      // 82: ldc2_w -2478176166089720225
      // 85: lload 5
      // 87: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: aload 12
      // 8f: goto 9d
      // 92: ldc2_w -2478176166089720225
      // 95: lload 5
      // 97: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: athrow
      // 9d: areturn
      // 9e: aload 9
      // a0: ifnull 27
      // a3: aconst_null
      // a4: areturn
   }

   public final mz M(Object[] var1) {
      iu var2 = (iu)var1[0];
      long var3 = (Long)var1[1];
      List var5 = (List)var1[2];
      var3 = d ^ var3;
      long var6 = var3 ^ 133103708180768L;
      long var8 = var3 ^ 140238745865514L;
      long var10 = var3 ^ 34455985453651L;
      return (mz)x44.a<"k">(this, new Object[]{var2.k(var6), var2.t(var8), var2.H(), var5, var10, var2}, 706189607480965361L, var3);
   }

   private m8 p(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 8
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/String
      // 017: astore 2
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/util/List
      // 01e: astore 7
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/lang/Long
      // 026: invokevirtual java/lang/Long.longValue ()J
      // 029: lstore 3
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/iu
      // 030: astore 5
      // 032: pop
      // 033: getstatic com/zelix/_83.d J
      // 036: lload 3
      // 037: lxor
      // 038: lstore 3
      // 039: lload 3
      // 03a: dup2
      // 03b: ldc2_w 78115203923297
      // 03e: lxor
      // 03f: lstore 9
      // 041: dup2
      // 042: ldc2_w 13116688499950
      // 045: lxor
      // 046: lstore 11
      // 048: dup2
      // 049: ldc2_w 25209826107429
      // 04c: lxor
      // 04d: dup2
      // 04e: bipush 32
      // 050: lushr
      // 051: l2i
      // 052: istore 13
      // 054: dup2
      // 055: bipush 32
      // 057: lshl
      // 058: bipush 40
      // 05a: lushr
      // 05b: l2i
      // 05c: istore 14
      // 05e: dup2
      // 05f: bipush 56
      // 061: lshl
      // 062: bipush 56
      // 064: lushr
      // 065: l2i
      // 066: istore 15
      // 068: pop2
      // 069: dup2
      // 06a: ldc2_w 37630450398291
      // 06d: lxor
      // 06e: lstore 16
      // 070: dup2
      // 071: ldc2_w 87732777917942
      // 074: lxor
      // 075: lstore 18
      // 077: dup2
      // 078: ldc2_w 22874471754810
      // 07b: lxor
      // 07c: lstore 20
      // 07e: dup2
      // 07f: ldc2_w 130744082377598
      // 082: lxor
      // 083: lstore 22
      // 085: pop2
      // 086: ldc2_w -6607105080905514577
      // 089: lload 3
      // 08a: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: aload 5
      // 091: lload 20
      // 093: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 096: lload 11
      // 098: invokevirtual com/zelix/hz.d (J)Z
      // 09b: istore 27
      // 09d: astore 26
      // 09f: iload 27
      // 0a1: ifeq 0de
      // 0a4: aload 0
      // 0a5: aload 6
      // 0a7: aload 8
      // 0a9: aload 2
      // 0aa: lload 16
      // 0ac: bipush 4
      // 0ad: anewarray 185
      // 0b0: dup_x2
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: bipush 3
      // 0b7: swap
      // 0b8: aastore
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: bipush 2
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 1
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: bipush 0
      // 0c6: swap
      // 0c7: aastore
      // 0c8: ldc2_w -6722026453575103314
      // 0cb: lload 3
      // 0cc: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: astore 28
      // 0d3: lload 3
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 0eb
      // 0d9: aload 26
      // 0db: ifnull 0eb
      // 0de: aload 0
      // 0df: aload 6
      // 0e1: aload 8
      // 0e3: lload 9
      // 0e5: aload 2
      // 0e6: invokevirtual com/zelix/_83.i (Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/zelix/my;
      // 0e9: astore 28
      // 0eb: aload 28
      // 0ed: lload 3
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 12e
      // 0f3: aload 26
      // 0f5: ifnonnull 12e
      // 0f8: ifnull 115
      // 0fb: goto 108
      // 0fe: ldc2_w -6461662147115711081
      // 101: lload 3
      // 102: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: aload 28
      // 10a: areturn
      // 10b: ldc2_w -6461662147115711081
      // 10e: lload 3
      // 10f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 0
      // 116: aload 6
      // 118: aload 26
      // 11a: ifnonnull 147
      // 11d: aload 8
      // 11f: aload 2
      // 120: aload 7
      // 122: lload 22
      // 124: invokevirtual com/zelix/_83.R (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)Lcom/zelix/mo;
      // 127: checkcast com/zelix/m8
      // 12a: astore 28
      // 12c: aload 28
      // 12e: lload 3
      // 12f: lconst_0
      // 130: lcmp
      // 131: ifle 139
      // 134: ifnull 144
      // 137: aload 28
      // 139: areturn
      // 13a: ldc2_w -6461662147115711081
      // 13d: lload 3
      // 13e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: aload 0
      // 145: aload 6
      // 147: aload 7
      // 149: astore 24
      // 14b: astore 25
      // 14d: iload 13
      // 14f: iload 14
      // 151: aload 25
      // 153: aload 24
      // 155: iload 15
      // 157: i2b
      // 158: invokevirtual com/zelix/_83.a (IILjava/lang/String;Ljava/util/List;B)Lcom/zelix/x7;
      // 15b: astore 29
      // 15d: aload 0
      // 15e: aload 8
      // 160: aload 2
      // 161: aload 7
      // 163: lload 18
      // 165: bipush 4
      // 166: anewarray 185
      // 169: dup_x2
      // 16a: dup_x2
      // 16b: pop
      // 16c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16f: bipush 3
      // 170: swap
      // 171: aastore
      // 172: dup_x1
      // 173: swap
      // 174: bipush 2
      // 175: swap
      // 176: aastore
      // 177: dup_x1
      // 178: swap
      // 179: bipush 1
      // 17a: swap
      // 17b: aastore
      // 17c: dup_x1
      // 17d: swap
      // 17e: bipush 0
      // 17f: swap
      // 180: aastore
      // 181: ldc2_w -5041512536042273481
      // 184: lload 3
      // 185: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: astore 30
      // 18c: iload 27
      // 18e: ifeq 1ad
      // 191: new com/zelix/mz
      // 194: dup
      // 195: bipush 0
      // 196: aload 0
      // 197: aload 29
      // 199: aload 30
      // 19b: aload 5
      // 19d: invokespecial com/zelix/mz.<init> (ILcom/zelix/_83;Lcom/zelix/x7;Lcom/zelix/mn;Lcom/zelix/iu;)V
      // 1a0: astore 31
      // 1a2: lload 3
      // 1a3: lconst_0
      // 1a4: lcmp
      // 1a5: ifle 1c8
      // 1a8: aload 26
      // 1aa: ifnull 1be
      // 1ad: new com/zelix/my
      // 1b0: dup
      // 1b1: bipush 0
      // 1b2: aload 0
      // 1b3: aload 29
      // 1b5: aload 30
      // 1b7: aload 5
      // 1b9: invokespecial com/zelix/my.<init> (ILcom/zelix/_83;Lcom/zelix/x7;Lcom/zelix/mn;Lcom/zelix/iu;)V
      // 1bc: astore 31
      // 1be: aload 7
      // 1c0: aload 31
      // 1c2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1c7: pop
      // 1c8: aload 31
      // 1ca: areturn
   }

   abstract boolean C(Object[] var1);

   public final my Q(Object[] var1) {
      iu var2 = (iu)var1[0];
      List var5 = (List)var1[1];
      long var3 = (Long)var1[2];
      var3 = d ^ var3;
      long var6 = var3 ^ 2110300570257L;
      long var8 = var3 ^ 8169701531291L;
      long var10 = var3 ^ 114021186152930L;
      return (my)x44.a<"j">(this, new Object[]{var2.k(var6), var2.t(var8), var2.H(), var5, var10, var2}, -2702833428865193152L, var3);
   }

   protected my i(String param1, String param2, long param3, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_83.d J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: lload 3
      // 07: dup2
      // 08: ldc2_w 13441859707318
      // 0b: lxor
      // 0c: lstore 6
      // 0e: pop2
      // 0f: ldc2_w -3919883855310705544
      // 12: lload 3
      // 13: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: aload 0
      // 19: getfield com/zelix/_83.Q Ljava/util/ArrayList;
      // 1c: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 1f: astore 9
      // 21: astore 8
      // 23: aload 9
      // 25: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2a: ifeq 6e
      // 2d: aload 9
      // 2f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 34: checkcast com/zelix/my
      // 37: astore 10
      // 39: aload 10
      // 3b: aload 8
      // 3d: ifnonnull 68
      // 40: lload 6
      // 42: aload 1
      // 43: aload 2
      // 44: aload 5
      // 46: invokevirtual com/zelix/my.T (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
      // 49: ifeq 69
      // 4c: goto 59
      // 4f: ldc2_w -3781741611083569088
      // 52: lload 3
      // 53: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 10
      // 5b: goto 68
      // 5e: ldc2_w -3781741611083569088
      // 61: lload 3
      // 62: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: areturn
      // 69: aload 8
      // 6b: ifnull 23
      // 6e: aconst_null
      // 6f: areturn
   }

   public final void G(Object[] param1) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/_83.d J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 3082104612322561828
      // 15: lload 2
      // 16: invokedynamic s (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aload 0
      // 1c: getfield com/zelix/_83.z [Lcom/zelix/xl;
      // 1f: arraylength
      // 20: istore 5
      // 22: bipush 0
      // 23: istore 6
      // 25: astore 4
      // 27: iload 6
      // 29: iload 5
      // 2b: if_icmpge 42
      // 2e: aload 0
      // 2f: getfield com/zelix/_83.z [Lcom/zelix/xl;
      // 32: iload 6
      // 34: aaload
      // 35: iload 6
      // 37: invokevirtual com/zelix/xl.s (I)V
      // 3a: iinc 6 1
      // 3d: aload 4
      // 3f: ifnull 27
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt 3d
      // 48: return
   }

   public final mr y(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/String
      // 017: astore 2
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/util/List
      // 01e: astore 3
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast com/zelix/iz
      // 025: astore 5
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast java/lang/Long
      // 02d: invokevirtual java/lang/Long.longValue ()J
      // 030: lstore 6
      // 032: pop
      // 033: getstatic com/zelix/_83.d J
      // 036: lload 6
      // 038: lxor
      // 039: lstore 6
      // 03b: lload 6
      // 03d: dup2
      // 03e: ldc2_w 84345413132539
      // 041: lxor
      // 042: dup2
      // 043: bipush 32
      // 045: lushr
      // 046: l2i
      // 047: istore 9
      // 049: dup2
      // 04a: bipush 32
      // 04c: lshl
      // 04d: bipush 40
      // 04f: lushr
      // 050: l2i
      // 051: istore 10
      // 053: dup2
      // 054: bipush 56
      // 056: lshl
      // 057: bipush 56
      // 059: lushr
      // 05a: l2i
      // 05b: istore 11
      // 05d: pop2
      // 05e: dup2
      // 05f: ldc2_w 40778508393786
      // 062: lxor
      // 063: lstore 12
      // 065: dup2
      // 066: ldc2_w 23713819499816
      // 069: lxor
      // 06a: lstore 14
      // 06c: dup2
      // 06d: ldc2_w 49145537604512
      // 070: lxor
      // 071: lstore 16
      // 073: pop2
      // 074: ldc2_w 2634749495881711985
      // 077: lload 6
      // 079: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: aload 0
      // 07f: aload 8
      // 081: aload 4
      // 083: aload 2
      // 084: lload 12
      // 086: bipush 4
      // 087: anewarray 185
      // 08a: dup_x2
      // 08b: dup_x2
      // 08c: pop
      // 08d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 090: bipush 3
      // 091: swap
      // 092: aastore
      // 093: dup_x1
      // 094: swap
      // 095: bipush 2
      // 096: swap
      // 097: aastore
      // 098: dup_x1
      // 099: swap
      // 09a: bipush 1
      // 09b: swap
      // 09c: aastore
      // 09d: dup_x1
      // 09e: swap
      // 09f: bipush 0
      // 0a0: swap
      // 0a1: aastore
      // 0a2: ldc2_w 2827664957463951016
      // 0a5: lload 6
      // 0a7: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mr; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: astore 21
      // 0ae: astore 20
      // 0b0: aload 21
      // 0b2: aload 20
      // 0b4: ifnonnull 0ee
      // 0b7: ifnull 0d6
      // 0ba: goto 0c8
      // 0bd: ldc2_w 2778099576807949641
      // 0c0: lload 6
      // 0c2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 21
      // 0ca: areturn
      // 0cb: ldc2_w 2778099576807949641
      // 0ce: lload 6
      // 0d0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: aload 8
      // 0d9: aload 20
      // 0db: ifnonnull 109
      // 0de: aload 4
      // 0e0: aload 2
      // 0e1: aload 3
      // 0e2: lload 16
      // 0e4: invokevirtual com/zelix/_83.R (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;J)Lcom/zelix/mo;
      // 0e7: checkcast com/zelix/mr
      // 0ea: astore 21
      // 0ec: aload 21
      // 0ee: lload 6
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: ifle 0fa
      // 0f5: ifnull 106
      // 0f8: aload 21
      // 0fa: areturn
      // 0fb: ldc2_w 2778099576807949641
      // 0fe: lload 6
      // 100: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: aload 8
      // 109: aload 3
      // 10a: astore 18
      // 10c: astore 19
      // 10e: iload 9
      // 110: iload 10
      // 112: aload 19
      // 114: aload 18
      // 116: iload 11
      // 118: i2b
      // 119: invokevirtual com/zelix/_83.a (IILjava/lang/String;Ljava/util/List;B)Lcom/zelix/x7;
      // 11c: astore 22
      // 11e: aload 0
      // 11f: aload 4
      // 121: aload 2
      // 122: aload 3
      // 123: lload 14
      // 125: bipush 4
      // 126: anewarray 185
      // 129: dup_x2
      // 12a: dup_x2
      // 12b: pop
      // 12c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12f: bipush 3
      // 130: swap
      // 131: aastore
      // 132: dup_x1
      // 133: swap
      // 134: bipush 2
      // 135: swap
      // 136: aastore
      // 137: dup_x1
      // 138: swap
      // 139: bipush 1
      // 13a: swap
      // 13b: aastore
      // 13c: dup_x1
      // 13d: swap
      // 13e: bipush 0
      // 13f: swap
      // 140: aastore
      // 141: ldc2_w 4239762279913752041
      // 144: lload 6
      // 146: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: astore 23
      // 14d: new com/zelix/mr
      // 150: dup
      // 151: bipush 0
      // 152: aload 0
      // 153: aload 22
      // 155: aload 23
      // 157: aload 5
      // 159: invokespecial com/zelix/mr.<init> (ILcom/zelix/_83;Lcom/zelix/x7;Lcom/zelix/mn;Lcom/zelix/iz;)V
      // 15c: astore 24
      // 15e: aload 3
      // 15f: aload 24
      // 161: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 166: pop
      // 167: aload 24
      // 169: areturn
   }

   public String P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      long var4 = var2 ^ 96454950870470L;
      return x44.a<"j">(this.c, new Object[]{var4}, 7825900791806103287L, var2);
   }

   public mx Y(String var1, List var2) {
      mx var3 = new mx(0, this, var1);
      var2.add(var3);
      return var3;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
