package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.swing.JTextField;

public class ld extends JTextField {
   boolean U;
   private static final long a = ess.a(-8396438090089815559L, 7765099021443513248L, MethodHandles.lookup().lookupClass()).a(252602787150711L);

   @Override
   public void setText(String var1) {
      long var2 = a ^ 22247025801967L;
      x44.a<"t">(this, true, 1858951315647628752L, var2);
      super.setText(var1);
      x44.a<"t">(this, false, 1858951315647628752L, var2);
   }

   public boolean Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, 8936864702350188570L, var2);
   }
}
