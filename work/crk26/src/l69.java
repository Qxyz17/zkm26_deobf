package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface l69 {
   String[] U;

   static {
      long var9 = prr.a(3352095135454999883L, -86229636157354473L, MethodHandles.lookup().lookupClass()).a(9466139360187L) ^ 92882614556643L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[31];
      int var6 = 0;
      String var5 = "Ð-¶\u009f\u0095/\u0081Ü\u0010¿zj\u008a?Þ\u009c\u0085s\u0001\u0010Ï\u0090\u0080+-\bDýw¶a¥\u0084\r\b[èÔ q\u008b\u0085¶\bF\u0097\u0006Õ§Ò\u0016ë\u0018ckuÉ\u000e\u0002^ÁÝZÁ\u0082Öfë]/É\u008aã3\u0012\\Û\u0018ÝARByJþ\u0095k'¦>ùñf$7äJ¯ò\u008b\u0087W\u0018ckuÉ\u000e\u0002^Á§\nG\tû\u0086N\u0085ÑÏÕ\u001bº\u0094>\u0097\b¸|B}+æÞ\u0013\bTYEj\u0090ÓãL\b\u000b\u00ad%Lß\u001dx¡\b\u00930¶\u00891dL\u0094\b'ÙÚþõ\u007fS0\u0018l)å^cú.\u001dèw\u000e@\u0005Ì\f\u0085-W9k\u0012WxI\bÚÓØ\u0001\u0094ýÉ#\b\u008bãMâÿ\u0083jJ\u0010d\u0088N\u000bÚ*¤ÌÐÍÆ\u008ayD!Ñ\bì^û\u0080\u008eL\u0088J\bÜ\u008awÑNMGÆ\u0010¤>eæÊ\u000e=\u000bh\u001a½ÂÀ\u00912ò\bRQ09.¶6\u0089\bs.q¿àä ¸\bl\u0091\u0000oª_So\u0018ckuÉ\u000e\u0002^Á¿\u001fÏ\u0097ÿòÀ\u0098&iT1_\u0001\nÒ\bÇ\u0007s\u009dtn#ï\b\u008bãMâÿ\u0083jJ\bFuélç·\u0017M\bévæ¹\u0014Iu5\b\u00930¶\u00891dL\u0094";
      int var7 = "Ð-¶\u009f\u0095/\u0081Ü\u0010¿zj\u008a?Þ\u009c\u0085s\u0001\u0010Ï\u0090\u0080+-\bDýw¶a¥\u0084\r\b[èÔ q\u008b\u0085¶\bF\u0097\u0006Õ§Ò\u0016ë\u0018ckuÉ\u000e\u0002^ÁÝZÁ\u0082Öfë]/É\u008aã3\u0012\\Û\u0018ÝARByJþ\u0095k'¦>ùñf$7äJ¯ò\u008b\u0087W\u0018ckuÉ\u000e\u0002^Á§\nG\tû\u0086N\u0085ÑÏÕ\u001bº\u0094>\u0097\b¸|B}+æÞ\u0013\bTYEj\u0090ÓãL\b\u000b\u00ad%Lß\u001dx¡\b\u00930¶\u00891dL\u0094\b'ÙÚþõ\u007fS0\u0018l)å^cú.\u001dèw\u000e@\u0005Ì\f\u0085-W9k\u0012WxI\bÚÓØ\u0001\u0094ýÉ#\b\u008bãMâÿ\u0083jJ\u0010d\u0088N\u000bÚ*¤ÌÐÍÆ\u008ayD!Ñ\bì^û\u0080\u008eL\u0088J\bÜ\u008awÑNMGÆ\u0010¤>eæÊ\u000e=\u000bh\u001a½ÂÀ\u00912ò\bRQ09.¶6\u0089\bs.q¿àä ¸\bl\u0091\u0000oª_So\u0018ckuÉ\u000e\u0002^Á¿\u001fÏ\u0097ÿòÀ\u0098&iT1_\u0001\nÒ\bÇ\u0007s\u009dtn#ï\b\u008bãMâÿ\u0083jJ\bFuélç·\u0017M\bévæ¹\u0014Iu5\b\u00930¶\u00891dL\u0094"
         .length();
      char var4 = '\b';
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     U = new String[]{
                        var0[9],
                        var0[12],
                        var0[14],
                        var0[0],
                        var0[30],
                        var0[23],
                        var0[8],
                        var0[6],
                        var0[25],
                        var0[15],
                        var0[7],
                        var0[19],
                        var0[4],
                        var0[27],
                        var0[22],
                        var0[24],
                        var0[18],
                        var0[20],
                        var0[21],
                        var0[3],
                        var0[2],
                        var0[10],
                        var0[26],
                        var0[1],
                        var0[29],
                        var0[16],
                        var0[11],
                        var0[28],
                        var0[5],
                        var0[13],
                        var0[17]
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

                  var5 = "\u0093-ºÄ¾\u0010]¿ÖòÀdèfX\u0014\bX©I9\u008cðeS";
                  var7 = "\u0093-ºÄ¾\u0010]¿ÖòÀdèfX\u0014\bX©I9\u008cðeS".length();
                  var4 = 16;
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
            var10001 = 0;
         }
      }
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
