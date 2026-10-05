package com.zelix;

import java.io.File;
import java.io.FileFilter;
import java.lang.invoke.MethodHandles;

public abstract class lqo implements FileFilter {
   private static int[] x;
   private static final long a = prr.a(6191554193957508212L, -10091544696326435L, MethodHandles.lookup().lookupClass()).a(52065974171800L);

   @Override
   public String toString() {
      long var1 = a ^ 61835010682919L;
      long var3 = var1 ^ 26057858371239L;
      return m44.a<"r">(this, new Object[]{var3}, 5102452692434916001L, var1);
   }

   public static void v(int[] var0) {
      x = var0;
   }

   @Override
   public abstract boolean accept(File var1);

   public static int[] X() {
      return x;
   }

   public abstract String x(Object[] var1);

   static {
      long var0 = a ^ 125177010674727L;
      if (m44.a<"m">(-5457152425541357373L, var0) != null) {
         m44.a<"m">(new int[1], -5485378169458559305L, var0);
      }
   }
}
