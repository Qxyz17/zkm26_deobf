package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _xl implements _rd {
   public static final String[] h;
   public static final String[] H;
   public static final String[] N;
   private static final String[] a;
   private static final String[] b;
   private static final Map c = new HashMap(13);
   private static final long[] d;
   private static final Integer[] e;
   private static final Map f;

   static {
      long var20 = ess.a(-817926272779336539L, 8219383217665023206L, MethodHandles.lookup().lookupClass()).a(70939752875060L) ^ 74586541076576L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[4];
      int var16 = 0;
      String var15 = "/~#èç\u00ad\u0087\u008e\u0091®\\~\u0017\u0094¨\u0014\u0004²?£?]ÿèÈ\u008e\ròûz<'\u0080f\u0002MíD\u009a¿,\u0089\u0093\u0088ñ\u007f1*\u0003X,0~1(ñ\u0007X\u008dÎYCá.a&p[ð´B\u000f|¥p\u0099¦F\u008e=ZRð&\u0012#Ù+\u0002\u001aBêìiÆ´Qo\u000f×Ìz©½§\u0094<Rêâ\u0018b \u0006äJ\u008fS\b\u0011\u000eZh´\tma?î\u0098Ü·Ä\fe\u0013içO<\u0088\u0016¦Y#Tº¾i§=Êr®Ø±RbÆ×ø";
      int var17 = "/~#èç\u00ad\u0087\u008e\u0091®\\~\u0017\u0094¨\u0014\u0004²?£?]ÿèÈ\u008e\ròûz<'\u0080f\u0002MíD\u009a¿,\u0089\u0093\u0088ñ\u007f1*\u0003X,0~1(ñ\u0007X\u008dÎYCá.a&p[ð´B\u000f|¥p\u0099¦F\u008e=ZRð&\u0012#Ù+\u0002\u001aBêìiÆ´Qo\u000f×Ìz©½§\u0094<Rêâ\u0018b \u0006äJ\u008fS\b\u0011\u000eZh´\tma?î\u0098Ü·Ä\fe\u0013içO<\u0088\u0016¦Y#Tº¾i§=Êr®Ø±RbÆ×ø"
         .length();
      char var14 = ' ';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     a = var18;
                     b = new String[4];
                     f = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "ÈÉ*:>\u001cïªÏòVXù<*\u00963zý\u0081ÇEÊ\u009f\u0097ßÁ¦ ¨\u0087g";
                     int var5 = "ÈÉ*:>\u001cïªÏòVXù<*\u00963zý\u0081ÇEÊ\u009f\u0097ßÁ¦ ¨\u0087g".length();
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
                                    d = var6;
                                    e = new Integer[6];
                                    H = new String[]{a<"p">(8225, 5978878965042824445L ^ var20)};
                                    N = new String[]{a<"p">(13121, 1714349691912312734L ^ var20)};
                                    h = new String[]{a<"p">(7958, 7016862502874938315L ^ var20)};
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Áè±;\u0013;(\u0004úN\u0010õäÚd¦";
                                 var5 = "Áè±;\u0013;(\u0004úN\u0010õäÚd¦".length();
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

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "ç3x«\b<Û\u008aY\u0080\u0082*4Ü}Â³¥qaK\u001e£\u008e\u009aÉã\u0012Ø\u0017½\u001c\u00ad-q)ú´s_0UÖ³\u009fç\u008fÚÄ®Í)\u0014\u001aÇao.\u0095@6²\u008f\u0092Ñ³\\Ö6ì\u0080\u0014=úønÈ£4(eçd{úQTÁ´";
                  var17 = "ç3x«\b<Û\u008aY\u0080\u0082*4Ü}Â³¥qaK\u001e£\u008e\u009aÉã\u0012Ø\u0017½\u001c\u00ad-q)ú´s_0UÖ³\u009fç\u008fÚÄ®Í)\u0014\u001aÇao.\u0095@6²\u008f\u0092Ñ³\\Ö6ì\u0080\u0014=úønÈ£4(eçd{úQTÁ´"
                     .length();
                  var14 = '(';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public String[] f(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"h">(-500043470209932127L, var2);
   }

   public int J(Object[] var1) {
      return 2;
   }

   public String[] k(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"k">(7169682317232992838L, var2);
   }

   public List X(Object[] var1) {
      my var5 = (my)var1[0];
      long var2 = (Long)var1[1];
      my[] var4 = (my[])var1[2];
      ArrayList var6 = new ArrayList();
      var6.add(_oe.E(b<"r">(23388, 8437269602377049525L ^ var2)));
      var6.add(_oe.E(b<"r">(6875, 8582187466313098293L ^ var2)));
      var6.add(new _ow(b<"r">(1528, 2319020495854795536L ^ var2), var4[0]));
      var6.add(new _ow(b<"r">(26838, 4757822924864591417L ^ var2), var5));
      var6.add(_oe.E(b<"r">(16046, 7343431562159734853L ^ var2)));
      var6.add(_oe.E(b<"r">(20987, 9176275222738087697L ^ var2)));
      return var6;
   }

   public String Q(Object[] var1) {
      return "b";
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      return a<"p">(32465, 3098893757047818381L ^ var2);
   }

   public String[] v(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"n">(2663943047518601243L, var2);
   }

   private static String b(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21697;
      if (b[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])c.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               c.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_xl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = a[var5].getBytes("ISO-8859-1");
         b[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return b[var5];
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
         throw new RuntimeException("com/zelix/_xl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20601;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_xl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
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
         throw new RuntimeException("com/zelix/_xl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
