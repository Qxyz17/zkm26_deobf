package com.zelix;

import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ig extends iu implements w2, xz {
   private _op N;
   private _fh h;
   private static final long b = ess.a(4325727566772413502L, -3043481724488549546L, MethodHandles.lookup().lookupClass()).a(240058585477638L);
   private static final String[] v;
   private static final String[] x;
   private static final Map y = new HashMap(13);
   private static final long P;

   void X(Object[] param1) {
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
      // 0c: ldc2_w 8199629155929572750
      // 0f: lload 2
      // 10: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: aload 0
      // 16: bipush -1
      // 17: putfield com/zelix/ig.H I
      // 1a: aload 0
      // 1b: bipush -1
      // 1c: putfield com/zelix/ig.d I
      // 1f: istore 4
      // 21: bipush 0
      // 22: istore 5
      // 24: iload 5
      // 26: aload 0
      // 27: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 2a: arraylength
      // 2b: if_icmpge ab
      // 2e: aload 0
      // 2f: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 32: iload 5
      // 34: aaload
      // 35: instanceof com/zelix/h_
      // 38: iload 4
      // 3a: ifne 9a
      // 3d: ifeq 6b
      // 40: goto 4d
      // 43: ldc2_w 7995253632314136410
      // 46: lload 2
      // 47: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: aload 0
      // 4e: iload 5
      // 50: putfield com/zelix/ig.H I
      // 53: iload 4
      // 55: lload 2
      // 56: lconst_0
      // 57: lcmp
      // 58: iflt a8
      // 5b: ifeq a3
      // 5e: goto 6b
      // 61: ldc2_w 7995253632314136410
      // 64: lload 2
      // 65: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 0
      // 6c: iload 4
      // 6e: lload 2
      // 6f: lconst_0
      // 70: lcmp
      // 71: ifle a0
      // 74: ifne 9e
      // 77: goto 84
      // 7a: ldc2_w 7995253632314136410
      // 7d: lload 2
      // 7e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 87: iload 5
      // 89: aaload
      // 8a: instanceof com/zelix/hb
      // 8d: goto 9a
      // 90: ldc2_w 7995253632314136410
      // 93: lload 2
      // 94: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: ifeq a3
      // 9d: aload 0
      // 9e: iload 5
      // a0: putfield com/zelix/ig.d I
      // a3: iinc 5 1
      // a6: iload 4
      // a8: ifeq 24
      // ab: lload 2
      // ac: lconst_0
      // ad: lcmp
      // ae: ifle 2e
      // b1: return
   }

   public void GC(Object[] param1) {
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
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: getstatic com/zelix/ig.b J
      // 19: lload 3
      // 1a: lxor
      // 1b: lstore 3
      // 1c: lload 3
      // 1d: dup2
      // 1e: ldc2_w 119255940705774
      // 21: lxor
      // 22: lstore 5
      // 24: pop2
      // 25: ldc2_w 3373141594361043595
      // 28: lload 3
      // 29: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e: istore 7
      // 30: aload 0
      // 31: iload 7
      // 33: ifne 58
      // 36: getfield com/zelix/ig.H I
      // 39: bipush -1
      // 3a: if_icmpeq 87
      // 3d: goto 4a
      // 40: ldc2_w 3598932454999459935
      // 43: lload 3
      // 44: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49: athrow
      // 4a: aload 0
      // 4b: goto 58
      // 4e: ldc2_w 3598932454999459935
      // 51: lload 3
      // 52: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 5b: aload 0
      // 5c: getfield com/zelix/ig.H I
      // 5f: aaload
      // 60: checkcast com/zelix/h_
      // 63: checkcast com/zelix/h_
      // 66: iload 2
      // 67: lload 5
      // 69: bipush 2
      // 6a: anewarray 46
      // 6d: dup_x2
      // 6e: dup_x2
      // 6f: pop
      // 70: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 73: bipush 1
      // 74: swap
      // 75: aastore
      // 76: dup_x1
      // 77: swap
      // 78: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w 3289854311280120944
      // 81: lload 3
      // 82: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: return
   }

   void ER(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 75375154689560
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 6851867420320624508
      // 1e: lload 2
      // 1f: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 2f: arraylength
      // 30: if_icmpge 8f
      // 33: aload 0
      // 34: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 37: iload 7
      // 39: aaload
      // 3a: iload 6
      // 3c: ifeq 6c
      // 3f: instanceof com/zelix/bi
      // 42: lload 2
      // 43: lconst_0
      // 44: lcmp
      // 45: iflt 8c
      // 48: ifeq 87
      // 4b: goto 58
      // 4e: ldc2_w 6728345954337645809
      // 51: lload 2
      // 52: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: aload 0
      // 59: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 5c: iload 7
      // 5e: aaload
      // 5f: goto 6c
      // 62: ldc2_w 6728345954337645809
      // 65: lload 2
      // 66: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: checkcast com/zelix/bi
      // 6f: lload 4
      // 71: bipush 1
      // 72: anewarray 46
      // 75: dup_x2
      // 76: dup_x2
      // 77: pop
      // 78: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7b: bipush 0
      // 7c: swap
      // 7d: aastore
      // 7e: ldc2_w 6841989937876479273
      // 81: lload 2
      // 82: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: iinc 7 1
      // 8a: iload 6
      // 8c: ifne 29
      // 8f: lload 2
      // 90: lconst_0
      // 91: lcmp
      // 92: ifle 33
      // 95: return
   }

   public int r(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -7033318465882509810
      // 15: lload 2
      // 16: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/ig.H I
      // 21: iload 4
      // 23: ifeq 55
      // 26: bipush -1
      // 27: if_icmpeq 54
      // 2a: goto 37
      // 2d: ldc2_w -7192818167459895933
      // 30: lload 2
      // 31: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: aload 0
      // 38: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 3b: aload 0
      // 3c: getfield com/zelix/ig.H I
      // 3f: aaload
      // 40: checkcast com/zelix/h_
      // 43: checkcast com/zelix/h_
      // 46: invokevirtual com/zelix/h_.D ()I
      // 49: ireturn
      // 4a: ldc2_w -7192818167459895933
      // 4d: lload 2
      // 4e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: bipush 0
      // 55: ireturn
   }

   boolean f(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/_fm
      // 011: astore 10
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/we
      // 019: astore 11
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/util/List
      // 021: astore 8
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/util/List
      // 029: astore 6
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/util/List
      // 031: astore 9
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/vx
      // 03a: astore 4
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast java/lang/Boolean
      // 043: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 046: istore 12
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast java/lang/Boolean
      // 04f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 052: istore 7
      // 054: dup
      // 055: bipush 9
      // 057: aaload
      // 058: checkcast com/zelix/ei
      // 05b: astore 13
      // 05d: dup
      // 05e: bipush 10
      // 060: aaload
      // 061: checkcast com/zelix/_ur
      // 064: astore 5
      // 066: pop
      // 067: getstatic com/zelix/ig.b J
      // 06a: lload 2
      // 06b: lxor
      // 06c: lstore 2
      // 06d: lload 2
      // 06e: dup2
      // 06f: ldc2_w 128265491649086
      // 072: lxor
      // 073: lstore 14
      // 075: dup2
      // 076: ldc2_w 75125706777741
      // 079: lxor
      // 07a: lstore 16
      // 07c: dup2
      // 07d: ldc2_w 322985168916
      // 080: lxor
      // 081: lstore 18
      // 083: dup2
      // 084: ldc2_w 123587936756977
      // 087: lxor
      // 088: lstore 20
      // 08a: dup2
      // 08b: ldc2_w 123305635867455
      // 08e: lxor
      // 08f: lstore 22
      // 091: dup2
      // 092: ldc2_w 78884285708598
      // 095: lxor
      // 096: lstore 24
      // 098: dup2
      // 099: ldc2_w 128904194386841
      // 09c: lxor
      // 09d: lstore 26
      // 09f: dup2
      // 0a0: ldc2_w 124834161393113
      // 0a3: lxor
      // 0a4: lstore 28
      // 0a6: pop2
      // 0a7: ldc2_w -7117478933990495875
      // 0aa: lload 2
      // 0ab: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: bipush 0
      // 0b1: istore 31
      // 0b3: aconst_null
      // 0b4: astore 32
      // 0b6: istore 30
      // 0b8: aload 0
      // 0b9: iload 30
      // 0bb: ifne 0e0
      // 0be: getfield com/zelix/ig.H I
      // 0c1: bipush -1
      // 0c2: if_icmpeq 47e
      // 0c5: goto 0d2
      // 0c8: ldc2_w -9077122654279189591
      // 0cb: lload 2
      // 0cc: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: goto 0e0
      // 0d6: ldc2_w -9077122654279189591
      // 0d9: lload 2
      // 0da: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: iload 30
      // 0e2: lload 2
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: ifle 355
      // 0e8: ifne 353
      // 0eb: ldc2_w -8661102756372734609
      // 0ee: lload 2
      // 0ef: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_fh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: ifnull 352
      // 0f7: goto 104
      // 0fa: ldc2_w -9077122654279189591
      // 0fd: lload 2
      // 0fe: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: aload 0
      // 105: ldc2_w -8661102756372734609
      // 108: lload 2
      // 109: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_fh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: sipush 5563
      // 111: ldc2_w 5622364914746264420
      // 114: lload 2
      // 115: lxor
      // 116: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: lload 18
      // 11d: bipush 2
      // 11e: anewarray 46
      // 121: dup_x2
      // 122: dup_x2
      // 123: pop
      // 124: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 127: bipush 1
      // 128: swap
      // 129: aastore
      // 12a: dup_x1
      // 12b: swap
      // 12c: bipush 0
      // 12d: swap
      // 12e: aastore
      // 12f: ldc2_w -7426684314265052024
      // 132: lload 2
      // 133: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: iload 30
      // 13a: ifne 368
      // 13d: goto 14a
      // 140: ldc2_w -9077122654279189591
      // 143: lload 2
      // 144: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: ifeq 352
      // 14d: goto 15a
      // 150: ldc2_w -9077122654279189591
      // 153: lload 2
      // 154: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 159: athrow
      // 15a: aload 0
      // 15b: ldc2_w -8661102756372734609
      // 15e: lload 2
      // 15f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/_fh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: sipush 14595
      // 167: ldc2_w 3384122253216950213
      // 16a: lload 2
      // 16b: lxor
      // 16c: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: lload 28
      // 173: bipush 2
      // 174: anewarray 46
      // 177: dup_x2
      // 178: dup_x2
      // 179: pop
      // 17a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17d: bipush 1
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: bipush 0
      // 183: swap
      // 184: aastore
      // 185: ldc2_w -7425190147891590267
      // 188: lload 2
      // 189: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: astore 33
      // 190: aload 33
      // 192: ldc2_w -7418584452584678516
      // 195: lload 2
      // 196: invokedynamic w (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: istore 34
      // 19d: iload 34
      // 19f: iload 12
      // 1a1: iload 30
      // 1a3: ifne 1b7
      // 1a6: ifeq 1ba
      // 1a9: goto 1b6
      // 1ac: ldc2_w -9077122654279189591
      // 1af: lload 2
      // 1b0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: athrow
      // 1b6: bipush 2
      // 1b7: goto 1bb
      // 1ba: bipush 1
      // 1bb: lload 2
      // 1bc: lconst_0
      // 1bd: lcmp
      // 1be: ifle 1c8
      // 1c1: if_icmpeq 352
      // 1c4: iload 12
      // 1c6: iload 30
      // 1c8: ifne 1e9
      // 1cb: goto 1d8
      // 1ce: ldc2_w -9077122654279189591
      // 1d1: lload 2
      // 1d2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: ifeq 1ec
      // 1db: goto 1e8
      // 1de: ldc2_w -9077122654279189591
      // 1e1: lload 2
      // 1e2: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: bipush 2
      // 1e9: goto 1ed
      // 1ec: bipush 1
      // 1ed: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f0: ldc2_w -7051483282793375378
      // 1f3: lload 2
      // 1f4: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: astore 35
      // 1fb: aload 5
      // 1fd: ldc2_w -6990584906924249233
      // 200: lload 2
      // 201: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: iload 30
      // 208: lload 2
      // 209: lconst_0
      // 20a: lcmp
      // 20b: iflt 306
      // 20e: ifne 304
      // 211: ifeq 302
      // 214: goto 221
      // 217: ldc2_w -9077122654279189591
      // 21a: lload 2
      // 21b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 5
      // 223: lload 20
      // 225: bipush 1
      // 226: anewarray 46
      // 229: dup_x2
      // 22a: dup_x2
      // 22b: pop
      // 22c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22f: bipush 0
      // 230: swap
      // 231: aastore
      // 232: ldc2_w -7400788376316313989
      // 235: lload 2
      // 236: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23b: astore 36
      // 23d: aload 36
      // 23f: new java/lang/StringBuilder
      // 242: dup
      // 243: invokespecial java/lang/StringBuilder.<init> ()V
      // 246: sipush 9694
      // 249: ldc2_w 1880483932694854404
      // 24c: lload 2
      // 24d: lxor
      // 24e: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 256: lload 24
      // 258: aload 0
      // 259: bipush 1
      // 25a: aload 11
      // 25c: bipush 4
      // 25d: anewarray 46
      // 260: dup_x1
      // 261: swap
      // 262: bipush 3
      // 263: swap
      // 264: aastore
      // 265: dup_x1
      // 266: swap
      // 267: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 26a: bipush 2
      // 26b: swap
      // 26c: aastore
      // 26d: dup_x1
      // 26e: swap
      // 26f: bipush 1
      // 270: swap
      // 271: aastore
      // 272: dup_x2
      // 273: dup_x2
      // 274: pop
      // 275: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 278: bipush 0
      // 279: swap
      // 27a: aastore
      // 27b: ldc2_w -7047679985182778609
      // 27e: lload 2
      // 27f: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 287: sipush 282
      // 28a: ldc2_w 8944795281890222024
      // 28d: lload 2
      // 28e: lxor
      // 28f: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 297: aload 0
      // 298: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 29b: lload 26
      // 29d: dup2_x1
      // 29e: pop2
      // 29f: aload 11
      // 2a1: bipush 1
      // 2a2: bipush 4
      // 2a3: anewarray 46
      // 2a6: dup_x1
      // 2a7: swap
      // 2a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2ab: bipush 3
      // 2ac: swap
      // 2ad: aastore
      // 2ae: dup_x1
      // 2af: swap
      // 2b0: bipush 2
      // 2b1: swap
      // 2b2: aastore
      // 2b3: dup_x1
      // 2b4: swap
      // 2b5: bipush 1
      // 2b6: swap
      // 2b7: aastore
      // 2b8: dup_x2
      // 2b9: dup_x2
      // 2ba: pop
      // 2bb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2be: bipush 0
      // 2bf: swap
      // 2c0: aastore
      // 2c1: ldc2_w -7469400224509788136
      // 2c4: lload 2
      // 2c5: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cd: sipush 30871
      // 2d0: ldc2_w 7018616567590970948
      // 2d3: lload 2
      // 2d4: lxor
      // 2d5: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2dd: aload 35
      // 2df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e2: sipush 18846
      // 2e5: ldc2_w 2851802446480103246
      // 2e8: lload 2
      // 2e9: lxor
      // 2ea: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f2: aload 33
      // 2f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f7: ldc "'"
      // 2f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2fc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ff: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 302: iload 34
      // 304: iload 30
      // 306: lload 2
      // 307: lconst_0
      // 308: lcmp
      // 309: iflt 369
      // 30c: ifne 368
      // 30f: tableswitch 67 0 2 35 47 61
      // 328: ldc2_w -9077122654279189591
      // 32b: lload 2
      // 32c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: bipush 0
      // 333: ireturn
      // 334: ldc2_w -9077122654279189591
      // 337: lload 2
      // 338: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: athrow
      // 33e: bipush 0
      // 33f: istore 12
      // 341: iload 30
      // 343: lload 2
      // 344: lconst_0
      // 345: lcmp
      // 346: iflt 34d
      // 349: ifeq 352
      // 34c: bipush 1
      // 34d: istore 12
      // 34f: goto 352
      // 352: aload 0
      // 353: iload 30
      // 355: ifne 37a
      // 358: getfield com/zelix/ig.d I
      // 35b: goto 368
      // 35e: ldc2_w -9077122654279189591
      // 361: lload 2
      // 362: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 367: athrow
      // 368: bipush -1
      // 369: if_icmpeq 403
      // 36c: aload 0
      // 36d: goto 37a
      // 370: ldc2_w -9077122654279189591
      // 373: lload 2
      // 374: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: athrow
      // 37a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 37d: aload 0
      // 37e: getfield com/zelix/ig.d I
      // 381: aaload
      // 382: checkcast com/zelix/hb
      // 385: checkcast com/zelix/hb
      // 388: astore 33
      // 38a: new java/util/ArrayList
      // 38d: dup
      // 38e: aload 33
      // 390: lload 14
      // 392: bipush 1
      // 393: anewarray 46
      // 396: dup_x2
      // 397: dup_x2
      // 398: pop
      // 399: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 39c: bipush 0
      // 39d: swap
      // 39e: aastore
      // 39f: ldc2_w -6977626005681407023
      // 3a2: lload 2
      // 3a3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: invokespecial java/util/ArrayList.<init> (I)V
      // 3ab: astore 32
      // 3ad: aload 33
      // 3af: lload 16
      // 3b1: bipush 1
      // 3b2: anewarray 46
      // 3b5: dup_x2
      // 3b6: dup_x2
      // 3b7: pop
      // 3b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3bb: bipush 0
      // 3bc: swap
      // 3bd: aastore
      // 3be: ldc2_w -7077150723184647886
      // 3c1: lload 2
      // 3c2: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: astore 34
      // 3c9: aload 34
      // 3cb: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 3d0: ifeq 403
      // 3d3: aload 32
      // 3d5: aload 34
      // 3d7: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 3dc: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 3df: pop
      // 3e0: iload 30
      // 3e2: lload 2
      // 3e3: lconst_0
      // 3e4: lcmp
      // 3e5: ifle 480
      // 3e8: ifne 47e
      // 3eb: iload 30
      // 3ed: ifeq 3c9
      // 3f0: lload 2
      // 3f1: lconst_0
      // 3f2: lcmp
      // 3f3: iflt 3e0
      // 3f6: goto 403
      // 3f9: ldc2_w -9077122654279189591
      // 3fc: lload 2
      // 3fd: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 402: athrow
      // 403: aload 0
      // 404: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 407: aload 0
      // 408: getfield com/zelix/ig.H I
      // 40b: aaload
      // 40c: checkcast com/zelix/h_
      // 40f: checkcast com/zelix/h_
      // 412: aload 10
      // 414: aload 11
      // 416: aload 8
      // 418: aload 6
      // 41a: aload 32
      // 41c: aload 9
      // 41e: aload 4
      // 420: iload 12
      // 422: iload 7
      // 424: aload 13
      // 426: lload 22
      // 428: bipush 11
      // 42a: anewarray 46
      // 42d: dup_x2
      // 42e: dup_x2
      // 42f: pop
      // 430: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 433: bipush 10
      // 435: swap
      // 436: aastore
      // 437: dup_x1
      // 438: swap
      // 439: bipush 9
      // 43b: swap
      // 43c: aastore
      // 43d: dup_x1
      // 43e: swap
      // 43f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 442: bipush 8
      // 444: swap
      // 445: aastore
      // 446: dup_x1
      // 447: swap
      // 448: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 44b: bipush 7
      // 44d: swap
      // 44e: aastore
      // 44f: dup_x1
      // 450: swap
      // 451: bipush 6
      // 453: swap
      // 454: aastore
      // 455: dup_x1
      // 456: swap
      // 457: bipush 5
      // 458: swap
      // 459: aastore
      // 45a: dup_x1
      // 45b: swap
      // 45c: bipush 4
      // 45d: swap
      // 45e: aastore
      // 45f: dup_x1
      // 460: swap
      // 461: bipush 3
      // 462: swap
      // 463: aastore
      // 464: dup_x1
      // 465: swap
      // 466: bipush 2
      // 467: swap
      // 468: aastore
      // 469: dup_x1
      // 46a: swap
      // 46b: bipush 1
      // 46c: swap
      // 46d: aastore
      // 46e: dup_x1
      // 46f: swap
      // 470: bipush 0
      // 471: swap
      // 472: aastore
      // 473: ldc2_w -7067250766034662184
      // 476: lload 2
      // 477: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47c: istore 31
      // 47e: iload 31
      // 480: ireturn
   }

   public boolean w(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 100569141773997
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2605945499623297135
      // 1e: lload 2
      // 1f: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/ig.H I
      // 2a: iload 6
      // 2c: ifne 73
      // 2f: bipush -1
      // 30: if_icmpeq 72
      // 33: goto 40
      // 36: ldc2_w -4257056373364294331
      // 39: lload 2
      // 3a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 44: aload 0
      // 45: getfield com/zelix/ig.H I
      // 48: aaload
      // 49: checkcast com/zelix/h_
      // 4c: checkcast com/zelix/h_
      // 4f: lload 4
      // 51: bipush 1
      // 52: anewarray 46
      // 55: dup_x2
      // 56: dup_x2
      // 57: pop
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: bipush 0
      // 5c: swap
      // 5d: aastore
      // 5e: ldc2_w -2718492506334621694
      // 61: lload 2
      // 62: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: ireturn
      // 68: ldc2_w -4257056373364294331
      // 6b: lload 2
      // 6c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: bipush 0
      // 73: ireturn
   }

   public int[] s(Object[] param1) {
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
      // 04: checkcast java/util/List
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Integer
      // 0e: invokevirtual java/lang/Integer.intValue ()I
      // 11: istore 9
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 8
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Integer
      // 24: invokevirtual java/lang/Integer.intValue ()I
      // 27: istore 2
      // 28: dup
      // 29: bipush 4
      // 2a: aaload
      // 2b: checkcast java/lang/String
      // 2e: astore 5
      // 30: dup
      // 31: bipush 5
      // 32: aaload
      // 33: checkcast java/lang/Long
      // 36: invokevirtual java/lang/Long.longValue ()J
      // 39: lstore 6
      // 3b: dup
      // 3c: bipush 6
      // 3e: aaload
      // 3f: checkcast java/util/List
      // 42: astore 4
      // 44: pop
      // 45: getstatic com/zelix/ig.b J
      // 48: lload 6
      // 4a: lxor
      // 4b: lstore 6
      // 4d: lload 6
      // 4f: dup2
      // 50: ldc2_w 77907170361998
      // 53: lxor
      // 54: lstore 10
      // 56: pop2
      // 57: ldc2_w 557861151387498455
      // 5a: lload 6
      // 5c: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: istore 12
      // 63: aload 0
      // 64: iload 12
      // 66: ifeq 8d
      // 69: getfield com/zelix/ig.H I
      // 6c: bipush -1
      // 6d: if_icmpeq e8
      // 70: goto 7e
      // 73: ldc2_w 429161515992628314
      // 76: lload 6
      // 78: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: goto 8d
      // 82: ldc2_w 429161515992628314
      // 85: lload 6
      // 87: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 90: aload 0
      // 91: getfield com/zelix/ig.H I
      // 94: aaload
      // 95: checkcast com/zelix/h_
      // 98: checkcast com/zelix/h_
      // 9b: aload 3
      // 9c: lload 10
      // 9e: iload 9
      // a0: iload 8
      // a2: iload 2
      // a3: aload 5
      // a5: aload 4
      // a7: bipush 7
      // a9: anewarray 46
      // ac: dup_x1
      // ad: swap
      // ae: bipush 6
      // b0: swap
      // b1: aastore
      // b2: dup_x1
      // b3: swap
      // b4: bipush 5
      // b5: swap
      // b6: aastore
      // b7: dup_x1
      // b8: swap
      // b9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // bc: bipush 4
      // bd: swap
      // be: aastore
      // bf: dup_x1
      // c0: swap
      // c1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c4: bipush 3
      // c5: swap
      // c6: aastore
      // c7: dup_x1
      // c8: swap
      // c9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // cc: bipush 2
      // cd: swap
      // ce: aastore
      // cf: dup_x2
      // d0: dup_x2
      // d1: pop
      // d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d5: bipush 1
      // d6: swap
      // d7: aastore
      // d8: dup_x1
      // d9: swap
      // da: bipush 0
      // db: swap
      // dc: aastore
      // dd: ldc2_w 527391386726632104
      // e0: lload 6
      // e2: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)[I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e7: areturn
      // e8: aconst_null
      // e9: areturn
   }

   void Yf(Object[] param1) {
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
      // 004: checkcast com/zelix/_8c
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Integer
      // 00f: invokevirtual java/lang/Integer.intValue ()I
      // 012: istore 8
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/ArrayList
      // 01a: astore 7
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/_fm
      // 022: astore 2
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/we
      // 029: astore 6
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/lang/Integer
      // 031: invokevirtual java/lang/Integer.intValue ()I
      // 034: istore 5
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/lang/Integer
      // 03d: invokevirtual java/lang/Integer.intValue ()I
      // 040: istore 3
      // 041: pop
      // 042: iload 8
      // 044: i2l
      // 045: bipush 48
      // 047: lshl
      // 048: iload 5
      // 04a: i2l
      // 04b: bipush 32
      // 04d: lshl
      // 04e: bipush 16
      // 050: lushr
      // 051: lor
      // 052: iload 3
      // 053: i2l
      // 054: bipush 48
      // 056: lshl
      // 057: bipush 48
      // 059: lushr
      // 05a: lor
      // 05b: getstatic com/zelix/ig.b J
      // 05e: lxor
      // 05f: lstore 9
      // 061: lload 9
      // 063: dup2
      // 064: ldc2_w 127023300557386
      // 067: lxor
      // 068: lstore 11
      // 06a: dup2
      // 06b: ldc2_w 76906604149574
      // 06e: lxor
      // 06f: lstore 13
      // 071: pop2
      // 072: ldc2_w -3700292149046347551
      // 075: lload 9
      // 077: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: istore 15
      // 07e: aload 0
      // 07f: iload 15
      // 081: ifne 0a8
      // 084: getfield com/zelix/ig.H I
      // 087: bipush -1
      // 088: if_icmpeq 10d
      // 08b: goto 099
      // 08e: ldc2_w -3198720727044920779
      // 091: lload 9
      // 093: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: aload 0
      // 09a: goto 0a8
      // 09d: ldc2_w -3198720727044920779
      // 0a0: lload 9
      // 0a2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0ab: aload 0
      // 0ac: getfield com/zelix/ig.H I
      // 0af: aaload
      // 0b0: checkcast com/zelix/h_
      // 0b3: checkcast com/zelix/h_
      // 0b6: aload 0
      // 0b7: lload 13
      // 0b9: bipush 1
      // 0ba: anewarray 46
      // 0bd: dup_x2
      // 0be: dup_x2
      // 0bf: pop
      // 0c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c3: bipush 0
      // 0c4: swap
      // 0c5: aastore
      // 0c6: ldc2_w -3975210990716336241
      // 0c9: lload 9
      // 0cb: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: aload 4
      // 0d2: aload 7
      // 0d4: lload 11
      // 0d6: aload 2
      // 0d7: aload 6
      // 0d9: bipush 6
      // 0db: anewarray 46
      // 0de: dup_x1
      // 0df: swap
      // 0e0: bipush 5
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: bipush 4
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 3
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: bipush 2
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 1
      // 0f9: swap
      // 0fa: aastore
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 100: bipush 0
      // 101: swap
      // 102: aastore
      // 103: ldc2_w -4007150408906844727
      // 106: lload 9
      // 108: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: return
   }

   public boolean v(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;

      try {
         if (x44.a<"n">(this, -1312614622296115350L, var2) != null) {
            return true;
         }
      } catch (gj var4) {
         throw x44.a<"r">(var4, -1728636706334649940L, var2);
      }

      return false;
   }

   void Ea(Object[] param1) {
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
      // 00c: getstatic com/zelix/ig.b J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 84916277718757
      // 017: lxor
      // 018: lstore 4
      // 01a: pop2
      // 01b: ldc2_w -2364492621498291349
      // 01e: lload 2
      // 01f: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: new java/util/ArrayList
      // 027: dup
      // 028: aload 0
      // 029: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 02c: arraylength
      // 02d: invokespecial java/util/ArrayList.<init> (I)V
      // 030: astore 7
      // 032: bipush 0
      // 033: istore 8
      // 035: istore 6
      // 037: iload 8
      // 039: aload 0
      // 03a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 03d: arraylength
      // 03e: if_icmpge 095
      // 041: aload 0
      // 042: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 045: iload 8
      // 047: aaload
      // 048: instanceof com/zelix/bi
      // 04b: iload 6
      // 04d: lload 2
      // 04e: lconst_0
      // 04f: lcmp
      // 050: iflt 0a4
      // 053: ifne 0a2
      // 056: iload 6
      // 058: ifne 08c
      // 05b: goto 068
      // 05e: ldc2_w -4606736109426312769
      // 061: lload 2
      // 062: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: athrow
      // 068: ifeq 07e
      // 06b: goto 078
      // 06e: ldc2_w -4606736109426312769
      // 071: lload 2
      // 072: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: lload 2
      // 079: lconst_0
      // 07a: lcmp
      // 07b: ifge 08d
      // 07e: aload 7
      // 080: aload 0
      // 081: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 084: iload 8
      // 086: aaload
      // 087: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 08c: pop
      // 08d: iinc 8 1
      // 090: iload 6
      // 092: ifeq 037
      // 095: aload 7
      // 097: lload 2
      // 098: lconst_0
      // 099: lcmp
      // 09a: ifle 0c4
      // 09d: invokeinterface java/util/List.size ()I 1
      // 0a2: iload 6
      // 0a4: lload 2
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: ifle 0b2
      // 0aa: ifne 0d6
      // 0ad: aload 0
      // 0ae: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0b1: arraylength
      // 0b2: if_icmpge 10d
      // 0b5: goto 0c2
      // 0b8: ldc2_w -4606736109426312769
      // 0bb: lload 2
      // 0bc: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: aload 7
      // 0c4: invokeinterface java/util/List.size ()I 1
      // 0c9: goto 0d6
      // 0cc: ldc2_w -4606736109426312769
      // 0cf: lload 2
      // 0d0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: anewarray 442
      // 0d9: astore 8
      // 0db: aload 0
      // 0dc: aload 7
      // 0de: aload 8
      // 0e0: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 0e5: checkcast [Lcom/zelix/h4;
      // 0e8: putfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0eb: aload 0
      // 0ec: aload 0
      // 0ed: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0f0: arraylength
      // 0f1: putfield com/zelix/ig.F I
      // 0f4: aload 0
      // 0f5: lload 4
      // 0f7: bipush 1
      // 0f8: anewarray 46
      // 0fb: dup_x2
      // 0fc: dup_x2
      // 0fd: pop
      // 0fe: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 101: bipush 0
      // 102: swap
      // 103: aastore
      // 104: ldc2_w -4276689208679605516
      // 107: lload 2
      // 108: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: return
   }

   int x(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 8757695925395343843
      // 15: lload 2
      // 16: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/ig.H I
      // 21: iload 4
      // 23: ifeq 55
      // 26: bipush -1
      // 27: if_icmpeq 54
      // 2a: goto 37
      // 2d: ldc2_w 8917353666267071086
      // 30: lload 2
      // 31: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: aload 0
      // 38: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 3b: aload 0
      // 3c: getfield com/zelix/ig.H I
      // 3f: aaload
      // 40: checkcast com/zelix/h_
      // 43: checkcast com/zelix/h_
      // 46: invokevirtual com/zelix/h_.D ()I
      // 49: ireturn
      // 4a: ldc2_w 8917353666267071086
      // 4d: lload 2
      // 4e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: bipush 0
      // 55: ireturn
   }

   public void d2(Object[] param1) {
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
      // 04: checkcast java/util/List
      // 07: astore 7
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/Map
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 8
      // 1c: dup
      // 1d: bipush 3
      // 1e: aaload
      // 1f: checkcast com/zelix/_8c
      // 22: astore 5
      // 24: dup
      // 25: bipush 4
      // 26: aaload
      // 27: checkcast java/util/List
      // 2a: astore 10
      // 2c: dup
      // 2d: bipush 5
      // 2e: aaload
      // 2f: checkcast com/zelix/_yv
      // 32: astore 3
      // 33: dup
      // 34: bipush 6
      // 36: aaload
      // 37: checkcast com/zelix/_ug
      // 3a: astore 2
      // 3b: dup
      // 3c: bipush 7
      // 3e: aaload
      // 3f: checkcast java/lang/String
      // 42: astore 11
      // 44: dup
      // 45: bipush 8
      // 47: aaload
      // 48: checkcast java/lang/Boolean
      // 4b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4e: istore 6
      // 50: pop
      // 51: getstatic com/zelix/ig.b J
      // 54: lload 8
      // 56: lxor
      // 57: lstore 8
      // 59: lload 8
      // 5b: dup2
      // 5c: ldc2_w 109954760331108
      // 5f: lxor
      // 60: lstore 12
      // 62: pop2
      // 63: ldc2_w -2563736808847971327
      // 66: lload 8
      // 68: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6d: istore 14
      // 6f: aload 0
      // 70: iload 14
      // 72: ifeq 99
      // 75: getfield com/zelix/ig.H I
      // 78: bipush -1
      // 79: if_icmpeq fd
      // 7c: goto 8a
      // 7f: ldc2_w -2440215328899799156
      // 82: lload 8
      // 84: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: athrow
      // 8a: aload 0
      // 8b: goto 99
      // 8e: ldc2_w -2440215328899799156
      // 91: lload 8
      // 93: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 9c: aload 0
      // 9d: getfield com/zelix/ig.H I
      // a0: aaload
      // a1: checkcast com/zelix/h_
      // a4: checkcast com/zelix/h_
      // a7: aload 7
      // a9: aload 4
      // ab: aload 5
      // ad: aload 10
      // af: aload 3
      // b0: aload 2
      // b1: aload 11
      // b3: lload 12
      // b5: iload 6
      // b7: bipush 9
      // b9: anewarray 46
      // bc: dup_x1
      // bd: swap
      // be: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c1: bipush 8
      // c3: swap
      // c4: aastore
      // c5: dup_x2
      // c6: dup_x2
      // c7: pop
      // c8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // cb: bipush 7
      // cd: swap
      // ce: aastore
      // cf: dup_x1
      // d0: swap
      // d1: bipush 6
      // d3: swap
      // d4: aastore
      // d5: dup_x1
      // d6: swap
      // d7: bipush 5
      // d8: swap
      // d9: aastore
      // da: dup_x1
      // db: swap
      // dc: bipush 4
      // dd: swap
      // de: aastore
      // df: dup_x1
      // e0: swap
      // e1: bipush 3
      // e2: swap
      // e3: aastore
      // e4: dup_x1
      // e5: swap
      // e6: bipush 2
      // e7: swap
      // e8: aastore
      // e9: dup_x1
      // ea: swap
      // eb: bipush 1
      // ec: swap
      // ed: aastore
      // ee: dup_x1
      // ef: swap
      // f0: bipush 0
      // f1: swap
      // f2: aastore
      // f3: ldc2_w -2651233765413614863
      // f6: lload 8
      // f8: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fd: return
   }

   ig(
      h8 param1,
      _xx param2,
      _y4 param3,
      _y4 param4,
      _y4 param5,
      _y4 param6,
      _y4 param7,
      _y4 param8,
      _y4 param9,
      long param10,
      _y4 param12,
      PrintWriter param13,
      ej param14
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ig.b J
      // 003: lload 10
      // 005: lxor
      // 006: lstore 10
      // 008: lload 10
      // 00a: dup2
      // 00b: ldc2_w 115039025164426
      // 00e: lxor
      // 00f: lstore 15
      // 011: dup2
      // 012: ldc2_w 53667705920765
      // 015: lxor
      // 016: lstore 17
      // 018: dup2
      // 019: ldc2_w 52944120330515
      // 01c: lxor
      // 01d: lstore 19
      // 01f: dup2
      // 020: ldc2_w 100311598628690
      // 023: lxor
      // 024: lstore 21
      // 026: dup2
      // 027: ldc2_w 99873314940202
      // 02a: lxor
      // 02b: lstore 23
      // 02d: dup2
      // 02e: ldc2_w 60001743267718
      // 031: lxor
      // 032: lstore 25
      // 034: dup2
      // 035: ldc2_w 99873314940202
      // 038: lxor
      // 039: lstore 27
      // 03b: dup2
      // 03c: ldc2_w 118643121284667
      // 03f: lxor
      // 040: lstore 29
      // 042: dup2
      // 043: ldc2_w 84797319853170
      // 046: lxor
      // 047: lstore 31
      // 049: dup2
      // 04a: ldc2_w 53630417702791
      // 04d: lxor
      // 04e: lstore 33
      // 050: dup2
      // 051: ldc2_w 102489217767004
      // 054: lxor
      // 055: lstore 35
      // 057: dup2
      // 058: ldc2_w 121286311133951
      // 05b: lxor
      // 05c: lstore 37
      // 05e: pop2
      // 05f: aload 0
      // 060: aload 1
      // 061: aload 2
      // 062: aload 3
      // 063: lload 29
      // 065: aload 13
      // 067: invokespecial com/zelix/iu.<init> (Lcom/zelix/h8;Lcom/zelix/_xx;Lcom/zelix/_y4;JLjava/io/PrintWriter;)V
      // 06a: ldc2_w -9014836529586261362
      // 06d: lload 10
      // 06f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: aload 0
      // 075: aload 0
      // 076: getfield com/zelix/ig.F I
      // 079: anewarray 442
      // 07c: putfield com/zelix/ig.J [Lcom/zelix/h4;
      // 07f: istore 39
      // 081: new com/zelix/_y4
      // 084: dup
      // 085: lload 37
      // 087: invokespecial com/zelix/_y4.<init> (J)V
      // 08a: astore 40
      // 08c: aconst_null
      // 08d: astore 41
      // 08f: bipush 0
      // 090: istore 42
      // 092: iload 42
      // 094: aload 0
      // 095: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 098: arraylength
      // 099: if_icmpge 2bf
      // 09c: aload 0
      // 09d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0a0: iload 42
      // 0a2: aload 0
      // 0a3: aload 2
      // 0a4: aload 3
      // 0a5: aload 4
      // 0a7: aload 5
      // 0a9: aload 6
      // 0ab: aload 7
      // 0ad: lload 25
      // 0af: aload 8
      // 0b1: aload 9
      // 0b3: aload 12
      // 0b5: aload 13
      // 0b7: aload 40
      // 0b9: aload 14
      // 0bb: bipush 14
      // 0bd: anewarray 46
      // 0c0: dup_x1
      // 0c1: swap
      // 0c2: bipush 13
      // 0c4: swap
      // 0c5: aastore
      // 0c6: dup_x1
      // 0c7: swap
      // 0c8: bipush 12
      // 0ca: swap
      // 0cb: aastore
      // 0cc: dup_x1
      // 0cd: swap
      // 0ce: bipush 11
      // 0d0: swap
      // 0d1: aastore
      // 0d2: dup_x1
      // 0d3: swap
      // 0d4: bipush 10
      // 0d6: swap
      // 0d7: aastore
      // 0d8: dup_x1
      // 0d9: swap
      // 0da: bipush 9
      // 0dc: swap
      // 0dd: aastore
      // 0de: dup_x1
      // 0df: swap
      // 0e0: bipush 8
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x2
      // 0e5: dup_x2
      // 0e6: pop
      // 0e7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ea: bipush 7
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 6
      // 0f2: swap
      // 0f3: aastore
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: bipush 5
      // 0f7: swap
      // 0f8: aastore
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: bipush 4
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x1
      // 0ff: swap
      // 100: bipush 3
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 2
      // 106: swap
      // 107: aastore
      // 108: dup_x1
      // 109: swap
      // 10a: bipush 1
      // 10b: swap
      // 10c: aastore
      // 10d: dup_x1
      // 10e: swap
      // 10f: bipush 0
      // 110: swap
      // 111: aastore
      // 112: ldc2_w -7107256474064165960
      // 115: lload 10
      // 117: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/h4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: aastore
      // 11d: aload 0
      // 11e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 121: iload 42
      // 123: aaload
      // 124: instanceof com/zelix/h_
      // 127: iload 39
      // 129: lload 10
      // 12b: lconst_0
      // 12c: lcmp
      // 12d: ifle 135
      // 130: ifeq 43d
      // 133: iload 39
      // 135: lload 10
      // 137: lconst_0
      // 138: lcmp
      // 139: iflt 19d
      // 13c: ifeq 194
      // 13f: goto 14d
      // 142: ldc2_w -9174529451537942269
      // 145: lload 10
      // 147: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: ifeq 17c
      // 150: goto 15e
      // 153: ldc2_w -9174529451537942269
      // 156: lload 10
      // 158: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: aload 0
      // 15f: iload 42
      // 161: putfield com/zelix/ig.H I
      // 164: aload 0
      // 165: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 168: iload 42
      // 16a: aaload
      // 16b: checkcast com/zelix/h_
      // 16e: astore 41
      // 170: lload 10
      // 172: lconst_0
      // 173: lcmp
      // 174: ifle 1c5
      // 177: iload 39
      // 179: ifne 1c5
      // 17c: aload 0
      // 17d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 180: iload 42
      // 182: aaload
      // 183: instanceof com/zelix/hb
      // 186: goto 194
      // 189: ldc2_w -9174529451537942269
      // 18c: lload 10
      // 18e: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: athrow
      // 194: lload 10
      // 196: lconst_0
      // 197: lcmp
      // 198: iflt 1e9
      // 19b: iload 39
      // 19d: ifeq 1e9
      // 1a0: ifeq 1c5
      // 1a3: goto 1b1
      // 1a6: ldc2_w -9174529451537942269
      // 1a9: lload 10
      // 1ab: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: iload 42
      // 1b4: putfield com/zelix/ig.d I
      // 1b7: goto 1c5
      // 1ba: ldc2_w -9174529451537942269
      // 1bd: lload 10
      // 1bf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: aload 0
      // 1c6: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 1c9: iload 42
      // 1cb: aaload
      // 1cc: lload 10
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: ifle 208
      // 1d3: iload 39
      // 1d5: ifeq 208
      // 1d8: instanceof com/zelix/bs
      // 1db: goto 1e9
      // 1de: ldc2_w -9174529451537942269
      // 1e1: lload 10
      // 1e3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: athrow
      // 1e9: lload 10
      // 1eb: lconst_0
      // 1ec: lcmp
      // 1ed: ifle 2bc
      // 1f0: ifeq 2b7
      // 1f3: aload 0
      // 1f4: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 1f7: iload 42
      // 1f9: aaload
      // 1fa: goto 208
      // 1fd: ldc2_w -9174529451537942269
      // 200: lload 10
      // 202: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 207: athrow
      // 208: checkcast com/zelix/bs
      // 20b: sipush 25823
      // 20e: ldc2_w 8664126790441203867
      // 211: lload 10
      // 213: lxor
      // 214: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: lload 15
      // 21b: bipush 0
      // 21c: bipush 3
      // 21d: anewarray 46
      // 220: dup_x1
      // 221: swap
      // 222: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 225: bipush 2
      // 226: swap
      // 227: aastore
      // 228: dup_x2
      // 229: dup_x2
      // 22a: pop
      // 22b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22e: bipush 1
      // 22f: swap
      // 230: aastore
      // 231: dup_x1
      // 232: swap
      // 233: bipush 0
      // 234: swap
      // 235: aastore
      // 236: ldc2_w -8669983068567580254
      // 239: lload 10
      // 23b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ij; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: ifnull 2b7
      // 243: new com/zelix/_sk
      // 246: dup
      // 247: new java/lang/StringBuilder
      // 24a: dup
      // 24b: invokespecial java/lang/StringBuilder.<init> ()V
      // 24e: sipush 7622
      // 251: ldc2_w 6217631129644597670
      // 254: lload 10
      // 256: lxor
      // 257: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 25f: aload 0
      // 260: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 263: lload 27
      // 265: ldc2_w -7286487030115591709
      // 268: lload 10
      // 26a: invokedynamic m (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 272: sipush 5854
      // 275: ldc2_w 8605997724305558198
      // 278: lload 10
      // 27a: lxor
      // 27b: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 280: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 283: aload 0
      // 284: lload 21
      // 286: bipush 1
      // 287: anewarray 46
      // 28a: dup_x2
      // 28b: dup_x2
      // 28c: pop
      // 28d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 290: bipush 0
      // 291: swap
      // 292: aastore
      // 293: ldc2_w -7029655562914304488
      // 296: lload 10
      // 298: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a0: ldc "'"
      // 2a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2a8: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // 2ab: athrow
      // 2ac: ldc2_w -9174529451537942269
      // 2af: lload 10
      // 2b1: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b6: athrow
      // 2b7: iinc 42 1
      // 2ba: iload 39
      // 2bc: ifne 092
      // 2bf: aload 41
      // 2c1: iload 39
      // 2c3: lload 10
      // 2c5: lconst_0
      // 2c6: lcmp
      // 2c7: iflt 1d5
      // 2ca: ifeq 2e0
      // 2cd: ifnull 307
      // 2d0: goto 2de
      // 2d3: ldc2_w -9174529451537942269
      // 2d6: lload 10
      // 2d8: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: athrow
      // 2de: aload 41
      // 2e0: lload 31
      // 2e2: aload 40
      // 2e4: aload 13
      // 2e6: bipush 3
      // 2e7: anewarray 46
      // 2ea: dup_x1
      // 2eb: swap
      // 2ec: bipush 2
      // 2ed: swap
      // 2ee: aastore
      // 2ef: dup_x1
      // 2f0: swap
      // 2f1: bipush 1
      // 2f2: swap
      // 2f3: aastore
      // 2f4: dup_x2
      // 2f5: dup_x2
      // 2f6: pop
      // 2f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fa: bipush 0
      // 2fb: swap
      // 2fc: aastore
      // 2fd: ldc2_w -8797557276388952843
      // 300: lload 10
      // 302: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: aload 0
      // 308: iload 39
      // 30a: lload 10
      // 30c: lconst_0
      // 30d: lcmp
      // 30e: iflt 3c6
      // 311: ifeq 3c5
      // 314: getfield com/zelix/ig.V Ljava/util/List;
      // 317: ifnull 36b
      // 31a: goto 328
      // 31d: ldc2_w -9174529451537942269
      // 320: lload 10
      // 322: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 327: athrow
      // 328: aload 0
      // 329: iload 39
      // 32b: lload 10
      // 32d: lconst_0
      // 32e: lcmp
      // 32f: iflt 403
      // 332: ifeq 402
      // 335: goto 343
      // 338: ldc2_w -9174529451537942269
      // 33b: lload 10
      // 33d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 342: athrow
      // 343: lload 10
      // 345: lconst_0
      // 346: lcmp
      // 347: ifle 3f4
      // 34a: getfield com/zelix/ig.m Ljava/lang/String;
      // 34d: lload 35
      // 34f: bipush 1
      // 350: ldc2_w -9063152322234168896
      // 353: lload 10
      // 355: invokedynamic u (Ljava/lang/Object;JZJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: ifnonnull 3f3
      // 35d: goto 36b
      // 360: ldc2_w -9174529451537942269
      // 363: lload 10
      // 365: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: athrow
      // 36b: aload 13
      // 36d: new java/lang/StringBuilder
      // 370: dup
      // 371: invokespecial java/lang/StringBuilder.<init> ()V
      // 374: sipush 5795
      // 377: ldc2_w 6482854614380219106
      // 37a: lload 10
      // 37c: lxor
      // 37d: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 382: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 385: aload 0
      // 386: lload 23
      // 388: invokevirtual com/zelix/ig.j (J)Ljava/lang/String;
      // 38b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 38e: sipush 31717
      // 391: ldc2_w 4324224703929968552
      // 394: lload 10
      // 396: lxor
      // 397: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 39f: sipush 3580
      // 3a2: ldc2_w 5096213608166625672
      // 3a5: lload 10
      // 3a7: lxor
      // 3a8: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b3: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 3b6: aload 0
      // 3b7: goto 3c5
      // 3ba: ldc2_w -9174529451537942269
      // 3bd: lload 10
      // 3bf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c4: athrow
      // 3c5: bipush 0
      // 3c6: lload 17
      // 3c8: bipush 2
      // 3c9: anewarray 46
      // 3cc: dup_x2
      // 3cd: dup_x2
      // 3ce: pop
      // 3cf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d2: bipush 1
      // 3d3: swap
      // 3d4: aastore
      // 3d5: dup_x1
      // 3d6: swap
      // 3d7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3da: bipush 0
      // 3db: swap
      // 3dc: aastore
      // 3dd: ldc2_w -8960366281598492985
      // 3e0: lload 10
      // 3e2: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e7: lload 10
      // 3e9: lconst_0
      // 3ea: lcmp
      // 3eb: iflt 424
      // 3ee: iload 39
      // 3f0: ifne 424
      // 3f3: aload 0
      // 3f4: goto 402
      // 3f7: ldc2_w -9174529451537942269
      // 3fa: lload 10
      // 3fc: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 401: athrow
      // 402: bipush 1
      // 403: lload 17
      // 405: bipush 2
      // 406: anewarray 46
      // 409: dup_x2
      // 40a: dup_x2
      // 40b: pop
      // 40c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 40f: bipush 1
      // 410: swap
      // 411: aastore
      // 412: dup_x1
      // 413: swap
      // 414: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 417: bipush 0
      // 418: swap
      // 419: aastore
      // 41a: ldc2_w -8960366281598492985
      // 41d: lload 10
      // 41f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 424: aload 0
      // 425: iload 39
      // 427: ifeq 441
      // 42a: lload 33
      // 42c: invokevirtual com/zelix/ig.Q (J)Z
      // 42f: goto 43d
      // 432: ldc2_w -9174529451537942269
      // 435: lload 10
      // 437: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43c: athrow
      // 43d: ifeq 460
      // 440: aload 1
      // 441: aload 0
      // 442: lload 19
      // 444: bipush 2
      // 445: anewarray 46
      // 448: dup_x2
      // 449: dup_x2
      // 44a: pop
      // 44b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 44e: bipush 1
      // 44f: swap
      // 450: aastore
      // 451: dup_x1
      // 452: swap
      // 453: bipush 0
      // 454: swap
      // 455: aastore
      // 456: ldc2_w -7199328758423222263
      // 459: lload 10
      // 45b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 460: return
   }

   boolean N(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 6754532909218
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 542664648809134061
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/ig.H I
      // 2a: iload 6
      // 2c: ifeq 73
      // 2f: bipush -1
      // 30: if_icmpeq 72
      // 33: goto 40
      // 36: ldc2_w 418471366184746080
      // 39: lload 2
      // 3a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 44: aload 0
      // 45: getfield com/zelix/ig.H I
      // 48: aaload
      // 49: checkcast com/zelix/h_
      // 4c: checkcast com/zelix/h_
      // 4f: lload 4
      // 51: bipush 1
      // 52: anewarray 46
      // 55: dup_x2
      // 56: dup_x2
      // 57: pop
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: bipush 0
      // 5c: swap
      // 5d: aastore
      // 5e: ldc2_w 2201240084983574976
      // 61: lload 2
      // 62: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: ireturn
      // 68: ldc2_w 418471366184746080
      // 6b: lload 2
      // 6c: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: bipush 0
      // 73: ireturn
   }

   public void Rf(Object[] var1) {
      List var8 = (List)var1[0];
      int var6 = (Integer)var1[1];
      int var3 = (Integer)var1[2];
      int var7 = (Integer)var1[3];
      String var2 = (String)var1[4];
      long var4 = (Long)var1[5];
      var4 = b ^ var4;
      long var9 = var4 ^ 69484088312048L;
      Object[] var10009 = new Object[]{null, null, null, null, var2, var9, null};
      var10009[3] = var7;
      var10009[2] = var3;
      var10009[1] = var6;
      var10009[0] = var8;
      x44.a<"o">(this, var10009, 761157135163701059L, var4);
   }

   public int G(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 118933949047900
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 6843713869906275987
      // 1e: lload 2
      // 1f: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/ig.H I
      // 2a: iload 6
      // 2c: ifeq 73
      // 2f: bipush -1
      // 30: if_icmpeq 72
      // 33: goto 40
      // 36: ldc2_w 6679008000106980638
      // 39: lload 2
      // 3a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 44: aload 0
      // 45: getfield com/zelix/ig.H I
      // 48: aaload
      // 49: checkcast com/zelix/h_
      // 4c: checkcast com/zelix/h_
      // 4f: lload 4
      // 51: bipush 1
      // 52: anewarray 46
      // 55: dup_x2
      // 56: dup_x2
      // 57: pop
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: bipush 0
      // 5c: swap
      // 5d: aastore
      // 5e: ldc2_w 5088226440737786155
      // 61: lload 2
      // 62: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: ireturn
      // 68: ldc2_w 6679008000106980638
      // 6b: lload 2
      // 6c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: bipush 0
      // 73: ireturn
   }

   public void Vd(Object[] param1) {
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
      // 04: checkcast java/util/HashMap
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/ig.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 122238771156830
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -8732604798346021211
      // 25: lload 3
      // 26: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: iload 7
      // 30: ifeq 55
      // 33: getfield com/zelix/ig.H I
      // 36: bipush -1
      // 37: if_icmpeq 81
      // 3a: goto 47
      // 3d: ldc2_w -8897188894617518808
      // 40: lload 3
      // 41: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: goto 55
      // 4b: ldc2_w -8897188894617518808
      // 4e: lload 3
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 58: aload 0
      // 59: getfield com/zelix/ig.H I
      // 5c: aaload
      // 5d: checkcast com/zelix/h_
      // 60: checkcast com/zelix/h_
      // 63: lload 5
      // 65: aload 2
      // 66: bipush 2
      // 67: anewarray 46
      // 6a: dup_x1
      // 6b: swap
      // 6c: bipush 1
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w -8709957426611376449
      // 7b: lload 3
      // 7c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: return
   }

   void fM(Object[] param1) {
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
      // 0f: checkcast com/zelix/_fm
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/we
      // 19: astore 3
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast com/zelix/_8c
      // 20: astore 7
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast java/util/ArrayList
      // 28: astore 6
      // 2a: pop
      // 2b: getstatic com/zelix/ig.b J
      // 2e: lload 4
      // 30: lxor
      // 31: lstore 4
      // 33: lload 4
      // 35: dup2
      // 36: ldc2_w 15787906059529
      // 39: lxor
      // 3a: dup2
      // 3b: bipush 56
      // 3d: lushr
      // 3e: l2i
      // 3f: istore 8
      // 41: dup2
      // 42: bipush 8
      // 44: lshl
      // 45: bipush 32
      // 47: lushr
      // 48: l2i
      // 49: istore 9
      // 4b: dup2
      // 4c: bipush 40
      // 4e: lshl
      // 4f: bipush 40
      // 51: lushr
      // 52: l2i
      // 53: istore 10
      // 55: pop2
      // 56: pop2
      // 57: ldc2_w 4094231587690777749
      // 5a: lload 4
      // 5c: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: istore 11
      // 63: aload 0
      // 64: iload 11
      // 66: ifne 8d
      // 69: getfield com/zelix/ig.H I
      // 6c: bipush -1
      // 6d: if_icmpeq e4
      // 70: goto 7e
      // 73: ldc2_w 2877684131978550849
      // 76: lload 4
      // 78: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: goto 8d
      // 82: ldc2_w 2877684131978550849
      // 85: lload 4
      // 87: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 90: aload 0
      // 91: getfield com/zelix/ig.H I
      // 94: aaload
      // 95: checkcast com/zelix/h_
      // 98: checkcast com/zelix/h_
      // 9b: aload 2
      // 9c: iload 8
      // 9e: i2b
      // 9f: iload 9
      // a1: aload 3
      // a2: aload 7
      // a4: aload 6
      // a6: iload 10
      // a8: bipush 7
      // aa: anewarray 46
      // ad: dup_x1
      // ae: swap
      // af: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b2: bipush 6
      // b4: swap
      // b5: aastore
      // b6: dup_x1
      // b7: swap
      // b8: bipush 5
      // b9: swap
      // ba: aastore
      // bb: dup_x1
      // bc: swap
      // bd: bipush 4
      // be: swap
      // bf: aastore
      // c0: dup_x1
      // c1: swap
      // c2: bipush 3
      // c3: swap
      // c4: aastore
      // c5: dup_x1
      // c6: swap
      // c7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ca: bipush 2
      // cb: swap
      // cc: aastore
      // cd: dup_x1
      // ce: swap
      // cf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // d2: bipush 1
      // d3: swap
      // d4: aastore
      // d5: dup_x1
      // d6: swap
      // d7: bipush 0
      // d8: swap
      // d9: aastore
      // da: ldc2_w 2559988587491073168
      // dd: lload 4
      // df: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e4: return
   }

   _y4 o(Object[] param1) {
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
      // 004: checkcast java/util/Map
      // 007: astore 17
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/qx
      // 00f: astore 13
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/ax
      // 017: astore 12
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast com/zelix/ax
      // 01f: astore 23
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast com/zelix/ax
      // 027: astore 6
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast com/zelix/_fm
      // 02f: astore 5
      // 031: dup
      // 032: bipush 6
      // 034: aaload
      // 035: checkcast java/util/Map
      // 038: astore 24
      // 03a: dup
      // 03b: bipush 7
      // 03d: aaload
      // 03e: checkcast java/util/Map
      // 041: astore 19
      // 043: dup
      // 044: bipush 8
      // 046: aaload
      // 047: checkcast java/util/Map
      // 04a: astore 7
      // 04c: dup
      // 04d: bipush 9
      // 04f: aaload
      // 050: checkcast java/util/Map
      // 053: astore 16
      // 055: dup
      // 056: bipush 10
      // 058: aaload
      // 059: checkcast com/zelix/_yv
      // 05c: astore 22
      // 05e: dup
      // 05f: bipush 11
      // 061: aaload
      // 062: checkcast java/util/Map
      // 065: astore 10
      // 067: dup
      // 068: bipush 12
      // 06a: aaload
      // 06b: checkcast com/zelix/_8z
      // 06e: astore 18
      // 070: dup
      // 071: bipush 13
      // 073: aaload
      // 074: checkcast com/zelix/_y4
      // 077: astore 9
      // 079: dup
      // 07a: bipush 14
      // 07c: aaload
      // 07d: checkcast com/zelix/_8z
      // 080: astore 3
      // 081: dup
      // 082: bipush 15
      // 084: aaload
      // 085: checkcast com/zelix/_8z
      // 088: astore 11
      // 08a: dup
      // 08b: bipush 16
      // 08d: aaload
      // 08e: checkcast com/zelix/_8z
      // 091: astore 4
      // 093: dup
      // 094: bipush 17
      // 096: aaload
      // 097: checkcast java/lang/Long
      // 09a: invokevirtual java/lang/Long.longValue ()J
      // 09d: lstore 14
      // 09f: dup
      // 0a0: bipush 18
      // 0a2: aaload
      // 0a3: checkcast java/util/Set
      // 0a6: astore 2
      // 0a7: dup
      // 0a8: bipush 19
      // 0aa: aaload
      // 0ab: checkcast com/zelix/_y4
      // 0ae: astore 20
      // 0b0: dup
      // 0b1: bipush 20
      // 0b3: aaload
      // 0b4: checkcast java/util/List
      // 0b7: astore 21
      // 0b9: dup
      // 0ba: bipush 21
      // 0bc: aaload
      // 0bd: checkcast java/lang/Boolean
      // 0c0: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c3: istore 8
      // 0c5: pop
      // 0c6: getstatic com/zelix/ig.b J
      // 0c9: lload 14
      // 0cb: lxor
      // 0cc: lstore 14
      // 0ce: lload 14
      // 0d0: dup2
      // 0d1: ldc2_w 79979478188597
      // 0d4: lxor
      // 0d5: lstore 25
      // 0d7: dup2
      // 0d8: ldc2_w 47946731445407
      // 0db: lxor
      // 0dc: lstore 27
      // 0de: pop2
      // 0df: ldc2_w -2187181379673009713
      // 0e2: lload 14
      // 0e4: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: istore 29
      // 0eb: aload 0
      // 0ec: getfield com/zelix/ig.H I
      // 0ef: bipush -1
      // 0f0: if_icmpeq 223
      // 0f3: new java/util/ArrayList
      // 0f6: dup
      // 0f7: invokespecial java/util/ArrayList.<init> ()V
      // 0fa: astore 30
      // 0fc: aload 0
      // 0fd: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 100: aload 0
      // 101: getfield com/zelix/ig.H I
      // 104: aaload
      // 105: checkcast com/zelix/h_
      // 108: checkcast com/zelix/h_
      // 10b: aload 17
      // 10d: aload 13
      // 10f: aload 12
      // 111: aload 23
      // 113: aload 6
      // 115: aload 5
      // 117: aload 24
      // 119: aload 19
      // 11b: aload 7
      // 11d: aload 16
      // 11f: aload 22
      // 121: aload 10
      // 123: aload 18
      // 125: aload 9
      // 127: aload 3
      // 128: aload 11
      // 12a: aload 4
      // 12c: aload 2
      // 12d: aload 30
      // 12f: aload 21
      // 131: lload 25
      // 133: iload 8
      // 135: bipush 22
      // 137: anewarray 46
      // 13a: dup_x1
      // 13b: swap
      // 13c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 13f: bipush 21
      // 141: swap
      // 142: aastore
      // 143: dup_x2
      // 144: dup_x2
      // 145: pop
      // 146: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 149: bipush 20
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: bipush 19
      // 151: swap
      // 152: aastore
      // 153: dup_x1
      // 154: swap
      // 155: bipush 18
      // 157: swap
      // 158: aastore
      // 159: dup_x1
      // 15a: swap
      // 15b: bipush 17
      // 15d: swap
      // 15e: aastore
      // 15f: dup_x1
      // 160: swap
      // 161: bipush 16
      // 163: swap
      // 164: aastore
      // 165: dup_x1
      // 166: swap
      // 167: bipush 15
      // 169: swap
      // 16a: aastore
      // 16b: dup_x1
      // 16c: swap
      // 16d: bipush 14
      // 16f: swap
      // 170: aastore
      // 171: dup_x1
      // 172: swap
      // 173: bipush 13
      // 175: swap
      // 176: aastore
      // 177: dup_x1
      // 178: swap
      // 179: bipush 12
      // 17b: swap
      // 17c: aastore
      // 17d: dup_x1
      // 17e: swap
      // 17f: bipush 11
      // 181: swap
      // 182: aastore
      // 183: dup_x1
      // 184: swap
      // 185: bipush 10
      // 187: swap
      // 188: aastore
      // 189: dup_x1
      // 18a: swap
      // 18b: bipush 9
      // 18d: swap
      // 18e: aastore
      // 18f: dup_x1
      // 190: swap
      // 191: bipush 8
      // 193: swap
      // 194: aastore
      // 195: dup_x1
      // 196: swap
      // 197: bipush 7
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 6
      // 19f: swap
      // 1a0: aastore
      // 1a1: dup_x1
      // 1a2: swap
      // 1a3: bipush 5
      // 1a4: swap
      // 1a5: aastore
      // 1a6: dup_x1
      // 1a7: swap
      // 1a8: bipush 4
      // 1a9: swap
      // 1aa: aastore
      // 1ab: dup_x1
      // 1ac: swap
      // 1ad: bipush 3
      // 1ae: swap
      // 1af: aastore
      // 1b0: dup_x1
      // 1b1: swap
      // 1b2: bipush 2
      // 1b3: swap
      // 1b4: aastore
      // 1b5: dup_x1
      // 1b6: swap
      // 1b7: bipush 1
      // 1b8: swap
      // 1b9: aastore
      // 1ba: dup_x1
      // 1bb: swap
      // 1bc: bipush 0
      // 1bd: swap
      // 1be: aastore
      // 1bf: ldc2_w -261820749533530022
      // 1c2: lload 14
      // 1c4: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_y4; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: astore 31
      // 1cb: aload 30
      // 1cd: iload 29
      // 1cf: ifeq 21e
      // 1d2: invokeinterface java/util/List.size ()I 1
      // 1d7: ifle 220
      // 1da: goto 1e8
      // 1dd: ldc2_w -2023020042399065534
      // 1e0: lload 14
      // 1e2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: aload 20
      // 1ea: aload 0
      // 1eb: aload 30
      // 1ed: lload 27
      // 1ef: bipush 3
      // 1f0: anewarray 46
      // 1f3: dup_x2
      // 1f4: dup_x2
      // 1f5: pop
      // 1f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f9: bipush 2
      // 1fa: swap
      // 1fb: aastore
      // 1fc: dup_x1
      // 1fd: swap
      // 1fe: bipush 1
      // 1ff: swap
      // 200: aastore
      // 201: dup_x1
      // 202: swap
      // 203: bipush 0
      // 204: swap
      // 205: aastore
      // 206: ldc2_w -1808641323228031779
      // 209: lload 14
      // 20b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 210: goto 21e
      // 213: ldc2_w -2023020042399065534
      // 216: lload 14
      // 218: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: athrow
      // 21e: astore 32
      // 220: aload 31
      // 222: areturn
      // 223: aconst_null
      // 224: areturn
   }

   public void v6(Object[] param1) {
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
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: istore 4
      // 16: pop
      // 17: getstatic com/zelix/ig.b J
      // 1a: lload 2
      // 1b: lxor
      // 1c: lstore 2
      // 1d: lload 2
      // 1e: dup2
      // 1f: ldc2_w 45298263528952
      // 22: lxor
      // 23: lstore 5
      // 25: pop2
      // 26: ldc2_w 5149189849954480945
      // 29: lload 2
      // 2a: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: istore 7
      // 31: aload 0
      // 32: iload 7
      // 34: ifne 59
      // 37: getfield com/zelix/ig.H I
      // 3a: bipush -1
      // 3b: if_icmpeq 89
      // 3e: goto 4b
      // 41: ldc2_w 6362371813316977125
      // 44: lload 2
      // 45: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: athrow
      // 4b: aload 0
      // 4c: goto 59
      // 4f: ldc2_w 6362371813316977125
      // 52: lload 2
      // 53: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 5c: aload 0
      // 5d: getfield com/zelix/ig.H I
      // 60: aaload
      // 61: checkcast com/zelix/h_
      // 64: checkcast com/zelix/h_
      // 67: iload 4
      // 69: lload 5
      // 6b: bipush 2
      // 6c: anewarray 46
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 1
      // 76: swap
      // 77: aastore
      // 78: dup_x1
      // 79: swap
      // 7a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7d: bipush 0
      // 7e: swap
      // 7f: aastore
      // 80: ldc2_w 4895340419608295158
      // 83: lload 2
      // 84: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89: return
   }

   void mt(Object[] param1) {
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
      // 04: checkcast com/zelix/_fm
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/we
      // 0f: astore 3
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/_ur
      // 16: astore 2
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 5
      // 22: pop
      // 23: getstatic com/zelix/ig.b J
      // 26: lload 5
      // 28: lxor
      // 29: lstore 5
      // 2b: lload 5
      // 2d: dup2
      // 2e: ldc2_w 23396968490265
      // 31: lxor
      // 32: lstore 7
      // 34: pop2
      // 35: ldc2_w 1891757322248989226
      // 38: lload 5
      // 3a: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: istore 9
      // 41: aload 0
      // 42: iload 9
      // 44: ifeq 6b
      // 47: getfield com/zelix/ig.H I
      // 4a: bipush -1
      // 4b: if_icmpeq a5
      // 4e: goto 5c
      // 51: ldc2_w 1732061354624688551
      // 54: lload 5
      // 56: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: aload 0
      // 5d: goto 6b
      // 60: ldc2_w 1732061354624688551
      // 63: lload 5
      // 65: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 6e: aload 0
      // 6f: getfield com/zelix/ig.H I
      // 72: aaload
      // 73: checkcast com/zelix/h_
      // 76: checkcast com/zelix/h_
      // 79: aload 4
      // 7b: aload 3
      // 7c: aload 2
      // 7d: lload 7
      // 7f: bipush 4
      // 80: anewarray 46
      // 83: dup_x2
      // 84: dup_x2
      // 85: pop
      // 86: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 89: bipush 3
      // 8a: swap
      // 8b: aastore
      // 8c: dup_x1
      // 8d: swap
      // 8e: bipush 2
      // 8f: swap
      // 90: aastore
      // 91: dup_x1
      // 92: swap
      // 93: bipush 1
      // 94: swap
      // 95: aastore
      // 96: dup_x1
      // 97: swap
      // 98: bipush 0
      // 99: swap
      // 9a: aastore
      // 9b: ldc2_w 1829288265574597904
      // 9e: lload 5
      // a0: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: return
   }

   int u(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 7477562533287057327
      // 15: lload 2
      // 16: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: getfield com/zelix/ig.H I
      // 21: iload 4
      // 23: ifeq 55
      // 26: bipush -1
      // 27: if_icmpeq 54
      // 2a: goto 37
      // 2d: ldc2_w 7317496600336227362
      // 30: lload 2
      // 31: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: aload 0
      // 38: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 3b: aload 0
      // 3c: getfield com/zelix/ig.H I
      // 3f: aaload
      // 40: checkcast com/zelix/h_
      // 43: checkcast com/zelix/h_
      // 46: invokevirtual com/zelix/h_.L ()I
      // 49: ireturn
      // 4a: ldc2_w 7317496600336227362
      // 4d: lload 2
      // 4e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: bipush 0
      // 55: ireturn
   }

   void v0(Object[] param1) {
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
      // 04: checkcast java/util/HashSet
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/w
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 2
      // 1b: pop
      // 1c: getstatic com/zelix/ig.b J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 43258017855675
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: ldc2_w -8163698752220250402
      // 2e: lload 2
      // 2f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: bipush 0
      // 35: istore 9
      // 37: istore 8
      // 39: iload 9
      // 3b: aload 0
      // 3c: getfield com/zelix/ig.F I
      // 3f: if_icmpge b0
      // 42: aload 0
      // 43: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 46: iload 9
      // 48: aaload
      // 49: iload 8
      // 4b: ifeq 7b
      // 4e: instanceof com/zelix/by
      // 51: lload 2
      // 52: lconst_0
      // 53: lcmp
      // 54: ifle ad
      // 57: ifeq a8
      // 5a: goto 67
      // 5d: ldc2_w -8287207300545923757
      // 60: lload 2
      // 61: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: aload 0
      // 68: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 6b: iload 9
      // 6d: aaload
      // 6e: goto 7b
      // 71: ldc2_w -8287207300545923757
      // 74: lload 2
      // 75: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: checkcast com/zelix/by
      // 7e: astore 10
      // 80: aload 10
      // 82: aload 4
      // 84: aload 5
      // 86: lload 6
      // 88: bipush 3
      // 89: anewarray 46
      // 8c: dup_x2
      // 8d: dup_x2
      // 8e: pop
      // 8f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 92: bipush 2
      // 93: swap
      // 94: aastore
      // 95: dup_x1
      // 96: swap
      // 97: bipush 1
      // 98: swap
      // 99: aastore
      // 9a: dup_x1
      // 9b: swap
      // 9c: bipush 0
      // 9d: swap
      // 9e: aastore
      // 9f: ldc2_w -8259193908013877680
      // a2: lload 2
      // a3: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: iinc 9 1
      // ab: iload 8
      // ad: ifne 39
      // b0: lload 2
      // b1: lconst_0
      // b2: lcmp
      // b3: ifle 42
      // b6: return
   }

   public int p(Object[] param1) {
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
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 3
      // 015: pop
      // 016: getstatic com/zelix/ig.b J
      // 019: lload 3
      // 01a: lxor
      // 01b: lstore 3
      // 01c: lload 3
      // 01d: dup2
      // 01e: ldc2_w 7078984632343
      // 021: lxor
      // 022: lstore 5
      // 024: pop2
      // 025: ldc2_w 2991699518142618094
      // 028: lload 3
      // 029: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: bipush 0
      // 02f: istore 8
      // 031: aload 0
      // 032: getfield com/zelix/ig.m Ljava/lang/String;
      // 035: lload 5
      // 037: dup2_x1
      // 038: pop2
      // 039: invokestatic com/zelix/xl.X (JLjava/lang/String;)Ljava/util/List;
      // 03c: astore 9
      // 03e: istore 7
      // 040: aload 9
      // 042: invokeinterface java/util/List.size ()I 1
      // 047: istore 10
      // 049: bipush 0
      // 04a: istore 11
      // 04c: iload 11
      // 04e: iload 10
      // 050: if_icmpge 113
      // 053: iload 8
      // 055: iload 7
      // 057: lload 3
      // 058: lconst_0
      // 059: lcmp
      // 05a: ifle 062
      // 05d: ifeq 11a
      // 060: iload 7
      // 062: ifeq 092
      // 065: goto 072
      // 068: ldc2_w 3156457359269302883
      // 06b: lload 3
      // 06c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: iload 2
      // 073: if_icmpne 093
      // 076: goto 083
      // 079: ldc2_w 3156457359269302883
      // 07c: lload 3
      // 07d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: iload 11
      // 085: goto 092
      // 088: ldc2_w 3156457359269302883
      // 08b: lload 3
      // 08c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: ireturn
      // 093: aload 9
      // 095: iload 11
      // 097: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 09c: checkcast java/lang/String
      // 09f: astore 12
      // 0a1: iload 7
      // 0a3: lload 3
      // 0a4: lconst_0
      // 0a5: lcmp
      // 0a6: ifle 0f2
      // 0a9: ifeq 0f0
      // 0ac: aload 12
      // 0ae: ldc "D"
      // 0b0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b3: ifne 0e0
      // 0b6: goto 0c3
      // 0b9: ldc2_w 3156457359269302883
      // 0bc: lload 3
      // 0bd: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: lload 3
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 0fe
      // 0c9: aload 12
      // 0cb: ldc "J"
      // 0cd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d0: ifeq 0fb
      // 0d3: goto 0e0
      // 0d6: ldc2_w 3156457359269302883
      // 0d9: lload 3
      // 0da: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: iinc 8 2
      // 0e3: goto 0f0
      // 0e6: ldc2_w 3156457359269302883
      // 0e9: lload 3
      // 0ea: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: iload 7
      // 0f2: lload 3
      // 0f3: lconst_0
      // 0f4: lcmp
      // 0f5: ifle 110
      // 0f8: ifne 10b
      // 0fb: iinc 8 1
      // 0fe: goto 10b
      // 101: ldc2_w 3156457359269302883
      // 104: lload 3
      // 105: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: iinc 11 1
      // 10e: iload 7
      // 110: ifne 04c
      // 113: lload 3
      // 114: lconst_0
      // 115: lcmp
      // 116: iflt 053
      // 119: bipush -1
      // 11a: ireturn
   }

   void EQ(Object[] param1) {
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
      // 04: checkcast com/zelix/_fm
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/we
      // 0f: astore 7
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast com/zelix/_8c
      // 17: astore 2
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/lang/Long
      // 1e: invokevirtual java/lang/Long.longValue ()J
      // 21: lstore 4
      // 23: dup
      // 24: bipush 4
      // 25: aaload
      // 26: checkcast java/util/List
      // 29: astore 3
      // 2a: pop
      // 2b: getstatic com/zelix/ig.b J
      // 2e: lload 4
      // 30: lxor
      // 31: lstore 4
      // 33: lload 4
      // 35: dup2
      // 36: ldc2_w 102671949188167
      // 39: lxor
      // 3a: dup2
      // 3b: bipush 48
      // 3d: lushr
      // 3e: l2i
      // 3f: istore 8
      // 41: dup2
      // 42: bipush 16
      // 44: lshl
      // 45: bipush 48
      // 47: lushr
      // 48: l2i
      // 49: istore 9
      // 4b: dup2
      // 4c: bipush 32
      // 4e: lshl
      // 4f: bipush 32
      // 51: lushr
      // 52: l2i
      // 53: istore 10
      // 55: pop2
      // 56: pop2
      // 57: ldc2_w 1843290404737002960
      // 5a: lload 4
      // 5c: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: istore 11
      // 63: aload 0
      // 64: iload 11
      // 66: ifne 8d
      // 69: getfield com/zelix/ig.H I
      // 6c: bipush -1
      // 6d: if_icmpeq e5
      // 70: goto 7e
      // 73: ldc2_w 480364862403133188
      // 76: lload 4
      // 78: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 0
      // 7f: goto 8d
      // 82: ldc2_w 480364862403133188
      // 85: lload 4
      // 87: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: athrow
      // 8d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 90: aload 0
      // 91: getfield com/zelix/ig.H I
      // 94: aaload
      // 95: checkcast com/zelix/h_
      // 98: checkcast com/zelix/h_
      // 9b: aload 6
      // 9d: aload 7
      // 9f: iload 8
      // a1: i2s
      // a2: iload 9
      // a4: i2s
      // a5: iload 10
      // a7: aload 2
      // a8: aload 3
      // a9: bipush 7
      // ab: anewarray 46
      // ae: dup_x1
      // af: swap
      // b0: bipush 6
      // b2: swap
      // b3: aastore
      // b4: dup_x1
      // b5: swap
      // b6: bipush 5
      // b7: swap
      // b8: aastore
      // b9: dup_x1
      // ba: swap
      // bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // be: bipush 4
      // bf: swap
      // c0: aastore
      // c1: dup_x1
      // c2: swap
      // c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // c6: bipush 3
      // c7: swap
      // c8: aastore
      // c9: dup_x1
      // ca: swap
      // cb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ce: bipush 2
      // cf: swap
      // d0: aastore
      // d1: dup_x1
      // d2: swap
      // d3: bipush 1
      // d4: swap
      // d5: aastore
      // d6: dup_x1
      // d7: swap
      // d8: bipush 0
      // d9: swap
      // da: aastore
      // db: ldc2_w 269721975970226185
      // de: lload 4
      // e0: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e5: return
   }

   public void ZU(Object[] param1) {
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
      // 04: checkcast java/io/PrintWriter
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Integer
      // 0f: invokevirtual java/lang/Integer.intValue ()I
      // 12: istore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Long
      // 19: invokevirtual java/lang/Long.longValue ()J
      // 1c: lstore 3
      // 1d: pop
      // 1e: getstatic com/zelix/ig.b J
      // 21: lload 3
      // 22: lxor
      // 23: lstore 3
      // 24: lload 3
      // 25: dup2
      // 26: ldc2_w 72986464313080
      // 29: lxor
      // 2a: lstore 6
      // 2c: dup2
      // 2d: ldc2_w 13100935780750
      // 30: lxor
      // 31: lstore 8
      // 33: pop2
      // 34: ldc2_w -5353142137251658273
      // 37: lload 3
      // 38: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: istore 10
      // 3f: aload 0
      // 40: iload 10
      // 42: ifeq 67
      // 45: getfield com/zelix/ig.H I
      // 48: bipush -1
      // 49: if_icmpeq c8
      // 4c: goto 59
      // 4f: ldc2_w -5189120437962699182
      // 52: lload 3
      // 53: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: goto 67
      // 5d: ldc2_w -5189120437962699182
      // 60: lload 3
      // 61: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 6a: aload 0
      // 6b: getfield com/zelix/ig.H I
      // 6e: aaload
      // 6f: checkcast com/zelix/h_
      // 72: astore 11
      // 74: aload 11
      // 76: lload 8
      // 78: aload 5
      // 7a: iload 2
      // 7b: bipush 3
      // 7c: anewarray 46
      // 7f: dup_x1
      // 80: swap
      // 81: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 84: bipush 2
      // 85: swap
      // 86: aastore
      // 87: dup_x1
      // 88: swap
      // 89: bipush 1
      // 8a: swap
      // 8b: aastore
      // 8c: dup_x2
      // 8d: dup_x2
      // 8e: pop
      // 8f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 92: bipush 0
      // 93: swap
      // 94: aastore
      // 95: ldc2_w -5417063760381902241
      // 98: lload 3
      // 99: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: aload 11
      // a0: aload 5
      // a2: iload 2
      // a3: lload 6
      // a5: bipush 3
      // a6: anewarray 46
      // a9: dup_x2
      // aa: dup_x2
      // ab: pop
      // ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // af: bipush 2
      // b0: swap
      // b1: aastore
      // b2: dup_x1
      // b3: swap
      // b4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b7: bipush 1
      // b8: swap
      // b9: aastore
      // ba: dup_x1
      // bb: swap
      // bc: bipush 0
      // bd: swap
      // be: aastore
      // bf: ldc2_w -5909107293428344197
      // c2: lload 3
      // c3: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: return
   }

   void Qn(Object[] param1) {
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
      // 0e: checkcast java/util/ArrayList
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/ig.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 71828188473822
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -4357244667459669011
      // 25: lload 3
      // 26: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: iload 7
      // 30: ifeq 55
      // 33: getfield com/zelix/ig.H I
      // 36: bipush -1
      // 37: if_icmpeq 81
      // 3a: goto 47
      // 3d: ldc2_w -4481452244261472160
      // 40: lload 3
      // 41: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: goto 55
      // 4b: ldc2_w -4481452244261472160
      // 4e: lload 3
      // 4f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 58: aload 0
      // 59: getfield com/zelix/ig.H I
      // 5c: aaload
      // 5d: checkcast com/zelix/h_
      // 60: checkcast com/zelix/h_
      // 63: aload 2
      // 64: lload 5
      // 66: bipush 2
      // 67: anewarray 46
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x1
      // 74: swap
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w -2374649430221051181
      // 7b: lload 3
      // 7c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: return
   }

   public hz d(long var1) {
      return this.Y();
   }

   public String U(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 99751145620113
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 74909970880518
      // 018: lxor
      // 019: lstore 6
      // 01b: dup2
      // 01c: ldc2_w 15671029400242
      // 01f: lxor
      // 020: lstore 8
      // 022: dup2
      // 023: ldc2_w 23447813675032
      // 026: lxor
      // 027: lstore 10
      // 029: dup2
      // 02a: ldc2_w 59106543820356
      // 02d: lxor
      // 02e: lstore 12
      // 030: dup2
      // 031: ldc2_w 125741348917880
      // 034: lxor
      // 035: lstore 14
      // 037: dup2
      // 038: ldc2_w 50793807356848
      // 03b: lxor
      // 03c: lstore 16
      // 03e: pop2
      // 03f: sipush 19332
      // 042: ldc2_w 7131005957090262329
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: astore 19
      // 04e: ldc2_w -769657762591620843
      // 051: lload 2
      // 052: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: new java/lang/StringBuffer
      // 05a: dup
      // 05b: invokespecial java/lang/StringBuffer.<init> ()V
      // 05e: astore 20
      // 060: aload 0
      // 061: lload 10
      // 063: invokevirtual com/zelix/ig.x (J)Ljava/util/Enumeration;
      // 066: astore 21
      // 068: istore 18
      // 06a: aload 21
      // 06c: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 071: ifeq 0d6
      // 074: aload 20
      // 076: sipush 18482
      // 079: ldc2_w 2619933677135806140
      // 07c: lload 2
      // 07d: lxor
      // 07e: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 086: pop
      // 087: aload 20
      // 089: getstatic com/zelix/ig.P J
      // 08c: l2i
      // 08d: ldc2_w -1666087329760804000
      // 090: lload 2
      // 091: invokedynamic o (Ljava/lang/Object;CJJ)Ljava/lang/StringBuffer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: pop
      // 097: aload 20
      // 099: aload 21
      // 09b: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 0a0: checkcast java/lang/String
      // 0a3: invokestatic com/zelix/sh.b (Ljava/lang/String;)Ljava/lang/String;
      // 0a6: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0a9: pop
      // 0aa: aload 20
      // 0ac: getstatic com/zelix/mc.R Ljava/lang/String;
      // 0af: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0b2: pop
      // 0b3: iload 18
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: ifle 0c0
      // 0bb: ifne 0e9
      // 0be: iload 18
      // 0c0: ifeq 06a
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: iflt 0b3
      // 0c9: goto 0d6
      // 0cc: ldc2_w -1553856492237958207
      // 0cf: lload 2
      // 0d0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 20
      // 0d8: sipush 6995
      // 0db: ldc2_w 7421833782065524208
      // 0de: lload 2
      // 0df: lxor
      // 0e0: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e5: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 0e8: pop
      // 0e9: aconst_null
      // 0ea: astore 21
      // 0ec: aload 0
      // 0ed: iload 18
      // 0ef: ifne 114
      // 0f2: getfield com/zelix/ig.H I
      // 0f5: bipush -1
      // 0f6: if_icmpeq 13d
      // 0f9: goto 106
      // 0fc: ldc2_w -1553856492237958207
      // 0ff: lload 2
      // 100: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 0
      // 107: goto 114
      // 10a: ldc2_w -1553856492237958207
      // 10d: lload 2
      // 10e: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 117: aload 0
      // 118: getfield com/zelix/ig.H I
      // 11b: aaload
      // 11c: checkcast com/zelix/h_
      // 11f: astore 22
      // 121: aload 22
      // 123: lload 6
      // 125: bipush 1
      // 126: anewarray 46
      // 129: dup_x2
      // 12a: dup_x2
      // 12b: pop
      // 12c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12f: bipush 0
      // 130: swap
      // 131: aastore
      // 132: ldc2_w -590427115674003182
      // 135: lload 2
      // 136: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13b: astore 21
      // 13d: aload 20
      // 13f: aload 0
      // 140: aload 21
      // 142: lload 16
      // 144: bipush 2
      // 145: anewarray 46
      // 148: dup_x2
      // 149: dup_x2
      // 14a: pop
      // 14b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14e: bipush 1
      // 14f: swap
      // 150: aastore
      // 151: dup_x1
      // 152: swap
      // 153: bipush 0
      // 154: swap
      // 155: aastore
      // 156: ldc2_w -727288442636972262
      // 159: lload 2
      // 15a: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 162: pop
      // 163: aload 20
      // 165: aload 0
      // 166: lload 4
      // 168: bipush 1
      // 169: anewarray 46
      // 16c: dup_x2
      // 16d: dup_x2
      // 16e: pop
      // 16f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 172: bipush 0
      // 173: swap
      // 174: aastore
      // 175: ldc2_w -1049017313241496695
      // 178: lload 2
      // 179: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 181: pop
      // 182: aload 20
      // 184: sipush 25387
      // 187: ldc2_w 6014445952866456998
      // 18a: lload 2
      // 18b: lxor
      // 18c: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 194: pop
      // 195: aload 20
      // 197: getstatic com/zelix/mc.R Ljava/lang/String;
      // 19a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 19d: pop
      // 19e: aload 0
      // 19f: lload 12
      // 1a1: bipush 1
      // 1a2: anewarray 46
      // 1a5: dup_x2
      // 1a6: dup_x2
      // 1a7: pop
      // 1a8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ab: bipush 0
      // 1ac: swap
      // 1ad: aastore
      // 1ae: ldc2_w -1483843623751628330
      // 1b1: lload 2
      // 1b2: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b7: istore 22
      // 1b9: aload 0
      // 1ba: lload 8
      // 1bc: bipush 1
      // 1bd: anewarray 46
      // 1c0: dup_x2
      // 1c1: dup_x2
      // 1c2: pop
      // 1c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c6: bipush 0
      // 1c7: swap
      // 1c8: aastore
      // 1c9: ldc2_w -1071437690615234949
      // 1cc: lload 2
      // 1cd: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: istore 23
      // 1d4: iload 23
      // 1d6: istore 24
      // 1d8: iload 24
      // 1da: iload 22
      // 1dc: if_icmpge 23d
      // 1df: aload 20
      // 1e1: new java/lang/StringBuilder
      // 1e4: dup
      // 1e5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e8: sipush 6274
      // 1eb: ldc2_w 7936524566614896131
      // 1ee: lload 2
      // 1ef: lxor
      // 1f0: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f8: aload 19
      // 1fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fd: iload 24
      // 1ff: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 202: ldc ";"
      // 204: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 207: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 20d: pop
      // 20e: aload 20
      // 210: getstatic com/zelix/mc.R Ljava/lang/String;
      // 213: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 216: pop
      // 217: iinc 24 1
      // 21a: iload 18
      // 21c: lload 2
      // 21d: lconst_0
      // 21e: lcmp
      // 21f: ifle 227
      // 222: ifne 246
      // 225: iload 18
      // 227: ifeq 1d8
      // 22a: lload 2
      // 22b: lconst_0
      // 22c: lcmp
      // 22d: ifle 21a
      // 230: goto 23d
      // 233: ldc2_w -1553856492237958207
      // 236: lload 2
      // 237: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: aload 20
      // 23f: getstatic com/zelix/mc.R Ljava/lang/String;
      // 242: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 245: pop
      // 246: new java/io/StringWriter
      // 249: dup
      // 24a: invokespecial java/io/StringWriter.<init> ()V
      // 24d: astore 24
      // 24f: new java/io/PrintWriter
      // 252: dup
      // 253: aload 24
      // 255: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 258: astore 25
      // 25a: aload 0
      // 25b: aload 25
      // 25d: bipush 2
      // 25e: lload 14
      // 260: bipush 3
      // 261: anewarray 46
      // 264: dup_x2
      // 265: dup_x2
      // 266: pop
      // 267: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26a: bipush 2
      // 26b: swap
      // 26c: aastore
      // 26d: dup_x1
      // 26e: swap
      // 26f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 272: bipush 1
      // 273: swap
      // 274: aastore
      // 275: dup_x1
      // 276: swap
      // 277: bipush 0
      // 278: swap
      // 279: aastore
      // 27a: ldc2_w -1357152862770565129
      // 27d: lload 2
      // 27e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: aload 20
      // 285: aload 24
      // 287: ldc2_w -1607707239387264272
      // 28a: lload 2
      // 28b: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 293: pop
      // 294: aload 20
      // 296: ldc "}"
      // 298: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 29b: pop
      // 29c: aload 20
      // 29e: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 2a1: areturn
   }

   void ty(Object[] param1) {
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
      // 004: checkcast com/zelix/_uh
      // 007: astore 10
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/a9
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/_yz
      // 016: astore 12
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/xy
      // 01e: astore 15
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/lang/Long
      // 026: invokevirtual java/lang/Long.longValue ()J
      // 029: lstore 4
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast com/zelix/_ye
      // 031: astore 9
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/w
      // 03a: astore 14
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast com/zelix/yn
      // 043: astore 13
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast java/lang/String
      // 04c: astore 2
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast java/lang/Boolean
      // 054: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 057: istore 16
      // 059: dup
      // 05a: bipush 10
      // 05c: aaload
      // 05d: checkcast java/lang/Integer
      // 060: invokevirtual java/lang/Integer.intValue ()I
      // 063: istore 6
      // 065: dup
      // 066: bipush 11
      // 068: aaload
      // 069: checkcast java/util/Map
      // 06c: astore 18
      // 06e: dup
      // 06f: bipush 12
      // 071: aaload
      // 072: checkcast java/util/Map
      // 075: astore 7
      // 077: dup
      // 078: bipush 13
      // 07a: aaload
      // 07b: checkcast java/lang/Boolean
      // 07e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 081: istore 17
      // 083: dup
      // 084: bipush 14
      // 086: aaload
      // 087: checkcast java/util/HashMap
      // 08a: astore 11
      // 08c: dup
      // 08d: bipush 15
      // 08f: aaload
      // 090: checkcast java/util/Map
      // 093: astore 8
      // 095: pop
      // 096: getstatic com/zelix/ig.b J
      // 099: lload 4
      // 09b: lxor
      // 09c: lstore 4
      // 09e: lload 4
      // 0a0: dup2
      // 0a1: ldc2_w 8124643691008
      // 0a4: lxor
      // 0a5: dup2
      // 0a6: bipush 48
      // 0a8: lushr
      // 0a9: l2i
      // 0aa: istore 19
      // 0ac: dup2
      // 0ad: bipush 16
      // 0af: lshl
      // 0b0: bipush 48
      // 0b2: lushr
      // 0b3: l2i
      // 0b4: istore 20
      // 0b6: dup2
      // 0b7: bipush 32
      // 0b9: lshl
      // 0ba: bipush 32
      // 0bc: lushr
      // 0bd: l2i
      // 0be: istore 21
      // 0c0: pop2
      // 0c1: dup2
      // 0c2: ldc2_w 62151480266700
      // 0c5: lxor
      // 0c6: lstore 22
      // 0c8: dup2
      // 0c9: ldc2_w 76449204427725
      // 0cc: lxor
      // 0cd: lstore 24
      // 0cf: dup2
      // 0d0: ldc2_w 102638350692595
      // 0d3: lxor
      // 0d4: lstore 26
      // 0d6: dup2
      // 0d7: ldc2_w 120673102693903
      // 0da: lxor
      // 0db: lstore 28
      // 0dd: dup2
      // 0de: ldc2_w 18602509428257
      // 0e1: lxor
      // 0e2: lstore 30
      // 0e4: dup2
      // 0e5: ldc2_w 63367800719739
      // 0e8: lxor
      // 0e9: dup2
      // 0ea: bipush 56
      // 0ec: lushr
      // 0ed: l2i
      // 0ee: istore 32
      // 0f0: dup2
      // 0f1: bipush 8
      // 0f3: lshl
      // 0f4: bipush 32
      // 0f6: lushr
      // 0f7: l2i
      // 0f8: istore 33
      // 0fa: dup2
      // 0fb: bipush 40
      // 0fd: lshl
      // 0fe: bipush 40
      // 100: lushr
      // 101: l2i
      // 102: istore 34
      // 104: pop2
      // 105: dup2
      // 106: ldc2_w 37746888182925
      // 109: lxor
      // 10a: lstore 35
      // 10c: dup2
      // 10d: ldc2_w 111898685071432
      // 110: lxor
      // 111: lstore 37
      // 113: dup2
      // 114: ldc2_w 11188723769453
      // 117: lxor
      // 118: lstore 39
      // 11a: dup2
      // 11b: ldc2_w 112675478264707
      // 11e: lxor
      // 11f: lstore 41
      // 121: dup2
      // 122: ldc2_w 41955457436935
      // 125: lxor
      // 126: lstore 43
      // 128: dup2
      // 129: ldc2_w 11188723769453
      // 12c: lxor
      // 12d: lstore 45
      // 12f: dup2
      // 130: ldc2_w 48104234940635
      // 133: lxor
      // 134: lstore 47
      // 136: dup2
      // 137: ldc2_w 129417991768409
      // 13a: lxor
      // 13b: lstore 49
      // 13d: dup2
      // 13e: ldc2_w 65146925449144
      // 141: lxor
      // 142: lstore 51
      // 144: dup2
      // 145: ldc2_w 103391156559641
      // 148: lxor
      // 149: lstore 53
      // 14b: dup2
      // 14c: ldc2_w 126262669359550
      // 14f: lxor
      // 150: lstore 55
      // 152: dup2
      // 153: ldc2_w 58907726746784
      // 156: lxor
      // 157: lstore 57
      // 159: dup2
      // 15a: ldc2_w 70110067238248
      // 15d: lxor
      // 15e: dup2
      // 15f: bipush 32
      // 161: lushr
      // 162: l2i
      // 163: istore 59
      // 165: dup2
      // 166: bipush 32
      // 168: lshl
      // 169: bipush 48
      // 16b: lushr
      // 16c: l2i
      // 16d: istore 60
      // 16f: dup2
      // 170: bipush 48
      // 172: lshl
      // 173: bipush 48
      // 175: lushr
      // 176: l2i
      // 177: istore 61
      // 179: pop2
      // 17a: dup2
      // 17b: ldc2_w 39158018220159
      // 17e: lxor
      // 17f: lstore 62
      // 181: dup2
      // 182: ldc2_w 12543659462262
      // 185: lxor
      // 186: lstore 64
      // 188: dup2
      // 189: ldc2_w 9552197896848
      // 18c: lxor
      // 18d: dup2
      // 18e: bipush 48
      // 190: lushr
      // 191: l2i
      // 192: istore 66
      // 194: dup2
      // 195: bipush 16
      // 197: lshl
      // 198: bipush 32
      // 19a: lushr
      // 19b: l2i
      // 19c: istore 67
      // 19e: dup2
      // 19f: bipush 48
      // 1a1: lshl
      // 1a2: bipush 48
      // 1a4: lushr
      // 1a5: l2i
      // 1a6: istore 68
      // 1a8: pop2
      // 1a9: dup2
      // 1aa: ldc2_w 20551009030115
      // 1ad: lxor
      // 1ae: lstore 69
      // 1b0: dup2
      // 1b1: ldc2_w 34795271047840
      // 1b4: lxor
      // 1b5: dup2
      // 1b6: bipush 32
      // 1b8: lushr
      // 1b9: l2i
      // 1ba: istore 71
      // 1bc: dup2
      // 1bd: bipush 32
      // 1bf: lshl
      // 1c0: bipush 32
      // 1c2: lushr
      // 1c3: l2i
      // 1c4: istore 72
      // 1c6: pop2
      // 1c7: dup2
      // 1c8: ldc2_w 5539955102191
      // 1cb: lxor
      // 1cc: lstore 73
      // 1ce: dup2
      // 1cf: ldc2_w 113677443538576
      // 1d2: lxor
      // 1d3: lstore 75
      // 1d5: dup2
      // 1d6: ldc2_w 56387213496298
      // 1d9: lxor
      // 1da: lstore 77
      // 1dc: dup2
      // 1dd: ldc2_w 33874947581859
      // 1e0: lxor
      // 1e1: lstore 79
      // 1e3: dup2
      // 1e4: ldc2_w 27158364856231
      // 1e7: lxor
      // 1e8: lstore 81
      // 1ea: dup2
      // 1eb: ldc2_w 33708120868324
      // 1ee: lxor
      // 1ef: lstore 83
      // 1f1: dup2
      // 1f2: ldc2_w 101965020934432
      // 1f5: lxor
      // 1f6: lstore 85
      // 1f8: pop2
      // 1f9: ldc2_w 3080730398242839210
      // 1fc: lload 4
      // 1fe: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: aload 0
      // 204: lload 41
      // 206: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // 209: astore 88
      // 20b: istore 87
      // 20d: aconst_null
      // 20e: astore 89
      // 210: aload 13
      // 212: iload 66
      // 214: i2s
      // 215: iload 67
      // 217: iload 68
      // 219: i2s
      // 21a: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 21d: astore 90
      // 21f: bipush 0
      // 220: istore 91
      // 222: aload 3
      // 223: iload 87
      // 225: ifeq 23a
      // 228: ifnull 985
      // 22b: goto 239
      // 22e: ldc2_w 2921050669365334311
      // 231: lload 4
      // 233: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: athrow
      // 239: aload 3
      // 23a: lload 75
      // 23c: aload 0
      // 23d: bipush 2
      // 23e: anewarray 46
      // 241: dup_x1
      // 242: swap
      // 243: bipush 1
      // 244: swap
      // 245: aastore
      // 246: dup_x2
      // 247: dup_x2
      // 248: pop
      // 249: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 24c: bipush 0
      // 24d: swap
      // 24e: aastore
      // 24f: ldc2_w 3148055417078036331
      // 252: lload 4
      // 254: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: iload 87
      // 25b: ifeq 270
      // 25e: ifeq 985
      // 261: goto 26f
      // 264: ldc2_w 2921050669365334311
      // 267: lload 4
      // 269: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: athrow
      // 26f: bipush 1
      // 270: istore 91
      // 272: aload 9
      // 274: lload 77
      // 276: aload 0
      // 277: bipush 2
      // 278: anewarray 46
      // 27b: dup_x1
      // 27c: swap
      // 27d: bipush 1
      // 27e: swap
      // 27f: aastore
      // 280: dup_x2
      // 281: dup_x2
      // 282: pop
      // 283: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 286: bipush 0
      // 287: swap
      // 288: aastore
      // 289: ldc2_w 3213439218911229416
      // 28c: lload 4
      // 28e: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: astore 92
      // 295: aload 3
      // 296: aload 92
      // 298: iload 87
      // 29a: ifeq 2df
      // 29d: lload 57
      // 29f: dup2_x1
      // 2a0: pop2
      // 2a1: bipush 2
      // 2a2: anewarray 46
      // 2a5: dup_x1
      // 2a6: swap
      // 2a7: bipush 1
      // 2a8: swap
      // 2a9: aastore
      // 2aa: dup_x2
      // 2ab: dup_x2
      // 2ac: pop
      // 2ad: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b0: bipush 0
      // 2b1: swap
      // 2b2: aastore
      // 2b3: ldc2_w 3186285799662842013
      // 2b6: lload 4
      // 2b8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: ifeq 985
      // 2c0: goto 2ce
      // 2c3: ldc2_w 2921050669365334311
      // 2c6: lload 4
      // 2c8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: athrow
      // 2ce: aload 3
      // 2cf: aload 92
      // 2d1: goto 2df
      // 2d4: ldc2_w 2921050669365334311
      // 2d7: lload 4
      // 2d9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2de: athrow
      // 2df: lload 53
      // 2e1: bipush 2
      // 2e2: anewarray 46
      // 2e5: dup_x2
      // 2e6: dup_x2
      // 2e7: pop
      // 2e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2eb: bipush 1
      // 2ec: swap
      // 2ed: aastore
      // 2ee: dup_x1
      // 2ef: swap
      // 2f0: bipush 0
      // 2f1: swap
      // 2f2: aastore
      // 2f3: ldc2_w 3231222173714413747
      // 2f6: lload 4
      // 2f8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_a; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: astore 93
      // 2ff: new com/zelix/_3
      // 302: dup
      // 303: aload 0
      // 304: invokevirtual com/zelix/ig.H ()Ljava/lang/String;
      // 307: iload 32
      // 309: i2b
      // 30a: swap
      // 30b: iload 33
      // 30d: swap
      // 30e: iload 34
      // 310: swap
      // 311: aload 93
      // 313: invokespecial com/zelix/_3.<init> (BIILjava/lang/String;[Lcom/zelix/_a;)V
      // 316: astore 89
      // 318: aload 0
      // 319: lload 79
      // 31b: invokevirtual com/zelix/ig.Q (J)Z
      // 31e: iload 87
      // 320: ifeq 98e
      // 323: ifne 985
      // 326: goto 334
      // 329: ldc2_w 2921050669365334311
      // 32c: lload 4
      // 32e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 333: athrow
      // 334: aload 89
      // 336: invokevirtual com/zelix/_3.Q ()Ljava/lang/String;
      // 339: astore 94
      // 33b: iload 17
      // 33d: ifeq 35b
      // 340: new com/zelix/_fz
      // 343: dup
      // 344: aload 0
      // 345: getfield com/zelix/ig.k Ljava/lang/String;
      // 348: aload 94
      // 34a: invokespecial com/zelix/_fz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 34d: goto 36f
      // 350: ldc2_w 2921050669365334311
      // 353: lload 4
      // 355: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: athrow
      // 35b: new com/zelix/_fr
      // 35e: dup
      // 35f: aload 0
      // 360: getfield com/zelix/ig.k Ljava/lang/String;
      // 363: iload 59
      // 365: iload 60
      // 367: i2c
      // 368: iload 61
      // 36a: aload 94
      // 36c: invokespecial com/zelix/_fr.<init> (Ljava/lang/String;ICILjava/lang/String;)V
      // 36f: astore 95
      // 371: aload 14
      // 373: lload 64
      // 375: aload 95
      // 377: invokevirtual com/zelix/w.N (JLjava/lang/Object;)Ljava/util/Set;
      // 37a: astore 96
      // 37c: aload 96
      // 37e: lload 4
      // 380: lconst_0
      // 381: lcmp
      // 382: iflt 39d
      // 385: iload 87
      // 387: ifeq 39d
      // 38a: ifnull 985
      // 38d: goto 39b
      // 390: ldc2_w 2921050669365334311
      // 393: lload 4
      // 395: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39a: athrow
      // 39b: aload 96
      // 39d: ldc2_w 3309579300672236108
      // 3a0: lload 4
      // 3a2: invokedynamic i (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: iload 87
      // 3a9: lload 4
      // 3ab: lconst_0
      // 3ac: lcmp
      // 3ad: iflt 990
      // 3b0: ifeq 98e
      // 3b3: ifne 985
      // 3b6: goto 3c4
      // 3b9: ldc2_w 2921050669365334311
      // 3bc: lload 4
      // 3be: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c3: athrow
      // 3c4: aload 96
      // 3c6: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 3cb: astore 97
      // 3cd: aload 97
      // 3cf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3d4: ifeq 985
      // 3d7: aload 97
      // 3d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3de: checkcast com/zelix/iu
      // 3e1: astore 98
      // 3e3: aload 98
      // 3e5: iload 71
      // 3e7: iload 72
      // 3e9: invokevirtual com/zelix/iu.m (II)Z
      // 3ec: iload 87
      // 3ee: lload 4
      // 3f0: lconst_0
      // 3f1: lcmp
      // 3f2: ifle 3fa
      // 3f5: ifeq 98e
      // 3f8: iload 87
      // 3fa: lload 4
      // 3fc: lconst_0
      // 3fd: lcmp
      // 3fe: ifle 55c
      // 401: ifeq 55a
      // 404: goto 412
      // 407: ldc2_w 2921050669365334311
      // 40a: lload 4
      // 40c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 411: athrow
      // 412: ifeq 545
      // 415: goto 423
      // 418: ldc2_w 2921050669365334311
      // 41b: lload 4
      // 41d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 422: athrow
      // 423: bipush 0
      // 424: istore 91
      // 426: aload 3
      // 427: lload 83
      // 429: aload 92
      // 42b: bipush 2
      // 42c: anewarray 46
      // 42f: dup_x1
      // 430: swap
      // 431: bipush 1
      // 432: swap
      // 433: aastore
      // 434: dup_x2
      // 435: dup_x2
      // 436: pop
      // 437: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43a: bipush 0
      // 43b: swap
      // 43c: aastore
      // 43d: ldc2_w 3034136328578247084
      // 440: lload 4
      // 442: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 447: aload 3
      // 448: new java/lang/StringBuilder
      // 44b: dup
      // 44c: invokespecial java/lang/StringBuilder.<init> ()V
      // 44f: sipush 26037
      // 452: ldc2_w 616026133545996778
      // 455: lload 4
      // 457: lxor
      // 458: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 460: aload 0
      // 461: lload 47
      // 463: ldc2_w 3913628958019015256
      // 466: lload 4
      // 468: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 470: sipush 282
      // 473: ldc2_w 8944842618690450758
      // 476: lload 4
      // 478: lxor
      // 479: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 481: aload 0
      // 482: lload 45
      // 484: bipush 1
      // 485: anewarray 46
      // 488: dup_x2
      // 489: dup_x2
      // 48a: pop
      // 48b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 48e: bipush 0
      // 48f: swap
      // 490: aastore
      // 491: ldc2_w 3243938043403457226
      // 494: lload 4
      // 496: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49e: sipush 15200
      // 4a1: ldc2_w 1306542418219831083
      // 4a4: lload 4
      // 4a6: lxor
      // 4a7: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4af: aload 95
      // 4b1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4b4: sipush 18958
      // 4b7: ldc2_w 8393333375261015643
      // 4ba: lload 4
      // 4bc: lxor
      // 4bd: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c5: aload 98
      // 4c7: lload 47
      // 4c9: ldc2_w 3913628958019015256
      // 4cc: lload 4
      // 4ce: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4d6: sipush 282
      // 4d9: ldc2_w 8944842618690450758
      // 4dc: lload 4
      // 4de: lxor
      // 4df: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e7: aload 98
      // 4e9: lload 45
      // 4eb: bipush 1
      // 4ec: anewarray 46
      // 4ef: dup_x2
      // 4f0: dup_x2
      // 4f1: pop
      // 4f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4f5: bipush 0
      // 4f6: swap
      // 4f7: aastore
      // 4f8: ldc2_w 3243938043403457226
      // 4fb: lload 4
      // 4fd: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 502: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 505: sipush 10596
      // 508: ldc2_w 987712999690837268
      // 50b: lload 4
      // 50d: lxor
      // 50e: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 513: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 516: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 519: lload 30
      // 51b: dup2_x1
      // 51c: pop2
      // 51d: bipush 2
      // 51e: anewarray 46
      // 521: dup_x1
      // 522: swap
      // 523: bipush 1
      // 524: swap
      // 525: aastore
      // 526: dup_x2
      // 527: dup_x2
      // 528: pop
      // 529: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 52c: bipush 0
      // 52d: swap
      // 52e: aastore
      // 52f: ldc2_w 3711897440087776234
      // 532: lload 4
      // 534: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 539: iload 87
      // 53b: lload 4
      // 53d: lconst_0
      // 53e: lcmp
      // 53f: ifle 54c
      // 542: ifne 800
      // 545: aload 98
      // 547: lload 81
      // 549: invokevirtual com/zelix/iu.C (J)Z
      // 54c: goto 55a
      // 54f: ldc2_w 2921050669365334311
      // 552: lload 4
      // 554: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 559: athrow
      // 55a: iload 87
      // 55c: lload 4
      // 55e: lconst_0
      // 55f: lcmp
      // 560: ifle 580
      // 563: ifeq 57e
      // 566: ifne 3cd
      // 569: goto 577
      // 56c: ldc2_w 2921050669365334311
      // 56f: lload 4
      // 571: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 576: athrow
      // 577: aload 98
      // 579: lload 51
      // 57b: invokevirtual com/zelix/iu.n (J)Z
      // 57e: iload 87
      // 580: lload 4
      // 582: lconst_0
      // 583: lcmp
      // 584: iflt 5c4
      // 587: ifeq 5bb
      // 58a: ifeq 5b5
      // 58d: goto 59b
      // 590: ldc2_w 2921050669365334311
      // 593: lload 4
      // 595: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59a: athrow
      // 59b: iload 87
      // 59d: lload 4
      // 59f: lconst_0
      // 5a0: lcmp
      // 5a1: iflt 3d4
      // 5a4: ifne 3cd
      // 5a7: goto 5b5
      // 5aa: ldc2_w 2921050669365334311
      // 5ad: lload 4
      // 5af: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b4: athrow
      // 5b5: aload 0
      // 5b6: lload 81
      // 5b8: invokevirtual com/zelix/ig.C (J)Z
      // 5bb: lload 4
      // 5bd: lconst_0
      // 5be: lcmp
      // 5bf: iflt 5ff
      // 5c2: iload 87
      // 5c4: ifeq 5ff
      // 5c7: ifne 800
      // 5ca: goto 5d8
      // 5cd: ldc2_w 2921050669365334311
      // 5d0: lload 4
      // 5d2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d7: athrow
      // 5d8: aload 0
      // 5d9: iload 87
      // 5db: ifeq 632
      // 5de: goto 5ec
      // 5e1: ldc2_w 2921050669365334311
      // 5e4: lload 4
      // 5e6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5eb: athrow
      // 5ec: lload 51
      // 5ee: invokevirtual com/zelix/ig.n (J)Z
      // 5f1: goto 5ff
      // 5f4: ldc2_w 2921050669365334311
      // 5f7: lload 4
      // 5f9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fe: athrow
      // 5ff: ifne 800
      // 602: aload 9
      // 604: lload 77
      // 606: aload 98
      // 608: bipush 2
      // 609: anewarray 46
      // 60c: dup_x1
      // 60d: swap
      // 60e: bipush 1
      // 60f: swap
      // 610: aastore
      // 611: dup_x2
      // 612: dup_x2
      // 613: pop
      // 614: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 617: bipush 0
      // 618: swap
      // 619: aastore
      // 61a: ldc2_w 3213439218911229416
      // 61d: lload 4
      // 61f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 624: goto 632
      // 627: ldc2_w 2921050669365334311
      // 62a: lload 4
      // 62c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 631: athrow
      // 632: astore 99
      // 634: lload 4
      // 636: lconst_0
      // 637: lcmp
      // 638: iflt 679
      // 63b: iload 87
      // 63d: ifeq 679
      // 640: aload 92
      // 642: aload 99
      // 644: if_acmpeq 800
      // 647: goto 655
      // 64a: ldc2_w 2921050669365334311
      // 64d: lload 4
      // 64f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 654: athrow
      // 655: bipush 0
      // 656: istore 91
      // 658: aload 3
      // 659: lload 83
      // 65b: aload 92
      // 65d: bipush 2
      // 65e: anewarray 46
      // 661: dup_x1
      // 662: swap
      // 663: bipush 1
      // 664: swap
      // 665: aastore
      // 666: dup_x2
      // 667: dup_x2
      // 668: pop
      // 669: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 66c: bipush 0
      // 66d: swap
      // 66e: aastore
      // 66f: ldc2_w 3034136328578247084
      // 672: lload 4
      // 674: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 679: aload 3
      // 67a: new java/lang/StringBuilder
      // 67d: dup
      // 67e: invokespecial java/lang/StringBuilder.<init> ()V
      // 681: sipush 26037
      // 684: ldc2_w 616026133545996778
      // 687: lload 4
      // 689: lxor
      // 68a: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 692: aload 0
      // 693: lload 47
      // 695: ldc2_w 3913628958019015256
      // 698: lload 4
      // 69a: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6a2: sipush 282
      // 6a5: ldc2_w 8944842618690450758
      // 6a8: lload 4
      // 6aa: lxor
      // 6ab: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b3: aload 0
      // 6b4: lload 45
      // 6b6: bipush 1
      // 6b7: anewarray 46
      // 6ba: dup_x2
      // 6bb: dup_x2
      // 6bc: pop
      // 6bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c0: bipush 0
      // 6c1: swap
      // 6c2: aastore
      // 6c3: ldc2_w 3243938043403457226
      // 6c6: lload 4
      // 6c8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6d0: sipush 2705
      // 6d3: ldc2_w 2711417759481544412
      // 6d6: lload 4
      // 6d8: lxor
      // 6d9: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e1: aload 95
      // 6e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6e6: sipush 4964
      // 6e9: ldc2_w 8165092047187814186
      // 6ec: lload 4
      // 6ee: lxor
      // 6ef: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6f7: aload 98
      // 6f9: lload 47
      // 6fb: ldc2_w 3913628958019015256
      // 6fe: lload 4
      // 700: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 705: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 708: sipush 282
      // 70b: ldc2_w 8944842618690450758
      // 70e: lload 4
      // 710: lxor
      // 711: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 716: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 719: aload 98
      // 71b: lload 45
      // 71d: bipush 1
      // 71e: anewarray 46
      // 721: dup_x2
      // 722: dup_x2
      // 723: pop
      // 724: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 727: bipush 0
      // 728: swap
      // 729: aastore
      // 72a: ldc2_w 3243938043403457226
      // 72d: lload 4
      // 72f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 734: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 737: lload 4
      // 739: lconst_0
      // 73a: lcmp
      // 73b: iflt 748
      // 73e: ldc "'"
      // 740: iload 87
      // 742: ifeq 7c4
      // 745: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 748: aload 98
      // 74a: lload 73
      // 74c: invokevirtual com/zelix/iu.g (J)Z
      // 74f: ifne 78c
      // 752: goto 760
      // 755: ldc2_w 2921050669365334311
      // 758: lload 4
      // 75a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75f: athrow
      // 760: aload 98
      // 762: lload 62
      // 764: bipush 1
      // 765: anewarray 46
      // 768: dup_x2
      // 769: dup_x2
      // 76a: pop
      // 76b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 76e: bipush 0
      // 76f: swap
      // 770: aastore
      // 771: ldc2_w 3793418358642651909
      // 774: lload 4
      // 776: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77b: ifeq 7c7
      // 77e: goto 78c
      // 781: ldc2_w 2921050669365334311
      // 784: lload 4
      // 786: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78b: athrow
      // 78c: new java/lang/StringBuilder
      // 78f: dup
      // 790: invokespecial java/lang/StringBuilder.<init> ()V
      // 793: sipush 22825
      // 796: ldc2_w 5021106569182375239
      // 799: lload 4
      // 79b: lxor
      // 79c: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a4: aload 98
      // 7a6: lload 41
      // 7a8: invokevirtual com/zelix/iu.G (J)Lcom/zelix/_fz;
      // 7ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7ae: ldc "'"
      // 7b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7b6: goto 7c4
      // 7b9: ldc2_w 2921050669365334311
      // 7bc: lload 4
      // 7be: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7c3: athrow
      // 7c4: goto 7c9
      // 7c7: ldc ""
      // 7c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7cc: sipush 28310
      // 7cf: ldc2_w 8336999491367754487
      // 7d2: lload 4
      // 7d4: lxor
      // 7d5: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7dd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e0: lload 30
      // 7e2: dup2_x1
      // 7e3: pop2
      // 7e4: bipush 2
      // 7e5: anewarray 46
      // 7e8: dup_x1
      // 7e9: swap
      // 7ea: bipush 1
      // 7eb: swap
      // 7ec: aastore
      // 7ed: dup_x2
      // 7ee: dup_x2
      // 7ef: pop
      // 7f0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7f3: bipush 0
      // 7f4: swap
      // 7f5: aastore
      // 7f6: ldc2_w 3711897440087776234
      // 7f9: lload 4
      // 7fb: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 800: aload 90
      // 802: aload 98
      // 804: lload 43
      // 806: bipush 2
      // 807: anewarray 46
      // 80a: dup_x2
      // 80b: dup_x2
      // 80c: pop
      // 80d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 810: bipush 1
      // 811: swap
      // 812: aastore
      // 813: dup_x1
      // 814: swap
      // 815: bipush 0
      // 816: swap
      // 817: aastore
      // 818: ldc2_w 3190740535374314326
      // 81b: lload 4
      // 81d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 822: astore 99
      // 824: iload 87
      // 826: ifeq 860
      // 829: aload 99
      // 82b: ifnull 980
      // 82e: goto 83c
      // 831: ldc2_w 2921050669365334311
      // 834: lload 4
      // 836: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83b: athrow
      // 83c: bipush 0
      // 83d: istore 91
      // 83f: aload 3
      // 840: lload 83
      // 842: aload 92
      // 844: bipush 2
      // 845: anewarray 46
      // 848: dup_x1
      // 849: swap
      // 84a: bipush 1
      // 84b: swap
      // 84c: aastore
      // 84d: dup_x2
      // 84e: dup_x2
      // 84f: pop
      // 850: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 853: bipush 0
      // 854: swap
      // 855: aastore
      // 856: ldc2_w 3034136328578247084
      // 859: lload 4
      // 85b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 860: aload 3
      // 861: new java/lang/StringBuilder
      // 864: dup
      // 865: invokespecial java/lang/StringBuilder.<init> ()V
      // 868: sipush 26037
      // 86b: ldc2_w 616026133545996778
      // 86e: lload 4
      // 870: lxor
      // 871: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 876: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 879: aload 0
      // 87a: lload 47
      // 87c: ldc2_w 3913628958019015256
      // 87f: lload 4
      // 881: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 886: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 889: sipush 282
      // 88c: ldc2_w 8944842618690450758
      // 88f: lload 4
      // 891: lxor
      // 892: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 897: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 89a: aload 0
      // 89b: lload 45
      // 89d: bipush 1
      // 89e: anewarray 46
      // 8a1: dup_x2
      // 8a2: dup_x2
      // 8a3: pop
      // 8a4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8a7: bipush 0
      // 8a8: swap
      // 8a9: aastore
      // 8aa: ldc2_w 3243938043403457226
      // 8ad: lload 4
      // 8af: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b7: sipush 2705
      // 8ba: ldc2_w 2711417759481544412
      // 8bd: lload 4
      // 8bf: lxor
      // 8c0: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c8: aload 95
      // 8ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8cd: sipush 15521
      // 8d0: ldc2_w 4940025403407960269
      // 8d3: lload 4
      // 8d5: lxor
      // 8d6: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8de: aload 98
      // 8e0: lload 47
      // 8e2: ldc2_w 3913628958019015256
      // 8e5: lload 4
      // 8e7: invokedynamic i (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8ef: sipush 282
      // 8f2: ldc2_w 8944842618690450758
      // 8f5: lload 4
      // 8f7: lxor
      // 8f8: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8fd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 900: aload 0
      // 901: lload 45
      // 903: bipush 1
      // 904: anewarray 46
      // 907: dup_x2
      // 908: dup_x2
      // 909: pop
      // 90a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 90d: bipush 0
      // 90e: swap
      // 90f: aastore
      // 910: ldc2_w 3243938043403457226
      // 913: lload 4
      // 915: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 91d: sipush 7097
      // 920: ldc2_w 8564614535266316282
      // 923: lload 4
      // 925: lxor
      // 926: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 92e: aload 99
      // 930: lload 39
      // 932: bipush 1
      // 933: anewarray 46
      // 936: dup_x2
      // 937: dup_x2
      // 938: pop
      // 939: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93c: bipush 0
      // 93d: swap
      // 93e: aastore
      // 93f: ldc2_w 3035475428336386834
      // 942: lload 4
      // 944: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 949: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 94c: sipush 24129
      // 94f: ldc2_w 2819629434867903000
      // 952: lload 4
      // 954: lxor
      // 955: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 95d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 960: lload 30
      // 962: dup2_x1
      // 963: pop2
      // 964: bipush 2
      // 965: anewarray 46
      // 968: dup_x1
      // 969: swap
      // 96a: bipush 1
      // 96b: swap
      // 96c: aastore
      // 96d: dup_x2
      // 96e: dup_x2
      // 96f: pop
      // 970: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 973: bipush 0
      // 974: swap
      // 975: aastore
      // 976: ldc2_w 3711897440087776234
      // 979: lload 4
      // 97b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 980: iload 87
      // 982: ifne 3cd
      // 985: lload 4
      // 987: lconst_0
      // 988: lcmp
      // 989: ifle c89
      // 98c: iload 91
      // 98e: iload 87
      // 990: lload 4
      // 992: lconst_0
      // 993: lcmp
      // 994: iflt 9c1
      // 997: ifeq 9bf
      // 99a: ifne c89
      // 99d: goto 9ab
      // 9a0: ldc2_w 2921050669365334311
      // 9a3: lload 4
      // 9a5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9aa: athrow
      // 9ab: aload 0
      // 9ac: lload 51
      // 9ae: invokevirtual com/zelix/ig.n (J)Z
      // 9b1: goto 9bf
      // 9b4: ldc2_w 2921050669365334311
      // 9b7: lload 4
      // 9b9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9be: athrow
      // 9bf: iload 87
      // 9c1: lload 4
      // 9c3: lconst_0
      // 9c4: lcmp
      // 9c5: iflt b4f
      // 9c8: ifeq b4d
      // 9cb: ifne b37
      // 9ce: goto 9dc
      // 9d1: ldc2_w 2921050669365334311
      // 9d4: lload 4
      // 9d6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9db: athrow
      // 9dc: aload 0
      // 9dd: lload 28
      // 9df: bipush 1
      // 9e0: anewarray 46
      // 9e3: dup_x2
      // 9e4: dup_x2
      // 9e5: pop
      // 9e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9e9: bipush 0
      // 9ea: swap
      // 9eb: aastore
      // 9ec: ldc2_w 3133144784744223620
      // 9ef: lload 4
      // 9f1: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f6: iload 87
      // 9f8: ifeq a35
      // 9fb: goto a09
      // 9fe: ldc2_w 2921050669365334311
      // a01: lload 4
      // a03: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a08: athrow
      // a09: lload 4
      // a0b: lconst_0
      // a0c: lcmp
      // a0d: ifle ab3
      // a10: ifne a38
      // a13: goto a21
      // a16: ldc2_w 2921050669365334311
      // a19: lload 4
      // a1b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a20: athrow
      // a21: aload 0
      // a22: lload 81
      // a24: invokevirtual com/zelix/ig.C (J)Z
      // a27: goto a35
      // a2a: ldc2_w 2921050669365334311
      // a2d: lload 4
      // a2f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a34: athrow
      // a35: ifne abd
      // a38: aload 15
      // a3a: aload 13
      // a3c: aload 2
      // a3d: aload 0
      // a3e: aload 14
      // a40: iload 16
      // a42: aload 18
      // a44: aload 7
      // a46: aload 0
      // a47: iload 19
      // a49: i2c
      // a4a: iload 20
      // a4c: i2c
      // a4d: iload 21
      // a4f: ldc2_w 3840986284812472736
      // a52: lload 4
      // a54: invokedynamic i (Ljava/lang/Object;CCIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a59: lload 85
      // a5b: iload 17
      // a5d: bipush 10
      // a5f: anewarray 46
      // a62: dup_x1
      // a63: swap
      // a64: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a67: bipush 9
      // a69: swap
      // a6a: aastore
      // a6b: dup_x2
      // a6c: dup_x2
      // a6d: pop
      // a6e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a71: bipush 8
      // a73: swap
      // a74: aastore
      // a75: dup_x1
      // a76: swap
      // a77: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a7a: bipush 7
      // a7c: swap
      // a7d: aastore
      // a7e: dup_x1
      // a7f: swap
      // a80: bipush 6
      // a82: swap
      // a83: aastore
      // a84: dup_x1
      // a85: swap
      // a86: bipush 5
      // a87: swap
      // a88: aastore
      // a89: dup_x1
      // a8a: swap
      // a8b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // a8e: bipush 4
      // a8f: swap
      // a90: aastore
      // a91: dup_x1
      // a92: swap
      // a93: bipush 3
      // a94: swap
      // a95: aastore
      // a96: dup_x1
      // a97: swap
      // a98: bipush 2
      // a99: swap
      // a9a: aastore
      // a9b: dup_x1
      // a9c: swap
      // a9d: bipush 1
      // a9e: swap
      // a9f: aastore
      // aa0: dup_x1
      // aa1: swap
      // aa2: bipush 0
      // aa3: swap
      // aa4: aastore
      // aa5: ldc2_w 3080435012811815424
      // aa8: lload 4
      // aaa: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aaf: astore 89
      // ab1: iload 87
      // ab3: lload 4
      // ab5: lconst_0
      // ab6: lcmp
      // ab7: iflt b2d
      // aba: ifne c89
      // abd: aload 15
      // abf: aload 13
      // ac1: lload 22
      // ac3: aload 2
      // ac4: aload 0
      // ac5: aload 14
      // ac7: aload 18
      // ac9: aload 7
      // acb: aload 0
      // acc: iload 19
      // ace: i2c
      // acf: iload 20
      // ad1: i2c
      // ad2: iload 21
      // ad4: ldc2_w 3840986284812472736
      // ad7: lload 4
      // ad9: invokedynamic i (Ljava/lang/Object;CCIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ade: iload 17
      // ae0: bipush 9
      // ae2: anewarray 46
      // ae5: dup_x1
      // ae6: swap
      // ae7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // aea: bipush 8
      // aec: swap
      // aed: aastore
      // aee: dup_x1
      // aef: swap
      // af0: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // af3: bipush 7
      // af5: swap
      // af6: aastore
      // af7: dup_x1
      // af8: swap
      // af9: bipush 6
      // afb: swap
      // afc: aastore
      // afd: dup_x1
      // afe: swap
      // aff: bipush 5
      // b00: swap
      // b01: aastore
      // b02: dup_x1
      // b03: swap
      // b04: bipush 4
      // b05: swap
      // b06: aastore
      // b07: dup_x1
      // b08: swap
      // b09: bipush 3
      // b0a: swap
      // b0b: aastore
      // b0c: dup_x1
      // b0d: swap
      // b0e: bipush 2
      // b0f: swap
      // b10: aastore
      // b11: dup_x2
      // b12: dup_x2
      // b13: pop
      // b14: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b17: bipush 1
      // b18: swap
      // b19: aastore
      // b1a: dup_x1
      // b1b: swap
      // b1c: bipush 0
      // b1d: swap
      // b1e: aastore
      // b1f: ldc2_w 3851576147849754016
      // b22: lload 4
      // b24: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b29: astore 89
      // b2b: iload 87
      // b2d: lload 4
      // b2f: lconst_0
      // b30: lcmp
      // b31: iflt b3f
      // b34: ifne c89
      // b37: aload 8
      // b39: aload 0
      // b3a: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // b3f: goto b4d
      // b42: ldc2_w 2921050669365334311
      // b45: lload 4
      // b47: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4c: athrow
      // b4d: iload 87
      // b4f: lload 4
      // b51: lconst_0
      // b52: lcmp
      // b53: ifle b94
      // b56: ifeq b92
      // b59: ifne c89
      // b5c: goto b6a
      // b5f: ldc2_w 2921050669365334311
      // b62: lload 4
      // b64: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b69: athrow
      // b6a: aload 0
      // b6b: lload 49
      // b6d: bipush 1
      // b6e: anewarray 46
      // b71: dup_x2
      // b72: dup_x2
      // b73: pop
      // b74: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b77: bipush 0
      // b78: swap
      // b79: aastore
      // b7a: ldc2_w 3073273027043018261
      // b7d: lload 4
      // b7f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b84: goto b92
      // b87: ldc2_w 2921050669365334311
      // b8a: lload 4
      // b8c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b91: athrow
      // b92: iload 87
      // b94: lload 4
      // b96: lconst_0
      // b97: lcmp
      // b98: iflt bc5
      // b9b: ifeq bc3
      // b9e: ifeq c10
      // ba1: goto baf
      // ba4: ldc2_w 2921050669365334311
      // ba7: lload 4
      // ba9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bae: athrow
      // baf: aload 0
      // bb0: lload 51
      // bb2: invokevirtual com/zelix/ig.n (J)Z
      // bb5: goto bc3
      // bb8: ldc2_w 2921050669365334311
      // bbb: lload 4
      // bbd: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc2: athrow
      // bc3: iload 87
      // bc5: ifeq c0d
      // bc8: ifeq c10
      // bcb: goto bd9
      // bce: ldc2_w 2921050669365334311
      // bd1: lload 4
      // bd3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bd8: athrow
      // bd9: aload 0
      // bda: lload 41
      // bdc: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // bdf: iload 87
      // be1: ifeq cb1
      // be4: goto bf2
      // be7: ldc2_w 2921050669365334311
      // bea: lload 4
      // bec: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf1: athrow
      // bf2: ldc2_w 2944974585608778199
      // bf5: lload 4
      // bf7: invokedynamic h (JJ)Lcom/zelix/_fz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bfc: invokevirtual com/zelix/_fz.equals (Ljava/lang/Object;)Z
      // bff: goto c0d
      // c02: ldc2_w 2921050669365334311
      // c05: lload 4
      // c07: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0c: athrow
      // c0d: ifne c89
      // c10: aload 15
      // c12: aload 13
      // c14: aload 2
      // c15: aload 0
      // c16: aload 14
      // c18: iload 16
      // c1a: lload 37
      // c1c: aload 18
      // c1e: aload 7
      // c20: aload 0
      // c21: iload 19
      // c23: i2c
      // c24: iload 20
      // c26: i2c
      // c27: iload 21
      // c29: ldc2_w 3840986284812472736
      // c2c: lload 4
      // c2e: invokedynamic i (Ljava/lang/Object;CCIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c33: iload 17
      // c35: bipush 10
      // c37: anewarray 46
      // c3a: dup_x1
      // c3b: swap
      // c3c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c3f: bipush 9
      // c41: swap
      // c42: aastore
      // c43: dup_x1
      // c44: swap
      // c45: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c48: bipush 8
      // c4a: swap
      // c4b: aastore
      // c4c: dup_x1
      // c4d: swap
      // c4e: bipush 7
      // c50: swap
      // c51: aastore
      // c52: dup_x1
      // c53: swap
      // c54: bipush 6
      // c56: swap
      // c57: aastore
      // c58: dup_x2
      // c59: dup_x2
      // c5a: pop
      // c5b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c5e: bipush 5
      // c5f: swap
      // c60: aastore
      // c61: dup_x1
      // c62: swap
      // c63: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // c66: bipush 4
      // c67: swap
      // c68: aastore
      // c69: dup_x1
      // c6a: swap
      // c6b: bipush 3
      // c6c: swap
      // c6d: aastore
      // c6e: dup_x1
      // c6f: swap
      // c70: bipush 2
      // c71: swap
      // c72: aastore
      // c73: dup_x1
      // c74: swap
      // c75: bipush 1
      // c76: swap
      // c77: aastore
      // c78: dup_x1
      // c79: swap
      // c7a: bipush 0
      // c7b: swap
      // c7c: aastore
      // c7d: ldc2_w 3861628182077399835
      // c80: lload 4
      // c82: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_3; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c87: astore 89
      // c89: aload 12
      // c8b: aload 0
      // c8c: aload 89
      // c8e: lload 69
      // c90: bipush 3
      // c91: anewarray 46
      // c94: dup_x2
      // c95: dup_x2
      // c96: pop
      // c97: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c9a: bipush 2
      // c9b: swap
      // c9c: aastore
      // c9d: dup_x1
      // c9e: swap
      // c9f: bipush 1
      // ca0: swap
      // ca1: aastore
      // ca2: dup_x1
      // ca3: swap
      // ca4: bipush 0
      // ca5: swap
      // ca6: aastore
      // ca7: ldc2_w 3277565676234016112
      // caa: lload 4
      // cac: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_fz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb1: astore 92
      // cb3: aload 89
      // cb5: iload 87
      // cb7: ifeq de3
      // cba: ifnull db0
      // cbd: goto ccb
      // cc0: ldc2_w 2921050669365334311
      // cc3: lload 4
      // cc5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cca: athrow
      // ccb: aload 89
      // ccd: invokevirtual com/zelix/_3.Q ()Ljava/lang/String;
      // cd0: lload 4
      // cd2: lconst_0
      // cd3: lcmp
      // cd4: ifle dd3
      // cd7: aload 0
      // cd8: invokevirtual com/zelix/ig.H ()Ljava/lang/String;
      // cdb: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // cde: iload 87
      // ce0: ifeq dc8
      // ce3: goto cf1
      // ce6: ldc2_w 2921050669365334311
      // ce9: lload 4
      // ceb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf0: athrow
      // cf1: lload 4
      // cf3: lconst_0
      // cf4: lcmp
      // cf5: ifle dba
      // cf8: ifne db0
      // cfb: goto d09
      // cfe: ldc2_w 2921050669365334311
      // d01: lload 4
      // d03: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d08: athrow
      // d09: aload 14
      // d0b: iload 17
      // d0d: ifeq d2e
      // d10: goto d1e
      // d13: ldc2_w 2921050669365334311
      // d16: lload 4
      // d18: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d1d: athrow
      // d1e: aload 92
      // d20: goto d35
      // d23: ldc2_w 2921050669365334311
      // d26: lload 4
      // d28: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2d: athrow
      // d2e: aload 92
      // d30: lload 26
      // d32: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // d35: aload 0
      // d36: lload 35
      // d38: dup2_x2
      // d39: pop2
      // d3a: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // d3d: istore 93
      // d3f: aload 18
      // d41: aload 92
      // d43: aload 0
      // d44: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // d49: astore 94
      // d4b: aload 7
      // d4d: aload 92
      // d4f: lload 26
      // d51: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // d54: aload 0
      // d55: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // d5a: pop
      // d5b: aload 0
      // d5c: aload 89
      // d5e: invokevirtual com/zelix/_3.Q ()Ljava/lang/String;
      // d61: lload 24
      // d63: dup2_x1
      // d64: pop2
      // d65: bipush 2
      // d66: anewarray 46
      // d69: dup_x1
      // d6a: swap
      // d6b: bipush 1
      // d6c: swap
      // d6d: aastore
      // d6e: dup_x2
      // d6f: dup_x2
      // d70: pop
      // d71: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d74: bipush 0
      // d75: swap
      // d76: aastore
      // d77: ldc2_w 3670157379353262834
      // d7a: lload 4
      // d7c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d81: aload 0
      // d82: lload 55
      // d84: bipush 1
      // d85: bipush 2
      // d86: anewarray 46
      // d89: dup_x1
      // d8a: swap
      // d8b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // d8e: bipush 1
      // d8f: swap
      // d90: aastore
      // d91: dup_x2
      // d92: dup_x2
      // d93: pop
      // d94: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d97: bipush 0
      // d98: swap
      // d99: aastore
      // d9a: ldc2_w 3152146567636786073
      // d9d: lload 4
      // d9f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // da4: iload 87
      // da6: lload 4
      // da8: lconst_0
      // da9: lcmp
      // daa: ifle dba
      // dad: ifne de4
      // db0: aload 14
      // db2: lload 35
      // db4: aload 92
      // db6: aload 0
      // db7: invokevirtual com/zelix/w.u (JLjava/lang/Object;Ljava/lang/Object;)Z
      // dba: goto dc8
      // dbd: ldc2_w 2921050669365334311
      // dc0: lload 4
      // dc2: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dc7: athrow
      // dc8: pop
      // dc9: aload 18
      // dcb: aload 92
      // dcd: aload 0
      // dce: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // dd3: pop
      // dd4: aload 7
      // dd6: aload 92
      // dd8: lload 26
      // dda: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // ddd: aload 0
      // dde: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // de3: pop
      // de4: return
   }

   public void Zi(Object[] param1) {
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
      // 00a: lstore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/util/List
      // 012: astore 10
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/util/Map
      // 01a: astore 12
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/_y4
      // 022: astore 11
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/lang/Long
      // 02a: astore 8
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast com/zelix/lu
      // 032: astore 3
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/qm
      // 03a: astore 9
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast com/zelix/_8c
      // 043: astore 4
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast java/util/List
      // 04c: astore 13
      // 04e: dup
      // 04f: bipush 9
      // 051: aaload
      // 052: checkcast com/zelix/_fm
      // 055: astore 7
      // 057: dup
      // 058: bipush 10
      // 05a: aaload
      // 05b: checkcast com/zelix/we
      // 05e: astore 2
      // 05f: pop
      // 060: getstatic com/zelix/ig.b J
      // 063: lload 5
      // 065: lxor
      // 066: lstore 5
      // 068: lload 5
      // 06a: dup2
      // 06b: ldc2_w 47559033685402
      // 06e: lxor
      // 06f: lstore 14
      // 071: dup2
      // 072: ldc2_w 7379337637055
      // 075: lxor
      // 076: lstore 16
      // 078: pop2
      // 079: ldc2_w 6596263729638697952
      // 07c: lload 5
      // 07e: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: istore 18
      // 085: aload 0
      // 086: iload 18
      // 088: ifeq 0af
      // 08b: getfield com/zelix/ig.H I
      // 08e: bipush -1
      // 08f: if_icmpeq 12f
      // 092: goto 0a0
      // 095: ldc2_w 6468287315803070573
      // 098: lload 5
      // 09a: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: goto 0af
      // 0a4: ldc2_w 6468287315803070573
      // 0a7: lload 5
      // 0a9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0b2: aload 0
      // 0b3: getfield com/zelix/ig.H I
      // 0b6: aaload
      // 0b7: checkcast com/zelix/h_
      // 0ba: checkcast com/zelix/h_
      // 0bd: aload 10
      // 0bf: aload 0
      // 0c0: lload 14
      // 0c2: invokevirtual com/zelix/ig.V (J)Z
      // 0c5: aload 12
      // 0c7: aload 11
      // 0c9: aload 8
      // 0cb: aload 3
      // 0cc: aload 9
      // 0ce: aload 4
      // 0d0: aload 13
      // 0d2: lload 16
      // 0d4: aload 7
      // 0d6: aload 2
      // 0d7: bipush 12
      // 0d9: anewarray 46
      // 0dc: dup_x1
      // 0dd: swap
      // 0de: bipush 11
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 10
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x2
      // 0e9: dup_x2
      // 0ea: pop
      // 0eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ee: bipush 9
      // 0f0: swap
      // 0f1: aastore
      // 0f2: dup_x1
      // 0f3: swap
      // 0f4: bipush 8
      // 0f6: swap
      // 0f7: aastore
      // 0f8: dup_x1
      // 0f9: swap
      // 0fa: bipush 7
      // 0fc: swap
      // 0fd: aastore
      // 0fe: dup_x1
      // 0ff: swap
      // 100: bipush 6
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: bipush 5
      // 107: swap
      // 108: aastore
      // 109: dup_x1
      // 10a: swap
      // 10b: bipush 4
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 3
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
      // 115: bipush 2
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 11d: bipush 1
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w 4981652764683001583
      // 128: lload 5
      // 12a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: return
   }

   void cc(Object[] param1) {
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
      // 04: checkcast com/zelix/ls
      // 07: astore 7
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/_z9
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/_fm
      // 16: astore 6
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast com/zelix/we
      // 1e: astore 5
      // 20: dup
      // 21: bipush 4
      // 22: aaload
      // 23: checkcast java/lang/Long
      // 26: invokevirtual java/lang/Long.longValue ()J
      // 29: lstore 3
      // 2a: pop
      // 2b: getstatic com/zelix/ig.b J
      // 2e: lload 3
      // 2f: lxor
      // 30: lstore 3
      // 31: lload 3
      // 32: dup2
      // 33: ldc2_w 18154091415646
      // 36: lxor
      // 37: lstore 8
      // 39: pop2
      // 3a: ldc2_w 7267898254537281688
      // 3d: lload 3
      // 3e: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: istore 10
      // 45: aload 0
      // 46: iload 10
      // 48: ifne 6d
      // 4b: getfield com/zelix/ig.H I
      // 4e: bipush -1
      // 4f: if_icmpeq ae
      // 52: goto 5f
      // 55: ldc2_w 8926967220832191052
      // 58: lload 3
      // 59: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: athrow
      // 5f: aload 0
      // 60: goto 6d
      // 63: ldc2_w 8926967220832191052
      // 66: lload 3
      // 67: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6c: athrow
      // 6d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 70: aload 0
      // 71: getfield com/zelix/ig.H I
      // 74: aaload
      // 75: checkcast com/zelix/h_
      // 78: checkcast com/zelix/h_
      // 7b: lload 8
      // 7d: aload 7
      // 7f: aload 2
      // 80: aload 6
      // 82: aload 5
      // 84: bipush 5
      // 85: anewarray 46
      // 88: dup_x1
      // 89: swap
      // 8a: bipush 4
      // 8b: swap
      // 8c: aastore
      // 8d: dup_x1
      // 8e: swap
      // 8f: bipush 3
      // 90: swap
      // 91: aastore
      // 92: dup_x1
      // 93: swap
      // 94: bipush 2
      // 95: swap
      // 96: aastore
      // 97: dup_x1
      // 98: swap
      // 99: bipush 1
      // 9a: swap
      // 9b: aastore
      // 9c: dup_x2
      // 9d: dup_x2
      // 9e: pop
      // 9f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a2: bipush 0
      // a3: swap
      // a4: aastore
      // a5: ldc2_w 7394041692175726391
      // a8: lload 3
      // a9: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: return
   }

   void zG(Object[] param1) {
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
      // 004: checkcast com/zelix/_uw
      // 007: astore 9
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_uh
      // 00f: astore 13
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/a9
      // 017: astore 12
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast com/zelix/an
      // 01f: astore 24
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast com/zelix/_ye
      // 027: astore 22
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast com/zelix/av
      // 02f: astore 2
      // 030: dup
      // 031: bipush 6
      // 033: aaload
      // 034: checkcast java/util/Map
      // 037: astore 16
      // 039: dup
      // 03a: bipush 7
      // 03c: aaload
      // 03d: checkcast com/zelix/_y4
      // 040: astore 17
      // 042: dup
      // 043: bipush 8
      // 045: aaload
      // 046: checkcast com/zelix/yn
      // 049: astore 20
      // 04b: dup
      // 04c: bipush 9
      // 04e: aaload
      // 04f: checkcast java/lang/String
      // 052: astore 4
      // 054: dup
      // 055: bipush 10
      // 057: aaload
      // 058: checkcast java/lang/Boolean
      // 05b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05e: istore 15
      // 060: dup
      // 061: bipush 11
      // 063: aaload
      // 064: checkcast java/lang/Integer
      // 067: invokevirtual java/lang/Integer.intValue ()I
      // 06a: istore 21
      // 06c: dup
      // 06d: bipush 12
      // 06f: aaload
      // 070: checkcast java/util/Map
      // 073: astore 14
      // 075: dup
      // 076: bipush 13
      // 078: aaload
      // 079: checkcast java/util/Map
      // 07c: astore 18
      // 07e: dup
      // 07f: bipush 14
      // 081: aaload
      // 082: checkcast java/util/Map
      // 085: astore 8
      // 087: dup
      // 088: bipush 15
      // 08a: aaload
      // 08b: checkcast com/zelix/_zq
      // 08e: astore 7
      // 090: dup
      // 091: bipush 16
      // 093: aaload
      // 094: checkcast com/zelix/_zq
      // 097: astore 5
      // 099: dup
      // 09a: bipush 17
      // 09c: aaload
      // 09d: checkcast java/util/Set
      // 0a0: astore 3
      // 0a1: dup
      // 0a2: bipush 18
      // 0a4: aaload
      // 0a5: checkcast java/lang/Boolean
      // 0a8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ab: istore 23
      // 0ad: dup
      // 0ae: bipush 19
      // 0b0: aaload
      // 0b1: checkcast java/util/HashMap
      // 0b4: astore 6
      // 0b6: dup
      // 0b7: bipush 20
      // 0b9: aaload
      // 0ba: checkcast java/lang/Long
      // 0bd: invokevirtual java/lang/Long.longValue ()J
      // 0c0: lstore 10
      // 0c2: dup
      // 0c3: bipush 21
      // 0c5: aaload
      // 0c6: checkcast java/util/Map
      // 0c9: astore 19
      // 0cb: pop
      // 0cc: getstatic com/zelix/ig.b J
      // 0cf: lload 10
      // 0d1: lxor
      // 0d2: lstore 10
      // 0d4: lload 10
      // 0d6: dup2
      // 0d7: ldc2_w 114642910659550
      // 0da: lxor
      // 0db: lstore 25
      // 0dd: dup2
      // 0de: ldc2_w 87155839367920
      // 0e1: lxor
      // 0e2: lstore 27
      // 0e4: dup2
      // 0e5: ldc2_w 55842127546241
      // 0e8: lxor
      // 0e9: lstore 29
      // 0eb: dup2
      // 0ec: ldc2_w 2546867925373
      // 0ef: lxor
      // 0f0: lstore 31
      // 0f2: dup2
      // 0f3: ldc2_w 140169004224851
      // 0f6: lxor
      // 0f7: lstore 33
      // 0f9: dup2
      // 0fa: ldc2_w 93015390745885
      // 0fd: lxor
      // 0fe: lstore 35
      // 100: dup2
      // 101: ldc2_w 62522802985463
      // 104: lxor
      // 105: lstore 37
      // 107: dup2
      // 108: ldc2_w 74025165132833
      // 10b: lxor
      // 10c: lstore 39
      // 10e: dup2
      // 10f: ldc2_w 35977741235079
      // 112: lxor
      // 113: lstore 41
      // 115: dup2
      // 116: ldc2_w 41552947642193
      // 119: lxor
      // 11a: lstore 43
      // 11c: dup2
      // 11d: ldc2_w 10904210550001
      // 120: lxor
      // 121: lstore 45
      // 123: dup2
      // 124: ldc2_w 81055098927733
      // 127: lxor
      // 128: lstore 47
      // 12a: dup2
      // 12b: ldc2_w 27199884632475
      // 12e: lxor
      // 12f: lstore 49
      // 131: dup2
      // 132: ldc2_w 121775717900244
      // 135: lxor
      // 136: lstore 51
      // 138: dup2
      // 139: ldc2_w 82722072222013
      // 13c: lxor
      // 13d: lstore 53
      // 13f: dup2
      // 140: ldc2_w 22492450832670
      // 143: lxor
      // 144: lstore 55
      // 146: dup2
      // 147: ldc2_w 9934354314342
      // 14a: lxor
      // 14b: lstore 57
      // 14d: dup2
      // 14e: ldc2_w 28745699081771
      // 151: lxor
      // 152: lstore 59
      // 154: dup2
      // 155: ldc2_w 93255200573642
      // 158: lxor
      // 159: lstore 61
      // 15b: dup2
      // 15c: ldc2_w 97361744614701
      // 15f: lxor
      // 160: lstore 63
      // 162: dup2
      // 163: ldc2_w 108763009608916
      // 166: lxor
      // 167: lstore 65
      // 169: dup2
      // 16a: ldc2_w 98351704521704
      // 16d: lxor
      // 16e: lstore 67
      // 170: dup2
      // 171: ldc2_w 54444959305778
      // 174: lxor
      // 175: lstore 69
      // 177: dup2
      // 178: ldc2_w 23922009932706
      // 17b: lxor
      // 17c: lstore 71
      // 17e: dup2
      // 17f: ldc2_w 96792883812923
      // 182: lxor
      // 183: lstore 73
      // 185: dup2
      // 186: ldc2_w 80366849547118
      // 189: lxor
      // 18a: lstore 75
      // 18c: dup2
      // 18d: ldc2_w 93828508121649
      // 190: lxor
      // 191: lstore 77
      // 193: dup2
      // 194: ldc2_w 88318987784730
      // 197: lxor
      // 198: dup2
      // 199: bipush 32
      // 19b: lushr
      // 19c: l2i
      // 19d: istore 79
      // 19f: dup2
      // 1a0: bipush 32
      // 1a2: lshl
      // 1a3: bipush 48
      // 1a5: lushr
      // 1a6: l2i
      // 1a7: istore 80
      // 1a9: dup2
      // 1aa: bipush 48
      // 1ac: lshl
      // 1ad: bipush 48
      // 1af: lushr
      // 1b0: l2i
      // 1b1: istore 81
      // 1b3: pop2
      // 1b4: dup2
      // 1b5: ldc2_w 114642910659550
      // 1b8: lxor
      // 1b9: lstore 82
      // 1bb: dup2
      // 1bc: ldc2_w 83621797418765
      // 1bf: lxor
      // 1c0: lstore 84
      // 1c2: dup2
      // 1c3: ldc2_w 100806610632985
      // 1c6: lxor
      // 1c7: lstore 86
      // 1c9: dup2
      // 1ca: ldc2_w 113389604912610
      // 1cd: lxor
      // 1ce: dup2
      // 1cf: bipush 48
      // 1d1: lushr
      // 1d2: l2i
      // 1d3: istore 88
      // 1d5: dup2
      // 1d6: bipush 16
      // 1d8: lshl
      // 1d9: bipush 32
      // 1db: lushr
      // 1dc: l2i
      // 1dd: istore 89
      // 1df: dup2
      // 1e0: bipush 48
      // 1e2: lshl
      // 1e3: bipush 48
      // 1e5: lushr
      // 1e6: l2i
      // 1e7: istore 90
      // 1e9: pop2
      // 1ea: dup2
      // 1eb: ldc2_w 82705632143983
      // 1ee: lxor
      // 1ef: lstore 91
      // 1f1: dup2
      // 1f2: ldc2_w 110116919132462
      // 1f5: lxor
      // 1f6: lstore 93
      // 1f8: dup2
      // 1f9: ldc2_w 11719185776723
      // 1fc: lxor
      // 1fd: lstore 95
      // 1ff: dup2
      // 200: ldc2_w 124655930462417
      // 203: lxor
      // 204: lstore 97
      // 206: dup2
      // 207: ldc2_w 130995780282581
      // 20a: lxor
      // 20b: lstore 99
      // 20d: dup2
      // 20e: ldc2_w 39786812979781
      // 211: lxor
      // 212: lstore 101
      // 214: pop2
      // 215: ldc2_w -4555971442347215743
      // 218: lload 10
      // 21a: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21f: istore 103
      // 221: aload 0
      // 222: lload 97
      // 224: invokevirtual com/zelix/ig.Q (J)Z
      // 227: iload 103
      // 229: ifne 251
      // 22c: ifne 254
      // 22f: goto 23d
      // 232: ldc2_w -2307030980420704683
      // 235: lload 10
      // 237: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: aload 0
      // 23e: lload 71
      // 240: invokevirtual com/zelix/ig.V (J)Z
      // 243: goto 251
      // 246: ldc2_w -2307030980420704683
      // 249: lload 10
      // 24b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: athrow
      // 251: ifeq 255
      // 254: return
      // 255: aconst_null
      // 256: astore 104
      // 258: aload 20
      // 25a: iload 88
      // 25c: i2s
      // 25d: iload 89
      // 25f: iload 90
      // 261: i2s
      // 262: invokevirtual com/zelix/yn.v (SIS)Lcom/zelix/hy;
      // 265: astore 105
      // 267: aload 0
      // 268: lload 45
      // 26a: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // 26d: astore 106
      // 26f: aload 9
      // 271: lload 55
      // 273: aload 0
      // 274: bipush 2
      // 275: anewarray 46
      // 278: dup_x1
      // 279: swap
      // 27a: bipush 1
      // 27b: swap
      // 27c: aastore
      // 27d: dup_x2
      // 27e: dup_x2
      // 27f: pop
      // 280: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 283: bipush 0
      // 284: swap
      // 285: aastore
      // 286: ldc2_w -2646281678535330880
      // 289: lload 10
      // 28b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 290: ifne d95
      // 293: aload 22
      // 295: aload 0
      // 296: bipush 1
      // 297: anewarray 46
      // 29a: dup_x1
      // 29b: swap
      // 29c: bipush 0
      // 29d: swap
      // 29e: aastore
      // 29f: ldc2_w -4305688673798866520
      // 2a2: lload 10
      // 2a4: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iu; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: astore 108
      // 2ab: aload 108
      // 2ad: iload 103
      // 2af: ifne 2c5
      // 2b2: ifnull 2d8
      // 2b5: goto 2c3
      // 2b8: ldc2_w -2307030980420704683
      // 2bb: lload 10
      // 2bd: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: athrow
      // 2c3: aload 108
      // 2c5: lload 25
      // 2c7: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 2ca: astore 107
      // 2cc: iload 103
      // 2ce: lload 10
      // 2d0: lconst_0
      // 2d1: lcmp
      // 2d2: ifle 2dd
      // 2d5: ifeq 2dc
      // 2d8: aload 4
      // 2da: astore 107
      // 2dc: bipush 0
      // 2dd: istore 109
      // 2df: aload 12
      // 2e1: lload 10
      // 2e3: lconst_0
      // 2e4: lcmp
      // 2e5: iflt 300
      // 2e8: iload 103
      // 2ea: ifne 300
      // 2ed: ifnull 7f6
      // 2f0: goto 2fe
      // 2f3: ldc2_w -2307030980420704683
      // 2f6: lload 10
      // 2f8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fd: athrow
      // 2fe: aload 12
      // 300: lload 69
      // 302: aload 107
      // 304: aload 106
      // 306: bipush 3
      // 307: anewarray 46
      // 30a: dup_x1
      // 30b: swap
      // 30c: bipush 2
      // 30d: swap
      // 30e: aastore
      // 30f: dup_x1
      // 310: swap
      // 311: bipush 1
      // 312: swap
      // 313: aastore
      // 314: dup_x2
      // 315: dup_x2
      // 316: pop
      // 317: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31a: bipush 0
      // 31b: swap
      // 31c: aastore
      // 31d: ldc2_w -4318733039037387176
      // 320: lload 10
      // 322: lload 10
      // 324: lconst_0
      // 325: lcmp
      // 326: iflt 36b
      // 329: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32e: iload 103
      // 330: ifne 345
      // 333: ifeq 7f6
      // 336: goto 344
      // 339: ldc2_w -2307030980420704683
      // 33c: lload 10
      // 33e: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: athrow
      // 344: bipush 1
      // 345: istore 109
      // 347: aload 12
      // 349: aload 107
      // 34b: aload 106
      // 34d: lload 53
      // 34f: bipush 3
      // 350: anewarray 46
      // 353: dup_x2
      // 354: dup_x2
      // 355: pop
      // 356: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 359: bipush 2
      // 35a: swap
      // 35b: aastore
      // 35c: dup_x1
      // 35d: swap
      // 35e: bipush 1
      // 35f: swap
      // 360: aastore
      // 361: dup_x1
      // 362: swap
      // 363: bipush 0
      // 364: swap
      // 365: aastore
      // 366: ldc2_w -2376697410717147453
      // 369: lload 10
      // 36b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: astore 104
      // 372: lload 10
      // 374: lconst_0
      // 375: lcmp
      // 376: iflt 37e
      // 379: aload 104
      // 37b: ifnull 7f6
      // 37e: aload 12
      // 380: aload 108
      // 382: iload 103
      // 384: lload 10
      // 386: lconst_0
      // 387: lcmp
      // 388: iflt 3b1
      // 38b: ifne 3af
      // 38e: goto 39c
      // 391: ldc2_w -2307030980420704683
      // 394: lload 10
      // 396: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39b: athrow
      // 39c: ifnull 3de
      // 39f: goto 3ad
      // 3a2: ldc2_w -2307030980420704683
      // 3a5: lload 10
      // 3a7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: athrow
      // 3ad: aload 108
      // 3af: iload 103
      // 3b1: ifne 3d8
      // 3b4: invokevirtual com/zelix/iu.k ()Z
      // 3b7: ifeq 3de
      // 3ba: goto 3c8
      // 3bd: ldc2_w -2307030980420704683
      // 3c0: lload 10
      // 3c2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c7: athrow
      // 3c8: aload 108
      // 3ca: goto 3d8
      // 3cd: ldc2_w -2307030980420704683
      // 3d0: lload 10
      // 3d2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d7: athrow
      // 3d8: checkcast com/zelix/ig
      // 3db: goto 3df
      // 3de: aload 0
      // 3df: lload 57
      // 3e1: dup2_x1
      // 3e2: pop2
      // 3e3: bipush 2
      // 3e4: anewarray 46
      // 3e7: dup_x1
      // 3e8: swap
      // 3e9: bipush 1
      // 3ea: swap
      // 3eb: aastore
      // 3ec: dup_x2
      // 3ed: dup_x2
      // 3ee: pop
      // 3ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f2: bipush 0
      // 3f3: swap
      // 3f4: aastore
      // 3f5: ldc2_w -4091003401382482023
      // 3f8: lload 10
      // 3fa: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ff: iload 103
      // 401: ifne 531
      // 404: ifeq 52f
      // 407: goto 415
      // 40a: ldc2_w -2307030980420704683
      // 40d: lload 10
      // 40f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 414: athrow
      // 415: aload 2
      // 416: lload 41
      // 418: aload 0
      // 419: bipush 2
      // 41a: anewarray 46
      // 41d: dup_x1
      // 41e: swap
      // 41f: bipush 1
      // 420: swap
      // 421: aastore
      // 422: dup_x2
      // 423: dup_x2
      // 424: pop
      // 425: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 428: bipush 0
      // 429: swap
      // 42a: aastore
      // 42b: ldc2_w -2311239728722149873
      // 42e: lload 10
      // 430: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 435: ifeq 47c
      // 438: goto 446
      // 43b: ldc2_w -2307030980420704683
      // 43e: lload 10
      // 440: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 445: athrow
      // 446: aload 0
      // 447: lload 77
      // 449: bipush 1
      // 44a: bipush 2
      // 44b: anewarray 46
      // 44e: dup_x1
      // 44f: swap
      // 450: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 453: bipush 1
      // 454: swap
      // 455: aastore
      // 456: dup_x2
      // 457: dup_x2
      // 458: pop
      // 459: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 45c: bipush 0
      // 45d: swap
      // 45e: aastore
      // 45f: ldc2_w -4511564255399270906
      // 462: lload 10
      // 464: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 469: iload 103
      // 46b: ifeq 52f
      // 46e: goto 47c
      // 471: ldc2_w -2307030980420704683
      // 474: lload 10
      // 476: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47b: athrow
      // 47c: lload 63
      // 47e: aload 105
      // 480: aload 9
      // 482: bipush 3
      // 483: anewarray 46
      // 486: dup_x1
      // 487: swap
      // 488: bipush 2
      // 489: swap
      // 48a: aastore
      // 48b: dup_x1
      // 48c: swap
      // 48d: bipush 1
      // 48e: swap
      // 48f: aastore
      // 490: dup_x2
      // 491: dup_x2
      // 492: pop
      // 493: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 496: bipush 0
      // 497: swap
      // 498: aastore
      // 499: ldc2_w -2567271127737719572
      // 49c: lload 10
      // 49e: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a3: astore 110
      // 4a5: aload 12
      // 4a7: new java/lang/StringBuilder
      // 4aa: dup
      // 4ab: invokespecial java/lang/StringBuilder.<init> ()V
      // 4ae: sipush 18282
      // 4b1: ldc2_w 7213765960762066037
      // 4b4: lload 10
      // 4b6: lxor
      // 4b7: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bf: aload 0
      // 4c0: lload 65
      // 4c2: bipush 0
      // 4c3: bipush 2
      // 4c4: anewarray 46
      // 4c7: dup_x1
      // 4c8: swap
      // 4c9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4cc: bipush 1
      // 4cd: swap
      // 4ce: aastore
      // 4cf: dup_x2
      // 4d0: dup_x2
      // 4d1: pop
      // 4d2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d5: bipush 0
      // 4d6: swap
      // 4d7: aastore
      // 4d8: ldc2_w -4237460533728726492
      // 4db: lload 10
      // 4dd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4e5: sipush 282
      // 4e8: ldc2_w 8944739747911320116
      // 4eb: lload 10
      // 4ed: lxor
      // 4ee: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f6: aload 110
      // 4f8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4fb: sipush 7621
      // 4fe: ldc2_w 4959657701283159789
      // 501: lload 10
      // 503: lxor
      // 504: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 509: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 50c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 50f: lload 33
      // 511: dup2_x1
      // 512: pop2
      // 513: bipush 2
      // 514: anewarray 46
      // 517: dup_x1
      // 518: swap
      // 519: bipush 1
      // 51a: swap
      // 51b: aastore
      // 51c: dup_x2
      // 51d: dup_x2
      // 51e: pop
      // 51f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 522: bipush 0
      // 523: swap
      // 524: aastore
      // 525: ldc2_w -4255584306700817256
      // 528: lload 10
      // 52a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52f: iload 23
      // 531: ifeq 55d
      // 534: new com/zelix/_fz
      // 537: dup
      // 538: aload 104
      // 53a: aload 0
      // 53b: invokevirtual com/zelix/ig.H ()Ljava/lang/String;
      // 53e: invokespecial com/zelix/_fz.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 541: astore 111
      // 543: aload 16
      // 545: aload 111
      // 547: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 54c: checkcast com/zelix/iu
      // 54f: astore 110
      // 551: lload 10
      // 553: lconst_0
      // 554: lcmp
      // 555: iflt 584
      // 558: iload 103
      // 55a: ifeq 584
      // 55d: new com/zelix/_fr
      // 560: dup
      // 561: aload 104
      // 563: aload 0
      // 564: invokevirtual com/zelix/ig.H ()Ljava/lang/String;
      // 567: iload 79
      // 569: swap
      // 56a: iload 80
      // 56c: i2c
      // 56d: swap
      // 56e: iload 81
      // 570: swap
      // 571: invokespecial com/zelix/_fr.<init> (Ljava/lang/String;ICILjava/lang/String;)V
      // 574: astore 111
      // 576: aload 18
      // 578: aload 111
      // 57a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 57f: checkcast com/zelix/iu
      // 582: astore 110
      // 584: aload 110
      // 586: ifnull 7f6
      // 589: aload 106
      // 58b: aload 110
      // 58d: lload 45
      // 58f: invokevirtual com/zelix/iu.G (J)Lcom/zelix/_fz;
      // 592: invokevirtual com/zelix/_fz.equals (Ljava/lang/Object;)Z
      // 595: iload 103
      // 597: lload 10
      // 599: lconst_0
      // 59a: lcmp
      // 59b: iflt 7fa
      // 59e: ifne 7f8
      // 5a1: goto 5af
      // 5a4: ldc2_w -2307030980420704683
      // 5a7: lload 10
      // 5a9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ae: athrow
      // 5af: ifeq 7f6
      // 5b2: goto 5c0
      // 5b5: ldc2_w -2307030980420704683
      // 5b8: lload 10
      // 5ba: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5bf: athrow
      // 5c0: aload 105
      // 5c2: aload 110
      // 5c4: lload 47
      // 5c6: bipush 2
      // 5c7: anewarray 46
      // 5ca: dup_x2
      // 5cb: dup_x2
      // 5cc: pop
      // 5cd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5d0: bipush 1
      // 5d1: swap
      // 5d2: aastore
      // 5d3: dup_x1
      // 5d4: swap
      // 5d5: bipush 0
      // 5d6: swap
      // 5d7: aastore
      // 5d8: ldc2_w -2651030234946663388
      // 5db: lload 10
      // 5dd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e2: astore 112
      // 5e4: iload 103
      // 5e6: ifne 5ff
      // 5e9: aload 112
      // 5eb: ifnull 7f6
      // 5ee: goto 5fc
      // 5f1: ldc2_w -2307030980420704683
      // 5f4: lload 10
      // 5f6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5fb: athrow
      // 5fc: bipush 0
      // 5fd: istore 109
      // 5ff: aload 24
      // 601: aload 110
      // 603: lload 25
      // 605: invokevirtual com/zelix/iu.k (J)Ljava/lang/String;
      // 608: lload 37
      // 60a: dup2_x1
      // 60b: pop2
      // 60c: aload 111
      // 60e: bipush 3
      // 60f: anewarray 46
      // 612: dup_x1
      // 613: swap
      // 614: bipush 2
      // 615: swap
      // 616: aastore
      // 617: dup_x1
      // 618: swap
      // 619: bipush 1
      // 61a: swap
      // 61b: aastore
      // 61c: dup_x2
      // 61d: dup_x2
      // 61e: pop
      // 61f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 622: bipush 0
      // 623: swap
      // 624: aastore
      // 625: ldc2_w -4555149843695504560
      // 628: lload 10
      // 62a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62f: astore 113
      // 631: lload 63
      // 633: aload 105
      // 635: aload 9
      // 637: bipush 3
      // 638: anewarray 46
      // 63b: dup_x1
      // 63c: swap
      // 63d: bipush 2
      // 63e: swap
      // 63f: aastore
      // 640: dup_x1
      // 641: swap
      // 642: bipush 1
      // 643: swap
      // 644: aastore
      // 645: dup_x2
      // 646: dup_x2
      // 647: pop
      // 648: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 64b: bipush 0
      // 64c: swap
      // 64d: aastore
      // 64e: ldc2_w -2567271127737719572
      // 651: lload 10
      // 653: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 658: astore 114
      // 65a: lload 63
      // 65c: aload 112
      // 65e: aload 9
      // 660: bipush 3
      // 661: anewarray 46
      // 664: dup_x1
      // 665: swap
      // 666: bipush 2
      // 667: swap
      // 668: aastore
      // 669: dup_x1
      // 66a: swap
      // 66b: bipush 1
      // 66c: swap
      // 66d: aastore
      // 66e: dup_x2
      // 66f: dup_x2
      // 670: pop
      // 671: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 674: bipush 0
      // 675: swap
      // 676: aastore
      // 677: ldc2_w -2567271127737719572
      // 67a: lload 10
      // 67c: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 681: astore 115
      // 683: aload 110
      // 685: lload 39
      // 687: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 68a: lload 63
      // 68c: dup2_x1
      // 68d: pop2
      // 68e: aload 9
      // 690: bipush 3
      // 691: anewarray 46
      // 694: dup_x1
      // 695: swap
      // 696: bipush 2
      // 697: swap
      // 698: aastore
      // 699: dup_x1
      // 69a: swap
      // 69b: bipush 1
      // 69c: swap
      // 69d: aastore
      // 69e: dup_x2
      // 69f: dup_x2
      // 6a0: pop
      // 6a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a4: bipush 0
      // 6a5: swap
      // 6a6: aastore
      // 6a7: ldc2_w -2567271127737719572
      // 6aa: lload 10
      // 6ac: invokedynamic s (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b1: astore 116
      // 6b3: aload 108
      // 6b5: iload 103
      // 6b7: ifne 6cd
      // 6ba: ifnull 6e5
      // 6bd: goto 6cb
      // 6c0: ldc2_w -2307030980420704683
      // 6c3: lload 10
      // 6c5: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6ca: athrow
      // 6cb: aload 108
      // 6cd: lload 39
      // 6cf: invokevirtual com/zelix/iu.d (J)Lcom/zelix/hz;
      // 6d2: lload 82
      // 6d4: invokevirtual com/zelix/hz.k (J)Ljava/lang/String;
      // 6d7: astore 117
      // 6d9: lload 10
      // 6db: lconst_0
      // 6dc: lcmp
      // 6dd: ifle 716
      // 6e0: iload 103
      // 6e2: ifeq 6ed
      // 6e5: aload 0
      // 6e6: lload 25
      // 6e8: invokevirtual com/zelix/ig.k (J)Ljava/lang/String;
      // 6eb: astore 117
      // 6ed: aload 12
      // 6ef: aload 117
      // 6f1: aload 106
      // 6f3: lload 93
      // 6f5: bipush 3
      // 6f6: anewarray 46
      // 6f9: dup_x2
      // 6fa: dup_x2
      // 6fb: pop
      // 6fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6ff: bipush 2
      // 700: swap
      // 701: aastore
      // 702: dup_x1
      // 703: swap
      // 704: bipush 1
      // 705: swap
      // 706: aastore
      // 707: dup_x1
      // 708: swap
      // 709: bipush 0
      // 70a: swap
      // 70b: aastore
      // 70c: ldc2_w -2418320117172533765
      // 70f: lload 10
      // 711: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 716: aload 12
      // 718: new java/lang/StringBuilder
      // 71b: dup
      // 71c: invokespecial java/lang/StringBuilder.<init> ()V
      // 71f: sipush 26037
      // 722: ldc2_w 616147700577871512
      // 725: lload 10
      // 727: lxor
      // 728: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 730: aload 0
      // 731: lload 65
      // 733: bipush 0
      // 734: bipush 2
      // 735: anewarray 46
      // 738: dup_x1
      // 739: swap
      // 73a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 73d: bipush 1
      // 73e: swap
      // 73f: aastore
      // 740: dup_x2
      // 741: dup_x2
      // 742: pop
      // 743: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 746: bipush 0
      // 747: swap
      // 748: aastore
      // 749: ldc2_w -4237460533728726492
      // 74c: lload 10
      // 74e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 753: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 756: sipush 282
      // 759: ldc2_w 8944739747911320116
      // 75c: lload 10
      // 75e: lxor
      // 75f: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 764: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 767: aload 114
      // 769: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 76c: sipush 1662
      // 76f: ldc2_w 9063780831886656874
      // 772: lload 10
      // 774: lxor
      // 775: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 77d: aload 104
      // 77f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 782: sipush 22249
      // 785: ldc2_w 3178046428314867193
      // 788: lload 10
      // 78a: lxor
      // 78b: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 790: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 793: aload 116
      // 795: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 798: ldc "."
      // 79a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 79d: aload 113
      // 79f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7a2: sipush 26327
      // 7a5: ldc2_w 355801707722384868
      // 7a8: lload 10
      // 7aa: lxor
      // 7ab: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b3: aload 115
      // 7b5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7b8: ldc "."
      // 7ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7bd: aload 104
      // 7bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7c2: sipush 23817
      // 7c5: ldc2_w 7810060170867187252
      // 7c8: lload 10
      // 7ca: lxor
      // 7cb: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7d3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7d6: lload 33
      // 7d8: dup2_x1
      // 7d9: pop2
      // 7da: bipush 2
      // 7db: anewarray 46
      // 7de: dup_x1
      // 7df: swap
      // 7e0: bipush 1
      // 7e1: swap
      // 7e2: aastore
      // 7e3: dup_x2
      // 7e4: dup_x2
      // 7e5: pop
      // 7e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7e9: bipush 0
      // 7ea: swap
      // 7eb: aastore
      // 7ec: ldc2_w -4255584306700817256
      // 7ef: lload 10
      // 7f1: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7f6: iload 109
      // 7f8: iload 103
      // 7fa: lload 10
      // 7fc: lconst_0
      // 7fd: lcmp
      // 7fe: iflt 83f
      // 801: ifne 83d
      // 804: ifne d95
      // 807: goto 815
      // 80a: ldc2_w -2307030980420704683
      // 80d: lload 10
      // 80f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 814: athrow
      // 815: aload 0
      // 816: lload 91
      // 818: bipush 1
      // 819: anewarray 46
      // 81c: dup_x2
      // 81d: dup_x2
      // 81e: pop
      // 81f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 822: bipush 0
      // 823: swap
      // 824: aastore
      // 825: ldc2_w -2829123195161721273
      // 828: lload 10
      // 82a: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82f: goto 83d
      // 832: ldc2_w -2307030980420704683
      // 835: lload 10
      // 837: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83c: athrow
      // 83d: iload 103
      // 83f: ifne a8b
      // 842: ifeq a5d
      // 845: goto 853
      // 848: ldc2_w -2307030980420704683
      // 84b: lload 10
      // 84d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 852: athrow
      // 853: iload 21
      // 855: iload 103
      // 857: lload 10
      // 859: lconst_0
      // 85a: lcmp
      // 85b: ifle 958
      // 85e: ifne 956
      // 861: goto 86f
      // 864: ldc2_w -2307030980420704683
      // 867: lload 10
      // 869: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86e: athrow
      // 86f: lload 10
      // 871: lconst_0
      // 872: lcmp
      // 873: ifle 948
      // 876: ifeq 933
      // 879: goto 887
      // 87c: ldc2_w -2307030980420704683
      // 87f: lload 10
      // 881: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 886: athrow
      // 887: iload 21
      // 889: iload 103
      // 88b: ifne a8b
      // 88e: goto 89c
      // 891: ldc2_w -2307030980420704683
      // 894: lload 10
      // 896: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 89b: athrow
      // 89c: lload 10
      // 89e: lconst_0
      // 89f: lcmp
      // 8a0: ifle a7d
      // 8a3: bipush 2
      // 8a4: if_icmpne a5d
      // 8a7: goto 8b5
      // 8aa: ldc2_w -2307030980420704683
      // 8ad: lload 10
      // 8af: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b4: athrow
      // 8b5: aload 105
      // 8b7: lload 95
      // 8b9: ldc2_w -4209860852722046275
      // 8bc: lload 10
      // 8be: invokedynamic k (Ljava/lang/Object;JJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c3: iload 103
      // 8c5: ifne a8b
      // 8c8: goto 8d6
      // 8cb: ldc2_w -2307030980420704683
      // 8ce: lload 10
      // 8d0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d5: athrow
      // 8d6: lload 10
      // 8d8: lconst_0
      // 8d9: lcmp
      // 8da: ifle a7d
      // 8dd: ifne a5d
      // 8e0: goto 8ee
      // 8e3: ldc2_w -2307030980420704683
      // 8e6: lload 10
      // 8e8: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8ed: athrow
      // 8ee: aload 0
      // 8ef: lload 84
      // 8f1: bipush 1
      // 8f2: anewarray 46
      // 8f5: dup_x2
      // 8f6: dup_x2
      // 8f7: pop
      // 8f8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8fb: bipush 0
      // 8fc: swap
      // 8fd: aastore
      // 8fe: ldc2_w -4335134145579269001
      // 901: lload 10
      // 903: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 908: iload 103
      // 90a: ifne a8b
      // 90d: goto 91b
      // 910: ldc2_w -2307030980420704683
      // 913: lload 10
      // 915: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91a: athrow
      // 91b: lload 10
      // 91d: lconst_0
      // 91e: lcmp
      // 91f: iflt a7d
      // 922: ifne a5d
      // 925: goto 933
      // 928: ldc2_w -2307030980420704683
      // 92b: lload 10
      // 92d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 932: athrow
      // 933: aload 0
      // 934: getfield com/zelix/ig.k Ljava/lang/String;
      // 937: sipush 6206
      // 93a: ldc2_w 8884341967956597539
      // 93d: lload 10
      // 93f: lxor
      // 940: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 945: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 948: goto 956
      // 94b: ldc2_w -2307030980420704683
      // 94e: lload 10
      // 950: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 955: athrow
      // 956: iload 103
      // 958: ifne a8b
      // 95b: ifeq a5d
      // 95e: goto 96c
      // 961: ldc2_w -2307030980420704683
      // 964: lload 10
      // 966: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96b: athrow
      // 96c: aload 0
      // 96d: getfield com/zelix/ig.k Ljava/lang/String;
      // 970: sipush 30940
      // 973: ldc2_w 4463337177652345831
      // 976: lload 10
      // 978: lxor
      // 979: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97e: invokevirtual java/lang/String.length ()I
      // 981: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 984: bipush 1
      // 985: anewarray 46
      // 988: dup_x1
      // 989: swap
      // 98a: bipush 0
      // 98b: swap
      // 98c: aastore
      // 98d: ldc2_w -2406220761258270331
      // 990: lload 10
      // 992: invokedynamic s (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 997: iload 103
      // 999: ifne a8b
      // 99c: goto 9aa
      // 99f: ldc2_w -2307030980420704683
      // 9a2: lload 10
      // 9a4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9a9: athrow
      // 9aa: lload 10
      // 9ac: lconst_0
      // 9ad: lcmp
      // 9ae: iflt a7d
      // 9b1: ifeq a5d
      // 9b4: goto 9c2
      // 9b7: ldc2_w -2307030980420704683
      // 9ba: lload 10
      // 9bc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c1: athrow
      // 9c2: aload 14
      // 9c4: aload 0
      // 9c5: lload 45
      // 9c7: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // 9ca: aload 0
      // 9cb: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 9d0: pop
      // 9d1: aload 8
      // 9d3: aload 0
      // 9d4: lload 86
      // 9d6: invokevirtual com/zelix/ig.s (J)Lcom/zelix/_fr;
      // 9d9: aload 0
      // 9da: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 9df: pop
      // 9e0: iload 103
      // 9e2: lload 10
      // 9e4: lconst_0
      // 9e5: lcmp
      // 9e6: ifle a53
      // 9e9: ifne a51
      // 9ec: goto 9fa
      // 9ef: ldc2_w -2307030980420704683
      // 9f2: lload 10
      // 9f4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f9: athrow
      // 9fa: iload 15
      // 9fc: ifeq a36
      // 9ff: goto a0d
      // a02: ldc2_w -2307030980420704683
      // a05: lload 10
      // a07: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0c: athrow
      // a0d: aload 7
      // a0f: aload 0
      // a10: lload 49
      // a12: ldc2_w -4086483703877699466
      // a15: lload 10
      // a17: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1c: aload 0
      // a1d: ldc2_w -2530061507492291441
      // a20: lload 10
      // a22: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a27: pop
      // a28: goto a36
      // a2b: ldc2_w -2307030980420704683
      // a2e: lload 10
      // a30: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a35: athrow
      // a36: aload 5
      // a38: aload 0
      // a39: lload 49
      // a3b: ldc2_w -4086483703877699466
      // a3e: lload 10
      // a40: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a45: aload 0
      // a46: ldc2_w -2530061507492291441
      // a49: lload 10
      // a4b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a50: pop
      // a51: iload 103
      // a53: lload 10
      // a55: lconst_0
      // a56: lcmp
      // a57: iflt a7d
      // a5a: ifeq d95
      // a5d: aload 2
      // a5e: lload 41
      // a60: aload 0
      // a61: bipush 2
      // a62: anewarray 46
      // a65: dup_x1
      // a66: swap
      // a67: bipush 1
      // a68: swap
      // a69: aastore
      // a6a: dup_x2
      // a6b: dup_x2
      // a6c: pop
      // a6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a70: bipush 0
      // a71: swap
      // a72: aastore
      // a73: ldc2_w -2311239728722149873
      // a76: lload 10
      // a78: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7d: goto a8b
      // a80: ldc2_w -2307030980420704683
      // a83: lload 10
      // a85: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8a: athrow
      // a8b: istore 110
      // a8d: aload 0
      // a8e: lload 61
      // a90: invokevirtual com/zelix/ig.n (J)Z
      // a93: iload 103
      // a95: lload 10
      // a97: lconst_0
      // a98: lcmp
      // a99: iflt c3f
      // a9c: ifne c3d
      // a9f: ifne c27
      // aa2: goto ab0
      // aa5: ldc2_w -2307030980420704683
      // aa8: lload 10
      // aaa: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aaf: athrow
      // ab0: aload 0
      // ab1: lload 31
      // ab3: bipush 1
      // ab4: anewarray 46
      // ab7: dup_x2
      // ab8: dup_x2
      // ab9: pop
      // aba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // abd: bipush 0
      // abe: swap
      // abf: aastore
      // ac0: ldc2_w -2591464224998824714
      // ac3: lload 10
      // ac5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aca: iload 103
      // acc: ifne b09
      // acf: goto add
      // ad2: ldc2_w -2307030980420704683
      // ad5: lload 10
      // ad7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // adc: athrow
      // add: lload 10
      // adf: lconst_0
      // ae0: lcmp
      // ae1: iflt b95
      // ae4: ifne b0c
      // ae7: goto af5
      // aea: ldc2_w -2307030980420704683
      // aed: lload 10
      // aef: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af4: athrow
      // af5: aload 0
      // af6: lload 99
      // af8: invokevirtual com/zelix/ig.C (J)Z
      // afb: goto b09
      // afe: ldc2_w -2307030980420704683
      // b01: lload 10
      // b03: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b08: athrow
      // b09: ifne b9f
      // b0c: aload 2
      // b0d: aload 20
      // b0f: aload 4
      // b11: aload 0
      // b12: aload 16
      // b14: iload 15
      // b16: aload 14
      // b18: aload 18
      // b1a: aload 8
      // b1c: aload 7
      // b1e: lload 35
      // b20: aload 5
      // b22: aload 3
      // b23: iload 23
      // b25: iload 110
      // b27: bipush 14
      // b29: anewarray 46
      // b2c: dup_x1
      // b2d: swap
      // b2e: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // b31: bipush 13
      // b33: swap
      // b34: aastore
      // b35: dup_x1
      // b36: swap
      // b37: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // b3a: bipush 12
      // b3c: swap
      // b3d: aastore
      // b3e: dup_x1
      // b3f: swap
      // b40: bipush 11
      // b42: swap
      // b43: aastore
      // b44: dup_x1
      // b45: swap
      // b46: bipush 10
      // b48: swap
      // b49: aastore
      // b4a: dup_x2
      // b4b: dup_x2
      // b4c: pop
      // b4d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b50: bipush 9
      // b52: swap
      // b53: aastore
      // b54: dup_x1
      // b55: swap
      // b56: bipush 8
      // b58: swap
      // b59: aastore
      // b5a: dup_x1
      // b5b: swap
      // b5c: bipush 7
      // b5e: swap
      // b5f: aastore
      // b60: dup_x1
      // b61: swap
      // b62: bipush 6
      // b64: swap
      // b65: aastore
      // b66: dup_x1
      // b67: swap
      // b68: bipush 5
      // b69: swap
      // b6a: aastore
      // b6b: dup_x1
      // b6c: swap
      // b6d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // b70: bipush 4
      // b71: swap
      // b72: aastore
      // b73: dup_x1
      // b74: swap
      // b75: bipush 3
      // b76: swap
      // b77: aastore
      // b78: dup_x1
      // b79: swap
      // b7a: bipush 2
      // b7b: swap
      // b7c: aastore
      // b7d: dup_x1
      // b7e: swap
      // b7f: bipush 1
      // b80: swap
      // b81: aastore
      // b82: dup_x1
      // b83: swap
      // b84: bipush 0
      // b85: swap
      // b86: aastore
      // b87: ldc2_w -4531805754778676254
      // b8a: lload 10
      // b8c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b91: astore 104
      // b93: iload 103
      // b95: lload 10
      // b97: lconst_0
      // b98: lcmp
      // b99: ifle c1d
      // b9c: ifeq d95
      // b9f: aload 2
      // ba0: aload 20
      // ba2: aload 4
      // ba4: aload 0
      // ba5: lload 67
      // ba7: aload 16
      // ba9: aload 14
      // bab: aload 18
      // bad: aload 8
      // baf: aload 7
      // bb1: aload 5
      // bb3: aload 3
      // bb4: iload 23
      // bb6: iload 110
      // bb8: bipush 13
      // bba: anewarray 46
      // bbd: dup_x1
      // bbe: swap
      // bbf: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // bc2: bipush 12
      // bc4: swap
      // bc5: aastore
      // bc6: dup_x1
      // bc7: swap
      // bc8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // bcb: bipush 11
      // bcd: swap
      // bce: aastore
      // bcf: dup_x1
      // bd0: swap
      // bd1: bipush 10
      // bd3: swap
      // bd4: aastore
      // bd5: dup_x1
      // bd6: swap
      // bd7: bipush 9
      // bd9: swap
      // bda: aastore
      // bdb: dup_x1
      // bdc: swap
      // bdd: bipush 8
      // bdf: swap
      // be0: aastore
      // be1: dup_x1
      // be2: swap
      // be3: bipush 7
      // be5: swap
      // be6: aastore
      // be7: dup_x1
      // be8: swap
      // be9: bipush 6
      // beb: swap
      // bec: aastore
      // bed: dup_x1
      // bee: swap
      // bef: bipush 5
      // bf0: swap
      // bf1: aastore
      // bf2: dup_x1
      // bf3: swap
      // bf4: bipush 4
      // bf5: swap
      // bf6: aastore
      // bf7: dup_x2
      // bf8: dup_x2
      // bf9: pop
      // bfa: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bfd: bipush 3
      // bfe: swap
      // bff: aastore
      // c00: dup_x1
      // c01: swap
      // c02: bipush 2
      // c03: swap
      // c04: aastore
      // c05: dup_x1
      // c06: swap
      // c07: bipush 1
      // c08: swap
      // c09: aastore
      // c0a: dup_x1
      // c0b: swap
      // c0c: bipush 0
      // c0d: swap
      // c0e: aastore
      // c0f: ldc2_w -4374090960630945593
      // c12: lload 10
      // c14: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c19: astore 104
      // c1b: iload 103
      // c1d: lload 10
      // c1f: lconst_0
      // c20: lcmp
      // c21: iflt c2f
      // c24: ifeq d95
      // c27: aload 19
      // c29: aload 0
      // c2a: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // c2f: goto c3d
      // c32: ldc2_w -2307030980420704683
      // c35: lload 10
      // c37: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3c: athrow
      // c3d: iload 103
      // c3f: lload 10
      // c41: lconst_0
      // c42: lcmp
      // c43: ifle c84
      // c46: ifne c82
      // c49: ifne d95
      // c4c: goto c5a
      // c4f: ldc2_w -2307030980420704683
      // c52: lload 10
      // c54: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c59: athrow
      // c5a: aload 0
      // c5b: lload 59
      // c5d: bipush 1
      // c5e: anewarray 46
      // c61: dup_x2
      // c62: dup_x2
      // c63: pop
      // c64: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c67: bipush 0
      // c68: swap
      // c69: aastore
      // c6a: ldc2_w -2462314398988652185
      // c6d: lload 10
      // c6f: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c74: goto c82
      // c77: ldc2_w -2307030980420704683
      // c7a: lload 10
      // c7c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c81: athrow
      // c82: iload 103
      // c84: ifne d03
      // c87: ifeq cf9
      // c8a: goto c98
      // c8d: ldc2_w -2307030980420704683
      // c90: lload 10
      // c92: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c97: athrow
      // c98: aload 0
      // c99: lload 61
      // c9b: invokevirtual com/zelix/ig.n (J)Z
      // c9e: iload 103
      // ca0: ifne d03
      // ca3: goto cb1
      // ca6: ldc2_w -2307030980420704683
      // ca9: lload 10
      // cab: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb0: athrow
      // cb1: ifeq cf9
      // cb4: goto cc2
      // cb7: ldc2_w -2307030980420704683
      // cba: lload 10
      // cbc: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc1: athrow
      // cc2: aload 0
      // cc3: lload 45
      // cc5: invokevirtual com/zelix/ig.G (J)Lcom/zelix/_fz;
      // cc8: ldc2_w -2329265523847575899
      // ccb: lload 10
      // ccd: invokedynamic j (JJ)Lcom/zelix/_fz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd2: invokevirtual com/zelix/_fz.equals (Ljava/lang/Object;)Z
      // cd5: iload 103
      // cd7: ifne d03
      // cda: goto ce8
      // cdd: ldc2_w -2307030980420704683
      // ce0: lload 10
      // ce2: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce7: athrow
      // ce8: ifne d95
      // ceb: goto cf9
      // cee: ldc2_w -2307030980420704683
      // cf1: lload 10
      // cf3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cf8: athrow
      // cf9: ldc2_w -4555748890282825768
      // cfc: lload 10
      // cfe: invokedynamic j (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d03: ifne d95
      // d06: aload 2
      // d07: aload 20
      // d09: aload 4
      // d0b: aload 0
      // d0c: aload 16
      // d0e: lload 43
      // d10: aload 17
      // d12: iload 15
      // d14: aload 14
      // d16: aload 18
      // d18: aload 8
      // d1a: aload 7
      // d1c: aload 5
      // d1e: aload 3
      // d1f: iload 23
      // d21: iload 110
      // d23: bipush 15
      // d25: anewarray 46
      // d28: dup_x1
      // d29: swap
      // d2a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // d2d: bipush 14
      // d2f: swap
      // d30: aastore
      // d31: dup_x1
      // d32: swap
      // d33: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // d36: bipush 13
      // d38: swap
      // d39: aastore
      // d3a: dup_x1
      // d3b: swap
      // d3c: bipush 12
      // d3e: swap
      // d3f: aastore
      // d40: dup_x1
      // d41: swap
      // d42: bipush 11
      // d44: swap
      // d45: aastore
      // d46: dup_x1
      // d47: swap
      // d48: bipush 10
      // d4a: swap
      // d4b: aastore
      // d4c: dup_x1
      // d4d: swap
      // d4e: bipush 9
      // d50: swap
      // d51: aastore
      // d52: dup_x1
      // d53: swap
      // d54: bipush 8
      // d56: swap
      // d57: aastore
      // d58: dup_x1
      // d59: swap
      // d5a: bipush 7
      // d5c: swap
      // d5d: aastore
      // d5e: dup_x1
      // d5f: swap
      // d60: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // d63: bipush 6
      // d65: swap
      // d66: aastore
      // d67: dup_x1
      // d68: swap
      // d69: bipush 5
      // d6a: swap
      // d6b: aastore
      // d6c: dup_x2
      // d6d: dup_x2
      // d6e: pop
      // d6f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // d72: bipush 4
      // d73: swap
      // d74: aastore
      // d75: dup_x1
      // d76: swap
      // d77: bipush 3
      // d78: swap
      // d79: aastore
      // d7a: dup_x1
      // d7b: swap
      // d7c: bipush 2
      // d7d: swap
      // d7e: aastore
      // d7f: dup_x1
      // d80: swap
      // d81: bipush 1
      // d82: swap
      // d83: aastore
      // d84: dup_x1
      // d85: swap
      // d86: bipush 0
      // d87: swap
      // d88: aastore
      // d89: ldc2_w -2503599416449985902
      // d8c: lload 10
      // d8e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d93: astore 104
      // d95: new com/zelix/pg
      // d98: dup
      // d99: lload 75
      // d9b: invokespecial com/zelix/pg.<init> (J)V
      // d9e: astore 107
      // da0: aload 24
      // da2: lload 73
      // da4: aload 0
      // da5: aload 104
      // da7: aload 107
      // da9: bipush 4
      // daa: anewarray 46
      // dad: dup_x1
      // dae: swap
      // daf: bipush 3
      // db0: swap
      // db1: aastore
      // db2: dup_x1
      // db3: swap
      // db4: bipush 2
      // db5: swap
      // db6: aastore
      // db7: dup_x1
      // db8: swap
      // db9: bipush 1
      // dba: swap
      // dbb: aastore
      // dbc: dup_x2
      // dbd: dup_x2
      // dbe: pop
      // dbf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // dc2: bipush 0
      // dc3: swap
      // dc4: aastore
      // dc5: ldc2_w -4357019693955859417
      // dc8: lload 10
      // dca: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_fz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dcf: astore 108
      // dd1: aload 104
      // dd3: iload 103
      // dd5: lload 10
      // dd7: lconst_0
      // dd8: lcmp
      // dd9: iflt fa1
      // ddc: ifne f9f
      // ddf: ifnull f5c
      // de2: goto df0
      // de5: ldc2_w -2307030980420704683
      // de8: lload 10
      // dea: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // def: athrow
      // df0: aload 104
      // df2: aload 0
      // df3: lload 51
      // df5: invokevirtual com/zelix/ig.t (J)Ljava/lang/String;
      // df8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // dfb: lload 10
      // dfd: lconst_0
      // dfe: lcmp
      // dff: ifle fb5
      // e02: iload 103
      // e04: ifne fb5
      // e07: goto e15
      // e0a: ldc2_w -2307030980420704683
      // e0d: lload 10
      // e0f: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e14: athrow
      // e15: ifne f5c
      // e18: goto e26
      // e1b: ldc2_w -2307030980420704683
      // e1e: lload 10
      // e20: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e25: athrow
      // e26: aload 16
      // e28: aload 108
      // e2a: aload 0
      // e2b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // e30: pop
      // e31: aload 14
      // e33: aload 108
      // e35: aload 0
      // e36: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // e3b: pop
      // e3c: aload 18
      // e3e: aload 108
      // e40: lload 29
      // e42: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // e45: aload 0
      // e46: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // e4b: pop
      // e4c: aload 8
      // e4e: aload 108
      // e50: lload 29
      // e52: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // e55: aload 0
      // e56: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // e5b: pop
      // e5c: aload 5
      // e5e: aload 108
      // e60: invokevirtual com/zelix/_fz.v ()Ljava/lang/String;
      // e63: aload 0
      // e64: ldc2_w -2530061507492291441
      // e67: lload 10
      // e69: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e6e: pop
      // e6f: iload 15
      // e71: lload 10
      // e73: lconst_0
      // e74: lcmp
      // e75: ifle ed7
      // e78: iload 103
      // e7a: ifne ed7
      // e7d: goto e8b
      // e80: ldc2_w -2307030980420704683
      // e83: lload 10
      // e85: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e8a: athrow
      // e8b: ifeq ebd
      // e8e: goto e9c
      // e91: ldc2_w -2307030980420704683
      // e94: lload 10
      // e96: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e9b: athrow
      // e9c: aload 7
      // e9e: aload 108
      // ea0: invokevirtual com/zelix/_fz.v ()Ljava/lang/String;
      // ea3: aload 0
      // ea4: ldc2_w -2530061507492291441
      // ea7: lload 10
      // ea9: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // eae: pop
      // eaf: goto ebd
      // eb2: ldc2_w -2307030980420704683
      // eb5: lload 10
      // eb7: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ebc: athrow
      // ebd: aload 107
      // ebf: iload 103
      // ec1: ifne ef4
      // ec4: lload 27
      // ec6: invokevirtual com/zelix/pg.n (J)Z
      // ec9: goto ed7
      // ecc: ldc2_w -2307030980420704683
      // ecf: lload 10
      // ed1: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ed6: athrow
      // ed7: lload 10
      // ed9: lconst_0
      // eda: lcmp
      // edb: iflt f59
      // ede: ifne f2f
      // ee1: aload 107
      // ee3: invokevirtual com/zelix/pg.G ()Ljava/lang/Object;
      // ee6: goto ef4
      // ee9: ldc2_w -2307030980420704683
      // eec: lload 10
      // eee: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ef3: athrow
      // ef4: checkcast com/zelix/_fz
      // ef7: astore 109
      // ef9: aload 16
      // efb: aload 109
      // efd: aload 0
      // efe: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f03: pop
      // f04: aload 14
      // f06: aload 109
      // f08: aload 0
      // f09: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f0e: pop
      // f0f: aload 18
      // f11: aload 109
      // f13: lload 29
      // f15: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // f18: aload 0
      // f19: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f1e: pop
      // f1f: aload 8
      // f21: aload 109
      // f23: lload 29
      // f25: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // f28: aload 0
      // f29: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f2e: pop
      // f2f: aload 0
      // f30: aload 104
      // f32: lload 101
      // f34: bipush 2
      // f35: anewarray 46
      // f38: dup_x2
      // f39: dup_x2
      // f3a: pop
      // f3b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // f3e: bipush 1
      // f3f: swap
      // f40: aastore
      // f41: dup_x1
      // f42: swap
      // f43: bipush 0
      // f44: swap
      // f45: aastore
      // f46: ldc2_w -2529330894830520763
      // f49: lload 10
      // f4b: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f50: lload 10
      // f52: lconst_0
      // f53: lcmp
      // f54: iflt f82
      // f57: iload 103
      // f59: ifeq ff4
      // f5c: aload 16
      // f5e: aload 106
      // f60: aload 0
      // f61: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f66: pop
      // f67: aload 14
      // f69: aload 106
      // f6b: aload 0
      // f6c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f71: pop
      // f72: aload 18
      // f74: aload 106
      // f76: lload 29
      // f78: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // f7b: aload 0
      // f7c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f81: pop
      // f82: aload 8
      // f84: aload 106
      // f86: lload 29
      // f88: invokevirtual com/zelix/_fz.C (J)Lcom/zelix/_fr;
      // f8b: aload 0
      // f8c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // f91: goto f9f
      // f94: ldc2_w -2307030980420704683
      // f97: lload 10
      // f99: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f9e: athrow
      // f9f: iload 103
      // fa1: ifne ff3
      // fa4: pop
      // fa5: iload 15
      // fa7: goto fb5
      // faa: ldc2_w -2307030980420704683
      // fad: lload 10
      // faf: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fb4: athrow
      // fb5: ifeq fd9
      // fb8: aload 7
      // fba: aload 108
      // fbc: invokevirtual com/zelix/_fz.v ()Ljava/lang/String;
      // fbf: aload 0
      // fc0: ldc2_w -2530061507492291441
      // fc3: lload 10
      // fc5: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fca: pop
      // fcb: goto fd9
      // fce: ldc2_w -2307030980420704683
      // fd1: lload 10
      // fd3: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fd8: athrow
      // fd9: aload 5
      // fdb: aload 0
      // fdc: lload 49
      // fde: ldc2_w -4086483703877699466
      // fe1: lload 10
      // fe3: invokedynamic k (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // fe8: aload 0
      // fe9: ldc2_w -2530061507492291441
      // fec: lload 10
      // fee: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ff3: pop
      // ff4: return
   }

   public int V(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 115615352790193
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -3116827482976427782
      // 1e: lload 2
      // 1f: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: istore 6
      // 29: aload 0
      // 2a: iload 6
      // 2c: ifne 55
      // 2f: lload 4
      // 31: invokevirtual com/zelix/ig.n (J)Z
      // 34: ifne 54
      // 37: goto 44
      // 3a: ldc2_w -3782748270046875090
      // 3d: lload 2
      // 3e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: athrow
      // 44: iinc 7 1
      // 47: goto 54
      // 4a: ldc2_w -3782748270046875090
      // 4d: lload 2
      // 4e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/zelix/ig.m Ljava/lang/String;
      // 58: invokestatic com/zelix/xl.u (Ljava/lang/String;)Ljava/lang/String;
      // 5b: astore 8
      // 5d: aload 8
      // 5f: ldc "V"
      // 61: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 64: ifeq 74
      // 67: goto 77
      // 6a: ldc2_w -3782748270046875090
      // 6d: lload 2
      // 6e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: iinc 7 -1
      // 77: iload 7
      // 79: ireturn
   }

   void EK(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 48731479866978
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 8110017715499385062
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifeq 4e
      // 2c: getfield com/zelix/ig.H I
      // 2f: bipush -1
      // 30: if_icmpeq 74
      // 33: goto 40
      // 36: ldc2_w 8270238144251841387
      // 39: lload 2
      // 3a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: goto 4e
      // 44: ldc2_w 8270238144251841387
      // 47: lload 2
      // 48: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 51: aload 0
      // 52: getfield com/zelix/ig.H I
      // 55: aaload
      // 56: checkcast com/zelix/h_
      // 59: checkcast com/zelix/h_
      // 5c: lload 4
      // 5e: bipush 1
      // 5f: anewarray 46
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w 8499329686733890851
      // 6e: lload 2
      // 6f: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: return
   }

   public void kr(Object[] param1) {
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
      // 0b: checkcast com/zelix/_uj
      // 0e: astore 2
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic com/zelix/ig.b J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 81555664311791
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w -3947261915361969838
      // 30: lload 4
      // 32: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: istore 8
      // 39: aload 0
      // 3a: iload 8
      // 3c: ifeq 63
      // 3f: getfield com/zelix/ig.H I
      // 42: bipush -1
      // 43: if_icmpeq 96
      // 46: goto 54
      // 49: ldc2_w -3787006318341459233
      // 4c: lload 4
      // 4e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: goto 63
      // 58: ldc2_w -3787006318341459233
      // 5b: lload 4
      // 5d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 66: aload 0
      // 67: getfield com/zelix/ig.H I
      // 6a: aaload
      // 6b: checkcast com/zelix/h_
      // 6e: checkcast com/zelix/h_
      // 71: lload 6
      // 73: aload 3
      // 74: aload 2
      // 75: bipush 3
      // 76: anewarray 46
      // 79: dup_x1
      // 7a: swap
      // 7b: bipush 2
      // 7c: swap
      // 7d: aastore
      // 7e: dup_x1
      // 7f: swap
      // 80: bipush 1
      // 81: swap
      // 82: aastore
      // 83: dup_x2
      // 84: dup_x2
      // 85: pop
      // 86: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 89: bipush 0
      // 8a: swap
      // 8b: aastore
      // 8c: ldc2_w -3470265805125523601
      // 8f: lload 4
      // 91: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: return
   }

   public ArrayList L(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 15287075542463
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 63941439924994
      // 1e: lxor
      // 1f: lstore 6
      // 21: dup2
      // 22: ldc2_w 124095234588589
      // 25: lxor
      // 26: lstore 8
      // 28: pop2
      // 29: new java/util/ArrayList
      // 2c: dup
      // 2d: invokespecial java/util/ArrayList.<init> ()V
      // 30: astore 11
      // 32: aload 0
      // 33: invokevirtual com/zelix/ig.H ()Ljava/lang/String;
      // 36: astore 12
      // 38: ldc2_w 8371256345368806470
      // 3b: lload 2
      // 3c: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: lload 4
      // 43: aload 12
      // 45: invokestatic com/zelix/xl.X (JLjava/lang/String;)Ljava/util/List;
      // 48: astore 13
      // 4a: istore 10
      // 4c: aload 12
      // 4e: invokestatic com/zelix/xl.u (Ljava/lang/String;)Ljava/lang/String;
      // 51: astore 14
      // 53: aload 13
      // 55: aload 14
      // 57: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5c: pop
      // 5d: bipush 0
      // 5e: istore 15
      // 60: iload 15
      // 62: aload 13
      // 64: invokeinterface java/util/List.size ()I 1
      // 69: if_icmpge dd
      // 6c: aload 13
      // 6e: iload 15
      // 70: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 75: checkcast java/lang/String
      // 78: astore 16
      // 7a: aload 16
      // 7c: lload 8
      // 7e: invokestatic com/zelix/hz.P (Ljava/lang/String;J)Ljava/lang/String;
      // 81: astore 17
      // 83: iload 10
      // 85: ifeq d8
      // 88: aload 17
      // 8a: ifnull d5
      // 8d: goto 9a
      // 90: ldc2_w 8531496278708867019
      // 93: lload 2
      // 94: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: lload 6
      // 9c: aload 17
      // 9e: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // a1: astore 18
      // a3: iload 10
      // a5: lload 2
      // a6: lconst_0
      // a7: lcmp
      // a8: iflt da
      // ab: ifeq d8
      // ae: aload 18
      // b0: ifnull d5
      // b3: goto c0
      // b6: ldc2_w 8531496278708867019
      // b9: lload 2
      // ba: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bf: athrow
      // c0: aload 11
      // c2: aload 18
      // c4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // c7: pop
      // c8: goto d5
      // cb: ldc2_w 8531496278708867019
      // ce: lload 2
      // cf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d4: athrow
      // d5: iinc 15 1
      // d8: iload 10
      // da: ifne 60
      // dd: aload 11
      // df: lload 2
      // e0: lconst_0
      // e1: lcmp
      // e2: iflt 75
      // e5: areturn
   }

   void Ef(Object[] param1) {
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
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 3
      // 15: pop
      // 16: iload 2
      // 17: i2l
      // 18: bipush 48
      // 1a: lshl
      // 1b: lload 3
      // 1c: bipush 16
      // 1e: lshl
      // 1f: bipush 16
      // 21: lushr
      // 22: lor
      // 23: getstatic com/zelix/ig.b J
      // 26: lxor
      // 27: lstore 5
      // 29: lload 5
      // 2b: dup2
      // 2c: ldc2_w 2785298982534
      // 2f: lxor
      // 30: lstore 7
      // 32: pop2
      // 33: ldc2_w -4528988790610202289
      // 36: lload 5
      // 38: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: istore 9
      // 3f: aload 0
      // 40: iload 9
      // 42: ifeq 69
      // 45: getfield com/zelix/ig.H I
      // 48: bipush -1
      // 49: if_icmpeq 90
      // 4c: goto 5a
      // 4f: ldc2_w -4364947559488095550
      // 52: lload 5
      // 54: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 0
      // 5b: goto 69
      // 5e: ldc2_w -4364947559488095550
      // 61: lload 5
      // 63: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 6c: aload 0
      // 6d: getfield com/zelix/ig.H I
      // 70: aaload
      // 71: checkcast com/zelix/h_
      // 74: checkcast com/zelix/h_
      // 77: lload 7
      // 79: bipush 1
      // 7a: anewarray 46
      // 7d: dup_x2
      // 7e: dup_x2
      // 7f: pop
      // 80: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 83: bipush 0
      // 84: swap
      // 85: aastore
      // 86: ldc2_w -2417497967422121444
      // 89: lload 5
      // 8b: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: return
   }

   public void TR(Object[] param1) {
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
      // 004: checkcast com/zelix/es
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 11
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Map
      // 017: astore 8
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/Map
      // 01f: astore 15
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast java/util/Set
      // 027: astore 17
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast java/util/Map
      // 02f: astore 2
      // 030: dup
      // 031: bipush 6
      // 033: aaload
      // 034: checkcast java/lang/Long
      // 037: invokevirtual java/lang/Long.longValue ()J
      // 03a: lstore 9
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast com/zelix/_fm
      // 043: astore 16
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast com/zelix/we
      // 04c: astore 7
      // 04e: dup
      // 04f: bipush 9
      // 051: aaload
      // 052: checkcast java/util/List
      // 055: astore 6
      // 057: dup
      // 058: bipush 10
      // 05a: aaload
      // 05b: checkcast com/zelix/qg
      // 05e: astore 13
      // 060: dup
      // 061: bipush 11
      // 063: aaload
      // 064: checkcast java/util/Random
      // 067: astore 3
      // 068: dup
      // 069: bipush 12
      // 06b: aaload
      // 06c: checkcast com/zelix/_8c
      // 06f: astore 12
      // 071: dup
      // 072: bipush 13
      // 074: aaload
      // 075: checkcast com/zelix/_ye
      // 078: astore 18
      // 07a: dup
      // 07b: bipush 14
      // 07d: aaload
      // 07e: checkcast java/util/Set
      // 081: astore 5
      // 083: dup
      // 084: bipush 15
      // 086: aaload
      // 087: checkcast com/zelix/_ur
      // 08a: astore 14
      // 08c: pop
      // 08d: getstatic com/zelix/ig.b J
      // 090: lload 9
      // 092: lxor
      // 093: lstore 9
      // 095: lload 9
      // 097: dup2
      // 098: ldc2_w 40699885953679
      // 09b: lxor
      // 09c: lstore 19
      // 09e: pop2
      // 09f: ldc2_w 1684829671805494053
      // 0a2: lload 9
      // 0a4: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: istore 21
      // 0ab: aload 0
      // 0ac: getfield com/zelix/ig.H I
      // 0af: iload 21
      // 0b1: ifne 0dc
      // 0b4: bipush -1
      // 0b5: if_icmpeq 17b
      // 0b8: goto 0c6
      // 0bb: ldc2_w 603341885664342513
      // 0be: lload 9
      // 0c0: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 17
      // 0c8: aload 0
      // 0c9: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0ce: goto 0dc
      // 0d1: ldc2_w 603341885664342513
      // 0d4: lload 9
      // 0d6: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: istore 22
      // 0de: aload 0
      // 0df: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0e2: aload 0
      // 0e3: getfield com/zelix/ig.H I
      // 0e6: aaload
      // 0e7: checkcast com/zelix/h_
      // 0ea: checkcast com/zelix/h_
      // 0ed: aload 4
      // 0ef: aload 11
      // 0f1: aload 8
      // 0f3: aload 15
      // 0f5: iload 22
      // 0f7: lload 19
      // 0f9: aload 2
      // 0fa: aload 16
      // 0fc: aload 7
      // 0fe: aload 6
      // 100: aload 13
      // 102: aload 3
      // 103: aload 12
      // 105: aload 18
      // 107: aload 5
      // 109: aload 14
      // 10b: bipush 16
      // 10d: anewarray 46
      // 110: dup_x1
      // 111: swap
      // 112: bipush 15
      // 114: swap
      // 115: aastore
      // 116: dup_x1
      // 117: swap
      // 118: bipush 14
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x1
      // 11d: swap
      // 11e: bipush 13
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 12
      // 126: swap
      // 127: aastore
      // 128: dup_x1
      // 129: swap
      // 12a: bipush 11
      // 12c: swap
      // 12d: aastore
      // 12e: dup_x1
      // 12f: swap
      // 130: bipush 10
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 9
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 8
      // 13e: swap
      // 13f: aastore
      // 140: dup_x1
      // 141: swap
      // 142: bipush 7
      // 144: swap
      // 145: aastore
      // 146: dup_x1
      // 147: swap
      // 148: bipush 6
      // 14a: swap
      // 14b: aastore
      // 14c: dup_x2
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 152: bipush 5
      // 153: swap
      // 154: aastore
      // 155: dup_x1
      // 156: swap
      // 157: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 15a: bipush 4
      // 15b: swap
      // 15c: aastore
      // 15d: dup_x1
      // 15e: swap
      // 15f: bipush 3
      // 160: swap
      // 161: aastore
      // 162: dup_x1
      // 163: swap
      // 164: bipush 2
      // 165: swap
      // 166: aastore
      // 167: dup_x1
      // 168: swap
      // 169: bipush 1
      // 16a: swap
      // 16b: aastore
      // 16c: dup_x1
      // 16d: swap
      // 16e: bipush 0
      // 16f: swap
      // 170: aastore
      // 171: ldc2_w 1671333121641394586
      // 174: lload 9
      // 176: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: return
   }

   void ZB(Object[] param1) {
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
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/_uc
      // 0f: astore 2
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast java/lang/Long
      // 16: invokevirtual java/lang/Long.longValue ()J
      // 19: lstore 3
      // 1a: pop
      // 1b: getstatic com/zelix/ig.b J
      // 1e: lload 3
      // 1f: lxor
      // 20: lstore 3
      // 21: lload 3
      // 22: dup2
      // 23: ldc2_w 54242372477139
      // 26: lxor
      // 27: lstore 6
      // 29: pop2
      // 2a: ldc2_w 3540033027106734410
      // 2d: lload 3
      // 2e: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: istore 8
      // 35: aload 0
      // 36: iload 8
      // 38: ifeq 5d
      // 3b: getfield com/zelix/ig.H I
      // 3e: bipush -1
      // 3f: if_icmpeq 90
      // 42: goto 4f
      // 45: ldc2_w 3704741391275526855
      // 48: lload 3
      // 49: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: goto 5d
      // 53: ldc2_w 3704741391275526855
      // 56: lload 3
      // 57: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 60: aload 0
      // 61: getfield com/zelix/ig.H I
      // 64: aaload
      // 65: checkcast com/zelix/h_
      // 68: checkcast com/zelix/h_
      // 6b: aload 5
      // 6d: aload 2
      // 6e: lload 6
      // 70: bipush 3
      // 71: anewarray 46
      // 74: dup_x2
      // 75: dup_x2
      // 76: pop
      // 77: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7a: bipush 2
      // 7b: swap
      // 7c: aastore
      // 7d: dup_x1
      // 7e: swap
      // 7f: bipush 1
      // 80: swap
      // 81: aastore
      // 82: dup_x1
      // 83: swap
      // 84: bipush 0
      // 85: swap
      // 86: aastore
      // 87: ldc2_w 3350389097658515319
      // 8a: lload 3
      // 8b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: return
   }

   void c0(Object[] param1) {
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/ig.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 15715293728327
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -9193539035502562259
      // 25: lload 3
      // 26: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: iload 7
      // 30: ifne 55
      // 33: getfield com/zelix/ig.H I
      // 36: bipush -1
      // 37: if_icmpeq 81
      // 3a: goto 47
      // 3d: ldc2_w -6964874670192679175
      // 40: lload 3
      // 41: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: goto 55
      // 4b: ldc2_w -6964874670192679175
      // 4e: lload 3
      // 4f: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 58: aload 0
      // 59: getfield com/zelix/ig.H I
      // 5c: aaload
      // 5d: checkcast com/zelix/h_
      // 60: checkcast com/zelix/h_
      // 63: lload 5
      // 65: aload 2
      // 66: bipush 2
      // 67: anewarray 46
      // 6a: dup_x1
      // 6b: swap
      // 6c: bipush 1
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w -7318182802306025510
      // 7b: lload 3
      // 7c: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: return
   }

   public void G(long param1, v_ param3, Object param4, Object param5, Object param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 111561192512122
      // 05: lxor
      // 06: lstore 7
      // 08: dup2
      // 09: ldc2_w 105419701228810
      // 0c: lxor
      // 0d: lstore 9
      // 0f: dup2
      // 10: ldc2_w 3131685519625
      // 13: lxor
      // 14: lstore 11
      // 16: pop2
      // 17: ldc2_w -6413483624488069484
      // 1a: lload 1
      // 1b: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: istore 13
      // 22: aload 4
      // 24: instanceof com/zelix/wp
      // 27: iload 13
      // 29: ifeq 53
      // 2c: ifeq ce
      // 2f: goto 3c
      // 32: ldc2_w -6577540802289230567
      // 35: lload 1
      // 36: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 4
      // 3e: checkcast com/zelix/wp
      // 41: lload 9
      // 43: invokevirtual com/zelix/wp.C (J)I
      // 46: goto 53
      // 49: ldc2_w -6577540802289230567
      // 4c: lload 1
      // 4d: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: athrow
      // 53: iload 13
      // 55: ifeq 8c
      // 58: ifne ce
      // 5b: goto 68
      // 5e: ldc2_w -6577540802289230567
      // 61: lload 1
      // 62: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: aload 5
      // 6a: iload 13
      // 6c: ifeq 91
      // 6f: goto 7c
      // 72: ldc2_w -6577540802289230567
      // 75: lload 1
      // 76: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: instanceof com/zelix/hy
      // 7f: goto 8c
      // 82: ldc2_w -6577540802289230567
      // 85: lload 1
      // 86: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: athrow
      // 8c: ifeq ce
      // 8f: aload 5
      // 91: checkcast com/zelix/hy
      // 94: lload 7
      // 96: bipush 1
      // 97: anewarray 46
      // 9a: dup_x2
      // 9b: dup_x2
      // 9c: pop
      // 9d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a0: bipush 0
      // a1: swap
      // a2: aastore
      // a3: ldc2_w -6437392636963172219
      // a6: lload 1
      // a7: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: astore 14
      // ae: aload 0
      // af: aload 14
      // b1: lload 11
      // b3: bipush 2
      // b4: anewarray 46
      // b7: dup_x2
      // b8: dup_x2
      // b9: pop
      // ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // bd: bipush 1
      // be: swap
      // bf: aastore
      // c0: dup_x1
      // c1: swap
      // c2: bipush 0
      // c3: swap
      // c4: aastore
      // c5: ldc2_w -6365235519174030071
      // c8: lload 1
      // c9: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ce: return
   }

   public te h(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w -3749348655408874595
      // 15: lload 2
      // 16: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: aconst_null
      // 1c: astore 5
      // 1e: istore 4
      // 20: aload 0
      // 21: iload 4
      // 23: ifeq 48
      // 26: getfield com/zelix/ig.H I
      // 29: bipush -1
      // 2a: if_icmpeq 72
      // 2d: goto 3a
      // 30: ldc2_w -3909414053097705456
      // 33: lload 2
      // 34: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 48
      // 3e: ldc2_w -3909414053097705456
      // 41: lload 2
      // 42: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 4b: aload 0
      // 4c: getfield com/zelix/ig.H I
      // 4f: aaload
      // 50: checkcast com/zelix/h_
      // 53: checkcast com/zelix/h_
      // 56: bipush 0
      // 57: anewarray 46
      // 5a: ldc2_w -3262909376794975201
      // 5d: lload 2
      // 5e: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/be; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: bipush 0
      // 64: anewarray 46
      // 67: ldc2_w -3805811863950689771
      // 6a: lload 2
      // 6b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/te; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: astore 5
      // 72: aload 5
      // 74: areturn
   }

   boolean B(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 10292805333950
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 2516367691281274543
      // 1e: lload 2
      // 1f: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/ig.H I
      // 2a: iload 6
      // 2c: ifne 73
      // 2f: bipush -1
      // 30: if_icmpeq 72
      // 33: goto 40
      // 36: ldc2_w 4455705460304315515
      // 39: lload 2
      // 3a: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 44: aload 0
      // 45: getfield com/zelix/ig.H I
      // 48: aaload
      // 49: checkcast com/zelix/h_
      // 4c: checkcast com/zelix/h_
      // 4f: lload 4
      // 51: bipush 1
      // 52: anewarray 46
      // 55: dup_x2
      // 56: dup_x2
      // 57: pop
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: bipush 0
      // 5c: swap
      // 5d: aastore
      // 5e: ldc2_w 4379837245198966408
      // 61: lload 2
      // 62: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: ireturn
      // 68: ldc2_w 4455705460304315515
      // 6b: lload 2
      // 6c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: bipush 0
      // 73: ireturn
   }

   void Ap(Object[] param1) {
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
      // 04: checkcast com/zelix/_y4
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/ig.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 16114934781856
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w -120860907194364360
      // 26: lload 2
      // 27: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 7
      // 2e: aload 0
      // 2f: iload 7
      // 31: ifeq 56
      // 34: getfield com/zelix/ig.H I
      // 37: bipush -1
      // 38: if_icmpeq 83
      // 3b: goto 48
      // 3e: ldc2_w -280412539827665483
      // 41: lload 2
      // 42: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: goto 56
      // 4c: ldc2_w -280412539827665483
      // 4f: lload 2
      // 50: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 59: aload 0
      // 5a: getfield com/zelix/ig.H I
      // 5d: aaload
      // 5e: checkcast com/zelix/h_
      // 61: checkcast com/zelix/h_
      // 64: lload 5
      // 66: aload 4
      // 68: bipush 2
      // 69: anewarray 46
      // 6c: dup_x1
      // 6d: swap
      // 6e: bipush 1
      // 6f: swap
      // 70: aastore
      // 71: dup_x2
      // 72: dup_x2
      // 73: pop
      // 74: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 77: bipush 0
      // 78: swap
      // 79: aastore
      // 7a: ldc2_w -2298358098050142944
      // 7d: lload 2
      // 7e: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: return
   }

   void BG(Object[] param1) {
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
      // 0f: checkcast com/zelix/vl
      // 12: astore 3
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Set
      // 19: astore 2
      // 1a: pop
      // 1b: getstatic com/zelix/ig.b J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 125982008132429
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w -3347611135023061554
      // 30: lload 4
      // 32: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: istore 8
      // 39: aload 0
      // 3a: iload 8
      // 3c: ifne 63
      // 3f: getfield com/zelix/ig.H I
      // 42: bipush -1
      // 43: if_icmpeq 9c
      // 46: goto 54
      // 49: ldc2_w -3551982210193230054
      // 4c: lload 4
      // 4e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: goto 63
      // 58: ldc2_w -3551982210193230054
      // 5b: lload 4
      // 5d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 66: aload 0
      // 67: getfield com/zelix/ig.H I
      // 6a: aaload
      // 6b: checkcast com/zelix/h_
      // 6e: checkcast com/zelix/h_
      // 71: lload 6
      // 73: aload 3
      // 74: aload 0
      // 75: aload 2
      // 76: bipush 4
      // 77: anewarray 46
      // 7a: dup_x1
      // 7b: swap
      // 7c: bipush 3
      // 7d: swap
      // 7e: aastore
      // 7f: dup_x1
      // 80: swap
      // 81: bipush 2
      // 82: swap
      // 83: aastore
      // 84: dup_x1
      // 85: swap
      // 86: bipush 1
      // 87: swap
      // 88: aastore
      // 89: dup_x2
      // 8a: dup_x2
      // 8b: pop
      // 8c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8f: bipush 0
      // 90: swap
      // 91: aastore
      // 92: ldc2_w -3295546608552727091
      // 95: lload 4
      // 97: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9c: return
   }

   void qx(Object[] param1) {
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
      // 004: checkcast com/zelix/_uf
      // 007: astore 10
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/_8c
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Map
      // 017: astore 3
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/_y4
      // 01e: astore 9
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast java/util/List
      // 026: astore 2
      // 027: dup
      // 028: bipush 5
      // 029: aaload
      // 02a: checkcast com/zelix/_fm
      // 02d: astore 8
      // 02f: dup
      // 030: bipush 6
      // 032: aaload
      // 033: checkcast java/lang/Long
      // 036: invokevirtual java/lang/Long.longValue ()J
      // 039: lstore 5
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast com/zelix/we
      // 042: astore 7
      // 044: pop
      // 045: getstatic com/zelix/ig.b J
      // 048: lload 5
      // 04a: lxor
      // 04b: lstore 5
      // 04d: lload 5
      // 04f: dup2
      // 050: ldc2_w 7158781215037
      // 053: lxor
      // 054: dup2
      // 055: bipush 32
      // 057: lushr
      // 058: l2i
      // 059: istore 11
      // 05b: dup2
      // 05c: bipush 32
      // 05e: lshl
      // 05f: bipush 48
      // 061: lushr
      // 062: l2i
      // 063: istore 12
      // 065: dup2
      // 066: bipush 48
      // 068: lshl
      // 069: bipush 48
      // 06b: lushr
      // 06c: l2i
      // 06d: istore 13
      // 06f: pop2
      // 070: pop2
      // 071: ldc2_w -5164260464998577136
      // 074: lload 5
      // 076: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: istore 14
      // 07d: aload 0
      // 07e: iload 14
      // 080: ifne 0a7
      // 083: getfield com/zelix/ig.H I
      // 086: bipush -1
      // 087: if_icmpeq 117
      // 08a: goto 098
      // 08d: ldc2_w -6383030172223234364
      // 090: lload 5
      // 092: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: aload 0
      // 099: goto 0a7
      // 09c: ldc2_w -6383030172223234364
      // 09f: lload 5
      // 0a1: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: athrow
      // 0a7: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0aa: aload 0
      // 0ab: getfield com/zelix/ig.H I
      // 0ae: aaload
      // 0af: checkcast com/zelix/h_
      // 0b2: checkcast com/zelix/h_
      // 0b5: iload 11
      // 0b7: aload 10
      // 0b9: aload 4
      // 0bb: aload 3
      // 0bc: aload 9
      // 0be: aload 2
      // 0bf: iload 12
      // 0c1: i2c
      // 0c2: aload 8
      // 0c4: iload 13
      // 0c6: i2s
      // 0c7: aload 7
      // 0c9: bipush 10
      // 0cb: anewarray 46
      // 0ce: dup_x1
      // 0cf: swap
      // 0d0: bipush 9
      // 0d2: swap
      // 0d3: aastore
      // 0d4: dup_x1
      // 0d5: swap
      // 0d6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d9: bipush 8
      // 0db: swap
      // 0dc: aastore
      // 0dd: dup_x1
      // 0de: swap
      // 0df: bipush 7
      // 0e1: swap
      // 0e2: aastore
      // 0e3: dup_x1
      // 0e4: swap
      // 0e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e8: bipush 6
      // 0ea: swap
      // 0eb: aastore
      // 0ec: dup_x1
      // 0ed: swap
      // 0ee: bipush 5
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: bipush 4
      // 0f4: swap
      // 0f5: aastore
      // 0f6: dup_x1
      // 0f7: swap
      // 0f8: bipush 3
      // 0f9: swap
      // 0fa: aastore
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: bipush 2
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x1
      // 101: swap
      // 102: bipush 1
      // 103: swap
      // 104: aastore
      // 105: dup_x1
      // 106: swap
      // 107: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10a: bipush 0
      // 10b: swap
      // 10c: aastore
      // 10d: ldc2_w -6598226639431894969
      // 110: lload 5
      // 112: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: return
   }

   final void i5(Object[] param1) {
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
      // 004: checkcast com/zelix/_ur
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
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 5
      // 01e: pop
      // 01f: getstatic com/zelix/ig.b J
      // 022: lload 2
      // 023: lxor
      // 024: lstore 2
      // 025: lload 2
      // 026: dup2
      // 027: ldc2_w 42234429872267
      // 02a: lxor
      // 02b: dup2
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 6
      // 032: dup2
      // 033: bipush 16
      // 035: lshl
      // 036: bipush 48
      // 038: lushr
      // 039: l2i
      // 03a: istore 7
      // 03c: dup2
      // 03d: bipush 32
      // 03f: lshl
      // 040: bipush 32
      // 042: lushr
      // 043: l2i
      // 044: istore 8
      // 046: pop2
      // 047: dup2
      // 048: ldc2_w 74478745156028
      // 04b: lxor
      // 04c: lstore 9
      // 04e: dup2
      // 04f: ldc2_w 11866749610576
      // 052: lxor
      // 053: lstore 11
      // 055: dup2
      // 056: ldc2_w 99413759559298
      // 059: lxor
      // 05a: lstore 13
      // 05c: dup2
      // 05d: ldc2_w 63209587557583
      // 060: lxor
      // 061: lstore 15
      // 063: dup2
      // 064: ldc2_w 89888565007606
      // 067: lxor
      // 068: lstore 17
      // 06a: dup2
      // 06b: ldc2_w 30232249456361
      // 06e: lxor
      // 06f: lstore 19
      // 071: dup2
      // 072: ldc2_w 50393025723571
      // 075: lxor
      // 076: lstore 21
      // 078: pop2
      // 079: ldc2_w -1928457054081330824
      // 07c: lload 2
      // 07d: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: bipush 0
      // 083: istore 24
      // 085: istore 23
      // 087: iload 24
      // 089: aload 0
      // 08a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 08d: arraylength
      // 08e: if_icmpge 16b
      // 091: aload 0
      // 092: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 095: iload 24
      // 097: aaload
      // 098: instanceof com/zelix/_yl
      // 09b: iload 23
      // 09d: lload 2
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: ifle 175
      // 0a3: ifne 173
      // 0a6: iload 23
      // 0a8: ifne 12b
      // 0ab: goto 0b8
      // 0ae: ldc2_w -431631905268382804
      // 0b1: lload 2
      // 0b2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: athrow
      // 0b8: ifeq 102
      // 0bb: goto 0c8
      // 0be: ldc2_w -431631905268382804
      // 0c1: lload 2
      // 0c2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0cc: iload 24
      // 0ce: aaload
      // 0cf: checkcast com/zelix/_yl
      // 0d2: lload 19
      // 0d4: bipush 1
      // 0d5: anewarray 46
      // 0d8: dup_x2
      // 0d9: dup_x2
      // 0da: pop
      // 0db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0de: bipush 0
      // 0df: swap
      // 0e0: aastore
      // 0e1: ldc2_w -1820554265226707930
      // 0e4: lload 2
      // 0e5: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: iload 23
      // 0ec: lload 2
      // 0ed: lconst_0
      // 0ee: lcmp
      // 0ef: iflt 168
      // 0f2: ifeq 163
      // 0f5: goto 102
      // 0f8: ldc2_w -431631905268382804
      // 0fb: lload 2
      // 0fc: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 0
      // 103: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 106: iload 24
      // 108: aaload
      // 109: iload 23
      // 10b: ifne 148
      // 10e: goto 11b
      // 111: ldc2_w -431631905268382804
      // 114: lload 2
      // 115: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: instanceof com/zelix/h_
      // 11e: goto 12b
      // 121: ldc2_w -431631905268382804
      // 124: lload 2
      // 125: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: lload 2
      // 12c: lconst_0
      // 12d: lcmp
      // 12e: iflt 168
      // 131: ifeq 163
      // 134: aload 0
      // 135: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 138: iload 24
      // 13a: aaload
      // 13b: goto 148
      // 13e: ldc2_w -431631905268382804
      // 141: lload 2
      // 142: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: athrow
      // 148: checkcast com/zelix/h_
      // 14b: lload 21
      // 14d: bipush 1
      // 14e: anewarray 46
      // 151: dup_x2
      // 152: dup_x2
      // 153: pop
      // 154: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 157: bipush 0
      // 158: swap
      // 159: aastore
      // 15a: ldc2_w -141630458762038674
      // 15d: lload 2
      // 15e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: iinc 24 1
      // 166: iload 23
      // 168: ifeq 087
      // 16b: lload 2
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: iflt 091
      // 171: iload 5
      // 173: iload 23
      // 175: lload 2
      // 176: lconst_0
      // 177: lcmp
      // 178: iflt 1b6
      // 17b: ifne 1b4
      // 17e: ifeq 395
      // 181: goto 18e
      // 184: ldc2_w -431631905268382804
      // 187: lload 2
      // 188: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: aload 0
      // 18f: lload 9
      // 191: bipush 1
      // 192: anewarray 46
      // 195: dup_x2
      // 196: dup_x2
      // 197: pop
      // 198: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19b: bipush 0
      // 19c: swap
      // 19d: aastore
      // 19e: ldc2_w -20566737144243187
      // 1a1: lload 2
      // 1a2: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: goto 1b4
      // 1aa: ldc2_w -431631905268382804
      // 1ad: lload 2
      // 1ae: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: iload 23
      // 1b6: ifne 1e8
      // 1b9: ifne 1eb
      // 1bc: goto 1c9
      // 1bf: ldc2_w -431631905268382804
      // 1c2: lload 2
      // 1c3: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: iload 6
      // 1cc: i2c
      // 1cd: iload 7
      // 1cf: i2c
      // 1d0: iload 8
      // 1d2: ldc2_w -1745481692042902741
      // 1d5: lload 2
      // 1d6: invokedynamic j (Ljava/lang/Object;CCIJJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: goto 1e8
      // 1de: ldc2_w -431631905268382804
      // 1e1: lload 2
      // 1e2: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: athrow
      // 1e8: ifeq 395
      // 1eb: new java/util/ArrayList
      // 1ee: dup
      // 1ef: invokespecial java/util/ArrayList.<init> ()V
      // 1f2: astore 24
      // 1f4: bipush 0
      // 1f5: istore 25
      // 1f7: iload 25
      // 1f9: aload 0
      // 1fa: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 1fd: arraylength
      // 1fe: if_icmpge 33a
      // 201: aload 0
      // 202: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 205: iload 25
      // 207: aaload
      // 208: instanceof com/zelix/b6
      // 20b: iload 23
      // 20d: lload 2
      // 20e: lconst_0
      // 20f: lcmp
      // 210: iflt 34b
      // 213: ifne 347
      // 216: iload 23
      // 218: ifne 331
      // 21b: goto 228
      // 21e: ldc2_w -431631905268382804
      // 221: lload 2
      // 222: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 227: athrow
      // 228: lload 2
      // 229: lconst_0
      // 22a: lcmp
      // 22b: iflt 324
      // 22e: ifeq 316
      // 231: goto 23e
      // 234: ldc2_w -431631905268382804
      // 237: lload 2
      // 238: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: aload 4
      // 240: lload 2
      // 241: lconst_0
      // 242: lcmp
      // 243: iflt 286
      // 246: iload 23
      // 248: ifne 286
      // 24b: goto 258
      // 24e: ldc2_w -431631905268382804
      // 251: lload 2
      // 252: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: athrow
      // 258: ldc2_w -1803295788603025558
      // 25b: lload 2
      // 25c: invokedynamic j (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: lload 2
      // 262: lconst_0
      // 263: lcmp
      // 264: ifle 337
      // 267: ifeq 332
      // 26a: goto 277
      // 26d: ldc2_w -431631905268382804
      // 270: lload 2
      // 271: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 276: athrow
      // 277: aload 4
      // 279: goto 286
      // 27c: ldc2_w -431631905268382804
      // 27f: lload 2
      // 280: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 285: athrow
      // 286: new java/lang/StringBuilder
      // 289: dup
      // 28a: invokespecial java/lang/StringBuilder.<init> ()V
      // 28d: sipush 17454
      // 290: ldc2_w 6350610995124806383
      // 293: lload 2
      // 294: lxor
      // 295: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29d: aload 0
      // 29e: lload 11
      // 2a0: ldc2_w -1955932472368234285
      // 2a3: lload 2
      // 2a4: invokedynamic j (Ljava/lang/Object;JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ac: sipush 30294
      // 2af: ldc2_w 7587183658520088719
      // 2b2: lload 2
      // 2b3: lxor
      // 2b4: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bc: aload 0
      // 2bd: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 2c0: lload 15
      // 2c2: bipush 1
      // 2c3: anewarray 46
      // 2c6: dup_x2
      // 2c7: dup_x2
      // 2c8: pop
      // 2c9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2cc: bipush 0
      // 2cd: swap
      // 2ce: aastore
      // 2cf: ldc2_w -2098945760051128997
      // 2d2: lload 2
      // 2d3: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2db: sipush 23466
      // 2de: ldc2_w 2898271672976850278
      // 2e1: lload 2
      // 2e2: lxor
      // 2e3: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ee: lload 13
      // 2f0: bipush 2
      // 2f1: anewarray 46
      // 2f4: dup_x2
      // 2f5: dup_x2
      // 2f6: pop
      // 2f7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2fa: bipush 1
      // 2fb: swap
      // 2fc: aastore
      // 2fd: dup_x1
      // 2fe: swap
      // 2ff: bipush 0
      // 300: swap
      // 301: aastore
      // 302: ldc2_w -1840812152850818324
      // 305: lload 2
      // 306: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: iload 23
      // 30d: lload 2
      // 30e: lconst_0
      // 30f: lcmp
      // 310: ifle 337
      // 313: ifeq 332
      // 316: aload 24
      // 318: aload 0
      // 319: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 31c: iload 25
      // 31e: aaload
      // 31f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 324: goto 331
      // 327: ldc2_w -431631905268382804
      // 32a: lload 2
      // 32b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 330: athrow
      // 331: pop
      // 332: iinc 25 1
      // 335: iload 23
      // 337: ifeq 1f7
      // 33a: aload 24
      // 33c: lload 2
      // 33d: lconst_0
      // 33e: lcmp
      // 33f: iflt 318
      // 342: invokeinterface java/util/List.size ()I 1
      // 347: aload 0
      // 348: getfield com/zelix/ig.F I
      // 34b: if_icmpge 395
      // 34e: aload 0
      // 34f: aload 24
      // 351: aload 24
      // 353: invokeinterface java/util/List.size ()I 1
      // 358: anewarray 442
      // 35b: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 360: checkcast [Lcom/zelix/h4;
      // 363: putfield com/zelix/ig.J [Lcom/zelix/h4;
      // 366: aload 0
      // 367: aload 0
      // 368: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 36b: arraylength
      // 36c: putfield com/zelix/ig.F I
      // 36f: aload 0
      // 370: lload 17
      // 372: bipush 1
      // 373: anewarray 46
      // 376: dup_x2
      // 377: dup_x2
      // 378: pop
      // 379: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37c: bipush 0
      // 37d: swap
      // 37e: aastore
      // 37f: ldc2_w -93105368925019929
      // 382: lload 2
      // 383: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 388: goto 395
      // 38b: ldc2_w -431631905268382804
      // 38e: lload 2
      // 38f: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 394: athrow
      // 395: return
   }

   public hy Y() {
      return (hy)this.x();
   }

   boolean T(Object[] param1) {
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
      // 0e: checkcast com/zelix/w
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/ig.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 83689776322487
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: bipush 0
      // 24: istore 8
      // 26: ldc2_w -2781612578444154609
      // 29: lload 2
      // 2a: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: bipush 0
      // 30: istore 9
      // 32: istore 7
      // 34: iload 9
      // 36: aload 0
      // 37: getfield com/zelix/ig.F I
      // 3a: if_icmpge bb
      // 3d: aload 0
      // 3e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 41: iload 9
      // 43: aaload
      // 44: instanceof com/zelix/by
      // 47: iload 7
      // 49: lload 2
      // 4a: lconst_0
      // 4b: lcmp
      // 4c: ifle 54
      // 4f: ifeq c3
      // 52: iload 7
      // 54: ifeq b1
      // 57: goto 64
      // 5a: ldc2_w -2653497616479755646
      // 5d: lload 2
      // 5e: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: lload 2
      // 65: lconst_0
      // 66: lcmp
      // 67: ifle b8
      // 6a: ifeq b3
      // 6d: goto 7a
      // 70: ldc2_w -2653497616479755646
      // 73: lload 2
      // 74: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 79: athrow
      // 7a: aload 0
      // 7b: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 7e: iload 9
      // 80: aaload
      // 81: checkcast com/zelix/by
      // 84: lload 5
      // 86: aload 4
      // 88: bipush 2
      // 89: anewarray 46
      // 8c: dup_x1
      // 8d: swap
      // 8e: bipush 1
      // 8f: swap
      // 90: aastore
      // 91: dup_x2
      // 92: dup_x2
      // 93: pop
      // 94: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 97: bipush 0
      // 98: swap
      // 99: aastore
      // 9a: ldc2_w -2433916387236457168
      // 9d: lload 2
      // 9e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a3: bipush 1
      // a4: goto b1
      // a7: ldc2_w -2653497616479755646
      // aa: lload 2
      // ab: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: istore 8
      // b3: iinc 9 1
      // b6: iload 7
      // b8: ifne 34
      // bb: lload 2
      // bc: lconst_0
      // bd: lcmp
      // be: ifle 3d
      // c1: iload 8
      // c3: ireturn
   }

   public void I(Object[] param1) {
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
      // 0e: checkcast [Lcom/zelix/r6;
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/ig.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 35105469686564
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -5301886809062866385
      // 25: lload 3
      // 26: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: iload 7
      // 30: ifne 55
      // 33: getfield com/zelix/ig.H I
      // 36: bipush -1
      // 37: if_icmpeq 81
      // 3a: goto 47
      // 3d: ldc2_w -6244841634109288197
      // 40: lload 3
      // 41: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: goto 55
      // 4b: ldc2_w -6244841634109288197
      // 4e: lload 3
      // 4f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 58: aload 0
      // 59: getfield com/zelix/ig.H I
      // 5c: aaload
      // 5d: checkcast com/zelix/h_
      // 60: checkcast com/zelix/h_
      // 63: aload 2
      // 64: lload 5
      // 66: bipush 2
      // 67: anewarray 46
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x1
      // 74: swap
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w -5940619793042017137
      // 7b: lload 3
      // 7c: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: return
   }

   public void ZR(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_y4
      // 021: astore 10
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Long
      // 029: astore 3
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/lu
      // 030: astore 9
      // 032: dup
      // 033: bipush 6
      // 035: aaload
      // 036: checkcast com/zelix/qm
      // 039: astore 13
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast com/zelix/_8c
      // 042: astore 7
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast java/util/List
      // 04b: astore 4
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast com/zelix/_fm
      // 054: astore 11
      // 056: dup
      // 057: bipush 10
      // 059: aaload
      // 05a: checkcast com/zelix/we
      // 05d: astore 12
      // 05f: pop
      // 060: getstatic com/zelix/ig.b J
      // 063: lload 5
      // 065: lxor
      // 066: lstore 5
      // 068: lload 5
      // 06a: dup2
      // 06b: ldc2_w 2583177764650
      // 06e: lxor
      // 06f: lstore 14
      // 071: dup2
      // 072: ldc2_w 69011006387423
      // 075: lxor
      // 076: lstore 16
      // 078: pop2
      // 079: ldc2_w 3084885940802558629
      // 07c: lload 5
      // 07e: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: istore 18
      // 085: aload 0
      // 086: iload 18
      // 088: ifeq 0af
      // 08b: getfield com/zelix/ig.H I
      // 08e: bipush -1
      // 08f: if_icmpeq 12f
      // 092: goto 0a0
      // 095: ldc2_w 2920281484777558312
      // 098: lload 5
      // 09a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: goto 0af
      // 0a4: ldc2_w 2920281484777558312
      // 0a7: lload 5
      // 0a9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0b2: aload 0
      // 0b3: getfield com/zelix/ig.H I
      // 0b6: aaload
      // 0b7: checkcast com/zelix/h_
      // 0ba: checkcast com/zelix/h_
      // 0bd: aload 8
      // 0bf: aload 0
      // 0c0: lload 16
      // 0c2: invokevirtual com/zelix/ig.V (J)Z
      // 0c5: aload 2
      // 0c6: aload 10
      // 0c8: aload 3
      // 0c9: aload 9
      // 0cb: lload 14
      // 0cd: aload 13
      // 0cf: aload 7
      // 0d1: aload 4
      // 0d3: aload 11
      // 0d5: aload 12
      // 0d7: bipush 12
      // 0d9: anewarray 46
      // 0dc: dup_x1
      // 0dd: swap
      // 0de: bipush 11
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 10
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x1
      // 0e9: swap
      // 0ea: bipush 9
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 8
      // 0f2: swap
      // 0f3: aastore
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: bipush 7
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x2
      // 0fb: dup_x2
      // 0fc: pop
      // 0fd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 100: bipush 6
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: bipush 5
      // 107: swap
      // 108: aastore
      // 109: dup_x1
      // 10a: swap
      // 10b: bipush 4
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x1
      // 10f: swap
      // 110: bipush 3
      // 111: swap
      // 112: aastore
      // 113: dup_x1
      // 114: swap
      // 115: bipush 2
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 11d: bipush 1
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w 3260676354836001579
      // 128: lload 5
      // 12a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: return
   }

   public void h4(Object[] param1) {
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
      // 00e: checkcast com/zelix/_ur
      // 011: astore 2
      // 012: pop
      // 013: getstatic com/zelix/ig.b J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 81117046902202
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 115478975534985
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 85778253879839
      // 02c: lxor
      // 02d: lstore 9
      // 02f: pop2
      // 030: aload 0
      // 031: ldc2_w 9010459715890636713
      // 034: lload 3
      // 035: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/_fh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: lload 7
      // 03c: bipush 1
      // 03d: anewarray 46
      // 040: dup_x2
      // 041: dup_x2
      // 042: pop
      // 043: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 046: bipush 0
      // 047: swap
      // 048: aastore
      // 049: ldc2_w 9058721338352268687
      // 04c: lload 3
      // 04d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/bd; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: astore 12
      // 054: ldc2_w 7493887729989866427
      // 057: lload 3
      // 058: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: new java/util/ArrayList
      // 060: dup
      // 061: aload 0
      // 062: getfield com/zelix/ig.F I
      // 065: invokespecial java/util/ArrayList.<init> (I)V
      // 068: astore 13
      // 06a: istore 11
      // 06c: aload 0
      // 06d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 070: astore 14
      // 072: aload 14
      // 074: arraylength
      // 075: istore 15
      // 077: bipush 0
      // 078: istore 16
      // 07a: iload 16
      // 07c: iload 15
      // 07e: if_icmpge 174
      // 081: aload 14
      // 083: iload 16
      // 085: aaload
      // 086: astore 17
      // 088: iload 11
      // 08a: lload 3
      // 08b: lconst_0
      // 08c: lcmp
      // 08d: ifle 095
      // 090: ifne 1bc
      // 093: iload 11
      // 095: lload 3
      // 096: lconst_0
      // 097: lcmp
      // 098: ifle 106
      // 09b: ifne 104
      // 09e: goto 0ab
      // 0a1: ldc2_w 8701399476785791343
      // 0a4: lload 3
      // 0a5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: lload 3
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: iflt 15f
      // 0b1: aload 17
      // 0b3: aload 12
      // 0b5: if_acmpne 155
      // 0b8: goto 0c5
      // 0bb: ldc2_w 8701399476785791343
      // 0be: lload 3
      // 0bf: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: aload 12
      // 0c7: sipush 10488
      // 0ca: ldc2_w 9052279760172371190
      // 0cd: lload 3
      // 0ce: lxor
      // 0cf: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: aload 2
      // 0d5: lload 9
      // 0d7: bipush 3
      // 0d8: anewarray 46
      // 0db: dup_x2
      // 0dc: dup_x2
      // 0dd: pop
      // 0de: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e1: bipush 2
      // 0e2: swap
      // 0e3: aastore
      // 0e4: dup_x1
      // 0e5: swap
      // 0e6: bipush 1
      // 0e7: swap
      // 0e8: aastore
      // 0e9: dup_x1
      // 0ea: swap
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: ldc2_w 8742027021534830019
      // 0f1: lload 3
      // 0f2: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: goto 104
      // 0fa: ldc2_w 8701399476785791343
      // 0fd: lload 3
      // 0fe: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: iload 11
      // 106: lload 3
      // 107: lconst_0
      // 108: lcmp
      // 109: iflt 171
      // 10c: ifne 16f
      // 10f: aload 12
      // 111: lload 5
      // 113: bipush 1
      // 114: anewarray 46
      // 117: dup_x2
      // 118: dup_x2
      // 119: pop
      // 11a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11d: bipush 0
      // 11e: swap
      // 11f: aastore
      // 120: ldc2_w 9033674010003507164
      // 123: lload 3
      // 124: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: ifle 16c
      // 12c: goto 139
      // 12f: ldc2_w 8701399476785791343
      // 132: lload 3
      // 133: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: aload 13
      // 13b: aload 17
      // 13d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 142: pop
      // 143: iload 11
      // 145: ifeq 16c
      // 148: goto 155
      // 14b: ldc2_w 8701399476785791343
      // 14e: lload 3
      // 14f: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: athrow
      // 155: aload 13
      // 157: aload 17
      // 159: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 15e: pop
      // 15f: goto 16c
      // 162: ldc2_w 8701399476785791343
      // 165: lload 3
      // 166: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: iinc 16 1
      // 16f: iload 11
      // 171: ifeq 07a
      // 174: lload 3
      // 175: lconst_0
      // 176: lcmp
      // 177: ifle 1bc
      // 17a: lload 3
      // 17b: lconst_0
      // 17c: lcmp
      // 17d: iflt 1af
      // 180: aload 13
      // 182: invokeinterface java/util/List.size ()I 1
      // 187: aload 0
      // 188: getfield com/zelix/ig.F I
      // 18b: if_icmpge 1bc
      // 18e: aload 0
      // 18f: aload 13
      // 191: aload 13
      // 193: invokeinterface java/util/List.size ()I 1
      // 198: anewarray 442
      // 19b: invokeinterface java/util/List.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1a0: checkcast [Lcom/zelix/h4;
      // 1a3: putfield com/zelix/ig.J [Lcom/zelix/h4;
      // 1a6: aload 0
      // 1a7: aload 0
      // 1a8: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 1ab: arraylength
      // 1ac: putfield com/zelix/ig.F I
      // 1af: goto 1bc
      // 1b2: ldc2_w 8701399476785791343
      // 1b5: lload 3
      // 1b6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: athrow
      // 1bc: return
   }

   public _op x(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = b ^ var2;
      return x44.a<"i">(this, 4891520320365273967L, var2);
   }

   public xl K(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 27945599892988
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -288825136453399657
      // 1e: lload 2
      // 1f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifeq 4e
      // 2c: getfield com/zelix/ig.H I
      // 2f: bipush -1
      // 30: if_icmpeq 75
      // 33: goto 40
      // 36: ldc2_w -453534307012657126
      // 39: lload 2
      // 3a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: goto 4e
      // 44: ldc2_w -453534307012657126
      // 47: lload 2
      // 48: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 51: aload 0
      // 52: getfield com/zelix/ig.H I
      // 55: aaload
      // 56: checkcast com/zelix/h_
      // 59: checkcast com/zelix/h_
      // 5c: lload 4
      // 5e: bipush 1
      // 5f: anewarray 46
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -425454417558984911
      // 6e: lload 2
      // 6f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/xl; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: areturn
      // 75: aconst_null
      // 76: areturn
   }

   void c8(Object[] param1) {
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/ig.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 42717655331866
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w 8433731234300051790
      // 25: lload 3
      // 26: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: iload 7
      // 30: ifne 55
      // 33: getfield com/zelix/ig.H I
      // 36: bipush -1
      // 37: if_icmpeq 81
      // 3a: goto 47
      // 3d: ldc2_w 7652906906376229786
      // 40: lload 3
      // 41: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: goto 55
      // 4b: ldc2_w 7652906906376229786
      // 4e: lload 3
      // 4f: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 58: aload 0
      // 59: getfield com/zelix/ig.H I
      // 5c: aaload
      // 5d: checkcast com/zelix/h_
      // 60: checkcast com/zelix/h_
      // 63: aload 2
      // 64: lload 5
      // 66: bipush 2
      // 67: anewarray 46
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x1
      // 74: swap
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w 8543021268112307829
      // 7b: lload 3
      // 7c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: return
   }

   void ES(Object[] param1) {
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
      // 04: checkcast com/zelix/ax
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast com/zelix/ax
      // 0e: astore 6
      // 10: dup
      // 11: bipush 2
      // 12: aaload
      // 13: checkcast com/zelix/ax
      // 16: astore 3
      // 17: dup
      // 18: bipush 3
      // 19: aaload
      // 1a: checkcast java/lang/Long
      // 1d: invokevirtual java/lang/Long.longValue ()J
      // 20: lstore 4
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast com/zelix/_uo
      // 28: astore 7
      // 2a: pop
      // 2b: getstatic com/zelix/ig.b J
      // 2e: lload 4
      // 30: lxor
      // 31: lstore 4
      // 33: lload 4
      // 35: dup2
      // 36: ldc2_w 10696113354378
      // 39: lxor
      // 3a: lstore 8
      // 3c: pop2
      // 3d: ldc2_w -4237912197831397013
      // 40: lload 4
      // 42: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: istore 10
      // 49: aload 0
      // 4a: iload 10
      // 4c: ifne 73
      // 4f: getfield com/zelix/ig.H I
      // 52: bipush -1
      // 53: if_icmpeq b4
      // 56: goto 64
      // 59: ldc2_w -2733158478455184449
      // 5c: lload 4
      // 5e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: aload 0
      // 65: goto 73
      // 68: ldc2_w -2733158478455184449
      // 6b: lload 4
      // 6d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 76: aload 0
      // 77: getfield com/zelix/ig.H I
      // 7a: aaload
      // 7b: checkcast com/zelix/h_
      // 7e: checkcast com/zelix/h_
      // 81: aload 2
      // 82: aload 6
      // 84: lload 8
      // 86: aload 3
      // 87: aload 7
      // 89: bipush 5
      // 8a: anewarray 46
      // 8d: dup_x1
      // 8e: swap
      // 8f: bipush 4
      // 90: swap
      // 91: aastore
      // 92: dup_x1
      // 93: swap
      // 94: bipush 3
      // 95: swap
      // 96: aastore
      // 97: dup_x2
      // 98: dup_x2
      // 99: pop
      // 9a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9d: bipush 2
      // 9e: swap
      // 9f: aastore
      // a0: dup_x1
      // a1: swap
      // a2: bipush 1
      // a3: swap
      // a4: aastore
      // a5: dup_x1
      // a6: swap
      // a7: bipush 0
      // a8: swap
      // a9: aastore
      // aa: ldc2_w -2724110966765818814
      // ad: lload 4
      // af: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b4: return
   }

   void n(Object[] param1) {
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
      // 0e: ldc2_w 0
      // 11: lxor
      // 12: lstore 4
      // 14: dup2
      // 15: ldc2_w 299602313055
      // 18: lxor
      // 19: lstore 6
      // 1b: pop2
      // 1c: ldc2_w 1432852175645516680
      // 1f: lload 2
      // 20: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: aload 0
      // 26: getfield com/zelix/ig.F I
      // 29: istore 9
      // 2b: istore 8
      // 2d: aload 0
      // 2e: iload 8
      // 30: ifeq 69
      // 33: lload 4
      // 35: bipush 1
      // 36: anewarray 46
      // 39: dup_x2
      // 3a: dup_x2
      // 3b: pop
      // 3c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f: bipush 0
      // 40: swap
      // 41: aastore
      // 42: invokespecial com/zelix/iu.n ([Ljava/lang/Object;)V
      // 45: iload 9
      // 47: aload 0
      // 48: getfield com/zelix/ig.F I
      // 4b: if_icmpeq 81
      // 4e: goto 5b
      // 51: ldc2_w 1273349452556150789
      // 54: lload 2
      // 55: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 69
      // 5f: ldc2_w 1273349452556150789
      // 62: lload 2
      // 63: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: lload 6
      // 6b: bipush 1
      // 6c: anewarray 46
      // 6f: dup_x2
      // 70: dup_x2
      // 71: pop
      // 72: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w 1521205862235245390
      // 7b: lload 2
      // 7c: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: return
   }

   void cm(Object[] param1) {
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/ig.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 95959046647463
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -810957638542311174
      // 25: lload 3
      // 26: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: iload 7
      // 30: ifne 55
      // 33: getfield com/zelix/ig.H I
      // 36: bipush -1
      // 37: if_icmpeq 81
      // 3a: goto 47
      // 3d: ldc2_w -1476950036139355602
      // 40: lload 3
      // 41: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: goto 55
      // 4b: ldc2_w -1476950036139355602
      // 4e: lload 3
      // 4f: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 58: aload 0
      // 59: getfield com/zelix/ig.H I
      // 5c: aaload
      // 5d: checkcast com/zelix/h_
      // 60: checkcast com/zelix/h_
      // 63: aload 2
      // 64: lload 5
      // 66: bipush 2
      // 67: anewarray 46
      // 6a: dup_x2
      // 6b: dup_x2
      // 6c: pop
      // 6d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 70: bipush 1
      // 71: swap
      // 72: aastore
      // 73: dup_x1
      // 74: swap
      // 75: bipush 0
      // 76: swap
      // 77: aastore
      // 78: ldc2_w -1106851485436429379
      // 7b: lload 3
      // 7c: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 81: return
   }

   void Es(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 10901952695411
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w 8632718763783833511
      // 1e: lload 2
      // 1f: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifeq 4e
      // 2c: getfield com/zelix/ig.H I
      // 2f: bipush -1
      // 30: if_icmpeq 74
      // 33: goto 40
      // 36: ldc2_w 8468113207777315882
      // 39: lload 2
      // 3a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: goto 4e
      // 44: ldc2_w 8468113207777315882
      // 47: lload 2
      // 48: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 51: aload 0
      // 52: getfield com/zelix/ig.H I
      // 55: aaload
      // 56: checkcast com/zelix/h_
      // 59: checkcast com/zelix/h_
      // 5c: lload 4
      // 5e: bipush 1
      // 5f: anewarray 46
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w 7997829941703698748
      // 6e: lload 2
      // 6f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: return
   }

   public boolean P(Object[] param1) {
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
      // 0a: istore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Integer
      // 11: invokevirtual java/lang/Integer.intValue ()I
      // 14: istore 3
      // 15: dup
      // 16: bipush 2
      // 17: aaload
      // 18: checkcast java/lang/Integer
      // 1b: invokevirtual java/lang/Integer.intValue ()I
      // 1e: istore 5
      // 20: dup
      // 21: bipush 3
      // 22: aaload
      // 23: checkcast java/lang/Integer
      // 26: invokevirtual java/lang/Integer.intValue ()I
      // 29: istore 4
      // 2b: pop
      // 2c: iload 2
      // 2d: i2l
      // 2e: bipush 32
      // 30: lshl
      // 31: iload 3
      // 32: i2l
      // 33: bipush 40
      // 35: lshl
      // 36: bipush 32
      // 38: lushr
      // 39: lor
      // 3a: iload 5
      // 3c: i2l
      // 3d: bipush 56
      // 3f: lshl
      // 40: bipush 56
      // 42: lushr
      // 43: lor
      // 44: getstatic com/zelix/ig.b J
      // 47: lxor
      // 48: lstore 6
      // 4a: lload 6
      // 4c: dup2
      // 4d: ldc2_w 104986211360278
      // 50: lxor
      // 51: lstore 8
      // 53: pop2
      // 54: ldc2_w 6001760441989555982
      // 57: lload 6
      // 59: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5e: istore 10
      // 60: aload 0
      // 61: getfield com/zelix/ig.H I
      // 64: iload 10
      // 66: ifne ba
      // 69: bipush -1
      // 6a: if_icmpeq b9
      // 6d: goto 7b
      // 70: ldc2_w 5509238000617616858
      // 73: lload 6
      // 75: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 0
      // 7c: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 7f: aload 0
      // 80: getfield com/zelix/ig.H I
      // 83: aaload
      // 84: checkcast com/zelix/h_
      // 87: checkcast com/zelix/h_
      // 8a: lload 8
      // 8c: iload 4
      // 8e: bipush 2
      // 8f: anewarray 46
      // 92: dup_x1
      // 93: swap
      // 94: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 97: bipush 1
      // 98: swap
      // 99: aastore
      // 9a: dup_x2
      // 9b: dup_x2
      // 9c: pop
      // 9d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a0: bipush 0
      // a1: swap
      // a2: aastore
      // a3: ldc2_w 5497299219768732778
      // a6: lload 6
      // a8: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: ireturn
      // ae: ldc2_w 5509238000617616858
      // b1: lload 6
      // b3: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: athrow
      // b9: bipush 0
      // ba: ireturn
   }

   int n(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 109239224650545
      // 17: lxor
      // 18: dup2
      // 19: bipush 32
      // 1b: lushr
      // 1c: l2i
      // 1d: istore 4
      // 1f: dup2
      // 20: bipush 32
      // 22: lshl
      // 23: bipush 32
      // 25: lushr
      // 26: lstore 5
      // 28: pop2
      // 29: pop2
      // 2a: ldc2_w -4141360864099110206
      // 2d: lload 2
      // 2e: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: istore 7
      // 35: aload 0
      // 36: getfield com/zelix/ig.H I
      // 39: iload 7
      // 3b: ifne 8c
      // 3e: bipush -1
      // 3f: if_icmpeq 8b
      // 42: goto 4f
      // 45: ldc2_w -2758215442990833642
      // 48: lload 2
      // 49: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 53: aload 0
      // 54: getfield com/zelix/ig.H I
      // 57: aaload
      // 58: checkcast com/zelix/h_
      // 5b: checkcast com/zelix/h_
      // 5e: iload 4
      // 60: lload 5
      // 62: bipush 2
      // 63: anewarray 46
      // 66: dup_x2
      // 67: dup_x2
      // 68: pop
      // 69: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c: bipush 1
      // 6d: swap
      // 6e: aastore
      // 6f: dup_x1
      // 70: swap
      // 71: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 74: bipush 0
      // 75: swap
      // 76: aastore
      // 77: ldc2_w -2622533095845148679
      // 7a: lload 2
      // 7b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: ireturn
      // 81: ldc2_w -2758215442990833642
      // 84: lload 2
      // 85: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: athrow
      // 8b: bipush -1
      // 8c: ireturn
   }

   void hM(Object[] param1) {
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
      // 04: checkcast com/zelix/vl
      // 07: astore 9
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/Set
      // 0f: astore 6
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 4
      // 1c: dup
      // 1d: bipush 3
      // 1e: aaload
      // 1f: checkcast com/zelix/_u_
      // 22: astore 7
      // 24: dup
      // 25: bipush 4
      // 26: aaload
      // 27: checkcast java/lang/Boolean
      // 2a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2d: istore 3
      // 2e: dup
      // 2f: bipush 5
      // 30: aaload
      // 31: checkcast java/util/List
      // 34: astore 8
      // 36: dup
      // 37: bipush 6
      // 39: aaload
      // 3a: checkcast com/zelix/_8c
      // 3d: astore 2
      // 3e: pop
      // 3f: getstatic com/zelix/ig.b J
      // 42: lload 4
      // 44: lxor
      // 45: lstore 4
      // 47: lload 4
      // 49: dup2
      // 4a: ldc2_w 28679499753656
      // 4d: lxor
      // 4e: lstore 10
      // 50: pop2
      // 51: ldc2_w 9098866688845105665
      // 54: lload 4
      // 56: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: istore 12
      // 5d: aload 0
      // 5e: iload 12
      // 60: ifne 87
      // 63: getfield com/zelix/ig.H I
      // 66: bipush -1
      // 67: if_icmpeq e2
      // 6a: goto 78
      // 6d: ldc2_w 7024380241218722005
      // 70: lload 4
      // 72: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: athrow
      // 78: aload 0
      // 79: goto 87
      // 7c: ldc2_w 7024380241218722005
      // 7f: lload 4
      // 81: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 8a: aload 0
      // 8b: getfield com/zelix/ig.H I
      // 8e: aaload
      // 8f: checkcast com/zelix/h_
      // 92: checkcast com/zelix/h_
      // 95: aload 9
      // 97: aload 0
      // 98: aload 6
      // 9a: aload 7
      // 9c: lload 10
      // 9e: iload 3
      // 9f: aload 8
      // a1: aload 2
      // a2: bipush 8
      // a4: anewarray 46
      // a7: dup_x1
      // a8: swap
      // a9: bipush 7
      // ab: swap
      // ac: aastore
      // ad: dup_x1
      // ae: swap
      // af: bipush 6
      // b1: swap
      // b2: aastore
      // b3: dup_x1
      // b4: swap
      // b5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // b8: bipush 5
      // b9: swap
      // ba: aastore
      // bb: dup_x2
      // bc: dup_x2
      // bd: pop
      // be: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c1: bipush 4
      // c2: swap
      // c3: aastore
      // c4: dup_x1
      // c5: swap
      // c6: bipush 3
      // c7: swap
      // c8: aastore
      // c9: dup_x1
      // ca: swap
      // cb: bipush 2
      // cc: swap
      // cd: aastore
      // ce: dup_x1
      // cf: swap
      // d0: bipush 1
      // d1: swap
      // d2: aastore
      // d3: dup_x1
      // d4: swap
      // d5: bipush 0
      // d6: swap
      // d7: aastore
      // d8: ldc2_w 6950534123078950774
      // db: lload 4
      // dd: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: return
   }

   public void GB(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Integer
      // 011: invokevirtual java/lang/Integer.intValue ()I
      // 014: istore 4
      // 016: pop
      // 017: getstatic com/zelix/ig.b J
      // 01a: lload 2
      // 01b: lxor
      // 01c: lstore 2
      // 01d: lload 2
      // 01e: dup2
      // 01f: ldc2_w 114234763910777
      // 022: lxor
      // 023: lstore 5
      // 025: dup2
      // 026: ldc2_w 48412743310119
      // 029: lxor
      // 02a: lstore 7
      // 02c: dup2
      // 02d: ldc2_w 113325238608598
      // 030: lxor
      // 031: lstore 9
      // 033: dup2
      // 034: ldc2_w 61980277018247
      // 037: lxor
      // 038: lstore 11
      // 03a: dup2
      // 03b: ldc2_w 51357476480648
      // 03e: lxor
      // 03f: lstore 13
      // 041: dup2
      // 042: ldc2_w 112108003679018
      // 045: lxor
      // 046: lstore 15
      // 048: dup2
      // 049: ldc2_w 126828006247122
      // 04c: lxor
      // 04d: lstore 17
      // 04f: dup2
      // 050: ldc2_w 49872655486336
      // 053: lxor
      // 054: lstore 19
      // 056: dup2
      // 057: ldc2_w 135065899695592
      // 05a: lxor
      // 05b: lstore 21
      // 05d: dup2
      // 05e: ldc2_w 69481848401147
      // 061: lxor
      // 062: lstore 23
      // 064: pop2
      // 065: ldc2_w -8348946307512616858
      // 068: lload 2
      // 069: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06e: istore 25
      // 070: iload 4
      // 072: bipush 1
      // 073: if_icmpne 391
      // 076: new java/util/ArrayList
      // 079: dup
      // 07a: aload 0
      // 07b: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 07e: arraylength
      // 07f: invokespecial java/util/ArrayList.<init> (I)V
      // 082: astore 26
      // 084: bipush 0
      // 085: istore 27
      // 087: iload 27
      // 089: aload 0
      // 08a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 08d: arraylength
      // 08e: if_icmpge 21c
      // 091: aload 0
      // 092: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 095: iload 27
      // 097: aaload
      // 098: instanceof com/zelix/b6
      // 09b: iload 25
      // 09d: lload 2
      // 09e: lconst_0
      // 09f: lcmp
      // 0a0: iflt 229
      // 0a3: ifne 227
      // 0a6: iload 25
      // 0a8: lload 2
      // 0a9: lconst_0
      // 0aa: lcmp
      // 0ab: iflt 0ed
      // 0ae: ifne 0eb
      // 0b1: goto 0be
      // 0b4: ldc2_w -7846218303700424014
      // 0b7: lload 2
      // 0b8: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: lload 2
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: iflt 219
      // 0c4: ifne 214
      // 0c7: goto 0d4
      // 0ca: ldc2_w -7846218303700424014
      // 0cd: lload 2
      // 0ce: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0d8: iload 27
      // 0da: aaload
      // 0db: instanceof com/zelix/hw
      // 0de: goto 0eb
      // 0e1: ldc2_w -7846218303700424014
      // 0e4: lload 2
      // 0e5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: iload 25
      // 0ed: lload 2
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 118
      // 0f3: ifne 116
      // 0f6: ifeq 10c
      // 0f9: goto 106
      // 0fc: ldc2_w -7846218303700424014
      // 0ff: lload 2
      // 100: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: lload 2
      // 107: lconst_0
      // 108: lcmp
      // 109: ifgt 214
      // 10c: aload 0
      // 10d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 110: iload 27
      // 112: aaload
      // 113: instanceof com/zelix/by
      // 116: iload 25
      // 118: lload 2
      // 119: lconst_0
      // 11a: lcmp
      // 11b: ifle 1c5
      // 11e: ifne 1c3
      // 121: ifeq 1ac
      // 124: goto 131
      // 127: ldc2_w -7846218303700424014
      // 12a: lload 2
      // 12b: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: athrow
      // 131: aload 0
      // 132: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 135: iload 27
      // 137: aaload
      // 138: checkcast com/zelix/by
      // 13b: astore 28
      // 13d: aload 28
      // 13f: lload 5
      // 141: bipush 1
      // 142: anewarray 46
      // 145: dup_x2
      // 146: dup_x2
      // 147: pop
      // 148: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14b: bipush 0
      // 14c: swap
      // 14d: aastore
      // 14e: ldc2_w -8388427721430890234
      // 151: lload 2
      // 152: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 157: pop
      // 158: aload 28
      // 15a: lload 9
      // 15c: bipush 1
      // 15d: anewarray 46
      // 160: dup_x2
      // 161: dup_x2
      // 162: pop
      // 163: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 166: bipush 0
      // 167: swap
      // 168: aastore
      // 169: ldc2_w -8257734274827067600
      // 16c: lload 2
      // 16d: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: iload 25
      // 174: ifne 1a0
      // 177: ifne 1a1
      // 17a: goto 187
      // 17d: ldc2_w -7846218303700424014
      // 180: lload 2
      // 181: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: aload 26
      // 189: aload 0
      // 18a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 18d: iload 27
      // 18f: aaload
      // 190: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 193: goto 1a0
      // 196: ldc2_w -7846218303700424014
      // 199: lload 2
      // 19a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: athrow
      // 1a0: pop
      // 1a1: iload 25
      // 1a3: lload 2
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: iflt 219
      // 1a9: ifeq 214
      // 1ac: aload 0
      // 1ad: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 1b0: iload 27
      // 1b2: aaload
      // 1b3: instanceof com/zelix/h_
      // 1b6: goto 1c3
      // 1b9: ldc2_w -7846218303700424014
      // 1bc: lload 2
      // 1bd: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: iload 25
      // 1c5: ifne 213
      // 1c8: ifeq 207
      // 1cb: goto 1d8
      // 1ce: ldc2_w -7846218303700424014
      // 1d1: lload 2
      // 1d2: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 1dc: iload 27
      // 1de: aaload
      // 1df: checkcast com/zelix/h_
      // 1e2: lload 17
      // 1e4: bipush 1
      // 1e5: anewarray 46
      // 1e8: dup_x2
      // 1e9: dup_x2
      // 1ea: pop
      // 1eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ee: bipush 0
      // 1ef: swap
      // 1f0: aastore
      // 1f1: ldc2_w -8529163895932847885
      // 1f4: lload 2
      // 1f5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: goto 207
      // 1fd: ldc2_w -7846218303700424014
      // 200: lload 2
      // 201: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 206: athrow
      // 207: aload 26
      // 209: aload 0
      // 20a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 20d: iload 27
      // 20f: aaload
      // 210: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 213: pop
      // 214: iinc 27 1
      // 217: iload 25
      // 219: ifeq 087
      // 21c: aload 26
      // 21e: lload 2
      // 21f: lconst_0
      // 220: lcmp
      // 221: iflt 249
      // 224: invokevirtual java/util/ArrayList.size ()I
      // 227: iload 25
      // 229: lload 2
      // 22a: lconst_0
      // 22b: lcmp
      // 22c: ifle 29c
      // 22f: ifne 29a
      // 232: aload 0
      // 233: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 236: arraylength
      // 237: if_icmpge 281
      // 23a: goto 247
      // 23d: ldc2_w -7846218303700424014
      // 240: lload 2
      // 241: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: aload 26
      // 249: invokevirtual java/util/ArrayList.size ()I
      // 24c: anewarray 442
      // 24f: astore 27
      // 251: aload 0
      // 252: aload 26
      // 254: aload 27
      // 256: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 259: checkcast [Lcom/zelix/h4;
      // 25c: putfield com/zelix/ig.J [Lcom/zelix/h4;
      // 25f: aload 0
      // 260: aload 0
      // 261: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 264: arraylength
      // 265: putfield com/zelix/ig.F I
      // 268: aload 0
      // 269: lload 21
      // 26b: bipush 1
      // 26c: anewarray 46
      // 26f: dup_x2
      // 270: dup_x2
      // 271: pop
      // 272: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 275: bipush 0
      // 276: swap
      // 277: aastore
      // 278: ldc2_w -7517895092455175687
      // 27b: lload 2
      // 27c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 281: aload 0
      // 282: lload 23
      // 284: bipush 1
      // 285: anewarray 46
      // 288: dup_x2
      // 289: dup_x2
      // 28a: pop
      // 28b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28e: bipush 0
      // 28f: swap
      // 290: aastore
      // 291: ldc2_w -7570582546190274512
      // 294: lload 2
      // 295: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: iload 25
      // 29c: ifne 36c
      // 29f: ifeq 33b
      // 2a2: goto 2af
      // 2a5: ldc2_w -7846218303700424014
      // 2a8: lload 2
      // 2a9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: lload 7
      // 2b2: bipush 0
      // 2b3: bipush 2
      // 2b4: anewarray 46
      // 2b7: dup_x1
      // 2b8: swap
      // 2b9: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2bc: bipush 1
      // 2bd: swap
      // 2be: aastore
      // 2bf: dup_x2
      // 2c0: dup_x2
      // 2c1: pop
      // 2c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c5: bipush 0
      // 2c6: swap
      // 2c7: aastore
      // 2c8: ldc2_w -7771558678094558633
      // 2cb: lload 2
      // 2cc: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: aload 0
      // 2d2: lload 13
      // 2d4: bipush 1
      // 2d5: anewarray 46
      // 2d8: dup_x2
      // 2d9: dup_x2
      // 2da: pop
      // 2db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2de: bipush 0
      // 2df: swap
      // 2e0: aastore
      // 2e1: ldc2_w -7756453116108207456
      // 2e4: lload 2
      // 2e5: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ea: iload 25
      // 2ec: ifne 36c
      // 2ef: goto 2fc
      // 2f2: ldc2_w -7846218303700424014
      // 2f5: lload 2
      // 2f6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fb: athrow
      // 2fc: ifeq 33b
      // 2ff: goto 30c
      // 302: ldc2_w -7846218303700424014
      // 305: lload 2
      // 306: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: athrow
      // 30c: aload 0
      // 30d: bipush 0
      // 30e: lload 11
      // 310: bipush 2
      // 311: anewarray 46
      // 314: dup_x2
      // 315: dup_x2
      // 316: pop
      // 317: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31a: bipush 1
      // 31b: swap
      // 31c: aastore
      // 31d: dup_x1
      // 31e: swap
      // 31f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 322: bipush 0
      // 323: swap
      // 324: aastore
      // 325: ldc2_w -8290083321712920486
      // 328: lload 2
      // 329: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32e: goto 33b
      // 331: ldc2_w -7846218303700424014
      // 334: lload 2
      // 335: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: athrow
      // 33b: aload 0
      // 33c: iload 25
      // 33e: lload 2
      // 33f: lconst_0
      // 340: lcmp
      // 341: ifle 371
      // 344: ifne 370
      // 347: lload 19
      // 349: bipush 1
      // 34a: anewarray 46
      // 34d: dup_x2
      // 34e: dup_x2
      // 34f: pop
      // 350: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 353: bipush 0
      // 354: swap
      // 355: aastore
      // 356: ldc2_w -8276683313484298481
      // 359: lload 2
      // 35a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: goto 36c
      // 362: ldc2_w -7846218303700424014
      // 365: lload 2
      // 366: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36b: athrow
      // 36c: ifeq 391
      // 36f: aload 0
      // 370: bipush 0
      // 371: lload 15
      // 373: bipush 2
      // 374: anewarray 46
      // 377: dup_x2
      // 378: dup_x2
      // 379: pop
      // 37a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37d: bipush 1
      // 37e: swap
      // 37f: aastore
      // 380: dup_x1
      // 381: swap
      // 382: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 385: bipush 0
      // 386: swap
      // 387: aastore
      // 388: ldc2_w -8183929407658254793
      // 38b: lload 2
      // 38c: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 391: return
   }

   void cP(Object[] param1) {
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
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/ig.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 53597193955910
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w -4552063005799944007
      // 26: lload 2
      // 27: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 7
      // 2e: aload 0
      // 2f: iload 7
      // 31: ifeq 56
      // 34: getfield com/zelix/ig.H I
      // 37: bipush -1
      // 38: if_icmpeq 83
      // 3b: goto 48
      // 3e: ldc2_w -4424072833505952972
      // 41: lload 2
      // 42: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: goto 56
      // 4c: ldc2_w -4424072833505952972
      // 4f: lload 2
      // 50: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 59: aload 0
      // 5a: getfield com/zelix/ig.H I
      // 5d: aaload
      // 5e: checkcast com/zelix/h_
      // 61: checkcast com/zelix/h_
      // 64: aload 4
      // 66: lload 5
      // 68: bipush 2
      // 69: anewarray 46
      // 6c: dup_x2
      // 6d: dup_x2
      // 6e: pop
      // 6f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 72: bipush 1
      // 73: swap
      // 74: aastore
      // 75: dup_x1
      // 76: swap
      // 77: bipush 0
      // 78: swap
      // 79: aastore
      // 7a: ldc2_w -2787010864038668955
      // 7d: lload 2
      // 7e: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: return
   }

   public final void a(Object[] param1) {
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
      // 004: checkcast com/zelix/_ue
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/qr
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 6
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_ur
      // 021: astore 5
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/io/PrintWriter
      // 029: astore 3
      // 02a: pop
      // 02b: lload 6
      // 02d: dup2
      // 02e: ldc2_w 103399510275995
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 0
      // 038: lxor
      // 039: lstore 10
      // 03b: dup2
      // 03c: ldc2_w 94913469230316
      // 03f: lxor
      // 040: lstore 12
      // 042: dup2
      // 043: ldc2_w 74545591216293
      // 046: lxor
      // 047: lstore 14
      // 049: pop2
      // 04a: ldc2_w -8928174055816383374
      // 04d: lload 6
      // 04f: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 054: aload 0
      // 055: aload 4
      // 057: aload 2
      // 058: lload 10
      // 05a: aload 5
      // 05c: aload 3
      // 05d: bipush 5
      // 05e: anewarray 46
      // 061: dup_x1
      // 062: swap
      // 063: bipush 4
      // 064: swap
      // 065: aastore
      // 066: dup_x1
      // 067: swap
      // 068: bipush 3
      // 069: swap
      // 06a: aastore
      // 06b: dup_x2
      // 06c: dup_x2
      // 06d: pop
      // 06e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 071: bipush 2
      // 072: swap
      // 073: aastore
      // 074: dup_x1
      // 075: swap
      // 076: bipush 1
      // 077: swap
      // 078: aastore
      // 079: dup_x1
      // 07a: swap
      // 07b: bipush 0
      // 07c: swap
      // 07d: aastore
      // 07e: invokespecial com/zelix/iu.a ([Ljava/lang/Object;)V
      // 081: istore 16
      // 083: aload 2
      // 084: ldc2_w -7382402077763486820
      // 087: lload 6
      // 089: invokedynamic m (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: iload 16
      // 090: ifeq 0b6
      // 093: ifeq 2db
      // 096: goto 0a4
      // 099: ldc2_w -8768056450182823937
      // 09c: lload 6
      // 09e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: getfield com/zelix/ig.d I
      // 0a8: goto 0b6
      // 0ab: ldc2_w -8768056450182823937
      // 0ae: lload 6
      // 0b0: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: iload 16
      // 0b8: lload 6
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: ifle 0c3
      // 0bf: ifeq 0e3
      // 0c2: bipush -1
      // 0c3: if_icmpeq 2db
      // 0c6: goto 0d4
      // 0c9: ldc2_w -8768056450182823937
      // 0cc: lload 6
      // 0ce: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: bipush 0
      // 0d5: goto 0e3
      // 0d8: ldc2_w -8768056450182823937
      // 0db: lload 6
      // 0dd: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: istore 17
      // 0e5: iload 17
      // 0e7: aload 0
      // 0e8: getfield com/zelix/ig.F I
      // 0eb: if_icmpge 169
      // 0ee: iload 16
      // 0f0: lload 6
      // 0f2: lconst_0
      // 0f3: lcmp
      // 0f4: iflt 104
      // 0f7: ifeq 2db
      // 0fa: aload 0
      // 0fb: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0fe: iload 17
      // 100: aaload
      // 101: instanceof com/zelix/by
      // 104: iload 16
      // 106: ifeq 160
      // 109: goto 117
      // 10c: ldc2_w -8768056450182823937
      // 10f: lload 6
      // 111: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: lload 6
      // 119: lconst_0
      // 11a: lcmp
      // 11b: iflt 166
      // 11e: ifeq 161
      // 121: goto 12f
      // 124: ldc2_w -8768056450182823937
      // 127: lload 6
      // 129: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: aload 0
      // 130: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 133: iload 17
      // 135: aaload
      // 136: checkcast com/zelix/by
      // 139: lload 12
      // 13b: bipush 1
      // 13c: anewarray 46
      // 13f: dup_x2
      // 140: dup_x2
      // 141: pop
      // 142: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 145: bipush 0
      // 146: swap
      // 147: aastore
      // 148: ldc2_w -7231918179727079247
      // 14b: lload 6
      // 14d: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 152: goto 160
      // 155: ldc2_w -8768056450182823937
      // 158: lload 6
      // 15a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: pop
      // 161: iinc 17 1
      // 164: iload 16
      // 166: ifne 0e5
      // 169: new java/util/ArrayList
      // 16c: dup
      // 16d: invokespecial java/util/ArrayList.<init> ()V
      // 170: astore 17
      // 172: aload 0
      // 173: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 176: astore 18
      // 178: aload 18
      // 17a: arraylength
      // 17b: istore 19
      // 17d: lload 6
      // 17f: lconst_0
      // 180: lcmp
      // 181: ifle 2db
      // 184: bipush 0
      // 185: istore 20
      // 187: iload 20
      // 189: iload 19
      // 18b: if_icmpge 283
      // 18e: aload 18
      // 190: iload 20
      // 192: aaload
      // 193: astore 21
      // 195: aload 21
      // 197: instanceof com/zelix/hb
      // 19a: iload 16
      // 19c: lload 6
      // 19e: lconst_0
      // 19f: lcmp
      // 1a0: ifle 293
      // 1a3: ifeq 28f
      // 1a6: iload 16
      // 1a8: lload 6
      // 1aa: lconst_0
      // 1ab: lcmp
      // 1ac: iflt 1df
      // 1af: ifeq 1dd
      // 1b2: goto 1c0
      // 1b5: ldc2_w -8768056450182823937
      // 1b8: lload 6
      // 1ba: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: athrow
      // 1c0: ifeq 1d8
      // 1c3: goto 1d1
      // 1c6: ldc2_w -8768056450182823937
      // 1c9: lload 6
      // 1cb: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: lload 6
      // 1d3: lconst_0
      // 1d4: lcmp
      // 1d5: ifgt 27b
      // 1d8: aload 21
      // 1da: instanceof com/zelix/by
      // 1dd: iload 16
      // 1df: ifeq 27a
      // 1e2: ifeq 265
      // 1e5: goto 1f3
      // 1e8: ldc2_w -8768056450182823937
      // 1eb: lload 6
      // 1ed: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: aload 21
      // 1f5: checkcast com/zelix/by
      // 1f8: lload 8
      // 1fa: bipush 1
      // 1fb: anewarray 46
      // 1fe: dup_x2
      // 1ff: dup_x2
      // 200: pop
      // 201: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 204: bipush 0
      // 205: swap
      // 206: aastore
      // 207: ldc2_w -7481715421903697283
      // 20a: lload 6
      // 20c: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: lload 6
      // 213: lconst_0
      // 214: lcmp
      // 215: iflt 25b
      // 218: iload 16
      // 21a: ifeq 258
      // 21d: goto 22b
      // 220: ldc2_w -8768056450182823937
      // 223: lload 6
      // 225: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: athrow
      // 22b: lload 6
      // 22d: lconst_0
      // 22e: lcmp
      // 22f: iflt 280
      // 232: ifne 27b
      // 235: goto 243
      // 238: ldc2_w -8768056450182823937
      // 23b: lload 6
      // 23d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: athrow
      // 243: aload 17
      // 245: aload 21
      // 247: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 24a: goto 258
      // 24d: ldc2_w -8768056450182823937
      // 250: lload 6
      // 252: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 257: athrow
      // 258: pop
      // 259: iload 16
      // 25b: lload 6
      // 25d: lconst_0
      // 25e: lcmp
      // 25f: iflt 280
      // 262: ifne 27b
      // 265: aload 17
      // 267: aload 21
      // 269: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 26c: goto 27a
      // 26f: ldc2_w -8768056450182823937
      // 272: lload 6
      // 274: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 279: athrow
      // 27a: pop
      // 27b: iinc 20 1
      // 27e: iload 16
      // 280: ifne 187
      // 283: lload 6
      // 285: lconst_0
      // 286: lcmp
      // 287: ifle 2db
      // 28a: aload 17
      // 28c: invokevirtual java/util/ArrayList.size ()I
      // 28f: aload 0
      // 290: getfield com/zelix/ig.F I
      // 293: if_icmpge 2db
      // 296: aload 0
      // 297: aload 17
      // 299: aload 17
      // 29b: invokevirtual java/util/ArrayList.size ()I
      // 29e: anewarray 442
      // 2a1: invokevirtual java/util/ArrayList.toArray ([Ljava/lang/Object;)[Ljava/lang/Object;
      // 2a4: checkcast [Lcom/zelix/h4;
      // 2a7: putfield com/zelix/ig.J [Lcom/zelix/h4;
      // 2aa: aload 0
      // 2ab: aload 0
      // 2ac: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 2af: arraylength
      // 2b0: putfield com/zelix/ig.F I
      // 2b3: aload 0
      // 2b4: lload 14
      // 2b6: bipush 1
      // 2b7: anewarray 46
      // 2ba: dup_x2
      // 2bb: dup_x2
      // 2bc: pop
      // 2bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c0: bipush 0
      // 2c1: swap
      // 2c2: aastore
      // 2c3: ldc2_w -9014470163167339340
      // 2c6: lload 6
      // 2c8: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cd: goto 2db
      // 2d0: ldc2_w -8768056450182823937
      // 2d3: lload 6
      // 2d5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2da: athrow
      // 2db: return
   }

   int j(Object[] param1) {
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
      // 04: checkcast com/zelix/_og
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 3
      // 12: pop
      // 13: getstatic com/zelix/ig.b J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: lload 3
      // 1a: dup2
      // 1b: ldc2_w 51803730357189
      // 1e: lxor
      // 1f: lstore 5
      // 21: pop2
      // 22: ldc2_w -5019906924328023489
      // 25: lload 3
      // 26: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 7
      // 2d: aload 0
      // 2e: getfield com/zelix/ig.H I
      // 31: iload 7
      // 33: ifeq 80
      // 36: bipush -1
      // 37: if_icmpeq 7f
      // 3a: goto 47
      // 3d: ldc2_w -5180002837159706190
      // 40: lload 3
      // 41: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 4b: aload 0
      // 4c: getfield com/zelix/ig.H I
      // 4f: aaload
      // 50: checkcast com/zelix/h_
      // 53: checkcast com/zelix/h_
      // 56: aload 2
      // 57: lload 5
      // 59: bipush 2
      // 5a: anewarray 46
      // 5d: dup_x2
      // 5e: dup_x2
      // 5f: pop
      // 60: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63: bipush 1
      // 64: swap
      // 65: aastore
      // 66: dup_x1
      // 67: swap
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -6429905295303332245
      // 6e: lload 3
      // 6f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: ireturn
      // 75: ldc2_w -5180002837159706190
      // 78: lload 3
      // 79: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7e: athrow
      // 7f: bipush -1
      // 80: ireturn
   }

   public void PA(Object[] param1) {
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
      // 04: checkcast com/zelix/_xp
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 5
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/Integer
      // 19: invokevirtual java/lang/Integer.intValue ()I
      // 1c: istore 4
      // 1e: dup
      // 1f: bipush 3
      // 20: aaload
      // 21: checkcast java/lang/Integer
      // 24: invokevirtual java/lang/Integer.intValue ()I
      // 27: istore 3
      // 28: dup
      // 29: bipush 4
      // 2a: aaload
      // 2b: checkcast java/lang/String
      // 2e: astore 7
      // 30: pop
      // 31: getstatic com/zelix/ig.b J
      // 34: lload 5
      // 36: lxor
      // 37: lstore 5
      // 39: lload 5
      // 3b: dup2
      // 3c: ldc2_w 87551827465730
      // 3f: lxor
      // 40: lstore 8
      // 42: pop2
      // 43: ldc2_w 8218172881411850854
      // 46: lload 5
      // 48: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: istore 10
      // 4f: aload 0
      // 50: iload 10
      // 52: ifeq 79
      // 55: getfield com/zelix/ig.H I
      // 58: bipush -1
      // 59: if_icmpeq c0
      // 5c: goto 6a
      // 5f: ldc2_w 8090025495602547179
      // 62: lload 5
      // 64: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: aload 0
      // 6b: goto 79
      // 6e: ldc2_w 8090025495602547179
      // 71: lload 5
      // 73: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 7c: aload 0
      // 7d: getfield com/zelix/ig.H I
      // 80: aaload
      // 81: checkcast com/zelix/h_
      // 84: checkcast com/zelix/h_
      // 87: aload 2
      // 88: iload 4
      // 8a: iload 3
      // 8b: lload 8
      // 8d: aload 7
      // 8f: bipush 5
      // 90: anewarray 46
      // 93: dup_x1
      // 94: swap
      // 95: bipush 4
      // 96: swap
      // 97: aastore
      // 98: dup_x2
      // 99: dup_x2
      // 9a: pop
      // 9b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 9e: bipush 3
      // 9f: swap
      // a0: aastore
      // a1: dup_x1
      // a2: swap
      // a3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a6: bipush 2
      // a7: swap
      // a8: aastore
      // a9: dup_x1
      // aa: swap
      // ab: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ae: bipush 1
      // af: swap
      // b0: aastore
      // b1: dup_x1
      // b2: swap
      // b3: bipush 0
      // b4: swap
      // b5: aastore
      // b6: ldc2_w 8006592341277007110
      // b9: lload 5
      // bb: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: return
   }

   public h_ q(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: ldc2_w 6346660969979210839
      // 15: lload 2
      // 16: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: istore 4
      // 1d: aload 0
      // 1e: iload 4
      // 20: ifne 45
      // 23: getfield com/zelix/ig.H I
      // 26: bipush -1
      // 27: if_icmpeq 54
      // 2a: goto 37
      // 2d: ldc2_w 5129011813279628931
      // 30: lload 2
      // 31: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: athrow
      // 37: aload 0
      // 38: goto 45
      // 3b: ldc2_w 5129011813279628931
      // 3e: lload 2
      // 3f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44: athrow
      // 45: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 48: aload 0
      // 49: getfield com/zelix/ig.H I
      // 4c: aaload
      // 4d: checkcast com/zelix/h_
      // 50: checkcast com/zelix/h_
      // 53: areturn
      // 54: aconst_null
      // 55: areturn
   }

   final void c(Object[] param1) {
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
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast com/zelix/_yv
      // 011: astore 7
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/_ug
      // 019: astore 5
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/ei
      // 021: astore 4
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/_ur
      // 029: astore 6
      // 02b: pop
      // 02c: lload 2
      // 02d: dup2
      // 02e: ldc2_w 123357019300551
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 53851450394915
      // 038: lxor
      // 039: lstore 10
      // 03b: pop2
      // 03c: ldc2_w -3041923408606273140
      // 03f: lload 2
      // 040: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 045: bipush 0
      // 046: istore 13
      // 048: istore 12
      // 04a: iload 13
      // 04c: aload 0
      // 04d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 050: arraylength
      // 051: if_icmpge 154
      // 054: aload 0
      // 055: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 058: iload 13
      // 05a: aaload
      // 05b: instanceof com/zelix/_yl
      // 05e: lload 2
      // 05f: lconst_0
      // 060: lcmp
      // 061: iflt 0f8
      // 064: iload 12
      // 066: ifne 0f8
      // 069: ifeq 0cf
      // 06c: goto 079
      // 06f: ldc2_w -3821623890892688552
      // 072: lload 2
      // 073: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 0
      // 07a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 07d: iload 13
      // 07f: aaload
      // 080: checkcast com/zelix/_yl
      // 083: aload 7
      // 085: aload 5
      // 087: lload 10
      // 089: aload 4
      // 08b: aload 6
      // 08d: bipush 5
      // 08e: anewarray 46
      // 091: dup_x1
      // 092: swap
      // 093: bipush 4
      // 094: swap
      // 095: aastore
      // 096: dup_x1
      // 097: swap
      // 098: bipush 3
      // 099: swap
      // 09a: aastore
      // 09b: dup_x2
      // 09c: dup_x2
      // 09d: pop
      // 09e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a1: bipush 2
      // 0a2: swap
      // 0a3: aastore
      // 0a4: dup_x1
      // 0a5: swap
      // 0a6: bipush 1
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x1
      // 0aa: swap
      // 0ab: bipush 0
      // 0ac: swap
      // 0ad: aastore
      // 0ae: ldc2_w -3140728401025168562
      // 0b1: lload 2
      // 0b2: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: iload 12
      // 0b9: lload 2
      // 0ba: lconst_0
      // 0bb: lcmp
      // 0bc: iflt 151
      // 0bf: ifeq 14c
      // 0c2: goto 0cf
      // 0c5: ldc2_w -3821623890892688552
      // 0c8: lload 2
      // 0c9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0d3: iload 13
      // 0d5: aaload
      // 0d6: iload 12
      // 0d8: ifne 115
      // 0db: goto 0e8
      // 0de: ldc2_w -3821623890892688552
      // 0e1: lload 2
      // 0e2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: instanceof com/zelix/h_
      // 0eb: goto 0f8
      // 0ee: ldc2_w -3821623890892688552
      // 0f1: lload 2
      // 0f2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f7: athrow
      // 0f8: lload 2
      // 0f9: lconst_0
      // 0fa: lcmp
      // 0fb: ifle 151
      // 0fe: ifeq 14c
      // 101: aload 0
      // 102: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 105: iload 13
      // 107: aaload
      // 108: goto 115
      // 10b: ldc2_w -3821623890892688552
      // 10e: lload 2
      // 10f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: checkcast com/zelix/h_
      // 118: aload 7
      // 11a: aload 5
      // 11c: aload 4
      // 11e: lload 8
      // 120: aload 6
      // 122: bipush 5
      // 123: anewarray 46
      // 126: dup_x1
      // 127: swap
      // 128: bipush 4
      // 129: swap
      // 12a: aastore
      // 12b: dup_x2
      // 12c: dup_x2
      // 12d: pop
      // 12e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 131: bipush 3
      // 132: swap
      // 133: aastore
      // 134: dup_x1
      // 135: swap
      // 136: bipush 2
      // 137: swap
      // 138: aastore
      // 139: dup_x1
      // 13a: swap
      // 13b: bipush 1
      // 13c: swap
      // 13d: aastore
      // 13e: dup_x1
      // 13f: swap
      // 140: bipush 0
      // 141: swap
      // 142: aastore
      // 143: ldc2_w -3915066641814912192
      // 146: lload 2
      // 147: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: iinc 13 1
      // 14f: iload 12
      // 151: ifeq 04a
      // 154: lload 2
      // 155: lconst_0
      // 156: lcmp
      // 157: iflt 054
      // 15a: return
   }

   void J1(Object[] param1) {
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
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00a: istore 2
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 4
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Boolean
      // 01c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01f: istore 3
      // 020: pop
      // 021: getstatic com/zelix/ig.b J
      // 024: lload 4
      // 026: lxor
      // 027: lstore 4
      // 029: lload 4
      // 02b: dup2
      // 02c: ldc2_w 71603000483878
      // 02f: lxor
      // 030: lstore 6
      // 032: dup2
      // 033: ldc2_w 17864891346576
      // 036: lxor
      // 037: lstore 8
      // 039: dup2
      // 03a: ldc2_w 61103910731962
      // 03d: lxor
      // 03e: lstore 10
      // 040: dup2
      // 041: ldc2_w 78269244758028
      // 044: lxor
      // 045: lstore 12
      // 047: pop2
      // 048: ldc2_w -4731913583529850352
      // 04b: lload 4
      // 04d: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: bipush 0
      // 053: istore 15
      // 055: istore 14
      // 057: iload 15
      // 059: aload 0
      // 05a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 05d: arraylength
      // 05e: if_icmpge 1cb
      // 061: aload 0
      // 062: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 065: iload 15
      // 067: aaload
      // 068: instanceof com/zelix/bi
      // 06b: iload 14
      // 06d: lload 4
      // 06f: lconst_0
      // 070: lcmp
      // 071: ifle 08b
      // 074: ifne 089
      // 077: ifeq 1c3
      // 07a: goto 088
      // 07d: ldc2_w -6815377534667351868
      // 080: lload 4
      // 082: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: iload 2
      // 089: iload 14
      // 08b: ifne 12b
      // 08e: ifeq 11c
      // 091: goto 09f
      // 094: ldc2_w -6815377534667351868
      // 097: lload 4
      // 099: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: athrow
      // 09f: aload 0
      // 0a0: lload 10
      // 0a2: bipush 1
      // 0a3: anewarray 46
      // 0a6: dup_x2
      // 0a7: dup_x2
      // 0a8: pop
      // 0a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ac: bipush 0
      // 0ad: swap
      // 0ae: aastore
      // 0af: ldc2_w -6681873244569874442
      // 0b2: lload 4
      // 0b4: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: iload 14
      // 0bb: lload 4
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 12d
      // 0c2: ifne 12b
      // 0c5: goto 0d3
      // 0c8: ldc2_w -6815377534667351868
      // 0cb: lload 4
      // 0cd: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: lload 4
      // 0d5: lconst_0
      // 0d6: lcmp
      // 0d7: iflt 11d
      // 0da: ifne 11c
      // 0dd: goto 0eb
      // 0e0: ldc2_w -6815377534667351868
      // 0e3: lload 4
      // 0e5: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: iload 14
      // 0ee: ifne 1aa
      // 0f1: goto 0ff
      // 0f4: ldc2_w -6815377534667351868
      // 0f7: lload 4
      // 0f9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: lload 4
      // 101: lconst_0
      // 102: lcmp
      // 103: ifle 19c
      // 106: lload 6
      // 108: invokevirtual com/zelix/ig.t (J)Z
      // 10b: ifeq 19b
      // 10e: goto 11c
      // 111: ldc2_w -6815377534667351868
      // 114: lload 4
      // 116: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: athrow
      // 11c: iload 3
      // 11d: goto 12b
      // 120: ldc2_w -6815377534667351868
      // 123: lload 4
      // 125: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: iload 14
      // 12d: ifne 16f
      // 130: ifeq 1c3
      // 133: goto 141
      // 136: ldc2_w -6815377534667351868
      // 139: lload 4
      // 13b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: aload 0
      // 142: lload 4
      // 144: lconst_0
      // 145: lcmp
      // 146: ifle 176
      // 149: iload 14
      // 14b: ifne 176
      // 14e: goto 15c
      // 151: ldc2_w -6815377534667351868
      // 154: lload 4
      // 156: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: lload 12
      // 15e: invokevirtual com/zelix/ig.g (J)Z
      // 161: goto 16f
      // 164: ldc2_w -6815377534667351868
      // 167: lload 4
      // 169: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16e: athrow
      // 16f: ifne 175
      // 172: goto 1c3
      // 175: aload 0
      // 176: lload 8
      // 178: bipush 1
      // 179: anewarray 46
      // 17c: dup_x2
      // 17d: dup_x2
      // 17e: pop
      // 17f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 182: bipush 0
      // 183: swap
      // 184: aastore
      // 185: ldc2_w -6533462770049076980
      // 188: lload 4
      // 18a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: iload 14
      // 191: lload 4
      // 193: lconst_0
      // 194: lcmp
      // 195: ifle 1c8
      // 198: ifeq 1c3
      // 19b: aload 0
      // 19c: goto 1aa
      // 19f: ldc2_w -6815377534667351868
      // 1a2: lload 4
      // 1a4: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a9: athrow
      // 1aa: lload 8
      // 1ac: bipush 1
      // 1ad: anewarray 46
      // 1b0: dup_x2
      // 1b1: dup_x2
      // 1b2: pop
      // 1b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b6: bipush 0
      // 1b7: swap
      // 1b8: aastore
      // 1b9: ldc2_w -6533462770049076980
      // 1bc: lload 4
      // 1be: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c3: iinc 15 1
      // 1c6: iload 14
      // 1c8: ifeq 057
      // 1cb: lload 4
      // 1cd: lconst_0
      // 1ce: lcmp
      // 1cf: ifle 061
      // 1d2: return
   }

   void wF(Object[] var1) {
      qg var2 = (qg)var1[0];
      ax var4 = (ax)var1[1];
      long var9 = (Long)var1[2];
      List var7 = (List)var1[3];
      int var5 = (Integer)var1[4];
      _fm var3 = (_fm)var1[5];
      _yv var8 = (_yv)var1[6];
      Random var6 = (Random)var1[7];
      long var11 = (var9 << 8 | (long)var5 << 56 >>> 56) ^ b;
      long var13 = var11 ^ 77304564910225L;
      x44.a<"i">((h_)this.J[this.H], new Object[]{var2, var4, var13, var7, var3, var8, var6}, -5802737246726903893L, var11);
   }

   public void o(Object[] param1) {
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
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/util/Set
      // 00e: astore 2
      // 00f: dup
      // 010: bipush 2
      // 011: aaload
      // 012: checkcast java/util/Set
      // 015: astore 7
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/Long
      // 01d: invokevirtual java/lang/Long.longValue ()J
      // 020: lstore 5
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/util/Set
      // 028: astore 4
      // 02a: pop
      // 02b: lload 5
      // 02d: dup2
      // 02e: ldc2_w 2092966933173
      // 031: lxor
      // 032: lstore 8
      // 034: dup2
      // 035: ldc2_w 115803232716360
      // 038: lxor
      // 039: lstore 10
      // 03b: dup2
      // 03c: ldc2_w 75399801767488
      // 03f: lxor
      // 040: lstore 12
      // 042: dup2
      // 043: ldc2_w 103742515807807
      // 046: lxor
      // 047: lstore 14
      // 049: dup2
      // 04a: ldc2_w 131146523004872
      // 04d: lxor
      // 04e: lstore 16
      // 050: pop2
      // 051: ldc2_w 7629311329316986276
      // 054: lload 5
      // 056: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: istore 18
      // 05d: aload 0
      // 05e: getfield com/zelix/ig.H I
      // 061: bipush -1
      // 062: iload 18
      // 064: ifne 0e0
      // 067: if_icmpeq 0c8
      // 06a: goto 078
      // 06d: ldc2_w 8565553660571897712
      // 070: lload 5
      // 072: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 077: athrow
      // 078: aload 0
      // 079: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 07c: aload 0
      // 07d: getfield com/zelix/ig.H I
      // 080: aaload
      // 081: checkcast com/zelix/h_
      // 084: checkcast com/zelix/h_
      // 087: aload 3
      // 088: aload 2
      // 089: aload 7
      // 08b: lload 12
      // 08d: aload 4
      // 08f: bipush 5
      // 090: anewarray 46
      // 093: dup_x1
      // 094: swap
      // 095: bipush 4
      // 096: swap
      // 097: aastore
      // 098: dup_x2
      // 099: dup_x2
      // 09a: pop
      // 09b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09e: bipush 3
      // 09f: swap
      // 0a0: aastore
      // 0a1: dup_x1
      // 0a2: swap
      // 0a3: bipush 2
      // 0a4: swap
      // 0a5: aastore
      // 0a6: dup_x1
      // 0a7: swap
      // 0a8: bipush 1
      // 0a9: swap
      // 0aa: aastore
      // 0ab: dup_x1
      // 0ac: swap
      // 0ad: bipush 0
      // 0ae: swap
      // 0af: aastore
      // 0b0: ldc2_w 8461457245668419092
      // 0b3: lload 5
      // 0b5: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: goto 0c8
      // 0bd: ldc2_w 8565553660571897712
      // 0c0: lload 5
      // 0c2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: iload 18
      // 0cb: ifne 0e4
      // 0ce: getfield com/zelix/ig.d I
      // 0d1: bipush -1
      // 0d2: goto 0e0
      // 0d5: ldc2_w 8565553660571897712
      // 0d8: lload 5
      // 0da: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: athrow
      // 0e0: if_icmpeq 1c4
      // 0e3: aload 0
      // 0e4: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0e7: aload 0
      // 0e8: getfield com/zelix/ig.d I
      // 0eb: aaload
      // 0ec: checkcast com/zelix/hb
      // 0ef: checkcast com/zelix/hb
      // 0f2: astore 19
      // 0f4: aload 19
      // 0f6: lload 16
      // 0f8: bipush 1
      // 0f9: anewarray 46
      // 0fc: dup_x2
      // 0fd: dup_x2
      // 0fe: pop
      // 0ff: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 102: bipush 0
      // 103: swap
      // 104: aastore
      // 105: ldc2_w 7531525142382533986
      // 108: lload 5
      // 10a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: astore 20
      // 111: aload 20
      // 113: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 118: ifeq 1c4
      // 11b: aload 20
      // 11d: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 122: checkcast java/lang/String
      // 125: astore 21
      // 127: lload 14
      // 129: aload 21
      // 12b: invokestatic com/zelix/yn.x (JLjava/lang/String;)Lcom/zelix/hz;
      // 12e: astore 22
      // 130: aload 22
      // 132: lload 5
      // 134: lconst_0
      // 135: lcmp
      // 136: ifle 151
      // 139: iload 18
      // 13b: ifne 151
      // 13e: ifnull 1bf
      // 141: goto 14f
      // 144: ldc2_w 8565553660571897712
      // 147: lload 5
      // 149: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: athrow
      // 14f: aload 22
      // 151: lload 10
      // 153: invokevirtual com/zelix/hz.n (J)Z
      // 156: iload 18
      // 158: ifne 1be
      // 15b: ifeq 1a8
      // 15e: goto 16c
      // 161: ldc2_w 8565553660571897712
      // 164: lload 5
      // 166: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: aload 2
      // 16d: aload 22
      // 16f: lload 8
      // 171: bipush 1
      // 172: anewarray 46
      // 175: dup_x2
      // 176: dup_x2
      // 177: pop
      // 178: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 17b: bipush 0
      // 17c: swap
      // 17d: aastore
      // 17e: ldc2_w 8351280250331309208
      // 181: lload 5
      // 183: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 18d: pop
      // 18e: iload 18
      // 190: lload 5
      // 192: lconst_0
      // 193: lcmp
      // 194: ifle 1c1
      // 197: ifeq 1bf
      // 19a: goto 1a8
      // 19d: ldc2_w 8565553660571897712
      // 1a0: lload 5
      // 1a2: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: aload 2
      // 1a9: aload 22
      // 1ab: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1b0: goto 1be
      // 1b3: ldc2_w 8565553660571897712
      // 1b6: lload 5
      // 1b8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: pop
      // 1bf: iload 18
      // 1c1: ifeq 111
      // 1c4: return
   }

   void Oi(Object[] param1) {
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
      // 0f: checkcast java/util/Set
      // 12: astore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_u_
      // 19: astore 3
      // 1a: pop
      // 1b: getstatic com/zelix/ig.b J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 137793876971347
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w -1594293445702132325
      // 30: lload 4
      // 32: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: istore 8
      // 39: aload 0
      // 3a: iload 8
      // 3c: ifne 63
      // 3f: getfield com/zelix/ig.H I
      // 42: bipush -1
      // 43: if_icmpeq 96
      // 46: goto 54
      // 49: ldc2_w -657005366418944177
      // 4c: lload 4
      // 4e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: goto 63
      // 58: ldc2_w -657005366418944177
      // 5b: lload 4
      // 5d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 66: aload 0
      // 67: getfield com/zelix/ig.H I
      // 6a: aaload
      // 6b: checkcast com/zelix/h_
      // 6e: checkcast com/zelix/h_
      // 71: aload 2
      // 72: lload 6
      // 74: aload 3
      // 75: bipush 3
      // 76: anewarray 46
      // 79: dup_x1
      // 7a: swap
      // 7b: bipush 2
      // 7c: swap
      // 7d: aastore
      // 7e: dup_x2
      // 7f: dup_x2
      // 80: pop
      // 81: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 84: bipush 1
      // 85: swap
      // 86: aastore
      // 87: dup_x1
      // 88: swap
      // 89: bipush 0
      // 8a: swap
      // 8b: aastore
      // 8c: ldc2_w -749548294821342816
      // 8f: lload 4
      // 91: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: return
   }

   public void R(Object[] var1) {
      h4 var5 = (h4)var1[0];
      Set var2 = (Set)var1[1];
      Set var6 = (Set)var1[2];
      Set var3 = (Set)var1[3];
      Set var4 = (Set)var1[4];
   }

   public void mG(Object[] param1) {
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
      // 04: checkcast com/zelix/w
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/util/Set
      // 19: astore 4
      // 1b: pop
      // 1c: getstatic com/zelix/ig.b J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 46922682966523
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: ldc2_w -8831969965944425212
      // 2e: lload 2
      // 2f: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: aload 4
      // 36: aload 0
      // 37: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 3c: pop
      // 3d: istore 8
      // 3f: aload 0
      // 40: iload 8
      // 42: ifeq 67
      // 45: getfield com/zelix/ig.H I
      // 48: bipush -1
      // 49: if_icmpeq 9b
      // 4c: goto 59
      // 4f: ldc2_w -8707760461711032695
      // 52: lload 2
      // 53: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: aload 0
      // 5a: goto 67
      // 5d: ldc2_w -8707760461711032695
      // 60: lload 2
      // 61: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 6a: aload 0
      // 6b: getfield com/zelix/ig.H I
      // 6e: aaload
      // 6f: checkcast com/zelix/h_
      // 72: checkcast com/zelix/h_
      // 75: aload 5
      // 77: lload 6
      // 79: aload 4
      // 7b: bipush 3
      // 7c: anewarray 46
      // 7f: dup_x1
      // 80: swap
      // 81: bipush 2
      // 82: swap
      // 83: aastore
      // 84: dup_x2
      // 85: dup_x2
      // 86: pop
      // 87: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8a: bipush 1
      // 8b: swap
      // 8c: aastore
      // 8d: dup_x1
      // 8e: swap
      // 8f: bipush 0
      // 90: swap
      // 91: aastore
      // 92: ldc2_w -7473478361723345256
      // 95: lload 2
      // 96: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: return
   }

   void JN(Object[] param1) {
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
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast java/lang/Boolean
      // 01c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01f: istore 5
      // 021: pop
      // 022: getstatic com/zelix/ig.b J
      // 025: lload 2
      // 026: lxor
      // 027: lstore 2
      // 028: lload 2
      // 029: dup2
      // 02a: ldc2_w 6026146693308
      // 02d: lxor
      // 02e: lstore 6
      // 030: dup2
      // 031: ldc2_w 122782018746375
      // 034: lxor
      // 035: lstore 8
      // 037: dup2
      // 038: ldc2_w 127502846074912
      // 03b: lxor
      // 03c: lstore 10
      // 03e: dup2
      // 03f: ldc2_w 85369396980147
      // 042: lxor
      // 043: lstore 12
      // 045: dup2
      // 046: ldc2_w 3621592381590
      // 049: lxor
      // 04a: lstore 14
      // 04c: pop2
      // 04d: ldc2_w 6831566798784457354
      // 050: lload 2
      // 051: invokedynamic p (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: istore 16
      // 058: aload 0
      // 059: iload 16
      // 05b: ifne 080
      // 05e: getfield com/zelix/ig.H I
      // 061: bipush -1
      // 062: if_icmpeq 1f1
      // 065: goto 072
      // 068: ldc2_w 4751489306680653918
      // 06b: lload 2
      // 06c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 0
      // 073: goto 080
      // 076: ldc2_w 4751489306680653918
      // 079: lload 2
      // 07a: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 083: aload 0
      // 084: getfield com/zelix/ig.H I
      // 087: aaload
      // 088: checkcast com/zelix/h_
      // 08b: astore 17
      // 08d: iload 4
      // 08f: iload 16
      // 091: ifne 10f
      // 094: ifeq 10d
      // 097: goto 0a4
      // 09a: ldc2_w 4751489306680653918
      // 09d: lload 2
      // 09e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: lload 10
      // 0a7: bipush 1
      // 0a8: anewarray 46
      // 0ab: dup_x2
      // 0ac: dup_x2
      // 0ad: pop
      // 0ae: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b1: bipush 0
      // 0b2: swap
      // 0b3: aastore
      // 0b4: ldc2_w 4890755039989346156
      // 0b7: lload 2
      // 0b8: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: iload 16
      // 0bf: ifne 10f
      // 0c2: goto 0cf
      // 0c5: ldc2_w 4751489306680653918
      // 0c8: lload 2
      // 0c9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: athrow
      // 0cf: ifne 10d
      // 0d2: goto 0df
      // 0d5: ldc2_w 4751489306680653918
      // 0d8: lload 2
      // 0d9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 0
      // 0e0: lload 6
      // 0e2: invokevirtual com/zelix/ig.t (J)Z
      // 0e5: iload 16
      // 0e7: lload 2
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: ifle 117
      // 0ed: ifne 10f
      // 0f0: goto 0fd
      // 0f3: ldc2_w 4751489306680653918
      // 0f6: lload 2
      // 0f7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: athrow
      // 0fd: ifeq 1ca
      // 100: goto 10d
      // 103: ldc2_w 4751489306680653918
      // 106: lload 2
      // 107: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: iload 5
      // 10f: lload 2
      // 110: lconst_0
      // 111: lcmp
      // 112: iflt 13d
      // 115: iload 16
      // 117: ifne 13d
      // 11a: ifeq 19e
      // 11d: goto 12a
      // 120: ldc2_w 4751489306680653918
      // 123: lload 2
      // 124: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: athrow
      // 12a: aload 0
      // 12b: lload 14
      // 12d: invokevirtual com/zelix/ig.g (J)Z
      // 130: goto 13d
      // 133: ldc2_w 4751489306680653918
      // 136: lload 2
      // 137: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13c: athrow
      // 13d: lload 2
      // 13e: lconst_0
      // 13f: lcmp
      // 140: iflt 18e
      // 143: ifne 172
      // 146: aload 17
      // 148: lload 12
      // 14a: bipush 1
      // 14b: anewarray 46
      // 14e: dup_x2
      // 14f: dup_x2
      // 150: pop
      // 151: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 154: bipush 0
      // 155: swap
      // 156: aastore
      // 157: ldc2_w 4999100719287679816
      // 15a: lload 2
      // 15b: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: iload 16
      // 162: ifeq 1f1
      // 165: goto 172
      // 168: ldc2_w 4751489306680653918
      // 16b: lload 2
      // 16c: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: aload 17
      // 174: lload 8
      // 176: bipush 1
      // 177: anewarray 46
      // 17a: dup_x2
      // 17b: dup_x2
      // 17c: pop
      // 17d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 180: bipush 0
      // 181: swap
      // 182: aastore
      // 183: ldc2_w 6523914533808069960
      // 186: lload 2
      // 187: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18c: iload 16
      // 18e: ifeq 1f1
      // 191: goto 19e
      // 194: ldc2_w 4751489306680653918
      // 197: lload 2
      // 198: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: aload 17
      // 1a0: lload 12
      // 1a2: bipush 1
      // 1a3: anewarray 46
      // 1a6: dup_x2
      // 1a7: dup_x2
      // 1a8: pop
      // 1a9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ac: bipush 0
      // 1ad: swap
      // 1ae: aastore
      // 1af: ldc2_w 4999100719287679816
      // 1b2: lload 2
      // 1b3: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: iload 16
      // 1ba: ifeq 1f1
      // 1bd: goto 1ca
      // 1c0: ldc2_w 4751489306680653918
      // 1c3: lload 2
      // 1c4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: aload 17
      // 1cc: lload 8
      // 1ce: bipush 1
      // 1cf: anewarray 46
      // 1d2: dup_x2
      // 1d3: dup_x2
      // 1d4: pop
      // 1d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d8: bipush 0
      // 1d9: swap
      // 1da: aastore
      // 1db: ldc2_w 6523914533808069960
      // 1de: lload 2
      // 1df: invokedynamic h (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: goto 1f1
      // 1e7: ldc2_w 4751489306680653918
      // 1ea: lload 2
      // 1eb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f0: athrow
      // 1f1: return
   }

   public final void Z(Object[] param1) {
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
      // 015: ldc2_w 62592112659027
      // 018: lxor
      // 019: lstore 5
      // 01b: dup2
      // 01c: ldc2_w 85778829711090
      // 01f: lxor
      // 020: lstore 7
      // 022: pop2
      // 023: ldc2_w -233169258614305623
      // 026: lload 3
      // 027: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: bipush 0
      // 02d: istore 10
      // 02f: istore 9
      // 031: iload 10
      // 033: aload 0
      // 034: getfield com/zelix/ig.F I
      // 037: if_icmpge 109
      // 03a: aload 0
      // 03b: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 03e: iload 10
      // 040: aaload
      // 041: instanceof com/zelix/_yl
      // 044: lload 3
      // 045: lconst_0
      // 046: lcmp
      // 047: iflt 0bf
      // 04a: iload 9
      // 04c: ifeq 0bf
      // 04f: ifeq 096
      // 052: goto 05f
      // 055: ldc2_w -105053759248021724
      // 058: lload 3
      // 059: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 063: iload 10
      // 065: aaload
      // 066: checkcast com/zelix/_yl
      // 069: astore 11
      // 06b: aload 11
      // 06d: aload 2
      // 06e: lload 5
      // 070: bipush 2
      // 071: anewarray 46
      // 074: dup_x2
      // 075: dup_x2
      // 076: pop
      // 077: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07a: bipush 1
      // 07b: swap
      // 07c: aastore
      // 07d: dup_x1
      // 07e: swap
      // 07f: bipush 0
      // 080: swap
      // 081: aastore
      // 082: ldc2_w -1870524206577935799
      // 085: lload 3
      // 086: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: iload 9
      // 08d: lload 3
      // 08e: lconst_0
      // 08f: lcmp
      // 090: ifle 106
      // 093: ifne 101
      // 096: aload 0
      // 097: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 09a: iload 10
      // 09c: aaload
      // 09d: iload 9
      // 09f: ifeq 0dc
      // 0a2: goto 0af
      // 0a5: ldc2_w -105053759248021724
      // 0a8: lload 3
      // 0a9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: instanceof com/zelix/h_
      // 0b2: goto 0bf
      // 0b5: ldc2_w -105053759248021724
      // 0b8: lload 3
      // 0b9: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: lload 3
      // 0c0: lconst_0
      // 0c1: lcmp
      // 0c2: ifle 106
      // 0c5: ifeq 101
      // 0c8: aload 0
      // 0c9: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0cc: iload 10
      // 0ce: aaload
      // 0cf: goto 0dc
      // 0d2: ldc2_w -105053759248021724
      // 0d5: lload 3
      // 0d6: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: checkcast com/zelix/h_
      // 0df: astore 11
      // 0e1: aload 11
      // 0e3: aload 2
      // 0e4: lload 7
      // 0e6: bipush 2
      // 0e7: anewarray 46
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 1
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 0
      // 0f6: swap
      // 0f7: aastore
      // 0f8: ldc2_w -235050449272768874
      // 0fb: lload 3
      // 0fc: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: iinc 10 1
      // 104: iload 9
      // 106: ifne 031
      // 109: lload 3
      // 10a: lconst_0
      // 10b: lcmp
      // 10c: iflt 03a
      // 10f: return
   }

   public void UO(Object[] param1) {
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
      // 04: checkcast com/zelix/es
      // 07: astore 7
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: astore 9
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast com/zelix/pg
      // 17: astore 3
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/util/List
      // 1e: astore 10
      // 20: dup
      // 21: bipush 4
      // 22: aaload
      // 23: checkcast com/zelix/_8c
      // 26: astore 4
      // 28: dup
      // 29: bipush 5
      // 2a: aaload
      // 2b: checkcast java/lang/String
      // 2e: astore 8
      // 30: dup
      // 31: bipush 6
      // 33: aaload
      // 34: checkcast java/lang/Integer
      // 37: invokevirtual java/lang/Integer.intValue ()I
      // 3a: istore 2
      // 3b: dup
      // 3c: bipush 7
      // 3e: aaload
      // 3f: checkcast java/lang/Long
      // 42: invokevirtual java/lang/Long.longValue ()J
      // 45: lstore 5
      // 47: pop
      // 48: getstatic com/zelix/ig.b J
      // 4b: lload 5
      // 4d: lxor
      // 4e: lstore 5
      // 50: lload 5
      // 52: dup2
      // 53: ldc2_w 127667150747805
      // 56: lxor
      // 57: lstore 11
      // 59: pop2
      // 5a: ldc2_w 3591574453480260029
      // 5d: lload 5
      // 5f: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: istore 13
      // 66: aload 0
      // 67: iload 13
      // 69: ifeq 90
      // 6c: getfield com/zelix/ig.H I
      // 6f: bipush -1
      // 70: if_icmpeq ec
      // 73: goto 81
      // 76: ldc2_w 3719566530057079344
      // 79: lload 5
      // 7b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: aload 0
      // 82: goto 90
      // 85: ldc2_w 3719566530057079344
      // 88: lload 5
      // 8a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8f: athrow
      // 90: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 93: aload 0
      // 94: getfield com/zelix/ig.H I
      // 97: aaload
      // 98: checkcast com/zelix/h_
      // 9b: checkcast com/zelix/h_
      // 9e: lload 11
      // a0: aload 7
      // a2: aload 9
      // a4: aload 3
      // a5: aload 10
      // a7: aload 4
      // a9: aload 8
      // ab: iload 2
      // ac: bipush 8
      // ae: anewarray 46
      // b1: dup_x1
      // b2: swap
      // b3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b6: bipush 7
      // b8: swap
      // b9: aastore
      // ba: dup_x1
      // bb: swap
      // bc: bipush 6
      // be: swap
      // bf: aastore
      // c0: dup_x1
      // c1: swap
      // c2: bipush 5
      // c3: swap
      // c4: aastore
      // c5: dup_x1
      // c6: swap
      // c7: bipush 4
      // c8: swap
      // c9: aastore
      // ca: dup_x1
      // cb: swap
      // cc: bipush 3
      // cd: swap
      // ce: aastore
      // cf: dup_x1
      // d0: swap
      // d1: bipush 2
      // d2: swap
      // d3: aastore
      // d4: dup_x1
      // d5: swap
      // d6: bipush 1
      // d7: swap
      // d8: aastore
      // d9: dup_x2
      // da: dup_x2
      // db: pop
      // dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // df: bipush 0
      // e0: swap
      // e1: aastore
      // e2: ldc2_w 3270662914784782549
      // e5: lload 5
      // e7: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ec: return
   }

   public be N(Object[] param1) {
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
      // 0c: ldc2_w -7284114865628926291
      // 0f: lload 2
      // 10: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15: istore 4
      // 17: aload 0
      // 18: iload 4
      // 1a: ifne 3f
      // 1d: getfield com/zelix/ig.H I
      // 20: bipush -1
      // 21: if_icmpeq 5b
      // 24: goto 31
      // 27: ldc2_w -8802400335878833031
      // 2a: lload 2
      // 2b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: athrow
      // 31: aload 0
      // 32: goto 3f
      // 35: ldc2_w -8802400335878833031
      // 38: lload 2
      // 39: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 42: aload 0
      // 43: getfield com/zelix/ig.H I
      // 46: aaload
      // 47: checkcast com/zelix/h_
      // 4a: checkcast com/zelix/h_
      // 4d: bipush 0
      // 4e: anewarray 46
      // 51: ldc2_w -6998947742584051594
      // 54: lload 2
      // 55: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/be; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: areturn
      // 5b: aconst_null
      // 5c: areturn
   }

   void zM(Object[] param1) {
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
      // 00f: astore 9
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/qg
      // 017: astore 11
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast com/zelix/qg
      // 01f: astore 7
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast com/zelix/ax
      // 027: astore 16
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast java/util/ArrayList
      // 02f: astore 6
      // 031: dup
      // 032: bipush 6
      // 034: aaload
      // 035: checkcast com/zelix/_8c
      // 038: astore 8
      // 03a: dup
      // 03b: bipush 7
      // 03d: aaload
      // 03e: checkcast com/zelix/_y4
      // 041: astore 4
      // 043: dup
      // 044: bipush 8
      // 046: aaload
      // 047: checkcast java/util/Map
      // 04a: astore 14
      // 04c: dup
      // 04d: bipush 9
      // 04f: aaload
      // 050: checkcast com/zelix/_yv
      // 053: astore 10
      // 055: dup
      // 056: bipush 10
      // 058: aaload
      // 059: checkcast com/zelix/_fm
      // 05c: astore 12
      // 05e: dup
      // 05f: bipush 11
      // 061: aaload
      // 062: checkcast java/lang/Long
      // 065: invokevirtual java/lang/Long.longValue ()J
      // 068: lstore 2
      // 069: dup
      // 06a: bipush 12
      // 06c: aaload
      // 06d: checkcast com/zelix/_ug
      // 070: astore 15
      // 072: dup
      // 073: bipush 13
      // 075: aaload
      // 076: checkcast java/util/Random
      // 079: astore 13
      // 07b: pop
      // 07c: getstatic com/zelix/ig.b J
      // 07f: lload 2
      // 080: lxor
      // 081: lstore 2
      // 082: lload 2
      // 083: dup2
      // 084: ldc2_w 118200211862409
      // 087: lxor
      // 088: lstore 17
      // 08a: pop2
      // 08b: ldc2_w 784668837532023433
      // 08e: lload 2
      // 08f: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: istore 19
      // 096: aload 0
      // 097: iload 19
      // 099: ifeq 0be
      // 09c: getfield com/zelix/ig.H I
      // 09f: bipush -1
      // 0a0: if_icmpeq 148
      // 0a3: goto 0b0
      // 0a6: ldc2_w 624575125804101892
      // 0a9: lload 2
      // 0aa: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: goto 0be
      // 0b4: ldc2_w 624575125804101892
      // 0b7: lload 2
      // 0b8: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0c1: aload 0
      // 0c2: getfield com/zelix/ig.H I
      // 0c5: aaload
      // 0c6: checkcast com/zelix/h_
      // 0c9: checkcast com/zelix/h_
      // 0cc: aload 5
      // 0ce: lload 17
      // 0d0: aload 9
      // 0d2: aload 11
      // 0d4: aload 7
      // 0d6: aload 16
      // 0d8: aload 6
      // 0da: aload 8
      // 0dc: aload 4
      // 0de: aload 14
      // 0e0: aload 10
      // 0e2: aload 12
      // 0e4: aload 15
      // 0e6: aload 13
      // 0e8: bipush 14
      // 0ea: anewarray 46
      // 0ed: dup_x1
      // 0ee: swap
      // 0ef: bipush 13
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: bipush 12
      // 0f7: swap
      // 0f8: aastore
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: bipush 11
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: bipush 10
      // 103: swap
      // 104: aastore
      // 105: dup_x1
      // 106: swap
      // 107: bipush 9
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 8
      // 10f: swap
      // 110: aastore
      // 111: dup_x1
      // 112: swap
      // 113: bipush 7
      // 115: swap
      // 116: aastore
      // 117: dup_x1
      // 118: swap
      // 119: bipush 6
      // 11b: swap
      // 11c: aastore
      // 11d: dup_x1
      // 11e: swap
      // 11f: bipush 5
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 4
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 3
      // 12a: swap
      // 12b: aastore
      // 12c: dup_x1
      // 12d: swap
      // 12e: bipush 2
      // 12f: swap
      // 130: aastore
      // 131: dup_x2
      // 132: dup_x2
      // 133: pop
      // 134: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 137: bipush 1
      // 138: swap
      // 139: aastore
      // 13a: dup_x1
      // 13b: swap
      // 13c: bipush 0
      // 13d: swap
      // 13e: aastore
      // 13f: ldc2_w 747181072886235186
      // 142: lload 2
      // 143: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: return
   }

   public void s4(Object[] var1) {
      _op var2 = (_op)var1[0];
      long var3 = (Long)var1[1];
      var3 = b ^ var3;
      x44.a<"p">(this, var2, -976131409368804615L, var3);
   }

   public boolean V(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/List
      // 017: astore 8
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Boolean
      // 01f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 022: istore 9
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/lang/Boolean
      // 02a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02d: istore 3
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: istore 10
      // 039: dup
      // 03a: bipush 6
      // 03c: aaload
      // 03d: checkcast com/zelix/_fm
      // 040: astore 6
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast com/zelix/_yv
      // 049: astore 13
      // 04b: dup
      // 04c: bipush 8
      // 04e: aaload
      // 04f: checkcast java/lang/Long
      // 052: invokevirtual java/lang/Long.longValue ()J
      // 055: lstore 11
      // 057: dup
      // 058: bipush 9
      // 05a: aaload
      // 05b: checkcast java/lang/Boolean
      // 05e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 061: istore 7
      // 063: dup
      // 064: bipush 10
      // 066: aaload
      // 067: checkcast com/zelix/_ur
      // 06a: astore 2
      // 06b: pop
      // 06c: getstatic com/zelix/ig.b J
      // 06f: lload 11
      // 071: lxor
      // 072: lstore 11
      // 074: lload 11
      // 076: dup2
      // 077: ldc2_w 133045835910080
      // 07a: lxor
      // 07b: lstore 14
      // 07d: pop2
      // 07e: ldc2_w -6801639232598993441
      // 081: lload 11
      // 083: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: istore 16
      // 08a: aload 0
      // 08b: getfield com/zelix/ig.H I
      // 08e: iload 16
      // 090: ifne 130
      // 093: bipush -1
      // 094: if_icmpeq 12f
      // 097: goto 0a5
      // 09a: ldc2_w -4709200944876648693
      // 09d: lload 11
      // 09f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0a9: aload 0
      // 0aa: getfield com/zelix/ig.H I
      // 0ad: aaload
      // 0ae: checkcast com/zelix/h_
      // 0b1: checkcast com/zelix/h_
      // 0b4: lload 14
      // 0b6: aload 5
      // 0b8: aload 4
      // 0ba: aload 8
      // 0bc: iload 9
      // 0be: iload 3
      // 0bf: iload 10
      // 0c1: aload 6
      // 0c3: aload 13
      // 0c5: iload 7
      // 0c7: aload 2
      // 0c8: bipush 11
      // 0ca: anewarray 46
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: bipush 10
      // 0d1: swap
      // 0d2: aastore
      // 0d3: dup_x1
      // 0d4: swap
      // 0d5: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0d8: bipush 9
      // 0da: swap
      // 0db: aastore
      // 0dc: dup_x1
      // 0dd: swap
      // 0de: bipush 8
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 7
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x1
      // 0e9: swap
      // 0ea: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0ed: bipush 6
      // 0ef: swap
      // 0f0: aastore
      // 0f1: dup_x1
      // 0f2: swap
      // 0f3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f6: bipush 5
      // 0f7: swap
      // 0f8: aastore
      // 0f9: dup_x1
      // 0fa: swap
      // 0fb: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0fe: bipush 4
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 3
      // 104: swap
      // 105: aastore
      // 106: dup_x1
      // 107: swap
      // 108: bipush 2
      // 109: swap
      // 10a: aastore
      // 10b: dup_x1
      // 10c: swap
      // 10d: bipush 1
      // 10e: swap
      // 10f: aastore
      // 110: dup_x2
      // 111: dup_x2
      // 112: pop
      // 113: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 116: bipush 0
      // 117: swap
      // 118: aastore
      // 119: ldc2_w -6571148999437793869
      // 11c: lload 11
      // 11e: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: ireturn
      // 124: ldc2_w -4709200944876648693
      // 127: lload 11
      // 129: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: bipush 0
      // 130: ireturn
   }

   final void P(Object[] param1) {
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
      // 00c: lload 2
      // 00d: dup2
      // 00e: ldc2_w 14195908481724
      // 011: lxor
      // 012: lstore 4
      // 014: dup2
      // 015: ldc2_w 2367071144581
      // 018: lxor
      // 019: lstore 6
      // 01b: pop2
      // 01c: ldc2_w -9036585390852885763
      // 01f: lload 2
      // 020: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: bipush 0
      // 026: istore 9
      // 028: istore 8
      // 02a: iload 9
      // 02c: aload 0
      // 02d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 030: arraylength
      // 031: if_icmpge 0fc
      // 034: aload 0
      // 035: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 038: iload 9
      // 03a: aaload
      // 03b: instanceof com/zelix/_yl
      // 03e: lload 2
      // 03f: lconst_0
      // 040: lcmp
      // 041: iflt 0bc
      // 044: iload 8
      // 046: ifeq 0bc
      // 049: ifeq 093
      // 04c: goto 059
      // 04f: ldc2_w -9160670642762565264
      // 052: lload 2
      // 053: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 058: athrow
      // 059: aload 0
      // 05a: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 05d: iload 9
      // 05f: aaload
      // 060: checkcast com/zelix/_yl
      // 063: lload 6
      // 065: bipush 1
      // 066: anewarray 46
      // 069: dup_x2
      // 06a: dup_x2
      // 06b: pop
      // 06c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06f: bipush 0
      // 070: swap
      // 071: aastore
      // 072: ldc2_w -7039798464822978986
      // 075: lload 2
      // 076: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: iload 8
      // 07d: lload 2
      // 07e: lconst_0
      // 07f: lcmp
      // 080: iflt 0f9
      // 083: ifne 0f4
      // 086: goto 093
      // 089: ldc2_w -9160670642762565264
      // 08c: lload 2
      // 08d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: aload 0
      // 094: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 097: iload 9
      // 099: aaload
      // 09a: iload 8
      // 09c: ifeq 0d9
      // 09f: goto 0ac
      // 0a2: ldc2_w -9160670642762565264
      // 0a5: lload 2
      // 0a6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: instanceof com/zelix/h_
      // 0af: goto 0bc
      // 0b2: ldc2_w -9160670642762565264
      // 0b5: lload 2
      // 0b6: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: lload 2
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: ifle 0f9
      // 0c2: ifeq 0f4
      // 0c5: aload 0
      // 0c6: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0c9: iload 9
      // 0cb: aaload
      // 0cc: goto 0d9
      // 0cf: ldc2_w -9160670642762565264
      // 0d2: lload 2
      // 0d3: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: checkcast com/zelix/h_
      // 0dc: lload 4
      // 0de: bipush 1
      // 0df: anewarray 46
      // 0e2: dup_x2
      // 0e3: dup_x2
      // 0e4: pop
      // 0e5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e8: bipush 0
      // 0e9: swap
      // 0ea: aastore
      // 0eb: ldc2_w -8967305638250761694
      // 0ee: lload 2
      // 0ef: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: iinc 9 1
      // 0f7: iload 8
      // 0f9: ifne 02a
      // 0fc: lload 2
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: iflt 034
      // 102: return
   }

   void Z8(Object[] param1) {
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
      // 004: checkcast java/util/List
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Map
      // 00f: astore 7
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 10
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/_y4
      // 022: astore 5
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/lang/Long
      // 02a: astore 8
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast com/zelix/lu
      // 032: astore 2
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast com/zelix/qm
      // 03a: astore 3
      // 03b: dup
      // 03c: bipush 7
      // 03e: aaload
      // 03f: checkcast com/zelix/_8c
      // 042: astore 12
      // 044: dup
      // 045: bipush 8
      // 047: aaload
      // 048: checkcast java/util/List
      // 04b: astore 9
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast com/zelix/_fm
      // 054: astore 13
      // 056: dup
      // 057: bipush 10
      // 059: aaload
      // 05a: checkcast com/zelix/we
      // 05d: astore 6
      // 05f: pop
      // 060: getstatic com/zelix/ig.b J
      // 063: lload 10
      // 065: lxor
      // 066: lstore 10
      // 068: lload 10
      // 06a: dup2
      // 06b: ldc2_w 76499912169255
      // 06e: lxor
      // 06f: lstore 14
      // 071: dup2
      // 072: ldc2_w 42014417013533
      // 075: lxor
      // 076: lstore 16
      // 078: pop2
      // 079: ldc2_w -8612355921620714434
      // 07c: lload 10
      // 07e: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: istore 18
      // 085: aload 0
      // 086: iload 18
      // 088: ifne 0af
      // 08b: getfield com/zelix/ig.H I
      // 08e: bipush -1
      // 08f: if_icmpeq 12f
      // 092: goto 0a0
      // 095: ldc2_w -7546638261637959958
      // 098: lload 10
      // 09a: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: goto 0af
      // 0a4: ldc2_w -7546638261637959958
      // 0a7: lload 10
      // 0a9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0b2: aload 0
      // 0b3: getfield com/zelix/ig.H I
      // 0b6: aaload
      // 0b7: checkcast com/zelix/h_
      // 0ba: checkcast com/zelix/h_
      // 0bd: aload 4
      // 0bf: aload 0
      // 0c0: lload 16
      // 0c2: invokevirtual com/zelix/ig.V (J)Z
      // 0c5: lload 14
      // 0c7: aload 7
      // 0c9: aload 5
      // 0cb: aload 8
      // 0cd: aload 2
      // 0ce: aload 3
      // 0cf: aload 12
      // 0d1: aload 9
      // 0d3: aload 13
      // 0d5: aload 6
      // 0d7: bipush 12
      // 0d9: anewarray 46
      // 0dc: dup_x1
      // 0dd: swap
      // 0de: bipush 11
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 10
      // 0e6: swap
      // 0e7: aastore
      // 0e8: dup_x1
      // 0e9: swap
      // 0ea: bipush 9
      // 0ec: swap
      // 0ed: aastore
      // 0ee: dup_x1
      // 0ef: swap
      // 0f0: bipush 8
      // 0f2: swap
      // 0f3: aastore
      // 0f4: dup_x1
      // 0f5: swap
      // 0f6: bipush 7
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 6
      // 0fe: swap
      // 0ff: aastore
      // 100: dup_x1
      // 101: swap
      // 102: bipush 5
      // 103: swap
      // 104: aastore
      // 105: dup_x1
      // 106: swap
      // 107: bipush 4
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: bipush 3
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x2
      // 110: dup_x2
      // 111: pop
      // 112: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 115: bipush 2
      // 116: swap
      // 117: aastore
      // 118: dup_x1
      // 119: swap
      // 11a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 11d: bipush 1
      // 11e: swap
      // 11f: aastore
      // 120: dup_x1
      // 121: swap
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w -7782641440978308427
      // 128: lload 10
      // 12a: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: return
   }

   public void wx(Object[] var1) {
      int var4 = (Integer)var1[0];
      int var2 = (Integer)var1[1];
      _fh var3 = (_fh)var1[2];
      int var5 = (Integer)var1[3];
      long var6 = ((long)var4 << 32 | (long)var2 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ b;
      long var8 = var6 ^ 131326934636855L;
      x44.a<"u">(this, var3, 2442347490618817350L, var6);
      hy var10 = this.Y();
      x44.a<"n">(var10, new Object[]{var8}, 2748434416634395460L, var6);
   }

   public ig(hz param1, mx param2, mx param3, h4[] param4, int param5, long param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/ig.b J
      // 003: lload 6
      // 005: lxor
      // 006: lstore 6
      // 008: lload 6
      // 00a: dup2
      // 00b: ldc2_w 85460339052787
      // 00e: lxor
      // 00f: lstore 8
      // 011: dup2
      // 012: ldc2_w 119069850475373
      // 015: lxor
      // 016: dup2
      // 017: bipush 32
      // 019: lushr
      // 01a: l2i
      // 01b: istore 10
      // 01d: dup2
      // 01e: bipush 32
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 11
      // 027: dup2
      // 028: bipush 48
      // 02a: lshl
      // 02b: bipush 48
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 12
      // 031: pop2
      // 032: pop2
      // 033: ldc2_w -5665267654351224566
      // 036: lload 6
      // 038: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: aload 0
      // 03e: iload 10
      // 040: iload 11
      // 042: i2c
      // 043: iload 12
      // 045: i2s
      // 046: aload 1
      // 047: aload 2
      // 048: aload 3
      // 049: aload 4
      // 04b: iload 5
      // 04d: invokespecial com/zelix/iu.<init> (ICSLcom/zelix/hz;Lcom/zelix/mx;Lcom/zelix/mx;[Lcom/zelix/h4;I)V
      // 050: istore 13
      // 052: bipush 0
      // 053: istore 14
      // 055: iload 14
      // 057: aload 4
      // 059: arraylength
      // 05a: if_icmpge 11d
      // 05d: iload 13
      // 05f: lload 6
      // 061: lconst_0
      // 062: lcmp
      // 063: iflt 071
      // 066: ifeq 133
      // 069: aload 4
      // 06b: iload 14
      // 06d: aaload
      // 06e: instanceof com/zelix/h_
      // 071: lload 6
      // 073: lconst_0
      // 074: lcmp
      // 075: ifle 0e5
      // 078: iload 13
      // 07a: ifeq 0e5
      // 07d: goto 08b
      // 080: ldc2_w -5536693093248431481
      // 083: lload 6
      // 085: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: ifeq 0b5
      // 08e: goto 09c
      // 091: ldc2_w -5536693093248431481
      // 094: lload 6
      // 096: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: athrow
      // 09c: aload 0
      // 09d: iload 14
      // 09f: putfield com/zelix/ig.H I
      // 0a2: iload 13
      // 0a4: ifne 0fc
      // 0a7: goto 0b5
      // 0aa: ldc2_w -5536693093248431481
      // 0ad: lload 6
      // 0af: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: lload 6
      // 0b7: lconst_0
      // 0b8: lcmp
      // 0b9: ifle 118
      // 0bc: aload 4
      // 0be: iload 14
      // 0c0: aaload
      // 0c1: iload 13
      // 0c3: ifeq 101
      // 0c6: goto 0d4
      // 0c9: ldc2_w -5536693093248431481
      // 0cc: lload 6
      // 0ce: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: instanceof com/zelix/hb
      // 0d7: goto 0e5
      // 0da: ldc2_w -5536693093248431481
      // 0dd: lload 6
      // 0df: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: ifeq 0fc
      // 0e8: aload 0
      // 0e9: iload 14
      // 0eb: putfield com/zelix/ig.d I
      // 0ee: goto 0fc
      // 0f1: ldc2_w -5536693093248431481
      // 0f4: lload 6
      // 0f6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: athrow
      // 0fc: aload 4
      // 0fe: iload 14
      // 100: aaload
      // 101: aload 0
      // 102: bipush 1
      // 103: anewarray 46
      // 106: dup_x1
      // 107: swap
      // 108: bipush 0
      // 109: swap
      // 10a: aastore
      // 10b: ldc2_w -5988669211813878934
      // 10e: lload 6
      // 110: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: iinc 14 1
      // 118: iload 13
      // 11a: ifne 055
      // 11d: aload 0
      // 11e: aload 0
      // 11f: getfield com/zelix/ig.m Ljava/lang/String;
      // 122: lload 8
      // 124: dup2_x1
      // 125: pop2
      // 126: invokestatic com/zelix/xl.X (JLjava/lang/String;)Ljava/util/List;
      // 129: putfield com/zelix/ig.V Ljava/util/List;
      // 12c: lload 6
      // 12e: lconst_0
      // 12f: lcmp
      // 130: iflt 05d
      // 133: return
   }

   public String W(Object[] param1) {
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
      // 00c: getstatic com/zelix/ig.b J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 73876716222252
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 88262581078354
      // 01e: lxor
      // 01f: dup2
      // 020: bipush 48
      // 022: lushr
      // 023: l2i
      // 024: istore 6
      // 026: dup2
      // 027: bipush 16
      // 029: lshl
      // 02a: bipush 48
      // 02c: lushr
      // 02d: l2i
      // 02e: istore 7
      // 030: dup2
      // 031: bipush 32
      // 033: lshl
      // 034: bipush 32
      // 036: lushr
      // 037: l2i
      // 038: istore 8
      // 03a: pop2
      // 03b: dup2
      // 03c: ldc2_w 111740571832400
      // 03f: lxor
      // 040: lstore 9
      // 042: pop2
      // 043: ldc2_w -564193473233171345
      // 046: lload 2
      // 047: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: istore 11
      // 04e: aload 0
      // 04f: getfield com/zelix/ig.d I
      // 052: bipush -1
      // 053: if_icmpne 063
      // 056: ldc ""
      // 058: areturn
      // 059: ldc2_w -1795350132758815045
      // 05c: lload 2
      // 05d: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: new java/lang/StringBuilder
      // 066: dup
      // 067: invokespecial java/lang/StringBuilder.<init> ()V
      // 06a: astore 12
      // 06c: aload 0
      // 06d: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 070: aload 0
      // 071: getfield com/zelix/ig.d I
      // 074: aaload
      // 075: checkcast com/zelix/hb
      // 078: checkcast com/zelix/hb
      // 07b: astore 13
      // 07d: lload 2
      // 07e: lconst_0
      // 07f: lcmp
      // 080: iflt 09b
      // 083: aload 12
      // 085: sipush 20890
      // 088: ldc2_w 7335549813385013868
      // 08b: lload 2
      // 08c: lxor
      // 08d: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 095: iload 11
      // 097: ifne 1b9
      // 09a: pop
      // 09b: aload 13
      // 09d: lload 4
      // 09f: bipush 1
      // 0a0: anewarray 46
      // 0a3: dup_x2
      // 0a4: dup_x2
      // 0a5: pop
      // 0a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a9: bipush 0
      // 0aa: swap
      // 0ab: aastore
      // 0ac: ldc2_w -416502129756692797
      // 0af: lload 2
      // 0b0: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: ifle 1b7
      // 0b8: goto 0c5
      // 0bb: ldc2_w -1795350132758815045
      // 0be: lload 2
      // 0bf: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: athrow
      // 0c5: bipush 0
      // 0c6: istore 14
      // 0c8: iload 14
      // 0ca: aload 13
      // 0cc: lload 4
      // 0ce: bipush 1
      // 0cf: anewarray 46
      // 0d2: dup_x2
      // 0d3: dup_x2
      // 0d4: pop
      // 0d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d8: bipush 0
      // 0d9: swap
      // 0da: aastore
      // 0db: ldc2_w -416502129756692797
      // 0de: lload 2
      // 0df: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: if_icmpge 1b7
      // 0e7: lload 2
      // 0e8: lconst_0
      // 0e9: lcmp
      // 0ea: ifle 149
      // 0ed: aload 12
      // 0ef: aload 13
      // 0f1: iload 14
      // 0f3: iload 6
      // 0f5: i2c
      // 0f6: iload 7
      // 0f8: i2s
      // 0f9: iload 8
      // 0fb: bipush 4
      // 0fc: anewarray 46
      // 0ff: dup_x1
      // 100: swap
      // 101: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 104: bipush 3
      // 105: swap
      // 106: aastore
      // 107: dup_x1
      // 108: swap
      // 109: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10c: bipush 2
      // 10d: swap
      // 10e: aastore
      // 10f: dup_x1
      // 110: swap
      // 111: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 114: bipush 1
      // 115: swap
      // 116: aastore
      // 117: dup_x1
      // 118: swap
      // 119: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11c: bipush 0
      // 11d: swap
      // 11e: aastore
      // 11f: ldc2_w -1785871534851512516
      // 122: lload 2
      // 123: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/x7; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: lload 9
      // 12a: bipush 1
      // 12b: anewarray 46
      // 12e: dup_x2
      // 12f: dup_x2
      // 130: pop
      // 131: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 134: bipush 0
      // 135: swap
      // 136: aastore
      // 137: ldc2_w -290439717038132330
      // 13a: lload 2
      // 13b: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 143: iload 11
      // 145: ifne 1b9
      // 148: pop
      // 149: iload 11
      // 14b: lload 2
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: iflt 1b4
      // 151: ifne 1b2
      // 154: goto 161
      // 157: ldc2_w -1795350132758815045
      // 15a: lload 2
      // 15b: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: iload 14
      // 163: aload 13
      // 165: lload 4
      // 167: bipush 1
      // 168: anewarray 46
      // 16b: dup_x2
      // 16c: dup_x2
      // 16d: pop
      // 16e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 171: bipush 0
      // 172: swap
      // 173: aastore
      // 174: ldc2_w -416502129756692797
      // 177: lload 2
      // 178: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: bipush 1
      // 17e: isub
      // 17f: if_icmpge 1af
      // 182: goto 18f
      // 185: ldc2_w -1795350132758815045
      // 188: lload 2
      // 189: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: aload 12
      // 191: sipush 8997
      // 194: ldc2_w 8323926595197360366
      // 197: lload 2
      // 198: lxor
      // 199: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1a1: pop
      // 1a2: goto 1af
      // 1a5: ldc2_w -1795350132758815045
      // 1a8: lload 2
      // 1a9: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: athrow
      // 1af: iinc 14 1
      // 1b2: iload 11
      // 1b4: ifeq 0c8
      // 1b7: aload 12
      // 1b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1bc: areturn
   }

   int D(Object[] param1) {
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
      // 00a: istore 9
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/_y4
      // 012: astore 8
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/_fm
      // 01a: astore 14
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast com/zelix/_ur
      // 022: astore 12
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast com/zelix/we
      // 02a: astore 10
      // 02c: dup
      // 02d: bipush 5
      // 02e: aaload
      // 02f: checkcast java/lang/Integer
      // 032: invokevirtual java/lang/Integer.intValue ()I
      // 035: istore 11
      // 037: dup
      // 038: bipush 6
      // 03a: aaload
      // 03b: checkcast java/lang/Integer
      // 03e: invokevirtual java/lang/Integer.intValue ()I
      // 041: istore 2
      // 042: dup
      // 043: bipush 7
      // 045: aaload
      // 046: checkcast java/lang/Integer
      // 049: invokevirtual java/lang/Integer.intValue ()I
      // 04c: istore 3
      // 04d: dup
      // 04e: bipush 8
      // 050: aaload
      // 051: checkcast java/lang/Boolean
      // 054: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 057: istore 7
      // 059: dup
      // 05a: bipush 9
      // 05c: aaload
      // 05d: checkcast java/lang/Boolean
      // 060: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 063: istore 5
      // 065: dup
      // 066: bipush 10
      // 068: aaload
      // 069: checkcast java/util/Map
      // 06c: astore 6
      // 06e: dup
      // 06f: bipush 11
      // 071: aaload
      // 072: checkcast java/lang/Integer
      // 075: invokevirtual java/lang/Integer.intValue ()I
      // 078: istore 4
      // 07a: dup
      // 07b: bipush 12
      // 07d: aaload
      // 07e: checkcast java/lang/Boolean
      // 081: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 084: istore 13
      // 086: pop
      // 087: iload 9
      // 089: i2l
      // 08a: bipush 48
      // 08c: lshl
      // 08d: iload 11
      // 08f: i2l
      // 090: bipush 48
      // 092: lshl
      // 093: bipush 16
      // 095: lushr
      // 096: lor
      // 097: iload 4
      // 099: i2l
      // 09a: bipush 32
      // 09c: lshl
      // 09d: bipush 32
      // 09f: lushr
      // 0a0: lor
      // 0a1: getstatic com/zelix/ig.b J
      // 0a4: lxor
      // 0a5: lstore 15
      // 0a7: lload 15
      // 0a9: dup2
      // 0aa: ldc2_w 61749341167895
      // 0ad: lxor
      // 0ae: lstore 17
      // 0b0: dup2
      // 0b1: ldc2_w 79186847897074
      // 0b4: lxor
      // 0b5: lstore 19
      // 0b7: dup2
      // 0b8: ldc2_w 140586043754549
      // 0bb: lxor
      // 0bc: lstore 21
      // 0be: dup2
      // 0bf: ldc2_w 85069483367066
      // 0c2: lxor
      // 0c3: lstore 23
      // 0c5: dup2
      // 0c6: ldc2_w 81274324208858
      // 0c9: lxor
      // 0ca: lstore 25
      // 0cc: dup2
      // 0cd: ldc2_w 53163880149827
      // 0d0: lxor
      // 0d1: lstore 27
      // 0d3: pop2
      // 0d4: ldc2_w -6036341941068982146
      // 0d7: lload 15
      // 0d9: invokedynamic t (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: istore 29
      // 0e0: aload 0
      // 0e1: getfield com/zelix/ig.H I
      // 0e4: iload 29
      // 0e6: ifne 3fd
      // 0e9: bipush -1
      // 0ea: if_icmpeq 3fc
      // 0ed: goto 0fb
      // 0f0: ldc2_w -5547118161881953622
      // 0f3: lload 15
      // 0f5: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: ldc2_w -5274088394499150740
      // 0ff: lload 15
      // 101: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_fh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: iload 29
      // 108: iload 11
      // 10a: ifle 14b
      // 10d: ifne 148
      // 110: goto 11e
      // 113: ldc2_w -5547118161881953622
      // 116: lload 15
      // 118: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11d: athrow
      // 11e: ifnull 363
      // 121: goto 12f
      // 124: ldc2_w -5547118161881953622
      // 127: lload 15
      // 129: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: athrow
      // 12f: aload 0
      // 130: ldc2_w -5274088394499150740
      // 133: lload 15
      // 135: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_fh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13a: goto 148
      // 13d: ldc2_w -5547118161881953622
      // 140: lload 15
      // 142: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: athrow
      // 148: sipush 15154
      // 14b: ldc2_w 269266848390550761
      // 14e: lload 15
      // 150: lxor
      // 151: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: lload 17
      // 158: bipush 2
      // 159: anewarray 46
      // 15c: dup_x2
      // 15d: dup_x2
      // 15e: pop
      // 15f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 162: bipush 1
      // 163: swap
      // 164: aastore
      // 165: dup_x1
      // 166: swap
      // 167: bipush 0
      // 168: swap
      // 169: aastore
      // 16a: ldc2_w -6202541265089385077
      // 16d: lload 15
      // 16f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: iload 29
      // 176: ifne 364
      // 179: ifeq 363
      // 17c: goto 18a
      // 17f: ldc2_w -5547118161881953622
      // 182: lload 15
      // 184: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 0
      // 18b: ldc2_w -5274088394499150740
      // 18e: lload 15
      // 190: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/_fh; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: sipush 9647
      // 198: ldc2_w 2191897467871169122
      // 19b: lload 15
      // 19d: lxor
      // 19e: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: lload 25
      // 1a5: bipush 2
      // 1a6: anewarray 46
      // 1a9: dup_x2
      // 1aa: dup_x2
      // 1ab: pop
      // 1ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1af: bipush 1
      // 1b0: swap
      // 1b1: aastore
      // 1b2: dup_x1
      // 1b3: swap
      // 1b4: bipush 0
      // 1b5: swap
      // 1b6: aastore
      // 1b7: ldc2_w -6199393433760548218
      // 1ba: lload 15
      // 1bc: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c1: astore 30
      // 1c3: aload 30
      // 1c5: ldc2_w -5266323899070667885
      // 1c8: lload 15
      // 1ca: invokedynamic t (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: istore 31
      // 1d1: iload 3
      // 1d2: iload 29
      // 1d4: iload 4
      // 1d6: iflt 1de
      // 1d9: ifne 364
      // 1dc: iload 31
      // 1de: if_icmpeq 363
      // 1e1: goto 1ef
      // 1e4: ldc2_w -5547118161881953622
      // 1e7: lload 15
      // 1e9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ee: athrow
      // 1ef: iload 3
      // 1f0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1f3: ldc2_w -6041421776320343508
      // 1f6: lload 15
      // 1f8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: astore 32
      // 1ff: iload 31
      // 201: istore 3
      // 202: aload 12
      // 204: ldc2_w -5764804943178129812
      // 207: lload 15
      // 209: invokedynamic l (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: iload 29
      // 210: iload 11
      // 212: iflt 366
      // 215: ifne 364
      // 218: ifeq 363
      // 21b: goto 229
      // 21e: ldc2_w -5547118161881953622
      // 221: lload 15
      // 223: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: aload 12
      // 22b: lload 19
      // 22d: bipush 1
      // 22e: anewarray 46
      // 231: dup_x2
      // 232: dup_x2
      // 233: pop
      // 234: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 237: bipush 0
      // 238: swap
      // 239: aastore
      // 23a: ldc2_w -6320759965477613704
      // 23d: lload 15
      // 23f: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/io/PrintWriter; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 244: astore 33
      // 246: aload 33
      // 248: new java/lang/StringBuilder
      // 24b: dup
      // 24c: invokespecial java/lang/StringBuilder.<init> ()V
      // 24f: sipush 6919
      // 252: iload 9
      // 254: iflt 26c
      // 257: ldc2_w 3310772383483573486
      // 25a: lload 15
      // 25c: lxor
      // 25d: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: iload 29
      // 264: ifne 299
      // 267: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 26a: iload 13
      // 26c: ifeq 29c
      // 26f: goto 27d
      // 272: ldc2_w -5547118161881953622
      // 275: lload 15
      // 277: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: athrow
      // 27d: sipush 28939
      // 280: ldc2_w 1346833226105839317
      // 283: lload 15
      // 285: lxor
      // 286: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: goto 299
      // 28e: ldc2_w -5547118161881953622
      // 291: lload 15
      // 293: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 298: athrow
      // 299: goto 29e
      // 29c: ldc ""
      // 29e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a1: sipush 32044
      // 2a4: ldc2_w 9017389801455243970
      // 2a7: lload 15
      // 2a9: lxor
      // 2aa: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2af: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b2: lload 21
      // 2b4: aload 0
      // 2b5: bipush 1
      // 2b6: aload 10
      // 2b8: bipush 4
      // 2b9: anewarray 46
      // 2bc: dup_x1
      // 2bd: swap
      // 2be: bipush 3
      // 2bf: swap
      // 2c0: aastore
      // 2c1: dup_x1
      // 2c2: swap
      // 2c3: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2c6: bipush 2
      // 2c7: swap
      // 2c8: aastore
      // 2c9: dup_x1
      // 2ca: swap
      // 2cb: bipush 1
      // 2cc: swap
      // 2cd: aastore
      // 2ce: dup_x2
      // 2cf: dup_x2
      // 2d0: pop
      // 2d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d4: bipush 0
      // 2d5: swap
      // 2d6: aastore
      // 2d7: ldc2_w -5822411018928788980
      // 2da: lload 15
      // 2dc: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e4: sipush 282
      // 2e7: ldc2_w 8944838841173880523
      // 2ea: lload 15
      // 2ec: lxor
      // 2ed: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f5: aload 0
      // 2f6: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 2f9: lload 23
      // 2fb: dup2_x1
      // 2fc: pop2
      // 2fd: aload 10
      // 2ff: bipush 1
      // 300: bipush 4
      // 301: anewarray 46
      // 304: dup_x1
      // 305: swap
      // 306: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 309: bipush 3
      // 30a: swap
      // 30b: aastore
      // 30c: dup_x1
      // 30d: swap
      // 30e: bipush 2
      // 30f: swap
      // 310: aastore
      // 311: dup_x1
      // 312: swap
      // 313: bipush 1
      // 314: swap
      // 315: aastore
      // 316: dup_x2
      // 317: dup_x2
      // 318: pop
      // 319: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31c: bipush 0
      // 31d: swap
      // 31e: aastore
      // 31f: ldc2_w -6245256350717300453
      // 322: lload 15
      // 324: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 329: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 32c: sipush 5854
      // 32f: ldc2_w 8605972257805547807
      // 332: lload 15
      // 334: lxor
      // 335: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 33d: aload 32
      // 33f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 342: sipush 7146
      // 345: ldc2_w 3547091218326074431
      // 348: lload 15
      // 34a: lxor
      // 34b: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 350: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 353: aload 30
      // 355: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 358: ldc "'"
      // 35a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 360: invokevirtual java/io/PrintWriter.println (Ljava/lang/String;)V
      // 363: iload 3
      // 364: iload 29
      // 366: ifne 3fd
      // 369: ifeq 3fc
      // 36c: goto 37a
      // 36f: ldc2_w -5547118161881953622
      // 372: lload 15
      // 374: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: athrow
      // 37a: aload 0
      // 37b: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 37e: aload 0
      // 37f: getfield com/zelix/ig.H I
      // 382: aaload
      // 383: checkcast com/zelix/h_
      // 386: checkcast com/zelix/h_
      // 389: aload 8
      // 38b: lload 27
      // 38d: aload 14
      // 38f: aload 12
      // 391: aload 10
      // 393: iload 2
      // 394: iload 3
      // 395: iload 7
      // 397: iload 5
      // 399: aload 6
      // 39b: bipush 10
      // 39d: anewarray 46
      // 3a0: dup_x1
      // 3a1: swap
      // 3a2: bipush 9
      // 3a4: swap
      // 3a5: aastore
      // 3a6: dup_x1
      // 3a7: swap
      // 3a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3ab: bipush 8
      // 3ad: swap
      // 3ae: aastore
      // 3af: dup_x1
      // 3b0: swap
      // 3b1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3b4: bipush 7
      // 3b6: swap
      // 3b7: aastore
      // 3b8: dup_x1
      // 3b9: swap
      // 3ba: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3bd: bipush 6
      // 3bf: swap
      // 3c0: aastore
      // 3c1: dup_x1
      // 3c2: swap
      // 3c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3c6: bipush 5
      // 3c7: swap
      // 3c8: aastore
      // 3c9: dup_x1
      // 3ca: swap
      // 3cb: bipush 4
      // 3cc: swap
      // 3cd: aastore
      // 3ce: dup_x1
      // 3cf: swap
      // 3d0: bipush 3
      // 3d1: swap
      // 3d2: aastore
      // 3d3: dup_x1
      // 3d4: swap
      // 3d5: bipush 2
      // 3d6: swap
      // 3d7: aastore
      // 3d8: dup_x2
      // 3d9: dup_x2
      // 3da: pop
      // 3db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3de: bipush 1
      // 3df: swap
      // 3e0: aastore
      // 3e1: dup_x1
      // 3e2: swap
      // 3e3: bipush 0
      // 3e4: swap
      // 3e5: aastore
      // 3e6: ldc2_w -5936163339776002366
      // 3e9: lload 15
      // 3eb: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f0: ireturn
      // 3f1: ldc2_w -5547118161881953622
      // 3f4: lload 15
      // 3f6: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fb: athrow
      // 3fc: bipush 0
      // 3fd: ireturn
   }

   public void GQ(Object[] param1) {
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
      // 04: checkcast com/zelix/vl
      // 07: astore 5
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/util/Set
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast com/zelix/_uj
      // 17: astore 2
      // 18: dup
      // 19: bipush 3
      // 1a: aaload
      // 1b: checkcast java/lang/Long
      // 1e: invokevirtual java/lang/Long.longValue ()J
      // 21: lstore 6
      // 23: dup
      // 24: bipush 4
      // 25: aaload
      // 26: checkcast java/util/List
      // 29: astore 3
      // 2a: dup
      // 2b: bipush 5
      // 2c: aaload
      // 2d: checkcast com/zelix/_8c
      // 30: astore 8
      // 32: pop
      // 33: getstatic com/zelix/ig.b J
      // 36: lload 6
      // 38: lxor
      // 39: lstore 6
      // 3b: lload 6
      // 3d: dup2
      // 3e: ldc2_w 125578182491118
      // 41: lxor
      // 42: lstore 9
      // 44: pop2
      // 45: ldc2_w -7590561364339153214
      // 48: lload 6
      // 4a: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: istore 11
      // 51: aload 0
      // 52: iload 11
      // 54: ifeq 7b
      // 57: getfield com/zelix/ig.H I
      // 5a: bipush -1
      // 5b: if_icmpeq cb
      // 5e: goto 6c
      // 61: ldc2_w -7718691176685916849
      // 64: lload 6
      // 66: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: aload 0
      // 6d: goto 7b
      // 70: ldc2_w -7718691176685916849
      // 73: lload 6
      // 75: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 7e: aload 0
      // 7f: getfield com/zelix/ig.H I
      // 82: aaload
      // 83: checkcast com/zelix/h_
      // 86: checkcast com/zelix/h_
      // 89: aload 5
      // 8b: aload 0
      // 8c: aload 4
      // 8e: aload 2
      // 8f: aload 3
      // 90: lload 9
      // 92: aload 8
      // 94: bipush 7
      // 96: anewarray 46
      // 99: dup_x1
      // 9a: swap
      // 9b: bipush 6
      // 9d: swap
      // 9e: aastore
      // 9f: dup_x2
      // a0: dup_x2
      // a1: pop
      // a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a5: bipush 5
      // a6: swap
      // a7: aastore
      // a8: dup_x1
      // a9: swap
      // aa: bipush 4
      // ab: swap
      // ac: aastore
      // ad: dup_x1
      // ae: swap
      // af: bipush 3
      // b0: swap
      // b1: aastore
      // b2: dup_x1
      // b3: swap
      // b4: bipush 2
      // b5: swap
      // b6: aastore
      // b7: dup_x1
      // b8: swap
      // b9: bipush 1
      // ba: swap
      // bb: aastore
      // bc: dup_x1
      // bd: swap
      // be: bipush 0
      // bf: swap
      // c0: aastore
      // c1: ldc2_w -7755135729175145793
      // c4: lload 6
      // c6: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cb: return
   }

   boolean a(Object[] param1) {
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
      // 0e: checkcast com/zelix/ir
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/ig.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: lload 2
      // 1b: dup2
      // 1c: ldc2_w 109704421112864
      // 1f: lxor
      // 20: lstore 5
      // 22: pop2
      // 23: ldc2_w 68297310159843480
      // 26: lload 2
      // 27: invokedynamic s (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: istore 7
      // 2e: aload 0
      // 2f: getfield com/zelix/ig.H I
      // 32: iload 7
      // 34: ifeq 82
      // 37: bipush -1
      // 38: if_icmpeq 81
      // 3b: goto 48
      // 3e: ldc2_w 197032382182865685
      // 41: lload 2
      // 42: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: athrow
      // 48: aload 0
      // 49: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 4c: aload 0
      // 4d: getfield com/zelix/ig.H I
      // 50: aaload
      // 51: checkcast com/zelix/h_
      // 54: checkcast com/zelix/h_
      // 57: lload 5
      // 59: aload 4
      // 5b: bipush 2
      // 5c: anewarray 46
      // 5f: dup_x1
      // 60: swap
      // 61: bipush 1
      // 62: swap
      // 63: aastore
      // 64: dup_x2
      // 65: dup_x2
      // 66: pop
      // 67: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6a: bipush 0
      // 6b: swap
      // 6c: aastore
      // 6d: ldc2_w 2066028355278877034
      // 70: lload 2
      // 71: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: ireturn
      // 77: ldc2_w 197032382182865685
      // 7a: lload 2
      // 7b: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: bipush 0
      // 82: ireturn
   }

   void cR(Object[] param1) {
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
      // 04: checkcast java/util/List
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast com/zelix/_yv
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic com/zelix/ig.b J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: lload 2
      // 23: dup2
      // 24: ldc2_w 109395719656654
      // 27: lxor
      // 28: lstore 6
      // 2a: pop2
      // 2b: ldc2_w -2151665618816216503
      // 2e: lload 2
      // 2f: invokedynamic r (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: istore 8
      // 36: aload 0
      // 37: iload 8
      // 39: ifeq 5e
      // 3c: getfield com/zelix/ig.H I
      // 3f: bipush -1
      // 40: if_icmpeq 97
      // 43: goto 50
      // 46: ldc2_w -2275755526464022076
      // 49: lload 2
      // 4a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: aload 0
      // 51: goto 5e
      // 54: ldc2_w -2275755526464022076
      // 57: lload 2
      // 58: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: athrow
      // 5e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 61: aload 0
      // 62: getfield com/zelix/ig.H I
      // 65: aaload
      // 66: checkcast com/zelix/h_
      // 69: checkcast com/zelix/h_
      // 6c: aload 4
      // 6e: lload 6
      // 70: aload 5
      // 72: bipush 3
      // 73: anewarray 46
      // 76: dup_x1
      // 77: swap
      // 78: bipush 2
      // 79: swap
      // 7a: aastore
      // 7b: dup_x2
      // 7c: dup_x2
      // 7d: pop
      // 7e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 81: bipush 1
      // 82: swap
      // 83: aastore
      // 84: dup_x1
      // 85: swap
      // 86: bipush 0
      // 87: swap
      // 88: aastore
      // 89: ldc2_w -2009214278108700371
      // 8c: lload 2
      // 8d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 92: iload 8
      // 94: ifne b6
      // 97: new com/zelix/_sk
      // 9a: dup
      // 9b: sipush 8513
      // 9e: ldc2_w 4510836181831441888
      // a1: lload 2
      // a2: lxor
      // a3: invokedynamic v (IJ)Ljava/lang/String; bsm=com/zelix/ig.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a8: invokespecial com/zelix/_sk.<init> (Ljava/lang/String;)V
      // ab: athrow
      // ac: ldc2_w -2275755526464022076
      // af: lload 2
      // b0: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: athrow
      // b6: return
   }

   void En(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 85187284419451
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -2497249336070836931
      // 1e: lload 2
      // 1f: invokedynamic v (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: iload 6
      // 29: ifeq 4e
      // 2c: getfield com/zelix/ig.H I
      // 2f: bipush -1
      // 30: if_icmpeq 74
      // 33: goto 40
      // 36: ldc2_w -2369272635556501840
      // 39: lload 2
      // 3a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: goto 4e
      // 44: ldc2_w -2369272635556501840
      // 47: lload 2
      // 48: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 51: aload 0
      // 52: getfield com/zelix/ig.H I
      // 55: aaload
      // 56: checkcast com/zelix/h_
      // 59: checkcast com/zelix/h_
      // 5c: lload 4
      // 5e: bipush 1
      // 5f: anewarray 46
      // 62: dup_x2
      // 63: dup_x2
      // 64: pop
      // 65: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 68: bipush 0
      // 69: swap
      // 6a: aastore
      // 6b: ldc2_w -2730641954011788304
      // 6e: lload 2
      // 6f: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74: return
   }

   public void p(Object[] param1) {
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
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/util/Set
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: lload 4
      // 1d: dup2
      // 1e: ldc2_w 60766139232882
      // 21: lxor
      // 22: lstore 6
      // 24: pop2
      // 25: ldc2_w 7825244329953746162
      // 28: lload 4
      // 2a: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: istore 8
      // 31: aload 2
      // 32: aload 0
      // 33: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 38: iload 8
      // 3a: ifeq 73
      // 3d: ifeq b9
      // 40: goto 4e
      // 43: ldc2_w 7985306142357804927
      // 46: lload 4
      // 48: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 0
      // 4f: iload 8
      // 51: ifeq 86
      // 54: goto 62
      // 57: ldc2_w 7985306142357804927
      // 5a: lload 4
      // 5c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61: athrow
      // 62: getfield com/zelix/ig.H I
      // 65: goto 73
      // 68: ldc2_w 7985306142357804927
      // 6b: lload 4
      // 6d: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: bipush -1
      // 74: if_icmpeq b9
      // 77: aload 0
      // 78: goto 86
      // 7b: ldc2_w 7985306142357804927
      // 7e: lload 4
      // 80: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: athrow
      // 86: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 89: aload 0
      // 8a: getfield com/zelix/ig.H I
      // 8d: aaload
      // 8e: checkcast com/zelix/h_
      // 91: checkcast com/zelix/h_
      // 94: aload 2
      // 95: aload 3
      // 96: lload 6
      // 98: bipush 3
      // 99: anewarray 46
      // 9c: dup_x2
      // 9d: dup_x2
      // 9e: pop
      // 9f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a2: bipush 2
      // a3: swap
      // a4: aastore
      // a5: dup_x1
      // a6: swap
      // a7: bipush 1
      // a8: swap
      // a9: aastore
      // aa: dup_x1
      // ab: swap
      // ac: bipush 0
      // ad: swap
      // ae: aastore
      // af: ldc2_w 8537925487653212970
      // b2: lload 4
      // b4: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: return
   }

   boolean A(Object[] var1) {
      long var6 = (Long)var1[0];
      _fm var5 = (_fm)var1[1];
      _yv var3 = (_yv)var1[2];
      boolean var2 = (Boolean)var1[3];
      _ur var4 = (_ur)var1[4];
      var6 = b ^ var6;
      long var8 = var6 ^ 57037348929473L;
      boolean var10000 = x44.a<"u">(3655985642430071510L, var6);
      byte var11 = 0;
      boolean var10 = var10000;

      try {
         if (!var10) {
            return (boolean)this.H;
         }

         if (this.H == -1) {
            return (boolean)var11;
         }
      } catch (gj var12) {
         throw x44.a<"u">(var12, 3527990249668610395L, var6);
      }

      h_ var15 = (h_)this.J[this.H];
      Object[] var10007 = new Object[]{null, null, null, var2, var4};
      var10007[2] = var8;
      var10007[1] = var3;
      var10007[0] = var5;
      return x44.a<"m">(var15, var10007, 3656853809671485339L, var6);
   }

   public void PT(Object[] param1) {
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
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/Set
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/util/Set
      // 017: astore 5
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/util/Set
      // 01f: astore 7
      // 021: dup
      // 022: bipush 4
      // 023: aaload
      // 024: checkcast java/lang/Long
      // 027: invokevirtual java/lang/Long.longValue ()J
      // 02a: lstore 2
      // 02b: pop
      // 02c: getstatic com/zelix/ig.b J
      // 02f: lload 2
      // 030: lxor
      // 031: lstore 2
      // 032: lload 2
      // 033: dup2
      // 034: ldc2_w 137944815835550
      // 037: lxor
      // 038: dup2
      // 039: bipush 48
      // 03b: lushr
      // 03c: l2i
      // 03d: istore 8
      // 03f: dup2
      // 040: bipush 16
      // 042: lshl
      // 043: bipush 48
      // 045: lushr
      // 046: l2i
      // 047: istore 9
      // 049: dup2
      // 04a: bipush 32
      // 04c: lshl
      // 04d: bipush 32
      // 04f: lushr
      // 050: l2i
      // 051: istore 10
      // 053: pop2
      // 054: dup2
      // 055: ldc2_w 130193931861546
      // 058: lxor
      // 059: lstore 11
      // 05b: dup2
      // 05c: ldc2_w 58421306143889
      // 05f: lxor
      // 060: lstore 13
      // 062: dup2
      // 063: ldc2_w 113731202530922
      // 066: lxor
      // 067: lstore 15
      // 069: dup2
      // 06a: ldc2_w 61631268166235
      // 06d: lxor
      // 06e: lstore 17
      // 070: dup2
      // 071: ldc2_w 113052456654159
      // 074: lxor
      // 075: lstore 19
      // 077: pop2
      // 078: ldc2_w 2379273917713748334
      // 07b: lload 2
      // 07c: invokedynamic u (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: istore 21
      // 083: aload 0
      // 084: getfield com/zelix/ig.H I
      // 087: bipush -1
      // 088: iload 21
      // 08a: ifeq 104
      // 08d: if_icmpeq 0ed
      // 090: goto 09d
      // 093: ldc2_w 2543894866956196579
      // 096: lload 2
      // 097: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 0
      // 09e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 0a1: aload 0
      // 0a2: getfield com/zelix/ig.H I
      // 0a5: aaload
      // 0a6: checkcast com/zelix/h_
      // 0a9: checkcast com/zelix/h_
      // 0ac: aload 6
      // 0ae: lload 15
      // 0b0: aload 4
      // 0b2: aload 5
      // 0b4: aload 7
      // 0b6: bipush 5
      // 0b7: anewarray 46
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: bipush 4
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x1
      // 0c0: swap
      // 0c1: bipush 3
      // 0c2: swap
      // 0c3: aastore
      // 0c4: dup_x1
      // 0c5: swap
      // 0c6: bipush 2
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x2
      // 0ca: dup_x2
      // 0cb: pop
      // 0cc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cf: bipush 1
      // 0d0: swap
      // 0d1: aastore
      // 0d2: dup_x1
      // 0d3: swap
      // 0d4: bipush 0
      // 0d5: swap
      // 0d6: aastore
      // 0d7: ldc2_w 4594664743757732769
      // 0da: lload 2
      // 0db: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: goto 0ed
      // 0e3: ldc2_w 2543894866956196579
      // 0e6: lload 2
      // 0e7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: iload 21
      // 0f0: ifeq 108
      // 0f3: getfield com/zelix/ig.d I
      // 0f6: bipush -1
      // 0f7: goto 104
      // 0fa: ldc2_w 2543894866956196579
      // 0fd: lload 2
      // 0fe: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: if_icmpeq 203
      // 107: aload 0
      // 108: invokevirtual com/zelix/ig.Y ()Lcom/zelix/hy;
      // 10b: astore 22
      // 10d: aload 0
      // 10e: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 111: aload 0
      // 112: getfield com/zelix/ig.d I
      // 115: aaload
      // 116: checkcast com/zelix/hb
      // 119: checkcast com/zelix/hb
      // 11c: astore 23
      // 11e: aload 23
      // 120: lload 17
      // 122: bipush 1
      // 123: anewarray 46
      // 126: dup_x2
      // 127: dup_x2
      // 128: pop
      // 129: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 12c: bipush 0
      // 12d: swap
      // 12e: aastore
      // 12f: ldc2_w 4401729315915434225
      // 132: lload 2
      // 133: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: astore 24
      // 13a: aload 24
      // 13c: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 141: ifeq 203
      // 144: aload 24
      // 146: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 14b: checkcast java/lang/String
      // 14e: astore 25
      // 150: lload 11
      // 152: aload 25
      // 154: invokestatic com/zelix/yn.Z (JLjava/lang/String;)Lcom/zelix/hy;
      // 157: astore 26
      // 159: aload 26
      // 15b: iload 21
      // 15d: lload 2
      // 15e: lconst_0
      // 15f: lcmp
      // 160: ifle 17b
      // 163: ifeq 178
      // 166: ifnull 1fe
      // 169: goto 176
      // 16c: ldc2_w 2543894866956196579
      // 16f: lload 2
      // 170: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 22
      // 178: iload 8
      // 17a: i2s
      // 17b: iload 9
      // 17d: i2c
      // 17e: iload 10
      // 180: invokevirtual com/zelix/hy.U (SCI)Z
      // 183: iload 21
      // 185: ifeq 1fd
      // 188: ifeq 1f4
      // 18b: goto 198
      // 18e: ldc2_w 2543894866956196579
      // 191: lload 2
      // 192: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: athrow
      // 198: aload 26
      // 19a: lload 19
      // 19c: invokevirtual com/zelix/hy.B (J)Z
      // 19f: iload 21
      // 1a1: ifeq 1fd
      // 1a4: goto 1b1
      // 1a7: ldc2_w 2543894866956196579
      // 1aa: lload 2
      // 1ab: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b0: athrow
      // 1b1: ifeq 1f4
      // 1b4: goto 1c1
      // 1b7: ldc2_w 2543894866956196579
      // 1ba: lload 2
      // 1bb: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c0: athrow
      // 1c1: aload 26
      // 1c3: aload 22
      // 1c5: bipush 0
      // 1c6: anewarray 46
      // 1c9: ldc2_w 2825502032565016605
      // 1cc: lload 2
      // 1cd: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Integer; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: lload 13
      // 1d4: bipush 2
      // 1d5: anewarray 46
      // 1d8: dup_x2
      // 1d9: dup_x2
      // 1da: pop
      // 1db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1de: bipush 1
      // 1df: swap
      // 1e0: aastore
      // 1e1: dup_x1
      // 1e2: swap
      // 1e3: bipush 0
      // 1e4: swap
      // 1e5: aastore
      // 1e6: ldc2_w 4384426993402051016
      // 1e9: lload 2
      // 1ea: invokedynamic m (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/hz; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: checkcast com/zelix/hy
      // 1f2: astore 26
      // 1f4: aload 4
      // 1f6: aload 26
      // 1f8: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 1fd: pop
      // 1fe: iload 21
      // 200: ifne 13a
      // 203: return
   }

   public String g(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 132257951370448L;
      Object[] var10004 = new Object[]{null, false};
      var10004[0] = var4;
      return x44.a<"o">(this, var10004, 7292909695745135136L, var2);
   }

   public final void N(Object[] param1) {
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
      // 04: checkcast com/zelix/_ue
      // 07: astore 8
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 4
      // 14: dup
      // 15: bipush 2
      // 16: aaload
      // 17: checkcast com/zelix/qr
      // 1a: astore 2
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/h4
      // 21: astore 6
      // 23: dup
      // 24: bipush 4
      // 25: aaload
      // 26: checkcast com/zelix/_ur
      // 29: astore 7
      // 2b: dup
      // 2c: bipush 5
      // 2d: aaload
      // 2e: checkcast java/io/PrintWriter
      // 31: astore 3
      // 32: pop
      // 33: lload 4
      // 35: dup2
      // 36: ldc2_w 36120622866723
      // 39: lxor
      // 3a: lstore 9
      // 3c: pop2
      // 3d: ldc2_w -477480290909303525
      // 40: lload 4
      // 42: invokedynamic q (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: istore 11
      // 49: aload 6
      // 4b: iload 11
      // 4d: ifne 74
      // 50: instanceof com/zelix/h_
      // 53: ifeq aa
      // 56: goto 64
      // 59: ldc2_w -1846034238898708529
      // 5c: lload 4
      // 5e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: athrow
      // 64: aload 6
      // 66: goto 74
      // 69: ldc2_w -1846034238898708529
      // 6c: lload 4
      // 6e: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: checkcast com/zelix/h_
      // 77: aload 8
      // 79: aload 2
      // 7a: lload 9
      // 7c: aload 7
      // 7e: aload 3
      // 7f: bipush 5
      // 80: anewarray 46
      // 83: dup_x1
      // 84: swap
      // 85: bipush 4
      // 86: swap
      // 87: aastore
      // 88: dup_x1
      // 89: swap
      // 8a: bipush 3
      // 8b: swap
      // 8c: aastore
      // 8d: dup_x2
      // 8e: dup_x2
      // 8f: pop
      // 90: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93: bipush 2
      // 94: swap
      // 95: aastore
      // 96: dup_x1
      // 97: swap
      // 98: bipush 1
      // 99: swap
      // 9a: aastore
      // 9b: dup_x1
      // 9c: swap
      // 9d: bipush 0
      // 9e: swap
      // 9f: aastore
      // a0: ldc2_w -1804497671522232937
      // a3: lload 4
      // a5: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: return
   }

   public boolean k() {
      return true;
   }

   boolean G(Object[] param1) {
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
      // 0c: getstatic com/zelix/ig.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 20427068306318
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -6298652883009627908
      // 1e: lload 2
      // 1f: invokedynamic w (JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: istore 6
      // 26: aload 0
      // 27: getfield com/zelix/ig.H I
      // 2a: iload 6
      // 2c: ifeq 73
      // 2f: bipush -1
      // 30: if_icmpeq 72
      // 33: goto 40
      // 36: ldc2_w -6133925292952284303
      // 39: lload 2
      // 3a: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/ig.J [Lcom/zelix/h4;
      // 44: aload 0
      // 45: getfield com/zelix/ig.H I
      // 48: aaload
      // 49: checkcast com/zelix/h_
      // 4c: checkcast com/zelix/h_
      // 4f: lload 4
      // 51: bipush 1
      // 52: anewarray 46
      // 55: dup_x2
      // 56: dup_x2
      // 57: pop
      // 58: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5b: bipush 0
      // 5c: swap
      // 5d: aastore
      // 5e: ldc2_w -6320647195702489037
      // 61: lload 2
      // 62: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: ireturn
      // 68: ldc2_w -6133925292952284303
      // 6b: lload 2
      // 6c: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: bipush 0
      // 73: ireturn
   }

   static {
      long var5 = b ^ 113696220154088L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[49];
      int var12 = 0;
      String var11 = "\u007fÒÛ'ä\u008eý\u0005à\u0004©t\u00164w:»\u007fE à\u0012ø0D\u00ad\u0014\u0018½[å\b\u0018«\u0013\u001enæá\u0001~\u00130\u001f.IX\u0082ÞtC¨ÈÑ-\u0084^8Â·Q\u0097¡j´\u000f\u009dßU\u009d\u0014\u0083\u0093%ãÙ\u008cãð\u0007\u0097DV\u0090)Ä\u0005y[\u00961\u009fI|\u0015(hË4T>r&Kßs;\u0081\u0003Y}Udj(»»ËCPô=@\u000feÍ {\u0012\u0083Ñ10\u0080ìsÿ7É)H\u001eY\u001d¡0ZÈp`]¬\u000b\u00983\u0080¶YC\"\u001a\"¼\u0090\u000f>ç;ÁXÎ\u0099¾\u0003{>3\u0014Ý4©>Ð\u0085¼sg\u0010u\u0089Bú±\u000fGÒ\u000f\u0099\u0004~6\u0004\u00971\u008cÈÈ_ «1Y\u0015xÂB0ú`'ÈF:L\u0017ò?8´=e[%É§Vò\u0094\u0018\u0012qº´»@Ó0© O\u0005-\u0080t±ß\u0081\u009a¹\u0016øwÁ+\u0092 \u0098Az_\u000eP¸Ò´rµ³\u0082~éµ6R\u0010Õâû£\u0090Lï\u007fpm\u0082\u0082tFi^@\u00965\u0002\u0007z#Ðq±\u0004\u0098t\u0086?â\u0099uS®Ì\u001b,¼.Æ\\\n\u0017\u0012\u0010A~©A\u000bE¡\u0099\u009al\u0093B£ó³È\\ºðAÕÆö\t×e\u0012t{I\u0099÷\u008adpÑ\u0095\u008f.Ö\u00ad\u0016ÊøÆ×\u00054«ñ\nÏ\u0081ÔQf3Ø\u001a§ó),9\u0084¥ÇÆR\u001eMºã!¾Cîkø\u001fÃÝ\u0087ñob\u0093}«>$ª\u0099·I¼óÆ¤UýÚÌ\u001b\b\u000b\u00adHÍí³pdRF.0²Ô:Ê`\u008fÖ{g4§å1e\u0099¶M\u0092Ô\u0097GË\u0095i \u001aooÅe0¦\u001a\u0016\u008cDÐ\u0083½O\u0002\u0007·ÌøgÆ¸9Ø[Þ|¢0\u00021¼TüÑ \u000fDw(!Êå.Ïí\u0002Æv\u0084»ùÒ\u0010y\u001aÏ½\u0003õ\u0012Xè\u0085o\u0013è\u0094|¢Pux÷uÒ\u009cÙ¦%Rtæ¢¤\u0003Þå\u001880\u001f1\u009e¿Î\u0085\b\u0015\u0016Á(\u0090bòÆ]Ùkx\u0015(*áÎÇ\u008a\u0092\u0017XmQ»Ù´¿\u0085FKøvk\u0081Îiaò®ná\u0019Þh\u00adm\u0015Ý£8Îý02ë'«\u001e¬Ím\u007f/¯\u0080£ù°ÔK\u0015³o\u0007ÓQ\u000eZçð\u001d\u009cöË\u0081]¸eEïÇ\u008f\r3\u0092\u0087yF\t6\u0005\u0010\u0010yP®50£ûiB¦årÏ\u0091\u00018'\bïCSîÅ<\u0007\u0014Réa\u0002B¼r\u008fek\u0085¡\u009b\u0016ÐÛ\bï\u0004è\u0083µ\u0003\u0098\u009cmJ+\u0015%<\u0093Õ~ÎO¢\u001c3® \u001d$\u0099¡¶8®Ü\u001eä }\u0082Æ\u0007Ý_^\r\u008d\u0002\u0005XÀv|^¢TRÅßi\u008eÙÇT/etÅ×Z¹vQ\u0000Ó\u0014row+\u0093LÊ;×\u0081/NÈh\u008c\u000e?$áHqÿANÓMÅm VH]VÖ\u0013Ó\u0097â .\u0087ÂÎÚß\u008b.\u008d[N\b}\u0007\u0001\u0000g\u000bmvN\u001ac\u000foë3ñ$\u00ad\u0094EeùZÍ0Öqk\u0013bR\u001aX\u008dæóÿÑ\u0085«S\f\u0099ª¨t\u0093Ð>õãYÝ\u0089]ö©ÁÐ ï\u001e6YÕÅÄ8mC2J&u\u0001E¤ó\u0007\u0013Û¼µÂ\u0096ádMO¾Ij\u0011j:³\u0099Ât\u0093\nbDW\u0014oÏÖ-:eLX\u0094fL\u0085HÂ#\u0090ÌZ\u0098(\u0012ä×ÒE´×{ù¶Ún#² \u001f©°\\\u0015øLÅï=Û±®\u0010©\u0011ÔúG\b£p½C\u0014 IÙåà_U¥\u009bU£¸ùùH\u009dÆÿ2\u001c¢\u00003ß¯ÒLJ¶S\b\u000f[8\u008b Ññë\u0093GV+'\u0015¾\t::<-\u0080Nµõ 5u5ð\u0088Bu\u0099nÉy¥4íèÓ\tø¸×Ý>\u00150}\u0085,þ`»/åÇ.`\nÕO\u0096qÑîØ·\u001bv\u0098\u008fà-\u0006o©T\u0080Ìl\u0010}_\u0090S\u008aX\u0082³\u009aê\u001f\u0094v\u009cëä\u0004åü\u009eñçÓ\u0090BÆ¥\u0092\u0015Aly3}\u0092\u0012¿B!\u0016eá»\b\u0019ùø\u0084\u0096w©oB¤\u008fk\u001dÚVZ\u001a1þ$eë®\u009dÃïã\u0095I8Ä&WÒÌ\r§é\u0006Òq¦\u000eMMÈ\u0011,Õ\u0006 ÙÙA<Q\u00ad\u001a*HÁ\r't²\u0012\u009a]Ý_~\u0011évpiÅ\t2ú2³ö2.x K£VwÏ}-\u0084\u0010\u000eÍO\u0010\t\u0096èº[\u0003Z\u00021Hè\u001b\u0098\n5ÖÌ\u000eP\u0010\u0082Ê\u0090å\u001cýN\u0090\u0003âX²èTN{ ô~¡Å;\u0017ù\u009cvã\u0087\u0011XÊæyú\u0080¥=xÂÊ#Ða\u0082or \u000eÆhVS\u0097å\u001e\u0096´q\u0096As&O\u009c\u0011\u0085\u0089ÏA\n2\u008eó\u0007\u0098âÜ\u0085\nC\roµ\u001b;¶à\u00011\u008dÖÂ¯ºÆH¦\u008c\u0089¿Æ4\u0090\u0089x\u0086\u0091Âþ\u008ex<Ù\u0092!IÝ:\u0085\u009eÿ¯\u0098ÿK b§¥ú}wyK\u009ev¶\u0092oVN\u001a/7\u0014ª\u0013¤q\\Ñ©6\u008f¸Y&ãËVÕ4\u000e\u001c6§\u0012ÈXìë×ªB\u0095\r\u00adÌF\u000e÷/\u0013\u009cû\u0011\u0081Ó%0Ä\n@Á\u009d»H\u008c\u001fÓ=£øE¨=ºÖ)ë¼_ÀpI£\u009c\u001a\u0081ö\u001f7ñ4@B\u0089ªåi6cA2XÞ\u001d¢9\u0082ÎÍÚxh\u0099\u0097\u0013=§\u0001úb4É\u009eÆq\u0089Å¾Û\u0096¬CZÿ#Øh\u0086'\u0087RiXJJ>U@\u008e\fË¥Á®æ\u008asÏ:ä¾\u0007Ì]\u008f?7x\u0001\u00adÓ\u0091\u0083~\u008e\u0015û&iDý\u008ae;\u001a÷Åý÷8_\u009c\"Ëák¼¤Í\u000bÆø\u00989\\·\u00184!\u0005\u00ad¢w¯\r×Þ\u0095\u009e\u0007c\u008aó¦\u0091êÃ\u0091È/\u0007 ëë¿ÑÒßþ=\u0001\u009bï¶\u0090ËõQM\u009a¦B\u001a¢y\u0005\u0011Tòé\u0099iBì\u0010?Í_-ºo}ù[öS*Ö\u0014Bw \u009a#\u001b\u0096\fl/¶ä.¶{~W\u0087î\u0019~\u008a\u008c×Ä¶\u0087ÒoÔ\u001a\u0019A\u0081\u0017\u0018\u000e\u000b\u0095\u0012\u0018\u0090E\u008c~mWÆ\u0013G\u008b/óÕþU\u0018)¼ùXdnOZ\u008e\u001dÆâ\t3ÉèË¡C\u0081\u009d\u008dÞ\u00985\u008a}££CÈ\u0013ö\u0095½^ºÐ\u001böSØ\u0084\u0086=dS\u009dÙ\u0010ß\u0019³Ù0ö\t\u000f.s7\u0018+ aâ\u0017ñ\u007f³Ý\u0019 ks*þq\u001a\u0015:\u0096'>\u009a&\u0084\u0080Ì\u009fr[`\u0099S:p\u0083ÔIzu«î\u0095\u009e\u0095q<@\u008dò£«xf~SóÕ\u000bö\u00919\u0092/£?ü\u0011ø\u0087ì\u008a\u009d\u007fU¶ùhÁÀ\\\u0018´À¸eJ+ln\u0092»\u00adX©µ\u008f¬ï³Ã°\u001aÃ¢mlpP¨Mý\u00ad%vwp\u0012\u0091-.gÅ#\u0017«xPÂ´?£\u0003R\u0095L\u0017ÿé\u0083õ´öN]óB\u001fû\f\u008fN\b,-lAþ\u0094âV¢t+>\u0086\u009c\u001fïwzd¯Ñ±\\ý\u009bjÇ\u0007n!´\u0092iº¤(±«JÈò§§ðÔ#¼\u0089¤rë\u0089y\u0011½@\nÆ\u0081è*¢^-ãÂÜ;\u001d\u0095¬i\u0001\r»ù\u009cg\u0015\u000bàï\u0082ò°ºí±\u0090âo¢^<\u0087\\\u0092\u0091\u00969`\u0002L\u000e÷éÃ\u0094\u0080O\u0004e%¢v>/\u0087½«\u0018\u001ekU×\u00ad÷{l]hÕ\u0082\u0019\u0090\u000bXZ.Âm±\u000eñµ\u0010õmÑ,À»ÔçïB_\u0006ÄéM%8äK\u0099\u007f.³tµ\u001cjÏ\u0095 `¾©BÝ\b\u0014'rRqµ8íCL+^ìÍ\u0084[ñ'öøæ>EêÃ´GÎ\u0006¾\u0098'îÏv¯¡\u0010\u0019>\u000eð2s[7\u008e \u0096¹u\u00968~\u0010Krà·\u0083µ}UKYq¾\u0098âãV\u0010Jy\\ é\u000eÚ\u001ft\u008a T íFö ¾*\u0086\u0099\u009a\u0097dd®\u0091\u000eÒÄUpæÿ\u0097\u009b«\u009f\u009f\u000b\u008bÉ\u0084í\u0002\u009bZ\u001a\u000b\u0010\u009d<\u008e\u0004Â2f¡ïG\u0083§ã\u0095¼2HÏØ\u00adô\u0004\t(\u0086\nr\u00076zRK-¦t\u009e¦+Â\u0019\u0001Ô©¦Ô\u0003V\u009c\tÖ/qÿ`ãë\b%C%Y\u0095\u0082í\u0003\u0013ò^È1\u0007\u008bõ¬ßt\u0013øéqí`M$^/\u0092×± s7\u0092®¢\u0000é\u001ff\u0001GìWÛ(ò\u009b\u0097¼\u0013C\u0012|f\u0006XÁ@ÏUÞË@f³\u001d\u0082\u0011\u0002]-Ø\r÷£àÚ|\u000eô¥\u001dp\u0006®Ek©w\u008f^Ó®÷\"Ì£-|\u0004ÝÿðpÞË\u009b\u007fxjÖ=í4ö½Þ0FìÄD¨ß?ÅU";
      int var13 = "\u007fÒÛ'ä\u008eý\u0005à\u0004©t\u00164w:»\u007fE à\u0012ø0D\u00ad\u0014\u0018½[å\b\u0018«\u0013\u001enæá\u0001~\u00130\u001f.IX\u0082ÞtC¨ÈÑ-\u0084^8Â·Q\u0097¡j´\u000f\u009dßU\u009d\u0014\u0083\u0093%ãÙ\u008cãð\u0007\u0097DV\u0090)Ä\u0005y[\u00961\u009fI|\u0015(hË4T>r&Kßs;\u0081\u0003Y}Udj(»»ËCPô=@\u000feÍ {\u0012\u0083Ñ10\u0080ìsÿ7É)H\u001eY\u001d¡0ZÈp`]¬\u000b\u00983\u0080¶YC\"\u001a\"¼\u0090\u000f>ç;ÁXÎ\u0099¾\u0003{>3\u0014Ý4©>Ð\u0085¼sg\u0010u\u0089Bú±\u000fGÒ\u000f\u0099\u0004~6\u0004\u00971\u008cÈÈ_ «1Y\u0015xÂB0ú`'ÈF:L\u0017ò?8´=e[%É§Vò\u0094\u0018\u0012qº´»@Ó0© O\u0005-\u0080t±ß\u0081\u009a¹\u0016øwÁ+\u0092 \u0098Az_\u000eP¸Ò´rµ³\u0082~éµ6R\u0010Õâû£\u0090Lï\u007fpm\u0082\u0082tFi^@\u00965\u0002\u0007z#Ðq±\u0004\u0098t\u0086?â\u0099uS®Ì\u001b,¼.Æ\\\n\u0017\u0012\u0010A~©A\u000bE¡\u0099\u009al\u0093B£ó³È\\ºðAÕÆö\t×e\u0012t{I\u0099÷\u008adpÑ\u0095\u008f.Ö\u00ad\u0016ÊøÆ×\u00054«ñ\nÏ\u0081ÔQf3Ø\u001a§ó),9\u0084¥ÇÆR\u001eMºã!¾Cîkø\u001fÃÝ\u0087ñob\u0093}«>$ª\u0099·I¼óÆ¤UýÚÌ\u001b\b\u000b\u00adHÍí³pdRF.0²Ô:Ê`\u008fÖ{g4§å1e\u0099¶M\u0092Ô\u0097GË\u0095i \u001aooÅe0¦\u001a\u0016\u008cDÐ\u0083½O\u0002\u0007·ÌøgÆ¸9Ø[Þ|¢0\u00021¼TüÑ \u000fDw(!Êå.Ïí\u0002Æv\u0084»ùÒ\u0010y\u001aÏ½\u0003õ\u0012Xè\u0085o\u0013è\u0094|¢Pux÷uÒ\u009cÙ¦%Rtæ¢¤\u0003Þå\u001880\u001f1\u009e¿Î\u0085\b\u0015\u0016Á(\u0090bòÆ]Ùkx\u0015(*áÎÇ\u008a\u0092\u0017XmQ»Ù´¿\u0085FKøvk\u0081Îiaò®ná\u0019Þh\u00adm\u0015Ý£8Îý02ë'«\u001e¬Ím\u007f/¯\u0080£ù°ÔK\u0015³o\u0007ÓQ\u000eZçð\u001d\u009cöË\u0081]¸eEïÇ\u008f\r3\u0092\u0087yF\t6\u0005\u0010\u0010yP®50£ûiB¦årÏ\u0091\u00018'\bïCSîÅ<\u0007\u0014Réa\u0002B¼r\u008fek\u0085¡\u009b\u0016ÐÛ\bï\u0004è\u0083µ\u0003\u0098\u009cmJ+\u0015%<\u0093Õ~ÎO¢\u001c3® \u001d$\u0099¡¶8®Ü\u001eä }\u0082Æ\u0007Ý_^\r\u008d\u0002\u0005XÀv|^¢TRÅßi\u008eÙÇT/etÅ×Z¹vQ\u0000Ó\u0014row+\u0093LÊ;×\u0081/NÈh\u008c\u000e?$áHqÿANÓMÅm VH]VÖ\u0013Ó\u0097â .\u0087ÂÎÚß\u008b.\u008d[N\b}\u0007\u0001\u0000g\u000bmvN\u001ac\u000foë3ñ$\u00ad\u0094EeùZÍ0Öqk\u0013bR\u001aX\u008dæóÿÑ\u0085«S\f\u0099ª¨t\u0093Ð>õãYÝ\u0089]ö©ÁÐ ï\u001e6YÕÅÄ8mC2J&u\u0001E¤ó\u0007\u0013Û¼µÂ\u0096ádMO¾Ij\u0011j:³\u0099Ât\u0093\nbDW\u0014oÏÖ-:eLX\u0094fL\u0085HÂ#\u0090ÌZ\u0098(\u0012ä×ÒE´×{ù¶Ún#² \u001f©°\\\u0015øLÅï=Û±®\u0010©\u0011ÔúG\b£p½C\u0014 IÙåà_U¥\u009bU£¸ùùH\u009dÆÿ2\u001c¢\u00003ß¯ÒLJ¶S\b\u000f[8\u008b Ññë\u0093GV+'\u0015¾\t::<-\u0080Nµõ 5u5ð\u0088Bu\u0099nÉy¥4íèÓ\tø¸×Ý>\u00150}\u0085,þ`»/åÇ.`\nÕO\u0096qÑîØ·\u001bv\u0098\u008fà-\u0006o©T\u0080Ìl\u0010}_\u0090S\u008aX\u0082³\u009aê\u001f\u0094v\u009cëä\u0004åü\u009eñçÓ\u0090BÆ¥\u0092\u0015Aly3}\u0092\u0012¿B!\u0016eá»\b\u0019ùø\u0084\u0096w©oB¤\u008fk\u001dÚVZ\u001a1þ$eë®\u009dÃïã\u0095I8Ä&WÒÌ\r§é\u0006Òq¦\u000eMMÈ\u0011,Õ\u0006 ÙÙA<Q\u00ad\u001a*HÁ\r't²\u0012\u009a]Ý_~\u0011évpiÅ\t2ú2³ö2.x K£VwÏ}-\u0084\u0010\u000eÍO\u0010\t\u0096èº[\u0003Z\u00021Hè\u001b\u0098\n5ÖÌ\u000eP\u0010\u0082Ê\u0090å\u001cýN\u0090\u0003âX²èTN{ ô~¡Å;\u0017ù\u009cvã\u0087\u0011XÊæyú\u0080¥=xÂÊ#Ða\u0082or \u000eÆhVS\u0097å\u001e\u0096´q\u0096As&O\u009c\u0011\u0085\u0089ÏA\n2\u008eó\u0007\u0098âÜ\u0085\nC\roµ\u001b;¶à\u00011\u008dÖÂ¯ºÆH¦\u008c\u0089¿Æ4\u0090\u0089x\u0086\u0091Âþ\u008ex<Ù\u0092!IÝ:\u0085\u009eÿ¯\u0098ÿK b§¥ú}wyK\u009ev¶\u0092oVN\u001a/7\u0014ª\u0013¤q\\Ñ©6\u008f¸Y&ãËVÕ4\u000e\u001c6§\u0012ÈXìë×ªB\u0095\r\u00adÌF\u000e÷/\u0013\u009cû\u0011\u0081Ó%0Ä\n@Á\u009d»H\u008c\u001fÓ=£øE¨=ºÖ)ë¼_ÀpI£\u009c\u001a\u0081ö\u001f7ñ4@B\u0089ªåi6cA2XÞ\u001d¢9\u0082ÎÍÚxh\u0099\u0097\u0013=§\u0001úb4É\u009eÆq\u0089Å¾Û\u0096¬CZÿ#Øh\u0086'\u0087RiXJJ>U@\u008e\fË¥Á®æ\u008asÏ:ä¾\u0007Ì]\u008f?7x\u0001\u00adÓ\u0091\u0083~\u008e\u0015û&iDý\u008ae;\u001a÷Åý÷8_\u009c\"Ëák¼¤Í\u000bÆø\u00989\\·\u00184!\u0005\u00ad¢w¯\r×Þ\u0095\u009e\u0007c\u008aó¦\u0091êÃ\u0091È/\u0007 ëë¿ÑÒßþ=\u0001\u009bï¶\u0090ËõQM\u009a¦B\u001a¢y\u0005\u0011Tòé\u0099iBì\u0010?Í_-ºo}ù[öS*Ö\u0014Bw \u009a#\u001b\u0096\fl/¶ä.¶{~W\u0087î\u0019~\u008a\u008c×Ä¶\u0087ÒoÔ\u001a\u0019A\u0081\u0017\u0018\u000e\u000b\u0095\u0012\u0018\u0090E\u008c~mWÆ\u0013G\u008b/óÕþU\u0018)¼ùXdnOZ\u008e\u001dÆâ\t3ÉèË¡C\u0081\u009d\u008dÞ\u00985\u008a}££CÈ\u0013ö\u0095½^ºÐ\u001böSØ\u0084\u0086=dS\u009dÙ\u0010ß\u0019³Ù0ö\t\u000f.s7\u0018+ aâ\u0017ñ\u007f³Ý\u0019 ks*þq\u001a\u0015:\u0096'>\u009a&\u0084\u0080Ì\u009fr[`\u0099S:p\u0083ÔIzu«î\u0095\u009e\u0095q<@\u008dò£«xf~SóÕ\u000bö\u00919\u0092/£?ü\u0011ø\u0087ì\u008a\u009d\u007fU¶ùhÁÀ\\\u0018´À¸eJ+ln\u0092»\u00adX©µ\u008f¬ï³Ã°\u001aÃ¢mlpP¨Mý\u00ad%vwp\u0012\u0091-.gÅ#\u0017«xPÂ´?£\u0003R\u0095L\u0017ÿé\u0083õ´öN]óB\u001fû\f\u008fN\b,-lAþ\u0094âV¢t+>\u0086\u009c\u001fïwzd¯Ñ±\\ý\u009bjÇ\u0007n!´\u0092iº¤(±«JÈò§§ðÔ#¼\u0089¤rë\u0089y\u0011½@\nÆ\u0081è*¢^-ãÂÜ;\u001d\u0095¬i\u0001\r»ù\u009cg\u0015\u000bàï\u0082ò°ºí±\u0090âo¢^<\u0087\\\u0092\u0091\u00969`\u0002L\u000e÷éÃ\u0094\u0080O\u0004e%¢v>/\u0087½«\u0018\u001ekU×\u00ad÷{l]hÕ\u0082\u0019\u0090\u000bXZ.Âm±\u000eñµ\u0010õmÑ,À»ÔçïB_\u0006ÄéM%8äK\u0099\u007f.³tµ\u001cjÏ\u0095 `¾©BÝ\b\u0014'rRqµ8íCL+^ìÍ\u0084[ñ'öøæ>EêÃ´GÎ\u0006¾\u0098'îÏv¯¡\u0010\u0019>\u000eð2s[7\u008e \u0096¹u\u00968~\u0010Krà·\u0083µ}UKYq¾\u0098âãV\u0010Jy\\ é\u000eÚ\u001ft\u008a T íFö ¾*\u0086\u0099\u009a\u0097dd®\u0091\u000eÒÄUpæÿ\u0097\u009b«\u009f\u009f\u000b\u008bÉ\u0084í\u0002\u009bZ\u001a\u000b\u0010\u009d<\u008e\u0004Â2f¡ïG\u0083§ã\u0095¼2HÏØ\u00adô\u0004\t(\u0086\nr\u00076zRK-¦t\u009e¦+Â\u0019\u0001Ô©¦Ô\u0003V\u009c\tÖ/qÿ`ãë\b%C%Y\u0095\u0082í\u0003\u0013ò^È1\u0007\u008bõ¬ßt\u0013øéqí`M$^/\u0092×± s7\u0092®¢\u0000é\u001ff\u0001GìWÛ(ò\u009b\u0097¼\u0013C\u0012|f\u0006XÁ@ÏUÞË@f³\u001d\u0082\u0011\u0002]-Ø\r÷£àÚ|\u000eô¥\u001dp\u0006®Ek©w\u008f^Ó®÷\"Ì£-|\u0004ÝÿðpÞË\u009b\u007fxjÖ=í4ö½Þ0FìÄD¨ß?ÅU"
         .length();
      char var10 = ' ';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = e(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     v = var14;
                     x = new String[49];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -8125037574565670010L;
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
                     long var30 = ((long)var4[0] & 255L) << 56
                        | ((long)var4[1] & 255L) << 48
                        | ((long)var4[2] & 255L) << 40
                        | ((long)var4[3] & 255L) << 32
                        | ((long)var4[4] & 255L) << 24
                        | ((long)var4[5] & 255L) << 16
                        | ((long)var4[6] & 255L) << 8
                        | (long)var4[7] & 255L;
                     var10001 = -1;
                     P = var30;
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "A²ïK\u0095äH\u0093\nF\u009eµÖg#\u0082Xñ\u0089N\u00972ÁYh\u0083\u0087\u00145W\u0098ÇMñªÚ1Ì¶f\u0096PëKÎ\u009a÷\u0098ÍG\u009b¡3G~Ô,8£9ÀÍ\u0016\u001fÍ\u008dÜ\u00ad\u0018\u000bí2\u0096ÚY«\u0084´q\u001c,g:Þ?Zw§0S[X¿ç,l¾\u0088\t2\rí\u009e\u0090ð";
                  var13 = "A²ïK\u0095äH\u0093\nF\u009eµÖg#\u0082Xñ\u0089N\u00972ÁYh\u0083\u0087\u00145W\u0098ÇMñªÚ1Ì¶f\u0096PëKÎ\u009a÷\u0098ÍG\u009b¡3G~Ô,8£9ÀÍ\u0016\u001fÍ\u008dÜ\u00ad\u0018\u000bí2\u0096ÚY«\u0084´q\u001c,g:Þ?Zw§0S[X¿ç,l¾\u0088\t2\rí\u009e\u0090ð"
                     .length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
   }

   private static gj b(gj var0) {
      return var0;
   }

   private static String e(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4642;
      if (x[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])y.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               y.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/ig", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = v[var5].getBytes("ISO-8859-1");
         x[var5] = e(((Cipher)var4[0]).doFinal(var9));
      }

      return x[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
         throw new RuntimeException("com/zelix/ig" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
