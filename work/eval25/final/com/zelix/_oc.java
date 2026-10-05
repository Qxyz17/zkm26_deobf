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

public class _oc extends _og {
   int g;
   private static final long b = ess.a(6984879881689029103L, -8612410382165736572L, MethodHandles.lookup().lookupClass()).a(142551959472800L);
   private static final long[] c;
   private static final Integer[] k;
   private static final Map l = new HashMap(13);

   public int d(long var1) {
      return 3;
   }

   public _oc(long var1, int var3) {
      var1 = b ^ var1;
      super(b<"b">(25565, 5243230623140649741L ^ var1));
      this.g = var3;
   }

   public final boolean I(long var1) {
      return true;
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 43317403178689
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 103167525420822
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 126344664305306
      // 02f: lxor
      // 030: lstore 10
      // 032: pop2
      // 033: ldc2_w 8216154267410362304
      // 036: lload 4
      // 038: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: new java/lang/StringBuilder
      // 040: dup
      // 041: sipush 16494
      // 044: ldc2_w 1723638363402401150
      // 047: lload 4
      // 049: lxor
      // 04a: invokedynamic b (IJ)I bsm=com/zelix/_oc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: invokespecial java/lang/StringBuilder.<init> (I)V
      // 052: astore 13
      // 054: aload 13
      // 056: aload 0
      // 057: lload 8
      // 059: bipush 1
      // 05a: anewarray 141
      // 05d: dup_x2
      // 05e: dup_x2
      // 05f: pop
      // 060: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 063: bipush 0
      // 064: swap
      // 065: aastore
      // 066: ldc2_w 8374601802263259359
      // 069: lload 4
      // 06b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 073: pop
      // 074: aload 0
      // 075: lload 10
      // 077: bipush 1
      // 078: anewarray 141
      // 07b: dup_x2
      // 07c: dup_x2
      // 07d: pop
      // 07e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 081: bipush 0
      // 082: swap
      // 083: aastore
      // 084: ldc2_w 8288773877087088157
      // 087: lload 4
      // 089: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: astore 14
      // 090: aload 14
      // 092: aload 0
      // 093: getfield com/zelix/_oc.g I
      // 096: ldc2_w 8463256255195338727
      // 099: lload 4
      // 09b: invokedynamic t (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: lload 6
      // 0a2: dup2_x1
      // 0a3: pop2
      // 0a4: bipush 3
      // 0a5: anewarray 141
      // 0a8: dup_x1
      // 0a9: swap
      // 0aa: bipush 2
      // 0ab: swap
      // 0ac: aastore
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 1
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: bipush 0
      // 0b9: swap
      // 0ba: aastore
      // 0bb: ldc2_w 7799761149368071863
      // 0be: lload 4
      // 0c0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: astore 14
      // 0c7: astore 12
      // 0c9: aload 12
      // 0cb: ifnonnull 12d
      // 0ce: aload 14
      // 0d0: invokevirtual java/lang/String.length ()I
      // 0d3: ifle 10c
      // 0d6: goto 0e4
      // 0d9: ldc2_w 8448967872295269423
      // 0dc: lload 4
      // 0de: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 13
      // 0e6: new java/lang/StringBuilder
      // 0e9: dup
      // 0ea: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ed: ldc "\t"
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f2: aload 14
      // 0f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: pop
      // 0fe: goto 10c
      // 101: ldc2_w 8448967872295269423
      // 104: lload 4
      // 106: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: aload 3
      // 10d: new java/lang/StringBuilder
      // 110: dup
      // 111: invokespecial java/lang/StringBuilder.<init> ()V
      // 114: aload 2
      // 115: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: aload 2
      // 11c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 122: aload 13
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 127: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12a: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 12d: return
   }

   _oc(_xx var1, long var2) {
      var2 = b ^ var2;
      super(b<"b">(17581, 7733500038254476414L ^ var2));
      this.g = x44.a<"l">(var1, 2374294665880474694L, var2);
   }

   public _kz M(_kz var1, long var2, boolean var4, boolean var5, _fm var6, String var7) {
      long var8 = var2 ^ 32610570959058L;
      long var10 = var2 ^ 118237195067467L;
      long var12 = var2 ^ 37585498234552L;
      n[] var14 = var1.r();
      n[] var15 = var1.m();
      int var16 = var15.length;
      n[] var17 = n.S(var16 + 1, var10);
      System.arraycopy(var15, 0, var17, 0, var16);
      var17[var16] = n.n;
      return new _kz(var17, var14, var12, var1.z(), var1.C(var8));
   }

   public final boolean c(char var1, short var2, int var3) {
      return false;
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public boolean l(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      StringBuilder var6 = new StringBuilder();
      var6.append(x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2));
      var6.append((char)b<"b">(14729, 6319857885075698573L ^ var2));
      var6.append(this.g);
      return var6.toString();
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      super.W(var6, var2, var7);
      var2.writeShort(this.g);
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public final boolean Y(Object[] var1) {
      int var4 = (Integer)var1[0];
      n var2 = (n)var1[1];
      int var3 = (Integer)var1[2];
      long var5 = (Long)var1[3];
      return false;
   }

   public final boolean N(int var1, int var2, long var3) {
      return false;
   }

   public int W(Object[] var1) {
      return this.g;
   }

   public boolean e(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   static {
      long var0 = b ^ 57144097465159L;
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
      String var6 = "¤Û;]ÖÌÆÅØK\u001a0\u000fÉc\u0019";
      int var7 = "¤Û;]ÖÌÆÅØK\u001a0\u000fÉc\u0019".length();
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
                     k = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "ÏQg\u001bT÷_\\\u009aÉN¸ûãÉÎ";
                  var7 = "ÏQg\u001bT÷_\\\u009aÉN¸ûãÉÎ".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18950;
      if (k[var3] == null) {
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_oc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("com/zelix/_oc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
