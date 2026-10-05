package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ht extends hq {
   final int I;
   final ie J;
   private static final long a = ess.a(-4443165102406251000L, 3951829719890904905L, MethodHandles.lookup().lookupClass()).a(179876404202315L);
   private static final long b;

   protected void W(DataOutputStream var1, wp var2, Map var3, long var4) {
      long var10001 = var4 ^ 129981310600266L;
      int var6 = (int)((var4 ^ 129981310600266L) >>> 32);
      int var7 = (int)((var4 ^ 129981310600266L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      var1.writeByte(this.I);
      this.J.b(var1, var6, (char)var7, var8, var3);
   }

   public int z(long var1) {
      long var10001 = var1 ^ 116660075572968L;
      int var3 = (int)((var1 ^ 116660075572968L) >>> 32);
      int var4 = (int)((var1 ^ 116660075572968L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      byte var6 = 1;
      return var6 + this.J.E(var3, (short)var4, (char)var5);
   }

   ht(long param1, int param3, h8 param4, _xx param5, _y4 param6, _y4 param7, PrintWriter param8, wp param9, Map param10, Map param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ht.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 137584005933533
      // 00b: lxor
      // 00c: lstore 12
      // 00e: dup2
      // 00f: ldc2_w 35221952177329
      // 012: lxor
      // 013: lstore 14
      // 015: dup2
      // 016: ldc2_w 26082417332885
      // 019: lxor
      // 01a: lstore 16
      // 01c: dup2
      // 01d: ldc2_w 102525557587859
      // 020: lxor
      // 021: dup2
      // 022: bipush 32
      // 024: lushr
      // 025: l2i
      // 026: istore 18
      // 028: dup2
      // 029: bipush 32
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 19
      // 032: dup2
      // 033: bipush 48
      // 035: lshl
      // 036: bipush 48
      // 038: lushr
      // 039: l2i
      // 03a: istore 20
      // 03c: pop2
      // 03d: dup2
      // 03e: ldc2_w 21600501659388
      // 041: lxor
      // 042: lstore 21
      // 044: pop2
      // 045: ldc2_w -4248874832118614686
      // 048: lload 1
      // 049: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: aload 0
      // 04f: aload 4
      // 051: invokespecial com/zelix/hq.<init> (Lcom/zelix/h8;)V
      // 054: aload 0
      // 055: iload 3
      // 056: putfield com/zelix/ht.I I
      // 059: iload 18
      // 05b: iload 19
      // 05d: i2s
      // 05e: iload 20
      // 060: invokestatic com/zelix/_uo.f (ISI)Lcom/zelix/_uo;
      // 063: astore 25
      // 065: aload 0
      // 066: getfield com/zelix/ht.I I
      // 069: getstatic com/zelix/ht.b J
      // 06c: l2i
      // 06d: isub
      // 06e: istore 24
      // 070: aload 0
      // 071: aload 4
      // 073: checkcast com/zelix/h6
      // 076: aload 5
      // 078: aload 6
      // 07a: aload 7
      // 07c: aload 8
      // 07e: aload 10
      // 080: aload 11
      // 082: aload 25
      // 084: lload 14
      // 086: bipush 9
      // 088: anewarray 98
      // 08b: dup_x2
      // 08c: dup_x2
      // 08d: pop
      // 08e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 091: bipush 8
      // 093: swap
      // 094: aastore
      // 095: dup_x1
      // 096: swap
      // 097: bipush 7
      // 099: swap
      // 09a: aastore
      // 09b: dup_x1
      // 09c: swap
      // 09d: bipush 6
      // 09f: swap
      // 0a0: aastore
      // 0a1: dup_x1
      // 0a2: swap
      // 0a3: bipush 5
      // 0a4: swap
      // 0a5: aastore
      // 0a6: dup_x1
      // 0a7: swap
      // 0a8: bipush 4
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 3
      // 0ae: swap
      // 0af: aastore
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: bipush 2
      // 0b3: swap
      // 0b4: aastore
      // 0b5: dup_x1
      // 0b6: swap
      // 0b7: bipush 1
      // 0b8: swap
      // 0b9: aastore
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: bipush 0
      // 0bd: swap
      // 0be: aastore
      // 0bf: ldc2_w -4348257221582036270
      // 0c2: lload 1
      // 0c3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/ie; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: putfield com/zelix/ht.J Lcom/zelix/ie;
      // 0cb: istore 23
      // 0cd: aload 0
      // 0ce: getfield com/zelix/ht.J Lcom/zelix/ie;
      // 0d1: bipush 0
      // 0d2: anewarray 98
      // 0d5: ldc2_w -4451721454075588244
      // 0d8: lload 1
      // 0d9: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: iload 23
      // 0e0: ifeq 10c
      // 0e3: ifne 105
      // 0e6: goto 0f3
      // 0e9: ldc2_w -2339565026904545855
      // 0ec: lload 1
      // 0ed: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: bipush 0
      // 0f5: putfield com/zelix/ht.P Z
      // 0f8: goto 105
      // 0fb: ldc2_w -2339565026904545855
      // 0fe: lload 1
      // 0ff: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 104: athrow
      // 105: aload 9
      // 107: lload 21
      // 109: invokevirtual com/zelix/wp.C (J)I
      // 10c: istore 26
      // 10e: iload 23
      // 110: lload 1
      // 111: lconst_0
      // 112: lcmp
      // 113: iflt 147
      // 116: ifeq 13f
      // 119: iload 26
      // 11b: bipush -1
      // 11c: if_icmpne 14a
      // 11f: goto 12c
      // 122: ldc2_w -2339565026904545855
      // 125: lload 1
      // 126: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: aload 0
      // 12d: iload 24
      // 12f: putfield com/zelix/ht.c I
      // 132: goto 13f
      // 135: ldc2_w -2339565026904545855
      // 138: lload 1
      // 139: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: lload 1
      // 140: lconst_0
      // 141: lcmp
      // 142: ifle 17e
      // 145: iload 23
      // 147: ifne 162
      // 14a: aload 0
      // 14b: iload 26
      // 14d: bipush 1
      // 14e: iadd
      // 14f: iload 24
      // 151: iadd
      // 152: putfield com/zelix/ht.c I
      // 155: goto 162
      // 158: ldc2_w -2339565026904545855
      // 15b: lload 1
      // 15c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: aload 9
      // 164: aload 0
      // 165: getfield com/zelix/ht.c I
      // 168: invokevirtual com/zelix/wp.V (I)V
      // 16b: aload 6
      // 16d: aload 25
      // 16f: aload 0
      // 170: getfield com/zelix/ht.c I
      // 173: lload 12
      // 175: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 178: aload 0
      // 179: lload 16
      // 17b: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 17e: return
   }

   public int I(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.I;
   }

   final void N(long var1, _8l var3) {
      long var4 = var1 ^ 0L;
      this.J.N(var4, var3);
   }

   public ht(h6 var1, int var2, _op var3, ie var4) {
      super(var1);
      this.W = var3;
      this.I = var2;
      this.J = var4;
   }

   static {
      long var0 = a ^ 121556782493599L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -4609972508161213747L;
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
