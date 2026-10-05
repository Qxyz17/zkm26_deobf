package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class lk3 {
   static final int[] h;

   static {
      long var11 = prr.a(-5251387867818576L, -3098407071860817359L, MethodHandles.lookup().lookupClass()).a(262382078956931L) ^ 82632450015392L;
      long var13 = var11 ^ 35214888595944L;
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
      String var5 = "ä\u0014}\u0082G)ÿÌ\u0006\u000f\u0007ôL}õ¿";
      int var6 = "ä\u0014}\u0082G)ÿÌ\u0006\u000f\u0007ôL}õ¿".length();
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
                     h = new int[m44.a<"i">(new Object[]{var13}, -3462965449500983203L, var11).length];

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-3578584067522853557L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-3211665178995817991L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-3432036924316582769L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-3966217260131070438L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-3034792907585242917L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-3529123194364631673L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-2995490242313338293L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-3526501347355390346L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        m44.a<"m">(-2916020356794685831L, var11)[m44.a<"m">(-3864555202844308579L, var11).ordinal()] = (int)var0[0];
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

                  var5 = "\u0095_\u000eÃLÕMi·\n\u0018B£\t´\u0092";
                  var6 = "\u0095_\u000eÃLÕMi·\n\u0018B£\t´\u0092".length();
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
