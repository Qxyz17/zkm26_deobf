package com.zelix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

public class ah extends Thread {
   PrintWriter h;
   String I;
   boolean f;
   InputStream G;
   private static final long a = ess.a(3908712482640114167L, 6832154657670579226L, MethodHandles.lookup().lookupClass()).a(76179040882382L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] g;
   private static final Map i;

   ah(InputStream param1, PrintWriter param2, long param3, int param5, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ah.a J
      // 003: lload 3
      // 004: lxor
      // 005: lstore 3
      // 006: lload 3
      // 007: dup2
      // 008: ldc2_w 54941886513275
      // 00b: lxor
      // 00c: lstore 7
      // 00e: pop2
      // 00f: ldc2_w 8312363984148648677
      // 012: lload 3
      // 013: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 018: aload 0
      // 019: invokespecial java/lang/Thread.<init> ()V
      // 01c: astore 9
      // 01e: aload 0
      // 01f: aload 1
      // 020: ldc2_w 7501356151490203955
      // 023: lload 3
      // 024: invokedynamic t (Ljava/lang/Object;Ljava/io/InputStream;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 029: aload 0
      // 02a: aload 9
      // 02c: ifnonnull 0d9
      // 02f: aload 2
      // 030: ldc2_w 7617561071845943119
      // 033: lload 3
      // 034: invokedynamic t (Ljava/lang/Object;Ljava/io/PrintWriter;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 039: iload 6
      // 03b: ifeq 0cb
      // 03e: goto 04b
      // 041: ldc2_w 8210522501774283577
      // 044: lload 3
      // 045: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: aload 0
      // 04c: sipush 25610
      // 04f: ldc2_w 3446988881077797882
      // 052: lload 3
      // 053: lxor
      // 054: invokedynamic p (IJ)Ljava/lang/String; bsm=com/zelix/ah.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: sipush 17050
      // 05c: ldc2_w 2740838223309498061
      // 05f: lload 3
      // 060: lxor
      // 061: invokedynamic m (IJ)I bsm=com/zelix/ah.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: iload 5
      // 068: lload 7
      // 06a: sipush 566
      // 06d: ldc2_w 689799830967428704
      // 070: lload 3
      // 071: lxor
      // 072: invokedynamic m (IJ)I bsm=com/zelix/ah.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: bipush 5
      // 078: anewarray 342
      // 07b: dup_x1
      // 07c: swap
      // 07d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 080: bipush 4
      // 081: swap
      // 082: aastore
      // 083: dup_x2
      // 084: dup_x2
      // 085: pop
      // 086: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 089: bipush 3
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x1
      // 08d: swap
      // 08e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 091: bipush 2
      // 092: swap
      // 093: aastore
      // 094: dup_x1
      // 095: swap
      // 096: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 099: bipush 1
      // 09a: swap
      // 09b: aastore
      // 09c: dup_x1
      // 09d: swap
      // 09e: bipush 0
      // 09f: swap
      // 0a0: aastore
      // 0a1: ldc2_w 8183345656338019413
      // 0a4: lload 3
      // 0a5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: ldc2_w 7628194719651656083
      // 0ad: lload 3
      // 0ae: invokedynamic t (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: lload 3
      // 0b4: lconst_0
      // 0b5: lcmp
      // 0b6: iflt 141
      // 0b9: aload 9
      // 0bb: ifnull 135
      // 0be: goto 0cb
      // 0c1: ldc2_w 8210522501774283577
      // 0c4: lload 3
      // 0c5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: goto 0d9
      // 0cf: ldc2_w 8210522501774283577
      // 0d2: lload 3
      // 0d3: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: ldc ""
      // 0db: sipush 30802
      // 0de: ldc2_w 7177277121982258183
      // 0e1: lload 3
      // 0e2: lxor
      // 0e3: invokedynamic m (IJ)I bsm=com/zelix/ah.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: iload 5
      // 0ea: lload 7
      // 0ec: sipush 1470
      // 0ef: ldc2_w 9070713133054927338
      // 0f2: lload 3
      // 0f3: lxor
      // 0f4: invokedynamic m (IJ)I bsm=com/zelix/ah.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: bipush 5
      // 0fa: anewarray 342
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 102: bipush 4
      // 103: swap
      // 104: aastore
      // 105: dup_x2
      // 106: dup_x2
      // 107: pop
      // 108: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10b: bipush 3
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 113: bipush 2
      // 114: swap
      // 115: aastore
      // 116: dup_x1
      // 117: swap
      // 118: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11b: bipush 1
      // 11c: swap
      // 11d: aastore
      // 11e: dup_x1
      // 11f: swap
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: ldc2_w 8183345656338019413
      // 126: lload 3
      // 127: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: ldc2_w 7628194719651656083
      // 12f: lload 3
      // 130: invokedynamic t (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: aload 0
      // 136: iload 6
      // 138: ldc2_w 7827643401003735084
      // 13b: lload 3
      // 13c: invokedynamic t (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: return
   }

   @Override
   public void run() {
      long var1 = a ^ 138009980750068L;
      int[] var10000 = x44.a<"q">(-6864302253715652349L, var1);
      boolean var4 = false;
      int[] var3 = var10000;

      try {
         InputStreamReader var5 = new InputStreamReader(x44.a<"m">(this, -4900969908282588459L, var1));
         BufferedReader var6 = new BufferedReader(var5);
         Object var7 = null;

         while ((var7 = var6.readLine()) != null) {
            var4 = true;

            try {
               x44.a<"m">(this, -5021116558537427799L, var1).println(x44.a<"m">(this, -5027529189785656715L, var1) + var7);
               if (var3 != null || var3 != null) {
                  break;
               }
            } catch (IOException var9) {
               throw x44.a<"q">(var9, -6766719126197485345L, var1);
            }
         }
      } catch (IOException var10) {
         x44.a<"i">(var10, -4793326541841543237L, var1);
      }

      try {
         if (var4) {
            x44.a<"i">(
               x44.a<"h">(-6484645197585665437L, var1),
               x44.a<"m">(this, -5027529189785656715L, var1) + a<"p">(18050, 3614441734964671125L ^ var1),
               -4844587082296747558L,
               var1
            );
         }
      } catch (IOException var8) {
         throw x44.a<"q">(var8, -6766719126197485345L, var1);
      }
   }

   static {
      long var11 = a ^ 8113922157895L;
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
      String var17 = "é\u009cA\u008d3\u001e`\u008cÝ\u00889yç\u0082\u0003¾íïµ¨ì²M¯\u0007ÿbÐ4m<ê)3!ªn\u009d\u0092Dá~\u009eÓG@ÿ\u000bõ¶h@b\u00ad\u001aK\u0019SÞ²Û\u00ad\u0087¡\u0010\rÇò/ú!M`F\u001c±öáë W";
      int var19 = "é\u009cA\u008d3\u001e`\u008cÝ\u00889yç\u0082\u0003¾íïµ¨ì²M¯\u0007ÿbÐ4m<ê)3!ªn\u009d\u0092Dá~\u009eÓG@ÿ\u000bõ¶h@b\u00ad\u001aK\u0019SÞ²Û\u00ad\u0087¡\u0010\rÇò/ú!M`F\u001c±öáë W"
         .length();
      char var16 = '@';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var30 = a(var21).intern();
         int var10001 = -1;
         var20[var18++] = var30;
         if ((var15 += var16) >= var19) {
            b = var20;
            c = new String[2];
            i = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[4];
            int var3 = 0;
            String var4 = "É\u000bÁråk¼\u0010¤\u0016\u000bu\u007f©¿L";
            int var5 = "É\u000bÁråk¼\u0010¤\u0016\u000bu\u007f©¿L".length();
            byte var2 = 0;

            label32:
            while (true) {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               long[] var25 = var6;
               var10001 = var3++;
               long var33 = ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L;
               byte var36 = -1;

               while (true) {
                  long var8 = var33;
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
                  long var38 = ((long)var10[0] & 255L) << 56
                     | ((long)var10[1] & 255L) << 48
                     | ((long)var10[2] & 255L) << 40
                     | ((long)var10[3] & 255L) << 32
                     | ((long)var10[4] & 255L) << 24
                     | ((long)var10[5] & 255L) << 16
                     | ((long)var10[6] & 255L) << 8
                     | (long)var10[7] & 255L;
                  switch (var36) {
                     case 0:
                        var25[var10001] = var38;
                        if (var2 >= var5) {
                           e = var6;
                           g = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "\u009e\u00875øéÅP®%V-tÒn û";
                        var5 = "\u009e\u00875øéÅP®%V-tÒn û".length();
                        var2 = 0;
                  }

                  byte var29 = var2;
                  var2 += 8;
                  var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                  var25 = var6;
                  var10001 = var3++;
                  var33 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  var36 = 0;
               }
            }
         }

         var16 = var17.charAt(var15);
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7541;
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
            throw new RuntimeException("com/zelix/ah", var10);
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
         throw new RuntimeException("com/zelix/ah" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24273;
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
            throw new RuntimeException("com/zelix/ah", var14);
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
         throw new RuntimeException("com/zelix/ah" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
