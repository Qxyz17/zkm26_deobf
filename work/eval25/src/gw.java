package com.zelix;

import java.lang.invoke.MethodHandles;

public class gw extends zw {
   private static final long b = ess.a(3411685111003008353L, 8358113828693070704L, MethodHandles.lookup().lookupClass()).a(15031531166313L);

   public void t(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/_za
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 2
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 134528422017690
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: ldc2_w 9148277501292601163
      // 28: lload 4
      // 2a: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 0
      // 30: lload 6
      // 32: bipush 1
      // 33: anewarray 72
      // 36: dup_x2
      // 37: dup_x2
      // 38: pop
      // 39: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c: bipush 0
      // 3d: swap
      // 3e: aastore
      // 3f: ldc2_w 7145691849331111744
      // 42: lload 4
      // 44: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: istore 9
      // 4b: astore 8
      // 4d: iload 9
      // 4f: bipush 1
      // 50: if_icmpne 9e
      // 53: aload 0
      // 54: bipush 0
      // 55: invokevirtual com/zelix/gw.e (I)Lcom/zelix/_za;
      // 58: astore 10
      // 5a: aload 10
      // 5c: aload 8
      // 5e: ifnonnull 85
      // 61: instanceof com/zelix/g7
      // 64: ifeq 9e
      // 67: goto 75
      // 6a: ldc2_w 7136648553666731106
      // 6d: lload 4
      // 6f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 10
      // 77: goto 85
      // 7a: ldc2_w 7136648553666731106
      // 7d: lload 4
      // 7f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: checkcast com/zelix/g7
      // 88: astore 11
      // 8a: aload 0
      // 8b: aload 11
      // 8d: bipush 0
      // 8e: anewarray 72
      // 91: ldc2_w 7328816409459435145
      // 94: lload 4
      // 96: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: putfield com/zelix/gw.a Ljava/lang/String;
      // 9e: return
   }

   public gw(long var1, int var3) {
      var1 = b ^ var1;
      long var4 = var1 ^ 111033142199305L;
      super(var3, var4);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
