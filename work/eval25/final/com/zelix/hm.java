package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hm extends hq {
   private final int x;
   private final ie H;
   private static final long a = ess.a(-4611321734681940774L, -4616449676633867364L, MethodHandles.lookup().lookupClass()).a(160452932684413L);
   private static final long b;

   protected void W(DataOutputStream var1, wp var2, Map var3, long var4) {
      long var6 = var4 ^ 128704502481930L;
      long var10001 = var4 ^ 129981310600266L;
      int var8 = (int)((var4 ^ 129981310600266L) >>> 32);
      int var9 = (int)((var4 ^ 129981310600266L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      var1.writeByte(x44.a<"i">(this, new Object[]{var6}, -8794966908950972311L, var4));
      var1.writeShort(x44.a<"m">(this, -8748363110965126125L, var4));
      x44.a<"m">(this, -7164398446574227907L, var4).b(var1, var8, (char)var9, var10, var3);
   }

   public hm(h6 var1, int var2, _op var3, ie var4) {
      super(var1);
      this.W = var3;
      this.x = var2;
      this.H = var4;
   }

   final void N(long var1, _8l var3) {
      long var4 = var1 ^ 0L;
      x44.a<"k">(this, -6774351422834863277L, var1).N(var4, var3);
   }

   hm(int param1, h8 param2, _xx param3, _y4 param4, _y4 param5, PrintWriter param6, wp param7, Map param8, long param9, Map param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hm.a J
      // 003: lload 9
      // 005: lxor
      // 006: lstore 9
      // 008: lload 9
      // 00a: dup2
      // 00b: ldc2_w 68882031324130
      // 00e: lxor
      // 00f: lstore 12
      // 011: dup2
      // 012: ldc2_w 109455685215886
      // 015: lxor
      // 016: lstore 14
      // 018: dup2
      // 019: ldc2_w 92620264476842
      // 01c: lxor
      // 01d: lstore 16
      // 01f: dup2
      // 020: ldc2_w 33788704751020
      // 023: lxor
      // 024: dup2
      // 025: bipush 32
      // 027: lushr
      // 028: l2i
      // 029: istore 18
      // 02b: dup2
      // 02c: bipush 32
      // 02e: lshl
      // 02f: bipush 48
      // 031: lushr
      // 032: l2i
      // 033: istore 19
      // 035: dup2
      // 036: bipush 48
      // 038: lshl
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 20
      // 03f: pop2
      // 040: dup2
      // 041: ldc2_w 88104257238211
      // 044: lxor
      // 045: lstore 21
      // 047: pop2
      // 048: aload 0
      // 049: aload 2
      // 04a: invokespecial com/zelix/hq.<init> (Lcom/zelix/h8;)V
      // 04d: iload 18
      // 04f: iload 19
      // 051: i2s
      // 052: iload 20
      // 054: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 057: astore 24
      // 059: ldc2_w 1891750624834825732
      // 05c: lload 9
      // 05e: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aload 0
      // 064: aload 3
      // 065: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 068: putfield com/zelix/hm.x I
      // 06b: aload 0
      // 06c: aload 2
      // 06d: checkcast com/zelix/h6
      // 070: aload 3
      // 071: aload 4
      // 073: aload 5
      // 075: aload 6
      // 077: aload 8
      // 079: aload 11
      // 07b: aload 24
      // 07d: lload 14
      // 07f: bipush 9
      // 081: anewarray 21
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 8
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x1
      // 08f: swap
      // 090: bipush 7
      // 092: swap
      // 093: aastore
      // 094: dup_x1
      // 095: swap
      // 096: bipush 6
      // 098: swap
      // 099: aastore
      // 09a: dup_x1
      // 09b: swap
      // 09c: bipush 5
      // 09d: swap
      // 09e: aastore
      // 09f: dup_x1
      // 0a0: swap
      // 0a1: bipush 4
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x1
      // 0a5: swap
      // 0a6: bipush 3
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x1
      // 0aa: swap
      // 0ab: bipush 2
      // 0ac: swap
      // 0ad: aastore
      // 0ae: dup_x1
      // 0af: swap
      // 0b0: bipush 1
      // 0b1: swap
      // 0b2: aastore
      // 0b3: dup_x1
      // 0b4: swap
      // 0b5: bipush 0
      // 0b6: swap
      // 0b7: aastore
      // 0b8: ldc2_w 115018383704826093
      // 0bb: lload 9
      // 0bd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: putfield com/zelix/hm.H Lcom/zelix/ie;
      // 0c5: istore 23
      // 0c7: aload 0
      // 0c8: ldc2_w 84959094967546754
      // 0cb: lload 9
      // 0cd: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: bipush 0
      // 0d3: anewarray 21
      // 0d6: ldc2_w 1985066877588307
      // 0d9: lload 9
      // 0db: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: iload 23
      // 0e2: ifne 110
      // 0e5: ifne 109
      // 0e8: goto 0f6
      // 0eb: ldc2_w 155976541057935166
      // 0ee: lload 9
      // 0f0: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: bipush 0
      // 0f8: putfield com/zelix/hm.P Z
      // 0fb: goto 109
      // 0fe: ldc2_w 155976541057935166
      // 101: lload 9
      // 103: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: aload 7
      // 10b: lload 21
      // 10d: invokevirtual com/zelix/wp.C (J)I
      // 110: istore 25
      // 112: iload 23
      // 114: lload 9
      // 116: lconst_0
      // 117: lcmp
      // 118: ifle 158
      // 11b: ifne 14f
      // 11e: iload 25
      // 120: bipush -1
      // 121: if_icmpne 15b
      // 124: goto 132
      // 127: ldc2_w 155976541057935166
      // 12a: lload 9
      // 12c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 0
      // 133: aload 0
      // 134: ldc2_w 1957014507799003564
      // 137: lload 9
      // 139: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: putfield com/zelix/hm.c I
      // 141: goto 14f
      // 144: ldc2_w 155976541057935166
      // 147: lload 9
      // 149: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: lload 9
      // 151: lconst_0
      // 152: lcmp
      // 153: iflt 199
      // 156: iload 23
      // 158: ifeq 17d
      // 15b: aload 0
      // 15c: iload 25
      // 15e: bipush 1
      // 15f: iadd
      // 160: aload 0
      // 161: ldc2_w 1957014507799003564
      // 164: lload 9
      // 166: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: iadd
      // 16c: putfield com/zelix/hm.c I
      // 16f: goto 17d
      // 172: ldc2_w 155976541057935166
      // 175: lload 9
      // 177: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 7
      // 17f: aload 0
      // 180: getfield com/zelix/hm.c I
      // 183: invokevirtual com/zelix/wp.V (I)V
      // 186: aload 4
      // 188: aload 24
      // 18a: aload 0
      // 18b: getfield com/zelix/hm.c I
      // 18e: lload 12
      // 190: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 193: aload 0
      // 194: lload 16
      // 196: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 199: return
   }

   public int I(Object[] var1) {
      long var2 = (Long)var1[0];
      return (int)b;
   }

   public int z(long var1) {
      long var10001 = var1 ^ 116660075572968L;
      int var3 = (int)((var1 ^ 116660075572968L) >>> 32);
      int var4 = (int)((var1 ^ 116660075572968L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = 1;
      var6 += 2;
      return var6 + x44.a<"o">(this, -328605007050356257L, var1).E(var3, (short)var4, (char)var5);
   }

   static {
      long var0 = a ^ 112313091052557L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = 562160883218275385L;
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
