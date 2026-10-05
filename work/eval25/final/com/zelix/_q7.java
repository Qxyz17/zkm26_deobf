package com.zelix;

import java.lang.invoke.MethodHandles;

public class _q7 extends _ni implements _zs {
   private static final long a = ess.a(5948654740796598239L, -1564265210513306494L, MethodHandles.lookup().lookupClass()).a(191724433992746L);

   public _q7(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 104230895698347L;
      super(var4, var3);
   }

   public void K(Object[] param1) {
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
      // 0f: checkcast com/zelix/az
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_uu
      // 19: astore 3
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: dup2
      // 25: ldc2_w 101216835141935
      // 28: lxor
      // 29: lstore 8
      // 2b: dup2
      // 2c: ldc2_w 89968223186826
      // 2f: lxor
      // 30: lstore 10
      // 32: pop2
      // 33: ldc2_w 3018414783042270147
      // 36: lload 4
      // 38: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: aload 0
      // 3e: lload 8
      // 40: bipush 1
      // 41: anewarray 50
      // 44: dup_x2
      // 45: dup_x2
      // 46: pop
      // 47: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a: bipush 0
      // 4b: swap
      // 4c: aastore
      // 4d: ldc2_w 3459742712771822671
      // 50: lload 4
      // 52: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: istore 13
      // 59: istore 12
      // 5b: bipush 0
      // 5c: istore 14
      // 5e: iload 14
      // 60: iload 13
      // 62: if_icmpge b6
      // 65: aload 0
      // 66: iload 14
      // 68: lload 10
      // 6a: bipush 2
      // 6b: anewarray 50
      // 6e: dup_x2
      // 6f: dup_x2
      // 70: pop
      // 71: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 74: bipush 1
      // 75: swap
      // 76: aastore
      // 77: dup_x1
      // 78: swap
      // 79: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7c: bipush 0
      // 7d: swap
      // 7e: aastore
      // 7f: ldc2_w 3156618655040194173
      // 82: lload 4
      // 84: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: lload 6
      // 8b: aload 0
      // 8c: aload 3
      // 8d: bipush 3
      // 8e: anewarray 50
      // 91: dup_x1
      // 92: swap
      // 93: bipush 2
      // 94: swap
      // 95: aastore
      // 96: dup_x1
      // 97: swap
      // 98: bipush 1
      // 99: swap
      // 9a: aastore
      // 9b: dup_x2
      // 9c: dup_x2
      // 9d: pop
      // 9e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a1: bipush 0
      // a2: swap
      // a3: aastore
      // a4: ldc2_w 3570806773825883371
      // a7: lload 4
      // a9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: iinc 14 1
      // b1: iload 12
      // b3: ifeq 5e
      // b6: lload 4
      // b8: lconst_0
      // b9: lcmp
      // ba: iflt b1
      // bd: return
   }

   public boolean M(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 0L;
      long var7 = var2 ^ 133572226208206L;
      _q2 var9 = (_q2)x44.a<"k">(this, new Object[]{var7}, -6933460736758437375L, var2);
      return x44.a<"k">(var9, new Object[]{var5, var4}, -7225998457738261930L, var2);
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 0L;
      long var7 = var2 ^ 53054620481411L;
      _q2 var9 = (_q2)x44.a<"n">(this, new Object[]{var7}, 8757864149158186060L, var2);
      return x44.a<"n">(var9, new Object[]{var5, var4}, 7327720030810465155L, var2);
   }
}
