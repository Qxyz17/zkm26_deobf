package com.zelix;

import java.io.PrintWriter;
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

public class cy extends fw {
   private static final long a = ess.a(-7081208085330398347L, -5865107287432238617L, MethodHandles.lookup().lookupClass()).a(197648337398308L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"f">(17409, 6036833379189505840L ^ var2);
   }

   protected void Y(Object[] var1) {
      _ur var4 = (_ur)var1[0];
      int var7 = (Integer)var1[1];
      int var6 = (Integer)var1[2];
      long var2 = (Long)var1[3];
      int var5 = (Integer)var1[4];
      long var8 = var2 ^ 132123200400598L;
      long var10 = var2 ^ 60601649508817L;
      long var12 = var2 ^ 31533676741137L;
      PrintWriter var14 = x44.a<"o">(var4, new Object[]{var10}, -8328464867790394533L, var2);
      String var15 = x44.a<"w">(new Object[]{var8}, -7664607665609041399L, var2) + b<"f">(13707, 6363728489974973688L ^ var2);
      var14.println(var15);
      x44.a<"o">(x44.a<"n">(-7588631005175905587L, var2), var15, -8328637349100607116L, var2);
      x44.a<"o">(var4, new Object[]{var12}, -8553578333598383016L, var2);
   }

   public void t(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var2 = (_za)var1[1];
      _ur var5 = (_ur)var1[2];
      long var6 = var3 ^ 114633185681979L;
      long var8 = var3 ^ 29791420647726L;
      long var10 = var3 ^ 1445808893670L;
      long var12 = var3 ^ 80521838856410L;
      int var10002 = x44.a<"i">(var5, new Object[]{var12}, 8706655031326303606L, var3);
      int var10003 = x44.a<"i">(var5, new Object[]{var6}, 7309659849235451010L, var3);
      Object[] var10007 = new Object[]{null, null, null, null, x44.a<"i">(var5, new Object[]{var8}, 7191208742915394367L, var3)};
      var10007[3] = var10;
      var10007[2] = var10003;
      var10007[1] = var10002;
      var10007[0] = var5;
      x44.a<"i">(this, var10007, 7204805659364177413L, var3);
   }

   public cy(int var1, long var2, byte var4) {
      long var5 = (var2 << 8 | (long)var4 << 56 >>> 56) ^ a;
      long var10001 = var5 ^ 61548512964920L;
      int var7 = (int)((var5 ^ 61548512964920L) >>> 48);
      int var8 = (int)((var5 ^ 61548512964920L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      super((short)var7, (char)var8, var1, var9);
   }

   static {
      long var0 = a ^ 103456884198159L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "ÖÑ\u001aD²\t1ð$\f«?rÌö=»â?Ãâ\u0097);\u009e\u0007¶8·+.ê8üÀa\u0002úRæ\u0003W,\u0011>¦_\u008cr\u0082`ö¢V\u0002\u009f£b÷cÎ¡¾\u0082\u008d?\u008beá!Ò\u008a\u0080Ä¡|\u008b%V{´\bgG\u007fNÄ\u0092þ";
      int var8 = "ÖÑ\u001aD²\t1ð$\f«?rÌö=»â?Ãâ\u0097);\u009e\u0007¶8·+.ê8üÀa\u0002úRæ\u0003W,\u0011>¦_\u008cr\u0082`ö¢V\u0002\u009f£b÷cÎ¡¾\u0082\u008d?\u008beá!Ò\u008a\u0080Ä¡|\u008b%V{´\bgG\u007fNÄ\u0092þ"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26814;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/cy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/cy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
