package com.zelix;

import java.lang.invoke.MethodHandles;

public class j8 extends jo {
   private String L;
   private static final long b = ess.a(-4789646608226777744L, -7681199762324665013L, MethodHandles.lookup().lookupClass()).a(114831889660450L);

   public j8(int var1, long var2) {
      var2 = b ^ var2;
      long var4 = var2 ^ 52219601909784L;
      super(var1, var4);
   }

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var4 = (_ur)var1[2];
      long var6 = var2 ^ 129023990953016L;
      long var8 = var2 ^ 0L;
      long var10 = var2 ^ 134528422017690L;
      int var13 = x44.a<"i">(this, new Object[]{var10}, 7145691849331111744L, var2);
      int[] var10000 = x44.a<"q">(9148277501292601163L, var2);
      int var14 = 0;
      int[] var12 = var10000;

      label34: {
         while (var14 < var13) {
            try {
               if (var2 > 0L) {
                  var17 = this.e(var14);
                  if (var12 != null) {
                     break label34;
                  }

                  x44.a<"i">(var17, new Object[]{var8, this, var4}, 8818198965911889370L, var2);
                  var14++;
               }

               if (var12 == null) {
                  continue;
               }
            } catch (gj var15) {
               throw x44.a<"q">(var15, 8891315116716617939L, var2);
            }

            if (var2 > 0L) {
               break;
            }
         }

         var17 = var5;
      }

      za var16 = (za)var17;
      x44.a<"i">(var16, new Object[]{x44.a<"m">(this, 9131399494669513355L, var2), var6}, 8803009068773856409L, var2);
      x44.a<"i">(var16, new Object[]{x44.a<"m">(this, 8697225293070427981L, var2)}, 7356632345197110778L, var2);
      x44.a<"i">(var16, new Object[]{x44.a<"m">(this, 9014430493292201989L, var2)}, 8993675105593839018L, var2);
   }

   public void C(Object[] var1) {
      long var3 = (Long)var1[0];
      String var2 = (String)var1[1];
      var3 = b ^ var3;
      x44.a<"q">(this, var2, -5545567787563417800L, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
