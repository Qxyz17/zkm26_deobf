package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class _y2 implements Iterator {
   private Iterator r;
   final _ov K;
   private static final long a = ess.a(-2021991676958677376L, -2400308996788247584L, MethodHandles.lookup().lookupClass()).a(131645660353007L);

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean hasNext() {
      return this.r.hasNext();
   }

   _y2(long var1, _ov var3) {
      var1 = a ^ var1;
      this.K = var3;
      super();
      this.r = x44.a<"w">(new Object[]{x44.a<"k">(this, -5127690813105609773L, var1)}, -4623241706364748234L, var1).iterator();
   }

   @Override
   public Object next() {
      return this.r.next();
   }
}
