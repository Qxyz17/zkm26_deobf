package com.zelix;

import java.lang.invoke.MethodHandles;

public class _xa extends _xp {
   boolean e;
   _op j;
   private static final long b = ess.a(-9030992875293262569L, 7660402532012179365L, MethodHandles.lookup().lookupClass()).a(242402129703572L);

   public void X(Object[] param1) {
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
      // 013: getstatic com/zelix/_xa.b J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: ldc2_w -7026419642597345944
      // 01c: lload 3
      // 01d: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: istore 5
      // 024: aload 0
      // 025: getfield com/zelix/_xa.J Ljava/util/List;
      // 028: invokeinterface java/util/List.size ()I 1
      // 02d: iload 5
      // 02f: ifne 043
      // 032: ifne 08d
      // 035: goto 042
      // 038: ldc2_w -9192299685753966232
      // 03b: lload 3
      // 03c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: athrow
      // 042: bipush 0
      // 043: istore 6
      // 045: iload 6
      // 047: aload 2
      // 048: invokeinterface java/util/List.size ()I 1
      // 04d: if_icmpge 088
      // 050: aload 0
      // 051: getfield com/zelix/_xa.J Ljava/util/List;
      // 054: aload 2
      // 055: iload 6
      // 057: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 05c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 061: pop
      // 062: iinc 6 1
      // 065: iload 5
      // 067: lload 3
      // 068: lconst_0
      // 069: lcmp
      // 06a: iflt 072
      // 06d: ifne 147
      // 070: iload 5
      // 072: ifeq 045
      // 075: lload 3
      // 076: lconst_0
      // 077: lcmp
      // 078: ifle 065
      // 07b: goto 088
      // 07e: ldc2_w -9192299685753966232
      // 081: lload 3
      // 082: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: iload 5
      // 08a: ifeq 147
      // 08d: new java/util/ArrayList
      // 090: dup
      // 091: aload 0
      // 092: getfield com/zelix/_xa.J Ljava/util/List;
      // 095: invokeinterface java/util/List.size ()I 1
      // 09a: aload 2
      // 09b: invokeinterface java/util/List.size ()I 1
      // 0a0: iadd
      // 0a1: invokespecial java/util/ArrayList.<init> (I)V
      // 0a4: astore 6
      // 0a6: bipush 0
      // 0a7: istore 7
      // 0a9: iload 7
      // 0ab: aload 2
      // 0ac: invokeinterface java/util/List.size ()I 1
      // 0b1: if_icmpge 0ea
      // 0b4: aload 6
      // 0b6: aload 2
      // 0b7: iload 7
      // 0b9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0be: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c3: pop
      // 0c4: iinc 7 1
      // 0c7: iload 5
      // 0c9: lload 3
      // 0ca: lconst_0
      // 0cb: lcmp
      // 0cc: ifle 0ef
      // 0cf: ifne 0ed
      // 0d2: iload 5
      // 0d4: ifeq 0a9
      // 0d7: lload 3
      // 0d8: lconst_0
      // 0d9: lcmp
      // 0da: ifle 0c7
      // 0dd: goto 0ea
      // 0e0: ldc2_w -9192299685753966232
      // 0e3: lload 3
      // 0e4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: bipush 0
      // 0eb: istore 7
      // 0ed: iload 7
      // 0ef: lload 3
      // 0f0: lconst_0
      // 0f1: lcmp
      // 0f2: iflt 119
      // 0f5: aload 0
      // 0f6: getfield com/zelix/_xa.J Ljava/util/List;
      // 0f9: invokeinterface java/util/List.size ()I 1
      // 0fe: if_icmpge 141
      // 101: aload 6
      // 103: aload 0
      // 104: getfield com/zelix/_xa.J Ljava/util/List;
      // 107: iload 7
      // 109: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 10e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 113: pop
      // 114: iinc 7 1
      // 117: iload 5
      // 119: ifne 147
      // 11c: goto 129
      // 11f: ldc2_w -9192299685753966232
      // 122: lload 3
      // 123: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: athrow
      // 129: iload 5
      // 12b: ifeq 0ed
      // 12e: lload 3
      // 12f: lconst_0
      // 130: lcmp
      // 131: iflt 0ed
      // 134: goto 141
      // 137: ldc2_w -9192299685753966232
      // 13a: lload 3
      // 13b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: aload 0
      // 142: aload 6
      // 144: putfield com/zelix/_xa.J Ljava/util/List;
      // 147: return
   }

   public _xa(boolean var1, _op var2, _og var3, int var4, int var5, long var6, int var8) {
      var6 = b ^ var6;
      long var9 = var6 ^ 75517768825568L;
      super(var3, var4, var5, var8, var9);
      this.e = var1;
      x44.a<"r">(this, var2, 6834670874147907023L, var6);
   }

   public void a(Object[] param1) {
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
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/_xa.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: aload 4
      // 1c: invokeinterface java/util/List.size ()I 1
      // 21: istore 6
      // 23: ldc2_w -4472828696678421768
      // 26: lload 2
      // 27: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: bipush 0
      // 2d: istore 7
      // 2f: istore 5
      // 31: iload 7
      // 33: iload 6
      // 35: if_icmpge 53
      // 38: aload 0
      // 39: getfield com/zelix/_xa.J Ljava/util/List;
      // 3c: aload 4
      // 3e: iload 7
      // 40: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 45: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4a: pop
      // 4b: iinc 7 1
      // 4e: iload 5
      // 50: ifeq 31
      // 53: lload 2
      // 54: lconst_0
      // 55: lcmp
      // 56: ifle 4e
      // 59: return
   }

   public boolean I(Object[] var1) {
      return this.e;
   }

   public _op X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"l">(this, 4697452337162975782L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
