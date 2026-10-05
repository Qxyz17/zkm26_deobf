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

public class lkz extends Thread {
   PrintWriter o;
   InputStream y;
   String m;
   boolean w;
   private static final long a = prr.a(1572106303626137798L, -8912401573867359353L, MethodHandles.lookup().lookupClass()).a(5563241064497L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   @Override
   public void run() {
      long var1 = a ^ 87062944429268L;
      int var10000 = m44.a<"j">(4036614777737243452L, var1);
      boolean var4 = false;
      int var3 = var10000;

      try {
         InputStreamReader var5 = new InputStreamReader(m44.a<"t">(this, 2666915686674632192L, var1));
         BufferedReader var6 = new BufferedReader(var5);
         Object var7 = null;

         while ((var7 = var6.readLine()) != null) {
            var4 = true;

            try {
               m44.a<"t">(this, 4437080792513592174L, var1).println(m44.a<"t">(this, 2433925250575744983L, var1) + var7);
               if (var3 != 0 || var3 != 0) {
                  break;
               }
            } catch (IOException var9) {
               throw m44.a<"j">(var9, 2869131951278792021L, var1);
            }
         }
      } catch (IOException var10) {
         m44.a<"u">(var10, 4580391487968860217L, var1);
      }

      try {
         if (var4) {
            m44.a<"u">(
               m44.a<"n">(2393456083492411413L, var1),
               m44.a<"t">(this, 2433925250575744983L, var1) + a<"f">(9134, 3765661629431846751L ^ var1),
               4199650640994836573L,
               var1
            );
         }
      } catch (IOException var8) {
         throw m44.a<"j">(var8, 2869131951278792021L, var1);
      }
   }

   lkz(InputStream param1, PrintWriter param2, int param3, boolean param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/lkz.a J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 84224458778303
      // 00e: lxor
      // 00f: lstore 7
      // 011: pop2
      // 012: ldc2_w 2302327356307000523
      // 015: lload 5
      // 017: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01c: aload 0
      // 01d: invokespecial java/lang/Thread.<init> ()V
      // 020: istore 9
      // 022: aload 0
      // 023: aload 1
      // 024: ldc2_w 213257870511286775
      // 027: lload 5
      // 029: invokedynamic q (Ljava/lang/Object;Ljava/io/InputStream;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: aload 0
      // 02f: iload 9
      // 031: ifne 0e7
      // 034: aload 2
      // 035: ldc2_w 1901856257098259609
      // 038: lload 5
      // 03a: invokedynamic q (Ljava/lang/Object;Ljava/io/PrintWriter;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: iload 4
      // 041: ifeq 0d8
      // 044: goto 052
      // 047: ldc2_w 10793932878985890
      // 04a: lload 5
      // 04c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 051: athrow
      // 052: aload 0
      // 053: sipush 16235
      // 056: ldc2_w 5391181998448356460
      // 059: lload 5
      // 05b: lxor
      // 05c: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/lkz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: sipush 18596
      // 064: ldc2_w 3523224952392320087
      // 067: lload 5
      // 069: lxor
      // 06a: invokedynamic l (IJ)I bsm=com/zelix/lkz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: iload 3
      // 070: lload 7
      // 072: sipush 32435
      // 075: ldc2_w 2292279535099064897
      // 078: lload 5
      // 07a: lxor
      // 07b: invokedynamic l (IJ)I bsm=com/zelix/lkz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: bipush 5
      // 081: anewarray 67
      // 084: dup_x1
      // 085: swap
      // 086: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 089: bipush 4
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x2
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092: bipush 3
      // 093: swap
      // 094: aastore
      // 095: dup_x1
      // 096: swap
      // 097: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09a: bipush 2
      // 09b: swap
      // 09c: aastore
      // 09d: dup_x1
      // 09e: swap
      // 09f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a2: bipush 1
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: bipush 0
      // 0a8: swap
      // 0a9: aastore
      // 0aa: ldc2_w 423575150674256936
      // 0ad: lload 5
      // 0af: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: ldc2_w 445969982529116192
      // 0b7: lload 5
      // 0b9: invokedynamic q (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: lload 5
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: iflt 153
      // 0c5: iload 9
      // 0c7: ifeq 146
      // 0ca: goto 0d8
      // 0cd: ldc2_w 10793932878985890
      // 0d0: lload 5
      // 0d2: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: goto 0e7
      // 0dc: ldc2_w 10793932878985890
      // 0df: lload 5
      // 0e1: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e6: athrow
      // 0e7: ldc ""
      // 0e9: sipush 29714
      // 0ec: ldc2_w 8735425456806279395
      // 0ef: lload 5
      // 0f1: lxor
      // 0f2: invokedynamic l (IJ)I bsm=com/zelix/lkz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: iload 3
      // 0f8: lload 7
      // 0fa: sipush 19827
      // 0fd: ldc2_w 3911848871020659075
      // 100: lload 5
      // 102: lxor
      // 103: invokedynamic l (IJ)I bsm=com/zelix/lkz.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: bipush 5
      // 109: anewarray 67
      // 10c: dup_x1
      // 10d: swap
      // 10e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 111: bipush 4
      // 112: swap
      // 113: aastore
      // 114: dup_x2
      // 115: dup_x2
      // 116: pop
      // 117: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11a: bipush 3
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x1
      // 11e: swap
      // 11f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 122: bipush 2
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12a: bipush 1
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x1
      // 12e: swap
      // 12f: bipush 0
      // 130: swap
      // 131: aastore
      // 132: ldc2_w 423575150674256936
      // 135: lload 5
      // 137: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: ldc2_w 445969982529116192
      // 13f: lload 5
      // 141: invokedynamic q (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: aload 0
      // 147: iload 4
      // 149: ldc2_w 466753396031422617
      // 14c: lload 5
      // 14e: invokedynamic q (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: return
   }

   static {
      long var11 = a ^ 83720979739673L;
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
      String var17 = "ÿ\u000e\u001f\\\u0093o5\u007f;9¹âª\u0012\u0017°\u00165 ¤²@{³¯\u000f/\u0094\u0002ofóS\u009bDª &\u0085²2V®\t\u001bº`ËU¹ðíù1 èÆ6\u009d´x1_æ\u0010ÔFÖvBÁÐ=!\u0015î¡\u001b1\u0011W";
      int var19 = "ÿ\u000e\u001f\\\u0093o5\u007f;9¹âª\u0012\u0017°\u00165 ¤²@{³¯\u000f/\u0094\u0002ofóS\u009bDª &\u0085²2V®\t\u001bº`ËU¹ðíù1 èÆ6\u009d´x1_æ\u0010ÔFÖvBÁÐ=!\u0015î¡\u001b1\u0011W"
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
            g = new HashMap(13);
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
            String var4 = "\u00adG\u009a+\u009d6x\u0088\u0014\u008bze©\u0091ïQ";
            int var5 = "\u00adG\u009a+\u009d6x\u0088\u0014\u008bze©\u0091ïQ".length();
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
                           f = new Integer[4];
                           return;
                        }
                        break;
                     default:
                        var25[var10001] = var38;
                        if (var2 < var5) {
                           continue label32;
                        }

                        var4 = "Ã\u0095?öÇ\u0000eâ«srÇ\u008bÂµ¿";
                        var5 = "Ã\u0095?öÇ\u0000eâ«srÇ\u008bÂµ¿".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6188;
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
            throw new RuntimeException("com/zelix/lkz", var10);
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
         throw new RuntimeException("com/zelix/lkz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18392;
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
            throw new RuntimeException("com/zelix/lkz", var14);
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
         throw new RuntimeException("com/zelix/lkz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
