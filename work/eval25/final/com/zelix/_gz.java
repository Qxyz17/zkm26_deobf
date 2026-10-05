package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _gz extends _nj {
   private static final long a = ess.a(-3918275443103716131L, -5659386841521287984L, MethodHandles.lookup().lookupClass()).a(146943791519292L);
   private static final String d;

   boolean J(Object[] var1) {
      return false;
   }

   public void K(Object[] var1) {
      long var3 = (Long)var1[0];
      az var5 = (az)var1[1];
      _uu var2 = (_uu)var1[2];
      long var6 = var3 ^ 0L;
      super.K(new Object[]{var6, var5, var2});
   }

   public _gz(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 54715692199353L;
      super(var4, var1);
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return d;
   }

   protected void G(Object[] var1) {
      _uu var5 = (_uu)var1[0];
      int var7 = (Integer)var1[1];
      long var3 = (Long)var1[2];
      int var6 = (Integer)var1[3];
      int var2 = (Integer)var1[4];
      long var8 = var3 ^ 98840750245944L;
      Object[] var10004 = new Object[]{null, var8};
      var10004[0] = 0;
      _q4 var10 = (_q4)x44.a<"m">(this, var10004, 899743315497312719L, var3);
   }

   boolean Y(Object[] var1) {
      return false;
   }

   _q4 s(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 26684984755935L;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = 0;
      return (_q4)x44.a<"j">(this, var10004, 4799647975590113064L, var2);
   }

   static {
      long var0 = a ^ 116168743230138L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Jè=[¸\u0006\u001f)".getBytes("ISO-8859-1"));
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
