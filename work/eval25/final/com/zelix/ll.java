package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class ll {
   static final int[] O;

   static {
      long var11 = ess.a(8686214183877323774L, -3188697695009226094L, MethodHandles.lookup().lookupClass()).a(25698871603154L) ^ 107638140917449L;
      long var13 = var11 ^ 106518372655972L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[8];
      int var4 = 0;
      String var5 = "\u001d] G\u009b\u0082%\u009bL8ø\u0093\u0002XK\u001a\u001d8\u0019²\u0018'ýÝß°ûÎ\u008a\u0007¸\u0011\tvq%\u001eûg\u0015\u0085\u008b|éa\u0015Ú\u0005";
      int var6 = "\u001d] G\u009b\u0082%\u009bL8ø\u0093\u0002XK\u001a\u001d8\u0019²\u0018'ýÝß°ûÎ\u008a\u0007¸\u0011\tvq%\u001eûg\u0015\u0085\u008b|éa\u0015Ú\u0005"
         .length();
      byte var3 = 0;

      label105:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var30 = var0;
         var10001 = var4++;
         long var33 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var35 = -1;

         while (true) {
            long var8 = var33;
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
            long var37 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var35) {
               case 0:
                  var30[var10001] = var37;
                  if (var3 >= var6) {
                     O = new int[x44.a<"v">(new Object[]{var13}, -2985365604940842728L, var11).length];

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3495475489269174068L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var28) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3426845959244849192L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3729924813691029771L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3913256550039170830L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3980356658803007513L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3980228591159739475L, var11).ordinal()] = (int)var0[7];
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3340208340624912905L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-2983511746703909280L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3627677592813829216L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3445345529801911888L, var11).ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3316913818349704528L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-3527474810169121621L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        x44.a<"o">(-4026022354497954509L, var11)[x44.a<"o">(-2996378646137503418L, var11).ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var16) {
                     }

                     return;
                  }
                  break;
               default:
                  var30[var10001] = var37;
                  if (var3 < var6) {
                     continue label105;
                  }

                  var5 = "û¦gÿc:a\u0018Þ\u001fz\u001dIf½Á";
                  var6 = "û¦gÿc:a\u0018Þ\u001fz\u001dIf½Á".length();
                  var3 = 0;
            }

            byte var32 = var3;
            var3 += 8;
            var7 = var5.substring(var32, var3).getBytes("ISO-8859-1");
            var30 = var0;
            var10001 = var4++;
            var33 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var35 = 0;
         }
      }
   }
}
