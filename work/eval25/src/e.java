package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class e {
   boolean H;
   int d;
   String a;
   private static final long b = ess.a(-8872897246351996821L, 1338011161840216681L, MethodHandles.lookup().lookupClass()).a(152549998683144L);

   public boolean b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"n">(this, 1765246986915568824L, var2);
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
      // 00: getstatic com/zelix/e.b J
      // 03: ldc2_w 47172650731327
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -4848573040251349085
      // 0b: lload 2
      // 0c: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/e
      // 17: iload 4
      // 19: ifne 52
      // 1c: ifeq 51
      // 1f: goto 2c
      // 22: ldc2_w -4823195383254703434
      // 25: lload 2
      // 26: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 0
      // 2d: ldc2_w -4793378893563549271
      // 30: lload 2
      // 31: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 1
      // 37: checkcast com/zelix/e
      // 3a: ldc2_w -4793378893563549271
      // 3d: lload 2
      // 3e: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 46: ireturn
      // 47: ldc2_w -4823195383254703434
      // 4a: lload 2
      // 4b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: bipush 0
      // 52: ireturn
   }

   @Override
   public int hashCode() {
      long var1 = b ^ 16520290219482L;
      return x44.a<"j">(this, 1125718125511875404L, var1).hashCode();
   }

   private static gj a(gj var0) {
      return var0;
   }
}
