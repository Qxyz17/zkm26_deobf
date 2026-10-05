package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _rh implements ry {
   private int i;
   private static _uo y;
   private Map s;
   private Map E;
   private final boolean S;
   private Object[] j;
   private static final long a = ess.a(-6952063037848442634L, -3171903312980025555L, MethodHandles.lookup().lookupClass()).a(54814885045545L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public Set N(long param1, Object param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 1
      // 01: dup2
      // 02: ldc2_w 69911031370025
      // 05: lxor
      // 06: lstore 4
      // 08: dup2
      // 09: ldc2_w 47215905427197
      // 0c: lxor
      // 0d: lstore 6
      // 0f: dup2
      // 10: ldc2_w 71068311404036
      // 13: lxor
      // 14: lstore 8
      // 16: pop2
      // 17: ldc2_w -374165316437941302
      // 1a: lload 1
      // 1b: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20: aload 0
      // 21: ldc2_w -525272704900574498
      // 24: lload 1
      // 25: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a: aload 3
      // 2b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 30: checkcast java/util/BitSet
      // 33: astore 11
      // 35: astore 10
      // 37: aload 11
      // 39: aload 10
      // 3b: ifnonnull 5c
      // 3e: ifnonnull 5a
      // 41: goto 4e
      // 44: ldc2_w -519647180350608625
      // 47: lload 1
      // 48: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: aconst_null
      // 4f: areturn
      // 50: ldc2_w -519647180350608625
      // 53: lload 1
      // 54: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: athrow
      // 5a: aload 11
      // 5c: ldc2_w -426052040135464991
      // 5f: lload 1
      // 60: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: lload 4
      // 67: invokestatic com/zelix/sh.Q (IJ)I
      // 6a: lload 6
      // 6c: dup2_x1
      // 6d: pop2
      // 6e: bipush 2
      // 6f: anewarray 121
      // 72: dup_x1
      // 73: swap
      // 74: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 77: bipush 1
      // 78: swap
      // 79: aastore
      // 7a: dup_x2
      // 7b: dup_x2
      // 7c: pop
      // 7d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 80: bipush 0
      // 81: swap
      // 82: aastore
      // 83: ldc2_w -283611916855509756
      // 86: lload 1
      // 87: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8c: astore 12
      // 8e: aload 0
      // 8f: aload 11
      // 91: lload 8
      // 93: aload 12
      // 95: bipush 3
      // 96: anewarray 121
      // 99: dup_x1
      // 9a: swap
      // 9b: bipush 2
      // 9c: swap
      // 9d: aastore
      // 9e: dup_x2
      // 9f: dup_x2
      // a0: pop
      // a1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a4: bipush 1
      // a5: swap
      // a6: aastore
      // a7: dup_x1
      // a8: swap
      // a9: bipush 0
      // aa: swap
      // ab: aastore
      // ac: ldc2_w -348224333526594643
      // af: lload 1
      // b0: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Collection; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b5: pop
      // b6: aload 12
      // b8: areturn
   }

   public Set I(Object[] param1) {
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
      // 0e: checkcast java/lang/Object
      // 11: astore 4
      // 13: pop
      // 14: lload 2
      // 15: dup2
      // 16: ldc2_w 62096615997905
      // 19: lxor
      // 1a: lstore 5
      // 1c: dup2
      // 1d: ldc2_w 49606331768325
      // 20: lxor
      // 21: lstore 7
      // 23: dup2
      // 24: ldc2_w 78402245193468
      // 27: lxor
      // 28: lstore 9
      // 2a: pop2
      // 2b: ldc2_w 3041817936810226482
      // 2e: lload 2
      // 2f: invokedynamic w (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: aload 0
      // 35: ldc2_w 2904219977135194662
      // 38: lload 2
      // 39: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e: aload 4
      // 40: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 45: checkcast java/util/BitSet
      // 48: astore 12
      // 4a: astore 11
      // 4c: aload 12
      // 4e: aload 11
      // 50: ifnonnull 71
      // 53: ifnonnull 6f
      // 56: goto 63
      // 59: ldc2_w 2896325043403815927
      // 5c: lload 2
      // 5d: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: athrow
      // 63: aconst_null
      // 64: areturn
      // 65: ldc2_w 2896325043403815927
      // 68: lload 2
      // 69: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: athrow
      // 6f: aload 12
      // 71: ldc2_w 3093511156961703705
      // 74: lload 2
      // 75: invokedynamic o (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: lload 5
      // 7c: invokestatic com/zelix/sh.Q (IJ)I
      // 7f: lload 7
      // 81: dup2_x1
      // 82: pop2
      // 83: bipush 2
      // 84: anewarray 121
      // 87: dup_x1
      // 88: swap
      // 89: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8c: bipush 1
      // 8d: swap
      // 8e: aastore
      // 8f: dup_x2
      // 90: dup_x2
      // 91: pop
      // 92: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 95: bipush 0
      // 96: swap
      // 97: aastore
      // 98: ldc2_w 3235959040711306748
      // 9b: lload 2
      // 9c: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/HashSet; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: astore 13
      // a3: aload 0
      // a4: aload 12
      // a6: lload 9
      // a8: aload 13
      // aa: bipush 3
      // ab: anewarray 121
      // ae: dup_x1
      // af: swap
      // b0: bipush 2
      // b1: swap
      // b2: aastore
      // b3: dup_x2
      // b4: dup_x2
      // b5: pop
      // b6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b9: bipush 1
      // ba: swap
      // bb: aastore
      // bc: dup_x1
      // bd: swap
      // be: bipush 0
      // bf: swap
      // c0: aastore
      // c1: ldc2_w 3157828442663017301
      // c4: lload 2
      // c5: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Collection; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: pop
      // cb: aload 13
      // cd: areturn
   }

   public void k(Object[] var1) {
      long var2 = (Long)var1[0];
      x44.a<"m">(this, 2550095979965745416L, var2).clear();
   }

   public boolean L(Object[] param1) {
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
      // 004: checkcast java/lang/Object
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Object
      // 00e: astore 5
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: pop
      // 01b: ldc2_w 1499029251879341513
      // 01e: lload 3
      // 01f: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 024: aload 0
      // 025: ldc2_w 1575043685128804874
      // 028: lload 3
      // 029: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: aload 5
      // 030: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 035: checkcast java/lang/Integer
      // 038: astore 7
      // 03a: astore 6
      // 03c: aload 7
      // 03e: aload 6
      // 040: ifnonnull 0a4
      // 043: ifnonnull 094
      // 046: goto 053
      // 049: ldc2_w 1642400087976625420
      // 04c: lload 3
      // 04d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: athrow
      // 053: new java/lang/IllegalArgumentException
      // 056: dup
      // 057: new java/lang/StringBuilder
      // 05a: dup
      // 05b: invokespecial java/lang/StringBuilder.<init> ()V
      // 05e: sipush 16108
      // 061: ldc2_w 1593069004292789207
      // 064: lload 3
      // 065: lxor
      // 066: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_rh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06e: aload 5
      // 070: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 073: sipush 11684
      // 076: ldc2_w 2485603394635399326
      // 079: lload 3
      // 07a: lxor
      // 07b: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_rh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 083: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 086: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 089: athrow
      // 08a: ldc2_w 1642400087976625420
      // 08d: lload 3
      // 08e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: aload 0
      // 095: ldc2_w 1636766866845252829
      // 098: lload 3
      // 099: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09e: aload 2
      // 09f: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a4: checkcast java/util/BitSet
      // 0a7: astore 8
      // 0a9: aload 8
      // 0ab: ifnonnull 0ba
      // 0ae: bipush 0
      // 0af: ireturn
      // 0b0: ldc2_w 1642400087976625420
      // 0b3: lload 3
      // 0b4: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: athrow
      // 0ba: aload 7
      // 0bc: invokevirtual java/lang/Integer.intValue ()I
      // 0bf: istore 9
      // 0c1: aload 8
      // 0c3: iload 9
      // 0c5: invokevirtual java/util/BitSet.get (I)Z
      // 0c8: istore 10
      // 0ca: aload 8
      // 0cc: iload 9
      // 0ce: invokevirtual java/util/BitSet.clear (I)V
      // 0d1: aload 8
      // 0d3: ldc2_w 1447193028675815906
      // 0d6: lload 3
      // 0d7: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dc: aload 6
      // 0de: ifnonnull 111
      // 0e1: ifne 10f
      // 0e4: goto 0f1
      // 0e7: ldc2_w 1642400087976625420
      // 0ea: lload 3
      // 0eb: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: ldc2_w 1636766866845252829
      // 0f5: lload 3
      // 0f6: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: aload 2
      // 0fc: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 101: pop
      // 102: goto 10f
      // 105: ldc2_w 1642400087976625420
      // 108: lload 3
      // 109: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10e: athrow
      // 10f: iload 10
      // 111: ireturn
   }

   public int F(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"l">(this, 6249475133887216849L, var2).size();
   }

   public boolean l(char param1, short param2, Object param3, Object param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: i2l
      // 02: bipush 48
      // 04: lshl
      // 05: iload 2
      // 06: i2l
      // 07: bipush 48
      // 09: lshl
      // 0a: bipush 16
      // 0c: lushr
      // 0d: lor
      // 0e: iload 5
      // 10: i2l
      // 11: bipush 32
      // 13: lshl
      // 14: bipush 32
      // 16: lushr
      // 17: lor
      // 18: lstore 6
      // 1a: ldc2_w -393850449576074356
      // 1d: lload 6
      // 1f: invokedynamic q (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24: aload 0
      // 25: ldc2_w -315549042887035825
      // 28: lload 6
      // 2a: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f: aload 4
      // 31: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 36: checkcast java/lang/Integer
      // 39: astore 9
      // 3b: astore 8
      // 3d: aload 9
      // 3f: aload 8
      // 41: ifnonnull aa
      // 44: ifnonnull 99
      // 47: goto 55
      // 4a: ldc2_w -536027181265376439
      // 4d: lload 6
      // 4f: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: athrow
      // 55: new java/lang/IllegalArgumentException
      // 58: dup
      // 59: new java/lang/StringBuilder
      // 5c: dup
      // 5d: invokespecial java/lang/StringBuilder.<init> ()V
      // 60: sipush 16108
      // 63: ldc2_w 1593126250843307410
      // 66: lload 6
      // 68: lxor
      // 69: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_rh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 71: aload 4
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 76: sipush 18906
      // 79: ldc2_w 8328154324047989415
      // 7c: lload 6
      // 7e: lxor
      // 7f: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_rh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 87: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 8d: athrow
      // 8e: ldc2_w -536027181265376439
      // 91: lload 6
      // 93: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: aload 0
      // 9a: ldc2_w -507874347107265896
      // 9d: lload 6
      // 9f: invokedynamic m (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: aload 3
      // a5: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // aa: checkcast java/util/BitSet
      // ad: astore 10
      // af: aload 10
      // b1: aload 8
      // b3: ifnonnull d6
      // b6: ifnonnull d4
      // b9: goto c7
      // bc: ldc2_w -536027181265376439
      // bf: lload 6
      // c1: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c6: athrow
      // c7: bipush 0
      // c8: ireturn
      // c9: ldc2_w -536027181265376439
      // cc: lload 6
      // ce: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d3: athrow
      // d4: aload 10
      // d6: aload 9
      // d8: invokevirtual java/lang/Integer.intValue ()I
      // db: invokevirtual java/util/BitSet.get (I)Z
      // de: ireturn
   }

   public List d(Object[] var1) {
      Object var2 = var1[0];
      long var3 = (Long)var1[1];
      long var5 = var3 ^ 45886779466940L;
      BitSet var7 = (BitSet)x44.a<"k">(this, -2157872541480957850L, var3).get(var2);

      try {
         if (var7 == null) {
            return null;
         }
      } catch (IllegalArgumentException var9) {
         throw x44.a<"w">(var9, -2129711426608090697L, var3);
      }

      ArrayList var8 = new ArrayList(x44.a<"o">(var7, -2256810337638466215L, var3));
      x44.a<"i">(this, new Object[]{var7, var5, var8}, -2192493490300776171L, var3);
      return var8;
   }

   public _rh(Object[] var1, long var2, int var4) {
      var2 = a ^ var2;
      long var10001 = var2 ^ 31497824254417L;
      int var5 = (int)((var2 ^ 31497824254417L) >>> 32);
      int var6 = (int)((var2 ^ 31497824254417L) << 32 >>> 56);
      int var7 = (int)(var10001 << 40 >>> 40);
      this(var5, var1, var4, true, (byte)var6, var7);
   }

   public void X(Object[] param1) {
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
      // 00e: checkcast [Ljava/lang/Object;
      // 011: astore 4
      // 013: pop
      // 014: lload 2
      // 015: dup2
      // 016: ldc2_w 86747580271454
      // 019: lxor
      // 01a: lstore 5
      // 01c: dup2
      // 01d: ldc2_w 74980177992591
      // 020: lxor
      // 021: lstore 7
      // 023: dup2
      // 024: ldc2_w 2314407449108
      // 027: lxor
      // 028: lstore 9
      // 02a: pop2
      // 02b: aload 4
      // 02d: arraylength
      // 02e: istore 12
      // 030: iload 12
      // 032: lload 9
      // 034: invokestatic com/zelix/sh.Q (IJ)I
      // 037: lload 7
      // 039: bipush 2
      // 03a: anewarray 121
      // 03d: dup_x2
      // 03e: dup_x2
      // 03f: pop
      // 040: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 043: bipush 1
      // 044: swap
      // 045: aastore
      // 046: dup_x1
      // 047: swap
      // 048: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 04b: bipush 0
      // 04c: swap
      // 04d: aastore
      // 04e: ldc2_w 2705768472548483647
      // 051: lload 2
      // 052: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 057: astore 13
      // 059: ldc2_w 4175838712488141047
      // 05c: lload 2
      // 05d: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: bipush 0
      // 063: istore 14
      // 065: astore 11
      // 067: iload 14
      // 069: iload 12
      // 06b: if_icmpge 0a6
      // 06e: aload 4
      // 070: iload 14
      // 072: aaload
      // 073: astore 15
      // 075: aload 13
      // 077: aload 11
      // 079: lload 2
      // 07a: lconst_0
      // 07b: lcmp
      // 07c: ifle 084
      // 07f: ifnonnull 0e0
      // 082: aload 15
      // 084: ldc2_w 4476365245682629322
      // 087: lload 2
      // 088: invokedynamic k (JJ)Lcom/zelix/_uo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08d: iload 14
      // 08f: lload 5
      // 091: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 094: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 099: checkcast java/lang/Integer
      // 09c: astore 16
      // 09e: iinc 14 1
      // 0a1: aload 11
      // 0a3: ifnull 067
      // 0a6: aload 0
      // 0a7: ldc2_w 4289932416257004003
      // 0aa: lload 2
      // 0ab: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: invokeinterface java/util/Map.size ()I 1
      // 0b5: lload 9
      // 0b7: invokestatic com/zelix/sh.Q (IJ)I
      // 0ba: lload 7
      // 0bc: bipush 2
      // 0bd: anewarray 121
      // 0c0: dup_x2
      // 0c1: dup_x2
      // 0c2: pop
      // 0c3: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0c6: bipush 1
      // 0c7: swap
      // 0c8: aastore
      // 0c9: dup_x1
      // 0ca: swap
      // 0cb: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0ce: bipush 0
      // 0cf: swap
      // 0d0: aastore
      // 0d1: lload 2
      // 0d2: lconst_0
      // 0d3: lcmp
      // 0d4: iflt 073
      // 0d7: ldc2_w 2705768472548483647
      // 0da: lload 2
      // 0db: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e0: astore 14
      // 0e2: aload 0
      // 0e3: ldc2_w 2693432422122232070
      // 0e6: lload 2
      // 0e7: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ec: arraylength
      // 0ed: istore 15
      // 0ef: aload 0
      // 0f0: ldc2_w 4289932416257004003
      // 0f3: lload 2
      // 0f4: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f9: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0fe: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 103: astore 16
      // 105: aload 16
      // 107: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10c: ifeq 1f5
      // 10f: aload 16
      // 111: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 116: checkcast java/util/Map$Entry
      // 119: astore 17
      // 11b: aload 17
      // 11d: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 122: astore 18
      // 124: aload 17
      // 126: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 12b: checkcast java/util/BitSet
      // 12e: astore 19
      // 130: new java/util/BitSet
      // 133: dup
      // 134: aload 4
      // 136: arraylength
      // 137: invokespecial java/util/BitSet.<init> (I)V
      // 13a: astore 20
      // 13c: aload 14
      // 13e: aload 18
      // 140: aload 20
      // 142: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 147: pop
      // 148: bipush 0
      // 149: lload 2
      // 14a: lconst_0
      // 14b: lcmp
      // 14c: ifle 217
      // 14f: aload 11
      // 151: ifnonnull 217
      // 154: istore 21
      // 156: iload 21
      // 158: iload 15
      // 15a: if_icmpge 1ea
      // 15d: aload 19
      // 15f: aload 11
      // 161: ifnonnull 19e
      // 164: iload 21
      // 166: invokevirtual java/util/BitSet.get (I)Z
      // 169: aload 11
      // 16b: ifnonnull 10c
      // 16e: lload 2
      // 16f: lconst_0
      // 170: lcmp
      // 171: ifle 149
      // 174: goto 181
      // 177: ldc2_w 4320335413864884274
      // 17a: lload 2
      // 17b: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 180: athrow
      // 181: ifeq 1e2
      // 184: aload 0
      // 185: ldc2_w 2693432422122232070
      // 188: lload 2
      // 189: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18e: iload 21
      // 190: aaload
      // 191: goto 19e
      // 194: ldc2_w 4320335413864884274
      // 197: lload 2
      // 198: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: athrow
      // 19e: astore 22
      // 1a0: aload 13
      // 1a2: aload 22
      // 1a4: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1a9: checkcast java/lang/Integer
      // 1ac: astore 23
      // 1ae: aload 11
      // 1b0: lload 2
      // 1b1: lconst_0
      // 1b2: lcmp
      // 1b3: ifle 1e7
      // 1b6: ifnonnull 1e5
      // 1b9: aload 23
      // 1bb: ifnull 1e2
      // 1be: goto 1cb
      // 1c1: ldc2_w 4320335413864884274
      // 1c4: lload 2
      // 1c5: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: aload 20
      // 1cd: aload 23
      // 1cf: invokevirtual java/lang/Integer.intValue ()I
      // 1d2: invokevirtual java/util/BitSet.set (I)V
      // 1d5: goto 1e2
      // 1d8: ldc2_w 4320335413864884274
      // 1db: lload 2
      // 1dc: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: athrow
      // 1e2: iinc 21 1
      // 1e5: aload 11
      // 1e7: ifnull 156
      // 1ea: aload 11
      // 1ec: lload 2
      // 1ed: lconst_0
      // 1ee: lcmp
      // 1ef: iflt 19e
      // 1f2: ifnull 105
      // 1f5: aload 0
      // 1f6: lload 2
      // 1f7: lconst_0
      // 1f8: lcmp
      // 1f9: ifle 116
      // 1fc: aload 11
      // 1fe: ifnonnull 265
      // 201: ldc2_w 4066574732026948641
      // 204: lload 2
      // 205: invokedynamic n (Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: goto 217
      // 20d: ldc2_w 4320335413864884274
      // 210: lload 2
      // 211: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: athrow
      // 217: ifeq 257
      // 21a: aload 0
      // 21b: iload 12
      // 21d: anewarray 121
      // 220: checkcast [Ljava/lang/Object;
      // 223: ldc2_w 2693432422122232070
      // 226: lload 2
      // 227: invokedynamic q (Ljava/lang/Object;[Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22c: aload 4
      // 22e: bipush 0
      // 22f: aload 0
      // 230: ldc2_w 2693432422122232070
      // 233: lload 2
      // 234: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: bipush 0
      // 23a: iload 12
      // 23c: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 23f: lload 2
      // 240: lconst_0
      // 241: lcmp
      // 242: ifle 297
      // 245: aload 11
      // 247: ifnull 270
      // 24a: goto 257
      // 24d: ldc2_w 4320335413864884274
      // 250: lload 2
      // 251: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 256: athrow
      // 257: aload 0
      // 258: goto 265
      // 25b: ldc2_w 4320335413864884274
      // 25e: lload 2
      // 25f: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 264: athrow
      // 265: aload 4
      // 267: ldc2_w 2693432422122232070
      // 26a: lload 2
      // 26b: invokedynamic q (Ljava/lang/Object;[Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: aload 0
      // 271: aload 14
      // 273: ldc2_w 4289932416257004003
      // 276: lload 2
      // 277: invokedynamic q (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: aload 0
      // 27d: aload 13
      // 27f: ldc2_w 4099891824197187380
      // 282: lload 2
      // 283: invokedynamic q (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: aload 0
      // 289: aload 0
      // 28a: ldc2_w 2693432422122232070
      // 28d: lload 2
      // 28e: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 293: arraylength
      // 294: putfield com/zelix/_rh.i I
      // 297: return
   }

   public _rh(long var1, _rh var3, int var4) {
      var1 = a ^ var1;
      long var5 = var1 ^ 40180922448798L;
      long var10001 = var1 ^ 78021584578120L;
      int var7 = (int)((var1 ^ 78021584578120L) >>> 32);
      int var8 = (int)((var1 ^ 78021584578120L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      this(var7, x44.a<"i">(var3, 4571109244153922313L, var1), var4, false, (byte)var8, var9);
      x44.a<"m">(this, new Object[]{var5, var3}, 2529402852243305663L, var1);
   }

   public boolean u(long param1, Object param3, Object param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -5173057499830378191
      // 03: lload 1
      // 04: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: aload 0
      // 0a: ldc2_w -5106051358024026382
      // 0d: lload 1
      // 0e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13: aload 4
      // 15: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1a: checkcast java/lang/Integer
      // 1d: astore 6
      // 1f: astore 5
      // 21: aload 6
      // 23: aload 5
      // 25: ifnonnull 89
      // 28: ifnonnull 79
      // 2b: goto 38
      // 2e: ldc2_w -5029677902159255052
      // 31: lload 1
      // 32: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: athrow
      // 38: new java/lang/IllegalArgumentException
      // 3b: dup
      // 3c: new java/lang/StringBuilder
      // 3f: dup
      // 40: invokespecial java/lang/StringBuilder.<init> ()V
      // 43: sipush 10866
      // 46: ldc2_w 1087924676925729719
      // 49: lload 1
      // 4a: lxor
      // 4b: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_rh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53: aload 4
      // 55: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 58: sipush 4920
      // 5b: ldc2_w 984382199388902142
      // 5e: lload 1
      // 5f: lxor
      // 60: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_rh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 68: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 6e: athrow
      // 6f: ldc2_w -5029677902159255052
      // 72: lload 1
      // 73: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: athrow
      // 79: aload 0
      // 7a: ldc2_w -5021809910758764507
      // 7d: lload 1
      // 7e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: aload 3
      // 84: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 89: checkcast java/util/BitSet
      // 8c: astore 7
      // 8e: aload 7
      // 90: aload 5
      // 92: ifnonnull c4
      // 95: ifnonnull c5
      // 98: goto a5
      // 9b: ldc2_w -5029677902159255052
      // 9e: lload 1
      // 9f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: athrow
      // a5: new java/util/BitSet
      // a8: dup
      // a9: aload 0
      // aa: getfield com/zelix/_rh.i I
      // ad: invokespecial java/util/BitSet.<init> (I)V
      // b0: astore 7
      // b2: aload 0
      // b3: ldc2_w -5021809910758764507
      // b6: lload 1
      // b7: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: aload 3
      // bd: aload 7
      // bf: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // c4: pop
      // c5: aload 6
      // c7: invokevirtual java/lang/Integer.intValue ()I
      // ca: istore 8
      // cc: aload 7
      // ce: iload 8
      // d0: invokevirtual java/util/BitSet.get (I)Z
      // d3: istore 9
      // d5: aload 7
      // d7: iload 8
      // d9: invokevirtual java/util/BitSet.set (I)V
      // dc: iload 9
      // de: ireturn
   }

   public boolean j(Object[] var1) {
      long var2 = (Long)var1[0];
      return x44.a<"m">(x44.a<"i">(this, 2427329240346889156L, var2), 2527085394325472462L, var2);
   }

   static {
      long var9 = a ^ 53622363942024L;
      long var10001 = var9 ^ 105517340529006L;
      int var11 = (int)((var9 ^ 105517340529006L) >>> 32);
      int var12 = (int)((var9 ^ 105517340529006L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "ï\n\u0011d\u0096\\ÕÕ\u008bÅùJ¹óçª&{Ë¤\u0019Í\u0099Ã.ðé\nNm\u000fÛô\t9Cõ\b\b\u008cØ\u0011ùìç\u0005AbK\u0092sÌªýü\u0090·GoPlþÛÔ\u0010Åã\u0093çFä?\u0099má\u0004»\u0001zaãH\"È\u0086Ó¥¸\u0085\u001c\u008cGF]?EÃ\u0004\u0089Ö:\u0097µ0t\u0010¹NÄúÈ¦\u0096è¨~CM\u008f9ôKmµî|ß¾úÃäÑÞHÎoËØK\u000eÈSç\u0014õøÆÅl\rÐP\u009cï\u0010ì\u00ad:Üsx;æþæ³&à\u0017íÖ@7£©\u0080\u0085,ÚF\u000et9u\u001e\u001c\u009e\u0090ÚÝ-LVªïôæ1øÕpã\u0017\u0089[×«E,\u008b`\u001e£?Es\u0088\u0080\u0098¿OiK\u0007í¢sÄw\u0014z.g\u0006\u0018E";
      int var6 = "ï\n\u0011d\u0096\\ÕÕ\u008bÅùJ¹óçª&{Ë¤\u0019Í\u0099Ã.ðé\nNm\u000fÛô\t9Cõ\b\b\u008cØ\u0011ùìç\u0005AbK\u0092sÌªýü\u0090·GoPlþÛÔ\u0010Åã\u0093çFä?\u0099má\u0004»\u0001zaãH\"È\u0086Ó¥¸\u0085\u001c\u008cGF]?EÃ\u0004\u0089Ö:\u0097µ0t\u0010¹NÄúÈ¦\u0096è¨~CM\u008f9ôKmµî|ß¾úÃäÑÞHÎoËØK\u000eÈSç\u0014õøÆÅl\rÐP\u009cï\u0010ì\u00ad:Üsx;æþæ³&à\u0017íÖ@7£©\u0080\u0085,ÚF\u000et9u\u001e\u001c\u009e\u0090ÚÝ-LVªïôæ1øÕpã\u0017\u0089[×«E,\u008b`\u001e£?Es\u0088\u0080\u0098¿OiK\u0007í¢sÄw\u0014z.g\u0006\u0018E"
         .length();
      char var3 = '@';
      int var15 = -1;

      label27:
      while (true) {
         String var16 = var4.substring(++var15, var15 + var3);
         byte var18 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var16.getBytes("ISO-8859-1"));
            String var23 = a(var8).intern();
            switch (var18) {
               case 0:
                  var7[var5++] = var23;
                  if ((var15 += var3) >= var6) {
                     b = var7;
                     c = new String[7];
                     x44.a<"u">(_uo.f(var11, (short)var12, var13), -981486246888868172L, var9);
                     return;
                  }

                  var3 = var4.charAt(var15);
                  break;
               default:
                  var7[var5++] = var23;
                  if ((var15 += var3) < var6) {
                     var3 = var4.charAt(var15);
                     continue label27;
                  }

                  var4 = "µÐ\u0001x+ÛS\u0096Sùºäm\u0019xn@ú¤\u0003ñ|£\u009eôpëc\u000f¡ã\u008azÔ,øÀ\u0096ÍÜ[Çk\u0007¿[\u0015§¥é\"dVÑ(Þøyg\tÁRè\u001c\u000eÉ\u0091Ô\u0089 î\u008d\u0087\u0007öz\u008b]WÖô";
                  var6 = "µÐ\u0001x+ÛS\u0096Sùºäm\u0019xn@ú¤\u0003ñ|£\u009eôpëc\u000f¡ã\u008azÔ,øÀ\u0096ÍÜ[Çk\u0007¿[\u0015§¥é\"dVÑ(Þøyg\tÁRè\u001c\u000eÉ\u0091Ô\u0089 î\u008d\u0087\u0007öz\u008b]WÖô"
                     .length();
                  var3 = 16;
                  var15 = -1;
            }

            var16 = var4.substring(++var15, var15 + var3);
            var18 = 0;
         }
      }
   }

   public void d(Object[] param1) {
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
      // 00e: checkcast com/zelix/_rh
      // 011: astore 4
      // 013: pop
      // 014: getstatic com/zelix/_rh.a J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: ldc2_w 6034151115503520441
      // 01d: lload 2
      // 01e: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 023: astore 5
      // 025: aload 4
      // 027: aload 5
      // 029: ifnonnull 0ae
      // 02c: ldc2_w 5705759270074512200
      // 02f: lload 2
      // 030: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: aload 0
      // 036: ldc2_w 5705759270074512200
      // 039: lload 2
      // 03a: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: if_acmpeq 0ac
      // 042: goto 04f
      // 045: ldc2_w 5889293774454489724
      // 048: lload 2
      // 049: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04e: athrow
      // 04f: new java/lang/IllegalArgumentException
      // 052: dup
      // 053: new java/lang/StringBuilder
      // 056: dup
      // 057: invokespecial java/lang/StringBuilder.<init> ()V
      // 05a: sipush 15804
      // 05d: ldc2_w 5509493812200593392
      // 060: lload 2
      // 061: lxor
      // 062: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_rh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 067: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 06a: aload 0
      // 06b: ldc2_w 5705759270074512200
      // 06e: lload 2
      // 06f: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 077: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 07a: sipush 25833
      // 07d: ldc2_w 4889940631115206310
      // 080: lload 2
      // 081: lxor
      // 082: invokedynamic o (IJ)Ljava/lang/String; bsm=com/zelix/_rh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: aload 4
      // 08c: ldc2_w 5705759270074512200
      // 08f: lload 2
      // 090: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 095: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 098: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 09b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09e: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0a1: athrow
      // 0a2: ldc2_w 5889293774454489724
      // 0a5: lload 2
      // 0a6: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ab: athrow
      // 0ac: aload 4
      // 0ae: ldc2_w 5892667207134870445
      // 0b1: lload 2
      // 0b2: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0bc: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0c1: astore 6
      // 0c3: aload 6
      // 0c5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ca: ifeq 15a
      // 0cd: aload 6
      // 0cf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d4: checkcast java/util/Map$Entry
      // 0d7: astore 7
      // 0d9: aload 7
      // 0db: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 0e0: astore 8
      // 0e2: aload 7
      // 0e4: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 0e9: checkcast java/util/BitSet
      // 0ec: astore 9
      // 0ee: aload 0
      // 0ef: ldc2_w 5892667207134870445
      // 0f2: lload 2
      // 0f3: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: aload 8
      // 0fa: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0ff: checkcast java/util/BitSet
      // 102: astore 10
      // 104: aload 10
      // 106: aload 5
      // 108: ifnonnull 150
      // 10b: ifnonnull 141
      // 10e: goto 11b
      // 111: ldc2_w 5889293774454489724
      // 114: lload 2
      // 115: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: aload 0
      // 11c: ldc2_w 5892667207134870445
      // 11f: lload 2
      // 120: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: aload 8
      // 127: aload 9
      // 129: invokevirtual java/util/BitSet.clone ()Ljava/lang/Object;
      // 12c: checkcast java/util/BitSet
      // 12f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 134: astore 11
      // 136: aload 5
      // 138: lload 2
      // 139: lconst_0
      // 13a: lcmp
      // 13b: ifle 157
      // 13e: ifnull 155
      // 141: aload 10
      // 143: goto 150
      // 146: ldc2_w 5889293774454489724
      // 149: lload 2
      // 14a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14f: athrow
      // 150: aload 9
      // 152: invokevirtual java/util/BitSet.or (Ljava/util/BitSet;)V
      // 155: aload 5
      // 157: ifnull 0c3
      // 15a: return
   }

   public Set W(Object[] var1) {
      long var2 = (Long)var1[0];
      long var4 = var2 ^ 124645088245872L;
      return x44.a<"w">(new Object[]{x44.a<"k">(this, -6035467578442971562L, var2).keySet(), var4}, -5313835468566373350L, var2);
   }

   private Collection E(Object[] param1) {
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
      // 04: checkcast java/util/BitSet
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
      // 16: checkcast java/util/Collection
      // 19: astore 5
      // 1b: pop
      // 1c: getstatic com/zelix/_rh.a J
      // 1f: lload 2
      // 20: lxor
      // 21: lstore 2
      // 22: ldc2_w -3524650575541250543
      // 25: lload 2
      // 26: invokedynamic t (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: aload 4
      // 2d: ldc2_w -3473113466462006726
      // 30: lload 2
      // 31: invokedynamic l (Ljava/lang/Object;JJ)I bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36: istore 7
      // 38: astore 6
      // 3a: bipush 0
      // 3b: istore 8
      // 3d: bipush 0
      // 3e: istore 9
      // 40: iload 9
      // 42: aload 0
      // 43: getfield com/zelix/_rh.i I
      // 46: if_icmpge c8
      // 49: aload 4
      // 4b: iload 9
      // 4d: invokevirtual java/util/BitSet.get (I)Z
      // 50: lload 2
      // 51: lconst_0
      // 52: lcmp
      // 53: ifle 96
      // 56: aload 6
      // 58: ifnonnull 96
      // 5b: ifeq 94
      // 5e: goto 6b
      // 61: ldc2_w -3669719022948704556
      // 64: lload 2
      // 65: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a: athrow
      // 6b: aload 5
      // 6d: aload 0
      // 6e: ldc2_w -3204701106809638944
      // 71: lload 2
      // 72: invokedynamic h (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: iload 9
      // 79: aaload
      // 7a: ldc2_w -3599901211348895960
      // 7d: lload 2
      // 7e: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: pop
      // 84: iinc 8 1
      // 87: goto 94
      // 8a: ldc2_w -3669719022948704556
      // 8d: lload 2
      // 8e: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: athrow
      // 94: iload 8
      // 96: iload 7
      // 98: if_icmplt ad
      // 9b: aload 6
      // 9d: ifnull c8
      // a0: goto ad
      // a3: ldc2_w -3669719022948704556
      // a6: lload 2
      // a7: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ac: athrow
      // ad: iinc 9 1
      // b0: aload 6
      // b2: ifnull 40
      // b5: lload 2
      // b6: lconst_0
      // b7: lcmp
      // b8: iflt 49
      // bb: goto c8
      // be: ldc2_w -3669719022948704556
      // c1: lload 2
      // c2: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c7: athrow
      // c8: aload 5
      // ca: areturn
   }

   public _rh(int param1, Object[] param2, int param3, boolean param4, byte param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
      // 001: i2l
      // 002: bipush 32
      // 004: lshl
      // 005: iload 5
      // 007: i2l
      // 008: bipush 56
      // 00a: lshl
      // 00b: bipush 32
      // 00d: lushr
      // 00e: lor
      // 00f: iload 6
      // 011: i2l
      // 012: bipush 40
      // 014: lshl
      // 015: bipush 40
      // 017: lushr
      // 018: lor
      // 019: getstatic com/zelix/_rh.a J
      // 01c: lxor
      // 01d: lstore 7
      // 01f: lload 7
      // 021: dup2
      // 022: ldc2_w 70149403638982
      // 025: lxor
      // 026: lstore 9
      // 028: dup2
      // 029: ldc2_w 58378237914135
      // 02c: lxor
      // 02d: lstore 11
      // 02f: dup2
      // 030: ldc2_w 126664181998988
      // 033: lxor
      // 034: lstore 13
      // 036: pop2
      // 037: ldc2_w -3572482574815864977
      // 03a: lload 7
      // 03c: invokedynamic r (JJ)Ljava/lang/String; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: aload 0
      // 042: invokespecial java/lang/Object.<init> ()V
      // 045: astore 15
      // 047: aload 15
      // 049: ifnonnull 093
      // 04c: iload 4
      // 04e: ifeq 09d
      // 051: goto 05f
      // 054: ldc2_w -3716425156826423382
      // 057: lload 7
      // 059: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: aload 0
      // 060: aload 2
      // 061: arraylength
      // 062: anewarray 121
      // 065: checkcast [Ljava/lang/Object;
      // 068: ldc2_w -3244685554370974050
      // 06b: lload 7
      // 06d: invokedynamic q (Ljava/lang/Object;[Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 072: aload 2
      // 073: bipush 0
      // 074: aload 0
      // 075: ldc2_w -3244685554370974050
      // 078: lload 7
      // 07a: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: bipush 0
      // 080: aload 2
      // 081: arraylength
      // 082: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 085: goto 093
      // 088: ldc2_w -3716425156826423382
      // 08b: lload 7
      // 08d: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 092: athrow
      // 093: iload 6
      // 095: ifle 136
      // 098: aload 15
      // 09a: ifnull 0b7
      // 09d: aload 0
      // 09e: aload 2
      // 09f: ldc2_w -3244685554370974050
      // 0a2: lload 7
      // 0a4: invokedynamic q (Ljava/lang/Object;[Ljava/lang/Object;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: goto 0b7
      // 0ac: ldc2_w -3716425156826423382
      // 0af: lload 7
      // 0b1: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: iload 3
      // 0b9: lload 13
      // 0bb: invokestatic com/zelix/sh.Q (IJ)I
      // 0be: lload 11
      // 0c0: bipush 2
      // 0c1: anewarray 121
      // 0c4: dup_x2
      // 0c5: dup_x2
      // 0c6: pop
      // 0c7: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ca: bipush 1
      // 0cb: swap
      // 0cc: aastore
      // 0cd: dup_x1
      // 0ce: swap
      // 0cf: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d2: bipush 0
      // 0d3: swap
      // 0d4: aastore
      // 0d5: ldc2_w -3308840336938642009
      // 0d8: lload 7
      // 0da: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0df: ldc2_w -3742324284206127493
      // 0e2: lload 7
      // 0e4: invokedynamic q (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: aload 0
      // 0ea: aload 0
      // 0eb: ldc2_w -3244685554370974050
      // 0ee: lload 7
      // 0f0: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: arraylength
      // 0f6: lload 13
      // 0f8: invokestatic com/zelix/sh.Q (IJ)I
      // 0fb: lload 11
      // 0fd: bipush 2
      // 0fe: anewarray 121
      // 101: dup_x2
      // 102: dup_x2
      // 103: pop
      // 104: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 107: bipush 1
      // 108: swap
      // 109: aastore
      // 10a: dup_x1
      // 10b: swap
      // 10c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 10f: bipush 0
      // 110: swap
      // 111: aastore
      // 112: ldc2_w -3308840336938642009
      // 115: lload 7
      // 117: invokedynamic r (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: ldc2_w -3495412551604191060
      // 11f: lload 7
      // 121: invokedynamic q (Ljava/lang/Object;Ljava/util/Map;JJ)V bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: aload 0
      // 127: aload 0
      // 128: ldc2_w -3244685554370974050
      // 12b: lload 7
      // 12d: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: arraylength
      // 133: putfield com/zelix/_rh.i I
      // 136: bipush 0
      // 137: istore 16
      // 139: iload 16
      // 13b: aload 0
      // 13c: getfield com/zelix/_rh.i I
      // 13f: if_icmpge 197
      // 142: aload 0
      // 143: ldc2_w -3495412551604191060
      // 146: lload 7
      // 148: invokedynamic n (Ljava/lang/Object;JJ)Ljava/util/Map; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14d: aload 0
      // 14e: ldc2_w -3244685554370974050
      // 151: lload 7
      // 153: invokedynamic n (Ljava/lang/Object;JJ)[Ljava/lang/Object; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 158: iload 16
      // 15a: aaload
      // 15b: ldc2_w -3925081341167874734
      // 15e: lload 7
      // 160: invokedynamic k (JJ)Lcom/zelix/_uo; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: iload 16
      // 167: lload 9
      // 169: invokevirtual com/zelix/_uo.R (IJ)Ljava/lang/Integer;
      // 16c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 171: pop
      // 172: iinc 16 1
      // 175: aload 15
      // 177: iload 6
      // 179: ifle 181
      // 17c: ifnonnull 19d
      // 17f: aload 15
      // 181: ifnull 139
      // 184: iload 5
      // 186: ifle 175
      // 189: goto 197
      // 18c: ldc2_w -3716425156826423382
      // 18f: lload 7
      // 191: invokedynamic r (Ljava/lang/Object;JJ)Ljava/lang/IllegalArgumentException; bsm=com/zelix/x44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 196: athrow
      // 197: aload 0
      // 198: iload 4
      // 19a: putfield com/zelix/_rh.S Z
      // 19d: return
   }

   public boolean R(long var1, Object var3) {
      return x44.a<"i">(this, -6507710210112352316L, var1).containsKey(var3);
   }

   public Enumeration D(Object[] var1) {
      long var2 = (Long)var1[0];
      return Collections.enumeration(x44.a<"h">(this, 1179536193728330293L, var2).keySet());
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11049;
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
            throw new RuntimeException("com/zelix/_rh", var10);
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
         throw new RuntimeException("com/zelix/_rh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
