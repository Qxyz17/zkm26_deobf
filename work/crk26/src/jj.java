package com.zelix;

public abstract class jj extends l7 {
   protected lkc s;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void F(zn var1, lkc var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 57575302862294L;
      long var9 = var3 ^ 48288077451185L;
      long var11 = var3 ^ 40963790843354L;
      int[] var10000 = m44.a<"h">(-3779571992638565438L, var3);
      m44.a<"t">(this, var2, -2970927071146353826L, var3);
      int[] var13 = var10000;
      int var14 = this.y(var9);
      Object[] var10006 = new Object[]{null, null, null, var7};
      var10006[2] = var14;
      var10006[1] = var2;
      var10006[0] = var1;
      m44.a<"w">(this, var10006, -3281847545335075878L, var3);
      int var15 = 0;

      label41:
      while (var15 < var14) {
         try {
            this.g(var15).F(this, var2, var5);
            var15++;
         } catch (n9 var17) {
            boolean var10001 = false;
            throw m44.a<"h">(var17, -3529604254849831430L, var3);
         }

         while (true) {
            try {
               var10000 = var13;
               if (var3 > 0L) {
                  if (var13 != null) {
                     return;
                  }

                  var10000 = var13;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (n9 var16) {
               boolean var20 = false;
               throw m44.a<"h">(var16, -3529604254849831430L, var3);
            }

            if (var3 >= 0L) {
               break label41;
            }
         }
      }

      m44.a<"w">(this, new Object[]{var11, var2}, -3606347389108561820L, var3);
   }

   protected abstract void O(Object[] var1);

   public jj(int var1) {
      super(var1);
   }

   protected abstract void k(Object[] var1);

   private static n9 a(n9 var0) {
      return var0;
   }
}
