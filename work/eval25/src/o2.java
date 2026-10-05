package com.zelix;

public class o2 extends y1 {
   public o2(int var1) {
      super(var1);
   }

   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 111091566124363L;
      long var9 = var3 ^ 1133881831266L;
      int var10000 = x44.a<"u">(8293401855148283125L, var3);
      int var12 = this.u(var9);
      int var11 = var10000;
      int var13 = 0;

      label34: {
         while (var13 < var12) {
            try {
               if (var3 >= 0L) {
                  var16 = this.a(var13);
                  if (var11 != 0) {
                     break label34;
                  }

                  var16.h(this, var2, var5);
                  var13++;
               }

               if (var11 == 0) {
                  continue;
               }
            } catch (gj var14) {
               throw x44.a<"u">(var14, 8278779931141549653L, var3);
            }

            if (var3 >= 0L) {
               break;
            }
         }

         var16 = var1;
      }

      y9 var15 = (y9)var16;
      x44.a<"m">(var15, new Object[]{var7}, 7563148918902509608L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
