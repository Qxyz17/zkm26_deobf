package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ud extends KeyAdapter {
   final s6 n;
   private static final long a = ess.a(6686094050560563209L, 5433247585073864671L, MethodHandles.lookup().lookupClass()).a(169889974501618L);
   private static final long b;

   ud(s6 var1) {
      this.n = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      long var2 = a ^ 10745853647045L;
      long var4 = var2 ^ 129751917163080L;

      try {
         if (x44.a<"j">(var1, -1268558370907015612L, var2) == (int)b) {
            x44.a<"j">(x44.a<"n">(this, -693544745716656666L, var2), new Object[]{var4}, -1172452546189452333L, var2);
         }
      } catch (gj var6) {
         throw x44.a<"r">(var6, -966498672398406169L, var2);
      }
   }

   static {
      long var0 = a ^ 4426083662257L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 3619394028808922770L;
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
