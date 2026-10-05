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

public abstract class fy extends jf {
   private static final long a = ess.a(-5411066163560111892L, -5875104949086989840L, MethodHandles.lookup().lookupClass()).a(45579697715680L);
   private static final String d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var4 = (_ur)var1[2];
      long var6 = var2 ^ 0L;
      long var8 = var2 ^ 134528422017690L;
      int[] var10000 = x44.a<"q">(9148277501292601163L, var2);
      int var11 = x44.a<"i">(this, new Object[]{var8}, 7145691849331111744L, var2);
      int[] var10 = var10000;
      int var12 = 0;

      while (var12 < var11) {
         _za var13 = this.e(var12);
         x44.a<"i">(var13, new Object[]{var6, this, var4}, 8818198965911889370L, var2);
         var12++;
         if (var10 != null) {
            break;
         }
      }
   }

   public String o(Object[] param1) {
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
      // 00b: pop
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 0
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: new java/lang/StringBuffer
      // 018: dup
      // 019: invokespecial java/lang/StringBuffer.<init> ()V
      // 01c: astore 7
      // 01e: ldc2_w 8596022076981270261
      // 021: lload 2
      // 022: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 0
      // 028: getfield com/zelix/fy.O [Lcom/zelix/_za;
      // 02b: arraylength
      // 02c: istore 8
      // 02e: astore 6
      // 030: iload 8
      // 032: aload 6
      // 034: ifnonnull 06f
      // 037: bipush 1
      // 038: if_icmple 06e
      // 03b: goto 048
      // 03e: ldc2_w 7870829874487185170
      // 041: lload 2
      // 042: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: athrow
      // 048: aload 7
      // 04a: sipush 18491
      // 04d: ldc2_w 8013913599566684557
      // 050: lload 2
      // 051: lxor
      // 052: invokedynamic h (IJ)I bsm=com/zelix/fy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: ldc2_w 8282291127836383600
      // 05a: lload 2
      // 05b: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: pop
      // 061: goto 06e
      // 064: ldc2_w 7870829874487185170
      // 067: lload 2
      // 068: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: athrow
      // 06e: bipush 0
      // 06f: istore 9
      // 071: iload 9
      // 073: iload 8
      // 075: if_icmpge 0fb
      // 078: aload 0
      // 079: getfield com/zelix/fy.O [Lcom/zelix/_za;
      // 07c: iload 9
      // 07e: aaload
      // 07f: checkcast com/zelix/_ui
      // 082: astore 10
      // 084: aload 7
      // 086: aload 10
      // 088: lload 4
      // 08a: bipush 1
      // 08b: anewarray 248
      // 08e: dup_x2
      // 08f: dup_x2
      // 090: pop
      // 091: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: ldc2_w 8351791356079598898
      // 09a: lload 2
      // 09b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0a3: pop
      // 0a4: aload 6
      // 0a6: lload 2
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: ifle 0f8
      // 0ac: ifnonnull 0f6
      // 0af: iload 9
      // 0b1: iload 8
      // 0b3: bipush 1
      // 0b4: isub
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: ifle 104
      // 0bb: aload 6
      // 0bd: ifnonnull 104
      // 0c0: goto 0cd
      // 0c3: ldc2_w 7870829874487185170
      // 0c6: lload 2
      // 0c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: if_icmpge 0f3
      // 0d0: goto 0dd
      // 0d3: ldc2_w 7870829874487185170
      // 0d6: lload 2
      // 0d7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: aload 7
      // 0df: getstatic com/zelix/fy.d Ljava/lang/String;
      // 0e2: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0e5: pop
      // 0e6: goto 0f3
      // 0e9: ldc2_w 7870829874487185170
      // 0ec: lload 2
      // 0ed: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: iinc 9 1
      // 0f6: aload 6
      // 0f8: ifnull 071
      // 0fb: lload 2
      // 0fc: lconst_0
      // 0fd: lcmp
      // 0fe: ifle 12d
      // 101: iload 8
      // 103: bipush 1
      // 104: if_icmple 12d
      // 107: aload 7
      // 109: sipush 25718
      // 10c: ldc2_w 4145349691423428033
      // 10f: lload 2
      // 110: lxor
      // 111: invokedynamic h (IJ)I bsm=com/zelix/fy.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: ldc2_w 8282291127836383600
      // 119: lload 2
      // 11a: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: pop
      // 120: goto 12d
      // 123: ldc2_w 7870829874487185170
      // 126: lload 2
      // 127: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: athrow
      // 12d: aload 7
      // 12f: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 132: areturn
   }

   public fy(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 95731339073926L;
      super(var4, var3);
   }

   static {
      long var11 = a ^ 11844873334931L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("JfRpöýIË".getBytes("ISO-8859-1"));
      String var19 = b(var15).intern();
      int var10001 = -1;
      d = var19;
      g = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0013C½¯K@\u0011\u0000\"H~ùÑWâ ";
      int var5 = "\u0013C½¯K@\u0011\u0000\"H~ùÑWâ ".length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var8 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
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
         long var10004 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         byte var22 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      e = var6;
      f = new Integer[2];
   }

   private static gj b(gj var0) {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5923;
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
            throw new RuntimeException("com/zelix/fy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/fy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
