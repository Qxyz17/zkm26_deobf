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

public class qu {
   private static final long a = ess.a(-5599714161864642040L, 877791154421631728L, MethodHandles.lookup().lookupClass()).a(177981567791613L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Long[] f;
   private static final Map g;

   public static byte[] z(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      return new byte[]{
         (byte)(var3 >>> a<"r">(24638, 4087178753181946545L ^ var1)),
         (byte)(var3 >>> a<"r">(12643, 3031777339885110269L ^ var1)),
         (byte)(var3 >>> a<"r">(26085, 7824115329609045882L ^ var1)),
         (byte)var3
      };
   }

   public static long d(Object[] var0) {
      long var2 = (Long)var0[0];
      byte[] var1 = (byte[])var0[1];
      var2 = a ^ var2;
      return ((long)var1[0] & b<"b">(17664, 8243828306194838357L ^ var2)) << a<"r">(31471, 1992939631055780666L ^ var2)
         | ((long)var1[1] & b<"b">(17996, 3787782987758088216L ^ var2)) << a<"r">(13806, 2948328082145342522L ^ var2)
         | ((long)var1[2] & b<"b">(17996, 3787782987758088216L ^ var2)) << a<"r">(32044, 5028934787246374115L ^ var2)
         | ((long)var1[3] & b<"b">(17996, 3787782987758088216L ^ var2)) << a<"r">(30298, 8577847937374959494L ^ var2)
         | ((long)var1[4] & b<"b">(17996, 3787782987758088216L ^ var2)) << a<"r">(5448, 3791720652733961370L ^ var2)
         | ((long)var1[5] & b<"b">(17996, 3787782987758088216L ^ var2)) << a<"r">(454, 2159395886127661085L ^ var2)
         | ((long)var1[a<"r">(13430, 7452674924392052128L ^ var2)] & b<"b">(17996, 3787782987758088216L ^ var2)) << a<"r">(27091, 4746796997278312451L ^ var2)
         | (long)var1[a<"r">(20558, 3824174183912378774L ^ var2)] & b<"b">(17996, 3787782987758088216L ^ var2);
   }

   public static final int c(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      return (var3 & a<"r">(44, 5093986194365641534L ^ var1)) >> a<"r">(26085, 7824052206388090611L ^ var1);
   }

   public static byte[] M(Object[] var0) {
      long var1 = (Long)var0[0];
      long var3 = (Long)var0[1];
      var3 = a ^ var3;
      byte[] var10000 = new byte[a<"r">(26085, 7824109173974014374L ^ var3)];
      var10000[0] = (byte)((int)(var1 >>> a<"r">(28877, 2304470003330026648L ^ var3)));
      var10000[1] = (byte)((int)(var1 >>> a<"r">(19851, 6736328557308752327L ^ var3)));
      var10000[2] = (byte)((int)(var1 >>> a<"r">(30794, 630707585301808138L ^ var3)));
      var10000[3] = (byte)((int)(var1 >>> a<"r">(11992, 877526273812746902L ^ var3)));
      var10000[4] = (byte)((int)(var1 >>> a<"r">(24638, 4087181370034396269L ^ var3)));
      var10000[5] = (byte)((int)(var1 >>> a<"r">(12643, 3031784341865745697L ^ var3)));
      var10000[a<"r">(32191, 5421201868153127413L ^ var3)] = (byte)((int)(var1 >>> a<"r">(26085, 7824109173974014374L ^ var3)));
      var10000[a<"r">(279, 4351466011338702151L ^ var3)] = (byte)((int)var1);
      return var10000;
   }

   public static final int E(Object[] param0) {
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
      // 0a: istore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 1
      // 15: pop
      // 16: getstatic com/zelix/qu.a J
      // 19: lload 1
      // 1a: lxor
      // 1b: lstore 1
      // 1c: ldc2_w 6365534632512078162
      // 1f: lload 1
      // 20: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: astore 4
      // 27: iload 3
      // 28: aload 4
      // 2a: ifnonnull 58
      // 2d: ifge 57
      // 30: goto 3d
      // 33: ldc2_w 6912380834181677365
      // 36: lload 1
      // 37: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: sipush 16966
      // 40: ldc2_w 2117586783782021473
      // 43: lload 1
      // 44: lxor
      // 45: invokedynamic r (IJ)I bsm=com/zelix/qu.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: iload 3
      // 4b: iadd
      // 4c: ireturn
      // 4d: ldc2_w 6912380834181677365
      // 50: lload 1
      // 51: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: iload 3
      // 58: ireturn
   }

   public static final int y(Object[] var0) {
      int var3 = (Integer)var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      return var3 & a<"r">(10049, 2113963861395926384L ^ var1);
   }

   public static final int C(Object[] var0) {
      int var4 = (Integer)var0[0];
      long var2 = (Long)var0[1];
      int var1 = (Integer)var0[2];
      var2 = a ^ var2;
      return (var4 & a<"r">(21562, 1248963411196357587L ^ var2)) << a<"r">(26085, 7824129291161213470L ^ var2)
         | var1 & a<"r">(21562, 1248963411196357587L ^ var2);
   }

   static {
      long var11 = a ^ 70576251806292L;
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
      String var17 = "®ï\u009e\u0091Î\u009bq\nU\u0098<ßx\u0086\u0099ÊÕMx#k:\u0015÷Ègø+\u0001HüWsüwºíq_åYßÛs\u0012Å'ù\u0004à©©æ\u008aL¾\u0014ó\u008bbÔ\u00adû\u008eÍ\u0095/\u0087?µ\u0094§ìæ¶\t%*\u0012\u0004%@µ\u0007÷ï%âo°joû@<JÓ\u0081\u00898ÞÄ¾\u0007\tà\u0005\u009e«u\u000f1\u0001Ýª\u009c\u001eF\u00ad\u009d©Ï\u0002\u009f¦ÄiÞ\u001c|\u0007æ\f\u0095¿%\u0099\u0085¸&!Ô°\u001d¸\"L\u0016ùõ0\u001eóJ1ù±\u0085E\u000b";
      int var18 = "®ï\u009e\u0091Î\u009bq\nU\u0098<ßx\u0086\u0099ÊÕMx#k:\u0015÷Ègø+\u0001HüWsüwºíq_åYßÛs\u0012Å'ù\u0004à©©æ\u008aL¾\u0014ó\u008bbÔ\u00adû\u008eÍ\u0095/\u0087?µ\u0094§ìæ¶\t%*\u0012\u0004%@µ\u0007÷ï%âo°joû@<JÓ\u0081\u00898ÞÄ¾\u0007\tà\u0005\u009e«u\u000f1\u0001Ýª\u009c\u001eF\u00ad\u009d©Ï\u0002\u009f¦ÄiÞ\u001c|\u0007æ\f\u0095¿%\u0099\u0085¸&!Ô°\u001d¸\"L\u0016ùõ0\u001eóJ1ù±\u0085E\u000b"
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
                     String var4 = "c¥²J¾\tY\u0004÷\u0093\"EÒPáf";
                     int var5 = "c¥²J¾\tY\u0004÷\u0093\"EÒPáf".length();
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

                  var17 = "¡\u000b\u009b\u008dcÌµÿ\u0019¥QP\u0015\u0080\u0089z";
                  var18 = "¡\u000b\u009b\u008dcÌµÿ\u0019¥QP\u0015\u0080\u0089z".length();
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

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8638;
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
            throw new RuntimeException("com/zelix/qu", var14);
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
         throw new RuntimeException("com/zelix/qu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5687;
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
            throw new RuntimeException("com/zelix/qu", var14);
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
         throw new RuntimeException("com/zelix/qu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
