package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _n_ extends _n7 {
   private static final long a = ess.a(-6596287722572382328L, -1539209560665748573L, MethodHandles.lookup().lookupClass()).a(233549678034712L);
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
      // 12: istore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Long
      // 19: invokevirtual java/lang/Long.longValue ()J
      // 1c: lstore 3
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Integer
      // 23: invokevirtual java/lang/Integer.intValue ()I
      // 26: istore 6
      // 28: dup
      // 29: bipush 4
      // 2a: aaload
      // 2b: checkcast java/lang/Integer
      // 2e: invokevirtual java/lang/Integer.intValue ()I
      // 31: istore 5
      // 33: pop
      // 34: lload 3
      // 35: dup2
      // 36: ldc2_w 120310072279596
      // 39: lxor
      // 3a: lstore 8
      // 3c: dup2
      // 3d: ldc2_w 92599993247389
      // 40: lxor
      // 41: lstore 10
      // 43: dup2
      // 44: ldc2_w 140665200587080
      // 47: lxor
      // 48: lstore 12
      // 4a: dup2
      // 4b: ldc2_w 98840750245944
      // 4e: lxor
      // 4f: lstore 14
      // 51: pop2
      // 52: ldc2_w 1096596874045400213
      // 55: lload 3
      // 56: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: istore 16
      // 5d: aload 0
      // 5e: iload 16
      // 60: ifeq ba
      // 63: lload 10
      // 65: bipush 1
      // 66: anewarray 154
      // 69: dup_x2
      // 6a: dup_x2
      // 6b: pop
      // 6c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6f: bipush 0
      // 70: swap
      // 71: aastore
      // 72: ldc2_w 1707270652021957629
      // 75: lload 3
      // 76: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: ifle f8
      // 7e: goto 8b
      // 81: ldc2_w 611381787181184124
      // 84: lload 3
      // 85: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: aload 0
      // 8c: bipush 0
      // 8d: lload 14
      // 8f: bipush 2
      // 90: anewarray 154
      // 93: dup_x2
      // 94: dup_x2
      // 95: pop
      // 96: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 99: bipush 1
      // 9a: swap
      // 9b: aastore
      // 9c: dup_x1
      // 9d: swap
      // 9e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a1: bipush 0
      // a2: swap
      // a3: aastore
      // a4: ldc2_w 899743315497312719
      // a7: lload 3
      // a8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: goto ba
      // b0: ldc2_w 611381787181184124
      // b3: lload 3
      // b4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: athrow
      // ba: checkcast com/zelix/_xo
      // bd: lload 8
      // bf: bipush 1
      // c0: anewarray 154
      // c3: dup_x2
      // c4: dup_x2
      // c5: pop
      // c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c9: bipush 0
      // ca: swap
      // cb: aastore
      // cc: ldc2_w 1671863393502507731
      // cf: lload 3
      // d0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: astore 17
      // d7: aload 7
      // d9: aload 17
      // db: lload 12
      // dd: bipush 2
      // de: anewarray 154
      // e1: dup_x2
      // e2: dup_x2
      // e3: pop
      // e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e7: bipush 1
      // e8: swap
      // e9: aastore
      // ea: dup_x1
      // eb: swap
      // ec: bipush 0
      // ed: swap
      // ee: aastore
      // ef: ldc2_w 1210485380721905367
      // f2: lload 3
      // f3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f8: return
   }

   public _n_(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 7870493454946L;
      super(var4, var3);
   }

   static {
      long var0 = a ^ 47080034069316L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u008eõí\u0088©ëD\u0005ïC\u0000c!¢ì\u009c\u0013\u0016r@\u0086Aç\u0003«'ÉÅ¦¨Oy".getBytes("ISO-8859-1"));
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
