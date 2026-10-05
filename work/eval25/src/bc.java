package com.zelix;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bc extends h8 implements l6, sv, _8f, ru {
   x_ J;
   String Q;
   private int D;
   xl[] R;
   boolean k;
   private static final long a = ess.a(9196997236401418047L, -6210289895817160048L, MethodHandles.lookup().lookupClass()).a(30503126524842L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   String m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, 6115900356038330810L, var2);
   }

   public xl[] x(Object[] var1) {
      xl[] var2 = new xl[this.R.length];
      System.arraycopy(this.R, 0, var2, 0, this.R.length);
      return var2;
   }

   public void z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 77509770970672L;
      x44.a<"j">((bq)this.x(), new Object[]{var4}, -9189923936686172491L, var2);
   }

   public boolean Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 139942772555663L;
      return x44.a<"l">(x44.a<"h">(this, -9117086351901718420L, var2), new Object[]{var4}, -6965972339486583346L, var2);
   }

   public void Z(Object[] var1) {
      int var2 = (Integer)var1[0];
      xl[] var3 = new xl[var2 + 1];
      System.arraycopy(this.R, 0, var3, 0, var3.length);
      this.R = var3;
   }

   protected void P(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/io/DataOutputStream
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 6
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 3
      // 22: pop
      // 23: getstatic com/zelix/bc.a J
      // 26: lload 4
      // 28: lxor
      // 29: lstore 4
      // 2b: aload 2
      // 2c: aload 0
      // 2d: ldc2_w -552826357772357306
      // 30: lload 4
      // 32: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: invokevirtual com/zelix/x_.B ()I
      // 3a: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 3d: ldc2_w -378030530582360444
      // 40: lload 4
      // 42: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: aload 2
      // 48: aload 0
      // 49: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 4c: arraylength
      // 4d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 50: aload 0
      // 51: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 54: astore 8
      // 56: istore 7
      // 58: aload 8
      // 5a: arraylength
      // 5b: istore 9
      // 5d: bipush 0
      // 5e: istore 10
      // 60: iload 10
      // 62: iload 9
      // 64: if_icmpge dd
      // 67: aload 8
      // 69: iload 10
      // 6b: aaload
      // 6c: astore 11
      // 6e: aload 6
      // 70: aload 11
      // 72: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 77: checkcast com/zelix/xl
      // 7a: astore 12
      // 7c: iload 7
      // 7e: lload 4
      // 80: lconst_0
      // 81: lcmp
      // 82: ifle b4
      // 85: ifne b2
      // 88: aload 12
      // 8a: ifnull be
      // 8d: goto 9b
      // 90: ldc2_w -409230699764490408
      // 93: lload 4
      // 95: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: athrow
      // 9b: aload 2
      // 9c: aload 12
      // 9e: invokevirtual com/zelix/xl.B ()I
      // a1: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // a4: goto b2
      // a7: ldc2_w -409230699764490408
      // aa: lload 4
      // ac: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: iload 7
      // b4: lload 4
      // b6: lconst_0
      // b7: lcmp
      // b8: iflt da
      // bb: ifeq d5
      // be: aload 2
      // bf: aload 11
      // c1: invokevirtual com/zelix/xl.B ()I
      // c4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // c7: goto d5
      // ca: ldc2_w -409230699764490408
      // cd: lload 4
      // cf: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: athrow
      // d5: iinc 10 1
      // d8: iload 7
      // da: ifeq 60
      // dd: return
   }

   public String I(Object[] param1) {
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
      // 00c: getstatic com/zelix/bc.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 31523107827214
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 31523107827214
      // 01e: lxor
      // 01f: lstore 6
      // 021: pop2
      // 022: new java/lang/StringBuilder
      // 025: dup
      // 026: invokespecial java/lang/StringBuilder.<init> ()V
      // 029: astore 9
      // 02b: aload 9
      // 02d: sipush 2860
      // 030: ldc2_w 1855976797417788857
      // 033: lload 2
      // 034: lxor
      // 035: invokedynamic p (IJ)I bsm=com/zelix/bc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 03d: pop
      // 03e: ldc2_w 3991841915638907681
      // 041: lload 2
      // 042: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: aload 9
      // 049: aload 0
      // 04a: ldc2_w 3888541025673657571
      // 04d: lload 2
      // 04e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: lload 4
      // 055: ldc2_w 3749596817438479730
      // 058: lload 2
      // 059: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 061: pop
      // 062: aload 9
      // 064: sipush 1187
      // 067: ldc2_w 4810565779083596747
      // 06a: lload 2
      // 06b: lxor
      // 06c: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/bc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 074: pop
      // 075: aload 9
      // 077: sipush 7359
      // 07a: ldc2_w 3128020244008124969
      // 07d: lload 2
      // 07e: lxor
      // 07f: invokedynamic p (IJ)I bsm=com/zelix/bc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 087: pop
      // 088: bipush 0
      // 089: istore 10
      // 08b: istore 8
      // 08d: iload 10
      // 08f: aload 0
      // 090: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 093: arraylength
      // 094: if_icmpge 113
      // 097: aload 9
      // 099: aload 0
      // 09a: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 09d: iload 10
      // 09f: aaload
      // 0a0: lload 6
      // 0a2: ldc2_w 3213681799357952334
      // 0a5: lload 2
      // 0a6: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ae: lload 2
      // 0af: lconst_0
      // 0b0: lcmp
      // 0b1: ifle 141
      // 0b4: pop
      // 0b5: iload 8
      // 0b7: ifne 13f
      // 0ba: iload 8
      // 0bc: lload 2
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 110
      // 0c2: ifne 10e
      // 0c5: goto 0d2
      // 0c8: ldc2_w 4032752423370265341
      // 0cb: lload 2
      // 0cc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: iload 10
      // 0d4: aload 0
      // 0d5: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 0d8: arraylength
      // 0d9: bipush 1
      // 0da: isub
      // 0db: if_icmpge 10b
      // 0de: goto 0eb
      // 0e1: ldc2_w 4032752423370265341
      // 0e4: lload 2
      // 0e5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 9
      // 0ed: sipush 7303
      // 0f0: ldc2_w 5476661398648766997
      // 0f3: lload 2
      // 0f4: lxor
      // 0f5: invokedynamic p (IJ)I bsm=com/zelix/bc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0fd: pop
      // 0fe: goto 10b
      // 101: ldc2_w 4032752423370265341
      // 104: lload 2
      // 105: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: iinc 10 1
      // 10e: iload 8
      // 110: ifeq 08d
      // 113: aload 9
      // 115: sipush 18683
      // 118: ldc2_w 2088907198695708268
      // 11b: lload 2
      // 11c: lxor
      // 11d: invokedynamic p (IJ)I bsm=com/zelix/bc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 125: pop
      // 126: aload 9
      // 128: sipush 6891
      // 12b: ldc2_w 4692149735183336575
      // 12e: lload 2
      // 12f: lxor
      // 130: invokedynamic p (IJ)I bsm=com/zelix/bc.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 138: pop
      // 139: lload 2
      // 13a: lconst_0
      // 13b: lcmp
      // 13c: iflt 0b5
      // 13f: aload 9
      // 141: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 144: areturn
   }

   public boolean m(Object[] param1) {
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
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/String
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/String
      // 020: astore 6
      // 022: pop
      // 023: getstatic com/zelix/bc.a J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 23849300550952
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 42205766728913
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 72747401149778
      // 03c: lxor
      // 03d: lstore 11
      // 03f: pop2
      // 040: ldc2_w -6490648162663689816
      // 043: lload 3
      // 044: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: istore 13
      // 04b: aload 0
      // 04c: ldc2_w -6377214144667439510
      // 04f: lload 3
      // 050: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: lload 7
      // 057: bipush 1
      // 058: anewarray 177
      // 05b: dup_x2
      // 05c: dup_x2
      // 05d: pop
      // 05e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 061: bipush 0
      // 062: swap
      // 063: aastore
      // 064: ldc2_w -6364056425078030978
      // 067: lload 3
      // 068: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aload 2
      // 06e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 071: iload 13
      // 073: ifne 0ba
      // 076: ifeq 122
      // 079: goto 086
      // 07c: ldc2_w -6521638843205353356
      // 07f: lload 3
      // 080: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: aload 0
      // 087: ldc2_w -6377214144667439510
      // 08a: lload 3
      // 08b: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: lload 11
      // 092: bipush 1
      // 093: anewarray 177
      // 096: dup_x2
      // 097: dup_x2
      // 098: pop
      // 099: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09c: bipush 0
      // 09d: swap
      // 09e: aastore
      // 09f: ldc2_w -6834973452374014127
      // 0a2: lload 3
      // 0a3: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: aload 5
      // 0aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ad: goto 0ba
      // 0b0: ldc2_w -6521638843205353356
      // 0b3: lload 3
      // 0b4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: iload 13
      // 0bc: lload 3
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 10b
      // 0c2: ifne 109
      // 0c5: ifeq 122
      // 0c8: goto 0d5
      // 0cb: ldc2_w -6521638843205353356
      // 0ce: lload 3
      // 0cf: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: ldc2_w -6377214144667439510
      // 0d9: lload 3
      // 0da: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: lload 9
      // 0e1: bipush 1
      // 0e2: anewarray 177
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: ldc2_w -6753456696755915062
      // 0f1: lload 3
      // 0f2: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: aload 6
      // 0f9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0fc: goto 109
      // 0ff: ldc2_w -6521638843205353356
      // 102: lload 3
      // 103: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: iload 13
      // 10b: ifne 11f
      // 10e: ifeq 122
      // 111: goto 11e
      // 114: ldc2_w -6521638843205353356
      // 117: lload 3
      // 118: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: bipush 1
      // 11f: goto 123
      // 122: bipush 0
      // 123: ireturn
   }

   public String z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 16696711544962L;
      return x44.a<"w">(x44.a<"o">(this, new Object[]{var4}, 2928614660147646121L, var2), 3920644391291983100L, var2)
         + b<"p">(13944, 438873873592087124L ^ var2)
         + x44.a<"w">(System.identityHashCode(this), 3920644391291983100L, var2);
   }

   public void U(Object[] param1) {
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
      // 04: checkcast com/zelix/ms
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast com/zelix/ms
      // 18: astore 5
      // 1a: pop
      // 1b: ldc2_w -2907198904063892509
      // 1e: lload 3
      // 1f: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 2f: arraylength
      // 30: if_icmpge 92
      // 33: aload 0
      // 34: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 37: iload 7
      // 39: lload 3
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: iflt 69
      // 3f: iload 6
      // 41: ifne 69
      // 44: aaload
      // 45: aload 2
      // 46: if_acmpne 77
      // 49: goto 56
      // 4c: ldc2_w -2939333114311904705
      // 4f: lload 3
      // 50: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: aload 0
      // 57: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 5a: iload 7
      // 5c: goto 69
      // 5f: ldc2_w -2939333114311904705
      // 62: lload 3
      // 63: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: aload 5
      // 6b: aastore
      // 6c: iload 6
      // 6e: lload 3
      // 6f: lconst_0
      // 70: lcmp
      // 71: iflt 7c
      // 74: ifeq 92
      // 77: iinc 7 1
      // 7a: iload 6
      // 7c: ifeq 29
      // 7f: lload 3
      // 80: lconst_0
      // 81: lcmp
      // 82: iflt 33
      // 85: goto 92
      // 88: ldc2_w -2939333114311904705
      // 8b: lload 3
      // 8c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: return
   }

   public void Y(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 7
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Set
      // 017: astore 6
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/Set
      // 01f: astore 2
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/lang/Long
      // 026: invokevirtual java/lang/Long.longValue ()J
      // 029: lstore 3
      // 02a: pop
      // 02b: getstatic com/zelix/bc.a J
      // 02e: lload 3
      // 02f: lxor
      // 030: lstore 3
      // 031: lload 3
      // 032: dup2
      // 033: ldc2_w 91939593482170
      // 036: lxor
      // 037: lstore 8
      // 039: dup2
      // 03a: ldc2_w 65058534021959
      // 03d: lxor
      // 03e: lstore 10
      // 040: dup2
      // 041: ldc2_w 139751924171464
      // 044: lxor
      // 045: lstore 12
      // 047: dup2
      // 048: ldc2_w 40465433828776
      // 04b: lxor
      // 04c: lstore 14
      // 04e: dup2
      // 04f: ldc2_w 59139244850744
      // 052: lxor
      // 053: lstore 16
      // 055: dup2
      // 056: ldc2_w 134462692760235
      // 059: lxor
      // 05a: lstore 18
      // 05c: dup2
      // 05d: ldc2_w 30192112289211
      // 060: lxor
      // 061: lstore 20
      // 063: pop2
      // 064: aload 0
      // 065: ldc2_w -685514554403356823
      // 068: lload 3
      // 069: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: aload 5
      // 070: aload 7
      // 072: lload 18
      // 074: aload 6
      // 076: aload 2
      // 077: bipush 5
      // 078: anewarray 177
      // 07b: dup_x1
      // 07c: swap
      // 07d: bipush 4
      // 07e: swap
      // 07f: aastore
      // 080: dup_x1
      // 081: swap
      // 082: bipush 3
      // 083: swap
      // 084: aastore
      // 085: dup_x2
      // 086: dup_x2
      // 087: pop
      // 088: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08b: bipush 2
      // 08c: swap
      // 08d: aastore
      // 08e: dup_x1
      // 08f: swap
      // 090: bipush 1
      // 091: swap
      // 092: aastore
      // 093: dup_x1
      // 094: swap
      // 095: bipush 0
      // 096: swap
      // 097: aastore
      // 098: ldc2_w -651895329705501328
      // 09b: lload 3
      // 09c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: ldc2_w -1614263149284828686
      // 0a4: lload 3
      // 0a5: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: aload 0
      // 0ab: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 0ae: astore 23
      // 0b0: aload 23
      // 0b2: arraylength
      // 0b3: istore 24
      // 0b5: bipush 0
      // 0b6: istore 25
      // 0b8: istore 22
      // 0ba: iload 25
      // 0bc: iload 24
      // 0be: if_icmpge 2bb
      // 0c1: aload 23
      // 0c3: iload 25
      // 0c5: aaload
      // 0c6: astore 26
      // 0c8: iload 22
      // 0ca: lload 3
      // 0cb: lconst_0
      // 0cc: lcmp
      // 0cd: ifle 0e7
      // 0d0: ifeq 2b6
      // 0d3: ldc2_w -1249416558506156083
      // 0d6: lload 3
      // 0d7: invokedynamic h (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: aload 26
      // 0de: lload 14
      // 0e0: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 0e3: invokevirtual com/zelix/w5.ordinal ()I
      // 0e6: iaload
      // 0e7: lload 3
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: iflt 128
      // 0ed: tableswitch 454 1 8 57 57 57 57 57 75 311 385
      // 11c: ldc2_w -829372999815245449
      // 11f: lload 3
      // 120: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: iload 22
      // 128: ifne 2b3
      // 12b: goto 138
      // 12e: ldc2_w -829372999815245449
      // 131: lload 3
      // 132: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 137: athrow
      // 138: aload 26
      // 13a: checkcast com/zelix/x7
      // 13d: lload 16
      // 13f: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 142: astore 27
      // 144: lload 20
      // 146: aload 27
      // 148: bipush 2
      // 149: anewarray 177
      // 14c: dup_x1
      // 14d: swap
      // 14e: bipush 1
      // 14f: swap
      // 150: aastore
      // 151: dup_x2
      // 152: dup_x2
      // 153: pop
      // 154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157: bipush 0
      // 158: swap
      // 159: aastore
      // 15a: ldc2_w -738680421673521916
      // 15d: lload 3
      // 15e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: astore 28
      // 165: iload 22
      // 167: lload 3
      // 168: lconst_0
      // 169: lcmp
      // 16a: ifle 2b8
      // 16d: ifeq 2b6
      // 170: aload 28
      // 172: ifnull 2b3
      // 175: goto 182
      // 178: ldc2_w -829372999815245449
      // 17b: lload 3
      // 17c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: aload 27
      // 184: ldc "["
      // 186: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 189: ifne 1a8
      // 18c: goto 199
      // 18f: ldc2_w -829372999815245449
      // 192: lload 3
      // 193: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: athrow
      // 199: aload 7
      // 19b: astore 29
      // 19d: iload 22
      // 19f: lload 3
      // 1a0: lconst_0
      // 1a1: lcmp
      // 1a2: iflt 1b3
      // 1a5: ifne 1ac
      // 1a8: aload 5
      // 1aa: astore 29
      // 1ac: aload 28
      // 1ae: lload 10
      // 1b0: invokevirtual com/zelix/hz.n (J)Z
      // 1b3: iload 22
      // 1b5: ifeq 218
      // 1b8: ifeq 202
      // 1bb: goto 1c8
      // 1be: ldc2_w -829372999815245449
      // 1c1: lload 3
      // 1c2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c7: athrow
      // 1c8: aload 29
      // 1ca: aload 28
      // 1cc: lload 8
      // 1ce: bipush 1
      // 1cf: anewarray 177
      // 1d2: dup_x2
      // 1d3: dup_x2
      // 1d4: pop
      // 1d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d8: bipush 0
      // 1d9: swap
      // 1da: aastore
      // 1db: ldc2_w -1230917161229731433
      // 1de: lload 3
      // 1df: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 1e9: pop
      // 1ea: iload 22
      // 1ec: lload 3
      // 1ed: lconst_0
      // 1ee: lcmp
      // 1ef: ifle 21b
      // 1f2: ifne 219
      // 1f5: goto 202
      // 1f8: ldc2_w -829372999815245449
      // 1fb: lload 3
      // 1fc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: aload 29
      // 204: aload 28
      // 206: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 20b: goto 218
      // 20e: ldc2_w -829372999815245449
      // 211: lload 3
      // 212: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: pop
      // 219: iload 22
      // 21b: lload 3
      // 21c: lconst_0
      // 21d: lcmp
      // 21e: iflt 25e
      // 221: ifne 2b3
      // 224: aload 26
      // 226: checkcast com/zelix/x_
      // 229: aload 5
      // 22b: aload 7
      // 22d: lload 18
      // 22f: aload 6
      // 231: aload 2
      // 232: bipush 5
      // 233: anewarray 177
      // 236: dup_x1
      // 237: swap
      // 238: bipush 4
      // 239: swap
      // 23a: aastore
      // 23b: dup_x1
      // 23c: swap
      // 23d: bipush 3
      // 23e: swap
      // 23f: aastore
      // 240: dup_x2
      // 241: dup_x2
      // 242: pop
      // 243: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 246: bipush 2
      // 247: swap
      // 248: aastore
      // 249: dup_x1
      // 24a: swap
      // 24b: bipush 1
      // 24c: swap
      // 24d: aastore
      // 24e: dup_x1
      // 24f: swap
      // 250: bipush 0
      // 251: swap
      // 252: aastore
      // 253: ldc2_w -651895329705501328
      // 256: lload 3
      // 257: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: iload 22
      // 25e: ifne 2b3
      // 261: goto 26e
      // 264: ldc2_w -829372999815245449
      // 267: lload 3
      // 268: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26d: athrow
      // 26e: aload 26
      // 270: checkcast com/zelix/xb
      // 273: aload 5
      // 275: aload 7
      // 277: aload 6
      // 279: aload 2
      // 27a: lload 12
      // 27c: bipush 5
      // 27d: anewarray 177
      // 280: dup_x2
      // 281: dup_x2
      // 282: pop
      // 283: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 286: bipush 4
      // 287: swap
      // 288: aastore
      // 289: dup_x1
      // 28a: swap
      // 28b: bipush 3
      // 28c: swap
      // 28d: aastore
      // 28e: dup_x1
      // 28f: swap
      // 290: bipush 2
      // 291: swap
      // 292: aastore
      // 293: dup_x1
      // 294: swap
      // 295: bipush 1
      // 296: swap
      // 297: aastore
      // 298: dup_x1
      // 299: swap
      // 29a: bipush 0
      // 29b: swap
      // 29c: aastore
      // 29d: ldc2_w -637213500316373975
      // 2a0: lload 3
      // 2a1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a6: goto 2b3
      // 2a9: ldc2_w -829372999815245449
      // 2ac: lload 3
      // 2ad: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: athrow
      // 2b3: iinc 25 1
      // 2b6: iload 22
      // 2b8: ifne 0ba
      // 2bb: return
   }

   public void h(Object[] param1) {
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
      // 0e: checkcast com/zelix/x7
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/x7
      // 19: astore 2
      // 1a: pop
      // 1b: ldc2_w 1401169644749333275
      // 1e: lload 3
      // 1f: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 2f: arraylength
      // 30: if_icmpge 92
      // 33: aload 0
      // 34: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 37: iload 7
      // 39: lload 3
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: iflt 6a
      // 3f: iload 6
      // 41: ifeq 6a
      // 44: aaload
      // 45: aload 5
      // 47: if_acmpne 77
      // 4a: goto 57
      // 4d: ldc2_w 1050589747798453150
      // 50: lload 3
      // 51: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: aload 0
      // 58: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 5b: iload 7
      // 5d: goto 6a
      // 60: ldc2_w 1050589747798453150
      // 63: lload 3
      // 64: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aload 2
      // 6b: aastore
      // 6c: iload 6
      // 6e: lload 3
      // 6f: lconst_0
      // 70: lcmp
      // 71: ifle 7c
      // 74: ifne 92
      // 77: iinc 7 1
      // 7a: iload 6
      // 7c: ifne 29
      // 7f: lload 3
      // 80: lconst_0
      // 81: lcmp
      // 82: iflt 33
      // 85: goto 92
      // 88: ldc2_w 1050589747798453150
      // 8b: lload 3
      // 8c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: return
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      long var6 = var1 ^ 10727274753381L;
      x44.a<"o">(x44.a<"k">(this, -5187399301302963945L, var1), var4, var3, this, this.x(), -5184629358818910556L, var1);
      xl[] var9 = this.R;
      int var10 = var9.length;
      boolean var10000 = x44.a<"w">(-6348162585463318644L, var1);
      int var11 = 0;
      boolean var8 = var10000;

      while (var11 < var10) {
         xl var12 = var9[var11];
         var3.H(var12, this, this.x(), var6);
         var11++;
         if (!var8) {
            break;
         }
      }
   }

   public void R(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/bc.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 73820545733883
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 23026943700077
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 51244328739239
      // 02c: lxor
      // 02d: dup2
      // 02e: bipush 32
      // 030: lushr
      // 031: l2i
      // 032: istore 9
      // 034: dup2
      // 035: bipush 32
      // 037: lshl
      // 038: bipush 48
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 10
      // 03e: dup2
      // 03f: bipush 48
      // 041: lshl
      // 042: bipush 48
      // 044: lushr
      // 045: l2i
      // 046: istore 11
      // 048: pop2
      // 049: dup2
      // 04a: ldc2_w 23010709472870
      // 04d: lxor
      // 04e: lstore 12
      // 050: dup2
      // 051: ldc2_w 34099616269484
      // 054: lxor
      // 055: lstore 14
      // 057: pop2
      // 058: ldc2_w 2941633367282620600
      // 05b: lload 3
      // 05c: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: istore 16
      // 063: aload 0
      // 064: ldc2_w 3116681350285075079
      // 067: lload 3
      // 068: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: iload 16
      // 06f: ifeq 0e5
      // 072: ifeq 34b
      // 075: goto 082
      // 078: ldc2_w 3834606618939002941
      // 07b: lload 3
      // 07c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: aload 0
      // 083: lload 3
      // 084: lconst_0
      // 085: lcmp
      // 086: iflt 0e9
      // 089: iload 16
      // 08b: ifeq 0e9
      // 08e: goto 09b
      // 091: ldc2_w 3834606618939002941
      // 094: lload 3
      // 095: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: iload 9
      // 09d: iload 10
      // 09f: i2c
      // 0a0: iload 11
      // 0a2: i2c
      // 0a3: bipush 3
      // 0a4: anewarray 177
      // 0a7: dup_x1
      // 0a8: swap
      // 0a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ac: bipush 2
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b4: bipush 1
      // 0b5: swap
      // 0b6: aastore
      // 0b7: dup_x1
      // 0b8: swap
      // 0b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bc: bipush 0
      // 0bd: swap
      // 0be: aastore
      // 0bf: ldc2_w 2942547624013943748
      // 0c2: lload 3
      // 0c3: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: sipush 3074
      // 0cb: ldc2_w 3493402853337242024
      // 0ce: lload 3
      // 0cf: lxor
      // 0d0: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/bc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d8: goto 0e5
      // 0db: ldc2_w 3834606618939002941
      // 0de: lload 3
      // 0df: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: ifeq 34b
      // 0e8: aload 0
      // 0e9: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 0ec: lload 3
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 118
      // 0f2: iload 16
      // 0f4: ifeq 118
      // 0f7: ifnull 34b
      // 0fa: goto 107
      // 0fd: ldc2_w 3834606618939002941
      // 100: lload 3
      // 101: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 0
      // 108: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 10b: goto 118
      // 10e: ldc2_w 3834606618939002941
      // 111: lload 3
      // 112: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: arraylength
      // 119: iload 16
      // 11b: lload 3
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: ifle 125
      // 121: ifeq 143
      // 124: bipush 2
      // 125: if_icmplt 34b
      // 128: goto 135
      // 12b: ldc2_w 3834606618939002941
      // 12e: lload 3
      // 12f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: athrow
      // 135: bipush 1
      // 136: goto 143
      // 139: ldc2_w 3834606618939002941
      // 13c: lload 3
      // 13d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: istore 17
      // 145: aload 0
      // 146: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 149: iload 17
      // 14b: iinc 17 1
      // 14e: aaload
      // 14f: astore 18
      // 151: aload 18
      // 153: iload 16
      // 155: ifeq 17a
      // 158: instanceof com/zelix/md
      // 15b: ifeq 34b
      // 15e: goto 16b
      // 161: ldc2_w 3834606618939002941
      // 164: lload 3
      // 165: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: aload 18
      // 16d: goto 17a
      // 170: ldc2_w 3834606618939002941
      // 173: lload 3
      // 174: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: checkcast com/zelix/md
      // 17d: astore 19
      // 17f: aload 19
      // 181: lload 7
      // 183: bipush 1
      // 184: anewarray 177
      // 187: dup_x2
      // 188: dup_x2
      // 189: pop
      // 18a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18d: bipush 0
      // 18e: swap
      // 18f: aastore
      // 190: ldc2_w 3515853418809492769
      // 193: lload 3
      // 194: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: astore 20
      // 19b: new java/lang/StringBuilder
      // 19e: dup
      // 19f: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a2: astore 21
      // 1a4: new java/util/StringTokenizer
      // 1a7: dup
      // 1a8: aload 20
      // 1aa: ldc ";"
      // 1ac: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 1af: astore 22
      // 1b1: aload 22
      // 1b3: invokevirtual java/util/StringTokenizer.countTokens ()I
      // 1b6: istore 23
      // 1b8: bipush 0
      // 1b9: istore 24
      // 1bb: iload 24
      // 1bd: iload 23
      // 1bf: if_icmpge 300
      // 1c2: iload 16
      // 1c4: lload 3
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: ifle 1cf
      // 1ca: ifeq 34b
      // 1cd: iload 24
      // 1cf: ifle 1f4
      // 1d2: goto 1df
      // 1d5: ldc2_w 3834606618939002941
      // 1d8: lload 3
      // 1d9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1de: athrow
      // 1df: aload 21
      // 1e1: ldc ";"
      // 1e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e6: pop
      // 1e7: goto 1f4
      // 1ea: ldc2_w 3834606618939002941
      // 1ed: lload 3
      // 1ee: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f3: athrow
      // 1f4: aload 22
      // 1f6: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 1f9: astore 25
      // 1fb: lload 3
      // 1fc: lconst_0
      // 1fd: lcmp
      // 1fe: iflt 2eb
      // 201: iload 17
      // 203: aload 0
      // 204: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 207: arraylength
      // 208: if_icmpge 2e3
      // 20b: aload 0
      // 20c: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 20f: iload 17
      // 211: iinc 17 1
      // 214: aaload
      // 215: astore 26
      // 217: aload 26
      // 219: iload 16
      // 21b: ifeq 240
      // 21e: instanceof com/zelix/x_
      // 221: ifeq 2c3
      // 224: goto 231
      // 227: ldc2_w 3834606618939002941
      // 22a: lload 3
      // 22b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: aload 26
      // 233: goto 240
      // 236: ldc2_w 3834606618939002941
      // 239: lload 3
      // 23a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: checkcast com/zelix/x_
      // 243: astore 27
      // 245: aload 27
      // 247: lload 12
      // 249: bipush 1
      // 24a: anewarray 177
      // 24d: dup_x2
      // 24e: dup_x2
      // 24f: pop
      // 250: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 253: bipush 0
      // 254: swap
      // 255: aastore
      // 256: ldc2_w 3111388071587658775
      // 259: lload 3
      // 25a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/i8; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: astore 28
      // 261: iload 16
      // 263: lload 3
      // 264: lconst_0
      // 265: lcmp
      // 266: iflt 29a
      // 269: ifeq 298
      // 26c: aload 28
      // 26e: ifnull 2a3
      // 271: goto 27e
      // 274: ldc2_w 3834606618939002941
      // 277: lload 3
      // 278: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: athrow
      // 27e: aload 21
      // 280: aload 28
      // 282: lload 5
      // 284: invokevirtual com/zelix/i8.w (J)Ljava/lang/String;
      // 287: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28a: pop
      // 28b: goto 298
      // 28e: ldc2_w 3834606618939002941
      // 291: lload 3
      // 292: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 297: athrow
      // 298: iload 16
      // 29a: lload 3
      // 29b: lconst_0
      // 29c: lcmp
      // 29d: ifle 2ba
      // 2a0: ifne 2b8
      // 2a3: aload 21
      // 2a5: aload 25
      // 2a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2aa: pop
      // 2ab: goto 2b8
      // 2ae: ldc2_w 3834606618939002941
      // 2b1: lload 3
      // 2b2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b7: athrow
      // 2b8: iload 16
      // 2ba: lload 3
      // 2bb: lconst_0
      // 2bc: lcmp
      // 2bd: iflt 2da
      // 2c0: ifne 2d8
      // 2c3: aload 21
      // 2c5: aload 25
      // 2c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ca: pop
      // 2cb: goto 2d8
      // 2ce: ldc2_w 3834606618939002941
      // 2d1: lload 3
      // 2d2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: athrow
      // 2d8: iload 16
      // 2da: lload 3
      // 2db: lconst_0
      // 2dc: lcmp
      // 2dd: iflt 2fd
      // 2e0: ifne 2f8
      // 2e3: aload 21
      // 2e5: aload 25
      // 2e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ea: pop
      // 2eb: goto 2f8
      // 2ee: ldc2_w 3834606618939002941
      // 2f1: lload 3
      // 2f2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: athrow
      // 2f8: iinc 24 1
      // 2fb: iload 16
      // 2fd: ifne 1bb
      // 300: aload 21
      // 302: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 305: astore 24
      // 307: lload 3
      // 308: lconst_0
      // 309: lcmp
      // 30a: ifle 34b
      // 30d: lload 3
      // 30e: lconst_0
      // 30f: lcmp
      // 310: iflt 33e
      // 313: aload 24
      // 315: aload 20
      // 317: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 31a: ifne 34b
      // 31d: aload 19
      // 31f: lload 14
      // 321: aload 24
      // 323: bipush 2
      // 324: anewarray 177
      // 327: dup_x1
      // 328: swap
      // 329: bipush 1
      // 32a: swap
      // 32b: aastore
      // 32c: dup_x2
      // 32d: dup_x2
      // 32e: pop
      // 32f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 332: bipush 0
      // 333: swap
      // 334: aastore
      // 335: ldc2_w 3947261177416900992
      // 338: lload 3
      // 339: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33e: goto 34b
      // 341: ldc2_w 3834606618939002941
      // 344: lload 3
      // 345: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34a: athrow
      // 34b: return
   }

   public Set b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      HashSet var5 = new HashSet(b<"p">(14663, 8303607850562931141L ^ var2));
      boolean var10000 = x44.a<"r">(1834330352680054064L, var2);
      xl[] var6 = this.R;
      boolean var4 = var10000;
      int var7 = var6.length;
      int var8 = 0;

      while (var8 < var7) {
         xl var9 = var6[var8];

         label34: {
            label33: {
               label32: {
                  try {
                     var10000 = var4;
                     if (var2 < 0L) {
                        break label34;
                     }

                     if (var4) {
                        break label33;
                     }

                     if (!(var9 instanceof x2)) {
                        break label32;
                     }
                  } catch (gj var11) {
                     throw x44.a<"r">(var11, 1866232251366161644L, var2);
                  }

                  x2 var10 = (x2)var9;
                  var5.add(x44.a<"j">(var10, new Object[0], 2157906295625230495L, var2));
               }

               var8++;
            }

            var10000 = var4;
         }

         if (var10000) {
            break;
         }
      }

      return var5;
   }

   protected void b(Object[] var1) {
      DataOutputStream var4 = (DataOutputStream)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      boolean var10000 = x44.a<"w">(-179588670041962043L, var2);
      var4.writeShort(x44.a<"k">(this, -66716814409370105L, var2).B());
      var4.writeShort(this.R.length);
      boolean var5 = var10000;

      for (xl var9 : this.R) {
         var4.writeShort(var9.B());
         if (var5) {
            break;
         }
      }
   }

   public void M(Object[] param1) {
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
      // 04: checkcast java/util/Set
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/bc.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 15728860016280
      // 1e: lxor
      // 1f: lstore 5
      // 21: dup2
      // 22: ldc2_w 14979251259808
      // 25: lxor
      // 26: lstore 7
      // 28: pop2
      // 29: ldc2_w -2690664707394770238
      // 2c: lload 3
      // 2d: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: aload 0
      // 33: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 36: astore 10
      // 38: istore 9
      // 3a: aload 10
      // 3c: arraylength
      // 3d: istore 11
      // 3f: bipush 0
      // 40: istore 12
      // 42: iload 12
      // 44: iload 11
      // 46: if_icmpge b3
      // 49: aload 10
      // 4b: iload 12
      // 4d: aaload
      // 4e: astore 13
      // 50: iload 9
      // 52: lload 3
      // 53: lconst_0
      // 54: lcmp
      // 55: ifle b0
      // 58: ifeq ae
      // 5b: aload 13
      // 5d: lload 5
      // 5f: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 62: ldc2_w -4606250574529331345
      // 65: lload 3
      // 66: invokedynamic h (JJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: if_acmpne ab
      // 6e: goto 7b
      // 71: ldc2_w -4085517868016049593
      // 74: lload 3
      // 75: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 13
      // 7d: checkcast com/zelix/x_
      // 80: aload 2
      // 81: lload 7
      // 83: bipush 2
      // 84: anewarray 177
      // 87: dup_x2
      // 88: dup_x2
      // 89: pop
      // 8a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8d: bipush 1
      // 8e: swap
      // 8f: aastore
      // 90: dup_x1
      // 91: swap
      // 92: bipush 0
      // 93: swap
      // 94: aastore
      // 95: ldc2_w -4199177386705359339
      // 98: lload 3
      // 99: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: goto ab
      // a1: ldc2_w -4085517868016049593
      // a4: lload 3
      // a5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: iinc 12 1
      // ae: iload 9
      // b0: ifne 42
      // b3: return
   }

   bc(bq var1, x_ var2, xl[] var3, int var4, short var5, int var6, short var7) {
      long var8 = ((long)var4 << 32 | (long)var5 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      super(var1);
      x44.a<"r">(this, true, 6069411612516670973L, var8);
      x44.a<"r">(this, var2, 5209793389773439321L, var8);
      this.R = var3;
      x44.a<"r">(this, var6, 5808172868241767222L, var8);
   }

   bc(h8 param1, _xx param2, int param3, _y4 param4, _y4 param5, _y4 param6, _y4 param7, long param8, PrintWriter param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/bc.a J
      // 003: lload 8
      // 005: lxor
      // 006: lstore 8
      // 008: lload 8
      // 00a: dup2
      // 00b: ldc2_w 135569145184181
      // 00e: lxor
      // 00f: lstore 11
      // 011: dup2
      // 012: ldc2_w 73478785850392
      // 015: lxor
      // 016: lstore 13
      // 018: dup2
      // 019: ldc2_w 108819718274212
      // 01c: lxor
      // 01d: dup2
      // 01e: bipush 8
      // 020: lushr
      // 021: lstore 15
      // 023: dup2
      // 024: bipush 56
      // 026: lshl
      // 027: bipush 56
      // 029: lushr
      // 02a: l2i
      // 02b: istore 17
      // 02d: pop2
      // 02e: dup2
      // 02f: ldc2_w 930981238811
      // 032: lxor
      // 033: lstore 18
      // 035: dup2
      // 036: ldc2_w 23992374946716
      // 039: lxor
      // 03a: lstore 20
      // 03c: pop2
      // 03d: aload 0
      // 03e: aload 1
      // 03f: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 042: ldc2_w 5441935730545621999
      // 045: lload 8
      // 047: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: aload 0
      // 04d: bipush 1
      // 04e: ldc2_w 5194842162099896784
      // 051: lload 8
      // 053: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: aload 0
      // 059: iload 3
      // 05a: lload 18
      // 05c: bipush 2
      // 05d: anewarray 177
      // 060: dup_x2
      // 061: dup_x2
      // 062: pop
      // 063: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 066: bipush 1
      // 067: swap
      // 068: aastore
      // 069: dup_x1
      // 06a: swap
      // 06b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06e: bipush 0
      // 06f: swap
      // 070: aastore
      // 071: ldc2_w 5243643624308175129
      // 074: lload 8
      // 076: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: aload 2
      // 07c: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 07f: istore 23
      // 081: aload 2
      // 082: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 085: istore 24
      // 087: istore 22
      // 089: aload 0
      // 08a: lload 15
      // 08c: iload 23
      // 08e: iload 17
      // 090: i2b
      // 091: invokevirtual com/zelix/bc.N (JIB)Lcom/zelix/xl;
      // 094: astore 25
      // 096: iload 22
      // 098: ifeq 0f5
      // 09b: aload 25
      // 09d: instanceof com/zelix/x_
      // 0a0: ifeq 0db
      // 0a3: goto 0b1
      // 0a6: ldc2_w 6224016636903748458
      // 0a9: lload 8
      // 0ab: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: aload 25
      // 0b4: checkcast com/zelix/x_
      // 0b7: ldc2_w 6080369275764202868
      // 0ba: lload 8
      // 0bc: invokedynamic w (Ljava/lang/Object;Lcom/zelix/x_;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: iload 22
      // 0c3: lload 8
      // 0c5: lconst_0
      // 0c6: lcmp
      // 0c7: ifle 155
      // 0ca: ifne 14a
      // 0cd: goto 0db
      // 0d0: ldc2_w 6224016636903748458
      // 0d3: lload 8
      // 0d5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: aload 0
      // 0dc: bipush 0
      // 0dd: ldc2_w 5194842162099896784
      // 0e0: lload 8
      // 0e2: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: goto 0f5
      // 0ea: ldc2_w 6224016636903748458
      // 0ed: lload 8
      // 0ef: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: new java/lang/StringBuilder
      // 0f9: dup
      // 0fa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fd: sipush 29559
      // 100: ldc2_w 9183924162684454283
      // 103: lload 8
      // 105: lxor
      // 106: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/bc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: aload 25
      // 110: lload 11
      // 112: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 115: lload 20
      // 117: dup2_x1
      // 118: pop2
      // 119: bipush 2
      // 11a: anewarray 177
      // 11d: dup_x1
      // 11e: swap
      // 11f: bipush 1
      // 120: swap
      // 121: aastore
      // 122: dup_x2
      // 123: dup_x2
      // 124: pop
      // 125: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 128: bipush 0
      // 129: swap
      // 12a: aastore
      // 12b: ldc2_w 6269565996189507659
      // 12e: lload 8
      // 130: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 138: ldc "'"
      // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 140: ldc2_w 5931360566628355850
      // 143: lload 8
      // 145: invokedynamic w (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: aload 0
      // 14b: ldc2_w 5194842162099896784
      // 14e: lload 8
      // 150: invokedynamic h (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: iload 22
      // 157: ifeq 183
      // 15a: ifeq 464
      // 15d: goto 16b
      // 160: ldc2_w 6224016636903748458
      // 163: lload 8
      // 165: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: aload 0
      // 16c: iload 24
      // 16e: anewarray 243
      // 171: putfield com/zelix/bc.R [Lcom/zelix/xl;
      // 174: bipush 0
      // 175: goto 183
      // 178: ldc2_w 6224016636903748458
      // 17b: lload 8
      // 17d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: athrow
      // 183: istore 26
      // 185: iload 26
      // 187: iload 24
      // 189: if_icmpge 464
      // 18c: aload 2
      // 18d: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 190: istore 27
      // 192: aload 0
      // 193: lload 15
      // 195: iload 27
      // 197: iload 17
      // 199: i2b
      // 19a: invokevirtual com/zelix/bc.N (JIB)Lcom/zelix/xl;
      // 19d: astore 28
      // 19f: aload 28
      // 1a1: instanceof com/zelix/x7
      // 1a4: iload 22
      // 1a6: ifeq 294
      // 1a9: ifne 281
      // 1ac: goto 1ba
      // 1af: ldc2_w 6224016636903748458
      // 1b2: lload 8
      // 1b4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: aload 28
      // 1bc: instanceof com/zelix/ab
      // 1bf: iload 22
      // 1c1: ifeq 294
      // 1c4: goto 1d2
      // 1c7: ldc2_w 6224016636903748458
      // 1ca: lload 8
      // 1cc: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: lload 8
      // 1d4: lconst_0
      // 1d5: lcmp
      // 1d6: iflt 286
      // 1d9: ifne 281
      // 1dc: goto 1ea
      // 1df: ldc2_w 6224016636903748458
      // 1e2: lload 8
      // 1e4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: aload 28
      // 1ec: instanceof com/zelix/x_
      // 1ef: iload 22
      // 1f1: ifeq 294
      // 1f4: goto 202
      // 1f7: ldc2_w 6224016636903748458
      // 1fa: lload 8
      // 1fc: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: lload 8
      // 204: lconst_0
      // 205: lcmp
      // 206: iflt 286
      // 209: ifne 281
      // 20c: goto 21a
      // 20f: ldc2_w 6224016636903748458
      // 212: lload 8
      // 214: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: aload 28
      // 21c: instanceof com/zelix/xb
      // 21f: iload 22
      // 221: ifeq 294
      // 224: goto 232
      // 227: ldc2_w 6224016636903748458
      // 22a: lload 8
      // 22c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: lload 8
      // 234: lconst_0
      // 235: lcmp
      // 236: iflt 286
      // 239: ifne 281
      // 23c: goto 24a
      // 23f: ldc2_w 6224016636903748458
      // 242: lload 8
      // 244: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: aload 28
      // 24c: instanceof com/zelix/x2
      // 24f: iload 22
      // 251: lload 8
      // 253: lconst_0
      // 254: lcmp
      // 255: ifle 296
      // 258: ifeq 294
      // 25b: goto 269
      // 25e: ldc2_w 6224016636903748458
      // 261: lload 8
      // 263: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 268: athrow
      // 269: lload 8
      // 26b: lconst_0
      // 26c: lcmp
      // 26d: iflt 436
      // 270: ifeq 3d3
      // 273: goto 281
      // 276: ldc2_w 6224016636903748458
      // 279: lload 8
      // 27b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: athrow
      // 281: aload 28
      // 283: instanceof com/zelix/md
      // 286: goto 294
      // 289: ldc2_w 6224016636903748458
      // 28c: lload 8
      // 28e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: athrow
      // 294: iload 22
      // 296: lload 8
      // 298: lconst_0
      // 299: lcmp
      // 29a: iflt 2ed
      // 29d: ifeq 2eb
      // 2a0: ifeq 2d8
      // 2a3: goto 2b1
      // 2a6: ldc2_w 6224016636903748458
      // 2a9: lload 8
      // 2ab: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: athrow
      // 2b1: aload 4
      // 2b3: aload 28
      // 2b5: checkcast com/zelix/md
      // 2b8: aload 0
      // 2b9: lload 13
      // 2bb: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 2be: iload 22
      // 2c0: lload 8
      // 2c2: lconst_0
      // 2c3: lcmp
      // 2c4: ifle 3c9
      // 2c7: ifne 3be
      // 2ca: goto 2d8
      // 2cd: ldc2_w 6224016636903748458
      // 2d0: lload 8
      // 2d2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d7: athrow
      // 2d8: aload 28
      // 2da: instanceof com/zelix/mf
      // 2dd: goto 2eb
      // 2e0: ldc2_w 6224016636903748458
      // 2e3: lload 8
      // 2e5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: athrow
      // 2eb: iload 22
      // 2ed: lload 8
      // 2ef: lconst_0
      // 2f0: lcmp
      // 2f1: ifle 34b
      // 2f4: ifeq 342
      // 2f7: ifeq 32f
      // 2fa: goto 308
      // 2fd: ldc2_w 6224016636903748458
      // 300: lload 8
      // 302: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: athrow
      // 308: aload 5
      // 30a: aload 28
      // 30c: checkcast com/zelix/mf
      // 30f: aload 0
      // 310: lload 13
      // 312: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 315: iload 22
      // 317: lload 8
      // 319: lconst_0
      // 31a: lcmp
      // 31b: iflt 3c9
      // 31e: ifne 3be
      // 321: goto 32f
      // 324: ldc2_w 6224016636903748458
      // 327: lload 8
      // 329: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32e: athrow
      // 32f: aload 28
      // 331: instanceof com/zelix/ms
      // 334: goto 342
      // 337: ldc2_w 6224016636903748458
      // 33a: lload 8
      // 33c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: lload 8
      // 344: lconst_0
      // 345: lcmp
      // 346: ifle 399
      // 349: iload 22
      // 34b: ifeq 399
      // 34e: ifeq 386
      // 351: goto 35f
      // 354: ldc2_w 6224016636903748458
      // 357: lload 8
      // 359: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35e: athrow
      // 35f: aload 6
      // 361: aload 28
      // 363: checkcast com/zelix/ms
      // 366: aload 0
      // 367: lload 13
      // 369: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 36c: iload 22
      // 36e: lload 8
      // 370: lconst_0
      // 371: lcmp
      // 372: iflt 3c9
      // 375: ifne 3be
      // 378: goto 386
      // 37b: ldc2_w 6224016636903748458
      // 37e: lload 8
      // 380: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: athrow
      // 386: aload 28
      // 388: instanceof com/zelix/x7
      // 38b: goto 399
      // 38e: ldc2_w 6224016636903748458
      // 391: lload 8
      // 393: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: athrow
      // 399: lload 8
      // 39b: lconst_0
      // 39c: lcmp
      // 39d: iflt 3c9
      // 3a0: ifeq 3be
      // 3a3: aload 7
      // 3a5: aload 28
      // 3a7: checkcast com/zelix/x7
      // 3aa: aload 0
      // 3ab: lload 13
      // 3ad: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 3b0: goto 3be
      // 3b3: ldc2_w 6224016636903748458
      // 3b6: lload 8
      // 3b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bd: athrow
      // 3be: aload 0
      // 3bf: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 3c2: iload 26
      // 3c4: aload 28
      // 3c6: aastore
      // 3c7: iload 22
      // 3c9: lload 8
      // 3cb: lconst_0
      // 3cc: lcmp
      // 3cd: iflt 44c
      // 3d0: ifne 447
      // 3d3: aload 0
      // 3d4: bipush 0
      // 3d5: ldc2_w 5194842162099896784
      // 3d8: lload 8
      // 3da: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3df: aload 0
      // 3e0: new java/lang/StringBuilder
      // 3e3: dup
      // 3e4: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e7: sipush 10860
      // 3ea: ldc2_w 8490418594895223954
      // 3ed: lload 8
      // 3ef: lxor
      // 3f0: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/bc.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f8: aload 28
      // 3fa: lload 11
      // 3fc: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 3ff: lload 20
      // 401: dup2_x1
      // 402: pop2
      // 403: bipush 2
      // 404: anewarray 177
      // 407: dup_x1
      // 408: swap
      // 409: bipush 1
      // 40a: swap
      // 40b: aastore
      // 40c: dup_x2
      // 40d: dup_x2
      // 40e: pop
      // 40f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 412: bipush 0
      // 413: swap
      // 414: aastore
      // 415: ldc2_w 6269565996189507659
      // 418: lload 8
      // 41a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 422: ldc "'"
      // 424: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 427: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 42a: ldc2_w 5931360566628355850
      // 42d: lload 8
      // 42f: invokedynamic w (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 434: iload 22
      // 436: ifne 464
      // 439: goto 447
      // 43c: ldc2_w 6224016636903748458
      // 43f: lload 8
      // 441: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 446: athrow
      // 447: iinc 26 1
      // 44a: iload 22
      // 44c: ifne 185
      // 44f: lload 8
      // 451: lconst_0
      // 452: lcmp
      // 453: iflt 19f
      // 456: goto 464
      // 459: ldc2_w 6224016636903748458
      // 45c: lload 8
      // 45e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 463: athrow
      // 464: return
   }

   public void x(Object[] param1) {
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
      // 0a: lstore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/md
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/md
      // 19: astore 3
      // 1a: pop
      // 1b: ldc2_w -597385177152239649
      // 1e: lload 4
      // 20: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: bipush 0
      // 26: istore 7
      // 28: istore 6
      // 2a: iload 7
      // 2c: aload 0
      // 2d: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 30: arraylength
      // 31: if_icmpge 98
      // 34: aload 0
      // 35: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 38: iload 7
      // 3a: lload 4
      // 3c: lconst_0
      // 3d: lcmp
      // 3e: ifle 6d
      // 41: iload 6
      // 43: ifeq 6d
      // 46: aaload
      // 47: aload 2
      // 48: if_acmpne 7b
      // 4b: goto 59
      // 4e: ldc2_w -1562699825631703206
      // 51: lload 4
      // 53: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 5d: iload 7
      // 5f: goto 6d
      // 62: ldc2_w -1562699825631703206
      // 65: lload 4
      // 67: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: aload 3
      // 6e: aastore
      // 6f: iload 6
      // 71: lload 4
      // 73: lconst_0
      // 74: lcmp
      // 75: iflt 80
      // 78: ifne 98
      // 7b: iinc 7 1
      // 7e: iload 6
      // 80: ifne 2a
      // 83: lload 4
      // 85: lconst_0
      // 86: lcmp
      // 87: ifle 34
      // 8a: goto 98
      // 8d: ldc2_w -1562699825631703206
      // 90: lload 4
      // 92: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: return
   }

   void m(Object[] var1) {
      int var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      x44.a<"w">(this, var2, 7665093354428465651L, var3);
   }

   boolean T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, 9179890620905617058L, var2);
   }

   public int t(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"j">(this, -3896179550485667263L, var2);
   }

   public void W(Object[] param1) {
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
      // 04: checkcast com/zelix/mf
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/mf
      // 19: astore 4
      // 1b: pop
      // 1c: ldc2_w 4194774374640324210
      // 1f: lload 2
      // 20: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: bipush 0
      // 26: istore 7
      // 28: istore 6
      // 2a: iload 7
      // 2c: aload 0
      // 2d: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 30: arraylength
      // 31: if_icmpge 94
      // 34: aload 0
      // 35: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 38: iload 7
      // 3a: lload 2
      // 3b: lconst_0
      // 3c: lcmp
      // 3d: iflt 6b
      // 40: iload 6
      // 42: ifne 6b
      // 45: aaload
      // 46: aload 5
      // 48: if_acmpne 79
      // 4b: goto 58
      // 4e: ldc2_w 4225569374861369262
      // 51: lload 2
      // 52: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 5c: iload 7
      // 5e: goto 6b
      // 61: ldc2_w 4225569374861369262
      // 64: lload 2
      // 65: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 4
      // 6d: aastore
      // 6e: iload 6
      // 70: lload 2
      // 71: lconst_0
      // 72: lcmp
      // 73: ifle 7e
      // 76: ifeq 94
      // 79: iinc 7 1
      // 7c: iload 6
      // 7e: ifeq 2a
      // 81: lload 2
      // 82: lconst_0
      // 83: lcmp
      // 84: ifle 34
      // 87: goto 94
      // 8a: ldc2_w 4225569374861369262
      // 8d: lload 2
      // 8e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: return
   }

   public x_ Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"i">(this, -7606359022519115931L, var2);
   }

   public String S(Object[] param1) {
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
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Integer
      // 12: invokevirtual java/lang/Integer.intValue ()I
      // 15: istore 2
      // 16: dup
      // 17: bipush 2
      // 18: aaload
      // 19: checkcast java/lang/Integer
      // 1c: invokevirtual java/lang/Integer.intValue ()I
      // 1f: istore 3
      // 20: pop
      // 21: iload 4
      // 23: i2l
      // 24: bipush 32
      // 26: lshl
      // 27: iload 2
      // 28: i2l
      // 29: bipush 48
      // 2b: lshl
      // 2c: bipush 32
      // 2e: lushr
      // 2f: lor
      // 30: iload 3
      // 31: i2l
      // 32: bipush 48
      // 34: lshl
      // 35: bipush 48
      // 37: lushr
      // 38: lor
      // 39: getstatic com/zelix/bc.a J
      // 3c: lxor
      // 3d: lstore 5
      // 3f: lload 5
      // 41: dup2
      // 42: ldc2_w 12035359205941
      // 45: lxor
      // 46: lstore 7
      // 48: pop2
      // 49: ldc2_w -6128965196393570635
      // 4c: lload 5
      // 4e: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: istore 9
      // 55: aload 0
      // 56: ldc2_w -6313331140034223753
      // 59: lload 5
      // 5b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: iload 9
      // 62: ifne 8f
      // 65: ifnull a9
      // 68: goto 76
      // 6b: ldc2_w -6168977918190809239
      // 6e: lload 5
      // 70: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: athrow
      // 76: aload 0
      // 77: ldc2_w -6313331140034223753
      // 7a: lload 5
      // 7c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: goto 8f
      // 84: ldc2_w -6168977918190809239
      // 87: lload 5
      // 89: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: lload 7
      // 91: bipush 1
      // 92: anewarray 177
      // 95: dup_x2
      // 96: dup_x2
      // 97: pop
      // 98: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9b: bipush 0
      // 9c: swap
      // 9d: aastore
      // 9e: ldc2_w -6290601633714310557
      // a1: lload 5
      // a3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: areturn
      // a9: aconst_null
      // aa: areturn
   }

   public void q(Object[] param1) {
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
      // 004: checkcast java/util/Set
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/util/Set
      // 015: astore 5
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/util/Set
      // 01d: astore 4
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 6
      // 02a: pop
      // 02b: getstatic com/zelix/bc.a J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 62262717378061
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 115996085105301
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 28856157316161
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 12345403295697
      // 04e: lxor
      // 04f: lstore 14
      // 051: dup2
      // 052: ldc2_w 61288461420153
      // 055: lxor
      // 056: lstore 16
      // 058: dup2
      // 059: ldc2_w 50465987047971
      // 05c: lxor
      // 05d: dup2
      // 05e: bipush 48
      // 060: lushr
      // 061: l2i
      // 062: istore 18
      // 064: dup2
      // 065: bipush 16
      // 067: lshl
      // 068: bipush 16
      // 06a: lushr
      // 06b: lstore 19
      // 06d: pop2
      // 06e: dup2
      // 06f: ldc2_w 76143968410753
      // 072: lxor
      // 073: lstore 21
      // 075: pop2
      // 076: ldc2_w 5796628346264707099
      // 079: lload 6
      // 07b: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: aload 0
      // 081: ldc2_w 5734681935186478720
      // 084: lload 6
      // 086: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: aload 3
      // 08c: aload 2
      // 08d: aload 5
      // 08f: aload 4
      // 091: lload 8
      // 093: bipush 5
      // 094: anewarray 177
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 4
      // 09e: swap
      // 09f: aastore
      // 0a0: dup_x1
      // 0a1: swap
      // 0a2: bipush 3
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: bipush 2
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 1
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: bipush 0
      // 0b2: swap
      // 0b3: aastore
      // 0b4: ldc2_w 5493546492768150061
      // 0b7: lload 6
      // 0b9: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: aload 0
      // 0bf: getfield com/zelix/bc.R [Lcom/zelix/xl;
      // 0c2: astore 24
      // 0c4: aload 24
      // 0c6: arraylength
      // 0c7: istore 25
      // 0c9: istore 23
      // 0cb: bipush 0
      // 0cc: istore 26
      // 0ce: iload 26
      // 0d0: iload 25
      // 0d2: if_icmpge 2fa
      // 0d5: aload 24
      // 0d7: iload 26
      // 0d9: aaload
      // 0da: astore 27
      // 0dc: iload 23
      // 0de: lload 6
      // 0e0: lconst_0
      // 0e1: lcmp
      // 0e2: ifle 0fd
      // 0e5: ifeq 2f5
      // 0e8: ldc2_w 6287043434141279780
      // 0eb: lload 6
      // 0ed: invokedynamic i (JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: aload 27
      // 0f4: lload 12
      // 0f6: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 0f9: invokevirtual com/zelix/w5.ordinal ()I
      // 0fc: iaload
      // 0fd: lload 6
      // 0ff: lconst_0
      // 100: lcmp
      // 101: ifle 145
      // 104: tableswitch 494 1 9 63 63 63 63 63 82 274 349 424
      // 138: ldc2_w 5590171470312040606
      // 13b: lload 6
      // 13d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: athrow
      // 143: iload 23
      // 145: ifne 2f2
      // 148: goto 156
      // 14b: ldc2_w 5590171470312040606
      // 14e: lload 6
      // 150: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: aload 27
      // 158: checkcast com/zelix/x7
      // 15b: lload 14
      // 15d: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 160: astore 28
      // 162: iload 18
      // 164: i2c
      // 165: lload 19
      // 167: aload 28
      // 169: invokestatic com/zelix/xl.C (CJLjava/lang/String;)Lcom/zelix/hy;
      // 16c: astore 29
      // 16e: aload 0
      // 16f: lload 21
      // 171: aload 29
      // 173: ldc2_w 6239504857223741086
      // 176: lload 6
      // 178: invokedynamic h (Ljava/lang/Object;JLjava/lang/Object;JJ)Lcom/zelix/hy; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: astore 29
      // 17f: iload 23
      // 181: lload 6
      // 183: lconst_0
      // 184: lcmp
      // 185: iflt 2f7
      // 188: ifeq 2f5
      // 18b: aload 29
      // 18d: ifnull 2f2
      // 190: goto 19e
      // 193: ldc2_w 5590171470312040606
      // 196: lload 6
      // 198: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: aload 28
      // 1a0: ldc "["
      // 1a2: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 1a5: lload 6
      // 1a7: lconst_0
      // 1a8: lcmp
      // 1a9: ifle 20c
      // 1ac: iload 23
      // 1ae: ifeq 209
      // 1b1: goto 1bf
      // 1b4: ldc2_w 5590171470312040606
      // 1b7: lload 6
      // 1b9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: athrow
      // 1bf: lload 6
      // 1c1: lconst_0
      // 1c2: lcmp
      // 1c3: ifle 1fb
      // 1c6: ifne 1f3
      // 1c9: goto 1d7
      // 1cc: ldc2_w 5590171470312040606
      // 1cf: lload 6
      // 1d1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: aload 2
      // 1d8: aload 29
      // 1da: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1df: pop
      // 1e0: iload 23
      // 1e2: ifne 2f2
      // 1e5: goto 1f3
      // 1e8: ldc2_w 5590171470312040606
      // 1eb: lload 6
      // 1ed: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: aload 3
      // 1f4: aload 29
      // 1f6: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1fb: goto 209
      // 1fe: ldc2_w 5590171470312040606
      // 201: lload 6
      // 203: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: athrow
      // 209: pop
      // 20a: iload 23
      // 20c: lload 6
      // 20e: lconst_0
      // 20f: lcmp
      // 210: ifle 250
      // 213: ifne 2f2
      // 216: aload 27
      // 218: checkcast com/zelix/x_
      // 21b: aload 3
      // 21c: aload 2
      // 21d: aload 5
      // 21f: aload 4
      // 221: lload 8
      // 223: bipush 5
      // 224: anewarray 177
      // 227: dup_x2
      // 228: dup_x2
      // 229: pop
      // 22a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22d: bipush 4
      // 22e: swap
      // 22f: aastore
      // 230: dup_x1
      // 231: swap
      // 232: bipush 3
      // 233: swap
      // 234: aastore
      // 235: dup_x1
      // 236: swap
      // 237: bipush 2
      // 238: swap
      // 239: aastore
      // 23a: dup_x1
      // 23b: swap
      // 23c: bipush 1
      // 23d: swap
      // 23e: aastore
      // 23f: dup_x1
      // 240: swap
      // 241: bipush 0
      // 242: swap
      // 243: aastore
      // 244: ldc2_w 5493546492768150061
      // 247: lload 6
      // 249: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: iload 23
      // 250: ifne 2f2
      // 253: goto 261
      // 256: ldc2_w 5590171470312040606
      // 259: lload 6
      // 25b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 260: athrow
      // 261: aload 27
      // 263: checkcast com/zelix/xb
      // 266: aload 3
      // 267: lload 16
      // 269: aload 2
      // 26a: aload 5
      // 26c: aload 4
      // 26e: bipush 5
      // 26f: anewarray 177
      // 272: dup_x1
      // 273: swap
      // 274: bipush 4
      // 275: swap
      // 276: aastore
      // 277: dup_x1
      // 278: swap
      // 279: bipush 3
      // 27a: swap
      // 27b: aastore
      // 27c: dup_x1
      // 27d: swap
      // 27e: bipush 2
      // 27f: swap
      // 280: aastore
      // 281: dup_x2
      // 282: dup_x2
      // 283: pop
      // 284: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 287: bipush 1
      // 288: swap
      // 289: aastore
      // 28a: dup_x1
      // 28b: swap
      // 28c: bipush 0
      // 28d: swap
      // 28e: aastore
      // 28f: ldc2_w 5649996688038178032
      // 292: lload 6
      // 294: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 299: iload 23
      // 29b: ifne 2f2
      // 29e: goto 2ac
      // 2a1: ldc2_w 5590171470312040606
      // 2a4: lload 6
      // 2a6: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: athrow
      // 2ac: aload 27
      // 2ae: checkcast com/zelix/x2
      // 2b1: aload 3
      // 2b2: lload 10
      // 2b4: aload 2
      // 2b5: aload 5
      // 2b7: aload 4
      // 2b9: bipush 5
      // 2ba: anewarray 177
      // 2bd: dup_x1
      // 2be: swap
      // 2bf: bipush 4
      // 2c0: swap
      // 2c1: aastore
      // 2c2: dup_x1
      // 2c3: swap
      // 2c4: bipush 3
      // 2c5: swap
      // 2c6: aastore
      // 2c7: dup_x1
      // 2c8: swap
      // 2c9: bipush 2
      // 2ca: swap
      // 2cb: aastore
      // 2cc: dup_x2
      // 2cd: dup_x2
      // 2ce: pop
      // 2cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d2: bipush 1
      // 2d3: swap
      // 2d4: aastore
      // 2d5: dup_x1
      // 2d6: swap
      // 2d7: bipush 0
      // 2d8: swap
      // 2d9: aastore
      // 2da: ldc2_w 5675956387497300731
      // 2dd: lload 6
      // 2df: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: goto 2f2
      // 2e7: ldc2_w 5590171470312040606
      // 2ea: lload 6
      // 2ec: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f1: athrow
      // 2f2: iinc 26 1
      // 2f5: iload 23
      // 2f7: ifne 0ce
      // 2fa: return
   }

   int h(Object[] var1) {
      return 4 + this.R.length * 2;
   }

   static {
      long var11 = a ^ 34629211124241L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[4];
      int var18 = 0;
      String var17 = "Zåî ;34\u008b6\u0018\u000e\u001e\u0017  \u0006HÜ·§x½\u009d\u008eÆ$\u009a\u008cU¹\u000esÙ\u0089P\u0011±e\u0098j\u0097¥1û×#K\rbO0ì6Äm»\u001d\u0081\u0091¤%yK?Õð\u0094\u008cÙø¯ÿ\u0081<\u001d\u0090Q\u0080+\u001e\u0007/£÷Î1\u009d\u0096¡";
      int var19 = "Zåî ;34\u008b6\u0018\u000e\u001e\u0017  \u0006HÜ·§x½\u009d\u008eÆ$\u009a\u008cU¹\u000esÙ\u0089P\u0011±e\u0098j\u0097¥1û×#K\rbO0ì6Äm»\u001d\u0081\u0091¤%yK?Õð\u0094\u008cÙø¯ÿ\u0081<\u001d\u0090Q\u0080+\u001e\u0007/£÷Î1\u009d\u0096¡"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[4];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[7];
                     int var3 = 0;
                     String var4 = "µ\fYô÷8\"\u000e»\u000fk\u001b\u00890&mÀ¤?>\u0091)óvNkAôX6ÿÛt\u0084AÌ\\¹nÅ";
                     int var5 = "µ\fYô÷8\"\u000e»\u000fk\u001b\u00890&mÀ¤?>\u0091)óvNkAôX6ÿÛt\u0084AÌ\\¹nÅ".length();
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
                                    e = var6;
                                    f = new Integer[7];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "î`\u000fõ\u008cwÁ?¨úg1÷ »I";
                                 var5 = "î`\u000fõ\u008cwÁ?¨úg1÷ »I".length();
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

                  var17 = "f5â\u008e;\u0082!¿ñ\u009f'§*fUV \u000b¸#\u0091:IÓ¡8µ\u009dÌÔ!íBÁ\u0003h\rÃ\u0000\u009d÷¥\u0004\u0010Â\u001a¥»\u0087¬Éh>\u009bÒÖ@0R£Ñ\u008c\u008dÏb/;\u008dz(&¹_\u0000,5Bc \u001e&\u00ad\u0095\u008ddnÑì§\u0012xnào¢¯.Ô´C3 I\u0018n´·Ú\u00ad\u0086çe\u00132\u0002{Õb\u009a\f`";
                  var19 = "f5â\u008e;\u0082!¿ñ\u009f'§*fUV \u000b¸#\u0091:IÓ¡8µ\u009dÌÔ!íBÁ\u0003h\rÃ\u0000\u009d÷¥\u0004\u0010Â\u001a¥»\u0087¬Éh>\u009bÒÖ@0R£Ñ\u008c\u008dÏb/;\u008dz(&¹_\u0000,5Bc \u001e&\u00ad\u0095\u008ddnÑì§\u0012xnào¢¯.Ô´C3 I\u0018n´·Ú\u00ad\u0086çe\u00132\u0002{Õb\u009a\f`"
                     .length();
                  var16 = '8';
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

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12760;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/bc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/bc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30758;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/bc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/bc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
