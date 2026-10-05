package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class ym {
   static final int[] C;
   static final int[] F;

   static {
      long var11 = ess.a(7670074754857893304L, -2081334449477378434L, MethodHandles.lookup().lookupClass()).a(41102105619501L) ^ 63840307725982L;
      long var13 = var11 ^ 80338461988093L;
      long var15 = var11 ^ 104696386090685L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[7];
      int var4 = 0;
      String var5 = "Z¼©«ûÁ\u0081_óà\u0082õê]¯\u0002Ð\u0082¾ÙXà\u00adø`-üÎâ\b¼Ìeôp\u008e\u0095\u008cáÅ";
      int var6 = "Z¼©«ûÁ\u0081_óà\u0082õê]¯\u0002Ð\u0082¾ÙXà\u00adø`-üÎâ\b¼Ìeôp\u008e\u0095\u008cáÅ".length();
      byte var3 = 0;

      label113:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var33 = var0;
         var10001 = var4++;
         long var36 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var38 = -1;

         while (true) {
            long var8 = var36;
            byte[] var10 = var1.doFinal(
               new byte[]{
                  (byte)((int)(var8 >>> 56)),
                  (byte)((int)(var8 >>> 48)),
                  (byte)((int)(var8 >>> 40)),
                  (byte)((int)(var8 >>> 32)),
                  (byte)((int)(var8 >>> 24)),
                  (byte)((int)(var8 >>> 16)),
                  (byte)((int)(var8 >>> 8)),
                  (byte)((int)var8)
               }
            );
            long var40 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var38) {
               case 0:
                  var33[var10001] = var40;
                  if (var3 >= var6) {
                     F = new int[x44.a<"w">(new Object[]{var15}, 4918745599618583319L, var11).length];

                     try {
                        x44.a<"n">(6395631176847249008L, var11)[x44.a<"n">(6908131124851278674L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var31) {
                     }

                     try {
                        x44.a<"n">(6395631176847249008L, var11)[x44.a<"n">(6537801156523946933L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var30) {
                     }

                     C = new int[x44.a<"w">(new Object[]{var13}, 6878843833102314533L, var11).length];

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(6812366240405843903L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var29) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(6432009928956175731L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var28) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(6405703415409189933L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(4646150288926813353L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(4981183559628444358L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(6910932574046756251L, var11).ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(5170846970518350721L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(4724525289557923650L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(4912386674545710219L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(4978639202749799118L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(6365574816395383616L, var11).ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        x44.a<"n">(6820267722357344392L, var11)[x44.a<"n">(6795806994665337330L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var18) {
                     }

                     return;
                  }
                  break;
               default:
                  var33[var10001] = var40;
                  if (var3 < var6) {
                     continue label113;
                  }

                  var5 = "¢\twêé\u009d\u0001k¦@àî\u008b#\u001dy";
                  var6 = "¢\twêé\u009d\u0001k¦@àî\u008b#\u001dy".length();
                  var3 = 0;
            }

            byte var35 = var3;
            var3 += 8;
            var7 = var5.substring(var35, var3).getBytes("ISO-8859-1");
            var33 = var0;
            var10001 = var4++;
            var36 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var38 = 0;
         }
      }
   }
}
