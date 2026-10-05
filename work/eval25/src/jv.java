package com.zelix;

import java.lang.invoke.MethodHandles;

public class jv extends j0 {
   private static final long b = ess.a(1664872756248828249L, 7898026196940550650L, MethodHandles.lookup().lookupClass()).a(5973991236269L);

   public jv(char var1, long var2, int var4) {
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var5 ^ 106953633093326L;
      int var7 = (int)((var5 ^ 106953633093326L) >>> 32);
      int var8 = (int)((var5 ^ 106953633093326L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var4);
   }
}
