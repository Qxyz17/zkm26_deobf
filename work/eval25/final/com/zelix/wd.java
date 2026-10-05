package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum wd {
   public static final wd T;
   public static final wd H;
   public static final wd a;
   public static final wd r;
   private final int l;
   public static final wd v;
   public static final wd k;
   public static final wd L;
   public static final wd M;
   public static final wd X;
   public static final wd e;
   public static final wd q;
   public static final wd h;
   private static final wd[] C;
   public static final wd I;
   public static final wd y;

   private wd(int var3) {
      this.l = var3;
   }

   public int k() {
      return this.l;
   }

   static {
      long var20 = ess.a(7280243638388342097L, 681677741304042158L, MethodHandles.lookup().lookupClass()).a(223148385665637L) ^ 6062582296353L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[14];
      int var17 = 0;
      String var16 = "\u009cÑ5ý«¼å\u008bJ\u0013\u0084h`\u009a*\u009fÉíi@\r÷\u0089Mþ\u0097\u009a\u00840\u0019E8\u0018\u009cÑ5ý«¼å\u008bD¯g\u0086dl\u0084êU\u001b\u0018pò!\u001f( \u009cÑ5ý«¼å\u008bâ\u0095³â5¬ô+ÏJÞ\u0080!\u000bgÑ\u0007ñì\u0006\r¬½%\u0018\u009cÑ5ý«¼å\u008bIdÍÏû\u0087SvmÆ`j\u000bªéð\u0018\u009cÑ5ý«¼å\u008b\u0007Ç\u0084²¤;5Z\u001cñ¸A!D\u0092k\u0018\u009cÑ5ý«¼å\u008b\u0007Ç\u0084²¤;5Z>\u001fº\u0016BÕ\u0097\u000e\u0018\u009cÑ5ý«¼å\u008bÝ\u0092ÞZÁ\u008bù´÷ßæ«\u000e\u0081ù¤ \u009cÑ5ý«¼å\u008bJ\u0013\u0084h`\u009a*\u009f©T,á\u0007åj8Ü'P?cÒçö\u0018\u009cÑ5ý«¼å\u008bJ\u0013\u0084h`\u009a*\u009f\u008cëhÎ\u008b\u0091\u0081â \u009cÑ5ý«¼å\u008b\u0006ìb½ZSÌ\u0001,iyüAÅ\u0089t\u009d\u0000_ñá®2¿ \u009cÑ5ý«¼å\u008bJ\u0013\u0084h`\u009a*\u009fÉíi@\r÷\u0089M¸{P\u0098\u000eúê(\u0018\u009cÑ5ý«¼å\u008bÈ·Se\u008f[À\u009eè\u009e\u0086XJ=¸s";
      int var18 = "\u009cÑ5ý«¼å\u008bJ\u0013\u0084h`\u009a*\u009fÉíi@\r÷\u0089Mþ\u0097\u009a\u00840\u0019E8\u0018\u009cÑ5ý«¼å\u008bD¯g\u0086dl\u0084êU\u001b\u0018pò!\u001f( \u009cÑ5ý«¼å\u008bâ\u0095³â5¬ô+ÏJÞ\u0080!\u000bgÑ\u0007ñì\u0006\r¬½%\u0018\u009cÑ5ý«¼å\u008bIdÍÏû\u0087SvmÆ`j\u000bªéð\u0018\u009cÑ5ý«¼å\u008b\u0007Ç\u0084²¤;5Z\u001cñ¸A!D\u0092k\u0018\u009cÑ5ý«¼å\u008b\u0007Ç\u0084²¤;5Z>\u001fº\u0016BÕ\u0097\u000e\u0018\u009cÑ5ý«¼å\u008bÝ\u0092ÞZÁ\u008bù´÷ßæ«\u000e\u0081ù¤ \u009cÑ5ý«¼å\u008bJ\u0013\u0084h`\u009a*\u009f©T,á\u0007åj8Ü'P?cÒçö\u0018\u009cÑ5ý«¼å\u008bJ\u0013\u0084h`\u009a*\u009f\u008cëhÎ\u008b\u0091\u0081â \u009cÑ5ý«¼å\u008b\u0006ìb½ZSÌ\u0001,iyüAÅ\u0089t\u009d\u0000_ñá®2¿ \u009cÑ5ý«¼å\u008bJ\u0013\u0084h`\u009a*\u009fÉíi@\r÷\u0089M¸{P\u0098\u000eúê(\u0018\u009cÑ5ý«¼å\u008bÈ·Se\u008f[À\u009eè\u009e\u0086XJ=¸s"
         .length();
      char var15 = ' ';
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
                     long[] var0 = new long[26];
                     int var4 = 0;
                     String var5 = "\u0094¿µ@m\u009cæ\u0016\u0003À\u0011\r°W\u0005@\u0013\tRh\b\u001b\u0007;¢µ\u0096EO/Uæ\u0002ÿµfï¶¸÷ß3[ïI9¢|\\BaÌ1Õ\u0007\u0004\u0082\u0083¡XåG\u0086å}ÿ+cm2¿èSÊ]`ËôCªú+b\u009e\u0000QèFÐ\u000f0]¯çD>\u0002QAðgPCUí2°GÓ\u009a\u0005CÞ¤H²PÎ-\u001c\u0004aèQI^éÎß\u0006nm{\u008cY\u008ez\u0098PÌ×è6\u0004µ÷Ðê6\u0096¿µ\u001f¤¸î^Ç»=·áîÊ\u0019°\u0086Vl^rñ\u008f¿¤±\t\u0012tÖÚ`³c,uÚ8ô>\u009e@";
                     int var6 = "\u0094¿µ@m\u009cæ\u0016\u0003À\u0011\r°W\u0005@\u0013\tRh\b\u001b\u0007;¢µ\u0096EO/Uæ\u0002ÿµfï¶¸÷ß3[ïI9¢|\\BaÌ1Õ\u0007\u0004\u0082\u0083¡XåG\u0086å}ÿ+cm2¿èSÊ]`ËôCªú+b\u009e\u0000QèFÐ\u000f0]¯çD>\u0002QAðgPCUí2°GÓ\u009a\u0005CÞ¤H²PÎ-\u001c\u0004aèQI^éÎß\u0006nm{\u008cY\u008ez\u0098PÌ×è6\u0004µ÷Ðê6\u0096¿µ\u001f¤¸î^Ç»=·áîÊ\u0019°\u0086Vl^rñ\u008f¿¤±\t\u0012tÖÚ`³c,uÚ8ô>\u009e@"
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
                                    M = new wd(0);
                                    a = new wd(1);
                                    e = new wd(2);
                                    I = new wd(4);
                                    T = new wd((int)var0[23]);
                                    X = new wd((int)var0[19]);
                                    h = new wd((int)var0[9]);
                                    k = new wd((int)var0[21]);
                                    L = new wd((int)var0[8]);
                                    r = new wd((int)var0[7]);
                                    H = new wd((int)var0[5]);
                                    y = new wd((int)var0[15]);
                                    v = new wd((int)var0[6]);
                                    q = new wd((int)var0[24]);
                                    wd[] var29 = new wd[(int)var0[4]];
                                    var29[0] = x44.a<"l">(1489429383047434433L, var20);
                                    var29[1] = x44.a<"l">(905871401515840674L, var20);
                                    var29[2] = e;
                                    var29[3] = x44.a<"l">(661665143876689438L, var20);
                                    var29[4] = T;
                                    var29[5] = x44.a<"l">(626801339722618049L, var20);
                                    var29[(int)var0[3]] = x44.a<"l">(1680007584237203480L, var20);
                                    var29[(int)var0[11]] = k;
                                    var29[(int)var0[16]] = L;
                                    var29[(int)var0[13]] = r;
                                    var29[(int)var0[14]] = x44.a<"l">(693655222908966681L, var20);
                                    var29[(int)var0[17]] = x44.a<"l">(1083599443921114748L, var20);
                                    var29[(int)var0[1]] = x44.a<"l">(635907602581099369L, var20);
                                    var29[(int)var0[22]] = x44.a<"l">(1386901295499476731L, var20);
                                    C = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "Å\u0017\u0017Ú\u0088v_\u0012`\u0096cSéKxè";
                                 var6 = "Å\u0017\u0017Ú\u0088v_\u0012`\u0096cSéKxè".length();
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

                  var16 = "\u009cÑ5ý«¼å\u008b·\u0003~4ûKâ8\u0018\u009cÑ5ý«¼å\u008b@l¬Dò\u0097Dµ\u001ae\u0093ìZ\u0007\u0082M";
                  var18 = "\u009cÑ5ý«¼å\u008b·\u0003~4ûKâ8\u0018\u009cÑ5ý«¼å\u008b@l¬Dò\u0097Dµ\u001ae\u0093ìZ\u0007\u0082M".length();
                  var15 = 16;
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
