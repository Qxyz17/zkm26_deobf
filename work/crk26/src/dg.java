package com.zelix;

import java.lang.invoke.MethodHandles;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class dg implements HyperlinkListener {
   final r9 x;
   private static final long a = prr.a(-8132951831683983595L, -5918730886316216090L, MethodHandles.lookup().lookupClass()).a(277959640069446L);
   private static final String b;

   dg(r9 var1) {
      this.x = var1;
   }

   @Override
   public void hyperlinkUpdate(HyperlinkEvent var1) {
      long var2 = a ^ 40247179476805L;
      if (m44.a<"u">(var1, 9030488517920925220L, var2) == m44.a<"n">(9079096830758879358L, var2)) {
         URL var4 = null;

         try {
            var4 = m44.a<"u">(var1, 7041853345806137334L, var2);
            m44.a<"u">(m44.a<"t">(m44.a<"t">(this, 9131614411205839907L, var2), 8690719673162319385L, var2), var4, 7143398007400432240L, var2);
         } catch (Throwable var6) {
            m44.a<"u">(
               m44.a<"t">(m44.a<"t">(this, 9131614411205839907L, var2), 8690719673162319385L, var2),
               m44.a<"u">(var6, 8655162497421470416L, var2) + b + var4,
               7186743711507404759L,
               var2
            );
         }
      }
   }

   static {
      long var0 = a ^ 56080418876713L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("e½\u0081\u001c4ÂðJ".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      byte var10001 = -1;
      b = var5;
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
