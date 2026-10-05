package com.zelix;

import java.lang.invoke.MethodHandles;

public class _d_ extends _s3 {
   final di m;
   private static final long a = ess.a(8936974793422764887L, -2365087605738068910L, MethodHandles.lookup().lookupClass()).a(87284835722167L);

   public void c(Object[] var1) {
      po var2 = (po)var1[0];
      long var3 = (Long)var1[1];
      Integer var5 = (Integer)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 65804360988115L;
      int[] var8 = x44.a<"r">(331018954994022658L, var3);

      po var10000;
      label20: {
         try {
            var10000 = var2;
            if (var8 == null) {
               break label20;
            }

            if (var2 == null) {
               return;
            }
         } catch (gj var10) {
            throw x44.a<"r">(var10, 1990424842751242506L, var3);
         }

         var10000 = var2;
      }

      po var9 = var10000;
      x44.a<"j">(
         x44.a<"n">(x44.a<"n">(this, 1851147723342951474L, var3), 315638749718864723L, var3),
         x44.a<"j">(var9, new Object[]{var6}, 2182338810146229099L, var3),
         160466984035350266L,
         var3
      );
      x44.a<"j">(x44.a<"n">(x44.a<"n">(this, 1851147723342951474L, var3), 315638749718864723L, var3), 0, 335489376698366189L, var3);
   }

   _d_(di var1) {
      this.m = var1;
   }

   public void e(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public void U(Object[] var1) {
      Object var2 = var1[0];
      long var4 = (Long)var1[1];
      Object var3 = var1[2];
      long var6 = var4 ^ 101857611397558L;
      x44.a<"l">(this, new Object[]{(po)var2, var6, (Integer)var3}, 8949097192465123733L, var4);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
