package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bu extends by {
   private static final long e = ess.a(-7184994275942967781L, 7808874381493467340L, MethodHandles.lookup().lookupClass()).a(97806373722360L);
   private static final String j;

   bu(h8 var1, long var2, short var4, int var5, String var6, _xx var7, _y4 var8, _y4 var9, PrintWriter var10) {
      long var11 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ e;
      long var13 = var11 ^ 90152360410665L;
      super(var1, var5, var6, var13, var7, var8, var9, var10, j);
   }

   static {
      long var0 = e ^ 98818920130152L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("uTD4}\u0005ÂÖE\u009bôû=µ±6ìÂX¬TÂ\u001bê9v¿ø´¿\u001d²".getBytes("ISO-8859-1"));
      String var5 = d(var4).intern();
      byte var10001 = -1;
      j = var5;
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
