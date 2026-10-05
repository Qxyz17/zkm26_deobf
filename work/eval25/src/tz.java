package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class tz implements Comparator {
   final _88 l;
   private static final long a = ess.a(8521204023667859414L, 7174115811620985325L, MethodHandles.lookup().lookupClass()).a(82098781983382L);

   public int s(Object[] var1) {
      hy var4 = (hy)var1[0];
      long var2 = (Long)var1[1];
      hy var5 = (hy)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 71990007900734L;
      return var4.o(var6).compareTo(var5.o(var6));
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 27617665062974L;
      long var5 = var3 ^ 17563884150431L;
      return x44.a<"o">(this, new Object[]{(hy)var1, var5, (hy)var2}, 5102828793255931653L, var3);
   }

   tz(_88 var1) {
      this.l = var1;
   }
}
