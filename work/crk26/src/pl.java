package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class pl extends py {
   private static final long c = prr.a(-1461848386743336143L, -5598982734956162610L, MethodHandles.lookup().lookupClass()).a(260072760941399L);
   private static final String d;

   public pl(long var1, int var3) {
      var1 = c ^ var1;
      long var4 = var1 ^ 41364256309959L;
      super(var4, var3);
   }

   protected void O(Object[] var1) {
      long var6 = (Long)var1[0];
      lqq var4 = (lqq)var1[1];
      int var3 = (Integer)var1[2];
      int var2 = (Integer)var1[3];
      int var5 = (Integer)var1[4];
      long var8 = var6 ^ 80192226461257L;
      Object[] var10004 = new Object[]{null, var8};
      var10004[0] = 0;
      q1 var10 = (q1)m44.a<"u">(this, var10004, -2419197939025966992L, var6);
   }

   public String m(Object[] var1) {
      long var2 = (Long)var1[0];
      return d;
   }

   public void X(Object[] var1) {
      fu var3 = (fu)var1[0];
      long var4 = (Long)var1[1];
      lqq var2 = (lqq)var1[2];
      long var6 = var4 ^ 0L;
      super.X(new Object[]{var3, var6, var2});
   }

   q1 E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 110853511042301L;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = 0;
      return (q1)m44.a<"q">(this, var10004, 925881663182461636L, var2);
   }

   boolean D(Object[] var1) {
      return false;
   }

   boolean v(Object[] var1) {
      return false;
   }

   static {
      long var0 = c ^ 46104515721550L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¿6ÜSå®gª".getBytes("ISO-8859-1"));
      String var5 = c(var4).intern();
      byte var10001 = -1;
      d = var5;
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
