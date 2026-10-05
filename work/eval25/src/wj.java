package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class wj implements Comparator {
   final ao m;
   private static final long a = ess.a(-7840652575168106368L, 1415245772077765443L, MethodHandles.lookup().lookupClass()).a(273618404777143L);

   wj(ao var1) {
      this.m = var1;
   }

   public int R(Object[] var1) {
      sm var2 = (sm)var1[0];
      long var3 = (Long)var1[1];
      sm var5 = (sm)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 121621313677061L;
      return x44.a<"j">(var2, new Object[]{var6}, 7926124237332710640L, var3) - x44.a<"j">(var5, new Object[]{var6}, 7926124237332710640L, var3);
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 38068734542180L;
      long var5 = var3 ^ 34112594913229L;
      return x44.a<"h">(this, new Object[]{(sm)var1, var5, (sm)var2}, 8602160749019756598L, var3);
   }
}
