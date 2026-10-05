package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;

public class eh {
   private static String[] r;
   private final _ry C;
   private final Set V;
   private final _ry e;
   private static final long a = ess.a(1442517484653664335L, 6808555049071671140L, MethodHandles.lookup().lookupClass()).a(86558241889183L);

   public static void J(String[] var0) {
      r = var0;
   }

   public eh(char[] var1, char[] var2, char[] var3, char[] var4, List var5, long var6, boolean var8) {
      var6 = a ^ var6;
      int var9 = (int)((var6 ^ 65114510755215L) >>> 32);
      int var10 = (int)((var6 ^ 65114510755215L) << 32 >>> 32);
      long var11 = var6 ^ 103271065280107L;
      x44.a<"r">(-4492548328995076147L, var6);
      super();
      this.V = x44.a<"r">(new Object[]{var11}, -2418573543958816861L, var6);

      try {
         this.e = new _ry(var9, var10, var1, var2, var5, var8);
         this.C = new _ry(var9, var10, var3, var4, var5, var8);
         if (x44.a<"r">(-4352382669750326474L, var6) == null) {
            x44.a<"r">(new String[2], -2426849628363777733L, var6);
         }
      } catch (gj var14) {
         throw x44.a<"r">(var14, -2838830585163851207L, var6);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final String s(Object[] var1) {
      String var5;
      long var6;
      long var8;
      String[] var10;
      _ry var11;
      long var13;
      label45: {
         _ry var10000;
         label44: {
            var5 = (String)var1[0];
            long var2 = (Long)var1[1];
            boolean var4 = (Boolean)var1[2];
            var13 = a ^ var2;
            var6 = var13 ^ 51577341491484L;
            var8 = var13 ^ 131586951256471L;
            var10 = x44.a<"q">(-6182181641793557410L, var13);
            if (var4) {
               var10000 = x44.a<"m">(this, -5951034330972235875L, var13);
               if (var13 <= 0L) {
                  break label44;
               }

               var11 = var10000;
               if (var10 != null) {
                  break label45;
               }
            }

            var10000 = x44.a<"m">(this, -5554828625842652918L, var13);
         }

         var11 = var10000;
      }

      label37:
      while (true) {
         String var15;
         if (var5 != null) {
            var15 = x44.a<"i">(var11, new Object[]{var5, var8}, -5485579457328203335L, var13);
         } else {
            String var12 = x44.a<"i">(var11, new Object[]{var6}, -5791909218052075226L, var13);
            if (!x44.a<"m">(this, -5381465191912353377L, var13).add(var12)) {
               continue;
            }

            var15 = var12;
            if (var13 >= 0L && var10 != null) {
               return var12;
            }
         }

         String var14;
         do {
            var14 = var15;
            if (var10 == null) {
               var14 = x44.a<"i">(var11, new Object[]{var6}, -5791909218052075226L, var13);
            }

            if (!x44.a<"m">(this, -5381465191912353377L, var13).add(var14)) {
               continue label37;
            }

            var15 = var14;
         } while (var13 < 0L || var10 == null);

         return var14;
      }
   }

   public static String[] w() {
      return r;
   }

   static {
      long var0 = a ^ 2805676011988L;
      if (x44.a<"s">(792111796560628884L, var0) == null) {
         x44.a<"s">(new String[3], 1516445876058018402L, var0);
      }
   }

   private static gj a(gj var0) {
      return var0;
   }
}
