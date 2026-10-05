package com.zelix;

import java.lang.invoke.MethodHandles;

public class _xo extends _qw {
   private static final long a = ess.a(-699605226955909336L, -3028901014004643175L, MethodHandles.lookup().lookupClass()).a(147992676517314L);

   public _xo(int var1, int var2, char var3, char var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var10001 = var5 ^ 4061712343736L;
      int var7 = (int)((var5 ^ 4061712343736L) >>> 32);
      int var8 = (int)((var5 ^ 4061712343736L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var1);
   }
}
