package com.zelix;

import java.lang.invoke.MethodHandles;

public class _dh extends _s3 {
   final u6 w;
   private static final long a = ess.a(1451027780366368569L, 7584781437864458168L, MethodHandles.lookup().lookupClass()).a(160917238478326L);

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void M(Object[] var1) {
      long var2 = (Long)var1[0];
      Integer var4 = (Integer)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 14747230473339L;
      long var7 = var2 ^ 14047207157683L;
      long var10001 = var2 ^ 47803808771658L;
      int var9 = (int)((var2 ^ 47803808771658L) >>> 32);
      int var10 = (int)((var2 ^ 47803808771658L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var2 ^ 127616794092021L;
      int var14 = (int)((var2 ^ 106967221910701L) >>> 56);
      long var15 = (var2 ^ 106967221910701L) << 8 >>> 8;
      x44.a<"o">(x44.a<"k">(this, 3274812529477315935L, var2), new Object[]{var5}, 3128642873556847125L, var2);
      int[] var10000 = x44.a<"w">(3752939882371139983L, var2);
      int var18 = var4;
      int[] var17 = var10000;

      label52: {
         label47: {
            try {
               var25 = var18;
               var28 = x44.a<"n">(3114836207299538938L, var2);
               if (var17 == null) {
                  break label52;
               }

               if (var18 != var28) {
                  break label47;
               }
            } catch (gj var23) {
               throw x44.a<"w">(var23, 3810396295997449632L, var2);
            }

            u6 var26 = x44.a<"k">(this, 3274812529477315935L, var2);
            char var10002 = (char)var10;
            Object[] var10005 = new Object[]{null, null, Integer.valueOf((char)var11)};
            var10005[1] = Integer.valueOf(var10002);
            var10005[0] = var9;
            _ur var19 = x44.a<"o">(var26, var10005, 3912813311960609159L, var2);

            try {
               new p6(
                  x44.a<"k">(this, 3274812529477315935L, var2),
                  var12,
                  var19,
                  x44.a<"w">(new Object[]{var7, x44.a<"k">(this, 3274812529477315935L, var2)}, 3187768166133372789L, var2)
               );
               if (var17 != null) {
                  return;
               }
            } catch (gj var22) {
               boolean var29 = false;
               throw x44.a<"w">(var22, 3810396295997449632L, var2);
            }
         }

         try {
            var25 = var18;
            var28 = x44.a<"n">(3022721002013326308L, var2);
         } catch (gj var21) {
            boolean var30 = false;
            throw x44.a<"w">(var21, 3810396295997449632L, var2);
         }
      }

      try {
         if (var25 == var28) {
            new pe(
               (byte)var14,
               x44.a<"k">(this, 3274812529477315935L, var2),
               x44.a<"w">(new Object[]{var7, x44.a<"k">(this, 3274812529477315935L, var2)}, 3187768166133372789L, var2),
               var15
            );
         }
      } catch (gj var20) {
         throw x44.a<"w">(var20, 3810396295997449632L, var2);
      }
   }

   _dh(u6 var1) {
      this.w = var1;
   }

   public void s(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 38359431150181L;
      x44.a<"o">(this, new Object[]{var5, (Integer)var2}, -248771624569559330L, var3);
   }

   public void e(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 88535780606241L;
      long var6 = var2 ^ 43322104947977L;
      u6 var10000 = x44.a<"i">(this, -2294543013175517179L, var2);
      Object[] var10004 = new Object[]{null, var6};
      var10004[0] = false;
      x44.a<"m">(var10000, var10004, -436657451947418203L, var2);
      x44.a<"m">(x44.a<"i">(this, -2294543013175517179L, var2), new Object[]{var4}, -1859579885592901809L, var2);
   }

   private static gj a(gj var0) {
      return var0;
   }
}
