package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class yc extends y1 {
   ArrayList C;
   aa y;
   Integer Y;
   private static final long a = ess.a(2488831624532239022L, -1829657793603091108L, MethodHandles.lookup().lookupClass()).a(259297957338181L);

   void n(int var1, int var2, int var3, String var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var5 ^ 35982385347764L;
      int var7 = (int)((var5 ^ 35982385347764L) >>> 48);
      int var8 = (int)((var5 ^ 35982385347764L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      this.Y = this.y.D((short)var7, (char)var8, Integer.parseInt(var4), var9);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void h(rp var1, aa var2, long var3) {
      long var5 = var3 ^ 0L;
      long var7 = var3 ^ 1133881831266L;
      long var9 = var3 ^ 92090590140904L;
      this.y = var2;
      int var12 = this.u(var7);
      int var10000 = x44.a<"u">(8264398724260313806L, var3);
      this.C = new ArrayList(var12 - 1);
      int var13 = 0;
      int var11 = var10000;

      label51:
      while (var13 < var12) {
         try {
            this.a(var13).h(this, var2, var5);
            var13++;
         } catch (gj var16) {
            boolean var10001 = false;
            throw x44.a<"u">(var16, 8457891937909804169L, var3);
         }

         while (true) {
            try {
               var10000 = var11;
               if (var3 >= 0L) {
                  if (var11 == 0) {
                     return;
                  }

                  var10000 = var11;
               }

               if (var10000 != 0) {
                  break;
               }
            } catch (gj var15) {
               boolean var20 = false;
               throw x44.a<"u">(var15, 8457891937909804169L, var3);
            }

            if (var3 >= 0L) {
               break label51;
            }
         }
      }

      if (var2.r()) {
         o9 var17 = (o9)var1;
         int var14 = 0;

         while (var14 < this.C.size()) {
            var17.e(var9, (Integer)this.C.get(var14), this.Y);
            var14++;
            if (var11 == 0) {
               break;
            }
         }
      }
   }

   public yc(int var1) {
      super(var1);
   }

   void f(String var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 19949915279967L;
      int var4 = (int)((var2 ^ 19949915279967L) >>> 48);
      int var5 = (int)((var2 ^ 19949915279967L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      this.C.add(this.y.D((short)var4, (char)var5, Integer.parseInt(var1), var6));
   }

   private static gj a(gj var0) {
      return var0;
   }
}
