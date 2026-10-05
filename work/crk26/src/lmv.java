package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lmv extends lmc {
   final mu l;
   private static final long a = prr.a(8727972006960972479L, 7495556810076268714L, MethodHandles.lookup().lookupClass()).a(171714215809214L);
   private static final String b;

   public void h(Object[] var1) {
      long var3 = (Long)var1[0];
      Object var2 = var1[1];
      long var5 = var3 ^ 102946743455916L;
      m44.a<"u">(this, new Object[]{(Integer)var2, var5}, 4598501404237930889L, var3);
   }

   public void x(Object[] var1) {
      Integer var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 138713038353216L;
      long var7 = var3 ^ 128359353494428L;
      mu var10000 = m44.a<"p">(this, 4008383189778824839L, var3);
      mu var10001 = m44.a<"p">(this, 4008383189778824839L, var3);
      String var10003 = b;
      m44.a<"n">(
         new Object[]{
            var10000,
            var7,
            m44.a<"q">(
               var10001,
               new Object[]{var5, var10003, m44.a<"p">(m44.a<"p">(this, 4008383189778824839L, var3), 3156241352896997193L, var3)},
               3246760739486843106L,
               var3
            )
         },
         3547014218487364028L,
         var3
      );
   }

   public void r(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 40661218417077L;
      m44.a<"w">(m44.a<"v">(this, 6302441407617277521L, var2), new Object[]{var4}, 5340913355038057039L, var2);
   }

   lmv(mu var1) {
      this.l = var1;
   }

   static {
      long var0 = a ^ 46416815581512L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("U\u0014ØRCzÍ\u0092A»ý\u0002í\u0000w\u001b".getBytes("ISO-8859-1"));
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
