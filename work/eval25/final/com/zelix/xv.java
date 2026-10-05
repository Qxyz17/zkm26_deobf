package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xv extends xe {
   static final w5 v;
   float P;
   private static final long a = ess.a(5155750748608163284L, -3095595804971515305L, MethodHandles.lookup().lookupClass()).a(163755719188766L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   public String l(char var1, int var2, char var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      return b<"j">(22905, 1943540048796256428L ^ var4);
   }

   static {
      long var9 = a ^ 61455942727118L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var5 = 0;
      String var4 = "¤Q\u0005\u0098Zg\u001f\u0097Z\u0015i\u0004x\u009bÁÛ0\u0087ßêô\t\u000e[\u008f±d\u0011Öø\u0000æ¼±\u009eEÅ0r\u009a\u0010âtT´\u0094Û£ºp\u000fßû p@¯";
      int var6 = "¤Q\u0005\u0098Zg\u001f\u0097Z\u0015i\u0004x\u009bÁÛ0\u0087ßêô\t\u000e[\u008f±d\u0011Öø\u0000æ¼±\u009eEÅ0r\u009a\u0010âtT´\u0094Û£ºp\u000fßû p@¯"
         .length();
      char var3 = '(';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var13 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var13;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            v = x44.a<"i">(2247872191342696219L, var9);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   public String N(long var1) {
      return x44.a<"u">(x44.a<"i">(this, -2549825888654733552L, var1), -2410824483502577228L, var1);
   }

   xv(int var1, long var2, _xx var4, _83 var5) {
      var2 = a ^ var2;
      super(var1, var5);
      x44.a<"p">(this, x44.a<"k">(var4, -714276236987324817L, var2), -1316334009907741130L, var2);
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 137214445240483L;
      return x44.a<"n">(this, var4, -8714402548949168711L, var2);
   }

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-4243467868983704734L, var1).l());
      x44.a<"o">(var3, x44.a<"k">(this, -4355214133163536382L, var1), -4340941476531778765L, var1);
   }

   public w5 m(long var1) {
      return x44.a<"h">(-1575624019751900068L, var1);
   }

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 92703790740844L;

      float var7;
      try {
         var7 = x44.a<"o">(x44.a<"w">(var4, -724367572162478355L, var2), -1514797223987242806L, var2);
      } catch (NumberFormatException var9) {
         throw new _su(var4 + b<"j">(28096, 2658498972216852524L ^ var2));
      }

      x44.a<"t">(this, var7, -792838161311406222L, var2);
      x44.a<"o">(this, new Object[]{var5}, -937336034939244895L, var2);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3376;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/xv", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/xv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
