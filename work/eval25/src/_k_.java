package com.zelix;

import java.lang.invoke.MethodHandles;

public class _k_ extends _k6 {
   private static final long a = ess.a(4438775479842786625L, 129771183782823523L, MethodHandles.lookup().lookupClass()).a(102365374622289L);

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      t9 var5 = (t9)var1[1];
      _fs var4 = (_fs)var1[2];
      long var6 = var2 ^ 21612690447697L;
      long var8 = var2 ^ 96730145793794L;
      long var10 = var2 ^ 64211095953196L;
      long var12 = var2 ^ 0L;
      long var14 = var2 ^ 106872862175217L;
      long var16 = var2 ^ 39984333814216L;
      long var18 = var2 ^ 49236696803649L;
      super.B(new Object[]{var12, var5, var4});
      int var21 = x44.a<"o">(this, new Object[]{var8}, -9008633734365849112L, var2);
      Object[] var10004 = new Object[]{null, var16};
      var10004[0] = 0;
      _os var22 = (_os)x44.a<"o">(this, var10004, -7167700983208906369L, var2);
      String var23 = x44.a<"o">(var22, new Object[]{var14}, -8655916090159584371L, var2);
      boolean var10000 = x44.a<"w">(-8676686692554104663L, var2);
      x44.a<"o">(
         var4,
         new Object[]{
            var18, x44.a<"o">(var22, new Object[]{var14}, -8655916090159584371L, var2), x44.a<"o">(var22, new Object[]{var10}, -7071046419372110421L, var2)
         },
         -7175442724916184903L,
         var2
      );
      boolean var20 = var10000;
      int var24 = 1;

      while (var24 < var21) {
         var10004 = new Object[]{null, var16};
         var10004[0] = var24;
         _r6 var25 = (_r6)x44.a<"o">(this, var10004, -7167700983208906369L, var2);
         x44.a<"o">(var25, new Object[]{var23, var6, var4}, -8764119165204079438L, var2);
         var24++;
         if (!var20) {
            break;
         }
      }
   }

   public _k_(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = (var2 ^ 19112666648105L) >>> 16;
      int var6 = (int)((var2 ^ 19112666648105L) << 48 >>> 48);
      super(var4, (char)var6, var1);
   }
}
