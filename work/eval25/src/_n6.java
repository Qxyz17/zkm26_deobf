package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _n6 extends _n7 {
   private static final long a = ess.a(1111851472685316780L, -3891292629773543848L, MethodHandles.lookup().lookupClass()).a(177936954203425L);
   private static final String b;

   public _n6(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 69640268872575L;
      super(var4, var3);
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Integer
      // 0e: invokevirtual java/lang/Integer.intValue ()I
      // 11: istore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Long
      // 19: invokevirtual java/lang/Long.longValue ()J
      // 1c: lstore 6
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Integer
      // 24: invokevirtual java/lang/Integer.intValue ()I
      // 27: istore 3
      // 28: dup
      // 29: bipush 4
      // 2a: aaload
      // 2b: checkcast java/lang/Integer
      // 2e: invokevirtual java/lang/Integer.intValue ()I
      // 31: istore 5
      // 33: pop
      // 34: lload 6
      // 36: dup2
      // 37: ldc2_w 120310072279596
      // 3a: lxor
      // 3b: lstore 8
      // 3d: dup2
      // 3e: ldc2_w 92599993247389
      // 41: lxor
      // 42: lstore 10
      // 44: dup2
      // 45: ldc2_w 67092107807579
      // 48: lxor
      // 49: lstore 12
      // 4b: dup2
      // 4c: ldc2_w 98840750245944
      // 4f: lxor
      // 50: lstore 14
      // 52: pop2
      // 53: ldc2_w 1031773425375417457
      // 56: lload 6
      // 58: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: istore 16
      // 5f: aload 0
      // 60: iload 16
      // 62: ifne c0
      // 65: lload 10
      // 67: bipush 1
      // 68: anewarray 70
      // 6b: dup_x2
      // 6c: dup_x2
      // 6d: pop
      // 6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 71: bipush 0
      // 72: swap
      // 73: aastore
      // 74: ldc2_w 1707270652021957629
      // 77: lload 6
      // 79: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: ifle ff
      // 81: goto 8f
      // 84: ldc2_w 676652494309654761
      // 87: lload 6
      // 89: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: aload 0
      // 90: bipush 0
      // 91: lload 14
      // 93: bipush 2
      // 94: anewarray 70
      // 97: dup_x2
      // 98: dup_x2
      // 99: pop
      // 9a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9d: bipush 1
      // 9e: swap
      // 9f: aastore
      // a0: dup_x1
      // a1: swap
      // a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a5: bipush 0
      // a6: swap
      // a7: aastore
      // a8: ldc2_w 899743315497312719
      // ab: lload 6
      // ad: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/az; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: goto c0
      // b5: ldc2_w 676652494309654761
      // b8: lload 6
      // ba: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: checkcast com/zelix/_xo
      // c3: lload 8
      // c5: bipush 1
      // c6: anewarray 70
      // c9: dup_x2
      // ca: dup_x2
      // cb: pop
      // cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // cf: bipush 0
      // d0: swap
      // d1: aastore
      // d2: ldc2_w 1671863393502507731
      // d5: lload 6
      // d7: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dc: astore 17
      // de: aload 2
      // df: lload 12
      // e1: aload 17
      // e3: bipush 2
      // e4: anewarray 70
      // e7: dup_x1
      // e8: swap
      // e9: bipush 1
      // ea: swap
      // eb: aastore
      // ec: dup_x2
      // ed: dup_x2
      // ee: pop
      // ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // f2: bipush 0
      // f3: swap
      // f4: aastore
      // f5: ldc2_w 1302770623788898819
      // f8: lload 6
      // fa: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ff: return
   }

   public String F(Object[] var1) {
      long var2 = (Long)var1[0];
      return b;
   }

   static {
      long var0 = a ^ 70596078637176L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("³\u0012\t*©\u008aãçm©,¹ÌÝn<".getBytes("ISO-8859-1"));
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
