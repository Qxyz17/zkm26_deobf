package com.zelix;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class xo extends WindowAdapter {
   final s7 i;
   private static final long a = ess.a(-4979993723560241308L, 5914159041655149755L, MethodHandles.lookup().lookupClass()).a(211804377954501L);

   @Override
   public void windowActivated(WindowEvent var1) {
      long var2 = a ^ 73720368084849L;
      long var4 = var2 ^ 44345484720318L;
      x44.a<"v">(new Object[]{x44.a<"j">(x44.a<"j">(this, 8208304725243339489L, var2), 8272327426851791071L, var2), var4}, 8527422909639171785L, var2);
   }

   xo(s7 var1) {
      this.i = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      long var2 = a ^ 82187091279240L;
      long var4 = var2 ^ 12714257326493L;
      x44.a<"o">(x44.a<"k">(this, 4256121668511033368L, var2), new Object[]{var4}, 4354946812659156998L, var2);
   }

   @Override
   public void windowClosed(WindowEvent var1) {
   }
}
