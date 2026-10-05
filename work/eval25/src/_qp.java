package com.zelix;

import java.lang.invoke.MethodHandles;

public class _qp extends _ni implements _r4, em {
   private String k;
   private String u;
   private static final long a = ess.a(-7307878563375195581L, -4310521522221439014L, MethodHandles.lookup().lookupClass()).a(121528715937273L);

   public void B(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"v">(this, var4, -5287607471712005508L, var2);
   }

   public _qp(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 36386873962759L;
      super(var4, var3);
   }

   public final void K(Object[] var1) {
      long var4 = (Long)var1[0];
      az var2 = (az)var1[1];
      _uu var3 = (_uu)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 101216835141935L;
      long var10 = var4 ^ 106394186170471L;
      long var12 = var4 ^ 70444291289029L;
      long var14 = var4 ^ 12703793543226L;
      long var16 = var4 ^ 89968223186826L;
      int var10000 = x44.a<"w">(2920000768921731879L, var4);
      int var19 = 0;
      int var18 = var10000;

      label34: {
         while (var19 < x44.a<"o">(this, new Object[]{var8}, 3459742712771822671L, var4)) {
            try {
               var22 = this;
               Object[] var10004 = new Object[]{null, var16};
               Object[] var10001 = var10004;
               var10004[0] = var19;
               long var10002 = 3156618655040194173L;
               long var10003 = var4;
               if (var4 > 0L) {
                  var22 = x44.a<"o">(this, var10004, 3156618655040194173L, var4);
                  if (var18 == 0) {
                     break label34;
                  }

                  Object[] var10005 = new Object[]{null, this, var3};
                  var10001 = var10005;
                  var10005[0] = var6;
                  var10002 = 3570806773825883371L;
                  var10003 = var4;
               }

               x44.a<"o">(var22, var10001, var10002, var10003);
               var19++;
               if (var18 != 0) {
                  continue;
               }
            } catch (gj var20) {
               throw x44.a<"w">(var20, 3422276986155027196L, var4);
            }

            if (var4 > 0L) {
               break;
            }
         }

         var22 = x44.a<"o">(this, new Object[]{var14}, 3905488149096465397L, var4);
      }

      _q4 var21 = (_q4)var22;
      x44.a<"o">(var21, new Object[]{x44.a<"k">(this, 4016377704753791100L, var4), var3, var10}, 3518308874596273084L, var4);
      x44.a<"o">(var21, new Object[]{x44.a<"k">(this, 3444394321828645678L, var4), var3, var12}, 3388270978510623710L, var4);
   }

   public void g(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      x44.a<"t">(this, var4, 4833829996405552340L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
