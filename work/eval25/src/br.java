package com.zelix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;

public class br extends bh implements Serializable {
   private static final long g = ess.a(2047236856946242617L, 2189721430829601100L, MethodHandles.lookup().lookupClass()).a(198424821379648L);

   public static br b(String var0, String var1) {
      long var2 = g ^ 119216468690342L;
      File var4 = new File(var0, var1);
      if (x44.a<"i">(var4, -9073772011077839633L, var2) && !x44.a<"i">(var4, -8961553510030245821L, var2) && x44.a<"i">(var4, -7098848656303802236L, var2)) {
         ObjectInputStream var5 = null;

         br var8;
         try {
            FileInputStream var6 = new FileInputStream(var4);
            var5 = new ObjectInputStream(var6);
            br var7 = (br)x44.a<"i">(var5, -8977094404099041099L, var2);
            if (x44.a<"m">(var7, -8841890203584443472L, var2) == null) {
               x44.a<"r">(var7, new LinkedHashMap(), -8841890203584443472L, var2);
            }

            x44.a<"r">(var7, true, -7104518384289644045L, var2);
            var8 = var7;
         } catch (IOException var25) {
            return new br();
         } catch (ClassNotFoundException var26) {
            return new br();
         } catch (ClassCastException var27) {
            return new br();
         } catch (g3 var28) {
            throw var28;
         } catch (Throwable var29) {
            return new br();
         } finally {
            if (var5 != null) {
               try {
                  x44.a<"i">(var5, -7173232797737840426L, var2);
               } catch (IOException var24) {
               }
            }
         }

         return var8;
      } else {
         return new br();
      }
   }
}
