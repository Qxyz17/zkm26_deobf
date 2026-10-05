package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class _dw extends _s3 {
   final di f;
   private static final long a = ess.a(8740725586987665358L, -5029105815201340661L, MethodHandles.lookup().lookupClass()).a(15153907907333L);

   public void e(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   _dw(di var1) {
      this.f = var1;
   }

   public void p(Object[] var1) {
      Object var2 = var1[0];
      Object var6 = var1[1];
      long var3 = (Long)var1[2];
      Object var5 = var1[3];
      long var7 = var3 ^ 121179542313315L;
      x44.a<"l">(this, new Object[]{(List)var2, (String)var6, var7, (Integer)var5}, -8043661673767430368L, var3);
   }

   public void Z(Object[] var1) {
      List var6 = (List)var1[0];
      String var4 = (String)var1[1];
      long var2 = (Long)var1[2];
      Integer var5 = (Integer)var1[3];
      var2 = a ^ var2;
      long var10001 = var2 ^ 18667344695479L;
      int var7 = (int)((var2 ^ 18667344695479L) >>> 32);
      int var8 = (int)((var2 ^ 18667344695479L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      long var10 = var2 ^ 26288436838057L;

      try {
         if (var6 == null || var4 == null) {
            return;
         }
      } catch (gj var14) {
         throw x44.a<"q">(var14, -9088676533919896850L, var2);
      }

      di var10000 = x44.a<"m">(this, -8691735089867772278L, var2);
      ArrayList var12 = new ArrayList(var6);
      di var13 = var10000;
      byte var16 = (byte)var8;
      Object[] var10006 = new Object[]{null, null, var13, var9, var12};
      var10006[1] = Integer.valueOf(var16);
      var10006[0] = var7;
      x44.a<"q">(var10006, -8703948265716052181L, var2);
      x44.a<"i">(x44.a<"q">(new Object[]{var10, x44.a<"m">(this, -8691735089867772278L, var2)}, -7156042363239029141L, var2), var4, -7173833502745728847L, var2);
      x44.a<"i">(x44.a<"q">(new Object[]{var10, x44.a<"m">(this, -8691735089867772278L, var2)}, -7156042363239029141L, var2), 0, -7283272359013488986L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
