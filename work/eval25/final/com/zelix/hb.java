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

public class hb extends h4 implements sv {
   private int N;
   private x7[] E;
   private static final long a = ess.a(-2765190043907711806L, -5901160088233917700L, MethodHandles.lookup().lookupClass()).a(25840077808068L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

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
      // 2c: ldc2_w 1337486000330331973
      // 2f: lload 3
      // 30: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: arraylength
      // 36: if_icmpge a4
      // 39: aload 0
      // 3a: ldc2_w 1337486000330331973
      // 3d: lload 3
      // 3e: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: iload 7
      // 45: lload 3
      // 46: lconst_0
      // 47: lcmp
      // 48: iflt 7c
      // 4b: iload 6
      // 4d: ifeq 7c
      // 50: aaload
      // 51: aload 5
      // 53: if_acmpne 89
      // 56: goto 63
      // 59: ldc2_w 976456053331482983
      // 5c: lload 3
      // 5d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: aload 0
      // 64: ldc2_w 1337486000330331973
      // 67: lload 3
      // 68: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: iload 7
      // 6f: goto 7c
      // 72: ldc2_w 976456053331482983
      // 75: lload 3
      // 76: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: aload 2
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
      // 9a: ldc2_w 976456053331482983
      // 9d: lload 3
      // 9e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: return
   }

   hb(long var1, mx var3, x7[] var4) {
      var1 = a ^ var1;
      super(null, var3, var4.length * 2 + 2);
      x44.a<"q">(this, var4.length, -3042755254442023983L, var1);
      x44.a<"q">(this, var4, -2939203629862776065L, var1);
   }

   protected void O(Object[] param1) {
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
      // 1d: aload 0
      // 1e: lload 5
      // 20: aload 4
      // 22: bipush 2
      // 23: anewarray 56
      // 26: dup_x1
      // 27: swap
      // 28: bipush 1
      // 29: swap
      // 2a: aastore
      // 2b: dup_x2
      // 2c: dup_x2
      // 2d: pop
      // 2e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31: bipush 0
      // 32: swap
      // 33: aastore
      // 34: invokespecial com/zelix/h4.O ([Ljava/lang/Object;)V
      // 37: ldc2_w -7740090294292667137
      // 3a: lload 2
      // 3b: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: aload 4
      // 42: aload 0
      // 43: ldc2_w -7522204097036820081
      // 46: lload 2
      // 47: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 4f: istore 7
      // 51: bipush 0
      // 52: istore 8
      // 54: iload 8
      // 56: aload 0
      // 57: ldc2_w -7522204097036820081
      // 5a: lload 2
      // 5b: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: if_icmpge 80
      // 63: aload 4
      // 65: aload 0
      // 66: ldc2_w -7679784349576998751
      // 69: lload 2
      // 6a: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: iload 8
      // 71: aaload
      // 72: invokevirtual com/zelix/x7.B ()I
      // 75: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 78: iinc 8 1
      // 7b: iload 7
      // 7d: ifne 54
      // 80: lload 2
      // 81: lconst_0
      // 82: lcmp
      // 83: ifle 7b
      // 86: return
   }

   int K(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"n">(this, 8896275592716815713L, var2);
   }

   Enumeration x(Object[] param1) {
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
      // 0c: getstatic com/zelix/hb.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 91994403113461
      // 17: lxor
      // 18: dup2
      // 19: bipush 48
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 16
      // 22: lshl
      // 23: bipush 16
      // 25: lushr
      // 26: lstore 5
      // 28: pop2
      // 29: pop2
      // 2a: ldc2_w -7800277629527873541
      // 2d: lload 2
      // 2e: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: aload 0
      // 34: ldc2_w -8127039546922185988
      // 37: lload 2
      // 38: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: arraylength
      // 3e: anewarray 135
      // 41: astore 8
      // 43: istore 7
      // 45: bipush 0
      // 46: istore 9
      // 48: iload 9
      // 4a: aload 0
      // 4b: ldc2_w -8127039546922185988
      // 4e: lload 2
      // 4f: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: arraylength
      // 55: if_icmpge 72
      // 58: aload 8
      // 5a: iload 9
      // 5c: aload 0
      // 5d: ldc2_w -8127039546922185988
      // 60: lload 2
      // 61: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: iload 9
      // 68: aaload
      // 69: aastore
      // 6a: iinc 9 1
      // 6d: iload 7
      // 6f: ifeq 48
      // 72: lload 2
      // 73: lconst_0
      // 74: lcmp
      // 75: iflt 6d
      // 78: new com/zelix/yd
      // 7b: dup
      // 7c: iload 4
      // 7e: i2c
      // 7f: lload 5
      // 81: aload 8
      // 83: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // 86: areturn
   }

   hb(h8 param1, long param2, int param4, String param5, _xx param6, _y4 param7, _y4 param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hb.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 22333150823565
      // 00b: lxor
      // 00c: lstore 9
      // 00e: dup2
      // 00f: ldc2_w 73452130674309
      // 012: lxor
      // 013: lstore 11
      // 015: dup2
      // 016: ldc2_w 1101180079484
      // 019: lxor
      // 01a: lstore 13
      // 01c: dup2
      // 01d: ldc2_w 36476875812288
      // 020: lxor
      // 021: dup2
      // 022: bipush 8
      // 024: lushr
      // 025: lstore 15
      // 027: dup2
      // 028: bipush 56
      // 02a: lshl
      // 02b: bipush 56
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 17
      // 031: pop2
      // 032: pop2
      // 033: ldc2_w 1937076028978637451
      // 036: lload 2
      // 037: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 0
      // 03d: aload 1
      // 03e: iload 4
      // 040: aload 5
      // 042: lload 11
      // 044: aload 6
      // 046: aload 7
      // 048: invokespecial com/zelix/h4.<init> (Lcom/zelix/h8;ILjava/lang/String;JLcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 04b: aload 0
      // 04c: aload 6
      // 04e: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 051: ldc2_w 1868870399697055739
      // 054: lload 2
      // 055: invokedynamic s (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: istore 18
      // 05c: aload 0
      // 05d: aload 0
      // 05e: ldc2_w 1868870399697055739
      // 061: lload 2
      // 062: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: anewarray 135
      // 06a: ldc2_w 1954457040417283797
      // 06d: lload 2
      // 06e: invokedynamic s (Ljava/lang/Object;[Lcom/zelix/x7;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: bipush 0
      // 074: istore 19
      // 076: iload 19
      // 078: aload 0
      // 079: ldc2_w 1868870399697055739
      // 07c: lload 2
      // 07d: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: if_icmpge 12d
      // 085: aload 6
      // 087: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 08a: istore 20
      // 08c: aload 0
      // 08d: lload 15
      // 08f: iload 20
      // 091: iload 17
      // 093: i2b
      // 094: invokevirtual com/zelix/hb.N (JIB)Lcom/zelix/xl;
      // 097: astore 21
      // 099: iload 18
      // 09b: lload 2
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: ifle 12a
      // 0a1: ifeq 128
      // 0a4: aload 21
      // 0a6: instanceof com/zelix/x7
      // 0a9: ifne 0fe
      // 0ac: goto 0b9
      // 0af: ldc2_w 296399367557894391
      // 0b2: lload 2
      // 0b3: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: new com/zelix/_sx
      // 0bc: dup
      // 0bd: new java/lang/StringBuilder
      // 0c0: dup
      // 0c1: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c4: aload 0
      // 0c5: lload 9
      // 0c7: invokevirtual com/zelix/hb.k (J)Ljava/lang/String;
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: sipush 31269
      // 0d0: ldc2_w 8426459937862257790
      // 0d3: lload 2
      // 0d4: lxor
      // 0d5: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: sipush 1329
      // 0e0: ldc2_w 8900371491808605035
      // 0e3: lload 2
      // 0e4: lxor
      // 0e5: invokedynamic f (IJ)Ljava/lang/String; bsm=com/zelix/hb.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ed: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f0: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 0f3: athrow
      // 0f4: ldc2_w 296399367557894391
      // 0f7: lload 2
      // 0f8: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: ldc2_w 1954457040417283797
      // 102: lload 2
      // 103: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: iload 19
      // 10a: aload 21
      // 10c: checkcast com/zelix/x7
      // 10f: aastore
      // 110: aload 8
      // 112: aload 0
      // 113: ldc2_w 1954457040417283797
      // 116: lload 2
      // 117: invokedynamic l (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: iload 19
      // 11e: aaload
      // 11f: aload 0
      // 120: lload 13
      // 122: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 125: iinc 19 1
      // 128: iload 18
      // 12a: ifne 076
      // 12d: return
   }

   public Enumeration Z(Object[] param1) {
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
      // 0c: getstatic com/zelix/hb.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 51579481540340
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 118290175593
      // 1e: lxor
      // 1f: dup2
      // 20: bipush 48
      // 22: lushr
      // 23: l2i
      // 24: istore 6
      // 26: dup2
      // 27: bipush 16
      // 29: lshl
      // 2a: bipush 16
      // 2c: lushr
      // 2d: lstore 7
      // 2f: pop2
      // 30: pop2
      // 31: ldc2_w 5860563104472850750
      // 34: lload 2
      // 35: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: aload 0
      // 3b: ldc2_w 5812642058732180832
      // 3e: lload 2
      // 3f: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: arraylength
      // 45: anewarray 5
      // 48: astore 10
      // 4a: bipush 0
      // 4b: istore 11
      // 4d: istore 9
      // 4f: iload 11
      // 51: aload 0
      // 52: ldc2_w 5812642058732180832
      // 55: lload 2
      // 56: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: arraylength
      // 5c: if_icmpge 7e
      // 5f: aload 10
      // 61: iload 11
      // 63: aload 0
      // 64: ldc2_w 5812642058732180832
      // 67: lload 2
      // 68: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: iload 11
      // 6f: aaload
      // 70: lload 4
      // 72: invokevirtual com/zelix/x7.W (J)Ljava/lang/String;
      // 75: aastore
      // 76: iinc 11 1
      // 79: iload 9
      // 7b: ifne 4f
      // 7e: lload 2
      // 7f: lconst_0
      // 80: lcmp
      // 81: ifle 79
      // 84: new com/zelix/yd
      // 87: dup
      // 88: iload 6
      // 8a: i2c
      // 8b: lload 7
      // 8d: aload 10
      // 8f: invokespecial com/zelix/yd.<init> (CJ[Ljava/lang/Object;)V
      // 92: areturn
   }

   void N(long param1, _8l param3) {
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
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 80221771876344
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 10727274753381
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w -5003033307729260843
      // 13: lload 1
      // 14: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: aload 3
      // 1a: aload 0
      // 1b: getfield com/zelix/hb.c Lcom/zelix/mx;
      // 1e: aload 0
      // 1f: aload 0
      // 20: lload 6
      // 22: invokevirtual com/zelix/_8l.H (Lcom/zelix/xl;Ljava/lang/Object;Ljava/lang/Object;J)Z
      // 25: pop
      // 26: istore 8
      // 28: bipush 0
      // 29: istore 9
      // 2b: iload 9
      // 2d: aload 0
      // 2e: ldc2_w -6478274187609775150
      // 31: lload 1
      // 32: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: arraylength
      // 38: if_icmpge 59
      // 3b: aload 0
      // 3c: ldc2_w -6478274187609775150
      // 3f: lload 1
      // 40: invokedynamic k (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: iload 9
      // 47: aaload
      // 48: lload 4
      // 4a: aload 3
      // 4b: aload 0
      // 4c: aload 0
      // 4d: invokevirtual com/zelix/x7.O (JLcom/zelix/_8l;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 50: pop
      // 51: iinc 9 1
      // 54: iload 8
      // 56: ifeq 2b
      // 59: lload 1
      // 5a: lconst_0
      // 5b: lcmp
      // 5c: iflt 54
      // 5f: return
   }

   x7 B(Object[] var1) {
      int var3 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      int var4 = (Integer)var1[2];
      int var5 = (Integer)var1[3];
      long var6 = ((long)var2 << 48 | (long)var4 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ a;
      return x44.a<"h">(this, -4036396134329974223L, var6)[var3];
   }

   protected void j(Object[] param1) {
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
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/util/Map
      // 18: astore 6
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/_ur
      // 20: astore 5
      // 22: pop
      // 23: lload 3
      // 24: dup2
      // 25: ldc2_w 0
      // 28: lxor
      // 29: lstore 7
      // 2b: pop2
      // 2c: ldc2_w -3106497998795710297
      // 2f: lload 3
      // 30: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 0
      // 36: aload 2
      // 37: lload 7
      // 39: aload 6
      // 3b: aload 5
      // 3d: bipush 4
      // 3e: anewarray 56
      // 41: dup_x1
      // 42: swap
      // 43: bipush 3
      // 44: swap
      // 45: aastore
      // 46: dup_x1
      // 47: swap
      // 48: bipush 2
      // 49: swap
      // 4a: aastore
      // 4b: dup_x2
      // 4c: dup_x2
      // 4d: pop
      // 4e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 51: bipush 1
      // 52: swap
      // 53: aastore
      // 54: dup_x1
      // 55: swap
      // 56: bipush 0
      // 57: swap
      // 58: aastore
      // 59: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 5c: istore 9
      // 5e: aload 2
      // 5f: aload 0
      // 60: ldc2_w -3847618713794790258
      // 63: lload 3
      // 64: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 6c: bipush 0
      // 6d: istore 10
      // 6f: iload 10
      // 71: aload 0
      // 72: ldc2_w -3847618713794790258
      // 75: lload 3
      // 76: invokedynamic i (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: if_icmpge fe
      // 7e: aload 6
      // 80: aload 0
      // 81: ldc2_w -4005198965293740640
      // 84: lload 3
      // 85: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: iload 10
      // 8c: aaload
      // 8d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 92: checkcast com/zelix/xl
      // 95: astore 11
      // 97: iload 9
      // 99: lload 3
      // 9a: lconst_0
      // 9b: lcmp
      // 9c: ifle cc
      // 9f: ifne ca
      // a2: aload 11
      // a4: ifnull d5
      // a7: goto b4
      // aa: ldc2_w -2925077822881758334
      // ad: lload 3
      // ae: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: aload 2
      // b5: aload 11
      // b7: invokevirtual com/zelix/xl.B ()I
      // ba: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // bd: goto ca
      // c0: ldc2_w -2925077822881758334
      // c3: lload 3
      // c4: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: athrow
      // ca: iload 9
      // cc: lload 3
      // cd: lconst_0
      // ce: lcmp
      // cf: ifle fb
      // d2: ifeq f6
      // d5: aload 2
      // d6: aload 0
      // d7: ldc2_w -4005198965293740640
      // da: lload 3
      // db: invokedynamic i (Ljava/lang/Object;JJ)[Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e0: iload 10
      // e2: aaload
      // e3: invokevirtual com/zelix/x7.B ()I
      // e6: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // e9: goto f6
      // ec: ldc2_w -2925077822881758334
      // ef: lload 3
      // f0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f5: athrow
      // f6: iinc 10 1
      // f9: iload 9
      // fb: ifeq 6f
      // fe: return
   }

   static {
      long var0 = a ^ 65890965311398L;
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
      String var6 = "[ä\u0099$\u0003rpJ\u0094-á)\u0000çK\u009féA\rE8û\u0015`jíÏ\u0013\nê\u00advÛg\u0096¨Ê¶QE¶ÛaN:E¼|\u001f¿\u0095*9\u0011\u0084\u001fG\u008f¢@U¿Á\u009bIi°(¥]·Ö\u008e·OÜÙ\u0082\u008b\u0011\u0010r\u0013\u00ad*/\u0017äM*\u0089ü\u0080¬q*ë";
      int var8 = "[ä\u0099$\u0003rpJ\u0094-á)\u0000çK\u009féA\rE8û\u0015`jíÏ\u0013\nê\u00advÛg\u0096¨Ê¶QE¶ÛaN:E¼|\u001f¿\u0095*9\u0011\u0084\u001fG\u008f¢@U¿Á\u009bIi°(¥]·Ö\u008e·OÜÙ\u0082\u008b\u0011\u0010r\u0013\u00ad*/\u0017äM*\u0089ü\u0080¬q*ë"
         .length();
      char var5 = 'P';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = c(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            b = var9;
            d = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24601;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/hb", var10);
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
         throw new RuntimeException("com/zelix/hb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
