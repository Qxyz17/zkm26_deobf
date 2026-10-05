package com.zelix;

import java.lang.invoke.MethodHandles;

public class jh extends j0 {
   private static final long b = ess.a(1178130048672448065L, -1167805728925857922L, MethodHandles.lookup().lookupClass()).a(15651824910843L);

   public jh(int var1, long var2) {
      var2 = b ^ var2;
      long var10001 = var2 ^ 12884302601536L;
      int var4 = (int)((var2 ^ 12884302601536L) >>> 32);
      int var5 = (int)((var2 ^ 12884302601536L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      super(var4, (short)var5, (short)var6, var1);
   }
}
