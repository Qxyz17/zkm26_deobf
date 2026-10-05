package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum r1 {
   private static final r1[] y;
   public static final r1 l;
   public static final r1 e;
   public static final r1 A;
   private static final long a = ess.a(8657972449661869814L, -897309998666785678L, MethodHandles.lookup().lookupClass()).a(21327640922776L);

   public static r1[] m(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (r1[])x44.a<"h">(-34187386450355692L, var1).clone();
   }

   static {
      long var9 = a ^ 110305976104358L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[3];
      int var6 = 0;
      String var5 = "'\u0083¶\u000fh÷?'¦\u0092\u0097àn\u0095\f2\bU/8agÙ*?\b£n\\°\nN^\t";
      int var7 = "'\u0083¶\u000fh÷?'¦\u0092\u0097àn\u0095\f2\bU/8agÙ*?\b£n\\°\nN^\t".length();
      char var4 = 16;
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var13 = a(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var13;
         if ((var3 += var4) >= var7) {
            e = new r1();
            A = new r1();
            l = new r1();
            y = new r1[]{x44.a<"o">(-936846162282074509L, var9), x44.a<"o">(-604656308983505260L, var9), x44.a<"o">(-680605330376369975L, var9)};
            return;
         }

         var4 = var5.charAt(var3);
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
