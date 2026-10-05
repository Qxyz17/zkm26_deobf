package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public abstract class u6 implements DocumentListener {
   private static final long b = prr.a(-1451238476083692746L, -2420601772401789253L, MethodHandles.lookup().lookupClass()).a(106594321970680L);

   public abstract void B(Object[] var1);

   @Override
   public void changedUpdate(DocumentEvent var1) {
      long var2 = b ^ 22390900419684L;
      long var4 = var2 ^ 74984804917418L;
      m44.a<"t">(this, new Object[]{var4, var1}, -5316922267029006379L, var2);
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      long var2 = b ^ 113215100578691L;
      long var4 = var2 ^ 60028523980621L;
      m44.a<"s">(this, new Object[]{var4, var1}, -5633706313093541838L, var2);
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      long var2 = b ^ 126139904052105L;
      long var4 = var2 ^ 38305591658311L;
      m44.a<"q">(this, new Object[]{var4, var1}, -7936721630668443592L, var2);
   }
}
