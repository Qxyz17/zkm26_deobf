package com.zelix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hn {
   private List S;
   private final int y;
   private final int C;
   private static long m;
   private static int Z;
   private s4 i;
   private loq a;
   private lks d;
   private boolean b;
   private String G;
   private static final long c = prr.a(5552363265359190387L, -2241536634193494575L, MethodHandles.lookup().lookupClass()).a(95731246668930L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g = new HashMap(13);
   private static final long[] h;
   private static final Integer[] j;
   private static final Map k;
   private static final long[] l;
   private static final Long[] n;
   private static final Map o;

   private void C(Object[] param1) {
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
      // 00c: getstatic com/zelix/hn.c J
      // 00f: lload 2
      // 010: lxor
      // 011: lstore 2
      // 012: lload 2
      // 013: dup2
      // 014: ldc2_w 122246342555747
      // 017: lxor
      // 018: lstore 4
      // 01a: dup2
      // 01b: ldc2_w 12203625402905
      // 01e: lxor
      // 01f: lstore 6
      // 021: dup2
      // 022: ldc2_w 110300014216183
      // 025: lxor
      // 026: lstore 8
      // 028: pop2
      // 029: ldc2_w 2990846165217870589
      // 02c: lload 2
      // 02d: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 032: new java/io/StringWriter
      // 035: dup
      // 036: invokespecial java/io/StringWriter.<init> ()V
      // 039: astore 11
      // 03b: istore 10
      // 03d: new java/io/PrintWriter
      // 040: dup
      // 041: aload 11
      // 043: invokespecial java/io/PrintWriter.<init> (Ljava/io/Writer;)V
      // 046: astore 12
      // 048: aload 0
      // 049: ldc2_w 2914595115192698169
      // 04c: lload 2
      // 04d: invokedynamic u (Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 052: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 057: astore 13
      // 059: aload 13
      // 05b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 060: ifeq 198
      // 063: aload 13
      // 065: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06a: checkcast java/lang/String
      // 06d: astore 14
      // 06f: aload 0
      // 070: aload 14
      // 072: lload 4
      // 074: bipush 2
      // 075: anewarray 836
      // 078: dup_x2
      // 079: dup_x2
      // 07a: pop
      // 07b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07e: bipush 1
      // 07f: swap
      // 080: aastore
      // 081: dup_x1
      // 082: swap
      // 083: bipush 0
      // 084: swap
      // 085: aastore
      // 086: ldc2_w 3109269837055357474
      // 089: lload 2
      // 08a: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: astore 15
      // 091: lload 2
      // 092: lconst_0
      // 093: lcmp
      // 094: ifle 1b3
      // 097: iload 10
      // 099: ifeq 1b3
      // 09c: aload 15
      // 09e: iload 10
      // 0a0: lload 2
      // 0a1: lconst_0
      // 0a2: lcmp
      // 0a3: iflt 113
      // 0a6: ifeq 111
      // 0a9: goto 0b6
      // 0ac: ldc2_w 2896228432360077034
      // 0af: lload 2
      // 0b0: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: athrow
      // 0b6: ifnonnull 107
      // 0b9: goto 0c6
      // 0bc: ldc2_w 2896228432360077034
      // 0bf: lload 2
      // 0c0: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: athrow
      // 0c6: new com/zelix/a6
      // 0c9: dup
      // 0ca: new java/lang/StringBuilder
      // 0cd: dup
      // 0ce: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d1: sipush 19259
      // 0d4: ldc2_w 6991547315674163772
      // 0d7: lload 2
      // 0d8: lxor
      // 0d9: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e1: aload 14
      // 0e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e6: sipush 23142
      // 0e9: ldc2_w 5260796349016128380
      // 0ec: lload 2
      // 0ed: lxor
      // 0ee: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0f9: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 0fc: athrow
      // 0fd: ldc2_w 2896228432360077034
      // 100: lload 2
      // 101: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 106: athrow
      // 107: aload 0
      // 108: ldc2_w 3262608827138781730
      // 10b: lload 2
      // 10c: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: iload 10
      // 113: ifeq 17a
      // 116: ifnonnull 14a
      // 119: goto 126
      // 11c: ldc2_w 2896228432360077034
      // 11f: lload 2
      // 120: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 125: athrow
      // 126: aload 0
      // 127: aload 15
      // 129: ldc2_w 3262608827138781730
      // 12c: lload 2
      // 12d: invokedynamic w (Ljava/lang/Object;Lcom/zelix/lks;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 132: iload 10
      // 134: lload 2
      // 135: lconst_0
      // 136: lcmp
      // 137: iflt 195
      // 13a: ifne 193
      // 13d: goto 14a
      // 140: ldc2_w 2896228432360077034
      // 143: lload 2
      // 144: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: athrow
      // 14a: aload 0
      // 14b: ldc2_w 3262608827138781730
      // 14e: lload 2
      // 14f: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 154: lload 8
      // 156: aload 15
      // 158: aload 12
      // 15a: bipush 3
      // 15b: anewarray 836
      // 15e: dup_x1
      // 15f: swap
      // 160: bipush 2
      // 161: swap
      // 162: aastore
      // 163: dup_x1
      // 164: swap
      // 165: bipush 1
      // 166: swap
      // 167: aastore
      // 168: dup_x2
      // 169: dup_x2
      // 16a: pop
      // 16b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16e: bipush 0
      // 16f: swap
      // 170: aastore
      // 171: ldc2_w 3480885682827292298
      // 174: lload 2
      // 175: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: pop
      // 17b: goto 193
      // 17e: astore 16
      // 180: new com/zelix/a6
      // 183: dup
      // 184: aload 16
      // 186: ldc2_w 3266288640864856179
      // 189: lload 2
      // 18a: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 192: athrow
      // 193: iload 10
      // 195: ifne 059
      // 198: aload 0
      // 199: aload 11
      // 19b: ldc2_w 4028317087272685231
      // 19e: lload 2
      // 19f: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a4: ldc2_w 3100518465596809203
      // 1a7: lload 2
      // 1a8: invokedynamic w (Ljava/lang/Object;Ljava/lang/String;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: lload 2
      // 1ae: lconst_0
      // 1af: lcmp
      // 1b0: ifle 1b3
      // 1b3: aload 0
      // 1b4: iload 10
      // 1b6: lload 2
      // 1b7: lconst_0
      // 1b8: lcmp
      // 1b9: iflt 20d
      // 1bc: ifeq 20c
      // 1bf: ldc2_w 2952032706720437693
      // 1c2: lload 2
      // 1c3: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/s4; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c8: ifnull 20b
      // 1cb: goto 1d8
      // 1ce: ldc2_w 2896228432360077034
      // 1d1: lload 2
      // 1d2: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: new com/zelix/loq
      // 1dc: dup
      // 1dd: aload 0
      // 1de: ldc2_w 2952032706720437693
      // 1e1: lload 2
      // 1e2: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/s4; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e7: lload 6
      // 1e9: ldc2_w 4016663644673926258
      // 1ec: lload 2
      // 1ed: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f2: invokespecial com/zelix/loq.<init> (Lcom/zelix/s4;JZ)V
      // 1f5: ldc2_w 2898561262334041275
      // 1f8: lload 2
      // 1f9: invokedynamic w (Ljava/lang/Object;Lcom/zelix/loq;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: goto 20b
      // 201: ldc2_w 2896228432360077034
      // 204: lload 2
      // 205: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20a: athrow
      // 20b: aload 0
      // 20c: bipush 1
      // 20d: ldc2_w 3303829563890066745
      // 210: lload 2
      // 211: invokedynamic w (Ljava/lang/Object;ZJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: return
   }

   public void f(Object[] param1) {
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
      // 0c: getstatic com/zelix/hn.c J
      // 0f: lload 2
      // 10: lxor
      // 11: lstore 2
      // 12: lload 2
      // 13: dup2
      // 14: ldc2_w 118334282217367
      // 17: lxor
      // 18: lstore 4
      // 1a: dup2
      // 1b: ldc2_w 19948367142481
      // 1e: lxor
      // 1f: lstore 6
      // 21: pop2
      // 22: ldc2_w 3674331991950490491
      // 25: lload 2
      // 26: invokedynamic i (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: istore 8
      // 2d: iload 8
      // 2f: ifne 93
      // 32: aload 0
      // 33: ldc2_w 3108575348989812641
      // 36: lload 2
      // 37: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/loq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: ifnull 7b
      // 3f: goto 4c
      // 42: ldc2_w 3110679718916486640
      // 45: lload 2
      // 46: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b: athrow
      // 4c: aload 0
      // 4d: ldc2_w 3108575348989812641
      // 50: lload 2
      // 51: invokedynamic w (Ljava/lang/Object;JJ)Lcom/zelix/loq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56: lload 4
      // 58: bipush 1
      // 59: anewarray 836
      // 5c: dup_x2
      // 5d: dup_x2
      // 5e: pop
      // 5f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 62: bipush 0
      // 63: swap
      // 64: aastore
      // 65: ldc2_w 3596533123311767277
      // 68: lload 2
      // 69: invokedynamic v (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: goto 7b
      // 71: ldc2_w 3110679718916486640
      // 74: lload 2
      // 75: invokedynamic i (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7a: athrow
      // 7b: lload 6
      // 7d: bipush 1
      // 7e: anewarray 836
      // 81: dup_x2
      // 82: dup_x2
      // 83: pop
      // 84: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 87: bipush 0
      // 88: swap
      // 89: aastore
      // 8a: ldc2_w 3394466157372380531
      // 8d: lload 2
      // 8e: invokedynamic i (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 93: return
   }

   public static int h() {
      return Z;
   }

   public String n(Object[] var1) {
      String var3 = (String)var1[0];
      long var4 = (Long)var1[1];
      boolean var2 = (Boolean)var1[2];
      var4 = c ^ var4;
      long var6 = var4 ^ 8063192990149L;
      Object[] var10006 = new Object[]{null, null, null, 2};
      var10006[2] = var2;
      var10006[1] = var6;
      var10006[0] = var3;
      return m44.a<"w">(this, var10006, 972584258099207087L, var4);
   }

   private List B(Object[] param1) {
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
      // 00f: checkcast java/lang/String
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 3
      // 01d: pop
      // 01e: getstatic com/zelix/hn.c J
      // 021: lload 4
      // 023: lxor
      // 024: lstore 4
      // 026: lload 4
      // 028: dup2
      // 029: ldc2_w 45155420810238
      // 02c: lxor
      // 02d: lstore 6
      // 02f: dup2
      // 030: ldc2_w 50819161691246
      // 033: lxor
      // 034: lstore 8
      // 036: dup2
      // 037: ldc2_w 15178610027784
      // 03a: lxor
      // 03b: lstore 10
      // 03d: dup2
      // 03e: ldc2_w 18190154667966
      // 041: lxor
      // 042: lstore 12
      // 044: dup2
      // 045: ldc2_w 79729029639702
      // 048: lxor
      // 049: lstore 14
      // 04b: dup2
      // 04c: ldc2_w 126745224555903
      // 04f: lxor
      // 050: lstore 16
      // 052: dup2
      // 053: ldc2_w 3124038083883
      // 056: lxor
      // 057: lstore 18
      // 059: dup2
      // 05a: ldc2_w 113864247724760
      // 05d: lxor
      // 05e: lstore 20
      // 060: dup2
      // 061: ldc2_w 31908364251709
      // 064: lxor
      // 065: lstore 22
      // 067: dup2
      // 068: ldc2_w 116338900247614
      // 06b: lxor
      // 06c: dup2
      // 06d: bipush 56
      // 06f: lushr
      // 070: l2i
      // 071: istore 24
      // 073: dup2
      // 074: bipush 8
      // 076: lshl
      // 077: bipush 8
      // 079: lushr
      // 07a: lstore 25
      // 07c: pop2
      // 07d: pop2
      // 07e: ldc2_w -6245127363892084184
      // 081: lload 4
      // 083: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: istore 27
      // 08a: aload 2
      // 08b: ifnonnull 0af
      // 08e: new java/lang/IllegalArgumentException
      // 091: dup
      // 092: sipush 28084
      // 095: ldc2_w 7709430621817834596
      // 098: lload 4
      // 09a: lxor
      // 09b: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 0a3: athrow
      // 0a4: ldc2_w -6276822610236410305
      // 0a7: lload 4
      // 0a9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: iload 27
      // 0b2: ifeq 0df
      // 0b5: ldc2_w -5977182675191241236
      // 0b8: lload 4
      // 0ba: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bf: ifne 0f8
      // 0c2: goto 0d0
      // 0c5: ldc2_w -6276822610236410305
      // 0c8: lload 4
      // 0ca: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: goto 0df
      // 0d4: ldc2_w -6276822610236410305
      // 0d7: lload 4
      // 0d9: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0de: athrow
      // 0df: lload 6
      // 0e1: bipush 1
      // 0e2: anewarray 836
      // 0e5: dup_x2
      // 0e6: dup_x2
      // 0e7: pop
      // 0e8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0eb: bipush 0
      // 0ec: swap
      // 0ed: aastore
      // 0ee: ldc2_w -5752181917795821742
      // 0f1: lload 4
      // 0f3: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: aload 2
      // 0f9: astore 29
      // 0fb: new com/zelix/wn
      // 0fe: dup
      // 0ff: aload 29
      // 101: lload 20
      // 103: invokespecial com/zelix/wn.<init> (Ljava/lang/String;J)V
      // 106: astore 30
      // 108: aload 0
      // 109: ldc2_w -6274493524937122706
      // 10c: lload 4
      // 10e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/loq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 113: ifnull 32b
      // 116: iload 3
      // 117: ifeq 32b
      // 11a: goto 128
      // 11d: ldc2_w -6276822610236410305
      // 120: lload 4
      // 122: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: new java/util/ArrayList
      // 12b: dup
      // 12c: aload 30
      // 12e: lload 8
      // 130: bipush 1
      // 131: anewarray 836
      // 134: dup_x2
      // 135: dup_x2
      // 136: pop
      // 137: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13a: bipush 0
      // 13b: swap
      // 13c: aastore
      // 13d: ldc2_w -5761149119459342226
      // 140: lload 4
      // 142: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: invokespecial java/util/ArrayList.<init> (I)V
      // 14a: astore 31
      // 14c: aload 30
      // 14e: lload 18
      // 150: bipush 1
      // 151: anewarray 836
      // 154: dup_x2
      // 155: dup_x2
      // 156: pop
      // 157: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15a: bipush 0
      // 15b: swap
      // 15c: aastore
      // 15d: ldc2_w -5986144111696051244
      // 160: lload 4
      // 162: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: astore 32
      // 169: aload 32
      // 16b: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 170: ifeq 1f0
      // 173: aload 32
      // 175: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 17a: checkcast com/zelix/o6
      // 17d: astore 33
      // 17f: lload 4
      // 181: lconst_0
      // 182: lcmp
      // 183: ifle 1d6
      // 186: aload 31
      // 188: iload 27
      // 18a: ifeq 223
      // 18d: aload 0
      // 18e: aload 33
      // 190: aload 0
      // 191: ldc2_w -6274493524937122706
      // 194: lload 4
      // 196: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/loq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: aload 0
      // 19c: ldc2_w -5939585948090387721
      // 19f: lload 4
      // 1a1: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a6: lload 12
      // 1a8: dup2_x1
      // 1a9: pop2
      // 1aa: bipush 4
      // 1ab: anewarray 836
      // 1ae: dup_x1
      // 1af: swap
      // 1b0: bipush 3
      // 1b1: swap
      // 1b2: aastore
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
      // 1c1: dup_x1
      // 1c2: swap
      // 1c3: bipush 0
      // 1c4: swap
      // 1c5: aastore
      // 1c6: ldc2_w -5760089698797233259
      // 1c9: lload 4
      // 1cb: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/lml; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d5: pop
      // 1d6: iload 27
      // 1d8: ifne 169
      // 1db: lload 4
      // 1dd: lconst_0
      // 1de: lcmp
      // 1df: ifle 17f
      // 1e2: goto 1f0
      // 1e5: ldc2_w -6276822610236410305
      // 1e8: lload 4
      // 1ea: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: aload 31
      // 1f3: aload 0
      // 1f4: ldc2_w -6274493524937122706
      // 1f7: lload 4
      // 1f9: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/loq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fe: lload 22
      // 200: dup2_x1
      // 201: pop2
      // 202: bipush 3
      // 203: anewarray 836
      // 206: dup_x1
      // 207: swap
      // 208: bipush 2
      // 209: swap
      // 20a: aastore
      // 20b: dup_x2
      // 20c: dup_x2
      // 20d: pop
      // 20e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 211: bipush 1
      // 212: swap
      // 213: aastore
      // 214: dup_x1
      // 215: swap
      // 216: bipush 0
      // 217: swap
      // 218: aastore
      // 219: ldc2_w -5437079311174830594
      // 21c: lload 4
      // 21e: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: astore 33
      // 225: aload 0
      // 226: aload 33
      // 228: lload 14
      // 22a: bipush 2
      // 22b: anewarray 836
      // 22e: dup_x2
      // 22f: dup_x2
      // 230: pop
      // 231: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 234: bipush 1
      // 235: swap
      // 236: aastore
      // 237: dup_x1
      // 238: swap
      // 239: bipush 0
      // 23a: swap
      // 23b: aastore
      // 23c: ldc2_w -5778771866628243127
      // 23f: lload 4
      // 241: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: astore 28
      // 248: goto 35b
      // 24b: astore 31
      // 24d: new com/zelix/a6
      // 250: dup
      // 251: new java/lang/StringBuilder
      // 254: dup
      // 255: invokespecial java/lang/StringBuilder.<init> ()V
      // 258: sipush 7130
      // 25b: ldc2_w 8808477063253916171
      // 25e: lload 4
      // 260: lxor
      // 261: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 266: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 269: aload 31
      // 26b: lload 10
      // 26d: bipush 1
      // 26e: anewarray 836
      // 271: dup_x2
      // 272: dup_x2
      // 273: pop
      // 274: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 277: bipush 0
      // 278: swap
      // 279: aastore
      // 27a: ldc2_w -5225641181711645386
      // 27d: lload 4
      // 27f: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 287: sipush 24729
      // 28a: ldc2_w 2069469022289789269
      // 28d: lload 4
      // 28f: lxor
      // 290: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 295: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 298: aload 0
      // 299: ldc2_w -6331219508699949720
      // 29c: lload 4
      // 29e: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/s4; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a3: lload 16
      // 2a5: bipush 1
      // 2a6: anewarray 836
      // 2a9: dup_x2
      // 2aa: dup_x2
      // 2ab: pop
      // 2ac: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2af: bipush 0
      // 2b0: swap
      // 2b1: aastore
      // 2b2: ldc2_w -5927308588222720814
      // 2b5: lload 4
      // 2b7: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2bf: ldc "'"
      // 2c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2c7: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 2ca: athrow
      // 2cb: astore 31
      // 2cd: new com/zelix/a6
      // 2d0: dup
      // 2d1: new java/lang/StringBuilder
      // 2d4: dup
      // 2d5: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d8: aload 31
      // 2da: ldc2_w -5926048360355981904
      // 2dd: lload 4
      // 2df: invokedynamic q (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e7: sipush 7634
      // 2ea: ldc2_w 2449062992147577868
      // 2ed: lload 4
      // 2ef: lxor
      // 2f0: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2f8: aload 0
      // 2f9: ldc2_w -6331219508699949720
      // 2fc: lload 4
      // 2fe: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/s4; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 303: lload 16
      // 305: bipush 1
      // 306: anewarray 836
      // 309: dup_x2
      // 30a: dup_x2
      // 30b: pop
      // 30c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 30f: bipush 0
      // 310: swap
      // 311: aastore
      // 312: ldc2_w -5927308588222720814
      // 315: lload 4
      // 317: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 31f: ldc "'"
      // 321: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 324: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 327: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 32a: athrow
      // 32b: new java/util/ArrayList
      // 32e: dup
      // 32f: bipush 0
      // 330: invokespecial java/util/ArrayList.<init> (I)V
      // 333: astore 28
      // 335: new com/zelix/vo
      // 338: dup
      // 339: aload 30
      // 33b: aload 0
      // 33c: ldc2_w -5939585948090387721
      // 33f: lload 4
      // 341: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 346: iload 24
      // 348: i2b
      // 349: swap
      // 34a: lload 25
      // 34c: invokespecial com/zelix/vo.<init> (Lcom/zelix/wn;BLcom/zelix/lks;J)V
      // 34f: astore 31
      // 351: aload 28
      // 353: aload 31
      // 355: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 35a: pop
      // 35b: aload 28
      // 35d: areturn
   }

   private List c(Object[] var1) {
      List var2 = (List)var1[0];
      long var3 = (Long)var1[1];
      var3 = c ^ var3;
      long var10001 = var3 ^ 52224463569835L;
      int var5 = (int)((var3 ^ 52224463569835L) >>> 48);
      int var6 = (int)((var3 ^ 52224463569835L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      int var10000 = m44.a<"k">(8363072612729994633L, var3);
      ArrayList var9 = new ArrayList(var2.size());
      int var8 = var10000;
      int var10 = 0;

      label34:
      while (var10 < var2.size()) {
         y7 var11 = (y7)var2.get(var10);

         do {
            try {
               if (var3 >= 0L) {
                  if (var8 != 0) {
                     return var9;
                  }

                  var9.add(new vq(var11, (char)var5, (char)var6, m44.a<"u">(this, 7543385219462952906L, var3), var7));
                  var10++;
               }

               if (var8 == 0) {
                  continue label34;
               }
            } catch (IllegalArgumentException var12) {
               throw m44.a<"k">(var12, 7915386376774300418L, var3);
            }
         } while (var3 <= 0L);
         break;
      }

      return var9;
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
      // 004: checkcast java/lang/String
      // 007: astore 4
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: pop
      // 014: getstatic com/zelix/hn.c J
      // 017: lload 2
      // 018: lxor
      // 019: lstore 2
      // 01a: lload 2
      // 01b: dup2
      // 01c: ldc2_w 65705943822167
      // 01f: lxor
      // 020: lstore 5
      // 022: dup2
      // 023: ldc2_w 100548838263070
      // 026: lxor
      // 027: lstore 7
      // 029: pop2
      // 02a: ldc2_w 843487748458062024
      // 02d: lload 2
      // 02e: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: istore 9
      // 035: aload 0
      // 036: ldc2_w 1147496948941702924
      // 039: lload 2
      // 03a: invokedynamic p (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03f: iload 9
      // 041: ifeq 081
      // 044: ifne 07a
      // 047: goto 054
      // 04a: ldc2_w 721787004247823583
      // 04d: lload 2
      // 04e: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 053: athrow
      // 054: aload 0
      // 055: lload 7
      // 057: bipush 1
      // 058: anewarray 836
      // 05b: dup_x2
      // 05c: dup_x2
      // 05d: pop
      // 05e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 061: bipush 0
      // 062: swap
      // 063: aastore
      // 064: ldc2_w 1354553687342740914
      // 067: lload 2
      // 068: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06d: goto 07a
      // 070: ldc2_w 721787004247823583
      // 073: lload 2
      // 074: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: athrow
      // 07a: aload 4
      // 07c: ldc "/"
      // 07e: invokevirtual java/lang/String.indexOf (Ljava/lang/String;)I
      // 081: iload 9
      // 083: lload 2
      // 084: lconst_0
      // 085: lcmp
      // 086: iflt 08d
      // 089: ifeq 0ab
      // 08c: bipush -1
      // 08d: if_icmple 0ae
      // 090: goto 09d
      // 093: ldc2_w 721787004247823583
      // 096: lload 2
      // 097: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09c: athrow
      // 09d: bipush 1
      // 09e: goto 0ab
      // 0a1: ldc2_w 721787004247823583
      // 0a4: lload 2
      // 0a5: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: goto 0af
      // 0ae: bipush 0
      // 0af: istore 10
      // 0b1: iload 10
      // 0b3: ifeq 0e2
      // 0b6: aload 4
      // 0b8: sipush 22647
      // 0bb: ldc2_w 8600335118279937585
      // 0be: lload 2
      // 0bf: lxor
      // 0c0: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: sipush 10352
      // 0c8: ldc2_w 7938856140213681723
      // 0cb: lload 2
      // 0cc: lxor
      // 0cd: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d2: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0d5: lload 2
      // 0d6: lconst_0
      // 0d7: lcmp
      // 0d8: ifle 0e4
      // 0db: astore 11
      // 0dd: iload 9
      // 0df: ifne 0e6
      // 0e2: aload 4
      // 0e4: astore 11
      // 0e6: aload 0
      // 0e7: ldc2_w 1112996518915411991
      // 0ea: lload 2
      // 0eb: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f0: aload 11
      // 0f2: lload 5
      // 0f4: bipush 2
      // 0f5: anewarray 836
      // 0f8: dup_x2
      // 0f9: dup_x2
      // 0fa: pop
      // 0fb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0fe: bipush 1
      // 0ff: swap
      // 100: aastore
      // 101: dup_x1
      // 102: swap
      // 103: bipush 0
      // 104: swap
      // 105: aastore
      // 106: ldc2_w 1563498016334654151
      // 109: lload 2
      // 10a: invokedynamic q (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: astore 12
      // 111: aload 12
      // 113: iload 9
      // 115: ifeq 12a
      // 118: ifnonnull 12b
      // 11b: goto 128
      // 11e: ldc2_w 721787004247823583
      // 121: lload 2
      // 122: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 127: athrow
      // 128: aload 4
      // 12a: areturn
      // 12b: iload 10
      // 12d: ifeq 151
      // 130: aload 12
      // 132: sipush 10352
      // 135: ldc2_w 7938856140213681723
      // 138: lload 2
      // 139: lxor
      // 13a: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: sipush 22647
      // 142: ldc2_w 8600335118279937585
      // 145: lload 2
      // 146: lxor
      // 147: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 14f: astore 12
      // 151: aload 12
      // 153: areturn
   }

   public String b(Object[] param1) {
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
      // 04: checkcast java/lang/String
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 6
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/String
      // 19: astore 3
      // 1a: dup
      // 1b: bipush 3
      // 1c: aaload
      // 1d: checkcast [Ljava/lang/String;
      // 20: astore 4
      // 22: dup
      // 23: bipush 4
      // 24: aaload
      // 25: checkcast java/lang/String
      // 28: astore 5
      // 2a: pop
      // 2b: getstatic com/zelix/hn.c J
      // 2e: lload 6
      // 30: lxor
      // 31: lstore 6
      // 33: lload 6
      // 35: dup2
      // 36: ldc2_w 61868351629432
      // 39: lxor
      // 3a: lstore 8
      // 3c: dup2
      // 3d: ldc2_w 74777418724457
      // 40: lxor
      // 41: lstore 10
      // 43: pop2
      // 44: ldc2_w -6137622798200602194
      // 47: lload 6
      // 49: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e: istore 12
      // 50: aload 0
      // 51: iload 12
      // 53: ifeq 9a
      // 56: ldc2_w -5869640212906940822
      // 59: lload 6
      // 5b: invokedynamic v (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: ifne 99
      // 63: goto 71
      // 66: ldc2_w -6097260081156852295
      // 69: lload 6
      // 6b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 70: athrow
      // 71: aload 0
      // 72: lload 8
      // 74: bipush 1
      // 75: anewarray 836
      // 78: dup_x2
      // 79: dup_x2
      // 7a: pop
      // 7b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7e: bipush 0
      // 7f: swap
      // 80: aastore
      // 81: ldc2_w -5500526472859429676
      // 84: lload 6
      // 86: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8b: goto 99
      // 8e: ldc2_w -6097260081156852295
      // 91: lload 6
      // 93: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 98: athrow
      // 99: aload 0
      // 9a: ldc2_w -5903010362145001103
      // 9d: lload 6
      // 9f: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a4: aload 2
      // a5: lload 10
      // a7: aload 3
      // a8: aload 4
      // aa: aload 5
      // ac: bipush 5
      // ad: anewarray 836
      // b0: dup_x1
      // b1: swap
      // b2: bipush 4
      // b3: swap
      // b4: aastore
      // b5: dup_x1
      // b6: swap
      // b7: bipush 3
      // b8: swap
      // b9: aastore
      // ba: dup_x1
      // bb: swap
      // bc: bipush 2
      // bd: swap
      // be: aastore
      // bf: dup_x2
      // c0: dup_x2
      // c1: pop
      // c2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c5: bipush 1
      // c6: swap
      // c7: aastore
      // c8: dup_x1
      // c9: swap
      // ca: bipush 0
      // cb: swap
      // cc: aastore
      // cd: ldc2_w -6176687983359237148
      // d0: lload 6
      // d2: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // d7: astore 13
      // d9: aload 13
      // db: areturn
   }

   private lks x(Object[] param1) {
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
      // 004: checkcast java/lang/String
      // 007: astore 2
      // 008: dup
      // 009: bipush 1
      // 00a: aaload
      // 00b: checkcast java/lang/Long
      // 00e: invokevirtual java/lang/Long.longValue ()J
      // 011: lstore 3
      // 012: pop
      // 013: getstatic com/zelix/hn.c J
      // 016: lload 3
      // 017: lxor
      // 018: lstore 3
      // 019: lload 3
      // 01a: dup2
      // 01b: ldc2_w 53037921400219
      // 01e: lxor
      // 01f: lstore 5
      // 021: dup2
      // 022: ldc2_w 55480888543671
      // 025: lxor
      // 026: lstore 7
      // 028: dup2
      // 029: ldc2_w 113360275627572
      // 02c: lxor
      // 02d: lstore 9
      // 02f: dup2
      // 030: ldc2_w 5281538578247
      // 033: lxor
      // 034: lstore 11
      // 036: dup2
      // 037: ldc2_w 72735852818217
      // 03a: lxor
      // 03b: lstore 13
      // 03d: dup2
      // 03e: ldc2_w 83136598551974
      // 041: lxor
      // 042: lstore 15
      // 044: dup2
      // 045: ldc2_w 30606671149610
      // 048: lxor
      // 049: lstore 17
      // 04b: dup2
      // 04c: ldc2_w 97717491395625
      // 04f: lxor
      // 050: lstore 19
      // 052: dup2
      // 053: ldc2_w 117565393738843
      // 056: lxor
      // 057: lstore 21
      // 059: pop2
      // 05a: aconst_null
      // 05b: astore 24
      // 05d: ldc2_w 2499492206121642793
      // 060: lload 3
      // 061: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: aconst_null
      // 067: astore 25
      // 069: aconst_null
      // 06a: astore 26
      // 06c: istore 23
      // 06e: new com/zelix/lks
      // 071: dup
      // 072: aload 2
      // 073: lload 13
      // 075: invokespecial com/zelix/lks.<init> (Ljava/lang/String;J)V
      // 078: astore 24
      // 07a: new java/io/File
      // 07d: dup
      // 07e: aload 2
      // 07f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 082: lload 7
      // 084: bipush 2
      // 085: anewarray 836
      // 088: dup_x2
      // 089: dup_x2
      // 08a: pop
      // 08b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08e: bipush 1
      // 08f: swap
      // 090: aastore
      // 091: dup_x1
      // 092: swap
      // 093: bipush 0
      // 094: swap
      // 095: aastore
      // 096: ldc2_w 2463856089679414396
      // 099: lload 3
      // 09a: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: astore 27
      // 0a1: aload 27
      // 0a3: ifnull 0c3
      // 0a6: new java/io/BufferedReader
      // 0a9: dup
      // 0aa: new java/io/InputStreamReader
      // 0ad: dup
      // 0ae: new java/io/FileInputStream
      // 0b1: dup
      // 0b2: aload 2
      // 0b3: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 0b6: aload 27
      // 0b8: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/lang/String;)V
      // 0bb: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0be: astore 25
      // 0c0: goto 0db
      // 0c3: new java/io/BufferedReader
      // 0c6: dup
      // 0c7: new java/io/InputStreamReader
      // 0ca: dup
      // 0cb: new java/io/FileInputStream
      // 0ce: dup
      // 0cf: aload 2
      // 0d0: invokespecial java/io/FileInputStream.<init> (Ljava/lang/String;)V
      // 0d3: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;)V
      // 0d6: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;)V
      // 0d9: astore 25
      // 0db: ldc2_w 2620653177940778622
      // 0de: lload 3
      // 0df: invokedynamic o (JJ)Lcom/zelix/l6b; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: astore 28
      // 0e6: lload 3
      // 0e7: lconst_0
      // 0e8: lcmp
      // 0e9: ifle 11d
      // 0ec: aload 28
      // 0ee: iload 23
      // 0f0: ifne 11b
      // 0f3: ifnonnull 128
      // 0f6: goto 103
      // 0f9: ldc2_w 4285589736073225634
      // 0fc: lload 3
      // 0fd: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: new com/zelix/l6b
      // 106: dup
      // 107: lload 9
      // 109: aload 25
      // 10b: invokespecial com/zelix/l6b.<init> (JLjava/io/Reader;)V
      // 10e: goto 11b
      // 111: ldc2_w 4285589736073225634
      // 114: lload 3
      // 115: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11a: athrow
      // 11b: astore 28
      // 11d: lload 3
      // 11e: lconst_0
      // 11f: lcmp
      // 120: ifle 147
      // 123: iload 23
      // 125: ifeq 154
      // 128: lload 15
      // 12a: aload 25
      // 12c: bipush 2
      // 12d: anewarray 836
      // 130: dup_x1
      // 131: swap
      // 132: bipush 1
      // 133: swap
      // 134: aastore
      // 135: dup_x2
      // 136: dup_x2
      // 137: pop
      // 138: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13b: bipush 0
      // 13c: swap
      // 13d: aastore
      // 13e: ldc2_w 2309025543542378140
      // 141: lload 3
      // 142: invokedynamic k (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 147: goto 154
      // 14a: ldc2_w 4285589736073225634
      // 14d: lload 3
      // 14e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: lload 11
      // 156: bipush 1
      // 157: anewarray 836
      // 15a: dup_x2
      // 15b: dup_x2
      // 15c: pop
      // 15d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 160: bipush 0
      // 161: swap
      // 162: aastore
      // 163: ldc2_w 2553861824010188524
      // 166: lload 3
      // 167: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/l7; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16c: astore 26
      // 16e: aload 26
      // 170: aconst_null
      // 171: aload 24
      // 173: lload 5
      // 175: ldc2_w 2588652321622171160
      // 178: lload 3
      // 179: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17e: aload 26
      // 180: lload 17
      // 182: invokevirtual com/zelix/l7.y (J)I
      // 185: ifne 18e
      // 188: aconst_null
      // 189: astore 24
      // 18b: goto 1a8
      // 18e: aload 24
      // 190: lload 19
      // 192: bipush 1
      // 193: anewarray 836
      // 196: dup_x2
      // 197: dup_x2
      // 198: pop
      // 199: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 19c: bipush 0
      // 19d: swap
      // 19e: aastore
      // 19f: ldc2_w 4224967055775250579
      // 1a2: lload 3
      // 1a3: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: aload 26
      // 1aa: iload 23
      // 1ac: ifne 1c1
      // 1af: ifnull 1cc
      // 1b2: goto 1bf
      // 1b5: ldc2_w 4285589736073225634
      // 1b8: lload 3
      // 1b9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1be: athrow
      // 1bf: aload 26
      // 1c1: lload 21
      // 1c3: ldc2_w 2579518539948847595
      // 1c6: lload 3
      // 1c7: invokedynamic t (Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: lload 3
      // 1cd: lconst_0
      // 1ce: lcmp
      // 1cf: iflt 1f4
      // 1d2: aload 25
      // 1d4: iload 23
      // 1d6: ifne 1eb
      // 1d9: ifnull 342
      // 1dc: goto 1e9
      // 1df: ldc2_w 4285589736073225634
      // 1e2: lload 3
      // 1e3: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e8: athrow
      // 1e9: aload 25
      // 1eb: ldc2_w 4295743070682942431
      // 1ee: lload 3
      // 1ef: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: goto 342
      // 1f7: astore 27
      // 1f9: goto 342
      // 1fc: astore 27
      // 1fe: new com/zelix/a6
      // 201: dup
      // 202: new java/lang/StringBuilder
      // 205: dup
      // 206: invokespecial java/lang/StringBuilder.<init> ()V
      // 209: sipush 16962
      // 20c: ldc2_w 1704439797093740553
      // 20f: lload 3
      // 210: lxor
      // 211: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 219: aload 2
      // 21a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 21d: ldc "\""
      // 21f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 222: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 225: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 228: athrow
      // 229: astore 27
      // 22b: new com/zelix/a6
      // 22e: dup
      // 22f: new java/lang/StringBuilder
      // 232: dup
      // 233: invokespecial java/lang/StringBuilder.<init> ()V
      // 236: sipush 26167
      // 239: ldc2_w 6672343004876543076
      // 23c: lload 3
      // 23d: lxor
      // 23e: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 246: aload 2
      // 247: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24a: ldc "\""
      // 24c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 24f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 252: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 255: athrow
      // 256: astore 27
      // 258: new com/zelix/a6
      // 25b: dup
      // 25c: new java/lang/StringBuilder
      // 25f: dup
      // 260: invokespecial java/lang/StringBuilder.<init> ()V
      // 263: sipush 7950
      // 266: ldc2_w 2172944862415220052
      // 269: lload 3
      // 26a: lxor
      // 26b: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 270: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 273: aload 2
      // 274: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 277: sipush 14409
      // 27a: ldc2_w 3065109352809122304
      // 27d: lload 3
      // 27e: lxor
      // 27f: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 284: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 287: aload 27
      // 289: ldc2_w 2413122422149447166
      // 28c: lload 3
      // 28d: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 292: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 295: ldc "\""
      // 297: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 29a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 29d: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 2a0: athrow
      // 2a1: astore 27
      // 2a3: new com/zelix/a6
      // 2a6: dup
      // 2a7: new java/lang/StringBuilder
      // 2aa: dup
      // 2ab: invokespecial java/lang/StringBuilder.<init> ()V
      // 2ae: sipush 26828
      // 2b1: ldc2_w 7175606762218363530
      // 2b4: lload 3
      // 2b5: lxor
      // 2b6: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2be: aload 2
      // 2bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c2: sipush 24698
      // 2c5: ldc2_w 5047193106050224682
      // 2c8: lload 3
      // 2c9: lxor
      // 2ca: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d2: aload 27
      // 2d4: ldc2_w 2452395115018588404
      // 2d7: lload 3
      // 2d8: invokedynamic t (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e0: ldc "\""
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2e8: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 2eb: athrow
      // 2ec: astore 29
      // 2ee: aload 26
      // 2f0: iload 23
      // 2f2: ifne 307
      // 2f5: ifnull 312
      // 2f8: goto 305
      // 2fb: ldc2_w 4285589736073225634
      // 2fe: lload 3
      // 2ff: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 304: athrow
      // 305: aload 26
      // 307: lload 21
      // 309: ldc2_w 2579518539948847595
      // 30c: lload 3
      // 30d: invokedynamic t (Ljava/lang/Object;JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 312: lload 3
      // 313: lconst_0
      // 314: lcmp
      // 315: iflt 33a
      // 318: aload 25
      // 31a: iload 23
      // 31c: ifne 331
      // 31f: ifnull 33f
      // 322: goto 32f
      // 325: ldc2_w 4285589736073225634
      // 328: lload 3
      // 329: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32e: athrow
      // 32f: aload 25
      // 331: ldc2_w 4295743070682942431
      // 334: lload 3
      // 335: invokedynamic t (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33a: goto 33f
      // 33d: astore 30
      // 33f: aload 29
      // 341: athrow
      // 342: aload 24
      // 344: areturn
   }

   private List L(Object[] param1) {
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
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast com/zelix/loq
      // 019: astore 5
      // 01b: pop
      // 01c: getstatic com/zelix/hn.c J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 23440562887150
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 98666196278190
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 29297240264723
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 18919437525766
      // 03c: lxor
      // 03d: lstore 12
      // 03f: dup2
      // 040: ldc2_w 137820357693509
      // 043: lxor
      // 044: lstore 14
      // 046: dup2
      // 047: ldc2_w 64450884409408
      // 04a: lxor
      // 04b: lstore 16
      // 04d: dup2
      // 04e: ldc2_w 25634397142217
      // 051: lxor
      // 052: lstore 18
      // 054: dup2
      // 055: ldc2_w 77920196949798
      // 058: lxor
      // 059: lstore 20
      // 05b: dup2
      // 05c: ldc2_w 75927529292191
      // 05f: lxor
      // 060: lstore 22
      // 062: dup2
      // 063: ldc2_w 35458394540968
      // 066: lxor
      // 067: lstore 24
      // 069: dup2
      // 06a: ldc2_w 82941426850797
      // 06d: lxor
      // 06e: lstore 26
      // 070: dup2
      // 071: ldc2_w 75946670011838
      // 074: lxor
      // 075: lstore 28
      // 077: pop2
      // 078: lload 14
      // 07a: bipush 1
      // 07b: anewarray 836
      // 07e: dup_x2
      // 07f: dup_x2
      // 080: pop
      // 081: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 084: bipush 0
      // 085: swap
      // 086: aastore
      // 087: ldc2_w 8368243064929784003
      // 08a: lload 2
      // 08b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: astore 31
      // 092: ldc2_w 7504351290740941218
      // 095: lload 2
      // 096: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: new java/util/ArrayList
      // 09e: dup
      // 09f: invokespecial java/util/ArrayList.<init> ()V
      // 0a2: astore 32
      // 0a4: istore 30
      // 0a6: bipush 0
      // 0a7: istore 33
      // 0a9: aconst_null
      // 0aa: astore 34
      // 0ac: bipush 0
      // 0ad: istore 35
      // 0af: iload 35
      // 0b1: aload 4
      // 0b3: invokeinterface java/util/List.size ()I 1
      // 0b8: if_icmpge 4d5
      // 0bb: aload 4
      // 0bd: iload 35
      // 0bf: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0c4: checkcast com/zelix/lml
      // 0c7: astore 36
      // 0c9: aload 36
      // 0cb: lload 28
      // 0cd: bipush 1
      // 0ce: anewarray 836
      // 0d1: dup_x2
      // 0d2: dup_x2
      // 0d3: pop
      // 0d4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0d7: bipush 0
      // 0d8: swap
      // 0d9: aastore
      // 0da: ldc2_w 8539555181173194288
      // 0dd: lload 2
      // 0de: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: astore 37
      // 0e5: iload 35
      // 0e7: iload 30
      // 0e9: lload 2
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 16a
      // 0ef: ifne 168
      // 0f2: ifne 141
      // 0f5: goto 102
      // 0f8: ldc2_w 8210709177875771177
      // 0fb: lload 2
      // 0fc: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 101: athrow
      // 102: aload 0
      // 103: aload 32
      // 105: aload 36
      // 107: lload 24
      // 109: bipush 3
      // 10a: anewarray 836
      // 10d: dup_x2
      // 10e: dup_x2
      // 10f: pop
      // 110: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 113: bipush 2
      // 114: swap
      // 115: aastore
      // 116: dup_x1
      // 117: swap
      // 118: bipush 1
      // 119: swap
      // 11a: aastore
      // 11b: dup_x1
      // 11c: swap
      // 11d: bipush 0
      // 11e: swap
      // 11f: aastore
      // 120: ldc2_w 7857189148457375186
      // 123: lload 2
      // 124: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: lload 2
      // 12a: lconst_0
      // 12b: lcmp
      // 12c: iflt 411
      // 12f: iload 30
      // 131: ifeq 40d
      // 134: goto 141
      // 137: ldc2_w 8210709177875771177
      // 13a: lload 2
      // 13b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 140: athrow
      // 141: aload 36
      // 143: lload 8
      // 145: bipush 1
      // 146: anewarray 836
      // 149: dup_x2
      // 14a: dup_x2
      // 14b: pop
      // 14c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14f: bipush 0
      // 150: swap
      // 151: aastore
      // 152: ldc2_w 7682914055505721490
      // 155: lload 2
      // 156: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15b: goto 168
      // 15e: ldc2_w 8210709177875771177
      // 161: lload 2
      // 162: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 167: athrow
      // 168: iload 30
      // 16a: ifne 1a4
      // 16d: ifeq 3a6
      // 170: goto 17d
      // 173: ldc2_w 8210709177875771177
      // 176: lload 2
      // 177: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17c: athrow
      // 17d: aload 34
      // 17f: lload 8
      // 181: bipush 1
      // 182: anewarray 836
      // 185: dup_x2
      // 186: dup_x2
      // 187: pop
      // 188: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18b: bipush 0
      // 18c: swap
      // 18d: aastore
      // 18e: ldc2_w 7682914055505721490
      // 191: lload 2
      // 192: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: goto 1a4
      // 19a: ldc2_w 8210709177875771177
      // 19d: lload 2
      // 19e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a3: athrow
      // 1a4: ifeq 356
      // 1a7: new java/util/ArrayList
      // 1aa: dup
      // 1ab: aload 32
      // 1ad: invokeinterface java/util/List.size ()I 1
      // 1b2: invokespecial java/util/ArrayList.<init> (I)V
      // 1b5: astore 38
      // 1b7: aload 32
      // 1b9: ldc2_w 8598788705114585351
      // 1bc: lload 2
      // 1bd: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/ListIterator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: astore 39
      // 1c4: aload 39
      // 1c6: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 1cb: ifeq 2e7
      // 1ce: aload 39
      // 1d0: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 1d5: checkcast com/zelix/zh
      // 1d8: astore 40
      // 1da: aload 39
      // 1dc: invokeinterface java/util/ListIterator.remove ()V 1
      // 1e1: aload 38
      // 1e3: aload 40
      // 1e5: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 1e8: pop
      // 1e9: aload 40
      // 1eb: lload 6
      // 1ed: bipush 1
      // 1ee: anewarray 836
      // 1f1: dup_x2
      // 1f2: dup_x2
      // 1f3: pop
      // 1f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f7: bipush 0
      // 1f8: swap
      // 1f9: aastore
      // 1fa: ldc2_w 8581249670181196303
      // 1fd: lload 2
      // 1fe: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/bn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 203: astore 41
      // 205: bipush 0
      // 206: iload 30
      // 208: ifne 30c
      // 20b: istore 42
      // 20d: iload 42
      // 20f: aload 37
      // 211: invokeinterface java/util/List.size ()I 1
      // 216: if_icmpge 2dc
      // 219: aload 37
      // 21b: iload 42
      // 21d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 222: checkcast com/zelix/uc
      // 225: astore 43
      // 227: aload 43
      // 229: ldc2_w 7680724808462145213
      // 22c: lload 2
      // 22d: invokedynamic v (Ljava/lang/Object;JJ)Lcom/zelix/bn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: astore 44
      // 234: iload 30
      // 236: lload 2
      // 237: lconst_0
      // 238: lcmp
      // 239: ifle 2d9
      // 23c: ifne 2d7
      // 23f: aload 0
      // 240: aload 41
      // 242: aload 44
      // 244: aload 31
      // 246: aload 5
      // 248: lload 10
      // 24a: bipush 5
      // 24b: anewarray 836
      // 24e: dup_x2
      // 24f: dup_x2
      // 250: pop
      // 251: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 254: bipush 4
      // 255: swap
      // 256: aastore
      // 257: dup_x1
      // 258: swap
      // 259: bipush 3
      // 25a: swap
      // 25b: aastore
      // 25c: dup_x1
      // 25d: swap
      // 25e: bipush 2
      // 25f: swap
      // 260: aastore
      // 261: dup_x1
      // 262: swap
      // 263: bipush 1
      // 264: swap
      // 265: aastore
      // 266: dup_x1
      // 267: swap
      // 268: bipush 0
      // 269: swap
      // 26a: aastore
      // 26b: ldc2_w 7601429840236129115
      // 26e: lload 2
      // 26f: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 274: iload 30
      // 276: ifne 1cb
      // 279: lload 2
      // 27a: lconst_0
      // 27b: lcmp
      // 27c: iflt 206
      // 27f: goto 28c
      // 282: ldc2_w 8210709177875771177
      // 285: lload 2
      // 286: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: athrow
      // 28c: ifeq 2d4
      // 28f: aload 40
      // 291: ldc2_w 8456890404017004901
      // 294: lload 2
      // 295: invokedynamic w (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: checkcast com/zelix/zh
      // 29d: astore 45
      // 29f: aload 45
      // 2a1: lload 26
      // 2a3: aload 36
      // 2a5: aload 44
      // 2a7: bipush 3
      // 2a8: anewarray 836
      // 2ab: dup_x1
      // 2ac: swap
      // 2ad: bipush 2
      // 2ae: swap
      // 2af: aastore
      // 2b0: dup_x1
      // 2b1: swap
      // 2b2: bipush 1
      // 2b3: swap
      // 2b4: aastore
      // 2b5: dup_x2
      // 2b6: dup_x2
      // 2b7: pop
      // 2b8: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2bb: bipush 0
      // 2bc: swap
      // 2bd: aastore
      // 2be: ldc2_w 8532799744044969471
      // 2c1: lload 2
      // 2c2: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: aload 39
      // 2c9: aload 45
      // 2cb: ldc2_w 8267619612520038628
      // 2ce: lload 2
      // 2cf: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d4: iinc 42 1
      // 2d7: iload 30
      // 2d9: ifeq 20d
      // 2dc: iload 30
      // 2de: lload 2
      // 2df: lconst_0
      // 2e0: lcmp
      // 2e1: iflt 1cb
      // 2e4: ifeq 1c4
      // 2e7: lload 2
      // 2e8: lconst_0
      // 2e9: lcmp
      // 2ea: ifle 313
      // 2ed: aload 32
      // 2ef: iload 30
      // 2f1: lload 2
      // 2f2: lconst_0
      // 2f3: lcmp
      // 2f4: ifle 0bf
      // 2f7: ifne 311
      // 2fa: invokeinterface java/util/List.size ()I 1
      // 2ff: goto 30c
      // 302: ldc2_w 8210709177875771177
      // 305: lload 2
      // 306: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: athrow
      // 30c: ifne 34b
      // 30f: aload 38
      // 311: astore 32
      // 313: aload 0
      // 314: lload 20
      // 316: aload 36
      // 318: aload 32
      // 31a: aload 37
      // 31c: iload 33
      // 31e: bipush 5
      // 31f: anewarray 836
      // 322: dup_x1
      // 323: swap
      // 324: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 327: bipush 4
      // 328: swap
      // 329: aastore
      // 32a: dup_x1
      // 32b: swap
      // 32c: bipush 3
      // 32d: swap
      // 32e: aastore
      // 32f: dup_x1
      // 330: swap
      // 331: bipush 2
      // 332: swap
      // 333: aastore
      // 334: dup_x1
      // 335: swap
      // 336: bipush 1
      // 337: swap
      // 338: aastore
      // 339: dup_x2
      // 33a: dup_x2
      // 33b: pop
      // 33c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 33f: bipush 0
      // 340: swap
      // 341: aastore
      // 342: ldc2_w 7649444257547139614
      // 345: lload 2
      // 346: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34b: lload 2
      // 34c: lconst_0
      // 34d: lcmp
      // 34e: iflt 411
      // 351: iload 30
      // 353: ifeq 40d
      // 356: aload 0
      // 357: lload 20
      // 359: aload 36
      // 35b: aload 32
      // 35d: aload 37
      // 35f: iload 33
      // 361: bipush 5
      // 362: anewarray 836
      // 365: dup_x1
      // 366: swap
      // 367: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 36a: bipush 4
      // 36b: swap
      // 36c: aastore
      // 36d: dup_x1
      // 36e: swap
      // 36f: bipush 3
      // 370: swap
      // 371: aastore
      // 372: dup_x1
      // 373: swap
      // 374: bipush 2
      // 375: swap
      // 376: aastore
      // 377: dup_x1
      // 378: swap
      // 379: bipush 1
      // 37a: swap
      // 37b: aastore
      // 37c: dup_x2
      // 37d: dup_x2
      // 37e: pop
      // 37f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 382: bipush 0
      // 383: swap
      // 384: aastore
      // 385: ldc2_w 7649444257547139614
      // 388: lload 2
      // 389: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: lload 2
      // 38f: lconst_0
      // 390: lcmp
      // 391: ifle 411
      // 394: iload 30
      // 396: ifeq 40d
      // 399: goto 3a6
      // 39c: ldc2_w 8210709177875771177
      // 39f: lload 2
      // 3a0: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a5: athrow
      // 3a6: aload 32
      // 3a8: ldc2_w 8598788705114585351
      // 3ab: lload 2
      // 3ac: invokedynamic w (Ljava/lang/Object;JJ)Ljava/util/ListIterator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b1: astore 38
      // 3b3: aload 38
      // 3b5: invokeinterface java/util/ListIterator.hasNext ()Z 1
      // 3ba: ifeq 40d
      // 3bd: aload 38
      // 3bf: invokeinterface java/util/ListIterator.next ()Ljava/lang/Object; 1
      // 3c4: checkcast com/zelix/zh
      // 3c7: astore 39
      // 3c9: aload 39
      // 3cb: lload 16
      // 3cd: aload 36
      // 3cf: bipush 2
      // 3d0: anewarray 836
      // 3d3: dup_x1
      // 3d4: swap
      // 3d5: bipush 1
      // 3d6: swap
      // 3d7: aastore
      // 3d8: dup_x2
      // 3d9: dup_x2
      // 3da: pop
      // 3db: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3de: bipush 0
      // 3df: swap
      // 3e0: aastore
      // 3e1: ldc2_w 7780687620586618863
      // 3e4: lload 2
      // 3e5: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ea: iload 30
      // 3ec: lload 2
      // 3ed: lconst_0
      // 3ee: lcmp
      // 3ef: iflt 413
      // 3f2: ifne 411
      // 3f5: iload 30
      // 3f7: ifeq 3b3
      // 3fa: lload 2
      // 3fb: lconst_0
      // 3fc: lcmp
      // 3fd: ifle 3ea
      // 400: goto 40d
      // 403: ldc2_w 8210709177875771177
      // 406: lload 2
      // 407: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40c: athrow
      // 40d: aload 36
      // 40f: astore 34
      // 411: iload 33
      // 413: iload 30
      // 415: lload 2
      // 416: lconst_0
      // 417: lcmp
      // 418: iflt 464
      // 41b: ifne 451
      // 41e: ifne 44a
      // 421: goto 42e
      // 424: ldc2_w 8210709177875771177
      // 427: lload 2
      // 428: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 42d: athrow
      // 42e: aload 36
      // 430: lload 8
      // 432: bipush 1
      // 433: anewarray 836
      // 436: dup_x2
      // 437: dup_x2
      // 438: pop
      // 439: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 43c: bipush 0
      // 43d: swap
      // 43e: aastore
      // 43f: ldc2_w 7682914055505721490
      // 442: lload 2
      // 443: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 448: istore 33
      // 44a: aload 32
      // 44c: invokeinterface java/util/List.size ()I 1
      // 451: lload 2
      // 452: lconst_0
      // 453: lcmp
      // 454: ifle 4d2
      // 457: sipush 11627
      // 45a: ldc2_w 7821964997894340828
      // 45d: lload 2
      // 45e: lxor
      // 45f: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 464: if_icmple 4cd
      // 467: new com/zelix/a6
      // 46a: dup
      // 46b: new java/lang/StringBuilder
      // 46e: dup
      // 46f: invokespecial java/lang/StringBuilder.<init> ()V
      // 472: sipush 7523
      // 475: ldc2_w 1238137490771322287
      // 478: lload 2
      // 479: lxor
      // 47a: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 482: aload 32
      // 484: invokeinterface java/util/List.size ()I 1
      // 489: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 48c: sipush 13063
      // 48f: ldc2_w 302599542462581698
      // 492: lload 2
      // 493: lxor
      // 494: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 499: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 49c: sipush 11627
      // 49f: ldc2_w 7821964997894340828
      // 4a2: lload 2
      // 4a3: lxor
      // 4a4: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4ac: sipush 29566
      // 4af: ldc2_w 6974896822876916642
      // 4b2: lload 2
      // 4b3: lxor
      // 4b4: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4b9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4bc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4bf: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 4c2: athrow
      // 4c3: ldc2_w 8210709177875771177
      // 4c6: lload 2
      // 4c7: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4cc: athrow
      // 4cd: iinc 35 1
      // 4d0: iload 30
      // 4d2: ifeq 0af
      // 4d5: new java/util/ArrayList
      // 4d8: dup
      // 4d9: aload 32
      // 4db: invokeinterface java/util/List.size ()I 1
      // 4e0: invokespecial java/util/ArrayList.<init> (I)V
      // 4e3: lload 2
      // 4e4: lconst_0
      // 4e5: lcmp
      // 4e6: ifle 0c4
      // 4e9: astore 35
      // 4eb: bipush 0
      // 4ec: istore 36
      // 4ee: iload 36
      // 4f0: aload 32
      // 4f2: invokeinterface java/util/List.size ()I 1
      // 4f7: if_icmpge 53d
      // 4fa: aload 35
      // 4fc: new com/zelix/y7
      // 4ff: dup
      // 500: aload 32
      // 502: iload 36
      // 504: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 509: lload 22
      // 50b: dup2_x1
      // 50c: pop2
      // 50d: checkcast com/zelix/zh
      // 510: invokespecial com/zelix/y7.<init> (JLcom/zelix/zh;)V
      // 513: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 516: pop
      // 517: iinc 36 1
      // 51a: iload 30
      // 51c: lload 2
      // 51d: lconst_0
      // 51e: lcmp
      // 51f: ifle 527
      // 522: ifne 5d9
      // 525: iload 30
      // 527: ifeq 4ee
      // 52a: lload 2
      // 52b: lconst_0
      // 52c: lcmp
      // 52d: ifle 51a
      // 530: goto 53d
      // 533: ldc2_w 8210709177875771177
      // 536: lload 2
      // 537: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53c: athrow
      // 53d: aload 32
      // 53f: invokeinterface java/util/List.size ()I 1
      // 544: iload 30
      // 546: lload 2
      // 547: lconst_0
      // 548: lcmp
      // 549: iflt 55c
      // 54c: ifne 5da
      // 54f: sipush 21625
      // 552: ldc2_w 8393943717227657671
      // 555: lload 2
      // 556: lxor
      // 557: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55c: if_icmple 5d2
      // 55f: goto 56c
      // 562: ldc2_w 8210709177875771177
      // 565: lload 2
      // 566: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56b: athrow
      // 56c: new com/zelix/a6
      // 56f: dup
      // 570: new java/lang/StringBuilder
      // 573: dup
      // 574: invokespecial java/lang/StringBuilder.<init> ()V
      // 577: sipush 30286
      // 57a: ldc2_w 4306585396662619795
      // 57d: lload 2
      // 57e: lxor
      // 57f: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 584: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 587: aload 32
      // 589: invokeinterface java/util/List.size ()I 1
      // 58e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 591: sipush 16549
      // 594: ldc2_w 974686310071531622
      // 597: lload 2
      // 598: lxor
      // 599: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a1: sipush 21625
      // 5a4: ldc2_w 8393943717227657671
      // 5a7: lload 2
      // 5a8: lxor
      // 5a9: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5ae: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5b1: sipush 16319
      // 5b4: ldc2_w 813042734667302768
      // 5b7: lload 2
      // 5b8: lxor
      // 5b9: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5c4: invokespecial com/zelix/a6.<init> (Ljava/lang/String;)V
      // 5c7: athrow
      // 5c8: ldc2_w 8210709177875771177
      // 5cb: lload 2
      // 5cc: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d1: athrow
      // 5d2: aload 35
      // 5d4: invokevirtual java/util/ArrayList.size ()I
      // 5d7: istore 36
      // 5d9: bipush 0
      // 5da: istore 37
      // 5dc: iload 37
      // 5de: aload 35
      // 5e0: invokevirtual java/util/ArrayList.size ()I
      // 5e3: bipush 1
      // 5e4: isub
      // 5e5: if_icmpge 6bb
      // 5e8: aload 35
      // 5ea: iload 37
      // 5ec: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 5ef: checkcast com/zelix/y7
      // 5f2: astore 38
      // 5f4: aload 35
      // 5f6: iload 30
      // 5f8: lload 2
      // 5f9: lconst_0
      // 5fa: lcmp
      // 5fb: ifle 605
      // 5fe: ifne 6c3
      // 601: iload 37
      // 603: bipush 1
      // 604: iadd
      // 605: ldc2_w 8083008671339863617
      // 608: lload 2
      // 609: invokedynamic w (Ljava/lang/Object;IJJ)Ljava/util/ListIterator; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60e: astore 39
      // 610: aload 39
      // 612: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 617: ifeq 6ad
      // 61a: aload 39
      // 61c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 621: checkcast com/zelix/y7
      // 624: astore 40
      // 626: lload 2
      // 627: lconst_0
      // 628: lcmp
      // 629: ifle 6a1
      // 62c: aload 38
      // 62e: aload 40
      // 630: iload 30
      // 632: ifne 684
      // 635: lload 12
      // 637: bipush 2
      // 638: anewarray 836
      // 63b: dup_x2
      // 63c: dup_x2
      // 63d: pop
      // 63e: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 641: bipush 1
      // 642: swap
      // 643: aastore
      // 644: dup_x1
      // 645: swap
      // 646: bipush 0
      // 647: swap
      // 648: aastore
      // 649: ldc2_w 7508560956026829942
      // 64c: lload 2
      // 64d: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 652: iload 30
      // 654: ifne 5de
      // 657: lload 2
      // 658: lconst_0
      // 659: lcmp
      // 65a: ifle 6c6
      // 65d: goto 66a
      // 660: ldc2_w 8210709177875771177
      // 663: lload 2
      // 664: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 669: athrow
      // 66a: lload 2
      // 66b: lconst_0
      // 66c: lcmp
      // 66d: ifle 6aa
      // 670: ifeq 6a8
      // 673: aload 38
      // 675: aload 40
      // 677: goto 684
      // 67a: ldc2_w 8210709177875771177
      // 67d: lload 2
      // 67e: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 683: athrow
      // 684: lload 18
      // 686: bipush 2
      // 687: anewarray 836
      // 68a: dup_x2
      // 68b: dup_x2
      // 68c: pop
      // 68d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 690: bipush 1
      // 691: swap
      // 692: aastore
      // 693: dup_x1
      // 694: swap
      // 695: bipush 0
      // 696: swap
      // 697: aastore
      // 698: ldc2_w 8631129995512427740
      // 69b: lload 2
      // 69c: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6a1: aload 39
      // 6a3: invokeinterface java/util/Iterator.remove ()V 1
      // 6a8: iload 30
      // 6aa: ifeq 610
      // 6ad: iinc 37 1
      // 6b0: iload 30
      // 6b2: lload 2
      // 6b3: lconst_0
      // 6b4: lcmp
      // 6b5: ifle 5de
      // 6b8: ifeq 5dc
      // 6bb: lload 2
      // 6bc: lconst_0
      // 6bd: lcmp
      // 6be: iflt 5e8
      // 6c1: aload 35
      // 6c3: invokevirtual java/util/ArrayList.size ()I
      // 6c6: iload 36
      // 6c8: if_icmplt 5d2
      // 6cb: aload 35
      // 6cd: iload 30
      // 6cf: lload 2
      // 6d0: lconst_0
      // 6d1: lcmp
      // 6d2: iflt 5ec
      // 6d5: ifne 6c3
      // 6d8: areturn
   }

   public String J(Object[] param1) {
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
      // 004: checkcast java/lang/String
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
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 2
      // 01d: dup
      // 01e: bipush 3
      // 01f: aaload
      // 020: checkcast java/lang/Integer
      // 023: invokevirtual java/lang/Integer.intValue ()I
      // 026: istore 5
      // 028: pop
      // 029: getstatic com/zelix/hn.c J
      // 02c: lload 3
      // 02d: lxor
      // 02e: lstore 3
      // 02f: lload 3
      // 030: dup2
      // 031: ldc2_w 123927744201958
      // 034: lxor
      // 035: lstore 7
      // 037: dup2
      // 038: ldc2_w 19962448283631
      // 03b: lxor
      // 03c: lstore 9
      // 03e: pop2
      // 03f: ldc2_w -4700421117021579848
      // 042: lload 3
      // 043: invokedynamic n (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: new java/lang/StringBuilder
      // 04b: dup
      // 04c: invokespecial java/lang/StringBuilder.<init> ()V
      // 04f: astore 12
      // 051: istore 11
      // 053: new com/zelix/zr
      // 056: dup
      // 057: invokespecial com/zelix/zr.<init> ()V
      // 05a: astore 13
      // 05c: aload 0
      // 05d: lload 9
      // 05f: aload 6
      // 061: iload 2
      // 062: iload 5
      // 064: aload 13
      // 066: bipush 5
      // 067: anewarray 836
      // 06a: dup_x1
      // 06b: swap
      // 06c: bipush 4
      // 06d: swap
      // 06e: aastore
      // 06f: dup_x1
      // 070: swap
      // 071: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 074: bipush 3
      // 075: swap
      // 076: aastore
      // 077: dup_x1
      // 078: swap
      // 079: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 07c: bipush 2
      // 07d: swap
      // 07e: aastore
      // 07f: dup_x1
      // 080: swap
      // 081: bipush 1
      // 082: swap
      // 083: aastore
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w -4695110983957571977
      // 090: lload 3
      // 091: invokedynamic o (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: astore 14
      // 098: aload 13
      // 09a: invokevirtual com/zelix/zr.S ()Z
      // 09d: iload 11
      // 09f: ifeq 0e7
      // 0a2: ifne 0e4
      // 0a5: goto 0b2
      // 0a8: ldc2_w -4650994442713636433
      // 0ab: lload 3
      // 0ac: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: athrow
      // 0b2: aload 12
      // 0b4: sipush 5653
      // 0b7: ldc2_w 6931736238971674691
      // 0ba: lload 3
      // 0bb: lxor
      // 0bc: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c4: pop
      // 0c5: aload 12
      // 0c7: getstatic com/zelix/_e.n Ljava/lang/String;
      // 0ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cd: pop
      // 0ce: aload 12
      // 0d0: getstatic com/zelix/_e.n Ljava/lang/String;
      // 0d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d6: pop
      // 0d7: goto 0e4
      // 0da: ldc2_w -4650994442713636433
      // 0dd: lload 3
      // 0de: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: athrow
      // 0e4: aload 14
      // 0e6: arraylength
      // 0e7: iload 11
      // 0e9: lload 3
      // 0ea: lconst_0
      // 0eb: lcmp
      // 0ec: ifle 0f3
      // 0ef: ifeq 1d7
      // 0f2: bipush 1
      // 0f3: if_icmpne 181
      // 0f6: goto 103
      // 0f9: ldc2_w -4650994442713636433
      // 0fc: lload 3
      // 0fd: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 102: athrow
      // 103: lload 3
      // 104: lconst_0
      // 105: lcmp
      // 106: iflt 15f
      // 109: iload 2
      // 10a: ifeq 13a
      // 10d: goto 11a
      // 110: ldc2_w -4650994442713636433
      // 113: lload 3
      // 114: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 119: athrow
      // 11a: lload 3
      // 11b: lconst_0
      // 11c: lcmp
      // 11d: iflt 176
      // 120: aload 0
      // 121: ldc2_w -4633470352802872584
      // 124: lload 3
      // 125: invokedynamic p (Ljava/lang/Object;JJ)Lcom/zelix/s4; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12a: ifnonnull 16c
      // 12d: goto 13a
      // 130: ldc2_w -4650994442713636433
      // 133: lload 3
      // 134: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: aload 12
      // 13c: sipush 24772
      // 13f: ldc2_w 7551163137587517064
      // 142: lload 3
      // 143: lxor
      // 144: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14c: pop
      // 14d: aload 12
      // 14f: getstatic com/zelix/_e.n Ljava/lang/String;
      // 152: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 155: pop
      // 156: aload 12
      // 158: getstatic com/zelix/_e.n Ljava/lang/String;
      // 15b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15e: pop
      // 15f: goto 16c
      // 162: ldc2_w -4650994442713636433
      // 165: lload 3
      // 166: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16b: athrow
      // 16c: aload 12
      // 16e: aload 14
      // 170: bipush 0
      // 171: aaload
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 175: pop
      // 176: lload 3
      // 177: lconst_0
      // 178: lcmp
      // 179: iflt 2fb
      // 17c: iload 11
      // 17e: ifne 2fb
      // 181: aload 12
      // 183: new java/lang/StringBuilder
      // 186: dup
      // 187: invokespecial java/lang/StringBuilder.<init> ()V
      // 18a: sipush 25728
      // 18d: ldc2_w 6394290182147609288
      // 190: lload 3
      // 191: lxor
      // 192: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 197: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 19a: aload 14
      // 19c: arraylength
      // 19d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1a0: sipush 18178
      // 1a3: ldc2_w 7909370631339749701
      // 1a6: lload 3
      // 1a7: lxor
      // 1a8: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ad: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1b6: pop
      // 1b7: aload 12
      // 1b9: getstatic com/zelix/_e.n Ljava/lang/String;
      // 1bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1bf: pop
      // 1c0: aload 12
      // 1c2: getstatic com/zelix/_e.n Ljava/lang/String;
      // 1c5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c8: pop
      // 1c9: bipush 0
      // 1ca: goto 1d7
      // 1cd: ldc2_w -4650994442713636433
      // 1d0: lload 3
      // 1d1: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d6: athrow
      // 1d7: istore 15
      // 1d9: iload 15
      // 1db: aload 14
      // 1dd: arraylength
      // 1de: if_icmpge 2fb
      // 1e1: new java/lang/StringBuilder
      // 1e4: dup
      // 1e5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1e8: sipush 31191
      // 1eb: ldc2_w 3563962823073763226
      // 1ee: lload 3
      // 1ef: lxor
      // 1f0: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1f8: iload 15
      // 1fa: bipush 1
      // 1fb: iadd
      // 1fc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1ff: sipush 26364
      // 202: ldc2_w 8490217537470075048
      // 205: lload 3
      // 206: lxor
      // 207: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20f: aload 14
      // 211: arraylength
      // 212: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 215: sipush 21555
      // 218: ldc2_w 7678119552736928362
      // 21b: lload 3
      // 21c: lxor
      // 21d: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 222: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 225: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 228: astore 16
      // 22a: aload 12
      // 22c: new java/lang/StringBuilder
      // 22f: dup
      // 230: invokespecial java/lang/StringBuilder.<init> ()V
      // 233: aload 16
      // 235: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 238: getstatic com/zelix/_e.n Ljava/lang/String;
      // 23b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 23e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 241: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 244: pop
      // 245: aload 12
      // 247: new java/lang/StringBuilder
      // 24a: dup
      // 24b: invokespecial java/lang/StringBuilder.<init> ()V
      // 24e: aload 16
      // 250: invokevirtual java/lang/String.length ()I
      // 253: lload 7
      // 255: sipush 20657
      // 258: ldc2_w 8328056351189054339
      // 25b: lload 3
      // 25c: lxor
      // 25d: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 262: bipush 3
      // 263: anewarray 836
      // 266: dup_x1
      // 267: swap
      // 268: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 26b: bipush 2
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x2
      // 26f: dup_x2
      // 270: pop
      // 271: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 274: bipush 1
      // 275: swap
      // 276: aastore
      // 277: dup_x1
      // 278: swap
      // 279: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 27c: bipush 0
      // 27d: swap
      // 27e: aastore
      // 27f: ldc2_w -6569721942546551589
      // 282: lload 3
      // 283: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 28b: getstatic com/zelix/_e.n Ljava/lang/String;
      // 28e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 291: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 294: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 297: pop
      // 298: aload 12
      // 29a: aload 14
      // 29c: iload 15
      // 29e: aaload
      // 29f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a2: pop
      // 2a3: iload 11
      // 2a5: lload 3
      // 2a6: lconst_0
      // 2a7: lcmp
      // 2a8: iflt 2f8
      // 2ab: ifeq 2f6
      // 2ae: iload 15
      // 2b0: lload 3
      // 2b1: lconst_0
      // 2b2: lcmp
      // 2b3: iflt 352
      // 2b6: iload 11
      // 2b8: ifeq 352
      // 2bb: goto 2c8
      // 2be: ldc2_w -4650994442713636433
      // 2c1: lload 3
      // 2c2: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c7: athrow
      // 2c8: aload 14
      // 2ca: arraylength
      // 2cb: bipush 1
      // 2cc: isub
      // 2cd: if_icmpge 2f3
      // 2d0: goto 2dd
      // 2d3: ldc2_w -4650994442713636433
      // 2d6: lload 3
      // 2d7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2dc: athrow
      // 2dd: aload 12
      // 2df: getstatic com/zelix/_e.n Ljava/lang/String;
      // 2e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2e5: pop
      // 2e6: goto 2f3
      // 2e9: ldc2_w -4650994442713636433
      // 2ec: lload 3
      // 2ed: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f2: athrow
      // 2f3: iinc 15 1
      // 2f6: iload 11
      // 2f8: ifne 1d9
      // 2fb: aload 0
      // 2fc: ldc2_w -4881233190877509450
      // 2ff: lload 3
      // 300: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 305: iload 11
      // 307: lload 3
      // 308: lconst_0
      // 309: lcmp
      // 30a: iflt 397
      // 30d: ifeq 380
      // 310: ifnull 37b
      // 313: goto 320
      // 316: ldc2_w -4650994442713636433
      // 319: lload 3
      // 31a: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31f: athrow
      // 320: aload 0
      // 321: ldc2_w -4881233190877509450
      // 324: lload 3
      // 325: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: lload 3
      // 32b: lconst_0
      // 32c: lcmp
      // 32d: ifle 380
      // 330: iload 11
      // 332: ifeq 380
      // 335: goto 342
      // 338: ldc2_w -4650994442713636433
      // 33b: lload 3
      // 33c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 341: athrow
      // 342: invokevirtual java/lang/String.length ()I
      // 345: goto 352
      // 348: ldc2_w -4650994442713636433
      // 34b: lload 3
      // 34c: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 351: athrow
      // 352: ifle 37b
      // 355: aload 12
      // 357: getstatic com/zelix/_e.n Ljava/lang/String;
      // 35a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 35d: pop
      // 35e: aload 12
      // 360: aload 0
      // 361: ldc2_w -4881233190877509450
      // 364: lload 3
      // 365: invokedynamic p (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 36d: pop
      // 36e: goto 37b
      // 371: ldc2_w -4650994442713636433
      // 374: lload 3
      // 375: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37a: athrow
      // 37b: aload 12
      // 37d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 380: lload 3
      // 381: lconst_0
      // 382: lcmp
      // 383: iflt 3a0
      // 386: ldc2_w -6471860349521977578
      // 389: lload 3
      // 38a: invokedynamic n (JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38f: ifnonnull 3ad
      // 392: iinc 11 1
      // 395: iload 11
      // 397: ldc2_w -6451434890982427102
      // 39a: lload 3
      // 39b: invokedynamic n (IJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a0: goto 3ad
      // 3a3: ldc2_w -4650994442713636433
      // 3a6: lload 3
      // 3a7: invokedynamic n (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ac: athrow
      // 3ad: areturn
   }

   private lml B(Object[] param1) {
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
      // 04: checkcast com/zelix/o6
      // 07: astore 6
      // 09: dup
      // 0a: bipush 1
      // 0b: aaload
      // 0c: checkcast com/zelix/loq
      // 0f: astore 5
      // 11: dup
      // 12: bipush 2
      // 13: aaload
      // 14: checkcast java/lang/Long
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lstore 3
      // 1b: dup
      // 1c: bipush 3
      // 1d: aaload
      // 1e: checkcast com/zelix/lks
      // 21: astore 2
      // 22: pop
      // 23: getstatic com/zelix/hn.c J
      // 26: lload 3
      // 27: lxor
      // 28: lstore 3
      // 29: lload 3
      // 2a: dup2
      // 2b: ldc2_w 69447357075899
      // 2e: lxor
      // 2f: lstore 7
      // 31: dup2
      // 32: ldc2_w 92575949585965
      // 35: lxor
      // 36: lstore 9
      // 38: dup2
      // 39: ldc2_w 64120118709259
      // 3c: lxor
      // 3d: lstore 11
      // 3f: dup2
      // 40: ldc2_w 124973909019317
      // 43: lxor
      // 44: lstore 13
      // 46: pop2
      // 47: ldc2_w 1567717931763285693
      // 4a: lload 3
      // 4b: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50: bipush 0
      // 51: istore 16
      // 53: istore 15
      // 55: aload 6
      // 57: lload 9
      // 59: bipush 1
      // 5a: anewarray 836
      // 5d: dup_x2
      // 5e: dup_x2
      // 5f: pop
      // 60: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 63: bipush 0
      // 64: swap
      // 65: aastore
      // 66: ldc2_w 1536405076585172479
      // 69: lload 3
      // 6a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: iload 15
      // 71: ifeq cb
      // 74: ifeq e7
      // 77: goto 84
      // 7a: ldc2_w 1473031055300709034
      // 7d: lload 3
      // 7e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: aload 2
      // 85: aload 6
      // 87: lload 13
      // 89: bipush 1
      // 8a: anewarray 836
      // 8d: dup_x2
      // 8e: dup_x2
      // 8f: pop
      // 90: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 93: bipush 0
      // 94: swap
      // 95: aastore
      // 96: ldc2_w 1095656464725733732
      // 99: lload 3
      // 9a: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: lload 11
      // a1: dup2_x1
      // a2: pop2
      // a3: bipush 2
      // a4: anewarray 836
      // a7: dup_x1
      // a8: swap
      // a9: bipush 1
      // aa: swap
      // ab: aastore
      // ac: dup_x2
      // ad: dup_x2
      // ae: pop
      // af: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b2: bipush 0
      // b3: swap
      // b4: aastore
      // b5: ldc2_w 1380872815455075197
      // b8: lload 3
      // b9: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // be: goto cb
      // c1: ldc2_w 1473031055300709034
      // c4: lload 3
      // c5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ca: athrow
      // cb: iload 15
      // cd: ifeq e1
      // d0: ifne e4
      // d3: goto e0
      // d6: ldc2_w 1473031055300709034
      // d9: lload 3
      // da: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // df: athrow
      // e0: bipush 1
      // e1: goto e5
      // e4: bipush 0
      // e5: istore 16
      // e7: new com/zelix/lml
      // ea: dup
      // eb: aload 6
      // ed: lload 7
      // ef: aload 5
      // f1: iload 16
      // f3: invokespecial com/zelix/lml.<init> (Lcom/zelix/o6;JLcom/zelix/loq;Z)V
      // f6: astore 17
      // f8: aload 17
      // fa: areturn
   }

   static {
      long var31 = c ^ 43438838290357L;
      m44.a<"i">(38, 3416131588550819645L, var31);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var23 = 1; var23 < 8; var23++) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[27];
      int var27 = 0;
      String var26 = "é|Ç´ñÅþÖöàF·¥)åÉĠ\u0016\u0011l\u0089Á¦+]A5d8\u0097Ü\u0014ôÎHÕ×+ãî\u001e%\u008a)\u00023(\u008dÒ´\u0081\u0083\\Ì\u001e\u001a=¡½õÙM\u0005M\u0093ò¯&ç\u009b£»\u0089æPY\u0097#`M®\u0010G:Óµ\"¶\u0098§Y\u0006êBÿ@Y ¸©\u0094\u0013ÂßÊGÏ4¾f\u0091\u008c«ü¯\u0094%ßUK'qpgö.^Áô\u0010\u001b\u000f&½K-_\u008dº;|\u0004ü P\u0098xÎ\u008f]qY\u008cÏL/§SÑ÷nÛÉ3\u0000#\u000f\u0013yÅ>Å\u008f\u001b¢]\fI±28ç\u001e\u008aH¥OwêýDþg\u0010ã;Jæc\u007f\\\fn\u001a\u00982oË£7±1Å\u008a`©\u0010Ê5\u008d\u008dÈ7\u0087Z\u00189p3¿É\u0088W-Mêk&×<5Ûi\u0010Ö\u001aÔxÜC.ô%]-ø'ñTO4q\n\u0002\u0085»TõÔÚIÑîéÎ\f\u0013HñÛô\"\u0089\u0003sï/\u009d13b^:v*\u009bØIG\u009c£\u0098B\u0001Ð \u008d\u009fµù\u009cã\u00ad\u0090)û_U[\u0089è\u0085\u0011\u001b¹@¤áËç¯t&\u0006\u0097ê\u0093uç?¯îI²\u0006JÜæAAíTk\u0011ê0UÃd\u0014×ï\u001d\u0097@Õ7Í\u008c\u0096B\u001f \u0081`\u0097éNS¨· Ù²I¶æÿãøUêÍ¡åU(ã`Z5ê\u0004zí\u0082\u008f\u0012àz\u0097\u0095ã3Ë,\u0092\u0082Æ\u000fªÝvçÎ¨¯¬¿NAJGà|Á1A\\\u0005çtH+b\u007fpaÌÅ\u0099\u0083º-0\u0093¬/b²äeï\u007f-\u0093(\u00ad<m0Ü¦Sí³WÝèp\u008a_°\u0010ÅN\u0097*\u009f\u0011\u0002¨A´^_á'\u0001\u001cPâ\u009c6²H\u0010`U\u001f\u0088¸'=\u0010\u0002¡ÔH1âw-'¤ì\u0012Ó»TMkt\u0013\u0001\u000ef-ÚEÌVz\\ß+R$Ôx=\u0092Ó{ÛS\u0017P\u009f\u0081mrþ\u0095:09*s2\u001bù,\f§¿s²\u0089È\u0015¦\u001e\u00809\u0018ù2?Xnr\u0087\u0001c¯xÛ¬\u001eB\n\u001f 0\u0086\u0015§º\u0086ò\u0099ºÌU\u0088)\u001fð K\u0010Ã(\u000f\u009c®Y\u000eV¶k¼d\u0002òþ!nâ.ò®Í=º\u009d\u009f\u001a®»¤J\u0010îðÍ\u00877R{ß\u000b\u0015>\u0083\u0099WQêhÙ³¨Ü\u008cé\u0084ÖUYôO\\\u0011G¢úN{D§´£N)u+Æ,MÏÛ\u009e³¶q\u0082\u00866î´\u001bH\u0085Èü\u0088.O×ÜÒ\u009e:h~JÅûRØ®\u009a=\u0010\u0004°_]m«\u0012\u0087X\u0019& ½Ò<Zì;\\!¤Ï~/b\u0006F1\u0087 ^\u00842&Ã8;®¤PÃÖ\u0012Å\u0084âÙ@yþ¤/\u009c\u0015)·[2Å\u0089ÅM!E\u0010¿`Ë®Ù\u009abÞ\u0082\u00045wüÈÌnñÎó\u001e¥\u0097léÛ\u008d5íÅ\b\u009a\u001fE\u0082#<üÙï\u0006m¤\u008c\u0016\u0006ñ\u0086\u0018Ã\u00878\u0091qÌá@h,]°Â(CµUÞª$\u009dîýöî\u008c\u0013\u0084Hvñsð\u0001øð\u0006Wm«»ü\u008c\u001b+¡\u0093\u0086Ìlø·\u008d.{£\u0011A/\u00175C+\u007f\u0092\u001caca±ÂÖ\u0010\u0003¨å«aÙ\u008dü{ÖÚL1zº)\u0010Ö8\u001déB .á¥r?\b4ºd\\ ¥\u0017\u007fX\"üô\u000e&ö°g\u0019Ë\rj¢ W \u000fy\u000eìÂ$fOËII\f\u0010¹¬?$8É³¢$Åu ¯ç8Þ((Af\bÒ,6p¤\u009fÛÆ¦oÞm_Ú\u009dÉ.I+ûÜ`\u0095IzÅÊº\u00ad3yºT\rEd\u0010K¾ä\u008aÖ\u0099L\u0015ì\u007fLçÉà¢*HdïP1o©æØ·Ã\u0000Ú\u000eÑs\u009c DM\u001aZ\u0003»p\u001d<Ý¡\u0000Y?/\u0092~³îz¦è9]IÅ\u0083*åÜ\u008d\u009e4Bò\u0096\u008c6\u001d\u009d\u0088¬\u007f\u0007[Ð¿ÿ¡u9vÁÐÑPnb\u001dW\u0004\u0099}N¯\u009aÿr\u0001Âñ}Ówó8ibCë~G\u00adJ\u0001VÅV=éøV£\u000fÜ×\u0084\u009cü\u008ap*/Å\t\u0092\u009ek;b{&hg©}½ó²Ac\u001aÏÿ\u001cqèÅI¾Ê\u000fÌÿw\u0096HÞb\u0093¥\u0087Ù\u000eé\u0003Ä\u0085\u009b#ÈÎ\u0087Ceî½a;½¥\u009cF#\u001b4gs\u001a\u00adB\u008e¯Ö«\u0090ýÝý»§\u008d\u0015=Ô)Ù}\t\u001bß=âS \u0088\u001a\u008c×\u0000uÓ\u0012;³Æ\u001c3²\u0010\u008bÀ\u009bë°ÔÅñ\f> \u0007Jt\u0004*h;+\u0085/Ü¹ÿºô@f\u0087I\u0017qþzR¯/ÌÆ_²\u0098Ü?M\u0096\u0006½d°Þ\u00017\u009dÁR*\u008cþ\u001cË\u009d\\\u0002\u008fà\u009fîG¦Ü!µf\u0013Ï¸.\u0094S],\u0096ÿqö\u0080aÆ\u0013n\u008e`Z\u009bB\u009eÞú'8»pò'Ç\n\u001c\u007f:^say)\u001eê\u0091,%AXÇ\u0096-\u008c\f\u0082ÕÇ\u0012ù*\u008fÖ@Áå\u001b>Ðws©\u0088\u0004V¤àüÉ£«â%ÎB\u0013öäÍ£À®×°\u0085SZ\u0011\u0089§aRà\u0086\u009e\u009bg\u009c¼\u009evË\rO\u0098\nú\u001al4;F6Qd\u009a(qq&\u009c½\u0016\u0000ÇK(þHæ\u0086Ã5\u009a~p\n\u0093ªXJ\u0084ZD%Ï\u008aylÃjíÅ\u0087L\u0081ÚêëÚ\u0017\u008b Á\tº«\u008d¨ëe\u0007\u009f\u0092\u0007\u0001\u001eû>ÙèV\u0093zÐ\u0081\u0082Ý¾{W´\b$v\u0013û¯Ýâv\u0010ÿÃ#|\u0084ÑÌôk@=ÀnLW\u0096Ę¡\u00116©\u009c\u008b¶\r\u0097\u007f\u0087\u008dV\u0090y·ë\u0012X\fB«Ö¥\u0091¹\u0088 Ãõ~ÂL¤ô<\rpdÐWLK \u0003Ô\u009fXP1U'î\u0012è\u009e\u0083ÂBS\u000e~ÿ:Xf|\u0013m¼\u0002¢\u0001\u0096{h\t·»\u0097\u0081\u008cm\u0011ZäKÄü?8]cR<G¡\u0093exõ)·Äx\u008d±\u008fÃ\u001at+].¤`\u0098ãE÷-\u00848D\u0000\u0012l^5rÊU\u0006í|Kø|èßIh¾!©ú\u0000ø4GÝ²\r\u0097g\u0013\u009fó¸M¿ìÉRlô'\u008dÊ\u0082(Á\u0011YYäF|\rXR6)7X²zÍ\u0096²Û7cñ©á·¿ËsßÒÞ¬ö\u009f\u008c\r\u0080Øv\u0019\u0000ø9\u001c*Àvö\u0081Ø]N«åÙÿòÀ\"}7Vý\u0090`r\u0097=\u009f2\u0011\u0005,R±Ê\bucxb!\u00905ï òC\ty\u0097=\u0011¶Üùçý\u0092Ð\u001b¢`Xîq$Z";
      int var28 = "é|Ç´ñÅþÖöàF·¥)åÉĠ\u0016\u0011l\u0089Á¦+]A5d8\u0097Ü\u0014ôÎHÕ×+ãî\u001e%\u008a)\u00023(\u008dÒ´\u0081\u0083\\Ì\u001e\u001a=¡½õÙM\u0005M\u0093ò¯&ç\u009b£»\u0089æPY\u0097#`M®\u0010G:Óµ\"¶\u0098§Y\u0006êBÿ@Y ¸©\u0094\u0013ÂßÊGÏ4¾f\u0091\u008c«ü¯\u0094%ßUK'qpgö.^Áô\u0010\u001b\u000f&½K-_\u008dº;|\u0004ü P\u0098xÎ\u008f]qY\u008cÏL/§SÑ÷nÛÉ3\u0000#\u000f\u0013yÅ>Å\u008f\u001b¢]\fI±28ç\u001e\u008aH¥OwêýDþg\u0010ã;Jæc\u007f\\\fn\u001a\u00982oË£7±1Å\u008a`©\u0010Ê5\u008d\u008dÈ7\u0087Z\u00189p3¿É\u0088W-Mêk&×<5Ûi\u0010Ö\u001aÔxÜC.ô%]-ø'ñTO4q\n\u0002\u0085»TõÔÚIÑîéÎ\f\u0013HñÛô\"\u0089\u0003sï/\u009d13b^:v*\u009bØIG\u009c£\u0098B\u0001Ð \u008d\u009fµù\u009cã\u00ad\u0090)û_U[\u0089è\u0085\u0011\u001b¹@¤áËç¯t&\u0006\u0097ê\u0093uç?¯îI²\u0006JÜæAAíTk\u0011ê0UÃd\u0014×ï\u001d\u0097@Õ7Í\u008c\u0096B\u001f \u0081`\u0097éNS¨· Ù²I¶æÿãøUêÍ¡åU(ã`Z5ê\u0004zí\u0082\u008f\u0012àz\u0097\u0095ã3Ë,\u0092\u0082Æ\u000fªÝvçÎ¨¯¬¿NAJGà|Á1A\\\u0005çtH+b\u007fpaÌÅ\u0099\u0083º-0\u0093¬/b²äeï\u007f-\u0093(\u00ad<m0Ü¦Sí³WÝèp\u008a_°\u0010ÅN\u0097*\u009f\u0011\u0002¨A´^_á'\u0001\u001cPâ\u009c6²H\u0010`U\u001f\u0088¸'=\u0010\u0002¡ÔH1âw-'¤ì\u0012Ó»TMkt\u0013\u0001\u000ef-ÚEÌVz\\ß+R$Ôx=\u0092Ó{ÛS\u0017P\u009f\u0081mrþ\u0095:09*s2\u001bù,\f§¿s²\u0089È\u0015¦\u001e\u00809\u0018ù2?Xnr\u0087\u0001c¯xÛ¬\u001eB\n\u001f 0\u0086\u0015§º\u0086ò\u0099ºÌU\u0088)\u001fð K\u0010Ã(\u000f\u009c®Y\u000eV¶k¼d\u0002òþ!nâ.ò®Í=º\u009d\u009f\u001a®»¤J\u0010îðÍ\u00877R{ß\u000b\u0015>\u0083\u0099WQêhÙ³¨Ü\u008cé\u0084ÖUYôO\\\u0011G¢úN{D§´£N)u+Æ,MÏÛ\u009e³¶q\u0082\u00866î´\u001bH\u0085Èü\u0088.O×ÜÒ\u009e:h~JÅûRØ®\u009a=\u0010\u0004°_]m«\u0012\u0087X\u0019& ½Ò<Zì;\\!¤Ï~/b\u0006F1\u0087 ^\u00842&Ã8;®¤PÃÖ\u0012Å\u0084âÙ@yþ¤/\u009c\u0015)·[2Å\u0089ÅM!E\u0010¿`Ë®Ù\u009abÞ\u0082\u00045wüÈÌnñÎó\u001e¥\u0097léÛ\u008d5íÅ\b\u009a\u001fE\u0082#<üÙï\u0006m¤\u008c\u0016\u0006ñ\u0086\u0018Ã\u00878\u0091qÌá@h,]°Â(CµUÞª$\u009dîýöî\u008c\u0013\u0084Hvñsð\u0001øð\u0006Wm«»ü\u008c\u001b+¡\u0093\u0086Ìlø·\u008d.{£\u0011A/\u00175C+\u007f\u0092\u001caca±ÂÖ\u0010\u0003¨å«aÙ\u008dü{ÖÚL1zº)\u0010Ö8\u001déB .á¥r?\b4ºd\\ ¥\u0017\u007fX\"üô\u000e&ö°g\u0019Ë\rj¢ W \u000fy\u000eìÂ$fOËII\f\u0010¹¬?$8É³¢$Åu ¯ç8Þ((Af\bÒ,6p¤\u009fÛÆ¦oÞm_Ú\u009dÉ.I+ûÜ`\u0095IzÅÊº\u00ad3yºT\rEd\u0010K¾ä\u008aÖ\u0099L\u0015ì\u007fLçÉà¢*HdïP1o©æØ·Ã\u0000Ú\u000eÑs\u009c DM\u001aZ\u0003»p\u001d<Ý¡\u0000Y?/\u0092~³îz¦è9]IÅ\u0083*åÜ\u008d\u009e4Bò\u0096\u008c6\u001d\u009d\u0088¬\u007f\u0007[Ð¿ÿ¡u9vÁÐÑPnb\u001dW\u0004\u0099}N¯\u009aÿr\u0001Âñ}Ówó8ibCë~G\u00adJ\u0001VÅV=éøV£\u000fÜ×\u0084\u009cü\u008ap*/Å\t\u0092\u009ek;b{&hg©}½ó²Ac\u001aÏÿ\u001cqèÅI¾Ê\u000fÌÿw\u0096HÞb\u0093¥\u0087Ù\u000eé\u0003Ä\u0085\u009b#ÈÎ\u0087Ceî½a;½¥\u009cF#\u001b4gs\u001a\u00adB\u008e¯Ö«\u0090ýÝý»§\u008d\u0015=Ô)Ù}\t\u001bß=âS \u0088\u001a\u008c×\u0000uÓ\u0012;³Æ\u001c3²\u0010\u008bÀ\u009bë°ÔÅñ\f> \u0007Jt\u0004*h;+\u0085/Ü¹ÿºô@f\u0087I\u0017qþzR¯/ÌÆ_²\u0098Ü?M\u0096\u0006½d°Þ\u00017\u009dÁR*\u008cþ\u001cË\u009d\\\u0002\u008fà\u009fîG¦Ü!µf\u0013Ï¸.\u0094S],\u0096ÿqö\u0080aÆ\u0013n\u008e`Z\u009bB\u009eÞú'8»pò'Ç\n\u001c\u007f:^say)\u001eê\u0091,%AXÇ\u0096-\u008c\f\u0082ÕÇ\u0012ù*\u008fÖ@Áå\u001b>Ðws©\u0088\u0004V¤àüÉ£«â%ÎB\u0013öäÍ£À®×°\u0085SZ\u0011\u0089§aRà\u0086\u009e\u009bg\u009c¼\u009evË\rO\u0098\nú\u001al4;F6Qd\u009a(qq&\u009c½\u0016\u0000ÇK(þHæ\u0086Ã5\u009a~p\n\u0093ªXJ\u0084ZD%Ï\u008aylÃjíÅ\u0087L\u0081ÚêëÚ\u0017\u008b Á\tº«\u008d¨ëe\u0007\u009f\u0092\u0007\u0001\u001eû>ÙèV\u0093zÐ\u0081\u0082Ý¾{W´\b$v\u0013û¯Ýâv\u0010ÿÃ#|\u0084ÑÌôk@=ÀnLW\u0096Ę¡\u00116©\u009c\u008b¶\r\u0097\u007f\u0087\u008dV\u0090y·ë\u0012X\fB«Ö¥\u0091¹\u0088 Ãõ~ÂL¤ô<\rpdÐWLK \u0003Ô\u009fXP1U'î\u0012è\u009e\u0083ÂBS\u000e~ÿ:Xf|\u0013m¼\u0002¢\u0001\u0096{h\t·»\u0097\u0081\u008cm\u0011ZäKÄü?8]cR<G¡\u0093exõ)·Äx\u008d±\u008fÃ\u001at+].¤`\u0098ãE÷-\u00848D\u0000\u0012l^5rÊU\u0006í|Kø|èßIh¾!©ú\u0000ø4GÝ²\r\u0097g\u0013\u009fó¸M¿ìÉRlô'\u008dÊ\u0082(Á\u0011YYäF|\rXR6)7X²zÍ\u0096²Û7cñ©á·¿ËsßÒÞ¬ö\u009f\u008c\r\u0080Øv\u0019\u0000ø9\u001c*Àvö\u0081Ø]N«åÙÿòÀ\"}7Vý\u0090`r\u0097=\u009f2\u0011\u0005,R±Ê\bucxb!\u00905ï òC\ty\u0097=\u0011¶Üùçý\u0092Ð\u001b¢`Xîq$Z"
         .length();
      char var25 = 16;
      int var35 = -1;

      label72:
      while (true) {
         String var36 = var26.substring(++var35, var35 + var25);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var22.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = a(var30).intern();
            switch (var10001) {
               case 0:
                  var29[var27++] = var50;
                  if ((var35 += var25) >= var28) {
                     e = var29;
                     f = new String[27];
                     k = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[11];
                     int var14 = 0;
                     String var15 = "\u0087$b\u0093¦¨2äßSl9¯e\u0017%-»ú¥y\u0018Jè¥ßG\t\u0013w¼ÁÍâ±a\u0098\u009eY\u0091\u0081\u0016OÝA¼\u009f@\u008f\u0087oè_\u0093ðº\u0093èæï5/À@z#Nå \u009d2ï";
                     int var16 = "\u0087$b\u0093¦¨2äßSl9¯e\u0017%-»ú¥y\u0018Jè¥ßG\t\u0013w¼ÁÍâ±a\u0098\u009eY\u0091\u0081\u0016OÝA¼\u009f@\u008f\u0087oè_\u0093ðº\u0093èæï5/À@z#Nå \u009d2ï"
                        .length();
                     byte var13 = 0;

                     label54:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var39 = var17;
                        var10001 = var14++;
                        long var54 = ((long)var18[0] & 255L) << 56
                           | ((long)var18[1] & 255L) << 48
                           | ((long)var18[2] & 255L) << 40
                           | ((long)var18[3] & 255L) << 32
                           | ((long)var18[4] & 255L) << 24
                           | ((long)var18[5] & 255L) << 16
                           | ((long)var18[6] & 255L) << 8
                           | (long)var18[7] & 255L;
                        byte var58 = -1;

                        while (true) {
                           long var19 = var54;
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
                           long var62 = ((long)var21[0] & 255L) << 56
                              | ((long)var21[1] & 255L) << 48
                              | ((long)var21[2] & 255L) << 40
                              | ((long)var21[3] & 255L) << 32
                              | ((long)var21[4] & 255L) << 24
                              | ((long)var21[5] & 255L) << 16
                              | ((long)var21[6] & 255L) << 8
                              | (long)var21[7] & 255L;
                           switch (var58) {
                              case 0:
                                 var39[var10001] = var62;
                                 if (var13 >= var16) {
                                    h = var17;
                                    j = new Integer[11];
                                    o = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4 = "\u009bDR\u0006Òµ\u001dÚþ\u0096XÉ\u008aò\u0011\u0091";
                                    int var5 = "\u009bDR\u0006Òµ\u001dÚþ\u0096XÉ\u008aò\u0011\u0091".length();
                                    byte var2 = 0;

                                    do {
                                       int var47 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var47, var2).getBytes("ISO-8859-1");
                                       var47 = var3++;
                                       long var8 = ((long)var7[0] & 255L) << 56
                                          | ((long)var7[1] & 255L) << 48
                                          | ((long)var7[2] & 255L) << 40
                                          | ((long)var7[3] & 255L) << 32
                                          | ((long)var7[4] & 255L) << 24
                                          | ((long)var7[5] & 255L) << 16
                                          | ((long)var7[6] & 255L) << 8
                                          | (long)var7[7] & 255L;
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
                                       var62 = ((long)var10[0] & 255L) << 56
                                          | ((long)var10[1] & 255L) << 48
                                          | ((long)var10[2] & 255L) << 40
                                          | ((long)var10[3] & 255L) << 32
                                          | ((long)var10[4] & 255L) << 24
                                          | ((long)var10[5] & 255L) << 16
                                          | ((long)var10[6] & 255L) << 8
                                          | (long)var10[7] & 255L;
                                       byte var61 = -1;
                                       var6[var47] = var62;
                                    } while (var2 < var5);

                                    l = var6;
                                    n = new Long[2];
                                    m44.a<"j">(c<"f">(31652, 3741457578523669947L ^ var31), 3500543505824523282L, var31);
                                    return;
                                 }
                                 break;
                              default:
                                 var39[var10001] = var62;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "TËÇFS/]ÔGÜ3n\u000f¤\u000e»";
                                 var16 = "TËÇFS/]ÔGÜ3n\u000f¤\u000e»".length();
                                 var13 = 0;
                           }

                           byte var46 = var13;
                           var13 += 8;
                           var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
                           var39 = var17;
                           var10001 = var14++;
                           var54 = ((long)var18[0] & 255L) << 56
                              | ((long)var18[1] & 255L) << 48
                              | ((long)var18[2] & 255L) << 40
                              | ((long)var18[3] & 255L) << 32
                              | ((long)var18[4] & 255L) << 24
                              | ((long)var18[5] & 255L) << 16
                              | ((long)var18[6] & 255L) << 8
                              | (long)var18[7] & 255L;
                           var58 = 0;
                        }
                     }
                  }

                  var25 = var26.charAt(var35);
                  break;
               default:
                  var29[var27++] = var50;
                  if ((var35 += var25) < var28) {
                     var25 = var26.charAt(var35);
                     continue label72;
                  }

                  var26 = "\u0012k\u0000\u0013t}¥k<Ä\u0093\u0018üë!i1¬d¡ZPo\u001a5õJõp\u009fxB¤ª*@ààe\u001fQ)ñ¬|Ü\u009c2\u001b¨!Ü\u0007\u0091íÝ\u0010¡í¥O\u0082ÑûèúJ\u009d\u009e\u001bª\u000e¹";
                  var28 = "\u0012k\u0000\u0013t}¥k<Ä\u0093\u0018üë!i1¬d¡ZPo\u001a5õJõp\u009fxB¤ª*@ààe\u001fQ)ñ¬|Ü\u009c2\u001b¨!Ü\u0007\u0091íÝ\u0010¡í¥O\u0082ÑûèúJ\u009d\u009e\u001bª\u000e¹"
                     .length();
                  var25 = '8';
                  var35 = -1;
            }

            var36 = var26.substring(++var35, var35 + var25);
            var10001 = 0;
         }
      }
   }

   public static int Z() {
      int var0 = h();
      return var0 == 0 ? 28 : 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private void j(Object[] var1) {
      long var2 = (Long)var1[0];
      lml var6 = (lml)var1[1];
      List var5 = (List)var1[2];
      List var7 = (List)var1[3];
      boolean var4 = (Boolean)var1[4];
      var2 = c ^ var2;
      long var8 = var2 ^ 120277661117710L;
      int var10000 = m44.a<"m">(3192913713862248243L, var2);
      ListIterator var11 = m44.a<"r">(var5, 3123282036551689482L, var2);
      int var10 = var10000;

      while (true) {
         while (var11.hasNext() != 0 || var2 < 0L) {
            label40:
            while (true) {
               zh var12 = (zh)var11.next();
               var11.remove();
               int var13 = 0;

               while (var13 < var7.size()) {
                  uc var14 = (uc)var7.get(var13);
                  bn var15 = m44.a<"s">(var14, 3934530027799038640L, var2);
                  zh var16 = (zh)m44.a<"r">(var12, 2977373816821169512L, var2);
                  Object[] var10006 = new Object[]{null, null, null, var4};
                  var10006[2] = var8;
                  var10006[1] = var15;
                  var10006[0] = var6;
                  m44.a<"r">(var16, var10006, 3883321045012701644L, var2);
                  m44.a<"r">(var11, var16, 3364563347880287465L, var2);
                  var13++;
                  if (var10 == 0) {
                     continue label40;
                  }

                  if (var2 >= 0L) {
                     if (var10 == 0) {
                        break;
                     }
                  } else {
                     var13 = var10;
                  }
               }

               if (var2 > 0L && var10 == 0 && var2 >= 0L) {
                  break;
               }
            }

            return;
         }

         return;
      }
   }

   private boolean O(Object[] param1) {
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
      // 004: checkcast com/zelix/bn
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast com/zelix/bn
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/util/HashMap
      // 016: astore 3
      // 017: dup
      // 018: bipush 3
      // 019: aaload
      // 01a: checkcast com/zelix/loq
      // 01d: astore 4
      // 01f: dup
      // 020: bipush 4
      // 021: aaload
      // 022: checkcast java/lang/Long
      // 025: invokevirtual java/lang/Long.longValue ()J
      // 028: lstore 6
      // 02a: pop
      // 02b: getstatic com/zelix/hn.c J
      // 02e: lload 6
      // 030: lxor
      // 031: lstore 6
      // 033: lload 6
      // 035: dup2
      // 036: ldc2_w 108131272129550
      // 039: lxor
      // 03a: lstore 8
      // 03c: dup2
      // 03d: ldc2_w 15842421111482
      // 040: lxor
      // 041: lstore 10
      // 043: dup2
      // 044: ldc2_w 13505930405024
      // 047: lxor
      // 048: lstore 12
      // 04a: dup2
      // 04b: ldc2_w 101876126945974
      // 04e: lxor
      // 04f: lstore 14
      // 051: pop2
      // 052: aload 0
      // 053: aload 5
      // 055: aload 3
      // 056: aload 4
      // 058: lload 12
      // 05a: bipush 4
      // 05b: anewarray 836
      // 05e: dup_x2
      // 05f: dup_x2
      // 060: pop
      // 061: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 064: bipush 3
      // 065: swap
      // 066: aastore
      // 067: dup_x1
      // 068: swap
      // 069: bipush 2
      // 06a: swap
      // 06b: aastore
      // 06c: dup_x1
      // 06d: swap
      // 06e: bipush 1
      // 06f: swap
      // 070: aastore
      // 071: dup_x1
      // 072: swap
      // 073: bipush 0
      // 074: swap
      // 075: aastore
      // 076: ldc2_w -8314643144548458138
      // 079: lload 6
      // 07b: invokedynamic i (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/gp; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 080: astore 17
      // 082: ldc2_w -8396154049786142714
      // 085: lload 6
      // 087: invokedynamic h (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08c: aload 17
      // 08e: aload 2
      // 08f: bipush 0
      // 090: anewarray 836
      // 093: ldc2_w -7825742495245219202
      // 096: lload 6
      // 098: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: bipush 1
      // 09e: anewarray 836
      // 0a1: dup_x1
      // 0a2: swap
      // 0a3: bipush 0
      // 0a4: swap
      // 0a5: aastore
      // 0a6: ldc2_w -7622952413170068097
      // 0a9: lload 6
      // 0ab: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/ol; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: astore 18
      // 0b2: istore 16
      // 0b4: aload 18
      // 0b6: iload 16
      // 0b8: ifeq 0db
      // 0bb: ifnonnull 0d9
      // 0be: goto 0cc
      // 0c1: ldc2_w -8445875788328610799
      // 0c4: lload 6
      // 0c6: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0cb: athrow
      // 0cc: bipush 0
      // 0cd: ireturn
      // 0ce: ldc2_w -8445875788328610799
      // 0d1: lload 6
      // 0d3: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d8: athrow
      // 0d9: aload 18
      // 0db: bipush 0
      // 0dc: anewarray 836
      // 0df: ldc2_w -7590153719321160412
      // 0e2: lload 6
      // 0e4: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/Enumeration; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: astore 19
      // 0eb: aload 19
      // 0ed: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 0f2: ifeq 310
      // 0f5: aload 19
      // 0f7: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 0fc: checkcast com/zelix/_f
      // 0ff: astore 20
      // 101: aload 2
      // 102: invokevirtual com/zelix/bn.D ()Lcom/zelix/_f;
      // 105: astore 21
      // 107: aload 18
      // 109: aload 20
      // 10b: invokevirtual com/zelix/ol.T (Ljava/lang/Object;)Ljava/util/Map;
      // 10e: astore 22
      // 110: aload 22
      // 112: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 117: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 11c: astore 23
      // 11e: aload 23
      // 120: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 125: ifeq 304
      // 128: aload 23
      // 12a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12f: checkcast java/lang/Integer
      // 132: invokevirtual java/lang/Integer.intValue ()I
      // 135: istore 24
      // 137: iload 24
      // 139: iload 16
      // 13b: ifeq 0f2
      // 13e: iload 16
      // 140: lload 6
      // 142: lconst_0
      // 143: lcmp
      // 144: ifle 13b
      // 147: lload 6
      // 149: lconst_0
      // 14a: lcmp
      // 14b: ifle 1be
      // 14e: ifeq 1bc
      // 151: tableswitch 430 182 185 247 131 227 42
      // 170: ldc2_w -8445875788328610799
      // 173: lload 6
      // 175: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: athrow
      // 17b: aload 4
      // 17d: aload 21
      // 17f: lload 8
      // 181: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 184: aload 20
      // 186: lload 8
      // 188: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 18b: lload 14
      // 18d: bipush 3
      // 18e: anewarray 836
      // 191: dup_x2
      // 192: dup_x2
      // 193: pop
      // 194: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 197: bipush 2
      // 198: swap
      // 199: aastore
      // 19a: dup_x1
      // 19b: swap
      // 19c: bipush 1
      // 19d: swap
      // 19e: aastore
      // 19f: dup_x1
      // 1a0: swap
      // 1a1: bipush 0
      // 1a2: swap
      // 1a3: aastore
      // 1a4: ldc2_w -7738809928199888332
      // 1a7: lload 6
      // 1a9: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ae: goto 1bc
      // 1b1: ldc2_w -8445875788328610799
      // 1b4: lload 6
      // 1b6: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bb: athrow
      // 1bc: iload 16
      // 1be: ifeq 1d3
      // 1c1: ifeq 2ff
      // 1c4: goto 1d2
      // 1c7: ldc2_w -8445875788328610799
      // 1ca: lload 6
      // 1cc: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d1: athrow
      // 1d2: bipush 1
      // 1d3: ireturn
      // 1d4: aload 20
      // 1d6: aload 21
      // 1d8: if_acmpeq 232
      // 1db: aload 4
      // 1dd: aload 20
      // 1df: lload 8
      // 1e1: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 1e4: aload 21
      // 1e6: lload 8
      // 1e8: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 1eb: lload 10
      // 1ed: bipush 3
      // 1ee: anewarray 836
      // 1f1: dup_x2
      // 1f2: dup_x2
      // 1f3: pop
      // 1f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1f7: bipush 2
      // 1f8: swap
      // 1f9: aastore
      // 1fa: dup_x1
      // 1fb: swap
      // 1fc: bipush 1
      // 1fd: swap
      // 1fe: aastore
      // 1ff: dup_x1
      // 200: swap
      // 201: bipush 0
      // 202: swap
      // 203: aastore
      // 204: ldc2_w -8131713465251968539
      // 207: lload 6
      // 209: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20e: iload 16
      // 210: ifeq 233
      // 213: goto 221
      // 216: ldc2_w -8445875788328610799
      // 219: lload 6
      // 21b: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: ifeq 2ff
      // 224: goto 232
      // 227: ldc2_w -8445875788328610799
      // 22a: lload 6
      // 22c: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 231: athrow
      // 232: bipush 1
      // 233: ireturn
      // 234: aload 20
      // 236: aload 21
      // 238: if_acmpne 2ff
      // 23b: bipush 1
      // 23c: ireturn
      // 23d: ldc2_w -8445875788328610799
      // 240: lload 6
      // 242: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 247: athrow
      // 248: aload 20
      // 24a: aload 21
      // 24c: if_acmpeq 2fd
      // 24f: aload 4
      // 251: aload 20
      // 253: lload 8
      // 255: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 258: aload 21
      // 25a: lload 8
      // 25c: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 25f: lload 10
      // 261: bipush 3
      // 262: anewarray 836
      // 265: dup_x2
      // 266: dup_x2
      // 267: pop
      // 268: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 26b: bipush 2
      // 26c: swap
      // 26d: aastore
      // 26e: dup_x1
      // 26f: swap
      // 270: bipush 1
      // 271: swap
      // 272: aastore
      // 273: dup_x1
      // 274: swap
      // 275: bipush 0
      // 276: swap
      // 277: aastore
      // 278: ldc2_w -8131713465251968539
      // 27b: lload 6
      // 27d: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 282: iload 16
      // 284: ifeq 2fe
      // 287: goto 295
      // 28a: ldc2_w -8445875788328610799
      // 28d: lload 6
      // 28f: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: athrow
      // 295: ifne 2fd
      // 298: goto 2a6
      // 29b: ldc2_w -8445875788328610799
      // 29e: lload 6
      // 2a0: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a5: athrow
      // 2a6: aload 4
      // 2a8: aload 21
      // 2aa: lload 8
      // 2ac: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 2af: aload 20
      // 2b1: lload 8
      // 2b3: invokevirtual com/zelix/_f.h (J)Ljava/lang/String;
      // 2b6: lload 10
      // 2b8: bipush 3
      // 2b9: anewarray 836
      // 2bc: dup_x2
      // 2bd: dup_x2
      // 2be: pop
      // 2bf: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2c2: bipush 2
      // 2c3: swap
      // 2c4: aastore
      // 2c5: dup_x1
      // 2c6: swap
      // 2c7: bipush 1
      // 2c8: swap
      // 2c9: aastore
      // 2ca: dup_x1
      // 2cb: swap
      // 2cc: bipush 0
      // 2cd: swap
      // 2ce: aastore
      // 2cf: ldc2_w -8131713465251968539
      // 2d2: lload 6
      // 2d4: invokedynamic w (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d9: iload 16
      // 2db: ifeq 2fe
      // 2de: goto 2ec
      // 2e1: ldc2_w -8445875788328610799
      // 2e4: lload 6
      // 2e6: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2eb: athrow
      // 2ec: ifeq 2ff
      // 2ef: goto 2fd
      // 2f2: ldc2_w -8445875788328610799
      // 2f5: lload 6
      // 2f7: invokedynamic h (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: athrow
      // 2fd: bipush 1
      // 2fe: ireturn
      // 2ff: iload 16
      // 301: ifne 11e
      // 304: iload 16
      // 306: lload 6
      // 308: lconst_0
      // 309: lcmp
      // 30a: ifle 135
      // 30d: ifne 0eb
      // 310: lload 6
      // 312: lconst_0
      // 313: lcmp
      // 314: ifle 0f5
      // 317: bipush 0
      // 318: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public hn(long var1, List var3, short var4, s4 var5) {
      long var6 = (var1 << 16 | (long)var4 << 48 >>> 48) ^ c;
      long var8 = var6 ^ 4716443038645L;
      int var10000 = m44.a<"k">(-1195271926900177899L, var6);
      super();
      this.y = b<"c">(5182, 4908800433800062631L ^ var6);
      int var10 = var10000;

      label41: {
         label33: {
            label32: {
               try {
                  this.C = b<"c">(214, 4086665204266676812L ^ var6);
                  var14 = var3;
                  if (var10 == 0) {
                     break label32;
                  }

                  if (var3 == null) {
                     break label33;
                  }
               } catch (IllegalArgumentException var13) {
                  throw m44.a<"k">(var13, -1235837513368752126L, var6);
               }

               var14 = var3;
            }

            try {
               if (var14.size() != 0) {
                  break label41;
               }
            } catch (IllegalArgumentException var12) {
               boolean var10001 = false;
               throw m44.a<"k">(var12, -1235837513368752126L, var6);
            }
         }

         try {
            throw new IllegalArgumentException(a<"x">(25509, 3667440427939218512L ^ var6));
         } catch (IllegalArgumentException var11) {
            boolean var16 = false;
            throw m44.a<"k">(var11, -1235837513368752126L, var6);
         }
      }

      m44.a<"w">(this, var3, -1253499403946261551L, var6);
      m44.a<"w">(this, var5, -1288119492625247403L, var6);
      m44.a<"k">(new Object[]{var8}, -1450795353200095015L, var6);
   }

   static synchronized void e(Object[] param0) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/hn.c J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: lload 1
      // 13: dup2
      // 14: ldc2_w 29175294990577
      // 17: lxor
      // 18: lstore 3
      // 19: pop2
      // 1a: ldc2_w 4032938993957248139
      // 1d: lload 1
      // 1e: invokedynamic m (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: lload 3
      // 24: bipush 1
      // 25: anewarray 836
      // 28: dup_x2
      // 29: dup_x2
      // 2a: pop
      // 2b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e: bipush 0
      // 2f: swap
      // 30: aastore
      // 31: ldc2_w 4013343849165177833
      // 34: lload 1
      // 35: invokedynamic m (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: lstore 6
      // 3c: istore 5
      // 3e: ldc2_w 3510658391633732670
      // 41: lload 1
      // 42: invokedynamic i (JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: iload 5
      // 49: ifeq bf
      // 4c: sipush 28023
      // 4f: ldc2_w 3399929603500876613
      // 52: lload 1
      // 53: lxor
      // 54: invokedynamic f (IJ)J bsm=com/zelix/hn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59: lcmp
      // 5a: ifeq bd
      // 5d: goto 6a
      // 60: ldc2_w 3911101889755179164
      // 63: lload 1
      // 64: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: lload 1
      // 6b: lconst_0
      // 6c: lcmp
      // 6d: ifle c8
      // 70: lload 6
      // 72: iload 5
      // 74: ifeq bf
      // 77: goto 84
      // 7a: ldc2_w 3911101889755179164
      // 7d: lload 1
      // 7e: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 83: athrow
      // 84: ldc2_w 3510658391633732670
      // 87: lload 1
      // 88: invokedynamic i (JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: lcmp
      // 8e: ifeq bd
      // 91: goto 9e
      // 94: ldc2_w 3911101889755179164
      // 97: lload 1
      // 98: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9d: athrow
      // 9e: new com/zelix/n9
      // a1: dup
      // a2: sipush 5182
      // a5: ldc2_w 8102983138481466178
      // a8: lload 1
      // a9: lxor
      // aa: invokedynamic x (IJ)Ljava/lang/String; bsm=com/zelix/hn.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: invokespecial com/zelix/n9.<init> (Ljava/lang/String;)V
      // b2: athrow
      // b3: ldc2_w 3911101889755179164
      // b6: lload 1
      // b7: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // bc: athrow
      // bd: lload 6
      // bf: ldc2_w 3510658391633732670
      // c2: lload 1
      // c3: invokedynamic n (JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: return
   }

   private gp H(Object[] param1) {
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
      // 004: checkcast com/zelix/bn
      // 007: astore 6
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/util/HashMap
      // 00f: astore 5
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast com/zelix/loq
      // 017: astore 4
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: pop
      // 024: getstatic com/zelix/hn.c J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 73532839529858
      // 02f: lxor
      // 030: lstore 7
      // 032: dup2
      // 033: ldc2_w 42619170468772
      // 036: lxor
      // 037: dup2
      // 038: bipush 32
      // 03a: lushr
      // 03b: lstore 9
      // 03d: dup2
      // 03e: bipush 32
      // 040: lshl
      // 041: bipush 32
      // 043: lushr
      // 044: l2i
      // 045: istore 11
      // 047: pop2
      // 048: dup2
      // 049: ldc2_w 78008686186112
      // 04c: lxor
      // 04d: lstore 12
      // 04f: dup2
      // 050: ldc2_w 131566261405983
      // 053: lxor
      // 054: lstore 14
      // 056: dup2
      // 057: ldc2_w 87953995288912
      // 05a: lxor
      // 05b: lstore 16
      // 05d: dup2
      // 05e: ldc2_w 70902156676236
      // 061: lxor
      // 062: dup2
      // 063: bipush 32
      // 065: lushr
      // 066: l2i
      // 067: istore 18
      // 069: dup2
      // 06a: bipush 32
      // 06c: lshl
      // 06d: bipush 48
      // 06f: lushr
      // 070: l2i
      // 071: istore 19
      // 073: dup2
      // 074: bipush 48
      // 076: lshl
      // 077: bipush 48
      // 079: lushr
      // 07a: l2i
      // 07b: istore 20
      // 07d: pop2
      // 07e: dup2
      // 07f: ldc2_w 108957116696361
      // 082: lxor
      // 083: lstore 21
      // 085: pop2
      // 086: ldc2_w 356272849179553677
      // 089: lload 2
      // 08a: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: aload 5
      // 091: aload 6
      // 093: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 096: checkcast com/zelix/gp
      // 099: astore 24
      // 09b: istore 23
      // 09d: aload 24
      // 09f: iload 23
      // 0a1: ifeq 23b
      // 0a4: ifnonnull 239
      // 0a7: goto 0b4
      // 0aa: ldc2_w 378683432943049626
      // 0ad: lload 2
      // 0ae: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: new com/zelix/gp
      // 0b7: dup
      // 0b8: lload 9
      // 0ba: sipush 13732
      // 0bd: ldc2_w 8041305783706381473
      // 0c0: lload 2
      // 0c1: lxor
      // 0c2: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: bipush 5
      // 0c8: bipush 5
      // 0c9: iload 11
      // 0cb: invokespecial com/zelix/gp.<init> (JIIII)V
      // 0ce: astore 24
      // 0d0: sipush 29465
      // 0d3: ldc2_w 2552809166451288601
      // 0d6: lload 2
      // 0d7: lxor
      // 0d8: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0dd: lload 21
      // 0df: bipush 2
      // 0e0: anewarray 836
      // 0e3: dup_x2
      // 0e4: dup_x2
      // 0e5: pop
      // 0e6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e9: bipush 1
      // 0ea: swap
      // 0eb: aastore
      // 0ec: dup_x1
      // 0ed: swap
      // 0ee: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0f1: bipush 0
      // 0f2: swap
      // 0f3: aastore
      // 0f4: ldc2_w 281526865830839816
      // 0f7: lload 2
      // 0f8: invokedynamic k (Ljava/lang/Object;JJ)Ljava/util/HashMap; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fd: astore 25
      // 0ff: aload 6
      // 101: aload 25
      // 103: lload 14
      // 105: bipush 2
      // 106: anewarray 836
      // 109: dup_x2
      // 10a: dup_x2
      // 10b: pop
      // 10c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10f: bipush 1
      // 110: swap
      // 111: aastore
      // 112: dup_x1
      // 113: swap
      // 114: bipush 0
      // 115: swap
      // 116: aastore
      // 117: ldc2_w 107106505069653099
      // 11a: lload 2
      // 11b: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: aload 25
      // 122: ldc2_w 2048073979542166942
      // 125: lload 2
      // 126: invokedynamic t (Ljava/lang/Object;JJ)Ljava/util/Set; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 130: astore 26
      // 132: aload 26
      // 134: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 139: ifeq 229
      // 13c: aload 26
      // 13e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 143: checkcast java/util/Map$Entry
      // 146: astore 27
      // 148: aload 27
      // 14a: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 14f: checkcast com/zelix/xu
      // 152: astore 28
      // 154: aload 28
      // 156: iload 18
      // 158: iload 19
      // 15a: i2s
      // 15b: iload 20
      // 15d: i2s
      // 15e: invokevirtual com/zelix/xu.b (ISS)Ljava/lang/String;
      // 161: iload 23
      // 163: lload 2
      // 164: lconst_0
      // 165: lcmp
      // 166: ifle 16e
      // 169: ifeq 238
      // 16c: iload 23
      // 16e: ifeq 1ca
      // 171: goto 17e
      // 174: ldc2_w 378683432943049626
      // 177: lload 2
      // 178: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: athrow
      // 17e: lload 7
      // 180: bipush 2
      // 181: anewarray 836
      // 184: dup_x2
      // 185: dup_x2
      // 186: pop
      // 187: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18a: bipush 1
      // 18b: swap
      // 18c: aastore
      // 18d: dup_x1
      // 18e: swap
      // 18f: bipush 0
      // 190: swap
      // 191: aastore
      // 192: ldc2_w 382710108602038724
      // 195: lload 2
      // 196: invokedynamic k (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19b: ifeq 1c3
      // 19e: goto 1ab
      // 1a1: ldc2_w 378683432943049626
      // 1a4: lload 2
      // 1a5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: iload 23
      // 1ad: lload 2
      // 1ae: lconst_0
      // 1af: lcmp
      // 1b0: iflt 139
      // 1b3: ifne 132
      // 1b6: goto 1c3
      // 1b9: ldc2_w 378683432943049626
      // 1bc: lload 2
      // 1bd: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c2: athrow
      // 1c3: aload 27
      // 1c5: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 1ca: checkcast java/lang/Integer
      // 1cd: astore 29
      // 1cf: aload 28
      // 1d1: iload 18
      // 1d3: iload 19
      // 1d5: i2s
      // 1d6: iload 20
      // 1d8: i2s
      // 1d9: invokevirtual com/zelix/xu.b (ISS)Ljava/lang/String;
      // 1dc: astore 30
      // 1de: aload 4
      // 1e0: aload 30
      // 1e2: lload 12
      // 1e4: bipush 2
      // 1e5: anewarray 836
      // 1e8: dup_x2
      // 1e9: dup_x2
      // 1ea: pop
      // 1eb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ee: bipush 1
      // 1ef: swap
      // 1f0: aastore
      // 1f1: dup_x1
      // 1f2: swap
      // 1f3: bipush 0
      // 1f4: swap
      // 1f5: aastore
      // 1f6: ldc2_w 2168773578180918708
      // 1f9: lload 2
      // 1fa: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_f; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ff: astore 31
      // 201: aload 24
      // 203: aload 28
      // 205: bipush 0
      // 206: anewarray 836
      // 209: ldc2_w 8597494244060213
      // 20c: lload 2
      // 20d: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: aload 31
      // 214: aload 29
      // 216: aload 29
      // 218: lload 16
      // 21a: ldc2_w 237540833510970948
      // 21d: lload 2
      // 21e: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: pop
      // 224: iload 23
      // 226: ifne 132
      // 229: aload 5
      // 22b: lload 2
      // 22c: lconst_0
      // 22d: lcmp
      // 22e: iflt 143
      // 231: aload 6
      // 233: aload 24
      // 235: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 238: pop
      // 239: aload 24
      // 23b: areturn
   }

   static synchronized void R(Object[] param0) {
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
      // 04: checkcast java/lang/Long
      // 07: invokevirtual java/lang/Long.longValue ()J
      // 0a: lstore 1
      // 0b: pop
      // 0c: getstatic com/zelix/hn.c J
      // 0f: lload 1
      // 10: lxor
      // 11: lstore 1
      // 12: lload 1
      // 13: dup2
      // 14: ldc2_w 63819828031719
      // 17: lxor
      // 18: lstore 3
      // 19: pop2
      // 1a: ldc2_w -4069102103249154559
      // 1d: lload 1
      // 1e: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: lload 3
      // 24: bipush 1
      // 25: anewarray 836
      // 28: dup_x2
      // 29: dup_x2
      // 2a: pop
      // 2b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2e: bipush 0
      // 2f: swap
      // 30: aastore
      // 31: ldc2_w -2331630455443903489
      // 34: lload 1
      // 35: invokedynamic k (Ljava/lang/Object;JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a: lstore 6
      // 3c: istore 5
      // 3e: ldc2_w -2833188889963312088
      // 41: lload 1
      // 42: invokedynamic o (JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: sipush 28023
      // 4a: ldc2_w 3399893870198442835
      // 4d: lload 1
      // 4e: lxor
      // 4f: invokedynamic f (IJ)J bsm=com/zelix/hn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54: lcmp
      // 55: iload 5
      // 57: ifne 95
      // 5a: ifeq ae
      // 5d: goto 6a
      // 60: ldc2_w -2427115904660504438
      // 63: lload 1
      // 64: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 69: athrow
      // 6a: lload 6
      // 6c: iload 5
      // 6e: ifne a5
      // 71: goto 7e
      // 74: ldc2_w -2427115904660504438
      // 77: lload 1
      // 78: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7d: athrow
      // 7e: ldc2_w -2833188889963312088
      // 81: lload 1
      // 82: invokedynamic o (JJ)J bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 87: lcmp
      // 88: goto 95
      // 8b: ldc2_w -2427115904660504438
      // 8e: lload 1
      // 8f: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 94: athrow
      // 95: ifne ae
      // 98: sipush 28023
      // 9b: ldc2_w 3399893870198442835
      // 9e: lload 1
      // 9f: lxor
      // a0: invokedynamic f (IJ)J bsm=com/zelix/hn.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a5: ldc2_w -2833188889963312088
      // a8: lload 1
      // a9: invokedynamic h (JJJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: return
   }

   public String[] z(Object[] param1) {
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
      // 004: checkcast java/lang/String
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
      // 016: checkcast java/lang/String
      // 019: astore 2
      // 01a: pop
      // 01b: getstatic com/zelix/hn.c J
      // 01e: lload 4
      // 020: lxor
      // 021: lstore 4
      // 023: lload 4
      // 025: dup2
      // 026: ldc2_w 59923459810643
      // 029: lxor
      // 02a: lstore 6
      // 02c: dup2
      // 02d: ldc2_w 24995907717154
      // 030: lxor
      // 031: lstore 8
      // 033: pop2
      // 034: ldc2_w -6342820545784181627
      // 037: lload 4
      // 039: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03e: istore 10
      // 040: aload 0
      // 041: iload 10
      // 043: ifeq 0ab
      // 046: ldc2_w -6655801726781396159
      // 049: lload 4
      // 04b: invokedynamic u (Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 050: ifne 089
      // 053: goto 061
      // 056: ldc2_w -6464600029763995502
      // 059: lload 4
      // 05b: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 060: athrow
      // 061: aload 0
      // 062: lload 6
      // 064: bipush 1
      // 065: anewarray 836
      // 068: dup_x2
      // 069: dup_x2
      // 06a: pop
      // 06b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06e: bipush 0
      // 06f: swap
      // 070: aastore
      // 071: ldc2_w -4719426526137624065
      // 074: lload 4
      // 076: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07b: goto 089
      // 07e: ldc2_w -6464600029763995502
      // 081: lload 4
      // 083: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: athrow
      // 089: aload 3
      // 08a: sipush 5667
      // 08d: ldc2_w 3582754739879111719
      // 090: lload 4
      // 092: lxor
      // 093: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 098: sipush 28991
      // 09b: ldc2_w 6889343129731468081
      // 09e: lload 4
      // 0a0: lxor
      // 0a1: invokedynamic c (IJ)I bsm=com/zelix/hn.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 0a9: astore 3
      // 0aa: aload 0
      // 0ab: ldc2_w -6683546780317795238
      // 0ae: lload 4
      // 0b0: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b5: lload 8
      // 0b7: aload 3
      // 0b8: aload 2
      // 0b9: bipush 3
      // 0ba: anewarray 836
      // 0bd: dup_x1
      // 0be: swap
      // 0bf: bipush 2
      // 0c0: swap
      // 0c1: aastore
      // 0c2: dup_x1
      // 0c3: swap
      // 0c4: bipush 1
      // 0c5: swap
      // 0c6: aastore
      // 0c7: dup_x2
      // 0c8: dup_x2
      // 0c9: pop
      // 0ca: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0cd: bipush 0
      // 0ce: swap
      // 0cf: aastore
      // 0d0: ldc2_w -4798678029168296181
      // 0d3: lload 4
      // 0d5: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: astore 12
      // 0dc: aload 12
      // 0de: lload 4
      // 0e0: lconst_0
      // 0e1: lcmp
      // 0e2: ifle 0fd
      // 0e5: iload 10
      // 0e7: ifeq 0fd
      // 0ea: ifnull 118
      // 0ed: goto 0fb
      // 0f0: ldc2_w -6464600029763995502
      // 0f3: lload 4
      // 0f5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 12
      // 0fd: invokeinterface java/util/List.size ()I 1
      // 102: iload 10
      // 104: ifeq 144
      // 107: ifne 12f
      // 10a: goto 118
      // 10d: ldc2_w -6464600029763995502
      // 110: lload 4
      // 112: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 117: athrow
      // 118: bipush 1
      // 119: anewarray 17
      // 11c: astore 11
      // 11e: aload 11
      // 120: bipush 0
      // 121: aload 2
      // 122: aastore
      // 123: iload 10
      // 125: lload 4
      // 127: lconst_0
      // 128: lcmp
      // 129: iflt 136
      // 12c: ifne 1d8
      // 12f: aload 12
      // 131: invokeinterface java/util/List.size ()I 1
      // 136: goto 144
      // 139: ldc2_w -6464600029763995502
      // 13c: lload 4
      // 13e: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: athrow
      // 144: anewarray 17
      // 147: astore 11
      // 149: bipush 0
      // 14a: istore 13
      // 14c: iload 13
      // 14e: aload 12
      // 150: invokeinterface java/util/List.size ()I 1
      // 155: if_icmpge 1d8
      // 158: aload 12
      // 15a: iload 13
      // 15c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 161: checkcast com/zelix/lq0
      // 164: astore 14
      // 166: aload 14
      // 168: invokevirtual com/zelix/lq0.D ()Ljava/lang/Object;
      // 16b: checkcast java/lang/String
      // 16e: astore 15
      // 170: aload 11
      // 172: iload 10
      // 174: lload 4
      // 176: lconst_0
      // 177: lcmp
      // 178: ifle 180
      // 17b: ifeq 1da
      // 17e: iload 13
      // 180: new java/lang/StringBuilder
      // 183: dup
      // 184: invokespecial java/lang/StringBuilder.<init> ()V
      // 187: aload 14
      // 189: invokevirtual com/zelix/lq0.S ()Ljava/lang/Object;
      // 18c: checkcast java/lang/String
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 192: ldc "("
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 197: aload 15
      // 199: iload 10
      // 19b: ifeq 1bf
      // 19e: goto 1ac
      // 1a1: ldc2_w -6464600029763995502
      // 1a4: lload 4
      // 1a6: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ab: athrow
      // 1ac: ifnull 1c2
      // 1af: goto 1bd
      // 1b2: ldc2_w -6464600029763995502
      // 1b5: lload 4
      // 1b7: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: athrow
      // 1bd: aload 15
      // 1bf: goto 1c4
      // 1c2: ldc ""
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1c7: ldc ")"
      // 1c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1cc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1cf: aastore
      // 1d0: iinc 13 1
      // 1d3: iload 10
      // 1d5: ifne 14c
      // 1d8: aload 11
      // 1da: areturn
   }

   public static void p(int var0) {
      Z = var0;
   }

   private void V(Object[] param1) {
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
      // 00c: checkcast com/zelix/lml
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/Long
      // 017: invokevirtual java/lang/Long.longValue ()J
      // 01a: lstore 2
      // 01b: pop
      // 01c: getstatic com/zelix/hn.c J
      // 01f: lload 2
      // 020: lxor
      // 021: lstore 2
      // 022: lload 2
      // 023: dup2
      // 024: ldc2_w 26316401670957
      // 027: lxor
      // 028: lstore 6
      // 02a: dup2
      // 02b: ldc2_w 128427646744771
      // 02e: lxor
      // 02f: lstore 8
      // 031: dup2
      // 032: ldc2_w 79860864985627
      // 035: lxor
      // 036: lstore 10
      // 038: dup2
      // 039: ldc2_w 124708883845686
      // 03c: lxor
      // 03d: lstore 12
      // 03f: dup2
      // 040: ldc2_w 68524877431630
      // 043: lxor
      // 044: lstore 14
      // 046: dup2
      // 047: ldc2_w 5757640227694
      // 04a: lxor
      // 04b: lstore 16
      // 04d: dup2
      // 04e: ldc2_w 12375782118717
      // 051: lxor
      // 052: lstore 18
      // 054: pop2
      // 055: ldc2_w 1207497941155167165
      // 058: lload 2
      // 059: invokedynamic k (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: aload 4
      // 060: lload 18
      // 062: bipush 1
      // 063: anewarray 836
      // 066: dup_x2
      // 067: dup_x2
      // 068: pop
      // 069: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 06c: bipush 0
      // 06d: swap
      // 06e: aastore
      // 06f: ldc2_w 1585784262789815987
      // 072: lload 2
      // 073: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: astore 21
      // 07a: istore 20
      // 07c: aload 4
      // 07e: lload 6
      // 080: bipush 1
      // 081: anewarray 836
      // 084: dup_x2
      // 085: dup_x2
      // 086: pop
      // 087: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 08a: bipush 0
      // 08b: swap
      // 08c: aastore
      // 08d: ldc2_w 728597923227981841
      // 090: lload 2
      // 091: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 096: iload 20
      // 098: ifeq 0bf
      // 09b: ifeq 1b9
      // 09e: goto 0ab
      // 0a1: ldc2_w 1256788165407166378
      // 0a4: lload 2
      // 0a5: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: athrow
      // 0ab: aload 21
      // 0ad: invokeinterface java/util/List.size ()I 1
      // 0b2: goto 0bf
      // 0b5: ldc2_w 1256788165407166378
      // 0b8: lload 2
      // 0b9: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0be: athrow
      // 0bf: iload 20
      // 0c1: ifeq 0d5
      // 0c4: ifle 1b9
      // 0c7: goto 0d4
      // 0ca: ldc2_w 1256788165407166378
      // 0cd: lload 2
      // 0ce: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d3: athrow
      // 0d4: bipush 0
      // 0d5: istore 22
      // 0d7: iload 22
      // 0d9: aload 21
      // 0db: invokeinterface java/util/List.size ()I 1
      // 0e0: if_icmpge 1ae
      // 0e3: aload 21
      // 0e5: iload 22
      // 0e7: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ec: checkcast com/zelix/uc
      // 0ef: astore 23
      // 0f1: aload 23
      // 0f3: ldc2_w 726245946316027454
      // 0f6: lload 2
      // 0f7: invokedynamic u (Ljava/lang/Object;JJ)Lcom/zelix/bn; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fc: astore 24
      // 0fe: iload 20
      // 100: ifeq 1ef
      // 103: aload 24
      // 105: iload 20
      // 107: ifeq 167
      // 10a: goto 117
      // 10d: ldc2_w 1256788165407166378
      // 110: lload 2
      // 111: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 116: athrow
      // 117: ifnonnull 169
      // 11a: goto 127
      // 11d: ldc2_w 1256788165407166378
      // 120: lload 2
      // 121: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 126: athrow
      // 127: aload 4
      // 129: lload 10
      // 12b: bipush 1
      // 12c: anewarray 836
      // 12f: dup_x2
      // 130: dup_x2
      // 131: pop
      // 132: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 135: bipush 0
      // 136: swap
      // 137: aastore
      // 138: ldc2_w 1243864049115388550
      // 13b: lload 2
      // 13c: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/_f; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 141: new com/zelix/loe
      // 144: dup
      // 145: aload 23
      // 147: ldc2_w 1701977214327537567
      // 14a: lload 2
      // 14b: invokedynamic u (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: invokespecial com/zelix/loe.<init> (Ljava/lang/String;)V
      // 153: lload 14
      // 155: dup2_x1
      // 156: pop2
      // 157: invokevirtual com/zelix/_f.i (JLcom/zelix/loe;)Lcom/zelix/bn;
      // 15a: goto 167
      // 15d: ldc2_w 1256788165407166378
      // 160: lload 2
      // 161: invokedynamic k (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 166: athrow
      // 167: astore 24
      // 169: new com/zelix/zh
      // 16c: dup
      // 16d: lload 12
      // 16f: invokespecial com/zelix/zh.<init> (J)V
      // 172: astore 25
      // 174: aload 25
      // 176: lload 16
      // 178: aload 4
      // 17a: aload 24
      // 17c: bipush 3
      // 17d: anewarray 836
      // 180: dup_x1
      // 181: swap
      // 182: bipush 2
      // 183: swap
      // 184: aastore
      // 185: dup_x1
      // 186: swap
      // 187: bipush 1
      // 188: swap
      // 189: aastore
      // 18a: dup_x2
      // 18b: dup_x2
      // 18c: pop
      // 18d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 190: bipush 0
      // 191: swap
      // 192: aastore
      // 193: ldc2_w 1651086563570437500
      // 196: lload 2
      // 197: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19c: aload 5
      // 19e: aload 25
      // 1a0: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a5: pop
      // 1a6: iinc 22 1
      // 1a9: iload 20
      // 1ab: ifne 0d7
      // 1ae: lload 2
      // 1af: lconst_0
      // 1b0: lcmp
      // 1b1: ifle 1ef
      // 1b4: iload 20
      // 1b6: ifne 1ef
      // 1b9: new com/zelix/zh
      // 1bc: dup
      // 1bd: lload 12
      // 1bf: invokespecial com/zelix/zh.<init> (J)V
      // 1c2: astore 22
      // 1c4: aload 22
      // 1c6: lload 8
      // 1c8: aload 4
      // 1ca: bipush 2
      // 1cb: anewarray 836
      // 1ce: dup_x1
      // 1cf: swap
      // 1d0: bipush 1
      // 1d1: swap
      // 1d2: aastore
      // 1d3: dup_x2
      // 1d4: dup_x2
      // 1d5: pop
      // 1d6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d9: bipush 0
      // 1da: swap
      // 1db: aastore
      // 1dc: ldc2_w 826903632607272812
      // 1df: lload 2
      // 1e0: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e5: aload 5
      // 1e7: aload 22
      // 1e9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ee: pop
      // 1ef: return
   }

   private String[] U(Object[] param1) {
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
      // 00f: checkcast java/lang/String
      // 012: astore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/Boolean
      // 019: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01c: istore 6
      // 01e: dup
      // 01f: bipush 3
      // 020: aaload
      // 021: checkcast java/lang/Integer
      // 024: invokevirtual java/lang/Integer.intValue ()I
      // 027: istore 3
      // 028: dup
      // 029: bipush 4
      // 02a: aaload
      // 02b: checkcast com/zelix/zr
      // 02e: astore 7
      // 030: pop
      // 031: getstatic com/zelix/hn.c J
      // 034: lload 4
      // 036: lxor
      // 037: lstore 4
      // 039: lload 4
      // 03b: dup2
      // 03c: ldc2_w 127552302125183
      // 03f: lxor
      // 040: lstore 8
      // 042: dup2
      // 043: ldc2_w 72776874498252
      // 046: lxor
      // 047: lstore 10
      // 049: dup2
      // 04a: ldc2_w 105325567520114
      // 04d: lxor
      // 04e: lstore 12
      // 050: pop2
      // 051: aload 7
      // 053: bipush 0
      // 054: invokevirtual com/zelix/zr.I (Z)V
      // 057: ldc2_w -7926120191226857092
      // 05a: lload 4
      // 05c: invokedynamic j (JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 061: aload 0
      // 062: lload 8
      // 064: aload 2
      // 065: iload 6
      // 067: bipush 3
      // 068: anewarray 836
      // 06b: dup_x1
      // 06c: swap
      // 06d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 070: bipush 2
      // 071: swap
      // 072: aastore
      // 073: dup_x1
      // 074: swap
      // 075: bipush 1
      // 076: swap
      // 077: aastore
      // 078: dup_x2
      // 079: dup_x2
      // 07a: pop
      // 07b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07e: bipush 0
      // 07f: swap
      // 080: aastore
      // 081: ldc2_w -7748623280182964862
      // 084: lload 4
      // 086: invokedynamic k (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/List; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: astore 18
      // 08d: istore 17
      // 08f: aload 18
      // 091: invokeinterface java/util/List.size ()I 1
      // 096: anewarray 17
      // 099: astore 19
      // 09b: bipush 0
      // 09c: istore 20
      // 09e: iload 20
      // 0a0: aload 19
      // 0a2: arraylength
      // 0a3: if_icmpge 171
      // 0a6: aload 18
      // 0a8: iload 20
      // 0aa: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0af: checkcast com/zelix/vu
      // 0b2: astore 21
      // 0b4: iload 17
      // 0b6: lload 4
      // 0b8: lconst_0
      // 0b9: lcmp
      // 0ba: iflt 0db
      // 0bd: ifeq 184
      // 0c0: aload 21
      // 0c2: lload 12
      // 0c4: bipush 1
      // 0c5: anewarray 836
      // 0c8: dup_x2
      // 0c9: dup_x2
      // 0ca: pop
      // 0cb: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0ce: bipush 0
      // 0cf: swap
      // 0d0: aastore
      // 0d1: ldc2_w -8597657744962921383
      // 0d4: lload 4
      // 0d6: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0db: ifeq 100
      // 0de: goto 0ec
      // 0e1: ldc2_w -7804696950090183317
      // 0e4: lload 4
      // 0e6: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0eb: athrow
      // 0ec: aload 7
      // 0ee: bipush 1
      // 0ef: invokevirtual com/zelix/zr.I (Z)V
      // 0f2: goto 100
      // 0f5: ldc2_w -7804696950090183317
      // 0f8: lload 4
      // 0fa: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: aload 19
      // 102: iload 20
      // 104: aload 21
      // 106: iload 3
      // 107: aload 0
      // 108: ldc2_w -7582302129963890269
      // 10b: lload 4
      // 10d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/lks; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: iload 6
      // 114: ifeq 130
      // 117: aload 0
      // 118: ldc2_w -7802311463814994118
      // 11b: lload 4
      // 11d: invokedynamic t (Ljava/lang/Object;JJ)Lcom/zelix/loq; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: goto 131
      // 125: ldc2_w -7804696950090183317
      // 128: lload 4
      // 12a: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/Exception; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: athrow
      // 130: aconst_null
      // 131: astore 14
      // 133: astore 15
      // 135: istore 16
      // 137: lload 10
      // 139: iload 16
      // 13b: aload 15
      // 13d: aload 14
      // 13f: bipush 4
      // 140: anewarray 836
      // 143: dup_x1
      // 144: swap
      // 145: bipush 3
      // 146: swap
      // 147: aastore
      // 148: dup_x1
      // 149: swap
      // 14a: bipush 2
      // 14b: swap
      // 14c: aastore
      // 14d: dup_x1
      // 14e: swap
      // 14f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 152: bipush 1
      // 153: swap
      // 154: aastore
      // 155: dup_x2
      // 156: dup_x2
      // 157: pop
      // 158: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 15b: bipush 0
      // 15c: swap
      // 15d: aastore
      // 15e: ldc2_w -7594112813409286244
      // 161: lload 4
      // 163: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 168: aastore
      // 169: iinc 20 1
      // 16c: iload 17
      // 16e: ifne 09e
      // 171: aload 19
      // 173: ldc2_w -7540638769569080240
      // 176: lload 4
      // 178: invokedynamic j (Ljava/lang/Object;JJ)V bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17d: lload 4
      // 17f: lconst_0
      // 180: lcmp
      // 181: ifle 184
      // 184: aload 19
      // 186: areturn
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17359;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("com/zelix/hn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("com/zelix/hn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22192;
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
         long var5 = h[var3];
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
            throw new RuntimeException("com/zelix/hn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("com/zelix/hn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29312;
      if (n[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/zelix/hn", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56
            | ((long)var10[1] & 255L) << 48
            | ((long)var10[2] & 255L) << 40
            | ((long)var10[3] & 255L) << 32
            | ((long)var10[4] & 255L) << 24
            | ((long)var10[5] & 255L) << 16
            | ((long)var10[6] & 255L) << 8
            | (long)var10[7] & 255L;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
         throw new RuntimeException("com/zelix/hn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
