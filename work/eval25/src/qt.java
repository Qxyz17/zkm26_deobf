package com.zelix;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class qt extends WindowAdapter {
   final u4 O;
   private static final long a = ess.a(-4570188917929315988L, 1644526292943125180L, MethodHandles.lookup().lookupClass()).a(192967294384705L);

   @Override
   public void windowClosing(WindowEvent var1) {
      long var2 = a ^ 90480519683381L;
      long var4 = var2 ^ 26170141550844L;
      long var6 = var2 ^ 134362336719254L;
      x44.a<"k">(x44.a<"o">(this, 1110500070542199019L, var2), new Object[]{var4}, 624538687006537870L, var2);
      x44.a<"k">(x44.a<"o">(x44.a<"o">(this, 1110500070542199019L, var2), 1584342705769839604L, var2), new Object[]{var6}, 1723301876132509633L, var2);
   }

   qt(u4 var1) {
      this.O = var1;
   }
}
