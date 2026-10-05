package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum gz {
   public static final gz V;
   private final String A;
   private static final gz[] g;
   public static final gz d;
   public static final gz N;
   private static final long a = prr.a(-8375364188333939013L, -2534304180804198935L, MethodHandles.lookup().lookupClass()).a(58800346986099L);

   static {
      long var9 = a ^ 36492828166783L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[3];
      int var6 = 0;
      String var5 = "¸n_CmÔt¸\u0010-Ý+E ÌL\nçK\u0010ë\u0013Æ52\büéâB5\u001f\u0095x";
      int var7 = "¸n_CmÔt¸\u0010-Ý+E ÌL\nçK\u0010ë\u0013Æ52\büéâB5\u001f\u0095x".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var13;
         if ((var3 += var4) >= var7) {
            d = new gz("");
            N = new gz("-");
            V = new gz("+");
            g = new gz[]{m44.a<"n">(1574440486581499560L, var9), m44.a<"n">(1444325803460416536L, var9), m44.a<"n">(1647118009488889731L, var9)};
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   String Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"s">(this, 7471053512062172009L, var2);
   }

   public static gz[] W(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (gz[])m44.a<"m">(4952618799441046101L, var1).clone();
   }

   private gz(String var3) {
      this.A = var3;
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
