package com.zelix;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;

public class zy implements Serializable {
   public static final zy d = new zy(2);
   public static final int x = 1;
   public static final int B = 2;
   public static final zy e = new zy(0);
   private final int c;
   public static final int o = 0;
   public static final zy a = new zy(1);
   private static final zy[] b;
   private static final long f = ess.a(-5940278845073642768L, -5350552076941405192L, MethodHandles.lookup().lookupClass()).a(218257807911879L);

   public int a() {
      long var1 = f ^ 104200940023406L;
      return x44.a<"m">(this, 4631413993325879638L, var1);
   }

   static {
      long var0 = f ^ 95727619421061L;
      b = new zy[]{x44.a<"k">(-9025381941707653153L, var0), x44.a<"k">(-6944453297598467444L, var0), x44.a<"k">(-7223631444979729372L, var0)};
   }

   private zy(int var1) {
      this.c = var1;
   }

   public static zy a(int var0) {
      long var1 = f ^ 17400609261559L;
      if (var0 >= 0 && var0 < x44.a<"i">(-706314719829603157L, var1).length) {
         return x44.a<"i">(-706314719829603157L, var1)[var0];
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public String toString() {
      long var1 = f ^ 119205706034477L;
      switch (x44.a<"n">(this, -4394065374816574955L, var1)) {
         case 0:
            return "ALWAYS";
         case 1:
            return "NEVER";
         case 2:
            return "IF_IN_ARCHIVE";
         default:
            return "ERROR";
      }
   }
}
