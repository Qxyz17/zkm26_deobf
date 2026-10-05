package com.zelix;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.invoke.MethodHandles;

public class r3 extends WindowAdapter {
   final s6 C;
   private static final long a = ess.a(-4951087062406012103L, 6790569714880395869L, MethodHandles.lookup().lookupClass()).a(63092434621427L);

   @Override
   public void windowClosing(WindowEvent var1) {
      long var2 = a ^ 3249477350731L;
      long var4 = var2 ^ 70418121410418L;
      x44.a<"h">(x44.a<"l">(this, 4877660434880999109L, var2), new Object[]{var4}, 6521399822787981033L, var2);
   }

   @Override
   public void windowActivated(WindowEvent var1) {
      long var2 = a ^ 50971836286023L;
      long var4 = var2 ^ 77873846379940L;
      x44.a<"t">(new Object[]{x44.a<"h">(x44.a<"h">(this, 3656011392786128841L, var2), 3447324580012015045L, var2), var4}, 3120171502901412819L, var2);
   }

   @Override
   public void windowClosed(WindowEvent var1) {
   }

   r3(s6 var1) {
      this.C = var1;
   }
}
