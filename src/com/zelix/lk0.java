package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lk0 {
   static PrintWriter O;
   static PrintWriter E;
   public static final Runtime Y;
   static long n;
   static long i;
   static long L;
   static final long r;
   static long M;
   static Map g;
   static long t;
   public static final String q;
   private static final long a = prr.a(-8642401283290042932L, 123284217530019883L, MethodHandles.lookup().lookupClass()).a(139997457434807L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map h;

   public static void h(Object[] var0) {
      Object var2 = var0[0];
      String var1 = (String)var0[1];
      long var3 = (Long)var0[2];
      var3 = a ^ var3;

      try {
         if (var2 == null) {
            throw new nn(a<"z">(1897, 8134733278990451314L ^ var3) + var1);
         }
      } catch (nn var5) {
         throw m44.a<"o">(var5, 6190830267339618419L, var3);
      }
   }

   static {
      long var20 = a ^ 134694651029202L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[9];
      int var16 = 0;
      String var15 = "\u0099×$Øz\u000fED)\u0082¾yà\u0086k\u00060*I\u0095\u0002M\u009b¹\"ÛMIÛp\u0011Þ¬ª¤\u00adüb½T;ô4\u008bºåthd#WV\u0000Olb\u001e.¡ù\u0090\u001bíí/ \u0081\u0086à\u001d\u0010G3`C,\u009aoh\u008dÁÄ/#G#oùþí\f\t5\u0096¬¡ZV\u0010?>8&å©l\u009e¥¶ \u000eU¬G\u0006 \u0088íégdC\u0099\u0017 \u009dë³£*c\u000ek$\u000f\t\u0010ôåú|ç.\u0013\u0096\u008c\u0097Ê\u0010þPÞkQ|1k\u0018ú\u001d@Öçw_\u0010Ç?û©ç>¢\u008dZáàr\u008d|êÏ";
      int var17 = "\u0099×$Øz\u000fED)\u0082¾yà\u0086k\u00060*I\u0095\u0002M\u009b¹\"ÛMIÛp\u0011Þ¬ª¤\u00adüb½T;ô4\u008bºåthd#WV\u0000Olb\u001e.¡ù\u0090\u001bíí/ \u0081\u0086à\u001d\u0010G3`C,\u009aoh\u008dÁÄ/#G#oùþí\f\t5\u0096¬¡ZV\u0010?>8&å©l\u009e¥¶ \u000eU¬G\u0006 \u0088íégdC\u0099\u0017 \u009dë³£*c\u000ek$\u000f\t\u0010ôåú|ç.\u0013\u0096\u008c\u0097Ê\u0010þPÞkQ|1k\u0018ú\u001d@Öçw_\u0010Ç?û©ç>¢\u008dZáàr\u008d|êÏ"
         .length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[9];
                     h = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "Õ$\u0012\u008eKÒ\u0016Ã|Ä\u000e\u009c*¬\u001d¨";
                     int var5 = "Õ$\u0012\u008eKÒ\u0016Ã|Ä\u000e\u009c*¬\u001d¨".length();
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
                                    f = new Integer[4];
                                    Y = m44.a<"h">(-4788844286071627447L, var20);
                                    r = m44.a<"h">(-4879171007462117895L, var20);
                                    m44.a<"k">(m44.a<"l">(-4648091718711325603L, var20), -6559371442833795904L, var20);
                                    m44.a<"k">(m44.a<"l">(-4648091718711325603L, var20), -4692016854408977260L, var20);
                                    m44.a<"k">(m44.a<"l">(-4648091718711325603L, var20), -6686959538130686984L, var20);
                                    m44.a<"k">(m44.a<"l">(-4648091718711325603L, var20), -6502928732286879941L, var20);
                                    q = m44.a<"l">(-6861151425143247891L, var20);
                                    m44.a<"k">(new LinkedHashMap(), -6665595769929907211L, var20);
                                    m44.a<"k">(
                                       m44.a<"w">(m44.a<"l">(-5167364385574188544L, var20), -6617599996065980471L, var20)
                                          - m44.a<"w">(m44.a<"l">(-5167364385574188544L, var20), -6724095901416172043L, var20),
                                       -5162393497282808770L,
                                       var20
                                    );
                                    m44.a<"k">(new PrintWriter(m44.a<"l">(-6502060040591834699L, var20), true), -6613264505378789502L, var20);
                                    m44.a<"k">(new PrintWriter(m44.a<"l">(-6686432122090776041L, var20), true), -4636464586992342474L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "/\u0010N\u008b\u0091æ\u0011ì\u0011ÏØw1]r\u0095";
                                 var5 = "/\u0010N\u008b\u0091æ\u0011ì\u0011ÏØw1]r\u0095".length();
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

                  var15 = "\u000eL>êoh\"\u009eErÿoLÕ\u00003 0bÔ4\u0001(ß_ç]\u009aõ}h#n\u008c\u0080\u0096\u0094\u0096'³N§l2\u00112ÀYm";
                  var17 = "\u000eL>êoh\"\u009eErÿoLÕ\u00003 0bÔ4\u0001(ß_ç]\u009aõ}h#n\u008c\u0080\u0096\u0094\u0096'³N§l2\u00112ÀYm".length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public static void M(Object[] var0) {
      Object var2 = var0[0];
      String[] var1 = (String[])var0[1];
      long var3 = (Long)var0[2];
      var3 = a ^ var3;
      String var5 = m44.a<"i">(7455460961214626113L, var3);
      if (var2 == null) {
         StringBuilder var6 = new StringBuilder();

         for (String var10 : var1) {
            var6.append(var10.toString());
            if (var5 != null) {
               break;
            }
         }

         throw new nn(a<"z">(22229, 4469744203752488653L ^ var3) + var6.toString());
      }
   }

   public static void S(Object[] param0) {
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
      // 0e: checkcast java/lang/Object
      // 11: astore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast [Ljava/lang/Object;
      // 19: astore 1
      // 1a: pop
      // 1b: getstatic com/zelix/lk0.a J
      // 1e: lload 2
      // 1f: lxor
      // 20: lstore 2
      // 21: ldc2_w 3879355404722973664
      // 24: lload 2
      // 25: invokedynamic h (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: astore 5
      // 2c: aload 4
      // 2e: ifnonnull d6
      // 31: new java/lang/StringBuilder
      // 34: dup
      // 35: invokespecial java/lang/StringBuilder.<init> ()V
      // 38: astore 6
      // 3a: aload 1
      // 3b: astore 7
      // 3d: aload 7
      // 3f: arraylength
      // 40: istore 8
      // 42: bipush 0
      // 43: istore 9
      // 45: iload 9
      // 47: iload 8
      // 49: if_icmpge a6
      // 4c: aload 7
      // 4e: iload 9
      // 50: aaload
      // 51: astore 10
      // 53: lload 2
      // 54: lconst_0
      // 55: lcmp
      // 56: iflt a1
      // 59: aload 6
      // 5b: aload 5
      // 5d: ifnonnull 9d
      // 60: invokevirtual java/lang/StringBuilder.length ()I
      // 63: ifle 93
      // 66: goto 73
      // 69: ldc2_w 3048211644837644244
      // 6c: lload 2
      // 6d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: aload 6
      // 75: sipush 16308
      // 78: ldc2_w 6356325459802064137
      // 7b: lload 2
      // 7c: lxor
      // 7d: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 85: pop
      // 86: goto 93
      // 89: ldc2_w 3048211644837644244
      // 8c: lload 2
      // 8d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: aload 6
      // 95: aload 10
      // 97: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 9a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9d: pop
      // 9e: iinc 9 1
      // a1: aload 5
      // a3: ifnull 45
      // a6: new com/zelix/nn
      // a9: dup
      // aa: new java/lang/StringBuilder
      // ad: dup
      // ae: invokespecial java/lang/StringBuilder.<init> ()V
      // b1: sipush 22229
      // b4: ldc2_w 4469712379973430380
      // b7: lload 2
      // b8: lxor
      // b9: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c1: aload 6
      // c3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // cc: invokespecial com/zelix/nn.<init> (Ljava/lang/String;)V
      // cf: lload 2
      // d0: lconst_0
      // d1: lcmp
      // d2: iflt 51
      // d5: athrow
      // d6: return
   }

   public static void C(Object[] var0) {
      Object var1 = var0[0];
      String var4 = (String)var0[1];
      long var2 = (Long)var0[2];
      var2 = a ^ var2;

      try {
         if (var1 != null) {
            throw new nn(a<"z">(9080, 3927014654753883550L ^ var2) + var4);
         }
      } catch (nn var5) {
         throw m44.a<"k">(var5, 8511271735499791239L, var2);
      }
   }

   public static String s(Object[] param0) {
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
      // 0a: lstore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Object
      // 11: astore 3
      // 12: pop
      // 13: getstatic com/zelix/lk0.a J
      // 16: lload 1
      // 17: lxor
      // 18: lstore 1
      // 19: ldc2_w -7065565589583920188
      // 1c: lload 1
      // 1d: invokedynamic l (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 3
      // 25: aload 4
      // 27: ifnonnull 53
      // 2a: ifnonnull 52
      // 2d: goto 3a
      // 30: ldc2_w -9049630510562643984
      // 33: lload 1
      // 34: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: sipush 7731
      // 3d: ldc2_w 6428070187113057453
      // 40: lload 1
      // 41: lxor
      // 42: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: areturn
      // 48: ldc2_w -9049630510562643984
      // 4b: lload 1
      // 4c: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: aload 3
      // 53: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 56: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 59: astore 5
      // 5b: aload 5
      // 5d: sipush 20349
      // 60: ldc2_w 2170784775841579204
      // 63: lload 1
      // 64: lxor
      // 65: invokedynamic h (IJ)I bsm=com/zelix/lk0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: sipush 5279
      // 6d: ldc2_w 3404654495213640484
      // 70: lload 1
      // 71: lxor
      // 72: invokedynamic h (IJ)I bsm=com/zelix/lk0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 7a: astore 5
      // 7c: aload 5
      // 7e: ldc "."
      // 80: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 83: istore 6
      // 85: iload 6
      // 87: bipush -1
      // 88: if_icmple 9f
      // 8b: aload 5
      // 8d: iload 6
      // 8f: bipush 1
      // 90: iadd
      // 91: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 94: areturn
      // 95: ldc2_w -9049630510562643984
      // 98: lload 1
      // 99: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: aload 5
      // a1: areturn
   }

   public static String t(Object[] param0) {
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
      // 004: checkcast [Ljava/lang/Object;
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Boolean
      // 018: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01b: istore 1
      // 01c: pop
      // 01d: getstatic com/zelix/lk0.a J
      // 020: lload 3
      // 021: lxor
      // 022: lstore 3
      // 023: ldc2_w 7662040337715459171
      // 026: lload 3
      // 027: invokedynamic k (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: astore 5
      // 02e: aload 2
      // 02f: ifnull 116
      // 032: new java/lang/StringBuilder
      // 035: dup
      // 036: invokespecial java/lang/StringBuilder.<init> ()V
      // 039: astore 6
      // 03b: aload 6
      // 03d: ldc "{"
      // 03f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 042: pop
      // 043: bipush 0
      // 044: istore 7
      // 046: iload 7
      // 048: aload 2
      // 049: arraylength
      // 04a: if_icmpge 0f8
      // 04d: aload 6
      // 04f: lload 3
      // 050: lconst_0
      // 051: lcmp
      // 052: iflt 112
      // 055: new java/lang/StringBuilder
      // 058: dup
      // 059: invokespecial java/lang/StringBuilder.<init> ()V
      // 05c: ldc "#"
      // 05e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 061: iload 7
      // 063: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 066: sipush 28843
      // 069: ldc2_w 6241477456148108694
      // 06c: lload 3
      // 06d: lxor
      // 06e: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 076: aload 2
      // 077: iload 7
      // 079: aaload
      // 07a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 07d: aload 5
      // 07f: ifnonnull 107
      // 082: iload 7
      // 084: aload 2
      // 085: arraylength
      // 086: bipush 1
      // 087: isub
      // 088: if_icmpge 0e4
      // 08b: goto 098
      // 08e: ldc2_w 8488819581723252823
      // 091: lload 3
      // 092: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: new java/lang/StringBuilder
      // 09b: dup
      // 09c: invokespecial java/lang/StringBuilder.<init> ()V
      // 09f: ldc ","
      // 0a1: aload 5
      // 0a3: ifnonnull 0d6
      // 0a6: goto 0b3
      // 0a9: ldc2_w 8488819581723252823
      // 0ac: lload 3
      // 0ad: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: athrow
      // 0b3: lload 3
      // 0b4: lconst_0
      // 0b5: lcmp
      // 0b6: ifle 0c9
      // 0b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bc: iload 1
      // 0bd: ifeq 0d9
      // 0c0: ldc2_w 7679233582830972546
      // 0c3: lload 3
      // 0c4: invokedynamic o (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: goto 0d6
      // 0cc: ldc2_w 8488819581723252823
      // 0cf: lload 3
      // 0d0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: goto 0db
      // 0d9: ldc ""
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0de: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e1: goto 0e6
      // 0e4: ldc ""
      // 0e6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: pop
      // 0f0: iinc 7 1
      // 0f3: aload 5
      // 0f5: ifnull 046
      // 0f8: new java/lang/StringBuilder
      // 0fb: dup
      // 0fc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ff: lload 3
      // 100: lconst_0
      // 101: lcmp
      // 102: iflt 04f
      // 105: aload 6
      // 107: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: ldc "}"
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 112: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 115: areturn
      // 116: sipush 25760
      // 119: ldc2_w 8675080004834427292
      // 11c: lload 3
      // 11d: lxor
      // 11e: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: areturn
   }

   public static void Z(Object[] var0) {
      String var1 = (String)var0[0];
   }

   public static String x(Object[] var0) {
      Object[] var3 = (Object[])var0[0];
      long var1 = (Long)var0[1];
      var1 = a ^ var1;
      long var4 = var1 ^ 32659150789944L;
      Object[] var10004 = new Object[]{null, null, true};
      var10004[1] = var4;
      var10004[0] = var3;
      return m44.a<"n">(var10004, -1992320281692172730L, var1);
   }

   public static void t(boolean param0, String[] param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/lk0.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: iload 0
      // 007: ifne 124
      // 00a: aload 1
      // 00b: arraylength
      // 00c: bipush 1
      // 00d: if_icmpne 04f
      // 010: goto 01d
      // 013: ldc2_w 8710945447335335290
      // 016: lload 2
      // 017: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01c: athrow
      // 01d: new com/zelix/nn
      // 020: dup
      // 021: new java/lang/StringBuilder
      // 024: dup
      // 025: invokespecial java/lang/StringBuilder.<init> ()V
      // 028: sipush 22229
      // 02b: ldc2_w 4469692159603261122
      // 02e: lload 2
      // 02f: lxor
      // 030: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 038: aload 1
      // 039: bipush 0
      // 03a: aaload
      // 03b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 03e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 041: invokespecial com/zelix/nn.<init> (Ljava/lang/String;)V
      // 044: athrow
      // 045: ldc2_w 8710945447335335290
      // 048: lload 2
      // 049: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: new java/lang/StringBuilder
      // 052: dup
      // 053: invokespecial java/lang/StringBuilder.<init> ()V
      // 056: astore 4
      // 058: aload 4
      // 05a: sipush 16513
      // 05d: ldc2_w 4155976143172367793
      // 060: lload 2
      // 061: lxor
      // 062: invokedynamic h (IJ)I bsm=com/zelix/lk0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 06a: pop
      // 06b: bipush 0
      // 06c: istore 5
      // 06e: iload 5
      // 070: aload 1
      // 071: arraylength
      // 072: if_icmpge 0fd
      // 075: aload 1
      // 076: iload 5
      // 078: aaload
      // 079: astore 6
      // 07b: aload 4
      // 07d: aload 6
      // 07f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 082: pop
      // 083: iload 5
      // 085: aload 1
      // 086: arraylength
      // 087: bipush 2
      // 088: isub
      // 089: lload 2
      // 08a: lconst_0
      // 08b: lcmp
      // 08c: ifle 0be
      // 08f: if_icmpge 0b2
      // 092: aload 4
      // 094: sipush 13501
      // 097: ldc2_w 2640897338412096683
      // 09a: lload 2
      // 09b: lxor
      // 09c: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: pop
      // 0a5: goto 0f4
      // 0a8: ldc2_w 8710945447335335290
      // 0ab: lload 2
      // 0ac: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: lload 2
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: ifle 0d4
      // 0b8: iload 5
      // 0ba: aload 1
      // 0bb: arraylength
      // 0bc: bipush 2
      // 0bd: isub
      // 0be: if_icmpne 0e1
      // 0c1: aload 4
      // 0c3: sipush 13233
      // 0c6: ldc2_w 2770952069923134372
      // 0c9: lload 2
      // 0ca: lxor
      // 0cb: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d3: pop
      // 0d4: goto 0f4
      // 0d7: ldc2_w 8710945447335335290
      // 0da: lload 2
      // 0db: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/nn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: aload 4
      // 0e3: sipush 1912
      // 0e6: ldc2_w 9177038299439510090
      // 0e9: lload 2
      // 0ea: lxor
      // 0eb: invokedynamic h (IJ)I bsm=com/zelix/lk0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0f3: pop
      // 0f4: iinc 5 1
      // 0f7: lload 2
      // 0f8: lconst_0
      // 0f9: lcmp
      // 0fa: ifge 06e
      // 0fd: new com/zelix/nn
      // 100: dup
      // 101: new java/lang/StringBuilder
      // 104: dup
      // 105: invokespecial java/lang/StringBuilder.<init> ()V
      // 108: sipush 22229
      // 10b: ldc2_w 4469692159603261122
      // 10e: lload 2
      // 10f: lxor
      // 110: invokedynamic z (IJ)Ljava/lang/String; bsm=com/zelix/lk0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 118: aload 4
      // 11a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 11d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 120: invokespecial com/zelix/nn.<init> (Ljava/lang/String;)V
      // 123: athrow
      // 124: return
   }

   public static void m(Object[] var0) {
      long var2 = (Long)var0[0];
      boolean var4 = (Boolean)var0[1];
      int var1 = (Integer)var0[2];
      var2 = a ^ var2;

      try {
         if (!var4) {
            throw new nn(a<"z">(22229, 4469746287977774315L ^ var2) + m44.a<"o">(var1, 7112011437398658877L, var2));
         }
      } catch (nn var5) {
         throw m44.a<"o">(var5, 8847969613191026515L, var2);
      }
   }

   private static nn a(nn var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 298;
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
            throw new RuntimeException("com/zelix/lk0", var10);
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
         throw new RuntimeException("com/zelix/lk0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23563;
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
            throw new RuntimeException("com/zelix/lk0", var14);
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
         throw new RuntimeException("com/zelix/lk0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
