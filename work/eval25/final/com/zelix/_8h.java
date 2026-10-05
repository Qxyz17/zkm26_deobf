package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class _8h {
   private final HashSet Z;
   private static final long a = ess.a(6038299736461852306L, -8773587237525316486L, MethodHandles.lookup().lookupClass()).a(733860468449L);

   public int Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(x44.a<"h">(this, -2011710239984493600L, var2), -327418698629533482L, var2);
   }

   public boolean E(Object[] var1) {
      Object var4 = var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return x44.a<"h">(this, 7261121611303279408L, var2).add(var4);
   }

   public _8h(HashSet var1) {
      this.Z = var1;
   }

   public boolean P(Object[] var1) {
      long var2 = (Long)var1[0];
      Object var4 = var1[1];
      var2 = a ^ var2;
      return x44.a<"i">(x44.a<"m">(this, 7059913451018903053L, var2), var4, 7197361777240871257L, var2);
   }

   public Iterator v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(x44.a<"i">(this, -5474729941687596047L, var2), -5436274125388313659L, var2);
   }

   public synchronized Enumeration d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return Collections.enumeration(x44.a<"o">(this, 5013630312491383399L, var2));
   }

   public _8h(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 49120372869523L;
      super();
      this.Z = x44.a<"r">(new Object[]{var3}, -3920399499739774885L, var1);
   }

   @Override
   public Object clone() {
      long var1 = a ^ 49437481689181L;
      long var3 = var1 ^ 96003652151413L;
      return new _8h(x44.a<"q">(new Object[]{var3, x44.a<"m">(this, -8344642546091019323L, var1)}, -8484797490039806626L, var1));
   }
}
