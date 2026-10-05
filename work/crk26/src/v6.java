package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class v6 implements Comparator {
   final hf f;
   private static final long a = prr.a(-8726247831051398326L, 4104041821653195495L, MethodHandles.lookup().lookupClass()).a(109391562364281L);

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 59937604410757L;
      long var5 = var3 ^ 38959891103427L;
      return m44.a<"r">(this, new Object[]{(b0)var1, var5, (b0)var2}, 4923199403363895517L, var3);
   }

   public int h(Object[] var1) {
      b0 var4 = (b0)var1[0];
      long var2 = (Long)var1[1];
      b0 var5 = (b0)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 128199003406014L;
      String var8 = var4.d(var6);
      String var9 = var5.d(var6);
      return var8.compareTo(var9);
   }

   v6(hf var1) {
      this.f = var1;
   }
}
