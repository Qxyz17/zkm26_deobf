package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFrame;

public class dy extends d8 {
   private static final long d = ess.a(8196808337756745872L, -3899552303044980426L, MethodHandles.lookup().lookupClass()).a(258778572906452L);
   private static final String k;

   dy(JFrame var1, String var2, po var3, String var4, long var5, String var7, String var8, as var9, eq var10) {
      var5 = d ^ var5;
      long var11 = var5 ^ 20902249196573L;
      super(var1, var11, var2, var3, var4, var7, var8, var9, var10);
   }

   void k(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"i">(x44.a<"m">(this, 2810086568161764653L, var3), var2, 2805291572486451949L, var3);
      x44.a<"i">(x44.a<"m">(this, 2810086568161764653L, var3), 4345448362968612119L, var3);
   }

   protected void s(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 96220742129266L;
      x44.a<"q">(new Object[]{k, var4}, 7393910029253152720L, var2);
   }

   static {
      long var0 = d ^ 91644289236300L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("t)\nÚ£\u0011ÒF".getBytes("ISO-8859-1"));
      String var5 = d(var4).intern();
      byte var10001 = -1;
      k = var5;
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
