package com.zelix;

import java.lang.invoke.MethodHandles;

public class f9 extends f2 {
   private static final long c = ess.a(-5901337676121709108L, -151724321922374330L, MethodHandles.lookup().lookupClass()).a(125981436386408L);

   public f9(byte var1, int var2, long var3) {
      long var5 = ((long)var1 << 56 | var3 << 8 >>> 8) ^ c;
      long var7 = (var5 ^ 24283117839389L) >>> 32;
      int var9 = (int)((var5 ^ 24283117839389L) << 32 >>> 32);
      super(var7, var2, var9);
   }
}
