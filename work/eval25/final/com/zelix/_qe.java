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

public class _qe extends _qw {
   private static final long a = ess.a(-3040981556201966165L, 8738838295333678483L, MethodHandles.lookup().lookupClass()).a(129223612969120L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public _qe(int var1, long var2) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 22970722468623L;
      int var4 = (int)((var2 ^ 22970722468623L) >>> 32);
      int var5 = (int)((var2 ^ 22970722468623L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      super(var4, (short)var5, (short)var6, var1);
   }

   public final void K(Object[] var1) {
      long var4 = (Long)var1[0];
      az var3 = (az)var1[1];
      _uu var2 = (_uu)var1[2];
      long var6 = var4 ^ 111452843812254L;
      long var8 = var4 ^ 139324542296055L;
      x44.a<"o">(
         var2,
         new Object[]{
            a<"f">(15, 6209059518723674449L ^ var4)
               + x44.a<"o">(this, new Object[]{var6}, 3495266996315428193L, var4)
               + a<"f">(18731, 7627718929852405876L ^ var4),
            var8
         },
         3949095066529335522L,
         var4
      );
   }

   static {
      long var0 = a ^ 6660538884021L;
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
      String var6 = "\u0014&å=|uòÆ-\u009c\u001bAv\u0003\u0004Ì\u0093\u0017:\u00981\u000f½Öìä¨Zb\u001e)\\\u001dz¬ÉWËÉÛi`\u000f´\u0083½z\u009f+Ù\u0011Go6Uf\"ýu\u0088Y\u0093ß\u0099Àd¶\u0087\u008bH ²8¯ñú\u008b²÷;ÅlNu·Nñ®9§\u000fëùÁ÷\u000f\b\u008bö´û\tKP;\\\u008a[ s\u0003z\u001a«¡\u00141{\f&\u0004\u0014ßzRú\u008f$í";
      int var8 = "\u0014&å=|uòÆ-\u009c\u001bAv\u0003\u0004Ì\u0093\u0017:\u00981\u000f½Öìä¨Zb\u001e)\\\u001dz¬ÉWËÉÛi`\u000f´\u0083½z\u009f+Ù\u0011Go6Uf\"ýu\u0088Y\u0093ß\u0099Àd¶\u0087\u008bH ²8¯ñú\u008b²÷;ÅlNu·Nñ®9§\u000fëùÁ÷\u000f\b\u008bö´û\tKP;\\\u008a[ s\u0003z\u001a«¡\u00141{\f&\u0004\u0014ßzRú\u008f$í"
         .length();
      char var5 = 'H';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27339;
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
            throw new RuntimeException("com/zelix/_qe", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_qe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
