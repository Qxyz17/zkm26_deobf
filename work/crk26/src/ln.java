package com.zelix;

public class ln extends l7 implements fq {
   private String O;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void F(zn var1, lkc var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 95339696070945L;
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
            throw m44.a<"h">(var15, -3034461851299045727L, var3);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var3 > 0L) {
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
               throw m44.a<"h">(var14, -3034461851299045727L, var3);
            }

            if (var3 >= 0L) {
               break label41;
            }
         }
      }

      m44.a<"w">((ll)var1, new Object[]{m44.a<"v">(this, -2904261335160286027L, var3), var7}, -3094075201148650693L, var3);
   }

   public ln(int var1) {
      super(var1);
   }

   public void e(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      m44.a<"t">(this, var4, 957474882238172749L, var2);
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
