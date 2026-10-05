package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ma {
   public static final ma p;
   public static final ma D;
   public static final ma t;
   public static final ma G;
   public static final ma x;
   private static final ma[] X;
   private static int S;
   public static final ma Q;
   public static final ma U;
   private static final long a = ess.a(-9105240866345416630L, -8405700838769050688L, MethodHandles.lookup().lookupClass()).a(60540511571608L);

   public static int h() {
      int var0 = U();
      return var0 == 0 ? 66 : 0;
   }

   static {
      long var20 = a ^ 68651780236960L;
      if (x44.a<"t">(3278428001205348204L, var20) != 0) {
         x44.a<"t">(83, 3006689484977367462L, var20);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[7];
      int var17 = 0;
      String var16 = "úºÐJÆ÷\u0014±â\u0018îaíè&Æ1³³&o^§5\u00188+PÛ¬\u0005\u0093v5\u0015íâ@g\u0010âi^p\u008b\u0007\u0016\u0011\u008c úºÐJÆ÷\u0014±â\u0018îaíè&Æ»rX\u001a\u00136ØÇ\u0017ª\u008c\u007f÷p¤\u0091\u0018;mE\tçcÈ\u008eýSeûXÎ0yO@ùgó\u0085\u0005º\u0018ÚT\u0017SNJ/tK\u0080\u009f\u001b\u0082bÊ <&ÀÍ*«ù]";
      int var18 = "úºÐJÆ÷\u0014±â\u0018îaíè&Æ1³³&o^§5\u00188+PÛ¬\u0005\u0093v5\u0015íâ@g\u0010âi^p\u008b\u0007\u0016\u0011\u008c úºÐJÆ÷\u0014±â\u0018îaíè&Æ»rX\u001a\u00136ØÇ\u0017ª\u008c\u007f÷p¤\u0091\u0018;mE\tçcÈ\u008eýSeûXÎ0yO@ùgó\u0085\u0005º\u0018ÚT\u0017SNJ/tK\u0080\u009f\u001b\u0082bÊ <&ÀÍ*«ù]"
         .length();
      char var15 = 24;
      int var23 = -1;

      label51:
      while (true) {
         String var24 = var16.substring(++var23, var23 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var34 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var34;
                  if ((var23 += var15) >= var18) {
                     Cipher var1;
                     var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var2 = 1; var2 < 8; var2++) {
                        var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var0 = new long[3];
                     int var4 = 0;
                     String var5 = "v\\þ\u00ad;æ]\u0015u\u008bôH\u0001`õ\u009c\u001e\u0001¿Ã +0\u0000";
                     int var6 = "v\\þ\u00ad;æ]\u0015u\u008bôH\u0001`õ\u009c\u001e\u0001¿Ã +0\u0000".length();
                     byte var3 = 0;

                     do {
                        var10001 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
                        var10001 = var4++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte[] var10 = var1.doFinal(
                           new byte[]{
                              (byte)((int)(var8 >>> 56)),
                              (byte)((int)(var8 >>> 48)),
                              (byte)((int)(var8 >>> 40)),
                              (byte)((int)(var8 >>> 32)),
                              (byte)((int)(var8 >>> 24)),
                              (byte)((int)(var8 >>> 16)),
                              (byte)((int)(var8 >>> 8)),
                              (byte)((int)var8)
                           }
                        );
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var39 = -1;
                        var0[var10001] = var10004;
                     } while (var3 < var6);

                     p = new ma();
                     G = new ma();
                     Q = new ma();
                     D = new ma();
                     t = new ma();
                     U = new ma();
                     x = new ma();
                     ma[] var27 = new ma[(int)var0[0]];
                     var27[0] = x44.a<"m">(3830052705533263311L, var20);
                     var27[1] = x44.a<"m">(3979217298312613104L, var20);
                     var27[2] = x44.a<"m">(3033618345019365284L, var20);
                     var27[3] = x44.a<"m">(3562390490353595399L, var20);
                     var27[4] = x44.a<"m">(3327992353893250700L, var20);
                     var27[5] = x44.a<"m">(4029823716590152141L, var20);
                     var27[(int)var0[2]] = x44.a<"m">(3919584768527687286L, var20);
                     X = var27;
                     return;
                  }

                  var15 = var16.charAt(var23);
                  break;
               default:
                  var11[var17++] = var34;
                  if ((var23 += var15) < var18) {
                     var15 = var16.charAt(var23);
                     continue label51;
                  }

                  var16 = "d\u0000%\u009e\u0094\u009fÓUN\u0004©\u0001p'Fy*   \u0003\n¼O\u00101\f®2\u00955Î ¤¥\u000bB|Ok\u0094";
                  var18 = "d\u0000%\u009e\u0094\u009fÓUN\u0004©\u0001p'Fy*   \u0003\n¼O\u00101\f®2\u00955Î ¤¥\u000bB|Ok\u0094".length();
                  var15 = 24;
                  var23 = -1;
            }

            var24 = var16.substring(++var23, var23 + var15);
            var10001 = 0;
         }
      }
   }

   public static void J(int var0) {
      S = var0;
   }

   public static int U() {
      return S;
   }

   public static ma[] C(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (ma[])x44.a<"n">(2887909118448460040L, var1).clone();
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
