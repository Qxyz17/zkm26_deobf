package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Vector;

public class zs extends jf implements ss {
   Vector S;
   private static final long a = ess.a(4314221455762102326L, 7187938313852824976L, MethodHandles.lookup().lookupClass()).a(65030526243259L);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var2 = (_za)var1[1];
      _ur var5 = (_ur)var1[2];
      long var6 = var3 ^ 0L;
      long var8 = var3 ^ 134528422017690L;
      int var11 = x44.a<"i">(this, new Object[]{var8}, 7145691849331111744L, var3);
      int[] var10000 = x44.a<"q">(9148277501292601163L, var3);
      int var12 = 0;
      int[] var10 = var10000;

      label44: {
         label43:
         while (var12 < var11) {
            za var13 = (za)this.e(var12);

            try {
               x44.a<"i">(var13, new Object[]{var6, this, var5}, 7461507451520457769L, var3);
            } catch (gj var15) {
               boolean var10001 = false;
               throw x44.a<"q">(var15, 8764522148049832482L, var3);
            }

            while (true) {
               try {
                  if (var3 > 0L) {
                     var10000 = (int[])this;
                     if (var10 != null) {
                        break label44;
                     }

                     x44.a<"i">(x44.a<"m">(this, 8771083552496554747L, var3), var13, 8731850287512671427L, var3);
                     var12++;
                  }

                  if (var10 == null) {
                     break;
                  }
               } catch (gj var14) {
                  boolean var19 = false;
                  throw x44.a<"q">(var14, 8764522148049832482L, var3);
               }

               if (var3 >= 0L) {
                  break label43;
               }
            }
         }

         var10000 = (int[])var2;
      }

      kq var16 = (kq)var10000;
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"l">((kq)x44.a<"h">(this, -7349481125713616740L, var2), new Object[]{var4}, -8732354307130546172L, var2);
   }

   public zs(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 32622934417987L;
      super(var4, var3);
      x44.a<"w">(this, new Vector(), 2647005648366161918L, var1);
   }

   Enumeration i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(x44.a<"m">(this, 7271461943588163499L, var2), 7197835724860462287L, var2);
   }

   public int F(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"j">((kq)x44.a<"n">(this, 968051114491279346L, var2), new Object[]{var4}, 580491800480757476L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
