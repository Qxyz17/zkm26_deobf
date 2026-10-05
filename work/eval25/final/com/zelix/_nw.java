package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _nw extends _n7 {
   private static final long a = ess.a(-5207143677097186848L, 1646582644787214384L, MethodHandles.lookup().lookupClass()).a(58738036093538L);
   private static final String b;

   protected void G(Object[] var1) {
      _uu var4 = (_uu)var1[0];
      int var7 = (Integer)var1[1];
      long var5 = (Long)var1[2];
      int var2 = (Integer)var1[3];
      int var3 = (Integer)var1[4];
      long var8 = var5 ^ 120310072279596L;
      long var10001 = var5 ^ 130933086017220L;
      int var10 = (int)((var5 ^ 130933086017220L) >>> 32);
      int var11 = (int)((var5 ^ 130933086017220L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var5 ^ 98840750245944L;
      Object[] var10005 = new Object[]{null, var13};
      var10005[0] = 0;
      String var10002 = x44.a<"m">((_xo)x44.a<"m">(this, var10005, 899743315497312719L, var5), new Object[]{var8}, 1671863393502507731L, var5);
      Object[] var10006 = new Object[]{null, null, null, var12};
      var10006[2] = var11;
      var10006[1] = var10002;
      var10006[0] = var10;
      x44.a<"m">(var4, var10006, 1582462544548049382L, var5);
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b;
   }

   public _nw(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 95251629536728L;
      super(var4, var1);
   }

   static {
      long var0 = a ^ 91906069965908L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("øØ\u0001·\u0019>\u000bQò`\u0006\r}\u001a\u0089\u007f".getBytes("ISO-8859-1"));
      String var5 = b(var4).intern();
      byte var10001 = -1;
      b = var5;
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
