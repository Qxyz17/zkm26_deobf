package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
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

public class x6 extends x9 implements _8t {
   int X;
   private static final long a = ess.a(-4694853631681935189L, -6020122591205291226L, MethodHandles.lookup().lookupClass()).a(272989966868836L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   protected void T(long var1, DataOutputStream var3) {
      var3.writeByte(x44.a<"n">(-2806636507850833928L, var1).l());
      var3.writeShort(x44.a<"k">(this, -4536063736785506049L, var1));
   }

   public xl f(_y4 var1, long var2, _y4 var4, _y4 var5, _y4 var6, PrintWriter var7) {
      long var8 = var2 ^ 34842138774455L;
      long var10001 = var2 ^ 79027999577250L;
      int var10 = (int)((var2 ^ 79027999577250L) >>> 32);
      int var11 = (int)((var2 ^ 79027999577250L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var2 ^ 124446124793758L;
      long var15 = var2 ^ 2904563378402L;
      long var17 = (var2 ^ 6615983278246L) >>> 8;
      int var19 = (int)((var2 ^ 6615983278246L) << 56 >>> 56);

      try {
         xl var20 = this.j.N(var17, x44.a<"j">(this, -1907877415913499530L, var2), (byte)var19);
         if (var20 instanceof mx) {
            return new x7(this, var10, (mx)var20, var11, var1, (char)var12);
         } else {
            String var23 = x44.a<"n">(this.j, new Object[]{var15}, -1746162578944128322L, var2)
               + b<"t">(32521, 2605266153342884807L ^ var2)
               + b<"t">(7290, 8437031537555323061L ^ var2)
               + b<"t">(1828, 937466730171507688L ^ var2)
               + x44.a<"j">(this, -1907877415913499530L, var2)
               + b<"t">(1828, 937466730171507688L ^ var2)
               + x44.a<"v">(new Object[]{var13, x44.a<"n">(this, var8, -2127515107810922937L, var2)}, -2088652136688790455L, var2)
               + b<"t">(8529, 3143120836076209561L ^ var2);
            throw new _sx(var23);
         }
      } catch (ArrayIndexOutOfBoundsException var22) {
         String var21 = x44.a<"n">(this.j, new Object[]{var15}, -1746162578944128322L, var2)
            + b<"t">(1828, 937466730171507688L ^ var2)
            + b<"t">(10676, 743880309575880061L ^ var2)
            + b<"t">(1828, 937466730171507688L ^ var2)
            + x44.a<"n">(var22, -2133278794689247292L, var2)
            + b<"t">(1828, 937466730171507688L ^ var2)
            + x44.a<"v">(new Object[]{var13, x44.a<"n">(this, var8, -2127515107810922937L, var2)}, -2088652136688790455L, var2)
            + b<"t">(16792, 3659864062528841045L ^ var2);
         throw new _sx(var21);
      }
   }

   public void b(Object[] var1) {
      String var4 = (String)var1[0];
      long var2 = (Long)var1[1];
      long var5 = (var2 ^ 75843117439840L) >>> 8;
      int var7 = (int)((var2 ^ 75843117439840L) << 56 >>> 56);
      ((mx)this.j.N(var5, x44.a<"l">(this, 8521823590800934832L, var2), (byte)var7)).v(var4);
   }

   x6(int var1, long var2, _xx var4, _83 var5) {
      var2 = a ^ var2;
      super(var1, var5);
      x44.a<"q">(this, var4.readUnsignedShort(), 3157548377470835234L, var2);
   }

   public String u(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = (var2 ^ 102929413046829L) >>> 8;
      int var6 = (int)((var2 ^ 102929413046829L) << 56 >>> 56);
      return ((mx)this.j.N(var4, x44.a<"i">(this, -5832583728748880131L, var2), (byte)var6))
         .u()
         .replace((char)c<"k">(138, 936404102878188737L ^ var2), (char)c<"k">(30295, 361176185221063197L ^ var2));
   }

   public boolean s() {
      return true;
   }

   public String W(long var1) {
      long var3 = (var1 ^ 9555437822081L) >>> 8;
      int var5 = (int)((var1 ^ 9555437822081L) << 56 >>> 56);
      return ((mx)this.j.N(var3, x44.a<"m">(this, -8240789976362304431L, var1), (byte)var5)).u();
   }

   static {
      long var11 = a ^ 87202086609921L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "NÊm\u00118¬ðuÇfÉv¥Q\u0099Æ\u0010\u0091UuNBìzÍEb¥Ø\u008c:j\u0082@\u0095H\rAÈ½D.{¥\u0097éËÙhN.gÂ\u009fª\u001e4}Û\u000b6\u0000ç\u0087eL\u009e{\u0096HÜ\u0018´c#*ÕêU\u0092]ì?¦]\u0084çÃ\u0003z\u00adÄ\u009aéË\u0011\u00106\u0010¯¶ßã7@E2UÖ\u0095Å\u0099\u0089ûÚ";
      int var19 = "NÊm\u00118¬ðuÇfÉv¥Q\u0099Æ\u0010\u0091UuNBìzÍEb¥Ø\u008c:j\u0082@\u0095H\rAÈ½D.{¥\u0097éËÙhN.gÂ\u009fª\u001e4}Û\u000b6\u0000ç\u0087eL\u009e{\u0096HÜ\u0018´c#*ÕêU\u0092]ì?¦]\u0084çÃ\u0003z\u00adÄ\u009aéË\u0011\u00106\u0010¯¶ßã7@E2UÖ\u0095Å\u0099\u0089ûÚ"
         .length();
      char var16 = 16;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     b = var20;
                     c = new String[6];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "dSeTÜ1ÅÇÉw\u001cãe \u0013\u008f";
                     int var5 = "dSeTÜ1ÅÇÉw\u001cãe \u0013\u008f".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
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
                        long var10004 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[2];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "©ÿéJ\u0005ÏÞ3Ú\u0006ßí\u008f\u0095\u0010\fa\u0097,Ò\u00ad\u0091\u0084ÔéiÈ\u008cì\\Ã¯W=\u0003þð×\bÆkBRÄe¤}R(Àãøu\u0015\u001bÐà¹üÝ\b\u001dá\r\u0010GhùÚ\rÕÑF2õ\u0087©'\u0089ÁU";
                  var19 = "©ÿéJ\u0005ÏÞ3Ú\u0006ßí\u008f\u0095\u0010\fa\u0097,Ò\u00ad\u0091\u0084ÔéiÈ\u008cì\\Ã¯W=\u0003þð×\bÆkBRÄe¤}R(Àãøu\u0015\u001bÐà¹üÝ\b\u001dá\r\u0010GhùÚ\rÕÑF2õ\u0087©'\u0089ÁU"
                     .length();
                  var16 = '@';
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22504;
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
            throw new RuntimeException("com/zelix/x6", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/x6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28133;
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
            throw new RuntimeException("com/zelix/x6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/x6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
