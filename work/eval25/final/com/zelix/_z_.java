package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class _z_ implements ListSelectionListener {
   pu y;
   u6 Q;
   private static final long a = ess.a(80990473281033681L, 4325904087488593725L, MethodHandles.lookup().lookupClass()).a(206637736286693L);

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      long var2 = a ^ 72434985313347L;
      long var4 = var2 ^ 120877477745382L;
      long var10001 = var2 ^ 126782096668350L;
      int var6 = (int)((var2 ^ 126782096668350L) >>> 48);
      int var7 = (int)((var2 ^ 126782096668350L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      int[] var9 = x44.a<"s">(-8991075693949452637L, var2);

      int var10000;
      label26: {
         try {
            var10000 = x44.a<"k">(var1, -8651148713643468169L, var2);
            if (var9 == null) {
               break label26;
            }

            if (var10000 != 0) {
               return;
            }
         } catch (gj var12) {
            throw x44.a<"s">(var12, -7334616390570309656L, var2);
         }

         var10000 = x44.a<"k">((JList)x44.a<"k">(var1, -7458124108590348592L, var2), -7480797083546254036L, var2);
      }

      int var10 = var10000;
      if (var10 > -1) {
         pu var13 = x44.a<"o">(this, -9148765451126902704L, var2);
         Object[] var10004 = new Object[]{null, var10};
         var10004[0] = var4;
         i8 var11 = x44.a<"k">(var13, var10004, -7059726451963154314L, var2);
         u6 var14 = x44.a<"o">(this, -7085662327027329931L, var2);
         char var10002 = (char)var6;
         Object[] var10006 = new Object[]{null, null, null, Integer.valueOf((char)var8)};
         var10006[2] = var7;
         var10006[1] = Integer.valueOf(var10002);
         var10006[0] = var11;
         x44.a<"k">(var14, var10006, -7201301613679758584L, var2);
      }
   }

   _z_(long var1, pu var3, u6 var4) {
      var1 = a ^ var1;
      super();
      x44.a<"w">(this, var4, -7755868948464853630L, var1);
      x44.a<"w">(this, var3, -8575351063071622745L, var1);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
