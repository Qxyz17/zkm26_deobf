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

public class c_ extends jf implements ss {
   private za H;
   private static final long a = ess.a(-3190563113937278061L, -7717734450973006783L, MethodHandles.lookup().lookupClass()).a(4814662859795L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public za P(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"o">(this, -6543756996366265014L, var2);
   }

   public void t(Object[] param1) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/_za
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ur
      // 19: astore 2
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 0
      // 21: lxor
      // 22: lstore 6
      // 24: dup2
      // 25: ldc2_w 134528422017690
      // 28: lxor
      // 29: lstore 8
      // 2b: pop2
      // 2c: ldc2_w 9148277501292601163
      // 2f: lload 4
      // 31: invokedynamic q (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 0
      // 37: lload 8
      // 39: bipush 1
      // 3a: anewarray 272
      // 3d: dup_x2
      // 3e: dup_x2
      // 3f: pop
      // 40: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43: bipush 0
      // 44: swap
      // 45: aastore
      // 46: ldc2_w 7145691849331111744
      // 49: lload 4
      // 4b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: istore 11
      // 52: astore 10
      // 54: aload 10
      // 56: ifnonnull 8d
      // 59: iload 11
      // 5b: ifle bd
      // 5e: goto 6c
      // 61: ldc2_w 7386688329517189080
      // 64: lload 4
      // 66: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: aload 0
      // 6d: aload 0
      // 6e: bipush 0
      // 6f: invokevirtual com/zelix/c_.e (I)Lcom/zelix/_za;
      // 72: checkcast com/zelix/za
      // 75: ldc2_w 7349250711852242328
      // 78: lload 4
      // 7a: invokedynamic r (Ljava/lang/Object;Lcom/zelix/za;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: goto 8d
      // 82: ldc2_w 7386688329517189080
      // 85: lload 4
      // 87: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: aload 0
      // 8e: ldc2_w 7349250711852242328
      // 91: lload 4
      // 93: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/za; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: lload 6
      // 9a: aload 0
      // 9b: aload 2
      // 9c: bipush 3
      // 9d: anewarray 272
      // a0: dup_x1
      // a1: swap
      // a2: bipush 2
      // a3: swap
      // a4: aastore
      // a5: dup_x1
      // a6: swap
      // a7: bipush 1
      // a8: swap
      // a9: aastore
      // aa: dup_x2
      // ab: dup_x2
      // ac: pop
      // ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b0: bipush 0
      // b1: swap
      // b2: aastore
      // b3: ldc2_w 7461507451520457769
      // b6: lload 4
      // b8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd: return
   }

   public int F(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"j">((kx)x44.a<"n">(this, 968051114491279346L, var2), new Object[]{var4}, 580491800480757476L, var2);
   }

   public String M(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 33629832883589L;
      long var6 = var2 ^ 10055105912884L;
      StringBuilder var9 = new StringBuilder();
      int[] var10000 = x44.a<"w">(2619765216274286053L, var2);
      int var10 = x44.a<"o">(this, new Object[]{var6}, 4144696628776971758L, var2);
      var9.append(b);
      int[] var8 = var10000;

      label20: {
         try {
            var9.append((char)a<"k">(32594, 18681559693410315L ^ var2));
            if (var8 != null) {
               return var9.toString();
            }

            if (var10 <= 0) {
               break label20;
            }
         } catch (gj var12) {
            throw x44.a<"w">(var12, 4336045708863806838L, var2);
         }

         za var11 = (za)this.e(0);
         var9.append(x44.a<"o">(var11, new Object[]{var4}, 4264383692485228305L, var2));
      }

      var9.append((char)a<"k">(16560, 3841913071211053032L ^ var2));
      return var9.toString();
   }

   public c_(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 40678726990093L;
      super(var4, var3);
   }

   public String Z(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      return x44.a<"l">((kx)x44.a<"h">(this, -7349481125713616740L, var2), new Object[]{var4}, -7129361874141024600L, var2);
   }

   static {
      long var11 = a ^ 56015760550180L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("ïí\u0081\u0097!ñ\u0091ä\u0097\u0001\u0081\u0016\u0086\u0007Ý\u0013".getBytes("ISO-8859-1"));
      String var19 = b(var15).intern();
      int var10001 = -1;
      b = var19;
      e = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u009f±buv´4hÉO\u009f×9$Yó";
      int var5 = "\u009f±buv´4hÉO\u009f×9$Yó".length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var8 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte[] var10 = var0.doFinal(
            new byte[]{
               (byte)((int)(var8 >>> 56)),
               (byte)((int)(var8 >>> 48)),
               (byte)((int)(var8 >>> 40)),
               (byte)((int)(var8 >>> 32)),
               (byte)((int)(var8 >>> 24)),
               (byte)((int)(var8 >>> 16)),
               (byte)((int)(var8 >>> 8)),
               (byte)((int)var8)
            }
         );
         long var10004 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         byte var22 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      c = var6;
      d = new Integer[2];
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4829;
      if (d[var3] == null) {
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/c_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/c_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
