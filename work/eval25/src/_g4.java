package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _g4 extends _n7 {
   private static final long a = ess.a(4693348291890034784L, 8123602325219338437L, MethodHandles.lookup().lookupClass()).a(158000519588920L);
   private static final String b;

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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 6
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
      // 034: lload 6
      // 036: dup2
      // 037: ldc2_w 120310072279596
      // 03a: lxor
      // 03b: lstore 8
      // 03d: dup2
      // 03e: ldc2_w 92599993247389
      // 041: lxor
      // 042: lstore 10
      // 044: dup2
      // 045: ldc2_w 50026170571846
      // 048: lxor
      // 049: lstore 12
      // 04b: dup2
      // 04c: ldc2_w 98840750245944
      // 04f: lxor
      // 050: lstore 14
      // 052: pop2
      // 053: ldc2_w 1096596874045400213
      // 056: lload 6
      // 058: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: istore 16
      // 05f: aload 0
      // 060: iload 16
      // 062: ifeq 0c0
      // 065: lload 10
      // 067: bipush 1
      // 068: anewarray 27
      // 06b: dup_x2
      // 06c: dup_x2
      // 06d: pop
      // 06e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 071: bipush 0
      // 072: swap
      // 073: aastore
      // 074: ldc2_w 1707270652021957629
      // 077: lload 6
      // 079: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: ifle 100
      // 081: goto 08f
      // 084: ldc2_w 1623211602340994857
      // 087: lload 6
      // 089: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: aload 0
      // 090: bipush 0
      // 091: lload 14
      // 093: bipush 2
      // 094: anewarray 27
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 1
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x1
      // 0a1: swap
      // 0a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a5: bipush 0
      // 0a6: swap
      // 0a7: aastore
      // 0a8: ldc2_w 899743315497312719
      // 0ab: lload 6
      // 0ad: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: goto 0c0
      // 0b5: ldc2_w 1623211602340994857
      // 0b8: lload 6
      // 0ba: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: checkcast com/zelix/_xo
      // 0c3: lload 8
      // 0c5: bipush 1
      // 0c6: anewarray 27
      // 0c9: dup_x2
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: bipush 0
      // 0d0: swap
      // 0d1: aastore
      // 0d2: ldc2_w 1671863393502507731
      // 0d5: lload 6
      // 0d7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: astore 17
      // 0de: aload 4
      // 0e0: aload 17
      // 0e2: lload 12
      // 0e4: bipush 2
      // 0e5: anewarray 27
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 1
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: bipush 0
      // 0f4: swap
      // 0f5: aastore
      // 0f6: ldc2_w 891908258202351374
      // 0f9: lload 6
      // 0fb: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: return
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b;
   }

   public _g4(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 126732323327279L;
      super(var4, var3);
   }

   static {
      long var0 = a ^ 131813342005639L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("Ý9X¯\u008aÒ.z¿ËLb\u0007H¹_\bÌ\u0015]å|\u0010g".getBytes("ISO-8859-1"));
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
