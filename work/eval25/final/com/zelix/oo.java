package com.zelix;

public abstract class oo extends y1 implements _zg {
   protected String l;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 89275381290376L;
      long var9 = var3 ^ 1133881831266L;
      int var12 = this.u(var9);
      int var10000 = x44.a<"u">(8264398724260313806L, var3);
      int var13 = 0;
      int var11 = var10000;

      label41:
      while (var13 < var12) {
         try {
            this.a(var13).h(this, var2, var5);
            var13++;
         } catch (gj var15) {
            boolean var10001 = false;
            throw x44.a<"u">(var15, 7772016275386157869L, var3);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var3 > 0L) {
                  if (var11 == 0) {
                     return;
                  }

                  var10000 = var11;
               }

               if (var10000 != 0) {
                  break;
               }
            } catch (gj var14) {
               boolean var18 = false;
               throw x44.a<"u">(var14, 7772016275386157869L, var3);
            }

            if (var3 > 0L) {
               break label41;
            }
         }
      }

      x44.a<"m">(this, new Object[]{var1, var7, var2}, 8319994891980635315L, var3);
   }

   public void o(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"s">(this, var2, -5739331837342115439L, var3);
   }

   public oo(int var1) {
      super(var1);
   }

   public abstract void e(Object[] var1);

   private static gj a(gj var0) {
      return var0;
   }
}
