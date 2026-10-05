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

public class cp extends jf implements rh {
   boolean F;
   private static final long a = ess.a(-1356893598550902821L, -8128305261105781036L, MethodHandles.lookup().lookupClass()).a(174443611922152L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e;

   public boolean H(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast com/zelix/hz
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/we
      // 19: astore 2
      // 1a: pop
      // 1b: lload 3
      // 1c: dup2
      // 1d: ldc2_w 0
      // 20: lxor
      // 21: lstore 6
      // 23: pop2
      // 24: ldc2_w 811819383434717946
      // 27: lload 3
      // 28: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: aload 0
      // 2e: getfield com/zelix/cp.O [Lcom/zelix/_za;
      // 31: arraylength
      // 32: istore 9
      // 34: astore 8
      // 36: bipush 0
      // 37: istore 10
      // 39: iload 10
      // 3b: iload 9
      // 3d: if_icmpge b4
      // 40: aload 0
      // 41: getfield com/zelix/cp.O [Lcom/zelix/_za;
      // 44: iload 10
      // 46: aaload
      // 47: checkcast com/zelix/rh
      // 4a: astore 11
      // 4c: aload 8
      // 4e: lload 3
      // 4f: lconst_0
      // 50: lcmp
      // 51: iflt b1
      // 54: ifnonnull af
      // 57: aload 11
      // 59: lload 6
      // 5b: aload 5
      // 5d: aload 2
      // 5e: bipush 3
      // 5f: anewarray 50
      // 62: dup_x1
      // 63: swap
      // 64: bipush 2
      // 65: swap
      // 66: aastore
      // 67: dup_x1
      // 68: swap
      // 69: bipush 1
      // 6a: swap
      // 6b: aastore
      // 6c: dup_x2
      // 6d: dup_x2
      // 6e: pop
      // 6f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 72: bipush 0
      // 73: swap
      // 74: aastore
      // 75: ldc2_w 1452899722489641893
      // 78: lload 3
      // 79: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: aload 8
      // 80: ifnonnull b5
      // 83: goto 90
      // 86: ldc2_w 1721268492742026144
      // 89: lload 3
      // 8a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: ifne ac
      // 93: goto a0
      // 96: ldc2_w 1721268492742026144
      // 99: lload 3
      // 9a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: athrow
      // a0: bipush 0
      // a1: ireturn
      // a2: ldc2_w 1721268492742026144
      // a5: lload 3
      // a6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ab: athrow
      // ac: iinc 10 1
      // af: aload 8
      // b1: ifnull 39
      // b4: bipush 1
      // b5: ireturn
   }

   public void t(Object[] var1) {
      long var4 = (Long)var1[0];
      _za var3 = (_za)var1[1];
      _ur var2 = (_ur)var1[2];
      long var6 = var4 ^ 0L;
      long var8 = var4 ^ 134528422017690L;
      int var11 = x44.a<"i">(this, new Object[]{var8}, 7145691849331111744L, var4);
      int[] var10000 = x44.a<"q">(9148277501292601163L, var4);
      int var12 = 0;
      int[] var10 = var10000;

      while (var12 < var11) {
         _za var13 = this.e(var12);
         x44.a<"i">(var13, new Object[]{var6, this, var2}, 8818198965911889370L, var4);
         var12++;
         if (var10 != null) {
            break;
         }
      }
   }

   public cp(long var1, int var3) {
      var1 = a ^ var1;
      long var4 = var1 ^ 12709387790673L;
      super(var4, var3);
      x44.a<"u">(this, false, -5461953076449540362L, var1);
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
      // 015: ldc2_w 8596022076981270261
      // 018: lload 2
      // 019: invokedynamic w (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: new java/lang/StringBuffer
      // 021: dup
      // 022: invokespecial java/lang/StringBuffer.<init> ()V
      // 025: astore 7
      // 027: astore 6
      // 029: aload 0
      // 02a: getfield com/zelix/cp.O [Lcom/zelix/_za;
      // 02d: arraylength
      // 02e: istore 8
      // 030: aload 0
      // 031: ldc2_w 7753512195574946143
      // 034: lload 2
      // 035: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: aload 6
      // 03c: ifnonnull 051
      // 03f: ifne 067
      // 042: goto 04f
      // 045: ldc2_w 7776645046021955503
      // 048: lload 2
      // 049: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: iload 8
      // 051: aload 6
      // 053: ifnonnull 08e
      // 056: bipush 1
      // 057: if_icmple 08d
      // 05a: goto 067
      // 05d: ldc2_w 7776645046021955503
      // 060: lload 2
      // 061: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: aload 7
      // 069: sipush 6168
      // 06c: ldc2_w 4181100025624787870
      // 06f: lload 2
      // 070: lxor
      // 071: invokedynamic x (IJ)I bsm=com/zelix/cp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: ldc2_w 8282291127836383600
      // 079: lload 2
      // 07a: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: pop
      // 080: goto 08d
      // 083: ldc2_w 7776645046021955503
      // 086: lload 2
      // 087: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: bipush 0
      // 08e: istore 9
      // 090: iload 9
      // 092: iload 8
      // 094: if_icmpge 11a
      // 097: aload 0
      // 098: getfield com/zelix/cp.O [Lcom/zelix/_za;
      // 09b: iload 9
      // 09d: aaload
      // 09e: checkcast com/zelix/_ui
      // 0a1: astore 10
      // 0a3: aload 7
      // 0a5: aload 10
      // 0a7: lload 4
      // 0a9: bipush 1
      // 0aa: anewarray 50
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 0
      // 0b4: swap
      // 0b5: aastore
      // 0b6: ldc2_w 8351791356079598898
      // 0b9: lload 2
      // 0ba: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0c2: pop
      // 0c3: aload 6
      // 0c5: lload 2
      // 0c6: lconst_0
      // 0c7: lcmp
      // 0c8: iflt 117
      // 0cb: ifnonnull 115
      // 0ce: iload 9
      // 0d0: iload 8
      // 0d2: bipush 1
      // 0d3: isub
      // 0d4: lload 2
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 142
      // 0da: aload 6
      // 0dc: ifnonnull 142
      // 0df: goto 0ec
      // 0e2: ldc2_w 7776645046021955503
      // 0e5: lload 2
      // 0e6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: if_icmpge 112
      // 0ef: goto 0fc
      // 0f2: ldc2_w 7776645046021955503
      // 0f5: lload 2
      // 0f6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 7
      // 0fe: getstatic com/zelix/cp.b Ljava/lang/String;
      // 101: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 104: pop
      // 105: goto 112
      // 108: ldc2_w 7776645046021955503
      // 10b: lload 2
      // 10c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: iinc 9 1
      // 115: aload 6
      // 117: ifnull 090
      // 11a: aload 0
      // 11b: lload 2
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: iflt 0a1
      // 121: ldc2_w 7753512195574946143
      // 124: lload 2
      // 125: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: aload 6
      // 12c: ifnonnull 141
      // 12f: ifne 145
      // 132: goto 13f
      // 135: ldc2_w 7776645046021955503
      // 138: lload 2
      // 139: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: iload 8
      // 141: bipush 1
      // 142: if_icmple 16b
      // 145: aload 7
      // 147: sipush 1795
      // 14a: ldc2_w 3204033902446175364
      // 14d: lload 2
      // 14e: lxor
      // 14f: invokedynamic x (IJ)I bsm=com/zelix/cp.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: ldc2_w 8282291127836383600
      // 157: lload 2
      // 158: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: pop
      // 15e: goto 16b
      // 161: ldc2_w 7776645046021955503
      // 164: lload 2
      // 165: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: new java/lang/StringBuilder
      // 16e: dup
      // 16f: invokespecial java/lang/StringBuilder.<init> ()V
      // 172: aload 0
      // 173: ldc2_w 7753512195574946143
      // 176: lload 2
      // 177: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: ifeq 18e
      // 17f: ldc "!"
      // 181: goto 190
      // 184: ldc2_w 7776645046021955503
      // 187: lload 2
      // 188: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: ldc ""
      // 190: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 193: aload 7
      // 195: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 198: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19e: areturn
   }

   static {
      long var11 = a ^ 19871140812849L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("ãÿgßËºÁó".getBytes("ISO-8859-1"));
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
      String var4 = "M¿líeÆfÉ'\u0014 Å\u0089½ôâ";
      int var5 = "M¿líeÆfÉ'\u0014 Å\u0089½ôâ".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7442;
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
            throw new RuntimeException("com/zelix/cp", var14);
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
         throw new RuntimeException("com/zelix/cp" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
