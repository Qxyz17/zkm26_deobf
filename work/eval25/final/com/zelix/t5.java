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

public abstract class t5 extends tp {
   public static final String d;
   private static final long a = ess.a(-3766189510880483145L, 2334523959406455874L, MethodHandles.lookup().lookupClass()).a(36202324844785L);
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   String V(Object[] var1) {
      long var2 = (Long)var1[0];
      int var4 = (Integer)var1[1];
      var2 = a ^ var2;
      switch (var4) {
         case 0:
            return b<"l">(3761, 84582024459476642L ^ var2);
         case 1:
            return b<"l">(9050, 3757531584691401546L ^ var2);
         case 2:
            return b<"l">(29706, 2664846643042034712L ^ var2);
         case 3:
            return b<"l">(29528, 6614247021880517453L ^ var2);
         default:
            return b<"l">(32685, 585735146128191419L ^ var2);
      }
   }

   static {
      long var9 = a ^ 112368701688717L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "Ü\u0094\u0085\u0010\u009a\u009féÈ£Ñ\u0082P¸AàÉ\u008096\u0099óê¶×y£\u008cuÿû«y\u0010×\u0002Æø\u0012óö¯ó^ãca\u001f5Ëôôïì)\u008cB\u009b6PP\u0092\rn2÷\u0081Á4$\u001c\u0097\u001f\u0018\u007fÏE\u00942ËÏY\u0016\u0087_\u008bÉ\u007ff\nÒÀ\u0084<\u001cÉ(Z\u0010nð\u008f\tJE±ý¦\u0094±\u0006ËÙ7ªPýd®mÐw\u008dL\u008aàªÈ\n\u0082r3qS¶+®Û\u0007^\u0091x5¦]\u008b\u0096×²zMÿf9\u001d¹\u0003\u0089æÞ\u0016Û£\u009d{¥ëX6þ\u0097ê¹à`#[k\u009a9\u0010ð&ÿYÛÁ¿\u0094\u0017+4Ð¦_\u0080Pw3%Ò\u0093²25ÿvûFÛK8\u008c\u0000óY\bçó/Ú\b{ë3\u0018IÛS÷\u0097%´\u0082J\u0080üD\u00026Òá\u001f\u0014+Ü\u0000ÂîmÞ]Oø\u0090\u0088j\u0016r\u0082æä-¿Ã]Û©b$äµÍ\u001aáu·";
      int var6 = "Ü\u0094\u0085\u0010\u009a\u009féÈ£Ñ\u0082P¸AàÉ\u008096\u0099óê¶×y£\u008cuÿû«y\u0010×\u0002Æø\u0012óö¯ó^ãca\u001f5Ëôôïì)\u008cB\u009b6PP\u0092\rn2÷\u0081Á4$\u001c\u0097\u001f\u0018\u007fÏE\u00942ËÏY\u0016\u0087_\u008bÉ\u007ff\nÒÀ\u0084<\u001cÉ(Z\u0010nð\u008f\tJE±ý¦\u0094±\u0006ËÙ7ªPýd®mÐw\u008dL\u008aàªÈ\n\u0082r3qS¶+®Û\u0007^\u0091x5¦]\u008b\u0096×²zMÿf9\u001d¹\u0003\u0089æÞ\u0016Û£\u009d{¥ëX6þ\u0097ê¹à`#[k\u009a9\u0010ð&ÿYÛÁ¿\u0094\u0017+4Ð¦_\u0080Pw3%Ò\u0093²25ÿvûFÛK8\u008c\u0000óY\bçó/Ú\b{ë3\u0018IÛS÷\u0097%´\u0082J\u0080üD\u00026Òá\u001f\u0014+Ü\u0000ÂîmÞ]Oø\u0090\u0088j\u0016r\u0082æä-¿Ã]Û©b$äµÍ\u001aáu·"
         .length();
      char var3 = 'H';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     g = var7;
                     h = new String[7];
                     d = System.getProperty(b<"l">(23381, 3931160504121650278L ^ var9), b<"l">(22109, 3479811265860493677L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0091Ýÿ>õC\"ºéÆþ\u0007=ß\u0081Îo9Q»2ðyP\u001dÆ\u008c?7\t\u0094&Î\u0013\u0092\u000f\u000b:¢Ý\u000e&Ç\u00803?L\u001fÇç4Ë\u0095KDU;Ð,K\u009b\u001d\u001aÇM'\u0092ÿ}\u000fHNHõVà\u008b°\u0004\u009fSHP\u0090(\u009eåÓdñ9Ôn\u0012R\u001f£X\u008bÿ\u007f\u0081ðÙ\u0002Ãr\u009fÑ\u0097«º³É&\tÌ{2%ß\u0092{\u0098e7d\u0096\u0013=¶Þ\u009cÌE)\u0090\u001d\u009d\u009f\u00adé\u008dhâ";
                  var6 = "\u0091Ýÿ>õC\"ºéÆþ\u0007=ß\u0081Îo9Q»2ðyP\u001dÆ\u008c?7\t\u0094&Î\u0013\u0092\u000f\u000b:¢Ý\u000e&Ç\u00803?L\u001fÇç4Ë\u0095KDU;Ð,K\u009b\u001d\u001aÇM'\u0092ÿ}\u000fHNHõVà\u008b°\u0004\u009fSHP\u0090(\u009eåÓdñ9Ôn\u0012R\u001f£X\u008bÿ\u007f\u0081ðÙ\u0002Ãr\u009fÑ\u0097«º³É&\tÌ{2%ß\u0092{\u0098e7d\u0096\u0013=¶Þ\u009cÌE)\u0090\u001d\u009d\u009f\u00adé\u008dhâ"
                     .length();
                  var3 = 'H';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1412;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/t5", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("com/zelix/t5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
