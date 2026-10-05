package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _zp {
   private final String v;
   public static final _zp i;
   public static final _zp A;
   public static final _zp Q;
   private static final _zp[] N;
   private static final long a = ess.a(288979084537099476L, -5591847671501338132L, MethodHandles.lookup().lookupClass()).a(112879253147104L);

   private _zp(String var3) {
      this.v = var3;
   }

   public static _zp[] t(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (_zp[])x44.a<"i">(-2138621907630059161L, var1).clone();
   }

   static {
      long var9 = a ^ 95838201478635L;
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
      String var5 = "ÓÜ\u001aÞ1åí·UÕ\u0017&\u0095ñ¤]\búâý\u000b¹Á\"·\bÂ»Yß^\u001a7¦";
      int var7 = "ÓÜ\u001aÞ1åí·UÕ\u0017&\u0095ñ¤]\búâý\u000b¹Á\"·\bÂ»Yß^\u001a7¦".length();
      char var4 = 16;
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var13;
         if ((var3 += var4) >= var7) {
            i = new _zp("");
            Q = new _zp("-");
            A = new _zp("+");
            N = new _zp[]{x44.a<"j">(-6741578172563369452L, var9), x44.a<"j">(-6601862663148756205L, var9), x44.a<"j">(-4817082517236591656L, var9)};
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   String v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, -7988392027053972086L, var2);
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
