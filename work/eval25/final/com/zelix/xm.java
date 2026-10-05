package com.zelix;

import java.io.DataOutputStream;
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

public abstract class xm extends xt implements _f4, _u0 {
   mn c;
   bc T;
   int m;
   private static final long b = ess.a(8252986592878000825L, -2529287209077969404L, MethodHandles.lookup().lookupClass()).a(116241670459715L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] l;
   private static final Integer[] n;
   private static final Map p;

   boolean p(Object[] param1) {
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
      // 0e: checkcast com/zelix/bc
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/xm.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -7281040323755245803
      // 1d: lload 2
      // 1e: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: bipush 0
      // 24: istore 6
      // 26: astore 5
      // 28: aload 0
      // 29: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 2c: aload 5
      // 2e: ifnonnull 6a
      // 31: ifnull 6f
      // 34: goto 41
      // 37: ldc2_w -7376079528311224649
      // 3a: lload 2
      // 3b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: lload 2
      // 42: lconst_0
      // 43: lcmp
      // 44: iflt 78
      // 47: aload 0
      // 48: aload 5
      // 4a: ifnonnull 73
      // 4d: goto 5a
      // 50: ldc2_w -7376079528311224649
      // 53: lload 2
      // 54: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 5d: goto 6a
      // 60: ldc2_w -7376079528311224649
      // 63: lload 2
      // 64: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aload 4
      // 6c: if_acmpeq 72
      // 6f: bipush 1
      // 70: istore 6
      // 72: aload 0
      // 73: aload 4
      // 75: putfield com/zelix/xm.T Lcom/zelix/bc;
      // 78: iload 6
      // 7a: ireturn
   }

   public String N(long param1) {
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
      // 06: lstore 3
      // 07: dup2
      // 08: ldc2_w 20974130729213
      // 0b: lxor
      // 0c: lstore 5
      // 0e: pop2
      // 0f: ldc2_w -4180540208703037414
      // 12: lload 1
      // 13: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: new java/lang/StringBuilder
      // 1b: dup
      // 1c: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f: astore 8
      // 21: astore 7
      // 23: aload 8
      // 25: sipush 25789
      // 28: ldc2_w 4859965676687305114
      // 2b: lload 1
      // 2c: lxor
      // 2d: invokedynamic i (IJ)I bsm=com/zelix/xm.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 35: pop
      // 36: aload 8
      // 38: aload 0
      // 39: ldc2_w -2434635247643257234
      // 3c: lload 1
      // 3d: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: lload 3
      // 43: ldc2_w -4205522033860950947
      // 46: lload 1
      // 47: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: pop
      // 50: aload 8
      // 52: sipush 19222
      // 55: ldc2_w 3568948326630491696
      // 58: lload 1
      // 59: lxor
      // 5a: invokedynamic i (IJ)I bsm=com/zelix/xm.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 62: pop
      // 63: aload 8
      // 65: sipush 4754
      // 68: ldc2_w 3532472391335001165
      // 6b: lload 1
      // 6c: lxor
      // 6d: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 75: aload 7
      // 77: ifnonnull e5
      // 7a: pop
      // 7b: aload 0
      // 7c: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 7f: ifnull c9
      // 82: goto 8f
      // 85: ldc2_w -4130409930434029128
      // 88: lload 1
      // 89: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: aload 8
      // 91: aload 0
      // 92: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 95: lload 5
      // 97: bipush 1
      // 98: anewarray 357
      // 9b: dup_x2
      // 9c: dup_x2
      // 9d: pop
      // 9e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a1: bipush 0
      // a2: swap
      // a3: aastore
      // a4: ldc2_w -2871234253894530915
      // a7: lload 1
      // a8: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b0: lload 1
      // b1: lconst_0
      // b2: lcmp
      // b3: ifle e8
      // b6: pop
      // b7: aload 7
      // b9: ifnull e6
      // bc: goto c9
      // bf: ldc2_w -4130409930434029128
      // c2: lload 1
      // c3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: athrow
      // c9: aload 8
      // cb: aload 0
      // cc: ldc2_w -2810151395495198973
      // cf: lload 1
      // d0: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // d8: goto e5
      // db: ldc2_w -4130409930434029128
      // de: lload 1
      // df: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e4: athrow
      // e5: pop
      // e6: aload 8
      // e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // eb: areturn
   }

   public void V(Object[] param1) {
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
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 7
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 5
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 3
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 6
      // 02a: pop
      // 02b: lload 3
      // 02c: dup2
      // 02d: ldc2_w 38803564984498
      // 030: lxor
      // 031: lstore 8
      // 033: dup2
      // 034: ldc2_w 111764509558413
      // 037: lxor
      // 038: lstore 10
      // 03a: pop2
      // 03b: ldc2_w -8070022608367716896
      // 03e: lload 3
      // 03f: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: astore 12
      // 046: aload 0
      // 047: aload 12
      // 049: ifnonnull 0a4
      // 04c: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 04f: ifnull 0a3
      // 052: goto 05f
      // 055: ldc2_w -7829525643181061054
      // 058: lload 3
      // 059: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 063: aload 2
      // 064: aload 7
      // 066: aload 5
      // 068: aload 6
      // 06a: lload 10
      // 06c: bipush 5
      // 06d: anewarray 357
      // 070: dup_x2
      // 071: dup_x2
      // 072: pop
      // 073: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 076: bipush 4
      // 077: swap
      // 078: aastore
      // 079: dup_x1
      // 07a: swap
      // 07b: bipush 3
      // 07c: swap
      // 07d: aastore
      // 07e: dup_x1
      // 07f: swap
      // 080: bipush 2
      // 081: swap
      // 082: aastore
      // 083: dup_x1
      // 084: swap
      // 085: bipush 1
      // 086: swap
      // 087: aastore
      // 088: dup_x1
      // 089: swap
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w -7530231923282986953
      // 090: lload 3
      // 091: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: goto 0a3
      // 099: ldc2_w -7829525643181061054
      // 09c: lload 3
      // 09d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: ldc2_w -8373236511439699052
      // 0a7: lload 3
      // 0a8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ad: lload 8
      // 0af: bipush 1
      // 0b0: anewarray 357
      // 0b3: dup_x2
      // 0b4: dup_x2
      // 0b5: pop
      // 0b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b9: bipush 0
      // 0ba: swap
      // 0bb: aastore
      // 0bc: ldc2_w -7942789969326198772
      // 0bf: lload 3
      // 0c0: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: astore 13
      // 0c7: aload 0
      // 0c8: ldc2_w -8373236511439699052
      // 0cb: lload 3
      // 0cc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: invokevirtual com/zelix/mn.F ()Ljava/lang/String;
      // 0d4: sipush 20908
      // 0d7: ldc2_w 7210951191413041807
      // 0da: lload 3
      // 0db: lxor
      // 0dc: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e4: aload 12
      // 0e6: ifnonnull 12a
      // 0e9: ifeq 114
      // 0ec: goto 0f9
      // 0ef: ldc2_w -7829525643181061054
      // 0f2: lload 3
      // 0f3: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 2
      // 0fa: aload 13
      // 0fc: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 101: pop
      // 102: aload 12
      // 104: ifnull 12b
      // 107: goto 114
      // 10a: ldc2_w -7829525643181061054
      // 10d: lload 3
      // 10e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: aload 7
      // 116: aload 13
      // 118: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 11d: goto 12a
      // 120: ldc2_w -7829525643181061054
      // 123: lload 3
      // 124: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: pop
      // 12b: return
   }

   public xm(long var1, int var3, mn var4, x4 var5) {
      var1 = b ^ var1;
      long var6 = var1 ^ 102134063397597L;
      super(var3, var5.j);
      x44.a<"s">(this, var4, -3397054452241524605L, var1);
      this.T = x44.a<"h">(var5, new Object[0], -3242527345616820627L, var1);
      x44.a<"s">(this, x44.a<"h">(this.T, new Object[]{var6}, -3243765700232940298L, var1), -2887622182146887186L, var1);
   }

   public bc l(Object[] var1) {
      return this.T;
   }

   protected void T(long param1, DataOutputStream param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 121195092258622
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 10108521966370
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -2672422542230044920
      // 13: lload 1
      // 14: invokedynamic w (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: astore 8
      // 1b: aload 3
      // 1c: aload 0
      // 1d: lload 4
      // 1f: invokevirtual com/zelix/xm.m (J)Lcom/zelix/w5;
      // 22: invokevirtual com/zelix/w5.l ()I
      // 25: aload 8
      // 27: ifnonnull 91
      // 2a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 2d: aload 0
      // 2e: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 31: ifnull 79
      // 34: goto 41
      // 37: ldc2_w -2756256838019266902
      // 3a: lload 1
      // 3b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: aload 3
      // 42: aload 0
      // 43: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 46: lload 6
      // 48: bipush 1
      // 49: anewarray 357
      // 4c: dup_x2
      // 4d: dup_x2
      // 4e: pop
      // 4f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52: bipush 0
      // 53: swap
      // 54: aastore
      // 55: ldc2_w -4394244836819344119
      // 58: lload 1
      // 59: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 61: lload 1
      // 62: lconst_0
      // 63: lcmp
      // 64: iflt a5
      // 67: aload 8
      // 69: ifnull 94
      // 6c: goto 79
      // 6f: ldc2_w -2756256838019266902
      // 72: lload 1
      // 73: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 3
      // 7a: aload 0
      // 7b: ldc2_w -4174186773392023535
      // 7e: lload 1
      // 7f: invokedynamic k (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: goto 91
      // 87: ldc2_w -2756256838019266902
      // 8a: lload 1
      // 8b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 94: aload 3
      // 95: aload 0
      // 96: ldc2_w -4529379690863851140
      // 99: lload 1
      // 9a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: invokevirtual com/zelix/mn.B ()I
      // a2: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // a5: return
   }

   public xm(int var1, int var2, _83 var3, int var4, int var5, mn var6) {
      long var7 = ((long)var2 << 32 | (long)var5 << 32 >>> 32) ^ b;
      super(var1, var3);
      x44.a<"q">(this, var4, 6277750041004749084L, var7);
      x44.a<"q">(this, var6, 5776194671934740593L, var7);
   }

   public String a(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 25476805055556L;
      return x44.a<"i">(x44.a<"m">(this, -8470594630755401174L, var2), var4, -7933393288838934503L, var2);
   }

   public mn a(Object[] var1) {
      mn var2 = (mn)var1[0];
      long var3 = (Long)var1[1];
      mn var5 = x44.a<"h">(this, -6847965907253892945L, var3);
      x44.a<"w">(this, var2, -6847965907253892945L, var3);
      return var5;
   }

   public xl[] z(Object[] param1) {
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
      // 0c: getstatic com/zelix/xm.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -2771257261715506069
      // 15: lload 2
      // 16: invokedynamic t (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: astore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 21: aload 4
      // 23: ifnonnull 47
      // 26: ifnull 57
      // 29: goto 36
      // 2c: ldc2_w -2676001376042564151
      // 2f: lload 2
      // 30: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 3a: goto 47
      // 3d: ldc2_w -2676001376042564151
      // 40: lload 2
      // 41: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: bipush 0
      // 48: anewarray 357
      // 4b: ldc2_w -4079546291572307192
      // 4e: lload 2
      // 4f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: goto 58
      // 57: aconst_null
      // 58: areturn
   }

   public boolean O(long var1, _8l var3, Object var4, Object var5) {
      long var6 = var1 ^ 71707521051293L;
      return var3.H(this, var4, var5, var6);
   }

   public String m(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"l">(this, -9220263534836627373L, var2).M();
   }

   public final mn D(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"h">(this, 529001949391212303L, var2);
   }

   protected void V(DataOutputStream param1, long param2, Map param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: lload 2
      // 001: dup2
      // 002: ldc2_w 67511763313351
      // 005: lxor
      // 006: lstore 5
      // 008: dup2
      // 009: ldc2_w 99431481075419
      // 00c: lxor
      // 00d: lstore 7
      // 00f: pop2
      // 010: ldc2_w 6273785328803656433
      // 013: lload 2
      // 014: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 019: astore 9
      // 01b: aload 1
      // 01c: aload 0
      // 01d: lload 5
      // 01f: invokevirtual com/zelix/xm.m (J)Lcom/zelix/w5;
      // 022: invokevirtual com/zelix/w5.l ()I
      // 025: aload 9
      // 027: ifnonnull 091
      // 02a: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 02d: aload 0
      // 02e: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 031: ifnull 079
      // 034: goto 041
      // 037: ldc2_w 6072713072761981779
      // 03a: lload 2
      // 03b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: athrow
      // 041: aload 1
      // 042: aload 0
      // 043: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 046: lload 7
      // 048: bipush 1
      // 049: anewarray 357
      // 04c: dup_x2
      // 04d: dup_x2
      // 04e: pop
      // 04f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 052: bipush 0
      // 053: swap
      // 054: aastore
      // 055: ldc2_w 5691937249320397040
      // 058: lload 2
      // 059: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 061: aload 9
      // 063: lload 2
      // 064: lconst_0
      // 065: lcmp
      // 066: iflt 0a5
      // 069: ifnull 094
      // 06c: goto 079
      // 06f: ldc2_w 6072713072761981779
      // 072: lload 2
      // 073: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 1
      // 07a: aload 0
      // 07b: ldc2_w 5470497379353505256
      // 07e: lload 2
      // 07f: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: goto 091
      // 087: ldc2_w 6072713072761981779
      // 08a: lload 2
      // 08b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: athrow
      // 091: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 094: aload 4
      // 096: aload 0
      // 097: ldc2_w 5538647387061781637
      // 09a: lload 2
      // 09b: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a5: checkcast com/zelix/mn
      // 0a8: checkcast com/zelix/mn
      // 0ab: astore 10
      // 0ad: aload 9
      // 0af: lload 2
      // 0b0: lconst_0
      // 0b1: lcmp
      // 0b2: ifle 0e8
      // 0b5: ifnonnull 0e0
      // 0b8: aload 10
      // 0ba: ifnull 0eb
      // 0bd: goto 0ca
      // 0c0: ldc2_w 6072713072761981779
      // 0c3: lload 2
      // 0c4: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 1
      // 0cb: aload 10
      // 0cd: invokevirtual com/zelix/mn.B ()I
      // 0d0: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0d3: goto 0e0
      // 0d6: ldc2_w 6072713072761981779
      // 0d9: lload 2
      // 0da: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: lload 2
      // 0e1: lconst_0
      // 0e2: lcmp
      // 0e3: ifle 0fc
      // 0e6: aload 9
      // 0e8: ifnull 109
      // 0eb: aload 1
      // 0ec: aload 0
      // 0ed: ldc2_w 5538647387061781637
      // 0f0: lload 2
      // 0f1: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: invokevirtual com/zelix/mn.B ()I
      // 0f9: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0fc: goto 109
      // 0ff: ldc2_w 6072713072761981779
      // 102: lload 2
      // 103: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: return
   }

   public xm(int var1, long var2, _83 var4, mn var5, bc var6) {
      var2 = b ^ var2;
      long var7 = var2 ^ 10419967127658L;
      super(var1, var4);
      x44.a<"t">(this, var5, -2707673411737546188L, var2);
      this.T = var6;
      x44.a<"t">(this, x44.a<"o">(var6, new Object[]{var7}, -2860768925385884095L, var2), -2496595678059709607L, var2);
   }

   public x_ r(Object[] param1) {
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
      // 0c: getstatic com/zelix/xm.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 22922550860875
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -6139623798976098518
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 2a: aload 6
      // 2c: ifnonnull 50
      // 2f: ifnull 6b
      // 32: goto 3f
      // 35: ldc2_w -6224600899247819128
      // 38: lload 2
      // 39: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 43: goto 50
      // 46: ldc2_w -6224600899247819128
      // 49: lload 2
      // 4a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: lload 4
      // 52: bipush 1
      // 53: anewarray 357
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w -5576812624585370754
      // 62: lload 2
      // 63: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x_; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: goto 6c
      // 6b: aconst_null
      // 6c: areturn
   }

   public int A(Object[] param1) {
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
      // 0c: getstatic com/zelix/xm.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -7253921152053870923
      // 15: lload 2
      // 16: invokedynamic r (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aload 0
      // 1c: ldc2_w -9180260368487659327
      // 1f: lload 2
      // 20: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: invokevirtual com/zelix/mn.M ()Ljava/lang/String;
      // 28: invokestatic com/zelix/xl.u (Ljava/lang/String;)Ljava/lang/String;
      // 2b: astore 5
      // 2d: astore 4
      // 2f: aload 5
      // 31: ldc "V"
      // 33: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 36: aload 4
      // 38: ifnonnull 58
      // 3b: ifeq 57
      // 3e: goto 4b
      // 41: ldc2_w -7493268517167462633
      // 44: lload 2
      // 45: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
      // 4d: ldc2_w -7493268517167462633
      // 50: lload 2
      // 51: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: athrow
      // 57: bipush 1
      // 58: ireturn
   }

   public String q(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      long var4 = var2 ^ 12769350263403L;
      return T(var4, x44.a<"m">(this, 2004726023996298122L, var2));
   }

   int h(Object[] param1) {
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
      // 0c: getstatic com/zelix/xm.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 15055350340172
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -6086718956289995162
      // 1e: lload 2
      // 1f: invokedynamic q (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: aload 6
      // 29: ifnonnull 67
      // 2c: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 2f: ifnull 66
      // 32: goto 3f
      // 35: ldc2_w -6282016243347245116
      // 38: lload 2
      // 39: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 43: lload 4
      // 45: bipush 1
      // 46: anewarray 357
      // 49: dup_x2
      // 4a: dup_x2
      // 4b: pop
      // 4c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f: bipush 0
      // 50: swap
      // 51: aastore
      // 52: ldc2_w -5590509638306327449
      // 55: lload 2
      // 56: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: ireturn
      // 5c: ldc2_w -6282016243347245116
      // 5f: lload 2
      // 60: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 0
      // 67: ldc2_w -5225218187774733953
      // 6a: lload 2
      // 6b: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: ireturn
   }

   public void H(Object[] param1) {
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
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Set
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/Set
      // 021: astore 7
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 6
      // 02b: pop
      // 02c: lload 2
      // 02d: dup2
      // 02e: ldc2_w 42063589230259
      // 031: lxor
      // 032: dup2
      // 033: bipush 32
      // 035: lushr
      // 036: l2i
      // 037: istore 8
      // 039: dup2
      // 03a: bipush 32
      // 03c: lshl
      // 03d: bipush 48
      // 03f: lushr
      // 040: l2i
      // 041: istore 9
      // 043: dup2
      // 044: bipush 48
      // 046: lshl
      // 047: bipush 48
      // 049: lushr
      // 04a: l2i
      // 04b: istore 10
      // 04d: pop2
      // 04e: dup2
      // 04f: ldc2_w 126726909925076
      // 052: lxor
      // 053: lstore 11
      // 055: dup2
      // 056: ldc2_w 39344624299642
      // 059: lxor
      // 05a: lstore 13
      // 05c: dup2
      // 05d: ldc2_w 56523546971823
      // 060: lxor
      // 061: lstore 15
      // 063: dup2
      // 064: ldc2_w 140309719611249
      // 067: lxor
      // 068: lstore 17
      // 06a: dup2
      // 06b: ldc2_w 48843178170031
      // 06e: lxor
      // 06f: lstore 19
      // 071: dup2
      // 072: ldc2_w 40811883676273
      // 075: lxor
      // 076: lstore 21
      // 078: dup2
      // 079: ldc2_w 78634907334313
      // 07c: lxor
      // 07d: lstore 23
      // 07f: dup2
      // 080: ldc2_w 75425905213622
      // 083: lxor
      // 084: dup2
      // 085: bipush 48
      // 087: lushr
      // 088: l2i
      // 089: istore 25
      // 08b: dup2
      // 08c: bipush 16
      // 08e: lshl
      // 08f: bipush 16
      // 091: lushr
      // 092: lstore 26
      // 094: pop2
      // 095: dup2
      // 096: ldc2_w 113007322123366
      // 099: lxor
      // 09a: lstore 28
      // 09c: pop2
      // 09d: ldc2_w -2088622790226835742
      // 0a0: lload 2
      // 0a1: invokedynamic u (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: astore 30
      // 0a8: aload 0
      // 0a9: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 0ac: aload 30
      // 0ae: ifnonnull 0d2
      // 0b1: ifnull 106
      // 0b4: goto 0c1
      // 0b7: ldc2_w -2281686213389582528
      // 0ba: lload 2
      // 0bb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 0c5: goto 0d2
      // 0c8: ldc2_w -2281686213389582528
      // 0cb: lload 2
      // 0cc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 4
      // 0d4: aload 5
      // 0d6: aload 7
      // 0d8: aload 6
      // 0da: lload 28
      // 0dc: bipush 5
      // 0dd: anewarray 357
      // 0e0: dup_x2
      // 0e1: dup_x2
      // 0e2: pop
      // 0e3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e6: bipush 4
      // 0e7: swap
      // 0e8: aastore
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: bipush 3
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 2
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 1
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 0
      // 0fb: swap
      // 0fc: aastore
      // 0fd: ldc2_w -1760436217933573904
      // 100: lload 2
      // 101: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: aconst_null
      // 107: astore 31
      // 109: aload 0
      // 10a: lload 11
      // 10c: invokevirtual com/zelix/xm.m (J)Lcom/zelix/w5;
      // 10f: ldc2_w -43715413776894118
      // 112: lload 2
      // 113: invokedynamic l (JJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: invokevirtual com/zelix/w5.equals (Ljava/lang/Object;)Z
      // 11b: aload 30
      // 11d: lload 2
      // 11e: lconst_0
      // 11f: lcmp
      // 120: iflt 171
      // 123: ifnonnull 16f
      // 126: ifeq 15d
      // 129: goto 136
      // 12c: ldc2_w -2281686213389582528
      // 12f: lload 2
      // 130: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: aload 0
      // 137: ldc2_w -518349006209929066
      // 13a: lload 2
      // 13b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: lload 23
      // 142: bipush 1
      // 143: anewarray 357
      // 146: dup_x2
      // 147: dup_x2
      // 148: pop
      // 149: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14c: bipush 0
      // 14d: swap
      // 14e: aastore
      // 14f: ldc2_w -2058637465871115539
      // 152: lload 2
      // 153: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: astore 31
      // 15a: goto 228
      // 15d: aload 0
      // 15e: lload 11
      // 160: invokevirtual com/zelix/xm.m (J)Lcom/zelix/w5;
      // 163: ldc2_w -275731603535863718
      // 166: lload 2
      // 167: invokedynamic l (JJ)Lcom/zelix/w5; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: invokevirtual com/zelix/w5.equals (Ljava/lang/Object;)Z
      // 16f: aload 30
      // 171: lload 2
      // 172: lconst_0
      // 173: lcmp
      // 174: iflt 221
      // 177: ifnonnull 1d4
      // 17a: ifeq 1d3
      // 17d: goto 18a
      // 180: ldc2_w -2281686213389582528
      // 183: lload 2
      // 184: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: new java/util/ArrayList
      // 18d: dup
      // 18e: bipush 1
      // 18f: invokespecial java/util/ArrayList.<init> (I)V
      // 192: astore 31
      // 194: aload 0
      // 195: ldc2_w -518349006209929066
      // 198: lload 2
      // 199: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: invokevirtual com/zelix/mn.M ()Ljava/lang/String;
      // 1a1: iload 25
      // 1a3: i2c
      // 1a4: swap
      // 1a5: lload 26
      // 1a7: dup2_x1
      // 1a8: pop2
      // 1a9: invokestatic com/zelix/xl.C (CJLjava/lang/String;)Lcom/zelix/hy;
      // 1ac: astore 32
      // 1ae: lload 2
      // 1af: lconst_0
      // 1b0: lcmp
      // 1b1: iflt 1c3
      // 1b4: aload 32
      // 1b6: ifnull 1d0
      // 1b9: aload 31
      // 1bb: aload 32
      // 1bd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1c2: pop
      // 1c3: goto 1d0
      // 1c6: ldc2_w -2281686213389582528
      // 1c9: lload 2
      // 1ca: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: athrow
      // 1d0: goto 228
      // 1d3: bipush 0
      // 1d4: bipush 1
      // 1d5: anewarray 9
      // 1d8: dup
      // 1d9: bipush 0
      // 1da: new java/lang/StringBuilder
      // 1dd: dup
      // 1de: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e1: sipush 18338
      // 1e4: ldc2_w 177362673605562241
      // 1e7: lload 2
      // 1e8: lxor
      // 1e9: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f1: aload 0
      // 1f2: lload 11
      // 1f4: invokevirtual com/zelix/xm.m (J)Lcom/zelix/w5;
      // 1f7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1fa: sipush 21596
      // 1fd: ldc2_w 3993278048195042428
      // 200: lload 2
      // 201: lxor
      // 202: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20a: aload 0
      // 20b: iload 8
      // 20d: iload 9
      // 20f: i2s
      // 210: iload 10
      // 212: invokevirtual com/zelix/xm.A (ISI)Ljava/lang/String;
      // 215: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 218: ldc "'"
      // 21a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 220: aastore
      // 221: lload 13
      // 223: dup2_x2
      // 224: pop2
      // 225: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // 228: aload 0
      // 229: lload 15
      // 22b: bipush 1
      // 22c: anewarray 357
      // 22f: dup_x2
      // 230: dup_x2
      // 231: pop
      // 232: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 235: bipush 0
      // 236: swap
      // 237: aastore
      // 238: ldc2_w -388331665273506265
      // 23b: lload 2
      // 23c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 241: astore 32
      // 243: aload 32
      // 245: lload 21
      // 247: invokevirtual com/zelix/hz.K (J)Z
      // 24a: aload 30
      // 24c: lload 2
      // 24d: lconst_0
      // 24e: lcmp
      // 24f: ifle 368
      // 252: ifnonnull 366
      // 255: ifeq 349
      // 258: goto 265
      // 25b: ldc2_w -2281686213389582528
      // 25e: lload 2
      // 25f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: aload 32
      // 267: bipush 0
      // 268: anewarray 357
      // 26b: ldc2_w -1957243265297982467
      // 26e: lload 2
      // 26f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: astore 33
      // 276: new java/util/ArrayList
      // 279: dup
      // 27a: aload 31
      // 27c: invokeinterface java/util/List.size ()I 1
      // 281: invokespecial java/util/ArrayList.<init> (I)V
      // 284: astore 34
      // 286: aload 31
      // 288: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 28d: astore 35
      // 28f: aload 35
      // 291: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 296: ifeq 33f
      // 299: aload 35
      // 29b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2a0: checkcast com/zelix/hy
      // 2a3: astore 36
      // 2a5: aload 36
      // 2a7: lload 19
      // 2a9: invokevirtual com/zelix/hy.B (J)Z
      // 2ac: aload 30
      // 2ae: lload 2
      // 2af: lconst_0
      // 2b0: lcmp
      // 2b1: ifle 2b9
      // 2b4: ifnonnull 366
      // 2b7: aload 30
      // 2b9: ifnonnull 339
      // 2bc: goto 2c9
      // 2bf: ldc2_w -2281686213389582528
      // 2c2: lload 2
      // 2c3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: athrow
      // 2c9: lload 2
      // 2ca: lconst_0
      // 2cb: lcmp
      // 2cc: iflt 32c
      // 2cf: ifeq 323
      // 2d2: goto 2df
      // 2d5: ldc2_w -2281686213389582528
      // 2d8: lload 2
      // 2d9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: athrow
      // 2df: aload 34
      // 2e1: aload 36
      // 2e3: aload 33
      // 2e5: lload 17
      // 2e7: bipush 2
      // 2e8: anewarray 357
      // 2eb: dup_x2
      // 2ec: dup_x2
      // 2ed: pop
      // 2ee: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f1: bipush 1
      // 2f2: swap
      // 2f3: aastore
      // 2f4: dup_x1
      // 2f5: swap
      // 2f6: bipush 0
      // 2f7: swap
      // 2f8: aastore
      // 2f9: ldc2_w -56057909681767896
      // 2fc: lload 2
      // 2fd: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: checkcast com/zelix/hy
      // 305: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 30a: pop
      // 30b: aload 30
      // 30d: lload 2
      // 30e: lconst_0
      // 30f: lcmp
      // 310: iflt 33c
      // 313: ifnull 33a
      // 316: goto 323
      // 319: ldc2_w -2281686213389582528
      // 31c: lload 2
      // 31d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 322: athrow
      // 323: aload 34
      // 325: aload 36
      // 327: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 32c: goto 339
      // 32f: ldc2_w -2281686213389582528
      // 332: lload 2
      // 333: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 338: athrow
      // 339: pop
      // 33a: aload 30
      // 33c: ifnull 28f
      // 33f: aload 34
      // 341: lload 2
      // 342: lconst_0
      // 343: lcmp
      // 344: iflt 2a0
      // 347: astore 31
      // 349: aload 0
      // 34a: ldc2_w -518349006209929066
      // 34d: lload 2
      // 34e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/mn; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 353: invokevirtual com/zelix/mn.F ()Ljava/lang/String;
      // 356: sipush 17407
      // 359: ldc2_w 6499130945811827677
      // 35c: lload 2
      // 35d: lxor
      // 35e: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/xm.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 363: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 366: aload 30
      // 368: ifnonnull 3ad
      // 36b: ifeq 397
      // 36e: goto 37b
      // 371: ldc2_w -2281686213389582528
      // 374: lload 2
      // 375: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: athrow
      // 37b: aload 4
      // 37d: aload 31
      // 37f: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 384: pop
      // 385: aload 30
      // 387: ifnull 3ae
      // 38a: goto 397
      // 38d: ldc2_w -2281686213389582528
      // 390: lload 2
      // 391: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 396: athrow
      // 397: aload 5
      // 399: aload 31
      // 39b: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 3a0: goto 3ad
      // 3a3: ldc2_w -2281686213389582528
      // 3a6: lload 2
      // 3a7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: athrow
      // 3ad: pop
      // 3ae: return
   }

   void D(Object[] param1) {
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
      // 0c: getstatic com/zelix/xm.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 83930779547287
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 732067774112296905
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)[Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: astore 6
      // 26: aload 0
      // 27: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 2a: aload 6
      // 2c: ifnonnull 50
      // 2f: ifnull 68
      // 32: goto 3f
      // 35: ldc2_w 684187715797128811
      // 38: lload 2
      // 39: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield com/zelix/xm.T Lcom/zelix/bc;
      // 43: goto 50
      // 46: ldc2_w 684187715797128811
      // 49: lload 2
      // 4a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: lload 4
      // 52: bipush 1
      // 53: anewarray 357
      // 56: dup_x2
      // 57: dup_x2
      // 58: pop
      // 59: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5c: bipush 0
      // 5d: swap
      // 5e: aastore
      // 5f: ldc2_w 823618447401083437
      // 62: lload 2
      // 63: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: return
   }

   static {
      long var11 = b ^ 94415998614321L;
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
      String var17 = "±¸\u0090\u009b*èóg½Ñ\u0002Æû2o½¼\u0096é5å\u0000·\u0096\u0010YóÚuGI{Ã]c«_{yÈ$\u0010UÍRê\u0086¥\u0018¦ëÊOJõ\u0006óQ";
      int var19 = "±¸\u0090\u009b*èóg½Ñ\u0002Æû2o½¼\u0096é5å\u0000·\u0096\u0010YóÚuGI{Ã]c«_{yÈ$\u0010UÍRê\u0086¥\u0018¦ëÊOJõ\u0006óQ".length();
      char var16 = 24;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var17.substring(++var23, var23 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = b(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var33;
                  if ((var23 += var16) >= var19) {
                     d = var20;
                     e = new String[5];
                     p = new HashMap(13);
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
                     String var4 = "ÔbK¾z¹÷\u0085\u0012\u0016w\u0090É\u0084Y\u001b";
                     int var5 = "ÔbK¾z¹÷\u0085\u0012\u0016w\u0090É\u0084Y\u001b".length();
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

                     l = var6;
                     n = new Integer[2];
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

                  var17 = "Öñ9\u0018Ø¨\u0093\u0081\u001d\u008cVA\u0084¿b\u009f\u0010\u001b\u0005êClÕ70Íç\r\u0013n2@Ú";
                  var19 = "Öñ9\u0018Ø¨\u0093\u0081\u001d\u008cVA\u0084¿b\u009f\u0010\u001b\u0005êClÕ70Íç\r\u0013n2@Ú".length();
                  var16 = 16;
                  var23 = -1;
            }

            var24 = var17.substring(++var23, var23 + var16);
            var10001 = 0;
         }
      }
   }

   private static gj b(gj var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26213;
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
            throw new RuntimeException("com/zelix/xm", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
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
         throw new RuntimeException("com/zelix/xm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1433;
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/xm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static int e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("com/zelix/xm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
