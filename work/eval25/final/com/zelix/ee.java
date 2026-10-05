package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ee {
   public static final String u;
   public static final String R;
   public static final String f;

   static {
      long var9 = ess.a(-1769987302694021170L, -6726844879160177412L, MethodHandles.lookup().lookupClass()).a(69897909060058L) ^ 96887869723324L;
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
      String var5 = "ß\u001c?]\u0094[<¶\u0085÷´¼×\u000b\u009d\n\bâVb5\u0005ÊFd\u0090K<ß¿ÇK±ñ\u009bÙC#\u009b\u0001$ô\u0098\u0082\u008eÈì½\u009an}îæ\u0014kùnZô\u0081¿\u009dD\u0001J\u000bîòÐ|³\u0096ü\u0088±f\u0086Uì÷/)»&\u0015Ï«\u007fú)º\u009e\u0089©/\u0099ù`Ä\u000eO\u009fÏgú¾ËM\u0001<se/þ\u0006e¿÷!ÂÏM)V\u000eI\u0001\u001f=)òuÈ\u001cH*-u3û>.pÆ\t¤þ1f=B$\u0002.FP¥\u001böG@4é¤Ð(0\u0018\u001cÅ";
      int var7 = "ß\u001c?]\u0094[<¶\u0085÷´¼×\u000b\u009d\n\bâVb5\u0005ÊFd\u0090K<ß¿ÇK±ñ\u009bÙC#\u009b\u0001$ô\u0098\u0082\u008eÈì½\u009an}îæ\u0014kùnZô\u0081¿\u009dD\u0001J\u000bîòÐ|³\u0096ü\u0088±f\u0086Uì÷/)»&\u0015Ï«\u007fú)º\u009e\u0089©/\u0099ù`Ä\u000eO\u009fÏgú¾ËM\u0001<se/þ\u0006e¿÷!ÂÏM)V\u000eI\u0001\u001f=)òuÈ\u001cH*-u3û>.pÆ\t¤þ1f=B$\u0002.FP¥\u001böG@4é¤Ð(0\u0018\u001cÅ"
         .length();
      char var4 = 16;
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
                     u = x44.a<"q">(var0[0], "\n", 6483968307351480019L, var9);
                     R = x44.a<"q">(var0[4], 5179413930912270576L, var9);
                     f = var0[2] + x44.a<"q">(var0[3], 5179413930912270576L, var9) + var0[1];
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

                  var5 = "\u0099\u009bþ\u009a\u0010ê7ÿ£ª\u0095\u0013\u0090ó\u009bè\u0010\u009aÿÌa\u009a\u0007²½\u0007ñ\t\u000bÉÖW¸";
                  var7 = "\u0099\u009bþ\u009a\u0010ê7ÿ£ª\u0095\u0013\u0090ó\u009bè\u0010\u009aÿÌa\u009a\u0007²½\u0007ñ\t\u000bÉÖW¸".length();
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
