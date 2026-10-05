package com.zelix;

import java.lang.invoke.MethodHandles;

public class nd extends j0 {
   private static final long b = ess.a(-4417513969847071889L, -4169143015146617633L, MethodHandles.lookup().lookupClass()).a(118670462725698L);

   public nd(int var1, short var2, long var3) {
      long var5 = ((long)var2 << 48 | var3 << 16 >>> 16) ^ b;
      long var10001 = var5 ^ 57195672600270L;
      int var7 = (int)((var5 ^ 57195672600270L) >>> 32);
      int var8 = (int)((var5 ^ 57195672600270L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var1);
   }
}
