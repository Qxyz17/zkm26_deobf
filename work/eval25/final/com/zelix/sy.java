package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class sy implements Comparator {
   final _88 U;
   private static final long a = ess.a(2024926888763309996L, 2634361502022782896L, MethodHandles.lookup().lookupClass()).a(4753779496369L);

   sy(_88 var1) {
      this.U = var1;
   }

   public int K(Object[] var1) {
      long var4 = (Long)var1[0];
      hy var3 = (hy)var1[1];
      hy var2 = (hy)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 116703843228649L;
      return var3.o(var6).compareTo(var2.o(var6));
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 96171769863450L;
      long var5 = var3 ^ 117431551355500L;
      return x44.a<"k">(this, new Object[]{var5, (hy)var1, (hy)var2}, -7924979805042271297L, var3);
   }
}
