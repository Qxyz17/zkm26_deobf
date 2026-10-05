package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class _re implements Enumeration {
   private Enumeration N;
   private static final long a = ess.a(8308631686079873L, -6325286739631447989L, MethodHandles.lookup().lookupClass()).a(179042611648913L);

   @Override
   public final Object nextElement() {
      long var1 = a ^ 105974207696665L;
      return x44.a<"j">(this, 5821008348676131982L, var1).nextElement();
   }

   @Override
   public final boolean hasMoreElements() {
      long var1 = a ^ 32823847714822L;
      return x44.a<"m">(this, -6929036546810756207L, var1).hasMoreElements();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public _re(Enumeration var1, long var2) {
      var2 = a ^ var2;
      String var10000 = x44.a<"q">(-6530072327383237532L, var2);
      super();
      String var4 = var10000;
      ArrayList var5 = new ArrayList();

      label41:
      while (var1.hasMoreElements()) {
         try {
            var5.add(var1.nextElement());
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"q">(var7, -5160646111426140386L, var2);
         }

         while (true) {
            try {
               var10000 = var4;
               if (var2 >= 0L) {
                  if (var4 != null) {
                     return;
                  }

                  var10000 = var4;
               }

               if (var10000 == null) {
                  break;
               }
            } catch (gj var6) {
               boolean var11 = false;
               throw x44.a<"q">(var6, -5160646111426140386L, var2);
            }

            if (var2 >= 0L) {
               break label41;
            }
         }
      }

      x44.a<"r">(this, Collections.enumeration(var5), -4927124489337280551L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
