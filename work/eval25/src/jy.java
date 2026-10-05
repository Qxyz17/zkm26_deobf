package com.zelix;

import java.lang.invoke.MethodHandles;

public class jy extends jz {
   private static final long c = ess.a(-2991680250869747634L, -7035804183051416898L, MethodHandles.lookup().lookupClass()).a(220745109625911L);

   public void t(Object[] var1) {
      long var4 = (Long)var1[0];
      _za var3 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      long var6 = var4 ^ 118312945063385L;
      long var8 = var4 ^ 0L;
      long var10 = var4 ^ 134528422017690L;
      int[] var10000 = x44.a<"q">(9148277501292601163L, var4);
      int var13 = x44.a<"i">(this, new Object[]{var10}, 7145691849331111744L, var4);
      int var14 = 0;
      int[] var12 = var10000;

      label34: {
         while (var14 < var13) {
            try {
               if (var4 >= 0L) {
                  var17 = this.e(var14);
                  if (var12 != null) {
                     break label34;
                  }

                  x44.a<"i">(var17, new Object[]{var8, this, var2}, 8818198965911889370L, var4);
                  var14++;
               }

               if (var12 == null) {
                  continue;
               }
            } catch (gj var15) {
               throw x44.a<"q">(var15, 8721390754979219580L, var4);
            }

            if (var4 >= 0L) {
               break;
            }
         }

         var17 = var3;
      }

      zu var16 = (zu)var17;
      x44.a<"i">(var16, new Object[]{x44.a<"m">(this, 7100230334720850063L, var4)}, 7335264238120807767L, var4);
      x44.a<"i">(var16, new Object[]{var6, x44.a<"m">(this, 8697225293070427981L, var4)}, 7238479104256573483L, var4);
      x44.a<"i">(var16, new Object[]{x44.a<"m">(this, 9014430493292201989L, var4)}, 9026731871855868182L, var4);
   }

   public jy(long var1, int var3) {
      var1 = c ^ var1;
      long var4 = var1 ^ 55862622797046L;
      super(var4, var3);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
