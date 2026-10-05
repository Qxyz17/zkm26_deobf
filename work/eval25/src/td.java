package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;

public class td extends tf {
   private int d;
   private static final long a = ess.a(-5301240289648757728L, -4177610938626656817L, MethodHandles.lookup().lookupClass()).a(222391976997135L);

   td(ad var1, a7 var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 25522503486469L;
      long var7 = var3 ^ 76859875161293L;
      long var9 = var3 ^ 70033200762314L;
      int[] var10000 = x44.a<"r">(-5314442408649306434L, var3);
      super();
      int[] var11 = var10000;
      x44.a<"q">(this, new _82[x44.a<"j">(var1, new Object[]{var5}, -5474372171350757847L, var3)], -5575677794510740742L, var3);
      Enumeration var12 = x44.a<"j">(var1, new Object[]{var7}, -5685943421387623745L, var3);

      while (var12.hasMoreElements()) {
         ae var13 = (ae)var12.nextElement();
         _81 var14 = new _81(var13, var2, var9);
         _82[] var16 = x44.a<"n">(this, -5575677794510740742L, var3);
         int var10003 = x44.a<"n">(this, -5415400981467954173L, var3);
         x44.a<"q">(this, var10003 + 1, -5415400981467954173L, var3);
         var16[var10003] = var14;
         if (var11 == null) {
            break;
         }
      }
   }
}
