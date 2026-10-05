package com.zelix;

import java.lang.invoke.MethodHandles;

public class ce extends jf {
   private static final long a = ess.a(6751193715958403705L, 992494632246083199L, MethodHandles.lookup().lookupClass()).a(48302603067139L);

   public ce(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 111330050863791L;
      super(var4, var3);
   }

   public void t(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/_za
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 3
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: dup2
      // 25: ldc2_w 134528422017690
      // 28: lxor
      // 29: lstore 8
      // 2b: pop2
      // 2c: ldc2_w 9148277501292601163
      // 2f: lload 4
      // 31: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 0
      // 37: lload 8
      // 39: bipush 1
      // 3a: anewarray 74
      // 3d: dup_x2
      // 3e: dup_x2
      // 3f: pop
      // 40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43: bipush 0
      // 44: swap
      // 45: aastore
      // 46: ldc2_w 7145691849331111744
      // 49: lload 4
      // 4b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: istore 11
      // 52: astore 10
      // 54: bipush 0
      // 55: istore 12
      // 57: iload 12
      // 59: iload 11
      // 5b: if_icmpge 91
      // 5e: aload 0
      // 5f: iload 12
      // 61: invokevirtual com/zelix/ce.e (I)Lcom/zelix/_za;
      // 64: lload 6
      // 66: aload 0
      // 67: aload 3
      // 68: bipush 3
      // 69: anewarray 74
      // 6c: dup_x1
      // 6d: swap
      // 6e: bipush 2
      // 6f: swap
      // 70: aastore
      // 71: dup_x1
      // 72: swap
      // 73: bipush 1
      // 74: swap
      // 75: aastore
      // 76: dup_x2
      // 77: dup_x2
      // 78: pop
      // 79: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7c: bipush 0
      // 7d: swap
      // 7e: aastore
      // 7f: ldc2_w 8818198965911889370
      // 82: lload 4
      // 84: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: iinc 12 1
      // 8c: aload 10
      // 8e: ifnull 57
      // 91: lload 4
      // 93: lconst_0
      // 94: lcmp
      // 95: iflt 8c
      // 98: return
   }

   public kd Z(Object[] param1) {
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
      // 0c: getstatic com/zelix/ce.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 36297903380775
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 2110058144365493494
      // 1e: lload 2
      // 1f: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnonnull 66
      // 2c: lload 4
      // 2e: bipush 1
      // 2f: anewarray 74
      // 32: dup_x2
      // 33: dup_x2
      // 34: pop
      // 35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38: bipush 0
      // 39: swap
      // 3a: aastore
      // 3b: ldc2_w 42717923850425597
      // 3e: lload 2
      // 3f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: ifle 6a
      // 47: goto 54
      // 4a: ldc2_w 2188875593407229453
      // 4d: lload 2
      // 4e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: bipush 0
      // 56: invokevirtual com/zelix/ce.e (I)Lcom/zelix/_za;
      // 59: goto 66
      // 5c: ldc2_w 2188875593407229453
      // 5f: lload 2
      // 60: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: checkcast com/zelix/kd
      // 69: areturn
      // 6a: aconst_null
      // 6b: areturn
   }

   private static gj a(gj var0) {
      return var0;
   }
}
