package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum w5 {
   public static final w5 W;
   private static final w5[] N;
   public static final w5 F;
   public static final w5 I;
   public static final w5 E;
   public static final w5 O;
   public static final w5 M;
   public static final w5 e;
   public static final w5 n;
   public static final w5 Y;
   public static final w5 S;
   public static final w5 o;
   public static final w5 l;
   public static final w5 s;
   private static String[] C;
   final int v;
   public static final w5 a;
   public static final w5 H;
   public static final w5 A;
   public static final w5 Q;
   public static final w5 r;
   private static final long b = ess.a(4397958185495691556L, -9144612840804231808L, MethodHandles.lookup().lookupClass()).a(70748883555436L);

   private w5(int var3) {
      this.v = var3;
   }

   static {
      long var20 = b ^ 44156568839190L;
      if (x44.a<"s">(4469134608938654692L, var20) != null) {
         x44.a<"s">(new String[2], 2398428555977087406L, var20);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[18];
      int var17 = 0;
      String var16 = "?@ tI\u00114Õè\ft}èÛÚKp6Tm_àK\u0096\u0010\u0014Ì¤\u0093åf?Gõ Oñ\u0002=Þ\u0003\b½e!Ýë@qR\u0018@P-á\u0082\u009aªÇn\u0091U\u008e\u009cl\u0014);g@ü\u0011\u0011b(\b\b\u001f\u009d^\u008fuv\u0004\u0010¡\u009f#l\\÷ÑsKt#ù\u0017\u001e[\u000e\u0010\u008eT`(\u008f\f:{©q\u000eè¥ïa\n\briy0·Ã°Æ\b\t/òY\u009cK\u008a>\bkF\u0081õ\u0089\u00853à\u0010O^;çÉòØ£«Õ\t\u0004)ÿ\u0001Ù\b\u0002}c\u0096\u009cùi2\u0010\u0010Å3\u0015TwZhXS\rk\u0002\u0098\u008f\u0016\bâm\u0089¿åì\u0003\u009e\u0010ÄÑÕà?\u000f\t\u0085JP7T\u009cAè_\bþ~º3¬)\u0090\u0087";
      int var18 = "?@ tI\u00114Õè\ft}èÛÚKp6Tm_àK\u0096\u0010\u0014Ì¤\u0093åf?Gõ Oñ\u0002=Þ\u0003\b½e!Ýë@qR\u0018@P-á\u0082\u009aªÇn\u0091U\u008e\u009cl\u0014);g@ü\u0011\u0011b(\b\b\u001f\u009d^\u008fuv\u0004\u0010¡\u009f#l\\÷ÑsKt#ù\u0017\u001e[\u000e\u0010\u008eT`(\u008f\f:{©q\u000eè¥ïa\n\briy0·Ã°Æ\b\t/òY\u009cK\u008a>\bkF\u0081õ\u0089\u00853à\u0010O^;çÉòØ£«Õ\t\u0004)ÿ\u0001Ù\b\u0002}c\u0096\u009cùi2\u0010\u0010Å3\u0015TwZhXS\rk\u0002\u0098\u008f\u0016\bâm\u0089¿åì\u0003\u009e\u0010ÄÑÕà?\u000f\t\u0085JP7T\u009cAè_\bþ~º3¬)\u0090\u0087"
         .length();
      char var15 = 24;
      int var24 = -1;

      label59:
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
                     long[] var0 = new long[28];
                     int var4 = 0;
                     String var5 = "\bQc¨»\u0084ç·\u0097×u[H8\u0099\"\u0002¦z ê«²\u0005\u0013â·\reO\u009f\n\u0099?|Nó/=l\u001b{*STj°\rõ'¡xÚ^þ9\u0017;\"\u0019p\u0005\u0017\b\u008cpªo_1\u0006\u0015HÕ®È>n\u001dJwæ\u0091\u001c\u0087¢wþ'ï²¤\u0014gÊ\u0011lU¼)\u0095Ú\u000b\u0010lÐ\u0097Õ1<QñÆÀ/\u0084~-\u0014\nÏ\u0003yäQ\u008aK\u009e9\trt\u0096cld\u000fjÙeq\tÓÌ\fØ&=uá¾«ùõ\u0081ð1l\u0000ì\u0093\u001bÒ$\u001d\u0087\nál½|cÉ\u001eS\u0011\u008e\u0014\u0083èà'Ü¾ýëi!X¯\u008aó\u0094\u0086éîÍÏ×\f(ÚéÊ¬0dm";
                     int var6 = "\bQc¨»\u0084ç·\u0097×u[H8\u0099\"\u0002¦z ê«²\u0005\u0013â·\reO\u009f\n\u0099?|Nó/=l\u001b{*STj°\rõ'¡xÚ^þ9\u0017;\"\u0019p\u0005\u0017\b\u008cpªo_1\u0006\u0015HÕ®È>n\u001dJwæ\u0091\u001c\u0087¢wþ'ï²¤\u0014gÊ\u0011lU¼)\u0095Ú\u000b\u0010lÐ\u0097Õ1<QñÆÀ/\u0084~-\u0014\nÏ\u0003yäQ\u008aK\u009e9\trt\u0096cld\u000fjÙeq\tÓÌ\fØ&=uá¾«ùõ\u0081ð1l\u0000ì\u0093\u001bÒ$\u001d\u0087\nál½|cÉ\u001eS\u0011\u008e\u0014\u0083èà'Ü¾ýëi!X¯\u008aó\u0094\u0086éîÍÏ×\f(ÚéÊ¬0dm"
                        .length();
                     byte var3 = 0;

                     label41:
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
                                    r = new w5(1);
                                    F = new w5(3);
                                    W = new w5(4);
                                    E = new w5(5);
                                    e = new w5((int)var0[11]);
                                    l = new w5((int)var0[16]);
                                    Q = new w5((int)var0[19]);
                                    n = new w5((int)var0[12]);
                                    H = new w5((int)var0[20]);
                                    Y = new w5((int)var0[25]);
                                    s = new w5((int)var0[6]);
                                    o = new w5((int)var0[13]);
                                    S = new w5((int)var0[14]);
                                    I = new w5((int)var0[0]);
                                    a = new w5((int)var0[26]);
                                    M = new w5((int)var0[8]);
                                    A = new w5((int)var0[5]);
                                    O = new w5(0);
                                    w5[] var29 = new w5[(int)var0[24]];
                                    var29[0] = x44.a<"j">(4435374055447961071L, var20);
                                    var29[1] = x44.a<"j">(2684244211182604623L, var20);
                                    var29[2] = x44.a<"j">(2686728723390655840L, var20);
                                    var29[3] = x44.a<"j">(4091517741714913495L, var20);
                                    var29[4] = x44.a<"j">(2675924353956311936L, var20);
                                    var29[5] = l;
                                    var29[(int)var0[1]] = x44.a<"j">(2480504256737325017L, var20);
                                    var29[(int)var0[4]] = x44.a<"j">(2374948754846639993L, var20);
                                    var29[(int)var0[17]] = x44.a<"j">(4559729276023263391L, var20);
                                    var29[(int)var0[23]] = x44.a<"j">(2670404398737819179L, var20);
                                    var29[(int)var0[22]] = x44.a<"j">(4359734749901140681L, var20);
                                    var29[(int)var0[3]] = x44.a<"j">(2691186731215788581L, var20);
                                    var29[(int)var0[9]] = x44.a<"j">(2419776355132184164L, var20);
                                    var29[(int)var0[2]] = x44.a<"j">(2389811671509679452L, var20);
                                    var29[(int)var0[15]] = x44.a<"j">(2477691784249059932L, var20);
                                    var29[(int)var0[27]] = x44.a<"j">(4575236865096852763L, var20);
                                    var29[(int)var0[7]] = x44.a<"j">(2360720573250252232L, var20);
                                    var29[(int)var0[18]] = x44.a<"j">(2547962609912589499L, var20);
                                    N = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label41;
                                 }

                                 var5 = "È\u009d\u0097\u0080\u000e,TÉb\u0017£ßê«\u0097\u008d";
                                 var6 = "È\u009d\u0097\u0080\u000e,TÉb\u0017£ßê«\u0097\u008d".length();
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
                     continue label59;
                  }

                  var16 = "S Kj9´\u000f\u009f\bËa\u009aQÍÞJ~";
                  var18 = "S Kj9´\u000f\u009f\bËa\u009aQÍÞJ~".length();
                  var15 = '\b';
                  var24 = -1;
            }

            var25 = var16.substring(++var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   public static String[] E() {
      return C;
   }

   public static void l(String[] var0) {
      C = var0;
   }

   public static w5[] H(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = b ^ var1;
      return (w5[])x44.a<"n">(-2596566263404991538L, var1).clone();
   }

   int l() {
      return this.v;
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
