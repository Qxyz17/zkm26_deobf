package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class _8v implements Comparator {
   private static final long a = ess.a(6942590536617668210L, -1929890754623742555L, MethodHandles.lookup().lookupClass()).a(44146477590471L);

   _8v() {
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 96120030176799L;
      long var5 = var3 ^ 29844641690227L;
      return x44.a<"m">(this, new Object[]{var5, (ig)var1, (ig)var2}, -7594493145502273873L, var3);
   }

   public int q(Object[] var1) {
      long var2 = (Long)var1[0];
      ig var5 = (ig)var1[1];
      ig var4 = (ig)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 110822507518632L;
      String var8 = var5.t(var6) + var5.H();
      String var9 = var4.t(var6) + var4.H();
      return var8.compareTo(var9);
   }
}
