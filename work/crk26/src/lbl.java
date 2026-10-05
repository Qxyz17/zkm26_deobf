package com.zelix;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.lang.invoke.MethodHandles;

public class lbl extends MouseMotionAdapter {
   final om O;
   private static final long a = prr.a(-2757888945643388013L, 4681849895620469887L, MethodHandles.lookup().lookupClass()).a(251423156100038L);

   @Override
   public void mouseDragged(MouseEvent var1) {
      long var2 = a ^ 94605805883402L;
      long var4 = var2 ^ 23512061810648L;
      m44.a<"u">(m44.a<"w">(this, 1037153116541199267L, var2), true, 1065471489916773945L, var2);
      m44.a<"v">(
         m44.a<"w">(m44.a<"w">(this, 1037153116541199267L, var2), 1221830115006980913L, var2),
         new Object[]{m44.a<"v">(var1, 946374664216630984L, var2), var4},
         1278487674082833610L,
         var2
      );
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }

   lbl(om var1) {
      this.O = var1;
   }
}
