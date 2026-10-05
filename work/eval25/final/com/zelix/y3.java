package com.zelix;

public class y3 extends y1 implements ve {
   private String i;

   public y3(int var1) {
      super(var1);
   }

   public void f(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"w">(this, var2, -2655966073290332413L, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 1133881831266L;
      long var9 = var3 ^ 69508411855970L;
      int var10000 = x44.a<"u">(8293401855148283125L, var3);
      int var12 = this.u(var7);
      int var11 = var10000;
      int var13 = 0;

      label41:
      while (var13 < var12) {
         try {
            this.a(var13).h(this, var2, var5);
            var13++;
         } catch (gj var15) {
            boolean var10001 = false;
            throw x44.a<"u">(var15, 7603697874623022794L, var3);
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
               boolean var18 = false;
               throw x44.a<"u">(var14, 7603697874623022794L, var3);
            }

            if (var3 > 0L) {
               break label41;
            }
         }
      }

      x44.a<"m">((yv)var1, new Object[]{x44.a<"i">(this, 8285886870456749786L, var3), var9}, 7693009522057433297L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
