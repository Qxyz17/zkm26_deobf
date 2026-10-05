package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lam extends law {
   private static final long f = prr.a(-4132240162669048420L, 5929193517401458823L, MethodHandles.lookup().lookupClass()).a(148554467476386L);
   private static final String s;

   public lam(int var1, long var2) {
      var2 = f ^ var2;
      long var4 = var2 ^ 110619628723491L;
      super(var4, var1);
   }

   void Y(Object[] var1) {
      sh var5 = (sh)var1[0];
      File var8 = (File)var1[1];
      yf var6 = (yf)var1[2];
      lqu var7 = (lqu)var1[3];
      long var3 = (Long)var1[4];
      e_ var2 = (e_)var1[5];
      long var9 = var3 ^ 84786295147513L;
      long var11 = var3 ^ 88001796362145L;
      long var13 = var3 ^ 133572006750758L;
      long var15 = var3 ^ 140253902109691L;
      long var17 = var3 ^ 53817868760121L;
      int var10001 = m44.a<"p">(this, new Object[]{var11}, 439976344790539639L, var3);
      boolean var10002 = m44.a<"p">(this, new Object[]{var17}, 1973595385181068481L, var3);
      boolean var10003 = m44.a<"p">(this, new Object[]{var15}, 412805188502826508L, var3);
      Object[] var10011 = new Object[]{null, null, null, m44.a<"p">(this, new Object[]{var13}, 368114741630734281L, var3), var8, var6, var7, var2, var9};
      var10011[2] = var10003;
      var10011[1] = var10002;
      var10011[0] = var10001;
      m44.a<"p">(var5, var10011, 2212220083423605115L, var3);
   }

   public String N(Object[] var1) {
      long var2 = (Long)var1[0];
      return s;
   }

   static {
      long var0 = f ^ 34212288753835L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ö\u0087\u0005Î\u0010ì¼Å".getBytes("ISO-8859-1"));
      String var5 = e(var4).intern();
      byte var10001 = -1;
      s = var5;
   }

   private static String e(byte[] var0) {
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
