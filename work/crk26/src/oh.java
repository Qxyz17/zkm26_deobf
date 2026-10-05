package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class oh {
   static final int[] M;

   static {
      long var11 = prr.a(5828881751398171541L, -9041781526637627242L, MethodHandles.lookup().lookupClass()).a(63481398431229L) ^ 114371230810872L;
      long var13 = var11 ^ 111287250516245L;
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
      String var5 = "\u0017Ç\u009fª\u000b\u0086\r\u009cg\u0094Ä\u0095\u0097\u001aÕûÐê¼\u0093\u001e\u0080N|Uç/F½yÐ\u001bW]½\u00ad\u0082>\rÐ";
      int var6 = "\u0017Ç\u009fª\u000b\u0086\r\u009cg\u0094Ä\u0095\u0097\u001aÕûÐê¼\u0093\u001e\u0080N|Uç/F½yÐ\u001bW]½\u00ad\u0082>\rÐ".length();
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
                     M = new int[m44.a<"i">(new Object[]{var13}, 2591796099358376557L, var11).length];

                     try {
                        M[m44.a<"m">(2618851313462542521L, var11).ordinal()] = 1;
                     } catch (NoSuchFieldError var27) {
                     }

                     try {
                        M[fh.T.ordinal()] = 2;
                     } catch (NoSuchFieldError var26) {
                     }

                     try {
                        M[m44.a<"m">(4491154648861521946L, var11).ordinal()] = 3;
                     } catch (NoSuchFieldError var25) {
                     }

                     try {
                        M[m44.a<"m">(4267384931631700980L, var11).ordinal()] = 4;
                     } catch (NoSuchFieldError var24) {
                     }

                     try {
                        M[fh.U.ordinal()] = 5;
                     } catch (NoSuchFieldError var23) {
                     }

                     try {
                        M[m44.a<"m">(2316996066630815336L, var11).ordinal()] = (int)var0[1];
                     } catch (NoSuchFieldError var22) {
                     }

                     try {
                        M[m44.a<"m">(2419826570388282300L, var11).ordinal()] = (int)var0[0];
                     } catch (NoSuchFieldError var21) {
                     }

                     try {
                        M[m44.a<"m">(2370617383567300115L, var11).ordinal()] = (int)var0[2];
                     } catch (NoSuchFieldError var20) {
                     }

                     try {
                        M[m44.a<"m">(2403825257552843338L, var11).ordinal()] = (int)var0[4];
                     } catch (NoSuchFieldError var19) {
                     }

                     try {
                        M[m44.a<"m">(4579734654861945410L, var11).ordinal()] = (int)var0[5];
                     } catch (NoSuchFieldError var18) {
                     }

                     try {
                        M[fh.u.ordinal()] = (int)var0[6];
                     } catch (NoSuchFieldError var17) {
                     }

                     try {
                        M[fh.b.ordinal()] = (int)var0[3];
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

                  var5 = ",\u007fY\bQ\u0087Ð\u001bÎ\r\u0015\u0001ÂÍ-\u0016";
                  var6 = ",\u007fY\bQ\u0087Ð\u001bÎ\r\u0015\u0001ÂÍ-\u0016".length();
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
