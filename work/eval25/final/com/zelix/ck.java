package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ck extends fw {
   String M;
   private static final long a = ess.a(-5875410026247866251L, 9207803326579109808L, MethodHandles.lookup().lookupClass()).a(61450581832682L);
   private static final String c;

   public void t(Object[] var1) {
      long var4 = (Long)var1[0];
      _za var2 = (_za)var1[1];
      _ur var3 = (_ur)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 1445808893670L;
      long var10 = var4 ^ 114633185681979L;
      long var12 = var4 ^ 29791420647726L;
      long var14 = var4 ^ 134528422017690L;
      long var16 = var4 ^ 80521838856410L;
      int var18 = x44.a<"i">(this, new Object[]{var14}, 7145691849331111744L, var4);
      g7 var19 = (g7)this.e(0);
      int var20 = x44.a<"i">(var3, new Object[]{var16}, 8706655031326303606L, var4);
      int var21 = x44.a<"i">(var3, new Object[]{var10}, 7309659849235451010L, var4);
      int var22 = x44.a<"i">(var3, new Object[]{var12}, 7191208742915394367L, var4);
      x44.a<"i">(var19, new Object[]{var6, this, var3}, 7002425364818203850L, var4);
      x44.a<"r">(this, x44.a<"i">(var19, new Object[0], 7328816409459435145L, var4), 7164438496175972086L, var4);
      Object[] var10007 = new Object[]{null, null, null, null, var22};
      var10007[3] = var8;
      var10007[2] = var21;
      var10007[1] = var20;
      var10007[0] = var3;
      x44.a<"i">(this, var10007, 6993704142409435132L, var4);
   }

   public ck(long var1, int var3) {
      var1 = a ^ var1;
      long var10001 = var1 ^ 12044572339098L;
      int var4 = (int)((var1 ^ 12044572339098L) >>> 48);
      int var5 = (int)((var1 ^ 12044572339098L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      super((short)var4, (char)var5, var3, var6);
   }

   protected void Y(Object[] var1) {
      _ur var2 = (_ur)var1[0];
      int var7 = (Integer)var1[1];
      int var6 = (Integer)var1[2];
      long var4 = (Long)var1[3];
      int var3 = (Integer)var1[4];
      long var8 = var4 ^ 132123200400598L;
      long var10 = var4 ^ 60601649508817L;
      PrintWriter var12 = x44.a<"o">(var2, new Object[]{var10}, -8328464867790394533L, var4);
      String var13 = x44.a<"w">(new Object[]{var8}, -7664607665609041399L, var4) + " " + x44.a<"k">(this, -8247441621119979504L, var4);
      var12.println(var13);
      x44.a<"o">(x44.a<"n">(-7588631005175905587L, var4), var13, -8328637349100607116L, var4);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return c;
   }

   static {
      long var0 = a ^ 85287321557063L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("·\t>S\u0011ìÈ\\".getBytes("ISO-8859-1"));
      String var5 = c(var4).intern();
      byte var10001 = -1;
      c = var5;
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
