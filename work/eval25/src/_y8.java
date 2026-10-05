package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _y8 {
   protected static final String[] W;
   private static int T;

   public static int M() {
      return T;
   }

   public static void X(int var0) {
      T = var0;
   }

   public static int I() {
      int var0 = M();
      return var0 == 0 ? 74 : 0;
   }

   static {
      long var9 = ess.a(-7306771574401491803L, 1245341329277657291L, MethodHandles.lookup().lookupClass()).a(210261635588751L) ^ 69132922705707L;
      if (x44.a<"v">(-8121244715369901050L, var9) != 0) {
         x44.a<"v">(51, -8567235760453275268L, var9);
      }

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
      String var5 = "á\u0096\u001e\"6\u000fe\u0003Mj\u0016[3pT¾8¬±ùº\u0007-\u0090¦P0ââät¦p Û/\u0000\u0098Ð°³Ö\u0002J2²£î\u000f\u00ad\u0019$\u0082HúÝTk+\u008b9\u0081*lnèIHDJ¸_p\u0010Ð0\u00ad?Ôn¾dÍ\u0006\u009eï×\u0004Ð=";
      int var7 = "á\u0096\u001e\"6\u000fe\u0003Mj\u0016[3pT¾8¬±ùº\u0007-\u0090¦P0ââät¦p Û/\u0000\u0098Ð°³Ö\u0002J2²£î\u000f\u00ad\u0019$\u0082HúÝTk+\u008b9\u0081*lnèIHDJ¸_p\u0010Ð0\u00ad?Ôn¾dÍ\u0006\u009eï×\u0004Ð="
         .length();
      char var4 = 16;
      int var12 = -1;

      label32:
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
                     W = new String[]{var0[2], var0[0], var0[1], var0[3], var0[4]};
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label32;
                  }

                  var5 = "Pkï± ¾rG+ÅZ\u00ad$l;V§\u0089VÓ\u0006{ó\u0098\u0018\u0099®K&\u0090\f;ÃáÆV\u0017\u0097SF\u008dE\u0012\u0002ý9\u0003Mó";
                  var7 = "Pkï± ¾rG+ÅZ\u00ad$l;V§\u0089VÓ\u0006{ó\u0098\u0018\u0099®K&\u0090\f;ÃáÆV\u0017\u0097SF\u008dE\u0012\u0002ý9\u0003Mó".length();
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
