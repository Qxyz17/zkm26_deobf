package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bd extends b5 {
   private static final long b = prr.a(-4704447026613819946L, -4106000492509430068L, MethodHandles.lookup().lookupClass()).a(253580860057787L);
   private static final String d;

   public void S(Object[] var1) {
      int var6 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      int var2 = (Integer)var1[2];
      HashMap var5 = (HashMap)var1[3];
      long var7 = var3 ^ 97036547088182L;
      String var9 = this.O().V();
      Object[] var10007 = new Object[]{null, null, null, var2, var5, this};
      var10007[2] = var6;
      var10007[1] = var7;
      var10007[0] = var9;
      String var10 = m44.a<"m">(var10007, -7491983056205073157L, var3);

      try {
         if (!var9.equals(var10)) {
            this.O().A(var10);
         }
      } catch (n9 var11) {
         throw m44.a<"m">(var11, -9065968597966878795L, var3);
      }
   }

   public String R(Object[] var1) {
      long var2 = (Long)var1[0];
      return d;
   }

   bd(_4 var1, h1 var2, short var3, int var4, lkv var5, l6q var6, l6q var7, short var8) {
      long var9 = ((long)var3 << 48 | (long)var4 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ b;
      long var11 = var9 ^ 109131690069914L;
      super(var1, var2, var5, var6, var7, var11);
   }

   static {
      long var0 = b ^ 139223993360107L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("- \u00ad`\u00182O©zÎúüÄ\u0014Z\u0005Þ}Ó\u0085\u0085s(A".getBytes("ISO-8859-1"));
      String var5 = c(var4).intern();
      byte var10001 = -1;
      d = var5;
   }

   private static n9 d(n9 var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
