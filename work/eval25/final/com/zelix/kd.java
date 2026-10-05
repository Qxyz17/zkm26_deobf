package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;

public abstract class kd extends ks {
   private static final long e = ess.a(-1421205644044661838L, -9141148736249223297L, MethodHandles.lookup().lookupClass()).a(147516850764738L);

   public final Enumeration U(Object[] param1) {
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
      // 0c: getstatic com/zelix/kd.e J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 64269841182861
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
      // 2b: ldc2_w 3948929274904592126
      // 2e: lload 2
      // 2f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: invokeinterface java/util/List.size ()I 1
      // 39: istore 8
      // 3b: ldc2_w 3660687986452271987
      // 3e: lload 2
      // 3f: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: iload 8
      // 46: anewarray 57
      // 49: astore 9
      // 4b: astore 7
      // 4d: bipush 0
      // 4e: istore 10
      // 50: iload 10
      // 52: iload 8
      // 54: if_icmpge 78
      // 57: aload 9
      // 59: iload 10
      // 5b: aload 0
      // 5c: ldc2_w 3948929274904592126
      // 5f: lload 2
      // 60: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: iload 10
      // 67: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6c: checkcast com/zelix/za
      // 6f: aastore
      // 70: iinc 10 1
      // 73: aload 7
      // 75: ifnull 50
      // 78: lload 2
      // 79: lconst_0
      // 7a: lcmp
      // 7b: ifle 73
      // 7e: new com/zelix/yd
      // 81: dup
      // 82: iload 4
      // 84: i2c
      // 85: lload 5
      // 87: aload 9
      // 89: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // 8c: areturn
   }

   public kd(int var1, long var2) {
      var2 = e ^ var2;
      long var4 = var2 ^ 128646859004792L;
      super(var1, var4);
   }
}
