package com.zelix;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.List;

public class wc extends bh implements Serializable {
   private String h;
   public static final String C = "*.";
   private boolean g;
   private static final long j = ess.a(-5189492775614010446L, -7756341782453041601L, MethodHandles.lookup().lookupClass()).a(41107947159590L);

   public void a(List var1) {
      long var2 = j ^ 59001456471914L;
      x44.a<"n">(this, -3062447136644162693L, var2).clear();
      int var4 = 0;
      String var5 = null;

      for (int var6 = 0; var6 < var1.size(); var6++) {
         String var7 = (String)var1.get(var6);
         x44.a<"n">(this, -3062447136644162693L, var2).put(var7, var7);
         if (x44.a<"l">(this, var7, -3189487537312937183L, var2)) {
            if (++var4 == 1) {
               var5 = var7;
            }
         }
      }

      if (x44.a<"n">(this, -3929452727014403098L, var2) != null && x44.a<"n">(this, -3929452727014403098L, var2).length() > 0) {
         if (x44.a<"n">(this, -3399091230913319188L, var2)) {
            if (!x44.a<"n">(this, -3062447136644162693L, var2).containsKey(x44.a<"n">(this, -3929452727014403098L, var2))) {
               x44.a<"q">(this, false, -3399091230913319188L, var2);
            }
         } else if (x44.a<"n">(this, -3062447136644162693L, var2).containsKey(x44.a<"n">(this, -3929452727014403098L, var2))) {
            x44.a<"q">(this, true, -3399091230913319188L, var2);
         }
      }

      if (x44.a<"n">(this, -4016618016184783417L, var2)) {
         if (!x44.a<"n">(this, -3062447136644162693L, var2).containsKey(x44.a<"n">(this, -3085408289246611018L, var2))) {
            x44.a<"q">(this, false, -4016618016184783417L, var2);
         }
      } else if (x44.a<"n">(this, -3062447136644162693L, var2).containsKey(x44.a<"n">(this, -3085408289246611018L, var2))) {
         x44.a<"q">(this, true, -4016618016184783417L, var2);
      }

      if (!x44.a<"n">(this, -4016618016184783417L, var2) && var4 > 0) {
         x44.a<"q">(this, true, -4016618016184783417L, var2);
         x44.a<"q">(this, var5, -3085408289246611018L, var2);
      }
   }

   public void a(boolean var1, String var2) {
      long var3 = j ^ 84660230054636L;
      x44.a<"w">(this, var1, 415565263853183041L, var3);
      x44.a<"w">(this, var2, 1776692954606482480L, var3);
   }

   public String h() {
      long var1 = j ^ 3916497804171L;
      return x44.a<"o">(this, -6787105350575747753L, var1);
   }

   public static wc a(String var0, String var1) {
      long var2 = j ^ 40726044736131L;
      File var4 = new File(var0, var1);
      if (x44.a<"k">(var4, -8705132660305178163L, var2) && !x44.a<"k">(var4, -8754873388650527391L, var2) && x44.a<"k">(var4, -7468787478925034074L, var2)) {
         ObjectInputStream var5 = null;

         wc var8;
         try {
            FileInputStream var6 = new FileInputStream(var4);
            var5 = new ObjectInputStream(var6);
            wc var7 = (wc)x44.a<"k">(var5, -8770567129330180713L, var2);
            if (x44.a<"o">(var7, -9193799378414940526L, var2) == null) {
               x44.a<"p">(var7, new LinkedHashMap(), -9193799378414940526L, var2);
            }

            x44.a<"p">(var7, true, -7474297859867278127L, var2);
            var8 = var7;
         } catch (IOException var25) {
            return new wc();
         } catch (ClassNotFoundException var26) {
            return new wc();
         } catch (ClassCastException var27) {
            return new wc();
         } catch (g3 var28) {
            throw var28;
         } catch (Throwable var29) {
            return new wc();
         } finally {
            if (var5 != null) {
               try {
                  x44.a<"k">(var5, -7398898107474340364L, var2);
               } catch (IOException var24) {
               }
            }
         }

         return var8;
      } else {
         return new wc();
      }
   }

   public boolean i() {
      long var1 = j ^ 91502100951433L;
      return x44.a<"m">(this, 6242408688355423012L, var1);
   }

   private boolean a(String var1) {
      return var1 != null && var1.length() > 0 && var1.indexOf("*") == -1 && var1.indexOf("^") == -1 && var1.charAt(var1.length() - 1) == '.';
   }

   public wc() {
      long var1 = j ^ 62937329873502L;
      super();
      x44.a<"u">(this, false, -3065236498418421517L, var1);
      x44.a<"u">(this, null, -4027800165560425342L, var1);
   }
}
