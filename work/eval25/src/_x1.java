package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class _x1 {
   final _y7 p;
   private ArrayList j;
   private _x1 R;
   private Object D;
   private static final long a = ess.a(-8649575146401122907L, -3847089324488130323L, MethodHandles.lookup().lookupClass()).a(16618152886709L);

   public Object x() {
      return this.D;
   }

   static _x1 g(Object[] var0) {
      long var2 = (Long)var0[0];
      _x1 var1 = (_x1)var0[1];
      var2 = a ^ var2;
      return x44.a<"l">(var1, new Object[0], 3079182550241619041L, var2);
   }

   private _x1(_y7 var1, Object var2, _x1 var3) {
      this.p = var1;
      this.j = new ArrayList();
      this.D = var2;
      this.R = var3;
   }

   public Enumeration k() {
      return Collections.enumeration(this.j);
   }

   private _x1 F(Object[] var1) {
      return this.R;
   }

   private _x1 Y(Object var1) {
      _x1 var2 = new _x1(this.p, var1, this);
      this.j.add(var2);
      return var2;
   }

   static _x1 n(_x1 var0) {
      return var0.R;
   }

   static ArrayList W(_x1 var0) {
      return var0.j;
   }

   private boolean z(Object[] var1) {
      long var3 = (Long)var1[0];
      _x1 var2 = (_x1)var1[1];
      var3 = a ^ var3;
      return x44.a<"m">(this.j, var2, 4877937873777350544L, var3);
   }

   static _x1 z(_x1 var0, Object var1) {
      return var0.Y(var1);
   }

   static boolean l(Object[] var0) {
      long var2 = (Long)var0[0];
      _x1 var1 = (_x1)var0[1];
      _x1 var4 = (_x1)var0[2];
      var2 = a ^ var2;
      long var5 = var2 ^ 80209488781314L;
      return x44.a<"o">(var1, new Object[]{var5, var4}, 7697284422353983797L, var2);
   }

   _x1(_y7 var1, Object var2, _x1 var3, uf var4) {
      this(var1, var2, var3);
   }
}
