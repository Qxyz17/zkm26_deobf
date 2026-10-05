package com.zelix;

import java.io.DataOutputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _o5 extends _og implements l4 {
   int p = -1;
   _op G;
   private static final long b = ess.a(3322067376743178337L, -8856587773081172121L, MethodHandles.lookup().lookupClass()).a(190751312484571L);
   private static final String[] g;
   private static final String[] k;
   private static final Map l = new HashMap(13);
   private static final long[] m;
   private static final Integer[] n;
   private static final Map o;

   public void k(Object[] param1) {
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
      // 004: checkcast java/io/PrintWriter
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/StringBuilder
      // 019: astore 5
      // 01b: pop
      // 01c: lload 2
      // 01d: dup2
      // 01e: ldc2_w 104031253466172
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 32198005677074
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 43317403178689
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 72462291038852
      // 036: lxor
      // 037: lstore 12
      // 039: pop2
      // 03a: ldc2_w 8216154267410362304
      // 03d: lload 2
      // 03e: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: new java/lang/StringBuilder
      // 046: dup
      // 047: sipush 23571
      // 04a: ldc2_w 4720444266802572210
      // 04d: lload 2
      // 04e: lxor
      // 04f: invokedynamic i (IJ)I bsm=com/zelix/_o5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: invokespecial java/lang/StringBuilder.<init> (I)V
      // 057: astore 15
      // 059: aload 0
      // 05a: lload 8
      // 05c: bipush 1
      // 05d: anewarray 114
      // 060: dup_x2
      // 061: dup_x2
      // 062: pop
      // 063: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 066: bipush 0
      // 067: swap
      // 068: aastore
      // 069: ldc2_w 8353405308985101719
      // 06c: lload 2
      // 06d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: astore 16
      // 074: astore 14
      // 076: aload 15
      // 078: new java/lang/StringBuilder
      // 07b: dup
      // 07c: invokespecial java/lang/StringBuilder.<init> ()V
      // 07f: aload 16
      // 081: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 084: ldc " "
      // 086: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 089: aload 0
      // 08a: getfield com/zelix/_o5.G Lcom/zelix/_op;
      // 08d: lload 6
      // 08f: bipush 1
      // 090: anewarray 114
      // 093: dup_x2
      // 094: dup_x2
      // 095: pop
      // 096: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 099: bipush 0
      // 09a: swap
      // 09b: aastore
      // 09c: ldc2_w 8032731987764428496
      // 09f: lload 2
      // 0a0: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ae: pop
      // 0af: aload 0
      // 0b0: getfield com/zelix/_o5.a I
      // 0b3: lload 12
      // 0b5: dup2_x1
      // 0b6: pop2
      // 0b7: bipush 2
      // 0b8: anewarray 114
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c0: bipush 1
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x2
      // 0c4: dup_x2
      // 0c5: pop
      // 0c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c9: bipush 0
      // 0ca: swap
      // 0cb: aastore
      // 0cc: ldc2_w 8570484206580877217
      // 0cf: lload 2
      // 0d0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: astore 17
      // 0d7: aload 17
      // 0d9: aload 0
      // 0da: getfield com/zelix/_o5.G Lcom/zelix/_op;
      // 0dd: lload 6
      // 0df: bipush 1
      // 0e0: anewarray 114
      // 0e3: dup_x2
      // 0e4: dup_x2
      // 0e5: pop
      // 0e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e9: bipush 0
      // 0ea: swap
      // 0eb: aastore
      // 0ec: ldc2_w 8032731987764428496
      // 0ef: lload 2
      // 0f0: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: lload 10
      // 0f7: dup2_x1
      // 0f8: pop2
      // 0f9: bipush 3
      // 0fa: anewarray 114
      // 0fd: dup_x1
      // 0fe: swap
      // 0ff: bipush 2
      // 100: swap
      // 101: aastore
      // 102: dup_x2
      // 103: dup_x2
      // 104: pop
      // 105: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 108: bipush 1
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 0
      // 10e: swap
      // 10f: aastore
      // 110: ldc2_w 7799761149368071863
      // 113: lload 2
      // 114: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: astore 17
      // 11b: aload 14
      // 11d: ifnonnull 180
      // 120: aload 17
      // 122: invokevirtual java/lang/String.length ()I
      // 125: ifle 15c
      // 128: goto 135
      // 12b: ldc2_w 8439848690803364993
      // 12e: lload 2
      // 12f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: aload 15
      // 137: new java/lang/StringBuilder
      // 13a: dup
      // 13b: invokespecial java/lang/StringBuilder.<init> ()V
      // 13e: ldc "\t"
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: aload 17
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14e: pop
      // 14f: goto 15c
      // 152: ldc2_w 8439848690803364993
      // 155: lload 2
      // 156: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: aload 4
      // 15e: new java/lang/StringBuilder
      // 161: dup
      // 162: invokespecial java/lang/StringBuilder.<init> ()V
      // 165: aload 5
      // 167: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16d: aload 5
      // 16f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 175: aload 15
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17d: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 180: return
   }

   public void W(int var1, DataOutputStream var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var3 << 32 >>> 32;
      int var6 = (int)((var4 ^ 0L) >>> 32);
      int var7 = (int)((var4 ^ 0L) << 32 >>> 32);
      long var8 = var4 ^ 75108138643721L;
      super.W(var6, var2, var7);
      this.p(var2, var8);
   }

   int k() {
      return this.G.W() - this.p;
   }

   public final boolean I(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 597631242985
      // 005: lxor
      // 006: lstore 3
      // 007: pop2
      // 008: ldc2_w 2290070615942595074
      // 00b: lload 1
      // 00c: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 011: astore 5
      // 013: aload 0
      // 014: getfield com/zelix/_o5.a I
      // 017: aload 5
      // 019: ifnonnull 136
      // 01c: tableswitch 236 153 201 234 234 234 234 234 234 234 234 234 234 234 234 234 234 222 222 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 236 234 234 222 222
      // 0f0: ldc2_w 1793011522830416195
      // 0f3: lload 1
      // 0f4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: bipush 0
      // 0fb: ireturn
      // 0fc: ldc2_w 1793011522830416195
      // 0ff: lload 1
      // 100: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 1
      // 107: ireturn
      // 108: lload 3
      // 109: bipush 0
      // 10a: bipush 1
      // 10b: anewarray 15
      // 10e: dup
      // 10f: bipush 0
      // 110: new java/lang/StringBuilder
      // 113: dup
      // 114: invokespecial java/lang/StringBuilder.<init> ()V
      // 117: sipush 12984
      // 11a: ldc2_w 8339972264361888711
      // 11d: lload 1
      // 11e: lxor
      // 11f: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 127: aload 0
      // 128: getfield com/zelix/_o5.a I
      // 12b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 12e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 131: aastore
      // 132: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 135: bipush 1
      // 136: ireturn
   }

   public void e(Integer var1, long var2, _op var4) {
      long var5 = var2 ^ 125353107609026L;
      this.G = var4;
      Object[] var10004 = new Object[]{null, var5};
      var10004[0] = true;
      x44.a<"l">(var4, var10004, -7646876929206351648L, var2);
   }

   public int d(long var1) {
      return 3;
   }

   void P(Object[] var1) {
      _op var2 = (_op)var1[0];
      this.G = var2;
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 71039313027844L;
      return x44.a<"j">(this, new Object[]{var4}, 935372178048627329L, var2);
   }

   public _op q() {
      return this.G;
   }

   public wd B(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      return x44.a<"l">(-7119551323723930366L, var4);
   }

   public void o(int var1, long var2) {
      this.p = var1;
   }

   public boolean T() {
      return true;
   }

   public final void m(Object[] var1) {
      long var2 = (Long)var1[0];
      w var4 = (w)var1[1];
      long var5 = var2 ^ 11807521485311L;
      var4.u(var5, this.G, this);
   }

   public final boolean N(int param1, int param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 3
      // 001: dup2
      // 002: ldc2_w 2035671786151
      // 005: lxor
      // 006: lstore 5
      // 008: pop2
      // 009: ldc2_w 8037225787695755852
      // 00c: lload 3
      // 00d: invokedynamic p (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 012: astore 7
      // 014: aload 0
      // 015: getfield com/zelix/_o5.a I
      // 018: aload 7
      // 01a: ifnonnull 15f
      // 01d: tableswitch 275 153 201 233 233 233 233 233 233 233 233 233 233 233 233 233 233 221 221 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 275 233 233 221 221
      // 0f0: ldc2_w 7542420140992383245
      // 0f3: lload 3
      // 0f4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: bipush 0
      // 0fb: ireturn
      // 0fc: ldc2_w 7542420140992383245
      // 0ff: lload 3
      // 100: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: iload 1
      // 107: aload 7
      // 109: ifnonnull 12b
      // 10c: iload 2
      // 10d: if_icmplt 12e
      // 110: goto 11d
      // 113: ldc2_w 7542420140992383245
      // 116: lload 3
      // 117: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: bipush 1
      // 11e: goto 12b
      // 121: ldc2_w 7542420140992383245
      // 124: lload 3
      // 125: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: goto 12f
      // 12e: bipush 0
      // 12f: ireturn
      // 130: lload 5
      // 132: bipush 0
      // 133: bipush 1
      // 134: anewarray 15
      // 137: dup
      // 138: bipush 0
      // 139: new java/lang/StringBuilder
      // 13c: dup
      // 13d: invokespecial java/lang/StringBuilder.<init> ()V
      // 140: sipush 22989
      // 143: ldc2_w 7224999590155981049
      // 146: lload 3
      // 147: lxor
      // 148: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: aload 0
      // 151: getfield com/zelix/_o5.a I
      // 154: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 157: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15a: aastore
      // 15b: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 15e: bipush 0
      // 15f: ireturn
   }

   public boolean e(Object[] param1) {
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
      // 00e: ldc2_w 23626353897618
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w 9060366003407872121
      // 018: lload 2
      // 019: invokedynamic u (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: astore 6
      // 020: aload 0
      // 021: getfield com/zelix/_o5.a I
      // 024: aload 6
      // 026: ifnonnull 143
      // 029: tableswitch 235 153 201 233 233 233 233 233 233 233 233 233 233 233 233 233 233 233 221 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 233 233 233 221
      // 0fc: ldc2_w 8834122437098101560
      // 0ff: lload 2
      // 100: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 1
      // 107: ireturn
      // 108: ldc2_w 8834122437098101560
      // 10b: lload 2
      // 10c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: bipush 0
      // 113: ireturn
      // 114: lload 4
      // 116: bipush 0
      // 117: bipush 1
      // 118: anewarray 15
      // 11b: dup
      // 11c: bipush 0
      // 11d: new java/lang/StringBuilder
      // 120: dup
      // 121: invokespecial java/lang/StringBuilder.<init> ()V
      // 124: sipush 12984
      // 127: ldc2_w 8339995127180290492
      // 12a: lload 2
      // 12b: lxor
      // 12c: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: aload 0
      // 135: getfield com/zelix/_o5.a I
      // 138: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: aastore
      // 13f: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 142: bipush 0
      // 143: ireturn
   }

   public final boolean Y(Object[] param1) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/n
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: invokevirtual java/lang/Integer.intValue ()I
      // 01b: istore 6
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Long
      // 023: invokevirtual java/lang/Long.longValue ()J
      // 026: lstore 4
      // 028: pop
      // 029: lload 4
      // 02b: dup2
      // 02c: ldc2_w 115037905374113
      // 02f: lxor
      // 030: lstore 7
      // 032: pop2
      // 033: ldc2_w 5084457588552424266
      // 036: lload 4
      // 038: invokedynamic v (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: astore 9
      // 03f: aload 0
      // 040: getfield com/zelix/_o5.a I
      // 043: aload 9
      // 045: ifnonnull 193
      // 048: tableswitch 283 153 201 236 236 236 236 236 236 236 236 236 236 236 236 281 281 223 223 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 283 281 281 223 223
      // 11c: ldc2_w 4731706858943307787
      // 11f: lload 4
      // 121: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: bipush 0
      // 128: ireturn
      // 129: ldc2_w 4731706858943307787
      // 12c: lload 4
      // 12e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: iload 3
      // 135: aload 9
      // 137: ifnonnull 15c
      // 13a: iload 6
      // 13c: if_icmplt 15f
      // 13f: goto 14d
      // 142: ldc2_w 4731706858943307787
      // 145: lload 4
      // 147: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: bipush 1
      // 14e: goto 15c
      // 151: ldc2_w 4731706858943307787
      // 154: lload 4
      // 156: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: goto 160
      // 15f: bipush 0
      // 160: ireturn
      // 161: bipush 0
      // 162: ireturn
      // 163: lload 7
      // 165: bipush 0
      // 166: bipush 1
      // 167: anewarray 15
      // 16a: dup
      // 16b: bipush 0
      // 16c: new java/lang/StringBuilder
      // 16f: dup
      // 170: invokespecial java/lang/StringBuilder.<init> ()V
      // 173: sipush 12984
      // 176: ldc2_w 8340069187867366031
      // 179: lload 4
      // 17b: lxor
      // 17c: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 184: aload 0
      // 185: getfield com/zelix/_o5.a I
      // 188: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 18b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 18e: aastore
      // 18f: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 192: bipush 0
      // 193: ireturn
   }

   public List E(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 1
      // 001: dup2
      // 002: ldc2_w 133194266639789
      // 005: lxor
      // 006: dup2
      // 007: bipush 48
      // 009: lushr
      // 00a: l2i
      // 00b: istore 3
      // 00c: dup2
      // 00d: bipush 16
      // 00f: lshl
      // 010: bipush 48
      // 012: lushr
      // 013: l2i
      // 014: istore 4
      // 016: dup2
      // 017: bipush 32
      // 019: lshl
      // 01a: bipush 32
      // 01c: lushr
      // 01d: l2i
      // 01e: istore 5
      // 020: pop2
      // 021: dup2
      // 022: ldc2_w 23601657218869
      // 025: lxor
      // 026: dup2
      // 027: bipush 48
      // 029: lushr
      // 02a: l2i
      // 02b: istore 6
      // 02d: dup2
      // 02e: bipush 16
      // 030: lshl
      // 031: bipush 32
      // 033: lushr
      // 034: l2i
      // 035: istore 7
      // 037: dup2
      // 038: bipush 48
      // 03a: lshl
      // 03b: bipush 48
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 8
      // 041: pop2
      // 042: pop2
      // 043: ldc2_w 7607670151054685270
      // 046: lload 1
      // 047: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 0
      // 04d: invokevirtual com/zelix/_o5.k ()I
      // 050: istore 10
      // 052: astore 9
      // 054: iload 10
      // 056: sipush 23749
      // 059: ldc2_w 535161374987120883
      // 05c: lload 1
      // 05d: lxor
      // 05e: invokedynamic i (IJ)I bsm=com/zelix/_o5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: aload 9
      // 065: ifnonnull 094
      // 068: if_icmplt 097
      // 06b: goto 078
      // 06e: ldc2_w 7977606518622670615
      // 071: lload 1
      // 072: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: iload 10
      // 07a: sipush 7693
      // 07d: ldc2_w 4788068122633318969
      // 080: lload 1
      // 081: lxor
      // 082: invokedynamic i (IJ)I bsm=com/zelix/_o5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: goto 094
      // 08a: ldc2_w 7977606518622670615
      // 08d: lload 1
      // 08e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: if_icmple 12d
      // 097: new java/util/ArrayList
      // 09a: dup
      // 09b: bipush 5
      // 09c: invokespecial java/util/ArrayList.<init> (I)V
      // 09f: astore 11
      // 0a1: aload 0
      // 0a2: getfield com/zelix/_o5.G Lcom/zelix/_op;
      // 0a5: astore 12
      // 0a7: new com/zelix/_op
      // 0aa: dup
      // 0ab: iload 3
      // 0ac: i2c
      // 0ad: iload 4
      // 0af: i2c
      // 0b0: iload 5
      // 0b2: bipush 1
      // 0b3: bipush 1
      // 0b4: invokespecial com/zelix/_op.<init> (CCIZI)V
      // 0b7: astore 13
      // 0b9: new com/zelix/_op
      // 0bc: dup
      // 0bd: iload 3
      // 0be: i2c
      // 0bf: iload 4
      // 0c1: i2c
      // 0c2: iload 5
      // 0c4: bipush 1
      // 0c5: bipush 1
      // 0c6: invokespecial com/zelix/_op.<init> (CCIZI)V
      // 0c9: astore 14
      // 0cb: aload 0
      // 0cc: aload 13
      // 0ce: bipush 1
      // 0cf: anewarray 114
      // 0d2: dup_x1
      // 0d3: swap
      // 0d4: bipush 0
      // 0d5: swap
      // 0d6: aastore
      // 0d7: ldc2_w 8022149442906229924
      // 0da: lload 1
      // 0db: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: aload 11
      // 0e2: aload 0
      // 0e3: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0e6: pop
      // 0e7: aload 11
      // 0e9: new com/zelix/_ol
      // 0ec: dup
      // 0ed: iload 6
      // 0ef: i2c
      // 0f0: aload 14
      // 0f2: iload 7
      // 0f4: iload 8
      // 0f6: i2s
      // 0f7: invokespecial com/zelix/_ol.<init> (CLcom/zelix/_op;IS)V
      // 0fa: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0fd: pop
      // 0fe: aload 11
      // 100: aload 13
      // 102: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 105: pop
      // 106: aload 11
      // 108: new com/zelix/_om
      // 10b: dup
      // 10c: sipush 3514
      // 10f: ldc2_w 7791103989338546575
      // 112: lload 1
      // 113: lxor
      // 114: invokedynamic i (IJ)I bsm=com/zelix/_o5.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: aload 12
      // 11b: invokespecial com/zelix/_om.<init> (ILcom/zelix/_op;)V
      // 11e: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 121: pop
      // 122: aload 11
      // 124: aload 14
      // 126: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 129: pop
      // 12a: aload 11
      // 12c: areturn
      // 12d: aconst_null
      // 12e: areturn
   }

   public final void g(long var1, Map var3, _y4 var4, List var5) {
      long var6 = var1 ^ 79505257116800L;
      int[] var10000 = x44.a<"t">(2498889497285672808L, var1);
      Object var9 = null;
      int[] var8 = var10000;
      dm var13 = (dm)(var9 = (dm)var3.get(this.G));

      label21: {
         label20: {
            try {
               if (var8 != null) {
                  break label20;
               }

               if (var13 != null) {
                  break label21;
               }
            } catch (gj var11) {
               throw x44.a<"t">(var11, 2704464006630212649L, var1);
            }

            var9 = new dm();
            dm var14 = (dm)var3.put(this.G, var9);
         }

         var5.add(var9);
      }

      var4.G(this, var9, var6);
   }

   public boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public final boolean h(Object[] param1) {
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
      // 00e: ldc2_w 84511756461035
      // 011: lxor
      // 012: lstore 4
      // 014: pop2
      // 015: ldc2_w 3370305781008282368
      // 018: lload 2
      // 019: invokedynamic t (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01e: astore 6
      // 020: aload 0
      // 021: getfield com/zelix/_o5.a I
      // 024: aload 6
      // 026: ifnonnull 143
      // 029: tableswitch 235 153 201 233 233 233 233 233 233 233 233 233 233 233 233 233 233 221 233 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 235 233 233 221 233
      // 0fc: ldc2_w 3017484512333203521
      // 0ff: lload 2
      // 100: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 0
      // 107: ireturn
      // 108: ldc2_w 3017484512333203521
      // 10b: lload 2
      // 10c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: athrow
      // 112: bipush 1
      // 113: ireturn
      // 114: lload 4
      // 116: bipush 0
      // 117: bipush 1
      // 118: anewarray 15
      // 11b: dup
      // 11c: bipush 0
      // 11d: new java/lang/StringBuilder
      // 120: dup
      // 121: invokespecial java/lang/StringBuilder.<init> ()V
      // 124: sipush 12984
      // 127: ldc2_w 8340038420672199365
      // 12a: lload 2
      // 12b: lxor
      // 12c: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 134: aload 0
      // 135: getfield com/zelix/_o5.a I
      // 138: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: aastore
      // 13f: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 142: bipush 1
      // 143: ireturn
   }

   public _kz M(_kz var1, long var2, boolean var4, boolean var5, _fm var6, String var7) {
      long var8 = var2 ^ 32610570959058L;
      long var10 = var2 ^ 1691382610792L;
      long var12 = var2 ^ 118237195067467L;
      long var14 = var2 ^ 37585498234552L;
      long var16 = var2 ^ 117730469283447L;
      int[] var10000 = x44.a<"w">(8522769916746197891L, var2);
      _fc var19 = new _fc(var16, var7);
      int[] var18 = var10000;
      n[] var20 = var1.m();
      n[] var21 = var1.r();
      Object var22 = null;
      int var23 = var20.length;
      p5 var24 = var1.z();
      Set var25 = var1.C(var8);

      label37: {
         label36: {
            label35: {
               label34: {
                  label33: {
                     try {
                        var31 = this.a;
                        if (var18 != null) {
                           break label33;
                        }

                        switch (this.a) {
                           case 153:
                           case 154:
                           case 155:
                           case 156:
                           case 157:
                           case 158:
                              break label37;
                           case 159:
                           case 160:
                           case 161:
                           case 162:
                           case 163:
                           case 164:
                              break label36;
                           case 165:
                           case 166:
                              break label35;
                           case 167:
                           case 168:
                           case 200:
                           case 201:
                              return null;
                           case 169:
                           case 170:
                           case 171:
                           case 172:
                           case 173:
                           case 174:
                           case 175:
                           case 176:
                           case 177:
                           case 178:
                           case 179:
                           case 180:
                           case 181:
                           case 182:
                           case 183:
                           case 184:
                           case 185:
                           case 186:
                           case 187:
                           case 188:
                           case 189:
                           case 190:
                           case 191:
                           case 192:
                           case 193:
                           case 194:
                           case 195:
                           case 196:
                           case 197:
                           default:
                              break;
                           case 198:
                           case 199:
                              break label34;
                        }
                     } catch (gj var26) {
                        throw x44.a<"w">(var26, 8170391157514588354L, var2);
                     }

                     var31 = 0;
                  }

                  lt.p(var10, (boolean)var31, new String[]{b<"x">(12984, 8339973356765700678L ^ var2) + this.a + " " + var19});
                  return null;
               }

               var22 = com.zelix.n.S(var23 - 1, var12);
               System.arraycopy(var20, 0, var22, 0, var23 - 1);
               return new _kz((n[])var22, var21, var14, var24, var25);
            }

            var22 = com.zelix.n.S(var23 - 2, var12);
            System.arraycopy(var20, 0, var22, 0, var23 - 2);
            return new _kz((n[])var22, var21, var14, var24, var25);
         }

         var22 = com.zelix.n.S(var23 - 2, var12);
         System.arraycopy(var20, 0, var22, 0, var23 - 2);
         return new _kz((n[])var22, var21, var14, var24, var25);
      }

      var22 = com.zelix.n.S(var23 - 1, var12);
      System.arraycopy(var20, 0, var22, 0, var23 - 1);
      return new _kz((n[])var22, var21, var14, var24, var25);
   }

   public final boolean c(char var1, short var2, int var3) {
      return false;
   }

   void p(DataOutputStream var1, long var2) {
      var1.writeShort(this.k());
   }

   int T(Object[] var1) {
      long var3 = (Long)var1[0];
      _xx var2 = (_xx)var1[1];
      short var5 = x44.a<"o">(var2, 2731571815433769309L, var3);
      return this.p + var5;
   }

   public _o5(int var1, _op var2) {
      super(var1);
      this.G = var2;
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 96074081906204L;
      return x44.a<"j">(this, new Object[]{var4}, -9087406469332222055L, var2);
   }

   public boolean C(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 26619652573261L;
      return x44.a<"h">(this, new Object[]{var4}, -989445280197661476L, var2);
   }

   _o5(long param1, int param3, _xx param4, int param5, _y4 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_o5.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 27224686250525
      // 0b: lxor
      // 0c: lstore 7
      // 0e: dup2
      // 0f: ldc2_w 120274560212390
      // 12: lxor
      // 13: lstore 9
      // 15: dup2
      // 16: ldc2_w 8772849985262
      // 19: lxor
      // 1a: lstore 11
      // 1c: pop2
      // 1d: aload 0
      // 1e: iload 3
      // 1f: invokespecial com/zelix/_og.<init> (I)V
      // 22: aload 0
      // 23: iload 5
      // 25: putfield com/zelix/_o5.p I
      // 28: ldc2_w -1097865144435053306
      // 2b: lload 1
      // 2c: invokedynamic r (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: aload 0
      // 32: lload 7
      // 34: aload 4
      // 36: bipush 2
      // 37: anewarray 114
      // 3a: dup_x1
      // 3b: swap
      // 3c: bipush 1
      // 3d: swap
      // 3e: aastore
      // 3f: dup_x2
      // 40: dup_x2
      // 41: pop
      // 42: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45: bipush 0
      // 46: swap
      // 47: aastore
      // 48: ldc2_w -858080622217527476
      // 4b: lload 1
      // 4c: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: istore 14
      // 53: astore 13
      // 55: aload 13
      // 57: ifnonnull f5
      // 5a: iload 14
      // 5c: ifge dd
      // 5f: goto 6c
      // 62: ldc2_w -583673433908914617
      // 65: lload 1
      // 66: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: new com/zelix/gj
      // 6f: dup
      // 70: new java/lang/StringBuilder
      // 73: dup
      // 74: invokespecial java/lang/StringBuilder.<init> ()V
      // 77: sipush 22889
      // 7a: ldc2_w 4244572830834298645
      // 7d: lload 1
      // 7e: lxor
      // 7f: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87: iload 3
      // 88: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 8b: sipush 22391
      // 8e: ldc2_w 4263094499419226376
      // 91: lload 1
      // 92: lxor
      // 93: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 9b: iload 5
      // 9d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // a0: sipush 24330
      // a3: ldc2_w 3586952172579457399
      // a6: lload 1
      // a7: lxor
      // a8: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b0: aload 0
      // b1: getfield com/zelix/_o5.p I
      // b4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // b7: sipush 24330
      // ba: ldc2_w 3586952172579457399
      // bd: lload 1
      // be: lxor
      // bf: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/_o5.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // c7: iload 14
      // c9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // cf: invokespecial com/zelix/gj.<init> (Ljava/lang/String;)V
      // d2: athrow
      // d3: ldc2_w -583673433908914617
      // d6: lload 1
      // d7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dc: athrow
      // dd: aload 6
      // df: ldc2_w -676432450099653741
      // e2: lload 1
      // e3: invokedynamic k (JJ)Lcom/zelix/_uo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e8: iload 14
      // ea: lload 9
      // ec: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // ef: aload 0
      // f0: lload 11
      // f2: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // f5: return
   }

   static {
      long var11 = b ^ 47547118597730L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "XlYh\u009cºíÈÓF;\u009bÞBÚÿ \u0085à\u00140ük\u001cÓ\u0096r\u001dZ¸kdO\u0088\u0005÷ \thU»èá~\u0093øhÎµ\u001029ÍÝ®Ç/¨Z$×@TÄ!º";
      int var19 = "XlYh\u009cºíÈÓF;\u009bÞBÚÿ \u0085à\u00140ük\u001cÓ\u0096r\u001dZ¸kdO\u0088\u0005÷ \thU»èá~\u0093øhÎµ\u001029ÍÝ®Ç/¨Z$×@TÄ!º".length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     g = var20;
                     k = new String[5];
                     o = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "\u009b \u009cå¡\r\u0095m762\u0018\u0015&·\u0005";
                     int var5 = "\u009b \u009cå¡\r\u0095m762\u0018\u0015&·\u0005".length();
                     byte var2 = 0;

                     label36:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var28 = var6;
                        var10001 = var3++;
                        long var40 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var43 = -1;

                        while (true) {
                           long var8 = var40;
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
                           long var45 = ((long)var10[0] & 255L) << 56
                              | ((long)var10[1] & 255L) << 48
                              | ((long)var10[2] & 255L) << 40
                              | ((long)var10[3] & 255L) << 32
                              | ((long)var10[4] & 255L) << 24
                              | ((long)var10[5] & 255L) << 16
                              | ((long)var10[6] & 255L) << 8
                              | (long)var10[7] & 255L;
                           switch (var43) {
                              case 0:
                                 var28[var10001] = var45;
                                 if (var2 >= var5) {
                                    m = var6;
                                    n = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u0093EUã¦¶£\u0004\u0007\u00124]ì\r$»";
                                 var5 = "\u0093EUã¦¶£\u0004\u0007\u00124]ì\r$»".length();
                                 var2 = 0;
                           }

                           byte var34 = var2;
                           var2 += 8;
                           var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                           var28 = var6;
                           var10001 = var3++;
                           var40 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var43 = 0;
                        }
                     }
                  }

                  var16 = var17.charAt(var24);
                  break;
               default:
                  var20[var18++] = var36;
                  if ((var24 += var16) < var19) {
                     var16 = var17.charAt(var24);
                     continue label54;
                  }

                  var17 = "øAAH®\u0004í{Ö´CàÌ>þ\u0094WìòÜÉ\u009d\u008c\u001b \u0004\n\u009b·¨\u0017xÁFt}\u0086\u009e]2W\f*Ör\u001d¸ÙF¦:úù\u0099>\u0004¡";
                  var19 = "øAAH®\u0004í{Ö´CàÌ>þ\u0094WìòÜÉ\u009d\u008c\u001b \u0004\n\u009b·¨\u0017xÁFt}\u0086\u009e]2W\f*Ör\u001d¸ÙF¦:úù\u0099>\u0004¡"
                     .length();
                  var16 = 24;
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
      }
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11182;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])l.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/_o5", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         k[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_o5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18615;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_o5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/_o5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
