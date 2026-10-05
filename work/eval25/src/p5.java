package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.BitSet;

public class p5 extends BitSet {
   private _op U;
   private static final long a = ess.a(-3393724955150509984L, 4586211018588499489L, MethodHandles.lookup().lookupClass()).a(123325102092459L);

   public p5(int var1, _op var2, int var3, byte var4, int var5) {
      long var6 = ((long)var1 << 32 | (long)var4 << 56 >>> 32 | (long)var5 << 40 >>> 40) ^ a;
      super(var3);
      x44.a<"q">(this, var2, -910786477931809270L, var6);
   }

   public _op p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 221829074746197570L, var2);
   }

   public boolean O(Object[] var1) {
      p5 var4 = (p5)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;

      try {
         if (x44.a<"j">(this, 1270017864969540854L, var2) == x44.a<"j">(var4, 1270017864969540854L, var2)) {
            return true;
         }
      } catch (gj var5) {
         throw x44.a<"v">(var5, 780989318070293064L, var2);
      }

      return false;
   }

   @Override
   public Object clone() {
      long var1 = a ^ 16842003605068L;
      Object var3 = null;
      var3 = (p5)super.clone();
      x44.a<"r">(var3, x44.a<"m">(this, 627998726999559649L, var1), 627998726999559649L, var1);
      return var3;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
