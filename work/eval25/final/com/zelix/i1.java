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

public class i1 extends i2 {
   private mx t;
   private hz x;
   private int d;
   private static final long a = ess.a(-7378535954285267389L, -7589907023627626884L, MethodHandles.lookup().lookupClass()).a(145264990677797L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public void B(Object[] param1) {
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
      // 16: ldc2_w 13860179763599
      // 19: lxor
      // 1a: lstore 5
      // 1c: pop2
      // 1d: ldc2_w -5968474420302013119
      // 20: lload 2
      // 21: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26: istore 7
      // 28: aload 0
      // 29: iload 7
      // 2b: ifeq 64
      // 2e: lload 5
      // 30: bipush 1
      // 31: anewarray 110
      // 34: dup_x2
      // 35: dup_x2
      // 36: pop
      // 37: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3a: bipush 0
      // 3b: swap
      // 3c: aastore
      // 3d: ldc2_w -5683195001731015253
      // 40: lload 2
      // 41: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: ifeq 8f
      // 49: goto 56
      // 4c: ldc2_w -5803425730413007038
      // 4f: lload 2
      // 50: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: aload 0
      // 57: goto 64
      // 5a: ldc2_w -5803425730413007038
      // 5d: lload 2
      // 5e: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: ldc2_w -5973722745575550184
      // 67: lload 2
      // 68: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: ifnull 8f
      // 70: aload 4
      // 72: aload 0
      // 73: ldc2_w -5973722745575550184
      // 76: lload 2
      // 77: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 81: pop
      // 82: goto 8f
      // 85: ldc2_w -5803425730413007038
      // 88: lload 2
      // 89: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: athrow
      // 8f: return
   }

   public void N(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   String Q(Object[] var1) {
      long var2 = (Long)var1[0];
      return a<"f">(14419, 8456126219069512251L ^ var2);
   }

   String E(Object[] param1) {
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
      // 0c: ldc2_w -7041980558321866239
      // 0f: lload 2
      // 10: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: ldc2_w -9026214091769114231
      // 1b: lload 2
      // 1c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21: iload 4
      // 23: ifne 4d
      // 26: ifnull 89
      // 29: goto 36
      // 2c: ldc2_w -9120043630584676005
      // 2f: lload 2
      // 30: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: athrow
      // 36: aload 0
      // 37: ldc2_w -9026214091769114231
      // 3a: lload 2
      // 3b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: goto 4d
      // 43: ldc2_w -9120043630584676005
      // 46: lload 2
      // 47: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 50: astore 5
      // 52: aload 5
      // 54: iload 4
      // 56: ifne 88
      // 59: ldc "["
      // 5b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 5e: ifeq 7b
      // 61: goto 6e
      // 64: ldc2_w -9120043630584676005
      // 67: lload 2
      // 68: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: aload 5
      // 70: areturn
      // 71: ldc2_w -9120043630584676005
      // 74: lload 2
      // 75: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 5
      // 7d: bipush 1
      // 7e: aload 5
      // 80: invokevirtual java/lang/String.length ()I
      // 83: bipush 1
      // 84: isub
      // 85: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 88: areturn
      // 89: aconst_null
      // 8a: areturn
   }

   public void p(Object[] var1) {
      long var2 = (Long)var1[0];
   }

   boolean j(Object[] var1) {
      long var2 = (Long)var1[0];

      try {
         if (x44.a<"o">(this, 3297816918818995953L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"s">(var4, 3321221913324252707L, var2);
      }

      return false;
   }

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
      // 004: checkcast com/zelix/_ug
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 5
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/ei
      // 019: astore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/_ur
      // 020: astore 4
      // 022: pop
      // 023: lload 5
      // 025: dup2
      // 026: ldc2_w 76691746471624
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 75811912136996
      // 030: lxor
      // 031: lstore 9
      // 033: dup2
      // 034: ldc2_w 49532545494273
      // 037: lxor
      // 038: lstore 11
      // 03a: dup2
      // 03b: ldc2_w 100014378507819
      // 03e: lxor
      // 03f: lstore 13
      // 041: pop2
      // 042: new com/zelix/wp
      // 045: dup
      // 046: bipush 0
      // 047: invokespecial com/zelix/wp.<init> (I)V
      // 04a: astore 16
      // 04c: ldc2_w -2380776427528786273
      // 04f: lload 5
      // 051: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: aload 0
      // 057: ldc2_w -2343263911691006898
      // 05a: lload 5
      // 05c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 064: lload 9
      // 066: aload 16
      // 068: invokestatic com/zelix/hz.w (Ljava/lang/String;JLcom/zelix/wp;)Ljava/lang/String;
      // 06b: astore 17
      // 06d: istore 15
      // 06f: aload 0
      // 070: iload 15
      // 072: ifeq 0a8
      // 075: aload 16
      // 077: lload 11
      // 079: invokevirtual com/zelix/wp.C (J)I
      // 07c: ldc2_w -2791187998039116695
      // 07f: lload 5
      // 081: invokedynamic w (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: aload 17
      // 088: ifnull 113
      // 08b: goto 099
      // 08e: ldc2_w -2546671948079850340
      // 091: lload 5
      // 093: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: aload 0
      // 09a: goto 0a8
      // 09d: ldc2_w -2546671948079850340
      // 0a0: lload 5
      // 0a2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: aload 3
      // 0a9: aload 17
      // 0ab: new java/lang/StringBuilder
      // 0ae: dup
      // 0af: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b2: sipush 32104
      // 0b5: ldc2_w 2982452980174443570
      // 0b8: lload 5
      // 0ba: lxor
      // 0bb: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c3: aload 0
      // 0c4: lload 7
      // 0c6: invokevirtual com/zelix/i1.o (J)Ljava/lang/String;
      // 0c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cc: sipush 8632
      // 0cf: ldc2_w 5615996780139481318
      // 0d2: lload 5
      // 0d4: lxor
      // 0d5: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e0: aload 2
      // 0e1: lload 13
      // 0e3: bipush 4
      // 0e4: anewarray 110
      // 0e7: dup_x2
      // 0e8: dup_x2
      // 0e9: pop
      // 0ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ed: bipush 3
      // 0ee: swap
      // 0ef: aastore
      // 0f0: dup_x1
      // 0f1: swap
      // 0f2: bipush 2
      // 0f3: swap
      // 0f4: aastore
      // 0f5: dup_x1
      // 0f6: swap
      // 0f7: bipush 1
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 0
      // 0fd: swap
      // 0fe: aastore
      // 0ff: ldc2_w -4385760210782478658
      // 102: lload 5
      // 104: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: ldc2_w -2393836371569729338
      // 10c: lload 5
      // 10e: invokedynamic w (Ljava/lang/Object;Lcom/zelix/hz;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: return
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
      // 1b: ldc2_w -4813852749984134795
      // 1e: lload 6
      // 20: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: istore 8
      // 27: aload 0
      // 28: iload 8
      // 2a: ifne 58
      // 2d: ldc2_w -6789058204130725123
      // 30: lload 6
      // 32: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 1
      // 38: if_acmpne 63
      // 3b: goto 49
      // 3e: ldc2_w -6765812707095223761
      // 41: lload 6
      // 43: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: goto 58
      // 4d: ldc2_w -6765812707095223761
      // 50: lload 6
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 3
      // 59: ldc2_w -6789058204130725123
      // 5c: lload 6
      // 5e: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: return
   }

   public void s(Object[] var1) {
      long var3 = (Long)var1[0];
      DataOutputStream var2 = (DataOutputStream)var1[1];
      long var5 = var3 ^ 111534839130684L;
      var2.writeByte(x44.a<"k">(this, new Object[]{var5}, 778665830265632561L, var3));
      var2.writeShort(x44.a<"o">(this, 724041753784588601L, var3).B());
   }

   public void r(Object[] param1) {
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
      // 0f: checkcast java/util/HashMap
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/HashMap
      // 19: astore 2
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 58015399186006
      // 21: lxor
      // 22: lstore 6
      // 24: dup2
      // 25: ldc2_w 95955316791289
      // 28: lxor
      // 29: lstore 8
      // 2b: pop2
      // 2c: ldc2_w -3106693066594656090
      // 2f: lload 4
      // 31: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: istore 10
      // 38: aload 0
      // 39: iload 10
      // 3b: ifne 68
      // 3e: ldc2_w -3916150789272422490
      // 41: lload 4
      // 43: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: ifnull b8
      // 4b: goto 59
      // 4e: ldc2_w -3762744015361963012
      // 51: lload 4
      // 53: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: goto 68
      // 5d: ldc2_w -3762744015361963012
      // 60: lload 4
      // 62: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: ldc2_w -4027512222521861330
      // 6b: lload 4
      // 6d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: aload 0
      // 73: ldc2_w -3916150789272422490
      // 76: lload 4
      // 78: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: lload 8
      // 7f: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 82: lload 6
      // 84: dup2_x1
      // 85: pop2
      // 86: aload 0
      // 87: ldc2_w -3592783616709795063
      // 8a: lload 4
      // 8c: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: bipush 3
      // 92: anewarray 110
      // 95: dup_x1
      // 96: swap
      // 97: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 9a: bipush 2
      // 9b: swap
      // 9c: aastore
      // 9d: dup_x1
      // 9e: swap
      // 9f: bipush 1
      // a0: swap
      // a1: aastore
      // a2: dup_x2
      // a3: dup_x2
      // a4: pop
      // a5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a8: bipush 0
      // a9: swap
      // aa: aastore
      // ab: ldc2_w -3884157015279428188
      // ae: lload 4
      // b0: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // b8: return
   }

   public void Y(Object[] param1) {
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
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/util/Set
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/util/Set
      // 15: astore 6
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 4
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast java/util/Set
      // 28: astore 7
      // 2a: pop
      // 2b: ldc2_w 1887524154404252251
      // 2e: lload 4
      // 30: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: istore 8
      // 37: aload 0
      // 38: ldc2_w 1874482353960969218
      // 3b: lload 4
      // 3d: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: lload 4
      // 44: lconst_0
      // 45: lcmp
      // 46: iflt 78
      // 49: iload 8
      // 4b: ifeq 78
      // 4e: ifnull b4
      // 51: goto 5f
      // 54: ldc2_w 1759915828301944920
      // 57: lload 4
      // 59: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: ldc2_w 1874482353960969218
      // 63: lload 4
      // 65: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: goto 78
      // 6d: ldc2_w 1759915828301944920
      // 70: lload 4
      // 72: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: invokevirtual com/zelix/hz.b ()Z
      // 7b: iload 8
      // 7d: ifeq b3
      // 80: ifeq b4
      // 83: goto 91
      // 86: ldc2_w 1759915828301944920
      // 89: lload 4
      // 8b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: aload 3
      // 92: aload 0
      // 93: ldc2_w 1874482353960969218
      // 96: lload 4
      // 98: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: checkcast com/zelix/hy
      // a0: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // a5: goto b3
      // a8: ldc2_w 1759915828301944920
      // ab: lload 4
      // ad: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: athrow
      // b3: pop
      // b4: return
   }

   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      return 3;
   }

   public void J(Object[] param1) {
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
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 5
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 2
      // 22: pop
      // 23: lload 3
      // 24: dup2
      // 25: ldc2_w 129683512282286
      // 28: lxor
      // 29: lstore 7
      // 2b: pop2
      // 2c: ldc2_w -5976130257167082118
      // 2f: lload 3
      // 30: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 6
      // 37: aload 0
      // 38: lload 7
      // 3a: bipush 1
      // 3b: anewarray 110
      // 3e: dup_x2
      // 3f: dup_x2
      // 40: pop
      // 41: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 44: bipush 0
      // 45: swap
      // 46: aastore
      // 47: ldc2_w -6026818023045852765
      // 4a: lload 3
      // 4b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: invokevirtual java/io/DataOutputStream.writeByte (I)V
      // 53: aload 5
      // 55: aload 0
      // 56: ldc2_w -6008293791000674389
      // 59: lload 3
      // 5a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 64: checkcast com/zelix/mx
      // 67: checkcast com/zelix/mx
      // 6a: astore 10
      // 6c: istore 9
      // 6e: iload 9
      // 70: ifeq 9c
      // 73: aload 10
      // 75: ifnull a7
      // 78: goto 85
      // 7b: ldc2_w -5814945255011782791
      // 7e: lload 3
      // 7f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: athrow
      // 85: aload 6
      // 87: aload 10
      // 89: invokevirtual com/zelix/mx.B ()I
      // 8c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 8f: goto 9c
      // 92: ldc2_w -5814945255011782791
      // 95: lload 3
      // 96: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: lload 3
      // 9d: lconst_0
      // 9e: lcmp
      // 9f: ifle b9
      // a2: iload 9
      // a4: ifne c6
      // a7: aload 6
      // a9: aload 0
      // aa: ldc2_w -6008293791000674389
      // ad: lload 3
      // ae: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: invokevirtual com/zelix/mx.B ()I
      // b6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // b9: goto c6
      // bc: ldc2_w -5814945255011782791
      // bf: lload 3
      // c0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c5: athrow
      // c6: return
   }

   boolean r(Object[] var1) {
      return true;
   }

   i1(long param1, h8 param3, int param4, _xx param5, _y4 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/i1.a J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 25871657708547
      // 00b: lxor
      // 00c: lstore 7
      // 00e: dup2
      // 00f: ldc2_w 62670077034534
      // 012: lxor
      // 013: lstore 9
      // 015: dup2
      // 016: ldc2_w 1542866232203
      // 019: lxor
      // 01a: lstore 11
      // 01c: dup2
      // 01d: ldc2_w 47641310078240
      // 020: lxor
      // 021: lstore 13
      // 023: dup2
      // 024: ldc2_w 27294783840410
      // 027: lxor
      // 028: dup2
      // 029: bipush 8
      // 02b: lushr
      // 02c: lstore 15
      // 02e: dup2
      // 02f: bipush 56
      // 031: lshl
      // 032: bipush 56
      // 034: lushr
      // 035: l2i
      // 036: istore 17
      // 038: pop2
      // 039: dup2
      // 03a: ldc2_w 71995822979330
      // 03d: lxor
      // 03e: lstore 18
      // 040: pop2
      // 041: ldc2_w -7513172283881510959
      // 044: lload 1
      // 045: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: aload 0
      // 04b: aload 3
      // 04c: iload 4
      // 04e: lload 18
      // 050: invokespecial com/zelix/i2.<init> (Lcom/zelix/h8;IJ)V
      // 053: istore 20
      // 055: aload 5
      // 057: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 05a: istore 21
      // 05c: aload 0
      // 05d: lload 15
      // 05f: iload 21
      // 061: iload 17
      // 063: i2b
      // 064: invokevirtual com/zelix/i1.N (JIB)Lcom/zelix/xl;
      // 067: astore 22
      // 069: iload 20
      // 06b: ifeq 0fd
      // 06e: aload 22
      // 070: ifnull 0ce
      // 073: goto 080
      // 076: ldc2_w -7645292794997320238
      // 079: lload 1
      // 07a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: lload 1
      // 081: lconst_0
      // 082: lcmp
      // 083: ifle 0f0
      // 086: aload 22
      // 088: instanceof com/zelix/mx
      // 08b: ifeq 0ce
      // 08e: goto 09b
      // 091: ldc2_w -7645292794997320238
      // 094: lload 1
      // 095: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09a: athrow
      // 09b: aload 0
      // 09c: aload 22
      // 09e: checkcast com/zelix/mx
      // 0a1: ldc2_w -7623155949783415552
      // 0a4: lload 1
      // 0a5: invokedynamic q (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: aload 6
      // 0ac: aload 0
      // 0ad: ldc2_w -7623155949783415552
      // 0b0: lload 1
      // 0b1: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: aload 0
      // 0b7: lload 9
      // 0b9: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0bc: iload 20
      // 0be: ifne 193
      // 0c1: goto 0ce
      // 0c4: ldc2_w -7645292794997320238
      // 0c7: lload 1
      // 0c8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: bipush 0
      // 0d0: lload 13
      // 0d2: bipush 2
      // 0d3: anewarray 110
      // 0d6: dup_x2
      // 0d7: dup_x2
      // 0d8: pop
      // 0d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0dc: bipush 1
      // 0dd: swap
      // 0de: aastore
      // 0df: dup_x1
      // 0e0: swap
      // 0e1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w -7494882899358988183
      // 0ea: lload 1
      // 0eb: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: goto 0fd
      // 0f3: ldc2_w -7645292794997320238
      // 0f6: lload 1
      // 0f7: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: new java/lang/StringBuilder
      // 101: dup
      // 102: invokespecial java/lang/StringBuilder.<init> ()V
      // 105: sipush 27656
      // 108: lload 1
      // 109: lconst_0
      // 10a: lcmp
      // 10b: iflt 122
      // 10e: ldc2_w 3377902987413326879
      // 111: lload 1
      // 112: lxor
      // 113: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: iload 20
      // 11a: ifeq 168
      // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 120: iload 21
      // 122: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 125: aload 22
      // 127: ifnull 16b
      // 12a: goto 137
      // 12d: ldc2_w -7645292794997320238
      // 130: lload 1
      // 131: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: new java/lang/StringBuilder
      // 13a: dup
      // 13b: invokespecial java/lang/StringBuilder.<init> ()V
      // 13e: sipush 24279
      // 141: ldc2_w 1083888189193010881
      // 144: lload 1
      // 145: lxor
      // 146: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/i1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14e: aload 22
      // 150: lload 11
      // 152: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 155: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 158: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15b: goto 168
      // 15e: ldc2_w -7645292794997320238
      // 161: lload 1
      // 162: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: goto 16d
      // 16b: ldc ""
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 170: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 173: lload 7
      // 175: dup2_x1
      // 176: pop2
      // 177: bipush 2
      // 178: anewarray 110
      // 17b: dup_x1
      // 17c: swap
      // 17d: bipush 1
      // 17e: swap
      // 17f: aastore
      // 180: dup_x2
      // 181: dup_x2
      // 182: pop
      // 183: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 186: bipush 0
      // 187: swap
      // 188: aastore
      // 189: ldc2_w -8637109117619600553
      // 18c: lload 1
      // 18d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 192: return
      // 193: return
   }

   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      x44.a<"k">(this, -6455894311926549155L, var1).O(var4, var3, this, this.x());
   }

   static {
      long var0 = a ^ 88964213348698L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "Ìk,$8¬JéÄn±é6\u000b&½ZHL:ã\u0092nÒ<z\u0083á\u0081½ó\u009cP\u0089_=Ì\u001d¸¬¸®[¨zÄ\u0016è'gUWíþ\u0012z(S\u0091mù\u0090hK0k\u0087+t5~ÐÿI\tW\u0098ÊÄÒ \u0012x\u0000o[aÇ\u0007&M**B\u0017z\u0016\"æÑô®\u008dþ\u009dæ4®\"¢1ý\u0016\u0010½7OGlÓC\u009b\u0005d1µöª\u0012\u0095";
      int var8 = "Ìk,$8¬JéÄn±é6\u000b&½ZHL:ã\u0092nÒ<z\u0083á\u0081½ó\u009cP\u0089_=Ì\u001d¸¬¸®[¨zÄ\u0016è'gUWíþ\u0012z(S\u0091mù\u0090hK0k\u0087+t5~ÐÿI\tW\u0098ÊÄÒ \u0012x\u0000o[aÇ\u0007&M**B\u0017z\u0016\"æÑô®\u008dþ\u009dæ4®\"¢1ý\u0016\u0010½7OGlÓC\u009b\u0005d1µöª\u0012\u0095"
         .length();
      char var5 = '@';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     c = var9;
                     e = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "¦XZF\u0090[.Ï4/\u008fç+Ê\u0090\u0092ßE1#É®\u0082³MªÑd\fÕ>\u00891\u0085\u0018\\#\u0087®¡\u0010º\u0081ÍØÎj:¹¾Âx\t\u008eöÜ\u0011%ÿá^\u001a\u0086g\u0010QIxG?Þ~'³\u00ad3\u00965Éò\u0093";
                  var8 = "¦XZF\u0090[.Ï4/\u008fç+Ê\u0090\u0092ßE1#É®\u0082³MªÑd\fÕ>\u00891\u0085\u0018\\#\u0087®¡\u0010º\u0081ÍØÎj:¹¾Âx\t\u008eöÜ\u0011%ÿá^\u001a\u0086g\u0010QIxG?Þ~'³\u00ad3\u00965Éò\u0093"
                     .length();
                  var5 = '@';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31501;
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
            throw new RuntimeException("com/zelix/i1", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("com/zelix/i1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
