package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class uu implements Comparator {
   final bc G;
   private static final long a = prr.a(332907350175149187L, 123023642404110278L, MethodHandles.lookup().lookupClass()).a(14269285282119L);

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 4421576979762L;
      long var10001 = var3 ^ 82171924621605L;
      int var5 = (int)((var3 ^ 82171924621605L) >>> 32);
      int var6 = (int)((var3 ^ 82171924621605L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Object[] var10007 = new Object[]{null, null, (lq0)var1, Integer.valueOf((short)var7), (lq0)var2};
      var10007[1] = var6;
      var10007[0] = var5;
      return m44.a<"t">(this, var10007, -789595332238484874L, var3);
   }

   public int I(Object[] var1) {
      int var4 = (Integer)var1[0];
      int var5 = (Integer)var1[1];
      lq0 var6 = (lq0)var1[2];
      int var3 = (Integer)var1[3];
      lq0 var2 = (lq0)var1[4];
      long var7 = ((long)var4 << 32 | (long)var5 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 109028912852265L;
      return ((lk9)var6.S()).C(var9, (lk9)var2.S());
   }

   uu(bc var1) {
      this.G = var1;
   }
}
