package com.zelix;

import java.lang.invoke.MethodHandles;

public class nx extends j0 {
   private static final long b = ess.a(-7532922294122319202L, -701705459773792528L, MethodHandles.lookup().lookupClass()).a(45884869304871L);

   public nx(int var1, byte var2, long var3) {
      long var5 = ((long)var2 << 56 | var3 << 8 >>> 8) ^ b;
      long var10001 = var5 ^ 4457105736953L;
      int var7 = (int)((var5 ^ 4457105736953L) >>> 32);
      int var8 = (int)((var5 ^ 4457105736953L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var1);
   }
}
