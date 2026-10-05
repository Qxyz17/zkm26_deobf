package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;

public class t3 extends LinkedHashSet implements w8 {
   private String B;
   private static final long a = ess.a(5032543688570172715L, -5972911390625587015L, MethodHandles.lookup().lookupClass()).a(46058331355146L);

   public t3(String var1, long var2, Map var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 52047239336015L;
      this(var1, var5, var4.keySet());
   }

   @Override
   public Object clone() {
      return super.clone();
   }

   public t3(String var1, long var2, Collection var4) {
      var2 = a ^ var2;
      super(var4);
      x44.a<"u">(this, var1, 3815291645450070325L, var2);
   }

   public t3() {
   }

   public t3(Collection var1) {
      super(var1);
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"o">(this, 261207384038645336L, var2);
   }
}
