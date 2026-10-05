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

public abstract class f5 extends jf {
   boolean b;
   private static final long a = ess.a(3386419904504754246L, -6392802865790634181L, MethodHandles.lookup().lookupClass()).a(193071472519802L);
   private static final String e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   public void U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      x44.a<"r">(this, true, -2172424726566548696L, var2);
   }

   public void t(Object[] var1) {
      long var2 = (Long)var1[0];
      _za var4 = (_za)var1[1];
      _ur var5 = (_ur)var1[2];
      long var6 = var2 ^ 0L;
      long var8 = var2 ^ 134528422017690L;
      int[] var10000 = x44.a<"q">(9148277501292601163L, var2);
      int var11 = x44.a<"i">(this, new Object[]{var8}, 7145691849331111744L, var2);
      int var12 = 0;
      int[] var10 = var10000;

      while (var12 < var11) {
         _za var13 = this.e(var12);
         x44.a<"i">(var13, new Object[]{var6, this, var5}, 8818198965911889370L, var2);
         var12++;
         if (var10 != null) {
            break;
         }
      }
   }

   public String o(Object[] param1) {
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
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 2
      // 00b: pop
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 0
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: new java/lang/StringBuilder
      // 018: dup
      // 019: invokespecial java/lang/StringBuilder.<init> ()V
      // 01c: astore 7
      // 01e: ldc2_w 8596022076981270261
      // 021: lload 2
      // 022: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: aload 0
      // 028: getfield com/zelix/f5.O [Lcom/zelix/_za;
      // 02b: arraylength
      // 02c: istore 8
      // 02e: astore 6
      // 030: aload 0
      // 031: ldc2_w 7923972093090416390
      // 034: lload 2
      // 035: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: aload 6
      // 03c: ifnonnull 051
      // 03f: ifne 067
      // 042: goto 04f
      // 045: ldc2_w 7747580451151728545
      // 048: lload 2
      // 049: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: iload 8
      // 051: aload 6
      // 053: ifnonnull 088
      // 056: bipush 1
      // 057: if_icmple 087
      // 05a: goto 067
      // 05d: ldc2_w 7747580451151728545
      // 060: lload 2
      // 061: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: aload 7
      // 069: sipush 27786
      // 06c: ldc2_w 475118417981794923
      // 06f: lload 2
      // 070: lxor
      // 071: invokedynamic f (IJ)I bsm=com/zelix/f5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 079: pop
      // 07a: goto 087
      // 07d: ldc2_w 7747580451151728545
      // 080: lload 2
      // 081: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: bipush 0
      // 088: istore 9
      // 08a: iload 9
      // 08c: iload 8
      // 08e: if_icmpge 114
      // 091: aload 0
      // 092: getfield com/zelix/f5.O [Lcom/zelix/_za;
      // 095: iload 9
      // 097: aaload
      // 098: checkcast com/zelix/_ui
      // 09b: astore 10
      // 09d: aload 7
      // 09f: aload 10
      // 0a1: lload 4
      // 0a3: bipush 1
      // 0a4: anewarray 126
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w 8351791356079598898
      // 0b3: lload 2
      // 0b4: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bc: pop
      // 0bd: aload 6
      // 0bf: lload 2
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: iflt 111
      // 0c5: ifnonnull 10f
      // 0c8: iload 9
      // 0ca: iload 8
      // 0cc: bipush 1
      // 0cd: isub
      // 0ce: lload 2
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: iflt 13c
      // 0d4: aload 6
      // 0d6: ifnonnull 13c
      // 0d9: goto 0e6
      // 0dc: ldc2_w 7747580451151728545
      // 0df: lload 2
      // 0e0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: if_icmpge 10c
      // 0e9: goto 0f6
      // 0ec: ldc2_w 7747580451151728545
      // 0ef: lload 2
      // 0f0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 7
      // 0f8: getstatic com/zelix/f5.e Ljava/lang/String;
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: pop
      // 0ff: goto 10c
      // 102: ldc2_w 7747580451151728545
      // 105: lload 2
      // 106: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: iinc 9 1
      // 10f: aload 6
      // 111: ifnull 08a
      // 114: aload 0
      // 115: lload 2
      // 116: lconst_0
      // 117: lcmp
      // 118: iflt 098
      // 11b: ldc2_w 7923972093090416390
      // 11e: lload 2
      // 11f: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: aload 6
      // 126: ifnonnull 13b
      // 129: ifne 13f
      // 12c: goto 139
      // 12f: ldc2_w 7747580451151728545
      // 132: lload 2
      // 133: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: iload 8
      // 13b: bipush 1
      // 13c: if_icmple 15f
      // 13f: aload 7
      // 141: sipush 12022
      // 144: ldc2_w 1283793763681413142
      // 147: lload 2
      // 148: lxor
      // 149: invokedynamic f (IJ)I bsm=com/zelix/f5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 151: pop
      // 152: goto 15f
      // 155: ldc2_w 7747580451151728545
      // 158: lload 2
      // 159: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: new java/lang/StringBuilder
      // 162: dup
      // 163: invokespecial java/lang/StringBuilder.<init> ()V
      // 166: aload 0
      // 167: ldc2_w 7923972093090416390
      // 16a: lload 2
      // 16b: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: ifeq 182
      // 173: ldc "!"
      // 175: goto 184
      // 178: ldc2_w 7747580451151728545
      // 17b: lload 2
      // 17c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: ldc ""
      // 184: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 187: aload 7
      // 189: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 18f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 192: areturn
   }

   public f5(short var1, short var2, int var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 42849568358519L;
      super(var7, var3);
      x44.a<"s">(this, false, -2632201100123573879L, var5);
   }

   static {
      long var11 = a ^ 127598700889494L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("AªR\u0098õs\u0014\u008d".getBytes("ISO-8859-1"));
      String var19 = b(var15).intern();
      int var10001 = -1;
      e = var19;
      h = new HashMap(13);
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
      String var4 = "ù\u008d\u0084ô{\u0093¶ÖZ±Ã\u0096E\bÝ¢";
      int var5 = "ù\u008d\u0084ô{\u0093¶ÖZ±Ã\u0096E\bÝ¢".length();
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

      f = var6;
      g = new Integer[2];
   }

   private static gj b(gj var0) {
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30836;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/f5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("com/zelix/f5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
