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

public class _uo {
   private Integer[] g;
   private static _uo h;
   public static final Integer V;
   private int y;
   private static final long a = ess.a(-1523192214399258669L, -7609977960110307044L, MethodHandles.lookup().lookupClass()).a(277306603781172L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public Integer R(int param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_uo.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: ldc2_w 5550919692933354508
      // 09: lload 2
      // 0a: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 4
      // 11: iload 1
      // 12: bipush -1
      // 13: aload 4
      // 15: ifnonnull 5c
      // 18: if_icmpne 3c
      // 1b: goto 28
      // 1e: ldc2_w 6208461016635860936
      // 21: lload 2
      // 22: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: athrow
      // 28: ldc2_w 5471043124676707682
      // 2b: lload 2
      // 2c: invokedynamic h (JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: areturn
      // 32: ldc2_w 6208461016635860936
      // 35: lload 2
      // 36: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: iload 1
      // 3d: aload 4
      // 3f: ifnonnull 60
      // 42: sipush 17348
      // 45: ldc2_w 3582261375032513301
      // 48: lload 2
      // 49: lxor
      // 4a: invokedynamic k (IJ)I bsm=com/zelix/_uo.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: goto 5c
      // 52: ldc2_w 6208461016635860936
      // 55: lload 2
      // 56: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: if_icmple 64
      // 5f: iload 1
      // 60: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 63: areturn
      // 64: aload 0
      // 65: dup
      // 66: astore 5
      // 68: aload 4
      // 6a: ifnonnull a4
      // 6d: monitorenter
      // 6e: iload 1
      // 6f: aload 0
      // 70: getfield com/zelix/_uo.y I
      // 73: lload 2
      // 74: lconst_0
      // 75: lcmp
      // 76: iflt 7e
      // 79: if_icmplt a3
      // 7c: iload 1
      // 7d: bipush 2
      // 7e: imul
      // 7f: istore 6
      // 81: iload 6
      // 83: anewarray 100
      // 86: astore 7
      // 88: aload 0
      // 89: getfield com/zelix/_uo.g [Ljava/lang/Integer;
      // 8c: bipush 0
      // 8d: aload 7
      // 8f: bipush 0
      // 90: aload 0
      // 91: getfield com/zelix/_uo.y I
      // 94: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 97: aload 0
      // 98: aload 7
      // 9a: putfield com/zelix/_uo.g [Ljava/lang/Integer;
      // 9d: aload 0
      // 9e: iload 6
      // a0: putfield com/zelix/_uo.y I
      // a3: aload 0
      // a4: getfield com/zelix/_uo.g [Ljava/lang/Integer;
      // a7: iload 1
      // a8: aaload
      // a9: astore 6
      // ab: aload 6
      // ad: aload 4
      // af: ifnonnull d5
      // b2: ifnonnull d0
      // b5: goto c2
      // b8: ldc2_w 6208461016635860936
      // bb: lload 2
      // bc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: iload 1
      // c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c6: astore 6
      // c8: aload 0
      // c9: getfield com/zelix/_uo.g [Ljava/lang/Integer;
      // cc: iload 1
      // cd: aload 6
      // cf: aastore
      // d0: aload 6
      // d2: aload 5
      // d4: monitorexit
      // d5: areturn
      // d6: astore 8
      // d8: aload 5
      // da: monitorexit
      // db: aload 8
      // dd: athrow
   }

   private _uo(int var1) {
      this.g = new Integer[var1];
      this.y = var1;
   }

   public static _uo f(int var0, short var1, int var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;

      try {
         if (h == null) {
            h = new _uo(a<"k">(16828, 3526377107015403298L ^ var3));
         }
      } catch (gj var5) {
         throw x44.a<"w">(var5, 28924269497725318L, var3);
      }

      return h;
   }

   static {
      long var0 = a ^ 9898420695441L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "Pe\u001ep4cxã´\u0085\u0007\u0007\"\"iµ";
      int var7 = "Pe\u001ep4cxã´\u0085\u0007\u0007\"\"iµ".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
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
         long var10004 = ((long)var12[0] & 255L) << 56
            | ((long)var12[1] & 255L) << 48
            | ((long)var12[2] & 255L) << 40
            | ((long)var12[3] & 255L) << 32
            | ((long)var12[4] & 255L) << 24
            | ((long)var12[5] & 255L) << 16
            | ((long)var12[6] & 255L) << 8
            | (long)var12[7] & 255L;
         byte var14 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      b = var8;
      c = new Integer[2];
      V = -1;
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20227;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_uo", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("com/zelix/_uo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
