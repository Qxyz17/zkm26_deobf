package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class rp {
   static final int[] F;

   static {
      long var11 = prr.a(-1628813270492432284L, -1427405090568402242L, MethodHandles.lookup().lookupClass()).a(131522917217730L) ^ 134162853041210L;
      long var13 = var11 ^ 63483812990297L;
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
      String var5 = "ëó1j^\u0096\u008fÔ\u0099\u009dç\u000f\u00019J?";
      int var6 = "ëó1j^\u0096\u008fÔ\u0099\u009dç\u000f\u00019J?".length();
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
                     F = new int[m44.a<"h">(new Object[]{var13}, 8304649801358163180L, var11).length];

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(8279667236073781754L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(8060535354568293704L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(7849753406870011966L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(8377878182026474155L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(7589451948268586090L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(8338151501591370038L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(7700302988730990330L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(8340173991260041927L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        m44.a<"l">(7895850804431433002L, var11)[m44.a<"l">(8570154649730971436L, var11).ordinal()] = (int)var0[0];
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

                  var5 = "¦D|hÈ\u0006È\nÔ¨\u009d\u0084û?X ";
                  var6 = "¦D|hÈ\u0006È\nÔ¨\u009d\u0084û?X ".length();
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
