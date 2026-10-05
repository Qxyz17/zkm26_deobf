package com.zelix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.MethodHandles;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class mh implements ActionListener, ListSelectionListener {
   u6 i;
   private static final long a = ess.a(-7968882323990561036L, 5887472442792765891L, MethodHandles.lookup().lookupClass()).a(21211223055951L);

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      long var2 = a ^ 119384410629628L;
      long var4 = var2 ^ 90491464066264L;
      int[] var10000 = x44.a<"t">(6532009462467700540L, var2);
      q0 var7 = (q0)x44.a<"l">(var1, 4746926048202776399L, var2);
      int[] var6 = var10000;

      label32: {
         try {
            var11 = x44.a<"l">(var1, 6804905643026858984L, var2);
            if (var6 == null) {
               break label32;
            }

            if (var11 != 0) {
               return;
            }
         } catch (gj var10) {
            throw x44.a<"t">(var10, 6396164640038090866L, var2);
         }

         var11 = x44.a<"l">(var7, 6651065125586354557L, var2);
      }

      int var8 = var11;

      try {
         if (var8 > -1) {
            u6 var12 = x44.a<"h">(this, 6859566883359337501L, var2);
            Object[] var10004 = new Object[]{null, var8};
            var10004[0] = var4;
            x44.a<"l">(var12, var10004, 4984966481606627356L, var2);
         }
      } catch (gj var9) {
         throw x44.a<"t">(var9, 6396164640038090866L, var2);
      }
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
   }

   mh(u6 var1, long var2) {
      var2 = a ^ var2;
      super();
      x44.a<"q">(this, var1, 7839710223107399651L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
