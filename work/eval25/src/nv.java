package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Set;

public abstract class nv extends nh implements _ng {
   private static final long c = ess.a(1806808302839199291L, 2407252050009017678L, MethodHandles.lookup().lookupClass()).a(53066698984163L);

   public final boolean B(int var1, int var2, int var3, Set var4) {
      long var5 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var10001 = var5 ^ 0L;
      int var7 = (int)((var5 ^ 0L) >>> 32);
      int var8 = (int)((var5 ^ 0L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      _ng var10 = (_ng)this.e(0);
      return var10.B(var7, var8, var9, var4);
   }

   public nv(char var1, long var2, int var4) {
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ c;
      long var7 = var5 ^ 135182197569615L;
      super(var4, var7);
   }
}
