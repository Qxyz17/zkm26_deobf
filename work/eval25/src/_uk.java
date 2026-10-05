package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _uk {
   public static final _uk K;
   public static final _uk B;
   public static final _uk X;
   private static final _uk[] A;

   static {
      long var9 = ess.a(6705302969645062809L, -7268349634514359476L, MethodHandles.lookup().lookupClass()).a(230747898361060L) ^ 31278083134059L;
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
      String var5 = "\u0013¦L¢\u007f\u0004\u0014\u009bqÈ¦\u0004À\u0083\u0010\u0017\u0010ö\u0087*ô\u0007É\u0081¼®\u0097È¶\u001eXãD\u0010Â¹ï[_\u0002ä¿Â¼öý\u0012ÞG\n";
      int var7 = "\u0013¦L¢\u007f\u0004\u0014\u009bqÈ¦\u0004À\u0083\u0010\u0017\u0010ö\u0087*ô\u0007É\u0081¼®\u0097È¶\u001eXãD\u0010Â¹ï[_\u0002ä¿Â¼öý\u0012ÞG\n"
         .length();
      char var4 = 16;
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var13;
         if ((var3 += var4) >= var7) {
            X = new _uk();
            B = new _uk();
            K = new _uk();
            A = new _uk[]{x44.a<"i">(1695632507888002032L, var9), x44.a<"i">(1513520371022050669L, var9), x44.a<"i">(1634265173031254354L, var9)};
            return;
         }

         var4 = var5.charAt(var3);
      }
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
