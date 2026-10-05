package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class qq {
   static final int[] D;

   static {
      long var11 = ess.a(-1842991138189340876L, 1763400511213130611L, MethodHandles.lookup().lookupClass()).a(81190022234797L) ^ 77326049087885L;
      long var13 = var11 ^ 54265343426802L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "ú\u001bIA0¤\u0017t;\u009cm\u009f¬Ïó_";
      int var6 = "ú\u001bIA0¤\u0017t;\u009cm\u009f¬Ïó_".length();
      byte var3 = 0;

      label81:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var26 = var0;
         var10001 = var4++;
         long var29 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var31 = -1;

         while (true) {
            long var8 = var29;
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
            long var33 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var31) {
               case 0:
                  var26[var10001] = var33;
                  if (var3 >= var6) {
                     D = new int[x44.a<"q">(new Object[]{var13}, -6974915796832021667L, var11).length];

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-7250090955470552154L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-7167882806868023031L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-7148508855161048116L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-7212462905352659841L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-8896013026417133413L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-8916116994313353696L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-8988352777272128459L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-7111273696780123862L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        x44.a<"h">(-6953379045666692439L, var11)[x44.a<"h">(-6988862762400050007L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var16) {
                     }

                     return;
                  }
                  break;
               default:
                  var26[var10001] = var33;
                  if (var3 < var6) {
                     continue label81;
                  }

                  var5 = "]HJg#ÍÌUM÷\u0086îñËf>";
                  var6 = "]HJg#ÍÌUM÷\u0086îñËf>".length();
                  var3 = 0;
            }

            byte var28 = var3;
            var3 += 8;
            var7 = var5.substring(var28, var3).getBytes("ISO-8859-1");
            var26 = var0;
            var10001 = var4++;
            var29 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var31 = 0;
         }
      }
   }
}
