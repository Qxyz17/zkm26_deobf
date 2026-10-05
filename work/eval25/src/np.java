package com.zelix;

import java.lang.invoke.MethodHandles;

public class np extends j0 {
   private static final long b = ess.a(1053004460832470107L, -5507137569498399676L, MethodHandles.lookup().lookupClass()).a(169293473657260L);

   public np(int var1, char var2, char var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 50885113532177L;
      int var7 = (int)((var5 ^ 50885113532177L) >>> 32);
      int var8 = (int)((var5 ^ 50885113532177L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var4);
   }
}
