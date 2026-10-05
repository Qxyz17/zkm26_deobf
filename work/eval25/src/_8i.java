package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.Map.Entry;

public class _8i implements Comparator {
   final a9 V;
   private static final long a = ess.a(7193355190576972056L, -746541821261287724L, MethodHandles.lookup().lookupClass()).a(163596701765183L);

   public int D(Object[] var1) {
      Entry var2 = (Entry)var1[0];
      Entry var3 = (Entry)var1[1];
      String var4 = (String)var2.getKey();
      String var5 = (String)var3.getKey();
      return var4.compareTo(var5);
   }

   _8i(a9 var1) {
      this.V = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      long var3 = a ^ 30156384399956L;
      return x44.a<"j">(this, new Object[]{(Entry)var1, (Entry)var2}, -6428059189942859789L, var3);
   }
}
