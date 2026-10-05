package com.zelix;

import java.lang.invoke.MethodHandles;

public class y9 extends yp {
   private boolean I;
   private static final long a = ess.a(-7550189778361917444L, -4201915807136163222L, MethodHandles.lookup().lookupClass()).a(43059057597563L);

   public y9(int var1) {
      super(var1);
   }

   public void G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"t">(this, true, 6390191379023236518L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 109620653119930L;
      long var9 = var3 ^ 1133881831266L;
      int var10000 = x44.a<"u">(8293401855148283125L, var3);
      int var12 = this.u(var9);
      int var11 = var10000;
      int var13 = 0;

      label41:
      while (var13 < var12) {
         try {
            this.a(var13).h(this, var2, var5);
            var13++;
         } catch (gj var15) {
            boolean var10001 = false;
            throw x44.a<"u">(var15, 8509210642950491796L, var3);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var3 >= 0L) {
                  if (var11 != 0) {
                     return;
                  }

                  var10000 = var11;
               }

               if (var10000 == 0) {
                  break;
               }
            } catch (gj var14) {
               boolean var19 = false;
               throw x44.a<"u">(var14, 8509210642950491796L, var3);
            }

            if (var3 > 0L) {
               break label41;
            }
         }
      }

      of var18 = (of)var1;
      String var20 = x44.a<"i">(this, 8089974083443820402L, var3);
      String var10002 = x44.a<"i">(this, 8514592962720223409L, var3);
      boolean var10003 = x44.a<"i">(this, 7788019778010069276L, var3);
      Object[] var10006 = new Object[]{null, null, null, var7};
      var10006[2] = var10003;
      var10006[1] = var10002;
      var10006[0] = var20;
      x44.a<"m">(var18, var10006, 8536699913253190044L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
