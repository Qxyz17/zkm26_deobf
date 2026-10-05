package com.zelix;

import java.lang.invoke.MethodHandles;

public class _qj extends _qw implements eo {
   private boolean o;
   private static final long a = ess.a(-2338251078251693175L, 8504219685689823390L, MethodHandles.lookup().lookupClass()).a(62113890330916L);

   public void K(Object[] var1) {
      long var2 = (Long)var1[0];
      az var4 = (az)var1[1];
      _uu var5 = (_uu)var1[2];
      long var6 = var2 ^ 111452843812254L;
      long var8 = var2 ^ 54130034607546L;
      long var10 = var2 ^ 12703793543226L;
      qk var12 = (qk)x44.a<"o">(this, new Object[]{var10}, 3905488149096465397L, var2);

      qk var10000;
      StringBuilder var10001;
      String var10002;
      label17: {
         try {
            var10000 = var12;
            var10001 = new StringBuilder();
            if (x44.a<"k">(this, 3097104757771028696L, var2)) {
               var10002 = "!";
               break label17;
            }
         } catch (gj var13) {
            throw x44.a<"w">(var13, 3164008131556644110L, var2);
         }

         var10002 = "";
      }

      x44.a<"o">(
         var10000,
         new Object[]{var10001.append(var10002).append(x44.a<"o">(this, new Object[]{var6}, 3495266996315428193L, var2)).toString(), var8},
         3030016213717102164L,
         var2
      );
   }

   public _qj(int var1, int var2, short var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var5 ^ 126838151618684L;
      int var7 = (int)((var5 ^ 126838151618684L) >>> 32);
      int var8 = (int)((var5 ^ 126838151618684L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super(var7, (short)var8, (short)var9, var4);
   }

   public void j(Object[] var1) {
      long var2 = (Long)var1[0];
      x44.a<"u">(this, true, -4568313856391929159L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
