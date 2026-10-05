package com.zelix;

import java.lang.invoke.MethodHandles;

public class _os extends _of {
   private static final long a = ess.a(5572197995927388614L, -3613829690680200643L, MethodHandles.lookup().lookupClass()).a(260851832447817L);

   public _os(int var1, char var2, int var3, short var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 78504395744414L;
      super(var3, var7);
   }

   public void B(Object[] var1) {
      long var3 = (Long)var1[0];
      t9 var2 = (t9)var1[1];
      _fs var5 = (_fs)var1[2];
      long var6 = var3 ^ 0L;
      super.B(new Object[]{var6, var2, var5});
   }
}
