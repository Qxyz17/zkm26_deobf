package com.zelix;

import java.lang.invoke.MethodHandles;

public class j3 extends j0 {
   private static final long b = ess.a(2332749426506775190L, 3776493782687017221L, MethodHandles.lookup().lookupClass()).a(281125898237384L);

   public j3(int var1, int var2, long var3) {
      long var5 = ((long)var2 << 32 | var3 << 32 >>> 32) ^ b;
      long var10001 = var5 ^ 130000711099703L;
      int var7 = (int)((var5 ^ 130000711099703L) >>> 32);
      int var8 = (int)((var5 ^ 130000711099703L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var1);
   }
}
