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

public class di {
   private static final long a = prr.a(7225009271698176465L, 2280066954025470389L, MethodHandles.lookup().lookupClass()).a(33676411465022L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Long[] f;
   private static final Map g;

   public static long i(Object[] var0) {
      long var2 = (Long)var0[0];
      byte[] var1 = (byte[])var0[1];
      var2 = a ^ var2;
      return ((long)var1[0] & b<"b">(9799, 3199872327938122497L ^ var2)) << a<"q">(6764, 8531125440315326648L ^ var2)
         | ((long)var1[1] & b<"b">(22923, 1251773982594882764L ^ var2)) << a<"q">(24256, 6406952207069627399L ^ var2)
         | ((long)var1[2] & b<"b">(22923, 1251773982594882764L ^ var2)) << a<"q">(28002, 5148108370286245804L ^ var2)
         | ((long)var1[3] & b<"b">(22923, 1251773982594882764L ^ var2)) << a<"q">(27637, 269310436741869886L ^ var2)
         | ((long)var1[4] & b<"b">(22923, 1251773982594882764L ^ var2)) << a<"q">(8650, 7775058602646518557L ^ var2)
         | ((long)var1[5] & b<"b">(22923, 1251773982594882764L ^ var2)) << a<"q">(27911, 92710213253625796L ^ var2)
         | ((long)var1[a<"q">(13474, 7424232689652674150L ^ var2)] & b<"b">(22923, 1251773982594882764L ^ var2)) << a<"q">(911, 7339256639716923718L ^ var2)
         | (long)var1[a<"q">(5308, 8437701138923228797L ^ var2)] & b<"b">(22923, 1251773982594882764L ^ var2);
   }

   public static byte[] h(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      return new byte[]{
         (byte)(var3 >>> a<"q">(13366, 8794352207165246438L ^ var1)),
         (byte)(var3 >>> a<"q">(5968, 6046638984257038472L ^ var1)),
         (byte)(var3 >>> a<"q">(13765, 4932419446143863327L ^ var1)),
         (byte)var3
      };
   }

   public static byte[] T(Object[] var0) {
      long var1 = (Long)var0[0];
      long var3 = (Long)var0[1];
      var3 = a ^ var3;
      byte[] var10000 = new byte[a<"q">(13765, 4932421940830541909L ^ var3)];
      var10000[0] = (byte)((int)(var1 >>> a<"q">(6420, 4767845548475364492L ^ var3)));
      var10000[1] = (byte)((int)(var1 >>> a<"q">(4434, 479645611022236871L ^ var3)));
      var10000[2] = (byte)((int)(var1 >>> a<"q">(5163, 7137235530956192162L ^ var3)));
      var10000[3] = (byte)((int)(var1 >>> a<"q">(6823, 3200967686186809146L ^ var3)));
      var10000[4] = (byte)((int)(var1 >>> a<"q">(13366, 8794354117774383532L ^ var3)));
      var10000[5] = (byte)((int)(var1 >>> a<"q">(5968, 6046637596594223810L ^ var3)));
      var10000[a<"q">(10483, 6285206417840014717L ^ var3)] = (byte)((int)(var1 >>> a<"q">(13765, 4932421940830541909L ^ var3)));
      var10000[a<"q">(28872, 5793669265848786262L ^ var3)] = (byte)((int)var1);
      return var10000;
   }

   public static final int B(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      int var4 = (Integer)var0[2];
      var1 = a ^ var1;
      return (var3 & a<"q">(4324, 8086693893971614015L ^ var1)) << a<"q">(13765, 4932332662741941254L ^ var1)
         | var4 & a<"q">(25574, 2278426237588662840L ^ var1);
   }

   public static final int X(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      return var3 & a<"q">(25574, 2278537060034207939L ^ var1);
   }

   public static final int S(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      return (var3 & a<"q">(17742, 2574702216027246958L ^ var1)) >> a<"q">(13765, 4932329840058327521L ^ var1);
   }

   public static final int o(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 2
      // 15: pop
      // 16: getstatic com/zelix/di.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w 8931528494612964805
      // 1f: lload 2
      // 20: invokedynamic m (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 1
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: ifge 57
      // 30: goto 3d
      // 33: ldc2_w 6954167998136684865
      // 36: lload 2
      // 37: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: sipush 25348
      // 40: ldc2_w 8508682169670585110
      // 43: lload 2
      // 44: lxor
      // 45: invokedynamic q (IJ)I bsm=com/zelix/di.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: iload 1
      // 4b: iadd
      // 4c: ireturn
      // 4d: ldc2_w 6954167998136684865
      // 50: lload 2
      // 51: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 1
      // 58: ireturn
   }

   static {
      long var11 = a ^ 50165987787238L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var19 = new long[22];
      int var16 = 0;
      String var17 = "\u009bH)\u0086äò¯\u001f¸\r¡±Ì\u008d½2\u001c2UÐRØh¼@]#Ö\u000b\b×a\b,Â\u0004G\u0004ï5\u0082B^\u0084\u008dèÝÕæ7\u00ad4yÞ\b¦6O\u0015\u0002c\u001e\u0001»\u0016:[Îäè½|AÈ¥÷\u0097\u001dÎ*\u0018ª#*\u009dÿï(³ác\u008dÞ¾8j.\u009ebWÔï(O\u0017ñHzÈ¾\u008bHE\u0094ýMÜÎ¢ø\u0081Ñ1&4)qºîùªfº\u0097|\u0001\u008aPë\u001bQ\u008e\u009båð£:\u008fTÄ¤\u000e^kç[J¼\u001e\u0082";
      int var18 = "\u009bH)\u0086äò¯\u001f¸\r¡±Ì\u008d½2\u001c2UÐRØh¼@]#Ö\u000b\b×a\b,Â\u0004G\u0004ï5\u0082B^\u0084\u008dèÝÕæ7\u00ad4yÞ\b¦6O\u0015\u0002c\u001e\u0001»\u0016:[Îäè½|AÈ¥÷\u0097\u001dÎ*\u0018ª#*\u009dÿï(³ác\u008dÞ¾8j.\u009ebWÔï(O\u0017ñHzÈ¾\u008bHE\u0094ýMÜÎ¢ø\u0081Ñ1&4)qºîùªfº\u0097|\u0001\u008aPë\u001bQ\u008e\u009båð£:\u008fTÄ¤\u000e^kç[J¼\u001e\u0082"
         .length();
      byte var15 = 0;

      label41:
      while (true) {
         int var10001 = var15;
         var15 += 8;
         byte[] var20 = var17.substring(var10001, var15).getBytes("ISO-8859-1");
         long[] var25 = var19;
         var10001 = var16++;
         long var31 = ((long)var20[0] & 255L) << 56
            | ((long)var20[1] & 255L) << 48
            | ((long)var20[2] & 255L) << 40
            | ((long)var20[3] & 255L) << 32
            | ((long)var20[4] & 255L) << 24
            | ((long)var20[5] & 255L) << 16
            | ((long)var20[6] & 255L) << 8
            | (long)var20[7] & 255L;
         byte var34 = -1;

         while (true) {
            long var21 = var31;
            byte[] var23 = var13.doFinal(
               new byte[]{
                  (byte)((int)(var21 >>> 56)),
                  (byte)((int)(var21 >>> 48)),
                  (byte)((int)(var21 >>> 40)),
                  (byte)((int)(var21 >>> 32)),
                  (byte)((int)(var21 >>> 24)),
                  (byte)((int)(var21 >>> 16)),
                  (byte)((int)(var21 >>> 8)),
                  (byte)((int)var21)
               }
            );
            long var38 = ((long)var23[0] & 255L) << 56
               | ((long)var23[1] & 255L) << 48
               | ((long)var23[2] & 255L) << 40
               | ((long)var23[3] & 255L) << 32
               | ((long)var23[4] & 255L) << 24
               | ((long)var23[5] & 255L) << 16
               | ((long)var23[6] & 255L) << 8
               | (long)var23[7] & 255L;
            switch (var34) {
               case 0:
                  var25[var10001] = var38;
                  if (var15 >= var18) {
                     b = var19;
                     c = new Integer[22];
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
                     String var4 = "}9®PV¨\u008af\u0099¿Ek¨&p\u0090";
                     int var5 = "}9®PV¨\u008af\u0099¿Ek¨&p\u0090".length();
                     byte var2 = 0;

                     do {
                        int var29 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                        var29 = var3++;
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
                        var38 = ((long)var10[0] & 255L) << 56
                           | ((long)var10[1] & 255L) << 48
                           | ((long)var10[2] & 255L) << 40
                           | ((long)var10[3] & 255L) << 32
                           | ((long)var10[4] & 255L) << 24
                           | ((long)var10[5] & 255L) << 16
                           | ((long)var10[6] & 255L) << 8
                           | (long)var10[7] & 255L;
                        byte var37 = -1;
                        var6[var29] = var38;
                     } while (var2 < var5);

                     e = var6;
                     f = new Long[2];
                     return;
                  }
                  break;
               default:
                  var25[var10001] = var38;
                  if (var15 < var18) {
                     continue label41;
                  }

                  var17 = "\u0002©Ð 'à×±÷\u0097éëàWÛ\u0084";
                  var18 = "\u0002©Ð 'à×±÷\u0097éëàWÛ\u0084".length();
                  var15 = 0;
            }

            byte var28 = var15;
            var15 += 8;
            var20 = var17.substring(var28, var15).getBytes("ISO-8859-1");
            var25 = var19;
            var10001 = var16++;
            var31 = ((long)var20[0] & 255L) << 56
               | ((long)var20[1] & 255L) << 48
               | ((long)var20[2] & 255L) << 40
               | ((long)var20[3] & 255L) << 32
               | ((long)var20[4] & 255L) << 24
               | ((long)var20[5] & 255L) << 16
               | ((long)var20[6] & 255L) << 8
               | (long)var20[7] & 255L;
            var34 = 0;
         }
      }
   }

   private static n9 a(n9 var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23979;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/di", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/di" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16937;
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
            throw new RuntimeException("com/zelix/di", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static long b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = b(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("com/zelix/di" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
