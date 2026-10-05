package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class h2 extends h8 {
   static final wp o;
   static final wp O;
   static final wp G;
   static final wp T;
   private int J;
   private static final long a = ess.a(3877467836307509946L, -8510058236648792248L, MethodHandles.lookup().lookupClass()).a(30035791686093L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static boolean v(int var0, int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = x44.a<"s">(2468779179058401832L, var4);

      try {
         int var10000 = var0 & 2;
         if (!var6) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var7) {
         throw x44.a<"s">(var7, 4595944709840566019L, var4);
      }

      return (boolean)0;
   }

   public static int z(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      var3 &= b<"j">(20034, 4256573208295466173L ^ var1);
      return var3 | 4;
   }

   public static boolean u(int var0, long var1) {
      var1 = a ^ var1;
      boolean var3 = x44.a<"r">(-8370898683507982448L, var1);

      try {
         int var10000 = var0 & b<"j">(9565, 8173303733351498660L ^ var1);
         if (var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"r">(var4, -8419139463441005598L, var1);
      }

      return (boolean)0;
   }

   public static boolean f(int var0, int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      boolean var6 = x44.a<"p">(-3343426040502427149L, var4);

      try {
         int var10000 = var0 & b<"j">(24037, 2398986010424146997L ^ var4);
         if (!var6) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var7) {
         throw x44.a<"p">(var7, -3741632076587858728L, var4);
      }

      return (boolean)0;
   }

   public static boolean z(long var0, int var2) {
      var0 = a ^ var0;
      boolean var3 = x44.a<"v">(-4582551331405041651L, var0);

      try {
         int var10000 = var2 & b<"j">(7783, 1701698071785025098L ^ var0);
         if (!var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"v">(var4, -2455219229980224218L, var0);
      }

      return (boolean)0;
   }

   public static int P(Object[] var0) {
      long var2 = (Long)var0[0];
      int var1 = (Integer)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 99534454163025L;
      Object[] var10004 = new Object[]{null, null, var4};
      var10004[1] = true;
      var10004[0] = var1;
      return x44.a<"t">(var10004, 6024460633583530801L, var2);
   }

   static {
      long var11 = a ^ 90726650290022L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[19];
      int var18 = 0;
      String var17 = "~\u0089]XÐ0»`ïíf2¼3åÊ\u0010ÕÃgÏmB\u0089uñmJäÚ\u0090üÖ\u0018Z¢îÄÐ\u009d@¤yå[DIz\u0090^\u008eÀ&\u0018¸e\u000b3\u0010ÆO<õÎ\nC¼¢¢ä\n\u001bx\u0019_ §\u008boâR¬ò\u009d:\u0092ókö\u0091Mäò\u008d\u009eÙÎôgb²\u0083(Í\u0083a\u008eþ DyÍÆ¿ö\u0098\u000f?\u0091\t@!<úì/\u0097v\u008am\u0000\u008c\u0086¹E\u0004sçÐôE \u0010H\u001bÛ\u0013\u001bðy\u0098ý*©÷\u0006ÎÙ\u0001\u001b+Óg \u001a7»ò\u0083©Â®ïW\u0018ir\u0000\u008a\u0088Úh\u0014Ø\u0085*\u0011.n.\u008fêkð¥²Õ©Z\u0010\u001bl\u008bü\u0013i^æ\u0017&x\\\u0080\u009dÚÛ\u0018\u0011ù0¹\u0017\u009dñr\u009c\u0090îÖ¼\u0085c\u007f½^%\u0016\u009f\u001a\tH (ÀÕ\u0095\u000f\u0017îè\u009e6ÔM&\u009cÓß\u0002\u0092¤~Ò\u0085êû\u0013m uB3\u008fT\u0010Ý&sÿ\u009bTyUw\b\u0011ÇE\u009fñ\u001f\u0018oaÂ\u0081ü\u0083\u009cpÖJ\"ØnÙNÈ\u008c\u0097\u001cn\u009a\u0014\u0087\u007f\u0010 ,ñãaQ\u0019\u001e/úíLG_\u009b^\u0010\u0012Ý\u009eý<ø#0Æ\u0094àD\u0010KT)\u0010óau-\u009cîQ9\u009e\u0099\u0018\u0080X]ÜK\u0010ô&]é´§nÇÕ6nêðB)(";
      int var19 = "~\u0089]XÐ0»`ïíf2¼3åÊ\u0010ÕÃgÏmB\u0089uñmJäÚ\u0090üÖ\u0018Z¢îÄÐ\u009d@¤yå[DIz\u0090^\u008eÀ&\u0018¸e\u000b3\u0010ÆO<õÎ\nC¼¢¢ä\n\u001bx\u0019_ §\u008boâR¬ò\u009d:\u0092ókö\u0091Mäò\u008d\u009eÙÎôgb²\u0083(Í\u0083a\u008eþ DyÍÆ¿ö\u0098\u000f?\u0091\t@!<úì/\u0097v\u008am\u0000\u008c\u0086¹E\u0004sçÐôE \u0010H\u001bÛ\u0013\u001bðy\u0098ý*©÷\u0006ÎÙ\u0001\u001b+Óg \u001a7»ò\u0083©Â®ïW\u0018ir\u0000\u008a\u0088Úh\u0014Ø\u0085*\u0011.n.\u008fêkð¥²Õ©Z\u0010\u001bl\u008bü\u0013i^æ\u0017&x\\\u0080\u009dÚÛ\u0018\u0011ù0¹\u0017\u009dñr\u009c\u0090îÖ¼\u0085c\u007f½^%\u0016\u009f\u001a\tH (ÀÕ\u0095\u000f\u0017îè\u009e6ÔM&\u009cÓß\u0002\u0092¤~Ò\u0085êû\u0013m uB3\u008fT\u0010Ý&sÿ\u009bTyUw\b\u0011ÇE\u009fñ\u001f\u0018oaÂ\u0081ü\u0083\u009cpÖJ\"ØnÙNÈ\u008c\u0097\u001cn\u009a\u0014\u0087\u007f\u0010 ,ñãaQ\u0019\u001e/úíLG_\u009b^\u0010\u0012Ý\u009eý<ø#0Æ\u0094àD\u0010KT)\u0010óau-\u009cîQ9\u009e\u0099\u0018\u0080X]ÜK\u0010ô&]é´§nÇÕ6nêðB)("
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[19];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[40];
                     int var3 = 0;
                     String var4 = ":\u000f>\u001dOË°ÑÛ\u0014mÐk³Ïø\u0016ÇjHN\u0083jl\u0095\u0002èH\u0083nuZ°\u0015V\u0083ý\u0084ZÕ\u0099\u0087\u0097ÎÓ\u000f.Ë÷aâR\u0086Ð}a¿x@\u0012jÆxÕ(¬\u009cC\u0081¼.% ±\u0099é\u0000Â\u0088¦\u009f¦\u0096\u0088\u009eëü z#ì\u008bæ3Ò5Ãâ?ì\u0016\bü¿\u0086\u009f\f\u0000\u00804çj\u0080H\u008a\u0093Ss>EjÔ¶\u009bkRÞ¨*\u0080Q4ÁFÞ»!lÞî\u0013Ú\u007f} \u009atB\u009c\u009a¹ß£LÈ\u009c\u0007\u000f´Udç\u009a\u0016ML\u009e\u0087És\u0080ÅvëÝ& ·ÿ?k¥\u0004x\u0084'ÕM{\u008b§ãÃ\u009dô\u0098\u0092+Í\u0006=j\u007f\u009bé¬±ÛvÅH\u0001\u0013°tÎ¸\u008b;Í\u00adó)N$¦¸\u001b\u0098\u0089\u0098\\z§-ôåÊ\u0003\u0099\u001bÚ->À5w~JÊ×KWL¹ópïÊ\u008bK\u0099\u001e\u0019\u0014ðç\njeÎ\u0093\u0018PDrL<|\u001aª¸ Ñn\u0015â÷\u00121·üÔp\u0012\u0099è\u0004\u008eÓ\u0094\u001e\u0085\u0094";
                     int var5 = ":\u000f>\u001dOË°ÑÛ\u0014mÐk³Ïø\u0016ÇjHN\u0083jl\u0095\u0002èH\u0083nuZ°\u0015V\u0083ý\u0084ZÕ\u0099\u0087\u0097ÎÓ\u000f.Ë÷aâR\u0086Ð}a¿x@\u0012jÆxÕ(¬\u009cC\u0081¼.% ±\u0099é\u0000Â\u0088¦\u009f¦\u0096\u0088\u009eëü z#ì\u008bæ3Ò5Ãâ?ì\u0016\bü¿\u0086\u009f\f\u0000\u00804çj\u0080H\u008a\u0093Ss>EjÔ¶\u009bkRÞ¨*\u0080Q4ÁFÞ»!lÞî\u0013Ú\u007f} \u009atB\u009c\u009a¹ß£LÈ\u009c\u0007\u000f´Udç\u009a\u0016ML\u009e\u0087És\u0080ÅvëÝ& ·ÿ?k¥\u0004x\u0084'ÕM{\u008b§ãÃ\u009dô\u0098\u0092+Í\u0006=j\u007f\u009bé¬±ÛvÅH\u0001\u0013°tÎ¸\u008b;Í\u00adó)N$¦¸\u001b\u0098\u0089\u0098\\z§-ôåÊ\u0003\u0099\u001bÚ->À5w~JÊ×KWL¹ópïÊ\u008bK\u0099\u001e\u0019\u0014ðç\njeÎ\u0093\u0018PDrL<|\u001aª¸ Ñn\u0015â÷\u00121·üÔp\u0012\u0099è\u0004\u008eÓ\u0094\u001e\u0085\u0094"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
                           byte[] var10 = var0.doFinal(
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
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    e = var6;
                                    f = new Integer[40];
                                    o = new wp(1);
                                    T = new wp(2);
                                    G = new wp(3);
                                    O = new wp(4);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "õN/\u008ay :Uk£ØãwR\u008a´";
                                 var5 = "õN/\u008ay :Uk£ØãwR\u008a´".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "\u008dÇ§á1q@Á\u0088\u0099\u0086\u009e¡*U£\u0010\u0004lI\u0003ú\u0001æ¥ñ\u008bC¸J\u0018\u00adà";
                  var19 = "\u008dÇ§á1q@Á\u0088\u0099\u0086\u009e¡*U£\u0010\u0004lI\u0003ú\u0001æ¥ñ\u008bC¸J\u0018\u00adà".length();
                  var16 = 16;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
   }

   public final void O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 26675503382428L;
      int var10001 = this.J;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var10001;
      this.J = x44.a<"q">(var10004, 8503218238319306268L, var2);
   }

   public final boolean k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 71906707446653L;
      return K(this.J, var4);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int W(Object[] var0) {
      int var2 = (Integer)var0[0];
      byte var1 = (Boolean)var0[1];
      long var3 = (Long)var0[2];
      var3 = a ^ var3;
      byte var5 = x44.a<"s">(5396992936863956641L, var3);

      label46: {
         try {
            if (var5 != 0) {
               return var1;
            }

            if (var1 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"s">(var8, 5339117170880774867L, var3);
         }

         var2 |= b<"j">(18140, 2564543221695897886L ^ var3);

         try {
            if (var3 < 0L) {
               return var5;
            }

            if (var5 == 0) {
               return var2;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"s">(var7, 5339117170880774867L, var3);
         }
      }

      int var10000;
      try {
         var10000 = var2 & b<"j">(18509, 2056183520725036978L ^ var3);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"s">(var6, 5339117170880774867L, var3);
      }

      return var10000;
   }

   public static boolean H(long var0, int var2) {
      var0 = a ^ var0;
      boolean var3 = x44.a<"u">(-2374538817620284593L, var0);

      try {
         int var10000 = var2 & b<"j">(22695, 827376382949485208L ^ var0);
         if (var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"u">(var4, -2308566247995533507L, var0);
      }

      return (boolean)0;
   }

   public final boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 107972770478395L;
      Object[] var10003 = new Object[]{null, this.J};
      var10003[0] = var4;
      return x44.a<"v">(var10003, 1603390284167180320L, var2);
   }

   public final boolean t(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 95228437550447L;
      return s(this.J, var4);
   }

   public final void f(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 25061715836998L;
      int var10001 = this.J;
      Object[] var10005 = new Object[]{null, null, var2};
      var10005[1] = var5;
      var10005[0] = var10001;
      this.J = x44.a<"t">(var10005, -1439014838516057825L, var3);
   }

   public final boolean S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 126146136443471L;
      int var4 = (int)((var2 ^ 126146136443471L) >>> 32);
      int var5 = (int)((var2 ^ 126146136443471L) << 32 >>> 40);
      int var6 = (int)(var10001 << 56 >>> 56);
      int var10000 = this.J;
      Object[] var10005 = new Object[]{null, null, null, Integer.valueOf((byte)var6)};
      var10005[2] = var5;
      var10005[1] = var4;
      var10005[0] = var10000;
      return x44.a<"w">(var10005, -4889117867995765013L, var2);
   }

   void o(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.J = var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int s(Object[] var0) {
      int var4 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      byte var3 = (Boolean)var0[2];
      var1 = a ^ var1;
      byte var5 = x44.a<"r">(2061386248322690289L, var1);

      label46: {
         try {
            if (var5 == 0) {
               return var3;
            }

            if (var3 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"r">(var8, 76927428579019226L, var1);
         }

         var4 |= b<"j">(23478, 6582033374465505141L ^ var1);

         try {
            if (var1 < 0L) {
               return var5;
            }

            if (var5 != 0) {
               return var4;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"r">(var7, 76927428579019226L, var1);
         }
      }

      int var10000;
      try {
         var10000 = var4 & b<"j">(17554, 5526750726514452576L ^ var1);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"r">(var6, 76927428579019226L, var1);
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int v(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      byte var4 = (Boolean)var0[2];
      var1 = a ^ var1;
      byte var5 = x44.a<"v">(3938289082783893197L, var1);

      label46: {
         try {
            if (var5 == 0) {
               return var4;
            }

            if (var4 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"v">(var8, 3111235034899276774L, var1);
         }

         var3 |= b<"j">(27166, 8827062600475225327L ^ var1);

         try {
            if (var1 <= 0L) {
               return var5;
            }

            if (var5 != 0) {
               return var3;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"v">(var7, 3111235034899276774L, var1);
         }
      }

      int var10000;
      try {
         var10000 = var3 & b<"j">(17413, 5548248544118997731L ^ var1);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"v">(var6, 3111235034899276774L, var1);
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int Y(Object[] var0) {
      long var3 = (Long)var0[0];
      int var1 = (Integer)var0[1];
      byte var2 = (Boolean)var0[2];
      var3 = a ^ var3;
      byte var5 = x44.a<"s">(-917118039308712191L, var3);

      label46: {
         try {
            if (var5 != 0) {
               return var2;
            }

            if (var2 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"s">(var8, -884925730306245773L, var3);
         }

         var1 |= b<"j">(30089, 8010031264256289780L ^ var3);

         try {
            if (var3 <= 0L) {
               return var5;
            }

            if (var5 == 0) {
               return var1;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"s">(var7, -884925730306245773L, var3);
         }
      }

      int var10000;
      try {
         var10000 = var1 & b<"j">(22235, 578724532111001778L ^ var3);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"s">(var6, -884925730306245773L, var3);
      }

      return var10000;
   }

   public static boolean R(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      boolean var4 = x44.a<"q">(7624503687912381835L, var1);

      try {
         int var10000 = var3 & b<"j">(16826, 7351941211711128900L ^ var1);
         if (var4) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, 7580137654335087097L, var1);
      }

      return (boolean)0;
   }

   public static boolean m(long var0, int var2) {
      var0 = a ^ var0;
      boolean var3 = x44.a<"q">(-8550084052657062637L, var0);

      try {
         int var10000 = var2 & 1;
         if (var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"q">(var4, -8526900249653132959L, var0);
      }

      return (boolean)0;
   }

   public final void q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 108878783662561L;
      int var10001 = this.J;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var10001;
      this.J = x44.a<"v">(var10004, -4487869673411284003L, var2);
   }

   public static boolean x(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      boolean var4 = x44.a<"v">(-5967008640382297740L, var1);

      try {
         int var10000 = var3 & b<"j">(30589, 62763386990245731L ^ var1);
         if (var4) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"v">(var5, -5922989983994780410L, var1);
      }

      return (boolean)0;
   }

   public static int B(Object[] var0) {
      int var1 = (Integer)var0[0];
      return var1 | 4;
   }

   public final void M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 123616008729045L;
      int var10001 = this.J;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var10001;
      this.J = x44.a<"s">(var10004, -1303357950494944221L, var2);
   }

   public static int k(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 130339716496884L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var4;
      var10004[0] = var3;
      return x44.a<"u">(var10004, -4582901768704249911L, var1);
   }

   public final int n() {
      return this.J;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int R(Object[] var0) {
      long var2 = (Long)var0[0];
      int var1 = (Integer)var0[1];
      byte var4 = (Boolean)var0[2];
      var2 = a ^ var2;
      byte var5 = x44.a<"s">(2286286163910143952L, var2);

      label46: {
         try {
            if (var5 == 0) {
               return var4;
            }

            if (var4 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"s">(var8, 157709475468856059L, var2);
         }

         var1 |= b<"j">(9648, 5976881998282213984L ^ var2);

         try {
            if (var2 <= 0L) {
               return var5;
            }

            if (var5 != 0) {
               return var1;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"s">(var7, 157709475468856059L, var2);
         }
      }

      int var10000;
      try {
         var10000 = var1 & b<"j">(17498, 7730099993715911584L ^ var2);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"s">(var6, 157709475468856059L, var2);
      }

      return var10000;
   }

   public static boolean e(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      boolean var4 = x44.a<"q">(-3819099497726542149L, var1);

      try {
         int var10000 = var3 & b<"j">(22993, 6656732427496455694L ^ var1);
         if (var4) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, -3890415727903374647L, var1);
      }

      return (boolean)0;
   }

   public final boolean E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 60060208445772L;
      Object[] var10003 = new Object[]{null, this.J};
      var10003[0] = var4;
      return x44.a<"v">(var10003, 5777013230761697629L, var2);
   }

   public static boolean U(long var0, int var2) {
      var0 = a ^ var0;
      boolean var3 = x44.a<"p">(7912541789163575690L, var0);

      try {
         int var10000 = var2 & 4;
         if (var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"p">(var4, 7868734582338594296L, var0);
      }

      return (boolean)0;
   }

   public static int u(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      return var3 & b<"j">(20034, 4256600899145691492L ^ var1);
   }

   public static boolean s(int var0, long var1) {
      var1 = a ^ var1;
      boolean var3 = x44.a<"s">(8477460059626226145L, var1);

      try {
         int var10000 = var0 & b<"j">(15604, 5326591399834428514L ^ var1);
         if (var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"s">(var4, 8455613570070986131L, var1);
      }

      return (boolean)0;
   }

   public final void i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 99550719452067L;
      int var10001 = this.J;
      Object[] var10004 = new Object[]{null, var4};
      var10004[0] = var10001;
      this.J = x44.a<"r">(var10004, 1112043377403604651L, var2);
   }

   public final boolean u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 69294238657422L;
      return G(var4, this.J);
   }

   public final boolean H(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 23411426336392L;
      return x44.a<"r">(var4, this.J, -7072880206316118468L, var2);
   }

   public h2(h8 var1) {
      super(var1);
      this.J = 0;
   }

   int F(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/h2.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 104488622790200
      // 17: lxor
      // 18: dup2
      // 19: bipush 48
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 16
      // 22: lshl
      // 23: bipush 32
      // 25: lushr
      // 26: l2i
      // 27: istore 5
      // 29: dup2
      // 2a: bipush 48
      // 2c: lshl
      // 2d: bipush 48
      // 2f: lushr
      // 30: l2i
      // 31: istore 6
      // 33: pop2
      // 34: dup2
      // 35: ldc2_w 82928836232370
      // 38: lxor
      // 39: lstore 7
      // 3b: dup2
      // 3c: ldc2_w 20910867711228
      // 3f: lxor
      // 40: lstore 9
      // 42: pop2
      // 43: ldc2_w 1583228804502332818
      // 46: lload 2
      // 47: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: istore 11
      // 4e: aload 0
      // 4f: lload 9
      // 51: invokevirtual com/zelix/h2.F (J)Z
      // 54: iload 11
      // 56: ifeq 7b
      // 59: ifeq 75
      // 5c: goto 69
      // 5f: ldc2_w 608563176846311609
      // 62: lload 2
      // 63: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: bipush 4
      // 6a: ireturn
      // 6b: ldc2_w 608563176846311609
      // 6e: lload 2
      // 6f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 0
      // 76: lload 7
      // 78: invokevirtual com/zelix/h2.l (J)Z
      // 7b: iload 11
      // 7d: lload 2
      // 7e: lconst_0
      // 7f: lcmp
      // 80: iflt b0
      // 83: ifeq ae
      // 86: ifeq a2
      // 89: goto 96
      // 8c: ldc2_w 608563176846311609
      // 8f: lload 2
      // 90: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: bipush 3
      // 97: ireturn
      // 98: ldc2_w 608563176846311609
      // 9b: lload 2
      // 9c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: athrow
      // a2: aload 0
      // a3: iload 4
      // a5: i2s
      // a6: iload 5
      // a8: iload 6
      // aa: i2c
      // ab: invokevirtual com/zelix/h2.T (SIC)Z
      // ae: iload 11
      // b0: ifeq d0
      // b3: ifeq cf
      // b6: goto c3
      // b9: ldc2_w 608563176846311609
      // bc: lload 2
      // bd: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: athrow
      // c3: bipush 1
      // c4: ireturn
      // c5: ldc2_w 608563176846311609
      // c8: lload 2
      // c9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: athrow
      // cf: bipush 2
      // d0: ireturn
   }

   public Object clone() {
      return new h2(this.x(), this.J);
   }

   public final String h(boolean var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 33783465785557L;
      long var6 = var2 ^ 54029727265688L;
      return M(this.J, this.P(var4), var6, var1);
   }

   public h2(h8 var1, int var2) {
      super(var1);
      this.J = var2;
   }

   public final boolean l(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 30760430084595L;
      return U(var3, this.J);
   }

   public static int x(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 136892142771948L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var4;
      var10004[0] = var3;
      return x44.a<"p">(var10004, 4382453397062846858L, var1);
   }

   h2(h8 var1, _xx var2) {
      super(var1);
      this.J = var2.readUnsignedShort();
   }

   public final void a(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = (Boolean)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 24203130428228L;
      int var10002 = this.J;
      Object[] var10005 = new Object[]{null, null, var4};
      var10005[1] = var10002;
      var10005[0] = var5;
      this.J = x44.a<"w">(var10005, -8242544984550312355L, var2);
   }

   public static int a(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 113144415784051L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var4;
      var10004[0] = var1;
      return x44.a<"q">(var10004, 6931857368005637418L, var2);
   }

   public static boolean b(Object[] var0) {
      int var3 = (Integer)var0[0];
      int var4 = (Integer)var0[1];
      int var2 = (Integer)var0[2];
      int var1 = (Integer)var0[3];
      long var5 = ((long)var4 << 32 | (long)var2 << 40 >>> 32 | (long)var1 << 56 >>> 56) ^ a;
      boolean var7 = x44.a<"t">(-1719533904699990938L, var5);

      try {
         int var10000 = var3 & b<"j">(9258, 6441458631442243875L ^ var5);
         if (var7) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var8) {
         throw x44.a<"t">(var8, -1666508084257415148L, var5);
      }

      return (boolean)0;
   }

   public static boolean D(Object[] var0) {
      long var2 = (Long)var0[0];
      int var1 = (Integer)var0[1];
      var2 = a ^ var2;
      boolean var4 = x44.a<"t">(5342849356464880207L, var2);

      try {
         int var10000 = var1 & b<"j">(16826, 7351857536592968665L ^ var2);
         if (!var4) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"t">(var5, 6318361054586511204L, var2);
      }

      return (boolean)0;
   }

   public static int e(Object[] var0) {
      long var2 = (Long)var0[0];
      int var1 = (Integer)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 47952231531563L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var4;
      var10004[0] = var1;
      return x44.a<"r">(var10004, 3396866922186734954L, var2);
   }

   public final void g(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 77273548804467L;
      int var10001 = this.J;
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = var2;
      var10005[0] = var10001;
      this.J = x44.a<"q">(var10005, -5533142956694943544L, var3);
   }

   public final void s(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = (Boolean)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 40290079161501L;
      int var10001 = this.J;
      Object[] var10005 = new Object[]{null, null, var5};
      var10005[1] = var4;
      var10005[0] = var10001;
      this.J = x44.a<"p">(var10005, -1442426248740977578L, var2);
   }

   public final void l(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = (Boolean)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 63321891710669L;
      int var10002 = this.J;
      Object[] var10005 = new Object[]{null, null, var4};
      var10005[1] = var10002;
      var10005[0] = var5;
      this.J = x44.a<"r">(var10005, -2012635875183109865L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int X(Object[] var0) {
      int var3 = (Integer)var0[0];
      byte var4 = (Boolean)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;
      byte var5 = x44.a<"v">(-4892924074433738660L, var1);

      label46: {
         try {
            if (var5 != 0) {
               return var4;
            }

            if (var4 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"v">(var8, -4835329130038594514L, var1);
         }

         var3 |= b<"j">(17460, 2022634833083176208L ^ var1);

         try {
            if (var1 <= 0L) {
               return var5;
            }

            if (var5 == 0) {
               return var3;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"v">(var7, -4835329130038594514L, var1);
         }
      }

      int var10000;
      try {
         var10000 = var3 & b<"j">(15151, 3892077740008466965L ^ var1);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"v">(var6, -4835329130038594514L, var1);
      }

      return var10000;
   }

   public static boolean K(int var0, long var1) {
      var1 = a ^ var1;
      boolean var3 = x44.a<"r">(-8046665168340212720L, var1);

      try {
         int var10000 = var0 & b<"j">(12793, 2674553242312887435L ^ var1);
         if (var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"r">(var4, -8022843784657479582L, var1);
      }

      return (boolean)0;
   }

   public final boolean W(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 95206838466934L;
      int var10000 = this.J;
      Object[] var10003 = new Object[]{null, var4};
      var10003[0] = var10000;
      return x44.a<"r">(var10003, -6325504510962066586L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int d(Object[] var0) {
      long var2 = (Long)var0[0];
      int var1 = (Integer)var0[1];
      byte var4 = (Boolean)var0[2];
      var2 = a ^ var2;
      byte var5 = x44.a<"w">(749503014026033676L, var2);

      label46: {
         try {
            if (var5 == 0) {
               return var4;
            }

            if (var4 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"w">(var8, 1723765730808356647L, var2);
         }

         var1 |= b<"j">(24037, 2398993287406069706L ^ var2);

         try {
            if (var2 < 0L) {
               return var5;
            }

            if (var5 != 0) {
               return var1;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"w">(var7, 1723765730808356647L, var2);
         }
      }

      int var10000;
      try {
         var10000 = var1 & b<"j">(6691, 3882368272669302793L ^ var2);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"w">(var6, 1723765730808356647L, var2);
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int E(Object[] var0) {
      int var4 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      byte var3 = (Boolean)var0[2];
      var1 = a ^ var1;
      byte var5 = x44.a<"u">(-2295783056950438809L, var1);

      label46: {
         try {
            if (var5 != 0) {
               return var3;
            }

            if (var3 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"u">(var8, -2243320633137879019L, var1);
         }

         var4 |= b<"j">(24037, 2399006444968169720L ^ var1);

         try {
            if (var1 < 0L) {
               return var5;
            }

            if (var5 == 0) {
               return var4;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"u">(var7, -2243320633137879019L, var1);
         }
      }

      int var10000;
      try {
         var10000 = var4 & b<"j">(16512, 4104106878706109841L ^ var1);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"u">(var6, -2243320633137879019L, var1);
      }

      return var10000;
   }

   public final boolean Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var10001 = var2 ^ 2352800131815L;
      int var4 = (int)((var2 ^ 2352800131815L) >>> 32);
      int var5 = (int)((var2 ^ 2352800131815L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return f(this.J, var4, var5, (short)var6);
   }

   public final boolean Y(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 130049009401664L;
      return N(var6, this.J);
   }

   public final boolean Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 118479299353965L;
      return r(this.J, var4);
   }

   public final boolean P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 10891727557088L;
      int var10000 = this.J;
      Object[] var10003 = new Object[]{null, var4};
      var10003[0] = var10000;
      return x44.a<"s">(var10003, 5192632585395338907L, var2);
   }

   public String E(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 30281621793751L;
      return this.h(false, var3);
   }

   public final boolean B(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 107289851412835L;
      return l(var6, this.J);
   }

   public static int h(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 104238839074248L;
      Object[] var10004 = new Object[]{null, null, var4};
      var10004[1] = true;
      var10004[0] = var3;
      return x44.a<"w">(var10004, -9148337319713519984L, var1);
   }

   public static boolean w(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      boolean var4 = x44.a<"w">(6656774580539254821L, var1);

      try {
         int var10000 = var3 & b<"j">(15812, 1928239286614789261L ^ var1);
         if (var4) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"w">(var5, 6673278609919874135L, var1);
      }

      return (boolean)0;
   }

   public static int m(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      var1 &= b<"j">(20034, 4256481834724111798L ^ var2);
      return var1 | 2;
   }

   public static int i(Object[] var0) {
      int var1 = (Integer)var0[0];
      return var1 | 1;
   }

   public final void S(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 124788013433779L;
      int var10001 = this.J;
      Object[] var10005 = new Object[]{null, null, var2};
      var10005[1] = var5;
      var10005[0] = var10001;
      this.J = x44.a<"u">(var10005, -2872833908003632652L, var3);
   }

   void N(long var1, _8l var3) {
   }

   public static int Q(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 22704928914122L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var3;
      var10004[0] = var4;
      return x44.a<"u">(var10004, 5846197387835458947L, var1);
   }

   public static int n(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 109428026873791L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var4;
      var10004[0] = var3;
      return x44.a<"u">(var10004, 3224938559428955346L, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int K(Object[] var0) {
      int var4 = (Integer)var0[0];
      byte var3 = (Boolean)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;
      byte var5 = x44.a<"q">(-7885823690176813365L, var1);

      label46: {
         try {
            if (var5 != 0) {
               return var3;
            }

            if (var3 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"q">(var8, -7894159655725802823L, var1);
         }

         var4 |= b<"j">(16826, 7351870219005083140L ^ var1);

         try {
            if (var1 <= 0L) {
               return var5;
            }

            if (var5 == 0) {
               return var4;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"q">(var7, -7894159655725802823L, var1);
         }
      }

      int var10000;
      try {
         var10000 = var4 & b<"j">(14715, 3288429150607558380L ^ var1);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"q">(var6, -7894159655725802823L, var1);
      }

      return var10000;
   }

   public static int o(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 113128817655839L;
      Object[] var10004 = new Object[]{null, null, var4};
      var10004[1] = true;
      var10004[0] = var1;
      return x44.a<"r">(var10004, 6303133745700337876L, var2);
   }

   public static boolean l(long var0, int var2) {
      var0 = a ^ var0;
      boolean var3 = x44.a<"u">(5099406652404627118L, var0);

      try {
         int var10000 = var2 & b<"j">(1032, 3206434046644630158L ^ var0);
         if (!var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"u">(var4, 6579325420928144261L, var0);
      }

      return (boolean)0;
   }

   public static boolean F(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      boolean var4 = x44.a<"p">(-7617332157157366237L, var1);

      try {
         int var10000 = var3 & b<"j">(9893, 8987937456536207537L ^ var1);
         if (!var4) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var5) {
         throw x44.a<"p">(var5, -8375848634139262200L, var1);
      }

      return (boolean)0;
   }

   public final void Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 1780600175955L;
      int var10002 = this.J;
      Object[] var10005 = new Object[]{null, null, true};
      var10005[1] = var10002;
      var10005[0] = var4;
      this.J = x44.a<"t">(var10005, 4580044669808149129L, var2);
   }

   public final boolean F(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 73246836065572L;
      return m(var3, this.J);
   }

   public static int M(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var3 = (Long)var0[1];
      int var2 = (Integer)var0[2];
      long var5 = (var3 << 16 | (long)var2 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 89306117033164L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var7;
      var10004[0] = var1;
      return x44.a<"r">(var10004, -7539442974897715573L, var5);
   }

   public static int y(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 22372696532335L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var1;
      var10004[0] = var4;
      return x44.a<"t">(var10004, 8338304053749450870L, var2);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int O(Object[] var0) {
      int var4 = (Integer)var0[0];
      byte var3 = (Boolean)var0[1];
      long var1 = (Long)var0[2];
      var1 = a ^ var1;
      byte var5 = x44.a<"q">(-7847621978220353709L, var1);

      label46: {
         try {
            if (var5 != 0) {
               return var3;
            }

            if (var3 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"q">(var8, -7788403948788360415L, var1);
         }

         var4 |= b<"j">(5340, 777860524484029166L ^ var1);

         try {
            if (var1 < 0L) {
               return var5;
            }

            if (var5 == 0) {
               return var4;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"q">(var7, -7788403948788360415L, var1);
         }
      }

      int var10000;
      try {
         var10000 = var4 & b<"j">(19266, 5291646094629188972L ^ var1);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"q">(var6, -7788403948788360415L, var1);
      }

      return var10000;
   }

   public static int H(Object[] var0) {
      int var1 = (Integer)var0[0];
      return var1 | 2;
   }

   public final boolean T(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var4 ^ 71094343147906L;
      int var6 = (int)((var4 ^ 71094343147906L) >>> 32);
      int var7 = (int)((var4 ^ 71094343147906L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      return v(this.J, var6, var7, (short)var8);
   }

   public final boolean v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 77536433859675L;
      return H(var4, this.J);
   }

   public static boolean N(long var0, int var2) {
      var0 = a ^ var0;
      boolean var3 = x44.a<"v">(-7255345363439932635L, var0);

      try {
         int var10000 = var2 & b<"j">(19223, 5948803690020184116L ^ var0);
         if (!var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"v">(var4, -8735546092312375794L, var0);
      }

      return (boolean)0;
   }

   public static boolean r(int var0, long var1) {
      var1 = a ^ var1;
      boolean var3 = x44.a<"p">(7208491499754116195L, var1);

      try {
         int var10000 = var0 & b<"j">(8534, 4346241050731525400L ^ var1);
         if (!var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"p">(var4, 8755976353038053704L, var1);
      }

      return (boolean)0;
   }

   public final boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 90564772619132L;
      return u(this.J, var4);
   }

   public static String M(int var0, int var1, long var2, boolean var4) {
      var2 = a ^ var2;
      long var5 = var2 ^ 2452486883976L;
      return X(var0, var5, var1, var4, false);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int I(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      byte var4 = (Boolean)var0[2];
      var2 = a ^ var2;
      byte var5 = x44.a<"v">(-335315525030457572L, var2);

      label46: {
         try {
            if (var5 != 0) {
               return var4;
            }

            if (var4 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"v">(var8, -313814971215891602L, var2);
         }

         var1 |= b<"j">(30589, 62680925099876619L ^ var2);

         try {
            if (var2 < 0L) {
               return var5;
            }

            if (var5 == 0) {
               return var1;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"v">(var7, -313814971215891602L, var2);
         }
      }

      int var10000;
      try {
         var10000 = var1 & b<"j">(13804, 6368291218924381067L ^ var2);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"v">(var6, -313814971215891602L, var2);
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int J(Object[] var0) {
      int var4 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      byte var3 = (Boolean)var0[2];
      var1 = a ^ var1;
      byte var5 = x44.a<"u">(7515622860226517030L, var1);

      label46: {
         try {
            if (var5 == 0) {
               return var3;
            }

            if (var3 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"u">(var8, 8486494624076184845L, var1);
         }

         var4 |= b<"j">(32563, 8395101186546886433L ^ var1);

         try {
            if (var1 <= 0L) {
               return var5;
            }

            if (var5 != 0) {
               return var4;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"u">(var7, 8486494624076184845L, var1);
         }
      }

      int var10000;
      try {
         var10000 = var4 & b<"j">(22630, 5973827409546068071L ^ var1);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"u">(var6, 8486494624076184845L, var1);
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static int w(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      byte var4 = (Boolean)var0[2];
      var1 = a ^ var1;
      byte var5 = x44.a<"p">(-6663461098459981886L, var1);

      label46: {
         try {
            if (var5 != 0) {
               return var4;
            }

            if (var4 == 0) {
               break label46;
            }
         } catch (gj var8) {
            throw x44.a<"p">(var8, -6666730617508435024L, var1);
         }

         var3 |= b<"j">(25498, 4945103381573709112L ^ var1);

         try {
            if (var1 < 0L) {
               return var5;
            }

            if (var5 == 0) {
               return var3;
            }
         } catch (gj var7) {
            boolean var10001 = false;
            throw x44.a<"p">(var7, -6666730617508435024L, var1);
         }
      }

      int var10000;
      try {
         var10000 = var3 & b<"j">(1599, 3968636039282378912L ^ var1);
      } catch (gj var6) {
         boolean var12 = false;
         throw x44.a<"p">(var6, -6666730617508435024L, var1);
      }

      return var10000;
   }

   public final boolean y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 41579242868861L;
      Object[] var10003 = new Object[]{null, this.J};
      var10003[0] = var4;
      return x44.a<"u">(var10003, 4800367907319887188L, var2);
   }

   public static int b(Object[] var0) {
      int var1 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      var2 = a ^ var2;
      long var4 = var2 ^ 14902758004746L;
      Object[] var10004 = new Object[]{null, null, var4};
      var10004[1] = true;
      var10004[0] = var1;
      return x44.a<"p">(var10004, 4201603372103221681L, var2);
   }

   public static int q(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      var3 &= b<"j">(22052, 5146368743479529387L ^ var1);
      return var3 | 1;
   }

   public static String X(int param0, long param1, int param3, boolean param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/h2.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 14123696821793
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 32
      // 00f: lushr
      // 010: l2i
      // 011: istore 6
      // 013: dup2
      // 014: bipush 32
      // 016: lshl
      // 017: bipush 48
      // 019: lushr
      // 01a: l2i
      // 01b: istore 7
      // 01d: dup2
      // 01e: bipush 48
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 8
      // 027: pop2
      // 028: dup2
      // 029: ldc2_w 70620310330545
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 20855728465402
      // 033: lxor
      // 034: dup2
      // 035: bipush 32
      // 037: lushr
      // 038: l2i
      // 039: istore 11
      // 03b: dup2
      // 03c: bipush 32
      // 03e: lshl
      // 03f: bipush 48
      // 041: lushr
      // 042: l2i
      // 043: istore 12
      // 045: dup2
      // 046: bipush 48
      // 048: lshl
      // 049: bipush 48
      // 04b: lushr
      // 04c: l2i
      // 04d: istore 13
      // 04f: pop2
      // 050: dup2
      // 051: ldc2_w 18200389206235
      // 054: lxor
      // 055: lstore 14
      // 057: dup2
      // 058: ldc2_w 5051823435564
      // 05b: lxor
      // 05c: lstore 16
      // 05e: dup2
      // 05f: ldc2_w 47034852647616
      // 062: lxor
      // 063: lstore 18
      // 065: dup2
      // 066: ldc2_w 32503460995626
      // 069: lxor
      // 06a: lstore 20
      // 06c: dup2
      // 06d: ldc2_w 116651321324199
      // 070: lxor
      // 071: lstore 22
      // 073: dup2
      // 074: ldc2_w 77366786441942
      // 077: lxor
      // 078: lstore 24
      // 07a: dup2
      // 07b: ldc2_w 84379452470815
      // 07e: lxor
      // 07f: lstore 26
      // 081: dup2
      // 082: ldc2_w 67694045247808
      // 085: lxor
      // 086: lstore 28
      // 088: dup2
      // 089: ldc2_w 74685665559770
      // 08c: lxor
      // 08d: lstore 30
      // 08f: dup2
      // 090: ldc2_w 83991269342790
      // 093: lxor
      // 094: lstore 32
      // 096: dup2
      // 097: ldc2_w 70637280969014
      // 09a: lxor
      // 09b: dup2
      // 09c: bipush 32
      // 09e: lushr
      // 09f: l2i
      // 0a0: istore 34
      // 0a2: dup2
      // 0a3: bipush 32
      // 0a5: lshl
      // 0a6: bipush 40
      // 0a8: lushr
      // 0a9: l2i
      // 0aa: istore 35
      // 0ac: dup2
      // 0ad: bipush 56
      // 0af: lshl
      // 0b0: bipush 56
      // 0b2: lushr
      // 0b3: l2i
      // 0b4: istore 36
      // 0b6: pop2
      // 0b7: dup2
      // 0b8: ldc2_w 111731561123946
      // 0bb: lxor
      // 0bc: lstore 37
      // 0be: dup2
      // 0bf: ldc2_w 114372516340715
      // 0c2: lxor
      // 0c3: lstore 39
      // 0c5: dup2
      // 0c6: ldc2_w 88481615578148
      // 0c9: lxor
      // 0ca: lstore 41
      // 0cc: dup2
      // 0cd: ldc2_w 88625842582532
      // 0d0: lxor
      // 0d1: lstore 43
      // 0d3: dup2
      // 0d4: ldc2_w 73538710216771
      // 0d7: lxor
      // 0d8: lstore 45
      // 0da: pop2
      // 0db: ldc2_w -1283586013191872955
      // 0de: lload 1
      // 0df: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: new java/lang/StringBuilder
      // 0e7: dup
      // 0e8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0eb: astore 48
      // 0ed: istore 47
      // 0ef: lload 45
      // 0f1: iload 0
      // 0f2: invokestatic com/zelix/h2.m (JI)Z
      // 0f5: iload 47
      // 0f7: ifeq 158
      // 0fa: ifeq 152
      // 0fd: goto 10a
      // 100: ldc2_w -890296985062458514
      // 103: lload 1
      // 104: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: lload 1
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: iflt 14a
      // 110: iload 5
      // 112: ifeq 137
      // 115: goto 122
      // 118: ldc2_w -890296985062458514
      // 11b: lload 1
      // 11c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: aload 48
      // 124: ldc "!"
      // 126: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 129: pop
      // 12a: goto 137
      // 12d: ldc2_w -890296985062458514
      // 130: lload 1
      // 131: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: aload 48
      // 139: sipush 10524
      // 13c: ldc2_w 2544125000886971856
      // 13f: lload 1
      // 140: lxor
      // 141: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 149: pop
      // 14a: aload 48
      // 14c: ldc " "
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 151: pop
      // 152: lload 30
      // 154: iload 0
      // 155: invokestatic com/zelix/h2.U (JI)Z
      // 158: iload 47
      // 15a: lload 1
      // 15b: lconst_0
      // 15c: lcmp
      // 15d: iflt 1c8
      // 160: ifeq 1c6
      // 163: ifeq 1bb
      // 166: goto 173
      // 169: ldc2_w -890296985062458514
      // 16c: lload 1
      // 16d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: lload 1
      // 174: lconst_0
      // 175: lcmp
      // 176: ifle 1b3
      // 179: iload 5
      // 17b: ifeq 1a0
      // 17e: goto 18b
      // 181: ldc2_w -890296985062458514
      // 184: lload 1
      // 185: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: aload 48
      // 18d: ldc "!"
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 192: pop
      // 193: goto 1a0
      // 196: ldc2_w -890296985062458514
      // 199: lload 1
      // 19a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: aload 48
      // 1a2: sipush 27927
      // 1a5: ldc2_w 6430022728441899486
      // 1a8: lload 1
      // 1a9: lxor
      // 1aa: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b2: pop
      // 1b3: aload 48
      // 1b5: ldc " "
      // 1b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ba: pop
      // 1bb: iload 0
      // 1bc: iload 6
      // 1be: iload 7
      // 1c0: iload 8
      // 1c2: i2s
      // 1c3: invokestatic com/zelix/h2.v (IIIS)Z
      // 1c6: iload 47
      // 1c8: lload 1
      // 1c9: lconst_0
      // 1ca: lcmp
      // 1cb: iflt 22c
      // 1ce: ifeq 22a
      // 1d1: ifeq 229
      // 1d4: goto 1e1
      // 1d7: ldc2_w -890296985062458514
      // 1da: lload 1
      // 1db: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: athrow
      // 1e1: lload 1
      // 1e2: lconst_0
      // 1e3: lcmp
      // 1e4: iflt 221
      // 1e7: iload 5
      // 1e9: ifeq 20e
      // 1ec: goto 1f9
      // 1ef: ldc2_w -890296985062458514
      // 1f2: lload 1
      // 1f3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f8: athrow
      // 1f9: aload 48
      // 1fb: ldc "!"
      // 1fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 200: pop
      // 201: goto 20e
      // 204: ldc2_w -890296985062458514
      // 207: lload 1
      // 208: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: aload 48
      // 210: sipush 13542
      // 213: ldc2_w 5689811506269351979
      // 216: lload 1
      // 217: lxor
      // 218: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 220: pop
      // 221: aload 48
      // 223: ldc " "
      // 225: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 228: pop
      // 229: iload 3
      // 22a: iload 47
      // 22c: lload 1
      // 22d: lconst_0
      // 22e: lcmp
      // 22f: ifle 285
      // 232: ifeq 283
      // 235: bipush 1
      // 236: if_icmpeq 270
      // 239: goto 246
      // 23c: ldc2_w -890296985062458514
      // 23f: lload 1
      // 240: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 245: athrow
      // 246: iload 3
      // 247: bipush 3
      // 248: lload 1
      // 249: lconst_0
      // 24a: lcmp
      // 24b: ifle 300
      // 24e: iload 47
      // 250: ifeq 300
      // 253: goto 260
      // 256: ldc2_w -890296985062458514
      // 259: lload 1
      // 25a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: athrow
      // 260: if_icmpne 2e6
      // 263: goto 270
      // 266: ldc2_w -890296985062458514
      // 269: lload 1
      // 26a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: athrow
      // 270: iload 0
      // 271: lload 9
      // 273: invokestatic com/zelix/h2.s (IJ)Z
      // 276: goto 283
      // 279: ldc2_w -890296985062458514
      // 27c: lload 1
      // 27d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: athrow
      // 283: iload 47
      // 285: lload 1
      // 286: lconst_0
      // 287: lcmp
      // 288: ifle 2e9
      // 28b: ifeq 2e7
      // 28e: ifeq 2e6
      // 291: goto 29e
      // 294: ldc2_w -890296985062458514
      // 297: lload 1
      // 298: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: athrow
      // 29e: lload 1
      // 29f: lconst_0
      // 2a0: lcmp
      // 2a1: iflt 2de
      // 2a4: iload 5
      // 2a6: ifeq 2cb
      // 2a9: goto 2b6
      // 2ac: ldc2_w -890296985062458514
      // 2af: lload 1
      // 2b0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b5: athrow
      // 2b6: aload 48
      // 2b8: ldc "!"
      // 2ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bd: pop
      // 2be: goto 2cb
      // 2c1: ldc2_w -890296985062458514
      // 2c4: lload 1
      // 2c5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: athrow
      // 2cb: aload 48
      // 2cd: sipush 8808
      // 2d0: ldc2_w 7499498801435436718
      // 2d3: lload 1
      // 2d4: lxor
      // 2d5: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dd: pop
      // 2de: aload 48
      // 2e0: ldc " "
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: pop
      // 2e6: iload 3
      // 2e7: iload 47
      // 2e9: lload 1
      // 2ea: lconst_0
      // 2eb: lcmp
      // 2ec: ifle 348
      // 2ef: ifeq 346
      // 2f2: bipush 2
      // 2f3: goto 300
      // 2f6: ldc2_w -890296985062458514
      // 2f9: lload 1
      // 2fa: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: athrow
      // 300: lload 1
      // 301: lconst_0
      // 302: lcmp
      // 303: ifle 30c
      // 306: if_icmpeq 333
      // 309: iload 3
      // 30a: iload 47
      // 30c: ifeq 3af
      // 30f: goto 31c
      // 312: ldc2_w -890296985062458514
      // 315: lload 1
      // 316: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31b: athrow
      // 31c: lload 1
      // 31d: lconst_0
      // 31e: lcmp
      // 31f: ifle 3aa
      // 322: bipush 3
      // 323: if_icmpne 3a9
      // 326: goto 333
      // 329: ldc2_w -890296985062458514
      // 32c: lload 1
      // 32d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 332: athrow
      // 333: lload 22
      // 335: iload 0
      // 336: invokestatic com/zelix/h2.l (JI)Z
      // 339: goto 346
      // 33c: ldc2_w -890296985062458514
      // 33f: lload 1
      // 340: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: athrow
      // 346: iload 47
      // 348: lload 1
      // 349: lconst_0
      // 34a: lcmp
      // 34b: iflt 3b1
      // 34e: ifeq 3af
      // 351: ifeq 3a9
      // 354: goto 361
      // 357: ldc2_w -890296985062458514
      // 35a: lload 1
      // 35b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 360: athrow
      // 361: lload 1
      // 362: lconst_0
      // 363: lcmp
      // 364: ifle 3a1
      // 367: iload 5
      // 369: ifeq 38e
      // 36c: goto 379
      // 36f: ldc2_w -890296985062458514
      // 372: lload 1
      // 373: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 378: athrow
      // 379: aload 48
      // 37b: ldc "!"
      // 37d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 380: pop
      // 381: goto 38e
      // 384: ldc2_w -890296985062458514
      // 387: lload 1
      // 388: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38d: athrow
      // 38e: aload 48
      // 390: sipush 19641
      // 393: ldc2_w 6973539485520758904
      // 396: lload 1
      // 397: lxor
      // 398: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a0: pop
      // 3a1: aload 48
      // 3a3: ldc " "
      // 3a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3a8: pop
      // 3a9: iload 0
      // 3aa: lload 18
      // 3ac: invokestatic com/zelix/h2.u (IJ)Z
      // 3af: iload 47
      // 3b1: lload 1
      // 3b2: lconst_0
      // 3b3: lcmp
      // 3b4: iflt 414
      // 3b7: ifeq 413
      // 3ba: ifeq 412
      // 3bd: goto 3ca
      // 3c0: ldc2_w -890296985062458514
      // 3c3: lload 1
      // 3c4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: athrow
      // 3ca: lload 1
      // 3cb: lconst_0
      // 3cc: lcmp
      // 3cd: ifle 40a
      // 3d0: iload 5
      // 3d2: ifeq 3f7
      // 3d5: goto 3e2
      // 3d8: ldc2_w -890296985062458514
      // 3db: lload 1
      // 3dc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e1: athrow
      // 3e2: aload 48
      // 3e4: ldc "!"
      // 3e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e9: pop
      // 3ea: goto 3f7
      // 3ed: ldc2_w -890296985062458514
      // 3f0: lload 1
      // 3f1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f6: athrow
      // 3f7: aload 48
      // 3f9: sipush 23950
      // 3fc: ldc2_w 1587354504308824400
      // 3ff: lload 1
      // 400: lxor
      // 401: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 406: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 409: pop
      // 40a: aload 48
      // 40c: ldc " "
      // 40e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 411: pop
      // 412: iload 3
      // 413: bipush 3
      // 414: iload 47
      // 416: lload 1
      // 417: lconst_0
      // 418: lcmp
      // 419: ifle 4bb
      // 41c: ifeq 4b9
      // 41f: if_icmpne 4aa
      // 422: goto 42f
      // 425: ldc2_w -890296985062458514
      // 428: lload 1
      // 429: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42e: athrow
      // 42f: iload 0
      // 430: lload 37
      // 432: invokestatic com/zelix/h2.r (IJ)Z
      // 435: iload 47
      // 437: ifeq 584
      // 43a: goto 447
      // 43d: ldc2_w -890296985062458514
      // 440: lload 1
      // 441: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 446: athrow
      // 447: ifeq 583
      // 44a: goto 457
      // 44d: ldc2_w -890296985062458514
      // 450: lload 1
      // 451: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 456: athrow
      // 457: iload 5
      // 459: lload 1
      // 45a: lconst_0
      // 45b: lcmp
      // 45c: iflt 4a1
      // 45f: ifeq 484
      // 462: goto 46f
      // 465: ldc2_w -890296985062458514
      // 468: lload 1
      // 469: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46e: athrow
      // 46f: aload 48
      // 471: ldc "!"
      // 473: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 476: pop
      // 477: goto 484
      // 47a: ldc2_w -890296985062458514
      // 47d: lload 1
      // 47e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 483: athrow
      // 484: aload 48
      // 486: sipush 6360
      // 489: ldc2_w 2444483610362174482
      // 48c: lload 1
      // 48d: lxor
      // 48e: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 493: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 496: pop
      // 497: aload 48
      // 499: ldc " "
      // 49b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49e: pop
      // 49f: iload 47
      // 4a1: lload 1
      // 4a2: lconst_0
      // 4a3: lcmp
      // 4a4: iflt 4ab
      // 4a7: ifne 583
      // 4aa: iload 3
      // 4ab: bipush 1
      // 4ac: goto 4b9
      // 4af: ldc2_w -890296985062458514
      // 4b2: lload 1
      // 4b3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b8: athrow
      // 4b9: iload 47
      // 4bb: lload 1
      // 4bc: lconst_0
      // 4bd: lcmp
      // 4be: iflt 58d
      // 4c1: ifeq 585
      // 4c4: if_icmpne 583
      // 4c7: goto 4d4
      // 4ca: ldc2_w -890296985062458514
      // 4cd: lload 1
      // 4ce: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d3: athrow
      // 4d4: iload 4
      // 4d6: iload 47
      // 4d8: ifeq 584
      // 4db: goto 4e8
      // 4de: ldc2_w -890296985062458514
      // 4e1: lload 1
      // 4e2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e7: athrow
      // 4e8: ifeq 583
      // 4eb: goto 4f8
      // 4ee: ldc2_w -890296985062458514
      // 4f1: lload 1
      // 4f2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f7: athrow
      // 4f8: lload 41
      // 4fa: iload 0
      // 4fb: bipush 2
      // 4fc: anewarray 390
      // 4ff: dup_x1
      // 500: swap
      // 501: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 504: bipush 1
      // 505: swap
      // 506: aastore
      // 507: dup_x2
      // 508: dup_x2
      // 509: pop
      // 50a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 50d: bipush 0
      // 50e: swap
      // 50f: aastore
      // 510: ldc2_w -1349826401830708171
      // 513: lload 1
      // 514: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 519: iload 47
      // 51b: ifeq 584
      // 51e: goto 52b
      // 521: ldc2_w -890296985062458514
      // 524: lload 1
      // 525: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52a: athrow
      // 52b: ifeq 583
      // 52e: goto 53b
      // 531: ldc2_w -890296985062458514
      // 534: lload 1
      // 535: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53a: athrow
      // 53b: lload 1
      // 53c: lconst_0
      // 53d: lcmp
      // 53e: ifle 57b
      // 541: iload 5
      // 543: ifeq 568
      // 546: goto 553
      // 549: ldc2_w -890296985062458514
      // 54c: lload 1
      // 54d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 552: athrow
      // 553: aload 48
      // 555: ldc "!"
      // 557: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 55a: pop
      // 55b: goto 568
      // 55e: ldc2_w -890296985062458514
      // 561: lload 1
      // 562: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 567: athrow
      // 568: aload 48
      // 56a: sipush 8868
      // 56d: ldc2_w 4240389855414642272
      // 570: lload 1
      // 571: lxor
      // 572: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 577: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 57a: pop
      // 57b: aload 48
      // 57d: ldc " "
      // 57f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 582: pop
      // 583: iload 3
      // 584: bipush 3
      // 585: lload 1
      // 586: lconst_0
      // 587: lcmp
      // 588: iflt 642
      // 58b: iload 47
      // 58d: ifeq 642
      // 590: if_icmpne 61b
      // 593: goto 5a0
      // 596: ldc2_w -890296985062458514
      // 599: lload 1
      // 59a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59f: athrow
      // 5a0: lload 26
      // 5a2: iload 0
      // 5a3: invokestatic com/zelix/h2.H (JI)Z
      // 5a6: iload 47
      // 5a8: ifeq 6e6
      // 5ab: goto 5b8
      // 5ae: ldc2_w -890296985062458514
      // 5b1: lload 1
      // 5b2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b7: athrow
      // 5b8: ifeq 6e5
      // 5bb: goto 5c8
      // 5be: ldc2_w -890296985062458514
      // 5c1: lload 1
      // 5c2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c7: athrow
      // 5c8: iload 5
      // 5ca: lload 1
      // 5cb: lconst_0
      // 5cc: lcmp
      // 5cd: ifle 612
      // 5d0: ifeq 5f5
      // 5d3: goto 5e0
      // 5d6: ldc2_w -890296985062458514
      // 5d9: lload 1
      // 5da: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5df: athrow
      // 5e0: aload 48
      // 5e2: ldc "!"
      // 5e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e7: pop
      // 5e8: goto 5f5
      // 5eb: ldc2_w -890296985062458514
      // 5ee: lload 1
      // 5ef: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f4: athrow
      // 5f5: aload 48
      // 5f7: sipush 20392
      // 5fa: ldc2_w 5384813515933846388
      // 5fd: lload 1
      // 5fe: lxor
      // 5ff: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 604: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 607: pop
      // 608: aload 48
      // 60a: ldc " "
      // 60c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 60f: pop
      // 610: iload 47
      // 612: lload 1
      // 613: lconst_0
      // 614: lcmp
      // 615: iflt 61c
      // 618: ifne 6e5
      // 61b: iload 3
      // 61c: iload 47
      // 61e: lload 1
      // 61f: lconst_0
      // 620: lcmp
      // 621: ifle 68a
      // 624: ifeq 688
      // 627: goto 634
      // 62a: ldc2_w -890296985062458514
      // 62d: lload 1
      // 62e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 633: athrow
      // 634: bipush 1
      // 635: goto 642
      // 638: ldc2_w -890296985062458514
      // 63b: lload 1
      // 63c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 641: athrow
      // 642: lload 1
      // 643: lconst_0
      // 644: lcmp
      // 645: ifle 64d
      // 648: if_icmpeq 675
      // 64b: iload 3
      // 64c: bipush 2
      // 64d: iload 47
      // 64f: lload 1
      // 650: lconst_0
      // 651: lcmp
      // 652: iflt 6e9
      // 655: ifeq 6e7
      // 658: goto 665
      // 65b: ldc2_w -890296985062458514
      // 65e: lload 1
      // 65f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 664: athrow
      // 665: if_icmpne 6e5
      // 668: goto 675
      // 66b: ldc2_w -890296985062458514
      // 66e: lload 1
      // 66f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 674: athrow
      // 675: lload 24
      // 677: iload 0
      // 678: invokestatic com/zelix/h2.G (JI)Z
      // 67b: goto 688
      // 67e: ldc2_w -890296985062458514
      // 681: lload 1
      // 682: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 687: athrow
      // 688: iload 47
      // 68a: ifeq 6e6
      // 68d: ifeq 6e5
      // 690: goto 69d
      // 693: ldc2_w -890296985062458514
      // 696: lload 1
      // 697: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69c: athrow
      // 69d: lload 1
      // 69e: lconst_0
      // 69f: lcmp
      // 6a0: ifle 6dd
      // 6a3: iload 5
      // 6a5: ifeq 6ca
      // 6a8: goto 6b5
      // 6ab: ldc2_w -890296985062458514
      // 6ae: lload 1
      // 6af: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b4: athrow
      // 6b5: aload 48
      // 6b7: ldc "!"
      // 6b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6bc: pop
      // 6bd: goto 6ca
      // 6c0: ldc2_w -890296985062458514
      // 6c3: lload 1
      // 6c4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c9: athrow
      // 6ca: aload 48
      // 6cc: sipush 31444
      // 6cf: ldc2_w 7485121236712177179
      // 6d2: lload 1
      // 6d3: lxor
      // 6d4: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6dc: pop
      // 6dd: aload 48
      // 6df: ldc " "
      // 6e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e4: pop
      // 6e5: iload 3
      // 6e6: bipush 1
      // 6e7: iload 47
      // 6e9: lload 1
      // 6ea: lconst_0
      // 6eb: lcmp
      // 6ec: iflt 77c
      // 6ef: ifeq 77a
      // 6f2: if_icmpne 778
      // 6f5: goto 702
      // 6f8: ldc2_w -890296985062458514
      // 6fb: lload 1
      // 6fc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 701: athrow
      // 702: lload 43
      // 704: iload 0
      // 705: ldc2_w -624785124893936464
      // 708: lload 1
      // 709: invokedynamic v (JIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70e: iload 47
      // 710: ifeq 779
      // 713: goto 720
      // 716: ldc2_w -890296985062458514
      // 719: lload 1
      // 71a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71f: athrow
      // 720: ifeq 778
      // 723: goto 730
      // 726: ldc2_w -890296985062458514
      // 729: lload 1
      // 72a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72f: athrow
      // 730: lload 1
      // 731: lconst_0
      // 732: lcmp
      // 733: ifle 770
      // 736: iload 5
      // 738: ifeq 75d
      // 73b: goto 748
      // 73e: ldc2_w -890296985062458514
      // 741: lload 1
      // 742: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 747: athrow
      // 748: aload 48
      // 74a: ldc "!"
      // 74c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 74f: pop
      // 750: goto 75d
      // 753: ldc2_w -890296985062458514
      // 756: lload 1
      // 757: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75c: athrow
      // 75d: aload 48
      // 75f: sipush 30915
      // 762: ldc2_w 3206468243607862276
      // 765: lload 1
      // 766: lxor
      // 767: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76f: pop
      // 770: aload 48
      // 772: ldc " "
      // 774: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 777: pop
      // 778: iload 3
      // 779: bipush 2
      // 77a: iload 47
      // 77c: lload 1
      // 77d: lconst_0
      // 77e: lcmp
      // 77f: iflt 850
      // 782: ifeq 84e
      // 785: if_icmpne 83f
      // 788: goto 795
      // 78b: ldc2_w -890296985062458514
      // 78e: lload 1
      // 78f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 794: athrow
      // 795: iload 0
      // 796: iload 34
      // 798: iload 35
      // 79a: iload 36
      // 79c: i2b
      // 79d: bipush 4
      // 79e: anewarray 390
      // 7a1: dup_x1
      // 7a2: swap
      // 7a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7a6: bipush 3
      // 7a7: swap
      // 7a8: aastore
      // 7a9: dup_x1
      // 7aa: swap
      // 7ab: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7ae: bipush 2
      // 7af: swap
      // 7b0: aastore
      // 7b1: dup_x1
      // 7b2: swap
      // 7b3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7b6: bipush 1
      // 7b7: swap
      // 7b8: aastore
      // 7b9: dup_x1
      // 7ba: swap
      // 7bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7be: bipush 0
      // 7bf: swap
      // 7c0: aastore
      // 7c1: ldc2_w -621655388349682286
      // 7c4: lload 1
      // 7c5: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7ca: iload 47
      // 7cc: ifeq 8df
      // 7cf: goto 7dc
      // 7d2: ldc2_w -890296985062458514
      // 7d5: lload 1
      // 7d6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7db: athrow
      // 7dc: ifeq 8de
      // 7df: goto 7ec
      // 7e2: ldc2_w -890296985062458514
      // 7e5: lload 1
      // 7e6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7eb: athrow
      // 7ec: iload 5
      // 7ee: lload 1
      // 7ef: lconst_0
      // 7f0: lcmp
      // 7f1: iflt 836
      // 7f4: ifeq 819
      // 7f7: goto 804
      // 7fa: ldc2_w -890296985062458514
      // 7fd: lload 1
      // 7fe: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 803: athrow
      // 804: aload 48
      // 806: ldc "!"
      // 808: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 80b: pop
      // 80c: goto 819
      // 80f: ldc2_w -890296985062458514
      // 812: lload 1
      // 813: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 818: athrow
      // 819: aload 48
      // 81b: sipush 6160
      // 81e: ldc2_w 5070283601072741584
      // 821: lload 1
      // 822: lxor
      // 823: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 828: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 82b: pop
      // 82c: aload 48
      // 82e: ldc " "
      // 830: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 833: pop
      // 834: iload 47
      // 836: lload 1
      // 837: lconst_0
      // 838: lcmp
      // 839: ifle 840
      // 83c: ifne 8de
      // 83f: iload 3
      // 840: bipush 3
      // 841: goto 84e
      // 844: ldc2_w -890296985062458514
      // 847: lload 1
      // 848: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84d: athrow
      // 84e: iload 47
      // 850: lload 1
      // 851: lconst_0
      // 852: lcmp
      // 853: iflt 8e8
      // 856: ifeq 8e0
      // 859: if_icmpne 8de
      // 85c: goto 869
      // 85f: ldc2_w -890296985062458514
      // 862: lload 1
      // 863: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 868: athrow
      // 869: iload 0
      // 86a: iload 11
      // 86c: iload 12
      // 86e: iload 13
      // 870: i2s
      // 871: invokestatic com/zelix/h2.f (IIIS)Z
      // 874: iload 47
      // 876: ifeq 8df
      // 879: goto 886
      // 87c: ldc2_w -890296985062458514
      // 87f: lload 1
      // 880: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 885: athrow
      // 886: ifeq 8de
      // 889: goto 896
      // 88c: ldc2_w -890296985062458514
      // 88f: lload 1
      // 890: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 895: athrow
      // 896: lload 1
      // 897: lconst_0
      // 898: lcmp
      // 899: iflt 8d6
      // 89c: iload 5
      // 89e: ifeq 8c3
      // 8a1: goto 8ae
      // 8a4: ldc2_w -890296985062458514
      // 8a7: lload 1
      // 8a8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ad: athrow
      // 8ae: aload 48
      // 8b0: ldc "!"
      // 8b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b5: pop
      // 8b6: goto 8c3
      // 8b9: ldc2_w -890296985062458514
      // 8bc: lload 1
      // 8bd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c2: athrow
      // 8c3: aload 48
      // 8c5: sipush 1052
      // 8c8: ldc2_w 8767692843709251806
      // 8cb: lload 1
      // 8cc: lxor
      // 8cd: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8d5: pop
      // 8d6: aload 48
      // 8d8: ldc " "
      // 8da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8dd: pop
      // 8de: iload 3
      // 8df: bipush 2
      // 8e0: lload 1
      // 8e1: lconst_0
      // 8e2: lcmp
      // 8e3: iflt 9b2
      // 8e6: iload 47
      // 8e8: ifeq 9b2
      // 8eb: if_icmpne 991
      // 8ee: goto 8fb
      // 8f1: ldc2_w -890296985062458514
      // 8f4: lload 1
      // 8f5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8fa: athrow
      // 8fb: lload 32
      // 8fd: iload 0
      // 8fe: bipush 2
      // 8ff: anewarray 390
      // 902: dup_x1
      // 903: swap
      // 904: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 907: bipush 1
      // 908: swap
      // 909: aastore
      // 90a: dup_x2
      // 90b: dup_x2
      // 90c: pop
      // 90d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 910: bipush 0
      // 911: swap
      // 912: aastore
      // 913: ldc2_w -1394641856218195089
      // 916: lload 1
      // 917: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91c: iload 47
      // 91e: ifeq a72
      // 921: goto 92e
      // 924: ldc2_w -890296985062458514
      // 927: lload 1
      // 928: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92d: athrow
      // 92e: ifeq a70
      // 931: goto 93e
      // 934: ldc2_w -890296985062458514
      // 937: lload 1
      // 938: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93d: athrow
      // 93e: iload 5
      // 940: lload 1
      // 941: lconst_0
      // 942: lcmp
      // 943: ifle 988
      // 946: ifeq 96b
      // 949: goto 956
      // 94c: ldc2_w -890296985062458514
      // 94f: lload 1
      // 950: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 955: athrow
      // 956: aload 48
      // 958: ldc "!"
      // 95a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 95d: pop
      // 95e: goto 96b
      // 961: ldc2_w -890296985062458514
      // 964: lload 1
      // 965: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96a: athrow
      // 96b: aload 48
      // 96d: sipush 11062
      // 970: ldc2_w 2705752171661455357
      // 973: lload 1
      // 974: lxor
      // 975: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 97d: pop
      // 97e: aload 48
      // 980: ldc " "
      // 982: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 985: pop
      // 986: iload 47
      // 988: lload 1
      // 989: lconst_0
      // 98a: lcmp
      // 98b: ifle 992
      // 98e: ifne a70
      // 991: iload 3
      // 992: iload 47
      // 994: ifeq a72
      // 997: goto 9a4
      // 99a: ldc2_w -890296985062458514
      // 99d: lload 1
      // 99e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a3: athrow
      // 9a4: bipush 3
      // 9a5: goto 9b2
      // 9a8: ldc2_w -890296985062458514
      // 9ab: lload 1
      // 9ac: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b1: athrow
      // 9b2: lload 1
      // 9b3: lconst_0
      // 9b4: lcmp
      // 9b5: iflt 9bf
      // 9b8: if_icmpne a70
      // 9bb: iload 4
      // 9bd: iload 47
      // 9bf: ifeq a72
      // 9c2: goto 9cf
      // 9c5: ldc2_w -890296985062458514
      // 9c8: lload 1
      // 9c9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9ce: athrow
      // 9cf: ifeq a70
      // 9d2: goto 9df
      // 9d5: ldc2_w -890296985062458514
      // 9d8: lload 1
      // 9d9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9de: athrow
      // 9df: lload 14
      // 9e1: iload 0
      // 9e2: bipush 2
      // 9e3: anewarray 390
      // 9e6: dup_x1
      // 9e7: swap
      // 9e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9eb: bipush 1
      // 9ec: swap
      // 9ed: aastore
      // 9ee: dup_x2
      // 9ef: dup_x2
      // 9f0: pop
      // 9f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9f4: bipush 0
      // 9f5: swap
      // 9f6: aastore
      // 9f7: ldc2_w -1179925196098631232
      // 9fa: lload 1
      // 9fb: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a00: iload 47
      // a02: lload 1
      // a03: lconst_0
      // a04: lcmp
      // a05: ifle a74
      // a08: ifeq a72
      // a0b: goto a18
      // a0e: ldc2_w -890296985062458514
      // a11: lload 1
      // a12: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a17: athrow
      // a18: ifeq a70
      // a1b: goto a28
      // a1e: ldc2_w -890296985062458514
      // a21: lload 1
      // a22: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a27: athrow
      // a28: lload 1
      // a29: lconst_0
      // a2a: lcmp
      // a2b: iflt a68
      // a2e: iload 5
      // a30: ifeq a55
      // a33: goto a40
      // a36: ldc2_w -890296985062458514
      // a39: lload 1
      // a3a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3f: athrow
      // a40: aload 48
      // a42: ldc "!"
      // a44: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a47: pop
      // a48: goto a55
      // a4b: ldc2_w -890296985062458514
      // a4e: lload 1
      // a4f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a54: athrow
      // a55: aload 48
      // a57: sipush 20929
      // a5a: ldc2_w 5776979997887632642
      // a5d: lload 1
      // a5e: lxor
      // a5f: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a64: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a67: pop
      // a68: aload 48
      // a6a: ldc " "
      // a6c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a6f: pop
      // a70: iload 4
      // a72: iload 47
      // a74: ifeq afe
      // a77: ifeq afd
      // a7a: goto a87
      // a7d: ldc2_w -890296985062458514
      // a80: lload 1
      // a81: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a86: athrow
      // a87: lload 16
      // a89: iload 0
      // a8a: invokestatic com/zelix/h2.N (JI)Z
      // a8d: iload 47
      // a8f: lload 1
      // a90: lconst_0
      // a91: lcmp
      // a92: iflt aff
      // a95: ifeq afe
      // a98: goto aa5
      // a9b: ldc2_w -890296985062458514
      // a9e: lload 1
      // a9f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa4: athrow
      // aa5: ifeq afd
      // aa8: goto ab5
      // aab: ldc2_w -890296985062458514
      // aae: lload 1
      // aaf: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab4: athrow
      // ab5: lload 1
      // ab6: lconst_0
      // ab7: lcmp
      // ab8: ifle af5
      // abb: iload 5
      // abd: ifeq ae2
      // ac0: goto acd
      // ac3: ldc2_w -890296985062458514
      // ac6: lload 1
      // ac7: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // acc: athrow
      // acd: aload 48
      // acf: ldc "!"
      // ad1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ad4: pop
      // ad5: goto ae2
      // ad8: ldc2_w -890296985062458514
      // adb: lload 1
      // adc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae1: athrow
      // ae2: aload 48
      // ae4: sipush 3073
      // ae7: ldc2_w 8872283615350999236
      // aea: lload 1
      // aeb: lxor
      // aec: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // af4: pop
      // af5: aload 48
      // af7: ldc " "
      // af9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // afc: pop
      // afd: iload 3
      // afe: bipush 1
      // aff: lload 1
      // b00: lconst_0
      // b01: lcmp
      // b02: ifle bd7
      // b05: iload 47
      // b07: ifeq bd7
      // b0a: if_icmpne bb6
      // b0d: goto b1a
      // b10: ldc2_w -890296985062458514
      // b13: lload 1
      // b14: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b19: athrow
      // b1a: iload 0
      // b1b: lload 20
      // b1d: bipush 2
      // b1e: anewarray 390
      // b21: dup_x2
      // b22: dup_x2
      // b23: pop
      // b24: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b27: bipush 1
      // b28: swap
      // b29: aastore
      // b2a: dup_x1
      // b2b: swap
      // b2c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b2f: bipush 0
      // b30: swap
      // b31: aastore
      // b32: ldc2_w -906630686946901958
      // b35: lload 1
      // b36: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3b: iload 47
      // b3d: ifeq ca7
      // b40: goto b4d
      // b43: ldc2_w -890296985062458514
      // b46: lload 1
      // b47: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4c: athrow
      // b4d: lload 1
      // b4e: lconst_0
      // b4f: lcmp
      // b50: ifle ca2
      // b53: ifeq ca1
      // b56: goto b63
      // b59: ldc2_w -890296985062458514
      // b5c: lload 1
      // b5d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b62: athrow
      // b63: iload 5
      // b65: lload 1
      // b66: lconst_0
      // b67: lcmp
      // b68: iflt bad
      // b6b: ifeq b90
      // b6e: goto b7b
      // b71: ldc2_w -890296985062458514
      // b74: lload 1
      // b75: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7a: athrow
      // b7b: aload 48
      // b7d: ldc "!"
      // b7f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b82: pop
      // b83: goto b90
      // b86: ldc2_w -890296985062458514
      // b89: lload 1
      // b8a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8f: athrow
      // b90: aload 48
      // b92: sipush 1370
      // b95: ldc2_w 6030012676705829268
      // b98: lload 1
      // b99: lxor
      // b9a: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ba2: pop
      // ba3: aload 48
      // ba5: ldc " "
      // ba7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // baa: pop
      // bab: iload 47
      // bad: lload 1
      // bae: lconst_0
      // baf: lcmp
      // bb0: iflt ca2
      // bb3: ifne ca1
      // bb6: iload 3
      // bb7: iload 47
      // bb9: ifeq ca7
      // bbc: goto bc9
      // bbf: ldc2_w -890296985062458514
      // bc2: lload 1
      // bc3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc8: athrow
      // bc9: bipush 3
      // bca: goto bd7
      // bcd: ldc2_w -890296985062458514
      // bd0: lload 1
      // bd1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd6: athrow
      // bd7: lload 1
      // bd8: lconst_0
      // bd9: lcmp
      // bda: iflt be4
      // bdd: if_icmpne ca1
      // be0: iload 4
      // be2: iload 47
      // be4: ifeq ca7
      // be7: goto bf4
      // bea: ldc2_w -890296985062458514
      // bed: lload 1
      // bee: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf3: athrow
      // bf4: lload 1
      // bf5: lconst_0
      // bf6: lcmp
      // bf7: iflt ca2
      // bfa: ifeq ca1
      // bfd: goto c0a
      // c00: ldc2_w -890296985062458514
      // c03: lload 1
      // c04: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c09: athrow
      // c0a: iload 0
      // c0b: lload 39
      // c0d: bipush 2
      // c0e: anewarray 390
      // c11: dup_x2
      // c12: dup_x2
      // c13: pop
      // c14: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c17: bipush 1
      // c18: swap
      // c19: aastore
      // c1a: dup_x1
      // c1b: swap
      // c1c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c1f: bipush 0
      // c20: swap
      // c21: aastore
      // c22: ldc2_w -1448946099241182173
      // c25: lload 1
      // c26: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2b: iload 47
      // c2d: lload 1
      // c2e: lconst_0
      // c2f: lcmp
      // c30: iflt caf
      // c33: ifeq ca7
      // c36: goto c43
      // c39: ldc2_w -890296985062458514
      // c3c: lload 1
      // c3d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c42: athrow
      // c43: lload 1
      // c44: lconst_0
      // c45: lcmp
      // c46: iflt ca2
      // c49: ifeq ca1
      // c4c: goto c59
      // c4f: ldc2_w -890296985062458514
      // c52: lload 1
      // c53: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c58: athrow
      // c59: lload 1
      // c5a: lconst_0
      // c5b: lcmp
      // c5c: ifle c99
      // c5f: iload 5
      // c61: ifeq c86
      // c64: goto c71
      // c67: ldc2_w -890296985062458514
      // c6a: lload 1
      // c6b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c70: athrow
      // c71: aload 48
      // c73: ldc "!"
      // c75: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c78: pop
      // c79: goto c86
      // c7c: ldc2_w -890296985062458514
      // c7f: lload 1
      // c80: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c85: athrow
      // c86: aload 48
      // c88: sipush 30773
      // c8b: ldc2_w 4696476200453946600
      // c8e: lload 1
      // c8f: lxor
      // c90: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c95: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c98: pop
      // c99: aload 48
      // c9b: ldc " "
      // c9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ca0: pop
      // ca1: iload 0
      // ca2: lload 28
      // ca4: invokestatic com/zelix/h2.K (IJ)Z
      // ca7: lload 1
      // ca8: lconst_0
      // ca9: lcmp
      // caa: ifle cc4
      // cad: iload 47
      // caf: ifeq cc4
      // cb2: ifeq cf7
      // cb5: goto cc2
      // cb8: ldc2_w -890296985062458514
      // cbb: lload 1
      // cbc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc1: athrow
      // cc2: iload 5
      // cc4: ifeq cdc
      // cc7: aload 48
      // cc9: ldc "!"
      // ccb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cce: pop
      // ccf: goto cdc
      // cd2: ldc2_w -890296985062458514
      // cd5: lload 1
      // cd6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cdb: athrow
      // cdc: aload 48
      // cde: sipush 32663
      // ce1: ldc2_w 9115589453954038623
      // ce4: lload 1
      // ce5: lxor
      // ce6: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/h2.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ceb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cee: pop
      // cef: aload 48
      // cf1: ldc " "
      // cf3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cf6: pop
      // cf7: aload 48
      // cf9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // cfc: areturn
   }

   public static boolean G(long var0, int var2) {
      var0 = a ^ var0;
      boolean var3 = x44.a<"t">(8553909164291933919L, var0);

      try {
         int var10000 = var2 & b<"j">(28600, 2182864374895274341L ^ var0);
         if (!var3) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (gj var4) {
         throw x44.a<"t">(var4, 7727994277545747444L, var0);
      }

      return (boolean)0;
   }

   public final void r(Object[] var1) {
      boolean var4 = (Boolean)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 48909282540993L;
      int var10001 = this.J;
      Object[] var10005 = new Object[]{null, null, var4};
      var10005[1] = var5;
      var10005[0] = var10001;
      this.J = x44.a<"u">(var10005, -6918431872661771609L, var2);
   }

   private static gj a(gj var0) {
      return var0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9793;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/h2", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/h2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31982;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)((int)(var1 >>> 56)),
            (byte)((int)(var1 >>> 48)),
            (byte)((int)(var1 >>> 40)),
            (byte)((int)(var1 >>> 32)),
            (byte)((int)(var1 >>> 24)),
            (byte)((int)(var1 >>> 16)),
            (byte)((int)(var1 >>> 8)),
            (byte)((int)var1)
         };
         long var5 = e[var3];
         byte[] var7 = new byte[]{
            (byte)((int)(var5 >>> 56)),
            (byte)((int)(var5 >>> 48)),
            (byte)((int)(var5 >>> 40)),
            (byte)((int)(var5 >>> 32)),
            (byte)((int)(var5 >>> 24)),
            (byte)((int)(var5 >>> 16)),
            (byte)((int)(var5 >>> 8)),
            (byte)((int)var5)
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/h2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/h2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
