package com.zelix;

public class yb extends y1 {
   public void h(rp param1, aa param2, long param3) {
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
      // 00: lload 3
      // 01: dup2
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 5
      // 08: dup2
      // 09: ldc2_w 1133881831266
      // 0c: lxor
      // 0d: lstore 7
      // 0f: pop2
      // 10: ldc2_w 8293401855148283125
      // 13: lload 3
      // 14: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: aload 0
      // 1a: lload 7
      // 1c: invokevirtual com/zelix/yb.u (J)I
      // 1f: istore 10
      // 21: istore 9
      // 23: bipush 0
      // 24: istore 11
      // 26: iload 11
      // 28: iload 10
      // 2a: if_icmpge 44
      // 2d: aload 0
      // 2e: iload 11
      // 30: invokevirtual com/zelix/yb.a (I)Lcom/zelix/rp;
      // 33: aload 0
      // 34: aload 2
      // 35: lload 5
      // 37: invokeinterface com/zelix/rp.h (Lcom/zelix/rp;Lcom/zelix/aa;J)V 5
      // 3c: iinc 11 1
      // 3f: iload 9
      // 41: ifeq 26
      // 44: lload 3
      // 45: lconst_0
      // 46: lcmp
      // 47: ifle 3f
      // 4a: return
   }

   public yb(int var1) {
      super(var1);
   }
}
