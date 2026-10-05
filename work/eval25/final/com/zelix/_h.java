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

public enum _h {
   public static final _h g;
   public static final _h S;
   public static final _h U;
   public static final _h C;
   public static final _h h;
   public static final _h M;
   public static final _h F;
   public static final _h o;
   private static final _h[] X;
   public static final _h b;
   final int Y;
   private static final long a = ess.a(5018963195153433423L, 505217404465056192L, MethodHandles.lookup().lookupClass()).a(238283777878217L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public static _h K(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;

      try {
         switch (var3) {
            case 1:
               return x44.a<"h">(2923594577653755990L, var1);
            case 2:
               return x44.a<"h">(3420098982501210873L, var1);
            case 3:
               return x44.a<"h">(3403406736509141052L, var1);
            case 4:
               return x44.a<"h">(2889092440234225551L, var1);
            case 5:
               return x44.a<"h">(3997844336602516331L, var1);
            case 6:
               return x44.a<"h">(4013736008612427216L, var1);
            case 7:
               return x44.a<"h">(3509084430107164613L, var1);
            case 8:
               return x44.a<"h">(3368586182169408218L, var1);
            case 9:
               return x44.a<"h">(3238830506885261145L, var1);
            default:
               return null;
         }
      } catch (gj var4) {
         throw x44.a<"q">(var4, 3110510284152578483L, var1);
      }
   }

   public static _h[] l(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = a ^ var1;
      return (_h[])x44.a<"h">(1910596264547537333L, var1).clone();
   }

   int b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, -7849356760841754122L, var2);
   }

   static boolean H(Object[] param0) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/_h
      // 11: astore 1
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/String
      // 18: astore 4
      // 1a: pop
      // 1b: getstatic com/zelix/_h.a J
      // 1e: lload 2
      // 1f: lxor
      // 20: lstore 2
      // 21: ldc2_w -8256512665553868661
      // 24: lload 2
      // 25: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: astore 5
      // 2c: ldc2_w -8450337421560173904
      // 2f: lload 2
      // 30: invokedynamic m (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 1
      // 36: invokevirtual com/zelix/_h.ordinal ()I
      // 39: iaload
      // 3a: aload 5
      // 3c: ifnonnull f2
      // 3f: tableswitch 178 5 9 43 43 43 159 43
      // 60: ldc2_w -7590895268353434562
      // 63: lload 2
      // 64: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aload 4
      // 6c: sipush 31863
      // 6f: ldc2_w 6983150865503213826
      // 72: lload 2
      // 73: lxor
      // 74: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/_h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7c: aload 5
      // 7e: lload 2
      // 7f: lconst_0
      // 80: lcmp
      // 81: iflt c5
      // 84: ifnonnull c3
      // 87: goto 94
      // 8a: ldc2_w -7590895268353434562
      // 8d: lload 2
      // 8e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: ifne dc
      // 97: goto a4
      // 9a: ldc2_w -7590895268353434562
      // 9d: lload 2
      // 9e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: aload 4
      // a6: sipush 29722
      // a9: ldc2_w 1158345262951551341
      // ac: lload 2
      // ad: lxor
      // ae: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/_h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // b6: goto c3
      // b9: ldc2_w -7590895268353434562
      // bc: lload 2
      // bd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c2: athrow
      // c3: aload 5
      // c5: ifnonnull d9
      // c8: ifne dc
      // cb: goto d8
      // ce: ldc2_w -7590895268353434562
      // d1: lload 2
      // d2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d7: athrow
      // d8: bipush 1
      // d9: goto dd
      // dc: bipush 0
      // dd: ireturn
      // de: aload 4
      // e0: sipush 15481
      // e3: ldc2_w 2547351470283561231
      // e6: lload 2
      // e7: lxor
      // e8: invokedynamic n (IJ)Ljava/lang/String; bsm=com/zelix/_h.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // f0: ireturn
      // f1: bipush 0
      // f2: ireturn
   }

   private _h(int var3) {
      this.Y = var3;
   }

   static {
      long var20 = a ^ 37925779859319L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "\u0097ùò¯Î+8&NAÓ}ù\u0013m÷\u0018¢õÇÆ*\u0004èî²è\u008a\u0095\u0089ìm\u009cjÐÿ\u0095\u0095ªá`\u0018a«±\\.pùñ`\u0016õLôG¶2^\n\u008c!\u001bèW\u0088\u0010é'Z\b6 ¦\u0003j3\u0006«\u0098Ó\u0003\u0005\u0018f,mmo\u00adÊ\u008f8ÁÙ&q\u0095¢ï®l\u009eúfßi\u0095\u0018\u0089\u001að\u0010bv~v\u0096i±Þtºc\u0012/ /#ú´%¥(X\u0093Ð¾óæÒºxTïÚ3Ü6\u0082\u009e*ozñ\u001cB\u0096¾Õ\u0095@Û\u0090º¤ÇV,¼b\u0014Bb(µ\u0002CT\u0019¢s\u0004\u0092ekÊ\u0091\u0097Ëbñí\u0003½\u0000\u0083H:;\u0000\u0001\u0011¥7s\u008f$\u00141½&\u0017\u00897(\u0004HÛQ\u0005Vf£¥2?\u0002\u0001PÎ\u0086hç\u0019\u0095át\u0093¥(ó\u009060ç\u0004óÖÜí®}ß&E(°\u0086ù÷ðÕ\u0090>è\u001fµÿ¤\u0080\u000eòân¤\u0099\u0007\u0011²R>\u0000J9W\n\u001fuê\u0002\"â\u0092\u0098\u000e\u0005";
      int var17 = "\u0097ùò¯Î+8&NAÓ}ù\u0013m÷\u0018¢õÇÆ*\u0004èî²è\u008a\u0095\u0089ìm\u009cjÐÿ\u0095\u0095ªá`\u0018a«±\\.pùñ`\u0016õLôG¶2^\n\u008c!\u001bèW\u0088\u0010é'Z\b6 ¦\u0003j3\u0006«\u0098Ó\u0003\u0005\u0018f,mmo\u00adÊ\u008f8ÁÙ&q\u0095¢ï®l\u009eúfßi\u0095\u0018\u0089\u001að\u0010bv~v\u0096i±Þtºc\u0012/ /#ú´%¥(X\u0093Ð¾óæÒºxTïÚ3Ü6\u0082\u009e*ozñ\u001cB\u0096¾Õ\u0095@Û\u0090º¤ÇV,¼b\u0014Bb(µ\u0002CT\u0019¢s\u0004\u0092ekÊ\u0091\u0097Ëbñí\u0003½\u0000\u0083H:;\u0000\u0001\u0011¥7s\u008f$\u00141½&\u0017\u00897(\u0004HÛQ\u0005Vf£¥2?\u0002\u0001PÎ\u0086hç\u0019\u0095át\u0093¥(ó\u009060ç\u0004óÖÜí®}ß&E(°\u0086ù÷ðÕ\u0090>è\u001fµÿ¤\u0080\u000eòân¤\u0099\u0007\u0011²R>\u0000J9W\n\u001fuê\u0002\"â\u0092\u0098\u000e\u0005"
         .length();
      char var14 = 16;
      int var24 = -1;

      label55:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var37 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var24 += var14) >= var17) {
                     c = var18;
                     d = new String[12];
                     Cipher var1;
                     var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var2 = 1; var2 < 8; var2++) {
                        var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var0 = new long[8];
                     int var4 = 0;
                     String var5 = "Ö1ò·\u007ffs*¥ÀCWüþk;Ð\u009cWTÎ\u0081Zâb>5\u0089l\u0088«HIat\u008aUOJ±\bæ¦\u0007ßÝ%\f";
                     int var6 = "Ö1ò·\u007ffs*¥ÀCWüþk;Ð\u009cWTÎ\u0081Zâb>5\u0089l\u0088«HIat\u008aUOJ±\bæ¦\u0007ßÝ%\f".length();
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
                                    b = new _h(1);
                                    h = new _h(2);
                                    U = new _h(3);
                                    S = new _h(4);
                                    g = new _h(5);
                                    M = new _h((int)var0[1]);
                                    o = new _h((int)var0[2]);
                                    F = new _h((int)var0[4]);
                                    C = new _h((int)var0[3]);
                                    _h[] var29 = new _h[(int)var0[5]];
                                    var29[0] = x44.a<"o">(-5305831192226566503L, var20);
                                    var29[1] = x44.a<"o">(-5640206009935707082L, var20);
                                    var29[2] = x44.a<"o">(-5623866709390254349L, var20);
                                    var29[3] = x44.a<"o">(-5271664405786398400L, var20);
                                    var29[4] = x44.a<"o">(-6218233734447327836L, var20);
                                    var29[5] = x44.a<"o">(-6233843070339437793L, var20);
                                    var29[(int)var0[7]] = x44.a<"o">(-5873376911231639286L, var20);
                                    var29[(int)var0[0]] = x44.a<"o">(-5732862235041747947L, var20);
                                    var29[(int)var0[6]] = x44.a<"o">(-5603053751105308266L, var20);
                                    X = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "\u0083Ý5öå¬,ÂYù\u0003¢é³\u000bO";
                                 var6 = "\u0083Ý5öå¬,ÂYù\u0003¢é³\u000bO".length();
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

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var37;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label55;
                  }

                  var15 = ")Lm¡0um²j|1\u008eµ]&\u009do×°ðU\r\u0094¦\u0085¬Ë°mpñ\u008a+\u0096ÞÑ\u001cðS\u0084´}µG÷Þ\u000b:  Z\u009d\u0011;ÞÏÜ<\u008a¾\t\u00ad\u001c+B\u001ehÇ»q\u00927dt\u001eÞ\u0096hp&ð";
                  var17 = ")Lm¡0um²j|1\u008eµ]&\u009do×°ðU\r\u0094¦\u0085¬Ë°mpñ\u008a+\u0096ÞÑ\u001cðS\u0084´}µG÷Þ\u000b:  Z\u009d\u0011;ÞÏÜ<\u008a¾\t\u00ad\u001c+B\u001ehÇ»q\u00927dt\u001eÞ\u0096hp&ð"
                     .length();
                  var14 = '0';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9561;
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
            throw new RuntimeException("com/zelix/_h", var10);
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
         throw new RuntimeException("com/zelix/_h" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
