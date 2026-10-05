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

public abstract class js extends jf implements li {
   private final boolean k;
   private String I;
   private String G;
   private String x;
   private static final long a = ess.a(3951411776817837868L, -1990901335979899220L, MethodHandles.lookup().lookupClass()).a(24599719543815L);
   private static final long[] d;
   private static final Integer[] e;
   private static final Map f = new HashMap(13);

   public final void t(Object[] var1) {
      long var3 = (Long)var1[0];
      _za var5 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      long var6 = var3 ^ 90460411693030L;
      long var8 = var3 ^ 126698914985146L;
      long var10 = (var3 ^ 23066569499504L) >>> 16;
      int var12 = (int)((var3 ^ 23066569499504L) << 48 >>> 48);
      long var13 = var3 ^ 134528422017690L;
      int var15 = x44.a<"i">(this, new Object[]{var13}, 7145691849331111744L, var3);
      g7 var16 = (g7)this.e(0);
      x44.a<"r">(this, x44.a<"i">(var16, new Object[0], 7328816409459435145L, var3), 8760572873168557915L, var3);
      String var17 = x44.a<"o">(this, new Object[]{x44.a<"m">(this, 8760572873168557915L, var3), var8}, 7407665981292864275L, var3);
      int var18 = x44.a<"q">(new Object[]{var6, var17}, 8668310051220390328L, var3);
      x44.a<"r">(this, var17.substring(0, var18 + 1), 7427093696875904885L, var3);
      x44.a<"r">(this, "*" + x44.a<"m">(this, 7427093696875904885L, var3), 7427093696875904885L, var3);
      x44.a<"r">(this, var17.substring(var18 + 1), 7264342281418358755L, var3);
      _i var10000 = (_i)var5;
      Object[] var10005 = new Object[]{null, Integer.valueOf((short)var12), this};
      var10005[0] = var10;
      x44.a<"i">(var10000, var10005, 8820425109072413817L, var3);
   }

   public String k(Object[] var1) {
      long var2 = (Long)var1[0];

      StringBuilder var10000;
      try {
         var10000 = new StringBuilder();
         if (x44.a<"i">(this, -7993199312277583070L, var2)) {
            return var10000.append("!").append("\"").append(x44.a<"i">(this, -7912831169658389273L, var2)).append("\"").toString();
         }
      } catch (gj var4) {
         throw x44.a<"u">(var4, -7997037344232232141L, var2);
      }

      return var10000.append("").append("\"").append(x44.a<"i">(this, -7912831169658389273L, var2)).append("\"").toString();
   }

   public boolean g(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: lload 2
      // 015: dup2
      // 016: ldc2_w 22761975510537
      // 019: lxor
      // 01a: lstore 5
      // 01c: dup2
      // 01d: ldc2_w 59155525158229
      // 020: lxor
      // 021: lstore 7
      // 023: dup2
      // 024: ldc2_w 31099673406332
      // 027: lxor
      // 028: lstore 9
      // 02a: pop2
      // 02b: aload 0
      // 02c: aload 4
      // 02e: lload 7
      // 030: bipush 2
      // 031: anewarray 357
      // 034: dup_x2
      // 035: dup_x2
      // 036: pop
      // 037: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 03a: bipush 1
      // 03b: swap
      // 03c: aastore
      // 03d: dup_x1
      // 03e: swap
      // 03f: bipush 0
      // 040: swap
      // 041: aastore
      // 042: ldc2_w 1666919002384274172
      // 045: lload 2
      // 046: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: astore 12
      // 04d: lload 5
      // 04f: aload 12
      // 051: bipush 2
      // 052: anewarray 357
      // 055: dup_x1
      // 056: swap
      // 057: bipush 1
      // 058: swap
      // 059: aastore
      // 05a: dup_x2
      // 05b: dup_x2
      // 05c: pop
      // 05d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 060: bipush 0
      // 061: swap
      // 062: aastore
      // 063: ldc2_w 694470127457071191
      // 066: lload 2
      // 067: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: istore 13
      // 06e: ldc2_w 1088308826894773924
      // 071: lload 2
      // 072: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: aload 12
      // 079: iload 13
      // 07b: bipush 1
      // 07c: iadd
      // 07d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 080: astore 14
      // 082: astore 11
      // 084: aload 12
      // 086: bipush 0
      // 087: iload 13
      // 089: bipush 1
      // 08a: iadd
      // 08b: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 08e: astore 15
      // 090: lload 9
      // 092: aload 15
      // 094: aload 0
      // 095: ldc2_w 1656498567521947290
      // 098: lload 2
      // 099: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: invokestatic com/zelix/l_.y (JLjava/lang/String;Ljava/lang/String;)Z
      // 0a1: aload 11
      // 0a3: ifnonnull 0d4
      // 0a6: ifeq 0ed
      // 0a9: goto 0b6
      // 0ac: ldc2_w 817299381152559456
      // 0af: lload 2
      // 0b0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: lload 9
      // 0b8: aload 14
      // 0ba: aload 0
      // 0bb: ldc2_w 1531054717110111756
      // 0be: lload 2
      // 0bf: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: invokestatic com/zelix/l_.y (JLjava/lang/String;Ljava/lang/String;)Z
      // 0c7: goto 0d4
      // 0ca: ldc2_w 817299381152559456
      // 0cd: lload 2
      // 0ce: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 11
      // 0d6: ifnonnull 0ea
      // 0d9: ifeq 0ed
      // 0dc: goto 0e9
      // 0df: ldc2_w 817299381152559456
      // 0e2: lload 2
      // 0e3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: athrow
      // 0e9: bipush 1
      // 0ea: goto 0ee
      // 0ed: bipush 0
      // 0ee: istore 16
      // 0f0: aload 0
      // 0f1: ldc2_w 810931608771350897
      // 0f4: lload 2
      // 0f5: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: aload 11
      // 0fc: ifnonnull 13b
      // 0ff: ifeq 139
      // 102: goto 10f
      // 105: ldc2_w 817299381152559456
      // 108: lload 2
      // 109: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: iload 16
      // 111: aload 11
      // 113: ifnonnull 134
      // 116: goto 123
      // 119: ldc2_w 817299381152559456
      // 11c: lload 2
      // 11d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: ifne 137
      // 126: goto 133
      // 129: ldc2_w 817299381152559456
      // 12c: lload 2
      // 12d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: athrow
      // 133: bipush 1
      // 134: goto 138
      // 137: bipush 0
      // 138: ireturn
      // 139: iload 16
      // 13b: ireturn
   }

   public js(int var1, boolean var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 23833746215044L;
      super(var5, var1);
      this.k = var2;
   }

   private static int s(Object[] var0) {
      long var2 = (Long)var0[0];
      String var1 = (String)var0[1];
      var2 = a ^ var2;
      int var4 = var1.lastIndexOf(a<"i">(8341, 5764922283105250687L ^ var2));
      int var5 = var1.lastIndexOf("!");
      return Math.max(var4, var5);
   }

   private String p(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      int[] var10000 = x44.a<"s">(6608808952793299465L, var3);
      String var6 = var2.replace((char)a<"i">(2210, 1736019568014128663L ^ var3), (char)a<"i">(13685, 8096559108524723137L ^ var3));
      int[] var5 = var10000;

      label25: {
         label24: {
            try {
               var9 = x44.a<"j">(6399619915830986656L, var3);
               if (var5 != null) {
                  break label25;
               }

               if (var9 == a<"i">(15143, 5746082705168778640L ^ var3)) {
                  break label24;
               }
            } catch (gj var7) {
               throw x44.a<"s">(var7, 6916093967732368845L, var3);
            }

            var6 = var2.replace(x44.a<"j">(6399619915830986656L, var3), (char)a<"i">(13685, 8096559108524723137L ^ var3));
         }

         var9 = x44.a<"j">(5159584137625307679L, var3);
      }

      if (var9 == 0) {
         var6 = x44.a<"k">(var6, 6598340987660150313L, var3);
      }

      return var6;
   }

   static {
      long var0 = a ^ 25952876040196L;
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
      String var6 = "\f\u0093WvÏ[Q7A\u009a\u008d±±Ü\f¯";
      int var7 = "\f\u0093WvÏ[Q7A\u009a\u008d±±Ü\f¯".length();
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
                     d = var8;
                     e = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var14[var10001] = var21;
                  if (var4 < var7) {
                     continue label23;
                  }

                  var6 = "5ëpÇ\u0017ÆsËW\u0087\u0086\u0097É\u0084Æq";
                  var7 = "5ëpÇ\u0017ÆsËW\u0087\u0086\u0097É\u0084Æq".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11486;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/js", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
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
         throw new RuntimeException("com/zelix/js" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
