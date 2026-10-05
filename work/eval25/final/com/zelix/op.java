package com.zelix;

public abstract class op extends y1 {
   protected aa B;

   public op(int var1) {
      super(var1);
   }

   protected abstract void N(Object[] var1);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 120958788170568L;
      long var9 = var3 ^ 1133881831266L;
      long var11 = var3 ^ 27972676147611L;
      x44.a<"v">(this, var2, 7833814698005038071L, var3);
      int var14 = this.u(var9);
      Object[] var10006 = new Object[]{null, null, null, var11};
      var10006[2] = var14;
      var10006[1] = var2;
      var10006[0] = var1;
      x44.a<"m">(this, var10006, 8584940099637413346L, var3);
      int var10000 = x44.a<"u">(8293401855148283125L, var3);
      int var15 = 0;
      int var13 = var10000;

      label41:
      while (var15 < var14) {
         try {
            this.a(var15).h(this, var2, var5);
            var15++;
         } catch (gj var17) {
            boolean var10001 = false;
            throw x44.a<"u">(var17, 8365724689008631763L, var3);
         }

         while (true) {
            try {
               var10000 = var13;
               if (var3 >= 0L) {
                  if (var13 != 0) {
                     return;
                  }

                  var10000 = var13;
               }

               if (var10000 == 0) {
                  break;
               }
            } catch (gj var16) {
               boolean var20 = false;
               throw x44.a<"u">(var16, 8365724689008631763L, var3);
            }

            if (var3 > 0L) {
               break label41;
            }
         }
      }

      x44.a<"m">(this, new Object[]{var2, var7}, 8477630612032335656L, var3);
   }

   protected abstract void x(Object[] var1);

   private static gj b(gj var0) {
      return var0;
   }
}
