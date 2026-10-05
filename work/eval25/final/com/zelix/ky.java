package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ky extends kd {
   private static final long a = ess.a(5815552382215724572L, -5800469361674757344L, MethodHandles.lookup().lookupClass()).a(118833349710444L);
   private static final String c;

   public ky(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 11295576352914L;
      super(var3, var4);
   }

   protected void U(Object[] var1) {
      _ur var2 = (_ur)var1[0];
      long var3 = (Long)var1[1];
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return c;
   }

   protected void Y(Object[] var1) {
      _ur var6 = (_ur)var1[0];
      int var5 = (Integer)var1[1];
      int var7 = (Integer)var1[2];
      long var2 = (Long)var1[3];
      int var4 = (Integer)var1[4];
   }

   static {
      long var0 = a ^ 115971948934355L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ªµ&Ë\u008c\u0081|S7n×Ç1#`¨TiO¡á\u009chm×\f9X\u0084\fPâ Ú\u0002t\u009d2\u00074r0\u000eþsÔ02".getBytes("ISO-8859-1"));
      String var5 = c(var4).intern();
      byte var10001 = -1;
      c = var5;
   }

   private static String c(byte[] var0) {
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
