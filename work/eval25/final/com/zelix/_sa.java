package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class _sa implements Comparator {
   final _ue k;
   private static final long a = ess.a(-8270397362535485023L, 6578804409359614174L, MethodHandles.lookup().lookupClass()).a(96698112767319L);

   _sa(_ue var1) {
      this.k = var1;
   }

   public int M(Object[] var1) {
      i8 var5 = (i8)var1[0];
      i8 var4 = (i8)var1[1];
      long var2 = (Long)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 121427047911140L;
      String var8 = var5.w(var6);
      String var9 = var4.w(var6);
      return var8.compareTo(var9);
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 105225884683156L;
      long var5 = var3 ^ 122201371981307L;
      return x44.a<"l">(this, new Object[]{(i8)var1, (i8)var2, var5}, -4375220250569968837L, var3);
   }
}
