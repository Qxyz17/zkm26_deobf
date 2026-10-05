package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class _kh extends _k6 implements lz {
   private List p;
   private static final long a = ess.a(5163593765875285361L, 399379162590271790L, MethodHandles.lookup().lookupClass()).a(102403723129486L);

   public _kh(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = (var1 ^ 127356311627374L) >>> 16;
      int var6 = (int)((var1 ^ 127356311627374L) << 48 >>> 48);
      super(var4, (char)var6, var3);
      x44.a<"q">(this, new ArrayList(), 7736989683606409964L, var1);
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      t9 var4 = (t9)var1[1];
      _fs var5 = (_fs)var1[2];
      long var6 = var2 ^ 50804317563666L;
      long var8 = var2 ^ 0L;
      super.B(new Object[]{var8, var4, var5});
      _kv var10 = (_kv)var4;
      x44.a<"o">(var10, new Object[]{var6, x44.a<"k">(this, -7362775390317830047L, var2)}, -7158314811066933493L, var2);
   }

   public void T(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"k">(this, 2529408312744123049L, var3).add(var2);
   }
}
