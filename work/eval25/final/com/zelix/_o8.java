package com.zelix;

import java.lang.invoke.MethodHandles;

public class _o8 extends _k6 implements la {
   private String u;
   private static final long a = ess.a(-6223987265005335263L, -2046660182540041112L, MethodHandles.lookup().lookupClass()).a(210828584421068L);

   public _o8(int var1, char var2, short var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = (var5 ^ 28296480107846L) >>> 16;
      int var9 = (int)((var5 ^ 28296480107846L) << 48 >>> 48);
      super(var7, (char)var9, var1);
   }

   public void K(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"q">(this, var2, -7293271737068090275L, var3);
   }

   public void B(Object[] var1) {
      long var3 = (Long)var1[0];
      t9 var5 = (t9)var1[1];
      _fs var2 = (_fs)var1[2];
      long var6 = var3 ^ 0L;
      long var8 = var3 ^ 35982445323920L;
      super.B(new Object[]{var6, var5, var2});
      _os var10 = (_os)var5;
      x44.a<"o">(var10, new Object[]{x44.a<"k">(this, -8961001812041001680L, var3), var8}, -9116289342586985358L, var3);
   }
}
