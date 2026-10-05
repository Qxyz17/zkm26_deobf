package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _gp extends _n7 {
   private static final long a = ess.a(-5190346703947242607L, -7735357324865771138L, MethodHandles.lookup().lookupClass()).a(69255068707734L);
   private static final String b;

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b;
   }

   protected void G(Object[] var1) {
      _uu var2 = (_uu)var1[0];
      int var4 = (Integer)var1[1];
      long var6 = (Long)var1[2];
      int var3 = (Integer)var1[3];
      int var5 = (Integer)var1[4];
      long var8 = var6 ^ 78561399666985L;
      x44.a<"m">(var2, new Object[]{var8}, 1181810179942180389L, var6);
   }

   public _gp(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 41780119792762L;
      super(var4, var3);
   }

   static {
      long var0 = a ^ 22389944728590L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ÁW?íÒ9ò8%K·AªK<¨_Å¥;Iàè°".getBytes("ISO-8859-1"));
      String var5 = b(var4).intern();
      byte var10001 = -1;
      b = var5;
   }

   private static String b(byte[] var0) {
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
