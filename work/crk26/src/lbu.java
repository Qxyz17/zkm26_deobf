package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.swing.JFrame;

public class lbu implements Runnable {
   final JFrame W;
   final String d;
   final String F;
   final String M;
   private static final long a = prr.a(259071220761841226L, 5976718753562459467L, MethodHandles.lookup().lookupClass()).a(99464536785954L);

   lbu(JFrame var1, String var2, String var3, String var4) {
      this.W = var1;
      this.F = var2;
      this.d = var3;
      this.M = var4;
   }

   @Override
   public void run() {
      long var1 = a ^ 133933172970901L;
      long var3 = var1 ^ 115944181601907L;
      new lbg(
         m44.a<"w">(this, -4871026773762022885L, var1),
         var3,
         m44.a<"w">(this, -4711762782058654276L, var1),
         m44.a<"w">(this, -4768363723907417218L, var1),
         m44.a<"w">(this, -4696586197888861978L, var1)
      );
   }
}
