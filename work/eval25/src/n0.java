package com.zelix;

import java.lang.invoke.MethodHandles;

public class n0 extends j0 {
   private static final long b = ess.a(-3119400898657461156L, -2874220988367811453L, MethodHandles.lookup().lookupClass()).a(157215883469480L);

   public n0(int var1, char var2, int var3, char var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 17849610271644L;
      int var7 = (int)((var5 ^ 17849610271644L) >>> 32);
      int var8 = (int)((var5 ^ 17849610271644L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var1);
   }
}
