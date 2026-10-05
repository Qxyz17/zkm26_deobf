package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _r8 {
   public static final Set w;

   static {
      long var9 = ess.a(5708672845986058190L, -5501392069671070658L, MethodHandles.lookup().lookupClass()).a(280180574481655L) ^ 62698808778631L;
      long var11 = var9 ^ 81839095447485L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[59];
      int var6 = 0;
      String var5 = "¼&Í#¾ßX¡\b$¬/÷\u0015\u0080mÇ\b\b\u0092¬»¯f\u0081)\b\\Át \u008f\r{\u0096\bg\nhÉÏJ¿\u0092\b\u00adf\u0003È\u0007qü¿\b\u000b«~\u0094å\u0085Û[\br4°º,pºr\b=,Y\nÁ\u0095hØ\bI\u009dòØ+\bì\"\béÈH_±\u001f\u0019ø\u0010\u009dÛ!ÝÊ\u0093èwÄAÅ\u0017;Áîç\b\u0092ÝîhÈ\u0015¼Ü\b\bW\u0014\u008fcKå[\bGY\u007f¶íJ\u0010Ô\b\u0091\u0011Æ\u0090\u009f86\u0011\bv\u0090=\u008f;û²\t\bÁ\u009ffN%æò\u0098\bØP\u001dî,$\u0096õ\bnøÀóÉÑç\u009e\bqT ;¸\u0003ðö\bÜbùÚ¥\u001aØ5\b\u009aý\u008e\f 3¢æ\b=Ðå®\u0011%Õ¯\b\u0082ô\u0011åë-\u0088s\u0010¼\fÏÌA_\bbÏè\u0000\u000e§úÀí\b\u001f » ¯Ñ\\b\bdÔ\u0017@?ûÏó\u0010\u008a\u001ar¹\u0016\u0090í\u0016\u0097øp]Ûâ\u00979\u0010]|\u009d\u0017¸k59\u008f\u0084$J\u000fþió\bõ^ò\u0081\u001eÆ½¢\bÚ\u00069\u00ad7\\ò3\b'l.×ÍÎß'\bLyI£\u009e#~\u00ad\u0010Dh\u0018\u0092ú7_Wè3§ýä\u0086g\u0019\b\u0004½þ8»\u0011ÚÔ\b:\u0002\u0082Å {óW\b-ëQ!Ö\u0082\u009fU\b\u009d <\nÔc[a\u0010ó\u0091\u0003u\u000b\u00868\u0017i1\u0088\u0090y`U\u0005\bº\u0018\u0019eú\u0092@k\bâ\nÏM\u0094:óñ\b\u008aï±\u009aúZì¥\u0010Ù¤EÝÚïØ;Oüû5e\u009dÔf\bÞ{\u0095\u0083êÊå%\u0010ï©°f\u0019\u0001ÏoM¹\u0094eþyÆ\u001d\b9!ªÕ\u000f\u0007\u001eÎ\u00109doì¢?¬À\u007fOÔ Ô¢\u00ad#\u0010©û\u009fÈþ\nj3×\u00adc\u0003bô\u0090ß\bû=\"(\u009a)¨d\b*&Æ¼éq;\u008f\b«N\u0080\u008a¢<y%\b\u0002Ú¤°\u0002Í9\u0091\u0010g/Î\n<\u009f\brÍ}g9\u0085ò\u0011â\b\u0085\u0019V\u009d\u0005\u0019_\u007f\bÙmxêM]b\u008a\blCSú5ç\u0095l";
      int var7 = "¼&Í#¾ßX¡\b$¬/÷\u0015\u0080mÇ\b\b\u0092¬»¯f\u0081)\b\\Át \u008f\r{\u0096\bg\nhÉÏJ¿\u0092\b\u00adf\u0003È\u0007qü¿\b\u000b«~\u0094å\u0085Û[\br4°º,pºr\b=,Y\nÁ\u0095hØ\bI\u009dòØ+\bì\"\béÈH_±\u001f\u0019ø\u0010\u009dÛ!ÝÊ\u0093èwÄAÅ\u0017;Áîç\b\u0092ÝîhÈ\u0015¼Ü\b\bW\u0014\u008fcKå[\bGY\u007f¶íJ\u0010Ô\b\u0091\u0011Æ\u0090\u009f86\u0011\bv\u0090=\u008f;û²\t\bÁ\u009ffN%æò\u0098\bØP\u001dî,$\u0096õ\bnøÀóÉÑç\u009e\bqT ;¸\u0003ðö\bÜbùÚ¥\u001aØ5\b\u009aý\u008e\f 3¢æ\b=Ðå®\u0011%Õ¯\b\u0082ô\u0011åë-\u0088s\u0010¼\fÏÌA_\bbÏè\u0000\u000e§úÀí\b\u001f » ¯Ñ\\b\bdÔ\u0017@?ûÏó\u0010\u008a\u001ar¹\u0016\u0090í\u0016\u0097øp]Ûâ\u00979\u0010]|\u009d\u0017¸k59\u008f\u0084$J\u000fþió\bõ^ò\u0081\u001eÆ½¢\bÚ\u00069\u00ad7\\ò3\b'l.×ÍÎß'\bLyI£\u009e#~\u00ad\u0010Dh\u0018\u0092ú7_Wè3§ýä\u0086g\u0019\b\u0004½þ8»\u0011ÚÔ\b:\u0002\u0082Å {óW\b-ëQ!Ö\u0082\u009fU\b\u009d <\nÔc[a\u0010ó\u0091\u0003u\u000b\u00868\u0017i1\u0088\u0090y`U\u0005\bº\u0018\u0019eú\u0092@k\bâ\nÏM\u0094:óñ\b\u008aï±\u009aúZì¥\u0010Ù¤EÝÚïØ;Oüû5e\u009dÔf\bÞ{\u0095\u0083êÊå%\u0010ï©°f\u0019\u0001ÏoM¹\u0094eþyÆ\u001d\b9!ªÕ\u000f\u0007\u001eÎ\u00109doì¢?¬À\u007fOÔ Ô¢\u00ad#\u0010©û\u009fÈþ\nj3×\u00adc\u0003bô\u0090ß\bû=\"(\u009a)¨d\b*&Æ¼éq;\u008f\b«N\u0080\u008a¢<y%\b\u0002Ú¤°\u0002Í9\u0091\u0010g/Î\n<\u009f\brÍ}g9\u0085ò\u0011â\b\u0085\u0019V\u009d\u0005\u0019_\u007f\bÙmxêM]b\u008a\blCSú5ç\u0095l"
         .length();
      char var4 = '\b';
      int var14 = -1;

      label28:
      while (true) {
         String var15 = var5.substring(++var14, var14 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var21;
                  if ((var14 += var4) >= var7) {
                     w = x44.a<"t">(new Object[]{var11}, -19817945400969611L, var9);
                     x44.a<"m">(-510467722034277625L, var9).add("_");
                     x44.a<"m">(-510467722034277625L, var9).add(var0[25]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[4]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[41]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[56]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[37]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[6]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[5]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[32]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[24]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[36]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[53]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[20]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[22]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[15]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[16]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[2]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[19]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[0]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[8]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[35]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[49]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[38]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[40]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[18]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[45]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[12]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[43]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[51]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[11]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[42]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[26]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[3]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[54]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[34]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[14]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[57]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[58]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[50]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[29]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[23]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[44]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[13]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[9]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[21]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[28]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[52]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[55]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[48]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[46]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[30]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[1]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[47]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[31]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[27]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[17]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[7]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[39]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[33]);
                     x44.a<"m">(-510467722034277625L, var9).add(var0[10]);
                     return;
                  }

                  var4 = var5.charAt(var14);
                  break;
               default:
                  var0[var6++] = var21;
                  if ((var14 += var4) < var7) {
                     var4 = var5.charAt(var14);
                     continue label28;
                  }

                  var5 = "{4\fü\rÎ´0\bÝWl±¡\u0006~\u0089";
                  var7 = "{4\fü\rÎ´0\bÝWl±¡\u0006~\u0089".length();
                  var4 = '\b';
                  var14 = -1;
            }

            var15 = var5.substring(++var14, var14 + var4);
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
