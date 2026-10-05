package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Set;

public class _8w {
   private final Set j;
   private final Set V;
   private final Set w;
   private static final long a = ess.a(-2851978108833559694L, -5680341746153026019L, MethodHandles.lookup().lookupClass()).a(242269518697464L);

   _8w(long var1, Set var3, Set var4, Set var5) {
      var1 = a ^ var1;
      long var6 = var1 ^ 89014146063826L;
      super();
      this.w = x44.a<"u">(new Object[]{var3, var6}, -3178600826603980360L, var1);
      this.j = x44.a<"u">(new Object[]{var4, var6}, -3178600826603980360L, var1);
      this.V = x44.a<"u">(new Object[]{var5, var6}, -3178600826603980360L, var1);
   }

   public boolean J(Object[] var1) {
      ig var2 = (ig)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return x44.a<"o">(this, 8938351574978229780L, var3).contains(var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void D(Object[] var1) {
      long var3 = (Long)var1[0];
      _ue var2 = (_ue)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 81219236449555L;
      long var7 = var3 ^ 67419642683193L;
      hk[] var10000 = x44.a<"t">(5062177714886924888L, var3);
      Iterator var10 = x44.a<"h">(this, 4717614909068639945L, var3).iterator();
      hk[] var9 = var10000;

      label61:
      while (true) {
         if (var10.hasNext()) {
            var17 = var10;
            if (var3 > 0L) {
               if (var9 != null) {
                  break;
               }

               var17 = var10.next();
            }
         } else {
            var17 = x44.a<"h">(this, 4894300298292513267L, var3);
            if (var3 > 0L) {
               var17 = var17.iterator();
               break;
            }
         }

         do {
            ir var11 = (ir)var17;

            try {
               if (var3 > 0L && !x44.a<"l">(var2, new Object[]{var5, var11}, 6612858900130511660L, var3)) {
                  var10.remove();
               }
            } catch (gj var14) {
               throw x44.a<"t">(var14, 6831882131864598298L, var3);
            }

            if (var9 == null) {
               continue label61;
            }

            var17 = x44.a<"h">(this, 4894300298292513267L, var3);
         } while (var3 <= 0L);

         var17 = var17.iterator();
         break;
      }

      Object var16 = var17;

      while (var16.hasNext()) {
         ig var12 = (ig)var16.next();

         try {
            if (var3 >= 0L && !x44.a<"l">(var2, new Object[]{var7, var12}, 4666356049754532124L, var3)) {
               var16.remove();
            }
         } catch (gj var13) {
            throw x44.a<"t">(var13, 6831882131864598298L, var3);
         }

         if (var9 != null) {
            break;
         }
      }
   }

   void k(Object[] var1) {
      long var2 = (Long)var1[0];
      hy var4 = (hy)var1[1];
      var2 = a ^ var2;
      hk[] var10000 = x44.a<"v">(-3856634176109128094L, var2);
      boolean var6 = x44.a<"j">(this, -3921696140500974368L, var2).remove(var4);
      ir[] var7 = x44.a<"n">(var4, new Object[0], -3859350062235839040L, var2);
      hk[] var5 = var10000;

      for (ir var10 : var7) {
         x44.a<"j">(this, -3656261360258977037L, var2).remove(var10);
         if (var5 != null) {
            break;
         }
      }

      for (ig var15 : var4.y()) {
         x44.a<"j">(this, -3470586078542838327L, var2).remove(var15);
         if (var5 != null) {
            break;
         }
      }
   }

   public Set h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, -5396957277986242811L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
