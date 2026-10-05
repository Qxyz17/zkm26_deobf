package com.zelix;

import java.io.File;
import java.io.FileFilter;
import java.lang.invoke.MethodHandles;

public abstract class pt implements FileFilter {
   private static int[] e;
   private static final long a = ess.a(5856414705850535621L, -7873608731780478773L, MethodHandles.lookup().lookupClass()).a(122953243401129L);

   public static int[] U() {
      return e;
   }

   @Override
   public String toString() {
      long var1 = a ^ 105416147302402L;
      long var3 = var1 ^ 137202881856312L;
      return x44.a<"j">(this, new Object[]{var3}, 1142359218724923449L, var1);
   }

   public abstract String H(Object[] var1);

   public static void v(int[] var0) {
      e = var0;
   }

   @Override
   public abstract boolean accept(File var1);

   static {
      long var0 = a ^ 55298833902796L;
      if (x44.a<"t">(-7021437084689482588L, var0) == null) {
         x44.a<"t">(new int[4], -9002099645666593889L, var0);
      }
   }
}
