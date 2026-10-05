package com.zelix;

public abstract class le extends l7 implements fq {
   protected String f;

   public le(int var1) {
      super(var1);
   }

   public abstract void z(Object[] var1);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public final void F(zn var1, lkc var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 58361475301784L;
      long var9 = var3 ^ 48288077451185L;
      int[] var10000 = m44.a<"h">(-3779571992638565438L, var3);
      int var12 = this.y(var9);
      int[] var11 = var10000;
      int var13 = 0;

      label41:
      while (var13 < var12) {
         try {
            this.g(var13).F(this, var2, var5);
            var13++;
         } catch (n9 var15) {
            boolean var10001 = false;
            throw m44.a<"h">(var15, -3317686801113764369L, var3);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var3 >= 0L) {
                  if (var11 != null) {
                     return;
                  }

                  var10000 = var11;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (n9 var14) {
               boolean var18 = false;
               throw m44.a<"h">(var14, -3317686801113764369L, var3);
            }

            if (var3 >= 0L) {
               break label41;
            }
         }
      }

      m44.a<"w">(this, new Object[]{var7, var1, var2}, -3072193135980757939L, var3);
   }

   public void e(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      m44.a<"t">(this, var4, 1261531383524384515L, var2);
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
