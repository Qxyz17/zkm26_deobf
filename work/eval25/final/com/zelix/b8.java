package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b8 extends bo {
   private static final long e = ess.a(-5612800862102921688L, 8546107282665796034L, MethodHandles.lookup().lookupClass()).a(117880364738528L);
   private static final String m;

   b8(long var1, h8 var3, int var4, String var5, _xx var6, _y4 var7, PrintWriter var8) {
      var1 = e ^ var1;
      long var9 = var1 ^ 71295412110744L;
      super(var3, var4, var5, var6, var7, var9, var8, m);
   }

   static {
      long var0 = e ^ 84738519011519L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         " 6\u0002Á/|SýüÆ2è\u0001\u0015\u009b)\u009en\u0093R\u0010@\u0096Þ\u0010J¸\u0081i\u001fªá\u0093\u007f\u001ex{L\u008d\u009a".getBytes("ISO-8859-1")
      );
      String var5 = d(var4).intern();
      byte var10001 = -1;
      m = var5;
   }

   private static String d(byte[] var0) {
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
