package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _on extends _k6 {
   private List F;
   private int V;
   private static final long a = ess.a(-4420615114588632005L, -7638003583834266701L, MethodHandles.lookup().lookupClass()).a(224873784070187L);
   private static final String b;
   private static final long c;

   public _on(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = (var2 ^ 2057934342088L) >>> 16;
      int var6 = (int)((var2 ^ 2057934342088L) << 48 >>> 48);
      super(var4, (char)var6, var1);
      x44.a<"w">(this, new ArrayList(), -8475719295176497634L, var2);
   }

   void M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"v">(this, x44.a<"i">(this, 8514468503839176104L, var2) + 1, 8514468503839176104L, var2);
   }

   public void B(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/t9
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_fs
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 116270369782472
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 0
      // 028: lxor
      // 029: lstore 8
      // 02b: pop2
      // 02c: aload 0
      // 02d: lload 8
      // 02f: aload 3
      // 030: aload 2
      // 031: bipush 3
      // 032: anewarray 16
      // 035: dup_x1
      // 036: swap
      // 037: bipush 2
      // 038: swap
      // 039: aastore
      // 03a: dup_x1
      // 03b: swap
      // 03c: bipush 1
      // 03d: swap
      // 03e: aastore
      // 03f: dup_x2
      // 040: dup_x2
      // 041: pop
      // 042: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 045: bipush 0
      // 046: swap
      // 047: aastore
      // 048: invokespecial com/zelix/_k6.B ([Ljava/lang/Object;)V
      // 04b: aload 3
      // 04c: checkcast com/zelix/lz
      // 04f: astore 11
      // 051: ldc2_w -8676686692554104663
      // 054: lload 4
      // 056: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: new java/lang/StringBuilder
      // 05e: dup
      // 05f: invokespecial java/lang/StringBuilder.<init> ()V
      // 062: astore 12
      // 064: istore 10
      // 066: aload 0
      // 067: ldc2_w -7400779869393078987
      // 06a: lload 4
      // 06c: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: invokeinterface java/util/List.size ()I 1
      // 076: istore 13
      // 078: bipush 0
      // 079: istore 14
      // 07b: iload 14
      // 07d: iload 13
      // 07f: if_icmpge 0fe
      // 082: aload 0
      // 083: ldc2_w -7400779869393078987
      // 086: lload 4
      // 088: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: iload 14
      // 08f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 094: checkcast java/lang/String
      // 097: astore 15
      // 099: aload 12
      // 09b: aload 15
      // 09d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a0: pop
      // 0a1: iload 10
      // 0a3: lload 4
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: iflt 0fb
      // 0aa: ifeq 0f9
      // 0ad: iload 14
      // 0af: iload 13
      // 0b1: bipush 1
      // 0b2: isub
      // 0b3: lload 4
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: iflt 115
      // 0ba: iload 10
      // 0bc: ifeq 115
      // 0bf: goto 0cd
      // 0c2: ldc2_w -8940532440143194620
      // 0c5: lload 4
      // 0c7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: if_icmpge 0f6
      // 0d0: goto 0de
      // 0d3: ldc2_w -8940532440143194620
      // 0d6: lload 4
      // 0d8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: aload 12
      // 0e0: getstatic com/zelix/_on.c J
      // 0e3: l2i
      // 0e4: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0e7: pop
      // 0e8: goto 0f6
      // 0eb: ldc2_w -8940532440143194620
      // 0ee: lload 4
      // 0f0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: iinc 14 1
      // 0f9: iload 10
      // 0fb: ifne 07b
      // 0fe: bipush 0
      // 0ff: lload 4
      // 101: lconst_0
      // 102: lcmp
      // 103: iflt 126
      // 106: istore 14
      // 108: iload 14
      // 10a: aload 0
      // 10b: ldc2_w -7369247032110409158
      // 10e: lload 4
      // 110: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: if_icmpge 151
      // 118: aload 12
      // 11a: getstatic com/zelix/_on.b Ljava/lang/String;
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: pop
      // 121: iinc 14 1
      // 124: iload 10
      // 126: ifeq 176
      // 129: goto 137
      // 12c: ldc2_w -8940532440143194620
      // 12f: lload 4
      // 131: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: iload 10
      // 139: ifne 108
      // 13c: lload 4
      // 13e: lconst_0
      // 13f: lcmp
      // 140: iflt 176
      // 143: goto 151
      // 146: ldc2_w -8940532440143194620
      // 149: lload 4
      // 14b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: aload 11
      // 153: aload 12
      // 155: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 158: lload 6
      // 15a: bipush 2
      // 15b: anewarray 16
      // 15e: dup_x2
      // 15f: dup_x2
      // 160: pop
      // 161: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 164: bipush 1
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: bipush 0
      // 16a: swap
      // 16b: aastore
      // 16c: ldc2_w -8657470759893593984
      // 16f: lload 4
      // 171: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: return
   }

   void D(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      var2 = a ^ var2;
      x44.a<"k">(this, -8916249765631973315L, var2).add(var4);
   }

   static {
      long var5 = a ^ 29381205498109L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("\fû±î$\u001d-¡".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      b = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = 5151181134871078317L;
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
      long var14 = ((long)var4[0] & 255L) << 56
         | ((long)var4[1] & 255L) << 48
         | ((long)var4[2] & 255L) << 40
         | ((long)var4[3] & 255L) << 32
         | ((long)var4[4] & 255L) << 24
         | ((long)var4[5] & 255L) << 16
         | ((long)var4[6] & 255L) << 8
         | (long)var4[7] & 255L;
      var10001 = -1;
      c = var14;
   }

   private static gj b(gj var0) {
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
}
