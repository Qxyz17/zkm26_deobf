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

public class ik extends h8 implements _zv, yk, Comparable {
   private _op H;
   private mx R;
   private _op g;
   private boolean f;
   private mx J;
   final lu E;
   private byte[] y;
   private int D;
   private int O;
   private static final long a = ess.a(-5841934123288475342L, 7772196292473890150L, MethodHandles.lookup().lookupClass()).a(49009072280847L);
   private static final String c;
   private static final long[] e;
   private static final Integer[] h;
   private static final Map i;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   void U(Object[] var1) {
      long var4;
      label28: {
         int var3 = (Integer)var1[0];
         int var2 = (Integer)var1[1];
         var4 = ((long)var3 << 32 | (long)var2 << 32 >>> 32) ^ a;
         boolean var6 = x44.a<"v">(8131231952506798269L, var4);
         if (mc.Bz) {
            String var7 = this.u().u() + a<"h">(8198, 3890179914393811637L ^ var4) + "a";

            try {
               this.u().v(var7);
               if (var3 < 0 || var6) {
                  break label28;
               }
            } catch (gj var10) {
               boolean var10001 = false;
               throw x44.a<"v">(var10, 7629041823196312803L, var4);
            }
         }

         try {
            this.u().v("a");
         } catch (gj var9) {
            boolean var11 = false;
            throw x44.a<"v">(var9, 7629041823196312803L, var4);
         }
      }

      try {
         ;
      } catch (gj var8) {
         boolean var12 = false;
         throw x44.a<"v">(var8, 7629041823196312803L, var4);
      }
   }

   void N(long param1, _8l param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 80221771876344
      // 05: lxor
      // 06: lstore 4
      // 08: pop2
      // 09: ldc2_w -5003033307729260843
      // 0c: lload 1
      // 0d: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: istore 6
      // 14: aload 0
      // 15: getfield com/zelix/ik.f Z
      // 18: iload 6
      // 1a: ifne 59
      // 1d: ifeq 5a
      // 20: goto 2d
      // 23: ldc2_w -4688538873955408942
      // 26: lload 1
      // 27: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield com/zelix/ik.J Lcom/zelix/mx;
      // 31: lload 4
      // 33: aload 3
      // 34: aload 0
      // 35: aload 0
      // 36: invokevirtual com/zelix/ik.x ()Lcom/zelix/h8;
      // 39: invokevirtual com/zelix/mx.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 3c: pop
      // 3d: aload 0
      // 3e: getfield com/zelix/ik.R Lcom/zelix/mx;
      // 41: lload 4
      // 43: aload 3
      // 44: aload 0
      // 45: aload 0
      // 46: invokevirtual com/zelix/ik.x ()Lcom/zelix/h8;
      // 49: invokevirtual com/zelix/mx.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 4c: goto 59
      // 4f: ldc2_w -4688538873955408942
      // 52: lload 1
      // 53: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: pop
      // 5a: return
   }

   public void m(Object[] var1) {
      long var3 = (Long)var1[0];
      w var2 = (w)var1[1];
      long var5 = var3 ^ 11807521485311L;
      var2.u(var5, this.g, this);
      var2.u(var5, this.H, this);
   }

   public void J(mx var1) {
      this.J = var1;
   }

   public int p(Object[] param1) {
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
      // 04: checkcast com/zelix/ik
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/ik.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -1451930312215699555
      // 1d: lload 2
      // 1e: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: istore 5
      // 25: aload 0
      // 26: getfield com/zelix/ik.E Lcom/zelix/lu;
      // 29: invokeinterface com/zelix/lu.H ()I 1
      // 2e: aload 4
      // 30: getfield com/zelix/ik.E Lcom/zelix/lu;
      // 33: invokeinterface com/zelix/lu.H ()I 1
      // 38: iload 5
      // 3a: ifne 84
      // 3d: if_icmpge 59
      // 40: goto 4d
      // 43: ldc2_w -1178003459457387878
      // 46: lload 2
      // 47: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: bipush -1
      // 4e: ireturn
      // 4f: ldc2_w -1178003459457387878
      // 52: lload 2
      // 53: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: getfield com/zelix/ik.E Lcom/zelix/lu;
      // 5d: invokeinterface com/zelix/lu.H ()I 1
      // 62: iload 5
      // 64: lload 2
      // 65: lconst_0
      // 66: lcmp
      // 67: iflt 77
      // 6a: ifne 94
      // 6d: aload 4
      // 6f: getfield com/zelix/ik.E Lcom/zelix/lu;
      // 72: invokeinterface com/zelix/lu.H ()I 1
      // 77: goto 84
      // 7a: ldc2_w -1178003459457387878
      // 7d: lload 2
      // 7e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: if_icmpne 93
      // 87: bipush 0
      // 88: ireturn
      // 89: ldc2_w -1178003459457387878
      // 8c: lload 2
      // 8d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: athrow
      // 93: bipush 1
      // 94: ireturn
   }

   _op V(Object[] var1) {
      return this.H;
   }

   public void i(Object[] param1) {
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
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/util/HashMap
      // 01c: astore 3
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Long
      // 023: invokevirtual java/lang/Long.longValue ()J
      // 026: lstore 5
      // 028: pop
      // 029: lload 5
      // 02b: dup2
      // 02c: ldc2_w 138040541389060
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 14774584148638
      // 036: lxor
      // 037: lstore 9
      // 039: dup2
      // 03a: ldc2_w 112868999168278
      // 03d: lxor
      // 03e: lstore 11
      // 040: dup2
      // 041: ldc2_w 16873773782323
      // 044: lxor
      // 045: lstore 13
      // 047: pop2
      // 048: ldc2_w 8912771351347548148
      // 04b: lload 5
      // 04d: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: new com/zelix/wp
      // 055: dup
      // 056: bipush 0
      // 057: invokespecial com/zelix/wp.<init> (I)V
      // 05a: astore 16
      // 05c: istore 15
      // 05e: aload 0
      // 05f: invokevirtual com/zelix/ik.s ()Lcom/zelix/mx;
      // 062: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 065: lload 11
      // 067: aload 16
      // 069: invokestatic com/zelix/hz.w (Ljava/lang/String;JLcom/zelix/wp;)Ljava/lang/String;
      // 06c: astore 17
      // 06e: aload 17
      // 070: iload 15
      // 072: ifne 09f
      // 075: ifnull 106
      // 078: goto 086
      // 07b: ldc2_w 9209816539883627251
      // 07e: lload 5
      // 080: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: aload 17
      // 088: aload 3
      // 089: lload 9
      // 08b: invokestatic com/zelix/sh.a (Ljava/lang/Object;Ljava/util/Map;J)Ljava/lang/Object;
      // 08e: checkcast java/lang/String
      // 091: goto 09f
      // 094: ldc2_w 9209816539883627251
      // 097: lload 5
      // 099: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: athrow
      // 09f: astore 18
      // 0a1: aload 18
      // 0a3: iload 15
      // 0a5: ifne 0fb
      // 0a8: aload 17
      // 0aa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ad: ifne 106
      // 0b0: goto 0be
      // 0b3: ldc2_w 9209816539883627251
      // 0b6: lload 5
      // 0b8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: lload 7
      // 0c0: aload 18
      // 0c2: aload 16
      // 0c4: lload 13
      // 0c6: invokevirtual com/zelix/wp.C (J)I
      // 0c9: bipush 3
      // 0ca: anewarray 142
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d2: bipush 2
      // 0d3: swap
      // 0d4: aastore
      // 0d5: dup_x1
      // 0d6: swap
      // 0d7: bipush 1
      // 0d8: swap
      // 0d9: aastore
      // 0da: dup_x2
      // 0db: dup_x2
      // 0dc: pop
      // 0dd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e0: bipush 0
      // 0e1: swap
      // 0e2: aastore
      // 0e3: ldc2_w 7298921615750869750
      // 0e6: lload 5
      // 0e8: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: goto 0fb
      // 0f0: ldc2_w 9209816539883627251
      // 0f3: lload 5
      // 0f5: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: astore 19
      // 0fd: aload 0
      // 0fe: invokevirtual com/zelix/ik.s ()Lcom/zelix/mx;
      // 101: aload 19
      // 103: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // 106: return
   }

   ik(h8 param1, _xx param2, te param3, char param4, _y4 param5, int param6, _y4 param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 4
      // 002: i2l
      // 003: bipush 48
      // 005: lshl
      // 006: iload 6
      // 008: i2l
      // 009: bipush 32
      // 00b: lshl
      // 00c: bipush 16
      // 00e: lushr
      // 00f: lor
      // 010: iload 8
      // 012: i2l
      // 013: bipush 48
      // 015: lshl
      // 016: bipush 48
      // 018: lushr
      // 019: lor
      // 01a: getstatic com/zelix/ik.a J
      // 01d: lxor
      // 01e: lstore 9
      // 020: lload 9
      // 022: dup2
      // 023: ldc2_w 68297531116308
      // 026: lxor
      // 027: lstore 11
      // 029: dup2
      // 02a: ldc2_w 92929383231580
      // 02d: lxor
      // 02e: lstore 13
      // 030: dup2
      // 031: ldc2_w 128266021851360
      // 034: lxor
      // 035: dup2
      // 036: bipush 8
      // 038: lushr
      // 039: lstore 15
      // 03b: dup2
      // 03c: bipush 56
      // 03e: lshl
      // 03f: bipush 56
      // 041: lushr
      // 042: l2i
      // 043: istore 17
      // 045: pop2
      // 046: dup2
      // 047: ldc2_w 23580033237904
      // 04a: lxor
      // 04b: dup2
      // 04c: bipush 32
      // 04e: lushr
      // 04f: lstore 18
      // 051: dup2
      // 052: bipush 32
      // 054: lshl
      // 055: bipush 32
      // 057: lushr
      // 058: l2i
      // 059: istore 20
      // 05b: pop2
      // 05c: dup2
      // 05d: ldc2_w 114867036464889
      // 060: lxor
      // 061: lstore 21
      // 063: pop2
      // 064: aload 0
      // 065: aload 1
      // 066: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 069: aload 0
      // 06a: bipush 1
      // 06b: putfield com/zelix/ik.f Z
      // 06e: aload 0
      // 06f: aload 2
      // 070: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 073: putfield com/zelix/ik.D I
      // 076: ldc2_w -1746915180733737045
      // 079: lload 9
      // 07b: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: aload 2
      // 081: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 084: istore 24
      // 086: aload 0
      // 087: aload 0
      // 088: getfield com/zelix/ik.D I
      // 08b: iload 24
      // 08d: iadd
      // 08e: putfield com/zelix/ik.O I
      // 091: aload 7
      // 093: getstatic com/zelix/ik.z Lcom/zelix/_uo;
      // 096: aload 0
      // 097: getfield com/zelix/ik.D I
      // 09a: lload 11
      // 09c: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 09f: aload 0
      // 0a0: lload 13
      // 0a2: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0a5: aload 7
      // 0a7: getstatic com/zelix/ik.z Lcom/zelix/_uo;
      // 0aa: aload 0
      // 0ab: getfield com/zelix/ik.O I
      // 0ae: lload 11
      // 0b0: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 0b3: aload 0
      // 0b4: lload 13
      // 0b6: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0b9: aload 2
      // 0ba: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0bd: istore 25
      // 0bf: aload 2
      // 0c0: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0c3: istore 26
      // 0c5: aload 2
      // 0c6: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0c9: istore 27
      // 0cb: aload 0
      // 0cc: aload 3
      // 0cd: lload 18
      // 0cf: iload 27
      // 0d1: iload 20
      // 0d3: invokevirtual com/zelix/te.T (JII)Lcom/zelix/vi;
      // 0d6: putfield com/zelix/ik.E Lcom/zelix/lu;
      // 0d9: aload 0
      // 0da: lload 15
      // 0dc: iload 25
      // 0de: iload 17
      // 0e0: i2b
      // 0e1: invokevirtual com/zelix/ik.N (JIB)Lcom/zelix/xl;
      // 0e4: astore 28
      // 0e6: istore 23
      // 0e8: aload 0
      // 0e9: lload 15
      // 0eb: iload 26
      // 0ed: iload 17
      // 0ef: i2b
      // 0f0: invokevirtual com/zelix/ik.N (JIB)Lcom/zelix/xl;
      // 0f3: astore 29
      // 0f5: iload 23
      // 0f7: ifeq 1ad
      // 0fa: aload 28
      // 0fc: instanceof com/zelix/mx
      // 0ff: ifeq 19a
      // 102: goto 110
      // 105: ldc2_w -87388526694407179
      // 108: lload 9
      // 10a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: iload 8
      // 112: ifle 19f
      // 115: aload 29
      // 117: instanceof com/zelix/mx
      // 11a: ifeq 19a
      // 11d: goto 12b
      // 120: ldc2_w -87388526694407179
      // 123: lload 9
      // 125: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 0
      // 12c: iload 23
      // 12e: iload 6
      // 130: ifle 1b0
      // 133: ifeq 1ae
      // 136: goto 144
      // 139: ldc2_w -87388526694407179
      // 13c: lload 9
      // 13e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: iload 8
      // 146: iflt 19b
      // 149: getfield com/zelix/ik.E Lcom/zelix/lu;
      // 14c: ifnull 19a
      // 14f: goto 15d
      // 152: ldc2_w -87388526694407179
      // 155: lload 9
      // 157: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: athrow
      // 15d: aload 0
      // 15e: aload 28
      // 160: checkcast com/zelix/mx
      // 163: invokevirtual com/zelix/ik.J (Lcom/zelix/mx;)V
      // 166: aload 0
      // 167: aload 29
      // 169: checkcast com/zelix/mx
      // 16c: invokevirtual com/zelix/ik.h (Lcom/zelix/mx;)V
      // 16f: aload 5
      // 171: aload 0
      // 172: invokevirtual com/zelix/ik.u ()Lcom/zelix/mx;
      // 175: aload 0
      // 176: lload 13
      // 178: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 17b: aload 5
      // 17d: aload 0
      // 17e: invokevirtual com/zelix/ik.s ()Lcom/zelix/mx;
      // 181: aload 0
      // 182: lload 13
      // 184: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 187: iload 23
      // 189: ifne 1e5
      // 18c: goto 19a
      // 18f: ldc2_w -87388526694407179
      // 192: lload 9
      // 194: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 199: athrow
      // 19a: aload 0
      // 19b: bipush 0
      // 19c: putfield com/zelix/ik.f Z
      // 19f: goto 1ad
      // 1a2: ldc2_w -87388526694407179
      // 1a5: lload 9
      // 1a7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: iload 25
      // 1b0: iload 26
      // 1b2: iload 27
      // 1b4: lload 21
      // 1b6: bipush 4
      // 1b7: anewarray 142
      // 1ba: dup_x2
      // 1bb: dup_x2
      // 1bc: pop
      // 1bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c0: bipush 3
      // 1c1: swap
      // 1c2: aastore
      // 1c3: dup_x1
      // 1c4: swap
      // 1c5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1c8: bipush 2
      // 1c9: swap
      // 1ca: aastore
      // 1cb: dup_x1
      // 1cc: swap
      // 1cd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d0: bipush 1
      // 1d1: swap
      // 1d2: aastore
      // 1d3: dup_x1
      // 1d4: swap
      // 1d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1d8: bipush 0
      // 1d9: swap
      // 1da: aastore
      // 1db: ldc2_w -391724833170439475
      // 1de: lload 9
      // 1e0: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: return
   }

   _op x(Object[] var1) {
      return this.g;
   }

   @Override
   public int compareTo(Object var1) {
      long var2 = a ^ 131195704152708L;
      long var4 = var2 ^ 127649948657800L;
      return x44.a<"l">(this, new Object[]{(ik)var1, var4}, -5655101124693016805L, var2);
   }

   public void e(Integer param1, long param2, _op param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -7634270188711532953
      // 03: lload 2
      // 04: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 5
      // 0b: aload 0
      // 0c: getfield com/zelix/ik.g Lcom/zelix/_op;
      // 0f: ifnonnull 60
      // 12: aload 1
      // 13: invokevirtual java/lang/Integer.intValue ()I
      // 16: aload 0
      // 17: getfield com/zelix/ik.D I
      // 1a: lload 2
      // 1b: lconst_0
      // 1c: lcmp
      // 1d: iflt 75
      // 20: iload 5
      // 22: ifeq 75
      // 25: goto 32
      // 28: ldc2_w -8140921766270660039
      // 2b: lload 2
      // 2c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: lload 2
      // 33: lconst_0
      // 34: lcmp
      // 35: iflt 68
      // 38: if_icmpne 60
      // 3b: goto 48
      // 3e: ldc2_w -8140921766270660039
      // 41: lload 2
      // 42: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: aload 4
      // 4b: putfield com/zelix/ik.g Lcom/zelix/_op;
      // 4e: iload 5
      // 50: ifne 8b
      // 53: goto 60
      // 56: ldc2_w -8140921766270660039
      // 59: lload 2
      // 5a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 1
      // 61: invokevirtual java/lang/Integer.intValue ()I
      // 64: aload 0
      // 65: getfield com/zelix/ik.O I
      // 68: goto 75
      // 6b: ldc2_w -8140921766270660039
      // 6e: lload 2
      // 6f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: athrow
      // 75: if_icmpne 8b
      // 78: aload 0
      // 79: aload 4
      // 7b: putfield com/zelix/ik.H Lcom/zelix/_op;
      // 7e: goto 8b
      // 81: ldc2_w -8140921766270660039
      // 84: lload 2
      // 85: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: return
   }

   public mx s() {
      return this.R;
   }

   public mx u() {
      return this.J;
   }

   public String d(Object[] var1) {
      long var2 = (Long)var1[0];
      return c;
   }

   private void o(Object[] var1) {
      int var4 = (Integer)var1[0];
      int var6 = (Integer)var1[1];
      int var5 = (Integer)var1[2];
      long var2 = (Long)var1[3];
      var2 = a ^ var2;
      x44.a<"q">(this, new byte[a<"h">(23320, 1051197233110833L ^ var2)], 7571002680425570564L, var2);
      x44.a<"n">(this, 7571002680425570564L, var2)[0] = (byte)(
         this.D >>> a<"h">(5822, 8376580818414391958L ^ var2) & a<"h">(24591, 8538706783456666658L ^ var2)
      );
      x44.a<"n">(this, 7571002680425570564L, var2)[1] = (byte)(this.D >>> 0 & a<"h">(22896, 2084464006477061461L ^ var2));
      x44.a<"n">(this, 7571002680425570564L, var2)[2] = (byte)(
         this.O >>> a<"h">(9212, 1150303282740783058L ^ var2) & a<"h">(22896, 2084464006477061461L ^ var2)
      );
      x44.a<"n">(this, 7571002680425570564L, var2)[3] = (byte)(this.O >>> 0 & a<"h">(22896, 2084464006477061461L ^ var2));
      x44.a<"n">(this, 7571002680425570564L, var2)[4] = (byte)(var4 >>> a<"h">(9212, 1150303282740783058L ^ var2) & a<"h">(22896, 2084464006477061461L ^ var2));
      x44.a<"n">(this, 7571002680425570564L, var2)[5] = (byte)(var4 >>> 0 & a<"h">(22896, 2084464006477061461L ^ var2));
      x44.a<"n">(this, 7571002680425570564L, var2)[a<"h">(20606, 2701332586062943317L ^ var2)] = (byte)(
         var6 >>> a<"h">(9212, 1150303282740783058L ^ var2) & a<"h">(22896, 2084464006477061461L ^ var2)
      );
      x44.a<"n">(this, 7571002680425570564L, var2)[a<"h">(12216, 3432394606809344916L ^ var2)] = (byte)(var6 >>> 0 & a<"h">(22896, 2084464006477061461L ^ var2));
      x44.a<"n">(this, 7571002680425570564L, var2)[a<"h">(9212, 1150303282740783058L ^ var2)] = (byte)(
         var5 >>> a<"h">(9212, 1150303282740783058L ^ var2) & a<"h">(22896, 2084464006477061461L ^ var2)
      );
      x44.a<"n">(this, 7571002680425570564L, var2)[a<"h">(16321, 1992003024691952619L ^ var2)] = (byte)(var5 >>> 0 & a<"h">(22896, 2084464006477061461L ^ var2));
   }

   ik(h8 var1, long var2, int var4, int var5, mx var6, mx var7, lu var8, _y4 var9) {
      var2 = a ^ var2;
      long var10 = var2 ^ 47495853942914L;
      long var12 = var2 ^ 72204598645706L;
      super(var1);
      this.f = true;
      this.f = true;
      this.D = var4;
      var9.G(z.R(var4, var10), this, var12);
      this.O = var5;
      var9.G(z.R(var5, var10), this, var12);
      this.E = var8;
      this.J(var6);
      this.h(var7);
   }

   protected void v(Object[] param1) {
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/ik.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w -7968415311671286482
      // 1c: lload 3
      // 1d: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: istore 5
      // 24: iload 5
      // 26: ifne 8b
      // 29: aload 0
      // 2a: getfield com/zelix/ik.f Z
      // 2d: ifeq 96
      // 30: goto 3d
      // 33: ldc2_w -7704021289151625175
      // 36: lload 3
      // 37: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 2
      // 3e: aload 0
      // 3f: getfield com/zelix/ik.g Lcom/zelix/_op;
      // 42: invokevirtual com/zelix/_op.W ()I
      // 45: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 48: aload 2
      // 49: aload 0
      // 4a: getfield com/zelix/ik.H Lcom/zelix/_op;
      // 4d: invokevirtual com/zelix/_op.W ()I
      // 50: aload 0
      // 51: getfield com/zelix/ik.g Lcom/zelix/_op;
      // 54: invokevirtual com/zelix/_op.W ()I
      // 57: isub
      // 58: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 5b: aload 2
      // 5c: aload 0
      // 5d: invokevirtual com/zelix/ik.u ()Lcom/zelix/mx;
      // 60: invokevirtual com/zelix/mx.B ()I
      // 63: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 66: aload 2
      // 67: aload 0
      // 68: invokevirtual com/zelix/ik.s ()Lcom/zelix/mx;
      // 6b: invokevirtual com/zelix/mx.B ()I
      // 6e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 71: aload 2
      // 72: aload 0
      // 73: getfield com/zelix/ik.E Lcom/zelix/lu;
      // 76: invokeinterface com/zelix/lu.H ()I 1
      // 7b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 7e: goto 8b
      // 81: ldc2_w -7704021289151625175
      // 84: lload 3
      // 85: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: lload 3
      // 8c: lconst_0
      // 8d: lcmp
      // 8e: iflt a4
      // 91: iload 5
      // 93: ifeq b1
      // 96: aload 2
      // 97: aload 0
      // 98: ldc2_w -8410501225568205998
      // 9b: lload 3
      // 9c: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: invokevirtual java/io/DataOutputStream.write ([B)V
      // a4: goto b1
      // a7: ldc2_w -7704021289151625175
      // aa: lload 3
      // ab: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: return
   }

   String t(Object[] param1) {
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
      // 24: bipush 48
      // 26: lshl
      // 27: iload 2
      // 28: i2l
      // 29: bipush 48
      // 2b: lshl
      // 2c: bipush 16
      // 2e: lushr
      // 2f: lor
      // 30: iload 3
      // 31: i2l
      // 32: bipush 32
      // 34: lshl
      // 35: bipush 32
      // 37: lushr
      // 38: lor
      // 39: getstatic com/zelix/ik.a J
      // 3c: lxor
      // 3d: lstore 5
      // 3f: ldc2_w 362489287776023917
      // 42: lload 5
      // 44: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: istore 7
      // 4b: aload 0
      // 4c: iload 7
      // 4e: ifeq 74
      // 51: getfield com/zelix/ik.f Z
      // 54: ifeq 7b
      // 57: goto 65
      // 5a: ldc2_w 2022097992693678387
      // 5d: lload 5
      // 5f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: aload 0
      // 66: goto 74
      // 69: ldc2_w 2022097992693678387
      // 6c: lload 5
      // 6e: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: invokevirtual com/zelix/ik.u ()Lcom/zelix/mx;
      // 77: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 7a: areturn
      // 7b: ldc ""
      // 7d: areturn
   }

   public wd B(int var1, byte var2, int var3) {
      return wd.e;
   }

   public void h(mx var1) {
      this.R = var1;
   }

   public boolean c(Object[] var1) {
      return this.f;
   }

   protected void C(Object[] param1) {
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
      // 004: checkcast java/io/DataOutputStream
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: pop
      // 01c: getstatic com/zelix/ik.a J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: aload 5
      // 024: aload 0
      // 025: getfield com/zelix/ik.g Lcom/zelix/_op;
      // 028: invokevirtual com/zelix/_op.W ()I
      // 02b: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 02e: aload 5
      // 030: aload 0
      // 031: getfield com/zelix/ik.H Lcom/zelix/_op;
      // 034: invokevirtual com/zelix/_op.W ()I
      // 037: aload 0
      // 038: getfield com/zelix/ik.g Lcom/zelix/_op;
      // 03b: invokevirtual com/zelix/_op.W ()I
      // 03e: isub
      // 03f: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 042: ldc2_w 1263517880031978956
      // 045: lload 2
      // 046: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aload 4
      // 04d: aload 0
      // 04e: invokevirtual com/zelix/ik.u ()Lcom/zelix/mx;
      // 051: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 056: checkcast com/zelix/mx
      // 059: checkcast com/zelix/mx
      // 05c: astore 7
      // 05e: istore 6
      // 060: iload 6
      // 062: ifne 08e
      // 065: aload 7
      // 067: ifnull 099
      // 06a: goto 077
      // 06d: ldc2_w 1582940346901825739
      // 070: lload 2
      // 071: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 5
      // 079: aload 7
      // 07b: invokevirtual com/zelix/mx.B ()I
      // 07e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 081: goto 08e
      // 084: ldc2_w 1582940346901825739
      // 087: lload 2
      // 088: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: lload 2
      // 08f: lconst_0
      // 090: lcmp
      // 091: ifle 0a5
      // 094: iload 6
      // 096: ifeq 0b2
      // 099: aload 5
      // 09b: aload 0
      // 09c: invokevirtual com/zelix/ik.u ()Lcom/zelix/mx;
      // 09f: invokevirtual com/zelix/mx.B ()I
      // 0a2: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0a5: goto 0b2
      // 0a8: ldc2_w 1582940346901825739
      // 0ab: lload 2
      // 0ac: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 4
      // 0b4: aload 0
      // 0b5: invokevirtual com/zelix/ik.s ()Lcom/zelix/mx;
      // 0b8: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0bd: checkcast com/zelix/mx
      // 0c0: checkcast com/zelix/mx
      // 0c3: astore 8
      // 0c5: iload 6
      // 0c7: lload 2
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: ifle 101
      // 0cd: ifne 0f9
      // 0d0: aload 8
      // 0d2: ifnull 104
      // 0d5: goto 0e2
      // 0d8: ldc2_w 1582940346901825739
      // 0db: lload 2
      // 0dc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 5
      // 0e4: aload 8
      // 0e6: invokevirtual com/zelix/mx.B ()I
      // 0e9: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0ec: goto 0f9
      // 0ef: ldc2_w 1582940346901825739
      // 0f2: lload 2
      // 0f3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: lload 2
      // 0fa: lconst_0
      // 0fb: lcmp
      // 0fc: iflt 12b
      // 0ff: iload 6
      // 101: ifeq 11d
      // 104: aload 5
      // 106: aload 0
      // 107: invokevirtual com/zelix/ik.s ()Lcom/zelix/mx;
      // 10a: invokevirtual com/zelix/mx.B ()I
      // 10d: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 110: goto 11d
      // 113: ldc2_w 1582940346901825739
      // 116: lload 2
      // 117: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: athrow
      // 11d: aload 5
      // 11f: aload 0
      // 120: getfield com/zelix/ik.E Lcom/zelix/lu;
      // 123: invokeinterface com/zelix/lu.H ()I 1
      // 128: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 12b: return
   }

   int S(Object[] var1) {
      return this.E.H();
   }

   public void b(mx param1, short param2, mx param3, int param4, short param5) {
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
      // 1b: ldc2_w -6897634359885852628
      // 1e: lload 6
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 8
      // 27: aload 0
      // 28: invokevirtual com/zelix/ik.u ()Lcom/zelix/mx;
      // 2b: aload 1
      // 2c: iload 8
      // 2e: ifeq 80
      // 31: if_acmpne 5a
      // 34: goto 42
      // 37: ldc2_w -5093972056455371662
      // 3a: lload 6
      // 3c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: athrow
      // 42: aload 0
      // 43: aload 3
      // 44: invokevirtual com/zelix/ik.J (Lcom/zelix/mx;)V
      // 47: iload 8
      // 49: ifne 88
      // 4c: goto 5a
      // 4f: ldc2_w -5093972056455371662
      // 52: lload 6
      // 54: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: iload 8
      // 5d: ifeq 84
      // 60: goto 6e
      // 63: ldc2_w -5093972056455371662
      // 66: lload 6
      // 68: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: invokevirtual com/zelix/ik.s ()Lcom/zelix/mx;
      // 71: aload 1
      // 72: goto 80
      // 75: ldc2_w -5093972056455371662
      // 78: lload 6
      // 7a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f: athrow
      // 80: if_acmpne 88
      // 83: aload 0
      // 84: aload 3
      // 85: invokevirtual com/zelix/ik.h (Lcom/zelix/mx;)V
      // 88: return
   }

   static {
      long var11 = a ^ 8499397844839L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var15 = var13.doFinal("iÇãjÌ¥\u009d¨\u0019\u0097d\u0011á\u009c:\u0080n\u008b\u008fHh~\u0012\u0092".getBytes("ISO-8859-1"));
      String var22 = a(var15).intern();
      int var10001 = -1;
      c = var22;
      i = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "ÞÎ%\u000b\u0015)ë\u000eön\u0085©\u009bío\u009d\u0011\u0091\u009b*ÁqÁÅ\\%\u000f*\u0094\u0090\f\u008aÜ\u00adÊ£âç\u0080Wßaî1×l{îG=\u008c\tõ((+";
      int var5 = "ÞÎ%\u000b\u0015)ë\u000eön\u0085©\u009bío\u009d\u0011\u0091\u009b*ÁqÁÅ\\%\u000f*\u0094\u0090\f\u008aÜ\u00adÊ£âç\u0080Wßaî1×l{îG=\u008c\tõ((+"
         .length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var24 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var27 = -1;

         while (true) {
            long var8 = var24;
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
            long var29 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var27) {
               case 0:
                  var18[var10001] = var29;
                  if (var2 >= var5) {
                     e = var6;
                     h = new Integer[9];
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var29;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "\u0086\u008d\u008d\u009a\u0007\u001c\u009cO½ÉZ\u0010Ã(&Ý";
                  var5 = "\u0086\u008d\u008d\u009a\u0007\u001c\u009cO½ÉZ\u0010Ã(&Ý".length();
                  var2 = 0;
            }

            byte var21 = var2;
            var2 += 8;
            var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var24 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var27 = 0;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9924;
      if (h[var3] == null) {
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ik", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("com/zelix/ik" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
