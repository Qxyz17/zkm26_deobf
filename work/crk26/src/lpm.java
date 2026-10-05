package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;

public abstract class lpm extends lpw {
   private static final long g = prr.a(4607061708480299692L, 8234891998630342983L, MethodHandles.lookup().lookupClass()).a(72233855306784L);

   public lpm(int var1, long var2) {
      var2 = g ^ var2;
      long var4 = var2 ^ 84193290888990L;
      super(var1, var4);
   }

   public final Enumeration g(Object[] param1) {
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
      // 0c: getstatic com/zelix/lpm.g J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 102155737004490
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 186210485228503635
      // 1e: lload 2
      // 1f: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: ldc2_w 1745121990176768293
      // 28: lload 2
      // 29: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: invokeinterface java/util/List.size ()I 1
      // 33: istore 7
      // 35: iload 7
      // 37: anewarray 4
      // 3a: astore 8
      // 3c: bipush 0
      // 3d: istore 9
      // 3f: istore 6
      // 41: iload 9
      // 43: iload 7
      // 45: if_icmpge 69
      // 48: aload 8
      // 4a: iload 9
      // 4c: aload 0
      // 4d: ldc2_w 1745121990176768293
      // 50: lload 2
      // 51: invokedynamic s (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: iload 9
      // 58: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5d: checkcast com/zelix/ltv
      // 60: aastore
      // 61: iinc 9 1
      // 64: iload 6
      // 66: ifne 41
      // 69: lload 2
      // 6a: lconst_0
      // 6b: lcmp
      // 6c: iflt 64
      // 6f: new com/zelix/e4
      // 72: dup
      // 73: lload 4
      // 75: aload 8
      // 77: invokespecial com/zelix/e4.<init> (J[Ljava/lang/Object;)V
      // 7a: areturn
   }
}
