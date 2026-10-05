package com.zelix;

import java.awt.Component;
import java.lang.invoke.MethodHandles;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class yi extends DefaultListCellRenderer {
   final qi P;
   private static final long a = ess.a(3885537247804373040L, 8426592137026692027L, MethodHandles.lookup().lookupClass()).a(174924193490955L);

   yi(qi var1) {
      this.P = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      long var6 = a ^ 24561003214533L;
      long var8 = var6 ^ 106997063079918L;
      super.getListCellRendererComponent(var1, var2, var3, var4, var5);
      hs var10000 = (hs)var2;
      Object[] var10009 = new Object[]{null, null, null, null, null, null, var5};
      var10009[5] = var4;
      var10009[4] = var3;
      var10009[3] = var2;
      var10009[2] = var8;
      var10009[1] = var1;
      var10009[0] = this;
      x44.a<"l">(var10000, var10009, -5438734632142214603L, var6);
      return this;
   }
}
