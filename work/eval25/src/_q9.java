package com.zelix;

import java.lang.invoke.MethodHandles;

public class _q9 extends _ni implements em {
   private String G;
   private String B;
   private static final long a = ess.a(-6545515571694916817L, -701236359112422917L, MethodHandles.lookup().lookupClass()).a(51927943460869L);

   public void g(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      x44.a<"t">(this, var4, 4654735936845886509L, var2);
   }

   public _q9(char var1, char var2, int var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 98286321847204L;
      super(var7, var3);
   }

   void F(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      x44.a<"p">(this, var4, -6531746160453426431L, var2);
   }

   public final void K(Object[] var1) {
      long var3 = (Long)var1[0];
      az var2 = (az)var1[1];
      _uu var5 = (_uu)var1[2];
      long var6 = var3 ^ 0L;
      long var8 = var3 ^ 67049938711720L;
      long var10 = var3 ^ 101216835141935L;
      long var12 = var3 ^ 62078478370690L;
      long var14 = var3 ^ 103577603595085L;
      long var16 = var3 ^ 12703793543226L;
      long var18 = var3 ^ 89968223186826L;
      int var10000 = x44.a<"w">(3018414783042270147L, var3);
      int var21 = 0;
      int var20 = var10000;

      label34: {
         while (var21 < x44.a<"o">(this, new Object[]{var10}, 3459742712771822671L, var3)) {
            try {
               var24 = this;
               Object[] var10004 = new Object[]{null, var18};
               Object[] var10001 = var10004;
               var10004[0] = var21;
               long var10002 = 3156618655040194173L;
               long var10003 = var3;
               if (var3 >= 0L) {
                  var24 = x44.a<"o">(this, var10004, 3156618655040194173L, var3);
                  if (var20 != 0) {
                     break label34;
                  }

                  Object[] var10005 = new Object[]{null, this, var5};
                  var10001 = var10005;
                  var10005[0] = var6;
                  var10002 = 3570806773825883371L;
                  var10003 = var3;
               }

               x44.a<"o">(var24, var10001, var10002, var10003);
               var21++;
               if (var20 == 0) {
                  continue;
               }
            } catch (gj var22) {
               throw x44.a<"w">(var22, 2981884907436940855L, var3);
            }

            if (var3 >= 0L) {
               break;
            }
         }

         var24 = x44.a<"o">(this, new Object[]{var16}, 3905488149096465397L, var3);
      }

      _xy var23 = (_xy)var24;
      x44.a<"o">(var23, new Object[]{var14}, 3496669987661710196L, var3);
      x44.a<"o">(var23, new Object[]{var8, x44.a<"k">(this, 3760731464299626629L, var3)}, 3467085241916562839L, var3);
      x44.a<"o">(var23, new Object[]{x44.a<"k">(this, 3129680681446305077L, var3), var12}, 3120241667682739842L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
