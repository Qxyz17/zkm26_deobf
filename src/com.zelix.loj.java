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

public class loj {
   private Map w;
   private final _6 v;
   private final ai V;
   private final ol n;
   private static final long a = prr.a(8904844134547705346L, 4305662933353945913L, MethodHandles.lookup().lookupClass()).a(277539443577144L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   ai F(Object[] var1) {
      return this.V;
   }

   Integer Y(long var1) {
      var1 = a ^ var1;
      long var3 = var1 ^ 78727803975721L;
      return (Integer)this.w.get(m44.a<"m">(new Object[]{var3}, 1687196079938822961L, var1));
   }

   boolean v(Object[] param1) {
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
      // 07: astore 3
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/Long
      // 0e: invokevirtual java/lang/Long.longValue ()J
      // 11: lstore 4
      // 13: dup
      // 14: bipush 2
      // 15: aaload
      // 16: checkcast java/lang/String
      // 19: astore 2
      // 1a: pop
      // 1b: getstatic com/zelix/loj.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 77505802371871
      // 29: lxor
      // 2a: lstore 6
      // 2c: pop2
      // 2d: ldc2_w -4582528430974290761
      // 30: lload 4
      // 32: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37: astore 8
      // 39: aload 3
      // 3a: aload 2
      // 3b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 3e: aload 8
      // 40: ifnonnull 6e
      // 43: ifeq 61
      // 46: goto 54
      // 49: ldc2_w -2769561446862770688
      // 4c: lload 4
      // 4e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53: athrow
      // 54: bipush 1
      // 55: ireturn
      // 56: ldc2_w -2769561446862770688
      // 59: lload 4
      // 5b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: athrow
      // 61: aload 0
      // 62: getfield com/zelix/loj.V Lcom/zelix/ai;
      // 65: aload 3
      // 66: lload 6
      // 68: aload 2
      // 69: invokeinterface com/zelix/ai.j (Ljava/lang/String;JLjava/lang/String;)Z 5
      // 6e: ireturn
   }

   public static String A(String param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/loj.a J
      // 03: lload 1
      // 04: lxor
      // 05: lstore 1
      // 06: ldc2_w 5756627503021013811
      // 09: lload 1
      // 0a: invokedynamic i (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f: aload 0
      // 10: invokevirtual java/lang/String.length ()I
      // 13: istore 4
      // 15: astore 3
      // 16: aload 0
      // 17: aload 3
      // 18: ifnonnull 7d
      // 1b: bipush 0
      // 1c: invokevirtual java/lang/String.charAt (I)C
      // 1f: sipush 29267
      // 22: ldc2_w 8289351391555007771
      // 25: lload 1
      // 26: lxor
      // 27: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c: if_icmpne 7c
      // 2f: goto 3c
      // 32: ldc2_w 6202787184664715652
      // 35: lload 1
      // 36: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 3
      // 3e: ifnonnull 7d
      // 41: goto 4e
      // 44: ldc2_w 6202787184664715652
      // 47: lload 1
      // 48: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d: athrow
      // 4e: iload 4
      // 50: bipush 1
      // 51: isub
      // 52: invokevirtual java/lang/String.charAt (I)C
      // 55: sipush 1776
      // 58: ldc2_w 1140613006057161136
      // 5b: lload 1
      // 5c: lxor
      // 5d: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 62: if_icmpne 7c
      // 65: goto 72
      // 68: ldc2_w 6202787184664715652
      // 6b: lload 1
      // 6c: invokedynamic i (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 71: athrow
      // 72: aload 0
      // 73: bipush 1
      // 74: iload 4
      // 76: bipush 1
      // 77: isub
      // 78: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 7b: astore 0
      // 7c: aload 0
      // 7d: areturn
   }

   String P(Object[] var1) {
      v7 var4 = (v7)var1[0];
      v7 var5 = (v7)var1[1];
      String var6 = (String)var1[2];
      long var2 = (Long)var1[3];
      var2 = a ^ var2;
      long var10001 = var2 ^ 38845259216145L;
      int var7 = (int)((var2 ^ 38845259216145L) >>> 48);
      int var8 = (int)((var2 ^ 38845259216145L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      return m44.a<"u">(this, (char)var7, var8, var4.h(), (short)var9, var5.h(), var6, 3613980907860996957L, var2);
   }

   public static String N(Object[] param0) {
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
      // 0a: lstore 2
      // 0b: dup
      // 0c: bipush 1
      // 0d: aaload
      // 0e: checkcast java/lang/String
      // 11: astore 1
      // 12: pop
      // 13: getstatic com/zelix/loj.a J
      // 16: lload 2
      // 17: lxor
      // 18: lstore 2
      // 19: ldc2_w -16361919217661163
      // 1c: lload 2
      // 1d: invokedynamic o (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22: astore 4
      // 24: aload 1
      // 25: aload 4
      // 27: ifnonnull 8a
      // 2a: aload 1
      // 2b: invokevirtual java/lang/String.length ()I
      // 2e: bipush 1
      // 2f: isub
      // 30: invokevirtual java/lang/String.charAt (I)C
      // 33: sipush 27258
      // 36: ldc2_w 2784714103988624657
      // 39: lload 2
      // 3a: lxor
      // 3b: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40: if_icmpeq 89
      // 43: goto 50
      // 46: ldc2_w -1859209524457074270
      // 49: lload 2
      // 4a: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f: athrow
      // 50: new java/lang/StringBuilder
      // 53: dup
      // 54: invokespecial java/lang/StringBuilder.<init> ()V
      // 57: sipush 1517
      // 5a: ldc2_w 5470614638681289353
      // 5d: lload 2
      // 5e: lxor
      // 5f: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 67: aload 1
      // 68: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6b: sipush 1776
      // 6e: ldc2_w 1140604368417321366
      // 71: lload 2
      // 72: lxor
      // 73: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 78: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 7b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7e: areturn
      // 7f: ldc2_w -1859209524457074270
      // 82: lload 2
      // 83: invokedynamic o (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88: athrow
      // 89: aload 1
      // 8a: areturn
   }

   boolean C(v7 var1, long var2, v7 var4, String var5) {
      var2 = a ^ var2;
      long var6 = var2 ^ 92396924835317L;
      return this.n(var1.h(), var6, var4.h(), var5);
   }

   Integer b(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 73946213406740L;
      return (Integer)this.w.remove(m44.a<"h">(new Object[]{var6}, 8599371973235901196L, var4));
   }

   String b(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/Long
      // 00f: invokevirtual java/lang/Long.longValue ()J
      // 012: lstore 2
      // 013: dup
      // 014: bipush 2
      // 015: aaload
      // 016: checkcast java/lang/String
      // 019: astore 4
      // 01b: dup
      // 01c: bipush 3
      // 01d: aaload
      // 01e: checkcast java/lang/String
      // 021: astore 6
      // 023: pop
      // 024: getstatic com/zelix/loj.a J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 32772157364334
      // 02f: lxor
      // 030: dup2
      // 031: bipush 48
      // 033: lushr
      // 034: l2i
      // 035: istore 7
      // 037: dup2
      // 038: bipush 16
      // 03a: lshl
      // 03b: bipush 32
      // 03d: lushr
      // 03e: l2i
      // 03f: istore 8
      // 041: dup2
      // 042: bipush 48
      // 044: lshl
      // 045: bipush 48
      // 047: lushr
      // 048: l2i
      // 049: istore 9
      // 04b: pop2
      // 04c: dup2
      // 04d: ldc2_w 34039778010759
      // 050: lxor
      // 051: lstore 10
      // 053: pop2
      // 054: ldc2_w 1760810676669181119
      // 057: lload 2
      // 058: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05d: aload 5
      // 05f: ldc "["
      // 061: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 064: bipush 1
      // 065: iadd
      // 066: istore 13
      // 068: aload 4
      // 06a: ldc "["
      // 06c: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 06f: bipush 1
      // 070: iadd
      // 071: istore 14
      // 073: astore 12
      // 075: aload 5
      // 077: iload 13
      // 079: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 07c: astore 15
      // 07e: aload 4
      // 080: iload 14
      // 082: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 085: astore 16
      // 087: iload 13
      // 089: iload 14
      // 08b: aload 12
      // 08d: ifnonnull 216
      // 090: if_icmpeq 210
      // 093: goto 0a0
      // 096: ldc2_w 115048332674627080
      // 099: lload 2
      // 09a: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09f: athrow
      // 0a0: iload 13
      // 0a2: iload 14
      // 0a4: if_icmpge 0c3
      // 0a7: goto 0b4
      // 0aa: ldc2_w 115048332674627080
      // 0ad: lload 2
      // 0ae: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b3: athrow
      // 0b4: aload 15
      // 0b6: astore 17
      // 0b8: lload 2
      // 0b9: lconst_0
      // 0ba: lcmp
      // 0bb: iflt 0c7
      // 0be: aload 12
      // 0c0: ifnull 0c7
      // 0c3: aload 16
      // 0c5: astore 17
      // 0c7: aload 17
      // 0c9: aload 12
      // 0cb: ifnonnull 20f
      // 0ce: ldc "L"
      // 0d0: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0d3: ifeq 192
      // 0d6: goto 0e3
      // 0d9: ldc2_w 115048332674627080
      // 0dc: lload 2
      // 0dd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e2: athrow
      // 0e3: aload 17
      // 0e5: aload 12
      // 0e7: ifnonnull 20f
      // 0ea: goto 0f7
      // 0ed: ldc2_w 115048332674627080
      // 0f0: lload 2
      // 0f1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f6: athrow
      // 0f7: ldc ";"
      // 0f9: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 0fc: ifeq 192
      // 0ff: goto 10c
      // 102: ldc2_w 115048332674627080
      // 105: lload 2
      // 106: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: athrow
      // 10c: new java/lang/StringBuilder
      // 10f: dup
      // 110: invokespecial java/lang/StringBuilder.<init> ()V
      // 113: ldc ""
      // 115: sipush 29267
      // 118: ldc2_w 8289351091147891351
      // 11b: lload 2
      // 11c: lxor
      // 11d: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 122: iload 13
      // 124: iload 14
      // 126: ldc2_w 2102470354502770706
      // 129: lload 2
      // 12a: invokedynamic m (IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: lload 10
      // 131: sipush 5078
      // 134: ldc2_w 7955182218480943875
      // 137: lload 2
      // 138: lxor
      // 139: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13e: bipush 5
      // 13f: anewarray 447
      // 142: dup_x1
      // 143: swap
      // 144: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 147: bipush 4
      // 148: swap
      // 149: aastore
      // 14a: dup_x2
      // 14b: dup_x2
      // 14c: pop
      // 14d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 150: bipush 3
      // 151: swap
      // 152: aastore
      // 153: dup_x1
      // 154: swap
      // 155: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 158: bipush 2
      // 159: swap
      // 15a: aastore
      // 15b: dup_x1
      // 15c: swap
      // 15d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 160: bipush 1
      // 161: swap
      // 162: aastore
      // 163: dup_x1
      // 164: swap
      // 165: bipush 0
      // 166: swap
      // 167: aastore
      // 168: ldc2_w 421233029978858512
      // 16b: lload 2
      // 16c: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 174: sipush 5587
      // 177: ldc2_w 1607462263296218650
      // 17a: lload 2
      // 17b: lxor
      // 17c: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 181: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 184: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 187: areturn
      // 188: ldc2_w 115048332674627080
      // 18b: lload 2
      // 18c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 191: athrow
      // 192: new java/lang/StringBuilder
      // 195: dup
      // 196: invokespecial java/lang/StringBuilder.<init> ()V
      // 199: ldc ""
      // 19b: sipush 29267
      // 19e: ldc2_w 8289351091147891351
      // 1a1: lload 2
      // 1a2: lxor
      // 1a3: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a8: iload 13
      // 1aa: iload 14
      // 1ac: ldc2_w 2102470354502770706
      // 1af: lload 2
      // 1b0: invokedynamic m (IIJJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: bipush 1
      // 1b6: isub
      // 1b7: lload 10
      // 1b9: sipush 5078
      // 1bc: ldc2_w 7955182218480943875
      // 1bf: lload 2
      // 1c0: lxor
      // 1c1: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: bipush 5
      // 1c7: anewarray 447
      // 1ca: dup_x1
      // 1cb: swap
      // 1cc: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1cf: bipush 4
      // 1d0: swap
      // 1d1: aastore
      // 1d2: dup_x2
      // 1d3: dup_x2
      // 1d4: pop
      // 1d5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1d8: bipush 3
      // 1d9: swap
      // 1da: aastore
      // 1db: dup_x1
      // 1dc: swap
      // 1dd: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e0: bipush 2
      // 1e1: swap
      // 1e2: aastore
      // 1e3: dup_x1
      // 1e4: swap
      // 1e5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e8: bipush 1
      // 1e9: swap
      // 1ea: aastore
      // 1eb: dup_x1
      // 1ec: swap
      // 1ed: bipush 0
      // 1ee: swap
      // 1ef: aastore
      // 1f0: ldc2_w 421233029978858512
      // 1f3: lload 2
      // 1f4: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1fc: sipush 23772
      // 1ff: ldc2_w 5241073040048856849
      // 202: lload 2
      // 203: lxor
      // 204: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 209: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 20c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20f: areturn
      // 210: aload 15
      // 212: invokevirtual java/lang/String.length ()I
      // 215: bipush 1
      // 216: aload 12
      // 218: ifnonnull 344
      // 21b: if_icmpne 32c
      // 21e: goto 22b
      // 221: ldc2_w 115048332674627080
      // 224: lload 2
      // 225: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 22a: athrow
      // 22b: aload 16
      // 22d: invokevirtual java/lang/String.length ()I
      // 230: bipush 1
      // 231: lload 2
      // 232: lconst_0
      // 233: lcmp
      // 234: iflt 344
      // 237: aload 12
      // 239: ifnonnull 344
      // 23c: goto 249
      // 23f: ldc2_w 115048332674627080
      // 242: lload 2
      // 243: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 248: athrow
      // 249: if_icmpne 32c
      // 24c: goto 259
      // 24f: ldc2_w 115048332674627080
      // 252: lload 2
      // 253: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 258: athrow
      // 259: aload 15
      // 25b: aload 16
      // 25d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 260: lload 2
      // 261: lconst_0
      // 262: lcmp
      // 263: iflt 297
      // 266: aload 12
      // 268: ifnonnull 297
      // 26b: goto 278
      // 26e: ldc2_w 115048332674627080
      // 271: lload 2
      // 272: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 277: athrow
      // 278: ifeq 295
      // 27b: goto 288
      // 27e: ldc2_w 115048332674627080
      // 281: lload 2
      // 282: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: athrow
      // 288: aload 5
      // 28a: areturn
      // 28b: ldc2_w 115048332674627080
      // 28e: lload 2
      // 28f: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 294: athrow
      // 295: iload 13
      // 297: lload 2
      // 298: lconst_0
      // 299: lcmp
      // 29a: ifle 2a4
      // 29d: bipush 1
      // 29e: if_icmpne 2b9
      // 2a1: sipush 23772
      // 2a4: ldc2_w 5241073040048856849
      // 2a7: lload 2
      // 2a8: lxor
      // 2a9: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ae: areturn
      // 2af: ldc2_w 115048332674627080
      // 2b2: lload 2
      // 2b3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b8: athrow
      // 2b9: new java/lang/StringBuilder
      // 2bc: dup
      // 2bd: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c0: ldc ""
      // 2c2: sipush 29267
      // 2c5: ldc2_w 8289351091147891351
      // 2c8: lload 2
      // 2c9: lxor
      // 2ca: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2cf: iload 13
      // 2d1: bipush 1
      // 2d2: isub
      // 2d3: lload 10
      // 2d5: sipush 5078
      // 2d8: ldc2_w 7955182218480943875
      // 2db: lload 2
      // 2dc: lxor
      // 2dd: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e2: bipush 5
      // 2e3: anewarray 447
      // 2e6: dup_x1
      // 2e7: swap
      // 2e8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2eb: bipush 4
      // 2ec: swap
      // 2ed: aastore
      // 2ee: dup_x2
      // 2ef: dup_x2
      // 2f0: pop
      // 2f1: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2f4: bipush 3
      // 2f5: swap
      // 2f6: aastore
      // 2f7: dup_x1
      // 2f8: swap
      // 2f9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2fc: bipush 2
      // 2fd: swap
      // 2fe: aastore
      // 2ff: dup_x1
      // 300: swap
      // 301: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 304: bipush 1
      // 305: swap
      // 306: aastore
      // 307: dup_x1
      // 308: swap
      // 309: bipush 0
      // 30a: swap
      // 30b: aastore
      // 30c: ldc2_w 421233029978858512
      // 30f: lload 2
      // 310: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 315: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 318: sipush 23772
      // 31b: ldc2_w 5241073040048856849
      // 31e: lload 2
      // 31f: lxor
      // 320: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 325: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 328: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 32b: areturn
      // 32c: aload 15
      // 32e: aload 12
      // 330: ifnonnull 389
      // 333: invokevirtual java/lang/String.length ()I
      // 336: bipush 1
      // 337: goto 344
      // 33a: ldc2_w 115048332674627080
      // 33d: lload 2
      // 33e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 343: athrow
      // 344: if_icmpeq 36f
      // 347: aload 16
      // 349: aload 12
      // 34b: ifnonnull 3a2
      // 34e: goto 35b
      // 351: ldc2_w 115048332674627080
      // 354: lload 2
      // 355: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 35a: athrow
      // 35b: invokevirtual java/lang/String.length ()I
      // 35e: bipush 1
      // 35f: if_icmpne 38a
      // 362: goto 36f
      // 365: ldc2_w 115048332674627080
      // 368: lload 2
      // 369: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 36e: athrow
      // 36f: sipush 23772
      // 372: ldc2_w 5241073040048856849
      // 375: lload 2
      // 376: lxor
      // 377: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 37c: goto 389
      // 37f: ldc2_w 115048332674627080
      // 382: lload 2
      // 383: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 388: athrow
      // 389: areturn
      // 38a: aload 0
      // 38b: iload 7
      // 38d: i2c
      // 38e: iload 8
      // 390: aload 15
      // 392: iload 9
      // 394: i2s
      // 395: aload 16
      // 397: aload 6
      // 399: ldc2_w 2258641966888984098
      // 39c: lload 2
      // 39d: invokedynamic r (Ljava/lang/Object;CILjava/lang/Object;SLjava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a2: astore 17
      // 3a4: aload 17
      // 3a6: sipush 12911
      // 3a9: ldc2_w 5201762745433563815
      // 3ac: lload 2
      // 3ad: lxor
      // 3ae: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b3: aload 17
      // 3b5: invokevirtual java/lang/String.length ()I
      // 3b8: iload 13
      // 3ba: iadd
      // 3bb: lload 10
      // 3bd: sipush 5078
      // 3c0: ldc2_w 7955182218480943875
      // 3c3: lload 2
      // 3c4: lxor
      // 3c5: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3ca: bipush 5
      // 3cb: anewarray 447
      // 3ce: dup_x1
      // 3cf: swap
      // 3d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3d3: bipush 4
      // 3d4: swap
      // 3d5: aastore
      // 3d6: dup_x2
      // 3d7: dup_x2
      // 3d8: pop
      // 3d9: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3dc: bipush 3
      // 3dd: swap
      // 3de: aastore
      // 3df: dup_x1
      // 3e0: swap
      // 3e1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3e4: bipush 2
      // 3e5: swap
      // 3e6: aastore
      // 3e7: dup_x1
      // 3e8: swap
      // 3e9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3ec: bipush 1
      // 3ed: swap
      // 3ee: aastore
      // 3ef: dup_x1
      // 3f0: swap
      // 3f1: bipush 0
      // 3f2: swap
      // 3f3: aastore
      // 3f4: ldc2_w 421233029978858512
      // 3f7: lload 2
      // 3f8: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3fd: areturn
   }

   void a(Object[] var1) {
      Integer var2 = (Integer)var1[0];
      long var3 = (Long)var1[1];
      var3 = a ^ var3;
      long var5 = var3 ^ 6719690124791L;
      this.w.put(m44.a<"k">(new Object[]{var5}, 194884467227850479L, var3), var2);
   }

   public _6 E(Object[] var1) {
      return this.v;
   }

   public boolean n(String param1, long param2, String param4, String param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic com/zelix/loj.a J
      // 003: lload 2
      // 004: lxor
      // 005: lstore 2
      // 006: lload 2
      // 007: dup2
      // 008: ldc2_w 110979575977432
      // 00b: lxor
      // 00c: lstore 6
      // 00e: dup2
      // 00f: ldc2_w 25658886919863
      // 012: lxor
      // 013: lstore 8
      // 015: dup2
      // 016: ldc2_w 38902658775044
      // 019: lxor
      // 01a: lstore 10
      // 01c: dup2
      // 01d: ldc2_w 110782695434454
      // 020: lxor
      // 021: lstore 12
      // 023: dup2
      // 024: ldc2_w 21975942674304
      // 027: lxor
      // 028: lstore 14
      // 02a: dup2
      // 02b: ldc2_w 14047709601793
      // 02e: lxor
      // 02f: lstore 16
      // 031: dup2
      // 032: ldc2_w 130643708770544
      // 035: lxor
      // 036: lstore 18
      // 038: pop2
      // 039: ldc2_w -3868031953185194367
      // 03c: lload 2
      // 03d: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 042: astore 20
      // 044: aload 1
      // 045: aload 20
      // 047: ifnonnull 079
      // 04a: aload 4
      // 04c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 04f: ifeq 06b
      // 052: goto 05f
      // 055: ldc2_w -3195619165816773578
      // 058: lload 2
      // 059: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05e: athrow
      // 05f: bipush 1
      // 060: ireturn
      // 061: ldc2_w -3195619165816773578
      // 064: lload 2
      // 065: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06a: athrow
      // 06b: aload 1
      // 06c: lload 10
      // 06e: invokestatic com/zelix/loj.A (Ljava/lang/String;J)Ljava/lang/String;
      // 071: astore 1
      // 072: aload 4
      // 074: lload 10
      // 076: invokestatic com/zelix/loj.A (Ljava/lang/String;J)Ljava/lang/String;
      // 079: astore 4
      // 07b: aconst_null
      // 07c: astore 21
      // 07e: aconst_null
      // 07f: astore 22
      // 081: aload 0
      // 082: lload 18
      // 084: invokevirtual com/zelix/loj.Y (J)Ljava/lang/Integer;
      // 087: astore 23
      // 089: aload 1
      // 08a: bipush 0
      // 08b: invokevirtual java/lang/String.charAt (I)C
      // 08e: sipush 27237
      // 091: ldc2_w 2863671204981844112
      // 094: lload 2
      // 095: lxor
      // 096: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09b: aload 20
      // 09d: ifnonnull 1a2
      // 0a0: if_icmpne 17d
      // 0a3: goto 0b0
      // 0a6: ldc2_w -3195619165816773578
      // 0a9: lload 2
      // 0aa: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0af: athrow
      // 0b0: aload 4
      // 0b2: bipush 0
      // 0b3: invokevirtual java/lang/String.charAt (I)C
      // 0b6: aload 20
      // 0b8: ifnonnull 11f
      // 0bb: goto 0c8
      // 0be: ldc2_w -3195619165816773578
      // 0c1: lload 2
      // 0c2: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: athrow
      // 0c8: sipush 5078
      // 0cb: ldc2_w 7955088130662617405
      // 0ce: lload 2
      // 0cf: lxor
      // 0d0: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: if_icmpne 120
      // 0d8: goto 0e5
      // 0db: ldc2_w -3195619165816773578
      // 0de: lload 2
      // 0df: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: aload 1
      // 0e7: aload 4
      // 0e9: aload 5
      // 0eb: lload 12
      // 0ed: bipush 4
      // 0ee: anewarray 447
      // 0f1: dup_x2
      // 0f2: dup_x2
      // 0f3: pop
      // 0f4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f7: bipush 3
      // 0f8: swap
      // 0f9: aastore
      // 0fa: dup_x1
      // 0fb: swap
      // 0fc: bipush 2
      // 0fd: swap
      // 0fe: aastore
      // 0ff: dup_x1
      // 100: swap
      // 101: bipush 1
      // 102: swap
      // 103: aastore
      // 104: dup_x1
      // 105: swap
      // 106: bipush 0
      // 107: swap
      // 108: aastore
      // 109: ldc2_w -3923554054689501835
      // 10c: lload 2
      // 10d: invokedynamic j (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 112: goto 11f
      // 115: ldc2_w -3195619165816773578
      // 118: lload 2
      // 119: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: athrow
      // 11f: ireturn
      // 120: aload 0
      // 121: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 124: aload 4
      // 126: aload 23
      // 128: lload 16
      // 12a: aload 5
      // 12c: invokevirtual com/zelix/_6.g (Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)Lcom/zelix/_v;
      // 12f: astore 22
      // 131: aload 22
      // 133: lload 6
      // 135: invokevirtual com/zelix/_v.t (J)Z
      // 138: aload 20
      // 13a: ifnonnull 17c
      // 13d: ifeq 16a
      // 140: goto 14d
      // 143: ldc2_w -3195619165816773578
      // 146: lload 2
      // 147: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: aload 4
      // 14f: sipush 10044
      // 152: ldc2_w 227410413165885130
      // 155: lload 2
      // 156: lxor
      // 157: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15f: ireturn
      // 160: ldc2_w -3195619165816773578
      // 163: lload 2
      // 164: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 169: athrow
      // 16a: aload 4
      // 16c: sipush 5548
      // 16f: ldc2_w 5126689374350738520
      // 172: lload 2
      // 173: lxor
      // 174: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 179: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17c: ireturn
      // 17d: aload 4
      // 17f: bipush 0
      // 180: invokevirtual java/lang/String.charAt (I)C
      // 183: aload 20
      // 185: ifnonnull 1a6
      // 188: sipush 5078
      // 18b: ldc2_w 7955088130662617405
      // 18e: lload 2
      // 18f: lxor
      // 190: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 195: goto 1a2
      // 198: ldc2_w -3195619165816773578
      // 19b: lload 2
      // 19c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: if_icmpne 1a7
      // 1a5: bipush 0
      // 1a6: ireturn
      // 1a7: aload 0
      // 1a8: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 1ab: aload 1
      // 1ac: aload 23
      // 1ae: lload 16
      // 1b0: aload 5
      // 1b2: invokevirtual com/zelix/_6.g (Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)Lcom/zelix/_v;
      // 1b5: astore 21
      // 1b7: aload 0
      // 1b8: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 1bb: aload 4
      // 1bd: aload 23
      // 1bf: lload 16
      // 1c1: aload 5
      // 1c3: invokevirtual com/zelix/_6.g (Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)Lcom/zelix/_v;
      // 1c6: astore 22
      // 1c8: aload 21
      // 1ca: lload 6
      // 1cc: invokevirtual com/zelix/_v.t (J)Z
      // 1cf: aload 20
      // 1d1: lload 2
      // 1d2: lconst_0
      // 1d3: lcmp
      // 1d4: ifle 260
      // 1d7: ifnonnull 25e
      // 1da: ifeq 257
      // 1dd: goto 1ea
      // 1e0: ldc2_w -3195619165816773578
      // 1e3: lload 2
      // 1e4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e9: athrow
      // 1ea: aload 22
      // 1ec: lload 6
      // 1ee: invokevirtual com/zelix/_v.t (J)Z
      // 1f1: aload 20
      // 1f3: ifnonnull 256
      // 1f6: goto 203
      // 1f9: ldc2_w -3195619165816773578
      // 1fc: lload 2
      // 1fd: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 202: athrow
      // 203: ifeq 244
      // 206: goto 213
      // 209: ldc2_w -3195619165816773578
      // 20c: lload 2
      // 20d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 212: athrow
      // 213: aload 0
      // 214: aload 1
      // 215: lload 14
      // 217: aload 4
      // 219: bipush 3
      // 21a: anewarray 447
      // 21d: dup_x1
      // 21e: swap
      // 21f: bipush 2
      // 220: swap
      // 221: aastore
      // 222: dup_x2
      // 223: dup_x2
      // 224: pop
      // 225: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 228: bipush 1
      // 229: swap
      // 22a: aastore
      // 22b: dup_x1
      // 22c: swap
      // 22d: bipush 0
      // 22e: swap
      // 22f: aastore
      // 230: ldc2_w -3109165011746028258
      // 233: lload 2
      // 234: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: ireturn
      // 23a: ldc2_w -3195619165816773578
      // 23d: lload 2
      // 23e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 243: athrow
      // 244: aload 4
      // 246: sipush 15216
      // 249: ldc2_w 345958238560496261
      // 24c: lload 2
      // 24d: lxor
      // 24e: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 253: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 256: ireturn
      // 257: aload 22
      // 259: lload 6
      // 25b: invokevirtual com/zelix/_v.t (J)Z
      // 25e: aload 20
      // 260: ifnonnull 334
      // 263: ifeq 32b
      // 266: goto 273
      // 269: ldc2_w -3195619165816773578
      // 26c: lload 2
      // 26d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: athrow
      // 273: ldc2_w -3247794786341950701
      // 276: lload 2
      // 277: invokedynamic o (JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27c: aload 20
      // 27e: ifnonnull 32a
      // 281: goto 28e
      // 284: ldc2_w -3195619165816773578
      // 287: lload 2
      // 288: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28d: athrow
      // 28e: ifeq 304
      // 291: goto 29e
      // 294: ldc2_w -3195619165816773578
      // 297: lload 2
      // 298: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29d: athrow
      // 29e: aload 0
      // 29f: aload 1
      // 2a0: lload 14
      // 2a2: aload 4
      // 2a4: bipush 3
      // 2a5: anewarray 447
      // 2a8: dup_x1
      // 2a9: swap
      // 2aa: bipush 2
      // 2ab: swap
      // 2ac: aastore
      // 2ad: dup_x2
      // 2ae: dup_x2
      // 2af: pop
      // 2b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b3: bipush 1
      // 2b4: swap
      // 2b5: aastore
      // 2b6: dup_x1
      // 2b7: swap
      // 2b8: bipush 0
      // 2b9: swap
      // 2ba: aastore
      // 2bb: ldc2_w -3109165011746028258
      // 2be: lload 2
      // 2bf: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c4: aload 20
      // 2c6: ifnonnull 303
      // 2c9: goto 2d6
      // 2cc: ldc2_w -3195619165816773578
      // 2cf: lload 2
      // 2d0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: athrow
      // 2d6: ifne 302
      // 2d9: goto 2e6
      // 2dc: ldc2_w -3195619165816773578
      // 2df: lload 2
      // 2e0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: aload 1
      // 2e7: sipush 15216
      // 2ea: ldc2_w 345958238560496261
      // 2ed: lload 2
      // 2ee: lxor
      // 2ef: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f7: ireturn
      // 2f8: ldc2_w -3195619165816773578
      // 2fb: lload 2
      // 2fc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 301: athrow
      // 302: bipush 1
      // 303: ireturn
      // 304: aload 0
      // 305: aload 1
      // 306: lload 14
      // 308: aload 4
      // 30a: bipush 3
      // 30b: anewarray 447
      // 30e: dup_x1
      // 30f: swap
      // 310: bipush 2
      // 311: swap
      // 312: aastore
      // 313: dup_x2
      // 314: dup_x2
      // 315: pop
      // 316: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 319: bipush 1
      // 31a: swap
      // 31b: aastore
      // 31c: dup_x1
      // 31d: swap
      // 31e: bipush 0
      // 31f: swap
      // 320: aastore
      // 321: ldc2_w -3109165011746028258
      // 324: lload 2
      // 325: invokedynamic t (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: ireturn
      // 32b: aload 0
      // 32c: aload 1
      // 32d: aload 4
      // 32f: lload 8
      // 331: invokevirtual com/zelix/loj.d (Ljava/lang/String;Ljava/lang/String;J)Z
      // 334: ireturn
   }

   public loj(ai var1, _6 var2, long var3) {
      var3 = a ^ var3;
      long var5 = var3 ^ 94385901167918L;
      long var10001 = var3 ^ 55507959388997L;
      int var7 = (int)((var3 ^ 55507959388997L) >>> 32);
      int var8 = (int)((var3 ^ 55507959388997L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super();
      this.n = new ol(var7, (short)var8, (short)var9);
      this.w = m44.a<"k">(new Object[]{var5}, -9130256372042111576L, var3);
      this.V = var1;
      this.v = var2;
   }

   public void S(Object[] var1) {
      long var2 = (Long)var1[0];
      var2 = a ^ var2;
      long var4 = var2 ^ 26198736727910L;
      m44.a<"u">(m44.a<"t">(this, 1317766446282474105L, var2), new Object[]{var4}, 667694514190926034L, var2);
   }

   boolean d(String param1, String param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic com/zelix/loj.a J
      // 03: lload 3
      // 04: lxor
      // 05: lstore 3
      // 06: lload 3
      // 07: dup2
      // 08: ldc2_w 84595729227983
      // 0b: lxor
      // 0c: lstore 5
      // 0e: pop2
      // 0f: ldc2_w 7012265154321618304
      // 12: lload 3
      // 13: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18: astore 7
      // 1a: aload 1
      // 1b: aload 2
      // 1c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f: aload 7
      // 21: ifnonnull 4d
      // 24: ifeq 40
      // 27: goto 34
      // 2a: ldc2_w 8694073887454269239
      // 2d: lload 3
      // 2e: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 33: athrow
      // 34: bipush 1
      // 35: ireturn
      // 36: ldc2_w 8694073887454269239
      // 39: lload 3
      // 3a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f: athrow
      // 40: aload 0
      // 41: getfield com/zelix/loj.V Lcom/zelix/ai;
      // 44: lload 5
      // 46: aload 1
      // 47: aload 2
      // 48: invokeinterface com/zelix/ai.O (JLjava/lang/String;Ljava/lang/String;)Z 5
      // 4d: ireturn
   }

   private String H(Object[] param1) {
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
      // 015: checkcast com/zelix/_v
      // 018: astore 5
      // 01a: dup
      // 01b: bipush 3
      // 01c: aaload
      // 01d: checkcast java/lang/String
      // 020: astore 7
      // 022: dup
      // 023: bipush 4
      // 024: aaload
      // 025: checkcast com/zelix/_v
      // 028: astore 6
      // 02a: pop
      // 02b: getstatic com/zelix/loj.a J
      // 02e: lload 3
      // 02f: lxor
      // 030: lstore 3
      // 031: lload 3
      // 032: dup2
      // 033: ldc2_w 51037489628673
      // 036: lxor
      // 037: lstore 8
      // 039: dup2
      // 03a: ldc2_w 18935480261627
      // 03d: lxor
      // 03e: lstore 10
      // 040: dup2
      // 041: ldc2_w 66338967972649
      // 044: lxor
      // 045: lstore 12
      // 047: dup2
      // 048: ldc2_w 135477082235052
      // 04b: lxor
      // 04c: lstore 14
      // 04e: dup2
      // 04f: ldc2_w 133772648553982
      // 052: lxor
      // 053: lstore 16
      // 055: dup2
      // 056: ldc2_w 62232008104004
      // 059: lxor
      // 05a: lstore 18
      // 05c: pop2
      // 05d: ldc2_w 6451608685344828760
      // 060: lload 3
      // 061: invokedynamic j (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 066: aload 0
      // 067: lload 12
      // 069: invokevirtual com/zelix/loj.Y (J)Ljava/lang/Integer;
      // 06c: astore 21
      // 06e: aconst_null
      // 06f: astore 22
      // 071: astore 20
      // 073: aload 5
      // 075: aload 0
      // 076: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 079: aload 21
      // 07b: lload 14
      // 07d: bipush 3
      // 07e: anewarray 447
      // 081: dup_x2
      // 082: dup_x2
      // 083: pop
      // 084: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 087: bipush 2
      // 088: swap
      // 089: aastore
      // 08a: dup_x1
      // 08b: swap
      // 08c: bipush 1
      // 08d: swap
      // 08e: aastore
      // 08f: dup_x1
      // 090: swap
      // 091: bipush 0
      // 092: swap
      // 093: aastore
      // 094: ldc2_w 5054440910536596108
      // 097: lload 3
      // 098: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09d: astore 23
      // 09f: aload 6
      // 0a1: aload 0
      // 0a2: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 0a5: aload 21
      // 0a7: lload 14
      // 0a9: bipush 3
      // 0aa: anewarray 447
      // 0ad: dup_x2
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0b3: bipush 2
      // 0b4: swap
      // 0b5: aastore
      // 0b6: dup_x1
      // 0b7: swap
      // 0b8: bipush 1
      // 0b9: swap
      // 0ba: aastore
      // 0bb: dup_x1
      // 0bc: swap
      // 0bd: bipush 0
      // 0be: swap
      // 0bf: aastore
      // 0c0: ldc2_w 5054440910536596108
      // 0c3: lload 3
      // 0c4: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Lcom/zelix/gv; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: astore 24
      // 0cb: aload 23
      // 0cd: ldc2_w 6890093742789838577
      // 0d0: lload 3
      // 0d1: invokedynamic u (Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d6: istore 25
      // 0d8: aload 5
      // 0da: lload 8
      // 0dc: invokevirtual com/zelix/_v.t (J)Z
      // 0df: aload 20
      // 0e1: ifnonnull 10d
      // 0e4: ifeq 130
      // 0e7: goto 0f4
      // 0ea: ldc2_w 4647622218724620271
      // 0ed: lload 3
      // 0ee: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f3: athrow
      // 0f4: aload 24
      // 0f6: aload 2
      // 0f7: ldc2_w 6843866429126430661
      // 0fa: lload 3
      // 0fb: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 100: goto 10d
      // 103: ldc2_w 4647622218724620271
      // 106: lload 3
      // 107: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10c: athrow
      // 10d: ifeq 130
      // 110: lload 10
      // 112: aload 2
      // 113: bipush 2
      // 114: anewarray 447
      // 117: dup_x1
      // 118: swap
      // 119: bipush 1
      // 11a: swap
      // 11b: aastore
      // 11c: dup_x2
      // 11d: dup_x2
      // 11e: pop
      // 11f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 122: bipush 0
      // 123: swap
      // 124: aastore
      // 125: ldc2_w 5132280996940379638
      // 128: lload 3
      // 129: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: astore 22
      // 130: aload 22
      // 132: aload 20
      // 134: lload 3
      // 135: lconst_0
      // 136: lcmp
      // 137: iflt 1b8
      // 13a: ifnonnull 1b6
      // 13d: ifnonnull 1b4
      // 140: goto 14d
      // 143: ldc2_w 4647622218724620271
      // 146: lload 3
      // 147: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14c: athrow
      // 14d: aload 6
      // 14f: lload 8
      // 151: invokevirtual com/zelix/_v.t (J)Z
      // 154: aload 20
      // 156: ifnonnull 190
      // 159: goto 166
      // 15c: ldc2_w 4647622218724620271
      // 15f: lload 3
      // 160: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 165: athrow
      // 166: ifeq 1b4
      // 169: goto 176
      // 16c: ldc2_w 4647622218724620271
      // 16f: lload 3
      // 170: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 175: athrow
      // 176: aload 23
      // 178: aload 7
      // 17a: ldc2_w 6843866429126430661
      // 17d: lload 3
      // 17e: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 183: goto 190
      // 186: ldc2_w 4647622218724620271
      // 189: lload 3
      // 18a: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18f: athrow
      // 190: ifeq 1b4
      // 193: lload 10
      // 195: aload 7
      // 197: bipush 2
      // 198: anewarray 447
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
      // 1a9: ldc2_w 5132280996940379638
      // 1ac: lload 3
      // 1ad: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b2: astore 22
      // 1b4: aload 22
      // 1b6: aload 20
      // 1b8: ifnonnull 2c2
      // 1bb: ifnonnull 2c0
      // 1be: goto 1cb
      // 1c1: ldc2_w 4647622218724620271
      // 1c4: lload 3
      // 1c5: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ca: athrow
      // 1cb: bipush 0
      // 1cc: istore 26
      // 1ce: iload 26
      // 1d0: iload 25
      // 1d2: if_icmpge 294
      // 1d5: aload 23
      // 1d7: lload 16
      // 1d9: iload 26
      // 1db: bipush 2
      // 1dc: anewarray 447
      // 1df: dup_x1
      // 1e0: swap
      // 1e1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1e4: bipush 1
      // 1e5: swap
      // 1e6: aastore
      // 1e7: dup_x2
      // 1e8: dup_x2
      // 1e9: pop
      // 1ea: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 1ed: bipush 0
      // 1ee: swap
      // 1ef: aastore
      // 1f0: ldc2_w 6781140623215882762
      // 1f3: lload 3
      // 1f4: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f9: checkcast java/lang/String
      // 1fc: astore 27
      // 1fe: aload 20
      // 200: lload 3
      // 201: lconst_0
      // 202: lcmp
      // 203: iflt 20b
      // 206: ifnonnull 2c0
      // 209: aload 20
      // 20b: lload 3
      // 20c: lconst_0
      // 20d: lcmp
      // 20e: ifle 291
      // 211: ifnonnull 28f
      // 214: goto 221
      // 217: ldc2_w 4647622218724620271
      // 21a: lload 3
      // 21b: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: athrow
      // 221: aload 24
      // 223: lload 18
      // 225: aload 27
      // 227: bipush 2
      // 228: anewarray 447
      // 22b: dup_x1
      // 22c: swap
      // 22d: bipush 1
      // 22e: swap
      // 22f: aastore
      // 230: dup_x2
      // 231: dup_x2
      // 232: pop
      // 233: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 236: bipush 0
      // 237: swap
      // 238: aastore
      // 239: ldc2_w 4912496896060849438
      // 23c: lload 3
      // 23d: invokedynamic u (Ljava/lang/Object;Ljava/lang/Object;JJ)I bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 242: bipush -1
      // 243: if_icmpeq 27f
      // 246: goto 253
      // 249: ldc2_w 4647622218724620271
      // 24c: lload 3
      // 24d: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 252: athrow
      // 253: lload 10
      // 255: aload 27
      // 257: bipush 2
      // 258: anewarray 447
      // 25b: dup_x1
      // 25c: swap
      // 25d: bipush 1
      // 25e: swap
      // 25f: aastore
      // 260: dup_x2
      // 261: dup_x2
      // 262: pop
      // 263: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 266: bipush 0
      // 267: swap
      // 268: aastore
      // 269: ldc2_w 5132280996940379638
      // 26c: lload 3
      // 26d: invokedynamic j (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 272: astore 22
      // 274: lload 3
      // 275: lconst_0
      // 276: lcmp
      // 277: ifle 294
      // 27a: aload 20
      // 27c: ifnull 294
      // 27f: iinc 26 1
      // 282: goto 28f
      // 285: ldc2_w 4647622218724620271
      // 288: lload 3
      // 289: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28e: athrow
      // 28f: aload 20
      // 291: ifnull 1ce
      // 294: aload 22
      // 296: lload 3
      // 297: lconst_0
      // 298: lcmp
      // 299: iflt 1fc
      // 29c: aload 20
      // 29e: ifnonnull 2c2
      // 2a1: ifnonnull 2c0
      // 2a4: goto 2b1
      // 2a7: ldc2_w 4647622218724620271
      // 2aa: lload 3
      // 2ab: invokedynamic j (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b0: athrow
      // 2b1: sipush 23772
      // 2b4: ldc2_w 5241090697928662774
      // 2b7: lload 3
      // 2b8: lxor
      // 2b9: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2be: astore 22
      // 2c0: aload 22
      // 2c2: areturn
   }

   private boolean L(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 4
      // 011: dup
      // 012: bipush 2
      // 013: aaload
      // 014: checkcast java/lang/String
      // 017: astore 6
      // 019: dup
      // 01a: bipush 3
      // 01b: aaload
      // 01c: checkcast java/lang/Long
      // 01f: invokevirtual java/lang/Long.longValue ()J
      // 022: lstore 2
      // 023: pop
      // 024: getstatic com/zelix/loj.a J
      // 027: lload 2
      // 028: lxor
      // 029: lstore 2
      // 02a: lload 2
      // 02b: dup2
      // 02c: ldc2_w 110782695434454
      // 02f: lxor
      // 030: lstore 7
      // 032: pop2
      // 033: ldc2_w 2247825727385955297
      // 036: lload 2
      // 037: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03c: aload 5
      // 03e: ldc "["
      // 040: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 043: bipush 1
      // 044: iadd
      // 045: istore 10
      // 047: astore 9
      // 049: aload 4
      // 04b: ldc "["
      // 04d: invokevirtual java/lang/String.lastIndexOf (Ljava/lang/String;)I
      // 050: bipush 1
      // 051: iadd
      // 052: istore 11
      // 054: aload 5
      // 056: iload 10
      // 058: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 05b: astore 12
      // 05d: aload 4
      // 05f: iload 11
      // 061: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 064: astore 13
      // 066: iload 10
      // 068: iload 11
      // 06a: aload 9
      // 06c: ifnonnull 08f
      // 06f: if_icmpge 08b
      // 072: goto 07f
      // 075: ldc2_w 488356561422676310
      // 078: lload 2
      // 079: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07e: athrow
      // 07f: bipush 0
      // 080: ireturn
      // 081: ldc2_w 488356561422676310
      // 084: lload 2
      // 085: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08a: athrow
      // 08b: iload 10
      // 08d: iload 11
      // 08f: aload 9
      // 091: lload 2
      // 092: lconst_0
      // 093: lcmp
      // 094: iflt 0cf
      // 097: ifnonnull 0cd
      // 09a: if_icmple 0c7
      // 09d: goto 0aa
      // 0a0: ldc2_w 488356561422676310
      // 0a3: lload 2
      // 0a4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a9: athrow
      // 0aa: aload 13
      // 0ac: sipush 23772
      // 0af: ldc2_w 5241150122594342991
      // 0b2: lload 2
      // 0b3: lxor
      // 0b4: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0bc: ireturn
      // 0bd: ldc2_w 488356561422676310
      // 0c0: lload 2
      // 0c1: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c6: athrow
      // 0c7: aload 12
      // 0c9: invokevirtual java/lang/String.length ()I
      // 0cc: bipush 1
      // 0cd: aload 9
      // 0cf: ifnonnull 13a
      // 0d2: if_icmpne 122
      // 0d5: goto 0e2
      // 0d8: ldc2_w 488356561422676310
      // 0db: lload 2
      // 0dc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e1: athrow
      // 0e2: aload 13
      // 0e4: invokevirtual java/lang/String.length ()I
      // 0e7: bipush 1
      // 0e8: lload 2
      // 0e9: lconst_0
      // 0ea: lcmp
      // 0eb: ifle 13a
      // 0ee: aload 9
      // 0f0: ifnonnull 13a
      // 0f3: goto 100
      // 0f6: ldc2_w 488356561422676310
      // 0f9: lload 2
      // 0fa: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: athrow
      // 100: if_icmpne 122
      // 103: goto 110
      // 106: ldc2_w 488356561422676310
      // 109: lload 2
      // 10a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10f: athrow
      // 110: aload 12
      // 112: aload 13
      // 114: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 117: ireturn
      // 118: ldc2_w 488356561422676310
      // 11b: lload 2
      // 11c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 121: athrow
      // 122: aload 12
      // 124: invokevirtual java/lang/String.length ()I
      // 127: aload 9
      // 129: ifnonnull 173
      // 12c: bipush 1
      // 12d: goto 13a
      // 130: ldc2_w 488356561422676310
      // 133: lload 2
      // 134: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 139: athrow
      // 13a: if_icmpeq 165
      // 13d: aload 13
      // 13f: invokevirtual java/lang/String.length ()I
      // 142: aload 9
      // 144: ifnonnull 180
      // 147: goto 154
      // 14a: ldc2_w 488356561422676310
      // 14d: lload 2
      // 14e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 153: athrow
      // 154: bipush 1
      // 155: if_icmpne 174
      // 158: goto 165
      // 15b: ldc2_w 488356561422676310
      // 15e: lload 2
      // 15f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 164: athrow
      // 165: bipush 0
      // 166: goto 173
      // 169: ldc2_w 488356561422676310
      // 16c: lload 2
      // 16d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 172: athrow
      // 173: ireturn
      // 174: aload 0
      // 175: aload 12
      // 177: lload 7
      // 179: aload 13
      // 17b: aload 6
      // 17d: invokevirtual com/zelix/loj.n (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Z
      // 180: ireturn
   }

   public String j(char param1, int param2, String param3, short param4, String param5, String param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: iload 1
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
      // 00e: iload 4
      // 010: i2l
      // 011: bipush 48
      // 013: lshl
      // 014: bipush 48
      // 016: lushr
      // 017: lor
      // 018: getstatic com/zelix/loj.a J
      // 01b: lxor
      // 01c: lstore 7
      // 01e: lload 7
      // 020: dup2
      // 021: ldc2_w 100662952796734
      // 024: lxor
      // 025: lstore 9
      // 027: dup2
      // 028: ldc2_w 100498702255898
      // 02b: lxor
      // 02c: dup2
      // 02d: bipush 48
      // 02f: lushr
      // 030: l2i
      // 031: istore 11
      // 033: dup2
      // 034: bipush 16
      // 036: lshl
      // 037: bipush 48
      // 039: lushr
      // 03a: l2i
      // 03b: istore 12
      // 03d: dup2
      // 03e: bipush 32
      // 040: lshl
      // 041: bipush 32
      // 043: lushr
      // 044: l2i
      // 045: istore 13
      // 047: pop2
      // 048: dup2
      // 049: ldc2_w 30801938288610
      // 04c: lxor
      // 04d: lstore 14
      // 04f: dup2
      // 050: ldc2_w 110907840053188
      // 053: lxor
      // 054: lstore 16
      // 056: dup2
      // 057: ldc2_w 22984097651586
      // 05a: lxor
      // 05b: lstore 18
      // 05d: dup2
      // 05e: ldc2_w 67867885413083
      // 061: lxor
      // 062: lstore 20
      // 064: dup2
      // 065: ldc2_w 56782236063719
      // 068: lxor
      // 069: lstore 22
      // 06b: dup2
      // 06c: ldc2_w 15254122994057
      // 06f: lxor
      // 070: lstore 24
      // 072: dup2
      // 073: ldc2_w 81036409392918
      // 076: lxor
      // 077: lstore 26
      // 079: dup2
      // 07a: ldc2_w 32772157364334
      // 07d: lxor
      // 07e: lstore 28
      // 080: pop2
      // 081: ldc2_w -164449501573674649
      // 084: lload 7
      // 086: invokedynamic m (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08b: aload 0
      // 08c: lload 26
      // 08e: invokevirtual com/zelix/loj.Y (J)Ljava/lang/Integer;
      // 091: astore 31
      // 093: astore 30
      // 095: aload 3
      // 096: aload 30
      // 098: ifnonnull 0d4
      // 09b: aload 5
      // 09d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a0: ifeq 0be
      // 0a3: goto 0b1
      // 0a6: ldc2_w -1999353941750410288
      // 0a9: lload 7
      // 0ab: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: athrow
      // 0b1: aload 3
      // 0b2: areturn
      // 0b3: ldc2_w -1999353941750410288
      // 0b6: lload 7
      // 0b8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: ldc2_w -527334314573141858
      // 0c2: lload 7
      // 0c4: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/ol; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c9: lload 18
      // 0cb: aload 3
      // 0cc: aload 5
      // 0ce: invokevirtual com/zelix/ol.m (JLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 0d1: checkcast java/lang/String
      // 0d4: astore 32
      // 0d6: aload 32
      // 0d8: aload 30
      // 0da: ifnonnull 0f0
      // 0dd: ifnull 0f1
      // 0e0: goto 0ee
      // 0e3: ldc2_w -1999353941750410288
      // 0e6: lload 7
      // 0e8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ed: athrow
      // 0ee: aload 32
      // 0f0: areturn
      // 0f1: aconst_null
      // 0f2: astore 33
      // 0f4: aconst_null
      // 0f5: astore 34
      // 0f7: aload 3
      // 0f8: lload 14
      // 0fa: invokestatic com/zelix/loj.A (Ljava/lang/String;J)Ljava/lang/String;
      // 0fd: astore 35
      // 0ff: aload 5
      // 101: lload 14
      // 103: invokestatic com/zelix/loj.A (Ljava/lang/String;J)Ljava/lang/String;
      // 106: astore 36
      // 108: aload 35
      // 10a: bipush 0
      // 10b: invokevirtual java/lang/String.charAt (I)C
      // 10e: sipush 5078
      // 111: ldc2_w 7955074258045855451
      // 114: lload 7
      // 116: lxor
      // 117: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11c: aload 30
      // 11e: ifnonnull 288
      // 121: if_icmpne 274
      // 124: goto 132
      // 127: ldc2_w -1999353941750410288
      // 12a: lload 7
      // 12c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 131: athrow
      // 132: iload 2
      // 133: ifle 1ad
      // 136: aload 36
      // 138: aload 30
      // 13a: ifnonnull 1ab
      // 13d: goto 14b
      // 140: ldc2_w -1999353941750410288
      // 143: lload 7
      // 145: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14a: athrow
      // 14b: bipush 0
      // 14c: invokevirtual java/lang/String.charAt (I)C
      // 14f: sipush 5078
      // 152: ldc2_w 7955074258045855451
      // 155: lload 7
      // 157: lxor
      // 158: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 15d: if_icmpne 1b2
      // 160: goto 16e
      // 163: ldc2_w -1999353941750410288
      // 166: lload 7
      // 168: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: athrow
      // 16e: aload 0
      // 16f: aload 35
      // 171: lload 28
      // 173: aload 36
      // 175: aload 6
      // 177: bipush 4
      // 178: anewarray 447
      // 17b: dup_x1
      // 17c: swap
      // 17d: bipush 3
      // 17e: swap
      // 17f: aastore
      // 180: dup_x1
      // 181: swap
      // 182: bipush 2
      // 183: swap
      // 184: aastore
      // 185: dup_x2
      // 186: dup_x2
      // 187: pop
      // 188: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 18b: bipush 1
      // 18c: swap
      // 18d: aastore
      // 18e: dup_x1
      // 18f: swap
      // 190: bipush 0
      // 191: swap
      // 192: aastore
      // 193: ldc2_w -395618689350135598
      // 196: lload 7
      // 198: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19d: goto 1ab
      // 1a0: ldc2_w -1999353941750410288
      // 1a3: lload 7
      // 1a5: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1aa: athrow
      // 1ab: astore 32
      // 1ad: aload 30
      // 1af: ifnull 651
      // 1b2: aload 0
      // 1b3: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 1b6: aload 36
      // 1b8: aload 31
      // 1ba: lload 22
      // 1bc: aload 6
      // 1be: invokevirtual com/zelix/_6.g (Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)Lcom/zelix/_v;
      // 1c1: astore 34
      // 1c3: aload 30
      // 1c5: ifnonnull 271
      // 1c8: aload 34
      // 1ca: lload 9
      // 1cc: invokevirtual com/zelix/_v.t (J)Z
      // 1cf: iload 1
      // 1d0: iflt 264
      // 1d3: ifeq 261
      // 1d6: goto 1e4
      // 1d9: ldc2_w -1999353941750410288
      // 1dc: lload 7
      // 1de: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e3: athrow
      // 1e4: iload 4
      // 1e6: iflt 25c
      // 1e9: aload 36
      // 1eb: aload 30
      // 1ed: ifnonnull 25a
      // 1f0: goto 1fe
      // 1f3: ldc2_w -1999353941750410288
      // 1f6: lload 7
      // 1f8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fd: athrow
      // 1fe: sipush 14289
      // 201: ldc2_w 4739274803274289605
      // 204: lload 7
      // 206: lxor
      // 207: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 20f: iload 1
      // 210: iflt 241
      // 213: ifeq 23e
      // 216: goto 224
      // 219: ldc2_w -1999353941750410288
      // 21c: lload 7
      // 21e: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: athrow
      // 224: sipush 253
      // 227: ldc2_w 101786675529197290
      // 22a: lload 7
      // 22c: lxor
      // 22d: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: iload 4
      // 234: ifle 24c
      // 237: astore 32
      // 239: aload 30
      // 23b: ifnull 651
      // 23e: sipush 23772
      // 241: ldc2_w 5241184870249528009
      // 244: lload 7
      // 246: lxor
      // 247: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 24c: goto 25a
      // 24f: ldc2_w -1999353941750410288
      // 252: lload 7
      // 254: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 259: athrow
      // 25a: astore 32
      // 25c: aload 30
      // 25e: ifnull 651
      // 261: sipush 23772
      // 264: ldc2_w 5241184870249528009
      // 267: lload 7
      // 269: lxor
      // 26a: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 26f: astore 32
      // 271: goto 651
      // 274: aload 36
      // 276: bipush 0
      // 277: invokevirtual java/lang/String.charAt (I)C
      // 27a: sipush 5078
      // 27d: ldc2_w 7955074258045855451
      // 280: lload 7
      // 282: lxor
      // 283: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 288: if_icmpne 34c
      // 28b: aload 0
      // 28c: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 28f: aload 35
      // 291: aload 31
      // 293: lload 22
      // 295: aload 6
      // 297: invokevirtual com/zelix/_6.g (Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)Lcom/zelix/_v;
      // 29a: astore 33
      // 29c: aload 30
      // 29e: ifnonnull 349
      // 2a1: aload 33
      // 2a3: lload 9
      // 2a5: invokevirtual com/zelix/_v.t (J)Z
      // 2a8: iload 4
      // 2aa: ifle 33c
      // 2ad: ifeq 339
      // 2b0: goto 2be
      // 2b3: ldc2_w -1999353941750410288
      // 2b6: lload 7
      // 2b8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bd: athrow
      // 2be: iload 2
      // 2bf: iflt 334
      // 2c2: aload 35
      // 2c4: aload 30
      // 2c6: ifnonnull 332
      // 2c9: goto 2d7
      // 2cc: ldc2_w -1999353941750410288
      // 2cf: lload 7
      // 2d1: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d6: athrow
      // 2d7: sipush 14289
      // 2da: ldc2_w 4739274803274289605
      // 2dd: lload 7
      // 2df: lxor
      // 2e0: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2e8: iload 1
      // 2e9: iflt 319
      // 2ec: ifeq 316
      // 2ef: goto 2fd
      // 2f2: ldc2_w -1999353941750410288
      // 2f5: lload 7
      // 2f7: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2fc: athrow
      // 2fd: sipush 7402
      // 300: ldc2_w 9210245164166560508
      // 303: lload 7
      // 305: lxor
      // 306: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30b: iload 2
      // 30c: iflt 324
      // 30f: astore 32
      // 311: aload 30
      // 313: ifnull 651
      // 316: sipush 23772
      // 319: ldc2_w 5241184870249528009
      // 31c: lload 7
      // 31e: lxor
      // 31f: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 324: goto 332
      // 327: ldc2_w -1999353941750410288
      // 32a: lload 7
      // 32c: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 331: athrow
      // 332: astore 32
      // 334: aload 30
      // 336: ifnull 651
      // 339: sipush 23772
      // 33c: ldc2_w 5241184870249528009
      // 33f: lload 7
      // 341: lxor
      // 342: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: astore 32
      // 349: goto 651
      // 34c: aload 0
      // 34d: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 350: aload 35
      // 352: aload 31
      // 354: lload 22
      // 356: aload 6
      // 358: invokevirtual com/zelix/_6.g (Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)Lcom/zelix/_v;
      // 35b: astore 33
      // 35d: aload 0
      // 35e: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 361: aload 36
      // 363: aload 31
      // 365: lload 22
      // 367: aload 6
      // 369: invokevirtual com/zelix/_6.g (Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)Lcom/zelix/_v;
      // 36c: astore 34
      // 36e: aload 30
      // 370: iload 1
      // 371: iflt 3f8
      // 374: ifnonnull 3f6
      // 377: aload 33
      // 379: lload 9
      // 37b: invokevirtual com/zelix/_v.t (J)Z
      // 37e: ifne 3be
      // 381: goto 38f
      // 384: ldc2_w -1999353941750410288
      // 387: lload 7
      // 389: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 38e: athrow
      // 38f: aload 34
      // 391: aload 30
      // 393: iload 1
      // 394: iflt 430
      // 397: ifnonnull 40f
      // 39a: goto 3a8
      // 39d: ldc2_w -1999353941750410288
      // 3a0: lload 7
      // 3a2: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: athrow
      // 3a8: lload 9
      // 3aa: invokevirtual com/zelix/_v.t (J)Z
      // 3ad: ifeq 3ff
      // 3b0: goto 3be
      // 3b3: ldc2_w -1999353941750410288
      // 3b6: lload 7
      // 3b8: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bd: athrow
      // 3be: aload 0
      // 3bf: lload 24
      // 3c1: aload 35
      // 3c3: aload 33
      // 3c5: aload 36
      // 3c7: aload 34
      // 3c9: bipush 5
      // 3ca: anewarray 447
      // 3cd: dup_x1
      // 3ce: swap
      // 3cf: bipush 4
      // 3d0: swap
      // 3d1: aastore
      // 3d2: dup_x1
      // 3d3: swap
      // 3d4: bipush 3
      // 3d5: swap
      // 3d6: aastore
      // 3d7: dup_x1
      // 3d8: swap
      // 3d9: bipush 2
      // 3da: swap
      // 3db: aastore
      // 3dc: dup_x1
      // 3dd: swap
      // 3de: bipush 1
      // 3df: swap
      // 3e0: aastore
      // 3e1: dup_x2
      // 3e2: dup_x2
      // 3e3: pop
      // 3e4: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3e7: bipush 0
      // 3e8: swap
      // 3e9: aastore
      // 3ea: ldc2_w -1936140072664976291
      // 3ed: lload 7
      // 3ef: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3f4: astore 32
      // 3f6: aload 30
      // 3f8: iload 2
      // 3f9: ifle 66c
      // 3fc: ifnull 651
      // 3ff: aload 33
      // 401: goto 40f
      // 404: ldc2_w -1999353941750410288
      // 407: lload 7
      // 409: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40e: athrow
      // 40f: aload 0
      // 410: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 413: lload 20
      // 415: dup2_x1
      // 416: pop2
      // 417: aload 31
      // 419: bipush 3
      // 41a: anewarray 447
      // 41d: dup_x1
      // 41e: swap
      // 41f: bipush 2
      // 420: swap
      // 421: aastore
      // 422: dup_x1
      // 423: swap
      // 424: bipush 1
      // 425: swap
      // 426: aastore
      // 427: dup_x2
      // 428: dup_x2
      // 429: pop
      // 42a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 42d: bipush 0
      // 42e: swap
      // 42f: aastore
      // 430: ldc2_w -545204447577619306
      // 433: lload 7
      // 435: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43a: astore 37
      // 43c: aload 34
      // 43e: aload 0
      // 43f: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 442: lload 20
      // 444: dup2_x1
      // 445: pop2
      // 446: aload 31
      // 448: bipush 3
      // 449: anewarray 447
      // 44c: dup_x1
      // 44d: swap
      // 44e: bipush 2
      // 44f: swap
      // 450: aastore
      // 451: dup_x1
      // 452: swap
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
      // 45f: ldc2_w -545204447577619306
      // 462: lload 7
      // 464: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/util/ArrayList; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 469: astore 38
      // 46b: aload 37
      // 46d: invokevirtual java/util/ArrayList.size ()I
      // 470: istore 39
      // 472: aload 38
      // 474: aload 35
      // 476: ldc2_w -1765469411538988827
      // 479: lload 7
      // 47b: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 480: aload 30
      // 482: iload 4
      // 484: ifle 4e5
      // 487: ifnonnull 4e3
      // 48a: ifeq 4c7
      // 48d: goto 49b
      // 490: ldc2_w -1999353941750410288
      // 493: lload 7
      // 495: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49a: athrow
      // 49b: lload 16
      // 49d: aload 35
      // 49f: bipush 2
      // 4a0: anewarray 447
      // 4a3: dup_x1
      // 4a4: swap
      // 4a5: bipush 1
      // 4a6: swap
      // 4a7: aastore
      // 4a8: dup_x2
      // 4a9: dup_x2
      // 4aa: pop
      // 4ab: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4ae: bipush 0
      // 4af: swap
      // 4b0: aastore
      // 4b1: ldc2_w -2087713398880611895
      // 4b4: lload 7
      // 4b6: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4bb: astore 32
      // 4bd: aload 30
      // 4bf: iload 4
      // 4c1: iflt 66c
      // 4c4: ifnull 651
      // 4c7: aload 37
      // 4c9: aload 36
      // 4cb: ldc2_w -1765469411538988827
      // 4ce: lload 7
      // 4d0: invokedynamic r (Ljava/lang/Object;Ljava/lang/Object;JJ)Z bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d5: goto 4e3
      // 4d8: ldc2_w -1999353941750410288
      // 4db: lload 7
      // 4dd: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4e2: athrow
      // 4e3: aload 30
      // 4e5: ifnonnull 533
      // 4e8: ifeq 524
      // 4eb: goto 4f9
      // 4ee: ldc2_w -1999353941750410288
      // 4f1: lload 7
      // 4f3: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4f8: athrow
      // 4f9: lload 16
      // 4fb: aload 36
      // 4fd: bipush 2
      // 4fe: anewarray 447
      // 501: dup_x1
      // 502: swap
      // 503: bipush 1
      // 504: swap
      // 505: aastore
      // 506: dup_x2
      // 507: dup_x2
      // 508: pop
      // 509: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 50c: bipush 0
      // 50d: swap
      // 50e: aastore
      // 50f: ldc2_w -2087713398880611895
      // 512: lload 7
      // 514: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 519: astore 32
      // 51b: aload 30
      // 51d: iload 2
      // 51e: ifle 66c
      // 521: ifnull 651
      // 524: bipush 0
      // 525: goto 533
      // 528: ldc2_w -1999353941750410288
      // 52b: lload 7
      // 52d: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 532: athrow
      // 533: istore 40
      // 535: iload 40
      // 537: iload 39
      // 539: if_icmpge 624
      // 53c: aload 37
      // 53e: iload 40
      // 540: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 543: checkcast java/lang/String
      // 546: astore 41
      // 548: aload 30
      // 54a: iload 2
      // 54b: iflt 621
      // 54e: ifnonnull 61f
      // 551: aload 38
      // 553: aload 30
      // 555: ifnonnull 688
      // 558: goto 566
      // 55b: ldc2_w -1999353941750410288
      // 55e: lload 7
      // 560: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 565: athrow
      // 566: aload 41
      // 568: invokevirtual java/util/ArrayList.indexOf (Ljava/lang/Object;)I
      // 56b: bipush -1
      // 56c: if_icmpeq 60e
      // 56f: goto 57d
      // 572: ldc2_w -1999353941750410288
      // 575: lload 7
      // 577: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 57c: athrow
      // 57d: lload 16
      // 57f: aload 41
      // 581: bipush 2
      // 582: anewarray 447
      // 585: dup_x1
      // 586: swap
      // 587: bipush 1
      // 588: swap
      // 589: aastore
      // 58a: dup_x2
      // 58b: dup_x2
      // 58c: pop
      // 58d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 590: bipush 0
      // 591: swap
      // 592: aastore
      // 593: ldc2_w -2087713398880611895
      // 596: lload 7
      // 598: invokedynamic m (Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 59d: astore 32
      // 59f: aload 32
      // 5a1: aload 30
      // 5a3: iload 1
      // 5a4: iflt 62d
      // 5a7: ifnonnull 62b
      // 5aa: sipush 23772
      // 5ad: ldc2_w 5241184870249528009
      // 5b0: lload 7
      // 5b2: lxor
      // 5b3: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5bb: ifeq 624
      // 5be: goto 5cc
      // 5c1: ldc2_w -1999353941750410288
      // 5c4: lload 7
      // 5c6: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5cb: athrow
      // 5cc: aload 0
      // 5cd: lload 24
      // 5cf: aload 35
      // 5d1: aload 33
      // 5d3: aload 36
      // 5d5: aload 34
      // 5d7: bipush 5
      // 5d8: anewarray 447
      // 5db: dup_x1
      // 5dc: swap
      // 5dd: bipush 4
      // 5de: swap
      // 5df: aastore
      // 5e0: dup_x1
      // 5e1: swap
      // 5e2: bipush 3
      // 5e3: swap
      // 5e4: aastore
      // 5e5: dup_x1
      // 5e6: swap
      // 5e7: bipush 2
      // 5e8: swap
      // 5e9: aastore
      // 5ea: dup_x1
      // 5eb: swap
      // 5ec: bipush 1
      // 5ed: swap
      // 5ee: aastore
      // 5ef: dup_x2
      // 5f0: dup_x2
      // 5f1: pop
      // 5f2: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5f5: bipush 0
      // 5f6: swap
      // 5f7: aastore
      // 5f8: ldc2_w -1936140072664976291
      // 5fb: lload 7
      // 5fd: invokedynamic l (Ljava/lang/Object;Ljava/lang/Object;JJ)Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 602: astore 32
      // 604: iload 4
      // 606: iflt 611
      // 609: aload 30
      // 60b: ifnull 624
      // 60e: iinc 40 1
      // 611: goto 61f
      // 614: ldc2_w -1999353941750410288
      // 617: lload 7
      // 619: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 61e: athrow
      // 61f: aload 30
      // 621: ifnull 535
      // 624: iload 4
      // 626: ifle 689
      // 629: aload 32
      // 62b: aload 30
      // 62d: ifnonnull 68b
      // 630: ifnonnull 651
      // 633: goto 641
      // 636: ldc2_w -1999353941750410288
      // 639: lload 7
      // 63b: invokedynamic m (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 640: athrow
      // 641: sipush 23772
      // 644: ldc2_w 5241184870249528009
      // 647: lload 7
      // 649: lxor
      // 64a: invokedynamic d (IJ)Ljava/lang/String; bsm=com/zelix/loj.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64f: astore 32
      // 651: aload 0
      // 652: ldc2_w -527334314573141858
      // 655: lload 7
      // 657: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/ol; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 65c: iload 11
      // 65e: i2s
      // 65f: iload 12
      // 661: i2c
      // 662: aload 3
      // 663: iload 13
      // 665: aload 5
      // 667: aload 32
      // 669: invokevirtual com/zelix/ol.h (SCLjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 66c: pop
      // 66d: aload 0
      // 66e: ldc2_w -527334314573141858
      // 671: lload 7
      // 673: invokedynamic s (Ljava/lang/Object;JJ)Lcom/zelix/ol; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 678: iload 11
      // 67a: i2s
      // 67b: iload 12
      // 67d: i2c
      // 67e: aload 5
      // 680: iload 13
      // 682: aload 3
      // 683: aload 32
      // 685: invokevirtual com/zelix/ol.h (SCLjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 688: pop
      // 689: aload 32
      // 68b: areturn
   }

   public boolean x(Object[] param1) {
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
      // 007: astore 5
      // 009: dup
      // 00a: bipush 1
      // 00b: aaload
      // 00c: checkcast java/lang/String
      // 00f: astore 2
      // 010: dup
      // 011: bipush 2
      // 012: aaload
      // 013: checkcast java/lang/Long
      // 016: invokevirtual java/lang/Long.longValue ()J
      // 019: lstore 3
      // 01a: pop
      // 01b: getstatic com/zelix/loj.a J
      // 01e: lload 3
      // 01f: lxor
      // 020: lstore 3
      // 021: lload 3
      // 022: dup2
      // 023: ldc2_w 16581565534406
      // 026: lxor
      // 027: lstore 6
      // 029: pop2
      // 02a: ldc2_w -6403685171476474895
      // 02d: lload 3
      // 02e: invokedynamic k (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: astore 8
      // 035: aload 5
      // 037: aload 2
      // 038: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 03b: aload 8
      // 03d: ifnonnull 061
      // 040: ifeq 05c
      // 043: goto 050
      // 046: ldc2_w -4695400215208539834
      // 049: lload 3
      // 04a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04f: athrow
      // 050: bipush 1
      // 051: ireturn
      // 052: ldc2_w -4695400215208539834
      // 055: lload 3
      // 056: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: athrow
      // 05c: aload 5
      // 05e: invokevirtual java/lang/String.length ()I
      // 061: bipush 1
      // 062: aload 8
      // 064: ifnonnull 0d1
      // 067: if_icmple 0b9
      // 06a: goto 077
      // 06d: ldc2_w -4695400215208539834
      // 070: lload 3
      // 071: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 076: athrow
      // 077: aload 2
      // 078: invokevirtual java/lang/String.length ()I
      // 07b: bipush 1
      // 07c: lload 3
      // 07d: lconst_0
      // 07e: lcmp
      // 07f: iflt 0d1
      // 082: aload 8
      // 084: ifnonnull 0d1
      // 087: goto 094
      // 08a: ldc2_w -4695400215208539834
      // 08d: lload 3
      // 08e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 093: athrow
      // 094: if_icmple 0b9
      // 097: goto 0a4
      // 09a: ldc2_w -4695400215208539834
      // 09d: lload 3
      // 09e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: aload 5
      // 0a7: lload 6
      // 0a9: aload 2
      // 0aa: aconst_null
      // 0ab: invokevirtual com/zelix/loj.n (Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Z
      // 0ae: ireturn
      // 0af: ldc2_w -4695400215208539834
      // 0b2: lload 3
      // 0b3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b8: athrow
      // 0b9: aload 5
      // 0bb: invokevirtual java/lang/String.length ()I
      // 0be: aload 8
      // 0c0: ifnonnull 564
      // 0c3: bipush 1
      // 0c4: goto 0d1
      // 0c7: ldc2_w -4695400215208539834
      // 0ca: lload 3
      // 0cb: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: athrow
      // 0d1: if_icmpne 563
      // 0d4: aload 2
      // 0d5: invokevirtual java/lang/String.length ()I
      // 0d8: aload 8
      // 0da: ifnonnull 564
      // 0dd: goto 0ea
      // 0e0: ldc2_w -4695400215208539834
      // 0e3: lload 3
      // 0e4: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e9: athrow
      // 0ea: bipush 1
      // 0eb: if_icmpne 563
      // 0ee: goto 0fb
      // 0f1: ldc2_w -4695400215208539834
      // 0f4: lload 3
      // 0f5: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: athrow
      // 0fb: aload 5
      // 0fd: bipush 0
      // 0fe: invokevirtual java/lang/String.charAt (I)C
      // 101: istore 9
      // 103: aload 2
      // 104: bipush 0
      // 105: invokevirtual java/lang/String.charAt (I)C
      // 108: istore 10
      // 10a: iload 9
      // 10c: aload 8
      // 10e: ifnonnull 562
      // 111: tableswitch 1104 66 90 125 413 994 1104 890 1104 1104 731 835 1104 1104 1104 1104 1104 1104 1104 1104 572 1104 1104 1049 1104 1104 1104 358
      // 184: ldc2_w -4695400215208539834
      // 187: lload 3
      // 188: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 18d: athrow
      // 18e: iload 10
      // 190: aload 8
      // 192: ifnonnull 272
      // 195: goto 1a2
      // 198: ldc2_w -4695400215208539834
      // 19b: lload 3
      // 19c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: athrow
      // 1a2: lload 3
      // 1a3: lconst_0
      // 1a4: lcmp
      // 1a5: ifle 265
      // 1a8: sipush 28587
      // 1ab: ldc2_w 2860176669821091874
      // 1ae: lload 3
      // 1af: lxor
      // 1b0: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b5: if_icmpeq 264
      // 1b8: goto 1c5
      // 1bb: ldc2_w -4695400215208539834
      // 1be: lload 3
      // 1bf: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c4: athrow
      // 1c5: iload 10
      // 1c7: aload 8
      // 1c9: ifnonnull 272
      // 1cc: goto 1d9
      // 1cf: ldc2_w -4695400215208539834
      // 1d2: lload 3
      // 1d3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d8: athrow
      // 1d9: lload 3
      // 1da: lconst_0
      // 1db: lcmp
      // 1dc: iflt 265
      // 1df: sipush 25884
      // 1e2: ldc2_w 4338629857693780614
      // 1e5: lload 3
      // 1e6: lxor
      // 1e7: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1ec: if_icmpeq 264
      // 1ef: goto 1fc
      // 1f2: ldc2_w -4695400215208539834
      // 1f5: lload 3
      // 1f6: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1fb: athrow
      // 1fc: iload 10
      // 1fe: aload 8
      // 200: ifnonnull 272
      // 203: goto 210
      // 206: ldc2_w -4695400215208539834
      // 209: lload 3
      // 20a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20f: athrow
      // 210: lload 3
      // 211: lconst_0
      // 212: lcmp
      // 213: iflt 265
      // 216: sipush 11776
      // 219: ldc2_w 7583565156964106625
      // 21c: lload 3
      // 21d: lxor
      // 21e: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: if_icmpeq 264
      // 226: goto 233
      // 229: ldc2_w -4695400215208539834
      // 22c: lload 3
      // 22d: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 232: athrow
      // 233: iload 10
      // 235: aload 8
      // 237: ifnonnull 272
      // 23a: goto 247
      // 23d: ldc2_w -4695400215208539834
      // 240: lload 3
      // 241: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 246: athrow
      // 247: sipush 14428
      // 24a: ldc2_w 646196658319529951
      // 24d: lload 3
      // 24e: lxor
      // 24f: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 254: if_icmpne 275
      // 257: goto 264
      // 25a: ldc2_w -4695400215208539834
      // 25d: lload 3
      // 25e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 263: athrow
      // 264: bipush 1
      // 265: goto 272
      // 268: ldc2_w -4695400215208539834
      // 26b: lload 3
      // 26c: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 271: athrow
      // 272: goto 276
      // 275: bipush 0
      // 276: ireturn
      // 277: iload 10
      // 279: aload 8
      // 27b: ifnonnull 2a9
      // 27e: sipush 15793
      // 281: ldc2_w 7154178980418753084
      // 284: lload 3
      // 285: lxor
      // 286: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 28b: if_icmpne 2ac
      // 28e: goto 29b
      // 291: ldc2_w -4695400215208539834
      // 294: lload 3
      // 295: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 29a: athrow
      // 29b: bipush 1
      // 29c: goto 2a9
      // 29f: ldc2_w -4695400215208539834
      // 2a2: lload 3
      // 2a3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2a8: athrow
      // 2a9: goto 2ad
      // 2ac: bipush 0
      // 2ad: ireturn
      // 2ae: iload 10
      // 2b0: aload 8
      // 2b2: ifnonnull 348
      // 2b5: sipush 14858
      // 2b8: ldc2_w 3110043365836789138
      // 2bb: lload 3
      // 2bc: lxor
      // 2bd: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2c2: if_icmpeq 33a
      // 2c5: goto 2d2
      // 2c8: ldc2_w -4695400215208539834
      // 2cb: lload 3
      // 2cc: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d1: athrow
      // 2d2: iload 10
      // 2d4: aload 8
      // 2d6: ifnonnull 348
      // 2d9: goto 2e6
      // 2dc: ldc2_w -4695400215208539834
      // 2df: lload 3
      // 2e0: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2e5: athrow
      // 2e6: lload 3
      // 2e7: lconst_0
      // 2e8: lcmp
      // 2e9: ifle 33b
      // 2ec: sipush 17550
      // 2ef: ldc2_w 3166342834859535104
      // 2f2: lload 3
      // 2f3: lxor
      // 2f4: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2f9: if_icmpeq 33a
      // 2fc: goto 309
      // 2ff: ldc2_w -4695400215208539834
      // 302: lload 3
      // 303: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 308: athrow
      // 309: iload 10
      // 30b: aload 8
      // 30d: ifnonnull 348
      // 310: goto 31d
      // 313: ldc2_w -4695400215208539834
      // 316: lload 3
      // 317: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31c: athrow
      // 31d: sipush 29469
      // 320: ldc2_w 3724741324374367381
      // 323: lload 3
      // 324: lxor
      // 325: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32a: if_icmpne 34b
      // 32d: goto 33a
      // 330: ldc2_w -4695400215208539834
      // 333: lload 3
      // 334: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 339: athrow
      // 33a: bipush 1
      // 33b: goto 348
      // 33e: ldc2_w -4695400215208539834
      // 341: lload 3
      // 342: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 347: athrow
      // 348: goto 34c
      // 34b: bipush 0
      // 34c: ireturn
      // 34d: iload 10
      // 34f: aload 8
      // 351: ifnonnull 3e7
      // 354: sipush 16155
      // 357: ldc2_w 1301298871905259671
      // 35a: lload 3
      // 35b: lxor
      // 35c: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 361: if_icmpeq 3d9
      // 364: goto 371
      // 367: ldc2_w -4695400215208539834
      // 36a: lload 3
      // 36b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 370: athrow
      // 371: iload 10
      // 373: aload 8
      // 375: ifnonnull 3e7
      // 378: goto 385
      // 37b: ldc2_w -4695400215208539834
      // 37e: lload 3
      // 37f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 384: athrow
      // 385: lload 3
      // 386: lconst_0
      // 387: lcmp
      // 388: iflt 3da
      // 38b: sipush 17550
      // 38e: ldc2_w 3166342834859535104
      // 391: lload 3
      // 392: lxor
      // 393: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 398: if_icmpeq 3d9
      // 39b: goto 3a8
      // 39e: ldc2_w -4695400215208539834
      // 3a1: lload 3
      // 3a2: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3a7: athrow
      // 3a8: iload 10
      // 3aa: aload 8
      // 3ac: ifnonnull 3e7
      // 3af: goto 3bc
      // 3b2: ldc2_w -4695400215208539834
      // 3b5: lload 3
      // 3b6: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3bb: athrow
      // 3bc: sipush 29469
      // 3bf: ldc2_w 3724741324374367381
      // 3c2: lload 3
      // 3c3: lxor
      // 3c4: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c9: if_icmpne 3ea
      // 3cc: goto 3d9
      // 3cf: ldc2_w -4695400215208539834
      // 3d2: lload 3
      // 3d3: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3d8: athrow
      // 3d9: bipush 1
      // 3da: goto 3e7
      // 3dd: ldc2_w -4695400215208539834
      // 3e0: lload 3
      // 3e1: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3e6: athrow
      // 3e7: goto 3eb
      // 3ea: bipush 0
      // 3eb: ireturn
      // 3ec: iload 10
      // 3ee: aload 8
      // 3f0: ifnonnull 44f
      // 3f3: sipush 17550
      // 3f6: ldc2_w 3166342834859535104
      // 3f9: lload 3
      // 3fa: lxor
      // 3fb: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 400: if_icmpeq 441
      // 403: goto 410
      // 406: ldc2_w -4695400215208539834
      // 409: lload 3
      // 40a: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 40f: athrow
      // 410: iload 10
      // 412: aload 8
      // 414: ifnonnull 44f
      // 417: goto 424
      // 41a: ldc2_w -4695400215208539834
      // 41d: lload 3
      // 41e: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 423: athrow
      // 424: sipush 29469
      // 427: ldc2_w 3724741324374367381
      // 42a: lload 3
      // 42b: lxor
      // 42c: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 431: if_icmpne 452
      // 434: goto 441
      // 437: ldc2_w -4695400215208539834
      // 43a: lload 3
      // 43b: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 440: athrow
      // 441: bipush 1
      // 442: goto 44f
      // 445: ldc2_w -4695400215208539834
      // 448: lload 3
      // 449: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 44e: athrow
      // 44f: goto 453
      // 452: bipush 0
      // 453: ireturn
      // 454: iload 10
      // 456: aload 8
      // 458: ifnonnull 486
      // 45b: sipush 29469
      // 45e: ldc2_w 3724741324374367381
      // 461: lload 3
      // 462: lxor
      // 463: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 468: if_icmpne 489
      // 46b: goto 478
      // 46e: ldc2_w -4695400215208539834
      // 471: lload 3
      // 472: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 477: athrow
      // 478: bipush 1
      // 479: goto 486
      // 47c: ldc2_w -4695400215208539834
      // 47f: lload 3
      // 480: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 485: athrow
      // 486: goto 48a
      // 489: bipush 0
      // 48a: ireturn
      // 48b: iload 10
      // 48d: aload 8
      // 48f: ifnonnull 4ee
      // 492: sipush 12713
      // 495: ldc2_w 7762581738946207277
      // 498: lload 3
      // 499: lxor
      // 49a: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49f: if_icmpeq 4e0
      // 4a2: goto 4af
      // 4a5: ldc2_w -4695400215208539834
      // 4a8: lload 3
      // 4a9: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ae: athrow
      // 4af: iload 10
      // 4b1: aload 8
      // 4b3: ifnonnull 4ee
      // 4b6: goto 4c3
      // 4b9: ldc2_w -4695400215208539834
      // 4bc: lload 3
      // 4bd: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c2: athrow
      // 4c3: sipush 17435
      // 4c6: ldc2_w 7375640825988836226
      // 4c9: lload 3
      // 4ca: lxor
      // 4cb: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4d0: if_icmpne 4f1
      // 4d3: goto 4e0
      // 4d6: ldc2_w -4695400215208539834
      // 4d9: lload 3
      // 4da: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4df: athrow
      // 4e0: bipush 1
      // 4e1: goto 4ee
      // 4e4: ldc2_w -4695400215208539834
      // 4e7: lload 3
      // 4e8: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ed: athrow
      // 4ee: goto 4f2
      // 4f1: bipush 0
      // 4f2: ireturn
      // 4f3: iload 10
      // 4f5: aload 8
      // 4f7: ifnonnull 525
      // 4fa: sipush 6636
      // 4fd: ldc2_w 2513907279173039723
      // 500: lload 3
      // 501: lxor
      // 502: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 507: if_icmpne 528
      // 50a: goto 517
      // 50d: ldc2_w -4695400215208539834
      // 510: lload 3
      // 511: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 516: athrow
      // 517: bipush 1
      // 518: goto 525
      // 51b: ldc2_w -4695400215208539834
      // 51e: lload 3
      // 51f: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 524: athrow
      // 525: goto 529
      // 528: bipush 0
      // 529: ireturn
      // 52a: iload 10
      // 52c: aload 8
      // 52e: ifnonnull 55c
      // 531: sipush 19193
      // 534: ldc2_w 918937485487465842
      // 537: lload 3
      // 538: lxor
      // 539: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53e: if_icmpne 55f
      // 541: goto 54e
      // 544: ldc2_w -4695400215208539834
      // 547: lload 3
      // 548: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 54d: athrow
      // 54e: bipush 1
      // 54f: goto 55c
      // 552: ldc2_w -4695400215208539834
      // 555: lload 3
      // 556: invokedynamic k (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55b: athrow
      // 55c: goto 560
      // 55f: bipush 0
      // 560: ireturn
      // 561: bipush 0
      // 562: ireturn
      // 563: bipush 0
      // 564: ireturn
   }

   boolean m(Object[] param1) {
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
      // 04: checkcast com/zelix/v7
      // 07: astore 2
      // 08: dup
      // 09: bipush 1
      // 0a: aaload
      // 0b: checkcast java/lang/String
      // 0e: astore 3
      // 0f: dup
      // 10: bipush 2
      // 11: aaload
      // 12: checkcast java/lang/Long
      // 15: invokevirtual java/lang/Long.longValue ()J
      // 18: lstore 4
      // 1a: pop
      // 1b: getstatic com/zelix/loj.a J
      // 1e: lload 4
      // 20: lxor
      // 21: lstore 4
      // 23: lload 4
      // 25: dup2
      // 26: ldc2_w 65763260767603
      // 29: lxor
      // 2a: lstore 6
      // 2c: dup2
      // 2d: ldc2_w 136620675182767
      // 30: lxor
      // 31: lstore 8
      // 33: dup2
      // 34: ldc2_w 92249409300650
      // 37: lxor
      // 38: lstore 10
      // 3a: dup2
      // 3b: ldc2_w 46115502321755
      // 3e: lxor
      // 3f: lstore 12
      // 41: pop2
      // 42: ldc2_w -4397023628480137686
      // 45: lload 4
      // 47: invokedynamic h (JJ)[Ljava/lang/String; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4c: aload 2
      // 4d: invokevirtual com/zelix/v7.h ()Ljava/lang/String;
      // 50: lload 8
      // 52: invokestatic com/zelix/loj.A (Ljava/lang/String;J)Ljava/lang/String;
      // 55: astore 15
      // 57: astore 14
      // 59: aload 15
      // 5b: bipush 0
      // 5c: invokevirtual java/lang/String.charAt (I)C
      // 5f: aload 14
      // 61: ifnonnull 92
      // 64: sipush 5078
      // 67: ldc2_w 7955179524342831510
      // 6a: lload 4
      // 6c: lxor
      // 6d: invokedynamic s (IJ)I bsm=com/zelix/loj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 72: if_icmpne 93
      // 75: goto 83
      // 78: ldc2_w -2662262433607340899
      // 7b: lload 4
      // 7d: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 82: athrow
      // 83: bipush 0
      // 84: goto 92
      // 87: ldc2_w -2662262433607340899
      // 8a: lload 4
      // 8c: invokedynamic h (Ljava/lang/Object;JJ)Lcom/zelix/n9; bsm=com/zelix/m44.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 91: athrow
      // 92: ireturn
      // 93: aload 0
      // 94: getfield com/zelix/loj.v Lcom/zelix/_6;
      // 97: aload 15
      // 99: aload 0
      // 9a: lload 12
      // 9c: invokevirtual com/zelix/loj.Y (J)Ljava/lang/Integer;
      // 9f: lload 10
      // a1: aload 3
      // a2: invokevirtual com/zelix/_6.g (Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/String;)Lcom/zelix/_v;
      // a5: astore 16
      // a7: aload 16
      // a9: lload 6
      // ab: invokevirtual com/zelix/_v.t (J)Z
      // ae: ireturn
   }

   static {
      long var11 = a ^ 36617752346625L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "ããñüã:ÂWc©MC»ô´è\u00003=¹·%\u007f2Á¸-Ú'#t\u001e&\u0018¹iê\u0089×ý(\u0016´Uî\u009cA¬'\u001e¦YýÁ\u009fh®l{A´g6^!å\\«\u0014t\u0012ÀdJDK?'¥¢E(3ÚU \u0001yHÍ\u0085¥\u0003\u0013\u0013\u000f[Õ\u0098çÈ#\u0005ÔõF0`\u008e3,\u0084ØnîýjÛ´-ô\u009f(6þ~QØ\u000f5¸lx'\u0081\u001f\u001c\u008eà\u0010C\u0089\u0002°4yª\u009bar\u0094I-gÔ%Ë\u008cÿÞ\n\u0097é(\u008d^O\u000b\"Ðe¾\u0001qM\u0086ô¾\u0088\r{\u0097½±óéD5\u0014\u0005«\u0012\u009fÈ\u0019\bU¿Ìû£Ë\u008d¹(ß2\u0085Õ`Õ|6¬&!ÈÌñ\u0084\u0099a\u0092MH¤\u008a\u0095X\b¬è·Îæ\u008fâåoë\u0016>-A²";
      int var19 = "ããñüã:ÂWc©MC»ô´è\u00003=¹·%\u007f2Á¸-Ú'#t\u001e&\u0018¹iê\u0089×ý(\u0016´Uî\u009cA¬'\u001e¦YýÁ\u009fh®l{A´g6^!å\\«\u0014t\u0012ÀdJDK?'¥¢E(3ÚU \u0001yHÍ\u0085¥\u0003\u0013\u0013\u000f[Õ\u0098çÈ#\u0005ÔõF0`\u008e3,\u0084ØnîýjÛ´-ô\u009f(6þ~QØ\u000f5¸lx'\u0081\u001f\u001c\u008eà\u0010C\u0089\u0002°4yª\u009bar\u0094I-gÔ%Ë\u008cÿÞ\n\u0097é(\u008d^O\u000b\"Ðe¾\u0001qM\u0086ô¾\u0088\r{\u0097½±óéD5\u0014\u0005«\u0012\u009fÈ\u0019\bU¿Ìû£Ë\u008d¹(ß2\u0085Õ`Õ|6¬&!ÈÌñ\u0084\u0099a\u0092MH¤\u008a\u0095X\b¬è·Îæ\u008fâåoë\u0016>-A²"
         .length();
      char var16 = '(';
      int var24 = -1;

      label54:
      while (true) {
         String var25 = var17.substring(++var24, var24 + var16);
         int var10001 = -1;

         while (true) {
            byte[] var21 = var13.doFinal(var25.getBytes("ISO-8859-1"));
            String var36 = a(var21).intern();
            switch (var10001) {
               case 0:
                  var20[var18++] = var36;
                  if ((var24 += var16) >= var19) {
                     b = var20;
                     c = new String[8];
                     g = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[20];
                     int var3 = 0;
                     String var4 = "\u0012âîîî\u008aaÂ¼ã\\ë\tTÑÀ\u0084åÑCy\u0085\u001b\u0084³î\n\u008aCï)$\u00970\u000b\"Ã¾\bä\u00923\u001cLÇS\u0080ûPn\u0090å¥S\u008b¨[ÚÛøù\u0099Dû\u001d\u0087\u0010\u007f'Ó\u0018¬Ä\u0093*¸\u0091\r(1ës\u0085æ×R\u009a#ñ\u0086\nìUÐ\u00166\u0089¡Ð\u0011\u0098§&7\b½N6\u0083î\n^)®Ï«\u0085\u0010\u001f`@;¢]<\u0019\u001e\u001d:j¯³ýMèl\t\u0083ùC´¯ôª";
                     int var5 = "\u0012âîîî\u008aaÂ¼ã\\ë\tTÑÀ\u0084åÑCy\u0085\u001b\u0084³î\n\u008aCï)$\u00970\u000b\"Ã¾\bä\u00923\u001cLÇS\u0080ûPn\u0090å¥S\u008b¨[ÚÛøù\u0099Dû\u001d\u0087\u0010\u007f'Ó\u0018¬Ä\u0093*¸\u0091\r(1ës\u0085æ×R\u009a#ñ\u0086\nìUÐ\u00166\u0089¡Ð\u0011\u0098§&7\b½N6\u0083î\n^)®Ï«\u0085\u0010\u001f`@;¢]<\u0019\u001e\u001d:j¯³ýMèl\t\u0083ùC´¯ôª"
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
                                    f = new Integer[20];
                                    return;
                                 }
                                 break;
                              default:
                                 var28[var10001] = var45;
                                 if (var2 < var5) {
                                    continue label36;
                                 }

                                 var4 = "\u009bJGpuÐ0\u008fõPþ\u0001\u0088\u0099&\u0080";
                                 var5 = "\u009bJGpuÐ0\u008fõPþ\u0001\u0088\u0099&\u0080".length();
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

                  var17 = "¡\u0005§ÁÎ[h1c\u0089'ðYÛ\u0094 {¢\u009f\u001d[Î\u0083àÔ©\u0098êu·\u0095È_,M\u0010\u001bi\u001dÚ(\u001dw\u0015©¾\u0005^\u001cìíÑ¿\u0018#âF§\u0084\u009cÛ\u009b\"ïû\u00ad½ô1\u0088>o\u009c\u0015É?\u0000*zÃÊ";
                  var19 = "¡\u0005§ÁÎ[h1c\u0089'ðYÛ\u0094 {¢\u009f\u001d[Î\u0083àÔ©\u0098êu·\u0095È_,M\u0010\u001bi\u001dÚ(\u001dw\u0015©¾\u0005^\u001cìíÑ¿\u0018#âF§\u0084\u009cÛ\u009b\"ïû\u00ad½ô1\u0088>o\u009c\u0015É?\u0000*zÃÊ"
                     .length();
                  var16 = '(';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18649;
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
            throw new RuntimeException("com/zelix/loj", var10);
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
         throw new RuntimeException("com/zelix/loj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7124;
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
            throw new RuntimeException("com/zelix/loj", var14);
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
         throw new RuntimeException("com/zelix/loj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
