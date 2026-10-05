package com.zelix;

import java.lang.invoke.MethodHandles;

public class cc extends jf {
   private static final long a = ess.a(7090626953865551149L, -6714565789860717273L, MethodHandles.lookup().lookupClass()).a(9786677302480L);

   public kd X(Object[] param1) {
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
      // 0c: getstatic com/zelix/cc.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 2733149084076
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 6756329408741604477
      // 1e: lload 2
      // 1f: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnonnull 66
      // 2c: lload 4
      // 2e: bipush 1
      // 2f: anewarray 9
      // 32: dup_x2
      // 33: dup_x2
      // 34: pop
      // 35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38: bipush 0
      // 39: swap
      // 3a: aastore
      // 3b: ldc2_w 4619814461659141238
      // 3e: lload 2
      // 3f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: ifle 6a
      // 47: goto 54
      // 4a: ldc2_w 6904749233391145713
      // 4d: lload 2
      // 4e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: bipush 0
      // 56: invokevirtual com/zelix/cc.e (I)Lcom/zelix/_za;
      // 59: goto 66
      // 5c: ldc2_w 6904749233391145713
      // 5f: lload 2
      // 60: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: checkcast com/zelix/kd
      // 69: areturn
      // 6a: aconst_null
      // 6b: areturn
   }

   public cc(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 28370249660095L;
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/_za
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 2
      // 1a: pop
      // 1b: lload 3
      // 1c: dup2
      // 1d: ldc2_w 0
      // 20: lxor
      // 21: lstore 6
      // 23: dup2
      // 24: ldc2_w 134528422017690
      // 27: lxor
      // 28: lstore 8
      // 2a: pop2
      // 2b: aload 0
      // 2c: lload 8
      // 2e: bipush 1
      // 2f: anewarray 9
      // 32: dup_x2
      // 33: dup_x2
      // 34: pop
      // 35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38: bipush 0
      // 39: swap
      // 3a: aastore
      // 3b: ldc2_w 7145691849331111744
      // 3e: lload 3
      // 3f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: istore 11
      // 46: ldc2_w 9148277501292601163
      // 49: lload 3
      // 4a: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: bipush 0
      // 50: istore 12
      // 52: astore 10
      // 54: iload 12
      // 56: iload 11
      // 58: if_icmpge 8d
      // 5b: aload 0
      // 5c: iload 12
      // 5e: invokevirtual com/zelix/cc.e (I)Lcom/zelix/_za;
      // 61: lload 6
      // 63: aload 0
      // 64: aload 2
      // 65: bipush 3
      // 66: anewarray 9
      // 69: dup_x1
      // 6a: swap
      // 6b: bipush 2
      // 6c: swap
      // 6d: aastore
      // 6e: dup_x1
      // 6f: swap
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x2
      // 74: dup_x2
      // 75: pop
      // 76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w 8818198965911889370
      // 7f: lload 3
      // 80: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: iinc 12 1
      // 88: aload 10
      // 8a: ifnull 54
      // 8d: lload 3
      // 8e: lconst_0
      // 8f: lcmp
      // 90: iflt 88
      // 93: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
