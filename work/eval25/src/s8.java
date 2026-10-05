package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class s8 {
   private final te M;
   private r6[] c;
   private final ArrayList H;
   private int X;
   private static final long a = ess.a(-5466615420322357396L, -5314004974415973875L, MethodHandles.lookup().lookupClass()).a(37313754377252L);
   private static final String b;

   void B(Object[] var1) {
      r6[] var4 = (r6[])var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      x44.a<"v">(this, var4, -1365810667700599684L, var2);
   }

   int m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var10002 = x44.a<"h">(this, 3586580949651604144L, var2);
      x44.a<"w">(this, var10002 + 1, 3586580949651604144L, var2);
      return var10002;
   }

   int f(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"l">(this, 340716858238564300L, var2);
   }

   ArrayList W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -2760873891189589709L, var2);
   }

   te D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, 8209739947936591587L, var2);
   }

   s8(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 31014343882631L;
      super();
      this.H = new ArrayList(var3);
      x44.a<"r">(this, new r6[0], 7079583632901196616L, var1);
      this.M = new te(var4, true, b, 5);
   }

   r6[] Y(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var3 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      return x44.a<"k">(this, 7395334955389800406L, var5);
   }

   static {
      long var0 = a ^ 132733548188246L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("©È\u0092ðP\u0005S\u009b".getBytes("ISO-8859-1"));
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
