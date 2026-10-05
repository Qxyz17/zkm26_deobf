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

public class ed {
   public int d;
   public String X;
   public ed M;
   public ed f;
   public int C;
   public int H;
   int D;
   static final String[] y;
   public int J;
   public int B;
   private static final long a = ess.a(-3349604504921392270L, -3282775874869865012L, MethodHandles.lookup().lookupClass()).a(1401728096485L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);

   static {
      long var20 = a ^ 53486915474414L;
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
      String var15 = "X\u0003ÇKNã#~\u0016Ì(ò\fá\"3ØÒ'cIÆØ/\u0013\u009d54PsB\u0012åk¹!\u001c\\ù\u0080\u0002`K\u009e\u001b:Þ>8~W*¯¦5á\u0099\u0096\u0094ÖÓ6¿ä4<\u008a\u0082[\u008bG\u0006\u0003Í.«\u008a×Cuï\u00055L®ó*\u001b\u0014F³\u008d\u0002¿±é\u0091\fA2{o%^C8yÚ|¹9ýNÙ\u001f\u0007²5\u0011óø*\u001e\u0002\u00ad?Y^w\u0013\u0095a='´\u00109ì¸ãRd+{±\u0006\u009bl]u¹`î\u008e½á\u009f\u0084¤29\u0006\u0010\u0016\u00ad\u001c@¡ß\u001fY,\u000bFS.Ðñ\u008988¦ï 0ªç#ÙmCëÐ \u001dÔó$^f\u0093æ\rðZÖ\u008fKEX:\u0001ªÔ\\\"·àÏ\u0090wùg\t\u008bîÅ#\u0010ý\u0084\u0013É\u009f\u0018W8ºÅS\u008e´-\u008bÂã\u0019axn8 «ö\u0015\u0098J\u0095\u0093\u00007é\u0012qMAb7Á?¶U\u0082^ÎÙ4Õz\u009c5$Âí\u0012ª\u008deÿBA·\u0085";
      int var17 = "X\u0003ÇKNã#~\u0016Ì(ò\fá\"3ØÒ'cIÆØ/\u0013\u009d54PsB\u0012åk¹!\u001c\\ù\u0080\u0002`K\u009e\u001b:Þ>8~W*¯¦5á\u0099\u0096\u0094ÖÓ6¿ä4<\u008a\u0082[\u008bG\u0006\u0003Í.«\u008a×Cuï\u00055L®ó*\u001b\u0014F³\u008d\u0002¿±é\u0091\fA2{o%^C8yÚ|¹9ýNÙ\u001f\u0007²5\u0011óø*\u001e\u0002\u00ad?Y^w\u0013\u0095a='´\u00109ì¸ãRd+{±\u0006\u009bl]u¹`î\u008e½á\u009f\u0084¤29\u0006\u0010\u0016\u00ad\u001c@¡ß\u001fY,\u000bFS.Ðñ\u008988¦ï 0ªç#ÙmCëÐ \u001dÔó$^f\u0093æ\rðZÖ\u008fKEX:\u0001ªÔ\\\"·àÏ\u0090wùg\t\u008bîÅ#\u0010ý\u0084\u0013É\u009f\u0018W8ºÅS\u008e´-\u008bÂã\u0019axn8 «ö\u0015\u0098J\u0095\u0093\u00007é\u0012qMAb7Á?¶U\u0082^ÎÙ4Õz\u009c5$Âí\u0012ª\u008deÿBA·\u0085"
         .length();
      char var14 = '0';
      int var24 = -1;

      label55:
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
                     c = new String[8];
                     Cipher var1;
                     var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var2 = 1; var2 < 8; var2++) {
                        var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var0 = new long[4];
                     int var4 = 0;
                     String var5 = "=m\u001f3\u008c0ÄwÏ~\u0094Kà·\u0082Ä";
                     int var6 = "=m\u001f3\u008c0ÄwÏ~\u0094Kà·\u0082Ä".length();
                     byte var3 = 0;

                     label37:
                     while (true) {
                        var10001 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
                        long[] var28 = var0;
                        var10001 = var4++;
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
                                 if (var3 >= var6) {
                                    y = new String[(int)var0[0]];
                                    x44.a<"k">(600712243983823057L, var20)[0] = "";
                                    x44.a<"k">(600712243983823057L, var20)[2] = a<"h">(19643, 762181976746151884L ^ var20);
                                    x44.a<"k">(600712243983823057L, var20)[3] = a<"h">(25335, 7884570592458924423L ^ var20);
                                    x44.a<"k">(600712243983823057L, var20)[4] = a<"h">(15003, 7333694080310229482L ^ var20);
                                    x44.a<"k">(600712243983823057L, var20)[5] = a<"h">(8636, 78451771164173002L ^ var20);
                                    x44.a<"k">(600712243983823057L, var20)[(int)var0[2]] = a<"h">(23499, 3291129360005322937L ^ var20);
                                    x44.a<"k">(600712243983823057L, var20)[(int)var0[3]] = a<"h">(13780, 7189093116868146848L ^ var20);
                                    x44.a<"k">(600712243983823057L, var20)[(int)var0[1]] = a<"h">(18125, 4537104304236709310L ^ var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var3 < var6) {
                                    continue label37;
                                 }

                                 var5 = "ÙEÁ(O4\u0086úðÔJS|õ\u0019ì";
                                 var6 = "ÙEÁ(O4\u0086úðÔJS|õ\u0019ì".length();
                                 var3 = 0;
                           }

                           byte var34 = var3;
                           var3 += 8;
                           var7 = var5.substring(var34, var3).getBytes("ISO-8859-1");
                           var28 = var0;
                           var10001 = var4++;
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
                     continue label55;
                  }

                  var15 = "¾\u000fë\u001a_V\u0096³`¨\u0018²µ\u008c26ÆU9ñ\u0099\u008c^\u0087\u0001°#lYnÒ\u0090.\u0095ëÞ\u008c\u0019Á¡(ød\u0080\u0098õi\u009fïy\u0007\u0005N?ûõ³_X\u0005Â¨TãªÂ\u0098î\u0014ÛÁø\u001bG\u0001/\u00849\u0096.¡";
                  var17 = "¾\u000fë\u001a_V\u0096³`¨\u0018²µ\u008c26ÆU9ñ\u0099\u008c^\u0087\u0001°#lYnÒ\u0090.\u0095ëÞ\u008c\u0019Á¡(ød\u0080\u0098õi\u009fïy\u0007\u0005N?ûõ³_X\u0005Â¨TãªÂ\u0098î\u0014ÛÁø\u001bG\u0001/\u00849\u0096.¡"
                     .length();
                  var14 = '(';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public static final ed u(Object[] var0) {
      long var1 = (Long)var0[0];
      int var3 = (Integer)var0[1];
      var1 = a ^ var1;
      switch (var3) {
         default:
            return new ed();
      }
   }

   @Override
   public final String toString() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/ed.a J
      // 03: ldc2_w 94946517406841
      // 06: lxor
      // 07: lstore 1
      // 08: lload 1
      // 09: dup2
      // 0a: ldc2_w 122981498138743
      // 0d: lxor
      // 0e: lstore 3
      // 0f: pop2
      // 10: ldc2_w -7673722942896688065
      // 13: lload 1
      // 14: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: astore 5
      // 1b: aload 0
      // 1c: ldc2_w -8593567708994902263
      // 1f: lload 1
      // 20: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 5
      // 27: ifnonnull 8e
      // 2a: ifnonnull 84
      // 2d: goto 3a
      // 30: ldc2_w -8494408077356668912
      // 33: lload 1
      // 34: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: new java/lang/StringBuilder
      // 3d: dup
      // 3e: invokespecial java/lang/StringBuilder.<init> ()V
      // 41: ldc "<"
      // 43: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 46: lload 3
      // 47: aload 0
      // 48: bipush 2
      // 49: anewarray 72
      // 4c: dup_x1
      // 4d: swap
      // 4e: bipush 1
      // 4f: swap
      // 50: aastore
      // 51: dup_x2
      // 52: dup_x2
      // 53: pop
      // 54: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 57: bipush 0
      // 58: swap
      // 59: aastore
      // 5a: ldc2_w -8610402804792072324
      // 5d: lload 1
      // 5e: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 66: sipush 19277
      // 69: ldc2_w 4540348694884372399
      // 6c: lload 1
      // 6d: lxor
      // 6e: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/ed.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79: areturn
      // 7a: ldc2_w -8494408077356668912
      // 7d: lload 1
      // 7e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: aload 0
      // 85: ldc2_w -8593567708994902263
      // 88: lload 1
      // 89: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: areturn
   }

   public String C(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(4764608967561018008L, var2)[x44.a<"o">(this, 6678502854157125961L, var2)];
   }

   public void s(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = a ^ var3;
      x44.a<"r">(this, var2, -1604135225459770277L, var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6335;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ed", var10);
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
         throw new RuntimeException("com/zelix/ed" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
