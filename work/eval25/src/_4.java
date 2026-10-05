package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _4 {
   public static final _4 b;
   public static final _4 c;
   public static final _4 h;
   private static final _4[] l;
   public static final _4 W;
   public static final _4 M;
   private static final long a = ess.a(9087200722191866746L, 4310186281210981553L, MethodHandles.lookup().lookupClass()).a(235123437668402L);

   static {
      long var9 = a ^ 94492656421527L;
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
      String var5 = "â£\u0011\u0087TR2{\u001d$1ú7ý£<ÐlÏEÝ\r\u0082\n+w\u001e\u0011\\ñ\u001d\\\u0018\u000b\u0015\u0001\u0097?óÖ÷t@\u0085:B\u008e\u0099M\u0016í¨[ý1\u0019¯\u0018\u0087¦\u0019ìS\u0097hSvØùcûl<y\u008d»tNË \u008ai";
      int var7 = "â£\u0011\u0087TR2{\u001d$1ú7ý£<ÐlÏEÝ\r\u0082\n+w\u001e\u0011\\ñ\u001d\\\u0018\u000b\u0015\u0001\u0097?óÖ÷t@\u0085:B\u008e\u0099M\u0016í¨[ý1\u0019¯\u0018\u0087¦\u0019ìS\u0097hSvØùcûl<y\u008d»tNË \u008ai"
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
                     M = new _4();
                     h = new _4();
                     b = new _4();
                     W = new _4();
                     c = new _4();
                     l = new _4[]{
                        x44.a<"h">(3485701744803360749L, var9),
                        x44.a<"h">(3301442777605615238L, var9),
                        x44.a<"h">(3126680885987284307L, var9),
                        x44.a<"h">(3101038106206348866L, var9),
                        x44.a<"h">(3186732618531250933L, var9)
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

                  var5 = "â£\u0011\u0087TR2{\u001d$1ú7ý£<\u0094\u0002ä:C\u0011F¢\u0018\u0096%\u008d¬,\u008e½9s\u0098ë\u0089\u00857ù\u001a~u9=¶ã\u0018\u0090";
                  var7 = "â£\u0011\u0087TR2{\u001d$1ú7ý£<\u0094\u0002ä:C\u0011F¢\u0018\u0096%\u008d¬,\u008e½9s\u0098ë\u0089\u00857ù\u001a~u9=¶ã\u0018\u0090"
                     .length();
                  var4 = 24;
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
            var10001 = 0;
         }
      }
   }

   public static _4[] s(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (_4[])x44.a<"i">(-5600749947728200715L, var1).clone();
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
