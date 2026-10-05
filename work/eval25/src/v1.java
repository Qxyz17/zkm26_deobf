package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class v1 {
   static final int[] Y;

   static {
      long var11 = ess.a(-4056698821553448540L, -4972716871118851804L, MethodHandles.lookup().lookupClass()).a(279392457557181L) ^ 91115610095247L;
      long var13 = var11 ^ 74401715382173L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[12];
      int var4 = 0;
      String var5 = "\u0092Ù\u0091Òµ|\u008c³\u008agÁ\u000f\u001dw9Ð\u0015\u00998¬è\tÇ²E\u0089\u0089W\u000f\u0082½¤%ÓÉÊÂÑÐx\bb<\u0092ßé®H\u001e\u009a!\nj/8$\u0014\r@û!M&\u0011@\u007fÒÿ8Z\u009b\u0016ÓLºö\u009bF\u0081p";
      int var6 = "\u0092Ù\u0091Òµ|\u008c³\u008agÁ\u000f\u001dw9Ð\u0015\u00998¬è\tÇ²E\u0089\u0089W\u000f\u0082½¤%ÓÉÊÂÑÐx\bb<\u0092ßé®H\u001e\u009a!\nj/8$\u0014\r@û!M&\u0011@\u007fÒÿ8Z\u009b\u0016ÓLºö\u009bF\u0081p"
         .length();
      byte var3 = 0;

      label129:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var34 = var0;
         var10001 = var4++;
         long var37 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var39 = -1;

         while (true) {
            long var8 = var37;
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
            long var41 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var39) {
               case 0:
                  var34[var10001] = var41;
                  if (var3 >= var6) {
                     Y = new int[x44.a<"t">(new Object[]{var13}, -5793575424315584759L, var11).length];

                     try {
                        Y[x44.a<"m">(-6018221256719004648L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var32) {
                     }

                     try {
                        Y[x44.a<"m">(-5424797474255896392L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var31) {
                     }

                     try {
                        Y[x44.a<"m">(-5422814322156667753L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var30) {
                     }

                     try {
                        Y[x44.a<"m">(-6255329293390665440L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var29) {
                     }

                     try {
                        Y[x44.a<"m">(-5416232113964096905L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var28) {
                     }

                     try {
                        Y[w5.l.ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        Y[x44.a<"m">(-5504555526847545810L, var11).ordinal()] = (int)var0[10];
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        Y[x44.a<"m">(-5691734245096458610L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        Y[x44.a<"m">(-5859166565891948184L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        Y[x44.a<"m">(-5406491956160096292L, var11).ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        Y[x44.a<"m">(-5947138320446119106L, var11).ordinal()] = (int)var0[8];
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        Y[x44.a<"m">(-5427292191067862062L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        Y[x44.a<"m">(-5736561913614989421L, var11).ordinal()] = (int)var0[7];
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        Y[x44.a<"m">(-5702340398331974485L, var11).ordinal()] = (int)var0[11];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        Y[x44.a<"m">(-5506247442130322517L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        Y[x44.a<"m">(-5869906501218061076L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        Y[x44.a<"m">(-5677473109742764993L, var11).ordinal()] = (int)var0[9];
                     } catch (NoSuchFieldError var16) {
                     }

                     return;
                  }
                  break;
               default:
                  var34[var10001] = var41;
                  if (var3 < var6) {
                     continue label129;
                  }

                  var5 = "©ÛÖ6d\u001aÚf®B»]b_rK";
                  var6 = "©ÛÖ6d\u001aÚf®B»]b_rK".length();
                  var3 = 0;
            }

            byte var36 = var3;
            var3 += 8;
            var7 = var5.substring(var36, var3).getBytes("ISO-8859-1");
            var34 = var0;
            var10001 = var4++;
            var37 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var39 = 0;
         }
      }
   }
}
