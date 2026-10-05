package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class _rn implements Iterator {
   final sq n;
   private Iterator p;
   private static final long a = ess.a(8809430103983311035L, 3484313633628105744L, MethodHandles.lookup().lookupClass()).a(96949546443743L);

   @Override
   public Object next() {
      return this.p.next();
   }

   _rn(long var1, sq var3) {
      var1 = a ^ var1;
      this.n = var3;
      super();
      this.p = x44.a<"u">(new Object[]{x44.a<"i">(this, -4211703572653917029L, var1)}, -2449318917234720058L, var1).iterator();
   }

   @Override
   public boolean hasNext() {
      return this.p.hasNext();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
