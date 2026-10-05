package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum y4 {
   public static final y4 u;
   public static final y4 m;
   public static final y4 k;
   public static final y4 H;
   public static final y4 w;
   public static final y4 Y;
   public static final y4 Q;
   public static final y4 Z;
   public static final y4 h;
   public static final y4 f;
   private final boolean T;
   private static final y4[] F;
   public static final y4 U;
   public static final y4 o;
   private static final long a = ess.a(-2043706577062436118L, -1521734664910132156L, MethodHandles.lookup().lookupClass()).a(236213631154894L);

   public boolean U() {
      return this.T;
   }

   private y4() {
      this(false);
   }

   public static y4[] g(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (y4[])x44.a<"l">(-7796936369319072531L, var1).clone();
   }

   static {
      long var20 = a ^ 94081179844980L;
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
      String var16 = "ë½ÁðX{\u0001ßGÍ\u0010Êû¶pà\u0010¶À\u009c\u0006'\"U\u008cà³D\u0006èb\u001f«\u0010ëâD\u001f\u0007Íú¸mé_Fþ\b \u007f\u0010\b´\u0012ê\u0012³Eè\u0082\u0080Q\u0088\u001d`¥\u008e\u0010©¦\u0086lïÝ4¥wÌ\u0015ênðªD\u001013ûöñ´@ÁWÂx\u0087\u0088r\u007f\u0082\u0010\u0018Y\u0015ÈDÁ\u0010¥\u0091\u0080x\u000eë4]Z\u0010§Å·àP\u001a£èZ\u00901W\u0086Ö\u00125\b\u0099¤K÷\u0015Ê\u0083¹\u0010¯·ð«\u0094|ºK\u0016\u001d\u009c\"\u0016\u001cC$";
      int var18 = "ë½ÁðX{\u0001ßGÍ\u0010Êû¶pà\u0010¶À\u009c\u0006'\"U\u008cà³D\u0006èb\u001f«\u0010ëâD\u001f\u0007Íú¸mé_Fþ\b \u007f\u0010\b´\u0012ê\u0012³Eè\u0082\u0080Q\u0088\u001d`¥\u008e\u0010©¦\u0086lïÝ4¥wÌ\u0015ênðªD\u001013ûöñ´@ÁWÂx\u0087\u0088r\u007f\u0082\u0010\u0018Y\u0015ÈDÁ\u0010¥\u0091\u0080x\u000eë4]Z\u0010§Å·àP\u001a£èZ\u00901W\u0086Ö\u00125\b\u0099¤K÷\u0015Ê\u0083¹\u0010¯·ð«\u0094|ºK\u0016\u001d\u009c\"\u0016\u001cC$"
         .length();
      char var15 = 16;
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
                     long[] var0 = new long[13];
                     int var4 = 0;
                     String var5 = "àÍø?>\t®\u0007,9\u0016 \u0006\u008c\u0083í©\u0093YÂª\u009cÊ}ÅR\u0080é\u0016hê8é*ÝD\u0003-\u009f|¢ü\u009f}cR\u0007J\u0097Ì\u009d\u0010ÜÌú~ý8g\u008fÁÚòÙ\u0006Zª\u0094UAÇu{+BÌ×èÏ¯\u0084åO}¸sd\u0016";
                     int var6 = "àÍø?>\t®\u0007,9\u0016 \u0006\u008c\u0083í©\u0093YÂª\u009cÊ}ÅR\u0080é\u0016hê8é*ÝD\u0003-\u009f|¢ü\u009f}cR\u0007J\u0097Ì\u009d\u0010ÜÌú~ý8g\u008fÁÚòÙ\u0006Zª\u0094UAÇu{+BÌ×èÏ¯\u0084åO}¸sd\u0016"
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
                                    k = new y4();
                                    H = new y4();
                                    w = new y4();
                                    u = new y4(true);
                                    f = new y4(true);
                                    Z = new y4();
                                    Q = new y4();
                                    o = new y4(true);
                                    U = new y4(true);
                                    m = new y4();
                                    Y = new y4();
                                    h = new y4();
                                    y4[] var29 = new y4[(int)var0[1]];
                                    var29[0] = x44.a<"o">(1037277993587299775L, var20);
                                    var29[1] = x44.a<"o">(1440212023016238025L, var20);
                                    var29[2] = w;
                                    var29[3] = u;
                                    var29[4] = x44.a<"o">(847364352902281651L, var20);
                                    var29[5] = x44.a<"o">(1202964805671516873L, var20);
                                    var29[(int)var0[10]] = x44.a<"o">(876259688339924948L, var20);
                                    var29[(int)var0[6]] = x44.a<"o">(651079437888431472L, var20);
                                    var29[(int)var0[4]] = x44.a<"o">(1433016190965255959L, var20);
                                    var29[(int)var0[5]] = m;
                                    var29[(int)var0[11]] = x44.a<"o">(1641082439382116420L, var20);
                                    var29[(int)var0[9]] = h;
                                    F = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "xªZ\u008eq\" \u008c\n¤\u007fØÎñ\u00adG";
                                 var6 = "xªZ\u008eq\" \u008c\n¤\u007fØÎñ\u00adG".length();
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

                  var16 = "½]\u0085\u0097\u007fJ)¼\u0010Cö\u0082Ël\u008d\u0084)äIÃ\tn~Òr";
                  var18 = "½]\u0085\u0097\u007fJ)¼\u0010Cö\u0082Ël\u008d\u0084)äIÃ\tn~Òr".length();
                  var15 = '\b';
                  var24 = -1;
            }

            var25 = var16.substring(++var24, var24 + var15);
            var10001 = 0;
         }
      }
   }

   private y4(boolean var3) {
      this.T = var3;
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
