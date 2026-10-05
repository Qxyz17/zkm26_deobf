package com.zelix;

import java.lang.invoke.MethodHandles;

public class _xf extends _qw implements eo {
   private boolean N;
   private static final long a = ess.a(4417700575432120179L, 2081662520027587279L, MethodHandles.lookup().lookupClass()).a(168313877266015L);

   public _xf(int var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 98078468800376L;
      int var4 = (int)((var2 ^ 98078468800376L) >>> 32);
      int var5 = (int)((var2 ^ 98078468800376L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      super(var4, (short)var5, (short)var6, var1);
   }

   public void K(Object[] var1) {
      long var3 = (Long)var1[0];
      az var2 = (az)var1[1];
      _uu var5 = (_uu)var1[2];
      long var6 = var3 ^ 111452843812254L;
      long var8 = var3 ^ 0L;
      long var10 = var3 ^ 54130034607546L;
      long var12 = var3 ^ 12703793543226L;
      super.K(new Object[]{var8, var2, var5});
      qk var14 = (qk)x44.a<"o">(this, new Object[]{var12}, 3905488149096465397L, var3);

      qk var10000;
      StringBuilder var10001;
      String var10002;
      label17: {
         try {
            var10000 = var14;
            var10001 = new StringBuilder();
            if (x44.a<"k">(this, 3869919681215885868L, var3)) {
               var10002 = "!";
               break label17;
            }
         } catch (gj var15) {
            throw x44.a<"w">(var15, 3867534514993239068L, var3);
         }

         var10002 = "";
      }

      x44.a<"o">(
         var10000,
         new Object[]{var10001.append(var10002).append(x44.a<"o">(this, new Object[]{var6}, 3495266996315428193L, var3)).toString(), var10},
         3030016213717102164L,
         var3
      );
   }

   public void j(Object[] var1) {
      long var2 = (Long)var1[0];
      x44.a<"u">(this, true, -2317803582256801715L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
