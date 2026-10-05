package com.zelix;

import java.lang.invoke.MethodHandles;

public class ni extends j0 {
   private static final long b = ess.a(1151989364957473734L, 5668181875041279812L, MethodHandles.lookup().lookupClass()).a(237981844911620L);

   public ni(long var1, int var3) {
      var1 = b ^ var1;
      long var10001 = var1 ^ 97246063366333L;
      int var4 = (int)((var1 ^ 97246063366333L) >>> 32);
      int var5 = (int)((var1 ^ 97246063366333L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      super(var4, (short)var5, (short)var6, var3);
   }
}
