package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ha extends h1 {
   private static final long b = ess.a(4753055143521116549L, 5842434959845152202L, MethodHandles.lookup().lookupClass()).a(70924473946721L);
   private static final String g;

   final ik W(Object[] var1) {
      _xx var7 = (_xx)var1[0];
      te var6 = (te)var1[1];
      _y4 var2 = (_y4)var1[2];
      _y4 var5 = (_y4)var1[3];
      long var3 = (Long)var1[4];
      long var8 = var3 ^ 97556768495766L;
      return new io(this, var8, var7, var6, var2, var5);
   }

   ha(h8 var1, int var2, String var3, _xx var4, long var5, te var7, _y4 var8, PrintWriter var9, _y4 var10) {
      var5 = b ^ var5;
      long var11 = var5 ^ 18862680828968L;
      super(var1, var11, var2, var3, var4, var7, var8, var9, var10, g);
   }

   static {
      long var0 = b ^ 47824096318799L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal(
         "\u001e×\u008aÆÂ±ýx\u009ek®)\b\u0092+?sÀxE9Þùa\u00adt7\u0093º\u0005\u001c\u0000\u001eÿEi¿kj\u009b\u008c<ªõ\u008d´¡ï".getBytes("ISO-8859-1")
      );
      String var5 = d(var4).intern();
      byte var10001 = -1;
      g = var5;
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
