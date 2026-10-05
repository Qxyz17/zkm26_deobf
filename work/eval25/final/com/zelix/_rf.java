package com.zelix;

import java.io.Reader;
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

public class _rf {
   protected static int[] h;
   protected static boolean Q;
   static int v;
   protected static boolean d;
   protected static int C;
   protected static int Y;
   protected static int[] Z;
   protected static Reader G;
   protected static int R;
   protected static char[] m;
   static int f;
   protected static int S;
   public static int w;
   static int W;
   protected static int E;
   private static final long a = ess.a(-7047437509934717083L, 7614497041984511221L, MethodHandles.lookup().lookupClass()).a(232663505730000L);
   private static final String b;
   private static final long[] c;
   private static final Integer[] e;
   private static final Map g;

   public static char Y(long param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/_rf.a J
      // 003: lload 0
      // 004: lxor
      // 005: lstore 0
      // 006: lload 0
      // 007: dup2
      // 008: ldc2_w 124158509775793
      // 00b: lxor
      // 00c: dup2
      // 00d: bipush 48
      // 00f: lushr
      // 010: l2i
      // 011: istore 2
      // 012: dup2
      // 013: bipush 16
      // 015: lshl
      // 016: bipush 32
      // 018: lushr
      // 019: l2i
      // 01a: istore 3
      // 01b: dup2
      // 01c: bipush 48
      // 01e: lshl
      // 01f: bipush 48
      // 021: lushr
      // 022: l2i
      // 023: istore 4
      // 025: pop2
      // 026: dup2
      // 027: ldc2_w 110368773158734
      // 02a: lxor
      // 02b: lstore 5
      // 02d: pop2
      // 02e: ldc2_w -1051198704743328124
      // 031: lload 0
      // 032: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: istore 7
      // 039: getstatic com/zelix/_rf.S I
      // 03c: iload 7
      // 03e: ifne 0a9
      // 041: ifle 0a0
      // 044: goto 051
      // 047: ldc2_w -1511173276359037009
      // 04a: lload 0
      // 04b: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: athrow
      // 051: getstatic com/zelix/_rf.S I
      // 054: bipush 1
      // 055: isub
      // 056: putstatic com/zelix/_rf.S I
      // 059: getstatic com/zelix/_rf.w I
      // 05c: bipush 1
      // 05d: iadd
      // 05e: dup
      // 05f: putstatic com/zelix/_rf.w I
      // 062: iload 7
      // 064: ifne 09f
      // 067: goto 074
      // 06a: ldc2_w -1511173276359037009
      // 06d: lload 0
      // 06e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: athrow
      // 074: getstatic com/zelix/_rf.W I
      // 077: if_icmpne 098
      // 07a: goto 087
      // 07d: ldc2_w -1511173276359037009
      // 080: lload 0
      // 081: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 086: athrow
      // 087: bipush 0
      // 088: putstatic com/zelix/_rf.w I
      // 08b: goto 098
      // 08e: ldc2_w -1511173276359037009
      // 091: lload 0
      // 092: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: getstatic com/zelix/_rf.m [C
      // 09b: getstatic com/zelix/_rf.w I
      // 09e: caload
      // 09f: ireturn
      // 0a0: getstatic com/zelix/_rf.w I
      // 0a3: bipush 1
      // 0a4: iadd
      // 0a5: dup
      // 0a6: putstatic com/zelix/_rf.w I
      // 0a9: iload 7
      // 0ab: lload 0
      // 0ac: lconst_0
      // 0ad: lcmp
      // 0ae: iflt 0b7
      // 0b1: ifne 0f3
      // 0b4: getstatic com/zelix/_rf.R I
      // 0b7: if_icmplt 0ec
      // 0ba: goto 0c7
      // 0bd: ldc2_w -1511173276359037009
      // 0c0: lload 0
      // 0c1: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: lload 5
      // 0c9: bipush 1
      // 0ca: anewarray 158
      // 0cd: dup_x2
      // 0ce: dup_x2
      // 0cf: pop
      // 0d0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d3: bipush 0
      // 0d4: swap
      // 0d5: aastore
      // 0d6: ldc2_w -587270444194834768
      // 0d9: lload 0
      // 0da: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: goto 0ec
      // 0e2: ldc2_w -1511173276359037009
      // 0e5: lload 0
      // 0e6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: getstatic com/zelix/_rf.m [C
      // 0ef: getstatic com/zelix/_rf.w I
      // 0f2: caload
      // 0f3: istore 8
      // 0f5: iload 2
      // 0f6: i2s
      // 0f7: iload 8
      // 0f9: iload 3
      // 0fa: iload 4
      // 0fc: i2c
      // 0fd: invokestatic com/zelix/_rf.H (SCIC)V
      // 100: iload 8
      // 102: ireturn
   }

   public static char[] E(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: bipush 0
      // 03: aaload
      // 04: checkcast java/lang/Integer
      // 07: invokevirtual java/lang/Integer.intValue ()I
      // 0a: istore 1
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/Long
      // 11: invokevirtual java/lang/Long.longValue ()J
      // 14: lstore 2
      // 15: pop
      // 16: getstatic com/zelix/_rf.a J
      // 19: lload 2
      // 1a: lxor
      // 1b: lstore 2
      // 1c: ldc2_w -5847019890540017354
      // 1f: lload 2
      // 20: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25: iload 1
      // 26: newarray 5
      // 28: astore 5
      // 2a: istore 4
      // 2c: iload 4
      // 2e: ifne 98
      // 31: getstatic com/zelix/_rf.w I
      // 34: bipush 1
      // 35: iadd
      // 36: iload 1
      // 37: if_icmplt 70
      // 3a: goto 47
      // 3d: ldc2_w -5425313821166522339
      // 40: lload 2
      // 41: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: getstatic com/zelix/_rf.m [C
      // 4a: lload 2
      // 4b: lconst_0
      // 4c: lcmp
      // 4d: ifle af
      // 50: getstatic com/zelix/_rf.w I
      // 53: iload 1
      // 54: isub
      // 55: bipush 1
      // 56: iadd
      // 57: aload 5
      // 59: bipush 0
      // 5a: iload 1
      // 5b: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 5e: iload 4
      // 60: ifeq ad
      // 63: goto 70
      // 66: ldc2_w -5425313821166522339
      // 69: lload 2
      // 6a: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: getstatic com/zelix/_rf.m [C
      // 73: getstatic com/zelix/_rf.W I
      // 76: iload 1
      // 77: getstatic com/zelix/_rf.w I
      // 7a: isub
      // 7b: bipush 1
      // 7c: isub
      // 7d: isub
      // 7e: aload 5
      // 80: bipush 0
      // 81: iload 1
      // 82: getstatic com/zelix/_rf.w I
      // 85: isub
      // 86: bipush 1
      // 87: isub
      // 88: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 8b: goto 98
      // 8e: ldc2_w -5425313821166522339
      // 91: lload 2
      // 92: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: athrow
      // 98: getstatic com/zelix/_rf.m [C
      // 9b: bipush 0
      // 9c: aload 5
      // 9e: iload 1
      // 9f: getstatic com/zelix/_rf.w I
      // a2: isub
      // a3: bipush 1
      // a4: isub
      // a5: getstatic com/zelix/_rf.w I
      // a8: bipush 1
      // a9: iadd
      // aa: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // ad: aload 5
      // af: areturn
   }

   protected static void D(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Boolean
      // 007: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 00a: istore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 2
      // 015: pop
      // 016: getstatic com/zelix/_rf.a J
      // 019: lload 2
      // 01a: lxor
      // 01b: lstore 2
      // 01c: ldc2_w 4341011380611281985
      // 01f: lload 2
      // 020: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: getstatic com/zelix/_rf.W I
      // 028: sipush 4682
      // 02b: ldc2_w 8735875901510892909
      // 02e: lload 2
      // 02f: lxor
      // 030: invokedynamic a (IJ)I bsm=com/zelix/_rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: iadd
      // 036: newarray 5
      // 038: astore 5
      // 03a: istore 4
      // 03c: getstatic com/zelix/_rf.W I
      // 03f: sipush 19090
      // 042: ldc2_w 6339041329609172406
      // 045: lload 2
      // 046: lxor
      // 047: invokedynamic a (IJ)I bsm=com/zelix/_rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: iadd
      // 04d: newarray 10
      // 04f: astore 6
      // 051: getstatic com/zelix/_rf.W I
      // 054: sipush 19090
      // 057: ldc2_w 6339041329609172406
      // 05a: lload 2
      // 05b: lxor
      // 05c: invokedynamic a (IJ)I bsm=com/zelix/_rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: iadd
      // 062: newarray 10
      // 064: astore 7
      // 066: iload 1
      // 067: iload 4
      // 069: ifeq 181
      // 06c: ifeq 121
      // 06f: goto 07c
      // 072: ldc2_w 2880367238789374801
      // 075: lload 2
      // 076: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: athrow
      // 07c: getstatic com/zelix/_rf.m [C
      // 07f: getstatic com/zelix/_rf.v I
      // 082: aload 5
      // 084: bipush 0
      // 085: getstatic com/zelix/_rf.W I
      // 088: getstatic com/zelix/_rf.v I
      // 08b: isub
      // 08c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 08f: getstatic com/zelix/_rf.m [C
      // 092: bipush 0
      // 093: aload 5
      // 095: getstatic com/zelix/_rf.W I
      // 098: getstatic com/zelix/_rf.v I
      // 09b: isub
      // 09c: getstatic com/zelix/_rf.w I
      // 09f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0a2: aload 5
      // 0a4: putstatic com/zelix/_rf.m [C
      // 0a7: getstatic com/zelix/_rf.Z [I
      // 0aa: getstatic com/zelix/_rf.v I
      // 0ad: aload 6
      // 0af: bipush 0
      // 0b0: getstatic com/zelix/_rf.W I
      // 0b3: getstatic com/zelix/_rf.v I
      // 0b6: isub
      // 0b7: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0ba: getstatic com/zelix/_rf.Z [I
      // 0bd: bipush 0
      // 0be: aload 6
      // 0c0: getstatic com/zelix/_rf.W I
      // 0c3: getstatic com/zelix/_rf.v I
      // 0c6: isub
      // 0c7: getstatic com/zelix/_rf.w I
      // 0ca: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0cd: aload 6
      // 0cf: putstatic com/zelix/_rf.Z [I
      // 0d2: getstatic com/zelix/_rf.h [I
      // 0d5: getstatic com/zelix/_rf.v I
      // 0d8: aload 7
      // 0da: bipush 0
      // 0db: getstatic com/zelix/_rf.W I
      // 0de: getstatic com/zelix/_rf.v I
      // 0e1: isub
      // 0e2: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0e5: getstatic com/zelix/_rf.h [I
      // 0e8: bipush 0
      // 0e9: aload 7
      // 0eb: getstatic com/zelix/_rf.W I
      // 0ee: getstatic com/zelix/_rf.v I
      // 0f1: isub
      // 0f2: getstatic com/zelix/_rf.w I
      // 0f5: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0f8: aload 7
      // 0fa: putstatic com/zelix/_rf.h [I
      // 0fd: getstatic com/zelix/_rf.w I
      // 100: getstatic com/zelix/_rf.W I
      // 103: getstatic com/zelix/_rf.v I
      // 106: isub
      // 107: iadd
      // 108: dup
      // 109: putstatic com/zelix/_rf.w I
      // 10c: putstatic com/zelix/_rf.R I
      // 10f: iload 4
      // 111: ifne 184
      // 114: goto 121
      // 117: ldc2_w 2880367238789374801
      // 11a: lload 2
      // 11b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: getstatic com/zelix/_rf.m [C
      // 124: getstatic com/zelix/_rf.v I
      // 127: aload 5
      // 129: bipush 0
      // 12a: getstatic com/zelix/_rf.W I
      // 12d: getstatic com/zelix/_rf.v I
      // 130: isub
      // 131: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 134: aload 5
      // 136: putstatic com/zelix/_rf.m [C
      // 139: getstatic com/zelix/_rf.Z [I
      // 13c: getstatic com/zelix/_rf.v I
      // 13f: aload 6
      // 141: bipush 0
      // 142: getstatic com/zelix/_rf.W I
      // 145: getstatic com/zelix/_rf.v I
      // 148: isub
      // 149: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 14c: aload 6
      // 14e: putstatic com/zelix/_rf.Z [I
      // 151: getstatic com/zelix/_rf.h [I
      // 154: getstatic com/zelix/_rf.v I
      // 157: aload 7
      // 159: bipush 0
      // 15a: getstatic com/zelix/_rf.W I
      // 15d: getstatic com/zelix/_rf.v I
      // 160: isub
      // 161: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 164: aload 7
      // 166: putstatic com/zelix/_rf.h [I
      // 169: getstatic com/zelix/_rf.w I
      // 16c: getstatic com/zelix/_rf.v I
      // 16f: isub
      // 170: dup
      // 171: putstatic com/zelix/_rf.w I
      // 174: goto 181
      // 177: ldc2_w 2880367238789374801
      // 17a: lload 2
      // 17b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: putstatic com/zelix/_rf.R I
      // 184: goto 19c
      // 187: astore 8
      // 189: new java/lang/Error
      // 18c: dup
      // 18d: aload 8
      // 18f: ldc2_w 4468158898663836947
      // 192: lload 2
      // 193: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 19b: athrow
      // 19c: getstatic com/zelix/_rf.W I
      // 19f: sipush 19090
      // 1a2: ldc2_w 6339041329609172406
      // 1a5: lload 2
      // 1a6: lxor
      // 1a7: invokedynamic a (IJ)I bsm=com/zelix/_rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ac: iadd
      // 1ad: putstatic com/zelix/_rf.W I
      // 1b0: getstatic com/zelix/_rf.W I
      // 1b3: ldc2_w 4347684528316352440
      // 1b6: lload 2
      // 1b7: invokedynamic s (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: bipush 0
      // 1bd: putstatic com/zelix/_rf.v I
      // 1c0: return
   }

   public static char y(int var0, short var1, short var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;
      long var5 = var3 ^ 81082130714083L;
      v = -1;
      char var7 = Y(var5);
      v = w;
      return var7;
   }

   public void X(Object[] var1) {
      Reader var4 = (Reader)var1[0];
      int var6 = (Integer)var1[1];
      long var2 = (Long)var1[2];
      int var5 = (Integer)var1[3];
      var2 = a ^ var2;
      long var7 = var2 ^ 122107180882757L;
      Object[] var10007 = new Object[]{null, null, null, null, a<"a">(7658, 3032780790487046753L ^ var2)};
      var10007[3] = var5;
      var10007[2] = var6;
      var10007[1] = var4;
      var10007[0] = var7;
      x44.a<"i">(this, var10007, -3236291767684756458L, var2);
   }

   public _rf(Reader var1, int var2, long var3, int var5) {
      var3 = a ^ var3;
      long var6 = var3 ^ 108089880402521L;
      this(var1, var2, var5, var6, a<"a">(29660, 3824306356614482915L ^ var3));
   }

   public static int Y() {
      return Z[w];
   }

   public void o(Object[] param1) {
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
      // 0e: checkcast java/io/Reader
      // 11: astore 2
      // 12: dup
      // 13: bipush 2
      // 14: aaload
      // 15: checkcast java/lang/Integer
      // 18: invokevirtual java/lang/Integer.intValue ()I
      // 1b: istore 5
      // 1d: dup
      // 1e: bipush 3
      // 1f: aaload
      // 20: checkcast java/lang/Integer
      // 23: invokevirtual java/lang/Integer.intValue ()I
      // 26: istore 6
      // 28: dup
      // 29: bipush 4
      // 2a: aaload
      // 2b: checkcast java/lang/Integer
      // 2e: invokevirtual java/lang/Integer.intValue ()I
      // 31: istore 7
      // 33: pop
      // 34: getstatic com/zelix/_rf.a J
      // 37: lload 3
      // 38: lxor
      // 39: lstore 3
      // 3a: ldc2_w 14210192141101023
      // 3d: lload 3
      // 3e: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: aload 2
      // 44: ldc2_w 43481868603496902
      // 47: lload 3
      // 48: invokedynamic v (Ljava/io/Reader;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: istore 8
      // 4f: iload 5
      // 51: putstatic com/zelix/_rf.E I
      // 54: iload 6
      // 56: bipush 1
      // 57: isub
      // 58: putstatic com/zelix/_rf.C I
      // 5b: getstatic com/zelix/_rf.m [C
      // 5e: iload 8
      // 60: ifne c7
      // 63: ifnull a7
      // 66: goto 73
      // 69: ldc2_w 1899432354772983540
      // 6c: lload 3
      // 6d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: athrow
      // 73: iload 7
      // 75: lload 3
      // 76: lconst_0
      // 77: lcmp
      // 78: ifle ed
      // 7b: getstatic com/zelix/_rf.m [C
      // 7e: arraylength
      // 7f: iload 8
      // 81: ifne e6
      // 84: goto 91
      // 87: ldc2_w 1899432354772983540
      // 8a: lload 3
      // 8b: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: lload 3
      // 92: lconst_0
      // 93: lcmp
      // 94: ifle e2
      // 97: if_icmpeq d8
      // 9a: goto a7
      // 9d: ldc2_w 1899432354772983540
      // a0: lload 3
      // a1: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: athrow
      // a7: iload 7
      // a9: dup
      // aa: putstatic com/zelix/_rf.W I
      // ad: ldc2_w 140501216673413661
      // b0: lload 3
      // b1: invokedynamic v (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b6: iload 7
      // b8: newarray 5
      // ba: goto c7
      // bd: ldc2_w 1899432354772983540
      // c0: lload 3
      // c1: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: athrow
      // c7: putstatic com/zelix/_rf.m [C
      // ca: iload 7
      // cc: newarray 10
      // ce: putstatic com/zelix/_rf.Z [I
      // d1: iload 7
      // d3: newarray 10
      // d5: putstatic com/zelix/_rf.h [I
      // d8: bipush 0
      // d9: dup
      // da: putstatic com/zelix/_rf.d Z
      // dd: putstatic com/zelix/_rf.Q Z
      // e0: bipush 0
      // e1: dup
      // e2: putstatic com/zelix/_rf.R I
      // e5: dup
      // e6: putstatic com/zelix/_rf.S I
      // e9: putstatic com/zelix/_rf.v I
      // ec: bipush -1
      // ed: putstatic com/zelix/_rf.w I
      // f0: return
   }

   protected static void H(short param0, char param1, int param2, char param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 0
      // 001: i2l
      // 002: bipush 48
      // 004: lshl
      // 005: iload 2
      // 006: i2l
      // 007: bipush 32
      // 009: lshl
      // 00a: bipush 16
      // 00c: lushr
      // 00d: lor
      // 00e: iload 3
      // 00f: i2l
      // 010: bipush 48
      // 012: lshl
      // 013: bipush 48
      // 015: lushr
      // 016: lor
      // 017: getstatic com/zelix/_rf.a J
      // 01a: lxor
      // 01b: lstore 4
      // 01d: ldc2_w -4235026113387524795
      // 020: lload 4
      // 022: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 027: getstatic com/zelix/_rf.C I
      // 02a: bipush 1
      // 02b: iadd
      // 02c: putstatic com/zelix/_rf.C I
      // 02f: istore 6
      // 031: getstatic com/zelix/_rf.Q Z
      // 034: iload 6
      // 036: ifeq 07e
      // 039: ifeq 06d
      // 03c: goto 04a
      // 03f: ldc2_w -2378628102780790187
      // 042: lload 4
      // 044: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: athrow
      // 04a: bipush 0
      // 04b: putstatic com/zelix/_rf.Q Z
      // 04e: getstatic com/zelix/_rf.E I
      // 051: bipush 1
      // 052: dup
      // 053: putstatic com/zelix/_rf.C I
      // 056: iadd
      // 057: putstatic com/zelix/_rf.E I
      // 05a: iload 6
      // 05c: ifne 108
      // 05f: goto 06d
      // 062: ldc2_w -2378628102780790187
      // 065: lload 4
      // 067: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06c: athrow
      // 06d: getstatic com/zelix/_rf.d Z
      // 070: goto 07e
      // 073: ldc2_w -2378628102780790187
      // 076: lload 4
      // 078: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: athrow
      // 07e: iload 6
      // 080: iload 0
      // 081: iflt 10f
      // 084: ifeq 109
      // 087: ifeq 108
      // 08a: goto 098
      // 08d: ldc2_w -2378628102780790187
      // 090: lload 4
      // 092: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: athrow
      // 098: bipush 0
      // 099: putstatic com/zelix/_rf.d Z
      // 09c: iload 1
      // 09d: iload 2
      // 09e: ifle 105
      // 0a1: sipush 17772
      // 0a4: ldc2_w 5156306313601815374
      // 0a7: lload 4
      // 0a9: lxor
      // 0aa: invokedynamic a (IJ)I bsm=com/zelix/_rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: iload 6
      // 0b1: ifeq 104
      // 0b4: goto 0c2
      // 0b7: ldc2_w -2378628102780790187
      // 0ba: lload 4
      // 0bc: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: athrow
      // 0c2: iload 2
      // 0c3: ifle 0f6
      // 0c6: if_icmpne 0ee
      // 0c9: goto 0d7
      // 0cc: ldc2_w -2378628102780790187
      // 0cf: lload 4
      // 0d1: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: bipush 1
      // 0d8: putstatic com/zelix/_rf.Q Z
      // 0db: iload 6
      // 0dd: ifne 108
      // 0e0: goto 0ee
      // 0e3: ldc2_w -2378628102780790187
      // 0e6: lload 4
      // 0e8: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: getstatic com/zelix/_rf.E I
      // 0f1: bipush 1
      // 0f2: dup
      // 0f3: putstatic com/zelix/_rf.C I
      // 0f6: goto 104
      // 0f9: ldc2_w -2378628102780790187
      // 0fc: lload 4
      // 0fe: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: athrow
      // 104: iadd
      // 105: putstatic com/zelix/_rf.E I
      // 108: iload 1
      // 109: iload 3
      // 10a: ifle 149
      // 10d: iload 6
      // 10f: ifeq 140
      // 112: tableswitch 125 9 13 85 58 125 125 45
      // 134: ldc2_w -2378628102780790187
      // 137: lload 4
      // 139: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: bipush 1
      // 140: putstatic com/zelix/_rf.d Z
      // 143: iload 2
      // 144: ifle 1a3
      // 147: iload 6
      // 149: ifne 18f
      // 14c: bipush 1
      // 14d: putstatic com/zelix/_rf.Q Z
      // 150: iload 0
      // 151: iflt 1a3
      // 154: iload 6
      // 156: ifne 18f
      // 159: goto 167
      // 15c: ldc2_w -2378628102780790187
      // 15f: lload 4
      // 161: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: getstatic com/zelix/_rf.C I
      // 16a: bipush 1
      // 16b: isub
      // 16c: putstatic com/zelix/_rf.C I
      // 16f: getstatic com/zelix/_rf.C I
      // 172: getstatic com/zelix/_rf.Y I
      // 175: getstatic com/zelix/_rf.C I
      // 178: getstatic com/zelix/_rf.Y I
      // 17b: irem
      // 17c: isub
      // 17d: iadd
      // 17e: putstatic com/zelix/_rf.C I
      // 181: goto 18f
      // 184: ldc2_w -2378628102780790187
      // 187: lload 4
      // 189: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: athrow
      // 18f: getstatic com/zelix/_rf.Z [I
      // 192: getstatic com/zelix/_rf.w I
      // 195: getstatic com/zelix/_rf.E I
      // 198: iastore
      // 199: getstatic com/zelix/_rf.h [I
      // 19c: getstatic com/zelix/_rf.w I
      // 19f: getstatic com/zelix/_rf.C I
      // 1a2: iastore
      // 1a3: return
   }

   public static int w() {
      return Z[v];
   }

   static {
      long var14 = a ^ 52744105452810L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var14 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var13 = var11.doFinal(
         "\u0003Gi£C\u0014Çkk¢C:Ó¸Å«ó\u009dê<Ì\u0083&\u0014[lÄ¢z/\u0092ß\u0014Lb³Ç\u00059è8º«¾?Góñ9á_\u0015Ëß+Åé2ec%\f4yÃ3~N¨T\rË\u001aP\u0018ÚÁ¶¹åÐ\u000f\u0014ò\u009eÅ¦Ë!\t\u001aÅÕ»ççIRpÌ 4¿.pá\u0097\u0011Eâã\u0094O\u0080$V á¦\u0098ê;Ê\u0085\u000bÇn¸\u0081:°\u0000¯T\u00017c\u0015d\u0080Gìô\u008e-'L\u0084F\u009cý]\u0092\u000e [NÃÉK\u0015¶\n\u0007Q\u0007V\"¼ó3\u001dU=ÜsBE!Ø\u000b@\u0010\u0001a|'\u0015}dE´,\u0089´.\u008f*Ò2"
            .getBytes("ISO-8859-1")
      );
      String var23 = a(var13).intern();
      int var10001 = -1;
      b = var23;
      g = new HashMap(13);
      Cipher var0;
      var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "³\n\u000b7ÿ,R\u000f,=´¶\n¬o\u0088±Þæ!Ä\u0011\u0093C\u0014bE¥Õ\u0018\u00042";
      int var5 = "³\n\u000b7ÿ,R\u000f,=´¶\n¬o\u0088±Þæ!Ä\u0011\u0093C\u0014bE¥Õ\u0018\u00042".length();
      byte var2 = 0;

      label29:
      while (true) {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var18 = var6;
         var10001 = var3++;
         long var25 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var28 = -1;

         while (true) {
            long var8 = var25;
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
            long var30 = ((long)var10[0] & 255L) << 56
               | ((long)var10[1] & 255L) << 48
               | ((long)var10[2] & 255L) << 40
               | ((long)var10[3] & 255L) << 32
               | ((long)var10[4] & 255L) << 24
               | ((long)var10[5] & 255L) << 16
               | ((long)var10[6] & 255L) << 8
               | (long)var10[7] & 255L;
            switch (var28) {
               case 0:
                  var18[var10001] = var30;
                  if (var2 >= var5) {
                     c = var6;
                     e = new Integer[6];
                     w = -1;
                     C = 0;
                     long var22 = 1353337441170326042L ^ var14;
                     E = 1;
                     d = false;
                     Q = false;
                     R = 0;
                     S = 0;
                     Y = a<"a">(12775, var22);
                     return;
                  }
                  break;
               default:
                  var18[var10001] = var30;
                  if (var2 < var5) {
                     continue label29;
                  }

                  var4 = "\u0012Ü\u001b$^ÿM'ñåw/\u000fù'a";
                  var5 = "\u0012Ü\u001b$^ÿM'ñåw/\u000fù'a".length();
                  var2 = 0;
            }

            byte var21 = var2;
            var2 += 8;
            var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
            var18 = var6;
            var10001 = var3++;
            var25 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var28 = 0;
         }
      }
   }

   public static int x() {
      return h[w];
   }

   public _rf(Reader param1, int param2, int param3, long param4, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/_rf.a J
      // 03: lload 4
      // 05: lxor
      // 06: lstore 4
      // 08: ldc2_w 4553767638085695309
      // 0b: lload 4
      // 0d: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12: aload 0
      // 13: invokespecial java/lang/Object.<init> ()V
      // 16: istore 7
      // 18: ldc2_w 4481964275100362607
      // 1b: lload 4
      // 1d: invokedynamic o (JJ)Ljava/io/Reader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: iload 7
      // 24: ifeq 4f
      // 27: ifnull 4e
      // 2a: goto 38
      // 2d: ldc2_w 2663171015855677533
      // 30: lload 4
      // 32: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: athrow
      // 38: new java/lang/Error
      // 3b: dup
      // 3c: getstatic com/zelix/_rf.b Ljava/lang/String;
      // 3f: invokespecial java/lang/Error.<init> (Ljava/lang/String;)V
      // 42: athrow
      // 43: ldc2_w 2663171015855677533
      // 46: lload 4
      // 48: invokedynamic v (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aload 1
      // 4f: ldc2_w 4481964275100362607
      // 52: lload 4
      // 54: invokedynamic w (Ljava/io/Reader;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: iload 2
      // 5a: putstatic com/zelix/_rf.E I
      // 5d: iload 3
      // 5e: bipush 1
      // 5f: isub
      // 60: putstatic com/zelix/_rf.C I
      // 63: iload 6
      // 65: dup
      // 66: putstatic com/zelix/_rf.W I
      // 69: ldc2_w 4565085798340560052
      // 6c: lload 4
      // 6e: invokedynamic w (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: iload 6
      // 75: newarray 5
      // 77: putstatic com/zelix/_rf.m [C
      // 7a: iload 6
      // 7c: newarray 10
      // 7e: putstatic com/zelix/_rf.Z [I
      // 81: iload 6
      // 83: newarray 10
      // 85: putstatic com/zelix/_rf.h [I
      // 88: return
   }

   public static void p(int param0, int param1, int param2, char param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 32
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 32
      // 0c: lushr
      // 0d: lor
      // 0e: iload 3
      // 0f: i2l
      // 10: bipush 48
      // 12: lshl
      // 13: bipush 48
      // 15: lushr
      // 16: lor
      // 17: getstatic com/zelix/_rf.a J
      // 1a: lxor
      // 1b: lstore 4
      // 1d: ldc2_w 7124979369683266206
      // 20: lload 4
      // 22: invokedynamic u (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: getstatic com/zelix/_rf.S I
      // 2a: iload 0
      // 2b: iadd
      // 2c: putstatic com/zelix/_rf.S I
      // 2f: istore 6
      // 31: getstatic com/zelix/_rf.w I
      // 34: iload 0
      // 35: isub
      // 36: dup
      // 37: putstatic com/zelix/_rf.w I
      // 3a: iload 6
      // 3c: ifeq 65
      // 3f: ifge 68
      // 42: goto 50
      // 45: ldc2_w 8729738162668109198
      // 48: lload 4
      // 4a: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: getstatic com/zelix/_rf.w I
      // 53: getstatic com/zelix/_rf.W I
      // 56: iadd
      // 57: goto 65
      // 5a: ldc2_w 8729738162668109198
      // 5d: lload 4
      // 5f: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: athrow
      // 65: putstatic com/zelix/_rf.w I
      // 68: return
   }

   public static int V() {
      return h[v];
   }

   public static String x(long var0) {
      var0 = a ^ var0;

      try {
         if (w >= v) {
            return new String(m, v, w - v + 1);
         }
      } catch (gj var2) {
         throw x44.a<"v">(var2, 6500161816818540189L, var0);
      }

      return new String(m, v, W - v) + new String(m, 0, w + 1);
   }

   protected static void N(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: pop
      // 00c: getstatic com/zelix/_rf.a J
      // 00f: lload 1
      // 010: lxor
      // 011: lstore 1
      // 012: lload 1
      // 013: dup2
      // 014: ldc2_w 31967559689583
      // 017: lxor
      // 018: dup2
      // 019: bipush 32
      // 01b: lushr
      // 01c: l2i
      // 01d: istore 3
      // 01e: dup2
      // 01f: bipush 32
      // 021: lshl
      // 022: bipush 48
      // 024: lushr
      // 025: l2i
      // 026: istore 4
      // 028: dup2
      // 029: bipush 48
      // 02b: lshl
      // 02c: bipush 48
      // 02e: lushr
      // 02f: l2i
      // 030: istore 5
      // 032: pop2
      // 033: dup2
      // 034: ldc2_w 71702159326128
      // 037: lxor
      // 038: lstore 6
      // 03a: pop2
      // 03b: ldc2_w -8616475236654305407
      // 03e: lload 1
      // 03f: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: istore 8
      // 046: getstatic com/zelix/_rf.R I
      // 049: ldc2_w -8526030529385745853
      // 04c: lload 1
      // 04d: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: iload 8
      // 054: ifne 2a1
      // 057: if_icmpne 27b
      // 05a: goto 067
      // 05d: ldc2_w -7925632906353502550
      // 060: lload 1
      // 061: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: athrow
      // 067: ldc2_w -8526030529385745853
      // 06a: lload 1
      // 06b: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: getstatic com/zelix/_rf.W I
      // 073: iload 8
      // 075: lload 1
      // 076: lconst_0
      // 077: lcmp
      // 078: iflt 1b0
      // 07b: ifne 1a8
      // 07e: goto 08b
      // 081: ldc2_w -7925632906353502550
      // 084: lload 1
      // 085: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: lload 1
      // 08c: lconst_0
      // 08d: lcmp
      // 08e: ifle 19b
      // 091: if_icmpne 18f
      // 094: goto 0a1
      // 097: ldc2_w -7925632906353502550
      // 09a: lload 1
      // 09b: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: getstatic com/zelix/_rf.v I
      // 0a4: iload 8
      // 0a6: lload 1
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: iflt 123
      // 0ac: ifne 11b
      // 0af: goto 0bc
      // 0b2: ldc2_w -7925632906353502550
      // 0b5: lload 1
      // 0b6: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: lload 1
      // 0bd: lconst_0
      // 0be: lcmp
      // 0bf: iflt 10e
      // 0c2: sipush 19090
      // 0c5: ldc2_w 6339006569934377037
      // 0c8: lload 1
      // 0c9: lxor
      // 0ca: invokedynamic a (IJ)I bsm=com/zelix/_rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: if_icmple 10b
      // 0d2: goto 0df
      // 0d5: ldc2_w -7925632906353502550
      // 0d8: lload 1
      // 0d9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: bipush 0
      // 0e0: dup
      // 0e1: putstatic com/zelix/_rf.R I
      // 0e4: putstatic com/zelix/_rf.w I
      // 0e7: getstatic com/zelix/_rf.v I
      // 0ea: ldc2_w -8526030529385745853
      // 0ed: lload 1
      // 0ee: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: iload 8
      // 0f5: lload 1
      // 0f6: lconst_0
      // 0f7: lcmp
      // 0f8: ifle 2a0
      // 0fb: ifeq 27b
      // 0fe: goto 10b
      // 101: ldc2_w -7925632906353502550
      // 104: lload 1
      // 105: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: athrow
      // 10b: getstatic com/zelix/_rf.v I
      // 10e: goto 11b
      // 111: ldc2_w -7925632906353502550
      // 114: lload 1
      // 115: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: lload 1
      // 11c: lconst_0
      // 11d: lcmp
      // 11e: ifle 186
      // 121: iload 8
      // 123: ifne 164
      // 126: ifge 156
      // 129: goto 136
      // 12c: ldc2_w -7925632906353502550
      // 12f: lload 1
      // 130: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: athrow
      // 136: bipush 0
      // 137: dup
      // 138: putstatic com/zelix/_rf.R I
      // 13b: putstatic com/zelix/_rf.w I
      // 13e: iload 8
      // 140: lload 1
      // 141: lconst_0
      // 142: lcmp
      // 143: iflt 2a0
      // 146: ifeq 27b
      // 149: goto 156
      // 14c: ldc2_w -7925632906353502550
      // 14f: lload 1
      // 150: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 155: athrow
      // 156: bipush 0
      // 157: goto 164
      // 15a: ldc2_w -7925632906353502550
      // 15d: lload 1
      // 15e: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 163: athrow
      // 164: lload 6
      // 166: bipush 2
      // 167: anewarray 158
      // 16a: dup_x2
      // 16b: dup_x2
      // 16c: pop
      // 16d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 170: bipush 1
      // 171: swap
      // 172: aastore
      // 173: dup_x1
      // 174: swap
      // 175: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 178: bipush 0
      // 179: swap
      // 17a: aastore
      // 17b: ldc2_w -8603595764300625048
      // 17e: lload 1
      // 17f: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 184: iload 8
      // 186: lload 1
      // 187: lconst_0
      // 188: lcmp
      // 189: iflt 2a0
      // 18c: ifeq 27b
      // 18f: ldc2_w -8526030529385745853
      // 192: lload 1
      // 193: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 198: getstatic com/zelix/_rf.v I
      // 19b: goto 1a8
      // 19e: ldc2_w -7925632906353502550
      // 1a1: lload 1
      // 1a2: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: athrow
      // 1a8: lload 1
      // 1a9: lconst_0
      // 1aa: lcmp
      // 1ab: ifle 226
      // 1ae: iload 8
      // 1b0: ifne 226
      // 1b3: if_icmple 1e7
      // 1b6: goto 1c3
      // 1b9: ldc2_w -7925632906353502550
      // 1bc: lload 1
      // 1bd: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: getstatic com/zelix/_rf.W I
      // 1c6: ldc2_w -8526030529385745853
      // 1c9: lload 1
      // 1ca: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: iload 8
      // 1d1: lload 1
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: ifle 2a0
      // 1d7: ifeq 27b
      // 1da: goto 1e7
      // 1dd: ldc2_w -7925632906353502550
      // 1e0: lload 1
      // 1e1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: athrow
      // 1e7: getstatic com/zelix/_rf.v I
      // 1ea: ldc2_w -8526030529385745853
      // 1ed: lload 1
      // 1ee: lload 1
      // 1ef: lconst_0
      // 1f0: lcmp
      // 1f1: ifle 276
      // 1f4: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: isub
      // 1fa: iload 8
      // 1fc: ifne 272
      // 1ff: goto 20c
      // 202: ldc2_w -7925632906353502550
      // 205: lload 1
      // 206: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: athrow
      // 20c: sipush 19090
      // 20f: ldc2_w 6339006569934377037
      // 212: lload 1
      // 213: lxor
      // 214: invokedynamic a (IJ)I bsm=com/zelix/_rf.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 219: goto 226
      // 21c: ldc2_w -7925632906353502550
      // 21f: lload 1
      // 220: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 225: athrow
      // 226: if_icmpge 262
      // 229: bipush 1
      // 22a: lload 6
      // 22c: bipush 2
      // 22d: anewarray 158
      // 230: dup_x2
      // 231: dup_x2
      // 232: pop
      // 233: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 236: bipush 1
      // 237: swap
      // 238: aastore
      // 239: dup_x1
      // 23a: swap
      // 23b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 23e: bipush 0
      // 23f: swap
      // 240: aastore
      // 241: ldc2_w -8603595764300625048
      // 244: lload 1
      // 245: invokedynamic q (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: iload 8
      // 24c: lload 1
      // 24d: lconst_0
      // 24e: lcmp
      // 24f: ifle 2a0
      // 252: ifeq 27b
      // 255: goto 262
      // 258: ldc2_w -7925632906353502550
      // 25b: lload 1
      // 25c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 261: athrow
      // 262: getstatic com/zelix/_rf.v I
      // 265: goto 272
      // 268: ldc2_w -7925632906353502550
      // 26b: lload 1
      // 26c: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: athrow
      // 272: ldc2_w -8526030529385745853
      // 275: lload 1
      // 276: invokedynamic p (IJJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27b: ldc2_w -8591698261166812776
      // 27e: lload 1
      // 27f: invokedynamic h (JJ)Ljava/io/Reader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: getstatic com/zelix/_rf.m [C
      // 287: getstatic com/zelix/_rf.R I
      // 28a: ldc2_w -8526030529385745853
      // 28d: lload 1
      // 28e: invokedynamic h (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: getstatic com/zelix/_rf.R I
      // 296: isub
      // 297: ldc2_w -8127029688935367545
      // 29a: lload 1
      // 29b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;IIJJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: dup
      // 2a1: istore 9
      // 2a3: lload 1
      // 2a4: lconst_0
      // 2a5: lcmp
      // 2a6: ifle 2e9
      // 2a9: bipush -1
      // 2aa: iload 8
      // 2ac: ifne 2e8
      // 2af: if_icmpne 2e3
      // 2b2: goto 2bf
      // 2b5: ldc2_w -7925632906353502550
      // 2b8: lload 1
      // 2b9: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: athrow
      // 2bf: ldc2_w -8591698261166812776
      // 2c2: lload 1
      // 2c3: invokedynamic h (JJ)Ljava/io/Reader; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c8: ldc2_w -8537520424185418103
      // 2cb: lload 1
      // 2cc: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: new java/io/IOException
      // 2d4: dup
      // 2d5: invokespecial java/io/IOException.<init> ()V
      // 2d8: athrow
      // 2d9: ldc2_w -7925632906353502550
      // 2dc: lload 1
      // 2dd: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: athrow
      // 2e3: getstatic com/zelix/_rf.R I
      // 2e6: iload 9
      // 2e8: iadd
      // 2e9: putstatic com/zelix/_rf.R I
      // 2ec: return
      // 2ed: astore 10
      // 2ef: getstatic com/zelix/_rf.w I
      // 2f2: bipush 1
      // 2f3: isub
      // 2f4: putstatic com/zelix/_rf.w I
      // 2f7: bipush 0
      // 2f8: iload 3
      // 2f9: iload 4
      // 2fb: iload 5
      // 2fd: i2c
      // 2fe: invokestatic com/zelix/_rf.p (IIIC)V
      // 301: getstatic com/zelix/_rf.v I
      // 304: iload 8
      // 306: lload 1
      // 307: lconst_0
      // 308: lcmp
      // 309: iflt 310
      // 30c: ifne 330
      // 30f: bipush -1
      // 310: if_icmpne 333
      // 313: goto 320
      // 316: ldc2_w -7925632906353502550
      // 319: lload 1
      // 31a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: athrow
      // 320: getstatic com/zelix/_rf.w I
      // 323: goto 330
      // 326: ldc2_w -7925632906353502550
      // 329: lload 1
      // 32a: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Throwable; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32f: athrow
      // 330: putstatic com/zelix/_rf.v I
      // 333: aload 10
      // 335: athrow
   }

   private static Throwable a(Throwable var0) {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6333;
      if (e[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/_rf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/_rf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
