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

public abstract class tp {
   public static final String z;
   private static final long b = ess.a(4447351417523106096L, -8624160974280408009L, MethodHandles.lookup().lookupClass()).a(179429323091336L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   static {
      long var9 = b ^ 8861050817537L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "\u0094\u001ey\\ÿ¢;\u0094x\u0010\u0093\u0081ç\u009a×8Kâ0º\u001a\u0018ÐÉ\bOþg\u0092#Ã\u007fÙ\u0080\u0010\u0092K¸2\u001cÿ\u0090\u0010\u008f\u0012P\u0091÷\\óÌ¹Ægò\u0007*\u001c é\u008eV\u0085úée\u001a\u0005ÊiõyP]äH6x¿mÒå::\u0096H~(\u0092\t\u0086ýÌ¾æ]<ËÕ'JJ\t'\r\u0088ã\"Ú\u0001E#c@7Þ!)ír\u0093ÍhJ \u001cÄú_#\b\u009a\u00100/nHøVwéÜç\u008f½\u001c\u0012â\u0004ì`?´H\u007f\u0085é\u0018\u001eHQ¾\"J\u000bJlßòÉ¾\rê\u0006é4ï%²Üü13\nÊÓ¦\u001f\u0098ÏÇ7÷ç'HCo\u0084<Ä Ù\u001c\u0011µç@ü\u0087\u008b\u0006ÜÇ_\u009eKkz_³2j7¶\u0012P\u0094\u009fD§L#Ô\u001d\u0096Ò¸øÉüæ^\u000eìÕè°$¤\u0096É\u0098ÿ*Ajq\u009c\u009bõ:PÿbóKoÆ\u0089&\u008eøàCq¯\u0089MÉ\u008cèm\u0003:¥Ç}&\u001eïÊÚU`}Ó\u001fâ»UK ¬°É4";
      int var6 = "\u0094\u001ey\\ÿ¢;\u0094x\u0010\u0093\u0081ç\u009a×8Kâ0º\u001a\u0018ÐÉ\bOþg\u0092#Ã\u007fÙ\u0080\u0010\u0092K¸2\u001cÿ\u0090\u0010\u008f\u0012P\u0091÷\\óÌ¹Ægò\u0007*\u001c é\u008eV\u0085úée\u001a\u0005ÊiõyP]äH6x¿mÒå::\u0096H~(\u0092\t\u0086ýÌ¾æ]<ËÕ'JJ\t'\r\u0088ã\"Ú\u0001E#c@7Þ!)ír\u0093ÍhJ \u001cÄú_#\b\u009a\u00100/nHøVwéÜç\u008f½\u001c\u0012â\u0004ì`?´H\u007f\u0085é\u0018\u001eHQ¾\"J\u000bJlßòÉ¾\rê\u0006é4ï%²Üü13\nÊÓ¦\u001f\u0098ÏÇ7÷ç'HCo\u0084<Ä Ù\u001c\u0011µç@ü\u0087\u008b\u0006ÜÇ_\u009eKkz_³2j7¶\u0012P\u0094\u009fD§L#Ô\u001d\u0096Ò¸øÉüæ^\u000eìÕè°$¤\u0096É\u0098ÿ*Ajq\u009c\u009bõ:PÿbóKoÆ\u0089&\u008eøàCq¯\u0089MÉ\u008cèm\u0003:¥Ç}&\u001eïÊÚU`}Ó\u001fâ»UK ¬°É4"
         .length();
      char var3 = 'H';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     c = var7;
                     e = new String[6];
                     z = System.getProperty(a<"n">(25599, 8127227302425595842L ^ var9), "\n");
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

                  var4 = "øVÚ\u00adHü,È9|ÂÅË\rÒ\u009f¯n$ôÒ\u0082Á\u008b¤[9\u001dÇâ%XÝ5±×Í¦lê£>\u0095ÕÃTÀö¯³kEXnêûò ù\u0017H0¼a7\n>\u00042Q#Ô)Óô=,Õ\u0003N `Á\u0098;ß\u0089&(\u000ea©øý\u0081ü\u00947Y@\u001f\u0088X\u008céÇ&¥£òÂ8\u0086";
                  var6 = "øVÚ\u00adHü,È9|ÂÅË\rÒ\u009f¯n$ôÒ\u0082Á\u008b¤[9\u001dÇâ%XÝ5±×Í¦lê£>\u0095ÕÃTÀö¯³kEXnêûò ù\u0017H0¼a7\n>\u00042Q#Ô)Óô=,Õ\u0003N `Á\u0098;ß\u0089&(\u000ea©øý\u0081ü\u00947Y@\u001f\u0088X\u008céÇ&¥£òÂ8\u0086"
                     .length();
                  var3 = 'P';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   String A(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      switch (var4) {
         case 0:
            return a<"n">(10737, 22797557734678733L ^ var2);
         case 1:
            return a<"n">(10617, 6235219583837708358L ^ var2);
         case 2:
            return a<"n">(21924, 3897983297594809497L ^ var2);
         case 3:
            return a<"n">(7631, 4568697361299117302L ^ var2);
         default:
            return a<"n">(3918, 7282093446813910640L ^ var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4836;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/tp", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/tp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
