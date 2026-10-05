package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum l6_ {
   public static final l6_ L;
   private static final l6_[] V;
   public static final l6_ h;
   public static final l6_ O;
   private final int U;
   public static final l6_ r;
   private static final long a = prr.a(8933433964323533819L, -5631727916387469200L, MethodHandles.lookup().lookupClass()).a(155912626086347L);

   public static l6_[] N(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (l6_[])m44.a<"h">(-6699512100458148040L, var1).clone();
   }

   static {
      long var9 = a ^ 108813123776444L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "(m \u0093Ú<d\u0092\b\rr\u0084\u0016±.=Ü";
      int var7 = "(m \u0093Ú<d\u0092\b\rr\u0084\u0016±.=Ü".length();
      char var4 = '\b';
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
                     r = new l6_(0);
                     L = new l6_(1);
                     O = new l6_(2);
                     h = new l6_(3);
                     V = new l6_[]{
                        m44.a<"m">(7368614986982550907L, var9),
                        m44.a<"m">(7127101775608478520L, var9),
                        m44.a<"m">(9131265764959344377L, var9),
                        m44.a<"m">(8757359204646121657L, var9)
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

                  var5 = "PZ\u0014iì8¨7\u0010»¤ZG¬L|)i\u0095°Òorp ";
                  var7 = "PZ\u0014iì8¨7\u0010»¤ZG¬L|)i\u0095°Òorp ".length();
                  var4 = '\b';
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
            var10001 = 0;
         }
      }
   }

   int g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"p">(this, 2697472347873206833L, var2);
   }

   private l6_(int var3) {
      this.U = var3;
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
