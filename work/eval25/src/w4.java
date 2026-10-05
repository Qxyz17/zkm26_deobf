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

public class w4 implements ap {
   private static final Map j;
   private static final Map X;
   private final String T;
   private static final long a = ess.a(8101927026195326139L, -1727275573890377158L, MethodHandles.lookup().lookupClass()).a(251987518577135L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public static String v(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return a<"c">(15679, 4099943777707958049L ^ var1);
   }

   public String k(long var1) {
      return x44.a<"i">(this, -9115714481854503122L, var1);
   }

   public static w4 t(Object[] var0) {
      long var1 = (Long)var0[0];
      String var3 = (String)var0[1];
      var1 = a ^ var1;
      return (w4)x44.a<"m">(-928812652493100592L, var1).get(var3);
   }

   public static String P(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return a<"c">(4408, 4928508809645824742L ^ var1);
   }

   public boolean I(Object[] var1) {
      return true;
   }

   private w4(String var1) {
      this.T = var1;
   }

   static {
      long var9 = a ^ 54631267215643L;
      long var11 = var9 ^ 138488401893184L;
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
      String var4 = "\u0000eÕ¬¥\u001a75\u001d«Ó²Ô²ÃÂB\u008bßÛìö\u001aÈJN#Ç>N\u0087T9<\u009ef8ý¼Ë\u0010\u001fú\u0092³0\u0090²UKcßDS\u0083Ú\u008f";
      int var6 = "\u0000eÕ¬¥\u001a75\u001d«Ó²Ô²ÃÂB\u008bßÛìö\u001aÈJN#Ç>N\u0087T9<\u009ef8ý¼Ë\u0010\u001fú\u0092³0\u0090²UKcßDS\u0083Ú\u008f".length();
      char var3 = '(';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var15 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var15;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[2];
            j = x44.a<"p">(new Object[]{var11}, 6538333224341912787L, var9);
            X = x44.a<"p">(new Object[]{var11}, 6538333224341912787L, var9);
            x44.a<"i">(6519769607584363944L, var9).put("B", x44.a<"i">(6593720529050108060L, var9));
            x44.a<"i">(6519769607584363944L, var9).put("Z", x44.a<"i">(5069994769971789523L, var9));
            x44.a<"i">(6519769607584363944L, var9).put("S", x44.a<"i">(6497280762215599912L, var9));
            x44.a<"i">(6519769607584363944L, var9).put("C", x44.a<"i">(5068277374143076738L, var9));
            x44.a<"i">(6519769607584363944L, var9).put("I", x44.a<"i">(6357924158623529921L, var9));
            x44.a<"i">(6519769607584363944L, var9).put("J", x44.a<"i">(6797354586293676004L, var9));
            x44.a<"i">(6519769607584363944L, var9).put("F", x44.a<"i">(5075367987737972948L, var9));
            x44.a<"i">(6519769607584363944L, var9).put("D", x44.a<"i">(4943904425028281123L, var9));
            x44.a<"i">(6519769607584363944L, var9).put("V", x44.a<"i">(6472362880462194832L, var9));
            x44.a<"i">(5032874635253653268L, var9).put("B", new w4("B"));
            x44.a<"i">(5032874635253653268L, var9).put("Z", new w4("Z"));
            x44.a<"i">(5032874635253653268L, var9).put("S", new w4("S"));
            x44.a<"i">(5032874635253653268L, var9).put("C", new w4("C"));
            x44.a<"i">(5032874635253653268L, var9).put("I", new w4("I"));
            x44.a<"i">(5032874635253653268L, var9).put("J", new w4("J"));
            x44.a<"i">(5032874635253653268L, var9).put("F", new w4("F"));
            x44.a<"i">(5032874635253653268L, var9).put("D", new w4("D"));
            x44.a<"i">(5032874635253653268L, var9).put("V", new w4("V"));
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   public String C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 93750793260522L;
      return x44.a<"s">(new Object[]{x44.a<"o">(this, -265599861040096768L, var2), var4}, -204462081535314574L, var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9551;
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
            throw new RuntimeException("com/zelix/w4", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/w4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
