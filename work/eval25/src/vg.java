package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class vg {
   _y4 R;
   private static final long a = ess.a(-4236657899287732158L, 3770763364792758074L, MethodHandles.lookup().lookupClass()).a(272271707700419L);

   public vg(boolean var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 104069242147698L;
      super();
      x44.a<"w">(this, new _y4(var4, var1), 1177130786497440332L, var2);
   }

   public Set E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 103900997554398L;
      int var4 = (int)((var2 ^ 103900997554398L) >>> 32);
      int var5 = (int)((var2 ^ 103900997554398L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return x44.a<"i">(this, 1607629496631831637L, var2).U(var4, (short)var5, (short)var6);
   }

   public Enumeration R(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 16720434653012L;
      long var10001 = var2 ^ 47129000151823L;
      int var6 = (int)((var2 ^ 47129000151823L) >>> 48);
      int var7 = (int)((var2 ^ 47129000151823L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      return new _8g((short)var6, var7, (short)var8, x44.a<"i">(x44.a<"m">(this, -498998100259388663L, var2), new Object[]{var4}, -126440855836028289L, var2));
   }

   public vg(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 12703766411117L;
      this(false, var3);
   }

   public int I(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 47900491557361L;
      return x44.a<"i">(x44.a<"m">(this, -4113177240898372367L, var2), new Object[]{var4}, -4484692865331825528L, var2);
   }

   public vg(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 17444609536955L;
      this(var1, false, var4);
   }

   public vg(int var1, boolean var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 108264417848051L;
      super();
      x44.a<"r">(this, new _y4(var1, var2, var5), 5587567838161631121L, var3);
   }

   public void X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 103442230209295L;
      x44.a<"j">(x44.a<"n">(this, -2152600771933841350L, var2), new Object[]{var4}, -190240724650467159L, var2);
   }

   public List o(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 56535478347660L;
      return x44.a<"j">(this, 604680376908526206L, var3).M(var2, var5);
   }

   public void b(Object var1, Object var2, long var3, Object var5) {
      var3 = a ^ var3;
      long var10001 = var3 ^ 23007693715617L;
      int var6 = (int)((var3 ^ 23007693715617L) >>> 48);
      int var7 = (int)((var3 ^ 23007693715617L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var3 ^ 88843620546776L;
      wo var11 = new wo((short)var6, var2, var7, (short)var8, var5);
      x44.a<"h">(this, -664832140829340452L, var3).G(var1, var11, var9);
   }

   public Set w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 84184001585673L;
      return x44.a<"l">(x44.a<"h">(this, 4345534362840860244L, var2), new Object[]{var4}, 4279414788798273314L, var2);
   }

   public int S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 28043716467561L;
      int var4 = (int)((var2 ^ 28043716467561L) >>> 32);
      int var5 = (int)((var2 ^ 28043716467561L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      String var10000 = x44.a<"r">(1874557727345541895L, var2);
      int var8 = 0;
      Iterator var9 = x44.a<"n">(this, 2159534829306193890L, var2).U(var4, (short)var5, (short)var6).iterator();
      String var7 = var10000;

      while (true) {
         if (var9.hasNext()) {
            Entry var10 = (Entry)var9.next();
            if (var2 >= 0L) {
               var12 = var8 + ((List)var10.getValue()).size();
               if (var7 != null) {
                  break;
               }

               var8 = var12;
            }

            if (var7 == null) {
               continue;
            }
         }

         var12 = var8;
         break;
      }

      return var12;
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 48078465208443L;
      return x44.a<"j">(x44.a<"n">(this, -5052962009030687750L, var2), new Object[]{var4}, -6455201152036140638L, var2);
   }
}
