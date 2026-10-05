package com.zelix;

import java.lang.invoke.MethodHandles;

public class _qm extends _ni {
   private static final long a = ess.a(-6366301644580629140L, 3636432712694982127L, MethodHandles.lookup().lookupClass()).a(164150701066513L);

   public _qm(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 1551261286232L;
      super(var4, var3);
   }

   public void K(Object[] var1) {
      long var4 = (Long)var1[0];
      az var2 = (az)var1[1];
      _uu var3 = (_uu)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 111452843812254L;
      long var10 = var4 ^ 101216835141935L;
      long var12 = var4 ^ 140506777490443L;
      long var14 = var4 ^ 44432785229458L;
      long var16 = var4 ^ 12703793543226L;
      long var18 = var4 ^ 29943398254244L;
      long var20 = var4 ^ 89968223186826L;
      int var23 = x44.a<"o">(this, new Object[]{var10}, 3459742712771822671L, var4);
      int var10000 = x44.a<"w">(3018414783042270147L, var4);
      int var24 = 0;
      int var22 = var10000;

      label58: {
         while (var24 < x44.a<"o">(this, new Object[]{var10}, 3459742712771822671L, var4)) {
            try {
               var30 = this;
               Object[] var10004 = new Object[]{null, var20};
               Object[] var10001 = var10004;
               var10004[0] = var24;
               long var10002 = 3156618655040194173L;
               long var10003 = var4;
               if (var4 > 0L) {
                  var30 = x44.a<"o">(this, var10004, 3156618655040194173L, var4);
                  if (var22 != 0) {
                     break label58;
                  }

                  Object[] var10005 = new Object[]{null, this, var3};
                  var10001 = var10005;
                  var10005[0] = var6;
                  var10002 = 3570806773825883371L;
                  var10003 = var4;
               }

               x44.a<"o">(var30, var10001, var10002, var10003);
               var24++;
               if (var22 == 0) {
                  continue;
               }
            } catch (gj var28) {
               throw x44.a<"w">(var28, 3872316519394597834L, var4);
            }

            if (var4 >= 0L) {
               break;
            }
         }

         var30 = x44.a<"o">(this, new Object[]{var16}, 3905488149096465397L, var4);
      }

      _y9 var29 = (_y9)var30;
      int var25 = 0;

      while (var25 < var23) {
         Object[] var35 = new Object[]{null, var20};
         var35[0] = var25;
         _q3 var26 = (_q3)x44.a<"o">(this, var35, 3156618655040194173L, var4);

         xs var32;
         xs var33;
         String var34;
         boolean var37;
         label35: {
            try {
               var31 = var29;
               var32 = new xs;
               var33 = var32;
               var34 = x44.a<"o">(var26, new Object[]{var8}, 3495266996315428193L, var4);
               var36 = x44.a<"o">(var26, new Object[]{var12}, 3566296537196923512L, var4);
               if (var23 > 1) {
                  var37 = true;
                  break label35;
               }
            } catch (gj var27) {
               throw x44.a<"w">(var27, 3872316519394597834L, var4);
            }

            var37 = false;
         }

         var33./* $VF: Unable to resugar constructor */<init>(var34, var36, var18, var37);
         x44.a<"o">(var31, new Object[]{var32, var14}, 3406358824736453139L, var4);
         var25++;
         if (var22 != 0) {
            break;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }
}
