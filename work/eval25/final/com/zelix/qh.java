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

public class qh {
   private final int U;
   private final int A;
   private final int D;
   Map X;
   private static final long a = ess.a(331436984286719933L, -5669632493683794063L, MethodHandles.lookup().lookupClass()).a(159967822545469L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public w M(Object[] param1) {
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
      // 04: checkcast java/lang/Object
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Object
      // 19: astore 2
      // 1a: pop
      // 1b: getstatic com/zelix/qh.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: ldc2_w -4465936358601467135
      // 24: lload 3
      // 25: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: aload 0
      // 2b: ldc2_w -4227701217117695772
      // 2e: lload 3
      // 2f: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: aload 5
      // 36: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3b: checkcast com/zelix/ls
      // 3e: astore 7
      // 40: astore 6
      // 42: aload 7
      // 44: aload 6
      // 46: ifnonnull 67
      // 49: ifnonnull 65
      // 4c: goto 59
      // 4f: ldc2_w -2678347753919139240
      // 52: lload 3
      // 53: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aconst_null
      // 5a: areturn
      // 5b: ldc2_w -2678347753919139240
      // 5e: lload 3
      // 5f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 7
      // 67: aload 2
      // 68: bipush 1
      // 69: anewarray 59
      // 6c: dup_x1
      // 6d: swap
      // 6e: bipush 0
      // 6f: swap
      // 70: aastore
      // 71: ldc2_w -2687451606392979145
      // 74: lload 3
      // 75: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/w; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: areturn
   }

   public boolean x(Object[] var1) {
      Object var5 = var1[0];
      Object var7 = var1[1];
      Object var2 = var1[2];
      long var3 = (Long)var1[3];
      Object var6 = var1[4];
      var3 = a ^ var3;
      long var8 = var3 ^ 46292273499238L;
      long var10 = var3 ^ 18481467364457L;
      String var10000 = x44.a<"u">(-1340762389301300128L, var3);
      ls var13 = (ls)x44.a<"i">(this, -1570250924645564539L, var3).get(var5);
      String var12 = var10000;

      label27: {
         try {
            if (var12 != null) {
               return var13.c(var7, var2, var10, var6);
            }

            if (var13 == null) {
               break label27;
            }
         } catch (gj var15) {
            throw x44.a<"u">(var15, -741420660263477959L, var3);
         }

         return var13.c(var7, var2, var10, var6);
      }

      var13 = new ls(
         var8, x44.a<"i">(this, -1220663386055969515L, var3), x44.a<"i">(this, -782341676652804444L, var3), x44.a<"i">(this, -1147158962344611817L, var3)
      );
      boolean var14 = var13.c(var7, var2, var10, var6);
      x44.a<"i">(this, -1570250924645564539L, var3).put(var5, var13);
      return var14;
   }

   public qh(int var1, long var2, int var4) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 32816883259407L;
      int var5 = (int)((var2 ^ 32816883259407L) >>> 48);
      int var6 = (int)((var2 ^ 32816883259407L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      this((short)var5, var1, var6, (short)var7, var4, a<"p">(32315, 4743890554527722638L ^ var2), a<"p">(22777, 1115260396179065421L ^ var2));
   }

   public qh(short var1, int var2, int var3, short var4, int var5, int var6, int var7) {
      long var8 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      long var10 = var8 ^ 34366208164660L;
      super();
      this.D = var5;
      this.U = var6;
      this.A = var7;
      Object[] var10004 = new Object[]{null, var10};
      var10004[0] = var2;
      x44.a<"r">(this, x44.a<"q">(var10004, -4812226600713405820L, var8), -6478099376644754519L, var8);
   }

   public void J(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"h">(this, -2788785698766287620L, var2).clear();
   }

   public qh(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 27894038318595L;
      this(a<"p">(12416, 6813905721860279675L ^ var1), var3, a<"p">(31630, 4507113925713561204L ^ var1));
   }

   static {
      long var0 = a ^ 43074741328551L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[4];
      int var5 = 0;
      String var6 = "Ã\u0098\u0088è[\u001a\u001dP\u008aÅ¦4\u007f®\u0007\u009b";
      int var7 = "Ã\u0098\u0088è[\u001a\u001dP\u008aÅ¦4\u007f®\u0007\u009b".length();
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
                     b = var8;
                     c = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "çn¯f-¯ßNf6b\u001bDã\u007f@";
                  var7 = "çn¯f-¯ßNf6b\u001bDã\u007f@".length();
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

   private static gj a(gj var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22631;
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
            throw new RuntimeException("com/zelix/qh", var14);
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
         throw new RuntimeException("com/zelix/qh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
