package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class y5 implements _rd {
   private static final String a;
   private static final long b;

   public String[] v(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      return a;
   }

   public String Q(Object[] var1) {
      return "a";
   }

   public int J(Object[] var1) {
      return 0;
   }

   public String[] k(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   public List X(Object[] var1) {
      my var2 = (my)var1[0];
      long var3 = (Long)var1[1];
      my[] var5 = (my[])var1[2];
      ArrayList var6 = new ArrayList();
      var6.add(new _ow((int)b, var2));
      return var6;
   }

   public String[] f(Object[] var1) {
      long var2 = (Long)var1[0];
      return null;
   }

   static {
      long var5 = ess.a(-5492359238119066500L, -424353815001083412L, MethodHandles.lookup().lookupClass()).a(239215839874308L) ^ 118196843705372L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("û\u0003ED! Â26dKöi0\u008a\u0096\u0098Lå\u0019\u009aRú¡\u0010©/ó«,ÔÖ\u009f\u000f\u007fT%\u009a}a".getBytes("ISO-8859-1"));
      String var12 = b(var9).intern();
      byte var10001 = -1;
      a = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -1536139544889397495L;
      byte[] var4 = var0.doFinal(
         new byte[]{
            (byte)((int)(var2 >>> 56)),
            (byte)((int)(var2 >>> 48)),
            (byte)((int)(var2 >>> 40)),
            (byte)((int)(var2 >>> 32)),
            (byte)((int)(var2 >>> 24)),
            (byte)((int)(var2 >>> 16)),
            (byte)((int)(var2 >>> 8)),
            (byte)((int)var2)
         }
      );
      long var14 = ((long)var4[0] & 255L) << 56
         | ((long)var4[1] & 255L) << 48
         | ((long)var4[2] & 255L) << 40
         | ((long)var4[3] & 255L) << 32
         | ((long)var4[4] & 255L) << 24
         | ((long)var4[5] & 255L) << 16
         | ((long)var4[6] & 255L) << 8
         | (long)var4[7] & 255L;
      var10001 = -1;
      b = var14;
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
