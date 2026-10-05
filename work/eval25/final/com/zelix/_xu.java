package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class _xu extends _ni implements em {
   private List u;
   private String F;
   private String n;
   private static final long a = ess.a(4457052126876007314L, -3172571819313818236L, MethodHandles.lookup().lookupClass()).a(186657911456812L);

   public void g(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      x44.a<"t">(this, var4, 6485969972060383088L, var2);
   }

   public final void K(Object[] var1) {
      long var4 = (Long)var1[0];
      az var3 = (az)var1[1];
      _uu var2 = (_uu)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 67049938711720L;
      long var10 = var4 ^ 101216835141935L;
      long var12 = var4 ^ 7618383084178L;
      long var14 = var4 ^ 109801325596932L;
      long var16 = var4 ^ 12703793543226L;
      long var18 = var4 ^ 89968223186826L;
      int var10000 = x44.a<"w">(2920000768921731879L, var4);
      int var21 = 0;
      int var20 = var10000;

      label34: {
         while (var21 < x44.a<"o">(this, new Object[]{var10}, 3459742712771822671L, var4)) {
            try {
               var24 = this;
               Object[] var10004 = new Object[]{null, var18};
               Object[] var10001 = var10004;
               var10004[0] = var21;
               long var10002 = 3156618655040194173L;
               long var10003 = var4;
               if (var4 > 0L) {
                  var24 = x44.a<"o">(this, var10004, 3156618655040194173L, var4);
                  if (var20 == 0) {
                     break label34;
                  }

                  Object[] var10005 = new Object[]{null, this, var2};
                  var10001 = var10005;
                  var10005[0] = var6;
                  var10002 = 3570806773825883371L;
                  var10003 = var4;
               }

               x44.a<"o">(var24, var10001, var10002, var10003);
               var21++;
               if (var20 != 0) {
                  continue;
               }
            } catch (gj var22) {
               throw x44.a<"w">(var22, 3868294817380875172L, var4);
            }

            if (var4 >= 0L) {
               break;
            }
         }

         var24 = x44.a<"o">(this, new Object[]{var16}, 3905488149096465397L, var4);
      }

      _xy var23 = (_xy)var24;
      x44.a<"o">(var23, new Object[]{var14}, 3441368804387535902L, var4);
      x44.a<"o">(var23, new Object[]{var8, x44.a<"k">(this, 3362772373102466008L, var4)}, 3467085241916562839L, var4);
      x44.a<"o">(var23, new Object[]{var12, x44.a<"k">(this, 3815055889085751462L, var4)}, 3089351940303591462L, var4);
   }

   public _xu(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 104869801451997L;
      super(var4, var3);
      x44.a<"w">(this, new ArrayList(), 4236347019946815133L, var1);
   }

   void v(Object[] var1) {
      List var4 = (List)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"w">(this, var4, -742389943255555611L, var2);
   }

   void r(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"w">(this, var2, 8136642654217377286L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
