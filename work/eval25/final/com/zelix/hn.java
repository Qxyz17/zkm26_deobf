package com.zelix;

public abstract class hn extends h8 implements yk {
   _op W;
   boolean P = true;
   int c;

   public wd B(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      return x44.a<"l">(-7453813595339780162L, var4);
   }

   public void m(Object[] var1) {
      long var3 = (Long)var1[0];
      w var2 = (w)var1[1];
      long var5 = var3 ^ 11807521485311L;
      var2.u(var5, this.W, this);
   }

   abstract void N(long var1, _8l var3);

   final boolean V(Object[] var1) {
      return this.P;
   }

   hn(h8 var1) {
      super(var1);
   }

   public final void e(Integer var1, long var2, _op var4) {
      this.W = var4;
   }

   public _op y(Object[] var1) {
      return this.W;
   }

   public abstract int z(long var1);
}
