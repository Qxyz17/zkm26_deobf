package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class _xr extends _ni {
   private List K;
   private static final long a = ess.a(2822982954571062912L, -8794301323598581761L, MethodHandles.lookup().lookupClass()).a(220323522980520L);

   void m(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      x44.a<"o">(this, 1897306563494985092L, var2).add(var4);
   }

   public void K(Object[] var1) {
      long var3 = (Long)var1[0];
      az var5 = (az)var1[1];
      _uu var2 = (_uu)var1[2];
      long var6 = var3 ^ 0L;
      long var8 = var3 ^ 101216835141935L;
      long var10 = var3 ^ 5173353181146L;
      long var12 = var3 ^ 12703793543226L;
      long var14 = var3 ^ 89968223186826L;
      int var10000 = x44.a<"w">(3018414783042270147L, var3);
      int var17 = 0;
      int var16 = var10000;

      label34: {
         while (var17 < x44.a<"o">(this, new Object[]{var8}, 3459742712771822671L, var3)) {
            try {
               var20 = this;
               Object[] var10004 = new Object[]{null, var14};
               Object[] var10001 = var10004;
               var10004[0] = var17;
               long var10002 = 3156618655040194173L;
               long var10003 = var3;
               if (var3 > 0L) {
                  var20 = x44.a<"o">(this, var10004, 3156618655040194173L, var3);
                  if (var16 != 0) {
                     break label34;
                  }

                  Object[] var10005 = new Object[]{null, this, var2};
                  var10001 = var10005;
                  var10005[0] = var6;
                  var10002 = 3570806773825883371L;
                  var10003 = var3;
               }

               x44.a<"o">(var20, var10001, var10002, var10003);
               var17++;
               if (var16 == 0) {
                  continue;
               }
            } catch (gj var18) {
               throw x44.a<"w">(var18, 3128694490870690169L, var3);
            }

            if (var3 > 0L) {
               break;
            }
         }

         var20 = x44.a<"o">(this, new Object[]{var12}, 3905488149096465397L, var3);
      }

      _xu var19 = (_xu)var20;
      x44.a<"o">(var19, new Object[]{x44.a<"k">(this, 2900575675187695504L, var3), var10}, 3790717523208216958L, var3);
   }

   public _xr(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 137581890836227L;
      super(var4, var1);
      x44.a<"q">(this, new ArrayList(), 5811194112380696437L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
