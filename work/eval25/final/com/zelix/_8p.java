package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _8p {
   public static final _8p I;
   public static final _8p A;
   public static final _8p R;
   public static final _8p y;
   public static final _8p w;
   public static final _8p k;
   public static final _8p X;
   public static final _8p g;
   private static final _8p[] L;
   private static final long a = ess.a(-4643919923911980L, -8528588897928862218L, MethodHandles.lookup().lookupClass()).a(60919210888584L);

   public static _8p[] C(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (_8p[])x44.a<"h">(-7137821537686322820L, var1).clone();
   }

   static {
      long var20 = a ^ 77765100623303L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[8];
      int var17 = 0;
      String var16 = "å8\u0001ÑO¼8_ÑçûÇ\u001c\u0080\u009d³TVÐ7mÂ\u0084\u001f\u0018\u0017à\fã\u00101;oê#.ðªç\u0083p\u008f\u0081\u0018\u0099Íßry\u0018é^gÔ\u008c¸Ás\u0010®óX×Þ\u00ad\u00ad\u008fÙF{ÅÔ\u0012@\u0018¨\u0089r \u0097#\u0012\u00adÃÝ\u00034p\u0081Ù\u0001\u008cý%BZ¶ô2\u0018Á)Ñ÷à\u0095uù\u0085EßW(\u0095\u0083DM7\u001fCË;9Î(UE*yïÍ\u0093\u009cºà\u0094k'Ð\f\u0091aÕòÕiÖ\u0084bÇpc²\u0004ºÌFâ\u0085$\u0089\u001dKµ\u001f";
      int var18 = "å8\u0001ÑO¼8_ÑçûÇ\u001c\u0080\u009d³TVÐ7mÂ\u0084\u001f\u0018\u0017à\fã\u00101;oê#.ðªç\u0083p\u008f\u0081\u0018\u0099Íßry\u0018é^gÔ\u008c¸Ás\u0010®óX×Þ\u00ad\u00ad\u008fÙF{ÅÔ\u0012@\u0018¨\u0089r \u0097#\u0012\u00adÃÝ\u00034p\u0081Ù\u0001\u008cý%BZ¶ô2\u0018Á)Ñ÷à\u0095uù\u0085EßW(\u0095\u0083DM7\u001fCË;9Î(UE*yïÍ\u0093\u009cºà\u0094k'Ð\f\u0091aÕòÕiÖ\u0084bÇpc²\u0004ºÌFâ\u0085$\u0089\u001dKµ\u001f"
         .length();
      char var15 = 24;
      int var24 = -1;

      label55:
      while (true) {
         String var25 = var16.substring(++var24, var24 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var37;
                  if ((var24 += var15) >= var18) {
                     Cipher var1;
                     var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var2 = 1; var2 < 8; var2++) {
                        var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var0 = new long[5];
                     int var4 = 0;
                     String var5 = "Ú\u008c\u0017\t,§à>î¿a\u0091\u00ad¯nV2Ê³¡x/ï\u0097";
                     int var6 = "Ú\u008c\u0017\t,§à>î¿a\u0091\u00ad¯nV2Ê³¡x/ï\u0097".length();
                     byte var3 = 0;

                     label37:
                     while (true) {
                        var10001 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
                        long[] var28 = var0;
                        var10001 = var4++;
                        long var41 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var44 = -1;

                        while (true) {
                           long var8 = var41;
                           byte[] var10 = var1.doFinal(
                              new byte[]{
                                 (byte)((int)(var8 >>> 56)),
                                 (byte)((int)(var8 >>> 48)),
                                 (byte)((int)(var8 >>> 40)),
                                 (byte)((int)(var8 >>> 32)),
                                 (byte)((int)(var8 >>> 24)),
                                 (byte)((int)(var8 >>> 16)),
                                 (byte)((int)(var8 >>> 8)),
                                 (byte)((int)var8)
                              }
                           );
                           long var46 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var44) {
                              case 0:
                                 var28[var10001] = var46;
                                 if (var3 >= var6) {
                                    I = new _8p();
                                    X = new _8p();
                                    k = new _8p();
                                    A = new _8p();
                                    R = new _8p();
                                    w = new _8p();
                                    g = new _8p();
                                    y = new _8p();
                                    _8p[] var29 = new _8p[(int)var0[2]];
                                    var29[0] = x44.a<"i">(-7916177147303564564L, var20);
                                    var29[1] = x44.a<"i">(-7879060053176601095L, var20);
                                    var29[2] = x44.a<"i">(-8225660085878036858L, var20);
                                    var29[3] = x44.a<"i">(-8628830429973179651L, var20);
                                    var29[4] = x44.a<"i">(-8447394438006750571L, var20);
                                    var29[5] = x44.a<"i">(-7987803083219461190L, var20);
                                    var29[(int)var0[0]] = x44.a<"i">(-8231198094355921316L, var20);
                                    var29[(int)var0[3]] = x44.a<"i">(-8373634389149454715L, var20);
                                    L = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "%\u0095]ML®Å\u0090\rH¾\u0092\u0014½0\u007f";
                                 var6 = "%\u0095]ML®Å\u0090\rH¾\u0092\u0014½0\u007f".length();
                                 var3 = 0;
                           }

                           byte var35 = var3;
                           var3 += 8;
                           var7 = var5.substring(var35, var3).getBytes("ISO-8859-1");
                           var28 = var0;
                           var10001 = var4++;
                           var41 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var44 = 0;
                        }
                     }
                  }

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var37;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label55;
                  }

                  var16 = "e\u0092\u0007\u0018Ý/A\n,\u008e\\\u008b`ó²\u0000a¨\u0017øsª\u008dÍ\u0018\u0080Å[^Ñ\u0096Nò¢\nû\u0095i\u008d\u0004\u001f\u001c\u0000~\u0091\u009cÖ¶\u001e";
                  var18 = "e\u0092\u0007\u0018Ý/A\n,\u008e\\\u008b`ó²\u0000a¨\u0017øsª\u008dÍ\u0018\u0080Å[^Ñ\u0096Nò¢\nû\u0095i\u008d\u0004\u001f\u001c\u0000~\u0091\u009cÖ¶\u001e"
                     .length();
                  var15 = 24;
                  var24 = -1;
            }

            var25 = var16.substring(++var24, var24 + var15);
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
