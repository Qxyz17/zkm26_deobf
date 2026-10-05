package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class p9 {
   static final int[] r;
   static final int[] C;

   static {
      long var11 = ess.a(-3893107276229140890L, 1596038787077393755L, MethodHandles.lookup().lookupClass()).a(7906845547236L) ^ 135455685276848L;
      long var13 = var11 ^ 125925457955302L;
      long var15 = var11 ^ 130755812700325L;
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
      String var5 = "\u0005=ÔÿÚ\u0018 À/·¼¦\u000f²\u0007{Ã\u001fU\u0089æ úûbB\n½\"ä¡\f/uvÕ\t\u001aÄ¾";
      int var6 = "\u0005=ÔÿÚ\u0018 À/·¼¦\u000f²\u0007{Ã\u001fU\u0089æ úûbB\n½\"ä¡\f/uvÕ\t\u001aÄ¾".length();
      byte var3 = 0;

      label125:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var35 = var0;
         var10001 = var4++;
         long var38 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var40 = -1;

         while (true) {
            long var8 = var38;
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
            long var42 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var40) {
               case 0:
                  var35[var10001] = var42;
                  if (var3 >= var6) {
                     C = new int[x44.a<"t">(new Object[]{var13}, -4436701408728796866L, var11).length];

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-4354601961273855324L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var33) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-4229958637903753637L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var32) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-4179733223377127114L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var31) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-4398984285102145408L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var30) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-2865552047558176803L, var11).ordinal()] = 5;
                     } catch (NoSuchFieldError var29) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-2794635089845859952L, var11).ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var28) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-2878760670794233899L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-4298635929549375384L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-2554709571218273703L, var11).ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-2676912264578386278L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-2494630786586496590L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        x44.a<"m">(-4047163654625269087L, var11)[x44.a<"m">(-4371669352908722967L, var11).ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var22) {
                     }

                     r = new int[x44.a<"t">(new Object[]{var15}, -4421426974041998488L, var11).length];

                     try {
                        x44.a<"m">(-2790497723422279683L, var11)[x44.a<"m">(-2827621425080614552L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        x44.a<"m">(-2790497723422279683L, var11)[x44.a<"m">(-2550659278077383291L, var11).ordinal()] = 2;
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        x44.a<"m">(-2790497723422279683L, var11)[x44.a<"m">(-4087381016387136026L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        x44.a<"m">(-2790497723422279683L, var11)[x44.a<"m">(-2693613602497674337L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var18) {
                     }

                     return;
                  }
                  break;
               default:
                  var35[var10001] = var42;
                  if (var3 < var6) {
                     continue label125;
                  }

                  var5 = "iÚ\u000b\u0016ëâ|Ý\u0081Äßß·\u0098KV";
                  var6 = "iÚ\u000b\u0016ëâ|Ý\u0081Äßß·\u0098KV".length();
                  var3 = 0;
            }

            byte var37 = var3;
            var3 += 8;
            var7 = var5.substring(var37, var3).getBytes("ISO-8859-1");
            var35 = var0;
            var10001 = var4++;
            var38 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var40 = 0;
         }
      }
   }
}
