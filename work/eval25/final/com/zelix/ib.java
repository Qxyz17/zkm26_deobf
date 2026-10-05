package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ib extends h8 implements _y1, _zv {
   private ic w;
   private int C;
   private hz c;
   private String Q;
   private im[] M;
   private boolean k;
   private int u;
   private mx b;
   private static final long a = ess.a(4283862003649053423L, 1131145987538827103L, MethodHandles.lookup().lookupClass()).a(116841009266075L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   hz s(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"h">(this, -5926503377381072159L, var2);
   }

   public void s(Object[] param1) {
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
      // 0a: lstore 3
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/io/DataOutputStream
      // 11: astore 2
      // 12: pop
      // 13: lload 3
      // 14: dup2
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: dup2
      // 1c: ldc2_w 0
      // 1f: lxor
      // 20: lstore 7
      // 22: pop2
      // 23: aload 0
      // 24: ldc2_w 697158071408964133
      // 27: lload 3
      // 28: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/ic; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d: lload 5
      // 2f: aload 2
      // 30: bipush 2
      // 31: anewarray 359
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
      // 42: ldc2_w 586545879937162798
      // 45: lload 3
      // 46: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: ldc2_w 829389878961519592
      // 4e: lload 3
      // 4f: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: aload 2
      // 55: aload 0
      // 56: ldc2_w 1709300405660137723
      // 59: lload 3
      // 5a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: invokevirtual com/zelix/mx.B ()I
      // 62: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 65: aload 2
      // 66: aload 0
      // 67: ldc2_w 1529247174476887130
      // 6a: lload 3
      // 6b: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 73: istore 9
      // 75: bipush 0
      // 76: istore 10
      // 78: iload 10
      // 7a: aload 0
      // 7b: ldc2_w 1529247174476887130
      // 7e: lload 3
      // 7f: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: if_icmpge ba
      // 87: aload 0
      // 88: ldc2_w 1363122845719596560
      // 8b: lload 3
      // 8c: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: iload 10
      // 93: aaload
      // 94: lload 7
      // 96: aload 2
      // 97: bipush 2
      // 98: anewarray 359
      // 9b: dup_x1
      // 9c: swap
      // 9d: bipush 1
      // 9e: swap
      // 9f: aastore
      // a0: dup_x2
      // a1: dup_x2
      // a2: pop
      // a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a6: bipush 0
      // a7: swap
      // a8: aastore
      // a9: ldc2_w 1529639341212515203
      // ac: lload 3
      // ad: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b2: iinc 10 1
      // b5: iload 9
      // b7: ifne 78
      // ba: lload 3
      // bb: lconst_0
      // bc: lcmp
      // bd: iflt b5
      // c0: return
   }

   public boolean q(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"i">(this, -3927040958692065830L, var2);
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
      // 28: iload 8
      // 2a: ifeq 58
      // 2d: ldc2_w -4864841962068765889
      // 30: lload 6
      // 32: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: aload 1
      // 38: if_acmpne 63
      // 3b: goto 49
      // 3e: ldc2_w -4746828726819354877
      // 41: lload 6
      // 43: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48: athrow
      // 49: aload 0
      // 4a: goto 58
      // 4d: ldc2_w -4746828726819354877
      // 50: lload 6
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 3
      // 59: ldc2_w -4864841962068765889
      // 5c: lload 6
      // 5e: invokedynamic t (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: return
   }

   public String u(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      return x44.a<"m">(this, 1532235936260634044L, var2);
   }

   public void r(Object[] param1) {
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
      // 00a: lstore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/util/HashMap
      // 012: astore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/HashMap
      // 019: astore 2
      // 01a: pop
      // 01b: lload 4
      // 01d: dup2
      // 01e: ldc2_w 58015399186006
      // 021: lxor
      // 022: lstore 6
      // 024: dup2
      // 025: ldc2_w 95955316791289
      // 028: lxor
      // 029: lstore 8
      // 02b: dup2
      // 02c: ldc2_w 139629826441748
      // 02f: lxor
      // 030: lstore 10
      // 032: dup2
      // 033: ldc2_w 0
      // 036: lxor
      // 037: lstore 12
      // 039: pop2
      // 03a: ldc2_w -3106693066594656090
      // 03d: lload 4
      // 03f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: istore 14
      // 046: aload 0
      // 047: iload 14
      // 049: ifne 076
      // 04c: ldc2_w -3537336448293207607
      // 04f: lload 4
      // 051: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: ifnull 10e
      // 059: goto 067
      // 05c: ldc2_w -2896679754330771760
      // 05f: lload 4
      // 061: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: aload 0
      // 068: goto 076
      // 06b: ldc2_w -2896679754330771760
      // 06e: lload 4
      // 070: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: athrow
      // 076: ldc2_w -3049058500183950612
      // 079: lload 4
      // 07b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 083: lload 10
      // 085: invokestatic com/zelix/hz.P (Ljava/lang/String;J)Ljava/lang/String;
      // 088: astore 15
      // 08a: aload 0
      // 08b: ldc2_w -3537336448293207607
      // 08e: lload 4
      // 090: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: lload 8
      // 097: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 09a: astore 16
      // 09c: aload 16
      // 09e: aload 15
      // 0a0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a3: iload 14
      // 0a5: ifne 10f
      // 0a8: ifne 10e
      // 0ab: goto 0b9
      // 0ae: ldc2_w -2896679754330771760
      // 0b1: lload 4
      // 0b3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: ldc2_w -3537336448293207607
      // 0bd: lload 4
      // 0bf: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: lload 8
      // 0c6: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 0c9: lload 6
      // 0cb: dup2_x1
      // 0cc: pop2
      // 0cd: aload 0
      // 0ce: ldc2_w -3999062944036581788
      // 0d1: lload 4
      // 0d3: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: bipush 3
      // 0d9: anewarray 359
      // 0dc: dup_x1
      // 0dd: swap
      // 0de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e1: bipush 2
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 1
      // 0e7: swap
      // 0e8: aastore
      // 0e9: dup_x2
      // 0ea: dup_x2
      // 0eb: pop
      // 0ec: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ef: bipush 0
      // 0f0: swap
      // 0f1: aastore
      // 0f2: ldc2_w -3884157015279428188
      // 0f5: lload 4
      // 0f7: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: astore 17
      // 0fe: aload 0
      // 0ff: ldc2_w -3049058500183950612
      // 102: lload 4
      // 104: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: aload 17
      // 10b: invokevirtual com/zelix/mx.v (Ljava/lang/String;)V
      // 10e: bipush 0
      // 10f: istore 15
      // 111: iload 15
      // 113: aload 0
      // 114: ldc2_w -2940906732553161139
      // 117: lload 4
      // 119: invokedynamic h (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: if_icmpge 15c
      // 121: aload 0
      // 122: ldc2_w -3387270028838712313
      // 125: lload 4
      // 127: invokedynamic h (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12c: iload 15
      // 12e: aaload
      // 12f: lload 12
      // 131: aload 3
      // 132: aload 2
      // 133: bipush 3
      // 134: anewarray 359
      // 137: dup_x1
      // 138: swap
      // 139: bipush 2
      // 13a: swap
      // 13b: aastore
      // 13c: dup_x1
      // 13d: swap
      // 13e: bipush 1
      // 13f: swap
      // 140: aastore
      // 141: dup_x2
      // 142: dup_x2
      // 143: pop
      // 144: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 147: bipush 0
      // 148: swap
      // 149: aastore
      // 14a: ldc2_w -3676224817344128076
      // 14d: lload 4
      // 14f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: iinc 15 1
      // 157: iload 14
      // 159: ifeq 111
      // 15c: lload 4
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 157
      // 163: return
   }

   public void p(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w 864055557601181625
      // 18: lload 2
      // 19: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: bipush 0
      // 1f: istore 7
      // 21: istore 6
      // 23: iload 7
      // 25: aload 0
      // 26: ldc2_w 590180486361180498
      // 29: lload 2
      // 2a: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: if_icmpge 5f
      // 32: aload 0
      // 33: ldc2_w 1144632514058130200
      // 36: lload 2
      // 37: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: iload 7
      // 3e: aaload
      // 3f: lload 4
      // 41: bipush 1
      // 42: anewarray 359
      // 45: dup_x2
      // 46: dup_x2
      // 47: pop
      // 48: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b: bipush 0
      // 4c: swap
      // 4d: aastore
      // 4e: ldc2_w 1680682304139466735
      // 51: lload 2
      // 52: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: iinc 7 1
      // 5a: iload 6
      // 5c: ifeq 23
      // 5f: lload 2
      // 60: lconst_0
      // 61: lcmp
      // 62: iflt 5a
      // 65: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public int i(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 0L;
      long var6 = var2 ^ 0L;
      int var10000 = x44.a<"w">(7519203345081130013L, var2);
      int var9 = x44.a<"o">(x44.a<"k">(this, 8575038194595318921L, var2), new Object[]{var4}, 8338553058888398342L, var2);
      var9 += 4;
      byte var8 = (byte)var10000;
      int var10 = 0;

      label30:
      while (true) {
         if (var10 < x44.a<"k">(this, 7751979668157532918L, var2)) {
            var10000 = var9 + x44.a<"o">(x44.a<"k">(this, 7802103027626963132L, var2)[var10], new Object[]{var6}, 8413365796663558059L, var2);
            if (var2 >= 0L) {
               if (var8 != 0) {
                  break;
               }

               var9 = var10000;
               var10++;
               var10000 = var8;
            }

            if (var10000 == 0) {
               continue;
            }
         }

         while (var2 < 0L) {
            if (var8 == 0) {
               continue label30;
            }
         }

         var10000 = var9;
         break;
      }

      return var10000;
   }

   public void l(Object[] param1) {
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
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/ei
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 2
      // 022: pop
      // 023: getstatic com/zelix/ib.a J
      // 026: lload 3
      // 027: lxor
      // 028: lstore 3
      // 029: lload 3
      // 02a: dup2
      // 02b: ldc2_w 60590345830350
      // 02e: lxor
      // 02f: lstore 7
      // 031: dup2
      // 032: ldc2_w 24180835858458
      // 035: lxor
      // 036: lstore 9
      // 038: dup2
      // 039: ldc2_w 793198081126
      // 03c: lxor
      // 03d: dup2
      // 03e: bipush 32
      // 040: lushr
      // 041: l2i
      // 042: istore 11
      // 044: dup2
      // 045: bipush 32
      // 047: lshl
      // 048: bipush 48
      // 04a: lushr
      // 04b: l2i
      // 04c: istore 12
      // 04e: dup2
      // 04f: bipush 48
      // 051: lshl
      // 052: bipush 48
      // 054: lushr
      // 055: l2i
      // 056: istore 13
      // 058: pop2
      // 059: dup2
      // 05a: ldc2_w 78578675257780
      // 05d: lxor
      // 05e: lstore 14
      // 060: dup2
      // 061: ldc2_w 25186013149362
      // 064: lxor
      // 065: lstore 16
      // 067: dup2
      // 068: ldc2_w 22872520671222
      // 06b: lxor
      // 06c: lstore 18
      // 06e: dup2
      // 06f: ldc2_w 137656044940243
      // 072: lxor
      // 073: lstore 20
      // 075: pop2
      // 076: ldc2_w 4994760509346246932
      // 079: lload 3
      // 07a: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: new com/zelix/wp
      // 082: dup
      // 083: bipush 0
      // 084: invokespecial com/zelix/wp.<init> (I)V
      // 087: astore 23
      // 089: istore 22
      // 08b: aload 0
      // 08c: ldc2_w 4908266460614880094
      // 08f: lload 3
      // 090: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 098: lload 18
      // 09a: aload 23
      // 09c: invokestatic com/zelix/hz.w (Ljava/lang/String;JLcom/zelix/wp;)Ljava/lang/String;
      // 09f: astore 24
      // 0a1: iload 22
      // 0a3: ifne 165
      // 0a6: aload 24
      // 0a8: ifnull 154
      // 0ab: goto 0b8
      // 0ae: ldc2_w 5079732973071499106
      // 0b1: lload 3
      // 0b2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: lload 14
      // 0bb: invokevirtual com/zelix/ib.d (J)Lcom/zelix/hz;
      // 0be: astore 25
      // 0c0: aload 25
      // 0c2: iload 22
      // 0c4: lload 3
      // 0c5: lconst_0
      // 0c6: lcmp
      // 0c7: ifle 0f2
      // 0ca: ifne 0f1
      // 0cd: lload 16
      // 0cf: invokevirtual com/zelix/hz.K (J)Z
      // 0d2: ifeq 101
      // 0d5: goto 0e2
      // 0d8: ldc2_w 5079732973071499106
      // 0db: lload 3
      // 0dc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 25
      // 0e4: goto 0f1
      // 0e7: ldc2_w 5079732973071499106
      // 0ea: lload 3
      // 0eb: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: bipush 0
      // 0f2: anewarray 359
      // 0f5: ldc2_w 6779406627069681982
      // 0f8: lload 3
      // 0f9: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: goto 102
      // 101: aconst_null
      // 102: astore 26
      // 104: aload 0
      // 105: aload 6
      // 107: aload 24
      // 109: aload 26
      // 10b: new java/lang/StringBuilder
      // 10e: dup
      // 10f: invokespecial java/lang/StringBuilder.<init> ()V
      // 112: sipush 16156
      // 115: ldc2_w 640733200596366987
      // 118: lload 3
      // 119: lxor
      // 11a: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ib.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 122: aload 0
      // 123: lload 9
      // 125: invokevirtual com/zelix/ib.o (J)Ljava/lang/String;
      // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12b: sipush 356
      // 12e: ldc2_w 5376499984515287287
      // 131: lload 3
      // 132: lxor
      // 133: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ib.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: iload 11
      // 140: aload 5
      // 142: iload 12
      // 144: i2s
      // 145: iload 13
      // 147: i2s
      // 148: invokevirtual com/zelix/_ug.h (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILcom/zelix/ei;SS)Lcom/zelix/hz;
      // 14b: ldc2_w 6871050575438319739
      // 14e: lload 3
      // 14f: invokedynamic u (Ljava/lang/Object;Lcom/zelix/hz;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: aload 0
      // 155: aload 23
      // 157: lload 20
      // 159: invokevirtual com/zelix/wp.C (J)I
      // 15c: ldc2_w 6427272552536219606
      // 15f: lload 3
      // 160: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: bipush 0
      // 166: istore 25
      // 168: iload 25
      // 16a: aload 0
      // 16b: ldc2_w 5088495615622686719
      // 16e: lload 3
      // 16f: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: if_icmpge 1c7
      // 177: aload 0
      // 178: ldc2_w 4706196735497756085
      // 17b: lload 3
      // 17c: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: iload 25
      // 183: aaload
      // 184: aload 0
      // 185: ldc2_w 6871050575438319739
      // 188: lload 3
      // 189: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: aload 6
      // 190: aload 5
      // 192: aload 2
      // 193: lload 7
      // 195: bipush 5
      // 196: anewarray 359
      // 199: dup_x2
      // 19a: dup_x2
      // 19b: pop
      // 19c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19f: bipush 4
      // 1a0: swap
      // 1a1: aastore
      // 1a2: dup_x1
      // 1a3: swap
      // 1a4: bipush 3
      // 1a5: swap
      // 1a6: aastore
      // 1a7: dup_x1
      // 1a8: swap
      // 1a9: bipush 2
      // 1aa: swap
      // 1ab: aastore
      // 1ac: dup_x1
      // 1ad: swap
      // 1ae: bipush 1
      // 1af: swap
      // 1b0: aastore
      // 1b1: dup_x1
      // 1b2: swap
      // 1b3: bipush 0
      // 1b4: swap
      // 1b5: aastore
      // 1b6: ldc2_w 6599839625829224815
      // 1b9: lload 3
      // 1ba: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: iinc 25 1
      // 1c2: iload 22
      // 1c4: ifeq 168
      // 1c7: lload 3
      // 1c8: lconst_0
      // 1c9: lcmp
      // 1ca: iflt 1c2
      // 1cd: return
   }

   boolean o(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 27295843108831L;
      return x44.a<"i">(x44.a<"m">(this, -4078352219438220049L, var2), new Object[]{var4}, -2534082017545404578L, var2);
   }

   void n(Object[] var1) {
      long var2 = (Long)var1[0];
      w var4 = (w)var1[1];
      var2 = a ^ var2;
      long var5 = var2 ^ 57344643388967L;
      x44.a<"l">(x44.a<"h">(this, 4880695929402292274L, var2), new Object[]{var5, var4}, 6701970053593534790L, var2);
   }

   public void E(Object[] param1) {
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
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/Set
      // 016: astore 4
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast java/lang/Long
      // 01e: invokevirtual java/lang/Long.longValue ()J
      // 021: lstore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/Set
      // 029: astore 3
      // 02a: pop
      // 02b: getstatic com/zelix/ib.a J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 98062384760015
      // 039: lxor
      // 03a: lstore 8
      // 03c: pop2
      // 03d: ldc2_w 4087281226485140732
      // 040: lload 6
      // 042: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: istore 10
      // 049: aload 0
      // 04a: ldc2_w 2500312250099756435
      // 04d: lload 6
      // 04f: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: iload 10
      // 056: ifne 083
      // 059: ifnull 0c0
      // 05c: goto 06a
      // 05f: ldc2_w 4293850876121809546
      // 062: lload 6
      // 064: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: athrow
      // 06a: aload 0
      // 06b: ldc2_w 2500312250099756435
      // 06e: lload 6
      // 070: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: goto 083
      // 078: ldc2_w 4293850876121809546
      // 07b: lload 6
      // 07d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: invokevirtual com/zelix/hz.b ()Z
      // 086: iload 10
      // 088: ifne 0c1
      // 08b: ifeq 0c0
      // 08e: goto 09c
      // 091: ldc2_w 4293850876121809546
      // 094: lload 6
      // 096: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 5
      // 09e: aload 0
      // 09f: ldc2_w 2500312250099756435
      // 0a2: lload 6
      // 0a4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: checkcast com/zelix/hy
      // 0ac: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0b1: pop
      // 0b2: goto 0c0
      // 0b5: ldc2_w 4293850876121809546
      // 0b8: lload 6
      // 0ba: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: bipush 0
      // 0c1: istore 11
      // 0c3: iload 11
      // 0c5: aload 0
      // 0c6: ldc2_w 4284598265194535447
      // 0c9: lload 6
      // 0cb: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: if_icmpge 14e
      // 0d3: aload 0
      // 0d4: ldc2_w 4370673454522572893
      // 0d7: lload 6
      // 0d9: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: iload 11
      // 0e0: aaload
      // 0e1: aload 0
      // 0e2: ldc2_w 2500312250099756435
      // 0e5: lload 6
      // 0e7: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: aload 5
      // 0ee: aload 2
      // 0ef: aload 4
      // 0f1: lload 8
      // 0f3: aload 3
      // 0f4: bipush 6
      // 0f6: anewarray 359
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: bipush 5
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 4
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: bipush 3
      // 10a: swap
      // 10b: aastore
      // 10c: dup_x1
      // 10d: swap
      // 10e: bipush 2
      // 10f: swap
      // 110: aastore
      // 111: dup_x1
      // 112: swap
      // 113: bipush 1
      // 114: swap
      // 115: aastore
      // 116: dup_x1
      // 117: swap
      // 118: bipush 0
      // 119: swap
      // 11a: aastore
      // 11b: ldc2_w 4233961424530380801
      // 11e: lload 6
      // 120: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: iinc 11 1
      // 128: iload 10
      // 12a: lload 6
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 136
      // 131: ifne 181
      // 134: iload 10
      // 136: ifeq 0c3
      // 139: lload 6
      // 13b: lconst_0
      // 13c: lcmp
      // 13d: iflt 128
      // 140: goto 14e
      // 143: ldc2_w 4293850876121809546
      // 146: lload 6
      // 148: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 0
      // 14f: ldc2_w 2873794410929888360
      // 152: lload 6
      // 154: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/ic; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: aload 5
      // 15b: aload 2
      // 15c: aload 4
      // 15e: aload 3
      // 15f: bipush 4
      // 160: anewarray 359
      // 163: dup_x1
      // 164: swap
      // 165: bipush 3
      // 166: swap
      // 167: aastore
      // 168: dup_x1
      // 169: swap
      // 16a: bipush 2
      // 16b: swap
      // 16c: aastore
      // 16d: dup_x1
      // 16e: swap
      // 16f: bipush 1
      // 170: swap
      // 171: aastore
      // 172: dup_x1
      // 173: swap
      // 174: bipush 0
      // 175: swap
      // 176: aastore
      // 177: ldc2_w 4079854391332270635
      // 17a: lload 6
      // 17c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: return
   }

   public void B(Object[] param1) {
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
      // 00e: checkcast java/util/Set
      // 011: astore 2
      // 012: pop
      // 013: lload 3
      // 014: dup2
      // 015: ldc2_w 0
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 0
      // 01f: lxor
      // 020: lstore 7
      // 022: pop2
      // 023: ldc2_w -5738478356681882600
      // 026: lload 3
      // 027: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: istore 9
      // 02e: aload 0
      // 02f: iload 9
      // 031: ifne 05b
      // 034: ldc2_w -6336752043697857451
      // 037: lload 3
      // 038: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: ifeq 110
      // 040: goto 04d
      // 043: ldc2_w -5516075738395243922
      // 046: lload 3
      // 047: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: athrow
      // 04d: aload 0
      // 04e: goto 05b
      // 051: ldc2_w -5516075738395243922
      // 054: lload 3
      // 055: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: athrow
      // 05b: ldc2_w -6172534622573795977
      // 05e: lload 3
      // 05f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 064: ifnull 085
      // 067: aload 2
      // 068: aload 0
      // 069: ldc2_w -6172534622573795977
      // 06c: lload 3
      // 06d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 077: pop
      // 078: goto 085
      // 07b: ldc2_w -5516075738395243922
      // 07e: lload 3
      // 07f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 084: athrow
      // 085: bipush 0
      // 086: istore 10
      // 088: iload 10
      // 08a: aload 0
      // 08b: ldc2_w -5507383771040820493
      // 08e: lload 3
      // 08f: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: if_icmpge 0e8
      // 097: aload 0
      // 098: ldc2_w -5457267008775345991
      // 09b: lload 3
      // 09c: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: iload 10
      // 0a3: aaload
      // 0a4: lload 5
      // 0a6: aload 2
      // 0a7: bipush 2
      // 0a8: anewarray 359
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 1
      // 0ae: swap
      // 0af: aastore
      // 0b0: dup_x2
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: bipush 0
      // 0b7: swap
      // 0b8: aastore
      // 0b9: ldc2_w -6137789122078860601
      // 0bc: lload 3
      // 0bd: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: iinc 10 1
      // 0c5: iload 9
      // 0c7: lload 3
      // 0c8: lconst_0
      // 0c9: lcmp
      // 0ca: iflt 0d2
      // 0cd: ifne 110
      // 0d0: iload 9
      // 0d2: ifeq 088
      // 0d5: lload 3
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: ifle 0c5
      // 0db: goto 0e8
      // 0de: ldc2_w -5516075738395243922
      // 0e1: lload 3
      // 0e2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: aload 0
      // 0e9: ldc2_w -5835011442129365876
      // 0ec: lload 3
      // 0ed: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/ic; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: lload 7
      // 0f4: aload 2
      // 0f5: bipush 2
      // 0f6: anewarray 359
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: bipush 1
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x2
      // 0ff: dup_x2
      // 100: pop
      // 101: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 104: bipush 0
      // 105: swap
      // 106: aastore
      // 107: ldc2_w -6036473060182004330
      // 10a: lload 3
      // 10b: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: return
   }

   boolean w(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 131600188606678L;
      return x44.a<"j">(x44.a<"n">(this, -2961756743232950932L, var2), new Object[]{var4}, -3335309352313544011L, var2);
   }

   public void N(Object[] param1) {
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
      // 0c: lload 2
      // 0d: dup2
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: pop2
      // 15: ldc2_w -7119091599166165671
      // 18: lload 2
      // 19: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: bipush 0
      // 1f: istore 7
      // 21: istore 6
      // 23: iload 7
      // 25: aload 0
      // 26: ldc2_w -8968487202279169301
      // 29: lload 2
      // 2a: invokedynamic n (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: if_icmpge 5f
      // 32: aload 0
      // 33: ldc2_w -8909321440795060063
      // 36: lload 2
      // 37: invokedynamic n (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: iload 7
      // 3e: aaload
      // 3f: lload 4
      // 41: bipush 1
      // 42: anewarray 359
      // 45: dup_x2
      // 46: dup_x2
      // 47: pop
      // 48: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b: bipush 0
      // 4c: swap
      // 4d: aastore
      // 4e: ldc2_w -9164950199088648928
      // 51: lload 2
      // 52: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: iinc 7 1
      // 5a: iload 6
      // 5c: ifne 23
      // 5f: lload 2
      // 60: lconst_0
      // 61: lcmp
      // 62: iflt 5a
      // 65: return
   }

   boolean z(Object[] var1) {
      HashSet var5 = (HashSet)var1[0];
      long var2 = (Long)var1[1];
      w var4 = (w)var1[2];
      var2 = a ^ var2;
      long var6 = var2 ^ 27511742135303L;
      return x44.a<"i">(x44.a<"m">(this, 7966546151948211463L, var2), new Object[]{var6, var5, var4}, 7695034430030841486L, var2);
   }

   public void J(Object[] param1) {
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
      // 012: lstore 3
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Map
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 2
      // 022: pop
      // 023: lload 3
      // 024: dup2
      // 025: ldc2_w 0
      // 028: lxor
      // 029: lstore 7
      // 02b: dup2
      // 02c: ldc2_w 0
      // 02f: lxor
      // 030: lstore 9
      // 032: pop2
      // 033: aload 0
      // 034: ldc2_w -5818970605319809865
      // 037: lload 3
      // 038: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/ic; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 6
      // 03f: lload 7
      // 041: aload 5
      // 043: aload 2
      // 044: bipush 4
      // 045: anewarray 359
      // 048: dup_x1
      // 049: swap
      // 04a: bipush 3
      // 04b: swap
      // 04c: aastore
      // 04d: dup_x1
      // 04e: swap
      // 04f: bipush 2
      // 050: swap
      // 051: aastore
      // 052: dup_x2
      // 053: dup_x2
      // 054: pop
      // 055: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 058: bipush 1
      // 059: swap
      // 05a: aastore
      // 05b: dup_x1
      // 05c: swap
      // 05d: bipush 0
      // 05e: swap
      // 05f: aastore
      // 060: ldc2_w -5400232421030091354
      // 063: lload 3
      // 064: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 069: ldc2_w -5735359121590942685
      // 06c: lload 3
      // 06d: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: aload 5
      // 074: aload 0
      // 075: ldc2_w -5680526583252378007
      // 078: lload 3
      // 079: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 083: checkcast com/zelix/mx
      // 086: astore 12
      // 088: istore 11
      // 08a: iload 11
      // 08c: ifne 0b8
      // 08f: aload 12
      // 091: ifnull 0c3
      // 094: goto 0a1
      // 097: ldc2_w -5527663566678783403
      // 09a: lload 3
      // 09b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: aload 6
      // 0a3: aload 12
      // 0a5: invokevirtual com/zelix/mx.B ()I
      // 0a8: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0ab: goto 0b8
      // 0ae: ldc2_w -5527663566678783403
      // 0b1: lload 3
      // 0b2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: iload 11
      // 0ba: lload 3
      // 0bb: lconst_0
      // 0bc: lcmp
      // 0bd: ifle 0f2
      // 0c0: ifeq 0e2
      // 0c3: aload 6
      // 0c5: aload 0
      // 0c6: ldc2_w -5680526583252378007
      // 0c9: lload 3
      // 0ca: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: invokevirtual com/zelix/mx.B ()I
      // 0d2: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0d5: goto 0e2
      // 0d8: ldc2_w -5527663566678783403
      // 0db: lload 3
      // 0dc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 6
      // 0e4: aload 0
      // 0e5: ldc2_w -5500325948921261368
      // 0e8: lload 3
      // 0e9: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ee: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 0f1: bipush 0
      // 0f2: istore 13
      // 0f4: iload 13
      // 0f6: aload 0
      // 0f7: ldc2_w -5500325948921261368
      // 0fa: lload 3
      // 0fb: invokedynamic m (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: if_icmpge 144
      // 103: aload 0
      // 104: ldc2_w -5442360990906734462
      // 107: lload 3
      // 108: invokedynamic m (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: iload 13
      // 10f: aaload
      // 110: aload 6
      // 112: lload 9
      // 114: aload 5
      // 116: aload 2
      // 117: bipush 4
      // 118: anewarray 359
      // 11b: dup_x1
      // 11c: swap
      // 11d: bipush 3
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 2
      // 123: swap
      // 124: aastore
      // 125: dup_x2
      // 126: dup_x2
      // 127: pop
      // 128: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12b: bipush 1
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 0
      // 131: swap
      // 132: aastore
      // 133: ldc2_w -5558132278158434777
      // 136: lload 3
      // 137: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: iinc 13 1
      // 13f: iload 11
      // 141: ifeq 0f4
      // 144: lload 3
      // 145: lconst_0
      // 146: lcmp
      // 147: iflt 13f
      // 14a: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      long var6 = var1 ^ 0L;
      long var8 = var1 ^ 0L;
      boolean var10000 = x44.a<"w">(-6348162585463318644L, var1);
      x44.a<"k">(this, -4909774779930962785L, var1).O(var4, var3, this, this.x());
      boolean var10 = var10000;
      int var11 = 0;

      label41:
      while (var11 < x44.a<"k">(this, -5090012868503381954L, var1)) {
         try {
            x44.a<"o">(x44.a<"k">(this, -4715665244422102412L, var1)[var11], var8, var3, -4927400832060802561L, var1);
            var11++;
         } catch (gj var13) {
            boolean var10001 = false;
            throw x44.a<"w">(var13, -5062180434022956893L, var1);
         }

         while (true) {
            try {
               var10000 = var10;
               if (var1 >= 0L) {
                  if (!var10) {
                     return;
                  }

                  var10000 = var10;
               }

               if (var10000) {
                  break;
               }
            } catch (gj var12) {
               boolean var16 = false;
               throw x44.a<"w">(var12, -5062180434022956893L, var1);
            }

            if (var1 >= 0L) {
               break label41;
            }
         }
      }

      x44.a<"o">(x44.a<"k">(this, -6500783462962291135L, var1), var6, var3, -6523279381848335553L, var1);
   }

   ib(by param1, _xx param2, _y4 param3, long param4, _y4 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ib.a J
      // 003: lload 4
      // 005: lxor
      // 006: lstore 4
      // 008: lload 4
      // 00a: dup2
      // 00b: ldc2_w 81589972424932
      // 00e: lxor
      // 00f: lstore 7
      // 011: dup2
      // 012: ldc2_w 124444279613613
      // 015: lxor
      // 016: lstore 9
      // 018: dup2
      // 019: ldc2_w 111569065792842
      // 01c: lxor
      // 01d: lstore 11
      // 01f: dup2
      // 020: ldc2_w 102117290850023
      // 023: lxor
      // 024: lstore 13
      // 026: dup2
      // 027: ldc2_w 58385948226933
      // 02a: lxor
      // 02b: lstore 15
      // 02d: dup2
      // 02e: ldc2_w 76228132599286
      // 031: lxor
      // 032: dup2
      // 033: bipush 8
      // 035: lushr
      // 036: lstore 17
      // 038: dup2
      // 039: bipush 56
      // 03b: lshl
      // 03c: bipush 56
      // 03e: lushr
      // 03f: l2i
      // 040: istore 19
      // 042: pop2
      // 043: dup2
      // 044: ldc2_w 53474326449779
      // 047: lxor
      // 048: lstore 20
      // 04a: dup2
      // 04b: ldc2_w 53474326449779
      // 04e: lxor
      // 04f: lstore 22
      // 051: dup2
      // 052: ldc2_w 115127676271154
      // 055: lxor
      // 056: lstore 24
      // 058: dup2
      // 059: ldc2_w 68973361496059
      // 05c: lxor
      // 05d: lstore 26
      // 05f: pop2
      // 060: ldc2_w 4816463575642567357
      // 063: lload 4
      // 065: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: aload 0
      // 06b: aload 1
      // 06c: invokespecial com/zelix/h8.<init> (Lcom/zelix/h8;)V
      // 06f: aload 0
      // 070: bipush 1
      // 071: ldc2_w 5184603798932583337
      // 074: lload 4
      // 076: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: istore 28
      // 07d: aload 0
      // 07e: new com/zelix/ic
      // 081: dup
      // 082: lload 15
      // 084: aload 0
      // 085: aload 2
      // 086: aload 3
      // 087: aload 6
      // 089: invokespecial com/zelix/ic.<init> (JLcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;Lcom/zelix/_y4;)V
      // 08c: ldc2_w 4682015435043306352
      // 08f: lload 4
      // 091: invokedynamic u (Ljava/lang/Object;Lcom/zelix/ic;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: aload 0
      // 097: ldc2_w 4682015435043306352
      // 09a: lload 4
      // 09c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/ic; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: lload 22
      // 0a3: bipush 1
      // 0a4: anewarray 359
      // 0a7: dup_x2
      // 0a8: dup_x2
      // 0a9: pop
      // 0aa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w 4634005080082656948
      // 0b3: lload 4
      // 0b5: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: iload 28
      // 0bc: ifeq 11b
      // 0bf: ifne 117
      // 0c2: goto 0d0
      // 0c5: ldc2_w 6669490672109741458
      // 0c8: lload 4
      // 0ca: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: bipush 0
      // 0d2: ldc2_w 5184603798932583337
      // 0d5: lload 4
      // 0d7: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: aload 0
      // 0dd: aload 0
      // 0de: ldc2_w 4682015435043306352
      // 0e1: lload 4
      // 0e3: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/ic; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: lload 24
      // 0ea: bipush 1
      // 0eb: anewarray 359
      // 0ee: dup_x2
      // 0ef: dup_x2
      // 0f0: pop
      // 0f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f4: bipush 0
      // 0f5: swap
      // 0f6: aastore
      // 0f7: ldc2_w 5043996114107196884
      // 0fa: lload 4
      // 0fc: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: ldc2_w 4840455177902908371
      // 104: lload 4
      // 106: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: return
      // 10c: ldc2_w 6669490672109741458
      // 10f: lload 4
      // 111: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: aload 2
      // 118: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 11b: istore 29
      // 11d: aload 0
      // 11e: lload 17
      // 120: iload 29
      // 122: iload 19
      // 124: i2b
      // 125: invokevirtual com/zelix/ib.N (JIB)Lcom/zelix/xl;
      // 128: astore 30
      // 12a: lload 4
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 25f
      // 131: iload 28
      // 133: ifeq 25f
      // 136: aload 30
      // 138: ifnull 245
      // 13b: goto 149
      // 13e: ldc2_w 6669490672109741458
      // 141: lload 4
      // 143: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 30
      // 14b: instanceof com/zelix/mx
      // 14e: ifeq 245
      // 151: goto 15f
      // 154: ldc2_w 6669490672109741458
      // 157: lload 4
      // 159: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15e: athrow
      // 15f: aload 0
      // 160: aload 30
      // 162: checkcast com/zelix/mx
      // 165: ldc2_w 6840323522540859822
      // 168: lload 4
      // 16a: invokedynamic u (Ljava/lang/Object;Lcom/zelix/mx;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: aload 0
      // 170: ldc2_w 6840323522540859822
      // 173: lload 4
      // 175: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: invokevirtual com/zelix/mx.u ()Ljava/lang/String;
      // 17d: astore 31
      // 17f: iload 28
      // 181: lload 4
      // 183: lconst_0
      // 184: lcmp
      // 185: iflt 192
      // 188: ifeq 238
      // 18b: aload 31
      // 18d: ldc "L"
      // 18f: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 192: ifeq 1ee
      // 195: goto 1a3
      // 198: ldc2_w 6669490672109741458
      // 19b: lload 4
      // 19d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: athrow
      // 1a3: lload 4
      // 1a5: lconst_0
      // 1a6: lcmp
      // 1a7: iflt 22a
      // 1aa: aload 31
      // 1ac: ldc ";"
      // 1ae: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1b1: ifeq 1ee
      // 1b4: goto 1c2
      // 1b7: ldc2_w 6669490672109741458
      // 1ba: lload 4
      // 1bc: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: athrow
      // 1c2: aload 3
      // 1c3: aload 0
      // 1c4: ldc2_w 6840323522540859822
      // 1c7: lload 4
      // 1c9: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/mx; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ce: aload 0
      // 1cf: lload 11
      // 1d1: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 1d4: iload 28
      // 1d6: lload 4
      // 1d8: lconst_0
      // 1d9: lcmp
      // 1da: iflt 23b
      // 1dd: ifne 239
      // 1e0: goto 1ee
      // 1e3: ldc2_w 6669490672109741458
      // 1e6: lload 4
      // 1e8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ed: athrow
      // 1ee: aload 0
      // 1ef: bipush 0
      // 1f0: ldc2_w 5184603798932583337
      // 1f3: lload 4
      // 1f5: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: aload 0
      // 1fb: new java/lang/StringBuilder
      // 1fe: dup
      // 1ff: invokespecial java/lang/StringBuilder.<init> ()V
      // 202: sipush 2969
      // 205: ldc2_w 7974728738085886204
      // 208: lload 4
      // 20a: lxor
      // 20b: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ib.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 213: aload 31
      // 215: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 218: ldc "'"
      // 21a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 220: ldc2_w 4840455177902908371
      // 223: lload 4
      // 225: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: goto 238
      // 22d: ldc2_w 6669490672109741458
      // 230: lload 4
      // 232: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 237: athrow
      // 238: return
      // 239: iload 28
      // 23b: lload 4
      // 23d: lconst_0
      // 23e: lcmp
      // 23f: ifle 342
      // 242: ifne 319
      // 245: aload 0
      // 246: bipush 0
      // 247: ldc2_w 5184603798932583337
      // 24a: lload 4
      // 24c: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: goto 25f
      // 254: ldc2_w 6669490672109741458
      // 257: lload 4
      // 259: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: athrow
      // 25f: aload 0
      // 260: new java/lang/StringBuilder
      // 263: dup
      // 264: invokespecial java/lang/StringBuilder.<init> ()V
      // 267: sipush 7893
      // 26a: lload 4
      // 26c: lconst_0
      // 26d: lcmp
      // 26e: ifle 286
      // 271: ldc2_w 2416993145827610033
      // 274: lload 4
      // 276: lxor
      // 277: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ib.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: iload 28
      // 27e: ifeq 303
      // 281: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 284: iload 29
      // 286: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 289: aload 30
      // 28b: ifnull 306
      // 28e: goto 29c
      // 291: ldc2_w 6669490672109741458
      // 294: lload 4
      // 296: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29b: athrow
      // 29c: new java/lang/StringBuilder
      // 29f: dup
      // 2a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a3: sipush 1892
      // 2a6: ldc2_w 3683476556832920582
      // 2a9: lload 4
      // 2ab: lxor
      // 2ac: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ib.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b4: aload 30
      // 2b6: lload 13
      // 2b8: invokevirtual com/zelix/xl.m (J)Lcom/zelix/w5;
      // 2bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2be: sipush 11524
      // 2c1: ldc2_w 2184964805409341026
      // 2c4: lload 4
      // 2c6: lxor
      // 2c7: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/ib.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cf: aload 30
      // 2d1: lload 9
      // 2d3: bipush 1
      // 2d4: anewarray 359
      // 2d7: dup_x2
      // 2d8: dup_x2
      // 2d9: pop
      // 2da: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2dd: bipush 0
      // 2de: swap
      // 2df: aastore
      // 2e0: ldc2_w 5017831076519624375
      // 2e3: lload 4
      // 2e5: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ed: ldc "\""
      // 2ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f5: goto 303
      // 2f8: ldc2_w 6669490672109741458
      // 2fb: lload 4
      // 2fd: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: athrow
      // 303: goto 308
      // 306: ldc ""
      // 308: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 30b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 30e: ldc2_w 4840455177902908371
      // 311: lload 4
      // 313: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 318: return
      // 319: aload 0
      // 31a: aload 2
      // 31b: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 31e: ldc2_w 6660238474239589647
      // 321: lload 4
      // 323: invokedynamic u (Ljava/lang/Object;IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 328: aload 0
      // 329: aload 0
      // 32a: ldc2_w 6660238474239589647
      // 32d: lload 4
      // 32f: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 334: anewarray 450
      // 337: ldc2_w 6611240996826007365
      // 33a: lload 4
      // 33c: invokedynamic u (Ljava/lang/Object;[Lcom/zelix/im;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: bipush 0
      // 342: istore 31
      // 344: iload 31
      // 346: aload 0
      // 347: ldc2_w 6660238474239589647
      // 34a: lload 4
      // 34c: invokedynamic j (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: if_icmpge 404
      // 354: aload 0
      // 355: ldc2_w 6611240996826007365
      // 358: lload 4
      // 35a: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: iload 31
      // 361: new com/zelix/im
      // 364: dup
      // 365: aload 0
      // 366: aload 2
      // 367: aload 3
      // 368: lload 26
      // 36a: invokespecial com/zelix/im.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;J)V
      // 36d: aastore
      // 36e: iload 28
      // 370: lload 4
      // 372: lconst_0
      // 373: lcmp
      // 374: ifle 401
      // 377: ifeq 3ff
      // 37a: aload 0
      // 37b: ldc2_w 6611240996826007365
      // 37e: lload 4
      // 380: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 385: iload 31
      // 387: aaload
      // 388: lload 20
      // 38a: bipush 1
      // 38b: anewarray 359
      // 38e: dup_x2
      // 38f: dup_x2
      // 390: pop
      // 391: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 394: bipush 0
      // 395: swap
      // 396: aastore
      // 397: ldc2_w 6365416545671008127
      // 39a: lload 4
      // 39c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a1: ifne 3fc
      // 3a4: goto 3b2
      // 3a7: ldc2_w 6669490672109741458
      // 3aa: lload 4
      // 3ac: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: athrow
      // 3b2: aload 0
      // 3b3: bipush 0
      // 3b4: ldc2_w 5184603798932583337
      // 3b7: lload 4
      // 3b9: invokedynamic u (Ljava/lang/Object;ZJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3be: aload 0
      // 3bf: aload 0
      // 3c0: ldc2_w 6611240996826007365
      // 3c3: lload 4
      // 3c5: invokedynamic j (Ljava/lang/Object;JJ)[Lcom/zelix/im; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: iload 31
      // 3cc: aaload
      // 3cd: lload 7
      // 3cf: bipush 1
      // 3d0: anewarray 359
      // 3d3: dup_x2
      // 3d4: dup_x2
      // 3d5: pop
      // 3d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d9: bipush 0
      // 3da: swap
      // 3db: aastore
      // 3dc: ldc2_w 5169452372242160369
      // 3df: lload 4
      // 3e1: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e6: ldc2_w 4840455177902908371
      // 3e9: lload 4
      // 3eb: invokedynamic u (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f0: return
      // 3f1: ldc2_w 6669490672109741458
      // 3f4: lload 4
      // 3f6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: athrow
      // 3fc: iinc 31 1
      // 3ff: iload 28
      // 401: ifne 344
      // 404: lload 4
      // 406: lconst_0
      // 407: lcmp
      // 408: ifle 36e
      // 40b: return
   }

   static {
      long var0 = a ^ 115185155531877L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "ó\u001cé\u0011\u009a¸\u000f\u000bmj¸b\u0085<\u008a¦@|Ì²ØHOì9þpNûµ\u0001W*3æñ½nA\u0082>\u0085Î&\u001f\u0088Ê*x\u009bÓvÕ=`·\u009bû¯W«y\t\u0007H¹C|\u0012W\u0018áÅ¸l{l\u008aR6æ ^÷\u0012ð\"\u0016XËÀ uéS£jd~èKò?©æ3\u001bëB \t²ö\u00948\u00ad\u001e3%\u001bY\f§õEð\u0089ý:÷@\u0082ùÅ0³\u008c6\u007fÉcîõ\u009e·«õµTÏ1%2\u0014¾Ô\u008c*:\rò\u0016õ\u0091vð0\f\u009dÿ\u000e";
      int var8 = "ó\u001cé\u0011\u009a¸\u000f\u000bmj¸b\u0085<\u008a¦@|Ì²ØHOì9þpNûµ\u0001W*3æñ½nA\u0082>\u0085Î&\u001f\u0088Ê*x\u009bÓvÕ=`·\u009bû¯W«y\t\u0007H¹C|\u0012W\u0018áÅ¸l{l\u008aR6æ ^÷\u0012ð\"\u0016XËÀ uéS£jd~èKò?©æ3\u001bëB \t²ö\u00948\u00ad\u001e3%\u001bY\f§õEð\u0089ý:÷@\u0082ùÅ0³\u008c6\u007fÉcîõ\u009e·«õµTÏ1%2\u0014¾Ô\u008c*:\rò\u0016õ\u0091vð0\f\u009dÿ\u000e"
         .length();
      char var5 = 16;
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
                     d = var9;
                     e = new String[6];
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

                  var6 = "¯¦½\u0092ô·å®\u008fCèT4<ÑY\u0010\u0080\u0080*ð/ªÊ{U\u009cA-\u0086º/\u001d";
                  var8 = "¯¦½\u0092ô·å®\u008fCèT4<ÑY\u0010\u0080\u0080*ð/ªÊ{U\u009cA-\u0086º/\u001d".length();
                  var5 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7443;
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
            throw new RuntimeException("com/zelix/ib", var10);
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
         throw new RuntimeException("com/zelix/ib" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
