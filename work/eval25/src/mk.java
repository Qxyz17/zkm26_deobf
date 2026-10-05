package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mk extends xl {
   private w5 O;
   int F;
   byte[] X;
   private static final String a;

   protected void T(long var1, DataOutputStream var3) {
      var3.write(x44.a<"k">(this, -2430417806457478867L, var1));
   }

   protected boolean P(Object[] var1) {
      return false;
   }

   int o(long var1) {
      return x44.a<"n">(this, 1205019620597043817L, var1);
   }

   public String N(long var1) {
      return this.getClass().getName() + a + x44.a<"i">(this, -4483589612146048509L, var1);
   }

   public w5 m(long var1) {
      return x44.a<"m">(this, -1014611504576695761L, var1);
   }

   static {
      long var0 = ess.a(148920808245144145L, 926637274308828811L, MethodHandles.lookup().lookupClass()).a(237033237767033L) ^ 61852116500075L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0016ûÔçLYh¬".getBytes("ISO-8859-1"));
      String var5 = b(var4).intern();
      byte var10001 = -1;
      a = var5;
   }

   private static String b(byte[] var0) {
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
