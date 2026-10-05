package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class _fl implements Comparator {
   final _88 M;
   private static final long a = ess.a(3499208773962716858L, 7768529077846413367L, MethodHandles.lookup().lookupClass()).a(265946351062574L);

   public int K(Object[] var1) {
      hy var3 = (hy)var1[0];
      hy var2 = (hy)var1[1];
      long var4 = (Long)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 41830844567021L;
      return var3.o(var6).compareTo(var2.o(var6));
   }

   _fl(_88 var1) {
      this.M = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 116973637972102L;
      long var5 = var3 ^ 30746099438068L;
      return x44.a<"o">(this, new Object[]{(hy)var1, (hy)var2, var5}, -8453851399539805331L, var3);
   }
}
