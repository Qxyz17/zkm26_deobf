package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class j0 extends ju {
   private String g;
   private zw F;
   private static final long d = ess.a(-5690465558948853542L, 8640266309405756446L, MethodHandles.lookup().lookupClass()).a(134775598431255L);

   public j0(int var1, short var2, short var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ d;
      long var7 = var5 ^ 57889233978688L;
      super(var7, var4);
   }

   protected void x(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      String var5 = (String)var1[2];
      long var6 = ((long)var4 << 56 | var2 << 8 >>> 8) ^ d;
      x44.a<"p">(this, var5, 7843718256310116627L, var6);
   }

   protected String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"j">(this, 3066712684268365638L, var2);
   }

   protected int b(Object[] var1) {
      long var2 = (Long)var1[0];

      try {
         if (x44.a<"m">(this, 6915751275118256050L, var2) != null) {
            return 1;
         }
      } catch (IllegalArgumentException var4) {
         throw x44.a<"q">(var4, 6530837271123654988L, var2);
      }

      return 0;
   }

   protected String F(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];

      try {
         if (var4 == 0) {
            return x44.a<"k">(x44.a<"o">(this, 9161403511646257000L, var2), new Object[0], 7128961841489322451L, var2);
         }
      } catch (IllegalArgumentException var5) {
         throw x44.a<"s">(var5, 8824883964782369174L, var2);
      }

      throw new IllegalArgumentException(x44.a<"s">(var4, 8796888957198489728L, var2));
   }

   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      x44.a<"r">(this, (zw)this.e(0), 8681199844927993906L, var3);
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
      return var0;
   }
}
