package com.zelix;

import java.lang.invoke.MethodHandles;

public class j5 extends j0 {
   private static final long b = ess.a(-1263620464333870085L, -5273120787304228884L, MethodHandles.lookup().lookupClass()).a(23935366084423L);

   public j5(short var1, int var2, long var3) {
      long var5 = ((long)var1 << 48 | var3 << 16 >>> 16) ^ b;
      long var10001 = var5 ^ 56006713643896L;
      int var7 = (int)((var5 ^ 56006713643896L) >>> 32);
      int var8 = (int)((var5 ^ 56006713643896L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var2);
   }
}
