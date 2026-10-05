package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum o7 {
   public static final o7 N;
   public static final o7 Q;
   public static final o7 U;
   public static final o7 L;
   public static final o7 S;
   private static final o7[] E;
   private static final long a = prr.a(976322613990650136L, 6085956503342807106L, MethodHandles.lookup().lookupClass()).a(143861270384820L);

   static {
      long var9 = a ^ 139141289698023L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "\\³\u0097ï\u00adfh\u0003?\u000f|[à)u\u001eUË@kTÕ\u008bt\u0018mV^y\u0006.\u008cÊR\u007fì+:\u008ejJ\u008fòY\u009c\u001a¼xó\u0018ÛêÔvÜ÷QØº&\u0083\u008bB8{ü\u0089£#T½\u0005\u009cä";
      int var7 = "\\³\u0097ï\u00adfh\u0003?\u000f|[à)u\u001eUË@kTÕ\u008bt\u0018mV^y\u0006.\u008cÊR\u007fì+:\u008ejJ\u008fòY\u009c\u001a¼xó\u0018ÛêÔvÜ÷QØº&\u0083\u008bB8{ü\u0089£#T½\u0005\u009cä"
         .length();
      char var4 = 24;
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     U = new o7();
                     L = new o7();
                     S = new o7();
                     N = new o7();
                     Q = new o7();
                     E = new o7[]{
                        m44.a<"o">(-6273388153866541657L, var9),
                        m44.a<"o">(-5812842024655772096L, var9),
                        m44.a<"o">(-5262318988782655816L, var9),
                        m44.a<"o">(-5586740693312498123L, var9),
                        m44.a<"o">(-6170619345451733604L, var9)
                     };
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "ÛêÔvÜ÷QØº&\u0083\u008bB8{ü\u0091+õ!Óîso\u0016¶æC\u0002Ä¿v\u0018IJâZâ¯o³Ï}_BÙG5J'ìw]\u000bl\u001a\u0017";
                  var7 = "ÛêÔvÜ÷QØº&\u0083\u008bB8{ü\u0091+õ!Óîso\u0016¶æC\u0002Ä¿v\u0018IJâZâ¯o³Ï}_BÙG5J'ìw]\u000bl\u001a\u0017".length();
                  var4 = ' ';
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
            var10001 = 0;
         }
      }
   }

   public static o7[] w(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (o7[])m44.a<"m">(2142934025461663076L, var1).clone();
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
}
