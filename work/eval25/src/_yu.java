package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface _yu {
   String[] L;

   static {
      long var9 = ess.a(-1531923904190489523L, 8748800343420097348L, MethodHandles.lookup().lookupClass()).a(141759589935207L) ^ 59705844394767L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[21];
      int var6 = 0;
      String var5 = "É·Â\u0088=\u00878åû¤]Àä(\u0011\b\u00adR¢j\bÀÄ\u008e\fâ¦^Ö£lè \u0099\u0089µ¡\u008d\u000e(ÓÏ]¢\u0081°ÍÃ\u0080ö;Ø§\u001bèAó: \u0005>R\r\u008fÃ\b\"Í\u0011¹Ôá\u0003ë v\u001e;Ñ\u0086ÆO\u0099ÌyÆª\u008dD*ÞòÒr÷g{Ló\b\u0002ù{¾\u0080\u00111 ~ßsÿ\u0094\u0098H#±þî\fP\u0005\u0011xI=¡Pnt\u0012\u008d\u0011Ön\u0086óÁÞ\u0005\u0018ÑÊ}Î]øè\u000b \u0084rLgl®wì*\u0015\u008bß¤±\u009c\u0018\u0099\u0089µ¡\u008d\u000e(Ó[Ú¦ù*h-\u008b¸¾Ó¥ý¶Fû\u0010Êuæ\u001c\u00adD¼f\t~\u0084tÉ\u001aI\u0099\u0018É·Â\u0088=\u00878åû¤]Àä(\u0011\bp¤]y¥4hp \u0099\u0089µ¡\u008d\u000e(ÓÏ]¢\u0081°ÍÃ\u0080¸n#\u0097¬öãÿ\u009f_»H¾ß]( ~ßsÿ\u0094\u0098H#±þî\fP\u0005\u0011x¶%O«ôüyÅÚ\u001fMV©¶u!\u0018\u0099\u0089µ¡\u008d\u000e(ÓvÉJå\u0088\u009e\n\u0017g\u0003¥«VûÃ\u0091\u0010\u0099\u0089µ¡\u008d\u000e(Ó¿\u001b¨.C¹\f£ v\u001e;Ñ\u0086ÆO\u0099ÌyÆª\u008dD*Þ\u0080-¹1ÌNÁ\u001c®vÍf3\u0092Pz\u0010%Mc\b\u00900O\u0000yK\u0012\u00008Uõ²\u0010,°M\u008aUH^An3\u008a\bÔ\u0086sT\u00181ä\u0083\\M\n?bÊßÆ\u008db[ä\u001aEB\b?)\u0087o!\u0010ö\u000b\\\u0017¥\u000e;á]B$\u0087ªRÖ\r 1ä\u0083\\M\n?bÊßÆ\u008db[ä\u001aP*É²\u0019|¦u\u0090\u0092!C\u0098\u0097SÏ";
      int var7 = "É·Â\u0088=\u00878åû¤]Àä(\u0011\b\u00adR¢j\bÀÄ\u008e\fâ¦^Ö£lè \u0099\u0089µ¡\u008d\u000e(ÓÏ]¢\u0081°ÍÃ\u0080ö;Ø§\u001bèAó: \u0005>R\r\u008fÃ\b\"Í\u0011¹Ôá\u0003ë v\u001e;Ñ\u0086ÆO\u0099ÌyÆª\u008dD*ÞòÒr÷g{Ló\b\u0002ù{¾\u0080\u00111 ~ßsÿ\u0094\u0098H#±þî\fP\u0005\u0011xI=¡Pnt\u0012\u008d\u0011Ön\u0086óÁÞ\u0005\u0018ÑÊ}Î]øè\u000b \u0084rLgl®wì*\u0015\u008bß¤±\u009c\u0018\u0099\u0089µ¡\u008d\u000e(Ó[Ú¦ù*h-\u008b¸¾Ó¥ý¶Fû\u0010Êuæ\u001c\u00adD¼f\t~\u0084tÉ\u001aI\u0099\u0018É·Â\u0088=\u00878åû¤]Àä(\u0011\bp¤]y¥4hp \u0099\u0089µ¡\u008d\u000e(ÓÏ]¢\u0081°ÍÃ\u0080¸n#\u0097¬öãÿ\u009f_»H¾ß]( ~ßsÿ\u0094\u0098H#±þî\fP\u0005\u0011x¶%O«ôüyÅÚ\u001fMV©¶u!\u0018\u0099\u0089µ¡\u008d\u000e(ÓvÉJå\u0088\u009e\n\u0017g\u0003¥«VûÃ\u0091\u0010\u0099\u0089µ¡\u008d\u000e(Ó¿\u001b¨.C¹\f£ v\u001e;Ñ\u0086ÆO\u0099ÌyÆª\u008dD*Þ\u0080-¹1ÌNÁ\u001c®vÍf3\u0092Pz\u0010%Mc\b\u00900O\u0000yK\u0012\u00008Uõ²\u0010,°M\u008aUH^An3\u008a\bÔ\u0086sT\u00181ä\u0083\\M\n?bÊßÆ\u008db[ä\u001aEB\b?)\u0087o!\u0010ö\u000b\\\u0017¥\u000e;á]B$\u0087ªRÖ\r 1ä\u0083\\M\n?bÊßÆ\u008db[ä\u001aP*É²\u0019|¦u\u0090\u0092!C\u0098\u0097SÏ"
         .length();
      char var4 = ' ';
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
                     L = new String[]{
                        var0[19],
                        var0[5],
                        var0[13],
                        var0[3],
                        var0[14],
                        var0[15],
                        var0[2],
                        var0[20],
                        var0[17],
                        var0[8],
                        var0[0],
                        var0[11],
                        var0[6],
                        var0[16],
                        var0[18],
                        var0[9],
                        var0[1],
                        var0[7],
                        var0[10],
                        var0[4],
                        var0[12]
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

                  var5 = "æ<4ø]Í²£®Pm\u0080\u001b\u0017Ñù\bïµºû´#Ð7";
                  var7 = "æ<4ø]Í²£®Pm\u0080\u001b\u0017Ñù\bïµºû´#Ð7".length();
                  var4 = 16;
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
