package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class b6 extends h4 implements _zv {
   private mx E;
   private static char[] U;
   private static char[] g;
   private static char[] s;
   private static final long a = ess.a(-6334957552276217677L, -4142100767665215872L, MethodHandles.lookup().lookupClass()).a(186266341528687L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   private static void f(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast com/zelix/_y7
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/da
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/_x1
      // 017: astore 1
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/ArrayList
      // 028: astore 7
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast java/util/Iterator
      // 030: astore 4
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast java/lang/String
      // 039: astore 5
      // 03b: pop
      // 03c: getstatic com/zelix/b6.a J
      // 03f: lload 2
      // 040: lxor
      // 041: lstore 2
      // 042: ldc2_w 3945658090040066693
      // 045: lload 2
      // 046: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aload 7
      // 04d: bipush 0
      // 04e: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 051: checkcast com/zelix/da
      // 054: astore 10
      // 056: istore 9
      // 058: aload 7
      // 05a: aload 7
      // 05c: invokevirtual java/util/ArrayList.size ()I
      // 05f: bipush 1
      // 060: isub
      // 061: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 064: checkcast com/zelix/da
      // 067: astore 11
      // 069: bipush 0
      // 06a: istore 12
      // 06c: iload 12
      // 06e: aload 7
      // 070: invokevirtual java/util/ArrayList.size ()I
      // 073: bipush 1
      // 074: isub
      // 075: if_icmpge 0e3
      // 078: aload 7
      // 07a: iload 12
      // 07c: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 07f: checkcast com/zelix/da
      // 082: astore 13
      // 084: aload 4
      // 086: invokeinterface java/util/Iterator.remove ()V 1
      // 08b: iload 9
      // 08d: lload 2
      // 08e: lconst_0
      // 08f: lcmp
      // 090: ifle 098
      // 093: ifne 13a
      // 096: iload 9
      // 098: lload 2
      // 099: lconst_0
      // 09a: lcmp
      // 09b: ifle 0e0
      // 09e: ifne 0de
      // 0a1: goto 0ae
      // 0a4: ldc2_w 3312998564586080461
      // 0a7: lload 2
      // 0a8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: iload 12
      // 0b0: aload 7
      // 0b2: invokevirtual java/util/ArrayList.size ()I
      // 0b5: bipush 2
      // 0b6: isub
      // 0b7: if_icmpge 0db
      // 0ba: goto 0c7
      // 0bd: ldc2_w 3312998564586080461
      // 0c0: lload 2
      // 0c1: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 4
      // 0c9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ce: checkcast com/zelix/_x1
      // 0d1: astore 1
      // 0d2: aload 1
      // 0d3: invokevirtual com/zelix/_x1.x ()Ljava/lang/Object;
      // 0d6: checkcast com/zelix/da
      // 0d9: astore 6
      // 0db: iinc 12 1
      // 0de: iload 9
      // 0e0: ifeq 06c
      // 0e3: aload 11
      // 0e5: aload 10
      // 0e7: bipush 0
      // 0e8: anewarray 196
      // 0eb: ldc2_w 3226599150916595561
      // 0ee: lload 2
      // 0ef: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: bipush 1
      // 0f5: anewarray 196
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 0
      // 0fb: swap
      // 0fc: aastore
      // 0fd: ldc2_w 3185827418132188520
      // 100: lload 2
      // 101: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: aload 11
      // 108: aload 5
      // 10a: bipush 1
      // 10b: anewarray 196
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: ldc2_w 3650734931508221727
      // 116: lload 2
      // 117: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: aload 11
      // 11e: bipush 0
      // 11f: bipush 1
      // 120: anewarray 196
      // 123: dup_x1
      // 124: swap
      // 125: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: ldc2_w 3345412736078338537
      // 12e: lload 2
      // 12f: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: lload 2
      // 135: lconst_0
      // 136: lcmp
      // 137: ifle 13a
      // 13a: return
   }

   protected final void O(Object[] var1) {
      long var3 = (Long)var1[0];
      DataOutputStream var2 = (DataOutputStream)var1[1];
      long var5 = var3 ^ 0L;
      super.O(new Object[]{var5, var2});
      var2.writeShort(x44.a<"h">(this, -8190673368493643296L, var3).B());
   }

   public void i(Object[] var1) {
      int var5 = (Integer)var1[0];
      int var6 = (Integer)var1[1];
      HashMap var7 = (HashMap)var1[2];
      HashMap var2 = (HashMap)var1[3];
      long var3 = (Long)var1[4];
      long var8 = var3 ^ 40046054929998L;
      String var10 = x44.a<"o">(this, 4317740683932965983L, var3).u();
      Object[] var10007 = new Object[]{null, null, null, var6, var2, this};
      var10007[2] = var5;
      var10007[1] = var10;
      var10007[0] = var8;
      String var11 = x44.a<"s">(var10007, 2540983217918256538L, var3);

      try {
         if (!var10.equals(var11)) {
            x44.a<"o">(this, 4317740683932965983L, var3).v(var11);
         }
      } catch (g3 var12) {
         throw x44.a<"s">(var12, 2839091455075893841L, var3);
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   void m(Object[] var1) {
      long var2 = (Long)var1[0];
      Set var4 = (Set)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 7483167826115L;
      long var7 = var2 ^ 1833135258535L;
      long var9 = var2 ^ 47778530301204L;
      long var11 = var2 ^ 4202401529530L;
      boolean var10000 = x44.a<"s">(-2932458614341508343L, var2);
      _y7 var14 = x44.a<"m">(this, new Object[]{var11}, -3617544427703626159L, var2);
      boolean var13 = var10000;

      label117: {
         try {
            var28 = var14;
            if (var13) {
               break label117;
            }

            if (var14 == null) {
               return;
            }
         } catch (g3 var25) {
            throw x44.a<"s">(var25, -3713717166074779327L, var2);
         }

         var28 = var14;
      }

      Enumeration var15 = x44.a<"k">(var28, new Object[]{var5}, -3758200206414332032L, var2);

      do {
         String var16;
         label99:
         while (true) {
            if (!var15.hasMoreElements()) {
               return;
            }

            var16 = null;
            da var17 = (da)var15.nextElement();

            try {
               var10000 = var17.r(var7);
            } catch (g3 var23) {
               boolean var10001 = false;
               throw x44.a<"s">(var23, -3713717166074779327L, var2);
            }

            label92:
            while (true) {
               label127: {
                  label89: {
                     try {
                        if (var13) {
                           break label89;
                        }

                        if (var10000) {
                           break label127;
                        }
                     } catch (g3 var22) {
                        boolean var33 = false;
                        throw x44.a<"s">(var22, -3713717166074779327L, var2);
                     }

                     try {
                        var31 = var17;
                        if (var13) {
                           break;
                        }

                        var10000 = var17.O();
                     } catch (g3 var21) {
                        throw x44.a<"s">(var21, -3713717166074779327L, var2);
                     }
                  }

                  if (var10000) {
                     break label99;
                  }

                  var31 = var17;
                  break;
               }

               StringBuffer var18 = new StringBuffer();
               var18.append(var17.x());
               da var19 = x44.a<"k">(var17, new Object[0], -3890088144771795525L, var2);

               while (var19 != null) {
                  var18.append("$");
                  var18.append(var19.x());
                  var19 = x44.a<"k">(var19, new Object[0], -3890088144771795525L, var2);
                  if (var13) {
                     continue label99;
                  }

                  var10000 = var13;
                  if (var2 <= 0L) {
                     continue label92;
                  }

                  if (var13) {
                     break;
                  }
               }

               var16 = var18.toString();
               if (var2 > 0L) {
                  break label99;
               }
               continue label99;
            }

            var16 = var31.x();
            break;
         }

         label107: {
            try {
               var32 = var16;
               if (var13) {
                  break label107;
               }

               if (var16 == null) {
                  continue;
               }
            } catch (g3 var24) {
               throw x44.a<"s">(var24, -3713717166074779327L, var2);
            }

            var32 = var16;
         }

         hy var27 = yn.Z(var9, var32);

         try {
            if (var2 >= 0L && var27 != null) {
               var4.add(var27);
            }
         } catch (g3 var20) {
            throw x44.a<"s">(var20, -3713717166074779327L, var2);
         }
      } while (!var13);
   }

   static {
      long var20 = a ^ 56081512105293L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "\b'&óiè\u0006Oj\u0002\u0087\u001e¥\u0098\u0096á@BÓý\u0007~j8ý\u0019íÁ%;yü0H<\u0082\u0099qäðPM+¯Â\u008e,\u0093Æ*·\u000e\u0014¯FÚ\u0017oyt¾{íçÎÉÜÛï\u009d\u0007ý/û\u0095\u009e56ãôö\u00103ì\u009f-Óè\u0012*¹ìF\u000f\u0089E¶?\u0010xø.§g\f¬;üVn \r\u001a\u0000« ïâ\f¨+æù\u001cþ\nª¶Ý\u000eÛÇ\u009e\u008bp\tO[G\u008d?î\u009a\u0090ôÔ©-\u0010º*¥`\u009bD\u0091m<\\8ísù\u001a\u008e";
      int var17 = "\b'&óiè\u0006Oj\u0002\u0087\u001e¥\u0098\u0096á@BÓý\u0007~j8ý\u0019íÁ%;yü0H<\u0082\u0099qäðPM+¯Â\u008e,\u0093Æ*·\u000e\u0014¯FÚ\u0017oyt¾{íçÎÉÜÛï\u009d\u0007ý/û\u0095\u009e56ãôö\u00103ì\u009f-Óè\u0012*¹ìF\u000f\u0089E¶?\u0010xø.§g\f¬;üVn \r\u001a\u0000« ïâ\f¨+æù\u001cþ\nª¶Ý\u000eÛÇ\u009e\u008bp\tO[G\u008d?î\u009a\u0090ôÔ©-\u0010º*¥`\u009bD\u0091m<\\8ísù\u001a\u008e"
         .length();
      char var14 = ' ';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = c(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     d = new String[8];
                     i = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[12];
                     int var3 = 0;
                     String var4 = "Bwà;F(\u001a8OV\u0086zô\u0098q\u007f@~\u000fr\u000e\u0013\u0081JÈÊ¹>ðÿ2C}¾\u0005¯î´\u008eÝ&ñàÇxxÅükËç»\u0096l\u0016\u0002\u0004bk1F\u0017\u0011c\u0081\u0083\u001fóLåÕ\u0010ÙÿZ\u001b\u0012\"ë ";
                     int var5 = "Bwà;F(\u001a8OV\u0086zô\u0098q\u007f@~\u000fr\u000e\u0013\u0081JÈÊ¹>ðÿ2C}¾\u0005¯î´\u008eÝ&ñàÇxxÅükËç»\u0096l\u0016\u0002\u0004bk1F\u0017\u0011c\u0081\u0083\u001fóLåÕ\u0010ÙÿZ\u001b\u0012\"ë "
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
                                    f = var6;
                                    h = new Integer[12];
                                    x44.a<"r">(
                                       new char[]{(char)c<"w">(3400, 4576815642672653169L ^ var20), (char)c<"w">(12102, 6000054590691066233L ^ var20)},
                                       -175284156595907366L,
                                       var20
                                    );
                                    x44.a<"r">(
                                       new char[]{
                                          (char)c<"w">(30912, 317968568187688699L ^ var20),
                                          (char)c<"w">(12102, 6000054590691066233L ^ var20),
                                          (char)c<"w">(542, 7656577410794777646L ^ var20)
                                       },
                                       -2128014821324668321L,
                                       var20
                                    );
                                    x44.a<"r">(
                                       new char[]{
                                          (char)c<"w">(30249, 5620821658486216731L ^ var20),
                                          (char)c<"w">(26685, 8569895442139022851L ^ var20),
                                          (char)c<"w">(16080, 964865181942436067L ^ var20),
                                          (char)c<"w">(542, 7656577410794777646L ^ var20)
                                       },
                                       -266215997063347715L,
                                       var20
                                    );
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "Ó\u0011Z\u001au¿Eò\u0014\u009d«Å\u0000þ\u0015±";
                                 var5 = "Ó\u0011Z\u001au¿Eò\u0014\u009d«Å\u0000þ\u0015±".length();
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

                  var15 = "\u0014ºzc\u000e}\u009bôIR\u0011ûØnÅ\u0094\u0010TÑçÂªk\u0092ù\n¦Þj\u0094¼\u0081*";
                  var17 = "\u0014ºzc\u000e}\u009bôIR\u0011ûØnÅ\u0094\u0010TÑçÂªk\u0092ù\n¦Þj\u0094¼\u0081*".length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: lload 6
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: dup2
      // 23: bipush 48
      // 25: lushr
      // 26: l2i
      // 27: istore 8
      // 29: dup2
      // 2a: bipush 16
      // 2c: lshl
      // 2d: bipush 32
      // 2f: lushr
      // 30: l2i
      // 31: istore 9
      // 33: dup2
      // 34: bipush 48
      // 36: lshl
      // 37: bipush 48
      // 39: lushr
      // 3a: l2i
      // 3b: istore 10
      // 3d: pop2
      // 3e: pop2
      // 3f: ldc2_w -4813852749984134795
      // 42: lload 6
      // 44: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: istore 11
      // 4b: aload 0
      // 4c: iload 11
      // 4e: ifne 9b
      // 51: ldc2_w -5005782814802961101
      // 54: lload 6
      // 56: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: aload 1
      // 5c: if_acmpne 8c
      // 5f: goto 6d
      // 62: ldc2_w -6482320432604331203
      // 65: lload 6
      // 67: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 3
      // 6f: ldc2_w -5005782814802961101
      // 72: lload 6
      // 74: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: iload 11
      // 7b: ifeq a8
      // 7e: goto 8c
      // 81: ldc2_w -6482320432604331203
      // 84: lload 6
      // 86: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: aload 0
      // 8d: goto 9b
      // 90: ldc2_w -6482320432604331203
      // 93: lload 6
      // 95: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: aload 1
      // 9c: iload 8
      // 9e: i2s
      // 9f: aload 3
      // a0: iload 9
      // a2: iload 10
      // a4: i2s
      // a5: invokespecial com/zelix/h4.b (Lcom/zelix/mx;SLcom/zelix/mx;IS)V
      // a8: return
   }

   public static String x(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 6
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Integer
      // 019: invokevirtual java/lang/Integer.intValue ()I
      // 01c: istore 7
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 3
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/util/HashMap
      // 02e: astore 4
      // 030: dup
      // 031: bipush 5
      // 032: aaload
      // 033: checkcast com/zelix/h8
      // 036: astore 5
      // 038: pop
      // 039: getstatic com/zelix/b6.a J
      // 03c: lload 1
      // 03d: lxor
      // 03e: lstore 1
      // 03f: lload 1
      // 040: dup2
      // 041: ldc2_w 124752787124285
      // 044: lxor
      // 045: lstore 8
      // 047: dup2
      // 048: ldc2_w 102156793790904
      // 04b: lxor
      // 04c: lstore 10
      // 04e: dup2
      // 04f: ldc2_w 6679230567548
      // 052: lxor
      // 053: lstore 12
      // 055: dup2
      // 056: ldc2_w 1613326782232
      // 059: lxor
      // 05a: lstore 14
      // 05c: dup2
      // 05d: ldc2_w 1376881146002
      // 060: lxor
      // 061: lstore 16
      // 063: dup2
      // 064: ldc2_w 136808227536082
      // 067: lxor
      // 068: lstore 18
      // 06a: dup2
      // 06b: ldc2_w 78194807300983
      // 06e: lxor
      // 06f: lstore 20
      // 071: dup2
      // 072: ldc2_w 16982824714152
      // 075: lxor
      // 076: lstore 22
      // 078: pop2
      // 079: ldc2_w -6493702886659680885
      // 07c: lload 1
      // 07d: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: istore 24
      // 084: iload 3
      // 085: bipush 1
      // 086: if_icmpne 096
      // 089: aload 6
      // 08b: areturn
      // 08c: ldc2_w -6652592560405625190
      // 08f: lload 1
      // 090: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: aload 6
      // 098: aload 5
      // 09a: lload 16
      // 09c: bipush 3
      // 09d: anewarray 196
      // 0a0: dup_x2
      // 0a1: dup_x2
      // 0a2: pop
      // 0a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a6: bipush 2
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x1
      // 0aa: swap
      // 0ab: bipush 1
      // 0ac: swap
      // 0ad: aastore
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: bipush 0
      // 0b1: swap
      // 0b2: aastore
      // 0b3: ldc2_w -6390206147554885626
      // 0b6: lload 1
      // 0b7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/_y7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bc: astore 25
      // 0be: aload 25
      // 0c0: iload 24
      // 0c2: lload 1
      // 0c3: lconst_0
      // 0c4: lcmp
      // 0c5: iflt 0eb
      // 0c8: ifeq 0ea
      // 0cb: ifnonnull 0e8
      // 0ce: goto 0db
      // 0d1: ldc2_w -6652592560405625190
      // 0d4: lload 1
      // 0d5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 6
      // 0dd: areturn
      // 0de: ldc2_w -6652592560405625190
      // 0e1: lload 1
      // 0e2: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 25
      // 0ea: bipush 0
      // 0eb: anewarray 196
      // 0ee: ldc2_w -4857981334893681715
      // 0f1: lload 1
      // 0f2: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: astore 26
      // 0f9: aload 26
      // 0fb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 100: ifeq 60c
      // 103: aload 26
      // 105: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10a: checkcast com/zelix/_x1
      // 10d: astore 27
      // 10f: aload 27
      // 111: invokevirtual com/zelix/_x1.x ()Ljava/lang/Object;
      // 114: checkcast com/zelix/da
      // 117: astore 28
      // 119: aload 28
      // 11b: lload 12
      // 11d: invokevirtual com/zelix/da.r (J)Z
      // 120: iload 24
      // 122: ifeq 598
      // 125: ifeq 574
      // 128: goto 135
      // 12b: ldc2_w -6652592560405625190
      // 12e: lload 1
      // 12f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: new java/util/ArrayList
      // 138: dup
      // 139: invokespecial java/util/ArrayList.<init> ()V
      // 13c: astore 29
      // 13e: aload 29
      // 140: aload 28
      // 142: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 145: pop
      // 146: aload 28
      // 148: bipush 0
      // 149: anewarray 196
      // 14c: ldc2_w -6496259082148554144
      // 14f: lload 1
      // 150: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/da; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: astore 30
      // 157: aload 30
      // 159: ifnull 198
      // 15c: aload 29
      // 15e: aload 30
      // 160: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 163: pop
      // 164: aload 30
      // 166: bipush 0
      // 167: anewarray 196
      // 16a: ldc2_w -6496259082148554144
      // 16d: lload 1
      // 16e: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/da; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: astore 30
      // 175: iload 24
      // 177: lload 1
      // 178: lconst_0
      // 179: lcmp
      // 17a: ifle 609
      // 17d: ifeq 607
      // 180: iload 24
      // 182: ifne 157
      // 185: lload 1
      // 186: lconst_0
      // 187: lcmp
      // 188: iflt 175
      // 18b: goto 198
      // 18e: ldc2_w -6652592560405625190
      // 191: lload 1
      // 192: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: new java/lang/StringBuffer
      // 19b: dup
      // 19c: invokespecial java/lang/StringBuffer.<init> ()V
      // 19f: astore 31
      // 1a1: bipush 0
      // 1a2: istore 32
      // 1a4: iload 32
      // 1a6: aload 29
      // 1a8: invokevirtual java/util/ArrayList.size ()I
      // 1ab: if_icmpge 1ee
      // 1ae: iload 32
      // 1b0: iload 24
      // 1b2: ifeq 100
      // 1b5: lload 1
      // 1b6: lconst_0
      // 1b7: lcmp
      // 1b8: ifle 120
      // 1bb: ifle 1d3
      // 1be: aload 31
      // 1c0: ldc "$"
      // 1c2: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1c5: pop
      // 1c6: goto 1d3
      // 1c9: ldc2_w -6652592560405625190
      // 1cc: lload 1
      // 1cd: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: athrow
      // 1d3: aload 31
      // 1d5: aload 29
      // 1d7: iload 32
      // 1d9: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1dc: checkcast com/zelix/da
      // 1df: invokevirtual com/zelix/da.x ()Ljava/lang/String;
      // 1e2: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1e5: pop
      // 1e6: iinc 32 1
      // 1e9: iload 24
      // 1eb: ifne 1a4
      // 1ee: aload 31
      // 1f0: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1f3: astore 32
      // 1f5: aload 32
      // 1f7: lload 8
      // 1f9: bipush 2
      // 1fa: anewarray 196
      // 1fd: dup_x2
      // 1fe: dup_x2
      // 1ff: pop
      // 200: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 203: bipush 1
      // 204: swap
      // 205: aastore
      // 206: dup_x1
      // 207: swap
      // 208: bipush 0
      // 209: swap
      // 20a: aastore
      // 20b: ldc2_w -6370105708842156217
      // 20e: lload 1
      // 20f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: astore 33
      // 216: aload 32
      // 218: aload 4
      // 21a: lload 10
      // 21c: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 21f: checkcast java/lang/String
      // 222: astore 34
      // 224: aload 34
      // 226: lload 20
      // 228: bipush 2
      // 229: anewarray 196
      // 22c: dup_x2
      // 22d: dup_x2
      // 22e: pop
      // 22f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 232: bipush 1
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 0
      // 238: swap
      // 239: aastore
      // 23a: ldc2_w -5093702276975983626
      // 23d: lload 1
      // 23e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: astore 35
      // 245: aload 34
      // 247: lload 8
      // 249: bipush 2
      // 24a: anewarray 196
      // 24d: dup_x2
      // 24e: dup_x2
      // 24f: pop
      // 250: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 253: bipush 1
      // 254: swap
      // 255: aastore
      // 256: dup_x1
      // 257: swap
      // 258: bipush 0
      // 259: swap
      // 25a: aastore
      // 25b: ldc2_w -6370105708842156217
      // 25e: lload 1
      // 25f: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: astore 36
      // 266: iload 7
      // 268: iload 24
      // 26a: lload 1
      // 26b: lconst_0
      // 26c: lcmp
      // 26d: ifle 122
      // 270: ifeq 2d8
      // 273: ifeq 2d7
      // 276: goto 283
      // 279: ldc2_w -6652592560405625190
      // 27c: lload 1
      // 27d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: athrow
      // 283: iload 7
      // 285: iload 24
      // 287: ifeq 2f3
      // 28a: goto 297
      // 28d: ldc2_w -6652592560405625190
      // 290: lload 1
      // 291: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 296: athrow
      // 297: lload 1
      // 298: lconst_0
      // 299: lcmp
      // 29a: ifle 2e6
      // 29d: bipush 2
      // 29e: if_icmpne 2e5
      // 2a1: goto 2ae
      // 2a4: ldc2_w -6652592560405625190
      // 2a7: lload 1
      // 2a8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: athrow
      // 2ae: aload 33
      // 2b0: aload 36
      // 2b2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b5: iload 24
      // 2b7: ifeq 2f3
      // 2ba: goto 2c7
      // 2bd: ldc2_w -6652592560405625190
      // 2c0: lload 1
      // 2c1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: athrow
      // 2c7: ifeq 2e5
      // 2ca: goto 2d7
      // 2cd: ldc2_w -6652592560405625190
      // 2d0: lload 1
      // 2d1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: athrow
      // 2d7: bipush 1
      // 2d8: istore 37
      // 2da: iload 24
      // 2dc: lload 1
      // 2dd: lconst_0
      // 2de: lcmp
      // 2df: iflt 2fc
      // 2e2: ifne 2f5
      // 2e5: bipush 0
      // 2e6: goto 2f3
      // 2e9: ldc2_w -6652592560405625190
      // 2ec: lload 1
      // 2ed: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: athrow
      // 2f3: istore 37
      // 2f5: aload 32
      // 2f7: aload 34
      // 2f9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2fc: iload 24
      // 2fe: ifeq 313
      // 301: ifeq 316
      // 304: goto 311
      // 307: ldc2_w -6652592560405625190
      // 30a: lload 1
      // 30b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 310: athrow
      // 311: iload 37
      // 313: ifne 569
      // 316: new java/util/StringTokenizer
      // 319: dup
      // 31a: aload 36
      // 31c: ldc "$"
      // 31e: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 321: astore 38
      // 323: aload 38
      // 325: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 328: istore 39
      // 32a: new java/util/StringTokenizer
      // 32d: dup
      // 32e: aload 33
      // 330: ldc "$"
      // 332: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 335: astore 40
      // 337: aload 40
      // 339: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 33c: istore 41
      // 33e: aload 38
      // 340: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 343: iload 24
      // 345: lload 1
      // 346: lconst_0
      // 347: lcmp
      // 348: ifle 3cc
      // 34b: ifeq 3ca
      // 34e: bipush 1
      // 34f: if_icmpne 3bb
      // 352: goto 35f
      // 355: ldc2_w -6652592560405625190
      // 358: lload 1
      // 359: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35e: athrow
      // 35f: aload 25
      // 361: aload 28
      // 363: aload 27
      // 365: lload 18
      // 367: aload 29
      // 369: aload 26
      // 36b: aload 34
      // 36d: bipush 7
      // 36f: anewarray 196
      // 372: dup_x1
      // 373: swap
      // 374: bipush 6
      // 376: swap
      // 377: aastore
      // 378: dup_x1
      // 379: swap
      // 37a: bipush 5
      // 37b: swap
      // 37c: aastore
      // 37d: dup_x1
      // 37e: swap
      // 37f: bipush 4
      // 380: swap
      // 381: aastore
      // 382: dup_x2
      // 383: dup_x2
      // 384: pop
      // 385: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 388: bipush 3
      // 389: swap
      // 38a: aastore
      // 38b: dup_x1
      // 38c: swap
      // 38d: bipush 2
      // 38e: swap
      // 38f: aastore
      // 390: dup_x1
      // 391: swap
      // 392: bipush 1
      // 393: swap
      // 394: aastore
      // 395: dup_x1
      // 396: swap
      // 397: bipush 0
      // 398: swap
      // 399: aastore
      // 39a: ldc2_w -5026475678478742990
      // 39d: lload 1
      // 39e: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a3: iload 24
      // 3a5: lload 1
      // 3a6: lconst_0
      // 3a7: lcmp
      // 3a8: ifle 571
      // 3ab: ifne 569
      // 3ae: goto 3bb
      // 3b1: ldc2_w -6652592560405625190
      // 3b4: lload 1
      // 3b5: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ba: athrow
      // 3bb: iload 37
      // 3bd: goto 3ca
      // 3c0: ldc2_w -6652592560405625190
      // 3c3: lload 1
      // 3c4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: athrow
      // 3ca: iload 24
      // 3cc: ifeq 3e0
      // 3cf: ifeq 518
      // 3d2: goto 3df
      // 3d5: ldc2_w -6652592560405625190
      // 3d8: lload 1
      // 3d9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3de: athrow
      // 3df: bipush 0
      // 3e0: istore 42
      // 3e2: aconst_null
      // 3e3: astore 43
      // 3e5: aconst_null
      // 3e6: astore 44
      // 3e8: aload 29
      // 3ea: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 3ed: astore 45
      // 3ef: aload 45
      // 3f1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f6: ifeq 507
      // 3f9: aload 45
      // 3fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 400: checkcast com/zelix/da
      // 403: astore 46
      // 405: aload 46
      // 407: invokevirtual com/zelix/da.x ()Ljava/lang/String;
      // 40a: astore 47
      // 40c: iload 42
      // 40e: iload 24
      // 410: ifeq 100
      // 413: ifne 48a
      // 416: aload 47
      // 418: aload 4
      // 41a: lload 10
      // 41c: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 41f: checkcast java/lang/String
      // 422: astore 48
      // 424: iload 24
      // 426: lload 1
      // 427: lconst_0
      // 428: lcmp
      // 429: ifle 481
      // 42c: ifeq 47f
      // 42f: aload 47
      // 431: aload 48
      // 433: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 436: ifne 469
      // 439: goto 446
      // 43c: ldc2_w -6652592560405625190
      // 43f: lload 1
      // 440: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 445: athrow
      // 446: aload 46
      // 448: aload 48
      // 44a: bipush 1
      // 44b: anewarray 196
      // 44e: dup_x1
      // 44f: swap
      // 450: bipush 0
      // 451: swap
      // 452: aastore
      // 453: ldc2_w -4828675841032595128
      // 456: lload 1
      // 457: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45c: goto 469
      // 45f: ldc2_w -6652592560405625190
      // 462: lload 1
      // 463: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 468: athrow
      // 469: new java/lang/StringBuffer
      // 46c: dup
      // 46d: aload 47
      // 46f: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 472: astore 43
      // 474: new java/lang/StringBuffer
      // 477: dup
      // 478: aload 48
      // 47a: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 47d: astore 44
      // 47f: iload 24
      // 481: lload 1
      // 482: lconst_0
      // 483: lcmp
      // 484: ifle 504
      // 487: ifne 4ff
      // 48a: aload 43
      // 48c: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 48f: astore 48
      // 491: aload 44
      // 493: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 496: astore 49
      // 498: aload 43
      // 49a: ldc "$"
      // 49c: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 49f: pop
      // 4a0: aload 43
      // 4a2: aload 47
      // 4a4: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 4a7: pop
      // 4a8: aload 43
      // 4aa: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 4ad: astore 50
      // 4af: aload 50
      // 4b1: aload 4
      // 4b3: lload 10
      // 4b5: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 4b8: checkcast java/lang/String
      // 4bb: astore 51
      // 4bd: aload 51
      // 4bf: aload 49
      // 4c1: invokevirtual java/lang/String.length ()I
      // 4c4: bipush 1
      // 4c5: iadd
      // 4c6: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4c9: astore 52
      // 4cb: aload 50
      // 4cd: aload 48
      // 4cf: invokevirtual java/lang/String.length ()I
      // 4d2: bipush 1
      // 4d3: iadd
      // 4d4: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4d7: astore 53
      // 4d9: aload 44
      // 4db: ldc "$"
      // 4dd: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 4e0: pop
      // 4e1: aload 44
      // 4e3: aload 52
      // 4e5: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 4e8: pop
      // 4e9: aload 46
      // 4eb: aload 52
      // 4ed: bipush 1
      // 4ee: anewarray 196
      // 4f1: dup_x1
      // 4f2: swap
      // 4f3: bipush 0
      // 4f4: swap
      // 4f5: aastore
      // 4f6: ldc2_w -4828675841032595128
      // 4f9: lload 1
      // 4fa: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ff: iinc 42 1
      // 502: iload 24
      // 504: ifne 3ef
      // 507: iload 24
      // 509: lload 1
      // 50a: lconst_0
      // 50b: lcmp
      // 50c: ifle 100
      // 50f: lload 1
      // 510: lconst_0
      // 511: lcmp
      // 512: iflt 571
      // 515: ifne 569
      // 518: aload 25
      // 51a: aload 28
      // 51c: aload 27
      // 51e: lload 18
      // 520: aload 29
      // 522: aload 26
      // 524: aload 34
      // 526: bipush 7
      // 528: anewarray 196
      // 52b: dup_x1
      // 52c: swap
      // 52d: bipush 6
      // 52f: swap
      // 530: aastore
      // 531: dup_x1
      // 532: swap
      // 533: bipush 5
      // 534: swap
      // 535: aastore
      // 536: dup_x1
      // 537: swap
      // 538: bipush 4
      // 539: swap
      // 53a: aastore
      // 53b: dup_x2
      // 53c: dup_x2
      // 53d: pop
      // 53e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 541: bipush 3
      // 542: swap
      // 543: aastore
      // 544: dup_x1
      // 545: swap
      // 546: bipush 2
      // 547: swap
      // 548: aastore
      // 549: dup_x1
      // 54a: swap
      // 54b: bipush 1
      // 54c: swap
      // 54d: aastore
      // 54e: dup_x1
      // 54f: swap
      // 550: bipush 0
      // 551: swap
      // 552: aastore
      // 553: ldc2_w -5026475678478742990
      // 556: lload 1
      // 557: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55c: goto 569
      // 55f: ldc2_w -6652592560405625190
      // 562: lload 1
      // 563: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 568: athrow
      // 569: lload 1
      // 56a: lconst_0
      // 56b: lcmp
      // 56c: iflt 574
      // 56f: iload 24
      // 571: ifne 607
      // 574: aload 28
      // 576: iload 24
      // 578: ifeq 59d
      // 57b: goto 588
      // 57e: ldc2_w -6652592560405625190
      // 581: lload 1
      // 582: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 587: athrow
      // 588: invokevirtual com/zelix/da.O ()Z
      // 58b: goto 598
      // 58e: ldc2_w -6652592560405625190
      // 591: lload 1
      // 592: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 597: athrow
      // 598: ifne 607
      // 59b: aload 28
      // 59d: invokevirtual com/zelix/da.x ()Ljava/lang/String;
      // 5a0: astore 29
      // 5a2: aload 29
      // 5a4: iload 24
      // 5a6: ifeq 5d2
      // 5a9: ifnull 607
      // 5ac: goto 5b9
      // 5af: ldc2_w -6652592560405625190
      // 5b2: lload 1
      // 5b3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b8: athrow
      // 5b9: aload 29
      // 5bb: aload 4
      // 5bd: lload 10
      // 5bf: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 5c2: checkcast java/lang/String
      // 5c5: goto 5d2
      // 5c8: ldc2_w -6652592560405625190
      // 5cb: lload 1
      // 5cc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d1: athrow
      // 5d2: astore 30
      // 5d4: lload 1
      // 5d5: lconst_0
      // 5d6: lcmp
      // 5d7: ifle 5fa
      // 5da: aload 29
      // 5dc: aload 30
      // 5de: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5e1: ifne 607
      // 5e4: aload 28
      // 5e6: aload 30
      // 5e8: bipush 1
      // 5e9: anewarray 196
      // 5ec: dup_x1
      // 5ed: swap
      // 5ee: bipush 0
      // 5ef: swap
      // 5f0: aastore
      // 5f1: ldc2_w -4828675841032595128
      // 5f4: lload 1
      // 5f5: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fa: goto 607
      // 5fd: ldc2_w -6652592560405625190
      // 600: lload 1
      // 601: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 606: athrow
      // 607: iload 24
      // 609: ifne 0f9
      // 60c: new java/lang/StringBuffer
      // 60f: dup
      // 610: aload 6
      // 612: invokevirtual java/lang/String.length ()I
      // 615: invokespecial java/lang/StringBuffer.<init> (I)V
      // 618: lload 1
      // 619: lconst_0
      // 61a: lcmp
      // 61b: ifle 10a
      // 61e: astore 26
      // 620: aload 25
      // 622: lload 14
      // 624: bipush 1
      // 625: anewarray 196
      // 628: dup_x2
      // 629: dup_x2
      // 62a: pop
      // 62b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62e: bipush 0
      // 62f: swap
      // 630: aastore
      // 631: ldc2_w -6628393293395406757
      // 634: lload 1
      // 635: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63a: astore 27
      // 63c: aload 27
      // 63e: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 643: ifeq 691
      // 646: lload 1
      // 647: lconst_0
      // 648: lcmp
      // 649: iflt 679
      // 64c: aload 26
      // 64e: aload 27
      // 650: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 655: checkcast com/zelix/da
      // 658: lload 22
      // 65a: bipush 1
      // 65b: anewarray 196
      // 65e: dup_x2
      // 65f: dup_x2
      // 660: pop
      // 661: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 664: bipush 0
      // 665: swap
      // 666: aastore
      // 667: ldc2_w -4809130310144812717
      // 66a: lload 1
      // 66b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 670: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 673: iload 24
      // 675: ifeq 693
      // 678: pop
      // 679: iload 24
      // 67b: ifne 63c
      // 67e: lload 1
      // 67f: lconst_0
      // 680: lcmp
      // 681: ifle 646
      // 684: goto 691
      // 687: ldc2_w -6652592560405625190
      // 68a: lload 1
      // 68b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 690: athrow
      // 691: aload 26
      // 693: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 696: areturn
   }

   void B(Object[] param1) {
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
      // 04: checkcast com/zelix/xl
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/b6.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 125899162152198
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -906764300136103168
      // 25: lload 3
      // 26: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: iload 7
      // 2f: ifeq 99
      // 32: aload 2
      // 33: instanceof com/zelix/mx
      // 36: ifne 8b
      // 39: goto 46
      // 3c: ldc2_w -781933785837694959
      // 3f: lload 3
      // 40: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: new com/zelix/_sx
      // 49: dup
      // 4a: new java/lang/StringBuilder
      // 4d: dup
      // 4e: invokespecial java/lang/StringBuilder.<init> ()V
      // 51: aload 0
      // 52: lload 5
      // 54: invokevirtual com/zelix/b6.k (J)Ljava/lang/String;
      // 57: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a: sipush 14876
      // 5d: ldc2_w 5508090060084477229
      // 60: lload 3
      // 61: lxor
      // 62: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/b6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a: sipush 16337
      // 6d: ldc2_w 1101045578281646311
      // 70: lload 3
      // 71: lxor
      // 72: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/b6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7d: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 80: athrow
      // 81: ldc2_w -781933785837694959
      // 84: lload 3
      // 85: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: aload 0
      // 8c: aload 2
      // 8d: checkcast com/zelix/mx
      // 90: ldc2_w -1608968445688132065
      // 93: lload 3
      // 94: invokedynamic p (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: return
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      long var6 = var1 ^ 10727274753381L;
      var3.H(this.c, this, this.x(), var6);
      x44.a<"k">(this, -4816733021600540013L, var1).O(var4, var3, this, this.x());
   }

   private _y7 U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 111815911971702L;
      String var6 = x44.a<"h">(this, -2538743456354829456L, var2).u();
      return x44.a<"t">(new Object[]{var6, this, var4}, -4272498023557422110L, var2);
   }

   protected final void j(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 6
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 5
      // 23: pop
      // 24: lload 2
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: aload 0
      // 2e: aload 4
      // 30: lload 7
      // 32: aload 6
      // 34: aload 5
      // 36: bipush 4
      // 37: anewarray 196
      // 3a: dup_x1
      // 3b: swap
      // 3c: bipush 3
      // 3d: swap
      // 3e: aastore
      // 3f: dup_x1
      // 40: swap
      // 41: bipush 2
      // 42: swap
      // 43: aastore
      // 44: dup_x2
      // 45: dup_x2
      // 46: pop
      // 47: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a: bipush 1
      // 4b: swap
      // 4c: aastore
      // 4d: dup_x1
      // 4e: swap
      // 4f: bipush 0
      // 50: swap
      // 51: aastore
      // 52: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 55: ldc2_w -3106497998795710297
      // 58: lload 2
      // 59: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: aload 6
      // 60: aload 0
      // 61: ldc2_w -3218488342650587935
      // 64: lload 2
      // 65: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6f: checkcast com/zelix/mx
      // 72: checkcast com/zelix/mx
      // 75: astore 10
      // 77: istore 9
      // 79: iload 9
      // 7b: ifne a7
      // 7e: aload 10
      // 80: ifnull b2
      // 83: goto 90
      // 86: ldc2_w -3469908047455474961
      // 89: lload 2
      // 8a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: aload 4
      // 92: aload 10
      // 94: invokevirtual com/zelix/mx.B ()I
      // 97: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 9a: goto a7
      // 9d: ldc2_w -3469908047455474961
      // a0: lload 2
      // a1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: lload 2
      // a8: lconst_0
      // a9: lcmp
      // aa: iflt c4
      // ad: iload 9
      // af: ifeq d1
      // b2: aload 4
      // b4: aload 0
      // b5: ldc2_w -3218488342650587935
      // b8: lload 2
      // b9: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: invokevirtual com/zelix/mx.B ()I
      // c1: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // c4: goto d1
      // c7: ldc2_w -3469908047455474961
      // ca: lload 2
      // cb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d0: athrow
      // d1: return
   }

   b6(h8 var1, int var2, long var3, String var5, _xx var6, _y4 var7) {
      var3 = a ^ var3;
      long var8 = var3 ^ 64838256455827L;
      long var10 = var3 ^ 133272271379306L;
      long var12 = (var3 ^ 97965287930838L) >>> 8;
      int var14 = (int)((var3 ^ 97965287930838L) << 56 >>> 56);
      long var15 = var3 ^ 138961110289688L;
      super(var1, var2, var5, var8, var6, var7);
      int var17 = var6.readUnsignedShort();
      xl var18 = this.N(var12, var17, (byte)var14);
      x44.a<"n">(this, new Object[]{var18, var15}, 5749634304876368034L, var3);
      var7.G(x44.a<"j">(this, 6212387217323061634L, var3), this, var10);
   }

   public static _y7 X(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/h8
      // 00f: astore 1
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 2
      // 01a: pop
      // 01b: getstatic com/zelix/b6.a J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 16786664156846
      // 026: lxor
      // 027: lstore 5
      // 029: dup2
      // 02a: ldc2_w 102655965530168
      // 02d: lxor
      // 02e: lstore 7
      // 030: dup2
      // 031: ldc2_w 74099920806763
      // 034: lxor
      // 035: lstore 9
      // 037: dup2
      // 038: ldc2_w 24274140476706
      // 03b: lxor
      // 03c: lstore 11
      // 03e: dup2
      // 03f: ldc2_w 130888183181021
      // 042: lxor
      // 043: lstore 13
      // 045: dup2
      // 046: ldc2_w 11086219444441
      // 049: lxor
      // 04a: lstore 15
      // 04c: dup2
      // 04d: ldc2_w 117058893158258
      // 050: lxor
      // 051: lstore 17
      // 053: dup2
      // 054: ldc2_w 111710764017903
      // 057: lxor
      // 058: lstore 19
      // 05a: pop2
      // 05b: ldc2_w 3639390141055960773
      // 05e: lload 2
      // 05f: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: aconst_null
      // 065: astore 22
      // 067: istore 21
      // 069: new com/zelix/_y7
      // 06c: dup
      // 06d: new com/zelix/da
      // 070: dup
      // 071: ldc ""
      // 073: aconst_null
      // 074: invokespecial com/zelix/da.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 077: lload 17
      // 079: invokespecial com/zelix/_y7.<init> (Ljava/lang/Object;J)V
      // 07c: astore 22
      // 07e: aload 4
      // 080: bipush 0
      // 081: ldc2_w 2958038336178290758
      // 084: lload 2
      // 085: invokedynamic n (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: lload 5
      // 08c: invokestatic com/zelix/l_.r (Ljava/lang/String;I[CJ)I
      // 08f: istore 23
      // 091: iload 23
      // 093: iload 21
      // 095: ifne 0ac
      // 098: bipush -1
      // 099: if_icmpne 0ab
      // 09c: goto 0a9
      // 09f: ldc2_w 3006820745499593869
      // 0a2: lload 2
      // 0a3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: aconst_null
      // 0aa: areturn
      // 0ab: bipush 0
      // 0ac: istore 24
      // 0ae: iload 23
      // 0b0: bipush -1
      // 0b1: if_icmple 42c
      // 0b4: aload 4
      // 0b6: iload 23
      // 0b8: invokevirtual java/lang/String.charAt (I)C
      // 0bb: istore 25
      // 0bd: aload 4
      // 0bf: iload 23
      // 0c1: bipush 1
      // 0c2: iadd
      // 0c3: ldc2_w 2941525911041643873
      // 0c6: lload 2
      // 0c7: invokedynamic n (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: lload 5
      // 0ce: invokestatic com/zelix/l_.r (Ljava/lang/String;I[CJ)I
      // 0d1: istore 26
      // 0d3: iload 21
      // 0d5: lload 2
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: ifle 0e0
      // 0db: ifne 49f
      // 0de: iload 26
      // 0e0: iload 21
      // 0e2: ifne 17f
      // 0e5: goto 0f2
      // 0e8: ldc2_w 3006820745499593869
      // 0eb: lload 2
      // 0ec: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: bipush -1
      // 0f3: if_icmpne 178
      // 0f6: goto 103
      // 0f9: ldc2_w 3006820745499593869
      // 0fc: lload 2
      // 0fd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: new com/zelix/_sk
      // 106: dup
      // 107: new java/lang/StringBuilder
      // 10a: dup
      // 10b: invokespecial java/lang/StringBuilder.<init> ()V
      // 10e: sipush 8279
      // 111: ldc2_w 5970920019750697976
      // 114: lload 2
      // 115: lxor
      // 116: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/b6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e: aload 1
      // 11f: ifnull 142
      // 122: goto 12f
      // 125: ldc2_w 3006820745499593869
      // 128: lload 2
      // 129: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: aload 1
      // 130: lload 7
      // 132: invokevirtual com/zelix/h8.j (J)Ljava/lang/String;
      // 135: goto 144
      // 138: ldc2_w 3006820745499593869
      // 13b: lload 2
      // 13c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: ldc ""
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 147: sipush 11429
      // 14a: ldc2_w 1276849793041053452
      // 14d: lload 2
      // 14e: lxor
      // 14f: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/b6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 157: aload 4
      // 159: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15c: sipush 32108
      // 15f: ldc2_w 6172612033705830082
      // 162: lload 2
      // 163: lxor
      // 164: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/b6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16c: iload 23
      // 16e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 171: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 174: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 177: athrow
      // 178: aload 4
      // 17a: iload 26
      // 17c: invokevirtual java/lang/String.charAt (I)C
      // 17f: istore 27
      // 181: iload 27
      // 183: iload 21
      // 185: lload 2
      // 186: lconst_0
      // 187: lcmp
      // 188: iflt 19b
      // 18b: ifne 1d3
      // 18e: sipush 3925
      // 191: ldc2_w 1881327890269713905
      // 194: lload 2
      // 195: lxor
      // 196: invokedynamic w (IJ)I bsm=com/zelix/b6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: if_icmpne 1cc
      // 19e: goto 1ab
      // 1a1: ldc2_w 3006820745499593869
      // 1a4: lload 2
      // 1a5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: aload 4
      // 1ad: iload 26
      // 1af: bipush 1
      // 1b0: iadd
      // 1b1: lload 2
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: ifle 1d0
      // 1b7: ldc2_w 3957421651407181507
      // 1ba: lload 2
      // 1bb: invokedynamic n (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: lload 5
      // 1c2: invokestatic com/zelix/l_.r (Ljava/lang/String;I[CJ)I
      // 1c5: istore 23
      // 1c7: iload 21
      // 1c9: ifeq 0ae
      // 1cc: aload 4
      // 1ce: iload 24
      // 1d0: invokevirtual java/lang/String.charAt (I)C
      // 1d3: istore 28
      // 1d5: aconst_null
      // 1d6: astore 30
      // 1d8: iload 25
      // 1da: sipush 2900
      // 1dd: ldc2_w 2453589902300787186
      // 1e0: lload 2
      // 1e1: lxor
      // 1e2: invokedynamic w (IJ)I bsm=com/zelix/b6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: if_icmpne 20c
      // 1ea: aload 4
      // 1ec: iload 24
      // 1ee: iload 26
      // 1f0: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 1f3: astore 29
      // 1f5: new com/zelix/da
      // 1f8: dup
      // 1f9: aload 29
      // 1fb: aconst_null
      // 1fc: invokespecial com/zelix/da.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1ff: astore 31
      // 201: lload 2
      // 202: lconst_0
      // 203: lcmp
      // 204: ifle 219
      // 207: iload 21
      // 209: ifeq 254
      // 20c: aload 4
      // 20e: iload 24
      // 210: iload 23
      // 212: bipush 1
      // 213: iadd
      // 214: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 217: astore 29
      // 219: aload 4
      // 21b: iload 23
      // 21d: bipush 1
      // 21e: iadd
      // 21f: iload 26
      // 221: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 224: astore 30
      // 226: new com/zelix/da
      // 229: dup
      // 22a: aload 29
      // 22c: aload 30
      // 22e: iload 25
      // 230: sipush 30213
      // 233: ldc2_w 9064876805074013352
      // 236: lload 2
      // 237: lxor
      // 238: invokedynamic w (IJ)I bsm=com/zelix/b6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: if_icmpne 24e
      // 240: bipush 1
      // 241: goto 24f
      // 244: ldc2_w 3006820745499593869
      // 247: lload 2
      // 248: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24d: athrow
      // 24e: bipush 0
      // 24f: invokespecial com/zelix/da.<init> (Ljava/lang/String;Ljava/lang/String;Z)V
      // 252: astore 31
      // 254: lload 9
      // 256: aload 29
      // 258: sipush 19397
      // 25b: ldc2_w 5099831051337560420
      // 25e: lload 2
      // 25f: lxor
      // 260: invokedynamic w (IJ)I bsm=com/zelix/b6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 265: invokestatic com/zelix/l_.p (JLjava/lang/String;C)I
      // 268: istore 32
      // 26a: lload 9
      // 26c: aload 29
      // 26e: sipush 24497
      // 271: ldc2_w 8518296832089056529
      // 274: lload 2
      // 275: lxor
      // 276: invokedynamic w (IJ)I bsm=com/zelix/b6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: invokestatic com/zelix/l_.p (JLjava/lang/String;C)I
      // 27e: istore 33
      // 280: iload 33
      // 282: iload 32
      // 284: isub
      // 285: istore 34
      // 287: bipush 0
      // 288: istore 35
      // 28a: iload 35
      // 28c: iload 34
      // 28e: if_icmpge 2d1
      // 291: aload 22
      // 293: lload 11
      // 295: bipush 1
      // 296: anewarray 196
      // 299: dup_x2
      // 29a: dup_x2
      // 29b: pop
      // 29c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 29f: bipush 0
      // 2a0: swap
      // 2a1: aastore
      // 2a2: ldc2_w 3633843865324583406
      // 2a5: lload 2
      // 2a6: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: iinc 35 1
      // 2ae: iload 21
      // 2b0: lload 2
      // 2b1: lconst_0
      // 2b2: lcmp
      // 2b3: ifle 37e
      // 2b6: ifne 37c
      // 2b9: iload 21
      // 2bb: ifeq 28a
      // 2be: lload 2
      // 2bf: lconst_0
      // 2c0: lcmp
      // 2c1: iflt 2ae
      // 2c4: goto 2d1
      // 2c7: ldc2_w 3006820745499593869
      // 2ca: lload 2
      // 2cb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d0: athrow
      // 2d1: aload 22
      // 2d3: iload 21
      // 2d5: ifne 368
      // 2d8: lload 13
      // 2da: bipush 1
      // 2db: anewarray 196
      // 2de: dup_x2
      // 2df: dup_x2
      // 2e0: pop
      // 2e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e4: bipush 0
      // 2e5: swap
      // 2e6: aastore
      // 2e7: ldc2_w 4003344033947759307
      // 2ea: lload 2
      // 2eb: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f0: ifne 366
      // 2f3: goto 300
      // 2f6: ldc2_w 3006820745499593869
      // 2f9: lload 2
      // 2fa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: athrow
      // 300: iload 24
      // 302: iload 21
      // 304: lload 2
      // 305: lconst_0
      // 306: lcmp
      // 307: iflt 32e
      // 30a: ifne 32c
      // 30d: goto 31a
      // 310: ldc2_w 3006820745499593869
      // 313: lload 2
      // 314: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: athrow
      // 31a: ifle 387
      // 31d: goto 32a
      // 320: ldc2_w 3006820745499593869
      // 323: lload 2
      // 324: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 329: athrow
      // 32a: iload 28
      // 32c: iload 21
      // 32e: lload 2
      // 32f: lconst_0
      // 330: lcmp
      // 331: iflt 344
      // 334: ifne 363
      // 337: sipush 26685
      // 33a: ldc2_w 8569841785437835935
      // 33d: lload 2
      // 33e: lxor
      // 33f: invokedynamic w (IJ)I bsm=com/zelix/b6.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: if_icmpne 387
      // 347: goto 354
      // 34a: ldc2_w 3006820745499593869
      // 34d: lload 2
      // 34e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: athrow
      // 354: iload 34
      // 356: goto 363
      // 359: ldc2_w 3006820745499593869
      // 35c: lload 2
      // 35d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 362: athrow
      // 363: ifeq 387
      // 366: aload 22
      // 368: aload 31
      // 36a: bipush 1
      // 36b: anewarray 196
      // 36e: dup_x1
      // 36f: swap
      // 370: bipush 0
      // 371: swap
      // 372: aastore
      // 373: ldc2_w 3450280371558961721
      // 376: lload 2
      // 377: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: iload 21
      // 37e: lload 2
      // 37f: lconst_0
      // 380: lcmp
      // 381: ifle 3cf
      // 384: ifeq 3b5
      // 387: aload 22
      // 389: lload 15
      // 38b: aload 31
      // 38d: bipush 2
      // 38e: anewarray 196
      // 391: dup_x1
      // 392: swap
      // 393: bipush 1
      // 394: swap
      // 395: aastore
      // 396: dup_x2
      // 397: dup_x2
      // 398: pop
      // 399: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39c: bipush 0
      // 39d: swap
      // 39e: aastore
      // 39f: ldc2_w 3631764644406417646
      // 3a2: lload 2
      // 3a3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: goto 3b5
      // 3ab: ldc2_w 3006820745499593869
      // 3ae: lload 2
      // 3af: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b4: athrow
      // 3b5: iload 26
      // 3b7: istore 24
      // 3b9: aload 4
      // 3bb: iload 24
      // 3bd: ldc2_w 3957421651407181507
      // 3c0: lload 2
      // 3c1: invokedynamic n (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c6: lload 5
      // 3c8: invokestatic com/zelix/l_.r (Ljava/lang/String;I[CJ)I
      // 3cb: istore 23
      // 3cd: iload 21
      // 3cf: lload 2
      // 3d0: lconst_0
      // 3d1: lcmp
      // 3d2: iflt 3da
      // 3d5: ifne 3fa
      // 3d8: iload 23
      // 3da: lload 2
      // 3db: lconst_0
      // 3dc: lcmp
      // 3dd: iflt 429
      // 3e0: bipush -1
      // 3e1: if_icmpne 427
      // 3e4: goto 3f1
      // 3e7: ldc2_w 3006820745499593869
      // 3ea: lload 2
      // 3eb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f0: athrow
      // 3f1: aload 4
      // 3f3: iload 24
      // 3f5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3f8: astore 29
      // 3fa: new com/zelix/da
      // 3fd: dup
      // 3fe: aload 29
      // 400: aconst_null
      // 401: invokespecial com/zelix/da.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 404: astore 35
      // 406: aload 22
      // 408: lload 15
      // 40a: aload 35
      // 40c: bipush 2
      // 40d: anewarray 196
      // 410: dup_x1
      // 411: swap
      // 412: bipush 1
      // 413: swap
      // 414: aastore
      // 415: dup_x2
      // 416: dup_x2
      // 417: pop
      // 418: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 41b: bipush 0
      // 41c: swap
      // 41d: aastore
      // 41e: ldc2_w 3631764644406417646
      // 421: lload 2
      // 422: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 427: iload 21
      // 429: ifeq 0ae
      // 42c: lload 2
      // 42d: lconst_0
      // 42e: lcmp
      // 42f: ifle 49f
      // 432: goto 49f
      // 435: astore 23
      // 437: aload 23
      // 439: athrow
      // 43a: astore 23
      // 43c: new com/zelix/_sk
      // 43f: dup
      // 440: new java/lang/StringBuilder
      // 443: dup
      // 444: invokespecial java/lang/StringBuilder.<init> ()V
      // 447: sipush 516
      // 44a: ldc2_w 3143216784796555695
      // 44d: lload 2
      // 44e: lxor
      // 44f: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/b6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 454: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 457: aload 1
      // 458: lload 7
      // 45a: invokevirtual com/zelix/h8.j (J)Ljava/lang/String;
      // 45d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 460: sipush 7443
      // 463: ldc2_w 1163854441958934203
      // 466: lload 2
      // 467: lxor
      // 468: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/b6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 470: aload 4
      // 472: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 475: sipush 14715
      // 478: ldc2_w 638164850008138455
      // 47b: lload 2
      // 47c: lxor
      // 47d: invokedynamic w (IJ)Ljava/lang/String; bsm=com/zelix/b6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 482: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 485: aload 23
      // 487: ldc2_w 2935971749211573255
      // 48a: lload 2
      // 48b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 490: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 493: ldc "'"
      // 495: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 498: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 49b: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 49e: athrow
      // 49f: aload 22
      // 4a1: bipush 0
      // 4a2: anewarray 196
      // 4a5: ldc2_w 3928153102728145370
      // 4a8: lload 2
      // 4a9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Iterator; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ae: astore 23
      // 4b0: aload 23
      // 4b2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b7: ifeq 561
      // 4ba: aload 23
      // 4bc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4c1: checkcast com/zelix/_x1
      // 4c4: astore 24
      // 4c6: aconst_null
      // 4c7: astore 25
      // 4c9: aload 24
      // 4cb: invokevirtual com/zelix/_x1.k ()Ljava/util/Enumeration;
      // 4ce: astore 26
      // 4d0: aload 26
      // 4d2: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 4d7: ifeq 556
      // 4da: aload 26
      // 4dc: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 4e1: checkcast com/zelix/_x1
      // 4e4: astore 27
      // 4e6: aload 27
      // 4e8: invokevirtual com/zelix/_x1.x ()Ljava/lang/Object;
      // 4eb: checkcast com/zelix/da
      // 4ee: astore 28
      // 4f0: aload 28
      // 4f2: aload 27
      // 4f4: lload 19
      // 4f6: ldc2_w 3656358148109796584
      // 4f9: lload 2
      // 4fa: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ff: lload 2
      // 500: lconst_0
      // 501: lcmp
      // 502: ifle 551
      // 505: aload 28
      // 507: iload 21
      // 509: ifne 54f
      // 50c: invokevirtual com/zelix/da.O ()Z
      // 50f: iload 21
      // 511: ifne 4b7
      // 514: lload 2
      // 515: lconst_0
      // 516: lcmp
      // 517: iflt 4d7
      // 51a: goto 527
      // 51d: ldc2_w 3006820745499593869
      // 520: lload 2
      // 521: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 526: athrow
      // 527: ifeq 54d
      // 52a: aload 25
      // 52c: aload 28
      // 52e: bipush 1
      // 52f: anewarray 196
      // 532: dup_x1
      // 533: swap
      // 534: bipush 0
      // 535: swap
      // 536: aastore
      // 537: ldc2_w 3566384136199213467
      // 53a: lload 2
      // 53b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 540: goto 54d
      // 543: ldc2_w 3006820745499593869
      // 546: lload 2
      // 547: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/g3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54c: athrow
      // 54d: aload 28
      // 54f: astore 25
      // 551: iload 21
      // 553: ifeq 4d0
      // 556: iload 21
      // 558: lload 2
      // 559: lconst_0
      // 55a: lcmp
      // 55b: iflt 4b7
      // 55e: ifeq 4b0
      // 561: aload 22
      // 563: lload 2
      // 564: lconst_0
      // 565: lcmp
      // 566: iflt 4c1
      // 569: areturn
   }

   private static g3 a(g3 var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14591;
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
            throw new RuntimeException("com/zelix/b6", var10);
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
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/b6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6642;
      if (h[var3] == null) {
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/b6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/b6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
