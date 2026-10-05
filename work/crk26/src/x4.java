package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class x4 {
   static final int[] W;

   static {
      long var11 = prr.a(-3812249806848402098L, -1938243152371756212L, MethodHandles.lookup().lookupClass()).a(116288052826368L) ^ 238584721414L;
      long var13 = var11 ^ 66847894378890L;
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
      String var5 = "ûvñKÑ\u0090¥\u0016â\u0092\u001b\u0018\r_Y\u000e";
      int var6 = "ûvñKÑ\u0090¥\u0016â\u0092\u001b\u0018\r_Y\u000e".length();
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
                     W = new int[m44.a<"h">(new Object[]{var13}, -7827046930065523880L, var11).length];

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[m44.a<"l">(-8435017502516359545L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[m44.a<"l">(-7562777467005823814L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[m44.a<"l">(-8303709173804750724L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[m44.a<"l">(-8440884642011501269L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[m44.a<"l">(-8380999470332786939L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[va.Q.ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[m44.a<"l">(-7586310200263677518L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[m44.a<"l">(-7628834696174283112L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        m44.a<"l">(-8387793552959958402L, var11)[m44.a<"l">(-7622166234157217584L, var11).ordinal()] = (int)var0[0];
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

                  var5 = "sßgÏ\u0087ýÞÈ&Ev\u0007óÓ\nó";
                  var6 = "sßgÏ\u0087ýÞÈ&Ev\u0007óÓ\nó".length();
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
