package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class _8g implements Enumeration {
   private Enumeration i;
   private static final long a = ess.a(-2465791602464082869L, 4440375896876822261L, MethodHandles.lookup().lookupClass()).a(217323876430913L);

   @Override
   public final Object nextElement() {
      long var1 = a ^ 61269193421005L;
      return x44.a<"i">(this, -4511211933838750971L, var1).nextElement();
   }

   @Override
   public final boolean hasMoreElements() {
      long var1 = a ^ 86484193230186L;
      return x44.a<"n">(this, 919734556269348514L, var1).hasMoreElements();
   }

   public _8g(short var1, int var2, short var3, Collection var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      super();
      ArrayList var7 = new ArrayList(var4);
      x44.a<"v">(this, Collections.enumeration(var7), 6238817184590421237L, var5);
   }
}
