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

public class hj extends h4 implements l6, _8f, ru {
   xl M;
   private static final long a = ess.a(3927900715123535726L, 6478794687187352720L, MethodHandles.lookup().lookupClass()).a(170614080459497L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public void x(Object[] param1) {
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
      // 0e: checkcast com/zelix/md
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast com/zelix/md
      // 18: astore 5
      // 1a: pop
      // 1b: ldc2_w -1530444125322551674
      // 1e: lload 3
      // 1f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifne 54
      // 2c: ldc2_w -705479672350259043
      // 2f: lload 3
      // 30: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 2
      // 36: if_acmpne 5f
      // 39: goto 46
      // 3c: ldc2_w -1176329750548589490
      // 3f: lload 3
      // 40: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: goto 54
      // 4a: ldc2_w -1176329750548589490
      // 4d: lload 3
      // 4e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 5
      // 56: ldc2_w -705479672350259043
      // 59: lload 3
      // 5a: invokedynamic w (Ljava/lang/Object;Lcom/zelix/xl;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: return
   }

   md o(Object[] param1) {
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
      // 0c: getstatic com/zelix/hj.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 2100817860000360803
      // 15: lload 2
      // 16: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w 130884088197496696
      // 21: lload 2
      // 22: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifne 56
      // 2c: instanceof com/zelix/md
      // 2f: ifeq 5a
      // 32: goto 3f
      // 35: ldc2_w 1750081425339392939
      // 38: lload 2
      // 39: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: ldc2_w 130884088197496696
      // 43: lload 2
      // 44: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: goto 56
      // 4c: ldc2_w 1750081425339392939
      // 4f: lload 2
      // 50: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: checkcast com/zelix/md
      // 59: areturn
      // 5a: aconst_null
      // 5b: areturn
   }

   public void W(Object[] param1) {
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
      // 04: checkcast com/zelix/mf
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
      // 15: checkcast com/zelix/mf
      // 18: astore 5
      // 1a: pop
      // 1b: ldc2_w 2828745880801646379
      // 1e: lload 3
      // 1f: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifeq 54
      // 2c: ldc2_w 2792708705047812201
      // 2f: lload 3
      // 30: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 2
      // 36: if_acmpne 5f
      // 39: goto 46
      // 3c: ldc2_w 4564616405052949690
      // 3f: lload 3
      // 40: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: goto 54
      // 4a: ldc2_w 4564616405052949690
      // 4d: lload 3
      // 4e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 5
      // 56: ldc2_w 2792708705047812201
      // 59: lload 3
      // 5a: invokedynamic s (Ljava/lang/Object;Lcom/zelix/xl;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: return
   }

   ms c(Object[] param1) {
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
      // 0c: getstatic com/zelix/hj.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -3098227049604782742
      // 15: lload 2
      // 16: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -3134247742902048216
      // 21: lload 2
      // 22: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifeq 56
      // 2c: instanceof com/zelix/ms
      // 2f: ifeq 5a
      // 32: goto 3f
      // 35: ldc2_w -3667726825701837061
      // 38: lload 2
      // 39: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: ldc2_w -3134247742902048216
      // 43: lload 2
      // 44: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: goto 56
      // 4c: ldc2_w -3667726825701837061
      // 4f: lload 2
      // 50: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: checkcast com/zelix/ms
      // 59: areturn
      // 5a: aconst_null
      // 5b: areturn
   }

   long J(Object[] param1) {
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
      // 0c: getstatic com/zelix/hj.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 103839949341908
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 37586798499366
      // 1e: lxor
      // 1f: lstore 6
      // 21: pop2
      // 22: ldc2_w -4048799656783776885
      // 25: lload 2
      // 26: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 8
      // 2d: aload 0
      // 2e: ldc2_w -2650189172820613744
      // 31: lload 2
      // 32: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: instanceof com/zelix/ms
      // 3a: iload 8
      // 3c: ifne 75
      // 3f: ifeq 74
      // 42: goto 4f
      // 45: ldc2_w -4422018785755596477
      // 48: lload 2
      // 49: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: ldc2_w -2650189172820613744
      // 53: lload 2
      // 54: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: checkcast com/zelix/ms
      // 5c: bipush 0
      // 5d: anewarray 116
      // 60: ldc2_w -4269756653938540233
      // 63: lload 2
      // 64: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: lreturn
      // 6a: ldc2_w -4422018785755596477
      // 6d: lload 2
      // 6e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: bipush 0
      // 75: bipush 1
      // 76: anewarray 5
      // 79: dup
      // 7a: bipush 0
      // 7b: new java/lang/StringBuilder
      // 7e: dup
      // 7f: invokespecial java/lang/StringBuilder.<init> ()V
      // 82: aload 0
      // 83: lload 4
      // 85: invokevirtual com/zelix/hj.k (J)Ljava/lang/String;
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b: ldc " "
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: aload 0
      // 91: ldc2_w -2650189172820613744
      // 94: lload 2
      // 95: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 9d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a6: aastore
      // a7: lload 6
      // a9: dup2_x2
      // aa: pop2
      // ab: invokestatic com/zelix/lt.p (JZ[Ljava/lang/String;)V
      // ae: lconst_0
      // af: lreturn
   }

   hj(h8 param1, int param2, String param3, _xx param4, _y4 param5, _y4 param6, _y4 param7, long param8, _y4 param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hj.a J
      // 003: lload 8
      // 005: lxor
      // 006: lstore 8
      // 008: lload 8
      // 00a: dup2
      // 00b: ldc2_w 125112811931968
      // 00e: lxor
      // 00f: lstore 11
      // 011: dup2
      // 012: ldc2_w 55008127935161
      // 015: lxor
      // 016: lstore 13
      // 018: dup2
      // 019: ldc2_w 19976423981573
      // 01c: lxor
      // 01d: dup2
      // 01e: bipush 8
      // 020: lushr
      // 021: lstore 15
      // 023: dup2
      // 024: bipush 56
      // 026: lshl
      // 027: bipush 56
      // 029: lushr
      // 02a: l2i
      // 02b: istore 17
      // 02d: pop2
      // 02e: dup2
      // 02f: ldc2_w 92636573749994
      // 032: lxor
      // 033: lstore 18
      // 035: pop2
      // 036: ldc2_w 7517562282125909015
      // 039: lload 8
      // 03b: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 040: aload 0
      // 041: aload 1
      // 042: iload 2
      // 043: aload 3
      // 044: lload 11
      // 046: aload 4
      // 048: aload 5
      // 04a: invokespecial com/zelix/h4.<init> (Lcom/zelix/h8;ILjava/lang/String;JLcom/zelix/_xx;Lcom/zelix/_y4;)V
      // 04d: aload 4
      // 04f: invokevirtual com/zelix/_xx.readUnsignedShort ()I
      // 052: istore 21
      // 054: aload 0
      // 055: aload 0
      // 056: lload 15
      // 058: iload 21
      // 05a: iload 17
      // 05c: i2b
      // 05d: invokevirtual com/zelix/hj.N (JIB)Lcom/zelix/xl;
      // 060: ldc2_w 8405084440214129164
      // 063: lload 8
      // 065: invokedynamic v (Ljava/lang/Object;Lcom/zelix/xl;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: istore 20
      // 06c: aload 0
      // 06d: ldc2_w 8405084440214129164
      // 070: lload 8
      // 072: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: instanceof com/zelix/md
      // 07a: iload 20
      // 07c: ifne 0d5
      // 07f: ifeq 0b9
      // 082: goto 090
      // 085: ldc2_w 7871637315997554399
      // 088: lload 8
      // 08a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: aload 6
      // 092: aload 0
      // 093: ldc2_w 8405084440214129164
      // 096: lload 8
      // 098: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: checkcast com/zelix/md
      // 0a0: aload 0
      // 0a1: lload 13
      // 0a3: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0a6: iload 20
      // 0a8: ifeq 178
      // 0ab: goto 0b9
      // 0ae: ldc2_w 7871637315997554399
      // 0b1: lload 8
      // 0b3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: ldc2_w 8405084440214129164
      // 0bd: lload 8
      // 0bf: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: instanceof com/zelix/mf
      // 0c7: goto 0d5
      // 0ca: ldc2_w 7871637315997554399
      // 0cd: lload 8
      // 0cf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: iload 20
      // 0d7: lload 8
      // 0d9: lconst_0
      // 0da: lcmp
      // 0db: iflt 140
      // 0de: ifne 137
      // 0e1: ifeq 11b
      // 0e4: goto 0f2
      // 0e7: ldc2_w 7871637315997554399
      // 0ea: lload 8
      // 0ec: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 7
      // 0f4: aload 0
      // 0f5: ldc2_w 8405084440214129164
      // 0f8: lload 8
      // 0fa: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: checkcast com/zelix/mf
      // 102: aload 0
      // 103: lload 13
      // 105: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 108: iload 20
      // 10a: ifeq 178
      // 10d: goto 11b
      // 110: ldc2_w 7871637315997554399
      // 113: lload 8
      // 115: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 0
      // 11c: ldc2_w 8405084440214129164
      // 11f: lload 8
      // 121: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: instanceof com/zelix/ms
      // 129: goto 137
      // 12c: ldc2_w 7871637315997554399
      // 12f: lload 8
      // 131: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: lload 8
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 186
      // 13e: iload 20
      // 140: ifne 186
      // 143: ifeq 178
      // 146: goto 154
      // 149: ldc2_w 7871637315997554399
      // 14c: lload 8
      // 14e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: aload 10
      // 156: aload 0
      // 157: ldc2_w 8405084440214129164
      // 15a: lload 8
      // 15c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: checkcast com/zelix/ms
      // 164: aload 0
      // 165: lload 13
      // 167: invokevirtual com/zelix/_y4.G (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 16a: goto 178
      // 16d: ldc2_w 7871637315997554399
      // 170: lload 8
      // 172: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 177: athrow
      // 178: aload 0
      // 179: ldc2_w 8405084440214129164
      // 17c: lload 8
      // 17e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: instanceof com/zelix/ab
      // 186: ifne 1d1
      // 189: new com/zelix/_sx
      // 18c: dup
      // 18d: new java/lang/StringBuilder
      // 190: dup
      // 191: invokespecial java/lang/StringBuilder.<init> ()V
      // 194: aload 0
      // 195: lload 18
      // 197: invokevirtual com/zelix/hj.j (J)Ljava/lang/String;
      // 19a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19d: sipush 19729
      // 1a0: ldc2_w 2312939730895628892
      // 1a3: lload 8
      // 1a5: lxor
      // 1a6: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/hj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1ae: sipush 19295
      // 1b1: ldc2_w 5132641235260533779
      // 1b4: lload 8
      // 1b6: lxor
      // 1b7: invokedynamic e (IJ)Ljava/lang/String; bsm=com/zelix/hj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c2: invokespecial com/zelix/_sx.<init> (Ljava/lang/String;)V
      // 1c5: athrow
      // 1c6: ldc2_w 7871637315997554399
      // 1c9: lload 8
      // 1cb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: return
   }

   void N(long var1, _8l var3) {
      long var4 = var1 ^ 80221771876344L;
      long var6 = var1 ^ 10727274753381L;
      var3.H(this.c, this, this.x(), var6);
      x44.a<"o">((ab)x44.a<"k">(this, -6456258188881389362L, var1), var4, var3, this, this.x(), -6453773250535866203L, var1);
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
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Map
      // 19: astore 4
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/_ur
      // 21: astore 5
      // 23: pop
      // 24: lload 2
      // 25: dup2
      // 26: ldc2_w 0
      // 29: lxor
      // 2a: lstore 7
      // 2c: pop2
      // 2d: ldc2_w -3921248847547794946
      // 30: lload 2
      // 31: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: aload 0
      // 37: aload 6
      // 39: lload 7
      // 3b: aload 4
      // 3d: aload 5
      // 3f: bipush 4
      // 40: anewarray 116
      // 43: dup_x1
      // 44: swap
      // 45: bipush 3
      // 46: swap
      // 47: aastore
      // 48: dup_x1
      // 49: swap
      // 4a: bipush 2
      // 4b: swap
      // 4c: aastore
      // 4d: dup_x2
      // 4e: dup_x2
      // 4f: pop
      // 50: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 53: bipush 1
      // 54: swap
      // 55: aastore
      // 56: dup_x1
      // 57: swap
      // 58: bipush 0
      // 59: swap
      // 5a: aastore
      // 5b: invokespecial com/zelix/h4.j ([Ljava/lang/Object;)V
      // 5e: aload 4
      // 60: aload 0
      // 61: ldc2_w -4029344718863403332
      // 64: lload 2
      // 65: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 6f: checkcast com/zelix/xl
      // 72: astore 10
      // 74: istore 9
      // 76: iload 9
      // 78: ifeq a4
      // 7b: aload 10
      // 7d: ifnull af
      // 80: goto 8d
      // 83: ldc2_w -3346856249066853777
      // 86: lload 2
      // 87: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: aload 6
      // 8f: aload 10
      // 91: invokevirtual com/zelix/xl.B ()I
      // 94: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // 97: goto a4
      // 9a: ldc2_w -3346856249066853777
      // 9d: lload 2
      // 9e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: athrow
      // a4: lload 2
      // a5: lconst_0
      // a6: lcmp
      // a7: ifle c1
      // aa: iload 9
      // ac: ifne ce
      // af: aload 6
      // b1: aload 0
      // b2: ldc2_w -4029344718863403332
      // b5: lload 2
      // b6: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bb: invokevirtual com/zelix/xl.B ()I
      // be: invokevirtual java/io/DataOutputStream.writeShort (I)V
      // c1: goto ce
      // c4: ldc2_w -3346856249066853777
      // c7: lload 2
      // c8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd: athrow
      // ce: return
   }

   mf T(Object[] param1) {
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
      // 0c: getstatic com/zelix/hj.a J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -6339449143292094353
      // 15: lload 2
      // 16: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: ldc2_w -6231354371068160211
      // 21: lload 2
      // 22: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: iload 4
      // 29: ifeq 56
      // 2c: instanceof com/zelix/mf
      // 2f: ifeq 5a
      // 32: goto 3f
      // 35: ldc2_w -5756515546003043330
      // 38: lload 2
      // 39: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: aload 0
      // 40: ldc2_w -6231354371068160211
      // 43: lload 2
      // 44: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: goto 56
      // 4c: ldc2_w -5756515546003043330
      // 4f: lload 2
      // 50: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: checkcast com/zelix/mf
      // 59: areturn
      // 5a: aconst_null
      // 5b: areturn
   }

   protected void O(Object[] var1) {
      long var2 = (Long)var1[0];
      DataOutputStream var4 = (DataOutputStream)var1[1];
      long var5 = var2 ^ 0L;
      super.O(new Object[]{var5, var4});
      var4.writeShort(x44.a<"h">(this, -7704070976997119043L, var2).B());
   }

   public void U(Object[] param1) {
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
      // 04: checkcast com/zelix/ms
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
      // 15: checkcast com/zelix/ms
      // 18: astore 5
      // 1a: pop
      // 1b: ldc2_w -3832315298333263174
      // 1e: lload 3
      // 1f: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifeq 54
      // 2c: ldc2_w -3796278114527414792
      // 2f: lload 3
      // 30: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35: aload 2
      // 36: if_acmpne 5f
      // 39: goto 46
      // 3c: ldc2_w -3257898575021020885
      // 3f: lload 3
      // 40: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: athrow
      // 46: aload 0
      // 47: goto 54
      // 4a: ldc2_w -3257898575021020885
      // 4d: lload 3
      // 4e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 5
      // 56: ldc2_w -3796278114527414792
      // 59: lload 3
      // 5a: invokedynamic r (Ljava/lang/Object;Lcom/zelix/xl;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: return
   }

   hj(h8 var1, mx var2, long var3, ab var5) {
      var3 = a ^ var3;
      super(var1, var2, 2);
      x44.a<"r">(this, (xl)var5, -7919300510901687120L, var3);
   }

   static {
      long var0 = a ^ 8962933602693L;
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
      String var6 = "ÄÔÕ%â\u008fxme\u0086¾ß\u009e?\u0016g\u001f\u008a4:êHÑú,Ö?cË\u0083OÂ~û\u0006§3§\u00137Ôø\u0017êán,ç\u0081Â\u001b\u0097×Þ\u001bö\u0010>ÉRë\u0099][µg\u0084¢î.Öí\u008e";
      int var8 = "ÄÔÕ%â\u008fxme\u0086¾ß\u009e?\u0016g\u001f\u008a4:êHÑú,Ö?cË\u0083OÂ~û\u0006§3§\u00137Ôø\u0017êán,ç\u0081Â\u001b\u0097×Þ\u001bö\u0010>ÉRë\u0099][µg\u0084¢î.Öí\u008e"
         .length();
      char var5 = '8';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24266;
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
            throw new RuntimeException("com/zelix/hj", var10);
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
         throw new RuntimeException("com/zelix/hj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
