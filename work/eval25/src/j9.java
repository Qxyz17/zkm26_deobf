package com.zelix;

import java.lang.invoke.MethodHandles;

public class j9 extends j0 {
   private static final long b = ess.a(6447072636058130011L, 4406058597880108269L, MethodHandles.lookup().lookupClass()).a(152716692519328L);

   public j9(int var1, long var2) {
      var2 = b ^ var2;
      long var10001 = var2 ^ 69592902294929L;
      int var4 = (int)((var2 ^ 69592902294929L) >>> 32);
      int var5 = (int)((var2 ^ 69592902294929L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      super(var4, (short)var5, (short)var6, var1);
   }
}
