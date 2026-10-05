package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _gx extends _n7 {
   private static final long a = ess.a(4941784232582643331L, -5192976017213924851L, MethodHandles.lookup().lookupClass()).a(20619580863411L);
   private static final String b;

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b;
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
      // 012: istore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 5
      // 01f: dup
      // 020: bipush 3
      // 021: aaload
      // 022: checkcast java/lang/Integer
      // 025: invokevirtual java/lang/Integer.intValue ()I
      // 028: istore 2
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 3
      // 033: pop
      // 034: lload 5
      // 036: dup2
      // 037: ldc2_w 120310072279596
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 92599993247389
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 4250611909290
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 98840750245944
      // 04f: lxor
      // 050: lstore 14
      // 052: pop2
      // 053: ldc2_w 1031773425375417457
      // 056: lload 5
      // 058: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: istore 16
      // 05f: iload 16
      // 061: ifne 0ff
      // 064: aload 0
      // 065: lload 10
      // 067: bipush 1
      // 068: anewarray 7
      // 06b: dup_x2
      // 06c: dup_x2
      // 06d: pop
      // 06e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 071: bipush 0
      // 072: swap
      // 073: aastore
      // 074: ldc2_w 1707270652021957629
      // 077: lload 5
      // 079: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: bipush 1
      // 07f: if_icmpne 10b
      // 082: goto 090
      // 085: ldc2_w 594921316479022867
      // 088: lload 5
      // 08a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: aload 7
      // 092: aload 0
      // 093: bipush 0
      // 094: lload 14
      // 096: bipush 2
      // 097: anewarray 7
      // 09a: dup_x2
      // 09b: dup_x2
      // 09c: pop
      // 09d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a0: bipush 1
      // 0a1: swap
      // 0a2: aastore
      // 0a3: dup_x1
      // 0a4: swap
      // 0a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a8: bipush 0
      // 0a9: swap
      // 0aa: aastore
      // 0ab: ldc2_w 899743315497312719
      // 0ae: lload 5
      // 0b0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: checkcast com/zelix/_xo
      // 0b8: lload 8
      // 0ba: bipush 1
      // 0bb: anewarray 7
      // 0be: dup_x2
      // 0bf: dup_x2
      // 0c0: pop
      // 0c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c4: bipush 0
      // 0c5: swap
      // 0c6: aastore
      // 0c7: ldc2_w 1671863393502507731
      // 0ca: lload 5
      // 0cc: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: lload 12
      // 0d3: dup2_x1
      // 0d4: pop2
      // 0d5: bipush 2
      // 0d6: anewarray 7
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 1
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w 1060201027103448207
      // 0ea: lload 5
      // 0ec: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: goto 0ff
      // 0f4: ldc2_w 594921316479022867
      // 0f7: lload 5
      // 0f9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: lload 5
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 12d
      // 106: iload 16
      // 108: ifeq 13b
      // 10b: aload 7
      // 10d: lload 12
      // 10f: ldc ""
      // 111: bipush 2
      // 112: anewarray 7
      // 115: dup_x1
      // 116: swap
      // 117: bipush 1
      // 118: swap
      // 119: aastore
      // 11a: dup_x2
      // 11b: dup_x2
      // 11c: pop
      // 11d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 120: bipush 0
      // 121: swap
      // 122: aastore
      // 123: ldc2_w 1060201027103448207
      // 126: lload 5
      // 128: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: goto 13b
      // 130: ldc2_w 594921316479022867
      // 133: lload 5
      // 135: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: athrow
      // 13b: return
   }

   public _gx(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 132362911308884L;
      super(var4, var3);
   }

   static {
      long var0 = a ^ 53368149210441L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¥\nå[b|\t\u008dÞÊ+~W\u0016ÊZ\u008a\u001c{¿Ê¼sJþ\u0080\u0016Y\fKÁ\u009a".getBytes("ISO-8859-1"));
      String var5 = b(var4).intern();
      byte var10001 = -1;
      b = var5;
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
}
