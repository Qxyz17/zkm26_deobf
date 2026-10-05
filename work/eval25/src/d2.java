package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum d2 {
   public static final d2 v;
   public static final d2 R;
   public static final d2 s;
   public static final d2 i;
   public static final d2 p;
   public static final d2 L;
   public static final d2 h;
   public static final d2 d;
   public static final d2 Q;
   private static final d2[] j;
   public static final d2 I;
   public static final d2 n;
   public static final d2 k;
   private final int C;
   private static final long a = ess.a(-8031362386790488184L, 5580819211600817535L, MethodHandles.lookup().lookupClass()).a(107714379092965L);

   public int G(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, 6490185650767766761L, var2);
   }

   static {
      long var20 = a ^ 44253525253501L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[12];
      int var17 = 0;
      String var16 = "\u0007É½¸N\u0092wâ\u0088.LË¥ÌÜº\u009d\u008eyGK>ûé \u0007É½¸N\u0092wâ\u001fOI5\u0096Â¿ÃäZã`ÿk\u0095\fA\u0000j\u008f?^ ¥ \u0007É½¸N\u0092wâ ÏëÊNÏDÃzãr\u001fÑÍ\u008b_\u0094]Æµ\u0089ª\u0094E\u0018\u0007É½¸N\u0092wâY\u0003ÀÙ\u0003E&\u007fyH\u0019n\u0012\u0093ÿ?\u0018\u0007É½¸N\u0092wâ\u001fOI5\u0096Â¿Ã2\"Uòh¹ú\u009e\u0018\u0007É½¸N\u0092wâ\u001d\u00ad%æI %À³Þ\u0094\u008aF¢\u00182 \u0007É½¸N\u0092wâ#\u0006\u007fux\u0005\bÚ<~)3=ÿG\u0095?O)ÝÈ\u008eý¹ \u0007É½¸N\u0092wâ\u001fOI5\u0096Â¿Ã\u0002mÄ\ne®8Ð\u000eo\u001dÓ«[ÑÕ\u0018\u0007É½¸N\u0092wâXn|\u0093 \u0001ðGI\u001djÉ\u008f3o>\u0018\u0007É½¸N\u0092wâás\u0085\u0084Â\u001e\u00ad^ÍkÖ½°ôRr";
      int var18 = "\u0007É½¸N\u0092wâ\u0088.LË¥ÌÜº\u009d\u008eyGK>ûé \u0007É½¸N\u0092wâ\u001fOI5\u0096Â¿ÃäZã`ÿk\u0095\fA\u0000j\u008f?^ ¥ \u0007É½¸N\u0092wâ ÏëÊNÏDÃzãr\u001fÑÍ\u008b_\u0094]Æµ\u0089ª\u0094E\u0018\u0007É½¸N\u0092wâY\u0003ÀÙ\u0003E&\u007fyH\u0019n\u0012\u0093ÿ?\u0018\u0007É½¸N\u0092wâ\u001fOI5\u0096Â¿Ã2\"Uòh¹ú\u009e\u0018\u0007É½¸N\u0092wâ\u001d\u00ad%æI %À³Þ\u0094\u008aF¢\u00182 \u0007É½¸N\u0092wâ#\u0006\u007fux\u0005\bÚ<~)3=ÿG\u0095?O)ÝÈ\u008eý¹ \u0007É½¸N\u0092wâ\u001fOI5\u0096Â¿Ã\u0002mÄ\ne®8Ð\u000eo\u001dÓ«[ÑÕ\u0018\u0007É½¸N\u0092wâXn|\u0093 \u0001ðGI\u001djÉ\u008f3o>\u0018\u0007É½¸N\u0092wâás\u0085\u0084Â\u001e\u00ad^ÍkÖ½°ôRr"
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
                     long[] var0 = new long[25];
                     int var4 = 0;
                     String var5 = "v¡AÄ³Rß\u00adÍ\u001d8\u0012¡8\u008bà\u009eø&\u009dÃ«\u0017\u0003ü\u0090\u0002ªÛ´\u0002¯£ÙÉz»¹CiJÐë±\u009däùÅa\u001aÃó\u0083æ§Á\u0011\u008aå\u0002\u0080«hUh½þ\u0093y¢\u0090îÝ¦\u0012û\u0086¢I\u0082Ø\u008bfZ\u0011Ð#»\u0016¾Ã[\u0002_ üqyïÇB\u0013\u000e\u009eÀ\u008fÂû\u0006\t\u0097®ï¤\u0091®åÓçy6R\u009föàáu?`6Ã\u0017\u0006lêI'ÿúù/ÚMbñ\u001f\"§ð¦\u001b\u0082þ\u001bå6â\u009e%H\u0010^:ouQ\u0090ç\u0017(®\"\u0010\u009cñë0+ï×\u0096ýÕÍ";
                     int var6 = "v¡AÄ³Rß\u00adÍ\u001d8\u0012¡8\u008bà\u009eø&\u009dÃ«\u0017\u0003ü\u0090\u0002ªÛ´\u0002¯£ÙÉz»¹CiJÐë±\u009däùÅa\u001aÃó\u0083æ§Á\u0011\u008aå\u0002\u0080«hUh½þ\u0093y¢\u0090îÝ¦\u0012û\u0086¢I\u0082Ø\u008bfZ\u0011Ð#»\u0016¾Ã[\u0002_ üqyïÇB\u0013\u000e\u009eÀ\u008fÂû\u0006\t\u0097®ï¤\u0091®åÓçy6R\u009föàáu?`6Ã\u0017\u0006lêI'ÿúù/ÚMbñ\u001f\"§ð¦\u001b\u0082þ\u001bå6â\u009e%H\u0010^:ouQ\u0090ç\u0017(®\"\u0010\u009cñë0+ï×\u0096ýÕÍ"
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
                                    s = new d2((int)var0[16]);
                                    h = new d2((int)var0[20]);
                                    i = new d2((int)var0[0]);
                                    p = new d2((int)var0[3]);
                                    d = new d2((int)var0[8]);
                                    v = new d2((int)var0[9]);
                                    R = new d2((int)var0[2]);
                                    I = new d2((int)var0[11]);
                                    L = new d2((int)var0[22]);
                                    n = new d2((int)var0[13]);
                                    Q = new d2((int)var0[17]);
                                    k = new d2((int)var0[6]);
                                    d2[] var29 = new d2[(int)var0[4]];
                                    var29[0] = x44.a<"k">(-1987073692253791751L, var20);
                                    var29[1] = x44.a<"k">(-2298411433986467968L, var20);
                                    var29[2] = x44.a<"k">(-363115657340556555L, var20);
                                    var29[3] = x44.a<"k">(-2186518271623105548L, var20);
                                    var29[4] = x44.a<"k">(-1980254104380827697L, var20);
                                    var29[5] = x44.a<"k">(-2235989336889507392L, var20);
                                    var29[(int)var0[19]] = x44.a<"k">(-2119784017531022544L, var20);
                                    var29[(int)var0[15]] = x44.a<"k">(-254433014032009659L, var20);
                                    var29[(int)var0[7]] = x44.a<"k">(-2266098763503745406L, var20);
                                    var29[(int)var0[14]] = x44.a<"k">(-5856241944743040L, var20);
                                    var29[(int)var0[12]] = x44.a<"k">(-17221080830086297L, var20);
                                    var29[(int)var0[23]] = x44.a<"k">(-258525926177078249L, var20);
                                    j = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "®\u0003Ã±xn6þ3ò6{TR\u0015\u0084";
                                 var6 = "®\u0003Ã±xn6þ3ò6{TR\u0015\u0084".length();
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

                  var16 = "\u0007É½¸N\u0092wâ\u001fOI5\u0096Â¿Ã\u0002mÄ\ne®8Ð{¤\\]ï\u0003Rü\u0018\u0007É½¸N\u0092wâÐM`/)-\u009e\u0082\u000eÂH\u007fÿ½ò\u001c";
                  var18 = "\u0007É½¸N\u0092wâ\u001fOI5\u0096Â¿Ã\u0002mÄ\ne®8Ð{¤\\]ï\u0003Rü\u0018\u0007É½¸N\u0092wâÐM`/)-\u009e\u0082\u000eÂH\u007fÿ½ò\u001c"
                     .length();
                  var15 = ' ';
                  var24 = -1;
            }

            var25 = var16.substring(++var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   private d2(int var3) {
      this.C = var3;
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
