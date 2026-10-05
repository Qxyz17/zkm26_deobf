package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class io extends ik {
   private static final long b = ess.a(-8423865419654403987L, 3808063733689425503L, MethodHandles.lookup().lookupClass()).a(33949809024185L);
   private static final String d;

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      return d;
   }

   public void i(Object[] var1) {
      int var5 = (Integer)var1[0];
      int var6 = (Integer)var1[1];
      HashMap var2 = (HashMap)var1[2];
      long var3 = (Long)var1[3];
      long var7 = var3 ^ 54012995482019L;
      String var9 = this.s().u();
      Object[] var10007 = new Object[]{null, null, null, var6, var2, this};
      var10007[2] = var5;
      var10007[1] = var9;
      var10007[0] = var7;
      String var10 = x44.a<"v">(var10007, 7254867657063096951L, var3);

      try {
         if (!var9.equals(var10)) {
            this.s().v(var10);
         }
      } catch (gj var11) {
         throw x44.a<"v">(var11, 7290722811228153982L, var3);
      }
   }

   io(h8 var1, long var2, _xx var4, te var5, _y4 var6, _y4 var7) {
      var2 = b ^ var2;
      long var10001 = var2 ^ 44438799463001L;
      int var8 = (int)((var2 ^ 44438799463001L) >>> 48);
      int var9 = (int)((var2 ^ 44438799463001L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      super(var1, var4, var5, (char)var8, var6, var9, var7, var10);
   }

   static {
      long var0 = b ^ 76658476872447L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("f³àV\u009f\u000fÚeþ<IÎÐúÿf\u0015\u001aMîâÙ®¼".getBytes("ISO-8859-1"));
      String var5 = c(var4).intern();
      byte var10001 = -1;
      d = var5;
   }

   private static gj b(gj var0) {
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
