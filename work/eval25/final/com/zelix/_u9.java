package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class _u9 extends _u4 {
   protected List f;
   private static final long y = ess.a(-605645454570021464L, 4701179222993860422L, MethodHandles.lookup().lookupClass()).a(139554585652947L);

   public abstract void G(Object[] var1);

   public _u9(pk var1, List var2, List var3, char var4, int var5, _ur var6, short var7) {
      long var8 = ((long)var4 << 48 | (long)var5 << 32 >>> 16 | (long)var7 << 48 >>> 48) ^ y;
      long var10 = (var8 ^ 41566968882756L) >>> 8;
      int var12 = (int)((var8 ^ 41566968882756L) << 56 >>> 56);
      super(var1, var10, var2, (byte)var12, var6);
      x44.a<"w">(this, var3, -6790621222722014299L, var8);
   }
}
