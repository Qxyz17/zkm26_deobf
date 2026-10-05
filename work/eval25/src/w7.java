package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class w7 implements Comparator {
   final _zx L;
   private static final long a = ess.a(1971629129154580788L, 5669849579476237403L, MethodHandles.lookup().lookupClass()).a(126285781841232L);

   w7(_zx var1) {
      this.L = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 90261669941218L;
      long var5 = var3 ^ 41030505866429L;
      return x44.a<"n">(this, new Object[]{(wo)var1, var5, (wo)var2}, -4143817143992672967L, var3);
   }

   public int N(Object[] var1) {
      wo var2 = (wo)var1[0];
      long var4 = (Long)var1[1];
      wo var3 = (wo)var1[2];
      var4 = a ^ var4;
      long var6 = var4 ^ 51050609199347L;
      int var10000 = x44.a<"t">(2400705061184505532L, var4);
      String var11 = x44.a<"l">((qg)var2.G(), new Object[]{var6}, 2647269637388274211L, var4);
      String var12 = x44.a<"l">((qg)var3.G(), new Object[]{var6}, 2647269637388274211L, var4);
      int var13 = var11.compareTo(var12);
      int var8 = var10000;

      label27: {
         try {
            if (var8 != 0) {
               return var13;
            }

            if (var13 == 0) {
               break label27;
            }
         } catch (gj var16) {
            throw x44.a<"t">(var16, 4605639952471548764L, var4);
         }

         return var13;
      }

      String var14 = (String)var2.v();
      String var15 = (String)var3.v();
      return var14.compareTo(var15);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
