package com.zelix;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _oo extends _k6 implements la {
   private List m;
   private static final long a = ess.a(6513583369926569043L, 3341781811361620270L, MethodHandles.lookup().lookupClass()).a(278211538844745L);
   private static final long b;

   public void K(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      x44.a<"n">(this, -8995247878922866164L, var3).add(var2);
   }

   public _oo(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = (var1 ^ 112678903384282L) >>> 16;
      int var6 = (int)((var1 ^ 112678903384282L) << 48 >>> 48);
      super(var4, (char)var6, var3);
      x44.a<"u">(this, new ArrayList(), 467866831716546392L, var1);
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/t9
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_fs
      // 019: astore 2
      // 01a: pop
      // 01b: lload 3
      // 01c: dup2
      // 01d: ldc2_w 61208854206829
      // 020: lxor
      // 021: lstore 6
      // 023: dup2
      // 024: ldc2_w 0
      // 027: lxor
      // 028: lstore 8
      // 02a: pop2
      // 02b: aload 0
      // 02c: lload 8
      // 02e: aload 5
      // 030: aload 2
      // 031: bipush 3
      // 032: anewarray 148
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
      // 04b: ldc2_w -7081916324337484489
      // 04e: lload 3
      // 04f: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 5
      // 056: checkcast com/zelix/la
      // 059: astore 11
      // 05b: aload 0
      // 05c: ldc2_w -7329817172808275103
      // 05f: lload 3
      // 060: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: invokeinterface java/util/List.size ()I 1
      // 06a: istore 12
      // 06c: istore 10
      // 06e: new java/lang/StringBuilder
      // 071: dup
      // 072: invokespecial java/lang/StringBuilder.<init> ()V
      // 075: astore 13
      // 077: bipush 0
      // 078: istore 14
      // 07a: iload 14
      // 07c: iload 12
      // 07e: if_icmpge 0f3
      // 081: aload 13
      // 083: aload 0
      // 084: ldc2_w -7329817172808275103
      // 087: lload 3
      // 088: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: iload 14
      // 08f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 094: checkcast java/lang/String
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: pop
      // 09b: iload 10
      // 09d: lload 3
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: iflt 0a8
      // 0a3: ifne 11d
      // 0a6: iload 10
      // 0a8: lload 3
      // 0a9: lconst_0
      // 0aa: lcmp
      // 0ab: ifle 0f0
      // 0ae: ifne 0ee
      // 0b1: goto 0be
      // 0b4: ldc2_w -7036220915170762952
      // 0b7: lload 3
      // 0b8: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: iload 14
      // 0c0: iload 12
      // 0c2: bipush 1
      // 0c3: isub
      // 0c4: if_icmpge 0eb
      // 0c7: goto 0d4
      // 0ca: ldc2_w -7036220915170762952
      // 0cd: lload 3
      // 0ce: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 13
      // 0d6: getstatic com/zelix/_oo.b J
      // 0d9: l2i
      // 0da: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0dd: pop
      // 0de: goto 0eb
      // 0e1: ldc2_w -7036220915170762952
      // 0e4: lload 3
      // 0e5: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: iinc 14 1
      // 0ee: iload 10
      // 0f0: ifeq 07a
      // 0f3: aload 11
      // 0f5: aload 13
      // 0f7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0fa: lload 6
      // 0fc: bipush 2
      // 0fd: anewarray 148
      // 100: dup_x2
      // 101: dup_x2
      // 102: pop
      // 103: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 106: bipush 1
      // 107: swap
      // 108: aastore
      // 109: dup_x1
      // 10a: swap
      // 10b: bipush 0
      // 10c: swap
      // 10d: aastore
      // 10e: ldc2_w -8734536057607663733
      // 111: lload 3
      // 112: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: lload 3
      // 118: lconst_0
      // 119: lcmp
      // 11a: ifle 09b
      // 11d: return
   }

   static {
      long var0 = a ^ 51648474622748L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -9144113166600071630L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)((int)(var4 >>> 56)),
            (byte)((int)(var4 >>> 48)),
            (byte)((int)(var4 >>> 40)),
            (byte)((int)(var4 >>> 32)),
            (byte)((int)(var4 >>> 24)),
            (byte)((int)(var4 >>> 16)),
            (byte)((int)(var4 >>> 8)),
            (byte)((int)var4)
         }
      );
      long var7 = ((long)var6[0] & 255L) << 56
         | ((long)var6[1] & 255L) << 48
         | ((long)var6[2] & 255L) << 40
         | ((long)var6[3] & 255L) << 32
         | ((long)var6[4] & 255L) << 24
         | ((long)var6[5] & 255L) << 16
         | ((long)var6[6] & 255L) << 8
         | (long)var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }

   private static gj b(gj var0) {
      return var0;
   }
}
