package com.zelix;

import java.lang.invoke.MethodHandles;

public class zx extends jf implements _un, ta {
   private String L;
   private ff d;
   private static final long a = ess.a(7677862977418689825L, -669876422346251799L, MethodHandles.lookup().lookupClass()).a(88272329591372L);

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var4 = (_ur)var1[2];
      long var6 = var2 ^ 51378094327999L;
      long var8 = var2 ^ 75427126383632L;
      long var10 = var2 ^ 0L;
      long var12 = var2 ^ 134528422017690L;
      int[] var10000 = x44.a<"q">(9148277501292601163L, var2);
      int var15 = x44.a<"i">(this, new Object[]{var12}, 7145691849331111744L, var2);
      int[] var14 = var10000;
      int var16 = 0;

      label34: {
         while (var16 < var15) {
            try {
               if (var2 >= 0L) {
                  var19 = this.e(var16);
                  if (var14 != null) {
                     break label34;
                  }

                  x44.a<"i">(var19, new Object[]{var10, this, var4}, 8818198965911889370L, var2);
                  var16++;
               }

               if (var14 == null) {
                  continue;
               }
            } catch (gj var17) {
               throw x44.a<"q">(var17, 7199339574081961048L, var2);
            }

            if (var2 > 0L) {
               break;
            }
         }

         var19 = var5;
      }

      zq var18 = (zq)var19;
      x44.a<"i">(var18, new Object[]{x44.a<"m">(this, 7078609676803133734L, var2), var8}, 8866908244415730107L, var2);
      x44.a<"i">(var18, new Object[]{x44.a<"m">(this, 7311156556235542818L, var2), var6}, 9067835237609672944L, var2);
   }

   public void a(Object[] var1) {
      long var2 = (Long)var1[0];
      ff var4 = (ff)var1[1];
      x44.a<"p">(this, var4, -4367292930423343312L, var2);
   }

   public zx(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 6685619842692L;
      super(var4, var3);
   }

   public void m(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      x44.a<"r">(this, var4, 8515182535304365366L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
