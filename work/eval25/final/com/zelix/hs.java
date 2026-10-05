package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class hs {
   protected Object P;
   private static final long a = ess.a(-4114791845838532772L, 3030259235132827167L, MethodHandles.lookup().lookupClass()).a(107316234941033L);

   public abstract void t(Object[] var1);

   @Override
   public String toString() {
      long var1 = a ^ 37790709348550L;
      return x44.a<"i">(this, 1415374889572258273L, var1).toString();
   }

   public hs(long var1, Object var3) {
      var1 = a ^ var1;
      super();
      x44.a<"t">(this, var3, -333716133354751717L, var1);
   }

   @Override
   public int hashCode() {
      long var1 = a ^ 113474914452173L;
      return x44.a<"j">(this, -1608015293478622230L, var1).hashCode();
   }

   public Object z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 5070283126550299672L, var2);
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
      // 00: getstatic com/zelix/hs.a J
      // 03: ldc2_w 103205361247213
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w 682815152374423894
      // 0b: lload 2
      // 0c: invokedynamic v (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: astore 4
      // 13: aload 1
      // 14: instanceof com/zelix/hs
      // 17: aload 4
      // 19: ifnull 52
      // 1c: ifeq 51
      // 1f: goto 2c
      // 22: ldc2_w 1042079944473269791
      // 25: lload 2
      // 26: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 0
      // 2d: ldc2_w 616734166848719562
      // 30: lload 2
      // 31: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 1
      // 37: checkcast com/zelix/hs
      // 3a: ldc2_w 616734166848719562
      // 3d: lload 2
      // 3e: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 46: ireturn
      // 47: ldc2_w 1042079944473269791
      // 4a: lload 2
      // 4b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: bipush 0
      // 52: ireturn
   }

   private static gj b(gj var0) {
      return var0;
   }
}
