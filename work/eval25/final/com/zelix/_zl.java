package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public abstract class _zl implements DocumentListener {
   private static final long b = ess.a(7394033462714716808L, 8256241545287080318L, MethodHandles.lookup().lookupClass()).a(122674185803622L);

   @Override
   public void insertUpdate(DocumentEvent var1) {
      long var2 = b ^ 115888685633370L;
      long var4 = var2 ^ 122733372000214L;
      x44.a<"m">(this, new Object[]{var4, var1}, -7563231507428017420L, var2);
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      long var2 = b ^ 124733891084181L;
      long var4 = var2 ^ 131630676997913L;
      x44.a<"j">(this, new Object[]{var4, var1}, -6357647726531720645L, var2);
   }

   public abstract void K(Object[] var1);

   @Override
   public void removeUpdate(DocumentEvent var1) {
      long var2 = b ^ 98893010997179L;
      long var4 = var2 ^ 104690535630647L;
      x44.a<"l">(this, new Object[]{var4, var1}, -2888160227649144299L, var2);
   }
}
