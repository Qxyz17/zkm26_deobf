package com.zelix;

import java.lang.invoke.MethodHandles;

public class jr extends jz {
   private static final long c = ess.a(-2193638000146191133L, 8618608980045188432L, MethodHandles.lookup().lookupClass()).a(39652644671814L);

   public void Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 126060947167282L;
      long var10001 = var2 ^ 98420767457611L;
      int var6 = (int)((var2 ^ 98420767457611L) >>> 48);
      int var7 = (int)((var2 ^ 98420767457611L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      za var9 = (za)x44.a<"n">(this, new Object[]{var4}, 5923579610572478308L, var2);
      short var11 = (short)var6;
      Object[] var10005 = new Object[]{null, null, var8};
      var10005[1] = var7;
      var10005[0] = Integer.valueOf(var11);
      x44.a<"n">(var9, var10005, 5639830902615102544L, var2);
   }

   public jr(long var1, int var3) {
      var1 = c ^ var1;
      long var4 = var1 ^ 19054849211449L;
      super(var4, var3);
   }

   public void t(Object[] var1) {
      long var4 = (Long)var1[0];
      _za var2 = (_za)var1[1];
      _ur var3 = (_ur)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 134528422017690L;
      int var11 = x44.a<"i">(this, new Object[]{var8}, 7145691849331111744L, var4);
      int[] var10000 = x44.a<"q">(9148277501292601163L, var4);
      int var12 = 0;
      int[] var10 = var10000;

      label34: {
         while (var12 < var11) {
            try {
               if (var4 > 0L) {
                  var15 = this.e(var12);
                  if (var10 != null) {
                     break label34;
                  }

                  x44.a<"i">(var15, new Object[]{var6, this, var3}, 8818198965911889370L, var4);
                  var12++;
               }

               if (var10 == null) {
                  continue;
               }
            } catch (gj var13) {
               throw x44.a<"q">(var13, 7269572853025491486L, var4);
            }

            if (var4 >= 0L) {
               break;
            }
         }

         var15 = var2;
      }

      za var14 = (za)var15;
      x44.a<"i">(var14, new Object[]{x44.a<"m">(this, 7100230334720850063L, var4)}, 6993649246442195055L, var4);
      x44.a<"i">(var14, new Object[]{x44.a<"m">(this, 8697225293070427981L, var4)}, 7356632345197110778L, var4);
      x44.a<"i">(var14, new Object[]{x44.a<"m">(this, 9014430493292201989L, var4)}, 8993675105593839018L, var4);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
