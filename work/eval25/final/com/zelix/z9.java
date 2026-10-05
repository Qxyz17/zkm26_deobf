package com.zelix;

import java.lang.invoke.MethodHandles;

public class z9 extends jf {
   private static final long a = ess.a(-7661789995456254571L, 3852131347866729319L, MethodHandles.lookup().lookupClass()).a(176682588511310L);

   public kd M(Object[] param1) {
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
      // 0c: getstatic com/zelix/z9.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 81030819407768
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2020139298690121143
      // 1e: lload 2
      // 1f: invokedynamic s (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnonnull 66
      // 2c: lload 4
      // 2e: bipush 1
      // 2f: anewarray 71
      // 32: dup_x2
      // 33: dup_x2
      // 34: pop
      // 35: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 38: bipush 0
      // 39: swap
      // 3a: aastore
      // 3b: ldc2_w -132668135974999486
      // 3e: lload 2
      // 3f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: ifle 6a
      // 47: goto 54
      // 4a: ldc2_w -2297016884671043991
      // 4d: lload 2
      // 4e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: bipush 0
      // 56: invokevirtual com/zelix/z9.e (I)Lcom/zelix/_za;
      // 59: goto 66
      // 5c: ldc2_w -2297016884671043991
      // 5f: lload 2
      // 60: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: checkcast com/zelix/kd
      // 69: areturn
      // 6a: aconst_null
      // 6b: areturn
   }

   public z9(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 86753408762276L;
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
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/_za
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 4
      // 1b: pop
      // 1c: lload 2
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
      // 2f: lload 2
      // 30: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 0
      // 36: lload 8
      // 38: bipush 1
      // 39: anewarray 71
      // 3c: dup_x2
      // 3d: dup_x2
      // 3e: pop
      // 3f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42: bipush 0
      // 43: swap
      // 44: aastore
      // 45: ldc2_w 7145691849331111744
      // 48: lload 2
      // 49: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: istore 11
      // 50: bipush 0
      // 51: istore 12
      // 53: astore 10
      // 55: iload 12
      // 57: iload 11
      // 59: if_icmpge 8f
      // 5c: aload 0
      // 5d: iload 12
      // 5f: invokevirtual com/zelix/z9.e (I)Lcom/zelix/_za;
      // 62: lload 6
      // 64: aload 0
      // 65: aload 4
      // 67: bipush 3
      // 68: anewarray 71
      // 6b: dup_x1
      // 6c: swap
      // 6d: bipush 2
      // 6e: swap
      // 6f: aastore
      // 70: dup_x1
      // 71: swap
      // 72: bipush 1
      // 73: swap
      // 74: aastore
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w 8818198965911889370
      // 81: lload 2
      // 82: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 12 1
      // 8a: aload 10
      // 8c: ifnull 55
      // 8f: lload 2
      // 90: lconst_0
      // 91: lcmp
      // 92: iflt 8a
      // 95: return
   }

   private static gj a(gj var0) {
      return var0;
   }
}
