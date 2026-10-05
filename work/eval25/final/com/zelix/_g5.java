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

public class _g5 extends _n7 {
   private static final long a = ess.a(3115223878966274660L, -2525278213628409308L, MethodHandles.lookup().lookupClass()).a(38202131403244L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public _g5(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 41777051669010L;
      super(var4, var3);
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b<"c">(5145, 4750785333904822722L ^ var2);
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
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Integer
      // 00e: invokevirtual java/lang/Integer.intValue ()I
      // 011: istore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Long
      // 019: invokevirtual java/lang/Long.longValue ()J
      // 01c: lstore 6
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 5
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 3
      // 033: pop
      // 034: lload 6
      // 036: dup2
      // 037: ldc2_w 120310072279596
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 87150032787893
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 92599993247389
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 49257372311205
      // 04f: lxor
      // 050: lstore 14
      // 052: dup2
      // 053: ldc2_w 98840750245944
      // 056: lxor
      // 057: lstore 16
      // 059: pop2
      // 05a: ldc2_w 1031773425375417457
      // 05d: lload 6
      // 05f: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: istore 18
      // 066: aload 2
      // 067: new java/lang/StringBuilder
      // 06a: dup
      // 06b: invokespecial java/lang/StringBuilder.<init> ()V
      // 06e: sipush 15602
      // 071: ldc2_w 1050357456020285325
      // 074: lload 6
      // 076: lxor
      // 077: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/_g5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07f: aload 0
      // 080: lload 14
      // 082: bipush 1
      // 083: anewarray 195
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 0
      // 08d: swap
      // 08e: aastore
      // 08f: ldc2_w 1562820739292528803
      // 092: lload 6
      // 094: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09c: sipush 12447
      // 09f: ldc2_w 3501878732242398179
      // 0a2: lload 6
      // 0a4: lxor
      // 0a5: invokedynamic c (IJ)Ljava/lang/String; bsm=com/zelix/_g5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ad: aload 0
      // 0ae: iload 18
      // 0b0: ifne 10e
      // 0b3: lload 12
      // 0b5: bipush 1
      // 0b6: anewarray 195
      // 0b9: dup_x2
      // 0ba: dup_x2
      // 0bb: pop
      // 0bc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bf: bipush 0
      // 0c0: swap
      // 0c1: aastore
      // 0c2: ldc2_w 1707270652021957629
      // 0c5: lload 6
      // 0c7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: ifle 12d
      // 0cf: goto 0dd
      // 0d2: ldc2_w 1371299809719213350
      // 0d5: lload 6
      // 0d7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: bipush 0
      // 0df: lload 16
      // 0e1: bipush 2
      // 0e2: anewarray 195
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 1
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: ldc2_w 899743315497312719
      // 0f9: lload 6
      // 0fb: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: goto 10e
      // 103: ldc2_w 1371299809719213350
      // 106: lload 6
      // 108: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: checkcast com/zelix/_xo
      // 111: lload 8
      // 113: bipush 1
      // 114: anewarray 195
      // 117: dup_x2
      // 118: dup_x2
      // 119: pop
      // 11a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11d: bipush 0
      // 11e: swap
      // 11f: aastore
      // 120: ldc2_w 1671863393502507731
      // 123: lload 6
      // 125: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: goto 12f
      // 12d: ldc ""
      // 12f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 132: ldc "'"
      // 134: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 137: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13a: lload 10
      // 13c: dup2_x1
      // 13d: pop2
      // 13e: bipush 2
      // 13f: anewarray 195
      // 142: dup_x1
      // 143: swap
      // 144: bipush 1
      // 145: swap
      // 146: aastore
      // 147: dup_x2
      // 148: dup_x2
      // 149: pop
      // 14a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14d: bipush 0
      // 14e: swap
      // 14f: aastore
      // 150: ldc2_w 1222228506287060197
      // 153: lload 6
      // 155: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15a: return
   }

   static {
      long var0 = a ^ 126453015391086L;
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
      String var6 = "±úr[í¿\u0002bÔ\u0002`\u0087\u0094\u0092ÃÍ\u001a\u009f6í1\u001f\u0093?½rQ¬ÒYá\u0094(×eÓß¦b»cÆÄ\u008b,£~jD91¬õ\u008c+T\u000fx\u008bQÕFô\n!Ób×ÊO\u001cÊÔ@*\u0085«oÛÃ\u0004O\u009eq§\u0092x°\u0013\u009c\u001b\u009aìèA¿\u0096è\u00898ðui9¨Ê\u0012\u0007À=\u000eâhÜO´ÛNÞoíQÍá\u0097\u0090«\u0000F¥\u0002³\rp/\u008cã2";
      int var8 = "±úr[í¿\u0002bÔ\u0002`\u0087\u0094\u0092ÃÍ\u001a\u009f6í1\u001f\u0093?½rQ¬ÒYá\u0094(×eÓß¦b»cÆÄ\u008b,£~jD91¬õ\u008c+T\u000fx\u008bQÕFô\n!Ób×ÊO\u001cÊÔ@*\u0085«oÛÃ\u0004O\u009eq§\u0092x°\u0013\u009c\u001b\u009aìèA¿\u0096è\u00898ðui9¨Ê\u0012\u0007À=\u000eâhÜO´ÛNÞoíQÍá\u0097\u0090«\u0000F¥\u0002³\rp/\u008cã2"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1880;
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
            throw new RuntimeException("com/zelix/_g5", var10);
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
         throw new RuntimeException("com/zelix/_g5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
