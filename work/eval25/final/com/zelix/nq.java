package com.zelix;

import java.lang.invoke.MethodHandles;

public class nq extends j0 {
   private static final long b = ess.a(-5132541464779624457L, -8954550832629688437L, MethodHandles.lookup().lookupClass()).a(275284301962807L);

   public nq(char var1, int var2, char var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ b;
      long var10001 = var5 ^ 129066525809100L;
      int var7 = (int)((var5 ^ 129066525809100L) >>> 32);
      int var8 = (int)((var5 ^ 129066525809100L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var2);
   }
}
