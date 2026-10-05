package com.zelix;

import java.lang.invoke.MethodHandles;

public class _q6 extends _ni {
   private static final long a = ess.a(9214639918829354159L, -3925099757361642603L, MethodHandles.lookup().lookupClass()).a(228326601128042L);

   public _q6(int var1, char var2, long var3) {
      long var5 = ((long)var2 << 48 | var3 << 16 >>> 16) ^ a;
      long var7 = var5 ^ 102746117022346L;
      super(var7, var1);
   }

   public void K(Object[] var1) {
      long var3 = (Long)var1[0];
      az var2 = (az)var1[1];
      _uu var5 = (_uu)var1[2];
      long var6 = var3 ^ 111452843812254L;
      long var8 = var3 ^ 101216835141935L;
      long var10 = var3 ^ 0L;
      long var12 = var3 ^ 12703793543226L;
      long var14 = var3 ^ 89968223186826L;
      long var16 = var3 ^ 126402498243060L;
      int var10000 = x44.a<"w">(3018414783042270147L, var3);
      _q7 var19 = (_q7)x44.a<"o">(this, new Object[]{var12}, 3905488149096465397L, var3);
      int var18 = var10000;
      int var20 = x44.a<"o">(this, new Object[]{var8}, 3459742712771822671L, var3);
      int var21 = 0;

      while (var21 < var20) {
         Object[] var10004 = new Object[]{null, var14};
         var10004[0] = var21;
         _xo var22 = (_xo)x44.a<"o">(this, var10004, 3156618655040194173L, var3);
         x44.a<"o">(var22, new Object[]{var10, this, var5}, 3861376062852649267L, var3);
         x44.a<"o">(var19, new Object[]{var16, x44.a<"o">(var22, new Object[]{var6}, 3495266996315428193L, var3)}, 2999814547749821709L, var3);
         var21++;
         if (var18 != 0) {
            break;
         }
      }
   }
}
