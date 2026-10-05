package com.zelix;

import java.lang.invoke.MethodHandles;

public class fp extends f2 {
   private static final long c = ess.a(6615746890910106389L, -4643509379253717893L, MethodHandles.lookup().lookupClass()).a(153935998916486L);

   public fp(int var1, long var2) {
      var2 = c ^ var2;
      long var4 = (var2 ^ 42825106749620L) >>> 32;
      int var6 = (int)((var2 ^ 42825106749620L) << 32 >>> 32);
      super(var4, var1, var6);
   }
}
