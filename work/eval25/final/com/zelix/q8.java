package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum q8 {
   public static final q8 r;
   public static final q8 Y;
   public static final q8 s;
   public static final q8 y;
   public static final q8 B;
   public static final q8 H;
   private static final q8[] i;
   private static final long a = ess.a(7782949729938230893L, -7648456319123143320L, MethodHandles.lookup().lookupClass()).a(239572862804059L);

   public static q8[] Y(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (q8[])x44.a<"n">(5531697572959802952L, var1).clone();
   }

   static {
      long var16 = a ^ 75886326396658L;
      Cipher var8;
      Cipher var10000 = var8 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var9 = 1; var9 < 8; var9++) {
         var10003[var9] = (byte)((int)(var16 << var9 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var13 = 0;
      String var12 = "Ø.Á\bè,\u000bÆôbhÞ'2·\u0014\u0018\u00993Ú^ÚSØÔ\u007fÌi)Æ3Ç\u0098R¬×£\u009d\u008f:0\u0010«Ê÷ò]vå¯mç\u0014\u0018\"\u0087\u001e\u0010\u0018\u00993Ú^ÚSØÔ\u007fÌi)Æ3Ç\u0098eqk´YsHF";
      int var14 = "Ø.Á\bè,\u000bÆôbhÞ'2·\u0014\u0018\u00993Ú^ÚSØÔ\u007fÌi)Æ3Ç\u0098R¬×£\u009d\u008f:0\u0010«Ê÷ò]vå¯mç\u0014\u0018\"\u0087\u001e\u0010\u0018\u00993Ú^ÚSØÔ\u007fÌi)Æ3Ç\u0098eqk´YsHF"
         .length();
      char var11 = 16;
      int var19 = -1;

      label37:
      while (true) {
         String var20 = var12.substring(++var19, var19 + var11);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var8.doFinal(var20.getBytes("ISO-8859-1"));
            String var29 = a(var15).intern();
            switch (var10001) {
               case 0:
                  var7[var13++] = var29;
                  if ((var19 += var11) >= var14) {
                     Cipher var2;
                     var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var4 = 359454895051359210L;
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
                     long var33 = ((long)var6[0] & 255L) << 56
                        | ((long)var6[1] & 255L) << 48
                        | ((long)var6[2] & 255L) << 40
                        | ((long)var6[3] & 255L) << 32
                        | ((long)var6[4] & 255L) << 24
                        | ((long)var6[5] & 255L) << 16
                        | ((long)var6[6] & 255L) << 8
                        | (long)var6[7] & 255L;
                     var10001 = -1;
                     long var0 = var33;
                     H = new q8();
                     y = new q8();
                     r = new q8();
                     Y = new q8();
                     s = new q8();
                     B = new q8();
                     q8[] var23 = new q8[(int)var0];
                     var23[0] = x44.a<"h">(-2147370880026068687L, var16);
                     var23[1] = x44.a<"h">(-551366494682733041L, var16);
                     var23[2] = x44.a<"h">(-2295242704569744158L, var16);
                     var23[3] = x44.a<"h">(-10323979792378194L, var16);
                     var23[4] = x44.a<"h">(-156594940352793088L, var16);
                     var23[5] = x44.a<"h">(-2158516178585819022L, var16);
                     i = var23;
                     return;
                  }

                  var11 = var12.charAt(var19);
                  break;
               default:
                  var7[var13++] = var29;
                  if ((var19 += var11) < var14) {
                     var11 = var12.charAt(var19);
                     continue label37;
                  }

                  var12 = "-ÖÇÁÏà\u008b\u001evÖ)ÌÞ\u0088O\u0015¶£¬\u000eH\u0082´q\bøÁvLü¢\u0094º";
                  var14 = "-ÖÇÁÏà\u008b\u001evÖ)ÌÞ\u0088O\u0015¶£¬\u000eH\u0082´q\bøÁvLü¢\u0094º".length();
                  var11 = 24;
                  var19 = -1;
            }

            var20 = var12.substring(++var19, var19 + var11);
            var10001 = 0;
         }
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
}
