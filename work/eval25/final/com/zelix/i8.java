package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class i8 extends h8 implements _zv, Comparable {
   final String g;
   final String e;
   private int p;
   h2 T = new h2(this);
   mx C;
   int j;
   h4[] J;
   mx w;
   int F;
   private static final long c = ess.a(1864313067709495898L, 157983487652645793L, MethodHandles.lookup().lookupClass()).a(49352748464617L);
   private static final String[] f;
   private static final String[] n;
   private static final Map r = new HashMap(13);
   private static final long[] E;
   private static final Integer[] G;
   private static final Map I;

   public final boolean C(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/i8.c J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 101740668547128
      // 0b: lxor
      // 0c: dup2
      // 0d: bipush 48
      // 0f: lushr
      // 10: l2i
      // 11: istore 3
      // 12: dup2
      // 13: bipush 16
      // 15: lshl
      // 16: bipush 32
      // 18: lushr
      // 19: l2i
      // 1a: istore 4
      // 1c: dup2
      // 1d: bipush 48
      // 1f: lshl
      // 20: bipush 48
      // 22: lushr
      // 23: l2i
      // 24: istore 5
      // 26: pop2
      // 27: dup2
      // 28: ldc2_w 80178995110578
      // 2b: lxor
      // 2c: lstore 6
      // 2e: pop2
      // 2f: ldc2_w -866729941279849582
      // 32: lload 1
      // 33: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: istore 8
      // 3a: aload 0
      // 3b: getfield com/zelix/i8.T Lcom/zelix/h2;
      // 3e: iload 3
      // 3f: i2s
      // 40: iload 4
      // 42: iload 5
      // 44: i2c
      // 45: invokevirtual com/zelix/h2.T (SIC)Z
      // 48: iload 8
      // 4a: ifeq 73
      // 4d: ifeq 8c
      // 50: goto 5d
      // 53: ldc2_w -1168076508629914858
      // 56: lload 1
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: getfield com/zelix/i8.T Lcom/zelix/h2;
      // 61: lload 6
      // 63: invokevirtual com/zelix/h2.l (J)Z
      // 66: goto 73
      // 69: ldc2_w -1168076508629914858
      // 6c: lload 1
      // 6d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: iload 8
      // 75: ifeq 89
      // 78: ifne 8c
      // 7b: goto 88
      // 7e: ldc2_w -1168076508629914858
      // 81: lload 1
      // 82: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: athrow
      // 88: bipush 1
      // 89: goto 8d
      // 8c: bipush 0
      // 8d: ireturn
   }

   public final boolean Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 30798089230749L;
      boolean var6 = x44.a<"t">(-3596794189196165505L, var2);

      try {
         boolean var10000 = this.V(var4, 1);
         if (!var6) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var7) {
         throw x44.a<"t">(var7, -3303540330091604229L, var2);
      }

      return false;
   }

   public String z() {
      return this.e;
   }

   public final boolean t(long var1) {
      var1 = c ^ var1;
      long var3 = var1 ^ 91700082250960L;
      return this.T.l(var3);
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = c ^ 126137820341931L;
      long var4 = var2 ^ 121306368875402L;
      return x44.a<"o">(this, new Object[]{var4, (i8)var1}, 3337312187226879258L, var2);
   }

   void G(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/xl
      // 011: astore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/xl
      // 019: astore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/io/PrintWriter
      // 021: astore 4
      // 023: pop
      // 024: getstatic com/zelix/i8.c J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 79998533993423
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 38315164842520
      // 036: lxor
      // 037: lstore 9
      // 039: pop2
      // 03a: ldc2_w 45539059504067813
      // 03d: lload 2
      // 03e: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: istore 11
      // 045: iload 11
      // 047: ifne 0a9
      // 04a: aload 5
      // 04c: instanceof com/zelix/mx
      // 04f: ifeq 07a
      // 052: goto 05f
      // 055: ldc2_w 136318354830345528
      // 058: lload 2
      // 059: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: lload 2
      // 060: lconst_0
      // 061: lcmp
      // 062: ifle 10b
      // 065: aload 6
      // 067: instanceof com/zelix/mx
      // 06a: ifne 0f9
      // 06d: goto 07a
      // 070: ldc2_w 136318354830345528
      // 073: lload 2
      // 074: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 0
      // 07b: bipush 0
      // 07c: lload 7
      // 07e: bipush 2
      // 07f: anewarray 442
      // 082: dup_x2
      // 083: dup_x2
      // 084: pop
      // 085: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 088: bipush 1
      // 089: swap
      // 08a: aastore
      // 08b: dup_x1
      // 08c: swap
      // 08d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 090: bipush 0
      // 091: swap
      // 092: aastore
      // 093: ldc2_w 2059299904124125685
      // 096: lload 2
      // 097: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: goto 0a9
      // 09f: ldc2_w 136318354830345528
      // 0a2: lload 2
      // 0a3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a8: athrow
      // 0a9: new com/zelix/_sx
      // 0ac: dup
      // 0ad: new java/lang/StringBuilder
      // 0b0: dup
      // 0b1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b4: aload 0
      // 0b5: lload 9
      // 0b7: invokevirtual com/zelix/i8.j (J)Ljava/lang/String;
      // 0ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bd: sipush 13109
      // 0c0: ldc2_w 493597932563081743
      // 0c3: lload 2
      // 0c4: lxor
      // 0c5: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: sipush 24310
      // 0d0: ldc2_w 2747408216086202308
      // 0d3: lload 2
      // 0d4: lxor
      // 0d5: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: sipush 19258
      // 0e0: ldc2_w 9044653065560445455
      // 0e3: lload 2
      // 0e4: lxor
      // 0e5: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: ldc ""
      // 0ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f5: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: aload 5
      // 0fc: checkcast com/zelix/mx
      // 0ff: putfield com/zelix/i8.C Lcom/zelix/mx;
      // 102: aload 0
      // 103: aload 6
      // 105: checkcast com/zelix/mx
      // 108: putfield com/zelix/i8.w Lcom/zelix/mx;
      // 10b: return
   }

   public final boolean Z(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 138005794567170L;
      return this.T.F(var4);
   }

   public final boolean z(Object[] param1) {
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
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/i8.c J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: ldc2_w -1779017795590237429
      // 1f: lload 3
      // 20: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 5
      // 27: aload 0
      // 28: getfield com/zelix/i8.T Lcom/zelix/h2;
      // 2b: invokevirtual com/zelix/h2.n ()I
      // 2e: iload 2
      // 2f: iand
      // 30: iload 5
      // 32: ifne 54
      // 35: iload 2
      // 36: if_icmpne 57
      // 39: goto 46
      // 3c: ldc2_w -1870632223689104682
      // 3f: lload 3
      // 40: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: bipush 1
      // 47: goto 54
      // 4a: ldc2_w -1870632223689104682
      // 4d: lload 3
      // 4e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public final boolean l(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 62998692813313L;
      return x44.a<"o">(this.T, new Object[]{var4}, -6195118756076946630L, var2);
   }

   void n(Object[] param1) {
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
      // 00e: ldc2_w 73445336255536
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 299602313055
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 51455251547580
      // 01f: lxor
      // 020: lstore 8
      // 022: dup2
      // 023: ldc2_w 76567383174732
      // 026: lxor
      // 027: lstore 10
      // 029: pop2
      // 02a: ldc2_w 1051008887860116177
      // 02d: lload 2
      // 02e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: new java/util/ArrayList
      // 036: dup
      // 037: aload 0
      // 038: getfield com/zelix/i8.F I
      // 03b: invokespecial java/util/ArrayList.<init> (I)V
      // 03e: astore 13
      // 040: istore 12
      // 042: aload 0
      // 043: lload 10
      // 045: bipush 1
      // 046: anewarray 442
      // 049: dup_x2
      // 04a: dup_x2
      // 04b: pop
      // 04c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 04f: bipush 0
      // 050: swap
      // 051: aastore
      // 052: ldc2_w 1580671241147794488
      // 055: lload 2
      // 056: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: iload 12
      // 05d: ifne 099
      // 060: ifne 1f2
      // 063: goto 070
      // 066: ldc2_w 1139527636705102604
      // 069: lload 2
      // 06a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: aload 0
      // 071: getfield com/zelix/i8.T Lcom/zelix/h2;
      // 074: lload 8
      // 076: bipush 1
      // 077: anewarray 442
      // 07a: dup_x2
      // 07b: dup_x2
      // 07c: pop
      // 07d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 080: bipush 0
      // 081: swap
      // 082: aastore
      // 083: ldc2_w 800948672149115486
      // 086: lload 2
      // 087: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: goto 099
      // 08f: ldc2_w 1139527636705102604
      // 092: lload 2
      // 093: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: iload 12
      // 09b: ifne 0de
      // 09e: ifeq 0dd
      // 0a1: goto 0ae
      // 0a4: ldc2_w 1139527636705102604
      // 0a7: lload 2
      // 0a8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: bipush 0
      // 0b0: lload 4
      // 0b2: bipush 2
      // 0b3: anewarray 442
      // 0b6: dup_x2
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bc: bipush 1
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x1
      // 0c0: swap
      // 0c1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c4: bipush 0
      // 0c5: swap
      // 0c6: aastore
      // 0c7: ldc2_w 1028174999726439149
      // 0ca: lload 2
      // 0cb: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: goto 0dd
      // 0d3: ldc2_w 1139527636705102604
      // 0d6: lload 2
      // 0d7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: athrow
      // 0dd: bipush 0
      // 0de: istore 14
      // 0e0: iload 14
      // 0e2: aload 0
      // 0e3: getfield com/zelix/i8.F I
      // 0e6: if_icmpge 14a
      // 0e9: aload 0
      // 0ea: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 0ed: iload 14
      // 0ef: aaload
      // 0f0: instanceof com/zelix/b3
      // 0f3: iload 12
      // 0f5: lload 2
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 15d
      // 0fb: ifne 15b
      // 0fe: iload 12
      // 100: ifne 141
      // 103: goto 110
      // 106: ldc2_w 1139527636705102604
      // 109: lload 2
      // 10a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: lload 2
      // 111: lconst_0
      // 112: lcmp
      // 113: ifle 147
      // 116: ifne 142
      // 119: goto 126
      // 11c: ldc2_w 1139527636705102604
      // 11f: lload 2
      // 120: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: aload 13
      // 128: aload 0
      // 129: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 12c: iload 14
      // 12e: aaload
      // 12f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 134: goto 141
      // 137: ldc2_w 1139527636705102604
      // 13a: lload 2
      // 13b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: pop
      // 142: iinc 14 1
      // 145: iload 12
      // 147: ifeq 0e0
      // 14a: aload 13
      // 14c: invokeinterface java/util/List.size ()I 1
      // 151: istore 14
      // 153: lload 2
      // 154: lconst_0
      // 155: lcmp
      // 156: iflt 0e9
      // 159: iload 14
      // 15b: iload 12
      // 15d: lload 2
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 16a
      // 163: ifne 191
      // 166: aload 0
      // 167: getfield com/zelix/i8.F I
      // 16a: if_icmpge 1f2
      // 16d: goto 17a
      // 170: ldc2_w 1139527636705102604
      // 173: lload 2
      // 174: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: aload 0
      // 17b: iload 14
      // 17d: anewarray 101
      // 180: putfield com/zelix/i8.J [Lcom/zelix/h4;
      // 183: bipush 0
      // 184: goto 191
      // 187: ldc2_w 1139527636705102604
      // 18a: lload 2
      // 18b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: istore 15
      // 193: iload 15
      // 195: iload 14
      // 197: if_icmpge 1d3
      // 19a: aload 0
      // 19b: lload 2
      // 19c: lconst_0
      // 19d: lcmp
      // 19e: iflt 1da
      // 1a1: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 1a4: iload 15
      // 1a6: aload 13
      // 1a8: iload 15
      // 1aa: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1af: checkcast com/zelix/h4
      // 1b2: aastore
      // 1b3: iinc 15 1
      // 1b6: iload 12
      // 1b8: ifne 1d9
      // 1bb: iload 12
      // 1bd: ifeq 193
      // 1c0: lload 2
      // 1c1: lconst_0
      // 1c2: lcmp
      // 1c3: ifle 1b6
      // 1c6: goto 1d3
      // 1c9: ldc2_w 1139527636705102604
      // 1cc: lload 2
      // 1cd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: athrow
      // 1d3: aload 0
      // 1d4: iload 14
      // 1d6: putfield com/zelix/i8.F I
      // 1d9: aload 0
      // 1da: lload 6
      // 1dc: bipush 1
      // 1dd: anewarray 442
      // 1e0: dup_x2
      // 1e1: dup_x2
      // 1e2: pop
      // 1e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1e6: bipush 0
      // 1e7: swap
      // 1e8: aastore
      // 1e9: ldc2_w 1416126962405695033
      // 1ec: lload 2
      // 1ed: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: return
   }

   public final void Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 48536106999756L;
      x44.a<"j">(this.T, new Object[]{var4}, -3723531543563811900L, var2);
   }

   void P(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 2367071144581
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -6926266835609605212
      // 18: lload 2
      // 19: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: bipush 0
      // 1f: istore 7
      // 21: istore 6
      // 23: iload 7
      // 25: aload 0
      // 26: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 29: arraylength
      // 2a: if_icmpge 89
      // 2d: aload 0
      // 2e: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 31: iload 7
      // 33: aaload
      // 34: iload 6
      // 36: ifne 66
      // 39: instanceof com/zelix/_yl
      // 3c: lload 2
      // 3d: lconst_0
      // 3e: lcmp
      // 3f: ifle 86
      // 42: ifeq 81
      // 45: goto 52
      // 48: ldc2_w -7015077319978395015
      // 4b: lload 2
      // 4c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: aload 0
      // 53: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 56: iload 7
      // 58: aaload
      // 59: goto 66
      // 5c: ldc2_w -7015077319978395015
      // 5f: lload 2
      // 60: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: checkcast com/zelix/_yl
      // 69: lload 4
      // 6b: bipush 1
      // 6c: anewarray 442
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w -7039798464822978986
      // 7b: lload 2
      // 7c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: iinc 7 1
      // 84: iload 6
      // 86: ifeq 23
      // 89: lload 2
      // 8a: lconst_0
      // 8b: lcmp
      // 8c: iflt 2d
      // 8f: return
   }

   public Set q(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/i8.c J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 134956151272568
      // 0b: lxor
      // 0c: lstore 3
      // 0d: dup2
      // 0e: ldc2_w 72764161583740
      // 11: lxor
      // 12: lstore 5
      // 14: pop2
      // 15: ldc2_w 4627325806645571677
      // 18: lload 1
      // 19: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: lload 5
      // 20: sipush 9280
      // 23: ldc2_w 7889961344851284353
      // 26: lload 1
      // 27: lxor
      // 28: invokedynamic o (IJ)I bsm=com/zelix/i8.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: bipush 2
      // 2e: anewarray 442
      // 31: dup_x1
      // 32: swap
      // 33: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 36: bipush 1
      // 37: swap
      // 38: aastore
      // 39: dup_x2
      // 3a: dup_x2
      // 3b: pop
      // 3c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f: bipush 0
      // 40: swap
      // 41: aastore
      // 42: ldc2_w 6381882877852244357
      // 45: lload 1
      // 46: invokedynamic v (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: astore 8
      // 4d: istore 7
      // 4f: bipush 0
      // 50: istore 9
      // 52: iload 9
      // 54: aload 0
      // 55: getfield com/zelix/i8.F I
      // 58: if_icmpge ef
      // 5b: aload 0
      // 5c: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 5f: iload 9
      // 61: aaload
      // 62: iload 7
      // 64: ifeq 8e
      // 67: instanceof com/zelix/bs
      // 6a: ifeq e7
      // 6d: goto 7a
      // 70: ldc2_w 6630839491280509145
      // 73: lload 1
      // 74: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 7e: iload 9
      // 80: aaload
      // 81: goto 8e
      // 84: ldc2_w 6630839491280509145
      // 87: lload 1
      // 88: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: athrow
      // 8e: checkcast com/zelix/bs
      // 91: lload 3
      // 92: bipush 1
      // 93: anewarray 442
      // 96: dup_x2
      // 97: dup_x2
      // 98: pop
      // 99: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9c: bipush 0
      // 9d: swap
      // 9e: aastore
      // 9f: ldc2_w 4666478468596949815
      // a2: lload 1
      // a3: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: astore 10
      // aa: bipush 0
      // ab: istore 11
      // ad: iload 11
      // af: aload 10
      // b1: arraylength
      // b2: if_icmpge e7
      // b5: aload 8
      // b7: aload 10
      // b9: iload 11
      // bb: aaload
      // bc: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // bf: istore 12
      // c1: iinc 11 1
      // c4: iload 7
      // c6: lload 1
      // c7: lconst_0
      // c8: lcmp
      // c9: ifle ec
      // cc: ifeq ea
      // cf: iload 7
      // d1: ifne ad
      // d4: lload 1
      // d5: lconst_0
      // d6: lcmp
      // d7: iflt c4
      // da: goto e7
      // dd: ldc2_w 6630839491280509145
      // e0: lload 1
      // e1: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e6: athrow
      // e7: iinc 9 1
      // ea: iload 7
      // ec: ifne 52
      // ef: lload 1
      // f0: lconst_0
      // f1: lcmp
      // f2: iflt 5b
      // f5: aload 8
      // f7: areturn
   }

   public final boolean F(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 126638838765549L;
      return x44.a<"i">(this.T, new Object[]{var4}, -1379746791999421828L, var2);
   }

   public abstract boolean k();

   public boolean o(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/i8.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 3550180285650765056
      // 15: lload 2
      // 16: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/i8.j I
      // 21: iload 4
      // 23: ifne 45
      // 26: bipush 3
      // 27: if_icmpne 48
      // 2a: goto 37
      // 2d: ldc2_w 3459120146708002013
      // 30: lload 2
      // 31: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: bipush 1
      // 38: goto 45
      // 3b: ldc2_w 3459120146708002013
      // 3e: lload 2
      // 3f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: goto 49
      // 48: bipush 0
      // 49: ireturn
   }

   public String D(char var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
      long var6 = var4 ^ 51458496320043L;
      return this.T.E(var6);
   }

   public final void w(Object[] param1) {
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
      // 04: checkcast java/lang/Boolean
      // 07: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0a: istore 4
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast java/lang/Long
      // 12: invokevirtual java/lang/Long.longValue ()J
      // 15: lstore 2
      // 16: pop
      // 17: getstatic com/zelix/i8.c J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: ldc2_w -2844366486248232724
      // 20: lload 2
      // 21: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: istore 5
      // 28: iload 5
      // 2a: ifeq 63
      // 2d: iload 4
      // 2f: ifeq 6e
      // 32: goto 3f
      // 35: ldc2_w -4272738540467093400
      // 38: lload 2
      // 39: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: bipush 1
      // 41: bipush 1
      // 42: anewarray 442
      // 45: dup_x1
      // 46: swap
      // 47: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 4a: bipush 0
      // 4b: swap
      // 4c: aastore
      // 4d: ldc2_w -2648733726356818394
      // 50: lload 2
      // 51: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: goto 63
      // 59: ldc2_w -4272738540467093400
      // 5c: lload 2
      // 5d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: lload 2
      // 64: lconst_0
      // 65: lcmp
      // 66: iflt 85
      // 69: iload 5
      // 6b: ifne 92
      // 6e: aload 0
      // 6f: bipush 1
      // 70: bipush 1
      // 71: anewarray 442
      // 74: dup_x1
      // 75: swap
      // 76: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 79: bipush 0
      // 7a: swap
      // 7b: aastore
      // 7c: ldc2_w -2454798405123962594
      // 7f: lload 2
      // 80: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: goto 92
      // 88: ldc2_w -4272738540467093400
      // 8b: lload 2
      // 8c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: return
   }

   public final boolean p(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      boolean var4 = x44.a<"q">(5485659892023131210L, var2);

      try {
         boolean var10000 = this.g.equals(this.w.u());
         if (!var4) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var5) {
         throw x44.a<"q">(var5, 5769695739849872590L, var2);
      }

      return false;
   }

   public String t(long var1) {
      long var3 = var1 ^ 130283154079311L;
      return this.w(var3);
   }

   public void Z(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/util/Set
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 62592112659027
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w -2182854117136673296
      // 20: lload 2
      // 21: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: bipush 0
      // 27: istore 8
      // 29: istore 7
      // 2b: iload 8
      // 2d: aload 0
      // 2e: getfield com/zelix/i8.F I
      // 31: if_icmpge 9b
      // 34: aload 0
      // 35: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 38: iload 8
      // 3a: aaload
      // 3b: iload 7
      // 3d: ifne 6d
      // 40: instanceof com/zelix/_yl
      // 43: lload 2
      // 44: lconst_0
      // 45: lcmp
      // 46: ifle 98
      // 49: ifeq 93
      // 4c: goto 59
      // 4f: ldc2_w -2237879016642862035
      // 52: lload 2
      // 53: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 5d: iload 8
      // 5f: aaload
      // 60: goto 6d
      // 63: ldc2_w -2237879016642862035
      // 66: lload 2
      // 67: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: checkcast com/zelix/_yl
      // 70: astore 9
      // 72: aload 9
      // 74: aload 4
      // 76: lload 5
      // 78: bipush 2
      // 79: anewarray 442
      // 7c: dup_x2
      // 7d: dup_x2
      // 7e: pop
      // 7f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 82: bipush 1
      // 83: swap
      // 84: aastore
      // 85: dup_x1
      // 86: swap
      // 87: bipush 0
      // 88: swap
      // 89: aastore
      // 8a: ldc2_w -1870524206577935799
      // 8d: lload 2
      // 8e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: iinc 8 1
      // 96: iload 7
      // 98: ifeq 2b
      // 9b: lload 2
      // 9c: lconst_0
      // 9d: lcmp
      // 9e: ifle 34
      // a1: return
   }

   public abstract void N(Object[] var1);

   public i8(hz var1, mx var2, mx var3, h4[] var4, int var5) {
      super(var1);
      this.C = var2;
      this.w = var3;
      this.F = var4.length;
      this.J = var4;
      this.e = var2.u();
      this.g = var3.u();
      this.j = var5;
   }

   public final boolean g(long var1) {
      var1 = c ^ var1;
      boolean var3 = x44.a<"q">(2362050571877094531L, var1);

      try {
         boolean var10000 = this.e.equals(this.C.u());
         if (var3) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"q">(var4, 2414550762770949470L, var1);
      }

      return false;
   }

   public final void S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 136192303790500L;
      x44.a<"n">(this.T, new Object[]{var4}, -2197473309285517584L, var2);
   }

   public boolean m(int var1, int var2) {
      long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ c;
      boolean var5 = x44.a<"v">(4289866482360586188L, var3);

      try {
         if (var5) {
            return (boolean)this.j;
         }

         if (this.j != 0) {
            return (boolean)1;
         }
      } catch (gj var6) {
         throw x44.a<"v">(var6, 4237095104979369489L, var3);
      }

      return (boolean)0;
   }

   boolean q(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 8024568415952
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 28515038606397
      // 18: lxor
      // 19: lstore 6
      // 1b: dup2
      // 1c: ldc2_w 81330193886312
      // 1f: lxor
      // 20: lstore 8
      // 22: pop2
      // 23: ldc2_w -2244575331287378787
      // 26: lload 2
      // 27: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 10
      // 2e: aload 0
      // 2f: lload 6
      // 31: invokevirtual com/zelix/i8.d (J)Lcom/zelix/hz;
      // 34: lload 8
      // 36: ldc2_w -201209229917885285
      // 39: lload 2
      // 3a: invokedynamic o (Ljava/lang/Object;JJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: iload 10
      // 41: ifne 7c
      // 44: ifeq 7b
      // 47: goto 54
      // 4a: ldc2_w -2189822567380900544
      // 4d: lload 2
      // 4e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/zelix/i8.T Lcom/zelix/h2;
      // 58: lload 4
      // 5a: bipush 1
      // 5b: anewarray 442
      // 5e: dup_x2
      // 5f: dup_x2
      // 60: pop
      // 61: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 64: bipush 0
      // 65: swap
      // 66: aastore
      // 67: ldc2_w -376609825799745349
      // 6a: lload 2
      // 6b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: ireturn
      // 71: ldc2_w -2189822567380900544
      // 74: lload 2
      // 75: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: bipush 0
      // 7c: istore 11
      // 7e: iload 11
      // 80: aload 0
      // 81: getfield com/zelix/i8.F I
      // 84: if_icmpge e2
      // 87: aload 0
      // 88: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 8b: iload 11
      // 8d: aaload
      // 8e: bipush 0
      // 8f: anewarray 442
      // 92: ldc2_w -249830293657596356
      // 95: lload 2
      // 96: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: sipush 18027
      // 9e: ldc2_w 2883533070513225511
      // a1: lload 2
      // a2: lxor
      // a3: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // ab: iload 10
      // ad: lload 2
      // ae: lconst_0
      // af: lcmp
      // b0: ifle b8
      // b3: ifne e9
      // b6: iload 10
      // b8: ifne d9
      // bb: goto c8
      // be: ldc2_w -2189822567380900544
      // c1: lload 2
      // c2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: ifeq da
      // cb: goto d8
      // ce: ldc2_w -2189822567380900544
      // d1: lload 2
      // d2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d7: athrow
      // d8: bipush 1
      // d9: ireturn
      // da: iinc 11 1
      // dd: iload 10
      // df: ifeq 7e
      // e2: lload 2
      // e3: lconst_0
      // e4: lcmp
      // e5: ifle 87
      // e8: bipush 0
      // e9: ireturn
   }

   public final void z(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = c ^ var3;
      long var5 = var3 ^ 34424662259992L;
      h2 var10000 = this.T;
      Object[] var10004 = new Object[]{null, var2};
      var10004[0] = var5;
      x44.a<"i">(var10000, var10004, 9186646440771600247L, var3);
   }

   public final boolean E(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 68132650948236L;
      return x44.a<"m">(this.T, new Object[]{var4}, 1092198865080668150L, var2);
   }

   public abstract String v(long var1);

   final void r(Object[] param1) {
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
      // 00a: istore 7
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Integer
      // 01c: invokevirtual java/lang/Integer.intValue ()I
      // 01f: istore 5
      // 021: dup
      // 022: bipush 3
      // 023: aaload
      // 024: checkcast java/util/HashMap
      // 027: astore 4
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/util/HashMap
      // 02f: astore 6
      // 031: pop
      // 032: getstatic com/zelix/i8.c J
      // 035: lload 2
      // 036: lxor
      // 037: lstore 2
      // 038: lload 2
      // 039: dup2
      // 03a: ldc2_w 79441854260903
      // 03d: lxor
      // 03e: lstore 8
      // 040: dup2
      // 041: ldc2_w 6305713085467
      // 044: lxor
      // 045: lstore 10
      // 047: dup2
      // 048: ldc2_w 84189695609916
      // 04b: lxor
      // 04c: lstore 12
      // 04e: pop2
      // 04f: aload 0
      // 050: invokevirtual com/zelix/i8.H ()Ljava/lang/String;
      // 053: astore 15
      // 055: ldc2_w -2285974171549117438
      // 058: lload 2
      // 059: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: aload 15
      // 060: aload 6
      // 062: lload 8
      // 064: ldc2_w -375877245916974065
      // 067: lload 2
      // 068: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: astore 16
      // 06f: istore 14
      // 071: aload 16
      // 073: aload 15
      // 075: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 078: iload 14
      // 07a: ifne 0bb
      // 07d: ifne 0ba
      // 080: goto 08d
      // 083: ldc2_w -2232919272638994977
      // 086: lload 2
      // 087: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: athrow
      // 08d: aload 0
      // 08e: lload 12
      // 090: aload 16
      // 092: bipush 2
      // 093: anewarray 442
      // 096: dup_x1
      // 097: swap
      // 098: bipush 1
      // 099: swap
      // 09a: aastore
      // 09b: dup_x2
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a1: bipush 0
      // 0a2: swap
      // 0a3: aastore
      // 0a4: ldc2_w -2137985008407399151
      // 0a7: lload 2
      // 0a8: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: goto 0ba
      // 0b0: ldc2_w -2232919272638994977
      // 0b3: lload 2
      // 0b4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: bipush 0
      // 0bb: istore 17
      // 0bd: iload 17
      // 0bf: aload 0
      // 0c0: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 0c3: arraylength
      // 0c4: if_icmpge 110
      // 0c7: aload 0
      // 0c8: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 0cb: iload 17
      // 0cd: aaload
      // 0ce: iload 7
      // 0d0: iload 5
      // 0d2: aload 4
      // 0d4: aload 6
      // 0d6: lload 10
      // 0d8: bipush 5
      // 0d9: anewarray 442
      // 0dc: dup_x2
      // 0dd: dup_x2
      // 0de: pop
      // 0df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e2: bipush 4
      // 0e3: swap
      // 0e4: aastore
      // 0e5: dup_x1
      // 0e6: swap
      // 0e7: bipush 3
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x1
      // 0eb: swap
      // 0ec: bipush 2
      // 0ed: swap
      // 0ee: aastore
      // 0ef: dup_x1
      // 0f0: swap
      // 0f1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f4: bipush 1
      // 0f5: swap
      // 0f6: aastore
      // 0f7: dup_x1
      // 0f8: swap
      // 0f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: ldc2_w -2187244841361607917
      // 102: lload 2
      // 103: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: iinc 17 1
      // 10b: iload 14
      // 10d: ifeq 0bd
      // 110: lload 2
      // 111: lconst_0
      // 112: lcmp
      // 113: ifle 10b
      // 116: return
   }

   public void Y(Object[] var1) {
      String var2 = (String)var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 128634616892080L;
      this.C.v(var2);
      x44.a<"n">(this, 8735201708506267347L, var3);
      wp var10001 = new wp(0);
      Object var7 = null;
      wp var9 = var10001;
      x44.a<"n">(this, var5, var9, this, var7, 8775273573294917789L, var3);
   }

   void q(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.p &= ~var2;
   }

   public final void A(Object[] var1) {
      long var3 = (Long)var1[0];
      boolean var2 = (Boolean)var1[1];
      var3 = c ^ var3;
      long var5 = var3 ^ 7924090510705L;
      h2 var10000 = this.T;
      Object[] var10004 = new Object[]{null, var5};
      var10004[0] = var2;
      x44.a<"h">(var10000, var10004, 6832922240250980057L, var3);
   }

   public abstract String g(Object[] var1);

   public final boolean i(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 55620203169396L;
      return x44.a<"k">(this.T, new Object[]{var4}, -3327074444061117405L, var2);
   }

   public final void f(Object[] param1) {
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
      // 007: astore 7
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 3
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 4
      // 02a: pop
      // 02b: getstatic com/zelix/i8.c J
      // 02e: lload 5
      // 030: lxor
      // 031: lstore 5
      // 033: lload 5
      // 035: dup2
      // 036: ldc2_w 21386689832833
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 134959562342342
      // 040: lxor
      // 041: lstore 10
      // 043: pop2
      // 044: ldc2_w 1877660517305036362
      // 047: lload 5
      // 049: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: bipush 0
      // 04f: istore 13
      // 051: istore 12
      // 053: iload 13
      // 055: aload 0
      // 056: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 059: arraylength
      // 05a: if_icmpge 16f
      // 05d: aload 0
      // 05e: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 061: iload 13
      // 063: aaload
      // 064: astore 14
      // 066: aload 14
      // 068: instanceof com/zelix/b6
      // 06b: iload 12
      // 06d: ifne 0e2
      // 070: ifeq 0b5
      // 073: goto 081
      // 076: ldc2_w 1966752592610221975
      // 079: lload 5
      // 07b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: athrow
      // 081: aload 14
      // 083: checkcast com/zelix/b6
      // 086: astore 15
      // 088: aload 15
      // 08a: lload 10
      // 08c: aload 2
      // 08d: bipush 2
      // 08e: anewarray 442
      // 091: dup_x1
      // 092: swap
      // 093: bipush 1
      // 094: swap
      // 095: aastore
      // 096: dup_x2
      // 097: dup_x2
      // 098: pop
      // 099: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09c: bipush 0
      // 09d: swap
      // 09e: aastore
      // 09f: ldc2_w 377712797928846768
      // 0a2: lload 5
      // 0a4: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: iload 12
      // 0ab: lload 5
      // 0ad: lconst_0
      // 0ae: lcmp
      // 0af: iflt 16c
      // 0b2: ifeq 167
      // 0b5: aload 14
      // 0b7: lload 5
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: ifle 0e7
      // 0be: iload 12
      // 0c0: ifne 0e7
      // 0c3: goto 0d1
      // 0c6: ldc2_w 1966752592610221975
      // 0c9: lload 5
      // 0cb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: instanceof com/zelix/_yl
      // 0d4: goto 0e2
      // 0d7: ldc2_w 1966752592610221975
      // 0da: lload 5
      // 0dc: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: ifeq 129
      // 0e5: aload 14
      // 0e7: checkcast com/zelix/_yl
      // 0ea: aload 7
      // 0ec: lload 8
      // 0ee: aload 2
      // 0ef: aload 3
      // 0f0: aload 4
      // 0f2: bipush 5
      // 0f3: anewarray 442
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 4
      // 0f9: swap
      // 0fa: aastore
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: bipush 3
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x1
      // 101: swap
      // 102: bipush 2
      // 103: swap
      // 104: aastore
      // 105: dup_x2
      // 106: dup_x2
      // 107: pop
      // 108: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10b: bipush 1
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 0
      // 111: swap
      // 112: aastore
      // 113: ldc2_w 454659923374151723
      // 116: lload 5
      // 118: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: iload 12
      // 11f: lload 5
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 16c
      // 126: ifeq 167
      // 129: aload 0
      // 12a: aload 14
      // 12c: aload 7
      // 12e: aload 2
      // 12f: aload 3
      // 130: aload 4
      // 132: bipush 5
      // 133: anewarray 442
      // 136: dup_x1
      // 137: swap
      // 138: bipush 4
      // 139: swap
      // 13a: aastore
      // 13b: dup_x1
      // 13c: swap
      // 13d: bipush 3
      // 13e: swap
      // 13f: aastore
      // 140: dup_x1
      // 141: swap
      // 142: bipush 2
      // 143: swap
      // 144: aastore
      // 145: dup_x1
      // 146: swap
      // 147: bipush 1
      // 148: swap
      // 149: aastore
      // 14a: dup_x1
      // 14b: swap
      // 14c: bipush 0
      // 14d: swap
      // 14e: aastore
      // 14f: ldc2_w 112965744846871431
      // 152: lload 5
      // 154: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: goto 167
      // 15c: ldc2_w 1966752592610221975
      // 15f: lload 5
      // 161: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: iinc 13 1
      // 16a: iload 12
      // 16c: ifeq 053
      // 16f: return
   }

   public final int D() {
      return this.T.n();
   }

   void D(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.p |= var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public String R(Object[] var1) {
      long var3 = (Long)var1[0];
      we var2 = (we)var1[1];
      var3 = c ^ var3;
      long var5 = var3 ^ 32376697364082L;
      long var7 = var3 ^ 61688479664621L;
      boolean var10000 = x44.a<"r">(-444764085830301255L, var3);
      StringBuffer var10 = new StringBuffer();
      Enumeration var11 = this.x(var7);
      boolean var9 = var10000;

      label39:
      while (var11.hasMoreElements()) {
         x44.a<"j">(var10, (char)d<"o">(10809, 8348968660438328861L ^ var3), -498224800403811691L, var3);
         String var12 = (String)var11.nextElement();
         String var17 = x44.a<"j">(var2, new Object[]{var5, var12}, -1794149817921110250L, var3);
         if (var3 < 0L) {
            return var17;
         }

         String var13 = var17;

         try {
            var10.append(sh.b(var13));
         } catch (gj var15) {
            boolean var10001 = false;
            throw x44.a<"r">(var15, -1882214077585383107L, var3);
         }

         do {
            try {
               StringBuffer var19 = var10.append(" ");
               if (!var9) {
                  return var19.toString();
               }

               if (var9) {
                  continue label39;
               }
            } catch (gj var14) {
               boolean var20 = false;
               throw x44.a<"r">(var14, -1882214077585383107L, var3);
            }
         } while (var3 < 0L);
         break;
      }

      return var10.toString();
   }

   public void v(Object[] var1) {
      long var3 = (Long)var1[0];
      int var2 = (Integer)var1[1];
      var3 = c ^ var3;
      long var5 = var3 ^ 71935657315074L;
      x44.a<"l">(this.T, new Object[]{var2}, 4341759438118421889L, var3);
      x44.a<"l">(this, 4074524281223970657L, var3);
      wp var10001 = new wp(1);
      Object var7 = null;
      wp var9 = var10001;
      x44.a<"l">(this, var5, var9, this, var7, 4069632560667658543L, var3);
   }

   public final boolean r(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 57925307019660L;
      return x44.a<"i">(this.T, new Object[]{var4}, 5932698219689980329L, var2);
   }

   final void T(Object[] var1) {
      long var2 = (Long)var1[0];
      HashMap var4 = (HashMap)var1[1];
      var2 = c ^ var2;
      long var5 = var2 ^ 63336785237010L;
      long var7 = var2 ^ 67393169899145L;
      String var9 = this.H();
      String var10 = x44.a<"u">(var9, var4, var5, -3999780893276092742L, var2);

      try {
         if (!var10.equals(var9)) {
            x44.a<"m">(this, new Object[]{var7, var10}, -3395388471935694940L, var2);
         }
      } catch (gj var11) {
         throw x44.a<"u">(var11, -3191255420942444694L, var2);
      }
   }

   public final String A() {
      return this.g;
   }

   public void R(Object[] var1) {
      h4 var4 = (h4)var1[0];
      Set var2 = (Set)var1[1];
      Set var3 = (Set)var1[2];
      Set var5 = (Set)var1[3];
      Set var6 = (Set)var1[4];
   }

   public String H() {
      return this.w.u();
   }

   public final int A(Object[] var1) {
      long var3 = (Long)var1[0];
      i8 var2 = (i8)var1[1];
      var3 = c ^ var3;
      long var5 = var3 ^ 41465127719287L;
      return x44.a<"j">(this, new Object[]{var5}, -1667532711645536159L, var3).compareTo(x44.a<"j">(var2, new Object[]{var5}, -1667532711645536159L, var3));
   }

   public final _s7 k(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 63667171474177L;
      long var6 = var2 ^ 118769529347970L;
      long var8 = var2 ^ 59161929581895L;
      long var10 = var2 ^ 108103365050145L;
      long var12 = var2 ^ 56395080259187L;
      long var14 = var2 ^ 16716937784979L;
      _s7 var16 = new _s7(var10);
      x44.a<"l">(
         this,
         new Object[]{
            x44.a<"l">(var16, new Object[]{var6}, 3590534298455048000L, var2),
            x44.a<"l">(var16, new Object[]{var8}, 3621413503284903671L, var2),
            x44.a<"l">(var16, new Object[]{var4}, 3527304266295448069L, var2),
            var14,
            x44.a<"l">(var16, new Object[]{var12}, 3871407734752294688L, var2)
         },
         3964975604840611546L,
         var2
      );
      return var16;
   }

   public String w(long var1) {
      return this.C.u();
   }

   String E(Object[] var1) {
      long var2 = (Long)var1[0];
      return this.C.u().toLowerCase();
   }

   public boolean A(long var1) {
      var1 = c ^ var1;
      boolean var3 = x44.a<"s">(8646249629127230393L, var1);

      try {
         boolean var10000 = this.K();
         if (var3) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"s">(var4, 8554626389869408868L, var1);
      }

      return false;
   }

   void L(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/i8.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 58780154444015
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 1607218786052023847
      // 1e: lload 2
      // 1f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 2f: arraylength
      // 30: if_icmpge 8f
      // 33: aload 0
      // 34: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 37: iload 7
      // 39: aaload
      // 3a: iload 6
      // 3c: ifeq 6c
      // 3f: instanceof com/zelix/_yl
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt 8c
      // 48: ifeq 87
      // 4b: goto 58
      // 4e: ldc2_w 756347276649320099
      // 51: lload 2
      // 52: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 5c: iload 7
      // 5e: aaload
      // 5f: goto 6c
      // 62: ldc2_w 756347276649320099
      // 65: lload 2
      // 66: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: checkcast com/zelix/_yl
      // 6f: lload 4
      // 71: bipush 1
      // 72: anewarray 442
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w 628878327181087264
      // 81: lload 2
      // 82: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 7 1
      // 8a: iload 6
      // 8c: ifne 29
      // 8f: lload 2
      // 90: lconst_0
      // 91: lcmp
      // 92: ifle 33
      // 95: return
   }

   public i8(h8 var1, _xx var2, long var3, _y4 var5) {
      var3 = c ^ var3;
      long var6 = var3 ^ 117405555402678L;
      this(var6, var1, var2, var5, (PrintWriter)null);
      this.j = 0;
   }

   public boolean L(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/i8.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -5683304742850494134
      // 15: lload 2
      // 16: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/i8.j I
      // 21: iload 4
      // 23: ifeq 45
      // 26: bipush 2
      // 27: if_icmpne 48
      // 2a: goto 37
      // 2d: ldc2_w -5975659476149474866
      // 30: lload 2
      // 31: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: bipush 1
      // 38: goto 45
      // 3b: ldc2_w -5975659476149474866
      // 3e: lload 2
      // 3f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: goto 49
      // 48: bipush 0
      // 49: ireturn
   }

   public final boolean y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 95935603044979L;
      return x44.a<"m">(this.T, new Object[]{var4}, 5078554657191985675L, var2);
   }

   public final void l(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = c ^ var3;
      long var5 = var3 ^ 24246951029073L;
      h2 var10000 = this.T;
      Object[] var10004 = new Object[]{null, var2};
      var10004[0] = var5;
      x44.a<"l">(var10000, var10004, -4274247294901930663L, var3);
   }

   public final boolean d(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 139197096307389L;
      return x44.a<"n">(this.T, new Object[]{var4}, 5493457652420890280L, var2);
   }

   boolean V(long param1, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/i8.c J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -8331443575386687452
      // 09: lload 1
      // 0a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: istore 4
      // 11: aload 0
      // 12: getfield com/zelix/i8.p I
      // 15: iload 3
      // 16: iand
      // 17: iload 4
      // 19: ifne 3b
      // 1c: iload 3
      // 1d: if_icmpne 3e
      // 20: goto 2d
      // 23: ldc2_w -8276136795159148039
      // 26: lload 1
      // 27: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: bipush 1
      // 2e: goto 3b
      // 31: ldc2_w -8276136795159148039
      // 34: lload 1
      // 35: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: athrow
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   public Enumeration x(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/i8.c J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 80524694155273
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: ldc2_w 8548381360240412363
      // 11: lload 1
      // 12: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: aload 0
      // 18: lload 3
      // 19: invokevirtual com/zelix/i8.q (J)Ljava/util/Set;
      // 1c: astore 6
      // 1e: istore 5
      // 20: aload 6
      // 22: iload 5
      // 24: ifeq 50
      // 27: invokeinterface java/util/Set.size ()I 1
      // 2c: ifne 4e
      // 2f: goto 3c
      // 32: ldc2_w 7679511068401479247
      // 35: lload 1
      // 36: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: new com/zelix/ri
      // 3f: dup
      // 40: invokespecial com/zelix/ri.<init> ()V
      // 43: areturn
      // 44: ldc2_w 7679511068401479247
      // 47: lload 1
      // 48: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 6
      // 50: invokestatic java/util/Collections.enumeration (Ljava/util/Collection;)Ljava/util/Enumeration;
      // 53: areturn
   }

   public final boolean n(long var1) {
      var1 = c ^ var1;
      long var10001 = var1 ^ 62156340204608L;
      int var3 = (int)((var1 ^ 62156340204608L) >>> 48);
      int var4 = (int)((var1 ^ 62156340204608L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return this.T.B((short)var3, (short)var4, var5);
   }

   public final int Y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 1077075616572L;
      return x44.a<"i">(this.T, new Object[]{var4}, -807103465907511671L, var2);
   }

   public String L(long var1) {
      var1 = c ^ var1;
      long var3 = var1 ^ 37804332479366L;
      return ((hz)this.x()).k(var3);
   }

   public final void b(mx param1, short param2, mx param3, int param4, short param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 4
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 5
      // 11: i2l
      // 12: bipush 48
      // 14: lshl
      // 15: bipush 48
      // 17: lushr
      // 18: lor
      // 19: lstore 6
      // 1b: ldc2_w -4813852749984134795
      // 1e: lload 6
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 8
      // 27: aload 0
      // 28: getfield com/zelix/i8.C Lcom/zelix/mx;
      // 2b: aload 1
      // 2c: iload 8
      // 2e: ifne 80
      // 31: if_acmpne 5a
      // 34: goto 42
      // 37: ldc2_w -4867186995714393944
      // 3a: lload 6
      // 3c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: aload 3
      // 44: putfield com/zelix/i8.C Lcom/zelix/mx;
      // 47: iload 8
      // 49: ifeq 88
      // 4c: goto 5a
      // 4f: ldc2_w -4867186995714393944
      // 52: lload 6
      // 54: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: iload 8
      // 5d: ifne 84
      // 60: goto 6e
      // 63: ldc2_w -4867186995714393944
      // 66: lload 6
      // 68: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: getfield com/zelix/i8.w Lcom/zelix/mx;
      // 71: aload 1
      // 72: goto 80
      // 75: ldc2_w -4867186995714393944
      // 78: lload 6
      // 7a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: if_acmpne 88
      // 83: aload 0
      // 84: aload 3
      // 85: putfield com/zelix/i8.w Lcom/zelix/mx;
      // 88: return
   }

   void X(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   public final String P(Object[] var1) {
      return this.e;
   }

   public i8(long param1, h8 param3, _xx param4, _y4 param5, PrintWriter param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i8.c J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 43363217099092
      // 00b: lxor
      // 00c: lstore 7
      // 00e: dup2
      // 00f: ldc2_w 80335961326976
      // 012: lxor
      // 013: lstore 9
      // 015: dup2
      // 016: ldc2_w 115706959701308
      // 019: lxor
      // 01a: dup2
      // 01b: bipush 8
      // 01d: lushr
      // 01e: lstore 11
      // 020: dup2
      // 021: bipush 56
      // 023: lshl
      // 024: bipush 56
      // 026: lushr
      // 027: l2i
      // 028: istore 13
      // 02a: pop2
      // 02b: pop2
      // 02c: ldc2_w -8112456240562324690
      // 02f: lload 1
      // 030: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: aload 0
      // 036: aload 3
      // 037: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 03a: aload 0
      // 03b: new com/zelix/h2
      // 03e: dup
      // 03f: aload 0
      // 040: aload 4
      // 042: invokespecial com/zelix/h2.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;)V
      // 045: putfield com/zelix/i8.T Lcom/zelix/h2;
      // 048: aload 4
      // 04a: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 04d: istore 15
      // 04f: aload 4
      // 051: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 054: istore 16
      // 056: aload 0
      // 057: lload 11
      // 059: iload 15
      // 05b: iload 13
      // 05d: i2b
      // 05e: invokevirtual com/zelix/i8.N (JIB)Lcom/zelix/xl;
      // 061: astore 17
      // 063: istore 14
      // 065: aload 0
      // 066: lload 11
      // 068: iload 16
      // 06a: iload 13
      // 06c: i2b
      // 06d: invokevirtual com/zelix/i8.N (JIB)Lcom/zelix/xl;
      // 070: astore 18
      // 072: aload 0
      // 073: aload 4
      // 075: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 078: putfield com/zelix/i8.F I
      // 07b: aload 0
      // 07c: lload 7
      // 07e: aload 17
      // 080: aload 18
      // 082: aload 6
      // 084: bipush 4
      // 085: anewarray 442
      // 088: dup_x1
      // 089: swap
      // 08a: bipush 3
      // 08b: swap
      // 08c: aastore
      // 08d: dup_x1
      // 08e: swap
      // 08f: bipush 2
      // 090: swap
      // 091: aastore
      // 092: dup_x1
      // 093: swap
      // 094: bipush 1
      // 095: swap
      // 096: aastore
      // 097: dup_x2
      // 098: dup_x2
      // 099: pop
      // 09a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09d: bipush 0
      // 09e: swap
      // 09f: aastore
      // 0a0: ldc2_w -7804906304549850903
      // 0a3: lload 1
      // 0a4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: iload 14
      // 0ab: ifne 100
      // 0ae: aload 5
      // 0b0: ifnull 0e5
      // 0b3: goto 0c0
      // 0b6: ldc2_w -8201264528189306125
      // 0b9: lload 1
      // 0ba: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 5
      // 0c2: aload 0
      // 0c3: getfield com/zelix/i8.C Lcom/zelix/mx;
      // 0c6: aload 0
      // 0c7: lload 9
      // 0c9: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0cc: aload 5
      // 0ce: aload 0
      // 0cf: getfield com/zelix/i8.w Lcom/zelix/mx;
      // 0d2: aload 0
      // 0d3: lload 9
      // 0d5: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0d8: goto 0e5
      // 0db: ldc2_w -8201264528189306125
      // 0de: lload 1
      // 0df: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: aload 0
      // 0e7: getfield com/zelix/i8.C Lcom/zelix/mx;
      // 0ea: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 0ed: putfield com/zelix/i8.e Ljava/lang/String;
      // 0f0: aload 0
      // 0f1: aload 0
      // 0f2: getfield com/zelix/i8.w Lcom/zelix/mx;
      // 0f5: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 0f8: putfield com/zelix/i8.g Ljava/lang/String;
      // 0fb: aload 0
      // 0fc: bipush 0
      // 0fd: putfield com/zelix/i8.j I
      // 100: return
   }

   public final boolean b(Object[] param1) {
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
      // 0a: lstore 2
      // 0b: pop
      // 0c: getstatic com/zelix/i8.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 88048405784348
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 38019337648337
      // 1e: lxor
      // 1f: lstore 6
      // 21: dup2
      // 22: ldc2_w 125907317727364
      // 25: lxor
      // 26: lstore 8
      // 28: pop2
      // 29: ldc2_w -6037759351901349775
      // 2c: lload 2
      // 2d: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: istore 10
      // 34: aload 0
      // 35: lload 6
      // 37: invokevirtual com/zelix/i8.d (J)Lcom/zelix/hz;
      // 3a: lload 8
      // 3c: ldc2_w -5631449800469340041
      // 3f: lload 2
      // 40: invokedynamic k (Ljava/lang/Object;JJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: iload 10
      // 47: ifne 82
      // 4a: ifeq 81
      // 4d: goto 5a
      // 50: ldc2_w -5949232563011524180
      // 53: lload 2
      // 54: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield com/zelix/i8.T Lcom/zelix/h2;
      // 5e: lload 4
      // 60: bipush 1
      // 61: anewarray 442
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: ldc2_w -6215543308399513346
      // 70: lload 2
      // 71: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ireturn
      // 77: ldc2_w -5949232563011524180
      // 7a: lload 2
      // 7b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: bipush 0
      // 82: istore 11
      // 84: iload 11
      // 86: aload 0
      // 87: getfield com/zelix/i8.F I
      // 8a: if_icmpge e8
      // 8d: aload 0
      // 8e: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 91: iload 11
      // 93: aaload
      // 94: bipush 0
      // 95: anewarray 442
      // 98: ldc2_w -5736363470978678064
      // 9b: lload 2
      // 9c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: sipush 30135
      // a4: ldc2_w 2835151208942125072
      // a7: lload 2
      // a8: lxor
      // a9: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // b1: iload 10
      // b3: lload 2
      // b4: lconst_0
      // b5: lcmp
      // b6: ifle be
      // b9: ifne ef
      // bc: iload 10
      // be: ifne df
      // c1: goto ce
      // c4: ldc2_w -5949232563011524180
      // c7: lload 2
      // c8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd: athrow
      // ce: ifeq e0
      // d1: goto de
      // d4: ldc2_w -5949232563011524180
      // d7: lload 2
      // d8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: athrow
      // de: bipush 1
      // df: ireturn
      // e0: iinc 11 1
      // e3: iload 10
      // e5: ifeq 84
      // e8: lload 2
      // e9: lconst_0
      // ea: lcmp
      // eb: ifle 8d
      // ee: bipush 0
      // ef: ireturn
   }

   public void B(Object[] var1) {
      long var2 = (Long)var1[0];
      String var4 = (String)var1[1];
      long var5 = var2 ^ 134993734032458L;
      this.w.v(var4);
      x44.a<"l">(this, 8053462615987562537L, var2);
      wp var10001 = new wp(2);
      Object var7 = null;
      wp var9 = var10001;
      x44.a<"l">(this, var5, var9, this, var7, 8012474293267521127L, var2);
   }

   public Set s(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/Boolean
      // 021: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 024: istore 6
      // 026: pop
      // 027: getstatic com/zelix/i8.c J
      // 02a: lload 2
      // 02b: lxor
      // 02c: lstore 2
      // 02d: lload 2
      // 02e: dup2
      // 02f: ldc2_w 117095893757931
      // 032: lxor
      // 033: lstore 7
      // 035: dup2
      // 036: ldc2_w 14633789044686
      // 039: lxor
      // 03a: lstore 9
      // 03c: dup2
      // 03d: ldc2_w 91269769605036
      // 040: lxor
      // 041: lstore 11
      // 043: dup2
      // 044: ldc2_w 85830111908507
      // 047: lxor
      // 048: lstore 13
      // 04a: pop2
      // 04b: ldc2_w -9155057889226345290
      // 04e: lload 2
      // 04f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: lload 9
      // 056: sipush 23225
      // 059: ldc2_w 6259783524755747529
      // 05c: lload 2
      // 05d: lxor
      // 05e: invokedynamic o (IJ)I bsm=com/zelix/i8.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: bipush 2
      // 064: anewarray 442
      // 067: dup_x1
      // 068: swap
      // 069: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 06c: bipush 1
      // 06d: swap
      // 06e: aastore
      // 06f: dup_x2
      // 070: dup_x2
      // 071: pop
      // 072: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 075: bipush 0
      // 076: swap
      // 077: aastore
      // 078: ldc2_w -8853144719261498313
      // 07b: lload 2
      // 07c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: astore 16
      // 083: istore 15
      // 085: bipush 0
      // 086: istore 17
      // 088: iload 17
      // 08a: aload 0
      // 08b: getfield com/zelix/i8.F I
      // 08e: if_icmpge 1fb
      // 091: aload 0
      // 092: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 095: iload 17
      // 097: aaload
      // 098: iload 15
      // 09a: ifne 0f0
      // 09d: instanceof com/zelix/bs
      // 0a0: ifne 0dc
      // 0a3: goto 0b0
      // 0a6: ldc2_w -9099745147584461461
      // 0a9: lload 2
      // 0aa: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 0b4: iload 17
      // 0b6: aaload
      // 0b7: iload 15
      // 0b9: ifne 0f0
      // 0bc: goto 0c9
      // 0bf: ldc2_w -9099745147584461461
      // 0c2: lload 2
      // 0c3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: instanceof com/zelix/bo
      // 0cc: ifeq 1f3
      // 0cf: goto 0dc
      // 0d2: ldc2_w -9099745147584461461
      // 0d5: lload 2
      // 0d6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 0e0: iload 17
      // 0e2: aaload
      // 0e3: goto 0f0
      // 0e6: ldc2_w -9099745147584461461
      // 0e9: lload 2
      // 0ea: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: checkcast com/zelix/_yl
      // 0f3: astore 18
      // 0f5: aload 18
      // 0f7: iload 15
      // 0f9: ifne 159
      // 0fc: instanceof com/zelix/bs
      // 0ff: ifeq 14a
      // 102: goto 10f
      // 105: ldc2_w -9099745147584461461
      // 108: lload 2
      // 109: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 18
      // 111: checkcast com/zelix/bs
      // 114: aload 5
      // 116: lload 7
      // 118: iload 6
      // 11a: bipush 3
      // 11b: anewarray 442
      // 11e: dup_x1
      // 11f: swap
      // 120: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 123: bipush 2
      // 124: swap
      // 125: aastore
      // 126: dup_x2
      // 127: dup_x2
      // 128: pop
      // 129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12c: bipush 1
      // 12d: swap
      // 12e: aastore
      // 12f: dup_x1
      // 130: swap
      // 131: bipush 0
      // 132: swap
      // 133: aastore
      // 134: ldc2_w -7435712868949111101
      // 137: lload 2
      // 138: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: astore 19
      // 13f: lload 2
      // 140: lconst_0
      // 141: lcmp
      // 142: ifle 17d
      // 145: iload 15
      // 147: ifeq 17d
      // 14a: aload 18
      // 14c: goto 159
      // 14f: ldc2_w -9099745147584461461
      // 152: lload 2
      // 153: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: checkcast com/zelix/bo
      // 15c: lload 13
      // 15e: aload 5
      // 160: bipush 2
      // 161: anewarray 442
      // 164: dup_x1
      // 165: swap
      // 166: bipush 1
      // 167: swap
      // 168: aastore
      // 169: dup_x2
      // 16a: dup_x2
      // 16b: pop
      // 16c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16f: bipush 0
      // 170: swap
      // 171: aastore
      // 172: ldc2_w -7269680002092818012
      // 175: lload 2
      // 176: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: astore 19
      // 17d: aload 19
      // 17f: iload 15
      // 181: ifne 196
      // 184: ifnull 1f3
      // 187: goto 194
      // 18a: ldc2_w -9099745147584461461
      // 18d: lload 2
      // 18e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: aload 19
      // 196: lload 11
      // 198: aload 4
      // 19a: iload 6
      // 19c: bipush 3
      // 19d: anewarray 442
      // 1a0: dup_x1
      // 1a1: swap
      // 1a2: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a5: bipush 2
      // 1a6: swap
      // 1a7: aastore
      // 1a8: dup_x1
      // 1a9: swap
      // 1aa: bipush 1
      // 1ab: swap
      // 1ac: aastore
      // 1ad: dup_x2
      // 1ae: dup_x2
      // 1af: pop
      // 1b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b3: bipush 0
      // 1b4: swap
      // 1b5: aastore
      // 1b6: ldc2_w -7171304876579833580
      // 1b9: lload 2
      // 1ba: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: astore 20
      // 1c1: iload 15
      // 1c3: lload 2
      // 1c4: lconst_0
      // 1c5: lcmp
      // 1c6: iflt 1f8
      // 1c9: ifne 1f6
      // 1cc: aload 20
      // 1ce: ifnull 1f3
      // 1d1: goto 1de
      // 1d4: ldc2_w -9099745147584461461
      // 1d7: lload 2
      // 1d8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dd: athrow
      // 1de: aload 16
      // 1e0: aload 20
      // 1e2: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 1e5: pop
      // 1e6: goto 1f3
      // 1e9: ldc2_w -9099745147584461461
      // 1ec: lload 2
      // 1ed: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: iinc 17 1
      // 1f6: iload 15
      // 1f8: ifeq 088
      // 1fb: lload 2
      // 1fc: lconst_0
      // 1fd: lcmp
      // 1fe: ifle 091
      // 201: aload 16
      // 203: areturn
   }

   void c(Object[] param1) {
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
      // 0a: lstore 6
      // 0c: dup
      // 0d: bipush 1
      // 0e: aaload
      // 0f: checkcast com/zelix/_yv
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_ug
      // 19: astore 5
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/ei
      // 21: astore 4
      // 23: dup
      // 24: bipush 4
      // 25: aaload
      // 26: checkcast com/zelix/_ur
      // 29: astore 3
      // 2a: pop
      // 2b: lload 6
      // 2d: dup2
      // 2e: ldc2_w 53851450394915
      // 31: lxor
      // 32: lstore 8
      // 34: pop2
      // 35: ldc2_w -3041923408606273140
      // 38: lload 6
      // 3a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: bipush 0
      // 40: istore 11
      // 42: istore 10
      // 44: iload 11
      // 46: aload 0
      // 47: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 4a: arraylength
      // 4b: if_icmpge c8
      // 4e: aload 0
      // 4f: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 52: iload 11
      // 54: aaload
      // 55: iload 10
      // 57: ifne 8a
      // 5a: instanceof com/zelix/_yl
      // 5d: lload 6
      // 5f: lconst_0
      // 60: lcmp
      // 61: iflt c5
      // 64: ifeq c0
      // 67: goto 75
      // 6a: ldc2_w -3130723449858584495
      // 6d: lload 6
      // 6f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: aload 0
      // 76: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 79: iload 11
      // 7b: aaload
      // 7c: goto 8a
      // 7f: ldc2_w -3130723449858584495
      // 82: lload 6
      // 84: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: checkcast com/zelix/_yl
      // 8d: aload 2
      // 8e: aload 5
      // 90: lload 8
      // 92: aload 4
      // 94: aload 3
      // 95: bipush 5
      // 96: anewarray 442
      // 99: dup_x1
      // 9a: swap
      // 9b: bipush 4
      // 9c: swap
      // 9d: aastore
      // 9e: dup_x1
      // 9f: swap
      // a0: bipush 3
      // a1: swap
      // a2: aastore
      // a3: dup_x2
      // a4: dup_x2
      // a5: pop
      // a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a9: bipush 2
      // aa: swap
      // ab: aastore
      // ac: dup_x1
      // ad: swap
      // ae: bipush 1
      // af: swap
      // b0: aastore
      // b1: dup_x1
      // b2: swap
      // b3: bipush 0
      // b4: swap
      // b5: aastore
      // b6: ldc2_w -3140728401025168562
      // b9: lload 6
      // bb: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: iinc 11 1
      // c3: iload 10
      // c5: ifeq 44
      // c8: lload 6
      // ca: lconst_0
      // cb: lcmp
      // cc: iflt 4e
      // cf: return
   }

   public abstract boolean K();

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      long var6 = var1 ^ 0L;
      long var8 = var1 ^ 0L;
      x44.a<"o">(this.T, var6, var3, -6400689090164082868L, var1);
      this.C.O(var4, var3, this, this.x());
      boolean var10000 = x44.a<"w">(-6348162585463318644L, var1);
      this.w.O(var4, var3, this, this.x());
      h4[] var11 = this.J;
      int var12 = var11.length;
      int var13 = 0;
      boolean var10 = var10000;

      while (var13 < var12) {
         h4 var14 = var11[var13];
         var14.N(var8, var3);
         var13++;
         if (!var10) {
            break;
         }
      }
   }

   public void a(Object[] param1) {
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
      // 004: checkcast com/zelix/_ue
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/qr
      // 00f: astore 6
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 2
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/io/PrintWriter
      // 028: astore 7
      // 02a: pop
      // 02b: lload 3
      // 02c: dup2
      // 02d: ldc2_w 56587471163161
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 139036452692135
      // 037: lxor
      // 038: lstore 10
      // 03a: dup2
      // 03b: ldc2_w 74545591216293
      // 03e: lxor
      // 03f: lstore 12
      // 041: dup2
      // 042: ldc2_w 4510626319495
      // 045: lxor
      // 046: lstore 14
      // 048: dup2
      // 049: ldc2_w 34933818543499
      // 04c: lxor
      // 04d: lstore 16
      // 04f: dup2
      // 050: ldc2_w 105624780509503
      // 053: lxor
      // 054: lstore 18
      // 056: dup2
      // 057: ldc2_w 11815177969712
      // 05a: lxor
      // 05b: lstore 20
      // 05d: dup2
      // 05e: ldc2_w 77189467666862
      // 061: lxor
      // 062: lstore 22
      // 064: pop2
      // 065: ldc2_w -8928174055816383374
      // 068: lload 3
      // 069: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: new java/util/ArrayList
      // 071: dup
      // 072: invokespecial java/util/ArrayList.<init> ()V
      // 075: astore 25
      // 077: bipush 0
      // 078: istore 26
      // 07a: istore 24
      // 07c: iload 26
      // 07e: aload 0
      // 07f: getfield com/zelix/i8.F I
      // 082: if_icmpge 4fb
      // 085: aload 0
      // 086: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 089: iload 26
      // 08b: aaload
      // 08c: instanceof com/zelix/h3
      // 08f: iload 24
      // 091: lload 3
      // 092: lconst_0
      // 093: lcmp
      // 094: ifle 50a
      // 097: ifeq 506
      // 09a: iload 24
      // 09c: lload 3
      // 09d: lconst_0
      // 09e: lcmp
      // 09f: iflt 150
      // 0a2: ifeq 14e
      // 0a5: goto 0b2
      // 0a8: ldc2_w -7482121854853325578
      // 0ab: lload 3
      // 0ac: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: lload 3
      // 0b3: lconst_0
      // 0b4: lcmp
      // 0b5: ifle 141
      // 0b8: ifeq 137
      // 0bb: goto 0c8
      // 0be: ldc2_w -7482121854853325578
      // 0c1: lload 3
      // 0c2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 6
      // 0ca: ldc2_w -7155945998392796015
      // 0cd: lload 3
      // 0ce: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: lload 3
      // 0d4: lconst_0
      // 0d5: lcmp
      // 0d6: ifle 12e
      // 0d9: iload 24
      // 0db: ifeq 12b
      // 0de: goto 0eb
      // 0e1: ldc2_w -7482121854853325578
      // 0e4: lload 3
      // 0e5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: ifeq 112
      // 0ee: goto 0fb
      // 0f1: ldc2_w -7482121854853325578
      // 0f4: lload 3
      // 0f5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 0ff: iload 26
      // 101: aaload
      // 102: checkcast com/zelix/h3
      // 105: astore 27
      // 107: iload 24
      // 109: lload 3
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: ifle 4f8
      // 10f: ifne 4f3
      // 112: aload 25
      // 114: aload 0
      // 115: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 118: iload 26
      // 11a: aaload
      // 11b: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 11e: goto 12b
      // 121: ldc2_w -7482121854853325578
      // 124: lload 3
      // 125: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: pop
      // 12c: iload 24
      // 12e: lload 3
      // 12f: lconst_0
      // 130: lcmp
      // 131: iflt 4f8
      // 134: ifne 4f3
      // 137: aload 0
      // 138: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 13b: iload 26
      // 13d: aaload
      // 13e: instanceof com/zelix/_yl
      // 141: goto 14e
      // 144: ldc2_w -7482121854853325578
      // 147: lload 3
      // 148: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: iload 24
      // 150: lload 3
      // 151: lconst_0
      // 152: lcmp
      // 153: ifle 28f
      // 156: ifeq 28d
      // 159: ifeq 276
      // 15c: goto 169
      // 15f: ldc2_w -7482121854853325578
      // 162: lload 3
      // 163: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: athrow
      // 169: aload 0
      // 16a: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 16d: iload 26
      // 16f: aaload
      // 170: checkcast com/zelix/_yl
      // 173: astore 27
      // 175: aload 6
      // 177: ldc2_w -9138412735175214861
      // 17a: lload 3
      // 17b: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: iload 24
      // 182: ifeq 26a
      // 185: ifeq 251
      // 188: goto 195
      // 18b: ldc2_w -7482121854853325578
      // 18e: lload 3
      // 18f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 194: athrow
      // 195: aload 5
      // 197: lload 18
      // 199: bipush 1
      // 19a: anewarray 442
      // 19d: dup_x2
      // 19e: dup_x2
      // 19f: pop
      // 1a0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a3: bipush 0
      // 1a4: swap
      // 1a5: aastore
      // 1a6: ldc2_w -7007947100901114543
      // 1a9: lload 3
      // 1aa: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1af: iload 24
      // 1b1: lload 3
      // 1b2: lconst_0
      // 1b3: lcmp
      // 1b4: iflt 220
      // 1b7: ifeq 218
      // 1ba: goto 1c7
      // 1bd: ldc2_w -7482121854853325578
      // 1c0: lload 3
      // 1c1: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: athrow
      // 1c7: lload 3
      // 1c8: lconst_0
      // 1c9: lcmp
      // 1ca: ifle 26d
      // 1cd: ifeq 26b
      // 1d0: goto 1dd
      // 1d3: ldc2_w -7482121854853325578
      // 1d6: lload 3
      // 1d7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 27
      // 1df: aload 5
      // 1e1: aload 2
      // 1e2: lload 8
      // 1e4: aload 7
      // 1e6: bipush 4
      // 1e7: anewarray 442
      // 1ea: dup_x1
      // 1eb: swap
      // 1ec: bipush 3
      // 1ed: swap
      // 1ee: aastore
      // 1ef: dup_x2
      // 1f0: dup_x2
      // 1f1: pop
      // 1f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f5: bipush 2
      // 1f6: swap
      // 1f7: aastore
      // 1f8: dup_x1
      // 1f9: swap
      // 1fa: bipush 1
      // 1fb: swap
      // 1fc: aastore
      // 1fd: dup_x1
      // 1fe: swap
      // 1ff: bipush 0
      // 200: swap
      // 201: aastore
      // 202: ldc2_w -7414125082596772079
      // 205: lload 3
      // 206: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: goto 218
      // 20e: ldc2_w -7482121854853325578
      // 211: lload 3
      // 212: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: lload 3
      // 219: lconst_0
      // 21a: lcmp
      // 21b: iflt 248
      // 21e: iload 24
      // 220: ifeq 245
      // 223: ifeq 239
      // 226: goto 233
      // 229: ldc2_w -7482121854853325578
      // 22c: lload 3
      // 22d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: lload 3
      // 234: lconst_0
      // 235: lcmp
      // 236: ifge 26b
      // 239: aload 25
      // 23b: aload 0
      // 23c: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 23f: iload 26
      // 241: aaload
      // 242: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 245: pop
      // 246: iload 24
      // 248: lload 3
      // 249: lconst_0
      // 24a: lcmp
      // 24b: iflt 26d
      // 24e: ifne 26b
      // 251: aload 25
      // 253: aload 0
      // 254: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 257: iload 26
      // 259: aaload
      // 25a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 25d: goto 26a
      // 260: ldc2_w -7482121854853325578
      // 263: lload 3
      // 264: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 269: athrow
      // 26a: pop
      // 26b: iload 24
      // 26d: lload 3
      // 26e: lconst_0
      // 26f: lcmp
      // 270: iflt 4f8
      // 273: ifne 4f3
      // 276: aload 0
      // 277: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 27a: iload 26
      // 27c: aaload
      // 27d: instanceof com/zelix/bb
      // 280: goto 28d
      // 283: ldc2_w -7482121854853325578
      // 286: lload 3
      // 287: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28c: athrow
      // 28d: iload 24
      // 28f: ifeq 4f2
      // 292: ifeq 498
      // 295: goto 2a2
      // 298: ldc2_w -7482121854853325578
      // 29b: lload 3
      // 29c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a1: athrow
      // 2a2: aload 6
      // 2a4: ldc2_w -7064346338893722516
      // 2a7: lload 3
      // 2a8: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ad: lload 3
      // 2ae: lconst_0
      // 2af: lcmp
      // 2b0: ifle 48f
      // 2b3: iload 24
      // 2b5: ifeq 48c
      // 2b8: goto 2c5
      // 2bb: ldc2_w -7482121854853325578
      // 2be: lload 3
      // 2bf: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c4: athrow
      // 2c5: ifeq 473
      // 2c8: goto 2d5
      // 2cb: ldc2_w -7482121854853325578
      // 2ce: lload 3
      // 2cf: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: athrow
      // 2d5: aload 0
      // 2d6: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 2d9: iload 26
      // 2db: aaload
      // 2dc: checkcast com/zelix/bb
      // 2df: astore 27
      // 2e1: aload 7
      // 2e3: new java/lang/StringBuilder
      // 2e6: dup
      // 2e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ea: sipush 24618
      // 2ed: ldc2_w 7294240755430383836
      // 2f0: lload 3
      // 2f1: lxor
      // 2f2: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fa: aload 27
      // 2fc: bipush 0
      // 2fd: anewarray 442
      // 300: ldc2_w -8845515514063145078
      // 303: lload 3
      // 304: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 309: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30c: sipush 16064
      // 30f: ldc2_w 8396068186750828087
      // 312: lload 3
      // 313: lxor
      // 314: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 319: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31c: aload 0
      // 31d: lload 22
      // 31f: bipush 1
      // 320: anewarray 442
      // 323: dup_x2
      // 324: dup_x2
      // 325: pop
      // 326: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 329: bipush 0
      // 32a: swap
      // 32b: aastore
      // 32c: ldc2_w -7264472173080455391
      // 32f: lload 3
      // 330: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 338: sipush 32617
      // 33b: ldc2_w 3459550867960299420
      // 33e: lload 3
      // 33f: lxor
      // 340: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 345: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 348: aload 0
      // 349: lload 16
      // 34b: invokevirtual com/zelix/i8.d (J)Lcom/zelix/hz;
      // 34e: lload 14
      // 350: dup2_x1
      // 351: pop2
      // 352: aload 5
      // 354: bipush 3
      // 355: anewarray 442
      // 358: dup_x1
      // 359: swap
      // 35a: bipush 2
      // 35b: swap
      // 35c: aastore
      // 35d: dup_x1
      // 35e: swap
      // 35f: bipush 1
      // 360: swap
      // 361: aastore
      // 362: dup_x2
      // 363: dup_x2
      // 364: pop
      // 365: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 368: bipush 0
      // 369: swap
      // 36a: aastore
      // 36b: ldc2_w -8794012659781993146
      // 36e: lload 3
      // 36f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 374: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 377: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 37a: lload 3
      // 37b: lconst_0
      // 37c: lcmp
      // 37d: iflt 465
      // 380: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 383: aload 2
      // 384: iload 24
      // 386: ifeq 3b6
      // 389: ldc2_w -7301889686486865095
      // 38c: lload 3
      // 38d: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 392: lload 3
      // 393: lconst_0
      // 394: lcmp
      // 395: ifle 46a
      // 398: ifeq 468
      // 39b: goto 3a8
      // 39e: ldc2_w -7482121854853325578
      // 3a1: lload 3
      // 3a2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: athrow
      // 3a8: aload 2
      // 3a9: goto 3b6
      // 3ac: ldc2_w -7482121854853325578
      // 3af: lload 3
      // 3b0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b5: athrow
      // 3b6: lload 10
      // 3b8: bipush 1
      // 3b9: anewarray 442
      // 3bc: dup_x2
      // 3bd: dup_x2
      // 3be: pop
      // 3bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3c2: bipush 0
      // 3c3: swap
      // 3c4: aastore
      // 3c5: ldc2_w -7125521193219818963
      // 3c8: lload 3
      // 3c9: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ce: new java/lang/StringBuilder
      // 3d1: dup
      // 3d2: invokespecial java/lang/StringBuilder.<init> ()V
      // 3d5: sipush 15834
      // 3d8: ldc2_w 3424324874075782437
      // 3db: lload 3
      // 3dc: lxor
      // 3dd: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3e5: aload 27
      // 3e7: bipush 0
      // 3e8: anewarray 442
      // 3eb: ldc2_w -8845515514063145078
      // 3ee: lload 3
      // 3ef: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3f7: sipush 16526
      // 3fa: ldc2_w 8300018197683650685
      // 3fd: lload 3
      // 3fe: lxor
      // 3ff: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 404: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 407: aload 0
      // 408: lload 22
      // 40a: bipush 1
      // 40b: anewarray 442
      // 40e: dup_x2
      // 40f: dup_x2
      // 410: pop
      // 411: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 414: bipush 0
      // 415: swap
      // 416: aastore
      // 417: ldc2_w -7264472173080455391
      // 41a: lload 3
      // 41b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 420: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 423: sipush 31090
      // 426: ldc2_w 1175186309632424320
      // 429: lload 3
      // 42a: lxor
      // 42b: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 430: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 433: aload 0
      // 434: lload 16
      // 436: invokevirtual com/zelix/i8.d (J)Lcom/zelix/hz;
      // 439: lload 14
      // 43b: dup2_x1
      // 43c: pop2
      // 43d: aload 5
      // 43f: bipush 3
      // 440: anewarray 442
      // 443: dup_x1
      // 444: swap
      // 445: bipush 2
      // 446: swap
      // 447: aastore
      // 448: dup_x1
      // 449: swap
      // 44a: bipush 1
      // 44b: swap
      // 44c: aastore
      // 44d: dup_x2
      // 44e: dup_x2
      // 44f: pop
      // 450: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 453: bipush 0
      // 454: swap
      // 455: aastore
      // 456: ldc2_w -8794012659781993146
      // 459: lload 3
      // 45a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 462: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 465: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 468: iload 24
      // 46a: lload 3
      // 46b: lconst_0
      // 46c: lcmp
      // 46d: iflt 4f8
      // 470: ifne 4f3
      // 473: aload 25
      // 475: aload 0
      // 476: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 479: iload 26
      // 47b: aaload
      // 47c: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 47f: goto 48c
      // 482: ldc2_w -7482121854853325578
      // 485: lload 3
      // 486: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48b: athrow
      // 48c: pop
      // 48d: iload 24
      // 48f: lload 3
      // 490: lconst_0
      // 491: lcmp
      // 492: ifle 4f8
      // 495: ifne 4f3
      // 498: aload 0
      // 499: aload 5
      // 49b: lload 20
      // 49d: aload 6
      // 49f: aload 0
      // 4a0: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 4a3: iload 26
      // 4a5: aaload
      // 4a6: aload 2
      // 4a7: aload 7
      // 4a9: bipush 6
      // 4ab: anewarray 442
      // 4ae: dup_x1
      // 4af: swap
      // 4b0: bipush 5
      // 4b1: swap
      // 4b2: aastore
      // 4b3: dup_x1
      // 4b4: swap
      // 4b5: bipush 4
      // 4b6: swap
      // 4b7: aastore
      // 4b8: dup_x1
      // 4b9: swap
      // 4ba: bipush 3
      // 4bb: swap
      // 4bc: aastore
      // 4bd: dup_x1
      // 4be: swap
      // 4bf: bipush 2
      // 4c0: swap
      // 4c1: aastore
      // 4c2: dup_x2
      // 4c3: dup_x2
      // 4c4: pop
      // 4c5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c8: bipush 1
      // 4c9: swap
      // 4ca: aastore
      // 4cb: dup_x1
      // 4cc: swap
      // 4cd: bipush 0
      // 4ce: swap
      // 4cf: aastore
      // 4d0: ldc2_w -9077452439922126218
      // 4d3: lload 3
      // 4d4: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d9: aload 25
      // 4db: aload 0
      // 4dc: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 4df: iload 26
      // 4e1: aaload
      // 4e2: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 4e5: goto 4f2
      // 4e8: ldc2_w -7482121854853325578
      // 4eb: lload 3
      // 4ec: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f1: athrow
      // 4f2: pop
      // 4f3: iinc 26 1
      // 4f6: iload 24
      // 4f8: ifne 07c
      // 4fb: aload 25
      // 4fd: lload 3
      // 4fe: lconst_0
      // 4ff: lcmp
      // 500: iflt 4db
      // 503: invokevirtual java/util/ArrayList.size ()I
      // 506: aload 0
      // 507: getfield com/zelix/i8.F I
      // 50a: if_icmpge 550
      // 50d: aload 0
      // 50e: aload 25
      // 510: aload 25
      // 512: invokevirtual java/util/ArrayList.size ()I
      // 515: anewarray 101
      // 518: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 51b: checkcast [Lcom/zelix/h4;
      // 51e: putfield com/zelix/i8.J [Lcom/zelix/h4;
      // 521: aload 0
      // 522: aload 0
      // 523: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 526: arraylength
      // 527: putfield com/zelix/i8.F I
      // 52a: aload 0
      // 52b: lload 12
      // 52d: bipush 1
      // 52e: anewarray 442
      // 531: dup_x2
      // 532: dup_x2
      // 533: pop
      // 534: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 537: bipush 0
      // 538: swap
      // 539: aastore
      // 53a: ldc2_w -8908871640981386813
      // 53d: lload 3
      // 53e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 543: goto 550
      // 546: ldc2_w -7482121854853325578
      // 549: lload 3
      // 54a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54f: athrow
      // 550: return
   }

   public void J(Object[] var1) {
      int var2 = (Integer)var1[0];
      this.j = var2;
   }

   public final void O(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 102495141574630L;
      x44.a<"i">(this.T, new Object[]{var4}, -8814073777365549636L, var2);
   }

   public final void U(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = c ^ var2;
      long var4 = var2 ^ 88044634380067L;
      x44.a<"n">(this.T, new Object[]{var4}, 2496557707956653423L, var2);
   }

   final void k(Object[] param1) {
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
      // 00a: lstore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/io/DataOutputStream
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/_ur
      // 020: astore 4
      // 022: pop
      // 023: getstatic com/zelix/i8.c J
      // 026: lload 5
      // 028: lxor
      // 029: lstore 5
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 19972692181751
      // 031: lxor
      // 032: lstore 7
      // 034: dup2
      // 035: ldc2_w 134197395011402
      // 038: lxor
      // 039: lstore 9
      // 03b: dup2
      // 03c: ldc2_w 32511258121759
      // 03f: lxor
      // 040: lstore 11
      // 042: dup2
      // 043: ldc2_w 15619340674828
      // 046: lxor
      // 047: lstore 13
      // 049: dup2
      // 04a: ldc2_w 5674519151432
      // 04d: lxor
      // 04e: lstore 15
      // 050: dup2
      // 051: ldc2_w 107648336326416
      // 054: lxor
      // 055: lstore 17
      // 057: pop2
      // 058: aload 3
      // 059: aload 0
      // 05a: getfield com/zelix/i8.T Lcom/zelix/h2;
      // 05d: invokevirtual com/zelix/h2.n ()I
      // 060: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 063: ldc2_w -2041825484712519699
      // 066: lload 5
      // 068: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: aload 2
      // 06e: aload 0
      // 06f: getfield com/zelix/i8.C Lcom/zelix/mx;
      // 072: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 077: checkcast com/zelix/mx
      // 07a: checkcast com/zelix/mx
      // 07d: astore 20
      // 07f: istore 19
      // 081: iload 19
      // 083: ifne 0b0
      // 086: aload 20
      // 088: ifnull 0bc
      // 08b: goto 099
      // 08e: ldc2_w -2095159191286274512
      // 091: lload 5
      // 093: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: aload 3
      // 09a: aload 20
      // 09c: invokevirtual com/zelix/mx.B ()I
      // 09f: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0a2: goto 0b0
      // 0a5: ldc2_w -2095159191286274512
      // 0a8: lload 5
      // 0aa: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: lload 5
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: ifle 0c7
      // 0b7: iload 19
      // 0b9: ifeq 0d5
      // 0bc: aload 3
      // 0bd: aload 0
      // 0be: getfield com/zelix/i8.C Lcom/zelix/mx;
      // 0c1: invokevirtual com/zelix/mx.B ()I
      // 0c4: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0c7: goto 0d5
      // 0ca: ldc2_w -2095159191286274512
      // 0cd: lload 5
      // 0cf: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: aload 2
      // 0d6: aload 0
      // 0d7: getfield com/zelix/i8.w Lcom/zelix/mx;
      // 0da: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0df: checkcast com/zelix/mx
      // 0e2: checkcast com/zelix/mx
      // 0e5: astore 21
      // 0e7: iload 19
      // 0e9: lload 5
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: ifle 11f
      // 0f0: ifne 11d
      // 0f3: aload 21
      // 0f5: ifnull 129
      // 0f8: goto 106
      // 0fb: ldc2_w -2095159191286274512
      // 0fe: lload 5
      // 100: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 3
      // 107: aload 21
      // 109: invokevirtual com/zelix/mx.B ()I
      // 10c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 10f: goto 11d
      // 112: ldc2_w -2095159191286274512
      // 115: lload 5
      // 117: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: iload 19
      // 11f: lload 5
      // 121: lconst_0
      // 122: lcmp
      // 123: ifle 14b
      // 126: ifeq 142
      // 129: aload 3
      // 12a: aload 0
      // 12b: getfield com/zelix/i8.w Lcom/zelix/mx;
      // 12e: invokevirtual com/zelix/mx.B ()I
      // 131: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 134: goto 142
      // 137: ldc2_w -2095159191286274512
      // 13a: lload 5
      // 13c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: athrow
      // 142: aload 3
      // 143: aload 0
      // 144: getfield com/zelix/i8.F I
      // 147: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 14a: bipush 0
      // 14b: istore 22
      // 14d: iload 22
      // 14f: aload 0
      // 150: getfield com/zelix/i8.F I
      // 153: if_icmpge 35a
      // 156: aload 0
      // 157: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 15a: iload 22
      // 15c: aaload
      // 15d: iload 19
      // 15f: ifne 326
      // 162: instanceof com/zelix/bb
      // 165: ifeq 31f
      // 168: goto 176
      // 16b: ldc2_w -2095159191286274512
      // 16e: lload 5
      // 170: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: lload 5
      // 178: lconst_0
      // 179: lcmp
      // 17a: ifle 355
      // 17d: aload 0
      // 17e: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 181: iload 22
      // 183: aaload
      // 184: iload 19
      // 186: ifne 326
      // 189: goto 197
      // 18c: ldc2_w -2095159191286274512
      // 18f: lload 5
      // 191: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: lload 17
      // 199: invokevirtual com/zelix/h4.x (J)I
      // 19c: ifle 31f
      // 19f: goto 1ad
      // 1a2: ldc2_w -2095159191286274512
      // 1a5: lload 5
      // 1a7: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 1b1: iload 22
      // 1b3: aaload
      // 1b4: checkcast com/zelix/bb
      // 1b7: astore 23
      // 1b9: iload 19
      // 1bb: lload 5
      // 1bd: lconst_0
      // 1be: lcmp
      // 1bf: iflt 267
      // 1c2: ifne 25e
      // 1c5: aload 23
      // 1c7: lload 15
      // 1c9: bipush 1
      // 1ca: anewarray 442
      // 1cd: dup_x2
      // 1ce: dup_x2
      // 1cf: pop
      // 1d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d3: bipush 0
      // 1d4: swap
      // 1d5: aastore
      // 1d6: ldc2_w -290058487442735783
      // 1d9: lload 5
      // 1db: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e0: ifeq 26a
      // 1e3: goto 1f1
      // 1e6: ldc2_w -2095159191286274512
      // 1e9: lload 5
      // 1eb: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: aload 4
      // 1f3: new java/lang/StringBuilder
      // 1f6: dup
      // 1f7: invokespecial java/lang/StringBuilder.<init> ()V
      // 1fa: sipush 22290
      // 1fd: ldc2_w 6969159007926627634
      // 200: lload 5
      // 202: lxor
      // 203: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20b: aload 23
      // 20d: bipush 0
      // 20e: anewarray 442
      // 211: ldc2_w -2185274441052852
      // 214: lload 5
      // 216: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21e: sipush 9109
      // 221: ldc2_w 4070422489368123819
      // 224: lload 5
      // 226: lxor
      // 227: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 22f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 232: lload 11
      // 234: bipush 2
      // 235: anewarray 442
      // 238: dup_x2
      // 239: dup_x2
      // 23a: pop
      // 23b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23e: bipush 1
      // 23f: swap
      // 240: aastore
      // 241: dup_x1
      // 242: swap
      // 243: bipush 0
      // 244: swap
      // 245: aastore
      // 246: ldc2_w -61253600975961846
      // 249: lload 5
      // 24b: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: goto 25e
      // 253: ldc2_w -2095159191286274512
      // 256: lload 5
      // 258: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25d: athrow
      // 25e: lload 5
      // 260: lconst_0
      // 261: lcmp
      // 262: iflt 311
      // 265: iload 19
      // 267: ifeq 31f
      // 26a: aload 4
      // 26c: new java/lang/StringBuilder
      // 26f: dup
      // 270: invokespecial java/lang/StringBuilder.<init> ()V
      // 273: sipush 21790
      // 276: ldc2_w 502356341674127142
      // 279: lload 5
      // 27b: lxor
      // 27c: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 284: aload 0
      // 285: lload 7
      // 287: invokevirtual com/zelix/i8.w (J)Ljava/lang/String;
      // 28a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28d: sipush 8811
      // 290: ldc2_w 3675397281550981212
      // 293: lload 5
      // 295: lxor
      // 296: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29e: aload 0
      // 29f: lload 13
      // 2a1: bipush 1
      // 2a2: anewarray 442
      // 2a5: dup_x2
      // 2a6: dup_x2
      // 2a7: pop
      // 2a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ab: bipush 0
      // 2ac: swap
      // 2ad: aastore
      // 2ae: ldc2_w -2073592245448297057
      // 2b1: lload 5
      // 2b3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bb: sipush 11630
      // 2be: ldc2_w 286473829701670737
      // 2c1: lload 5
      // 2c3: lxor
      // 2c4: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cc: aload 23
      // 2ce: bipush 0
      // 2cf: anewarray 442
      // 2d2: ldc2_w -2185274441052852
      // 2d5: lload 5
      // 2d7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2df: sipush 11596
      // 2e2: ldc2_w 3489827503791003514
      // 2e5: lload 5
      // 2e7: lxor
      // 2e8: invokedynamic h (IJ)Ljava/lang/String; bsm=com/zelix/i8.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f3: lload 11
      // 2f5: bipush 2
      // 2f6: anewarray 442
      // 2f9: dup_x2
      // 2fa: dup_x2
      // 2fb: pop
      // 2fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2ff: bipush 1
      // 300: swap
      // 301: aastore
      // 302: dup_x1
      // 303: swap
      // 304: bipush 0
      // 305: swap
      // 306: aastore
      // 307: ldc2_w -61253600975961846
      // 30a: lload 5
      // 30c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 311: goto 31f
      // 314: ldc2_w -2095159191286274512
      // 317: lload 5
      // 319: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: athrow
      // 31f: aload 0
      // 320: getfield com/zelix/i8.J [Lcom/zelix/h4;
      // 323: iload 22
      // 325: aaload
      // 326: aload 3
      // 327: lload 9
      // 329: aload 2
      // 32a: aload 4
      // 32c: bipush 4
      // 32d: anewarray 442
      // 330: dup_x1
      // 331: swap
      // 332: bipush 3
      // 333: swap
      // 334: aastore
      // 335: dup_x1
      // 336: swap
      // 337: bipush 2
      // 338: swap
      // 339: aastore
      // 33a: dup_x2
      // 33b: dup_x2
      // 33c: pop
      // 33d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 340: bipush 1
      // 341: swap
      // 342: aastore
      // 343: dup_x1
      // 344: swap
      // 345: bipush 0
      // 346: swap
      // 347: aastore
      // 348: ldc2_w -1791600052518848895
      // 34b: lload 5
      // 34d: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 352: iinc 22 1
      // 355: iload 19
      // 357: ifeq 14d
      // 35a: lload 5
      // 35c: lconst_0
      // 35d: lcmp
      // 35e: ifle 156
      // 361: return
   }

   static {
      long var11 = c ^ 16629670445350L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[17];
      int var18 = 0;
      String var17 = "rÒ\u00ad\u0014\u00adOE»áßSr¤À§\u009c\\îÙø\u009a\u001b\ts®\u0080S_\u0090\u009fÅm)¾çú[kn¿ö®\u008b½º\u0000Ks:ÞÜj\u0003£-+\u0010K\u009fUsÝ«\u008aß\u0095îI´ôüÔÕ\u00101ï\u0014áI\b]\u009d°\u0084ÕWöá\u0083G\u0018H%\u000bQ\u00adÒÊW¿'\u0085\u0017®Ã.)!)\u001fïdû\nX\u0018\u000e\u0098\rK±\u009bæ\u001c3\u0096çÿ}Ò»\u009e}·D5òO®a\u0010\u0088ï\u001b\u0095\ni\u009b\u007f¢\u0010Á\u009a\u001aÒdù¸¬sVMÊÝ8\rç\">\u00ad\u008bÍ\u0082\u009f\u0090¬\u0097\u001aV'V\u0086]Î\u0003x°\u0083\\HÛ\u001cãJ\u0081ã¯s,j\u0018\u008exSZ\u008cXµ6ÌV\u0080_\u0095Ù¾+.^Î\u001eàÕ\u0096qÖ\u0002§@ß\u0012+°ÞÜÛwo\u0087:\u0094>®{¡g%\u0003 ÏÆJ!\u0087¯¸\u009bâQs:\u0018GQCºKè\u0084)\u0001jIß\u0085\u008d\u0018ÿÅ\u0087¼\u00964cª{NU\u0085ZþÓ;\u0083#\u0012þm¿§<\"Ã\u009a*\ná³g8û×Bb¼÷\t\u0082®üÍ\f\u0099©\u0089Ü3þ#Â~\u0010\u0099^d\u0080³\u0087éjøÖ o°\u0011â\u00124²Ìm1ïã«ætôº¥érÉWúbIÔ`Øú\u0090¿Ý\u0018N\u009eý\"\u0093dÓÐpÃ\u009e¶¦õ\u000047\u0086³´\u007fÎSm8\u009cÞü\u009fM\u0000?\u0003;s\u009a1\u008ciló]Æ\u0097¡\f`\u001bü\u0003\"ËQ9,3þ\u0082LÎË#\u009eoº\u001f\"C\u0091D¾;æ¦dý··çOý@l°öû\u001f,ë+=ø;´ð£úØ\u007fÊ»Ã4¸\u000f\u007f\u001cÉ\u00008<+\u008d\u0017\u0098ÚpTgNGÓðt»¤t&6Ä\u0014Ñú\u008e\u0003m)\u001aL\u0004QAåK«Ð zãìØI²á½\u001f\u007f\u008cBCXM\u000bj\u0000[Ë$¦¡ì_GÌ\u0084P ÕU\u0010²\u0016þµ\u001f\u007ft\u008d(ÑÌ\u009fKwÎ\u0083\u00108AÚÂâQËK\u000f®ä\u001eoVk;xâY]\u00959\"I(Ô_\f\u009e\u0080¬\u0014\u001fxèÍjù_¤8j¯90Ó\u0019N\u0001õ\u0097\rx\u009e¨òÆ\u001f~\u009f·\u000bH9Hxv¤ð\u0005`µ¢ÐA\u0003\tU\u0081\t\u0080!ë^\n\u0003` ðç\u0016e\u008cÕJYCOE\u0019s\u0016ú./¿_®¦$W»Odã\u007f.XnqTíÝ2\u0007\u00ad!¾Ô.~\r\\×\u0006Ôb";
      int var19 = "rÒ\u00ad\u0014\u00adOE»áßSr¤À§\u009c\\îÙø\u009a\u001b\ts®\u0080S_\u0090\u009fÅm)¾çú[kn¿ö®\u008b½º\u0000Ks:ÞÜj\u0003£-+\u0010K\u009fUsÝ«\u008aß\u0095îI´ôüÔÕ\u00101ï\u0014áI\b]\u009d°\u0084ÕWöá\u0083G\u0018H%\u000bQ\u00adÒÊW¿'\u0085\u0017®Ã.)!)\u001fïdû\nX\u0018\u000e\u0098\rK±\u009bæ\u001c3\u0096çÿ}Ò»\u009e}·D5òO®a\u0010\u0088ï\u001b\u0095\ni\u009b\u007f¢\u0010Á\u009a\u001aÒdù¸¬sVMÊÝ8\rç\">\u00ad\u008bÍ\u0082\u009f\u0090¬\u0097\u001aV'V\u0086]Î\u0003x°\u0083\\HÛ\u001cãJ\u0081ã¯s,j\u0018\u008exSZ\u008cXµ6ÌV\u0080_\u0095Ù¾+.^Î\u001eàÕ\u0096qÖ\u0002§@ß\u0012+°ÞÜÛwo\u0087:\u0094>®{¡g%\u0003 ÏÆJ!\u0087¯¸\u009bâQs:\u0018GQCºKè\u0084)\u0001jIß\u0085\u008d\u0018ÿÅ\u0087¼\u00964cª{NU\u0085ZþÓ;\u0083#\u0012þm¿§<\"Ã\u009a*\ná³g8û×Bb¼÷\t\u0082®üÍ\f\u0099©\u0089Ü3þ#Â~\u0010\u0099^d\u0080³\u0087éjøÖ o°\u0011â\u00124²Ìm1ïã«ætôº¥érÉWúbIÔ`Øú\u0090¿Ý\u0018N\u009eý\"\u0093dÓÐpÃ\u009e¶¦õ\u000047\u0086³´\u007fÎSm8\u009cÞü\u009fM\u0000?\u0003;s\u009a1\u008ciló]Æ\u0097¡\f`\u001bü\u0003\"ËQ9,3þ\u0082LÎË#\u009eoº\u001f\"C\u0091D¾;æ¦dý··çOý@l°öû\u001f,ë+=ø;´ð£úØ\u007fÊ»Ã4¸\u000f\u007f\u001cÉ\u00008<+\u008d\u0017\u0098ÚpTgNGÓðt»¤t&6Ä\u0014Ñú\u008e\u0003m)\u001aL\u0004QAåK«Ð zãìØI²á½\u001f\u007f\u008cBCXM\u000bj\u0000[Ë$¦¡ì_GÌ\u0084P ÕU\u0010²\u0016þµ\u001f\u007ft\u008d(ÑÌ\u009fKwÎ\u0083\u00108AÚÂâQËK\u000f®ä\u001eoVk;xâY]\u00959\"I(Ô_\f\u009e\u0080¬\u0014\u001fxèÍjù_¤8j¯90Ó\u0019N\u0001õ\u0097\rx\u009e¨òÆ\u001f~\u009f·\u000bH9Hxv¤ð\u0005`µ¢ÐA\u0003\tU\u0081\t\u0080!ë^\n\u0003` ðç\u0016e\u008cÕJYCOE\u0019s\u0016ú./¿_®¦$W»Odã\u007f.XnqTíÝ2\u0007\u00ad!¾Ô.~\r\\×\u0006Ôb"
         .length();
      char var16 = '8';
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = c(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     f = var20;
                     n = new String[17];
                     I = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "ì\u0001~Z\u008e\u00957É\u0012\u0085Ýw\"órq £3Ì@çZ¼";
                     int var5 = "ì\u0001~Z\u008e\u00957É\u0012\u0085Ýw\"órq £3Ì@çZ¼".length();
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
                        byte var38 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     E = var6;
                     G = new Integer[3];
                     return;
                  }

                  var16 = var17.charAt(var23);
                  break;
               default:
                  var20[var18++] = var33;
                  if ((var23 += var16) < var19) {
                     var16 = var17.charAt(var23);
                     continue label45;
                  }

                  var17 = "SUY;\u0004v\u0094ä;0ÊÒ*\u0012\u0019É<\u008e\u0004ØØ\u0081Fe\u008bíÇ}¥ô¨\u0088ÔÌ³®ßd\u0090Ãç6^\u0095\u0017pG\u008aP\u008e\u0096\u0087\u0099YØ\u0098wøÌê÷\u0094V\u0010c\u000b\u0002±Ô$e\\jHAX7eÆ\u008cfÿp'\u001d\u0092\u0094ºÂ÷T8\u0092\\\u0011h£G:òVð\u00986ù\u0094ÕZ4\u0099Ý\u000eÐÔ½\u0012\u0097\u0093\u0014ëD\u009f\u0014³æÇ¤áñ";
                  var19 = "SUY;\u0004v\u0094ä;0ÊÒ*\u0012\u0019É<\u008e\u0004ØØ\u0081Fe\u008bíÇ}¥ô¨\u0088ÔÌ³®ßd\u0090Ãç6^\u0095\u0017pG\u008aP\u008e\u0096\u0087\u0099YØ\u0098wøÌê÷\u0094V\u0010c\u000b\u0002±Ô$e\\jHAX7eÆ\u008cfÿp'\u001d\u0092\u0094ºÂ÷T8\u0092\\\u0011h£G:òVð\u00986ù\u0094ÕZ4\u0099Ý\u000eÐÔ½\u0012\u0097\u0093\u0014ëD\u009f\u0014³æÇ¤áñ"
                     .length();
                  var16 = '0';
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj a(gj var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2124;
      if (n[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])r.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/i8", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         n[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return n[var5];
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
         throw new RuntimeException("com/zelix/i8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31061;
      if (G[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])I.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               I.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/i8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         G[var3] = var15;
      }

      return G[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/i8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
