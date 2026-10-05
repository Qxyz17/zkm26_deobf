package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xr extends KeyAdapter {
   final s4 B;
   private static final long a = ess.a(4270300952957893848L, -64533700056833206L, MethodHandles.lookup().lookupClass()).a(194056028622111L);
   private static final long b;

   xr(s4 var1) {
      this.B = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      long var2 = a ^ 41354395285703L;
      long var4 = var2 ^ 129415807848265L;

      try {
         if (x44.a<"k">(var1, -3214392212543370427L, var2) == (int)b) {
            x44.a<"k">(x44.a<"o">(this, -3734820194914431517L, var2), new Object[]{var4}, -3392451808779692790L, var2);
         }
      } catch (gj var6) {
         throw x44.a<"s">(var6, -3307385716324184261L, var2);
      }
   }

   static {
      long var0 = a ^ 85976193930334L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 6797075850247107609L;
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

   private static gj a(gj var0) {
      return var0;
   }
}
