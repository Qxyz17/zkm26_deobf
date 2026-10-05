package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _g7 extends _n7 {
   private static final long a = ess.a(1597144268695440240L, 1427298734860660129L, MethodHandles.lookup().lookupClass()).a(95485436496310L);
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
      // 00: aload 1
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast com/zelix/_uu
      // 07: astore 7
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Integer
      // 0f: invokevirtual java/lang/Integer.intValue ()I
      // 12: istore 6
      // 14: dup
      // 15: bipush 2
      // 16: aaload
      // 17: checkcast java/lang/Long
      // 1a: invokevirtual java/lang/Long.longValue ()J
      // 1d: lstore 2
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Integer
      // 24: invokevirtual java/lang/Integer.intValue ()I
      // 27: istore 4
      // 29: dup
      // 2a: bipush 4
      // 2b: aaload
      // 2c: checkcast java/lang/Integer
      // 2f: invokevirtual java/lang/Integer.intValue ()I
      // 32: istore 5
      // 34: pop
      // 35: lload 2
      // 36: dup2
      // 37: ldc2_w 120310072279596
      // 3a: lxor
      // 3b: lstore 8
      // 3d: dup2
      // 3e: ldc2_w 92599993247389
      // 41: lxor
      // 42: lstore 10
      // 44: dup2
      // 45: ldc2_w 21763298560688
      // 48: lxor
      // 49: lstore 12
      // 4b: dup2
      // 4c: ldc2_w 98840750245944
      // 4f: lxor
      // 50: lstore 14
      // 52: pop2
      // 53: ldc2_w 1031773425375417457
      // 56: lload 2
      // 57: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: istore 16
      // 5e: aload 0
      // 5f: iload 16
      // 61: ifne bb
      // 64: lload 10
      // 66: bipush 1
      // 67: anewarray 47
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 0
      // 71: swap
      // 72: aastore
      // 73: ldc2_w 1707270652021957629
      // 76: lload 2
      // 77: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: ifle f9
      // 7f: goto 8c
      // 82: ldc2_w 912249336383339430
      // 85: lload 2
      // 86: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: aload 0
      // 8d: bipush 0
      // 8e: lload 14
      // 90: bipush 2
      // 91: anewarray 47
      // 94: dup_x2
      // 95: dup_x2
      // 96: pop
      // 97: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9a: bipush 1
      // 9b: swap
      // 9c: aastore
      // 9d: dup_x1
      // 9e: swap
      // 9f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a2: bipush 0
      // a3: swap
      // a4: aastore
      // a5: ldc2_w 899743315497312719
      // a8: lload 2
      // a9: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: goto bb
      // b1: ldc2_w 912249336383339430
      // b4: lload 2
      // b5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: athrow
      // bb: checkcast com/zelix/_xo
      // be: lload 8
      // c0: bipush 1
      // c1: anewarray 47
      // c4: dup_x2
      // c5: dup_x2
      // c6: pop
      // c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ca: bipush 0
      // cb: swap
      // cc: aastore
      // cd: ldc2_w 1671863393502507731
      // d0: lload 2
      // d1: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d6: astore 17
      // d8: aload 7
      // da: lload 12
      // dc: aload 17
      // de: bipush 2
      // df: anewarray 47
      // e2: dup_x1
      // e3: swap
      // e4: bipush 1
      // e5: swap
      // e6: aastore
      // e7: dup_x2
      // e8: dup_x2
      // e9: pop
      // ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // ed: bipush 0
      // ee: swap
      // ef: aastore
      // f0: ldc2_w 693700919050152404
      // f3: lload 2
      // f4: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f9: return
   }

   public _g7(int var1, long var2) {
      var2 = a ^ var2;
      long var4 = var2 ^ 139389992317976L;
      super(var4, var1);
   }

   static {
      long var0 = a ^ 112994172812979L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("lÙÈæý6ÈøûæÚÜ\u009bÉä_".getBytes("ISO-8859-1"));
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
