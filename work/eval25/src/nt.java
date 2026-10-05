package com.zelix;

import java.lang.invoke.MethodHandles;

public class nt extends j0 {
   private static final long b = ess.a(3637988238526260756L, 2821719564586911743L, MethodHandles.lookup().lookupClass()).a(221468434630639L);

   public nt(int var1, short var2, int var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 87526861678325L;
      int var7 = (int)((var5 ^ 87526861678325L) >>> 32);
      int var8 = (int)((var5 ^ 87526861678325L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var1);
   }
}
