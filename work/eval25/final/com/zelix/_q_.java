package com.zelix;

import java.lang.invoke.MethodHandles;

public class _q_ extends _qw implements eo {
   private boolean a;
   private static final long b = ess.a(-4882946024066358076L, 8256393462349601094L, MethodHandles.lookup().lookupClass()).a(87805277090841L);

   public _q_(int var1, short var2, int var3, short var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 112229172555907L;
      int var7 = (int)((var5 ^ 112229172555907L) >>> 32);
      int var8 = (int)((var5 ^ 112229172555907L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var3);
   }

   public void j(Object[] var1) {
      long var2 = (Long)var1[0];
      x44.a<"u">(this, true, -4507641559649448509L, var2);
   }

   public void K(Object[] var1) {
      long var4 = (Long)var1[0];
      az var3 = (az)var1[1];
      _uu var2 = (_uu)var1[2];
      long var6 = var4 ^ 111452843812254L;
      long var8 = var4 ^ 133592992846933L;
      long var10 = var4 ^ 0L;
      long var12 = var4 ^ 12703793543226L;
      super.K(new Object[]{var10, var3, var2});
      _gl var14 = (_gl)x44.a<"o">(this, new Object[]{var12}, 3905488149096465397L, var4);

      _gl var10000;
      StringBuilder var10001;
      String var10002;
      label17: {
         try {
            var10000 = var14;
            var10001 = new StringBuilder();
            if (x44.a<"k">(this, 3103144503571146658L, var4)) {
               var10002 = "!";
               break label17;
            }
         } catch (gj var15) {
            throw x44.a<"w">(var15, 3660183501209486322L, var4);
         }

         var10002 = "";
      }

      x44.a<"o">(
         var10000,
         new Object[]{var8, var10001.append(var10002).append(x44.a<"o">(this, new Object[]{var6}, 3495266996315428193L, var4)).toString()},
         3904998621138038694L,
         var4
      );
   }

   private static gj a(gj var0) {
      return var0;
   }
}
