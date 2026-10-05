package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hx extends hq {
   private final int N;
   private final int i;
   private final ie[] n;
   private static final long a = ess.a(2824114280799271169L, -2029060309648883973L, MethodHandles.lookup().lookupClass()).a(77110469349613L);
   private static final long b;

   public int z(long var1) {
      long var10001 = var1 ^ 116660075572968L;
      int var3 = (int)((var1 ^ 116660075572968L) >>> 32);
      int var4 = (int)((var1 ^ 116660075572968L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var7 = 1;
      int var10000 = x44.a<"s">(-2297535580721589159L, var1);
      var7 += 2;
      byte var6 = (byte)var10000;
      ie[] var8 = x44.a<"o">(this, -2289032412737914827L, var1);
      int var9 = var8.length;
      int var10 = 0;

      while (true) {
         if (var10 < var9) {
            ie var11 = var8[var10];
            var10000 = var7 + var11.E(var3, (short)var4, (char)var5);
            if (var1 >= 0L) {
               if (var6 != 0) {
                  break;
               }

               var7 = var10000;
               var10++;
               var10000 = var6;
            }

            if (var10000 == 0) {
               continue;
            }
         }

         var10000 = var7;
         break;
      }

      return var10000;
   }

   protected void W(DataOutputStream var1, wp var2, Map var3, long var4) {
      long var10001 = var4 ^ 129981310600266L;
      int var6 = (int)((var4 ^ 129981310600266L) >>> 32);
      int var7 = (int)((var4 ^ 129981310600266L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      var1.writeByte(x44.a<"m">(this, -9027877043502483549L, var4));
      boolean var10000 = x44.a<"q">(-8646914166113127493L, var4);
      var1.writeShort(x44.a<"m">(this, -7214990079326266587L, var4));
      ie[] var10 = x44.a<"m">(this, -8657669133838917673L, var4);
      int var11 = var10.length;
      int var12 = 0;
      boolean var9 = var10000;

      while (var12 < var11) {
         ie var13 = var10[var12];
         var13.b(var1, var6, (char)var7, var8, var3);
         var12++;
         if (var9) {
            break;
         }
      }
   }

   public int I(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"o">(this, 5097226674480067497L, var2);
   }

   final void N(long var1, _8l var3) {
      long var4 = var1 ^ 0L;
      boolean var10000 = x44.a<"w">(-6348162585463318644L, var1);
      ie[] var7 = x44.a<"k">(this, -4992348915404905799L, var1);
      boolean var6 = var10000;

      for (ie var10 : var7) {
         var10.N(var4, var3);
         if (!var6) {
            break;
         }
      }
   }

   hx(int param1, int param2, h8 param3, _xx param4, _y4 param5, _y4 param6, PrintWriter param7, wp param8, Map param9, int param10, char param11, Map param12) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 2
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 10
      // 007: i2l
      // 008: bipush 48
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 11
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/hx.a J
      // 01c: lxor
      // 01d: lstore 13
      // 01f: lload 13
      // 021: dup2
      // 022: ldc2_w 69391465975488
      // 025: lxor
      // 026: lstore 15
      // 028: dup2
      // 029: ldc2_w 107980033901484
      // 02c: lxor
      // 02d: lstore 17
      // 02f: dup2
      // 030: ldc2_w 94031754999176
      // 033: lxor
      // 034: lstore 19
      // 036: dup2
      // 037: ldc2_w 34096253393038
      // 03a: lxor
      // 03b: dup2
      // 03c: bipush 32
      // 03e: lushr
      // 03f: l2i
      // 040: istore 21
      // 042: dup2
      // 043: bipush 32
      // 045: lshl
      // 046: bipush 48
      // 048: lushr
      // 049: l2i
      // 04a: istore 22
      // 04c: dup2
      // 04d: bipush 48
      // 04f: lshl
      // 050: bipush 48
      // 052: lushr
      // 053: l2i
      // 054: istore 23
      // 056: pop2
      // 057: dup2
      // 058: ldc2_w 89717342769633
      // 05b: lxor
      // 05c: lstore 24
      // 05e: pop2
      // 05f: aload 0
      // 060: aload 3
      // 061: invokespecial com/zelix/hq.<init> (Lcom/zelix/h8;)V
      // 064: ldc2_w 4567451094494153510
      // 067: lload 13
      // 069: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: aload 0
      // 06f: iload 1
      // 070: putfield com/zelix/hx.N I
      // 073: iload 21
      // 075: iload 22
      // 077: i2s
      // 078: iload 23
      // 07a: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 07d: astore 27
      // 07f: aload 0
      // 080: aload 4
      // 082: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 085: putfield com/zelix/hx.i I
      // 088: aload 0
      // 089: ldc2_w 4191633380877717310
      // 08c: lload 13
      // 08e: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: getstatic com/zelix/hx.b J
      // 096: l2i
      // 097: isub
      // 098: istore 28
      // 09a: istore 26
      // 09c: aload 0
      // 09d: iload 28
      // 09f: anewarray 15
      // 0a2: putfield com/zelix/hx.n [Lcom/zelix/ie;
      // 0a5: bipush 0
      // 0a6: istore 29
      // 0a8: iload 29
      // 0aa: iload 28
      // 0ac: if_icmpge 17e
      // 0af: aload 0
      // 0b0: ldc2_w 4559017453545940810
      // 0b3: lload 13
      // 0b5: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: iload 29
      // 0bc: aload 3
      // 0bd: checkcast com/zelix/h6
      // 0c0: aload 4
      // 0c2: aload 5
      // 0c4: aload 6
      // 0c6: aload 7
      // 0c8: aload 9
      // 0ca: aload 12
      // 0cc: aload 27
      // 0ce: lload 17
      // 0d0: bipush 9
      // 0d2: anewarray 190
      // 0d5: dup_x2
      // 0d6: dup_x2
      // 0d7: pop
      // 0d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0db: bipush 8
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: bipush 7
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 6
      // 0e9: swap
      // 0ea: aastore
      // 0eb: dup_x1
      // 0ec: swap
      // 0ed: bipush 5
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 4
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x1
      // 0f6: swap
      // 0f7: bipush 3
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 2
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: bipush 1
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: bipush 0
      // 107: swap
      // 108: aastore
      // 109: ldc2_w 2646604915143706063
      // 10c: lload 13
      // 10e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: aastore
      // 114: iload 26
      // 116: iload 10
      // 118: ifle 17b
      // 11b: ifne 179
      // 11e: aload 0
      // 11f: ldc2_w 4559017453545940810
      // 122: lload 13
      // 124: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: iload 29
      // 12b: aaload
      // 12c: bipush 0
      // 12d: anewarray 190
      // 130: ldc2_w 2676559648730134129
      // 133: lload 13
      // 135: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: iload 26
      // 13c: iload 11
      // 13e: iflt 1a6
      // 141: ifne 1a5
      // 144: goto 152
      // 147: ldc2_w 2536112208953543009
      // 14a: lload 13
      // 14c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: ifne 176
      // 155: goto 163
      // 158: ldc2_w 2536112208953543009
      // 15b: lload 13
      // 15d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: athrow
      // 163: aload 0
      // 164: bipush 0
      // 165: putfield com/zelix/hx.P Z
      // 168: goto 176
      // 16b: ldc2_w 2536112208953543009
      // 16e: lload 13
      // 170: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: iinc 29 1
      // 179: iload 26
      // 17b: ifeq 0a8
      // 17e: aload 8
      // 180: lload 24
      // 182: invokevirtual com/zelix/wp.C (J)I
      // 185: istore 29
      // 187: iload 26
      // 189: iload 11
      // 18b: iflt 116
      // 18e: iload 2
      // 18f: iflt 1cc
      // 192: ifne 1c6
      // 195: iload 29
      // 197: goto 1a5
      // 19a: ldc2_w 2536112208953543009
      // 19d: lload 13
      // 19f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: bipush -1
      // 1a6: if_icmpne 1cf
      // 1a9: aload 0
      // 1aa: aload 0
      // 1ab: ldc2_w 2540612162100519864
      // 1ae: lload 13
      // 1b0: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: putfield com/zelix/hx.c I
      // 1b8: goto 1c6
      // 1bb: ldc2_w 2536112208953543009
      // 1be: lload 13
      // 1c0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c5: athrow
      // 1c6: iload 2
      // 1c7: ifle 20d
      // 1ca: iload 26
      // 1cc: ifeq 1f1
      // 1cf: aload 0
      // 1d0: iload 29
      // 1d2: bipush 1
      // 1d3: iadd
      // 1d4: aload 0
      // 1d5: ldc2_w 2540612162100519864
      // 1d8: lload 13
      // 1da: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: iadd
      // 1e0: putfield com/zelix/hx.c I
      // 1e3: goto 1f1
      // 1e6: ldc2_w 2536112208953543009
      // 1e9: lload 13
      // 1eb: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: aload 8
      // 1f3: aload 0
      // 1f4: getfield com/zelix/hx.c I
      // 1f7: invokevirtual com/zelix/wp.V (I)V
      // 1fa: aload 5
      // 1fc: aload 27
      // 1fe: aload 0
      // 1ff: getfield com/zelix/hx.c I
      // 202: lload 15
      // 204: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 207: aload 0
      // 208: lload 19
      // 20a: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 20d: return
   }

   public ie[] z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return (ie[])x44.a<"n">(this, -3088681449325032148L, var2).clone();
   }

   public hx(h6 var1, int var2, int var3, _op var4, ie[] var5) {
      super(var1);
      this.N = var2;
      this.W = var4;
      this.i = var3;
      this.n = var5;
   }

   static {
      long var0 = a ^ 135329305392194L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 6808617400717179910L;
      byte[] var6 = var2.doFinal(
         new byte[]{
            (byte)((int)(var4 >>> 56)),
            (byte)((int)(var4 >>> 48)),
            (byte)((int)(var4 >>> 40)),
            (byte)((int)(var4 >>> 32)),
            (byte)((int)(var4 >>> 24)),
            (byte)((int)(var4 >>> 16)),
            (byte)((int)(var4 >>> 8)),
            (byte)((int)var4)
         }
      );
      long var7 = ((long)var6[0] & 255L) << 56
         | ((long)var6[1] & 255L) << 48
         | ((long)var6[2] & 255L) << 40
         | ((long)var6[3] & 255L) << 32
         | ((long)var6[4] & 255L) << 24
         | ((long)var6[5] & 255L) << 16
         | ((long)var6[6] & 255L) << 8
         | (long)var6[7] & 255L;
      byte var10001 = -1;
      b = var7;
   }

   private static gj a(gj var0) {
      return var0;
   }
}
