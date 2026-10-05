package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.swing.JFrame;

public class a6 implements Runnable {
   final String T;
   final String V;
   final JFrame v;
   final String B;
   private static final long a = ess.a(6204136340011324981L, -8614116308006692789L, MethodHandles.lookup().lookupClass()).a(220494571964416L);

   @Override
   public void run() {
      long var1 = a ^ 70249690401426L;
      long var10001 = var1 ^ 72024942860708L;
      int var3 = (int)((var1 ^ 72024942860708L) >>> 48);
      int var4 = (int)((var1 ^ 72024942860708L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      new gv(
         (short)var3,
         (char)var4,
         x44.a<"l">(this, 95434629805444984L, var1),
         x44.a<"l">(this, 419943992766057620L, var1),
         var5,
         x44.a<"l">(this, 1758593335701146088L, var1),
         x44.a<"l">(this, 464767002717359977L, var1)
      );
   }

   a6(JFrame var1, String var2, String var3, String var4) {
      this.v = var1;
      this.V = var2;
      this.T = var3;
      this.B = var4;
   }
}
