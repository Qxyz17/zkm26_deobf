package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public abstract class ks extends fw {
   protected List V;
   private static final long d = ess.a(-6297628405347978586L, -6816426397316550524L, MethodHandles.lookup().lookupClass()).a(131054304509680L);

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var4 = (_ur)var1[2];
      long var6 = var2 ^ 114633185681979L;
      long var8 = var2 ^ 29791420647726L;
      long var10 = var2 ^ 74933884137676L;
      long var12 = var2 ^ 1445808893670L;
      long var14 = var2 ^ 79750469043976L;
      long var16 = var2 ^ 134528422017690L;
      long var18 = var2 ^ 80521838856410L;
      int var20 = x44.a<"i">(var4, new Object[]{var18}, 8706655031326303606L, var2);
      int var21 = x44.a<"i">(var4, new Object[]{var6}, 7309659849235451010L, var2);
      int var22 = x44.a<"i">(var4, new Object[]{var8}, 7191208742915394367L, var2);
      x44.a<"i">(this, new Object[]{var4, var14}, 8981595559366709040L, var2);
      int var23 = x44.a<"i">(this, new Object[]{var16}, 7145691849331111744L, var2);
      Object[] var10005 = new Object[]{null, var4, var10};
      var10005[0] = var23;
      x44.a<"i">(this, var10005, 7065768937089785389L, var2);
      Object[] var10007 = new Object[]{null, null, null, null, var22};
      var10007[3] = var12;
      var10007[2] = var21;
      var10007[1] = var20;
      var10007[0] = var4;
      x44.a<"i">(this, var10007, 7437375795383455592L, var2);
   }

   protected abstract void U(Object[] var1);

   public void y(Object[] var1) {
      int var4 = (Integer)var1[0];
      _ur var5 = (_ur)var1[1];
      long var2 = (Long)var1[2];
      long var6 = var2 ^ 74933884137676L;
      int[] var10000 = x44.a<"u">(-3586710506889154681L, var2);
      int var9 = 0;
      int[] var8 = var10000;

      while (var9 < var4) {
         _za var10 = this.e(var9);
         x44.a<"i">(this, -3874929832984395254L, var2).add(var10);
         x44.a<"m">(var10, new Object[]{var6, this, var5}, -3842470861937404650L, var2);
         var9++;
         if (var8 != null) {
            break;
         }
      }
   }

   public ks(int var1, long var2) {
      var2 = d ^ var2;
      long var10001 = var2 ^ 59436548225299L;
      int var4 = (int)((var2 ^ 59436548225299L) >>> 48);
      int var5 = (int)((var2 ^ 59436548225299L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      super((short)var4, (char)var5, var1, var6);
      x44.a<"t">(this, new ArrayList(), -7603369637305016760L, var2);
   }
}
