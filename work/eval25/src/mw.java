package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class mw implements ListSelectionListener {
   pr j;
   u6 W;
   private static final long a = ess.a(-2832739026224103648L, -6364621848805796547L, MethodHandles.lookup().lookupClass()).a(133020479108870L);

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      long var2 = a ^ 124558137261684L;
      long var4 = var2 ^ 35712777843384L;
      long var6 = var2 ^ 66526499885350L;
      long var8 = var2 ^ 139440759005880L;
      int[] var10 = x44.a<"t">(5721327692776715004L, var2);

      int var10000;
      label26: {
         try {
            var10000 = x44.a<"l">(var1, 5453726549729990184L, var2);
            if (var10 == null) {
               break label26;
            }

            if (var10000 != 0) {
               return;
            }
         } catch (gj var13) {
            throw x44.a<"t">(var13, 6179683528926375435L, var2);
         }

         var10000 = x44.a<"l">((JList)x44.a<"l">(var1, 6061878981744118415L, var2), 6084833540258875763L, var2);
      }

      int var11 = var10000;
      if (var11 > -1) {
         pr var14 = x44.a<"h">(this, 5299582975086506089L, var2);
         Object[] var10004 = new Object[]{null, var4};
         var10004[0] = var11;
         xe var12 = x44.a<"l">(var14, var10004, 5450598314509923642L, var2);
         x44.a<"l">(
            x44.a<"h">(this, 5803348631811243036L, var2),
            new Object[]{var12, var6, x44.a<"l">(x44.a<"h">(this, 5299582975086506089L, var2), new Object[]{var8}, 5960482461872400461L, var2)},
            5643211911499504702L,
            var2
         );
      }
   }

   mw(long var1, pr var3, u6 var4) {
      var1 = a ^ var1;
      super();
      x44.a<"u">(this, var4, 3626392351670787782L, var1);
      x44.a<"u">(this, var3, 3121501240616374963L, var1);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
