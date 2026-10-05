package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dn {
   public static final String T;
   public static final String N;
   public static final String z;

   static {
      long var9 = prr.a(-1563607902825594063L, -3501216681788774446L, MethodHandles.lookup().lookupClass()).a(100127215848846L) ^ 20861629723578L;
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
      String var5 = "é\u001a9²ÈVÄ\u0018,\u009e(íÕÀ\u001aö\u001b\u00ad7Þêc.à\u0081Ü\u0092·Þ\u0016 zJ^\u0006>\u0094\u001e¡Ã¯Â\u0089\u0004ZÕ4\u0084\u0010\u001e\u00122\u0089\u009ajBuåæøÖ\u0007\u0085ÎSC\t/Ó¿3ôø+è«xrUý\u007fyº»\u008b°\u0086\u0007\u000b\u008ct\u0084¥õ\u009b)4\u0011Èb~%×Kì\u0013\u0084\u0015\u009c\u0093|\u0090\u0094Z1.5\u009f\u0081¸&~4õvUKÖú\u0014A\u0082\u0004Þ+Î\u008a\u0083F\u0086æÆþ\u001f\u0010æ¡¨3¢Ó)ó/z³\u0003\u0011sÌª\u0010=oÉ\u0089F£Ò\u001d\tµ\u000eC½%4X";
      int var7 = "é\u001a9²ÈVÄ\u0018,\u009e(íÕÀ\u001aö\u001b\u00ad7Þêc.à\u0081Ü\u0092·Þ\u0016 zJ^\u0006>\u0094\u001e¡Ã¯Â\u0089\u0004ZÕ4\u0084\u0010\u001e\u00122\u0089\u009ajBuåæøÖ\u0007\u0085ÎSC\t/Ó¿3ôø+è«xrUý\u007fyº»\u008b°\u0086\u0007\u000b\u008ct\u0084¥õ\u009b)4\u0011Èb~%×Kì\u0013\u0084\u0015\u009c\u0093|\u0090\u0094Z1.5\u009f\u0081¸&~4õvUKÖú\u0014A\u0082\u0004Þ+Î\u008a\u0083F\u0086æÆþ\u001f\u0010æ¡¨3¢Ó)ó/z³\u0003\u0011sÌª\u0010=oÉ\u0089F£Ò\u001d\tµ\u000eC½%4X"
         .length();
      char var4 = 144;
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
                     N = m44.a<"o">(var0[3], "\n", -1260818154575360612L, var9);
                     T = m44.a<"o">(var0[1], -1500116291286171503L, var9);
                     z = var0[0] + m44.a<"o">(var0[2], -1500116291286171503L, var9) + var0[4];
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

                  var5 = "9'\u000b2\u001a\u0084|\u000e$ä¿C\u0001v¢\u0091\b§ òÑ\u009c\u009e\u0085B";
                  var7 = "9'\u000b2\u001a\u0084|\u000e$ä¿C\u0001v¢\u0091\b§ òÑ\u009c\u009e\u0085B".length();
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
