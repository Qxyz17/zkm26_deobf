package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class kg extends kw implements eo {
   private jf[] O;
   private int m;
   private static final long a = prr.a(470484526258641764L, 473308856055843375L, MethodHandles.lookup().lookupClass()).a(96345661815032L);
   private static final String[] c;
   private static final String[] d;
   private static final Map g = new HashMap(13);

   kg(x8 var1, jf[] var2, int var3, int var4) {
      long var5 = ((long)var3 << 32 | (long)var4 << 32 >>> 32) ^ a;
      super(null, var1, var2.length * 2 + 2);
      m44.a<"p">(this, var2.length, -9177934777185060909L, var5);
      m44.a<"p">(this, var2, -8877074051619807785L, var5);
   }

   void z(gu param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 113240848016893
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 120816807025025
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w 5618762033536375070
      // 13: lload 2
      // 14: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: aload 1
      // 1a: aload 0
      // 1b: getfield com/zelix/kg.b Lcom/zelix/x8;
      // 1e: aload 0
      // 1f: lload 4
      // 21: aload 0
      // 22: invokevirtual com/zelix/gu.K (Lcom/zelix/js;Ljava/lang/Object;JLjava/lang/Object;)Z
      // 25: pop
      // 26: bipush 0
      // 27: istore 9
      // 29: istore 8
      // 2b: iload 9
      // 2d: aload 0
      // 2e: ldc2_w 5294610036777144419
      // 31: lload 2
      // 32: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: arraylength
      // 38: if_icmpge 59
      // 3b: aload 0
      // 3c: ldc2_w 5294610036777144419
      // 3f: lload 2
      // 40: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: iload 9
      // 47: aaload
      // 48: lload 6
      // 4a: aload 1
      // 4b: aload 0
      // 4c: aload 0
      // 4d: invokevirtual com/zelix/jf.e (JLcom/zelix/gu;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 50: pop
      // 51: iinc 9 1
      // 54: iload 8
      // 56: ifeq 2b
      // 59: lload 2
      // 5a: lconst_0
      // 5b: lcmp
      // 5c: iflt 54
      // 5f: return
   }

   protected void c(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 0
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w 1272493964096652623
      // 20: lload 2
      // 21: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: aload 0
      // 27: lload 5
      // 29: aload 4
      // 2b: bipush 2
      // 2c: anewarray 49
      // 2f: dup_x1
      // 30: swap
      // 31: bipush 1
      // 32: swap
      // 33: aastore
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: invokespecial com/zelix/kw.c ([Ljava/lang/Object;)V
      // 40: aload 4
      // 42: aload 0
      // 43: ldc2_w 1244136792191313462
      // 46: lload 2
      // 47: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 4f: istore 7
      // 51: bipush 0
      // 52: istore 8
      // 54: iload 8
      // 56: aload 0
      // 57: ldc2_w 1244136792191313462
      // 5a: lload 2
      // 5b: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: if_icmpge 80
      // 63: aload 4
      // 65: aload 0
      // 66: ldc2_w 1525364639074716722
      // 69: lload 2
      // 6a: invokedynamic w (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: iload 8
      // 71: aaload
      // 72: invokevirtual com/zelix/jf.E ()I
      // 75: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 78: iinc 8 1
      // 7b: iload 7
      // 7d: ifeq 54
      // 80: lload 2
      // 81: lconst_0
      // 82: lcmp
      // 83: iflt 7b
      // 86: return
   }

   kg(long param1, _4 param3, int param4, String param5, h1 param6, l6q param7, l6q param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/kg.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 16760112668737
      // 00b: lxor
      // 00c: lstore 9
      // 00e: dup2
      // 00f: ldc2_w 16898775804091
      // 012: lxor
      // 013: lstore 11
      // 015: dup2
      // 016: ldc2_w 74387856557119
      // 019: lxor
      // 01a: lstore 13
      // 01c: dup2
      // 01d: ldc2_w 39519865168248
      // 020: lxor
      // 021: lstore 15
      // 023: pop2
      // 024: aload 0
      // 025: aload 3
      // 026: iload 4
      // 028: aload 5
      // 02a: lload 11
      // 02c: aload 6
      // 02e: aload 7
      // 030: invokespecial com/zelix/kw.<init> (Lcom/zelix/_4;ILjava/lang/String;JLcom/zelix/h1;Lcom/zelix/l6q;)V
      // 033: aload 0
      // 034: aload 6
      // 036: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 039: ldc2_w 1718806370099699880
      // 03c: lload 1
      // 03d: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: ldc2_w 1112068340150533670
      // 045: lload 1
      // 046: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: aload 0
      // 04c: aload 0
      // 04d: ldc2_w 1718806370099699880
      // 050: lload 1
      // 051: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: anewarray 340
      // 059: ldc2_w 1420126563357919916
      // 05c: lload 1
      // 05d: invokedynamic s (Ljava/lang/Object;[Lcom/zelix/jf;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: bipush 0
      // 063: istore 18
      // 065: istore 17
      // 067: iload 18
      // 069: aload 0
      // 06a: ldc2_w 1718806370099699880
      // 06d: lload 1
      // 06e: invokedynamic q (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: if_icmpge 11b
      // 076: aload 6
      // 078: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 07b: istore 19
      // 07d: aload 0
      // 07e: lload 13
      // 080: iload 19
      // 082: invokevirtual com/zelix/kg.m (JI)Lcom/zelix/js;
      // 085: astore 20
      // 087: iload 17
      // 089: lload 1
      // 08a: lconst_0
      // 08b: lcmp
      // 08c: ifle 118
      // 08f: ifeq 116
      // 092: aload 20
      // 094: instanceof com/zelix/jf
      // 097: ifne 0ec
      // 09a: goto 0a7
      // 09d: ldc2_w 711721067775773233
      // 0a0: lload 1
      // 0a1: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: new com/zelix/aw
      // 0aa: dup
      // 0ab: new java/lang/StringBuilder
      // 0ae: dup
      // 0af: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b2: aload 0
      // 0b3: lload 9
      // 0b5: invokevirtual com/zelix/kg.h (J)Ljava/lang/String;
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: sipush 14539
      // 0be: ldc2_w 4632517067204720635
      // 0c1: lload 1
      // 0c2: lxor
      // 0c3: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cb: sipush 26070
      // 0ce: ldc2_w 6051474143543274215
      // 0d1: lload 1
      // 0d2: lxor
      // 0d3: invokedynamic b (IJ)Ljava/lang/String; bsm=com/zelix/kg.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0de: invokespecial com/zelix/aw.<init> (Ljava/lang/String;)V
      // 0e1: athrow
      // 0e2: ldc2_w 711721067775773233
      // 0e5: lload 1
      // 0e6: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: ldc2_w 1420126563357919916
      // 0f0: lload 1
      // 0f1: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: iload 18
      // 0f8: aload 20
      // 0fa: checkcast com/zelix/jf
      // 0fd: aastore
      // 0fe: aload 8
      // 100: aload 0
      // 101: ldc2_w 1420126563357919916
      // 104: lload 1
      // 105: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: iload 18
      // 10c: aaload
      // 10d: aload 0
      // 10e: lload 15
      // 110: invokevirtual com/zelix/l6q.t (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 113: iinc 18 1
      // 116: iload 17
      // 118: ifne 067
      // 11b: return
   }

   protected void N(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/util/Map
      // 0e: astore 6
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/lqu
      // 20: astore 5
      // 22: pop
      // 23: lload 3
      // 24: dup2
      // 25: ldc2_w 0
      // 28: lxor
      // 29: lstore 7
      // 2b: pop2
      // 2c: ldc2_w 1680553024964027930
      // 2f: lload 3
      // 30: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 0
      // 36: aload 2
      // 37: aload 6
      // 39: lload 7
      // 3b: aload 5
      // 3d: bipush 4
      // 3e: anewarray 49
      // 41: dup_x1
      // 42: swap
      // 43: bipush 3
      // 44: swap
      // 45: aastore
      // 46: dup_x2
      // 47: dup_x2
      // 48: pop
      // 49: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4c: bipush 2
      // 4d: swap
      // 4e: aastore
      // 4f: dup_x1
      // 50: swap
      // 51: bipush 1
      // 52: swap
      // 53: aastore
      // 54: dup_x1
      // 55: swap
      // 56: bipush 0
      // 57: swap
      // 58: aastore
      // 59: invokespecial com/zelix/kw.N ([Ljava/lang/Object;)V
      // 5c: istore 9
      // 5e: aload 2
      // 5f: aload 0
      // 60: ldc2_w 1145663733124151444
      // 63: lload 3
      // 64: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 6c: bipush 0
      // 6d: istore 10
      // 6f: iload 10
      // 71: aload 0
      // 72: ldc2_w 1145663733124151444
      // 75: lload 3
      // 76: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: if_icmpge fe
      // 7e: aload 6
      // 80: aload 0
      // 81: ldc2_w 831221740072506000
      // 84: lload 3
      // 85: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: iload 10
      // 8c: aaload
      // 8d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 92: checkcast com/zelix/js
      // 95: astore 11
      // 97: iload 9
      // 99: lload 3
      // 9a: lconst_0
      // 9b: lcmp
      // 9c: ifle cc
      // 9f: ifeq ca
      // a2: aload 11
      // a4: ifnull d5
      // a7: goto b4
      // aa: ldc2_w 1287133234089349645
      // ad: lload 3
      // ae: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: aload 2
      // b5: aload 11
      // b7: invokevirtual com/zelix/js.E ()I
      // ba: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // bd: goto ca
      // c0: ldc2_w 1287133234089349645
      // c3: lload 3
      // c4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: athrow
      // ca: iload 9
      // cc: lload 3
      // cd: lconst_0
      // ce: lcmp
      // cf: iflt fb
      // d2: ifne f6
      // d5: aload 2
      // d6: aload 0
      // d7: ldc2_w 831221740072506000
      // da: lload 3
      // db: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: iload 10
      // e2: aaload
      // e3: invokevirtual com/zelix/jf.E ()I
      // e6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // e9: goto f6
      // ec: ldc2_w 1287133234089349645
      // ef: lload 3
      // f0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f5: athrow
      // f6: iinc 10 1
      // f9: iload 9
      // fb: ifne 6f
      // fe: return
   }

   int Q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return m44.a<"v">(this, -5929769474399593785L, var2);
   }

   public void S(Object[] param1) {
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
      // 04: checkcast com/zelix/jf
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/jf
      // 0e: astore 5
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: ldc2_w -7028195342100598978
      // 1e: lload 3
      // 1f: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: ldc2_w -9030486616885224524
      // 2f: lload 3
      // 30: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: arraylength
      // 36: if_icmpge a4
      // 39: aload 0
      // 3a: ldc2_w -9030486616885224524
      // 3d: lload 3
      // 3e: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: iload 7
      // 45: lload 3
      // 46: lconst_0
      // 47: lcmp
      // 48: ifle 7b
      // 4b: iload 6
      // 4d: ifeq 7b
      // 50: aaload
      // 51: aload 2
      // 52: if_acmpne 89
      // 55: goto 62
      // 58: ldc2_w -7424039555008341207
      // 5b: lload 3
      // 5c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: aload 0
      // 63: ldc2_w -9030486616885224524
      // 66: lload 3
      // 67: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: iload 7
      // 6e: goto 7b
      // 71: ldc2_w -7424039555008341207
      // 74: lload 3
      // 75: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 5
      // 7d: aastore
      // 7e: iload 6
      // 80: lload 3
      // 81: lconst_0
      // 82: lcmp
      // 83: ifle 8e
      // 86: ifne a4
      // 89: iinc 7 1
      // 8c: iload 6
      // 8e: ifne 29
      // 91: lload 3
      // 92: lconst_0
      // 93: lcmp
      // 94: iflt 39
      // 97: goto a4
      // 9a: ldc2_w -7424039555008341207
      // 9d: lload 3
      // 9e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: return
   }

   Enumeration E(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 0c: getstatic com/zelix/kg.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 92464372460558
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 5246868732893280664
      // 1e: lload 2
      // 1f: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: ldc2_w 6055950094809681170
      // 28: lload 2
      // 29: invokedynamic w (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: arraylength
      // 2f: anewarray 340
      // 32: astore 7
      // 34: istore 6
      // 36: bipush 0
      // 37: istore 8
      // 39: iload 8
      // 3b: aload 0
      // 3c: ldc2_w 6055950094809681170
      // 3f: lload 2
      // 40: invokedynamic w (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: arraylength
      // 46: if_icmpge 63
      // 49: aload 7
      // 4b: iload 8
      // 4d: aload 0
      // 4e: ldc2_w 6055950094809681170
      // 51: lload 2
      // 52: invokedynamic w (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: iload 8
      // 59: aaload
      // 5a: aastore
      // 5b: iinc 8 1
      // 5e: iload 6
      // 60: ifne 39
      // 63: lload 2
      // 64: lconst_0
      // 65: lcmp
      // 66: ifle 5e
      // 69: new com/zelix/e4
      // 6c: dup
      // 6d: lload 4
      // 6f: aload 7
      // 71: invokespecial com/zelix/e4.<init> (J[Ljava/lang/Object;)V
      // 74: areturn
   }

   jf g(Object[] var1) {
      int var4 = (Integer)var1[0];
      long var2 = (Long)var1[1];
      var2 = a ^ var2;
      return m44.a<"w">(this, 5238566603448766890L, var2)[var4];
   }

   public Enumeration Y(Object[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:16 from source 13_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
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
      // 0c: getstatic com/zelix/kg.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 31639945331613
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 140639383145625
      // 1e: lxor
      // 1f: lstore 6
      // 21: pop2
      // 22: ldc2_w -6394030040873052661
      // 25: lload 2
      // 26: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 0
      // 2c: ldc2_w -4929112445311573375
      // 2f: lload 2
      // 30: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: arraylength
      // 36: anewarray 7
      // 39: astore 9
      // 3b: istore 8
      // 3d: bipush 0
      // 3e: istore 10
      // 40: iload 10
      // 42: aload 0
      // 43: ldc2_w -4929112445311573375
      // 46: lload 2
      // 47: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: arraylength
      // 4d: if_icmpge 6f
      // 50: aload 9
      // 52: iload 10
      // 54: aload 0
      // 55: ldc2_w -4929112445311573375
      // 58: lload 2
      // 59: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: iload 10
      // 60: aaload
      // 61: lload 6
      // 63: invokevirtual com/zelix/jf.g (J)Ljava/lang/String;
      // 66: aastore
      // 67: iinc 10 1
      // 6a: iload 8
      // 6c: ifne 40
      // 6f: lload 2
      // 70: lconst_0
      // 71: lcmp
      // 72: ifle 6a
      // 75: new com/zelix/e4
      // 78: dup
      // 79: lload 4
      // 7b: aload 9
      // 7d: invokespecial com/zelix/e4.<init> (J[Ljava/lang/Object;)V
      // 80: areturn
   }

   static {
      long var0 = a ^ 92032330519389L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "òxT\t\u0083JòÀ\u0082üL>Ï\u0013Ó`H\u009d*\u0006¶bÉ\u0080Û²\u0002âUø`\u009eF\u0007#77Åýsàv\u0016N\u0089\u0003\u000bfÌû\u009a*Õð§©&<j]gKÅ}\u0094¯9¥S\u00831\u007f\u001e2¿ÀÑÎÃu=¢§Ë\u0016ç;ß\u001f";
      int var8 = "òxT\t\u0083JòÀ\u0082üL>Ï\u0013Ó`H\u009d*\u0006¶bÉ\u0080Û²\u0002âUø`\u009eF\u0007#77Åýsàv\u0016N\u0089\u0003\u000bfÌû\u009a*Õð§©&<j]gKÅ}\u0094¯9¥S\u00831\u007f\u001e2¿ÀÑÎÃu=¢§Ë\u0016ç;ß\u001f"
         .length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            c = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static n9 a(n9 var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21312;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/kg", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/kg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
