package com.zelix;

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

public class _gd extends _nv {
   private static final long d = ess.a(-2760032182950005603L, -5564715023753268487L, MethodHandles.lookup().lookupClass()).a(94080854150164L);
   private static final String[] u;
   private static final String[] w;
   private static final Map x = new HashMap(13);

   public final void K(Object[] var1) {
      long var3 = (Long)var1[0];
      az var5 = (az)var1[1];
      _uu var2 = (_uu)var1[2];
      long var6 = var3 ^ 76474684103763L;
      long var8 = var3 ^ 0L;
      x44.a<"o">(this, new Object[]{var6, d<"p">(22173, 5355009841554249054L ^ var3)}, 3883376940642717366L, var3);
      super.K(new Object[]{var8, var5, var2});
   }

   boolean Y(Object[] var1) {
      return true;
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return d<"p">(5449, 3334958246686191516L ^ var2);
   }

   boolean J(Object[] var1) {
      return true;
   }

   public _gd(int var1, long var2) {
      var2 = d ^ var2;
      long var4 = var2 ^ 86757394314616L;
      super(var1, var4);
   }

   static {
      long var0 = d ^ 39883597411857L;
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
      String var6 = "káSÅË\u0016\u0018³`Àü\u0082\u008eÀhÆ\u0007¿©\u001f^vÞS0©MhåÉ\u008djÁ0 \u0095yh9¡\u0012¤\u0096a%k\u0098Da¿1§µy\\\u0092Ân|¬Ó\u00893\u0083²\u0089\u009daJ\"×©c";
      int var8 = "káSÅË\u0016\u0018³`Àü\u0082\u008eÀhÆ\u0007¿©\u001f^vÞS0©MhåÉ\u008djÁ0 \u0095yh9¡\u0012¤\u0096a%k\u0098Da¿1§µy\\\u0092Ân|¬Ó\u00893\u0083²\u0089\u009daJ\"×©c"
         .length();
      char var5 = 24;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = d(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            u = var9;
            w = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static String d(byte[] var0) {
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

   private static String d(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14423;
      if (w[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])x.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               x.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_gd", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = u[var5].getBytes("ISO-8859-1");
         w[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return w[var5];
   }

   private static Object d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_gd" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
