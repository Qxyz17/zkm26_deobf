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

public class vu implements _rd {
   public static final String[] R;
   public static final String[] V;
   public static final String[] e;
   private static final String[] a;
   private static final String[] b;
   private static final Map c = new HashMap(13);
   private static final long[] d;
   private static final Integer[] f;
   private static final Map g;

   public String[] k(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"k">(7452581655555612026L, var2);
   }

   public String[] f(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"h">(-2029439882077550210L, var2);
   }

   public List X(Object[] var1) {
      my var5 = (my)var1[0];
      long var2 = (Long)var1[1];
      my[] var4 = (my[])var1[2];
      ArrayList var6 = new ArrayList();
      var6.add(_oe.E(b<"w">(1457, 6153704710244139039L ^ var2)));
      var6.add(_oe.E(b<"w">(23198, 5719654831448383281L ^ var2)));
      var6.add(_oe.E(b<"w">(6839, 2665962307463159580L ^ var2)));
      var6.add(_oe.E(b<"w">(16062, 5086302959813540627L ^ var2)));
      var6.add(new _ow(b<"w">(22709, 9182449215401778460L ^ var2), var4[0]));
      var6.add(new _ow(b<"w">(6254, 5407718656503127490L ^ var2), var5));
      var6.add(_oe.E(b<"w">(22681, 2792609174228360499L ^ var2)));
      return var6;
   }

   static {
      long var20 = ess.a(467472738059380720L, 8922475132625625332L, MethodHandles.lookup().lookupClass()).a(244167106015668L) ^ 55381421289969L;
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
      String var15 = "Òòréã&\\\u008d\u0004@\u0011ùDê÷0öü\u0094¡¯N\u007f\u008c\u0088ßmR\u0087>¦;\u0004\u0087ÏÄ6ø»T\u001b@hí¸\u0095¸ì\u0095¹?.\u0012Ê\u0087\\ \u008b\u0014mÂ ê(¼MÍg_pÍ@u\u009c¦¿\u001fe\u009d\u0092\u0004\u0004£´¼\u0092\u0096n\b\u008f\u0091\u0089ä½\u0012@ÜOßiqzN\u007fµ\u001b&Oè\u000e\fÛ\u0003\u0002!\u0010S\u0082\u007f\u009eDQ¿\u00ad&:\u0089ÚY\u000f\u0098Ìi\u008eØÃöD\u0096o\u0091¦\u001f\u009bd8N\u009eñ&\n\u0087ÃÇq¡Z\u00040zí";
      int var17 = "Òòréã&\\\u008d\u0004@\u0011ùDê÷0öü\u0094¡¯N\u007f\u008c\u0088ßmR\u0087>¦;\u0004\u0087ÏÄ6ø»T\u001b@hí¸\u0095¸ì\u0095¹?.\u0012Ê\u0087\\ \u008b\u0014mÂ ê(¼MÍg_pÍ@u\u009c¦¿\u001fe\u009d\u0092\u0004\u0004£´¼\u0092\u0096n\b\u008f\u0091\u0089ä½\u0012@ÜOßiqzN\u007fµ\u001b&Oè\u000e\fÛ\u0003\u0002!\u0010S\u0082\u007f\u009eDQ¿\u00ad&:\u0089ÚY\u000f\u0098Ìi\u008eØÃöD\u0096o\u0091¦\u001f\u009bd8N\u009eñ&\n\u0087ÃÇq¡Z\u00040zí"
         .length();
      char var14 = 24;
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
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "Â\u0092¯\u0085\u0091cW\u0088\u0017\t8\"{½è\u0090À\u0080\u0013¾(«hÍ\u0083öÍU\u0087\u0085\u009dÞ7¿*»\u009aô½l";
                     int var5 = "Â\u0092¯\u0085\u0091cW\u0088\u0017\t8\"{½è\u0090À\u0080\u0013¾(«hÍ\u0083öÍU\u0087\u0085\u009dÞ7¿*»\u009aô½l".length();
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
                                    f = new Integer[7];
                                    V = new String[]{a<"p">(26953, 6097919402269869199L ^ var20)};
                                    e = new String[]{a<"p">(8558, 7959358448371125419L ^ var20)};
                                    R = new String[]{a<"p">(25853, 3961857577318385978L ^ var20)};
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "nbªÉµ\u0015÷\u0092{\u0013S\u0016\u0093üdñ";
                                 var5 = "nbªÉµ\u0015÷\u0092{\u0013S\u0016\u0093üdñ".length();
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

                  var15 = "Q|Y¼óÔN±S´;ö:dDpQðV¬\\´¦Ë¼È'A\u001fÛ#\u0080\u001fý\u0087K¸sá\u00818P\u0087õ\u0091NþÀ\u0091\u0017ÒÕçÌ~uy¸M\u0086¬\u0097ïÜ\u0087\u0097\u0082ET\u000e\u0090`\u0097\u001eñ\u009d(¾½x\u001e\u0002Òôæ\u000f½©°2ÛnÁ¤\u009dcÓ";
                  var17 = "Q|Y¼óÔN±S´;ö:dDpQðV¬\\´¦Ë¼È'A\u001fÛ#\u0080\u001fý\u0087K¸sá\u00818P\u0087õ\u0091NþÀ\u0091\u0017ÒÕçÌ~uy¸M\u0086¬\u0097ïÜ\u0087\u0097\u0082ET\u000e\u0090`\u0097\u001eñ\u009d(¾½x\u001e\u0002Òôæ\u000f½©°2ÛnÁ¤\u009dcÓ"
                     .length();
                  var14 = '(';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public int J(Object[] var1) {
      return 2;
   }

   public String Q(Object[] var1) {
      return "b";
   }

   public String[] v(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"n">(2585735823018735638L, var2);
   }

   public String G(Object[] var1) {
      long var2 = (Long)var1[0];
      return a<"p">(20062, 9130985930809487540L ^ var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7287;
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
            throw new RuntimeException("com/zelix/vu", var10);
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
         throw new RuntimeException("com/zelix/vu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11068;
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
            throw new RuntimeException("com/zelix/vu", var14);
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
         throw new RuntimeException("com/zelix/vu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
