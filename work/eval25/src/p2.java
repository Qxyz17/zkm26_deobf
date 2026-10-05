package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class p2 extends pt {
   private static String F;
   private static final long b = ess.a(5911022843585995970L, -5388271182743438653L, MethodHandles.lookup().lookupClass()).a(216555160618313L);

   static {
      long var4 = b ^ 69040490753201L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("«û¿\u0002S\\q·!Z$Y\u0010\u0091\u0013F".getBytes("ISO-8859-1"));
      String var6 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var6;
      x44.a<"q">(var0, -5685229757174096015L, var4);
   }

   public boolean accept(File var1) {
      long var2 = b ^ 43299525493080L;
      return x44.a<"i">(var1, -7227640413992773549L, var2);
   }

   public String H(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"k">(580969957764818555L, var2);
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
