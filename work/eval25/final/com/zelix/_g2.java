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

public class _g2 extends _n7 {
   private static final long a = ess.a(-2254424972027128613L, 2613550662976681549L, MethodHandles.lookup().lookupClass()).a(74545335025666L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   protected void G(Object[] param1) {
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
      // 004: checkcast com/zelix/_uu
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 7
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 4
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/lang/Integer
      // 025: invokevirtual java/lang/Integer.intValue ()I
      // 028: istore 3
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 2
      // 033: pop
      // 034: lload 4
      // 036: dup2
      // 037: ldc2_w 130298468579397
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 92599993247389
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 50275433787273
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 93901855267089
      // 04f: lxor
      // 050: lstore 14
      // 052: dup2
      // 053: ldc2_w 49257372311205
      // 056: lxor
      // 057: lstore 16
      // 059: dup2
      // 05a: ldc2_w 67332044126386
      // 05d: lxor
      // 05e: lstore 18
      // 060: dup2
      // 061: ldc2_w 98840750245944
      // 064: lxor
      // 065: lstore 20
      // 067: dup2
      // 068: ldc2_w 79526024160732
      // 06b: lxor
      // 06c: lstore 22
      // 06e: pop2
      // 06f: aload 0
      // 070: lload 10
      // 072: bipush 1
      // 073: anewarray 127
      // 076: dup_x2
      // 077: dup_x2
      // 078: pop
      // 079: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07c: bipush 0
      // 07d: swap
      // 07e: aastore
      // 07f: ldc2_w 1707270652021957629
      // 082: lload 4
      // 084: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: istore 25
      // 08b: ldc2_w 1031773425375417457
      // 08e: lload 4
      // 090: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: bipush 0
      // 096: istore 26
      // 098: istore 24
      // 09a: iload 26
      // 09c: iload 25
      // 09e: if_icmpge 1e3
      // 0a1: aload 0
      // 0a2: iload 26
      // 0a4: lload 20
      // 0a6: bipush 2
      // 0a7: anewarray 127
      // 0aa: dup_x2
      // 0ab: dup_x2
      // 0ac: pop
      // 0ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w 899743315497312719
      // 0be: lload 4
      // 0c0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: checkcast com/zelix/_q2
      // 0c8: astore 27
      // 0ca: aload 27
      // 0cc: lload 18
      // 0ce: bipush 1
      // 0cf: anewarray 127
      // 0d2: dup_x2
      // 0d3: dup_x2
      // 0d4: pop
      // 0d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d8: bipush 0
      // 0d9: swap
      // 0da: aastore
      // 0db: ldc2_w 1311276545112853833
      // 0de: lload 4
      // 0e0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: astore 28
      // 0e7: aload 6
      // 0e9: lload 12
      // 0eb: aload 28
      // 0ed: bipush 2
      // 0ee: anewarray 127
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: bipush 1
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x2
      // 0f7: dup_x2
      // 0f8: pop
      // 0f9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: ldc2_w 1656587931225374172
      // 102: lload 4
      // 104: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: iload 24
      // 10b: lload 4
      // 10d: lconst_0
      // 10e: lcmp
      // 10f: ifle 1e0
      // 112: ifne 1de
      // 115: aload 27
      // 117: lload 14
      // 119: bipush 1
      // 11a: anewarray 127
      // 11d: dup_x2
      // 11e: dup_x2
      // 11f: pop
      // 120: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 123: bipush 0
      // 124: swap
      // 125: aastore
      // 126: ldc2_w 1186930777711585210
      // 129: lload 4
      // 12b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: ifeq 1db
      // 133: goto 141
      // 136: ldc2_w 1051479719446752413
      // 139: lload 4
      // 13b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: aload 6
      // 143: new java/lang/StringBuilder
      // 146: dup
      // 147: invokespecial java/lang/StringBuilder.<init> ()V
      // 14a: sipush 2672
      // 14d: ldc2_w 4436061722524714440
      // 150: lload 4
      // 152: lxor
      // 153: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_g2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15b: aload 0
      // 15c: lload 16
      // 15e: bipush 1
      // 15f: anewarray 127
      // 162: dup_x2
      // 163: dup_x2
      // 164: pop
      // 165: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 168: bipush 0
      // 169: swap
      // 16a: aastore
      // 16b: ldc2_w 1185100367068778707
      // 16e: lload 4
      // 170: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 178: sipush 12162
      // 17b: ldc2_w 3614954566255091771
      // 17e: lload 4
      // 180: lxor
      // 181: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/_g2.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 189: aload 27
      // 18b: lload 22
      // 18d: bipush 1
      // 18e: anewarray 127
      // 191: dup_x2
      // 192: dup_x2
      // 193: pop
      // 194: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 197: bipush 0
      // 198: swap
      // 199: aastore
      // 19a: ldc2_w 949434765690539629
      // 19d: lload 4
      // 19f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a7: ldc "'"
      // 1a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1af: lload 8
      // 1b1: bipush 2
      // 1b2: anewarray 127
      // 1b5: dup_x2
      // 1b6: dup_x2
      // 1b7: pop
      // 1b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bb: bipush 1
      // 1bc: swap
      // 1bd: aastore
      // 1be: dup_x1
      // 1bf: swap
      // 1c0: bipush 0
      // 1c1: swap
      // 1c2: aastore
      // 1c3: ldc2_w 1259892150344068944
      // 1c6: lload 4
      // 1c8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: goto 1db
      // 1d0: ldc2_w 1051479719446752413
      // 1d3: lload 4
      // 1d5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: athrow
      // 1db: iinc 26 1
      // 1de: iload 24
      // 1e0: ifeq 09a
      // 1e3: return
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"h">(1234, 171712693067994572L ^ var2);
   }

   public _g2(long var1, short var3, int var4) {
      long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 129966804470651L;
      super(var7, var4);
   }

   static {
      long var0 = a ^ 49124181638675L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "úz<ô\u001bÀ\u00981§Ù\u00145ä©Ù¶\u009dë\u008cbtSyÙ\t\u0096\u0013\f\u009dùP\u0080@GïPáw÷~µ÷\u0080÷\u0088ªüÑf·\u009c\u001fGVnÈ\u0014·.Ëî³ÚÖÎQ\u0013UUgX.\n¹d×s¶¿ßÓ\u0002û\u0093¼\u0011)\u007fp\u0010¤uø\u0000kyh xw9\u009eWÓG¿|\u0098½ùÆøÁ\u0013Æv\u000f8Aþ`ÖÙ\u007fÿ\u0013Y[;Ò";
      int var8 = "úz<ô\u001bÀ\u00981§Ù\u00145ä©Ù¶\u009dë\u008cbtSyÙ\t\u0096\u0013\f\u009dùP\u0080@GïPáw÷~µ÷\u0080÷\u0088ªüÑf·\u009c\u001fGVnÈ\u0014·.Ëî³ÚÖÎQ\u0013UUgX.\n¹d×s¶¿ßÓ\u0002û\u0093¼\u0011)\u007fp\u0010¤uø\u0000kyh xw9\u009eWÓG¿|\u0098½ùÆøÁ\u0013Æv\u000f8Aþ`ÖÙ\u007fÿ\u0013Y[;Ò"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            d = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5023;
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
            throw new RuntimeException("com/zelix/_g2", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/_g2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
