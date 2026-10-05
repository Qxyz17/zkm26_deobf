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

public class _o6 extends _og {
   private static Map N;
   private static String[] w;
   private int u;
   private static final long b = ess.a(-3814750961070478238L, 4676880775485036343L, MethodHandles.lookup().lookupClass()).a(185836750764849L);
   private static final long[] c;
   private static final Integer[] g;
   private static final Map k;

   _o6(long var1, _xx var3) {
      var1 = b ^ var1;
      super(b<"d">(32276, 378970013201200024L ^ var1));
      x44.a<"t">(this, var3.read(), -5545937286599110830L, var1);
   }

   public final boolean I(long var1) {
      return true;
   }

   static {
      long var20 = b ^ 100124221925361L;
      long var22 = var20 ^ 124275553026681L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[8];
      int var17 = 0;
      String var16 = "\u0004\u0094kÒÑ\u0083\u0089L\b\u008e\u009fÞÊ|\\»\u0095\b\u0094UuBdK2\u0090\bê\u009a£\u009bwJW\u0088\byÞC>\u008b\u0018ià\b \u0007@0\u0012Ëåb";
      int var18 = "\u0004\u0094kÒÑ\u0083\u0089L\b\u008e\u009fÞÊ|\\»\u0095\b\u0094UuBdK2\u0090\bê\u009a£\u009bwJW\u0088\byÞC>\u008b\u0018ià\b \u0007@0\u0012Ëåb"
         .length();
      char var15 = '\b';
      int var26 = -1;

      label54:
      while (true) {
         String var27 = var16.substring(++var26, var26 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var27.getBytes("ISO-8859-1"));
            String var38 = b(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var38;
                  if ((var26 += var15) >= var18) {
                     k = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[17];
                     int var3 = 0;
                     String var4 = "º\u0096\u00991ØãÉt\u0004R!8¤\u0005\u0090\u0090ô¨x\u009f\u0014FxÍªP\u001b\u0094~^ç¶ë\u0086~±2u)\u009dfåA2ÕÞ*\u0018Ð\u009b\u0095\u001aÛ\u0090EÕs^\u0000\nP\u008cW¼Ë¦Â\u001f>ã\u0098#gJÝ\fh$\u0003\u000fz¾¿X\nK¸(7;³®\u008a\u008fr\u0092FWM\u0019\u008c{\u001eþ\u009b\u0005è\u0085±FÈ9Å·o§¼º\u0083ò";
                     int var5 = "º\u0096\u00991ØãÉt\u0004R!8¤\u0005\u0090\u0090ô¨x\u009f\u0014FxÍªP\u001b\u0094~^ç¶ë\u0086~±2u)\u009dfåA2ÕÞ*\u0018Ð\u009b\u0095\u001aÛ\u0090EÕs^\u0000\nP\u008cW¼Ë¦Â\u001f>ã\u0098#gJÝ\fh$\u0003\u000fz¾¿X\nK¸(7;³®\u008a\u008fr\u0092FWM\u0019\u008c{\u001eþ\u009b\u0005è\u0085±FÈ9Å·o§¼º\u0083ò"
                        .length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var30 = var6;
                        var10001 = var3++;
                        long var42 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var8 = var42;
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
                           long var47 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var45) {
                              case 0:
                                 var30[var10001] = var47;
                                 if (var2 >= var5) {
                                    c = var6;
                                    g = new Integer[17];
                                    x44.a<"p">(new String[b<"d">(24975, 8594034475261939315L ^ var20)], 1107763840510670687L, var20);
                                    x44.a<"p">(x44.a<"q">(new Object[]{var22}, 1118545954253433322L, var20), 861981142264458907L, var20);
                                    x44.a<"h">(1107763840510670687L, var20)[4] = var11[3];
                                    x44.a<"h">(1107763840510670687L, var20)[5] = var11[2];
                                    x44.a<"h">(1107763840510670687L, var20)[b<"d">(30628, 3257900433376761940L ^ var20)] = var11[1];
                                    x44.a<"h">(1107763840510670687L, var20)[b<"d">(27834, 2632074131485115214L ^ var20)] = var11[0];
                                    x44.a<"h">(1107763840510670687L, var20)[b<"d">(24797, 5510816918817165099L ^ var20)] = var11[6];
                                    x44.a<"h">(1107763840510670687L, var20)[b<"d">(31653, 2735236701079983186L ^ var20)] = var11[4];
                                    x44.a<"h">(1107763840510670687L, var20)[b<"d">(24927, 6857537265239740078L ^ var20)] = var11[7];
                                    x44.a<"h">(1107763840510670687L, var20)[b<"d">(17638, 6392246563713510175L ^ var20)] = var11[5];
                                    x44.a<"h">(861981142264458907L, var20).put("Z", 4);
                                    x44.a<"h">(861981142264458907L, var20).put("C", 5);
                                    x44.a<"h">(861981142264458907L, var20).put("F", b<"d">(12237, 4631894741178155064L ^ var20));
                                    x44.a<"h">(861981142264458907L, var20).put("D", b<"d">(1356, 3372435170208393905L ^ var20));
                                    x44.a<"h">(861981142264458907L, var20).put("B", b<"d">(18514, 2989387854039803817L ^ var20));
                                    x44.a<"h">(861981142264458907L, var20).put("S", b<"d">(19781, 8042420706785419965L ^ var20));
                                    x44.a<"h">(861981142264458907L, var20).put("I", b<"d">(15873, 6968907280458453490L ^ var20));
                                    x44.a<"h">(861981142264458907L, var20).put("J", b<"d">(19493, 3509842809052062687L ^ var20));
                                    return;
                                 }
                                 break;
                              default:
                                 var30[var10001] = var47;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\n\u0086Â~§\rÛÜ¬ìS\u0082\u0013cWÇ";
                                 var5 = "\n\u0086Â~§\rÛÜ¬ìS\u0082\u0013cWÇ".length();
                                 var2 = 0;
                           }

                           byte var36 = var2;
                           var2 += 8;
                           var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                           var30 = var6;
                           var10001 = var3++;
                           var42 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var15 = var16.charAt(var26);
                  break;
               default:
                  var11[var17++] = var38;
                  if ((var26 += var15) < var18) {
                     var15 = var16.charAt(var26);
                     continue label54;
                  }

                  var16 = "ô\u0018d¸ÌGß\u0003\bA¸lFúaÙ'";
                  var18 = "ô\u0018d¸ÌGß\u0003\bA¸lFúaÙ'".length();
                  var15 = '\b';
                  var26 = -1;
            }

            var27 = var16.substring(++var26, var26 + var15);
            var10001 = 0;
         }
      }
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      super.W(var6, var2, var7);
      var2.writeByte(x44.a<"l">(this, 3629892962348174853L, var4));
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      StringBuilder var6 = new StringBuilder();
      var6.append(x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2));
      var6.append((char)b<"d">(1400, 7367271962913712915L ^ var2));
      var6.append(x44.a<"k">(1068742938930788052L, var2)[x44.a<"n">(this, 1224286270424165543L, var2)]);
      return var6.toString();
   }

   public final boolean N(int param1, int param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 8037225787695755852
      // 03: lload 3
      // 04: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: astore 5
      // 0b: iload 1
      // 0c: aload 5
      // 0e: ifnonnull 32
      // 11: iload 2
      // 12: bipush 1
      // 13: isub
      // 14: if_icmpne 35
      // 17: goto 24
      // 1a: ldc2_w 7925786117190860350
      // 1d: lload 3
      // 1e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: athrow
      // 24: bipush 1
      // 25: goto 32
      // 28: ldc2_w 7925786117190860350
      // 2b: lload 3
      // 2c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: goto 36
      // 35: bipush 0
      // 36: ireturn
   }

   public final boolean c(char var1, short var2, int var3) {
      return false;
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public _o6(long var1, String var3) {
      var1 = b ^ var1;
      super(b<"d">(22356, 2321609984834429228L ^ var1));
      x44.a<"u">(this, (Integer)x44.a<"o">(-7894528583193741540L, var1).get(var3), -8578873580021697365L, var1);
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public _kz M(_kz param1, long param2, boolean param4, boolean param5, _fm param6, String param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: dup2
      // 002: ldc2_w 136062345194104
      // 005: lxor
      // 006: lstore 8
      // 008: dup2
      // 009: ldc2_w 32610570959058
      // 00c: lxor
      // 00d: lstore 10
      // 00f: dup2
      // 010: ldc2_w 118237195067467
      // 013: lxor
      // 014: lstore 12
      // 016: dup2
      // 017: ldc2_w 37585498234552
      // 01a: lxor
      // 01b: lstore 14
      // 01d: pop2
      // 01e: ldc2_w 8522769916746197891
      // 021: lload 2
      // 022: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 1
      // 028: invokevirtual com/zelix/_kz.m ()[Lcom/zelix/n;
      // 02b: astore 17
      // 02d: astore 16
      // 02f: aload 1
      // 030: invokevirtual com/zelix/_kz.r ()[Lcom/zelix/n;
      // 033: astore 18
      // 035: aload 17
      // 037: arraylength
      // 038: istore 19
      // 03a: iload 19
      // 03c: lload 12
      // 03e: invokestatic com/zelix/n.S (IJ)[Lcom/zelix/n;
      // 041: astore 20
      // 043: aload 17
      // 045: bipush 0
      // 046: aload 20
      // 048: bipush 0
      // 049: iload 19
      // 04b: bipush 1
      // 04c: isub
      // 04d: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 050: aload 0
      // 051: ldc2_w 7757598688288331762
      // 054: lload 2
      // 055: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: aload 16
      // 05c: ifnonnull 1b4
      // 05f: tableswitch 327 4 11 55 89 123 157 191 225 259 293
      // 08c: ldc2_w 8372486561515579377
      // 08f: lload 2
      // 090: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: athrow
      // 096: aload 20
      // 098: iload 19
      // 09a: bipush 1
      // 09b: isub
      // 09c: ldc2_w 7639126323200581530
      // 09f: lload 2
      // 0a0: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: aastore
      // 0a6: aload 16
      // 0a8: ifnull 1e6
      // 0ab: goto 0b8
      // 0ae: ldc2_w 8372486561515579377
      // 0b1: lload 2
      // 0b2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 20
      // 0ba: iload 19
      // 0bc: bipush 1
      // 0bd: isub
      // 0be: ldc2_w 8433229378951427446
      // 0c1: lload 2
      // 0c2: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: aastore
      // 0c8: aload 16
      // 0ca: ifnull 1e6
      // 0cd: goto 0da
      // 0d0: ldc2_w 8372486561515579377
      // 0d3: lload 2
      // 0d4: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 20
      // 0dc: iload 19
      // 0de: bipush 1
      // 0df: isub
      // 0e0: ldc2_w 8182990685294288942
      // 0e3: lload 2
      // 0e4: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: aastore
      // 0ea: aload 16
      // 0ec: ifnull 1e6
      // 0ef: goto 0fc
      // 0f2: ldc2_w 8372486561515579377
      // 0f5: lload 2
      // 0f6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 20
      // 0fe: iload 19
      // 100: bipush 1
      // 101: isub
      // 102: ldc2_w 7928481745370069295
      // 105: lload 2
      // 106: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: aastore
      // 10c: aload 16
      // 10e: ifnull 1e6
      // 111: goto 11e
      // 114: ldc2_w 8372486561515579377
      // 117: lload 2
      // 118: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: aload 20
      // 120: iload 19
      // 122: bipush 1
      // 123: isub
      // 124: ldc2_w 7743308088852259224
      // 127: lload 2
      // 128: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: aastore
      // 12e: aload 16
      // 130: ifnull 1e6
      // 133: goto 140
      // 136: ldc2_w 8372486561515579377
      // 139: lload 2
      // 13a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 20
      // 142: iload 19
      // 144: bipush 1
      // 145: isub
      // 146: ldc2_w 8148195027643374798
      // 149: lload 2
      // 14a: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: aastore
      // 150: aload 16
      // 152: ifnull 1e6
      // 155: goto 162
      // 158: ldc2_w 8372486561515579377
      // 15b: lload 2
      // 15c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: aload 20
      // 164: iload 19
      // 166: bipush 1
      // 167: isub
      // 168: ldc2_w 8065634131834909816
      // 16b: lload 2
      // 16c: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: aastore
      // 172: aload 16
      // 174: ifnull 1e6
      // 177: goto 184
      // 17a: ldc2_w 8372486561515579377
      // 17d: lload 2
      // 17e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: athrow
      // 184: aload 20
      // 186: iload 19
      // 188: bipush 1
      // 189: isub
      // 18a: ldc2_w 7571171872394928190
      // 18d: lload 2
      // 18e: invokedynamic n (JJ)Lcom/zelix/n; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: aastore
      // 194: aload 16
      // 196: ifnull 1e6
      // 199: goto 1a6
      // 19c: ldc2_w 8372486561515579377
      // 19f: lload 2
      // 1a0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: athrow
      // 1a6: bipush 0
      // 1a7: goto 1b4
      // 1aa: ldc2_w 8372486561515579377
      // 1ad: lload 2
      // 1ae: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: ldc2_w 7757598688288331762
      // 1b8: lload 2
      // 1b9: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: lload 8
      // 1c0: bipush 3
      // 1c1: anewarray 90
      // 1c4: dup_x2
      // 1c5: dup_x2
      // 1c6: pop
      // 1c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ca: bipush 2
      // 1cb: swap
      // 1cc: aastore
      // 1cd: dup_x1
      // 1ce: swap
      // 1cf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d2: bipush 1
      // 1d3: swap
      // 1d4: aastore
      // 1d5: dup_x1
      // 1d6: swap
      // 1d7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1da: bipush 0
      // 1db: swap
      // 1dc: aastore
      // 1dd: ldc2_w 8278319284505602977
      // 1e0: lload 2
      // 1e1: invokedynamic w (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: new com/zelix/_kz
      // 1e9: dup
      // 1ea: aload 20
      // 1ec: aload 18
      // 1ee: aload 1
      // 1ef: invokevirtual com/zelix/_kz.z ()Lcom/zelix/p5;
      // 1f2: lload 14
      // 1f4: dup2_x1
      // 1f5: pop2
      // 1f6: aload 1
      // 1f7: lload 10
      // 1f9: invokevirtual com/zelix/_kz.C (J)Ljava/util/Set;
      // 1fc: invokespecial com/zelix/_kz.<init> ([Lcom/zelix/n;[Lcom/zelix/n;JLcom/zelix/p5;Ljava/util/Set;)V
      // 1ff: areturn
   }

   public final boolean Y(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/n
      // 11: astore 6
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 2
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Long
      // 23: invokevirtual java/lang/Long.longValue ()J
      // 26: lstore 4
      // 28: pop
      // 29: ldc2_w 5084457588552424266
      // 2c: lload 4
      // 2e: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: astore 7
      // 35: iload 3
      // 36: aload 7
      // 38: ifnonnull 5e
      // 3b: iload 2
      // 3c: bipush 1
      // 3d: isub
      // 3e: if_icmpne 61
      // 41: goto 4f
      // 44: ldc2_w 4969833250464732984
      // 47: lload 4
      // 49: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 5e
      // 53: ldc2_w 4969833250464732984
      // 56: lload 4
      // 58: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: goto 62
      // 61: bipush 0
      // 62: ireturn
   }

   public void k(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/io/PrintWriter
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 4
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 32198005677074
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 43317403178689
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 126344664305306
      // 02f: lxor
      // 030: lstore 10
      // 032: pop2
      // 033: new java/lang/StringBuilder
      // 036: dup
      // 037: sipush 32451
      // 03a: ldc2_w 7857133465176879008
      // 03d: lload 2
      // 03e: lxor
      // 03f: invokedynamic d (IJ)I bsm=com/zelix/_o6.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: invokespecial java/lang/StringBuilder.<init> (I)V
      // 047: astore 13
      // 049: aload 0
      // 04a: lload 6
      // 04c: bipush 1
      // 04d: anewarray 90
      // 050: dup_x2
      // 051: dup_x2
      // 052: pop
      // 053: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 056: bipush 0
      // 057: swap
      // 058: aastore
      // 059: ldc2_w 8353405308985101719
      // 05c: lload 2
      // 05d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: astore 14
      // 064: ldc2_w 8216154267410362304
      // 067: lload 2
      // 068: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aload 13
      // 06f: new java/lang/StringBuilder
      // 072: dup
      // 073: invokespecial java/lang/StringBuilder.<init> ()V
      // 076: aload 14
      // 078: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07b: ldc " "
      // 07d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 080: aload 0
      // 081: ldc2_w 8064772881092006833
      // 084: lload 2
      // 085: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 08d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 090: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 093: pop
      // 094: ldc2_w 8197305444261775810
      // 097: lload 2
      // 098: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: aload 0
      // 09e: ldc2_w 8064772881092006833
      // 0a1: lload 2
      // 0a2: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: aaload
      // 0a8: astore 15
      // 0aa: astore 12
      // 0ac: aload 0
      // 0ad: lload 10
      // 0af: bipush 1
      // 0b0: anewarray 90
      // 0b3: dup_x2
      // 0b4: dup_x2
      // 0b5: pop
      // 0b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b9: bipush 0
      // 0ba: swap
      // 0bb: aastore
      // 0bc: ldc2_w 8288773877087088157
      // 0bf: lload 2
      // 0c0: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: astore 16
      // 0c7: aload 16
      // 0c9: lload 8
      // 0cb: aload 15
      // 0cd: bipush 3
      // 0ce: anewarray 90
      // 0d1: dup_x1
      // 0d2: swap
      // 0d3: bipush 2
      // 0d4: swap
      // 0d5: aastore
      // 0d6: dup_x2
      // 0d7: dup_x2
      // 0d8: pop
      // 0d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dc: bipush 1
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: bipush 0
      // 0e2: swap
      // 0e3: aastore
      // 0e4: ldc2_w 7799761149368071863
      // 0e7: lload 2
      // 0e8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: astore 16
      // 0ef: aload 12
      // 0f1: ifnonnull 154
      // 0f4: aload 16
      // 0f6: invokevirtual java/lang/String.length ()I
      // 0f9: ifle 130
      // 0fc: goto 109
      // 0ff: ldc2_w 8102643098956932018
      // 102: lload 2
      // 103: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 13
      // 10b: new java/lang/StringBuilder
      // 10e: dup
      // 10f: invokespecial java/lang/StringBuilder.<init> ()V
      // 112: ldc "\t"
      // 114: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 117: aload 16
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 122: pop
      // 123: goto 130
      // 126: ldc2_w 8102643098956932018
      // 129: lload 2
      // 12a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 5
      // 132: new java/lang/StringBuilder
      // 135: dup
      // 136: invokespecial java/lang/StringBuilder.<init> ()V
      // 139: aload 4
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 141: aload 4
      // 143: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 146: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 149: aload 13
      // 14b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 151: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 154: return
   }

   public int d(long var1) {
      return 2;
   }

   public _o6(long var1, int var3) {
      var1 = b ^ var1;
      super(b<"d">(22356, 2321706443518022574L ^ var1));
      x44.a<"w">(this, var3, 8823659565464438313L, var1);
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11898;
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_o6", var14);
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
         throw new RuntimeException("com/zelix/_o6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
