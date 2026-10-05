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

public class _oi extends _og {
   int N;
   private static final long b = ess.a(-6583152319168809763L, 9208536680329070210L, MethodHandles.lookup().lookupClass()).a(145575344863224L);
   private static final long[] c;
   private static final Integer[] g;
   private static final Map k = new HashMap(13);

   public _kz M(_kz var1, long var2, boolean var4, boolean var5, _fm var6, String var7) {
      long var8 = var2 ^ 32610570959058L;
      long var10 = var2 ^ 118237195067467L;
      long var12 = var2 ^ 37585498234552L;
      n[] var14 = var1.m();
      n[] var15 = var1.r();
      int var16 = var14.length;
      n[] var17 = n.S(var16 + 1, var10);
      System.arraycopy(var14, 0, var17, 0, var16);
      var17[var16] = n.n;
      return new _kz(var17, var15, var12, var1.z(), var1.C(var8));
   }

   public int d(long var1) {
      return 2;
   }

   public final boolean c(char var1, short var2, int var3) {
      return false;
   }

   public boolean l(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public int v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"o">(this, 3949258817426632686L, var2);
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      super.W(var6, var2, var7);
      var2.writeByte(x44.a<"l">(this, 2937919325643157989L, var4));
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      StringBuilder var6 = new StringBuilder();
      var6.append(x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2));
      var6.append((char)b<"f">(987, 2008632361725835307L ^ var2));
      var6.append(x44.a<"n">(this, 749822421846332231L, var2));
      return var6.toString();
   }

   public final boolean N(int var1, int var2, long var3) {
      return false;
   }

   public _oi(long var1, int var3) {
      var1 = b ^ var1;
      super(b<"f">(9557, 7151096528203876328L ^ var1));
      x44.a<"v">(this, var3, -7842844161963292152L, var1);
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
      // 01e: ldc2_w 103167525420822
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 43317403178689
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 72462291038852
      // 02f: lxor
      // 030: lstore 10
      // 032: pop2
      // 033: new java/lang/StringBuilder
      // 036: dup
      // 037: sipush 15606
      // 03a: ldc2_w 1309003927653054483
      // 03d: lload 2
      // 03e: lxor
      // 03f: invokedynamic f (IJ)I bsm=com/zelix/_oi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: invokespecial java/lang/StringBuilder.<init> (I)V
      // 047: astore 13
      // 049: aload 13
      // 04b: aload 0
      // 04c: lload 6
      // 04e: bipush 1
      // 04f: anewarray 341
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 0
      // 059: swap
      // 05a: aastore
      // 05b: ldc2_w 8442770252852520860
      // 05e: lload 2
      // 05f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 067: pop
      // 068: ldc2_w 8216154267410362304
      // 06b: lload 2
      // 06c: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: aload 0
      // 072: getfield com/zelix/_oi.a I
      // 075: lload 10
      // 077: dup2_x1
      // 078: pop2
      // 079: bipush 2
      // 07a: anewarray 341
      // 07d: dup_x1
      // 07e: swap
      // 07f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 082: bipush 1
      // 083: swap
      // 084: aastore
      // 085: dup_x2
      // 086: dup_x2
      // 087: pop
      // 088: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08b: bipush 0
      // 08c: swap
      // 08d: aastore
      // 08e: ldc2_w 8570484206580877217
      // 091: lload 2
      // 092: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: astore 14
      // 099: astore 12
      // 09b: aload 14
      // 09d: aload 0
      // 09e: ldc2_w 8462750034368293969
      // 0a1: lload 2
      // 0a2: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: ldc2_w 8463256255195338727
      // 0aa: lload 2
      // 0ab: invokedynamic t (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: lload 8
      // 0b2: dup2_x1
      // 0b3: pop2
      // 0b4: bipush 3
      // 0b5: anewarray 341
      // 0b8: dup_x1
      // 0b9: swap
      // 0ba: bipush 2
      // 0bb: swap
      // 0bc: aastore
      // 0bd: dup_x2
      // 0be: dup_x2
      // 0bf: pop
      // 0c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c3: bipush 1
      // 0c4: swap
      // 0c5: aastore
      // 0c6: dup_x1
      // 0c7: swap
      // 0c8: bipush 0
      // 0c9: swap
      // 0ca: aastore
      // 0cb: ldc2_w 7799761149368071863
      // 0ce: lload 2
      // 0cf: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: astore 14
      // 0d6: aload 12
      // 0d8: ifnonnull 13b
      // 0db: aload 14
      // 0dd: invokevirtual java/lang/String.length ()I
      // 0e0: ifle 117
      // 0e3: goto 0f0
      // 0e6: ldc2_w 7768875299083107943
      // 0e9: lload 2
      // 0ea: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: aload 13
      // 0f2: new java/lang/StringBuilder
      // 0f5: dup
      // 0f6: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f9: ldc "\t"
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: aload 14
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 106: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 109: pop
      // 10a: goto 117
      // 10d: ldc2_w 7768875299083107943
      // 110: lload 2
      // 111: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 5
      // 119: new java/lang/StringBuilder
      // 11c: dup
      // 11d: invokespecial java/lang/StringBuilder.<init> ()V
      // 120: aload 4
      // 122: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 125: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 128: aload 4
      // 12a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 130: aload 13
      // 132: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 135: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 138: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 13b: return
   }

   public final boolean I(long var1) {
      return true;
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   _oi(_xx var1, long var2) {
      var2 = b ^ var2;
      super(b<"f">(8249, 1937209506101794066L ^ var2));
      x44.a<"s">(this, x44.a<"h">(var1, -7299925892002837037L, var2), -8881791898142007907L, var2);
   }

   public final boolean Y(Object[] var1) {
      int var6 = (Integer)var1[0];
      n var5 = (n)var1[1];
      int var4 = (Integer)var1[2];
      long var2 = (Long)var1[3];
      return false;
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   static {
      long var0 = b ^ 70726865771472L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[4];
      int var5 = 0;
      String var6 = "ï\u009f;î3&\u0089\u0098ÈOê;5½Ze";
      int var7 = "ï\u009f;î3&\u0089\u0098ÈOê;5½Ze".length();
      byte var4 = 0;

      label23:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var14 = var8;
         var10001 = var5++;
         long var17 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var19 = -1;

         while (true) {
            long var10 = var17;
            byte[] var12 = var2.doFinal(
               new byte[]{
                  (byte)((int)(var10 >>> 56)),
                  (byte)((int)(var10 >>> 48)),
                  (byte)((int)(var10 >>> 40)),
                  (byte)((int)(var10 >>> 32)),
                  (byte)((int)(var10 >>> 24)),
                  (byte)((int)(var10 >>> 16)),
                  (byte)((int)(var10 >>> 8)),
                  (byte)((int)var10)
               }
            );
            long var21 = ((long)var12[0] & 255L) << 56
               | ((long)var12[1] & 255L) << 48
               | ((long)var12[2] & 255L) << 40
               | ((long)var12[3] & 255L) << 32
               | ((long)var12[4] & 255L) << 24
               | ((long)var12[5] & 255L) << 16
               | ((long)var12[6] & 255L) << 8
               | (long)var12[7] & 255L;
            switch (var19) {
               case 0:
                  var14[var10001] = var21;
                  if (var4 >= var7) {
                     c = var8;
                     g = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "¶\u001a10©ÆùÇmZÔÊP³\u0099\u0010";
                  var7 = "¶\u001a10©ÆùÇmZÔÊP³\u0099\u0010".length();
                  var4 = 0;
            }

            byte var16 = var4;
            var4 += 8;
            var9 = var6.substring(var16, var4).getBytes("ISO-8859-1");
            var14 = var8;
            var10001 = var5++;
            var17 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var19 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15346;
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
            throw new RuntimeException("com/zelix/_oi", var14);
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
         throw new RuntimeException("com/zelix/_oi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
