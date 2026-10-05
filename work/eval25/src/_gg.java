package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _gg extends _n7 {
   private static final long a = ess.a(467438184688827002L, -3248280680590049630L, MethodHandles.lookup().lookupClass()).a(108977993587193L);
   private static final String b;

   protected void G(Object[] var1) {
      _uu var5 = (_uu)var1[0];
      int var4 = (Integer)var1[1];
      long var6 = (Long)var1[2];
      int var3 = (Integer)var1[3];
      int var2 = (Integer)var1[4];
      long var8 = var6 ^ 127794741267177L;
      x44.a<"m">(var5, new Object[]{var8}, 1267757264416447272L, var6);
   }

   public _gg(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 29405799452509L;
      super(var4, var3);
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b;
   }

   static {
      long var0 = a ^ 66221156694254L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0013åÐ£÷\u0086ÿÄ*v¿\bÅ\u001c\u0088\u0016ÊÖ.ñbÓásA\u0013\u0003L«]L@".getBytes("ISO-8859-1"));
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
