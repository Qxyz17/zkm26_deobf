package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

public class vr extends HashSet implements w8 {
   private String d;
   private static final long a = ess.a(-1409709450446036182L, 5969599505229070491L, MethodHandles.lookup().lookupClass()).a(100802941973155L);

   public vr(String var1, Collection var2, long var3) {
      var3 = a ^ var3;
      super(var2);
      x44.a<"q">(this, var1, 303483654100965183L, var3);
   }

   @Override
   public Object clone() {
      return super.clone();
   }

   public vr(int var1, String var2, int var3, Map var4, short var5) {
      long var6 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var8 = var6 ^ 129939542902935L;
      this(var2, var4.keySet(), var8);
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"o">(this, 549209434129454230L, var2);
   }

   public vr(Collection var1) {
      super(var1);
   }

   public vr() {
   }
}
