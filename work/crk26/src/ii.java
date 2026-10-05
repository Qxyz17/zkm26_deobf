package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

public class ii {
   Map V;
   private static final long a = prr.a(-2569916936827418247L, -9096067232648220601L, MethodHandles.lookup().lookupClass()).a(115940666658119L);

   public lqh q(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      return (lqh)m44.a<"r">(this, -1491248423617414855L, var3).get(var2);
   }

   public void S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      m44.a<"u">(this, -4327579122238746234L, var2).clear();
   }

   public Enumeration i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 33915994678207L;
      return new l68(var4, m44.a<"u">(this, -5613344341186420626L, var2).keySet());
   }

   public int y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"u">(this, -5928677915590885426L, var2).size();
   }

   public void A(Object[] var1) {
      Object var2 = var1[0];
      Object var5 = var1[1];
      Object var6 = var1[2];
      Object var7 = var1[3];
      long var3 = (Long)var1[4];
      var3 = a ^ var3;
      long var8 = var3 ^ 52583622127391L;
      long var10 = var3 ^ 130595786092915L;
      String var10000 = m44.a<"j">(-3333720150263148662L, var3);
      lqh var13 = (lqh)m44.a<"t">(this, -3755922200140179049L, var3).get(var2);
      String var12 = var10000;

      label21: {
         label20: {
            try {
               var16 = var13;
               if (var12 != null) {
                  break label21;
               }

               if (var13 != null) {
                  break label20;
               }
            } catch (n9 var14) {
               throw m44.a<"j">(var14, -3596359260490618824L, var3);
            }

            var13 = new lqh(var8);
            m44.a<"t">(this, -3755922200140179049L, var3).put(var2, var13);
         }

         var16 = var13;
      }

      m44.a<"u">(var16, var5, var6, var7, var10, -3525506543108142883L, var3);
   }

   public ii(char var1, int var2, short var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 118492339419632L;
      super();
      Object[] var10004 = new Object[]{null, var7};
      var10004[0] = var4;
      m44.a<"v">(this, m44.a<"j">(var10004, 4409349410297985233L, var5), 2697788965743687431L, var5);
   }

   public Set y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, -3810260453642331800L, var2).entrySet();
   }

   private static n9 a(n9 var0) {
      return var0;
   }
}
