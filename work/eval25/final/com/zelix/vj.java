package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public abstract class vj implements Serializable {
   final String d;
   final int a;
   final String p;
   private static final long c = ess.a(5003319498784150073L, -66437616139658527L, MethodHandles.lookup().lookupClass()).a(98937117381704L);

   vj(String var1, String var2, int var3) {
      this.d = var1;
      this.p = var2;
      this.a = var3;
   }

   public String U(Object[] var1) {
      return this.p;
   }

   boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var10001 = var2 ^ 35146874540578L;
      int var4 = (int)((var2 ^ 35146874540578L) >>> 32);
      int var5 = (int)((var2 ^ 35146874540578L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return h2.v(x44.a<"i">(this, -6241197659714396061L, var2), var4, var5, (short)var6);
   }

   public String F(Object[] var1) {
      return this.d;
   }
}
