package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Set;

public class mz {
   private final Set X;
   private final Set a;
   private final Set Y;
   private static final long b = prr.a(-8334932907182753479L, -4657382366808803748L, MethodHandles.lookup().lookupClass()).a(193238541553916L);

   void v(Object[] var1) {
      _f var2 = (_f)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      boolean var6 = m44.a<"q">(this, 2108541693799194581L, var3).remove(var2);
      int[] var10000 = m44.a<"o">(380125267643360522L, var3);
      bf[] var7 = m44.a<"p">(var2, new Object[0], 172181230199874746L, var3);
      int[] var5 = var10000;

      for (bf var10 : var7) {
         m44.a<"q">(this, 1793401892943984687L, var3).remove(var10);
         if (var5 != null) {
            break;
         }
      }

      for (bn var15 : var2.I()) {
         m44.a<"q">(this, 208136034537500286L, var3).remove(var15);
         if (var5 != null) {
            break;
         }
      }
   }

   public boolean j(Object[] var1) {
      bn var2 = (bn)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      return m44.a<"v">(this, -7328386823837157679L, var3).contains(var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void F(Object[] var1) {
      hf var4 = (hf)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 138418310618592L;
      long var7 = var2 ^ 61530366506651L;
      int[] var10000 = m44.a<"k">(4186698202408376918L, var2);
      Iterator var10 = m44.a<"u">(this, 2864055969856964467L, var2).iterator();
      int[] var9 = var10000;

      label61:
      while (true) {
         if (var10.hasNext()) {
            var17 = var10;
            if (var2 > 0L) {
               if (var9 != null) {
                  break;
               }

               var17 = var10.next();
            }
         } else {
            var17 = m44.a<"u">(this, 4449319629353505058L, var2);
            if (var2 > 0L) {
               var17 = var17.iterator();
               break;
            }
         }

         do {
            bf var11 = (bf)var17;

            try {
               if (var2 >= 0L && !m44.a<"t">(var4, new Object[]{var11, var7}, 4262767133529131786L, var2)) {
                  var10.remove();
               }
            } catch (n9 var14) {
               throw m44.a<"k">(var14, 2417220759023114000L, var2);
            }

            if (var9 == null) {
               continue label61;
            }

            var17 = m44.a<"u">(this, 4449319629353505058L, var2);
         } while (var2 <= 0L);

         var17 = var17.iterator();
         break;
      }

      Object var16 = var17;

      while (var16.hasNext()) {
         bn var12 = (bn)var16.next();

         try {
            if (var2 > 0L && !m44.a<"t">(var4, new Object[]{var5, var12}, 4309522293439056320L, var2)) {
               var16.remove();
            }
         } catch (n9 var13) {
            throw m44.a<"k">(var13, 2417220759023114000L, var2);
         }

         if (var9 != null) {
            break;
         }
      }
   }

   public Set z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return m44.a<"t">(this, 3275941837149225451L, var2);
   }

   mz(Set var1, char var2, int var3, int var4, Set var5, Set var6) {
      long var7 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var9 = var7 ^ 117008875904747L;
      super();
      this.X = m44.a<"l">(new Object[]{var1, var9}, 4839922608914453304L, var7);
      this.a = m44.a<"l">(new Object[]{var5, var9}, 4839922608914453304L, var7);
      this.Y = m44.a<"l">(new Object[]{var6, var9}, 4839922608914453304L, var7);
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
