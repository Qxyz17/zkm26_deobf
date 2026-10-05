package com.zelix;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class l implements sr {
   x7 a;
   private static final long c = ess.a(7487583438233746098L, -7794090379920932352L, MethodHandles.lookup().lookupClass()).a(105810119687746L);
   private static final String d;
   private static final long e;

   public boolean B(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public String d(Object[] param1) {
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
      // 0e: ldc2_w 67135027577178
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 2678310183001443902
      // 18: lload 2
      // 19: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: aload 0
      // 1f: lload 4
      // 21: bipush 1
      // 22: anewarray 75
      // 25: dup_x2
      // 26: dup_x2
      // 27: pop
      // 28: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b: bipush 0
      // 2c: swap
      // 2d: aastore
      // 2e: ldc2_w 4457006484479167260
      // 31: lload 2
      // 32: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: astore 7
      // 39: istore 6
      // 3b: aload 7
      // 3d: iload 6
      // 3f: ifne 60
      // 42: ifnonnull 5e
      // 45: goto 52
      // 48: ldc2_w 2862506637197064485
      // 4b: lload 2
      // 4c: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: athrow
      // 52: aconst_null
      // 53: areturn
      // 54: ldc2_w 2862506637197064485
      // 57: lload 2
      // 58: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: aload 7
      // 60: getstatic com/zelix/l.e J
      // 63: l2i
      // 64: invokevirtual java/lang/String.lastIndexOf (I)I
      // 67: istore 8
      // 69: iload 8
      // 6b: iload 6
      // 6d: lload 2
      // 6e: lconst_0
      // 6f: lcmp
      // 70: iflt 77
      // 73: ifne ab
      // 76: bipush -1
      // 77: if_icmple 92
      // 7a: goto 87
      // 7d: ldc2_w 2862506637197064485
      // 80: lload 2
      // 81: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: aload 7
      // 89: iload 8
      // 8b: bipush 1
      // 8c: iadd
      // 8d: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 90: astore 7
      // 92: aload 7
      // 94: iload 6
      // 96: ifne bf
      // 99: ldc ";"
      // 9b: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 9e: goto ab
      // a1: ldc2_w 2862506637197064485
      // a4: lload 2
      // a5: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: ifeq bd
      // ae: aload 7
      // b0: bipush 1
      // b1: aload 7
      // b3: invokevirtual java/lang/String.length ()I
      // b6: bipush 1
      // b7: isub
      // b8: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // bb: astore 7
      // bd: aload 7
      // bf: areturn
   }

   public String y(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 135986204036823L;
      return x44.a<"k">(this, new Object[]{var4}, 8239108376158798993L, var2);
   }

   public l(long param1, x7 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/l.c J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 28153788380605297
      // 09: lload 1
      // 0a: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: invokespecial java/lang/Object.<init> ()V
      // 13: istore 4
      // 15: iload 4
      // 17: ifne 48
      // 1a: aload 3
      // 1b: ifnonnull 3d
      // 1e: goto 2b
      // 21: ldc2_w 213617301114133610
      // 24: lload 1
      // 25: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: athrow
      // 2b: new java/lang/IllegalArgumentException
      // 2e: dup
      // 2f: invokespecial java/lang/IllegalArgumentException.<init> ()V
      // 32: athrow
      // 33: ldc2_w 213617301114133610
      // 36: lload 1
      // 37: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 3
      // 3f: ldc2_w 266643839862950755
      // 42: lload 1
      // 43: invokedynamic r (Ljava/lang/Object;Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: return
   }

   @Override
   public int hashCode() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/l.c J
      // 03: ldc2_w 39256168454144
      // 06: lxor
      // 07: lstore 1
      // 08: ldc2_w 1752718420022691376
      // 0b: lload 1
      // 0c: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 3
      // 12: aload 0
      // 13: ldc2_w 1793674957806030900
      // 16: lload 1
      // 17: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c: iload 3
      // 1d: ifeq 47
      // 20: ifnull 4b
      // 23: goto 30
      // 26: ldc2_w 1846982977713604413
      // 29: lload 1
      // 2a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: athrow
      // 30: aload 0
      // 31: ldc2_w 1793674957806030900
      // 34: lload 1
      // 35: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: goto 47
      // 3d: ldc2_w 1846982977713604413
      // 40: lload 1
      // 41: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: invokevirtual com/zelix/x7.hashCode ()I
      // 4a: ireturn
      // 4b: bipush 0
      // 4c: ireturn
   }

   public boolean a(Object[] var1) {
      long var2 = (Long)var1[0];
      return false;
   }

   public String i(Object[] param1) {
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
      // 0e: ldc2_w 80958296610590
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -993873530168927968
      // 18: lload 2
      // 19: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: istore 6
      // 20: aload 0
      // 21: iload 6
      // 23: ifne 4d
      // 26: ldc2_w -1017171563305486030
      // 29: lload 2
      // 2a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: ifnull 66
      // 32: goto 3f
      // 35: ldc2_w -1105665322165801413
      // 38: lload 2
      // 39: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: goto 4d
      // 43: ldc2_w -1105665322165801413
      // 46: lload 2
      // 47: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: lload 4
      // 4f: bipush 1
      // 50: anewarray 75
      // 53: dup_x2
      // 54: dup_x2
      // 55: pop
      // 56: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 59: bipush 0
      // 5a: swap
      // 5b: aastore
      // 5c: ldc2_w -993013651661044094
      // 5f: lload 2
      // 60: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: areturn
      // 66: getstatic com/zelix/l.d Ljava/lang/String;
      // 69: areturn
   }

   public int B(Object[] var1) {
      int var2 = (Integer)var1[0];
      int var4 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      return -1;
   }

   public boolean f(Object[] var1) {
      long var2 = (Long)var1[0];
      return true;
   }

   public String s(Object[] param1) {
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
      // 0e: ldc2_w 94040985187013
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -6408425767507576462
      // 18: lload 2
      // 19: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: istore 6
      // 20: aload 0
      // 21: ldc2_w -6366344446971842698
      // 24: lload 2
      // 25: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: iload 6
      // 2c: ifeq 56
      // 2f: ifnull 5c
      // 32: goto 3f
      // 35: ldc2_w -6421121991013779329
      // 38: lload 2
      // 39: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: ldc2_w -6366344446971842698
      // 43: lload 2
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: goto 56
      // 4c: ldc2_w -6421121991013779329
      // 4f: lload 2
      // 50: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: lload 4
      // 58: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 5b: areturn
      // 5c: aconst_null
      // 5d: areturn
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/l.c J
      // 03: ldc2_w 138931472717683
      // 06: lxor
      // 07: lstore 2
      // 08: ldc2_w -7556558647014127293
      // 0b: lload 2
      // 0c: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11: istore 4
      // 13: aload 1
      // 14: instanceof com/zelix/l
      // 17: iload 4
      // 19: ifeq c5
      // 1c: ifeq c4
      // 1f: goto 2c
      // 22: ldc2_w -7578835982498297778
      // 25: lload 2
      // 26: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 1
      // 2d: checkcast com/zelix/l
      // 30: astore 5
      // 32: aload 0
      // 33: ldc2_w -7523487265723031737
      // 36: lload 2
      // 37: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: iload 4
      // 3e: ifeq b1
      // 41: ifnull a6
      // 44: goto 51
      // 47: ldc2_w -7578835982498297778
      // 4a: lload 2
      // 4b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: aload 5
      // 53: ldc2_w -7523487265723031737
      // 56: lload 2
      // 57: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: iload 4
      // 5e: ifeq 95
      // 61: goto 6e
      // 64: ldc2_w -7578835982498297778
      // 67: lload 2
      // 68: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: athrow
      // 6e: ifnull a4
      // 71: goto 7e
      // 74: ldc2_w -7578835982498297778
      // 77: lload 2
      // 78: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: ldc2_w -7523487265723031737
      // 82: lload 2
      // 83: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: goto 95
      // 8b: ldc2_w -7578835982498297778
      // 8e: lload 2
      // 8f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: aload 5
      // 97: ldc2_w -7523487265723031737
      // 9a: lload 2
      // 9b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: invokevirtual com/zelix/x7.equals (Ljava/lang/Object;)Z
      // a3: ireturn
      // a4: bipush 0
      // a5: ireturn
      // a6: aload 5
      // a8: ldc2_w -7523487265723031737
      // ab: lload 2
      // ac: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b1: ifnonnull c2
      // b4: bipush 1
      // b5: goto c3
      // b8: ldc2_w -7578835982498297778
      // bb: lload 2
      // bc: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c1: athrow
      // c2: bipush 0
      // c3: ireturn
      // c4: bipush 0
      // c5: ireturn
   }

   static {
      long var5 = c ^ 4722481871812L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var9 = var7.doFinal("8·\u0003Ùilú/".getBytes("ISO-8859-1"));
      String var12 = a(var9).intern();
      byte var10001 = -1;
      d = var12;
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var2 = -8678509442385202896L;
      byte[] var4 = var0.doFinal(
         new byte[]{
            (byte)((int)(var2 >>> 56)),
            (byte)((int)(var2 >>> 48)),
            (byte)((int)(var2 >>> 40)),
            (byte)((int)(var2 >>> 32)),
            (byte)((int)(var2 >>> 24)),
            (byte)((int)(var2 >>> 16)),
            (byte)((int)(var2 >>> 8)),
            (byte)((int)var2)
         }
      );
      long var14 = ((long)var4[0] & 255L) << 56
         | ((long)var4[1] & 255L) << 48
         | ((long)var4[2] & 255L) << 40
         | ((long)var4[3] & 255L) << 32
         | ((long)var4[4] & 255L) << 24
         | ((long)var4[5] & 255L) << 16
         | ((long)var4[6] & 255L) << 8
         | (long)var4[7] & 255L;
      var10001 = -1;
      e = var14;
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
}
