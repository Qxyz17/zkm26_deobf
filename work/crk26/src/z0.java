package com.zelix;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class z0 {
   private final MessageDigest s;
   private byte[] b;
   private static final long a = prr.a(5758069248630416404L, -1879911966642237805L, MethodHandles.lookup().lookupClass()).a(84164442321240L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public z0(long var1, int var3, BufferedInputStream var4) {
      long var5 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 1309131559878L;
      super();
      this.s = m44.a<"i">(a<"r">(1450, 2786318623501620013L ^ var5), -6702160071070659738L, var5);
      m44.a<"h">(this, new Object[]{var7, var4}, -4923649922384610213L, var5);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public z0(long var1, String var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 86632420360728L;
      String var10000 = m44.a<"o">(-5766492787698060849L, var1);
      super();
      String var6 = var10000;
      this.s = m44.a<"o">(a<"r">(6077, 5596239520050090213L ^ var1), -5538465371667768648L, var1);
      BufferedInputStream var7 = null;
      boolean var11 = false /* VF: Semaphore variable */;

      try {
         var11 = true;
         var7 = new BufferedInputStream(new FileInputStream(var3), b<"d">(16057, 873966679407231477L ^ var1));
         m44.a<"n">(this, new Object[]{var4, var7}, -6163772570533057147L, var1);
         var11 = false;
      } finally {
         if (var11) {
            label53: {
               label52: {
                  try {
                     var17 = var7;
                     if (var6 != null) {
                        break label52;
                     }

                     if (var7 == null) {
                        break label53;
                     }
                  } catch (n9 var12) {
                     throw m44.a<"o">(var12, -5564391829703844471L, var1);
                  }

                  var17 = var7;
               }

               m44.a<"p">(var17, -5388726833427064851L, var1);
            }
         }
      }

      BufferedInputStream var18 = var7;
      if (var6 == null) {
         if (var7 == null) {
            return;
         }

         var18 = var7;
      }

      m44.a<"p">(var18, -5388726833427064851L, var1);
   }

   public byte[] g(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return (byte[])m44.a<"u">(this, -3800236409286764502L, var2).clone();
   }

   public String p(Object[] param1) {
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
      // 0c: getstatic com/zelix/z0.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 29223868295087
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: aload 0
      // 1c: lload 4
      // 1e: bipush 1
      // 1f: anewarray 130
      // 22: dup_x2
      // 23: dup_x2
      // 24: pop
      // 25: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28: bipush 0
      // 29: swap
      // 2a: aastore
      // 2b: ldc2_w 5637566082937168698
      // 2e: lload 2
      // 2f: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: astore 7
      // 36: new java/lang/StringBuilder
      // 39: dup
      // 3a: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d: astore 8
      // 3f: ldc2_w 6086154588421179968
      // 42: lload 2
      // 43: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: bipush 0
      // 49: istore 9
      // 4b: astore 6
      // 4d: iload 9
      // 4f: aload 7
      // 51: arraylength
      // 52: if_icmpge c6
      // 55: aload 7
      // 57: iload 9
      // 59: baload
      // 5a: sipush 589
      // 5d: ldc2_w 1212654012211480204
      // 60: lload 2
      // 61: lxor
      // 62: invokedynamic d (IJ)I bsm=com/zelix/z0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: iand
      // 68: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 6b: astore 10
      // 6d: aload 6
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: iflt c3
      // 75: ifnonnull c1
      // 78: aload 10
      // 7a: aload 6
      // 7c: ifnonnull cb
      // 7f: goto 8c
      // 82: ldc2_w 5280575128650409478
      // 85: lload 2
      // 86: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: invokevirtual java/lang/String.length ()I
      // 8f: bipush 1
      // 90: if_icmpne b6
      // 93: goto a0
      // 96: ldc2_w 5280575128650409478
      // 99: lload 2
      // 9a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: new java/lang/StringBuilder
      // a3: dup
      // a4: invokespecial java/lang/StringBuilder.<init> ()V
      // a7: ldc "0"
      // a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ac: aload 10
      // ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b4: astore 10
      // b6: aload 8
      // b8: aload 10
      // ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bd: pop
      // be: iinc 9 1
      // c1: aload 6
      // c3: ifnull 4d
      // c6: aload 8
      // c8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // cb: areturn
   }

   private void E(Object[] var1) {
      long var3 = (Long)var1[0];
      BufferedInputStream var2 = (BufferedInputStream)var1[1];
      var3 = a ^ var3;
      String var10000 = m44.a<"k">(-8359488110292855349L, var3);
      byte[] var6 = new byte[b<"d">(28326, 5873735795031242221L ^ var3)];
      String var5 = var10000;

      while (true) {
         int var7 = m44.a<"t">(var2, var6, -8628690300726673131L, var3);
         if (var7 > 0) {
            m44.a<"t">(m44.a<"u">(this, -7508035096422496483L, var3), var6, 0, var7, -8125968403184213542L, var3);
         }

         while (var7 == -1) {
            m44.a<"t">(var2, -7984026750127049751L, var3);
            m44.a<"w">(this, m44.a<"t">(m44.a<"u">(this, -7508035096422496483L, var3), -8492383192423122444L, var3), -7675649686655760878L, var3);
            if (var3 >= 0L && var5 == null) {
               return;
            }
         }
      }
   }

   static {
      long var11 = a ^ 42067739344462L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[2];
      int var18 = 0;
      String var17 = "O\\\u007f\u0019³ß\u0098©Ç«#¶ß\u009aÃI\u0010_\u0089Ò!×©ifº\u009b&?\\i\u001f\u008d";
      int var19 = "O\\\u007f\u0019³ß\u0098©Ç«#¶ß\u009aÃI\u0010_\u0089Ò!×©ifº\u009b&?\\i\u001f\u008d".length();
      char var16 = 16;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            c = var20;
            d = new String[2];
            h = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "\u0090(é\u0000GÑÅ6¿{È ý×¤9\u009cÈ+\u008b¨j#`";
            int var5 = "\u0090(é\u0000GÑÅ6¿{È ý×¤9\u009cÈ+\u008b¨j#`".length();
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
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            f = var6;
            g = new Integer[3];
            return;
         }

         var16 = var17.charAt(var15);
      }
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9953;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/z0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/z0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7926;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/z0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("com/zelix/z0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
