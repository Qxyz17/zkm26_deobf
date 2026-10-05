package com.zelix;

import java.lang.invoke.MethodHandles;

public class mz extends m8 {
   static final w5 N9;
   private static final long cb = ess.a(-3685299985064082185L, -8493038561447745334L, MethodHandles.lookup().lookupClass()).a(189119432216284L);

   mz(int var1, _83 var2, x7 var3, mn var4, iu var5) {
      super(var1, var2, var3, var4, var5);
   }

   mz(long var1, m0 var3, x7 var4, mn var5, _y4 var6) {
      var1 = cb ^ var1;
      long var7 = var1 ^ 71691819360543L;
      super(var3, var7, var4, var5, var6);
   }

   static {
      long var0 = cb ^ 20231384854576L;
      N9 = x44.a<"k">(4408489783846149642L, var0);
   }

   mz(int var1, char var2, _83 var3, x7 var4, mn var5, short var6, _yv var7, _ug var8, int var9) {
      long var10 = ((long)var2 << 48 | (long)var6 << 48 >>> 16 | (long)var9 << 32 >>> 32) ^ cb;
      int var12 = (int)((var10 ^ 53154764408326L) >>> 48);
      long var13 = (var10 ^ 53154764408326L) << 16 >>> 16;
      super((short)var12, var1, var13, var3, var4, var5, var7, var8);
   }

   public w5 m(long var1) {
      return x44.a<"h">(-873510638182918594L, var1);
   }
}
