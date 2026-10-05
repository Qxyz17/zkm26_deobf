package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _y {
   public static final _y d;
   private final int M;
   public static final _y i;
   public static final _y F;
   public static final _y o;
   private static final _y[] D;
   private static final long a = ess.a(-8422485076927904455L, -5705597716283994294L, MethodHandles.lookup().lookupClass()).a(162942192895439L);

   static {
      long var9 = a ^ 27957353596306L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "²wÖ¿Úóý·\bÜËøËë\u008d\u000bò";
      int var7 = "²wÖ¿Úóý·\bÜËøËë\u008d\u000bò".length();
      char var4 = '\b';
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
                     F = new _y(0);
                     i = new _y(1);
                     o = new _y(2);
                     d = new _y(3);
                     D = new _y[]{
                        x44.a<"h">(-8328311505850334210L, var9),
                        x44.a<"h">(-7657439064050480112L, var9),
                        x44.a<"h">(-7724288584521833042L, var9),
                        x44.a<"h">(-8411378406440861318L, var9)
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

                  var5 = "\u001fÜ\u0080lº\u008e\u0004v\u0010TÏÉ¢ð\u0001(Ý\u007f\u0007Õ©Ô|øÏ";
                  var7 = "\u001fÜ\u0080lº\u008e\u0004v\u0010TÏÉ¢ð\u0001(Ý\u007f\u0007Õ©Ô|øÏ".length();
                  var4 = '\b';
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
            var10001 = 0;
         }
      }
   }

   public static _y[] z(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (_y[])x44.a<"k">(-6395449024648988141L, var1).clone();
   }

   int g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 3413239848719902899L, var2);
   }

   private _y(int var3) {
      this.M = var3;
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
