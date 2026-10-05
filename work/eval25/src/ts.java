package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.HashSet;

public class ts extends tf {
   private static final long a = ess.a(-8732488559013030566L, 2611927392995901677L, MethodHandles.lookup().lookupClass()).a(178745556601393L);

   ts(long var1, _8a var3, a7 var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 97387504365016L;
      long var7 = var1 ^ 618231588444L;
      long var9 = var1 ^ 116686343914636L;
      int[] var10000 = x44.a<"r">(-5235624907670695978L, var1);
      super();
      x44.a<"q">(this, new _82[x44.a<"j">(var3, new Object[]{var7}, -6033905095606542615L, var1)], -5478863427079150702L, var1);
      int var12 = 0;
      int[] var11 = var10000;
      Enumeration var13 = x44.a<"j">(var3, new Object[]{var5}, -6008018869988310184L, var1);

      while (var13.hasMoreElements()) {
         HashSet var14 = (HashSet)var13.nextElement();
         _84 var15 = new _84(var14, var4, var9);
         x44.a<"n">(this, -5478863427079150702L, var1)[var12++] = var15;
         if (var11 == null) {
            break;
         }
      }
   }
}
