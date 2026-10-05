package com.zelix;

import java.lang.invoke.MethodHandles;

public abstract class _qw extends _ni {
   protected String r;
   private static final long c = ess.a(-3816757224254178576L, -1831015180356889346L, MethodHandles.lookup().lookupClass()).a(205217171703982L);

   public void K(Object[] var1) {
      long var2 = (Long)var1[0];
      az var5 = (az)var1[1];
      _uu var4 = (_uu)var1[2];
      long var6 = var2 ^ 0L;
      super.K(new Object[]{var6, var5, var4});
   }

   public final void u(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = c ^ var3;
      x44.a<"w">(this, var2.trim(), -8644242391379360791L, var3);
   }

   public _qw(int var1, short var2, short var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var7 = var5 ^ 62189498367716L;
      super(var7, var4);
   }

   public final String h(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      return x44.a<"m">(this, -2757260277516627364L, var2);
   }
}
