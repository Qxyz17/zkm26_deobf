package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class a {
   private final String h;
   private final xl[] Y;
   private final md A;
   private final int v;
   private final List K;
   private final List D;
   private String X;
   private final bc b;
   private static final long a = ess.a(8225340531389844039L, 6407538654463437866L, MethodHandles.lookup().lookupClass()).a(280572722078211L);

   public a(short var1, bc var2, List var3, short var4, int var5, int var6) {
      long var7 = ((long)var1 << 48 | (long)var4 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ a;
      long var9 = var7 ^ 98364457533302L;
      super();
      this.K = new ArrayList();
      this.b = var2;
      this.D = var3;
      this.v = var5;
      xl[] var11 = x44.a<"k">(x44.a<"o">(this, 7054240782032107798L, var7), new Object[0], 7234447677468157967L, var7);
      this.A = (md)var11[0];
      this.h = x44.a<"k">(x44.a<"o">(this, 8691608293758865791L, var7), var9, 8682046050149735763L, var7);
      this.Y = new xl[var11.length - 1];
      System.arraycopy(var11, 1, x44.a<"o">(this, 9061371756515051967L, var7), 0, x44.a<"o">(this, 9061371756515051967L, var7).length);
   }

   public void h(Object[] var1) {
      sj var2 = (sj)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"l">(this, -2495607155993777022L, var3).add(var2);
   }

   List x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 7375462122384775045L, var2);
   }

   List n(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 2101948168193740049L, var2);
   }

   String e(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, -1376188847254558860L, var2);
   }

   xl[] d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -7690130730884685512L, var2);
   }

   bc d(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      long var5 = (var3 << 8 | (long)var2 << 56 >>> 56) ^ a;
      return x44.a<"l">(this, -5731147157019350907L, var5);
   }

   md d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, 8962369444900443521L, var2);
   }

   void Z(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = a ^ var3;
      x44.a<"u">(this, var2, 4974408662768750234L, var3);
   }
}
