package com.zelix;

import java.lang.invoke.MethodHandles;

public class lut extends lmc {
   final mq p;
   private static final long a = prr.a(-4611757425549312093L, -5195636258093770376L, MethodHandles.lookup().lookupClass()).a(5170298755067L);

   public void k(Object[] var1) {
      Integer var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 63854753604337L;
      m44.a<"u">(m44.a<"t">(this, 2132322260155948849L, var3), new Object[]{var5, var2}, 103355650939552904L, var3);
   }

   public void h(Object[] var1) {
      long var3 = (Long)var1[0];
      Object var2 = var1[1];
      long var5 = var3 ^ 107857835388520L;
      m44.a<"u">(this, new Object[]{(Integer)var2, var5}, 2634762821038497227L, var3);
   }

   public void r(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 40661218417077L;
      m44.a<"w">(m44.a<"v">(this, 5876558301295776555L, var2), new Object[]{var4}, 6119582912316436286L, var2);
   }

   lut(mq var1) {
      this.p = var1;
   }
}
