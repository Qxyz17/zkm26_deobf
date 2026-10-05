package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class _k7 {
   static final int[] D;

   static {
      long var11 = ess.a(7494134555822669543L, 8675808095192337327L, MethodHandles.lookup().lookupClass()).a(152113893656158L) ^ 27201060966427L;
      long var13 = var11 ^ 109669799888035L;
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
      String var5 = "_W¬Ho½\u0007\u0017¦\u00882c\u001e»\u008f \u0014®ÄXÉ\u001cÖ\u009c Æ¾À\u0089ÞÚq)\u000bH\u0083ËE¦\u0092";
      int var6 = "_W¬Ho½\u0007\u0017¦\u00882c\u001e»\u008f \u0014®ÄXÉ\u001cÖ\u009c Æ¾À\u0089ÞÚq)\u000bH\u0083ËE¦\u0092".length();
      byte var3 = 0;

      label99:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var29 = var0;
         var10001 = var4++;
         long var32 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var34 = -1;

         while (true) {
            long var8 = var32;
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
            long var36 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var34) {
               case 0:
                  var29[var10001] = var36;
                  if (var3 >= var6) {
                     D = new int[x44.a<"w">(new Object[]{var13}, -8332104633113109786L, var11).length];

                     try {
                        D[x44.a<"n">(-8519577890357685730L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        D[y4.u.ordinal()] = 2;
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        D[x44.a<"n">(-7561387887532147352L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        D[x44.a<"n">(-8167173924521893167L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        D[y4.m.ordinal()] = 5;
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        D[x44.a<"n">(-7755780274795991960L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        D[x44.a<"n">(-8392354199398883211L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        D[x44.a<"n">(-7969387742491824155L, var11).ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        D[x44.a<"n">(-8330754715495350766L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        D[x44.a<"n">(-7763537834904745802L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        D[y4.w.ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        D[y4.h.ordinal()] = (int)var0[3];
                     } catch (NoSuchFieldError var16) {
                     }

                     return;
                  }
                  break;
               default:
                  var29[var10001] = var36;
                  if (var3 < var6) {
                     continue label99;
                  }

                  var5 = "ú$çD\u0090${¯ÝùCAW\u001d\u009fÜ";
                  var6 = "ú$çD\u0090${¯ÝùCAW\u001d\u009fÜ".length();
                  var3 = 0;
            }

            byte var31 = var3;
            var3 += 8;
            var7 = var5.substring(var31, var3).getBytes("ISO-8859-1");
            var29 = var0;
            var10001 = var4++;
            var32 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var34 = 0;
         }
      }
   }
}
