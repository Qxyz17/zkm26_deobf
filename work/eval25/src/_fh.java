package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _fh {
   private HashMap E;
   bd I;
   private static final long a = ess.a(-8856813164165927819L, 663059681545078761L, MethodHandles.lookup().lookupClass()).a(98569778418960L);
   private static final long b;

   public _fh(long var1, bd var3) {
      var1 = a ^ var1;
      super();
      x44.a<"w">(this, new HashMap((int)b), -3719926377110259376L, var1);
      x44.a<"w">(this, var3, -3907770269793300122L, var1);
   }

   public String T(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return (String)x44.a<"m">(this, 458608402089866093L, var2).get(var4);
   }

   public boolean M(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return x44.a<"l">(x44.a<"h">(this, -1472610920803754336L, var2), var4, -1230852581757649420L, var2);
   }

   public void q(Object[] var1) {
      String var3 = (String)var1[0];
      String var2 = (String)var1[1];
      long var4 = (Long)var1[2];
      var4 = a ^ var4;
      x44.a<"o">(this, 7207758474022424887L, var4).put(var3, var2);
   }

   public bd l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"k">(this, 6012219576922393549L, var2);
   }

   static {
      long var0 = a ^ 51688594151326L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 729516097889589102L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)((int)(var4 >>> 56)),
            (byte)((int)(var4 >>> 48)),
            (byte)((int)(var4 >>> 40)),
            (byte)((int)(var4 >>> 32)),
            (byte)((int)(var4 >>> 24)),
            (byte)((int)(var4 >>> 16)),
            (byte)((int)(var4 >>> 8)),
            (byte)((int)var4)
         }
      );
      long var7 = ((long)var6[0] & 255L) << 56
         | ((long)var6[1] & 255L) << 48
         | ((long)var6[2] & 255L) << 40
         | ((long)var6[3] & 255L) << 32
         | ((long)var6[4] & 255L) << 24
         | ((long)var6[5] & 255L) << 16
         | ((long)var6[6] & 255L) << 8
         | (long)var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }
}
