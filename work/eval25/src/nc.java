package com.zelix;

import java.lang.invoke.MethodHandles;

public class nc extends j0 {
   private static final long b = ess.a(-8865686694335201199L, 3331837374583228931L, MethodHandles.lookup().lookupClass()).a(65465058629082L);

   public nc(int var1, long var2) {
      var2 = b ^ var2;
      long var10001 = var2 ^ 37004707627725L;
      int var4 = (int)((var2 ^ 37004707627725L) >>> 32);
      int var5 = (int)((var2 ^ 37004707627725L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      super(var4, (short)var5, (short)var6, var1);
   }
}
