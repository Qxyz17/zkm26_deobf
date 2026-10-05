package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class lok implements Comparator {
   final lk6 v;
   private static final long a = prr.a(-8917916907451163049L, 3685219068059665181L, MethodHandles.lookup().lookupClass()).a(145283352269759L);

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 135018679820866L;
      long var5 = var3 ^ 128728429085228L;
      return m44.a<"v">(this, new Object[]{var5, (_f)var1, (_f)var2}, -2237770905257740069L, var3);
   }

   lok(lk6 var1) {
      this.v = var1;
   }

   public int Y(Object[] var1) {
      long var4 = (Long)var1[0];
      _f var3 = (_f)var1[1];
      _f var2 = (_f)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 53222198391335L;
      return var3.j(var6).compareTo(var2.j(var6));
   }
}
