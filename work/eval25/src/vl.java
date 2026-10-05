package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

public class vl {
   Map a;
   private static final long b = ess.a(-491770996475751401L, -4878150633226845954L, MethodHandles.lookup().lookupClass()).a(176932398470856L);

   public void Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      x44.a<"k">(this, 6879271555989301646L, var2).clear();
   }

   public void l(Object[] var1) {
      long var2 = (Long)var1[0];
      Object var6 = var1[1];
      Object var5 = var1[2];
      Object var4 = var1[3];
      Object var7 = var1[4];
      var2 = b ^ var2;
      long var8 = var2 ^ 110175999036750L;
      long var10 = var2 ^ 4187882220927L;
      String var10000 = x44.a<"w">(-1328952623366278006L, var2);
      vg var13 = (vg)x44.a<"k">(this, -1218159991774946834L, var2).get(var6);
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
            } catch (gj var14) {
               throw x44.a<"w">(var14, -1515456898791257689L, var2);
            }

            var13 = new vg(var8);
            x44.a<"k">(this, -1218159991774946834L, var2).put(var6, var13);
         }

         var16 = var13;
      }

      x44.a<"o">(var16, var5, var4, var10, var7, -933634948418869440L, var2);
   }

   public int j(Object[] var1) {
      int var4 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      long var5 = ((long)var4 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      return x44.a<"m">(this, -6643254234729540296L, var5).size();
   }

   public vl(long var1, int var3) {
      var1 = b ^ var1;
      long var4 = var1 ^ 95404371919289L;
      super();
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var3;
      x44.a<"w">(this, x44.a<"t">(var10004, 4592194854130890761L, var1), 2401325199225493413L, var1);
   }

   public Set L(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"h">(this, 5995249242840556997L, var2).entrySet();
   }

   public vg t(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      return (vg)x44.a<"m">(this, -1488971441708966496L, var3).get(var2);
   }

   public Enumeration O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var10001 = var2 ^ 27827341062528L;
      int var4 = (int)((var2 ^ 27827341062528L) >>> 48);
      int var5 = (int)((var2 ^ 27827341062528L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return new _8g((short)var4, var5, (short)var6, x44.a<"j">(this, -8723098424948936697L, var2).keySet());
   }

   private static gj a(gj var0) {
      return var0;
   }
}
