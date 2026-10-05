package com.zelix;

import java.io.PrintWriter;
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

public abstract class h1 extends h4 {
   byte[] Q;
   ik[] w;
   boolean H;
   final te R;
   int m;
   private static final long a = ess.a(-5752929772543765081L, -4509556255245368328L, MethodHandles.lookup().lookupClass()).a(181338154601432L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] h;
   private static final Integer[] i;
   private static final Map j;

   final void p(Object[] param1) {
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
      // 04: checkcast java/io/DataOutputStream
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/h1.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 22008482747813
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 7763320161831182328
      // 26: lload 2
      // 27: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 4
      // 2e: aload 0
      // 2f: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 32: arraylength
      // 33: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 36: istore 7
      // 38: bipush 0
      // 39: istore 8
      // 3b: iload 8
      // 3d: aload 0
      // 3e: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 41: arraylength
      // 42: if_icmpge 73
      // 45: aload 0
      // 46: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 49: iload 8
      // 4b: aaload
      // 4c: lload 5
      // 4e: aload 4
      // 50: bipush 2
      // 51: anewarray 314
      // 54: dup_x1
      // 55: swap
      // 56: bipush 1
      // 57: swap
      // 58: aastore
      // 59: dup_x2
      // 5a: dup_x2
      // 5b: pop
      // 5c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f: bipush 0
      // 60: swap
      // 61: aastore
      // 62: ldc2_w 8609240359674623492
      // 65: lload 2
      // 66: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: iinc 8 1
      // 6e: iload 7
      // 70: ifeq 3b
      // 73: lload 2
      // 74: lconst_0
      // 75: lcmp
      // 76: ifle 6e
      // 79: return
   }

   void I(Object[] param1) {
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
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/h1.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 96438358728341
      // 01f: lxor
      // 020: lstore 5
      // 022: pop2
      // 023: ldc2_w 8014067831726955379
      // 026: lload 2
      // 027: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: istore 7
      // 02e: aload 0
      // 02f: getfield com/zelix/h1.H Z
      // 032: ifeq 140
      // 035: new java/util/ArrayList
      // 038: dup
      // 039: aload 0
      // 03a: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 03d: arraylength
      // 03e: invokespecial java/util/ArrayList.<init> (I)V
      // 041: astore 8
      // 043: bipush 0
      // 044: istore 9
      // 046: iload 9
      // 048: aload 0
      // 049: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 04c: arraylength
      // 04d: if_icmpge 0c9
      // 050: aload 0
      // 051: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 054: iload 9
      // 056: aaload
      // 057: astore 10
      // 059: iload 7
      // 05b: lload 2
      // 05c: lconst_0
      // 05d: lcmp
      // 05e: iflt 0c6
      // 061: ifne 0c4
      // 064: aload 4
      // 066: getstatic com/zelix/h1.z Lcom/zelix/_uo;
      // 069: aload 10
      // 06b: bipush 0
      // 06c: anewarray 314
      // 06f: ldc2_w 7550406531218121465
      // 072: lload 2
      // 073: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: lload 5
      // 07a: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 07d: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 082: iload 7
      // 084: lload 2
      // 085: lconst_0
      // 086: lcmp
      // 087: iflt 0d8
      // 08a: ifne 0d6
      // 08d: goto 09a
      // 090: ldc2_w 8238523424962524441
      // 093: lload 2
      // 094: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 099: athrow
      // 09a: ifeq 0c1
      // 09d: goto 0aa
      // 0a0: ldc2_w 8238523424962524441
      // 0a3: lload 2
      // 0a4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 8
      // 0ac: aload 10
      // 0ae: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b3: pop
      // 0b4: goto 0c1
      // 0b7: ldc2_w 8238523424962524441
      // 0ba: lload 2
      // 0bb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: iinc 9 1
      // 0c4: iload 7
      // 0c6: ifeq 046
      // 0c9: aload 8
      // 0cb: lload 2
      // 0cc: lconst_0
      // 0cd: lcmp
      // 0ce: iflt 0f8
      // 0d1: invokeinterface java/util/List.size ()I 1
      // 0d6: iload 7
      // 0d8: lload 2
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: iflt 0e6
      // 0de: ifne 10a
      // 0e1: aload 0
      // 0e2: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 0e5: arraylength
      // 0e6: if_icmpge 140
      // 0e9: goto 0f6
      // 0ec: ldc2_w 8238523424962524441
      // 0ef: lload 2
      // 0f0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: aload 8
      // 0f8: invokeinterface java/util/List.size ()I 1
      // 0fd: goto 10a
      // 100: ldc2_w 8238523424962524441
      // 103: lload 2
      // 104: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: anewarray 516
      // 10d: astore 9
      // 10f: aload 0
      // 110: aload 8
      // 112: aload 9
      // 114: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 119: checkcast [Lcom/zelix/ik;
      // 11c: putfield com/zelix/h1.w [Lcom/zelix/ik;
      // 11f: aload 0
      // 120: aload 0
      // 121: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 124: arraylength
      // 125: putfield com/zelix/h1.m I
      // 128: aload 0
      // 129: aload 0
      // 12a: getfield com/zelix/h1.m I
      // 12d: sipush 11638
      // 130: ldc2_w 1112921824652716969
      // 133: lload 2
      // 134: lxor
      // 135: invokedynamic e (IJ)I bsm=com/zelix/h1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: imul
      // 13b: bipush 2
      // 13c: iadd
      // 13d: putfield com/zelix/h1.C I
      // 140: return
   }

   void l(Object[] var1) {
      long var3 = (Long)var1[0];
      w var2 = (w)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 131897525678358L;
      boolean var7 = x44.a<"u">(4311000994302070679L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = this.H;
            if (var7) {
               break label28;
            }

            if (!this.H) {
               return;
            }
         } catch (gj var9) {
            throw x44.a<"u">(var9, 2788130367442477565L, var3);
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (var8 < this.w.length) {
         x44.a<"m">(this.w[var8], new Object[]{var5, var2}, 2838971889971290407L, var3);
         var8++;
         if (var7) {
            break;
         }
      }
   }

   protected final void O(Object[] param1) {
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
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 131803575664549
      // 18: lxor
      // 19: lstore 5
      // 1b: dup2
      // 1c: ldc2_w 0
      // 1f: lxor
      // 20: lstore 7
      // 22: pop2
      // 23: ldc2_w -8511028589403193946
      // 26: lload 3
      // 27: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: lload 7
      // 2f: aload 2
      // 30: bipush 2
      // 31: anewarray 314
      // 34: dup_x1
      // 35: swap
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
      // 42: invokespecial com/zelix/h4.O ([Ljava/lang/Object;)V
      // 45: istore 9
      // 47: aload 0
      // 48: iload 9
      // 4a: ifne 6e
      // 4d: getfield com/zelix/h1.H Z
      // 50: ifeq 97
      // 53: goto 60
      // 56: ldc2_w -7746070639924620340
      // 59: lload 3
      // 5a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: aload 0
      // 61: goto 6e
      // 64: ldc2_w -7746070639924620340
      // 67: lload 3
      // 68: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: aload 2
      // 6f: lload 5
      // 71: bipush 2
      // 72: anewarray 314
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 1
      // 7c: swap
      // 7d: aastore
      // 7e: dup_x1
      // 7f: swap
      // 80: bipush 0
      // 81: swap
      // 82: aastore
      // 83: ldc2_w -7596791631910659067
      // 86: lload 3
      // 87: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: lload 3
      // 8d: lconst_0
      // 8e: lcmp
      // 8f: iflt a5
      // 92: iload 9
      // 94: ifeq b2
      // 97: aload 2
      // 98: aload 0
      // 99: ldc2_w -7717407049577762034
      // 9c: lload 3
      // 9d: invokedynamic h (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: invokevirtual java/io/DataOutputStream.write ([B)V
      // a5: goto b2
      // a8: ldc2_w -7746070639924620340
      // ab: lload 3
      // ac: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: athrow
      // b2: return
   }

   abstract ik W(Object[] var1);

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
      // 02: ldc2_w 0
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 10727274753381
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -6348162585463318644
      // 13: lload 1
      // 14: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 8
      // 1b: aload 0
      // 1c: getfield com/zelix/h1.H Z
      // 1f: iload 8
      // 21: ifeq 52
      // 24: ifeq 79
      // 27: goto 34
      // 2a: ldc2_w -6344715445668290369
      // 2d: lload 1
      // 2e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: athrow
      // 34: aload 3
      // 35: aload 0
      // 36: getfield com/zelix/h1.c Lcom/zelix/mx;
      // 39: aload 0
      // 3a: aload 0
      // 3b: invokevirtual com/zelix/h1.x ()Lcom/zelix/h8;
      // 3e: lload 6
      // 40: invokevirtual com/zelix/_8l.H (Lcom/zelix/xl;Ljava/lang/Object;Ljava/lang/Object;J)Z
      // 43: pop
      // 44: bipush 0
      // 45: goto 52
      // 48: ldc2_w -6344715445668290369
      // 4b: lload 1
      // 4c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: istore 9
      // 54: iload 9
      // 56: aload 0
      // 57: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 5a: arraylength
      // 5b: if_icmpge 79
      // 5e: aload 0
      // 5f: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 62: iload 9
      // 64: aaload
      // 65: lload 4
      // 67: aload 3
      // 68: ldc2_w -6549773643797797493
      // 6b: lload 1
      // 6c: invokedynamic o (Ljava/lang/Object;JLjava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: iinc 9 1
      // 74: iload 8
      // 76: ifne 54
      // 79: return
   }

   public void i(Object[] var1) {
      int var6 = (Integer)var1[0];
      int var5 = (Integer)var1[1];
      HashMap var2 = (HashMap)var1[2];
      HashMap var7 = (HashMap)var1[3];
      long var3 = (Long)var1[4];
      long var8 = var3 ^ 23588288088045L;
      boolean var10 = x44.a<"s">(4349794608319891481L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = this.H;
            if (var10) {
               break label28;
            }

            if (!this.H) {
               return;
            }
         } catch (gj var12) {
            throw x44.a<"s">(var12, 2395702221221750387L, var3);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < this.w.length) {
         ik var13 = this.w[var11];
         Object[] var10006 = new Object[]{null, null, var7, var8};
         var10006[1] = var5;
         var10006[0] = var6;
         x44.a<"k">(var13, var10006, 2404837824529406147L, var3);
         var11++;
         if (var10) {
            break;
         }
      }
   }

   final int x(long var1) {
      boolean var3 = x44.a<"w">(916934895870556413L, var1);

      try {
         if (var3) {
            return this.H;
         }

         if (this.H) {
            return 2 + this.w.length * c<"e">(12424, 202860312160998872L ^ var1);
         }
      } catch (gj var5) {
         throw x44.a<"w">(var5, 1286681705844725399L, var1);
      }

      return x44.a<"k">(this, 1278205184953677397L, var1).length;
   }

   protected final void j(Object[] param1) {
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
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 4
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/Map
      // 01a: astore 3
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 2
      // 022: pop
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 0
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 40278902499864
      // 030: lxor
      // 031: lstore 9
      // 033: pop2
      // 034: ldc2_w -3921248847547794946
      // 037: lload 4
      // 039: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: aload 0
      // 03f: aload 6
      // 041: lload 7
      // 043: aload 3
      // 044: aload 2
      // 045: bipush 4
      // 046: anewarray 314
      // 049: dup_x1
      // 04a: swap
      // 04b: bipush 3
      // 04c: swap
      // 04d: aastore
      // 04e: dup_x1
      // 04f: swap
      // 050: bipush 2
      // 051: swap
      // 052: aastore
      // 053: dup_x2
      // 054: dup_x2
      // 055: pop
      // 056: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 059: bipush 1
      // 05a: swap
      // 05b: aastore
      // 05c: dup_x1
      // 05d: swap
      // 05e: bipush 0
      // 05f: swap
      // 060: aastore
      // 061: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 064: istore 11
      // 066: aload 0
      // 067: getfield com/zelix/h1.H Z
      // 06a: iload 11
      // 06c: ifeq 099
      // 06f: ifeq 107
      // 072: goto 080
      // 075: ldc2_w -3926806980680118579
      // 078: lload 4
      // 07a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: aload 6
      // 082: aload 0
      // 083: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 086: arraylength
      // 087: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 08a: bipush 0
      // 08b: goto 099
      // 08e: ldc2_w -3926806980680118579
      // 091: lload 4
      // 093: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: istore 12
      // 09b: iload 12
      // 09d: aload 0
      // 09e: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 0a1: arraylength
      // 0a2: if_icmpge 0fb
      // 0a5: aload 0
      // 0a6: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 0a9: iload 12
      // 0ab: aaload
      // 0ac: aload 6
      // 0ae: aload 3
      // 0af: lload 9
      // 0b1: bipush 3
      // 0b2: anewarray 314
      // 0b5: dup_x2
      // 0b6: dup_x2
      // 0b7: pop
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: bipush 2
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 1
      // 0c1: swap
      // 0c2: aastore
      // 0c3: dup_x1
      // 0c4: swap
      // 0c5: bipush 0
      // 0c6: swap
      // 0c7: aastore
      // 0c8: ldc2_w -3021441800287770390
      // 0cb: lload 4
      // 0cd: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: iinc 12 1
      // 0d5: iload 11
      // 0d7: lload 4
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: ifle 0e3
      // 0de: ifeq 125
      // 0e1: iload 11
      // 0e3: ifne 09b
      // 0e6: lload 4
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: ifle 0d5
      // 0ed: goto 0fb
      // 0f0: ldc2_w -3926806980680118579
      // 0f3: lload 4
      // 0f5: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: lload 4
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: iflt 117
      // 102: iload 11
      // 104: ifne 125
      // 107: aload 6
      // 109: aload 0
      // 10a: ldc2_w -3898143389791670769
      // 10d: lload 4
      // 10f: invokedynamic i (Ljava/lang/Object;JJ)[B bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: invokevirtual java/io/DataOutputStream.write ([B)V
      // 117: goto 125
      // 11a: ldc2_w -3926806980680118579
      // 11d: lload 4
      // 11f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: athrow
      // 125: return
   }

   void Q(Object[] param1) {
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
      // 00a: lstore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/util/HashSet
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/w
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/h1.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 14826566083934
      // 026: lxor
      // 027: dup2
      // 028: bipush 16
      // 02a: lushr
      // 02b: lstore 6
      // 02d: dup2
      // 02e: bipush 48
      // 030: lshl
      // 031: bipush 48
      // 033: lushr
      // 034: l2i
      // 035: istore 8
      // 037: pop2
      // 038: dup2
      // 039: ldc2_w 58551905765126
      // 03c: lxor
      // 03d: lstore 9
      // 03f: dup2
      // 040: ldc2_w 76638865583518
      // 043: lxor
      // 044: lstore 11
      // 046: pop2
      // 047: ldc2_w -406171834076770792
      // 04a: lload 3
      // 04b: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: istore 13
      // 052: aload 0
      // 053: getfield com/zelix/h1.H Z
      // 056: iload 13
      // 058: ifne 082
      // 05b: ifeq 3aa
      // 05e: goto 06b
      // 061: ldc2_w -1783898782777368462
      // 064: lload 3
      // 065: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 2
      // 06c: ldc2_w -1838880962378158632
      // 06f: lload 3
      // 070: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: goto 082
      // 078: ldc2_w -1783898782777368462
      // 07b: lload 3
      // 07c: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: athrow
      // 082: ifle 3aa
      // 085: new java/util/ArrayList
      // 088: dup
      // 089: aload 0
      // 08a: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 08d: arraylength
      // 08e: invokespecial java/util/ArrayList.<init> (I)V
      // 091: astore 14
      // 093: bipush 0
      // 094: istore 15
      // 096: iload 15
      // 098: aload 0
      // 099: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 09c: arraylength
      // 09d: if_icmpge 26b
      // 0a0: aload 2
      // 0a1: aload 0
      // 0a2: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 0a5: iload 15
      // 0a7: aaload
      // 0a8: bipush 0
      // 0a9: anewarray 314
      // 0ac: ldc2_w -149195725538247938
      // 0af: lload 3
      // 0b0: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: ldc2_w -359946733087553094
      // 0b8: lload 3
      // 0b9: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: iload 13
      // 0c0: lload 3
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: ifle 278
      // 0c6: ifne 276
      // 0c9: iload 13
      // 0cb: ifne 150
      // 0ce: goto 0db
      // 0d1: ldc2_w -1783898782777368462
      // 0d4: lload 3
      // 0d5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: athrow
      // 0db: lload 3
      // 0dc: lconst_0
      // 0dd: lcmp
      // 0de: iflt 143
      // 0e1: ifeq 137
      // 0e4: goto 0f1
      // 0e7: ldc2_w -1783898782777368462
      // 0ea: lload 3
      // 0eb: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: aload 0
      // 0f3: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 0f6: iload 15
      // 0f8: aaload
      // 0f9: bipush 0
      // 0fa: anewarray 314
      // 0fd: ldc2_w -119251491129967242
      // 100: lload 3
      // 101: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: ldc2_w -359946733087553094
      // 109: lload 3
      // 10a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: iload 13
      // 111: ifne 1a8
      // 114: goto 121
      // 117: ldc2_w -1783898782777368462
      // 11a: lload 3
      // 11b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: lload 3
      // 122: lconst_0
      // 123: lcmp
      // 124: ifle 19b
      // 127: ifne 15c
      // 12a: goto 137
      // 12d: ldc2_w -1783898782777368462
      // 130: lload 3
      // 131: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: aload 14
      // 139: aload 0
      // 13a: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 13d: iload 15
      // 13f: aaload
      // 140: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 143: goto 150
      // 146: ldc2_w -1783898782777368462
      // 149: lload 3
      // 14a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: pop
      // 151: iload 13
      // 153: lload 3
      // 154: lconst_0
      // 155: lcmp
      // 156: ifle 268
      // 159: ifeq 263
      // 15c: aload 5
      // 15e: aload 0
      // 15f: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 162: iload 15
      // 164: aaload
      // 165: bipush 0
      // 166: anewarray 314
      // 169: ldc2_w -149195725538247938
      // 16c: lload 3
      // 16d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: aload 0
      // 173: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 176: iload 15
      // 178: aaload
      // 179: lload 11
      // 17b: bipush 3
      // 17c: anewarray 314
      // 17f: dup_x2
      // 180: dup_x2
      // 181: pop
      // 182: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 185: bipush 2
      // 186: swap
      // 187: aastore
      // 188: dup_x1
      // 189: swap
      // 18a: bipush 1
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: ldc2_w -1898008871918312355
      // 195: lload 3
      // 196: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: goto 1a8
      // 19e: ldc2_w -1783898782777368462
      // 1a1: lload 3
      // 1a2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: istore 16
      // 1aa: aload 5
      // 1ac: aload 0
      // 1ad: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 1b0: iload 15
      // 1b2: aaload
      // 1b3: bipush 0
      // 1b4: anewarray 314
      // 1b7: ldc2_w -119251491129967242
      // 1ba: lload 3
      // 1bb: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: aload 0
      // 1c1: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 1c4: iload 15
      // 1c6: aaload
      // 1c7: lload 11
      // 1c9: bipush 3
      // 1ca: anewarray 314
      // 1cd: dup_x2
      // 1ce: dup_x2
      // 1cf: pop
      // 1d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d3: bipush 2
      // 1d4: swap
      // 1d5: aastore
      // 1d6: dup_x1
      // 1d7: swap
      // 1d8: bipush 1
      // 1d9: swap
      // 1da: aastore
      // 1db: dup_x1
      // 1dc: swap
      // 1dd: bipush 0
      // 1de: swap
      // 1df: aastore
      // 1e0: ldc2_w -1898008871918312355
      // 1e3: lload 3
      // 1e4: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: istore 16
      // 1eb: aload 0
      // 1ec: aload 0
      // 1ed: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 1f0: iload 15
      // 1f2: aaload
      // 1f3: bipush 0
      // 1f4: anewarray 314
      // 1f7: ldc2_w -149195725538247938
      // 1fa: lload 3
      // 1fb: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: lload 9
      // 202: dup2_x1
      // 203: pop2
      // 204: aload 5
      // 206: bipush 3
      // 207: anewarray 314
      // 20a: dup_x1
      // 20b: swap
      // 20c: bipush 2
      // 20d: swap
      // 20e: aastore
      // 20f: dup_x1
      // 210: swap
      // 211: bipush 1
      // 212: swap
      // 213: aastore
      // 214: dup_x2
      // 215: dup_x2
      // 216: pop
      // 217: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 21a: bipush 0
      // 21b: swap
      // 21c: aastore
      // 21d: ldc2_w -462281523880976321
      // 220: lload 3
      // 221: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 226: pop
      // 227: aload 0
      // 228: aload 0
      // 229: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 22c: iload 15
      // 22e: aaload
      // 22f: bipush 0
      // 230: anewarray 314
      // 233: ldc2_w -119251491129967242
      // 236: lload 3
      // 237: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: lload 9
      // 23e: dup2_x1
      // 23f: pop2
      // 240: aload 5
      // 242: bipush 3
      // 243: anewarray 314
      // 246: dup_x1
      // 247: swap
      // 248: bipush 2
      // 249: swap
      // 24a: aastore
      // 24b: dup_x1
      // 24c: swap
      // 24d: bipush 1
      // 24e: swap
      // 24f: aastore
      // 250: dup_x2
      // 251: dup_x2
      // 252: pop
      // 253: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 256: bipush 0
      // 257: swap
      // 258: aastore
      // 259: ldc2_w -462281523880976321
      // 25c: lload 3
      // 25d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: pop
      // 263: iinc 15 1
      // 266: iload 13
      // 268: ifeq 096
      // 26b: aload 14
      // 26d: lload 3
      // 26e: lconst_0
      // 26f: lcmp
      // 270: ifle 298
      // 273: invokevirtual java/util/ArrayList.size ()I
      // 276: iload 13
      // 278: lload 3
      // 279: lconst_0
      // 27a: lcmp
      // 27b: iflt 286
      // 27e: ifne 2a8
      // 281: aload 0
      // 282: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 285: arraylength
      // 286: if_icmpge 2dc
      // 289: goto 296
      // 28c: ldc2_w -1783898782777368462
      // 28f: lload 3
      // 290: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: athrow
      // 296: aload 14
      // 298: invokevirtual java/util/ArrayList.size ()I
      // 29b: goto 2a8
      // 29e: ldc2_w -1783898782777368462
      // 2a1: lload 3
      // 2a2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a7: athrow
      // 2a8: anewarray 516
      // 2ab: astore 15
      // 2ad: aload 0
      // 2ae: aload 14
      // 2b0: aload 15
      // 2b2: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 2b5: checkcast [Lcom/zelix/ik;
      // 2b8: putfield com/zelix/h1.w [Lcom/zelix/ik;
      // 2bb: aload 0
      // 2bc: aload 0
      // 2bd: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 2c0: arraylength
      // 2c1: putfield com/zelix/h1.m I
      // 2c4: aload 0
      // 2c5: aload 0
      // 2c6: getfield com/zelix/h1.m I
      // 2c9: sipush 11638
      // 2cc: ldc2_w 1112855735736860354
      // 2cf: lload 3
      // 2d0: lxor
      // 2d1: invokedynamic e (IJ)I bsm=com/zelix/h1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: imul
      // 2d7: bipush 2
      // 2d8: iadd
      // 2d9: putfield com/zelix/h1.C I
      // 2dc: aload 0
      // 2dd: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 2e0: astore 15
      // 2e2: aload 15
      // 2e4: arraylength
      // 2e5: istore 16
      // 2e7: bipush 0
      // 2e8: istore 17
      // 2ea: iload 17
      // 2ec: iload 16
      // 2ee: if_icmpge 3aa
      // 2f1: aload 15
      // 2f3: iload 17
      // 2f5: aaload
      // 2f6: astore 18
      // 2f8: aload 18
      // 2fa: bipush 0
      // 2fb: anewarray 314
      // 2fe: ldc2_w -149195725538247938
      // 301: lload 3
      // 302: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: lload 6
      // 309: bipush 2
      // 30a: iload 8
      // 30c: i2c
      // 30d: invokevirtual com/zelix/_op.o (JIC)Z
      // 310: lload 3
      // 311: lconst_0
      // 312: lcmp
      // 313: iflt 377
      // 316: iload 13
      // 318: ifne 377
      // 31b: ifne 34d
      // 31e: goto 32b
      // 321: ldc2_w -1783898782777368462
      // 324: lload 3
      // 325: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: athrow
      // 32b: aload 18
      // 32d: bipush 0
      // 32e: anewarray 314
      // 331: ldc2_w -149195725538247938
      // 334: lload 3
      // 335: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: getstatic com/zelix/wd.e Lcom/zelix/wd;
      // 33d: invokevirtual com/zelix/_op.k (Lcom/zelix/wd;)V
      // 340: goto 34d
      // 343: ldc2_w -1783898782777368462
      // 346: lload 3
      // 347: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: athrow
      // 34d: aload 18
      // 34f: bipush 0
      // 350: anewarray 314
      // 353: ldc2_w -119251491129967242
      // 356: lload 3
      // 357: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: iload 13
      // 35e: ifne 39c
      // 361: lload 6
      // 363: bipush 2
      // 364: iload 8
      // 366: i2c
      // 367: invokevirtual com/zelix/_op.o (JIC)Z
      // 36a: goto 377
      // 36d: ldc2_w -1783898782777368462
      // 370: lload 3
      // 371: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 376: athrow
      // 377: lload 3
      // 378: lconst_0
      // 379: lcmp
      // 37a: ifle 3a7
      // 37d: ifne 3a2
      // 380: aload 18
      // 382: bipush 0
      // 383: anewarray 314
      // 386: ldc2_w -119251491129967242
      // 389: lload 3
      // 38a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_op; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: goto 39c
      // 392: ldc2_w -1783898782777368462
      // 395: lload 3
      // 396: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: athrow
      // 39c: getstatic com/zelix/wd.e Lcom/zelix/wd;
      // 39f: invokevirtual com/zelix/_op.k (Lcom/zelix/wd;)V
      // 3a2: iinc 17 1
      // 3a5: iload 13
      // 3a7: ifeq 2ea
      // 3aa: return
   }

   private boolean a(Object[] param1) {
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
      // 0e: checkcast com/zelix/_op
      // 11: astore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/w
      // 19: astore 2
      // 1a: pop
      // 1b: getstatic com/zelix/h1.a J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 53587369597280
      // 26: lxor
      // 27: lstore 6
      // 29: dup2
      // 2a: ldc2_w 70105276597856
      // 2d: lxor
      // 2e: lstore 8
      // 30: pop2
      // 31: ldc2_w -155717038134800964
      // 34: lload 3
      // 35: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: istore 10
      // 3c: aload 0
      // 3d: getfield com/zelix/h1.H Z
      // 40: iload 10
      // 42: ifeq 56
      // 45: ifne 57
      // 48: goto 55
      // 4b: ldc2_w -161275248846128497
      // 4e: lload 3
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
      // 57: aload 2
      // 58: lload 6
      // 5a: aload 5
      // 5c: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 5f: astore 11
      // 61: iload 10
      // 63: ifeq f8
      // 66: aload 11
      // 68: ifnull d0
      // 6b: goto 78
      // 6e: ldc2_w -161275248846128497
      // 71: lload 3
      // 72: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: aload 11
      // 7a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 7f: astore 12
      // 81: aload 12
      // 83: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 88: ifeq d0
      // 8b: aload 12
      // 8d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 92: checkcast com/zelix/yk
      // 95: astore 13
      // 97: aload 13
      // 99: instanceof com/zelix/ik
      // 9c: iload 10
      // 9e: lload 3
      // 9f: lconst_0
      // a0: lcmp
      // a1: iflt a9
      // a4: ifeq f9
      // a7: iload 10
      // a9: ifeq ca
      // ac: goto b9
      // af: ldc2_w -161275248846128497
      // b2: lload 3
      // b3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: athrow
      // b9: ifeq cb
      // bc: goto c9
      // bf: ldc2_w -161275248846128497
      // c2: lload 3
      // c3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: athrow
      // c9: bipush 0
      // ca: ireturn
      // cb: iload 10
      // cd: ifne 81
      // d0: aload 5
      // d2: ldc2_w -133005950148130371
      // d5: lload 3
      // d6: invokedynamic n (JJ)Lcom/zelix/d2; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // db: lload 8
      // dd: bipush 2
      // de: anewarray 314
      // e1: dup_x2
      // e2: dup_x2
      // e3: pop
      // e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // e7: bipush 1
      // e8: swap
      // e9: aastore
      // ea: dup_x1
      // eb: swap
      // ec: bipush 0
      // ed: swap
      // ee: aastore
      // ef: ldc2_w -256378553905446311
      // f2: lload 3
      // f3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f8: bipush 1
      // f9: ireturn
   }

   final void v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      int var4 = (int)((var2 ^ 42521919573764L) >>> 32);
      int var5 = (int)((var2 ^ 42521919573764L) << 32 >>> 32);
      boolean var6 = x44.a<"q">(997534453458090387L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = this.H;
            if (var6) {
               break label28;
            }

            if (!this.H) {
               return;
            }
         } catch (gj var8) {
            throw x44.a<"q">(var8, 1203966403276527609L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < this.w.length) {
         ik var10 = this.w[var7];
         Object[] var10004 = new Object[]{null, var5};
         var10004[0] = var4;
         x44.a<"i">(var10, var10004, 963103080645905906L, var2);
         var7++;
         if (var6) {
            break;
         }
      }
   }

   h1(h8 param1, long param2, int param4, String param5, _xx param6, te param7, _y4 param8, PrintWriter param9, _y4 param10, String param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/h1.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 37362615620844
      // 00b: lxor
      // 00c: lstore 12
      // 00e: dup2
      // 00f: ldc2_w 122865313640537
      // 012: lxor
      // 013: lstore 14
      // 015: dup2
      // 016: ldc2_w 81589178199027
      // 019: lxor
      // 01a: lstore 16
      // 01c: dup2
      // 01d: ldc2_w 1482217395354
      // 020: lxor
      // 021: lstore 18
      // 023: pop2
      // 024: ldc2_w -3365700320417749746
      // 027: lload 2
      // 028: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: aload 0
      // 02e: aload 1
      // 02f: iload 4
      // 031: aload 5
      // 033: lload 14
      // 035: aload 6
      // 037: aload 8
      // 039: invokespecial com/zelix/h4.<init> (Lcom/zelix/h8;ILjava/lang/String;JLcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 03c: istore 20
      // 03e: aload 0
      // 03f: bipush 1
      // 040: putfield com/zelix/h1.H Z
      // 043: aload 0
      // 044: aload 7
      // 046: putfield com/zelix/h1.R Lcom/zelix/te;
      // 049: aload 0
      // 04a: getfield com/zelix/h1.C I
      // 04d: newarray 8
      // 04f: astore 21
      // 051: aload 6
      // 053: aload 21
      // 055: invokevirtual com/zelix/_xx.read ([B)I
      // 058: pop
      // 059: aload 21
      // 05b: lload 18
      // 05d: bipush 0
      // 05e: bipush 3
      // 05f: anewarray 314
      // 062: dup_x1
      // 063: swap
      // 064: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 067: bipush 2
      // 068: swap
      // 069: aastore
      // 06a: dup_x2
      // 06b: dup_x2
      // 06c: pop
      // 06d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 070: bipush 1
      // 071: swap
      // 072: aastore
      // 073: dup_x1
      // 074: swap
      // 075: bipush 0
      // 076: swap
      // 077: aastore
      // 078: ldc2_w -3957437667345252761
      // 07b: lload 2
      // 07c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/_xx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: astore 22
      // 083: aload 0
      // 084: iload 20
      // 086: ifne 351
      // 089: getfield com/zelix/h1.C I
      // 08c: bipush 2
      // 08d: if_icmplt 2ea
      // 090: goto 09d
      // 093: ldc2_w -3735722454966039708
      // 096: lload 2
      // 097: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 0
      // 09e: aload 22
      // 0a0: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 0a3: putfield com/zelix/h1.m I
      // 0a6: aload 0
      // 0a7: lload 2
      // 0a8: lconst_0
      // 0a9: lcmp
      // 0aa: ifle 2d4
      // 0ad: iload 20
      // 0af: ifne 2d4
      // 0b2: goto 0bf
      // 0b5: ldc2_w -3735722454966039708
      // 0b8: lload 2
      // 0b9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: getfield com/zelix/h1.m I
      // 0c2: sipush 11638
      // 0c5: ldc2_w 1112940922202019284
      // 0c8: lload 2
      // 0c9: lxor
      // 0ca: invokedynamic e (IJ)I bsm=com/zelix/h1.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: imul
      // 0d0: bipush 2
      // 0d1: iadd
      // 0d2: aload 0
      // 0d3: getfield com/zelix/h1.C I
      // 0d6: if_icmpne 256
      // 0d9: goto 0e6
      // 0dc: ldc2_w -3735722454966039708
      // 0df: lload 2
      // 0e0: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: aload 0
      // 0e8: getfield com/zelix/h1.m I
      // 0eb: anewarray 516
      // 0ee: putfield com/zelix/h1.w [Lcom/zelix/ik;
      // 0f1: bipush 0
      // 0f2: istore 23
      // 0f4: iload 23
      // 0f6: aload 0
      // 0f7: getfield com/zelix/h1.m I
      // 0fa: if_icmpge 245
      // 0fd: aload 0
      // 0fe: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 101: iload 23
      // 103: aload 0
      // 104: aload 22
      // 106: aload 0
      // 107: ldc2_w -3556974422021759796
      // 10a: lload 2
      // 10b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/te; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: aload 8
      // 112: aload 10
      // 114: lload 12
      // 116: bipush 5
      // 117: anewarray 314
      // 11a: dup_x2
      // 11b: dup_x2
      // 11c: pop
      // 11d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 120: bipush 4
      // 121: swap
      // 122: aastore
      // 123: dup_x1
      // 124: swap
      // 125: bipush 3
      // 126: swap
      // 127: aastore
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 2
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x1
      // 12e: swap
      // 12f: bipush 1
      // 130: swap
      // 131: aastore
      // 132: dup_x1
      // 133: swap
      // 134: bipush 0
      // 135: swap
      // 136: aastore
      // 137: ldc2_w -3463316602545181127
      // 13a: lload 2
      // 13b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ik; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: aastore
      // 141: iload 20
      // 143: lload 2
      // 144: lconst_0
      // 145: lcmp
      // 146: ifle 14e
      // 149: ifne 367
      // 14c: iload 20
      // 14e: lload 2
      // 14f: lconst_0
      // 150: lcmp
      // 151: ifle 242
      // 154: ifne 240
      // 157: goto 164
      // 15a: ldc2_w -3735722454966039708
      // 15d: lload 2
      // 15e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: lload 2
      // 165: lconst_0
      // 166: lcmp
      // 167: iflt 233
      // 16a: aload 0
      // 16b: getfield com/zelix/h1.H Z
      // 16e: ifeq 230
      // 171: goto 17e
      // 174: ldc2_w -3735722454966039708
      // 177: lload 2
      // 178: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: aload 0
      // 17f: lload 2
      // 180: lconst_0
      // 181: lcmp
      // 182: iflt 21a
      // 185: iload 20
      // 187: ifne 21a
      // 18a: goto 197
      // 18d: ldc2_w -3735722454966039708
      // 190: lload 2
      // 191: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 19a: iload 23
      // 19c: aaload
      // 19d: bipush 0
      // 19e: anewarray 314
      // 1a1: ldc2_w -3408841197363385689
      // 1a4: lload 2
      // 1a5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: ifne 230
      // 1ad: goto 1ba
      // 1b0: ldc2_w -3735722454966039708
      // 1b3: lload 2
      // 1b4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: athrow
      // 1ba: aload 0
      // 1bb: bipush 0
      // 1bc: putfield com/zelix/h1.H Z
      // 1bf: aload 9
      // 1c1: new java/lang/StringBuilder
      // 1c4: dup
      // 1c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c8: sipush 19357
      // 1cb: ldc2_w 3100593079814941135
      // 1ce: lload 2
      // 1cf: lxor
      // 1d0: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1d8: aload 0
      // 1d9: lload 16
      // 1db: invokevirtual com/zelix/h1.j (J)Ljava/lang/String;
      // 1de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1e1: sipush 17248
      // 1e4: ldc2_w 3859915701276729651
      // 1e7: lload 2
      // 1e8: lxor
      // 1e9: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: aload 11
      // 1f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f6: sipush 25466
      // 1f9: ldc2_w 1086228604066185519
      // 1fc: lload 2
      // 1fd: lxor
      // 1fe: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 206: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 209: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 20c: aload 0
      // 20d: goto 21a
      // 210: ldc2_w -3735722454966039708
      // 213: lload 2
      // 214: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: athrow
      // 21a: aload 21
      // 21c: ldc2_w -3725001504429757530
      // 21f: lload 2
      // 220: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: iload 20
      // 227: lload 2
      // 228: lconst_0
      // 229: lcmp
      // 22a: ifle 253
      // 22d: ifeq 245
      // 230: iinc 23 1
      // 233: goto 240
      // 236: ldc2_w -3735722454966039708
      // 239: lload 2
      // 23a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: iload 20
      // 242: ifeq 0f4
      // 245: lload 2
      // 246: lconst_0
      // 247: lcmp
      // 248: iflt 367
      // 24b: iload 20
      // 24d: lload 2
      // 24e: lconst_0
      // 24f: lcmp
      // 250: ifle 143
      // 253: ifeq 35c
      // 256: aload 0
      // 257: bipush 0
      // 258: putfield com/zelix/h1.H Z
      // 25b: aload 9
      // 25d: new java/lang/StringBuilder
      // 260: dup
      // 261: invokespecial java/lang/StringBuilder.<init> ()V
      // 264: sipush 31892
      // 267: ldc2_w 5940559560083005124
      // 26a: lload 2
      // 26b: lxor
      // 26c: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 274: aload 0
      // 275: lload 16
      // 277: invokevirtual com/zelix/h1.j (J)Ljava/lang/String;
      // 27a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 27d: sipush 21662
      // 280: ldc2_w 5747652927406896847
      // 283: lload 2
      // 284: lxor
      // 285: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28d: aload 11
      // 28f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 292: sipush 19473
      // 295: ldc2_w 405089181672042053
      // 298: lload 2
      // 299: lxor
      // 29a: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a2: aload 0
      // 2a3: getfield com/zelix/h1.m I
      // 2a6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2a9: sipush 10542
      // 2ac: ldc2_w 482144167538232184
      // 2af: lload 2
      // 2b0: lxor
      // 2b1: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b9: aload 0
      // 2ba: getfield com/zelix/h1.C I
      // 2bd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c3: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 2c6: aload 0
      // 2c7: goto 2d4
      // 2ca: ldc2_w -3735722454966039708
      // 2cd: lload 2
      // 2ce: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d3: athrow
      // 2d4: aload 21
      // 2d6: ldc2_w -3725001504429757530
      // 2d9: lload 2
      // 2da: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: lload 2
      // 2e0: lconst_0
      // 2e1: lcmp
      // 2e2: iflt 367
      // 2e5: iload 20
      // 2e7: ifeq 35c
      // 2ea: aload 0
      // 2eb: bipush 0
      // 2ec: putfield com/zelix/h1.H Z
      // 2ef: aload 9
      // 2f1: new java/lang/StringBuilder
      // 2f4: dup
      // 2f5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f8: sipush 31892
      // 2fb: ldc2_w 5940559560083005124
      // 2fe: lload 2
      // 2ff: lxor
      // 300: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 308: aload 0
      // 309: lload 16
      // 30b: invokevirtual com/zelix/h1.j (J)Ljava/lang/String;
      // 30e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 311: sipush 21662
      // 314: ldc2_w 5747652927406896847
      // 317: lload 2
      // 318: lxor
      // 319: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 321: aload 11
      // 323: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 326: sipush 17688
      // 329: ldc2_w 7138299327804434255
      // 32c: lload 2
      // 32d: lxor
      // 32e: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/h1.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 336: aload 0
      // 337: getfield com/zelix/h1.C I
      // 33a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 33d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 340: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 343: aload 0
      // 344: goto 351
      // 347: ldc2_w -3735722454966039708
      // 34a: lload 2
      // 34b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: athrow
      // 351: aload 21
      // 353: ldc2_w -3725001504429757530
      // 356: lload 2
      // 357: invokedynamic w (Ljava/lang/Object;[BJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35c: aload 22
      // 35e: ldc2_w -3905622029958093287
      // 361: lload 2
      // 362: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: goto 37a
      // 36a: astore 24
      // 36c: aload 22
      // 36e: ldc2_w -3905622029958093287
      // 371: lload 2
      // 372: invokedynamic l (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 377: aload 24
      // 379: athrow
      // 37a: return
   }

   Map S(Object[] param1) {
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
      // 00c: getstatic com/zelix/h1.a J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 18165957721512
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 28936387833209
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 101679939642594
      // 025: lxor
      // 026: lstore 8
      // 028: dup2
      // 029: ldc2_w 8368396892937
      // 02c: lxor
      // 02d: dup2
      // 02e: bipush 48
      // 030: lushr
      // 031: l2i
      // 032: istore 10
      // 034: dup2
      // 035: bipush 16
      // 037: lshl
      // 038: bipush 48
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 11
      // 03e: dup2
      // 03f: bipush 32
      // 041: lshl
      // 042: bipush 32
      // 044: lushr
      // 045: l2i
      // 046: istore 12
      // 048: pop2
      // 049: pop2
      // 04a: ldc2_w -3743908510055663538
      // 04d: lload 2
      // 04e: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: istore 13
      // 055: aload 0
      // 056: getfield com/zelix/h1.H Z
      // 059: ifne 068
      // 05c: aconst_null
      // 05d: areturn
      // 05e: ldc2_w -3357334190016588252
      // 061: lload 2
      // 062: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: new java/util/ArrayList
      // 06b: dup
      // 06c: aload 0
      // 06d: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 070: arraylength
      // 071: invokespecial java/util/ArrayList.<init> (I)V
      // 074: astore 14
      // 076: aload 0
      // 077: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 07a: arraylength
      // 07b: lload 8
      // 07d: invokestatic com/zelix/sh.Q (IJ)I
      // 080: lload 6
      // 082: bipush 2
      // 083: anewarray 314
      // 086: dup_x2
      // 087: dup_x2
      // 088: pop
      // 089: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08c: bipush 1
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x1
      // 090: swap
      // 091: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 094: bipush 0
      // 095: swap
      // 096: aastore
      // 097: ldc2_w -3208097338002910007
      // 09a: lload 2
      // 09b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: astore 15
      // 0a2: aload 0
      // 0a3: getfield com/zelix/h1.w [Lcom/zelix/ik;
      // 0a6: astore 16
      // 0a8: aload 16
      // 0aa: arraylength
      // 0ab: istore 17
      // 0ad: bipush 0
      // 0ae: istore 18
      // 0b0: iload 18
      // 0b2: iload 17
      // 0b4: if_icmpge 15a
      // 0b7: aload 16
      // 0b9: iload 18
      // 0bb: aaload
      // 0bc: astore 19
      // 0be: iload 13
      // 0c0: lload 2
      // 0c1: lconst_0
      // 0c2: lcmp
      // 0c3: iflt 157
      // 0c6: ifne 155
      // 0c9: aload 19
      // 0cb: bipush 0
      // 0cc: anewarray 314
      // 0cf: ldc2_w -3607090203409958937
      // 0d2: lload 2
      // 0d3: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: iload 13
      // 0da: ifne 160
      // 0dd: goto 0ea
      // 0e0: ldc2_w -3357334190016588252
      // 0e3: lload 2
      // 0e4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: ifeq 152
      // 0ed: goto 0fa
      // 0f0: ldc2_w -3357334190016588252
      // 0f3: lload 2
      // 0f4: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: athrow
      // 0fa: aload 14
      // 0fc: new com/zelix/eb
      // 0ff: dup
      // 100: aload 19
      // 102: bipush 0
      // 103: anewarray 314
      // 106: ldc2_w -3750045429780053564
      // 109: lload 2
      // 10a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: aload 19
      // 111: iload 10
      // 113: i2s
      // 114: iload 11
      // 116: i2c
      // 117: iload 12
      // 119: bipush 3
      // 11a: anewarray 314
      // 11d: dup_x1
      // 11e: swap
      // 11f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 122: bipush 2
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 12a: bipush 1
      // 12b: swap
      // 12c: aastore
      // 12d: dup_x1
      // 12e: swap
      // 12f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 132: bipush 0
      // 133: swap
      // 134: aastore
      // 135: ldc2_w -3404756644311893164
      // 138: lload 2
      // 139: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: invokespecial com/zelix/eb.<init> (ILjava/lang/Object;)V
      // 141: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 144: pop
      // 145: goto 152
      // 148: ldc2_w -3357334190016588252
      // 14b: lload 2
      // 14c: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: athrow
      // 152: iinc 18 1
      // 155: iload 13
      // 157: ifeq 0b0
      // 15a: aload 14
      // 15c: invokestatic java/util/Collections.sort (Ljava/util/List;)V
      // 15f: bipush -1
      // 160: istore 16
      // 162: aload 14
      // 164: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 167: astore 17
      // 169: aload 17
      // 16b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 170: ifeq 1cf
      // 173: aload 17
      // 175: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 17a: checkcast com/zelix/eb
      // 17d: astore 18
      // 17f: aload 18
      // 181: lload 2
      // 182: lconst_0
      // 183: lcmp
      // 184: iflt 1c9
      // 187: invokevirtual com/zelix/eb.z ()I
      // 18a: iload 13
      // 18c: ifne 1b3
      // 18f: iload 16
      // 191: if_icmple 1ca
      // 194: goto 1a1
      // 197: ldc2_w -3357334190016588252
      // 19a: lload 2
      // 19b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: athrow
      // 1a1: aload 18
      // 1a3: invokevirtual com/zelix/eb.z ()I
      // 1a6: goto 1b3
      // 1a9: ldc2_w -3357334190016588252
      // 1ac: lload 2
      // 1ad: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: istore 16
      // 1b5: aload 15
      // 1b7: getstatic com/zelix/h1.z Lcom/zelix/_uo;
      // 1ba: iload 16
      // 1bc: lload 4
      // 1be: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 1c1: aload 18
      // 1c3: invokevirtual com/zelix/eb.V ()Ljava/lang/Object;
      // 1c6: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 1c9: pop
      // 1ca: iload 13
      // 1cc: ifeq 169
      // 1cf: aload 15
      // 1d1: lload 2
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: ifle 17a
      // 1d7: areturn
   }

   static {
      long var11 = a ^ 26146983556449L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "H\u001d\u0094^©v\u0003ÀIÀy¥pÊ\n\u007f\u0010)×®\u008e«¡Ëð\u0015?È\u0005SâN×\u0010f\u0003JÑÿ\u001eïc'\u0007ß\u001duz¨L\u0010+Ì\"h\u000eÞïÂºoYY%\u0001\u008aø\u0018øNÂ% \u0081ãî¯\u0088Ì\u0091;ÆzF\u001dG\u0099ëx¾Ä\"\u0018]\u0086\u0011;\u0015\u000fSX²A,r×o\u0001ÿz\u0089\u00193\u0096ÜnT";
      int var19 = "H\u001d\u0094^©v\u0003ÀIÀy¥pÊ\n\u007f\u0010)×®\u008e«¡Ëð\u0015?È\u0005SâN×\u0010f\u0003JÑÿ\u001eïc'\u0007ß\u001duz¨L\u0010+Ì\"h\u000eÞïÂºoYY%\u0001\u008aø\u0018øNÂ% \u0081ãî¯\u0088Ì\u0091;ÆzF\u001dG\u0099ëx¾Ä\"\u0018]\u0086\u0011;\u0015\u000fSX²A,r×o\u0001ÿz\u0089\u00193\u0096ÜnT"
         .length();
      char var16 = 16;
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
                     d = var20;
                     e = new String[8];
                     j = new HashMap(13);
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
                     String var4 = "\u00850¾ýÝ\u0010\u0014a\u0000d\u001fº\u000föâG";
                     int var5 = "\u00850¾ýÝ\u0010\u0014a\u0000d\u001fº\u000föâG".length();
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

                     h = var6;
                     i = new Integer[2];
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

                  var17 = "]u\u0087\fË\f\u0014UYY\u001fßKu\u0014(\u0012\u009b\u001eÍ÷OÚ\u008e\u0010¨,Ü_\rD1\u009díLÿ¾B\fU\u009e";
                  var19 = "]u\u0087\fË\f\u0014UYY\u001fßKu\u0014(\u0012\u009b\u001eÍ÷OÚ\u008e\u0010¨,Ü_\rD1\u009díLÿ¾B\fU\u009e".length();
                  var16 = 24;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25293;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/h1", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/h1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14396;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/h1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("com/zelix/h1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
