package com.zelix;

import java.lang.invoke.MethodHandles;

public class no extends j0 {
   private static final long b = ess.a(8368525396312574835L, 3526059448766707313L, MethodHandles.lookup().lookupClass()).a(104665548790876L);

   public no(int var1, char var2, char var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 38076196810327L;
      int var7 = (int)((var5 ^ 38076196810327L) >>> 32);
      int var8 = (int)((var5 ^ 38076196810327L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var4);
   }
}
