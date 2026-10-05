package com.zelix;

import java.lang.invoke.MethodHandles;

public class j7 extends j0 {
   private static final long b = ess.a(-2310136689206059708L, -4698774335322521000L, MethodHandles.lookup().lookupClass()).a(162422827420725L);

   public j7(char var1, int var2, int var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 68230498301128L;
      int var7 = (int)((var5 ^ 68230498301128L) >>> 32);
      int var8 = (int)((var5 ^ 68230498301128L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var2);
   }
}
