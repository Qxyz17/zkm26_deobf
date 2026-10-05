package com.zelix;

import java.lang.invoke.MethodHandles;

public class ltl extends l7t {
   private static final long a = prr.a(-1780933815867403218L, 6345003572001360395L, MethodHandles.lookup().lookupClass()).a(14186201225613L);

   public void M(Object[] var1) {
      lmu var5 = (lmu)var1[0];
      lqu var2 = (lqu)var1[1];
      long var3 = (Long)var1[2];
      long var6 = var3 ^ 66113220225168L;
      long var8 = var3 ^ 0L;
      lwl var10 = (lwl)this.V(0);
      m44.a<"w">(var10, new Object[]{this, var2, var8}, -6393942317858302839L, var3);
      String var11 = m44.a<"w">(var10, new Object[0], -4968184746715213117L, var3);
      ltb var12 = (ltb)var5;
      m44.a<"w">(var12, new Object[]{var6, var11}, -6504114854036947639L, var3);
   }

   public ltl(int var1, long var2) {
      var2 = a ^ var2;
      int var4 = (int)((var2 ^ 40090530314992L) >>> 56);
      long var5 = (var2 ^ 40090530314992L) << 8 >>> 8;
      super((byte)var4, var1, var5);
   }
}
