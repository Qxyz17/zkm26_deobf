package com.zelix;

import java.lang.invoke.MethodHandles;

public class nf extends j0 {
   private static final long b = ess.a(-79947241787339093L, 4436349218951706276L, MethodHandles.lookup().lookupClass()).a(6043029571257L);

   public nf(int var1, char var2, long var3) {
      long var5 = ((long)var2 << 48 | var3 << 16 >>> 16) ^ b;
      long var10001 = var5 ^ 135347561929873L;
      int var7 = (int)((var5 ^ 135347561929873L) >>> 32);
      int var8 = (int)((var5 ^ 135347561929873L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var1);
   }
}
