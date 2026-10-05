package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _do extends _s3 {
   final p6 g;
   private static final long a = ess.a(6986384866769592184L, -233884681238508148L, MethodHandles.lookup().lookupClass()).a(140374320006818L);
   private static final String b;

   public void s(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 12958726811178L;
      x44.a<"o">(this, new Object[]{var5, (Integer)var2}, -1879759088522029537L, var3);
   }

   public void e(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 2771547725951L;
      x44.a<"m">(x44.a<"i">(this, -434585406501886198L, var2), new Object[]{var4}, -452922158902899613L, var2);
   }

   public void x(Object[] var1) {
      long var3 = (Long)var1[0];
      Integer var2 = (Integer)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 65838158551696L;
      long var7 = var3 ^ 84960230788934L;
      p6 var10001 = x44.a<"m">(this, -611302305458034314L, var3);
      p6 var10002 = x44.a<"m">(this, -611302305458034314L, var3);
      String var10003 = b;
      x44.a<"q">(
         new Object[]{
            var7,
            var10001,
            x44.a<"i">(
               var10002,
               new Object[]{var10003, x44.a<"m">(x44.a<"m">(this, -611302305458034314L, var3), -1613649625103771150L, var3), var5},
               -698182211822820929L,
               var3
            )
         },
         -1182149002533149278L,
         var3
      );
   }

   _do(p6 var1) {
      this.g = var1;
   }

   static {
      long var0 = a ^ 135300397265576L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("³yf»°\u0019\u0086²åx\u0089\u001c?\u008bf;".getBytes("ISO-8859-1"));
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
