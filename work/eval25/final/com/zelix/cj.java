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

public class cj extends jf {
   private static final long a = ess.a(-1103759570482238910L, 4728987258881899989L, MethodHandles.lookup().lookupClass()).a(7194088214056L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   public cj(long var1, int var3, int var4) {
      long var5 = (var1 << 32 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 17470345969951L;
      super(var7, var3);
   }

   public String K(Object[] param1) {
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
      // 00c: getstatic com/zelix/cj.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 15743736633887
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 129090372118843
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: ldc2_w 3266300331624369386
      // 025: lload 2
      // 026: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: new java/lang/StringBuilder
      // 02e: dup
      // 02f: invokespecial java/lang/StringBuilder.<init> ()V
      // 032: astore 9
      // 034: aload 0
      // 035: lload 6
      // 037: bipush 1
      // 038: anewarray 146
      // 03b: dup_x2
      // 03c: dup_x2
      // 03d: pop
      // 03e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 041: bipush 0
      // 042: swap
      // 043: aastore
      // 044: ldc2_w 3498056467116762337
      // 047: lload 2
      // 048: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: istore 10
      // 04f: astore 8
      // 051: bipush 0
      // 052: istore 11
      // 054: iload 11
      // 056: iload 10
      // 058: if_icmpge 0e7
      // 05b: aload 0
      // 05c: iload 11
      // 05e: invokevirtual com/zelix/cj.e (I)Lcom/zelix/_za;
      // 061: checkcast com/zelix/_ui
      // 064: astore 12
      // 066: lload 2
      // 067: lconst_0
      // 068: lcmp
      // 069: iflt 091
      // 06c: aload 9
      // 06e: aload 12
      // 070: lload 4
      // 072: bipush 1
      // 073: anewarray 146
      // 076: dup_x2
      // 077: dup_x2
      // 078: pop
      // 079: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07c: bipush 0
      // 07d: swap
      // 07e: aastore
      // 07f: ldc2_w 3024320722888111917
      // 082: lload 2
      // 083: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08b: aload 8
      // 08d: ifnonnull 113
      // 090: pop
      // 091: aload 8
      // 093: lload 2
      // 094: lconst_0
      // 095: lcmp
      // 096: ifle 0e4
      // 099: ifnonnull 0e2
      // 09c: goto 0a9
      // 09f: ldc2_w 3500139637467022985
      // 0a2: lload 2
      // 0a3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: iload 11
      // 0ab: iload 10
      // 0ad: bipush 1
      // 0ae: isub
      // 0af: if_icmpge 0df
      // 0b2: goto 0bf
      // 0b5: ldc2_w 3500139637467022985
      // 0b8: lload 2
      // 0b9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: aload 9
      // 0c1: sipush 24244
      // 0c4: ldc2_w 1108802234166160168
      // 0c7: lload 2
      // 0c8: lxor
      // 0c9: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/cj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d1: pop
      // 0d2: goto 0df
      // 0d5: ldc2_w 3500139637467022985
      // 0d8: lload 2
      // 0d9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: iinc 11 1
      // 0e2: aload 8
      // 0e4: ifnull 054
      // 0e7: new java/lang/StringBuilder
      // 0ea: dup
      // 0eb: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ee: sipush 15691
      // 0f1: ldc2_w 2221030897895262422
      // 0f4: lload 2
      // 0f5: lxor
      // 0f6: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/cj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: aload 9
      // 100: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 103: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 106: lload 2
      // 107: lconst_0
      // 108: lcmp
      // 109: ifle 113
      // 10c: getstatic com/zelix/cj.e J
      // 10f: l2i
      // 110: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 113: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 116: areturn
   }

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var4 = (_ur)var1[2];
      long var6 = var2 ^ 0L;
      long var8 = var2 ^ 134528422017690L;
      int var10 = x44.a<"i">(this, new Object[]{var8}, 7145691849331111744L, var2);

      try {
         if (var10 > 0) {
            x44.a<"i">(this.e(0), new Object[]{var6, this, var4}, 8818198965911889370L, var2);
         }
      } catch (gj var12) {
         throw x44.a<"q">(var12, 7148322319947322664L, var2);
      }

      za var11 = (za)var5;
      x44.a<"i">(var11, new Object[]{this}, 8859340252156374579L, var2);
   }

   public final boolean T(Object[] var1) {
      long var2 = (Long)var1[0];
      hz var5 = (hz)var1[1];
      we var4 = (we)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 59088077500703L;
      long var8 = var2 ^ 91674823474740L;
      int[] var10 = x44.a<"w">(-5018385679814911003L, var2);

      label27: {
         try {
            int var10000 = x44.a<"o">(this, new Object[]{var8}, -6375775621476305938L, var2);
            if (var10 != null) {
               return (boolean)var10000;
            }

            if (var10000 > 0) {
               break label27;
            }
         } catch (gj var13) {
            throw x44.a<"w">(var13, -6368696270140010106L, var2);
         }

         return (boolean)1;
      }

      cw var11 = (cw)this.e(0);
      return x44.a<"o">(var11, new Object[]{var6, var5, var4}, -5151574099829995980L, var2);
   }

   static {
      long var5 = a ^ 128964940371625L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "¶\u0012Ûnõ\u000b\u0002k\u008f\u0093\u0085\u0097³¤\u0098\u0093\u0018NÍ\u000f\n\u009a\u0083\u0081\u0086$ó:ª>\u0014\u001f\u0012\u0002á\u0087â¸Ì<~";
      int var13 = "¶\u0012Ûnõ\u000b\u0002k\u008f\u0093\u0085\u0097³¤\u0098\u0093\u0018NÍ\u000f\n\u009a\u0083\u0081\u0086$ó:ª>\u0014\u001f\u0012\u0002á\u0087â¸Ì<~"
         .length();
      char var10 = 16;
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var20 = b(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var20;
         if ((var9 += var10) >= var13) {
            b = var14;
            c = new String[2];
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -6408232631392317960L;
            byte[] var4 = var0.doFinal(
               new byte[]{
                  (byte)((int)(var2 >>> 56)),
                  (byte)((int)(var2 >>> 48)),
                  (byte)((int)(var2 >>> 40)),
                  (byte)((int)(var2 >>> 32)),
                  (byte)((int)(var2 >>> 24)),
                  (byte)((int)(var2 >>> 16)),
                  (byte)((int)(var2 >>> 8)),
                  (byte)((int)var2)
               }
            );
            long var23 = ((long)var4[0] & 255L) << 56
               | ((long)var4[1] & 255L) << 48
               | ((long)var4[2] & 255L) << 40
               | ((long)var4[3] & 255L) << 32
               | ((long)var4[4] & 255L) << 24
               | ((long)var4[5] & 255L) << 16
               | ((long)var4[6] & 255L) << 8
               | (long)var4[7] & 255L;
            var10001 = -1;
            e = var23;
            return;
         }

         var10 = var11.charAt(var9);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20759;
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
            throw new RuntimeException("com/zelix/cj", var10);
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
         c[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/cj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
