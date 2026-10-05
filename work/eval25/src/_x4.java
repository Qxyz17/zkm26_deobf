package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

// $VF: synthetic class
public class _x4 {
   static final int[] R;

   static {
      long var11 = ess.a(7579338356439719284L, -8141384518371770071L, MethodHandles.lookup().lookupClass()).a(241464232592472L) ^ 73958804274852L;
      long var13 = var11 ^ 84883707414673L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "H\u0012\n1\u0007\u0007°\u0017Ô0Ã\u008b;\u0097ûª";
      int var6 = "H\u0012\n1\u0007\u0007°\u0017Ô0Ã\u008b;\u0097ûª".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var8 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
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
         long var10004 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         byte var24 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      R = new int[x44.a<"p">(new Object[]{var13}, 41969740181544965L, var11).length];

      try {
         R[w5.l.ordinal()] = 1;
      } catch (NoSuchFieldError var22) {
      }

      try {
         R[x44.a<"i">(2060376423582667042L, var11).ordinal()] = 2;
      } catch (NoSuchFieldError var21) {
      }

      try {
         R[x44.a<"i">(1998245736875044788L, var11).ordinal()] = 3;
      } catch (NoSuchFieldError var20) {
      }

      try {
         R[x44.a<"i">(449398710983460396L, var11).ordinal()] = 4;
      } catch (NoSuchFieldError var19) {
      }

      try {
         R[x44.a<"i">(2165927153704884610L, var11).ordinal()] = 5;
      } catch (NoSuchFieldError var18) {
      }

      try {
         R[x44.a<"i">(124976626046922340L, var11).ordinal()] = (int)var0[0];
      } catch (NoSuchFieldError var17) {
      }

      try {
         R[x44.a<"i">(2014312640187775184L, var11).ordinal()] = (int)var0[1];
      } catch (NoSuchFieldError var16) {
      }
   }
}
