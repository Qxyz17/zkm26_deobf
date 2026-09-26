package com.zelix;

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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ke extends kw implements ni {
   byte[] I;
   boolean g;
   int U;
   bs[] H;
   private static final long a = prr.a(-4675285464878294787L, 6714936997996536591L, MethodHandles.lookup().lookupClass()).a(273557647128618L);
   private static final String[] c;
   private static final String[] d;
   private static final Map h = new HashMap(13);
   private static final long[] i;
   private static final Integer[] j;
   private static final Map k;

   protected void S(Object[] param1) {
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
      // 14: getstatic com/zelix/ke.a J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 102876932113296
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 5342110223375146693
      // 26: lload 2
      // 27: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 4
      // 2e: aload 0
      // 2f: ldc2_w 5473314220590681441
      // 32: lload 2
      // 33: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 3b: istore 7
      // 3d: bipush 0
      // 3e: istore 8
      // 40: iload 8
      // 42: aload 0
      // 43: ldc2_w 5473314220590681441
      // 46: lload 2
      // 47: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: if_icmpge 83
      // 4f: aload 0
      // 50: ldc2_w 5889329850736722474
      // 53: lload 2
      // 54: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: iload 8
      // 5b: aaload
      // 5c: aload 4
      // 5e: lload 5
      // 60: bipush 2
      // 61: anewarray 419
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 1
      // 6b: swap
      // 6c: aastore
      // 6d: dup_x1
      // 6e: swap
      // 6f: bipush 0
      // 70: swap
      // 71: aastore
      // 72: ldc2_w 5845450891284736352
      // 75: lload 2
      // 76: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: iinc 8 1
      // 7e: iload 7
      // 80: ifeq 40
      // 83: lload 2
      // 84: lconst_0
      // 85: lcmp
      // 86: iflt 7e
      // 89: return
   }

   void z(gu param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 2
      // 01: dup2
      // 02: ldc2_w 113240848016893
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 0
      // 0c: lxor
      // 0d: lstore 6
      // 0f: pop2
      // 10: ldc2_w 5618762033536375070
      // 13: lload 2
      // 14: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19: istore 8
      // 1b: aload 1
      // 1c: aload 0
      // 1d: getfield com/zelix/ke.b Lcom/zelix/x8;
      // 20: aload 0
      // 21: aload 0
      // 22: invokevirtual com/zelix/ke.H ()Lcom/zelix/_4;
      // 25: lload 4
      // 27: dup2_x1
      // 28: pop2
      // 29: invokevirtual com/zelix/gu.K (Lcom/zelix/js;Ljava/lang/Object;JLjava/lang/Object;)Z
      // 2c: iload 8
      // 2e: ifne 5a
      // 31: pop
      // 32: aload 0
      // 33: ldc2_w 6224041716033603057
      // 36: lload 2
      // 37: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: ifnull 8d
      // 3f: goto 4c
      // 42: ldc2_w 5378370346953889064
      // 45: lload 2
      // 46: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: bipush 0
      // 4d: goto 5a
      // 50: ldc2_w 5378370346953889064
      // 53: lload 2
      // 54: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: istore 9
      // 5c: iload 9
      // 5e: aload 0
      // 5f: ldc2_w 6224041716033603057
      // 62: lload 2
      // 63: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: arraylength
      // 69: if_icmpge 8d
      // 6c: aload 0
      // 6d: ldc2_w 6224041716033603057
      // 70: lload 2
      // 71: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: iload 9
      // 78: aaload
      // 79: aload 1
      // 7a: lload 6
      // 7c: ldc2_w 6269873558719668327
      // 7f: lload 2
      // 80: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: iinc 9 1
      // 88: iload 8
      // 8a: ifeq 5c
      // 8d: return
   }

   ke(_4 param1, int param2, String param3, h1 param4, l6q param5, long param6, l6q param8, PrintWriter param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ke.a J
      // 003: lload 6
      // 005: lxor
      // 006: lstore 6
      // 008: lload 6
      // 00a: dup2
      // 00b: ldc2_w 123351793554884
      // 00e: lxor
      // 00f: lstore 10
      // 011: dup2
      // 012: ldc2_w 126694348402322
      // 015: lxor
      // 016: lstore 12
      // 018: dup2
      // 019: ldc2_w 58660689322342
      // 01c: lxor
      // 01d: lstore 14
      // 01f: dup2
      // 020: ldc2_w 47368037395471
      // 023: lxor
      // 024: dup2
      // 025: bipush 32
      // 027: lushr
      // 028: l2i
      // 029: istore 16
      // 02b: dup2
      // 02c: bipush 32
      // 02e: lshl
      // 02f: bipush 32
      // 031: lushr
      // 032: lstore 17
      // 034: pop2
      // 035: dup2
      // 036: ldc2_w 117680300745028
      // 039: lxor
      // 03a: lstore 19
      // 03c: dup2
      // 03d: ldc2_w 63069520998551
      // 040: lxor
      // 041: lstore 21
      // 043: dup2
      // 044: ldc2_w 102183860900731
      // 047: lxor
      // 048: lstore 23
      // 04a: dup2
      // 04b: ldc2_w 129761938158572
      // 04e: lxor
      // 04f: lstore 25
      // 051: dup2
      // 052: ldc2_w 58526588479900
      // 055: lxor
      // 056: lstore 27
      // 058: dup2
      // 059: ldc2_w 2253372783132
      // 05c: lxor
      // 05d: lstore 29
      // 05f: pop2
      // 060: ldc2_w 6201903619444966134
      // 063: lload 6
      // 065: invokedynamic h (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: aload 0
      // 06b: aload 1
      // 06c: iload 2
      // 06d: aload 3
      // 06e: lload 27
      // 070: aload 4
      // 072: aload 5
      // 074: invokespecial com/zelix/kw.<init> (Lcom/zelix/_4;ILjava/lang/String;JLcom/zelix/h1;Lcom/zelix/l6q;)V
      // 077: istore 31
      // 079: aload 0
      // 07a: bipush 1
      // 07b: ldc2_w 5236559670758743837
      // 07e: lload 6
      // 080: invokedynamic t (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: aload 0
      // 086: getfield com/zelix/ke.W I
      // 089: iload 31
      // 08b: ifne 658
      // 08e: bipush 2
      // 08f: if_icmplt 5aa
      // 092: goto 0a0
      // 095: ldc2_w 5857920201130462912
      // 098: lload 6
      // 09a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: aload 4
      // 0a3: invokevirtual com/zelix/h1.readUnsignedShort ()I
      // 0a6: ldc2_w 6324871106366722386
      // 0a9: lload 6
      // 0ab: invokedynamic t (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: aload 0
      // 0b1: ldc2_w 6324871106366722386
      // 0b4: lload 6
      // 0b6: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: sipush 30934
      // 0be: ldc2_w 6923855357177653729
      // 0c1: lload 6
      // 0c3: lxor
      // 0c4: invokedynamic h (IJ)I bsm=com/zelix/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: imul
      // 0ca: bipush 2
      // 0cb: iadd
      // 0cc: lload 6
      // 0ce: lconst_0
      // 0cf: lcmp
      // 0d0: ifle 5a7
      // 0d3: iload 31
      // 0d5: ifne 59d
      // 0d8: goto 0e6
      // 0db: ldc2_w 5857920201130462912
      // 0de: lload 6
      // 0e0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: athrow
      // 0e6: aload 0
      // 0e7: getfield com/zelix/ke.W I
      // 0ea: if_icmpne 480
      // 0ed: goto 0fb
      // 0f0: ldc2_w 5857920201130462912
      // 0f3: lload 6
      // 0f5: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: aload 0
      // 0fd: ldc2_w 6324871106366722386
      // 100: lload 6
      // 102: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: anewarray 264
      // 10a: ldc2_w 5586839314286534169
      // 10d: lload 6
      // 10f: invokedynamic t (Ljava/lang/Object;[Lcom/zelix/bs;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: bipush 0
      // 115: istore 32
      // 117: iload 32
      // 119: aload 0
      // 11a: ldc2_w 6324871106366722386
      // 11d: lload 6
      // 11f: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: if_icmpge 3e9
      // 127: aload 0
      // 128: ldc2_w 5586839314286534169
      // 12b: lload 6
      // 12d: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: iload 32
      // 134: new com/zelix/bs
      // 137: dup
      // 138: iload 16
      // 13a: aload 0
      // 13b: aload 4
      // 13d: aload 5
      // 13f: aload 8
      // 141: aload 9
      // 143: lload 17
      // 145: invokespecial com/zelix/bs.<init> (ILcom/zelix/_4;Lcom/zelix/h1;Lcom/zelix/l6q;Lcom/zelix/l6q;Ljava/io/PrintWriter;J)V
      // 148: aastore
      // 149: iload 31
      // 14b: lload 6
      // 14d: lconst_0
      // 14e: lcmp
      // 14f: iflt 160
      // 152: ifne 3e4
      // 155: aload 0
      // 156: ldc2_w 5236559670758743837
      // 159: lload 6
      // 15b: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: iload 31
      // 162: lload 6
      // 164: lconst_0
      // 165: lcmp
      // 166: ifle 404
      // 169: ifne 3fb
      // 16c: goto 17a
      // 16f: ldc2_w 5857920201130462912
      // 172: lload 6
      // 174: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: athrow
      // 17a: ifeq 3e1
      // 17d: goto 18b
      // 180: ldc2_w 5857920201130462912
      // 183: lload 6
      // 185: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18a: athrow
      // 18b: aload 0
      // 18c: ldc2_w 5586839314286534169
      // 18f: lload 6
      // 191: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: iload 32
      // 198: aaload
      // 199: iload 31
      // 19b: ifne 27c
      // 19e: goto 1ac
      // 1a1: ldc2_w 5857920201130462912
      // 1a4: lload 6
      // 1a6: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: lload 6
      // 1ae: lconst_0
      // 1af: lcmp
      // 1b0: ifle 26e
      // 1b3: ldc2_w 5635242306733071661
      // 1b6: lload 6
      // 1b8: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: ifne 260
      // 1c0: goto 1ce
      // 1c3: ldc2_w 5857920201130462912
      // 1c6: lload 6
      // 1c8: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cd: athrow
      // 1ce: aload 0
      // 1cf: bipush 0
      // 1d0: lload 10
      // 1d2: bipush 2
      // 1d3: anewarray 419
      // 1d6: dup_x2
      // 1d7: dup_x2
      // 1d8: pop
      // 1d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1dc: bipush 1
      // 1dd: swap
      // 1de: aastore
      // 1df: dup_x1
      // 1e0: swap
      // 1e1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1e4: bipush 0
      // 1e5: swap
      // 1e6: aastore
      // 1e7: ldc2_w 5864907457107503352
      // 1ea: lload 6
      // 1ec: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f1: aload 9
      // 1f3: new java/lang/StringBuilder
      // 1f6: dup
      // 1f7: invokespecial java/lang/StringBuilder.<init> ()V
      // 1fa: sipush 11703
      // 1fd: ldc2_w 4758195694375395812
      // 200: lload 6
      // 202: lxor
      // 203: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 208: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20b: aload 0
      // 20c: lload 14
      // 20e: invokevirtual com/zelix/ke.h (J)Ljava/lang/String;
      // 211: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 214: sipush 10119
      // 217: ldc2_w 4762800610998774737
      // 21a: lload 6
      // 21c: lxor
      // 21d: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 225: sipush 15701
      // 228: ldc2_w 2759988497385058569
      // 22b: lload 6
      // 22d: lxor
      // 22e: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 233: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 236: sipush 20070
      // 239: ldc2_w 2291344457538208308
      // 23c: lload 6
      // 23e: lxor
      // 23f: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 247: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 24a: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 24d: iload 31
      // 24f: ifeq 3e1
      // 252: goto 260
      // 255: ldc2_w 5857920201130462912
      // 258: lload 6
      // 25a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: athrow
      // 260: aload 0
      // 261: ldc2_w 5586839314286534169
      // 264: lload 6
      // 266: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: iload 32
      // 26d: aaload
      // 26e: goto 27c
      // 271: ldc2_w 5857920201130462912
      // 274: lload 6
      // 276: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: athrow
      // 27c: lload 19
      // 27e: bipush 1
      // 27f: anewarray 419
      // 282: dup_x2
      // 283: dup_x2
      // 284: pop
      // 285: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 288: bipush 0
      // 289: swap
      // 28a: aastore
      // 28b: ldc2_w 5688709618719036635
      // 28e: lload 6
      // 290: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: astore 33
      // 297: iload 31
      // 299: ifne 3e4
      // 29c: aload 33
      // 29e: ifnull 3e1
      // 2a1: goto 2af
      // 2a4: ldc2_w 5857920201130462912
      // 2a7: lload 6
      // 2a9: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: ldc2_w 5586839314286534169
      // 2b3: lload 6
      // 2b5: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ba: iload 32
      // 2bc: aaload
      // 2bd: lload 21
      // 2bf: bipush 1
      // 2c0: anewarray 419
      // 2c3: dup_x2
      // 2c4: dup_x2
      // 2c5: pop
      // 2c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c9: bipush 0
      // 2ca: swap
      // 2cb: aastore
      // 2cc: ldc2_w 6293482493755739025
      // 2cf: lload 6
      // 2d1: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: astore 34
      // 2d8: aload 0
      // 2d9: ldc2_w 5586839314286534169
      // 2dc: lload 6
      // 2de: invokedynamic v (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e3: iload 32
      // 2e5: aaload
      // 2e6: lload 23
      // 2e8: bipush 1
      // 2e9: anewarray 419
      // 2ec: dup_x2
      // 2ed: dup_x2
      // 2ee: pop
      // 2ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f2: bipush 0
      // 2f3: swap
      // 2f4: aastore
      // 2f5: ldc2_w 5671180276345068292
      // 2f8: lload 6
      // 2fa: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ff: astore 35
      // 301: iload 31
      // 303: lload 6
      // 305: lconst_0
      // 306: lcmp
      // 307: ifle 3e6
      // 30a: ifne 3e4
      // 30d: aload 35
      // 30f: ifnull 3e1
      // 312: goto 320
      // 315: ldc2_w 5857920201130462912
      // 318: lload 6
      // 31a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: athrow
      // 320: aload 35
      // 322: invokevirtual java/lang/String.length ()I
      // 325: aload 34
      // 327: invokevirtual java/lang/String.length ()I
      // 32a: aload 33
      // 32c: invokevirtual java/lang/String.length ()I
      // 32f: isub
      // 330: if_icmple 3e1
      // 333: goto 341
      // 336: ldc2_w 5857920201130462912
      // 339: lload 6
      // 33b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 340: athrow
      // 341: aload 9
      // 343: new java/lang/StringBuilder
      // 346: dup
      // 347: invokespecial java/lang/StringBuilder.<init> ()V
      // 34a: sipush 26015
      // 34d: ldc2_w 249136117357619659
      // 350: lload 6
      // 352: lxor
      // 353: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 358: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35b: aload 0
      // 35c: lload 14
      // 35e: invokevirtual com/zelix/ke.h (J)Ljava/lang/String;
      // 361: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 364: sipush 22356
      // 367: ldc2_w 4127460285177928452
      // 36a: lload 6
      // 36c: lxor
      // 36d: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 372: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 375: sipush 28022
      // 378: ldc2_w 4995525578022789411
      // 37b: lload 6
      // 37d: lxor
      // 37e: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 383: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 386: sipush 17208
      // 389: ldc2_w 4733377120594104175
      // 38c: lload 6
      // 38e: lxor
      // 38f: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 397: aload 35
      // 399: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39c: sipush 13895
      // 39f: ldc2_w 7200097591539366425
      // 3a2: lload 6
      // 3a4: lxor
      // 3a5: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3aa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3ad: aload 34
      // 3af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b2: sipush 1839
      // 3b5: ldc2_w 2079995771861519218
      // 3b8: lload 6
      // 3ba: lxor
      // 3bb: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c3: aload 33
      // 3c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3c8: ldc "'"
      // 3ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3cd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d0: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 3d3: goto 3e1
      // 3d6: ldc2_w 5857920201130462912
      // 3d9: lload 6
      // 3db: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e0: athrow
      // 3e1: iinc 32 1
      // 3e4: iload 31
      // 3e6: ifeq 117
      // 3e9: aload 0
      // 3ea: ldc2_w 5236559670758743837
      // 3ed: lload 6
      // 3ef: lload 6
      // 3f1: lconst_0
      // 3f2: lcmp
      // 3f3: iflt 12d
      // 3f6: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: lload 6
      // 3fd: lconst_0
      // 3fe: lcmp
      // 3ff: iflt 677
      // 402: iload 31
      // 404: ifne 677
      // 407: ifne 659
      // 40a: goto 418
      // 40d: ldc2_w 5857920201130462912
      // 410: lload 6
      // 412: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 417: athrow
      // 418: new java/io/ByteArrayOutputStream
      // 41b: dup
      // 41c: aload 0
      // 41d: getfield com/zelix/ke.W I
      // 420: invokespecial java/io/ByteArrayOutputStream.<init> (I)V
      // 423: astore 32
      // 425: new java/io/DataOutputStream
      // 428: dup
      // 429: aload 32
      // 42b: invokespecial java/io/DataOutputStream.<init> (Ljava/io/OutputStream;)V
      // 42e: astore 33
      // 430: aload 0
      // 431: lload 25
      // 433: aload 33
      // 435: bipush 2
      // 436: anewarray 419
      // 439: dup_x1
      // 43a: swap
      // 43b: bipush 1
      // 43c: swap
      // 43d: aastore
      // 43e: dup_x2
      // 43f: dup_x2
      // 440: pop
      // 441: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 444: bipush 0
      // 445: swap
      // 446: aastore
      // 447: ldc2_w 5268661490513065584
      // 44a: lload 6
      // 44c: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 451: aload 0
      // 452: aload 32
      // 454: ldc2_w 5201341476017441696
      // 457: lload 6
      // 459: invokedynamic w (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45e: ldc2_w 5423863925804868523
      // 461: lload 6
      // 463: invokedynamic t (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 468: aload 0
      // 469: aconst_null
      // 46a: ldc2_w 5586839314286534169
      // 46d: lload 6
      // 46f: invokedynamic t (Ljava/lang/Object;[Lcom/zelix/bs;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 474: lload 6
      // 476: lconst_0
      // 477: lcmp
      // 478: ifle 659
      // 47b: iload 31
      // 47d: ifeq 659
      // 480: aload 0
      // 481: bipush 0
      // 482: lload 10
      // 484: bipush 2
      // 485: anewarray 419
      // 488: dup_x2
      // 489: dup_x2
      // 48a: pop
      // 48b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 48e: bipush 1
      // 48f: swap
      // 490: aastore
      // 491: dup_x1
      // 492: swap
      // 493: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 496: bipush 0
      // 497: swap
      // 498: aastore
      // 499: ldc2_w 5864907457107503352
      // 49c: lload 6
      // 49e: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: aload 9
      // 4a5: new java/lang/StringBuilder
      // 4a8: dup
      // 4a9: invokespecial java/lang/StringBuilder.<init> ()V
      // 4ac: sipush 26015
      // 4af: ldc2_w 249136117357619659
      // 4b2: lload 6
      // 4b4: lxor
      // 4b5: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bd: aload 0
      // 4be: lload 14
      // 4c0: invokevirtual com/zelix/ke.h (J)Ljava/lang/String;
      // 4c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c6: sipush 22356
      // 4c9: ldc2_w 4127460285177928452
      // 4cc: lload 6
      // 4ce: lxor
      // 4cf: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d7: sipush 28022
      // 4da: ldc2_w 4995525578022789411
      // 4dd: lload 6
      // 4df: lxor
      // 4e0: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e8: sipush 9172
      // 4eb: ldc2_w 890566175206207365
      // 4ee: lload 6
      // 4f0: lxor
      // 4f1: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4fc: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 4ff: aload 0
      // 500: aload 0
      // 501: getfield com/zelix/ke.W I
      // 504: newarray 8
      // 506: ldc2_w 5423863925804868523
      // 509: lload 6
      // 50b: invokedynamic t (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 510: aload 0
      // 511: ldc2_w 5423863925804868523
      // 514: lload 6
      // 516: invokedynamic v (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51b: bipush 0
      // 51c: aload 0
      // 51d: ldc2_w 6324871106366722386
      // 520: lload 6
      // 522: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 527: sipush 30934
      // 52a: ldc2_w 6923855357177653729
      // 52d: lload 6
      // 52f: lxor
      // 530: invokedynamic h (IJ)I bsm=com/zelix/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 535: iushr
      // 536: sipush 12826
      // 539: ldc2_w 4531441615230378798
      // 53c: lload 6
      // 53e: lxor
      // 53f: invokedynamic h (IJ)I bsm=com/zelix/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 544: iand
      // 545: i2b
      // 546: bastore
      // 547: aload 0
      // 548: ldc2_w 5423863925804868523
      // 54b: lload 6
      // 54d: invokedynamic v (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 552: bipush 1
      // 553: aload 0
      // 554: ldc2_w 6324871106366722386
      // 557: lload 6
      // 559: invokedynamic v (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55e: bipush 0
      // 55f: iushr
      // 560: sipush 4454
      // 563: ldc2_w 7836737915923169360
      // 566: lload 6
      // 568: lxor
      // 569: invokedynamic h (IJ)I bsm=com/zelix/ke.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56e: iand
      // 56f: i2b
      // 570: bastore
      // 571: aload 4
      // 573: aload 0
      // 574: ldc2_w 5423863925804868523
      // 577: lload 6
      // 579: invokedynamic v (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57e: bipush 2
      // 57f: aload 0
      // 580: getfield com/zelix/ke.W I
      // 583: bipush 2
      // 584: isub
      // 585: ldc2_w 6227039846752567695
      // 588: lload 6
      // 58a: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58f: goto 59d
      // 592: ldc2_w 5857920201130462912
      // 595: lload 6
      // 597: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59c: athrow
      // 59d: pop
      // 59e: lload 6
      // 5a0: lconst_0
      // 5a1: lcmp
      // 5a2: ifle 659
      // 5a5: iload 31
      // 5a7: ifeq 659
      // 5aa: aload 0
      // 5ab: bipush 0
      // 5ac: lload 10
      // 5ae: bipush 2
      // 5af: anewarray 419
      // 5b2: dup_x2
      // 5b3: dup_x2
      // 5b4: pop
      // 5b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b8: bipush 1
      // 5b9: swap
      // 5ba: aastore
      // 5bb: dup_x1
      // 5bc: swap
      // 5bd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5c0: bipush 0
      // 5c1: swap
      // 5c2: aastore
      // 5c3: ldc2_w 5864907457107503352
      // 5c6: lload 6
      // 5c8: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cd: aload 9
      // 5cf: new java/lang/StringBuilder
      // 5d2: dup
      // 5d3: invokespecial java/lang/StringBuilder.<init> ()V
      // 5d6: sipush 26015
      // 5d9: ldc2_w 249136117357619659
      // 5dc: lload 6
      // 5de: lxor
      // 5df: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e7: aload 0
      // 5e8: lload 14
      // 5ea: invokevirtual com/zelix/ke.h (J)Ljava/lang/String;
      // 5ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5f0: sipush 22356
      // 5f3: ldc2_w 4127460285177928452
      // 5f6: lload 6
      // 5f8: lxor
      // 5f9: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fe: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 601: sipush 28022
      // 604: ldc2_w 4995525578022789411
      // 607: lload 6
      // 609: lxor
      // 60a: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 612: sipush 13281
      // 615: ldc2_w 8173378685865295806
      // 618: lload 6
      // 61a: lxor
      // 61b: invokedynamic q (IJ)Ljava/lang/String; bsm=com/zelix/ke.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 620: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 623: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 626: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 629: aload 0
      // 62a: aload 0
      // 62b: getfield com/zelix/ke.W I
      // 62e: newarray 8
      // 630: ldc2_w 5423863925804868523
      // 633: lload 6
      // 635: invokedynamic t (Ljava/lang/Object;[BJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63a: aload 4
      // 63c: aload 0
      // 63d: ldc2_w 5423863925804868523
      // 640: lload 6
      // 642: invokedynamic v (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 647: invokevirtual com/zelix/h1.read ([B)I
      // 64a: goto 658
      // 64d: ldc2_w 5857920201130462912
      // 650: lload 6
      // 652: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 657: athrow
      // 658: pop
      // 659: aload 0
      // 65a: iload 31
      // 65c: ifne 6c9
      // 65f: ldc2_w 5236559670758743837
      // 662: lload 6
      // 664: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 669: goto 677
      // 66c: ldc2_w 5857920201130462912
      // 66f: lload 6
      // 671: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 676: athrow
      // 677: lload 6
      // 679: lconst_0
      // 67a: lcmp
      // 67b: ifle 6a9
      // 67e: ifeq 6ba
      // 681: aload 1
      // 682: checkcast com/zelix/_v
      // 685: bipush 1
      // 686: lload 29
      // 688: bipush 2
      // 689: anewarray 419
      // 68c: dup_x2
      // 68d: dup_x2
      // 68e: pop
      // 68f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 692: bipush 1
      // 693: swap
      // 694: aastore
      // 695: dup_x1
      // 696: swap
      // 697: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 69a: bipush 0
      // 69b: swap
      // 69c: aastore
      // 69d: ldc2_w 6044197994007154147
      // 6a0: lload 6
      // 6a2: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a7: iload 31
      // 6a9: ifeq 6ee
      // 6ac: goto 6ba
      // 6af: ldc2_w 5857920201130462912
      // 6b2: lload 6
      // 6b4: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b9: athrow
      // 6ba: aload 1
      // 6bb: goto 6c9
      // 6be: ldc2_w 5857920201130462912
      // 6c1: lload 6
      // 6c3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c8: athrow
      // 6c9: checkcast com/zelix/_v
      // 6cc: bipush 1
      // 6cd: lload 12
      // 6cf: bipush 2
      // 6d0: anewarray 419
      // 6d3: dup_x2
      // 6d4: dup_x2
      // 6d5: pop
      // 6d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6d9: bipush 1
      // 6da: swap
      // 6db: aastore
      // 6dc: dup_x1
      // 6dd: swap
      // 6de: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 6e1: bipush 0
      // 6e2: swap
      // 6e3: aastore
      // 6e4: ldc2_w 5204631254254412970
      // 6e7: lload 6
      // 6e9: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ee: return
   }

   void T(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 79997496562122L;
      boolean var6 = m44.a<"l">(2190437681290103426L, var2);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"r">(this, 62934164434933609L, var2);
            if (var6) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var8) {
            throw m44.a<"l">(var8, 1819430533875107508L, var2);
         }

         var10000 = 0;
      }

      int var7 = var10000;

      while (var7 < m44.a<"r">(this, 2283920732013041958L, var2)) {
         m44.a<"s">(m44.a<"r">(this, 431248033232655981L, var2)[var7], new Object[]{var4}, 372812470626546788L, var2);
         var7++;
         if (var6) {
            break;
         }
      }
   }

   int O(Object[] param1) {
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
      // 004: checkcast java/util/HashSet
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/ke.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 92624769531509
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w -5801782054100345293
      // 025: lload 3
      // 026: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: istore 7
      // 02d: aload 0
      // 02e: iload 7
      // 030: ifeq 15f
      // 033: ldc2_w -6000348242158371029
      // 036: lload 3
      // 037: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: ifnull 15e
      // 03f: goto 04c
      // 042: ldc2_w -5730398745010786318
      // 045: lload 3
      // 046: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: new java/util/ArrayList
      // 04f: dup
      // 050: aload 0
      // 051: ldc2_w -6000348242158371029
      // 054: lload 3
      // 055: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: arraylength
      // 05b: invokespecial java/util/ArrayList.<init> (I)V
      // 05e: astore 8
      // 060: bipush 0
      // 061: istore 9
      // 063: iload 9
      // 065: aload 0
      // 066: ldc2_w -6000348242158371029
      // 069: lload 3
      // 06a: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: arraylength
      // 070: if_icmpge 0f9
      // 073: aload 0
      // 074: ldc2_w -6000348242158371029
      // 077: lload 3
      // 078: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: iload 9
      // 07f: aaload
      // 080: lload 5
      // 082: aload 2
      // 083: bipush 2
      // 084: anewarray 419
      // 087: dup_x1
      // 088: swap
      // 089: bipush 1
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x2
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092: bipush 0
      // 093: swap
      // 094: aastore
      // 095: ldc2_w -5718122660712689903
      // 098: lload 3
      // 099: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: iload 7
      // 0a0: lload 3
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iflt 10a
      // 0a6: ifeq 108
      // 0a9: iload 7
      // 0ab: ifeq 0f0
      // 0ae: goto 0bb
      // 0b1: ldc2_w -5730398745010786318
      // 0b4: lload 3
      // 0b5: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: lload 3
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: iflt 0f6
      // 0c1: ifne 0f1
      // 0c4: goto 0d1
      // 0c7: ldc2_w -5730398745010786318
      // 0ca: lload 3
      // 0cb: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 8
      // 0d3: aload 0
      // 0d4: ldc2_w -6000348242158371029
      // 0d7: lload 3
      // 0d8: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: iload 9
      // 0df: aaload
      // 0e0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0e3: goto 0f0
      // 0e6: ldc2_w -5730398745010786318
      // 0e9: lload 3
      // 0ea: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: pop
      // 0f1: iinc 9 1
      // 0f4: iload 7
      // 0f6: ifne 063
      // 0f9: aload 8
      // 0fb: invokevirtual java/util/ArrayList.size ()I
      // 0fe: istore 9
      // 100: lload 3
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 073
      // 106: iload 9
      // 108: iload 7
      // 10a: lload 3
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: iflt 11e
      // 110: ifeq 168
      // 113: aload 0
      // 114: ldc2_w -6000348242158371029
      // 117: lload 3
      // 118: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: arraylength
      // 11e: if_icmpge 15e
      // 121: goto 12e
      // 124: ldc2_w -5730398745010786318
      // 127: lload 3
      // 128: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 0
      // 12f: aload 8
      // 131: iload 9
      // 133: anewarray 264
      // 136: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 139: checkcast [Lcom/zelix/bs;
      // 13c: ldc2_w -6000348242158371029
      // 13f: lload 3
      // 140: invokedynamic v (Ljava/lang/Object;[Lcom/zelix/bs;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: aload 0
      // 146: iload 9
      // 148: ldc2_w -5263442342464966560
      // 14b: lload 3
      // 14c: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: goto 15e
      // 154: ldc2_w -5730398745010786318
      // 157: lload 3
      // 158: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: aload 0
      // 15f: ldc2_w -5263442342464966560
      // 162: lload 3
      // 163: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: ireturn
   }

   public void v(Object[] var1) {
      long var3 = (Long)var1[0];
      HashSet var6 = (HashSet)var1[1];
      HashSet var7 = (HashSet)var1[2];
      HashSet var5 = (HashSet)var1[3];
      HashSet var2 = (HashSet)var1[4];
      var3 = a ^ var3;
      long var8 = var3 ^ 98733899247917L;
      boolean var10 = m44.a<"m">(-7870999896501467613L, var3);

      byte var10000;
      label28: {
         try {
            var10000 = m44.a<"s">(this, -8322935275061191736L, var3);
            if (var10) {
               break label28;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (n9 var12) {
            throw m44.a<"m">(var12, -7665546224435885547L, var3);
         }

         var10000 = 0;
      }

      int var11 = var10000;

      while (var11 < m44.a<"s">(this, -7848800040033184377L, var3)) {
         m44.a<"r">(m44.a<"s">(this, -8548551233669784884L, var3)[var11], new Object[]{var8, var6, var7, var5, var2}, -8639193544583674210L, var3);
         var11++;
         if (var10) {
            break;
         }
      }
   }

   protected void c(Object[] param1) {
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
      // 15: ldc2_w 0
      // 18: lxor
      // 19: lstore 5
      // 1b: dup2
      // 1c: ldc2_w 51658303206485
      // 1f: lxor
      // 20: lstore 7
      // 22: pop2
      // 23: ldc2_w 716282175763740856
      // 26: lload 3
      // 27: invokedynamic i (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: aload 0
      // 2d: lload 5
      // 2f: aload 2
      // 30: bipush 2
      // 31: anewarray 419
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
      // 42: invokespecial com/zelix/kw.c ([Ljava/lang/Object;)V
      // 45: istore 9
      // 47: aload 0
      // 48: iload 9
      // 4a: ifeq 74
      // 4d: ldc2_w 1086114875312396452
      // 50: lload 3
      // 51: invokedynamic w (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: ifeq 9d
      // 59: goto 66
      // 5c: ldc2_w 1653625483943872889
      // 5f: lload 3
      // 60: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: athrow
      // 66: aload 0
      // 67: goto 74
      // 6a: ldc2_w 1653625483943872889
      // 6d: lload 3
      // 6e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: lload 7
      // 76: aload 2
      // 77: bipush 2
      // 78: anewarray 419
      // 7b: dup_x1
      // 7c: swap
      // 7d: bipush 1
      // 7e: swap
      // 7f: aastore
      // 80: dup_x2
      // 81: dup_x2
      // 82: pop
      // 83: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 86: bipush 0
      // 87: swap
      // 88: aastore
      // 89: ldc2_w 1055904211364671945
      // 8c: lload 3
      // 8d: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: lload 3
      // 93: lconst_0
      // 94: lcmp
      // 95: ifle ab
      // 98: iload 9
      // 9a: ifne b8
      // 9d: aload 2
      // 9e: aload 0
      // 9f: ldc2_w 935683844463584274
      // a2: lload 3
      // a3: invokedynamic w (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: invokevirtual java/io/DataOutputStream.write ([B)V
      // ab: goto b8
      // ae: ldc2_w 1653625483943872889
      // b1: lload 3
      // b2: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: athrow
      // b8: return
   }

   int g(int var1, byte var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40;
      return 2 + m44.a<"p">(this, -1864423790195810124L, var4) * c<"h">(392, 4027654105035514203L ^ var4);
   }

   bs R(Object[] param1) {
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
      // 04: checkcast com/zelix/jv
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/ke.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 72913198567088
      // 1e: lxor
      // 1f: lstore 5
      // 21: dup2
      // 22: ldc2_w 72913198567088
      // 25: lxor
      // 26: lstore 7
      // 28: pop2
      // 29: ldc2_w 4409756773766425045
      // 2c: lload 3
      // 2d: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: istore 9
      // 34: aload 0
      // 35: ldc2_w 2560563942253687870
      // 38: lload 3
      // 39: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: iload 9
      // 40: ifne 54
      // 43: ifeq ed
      // 46: goto 53
      // 49: ldc2_w 4208771573730321891
      // 4c: lload 3
      // 4d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: bipush 0
      // 54: istore 10
      // 56: iload 10
      // 58: aload 0
      // 59: ldc2_w 4388046259024083569
      // 5c: lload 3
      // 5d: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: if_icmpge ed
      // 65: aload 0
      // 66: ldc2_w 2786458035562624314
      // 69: lload 3
      // 6a: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: iload 10
      // 71: aaload
      // 72: astore 11
      // 74: iload 9
      // 76: lload 3
      // 77: lconst_0
      // 78: lcmp
      // 79: ifle ea
      // 7c: ifne e8
      // 7f: aload 11
      // 81: ldc2_w 2818604502888671879
      // 84: lload 3
      // 85: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: ifnull e5
      // 8d: goto 9a
      // 90: ldc2_w 4208771573730321891
      // 93: lload 3
      // 94: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: aload 11
      // 9c: iload 9
      // 9e: ifne e4
      // a1: goto ae
      // a4: ldc2_w 4208771573730321891
      // a7: lload 3
      // a8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: ldc2_w 2818604502888671879
      // b1: lload 3
      // b2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/jf; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: lload 7
      // b9: invokevirtual com/zelix/jf.g (J)Ljava/lang/String;
      // bc: aload 2
      // bd: lload 5
      // bf: invokevirtual com/zelix/jv.g (J)Ljava/lang/String;
      // c2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // c5: ifeq e5
      // c8: goto d5
      // cb: ldc2_w 4208771573730321891
      // ce: lload 3
      // cf: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: athrow
      // d5: aload 11
      // d7: goto e4
      // da: ldc2_w 4208771573730321891
      // dd: lload 3
      // de: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e3: athrow
      // e4: areturn
      // e5: iinc 10 1
      // e8: iload 9
      // ea: ifeq 56
      // ed: aconst_null
      // ee: areturn
   }

   public int M(Object[] param1) {
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
      // 00e: checkcast com/zelix/hf
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/ke.a J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 114705183367153
      // 01e: lxor
      // 01f: lstore 5
      // 021: pop2
      // 022: ldc2_w 390601257271316876
      // 025: lload 3
      // 026: invokedynamic j (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02b: istore 7
      // 02d: aload 0
      // 02e: iload 7
      // 030: ifne 15f
      // 033: ldc2_w 2229940956486700387
      // 036: lload 3
      // 037: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: ifnull 15e
      // 03f: goto 04c
      // 042: ldc2_w 158088741141290426
      // 045: lload 3
      // 046: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04b: athrow
      // 04c: new java/util/ArrayList
      // 04f: dup
      // 050: aload 0
      // 051: ldc2_w 2229940956486700387
      // 054: lload 3
      // 055: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: arraylength
      // 05b: invokespecial java/util/ArrayList.<init> (I)V
      // 05e: astore 8
      // 060: bipush 0
      // 061: istore 9
      // 063: iload 9
      // 065: aload 0
      // 066: ldc2_w 2229940956486700387
      // 069: lload 3
      // 06a: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: arraylength
      // 070: if_icmpge 0f9
      // 073: aload 0
      // 074: ldc2_w 2229940956486700387
      // 077: lload 3
      // 078: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: iload 9
      // 07f: aaload
      // 080: lload 5
      // 082: aload 2
      // 083: bipush 2
      // 084: anewarray 419
      // 087: dup_x1
      // 088: swap
      // 089: bipush 1
      // 08a: swap
      // 08b: aastore
      // 08c: dup_x2
      // 08d: dup_x2
      // 08e: pop
      // 08f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 092: bipush 0
      // 093: swap
      // 094: aastore
      // 095: ldc2_w 540892593593284001
      // 098: lload 3
      // 099: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: iload 7
      // 0a0: lload 3
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: ifle 10a
      // 0a6: ifne 108
      // 0a9: iload 7
      // 0ab: ifne 0f0
      // 0ae: goto 0bb
      // 0b1: ldc2_w 158088741141290426
      // 0b4: lload 3
      // 0b5: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: athrow
      // 0bb: lload 3
      // 0bc: lconst_0
      // 0bd: lcmp
      // 0be: iflt 0f6
      // 0c1: ifne 0f1
      // 0c4: goto 0d1
      // 0c7: ldc2_w 158088741141290426
      // 0ca: lload 3
      // 0cb: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: aload 8
      // 0d3: aload 0
      // 0d4: ldc2_w 2229940956486700387
      // 0d7: lload 3
      // 0d8: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: iload 9
      // 0df: aaload
      // 0e0: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0e3: goto 0f0
      // 0e6: ldc2_w 158088741141290426
      // 0e9: lload 3
      // 0ea: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: pop
      // 0f1: iinc 9 1
      // 0f4: iload 7
      // 0f6: ifeq 063
      // 0f9: aload 8
      // 0fb: invokevirtual java/util/ArrayList.size ()I
      // 0fe: istore 9
      // 100: lload 3
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 073
      // 106: iload 9
      // 108: iload 7
      // 10a: lload 3
      // 10b: lconst_0
      // 10c: lcmp
      // 10d: iflt 11e
      // 110: ifne 168
      // 113: aload 0
      // 114: ldc2_w 2229940956486700387
      // 117: lload 3
      // 118: invokedynamic t (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: arraylength
      // 11e: if_icmpge 15e
      // 121: goto 12e
      // 124: ldc2_w 158088741141290426
      // 127: lload 3
      // 128: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 0
      // 12f: aload 8
      // 131: iload 9
      // 133: anewarray 264
      // 136: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 139: checkcast [Lcom/zelix/bs;
      // 13c: ldc2_w 2229940956486700387
      // 13f: lload 3
      // 140: invokedynamic v (Ljava/lang/Object;[Lcom/zelix/bs;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: aload 0
      // 146: iload 9
      // 148: ldc2_w 341239476789346856
      // 14b: lload 3
      // 14c: invokedynamic v (Ljava/lang/Object;IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 151: goto 15e
      // 154: ldc2_w 158088741141290426
      // 157: lload 3
      // 158: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: aload 0
      // 15f: ldc2_w 341239476789346856
      // 162: lload 3
      // 163: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: ireturn
   }

   void I(Object[] var1) {
      boolean var2 = (Boolean)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      m44.a<"w">(this, var2, -5570790043848350458L, var3);
   }

   protected void N(Object[] param1) {
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
      // 00c: checkcast java/util/Map
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/lqu
      // 021: astore 4
      // 023: pop
      // 024: lload 2
      // 025: dup2
      // 026: ldc2_w 0
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 91283194383054
      // 030: lxor
      // 031: lstore 9
      // 033: pop2
      // 034: ldc2_w 1680553024964027930
      // 037: lload 2
      // 038: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 0
      // 03e: aload 6
      // 040: aload 5
      // 042: lload 7
      // 044: aload 4
      // 046: bipush 4
      // 047: anewarray 419
      // 04a: dup_x1
      // 04b: swap
      // 04c: bipush 3
      // 04d: swap
      // 04e: aastore
      // 04f: dup_x2
      // 050: dup_x2
      // 051: pop
      // 052: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 055: bipush 2
      // 056: swap
      // 057: aastore
      // 058: dup_x1
      // 059: swap
      // 05a: bipush 1
      // 05b: swap
      // 05c: aastore
      // 05d: dup_x1
      // 05e: swap
      // 05f: bipush 0
      // 060: swap
      // 061: aastore
      // 062: invokespecial com/zelix/kw.N ([Ljava/lang/Object;)V
      // 065: istore 11
      // 067: aload 0
      // 068: ldc2_w 1274694015012587014
      // 06b: lload 2
      // 06c: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: iload 11
      // 073: ifeq 0a3
      // 076: ifeq 118
      // 079: goto 086
      // 07c: ldc2_w 599228716201351131
      // 07f: lload 2
      // 080: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: athrow
      // 086: aload 6
      // 088: aload 0
      // 089: ldc2_w 1071035341492488265
      // 08c: lload 2
      // 08d: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 095: bipush 0
      // 096: goto 0a3
      // 099: ldc2_w 599228716201351131
      // 09c: lload 2
      // 09d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a2: athrow
      // 0a3: istore 12
      // 0a5: iload 12
      // 0a7: aload 0
      // 0a8: ldc2_w 1071035341492488265
      // 0ab: lload 2
      // 0ac: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: if_icmpge 10d
      // 0b4: aload 0
      // 0b5: ldc2_w 1482547346245814018
      // 0b8: lload 2
      // 0b9: invokedynamic u (Ljava/lang/Object;JJ)[Lcom/zelix/bs; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: iload 12
      // 0c0: aaload
      // 0c1: aload 6
      // 0c3: aload 5
      // 0c5: lload 9
      // 0c7: bipush 3
      // 0c8: anewarray 419
      // 0cb: dup_x2
      // 0cc: dup_x2
      // 0cd: pop
      // 0ce: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d1: bipush 2
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: bipush 1
      // 0d7: swap
      // 0d8: aastore
      // 0d9: dup_x1
      // 0da: swap
      // 0db: bipush 0
      // 0dc: swap
      // 0dd: aastore
      // 0de: ldc2_w 1298877206783446243
      // 0e1: lload 2
      // 0e2: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: iinc 12 1
      // 0ea: iload 11
      // 0ec: lload 2
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 0f7
      // 0f2: ifeq 134
      // 0f5: iload 11
      // 0f7: ifne 0a5
      // 0fa: lload 2
      // 0fb: lconst_0
      // 0fc: lcmp
      // 0fd: iflt 0ea
      // 100: goto 10d
      // 103: ldc2_w 599228716201351131
      // 106: lload 2
      // 107: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: lload 2
      // 10e: lconst_0
      // 10f: lcmp
      // 110: ifle 127
      // 113: iload 11
      // 115: ifne 134
      // 118: aload 6
      // 11a: aload 0
      // 11b: ldc2_w 1323512613664324272
      // 11e: lload 2
      // 11f: invokedynamic u (Ljava/lang/Object;JJ)[B bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: invokevirtual java/io/DataOutputStream.write ([B)V
      // 127: goto 134
      // 12a: ldc2_w 599228716201351131
      // 12d: lload 2
      // 12e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: athrow
      // 134: return
   }

   static {
      long var11 = a ^ 75194041854991L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[12];
      int var18 = 0;
      String var17 = ":o$}>\u0082\u009d\u001b\u008dáKÌþ\u001e\u000f%\u0018\u000f\u0003ðþ©Æ\u009eTÆ-¹mÜ\b\u0080dÍvwçÔYÝÎ\u0010ýJv\u00adïSÜ=¢9ÄØ¹|\u00adÏ8h\u007f-k|\u000eQlï\u0013okÜn[)\u0002\u0017ôÏZ\u0097\u001a\u0002L\u0099ìZ5*nöRðÆ\u008c\u008a\u0018ö\u001a\u0084´_·@Ú\u009c+Ìu\u008a®\u0019\u000fªI\u0010¬¶\u001e&\u0099¦¼1\u0014â©YCãêç\u0010³\u0098\u00adàüº.±\u008e \u0090\u0013\u000e\u0094Va\u0010\u001f&LÜ\rË\u00adßTô\u0003¡$\u009fRÃ\u00103ù\u001bÜ-¯\u0000\f\r\u0014,Aî.\u00926\u0010Cíî<3|wM9Pâ]\u0004º V\u0010H¤\t°Ù-,Êãx.øy\u0018ÍÁ";
      int var19 = ":o$}>\u0082\u009d\u001b\u008dáKÌþ\u001e\u000f%\u0018\u000f\u0003ðþ©Æ\u009eTÆ-¹mÜ\b\u0080dÍvwçÔYÝÎ\u0010ýJv\u00adïSÜ=¢9ÄØ¹|\u00adÏ8h\u007f-k|\u000eQlï\u0013okÜn[)\u0002\u0017ôÏZ\u0097\u001a\u0002L\u0099ìZ5*nöRðÆ\u008c\u008a\u0018ö\u001a\u0084´_·@Ú\u009c+Ìu\u008a®\u0019\u000fªI\u0010¬¶\u001e&\u0099¦¼1\u0014â©YCãêç\u0010³\u0098\u00adàüº.±\u008e \u0090\u0013\u000e\u0094Va\u0010\u001f&LÜ\rË\u00adßTô\u0003¡$\u009fRÃ\u00103ù\u001bÜ-¯\u0000\f\r\u0014,Aî.\u00926\u0010Cíî<3|wM9Pâ]\u0004º V\u0010H¤\t°Ù-,Êãx.øy\u0018ÍÁ"
         .length();
      char var16 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = c(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     c = var20;
                     d = new String[12];
                     k = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[4];
                     int var3 = 0;
                     String var4 = "\u009b\"\tfÛ\rb¿àpú\u001aà2\u009d\u0013";
                     int var5 = "\u009b\"\tfÛ\rb¿àpú\u001aà2\u009d\u0013".length();
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
                                    i = var6;
                                    j = new Integer[4];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "ñënYzTm\u009c\u00ad'\u008d÷\fIK\u001c";
                                 var5 = "ñënYzTm\u009c\u00ad'\u008d÷\fIK\u001c".length();
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

                  var17 = "ìT\u008bÂ\u009f£\u0091\u001f\u0091xd\u0017t\u0005\u0000U|®BÜÖþ´\u0017>!Ä8\u0085\u0005ÍnaXõ\u0084Kg{ê\u009fwª»ó;7ð\u0010s,S\u0088\rç£~\u0000ËºÈmÅ\u0097p";
                  var19 = "ìT\u008bÂ\u009f£\u0091\u001f\u0091xd\u0017t\u0005\u0000U|®BÜÖþ´\u0017>!Ä8\u0085\u0005ÍnaXõ\u0084Kg{ê\u009fwª»ó;7ð\u0010s,S\u0088\rç£~\u0000ËºÈmÅ\u0097p"
                     .length();
                  var16 = '0';
                  var24 = -1;
            }

            var25 = var17.substring(++var24, var24 + var16);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4353;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ke", var10);
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
         throw new RuntimeException("com/zelix/ke" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19552;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/ke", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("com/zelix/ke" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
