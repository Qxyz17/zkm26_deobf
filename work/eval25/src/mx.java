package com.zelix;

import java.io.DataOutputStream;
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

public class mx extends xl implements _u0, rt {
   String R;
   static final w5 P;
   private static final long a = ess.a(4861106739055952299L, 3536524029699982850L, MethodHandles.lookup().lookupClass()).a(32246239424159L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public String u() {
      return this.R;
   }

   mx(int var1, int var2, _xx var3, _83 var4, char var5, int var6) {
      long var7 = ((long)var2 << 32 | (long)var5 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 580062180054L;
      super(var1, var4);
      int var11 = var3.readUnsignedShort();
      byte[] var12 = new byte[var11];
      var3.read(var12);
      this.R = sh.I(var12, var9);
      this.R = this.R.intern();
   }

   static {
      long var20 = a ^ 116021223212727L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "L\u0002Ú\u009fç(\u0001ê÷3áAëÎ\u009c\u009d0ãAÓ:\u00078ï\u0094\u0087\u0089»þ\u000b\u009d\u009eÁ<®ý\u0094\u001fÞª,¥\u001füþ?]\u0002;¾\u0019°\u0084\u0093¥+Óbg¼2¥\u009b´\u0013\u0010¶Ul¡\u008cºH\u0019\u0090ãût\u009eX}n";
      int var17 = "L\u0002Ú\u009fç(\u0001ê÷3áAëÎ\u009c\u009d0ãAÓ:\u00078ï\u0094\u0087\u0089»þ\u000b\u009d\u009eÁ<®ý\u0094\u001fÞª,¥\u001füþ?]\u0002;¾\u0019°\u0084\u0093¥+Óbg¼2¥\u009b´\u0013\u0010¶Ul¡\u008cºH\u0019\u0090ãût\u009eX}n"
         .length();
      char var14 = 16;
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
                     b = var18;
                     c = new String[5];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "\n\u0082\u001aL\u0017\u0001oÿGêÕD¿6\u0086\u0015y»\u000b»\u0013ì¾È";
                     int var5 = "\n\u0082\u001aL\u0017\u0001oÿGêÕD¿6\u0086\u0015y»\u000b»\u0013ì¾È".length();
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
                                    f = new Integer[5];
                                    P = x44.a<"n">(1450621877260760131L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "1\rUï|`'|Õ\u0014\u00828ô.\u0086\u0003";
                                 var5 = "1\rUï|`'|Õ\u0014\u00828ô.\u0086\u0003".length();
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

                  var15 = "ÿ°`!Þz3É\u001c¯&=î¢ðo\u0018ÁÂñWvc\u001d¬\u009b\u0096\u008cbU¬]ÌéÎu\f\u001båH\u0082";
                  var17 = "ÿ°`!Þz3É\u001c¯&=î¢ðo\u0018ÁÂñWvc\u001d¬\u009b\u0096\u008cbU¬]ÌéÎu\f\u001båH\u0082".length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   mx P(int var1) {
      return new mx(var1, this.j, this.R);
   }

   protected void T(long param1, DataOutputStream param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 65119074942809
      // 05: lxor
      // 06: dup2
      // 07: bipush 32
      // 09: lushr
      // 0a: l2i
      // 0b: istore 4
      // 0d: dup2
      // 0e: bipush 32
      // 10: lshl
      // 11: bipush 48
      // 13: lushr
      // 14: l2i
      // 15: istore 5
      // 17: dup2
      // 18: bipush 48
      // 1a: lshl
      // 1b: bipush 48
      // 1d: lushr
      // 1e: l2i
      // 1f: istore 6
      // 21: pop2
      // 22: dup2
      // 23: ldc2_w 68928391206800
      // 26: lxor
      // 27: lstore 7
      // 29: dup2
      // 2a: ldc2_w 23054069897800
      // 2d: lxor
      // 2e: lstore 9
      // 30: pop2
      // 31: ldc2_w -2672422542230044920
      // 34: lload 1
      // 35: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: aload 3
      // 3b: getstatic com/zelix/mx.P Lcom/zelix/w5;
      // 3e: invokevirtual com/zelix/w5.l ()I
      // 41: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 44: astore 11
      // 46: aload 0
      // 47: getfield com/zelix/mx.R Ljava/lang/String;
      // 4a: lload 9
      // 4c: dup2_x1
      // 4d: pop2
      // 4e: invokestatic com/zelix/sh.n (JLjava/lang/String;)[B
      // 51: astore 12
      // 53: aload 12
      // 55: arraylength
      // 56: aload 11
      // 58: ifnonnull 86
      // 5b: sipush 23459
      // 5e: ldc2_w 4635495247309768642
      // 61: lload 1
      // 62: lxor
      // 63: invokedynamic w (IJ)I bsm=com/zelix/mx.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: if_icmpgt 89
      // 6b: goto 78
      // 6e: ldc2_w -2771734245722981477
      // 71: lload 1
      // 72: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: bipush 1
      // 79: goto 86
      // 7c: ldc2_w -2771734245722981477
      // 7f: lload 1
      // 80: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: goto 8a
      // 89: bipush 0
      // 8a: bipush 1
      // 8b: anewarray 12
      // 8e: dup
      // 8f: bipush 0
      // 90: new java/lang/StringBuilder
      // 93: dup
      // 94: invokespecial java/lang/StringBuilder.<init> ()V
      // 97: sipush 11767
      // 9a: ldc2_w 8678362406415133549
      // 9d: lload 1
      // 9e: lxor
      // 9f: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/mx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a7: aload 0
      // a8: iload 4
      // aa: iload 5
      // ac: i2s
      // ad: iload 6
      // af: invokevirtual com/zelix/mx.A (ISI)Ljava/lang/String;
      // b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b5: sipush 25618
      // b8: ldc2_w 3397126729102762635
      // bb: lload 1
      // bc: lxor
      // bd: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/mx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c5: aload 12
      // c7: arraylength
      // c8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // cb: sipush 19437
      // ce: ldc2_w 1549683400806337909
      // d1: lload 1
      // d2: lxor
      // d3: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/mx.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // db: aload 0
      // dc: getfield com/zelix/mx.R Ljava/lang/String;
      // df: invokevirtual java/lang/String.length ()I
      // e2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // e8: aastore
      // e9: lload 7
      // eb: dup2_x2
      // ec: pop2
      // ed: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // f0: aload 3
      // f1: aload 12
      // f3: arraylength
      // f4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // f7: aload 3
      // f8: aload 12
      // fa: invokevirtual java/io/DataOutputStream.write ([B)V
      // fd: return
   }

   public final int S(Object[] var1) {
      return this.R.length();
   }

   public String t(long var1) {
      return this.R;
   }

   public w5 m(long var1) {
      return P;
   }

   public mx(int var1, _83 var2, String var3) {
      super(var1, var2);
      this.R = var3;
   }

   public void v(String var1) {
      this.R = var1;
      this.R = this.R.intern();
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   public String g(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 125763864918884L;
      long var6 = var2 ^ 88469187170830L;
      String[] var10000 = x44.a<"s">(6338232232020095508L, var2);
      String var9 = x44.a<"s">(new Object[]{var4, this.N(var6)}, 6240113731566295459L, var2);
      String[] var8 = var10000;

      try {
         if (var8 != null) {
            return var9;
         }

         if (var9.length() <= c<"w">(12142, 5595946549724741140L ^ var2)) {
            return var9;
         }
      } catch (gj var10) {
         throw x44.a<"s">(var10, 6094666735237592711L, var2);
      }

      return var9.substring(0, c<"w">(5231, 7142642424873633040L ^ var2))
         + b<"n">(5229, 8145692860736298986L ^ var2)
         + (var9.length() - c<"w">(19637, 8044680412651167179L ^ var2))
         + b<"n">(4, 2841825349938891655L ^ var2)
         + var9.substring(var9.length() - c<"w">(3979, 6994302982297378551L ^ var2));
   }

   public String N(long var1) {
      return this.u();
   }

   private static gj a(gj var0) {
      return var0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4407;
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
            throw new RuntimeException("com/zelix/mx", var10);
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
         throw new RuntimeException("com/zelix/mx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3022;
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
            throw new RuntimeException("com/zelix/mx", var14);
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
         throw new RuntimeException("com/zelix/mx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
