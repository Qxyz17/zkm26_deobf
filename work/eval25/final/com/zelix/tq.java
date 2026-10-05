package com.zelix;

import java.lang.invoke.MethodHandles;

public class tq {
   private final hz T;
   private final i8 h;
   private final int e;
   private static final long a = ess.a(4973300064307593903L, 3019439031692452869L, MethodHandles.lookup().lookupClass()).a(162509172740219L);

   public String X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 139309179356548L;
      long var6 = var2 ^ 48631881231402L;
      return this.h.d(var4).o(var6);
   }

   public i8 x() {
      return this.h;
   }

   public String t(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 113298912952422L;
      return this.h.w(var4);
   }

   public tq(i8 var1, hz var2) {
      this.h = var1;
      this.T = var2;
      this.e = var1.hashCode() ^ var2.hashCode();
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/tq.a J
      // 03: ldc2_w 49977671982076
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 4457080850194369968
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/tq
      // 17: iload 4
      // 19: ifeq 7a
      // 1c: ifeq 79
      // 1f: goto 2c
      // 22: ldc2_w 2325243105820462412
      // 25: lload 2
      // 26: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/tq
      // 30: astore 5
      // 32: aload 0
      // 33: iload 4
      // 35: ifeq 5e
      // 38: getfield com/zelix/tq.h Lcom/zelix/i8;
      // 3b: aload 5
      // 3d: getfield com/zelix/tq.h Lcom/zelix/i8;
      // 40: if_acmpne 77
      // 43: goto 50
      // 46: ldc2_w 2325243105820462412
      // 49: lload 2
      // 4a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 0
      // 51: goto 5e
      // 54: ldc2_w 2325243105820462412
      // 57: lload 2
      // 58: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: getfield com/zelix/tq.T Lcom/zelix/hz;
      // 61: aload 5
      // 63: getfield com/zelix/tq.T Lcom/zelix/hz;
      // 66: if_acmpne 77
      // 69: bipush 1
      // 6a: goto 78
      // 6d: ldc2_w 2325243105820462412
      // 70: lload 2
      // 71: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: athrow
      // 77: bipush 0
      // 78: ireturn
      // 79: bipush 0
      // 7a: ireturn
   }

   public hz H(Object[] var1) {
      return this.T;
   }

   @Override
   public int hashCode() {
      return this.e;
   }

   public String v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 56409971157557L;
      long var6 = var2 ^ 48336377294250L;
      return this.h.d(var4).c(var6);
   }

   public boolean p(Object[] var1) {
      return this.h.k();
   }

   public String z(Object[] var1) {
      return this.h.H();
   }

   public boolean K() {
      return this.h.K();
   }

   private static gj a(gj var0) {
      return var0;
   }
}
