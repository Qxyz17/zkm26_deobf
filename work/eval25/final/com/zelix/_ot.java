package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ot extends _o5 {
   private static final long c = ess.a(-5280396229153009207L, -1378378326215320948L, MethodHandles.lookup().lookupClass()).a(36692647474050L);
   private static final long[] t;
   private static final Integer[] u;
   private static final Map w = new HashMap(13);

   public _ot(long var1, _op var3) {
      var1 = c ^ var1;
      super(e<"o">(26723, 7883803848814259699L ^ var1), var3);
   }

   _ot(char var1, _xx var2, int var3, long var4, _y4 var6) {
      long var7 = ((long)var1 << 48 | var4 << 16 >>> 16) ^ c;
      long var9 = var7 ^ 132018437388243L;
      super(var9, e<"o">(8557, 4087555945632766680L ^ var7), var2, var3, var6);
   }

   public _kz M(_kz var1, long var2, boolean var4, boolean var5, _fm var6, String var7) {
      long var8 = var2 ^ 32610570959058L;
      long var10 = var2 ^ 118237195067467L;
      long var12 = var2 ^ 37585498234552L;
      n[] var14 = var1.m();
      n[] var15 = var1.r();
      int var16 = var14.length;
      n[] var17 = n.S(var16 + 1, var10);
      System.arraycopy(var14, 0, var17, 0, var16);
      var17[var16] = n.e;
      return new _kz(var17, var15, var12, var1.z(), var1.C(var8));
   }

   public boolean f(short var1, short var2, int var3) {
      return true;
   }

   public List E(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 7607670151054685270
      // 03: lload 1
      // 04: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: aload 0
      // 0a: invokevirtual com/zelix/_ot.k ()I
      // 0d: istore 4
      // 0f: astore 3
      // 10: iload 4
      // 12: sipush 25026
      // 15: ldc2_w 8497800882224724564
      // 18: lload 1
      // 19: lxor
      // 1a: invokedynamic o (IJ)I bsm=com/zelix/_ot.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f: aload 3
      // 20: ifnonnull 4f
      // 23: if_icmplt 52
      // 26: goto 33
      // 29: ldc2_w 8444640377564083469
      // 2c: lload 1
      // 2d: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: athrow
      // 33: iload 4
      // 35: sipush 6953
      // 38: ldc2_w 357914256554164412
      // 3b: lload 1
      // 3c: lxor
      // 3d: invokedynamic o (IJ)I bsm=com/zelix/_ot.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: goto 4f
      // 45: ldc2_w 8444640377564083469
      // 48: lload 1
      // 49: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: if_icmple 7d
      // 52: new java/util/ArrayList
      // 55: dup
      // 56: bipush 1
      // 57: invokespecial java/util/ArrayList.<init> (I)V
      // 5a: astore 5
      // 5c: aload 5
      // 5e: new com/zelix/_om
      // 61: dup
      // 62: sipush 27483
      // 65: ldc2_w 354258016845525196
      // 68: lload 1
      // 69: lxor
      // 6a: invokedynamic o (IJ)I bsm=com/zelix/_ot.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: aload 0
      // 70: getfield com/zelix/_ot.G Lcom/zelix/_op;
      // 73: invokespecial com/zelix/_om.<init> (ILcom/zelix/_op;)V
      // 76: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 79: pop
      // 7a: aload 5
      // 7c: areturn
      // 7d: aconst_null
      // 7e: areturn
   }

   static {
      long var0 = c ^ 9194208865892L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[5];
      int var5 = 0;
      String var6 = "\u009b¥KA¬b¤Dt´\u000fårô3ÌLØ\u0091\u0087ç\u001e:Ã";
      int var7 = "\u009b¥KA¬b¤Dt´\u000fårô3ÌLØ\u0091\u0087ç\u001e:Ã".length();
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
                     t = var8;
                     u = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "y\f³¥ßN\n\u001b0Ñ¿ÔYnÉ\u0084";
                  var7 = "y\f³¥ßN\n\u001b0Ñ¿ÔYnÉ\u0084".length();
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

   private static gj b(gj var0) {
      return var0;
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32535;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])w.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               w.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_ot", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_ot" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
