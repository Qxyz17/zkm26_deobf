package com.zelix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.invoke.MethodHandles;

public class hl6 extends _nr {
   private static final long a = ess.a(-5935084745106800446L, -7629349268316266251L, MethodHandles.lookup().lookupClass()).a(44964197320170L);

   public hl6() {
      long var1 = a ^ 125107858836843L;
      long var3 = var1 ^ 48811683490564L;
      super(var3);
   }

   public static hl6 e(String var0, String var1) {
      long var2 = a ^ 127694103664131L;
      File var4 = new File(var0, var1);
      if (x44.a<"k">(var4, -3035016496755080419L, var2) && !x44.a<"k">(var4, -3147978284305066063L, var2) && x44.a<"k">(var4, -3852308038305910922L, var2)) {
         ObjectInputStream var5 = null;

         hl6 var8;
         try {
            FileInputStream var6 = new FileInputStream(var4);
            var5 = new ObjectInputStream(var6);
            hl6 var7 = (hl6)x44.a<"k">(var5, -3127471979429114041L, var2);
            x44.a<"p">(var7, true, -3848986866425833983L, var2);
            var8 = var7;
         } catch (IOException var25) {
            return new hl6();
         } catch (ClassNotFoundException var26) {
            return new hl6();
         } catch (ClassCastException var27) {
            return new hl6();
         } catch (g3 var28) {
            throw var28;
         } catch (Throwable var29) {
            return new hl6();
         } finally {
            if (var5 != null) {
               try {
                  x44.a<"k">(var5, -3782594622543116508L, var2);
               } catch (IOException var24) {
               }
            }
         }

         return var8;
      } else {
         return new hl6();
      }
   }
}
