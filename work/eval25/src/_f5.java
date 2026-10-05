package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _f5 {
   public static final _f5 O;
   public static final _f5 v;
   public static final _f5 x;
   public static final _f5 f;
   public static final _f5 l;
   private static final _f5[] r;
   private static final long a = ess.a(6989027199753640888L, -4653159045448541375L, MethodHandles.lookup().lookupClass()).a(260782009100066L);

   public static _f5[] t(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (_f5[])x44.a<"i">(-6384485707871290031L, var1).clone();
   }

   static {
      long var9 = a ^ 7224787288771L;
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
      String var5 = "ãÈ\u0090ïÆ¾.R\u0091P>\u0095»\u0091&v¢\u008fø/ÈÃ3%\u0018ùb\u001c\u001e©³¾'¶\u0001ù§¥~\u0000!eäÒGÙ~\u0004\u0098 ùb\u001c\u001e©³¾'¶\u0001ù§¥~\u0000!\u0007&:pr\u0089\u0098-kûñD!¡y×";
      int var7 = "ãÈ\u0090ïÆ¾.R\u0091P>\u0095»\u0091&v¢\u008fø/ÈÃ3%\u0018ùb\u001c\u001e©³¾'¶\u0001ù§¥~\u0000!eäÒGÙ~\u0004\u0098 ùb\u001c\u001e©³¾'¶\u0001ù§¥~\u0000!\u0007&:pr\u0089\u0098-kûñD!¡y×"
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
                     l = new _f5();
                     f = new _f5();
                     x = new _f5();
                     O = new _f5();
                     v = new _f5();
                     r = new _f5[]{
                        x44.a<"l">(7065056141502767684L, var9),
                        x44.a<"l">(7232032768449472935L, var9),
                        x44.a<"l">(7126102133961081619L, var9),
                        x44.a<"l">(6921150750280434592L, var9),
                        x44.a<"l">(7393108426432528075L, var9)
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

                  var5 = "\u0085DýýVç§«PnI\u0000¾\u009aÃÿ}.DIîÑE\u0082\u0018þ5ã\u000e\u0097\u0018Ç\u009a?]Ó\u0005F\u0000\u0004IàÒý-\u00ad¾\u0091û";
                  var7 = "\u0085DýýVç§«PnI\u0000¾\u009aÃÿ}.DIîÑE\u0082\u0018þ5ã\u000e\u0097\u0018Ç\u009a?]Ó\u0005F\u0000\u0004IàÒý-\u00ad¾\u0091û".length();
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
