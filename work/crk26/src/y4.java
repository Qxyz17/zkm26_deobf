package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum y4 {
   public static final y4 o;
   public static final y4 W;
   private static final y4[] N;
   public static final y4 T;
   public static final y4 v;
   public static final y4 U;
   private static final long a = prr.a(1344581696339107812L, -1359580430368836673L, MethodHandles.lookup().lookupClass()).a(37436586645949L);

   public static y4[] Z(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (y4[])m44.a<"m">(8371869747353531627L, var1).clone();
   }

   static {
      long var9 = a ^ 67773116245169L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "(ÕÐéù\u0004\u008fî\u001a\u001bm#a\u0017\u0083w\u0081Ñ½\u0012pFO÷\u0018\\\u001dø-\u000b-k\u009fû\u00912r\u001bq³u4Êo{jG£k\u0018\u0081\u0091\u0000*È9\u001a¦ð6\u0088m\u001dÌw\u0016ë'Ñq\\â\u0080æ";
      int var7 = "(ÕÐéù\u0004\u008fî\u001a\u001bm#a\u0017\u0083w\u0081Ñ½\u0012pFO÷\u0018\\\u001dø-\u000b-k\u009fû\u00912r\u001bq³u4Êo{jG£k\u0018\u0081\u0091\u0000*È9\u001a¦ð6\u0088m\u001dÌw\u0016ë'Ñq\\â\u0080æ"
         .length();
      char var4 = 24;
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     T = new y4();
                     v = new y4();
                     W = new y4();
                     o = new y4();
                     U = new y4();
                     N = new y4[]{
                        m44.a<"j">(-5635427465836227355L, var9),
                        m44.a<"j">(-6033111865905814217L, var9),
                        m44.a<"j">(-5653650952258491885L, var9),
                        m44.a<"j">(-5472081496010934228L, var9),
                        m44.a<"j">(-5667073442561704563L, var9)
                     };
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "º\u0089¿xõ;}ì\u0007~m]VI\u000bN.Ò\u0005\u001c=\u0094\u0088\u009c \u0081\u0091\u0000*È9\u001a¦ð6\u0088m\u001dÌw\u0016cûÔí=ï NÇ,º¹\u0093®£\t";
                  var7 = "º\u0089¿xõ;}ì\u0007~m]VI\u000bN.Ò\u0005\u001c=\u0094\u0088\u009c \u0081\u0091\u0000*È9\u001a¦ð6\u0088m\u001dÌw\u0016cûÔí=ï NÇ,º¹\u0093®£\t"
                     .length();
                  var4 = 24;
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
            var10001 = 0;
         }
      }
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
