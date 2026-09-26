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

public class ib extends oz {
   private static Map P;
   private static String[] c;
   private int n;
   private static final long a = prr.a(-1301466714317885110L, 2157499729175686468L, MethodHandles.lookup().lookupClass()).a(244824226701923L);
   private static final long[] b;
   private static final Integer[] d;
   private static final Map e;

   public final boolean e(long var1, int var3) {
      return true;
   }

   ib(long var1, h1 var3) {
      var1 = a ^ var1;
      super(b<"a">(12948, 4712883914518238752L ^ var1));
      m44.a<"u">(this, var3.read(), 7903289083963185075L, var1);
   }

   static {
      long var20 = a ^ 139071676008053L;
      long var22 = var20 ^ 31777876233948L;
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
      String var16 = "eÛc-\u0098ü\u0099\u0004\b\u001d \nFd8`\u0084\b\"Zc\u0096ÎÏ\u0085w\bÆå\u000b\u007fÌüÌ\u0086\b duZûñî*\b\u0086\u00075§¦\u0007G@";
      int var18 = "eÛc-\u0098ü\u0099\u0004\b\u001d \nFd8`\u0084\b\"Zc\u0096ÎÏ\u0085w\bÆå\u000b\u007fÌüÌ\u0086\b duZûñî*\b\u0086\u00075§¦\u0007G@".length();
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
                     e = new HashMap(13);
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
                     String var4 = "×\u00892t´Û\u008dÍpP;Çm:û(Îþvia\u0001îaM\u0088:æM\u0089´\u001f\u0019³\u001f_\u0092¾/\u0096M\u000f¤\u008b/\u0010?ÉX\b²4ÕÙ\u0004\u0098¶Í`0q\u0000\"1\u0016µ\u0017PO-\u0006Ò¯-¾Üü¿S6Ø¬t\u0011´µ4,8\u0095¹~ÿ`*w«''¢àë*¾ë¡í|¹\r%Ù\u009a\u0085Ì\u001eKÈË\r";
                     int var5 = "×\u00892t´Û\u008dÍpP;Çm:û(Îþvia\u0001îaM\u0088:æM\u0089´\u001f\u0019³\u001f_\u0092¾/\u0096M\u000f¤\u008b/\u0010?ÉX\b²4ÕÙ\u0004\u0098¶Í`0q\u0000\"1\u0016µ\u0017PO-\u0006Ò¯-¾Üü¿S6Ø¬t\u0011´µ4,8\u0095¹~ÿ`*w«''¢àë*¾ë¡í|¹\r%Ù\u009a\u0085Ì\u001eKÈË\r"
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
                                    b = var6;
                                    d = new Integer[17];
                                    m44.a<"j">(new String[b<"a">(30083, 7487959399279301481L ^ var20)], -5400637871320750640L, var20);
                                    m44.a<"j">(m44.a<"i">(new Object[]{var22}, -6144993444269601190L, var20), -6262799631634352408L, var20);
                                    m44.a<"m">(-5400637871320750640L, var20)[4] = var11[0];
                                    m44.a<"m">(-5400637871320750640L, var20)[5] = var11[6];
                                    m44.a<"m">(-5400637871320750640L, var20)[b<"a">(5528, 3997148681380328312L ^ var20)] = var11[5];
                                    m44.a<"m">(-5400637871320750640L, var20)[b<"a">(19037, 2704222376624204981L ^ var20)] = var11[4];
                                    m44.a<"m">(-5400637871320750640L, var20)[b<"a">(30522, 1351437503898816984L ^ var20)] = var11[1];
                                    m44.a<"m">(-5400637871320750640L, var20)[b<"a">(8669, 4723964866331461432L ^ var20)] = var11[7];
                                    m44.a<"m">(-5400637871320750640L, var20)[b<"a">(31868, 4474019060683872917L ^ var20)] = var11[2];
                                    m44.a<"m">(-5400637871320750640L, var20)[b<"a">(16075, 3967661152526653487L ^ var20)] = var11[3];
                                    m44.a<"m">(-6262799631634352408L, var20).put("Z", 4);
                                    m44.a<"m">(-6262799631634352408L, var20).put("C", 5);
                                    m44.a<"m">(-6262799631634352408L, var20).put("F", b<"a">(7223, 1400500260721425115L ^ var20));
                                    m44.a<"m">(-6262799631634352408L, var20).put("D", b<"a">(8768, 719764198757418151L ^ var20));
                                    m44.a<"m">(-6262799631634352408L, var20).put("B", b<"a">(32382, 3746755483019483285L ^ var20));
                                    m44.a<"m">(-6262799631634352408L, var20).put("S", b<"a">(20038, 1239425640493918376L ^ var20));
                                    m44.a<"m">(-6262799631634352408L, var20).put("I", b<"a">(8699, 1904693069641172756L ^ var20));
                                    m44.a<"m">(-6262799631634352408L, var20).put("J", b<"a">(5656, 7518528565884317945L ^ var20));
                                    return;
                                 }
                                 break;
                              default:
                                 var30[var10001] = var47;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0091Ò´\u0007{çmÂU\u007f\u0016\u0006\u0091Rm¼";
                                 var5 = "\u0091Ò´\u0007{çmÂU\u007f\u0016\u0006\u0091Rm¼".length();
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

                  var16 = "_ì@uÀOqE\b¾\u0001²_¿æ<³";
                  var18 = "_ì@uÀOqE\b¾\u0001²_¿æ<³".length();
                  var15 = '\b';
                  var26 = -1;
            }

            var27 = var16.substring(++var26, var26 + var15);
            var10001 = 0;
         }
      }
   }

   public hz n(hz param1, boolean param2, char param3, int param4, boolean param5, loj param6, char param7, String param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 3
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 32
      // 00a: lshl
      // 00b: bipush 16
      // 00d: lushr
      // 00e: lor
      // 00f: iload 7
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: lstore 9
      // 01b: lload 9
      // 01d: dup2
      // 01e: ldc2_w 6215624408093
      // 021: lxor
      // 022: lstore 11
      // 024: dup2
      // 025: ldc2_w 114161761794490
      // 028: lxor
      // 029: lstore 13
      // 02b: dup2
      // 02c: ldc2_w 332116234582
      // 02f: lxor
      // 030: lstore 15
      // 032: dup2
      // 033: ldc2_w 76706529798630
      // 036: lxor
      // 037: lstore 17
      // 039: pop2
      // 03a: ldc2_w -4354173775004039090
      // 03d: lload 9
      // 03f: invokedynamic l (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: aload 1
      // 045: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 048: astore 20
      // 04a: istore 19
      // 04c: aload 1
      // 04d: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 050: astore 21
      // 052: aload 20
      // 054: arraylength
      // 055: istore 22
      // 057: iload 22
      // 059: lload 15
      // 05b: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 05e: astore 23
      // 060: aload 20
      // 062: bipush 0
      // 063: aload 23
      // 065: bipush 0
      // 066: iload 22
      // 068: bipush 1
      // 069: isub
      // 06a: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 06d: aload 0
      // 06e: ldc2_w -4574778494792058210
      // 071: lload 9
      // 073: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: iload 19
      // 07a: ifeq 1e6
      // 07d: tableswitch 346 4 11 58 94 130 166 202 238 274 310
      // 0ac: ldc2_w -4372581537994246119
      // 0af: lload 9
      // 0b1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 23
      // 0b9: iload 22
      // 0bb: bipush 1
      // 0bc: isub
      // 0bd: ldc2_w -2324570307459275638
      // 0c0: lload 9
      // 0c2: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: aastore
      // 0c8: iload 19
      // 0ca: ifne 21c
      // 0cd: goto 0db
      // 0d0: ldc2_w -4372581537994246119
      // 0d3: lload 9
      // 0d5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 23
      // 0dd: iload 22
      // 0df: bipush 1
      // 0e0: isub
      // 0e1: ldc2_w -2638797400477528472
      // 0e4: lload 9
      // 0e6: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: aastore
      // 0ec: iload 19
      // 0ee: ifne 21c
      // 0f1: goto 0ff
      // 0f4: ldc2_w -4372581537994246119
      // 0f7: lload 9
      // 0f9: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 23
      // 101: iload 22
      // 103: bipush 1
      // 104: isub
      // 105: ldc2_w -2696236755442465475
      // 108: lload 9
      // 10a: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: aastore
      // 110: iload 19
      // 112: ifne 21c
      // 115: goto 123
      // 118: ldc2_w -4372581537994246119
      // 11b: lload 9
      // 11d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 23
      // 125: iload 22
      // 127: bipush 1
      // 128: isub
      // 129: ldc2_w -4377280227960044877
      // 12c: lload 9
      // 12e: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: aastore
      // 134: iload 19
      // 136: ifne 21c
      // 139: goto 147
      // 13c: ldc2_w -4372581537994246119
      // 13f: lload 9
      // 141: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: athrow
      // 147: aload 23
      // 149: iload 22
      // 14b: bipush 1
      // 14c: isub
      // 14d: ldc2_w -4062691724886274712
      // 150: lload 9
      // 152: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: aastore
      // 158: iload 19
      // 15a: ifne 21c
      // 15d: goto 16b
      // 160: ldc2_w -4372581537994246119
      // 163: lload 9
      // 165: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: aload 23
      // 16d: iload 22
      // 16f: bipush 1
      // 170: isub
      // 171: ldc2_w -2390258588030115756
      // 174: lload 9
      // 176: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: aastore
      // 17c: iload 19
      // 17e: ifne 21c
      // 181: goto 18f
      // 184: ldc2_w -4372581537994246119
      // 187: lload 9
      // 189: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: aload 23
      // 191: iload 22
      // 193: bipush 1
      // 194: isub
      // 195: ldc2_w -2685094912730738687
      // 198: lload 9
      // 19a: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: aastore
      // 1a0: iload 19
      // 1a2: ifne 21c
      // 1a5: goto 1b3
      // 1a8: ldc2_w -4372581537994246119
      // 1ab: lload 9
      // 1ad: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: aload 23
      // 1b5: iload 22
      // 1b7: bipush 1
      // 1b8: isub
      // 1b9: ldc2_w -4276299815129050482
      // 1bc: lload 9
      // 1be: invokedynamic h (JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: aastore
      // 1c4: iload 19
      // 1c6: ifne 21c
      // 1c9: goto 1d7
      // 1cc: ldc2_w -4372581537994246119
      // 1cf: lload 9
      // 1d1: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: bipush 0
      // 1d8: goto 1e6
      // 1db: ldc2_w -4372581537994246119
      // 1de: lload 9
      // 1e0: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: athrow
      // 1e6: aload 0
      // 1e7: ldc2_w -4574778494792058210
      // 1ea: lload 9
      // 1ec: invokedynamic r (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: lload 17
      // 1f3: dup2_x2
      // 1f4: pop2
      // 1f5: bipush 3
      // 1f6: anewarray 70
      // 1f9: dup_x1
      // 1fa: swap
      // 1fb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1fe: bipush 2
      // 1ff: swap
      // 200: aastore
      // 201: dup_x1
      // 202: swap
      // 203: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 206: bipush 1
      // 207: swap
      // 208: aastore
      // 209: dup_x2
      // 20a: dup_x2
      // 20b: pop
      // 20c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20f: bipush 0
      // 210: swap
      // 211: aastore
      // 212: ldc2_w -2798397269065866027
      // 215: lload 9
      // 217: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: new com/zelix/hz
      // 21f: dup
      // 220: aload 23
      // 222: aload 21
      // 224: aload 1
      // 225: invokevirtual com/zelix/hz.j ()Lcom/zelix/fb;
      // 228: lload 13
      // 22a: dup2_x1
      // 22b: pop2
      // 22c: aload 1
      // 22d: lload 11
      // 22f: invokevirtual com/zelix/hz.k (J)Ljava/util/Set;
      // 232: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 235: areturn
   }

   public final boolean v(Object[] param1) {
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
      // 0a: istore 6
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/v7
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Long
      // 19: invokevirtual java/lang/Long.longValue ()J
      // 1c: lstore 4
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Integer
      // 24: invokevirtual java/lang/Integer.intValue ()I
      // 27: istore 2
      // 28: pop
      // 29: ldc2_w -4319878175848984624
      // 2c: lload 4
      // 2e: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: istore 7
      // 35: iload 6
      // 37: iload 7
      // 39: lload 4
      // 3b: lconst_0
      // 3c: lcmp
      // 3d: ifle 46
      // 40: ifeq 66
      // 43: iload 2
      // 44: bipush 1
      // 45: isub
      // 46: if_icmpne 69
      // 49: goto 57
      // 4c: ldc2_w -4265168431831777401
      // 4f: lload 4
      // 51: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: bipush 1
      // 58: goto 66
      // 5b: ldc2_w -4265168431831777401
      // 5e: lload 4
      // 60: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: goto 6a
      // 69: bipush 0
      // 6a: ireturn
   }

   public boolean S(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public boolean L(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public void G(short var1, int var2, DataOutputStream var3, int var4) {
      long var5 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48;
      long var10001 = var5 ^ 0L;
      int var7 = (int)((var5 ^ 0L) >>> 48);
      int var8 = (int)((var5 ^ 0L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      super.G((short)var7, var8, var3, var9);
      var3.writeByte(m44.a<"s">(this, 333940638626971327L, var5));
   }

   public ib(int var1, long var2) {
      var2 = a ^ var2;
      super(b<"a">(4898, 5705628413662509532L ^ var2));
      m44.a<"v">(this, var1, 7202707190289930728L, var2);
   }

   public final boolean T(long var1) {
      return false;
   }

   public ib(String var1, short var2, short var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      super(b<"a">(12948, 4712922827150506404L ^ var5));
      m44.a<"q">(this, (Integer)m44.a<"i">(-4261980955205117148L, var5).get(var1), -4455692632416798665L, var5);
   }

   public boolean d(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public int T(char var1, int var2, char var3) {
      return 2;
   }

   public final boolean Y(long param1, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 5367725136247488929
      // 03: lload 1
      // 04: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 5
      // 0b: iload 3
      // 0c: iload 5
      // 0e: lload 1
      // 0f: lconst_0
      // 10: lcmp
      // 11: ifle 1b
      // 14: ifeq 39
      // 17: iload 4
      // 19: bipush 1
      // 1a: isub
      // 1b: if_icmpne 3c
      // 1e: goto 2b
      // 21: ldc2_w 5385843175221654006
      // 24: lload 1
      // 25: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: athrow
      // 2b: bipush 1
      // 2c: goto 39
      // 2f: ldc2_w 5385843175221654006
      // 32: lload 1
      // 33: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: athrow
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   public String l(Object[] var1) {
      long var2 = (Long)var1[0];
      long var10001 = var2 ^ 62838192416743L;
      int var4 = (int)((var2 ^ 62838192416743L) >>> 32);
      int var5 = (int)((var2 ^ 62838192416743L) << 32 >>> 56);
      int var6 = (int)(var10001 << 40 >>> 40);
      StringBuilder var7 = new StringBuilder();
      byte var10003 = (byte)var5;
      Object[] var10006 = new Object[]{null, null, var6};
      var10006[1] = Integer.valueOf(var10003);
      var10006[0] = var4;
      var7.append(m44.a<"s">(this, var10006, -7550383759637692338L, var2));
      var7.append((char)b<"a">(11130, 4066564572041801345L ^ var2));
      var7.append(m44.a<"h">(-7633569193337977139L, var2)[m44.a<"r">(this, -8287946992464759066L, var2)]);
      return var7.toString();
   }

   public void h(Object[] param1) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/io/PrintWriter
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 3
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 102513965841398
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 111883434377042
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 9522033084411
      // 02f: lxor
      // 030: dup2
      // 031: bipush 32
      // 033: lushr
      // 034: l2i
      // 035: istore 10
      // 037: dup2
      // 038: bipush 32
      // 03a: lshl
      // 03b: bipush 56
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 11
      // 041: dup2
      // 042: bipush 40
      // 044: lshl
      // 045: bipush 40
      // 047: lushr
      // 048: l2i
      // 049: istore 12
      // 04b: pop2
      // 04c: pop2
      // 04d: new java/lang/StringBuilder
      // 050: dup
      // 051: sipush 28159
      // 054: ldc2_w 1502699437309282333
      // 057: lload 4
      // 059: lxor
      // 05a: invokedynamic a (IJ)I bsm=com/zelix/ib.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: invokespecial java/lang/StringBuilder.<init> (I)V
      // 062: astore 14
      // 064: aload 0
      // 065: iload 10
      // 067: iload 11
      // 069: i2b
      // 06a: iload 12
      // 06c: bipush 3
      // 06d: anewarray 70
      // 070: dup_x1
      // 071: swap
      // 072: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 075: bipush 2
      // 076: swap
      // 077: aastore
      // 078: dup_x1
      // 079: swap
      // 07a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07d: bipush 1
      // 07e: swap
      // 07f: aastore
      // 080: dup_x1
      // 081: swap
      // 082: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 085: bipush 0
      // 086: swap
      // 087: aastore
      // 088: ldc2_w -636251684499120046
      // 08b: lload 4
      // 08d: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: astore 15
      // 094: aload 14
      // 096: new java/lang/StringBuilder
      // 099: dup
      // 09a: invokespecial java/lang/StringBuilder.<init> ()V
      // 09d: aload 15
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: ldc " "
      // 0a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a7: aload 0
      // 0a8: ldc2_w -1375993101535176966
      // 0ab: lload 4
      // 0ad: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0b5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: pop
      // 0bc: ldc2_w -1142121718372861931
      // 0bf: lload 4
      // 0c1: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: ldc2_w -717148981746145583
      // 0c9: lload 4
      // 0cb: invokedynamic l (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: aload 0
      // 0d1: ldc2_w -1375993101535176966
      // 0d4: lload 4
      // 0d6: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: aaload
      // 0dc: astore 16
      // 0de: aload 0
      // 0df: lload 8
      // 0e1: bipush 1
      // 0e2: anewarray 70
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: ldc2_w -1388346946909084418
      // 0f1: lload 4
      // 0f3: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: astore 17
      // 0fa: istore 13
      // 0fc: lload 6
      // 0fe: aload 17
      // 100: aload 16
      // 102: bipush 3
      // 103: anewarray 70
      // 106: dup_x1
      // 107: swap
      // 108: bipush 2
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 1
      // 10e: swap
      // 10f: aastore
      // 110: dup_x2
      // 111: dup_x2
      // 112: pop
      // 113: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 116: bipush 0
      // 117: swap
      // 118: aastore
      // 119: ldc2_w -1214410100789358428
      // 11c: lload 4
      // 11e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: astore 17
      // 125: iload 13
      // 127: ifne 189
      // 12a: aload 17
      // 12c: invokevirtual java/lang/String.length ()I
      // 12f: ifle 168
      // 132: goto 140
      // 135: ldc2_w -1210031371508853635
      // 138: lload 4
      // 13a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: aload 14
      // 142: new java/lang/StringBuilder
      // 145: dup
      // 146: invokespecial java/lang/StringBuilder.<init> ()V
      // 149: ldc "\t"
      // 14b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14e: aload 17
      // 150: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 153: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: pop
      // 15a: goto 168
      // 15d: ldc2_w -1210031371508853635
      // 160: lload 4
      // 162: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: aload 2
      // 169: new java/lang/StringBuilder
      // 16c: dup
      // 16d: invokespecial java/lang/StringBuilder.<init> ()V
      // 170: aload 3
      // 171: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 174: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 177: aload 3
      // 178: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17e: aload 14
      // 180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 183: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 186: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 189: return
   }

   private static n9 a(n9 var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17266;
      if (d[var3] == null) {
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ib", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
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
         throw new RuntimeException("com/zelix/ib" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
