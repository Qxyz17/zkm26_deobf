package com.zelix;

public class ya extends yp {
   public ya(int var1) {
      super(var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 35394293830140L;
      long var9 = var3 ^ 1133881831266L;
      int var10000 = x44.a<"u">(8293401855148283125L, var3);
      int var12 = this.u(var9);
      int var13 = 0;
      int var11 = var10000;

      label41:
      while (var13 < var12) {
         try {
            this.a(var13).h(this, var2, var5);
            var13++;
         } catch (gj var15) {
            boolean var10001 = false;
            throw x44.a<"u">(var15, 7678900172573401361L, var3);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var3 > 0L) {
                  if (var11 != 0) {
                     return;
                  }

                  var10000 = var11;
               }

               if (var10000 == 0) {
                  break;
               }
            } catch (gj var14) {
               boolean var18 = false;
               throw x44.a<"u">(var14, 7678900172573401361L, var3);
            }

            if (var3 > 0L) {
               break label41;
            }
         }
      }

      x44.a<"m">(
         (of)var1, new Object[]{x44.a<"i">(this, 8089974083443820402L, var3), x44.a<"i">(this, 8514592962720223409L, var3), var7}, 8271837238108796048L, var3
      );
   }

   private static gj a(gj var0) {
      return var0;
   }
}
