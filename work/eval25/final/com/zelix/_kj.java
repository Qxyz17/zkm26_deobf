package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class _kj extends _k6 {
   protected String E;
   private static final long a = ess.a(-8795739267902597553L, 5804112586388786030L, MethodHandles.lookup().lookupClass()).a(28005963684564L);

   public final void N(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      x44.a<"r">(this, var4.trim(), 5186327571908504267L, var2);
   }

   public _kj(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = (var1 ^ 140560820671305L) >>> 16;
      int var6 = (int)((var1 ^ 140560820671305L) << 48 >>> 48);
      super(var4, (char)var6, var3);
   }
}
