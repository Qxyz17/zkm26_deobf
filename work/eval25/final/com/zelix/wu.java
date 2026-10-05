package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class wu implements ListSelectionListener {
   private mp j;
   private int[] O;
   private static final long a = ess.a(-6024746527296785740L, -2673117540810658720L, MethodHandles.lookup().lookupClass()).a(83979170834680L);

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      long var2 = a ^ 107938667850849L;
      long var4 = var2 ^ 3482296155711L;
      long var6 = var2 ^ 112485689153024L;
      long var8 = var2 ^ 40542838599644L;
      q0 var10 = (q0)x44.a<"m">(var1, 6008179357435284942L, var2);
      int[] var11 = x44.a<"m">(var10, 5744029680884358129L, var2);
      pg var12 = new pg(var6);
      pg var13 = new pg(var6);
      x44.a<"u">(new Object[]{x44.a<"i">(this, 5849130197874465166L, var2), var4, var11, var12, var13}, 6011716279103215123L, var2);
      x44.a<"m">(x44.a<"i">(this, 5835573402834774405L, var2), new Object[]{(int[])var12.G(), var8, (int[])var13.G()}, 5948897931241395889L, var2);
   }

   wu(long var1, mp var3) {
      var1 = a ^ var1;
      super();
      x44.a<"u">(this, new int[0], -3163969822314996555L, var1);
      x44.a<"u">(this, var3, -3042456638978675522L, var1);
   }

   public void Z(Object[] var1) {
      int[] var2 = (int[])var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"w">(this, var2, -4855682379426057153L, var3);
   }
}
