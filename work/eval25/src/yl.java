package com.zelix;

public class yl {
   public static boolean d(Object[] var0) {
      String var1 = (String)var0[0];

      try {
         Integer.parseInt(var1);
         return true;
      } catch (NumberFormatException var3) {
         return false;
      }
   }
}
