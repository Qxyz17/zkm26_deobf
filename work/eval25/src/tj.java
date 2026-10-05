package com.zelix;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tj extends KeyAdapter {
   final s7 e;
   private static final long a = ess.a(-4907189390800619269L, -4210259880236880420L, MethodHandles.lookup().lookupClass()).a(164740615071882L);
   private static final long b;

   @Override
   public void keyPressed(KeyEvent var1) {
      long var2 = a ^ 15761252930789L;
      long var4 = var2 ^ 118005472806874L;

      try {
         if (x44.a<"h">(var1, 6626820011092247510L, var2) == (int)b) {
            x44.a<"h">(x44.a<"l">(this, 4879510164439460663L, var2), new Object[]{var4}, 6496585186237984321L, var2);
         }
      } catch (gj var6) {
         throw x44.a<"p">(var6, 5167267022327855066L, var2);
      }
   }

   tj(s7 var1) {
      this.e = var1;
   }

   static {
      long var0 = a ^ 136620278428096L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 2305736831363348492L;
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
