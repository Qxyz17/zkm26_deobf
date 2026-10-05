package com.zelix;

public class xx {
   protected boolean e;

   public boolean S() {
      return this.e;
   }

   public xx() {
      this(false);
   }

   public void Q(boolean var1) {
      this.e = var1;
   }

   public xx(boolean var1) {
      this.e = var1;
   }

   @Override
   public Object clone() {
      return new xx(this.e);
   }
}
