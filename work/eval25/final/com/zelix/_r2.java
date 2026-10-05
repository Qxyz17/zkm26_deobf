package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _r2 {
   public static final _r2 U;
   public static final _r2 V;
   public static final _r2 Y;
   public static final _r2 k;
   public static final _r2 F;
   public static final _r2 j;
   public static final _r2 T;
   public static final _r2 G;
   public static final _r2 f;
   public static final _r2 c;
   public static final _r2 e;
   private static final _r2[] q;
   public static final _r2 t;
   public static final _r2 p;
   private static final long a = ess.a(-1311859057196339869L, 8689586393151988373L, MethodHandles.lookup().lookupClass()).a(237262473371205L);

   public static _r2[] K(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (_r2[])x44.a<"i">(3900569459430058305L, var1).clone();
   }

   static {
      long var20 = a ^ 86570542050001L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[13];
      int var17 = 0;
      String var16 = "sw-S\u008b\u00894Ô\u0010ÆUñT \u0083\f~þé·~Z¨\f\f\u0010kÔÉÌH\u0014/\u001c¹ý\u009dì\u0015·uö\bQäñ77s7á\u0010û0þ\u0016\u00817ÞtÒÙ\u001c1\u0005`«û\b`¬o±0\u009aA.\bÓ@]Þc|Ñ\u0082\btsbl\u00adã7x\bVI\u0015aW6lî\b\u008a[?°4U}\u0084\b\u008bå6\u00948°ÿ\r";
      int var18 = "sw-S\u008b\u00894Ô\u0010ÆUñT \u0083\f~þé·~Z¨\f\f\u0010kÔÉÌH\u0014/\u001c¹ý\u009dì\u0015·uö\bQäñ77s7á\u0010û0þ\u0016\u00817ÞtÒÙ\u001c1\u0005`«û\b`¬o±0\u009aA.\bÓ@]Þc|Ñ\u0082\btsbl\u00adã7x\bVI\u0015aW6lî\b\u008a[?°4U}\u0084\b\u008bå6\u00948°ÿ\r"
         .length();
      char var15 = '\b';
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
                     long[] var0 = new long[15];
                     int var4 = 0;
                     String var5 = "\u0010\u0082¡\u0088ß\u0084\u0017[\u0000ëèï\u001c\u0098\u0083ÿ\u008fo\u0095q\u001c0Y\u0088\u0082³,\u0095M\\\u008d\u0007\rJê7f³fd\u008bl}Âùè\njTøí\u0084\u0010\u0011ÐVï¤<'j<ç\u0088è¹X<\u0013}7³w/; ¿Ç<hGç\u007faÐÃ&ÚÉ+\u0011kV¼\u009dcáb\u0013\u001fD¶rî";
                     int var6 = "\u0010\u0082¡\u0088ß\u0084\u0017[\u0000ëèï\u001c\u0098\u0083ÿ\u008fo\u0095q\u001c0Y\u0088\u0082³,\u0095M\\\u008d\u0007\rJê7f³fd\u008bl}Âùè\njTøí\u0084\u0010\u0011ÐVï¤<'j<ç\u0088è¹X<\u0013}7³w/; ¿Ç<hGç\u007faÐÃ&ÚÉ+\u0011kV¼\u009dcáb\u0013\u001fD¶rî"
                        .length();
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
                                    T = new _r2();
                                    t = new _r2();
                                    e = new _r2();
                                    U = new _r2();
                                    f = new _r2();
                                    F = new _r2();
                                    V = new _r2();
                                    c = new _r2();
                                    k = new _r2();
                                    G = new _r2();
                                    p = new _r2();
                                    Y = new _r2();
                                    j = new _r2();
                                    _r2[] var29 = new _r2[(int)var0[6]];
                                    var29[0] = x44.a<"i">(8855177173999158610L, var20);
                                    var29[1] = x44.a<"i">(7345123565506849350L, var20);
                                    var29[2] = x44.a<"i">(8764811994703283051L, var20);
                                    var29[3] = x44.a<"i">(8948418058685867372L, var20);
                                    var29[4] = x44.a<"i">(9033259345876822649L, var20);
                                    var29[5] = x44.a<"i">(8833141545862664501L, var20);
                                    var29[(int)var0[9]] = x44.a<"i">(9033402926873792051L, var20);
                                    var29[(int)var0[13]] = x44.a<"i">(7222446696047442025L, var20);
                                    var29[(int)var0[14]] = x44.a<"i">(7135413651797355518L, var20);
                                    var29[(int)var0[5]] = x44.a<"i">(8663128282111718974L, var20);
                                    var29[(int)var0[8]] = x44.a<"i">(7327874774254085166L, var20);
                                    var29[(int)var0[1]] = x44.a<"i">(7235471791470599982L, var20);
                                    var29[(int)var0[12]] = x44.a<"i">(7202595326387041496L, var20);
                                    q = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "\u0081'l\u0005x?\u0097[P |3TË<\u0003";
                                 var6 = "\u0081'l\u0005x?\u0097[P |3TË<\u0003".length();
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

                  var16 = "\u0016²ºîÊ\u001c\u000f.\bjµÀnnÆ¶Ê";
                  var18 = "\u0016²ºîÊ\u001c\u000f.\bjµÀnnÆ¶Ê".length();
                  var15 = '\b';
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
