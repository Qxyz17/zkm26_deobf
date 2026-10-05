package com.zelix;

import java.lang.invoke.MethodHandles;

public class nz extends j0 {
   private static final long b = ess.a(-1033786897497049632L, -1163000785755445173L, MethodHandles.lookup().lookupClass()).a(109526324517180L);

   public nz(int var1, byte var2, int var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var4 << 40 >>> 40) ^ b;
      long var10001 = var5 ^ 127330056944031L;
      int var7 = (int)((var5 ^ 127330056944031L) >>> 32);
      int var8 = (int)((var5 ^ 127330056944031L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var3);
   }
}
