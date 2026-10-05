package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;

public class _db extends _s3 {
   final u6 T;
   private static final long a = ess.a(3824789859236318050L, 7233548882759926795L, MethodHandles.lookup().lookupClass()).a(123918962985412L);

   public void e(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 43322104947977L;
      u6 var10000 = x44.a<"i">(this, -2235696017198817323L, var2);
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = false;
      x44.a<"m">(var10000, var10004, -436657451947418203L, var2);
   }

   _db(u6 var1) {
      this.T = var1;
   }

   public void i(Object[] var1) {
      long var3 = (Long)var1[0];
      File var2 = (File)var1[1];
      Integer var5 = (Integer)var1[2];
      var3 = a ^ var3;
      long var6 = var3 ^ 6411802464098L;

      try {
         if (var2 != null) {
            x44.a<"i">(x44.a<"m">(this, 3428670831540900025L, var3), new Object[]{var2, null, var6}, 3368649072834014721L, var3);
         }
      } catch (gj var8) {
         throw x44.a<"q">(var8, 3193066052323193967L, var3);
      }
   }

   public void h(Object[] var1) {
      File var2 = (File)var1[0];
   }

   public void s(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      x44.a<"o">(this, new Object[]{(File)var2}, -2184023412387601815L, var3);
   }

   public void U(Object[] var1) {
      Object var3 = var1[0];
      long var4 = (Long)var1[1];
      Object var2 = var1[2];
      long var6 = var4 ^ 35355555335270L;
      x44.a<"l">(this, new Object[]{var6, (File)var3, (Integer)var2}, 8922356879048950329L, var4);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
