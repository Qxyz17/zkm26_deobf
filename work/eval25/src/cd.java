package com.zelix;

import java.io.File;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class cd extends cs {
   private static final long d = ess.a(-3502132148321822957L, 8993566196562493391L, MethodHandles.lookup().lookupClass()).a(202959914404441L);
   private static final String r;

   void l(Object[] var1) {
      pk var2 = (pk)var1[0];
      File var4 = (File)var1[1];
      _zk var5 = (_zk)var1[2];
      long var7 = (Long)var1[3];
      _ur var3 = (_ur)var1[4];
      eq var6 = (eq)var1[5];
      long var9 = var7 ^ 138873466770183L;
      long var11 = var7 ^ 57924230467856L;
      long var13 = var7 ^ 8587695466378L;
      long var15 = var7 ^ 39094486948052L;
      long var17 = var7 ^ 71819419930246L;
      int var10001 = x44.a<"l">(this, new Object[]{var15}, -3938460377842075239L, var7);
      boolean var10002 = x44.a<"l">(this, new Object[]{var17}, -2996967545990861001L, var7);
      boolean var10003 = x44.a<"l">(this, new Object[]{var9}, -3732037111130956787L, var7);
      Object[] var10011 = new Object[]{null, null, null, x44.a<"l">(this, new Object[]{var11}, -3078629390782691972L, var7), var13, var4, var5, var3, var6};
      var10011[2] = var10003;
      var10011[1] = var10002;
      var10011[0] = var10001;
      x44.a<"l">(var2, var10011, -3523241749737036458L, var7);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return r;
   }

   public cd(long var1, int var3) {
      var1 = d ^ var1;
      int var4 = (int)((var1 ^ 89540984742154L) >>> 56);
      long var5 = (var1 ^ 89540984742154L) << 8 >>> 8;
      super((byte)var4, var5, var3);
   }

   static {
      long var0 = d ^ 50883867767492L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("L\u008c\u0092Æ\u009c÷QÀ".getBytes("ISO-8859-1"));
      String var5 = e(var4).intern();
      byte var10001 = -1;
      r = var5;
   }

   private static String e(byte[] var0) {
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
