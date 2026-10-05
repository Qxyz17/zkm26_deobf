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

public class _g1 extends _n7 {
   private static final long a = ess.a(6494895017386364547L, -5007468791580991576L, MethodHandles.lookup().lookupClass()).a(227864947611726L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"v">(14018, 3748842125223088600L ^ var2);
   }

   public _g1(int var1, long var2, int var4) {
      long var5 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 32783296025725L;
      super(var7, var4);
   }

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
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 6
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 3
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 2
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast java/lang/Integer
      // 02e: invokevirtual java/lang/Integer.intValue ()I
      // 031: istore 5
      // 033: pop
      // 034: lload 3
      // 035: dup2
      // 036: ldc2_w 38822886945588
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 130298468579397
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 92599993247389
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 49257372311205
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 93901855267089
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 67332044126386
      // 05c: lxor
      // 05d: lstore 18
      // 05f: dup2
      // 060: ldc2_w 98840750245944
      // 063: lxor
      // 064: lstore 20
      // 066: dup2
      // 067: ldc2_w 79526024160732
      // 06a: lxor
      // 06b: lstore 22
      // 06d: pop2
      // 06e: aload 0
      // 06f: lload 12
      // 071: bipush 1
      // 072: anewarray 30
      // 075: dup_x2
      // 076: dup_x2
      // 077: pop
      // 078: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: ldc2_w 1707270652021957629
      // 081: lload 3
      // 082: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: istore 25
      // 089: ldc2_w 1096596874045400213
      // 08c: lload 3
      // 08d: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: bipush 0
      // 093: istore 26
      // 095: istore 24
      // 097: iload 26
      // 099: iload 25
      // 09b: if_icmpge 1d4
      // 09e: aload 0
      // 09f: iload 26
      // 0a1: lload 20
      // 0a3: bipush 2
      // 0a4: anewarray 30
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 1
      // 0ae: swap
      // 0af: aastore
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w 899743315497312719
      // 0bb: lload 3
      // 0bc: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: checkcast com/zelix/_q2
      // 0c4: astore 27
      // 0c6: aload 27
      // 0c8: lload 18
      // 0ca: bipush 1
      // 0cb: anewarray 30
      // 0ce: dup_x2
      // 0cf: dup_x2
      // 0d0: pop
      // 0d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d4: bipush 0
      // 0d5: swap
      // 0d6: aastore
      // 0d7: ldc2_w 1311276545112853833
      // 0da: lload 3
      // 0db: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: astore 28
      // 0e2: aload 7
      // 0e4: lload 8
      // 0e6: aload 28
      // 0e8: bipush 2
      // 0e9: anewarray 30
      // 0ec: dup_x1
      // 0ed: swap
      // 0ee: bipush 1
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x2
      // 0f2: dup_x2
      // 0f3: pop
      // 0f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f7: bipush 0
      // 0f8: swap
      // 0f9: aastore
      // 0fa: ldc2_w 1236348258429302200
      // 0fd: lload 3
      // 0fe: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: iload 24
      // 105: lload 3
      // 106: lconst_0
      // 107: lcmp
      // 108: ifle 1d1
      // 10b: ifeq 1cf
      // 10e: aload 27
      // 110: lload 16
      // 112: bipush 1
      // 113: anewarray 30
      // 116: dup_x2
      // 117: dup_x2
      // 118: pop
      // 119: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w 1186930777711585210
      // 122: lload 3
      // 123: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: ifeq 1cc
      // 12b: goto 138
      // 12e: ldc2_w 739173083757000972
      // 131: lload 3
      // 132: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: aload 7
      // 13a: new java/lang/StringBuilder
      // 13d: dup
      // 13e: invokespecial java/lang/StringBuilder.<init> ()V
      // 141: sipush 27801
      // 144: ldc2_w 7374114258567517476
      // 147: lload 3
      // 148: lxor
      // 149: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/_g1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 151: aload 0
      // 152: lload 14
      // 154: bipush 1
      // 155: anewarray 30
      // 158: dup_x2
      // 159: dup_x2
      // 15a: pop
      // 15b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15e: bipush 0
      // 15f: swap
      // 160: aastore
      // 161: ldc2_w 1038796215110839281
      // 164: lload 3
      // 165: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16d: sipush 10880
      // 170: ldc2_w 3566204663509160766
      // 173: lload 3
      // 174: lxor
      // 175: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/_g1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17d: aload 27
      // 17f: lload 22
      // 181: bipush 1
      // 182: anewarray 30
      // 185: dup_x2
      // 186: dup_x2
      // 187: pop
      // 188: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18b: bipush 0
      // 18c: swap
      // 18d: aastore
      // 18e: ldc2_w 949434765690539629
      // 191: lload 3
      // 192: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: ldc "'"
      // 19c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1a2: lload 10
      // 1a4: bipush 2
      // 1a5: anewarray 30
      // 1a8: dup_x2
      // 1a9: dup_x2
      // 1aa: pop
      // 1ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ae: bipush 1
      // 1af: swap
      // 1b0: aastore
      // 1b1: dup_x1
      // 1b2: swap
      // 1b3: bipush 0
      // 1b4: swap
      // 1b5: aastore
      // 1b6: ldc2_w 1259892150344068944
      // 1b9: lload 3
      // 1ba: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: goto 1cc
      // 1c2: ldc2_w 739173083757000972
      // 1c5: lload 3
      // 1c6: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: iinc 26 1
      // 1cf: iload 24
      // 1d1: ifne 097
      // 1d4: return
   }

   static {
      long var0 = a ^ 47219809279461L;
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
      String var6 = "¹ÂØ oè\u0019AÇGÝ\u0000[\u008a\"vØ[§ß\u0098¥è_±6Þ\u0080Ó\u008bt×\u0018>\u0017ýJÕ\u0007áöí\u0092\u0014Ý§\u008d\u0099]ÉýRRGªZ\u0010@ïrªê\u0001tº°Ëw«-É}+£òY/\u0000\bñ;\te\u0015kâL\u0093\nIX7û\u0002À¶\u0018Ë·%%#\"Ó6ï\tË¾\u0018Q_L#wà¶Ü\u0084\r\nÕ";
      int var8 = "¹ÂØ oè\u0019AÇGÝ\u0000[\u008a\"vØ[§ß\u0098¥è_±6Þ\u0080Ó\u008bt×\u0018>\u0017ýJÕ\u0007áöí\u0092\u0014Ý§\u008d\u0099]ÉýRRGªZ\u0010@ïrªê\u0001tº°Ëw«-É}+£òY/\u0000\bñ;\te\u0015kâL\u0093\nIX7û\u0002À¶\u0018Ë·%%#\"Ó6ï\tË¾\u0018Q_L#wà¶Ü\u0084\r\nÕ"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9625;
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
            throw new RuntimeException("com/zelix/_g1", var10);
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
         throw new RuntimeException("com/zelix/_g1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
