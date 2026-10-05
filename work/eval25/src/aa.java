package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class aa {
   private boolean Q;
   private static final char R;
   private static final char O;
   private boolean V;
   private static final char X;
   public static final char[] e;
   static final _uo o;
   private boolean x;
   private static final int[] j;
   static final char[] d;
   private static final long ab = ess.a(5117023499892550578L, 5330828908882964666L, MethodHandles.lookup().lookupClass()).a(183592626144375L);
   private static final String[] cb;
   private static final String[] db;
   private static final Map eb = new HashMap(13);
   private static final long[] ib;
   private static final Integer[] jb;
   private static final Map kb;
   private static final long[] ob;
   private static final Long[] pb;
   private static final Map qb;

   public abstract void N(Object[] var1);

   public static String e(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 7
      // 014: dup
      // 015: bipush 2
      // 016: aaload
      // 017: checkcast java/lang/String
      // 01a: astore 6
      // 01c: dup
      // 01d: bipush 3
      // 01e: aaload
      // 01f: checkcast java/lang/String
      // 022: astore 3
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast java/lang/Boolean
      // 029: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02c: istore 1
      // 02d: dup
      // 02e: bipush 5
      // 02f: aaload
      // 030: checkcast java/lang/String
      // 033: astore 2
      // 034: dup
      // 035: bipush 6
      // 037: aaload
      // 038: checkcast java/util/Random
      // 03b: astore 5
      // 03d: pop
      // 03e: getstatic com/zelix/aa.ab J
      // 041: lload 7
      // 043: lxor
      // 044: lstore 7
      // 046: lload 7
      // 048: dup2
      // 049: ldc2_w 67482030426297
      // 04c: lxor
      // 04d: lstore 9
      // 04f: pop2
      // 050: ldc2_w -8589203052030738254
      // 053: lload 7
      // 055: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05a: new java/lang/StringBuilder
      // 05d: dup
      // 05e: invokespecial java/lang/StringBuilder.<init> ()V
      // 061: astore 12
      // 063: istore 11
      // 065: aload 4
      // 067: iload 11
      // 069: ifeq 0e1
      // 06c: ifnull 0df
      // 06f: goto 07d
      // 072: ldc2_w -8506525623549479504
      // 075: lload 7
      // 077: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: aload 12
      // 07f: sipush 17200
      // 082: ldc2_w 5526912988511109350
      // 085: lload 7
      // 087: lxor
      // 088: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 090: pop
      // 091: aload 12
      // 093: sipush 13473
      // 096: ldc2_w 3518656557447608171
      // 099: lload 7
      // 09b: lxor
      // 09c: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a1: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0a4: pop
      // 0a5: aload 12
      // 0a7: lload 9
      // 0a9: aload 4
      // 0ab: aload 2
      // 0ac: bipush 3
      // 0ad: anewarray 606
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: bipush 2
      // 0b3: swap
      // 0b4: aastore
      // 0b5: dup_x1
      // 0b6: swap
      // 0b7: bipush 1
      // 0b8: swap
      // 0b9: aastore
      // 0ba: dup_x2
      // 0bb: dup_x2
      // 0bc: pop
      // 0bd: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: ldc2_w -8042862540748401128
      // 0c6: lload 7
      // 0c8: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: pop
      // 0d1: goto 0df
      // 0d4: ldc2_w -8506525623549479504
      // 0d7: lload 7
      // 0d9: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 6
      // 0e1: lload 7
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: ifle 161
      // 0e8: iload 11
      // 0ea: ifeq 161
      // 0ed: ifnull 160
      // 0f0: goto 0fe
      // 0f3: ldc2_w -8506525623549479504
      // 0f6: lload 7
      // 0f8: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: aload 12
      // 100: sipush 17200
      // 103: ldc2_w 5526912988511109350
      // 106: lload 7
      // 108: lxor
      // 109: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 111: pop
      // 112: aload 12
      // 114: sipush 29952
      // 117: ldc2_w 4858058901848569555
      // 11a: lload 7
      // 11c: lxor
      // 11d: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 125: pop
      // 126: aload 12
      // 128: lload 9
      // 12a: aload 6
      // 12c: aload 2
      // 12d: bipush 3
      // 12e: anewarray 606
      // 131: dup_x1
      // 132: swap
      // 133: bipush 2
      // 134: swap
      // 135: aastore
      // 136: dup_x1
      // 137: swap
      // 138: bipush 1
      // 139: swap
      // 13a: aastore
      // 13b: dup_x2
      // 13c: dup_x2
      // 13d: pop
      // 13e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 141: bipush 0
      // 142: swap
      // 143: aastore
      // 144: ldc2_w -8042862540748401128
      // 147: lload 7
      // 149: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 151: pop
      // 152: goto 160
      // 155: ldc2_w -8506525623549479504
      // 158: lload 7
      // 15a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15f: athrow
      // 160: aload 3
      // 161: ifnull 1c5
      // 164: aload 12
      // 166: sipush 17200
      // 169: ldc2_w 5526912988511109350
      // 16c: lload 7
      // 16e: lxor
      // 16f: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 174: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 177: pop
      // 178: aload 12
      // 17a: sipush 402
      // 17d: ldc2_w 6039597703682867791
      // 180: lload 7
      // 182: lxor
      // 183: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 18b: pop
      // 18c: aload 12
      // 18e: lload 9
      // 190: aload 3
      // 191: aload 2
      // 192: bipush 3
      // 193: anewarray 606
      // 196: dup_x1
      // 197: swap
      // 198: bipush 2
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 1
      // 19e: swap
      // 19f: aastore
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: ldc2_w -8042862540748401128
      // 1ac: lload 7
      // 1ae: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b6: pop
      // 1b7: goto 1c5
      // 1ba: ldc2_w -8506525623549479504
      // 1bd: lload 7
      // 1bf: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: iload 1
      // 1c6: iload 11
      // 1c8: ifeq 23e
      // 1cb: ifeq 20d
      // 1ce: goto 1dc
      // 1d1: ldc2_w -8506525623549479504
      // 1d4: lload 7
      // 1d6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1db: athrow
      // 1dc: aload 5
      // 1de: sipush 22536
      // 1e1: ldc2_w 4491838109618740161
      // 1e4: lload 7
      // 1e6: lxor
      // 1e7: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: invokevirtual java/util/Random.nextInt (I)I
      // 1ef: sipush 15773
      // 1f2: ldc2_w 6664845340314861132
      // 1f5: lload 7
      // 1f7: lxor
      // 1f8: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: iadd
      // 1fe: i2c
      // 1ff: istore 13
      // 201: lload 7
      // 203: lconst_0
      // 204: lcmp
      // 205: iflt 25c
      // 208: iload 11
      // 20a: ifne 240
      // 20d: aload 5
      // 20f: sipush 22536
      // 212: ldc2_w 4491838109618740161
      // 215: lload 7
      // 217: lxor
      // 218: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 21d: invokevirtual java/util/Random.nextInt (I)I
      // 220: sipush 13473
      // 223: ldc2_w 3518656557447608171
      // 226: lload 7
      // 228: lxor
      // 229: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22e: iadd
      // 22f: i2c
      // 230: goto 23e
      // 233: ldc2_w -8506525623549479504
      // 236: lload 7
      // 238: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23d: athrow
      // 23e: istore 13
      // 240: aload 12
      // 242: sipush 17200
      // 245: ldc2_w 5526912988511109350
      // 248: lload 7
      // 24a: lxor
      // 24b: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 250: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 253: pop
      // 254: aload 12
      // 256: iload 13
      // 258: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 25b: pop
      // 25c: aload 12
      // 25e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 261: areturn
   }

   abstract void v(Object[] var1);

   public static String T(Object[] var0) {
      long var3 = (Long)var0[0];
      long var5 = (Long)var0[1];
      long var7 = (Long)var0[2];
      long var9 = (Long)var0[3];
      long var11 = (Long)var0[4];
      String var13 = (String)var0[5];
      long var1 = (Long)var0[6];
      var1 = ab ^ var1;
      long var14 = var1 ^ 27301718631182L;
      StringBuilder var16 = new StringBuilder();
      Object[] var10005 = new Object[]{null, var14, var13};
      var10005[0] = var3;
      var16.append(x44.a<"u">(var10005, 5034130439975644679L, var1));
      var10005 = new Object[]{null, var14, var13};
      var10005[0] = var5;
      var16.append(x44.a<"u">(var10005, 5034130439975644679L, var1));
      var10005 = new Object[]{null, var14, var13};
      var10005[0] = var7;
      var16.append(x44.a<"u">(var10005, 5034130439975644679L, var1));
      var10005 = new Object[]{null, var14, var13};
      var10005[0] = var9;
      var16.append(x44.a<"u">(var10005, 5034130439975644679L, var1));
      var10005 = new Object[]{null, var14, var13};
      var10005[0] = var11;
      var16.append(x44.a<"u">(var10005, 5034130439975644679L, var1));
      return var16.toString();
   }

   public abstract boolean r();

   public abstract void O(Object[] var1);

   private static String Z(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:29 from source 26_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/Long
      // 007: invokevirtual java/lang/Long.longValue ()J
      // 00a: lstore 1
      // 00b: dup
      // 00c: bipush 1
      // 00d: aaload
      // 00e: checkcast java/lang/String
      // 011: astore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/aa.ab J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 108781899339652
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: ldc2_w -6423211649131417949
      // 02d: lload 1
      // 02e: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: new java/lang/StringBuilder
      // 036: dup
      // 037: aload 3
      // 038: invokevirtual java/lang/String.length ()I
      // 03b: bipush 3
      // 03c: imul
      // 03d: invokespecial java/lang/StringBuilder.<init> (I)V
      // 040: astore 8
      // 042: istore 7
      // 044: bipush 0
      // 045: istore 9
      // 047: iload 9
      // 049: aload 3
      // 04a: invokevirtual java/lang/String.length ()I
      // 04d: if_icmpge 0df
      // 050: aload 3
      // 051: iload 9
      // 053: invokevirtual java/lang/String.charAt (I)C
      // 056: ldc2_w -6404188298638359157
      // 059: lload 1
      // 05a: invokedynamic p (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05f: lload 1
      // 060: lconst_0
      // 061: lcmp
      // 062: iflt 0f6
      // 065: astore 10
      // 067: aload 8
      // 069: aload 10
      // 06b: sipush 10323
      // 06e: ldc2_w 4462722524177843602
      // 071: lload 1
      // 072: lxor
      // 073: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: bipush 3
      // 079: lload 5
      // 07b: sipush 28285
      // 07e: ldc2_w 941677314367947680
      // 081: lload 1
      // 082: lxor
      // 083: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: bipush 5
      // 089: anewarray 606
      // 08c: dup_x1
      // 08d: swap
      // 08e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 091: bipush 4
      // 092: swap
      // 093: aastore
      // 094: dup_x2
      // 095: dup_x2
      // 096: pop
      // 097: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09a: bipush 3
      // 09b: swap
      // 09c: aastore
      // 09d: dup_x1
      // 09e: swap
      // 09f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a2: bipush 2
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0aa: bipush 1
      // 0ab: swap
      // 0ac: aastore
      // 0ad: dup_x1
      // 0ae: swap
      // 0af: bipush 0
      // 0b0: swap
      // 0b1: aastore
      // 0b2: ldc2_w -6454143616425811030
      // 0b5: lload 1
      // 0b6: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0be: iload 7
      // 0c0: ifeq 0e1
      // 0c3: pop
      // 0c4: iinc 9 1
      // 0c7: iload 7
      // 0c9: ifne 047
      // 0cc: lload 1
      // 0cd: lconst_0
      // 0ce: lcmp
      // 0cf: iflt 067
      // 0d2: goto 0df
      // 0d5: ldc2_w -6348968960896263263
      // 0d8: lload 1
      // 0d9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 8
      // 0e1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e4: ldc2_w -4651479710781419441
      // 0e7: lload 1
      // 0e8: invokedynamic p (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: ldc2_w -6773084740893369907
      // 0f0: lload 1
      // 0f1: invokedynamic p (JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: astore 9
      // 0f8: bipush 0
      // 0f9: istore 10
      // 0fb: bipush 0
      // 0fc: istore 11
      // 0fe: iload 11
      // 100: aload 4
      // 102: invokevirtual java/lang/String.length ()I
      // 105: if_icmpge 11c
      // 108: iload 10
      // 10a: aload 4
      // 10c: iload 11
      // 10e: invokevirtual java/lang/String.charAt (I)C
      // 111: iadd
      // 112: istore 10
      // 114: iinc 11 1
      // 117: iload 7
      // 119: ifne 0fe
      // 11c: lload 1
      // 11d: lconst_0
      // 11e: lcmp
      // 11f: ifle 117
      // 122: aload 9
      // 124: ldc2_w -4651479710781419441
      // 127: lload 1
      // 128: invokedynamic p (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: iload 10
      // 12f: i2l
      // 130: ladd
      // 131: lstore 11
      // 133: lload 11
      // 135: ldc2_w -4634776031687185290
      // 138: lload 1
      // 139: invokedynamic p (JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: areturn
   }

   public static String H(Object[] var0) {
      String var4 = (String)var0[0];
      long var1 = (Long)var0[1];
      String var3 = (String)var0[2];
      var1 = ab ^ var1;
      long var5 = var1 ^ 103091765644747L;
      long var7 = var1 ^ 28262820780791L;
      int var9 = x44.a<"t">(new Object[]{var4, var7}, 2521294844457709713L, var1);
      var4 = var4.substring(var9);
      return x44.a<"t">(new Object[]{var4, var5, var3}, 4608966922772928640L, var1);
   }

   static {
      long var31 = ab ^ 140338391565805L;
      long var10001 = var31 ^ 32339220682108L;
      int var33 = (int)((var31 ^ 32339220682108L) >>> 32);
      int var34 = (int)((var31 ^ 32339220682108L) << 32 >>> 48);
      int var35 = (int)(var10001 << 48 >>> 48);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var23 = 1; var23 < 8; var23++) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[9];
      int var27 = 0;
      String var26 = "õ\u0082£ðj{\u008dØþ\u007f\u0007\u0018L½\u0019:(\u001a9éN\u00adù³0¯?YI\bÄ\r¶7\u0092Me{\u007f\u0098ùø\u0019BSéËtÑr)\u0015[\nø £\u0018\u008fðz/qQ²zV»rþ³\u0083z\u009c\u001a\u000f+\u001d\u0016ÎÅgp>©¹\u0006\u0082À\u0007+Ä\u0001\u009fOo'dà¡\u001fà\u0089.y\u0082\u007f\u0015wP(C\u0096\u0012ÂÍ\u0005ägxÿmq\u0080×Ò»Ï\u009dö0N#\u0088*\u000e¹<\u0005+\u0097>E2Â\u0003ó\u0094$9ö#©ñ_\u00ad\u0006ëÛwm\u009cD\u009dL\u0089\n\u009e\u009aA\u0002\u0013îR«\u009eÿ|&½·®*\u0011Ám\u008añE)N\u009c<}``sìOÂ\u0019\u0081\u0092\u00911p´\"ii¶çp)²øµ1qÃ¢\u001f2\u0010\u0086ÿu\féwK\u009f¸\u0013Pk°\u0014H\u001aQF|öSÔJ\n»á¦\rÊjÌ\u007f\u0007°\u009fò¸\u0095\u0017¸æA\u00845®ã~¶S\u0080Å@\u0089Û×\u0093>`®\u008eHx\u0096O\u0007o\u0017¯p)\u0006Ækñ\u009ec\u008c=Ã\u0081dOþ\u0098q\u0005H\u007fáÿ(¶\u0081\u0019VttGø'WOúéäg´î¿Ä\u0006>¡\u0011ïqüþÀ\u0001P\u0093¶=0\nQ]z\u009eH\t%§T\rÉÜc.´\u0092üDc\u001fV\u0084«È@Jo°\u008d\u0092y~\u001fº\u0096c®·¨\u001c\u0094]\n§º\u0099gKôI\f5\u0097mñ\u0010Ã\u0097\u0006^&ê\u0095ËW¹ÆñÀQÑ\u009d";
      int var28 = "õ\u0082£ðj{\u008dØþ\u007f\u0007\u0018L½\u0019:(\u001a9éN\u00adù³0¯?YI\bÄ\r¶7\u0092Me{\u007f\u0098ùø\u0019BSéËtÑr)\u0015[\nø £\u0018\u008fðz/qQ²zV»rþ³\u0083z\u009c\u001a\u000f+\u001d\u0016ÎÅgp>©¹\u0006\u0082À\u0007+Ä\u0001\u009fOo'dà¡\u001fà\u0089.y\u0082\u007f\u0015wP(C\u0096\u0012ÂÍ\u0005ägxÿmq\u0080×Ò»Ï\u009dö0N#\u0088*\u000e¹<\u0005+\u0097>E2Â\u0003ó\u0094$9ö#©ñ_\u00ad\u0006ëÛwm\u009cD\u009dL\u0089\n\u009e\u009aA\u0002\u0013îR«\u009eÿ|&½·®*\u0011Ám\u008añE)N\u009c<}``sìOÂ\u0019\u0081\u0092\u00911p´\"ii¶çp)²øµ1qÃ¢\u001f2\u0010\u0086ÿu\féwK\u009f¸\u0013Pk°\u0014H\u001aQF|öSÔJ\n»á¦\rÊjÌ\u007f\u0007°\u009fò¸\u0095\u0017¸æA\u00845®ã~¶S\u0080Å@\u0089Û×\u0093>`®\u008eHx\u0096O\u0007o\u0017¯p)\u0006Ækñ\u009ec\u008c=Ã\u0081dOþ\u0098q\u0005H\u007fáÿ(¶\u0081\u0019VttGø'WOúéäg´î¿Ä\u0006>¡\u0011ïqüþÀ\u0001P\u0093¶=0\nQ]z\u009eH\t%§T\rÉÜc.´\u0092üDc\u001fV\u0084«È@Jo°\u008d\u0092y~\u001fº\u0096c®·¨\u001c\u0094]\n§º\u0099gKôI\f5\u0097mñ\u0010Ã\u0097\u0006^&ê\u0095ËW¹ÆñÀQÑ\u009d"
         .length();
      char var25 = 16;
      int var39 = -1;

      label81:
      while (true) {
         String var40 = var26.substring(++var39, var39 + var25);
         byte var46 = -1;

         while (true) {
            byte[] var30 = var22.doFinal(var40.getBytes("ISO-8859-1"));
            String var57 = a(var30).intern();
            switch (var46) {
               case 0:
                  var29[var27++] = var57;
                  if ((var39 += var25) >= var28) {
                     cb = var29;
                     db = new String[9];
                     kb = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[27];
                     int var14 = 0;
                     String var15 = "\u0090Æ\u0097è\u001b(Û\u0094¼«W\u0006\u0097\u009d\r£§¬¤Ô\u009d®n\u00adFT[Voü}Nv\u000e\u0093§\u0084·µëê§ÿ\u0011\n=ñï_0ö\u009d\u0087áÀ5Pç\u0087LëcérÁí ¿\u0092\u0004\u0011\u008f\u0092~^lz\u008bÂ±Ü]¸¥\u0082nB\u0099\u0016l·\u0087~O-ÄJq\u0086f\u008fs®\u0086\u0088°è\u0094\u001b\u000eä@$\u0013t*\u008er\u0084TÈÛãº\u0092þ\u0005®¥fl\u0094\u0012m(tx\u009c\u0083å\u0099Ò\u0018C\u0095aSk?nA£Ä\u0006Èû\\ÓÒäf\u0001\u0006ý±¤ÉFÚÀ\u008es+È\u009b´äüDû\u0007ö\u0002%ÍîËz\u008aêßð \bÏXî¹n*";
                     int var16 = "\u0090Æ\u0097è\u001b(Û\u0094¼«W\u0006\u0097\u009d\r£§¬¤Ô\u009d®n\u00adFT[Voü}Nv\u000e\u0093§\u0084·µëê§ÿ\u0011\n=ñï_0ö\u009d\u0087áÀ5Pç\u0087LëcérÁí ¿\u0092\u0004\u0011\u008f\u0092~^lz\u008bÂ±Ü]¸¥\u0082nB\u0099\u0016l·\u0087~O-ÄJq\u0086f\u008fs®\u0086\u0088°è\u0094\u001b\u000eä@$\u0013t*\u008er\u0084TÈÛãº\u0092þ\u0005®¥fl\u0094\u0012m(tx\u009c\u0083å\u0099Ò\u0018C\u0095aSk?nA£Ä\u0006Èû\\ÓÒäf\u0001\u0006ý±¤ÉFÚÀ\u008es+È\u009b´äüDû\u0007ö\u0002%ÍîËz\u008aêßð \bÏXî¹n*"
                        .length();
                     byte var13 = 0;

                     label63:
                     while (true) {
                        byte var50 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                        long[] var43 = var17;
                        int var51 = var14++;
                        long var61 = ((long)var18[0] & 255L) << 56
                           | ((long)var18[1] & 255L) << 48
                           | ((long)var18[2] & 255L) << 40
                           | ((long)var18[3] & 255L) << 32
                           | ((long)var18[4] & 255L) << 24
                           | ((long)var18[5] & 255L) << 16
                           | ((long)var18[6] & 255L) << 8
                           | (long)var18[7] & 255L;
                        byte var67 = -1;

                        while (true) {
                           long var19 = var61;
                           byte[] var21 = var11.doFinal(
                              new byte[]{
                                 (byte)((int)(var19 >>> 56)),
                                 (byte)((int)(var19 >>> 48)),
                                 (byte)((int)(var19 >>> 40)),
                                 (byte)((int)(var19 >>> 32)),
                                 (byte)((int)(var19 >>> 24)),
                                 (byte)((int)(var19 >>> 16)),
                                 (byte)((int)(var19 >>> 8)),
                                 (byte)((int)var19)
                              }
                           );
                           long var72 = ((long)var21[0] & 255L) << 56
                              | ((long)var21[1] & 255L) << 48
                              | ((long)var21[2] & 255L) << 40
                              | ((long)var21[3] & 255L) << 32
                              | ((long)var21[4] & 255L) << 24
                              | ((long)var21[5] & 255L) << 16
                              | ((long)var21[6] & 255L) << 8
                              | (long)var21[7] & 255L;
                           switch (var67) {
                              case 0:
                                 var43[var51] = var72;
                                 if (var13 >= var16) {
                                    ib = var17;
                                    jb = new Integer[27];
                                    qb = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[5];
                                    int var3 = 0;
                                    String var4 = "9Y\u009e\u0015\u007f\u0096ÁóÕjc\tÖS\u001e¿«´³·ßH©X";
                                    int var5 = "9Y\u009e\u0015\u007f\u0096ÁóÕjc\tÖS\u001e¿«´³·ßH©X".length();
                                    byte var2 = 0;

                                    label47:
                                    while (true) {
                                       byte var53 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
                                       long[] var45 = var6;
                                       int var54 = var3++;
                                       long var64 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
                                       byte var70 = -1;

                                       while (true) {
                                          long var8 = var64;
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
                                          var72 = ((long)var10[0] & 255L) << 56
                                             | ((long)var10[1] & 255L) << 48
                                             | ((long)var10[2] & 255L) << 40
                                             | ((long)var10[3] & 255L) << 32
                                             | ((long)var10[4] & 255L) << 24
                                             | ((long)var10[5] & 255L) << 16
                                             | ((long)var10[6] & 255L) << 8
                                             | (long)var10[7] & 255L;
                                          switch (var70) {
                                             case 0:
                                                var45[var54] = var72;
                                                if (var2 >= var5) {
                                                   ob = var6;
                                                   pb = new Long[5];
                                                   o = _uo.f(var33, (short)var34, var35);
                                                   d = a<"i">(30224, 713890277688524718L ^ var31).toCharArray();
                                                   e = a<"i">(3630, 5149126623051007889L ^ var31).toCharArray();
                                                   R = a<"i">(21086, 1904986090165312487L ^ var31).charAt(0);
                                                   O = x44.a<"o">(-6031447797322359381L, var31)[x44.a<"o">(-6031447797322359381L, var31).length - 2];
                                                   X = x44.a<"o">(-6031447797322359381L, var31)[x44.a<"o">(-6031447797322359381L, var31).length - 1];
                                                   j = new int[0];
                                                   return;
                                                }
                                                break;
                                             default:
                                                var45[var54] = var72;
                                                if (var2 < var5) {
                                                   continue label47;
                                                }

                                                var4 = "V\u0084zË¤9áLìfÉ¾\u0090\u009b\u0095\n";
                                                var5 = "V\u0084zË¤9áLìfÉ¾\u0090\u009b\u0095\n".length();
                                                var2 = 0;
                                          }

                                          byte var55 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var55, var2).getBytes("ISO-8859-1");
                                          var45 = var6;
                                          var54 = var3++;
                                          var64 = ((long)var7[0] & 255L) << 56
                                             | ((long)var7[1] & 255L) << 48
                                             | ((long)var7[2] & 255L) << 40
                                             | ((long)var7[3] & 255L) << 32
                                             | ((long)var7[4] & 255L) << 24
                                             | ((long)var7[5] & 255L) << 16
                                             | ((long)var7[6] & 255L) << 8
                                             | (long)var7[7] & 255L;
                                          var70 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var43[var51] = var72;
                                 if (var13 < var16) {
                                    continue label63;
                                 }

                                 var15 = "Àå\u001bÔãÈ<á\u008d\u0086\\8g·\u0005\b";
                                 var16 = "Àå\u001bÔãÈ<á\u008d\u0086\\8g·\u0005\b".length();
                                 var13 = 0;
                           }

                           byte var52 = var13;
                           var13 += 8;
                           var18 = var15.substring(var52, var13).getBytes("ISO-8859-1");
                           var43 = var17;
                           var51 = var14++;
                           var61 = ((long)var18[0] & 255L) << 56
                              | ((long)var18[1] & 255L) << 48
                              | ((long)var18[2] & 255L) << 40
                              | ((long)var18[3] & 255L) << 32
                              | ((long)var18[4] & 255L) << 24
                              | ((long)var18[5] & 255L) << 16
                              | ((long)var18[6] & 255L) << 8
                              | (long)var18[7] & 255L;
                           var67 = 0;
                        }
                     }
                  }

                  var25 = var26.charAt(var39);
                  break;
               default:
                  var29[var27++] = var57;
                  if ((var39 += var25) < var28) {
                     var25 = var26.charAt(var39);
                     continue label81;
                  }

                  var26 = "1ómAí©\u0085÷Õ.R\u0003-\u007f\u000bj\\\u0090¥£\u0015\u00ad·n¨gÕ6~×ÿëÔï\u0091æ{Ñ®\u0085\u0010\u0011\râÔUB\u0016¾Ùàëe^\u000eBø";
                  var28 = "1ómAí©\u0085÷Õ.R\u0003-\u007f\u000bj\\\u0090¥£\u0015\u00ad·n¨gÕ6~×ÿëÔï\u0091æ{Ñ®\u0085\u0010\u0011\râÔUB\u0016¾Ùàëe^\u000eBø"
                     .length();
                  var25 = '(';
                  var39 = -1;
            }

            var40 = var26.substring(++var39, var39 + var25);
            var46 = 0;
         }
      }
   }

   public static String r(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/Integer
      // 018: astore 1
      // 019: pop
      // 01a: getstatic com/zelix/aa.ab J
      // 01d: lload 3
      // 01e: lxor
      // 01f: lstore 3
      // 020: lload 3
      // 021: dup2
      // 022: ldc2_w 36580860577023
      // 025: lxor
      // 026: dup2
      // 027: bipush 32
      // 029: lushr
      // 02a: l2i
      // 02b: istore 5
      // 02d: dup2
      // 02e: bipush 32
      // 030: lshl
      // 031: bipush 32
      // 033: lushr
      // 034: l2i
      // 035: istore 6
      // 037: pop2
      // 038: dup2
      // 039: ldc2_w 4313053268323
      // 03c: lxor
      // 03d: lstore 7
      // 03f: pop2
      // 040: ldc2_w -7684140922617209565
      // 043: lload 3
      // 044: invokedynamic p (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 049: istore 9
      // 04b: aload 2
      // 04c: ldc "Z"
      // 04e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 051: iload 9
      // 053: ifeq 079
      // 056: ifeq 073
      // 059: goto 066
      // 05c: ldc2_w -7754151977129793503
      // 05f: lload 3
      // 060: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: ldc "1"
      // 068: areturn
      // 069: ldc2_w -7754151977129793503
      // 06c: lload 3
      // 06d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: athrow
      // 073: aload 2
      // 074: ldc "I"
      // 076: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 079: iload 9
      // 07b: lload 3
      // 07c: lconst_0
      // 07d: lcmp
      // 07e: iflt 0b4
      // 081: ifeq 0b2
      // 084: ifeq 0a1
      // 087: goto 094
      // 08a: ldc2_w -7754151977129793503
      // 08d: lload 3
      // 08e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: ldc "2"
      // 096: areturn
      // 097: ldc2_w -7754151977129793503
      // 09a: lload 3
      // 09b: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: athrow
      // 0a1: aload 2
      // 0a2: sipush 29081
      // 0a5: ldc2_w 7252238416652961180
      // 0a8: lload 3
      // 0a9: lxor
      // 0aa: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b2: iload 9
      // 0b4: lload 3
      // 0b5: lconst_0
      // 0b6: lcmp
      // 0b7: ifle 0ed
      // 0ba: ifeq 0eb
      // 0bd: ifeq 0da
      // 0c0: goto 0cd
      // 0c3: ldc2_w -7754151977129793503
      // 0c6: lload 3
      // 0c7: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: ldc "3"
      // 0cf: areturn
      // 0d0: ldc2_w -7754151977129793503
      // 0d3: lload 3
      // 0d4: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d9: athrow
      // 0da: aload 2
      // 0db: sipush 20979
      // 0de: ldc2_w 6821265519126390271
      // 0e1: lload 3
      // 0e2: lxor
      // 0e3: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0eb: iload 9
      // 0ed: lload 3
      // 0ee: lconst_0
      // 0ef: lcmp
      // 0f0: ifle 126
      // 0f3: ifeq 124
      // 0f6: ifeq 113
      // 0f9: goto 106
      // 0fc: ldc2_w -7754151977129793503
      // 0ff: lload 3
      // 100: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: ldc "4"
      // 108: areturn
      // 109: ldc2_w -7754151977129793503
      // 10c: lload 3
      // 10d: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: aload 2
      // 114: sipush 6627
      // 117: ldc2_w 509604859473194464
      // 11a: lload 3
      // 11b: lxor
      // 11c: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 124: iload 9
      // 126: ifeq 1a3
      // 129: ifeq 146
      // 12c: goto 139
      // 12f: ldc2_w -7754151977129793503
      // 132: lload 3
      // 133: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: ldc "5"
      // 13b: areturn
      // 13c: ldc2_w -7754151977129793503
      // 13f: lload 3
      // 140: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: athrow
      // 146: iload 5
      // 148: aload 1
      // 149: new java/lang/StringBuilder
      // 14c: dup
      // 14d: invokespecial java/lang/StringBuilder.<init> ()V
      // 150: ldc "'"
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: aload 1
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 159: sipush 12091
      // 15c: ldc2_w 1062987115710208829
      // 15f: lload 3
      // 160: lxor
      // 161: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 169: aload 2
      // 16a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 16d: ldc "'"
      // 16f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 172: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 175: iload 6
      // 177: swap
      // 178: bipush 4
      // 179: anewarray 606
      // 17c: dup_x1
      // 17d: swap
      // 17e: bipush 3
      // 17f: swap
      // 180: aastore
      // 181: dup_x1
      // 182: swap
      // 183: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 186: bipush 2
      // 187: swap
      // 188: aastore
      // 189: dup_x1
      // 18a: swap
      // 18b: bipush 1
      // 18c: swap
      // 18d: aastore
      // 18e: dup_x1
      // 18f: swap
      // 190: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 193: bipush 0
      // 194: swap
      // 195: aastore
      // 196: ldc2_w -8286701583749176276
      // 199: lload 3
      // 19a: invokedynamic p (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19f: aload 1
      // 1a0: invokevirtual java/lang/Integer.intValue ()I
      // 1a3: i2l
      // 1a4: ldc2_w -7689848109888504346
      // 1a7: lload 3
      // 1a8: invokedynamic i (JJ)[C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: lload 7
      // 1af: bipush 3
      // 1b0: anewarray 606
      // 1b3: dup_x2
      // 1b4: dup_x2
      // 1b5: pop
      // 1b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b9: bipush 2
      // 1ba: swap
      // 1bb: aastore
      // 1bc: dup_x1
      // 1bd: swap
      // 1be: bipush 1
      // 1bf: swap
      // 1c0: aastore
      // 1c1: dup_x2
      // 1c2: dup_x2
      // 1c3: pop
      // 1c4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1c7: bipush 0
      // 1c8: swap
      // 1c9: aastore
      // 1ca: ldc2_w -8261071903350156855
      // 1cd: lload 3
      // 1ce: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d3: astore 10
      // 1d5: aload 10
      // 1d7: areturn
   }

   public aa(long var1) {
      var1 = ab ^ var1;
      super();
      x44.a<"s">(this, false, 8275260346465948484L, var1);
      x44.a<"s">(this, false, 8392563891501657549L, var1);
      x44.a<"s">(this, false, 7828561925665939436L, var1);
   }

   public abstract void J(Object[] var1);

   public abstract boolean I(Object[] var1);

   String p(Object[] param1) {
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
      // 04: checkcast [Ljava/lang/String;
      // 07: astore 4
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast java/lang/Long
      // 0f: invokevirtual java/lang/Long.longValue ()J
      // 12: lstore 2
      // 13: pop
      // 14: getstatic com/zelix/aa.ab J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w 3189494651392789422
      // 1d: lload 2
      // 1e: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: new java/lang/StringBuilder
      // 26: dup
      // 27: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a: astore 6
      // 2c: bipush 0
      // 2d: istore 7
      // 2f: istore 5
      // 31: iload 7
      // 33: aload 4
      // 35: arraylength
      // 36: if_icmpge a6
      // 39: lload 2
      // 3a: lconst_0
      // 3b: lcmp
      // 3c: ifle 4f
      // 3f: aload 6
      // 41: aload 4
      // 43: iload 7
      // 45: aaload
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49: iload 5
      // 4b: ifne ae
      // 4e: pop
      // 4f: iload 5
      // 51: lload 2
      // 52: lconst_0
      // 53: lcmp
      // 54: iflt a3
      // 57: ifne a1
      // 5a: goto 67
      // 5d: ldc2_w 3230636732596850839
      // 60: lload 2
      // 61: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: iload 7
      // 69: aload 4
      // 6b: arraylength
      // 6c: bipush 1
      // 6d: isub
      // 6e: if_icmpge 9e
      // 71: goto 7e
      // 74: ldc2_w 3230636732596850839
      // 77: lload 2
      // 78: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: aload 6
      // 80: sipush 4008
      // 83: ldc2_w 950227203824337692
      // 86: lload 2
      // 87: lxor
      // 88: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 90: pop
      // 91: goto 9e
      // 94: ldc2_w 3230636732596850839
      // 97: lload 2
      // 98: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: iinc 7 1
      // a1: iload 5
      // a3: ifeq 31
      // a6: lload 2
      // a7: lconst_0
      // a8: lcmp
      // a9: ifle 39
      // ac: aload 6
      // ae: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b1: areturn
   }

   public abstract void G(Object[] var1);

   public abstract void m(Object[] var1);

   static String F(Object[] var0) {
      String var1;
      Map var2;
      long var5;
      long var7;
      int var9;
      String var10;
      String var11;
      long var15;
      label32: {
         var1 = (String)var0[0];
         long var3 = (Long)var0[1];
         var2 = (Map)var0[2];
         var15 = ab ^ var3;
         var5 = var15 ^ 18514483143628L;
         var7 = var15 ^ 96232703287439L;
         int var10000 = x44.a<"w">(275571666498767788L, var15);
         int var12 = var1.indexOf(c<"c">(4302, 7691926700215326728L ^ var15));
         var9 = var10000;
         if (var12 > -1) {
            var10 = var1.substring(0, var12);
            var11 = var1.substring(var12);
            if (var15 < 0L || var9 != 0) {
               break label32;
            }
         }

         var10 = var1;
         var11 = "";
      }

      label36: {
         try {
            if (var9 == 0) {
               return var10;
            }

            if (!x44.a<"w">(new Object[]{var10, var5}, 503135439118834094L, var15)) {
               break label36;
            }
         } catch (gj var14) {
            throw x44.a<"w">(var14, 210758440446901934L, var15);
         }

         return var1;
      }

      String var13 = (String)sh.a(var10, var2, var7);
      return var13 + var11;
   }

   void b(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      x44.a<"w">(this, true, -4140892646418811456L, var2);
   }

   public abstract void K(Object[] var1);

   public Integer D(short var1, char var2, int var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ ab;
      long var7 = var5 ^ 135343816892917L;
      return o.R(var3, var7);
   }

   public abstract void f(Object[] var1);

   public abstract void c(Object[] var1);

   public void H(Object[] var1) {
      long var2 = (Long)var1[0];
      boolean var4 = (Boolean)var1[1];
      var2 = ab ^ var2;
      x44.a<"v">(this, var4, -5044800336313049016L, var2);
   }

   abstract void Q(Object[] var1);

   abstract void s(Object[] var1);

   private static long I(Object[] var0) {
      long var4 = (Long)var0[0];
      String var1 = (String)var0[1];
      String var2 = (String)var0[2];
      boolean var3 = (Boolean)var0[3];
      var4 = ab ^ var4;
      long var6 = var4 ^ 44386341225529L;
      long var8 = var4 ^ 73569624693881L;
      long var10 = x44.a<"t">(new Object[]{var1, a<"i">(21086, 1905013889610623021L ^ var4), var6}, -8964460496502695492L, var4);
      if (var3) {
         var10 *= e<"b">(2114, 5349082559579960824L ^ var4);
      }

      Object[] var10004 = new Object[]{null, var2, var8};
      var10004[0] = var10;
      return x44.a<"t">(var10004, -7351020648826157740L, var4);
   }

   private static _a[] p(Object[] var0) {
      long var2 = (Long)var0[0];
      String var4 = (String)var0[1];
      List var1 = (List)var0[2];
      var2 = ab ^ var2;
      long var5 = (var2 ^ 129655418977798L) >>> 32;
      int var7 = (int)((var2 ^ 129655418977798L) << 32 >>> 32);
      int var10000 = x44.a<"w">(-4908233212108596209L, var2);
      _a[] var9 = new _a[var1.size()];
      int var8 = var10000;
      Object[] var10004 = new Object[]{null, var4, var7};
      var10004[0] = var5;
      List var10 = x44.a<"w">(var10004, -5180178987961434182L, var2);
      int var11 = 0;

      label34:
      while (var11 < var1.size()) {
         int var12 = (Integer)var1.get(var11);
         String var13 = (String)var10.get(var12);

         do {
            try {
               int var10001 = var8;
               if (var2 > 0L) {
                  if (var8 != 0) {
                     return var9;
                  }

                  var10001 = var11;
               }

               var9[var10001] = new _a(var12, ((String)var10.get(var12)).charAt(0));
               var11++;
               if (var8 == 0) {
                  continue label34;
               }
            } catch (gj var14) {
               throw x44.a<"w">(var14, -4939136630314563786L, var2);
            }
         } while (var2 <= 0L);
         break;
      }

      return var9;
   }

   public boolean X(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return x44.a<"n">(this, -4065183655834081786L, var2);
   }

   public abstract void y(Object[] var1);

   public static String k(Object[] var0) {
      long var1 = (Long)var0[0];
      var1 = ab ^ var1;
      return x44.a<"m">(-7231600557311781246L, var1);
   }

   public static String Q(Object[] var0) {
      String var10 = (String)var0[0];
      String var5 = (String)var0[1];
      String var7 = (String)var0[2];
      String var6 = (String)var0[3];
      String var8 = (String)var0[4];
      long var2 = (Long)var0[5];
      boolean var4 = (Boolean)var0[6];
      String var1 = (String)var0[7];
      Integer var9 = (Integer)var0[8];
      Random var11 = (Random)var0[9];
      var2 = ab ^ var2;
      long var12 = var2 ^ 21923817626972L;
      long var14 = var2 ^ 81857485582044L;
      long var16 = var2 ^ 110154805051597L;
      StringBuilder var18 = new StringBuilder();
      var18.append(x44.a<"t">(new Object[]{var10, var12, var9}, -1573250673191050008L, var2));
      var18.append(x44.a<"t">(new Object[]{var14, var5, var1}, -718478016940920707L, var2));
      Object[] var10009 = new Object[]{null, null, var6, var8, var4, var1, var11};
      var10009[1] = var16;
      var10009[0] = var7;
      var18.append(x44.a<"t">(var10009, -744238922940457595L, var2));
      return var18.toString();
   }

   public abstract void D(Object[] var1);

   static int H(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: pop
      // 013: getstatic com/zelix/aa.ab J
      // 016: lload 2
      // 017: lxor
      // 018: lstore 2
      // 019: ldc2_w 5043834298666847616
      // 01c: lload 2
      // 01d: invokedynamic s (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 022: aload 1
      // 023: bipush 0
      // 024: invokevirtual java/lang/String.charAt (I)C
      // 027: istore 5
      // 029: istore 4
      // 02b: iload 5
      // 02d: sipush 28285
      // 030: ldc2_w 941785707168718979
      // 033: lload 2
      // 034: lxor
      // 035: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03a: iload 4
      // 03c: ifeq 07d
      // 03f: if_icmplt 082
      // 042: goto 04f
      // 045: ldc2_w 4954111069819435138
      // 048: lload 2
      // 049: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: iload 5
      // 051: iload 4
      // 053: ifeq 081
      // 056: goto 063
      // 059: ldc2_w 4954111069819435138
      // 05c: lload 2
      // 05d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: athrow
      // 063: sipush 21208
      // 066: ldc2_w 3166853422944377900
      // 069: lload 2
      // 06a: lxor
      // 06b: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: goto 07d
      // 073: ldc2_w 4954111069819435138
      // 076: lload 2
      // 077: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: athrow
      // 07d: if_icmpgt 082
      // 080: bipush 1
      // 081: ireturn
      // 082: aload 1
      // 083: invokevirtual java/lang/String.toCharArray ()[C
      // 086: astore 6
      // 088: aload 6
      // 08a: arraylength
      // 08b: istore 7
      // 08d: bipush 0
      // 08e: istore 8
      // 090: iload 8
      // 092: aload 6
      // 094: arraylength
      // 095: if_icmpge 144
      // 098: aload 1
      // 099: iload 8
      // 09b: invokevirtual java/lang/String.charAt (I)C
      // 09e: istore 9
      // 0a0: iload 4
      // 0a2: lload 2
      // 0a3: lconst_0
      // 0a4: lcmp
      // 0a5: iflt 141
      // 0a8: ifeq 13f
      // 0ab: iload 9
      // 0ad: iload 4
      // 0af: ifeq 146
      // 0b2: goto 0bf
      // 0b5: ldc2_w 4954111069819435138
      // 0b8: lload 2
      // 0b9: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: sipush 28285
      // 0c2: ldc2_w 941785707168718979
      // 0c5: lload 2
      // 0c6: lxor
      // 0c7: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: if_icmplt 12f
      // 0cf: goto 0dc
      // 0d2: ldc2_w 4954111069819435138
      // 0d5: lload 2
      // 0d6: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: athrow
      // 0dc: iload 9
      // 0de: lload 2
      // 0df: lconst_0
      // 0e0: lcmp
      // 0e1: iflt 12c
      // 0e4: iload 4
      // 0e6: ifeq 122
      // 0e9: goto 0f6
      // 0ec: ldc2_w 4954111069819435138
      // 0ef: lload 2
      // 0f0: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: athrow
      // 0f6: sipush 6538
      // 0f9: ldc2_w 2632909812333188975
      // 0fc: lload 2
      // 0fd: lxor
      // 0fe: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: if_icmpgt 12f
      // 106: goto 113
      // 109: ldc2_w 4954111069819435138
      // 10c: lload 2
      // 10d: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: iload 8
      // 115: goto 122
      // 118: ldc2_w 4954111069819435138
      // 11b: lload 2
      // 11c: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: istore 7
      // 124: lload 2
      // 125: lconst_0
      // 126: lcmp
      // 127: iflt 132
      // 12a: iload 4
      // 12c: ifne 144
      // 12f: iinc 8 1
      // 132: goto 13f
      // 135: ldc2_w 4954111069819435138
      // 138: lload 2
      // 139: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: athrow
      // 13f: iload 4
      // 141: ifne 090
      // 144: iload 7
      // 146: ireturn
   }

   public abstract void n(Object[] var1);

   public static String x(Object[] param0) {
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
      // 00a: istore 4
      // 00c: dup
      // 00d: bipush 1
      // 00e: aaload
      // 00f: checkcast java/lang/Integer
      // 012: invokevirtual java/lang/Integer.intValue ()I
      // 015: istore 6
      // 017: dup
      // 018: bipush 2
      // 019: aaload
      // 01a: checkcast java/lang/String
      // 01d: astore 2
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Long
      // 024: invokevirtual java/lang/Long.longValue ()J
      // 027: lstore 7
      // 029: dup
      // 02a: bipush 4
      // 02b: aaload
      // 02c: checkcast java/lang/Boolean
      // 02f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 032: istore 1
      // 033: dup
      // 034: bipush 5
      // 035: aaload
      // 036: checkcast java/lang/Boolean
      // 039: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03c: istore 3
      // 03d: dup
      // 03e: bipush 6
      // 040: aaload
      // 041: checkcast java/util/Random
      // 044: astore 5
      // 046: pop
      // 047: getstatic com/zelix/aa.ab J
      // 04a: lload 7
      // 04c: lxor
      // 04d: lstore 7
      // 04f: lload 7
      // 051: dup2
      // 052: ldc2_w 20663359268685
      // 055: lxor
      // 056: lstore 9
      // 058: pop2
      // 059: ldc2_w 1591278295299219050
      // 05c: lload 7
      // 05e: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: new java/lang/StringBuilder
      // 066: dup
      // 067: invokespecial java/lang/StringBuilder.<init> ()V
      // 06a: iload 4
      // 06c: ldc2_w 1717754408377595202
      // 06f: lload 7
      // 071: invokedynamic q (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 079: iload 6
      // 07b: ldc2_w 1717754408377595202
      // 07e: lload 7
      // 080: invokedynamic q (IJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 085: sipush 12304
      // 088: ldc2_w 8832152393884331283
      // 08b: lload 7
      // 08d: lxor
      // 08e: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: bipush 4
      // 094: lload 9
      // 096: sipush 5877
      // 099: ldc2_w 8983494994481433577
      // 09c: lload 7
      // 09e: lxor
      // 09f: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: bipush 5
      // 0a5: anewarray 606
      // 0a8: dup_x1
      // 0a9: swap
      // 0aa: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ad: bipush 4
      // 0ae: swap
      // 0af: aastore
      // 0b0: dup_x2
      // 0b1: dup_x2
      // 0b2: pop
      // 0b3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b6: bipush 3
      // 0b7: swap
      // 0b8: aastore
      // 0b9: dup_x1
      // 0ba: swap
      // 0bb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0be: bipush 2
      // 0bf: swap
      // 0c0: aastore
      // 0c1: dup_x1
      // 0c2: swap
      // 0c3: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c6: bipush 1
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: bipush 0
      // 0cc: swap
      // 0cd: aastore
      // 0ce: ldc2_w 1632333551159612259
      // 0d1: lload 7
      // 0d3: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0de: astore 12
      // 0e0: istore 11
      // 0e2: bipush 0
      // 0e3: istore 13
      // 0e5: bipush 0
      // 0e6: istore 14
      // 0e8: iload 14
      // 0ea: aload 2
      // 0eb: invokevirtual java/lang/String.length ()I
      // 0ee: if_icmpge 104
      // 0f1: iload 13
      // 0f3: aload 2
      // 0f4: iload 14
      // 0f6: invokevirtual java/lang/String.charAt (I)C
      // 0f9: iadd
      // 0fa: istore 13
      // 0fc: iinc 14 1
      // 0ff: iload 11
      // 101: ifne 0e8
      // 104: lload 7
      // 106: lconst_0
      // 107: lcmp
      // 108: iflt 0ff
      // 10b: aload 12
      // 10d: ldc2_w 1133763597573841030
      // 110: lload 7
      // 112: invokedynamic q (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: ldc2_w 1353432244268116228
      // 11a: lload 7
      // 11c: invokedynamic q (JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: astore 14
      // 123: aload 14
      // 125: ldc2_w 1133763597573841030
      // 128: lload 7
      // 12a: invokedynamic q (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: iload 13
      // 131: i2l
      // 132: ladd
      // 133: lstore 15
      // 135: new java/lang/StringBuilder
      // 138: dup
      // 139: invokespecial java/lang/StringBuilder.<init> ()V
      // 13c: astore 17
      // 13e: lload 15
      // 140: ldc2_w 1109160828198575295
      // 143: lload 7
      // 145: invokedynamic q (JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: astore 18
      // 14c: aload 17
      // 14e: aload 18
      // 150: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 153: pop
      // 154: iload 1
      // 155: iload 11
      // 157: lload 7
      // 159: lconst_0
      // 15a: lcmp
      // 15b: iflt 1b6
      // 15e: ifeq 1b4
      // 161: ifeq 1b3
      // 164: goto 172
      // 167: ldc2_w 1669320861293456232
      // 16a: lload 7
      // 16c: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: athrow
      // 172: aload 5
      // 174: sipush 15642
      // 177: ldc2_w 3163297908066181132
      // 17a: lload 7
      // 17c: lxor
      // 17d: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 182: invokevirtual java/util/Random.nextInt (I)I
      // 185: sipush 23743
      // 188: ldc2_w 4978288505846268344
      // 18b: lload 7
      // 18d: lxor
      // 18e: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 193: iadd
      // 194: i2c
      // 195: istore 19
      // 197: aload 17
      // 199: sipush 20330
      // 19c: ldc2_w 4492633603735425639
      // 19f: lload 7
      // 1a1: lxor
      // 1a2: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a7: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1aa: pop
      // 1ab: aload 17
      // 1ad: iload 19
      // 1af: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1b2: pop
      // 1b3: iload 3
      // 1b4: iload 11
      // 1b6: ifeq 1fb
      // 1b9: ifeq 232
      // 1bc: goto 1ca
      // 1bf: ldc2_w 1669320861293456232
      // 1c2: lload 7
      // 1c4: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c9: athrow
      // 1ca: aload 5
      // 1cc: sipush 22536
      // 1cf: ldc2_w 4491892642115454233
      // 1d2: lload 7
      // 1d4: lxor
      // 1d5: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1da: invokevirtual java/util/Random.nextInt (I)I
      // 1dd: sipush 18838
      // 1e0: ldc2_w 5258932093136737436
      // 1e3: lload 7
      // 1e5: lxor
      // 1e6: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: iadd
      // 1ec: i2c
      // 1ed: goto 1fb
      // 1f0: ldc2_w 1669320861293456232
      // 1f3: lload 7
      // 1f5: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fa: athrow
      // 1fb: istore 19
      // 1fd: lload 7
      // 1ff: lconst_0
      // 200: lcmp
      // 201: iflt 21c
      // 204: iload 1
      // 205: ifne 22a
      // 208: aload 17
      // 20a: sipush 17200
      // 20d: ldc2_w 5526994736065945150
      // 210: lload 7
      // 212: lxor
      // 213: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 218: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 21b: pop
      // 21c: goto 22a
      // 21f: ldc2_w 1669320861293456232
      // 222: lload 7
      // 224: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 229: athrow
      // 22a: aload 17
      // 22c: iload 19
      // 22e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 231: pop
      // 232: aload 17
      // 234: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 237: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Irreducible bytecode was duplicated to produce valid code
   static String O(Object[] var0) {
      long var2 = (Long)var0[0];
      _3 var6 = (_3)var0[1];
      Long var5 = (Long)var0[2];
      _fz var1 = (_fz)var0[3];
      String var4 = (String)var0[4];
      var2 = ab ^ var2;
      long var7 = var2 ^ 22189834075508L;
      long var9 = var2 ^ 124554790692676L;
      long var11 = var2 ^ 101384222642509L;
      long var13 = var2 ^ 110727644019754L;
      int var15 = x44.a<"q">(-2180857100502219183L, var2);

      int[] var16;
      label94: {
         _3 var10000;
         label105: {
            label98: {
               try {
                  var10000 = var6;
                  if (var15 != 0) {
                     break label105;
                  }

                  if (var6 != null) {
                     break label98;
                  }
               } catch (gj var30) {
                  throw x44.a<"q">(var30, -2221734197257020056L, var2);
               }

               var16 = x44.a<"h">(-123370720704918646L, var2);

               try {
                  if (var15 == 0) {
                     break label94;
                  }
               } catch (gj var29) {
                  boolean var10001 = false;
                  throw x44.a<"q">(var29, -2221734197257020056L, var2);
               }
            }

            try {
               var10000 = var6;
            } catch (gj var28) {
               boolean var38 = false;
               throw x44.a<"q">(var28, -2221734197257020056L, var2);
            }
         }

         var16 = x44.a<"i">(var10000, new Object[]{var7}, -436113906569152108L, var2);
      }

      long var34 = var5;
      Object[] var10004 = new Object[]{null, var4, var9};
      var10004[0] = var34;
      long var17 = x44.a<"q">(var10004, -2105751633744707991L, var2);
      var10004 = new Object[]{null, x44.a<"h">(-1964436652362525348L, var2), var13};
      var10004[0] = var17;
      String var19 = x44.a<"q">(var10004, -570935124284414848L, var2);
      int var39 = c<"c">(10323, 4462777678392787803L ^ var2);
      int var10002 = c<"c">(29365, 4361030712985147813L ^ var2);
      Object[] var10006 = new Object[]{null, null, null, null, Integer.valueOf(x44.a<"h">(-1964436652362525348L, var2)[0])};
      var10006[3] = var11;
      var10006[2] = var10002;
      var10006[1] = var39;
      var10006[0] = var19;
      String var20 = x44.a<"q">(var10006, -2258704432815282845L, var2);
      long var21 = 0L;
      int var23 = 0;

      while (true) {
         if (var23 < 3) {
            label100: {
               label101: {
                  var35 = var23;
                  if (var2 >= 0L) {
                     if (var23 >= var16.length) {
                        break label101;
                     }

                     var21 |= (long)var16[var23];
                     var35 = var15;
                  }

                  if (var2 <= 0L) {
                     break label100;
                  }

                  if (var35 == 0) {
                     var35 = var23;
                     break label100;
                  }
               }

               var21 |= e<"b">(17927, 1498321172933247105L ^ var2);
               var35 = var23;
            }

            if (var2 > 0L) {
               if (var35 < 2) {
                  var21 <<= c<"c">(5614, 1012818749814783722L ^ var2);
               }

               var23++;
               var35 = var15;
            }

            if (var35 == 0) {
               continue;
            }
         }

         do {
            var10004 = new Object[]{null, var4, var9};
            var10004[0] = var21;
            var34 = x44.a<"q">(var10004, -2105751633744707991L, var2);
            if (var2 >= 0L) {
               long var32 = var34;
               var10004 = new Object[]{null, x44.a<"h">(-1964436652362525348L, var2), var13};
               var10004[0] = var32;
               String var25 = x44.a<"q">(var10004, -570935124284414848L, var2);
               var39 = c<"c">(10323, 4462777678392787803L ^ var2);
               var10002 = c<"c">(5552, 8513430294784949937L ^ var2);
               var10006 = new Object[]{null, null, null, null, Integer.valueOf(x44.a<"h">(-1964436652362525348L, var2)[0])};
               var10006[3] = var11;
               var10006[2] = var10002;
               var10006[1] = var39;
               var10006[0] = var25;
               String var26 = x44.a<"q">(var10006, -2258704432815282845L, var2);
               return var20 + var26;
            }

            var21 = var34;
            var37 = var23;
            if (var2 > 0L) {
               if (var23 < 2) {
                  var21 <<= c<"c">(5614, 1012818749814783722L ^ var2);
               }

               var23++;
               var37 = var15;
            }
         } while (var37 == 0);
      }
   }

   public abstract void P(Object[] var1);

   public abstract void u(Object[] var1);

   public String z(Object[] param1) {
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
      // 00e: checkcast java/lang/String
      // 011: astore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/util/Map
      // 018: astore 5
      // 01a: pop
      // 01b: getstatic com/zelix/aa.ab J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 93230694375317
      // 026: lxor
      // 027: lstore 6
      // 029: pop2
      // 02a: ldc2_w 8858089195451003537
      // 02d: lload 3
      // 02e: invokedynamic r (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: istore 8
      // 035: aload 2
      // 036: iload 8
      // 038: ifeq 080
      // 03b: ifnull 071
      // 03e: goto 04b
      // 041: ldc2_w 8922057918070114195
      // 044: lload 3
      // 045: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: athrow
      // 04b: aload 2
      // 04c: iload 8
      // 04e: ifeq 080
      // 051: goto 05e
      // 054: ldc2_w 8922057918070114195
      // 057: lload 3
      // 058: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: athrow
      // 05e: invokevirtual java/lang/String.length ()I
      // 061: ifne 081
      // 064: goto 071
      // 067: ldc2_w 8922057918070114195
      // 06a: lload 3
      // 06b: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 070: athrow
      // 071: ldc ""
      // 073: goto 080
      // 076: ldc2_w 8922057918070114195
      // 079: lload 3
      // 07a: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: athrow
      // 080: areturn
      // 081: new java/lang/StringBuilder
      // 084: dup
      // 085: invokespecial java/lang/StringBuilder.<init> ()V
      // 088: astore 9
      // 08a: new java/util/StringTokenizer
      // 08d: dup
      // 08e: aload 2
      // 08f: ldc ","
      // 091: invokespecial java/util/StringTokenizer.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 094: astore 10
      // 096: aload 10
      // 098: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 09b: ifeq 131
      // 09e: aload 10
      // 0a0: invokevirtual java/util/StringTokenizer.nextToken ()Ljava/lang/String;
      // 0a3: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0a6: lload 3
      // 0a7: lconst_0
      // 0a8: lcmp
      // 0a9: ifle 136
      // 0ac: astore 11
      // 0ae: aload 9
      // 0b0: aload 11
      // 0b2: lload 6
      // 0b4: aload 5
      // 0b6: bipush 3
      // 0b7: anewarray 606
      // 0ba: dup_x1
      // 0bb: swap
      // 0bc: bipush 2
      // 0bd: swap
      // 0be: aastore
      // 0bf: dup_x2
      // 0c0: dup_x2
      // 0c1: pop
      // 0c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c5: bipush 1
      // 0c6: swap
      // 0c7: aastore
      // 0c8: dup_x1
      // 0c9: swap
      // 0ca: bipush 0
      // 0cb: swap
      // 0cc: aastore
      // 0cd: ldc2_w 7059938463715871126
      // 0d0: lload 3
      // 0d1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d9: iload 8
      // 0db: ifeq 133
      // 0de: iload 8
      // 0e0: ifeq 12b
      // 0e3: goto 0f0
      // 0e6: ldc2_w 8922057918070114195
      // 0e9: lload 3
      // 0ea: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ef: athrow
      // 0f0: pop
      // 0f1: aload 10
      // 0f3: invokevirtual java/util/StringTokenizer.hasMoreTokens ()Z
      // 0f6: lload 3
      // 0f7: lconst_0
      // 0f8: lcmp
      // 0f9: ifle 12e
      // 0fc: ifeq 12c
      // 0ff: goto 10c
      // 102: ldc2_w 8922057918070114195
      // 105: lload 3
      // 106: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: aload 9
      // 10e: sipush 25032
      // 111: ldc2_w 6339386393450936958
      // 114: lload 3
      // 115: lxor
      // 116: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11e: goto 12b
      // 121: ldc2_w 8922057918070114195
      // 124: lload 3
      // 125: invokedynamic r (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: pop
      // 12c: iload 8
      // 12e: ifne 096
      // 131: aload 9
      // 133: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 136: areturn
   }

   void C(Object[] var1) {
      boolean var4 = (Boolean)var1[0];
      long var2 = (Long)var1[1];
      var2 = ab ^ var2;
      x44.a<"p">(this, var4, -91045023592276177L, var2);
   }

   public static void z(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/_rq
      // 00e: astore 7
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 8
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/_rq
      // 021: astore 6
      // 023: dup
      // 024: bipush 4
      // 025: aaload
      // 026: checkcast com/zelix/_rq
      // 029: astore 2
      // 02a: dup
      // 02b: bipush 5
      // 02c: aaload
      // 02d: checkcast com/zelix/_rq
      // 030: astore 3
      // 031: dup
      // 032: bipush 6
      // 034: aaload
      // 035: checkcast com/zelix/_rq
      // 038: astore 5
      // 03a: dup
      // 03b: bipush 7
      // 03d: aaload
      // 03e: checkcast java/lang/String
      // 041: astore 4
      // 043: pop
      // 044: getstatic com/zelix/aa.ab J
      // 047: lload 8
      // 049: lxor
      // 04a: lstore 8
      // 04c: lload 8
      // 04e: dup2
      // 04f: ldc2_w 107291170131967
      // 052: lxor
      // 053: lstore 10
      // 055: dup2
      // 056: ldc2_w 21618201709354
      // 059: lxor
      // 05a: lstore 12
      // 05c: pop2
      // 05d: ldc2_w -5259297199041343250
      // 060: lload 8
      // 062: invokedynamic v (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: bipush 0
      // 068: istore 15
      // 06a: istore 14
      // 06c: iload 15
      // 06e: sipush 6050
      // 071: ldc2_w 6089511420523014670
      // 074: lload 8
      // 076: lxor
      // 077: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07c: iadd
      // 07d: bipush 1
      // 07e: iadd
      // 07f: istore 16
      // 081: aload 1
      // 082: iload 15
      // 084: iload 16
      // 086: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 089: astore 17
      // 08b: aload 17
      // 08d: bipush 0
      // 08e: invokevirtual java/lang/String.charAt (I)C
      // 091: iload 14
      // 093: ifne 0c0
      // 096: ldc2_w -6123908667366628156
      // 099: lload 8
      // 09b: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: if_icmpne 0c3
      // 0a3: goto 0b1
      // 0a6: ldc2_w -5218014391069701161
      // 0a9: lload 8
      // 0ab: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: bipush 1
      // 0b2: goto 0c0
      // 0b5: ldc2_w -5218014391069701161
      // 0b8: lload 8
      // 0ba: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: goto 0c4
      // 0c3: bipush 0
      // 0c4: istore 18
      // 0c6: aload 7
      // 0c8: aload 17
      // 0ca: bipush 1
      // 0cb: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0ce: lload 12
      // 0d0: dup2_x1
      // 0d1: pop2
      // 0d2: aload 4
      // 0d4: iload 18
      // 0d6: bipush 4
      // 0d7: anewarray 606
      // 0da: dup_x1
      // 0db: swap
      // 0dc: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0df: bipush 3
      // 0e0: swap
      // 0e1: aastore
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: bipush 2
      // 0e5: swap
      // 0e6: aastore
      // 0e7: dup_x1
      // 0e8: swap
      // 0e9: bipush 1
      // 0ea: swap
      // 0eb: aastore
      // 0ec: dup_x2
      // 0ed: dup_x2
      // 0ee: pop
      // 0ef: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f2: bipush 0
      // 0f3: swap
      // 0f4: aastore
      // 0f5: ldc2_w -5965831447486987084
      // 0f8: lload 8
      // 0fa: invokedynamic v (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: lload 10
      // 101: bipush 2
      // 102: anewarray 606
      // 105: dup_x2
      // 106: dup_x2
      // 107: pop
      // 108: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10b: bipush 1
      // 10c: swap
      // 10d: aastore
      // 10e: dup_x2
      // 10f: dup_x2
      // 110: pop
      // 111: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 114: bipush 0
      // 115: swap
      // 116: aastore
      // 117: ldc2_w -5645360817519142185
      // 11a: lload 8
      // 11c: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: iload 16
      // 123: istore 15
      // 125: iload 15
      // 127: sipush 6050
      // 12a: ldc2_w 6089511420523014670
      // 12d: lload 8
      // 12f: lxor
      // 130: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: iadd
      // 136: bipush 1
      // 137: iadd
      // 138: istore 16
      // 13a: aload 1
      // 13b: iload 15
      // 13d: iload 16
      // 13f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 142: astore 17
      // 144: aload 17
      // 146: bipush 0
      // 147: invokevirtual java/lang/String.charAt (I)C
      // 14a: iload 14
      // 14c: lload 8
      // 14e: lconst_0
      // 14f: lcmp
      // 150: iflt 160
      // 153: ifne 180
      // 156: ldc2_w -6123908667366628156
      // 159: lload 8
      // 15b: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: if_icmpne 183
      // 163: goto 171
      // 166: ldc2_w -5218014391069701161
      // 169: lload 8
      // 16b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: bipush 1
      // 172: goto 180
      // 175: ldc2_w -5218014391069701161
      // 178: lload 8
      // 17a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: athrow
      // 180: goto 184
      // 183: bipush 0
      // 184: istore 18
      // 186: aload 6
      // 188: aload 17
      // 18a: bipush 1
      // 18b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 18e: lload 12
      // 190: dup2_x1
      // 191: pop2
      // 192: aload 4
      // 194: iload 18
      // 196: bipush 4
      // 197: anewarray 606
      // 19a: dup_x1
      // 19b: swap
      // 19c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 19f: bipush 3
      // 1a0: swap
      // 1a1: aastore
      // 1a2: dup_x1
      // 1a3: swap
      // 1a4: bipush 2
      // 1a5: swap
      // 1a6: aastore
      // 1a7: dup_x1
      // 1a8: swap
      // 1a9: bipush 1
      // 1aa: swap
      // 1ab: aastore
      // 1ac: dup_x2
      // 1ad: dup_x2
      // 1ae: pop
      // 1af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b2: bipush 0
      // 1b3: swap
      // 1b4: aastore
      // 1b5: ldc2_w -5965831447486987084
      // 1b8: lload 8
      // 1ba: invokedynamic v (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bf: lload 10
      // 1c1: bipush 2
      // 1c2: anewarray 606
      // 1c5: dup_x2
      // 1c6: dup_x2
      // 1c7: pop
      // 1c8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1cb: bipush 1
      // 1cc: swap
      // 1cd: aastore
      // 1ce: dup_x2
      // 1cf: dup_x2
      // 1d0: pop
      // 1d1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d4: bipush 0
      // 1d5: swap
      // 1d6: aastore
      // 1d7: ldc2_w -5645360817519142185
      // 1da: lload 8
      // 1dc: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: iload 16
      // 1e3: istore 15
      // 1e5: iload 15
      // 1e7: sipush 6050
      // 1ea: ldc2_w 6089511420523014670
      // 1ed: lload 8
      // 1ef: lxor
      // 1f0: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: iadd
      // 1f6: bipush 1
      // 1f7: iadd
      // 1f8: istore 16
      // 1fa: aload 1
      // 1fb: iload 15
      // 1fd: iload 16
      // 1ff: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 202: astore 17
      // 204: aload 17
      // 206: bipush 0
      // 207: invokevirtual java/lang/String.charAt (I)C
      // 20a: iload 14
      // 20c: lload 8
      // 20e: lconst_0
      // 20f: lcmp
      // 210: ifle 220
      // 213: ifne 240
      // 216: ldc2_w -6123908667366628156
      // 219: lload 8
      // 21b: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: if_icmpne 243
      // 223: goto 231
      // 226: ldc2_w -5218014391069701161
      // 229: lload 8
      // 22b: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 230: athrow
      // 231: bipush 1
      // 232: goto 240
      // 235: ldc2_w -5218014391069701161
      // 238: lload 8
      // 23a: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: goto 244
      // 243: bipush 0
      // 244: istore 18
      // 246: aload 2
      // 247: aload 17
      // 249: bipush 1
      // 24a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 24d: lload 12
      // 24f: dup2_x1
      // 250: pop2
      // 251: aload 4
      // 253: iload 18
      // 255: bipush 4
      // 256: anewarray 606
      // 259: dup_x1
      // 25a: swap
      // 25b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 25e: bipush 3
      // 25f: swap
      // 260: aastore
      // 261: dup_x1
      // 262: swap
      // 263: bipush 2
      // 264: swap
      // 265: aastore
      // 266: dup_x1
      // 267: swap
      // 268: bipush 1
      // 269: swap
      // 26a: aastore
      // 26b: dup_x2
      // 26c: dup_x2
      // 26d: pop
      // 26e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 271: bipush 0
      // 272: swap
      // 273: aastore
      // 274: ldc2_w -5965831447486987084
      // 277: lload 8
      // 279: invokedynamic v (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: lload 10
      // 280: bipush 2
      // 281: anewarray 606
      // 284: dup_x2
      // 285: dup_x2
      // 286: pop
      // 287: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28a: bipush 1
      // 28b: swap
      // 28c: aastore
      // 28d: dup_x2
      // 28e: dup_x2
      // 28f: pop
      // 290: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 293: bipush 0
      // 294: swap
      // 295: aastore
      // 296: ldc2_w -5645360817519142185
      // 299: lload 8
      // 29b: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a0: iload 16
      // 2a2: istore 15
      // 2a4: iload 15
      // 2a6: sipush 6050
      // 2a9: ldc2_w 6089511420523014670
      // 2ac: lload 8
      // 2ae: lxor
      // 2af: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b4: iadd
      // 2b5: bipush 1
      // 2b6: iadd
      // 2b7: istore 16
      // 2b9: aload 1
      // 2ba: iload 15
      // 2bc: iload 16
      // 2be: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 2c1: astore 17
      // 2c3: aload 17
      // 2c5: bipush 0
      // 2c6: invokevirtual java/lang/String.charAt (I)C
      // 2c9: iload 14
      // 2cb: lload 8
      // 2cd: lconst_0
      // 2ce: lcmp
      // 2cf: ifle 2df
      // 2d2: ifne 2ff
      // 2d5: ldc2_w -6123908667366628156
      // 2d8: lload 8
      // 2da: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2df: if_icmpne 302
      // 2e2: goto 2f0
      // 2e5: ldc2_w -5218014391069701161
      // 2e8: lload 8
      // 2ea: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ef: athrow
      // 2f0: bipush 1
      // 2f1: goto 2ff
      // 2f4: ldc2_w -5218014391069701161
      // 2f7: lload 8
      // 2f9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fe: athrow
      // 2ff: goto 303
      // 302: bipush 0
      // 303: istore 18
      // 305: aload 3
      // 306: aload 17
      // 308: bipush 1
      // 309: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 30c: lload 12
      // 30e: dup2_x1
      // 30f: pop2
      // 310: aload 4
      // 312: iload 18
      // 314: bipush 4
      // 315: anewarray 606
      // 318: dup_x1
      // 319: swap
      // 31a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 31d: bipush 3
      // 31e: swap
      // 31f: aastore
      // 320: dup_x1
      // 321: swap
      // 322: bipush 2
      // 323: swap
      // 324: aastore
      // 325: dup_x1
      // 326: swap
      // 327: bipush 1
      // 328: swap
      // 329: aastore
      // 32a: dup_x2
      // 32b: dup_x2
      // 32c: pop
      // 32d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 330: bipush 0
      // 331: swap
      // 332: aastore
      // 333: ldc2_w -5965831447486987084
      // 336: lload 8
      // 338: invokedynamic v (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33d: lload 10
      // 33f: bipush 2
      // 340: anewarray 606
      // 343: dup_x2
      // 344: dup_x2
      // 345: pop
      // 346: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 349: bipush 1
      // 34a: swap
      // 34b: aastore
      // 34c: dup_x2
      // 34d: dup_x2
      // 34e: pop
      // 34f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 352: bipush 0
      // 353: swap
      // 354: aastore
      // 355: ldc2_w -5645360817519142185
      // 358: lload 8
      // 35a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35f: iload 16
      // 361: istore 15
      // 363: iload 15
      // 365: sipush 6050
      // 368: ldc2_w 6089511420523014670
      // 36b: lload 8
      // 36d: lxor
      // 36e: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 373: iadd
      // 374: bipush 1
      // 375: iadd
      // 376: istore 16
      // 378: aload 1
      // 379: iload 15
      // 37b: iload 16
      // 37d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 380: astore 17
      // 382: aload 17
      // 384: bipush 0
      // 385: invokevirtual java/lang/String.charAt (I)C
      // 388: iload 14
      // 38a: lload 8
      // 38c: lconst_0
      // 38d: lcmp
      // 38e: iflt 39e
      // 391: ifne 3be
      // 394: ldc2_w -6123908667366628156
      // 397: lload 8
      // 399: invokedynamic o (JJ)C bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39e: if_icmpne 3c1
      // 3a1: goto 3af
      // 3a4: ldc2_w -5218014391069701161
      // 3a7: lload 8
      // 3a9: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ae: athrow
      // 3af: bipush 1
      // 3b0: goto 3be
      // 3b3: ldc2_w -5218014391069701161
      // 3b6: lload 8
      // 3b8: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bd: athrow
      // 3be: goto 3c2
      // 3c1: bipush 0
      // 3c2: istore 18
      // 3c4: aload 5
      // 3c6: aload 17
      // 3c8: bipush 1
      // 3c9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 3cc: lload 12
      // 3ce: dup2_x1
      // 3cf: pop2
      // 3d0: aload 4
      // 3d2: iload 18
      // 3d4: bipush 4
      // 3d5: anewarray 606
      // 3d8: dup_x1
      // 3d9: swap
      // 3da: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3dd: bipush 3
      // 3de: swap
      // 3df: aastore
      // 3e0: dup_x1
      // 3e1: swap
      // 3e2: bipush 2
      // 3e3: swap
      // 3e4: aastore
      // 3e5: dup_x1
      // 3e6: swap
      // 3e7: bipush 1
      // 3e8: swap
      // 3e9: aastore
      // 3ea: dup_x2
      // 3eb: dup_x2
      // 3ec: pop
      // 3ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3f0: bipush 0
      // 3f1: swap
      // 3f2: aastore
      // 3f3: ldc2_w -5965831447486987084
      // 3f6: lload 8
      // 3f8: invokedynamic v (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: lload 10
      // 3ff: bipush 2
      // 400: anewarray 606
      // 403: dup_x2
      // 404: dup_x2
      // 405: pop
      // 406: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 409: bipush 1
      // 40a: swap
      // 40b: aastore
      // 40c: dup_x2
      // 40d: dup_x2
      // 40e: pop
      // 40f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 412: bipush 0
      // 413: swap
      // 414: aastore
      // 415: ldc2_w -5645360817519142185
      // 418: lload 8
      // 41a: invokedynamic n (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41f: iload 14
      // 421: lload 8
      // 423: lconst_0
      // 424: lcmp
      // 425: iflt 42c
      // 428: ifeq 447
      // 42b: bipush 4
      // 42c: anewarray 9
      // 42f: ldc2_w -5297850630741978420
      // 432: lload 8
      // 434: invokedynamic v (Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 439: goto 447
      // 43c: ldc2_w -5218014391069701161
      // 43f: lload 8
      // 441: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 446: athrow
      // 447: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public static String E(Object[] var0) {
      long var2 = (Long)var0[0];
      long var4 = (Long)var0[1];
      String var1 = (String)var0[2];
      var4 = ab ^ var4;
      long var6 = var4 ^ 130470253034543L;
      long var8 = var4 ^ 55714378839063L;
      int var10000 = x44.a<"s">(382660053958348080L, var4);
      xx var11 = new xx();
      int var10 = var10000;
      Object[] var10005 = new Object[]{null, var1, var11, var6};
      var10005[0] = var2;
      String var12 = x44.a<"s">(var10005, 338580478213323758L, var4);

      int var13;
      label40: {
         label47: {
            label44: {
               try {
                  var10000 = var11.S();
                  if (var10 == 0) {
                     break label47;
                  }

                  if (var10000 == 0) {
                     break label44;
                  }
               } catch (gj var17) {
                  throw x44.a<"s">(var17, 319964607629867058L, var4);
               }

               var13 = x44.a<"j">(1794363464940951329L, var4);

               try {
                  var10000 = var10;
                  if (var4 < 0L) {
                     break label47;
                  }

                  if (var10 != 0) {
                     break label40;
                  }
               } catch (gj var16) {
                  boolean var10001 = false;
                  throw x44.a<"s">(var16, 319964607629867058L, var4);
               }
            }

            try {
               var10000 = x44.a<"j">(9354472377907535L, var4);
            } catch (gj var15) {
               boolean var22 = false;
               throw x44.a<"s">(var15, 319964607629867058L, var4);
            }
         }

         var13 = var10000;
      }

      StringBuilder var21 = new StringBuilder().append((char)var13);
      int var10002 = c<"c">(10323, 4462669473827317249L ^ var4);
      int var10003 = c<"c">(15189, 2539845408528495885L ^ var4);
      Object[] var10007 = new Object[]{null, null, null, null, Integer.valueOf(x44.a<"j">(224399434500956696L, var4))};
      var10007[3] = var8;
      var10007[2] = var10003;
      var10007[1] = var10002;
      var10007[0] = var12;
      return var21.append(x44.a<"s">(var10007, 431526223183609913L, var4)).toString();
   }

   public static int[] Q(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:39 from source 36_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 1
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 2
      // 01a: pop
      // 01b: getstatic com/zelix/aa.ab J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: lload 2
      // 022: dup2
      // 023: ldc2_w 76305250316296
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: aload 4
      // 02c: ldc2_w -7422292477562914877
      // 02f: lload 2
      // 030: invokedynamic t (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: lstore 8
      // 037: bipush 0
      // 038: istore 10
      // 03a: ldc2_w -9153263503347800300
      // 03d: lload 2
      // 03e: invokedynamic t (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: bipush 0
      // 044: istore 11
      // 046: istore 7
      // 048: iload 11
      // 04a: aload 1
      // 04b: invokevirtual java/lang/String.length ()I
      // 04e: if_icmpge 064
      // 051: iload 10
      // 053: aload 1
      // 054: iload 11
      // 056: invokevirtual java/lang/String.charAt (I)C
      // 059: iadd
      // 05a: istore 10
      // 05c: iinc 11 1
      // 05f: iload 7
      // 061: ifeq 048
      // 064: lload 2
      // 065: lconst_0
      // 066: lcmp
      // 067: iflt 05f
      // 06a: lload 8
      // 06c: iload 10
      // 06e: i2l
      // 06f: lsub
      // 070: lstore 11
      // 072: lload 11
      // 074: ldc2_w -7484472095222838278
      // 077: lload 2
      // 078: invokedynamic t (JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07d: sipush 21341
      // 080: ldc2_w 342620812583049485
      // 083: lload 2
      // 084: lxor
      // 085: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: ldc2_w -7174278899464130497
      // 08d: lload 2
      // 08e: invokedynamic t (Ljava/lang/Object;IJJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: ldc2_w -7484472095222838278
      // 096: lload 2
      // 097: invokedynamic t (JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: astore 13
      // 09e: aload 13
      // 0a0: invokevirtual java/lang/String.length ()I
      // 0a3: iload 7
      // 0a5: lload 2
      // 0a6: lconst_0
      // 0a7: lcmp
      // 0a8: ifle 0af
      // 0ab: ifne 118
      // 0ae: bipush 5
      // 0af: if_icmpge 113
      // 0b2: goto 0bf
      // 0b5: ldc2_w -9191906386048631763
      // 0b8: lload 2
      // 0b9: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: aload 13
      // 0c1: sipush 10323
      // 0c4: ldc2_w 4462752719695798814
      // 0c7: lload 2
      // 0c8: lxor
      // 0c9: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ce: bipush 5
      // 0cf: lload 5
      // 0d1: sipush 28285
      // 0d4: ldc2_w 941715279980995628
      // 0d7: lload 2
      // 0d8: lxor
      // 0d9: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: bipush 5
      // 0df: anewarray 606
      // 0e2: dup_x1
      // 0e3: swap
      // 0e4: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e7: bipush 4
      // 0e8: swap
      // 0e9: aastore
      // 0ea: dup_x2
      // 0eb: dup_x2
      // 0ec: pop
      // 0ed: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f0: bipush 3
      // 0f1: swap
      // 0f2: aastore
      // 0f3: dup_x1
      // 0f4: swap
      // 0f5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f8: bipush 2
      // 0f9: swap
      // 0fa: aastore
      // 0fb: dup_x1
      // 0fc: swap
      // 0fd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 100: bipush 1
      // 101: swap
      // 102: aastore
      // 103: dup_x1
      // 104: swap
      // 105: bipush 0
      // 106: swap
      // 107: aastore
      // 108: ldc2_w -9087594331690990554
      // 10b: lload 2
      // 10c: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: astore 13
      // 113: aload 13
      // 115: invokevirtual java/lang/String.length ()I
      // 118: istore 14
      // 11a: aload 13
      // 11c: bipush 0
      // 11d: iload 14
      // 11f: bipush 4
      // 120: isub
      // 121: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 124: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 127: istore 15
      // 129: aload 13
      // 12b: iload 14
      // 12d: bipush 4
      // 12e: isub
      // 12f: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 132: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 135: istore 16
      // 137: bipush 2
      // 138: newarray 10
      // 13a: dup
      // 13b: bipush 0
      // 13c: iload 15
      // 13e: iastore
      // 13f: dup
      // 140: bipush 1
      // 141: iload 16
      // 143: iastore
      // 144: astore 17
      // 146: aload 17
      // 148: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static String y(Object[] var0) {
      long var5 = (Long)var0[0];
      String var3 = (String)var0[1];
      xx var4 = (xx)var0[2];
      long var1 = (Long)var0[3];
      var1 = ab ^ var1;
      long var7 = var1 ^ 134666189609113L;
      long var9 = var1 ^ 122623724585975L;
      int var10000 = x44.a<"t">(2189032233183328652L, var1);
      Object[] var10005 = new Object[]{null, var3, var7};
      var10005[0] = var5;
      long var12 = x44.a<"t">(var10005, 2097504496473751988L, var1);
      int var11 = var10000;

      long var14;
      label45: {
         label54: {
            label42: {
               label49: {
                  try {
                     var22 = var12;
                     if (var11 != 0) {
                        break label54;
                     }

                     if (var12 >= 0L) {
                        break label49;
                     }
                  } catch (gj var20) {
                     throw x44.a<"t">(var20, 2231493717619942069L, var1);
                  }

                  var4.Q(true);
                  var14 = var12 * e<"b">(14050, 3557811027125735354L ^ var1);

                  try {
                     if (var1 <= 0L) {
                        break label42;
                     }

                     if (var11 == 0) {
                        break label45;
                     }
                  } catch (gj var19) {
                     boolean var10001 = false;
                     throw x44.a<"t">(var19, 2231493717619942069L, var1);
                  }
               }

               try {
                  var4.Q(false);
               } catch (gj var18) {
                  boolean var24 = false;
                  throw x44.a<"t">(var18, 2231493717619942069L, var1);
               }
            }

            try {
               var22 = var12;
            } catch (gj var17) {
               boolean var25 = false;
               throw x44.a<"t">(var17, 2231493717619942069L, var1);
            }
         }

         var14 = var22;
      }

      Object[] var10004 = new Object[]{null, x44.a<"m">(1973104915991784065L, var1), var9};
      var10004[0] = var14;
      return x44.a<"t">(var10004, 562574701077142365L, var1);
   }

   static String X(Object[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Do}:48 from source 45_tail
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.sforms.SFormsConstructor.splitVariables(SFormsConstructor.java:72)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.StackVarsProcessor.simplifyStackVars(StackVarsProcessor.java:40)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:292)
      //
      // Bytecode:
      // 000: aload 0
      // 001: dup
      // 002: bipush 0
      // 003: aaload
      // 004: checkcast java/lang/String
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 2
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast java/lang/String
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/aa.ab J
      // 01e: lload 2
      // 01f: lxor
      // 020: lstore 2
      // 021: ldc2_w -3259751927213286724
      // 024: lload 2
      // 025: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02a: aload 1
      // 02b: ldc2_w -3788164774852844464
      // 02e: lload 2
      // 02f: invokedynamic w (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 034: lstore 6
      // 036: istore 5
      // 038: bipush 0
      // 039: istore 8
      // 03b: bipush 0
      // 03c: istore 9
      // 03e: iload 9
      // 040: aload 4
      // 042: invokevirtual java/lang/String.length ()I
      // 045: if_icmpge 05c
      // 048: iload 8
      // 04a: aload 4
      // 04c: iload 9
      // 04e: invokevirtual java/lang/String.charAt (I)C
      // 051: iadd
      // 052: istore 8
      // 054: iinc 9 1
      // 057: iload 5
      // 059: ifne 03e
      // 05c: lload 2
      // 05d: lconst_0
      // 05e: lcmp
      // 05f: ifle 057
      // 062: lload 6
      // 064: iload 8
      // 066: i2l
      // 067: lsub
      // 068: lstore 9
      // 06a: lload 9
      // 06c: ldc2_w -3768716650244073367
      // 06f: lload 2
      // 070: invokedynamic w (JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 075: sipush 21341
      // 078: ldc2_w 342625090751056542
      // 07b: lload 2
      // 07c: lxor
      // 07d: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: ldc2_w -3459658149711223892
      // 085: lload 2
      // 086: invokedynamic w (Ljava/lang/Object;IJJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: ldc2_w -3768716650244073367
      // 08e: lload 2
      // 08f: invokedynamic w (JJJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: astore 11
      // 096: new java/lang/StringBuilder
      // 099: dup
      // 09a: invokespecial java/lang/StringBuilder.<init> ()V
      // 09d: astore 12
      // 09f: aload 11
      // 0a1: invokevirtual java/lang/String.length ()I
      // 0a4: bipush 3
      // 0a5: if_icmple 0f3
      // 0a8: aload 11
      // 0aa: invokevirtual java/lang/String.length ()I
      // 0ad: bipush 3
      // 0ae: isub
      // 0af: istore 13
      // 0b1: aload 11
      // 0b3: iload 13
      // 0b5: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0b8: astore 14
      // 0ba: aload 12
      // 0bc: aload 14
      // 0be: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0c1: i2c
      // 0c2: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0c5: pop
      // 0c6: aload 11
      // 0c8: bipush 0
      // 0c9: iload 13
      // 0cb: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0ce: lload 2
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: iflt 10d
      // 0d4: astore 11
      // 0d6: iload 5
      // 0d8: ifeq 0ff
      // 0db: iload 5
      // 0dd: ifne 09f
      // 0e0: lload 2
      // 0e1: lconst_0
      // 0e2: lcmp
      // 0e3: iflt 0d6
      // 0e6: goto 0f3
      // 0e9: ldc2_w -3171433866726707266
      // 0ec: lload 2
      // 0ed: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: aload 12
      // 0f5: aload 11
      // 0f7: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 0fa: i2c
      // 0fb: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0fe: pop
      // 0ff: aload 12
      // 101: ldc2_w -4024465908377776747
      // 104: lload 2
      // 105: invokedynamic o (Ljava/lang/Object;JJ)Ljava/lang/StringBuilder; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 10d: areturn
   }

   public boolean y(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = ab ^ var2;
      return x44.a<"i">(this, 7068930445626659153L, var2);
   }

   static Long V(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 1
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 2
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast com/zelix/pg
      // 020: astore 4
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/String
      // 028: astore 5
      // 02a: pop
      // 02b: getstatic com/zelix/aa.ab J
      // 02e: lload 2
      // 02f: lxor
      // 030: lstore 2
      // 031: lload 2
      // 032: dup2
      // 033: ldc2_w 138160429027309
      // 036: lxor
      // 037: lstore 7
      // 039: dup2
      // 03a: ldc2_w 86061315259180
      // 03d: lxor
      // 03e: lstore 9
      // 040: dup2
      // 041: ldc2_w 96813368620150
      // 044: lxor
      // 045: lstore 11
      // 047: dup2
      // 048: ldc2_w 40623769740140
      // 04b: lxor
      // 04c: lstore 13
      // 04e: dup2
      // 04f: ldc2_w 45774761885817
      // 052: lxor
      // 053: lstore 15
      // 055: dup2
      // 056: ldc2_w 69662904629470
      // 059: lxor
      // 05a: lstore 17
      // 05c: pop2
      // 05d: ldc2_w 7223000199938583618
      // 060: lload 2
      // 061: invokedynamic q (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: istore 19
      // 068: aload 6
      // 06a: iload 19
      // 06c: ifeq 0e0
      // 06f: invokevirtual java/lang/String.length ()I
      // 072: sipush 21678
      // 075: ldc2_w 2385871574173612953
      // 078: lload 2
      // 079: lxor
      // 07a: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: if_icmpge 0cd
      // 082: goto 08f
      // 085: ldc2_w 7278526451441785152
      // 088: lload 2
      // 089: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: aload 6
      // 091: aload 1
      // 092: aload 4
      // 094: aload 5
      // 096: lload 11
      // 098: bipush 5
      // 099: anewarray 606
      // 09c: dup_x2
      // 09d: dup_x2
      // 09e: pop
      // 09f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a2: bipush 4
      // 0a3: swap
      // 0a4: aastore
      // 0a5: dup_x1
      // 0a6: swap
      // 0a7: bipush 3
      // 0a8: swap
      // 0a9: aastore
      // 0aa: dup_x1
      // 0ab: swap
      // 0ac: bipush 2
      // 0ad: swap
      // 0ae: aastore
      // 0af: dup_x1
      // 0b0: swap
      // 0b1: bipush 1
      // 0b2: swap
      // 0b3: aastore
      // 0b4: dup_x1
      // 0b5: swap
      // 0b6: bipush 0
      // 0b7: swap
      // 0b8: aastore
      // 0b9: ldc2_w 8781037727583416991
      // 0bc: lload 2
      // 0bd: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/Long; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: areturn
      // 0c3: ldc2_w 7278526451441785152
      // 0c6: lload 2
      // 0c7: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: athrow
      // 0cd: aload 6
      // 0cf: bipush 0
      // 0d0: sipush 21341
      // 0d3: ldc2_w 342686135002004576
      // 0d6: lload 2
      // 0d7: lxor
      // 0d8: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0e0: astore 20
      // 0e2: aload 6
      // 0e4: sipush 21341
      // 0e7: ldc2_w 342686135002004576
      // 0ea: lload 2
      // 0eb: lxor
      // 0ec: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f4: astore 21
      // 0f6: aload 20
      // 0f8: sipush 21086
      // 0fb: ldc2_w 1904914963796383544
      // 0fe: lload 2
      // 0ff: lxor
      // 100: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: lload 9
      // 107: bipush 3
      // 108: anewarray 606
      // 10b: dup_x2
      // 10c: dup_x2
      // 10d: pop
      // 10e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 111: bipush 2
      // 112: swap
      // 113: aastore
      // 114: dup_x1
      // 115: swap
      // 116: bipush 1
      // 117: swap
      // 118: aastore
      // 119: dup_x1
      // 11a: swap
      // 11b: bipush 0
      // 11c: swap
      // 11d: aastore
      // 11e: ldc2_w 8971927710400685737
      // 121: lload 2
      // 122: invokedynamic q (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: lstore 22
      // 129: lload 22
      // 12b: aload 5
      // 12d: lload 13
      // 12f: bipush 3
      // 130: anewarray 606
      // 133: dup_x2
      // 134: dup_x2
      // 135: pop
      // 136: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
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
      // 14a: ldc2_w 7417019232478706241
      // 14d: lload 2
      // 14e: invokedynamic q (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: lstore 24
      // 155: aload 21
      // 157: sipush 21086
      // 15a: ldc2_w 1904914963796383544
      // 15d: lload 2
      // 15e: lxor
      // 15f: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: lload 9
      // 166: bipush 3
      // 167: anewarray 606
      // 16a: dup_x2
      // 16b: dup_x2
      // 16c: pop
      // 16d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 170: bipush 2
      // 171: swap
      // 172: aastore
      // 173: dup_x1
      // 174: swap
      // 175: bipush 1
      // 176: swap
      // 177: aastore
      // 178: dup_x1
      // 179: swap
      // 17a: bipush 0
      // 17b: swap
      // 17c: aastore
      // 17d: ldc2_w 8971927710400685737
      // 180: lload 2
      // 181: invokedynamic q (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: lstore 26
      // 188: lload 26
      // 18a: aload 5
      // 18c: lload 13
      // 18e: bipush 3
      // 18f: anewarray 606
      // 192: dup_x2
      // 193: dup_x2
      // 194: pop
      // 195: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 198: bipush 2
      // 199: swap
      // 19a: aastore
      // 19b: dup_x1
      // 19c: swap
      // 19d: bipush 1
      // 19e: swap
      // 19f: aastore
      // 1a0: dup_x2
      // 1a1: dup_x2
      // 1a2: pop
      // 1a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1a6: bipush 0
      // 1a7: swap
      // 1a8: aastore
      // 1a9: ldc2_w 7417019232478706241
      // 1ac: lload 2
      // 1ad: invokedynamic q (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: lstore 28
      // 1b4: new java/util/ArrayList
      // 1b7: dup
      // 1b8: invokespecial java/util/ArrayList.<init> ()V
      // 1bb: astore 30
      // 1bd: bipush 0
      // 1be: istore 31
      // 1c0: iload 31
      // 1c2: bipush 3
      // 1c3: if_icmpge 25a
      // 1c6: lload 28
      // 1c8: sipush 18538
      // 1cb: ldc2_w 1188171242091547334
      // 1ce: lload 2
      // 1cf: lxor
      // 1d0: invokedynamic b (IJ)J bsm=com/zelix/aa.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d5: land
      // 1d6: lload 2
      // 1d7: lconst_0
      // 1d8: lcmp
      // 1d9: ifle 295
      // 1dc: l2i
      // 1dd: istore 32
      // 1df: iload 19
      // 1e1: ifeq 293
      // 1e4: iload 19
      // 1e6: lload 2
      // 1e7: lconst_0
      // 1e8: lcmp
      // 1e9: ifle 257
      // 1ec: ifeq 255
      // 1ef: goto 1fc
      // 1f2: ldc2_w 7278526451441785152
      // 1f5: lload 2
      // 1f6: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: lload 2
      // 1fd: lconst_0
      // 1fe: lcmp
      // 1ff: iflt 252
      // 202: iload 32
      // 204: sipush 32257
      // 207: ldc2_w 4733839720053690686
      // 20a: lload 2
      // 20b: lxor
      // 20c: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: if_icmpgt 240
      // 214: goto 221
      // 217: ldc2_w 7278526451441785152
      // 21a: lload 2
      // 21b: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 30
      // 223: getstatic com/zelix/aa.o Lcom/zelix/_uo;
      // 226: iload 32
      // 228: lload 7
      // 22a: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 22d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 232: pop
      // 233: goto 240
      // 236: ldc2_w 7278526451441785152
      // 239: lload 2
      // 23a: invokedynamic q (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23f: athrow
      // 240: lload 28
      // 242: sipush 25314
      // 245: ldc2_w 2348847666145250758
      // 248: lload 2
      // 249: lxor
      // 24a: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24f: lushr
      // 250: lstore 28
      // 252: iinc 31 1
      // 255: iload 19
      // 257: ifne 1c0
      // 25a: aload 30
      // 25c: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
      // 25f: aload 4
      // 261: lload 17
      // 263: aload 1
      // 264: aload 30
      // 266: bipush 3
      // 267: anewarray 606
      // 26a: dup_x1
      // 26b: swap
      // 26c: bipush 2
      // 26d: swap
      // 26e: aastore
      // 26f: dup_x1
      // 270: swap
      // 271: bipush 1
      // 272: swap
      // 273: aastore
      // 274: dup_x2
      // 275: dup_x2
      // 276: pop
      // 277: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 27a: bipush 0
      // 27b: swap
      // 27c: aastore
      // 27d: ldc2_w 7248451210465830510
      // 280: lload 2
      // 281: invokedynamic q (Ljava/lang/Object;JJ)[Lcom/zelix/_a; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: lload 15
      // 288: dup2_x1
      // 289: pop2
      // 28a: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 28d: lload 2
      // 28e: lconst_0
      // 28f: lcmp
      // 290: iflt 293
      // 293: lload 24
      // 295: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 298: areturn
   }

   static Long d(Object[] param0) {
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
      // 004: checkcast java/lang/String
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast com/zelix/pg
      // 016: astore 1
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast java/lang/String
      // 01d: astore 3
      // 01e: dup
      // 01f: bipush 4
      // 020: aaload
      // 021: checkcast java/lang/Long
      // 024: invokevirtual java/lang/Long.longValue ()J
      // 027: lstore 4
      // 029: pop
      // 02a: getstatic com/zelix/aa.ab J
      // 02d: lload 4
      // 02f: lxor
      // 030: lstore 4
      // 032: lload 4
      // 034: dup2
      // 035: ldc2_w 60097381637427
      // 038: lxor
      // 039: lstore 7
      // 03b: dup2
      // 03c: ldc2_w 5818846095858
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 123132635754930
      // 046: lxor
      // 047: lstore 11
      // 049: dup2
      // 04a: ldc2_w 108502621278887
      // 04d: lxor
      // 04e: lstore 13
      // 050: dup2
      // 051: ldc2_w 127907631589888
      // 054: lxor
      // 055: lstore 15
      // 057: pop2
      // 058: ldc2_w -5239352467331542873
      // 05b: lload 4
      // 05d: invokedynamic w (JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: aload 6
      // 064: sipush 21086
      // 067: ldc2_w 1904975493706679782
      // 06a: lload 4
      // 06c: lxor
      // 06d: invokedynamic i (IJ)Ljava/lang/String; bsm=com/zelix/aa.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: lload 9
      // 074: bipush 3
      // 075: anewarray 606
      // 078: dup_x2
      // 079: dup_x2
      // 07a: pop
      // 07b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07e: bipush 2
      // 07f: swap
      // 080: aastore
      // 081: dup_x1
      // 082: swap
      // 083: bipush 1
      // 084: swap
      // 085: aastore
      // 086: dup_x1
      // 087: swap
      // 088: bipush 0
      // 089: swap
      // 08a: aastore
      // 08b: ldc2_w -5882550241924451209
      // 08e: lload 4
      // 090: invokedynamic w (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: lstore 18
      // 097: lload 18
      // 099: aload 3
      // 09a: lload 11
      // 09c: bipush 3
      // 09d: anewarray 606
      // 0a0: dup_x2
      // 0a1: dup_x2
      // 0a2: pop
      // 0a3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0a6: bipush 2
      // 0a7: swap
      // 0a8: aastore
      // 0a9: dup_x1
      // 0aa: swap
      // 0ab: bipush 1
      // 0ac: swap
      // 0ad: aastore
      // 0ae: dup_x2
      // 0af: dup_x2
      // 0b0: pop
      // 0b1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b4: bipush 0
      // 0b5: swap
      // 0b6: aastore
      // 0b7: ldc2_w -5462654423098660705
      // 0ba: lload 4
      // 0bc: invokedynamic w (Ljava/lang/Object;JJ)J bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: lstore 20
      // 0c3: istore 17
      // 0c5: new java/util/ArrayList
      // 0c8: dup
      // 0c9: invokespecial java/util/ArrayList.<init> ()V
      // 0cc: astore 22
      // 0ce: bipush 0
      // 0cf: istore 23
      // 0d1: iload 23
      // 0d3: bipush 3
      // 0d4: if_icmpge 174
      // 0d7: lload 20
      // 0d9: sipush 8077
      // 0dc: ldc2_w 8266294850485751800
      // 0df: lload 4
      // 0e1: lxor
      // 0e2: invokedynamic b (IJ)J bsm=com/zelix/aa.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: land
      // 0e8: lload 4
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: iflt 1b0
      // 0ef: l2i
      // 0f0: istore 24
      // 0f2: iload 17
      // 0f4: ifne 1ae
      // 0f7: iload 17
      // 0f9: lload 4
      // 0fb: lconst_0
      // 0fc: lcmp
      // 0fd: iflt 171
      // 100: ifne 16f
      // 103: goto 111
      // 106: ldc2_w -5198053155981096034
      // 109: lload 4
      // 10b: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: lload 4
      // 113: lconst_0
      // 114: lcmp
      // 115: ifle 16c
      // 118: iload 24
      // 11a: sipush 20054
      // 11d: ldc2_w 2329325549762098086
      // 120: lload 4
      // 122: lxor
      // 123: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 128: if_icmpgt 159
      // 12b: goto 139
      // 12e: ldc2_w -5198053155981096034
      // 131: lload 4
      // 133: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: aload 22
      // 13b: getstatic com/zelix/aa.o Lcom/zelix/_uo;
      // 13e: iload 24
      // 140: lload 7
      // 142: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 145: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14a: pop
      // 14b: goto 159
      // 14e: ldc2_w -5198053155981096034
      // 151: lload 4
      // 153: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/gj; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: athrow
      // 159: lload 20
      // 15b: sipush 25314
      // 15e: ldc2_w 2348771853935910680
      // 161: lload 4
      // 163: lxor
      // 164: invokedynamic c (IJ)I bsm=com/zelix/aa.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: lushr
      // 16a: lstore 20
      // 16c: iinc 23 1
      // 16f: iload 17
      // 171: ifeq 0d1
      // 174: aload 22
      // 176: invokestatic java/util/Collections.reverse (Ljava/util/List;)V
      // 179: aload 1
      // 17a: lload 15
      // 17c: aload 2
      // 17d: aload 22
      // 17f: bipush 3
      // 180: anewarray 606
      // 183: dup_x1
      // 184: swap
      // 185: bipush 2
      // 186: swap
      // 187: aastore
      // 188: dup_x1
      // 189: swap
      // 18a: bipush 1
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x2
      // 18e: dup_x2
      // 18f: pop
      // 190: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 193: bipush 0
      // 194: swap
      // 195: aastore
      // 196: ldc2_w -5311466931162827600
      // 199: lload 4
      // 19b: invokedynamic w (Ljava/lang/Object;JJ)[Lcom/zelix/_a; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a0: lload 13
      // 1a2: dup2_x1
      // 1a3: pop2
      // 1a4: invokevirtual com/zelix/pg.G (JLjava/lang/Object;)V
      // 1a7: lload 4
      // 1a9: lconst_0
      // 1aa: lcmp
      // 1ab: ifle 1ae
      // 1ae: lload 20
      // 1b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1b3: areturn
   }

   public abstract void E(Object[] var1);

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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27391;
      if (db[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])eb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               eb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/aa", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = cb[var5].getBytes("ISO-8859-1");
         db[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return db[var5];
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
         throw new RuntimeException("com/zelix/aa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16564;
      if (jb[var3] == null) {
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
         long var5 = ib[var3];
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
         Object[] var9 = (Object[])kb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               kb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/aa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
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
         throw new RuntimeException("com/zelix/aa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11573;
      if (pb[var3] == null) {
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
         long var5 = ob[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/aa", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         pb[var3] = var15;
      }

      return pb[var3];
   }

   private static long e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = e(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("com/zelix/aa" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
