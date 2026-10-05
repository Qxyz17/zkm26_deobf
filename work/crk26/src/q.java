package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class q implements Comparator {
   final lk6 a;
   private static final long b = prr.a(4614481536101335891L, 6078782562646332729L, MethodHandles.lookup().lookupClass()).a(66641889607993L);

   q(lk6 var1) {
      this.a = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = b ^ 17715581464768L;
      long var5 = var3 ^ 132889445953328L;
      return m44.a<"u">(this, new Object[]{var5, (_f)var1, (_f)var2}, -1611487724341513282L, var3);
   }

   public int t(Object[] var1) {
      long var2 = (Long)var1[0];
      _f var5 = (_f)var1[1];
      _f var4 = (_f)var1[2];
      var2 = b ^ var2;
      long var6 = var2 ^ 96174330170809L;
      return var5.j(var6).compareTo(var4.j(var6));
   }
}
