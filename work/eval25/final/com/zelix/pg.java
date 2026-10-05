package com.zelix;

import java.lang.invoke.MethodHandles;

public class pg extends ps {
   protected Object F;
   private static final long a = ess.a(7688527243564637731L, -6428018915551072424L, MethodHandles.lookup().lookupClass()).a(24369629826691L);

   public boolean n(long var1) {
      var1 = a ^ var1;

      try {
         if (this.F == null) {
            return true;
         }
      } catch (gj var3) {
         throw x44.a<"t">(var3, 3840506552218083589L, var1);
      }

      return false;
   }

   public Object G() {
      return this.F;
   }

   public pg(long var1, Object var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 4042881728513L;
      super();
      this.G(var4, var3);
   }

   public void G(long var1, Object var3) {
      long var4 = var1 ^ 21188762684934L;
      this.F = var3;
      this.o();
      this.e(var4, var3, null, null);
   }

   public pg(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 118715451960018L;
      super();
      this.G(var3, null);
   }

   public pg r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 45552560157485L;
      this.G(var4, null);
      return this;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
