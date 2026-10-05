package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class _85 {
   static final int[] I;

   static {
      long var11 = ess.a(-704587279339777117L, 3172004159747589015L, MethodHandles.lookup().lookupClass()).a(144938782928128L) ^ 83059220812216L;
      long var13 = var11 ^ 84910197394427L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[9];
      int var4 = 0;
      String var5 = "½ÝV0ê<áT\u000eñÛqÄe&ûÂ\\rixjïûæ\u0087\u0010\u0013\u00015\u0017ÈHæí¸3\u0010óä\u000bÛú<U\u0080\u001eæKª Ùé\u0018Eu";
      int var6 = "½ÝV0ê<áT\u000eñÛqÄe&ûÂ\\rixjïûæ\u0087\u0010\u0013\u00015\u0017ÈHæí¸3\u0010óä\u000bÛú<U\u0080\u001eæKª Ùé\u0018Eu".length();
      byte var3 = 0;

      label111:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var31 = var0;
         var10001 = var4++;
         long var34 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var36 = -1;

         while (true) {
            long var8 = var34;
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
            long var38 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var36) {
               case 0:
                  var31[var10001] = var38;
                  if (var3 >= var6) {
                     I = new int[x44.a<"r">(new Object[]{var13}, 287978912993715055L, var11).length];

                     try {
                        x44.a<"k">(169693999488926076L, var11)[w5.l.ordinal()] = 1;
                     } catch (NoSuchFieldError var29) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(76996221210038104L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var28) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(204352613320092942L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(1773932985195019194L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(2118076451334839016L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(8150904787738750L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(2305259696453390920L, var11).ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(1788265378833312990L, var11).ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(384659423205590342L, var11).ordinal()] = (int)var0[8];
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(1790257309696708849L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(1779945523771133457L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(1785796079347935156L, var11).ordinal()] = (int)var0[7];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(2019211073978510325L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        x44.a<"k">(169693999488926076L, var11)[x44.a<"k">(2302447221835864013L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var16) {
                     }

                     return;
                  }
                  break;
               default:
                  var31[var10001] = var38;
                  if (var3 < var6) {
                     continue label111;
                  }

                  var5 = "e@¤³U¶\u0080DÆMä\u0002M©a\u008f";
                  var6 = "e@¤³U¶\u0080DÆMä\u0002M©a\u008f".length();
                  var3 = 0;
            }

            byte var33 = var3;
            var3 += 8;
            var7 = var5.substring(var33, var3).getBytes("ISO-8859-1");
            var31 = var0;
            var10001 = var4++;
            var34 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var36 = 0;
         }
      }
   }
}
