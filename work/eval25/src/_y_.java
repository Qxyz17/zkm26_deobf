package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _y_ {
   private boolean h;
   private w9 v;
   private ArrayList i;
   private String a;
   public static final int H;
   private static final long b = ess.a(8235494796281407153L, -1772714662076951904L, MethodHandles.lookup().lookupClass()).a(208713460313316L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map j;

   static {
      long var20 = b ^ 97022520730553L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[6];
      int var16 = 0;
      String var15 = "ïÕÉ\u0089\u0018,sqØ!'%Æ\u000e$Øà\u009b\u0084\u0086\u008fæ\u00ad\u001b¦)\u0018ñ÷õíI\u0097dÇ«ÖÆÓ%(ÈZ\u0015o¯á\u0090¤É\u0084¦#;;ÁÊ\u0099Ú<\u008déÆì\u0004\u0013º\u0001Ðqtn]&°\u0002ø¿ÜÝm\u0010Ha\u0014)\u0097üýPrI+¼\u0088ï\"«(\u008b\nÞ4/®\u008d_\u0090\u0088\u0080p0|\u008cr\u009f\u0092Ý¼'\u007f¢\u009d¼Ñ'¿\u00adybKYc\u0000\u0094K\u0086[e";
      int var17 = "ïÕÉ\u0089\u0018,sqØ!'%Æ\u000e$Øà\u009b\u0084\u0086\u008fæ\u00ad\u001b¦)\u0018ñ÷õíI\u0097dÇ«ÖÆÓ%(ÈZ\u0015o¯á\u0090¤É\u0084¦#;;ÁÊ\u0099Ú<\u008déÆì\u0004\u0013º\u0001Ðqtn]&°\u0002ø¿ÜÝm\u0010Ha\u0014)\u0097üýPrI+¼\u0088ï\"«(\u008b\nÞ4/®\u008d_\u0090\u0088\u0080p0|\u008cr\u009f\u0092Ý¼'\u007f¢\u009d¼Ñ'¿\u00adybKYc\u0000\u0094K\u0086[e"
         .length();
      char var14 = '(';
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
                     c = var18;
                     d = new String[6];
                     j = new HashMap(13);
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
                     String var4 = "ñqSWE\u0004b¶Ê\u00ad½\u00ad\u008eÒæÛ[lÂätt#ú";
                     int var5 = "ñqSWE\u0004b¶Ê\u00ad½\u00ad\u008eÒæÛ[lÂätt#ú".length();
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
                                    g = new Integer[5];
                                    H = a<"j">(2910, 4781807079732365583L ^ var20).length();
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "®\u0002=*Õ+û\u0011\\J\b\u0010J\u0005xÓ";
                                 var5 = "®\u0002=*Õ+û\u0011\\J\b\u0010J\u0005xÓ".length();
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

                  var15 = "ç\u008drþ9\u0015\u009e\u008ckà\u0096\u007f\u0011§\u0014ë\u0010½Þâü³,\u0098\u000b\u0081[ÿì \u0083Aí";
                  var17 = "ç\u008drþ9\u0015\u009e\u008ckà\u0096\u007f\u0011§\u0014ë\u0010½Þâü³,\u0098\u000b\u0081[ÿì \u0083Aí".length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public String k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"o">(this, 719057505076108516L, var2);
   }

   public void g(Object[] param1) {
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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 4
      // 01b: pop
      // 01c: getstatic com/zelix/_y_.b J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 99647686973999
      // 027: lxor
      // 028: lstore 6
      // 02a: pop2
      // 02b: ldc2_w 4764136729539008414
      // 02e: lload 2
      // 02f: invokedynamic p (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: new java/lang/StringBuilder
      // 037: dup
      // 038: invokespecial java/lang/StringBuilder.<init> ()V
      // 03b: sipush 32753
      // 03e: ldc2_w 6699404162295567120
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/_y_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04b: aload 0
      // 04c: ldc2_w 5003941733331079279
      // 04f: lload 2
      // 050: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 058: sipush 4144
      // 05b: ldc2_w 1714577806109768916
      // 05e: lload 2
      // 05f: lxor
      // 060: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/_y_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 068: aload 5
      // 06a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06d: ldc "'"
      // 06f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 072: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 075: astore 9
      // 077: aload 0
      // 078: ldc2_w 5003941733331079279
      // 07b: lload 2
      // 07c: invokedynamic l (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: bipush 1
      // 082: anewarray 302
      // 085: dup_x1
      // 086: swap
      // 087: bipush 0
      // 088: swap
      // 089: aastore
      // 08a: ldc2_w 4909962294183985771
      // 08d: lload 2
      // 08e: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: astore 10
      // 095: lload 6
      // 097: aload 10
      // 099: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 09c: astore 11
      // 09e: astore 8
      // 0a0: aload 11
      // 0a2: aload 8
      // 0a4: ifnull 0cf
      // 0a7: ifnull 0d0
      // 0aa: goto 0b7
      // 0ad: ldc2_w 6392059699930503684
      // 0b0: lload 2
      // 0b1: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 4
      // 0b9: aload 11
      // 0bb: aload 9
      // 0bd: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0c2: goto 0cf
      // 0c5: ldc2_w 6392059699930503684
      // 0c8: lload 2
      // 0c9: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: pop
      // 0d0: bipush 0
      // 0d1: istore 12
      // 0d3: iload 12
      // 0d5: aload 0
      // 0d6: ldc2_w 6438906071578660876
      // 0d9: lload 2
      // 0da: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: invokevirtual java/util/ArrayList.size ()I
      // 0e2: if_icmpge 152
      // 0e5: aload 0
      // 0e6: ldc2_w 6438906071578660876
      // 0e9: lload 2
      // 0ea: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: iload 12
      // 0f1: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 0f4: checkcast java/lang/String
      // 0f7: bipush 1
      // 0f8: anewarray 302
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: bipush 0
      // 0fe: swap
      // 0ff: aastore
      // 100: ldc2_w 4909962294183985771
      // 103: lload 2
      // 104: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: astore 13
      // 10b: lload 6
      // 10d: aload 13
      // 10f: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 112: astore 14
      // 114: aload 8
      // 116: lload 2
      // 117: lconst_0
      // 118: lcmp
      // 119: ifle 14f
      // 11c: ifnull 14d
      // 11f: aload 14
      // 121: ifnull 14a
      // 124: goto 131
      // 127: ldc2_w 6392059699930503684
      // 12a: lload 2
      // 12b: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: aload 4
      // 133: aload 14
      // 135: aload 9
      // 137: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 13c: pop
      // 13d: goto 14a
      // 140: ldc2_w 6392059699930503684
      // 143: lload 2
      // 144: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: iinc 12 1
      // 14d: aload 8
      // 14f: ifnonnull 0d3
      // 152: return
   }

   public boolean i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"l">(this, 5741272287724195149L, var2);
   }

   public void a(Object[] param1) {
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
      // 00a: lstore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/_y_
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/_y_.b J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 52548176113173
      // 01f: lxor
      // 020: lstore 5
      // 022: pop2
      // 023: ldc2_w 7618339631259221050
      // 026: lload 2
      // 027: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: astore 7
      // 02e: aload 0
      // 02f: aload 0
      // 030: ldc2_w 8359015699734099681
      // 033: lload 2
      // 034: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: aload 7
      // 03b: ifnull 07c
      // 03e: ifne 07b
      // 041: goto 04e
      // 044: ldc2_w 8291534785283535264
      // 047: lload 2
      // 048: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: athrow
      // 04e: aload 4
      // 050: ldc2_w 8359015699734099681
      // 053: lload 2
      // 054: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: aload 7
      // 05b: ifnull 07c
      // 05e: goto 06b
      // 061: ldc2_w 8291534785283535264
      // 064: lload 2
      // 065: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: ifeq 07f
      // 06e: goto 07b
      // 071: ldc2_w 8291534785283535264
      // 074: lload 2
      // 075: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: bipush 1
      // 07c: goto 080
      // 07f: bipush 0
      // 080: ldc2_w 8359015699734099681
      // 083: lload 2
      // 084: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: lload 5
      // 08b: bipush 1
      // 08c: anewarray 302
      // 08f: dup_x2
      // 090: dup_x2
      // 091: pop
      // 092: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 095: bipush 0
      // 096: swap
      // 097: aastore
      // 098: ldc2_w 7931386549736499165
      // 09b: lload 2
      // 09c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: astore 8
      // 0a3: aload 0
      // 0a4: ldc2_w 8272520850931094886
      // 0a7: lload 2
      // 0a8: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/w9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: ldc2_w 8384748827517380377
      // 0b0: lload 2
      // 0b1: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0bb: astore 9
      // 0bd: aload 9
      // 0bf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c4: ifeq 112
      // 0c7: aload 9
      // 0c9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ce: checkcast java/util/Map$Entry
      // 0d1: astore 10
      // 0d3: aload 10
      // 0d5: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0da: checkcast java/lang/String
      // 0dd: astore 11
      // 0df: aload 11
      // 0e1: aload 7
      // 0e3: ifnull 15f
      // 0e6: ifnull 10d
      // 0e9: goto 0f6
      // 0ec: ldc2_w 8291534785283535264
      // 0ef: lload 2
      // 0f0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 8
      // 0f8: aload 11
      // 0fa: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0ff: pop
      // 100: goto 10d
      // 103: ldc2_w 8291534785283535264
      // 106: lload 2
      // 107: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: aload 7
      // 10f: ifnonnull 0bd
      // 112: aload 4
      // 114: ldc2_w 8272520850931094886
      // 117: lload 2
      // 118: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/w9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: ldc2_w 8384748827517380377
      // 120: lload 2
      // 121: invokedynamic l (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 12b: lload 2
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: ifle 0ce
      // 131: astore 9
      // 133: aload 9
      // 135: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13a: ifeq 233
      // 13d: aload 9
      // 13f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 144: checkcast java/util/Map$Entry
      // 147: astore 10
      // 149: aload 10
      // 14b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 150: checkcast java/lang/String
      // 153: astore 11
      // 155: aload 10
      // 157: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 15c: checkcast java/lang/String
      // 15f: astore 12
      // 161: lload 2
      // 162: lconst_0
      // 163: lcmp
      // 164: ifle 1cd
      // 167: aload 12
      // 169: ifnull 1cd
      // 16c: aload 8
      // 16e: lload 2
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 1c1
      // 174: aload 7
      // 176: ifnull 1c1
      // 179: goto 186
      // 17c: ldc2_w 8291534785283535264
      // 17f: lload 2
      // 180: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 185: athrow
      // 186: aload 12
      // 188: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 18d: ifeq 22e
      // 190: goto 19d
      // 193: ldc2_w 8291534785283535264
      // 196: lload 2
      // 197: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: athrow
      // 19d: aload 0
      // 19e: ldc2_w 8272520850931094886
      // 1a1: lload 2
      // 1a2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/w9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: aload 11
      // 1a9: aload 12
      // 1ab: ldc2_w 8022200645747997136
      // 1ae: lload 2
      // 1af: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: goto 1c1
      // 1b7: ldc2_w 8291534785283535264
      // 1ba: lload 2
      // 1bb: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: pop
      // 1c2: aload 7
      // 1c4: lload 2
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: iflt 230
      // 1ca: ifnonnull 22e
      // 1cd: aload 0
      // 1ce: ldc2_w 8272520850931094886
      // 1d1: lload 2
      // 1d2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/w9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: lload 2
      // 1d8: lconst_0
      // 1d9: lcmp
      // 1da: iflt 22d
      // 1dd: aload 11
      // 1df: aload 7
      // 1e1: ifnull 223
      // 1e4: goto 1f1
      // 1e7: ldc2_w 8291534785283535264
      // 1ea: lload 2
      // 1eb: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: ldc2_w 7559357235883672519
      // 1f4: lload 2
      // 1f5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: ifne 22e
      // 1fd: goto 20a
      // 200: ldc2_w 8291534785283535264
      // 203: lload 2
      // 204: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: athrow
      // 20a: aload 0
      // 20b: ldc2_w 8272520850931094886
      // 20e: lload 2
      // 20f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/w9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 214: aload 11
      // 216: goto 223
      // 219: ldc2_w 8291534785283535264
      // 21c: lload 2
      // 21d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: athrow
      // 223: aconst_null
      // 224: ldc2_w 8022200645747997136
      // 227: lload 2
      // 228: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22d: pop
      // 22e: aload 7
      // 230: ifnonnull 133
      // 233: return
   }

   public void J(Object[] param1) {
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
      // 004: checkcast java/util/zip/ZipOutputStream
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: astore 7
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_8s
      // 021: astore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Boolean
      // 029: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02c: istore 5
      // 02e: pop
      // 02f: getstatic com/zelix/_y_.b J
      // 032: lload 2
      // 033: lxor
      // 034: lstore 2
      // 035: lload 2
      // 036: dup2
      // 037: ldc2_w 51105271349278
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 15458223528388
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 73469364920666
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 80748075551269
      // 04f: lxor
      // 050: lstore 14
      // 052: dup2
      // 053: ldc2_w 99748056850233
      // 056: lxor
      // 057: lstore 16
      // 059: dup2
      // 05a: ldc2_w 44679416978774
      // 05d: lxor
      // 05e: lstore 18
      // 060: pop2
      // 061: ldc2_w -9070261429386897508
      // 064: lload 2
      // 065: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: new com/zelix/sk
      // 06d: dup
      // 06e: lload 10
      // 070: aload 6
      // 072: aload 0
      // 073: lload 8
      // 075: aload 4
      // 077: bipush 2
      // 078: anewarray 302
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 1
      // 07e: swap
      // 07f: aastore
      // 080: dup_x2
      // 081: dup_x2
      // 082: pop
      // 083: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 086: bipush 0
      // 087: swap
      // 088: aastore
      // 089: ldc2_w -9010782383237031890
      // 08c: lload 2
      // 08d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: iload 5
      // 094: invokespecial com/zelix/sk.<init> (JLjava/util/zip/ZipOutputStream;Ljava/lang/String;Z)V
      // 097: astore 21
      // 099: new java/io/PrintWriter
      // 09c: dup
      // 09d: new java/io/OutputStreamWriter
      // 0a0: dup
      // 0a1: aload 21
      // 0a3: lload 16
      // 0a5: bipush 1
      // 0a6: anewarray 302
      // 0a9: dup_x2
      // 0aa: dup_x2
      // 0ab: pop
      // 0ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0af: bipush 0
      // 0b0: swap
      // 0b1: aastore
      // 0b2: ldc2_w -8820336400491998474
      // 0b5: lload 2
      // 0b6: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/OutputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: sipush 346
      // 0be: ldc2_w 9145808758707432890
      // 0c1: lload 2
      // 0c2: lxor
      // 0c3: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/_y_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: invokespecial java/io/OutputStreamWriter.<init> (Ljava/io/OutputStream;Ljava/lang/String;)V
      // 0cb: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 0ce: astore 22
      // 0d0: aload 0
      // 0d1: ldc2_w -7391577775145386304
      // 0d4: lload 2
      // 0d5: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/w9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: ldc2_w -6919026095383638849
      // 0dd: lload 2
      // 0de: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: astore 23
      // 0e5: aload 23
      // 0e7: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0ec: astore 24
      // 0ee: astore 20
      // 0f0: aload 24
      // 0f2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f7: ifeq 1f6
      // 0fa: aload 24
      // 0fc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 101: checkcast java/util/Map$Entry
      // 104: astore 25
      // 106: aload 25
      // 108: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 10d: checkcast java/lang/String
      // 110: astore 26
      // 112: aload 25
      // 114: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 119: checkcast java/lang/String
      // 11c: astore 27
      // 11e: aload 20
      // 120: lload 2
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 12b
      // 126: ifnull 229
      // 129: aload 20
      // 12b: ifnull 1f1
      // 12e: goto 13b
      // 131: ldc2_w -7442409240052540922
      // 134: lload 2
      // 135: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: aload 27
      // 13d: ifnull 1ea
      // 140: goto 14d
      // 143: ldc2_w -7442409240052540922
      // 146: lload 2
      // 147: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: aload 27
      // 14f: sipush 9096
      // 152: ldc2_w 6006350812601741235
      // 155: lload 2
      // 156: lxor
      // 157: invokedynamic g (IJ)I bsm=com/zelix/_y_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: sipush 1844
      // 15f: ldc2_w 7102937065584773902
      // 162: lload 2
      // 163: lxor
      // 164: invokedynamic g (IJ)I bsm=com/zelix/_y_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 16c: astore 28
      // 16e: aload 28
      // 170: aload 4
      // 172: lload 12
      // 174: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 177: checkcast java/lang/String
      // 17a: astore 29
      // 17c: aload 20
      // 17e: lload 2
      // 17f: lconst_0
      // 180: lcmp
      // 181: iflt 1f3
      // 184: ifnull 1f1
      // 187: aload 28
      // 189: aload 29
      // 18b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 18e: ifne 1ea
      // 191: goto 19e
      // 194: ldc2_w -7442409240052540922
      // 197: lload 2
      // 198: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: aload 26
      // 1a0: lload 18
      // 1a2: aload 27
      // 1a4: aload 29
      // 1a6: sipush 1844
      // 1a9: ldc2_w 7102937065584773902
      // 1ac: lload 2
      // 1ad: lxor
      // 1ae: invokedynamic g (IJ)I bsm=com/zelix/_y_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: sipush 9096
      // 1b6: ldc2_w 6006350812601741235
      // 1b9: lload 2
      // 1ba: lxor
      // 1bb: invokedynamic g (IJ)I bsm=com/zelix/_y_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 1c3: bipush 4
      // 1c4: anewarray 302
      // 1c7: dup_x1
      // 1c8: swap
      // 1c9: bipush 3
      // 1ca: swap
      // 1cb: aastore
      // 1cc: dup_x1
      // 1cd: swap
      // 1ce: bipush 2
      // 1cf: swap
      // 1d0: aastore
      // 1d1: dup_x2
      // 1d2: dup_x2
      // 1d3: pop
      // 1d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d7: bipush 1
      // 1d8: swap
      // 1d9: aastore
      // 1da: dup_x1
      // 1db: swap
      // 1dc: bipush 0
      // 1dd: swap
      // 1de: aastore
      // 1df: ldc2_w -8752409044216753218
      // 1e2: lload 2
      // 1e3: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: astore 26
      // 1ea: aload 22
      // 1ec: aload 26
      // 1ee: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 1f1: aload 20
      // 1f3: ifnonnull 0f0
      // 1f6: aload 22
      // 1f8: ldc2_w -7066087383036322719
      // 1fb: lload 2
      // 1fc: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: aload 21
      // 203: aload 7
      // 205: lload 14
      // 207: bipush 2
      // 208: anewarray 302
      // 20b: dup_x2
      // 20c: dup_x2
      // 20d: pop
      // 20e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 211: bipush 1
      // 212: swap
      // 213: aastore
      // 214: dup_x1
      // 215: swap
      // 216: bipush 0
      // 217: swap
      // 218: aastore
      // 219: ldc2_w -7176611241247567586
      // 21c: lload 2
      // 21d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/zip/CRC32; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: pop
      // 223: lload 2
      // 224: lconst_0
      // 225: lcmp
      // 226: ifle 229
      // 229: return
   }

   public _y_(ZipFile param1, long param2, ZipEntry param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_y_.b J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 103416505049784
      // 00b: lxor
      // 00c: lstore 5
      // 00e: dup2
      // 00f: ldc2_w 114211688844906
      // 012: lxor
      // 013: lstore 7
      // 015: pop2
      // 016: ldc2_w -1723839281596334704
      // 019: lload 2
      // 01a: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: aload 0
      // 020: invokespecial java/lang/Object.<init> ()V
      // 023: astore 9
      // 025: aload 0
      // 026: new com/zelix/w9
      // 029: dup
      // 02a: lload 7
      // 02c: invokespecial com/zelix/w9.<init> (J)V
      // 02f: ldc2_w -907594986106972980
      // 032: lload 2
      // 033: invokedynamic u (Ljava/lang/Object;Lcom/zelix/w9;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 038: aload 0
      // 039: new java/util/ArrayList
      // 03c: dup
      // 03d: invokespecial java/util/ArrayList.<init> ()V
      // 040: ldc2_w -912618124635211262
      // 043: lload 2
      // 044: invokedynamic u (Ljava/lang/Object;Ljava/util/ArrayList;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: aload 0
      // 04a: aload 4
      // 04c: ldc2_w -997728724498337596
      // 04f: lload 2
      // 050: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: aload 9
      // 057: ifnull 085
      // 05a: sipush 30853
      // 05d: ldc2_w 2688216444370738865
      // 060: lload 2
      // 061: lxor
      // 062: invokedynamic g (IJ)I bsm=com/zelix/_y_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: if_icmpne 088
      // 06a: goto 077
      // 06d: ldc2_w -956165833590624246
      // 070: lload 2
      // 071: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: bipush 1
      // 078: goto 085
      // 07b: ldc2_w -956165833590624246
      // 07e: lload 2
      // 07f: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: goto 089
      // 088: bipush 0
      // 089: ldc2_w -744423571144968373
      // 08c: lload 2
      // 08d: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: aload 0
      // 093: aload 4
      // 095: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 098: ldc2_w -666082317330145160
      // 09b: lload 2
      // 09c: invokedynamic o (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0a4: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0a7: ldc2_w -1189022675566708127
      // 0aa: lload 2
      // 0ab: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: aconst_null
      // 0b1: astore 10
      // 0b3: aconst_null
      // 0b4: astore 11
      // 0b6: aload 1
      // 0b7: aload 4
      // 0b9: ldc2_w -1341975044217559627
      // 0bc: lload 2
      // 0bd: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/InputStream; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: astore 10
      // 0c4: aload 10
      // 0c6: sipush 18200
      // 0c9: ldc2_w 5851344931857564147
      // 0cc: lload 2
      // 0cd: lxor
      // 0ce: invokedynamic j (IJ)Ljava/lang/String; bsm=com/zelix/_y_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: aconst_null
      // 0d4: lload 5
      // 0d6: bipush 4
      // 0d7: anewarray 302
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 3
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: bipush 2
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x1
      // 0e9: swap
      // 0ea: bipush 1
      // 0eb: swap
      // 0ec: aastore
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: ldc2_w -1394704391206136463
      // 0f5: lload 2
      // 0f6: invokedynamic v (Ljava/lang/Object;JJ)Ljava/io/BufferedReader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: astore 11
      // 0fd: aload 11
      // 0ff: invokevirtual java/io/BufferedReader.readLine ()Ljava/lang/String;
      // 102: dup
      // 103: astore 12
      // 105: ifnull 208
      // 108: aload 12
      // 10a: astore 13
      // 10c: aload 12
      // 10e: ldc "#"
      // 110: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 113: istore 14
      // 115: lload 2
      // 116: lconst_0
      // 117: lcmp
      // 118: iflt 23e
      // 11b: aload 9
      // 11d: ifnull 23e
      // 120: iload 14
      // 122: lload 2
      // 123: lconst_0
      // 124: lcmp
      // 125: iflt 196
      // 128: aload 9
      // 12a: ifnull 196
      // 12d: goto 13a
      // 130: ldc2_w -956165833590624246
      // 133: lload 2
      // 134: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: bipush -1
      // 13b: if_icmpeq 178
      // 13e: goto 14b
      // 141: ldc2_w -956165833590624246
      // 144: lload 2
      // 145: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: iload 14
      // 14d: ifle 174
      // 150: goto 15d
      // 153: ldc2_w -956165833590624246
      // 156: lload 2
      // 157: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: aload 12
      // 15f: bipush 0
      // 160: iload 14
      // 162: bipush 1
      // 163: isub
      // 164: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 167: astore 13
      // 169: lload 2
      // 16a: lconst_0
      // 16b: lcmp
      // 16c: iflt 17f
      // 16f: aload 9
      // 171: ifnonnull 178
      // 174: ldc ""
      // 176: astore 13
      // 178: aload 13
      // 17a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 17d: astore 13
      // 17f: aload 13
      // 181: aload 9
      // 183: ifnull 202
      // 186: invokevirtual java/lang/String.length ()I
      // 189: goto 196
      // 18c: ldc2_w -956165833590624246
      // 18f: lload 2
      // 190: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: lload 2
      // 197: lconst_0
      // 198: lcmp
      // 199: iflt 1ae
      // 19c: ifle 1df
      // 19f: aload 0
      // 1a0: ldc2_w -912618124635211262
      // 1a3: lload 2
      // 1a4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: aload 13
      // 1ab: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1ae: pop
      // 1af: aload 0
      // 1b0: ldc2_w -907594986106972980
      // 1b3: lload 2
      // 1b4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/w9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: aload 12
      // 1bb: aload 13
      // 1bd: ldc2_w -1225293341145532294
      // 1c0: lload 2
      // 1c1: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: pop
      // 1c7: aload 9
      // 1c9: lload 2
      // 1ca: lconst_0
      // 1cb: lcmp
      // 1cc: iflt 205
      // 1cf: ifnonnull 203
      // 1d2: goto 1df
      // 1d5: ldc2_w -956165833590624246
      // 1d8: lload 2
      // 1d9: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 0
      // 1e0: ldc2_w -907594986106972980
      // 1e3: lload 2
      // 1e4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/w9; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: aload 12
      // 1eb: aconst_null
      // 1ec: ldc2_w -1225293341145532294
      // 1ef: lload 2
      // 1f0: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: goto 202
      // 1f8: ldc2_w -956165833590624246
      // 1fb: lload 2
      // 1fc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: pop
      // 203: aload 9
      // 205: ifnonnull 0fd
      // 208: lload 2
      // 209: lconst_0
      // 20a: lcmp
      // 20b: ifle 23e
      // 20e: lload 2
      // 20f: lconst_0
      // 210: lcmp
      // 211: iflt 236
      // 214: aload 11
      // 216: aload 9
      // 218: ifnull 22d
      // 21b: ifnull 23e
      // 21e: goto 22b
      // 221: ldc2_w -956165833590624246
      // 224: lload 2
      // 225: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: athrow
      // 22b: aload 11
      // 22d: ldc2_w -1180557928997678915
      // 230: lload 2
      // 231: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 236: goto 2e5
      // 239: astore 12
      // 23b: goto 2e5
      // 23e: lload 2
      // 23f: lconst_0
      // 240: lcmp
      // 241: iflt 266
      // 244: aload 10
      // 246: aload 9
      // 248: ifnull 25d
      // 24b: ifnull 2e5
      // 24e: goto 25b
      // 251: ldc2_w -956165833590624246
      // 254: lload 2
      // 255: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25a: athrow
      // 25b: aload 10
      // 25d: ldc2_w -1608754925692250187
      // 260: lload 2
      // 261: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: goto 2e5
      // 269: astore 12
      // 26b: goto 2e5
      // 26e: astore 15
      // 270: lload 2
      // 271: lconst_0
      // 272: lcmp
      // 273: iflt 298
      // 276: aload 11
      // 278: aload 9
      // 27a: ifnull 28f
      // 27d: ifnull 2a8
      // 280: goto 28d
      // 283: ldc2_w -956165833590624246
      // 286: lload 2
      // 287: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: athrow
      // 28d: aload 11
      // 28f: ldc2_w -1180557928997678915
      // 292: lload 2
      // 293: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: goto 2e2
      // 29b: astore 16
      // 29d: lload 2
      // 29e: lconst_0
      // 29f: lcmp
      // 2a0: ifle 2a8
      // 2a3: aload 9
      // 2a5: ifnonnull 2e2
      // 2a8: lload 2
      // 2a9: lconst_0
      // 2aa: lcmp
      // 2ab: ifle 2dd
      // 2ae: aload 10
      // 2b0: aload 9
      // 2b2: ifnull 2d4
      // 2b5: goto 2c2
      // 2b8: ldc2_w -956165833590624246
      // 2bb: lload 2
      // 2bc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c1: athrow
      // 2c2: ifnull 2e2
      // 2c5: goto 2d2
      // 2c8: ldc2_w -956165833590624246
      // 2cb: lload 2
      // 2cc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: athrow
      // 2d2: aload 10
      // 2d4: ldc2_w -1608754925692250187
      // 2d7: lload 2
      // 2d8: invokedynamic n (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: goto 2e2
      // 2e0: astore 16
      // 2e2: aload 15
      // 2e4: athrow
      // 2e5: return
   }

   public String p(Object[] var1) {
      long var2 = (Long)var1[0];
      _8s var4 = (_8s)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 61773643228652L;
      String var7 = x44.a<"h">(this, -4484036198230256421L, var2)
         .replace((char)b<"g">(15351, 2109623661654946680L ^ var2), (char)b<"g">(10715, 7172810375480811858L ^ var2));
      String var8 = (String)sh.a(var7, var4, var5);
      String var9 = var8.replace((char)b<"g">(1844, 7102960976324497336L ^ var2), (char)b<"g">(9096, 6006292009624218373L ^ var2));
      return a<"j">(12936, 7270475796891261660L ^ var2) + var9;
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9539;
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
            throw new RuntimeException("com/zelix/_y_", var10);
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
         throw new RuntimeException("com/zelix/_y_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17818;
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_y_", var14);
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
         throw new RuntimeException("com/zelix/_y_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
