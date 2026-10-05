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

public enum tg {
   public static final tg t;
   private static final tg[] b;
   public static final tg K;
   public static final tg Z;
   public static final tg f;
   public static final tg k;
   final int M;
   public static final tg U;
   public static final tg G;
   public static final tg a;
   public static final tg c;
   private static final long d = prr.a(-8504794923439638877L, 6353489315562516995L, MethodHandles.lookup().lookupClass()).a(262081181576145L);
   private static final String[] e;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   private tg(int var3) {
      this.M = var3;
   }

   public static tg V(Object[] var0) {
      long var2 = (Long)var0[0];
      int var1 = (Integer)var0[1];
      var2 = d ^ var2;

      try {
         switch (var1) {
            case 1:
               return m44.a<"m">(-5519691586924382085L, var2);
            case 2:
               return m44.a<"m">(-5882383952618718007L, var2);
            case 3:
               return m44.a<"m">(-5949613656360582721L, var2);
            case 4:
               return m44.a<"m">(-5348755641331076310L, var2);
            case 5:
               return m44.a<"m">(-6281832555561564693L, var2);
            case 6:
               return m44.a<"m">(-5605217540855261001L, var2);
            case 7:
               return m44.a<"m">(-6098529196185305221L, var2);
            case 8:
               return m44.a<"m">(-5602736552381287610L, var2);
            case 9:
               return m44.a<"m">(-5229212449502742867L, var2);
            default:
               return null;
         }
      } catch (n9 var4) {
         throw m44.a<"i">(var4, -5997588406224517492L, var2);
      }
   }

   int q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = d ^ var2;
      return m44.a<"p">(this, 2101569985160834164L, var2);
   }

   static {
      long var20 = d ^ 75584512536879L;
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
      String var15 = "\u009aõw\u001c\u000f\u0000f/Ù\u001fk\u008dp(»]×~j\u0010²D´\u0007\u0095\u008e\u00ad\u0081ÉÿSk(¾\u0082ý\u001b¡Ë \u00956ÓãåÌÕe·uÓÉÞ¢\u000b7N%b²\u009cFèa\u0081¶ùÞ@\u0017Ì\u0018\u0001(\u008f~\u0001²\bnm\u008f]5ã.\u0080\u0010K\u008f=J\u0005)w@[\u0085Hü$K¿Ûh\u0013í)`|¯\u0000r\u0003\u0010¢kê¡\u0084\u000e¯v/ë%#\u0096¢\u0090ö \u0098\u009cÕÓy«í?¸ÕJ\u0012ü~¼XÖ\u0017^6\u0017¯6Ä\u0013ï\u0082àÑÛ]½\u0010>\u00819Á6\njú'9°w®\u0019\u001d[ (²NØ´N)´o\u008fe¢ëÃ6oá\u0014s°\u0088i¡µ<\tW\u008aíGÉü\u0018ò&_·¡\u000b\u0080\u000f\u0099=YÀé\u009e;bÌ\u0089Ö\\çéd\u00820I\u0085?\u0098í¸AÇ¬\u007f\u0018\u0084F¿bµ´Ç÷àÕ]\u0017\u0091¦R\u008aïú\u009fi¡ê\u009cE&Þÿr$7RØ«0\u0092qy(,\u0086÷ð¹F\u0000\u0006G_-sBE ÍÑÄ?\u0012\u0083\u0011\u009d¥O?\u0090]ê¬yü+c\u000fhÁb\u001c\u009f";
      int var17 = "\u009aõw\u001c\u000f\u0000f/Ù\u001fk\u008dp(»]×~j\u0010²D´\u0007\u0095\u008e\u00ad\u0081ÉÿSk(¾\u0082ý\u001b¡Ë \u00956ÓãåÌÕe·uÓÉÞ¢\u000b7N%b²\u009cFèa\u0081¶ùÞ@\u0017Ì\u0018\u0001(\u008f~\u0001²\bnm\u008f]5ã.\u0080\u0010K\u008f=J\u0005)w@[\u0085Hü$K¿Ûh\u0013í)`|¯\u0000r\u0003\u0010¢kê¡\u0084\u000e¯v/ë%#\u0096¢\u0090ö \u0098\u009cÕÓy«í?¸ÕJ\u0012ü~¼XÖ\u0017^6\u0017¯6Ä\u0013ï\u0082àÑÛ]½\u0010>\u00819Á6\njú'9°w®\u0019\u001d[ (²NØ´N)´o\u008fe¢ëÃ6oá\u0014s°\u0088i¡µ<\tW\u008aíGÉü\u0018ò&_·¡\u000b\u0080\u000f\u0099=YÀé\u009e;bÌ\u0089Ö\\çéd\u00820I\u0085?\u0098í¸AÇ¬\u007f\u0018\u0084F¿bµ´Ç÷àÕ]\u0017\u0091¦R\u008aïú\u009fi¡ê\u009cE&Þÿr$7RØ«0\u0092qy(,\u0086÷ð¹F\u0000\u0006G_-sBE ÍÑÄ?\u0012\u0083\u0011\u009d¥O?\u0090]ê¬yü+c\u000fhÁb\u001c\u009f"
         .length();
      char var14 = ' ';
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
                     e = var18;
                     g = new String[12];
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
                     String var5 = "}\u008dÿ\u0088ZûLþ\u009aj({\n\u0010=\u0093ì\u0084\u008e§\u0082k°þ.|®m-^§:%\u001cn`ô´\u0014\u0090Q+É*zàòg";
                     int var6 = "}\u008dÿ\u0088ZûLþ\u009aj({\n\u0010=\u0093ì\u0084\u008e§\u0082k°þ.|®m-^§:%\u001cn`ô´\u0014\u0090Q+É*zàòg".length();
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
                                    f = new tg(1);
                                    k = new tg(2);
                                    G = new tg(3);
                                    t = new tg(4);
                                    U = new tg(5);
                                    c = new tg((int)var0[6]);
                                    a = new tg((int)var0[0]);
                                    K = new tg((int)var0[3]);
                                    Z = new tg((int)var0[7]);
                                    tg[] var29 = new tg[(int)var0[2]];
                                    var29[0] = m44.a<"m">(-3490798906378255213L, var20);
                                    var29[1] = m44.a<"m">(-3263491614351589343L, var20);
                                    var29[2] = m44.a<"m">(-3348825745555653289L, var20);
                                    var29[3] = m44.a<"m">(-3950419618581950526L, var20);
                                    var29[4] = m44.a<"m">(-3154103250451646205L, var20);
                                    var29[5] = m44.a<"m">(-3540276787204266913L, var20);
                                    var29[(int)var0[1]] = m44.a<"m">(-2903272147773373549L, var20);
                                    var29[(int)var0[5]] = m44.a<"m">(-3542299263321043026L, var20);
                                    var29[(int)var0[4]] = m44.a<"m">(-3781273645171684795L, var20);
                                    b = var29;
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var46;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "\u001e\t\u0097|W\u0097ª\"3üiD¬Tó\u0081";
                                 var6 = "\u001e\t\u0097|W\u0097ª\"3üiD¬Tó\u0081".length();
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

                  var15 = "0Ô÷Þ\u001en3PÎ\u00940ÊÔ\u0090M%Ú\u0002\u00001°\u0098º$Ð«ìä\u0006 \u0086p \u0019\u0004Ô×1`)\u0018\u0014Ð3M\u000eÆahïTêß?¨\u001f¶mß¦öøõ\u0083P";
                  var17 = "0Ô÷Þ\u001en3PÎ\u00940ÊÔ\u0090M%Ú\u0002\u00001°\u0098º$Ð«ìä\u0006 \u0086p \u0019\u0004Ô×1`)\u0018\u0014Ð3M\u000eÆahïTêß?¨\u001f¶mß¦öøõ\u0083P"
                     .length();
                  var14 = '(';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public static tg[] u(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = d ^ var1;
      return (tg[])m44.a<"l">(-3486674892956901295L, var1).clone();
   }

   static boolean C(Object[] param0) {
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
      // 04: checkcast com/zelix/tg
      // 07: astore 1
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/String
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 3
      // 19: pop
      // 1a: getstatic com/zelix/tg.d J
      // 1d: lload 3
      // 1e: lxor
      // 1f: lstore 3
      // 20: ldc2_w -43849104811252197
      // 23: lload 3
      // 24: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: istore 5
      // 2b: ldc2_w -1735489673425267173
      // 2e: lload 3
      // 2f: invokedynamic o (JJ)[I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: aload 1
      // 35: invokevirtual com/zelix/tg.ordinal ()I
      // 38: iaload
      // 39: iload 5
      // 3b: ifeq ef
      // 3e: tableswitch 176 5 9 44 44 44 158 44
      // 60: ldc2_w -2191423598258238498
      // 63: lload 3
      // 64: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aload 2
      // 6b: sipush 15953
      // 6e: ldc2_w 7473928804044384252
      // 71: lload 3
      // 72: lxor
      // 73: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/tg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 7b: iload 5
      // 7d: lload 3
      // 7e: lconst_0
      // 7f: lcmp
      // 80: iflt c3
      // 83: ifeq c1
      // 86: goto 93
      // 89: ldc2_w -2191423598258238498
      // 8c: lload 3
      // 8d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: ifne da
      // 96: goto a3
      // 99: ldc2_w -2191423598258238498
      // 9c: lload 3
      // 9d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: athrow
      // a3: aload 2
      // a4: sipush 23095
      // a7: ldc2_w 1205798929367712667
      // aa: lload 3
      // ab: lxor
      // ac: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/tg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // b4: goto c1
      // b7: ldc2_w -2191423598258238498
      // ba: lload 3
      // bb: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: athrow
      // c1: iload 5
      // c3: ifeq d7
      // c6: ifne da
      // c9: goto d6
      // cc: ldc2_w -2191423598258238498
      // cf: lload 3
      // d0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: athrow
      // d6: bipush 1
      // d7: goto db
      // da: bipush 0
      // db: ireturn
      // dc: aload 2
      // dd: sipush 27611
      // e0: ldc2_w 8555021758327583344
      // e3: lload 3
      // e4: lxor
      // e5: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/tg.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ea: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // ed: ireturn
      // ee: bipush 0
      // ef: ireturn
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27836;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/tg", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         g[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("com/zelix/tg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
