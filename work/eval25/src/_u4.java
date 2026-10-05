package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public abstract class _u4 extends _u5 {
   protected Map P;
   protected Map N;
   protected Map l;
   protected Map I;
   protected Map w;
   protected Map O;
   private static final long j = ess.a(-2880569030490212452L, 2331174774112051186L, MethodHandles.lookup().lookupClass()).a(91543934971845L);

   public final Enumeration g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = j ^ var2;
      long var4 = var2 ^ 42049174980491L;
      return x44.a<"p">(new Object[]{var4, x44.a<"l">(this, -6069062418387197413L, var2).keySet()}, -6046147972367590451L, var2);
   }

   public boolean c(Object[] var1) {
      long var2 = (Long)var1[0];
      hk[] var4 = x44.a<"s">(-5496853611043737681L, var2);

      try {
         int var10000 = this.P.size();
         if (var4 != null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"s">(var5, -5713161358215428860L, var2);
      }

      return (boolean)0;
   }

   public final boolean X(Object[] param1) {
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
      // 00e: checkcast com/zelix/hy
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/_u4.j J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 134695944925517
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 140306291394341
      // 025: lxor
      // 026: lstore 7
      // 028: pop2
      // 029: ldc2_w 59461408180640971
      // 02c: lload 3
      // 02d: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: astore 9
      // 034: aload 2
      // 035: ifnonnull 044
      // 038: bipush 0
      // 039: ireturn
      // 03a: ldc2_w 275486031095887456
      // 03d: lload 3
      // 03e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: athrow
      // 044: aload 0
      // 045: ldc2_w 2027024741871463892
      // 048: lload 3
      // 049: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 2
      // 04f: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 054: istore 10
      // 056: iload 10
      // 058: aload 9
      // 05a: ifnonnull 121
      // 05d: ifne 11f
      // 060: goto 06d
      // 063: ldc2_w 275486031095887456
      // 066: lload 3
      // 067: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: aload 2
      // 06e: lload 5
      // 070: invokevirtual com/zelix/hy.B (J)Z
      // 073: aload 9
      // 075: ifnonnull 121
      // 078: goto 085
      // 07b: ldc2_w 275486031095887456
      // 07e: lload 3
      // 07f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: ifeq 11f
      // 088: goto 095
      // 08b: ldc2_w 275486031095887456
      // 08e: lload 3
      // 08f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: athrow
      // 095: aload 2
      // 096: lload 7
      // 098: bipush 1
      // 099: anewarray 79
      // 09c: dup_x2
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a2: bipush 0
      // 0a3: swap
      // 0a4: aastore
      // 0a5: ldc2_w 2112951736517909264
      // 0a8: lload 3
      // 0a9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b3: astore 11
      // 0b5: aload 11
      // 0b7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0bc: ifeq 11f
      // 0bf: aload 11
      // 0c1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c6: checkcast com/zelix/hz
      // 0c9: astore 12
      // 0cb: aload 0
      // 0cc: ldc2_w 2027024741871463892
      // 0cf: lload 3
      // 0d0: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: aload 12
      // 0d7: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0dc: istore 10
      // 0de: iload 10
      // 0e0: aload 9
      // 0e2: ifnonnull 121
      // 0e5: ifeq 107
      // 0e8: goto 0f5
      // 0eb: ldc2_w 275486031095887456
      // 0ee: lload 3
      // 0ef: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 9
      // 0f7: ifnull 11f
      // 0fa: goto 107
      // 0fd: ldc2_w 275486031095887456
      // 100: lload 3
      // 101: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 9
      // 109: ifnull 0b5
      // 10c: lload 3
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: ifle 0de
      // 112: goto 11f
      // 115: ldc2_w 275486031095887456
      // 118: lload 3
      // 119: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: iload 10
      // 121: ireturn
   }

   public Enumeration d(Object[] param1) {
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
      // 0c: getstatic com/zelix/_u4.j J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 75214368995659
      // 17: lxor
      // 18: dup2
      // 19: bipush 48
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 16
      // 22: lshl
      // 23: bipush 16
      // 25: lushr
      // 26: lstore 5
      // 28: pop2
      // 29: pop2
      // 2a: aload 0
      // 2b: ldc2_w 7143909597649782565
      // 2e: lload 2
      // 2f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: invokeinterface java/util/Map.size ()I 1
      // 39: anewarray 64
      // 3c: astore 8
      // 3e: ldc2_w 8909072134554052539
      // 41: lload 2
      // 42: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: aload 0
      // 48: ldc2_w 7143909597649782565
      // 4b: lload 2
      // 4c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 56: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 5b: astore 9
      // 5d: astore 7
      // 5f: bipush 0
      // 60: istore 10
      // 62: aload 9
      // 64: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 69: ifeq 83
      // 6c: aload 8
      // 6e: iload 10
      // 70: iinc 10 1
      // 73: aload 9
      // 75: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7a: checkcast com/zelix/ir
      // 7d: aastore
      // 7e: aload 7
      // 80: ifnull 62
      // 83: lload 2
      // 84: lconst_0
      // 85: lcmp
      // 86: iflt 7e
      // 89: new com/zelix/yd
      // 8c: dup
      // 8d: iload 4
      // 8f: i2c
      // 90: lload 5
      // 92: aload 8
      // 94: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // 97: areturn
   }

   public final boolean w(Object[] var1) {
      long var2 = (Long)var1[0];
      hy var4 = (hy)var1[1];
      var2 = j ^ var2;
      return x44.a<"o">(this, -2979941949838860424L, var2).containsKey(var4);
   }

   public Enumeration q(Object[] param1) {
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
      // 0c: getstatic com/zelix/_u4.j J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 35501723811611
      // 17: lxor
      // 18: dup2
      // 19: bipush 48
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 16
      // 22: lshl
      // 23: bipush 16
      // 25: lushr
      // 26: lstore 5
      // 28: pop2
      // 29: pop2
      // 2a: aload 0
      // 2b: getfield com/zelix/_u4.P Ljava/util/Map;
      // 2e: invokeinterface java/util/Map.size ()I 1
      // 33: anewarray 212
      // 36: astore 8
      // 38: aload 0
      // 39: getfield com/zelix/_u4.P Ljava/util/Map;
      // 3c: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 41: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 46: astore 9
      // 48: ldc2_w 9075604024802206187
      // 4b: lload 2
      // 4c: invokedynamic w (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: bipush 0
      // 52: istore 10
      // 54: astore 7
      // 56: aload 9
      // 58: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5d: ifeq 77
      // 60: aload 8
      // 62: iload 10
      // 64: iinc 10 1
      // 67: aload 9
      // 69: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6e: checkcast com/zelix/ig
      // 71: aastore
      // 72: aload 7
      // 74: ifnull 56
      // 77: lload 2
      // 78: lconst_0
      // 79: lcmp
      // 7a: iflt 72
      // 7d: new com/zelix/yd
      // 80: dup
      // 81: iload 4
      // 83: i2c
      // 84: lload 5
      // 86: aload 8
      // 88: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // 8b: areturn
   }

   public final boolean Q(Object[] var1) {
      long var2 = (Long)var1[0];
      hy var4 = (hy)var1[1];
      var2 = j ^ var2;
      return x44.a<"j">(this, -644004726840768795L, var2).containsKey(var4);
   }

   public abstract boolean u(Object[] var1);

   public _u4(pk var1, long var2, List var4, byte var5, _ur var6) {
      long var7 = (var2 << 8 | (long)var5 << 56 >>> 56) ^ j;
      long var9 = var7 ^ 115947202392350L;
      super(var1, var4, var6, var9);
   }

   public Enumeration P(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 13693868086342L;
      long var6 = var2 ^ 51097574984331L;
      long var8 = var2 ^ 27558579080082L;
      int var10 = this.w.size() + this.P.size();
      Object[] var10003 = new Object[]{null, sh.Q(var10, var4)};
      var10003[0] = var8;
      HashSet var11 = x44.a<"p">(var10003, -5080241146562201493L, var2);
      var11.addAll(this.w.keySet());
      var11.addAll(this.P.keySet());
      return x44.a<"p">(new Object[]{var6, var11}, -6838772982383782195L, var2);
   }

   public boolean s(Object[] var1) {
      long var2 = (Long)var1[0];
      hk[] var4 = x44.a<"u">(-3622807700328787551L, var2);

      try {
         int var10000 = x44.a<"i">(this, -2904675891289094807L, var2).size();
         if (var4 != null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"u">(var5, -3550888919637378294L, var2);
      }

      return (boolean)0;
   }

   public Enumeration a(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = j ^ var2;
      long var5 = var2 ^ 87036558594456L;
      return x44.a<"l">(this.L, new Object[]{var5, var4}, 970497633686772142L, var2);
   }

   public final boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = j ^ var2;
      hk[] var4 = x44.a<"w">(8742453671595468107L, var2);

      try {
         int var10000 = x44.a<"k">(this, 7323170606174655572L, var2).size();
         if (var4 != null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"w">(var5, 8814364205952995296L, var2);
      }

      return (boolean)0;
   }

   public Enumeration c(Object[] param1) {
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
      // 0c: getstatic com/zelix/_u4.j J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 122091001483506
      // 17: lxor
      // 18: dup2
      // 19: bipush 48
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 16
      // 22: lshl
      // 23: bipush 16
      // 25: lushr
      // 26: lstore 5
      // 28: pop2
      // 29: pop2
      // 2a: ldc2_w -7918935056447173118
      // 2d: lload 2
      // 2e: invokedynamic v (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 0
      // 34: getfield com/zelix/_u4.w Ljava/util/Map;
      // 37: invokeinterface java/util/Map.size ()I 1
      // 3c: anewarray 212
      // 3f: astore 8
      // 41: astore 7
      // 43: aload 0
      // 44: getfield com/zelix/_u4.w Ljava/util/Map;
      // 47: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 4c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 51: astore 9
      // 53: bipush 0
      // 54: istore 10
      // 56: aload 9
      // 58: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5d: ifeq 77
      // 60: aload 8
      // 62: iload 10
      // 64: iinc 10 1
      // 67: aload 9
      // 69: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6e: checkcast com/zelix/ig
      // 71: aastore
      // 72: aload 7
      // 74: ifnull 56
      // 77: lload 2
      // 78: lconst_0
      // 79: lcmp
      // 7a: iflt 72
      // 7d: new com/zelix/yd
      // 80: dup
      // 81: iload 4
      // 83: i2c
      // 84: lload 5
      // 86: aload 8
      // 88: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // 8b: areturn
   }

   public final Enumeration w(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = j ^ var3;
      long var5 = var3 ^ 96657358259929L;
      return x44.a<"l">(this.L, new Object[]{var5, var2}, 148021332713027997L, var3);
   }

   public Enumeration j(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 23555072385837L;
      long var6 = var2 ^ 60890176175584L;
      long var8 = var2 ^ 36352916729L;
      int var10 = x44.a<"o">(this, -3755946144652660767L, var2).size() + x44.a<"o">(this, -3932020883573072969L, var2).size();
      Object[] var10003 = new Object[]{null, sh.Q(var10, var4)};
      var10003[0] = var8;
      HashSet var11 = x44.a<"s">(var10003, -3597177016651460864L, var2);
      var11.addAll(x44.a<"o">(this, -3755946144652660767L, var2).keySet());
      var11.addAll(x44.a<"o">(this, -3932020883573072969L, var2).keySet());
      return x44.a<"s">(new Object[]{var6, var11}, -2991281664423517786L, var2);
   }

   public final Enumeration x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = j ^ var2;
      long var4 = var2 ^ 21217527473900L;
      return x44.a<"w">(new Object[]{var4, x44.a<"k">(this, -3127332880133266068L, var2).keySet()}, -3643147108883121494L, var2);
   }

   public Enumeration f(Object[] param1) {
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
      // 0c: getstatic com/zelix/_u4.j J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 65995192882836
      // 17: lxor
      // 18: dup2
      // 19: bipush 48
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 16
      // 22: lshl
      // 23: bipush 16
      // 25: lushr
      // 26: lstore 5
      // 28: pop2
      // 29: pop2
      // 2a: ldc2_w -3135603155969685404
      // 2d: lload 2
      // 2e: invokedynamic p (JJ)[Lcom/zelix/hk; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 0
      // 34: ldc2_w -3569755028088578900
      // 37: lload 2
      // 38: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: invokeinterface java/util/Map.size ()I 1
      // 42: anewarray 64
      // 45: astore 8
      // 47: astore 7
      // 49: aload 0
      // 4a: ldc2_w -3569755028088578900
      // 4d: lload 2
      // 4e: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 58: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 5d: astore 9
      // 5f: bipush 0
      // 60: istore 10
      // 62: aload 9
      // 64: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 69: ifeq 83
      // 6c: aload 8
      // 6e: iload 10
      // 70: iinc 10 1
      // 73: aload 9
      // 75: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7a: checkcast com/zelix/ir
      // 7d: aastore
      // 7e: aload 7
      // 80: ifnull 62
      // 83: lload 2
      // 84: lconst_0
      // 85: lcmp
      // 86: ifle 7e
      // 89: new com/zelix/yd
      // 8c: dup
      // 8d: iload 4
      // 8f: i2c
      // 90: lload 5
      // 92: aload 8
      // 94: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // 97: areturn
   }

   public Enumeration K(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 129538151737622L;
      return x44.a<"m">(this.L, new Object[]{var4}, -9038762006470593068L, var2);
   }

   public final boolean d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = j ^ var2;
      hk[] var4 = x44.a<"s">(-4825789009780596449L, var2);

      try {
         int var10000 = x44.a<"o">(this, -4626041104710715888L, var2).size();
         if (var4 != null) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"s">(var5, -4753869679322870860L, var2);
      }

      return (boolean)0;
   }

   public final boolean C(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = j ^ var2;
      long var10001 = var2 ^ 84836441295158L;
      int var5 = (int)((var2 ^ 84836441295158L) >>> 48);
      int var6 = (int)((var2 ^ 84836441295158L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      hk[] var10000 = x44.a<"w">(7832732691039973547L, var2);
      yn var9 = yn.E(var4);
      hk[] var8 = var10000;

      label27: {
         try {
            var14 = var9;
            if (var8 != null) {
               break label27;
            }

            if (var9 == null) {
               return false;
            }
         } catch (gj var12) {
            throw x44.a<"w">(var12, 8048761712015841792L, var2);
         }

         var14 = var9;
      }

      hy var10 = var14.v((short)var5, var6, (short)var7);

      try {
         if (var10 != null) {
            return x44.a<"k">(this, 8088811778027831732L, var2).containsKey(var10);
         }
      } catch (gj var11) {
         throw x44.a<"w">(var11, 8048761712015841792L, var2);
      }

      return false;
   }

   public boolean j(Object[] var1) {
      long var3 = (Long)var1[0];
      ig var2 = (ig)var1[1];
      return this.w.containsKey(var2);
   }

   public boolean Z(Object[] var1) {
      long var3 = (Long)var1[0];
      ir var2 = (ir)var1[1];
      return x44.a<"k">(this, -7794574151322126379L, var3).containsKey(var2);
   }

   private static gj b(gj var0) {
      return var0;
   }
}
