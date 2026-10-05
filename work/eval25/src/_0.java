package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class _0 implements Comparator {
   final pk e;
   private static final long a = ess.a(-4564895721777645765L, 3324417131107749490L, MethodHandles.lookup().lookupClass()).a(63770778140451L);

   _0(pk var1) {
      this.e = var1;
   }

   public int I(Object[] var1) {
      wo var3 = (wo)var1[0];
      wo var2 = (wo)var1[1];
      return (Integer)var3.G() - (Integer)var2.G();
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 90161611085664L;
      return x44.a<"o">(this, new Object[]{(wo)var1, (wo)var2}, -8419885115264727178L, var3);
   }
}
