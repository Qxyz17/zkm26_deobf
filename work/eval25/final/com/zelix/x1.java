package com.zelix;

import java.io.DataOutputStream;

public abstract class x1 extends xt implements _8t {
   final int O;
   final int m;

   public boolean s() {
      return true;
   }

   void T(long var1, DataOutputStream var3) {
      long var4 = var1 ^ 121195092258622L;
      var3.writeByte(this.m(var4).l());
      var3.writeShort(x44.a<"k">(this, -2798297338631152533L, var1));
      var3.writeShort(x44.a<"k">(this, -4103147457004749285L, var1));
   }

   public x1(int var1, _xx var2, _83 var3) {
      super(var1, var3);
      this.m = var2.readUnsignedShort();
      this.O = var2.readUnsignedShort();
   }
}
