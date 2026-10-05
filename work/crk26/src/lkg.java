package com.zelix;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class lkg extends WindowAdapter {
   final lbc d;
   private static final long a = prr.a(6961417427265230361L, 5629920576544805880L, MethodHandles.lookup().lookupClass()).a(183629629070644L);

   lkg(lbc var1) {
      this.d = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      long var2 = a ^ 39536425585031L;
      long var4 = var2 ^ 98357154608814L;
      m44.a<"r">(m44.a<"s">(this, 1367155125732355711L, var2), new Object[]{var4}, 1420897896999355027L, var2);
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      long var2 = a ^ 81517287346236L;
      long var4 = var2 ^ 6666014408353L;
      m44.a<"n">(new Object[]{m44.a<"p">(m44.a<"p">(this, -3800345938295294012L, var2), -3062322269882868989L, var2), var4}, -3109380376350967258L, var2);
   }
}
