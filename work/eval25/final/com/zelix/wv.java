package com.zelix;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class wv extends WindowAdapter {
   final gv G;
   private static final long a = ess.a(1546926305510843778L, 7265632521129347840L, MethodHandles.lookup().lookupClass()).a(243509994099568L);

   @Override
   public void windowActivated(WindowEvent var1) {
      long var2 = a ^ 119314437032408L;
      long var4 = var2 ^ 31197497356533L;
      x44.a<"u">(new Object[]{x44.a<"i">(x44.a<"i">(this, 4161145074859176619L, var2), 2869312809500381190L, var2), var4}, 4475533491512039042L, var2);
   }

   wv(gv var1) {
      this.G = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      long var2 = a ^ 115576616649978L;
      long var4 = var2 ^ 95687831670098L;
      x44.a<"o">(x44.a<"k">(this, -820395104239599735L, var2), new Object[]{var4}, -624076408795011645L, var2);
   }
}
