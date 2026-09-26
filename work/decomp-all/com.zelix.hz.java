package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hz {
   private v7[] n;
   private BitSet K;
   private Set M;
   private final fb a;
   private static String[] O;
   private v7[] W;
   private static final long b = prr.a(-6663684786602406894L, -8221204524858666917L, MethodHandles.lookup().lookupClass()).a(80380328495126L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public hz(v7[] param1, v7[] param2, long param3, fb param5, Set param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hz.b J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: aload 0
      // 07: invokespecial java/lang/Object.<init> ()V
      // 0a: aload 0
      // 0b: aload 2
      // 0c: putfield com/zelix/hz.W [Lcom/zelix/v7;
      // 0f: aload 0
      // 10: aload 1
      // 11: putfield com/zelix/hz.n [Lcom/zelix/v7;
      // 14: aload 0
      // 15: aload 5
      // 17: putfield com/zelix/hz.a Lcom/zelix/fb;
      // 1a: ldc2_w -6178705845136499056
      // 1d: lload 3
      // 1e: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: aload 0
      // 24: aload 6
      // 26: putfield com/zelix/hz.M Ljava/util/Set;
      // 29: bipush 0
      // 2a: istore 8
      // 2c: astore 7
      // 2e: iload 8
      // 30: aload 0
      // 31: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 34: arraylength
      // 35: if_icmpge 73
      // 38: aload 0
      // 39: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 3c: iload 8
      // 3e: aload 7
      // 40: ifnonnull 67
      // 43: aaload
      // 44: ifnonnull 6b
      // 47: goto 54
      // 4a: ldc2_w -6129264334554700881
      // 4d: lload 3
      // 4e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: aload 0
      // 55: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 58: iload 8
      // 5a: goto 67
      // 5d: ldc2_w -6129264334554700881
      // 60: lload 3
      // 61: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: athrow
      // 67: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // 6a: aastore
      // 6b: iinc 8 1
      // 6e: aload 7
      // 70: ifnull 2e
      // 73: lload 3
      // 74: lconst_0
      // 75: lcmp
      // 76: ifle 38
      // 79: return
   }

   public static hz r(Object[] param0) {
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
      // 004: checkcast com/zelix/loj
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/hz
      // 00f: astore 3
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast [Lcom/zelix/v7;
      // 016: astore 1
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast com/zelix/fb
      // 01d: astore 7
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Integer
      // 025: invokevirtual java/lang/Integer.intValue ()I
      // 028: istore 2
      // 029: dup
      // 02a: bipush 5
      // 02b: aaload
      // 02c: checkcast java/lang/Integer
      // 02f: invokevirtual java/lang/Integer.intValue ()I
      // 032: istore 4
      // 034: dup
      // 035: bipush 6
      // 037: aaload
      // 038: checkcast java/util/Set
      // 03b: astore 5
      // 03d: dup
      // 03e: bipush 7
      // 040: aaload
      // 041: checkcast java/lang/Integer
      // 044: invokevirtual java/lang/Integer.intValue ()I
      // 047: istore 8
      // 049: pop
      // 04a: iload 2
      // 04b: i2l
      // 04c: bipush 48
      // 04e: lshl
      // 04f: iload 4
      // 051: i2l
      // 052: bipush 32
      // 054: lshl
      // 055: bipush 16
      // 057: lushr
      // 058: lor
      // 059: iload 8
      // 05b: i2l
      // 05c: bipush 48
      // 05e: lshl
      // 05f: bipush 48
      // 061: lushr
      // 062: lor
      // 063: getstatic com/zelix/hz.b J
      // 066: lxor
      // 067: lstore 9
      // 069: lload 9
      // 06b: dup2
      // 06c: ldc2_w 106989657630361
      // 06f: lxor
      // 070: lstore 11
      // 072: dup2
      // 073: ldc2_w 124726616425625
      // 076: lxor
      // 077: lstore 13
      // 079: dup2
      // 07a: ldc2_w 120795325605722
      // 07d: lxor
      // 07e: lstore 15
      // 080: pop2
      // 081: new com/zelix/zr
      // 084: dup
      // 085: invokespecial com/zelix/zr.<init> ()V
      // 088: astore 18
      // 08a: ldc2_w 7252424414770335861
      // 08d: lload 9
      // 08f: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: aload 6
      // 096: aload 1
      // 097: aload 3
      // 098: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 09b: aload 3
      // 09c: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 09f: lload 11
      // 0a1: aload 18
      // 0a3: bipush 6
      // 0a5: anewarray 383
      // 0a8: dup_x1
      // 0a9: swap
      // 0aa: bipush 5
      // 0ab: swap
      // 0ac: aastore
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 4
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: bipush 3
      // 0b9: swap
      // 0ba: aastore
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: bipush 2
      // 0be: swap
      // 0bf: aastore
      // 0c0: dup_x1
      // 0c1: swap
      // 0c2: bipush 1
      // 0c3: swap
      // 0c4: aastore
      // 0c5: dup_x1
      // 0c6: swap
      // 0c7: bipush 0
      // 0c8: swap
      // 0c9: aastore
      // 0ca: ldc2_w 7220901448533802287
      // 0cd: lload 9
      // 0cf: invokedynamic o (Ljava/lang/Object;JJ)[Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: astore 19
      // 0d6: new java/util/LinkedHashSet
      // 0d9: dup
      // 0da: invokespecial java/util/LinkedHashSet.<init> ()V
      // 0dd: astore 20
      // 0df: astore 17
      // 0e1: aload 5
      // 0e3: aload 17
      // 0e5: ifnonnull 115
      // 0e8: ifnull 111
      // 0eb: goto 0f9
      // 0ee: ldc2_w 7211776886910135626
      // 0f1: lload 9
      // 0f3: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 20
      // 0fb: aload 5
      // 0fd: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 102: pop
      // 103: goto 111
      // 106: ldc2_w 7211776886910135626
      // 109: lload 9
      // 10b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 110: athrow
      // 111: aload 3
      // 112: getfield com/zelix/hz.M Ljava/util/Set;
      // 115: ifnull 132
      // 118: aload 20
      // 11a: aload 3
      // 11b: getfield com/zelix/hz.M Ljava/util/Set;
      // 11e: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 123: pop
      // 124: goto 132
      // 127: ldc2_w 7211776886910135626
      // 12a: lload 9
      // 12c: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: aload 20
      // 134: invokeinterface java/util/Set.size ()I 1
      // 139: ifne 13f
      // 13c: aconst_null
      // 13d: astore 20
      // 13f: aload 7
      // 141: aload 17
      // 143: iload 8
      // 145: iflt 170
      // 148: ifnonnull 16e
      // 14b: ifnull 1ef
      // 14e: goto 15c
      // 151: ldc2_w 7211776886910135626
      // 154: lload 9
      // 156: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: athrow
      // 15c: aload 3
      // 15d: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 160: goto 16e
      // 163: ldc2_w 7211776886910135626
      // 166: lload 9
      // 168: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aload 17
      // 170: ifnonnull 1c5
      // 173: aload 7
      // 175: invokevirtual com/zelix/fb.equals (Ljava/lang/Object;)Z
      // 178: ifeq 1a8
      // 17b: goto 189
      // 17e: ldc2_w 7211776886910135626
      // 181: lload 9
      // 183: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 188: athrow
      // 189: new com/zelix/hz
      // 18c: dup
      // 18d: aload 3
      // 18e: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 191: aload 19
      // 193: lload 13
      // 195: aload 7
      // 197: aload 20
      // 199: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 19c: astore 21
      // 19e: aload 17
      // 1a0: iload 4
      // 1a2: iflt 1b4
      // 1a5: ifnull 202
      // 1a8: aload 7
      // 1aa: ldc2_w 7110470955085528350
      // 1ad: lload 9
      // 1af: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: checkcast com/zelix/fb
      // 1b7: goto 1c5
      // 1ba: ldc2_w 7211776886910135626
      // 1bd: lload 9
      // 1bf: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: astore 22
      // 1c7: aload 22
      // 1c9: aload 3
      // 1ca: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 1cd: invokevirtual com/zelix/fb.or (Ljava/util/BitSet;)V
      // 1d0: new com/zelix/hz
      // 1d3: dup
      // 1d4: aload 3
      // 1d5: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 1d8: aload 19
      // 1da: lload 13
      // 1dc: aload 22
      // 1de: aload 20
      // 1e0: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 1e3: iload 8
      // 1e5: iflt 200
      // 1e8: astore 21
      // 1ea: aload 17
      // 1ec: ifnull 202
      // 1ef: new com/zelix/hz
      // 1f2: dup
      // 1f3: aload 3
      // 1f4: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 1f7: aload 19
      // 1f9: aload 20
      // 1fb: lload 15
      // 1fd: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;Ljava/util/Set;J)V
      // 200: astore 21
      // 202: aload 21
      // 204: areturn
   }

   public v7[] T() {
      return this.W;
   }

   public static void m(String[] var0) {
      O = var0;
   }

   public static boolean N(Object[] var0) {
      v7 var1 = (v7)var0[0];
      return var1.y("I");
   }

   private static v7[] Z(loj param0, v7[] param1, v7[] param2, boolean param3, zr param4, long param5, String param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hz.b J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 45843562887918
      // 00e: lxor
      // 00f: lstore 8
      // 011: dup2
      // 012: ldc2_w 82882586562533
      // 015: lxor
      // 016: dup2
      // 017: bipush 56
      // 019: lushr
      // 01a: l2i
      // 01b: istore 10
      // 01d: dup2
      // 01e: bipush 8
      // 020: lshl
      // 021: bipush 32
      // 023: lushr
      // 024: l2i
      // 025: istore 11
      // 027: dup2
      // 028: bipush 40
      // 02a: lshl
      // 02b: bipush 40
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 12
      // 031: pop2
      // 032: dup2
      // 033: ldc2_w 18064013717412
      // 036: lxor
      // 037: lstore 13
      // 039: pop2
      // 03a: ldc2_w 8235052822363735704
      // 03d: lload 5
      // 03f: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 044: aload 4
      // 046: bipush 0
      // 047: invokevirtual com/zelix/zr.I (Z)V
      // 04a: astore 15
      // 04c: aload 1
      // 04d: arraylength
      // 04e: aload 15
      // 050: ifnonnull 0c0
      // 053: aload 2
      // 054: arraylength
      // 055: if_icmpeq 0be
      // 058: goto 066
      // 05b: ldc2_w 8284478870929193895
      // 05e: lload 5
      // 060: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 065: athrow
      // 066: new com/zelix/u9
      // 069: dup
      // 06a: new java/lang/StringBuilder
      // 06d: dup
      // 06e: invokespecial java/lang/StringBuilder.<init> ()V
      // 071: sipush 5343
      // 074: ldc2_w 382852625088247617
      // 077: lload 5
      // 079: lxor
      // 07a: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/hz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 082: aload 1
      // 083: arraylength
      // 084: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 087: ldc " "
      // 089: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08c: aload 2
      // 08d: arraylength
      // 08e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 091: sipush 8018
      // 094: ldc2_w 7195614538691181774
      // 097: lload 5
      // 099: lxor
      // 09a: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/hz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a2: aload 7
      // 0a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a7: ldc "'"
      // 0a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ac: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0af: invokespecial com/zelix/u9.<init> (Ljava/lang/String;)V
      // 0b2: athrow
      // 0b3: ldc2_w 8284478870929193895
      // 0b6: lload 5
      // 0b8: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 1
      // 0bf: arraylength
      // 0c0: istore 16
      // 0c2: iload 3
      // 0c3: ifeq 0db
      // 0c6: aload 1
      // 0c7: invokevirtual [Lcom/zelix/v7;.clone ()Ljava/lang/Object;
      // 0ca: checkcast [Lcom/zelix/v7;
      // 0cd: lload 5
      // 0cf: lconst_0
      // 0d0: lcmp
      // 0d1: ifle 0dc
      // 0d4: astore 17
      // 0d6: aload 15
      // 0d8: ifnull 0de
      // 0db: aload 1
      // 0dc: astore 17
      // 0de: bipush 0
      // 0df: istore 18
      // 0e1: iload 18
      // 0e3: iload 16
      // 0e5: if_icmpge 30b
      // 0e8: aload 2
      // 0e9: aload 15
      // 0eb: ifnonnull 314
      // 0ee: iload 18
      // 0f0: aaload
      // 0f1: aload 17
      // 0f3: iload 18
      // 0f5: aaload
      // 0f6: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 0f9: aload 15
      // 0fb: lload 5
      // 0fd: lconst_0
      // 0fe: lcmp
      // 0ff: iflt 164
      // 102: ifnonnull 162
      // 105: goto 113
      // 108: ldc2_w 8284478870929193895
      // 10b: lload 5
      // 10d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: athrow
      // 113: lload 5
      // 115: lconst_0
      // 116: lcmp
      // 117: ifle 154
      // 11a: ifeq 145
      // 11d: goto 12b
      // 120: ldc2_w 8284478870929193895
      // 123: lload 5
      // 125: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: athrow
      // 12b: aload 15
      // 12d: lload 5
      // 12f: lconst_0
      // 130: lcmp
      // 131: ifle 308
      // 134: ifnull 303
      // 137: goto 145
      // 13a: ldc2_w 8284478870929193895
      // 13d: lload 5
      // 13f: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 144: athrow
      // 145: aload 4
      // 147: bipush 1
      // 148: invokevirtual com/zelix/zr.I (Z)V
      // 14b: aload 2
      // 14c: iload 18
      // 14e: aaload
      // 14f: lload 13
      // 151: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 154: goto 162
      // 157: ldc2_w 8284478870929193895
      // 15a: lload 5
      // 15c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 161: athrow
      // 162: aload 15
      // 164: lload 5
      // 166: lconst_0
      // 167: lcmp
      // 168: ifle 199
      // 16b: ifnonnull 197
      // 16e: ifeq 2a0
      // 171: goto 17f
      // 174: ldc2_w 8284478870929193895
      // 177: lload 5
      // 179: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: aload 17
      // 181: iload 18
      // 183: aaload
      // 184: lload 13
      // 186: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 189: goto 197
      // 18c: ldc2_w 8284478870929193895
      // 18f: lload 5
      // 191: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: aload 15
      // 199: lload 5
      // 19b: lconst_0
      // 19c: lcmp
      // 19d: ifle 1d5
      // 1a0: ifnonnull 1cc
      // 1a3: ifeq 2a0
      // 1a6: goto 1b4
      // 1a9: ldc2_w 8284478870929193895
      // 1ac: lload 5
      // 1ae: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: athrow
      // 1b4: aload 17
      // 1b6: iload 18
      // 1b8: aaload
      // 1b9: ldc "n"
      // 1bb: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 1be: goto 1cc
      // 1c1: ldc2_w 8284478870929193895
      // 1c4: lload 5
      // 1c6: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cb: athrow
      // 1cc: lload 5
      // 1ce: lconst_0
      // 1cf: lcmp
      // 1d0: ifle 23d
      // 1d3: aload 15
      // 1d5: ifnonnull 23d
      // 1d8: ifeq 20c
      // 1db: goto 1e9
      // 1de: ldc2_w 8284478870929193895
      // 1e1: lload 5
      // 1e3: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: athrow
      // 1e9: aload 17
      // 1eb: iload 18
      // 1ed: aload 2
      // 1ee: iload 18
      // 1f0: aaload
      // 1f1: aastore
      // 1f2: aload 15
      // 1f4: lload 5
      // 1f6: lconst_0
      // 1f7: lcmp
      // 1f8: ifle 308
      // 1fb: ifnull 303
      // 1fe: goto 20c
      // 201: ldc2_w 8284478870929193895
      // 204: lload 5
      // 206: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: athrow
      // 20c: aload 2
      // 20d: iload 18
      // 20f: lload 5
      // 211: lconst_0
      // 212: lcmp
      // 213: iflt 252
      // 216: aload 15
      // 218: ifnonnull 252
      // 21b: goto 229
      // 21e: ldc2_w 8284478870929193895
      // 221: lload 5
      // 223: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: aaload
      // 22a: ldc "n"
      // 22c: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 22f: goto 23d
      // 232: ldc2_w 8284478870929193895
      // 235: lload 5
      // 237: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: ifne 303
      // 240: aload 17
      // 242: iload 18
      // 244: goto 252
      // 247: ldc2_w 8284478870929193895
      // 24a: lload 5
      // 24c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 251: athrow
      // 252: aload 0
      // 253: aload 2
      // 254: iload 18
      // 256: aaload
      // 257: aload 17
      // 259: iload 18
      // 25b: aaload
      // 25c: aload 7
      // 25e: lload 8
      // 260: bipush 4
      // 261: anewarray 383
      // 264: dup_x2
      // 265: dup_x2
      // 266: pop
      // 267: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26a: bipush 3
      // 26b: swap
      // 26c: aastore
      // 26d: dup_x1
      // 26e: swap
      // 26f: bipush 2
      // 270: swap
      // 271: aastore
      // 272: dup_x1
      // 273: swap
      // 274: bipush 1
      // 275: swap
      // 276: aastore
      // 277: dup_x1
      // 278: swap
      // 279: bipush 0
      // 27a: swap
      // 27b: aastore
      // 27c: ldc2_w 7886893689547536419
      // 27f: lload 5
      // 281: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 286: iload 10
      // 288: i2b
      // 289: swap
      // 28a: iload 11
      // 28c: swap
      // 28d: iload 12
      // 28f: swap
      // 290: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 293: aastore
      // 294: aload 15
      // 296: lload 5
      // 298: lconst_0
      // 299: lcmp
      // 29a: iflt 308
      // 29d: ifnull 303
      // 2a0: new com/zelix/u9
      // 2a3: dup
      // 2a4: new java/lang/StringBuilder
      // 2a7: dup
      // 2a8: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ab: sipush 4636
      // 2ae: ldc2_w 8184393065091985795
      // 2b1: lload 5
      // 2b3: lxor
      // 2b4: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/hz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bc: aload 17
      // 2be: iload 18
      // 2c0: aaload
      // 2c1: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // 2c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c7: ldc " "
      // 2c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cc: aload 2
      // 2cd: iload 18
      // 2cf: aaload
      // 2d0: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // 2d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d6: sipush 10519
      // 2d9: ldc2_w 3890302155149789834
      // 2dc: lload 5
      // 2de: lxor
      // 2df: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/hz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e7: aload 7
      // 2e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ec: ldc "'"
      // 2ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2f4: invokespecial com/zelix/u9.<init> (Ljava/lang/String;)V
      // 2f7: athrow
      // 2f8: ldc2_w 8284478870929193895
      // 2fb: lload 5
      // 2fd: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: athrow
      // 303: iinc 18 1
      // 306: aload 15
      // 308: ifnull 0e1
      // 30b: lload 5
      // 30d: lconst_0
      // 30e: lcmp
      // 30f: iflt 0e8
      // 312: aload 17
      // 314: areturn
   }

   public boolean p(loj param1, long param2, hz param4, Set param5, boolean param6, String param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hz.b J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 12576825053902
      // 00b: lxor
      // 00c: lstore 9
      // 00e: dup2
      // 00f: ldc2_w 49571666154652
      // 012: lxor
      // 013: lstore 11
      // 015: dup2
      // 016: ldc2_w 48140855318581
      // 019: lxor
      // 01a: lstore 13
      // 01c: pop2
      // 01d: ldc2_w 435346340735480538
      // 020: lload 2
      // 021: invokedynamic h (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 026: astore 15
      // 028: aload 0
      // 029: lload 9
      // 02b: aload 1
      // 02c: aload 4
      // 02e: aload 7
      // 030: invokespecial com/zelix/hz.Q (JLcom/zelix/loj;Lcom/zelix/hz;Ljava/lang/String;)Z
      // 033: aload 15
      // 035: ifnonnull 0f0
      // 038: ifeq 0ee
      // 03b: goto 048
      // 03e: ldc2_w 484700435033804773
      // 041: lload 2
      // 042: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: athrow
      // 048: aload 0
      // 049: lload 13
      // 04b: aload 1
      // 04c: aload 4
      // 04e: aload 7
      // 050: invokespecial com/zelix/hz.w (JLcom/zelix/loj;Lcom/zelix/hz;Ljava/lang/String;)Z
      // 053: aload 15
      // 055: lload 2
      // 056: lconst_0
      // 057: lcmp
      // 058: iflt 0f2
      // 05b: ifnonnull 0f0
      // 05e: goto 06b
      // 061: ldc2_w 484700435033804773
      // 064: lload 2
      // 065: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: ifeq 0ee
      // 06e: goto 07b
      // 071: ldc2_w 484700435033804773
      // 074: lload 2
      // 075: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07a: athrow
      // 07b: iload 6
      // 07d: aload 15
      // 07f: ifnonnull 114
      // 082: goto 08f
      // 085: ldc2_w 484700435033804773
      // 088: lload 2
      // 089: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: athrow
      // 08f: lload 2
      // 090: lconst_0
      // 091: lcmp
      // 092: iflt 107
      // 095: ifeq 106
      // 098: goto 0a5
      // 09b: ldc2_w 484700435033804773
      // 09e: lload 2
      // 09f: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: aload 4
      // 0a8: lload 11
      // 0aa: aload 5
      // 0ac: bipush 3
      // 0ad: anewarray 383
      // 0b0: dup_x1
      // 0b1: swap
      // 0b2: bipush 2
      // 0b3: swap
      // 0b4: aastore
      // 0b5: dup_x2
      // 0b6: dup_x2
      // 0b7: pop
      // 0b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0bb: bipush 1
      // 0bc: swap
      // 0bd: aastore
      // 0be: dup_x1
      // 0bf: swap
      // 0c0: bipush 0
      // 0c1: swap
      // 0c2: aastore
      // 0c3: ldc2_w 296626914302068478
      // 0c6: lload 2
      // 0c7: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cc: aload 15
      // 0ce: ifnonnull 114
      // 0d1: goto 0de
      // 0d4: ldc2_w 484700435033804773
      // 0d7: lload 2
      // 0d8: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: athrow
      // 0de: ifne 106
      // 0e1: goto 0ee
      // 0e4: ldc2_w 484700435033804773
      // 0e7: lload 2
      // 0e8: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: iload 8
      // 0f0: aload 15
      // 0f2: ifnonnull 114
      // 0f5: bipush -1
      // 0f6: if_icmpne 117
      // 0f9: goto 106
      // 0fc: ldc2_w 484700435033804773
      // 0ff: lload 2
      // 100: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: bipush 1
      // 107: goto 114
      // 10a: ldc2_w 484700435033804773
      // 10d: lload 2
      // 10e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: goto 118
      // 117: bipush 0
      // 118: ireturn
   }

   public boolean y(int param1, long param2) {
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
      // 05: lload 2
      // 06: bipush 32
      // 08: lshl
      // 09: bipush 32
      // 0b: lushr
      // 0c: lor
      // 0d: getstatic com/zelix/hz.b J
      // 10: lxor
      // 11: lstore 4
      // 13: ldc2_w 3718819868445820747
      // 16: lload 4
      // 18: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d: aload 0
      // 1e: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 21: arraylength
      // 22: istore 7
      // 24: bipush 0
      // 25: istore 8
      // 27: astore 6
      // 29: iload 8
      // 2b: iload 7
      // 2d: if_icmpge 73
      // 30: aload 0
      // 31: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 34: iload 8
      // 36: aaload
      // 37: invokevirtual com/zelix/v7.c ()Z
      // 3a: aload 6
      // 3c: lload 2
      // 3d: lconst_0
      // 3e: lcmp
      // 3f: ifle 47
      // 42: ifnonnull 7f
      // 45: aload 6
      // 47: ifnonnull 6a
      // 4a: goto 58
      // 4d: ldc2_w 3687128394828872308
      // 50: lload 4
      // 52: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: ifne 6b
      // 5b: goto 69
      // 5e: ldc2_w 3687128394828872308
      // 61: lload 4
      // 63: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 68: athrow
      // 69: bipush 0
      // 6a: ireturn
      // 6b: iinc 8 1
      // 6e: aload 6
      // 70: ifnull 29
      // 73: aload 0
      // 74: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 77: arraylength
      // 78: istore 8
      // 7a: iload 1
      // 7b: ifle 30
      // 7e: bipush 0
      // 7f: istore 9
      // 81: iload 9
      // 83: iload 8
      // 85: if_icmpge c9
      // 88: aload 0
      // 89: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 8c: iload 9
      // 8e: aaload
      // 8f: invokevirtual com/zelix/v7.c ()Z
      // 92: aload 6
      // 94: iload 1
      // 95: ifle 9d
      // 98: ifnonnull ce
      // 9b: aload 6
      // 9d: ifnonnull c0
      // a0: goto ae
      // a3: ldc2_w 3687128394828872308
      // a6: lload 4
      // a8: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: ifne c1
      // b1: goto bf
      // b4: ldc2_w 3687128394828872308
      // b7: lload 4
      // b9: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: athrow
      // bf: bipush 0
      // c0: ireturn
      // c1: iinc 9 1
      // c4: aload 6
      // c6: ifnull 81
      // c9: iload 1
      // ca: iflt 88
      // cd: bipush 1
      // ce: ireturn
   }

   String T(long param1, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hz.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 117861437586575
      // 0b: lxor
      // 0c: lstore 4
      // 0e: pop2
      // 0f: ldc2_w 6220589917989872259
      // 12: lload 1
      // 13: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: astore 6
      // 1a: aload 0
      // 1b: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 1e: iload 3
      // 1f: aaload
      // 20: aload 6
      // 22: ifnonnull 4d
      // 25: lload 4
      // 27: invokevirtual com/zelix/v7.i (J)Z
      // 2a: ifne de
      // 2d: goto 3a
      // 30: ldc2_w 6260936797737361340
      // 33: lload 1
      // 34: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 3e: iload 3
      // 3f: aaload
      // 40: goto 4d
      // 43: ldc2_w 6260936797737361340
      // 46: lload 1
      // 47: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: athrow
      // 4d: getstatic com/zelix/v7.L Lcom/zelix/v7;
      // 50: aload 6
      // 52: lload 1
      // 53: lconst_0
      // 54: lcmp
      // 55: iflt 89
      // 58: ifnonnull 81
      // 5b: if_acmpeq de
      // 5e: goto 6b
      // 61: ldc2_w 6260936797737361340
      // 64: lload 1
      // 65: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 6f: iload 3
      // 70: aaload
      // 71: getstatic com/zelix/v7.X Lcom/zelix/v7;
      // 74: goto 81
      // 77: ldc2_w 6260936797737361340
      // 7a: lload 1
      // 7b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 80: athrow
      // 81: lload 1
      // 82: lconst_0
      // 83: lcmp
      // 84: ifle c4
      // 87: aload 6
      // 89: ifnonnull c4
      // 8c: if_acmpeq de
      // 8f: goto 9c
      // 92: ldc2_w 6260936797737361340
      // 95: lload 1
      // 96: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9b: athrow
      // 9c: aload 0
      // 9d: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // a0: iload 3
      // a1: aaload
      // a2: aload 6
      // a4: ifnonnull da
      // a7: goto b4
      // aa: ldc2_w 6260936797737361340
      // ad: lload 1
      // ae: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b3: athrow
      // b4: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // b7: goto c4
      // ba: ldc2_w 6260936797737361340
      // bd: lload 1
      // be: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: athrow
      // c4: if_acmpeq de
      // c7: aload 0
      // c8: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // cb: iload 3
      // cc: aaload
      // cd: goto da
      // d0: ldc2_w 6260936797737361340
      // d3: lload 1
      // d4: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d9: athrow
      // da: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // dd: areturn
      // de: aconst_null
      // df: areturn
   }

   boolean I(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hz.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 114707817169433
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: ldc2_w -3444433671033314078
      // 11: lload 1
      // 12: invokedynamic h (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: aload 0
      // 18: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 1b: astore 6
      // 1d: aload 6
      // 1f: arraylength
      // 20: istore 7
      // 22: bipush 0
      // 23: istore 8
      // 25: astore 5
      // 27: iload 8
      // 29: iload 7
      // 2b: if_icmpge 7c
      // 2e: aload 6
      // 30: iload 8
      // 32: aaload
      // 33: astore 9
      // 35: aload 5
      // 37: lload 1
      // 38: lconst_0
      // 39: lcmp
      // 3a: ifle 79
      // 3d: ifnonnull 77
      // 40: aload 9
      // 42: lload 3
      // 43: invokevirtual com/zelix/v7.n (J)Z
      // 46: aload 5
      // 48: ifnonnull 8e
      // 4b: goto 58
      // 4e: ldc2_w -3422101738209076771
      // 51: lload 1
      // 52: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57: athrow
      // 58: ifeq 74
      // 5b: goto 68
      // 5e: ldc2_w -3422101738209076771
      // 61: lload 1
      // 62: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 67: athrow
      // 68: bipush 1
      // 69: ireturn
      // 6a: ldc2_w -3422101738209076771
      // 6d: lload 1
      // 6e: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: iinc 8 1
      // 77: aload 5
      // 79: ifnull 27
      // 7c: aload 0
      // 7d: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 80: astore 6
      // 82: aload 6
      // 84: arraylength
      // 85: istore 7
      // 87: lload 1
      // 88: lconst_0
      // 89: lcmp
      // 8a: iflt 90
      // 8d: bipush 0
      // 8e: istore 8
      // 90: iload 8
      // 92: iload 7
      // 94: if_icmpge ed
      // 97: aload 6
      // 99: iload 8
      // 9b: aaload
      // 9c: astore 9
      // 9e: aload 5
      // a0: lload 1
      // a1: lconst_0
      // a2: lcmp
      // a3: iflt ea
      // a6: ifnonnull e8
      // a9: aload 9
      // ab: ifnull e5
      // ae: goto bb
      // b1: ldc2_w -3422101738209076771
      // b4: lload 1
      // b5: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ba: athrow
      // bb: aload 9
      // bd: lload 3
      // be: invokevirtual com/zelix/v7.n (J)Z
      // c1: aload 5
      // c3: ifnonnull e4
      // c6: goto d3
      // c9: ldc2_w -3422101738209076771
      // cc: lload 1
      // cd: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d2: athrow
      // d3: ifeq e5
      // d6: goto e3
      // d9: ldc2_w -3422101738209076771
      // dc: lload 1
      // dd: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e2: athrow
      // e3: bipush 1
      // e4: ireturn
      // e5: iinc 8 1
      // e8: aload 5
      // ea: ifnull 90
      // ed: bipush 0
      // ee: ireturn
   }

   public v7[] X() {
      return this.n;
   }

   public hz(int param1, String param2, v7[] param3, fb param4, Set param5, int param6) {
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
      // 05: iload 6
      // 07: i2l
      // 08: bipush 32
      // 0a: lshl
      // 0b: bipush 32
      // 0d: lushr
      // 0e: lor
      // 0f: getstatic com/zelix/hz.b J
      // 12: lxor
      // 13: lstore 7
      // 15: lload 7
      // 17: dup2
      // 18: ldc2_w 109046304650490
      // 1b: lxor
      // 1c: lstore 9
      // 1e: dup2
      // 1f: ldc2_w 70198043525511
      // 22: lxor
      // 23: dup2
      // 24: bipush 56
      // 26: lushr
      // 27: l2i
      // 28: istore 11
      // 2a: dup2
      // 2b: bipush 8
      // 2d: lshl
      // 2e: bipush 32
      // 30: lushr
      // 31: l2i
      // 32: istore 12
      // 34: dup2
      // 35: bipush 40
      // 37: lshl
      // 38: bipush 40
      // 3a: lushr
      // 3b: l2i
      // 3c: istore 13
      // 3e: pop2
      // 3f: pop2
      // 40: aload 0
      // 41: invokespecial java/lang/Object.<init> ()V
      // 44: aload 0
      // 45: aload 3
      // 46: putfield com/zelix/hz.W [Lcom/zelix/v7;
      // 49: aload 0
      // 4a: bipush 1
      // 4b: lload 9
      // 4d: invokestatic com/zelix/v7.I (IJ)[Lcom/zelix/v7;
      // 50: putfield com/zelix/hz.n [Lcom/zelix/v7;
      // 53: aload 0
      // 54: aload 4
      // 56: putfield com/zelix/hz.a Lcom/zelix/fb;
      // 59: ldc2_w -276201371089106694
      // 5c: lload 7
      // 5e: invokedynamic h (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: aload 0
      // 64: aload 5
      // 66: putfield com/zelix/hz.M Ljava/util/Set;
      // 69: aload 0
      // 6a: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 6d: bipush 0
      // 6e: iload 11
      // 70: i2b
      // 71: iload 12
      // 73: iload 13
      // 75: aload 2
      // 76: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 79: aastore
      // 7a: astore 14
      // 7c: bipush 0
      // 7d: istore 15
      // 7f: iload 15
      // 81: aload 0
      // 82: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 85: arraylength
      // 86: if_icmpge c6
      // 89: aload 0
      // 8a: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 8d: iload 15
      // 8f: aload 14
      // 91: ifnonnull ba
      // 94: aaload
      // 95: ifnonnull be
      // 98: goto a6
      // 9b: ldc2_w -244860028314110523
      // 9e: lload 7
      // a0: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: athrow
      // a6: aload 0
      // a7: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // aa: iload 15
      // ac: goto ba
      // af: ldc2_w -244860028314110523
      // b2: lload 7
      // b4: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b9: athrow
      // ba: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // bd: aastore
      // be: iinc 15 1
      // c1: aload 14
      // c3: ifnull 7f
      // c6: iload 6
      // c8: ifgt 89
      // cb: return
   }

   public hz(v7[] var1, long var2) {
      var2 = b ^ var2;
      long var4 = var2 ^ 32600174582090L;
      this(var1, (fb)null, var4, null);
   }

   public iq h(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hz.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: lload 1
      // 07: dup2
      // 08: ldc2_w 22981119904707
      // 0b: lxor
      // 0c: lstore 3
      // 0d: pop2
      // 0e: ldc2_w -7184934680748529511
      // 11: lload 1
      // 12: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17: astore 5
      // 19: aload 0
      // 1a: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 1d: aload 5
      // 1f: ifnonnull 43
      // 22: ifnull 5b
      // 25: goto 32
      // 28: ldc2_w -7135581204379707994
      // 2b: lload 1
      // 2c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: athrow
      // 32: aload 0
      // 33: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 36: goto 43
      // 39: ldc2_w -7135581204379707994
      // 3c: lload 1
      // 3d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: athrow
      // 43: lload 3
      // 44: bipush 1
      // 45: anewarray 383
      // 48: dup_x2
      // 49: dup_x2
      // 4a: pop
      // 4b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4e: bipush 0
      // 4f: swap
      // 50: aastore
      // 51: ldc2_w -9207818929058335157
      // 54: lload 1
      // 55: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/iq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: areturn
      // 5b: aconst_null
      // 5c: areturn
   }

   public hz(v7[] var1, v7[] var2, Set var3, long var4) {
      var4 = b ^ var4;
      long var6 = var4 ^ 131449382169023L;
      this(var1, var2, var6, null, var3);
   }

   public static String[] f() {
      return O;
   }

   lq4 O(Object[] var1) {
      boolean var4 = (Boolean)var1[0];
      long var2 = (Long)var1[1];
      var2 = b ^ var2;
      long var5 = var2 ^ 24808445577885L;
      long var7 = var2 ^ 85357538090640L;

      try {
         if (var4) {
            return new lqv(var7, this);
         }
      } catch (n9 var9) {
         throw m44.a<"k">(var9, -8948315017291740530L, var2);
      }

      return new lqf(this, var5);
   }

   private static boolean T(Object[] param0) {
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
      // 004: checkcast com/zelix/v7
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 1
      // 012: dup
      // 013: bipush 2
      // 014: aaload
      // 015: checkcast com/zelix/v7
      // 018: astore 4
      // 01a: pop
      // 01b: getstatic com/zelix/hz.b J
      // 01e: lload 1
      // 01f: lxor
      // 020: lstore 1
      // 021: lload 1
      // 022: dup2
      // 023: ldc2_w 73035321516677
      // 026: lxor
      // 027: lstore 5
      // 029: pop2
      // 02a: ldc2_w -4654018418135381063
      // 02d: lload 1
      // 02e: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 7
      // 035: aload 3
      // 036: aload 4
      // 038: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 03b: aload 7
      // 03d: ifnonnull 06f
      // 040: ifeq 05c
      // 043: goto 050
      // 046: ldc2_w -4622606767924349306
      // 049: lload 1
      // 04a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: bipush 1
      // 051: ireturn
      // 052: ldc2_w -4622606767924349306
      // 055: lload 1
      // 056: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: aload 3
      // 05d: bipush 1
      // 05e: anewarray 383
      // 061: dup_x1
      // 062: swap
      // 063: bipush 0
      // 064: swap
      // 065: aastore
      // 066: ldc2_w -6462529761565211796
      // 069: lload 1
      // 06a: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: aload 7
      // 071: ifnonnull 0d3
      // 074: ifeq 0cc
      // 077: goto 084
      // 07a: ldc2_w -4622606767924349306
      // 07d: lload 1
      // 07e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: aload 4
      // 086: bipush 1
      // 087: anewarray 383
      // 08a: dup_x1
      // 08b: swap
      // 08c: bipush 0
      // 08d: swap
      // 08e: aastore
      // 08f: ldc2_w -6462529761565211796
      // 092: lload 1
      // 093: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: aload 7
      // 09a: lload 1
      // 09b: lconst_0
      // 09c: lcmp
      // 09d: iflt 0d5
      // 0a0: ifnonnull 0d3
      // 0a3: goto 0b0
      // 0a6: ldc2_w -4622606767924349306
      // 0a9: lload 1
      // 0aa: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: ifeq 0cc
      // 0b3: goto 0c0
      // 0b6: ldc2_w -4622606767924349306
      // 0b9: lload 1
      // 0ba: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: bipush 1
      // 0c1: ireturn
      // 0c2: ldc2_w -4622606767924349306
      // 0c5: lload 1
      // 0c6: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: aload 4
      // 0ce: ldc "F"
      // 0d0: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 0d3: aload 7
      // 0d5: lload 1
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: ifle 108
      // 0db: ifnonnull 106
      // 0de: ifeq 0ff
      // 0e1: goto 0ee
      // 0e4: ldc2_w -4622606767924349306
      // 0e7: lload 1
      // 0e8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 3
      // 0ef: ldc "I"
      // 0f1: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 0f4: ireturn
      // 0f5: ldc2_w -4622606767924349306
      // 0f8: lload 1
      // 0f9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fe: athrow
      // 0ff: aload 4
      // 101: ldc "D"
      // 103: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 106: aload 7
      // 108: lload 1
      // 109: lconst_0
      // 10a: lcmp
      // 10b: iflt 17f
      // 10e: ifnonnull 17d
      // 111: ifeq 177
      // 114: goto 121
      // 117: ldc2_w -4622606767924349306
      // 11a: lload 1
      // 11b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: athrow
      // 121: aload 3
      // 122: ldc "F"
      // 124: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 127: aload 7
      // 129: ifnonnull 172
      // 12c: goto 139
      // 12f: ldc2_w -4622606767924349306
      // 132: lload 1
      // 133: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: athrow
      // 139: ifne 171
      // 13c: goto 149
      // 13f: ldc2_w -4622606767924349306
      // 142: lload 1
      // 143: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 148: athrow
      // 149: aload 3
      // 14a: ldc "I"
      // 14c: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 14f: aload 7
      // 151: ifnonnull 172
      // 154: goto 161
      // 157: ldc2_w -4622606767924349306
      // 15a: lload 1
      // 15b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: ifeq 175
      // 164: goto 171
      // 167: ldc2_w -4622606767924349306
      // 16a: lload 1
      // 16b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: athrow
      // 171: bipush 1
      // 172: goto 176
      // 175: bipush 0
      // 176: ireturn
      // 177: aload 3
      // 178: lload 5
      // 17a: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 17d: aload 7
      // 17f: ifnonnull 1c8
      // 182: ifeq 1c7
      // 185: goto 192
      // 188: ldc2_w -4622606767924349306
      // 18b: lload 1
      // 18c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: aload 4
      // 194: lload 5
      // 196: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 199: aload 7
      // 19b: ifnonnull 1c8
      // 19e: goto 1ab
      // 1a1: ldc2_w -4622606767924349306
      // 1a4: lload 1
      // 1a5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: ifeq 1c7
      // 1ae: goto 1bb
      // 1b1: ldc2_w -4622606767924349306
      // 1b4: lload 1
      // 1b5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ba: athrow
      // 1bb: bipush 1
      // 1bc: ireturn
      // 1bd: ldc2_w -4622606767924349306
      // 1c0: lload 1
      // 1c1: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: athrow
      // 1c7: bipush 0
      // 1c8: ireturn
   }

   public static boolean n(Object[] param0) {
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
      // 004: checkcast com/zelix/v7
      // 007: astore 1
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast com/zelix/v7
      // 00e: astore 6
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast com/zelix/loj
      // 021: astore 3
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast java/lang/String
      // 028: astore 2
      // 029: pop
      // 02a: getstatic com/zelix/hz.b J
      // 02d: lload 4
      // 02f: lxor
      // 030: lstore 4
      // 032: lload 4
      // 034: dup2
      // 035: ldc2_w 58090800507824
      // 038: lxor
      // 039: lstore 7
      // 03b: dup2
      // 03c: ldc2_w 34545497530857
      // 03f: lxor
      // 040: lstore 9
      // 042: dup2
      // 043: ldc2_w 119273530802433
      // 046: lxor
      // 047: lstore 11
      // 049: dup2
      // 04a: ldc2_w 32538865894217
      // 04d: lxor
      // 04e: lstore 13
      // 050: pop2
      // 051: ldc2_w -7014984116365661579
      // 054: lload 4
      // 056: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: astore 15
      // 05d: aload 1
      // 05e: lload 13
      // 060: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 063: aload 15
      // 065: ifnonnull 15d
      // 068: ifeq 137
      // 06b: goto 079
      // 06e: ldc2_w -7055614124408744118
      // 071: lload 4
      // 073: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: athrow
      // 079: aload 6
      // 07b: lload 13
      // 07d: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 080: aload 15
      // 082: ifnonnull 15d
      // 085: goto 093
      // 088: ldc2_w -7055614124408744118
      // 08b: lload 4
      // 08d: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: ifeq 137
      // 096: goto 0a4
      // 099: ldc2_w -7055614124408744118
      // 09c: lload 4
      // 09e: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 1
      // 0a5: ldc "n"
      // 0a7: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 0aa: aload 15
      // 0ac: lload 4
      // 0ae: lconst_0
      // 0af: lcmp
      // 0b0: ifle 0ee
      // 0b3: ifnonnull 0ec
      // 0b6: goto 0c4
      // 0b9: ldc2_w -7055614124408744118
      // 0bc: lload 4
      // 0be: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c3: athrow
      // 0c4: ifeq 0e2
      // 0c7: goto 0d5
      // 0ca: ldc2_w -7055614124408744118
      // 0cd: lload 4
      // 0cf: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: athrow
      // 0d5: bipush 1
      // 0d6: ireturn
      // 0d7: ldc2_w -7055614124408744118
      // 0da: lload 4
      // 0dc: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 3
      // 0e3: aload 1
      // 0e4: lload 11
      // 0e6: aload 6
      // 0e8: aload 2
      // 0e9: invokevirtual com/zelix/loj.C (Lcom/zelix/v7;JLcom/zelix/v7;Ljava/lang/String;)Z
      // 0ec: aload 15
      // 0ee: ifnonnull 136
      // 0f1: ifeq 10f
      // 0f4: goto 102
      // 0f7: ldc2_w -7055614124408744118
      // 0fa: lload 4
      // 0fc: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: bipush 1
      // 103: ireturn
      // 104: ldc2_w -7055614124408744118
      // 107: lload 4
      // 109: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: aload 3
      // 110: aload 6
      // 112: aload 2
      // 113: lload 9
      // 115: bipush 3
      // 116: anewarray 383
      // 119: dup_x2
      // 11a: dup_x2
      // 11b: pop
      // 11c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 11f: bipush 2
      // 120: swap
      // 121: aastore
      // 122: dup_x1
      // 123: swap
      // 124: bipush 1
      // 125: swap
      // 126: aastore
      // 127: dup_x1
      // 128: swap
      // 129: bipush 0
      // 12a: swap
      // 12b: aastore
      // 12c: ldc2_w -7101025054666902537
      // 12f: lload 4
      // 131: invokedynamic p (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 136: ireturn
      // 137: aload 1
      // 138: lload 7
      // 13a: aload 6
      // 13c: bipush 3
      // 13d: anewarray 383
      // 140: dup_x1
      // 141: swap
      // 142: bipush 2
      // 143: swap
      // 144: aastore
      // 145: dup_x2
      // 146: dup_x2
      // 147: pop
      // 148: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14b: bipush 1
      // 14c: swap
      // 14d: aastore
      // 14e: dup_x1
      // 14f: swap
      // 150: bipush 0
      // 151: swap
      // 152: aastore
      // 153: ldc2_w -9149956643344677561
      // 156: lload 4
      // 158: invokedynamic o (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: ireturn
   }

   private boolean w(long param1, loj param3, hz param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hz.b J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 71193014766567
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 54277275863471
      // 012: lxor
      // 013: lstore 8
      // 015: pop2
      // 016: ldc2_w -3151418193509080941
      // 019: lload 1
      // 01a: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: aload 0
      // 020: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 023: arraylength
      // 024: istore 11
      // 026: aload 4
      // 028: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 02b: astore 12
      // 02d: astore 10
      // 02f: iload 11
      // 031: aload 10
      // 033: ifnonnull 057
      // 036: aload 12
      // 038: arraylength
      // 039: if_icmpne 2a5
      // 03c: goto 049
      // 03f: ldc2_w -3102064716473229908
      // 042: lload 1
      // 043: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: athrow
      // 049: bipush 0
      // 04a: goto 057
      // 04d: ldc2_w -3102064716473229908
      // 050: lload 1
      // 051: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 056: athrow
      // 057: istore 13
      // 059: iload 13
      // 05b: iload 11
      // 05d: if_icmpge 29d
      // 060: aload 0
      // 061: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 064: iload 13
      // 066: aaload
      // 067: aload 12
      // 069: iload 13
      // 06b: aaload
      // 06c: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 06f: aload 10
      // 071: lload 1
      // 072: lconst_0
      // 073: lcmp
      // 074: ifle 07c
      // 077: ifnonnull 2a4
      // 07a: aload 10
      // 07c: lload 1
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: iflt 0d9
      // 082: ifnonnull 0d7
      // 085: goto 092
      // 088: ldc2_w -3102064716473229908
      // 08b: lload 1
      // 08c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: athrow
      // 092: lload 1
      // 093: lconst_0
      // 094: lcmp
      // 095: ifle 0ca
      // 098: ifeq 0c0
      // 09b: goto 0a8
      // 09e: ldc2_w -3102064716473229908
      // 0a1: lload 1
      // 0a2: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a7: athrow
      // 0a8: aload 10
      // 0aa: lload 1
      // 0ab: lconst_0
      // 0ac: lcmp
      // 0ad: iflt 29a
      // 0b0: ifnull 295
      // 0b3: goto 0c0
      // 0b6: ldc2_w -3102064716473229908
      // 0b9: lload 1
      // 0ba: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: athrow
      // 0c0: aload 12
      // 0c2: iload 13
      // 0c4: aaload
      // 0c5: ldc "?"
      // 0c7: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 0ca: goto 0d7
      // 0cd: ldc2_w -3102064716473229908
      // 0d0: lload 1
      // 0d1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: athrow
      // 0d7: aload 10
      // 0d9: lload 1
      // 0da: lconst_0
      // 0db: lcmp
      // 0dc: iflt 125
      // 0df: ifnonnull 123
      // 0e2: ifeq 10a
      // 0e5: goto 0f2
      // 0e8: ldc2_w -3102064716473229908
      // 0eb: lload 1
      // 0ec: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f1: athrow
      // 0f2: aload 10
      // 0f4: lload 1
      // 0f5: lconst_0
      // 0f6: lcmp
      // 0f7: ifle 29a
      // 0fa: ifnull 295
      // 0fd: goto 10a
      // 100: ldc2_w -3102064716473229908
      // 103: lload 1
      // 104: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 10e: iload 13
      // 110: aaload
      // 111: ldc "?"
      // 113: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 116: goto 123
      // 119: ldc2_w -3102064716473229908
      // 11c: lload 1
      // 11d: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: athrow
      // 123: aload 10
      // 125: lload 1
      // 126: lconst_0
      // 127: lcmp
      // 128: ifle 158
      // 12b: ifnonnull 156
      // 12e: ifeq 14a
      // 131: goto 13e
      // 134: ldc2_w -3102064716473229908
      // 137: lload 1
      // 138: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13d: athrow
      // 13e: bipush 0
      // 13f: ireturn
      // 140: ldc2_w -3102064716473229908
      // 143: lload 1
      // 144: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 0
      // 14b: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 14e: iload 13
      // 150: aaload
      // 151: lload 8
      // 153: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 156: aload 10
      // 158: ifnonnull 294
      // 15b: ifeq 293
      // 15e: goto 16b
      // 161: ldc2_w -3102064716473229908
      // 164: lload 1
      // 165: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16a: athrow
      // 16b: aload 12
      // 16d: iload 13
      // 16f: aaload
      // 170: lload 8
      // 172: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 175: aload 10
      // 177: ifnonnull 294
      // 17a: goto 187
      // 17d: ldc2_w -3102064716473229908
      // 180: lload 1
      // 181: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 186: athrow
      // 187: ifeq 293
      // 18a: goto 197
      // 18d: ldc2_w -3102064716473229908
      // 190: lload 1
      // 191: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: aload 0
      // 198: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 19b: iload 13
      // 19d: aaload
      // 19e: invokevirtual com/zelix/v7.c ()Z
      // 1a1: aload 10
      // 1a3: lload 1
      // 1a4: lconst_0
      // 1a5: lcmp
      // 1a6: iflt 1e9
      // 1a9: ifnonnull 1e7
      // 1ac: goto 1b9
      // 1af: ldc2_w -3102064716473229908
      // 1b2: lload 1
      // 1b3: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: aload 12
      // 1bb: iload 13
      // 1bd: aaload
      // 1be: invokevirtual com/zelix/v7.c ()Z
      // 1c1: if_icmpeq 1dd
      // 1c4: goto 1d1
      // 1c7: ldc2_w -3102064716473229908
      // 1ca: lload 1
      // 1cb: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: athrow
      // 1d1: bipush 0
      // 1d2: ireturn
      // 1d3: ldc2_w -3102064716473229908
      // 1d6: lload 1
      // 1d7: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1dc: athrow
      // 1dd: aload 12
      // 1df: iload 13
      // 1e1: aaload
      // 1e2: ldc "n"
      // 1e4: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 1e7: aload 10
      // 1e9: lload 1
      // 1ea: lconst_0
      // 1eb: lcmp
      // 1ec: iflt 21c
      // 1ef: ifnonnull 21a
      // 1f2: ifeq 20e
      // 1f5: goto 202
      // 1f8: ldc2_w -3102064716473229908
      // 1fb: lload 1
      // 1fc: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 201: athrow
      // 202: bipush 0
      // 203: ireturn
      // 204: ldc2_w -3102064716473229908
      // 207: lload 1
      // 208: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20d: athrow
      // 20e: aload 0
      // 20f: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 212: iload 13
      // 214: aaload
      // 215: ldc "n"
      // 217: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 21a: aload 10
      // 21c: lload 1
      // 21d: lconst_0
      // 21e: lcmp
      // 21f: iflt 259
      // 222: ifnonnull 257
      // 225: ifeq 241
      // 228: goto 235
      // 22b: ldc2_w -3102064716473229908
      // 22e: lload 1
      // 22f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 234: athrow
      // 235: bipush 0
      // 236: ireturn
      // 237: ldc2_w -3102064716473229908
      // 23a: lload 1
      // 23b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 240: athrow
      // 241: aload 3
      // 242: aload 0
      // 243: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 246: iload 13
      // 248: aaload
      // 249: aload 12
      // 24b: iload 13
      // 24d: aaload
      // 24e: lload 6
      // 250: dup2_x1
      // 251: pop2
      // 252: aload 5
      // 254: invokevirtual com/zelix/loj.C (Lcom/zelix/v7;JLcom/zelix/v7;Ljava/lang/String;)Z
      // 257: aload 10
      // 259: ifnonnull 292
      // 25c: ifeq 284
      // 25f: goto 26c
      // 262: ldc2_w -3102064716473229908
      // 265: lload 1
      // 266: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26b: athrow
      // 26c: aload 10
      // 26e: lload 1
      // 26f: lconst_0
      // 270: lcmp
      // 271: iflt 29a
      // 274: ifnull 295
      // 277: goto 284
      // 27a: ldc2_w -3102064716473229908
      // 27d: lload 1
      // 27e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 283: athrow
      // 284: bipush 0
      // 285: goto 292
      // 288: ldc2_w -3102064716473229908
      // 28b: lload 1
      // 28c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 291: athrow
      // 292: ireturn
      // 293: bipush 0
      // 294: ireturn
      // 295: iinc 13 1
      // 298: aload 10
      // 29a: ifnull 059
      // 29d: lload 1
      // 29e: lconst_0
      // 29f: lcmp
      // 2a0: ifle 060
      // 2a3: bipush 1
      // 2a4: ireturn
      // 2a5: new com/zelix/un
      // 2a8: dup
      // 2a9: new java/lang/StringBuilder
      // 2ac: dup
      // 2ad: invokespecial java/lang/StringBuilder.<init> ()V
      // 2b0: sipush 13633
      // 2b3: ldc2_w 4294989221200556242
      // 2b6: lload 1
      // 2b7: lxor
      // 2b8: invokedynamic m (IJ)Ljava/lang/String; bsm=com/zelix/hz.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c0: iload 11
      // 2c2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2c5: ldc " "
      // 2c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ca: aload 12
      // 2cc: arraylength
      // 2cd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2d0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d3: invokespecial com/zelix/un.<init> (Ljava/lang/String;)V
      // 2d6: athrow
   }

   private boolean Q(long param1, loj param3, hz param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hz.b J
      // 003: lload 1
      // 004: lxor
      // 005: lstore 1
      // 006: lload 1
      // 007: dup2
      // 008: ldc2_w 105583281635612
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 19677495116628
      // 012: lxor
      // 013: lstore 8
      // 015: pop2
      // 016: ldc2_w -2397945381069247896
      // 019: lload 1
      // 01a: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: aload 0
      // 020: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 023: arraylength
      // 024: istore 11
      // 026: astore 10
      // 028: iload 11
      // 02a: aload 10
      // 02c: ifnonnull 226
      // 02f: aload 4
      // 031: invokevirtual com/zelix/hz.c ()I
      // 034: if_icmpne 225
      // 037: goto 044
      // 03a: ldc2_w -2447600657395148969
      // 03d: lload 1
      // 03e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 043: athrow
      // 044: bipush 0
      // 045: istore 12
      // 047: iload 12
      // 049: iload 11
      // 04b: if_icmpge 21d
      // 04e: aload 0
      // 04f: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 052: iload 12
      // 054: aaload
      // 055: aload 4
      // 057: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 05a: iload 12
      // 05c: aaload
      // 05d: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 060: aload 10
      // 062: lload 1
      // 063: lconst_0
      // 064: lcmp
      // 065: iflt 06d
      // 068: ifnonnull 224
      // 06b: aload 10
      // 06d: lload 1
      // 06e: lconst_0
      // 06f: lcmp
      // 070: ifle 0cc
      // 073: ifnonnull 0ca
      // 076: goto 083
      // 079: ldc2_w -2447600657395148969
      // 07c: lload 1
      // 07d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: lload 1
      // 084: lconst_0
      // 085: lcmp
      // 086: ifle 0bd
      // 089: ifeq 0b1
      // 08c: goto 099
      // 08f: ldc2_w -2447600657395148969
      // 092: lload 1
      // 093: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: athrow
      // 099: aload 10
      // 09b: lload 1
      // 09c: lconst_0
      // 09d: lcmp
      // 09e: ifle 21a
      // 0a1: ifnull 215
      // 0a4: goto 0b1
      // 0a7: ldc2_w -2447600657395148969
      // 0aa: lload 1
      // 0ab: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 0b5: iload 12
      // 0b7: aaload
      // 0b8: lload 8
      // 0ba: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 0bd: goto 0ca
      // 0c0: ldc2_w -2447600657395148969
      // 0c3: lload 1
      // 0c4: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: athrow
      // 0ca: aload 10
      // 0cc: ifnonnull 214
      // 0cf: ifeq 213
      // 0d2: goto 0df
      // 0d5: ldc2_w -2447600657395148969
      // 0d8: lload 1
      // 0d9: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: aload 4
      // 0e1: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 0e4: iload 12
      // 0e6: aaload
      // 0e7: lload 8
      // 0e9: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 0ec: aload 10
      // 0ee: ifnonnull 214
      // 0f1: goto 0fe
      // 0f4: ldc2_w -2447600657395148969
      // 0f7: lload 1
      // 0f8: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: athrow
      // 0fe: ifeq 213
      // 101: goto 10e
      // 104: ldc2_w -2447600657395148969
      // 107: lload 1
      // 108: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: athrow
      // 10e: aload 0
      // 10f: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 112: iload 12
      // 114: aaload
      // 115: invokevirtual com/zelix/v7.c ()Z
      // 118: aload 10
      // 11a: lload 1
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: iflt 165
      // 120: ifnonnull 163
      // 123: goto 130
      // 126: ldc2_w -2447600657395148969
      // 129: lload 1
      // 12a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aload 4
      // 132: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 135: iload 12
      // 137: aaload
      // 138: invokevirtual com/zelix/v7.c ()Z
      // 13b: if_icmpeq 157
      // 13e: goto 14b
      // 141: ldc2_w -2447600657395148969
      // 144: lload 1
      // 145: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: bipush 0
      // 14c: ireturn
      // 14d: ldc2_w -2447600657395148969
      // 150: lload 1
      // 151: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 156: athrow
      // 157: aload 0
      // 158: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 15b: iload 12
      // 15d: aaload
      // 15e: ldc "n"
      // 160: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 163: aload 10
      // 165: lload 1
      // 166: lconst_0
      // 167: lcmp
      // 168: iflt 199
      // 16b: ifnonnull 197
      // 16e: ifeq 18a
      // 171: goto 17e
      // 174: ldc2_w -2447600657395148969
      // 177: lload 1
      // 178: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: bipush 0
      // 17f: ireturn
      // 180: ldc2_w -2447600657395148969
      // 183: lload 1
      // 184: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 189: athrow
      // 18a: aload 4
      // 18c: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 18f: iload 12
      // 191: aaload
      // 192: ldc "n"
      // 194: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 197: aload 10
      // 199: lload 1
      // 19a: lconst_0
      // 19b: lcmp
      // 19c: ifle 1d9
      // 19f: ifnonnull 1d7
      // 1a2: ifeq 1be
      // 1a5: goto 1b2
      // 1a8: ldc2_w -2447600657395148969
      // 1ab: lload 1
      // 1ac: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b1: athrow
      // 1b2: bipush 0
      // 1b3: ireturn
      // 1b4: ldc2_w -2447600657395148969
      // 1b7: lload 1
      // 1b8: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bd: athrow
      // 1be: aload 3
      // 1bf: aload 0
      // 1c0: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 1c3: iload 12
      // 1c5: aaload
      // 1c6: aload 4
      // 1c8: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 1cb: iload 12
      // 1cd: aaload
      // 1ce: lload 6
      // 1d0: dup2_x1
      // 1d1: pop2
      // 1d2: aload 5
      // 1d4: invokevirtual com/zelix/loj.C (Lcom/zelix/v7;JLcom/zelix/v7;Ljava/lang/String;)Z
      // 1d7: aload 10
      // 1d9: ifnonnull 212
      // 1dc: ifeq 204
      // 1df: goto 1ec
      // 1e2: ldc2_w -2447600657395148969
      // 1e5: lload 1
      // 1e6: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1eb: athrow
      // 1ec: aload 10
      // 1ee: lload 1
      // 1ef: lconst_0
      // 1f0: lcmp
      // 1f1: ifle 21a
      // 1f4: ifnull 215
      // 1f7: goto 204
      // 1fa: ldc2_w -2447600657395148969
      // 1fd: lload 1
      // 1fe: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: athrow
      // 204: bipush 0
      // 205: goto 212
      // 208: ldc2_w -2447600657395148969
      // 20b: lload 1
      // 20c: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 211: athrow
      // 212: ireturn
      // 213: bipush 0
      // 214: ireturn
      // 215: iinc 12 1
      // 218: aload 10
      // 21a: ifnull 047
      // 21d: lload 1
      // 21e: lconst_0
      // 21f: lcmp
      // 220: iflt 04e
      // 223: bipush 1
      // 224: ireturn
      // 225: bipush 0
      // 226: ireturn
   }

   public hz h(loj param1, hz param2, zr param3, String param4, long param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/hz.b J
      // 003: lload 5
      // 005: lxor
      // 006: lstore 5
      // 008: lload 5
      // 00a: dup2
      // 00b: ldc2_w 21226707591793
      // 00e: lxor
      // 00f: lstore 7
      // 011: dup2
      // 012: ldc2_w 107038038020466
      // 015: lxor
      // 016: dup2
      // 017: bipush 32
      // 019: lushr
      // 01a: l2i
      // 01b: istore 9
      // 01d: dup2
      // 01e: bipush 32
      // 020: lshl
      // 021: bipush 48
      // 023: lushr
      // 024: l2i
      // 025: istore 10
      // 027: dup2
      // 028: bipush 48
      // 02a: lshl
      // 02b: bipush 48
      // 02d: lushr
      // 02e: l2i
      // 02f: istore 11
      // 031: pop2
      // 032: dup2
      // 033: ldc2_w 9218019981945
      // 036: lxor
      // 037: lstore 12
      // 039: dup2
      // 03a: ldc2_w 17466785661362
      // 03d: lxor
      // 03e: lstore 14
      // 040: pop2
      // 041: new com/zelix/zr
      // 044: dup
      // 045: invokespecial com/zelix/zr.<init> ()V
      // 048: astore 17
      // 04a: new com/zelix/zr
      // 04d: dup
      // 04e: invokespecial com/zelix/zr.<init> ()V
      // 051: astore 18
      // 053: ldc2_w 4777663528980362909
      // 056: lload 5
      // 058: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: aload 1
      // 05e: aload 0
      // 05f: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 062: aload 2
      // 063: getfield com/zelix/hz.n [Lcom/zelix/v7;
      // 066: bipush 1
      // 067: aload 17
      // 069: lload 12
      // 06b: aload 4
      // 06d: invokestatic com/zelix/hz.Z (Lcom/zelix/loj;[Lcom/zelix/v7;[Lcom/zelix/v7;ZLcom/zelix/zr;JLjava/lang/String;)[Lcom/zelix/v7;
      // 070: astore 19
      // 072: iload 9
      // 074: aload 1
      // 075: aload 0
      // 076: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 079: aload 2
      // 07a: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 07d: iload 10
      // 07f: i2c
      // 080: bipush 1
      // 081: iload 11
      // 083: i2s
      // 084: aload 18
      // 086: aload 4
      // 088: invokestatic com/zelix/hz.z (ILcom/zelix/loj;[Lcom/zelix/v7;[Lcom/zelix/v7;CZSLcom/zelix/zr;Ljava/lang/String;)[Lcom/zelix/v7;
      // 08b: astore 20
      // 08d: astore 16
      // 08f: aload 3
      // 090: aload 17
      // 092: invokevirtual com/zelix/zr.S ()Z
      // 095: aload 16
      // 097: ifnonnull 0d5
      // 09a: ifne 0d4
      // 09d: goto 0ab
      // 0a0: ldc2_w 4827017538322926498
      // 0a3: lload 5
      // 0a5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: aload 18
      // 0ad: invokevirtual com/zelix/zr.S ()Z
      // 0b0: aload 16
      // 0b2: ifnonnull 0d5
      // 0b5: goto 0c3
      // 0b8: ldc2_w 4827017538322926498
      // 0bb: lload 5
      // 0bd: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c2: athrow
      // 0c3: ifeq 0d8
      // 0c6: goto 0d4
      // 0c9: ldc2_w 4827017538322926498
      // 0cc: lload 5
      // 0ce: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: bipush 1
      // 0d5: goto 0d9
      // 0d8: bipush 0
      // 0d9: invokevirtual com/zelix/zr.I (Z)V
      // 0dc: new java/util/LinkedHashSet
      // 0df: dup
      // 0e0: invokespecial java/util/LinkedHashSet.<init> ()V
      // 0e3: astore 21
      // 0e5: aload 0
      // 0e6: getfield com/zelix/hz.M Ljava/util/Set;
      // 0e9: lload 5
      // 0eb: lconst_0
      // 0ec: lcmp
      // 0ed: iflt 124
      // 0f0: aload 16
      // 0f2: ifnonnull 124
      // 0f5: ifnull 120
      // 0f8: goto 106
      // 0fb: ldc2_w 4827017538322926498
      // 0fe: lload 5
      // 100: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: athrow
      // 106: aload 21
      // 108: aload 0
      // 109: getfield com/zelix/hz.M Ljava/util/Set;
      // 10c: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 111: pop
      // 112: goto 120
      // 115: ldc2_w 4827017538322926498
      // 118: lload 5
      // 11a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11f: athrow
      // 120: aload 2
      // 121: getfield com/zelix/hz.M Ljava/util/Set;
      // 124: ifnull 141
      // 127: aload 21
      // 129: aload 2
      // 12a: getfield com/zelix/hz.M Ljava/util/Set;
      // 12d: invokeinterface java/util/Set.addAll (Ljava/util/Collection;)Z 2
      // 132: pop
      // 133: goto 141
      // 136: ldc2_w 4827017538322926498
      // 139: lload 5
      // 13b: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: aload 21
      // 143: lload 5
      // 145: lconst_0
      // 146: lcmp
      // 147: iflt 177
      // 14a: aload 16
      // 14c: ifnonnull 177
      // 14f: invokeinterface java/util/Set.size ()I 1
      // 154: ifle 1b5
      // 157: goto 165
      // 15a: ldc2_w 4827017538322926498
      // 15d: lload 5
      // 15f: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: aload 0
      // 166: getfield com/zelix/hz.M Ljava/util/Set;
      // 169: goto 177
      // 16c: ldc2_w 4827017538322926498
      // 16f: lload 5
      // 171: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 176: athrow
      // 177: ifnull 196
      // 17a: aload 21
      // 17c: aload 0
      // 17d: getfield com/zelix/hz.M Ljava/util/Set;
      // 180: invokeinterface java/util/Set.equals (Ljava/lang/Object;)Z 2
      // 185: ifne 1b8
      // 188: goto 196
      // 18b: ldc2_w 4827017538322926498
      // 18e: lload 5
      // 190: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: athrow
      // 196: aload 3
      // 197: bipush 1
      // 198: invokevirtual com/zelix/zr.I (Z)V
      // 19b: lload 5
      // 19d: lconst_0
      // 19e: lcmp
      // 19f: iflt 1b8
      // 1a2: aload 16
      // 1a4: ifnull 1b8
      // 1a7: goto 1b5
      // 1aa: ldc2_w 4827017538322926498
      // 1ad: lload 5
      // 1af: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b4: athrow
      // 1b5: aconst_null
      // 1b6: astore 21
      // 1b8: aload 0
      // 1b9: aload 16
      // 1bb: ifnonnull 2cb
      // 1be: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 1c1: ifnull 2ae
      // 1c4: goto 1d2
      // 1c7: ldc2_w 4827017538322926498
      // 1ca: lload 5
      // 1cc: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: aload 2
      // 1d3: aload 16
      // 1d5: ifnonnull 2cb
      // 1d8: goto 1e6
      // 1db: ldc2_w 4827017538322926498
      // 1de: lload 5
      // 1e0: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: athrow
      // 1e6: lload 5
      // 1e8: lconst_0
      // 1e9: lcmp
      // 1ea: iflt 2bd
      // 1ed: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 1f0: ifnull 2ae
      // 1f3: goto 201
      // 1f6: ldc2_w 4827017538322926498
      // 1f9: lload 5
      // 1fb: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 200: athrow
      // 201: aload 0
      // 202: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 205: aload 16
      // 207: ifnonnull 27f
      // 20a: goto 218
      // 20d: ldc2_w 4827017538322926498
      // 210: lload 5
      // 212: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 217: athrow
      // 218: aload 2
      // 219: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 21c: invokevirtual com/zelix/fb.equals (Ljava/lang/Object;)Z
      // 21f: ifeq 260
      // 222: goto 230
      // 225: ldc2_w 4827017538322926498
      // 228: lload 5
      // 22a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22f: athrow
      // 230: new com/zelix/hz
      // 233: dup
      // 234: aload 19
      // 236: aload 20
      // 238: aload 0
      // 239: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 23c: ldc2_w 4919361907068886006
      // 23f: lload 5
      // 241: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: lload 7
      // 248: dup2_x1
      // 249: pop2
      // 24a: checkcast com/zelix/fb
      // 24d: aload 21
      // 24f: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 252: astore 22
      // 254: aload 16
      // 256: lload 5
      // 258: lconst_0
      // 259: lcmp
      // 25a: iflt 26e
      // 25d: ifnull 2cd
      // 260: aload 0
      // 261: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 264: ldc2_w 4919361907068886006
      // 267: lload 5
      // 269: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26e: checkcast com/zelix/fb
      // 271: goto 27f
      // 274: ldc2_w 4827017538322926498
      // 277: lload 5
      // 279: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27e: athrow
      // 27f: astore 23
      // 281: aload 23
      // 283: aload 2
      // 284: getfield com/zelix/hz.a Lcom/zelix/fb;
      // 287: invokevirtual com/zelix/fb.or (Ljava/util/BitSet;)V
      // 28a: new com/zelix/hz
      // 28d: dup
      // 28e: aload 19
      // 290: aload 20
      // 292: lload 7
      // 294: aload 23
      // 296: aload 21
      // 298: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;JLcom/zelix/fb;Ljava/util/Set;)V
      // 29b: lload 5
      // 29d: lconst_0
      // 29e: lcmp
      // 29f: ifle 2bd
      // 2a2: astore 22
      // 2a4: aload 3
      // 2a5: bipush 1
      // 2a6: invokevirtual com/zelix/zr.I (Z)V
      // 2a9: aload 16
      // 2ab: ifnull 2cd
      // 2ae: new com/zelix/hz
      // 2b1: dup
      // 2b2: aload 19
      // 2b4: aload 20
      // 2b6: aload 21
      // 2b8: lload 14
      // 2ba: invokespecial com/zelix/hz.<init> ([Lcom/zelix/v7;[Lcom/zelix/v7;Ljava/util/Set;J)V
      // 2bd: goto 2cb
      // 2c0: ldc2_w 4827017538322926498
      // 2c3: lload 5
      // 2c5: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ca: athrow
      // 2cb: astore 22
      // 2cd: aload 22
      // 2cf: areturn
   }

   private boolean a(Object[] param1) {
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
      // 004: checkcast com/zelix/hz
      // 007: astore 3
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 4
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/util/Set
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/hz.b J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: aload 0
      // 024: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 027: astore 7
      // 029: ldc2_w 1795510205982305338
      // 02c: lload 4
      // 02e: invokedynamic h (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: aload 7
      // 035: arraylength
      // 036: istore 8
      // 038: bipush 0
      // 039: istore 9
      // 03b: astore 6
      // 03d: iload 9
      // 03f: iload 8
      // 041: if_icmpge 098
      // 044: aload 7
      // 046: iload 9
      // 048: aaload
      // 049: astore 10
      // 04b: aload 6
      // 04d: lload 4
      // 04f: lconst_0
      // 050: lcmp
      // 051: ifle 095
      // 054: ifnonnull 093
      // 057: aload 2
      // 058: aload 10
      // 05a: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 05f: aload 6
      // 061: ifnonnull 0ab
      // 064: goto 072
      // 067: ldc2_w 1754792305892446469
      // 06a: lload 4
      // 06c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: ifeq 090
      // 075: goto 083
      // 078: ldc2_w 1754792305892446469
      // 07b: lload 4
      // 07d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 082: athrow
      // 083: bipush 0
      // 084: ireturn
      // 085: ldc2_w 1754792305892446469
      // 088: lload 4
      // 08a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: athrow
      // 090: iinc 9 1
      // 093: aload 6
      // 095: ifnull 03d
      // 098: aload 3
      // 099: invokevirtual com/zelix/hz.X ()[Lcom/zelix/v7;
      // 09c: astore 7
      // 09e: aload 7
      // 0a0: arraylength
      // 0a1: istore 8
      // 0a3: lload 4
      // 0a5: lconst_0
      // 0a6: lcmp
      // 0a7: iflt 0ad
      // 0aa: bipush 0
      // 0ab: istore 9
      // 0ad: iload 9
      // 0af: iload 8
      // 0b1: if_icmpge 108
      // 0b4: aload 7
      // 0b6: iload 9
      // 0b8: aaload
      // 0b9: astore 10
      // 0bb: aload 6
      // 0bd: lload 4
      // 0bf: lconst_0
      // 0c0: lcmp
      // 0c1: iflt 105
      // 0c4: ifnonnull 103
      // 0c7: aload 2
      // 0c8: aload 10
      // 0ca: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 0cf: aload 6
      // 0d1: ifnonnull 1af
      // 0d4: goto 0e2
      // 0d7: ldc2_w 1754792305892446469
      // 0da: lload 4
      // 0dc: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: ifeq 100
      // 0e5: goto 0f3
      // 0e8: ldc2_w 1754792305892446469
      // 0eb: lload 4
      // 0ed: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f2: athrow
      // 0f3: bipush 0
      // 0f4: ireturn
      // 0f5: ldc2_w 1754792305892446469
      // 0f8: lload 4
      // 0fa: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: iinc 9 1
      // 103: aload 6
      // 105: ifnull 0ad
      // 108: aload 0
      // 109: getfield com/zelix/hz.M Ljava/util/Set;
      // 10c: aload 6
      // 10e: ifnonnull 162
      // 111: ifnonnull 15e
      // 114: goto 122
      // 117: ldc2_w 1754792305892446469
      // 11a: lload 4
      // 11c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: aload 3
      // 123: getfield com/zelix/hz.M Ljava/util/Set;
      // 126: aload 6
      // 128: lload 4
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: ifle 164
      // 12f: ifnonnull 162
      // 132: goto 140
      // 135: ldc2_w 1754792305892446469
      // 138: lload 4
      // 13a: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: athrow
      // 140: ifnonnull 15e
      // 143: goto 151
      // 146: ldc2_w 1754792305892446469
      // 149: lload 4
      // 14b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: athrow
      // 151: bipush 1
      // 152: ireturn
      // 153: ldc2_w 1754792305892446469
      // 156: lload 4
      // 158: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: athrow
      // 15e: aload 0
      // 15f: getfield com/zelix/hz.M Ljava/util/Set;
      // 162: aload 6
      // 164: lload 4
      // 166: lconst_0
      // 167: lcmp
      // 168: ifle 193
      // 16b: ifnonnull 191
      // 16e: ifnull 1ae
      // 171: goto 17f
      // 174: ldc2_w 1754792305892446469
      // 177: lload 4
      // 179: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: athrow
      // 17f: aload 3
      // 180: getfield com/zelix/hz.M Ljava/util/Set;
      // 183: goto 191
      // 186: ldc2_w 1754792305892446469
      // 189: lload 4
      // 18b: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 190: athrow
      // 191: aload 6
      // 193: lload 4
      // 195: lconst_0
      // 196: lcmp
      // 197: ifle 1b6
      // 19a: ifnonnull 1b4
      // 19d: ifnonnull 1b0
      // 1a0: goto 1ae
      // 1a3: ldc2_w 1754792305892446469
      // 1a6: lload 4
      // 1a8: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: athrow
      // 1ae: bipush 0
      // 1af: ireturn
      // 1b0: aload 0
      // 1b1: getfield com/zelix/hz.M Ljava/util/Set;
      // 1b4: aload 6
      // 1b6: ifnonnull 1e9
      // 1b9: invokeinterface java/util/Set.size ()I 1
      // 1be: aload 3
      // 1bf: getfield com/zelix/hz.M Ljava/util/Set;
      // 1c2: invokeinterface java/util/Set.size ()I 1
      // 1c7: if_icmpeq 1e5
      // 1ca: goto 1d8
      // 1cd: ldc2_w 1754792305892446469
      // 1d0: lload 4
      // 1d2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: bipush 0
      // 1d9: ireturn
      // 1da: ldc2_w 1754792305892446469
      // 1dd: lload 4
      // 1df: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: getfield com/zelix/hz.M Ljava/util/Set;
      // 1e9: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1ee: astore 7
      // 1f0: aload 7
      // 1f2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f7: ifeq 256
      // 1fa: aload 7
      // 1fc: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 201: checkcast com/zelix/o3
      // 204: astore 8
      // 206: aload 3
      // 207: getfield com/zelix/hz.M Ljava/util/Set;
      // 20a: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 20f: astore 9
      // 211: aload 9
      // 213: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 218: ifeq 24d
      // 21b: aload 9
      // 21d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 222: checkcast com/zelix/o3
      // 225: astore 10
      // 227: aload 8
      // 229: aload 10
      // 22b: if_acmpne 248
      // 22e: aload 6
      // 230: ifnull 1f0
      // 233: lload 4
      // 235: lconst_0
      // 236: lcmp
      // 237: iflt 206
      // 23a: goto 248
      // 23d: ldc2_w 1754792305892446469
      // 240: lload 4
      // 242: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: athrow
      // 248: aload 6
      // 24a: ifnull 211
      // 24d: bipush 0
      // 24e: lload 4
      // 250: lconst_0
      // 251: lcmp
      // 252: ifle 1f7
      // 255: ireturn
      // 256: bipush 1
      // 257: ireturn
   }

   public o3 Z(Object[] param1) {
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
      // 0e: checkcast com/zelix/o3
      // 11: astore 4
      // 13: pop
      // 14: getstatic com/zelix/hz.b J
      // 17: lload 2
      // 18: lxor
      // 19: lstore 2
      // 1a: ldc2_w -6779134374182300357
      // 1d: lload 2
      // 1e: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: astore 5
      // 25: aload 0
      // 26: getfield com/zelix/hz.M Ljava/util/Set;
      // 29: aload 5
      // 2b: ifnonnull 5a
      // 2e: ifnonnull 56
      // 31: goto 3e
      // 34: ldc2_w -6819852268232349692
      // 37: lload 2
      // 38: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d: athrow
      // 3e: aload 0
      // 3f: new java/util/LinkedHashSet
      // 42: dup
      // 43: invokespecial java/util/LinkedHashSet.<init> ()V
      // 46: putfield com/zelix/hz.M Ljava/util/Set;
      // 49: goto 56
      // 4c: ldc2_w -6819852268232349692
      // 4f: lload 2
      // 50: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: athrow
      // 56: aload 0
      // 57: getfield com/zelix/hz.M Ljava/util/Set;
      // 5a: aload 4
      // 5c: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 61: pop
      // 62: aload 4
      // 64: areturn
   }

   public hz(v7[] var1, fb var2, long var3, Set var5) {
      var3 = b ^ var3;
      long var6 = var3 ^ 120418415854908L;
      long var8 = var3 ^ 11115644808656L;
      this(v7.I(0, var8), var1, var6, var2, var5);
   }

   public static boolean U(v7 param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hz.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -2913631435595832512
      // 09: lload 1
      // 0a: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 3
      // 10: aload 0
      // 11: ldc "["
      // 13: invokevirtual com/zelix/v7.o (Ljava/lang/String;)Z
      // 16: aload 3
      // 17: ifnonnull ac
      // 1a: ifne ab
      // 1d: goto 2a
      // 20: ldc2_w -2945324540227412353
      // 23: lload 1
      // 24: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: ldc "L"
      // 2d: invokevirtual com/zelix/v7.o (Ljava/lang/String;)Z
      // 30: aload 3
      // 31: lload 1
      // 32: lconst_0
      // 33: lcmp
      // 34: ifle 98
      // 37: ifnonnull 97
      // 3a: goto 47
      // 3d: ldc2_w -2945324540227412353
      // 40: lload 1
      // 41: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: lload 1
      // 48: lconst_0
      // 49: lcmp
      // 4a: iflt 8a
      // 4d: ifeq 84
      // 50: goto 5d
      // 53: ldc2_w -2945324540227412353
      // 56: lload 1
      // 57: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: athrow
      // 5d: aload 0
      // 5e: ldc ";"
      // 60: invokevirtual com/zelix/v7.T (Ljava/lang/String;)Z
      // 63: aload 3
      // 64: ifnonnull ac
      // 67: goto 74
      // 6a: ldc2_w -2945324540227412353
      // 6d: lload 1
      // 6e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: athrow
      // 74: ifne ab
      // 77: goto 84
      // 7a: ldc2_w -2945324540227412353
      // 7d: lload 1
      // 7e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: aload 0
      // 85: ldc "n"
      // 87: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 8a: goto 97
      // 8d: ldc2_w -2945324540227412353
      // 90: lload 1
      // 91: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 96: athrow
      // 97: aload 3
      // 98: ifnonnull ac
      // 9b: ifeq af
      // 9e: goto ab
      // a1: ldc2_w -2945324540227412353
      // a4: lload 1
      // a5: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // aa: athrow
      // ab: bipush 1
      // ac: goto b0
      // af: bipush 0
      // b0: ireturn
   }

   public static boolean X(Object[] var0) {
      long var1 = (Long)var0[0];
      v7 var3 = (v7)var0[1];
      var1 = b ^ var1;
      String[] var4 = m44.a<"o">(-5823776389693613059L, var1);

      v7 var10000;
      label33: {
         try {
            var10000 = var3;
            if (var4 != null) {
               break label33;
            }

            if (var3 == null) {
               return true;
            }
         } catch (n9 var6) {
            throw m44.a<"o">(var6, -5792364211759323454L, var1);
         }

         var10000 = var3;
      }

      try {
         boolean var8 = var10000.y("?");
         if (var4 != null) {
            return var8;
         }

         if (var8) {
            return true;
         }
      } catch (n9 var5) {
         throw m44.a<"o">(var5, -5792364211759323454L, var1);
      }

      return false;
   }

   public o3 Q(Object[] param1) {
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
      // 004: checkcast com/zelix/i7
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/hz.b J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 129336339443642
      // 01f: lxor
      // 020: lstore 5
      // 022: pop2
      // 023: ldc2_w -1203714022826108005
      // 026: lload 2
      // 027: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02c: astore 7
      // 02e: aload 0
      // 02f: getfield com/zelix/hz.M Ljava/util/Set;
      // 032: aload 7
      // 034: ifnonnull 058
      // 037: ifnull 197
      // 03a: goto 047
      // 03d: ldc2_w -1154287975443716444
      // 040: lload 2
      // 041: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 046: athrow
      // 047: aload 0
      // 048: getfield com/zelix/hz.M Ljava/util/Set;
      // 04b: goto 058
      // 04e: ldc2_w -1154287975443716444
      // 051: lload 2
      // 052: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: athrow
      // 058: invokeinterface java/util/Set.size ()I 1
      // 05d: aload 7
      // 05f: ifnonnull 088
      // 062: ifle 197
      // 065: goto 072
      // 068: ldc2_w -1154287975443716444
      // 06b: lload 2
      // 06c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: athrow
      // 072: aload 0
      // 073: getfield com/zelix/hz.M Ljava/util/Set;
      // 076: invokeinterface java/util/Set.size ()I 1
      // 07b: goto 088
      // 07e: ldc2_w -1154287975443716444
      // 081: lload 2
      // 082: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: athrow
      // 088: istore 8
      // 08a: bipush -1
      // 08b: istore 9
      // 08d: aconst_null
      // 08e: astore 10
      // 090: aload 0
      // 091: getfield com/zelix/hz.M Ljava/util/Set;
      // 094: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 099: astore 11
      // 09b: aload 11
      // 09d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a2: ifeq 15e
      // 0a5: iinc 9 1
      // 0a8: aload 11
      // 0aa: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0af: checkcast com/zelix/o3
      // 0b2: astore 12
      // 0b4: aload 12
      // 0b6: aload 7
      // 0b8: lload 2
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: ifle 0c3
      // 0be: ifnonnull 196
      // 0c1: aload 7
      // 0c3: ifnonnull 124
      // 0c6: goto 0d3
      // 0c9: ldc2_w -1154287975443716444
      // 0cc: lload 2
      // 0cd: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: athrow
      // 0d3: lload 5
      // 0d5: bipush 1
      // 0d6: anewarray 383
      // 0d9: dup_x2
      // 0da: dup_x2
      // 0db: pop
      // 0dc: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0df: bipush 0
      // 0e0: swap
      // 0e1: aastore
      // 0e2: ldc2_w -1402461672226261218
      // 0e5: lload 2
      // 0e6: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: aload 4
      // 0ed: lload 5
      // 0ef: bipush 1
      // 0f0: anewarray 383
      // 0f3: dup_x2
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f9: bipush 0
      // 0fa: swap
      // 0fb: aastore
      // 0fc: ldc2_w -1402461672226261218
      // 0ff: lload 2
      // 100: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/v7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 105: if_acmpne 138
      // 108: goto 115
      // 10b: ldc2_w -1154287975443716444
      // 10e: lload 2
      // 10f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 114: athrow
      // 115: aload 12
      // 117: goto 124
      // 11a: ldc2_w -1154287975443716444
      // 11d: lload 2
      // 11e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 123: athrow
      // 124: astore 10
      // 126: aload 11
      // 128: invokeinterface java/util/Iterator.remove ()V 1
      // 12d: lload 2
      // 12e: lconst_0
      // 12f: lcmp
      // 130: iflt 15e
      // 133: aload 7
      // 135: ifnull 15e
      // 138: iload 9
      // 13a: iload 8
      // 13c: bipush 1
      // 13d: isub
      // 13e: if_icmpne 159
      // 141: goto 14e
      // 144: ldc2_w -1154287975443716444
      // 147: lload 2
      // 148: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: athrow
      // 14e: aload 12
      // 150: astore 10
      // 152: aload 11
      // 154: invokeinterface java/util/Iterator.remove ()V 1
      // 159: aload 7
      // 15b: ifnull 09b
      // 15e: aload 0
      // 15f: lload 2
      // 160: lconst_0
      // 161: lcmp
      // 162: ifle 0af
      // 165: aload 7
      // 167: ifnonnull 190
      // 16a: getfield com/zelix/hz.M Ljava/util/Set;
      // 16d: invokeinterface java/util/Set.size ()I 1
      // 172: ifne 194
      // 175: goto 182
      // 178: ldc2_w -1154287975443716444
      // 17b: lload 2
      // 17c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: athrow
      // 182: aload 0
      // 183: goto 190
      // 186: ldc2_w -1154287975443716444
      // 189: lload 2
      // 18a: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: aconst_null
      // 191: putfield com/zelix/hz.M Ljava/util/Set;
      // 194: aload 10
      // 196: areturn
      // 197: aconst_null
      // 198: areturn
   }

   private static v7[] e(Object[] param0) {
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
      // 04: checkcast com/zelix/loj
      // 07: astore 7
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast [Lcom/zelix/v7;
      // 0f: astore 4
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast [Lcom/zelix/v7;
      // 17: astore 5
      // 19: dup
      // 1a: bipush 3
      // 1b: aaload
      // 1c: checkcast com/zelix/fb
      // 1f: astore 1
      // 20: dup
      // 21: bipush 4
      // 22: aaload
      // 23: checkcast java/lang/Long
      // 26: invokevirtual java/lang/Long.longValue ()J
      // 29: lstore 2
      // 2a: dup
      // 2b: bipush 5
      // 2c: aaload
      // 2d: checkcast com/zelix/zr
      // 30: astore 6
      // 32: pop
      // 33: getstatic com/zelix/hz.b J
      // 36: lload 2
      // 37: lxor
      // 38: lstore 2
      // 39: ldc2_w -8628681401289311088
      // 3c: lload 2
      // 3d: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42: aload 4
      // 44: arraylength
      // 45: istore 9
      // 47: aload 4
      // 49: invokevirtual [Lcom/zelix/v7;.clone ()Ljava/lang/Object;
      // 4c: checkcast [Lcom/zelix/v7;
      // 4f: astore 10
      // 51: astore 8
      // 53: aload 6
      // 55: bipush 0
      // 56: invokevirtual com/zelix/zr.I (Z)V
      // 59: aload 1
      // 5a: ifnull d5
      // 5d: bipush 0
      // 5e: istore 11
      // 60: iload 11
      // 62: iload 9
      // 64: if_icmpge d5
      // 67: aload 5
      // 69: aload 8
      // 6b: ifnonnull d7
      // 6e: iload 11
      // 70: aaload
      // 71: aload 10
      // 73: iload 11
      // 75: aaload
      // 76: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 79: lload 2
      // 7a: lconst_0
      // 7b: lcmp
      // 7c: iflt ad
      // 7f: aload 8
      // 81: ifnonnull ad
      // 84: goto 91
      // 87: ldc2_w -8579239979395956305
      // 8a: lload 2
      // 8b: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 90: athrow
      // 91: ifeq a7
      // 94: goto a1
      // 97: ldc2_w -8579239979395956305
      // 9a: lload 2
      // 9b: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: lload 2
      // a2: lconst_0
      // a3: lcmp
      // a4: ifgt cd
      // a7: aload 1
      // a8: iload 11
      // aa: invokevirtual com/zelix/fb.get (I)Z
      // ad: ifeq cd
      // b0: aload 6
      // b2: bipush 1
      // b3: invokevirtual com/zelix/zr.I (Z)V
      // b6: aload 10
      // b8: iload 11
      // ba: aload 5
      // bc: iload 11
      // be: aaload
      // bf: aastore
      // c0: goto cd
      // c3: ldc2_w -8579239979395956305
      // c6: lload 2
      // c7: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: athrow
      // cd: iinc 11 1
      // d0: aload 8
      // d2: ifnull 60
      // d5: aload 10
      // d7: areturn
   }

   public final int c() {
      return this.n.length;
   }

   public static boolean I(v7 param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hz.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w -4150439576793894218
      // 09: lload 1
      // 0a: invokedynamic l (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 3
      // 10: aload 0
      // 11: ldc "J"
      // 13: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 16: aload 3
      // 17: ifnonnull 52
      // 1a: ifne 51
      // 1d: goto 2a
      // 20: ldc2_w -4119099882351030391
      // 23: lload 1
      // 24: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29: athrow
      // 2a: aload 0
      // 2b: ldc "D"
      // 2d: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 30: aload 3
      // 31: ifnonnull 52
      // 34: goto 41
      // 37: ldc2_w -4119099882351030391
      // 3a: lload 1
      // 3b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: athrow
      // 41: ifeq 55
      // 44: goto 51
      // 47: ldc2_w -4119099882351030391
      // 4a: lload 1
      // 4b: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
   }

   public int M(int var1, int var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 105618325931714L;
      String[] var10000 = m44.a<"k">(-5345233077066645247L, var4);
      int var9 = 0;
      v7[] var10 = this.n;
      int var11 = var10.length;
      int var12 = 0;
      String[] var8 = var10000;

      while (true) {
         if (var12 < var11) {
            v7 var13 = var10[var12];
            if (var1 >= 0) {
               var14 = var9 + var13.C(var6);
               if (var8 != null) {
                  break;
               }

               var9 = var14;
               var12++;
            }

            if (var8 == null) {
               continue;
            }
         }

         var14 = var9;
         break;
      }

      return var14;
   }

   public v7[] r(Object[] param1) {
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
      // 00c: getstatic com/zelix/hz.b J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: ldc2_w 4046180432538881270
      // 015: lload 2
      // 016: invokedynamic l (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: astore 4
      // 01d: aload 0
      // 01e: aload 4
      // 020: ifnonnull 147
      // 023: getfield com/zelix/hz.K Ljava/util/BitSet;
      // 026: ifnull 146
      // 029: goto 036
      // 02c: ldc2_w 4077520044886258121
      // 02f: lload 2
      // 030: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: athrow
      // 036: aload 0
      // 037: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 03a: arraylength
      // 03b: anewarray 237
      // 03e: astore 5
      // 040: bipush 0
      // 041: istore 6
      // 043: iload 6
      // 045: aload 0
      // 046: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 049: arraylength
      // 04a: if_icmpge 13d
      // 04d: aload 0
      // 04e: aload 4
      // 050: ifnonnull 109
      // 053: getfield com/zelix/hz.K Ljava/util/BitSet;
      // 056: iload 6
      // 058: invokevirtual java/util/BitSet.get (I)Z
      // 05b: ifne 0fb
      // 05e: goto 06b
      // 061: ldc2_w 4077520044886258121
      // 064: lload 2
      // 065: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 06f: iload 6
      // 071: aaload
      // 072: aload 4
      // 074: ifnonnull 12c
      // 077: goto 084
      // 07a: ldc2_w 4077520044886258121
      // 07d: lload 2
      // 07e: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 083: athrow
      // 084: lload 2
      // 085: lconst_0
      // 086: lcmp
      // 087: iflt 11f
      // 08a: getstatic com/zelix/v7.k Lcom/zelix/v7;
      // 08d: if_acmpne 11c
      // 090: goto 09d
      // 093: ldc2_w 4077520044886258121
      // 096: lload 2
      // 097: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: aload 5
      // 09f: iload 6
      // 0a1: bipush 1
      // 0a2: isub
      // 0a3: aaload
      // 0a4: aload 4
      // 0a6: ifnonnull 10f
      // 0a9: goto 0b6
      // 0ac: ldc2_w 4077520044886258121
      // 0af: lload 2
      // 0b0: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 0b9: if_acmpeq 0fb
      // 0bc: goto 0c9
      // 0bf: ldc2_w 4077520044886258121
      // 0c2: lload 2
      // 0c3: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c8: athrow
      // 0c9: aload 5
      // 0cb: iload 6
      // 0cd: bipush 1
      // 0ce: isub
      // 0cf: aaload
      // 0d0: aload 4
      // 0d2: ifnonnull 12c
      // 0d5: goto 0e2
      // 0d8: ldc2_w 4077520044886258121
      // 0db: lload 2
      // 0dc: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: lload 2
      // 0e3: lconst_0
      // 0e4: lcmp
      // 0e5: iflt 11f
      // 0e8: getstatic com/zelix/v7.z Lcom/zelix/v7;
      // 0eb: if_acmpne 11c
      // 0ee: goto 0fb
      // 0f1: ldc2_w 4077520044886258121
      // 0f4: lload 2
      // 0f5: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: goto 109
      // 0ff: ldc2_w 4077520044886258121
      // 102: lload 2
      // 103: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 108: athrow
      // 109: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 10c: iload 6
      // 10e: aaload
      // 10f: astore 7
      // 111: aload 4
      // 113: lload 2
      // 114: lconst_0
      // 115: lcmp
      // 116: ifle 13a
      // 119: ifnull 12e
      // 11c: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // 11f: goto 12c
      // 122: ldc2_w 4077520044886258121
      // 125: lload 2
      // 126: invokedynamic l (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: athrow
      // 12c: astore 7
      // 12e: aload 5
      // 130: iload 6
      // 132: aload 7
      // 134: aastore
      // 135: iinc 6 1
      // 138: aload 4
      // 13a: ifnull 043
      // 13d: aload 5
      // 13f: lload 2
      // 140: lconst_0
      // 141: lcmp
      // 142: ifle 10c
      // 145: areturn
      // 146: aload 0
      // 147: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 14a: areturn
   }

   public boolean o(loj param1, hz param2, char param3, Set param4, boolean param5, char param6, String param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 6
      // 07: i2l
      // 08: bipush 48
      // 0a: lshl
      // 0b: bipush 16
      // 0d: lushr
      // 0e: lor
      // 0f: iload 8
      // 11: i2l
      // 12: bipush 32
      // 14: lshl
      // 15: bipush 32
      // 17: lushr
      // 18: lor
      // 19: getstatic com/zelix/hz.b J
      // 1c: lxor
      // 1d: lstore 9
      // 1f: lload 9
      // 21: dup2
      // 22: ldc2_w 120892197869838
      // 25: lxor
      // 26: lstore 11
      // 28: dup2
      // 29: ldc2_w 83111379427164
      // 2c: lxor
      // 2d: lstore 13
      // 2f: dup2
      // 30: ldc2_w 84986785338357
      // 33: lxor
      // 34: lstore 15
      // 36: pop2
      // 37: ldc2_w 993835037986126106
      // 3a: lload 9
      // 3c: invokedynamic h (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 41: astore 17
      // 43: aload 0
      // 44: lload 11
      // 46: aload 1
      // 47: aload 2
      // 48: aload 7
      // 4a: invokespecial com/zelix/hz.Q (JLcom/zelix/loj;Lcom/zelix/hz;Ljava/lang/String;)Z
      // 4d: aload 17
      // 4f: ifnonnull 7b
      // 52: ifeq fd
      // 55: goto 63
      // 58: ldc2_w 971201891047883813
      // 5b: lload 9
      // 5d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: aload 0
      // 64: lload 15
      // 66: aload 1
      // 67: aload 2
      // 68: aload 7
      // 6a: invokespecial com/zelix/hz.w (JLcom/zelix/loj;Lcom/zelix/hz;Ljava/lang/String;)Z
      // 6d: goto 7b
      // 70: ldc2_w 971201891047883813
      // 73: lload 9
      // 75: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: aload 17
      // 7d: iload 6
      // 7f: ifle 9a
      // 82: ifnonnull 98
      // 85: ifeq fd
      // 88: goto 96
      // 8b: ldc2_w 971201891047883813
      // 8e: lload 9
      // 90: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: athrow
      // 96: iload 5
      // 98: aload 17
      // 9a: ifnonnull fa
      // 9d: ifeq f9
      // a0: goto ae
      // a3: ldc2_w 971201891047883813
      // a6: lload 9
      // a8: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ad: athrow
      // ae: aload 0
      // af: aload 2
      // b0: lload 13
      // b2: aload 4
      // b4: bipush 3
      // b5: anewarray 383
      // b8: dup_x1
      // b9: swap
      // ba: bipush 2
      // bb: swap
      // bc: aastore
      // bd: dup_x2
      // be: dup_x2
      // bf: pop
      // c0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c3: bipush 1
      // c4: swap
      // c5: aastore
      // c6: dup_x1
      // c7: swap
      // c8: bipush 0
      // c9: swap
      // ca: aastore
      // cb: ldc2_w 1143265697853967678
      // ce: lload 9
      // d0: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d5: aload 17
      // d7: ifnonnull fa
      // da: goto e8
      // dd: ldc2_w 971201891047883813
      // e0: lload 9
      // e2: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // e7: athrow
      // e8: ifeq fd
      // eb: goto f9
      // ee: ldc2_w 971201891047883813
      // f1: lload 9
      // f3: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // f8: athrow
      // f9: bipush 1
      // fa: goto fe
      // fd: bipush 0
      // fe: ireturn
   }

   boolean f(Object[] var1) {
      int var2 = (Integer)var1[0];
      return this.K.get(var2);
   }

   public boolean V(long param1, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/hz.b J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 2422013041999926604
      // 09: lload 1
      // 0a: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: astore 4
      // 11: aload 0
      // 12: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 15: iload 3
      // 16: aaload
      // 17: aload 4
      // 19: ifnonnull 3f
      // 1c: ifnull 5d
      // 1f: goto 2c
      // 22: ldc2_w 2390304526728161395
      // 25: lload 1
      // 26: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 30: iload 3
      // 31: aaload
      // 32: goto 3f
      // 35: ldc2_w 2390304526728161395
      // 38: lload 1
      // 39: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: athrow
      // 3f: ldc "?"
      // 41: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 44: aload 4
      // 46: ifnonnull 5a
      // 49: ifne 5d
      // 4c: goto 59
      // 4f: ldc2_w 2390304526728161395
      // 52: lload 1
      // 53: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   boolean Q(int param1, char param2, char param3, int param4) {
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
      // 17: getstatic com/zelix/hz.b J
      // 1a: lxor
      // 1b: lstore 5
      // 1d: lload 5
      // 1f: dup2
      // 20: ldc2_w 107029546903888
      // 23: lxor
      // 24: lstore 7
      // 26: pop2
      // 27: ldc2_w 4867533528728385372
      // 2a: lload 5
      // 2c: invokedynamic n (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: astore 9
      // 33: aload 0
      // 34: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 37: iload 4
      // 39: aaload
      // 3a: aload 9
      // 3c: ifnonnull 6a
      // 3f: lload 7
      // 41: invokevirtual com/zelix/v7.i (J)Z
      // 44: ifne b1
      // 47: goto 55
      // 4a: ldc2_w 4844847073336461923
      // 4d: lload 5
      // 4f: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: aload 0
      // 56: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 59: iload 4
      // 5b: aaload
      // 5c: goto 6a
      // 5f: ldc2_w 4844847073336461923
      // 62: lload 5
      // 64: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: getstatic com/zelix/v7.X Lcom/zelix/v7;
      // 6d: iload 1
      // 6e: iflt 9f
      // 71: aload 9
      // 73: ifnonnull 9f
      // 76: if_acmpeq b1
      // 79: goto 87
      // 7c: ldc2_w 4844847073336461923
      // 7f: lload 5
      // 81: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 86: athrow
      // 87: aload 0
      // 88: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 8b: iload 4
      // 8d: aaload
      // 8e: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // 91: goto 9f
      // 94: ldc2_w 4844847073336461923
      // 97: lload 5
      // 99: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9e: athrow
      // 9f: if_acmpeq b1
      // a2: bipush 1
      // a3: goto b2
      // a6: ldc2_w 4844847073336461923
      // a9: lload 5
      // ab: invokedynamic n (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b0: athrow
      // b1: bipush 0
      // b2: ireturn
   }

   public boolean q(Object[] param1) {
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
      // 0c: getstatic com/zelix/hz.b J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 96884195424287
      // 17: lxor
      // 18: lstore 4
      // 1a: pop2
      // 1b: ldc2_w -863109970720325419
      // 1e: lload 2
      // 1f: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: bipush 0
      // 25: istore 7
      // 27: astore 6
      // 29: iload 7
      // 2b: aload 0
      // 2c: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 2f: arraylength
      // 30: if_icmpge 76
      // 33: aload 0
      // 34: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 37: iload 7
      // 39: aaload
      // 3a: lload 4
      // 3c: invokestatic com/zelix/hz.I (Lcom/zelix/v7;J)Z
      // 3f: aload 6
      // 41: lload 2
      // 42: lconst_0
      // 43: lcmp
      // 44: ifle 4c
      // 47: ifnonnull 7d
      // 4a: aload 6
      // 4c: ifnonnull 6d
      // 4f: goto 5c
      // 52: ldc2_w -813683379513246230
      // 55: lload 2
      // 56: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b: athrow
      // 5c: ifeq 6e
      // 5f: goto 6c
      // 62: ldc2_w -813683379513246230
      // 65: lload 2
      // 66: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: athrow
      // 6c: bipush 1
      // 6d: ireturn
      // 6e: iinc 7 1
      // 71: aload 6
      // 73: ifnull 29
      // 76: lload 2
      // 77: lconst_0
      // 78: lcmp
      // 79: ifle 33
      // 7c: bipush 0
      // 7d: ireturn
   }

   boolean n(int param1, char param2, BitSet param3, short param4) {
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
      // 0e: iload 4
      // 10: i2l
      // 11: bipush 48
      // 13: lshl
      // 14: bipush 48
      // 16: lushr
      // 17: lor
      // 18: getstatic com/zelix/hz.b J
      // 1b: lxor
      // 1c: lstore 5
      // 1e: ldc2_w 1910034935997918801
      // 21: lload 5
      // 23: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28: aconst_null
      // 29: astore 9
      // 2b: astore 7
      // 2d: aload 0
      // 2e: getfield com/zelix/hz.K Ljava/util/BitSet;
      // 31: aload 7
      // 33: ifnonnull 7c
      // 36: ifnonnull 64
      // 39: goto 47
      // 3c: ldc2_w 1887403988360024942
      // 3f: lload 5
      // 41: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: athrow
      // 47: aload 0
      // 48: new java/util/BitSet
      // 4b: dup
      // 4c: aload 0
      // 4d: getfield com/zelix/hz.W [Lcom/zelix/v7;
      // 50: arraylength
      // 51: invokespecial java/util/BitSet.<init> (I)V
      // 54: putfield com/zelix/hz.K Ljava/util/BitSet;
      // 57: bipush 1
      // 58: istore 8
      // 5a: aload 7
      // 5c: iload 4
      // 5e: ifle 6b
      // 61: ifnull 81
      // 64: aload 0
      // 65: getfield com/zelix/hz.K Ljava/util/BitSet;
      // 68: invokevirtual java/util/BitSet.clone ()Ljava/lang/Object;
      // 6b: checkcast java/util/BitSet
      // 6e: goto 7c
      // 71: ldc2_w 1887403988360024942
      // 74: lload 5
      // 76: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: athrow
      // 7c: astore 9
      // 7e: bipush 0
      // 7f: istore 8
      // 81: aload 0
      // 82: getfield com/zelix/hz.K Ljava/util/BitSet;
      // 85: aload 3
      // 86: invokevirtual java/util/BitSet.or (Ljava/util/BitSet;)V
      // 89: iload 8
      // 8b: aload 7
      // 8d: ifnonnull cf
      // 90: ifne ce
      // 93: goto a1
      // 96: ldc2_w 1887403988360024942
      // 99: lload 5
      // 9b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a0: athrow
      // a1: aload 0
      // a2: getfield com/zelix/hz.K Ljava/util/BitSet;
      // a5: aload 9
      // a7: invokevirtual java/util/BitSet.equals (Ljava/lang/Object;)Z
      // aa: aload 7
      // ac: ifnonnull cf
      // af: goto bd
      // b2: ldc2_w 1887403988360024942
      // b5: lload 5
      // b7: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: athrow
      // bd: ifne d2
      // c0: goto ce
      // c3: ldc2_w 1887403988360024942
      // c6: lload 5
      // c8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cd: athrow
      // ce: bipush 1
      // cf: goto d3
      // d2: bipush 0
      // d3: ireturn
   }

   public Set k(long var1) {
      var1 = b ^ var1;

      try {
         return this.M != null ? new LinkedHashSet(this.M) : null;
      } catch (n9 var3) {
         throw m44.a<"m">(var3, 3411222716440831496L, var1);
      }
   }

   boolean g(long var1) {
      var1 = b ^ var1;

      try {
         if (this.K != null) {
            return true;
         }
      } catch (n9 var3) {
         throw m44.a<"i">(var3, -5128647876839771764L, var1);
      }

      return false;
   }

   BitSet J() {
      return (BitSet)this.K.clone();
   }

   public static v7[] z(int param0, loj param1, v7[] param2, v7[] param3, char param4, boolean param5, short param6, zr param7, String param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 0
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 4
      // 007: i2l
      // 008: bipush 48
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 6
      // 011: i2l
      // 012: bipush 48
      // 014: lshl
      // 015: bipush 48
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/hz.b J
      // 01c: lxor
      // 01d: lstore 9
      // 01f: lload 9
      // 021: dup2
      // 022: ldc2_w 70962686087653
      // 025: lxor
      // 026: lstore 11
      // 028: dup2
      // 029: ldc2_w 37770409338094
      // 02c: lxor
      // 02d: dup2
      // 02e: bipush 56
      // 030: lushr
      // 031: l2i
      // 032: istore 13
      // 034: dup2
      // 035: bipush 8
      // 037: lshl
      // 038: bipush 32
      // 03a: lushr
      // 03b: l2i
      // 03c: istore 14
      // 03e: dup2
      // 03f: bipush 40
      // 041: lshl
      // 042: bipush 40
      // 044: lushr
      // 045: l2i
      // 046: istore 15
      // 048: pop2
      // 049: dup2
      // 04a: ldc2_w 133411816293551
      // 04d: lxor
      // 04e: lstore 16
      // 050: pop2
      // 051: ldc2_w -2791209417916011117
      // 054: lload 9
      // 056: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: aload 2
      // 05c: arraylength
      // 05d: istore 19
      // 05f: astore 18
      // 061: iload 5
      // 063: ifeq 079
      // 066: aload 2
      // 067: invokevirtual [Lcom/zelix/v7;.clone ()Ljava/lang/Object;
      // 06a: checkcast [Lcom/zelix/v7;
      // 06d: astore 20
      // 06f: iload 4
      // 071: ifle 082
      // 074: aload 18
      // 076: ifnull 07c
      // 079: aload 2
      // 07a: astore 20
      // 07c: aload 7
      // 07e: bipush 0
      // 07f: invokevirtual com/zelix/zr.I (Z)V
      // 082: bipush 0
      // 083: istore 21
      // 085: iload 21
      // 087: iload 19
      // 089: if_icmpge 375
      // 08c: aload 3
      // 08d: aload 18
      // 08f: ifnonnull 37c
      // 092: iload 21
      // 094: aaload
      // 095: aload 20
      // 097: iload 21
      // 099: aaload
      // 09a: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 09d: iload 6
      // 09f: ifge 1b9
      // 0a2: aload 18
      // 0a4: ifnonnull 1b9
      // 0a7: goto 0b5
      // 0aa: ldc2_w -2741838297700298580
      // 0ad: lload 9
      // 0af: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b4: athrow
      // 0b5: ifeq 184
      // 0b8: goto 0c6
      // 0bb: ldc2_w -2741838297700298580
      // 0be: lload 9
      // 0c0: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: aload 20
      // 0c8: iload 21
      // 0ca: aaload
      // 0cb: ldc "~"
      // 0cd: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 0d0: aload 18
      // 0d2: iload 6
      // 0d4: ifgt 11a
      // 0d7: ifnonnull 114
      // 0da: goto 0e8
      // 0dd: ldc2_w -2741838297700298580
      // 0e0: lload 9
      // 0e2: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e7: athrow
      // 0e8: ifeq 36d
      // 0eb: goto 0f9
      // 0ee: ldc2_w -2741838297700298580
      // 0f1: lload 9
      // 0f3: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: athrow
      // 0f9: aload 20
      // 0fb: iload 21
      // 0fd: bipush 1
      // 0fe: isub
      // 0ff: aaload
      // 100: getstatic com/zelix/v7.c Lcom/zelix/v7;
      // 103: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 106: goto 114
      // 109: ldc2_w -2741838297700298580
      // 10c: lload 9
      // 10e: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: athrow
      // 114: iload 0
      // 115: ifle 161
      // 118: aload 18
      // 11a: ifnonnull 161
      // 11d: ifne 36d
      // 120: goto 12e
      // 123: ldc2_w -2741838297700298580
      // 126: lload 9
      // 128: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12d: athrow
      // 12e: aload 20
      // 130: iload 21
      // 132: bipush 1
      // 133: isub
      // 134: iload 4
      // 136: iflt 176
      // 139: aload 18
      // 13b: ifnonnull 176
      // 13e: goto 14c
      // 141: ldc2_w -2741838297700298580
      // 144: lload 9
      // 146: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: athrow
      // 14c: aaload
      // 14d: getstatic com/zelix/v7.z Lcom/zelix/v7;
      // 150: invokevirtual com/zelix/v7.equals (Ljava/lang/Object;)Z
      // 153: goto 161
      // 156: ldc2_w -2741838297700298580
      // 159: lload 9
      // 15b: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 160: athrow
      // 161: ifne 36d
      // 164: aload 20
      // 166: iload 21
      // 168: goto 176
      // 16b: ldc2_w -2741838297700298580
      // 16e: lload 9
      // 170: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // 179: aastore
      // 17a: aload 18
      // 17c: iload 4
      // 17e: ifle 372
      // 181: ifnull 36d
      // 184: aload 7
      // 186: bipush 1
      // 187: invokevirtual com/zelix/zr.I (Z)V
      // 18a: aload 3
      // 18b: iload 21
      // 18d: iload 6
      // 18f: ifge 205
      // 192: aload 18
      // 194: ifnonnull 205
      // 197: goto 1a5
      // 19a: ldc2_w -2741838297700298580
      // 19d: lload 9
      // 19f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: athrow
      // 1a5: aaload
      // 1a6: ldc "?"
      // 1a8: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 1ab: goto 1b9
      // 1ae: ldc2_w -2741838297700298580
      // 1b1: lload 9
      // 1b3: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b8: athrow
      // 1b9: iload 4
      // 1bb: ifle 1cb
      // 1be: ifne 1f3
      // 1c1: aload 20
      // 1c3: iload 21
      // 1c5: aaload
      // 1c6: ldc "?"
      // 1c8: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 1cb: iload 0
      // 1cc: iflt 23d
      // 1cf: aload 18
      // 1d1: ifnonnull 23d
      // 1d4: goto 1e2
      // 1d7: ldc2_w -2741838297700298580
      // 1da: lload 9
      // 1dc: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: ifeq 213
      // 1e5: goto 1f3
      // 1e8: ldc2_w -2741838297700298580
      // 1eb: lload 9
      // 1ed: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: athrow
      // 1f3: aload 20
      // 1f5: iload 21
      // 1f7: goto 205
      // 1fa: ldc2_w -2741838297700298580
      // 1fd: lload 9
      // 1ff: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 204: athrow
      // 205: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // 208: aastore
      // 209: aload 18
      // 20b: iload 6
      // 20d: ifgt 372
      // 210: ifnull 36d
      // 213: aload 3
      // 214: iload 21
      // 216: aload 18
      // 218: ifnonnull 369
      // 21b: goto 229
      // 21e: ldc2_w -2741838297700298580
      // 221: lload 9
      // 223: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 228: athrow
      // 229: aaload
      // 22a: lload 16
      // 22c: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 22f: goto 23d
      // 232: ldc2_w -2741838297700298580
      // 235: lload 9
      // 237: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23c: athrow
      // 23d: ifeq 357
      // 240: aload 20
      // 242: iload 21
      // 244: aload 18
      // 246: ifnonnull 369
      // 249: goto 257
      // 24c: ldc2_w -2741838297700298580
      // 24f: lload 9
      // 251: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: iload 6
      // 259: ifgt 35b
      // 25c: aaload
      // 25d: lload 16
      // 25f: invokestatic com/zelix/hz.U (Lcom/zelix/v7;J)Z
      // 262: ifeq 357
      // 265: goto 273
      // 268: ldc2_w -2741838297700298580
      // 26b: lload 9
      // 26d: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: athrow
      // 273: aload 20
      // 275: iload 21
      // 277: aaload
      // 278: ldc "n"
      // 27a: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 27d: iload 6
      // 27f: ifge 2f6
      // 282: aload 18
      // 284: ifnonnull 2f6
      // 287: goto 295
      // 28a: ldc2_w -2741838297700298580
      // 28d: lload 9
      // 28f: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: athrow
      // 295: ifeq 2c7
      // 298: goto 2a6
      // 29b: ldc2_w -2741838297700298580
      // 29e: lload 9
      // 2a0: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: aload 20
      // 2a8: iload 21
      // 2aa: aload 3
      // 2ab: iload 21
      // 2ad: aaload
      // 2ae: aastore
      // 2af: aload 18
      // 2b1: iload 4
      // 2b3: iflt 372
      // 2b6: ifnull 36d
      // 2b9: goto 2c7
      // 2bc: ldc2_w -2741838297700298580
      // 2bf: lload 9
      // 2c1: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c6: athrow
      // 2c7: aload 3
      // 2c8: iload 21
      // 2ca: iload 4
      // 2cc: iflt 30b
      // 2cf: aload 18
      // 2d1: ifnonnull 30b
      // 2d4: goto 2e2
      // 2d7: ldc2_w -2741838297700298580
      // 2da: lload 9
      // 2dc: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e1: athrow
      // 2e2: aaload
      // 2e3: ldc "n"
      // 2e5: invokevirtual com/zelix/v7.y (Ljava/lang/String;)Z
      // 2e8: goto 2f6
      // 2eb: ldc2_w -2741838297700298580
      // 2ee: lload 9
      // 2f0: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: athrow
      // 2f6: ifne 36d
      // 2f9: aload 20
      // 2fb: iload 21
      // 2fd: goto 30b
      // 300: ldc2_w -2741838297700298580
      // 303: lload 9
      // 305: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30a: athrow
      // 30b: aload 1
      // 30c: aload 3
      // 30d: iload 21
      // 30f: aaload
      // 310: aload 20
      // 312: iload 21
      // 314: aaload
      // 315: aload 8
      // 317: lload 11
      // 319: bipush 4
      // 31a: anewarray 383
      // 31d: dup_x2
      // 31e: dup_x2
      // 31f: pop
      // 320: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 323: bipush 3
      // 324: swap
      // 325: aastore
      // 326: dup_x1
      // 327: swap
      // 328: bipush 2
      // 329: swap
      // 32a: aastore
      // 32b: dup_x1
      // 32c: swap
      // 32d: bipush 1
      // 32e: swap
      // 32f: aastore
      // 330: dup_x1
      // 331: swap
      // 332: bipush 0
      // 333: swap
      // 334: aastore
      // 335: ldc2_w -4145412559052893400
      // 338: lload 9
      // 33a: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33f: iload 13
      // 341: i2b
      // 342: swap
      // 343: iload 14
      // 345: swap
      // 346: iload 15
      // 348: swap
      // 349: invokestatic com/zelix/v7.M (BIILjava/lang/String;)Lcom/zelix/v7;
      // 34c: aastore
      // 34d: aload 18
      // 34f: iload 4
      // 351: iflt 372
      // 354: ifnull 36d
      // 357: aload 20
      // 359: iload 21
      // 35b: goto 369
      // 35e: ldc2_w -2741838297700298580
      // 361: lload 9
      // 363: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 368: athrow
      // 369: getstatic com/zelix/v7.w Lcom/zelix/v7;
      // 36c: aastore
      // 36d: iinc 21 1
      // 370: aload 18
      // 372: ifnull 085
      // 375: iload 4
      // 377: ifle 08c
      // 37a: aload 20
      // 37c: areturn
   }

   public fb j() {
      return this.a;
   }

   static {
      long var9 = b ^ 55634394472689L;
      m44.a<"j">(null, -4840196781345832408L, var9);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "\u0093ã ßÂ\u0019!Od\u0004Ö\u007f3\u0004\u0007¨\u0010\t\u0097\u0016'27\u0003ÌÊC½,0\u0018æÂ0/Ó\fH.\u0091Ó\u0095ö\u008b\u0091a¹I=X¥I3:0wA\u0082\u0005ï©XØ¨Ú4¢\u0086\u0084¢\u009cPÙ1w\u0098\u009aëÁ ûC";
      int var6 = "\u0093ã ßÂ\u0019!Od\u0004Ö\u007f3\u0004\u0007¨\u0010\t\u0097\u0016'27\u0003ÌÊC½,0\u0018æÂ0/Ó\fH.\u0091Ó\u0095ö\u008b\u0091a¹I=X¥I3:0wA\u0082\u0005ï©XØ¨Ú4¢\u0086\u0084¢\u009cPÙ1w\u0098\u009aëÁ ûC"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     c = var7;
                     d = new String[5];
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "Jck3ó·¤àrÇ\u001e÷Û)S@\u009f\u0000X\u0007hñ=\u0002Yí3O\u000b\t·\u0091\rAÙÆâ\u0096 öØ\u0087\u009cYEp`¡g³ú\"7Yëý@ë\u001e{©\f\u0080êO\b3XÜ\bó\u00173\u001b;\u001b\u001d\u0002Ï\u0080EV\n\u0093r\u0087\u0088ÚºaIpì)\u008cm\u001f\u0088as¸\u009e\u009bT\u0018÷!|u¯\u0097\u009c6üë«¹\u0092%\u0081>";
                  var6 = "Jck3ó·¤àrÇ\u001e÷Û)S@\u009f\u0000X\u0007hñ=\u0002Yí3O\u000b\t·\u0091\rAÙÆâ\u0096 öØ\u0087\u009cYEp`¡g³ú\"7Yëý@ë\u001e{©\f\u0080êO\b3XÜ\bó\u00173\u001b;\u001b\u001d\u0002Ï\u0080EV\n\u0093r\u0087\u0088ÚºaIpì)\u008cm\u001f\u0088as¸\u009e\u009bT\u0018÷!|u¯\u0097\u009c6üë«¹\u0092%\u0081>"
                     .length();
                  var3 = '8';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 681;
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
            throw new RuntimeException("com/zelix/hz", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("com/zelix/hz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
