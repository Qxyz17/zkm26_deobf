package com.zelix;

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

public class lom {
   private final hz[] h;
   private final e s;
   private final l T;
   private static boolean[][][] B;
   private final bc I;
   private final String J;
   private static final long a = prr.a(-7754686077551777261L, 7224157114327018093L, MethodHandles.lookup().lookupClass()).a(163647646743404L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private static boolean[][] u(Object[] param0) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 5
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Long
      // 012: invokevirtual java/lang/Long.longValue ()J
      // 015: lstore 2
      // 016: dup
      // 017: bipush 2
      // 018: aaload
      // 019: checkcast [Z
      // 01c: astore 1
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast [[Z
      // 023: astore 4
      // 025: pop
      // 026: getstatic com/zelix/lom.a J
      // 029: lload 2
      // 02a: lxor
      // 02b: lstore 2
      // 02c: ldc2_w 7567885702116318678
      // 02f: lload 2
      // 030: invokedynamic l (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: aload 4
      // 037: astore 7
      // 039: astore 6
      // 03b: bipush 0
      // 03c: istore 8
      // 03e: iload 8
      // 040: aload 1
      // 041: arraylength
      // 042: if_icmpge 15b
      // 045: aload 1
      // 046: iload 8
      // 048: baload
      // 049: aload 6
      // 04b: ifnonnull 070
      // 04e: ifeq 153
      // 051: goto 05e
      // 054: ldc2_w 7551938844415099143
      // 057: lload 2
      // 058: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: aload 7
      // 060: arraylength
      // 061: bipush 2
      // 062: idiv
      // 063: goto 070
      // 066: ldc2_w 7551938844415099143
      // 069: lload 2
      // 06a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: athrow
      // 070: iload 5
      // 072: multianewarray 199 2
      // 076: astore 9
      // 078: ldc2_w 2.0
      // 07b: iload 8
      // 07d: bipush 1
      // 07e: iadd
      // 07f: i2d
      // 080: ldc2_w 7656590836413585751
      // 083: lload 2
      // 084: invokedynamic l (DDJJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: d2i
      // 08a: istore 10
      // 08c: aload 4
      // 08e: arraylength
      // 08f: iload 10
      // 091: idiv
      // 092: istore 11
      // 094: bipush 1
      // 095: istore 12
      // 097: bipush 0
      // 098: istore 13
      // 09a: bipush 1
      // 09b: istore 14
      // 09d: bipush 0
      // 09e: istore 15
      // 0a0: iload 15
      // 0a2: aload 7
      // 0a4: arraylength
      // 0a5: if_icmpge 149
      // 0a8: iload 12
      // 0aa: aload 6
      // 0ac: ifnonnull 040
      // 0af: aload 6
      // 0b1: lload 2
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: iflt 04b
      // 0b7: ifnonnull 108
      // 0ba: ifeq 0eb
      // 0bd: goto 0ca
      // 0c0: ldc2_w 7551938844415099143
      // 0c3: lload 2
      // 0c4: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 7
      // 0cc: iload 15
      // 0ce: aaload
      // 0cf: bipush 0
      // 0d0: aload 9
      // 0d2: iload 13
      // 0d4: aaload
      // 0d5: bipush 0
      // 0d6: iload 5
      // 0d8: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 0db: iinc 13 1
      // 0de: goto 0eb
      // 0e1: ldc2_w 7551938844415099143
      // 0e4: lload 2
      // 0e5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ea: athrow
      // 0eb: iinc 14 1
      // 0ee: aload 6
      // 0f0: lload 2
      // 0f1: lconst_0
      // 0f2: lcmp
      // 0f3: iflt 146
      // 0f6: ifnonnull 144
      // 0f9: iload 14
      // 0fb: goto 108
      // 0fe: ldc2_w 7551938844415099143
      // 101: lload 2
      // 102: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 107: athrow
      // 108: lload 2
      // 109: lconst_0
      // 10a: lcmp
      // 10b: ifle 115
      // 10e: iload 11
      // 110: if_icmple 141
      // 113: iload 12
      // 115: aload 6
      // 117: ifnonnull 138
      // 11a: goto 127
      // 11d: ldc2_w 7551938844415099143
      // 120: lload 2
      // 121: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: ifne 13b
      // 12a: goto 137
      // 12d: ldc2_w 7551938844415099143
      // 130: lload 2
      // 131: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: athrow
      // 137: bipush 1
      // 138: goto 13c
      // 13b: bipush 0
      // 13c: istore 12
      // 13e: bipush 1
      // 13f: istore 14
      // 141: iinc 15 1
      // 144: aload 6
      // 146: ifnull 0a0
      // 149: aload 9
      // 14b: lload 2
      // 14c: lconst_0
      // 14d: lcmp
      // 14e: ifle 163
      // 151: astore 7
      // 153: iinc 8 1
      // 156: aload 6
      // 158: ifnull 03e
      // 15b: aload 7
      // 15d: lload 2
      // 15e: lconst_0
      // 15f: lcmp
      // 160: iflt 076
      // 163: areturn
   }

   private boolean[][] a(Object[] var1) {
      int var6 = (Integer)var1[0];
      Integer[] var5 = (Integer[])var1[1];
      boolean[][] var4 = (boolean[][])var1[2];
      long var2 = (Long)var1[3];
      var2 = a ^ var2;
      long var7 = var2 ^ 109339678173378L;
      long var9 = var2 ^ 104484488917697L;
      Object[] var10005 = new Object[]{null, var5, var7};
      var10005[0] = var6;
      boolean[] var11 = m44.a<"l">(this, var10005, 4373195132955736349L, var2);
      var10005 = new Object[]{null, var9, var11, var4};
      var10005[0] = var6;
      return m44.a<"m">(var10005, 4430582921888465729L, var2);
   }

   static boolean[][] F(Object[] param0) {
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
      // 004: checkcast java/lang/Integer
      // 007: invokevirtual java/lang/Integer.intValue ()I
      // 00a: istore 3
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/Long
      // 011: invokevirtual java/lang/Long.longValue ()J
      // 014: lstore 1
      // 015: pop
      // 016: getstatic com/zelix/lom.a J
      // 019: lload 1
      // 01a: lxor
      // 01b: lstore 1
      // 01c: ldc2_w 4685955163223406039
      // 01f: lload 1
      // 020: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: astore 4
      // 027: ldc2_w 6570491205055862310
      // 02a: lload 1
      // 02b: invokedynamic i (JJ)[[[Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: iload 3
      // 031: aaload
      // 032: aload 4
      // 034: ifnonnull 126
      // 037: ifnonnull 11b
      // 03a: goto 047
      // 03d: ldc2_w 4669314490199058694
      // 040: lload 1
      // 041: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: athrow
      // 047: ldc2_w 2.0
      // 04a: iload 3
      // 04b: i2d
      // 04c: ldc2_w 4774079880604250454
      // 04f: lload 1
      // 050: invokedynamic m (DDJJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 055: d2i
      // 056: istore 5
      // 058: iload 5
      // 05a: iload 3
      // 05b: multianewarray 199 2
      // 05f: astore 6
      // 061: bipush 0
      // 062: istore 7
      // 064: iload 7
      // 066: iload 3
      // 067: if_icmpge 108
      // 06a: ldc2_w 2.0
      // 06d: iload 7
      // 06f: bipush 1
      // 070: iadd
      // 071: i2d
      // 072: ldc2_w 4774079880604250454
      // 075: lload 1
      // 076: invokedynamic m (DDJJ)D bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: d2i
      // 07c: istore 8
      // 07e: iload 5
      // 080: iload 8
      // 082: idiv
      // 083: istore 9
      // 085: bipush 1
      // 086: istore 10
      // 088: bipush 0
      // 089: istore 11
      // 08b: aload 4
      // 08d: ifnonnull 11b
      // 090: bipush 0
      // 091: istore 12
      // 093: iload 12
      // 095: iload 5
      // 097: if_icmpge 0fa
      // 09a: iinc 11 1
      // 09d: aload 4
      // 09f: lload 1
      // 0a0: lconst_0
      // 0a1: lcmp
      // 0a2: iflt 0f7
      // 0a5: ifnonnull 0f5
      // 0a8: iload 11
      // 0aa: iload 9
      // 0ac: aload 4
      // 0ae: ifnonnull 067
      // 0b1: lload 1
      // 0b2: lconst_0
      // 0b3: lcmp
      // 0b4: ifle 082
      // 0b7: goto 0c4
      // 0ba: ldc2_w 4669314490199058694
      // 0bd: lload 1
      // 0be: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: athrow
      // 0c4: if_icmple 0e8
      // 0c7: bipush 1
      // 0c8: istore 11
      // 0ca: iload 10
      // 0cc: aload 4
      // 0ce: ifnonnull 0e2
      // 0d1: ifne 0e5
      // 0d4: goto 0e1
      // 0d7: ldc2_w 4669314490199058694
      // 0da: lload 1
      // 0db: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: athrow
      // 0e1: bipush 1
      // 0e2: goto 0e6
      // 0e5: bipush 0
      // 0e6: istore 10
      // 0e8: aload 6
      // 0ea: iload 12
      // 0ec: aaload
      // 0ed: iload 7
      // 0ef: iload 10
      // 0f1: bastore
      // 0f2: iinc 12 1
      // 0f5: aload 4
      // 0f7: ifnull 093
      // 0fa: iinc 7 1
      // 0fd: aload 4
      // 0ff: lload 1
      // 100: lconst_0
      // 101: lcmp
      // 102: ifle 09f
      // 105: ifnull 064
      // 108: ldc2_w 6570491205055862310
      // 10b: lload 1
      // 10c: invokedynamic i (JJ)[[[Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: iload 3
      // 112: lload 1
      // 113: lconst_0
      // 114: lcmp
      // 115: iflt 125
      // 118: aload 6
      // 11a: aastore
      // 11b: ldc2_w 6570491205055862310
      // 11e: lload 1
      // 11f: invokedynamic i (JJ)[[[Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 124: iload 3
      // 125: aaload
      // 126: areturn
   }

   private _z[] l(Object[] param1) {
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
      // 00a: istore 10
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast [Ljava/lang/Integer;
      // 012: astore 7
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast [Z
      // 01a: astore 9
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast java/lang/Long
      // 022: invokevirtual java/lang/Long.longValue ()J
      // 025: lstore 2
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast com/zelix/k6
      // 02c: astore 6
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast com/zelix/t6
      // 034: astore 12
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/util/Set
      // 03d: astore 4
      // 03f: dup
      // 040: bipush 7
      // 042: aaload
      // 043: checkcast java/util/List
      // 046: astore 8
      // 048: dup
      // 049: bipush 8
      // 04b: aaload
      // 04c: checkcast java/util/Map
      // 04f: astore 11
      // 051: dup
      // 052: bipush 9
      // 054: aaload
      // 055: checkcast java/util/Map
      // 058: astore 5
      // 05a: pop
      // 05b: getstatic com/zelix/lom.a J
      // 05e: lload 2
      // 05f: lxor
      // 060: lstore 2
      // 061: lload 2
      // 062: dup2
      // 063: ldc2_w 6993860620861
      // 066: lxor
      // 067: dup2
      // 068: bipush 32
      // 06a: lushr
      // 06b: l2i
      // 06c: istore 13
      // 06e: dup2
      // 06f: bipush 32
      // 071: lshl
      // 072: bipush 48
      // 074: lushr
      // 075: l2i
      // 076: istore 14
      // 078: dup2
      // 079: bipush 48
      // 07b: lshl
      // 07c: bipush 48
      // 07e: lushr
      // 07f: l2i
      // 080: istore 15
      // 082: pop2
      // 083: dup2
      // 084: ldc2_w 50926519771310
      // 087: lxor
      // 088: lstore 16
      // 08a: dup2
      // 08b: ldc2_w 12501639989536
      // 08e: lxor
      // 08f: lstore 18
      // 091: dup2
      // 092: ldc2_w 27996560560550
      // 095: lxor
      // 096: lstore 20
      // 098: dup2
      // 099: ldc2_w 51820248998941
      // 09c: lxor
      // 09d: lstore 22
      // 09f: dup2
      // 0a0: ldc2_w 1690466570015
      // 0a3: lxor
      // 0a4: lstore 24
      // 0a6: dup2
      // 0a7: ldc2_w 135326897480556
      // 0aa: lxor
      // 0ab: lstore 26
      // 0ad: pop2
      // 0ae: new com/zelix/lb6
      // 0b1: dup
      // 0b2: bipush -1
      // 0b3: invokespecial com/zelix/lb6.<init> (I)V
      // 0b6: astore 29
      // 0b8: ldc2_w 7204802817972279084
      // 0bb: lload 2
      // 0bc: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: new com/zelix/sz
      // 0c4: dup
      // 0c5: iload 13
      // 0c7: iload 14
      // 0c9: i2s
      // 0ca: iload 15
      // 0cc: i2c
      // 0cd: invokespecial com/zelix/sz.<init> (ISC)V
      // 0d0: astore 30
      // 0d2: new com/zelix/sz
      // 0d5: dup
      // 0d6: iload 13
      // 0d8: iload 14
      // 0da: i2s
      // 0db: iload 15
      // 0dd: i2c
      // 0de: invokespecial com/zelix/sz.<init> (ISC)V
      // 0e1: astore 31
      // 0e3: aload 30
      // 0e5: aload 6
      // 0e7: aload 0
      // 0e8: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 0eb: bipush 0
      // 0ec: aaload
      // 0ed: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 0f0: aload 12
      // 0f2: lload 16
      // 0f4: aload 4
      // 0f6: aload 8
      // 0f8: bipush 1
      // 0f9: aload 11
      // 0fb: aload 5
      // 0fd: invokestatic com/zelix/ss.s (Lcom/zelix/ko;[Lcom/zelix/v7;Lcom/zelix/t6;JLjava/util/Set;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;)[Lcom/zelix/ss;
      // 100: lload 26
      // 102: dup2_x1
      // 103: pop2
      // 104: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 107: aload 31
      // 109: bipush 0
      // 10a: anewarray 505
      // 10d: lload 26
      // 10f: dup2_x1
      // 110: pop2
      // 111: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 114: astore 28
      // 116: aload 7
      // 118: arraylength
      // 119: anewarray 375
      // 11c: astore 32
      // 11e: bipush 0
      // 11f: istore 33
      // 121: iload 33
      // 123: aload 7
      // 125: arraylength
      // 126: if_icmpge 343
      // 129: aload 7
      // 12b: iload 33
      // 12d: aaload
      // 12e: invokevirtual java/lang/Integer.intValue ()I
      // 131: istore 34
      // 133: aload 0
      // 134: getfield com/zelix/lom.s Lcom/zelix/e;
      // 137: iload 34
      // 139: invokevirtual com/zelix/e.get (I)Ljava/lang/Object;
      // 13c: checkcast com/zelix/iq
      // 13f: astore 35
      // 141: aload 0
      // 142: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 145: iload 34
      // 147: aaload
      // 148: astore 36
      // 14a: aload 36
      // 14c: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 14f: astore 37
      // 151: aload 36
      // 153: lload 20
      // 155: bipush 1
      // 156: anewarray 398
      // 159: dup_x2
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15f: bipush 0
      // 160: swap
      // 161: aastore
      // 162: ldc2_w 8893636904385946549
      // 165: lload 2
      // 166: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: astore 38
      // 16d: iload 10
      // 16f: anewarray 262
      // 172: astore 39
      // 174: bipush 0
      // 175: istore 40
      // 177: iload 40
      // 179: iload 10
      // 17b: if_icmpge 310
      // 17e: aload 9
      // 180: iload 40
      // 182: baload
      // 183: aload 28
      // 185: ifnonnull 123
      // 188: lload 2
      // 189: lconst_0
      // 18a: lcmp
      // 18b: ifle 175
      // 18e: ifeq 1b3
      // 191: aload 39
      // 193: iload 40
      // 195: aload 37
      // 197: iload 40
      // 199: aaload
      // 19a: aastore
      // 19b: lload 2
      // 19c: lconst_0
      // 19d: lcmp
      // 19e: iflt 1ca
      // 1a1: aload 28
      // 1a3: ifnull 1ca
      // 1a6: goto 1b3
      // 1a9: ldc2_w 7077404973554207741
      // 1ac: lload 2
      // 1ad: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: athrow
      // 1b3: aload 39
      // 1b5: iload 40
      // 1b7: aload 38
      // 1b9: iload 40
      // 1bb: aaload
      // 1bc: aastore
      // 1bd: goto 1ca
      // 1c0: ldc2_w 7077404973554207741
      // 1c3: lload 2
      // 1c4: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: iload 40
      // 1cc: aload 28
      // 1ce: lload 2
      // 1cf: lconst_0
      // 1d0: lcmp
      // 1d1: iflt 200
      // 1d4: ifnonnull 1fe
      // 1d7: ifle 308
      // 1da: goto 1e7
      // 1dd: ldc2_w 7077404973554207741
      // 1e0: lload 2
      // 1e1: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e6: athrow
      // 1e7: aload 39
      // 1e9: iload 40
      // 1eb: aaload
      // 1ec: lload 18
      // 1ee: invokevirtual com/zelix/v7.i (J)Z
      // 1f1: goto 1fe
      // 1f4: ldc2_w 7077404973554207741
      // 1f7: lload 2
      // 1f8: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: athrow
      // 1fe: aload 28
      // 200: ifnonnull 2ac
      // 203: ifeq 280
      // 206: goto 213
      // 209: ldc2_w 7077404973554207741
      // 20c: lload 2
      // 20d: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: athrow
      // 213: aload 39
      // 215: iload 40
      // 217: bipush 1
      // 218: isub
      // 219: aaload
      // 21a: lload 24
      // 21c: bipush 1
      // 21d: anewarray 398
      // 220: dup_x2
      // 221: dup_x2
      // 222: pop
      // 223: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 226: bipush 0
      // 227: swap
      // 228: aastore
      // 229: ldc2_w 6979407059711637862
      // 22c: lload 2
      // 22d: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: aload 28
      // 234: lload 2
      // 235: lconst_0
      // 236: lcmp
      // 237: iflt 2b4
      // 23a: ifnonnull 2ac
      // 23d: goto 24a
      // 240: ldc2_w 7077404973554207741
      // 243: lload 2
      // 244: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 249: athrow
      // 24a: lload 2
      // 24b: lconst_0
      // 24c: lcmp
      // 24d: iflt 29f
      // 250: ifne 280
      // 253: goto 260
      // 256: ldc2_w 7077404973554207741
      // 259: lload 2
      // 25a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25f: athrow
      // 260: aload 39
      // 262: iload 40
      // 264: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // 267: aastore
      // 268: aload 28
      // 26a: lload 2
      // 26b: lconst_0
      // 26c: lcmp
      // 26d: ifle 30d
      // 270: ifnull 308
      // 273: goto 280
      // 276: ldc2_w 7077404973554207741
      // 279: lload 2
      // 27a: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27f: athrow
      // 280: aload 39
      // 282: iload 40
      // 284: bipush 1
      // 285: isub
      // 286: aaload
      // 287: lload 24
      // 289: bipush 1
      // 28a: anewarray 398
      // 28d: dup_x2
      // 28e: dup_x2
      // 28f: pop
      // 290: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 293: bipush 0
      // 294: swap
      // 295: aastore
      // 296: ldc2_w 6979407059711637862
      // 299: lload 2
      // 29a: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29f: goto 2ac
      // 2a2: ldc2_w 7077404973554207741
      // 2a5: lload 2
      // 2a6: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ab: athrow
      // 2ac: lload 2
      // 2ad: lconst_0
      // 2ae: lcmp
      // 2af: iflt 2f0
      // 2b2: aload 28
      // 2b4: ifnonnull 2f0
      // 2b7: ifeq 308
      // 2ba: goto 2c7
      // 2bd: ldc2_w 7077404973554207741
      // 2c0: lload 2
      // 2c1: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: athrow
      // 2c7: aload 39
      // 2c9: iload 40
      // 2cb: aload 28
      // 2cd: ifnonnull 304
      // 2d0: goto 2dd
      // 2d3: ldc2_w 7077404973554207741
      // 2d6: lload 2
      // 2d7: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: athrow
      // 2dd: aaload
      // 2de: lload 18
      // 2e0: invokevirtual com/zelix/v7.i (J)Z
      // 2e3: goto 2f0
      // 2e6: ldc2_w 7077404973554207741
      // 2e9: lload 2
      // 2ea: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: athrow
      // 2f0: ifne 308
      // 2f3: aload 39
      // 2f5: iload 40
      // 2f7: goto 304
      // 2fa: ldc2_w 7077404973554207741
      // 2fd: lload 2
      // 2fe: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: athrow
      // 304: getstatic com/zelix/v7.k Lcom/zelix/v7;
      // 307: aastore
      // 308: iinc 40 1
      // 30b: aload 28
      // 30d: ifnull 177
      // 310: aload 32
      // 312: iload 33
      // 314: aload 6
      // 316: aload 35
      // 318: aload 36
      // 31a: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 31d: aload 39
      // 31f: aload 12
      // 321: aload 4
      // 323: lload 22
      // 325: aload 8
      // 327: aload 29
      // 329: aload 31
      // 32b: aload 30
      // 32d: aload 11
      // 32f: aload 5
      // 331: invokestatic com/zelix/_z.D (Lcom/zelix/k6;Lcom/zelix/iq;[Lcom/zelix/v7;[Lcom/zelix/v7;Lcom/zelix/t6;Ljava/util/Set;JLjava/util/List;Lcom/zelix/lb6;Lcom/zelix/sz;Lcom/zelix/sz;Ljava/util/Map;Ljava/util/Map;)Lcom/zelix/_z;
      // 334: aastore
      // 335: iinc 33 1
      // 338: aload 28
      // 33a: lload 2
      // 33b: lconst_0
      // 33c: lcmp
      // 33d: iflt 13c
      // 340: ifnull 121
      // 343: lload 2
      // 344: lconst_0
      // 345: lcmp
      // 346: ifle 129
      // 349: aload 32
      // 34b: areturn
   }

   static {
      long var20 = a ^ 6706937681643L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "<ÔÜ5¶\u0083\u0000¦ \u0098ghª,IY(g]É\u0096 lè>YÁ\u0002!³j\u000b?ÍÍ.%¡v0\u0087å¯z@}\u0096-UübA´+\u0006£\n(üÂ¿g\u0012_ÆaB¾(ñ\u0019FÛ©3\u001f\u009cßD¼\u009a`\u0014r1kõÁ\u0019×\fw\u008b~D\u008cR\u009d";
      int var17 = "<ÔÜ5¶\u0083\u0000¦ \u0098ghª,IY(g]É\u0096 lè>YÁ\u0002!³j\u000b?ÍÍ.%¡v0\u0087å¯z@}\u0096-UübA´+\u0006£\n(üÂ¿g\u0012_ÆaB¾(ñ\u0019FÛ©3\u001f\u009cßD¼\u009a`\u0014r1kõÁ\u0019×\fw\u008b~D\u008cR\u009d"
         .length();
      char var14 = 16;
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var36;
                  if ((var24 += var14) >= var17) {
                     b = var18;
                     c = new String[5];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "\u0017wT\u000e\u009b\u008b\bv\u0004\u0000µO¹\u0095<Â\u0010ó\u0081l6\u0004õ\u0083\"\u008eqÉ5g».µ\u001cªF\u0091£lCRÏM\u0083>Ô,Ê";
                     int var5 = "\u0017wT\u000e\u009b\u008b\bv\u0004\u0000µO¹\u0095<Â\u0010ó\u0081l6\u0004õ\u0083\"\u008eqÉ5g».µ\u001cªF\u0091£lCRÏM\u0083>Ô,Ê"
                        .length();
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
                                    e = var6;
                                    f = new Integer[8];
                                    m44.a<"o">(new boolean[b<"c">(32107, 6003501289198723625L ^ var20)][][], -5017473882552912041L, var20);
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "ZDÌfBSæ®\u0099Aì\u008ae2\u0018\u0002";
                                 var5 = "ZDÌfBSæ®\u0099Aì\u008ae2\u0018\u0002".length();
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

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var36;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label54;
                  }

                  var15 = "\u0084y\u0082\n4¶\u0014°3\u0088÷\u009bîìH \u0010óÌñQ+º\u000b³@÷?Meü£\u009c";
                  var17 = "\u0084y\u0082\n4¶\u0014°3\u0088÷\u009bîìH \u0010óÌñQ+º\u000b³@÷?Meü£\u009c".length();
                  var14 = 16;
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public _z[] M(Object[] param1) {
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
      // 00a: istore 7
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast com/zelix/k6
      // 012: astore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast com/zelix/t6
      // 01a: astore 8
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast java/lang/Long
      // 022: invokevirtual java/lang/Long.longValue ()J
      // 025: lstore 2
      // 026: dup
      // 027: bipush 4
      // 028: aaload
      // 029: checkcast java/util/Set
      // 02c: astore 4
      // 02e: dup
      // 02f: bipush 5
      // 030: aaload
      // 031: checkcast java/util/List
      // 034: astore 6
      // 036: pop
      // 037: getstatic com/zelix/lom.a J
      // 03a: lload 2
      // 03b: lxor
      // 03c: lstore 2
      // 03d: lload 2
      // 03e: dup2
      // 03f: ldc2_w 113728290526041
      // 042: lxor
      // 043: lstore 9
      // 045: dup2
      // 046: ldc2_w 29705261610901
      // 049: lxor
      // 04a: lstore 11
      // 04c: dup2
      // 04d: ldc2_w 40329678220532
      // 050: lxor
      // 051: lstore 13
      // 053: dup2
      // 054: ldc2_w 93858801686015
      // 057: lxor
      // 058: lstore 15
      // 05a: dup2
      // 05b: ldc2_w 25784830192604
      // 05e: lxor
      // 05f: lstore 17
      // 061: dup2
      // 062: ldc2_w 80518675861727
      // 065: lxor
      // 066: dup2
      // 067: bipush 48
      // 069: lushr
      // 06a: l2i
      // 06b: istore 19
      // 06d: dup2
      // 06e: bipush 16
      // 070: lshl
      // 071: bipush 16
      // 073: lushr
      // 074: lstore 20
      // 076: pop2
      // 077: dup2
      // 078: ldc2_w 94464434161959
      // 07b: lxor
      // 07c: lstore 22
      // 07e: dup2
      // 07f: ldc2_w 22443297846791
      // 082: lxor
      // 083: lstore 24
      // 085: dup2
      // 086: ldc2_w 111777759125385
      // 089: lxor
      // 08a: lstore 26
      // 08c: pop2
      // 08d: ldc2_w 7908545921744738576
      // 090: lload 2
      // 091: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: astore 28
      // 098: iload 7
      // 09a: aload 28
      // 09c: ifnonnull 0ca
      // 09f: sipush 1244
      // 0a2: ldc2_w 3887170003946935850
      // 0a5: lload 2
      // 0a6: lxor
      // 0a7: invokedynamic c (IJ)I bsm=com/zelix/lom.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: if_icmpgt 0cd
      // 0af: goto 0bc
      // 0b2: ldc2_w 7785504619438081473
      // 0b5: lload 2
      // 0b6: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: athrow
      // 0bc: bipush 1
      // 0bd: goto 0ca
      // 0c0: ldc2_w 7785504619438081473
      // 0c3: lload 2
      // 0c4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: goto 0ce
      // 0cd: bipush 0
      // 0ce: bipush 2
      // 0cf: anewarray 16
      // 0d2: dup
      // 0d3: bipush 0
      // 0d4: new java/lang/StringBuilder
      // 0d7: dup
      // 0d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 0db: sipush 20907
      // 0de: ldc2_w 2291502455177370862
      // 0e1: lload 2
      // 0e2: lxor
      // 0e3: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/lom.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: iload 7
      // 0ed: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0f0: ldc ">"
      // 0f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f5: sipush 139
      // 0f8: ldc2_w 1223570973038088828
      // 0fb: lload 2
      // 0fc: lxor
      // 0fd: invokedynamic c (IJ)I bsm=com/zelix/lom.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 105: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 108: aastore
      // 109: dup
      // 10a: bipush 1
      // 10b: aload 0
      // 10c: ldc2_w 8433583822386478126
      // 10f: lload 2
      // 110: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/bc; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 115: lload 13
      // 117: invokevirtual com/zelix/bc.j (J)Ljava/lang/String;
      // 11a: aastore
      // 11b: lload 26
      // 11d: invokestatic com/zelix/lk0.t (Z[Ljava/lang/String;J)V
      // 120: aload 0
      // 121: ldc2_w 8122498296851980794
      // 124: lload 2
      // 125: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/l; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: lload 9
      // 12c: bipush 1
      // 12d: anewarray 398
      // 130: dup_x2
      // 131: dup_x2
      // 132: pop
      // 133: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 136: bipush 0
      // 137: swap
      // 138: aastore
      // 139: ldc2_w 7732403383204674354
      // 13c: lload 2
      // 13d: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 142: astore 29
      // 144: aload 29
      // 146: arraylength
      // 147: anewarray 375
      // 14a: astore 30
      // 14c: aload 29
      // 14e: arraylength
      // 14f: aload 28
      // 151: lload 2
      // 152: lconst_0
      // 153: lcmp
      // 154: iflt 17e
      // 157: ifnonnull 17c
      // 15a: ifle 460
      // 15d: goto 16a
      // 160: ldc2_w 7785504619438081473
      // 163: lload 2
      // 164: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 0
      // 16b: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 16e: arraylength
      // 16f: goto 17c
      // 172: ldc2_w 7785504619438081473
      // 175: lload 2
      // 176: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: athrow
      // 17c: aload 28
      // 17e: lload 2
      // 17f: lconst_0
      // 180: lcmp
      // 181: ifle 1a8
      // 184: ifnonnull 199
      // 187: ifle 460
      // 18a: goto 197
      // 18d: ldc2_w 7785504619438081473
      // 190: lload 2
      // 191: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: iload 7
      // 199: lload 22
      // 19b: bipush 2
      // 19c: anewarray 398
      // 19f: dup_x2
      // 1a0: dup_x2
      // 1a1: pop
      // 1a2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a5: bipush 1
      // 1a6: swap
      // 1a7: aastore
      // 1a8: dup_x1
      // 1a9: swap
      // 1aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ad: bipush 0
      // 1ae: swap
      // 1af: aastore
      // 1b0: ldc2_w 7642375116619886707
      // 1b3: lload 2
      // 1b4: invokedynamic j (Ljava/lang/Object;JJ)[[Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b9: astore 31
      // 1bb: aload 0
      // 1bc: iload 7
      // 1be: aload 29
      // 1c0: aload 31
      // 1c2: lload 24
      // 1c4: bipush 4
      // 1c5: anewarray 398
      // 1c8: dup_x2
      // 1c9: dup_x2
      // 1ca: pop
      // 1cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ce: bipush 3
      // 1cf: swap
      // 1d0: aastore
      // 1d1: dup_x1
      // 1d2: swap
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
      // 1dd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e0: bipush 0
      // 1e1: swap
      // 1e2: aastore
      // 1e3: ldc2_w 7751159900405761234
      // 1e6: lload 2
      // 1e7: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[[Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: astore 31
      // 1ee: aload 31
      // 1f0: arraylength
      // 1f1: aload 28
      // 1f3: ifnonnull 24c
      // 1f6: sipush 21297
      // 1f9: ldc2_w 3969127797668561344
      // 1fc: lload 2
      // 1fd: lxor
      // 1fe: invokedynamic c (IJ)I bsm=com/zelix/lom.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: if_icmple 24b
      // 206: goto 213
      // 209: ldc2_w 7785504619438081473
      // 20c: lload 2
      // 20d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: athrow
      // 213: bipush 2
      // 214: aload 31
      // 216: bipush 0
      // 217: aaload
      // 218: arraylength
      // 219: multianewarray 199 2
      // 21d: astore 32
      // 21f: aload 31
      // 221: bipush 0
      // 222: aaload
      // 223: bipush 0
      // 224: aload 32
      // 226: bipush 0
      // 227: aaload
      // 228: bipush 0
      // 229: aload 31
      // 22b: bipush 0
      // 22c: aaload
      // 22d: arraylength
      // 22e: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 231: aload 31
      // 233: aload 31
      // 235: arraylength
      // 236: bipush 1
      // 237: isub
      // 238: aaload
      // 239: bipush 0
      // 23a: aload 32
      // 23c: bipush 1
      // 23d: aaload
      // 23e: bipush 0
      // 23f: aload 31
      // 241: bipush 1
      // 242: aaload
      // 243: arraylength
      // 244: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 247: aload 32
      // 249: astore 31
      // 24b: bipush 0
      // 24c: istore 32
      // 24e: sipush 18775
      // 251: bipush 0
      // 252: istore 33
      // 254: ldc2_w 1551094431102229412
      // 257: lload 2
      // 258: lxor
      // 259: invokedynamic c (IJ)I bsm=com/zelix/lom.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25e: istore 34
      // 260: bipush -1
      // 261: istore 35
      // 263: new java/util/ArrayList
      // 266: dup
      // 267: aload 6
      // 269: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 26c: astore 36
      // 26e: aload 4
      // 270: lload 11
      // 272: bipush 2
      // 273: anewarray 398
      // 276: dup_x2
      // 277: dup_x2
      // 278: pop
      // 279: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27c: bipush 1
      // 27d: swap
      // 27e: aastore
      // 27f: dup_x1
      // 280: swap
      // 281: bipush 0
      // 282: swap
      // 283: aastore
      // 284: ldc2_w 7661936432911579718
      // 287: lload 2
      // 288: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: astore 37
      // 28f: bipush 0
      // 290: istore 38
      // 292: iload 38
      // 294: aload 31
      // 296: arraylength
      // 297: if_icmpge 3c1
      // 29a: lload 15
      // 29c: bipush 1
      // 29d: anewarray 398
      // 2a0: dup_x2
      // 2a1: dup_x2
      // 2a2: pop
      // 2a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a6: bipush 0
      // 2a7: swap
      // 2a8: aastore
      // 2a9: ldc2_w 8186366266277762425
      // 2ac: lload 2
      // 2ad: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: astore 39
      // 2b4: lload 15
      // 2b6: bipush 1
      // 2b7: anewarray 398
      // 2ba: dup_x2
      // 2bb: dup_x2
      // 2bc: pop
      // 2bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c0: bipush 0
      // 2c1: swap
      // 2c2: aastore
      // 2c3: ldc2_w 8186366266277762425
      // 2c6: lload 2
      // 2c7: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cc: astore 40
      // 2ce: aload 29
      // 2d0: arraylength
      // 2d1: anewarray 375
      // 2d4: astore 41
      // 2d6: aload 0
      // 2d7: iload 7
      // 2d9: aload 29
      // 2db: aload 31
      // 2dd: iload 38
      // 2df: aaload
      // 2e0: lload 17
      // 2e2: aload 5
      // 2e4: aload 8
      // 2e6: aload 37
      // 2e8: aload 36
      // 2ea: aload 39
      // 2ec: aload 40
      // 2ee: bipush 10
      // 2f0: anewarray 398
      // 2f3: dup_x1
      // 2f4: swap
      // 2f5: bipush 9
      // 2f7: swap
      // 2f8: aastore
      // 2f9: dup_x1
      // 2fa: swap
      // 2fb: bipush 8
      // 2fd: swap
      // 2fe: aastore
      // 2ff: dup_x1
      // 300: swap
      // 301: bipush 7
      // 303: swap
      // 304: aastore
      // 305: dup_x1
      // 306: swap
      // 307: bipush 6
      // 309: swap
      // 30a: aastore
      // 30b: dup_x1
      // 30c: swap
      // 30d: bipush 5
      // 30e: swap
      // 30f: aastore
      // 310: dup_x1
      // 311: swap
      // 312: bipush 4
      // 313: swap
      // 314: aastore
      // 315: dup_x2
      // 316: dup_x2
      // 317: pop
      // 318: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 31b: bipush 3
      // 31c: swap
      // 31d: aastore
      // 31e: dup_x1
      // 31f: swap
      // 320: bipush 2
      // 321: swap
      // 322: aastore
      // 323: dup_x1
      // 324: swap
      // 325: bipush 1
      // 326: swap
      // 327: aastore
      // 328: dup_x1
      // 329: swap
      // 32a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 32d: bipush 0
      // 32e: swap
      // 32f: aastore
      // 330: ldc2_w 7638267300867110140
      // 333: lload 2
      // 334: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: astore 41
      // 33b: bipush 0
      // 33c: istore 42
      // 33e: aload 41
      // 340: astore 43
      // 342: aload 43
      // 344: lload 2
      // 345: lconst_0
      // 346: lcmp
      // 347: iflt 462
      // 34a: arraylength
      // 34b: istore 44
      // 34d: aload 28
      // 34f: ifnonnull 460
      // 352: bipush 0
      // 353: istore 45
      // 355: iload 45
      // 357: iload 44
      // 359: if_icmpge 398
      // 35c: aload 43
      // 35e: iload 45
      // 360: aaload
      // 361: astore 46
      // 363: iload 42
      // 365: aload 46
      // 367: iload 19
      // 369: i2c
      // 36a: lload 20
      // 36c: invokevirtual com/zelix/_z.y (CJ)I
      // 36f: iadd
      // 370: istore 42
      // 372: iinc 45 1
      // 375: aload 28
      // 377: lload 2
      // 378: lconst_0
      // 379: lcmp
      // 37a: iflt 3be
      // 37d: ifnonnull 3bc
      // 380: aload 28
      // 382: ifnull 355
      // 385: lload 2
      // 386: lconst_0
      // 387: lcmp
      // 388: ifle 375
      // 38b: goto 398
      // 38e: ldc2_w 7785504619438081473
      // 391: lload 2
      // 392: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: athrow
      // 398: iload 42
      // 39a: aload 28
      // 39c: ifnonnull 3b7
      // 39f: iload 34
      // 3a1: if_icmpge 3b9
      // 3a4: goto 3b1
      // 3a7: ldc2_w 7785504619438081473
      // 3aa: lload 2
      // 3ab: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b0: athrow
      // 3b1: iload 42
      // 3b3: istore 34
      // 3b5: iload 38
      // 3b7: istore 35
      // 3b9: iinc 38 1
      // 3bc: aload 28
      // 3be: ifnull 292
      // 3c1: lload 15
      // 3c3: bipush 1
      // 3c4: anewarray 398
      // 3c7: dup_x2
      // 3c8: dup_x2
      // 3c9: pop
      // 3ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3cd: bipush 0
      // 3ce: swap
      // 3cf: aastore
      // 3d0: ldc2_w 8186366266277762425
      // 3d3: lload 2
      // 3d4: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d9: astore 38
      // 3db: lload 15
      // 3dd: bipush 1
      // 3de: anewarray 398
      // 3e1: dup_x2
      // 3e2: dup_x2
      // 3e3: pop
      // 3e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e7: bipush 0
      // 3e8: swap
      // 3e9: aastore
      // 3ea: ldc2_w 8186366266277762425
      // 3ed: lload 2
      // 3ee: invokedynamic j (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f3: astore 39
      // 3f5: aload 0
      // 3f6: iload 7
      // 3f8: aload 29
      // 3fa: aload 31
      // 3fc: iload 35
      // 3fe: aaload
      // 3ff: lload 17
      // 401: aload 5
      // 403: aload 8
      // 405: aload 4
      // 407: aload 6
      // 409: aload 38
      // 40b: aload 39
      // 40d: bipush 10
      // 40f: anewarray 398
      // 412: dup_x1
      // 413: swap
      // 414: bipush 9
      // 416: swap
      // 417: aastore
      // 418: dup_x1
      // 419: swap
      // 41a: bipush 8
      // 41c: swap
      // 41d: aastore
      // 41e: dup_x1
      // 41f: swap
      // 420: bipush 7
      // 422: swap
      // 423: aastore
      // 424: dup_x1
      // 425: swap
      // 426: bipush 6
      // 428: swap
      // 429: aastore
      // 42a: dup_x1
      // 42b: swap
      // 42c: bipush 5
      // 42d: swap
      // 42e: aastore
      // 42f: dup_x1
      // 430: swap
      // 431: bipush 4
      // 432: swap
      // 433: aastore
      // 434: dup_x2
      // 435: dup_x2
      // 436: pop
      // 437: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43a: bipush 3
      // 43b: swap
      // 43c: aastore
      // 43d: dup_x1
      // 43e: swap
      // 43f: bipush 2
      // 440: swap
      // 441: aastore
      // 442: dup_x1
      // 443: swap
      // 444: bipush 1
      // 445: swap
      // 446: aastore
      // 447: dup_x1
      // 448: swap
      // 449: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 44c: bipush 0
      // 44d: swap
      // 44e: aastore
      // 44f: ldc2_w 7638267300867110140
      // 452: lload 2
      // 453: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 458: lload 2
      // 459: lconst_0
      // 45a: lcmp
      // 45b: iflt 462
      // 45e: astore 30
      // 460: aload 30
      // 462: areturn
   }

   public lom(bc param1, long param2, l param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/lom.a J
      // 03: lload 2
      // 04: lxor
      // 05: lstore 2
      // 06: lload 2
      // 07: dup2
      // 08: ldc2_w 20725169421150
      // 0b: lxor
      // 0c: lstore 5
      // 0e: dup2
      // 0f: ldc2_w 136458925095698
      // 12: lxor
      // 13: lstore 7
      // 15: dup2
      // 16: ldc2_w 136149393529984
      // 19: lxor
      // 1a: lstore 9
      // 1c: pop2
      // 1d: aload 0
      // 1e: invokespecial java/lang/Object.<init> ()V
      // 21: aload 0
      // 22: aload 1
      // 23: lload 5
      // 25: bipush 1
      // 26: anewarray 398
      // 29: dup_x2
      // 2a: dup_x2
      // 2b: pop
      // 2c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f: bipush 0
      // 30: swap
      // 31: aastore
      // 32: ldc2_w 5841405731327061191
      // 35: lload 2
      // 36: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/e; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: putfield com/zelix/lom.s Lcom/zelix/e;
      // 3e: ldc2_w 5633395148730055421
      // 41: lload 2
      // 42: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: aload 0
      // 48: aload 1
      // 49: putfield com/zelix/lom.I Lcom/zelix/bc;
      // 4c: astore 11
      // 4e: aload 0
      // 4f: aload 4
      // 51: aload 11
      // 53: ifnonnull b8
      // 56: putfield com/zelix/lom.T Lcom/zelix/l;
      // 59: ldc2_w 5632737795102024275
      // 5c: lload 2
      // 5d: invokedynamic k (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: ifeq a8
      // 65: goto 72
      // 68: ldc2_w 5757483394389124652
      // 6b: lload 2
      // 6c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 0
      // 73: aload 4
      // 75: lload 9
      // 77: bipush 1
      // 78: anewarray 398
      // 7b: dup_x2
      // 7c: dup_x2
      // 7d: pop
      // 7e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 81: bipush 0
      // 82: swap
      // 83: aastore
      // 84: ldc2_w 5738505050341883264
      // 87: lload 2
      // 88: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/hz; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: putfield com/zelix/lom.h [Lcom/zelix/hz;
      // 90: lload 2
      // 91: lconst_0
      // 92: lcmp
      // 93: ifle c8
      // 96: aload 11
      // 98: ifnull be
      // 9b: goto a8
      // 9e: ldc2_w 5757483394389124652
      // a1: lload 2
      // a2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a7: athrow
      // a8: aload 0
      // a9: aload 4
      // ab: goto b8
      // ae: ldc2_w 5757483394389124652
      // b1: lload 2
      // b2: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: athrow
      // b8: invokevirtual com/zelix/l.w ()[Lcom/zelix/hz;
      // bb: putfield com/zelix/lom.h [Lcom/zelix/hz;
      // be: aload 0
      // bf: aload 1
      // c0: lload 7
      // c2: invokevirtual com/zelix/bc.v (J)Ljava/lang/String;
      // c5: putfield com/zelix/lom.J Ljava/lang/String;
      // c8: return
   }

   private boolean[] G(Object[] param1) {
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
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast [Ljava/lang/Integer;
      // 012: astore 5
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/Long
      // 01a: invokevirtual java/lang/Long.longValue ()J
      // 01d: lstore 2
      // 01e: pop
      // 01f: getstatic com/zelix/lom.a J
      // 022: lload 2
      // 023: lxor
      // 024: lstore 2
      // 025: lload 2
      // 026: dup2
      // 027: ldc2_w 64933394366815
      // 02a: lxor
      // 02b: lstore 6
      // 02d: pop2
      // 02e: ldc2_w -5546821183731447851
      // 031: lload 2
      // 032: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 037: iload 4
      // 039: newarray 4
      // 03b: astore 9
      // 03d: bipush 0
      // 03e: istore 10
      // 040: astore 8
      // 042: iload 10
      // 044: aload 9
      // 046: arraylength
      // 047: if_icmpge 058
      // 04a: aload 9
      // 04c: iload 10
      // 04e: bipush 1
      // 04f: bastore
      // 050: iinc 10 1
      // 053: aload 8
      // 055: ifnull 042
      // 058: lload 2
      // 059: lconst_0
      // 05a: lcmp
      // 05b: ifle 053
      // 05e: iload 4
      // 060: anewarray 425
      // 063: astore 10
      // 065: iload 4
      // 067: anewarray 425
      // 06a: astore 11
      // 06c: bipush 0
      // 06d: istore 12
      // 06f: iload 12
      // 071: aload 5
      // 073: arraylength
      // 074: if_icmpge 1cd
      // 077: iload 12
      // 079: aload 8
      // 07b: ifnonnull 0de
      // 07e: ifne 0d6
      // 081: goto 08e
      // 084: ldc2_w -5562266410725156092
      // 087: lload 2
      // 088: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: athrow
      // 08e: bipush 0
      // 08f: istore 13
      // 091: iload 13
      // 093: iload 4
      // 095: if_icmpge 0d6
      // 098: aload 10
      // 09a: iload 13
      // 09c: new java/lang/StringBuilder
      // 09f: dup
      // 0a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a3: aastore
      // 0a4: aload 11
      // 0a6: iload 13
      // 0a8: new java/lang/StringBuilder
      // 0ab: dup
      // 0ac: invokespecial java/lang/StringBuilder.<init> ()V
      // 0af: aastore
      // 0b0: iinc 13 1
      // 0b3: aload 8
      // 0b5: lload 2
      // 0b6: lconst_0
      // 0b7: lcmp
      // 0b8: iflt 0c0
      // 0bb: ifnonnull 0e0
      // 0be: aload 8
      // 0c0: ifnull 091
      // 0c3: lload 2
      // 0c4: lconst_0
      // 0c5: lcmp
      // 0c6: ifle 0b3
      // 0c9: goto 0d6
      // 0cc: ldc2_w -5562266410725156092
      // 0cf: lload 2
      // 0d0: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: athrow
      // 0d6: aload 5
      // 0d8: iload 12
      // 0da: aaload
      // 0db: invokevirtual java/lang/Integer.intValue ()I
      // 0de: istore 13
      // 0e0: aload 0
      // 0e1: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 0e4: iload 13
      // 0e6: aaload
      // 0e7: astore 14
      // 0e9: aload 14
      // 0eb: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 0ee: astore 15
      // 0f0: aload 14
      // 0f2: lload 6
      // 0f4: bipush 1
      // 0f5: anewarray 398
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 0
      // 0ff: swap
      // 100: aastore
      // 101: ldc2_w -6082768955815922868
      // 104: lload 2
      // 105: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: astore 16
      // 10c: bipush 0
      // 10d: istore 17
      // 10f: iload 17
      // 111: iload 4
      // 113: if_icmpge 1bf
      // 116: aload 10
      // 118: iload 17
      // 11a: aaload
      // 11b: new java/lang/StringBuilder
      // 11e: dup
      // 11f: invokespecial java/lang/StringBuilder.<init> ()V
      // 122: aload 15
      // 124: iload 17
      // 126: aaload
      // 127: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12a: ldc ";"
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 132: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 135: pop
      // 136: aload 11
      // 138: iload 17
      // 13a: aaload
      // 13b: new java/lang/StringBuilder
      // 13e: dup
      // 13f: invokespecial java/lang/StringBuilder.<init> ()V
      // 142: aload 16
      // 144: iload 17
      // 146: aaload
      // 147: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14a: ldc ";"
      // 14c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: pop
      // 156: aload 8
      // 158: lload 2
      // 159: lconst_0
      // 15a: lcmp
      // 15b: iflt 1bc
      // 15e: ifnonnull 1ba
      // 161: aload 9
      // 163: iload 17
      // 165: baload
      // 166: aload 8
      // 168: ifnonnull 071
      // 16b: lload 2
      // 16c: lconst_0
      // 16d: lcmp
      // 16e: ifle 079
      // 171: goto 17e
      // 174: ldc2_w -5562266410725156092
      // 177: lload 2
      // 178: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: lload 2
      // 17f: lconst_0
      // 180: lcmp
      // 181: ifle 194
      // 184: ifeq 1b7
      // 187: aload 15
      // 189: iload 17
      // 18b: aaload
      // 18c: aload 16
      // 18e: iload 17
      // 190: aaload
      // 191: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 194: ifne 1b7
      // 197: goto 1a4
      // 19a: ldc2_w -5562266410725156092
      // 19d: lload 2
      // 19e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: aload 9
      // 1a6: iload 17
      // 1a8: bipush 0
      // 1a9: bastore
      // 1aa: goto 1b7
      // 1ad: ldc2_w -5562266410725156092
      // 1b0: lload 2
      // 1b1: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b6: athrow
      // 1b7: iinc 17 1
      // 1ba: aload 8
      // 1bc: ifnull 10f
      // 1bf: iinc 12 1
      // 1c2: aload 8
      // 1c4: lload 2
      // 1c5: lconst_0
      // 1c6: lcmp
      // 1c7: iflt 158
      // 1ca: ifnull 06f
      // 1cd: lload 2
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: iflt 077
      // 1d3: aload 9
      // 1d5: areturn
   }

   public _z[] b(Object[] param1) {
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
      // 004: checkcast com/zelix/k6
      // 007: astore 8
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/t6
      // 00f: astore 7
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 4
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast java/util/Set
      // 022: astore 9
      // 024: dup
      // 025: bipush 4
      // 026: aaload
      // 027: checkcast java/util/List
      // 02a: astore 2
      // 02b: dup
      // 02c: bipush 5
      // 02d: aaload
      // 02e: checkcast java/lang/Boolean
      // 031: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 034: istore 6
      // 036: dup
      // 037: bipush 6
      // 039: aaload
      // 03a: checkcast java/lang/Boolean
      // 03d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 040: istore 3
      // 041: pop
      // 042: getstatic com/zelix/lom.a J
      // 045: lload 4
      // 047: lxor
      // 048: lstore 4
      // 04a: lload 4
      // 04c: dup2
      // 04d: ldc2_w 66286929652036
      // 050: lxor
      // 051: dup2
      // 052: bipush 32
      // 054: lushr
      // 055: l2i
      // 056: istore 10
      // 058: dup2
      // 059: bipush 32
      // 05b: lshl
      // 05c: bipush 48
      // 05e: lushr
      // 05f: l2i
      // 060: istore 11
      // 062: dup2
      // 063: bipush 48
      // 065: lshl
      // 066: bipush 48
      // 068: lushr
      // 069: l2i
      // 06a: istore 12
      // 06c: pop2
      // 06d: dup2
      // 06e: ldc2_w 93933211306426
      // 071: lxor
      // 072: lstore 13
      // 074: dup2
      // 075: ldc2_w 22284494978007
      // 078: lxor
      // 079: lstore 15
      // 07b: dup2
      // 07c: ldc2_w 65016147249859
      // 07f: lxor
      // 080: lstore 17
      // 082: dup2
      // 083: ldc2_w 8909886604828
      // 086: lxor
      // 087: lstore 19
      // 089: dup2
      // 08a: ldc2_w 63944084635834
      // 08d: lxor
      // 08e: lstore 21
      // 090: dup2
      // 091: ldc2_w 38911187012319
      // 094: lxor
      // 095: lstore 23
      // 097: dup2
      // 098: ldc2_w 95400836531964
      // 09b: lxor
      // 09c: lstore 25
      // 09e: dup2
      // 09f: ldc2_w 23315598966628
      // 0a2: lxor
      // 0a3: lstore 27
      // 0a5: dup2
      // 0a6: ldc2_w 71476809168917
      // 0a9: lxor
      // 0aa: lstore 29
      // 0ac: pop2
      // 0ad: aload 0
      // 0ae: ldc2_w -6485880143206665025
      // 0b1: lload 4
      // 0b3: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/l; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: lload 19
      // 0ba: bipush 1
      // 0bb: anewarray 398
      // 0be: dup_x2
      // 0bf: dup_x2
      // 0c0: pop
      // 0c1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c4: bipush 0
      // 0c5: swap
      // 0c6: aastore
      // 0c7: ldc2_w -4752867032435085705
      // 0ca: lload 4
      // 0cc: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/Integer; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: astore 32
      // 0d3: aload 32
      // 0d5: arraylength
      // 0d6: istore 33
      // 0d8: lload 21
      // 0da: bipush 1
      // 0db: anewarray 398
      // 0de: dup_x2
      // 0df: dup_x2
      // 0e0: pop
      // 0e1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e4: bipush 0
      // 0e5: swap
      // 0e6: aastore
      // 0e7: ldc2_w -6566600324197269444
      // 0ea: lload 4
      // 0ec: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: astore 34
      // 0f3: lload 21
      // 0f5: bipush 1
      // 0f6: anewarray 398
      // 0f9: dup_x2
      // 0fa: dup_x2
      // 0fb: pop
      // 0fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ff: bipush 0
      // 100: swap
      // 101: aastore
      // 102: ldc2_w -6566600324197269444
      // 105: lload 4
      // 107: invokedynamic o (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: astore 35
      // 10e: ldc2_w -5150530380867154859
      // 111: lload 4
      // 113: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 118: iload 33
      // 11a: anewarray 375
      // 11d: astore 36
      // 11f: astore 31
      // 121: new com/zelix/lb6
      // 124: dup
      // 125: bipush -1
      // 126: invokespecial com/zelix/lb6.<init> (I)V
      // 129: astore 37
      // 12b: new com/zelix/sz
      // 12e: dup
      // 12f: iload 10
      // 131: iload 11
      // 133: i2s
      // 134: iload 12
      // 136: i2c
      // 137: invokespecial com/zelix/sz.<init> (ISC)V
      // 13a: astore 38
      // 13c: new com/zelix/sz
      // 13f: dup
      // 140: iload 10
      // 142: iload 11
      // 144: i2s
      // 145: iload 12
      // 147: i2c
      // 148: invokespecial com/zelix/sz.<init> (ISC)V
      // 14b: astore 39
      // 14d: aload 0
      // 14e: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 151: arraylength
      // 152: aload 31
      // 154: ifnonnull 1a8
      // 157: ifle 1a6
      // 15a: goto 168
      // 15d: ldc2_w -5093918320793563004
      // 160: lload 4
      // 162: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: aload 38
      // 16a: aload 8
      // 16c: aload 0
      // 16d: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 170: bipush 0
      // 171: aaload
      // 172: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 175: aload 7
      // 177: lload 15
      // 179: aload 9
      // 17b: aload 2
      // 17c: bipush 1
      // 17d: aload 34
      // 17f: aload 35
      // 181: invokestatic com/zelix/ss.s (Lcom/zelix/ko;[Lcom/zelix/v7;Lcom/zelix/t6;JLjava/util/Set;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;)[Lcom/zelix/ss;
      // 184: lload 29
      // 186: dup2_x1
      // 187: pop2
      // 188: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 18b: aload 39
      // 18d: bipush 0
      // 18e: anewarray 505
      // 191: lload 29
      // 193: dup2_x1
      // 194: pop2
      // 195: invokevirtual com/zelix/sz.Z (JLjava/lang/Object;)V
      // 198: goto 1a6
      // 19b: ldc2_w -5093918320793563004
      // 19e: lload 4
      // 1a0: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a5: athrow
      // 1a6: iload 6
      // 1a8: aload 31
      // 1aa: ifnonnull 1e4
      // 1ad: ifne 1e3
      // 1b0: goto 1be
      // 1b3: ldc2_w -5093918320793563004
      // 1b6: lload 4
      // 1b8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: iload 3
      // 1bf: aload 31
      // 1c1: ifnonnull 1e4
      // 1c4: goto 1d2
      // 1c7: ldc2_w -5093918320793563004
      // 1ca: lload 4
      // 1cc: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: ifeq 272
      // 1d5: goto 1e3
      // 1d8: ldc2_w -5093918320793563004
      // 1db: lload 4
      // 1dd: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e2: athrow
      // 1e3: bipush 0
      // 1e4: istore 40
      // 1e6: iload 40
      // 1e8: iload 33
      // 1ea: if_icmpge 272
      // 1ed: aload 32
      // 1ef: iload 40
      // 1f1: aaload
      // 1f2: invokevirtual java/lang/Integer.intValue ()I
      // 1f5: istore 41
      // 1f7: aload 0
      // 1f8: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 1fb: iload 41
      // 1fd: aaload
      // 1fe: astore 42
      // 200: aload 31
      // 202: lload 4
      // 204: lconst_0
      // 205: lcmp
      // 206: iflt 26f
      // 209: ifnonnull 26d
      // 20c: aload 42
      // 20e: aload 31
      // 210: ifnonnull 278
      // 213: goto 221
      // 216: ldc2_w -5093918320793563004
      // 219: lload 4
      // 21b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: lload 25
      // 223: bipush 1
      // 224: anewarray 398
      // 227: dup_x2
      // 228: dup_x2
      // 229: pop
      // 22a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22d: bipush 0
      // 22e: swap
      // 22f: aastore
      // 230: ldc2_w -5107381246513679677
      // 233: lload 4
      // 235: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23a: ifeq 25c
      // 23d: goto 24b
      // 240: ldc2_w -5093918320793563004
      // 243: lload 4
      // 245: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24a: athrow
      // 24b: bipush 0
      // 24c: istore 6
      // 24e: bipush 0
      // 24f: istore 3
      // 250: lload 4
      // 252: lconst_0
      // 253: lcmp
      // 254: iflt 25f
      // 257: aload 31
      // 259: ifnull 272
      // 25c: iinc 40 1
      // 25f: goto 26d
      // 262: ldc2_w -5093918320793563004
      // 265: lload 4
      // 267: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26c: athrow
      // 26d: aload 31
      // 26f: ifnull 1e6
      // 272: aload 0
      // 273: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 276: bipush 0
      // 277: aaload
      // 278: astore 40
      // 27a: bipush 0
      // 27b: istore 41
      // 27d: iload 41
      // 27f: iload 33
      // 281: if_icmpge 4e5
      // 284: aload 32
      // 286: iload 41
      // 288: aaload
      // 289: invokevirtual java/lang/Integer.intValue ()I
      // 28c: istore 42
      // 28e: aload 0
      // 28f: getfield com/zelix/lom.s Lcom/zelix/e;
      // 292: iload 42
      // 294: invokevirtual com/zelix/e.get (I)Ljava/lang/Object;
      // 297: checkcast com/zelix/iq
      // 29a: astore 43
      // 29c: aload 0
      // 29d: getfield com/zelix/lom.h [Lcom/zelix/hz;
      // 2a0: iload 42
      // 2a2: aaload
      // 2a3: astore 44
      // 2a5: aload 44
      // 2a7: aload 31
      // 2a9: lload 4
      // 2ab: lconst_0
      // 2ac: lcmp
      // 2ad: ifle 38e
      // 2b0: ifnonnull 2c6
      // 2b3: ifnonnull 39d
      // 2b6: goto 2c4
      // 2b9: ldc2_w -5093918320793563004
      // 2bc: lload 4
      // 2be: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c3: athrow
      // 2c4: aload 44
      // 2c6: sipush 12920
      // 2c9: ldc2_w 954102966156424655
      // 2cc: lload 4
      // 2ce: lxor
      // 2cf: invokedynamic c (IJ)I bsm=com/zelix/lom.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: anewarray 16
      // 2d7: dup
      // 2d8: bipush 0
      // 2d9: sipush 26487
      // 2dc: ldc2_w 350554825207299956
      // 2df: lload 4
      // 2e1: lxor
      // 2e2: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/lom.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e7: aastore
      // 2e8: dup
      // 2e9: bipush 1
      // 2ea: iload 42
      // 2ec: ldc2_w -6747875760295161899
      // 2ef: lload 4
      // 2f1: invokedynamic o (IJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f6: aastore
      // 2f7: dup
      // 2f8: bipush 2
      // 2f9: sipush 25542
      // 2fc: ldc2_w 3080787009036401604
      // 2ff: lload 4
      // 301: lxor
      // 302: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/lom.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 307: aastore
      // 308: dup
      // 309: bipush 3
      // 30a: aload 0
      // 30b: ldc2_w -6492672371325475192
      // 30e: lload 4
      // 310: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: aastore
      // 316: dup
      // 317: bipush 4
      // 318: sipush 11712
      // 31b: ldc2_w 675237824938702273
      // 31e: lload 4
      // 320: lxor
      // 321: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/lom.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 326: aastore
      // 327: dup
      // 328: bipush 5
      // 329: aload 43
      // 32b: bipush 0
      // 32c: anewarray 398
      // 32f: ldc2_w -5028586571835853164
      // 332: lload 4
      // 334: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: invokestatic java/lang/Integer.toHexString (I)Ljava/lang/String;
      // 33c: aastore
      // 33d: dup
      // 33e: sipush 25579
      // 341: ldc2_w 2484290867835413595
      // 344: lload 4
      // 346: lxor
      // 347: invokedynamic c (IJ)I bsm=com/zelix/lom.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34c: sipush 18524
      // 34f: ldc2_w 3275916486579294297
      // 352: lload 4
      // 354: lxor
      // 355: invokedynamic l (IJ)Ljava/lang/String; bsm=com/zelix/lom.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: aastore
      // 35b: dup
      // 35c: sipush 9046
      // 35f: ldc2_w 5155165475015058659
      // 362: lload 4
      // 364: lxor
      // 365: invokedynamic c (IJ)I bsm=com/zelix/lom.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: aload 43
      // 36c: invokevirtual com/zelix/iq.B ()I
      // 36f: ldc2_w -6747875760295161899
      // 372: lload 4
      // 374: invokedynamic o (IJJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 379: aastore
      // 37a: lload 17
      // 37c: bipush 3
      // 37d: anewarray 398
      // 380: dup_x2
      // 381: dup_x2
      // 382: pop
      // 383: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 386: bipush 2
      // 387: swap
      // 388: aastore
      // 389: dup_x1
      // 38a: swap
      // 38b: bipush 1
      // 38c: swap
      // 38d: aastore
      // 38e: dup_x1
      // 38f: swap
      // 390: bipush 0
      // 391: swap
      // 392: aastore
      // 393: ldc2_w -6875062687217014416
      // 396: lload 4
      // 398: invokedynamic o (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39d: iload 3
      // 39e: aload 31
      // 3a0: ifnonnull 3ee
      // 3a3: ifeq 3de
      // 3a6: goto 3b4
      // 3a9: ldc2_w -5093918320793563004
      // 3ac: lload 4
      // 3ae: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b3: athrow
      // 3b4: iload 41
      // 3b6: aload 31
      // 3b8: ifnonnull 3ee
      // 3bb: goto 3c9
      // 3be: ldc2_w -5093918320793563004
      // 3c1: lload 4
      // 3c3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c8: athrow
      // 3c9: iload 33
      // 3cb: bipush 1
      // 3cc: isub
      // 3cd: if_icmpge 451
      // 3d0: goto 3de
      // 3d3: ldc2_w -5093918320793563004
      // 3d6: lload 4
      // 3d8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3dd: athrow
      // 3de: iload 6
      // 3e0: goto 3ee
      // 3e3: ldc2_w -5093918320793563004
      // 3e6: lload 4
      // 3e8: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ed: athrow
      // 3ee: ifeq 41a
      // 3f1: aload 44
      // 3f3: lload 23
      // 3f5: bipush 1
      // 3f6: anewarray 398
      // 3f9: dup_x2
      // 3fa: dup_x2
      // 3fb: pop
      // 3fc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3ff: bipush 0
      // 400: swap
      // 401: aastore
      // 402: ldc2_w -6911422678871279412
      // 405: lload 4
      // 407: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40c: astore 45
      // 40e: aload 31
      // 410: lload 4
      // 412: lconst_0
      // 413: lcmp
      // 414: ifle 447
      // 417: ifnull 421
      // 41a: aload 44
      // 41c: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 41f: astore 45
      // 421: aload 36
      // 423: iload 41
      // 425: aload 8
      // 427: aload 43
      // 429: aload 44
      // 42b: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 42e: aload 45
      // 430: aload 7
      // 432: aload 9
      // 434: lload 27
      // 436: aload 2
      // 437: aload 37
      // 439: aload 39
      // 43b: aload 38
      // 43d: aload 34
      // 43f: aload 35
      // 441: invokestatic com/zelix/_z.D (Lcom/zelix/k6;Lcom/zelix/iq;[Lcom/zelix/v7;[Lcom/zelix/v7;Lcom/zelix/t6;Ljava/util/Set;JLjava/util/List;Lcom/zelix/lb6;Lcom/zelix/sz;Lcom/zelix/sz;Ljava/util/Map;Ljava/util/Map;)Lcom/zelix/_z;
      // 444: aastore
      // 445: aload 31
      // 447: lload 4
      // 449: lconst_0
      // 44a: lcmp
      // 44b: ifle 4e2
      // 44e: ifnull 4d9
      // 451: aload 36
      // 453: iload 41
      // 455: aload 0
      // 456: aload 8
      // 458: aload 43
      // 45a: aload 40
      // 45c: aload 44
      // 45e: aload 7
      // 460: lload 13
      // 462: aload 9
      // 464: aload 2
      // 465: aload 37
      // 467: aload 39
      // 469: aload 38
      // 46b: aload 34
      // 46d: aload 35
      // 46f: bipush 13
      // 471: anewarray 398
      // 474: dup_x1
      // 475: swap
      // 476: bipush 12
      // 478: swap
      // 479: aastore
      // 47a: dup_x1
      // 47b: swap
      // 47c: bipush 11
      // 47e: swap
      // 47f: aastore
      // 480: dup_x1
      // 481: swap
      // 482: bipush 10
      // 484: swap
      // 485: aastore
      // 486: dup_x1
      // 487: swap
      // 488: bipush 9
      // 48a: swap
      // 48b: aastore
      // 48c: dup_x1
      // 48d: swap
      // 48e: bipush 8
      // 490: swap
      // 491: aastore
      // 492: dup_x1
      // 493: swap
      // 494: bipush 7
      // 496: swap
      // 497: aastore
      // 498: dup_x1
      // 499: swap
      // 49a: bipush 6
      // 49c: swap
      // 49d: aastore
      // 49e: dup_x2
      // 49f: dup_x2
      // 4a0: pop
      // 4a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4a4: bipush 5
      // 4a5: swap
      // 4a6: aastore
      // 4a7: dup_x1
      // 4a8: swap
      // 4a9: bipush 4
      // 4aa: swap
      // 4ab: aastore
      // 4ac: dup_x1
      // 4ad: swap
      // 4ae: bipush 3
      // 4af: swap
      // 4b0: aastore
      // 4b1: dup_x1
      // 4b2: swap
      // 4b3: bipush 2
      // 4b4: swap
      // 4b5: aastore
      // 4b6: dup_x1
      // 4b7: swap
      // 4b8: bipush 1
      // 4b9: swap
      // 4ba: aastore
      // 4bb: dup_x1
      // 4bc: swap
      // 4bd: bipush 0
      // 4be: swap
      // 4bf: aastore
      // 4c0: ldc2_w -5098357758991660606
      // 4c3: lload 4
      // 4c5: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_z; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ca: aastore
      // 4cb: goto 4d9
      // 4ce: ldc2_w -5093918320793563004
      // 4d1: lload 4
      // 4d3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d8: athrow
      // 4d9: aload 44
      // 4db: astore 40
      // 4dd: iinc 41 1
      // 4e0: aload 31
      // 4e2: ifnull 27d
      // 4e5: aload 36
      // 4e7: areturn
   }

   private int U(Object[] param1) {
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
      // 0e: checkcast [Lcom/zelix/v7;
      // 11: astore 2
      // 12: pop
      // 13: getstatic com/zelix/lom.a J
      // 16: lload 3
      // 17: lxor
      // 18: lstore 3
      // 19: ldc2_w 4505444684984142422
      // 1c: lload 3
      // 1d: invokedynamic l (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: bipush -1
      // 23: istore 6
      // 25: aload 2
      // 26: arraylength
      // 27: bipush 1
      // 28: isub
      // 29: istore 7
      // 2b: astore 5
      // 2d: iload 7
      // 2f: iflt 9a
      // 32: aload 2
      // 33: iload 7
      // 35: aaload
      // 36: bipush 0
      // 37: anewarray 398
      // 3a: ldc2_w 2352528615792204624
      // 3d: lload 3
      // 3e: invokedynamic s (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43: aload 5
      // 45: lload 3
      // 46: lconst_0
      // 47: lcmp
      // 48: ifle 50
      // 4b: ifnonnull 9c
      // 4e: aload 5
      // 50: ifnonnull 72
      // 53: goto 60
      // 56: ldc2_w 4561559004514768519
      // 59: lload 3
      // 5a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f: athrow
      // 60: ifne 7f
      // 63: goto 70
      // 66: ldc2_w 4561559004514768519
      // 69: lload 3
      // 6a: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: athrow
      // 70: iload 7
      // 72: istore 6
      // 74: aload 5
      // 76: lload 3
      // 77: lconst_0
      // 78: lcmp
      // 79: iflt 84
      // 7c: ifnull 9a
      // 7f: iinc 7 -1
      // 82: aload 5
      // 84: ifnull 2d
      // 87: lload 3
      // 88: lconst_0
      // 89: lcmp
      // 8a: iflt 32
      // 8d: goto 9a
      // 90: ldc2_w 4561559004514768519
      // 93: lload 3
      // 94: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 99: athrow
      // 9a: iload 6
      // 9c: ireturn
   }

   private _z h(Object[] param1) {
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
      // 004: checkcast com/zelix/k6
      // 007: astore 11
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/iq
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/hz
      // 016: astore 9
      // 018: dup
      // 019: bipush 3
      // 01a: aaload
      // 01b: checkcast com/zelix/hz
      // 01e: astore 8
      // 020: dup
      // 021: bipush 4
      // 022: aaload
      // 023: checkcast com/zelix/t6
      // 026: astore 4
      // 028: dup
      // 029: bipush 5
      // 02a: aaload
      // 02b: checkcast java/lang/Long
      // 02e: invokevirtual java/lang/Long.longValue ()J
      // 031: lstore 5
      // 033: dup
      // 034: bipush 6
      // 036: aaload
      // 037: checkcast java/util/Set
      // 03a: astore 10
      // 03c: dup
      // 03d: bipush 7
      // 03f: aaload
      // 040: checkcast java/util/List
      // 043: astore 12
      // 045: dup
      // 046: bipush 8
      // 048: aaload
      // 049: checkcast com/zelix/lb6
      // 04c: astore 2
      // 04d: dup
      // 04e: bipush 9
      // 050: aaload
      // 051: checkcast com/zelix/sz
      // 054: astore 13
      // 056: dup
      // 057: bipush 10
      // 059: aaload
      // 05a: checkcast com/zelix/sz
      // 05d: astore 14
      // 05f: dup
      // 060: bipush 11
      // 062: aaload
      // 063: checkcast java/util/Map
      // 066: astore 15
      // 068: dup
      // 069: bipush 12
      // 06b: aaload
      // 06c: checkcast java/util/Map
      // 06f: astore 7
      // 071: pop
      // 072: getstatic com/zelix/lom.a J
      // 075: lload 5
      // 077: lxor
      // 078: lstore 5
      // 07a: lload 5
      // 07c: dup2
      // 07d: ldc2_w 52389904657324
      // 080: lxor
      // 081: lstore 16
      // 083: dup2
      // 084: ldc2_w 69005861079714
      // 087: lxor
      // 088: lstore 18
      // 08a: dup2
      // 08b: ldc2_w 3155718812217
      // 08e: lxor
      // 08f: lstore 20
      // 091: dup2
      // 092: ldc2_w 108905102544522
      // 095: lxor
      // 096: lstore 22
      // 098: dup2
      // 099: ldc2_w 57306102523525
      // 09c: lxor
      // 09d: lstore 24
      // 09f: dup2
      // 0a0: ldc2_w 2515767055166
      // 0a3: lxor
      // 0a4: lstore 26
      // 0a6: dup2
      // 0a7: ldc2_w 19645386582183
      // 0aa: lxor
      // 0ab: lstore 28
      // 0ad: dup2
      // 0ae: ldc2_w 132590868221881
      // 0b1: lxor
      // 0b2: lstore 30
      // 0b4: dup2
      // 0b5: ldc2_w 92096285635970
      // 0b8: lxor
      // 0b9: lstore 32
      // 0bb: dup2
      // 0bc: ldc2_w 58365620176628
      // 0bf: lxor
      // 0c0: lstore 34
      // 0c2: dup2
      // 0c3: ldc2_w 104981525364123
      // 0c6: lxor
      // 0c7: lstore 36
      // 0c9: pop2
      // 0ca: aload 8
      // 0cc: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 0cf: astore 39
      // 0d1: aload 8
      // 0d3: lload 24
      // 0d5: bipush 1
      // 0d6: anewarray 398
      // 0d9: dup_x2
      // 0da: dup_x2
      // 0db: pop
      // 0dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: ldc2_w 887111047655511190
      // 0e5: lload 5
      // 0e7: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: astore 40
      // 0ee: aload 8
      // 0f0: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 0f3: astore 41
      // 0f5: new java/util/ArrayList
      // 0f8: dup
      // 0f9: aload 12
      // 0fb: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0fe: astore 42
      // 100: new java/util/ArrayList
      // 103: dup
      // 104: aload 12
      // 106: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 109: astore 43
      // 10b: aload 11
      // 10d: aload 3
      // 10e: aload 41
      // 110: aload 39
      // 112: aload 4
      // 114: aload 10
      // 116: lload 22
      // 118: bipush 2
      // 119: anewarray 398
      // 11c: dup_x2
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 122: bipush 1
      // 123: swap
      // 124: aastore
      // 125: dup_x1
      // 126: swap
      // 127: bipush 0
      // 128: swap
      // 129: aastore
      // 12a: ldc2_w 1390436492281774937
      // 12d: lload 5
      // 12f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 134: lload 26
      // 136: aload 42
      // 138: new com/zelix/lb6
      // 13b: dup
      // 13c: aload 2
      // 13d: lload 28
      // 13f: invokevirtual com/zelix/lb6.U (J)I
      // 142: invokespecial com/zelix/lb6.<init> (I)V
      // 145: new com/zelix/sz
      // 148: dup
      // 149: aload 13
      // 14b: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 14e: lload 20
      // 150: invokespecial com/zelix/sz.<init> (Ljava/lang/Object;J)V
      // 153: new com/zelix/sz
      // 156: dup
      // 157: aload 14
      // 159: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 15c: lload 20
      // 15e: invokespecial com/zelix/sz.<init> (Ljava/lang/Object;J)V
      // 161: aload 15
      // 163: lload 32
      // 165: bipush 2
      // 166: anewarray 398
      // 169: dup_x2
      // 16a: dup_x2
      // 16b: pop
      // 16c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16f: bipush 1
      // 170: swap
      // 171: aastore
      // 172: dup_x1
      // 173: swap
      // 174: bipush 0
      // 175: swap
      // 176: aastore
      // 177: ldc2_w 1329807150245405435
      // 17a: lload 5
      // 17c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: aload 7
      // 183: lload 32
      // 185: bipush 2
      // 186: anewarray 398
      // 189: dup_x2
      // 18a: dup_x2
      // 18b: pop
      // 18c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18f: bipush 1
      // 190: swap
      // 191: aastore
      // 192: dup_x1
      // 193: swap
      // 194: bipush 0
      // 195: swap
      // 196: aastore
      // 197: ldc2_w 1329807150245405435
      // 19a: lload 5
      // 19c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: invokestatic com/zelix/_z.D (Lcom/zelix/k6;Lcom/zelix/iq;[Lcom/zelix/v7;[Lcom/zelix/v7;Lcom/zelix/t6;Ljava/util/Set;JLjava/util/List;Lcom/zelix/lb6;Lcom/zelix/sz;Lcom/zelix/sz;Ljava/util/Map;Ljava/util/Map;)Lcom/zelix/_z;
      // 1a4: astore 44
      // 1a6: aload 11
      // 1a8: aload 3
      // 1a9: aload 41
      // 1ab: aload 40
      // 1ad: aload 4
      // 1af: aload 10
      // 1b1: lload 22
      // 1b3: bipush 2
      // 1b4: anewarray 398
      // 1b7: dup_x2
      // 1b8: dup_x2
      // 1b9: pop
      // 1ba: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1bd: bipush 1
      // 1be: swap
      // 1bf: aastore
      // 1c0: dup_x1
      // 1c1: swap
      // 1c2: bipush 0
      // 1c3: swap
      // 1c4: aastore
      // 1c5: ldc2_w 1390436492281774937
      // 1c8: lload 5
      // 1ca: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cf: lload 26
      // 1d1: aload 43
      // 1d3: new com/zelix/lb6
      // 1d6: dup
      // 1d7: aload 2
      // 1d8: lload 28
      // 1da: invokevirtual com/zelix/lb6.U (J)I
      // 1dd: invokespecial com/zelix/lb6.<init> (I)V
      // 1e0: new com/zelix/sz
      // 1e3: dup
      // 1e4: aload 13
      // 1e6: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 1e9: lload 20
      // 1eb: invokespecial com/zelix/sz.<init> (Ljava/lang/Object;J)V
      // 1ee: new com/zelix/sz
      // 1f1: dup
      // 1f2: aload 14
      // 1f4: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 1f7: lload 20
      // 1f9: invokespecial com/zelix/sz.<init> (Ljava/lang/Object;J)V
      // 1fc: aload 15
      // 1fe: lload 32
      // 200: bipush 2
      // 201: anewarray 398
      // 204: dup_x2
      // 205: dup_x2
      // 206: pop
      // 207: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 20a: bipush 1
      // 20b: swap
      // 20c: aastore
      // 20d: dup_x1
      // 20e: swap
      // 20f: bipush 0
      // 210: swap
      // 211: aastore
      // 212: ldc2_w 1329807150245405435
      // 215: lload 5
      // 217: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21c: aload 7
      // 21e: lload 32
      // 220: bipush 2
      // 221: anewarray 398
      // 224: dup_x2
      // 225: dup_x2
      // 226: pop
      // 227: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 22a: bipush 1
      // 22b: swap
      // 22c: aastore
      // 22d: dup_x1
      // 22e: swap
      // 22f: bipush 0
      // 230: swap
      // 231: aastore
      // 232: ldc2_w 1329807150245405435
      // 235: lload 5
      // 237: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: invokestatic com/zelix/_z.D (Lcom/zelix/k6;Lcom/zelix/iq;[Lcom/zelix/v7;[Lcom/zelix/v7;Lcom/zelix/t6;Ljava/util/Set;JLjava/util/List;Lcom/zelix/lb6;Lcom/zelix/sz;Lcom/zelix/sz;Ljava/util/Map;Ljava/util/Map;)Lcom/zelix/_z;
      // 23f: astore 45
      // 241: bipush 0
      // 242: istore 46
      // 244: ldc2_w 1504119354371268623
      // 247: lload 5
      // 249: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24e: aload 39
      // 250: arraylength
      // 251: anewarray 262
      // 254: astore 47
      // 256: aload 39
      // 258: bipush 0
      // 259: aload 47
      // 25b: bipush 0
      // 25c: aload 39
      // 25e: arraylength
      // 25f: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 262: aload 44
      // 264: lload 16
      // 266: bipush 1
      // 267: anewarray 398
      // 26a: dup_x2
      // 26b: dup_x2
      // 26c: pop
      // 26d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 270: bipush 0
      // 271: swap
      // 272: aastore
      // 273: ldc2_w 1034261336814766583
      // 276: lload 5
      // 278: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27d: astore 48
      // 27f: astore 38
      // 281: aload 48
      // 283: ldc2_w 864465107627252101
      // 286: lload 5
      // 288: invokedynamic i (JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: aload 38
      // 28f: ifnonnull 463
      // 292: if_acmpne 449
      // 295: goto 2a3
      // 298: ldc2_w 1519071227046952158
      // 29b: lload 5
      // 29d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a2: athrow
      // 2a3: bipush 0
      // 2a4: istore 49
      // 2a6: aload 14
      // 2a8: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 2ab: checkcast [Lcom/zelix/ss;
      // 2ae: astore 50
      // 2b0: aload 50
      // 2b2: arraylength
      // 2b3: istore 51
      // 2b5: bipush 0
      // 2b6: istore 52
      // 2b8: iload 52
      // 2ba: iload 51
      // 2bc: if_icmpge 31c
      // 2bf: aload 50
      // 2c1: iload 52
      // 2c3: aaload
      // 2c4: astore 53
      // 2c6: iload 49
      // 2c8: aload 38
      // 2ca: ifnonnull 324
      // 2cd: aload 53
      // 2cf: lload 36
      // 2d1: bipush 1
      // 2d2: anewarray 398
      // 2d5: dup_x2
      // 2d6: dup_x2
      // 2d7: pop
      // 2d8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2db: bipush 0
      // 2dc: swap
      // 2dd: aastore
      // 2de: ldc2_w 1514056507684611830
      // 2e1: lload 5
      // 2e3: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e8: aload 38
      // 2ea: ifnonnull 30d
      // 2ed: goto 2fb
      // 2f0: ldc2_w 1519071227046952158
      // 2f3: lload 5
      // 2f5: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fa: athrow
      // 2fb: ifeq 310
      // 2fe: goto 30c
      // 301: ldc2_w 1519071227046952158
      // 304: lload 5
      // 306: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: athrow
      // 30c: bipush 2
      // 30d: goto 311
      // 310: bipush 1
      // 311: iadd
      // 312: istore 49
      // 314: iinc 52 1
      // 317: aload 38
      // 319: ifnull 2b8
      // 31c: lload 5
      // 31e: lconst_0
      // 31f: lcmp
      // 320: ifle 793
      // 323: bipush 0
      // 324: istore 50
      // 326: aload 44
      // 328: checkcast com/zelix/_2
      // 32b: lload 18
      // 32d: bipush 1
      // 32e: anewarray 398
      // 331: dup_x2
      // 332: dup_x2
      // 333: pop
      // 334: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 337: bipush 0
      // 338: swap
      // 339: aastore
      // 33a: ldc2_w 1654924661605385734
      // 33d: lload 5
      // 33f: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)[Lcom/zelix/ss; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 344: astore 51
      // 346: aload 51
      // 348: arraylength
      // 349: istore 52
      // 34b: bipush 0
      // 34c: istore 53
      // 34e: iload 53
      // 350: iload 52
      // 352: if_icmpge 3b9
      // 355: aload 51
      // 357: iload 53
      // 359: aaload
      // 35a: astore 54
      // 35c: iload 50
      // 35e: lload 5
      // 360: lconst_0
      // 361: lcmp
      // 362: ifle 3c7
      // 365: aload 54
      // 367: lload 36
      // 369: bipush 1
      // 36a: anewarray 398
      // 36d: dup_x2
      // 36e: dup_x2
      // 36f: pop
      // 370: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 373: bipush 0
      // 374: swap
      // 375: aastore
      // 376: ldc2_w 1514056507684611830
      // 379: lload 5
      // 37b: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 380: aload 38
      // 382: ifnonnull 3c6
      // 385: aload 38
      // 387: ifnonnull 3aa
      // 38a: goto 398
      // 38d: ldc2_w 1519071227046952158
      // 390: lload 5
      // 392: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 397: athrow
      // 398: ifeq 3ad
      // 39b: goto 3a9
      // 39e: ldc2_w 1519071227046952158
      // 3a1: lload 5
      // 3a3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a8: athrow
      // 3a9: bipush 2
      // 3aa: goto 3ae
      // 3ad: bipush 1
      // 3ae: iadd
      // 3af: istore 50
      // 3b1: iinc 53 1
      // 3b4: aload 38
      // 3b6: ifnull 34e
      // 3b9: iload 49
      // 3bb: iload 50
      // 3bd: iadd
      // 3be: lload 5
      // 3c0: lconst_0
      // 3c1: lcmp
      // 3c2: ifle 3c7
      // 3c5: bipush 1
      // 3c6: isub
      // 3c7: istore 51
      // 3c9: iload 51
      // 3cb: iload 49
      // 3cd: if_icmplt 43d
      // 3d0: aload 8
      // 3d2: iload 51
      // 3d4: bipush 1
      // 3d5: anewarray 398
      // 3d8: dup_x1
      // 3d9: swap
      // 3da: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3dd: bipush 0
      // 3de: swap
      // 3df: aastore
      // 3e0: ldc2_w 986545603008354879
      // 3e3: lload 5
      // 3e5: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ea: aload 38
      // 3ec: lload 5
      // 3ee: lconst_0
      // 3ef: lcmp
      // 3f0: ifle 3f8
      // 3f3: ifnonnull 79c
      // 3f6: aload 38
      // 3f8: ifnonnull 433
      // 3fb: goto 409
      // 3fe: ldc2_w 1519071227046952158
      // 401: lload 5
      // 403: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 408: athrow
      // 409: ifne 43d
      // 40c: goto 41a
      // 40f: ldc2_w 1519071227046952158
      // 412: lload 5
      // 414: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 419: athrow
      // 41a: aload 47
      // 41c: iload 51
      // 41e: aload 40
      // 420: iload 51
      // 422: aaload
      // 423: aastore
      // 424: bipush 1
      // 425: goto 433
      // 428: ldc2_w 1519071227046952158
      // 42b: lload 5
      // 42d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 432: athrow
      // 433: istore 46
      // 435: iinc 51 -1
      // 438: aload 38
      // 43a: ifnull 3c9
      // 43d: aload 38
      // 43f: lload 5
      // 441: lconst_0
      // 442: lcmp
      // 443: ifle 43a
      // 446: ifnull 793
      // 449: aload 48
      // 44b: ldc2_w 1513123251526513462
      // 44e: lload 5
      // 450: invokedynamic i (JJ)Lcom/zelix/uv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 455: goto 463
      // 458: ldc2_w 1519071227046952158
      // 45b: lload 5
      // 45d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 462: athrow
      // 463: if_acmpne 793
      // 466: aload 41
      // 468: arraylength
      // 469: aload 38
      // 46b: ifnonnull 69e
      // 46e: goto 47c
      // 471: ldc2_w 1519071227046952158
      // 474: lload 5
      // 476: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47b: athrow
      // 47c: bipush 2
      // 47d: if_icmpge 69c
      // 480: goto 48e
      // 483: ldc2_w 1519071227046952158
      // 486: lload 5
      // 488: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 48d: athrow
      // 48e: aload 14
      // 490: invokevirtual com/zelix/sz.t ()Ljava/lang/Object;
      // 493: checkcast [Lcom/zelix/ss;
      // 496: astore 49
      // 498: aload 9
      // 49a: invokevirtual com/zelix/hz.T ()[Lcom/zelix/v7;
      // 49d: astore 50
      // 49f: aload 0
      // 4a0: lload 30
      // 4a2: aload 50
      // 4a4: bipush 2
      // 4a5: anewarray 398
      // 4a8: dup_x1
      // 4a9: swap
      // 4aa: bipush 1
      // 4ab: swap
      // 4ac: aastore
      // 4ad: dup_x2
      // 4ae: dup_x2
      // 4af: pop
      // 4b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4b3: bipush 0
      // 4b4: swap
      // 4b5: aastore
      // 4b6: ldc2_w 759210535927488069
      // 4b9: lload 5
      // 4bb: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c0: istore 51
      // 4c2: aload 0
      // 4c3: lload 30
      // 4c5: aload 39
      // 4c7: bipush 2
      // 4c8: anewarray 398
      // 4cb: dup_x1
      // 4cc: swap
      // 4cd: bipush 1
      // 4ce: swap
      // 4cf: aastore
      // 4d0: dup_x2
      // 4d1: dup_x2
      // 4d2: pop
      // 4d3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d6: bipush 0
      // 4d7: swap
      // 4d8: aastore
      // 4d9: ldc2_w 759210535927488069
      // 4dc: lload 5
      // 4de: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e3: istore 52
      // 4e5: bipush -1
      // 4e6: istore 53
      // 4e8: bipush 0
      // 4e9: istore 54
      // 4eb: iload 54
      // 4ed: iload 51
      // 4ef: if_icmpgt 51e
      // 4f2: aload 38
      // 4f4: ifnonnull 69c
      // 4f7: aload 50
      // 4f9: iload 54
      // 4fb: aaload
      // 4fc: aload 39
      // 4fe: iload 54
      // 500: aaload
      // 501: if_acmpne 51e
      // 504: goto 512
      // 507: ldc2_w 1519071227046952158
      // 50a: lload 5
      // 50c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 511: athrow
      // 512: iload 54
      // 514: istore 53
      // 516: iinc 54 1
      // 519: aload 38
      // 51b: ifnull 4eb
      // 51e: iload 51
      // 520: aload 38
      // 522: lload 5
      // 524: lconst_0
      // 525: lcmp
      // 526: ifle 6a0
      // 529: ifnonnull 69e
      // 52c: iload 52
      // 52e: if_icmpge 69c
      // 531: goto 53f
      // 534: ldc2_w 1519071227046952158
      // 537: lload 5
      // 539: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53e: athrow
      // 53f: iload 53
      // 541: aload 38
      // 543: lload 5
      // 545: lconst_0
      // 546: lcmp
      // 547: iflt 6a0
      // 54a: ifnonnull 69e
      // 54d: goto 55b
      // 550: ldc2_w 1519071227046952158
      // 553: lload 5
      // 555: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55a: athrow
      // 55b: iload 51
      // 55d: if_icmpne 69c
      // 560: goto 56e
      // 563: ldc2_w 1519071227046952158
      // 566: lload 5
      // 568: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56d: athrow
      // 56e: iload 52
      // 570: istore 54
      // 572: iload 52
      // 574: istore 55
      // 576: iload 55
      // 578: iload 53
      // 57a: bipush 1
      // 57b: iadd
      // 57c: if_icmplt 5f3
      // 57f: aload 40
      // 581: iload 55
      // 583: aaload
      // 584: bipush 0
      // 585: anewarray 398
      // 588: ldc2_w 791761395380941065
      // 58b: lload 5
      // 58d: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 592: aload 38
      // 594: lload 5
      // 596: lconst_0
      // 597: lcmp
      // 598: iflt 5a0
      // 59b: ifnonnull 5f5
      // 59e: aload 38
      // 5a0: lload 5
      // 5a2: lconst_0
      // 5a3: lcmp
      // 5a4: ifle 5f7
      // 5a7: ifnonnull 5f5
      // 5aa: goto 5b8
      // 5ad: ldc2_w 1519071227046952158
      // 5b0: lload 5
      // 5b2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b7: athrow
      // 5b8: ifeq 5f3
      // 5bb: goto 5c9
      // 5be: ldc2_w 1519071227046952158
      // 5c1: lload 5
      // 5c3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c8: athrow
      // 5c9: aload 47
      // 5cb: iload 55
      // 5cd: aload 40
      // 5cf: iload 55
      // 5d1: aaload
      // 5d2: aastore
      // 5d3: iinc 54 -1
      // 5d6: iinc 55 -1
      // 5d9: aload 38
      // 5db: ifnull 576
      // 5de: lload 5
      // 5e0: lconst_0
      // 5e1: lcmp
      // 5e2: ifle 57f
      // 5e5: goto 5f3
      // 5e8: ldc2_w 1519071227046952158
      // 5eb: lload 5
      // 5ed: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5f2: athrow
      // 5f3: iload 54
      // 5f5: aload 38
      // 5f7: ifnonnull 67b
      // 5fa: iload 51
      // 5fc: if_icmpeq 66c
      // 5ff: goto 60d
      // 602: ldc2_w 1519071227046952158
      // 605: lload 5
      // 607: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60c: athrow
      // 60d: aload 41
      // 60f: aload 38
      // 611: ifnonnull 692
      // 614: goto 622
      // 617: ldc2_w 1519071227046952158
      // 61a: lload 5
      // 61c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 621: athrow
      // 622: lload 5
      // 624: lconst_0
      // 625: lcmp
      // 626: ifle 684
      // 629: arraylength
      // 62a: ifne 682
      // 62d: goto 63b
      // 630: ldc2_w 1519071227046952158
      // 633: lload 5
      // 635: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63a: athrow
      // 63b: lload 5
      // 63d: lconst_0
      // 63e: lcmp
      // 63f: ifle 67d
      // 642: iload 54
      // 644: iload 51
      // 646: isub
      // 647: aload 38
      // 649: ifnonnull 67b
      // 64c: goto 65a
      // 64f: ldc2_w 1519071227046952158
      // 652: lload 5
      // 654: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 659: athrow
      // 65a: bipush 3
      // 65b: if_icmpgt 682
      // 65e: goto 66c
      // 661: ldc2_w 1519071227046952158
      // 664: lload 5
      // 666: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66b: athrow
      // 66c: bipush 1
      // 66d: goto 67b
      // 670: ldc2_w 1519071227046952158
      // 673: lload 5
      // 675: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67a: athrow
      // 67b: istore 46
      // 67d: aload 38
      // 67f: ifnull 69c
      // 682: aload 39
      // 684: goto 692
      // 687: ldc2_w 1519071227046952158
      // 68a: lload 5
      // 68c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 691: athrow
      // 692: bipush 0
      // 693: aload 47
      // 695: bipush 0
      // 696: aload 39
      // 698: arraylength
      // 699: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 69c: iload 46
      // 69e: aload 38
      // 6a0: ifnonnull 79c
      // 6a3: ifne 793
      // 6a6: goto 6b4
      // 6a9: ldc2_w 1519071227046952158
      // 6ac: lload 5
      // 6ae: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b3: athrow
      // 6b4: bipush 0
      // 6b5: istore 49
      // 6b7: iload 49
      // 6b9: aload 39
      // 6bb: arraylength
      // 6bc: if_icmpge 793
      // 6bf: aload 39
      // 6c1: iload 49
      // 6c3: aaload
      // 6c4: astore 50
      // 6c6: aload 40
      // 6c8: iload 49
      // 6ca: aaload
      // 6cb: astore 51
      // 6cd: aload 38
      // 6cf: lload 5
      // 6d1: lconst_0
      // 6d2: lcmp
      // 6d3: iflt 790
      // 6d6: ifnonnull 78e
      // 6d9: aload 50
      // 6db: lload 34
      // 6dd: invokevirtual com/zelix/v7.n (J)Z
      // 6e0: aload 38
      // 6e2: ifnonnull 79c
      // 6e5: goto 6f3
      // 6e8: ldc2_w 1519071227046952158
      // 6eb: lload 5
      // 6ed: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f2: athrow
      // 6f3: ifne 78b
      // 6f6: goto 704
      // 6f9: ldc2_w 1519071227046952158
      // 6fc: lload 5
      // 6fe: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 703: athrow
      // 704: aload 50
      // 706: bipush 0
      // 707: anewarray 398
      // 70a: ldc2_w 791761395380941065
      // 70d: lload 5
      // 70f: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 714: aload 38
      // 716: lload 5
      // 718: lconst_0
      // 719: lcmp
      // 71a: ifle 75f
      // 71d: ifnonnull 75d
      // 720: goto 72e
      // 723: ldc2_w 1519071227046952158
      // 726: lload 5
      // 728: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72d: athrow
      // 72e: ifne 78b
      // 731: goto 73f
      // 734: ldc2_w 1519071227046952158
      // 737: lload 5
      // 739: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73e: athrow
      // 73f: aload 51
      // 741: bipush 0
      // 742: anewarray 398
      // 745: ldc2_w 791761395380941065
      // 748: lload 5
      // 74a: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 74f: goto 75d
      // 752: ldc2_w 1519071227046952158
      // 755: lload 5
      // 757: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75c: athrow
      // 75d: aload 38
      // 75f: ifnonnull 789
      // 762: ifeq 78b
      // 765: goto 773
      // 768: ldc2_w 1519071227046952158
      // 76b: lload 5
      // 76d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 772: athrow
      // 773: aload 47
      // 775: iload 49
      // 777: aload 51
      // 779: aastore
      // 77a: bipush 1
      // 77b: goto 789
      // 77e: ldc2_w 1519071227046952158
      // 781: lload 5
      // 783: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 788: athrow
      // 789: istore 46
      // 78b: iinc 49 1
      // 78e: aload 38
      // 790: ifnull 6b7
      // 793: lload 5
      // 795: lconst_0
      // 796: lcmp
      // 797: iflt 7bf
      // 79a: iload 46
      // 79c: ifeq 7bf
      // 79f: aload 11
      // 7a1: aload 3
      // 7a2: aload 41
      // 7a4: aload 47
      // 7a6: aload 4
      // 7a8: aload 10
      // 7aa: lload 26
      // 7ac: aload 12
      // 7ae: aload 2
      // 7af: aload 13
      // 7b1: aload 14
      // 7b3: aload 15
      // 7b5: aload 7
      // 7b7: invokestatic com/zelix/_z.D (Lcom/zelix/k6;Lcom/zelix/iq;[Lcom/zelix/v7;[Lcom/zelix/v7;Lcom/zelix/t6;Ljava/util/Set;JLjava/util/List;Lcom/zelix/lb6;Lcom/zelix/sz;Lcom/zelix/sz;Ljava/util/Map;Ljava/util/Map;)Lcom/zelix/_z;
      // 7ba: astore 49
      // 7bc: aload 49
      // 7be: areturn
      // 7bf: aload 11
      // 7c1: aload 3
      // 7c2: aload 41
      // 7c4: aload 39
      // 7c6: aload 4
      // 7c8: aload 10
      // 7ca: lload 26
      // 7cc: aload 12
      // 7ce: aload 2
      // 7cf: aload 13
      // 7d1: aload 14
      // 7d3: aload 15
      // 7d5: aload 7
      // 7d7: invokestatic com/zelix/_z.D (Lcom/zelix/k6;Lcom/zelix/iq;[Lcom/zelix/v7;[Lcom/zelix/v7;Lcom/zelix/t6;Ljava/util/Set;JLjava/util/List;Lcom/zelix/lb6;Lcom/zelix/sz;Lcom/zelix/sz;Ljava/util/Map;Ljava/util/Map;)Lcom/zelix/_z;
      // 7da: astore 49
      // 7dc: aload 49
      // 7de: areturn
   }

   private static n9 a(n9 var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29689;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/lom", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("com/zelix/lom" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27726;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
            throw new RuntimeException("com/zelix/lom", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
         throw new RuntimeException("com/zelix/lom" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
