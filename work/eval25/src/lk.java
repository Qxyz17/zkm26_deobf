package com.zelix;

import java.lang.invoke.MethodHandles;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class lk implements HyperlinkListener {
   final s6 J;
   private static final long a = ess.a(1128836416126116959L, 1734974730541111843L, MethodHandles.lookup().lookupClass()).a(279885601592561L);
   private static final String b;

   lk(s6 var1) {
      this.J = var1;
   }

   @Override
   public void hyperlinkUpdate(HyperlinkEvent var1) {
      long var2 = a ^ 32314142882280L;
      if (x44.a<"i">(var1, 8432378304098168400L, var2) == x44.a<"h">(7843527802841264473L, var2)) {
         URL var4 = null;

         try {
            var4 = x44.a<"i">(var1, 7874097139945464157L, var2);
            x44.a<"i">(x44.a<"m">(x44.a<"m">(this, 7802086071470126193L, var2), 7645709393379925095L, var2), var4, 8060177235701205895L, var2);
         } catch (Throwable var6) {
            x44.a<"i">(
               x44.a<"m">(x44.a<"m">(this, 7802086071470126193L, var2), 7645709393379925095L, var2),
               x44.a<"i">(var6, 7581772056758423126L, var2) + b + var4,
               8610266075503105392L,
               var2
            );
         }
      }
   }

   static {
      long var0 = a ^ 85488797388280L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u009aë±B8wnô".getBytes("ISO-8859-1"));
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
