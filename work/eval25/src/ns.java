package com.zelix;

import java.lang.invoke.MethodHandles;

public class ns extends j0 {
   private static final long b = ess.a(5643250127396203774L, 8909061164126559975L, MethodHandles.lookup().lookupClass()).a(189845085026502L);

   public ns(int var1, int var2, short var3, int var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 39914269524632L;
      int var7 = (int)((var5 ^ 39914269524632L) >>> 32);
      int var8 = (int)((var5 ^ 39914269524632L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var1);
   }
}
