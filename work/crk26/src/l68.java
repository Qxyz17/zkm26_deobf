package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class l68 implements Enumeration {
   private Enumeration K;
   private static final long a = prr.a(-8759402806389519300L, 2452586693663677649L, MethodHandles.lookup().lookupClass()).a(18112331495076L);

   @Override
   public final Object nextElement() {
      long var1 = a ^ 62713345978977L;
      return m44.a<"q">(this, -2118012844468124839L, var1).nextElement();
   }

   @Override
   public final boolean hasMoreElements() {
      long var1 = a ^ 30026081579752L;
      return m44.a<"p">(this, 7066830394307101648L, var1).hasMoreElements();
   }

   public l68(long var1, Collection var3) {
      var1 = a ^ var1;
      super();
      ArrayList var4 = new ArrayList(var3);
      m44.a<"q">(this, Collections.enumeration(var4), 6143289979621078147L, var1);
   }
}
