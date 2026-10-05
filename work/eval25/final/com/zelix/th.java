package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum th {
   public static final th Z;
   private static final th[] S;
   public static final th p;
   public static final th q;
   public static final th W;
   public static final th b;
   public static final th i;
   public static final th f;
   public static final th A;
   public static final th B;
   public static final th m;
   public static final th N;
   public static final th e;
   public static final th D;
   private static final long a = ess.a(-1977573293549204608L, -1020771921856235490L, MethodHandles.lookup().lookupClass()).a(79612685862924L);

   static {
      long var20 = a ^ 139625031003466L;
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
      String var16 = "\u008f\u009c¶vðã\u0003pV«\u0087dã\u00ad±Q\u001e{>TáOÃV\u0010~\u0010\u0016l\u008f¦fRë±j\u0099z77Õ\u0010\u0016\u0001\u008fq\u00850\u000b<\u007f5þÉ&±xÓ\u0010Wåûb§Ò)oE\u009aØ-*¹\u0094< X\u0004\u0003Ç9×\u000e\u0085\u0094ÙÄ\u0097ùô\u008e¯)\u0010Þ¯_\u001aKòtXè\u009fÃ\\\u008aä\u0010\u000e0\u0011\u008bk\u0005\u0084Ó\u0015RÌ7\u001fúN((\nÈâ\u0001\u008d×\u001e\u0015\u0003¶Ñn|úþ<ZèÌåKòÕè$\u0018Ä®F3\u0010ÍòhÞZR\u001aR\u0092 ÒEÒ?\u0011æ¹µìàa¢ïÈ\u008f\u0084\u0090\u0095ÒK\u001d'¾\u009f7ù»r¶üÖ¦\u0018\u0016\u0001\u008fq\u00850\u000b<\u0086x\\\u008füÚ`¨Üo°êÁaâ\u009f Åü\u009dH6\u0010aµ{ö\rió\rpR k¹\u000fôÞ«\u0015OàB\u0085\u0017ÜÃl\u0010\u001c\u001d\u000fO©y5éÕUoÿ\u0092]Cr";
      int var18 = "\u008f\u009c¶vðã\u0003pV«\u0087dã\u00ad±Q\u001e{>TáOÃV\u0010~\u0010\u0016l\u008f¦fRë±j\u0099z77Õ\u0010\u0016\u0001\u008fq\u00850\u000b<\u007f5þÉ&±xÓ\u0010Wåûb§Ò)oE\u009aØ-*¹\u0094< X\u0004\u0003Ç9×\u000e\u0085\u0094ÙÄ\u0097ùô\u008e¯)\u0010Þ¯_\u001aKòtXè\u009fÃ\\\u008aä\u0010\u000e0\u0011\u008bk\u0005\u0084Ó\u0015RÌ7\u001fúN((\nÈâ\u0001\u008d×\u001e\u0015\u0003¶Ñn|úþ<ZèÌåKòÕè$\u0018Ä®F3\u0010ÍòhÞZR\u001aR\u0092 ÒEÒ?\u0011æ¹µìàa¢ïÈ\u008f\u0084\u0090\u0095ÒK\u001d'¾\u009f7ù»r¶üÖ¦\u0018\u0016\u0001\u008fq\u00850\u000b<\u0086x\\\u008füÚ`¨Üo°êÁaâ\u009f Åü\u009dH6\u0010aµ{ö\rió\rpR k¹\u000fôÞ«\u0015OàB\u0085\u0017ÜÃl\u0010\u001c\u001d\u000fO©y5éÕUoÿ\u0092]Cr"
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
                     long[] var0 = new long[15];
                     int var4 = 0;
                     String var5 = "\u008fP¿ñ\u001c£\u0003¾¹µ\u0015T\u0015¡\fT¬Å]Þ2¼ù@²\u0080_ýBÚ¼KÇêG0t²\u0097}ãÛXÛ><\u0092ÿÜÝÐ\u0017w\u0017×¹\be¬Ù\u008d\r]¿\u0088N6B×\u0091¬Õõ\u001fÀ\u0006ÿ\u00ad\u0012\u0094»øqÄ\u0000\u0001óÇE\u009dcPÓ#\\×ýT\u0005èç\bJ\u008b";
                     int var6 = "\u008fP¿ñ\u001c£\u0003¾¹µ\u0015T\u0015¡\fT¬Å]Þ2¼ù@²\u0080_ýBÚ¼KÇêG0t²\u0097}ãÛXÛ><\u0092ÿÜÝÐ\u0017w\u0017×¹\be¬Ù\u008d\r]¿\u0088N6B×\u0091¬Õõ\u001fÀ\u0006ÿ\u00ad\u0012\u0094»øqÄ\u0000\u0001óÇE\u009dcPÓ#\\×ýT\u0005èç\bJ\u008b"
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
                                    N = new th();
                                    q = new th();
                                    e = new th();
                                    f = new th();
                                    p = new th();
                                    W = new th();
                                    B = new th();
                                    b = new th();
                                    D = new th();
                                    i = new th();
                                    m = new th();
                                    A = new th();
                                    Z = new th();
                                    th[] var29 = new th[(int)var0[12]];
                                    var29[0] = x44.a<"i">(-3511394773310989137L, var20);
                                    var29[1] = x44.a<"i">(-3980402623504957656L, var20);
                                    var29[2] = x44.a<"i">(-3977075950438637623L, var20);
                                    var29[3] = x44.a<"i">(-3496629944837908067L, var20);
                                    var29[4] = x44.a<"i">(-2947213938083930206L, var20);
                                    var29[5] = x44.a<"i">(-3859771422188072084L, var20);
                                    var29[(int)var0[11]] = x44.a<"i">(-3779539799021223436L, var20);
                                    var29[(int)var0[13]] = x44.a<"i">(-3047179614973637604L, var20);
                                    var29[(int)var0[9]] = x44.a<"i">(-3319636822304055055L, var20);
                                    var29[(int)var0[10]] = x44.a<"i">(-3876808058596763502L, var20);
                                    var29[(int)var0[6]] = x44.a<"i">(-2888452572785324309L, var20);
                                    var29[(int)var0[1]] = x44.a<"i">(-3836136166513799761L, var20);
                                    var29[(int)var0[3]] = x44.a<"i">(-3449379799736970366L, var20);
                                    S = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "Y&4\u0000\u0098t\u001dMá9\u0007\u001edæçT";
                                 var6 = "Y&4\u0000\u0098t\u001dMá9\u0007\u001edæçT".length();
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

                  var16 = "ãú!ïgØº \u0094\u000en¯óË\u009c¤\u0018Év¦\u0095,\u0003\u00953\u0084Å\u0080°9\u0001Kâ\u0094\u0011ºÀ\u0010\u001e\nè";
                  var18 = "ãú!ïgØº \u0094\u000en¯óË\u009c¤\u0018Év¦\u0095,\u0003\u00953\u0084Å\u0080°9\u0001Kâ\u0094\u0011ºÀ\u0010\u001e\nè".length();
                  var15 = 16;
                  var24 = -1;
            }

            var25 = var16.substring(++var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   public static th[] C(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (th[])x44.a<"i">(6822310309124840476L, var1).clone();
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
